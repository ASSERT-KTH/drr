#!/usr/bin/python
import sys, os, subprocess

if __name__ == '__main__':
    patchName=sys.argv[1]
    patchType=sys.argv[2]   
    filename=os.path.splitext(patchName)[0]
    arraynames=filename.split("-")
    projectId=arraynames[1]
    bugId=arraynames[2]
    toolId=arraynames[3]
    #export TZ=America/New_York
    #America/Los_Angeles
    #LANG=en_US.UTF-8
    #export JAVA_TOOL_OPTIONS=-Dfile.encoding=UTF8
    currentpath=os.path.dirname(os.path.realpath(__file__))
    d4jpath=currentpath+'/defects4j/framework/bin'
    proj_lower_cast=projectId.decode('utf-8').lower()
    #get patch path
    patchpath=patchType+'_patches/'+toolId+'/'+projectId+'/'+patchName 
    with open(patchpath) as f:       
        #check the original buggy program status
        print "**** "+filename+" original test result: "
        program_path='buggy_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy'
        os.chdir(program_path)
        os.system(d4jpath+'/defects4j compile')
        os.system(d4jpath+'/defects4j test')
        os.chdir('../../../')
       
        #patching file, compile and test it
        print "*** Test result after applying patches: "
        difffiles=f.read().split('\n\n\n')
        for diffs in difffiles:
            f=open(patchType+'_patches/'+toolId+'/'+projectId+'/tmp.patch',"w")
            f.write(diffs)
            f.close()
            tmppatch='./'+patchType+'_patches/'+toolId+'/'+projectId+'/tmp.patch' 
            first_line = diffs.split('\n')[0]
            filepath=first_line.split('--- ')[1]
            print filepath
            program_path='buggy_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy'
            original_file='./'+program_path+filepath
            os.system("patch -u -l -i " +tmppatch +" "+ original_file)
            os.remove(tmppatch)
        os.chdir(program_path)
        os.system(d4jpath+'/defects4j compile')
        os.system(d4jpath+'/defects4j test')
        os.chdir('../../../')
        
        #reverting patched file
        for diffs in difffiles:
            f=open(patchType+'_patches/'+toolId+'/'+projectId+'/tmp.patch',"w")
            f.write(diffs)
            f.close()
            tmppatch='./'+patchType+'_patches/'+toolId+'/'+projectId+'/tmp.patch' 
            first_line = diffs.split('\n')[0]
            filepath=first_line.split('--- ')[1]
            print filepath
            program_path='buggy_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy'
            original_file='./'+program_path+filepath
            os.system("patch -R -i " +tmppatch +" "+ original_file)
            os.remove(tmppatch)






