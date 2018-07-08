#!/usr/bin/python
# -*- coding: utf-8 -*-
# usage
# ./failing_tests.py <patch name>  <correct|plausible> <ASE15|EMSE18> <evosuite|randoop> 
# i.e. ./failing_tests.py patch1-Chart-1-CapGen.patch correct ASE15 evosuite

import sys, os, subprocess,fnmatch, shutil, csv,re

def findpath(path):
    for root, dirs, files in os.walk(path, topdown=False):
        for name in files:
            pattern = '*Test.java'
            if fnmatch.fnmatch(name, pattern):
                return os.path.join(root, name).split(path)[1]
    return ''

if __name__ == '__main__':
     with open('failing_ase15_evosuite_tests.csv', 'rb') as csvfile:
        spamreader = csv.reader(csvfile, delimiter=',', quotechar='|')
        for row in spamreader:          
            projectId=row[0]
            bugId=row[1]
            seedId=row[2]
            evosuite_path='./automatically_generated_tests/ASE15/evosuite/'+projectId+'/'+bugId+'/'+projectId+'/evosuite-branch'+'/'+seedId
            file_path=evosuite_path+findpath(evosuite_path)
            fail_tests=row[4]
            ftests=fail_tests.split(';')
            for test in ftests:
                if test != '':
                    if '-' not in test:
                        with open(file_path) as f:
                            print test
                            originalfile=f.read()
                            testmethods= originalfile.split('\n\n')
                            for method in testmethods:
                                if '@Test' in method:
                                    if test+'()' in method:
                                        newmethod =method.replace('@Test','//@Test')
                                        print newmethod
                                        originalfile=originalfile.replace(method, newmethod)
                                        print originalfile
                        with open(file_path,'w') as fw:
                            fw.write(originalfile)
                                        
    