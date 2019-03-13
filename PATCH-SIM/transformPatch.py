#!/usr/bin/python
import sys, os, subprocess,fnmatch, shutil, csv,re, datetime

#This script transfers all patches from Defects4j reloaded to the some format of test sim patches


def travFolder(dir):
   listdirs = os.listdir(dir)
   for f in listdirs:
       pattern = 'patch*.patch'
       if os.path.isfile(os.path.join(dir, f)):
           if fnmatch.fnmatch(f, pattern):
               patchName=os.path.splitext(f)[0]
               print patchName
               arraynames=os.path.splitext(f)[0].split("-")   
               #arraynames ['patch1', 'Chart', '1', 'CapGen']
               patchNo=arraynames[0] 
               projectId=arraynames[1] 
               bugId=arraynames[2]
               print projectId
               print bugId
               patchcode=''
               with open(dir+'/'+f, 'r') as rfile:
                   lines = rfile.read().split('\n')
                #    print lines
                   for line in lines:
                       if "---" in line:
                           oldfirstline=line.split("---")[1].strip()
                           firstline=projectId+bugId+'b'+oldfirstline
                           print firstline
                       elif "+++" in line:
                           oldsecondline=line.split("+++")[1].strip()
                           secondline=projectId+bugId+'b_'+patchName+oldsecondline
                           print secondline
                       else:
                           patchcode+=line+'\n'
                           print patchcode
                    
               with open('./patches/'+patchName,'a') as wfile:
                   wfile.write("diff -w -r -u "+firstline+" "+secondline+'\n')
                   wfile.write("--- "+firstline+'\n')
                   wfile.write("+++ "+secondline+'\n')
                   wfile.write(patchcode)
                                  
       else:
           if 'tmp.patch' not in f:
                travFolder(dir+f)



if __name__ == '__main__':
    folderdir='./3sfix/'
    travFolder(folderdir)
