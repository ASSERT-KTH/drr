#!/usr/bin/python
import sys, os, subprocess,fnmatch, shutil, csv,re, datetime
import time
from os import listdir
from os.path import isfile, join

def travFolder(dir,dataset,checkdataset):
   listdirs = os.listdir(dir)
   for f in listdirs:
       pattern = 'patch*.patch'
       if os.path.isfile(os.path.join(dir, f)):
           if fnmatch.fnmatch(f, pattern):
                #first temporary checkout project
                checkout_project(f,'tmp_projects','b')
                sanity_check(f,dataset,checkdataset)
                remove_project('tmp_projects')        
       else:
           if 'tmp.patch' not in f:
                travFolder(dir+'/'+f,dataset,checkdataset)


def checkout_project(file,project,bugtype):
    filename=os.path.splitext(file)[0]
    arraynames=filename.split("-")
    projectId=arraynames[1]
    bugId=arraynames[2]
    lcProjectId=projectId.decode('utf-8').lower()
    if not os.path.exists(project):
         os.system('mkdir '+project)
         os.system('mkdir '+project+'/lib')
         os.system('cp ./lib/evosuite-standalone-runtime-1.0.5.jar  '+project+'/lib/')
    if not os.path.exists(project+'/'+projectId):
        os.system('mkdir '+project+'/'+projectId)
    os.system( d4jpath+'/defects4j checkout -p '+projectId+' -v '+bugId+bugtype+' -w ./'+project+'/'+projectId+'/'+lcProjectId+'_'+bugId+'_buggy')  


def remove_project(project):
    if  os.path.exists(project):
        os.system('rm -rf '+project)

def sanity_check(file,dataset,checkdataset):
    filename=os.path.splitext(file)[0]
    #split the patch name
    arraynames=filename.split("-")
    projectId=arraynames[1]
    bugId=arraynames[2]
    toolId=arraynames[3]
    currentpath=os.path.dirname(os.path.realpath(__file__))
    #lower case of project id
    lcProjectId=projectId.decode('utf-8').lower()
    #get patch path
    patchpath=dataset+'/'+file 
    result=apply_patch(filename,patchpath,dataset,toolId,projectId,bugId,lcProjectId,'tmp_projects')
    print result
    #record the consistency result in csv file
    if checkdataset == 'consistency':
        print "done"

                         




def apply_patch(patchname, patchpath,dataset,toolId,projectId,bugId,lcProjectId,buggyProject):
    
    with open(patchpath) as f:
        difffiles=f.read().split('\n\n\n')
        for diffs in difffiles:
            # split a patch to several temporary patches in case one patch containes many fixes for different files
            filepath='./tmp.patch'
            f=open(filepath,"w")
            f.write(diffs)
            f.close()
            tmppatch='./tmp.patch'
            first_line = diffs.split('\n')[0]
            # original buggy file patch
            filepath=first_line.split('--- ')[1]
            original_file='./'+buggyProject+'/'+projectId+'/'+lcProjectId+'_'+bugId+'_buggy/'+filepath
            ####cp first
            filename=original_file.split('/')[-1]
            print filename
            filedir=original_file.split(filename)[0]
            print filedir
            # os.chdir(originalpath)
            buggyfile=filedir+'tmp.java'
            print buggyfile
            os.system("cp "+original_file+'  '+buggyfile)
            # os.chdir("/Users/sophie/Documents/defects4-repair-reloaded")
            output = "./drr-fullcontext/D_incorrect/"+patchname
            os.system("mkdir "+output)
            os.system("mkdir "+output+'/buggy')
            os.system("mkdir "+output+'/patched')
            result=os.popen("patch -u -l --fuzz=10  -i  " +tmppatch +"  "+ original_file).read()
            os.system("cp "+buggyfile+"  "+output+'/buggy/'+filename)
            os.system("cp "+original_file+"  "+output+'/patched/'+filename)
            os.system("diff -U 10000000000 "+  buggyfile+"  "+  original_file + "  > " +output+'/'+filename.split('.')[0]+'-fullcontext.diff')
            os.remove(tmppatch)
            print result
            

# ./autotest.py <patch name>  <D_correct|D_incorrect|D_unassessed> <ASE15_Evosuite|ASE15_Randoop|EMSE18_Evosuite>
if __name__ == '__main__':
    d4jpath='./defects4j'
    if command=='fullcontext':
        travFolder('./D_incorrect_DS','D_incorrect_DS',"consistency")

    
