#!/usr/bin/python
import sys, os, subprocess,fnmatch, shutil, csv,re, datetime


def travFolder(dir,dataset,checkdataset):
   listdirs = os.listdir(dir)
   for f in listdirs:
       pattern = 'patch*.patch'
       if os.path.isfile(os.path.join(dir, f)):
           if fnmatch.fnmatch(f, pattern):
                #first temporary checkout project
                checkout_project(f,'tmp_projects')
                sanity_check(f,dataset,checkdataset)
                remove_project('tmp_projects')        
       else:
           if 'tmp.patch' not in f:
                travFolder(dir+'/'+f,dataset,checkdataset)

def checkout_project(file,project):
    filename=os.path.splitext(file)[0]
    arraynames=filename.split("-")
    projectId=arraynames[1]
    bugId=arraynames[2]
    lcProjectId=projectId.decode('utf-8').lower()
    if not os.path.exists(project):
         os.system('mkdir '+project)
         os.system('mkdir '+project+'/lib')
         os.system('cp ./lib/evosuite-standalone-runtime-1.0.5.jar  '+project+'/lib/')
    if not os.path.exists(project+'/'+projectId):
        os.system('mkdir '+project+'/'+projectId)
    os.system( d4jpath+'/defects4j checkout -p '+projectId+' -v '+bugId+'b -w ./'+project+'/'+projectId+'/'+lcProjectId+'_'+bugId+'_buggy')  


def remove_project(project):
    if  os.path.exists(project):
        os.system('rm -rf '+project)

def sanity_check(file,dataset,checkdataset):
    filename=os.path.splitext(file)[0]
    #split the patch name
    arraynames=filename.split("-")
    projectId=arraynames[1]
    bugId=arraynames[2]
    toolId=arraynames[3]
    currentpath=os.path.dirname(os.path.realpath(__file__))
    #lower case of project id
    lcProjectId=projectId.decode('utf-8').lower()
    #get patch path
    patchpath=dataset+'/'+toolId+'/'+projectId+'/'+file 
    result=apply_patch(patchpath,dataset,toolId,projectId,bugId,lcProjectId,'tmp_projects')
    #record the consistency result in csv file
    if checkdataset == 'consistency':
        with open('./statistics/consistency_check.csv', 'a') as csvfile:
            filewriter = csv.writer(csvfile, delimiter=',',
                            quotechar='|', quoting=csv.QUOTE_MINIMAL)
            if "FAILED" in result:
                filewriter.writerow([file,dataset,"FAILED"])
            else:
                filewriter.writerow([file,dataset,"OK"])
    if checkdataset == 'plausibility':
        program_path='./tmp_projects/'+projectId+'/'+lcProjectId+'_'+bugId+'_buggy/'
        os.chdir(program_path)
        os.system(d4jpath+'/defects4j compile')
        test_result=os.popen(d4jpath+'/defects4j test').read() 
        print  test_result
        resultlines=test_result.split('\n');
        failingTestsNo=''
        failingInfo=''
        for line in resultlines:
            if '::' not in line:
                if not line=='':
                    if ':' in line:
                        failingTestsNo=line.split(':')[1]   
            else:
                failingTestClass=line.split('::')[0]
                failingInfo=failingInfo+';'+line.split('::')[1]
        os.chdir('../../../')
        with open('./statistics/plausibility_check.csv', 'a') as csvfile:
                filewriter = csv.writer(csvfile, delimiter=',',
                                quotechar='|', quoting=csv.QUOTE_MINIMAL)                  
                filewriter.writerow([file,dataset,failingTestsNo,failingInfo])
                         

def patches_overview(dir,dataset):
    with open('./statistics/patches_overview.csv', 'a') as csvfile:
        filewriter = csv.writer(csvfile, delimiter=',',
                                quotechar='|', quoting=csv.QUOTE_MINIMAL) 
        listdirs = os.listdir(dir)
        for f in listdirs:
            #patch1-Chart-14-ACS.patch
            pattern = 'patch*.patch'
            if os.path.isfile(os.path.join(dir, f)):
                if fnmatch.fnmatch(f, pattern):              
                    filename=os.path.splitext(f)[0]
                    arraynames=filename.split("-")
                    projectId=arraynames[1] 
                    bugId=arraynames[2]
                    toolId=arraynames[3]                                                             
                    link='https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/'+dataset+'/'+toolId+'/'+projectId+'/'+f
                    #Get the stored path of a patch
                    patchpath=dataset+'/'+toolId+'/'+projectId+'/'+f 
                    addcount=0
                    minuscount=0
                    with open(patchpath) as file:
                        lines = file.readlines()
                        for l in lines:
                            if "+"==l[0]:
                                #ignore +++
                                if "+" !=l[1]:
                                    #ignore comment
                                    if "//" not in l:
                                        addcount = addcount+1
                            if "-"==l[0]:
                                #ignore ---
                                if "-" !=l[1]:
                                    minuscount=minuscount+1
                        # writing to csv file
                        filewriter.writerow([f,projectId+bugId,toolId,dataset,addcount,minuscount,link])
            else:
                patches_overview(dir+'/'+f,dataset)
        

