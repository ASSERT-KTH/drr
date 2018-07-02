#!/usr/bin/python
# -*- coding: utf-8 -*-
# usage
# ./autotest.py <patch name>  <correct|plausible> <ASE15|EMSE18> 
# i.e. ./autotest.py patch1-Chart-1-CapGen.patch correct ASE15

import sys, os, subprocess,fnmatch, shutil, csv,re


def checkTestNumber(testpath): 
   listdirs = os.listdir(testpath)
   print listdirs
   return len(listdirs)


def countJavaFile(path):
    count=0
    for root, dirs, files in os.walk(path, topdown=False):       
        for name in files:
            pattern = '*.java'
            if fnmatch.fnmatch(name, pattern):
                count=count+1
    return count


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
    testgroup=sys.argv[3]
    patchType=sys.argv[2]
    patchName=sys.argv[1]
    testType=sys.argv[4] #evosuite or randoop

    if projectId=='Lang':
        target_test_path='./buggy_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy/src/test/java'
        if not os.path.isdir(target_test_path):
                target_test_path='./buggy_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy/src/test'
    if projectId=='Math':
        target_test_path='./buggy_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy/src/test/java'
        if not os.path.isdir(target_test_path):
                target_test_path='./buggy_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy/src/test'
    if projectId=='Chart':
        target_test_path='./buggy_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy/tests'
    if projectId=='Time':
        target_test_path='./buggy_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy/src/test/java'
    program_path='buggy_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy'
    
    if patchType=='correct':
       patchpath='claimed_correct_patches/'+toolId+'/'+projectId+'/'+patchName 
    else:
        patchpath='plausible_patches/'+toolId+'/'+projectId+'/'+patchName

    ##Evosuite
    if testType=='evosuite':
        if testgroup=='ASE15':
                testpath='./automatically_generated_tests/ASE15/evosuite/'+projectId+'/'+bugId+'/'+projectId+'/evosuite-branch'
        elif testgroup== 'EMSE18':
                testpath='./automatically_generated_tests/EMSE18/'+projectId+'/'+bugId+'/'
        print testpath
        commonpath = commonTestPath(testpath+'/0')
       
        with open('randoop-test.csv', 'a') as csvfile:
            filewriter = csv.writer(csvfile, delimiter=',',
                                quotechar='|', quoting=csv.QUOTE_MINIMAL)
            if commonpath=='':
                print "NO TESTS!"
                filewriter.writerow([patchName,projectId, bugId,testType,0,'No Tests'])
                sys.exit()
            else:         
                for i in range(7,10):
                    print i
                    original_test_file=testpath+'/'+str(i)+commonpath
                    print original_test_file
                    target_test_file=target_test_path+commonpath
                    shutil.copyfile(original_test_file, target_test_file)        
                    os.chdir(program_path)
                    os.system(d4jpath+'/defects4j compile')
                    result=os.popen(d4jpath+'/defects4j test').read()
                    print result
                    resultlines=result.split('\n');
                    failingInfo=''
                    for line in resultlines:
                        if '::' not in line:
                            if not line=='':
                                failingTestsNo=line.split(':')[1]
                                print failingTestsNo
                        else:
                            failingTestClass=line.split('::')[0]
                            failingInfo=failingInfo+';'+line.split('::')[1]
                            print failingInfo
                    filewriter.writerow([patchName,projectId, bugId, testType, i,failingTestsNo, failingInfo])
                    os.chdir('../../../')
                    os.remove(target_test_file)

    #Randoop
    elif testType=='randoop':
         with open('randop-test.csv', 'a') as csvfile:
            filewriter = csv.writer(csvfile, delimiter=',',
                                quotechar='|', quoting=csv.QUOTE_MINIMAL)
            with open(patchpath) as f:
                # difffiles=f.read().split('\n\n\n')
                # for diffs in difffiles:
                #     if patchType=='correct':
                #         filepath='claimed_correct_patches/'+toolId+'/'+projectId+'/tmp.patch'
                #     else:
                #         filepath='plausible_patches/'+toolId+'/'+projectId+'/tmp.patch'
                #     f=open(filepath,"w")
                #     f.write(diffs)
                #     f.close()
                #     if patchType=='correct':
                #         tmppatch='./claimed_correct_patches/'+toolId+'/'+projectId+'/tmp.patch'
                #     else:
                #         tmppatch='./plausible_patches/'+toolId+'/'+projectId+'/tmp.patch'
                #     first_line = diffs.split('\n')[0]
                #     filepath=first_line.split('--- ')[1]
                #     print filepath
                #     program_path='buggy_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy'
                #     original_file='./'+program_path+filepath
                #     os.system("patch -u -l -i " +tmppatch +" "+ original_file)
                #     print tmppatch
                #     os.remove(tmppatch)
                    #copy randoop tests
                    for i in range(1,3):
                        print i
                        #extract the bz2 file first
                        os.system('tar -jxvf '+'./automatically_generated_tests/ASE15/randoop/'+projectId+'/randoop/'+str(i)+'/'+projectId+'-'+bugId+'f-randoop.'+str(i)+'.tar.bz2')

                        original_test_path='./'+projectId+'-'+bugId+'f-randoop.'+str(i)
                        print original_test_path
                        number=countJavaFile(original_test_path)
                        print number
                        for j in range(0,number):
                            shutil.copyfile(original_test_path+'/RandoopTest'+str(j)+'.java', target_test_path+'/RandoopTest'+str(j)+'.java')
                        #delete extracted file
                        os.system('rm -r '+projectId+'-'+bugId+'f-randoop.'+str(i))
                        #execute the tests
                        os.chdir(program_path)
                        os.system(d4jpath+'/defects4j compile')
                        result=os.popen(d4jpath+'/defects4j test').read()
                        print result
                        print result.split('\n')[0]
                        filewriter.writerow([patchName,projectId, bugId, testType, i,result.split('\n')[0]])
                        os.chdir('../../../')
                        for k in range(0,number):
                            os.remove(target_test_path+'/RandoopTest'+str(k)+'.java')
                    #####revert changes
                # for diffs in difffiles:
                #     if patchType=='correct':
                #         filepath='claimed_correct_patches/'+toolId+'/'+projectId+'/tmp.patch'
                #     else:
                #         filepath='plausible_patches/'+toolId+'/'+projectId+'/tmp.patch'
                #     f=open(filepath,"w")
                #     f.write(diffs)
                #     f.close()
                #     if patchType=='correct':
                #         tmppatch='./claimed_correct_patches/'+toolId+'/'+projectId+'/tmp.patch'
                #     else:
                #         tmppatch='./plausible_patches/'+toolId+'/'+projectId+'/tmp.patch' 
                #     first_line = diffs.split('\n')[0]
                #     filepath=first_line.split('--- ')[1]
                #     print filepath
                #     program_path='buggy_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy'
                #     original_file='./'+program_path+filepath
                #     os.system("patch -R -i " +tmppatch +" "+ original_file)
                #     os.remove(tmppatch)



















        
        # print "Automatically Generated Tests compiled successfully"
    
        # with open() as f:
        #     difffiles=f.read().split('\n\n\n')
        #     for diffs in difffiles:
        #         if patchType=='correct':
        #             filepath='claimed_correct_patches/'+toolId+'/'+projectId+'/tmp.patch'
        #         else:
        #             filepath='plausible_patches/'+toolId+'/'+projectId+'/tmp.patch'
        #         f=open(filepath,"w")
        #         f.write(diffs)
        #         f.close()
        #         if patchType=='correct':
        #             tmppatch='./claimed_correct_patches/'+toolId+'/'+projectId+'/tmp.patch'
        #         else:
        #             tmppatch='./plausible/'+toolId+'/'+projectId+'/tmp.patch'
        #         first_line = diffs.split('\n')[0]
        #         filepath=first_line.split('--- ')[1]
        #         print filepath
        #         program_path='buggy_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy'
        #         original_file='./'+program_path+filepath
        #         os.system("patch -u -l -i " +tmppatch +" "+ original_file)
        #         os.remove(tmppatch)
        #     if testgroup=='ASE15':
        #         testpath='./automatically_generated_tests/ASE15/'+projectId+'/'+bugId+'/'+projectId+'/evosuite-branch'
        #     elif testgroup== 'EMSE18':
        #         testpath='./automatically_generated_tests/EMSE18/'+projectId+'/'+bugId+'/'
        #     commonpath = commonTestPath(testpath+'/0')
        #     if commonpath=='':
        #         print "NO TESTS!"
        #     else:
        #     #patch_command="patch  -u -i " +patch_file +" "+ original_file
        #     #os.system(patch_command)
        #         for i in range(0,10):
        #             print i
        #             original_test_file=testpath+'/'+str(i)+commonpath
        #             print original_test_file
        #             if projectId=='Lang':
        #                 target_test_path='./buggy_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy/src/test/java'
        #             if not os.path.isdir(target_test_path):
        #                 target_test_path='./buggy_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy/src/test'
        #             if projectId=='Math':
        #                 target_test_path='./buggy_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy/src/test/java'
        #             if not os.path.isdir(target_test_path):
        #                 target_test_path='./buggy_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy/src/test'
        #             if projectId=='Chart':
        #                 target_test_path='./buggy_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy/tests'
        #             if projectId=='Time':
        #                 target_test_path='./buggy_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy/src/test/java'
        #             target_test_file=target_test_path+commonpath
        #             #Add corresponding evosuite tests to target path
        #             shutil.copyfile(original_test_file, target_test_file)        
        #             os.chdir(program_path)
        #             os.system(d4jpath+'/defects4j compile')
        #             os.system(d4jpath+'/defects4j test')
        #             os.chdir('../../../')
        #             os.remove(target_test_file)
        #     for diffs in difffiles:
        #     if patchType=='correct':
        #         filepath='claimed_correct_patches/'+toolId+'/'+projectId+'/tmp.patch'
        #     else:
        #         filepath='plausible_patches/'+toolId+'/'+projectId+'/tmp.patch'
        #     f=open(filepath,"w")
        #     f.write(diffs)
        #     f.close()
        #     if patchType=='correct':
        #         tmppatch='./claimed_correct_patches/'+toolId+'/'+projectId+'/tmp.patch'
        #     else:
        #         tmppatch='./plausible/'+toolId+'/'+projectId+'/tmp.patch' 
        #     first_line = diffs.split('\n')[0]
        #     filepath=first_line.split('--- ')[1]
        #     print filepath
        #     program_path='buggy_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_buggy'
        #     original_file='./'+program_path+filepath
        #     os.system("patch -R -i " +tmppatch +" "+ original_file)
        #     os.remove(tmppatch)
