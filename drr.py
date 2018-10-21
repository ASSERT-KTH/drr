#!/usr/bin/python
import sys, os, subprocess,fnmatch, filecmp,csv



def travFolder(dir,type,checkType):
   listdirs = os.listdir(dir)
   for f in listdirs:
       pattern = 'patch*.patch'
       if os.path.isfile(os.path.join(dir, f)):
           if fnmatch.fnmatch(f, pattern):
                #first temporary checkout project
                checkout_project(f)
                sanity_check(f,type,checkType)
                remove_project(f)        
       else:
           if 'tmp.patch' not in f:
                travFolder(dir+'/'+f,type,checkType)



def checkout_project(file):
    filename=os.path.splitext(file)[0]
    arraynames=filename.split("-")
    projectId=arraynames[1]
    bugId=arraynames[2]
    lcProjectId=projectId.decode('utf-8').lower()
    if not os.path.exists('tmp_projects'):
         os.system('mkdir tmp_projects')
    if not os.path.exists('tmp_projects/'+projectId):
        os.system('mkdir tmp_projects/'+projectId)
    os.system( d4jpath+'/defects4j checkout -p '+projectId+' -v '+bugId+'b -w ./tmp_projects/'+projectId+'/'+lcProjectId+'_'+bugId+'_buggy')  


def remove_project(file):
    filename=os.path.splitext(file)[0]
    arraynames=filename.split("-")
    projectId=arraynames[1]
    bugId=arraynames[2]
    if  os.path.exists('tmp_projects'):
            os.system('rm -rf tmp_projects')


def sanity_check(file,type,checkType):
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
    patchpath=type+'/'+toolId+'/'+projectId+'/'+file 
    with open(patchpath) as f:
        difffiles=f.read().split('\n\n\n')
        for diffs in difffiles:
            # split a patch to several temporary patches in case one patch containes many fixes for different files
            filepath=type+'/'+toolId+'/'+projectId+'/tmp.patch'
            f=open(filepath,"w")
            f.write(diffs)
            f.close()
            tmppatch='./'+type+'/'+toolId+'/'+projectId+'/tmp.patch'
            first_line = diffs.split('\n')[0]
            # original buggy file patch
            filepath=first_line.split('--- ')[1]
            print filepath
            original_file='./tmp_projects/'+projectId+'/'+lcProjectId+'_'+bugId+'_buggy/'+filepath
            result=os.popen("patch -u -l --fuzz=10  -i  " +tmppatch +" "+ original_file).read()
            print result
            #record the consistency result in csv file
            if checkType == 'consistency':
                with open('./statistics/consistency_check.csv', 'w') as csvfile:
                    filewriter = csv.writer(csvfile, delimiter=',',
                                    quotechar='|', quoting=csv.QUOTE_MINIMAL)
                    if "FAILED" in result:
                        filewriter.writerow([file,type,"FAILED"])
                    else:
                        filewriter.writerow([file,type,"OK"])
            os.remove(tmppatch)

        if checkType == 'plausibility':
            os.chdir(program_path)
            os.system(d4jpath+'/defects4j compile')
            test_result=os.popen(d4jpath+'/defects4j test').read()   
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

            with open('./tables/plausibility_check.csv', 'a') as csvfile:
                    filewriter = csv.writer(csvfile, delimiter=',',
                                    quotechar='|', quoting=csv.QUOTE_MINIMAL)
                    
                    filewriter.writerow([file,type,failingTestsNo,failingInfo])
                         



def patches_overview(dir,type):
    with open('./statistics/patches_overview.csv', 'a') as csvfile:
        filewriter = csv.writer(csvfile, delimiter=',',
                                quotechar='|', quoting=csv.QUOTE_MINIMAL) 
        # filewriter.writerow(['patch_name','bug_id','tool_name','dataset','#added lines','#removed lines','url_link'])
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
                    link='https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/'+type+'/'+toolId+'/'+projectId+'/'+f
                    #Get the stored path of a patch
                    patchpath=type+'/'+toolId+'/'+projectId+'/'+f 
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
                        filewriter.writerow([f,projectId+bugId,toolId,type,addcount,minuscount,link])
            else:
                patches_overview(dir+'/'+f,type)
        

def append_header(csvfile, header):
    with open('./statistics/'+csvfile, 'w') as csvfile:
        filewriter = csv.writer(csvfile, delimiter=',',
                                quotechar='|', quoting=csv.QUOTE_MINIMAL) 
        filewriter.writerow([header])





if __name__ == '__main__':
    currentpath=os.path.dirname(os.path.realpath(__file__))
    d4jpath=currentpath+'/defects4j/framework/bin'
    folderdir1='./D_correct'
    folderdir2='./D_incorrect'
    folderdir3='./D_unassessed'
    command=sys.argv[1]
    print command
    if command=='consistency_check':     
        travFolder(folderdir1,'D_correct','consistency')       
        # travFolder(folderdir2,'D_incorrect','consistency')
        # travFolder(folderdir3,'D_unassessed','consistency')
    elif command=='plausibi_check':  
        travFolder(folderdir1,'correct','plausibility')
        travFolder(folderdir2,'plausible','plausibility')
    elif command=='patches_overview':
        append_header('patches_overview.csv','patch_name,bug_id,tool_name,dataset,#added_lines,#removed_lines,url_link')
        patches_overview(folderdir1,'D_correct')
        patches_overview(folderdir2,'D_incorrect')
        patches_overview(folderdir3,'D_unassessed')
        



   



    