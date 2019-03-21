# A large-scale empirical study on the correctness of Defects4 generated patches

Open research data from KTH Royal Institute of Technology. 

Paper under review.

### An overview of our experimental methodology
![alt text](https://github.com/kth-tcs/defects4j-repair-reloaded/blob/master/statistics/drr.png) 

### [Overfitting problem](https://themindsjournal.com/not-every-place-you-fit-in-is-where-you-belong/)

### Patch datasets
Originally, we collected 1286 patches from 19 different verions of repair systems.  The collected patches follow the name convention: patchNo-projectID-bugID-repairTool.patch
All patches pass the [consistency check](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/consistency_check.csv), and 40 of them fail to pass [plausible check](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/plausibility_check.csv) As a result, we obtain 1246 plausible patches, the details show as follow:

| D_correct   | D_incorrect |  D_unassessed |  sum       |
|   :-----:   |    :-----:  |    :---:      |   :---:    |
|    257      |     364     |    625        |   1246     |

Noted different tools may generate the same patch, we extract the distinct patches from above three dataset. Particularlly,  for D_correct dataset, we removed the patches that are identical to human written patches. Corresponding, we obtain three dataset with distinct patches.

| D_correct_DS   | D_incorrect_DS |  D_unassessed_DS |  sum       |
|   :-----:      |    :-----:     |    :---:         |   :---:    |
|    97          |     354        |     596            |     947     |



### Random Ground Truth (GRT) Tests
We perform three rounds of flaky tests

| Flaky tests check   | Total test cases extecuted | Failing test cases |  Execution Time    |
|   :-----:          |       :-----:              |      :---:         |           :---:    |
|[flaky_tests_check_1st](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/flaky_check_1st.csv)    |   15811452    |   391        |  1358.195 second   |
|[flaky_tests_check_2nd](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/flaky_check_2nd.csv)    |   15811061    |   10       |  1355.772 second   |
|[flaky_tests_check_3rd](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/flaky_check_3rd.csv)    |   15811051    |   0       |  1355.17 second   |


### PATCH-SIM
``
Reproducible Environment
JDK: 1.7.0_80; 
CPU: 28  Intel(R) Xeon(R) CPU E5-2690 v4 @ 2.60GHz with 14 cores
``

The results is available in [RESULT.csv](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/PATCH-SIM/source/RESULT.csv) and the [traces](https://github.com/kth-tcs/defects4-repair-reloaded/tree/master/PATCH-SIM/source/metadata)


### [DiffTGen](https://github.com/qixin5/DiffTGen)
We implement an automated way to execute DiffTGen to support the instrumented programs generation in the origial paper.


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

Command to check if a patch is patchable against the original Defects4J version of the programs. This generates a new generated csv file which is available under the statistics folder:[consistency_check.csv](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/consistency_check.csv)
```
./drr.py consistency_check
```
#### Patch plausibility

Command to check if the collected patches are plausible (i.g. pass all tests provided by human developers). This generates a new csv file under the statistics folder:[plausibility_check.csv](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/plausibility_check.csv)
```
./drr.py plausible_check
```

### Automated correctness assessment
Command to automatically assess the correctness of a given patch with the specific test suite.This generates a new csv file under the statistics folder in the formate of Autotest_*currentdate*.csv (e.g. Autotest_2018-11-04.csv)

```
./drr.py autotest <patch_id> <dataset:D_correct|D_incorrect|D_unassessed> <tests:ASE15_Evosuite|ASE15_Randoop|EMSE18_Evosuite>

Example:./drr.py autotest patch1-Chart-1-CapGen.patch D_correct ASE15_Evosuite

```




## Answer to RQ1:
| No.|            Patch          |     RGT           |  DiffTGen      |  PATCH-SIM      | Patch Source|
| :-----:|       :-----:         |    :-----:        |    :---:       |   :---:         |     :---:     |
|1|   patch1-Chart-5-Arja   |   Likely-correct      |Likely-correct   | Overfitting   |[page3](https://github.com/kth-tcs/defects4j-repair-reloaded/blob/master/statistics/source/Arja/arja-supplemental.pdf)|
|2|   patch1-Chart-12-Arja   |    Overfitting    |Likely-correct   |Likely-correct   |[page4](https://github.com/kth-tcs/defects4j-repair-reloaded/blob/master/statistics/source/Arja/arja-supplemental.pdf)|
|3|   patch1-Math-73-Arja     |    Overfitting    |Likely-correct  |Likely-correct   |[page10](https://github.com/kth-tcs/defects4j-repair-reloaded/blob/master/statistics/source/Arja/arja-supplemental.pdf)|
|4|   patch1-Math-86-Arja     |    Overfitting    |Likely-correct  |Likely-correct   |[page12](https://github.com/kth-tcs/defects4j-repair-reloaded/blob/master/statistics/source/Arja/arja-supplemental.pdf)|
|5|   patch1-Lang-43-CapGen   |    Overfitting    |Likely-correct  |Likely-correct   |[patch-no:9](https://github.com/justinwm/CapGen/blob/master/Patches/Lang/Lang_43/patch_9.txt)|
|6|   patch2-Lang-43-CapGen   |    Overfitting    |Likely-correct  |Likely-correct   |[patch-no:10](https://github.com/justinwm/CapGen/blob/master/Patches/Lang/Lang_43/patch_10.txt)|
|7|   patch1-Chart-5-Nopol2015   |    Overfitting  |Overfitting  |Likely-correct   |[paper](https://link.springer.com/article/10.1007/s10664-016-9470-4)and [patch7](https://github.com/Spirals-Team/defects4j-repair/tree/master/results/2015-august#chart-5)|
|8|   patch1-Lang-58-Nopol2015   |    Overfitting  |Overfitting  |Likely-correct   |[paper](https://link.springer.com/content/pdf/10.1007%2Fs10664-016-9470-4.pdf)and [patch26](https://github.com/Spirals-Team/defects4j-repair/tree/master/results/2015-august#lang-58)|
|9|   patch1-Math-50-Nopol2015   |    Overfitting  |Likely-correct   |Likely-correct   |[paper](https://link.springer.com/content/pdf/10.1007%2Fs10664-016-9470-4.pdf)and [patch46](https://github.com/Spirals-Team/defects4j-repair/tree/master/results/2015-august#math-50)|
|10|   patch1-Math-50-Nopol2015   |    Overfitting  |Likely-correct   |Likely-correct   |[paper](https://link.springer.com/content/pdf/10.1007%2Fs10664-016-9470-4.pdf)and [patch46](https://github.com/Spirals-Team/defects4j-repair/tree/master/results/2015-august#math-50)|
|11|   patch1-Math-73-JGenProg2015  |    Overfitting  |Likely-correct   |Overfitting   |[paper](https://link.springer.com/content/pdf/10.1007%2Fs10664-016-9470-4.pdf)and [patch54](https://github.com/Spirals-Team/defects4j-repair/tree/master/results/2015-august#math-73)|
|12|   patch1-Lang-55-SketchFix  |    Overfitting  |Likely-correct   |Overfitting   |[StopWatch.java-ca-5-2](https://github.com/anonymoususer18/sketchFix_evaluation/blob/master/eval-log/Lang_55/valid.txt)|
|13|   patch1-Lang-22-DeepRepair  |  Likely-correct  |Likely-correct   |Overfitting   |  |
|14|   patch2-Lang-51-Jaid |  Overfitting  | Overfitting   |Likely-correct   | [source](https://bitbucket.org/maxpei/jaid/wiki/Home) and [patch at line714](https://github.com/kth-tcs/defects4j-repair-reloaded/blob/master/statistics/source/Jaid/lang51_plausible.log)|
|15|   patch2-Lang-51-Jaid |  Overfitting  | Overfitting   |Likely-correct   | [source](https://bitbucket.org/maxpei/jaid/wiki/Home) and [patch at line714](https://github.com/kth-tcs/defects4j-repair-reloaded/blob/master/statistics/source/Jaid/lang51_plausible.log)|
|16|   patch2-Chart-26-Jaid |  Overfitting  | Likely-correct  |Likely-correct   | [source](https://bitbucket.org/maxpei/jaid/wiki/Home) and [patch at line714](https://github.com/kth-tcs/defects4j-repair-reloaded/blob/master/statistics/source/Jaid/lang51_plausible.log)|


## Credits

For more details about Defects4J, see the original repository of the [Defects4J benchmark](https://github.com/rjust/defects4j).



