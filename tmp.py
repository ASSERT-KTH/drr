#!/usr/bin/python
import sys, os, subprocess,fnmatch,csv



def travFolder(dir):
   listdirs = os.listdir(dir)
   for f in listdirs:
       pattern = '*.patch'
       if os.path.isfile(os.path.join(dir, f)):
           if fnmatch.fnmatch(f, pattern):
                # os.system('./autotest.py '+f+ ' plausible ASE15 evosuite fixed')
                # os.system('./autotest.py '+f+ '  plausible ASE15  evosuite buggy')
                # os.system('./autotest.py '+f+ ' correct ASE15  randoop fixed')               
                # os.system('./autotest.py '+f+ '  correct ASE15 randoop buggy')
                filename=os.path.splitext(f)[0]
                arraynames=filename.split("-")
                projectId=arraynames[1] 
                bugId=arraynames[2]
                toolId=arraynames[3]
                with open('patches_line1.csv', 'a') as csvfile:
                    filewriter = csv.writer(csvfile, delimiter=',',
                                quotechar='|', quoting=csv.QUOTE_MINIMAL)
                    #https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/claimed_correct_patches/ACS/Chart/patch1-Chart-14-ACS.patch
                    link='https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/claimed_correct_patches/'+toolId+'/'+projectId+'/'+f
                    name='click for patch'
                    hylink='=HYPERLINK(\"'+link+'\";\"'+name+'\")'
                    
                    patchpath='claimed_correct_patches/'+toolId+'/'+projectId+'/'+f 
                    addcount=0
                    minuscount=0
                    with open(patchpath) as file:
                        
                        print f
                        lines = file.readlines()
                        for l in lines:
                            if "+"==l.split(" ")[0]:
                                print l
                                addcount = addcount+1
                            if "-"==l.split(" ")[0]:
                                minuscount=minuscount+1
                        filewriter.writerow([projectId+bugId,toolId,f,'plausible patch',hylink,addcount,minuscount])



       else:
            travFolder(dir+'/'+f)

if __name__ == '__main__':
     #sys.argv[1]== 'correct' or 'plausible'      
    # sys.argv[2] refers to folderdir, for example: './plausible_patches/Nopol/Lang'
    travFolder('./claimed_correct_patches/')







