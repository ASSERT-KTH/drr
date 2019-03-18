#!/usr/bin/python
import sys, os, subprocess,fnmatch, shutil, csv,re, datetime


def rmflaky():
    with open('./statistics/removeflaky2.txt') as fixbugs:
       lines=fixbugs.readlines()
       for f in lines:
           print f
           infos=f.split(',')
           projectId=infos[0]
           bugId=infos[1]
           seed=infos[2]
           failtests=infos[3]
           testpath='./generated_tests/ASE15/randoop/'+projectId+'/randoop/'+seed
           os.chdir(testpath)
           #extract
           extract = 'tar -jxvf '+projectId+'-'+bugId+'f-randoop.'+seed+'.tar.bz2'
           os.system(extract)
           os.chdir(projectId+'-'+bugId+'f-randoop.'+seed) 
           failtests=failtests.replace('\t','').replace('"','').replace('\r\n','')
           flaky=failtests.split(';')
           for flakytest in flaky:
               method=flakytest.split('(')[0]
               test=flakytest.split('(')[1]
               modified=''
               print method
               print test
               with open(test+'.java') as testfile:
                     tlines=testfile.readlines()
                     startflag=False
                     for i in range(0, len(tlines)):
                         l=tlines[i]
                         if startflag == False:
                            if 'public void '+method+'()' in l:
                                print l
                                startflag=True
                                start=i
                                modified=modified+'//'+l
                            else:
                                modified=modified+l
                         if startflag == True:
                            if i-start>0:
                                if 'public void ' not in l:
                                    modified=modified+'//'+l
                                else:
                                    modified=modified+l
                                    startflag=False

               with open(test+'.java','w') as wfile:
                   wfile.write(modified)

            #compress the target files
           os.chdir("..")
           compress = 'tar -czvf '+projectId+'-'+bugId+'f-randoop.'+seed+'.tar.bz2  ' +projectId+'-'+bugId+'f-randoop.'+seed         
           os.system(compress)
           os.system('rm -rf '+projectId+'-'+bugId+'f-randoop.'+seed)

                             
           os.chdir("../../../../../../")

        


# ./autotest.py <patch name>  <D_correct|D_incorrect|D_unassessed> <ASE15_Evosuite|ASE15_Randoop|EMSE18_Evosuite>
if __name__ == '__main__':
    rmflaky()
    
