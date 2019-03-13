#!/usr/bin/python
import sys, os, subprocess,fnmatch, shutil, csv,re, datetime

def travFolder(dir,dataset,difftgenpath):

   listdirs = os.listdir(dir)
   for f in listdirs:
       pattern = 'patch*.patch'
       if os.path.isfile(os.path.join(dir, f)):
           if fnmatch.fnmatch(f, pattern):
                   filename=os.path.splitext(f)[0]
                   arraynames=filename.split("-")
                   patchId=arraynames[0]
                   projectId=arraynames[1] 
                   bugId=arraynames[2]
                   toolId=arraynames[3]
                   tmpcode=""
                   tmpOracle=""
                   deltafile=difftgenpath+"/drr/patches/"+dataset+"/"+projectId+bugId+"/"+filename+"/delta.txt"
                   oraclefile=difftgenpath+"/drr/patches/"+dataset+"/"+projectId+bugId+"/oracle.txt"
                   with open(deltafile, 'r') as rfile:
                           lines = rfile.readlines()
                           for line in lines:
                                   if line!="":
                                           if "/drr" in line:
                                                   line=line.replace("/drr",difftgenpath+"/drr")               
                                                   tmpcode=tmpcode+line
                   with open("./tmpDelta.txt", 'w') as wfile:
                           wfile.write(tmpcode)
                   
                   with open(oraclefile, 'r') as rofile:
                           lines = rofile.readlines()
                           for line in lines:
                                   if line!="":
                                            if "/drr" in line:
                                                   line=line.replace("/drr",difftgenpath+"/drr")               
                                                   tmpOracle=tmpOracle+line
                   with open("./tmpOracle.txt", 'w') as wofile:
                           wofile.write(tmpOracle)

                   script="sh run -bugid  "+patchId+projectId+bugId
                   script=script+"  -repairtool  "+toolId
                   script=script+"  -difftgendpath  "+difftgenpath
                   script=script+"  -evosuitejpath  "+difftgenpath+"/lib"
                   script=script+"  -dependjpath  "+difftgenpath+"/drr/patches/"+dataset+"/"+projectId+bugId+"/classes"
                   script=script+"  -outputdpath  "+difftgenpath+"/drr/patches/"+dataset+"/"+projectId+bugId+"/"+filename
                   script=script+"  -inputfpath  "+difftgenpath+"/tmpDelta.txt"
                   script=script+"  -oracleinputfpath  "+difftgenpath+"/tmpOracle.txt"
                   print script
                   os.system(script)

                #    if os.path.exists("./tmpDelta.txt"):
                #            os.system("rm tmpDelta.txt")
                #    if os.path.exists("./tmpOracle.txt"):
                #            os.system("rm tmpOracle.txt")

       else:
           if '.DS_Store' not in f:
                travFolder(dir+f, dataset,difftgenpath)


if __name__ == '__main__':
        #example ./runDrr.py D_correct  /Users/sophie/Documents/DiffTGen 
        dataset=sys.argv[1]
        difftgenpath=sys.argv[2]
        dir="./drr/D_correct_DS"
        if dataset=="D_correct":
                dir="./drr/D_correct_DS"
        elif dataset=="D_incorrect":
                dir="./drr/D_incorrect_DS"
        travFolder(dir,dataset, difftgenpath)

