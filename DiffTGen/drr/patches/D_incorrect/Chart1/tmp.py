#!/usr/bin/python
import sys, os, subprocess,fnmatch, shutil, csv,re, datetime

def travFolder(dir):
   listdirs = os.listdir(dir)
   for f in listdirs:
       pattern = 'patch*.patch'
       if os.path.isfile(os.path.join(dir, f)):
               if fnmatch.fnmatch(f, pattern):
                       patchpath=os.path.join(dir, f)
                       with open(patchpath) as file:
                                print patchpath
                                lines = file.readlines()
                                firstline= lines[0].split("--- /")[1]
                                firstline= firstline.replace('\n','')
                                firstline= firstline.replace('\t','')
                                filename=firstline.rsplit("/",1)[1]
                                print filename
                                #create bug folder and copy bug file
                                currentdir= os.path.dirname(patchpath)
                                if not os.path.exists(currentdir+"/bug"):
                                       os.system('mkdir '+currentdir+"/bug")
                                shutil.copyfile('./tmp/chart-1/'+firstline, currentdir+"/bug/"+filename)

                                if not os.path.exists(currentdir+"/patch"):
                                       os.system('mkdir '+currentdir+"/patch")
                                shutil.copyfile('./tmp/chart-1/'+firstline, currentdir+"/patch/"+filename)
                                result=os.popen("patch -u -l --fuzz=10  -i  " +patchpath +"  "+ currentdir+"/patch/"+filename).read()
                                print result
                                # shutil.copyfile('./tmp/chart-1/'+firstline, currentdir+"/patch/"+filename)


                                # if not os.path.exists(currentdir+"/patch"):
                                #        os.system('mkdir '+currentdir+"/patch")
                                # os.system( d4jpath+'/defects4j checkout -p '+projectId+' -v '+bugId+'b -w ./tmp/'chart1')       
                                # result=os.popen("patch -u -l --fuzz=10  -i  " +patchpath +"  "+ './tmp/chart-1/'+firstline).read()
                                # shutil.copyfile('./tmp/chart-1/'+firstline, currentdir+"/patch/"+filename)

                                


                                # for line in lines:
                                #       print line

        
       else:
               travFolder(dir+'/'+f)


if __name__ == '__main__':
        currentpath=os.path.dirname(os.path.realpath(__file__))
        travFolder("./")