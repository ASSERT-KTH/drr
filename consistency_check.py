#!/usr/bin/python
import sys, os, subprocess,fnmatch, filecmp

def travFolder(dir):
   listdirs = os.listdir(dir)
   for f in listdirs:
       pattern = '*.patch'
       if os.path.isfile(os.path.join(dir, f)):
           if fnmatch.fnmatch(f, pattern):
                 consistency_check(f)

       else:
            travFolder(dir+'/'+f)

def  consistency_check(file):
    filename=os.path.splitext(file)[0]
    arraynames=filename.split("-")
    # filename[0] patch number     
    # filename[1]  project name, i.e., Lang, Chart...
    # filename[2]  bug id
    # filename[3]  repair tool name, i.e. Dynamoth   
    currentpath=os.path.dirname(os.path.realpath(__file__))
    proj_lower_cast=arraynames[1].decode('utf-8').lower()
    #get patch path
    patchpath='patches/'+arraynames[3]+'/'+arraynames[1]+'/'+file 
    with open(patchpath) as f:
        difffiles=f.read().split('\n\n')
        for diffs in difffiles:
            f=open('patches/'+arraynames[3]+'/'+arraynames[1]+'/tmp.patch',"w")
            f.write(diffs)
            f.close()
            tmppatch='./patches/'+arraynames[3]+'/'+arraynames[1]+'/tmp.patch' 
            first_line = diffs.split('\n')[0]
            filepath=first_line.split('--- ')[1]
            names=first_line.split('/')
            target_file=names[len(names)-1]
            program_path='buggy_projects/'+arraynames[1]+'/'+proj_lower_cast+'_'+arraynames[2]+'_buggy'
            original_file='./'+program_path+filepath
            patched_file='patched_programs/'+arraynames[3]+'/'+arraynames[1]+'/bug_'+arraynames[2]+'/'+arraynames[0]+'/'+target_file
            patch_command="diff  -b -u " + original_file +"   "+  patched_file  +" > tmpdiff.patch"
            os.system(patch_command)
            if not compare_two_files(tmppatch,"tmpdiff.patch"):
                print '*********patch file '+filename+' is INCONSISTENT!'          
            else:
                print file+' consistency check PASS!'
            os.remove(tmppatch)
            os.remove("tmpdiff.patch")



def compare_two_files(tmppatchpath,tmpdiffpath):
    
    with open(tmppatchpath) as file1, open(tmpdiffpath) as file2:
        n=0
        for line1, line2 in zip(file1,file2):
            n=n+1
            if(n>2):
                if line1 != line2:
                    return False
                else:
                    return True
            
                    
    
    file1.close()
    file2.close()



      
   
if __name__ == '__main__':
    folderdir='./patches/ACS/Math'
    travFolder(folderdir)


