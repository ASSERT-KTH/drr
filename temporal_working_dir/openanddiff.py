#!/usr/bin/python
import sys, os, subprocess


if __name__ == '__main__':
	
	patchdir=sys.argv[1]
	approach=sys.argv[2]
	project=sys.argv[3]
	bugid=sys.argv[4]
	patchid=sys.argv[5]
	print("patch {}, approach {}, project {}, bugid {}, patchid {} ".format(patchdir,approach, project,bugid,patchid  ))
	currentpath=os.path.dirname(os.path.realpath(__file__))
	
	
	patchpath=os.path.join(patchdir, project, project+bugid, "patch"+patchid+".txt") 

	with open(patchpath) as f:
		print("patch patch: {} ".format(patchpath))
		first_line = f.readline()
		filepath=first_line.split('--- ')[1]
		names=filepath.replace("/original", "").split(".java")[0]
		
		##open the patch file
		commandopen="open {}".format(patchpath)
		print("open patch file ".format(commandopen))
		os.system(commandopen)

		##launch the open and diff
		#JGenProg2017 Math 28 /org/apache/commons/math3/optimization/linear/SimplexSolver 5
		command="./openanddiff.sh {} {} {} {} {}".format(approach, project,  bugid, names, patchid)
		print("running command"+command)
		os.system(command)

	#	os.chdir('../../../')
	   
	



