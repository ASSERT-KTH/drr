#!/usr/bin/python
import sys, os, subprocess,fnmatch, shutil, csv,re, datetime

def travFolder(dir):
   listdirs = os.listdir(dir)
   for f in listdirs:
       pattern = 'patch*.patch'
       if os.path.isfile(os.path.join(dir, f)):
                if fnmatch.fnmatch(f, pattern):
                        print f    
                        filename=os.path.splitext(f)[0]
                        arraynames=filename.split("-")
                        projectId=arraynames[1] 
                        bugId=arraynames[2]
                        toolId=arraynames[3] 
                        bugfolder="./patches/D_correct/"+projectId+bugId
                        if not os.path.exists(bugfolder):
                                os.system("mkdir "+bugfolder) 
                        patchfolder=bugfolder+"/"+filename
                        if not os.path.exists(patchfolder):
                                os.system("mkdir "+patchfolder) 
                        #copy the patch first                       
                        shutil.copy(os.path.join(dir, f), patchfolder+"/") 
                        #create delta.txt file
                        targetfile=""
                        linenumber=""
                        sourcefile=""
                        
                        with open("./metadata.csv") as metadata:
                                lines = metadata.readlines()
                                for line in lines:
                                        data=line.split(",")
                                        if projectId==data[0]:
                                                if bugId==data[1]:
                                                        targetfile=data[2].split('/')[-1]
                                                        linenumber=data[3].replace("\n","")
                                                        sourcefile=data[2]

                        if targetfile=="":
                                print projectId+bugId+" has NO INFO!!"

                        patchlineNo=linenumber
                        addcount=0
                        minuscount=0
                        with open(os.path.join(dir, f)) as patch:
                                lines = patch.readlines()
                                line3=lines[2].split(" ")[1]
                                line3=line3.split(",")[0]
                                patchlineNo=line3.split("-")[1]
                                for l in lines:
                                        if "+"==l[0]:
                                                #ignore +++
                                                if "+" !=l[1]:
                                                #ignore comment
                                                        if "//" not in l:
                                                                addcount = addcount+1
                                        if "-"==l[0]:
                                                #ignore ---
                                                if "-" !=l[1]:
                                                        minuscount=minuscount+1

                        patchlineNo=int(patchlineNo)+3
                        ##replace
                        if addcount>0:
                                if minuscount>0:
                                        with open(patchfolder+"/delta.txt","w") as delta:
                                                delta.write("/drr"+bugfolder.split(".")[-1]+"/bug/"+targetfile+":"+linenumber+",8\n")
                                                delta.write("/drr"+patchfolder.split(".")[-1]+"/patch/"+targetfile+":"+str(patchlineNo)+",8")

                        ###add
                        if addcount>0:
                                if minuscount==0:
                                        with open(patchfolder+"/delta.txt","w") as delta:
                                                delta.write("/drr"+bugfolder.split(".")[-1]+"/bug/"+targetfile+":"+linenumber+",8\n")
                                                delta.write("null(/drr"+patchfolder.split(".")[-1]+"/patch/"+targetfile+":"+str(patchlineNo)+",8;after)")
                        
                        ###delete
                        if addcount==0:
                                if minuscount>0:
                                        with open(patchfolder+"/delta.txt","w") as delta:
                                                delta.write("null(/drr"+bugfolder.split(".")[-1]+"/bug/"+targetfile+":"+linenumber+",8;before)\n")
                                                delta.write("/drr"+patchfolder.split(".")[-1]+"/patch/"+targetfile+":"+str(patchlineNo)+",8")
                       
                       
                       
                       
                        #create oracle.txt file one for per bug!
                        with open(bugfolder+"/oracle.txt","w") as oracle:
                                oracle.write("/drr"+bugfolder.split(".")[-1]+"/fix/"+targetfile+":"+linenumber+",1\n")
                        #create fix folder
                        fixfolder=bugfolder+"/fix"
                        if not os.path.exists(fixfolder):
                                os.system("mkdir "+fixfolder)

                         #create common bug for DIFFTGen folder
                        cbugfolder=bugfolder+"/bug"
                        if not os.path.exists(cbugfolder):
                                os.system("mkdir "+cbugfolder)

                         #create patch for DIFFTGen folder
                        cpatchfolder=patchfolder+"/patch"
                        if not os.path.exists(cpatchfolder):
                                os.system("mkdir "+cpatchfolder)

                        #checkout defects4j 
                        
                        d4jfolder=bugfolder+"/defects4j"

                        
                        if not os.path.exists(d4jfolder):
                                os.system("cd  "+bugfolder)
                                os.system("mkdir "+d4jfolder)
                                os.system(d4jpath+"/defects4j checkout  -p "+projectId +"  -v "+bugId+"b  -w  "+d4jfolder+"/"+projectId+"_"+bugId+"_buggy");
                                os.system(d4jpath+"/defects4j checkout  -p "+projectId +"  -v "+bugId+"f  -w  "+d4jfolder+"/"+projectId+"_"+bugId+"_fix");


                        #copy bug file 
                        shutil.copy(d4jfolder+"/"+projectId+"_"+bugId+"_buggy/"+sourcefile, cbugfolder+"/") 
                        #copy patch file
                        shutil.copy(d4jfolder+"/"+projectId+"_"+bugId+"_buggy/"+sourcefile, cpatchfolder+"/") 
                        #copy fix file
                        shutil.copy(d4jfolder+"/"+projectId+"_"+bugId+"_fix/"+sourcefile, fixfolder+"/") 
                        #apply patch to patchfile
                        os.system("patch -u -l --fuzz=10  -i   " +patchfolder+"/"+f +"   "+ cpatchfolder+"/"+targetfile)
                        
                        #compile the buggy file and keep the build classess
                        os.chdir(d4jfolder+"/"+projectId+"_"+bugId+"_buggy")
                        os.system(d4jpath+"/defects4j compile ")
                        os.chdir("../../../../../")
                        # os.chdir("/Users/sophie/Documents/DiffTGen/drr")
                        if not os.path.exists(bugfolder+"/classes"):
                                os.system("mkdir "+bugfolder+"/classes")                       

                        if os.path.exists(d4jfolder+"/"+projectId+"_"+bugId+"_buggy/target"):
                                os.system("cp -rf "+d4jfolder+"/"+projectId+"_"+bugId+"_buggy/target/classes/  "+bugfolder+"/classes") 
                       
                        elif os.path.exists(d4jfolder+"/"+projectId+"_"+bugId+"_buggy/build/classes"):
                                os.system("cp -rf "+d4jfolder+"/"+projectId+"_"+bugId+"_buggy/build/classes/  "+ bugfolder+"/classes") 

                        elif os.path.exists(d4jfolder+"/"+projectId+"_"+bugId+"_buggy/build"):
                                os.system("cp -rf "+d4jfolder+"/"+projectId+"_"+bugId+"_buggy/build/  "+ bugfolder+"/classes") 

                        #delete the defects4j files
                        if os.path.exists(d4jfolder):
                                os.system("rm -rf  "+d4jfolder)




                        

       else:
           if '.DS_Store' not in f:
                travFolder(dir+'/'+f)

                
if __name__ == '__main__':
        #change to your defects4j patch
        d4jpath="/Users/sophie/Documents/defects4j/framework/bin"
        travFolder("./D_correct_DS")

