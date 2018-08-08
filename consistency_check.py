#!/usr/bin/python
import sys, os, subprocess,fnmatch, filecmp,csv

def travFolder(dir,type):
   listdirs = os.listdir(dir)
   for f in listdirs:
       pattern = 'patch*.patch'
       if os.path.isfile(os.path.join(dir, f)):
           if fnmatch.fnmatch(f, pattern):
                checkout_project(f)
                consistency_check(f,type)
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



def consistency_check(file,type):
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
            with open('./tables/consistency_check.csv', 'a') as csvfile:
                filewriter = csv.writer(csvfile, delimiter=',',
                                quotechar='|', quoting=csv.QUOTE_MINIMAL)
                if "FAILED" in result:
                    filewriter.writerow([file,type,"FAILED"])
                else:
                    filewriter.writerow([file,type,"OK"])

            os.remove(tmppatch)         
                           

      
   
if __name__ == '__main__':
    currentpath=os.path.dirname(os.path.realpath(__file__))
    d4jpath=currentpath+'/defects4j/framework/bin'
    # folderdir1='./claimed_correct_patches'
    # travFolder(folderdir1,'correct')
    folderdir2='./plausible_patches/JGenProg2017'
    travFolder(folderdir2,'plausible')

