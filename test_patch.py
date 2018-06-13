#!/usr/bin/python
import sys, os, subprocess

if __name__ == '__main__':
    filename=os.path.splitext(sys.argv[1])[0]   
    arraynames=filename.split("-")
    #sys.argv[2]== 'correct' or 'plausible' 
    # filename[0] patch number     
    # filename[1]  project name, i.e., Lang, Chart...
    # filename[2]  bug id
    # filename[3]  repair tool name, i.e. Dynamoth   
    currentpath=os.path.dirname(os.path.realpath(__file__))
    d4jpath=currentpath+'/defects4j/framework/bin'
    proj_lower_cast=arraynames[1].decode('utf-8').lower()
    #get patch path
    patchpath=sys.argv[2]+'_patches/'+arraynames[3]+'/'+arraynames[1]+'/'+sys.argv[1] 
    with open(patchpath) as f:
        first_line = f.readline()
        filepath=first_line.split('--- ')[1]
        names=first_line.split('/')
        target_file=names[len(names)-1]
        
        #check the original buggy program status
        print "**** "+filename+" original test result: "
        program_path='buggy_projects/'+arraynames[1]+'/'+proj_lower_cast+'_'+arraynames[2]+'_buggy'
        original_file='./'+program_path+filepath
        patch_file='./'+patchpath
        os.chdir(program_path)
        os.system(d4jpath+'/defects4j compile')
        os.system(d4jpath+'/defects4j test')
        os.chdir('../../../')
       
        #patching file, compile and test it
        print "*** Test result after applying patches: "
        patch_command="patch  -u -i " +patch_file +" "+ original_file
        os.system(patch_command)
        os.chdir(program_path)
        os.system(d4jpath+'/defects4j compile')
        os.system(d4jpath+'/defects4j test')
        os.chdir('../../../')
        
        #reverting patched file
        os.system("patch -R -i " +patch_file +" "+ original_file)




