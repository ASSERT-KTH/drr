#!/usr/bin/python
import sys, os, subprocess,fnmatch,csv,re



if __name__ == '__main__':
   listdirs = os.listdir('./patches')
   currentpath=os.path.dirname(os.path.realpath(__file__))
   r = re.compile("([a-zA-Z]+)([0-9]+)")
   for f in listdirs:
        pattern = 'Patch*'
        if fnmatch.fnmatch(f, pattern):
           print f
           with open(currentpath+'/patches/'+f) as file:
               firstline = file.readline()
               projectandbug=firstline.split()[4].split('/')[0]
               m = r.match(projectandbug)
               project= m.group(1)
               bug= m.group(2)
               os.chdir('source') 
               os.system('python3 run.py '+project+'  '+bug+'  '+f) 
               os.chdir('..') 
   