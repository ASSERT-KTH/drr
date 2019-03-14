#!/usr/bin/python
import sys, os, subprocess,fnmatch, shutil, csv,re, datetime
import time
from os import listdir
from os.path import isfile, join

def travFolder(dir,dataset,checkdataset):
   listdirs = os.listdir(dir)
   for f in listdirs:
       pattern = 'patch*.patch'
       if os.path.isfile(os.path.join(dir, f)):
           if fnmatch.fnmatch(f, pattern):
                #first temporary checkout project
                checkout_project(f,'tmp_projects','b')
                sanity_check(f,dataset,checkdataset)
                remove_project('tmp_projects')        
       else:
           if 'tmp.patch' not in f:
                travFolder(dir+'/'+f,dataset,checkdataset)




def checkout_project(file,project,bugtype):
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
    os.system( d4jpath+'/defects4j checkout -p '+projectId+' -v '+bugId+bugtype+' -w ./'+project+'/'+projectId+'/'+lcProjectId+'_'+bugId+'_buggy')  


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
    print result
    #record the consistency result in csv file
    if checkdataset == 'consistency':
        with open('./statistics/consistency_check'+date+'.csv', 'a') as csvfile:
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
        with open('./statistics/plausibility_check'+date+'.csv', 'a') as csvfile:
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