def append_header(csvfile, header):
    with open('./statistics/'+csvfile, 'w') as csvfile:
        filewriter = csv.writer(csvfile, delimiter=',',
                                quotechar='|', quoting=csv.QUOTE_MINIMAL) 
        filewriter.writerow([header])

def autotest(patchName,dataset,testSuite):
    arraynames=os.path.splitext(patchName)[0].split("-")   
    # arraynames ['patch1', 'Chart', '1', 'CapGen']
    patchNo=arraynames[0] 
    projectId=arraynames[1] 
    bugId=arraynames[2]
    toolId=arraynames[3]
    lcProjectId=projectId.decode('utf-8').lower()
    # checkout the original buggy programs to buggy_projects
    checkout_project(patchName,'buggy_projects')
    # apply patches to buggy programs
    patchpath=dataset+'/'+toolId+'/'+projectId+'/'+patchName 
    applyresult=apply_patch(patchpath,dataset,toolId,projectId,bugId,lcProjectId,'buggy_projects')
    print applyresult
    #update defects4j time building file
    if projectId=='Time':
        if int(bugId)<=11:
            os.system('cp ./lib/Time.build.xml ./defects4j/framework/projects/Time/ ')
        else:
            os.system('cp ./lib/Time2.build.xml ./defects4j/framework/projects/Time/ ')
            os.system('mv ./defects4j/framework/projects/Time/Time2.build.xml ./defects4j/framework/projects/Time/Time.build.xml')
    # copy automatically generated tests
    # derermine the target patch of the tests
    program_path='./buggy_projects/'+projectId+'/'+lcProjectId+'_'+bugId+'_buggy'
    if projectId=='Lang':
        target_test_path=program_path+'/src/test/java'
        if not os.path.isdir(target_test_path):
                target_test_path=program_path+'/src/test'
    if projectId=='Math':
        target_test_path=program_path+'/src/test/java'
        if not os.path.isdir(target_test_path):
                target_test_path=program_path+'/src/test'
    if projectId=='Chart':
        target_test_path=program_path+'/tests'
    if projectId=='Time':
        target_test_path=program_path+'/src/test/java'
    if projectId=='Closure':
        target_test_path=program_path+'/test'
    # cases of three test suites ASE15_Evosuite|ASE15_Randoop|EMSE18_Evosuite
    
    if testSuite!='ASE15_Randoop':
        if testSuite=='ASE15_Evosuite':
            testpath='./generated_tests/ASE15/evosuite/'+projectId+'/'+bugId+'/'+projectId+'/evosuite-branch/'
            testseed=10
        if testSuite=='EMSE18_Evosuite':
            testpath='./generated_tests/EMSE18/'+projectId+'/'+projectId+bugId+'/'
            testseed=30
        for i in range (0,testseed):
            seedpath=testpath+str(i)
            # copy test file
            if os.path.isdir(seedpath):
                os.system('cp -r '+seedpath+'/.  '+target_test_path)
                # compile the tests
                os.chdir(program_path)
                os.system(d4jpath+'/defects4j compile')
                result=os.popen(d4jpath+'/defects4j test').read()
                print result               
                os.chdir('../../../')  
                with open('./statistics/Autotest_'+date+'.csv', 'a') as csvfile:
                    filewriter = csv.writer(csvfile, delimiter=',',
                                    quotechar='|', quoting=csv.QUOTE_MINIMAL)
                    resultlines=result.split('\n')
                    failingInfo=''
                    failingTestsNo=''
                    for line in resultlines:
                        if '::' not in line:
                            if not line=='':
                                if ':' in line:
                                    failingTestsNo=line.split(':')[1]
                        else:
                            failingTestClass=line.split('::')[0]
                            failingInfo=failingInfo+';'+line.split('::')[1]                               
                    filewriter.writerow([patchName,projectId, bugId, testSuite, i,failingTestsNo[1:], failingInfo])      
            else:
                print 'No tests for '+patchName+' in test suite '+testSuite
        remove_project('buggy_projects')  
  
    if testSuite=='ASE15_Randoop':
        #copy randoop tests
        for i in range(1,11):
            print i
            #extract the bz2 file first
            os.system('tar -jxvf '+'./generated_tests/ASE15/randoop/'+projectId+'/randoop/'+str(i)+'/'+projectId+'-'+bugId+'f-randoop.'+str(i)+'.tar.bz2')
            original_test_path='./'+projectId+'-'+bugId+'f-randoop.'+str(i)
            print original_test_path
            os.system('cp -r '+original_test_path+'/.  '+target_test_path)
            #delete extracted file
            os.system('rm -r '+projectId+'-'+bugId+'f-randoop.'+str(i))
            os.chdir(program_path)
            os.system(d4jpath+'/defects4j compile')
            result=os.popen(d4jpath+'/defects4j test').read()
            print result
            os.chdir('../../../')  
            with open('./statistics/Autotest_'+date+'.csv', 'a') as csvfile:
                filewriter = csv.writer(csvfile, delimiter=',',
                                quotechar='|', quoting=csv.QUOTE_MINIMAL)
                resultlines=result.split('\n')
                failingInfo=''
                failingTestsNo=''
                for line in resultlines:
                    if '::' not in line:
                        if not line=='':
                            if ':' in line:
                                failingTestsNo=line.split(':')[1]
                    else:
                        failingTestClass=line.split('::')[0]
                        failingInfo=failingInfo+';'+line.split('::')[1]                               
                filewriter.writerow([patchName,projectId, bugId, testSuite, i,failingTestsNo[1:], failingInfo])   
        remove_project('buggy_projects')  
            

