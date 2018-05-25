#!/usr/bin/python
import sys, os, subprocess

# checkout buggy Chart projects follow the format /defects4j/Chart/chart_$vid_buggy 

def clonegit():
    os.system("git clone https://github.com/rjust/defects4j.git") 
    os.chdir(defects4j) 
    subprocess.call(['./init.sh'])
  

def exportpath():
    currentpath=os.path.dirname(os.path.realpath(__file__))
    d4jpath=currentpath+'/defects4j/framework/bin'
    os.environ["PATH"]+=os.pathsep+d4jpath



def chart():
    if not os.path.isdir("buggy_projects/Chart"):
        os.mkdir("buggy_projects/Chart")
    for k in range(1,26):          
        os.system('defects4j checkout -p Chart -v '+str(k)+'b -w ./buggy_projects/Chart/chart_'+str(k)+'_buggy')



# checkout buggy Closure projects follow the format /defects4j/Closure/closure_$vid_buggy 
def closure():
    if not os.path.isdir("buggy_projects/Closure"):
        os.mkdir("buggy_projects/Closure")
    for k in range(1,133):
        os.system('defects4j checkout -p Closure -v '+str(k)+'b -w ./buggy_projects/Closure/closure_'+str(k)+'_buggy')


# checkout buggy Lang projects follow the format /defects4j/Lang/lang_$vid_buggy

def lang():
    if not os.path.isdir("buggy_projects/Lang"):
        os.mkdir("buggy_projects/Lang")
    for k in range(1,65):
        os.system('defects4j checkout -p Lang -v '+str(k)+'b -w ./buggy_projects/Lang/lang_'+str(k)+'_buggy')


# checkout buggy Math projects follow the format /defects4j/Math/math_$vid_buggy 
def math():
    if not os.path.isdir("buggy_projects/Math"):
        os.mkdir("buggy_projects/Math")
    for k in range(1,106):
        os.system('defects4j checkout -p Math -v '+str(k)+'b -w ./buggy_projects/Math/math_'+str(k)+'_buggy')

# checkout buggy Mockito projects follow the format /defects4j/Mockito/mockito_$vid_buggy 
def mockito():
    if not os.path.isdir("buggy_projects/Mockito"):
        os.mkdir("buggy_projects/Mockito")
    for k in range(1,38):
       os.system('defects4j checkout -p Mockito -v '+str(k)+'b -w ./buggy_projects/Mockito/mockito_'+str(k)+'_buggy')


# checkout buggy Time projects follow the format /defects4j/Time/time_$vid_buggy 
def timep():
    if not os.path.isdir("buggy_projects/Time"):
        os.mkdir("buggy_projects/Time")
    for k in range(1,27):
         os.system('defects4j checkout -p Time -v '+str(k)+'b -w ./buggy_projects/Time/time_'+str(k)+'_buggy')



if __name__ == '__main__':
    if sys.argv[1]== 'defects4j':
        clonegit()
    elif sys.argv[1]== 'project':
        if sys.argv[2]== 'Chart':
            exportpath()
            chart()
        elif sys.argv[2]== 'Closure':
            exportpath()
            closure()
        elif sys.argv[2]== 'Lang':
            exportpath()
            lang()
        elif sys.argv[2]== 'Math':
            exportpath()
            math()
        elif sys.argv[2]== 'Mockito':
            exportpath()
            mockito()
        elif sys.argv[2]== 'Time':
            exportpath()
            time()
        else:
            print 'Incorrect parameters'
    else:
        print 'Incorrect parameters'



