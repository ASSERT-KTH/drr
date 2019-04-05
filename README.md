# A Large-scale Empirical Study of Correctness andOverfitting in Defects4J Patches from Program RepairSystems

Paper under review.



### Patch datasets
 ```bash
├── DRR
│   ├── D_correct_init: 256 initial correct patches
│   ├── D_incorrect_init: 366 initial incorrect patches
│   ├── D_unassessed_init: 625 initial unassessed patches from 5 repair systems
├──drr-fullcontext: diff files in full context format
├── D_correct_DS:97 distinct correct patches
├── D_incorrect_DS:353 distinct incorrect patches
├── PATCH-SIM
│   ├── traces
│   ├── source/metadata: generated result
│   ├── patches: DRR patches in PATCH-SIM required format
│   ├── runAll.py: a command to reproduce PATCH-SIM experiment result
│   ├── ...
├── DiffTGen
│   ├── drr
│   │   ├── configpatches.py: a command to setup DiffTGen required delta/oracle information
│   │   ├── patches
│   │    ├── D_incorrect: experiment data for faulty/patched/target programs and test cases
│   │   
│   ├── runDrr.py:  a command to reproduce DiffTGen experiment result
│   
├── statistics: a folder to save all exeriment results
├── drr.py: a command to run RGT tests/patch overview information/flaky tests check/consistency check/plausibility check
├── README.md
└── .gitignore
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
```
#### Overview information about patches

Command to have an overview information of patches. This generates a new generated csv file under the statistics folder: [patches_overview.csv](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/patches_overview.csv)
```
./drr.py patches_overview
```
#### Patch consistency

Command to check if a patch is patchable against the original Defects4J version of the programs. This generates a new generated csv file which is available under the statistics folder:[consistency_check.csv](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/consistency_check.csv)
```
./drr.py consistency_check
```
#### Patch plausibility

Command to check if the collected patches are plausible (i.g. pass all tests provided by human developers). This generates a new csv file under the statistics folder:[plausibility_check.csv](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/plausibility_check.csv)
```
./drr.py plausible_check
```


### How to reproduce our experiment results?


### RGT:
Command to automatically assess the correctness of a given patch with the specific test suite.This generates a new csv file under the statistics folder in the formate of Autotest_*currentdate*.csv (e.g. Autotest_2018-11-04.csv)