def commonTestPath(path):
    for root, dirs, files in os.walk(path, topdown=False):
        for name in files:
            pattern = '*Test.java'
            if fnmatch.fnmatch(name, pattern):
                return os.path.join(root, name).split(path)[1]
    return ''


def apply_patch(patchpath,dataset,toolId,projectId,bugId,lcProjectId,buggyProject):
    with open(patchpath) as f:
        difffiles=f.read().split('\n\n\n')
        for diffs in difffiles:
            # split a patch to several temporary patches in case one patch containes many fixes for different files
            filepath=dataset+'/'+toolId+'/'+projectId+'/tmp.patch'
            f=open(filepath,"w")
            f.write(diffs)
            f.close()
            tmppatch='./'+dataset+'/'+toolId+'/'+projectId+'/tmp.patch'
            first_line = diffs.split('\n')[0]
            # original buggy file patch
            filepath=first_line.split('--- ')[1]
            original_file='./'+buggyProject+'/'+projectId+'/'+lcProjectId+'_'+bugId+'_buggy/'+filepath
            result=os.popen("patch -u -l --fuzz=10  -i  " +tmppatch +" "+ original_file).read()
            os.remove(tmppatch)
            return result

def post_init():
    os.system('cp ./lib/Chart.build.xml ./defects4j/framework/projects/Chart/ ')
    os.system('cp ./lib/Closure.build.xml ./defects4j/framework/projects/Closure/ ')
    os.system('cp ./lib/Math.build.xml ./defects4j/framework/projects/Math/ ')
    os.system('cp ./lib/Lang.build.xml ./defects4j/framework/projects/Lang/ ')

# ./autotest.py <patch name>  <D_correct|D_incorrect|D_unassessed> <ASE15_Evosuite|ASE15_Randoop|EMSE18_Evosuite>
if __name__ == '__main__':
    currentpath=os.path.dirname(os.path.realpath(__file__))
    d4jpath=currentpath+'/defects4j/framework/bin'
    folderdir1='./D_correct'
    folderdir2='./D_incorrect'
    folderdir3='./D_unassessed'
    command=sys.argv[1]
    now = datetime.datetime.now()
    date = now.strftime("%Y-%m-%d")
    if command=='consistency_check':     
        travFolder(folderdir1,'D_correct','consistency')       
        travFolder(folderdir2,'D_incorrect','consistency')
        travFolder(folderdir3,'D_unassessed','consistency')
    elif command=='plausible_check':  
        travFolder(folderdir1,'D_correct','plausibility')
        travFolder(folderdir2,'D_incorrect','plausibility')
        travFolder(folderdir3,'D_unassessed','plausibility')
    elif command=='patches_overview':
        append_header('patches_overview.csv','patch_name,bug_id,tool_name,dataset,#added_lines,#removed_lines,url_link')
        patches_overview(folderdir1,'D_correct')
        patches_overview(folderdir2,'D_incorrect')
        patches_overview(folderdir3,'D_unassessed')
    # ./drr.py autotest patch1-Chart-1-CapGen.patch D_correct ASE15_Evosuite
    elif command=='autotest':
        patchName=sys.argv[2] #e.g.patch1-Chart-1-CapGen.patch
        dataset=sys.argv[3] # D_correct,D_incorrect,D_unassessed
        testSuite=sys.argv[4] # ASE15_Evosuite|ASE15_Randoop|EMSE18_Evosuite
        autotest(patchName,dataset,testSuite)
    elif command=='postInit':
        post_init()

    