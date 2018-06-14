#!/usr/bin/python
import sys, os, subprocess,fnmatch, shutil



def addTests(projectId,bugId):
    return 1




def checkTestNumber(testpath): 
   listdirs = os.listdir(testpath)
   print listdirs
   return len(listdirs)-2


def commonTestPath(path):
    for root, dirs, files in os.walk(path, topdown=False):
        for name in files:
            pattern = '*Test.java'
            if fnmatch.fnmatch(name, pattern):
                return os.path.join(root, name).split(path)[1]
    return ''


if __name__ == '__main__':
    filename=os.path.splitext(sys.argv[1])[0]   
    arraynames=filename.split("-")
    #sys.argv[2]== 'correct' or 'plausible' 
    # filename[0] patch number     
    # filename[1]  project name, i.e., Lang, Chart...
    # filename[2]  bug id
    # filename[3]  repair tool name, i.e. Dynamoth  
    projectId=arraynames[1] 
    bugId=arraynames[2]
    toolId=arraynames[3]
    currentpath=os.path.dirname(os.path.realpath(__file__))
    d4jpath=currentpath+'/defects4j/framework/bin'
    proj_lower_cast=projectId.decode('utf-8').lower()
    #get patch path
    patchpath=sys.argv[2]+'_patches/'+toolId+'/'+projectId+'/'+sys.argv[1] 
    with open(patchpath) as f:
        first_line = f.readline()
        filepath=first_line.split('--- ')[1]
        names=first_line.split('/')
        target_file=names[len(names)-1]
        
        #check the original buggy program status
        print "**** "+filename+" original test result: "
        program_path='buggy_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy'
        original_file='./'+program_path+filepath
        patch_file='./'+patchpath
        #os.chdir(program_path)
        #os.system(d4jpath+'/defects4j compile')
        #os.system(d4jpath+'/defects4j test')
        #os.chdir('../../../')
       
        #patching file, compile and test it
        print "*** Test result after applying patches: "       
        #Apply patch to the buggy file
        patch_command="patch  -u -i " +patch_file +" "+ original_file
        os.system(patch_command)
        #Check tests number
        testpath='./automated_generate_tests/ASE15/'+projectId+'/'+bugId+'/'+projectId+'/evosuite-branch'
        num=checkTestNumber(testpath)
        commonpath = commonTestPath(testpath+'/0')
        print commonpath
        original_test_path=''
        target_test_path=''
        print num
        for i in range(0,1):
            print i
            original_test_file=testpath+'/'+str(i)+commonpath
            print original_test_file
            target_test_path='./buggy_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy/src/test/java'
            target_test_file=target_test_path+commonpath
            #Add corresponding evosuite tests to target path
            shutil.copyfile(original_test_file, target_test_file)        
            os.chdir(program_path)
            os.system(d4jpath+'/defects4j compile')
            os.system(d4jpath+'/defects4j test')
            os.chdir('../../../')

            #reverting patched file
            os.system("patch -R -i " +patch_file +" "+ original_file)
            os.remove(target_test_file)


