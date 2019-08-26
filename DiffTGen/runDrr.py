#!/usr/bin/python
import sys, os, subprocess,fnmatch, shutil, csv,re, datetime

def travFolder(dir,difftgenpath):

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
                   deltafile=difftgenpath+"/drr/reproducible/"+projectId+bugId+"/"+filename+"/delta.txt"
                   origoraclepath=difftgenpath+"/drr/reproducible/"+projectId+bugId+"/"+filename+"/oracle.txt"
                   commonoracle=difftgenpath+"/drr/reproducible/"+projectId+bugId+"/oracle.txt"
                   if os.path.exists(origoraclepath):
                           oraclefile=origoraclepath
                   else:
                           oraclefile=commonoracle

                   with open(deltafile, 'r') as rfile:
                           lines = rfile.readlines()
                           for line in lines:
                                   if line!="":
                                           if "/drr" in line:
                                                   line=line.replace("/drr",difftgenpath+"/drr").replace('/patches/D_incorrect','/reproducible')              
                                                   tmpcode=tmpcode+line
                   with open("./tmpDelta.txt", 'w') as wfile:
                           wfile.write(tmpcode)
                   
                   with open(oraclefile, 'r') as rofile:
                           lines = rofile.readlines()
                           for line in lines:
                                   if line!="":
                                            if "/drr" in line:
                                                   line=line.replace("/drr",difftgenpath+"/drr").replace('/patches/D_incorrect','/reproducible')               
                                                   tmpOracle=tmpOracle+line
                   with open("./tmpOracle.txt", 'w') as wofile:
                           wofile.write(tmpOracle)

                   script="sh run -bugid  "+patchId+projectId+bugId
                   script=script+"  -repairtool  "+toolId
                   script=script+"  -difftgendpath  "+difftgenpath
                   script=script+"  -evosuitejpath  "+difftgenpath+"/lib"
                   script=script+"  -dependjpath  "+difftgenpath+"/drr/reproducible/"+projectId+bugId+"/classes"
                   script=script+"  -outputdpath  "+difftgenpath+"/drr/reproducible/"+projectId+bugId+"/"+filename
                   script=script+"  -inputfpath  "+difftgenpath+"/tmpDelta.txt"
                   script=script+"  -oracleinputfpath  "+difftgenpath+"/tmpOracle.txt"
                   print script
                   os.system('gtimeout 3600 '+script)
              

       else:
           if '.DS_Store' not in f:
                travFolder(dir+f, dataset,difftgenpath)


if __name__ == '__main__':
        #example ./runDrr.py D_correct  /Users/sophie/Documents/DiffTGen 
        dataset=sys.argv[1]
        difftgenpath=sys.argv[2]
        dir="./drr/D_correct_DS"
        if dataset=="all":
                dir="./drr/all"
        elif dataset=="Demo":
                dir="./drr/demo"
        travFolder(dir,difftgenpath)

