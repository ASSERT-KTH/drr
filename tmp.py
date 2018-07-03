#!/usr/bin/python
import sys, os, subprocess,fnmatch



def travFolder(dir):
   listdirs = os.listdir(dir)
   for f in listdirs:
       pattern = '*.patch'
       if os.path.isfile(os.path.join(dir, f)):
           if fnmatch.fnmatch(f, pattern):
                os.system('./autotest.py '+f+ ' correct ASE15 evosuite fixed')
                os.system('./autotest.py '+f+ ' correct ASE15  randoop fixed')
                os.system('./autotest.py '+f+ '  correct ASE15  evosuite buggy')
                os.system('./autotest.py '+f+ '  correct ASE15 randoop buggy')
       else:
            travFolder(dir+'/'+f)

if __name__ == '__main__':
     #sys.argv[1]== 'correct' or 'plausible'      
    # sys.argv[2] refers to folderdir, for example: './plausible_patches/Nopol/Lang'
    travFolder('./claimed_correct_patches/ACS')







