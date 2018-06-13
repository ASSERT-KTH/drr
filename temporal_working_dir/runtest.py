#!/usr/bin/python
import sys, os, subprocess,fnmatch


rootpath=os.path.dirname(os.path.dirname(os.path.realpath(__file__)))
d4jpath=rootpath+'/defects4j/framework/bin'
print("Defect4jPath {}".format(d4jpath))


def travFolder(dir):
	print("--{}".format(dir))
	listdirs = os.listdir(dir)
	for f in listdirs:
	   pattern = '*.patch'
	   if os.path.isfile(os.path.join(dir, f)):
		   if fnmatch.fnmatch(f, pattern):
				checkValidity(dir, f)

	   else:
			travFolder(dir+'/'+f)




def checkValidity(dir, file):
	print file
	filepath = os.path.join(dir, file)
	filename=os.path.splitext(file)[0]
	arraynames=filename.split("-")
	# filename[0] patch number	 
	# filename[1]  project name, i.e., Lang, Chart...
	# filename[2]  bug id
	# filename[3]  repair tool name, i.e. Dynamoth   
	print("{} {} {} {} ".format(arraynames[0],arraynames[1],arraynames[2],arraynames[3]))
  	proj_lower_cast=arraynames[1].decode('utf-8').lower()

	with open(filepath) as f:
		print("***************\nopen {}".format(f))
		key = ("{} {} {} ".format(arraynames[1], arraynames[2], arraynames[0]))
		if analyze(key):
				print("Analyzed {}".format(key))
				return	
			
		first_line = f.readline()
		if not isNotEmpty(first_line):
			return
		filepathline=first_line.split('--- ')[1]
		names=first_line.split('/')
		target_file=names[len(names)-1]
		print("path {}".format(target_file))
  	
  		##
  		print "**** "+filename+" original test result: "
		program_path=os.path.join(rootpath ,'buggy_projects/'+arraynames[1]+'/'+proj_lower_cast+'_'+arraynames[2]+'_buggy')
		original_file=program_path+filepathline
		print("ORIGINAL VERIFICATION: Analyzing {}".format(program_path))
		os.chdir(program_path)
		os.system("git checkout .")
		os.system(d4jpath+'/defects4j compile')
		#os.system(d4jpath+'/defects4j test')
		proc = subprocess.Popen((d4jpath+'/defects4j test').split(' '), stdout=subprocess.PIPE)
       # os.chdir('../../../')
		nrfailingorig = getFailing(proc)
  	
		os.chdir(rootpath)
		patch_file=filepath
		#patching file, compile and test it
		print "*** Test result after applying patches: {} to {}".format(patch_file,original_file) 
		patch_command="patch  -u -i " +patch_file +" "+ original_file
		os.system(patch_command)
		os.chdir(program_path)
		print("PATCHED VERIFICATION: Analyzing {}".format(program_path))
		os.system(d4jpath+'/defects4j compile')
		#os.system(d4jpath+'/defects4j test')
		proc = subprocess.Popen((d4jpath+'/defects4j test').split(' '), stdout=subprocess.PIPE)
       # os.chdir('../../../')
		nrfailingpatched = getFailing(proc)
		
		result = ("{} {} {} : failings {}: original {} vs patched {} ".format(arraynames[1], arraynames[2], arraynames[0], (nrfailingorig>nrfailingpatched), nrfailingorig,nrfailingpatched))
		print(result)
		
		#reverting patched file
		print("Reverting path at: {}".format(program_path))
		os.system("patch -R -i " +patch_file +" "+ original_file)
		os.chdir(program_path)
		os.system("git checkout .")
		outputfile.write(result+"\n")
		outputfile.flush()
		
def isNotEmpty(s):
    return bool(s and s.strip())		

def analyze(key):
	for line in analyzed:
  		  	if line.rstrip().startswith(key):
				return True
	return False
	

def readAnalyzer(filepath):
	analyzed = []
	if not os.path.exists(filepath):
		return []
	with open (filepath, mode='r', buffering=-1) as fp:
	#with open(filepath, "r") as fp:  
		line = fp.readline()
		print("--->"+line)
		while line:
			line = fp.readline()
  		  	analyzed.append(line.rstrip())
	fp.close()
	return analyzed

	
def getFailing(proc):
	for line in iter(proc.stdout.readline,''):
   			print "--->"+line.rstrip()
   			if  line.rstrip().startswith("Failing tests:"): 
   					flst =  line.rstrip().replace("Failing tests:",  "")
  					nrfail = int(flst)
  					return nrfail

outputfile = None 
analyzed = []
if __name__ == '__main__':
	analyzed = readAnalyzer(os.path.dirname(os.path.realpath(__file__))+ "/output.txt")
	outputfile = open(os.path.dirname(os.path.realpath(__file__))+ "/output.txt", "a+")
	folderdir=sys.argv[1]
	travFolder(folderdir)
	outputfile.close()

