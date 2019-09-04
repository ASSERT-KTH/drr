#!/usr/bin/python
import sys, os, subprocess,fnmatch, shutil, csv, re, datetime
import time
from os import listdir
from os.path import isfile, join

def checkout(project,bugid,patch_no,filename,filepath):
    if not os.path.exists('./'+project+bugid+'b'):
        os.system('defects4j checkout -p '+project+' -v '+bugid+'b -w '+project+bugid+'b')
    os.system('cp -r '+project+bugid+'b'+' '+project+bugid+'b_bak')
    os.system('patch -u -p0 < ../patches/'+patch_no)
    os.system('mv '+project+bugid+'b '+project+bugid+'b_'+patch_no)
    os.system('mv '+project+bugid+'b_bak '+project+bugid+'b')
    
    #create patch name
    targetpath= './patchsim_incorrect/'+patch_no+'/'+project+"_"+bugid+'/'+filename
    print targetpath
    if not os.path.exists(targetpath):
        os.system('mkdir -p  '+targetpath)
    #copy from original

    os.system('cp '+'../patches/'+patch_no+'  ./patchsim_incorrect/'+patch_no+'/')
    os.system('cp '+project+bugid+'b'+filepath + '  '+ targetpath+'/')
    #rename:
    os.system('mv '+ targetpath+'/'+filename+'.java  '+  targetpath+'/'+ project+'_'+bugid+'_'+filename+'_s.java')
    os.system('cp '+project+bugid+'b_'+patch_no+filepath + '  '+ targetpath+'/')
    #rename:
    os.system('mv '+ targetpath+'/'+filename+'.java  '+  targetpath+'/'+project+'_'+bugid+'_'+filename+'_t.java')
    os.system('rm -rf  '+project+bugid+'b '+project+bugid+'b_'+patch_no)



if __name__ == '__main__':
    dir='/Users/sophie/Documents/DefectRepairing/tool/patches'
    listdirs = os.listdir(dir)
    pattern = 'Patch*'
    r = re.compile("([a-zA-Z]+)([0-9]+)")
    for f in listdirs:
        if fnmatch.fnmatch(f, pattern):
            with open(os.path.join(dir, f)) as patch:
                lines=patch.readlines()
                secondline=lines[1]
                part=secondline.split(' ')[1]
                bug=part.split('/')[0]
                buggyfile=part.split('/')[-1].split('.java')[0]
                pandb = bug[0:-1]
                m = r.match(pandb)
                project= m.group(1).replace('\n','').replace('\r','').replace(' ','')
                bugnumber = m.group(2).replace('\n','').replace('\r','').replace(' ','')
                # print buggyfile
                path = part.split('201')[0].split(bug)[1].replace('\n','').replace('\r','').replace(' ','')
                checkout(project,bugnumber,f, buggyfile,path)