def autotest(patchName,dataset,testSuite,isflakyCheck):
    libpath=currentpath+'/lib/evosuite-standalone-runtime-1.0.5.jar:'+currentpath+'/lib/junit-4.12.jar:'+currentpath+'/lib/hamcrest-core-1.3.jar:'+currentpath+'/lib/closure-compiler-v20180204.jar:'+currentpath+'/lib/guava-23.0.jar'
    arraynames=os.path.splitext(patchName)[0].split("-")   
    # arraynames ['patch1', 'Chart', '1', 'CapGen']
    patchNo=arraynames[0] 
    projectId=arraynames[1] 
    bugId=arraynames[2]
    toolId=arraynames[3]
    lcProjectId=projectId.decode('utf-8').lower()
    # checkout the original buggy programs to buggy_projects
    if isflakyCheck=="true":
        checkout_project(patchName,'buggy_projects','f')
    elif isflakyCheck=="false":
        checkout_project(patchName,'buggy_projects','b')
        # apply patches to buggy programs
        patchpath=dataset+'/'+toolId+'/'+projectId+'/'+patchName 
        applyresult=apply_patch(patchpath,dataset,toolId,projectId,bugId,lcProjectId,'buggy_projects')
        print applyresult
    #update defects4j time building file
    # if projectId=='Time':
    #     if int(bugId)<=11:
    #         os.system('cp ./lib/Time.build.xml ./defects4j/framework/projects/Time/ ')
    #     else:
    #         os.system('cp ./lib/Time2.build.xml ./defects4j/framework/projects/Time/ ')
    #         os.system('mv ./defects4j/framework/projects/Time/Time2.build.xml ./defects4j/framework/projects/Time/Time.build.xml')
    # if projectId=='Closure':
    #     if int(bugId)<=50:
    #         os.system('cp ./lib/Closure.build.xml ./defects4j/framework/projects/Closure/ ')
    #     elif int(bugId)>120:
    #         os.system('cp ./lib/Closure.build.xml ./defects4j/framework/projects/Closure/ ')
    #     else:
    #         os.system('cp ./lib/Closure2.build.xml ./defects4j/framework/projects/Closure/ ')
    #         os.system('mv ./defects4j/framework/projects/Closure/Closure2.build.xml ./defects4j/framework/projects/Closure/Closure.build.xml')
       
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
                # os.system('cp -r '+seedpath+'/.  '+target_test_path)
                # compile the tests
                os.chdir(program_path)
                os.system(d4jpath+'/defects4j compile')
                os.chdir('../../../')  
                os.system('cp -r '+seedpath+'/.  '+target_test_path)
                compath=commonTestPath(seedpath)
                evotestpath = target_test_path.split(program_path)[1][1:]+compath
                print "evotestpath"+evotestpath
                os.chdir(program_path)
                print "currentpath: "+currentpath
                
                if os.path.exists("./target/classes"):
                    compileTest = 'javac -cp '+libpath+':./target/classes '
                    if os.path.exists("./target/test-classes"):
                        compileTest = 'javac -cp '+libpath+':./target/classes:./target/test-classes '
                    elif os.path.exists("./target/tests"):
                        compileTest = 'javac -cp '+libpath+':./target/classes:./target/tests '
                if os.path.exists("./build/classes"):
                    compileTest = 'javac -cp '+libpath+':./build/classes '
                    if os.path.exists("./build/test"):
                        compileTest = 'javac -cp '+libpath+':./build/classes:./build/test '
                        if os.path.exists("./build/lib/classes"):
                            compileTest = 'javac -cp '+libpath+':./build/classes:./build/test:./build/lib/classes '
                            if os.path.exists("./lib"):
                                compileTest = 'javac -cp '+libpath+':./build/classes:./build/test:./build/lib/classes:./lib/*.jar  '
                elif os.path.exists("./build/"):
                    compileTest = 'javac -cp '+libpath+':./build '
                if os.path.exists("./build-tests"):
                        compileTest = 'javac -cp '+libpath+':./build:./build-tests '
                

                compileTestscript=compileTest+evotestpath
                print compileTestscript
                os.system('timeout 600 '+compileTestscript)
                ###### Move the build classes to target
                #MATH: target/test-classes
                if os.path.exists("./target/test-classes"):
                    shutil.copy(evotestpath.replace(".java",".class"),"./target/test-classes"+compath.replace(".java",".class"))
                if os.path.exists("./target/tests"):
                    shutil.copy(evotestpath.replace(".java",".class"),"./target/tests"+compath.replace(".java",".class"))
                if os.path.exists("./build-tests"):
                    shutil.copy(evotestpath.replace(".java",".class"),"./build-tests"+compath.replace(".java",".class"))
                if os.path.exists("./build/test"):
                    shutil.copy(evotestpath.replace(".java",".class"),"./build/test"+compath.replace(".java",".class"))

                #####run the specfic target test case
                clazzpath = compath[1:].replace('.java','').replace('/','.')
                print clazzpath
                executeTest=compileTest.replace("javac","java")+" org.junit.runner.JUnitCore "+clazzpath
                print executeTest
                
                result=os.popen('timeout 600 '+executeTest).read()
                # result=os.popen(d4jpath+'/defects4j test').read()
                print result               
                os.chdir('../../../')  
                if isflakyCheck=="true":
                    reportname="flaky_check_"+date+'.csv'
                else:
                    reportname="Autotest_check_"+date+'.csv'
                with open('./statistics/'+reportname, 'a') as csvfile:
                    filewriter = csv.writer(csvfile, delimiter=',',
                                    quotechar='|', quoting=csv.QUOTE_MINIMAL)
                    resultlines=result.split('\n')
                    time=''
                    okpattern='OK (* tests)'
                    failpattern='Tests run: *,  Failures: *'         
                    failInfoPattern='*test*(*)'           
                    failingInfo=''
                    failingTestsNo=0
                    testrun=''
                    for line in resultlines:
                        if 'Time:' in line:
                            time=line.split('Time: ')[1]
                        if fnmatch.fnmatch(line, okpattern):
                            failingTestsNo=0
                            testrun=line.split('(')[1].split(' ')[0]
                        if fnmatch.fnmatch(line, failpattern):
                            failingTestsNo=line.split("Failures:")[1]
                            testrun=line.split(",")[0].split("Tests run: ")[1]
                            print testrun
                            print failingTestsNo
                        if fnmatch.fnmatch(line, failInfoPattern):
                            failingInfo=failingInfo+line
                        
                    filewriter.writerow([patchName,projectId, bugId, testSuite, i, testrun, failingTestsNo, time, failingInfo])      
            else:
                print 'No tests for '+patchName+' in test suite '+testSuite
        remove_project('buggy_projects')  
  
    if testSuite=='ASE15_Randoop':
        #copy randoop tests
        if isflakyCheck=="true":
            reportname="flaky_check_"+date+'.csv'
        else:
            reportname="Autotest_check_"+date+'.csv'
        os.chdir(program_path)
        os.system(d4jpath+'/defects4j compile')
        os.chdir('../../../') 
        for i in range(1,11):
            print i
            #extract the bz2 file first
            print 'tar -jxvf '+'./generated_tests/ASE15/randoop/'+projectId+'/randoop/'+str(i)+'/'+projectId+'-'+bugId+'f-randoop.'+str(i)+'.tar.bz2'
            os.system('tar -jxvf '+'./generated_tests/ASE15/randoop/'+projectId+'/randoop/'+str(i)+'/'+projectId+'-'+bugId+'f-randoop.'+str(i)+'.tar.bz2')
            original_test_path='./'+projectId+'-'+bugId+'f-randoop.'+str(i)
            if os.path.exists(original_test_path):
                print original_test_path
                
                os.system('cp -r '+original_test_path+'/.  '+target_test_path)
                #delete extracted file
                os.system('rm -r '+projectId+'-'+bugId+'f-randoop.'+str(i))
                #check the build targer
                os.chdir(program_path)    
                compileTest=''           
                if os.path.exists("./target/classes"):
                    compileTest = 'javac -cp '+libpath+':./target/classes '
                    if os.path.exists("./target/test-classes"):
                        compileTest = 'javac -cp '+libpath+':./target/classes:./target/test-classes '
                    elif os.path.exists("./target/tests"):
                        compileTest = 'javac -cp '+libpath+':./target/classes:./target/tests '
                if os.path.exists("./build/classes"):
                    compileTest = 'javac -cp '+libpath+':./build/classes '
                    if os.path.exists("./build/test"):
                        compileTest = 'javac -cp '+libpath+':./build/classes:./build/test '
                elif os.path.exists("./build/"):
                    compileTest = 'javac -cp '+libpath+':./build '
                    if os.path.exists("./build-tests"):
                        compileTest = 'javac -cp '+libpath+':./build:./build-tests '
                #compile
                randoopSrcFiles=target_test_path.split(program_path)[1][1:]+"/RandoopTest*.java"
                print 'randoopSrcFiles'+randoopSrcFiles
                compilescript=compileTest+randoopSrcFiles

                

                print compilescript
                os.system('timeout 600 '+compilescript)
                target_class_path=''
                #move compile to test target
                if os.path.exists("./target/test-classes"):
                    target_class_path="./target/test-classes"
                    os.system('cp -rf ./'+randoopSrcFiles.replace(".java",".class") + "  ./target/test-classes/")
                if os.path.exists("./target/tests"):
                    target_class_path="./target/tests"
                    os.system('cp -rf ./'+randoopSrcFiles.replace(".java",".class") + "  ./target/tests/")
                if os.path.exists("./build-tests"):
                    target_class_path="./build-tests"
                    os.system('cp -rf ./'+randoopSrcFiles.replace(".java",".class") + "  ./build-tests/")
                if os.path.exists("./build/test"):
                    target_class_path="./build/test"
                    os.system('cp -rf ./'+randoopSrcFiles.replace(".java",".class") + "  ./build/test/")

                #execute test cases
                target_class_files=''
                listdirs = os.listdir(target_class_path)
                for f in listdirs:
                    pattern = 'RandoopTest*.class'
                    if os.path.isfile(os.path.join(target_class_path, f)):
                        if fnmatch.fnmatch(f, pattern):
                            target_class_files=target_class_files+f.split(".")[0]+' '
                       
                executeTest=compileTest.replace("javac","java")+" org.junit.runner.JUnitCore "+target_class_files
                print executeTest
                result=""           
                result=os.popen('timeout 600 '+executeTest).read()
                print result

                #remove the classes files
                if os.path.exists(target_class_path):
                    os.system('rm -rf '+target_class_path+'/Randoop*')


                os.chdir('../../../')                 
                with open('./statistics/'+reportname, 'a') as csvfile:
                    filewriter = csv.writer(csvfile, delimiter=',',
                                    quotechar='|', quoting=csv.QUOTE_MINIMAL)
                    resultlines=result.split('\n')
                    time=''
                    okpattern='OK (* tests)'
                    failpattern='Tests run: *,  Failures: *'         
                    failInfoPattern='*test*(*)'           
                    failingInfo=''
                    failingTestsNo=0
                    testrun=''
                    NoTestFoundCount=0
                    warningpatern='*warning*'
                    for line in resultlines:
                        if 'Time:' in line:
                            time=line.split('Time: ')[1]
                        if fnmatch.fnmatch(line, okpattern):
                            failingTestsNo='0'
                            testrun=line.split('(')[1].split(' ')[0]
                        if fnmatch.fnmatch(line, failpattern):
                            failingTestsNo=line.split("Failures:")[1]
                            testrun=line.split(",")[0].split("Tests run: ")[1]
                            print testrun
                            print failingTestsNo
                        if fnmatch.fnmatch(line, failInfoPattern):
                            failingInfo=failingInfo+line
                        if fnmatch.fnmatch(line, warningpatern):
                            NoTestFoundCount=int(NoTestFoundCount)+1
                        
                    filewriter.writerow([patchName,projectId, bugId, testSuite, i, testrun, int(failingTestsNo)-int(NoTestFoundCount), time, failingInfo])    
            else:
                with open('./statistics/'+reportname, 'a') as csvfile:
                    filewriter = csv.writer(csvfile, delimiter=',',
                                    quotechar='|', quoting=csv.QUOTE_MINIMAL)
                    filewriter.writerow([patchName,projectId, bugId, testSuite, i,'0','0','0', 'No tests'])   

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
            result=os.popen("patch -u -l --fuzz=10  -i  " +tmppatch +"  "+ original_file).read()
            os.remove(tmppatch)
            return result



