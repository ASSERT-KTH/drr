# Patches calculator

Scripts for manually modify a file, to automatically calculate the diff, and to execute the patched version.

## Steps: 

### version 1:

./openanddiff.sh JGenProg2017 Math 70 org.apache.commons.math.analysis.solvers.BisectionSolver 30

./runtest.sh JGenProg2017 Math 70 org.apache.commons.math.analysis.solvers.BisectionSolver 30


### version 2:

./copyopenoriginal.sh JGenProg2017 Math 70 org.apache.commons.math.analysis.solvers.BisectionSolver 30

./diff.sh JGenProg2017 Math 70 org.apache.commons.math.analysis.solvers.BisectionSolver 30

./runtest.sh JGenProg2017 Math 70 org.apache.commons.math.analysis.solvers.BisectionSolver 30


## Scrips 


## copyopenoriginal.sh 

Copies and opens the original file where the patch will be applied



## calculatediff.sh

Calculates the patched between the original and the manually modified file


## runtest.sh

Runs the original and patched versions of the projects.



## TODO LIST

0) [DONE] open patch

1) [DONE] open spooned original SO 
command:

openspooned Project ID modifiedClass

Chart 25 org.jfree.data.DataUtilities


2) [DONE] open original CO
./openoriginal.sh Chart 25 org.jfree.data.DataUtilities

3) [DONE] Copy original  in d4j-reload or similar structure (this step should be swapped with step 2.)

./mcopyopenoriginal.sh Chart 25 org.jfree.data.DataUtilities 1


4) [MANUAL] Apply patch to CO 
	- find location on SO
	- apply patch on CO
	
5) [DONE] Calculate Diff
	- copy diff on D4J-reload folder or similar structure 
	- get original 
	- get copied CO' (and modified)
	- calculate diff
	
	Testing command:
	./difforiginal.sh Math 70 org.apache.commons.math.analysis.solvers.BisectionSolver 0
	
6) [DONE] Patch Verification
	- check correctness (i.e., execute D4J)


Testing command Steps 5 and 6:
./difforiginal.sh JGenProg Math 70 org.apache.commons.math.analysis.solvers.BisectionSolver 1

git diff HEAD  BisectionSolver.java 

-----


------