```
./drr.py autotest <patch_id> <dataset:D_correct|D_incorrect|D_unassessed> <tests:ASE15_Evosuite|ASE15_Randoop|EMSE18_Evosuite>

Example:./drr.py autotest patch1-Chart-1-CapGen.patch D_correct ASE15_Evosuite

```
### PATCH-SIM:
Before running the command, you may want to check [original PATCH-SIM repository](https://github.com/Ultimanecat/DefectRepairing) to set up an environment and install dependencies.
we set a timeout as 90 minutes for running DRR patches, please be noted some patches may running out of the timeout in a high-performance machine since the similarity comparison is a time-consuming process. The traces and result are provided in the responding folder inside PATCH-SIM.
```
cd PATCH-SIM
./runAll.py
```
If you want to run other patches on PATCH-SIM, you may want to use our script ```transformPatch.py``` to transform the patch to  PATCH-SIM required format.
### DiffTGen:
Before running the command, you may want to check [original DiffTGen repository](https://github.com/qixin5/DiffTGen)
```
cd DiffTGen
ant compile
./runDrr.py D_incorrect difftgen_path
```
If you want to run other patches on DiffTGen, you may want to use our script ```drr/configpatches.py``` to setup the DiffTGen required delta and oracle information. Take a look of the demo:
![image](https://github.com/kth-tcs/defects4j-repair-reloaded/blob/master/DiffTGen/DiffTgenDemo.gif)



## Original source to RQ1:
| No.|            Patch          |     RGT           |  DiffTGen      |  PATCH-SIM      | Patch Source|
| :-----:|       :-----:         |    :-----:        |    :---:       |   :---:         |     :---:     |
|1|   patch1-Chart-5-Arja   |   Likely-correct      |Likely-correct   | Overfitting   |[page3](https://github.com/kth-tcs/defects4j-repair-reloaded/blob/master/statistics/source/Arja/arja-supplemental.pdf)|
|2|   patch1-Chart-12-Arja   |    Overfitting    |Likely-correct   |Likely-correct   |[page4](https://github.com/kth-tcs/defects4j-repair-reloaded/blob/master/statistics/source/Arja/arja-supplemental.pdf)|
|3|   patch1-Math-73-Arja     |    Overfitting    |Likely-correct  |Likely-correct   |[page10](https://github.com/kth-tcs/defects4j-repair-reloaded/blob/master/statistics/source/Arja/arja-supplemental.pdf)|
|4|   patch1-Math-86-Arja     |    Overfitting    |Likely-correct  |Likely-correct   |[page12](https://github.com/kth-tcs/defects4j-repair-reloaded/blob/master/statistics/source/Arja/arja-supplemental.pdf)|
|5|   patch1-Lang-43-CapGen   |    Overfitting    |Likely-correct  |Likely-correct   |[patch9](https://github.com/justinwm/CapGen/blob/master/Patches/Lang/Lang_43/patch_9.txt)|
|6|   patch2-Lang-43-CapGen   |    Overfitting    |Likely-correct  |Likely-correct   |[patch10](https://github.com/justinwm/CapGen/blob/master/Patches/Lang/Lang_43/patch_10.txt)|
|7|   patch1-Chart-5-Nopol2015   |    Overfitting  |Overfitting  |Likely-correct   |[paper](https://link.springer.com/article/10.1007/s10664-016-9470-4)and [patch7](https://github.com/Spirals-Team/defects4j-repair/tree/master/results/2015-august#chart-5)|
|8|   patch1-Lang-58-Nopol2015   |    Overfitting  |Overfitting  |Likely-correct   |[paper](https://link.springer.com/content/pdf/10.1007%2Fs10664-016-9470-4.pdf)and [patch26](https://github.com/Spirals-Team/defects4j-repair/tree/master/results/2015-august#lang-58)|
|9|   patch1-Math-50-Nopol2015   |    Overfitting  |Likely-correct   |Likely-correct   |[paper](https://link.springer.com/content/pdf/10.1007%2Fs10664-016-9470-4.pdf)and [patch46](https://github.com/Spirals-Team/defects4j-repair/tree/master/results/2015-august#math-50)|
|10|   patch1-Math-73-JGenProg2015  |    Overfitting  |Likely-correct   |Overfitting   |[paper](https://link.springer.com/content/pdf/10.1007%2Fs10664-016-9470-4.pdf)and [patch54](https://github.com/Spirals-Team/defects4j-repair/tree/master/results/2015-august#math-73)|
|11|   patch1-Lang-55-SketchFix  |    Overfitting  |Likely-correct   |Overfitting   |[patch](https://github.com/anonymoususer18/sketchFix_evaluation/blob/master/eval-log/Lang_55/valid.txt)|
|12|   patch1-Lang-22-DeepRepair  |  Likely-correct  |Likely-correct   |Overfitting   | asked by email |
|13|   patch2-Lang-51-Jaid |  Overfitting  | Overfitting   |Likely-correct   | [source](https://bitbucket.org/maxpei/jaid/wiki/Home) and [patch at line714](https://github.com/kth-tcs/defects4j-repair-reloaded/blob/master/statistics/source/Jaid/lang51_plausible.log)|
|14|   patch1-Lang-27-SimFix |  Overfitting  | Likely-correct  |Likely-correct   | [patch](https://github.com/xgdsmileboy/SimFix/blob/master/final/result/patch/lang/27/0/1_NumberUtils.java)|
|15|   patch1-Lang-41-SimFix |  Overfitting  | Likely-correct  |Likely-correct   | [patch](https://github.com/xgdsmileboy/SimFix/tree/master/final/result/patch/lang/41)|
|16|   patch1-Math-93-ACS |  Overfitting  | Likely-correct  |Likely-correct   | [patch](https://github.com/Adobee/ACS/blob/master/patch/ACS/Math93/src/java/org/apache/commons/math/util/MathUtils.java)|


## Credits

For more details about Defects4J, see the original repository of the [Defects4J benchmark](https://github.com/rjust/defects4j).
For more details about PATCH-SIM, see the original repository of the [Defects4J benchmark](https://github.com/Ultimanecat/DefectRepairing).
For more details about DiffTGen, see the original repository of the [Defects4J benchmark](https://github.com/qixin5/DiffTGen).