def flaky_tests_check(dir,dataset):
   with open('./statistics/fixbugs.txt') as fixbugs:
       lines=fixbugs.readlines()
       for f in lines:
           print f
           #first temporary checkout the fix version of project
           autotest(f,dataset,"ASE15_Evosuite","true")
           autotest(f,dataset,"ASE15_Randoop","true")
           autotest(f,dataset,"EMSE18_Evosuite","true")
                

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
        start = time. time()    
        print("consistency_check: star at ",start)
        travFolder(folderdir1,'D_correct','consistency')       
        travFolder(folderdir2,'D_incorrect','consistency')
        travFolder(folderdir3,'D_unassessed','consistency')
        end = time. time()
        print("consistency_check: end at ",end)
    elif command=='plausible_check':  
        travFolder(folderdir1,'D_correct','plausibility')
        travFolder(folderdir2,'D_incorrect','plausibility')
        travFolder(folderdir3,'D_unassessed','plausibility')
    elif command=='patches_overview':
        append_header('patches_overview.csv','patch_name,bug_id,tool_name,dataset,#added_lines,#removed_lines,url_link')
        patches_overview(folderdir1,'D_correct')
        patches_overview(folderdir2,'D_incorrect')
        patches_overview(folderdir3,'D_unassessed')
    # execute the test cases against the fix version and remove the flaky tests.
    elif command=='flaky_tests_check':
        flaky_tests_check('./D_correct_DS','D_correct_DS')
        flaky_tests_check('./D_incorrect_DS','D_incorrect_DS')
       
    # ./drr.py autotest patch1-Chart-1-CapGen.patch D_correct ASE15_Evosuite
    elif command=='autotest':
        patchName=sys.argv[2] #e.g.patch1-Chart-1-CapGen.patch
        dataset=sys.argv[3] # D_correct,D_incorrect,D_unassessed
        testSuite=sys.argv[4] # ASE15_Evosuite|ASE15_Randoop|EMSE18_Evosuite
        autotest(patchName,dataset,testSuite,"false")
    elif command=='postInit':
        post_init()

    
