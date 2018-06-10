#!/usr/bin/python
import sys, os, subprocess,fnmatch

def travFolder(dir):
   listdirs = os.listdir(dir)
   for f in listdirs:
       pattern = '*.patch'
       if os.path.isfile(os.path.join(dir, f)):
           if fnmatch.fnmatch(f, pattern):
                generate_patched_programs(f)

       else:
            travFolder(dir+'/'+f)



def generate_patched_programs(file):
    print file
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
        print difffiles
        for diffs in difffiles:
            f=open('patches/'+arraynames[3]+'/'+arraynames[1]+'/tmp.patch',"w")
            f.write(diffs)
            f.close()
            tmppatch='./patches/'+arraynames[3]+'/'+arraynames[1]+'/tmp.patch' 
            print diffs
            print '*******'
            first_line = diffs.split('\n')[0]
            filepath=first_line.split('--- ')[1]
            print filepath
            names=first_line.split('/')
            target_file=names[len(names)-1]
            print target_file
            program_path='buggy_projects/'+arraynames[1]+'/'+proj_lower_cast+'_'+arraynames[2]+'_buggy'
            original_file='./'+program_path+filepath
            target_path='patched_programs/'+arraynames[3]+'/'+arraynames[1]+'/bug_'+arraynames[2]+'/'+arraynames[0]
            os.system('pwd')
            if not os.path.isdir(target_path):
                os.makedirs(target_path)
            patch_command="patch  -l -u --fuzz=5 " + original_file+ " -i " +tmppatch +" -o "+ target_path+'/'+target_file
            print patch_command
            os.system(patch_command)
            os.remove(tmppatch)



      
   
if __name__ == '__main__':
    folderdir='./patches/ACS/Time'
    travFolder(folderdir)


