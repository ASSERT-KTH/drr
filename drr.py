#!/usr/bin/python
import sys, os, subprocess,fnmatch, filecmp,csv



def travFolder(dir,type,plausibleOrConsistency):
   listdirs = os.listdir(dir)
   for f in listdirs:
       pattern = 'patch*.patch'
       if os.path.isfile(os.path.join(dir, f)):
           if fnmatch.fnmatch(f, pattern):
                    checkout_project(f)
                    consistency_check(f,type,plausibleOrConsistency)
                    remove_project(f)
               

       else:
           print f
           if 'tmp.patch' not in f:
                travFolder(dir+'/'+f,type)



def checkout_project(file):
    filename=os.path.splitext(file)[0]
    arraynames=filename.split("-")
    projectId=arraynames[1]
    bugId=arraynames[2]
    proj_lower_cast=projectId.decode('utf-8').lower()
    if not os.path.exists('tmp_projects'):
         os.system('mkdir tmp_projects')
    if not os.path.exists('tmp_projects/'+projectId):
        os.system('mkdir tmp_projects/'+projectId)
    os.system( d4jpath+'/defects4j checkout -p '+projectId+' -v '+bugId+'b -w ./tmp_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy')  




def remove_project(file):
    filename=os.path.splitext(file)[0]
    arraynames=filename.split("-")
    projectId=arraynames[1]
    bugId=arraynames[2]
    if  os.path.exists('tmp_projects'):
        os.system('rm -rf tmp_projects')



def consistency_check(file,type,plausibleOrConsistency):
    filename=os.path.splitext(file)[0]
    arraynames=filename.split("-")
    projectId=arraynames[1]
    bugId=arraynames[2]
    toolId=arraynames[3]
    currentpath=os.path.dirname(os.path.realpath(__file__))
    proj_lower_cast=projectId.decode('utf-8').lower()
    #get patch path
    if type=='correct':
        patchpath='claimed_correct_patches/'+toolId+'/'+projectId+'/'+file 
    else:
         patchpath='plausible_patches/'+toolId+'/'+projectId+'/'+file
    with open(patchpath) as f:
        difffiles=f.read().split('\n\n\n')
        for diffs in difffiles:
            if type=='correct':
                filepath='claimed_correct_patches/'+toolId+'/'+projectId+'/tmp.patch'
            else:
                filepath='plausible_patches/'+toolId+'/'+projectId+'/tmp.patch'
            f=open(filepath,"w")
            f.write(diffs)
            f.close()
            if type=='correct':
                tmppatch='./claimed_correct_patches/'+toolId+'/'+projectId+'/tmp.patch'
            else:
                tmppatch='./plausible_patches/'+toolId+'/'+projectId+'/tmp.patch'
            first_line = diffs.split('\n')[0]
            filepath=first_line.split('--- ')[1]
            print filepath
            program_path='tmp_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy'
            original_file='./'+program_path+filepath
            result=os.popen("patch -u -l --fuzz=10  -i  " +tmppatch +" "+ original_file).read()
            print result
            #record the consistency result in csv file
            if plausibleOrConsistency == 'consistency':
                with open('./tables/consistency_check.csv', 'a') as csvfile:
                    filewriter = csv.writer(csvfile, delimiter=',',
                                    quotechar='|', quoting=csv.QUOTE_MINIMAL)
                    if "FAILED" in result:
                        filewriter.writerow([file,type,"FAILED"])
                    else:
                        filewriter.writerow([file,type,"OK"])
            os.remove(tmppatch)

        if plausibleOrConsistency == 'plausibility':
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
                         



def patches_info(dir,type):
   listdirs = os.listdir(dir)
   for f in listdirs:
       pattern = '*.patch'
       if os.path.isfile(os.path.join(dir, f)):
           if fnmatch.fnmatch(f, pattern):              
                filename=os.path.splitext(f)[0]
                arraynames=filename.split("-")
                projectId=arraynames[1] 
                bugId=arraynames[2]
                toolId=arraynames[3]
                with open('patches_infomation.csv', 'a') as csvfile:
                    filewriter = csv.writer(csvfile, delimiter=',',
                                quotechar='|', quoting=csv.QUOTE_MINIMAL)
                    if type == 'correct':
                        link='https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/claimed_correct_patches/'+toolId+'/'+projectId+'/'+f
                    elif type == 'plausible':
                        link='https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/'+toolId+'/'+projectId+'/'+f
                    name='click for patch'
                    hylink='=HYPERLINK(\"'+link+'\";\"'+name+'\")'
                    if type == 'correct':
                        patchpath='claimed_correct_patches/'+toolId+'/'+projectId+'/'+f 
                    elif type == 'plausible':
                        patchpath='plausible_patches/'+toolId+'/'+projectId+'/'+f 
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
                                        print '+'+l
                                        addcount = addcount+1
                            if "-"==l[0]:
                                if "-" !=l[1]:
                                    minuscount=minuscount+1
                                    print '-'+l 
                        if type == 'correct':
                            filewriter.writerow([projectId+bugId,toolId,f,'claimed_correct_patches',link,addcount,minuscount])
                        elif type == 'plausible':
                            filewriter.writerow([projectId+bugId,toolId,f,'plausible_patches',link,addcount,minuscount])

       else:
            travFolder(dir+'/'+f)





if __name__ == '__main__':
    d4jpath=currentpath+'/defects4j/framework/bin'
    folderdir1='./claimed_correct_patches'
    folderdir2='./plausible_patches/'
    command=ys.argv[0]
    if command=='consistency_check':     
        travFolder(folderdir1,'correct','consistency')       
        travFolder(folderdir2,'plausible','consistency')
    elif command=='plausibi_check':  
        travFolder(folderdir1,'correct','plausibility')
        travFolder(folderdir2,'plausible','plausibility')
    elif command=='patches_info':
        patches_info(folderdir1,'correct')
        patches_info(folderdir2,'plausible')



   



    