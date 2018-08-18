#!/usr/bin/python
import sys, os, subprocess,fnmatch,csv



def travFolder(dir):
   listdirs = os.listdir(dir)
   for f in listdirs:
       pattern = 'patch*.patch'
       if os.path.isfile(os.path.join(dir, f)):
           if fnmatch.fnmatch(f, pattern):
                os.system('./autotest.py '+f+ '  correct ICSE18 test-sim buggy')
          


       else:
            travFolder(dir+'/'+f)

if __name__ == '__main__':
    
    travFolder('./claimed_correct_patches/SimFix')




    