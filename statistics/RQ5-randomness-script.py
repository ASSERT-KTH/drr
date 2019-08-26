#!/usr/bin/python
import sys, os, subprocess,fnmatch, shutil, csv, re, datetime, random
import time
from os import listdir
from os.path import isfile, join


def shuffleSeeds(targetnumber,filepath,reportname):
    numberlist=range(1,31)
    random.shuffle(numberlist)
    patchlist=[]
    percent80=round(targetnumber*0.8)
    numfor80=''
    percent85=round(targetnumber*0.85)
    numfor85=''
    percent90=round(targetnumber*0.9)
    numfor90=''
    percent95=round(targetnumber*0.95)
    numfor95=''
    percent100=round(targetnumber)
    numfor100=''
    for i in range(0,30):
        # print totalseeds
        targetseed=numberlist[i]
        with open(filepath) as resultfile:
            lines=resultfile.readlines()
            for k in range(0,len(lines)):
                line=lines[k]
                infos=line.split(',')
                patchname=infos[0]
                currseed=infos[2]
                failtestnumber=infos[3].replace('\n','').replace('\r','')            
                if int(failtestnumber) > 0 and int(currseed) == int(targetseed) :
                    if patchname not in patchlist:
                        patchlist.append(patchname) 
                        # print  len(patchlist)                         
                        if len(patchlist) > int(percent80) and numfor80=='':
                            numfor80=i
                        elif len(patchlist) > int(percent85) and numfor85=='':
                            numfor85=i
                        elif len(patchlist) > int(percent90) and numfor90=='':
                            numfor90=i
                        elif len(patchlist) > int(percent95) and numfor95=='':
                            numfor95=i
                        elif len(patchlist) == int(percent100) and numfor100=='':
                            numfor100=i

    with open('./rq5-'+reportname+'.csv','a') as statistics:     
        filewriter = csv.writer(statistics, delimiter=',',
                                quotechar='|', quoting=csv.QUOTE_MINIMAL) 

        filewriter.writerow([numfor80, numfor85, numfor90, numfor95, numfor100 ])          
        

if __name__ == '__main__':
    for i in range(0,1000):
        #evosuite
        shuffleSeeds(248,'./RQ5-Evosuite_Raw_Statistics.txt',reportname)
        #randoop
        shuffleSeeds(118,'RQ5-Randoop_Raw_Statistics.csv',reportname)
   
