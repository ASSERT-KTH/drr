# A Large-scale Empirical Study of Correctness andOverfitting in Defects4J Patches from Program RepairSystems

Paper under review.



### Folder Structure
 ```bash
├── DRR
│   ├── Dcorrect_init: 257 initial correct patches
│   ├── Dincorrect_init: 381 initial incorrect patches  
│ 
├── RGT
│   ├──NEW
│   ├──ASE15
│   ├──EMSE
│
├── Patches
│   
├── DiffTGen
│   ├── Results: the running result of DiffTGen  
│   ├── runDrr.py: a command to reproduce DiffTGen experiment result 
│ 
├── statistics: a folder to save all exeriment statistics
│ 
└──  drr.py: a command to perform snaity check and execute RGT tests
```


## Setup Experiment Environment

#### Checkout our project
```
git clone https://github.com/kth-tcs/defects4-repair-reloaded.git
```
#### Add submodule defects4j and checkout the commit 486e2b4
```
cd /PATH/TO/Project
git submodule add https://github.com/rjust/defects4j
cd defects4j 
git reset --hard 486e2b49d806cdd3288a64ee3c10b3a25632e991
./init.sh (before initial the Defects4J, make sure you have installed the required dependencies)
```
#### Patches

Command to have an overview information of patches. This generates a new generated csv file under the statistics folder: [patches_overview.csv](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/patches_overview.csv)
```
./drr.py patches_overview
```
Sanity Check - Patch consistency:
Command to check if a patch is patchable against the original Defects4J version of the programs. This generates a new generated csv file which is available under the statistics folder:[consistency_check.csv](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/consistency_check.csv)
```
./drr.py consistency_check
```
Sanity Check - Patch plausibility:
Command to check if the collected patches are plausible (i.g. pass all tests provided by human developers). This generates a new csv file under the statistics folder:[plausibility_check.csv](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/plausibility_check.csv)
```
./drr.py plausible_check
```

#### RGT

The [log](https://github.com/kth-tcs/defects4j-repair-reloaded/blob/master/statistics/RGT_Evosuite_Generation_Log.csv) of new generated test cases by Evosuite. The 31/3510 runs of test generation fail to generate test cases.
The [log](https://github.com/kth-tcs/defects4j-repair-reloaded/blob/master/statistics/RGT_Randoop_Generation_Log.csv) of new generated test cases by Randoop.The 1080/3510 runs of test generation fail to generate test cases.



###### Flaky tests check

Command to check if the collected RGT tests are flaky tests. This command will executed all tests against the fix version of the bugs in the file [fixbugs](https://github.com/kth-tcs/defects4j-repair-reloaded/blob/master/statistics/fixbugs.txt ) file to check. For future study, if you want to use the RGT tests, we recommend to perform flaky tests check first by updating the file [fixbugs](https://github.com/kth-tcs/defects4j-repair-reloaded/blob/master/statistics/fixbugs.txt ) and execute below command. Please be noted, even we have removed the flaky tests in our experiment running machine, more flaky tests may be present due to environment difference.

```
./drr.py flaky_tests_check
```

### How to reproduce our experiment results?


### RGT:
Command to automatically assess the correctness of a given patch with the specific test suite.This generates a new csv file under the statistics folder in the formate of Autotest_*currentdate*.csv (e.g. Autotest_2018-11-04.csv)

```
./drr.py autotest <patch_id> <dataset:D_correct|D_incorrect|D_unassessed> <tests:ASE15_Evosuite|ASE15_Randoop|EMSE18_Evosuite>
Example:./drr.py autotest patch1-Chart-1-CapGen.patch D_correct ASE15_Evosuite

```
To reproduce our experiment results, please execute the command:
```
./drr.py RQ1/RQ3/RQ4
```
![image](https://github.com/kth-tcs/defects4j-repair-reloaded/blob/master/DRR/RGT.gif)


### DiffTGen:
Before running the command, you may want to check [original DiffTGen repository](https://github.com/qixin5/DiffTGen)
```
cd DiffTGen
ant compile
./runDrr.py D_incorrect difftgen_path
```
If you want to run other patches on DiffTGen, you may want to use our script ```drr/configpatches.py``` to setup the DiffTGen required delta and oracle information. Take a look of the demo:
![image](https://github.com/kth-tcs/defects4j-repair-reloaded/blob/master/DiffTGen/DiffTgenDemo.gif)




## Credits

* For more details about Defects4J, see the original repository of the [Defects4J benchmark](https://github.com/rjust/defects4j).
* For more details about PATCH-SIM, see the original repository of the [PATCH-SIM](https://github.com/Ultimanecat/DefectRepairing).
* For more details about DiffTGen, see the original repository of the [DiffTGen](https://github.com/qixin5/DiffTGen).


