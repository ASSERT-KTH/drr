#!/usr/bin/python
# -*- coding: utf-8 -*-
# usage
# ./failing_tests.py <patch name>  <correct|plausible> <ASE15|EMSE18> <evosuite|randoop> 
# i.e. ./failing_tests.py patch1-Chart-1-CapGen.patch correct ASE15 evosuite

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

    os.system(d4jpath+'/defects4j checkout -p '+projectId+' -v '+bugId+'f -w ./fixed_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_fixed')

    if projectId=='Lang':
        target_test_path='./fixed_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_fixed/src/test/java'
        if not os.path.isdir(target_test_path):
                target_test_path='./fixed_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_fixed/src/test'
    if projectId=='Math':
        target_test_path='./fixed_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_fixed/src/test/java'
        if not os.path.isdir(target_test_path):
                target_test_path='./fixed_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_fixed/src/test'
    if projectId=='Chart':
        target_test_path='./fixed_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_fixed/tests'
    if projectId=='Time':
        target_test_path='./fixed_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_fixed/src/test/java'
    if projectId=='Closure':
        target_test_path='./fixed_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_fixed/test'
    program_path='fixed_projects/'+projectId+'/'+proj_lower_cast+'_'+bugId+'_fixed'

    ##Evosuite
    if testType=='evosuite':
        if testgroup=='ASE15':
                testpath='./automatically_generated_tests/ASE15/evosuite/'+projectId+'/'+bugId+'/'+projectId+'/evosuite-branch'
        elif testgroup== 'EMSE18':
                testpath='./automatically_generated_tests/EMSE18/'+projectId+'/'+projectId+bugId+'/'
        commonpath = commonTestPath(testpath+'/0')
        print testpath
        with open('failing_tests_emse18.csv', 'a') as csvfile:
            filewriter = csv.writer(csvfile, delimiter=',',
                                quotechar='|', quoting=csv.QUOTE_MINIMAL)
            if commonpath=='':
                print "NO TESTS!"
                filewriter.writerow([projectId, bugId,testType,0,'No Tests'])
                sys.exit()
            else:         
                 for i in range(0,30):
                        print i
                        original_test_file=testpath+'/'+str(i)+commonpath
                        print original_test_file
                        target_test_file=target_test_path+commonpath
                        print original_test_file
                        if os.path.isfile(original_test_file):
                            shutil.copyfile(original_test_file, target_test_file)        
                            os.chdir(program_path)
                            os.system(d4jpath+'/defects4j compile')
                            result=os.popen(d4jpath+'/defects4j test').read()
                            print result
                            resultlines=result.split('\n');
                            failingInfo=''
                            failingTestsNo=''
                            for line in resultlines:
                                if '::' not in line:
                                    if not line=='':
                                        if ':' in line:
                                            failingTestsNo=line.split(':')[1]
                                else:
                                    failingTestClass=line.split('::')[0]
                                    failingInfo=failingInfo+';'+line.split('::')[1]                               
                            filewriter.writerow([projectId, bugId, i,failingTestsNo, failingInfo])
                            os.chdir('../../../')
                        else:
                            filewriter.writerow([projectId, bugId, i,'No-Tests', ''])

    #Randoop
    elif testType=='randoop':
        with open('failing_tests_emse18.csv', 'a') as csvfile:
            filewriter = csv.writer(csvfile, delimiter=',',
                                quotechar='|', quoting=csv.QUOTE_MINIMAL)
            for i in range(1,11):
                print i
                os.system('tar -jxvf '+'./automatically_generated_tests/ASE15/randoop/'+projectId+'/randoop/'+str(i)+'/'+projectId+'-'+bugId+'f-randoop.'+str(i)+'.tar.bz2')
                original_test_path='./'+projectId+'-'+bugId+'f-randoop.'+str(i)
                print original_test_path
                number=countJavaFile(original_test_path)
                print number
                if number>0:
                    for j in range(0,number):
                        if os.path.isfile(original_test_path+'/RandoopTest'+str(j)+'.java'):
                            shutil.copyfile(original_test_path+'/RandoopTest'+str(j)+'.java', target_test_path+'/RandoopTest'+str(j)+'.java')
                        else:
                            number=number+1
                    #delete extracted file
                    os.system('rm -r '+projectId+'-'+bugId+'f-randoop.'+str(i))
                    os.chdir(program_path)
                    os.system(d4jpath+'/defects4j compile')
                    result=os.popen(d4jpath+'/defects4j test').read()
                    print result
                    resultlines=result.split('\n');
                    failingInfo=''
                    for line in resultlines:
                        if '::' not in line:
                            if not line=='':
                                if ':' in line:
                                    failingTestsNo=line.split(':')[1]
                                    print failingTestsNo
                                else:
                                    failingInfo=line
                        else:                     
                            failingInfo=failingInfo+';'+line
                            print failingInfo
                    filewriter.writerow([projectId, bugId, testType, i,failingTestsNo, failingInfo[1:]])
                    os.chdir('../../../')
                    for j in range(0,number):
                        if os.path.isfile(target_test_path+'/RandoopTest'+str(j)+'.java'):
                            os.remove(target_test_path+'/RandoopTest'+str(j)+'.java')
    
                else:
                    #delete extracted file
                    filewriter.writerow([projectId, bugId, testType, i,'No-Tests', ''])
                    os.system('rm -r '+projectId+'-'+bugId+'f-randoop.'+str(i))