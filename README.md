# A large-scale empirical study on the correctness of Defects4 generated patches

Open research data from KTH Royal Institute of Technology. 

Paper under review.

## Repository structure

|--- [D_correct](https://github.com/kth-tcs/defects4-repair-reloaded/tree/master/D_correct): contains 241 claimed correct patches classified by repair systems

|--- [D_incorrect](https://github.com/kth-tcs/defects4-repair-reloaded/tree/master/D_incorrect): contains 332 claimed incorrect patches classified by repair systems

|--- [D_unassessed](https://github.com/kth-tcs/defects4-repair-reloaded/tree/master/D_unassessed): contains 636 unassessed patches classified by repair systems

|--- [generated_tests](https://github.com/kth-tcs/defects4-repair-reloaded/tree/master/generated_tests): the collection of automatically generated tests  
   * [ASE15](https://github.com/kth-tcs/defects4-repair-reloaded/tree/master/generated_tests/ASE15)
       * evosuite
       * randoop
   * [EMSE18](https://github.com/kth-tcs/defects4-repair-reloaded/tree/master/generated_tests/EMSE18)
       * evosuite
       
|--- [statistics](https://github.com/kth-tcs/defects4-repair-reloaded/tree/master/statistics): contains the all statistics of patches, consistency check, plausibility check, etc
   * [patches_overview.csv](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/patches_overview.csv)
   * [consistency_check.csv](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/consistency_check.csv)
   * [plausibility_check.csv](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/plausibility_check.csv)

|--- [drr.py](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/drr.py): contains the commands for sanity check and automatically assess patches correctness

## Tables

### Patch datasets

|         | D_correct   |D_incorrect|D_unassessed |  sum       |
| ----    |     :-----: |   :-----: |    :---:    |   :---:    |
| ACS     |     18      |     5     |     0       |   23       |
|  Arja   |     18      |    160    |     0       |   178      |
| CapGen  |     28      |     43    |     0       |   71       |
|DeepRepair|    5       |    10     |     0       |   15       |
| Elixir  |     25      |    15     |     0       |   40       |
| Jaid    |    41       |    40     |     0       |   81       |
|JGenProg2015|  5       |     5     |     0       |   10       |q
|HDRepair |    5        |     5     |     0       |   10       |
|Nopol2015|    5        |     5     |     0       |   10       | 
|SimFix   |    34       |     18    |     0       |   52       |
|SketchFix|    19       |     14    |     0       |   33       |
|SOFix    |    22       |    0      |     0       |   22       |
|ssFix    |    16       |    9      |     0       |   25       |
|Cardumen |    0        |    0      |     285     |   285      |  
|JGenProg2017|   0      |    0      |     145     |   145      |
|jKali    |    0        |    0      |     53      |   53       |
|jMutRepair|    0       |    0      |     52      |   52       |
|Nopol2017 |     0      |    0      |     101     |   101      |
|Totoal   |    241      |    332    |     636     |   1209     |

###  Patches claimed as correct while incorrect

|Patch_ID|ASE15_Evosuite|ASE15_Randoop|EMSE18_Evosuite|True Positive|Assessment|
|--------|  ------      |       ---   |    ---        |      ---    |   ---    |
|[patch1-Math-73-Arja.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/D_correct/Arja/Math/patch1-Math-73-Arja.patch)|6|0|0|X|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/Arja_Patches_Assessment.csv)|
|[patch1-Math-86-Arja.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/D_correct/Arja/Math/patch1-Math-86-Arja.patch)|0|88|0|Y|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/Arja_Patches_Assessment.csv)|
|[patch1-Lang-43-CapGen.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/D_correct/CapGen/Lang/patch1-Lang-43-CapGen.patch)|1|0|0|Y|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/CapGen_Patches_Assessment.csv)|
|[patch2-Lang-43-CapGen.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/D_correct/CapGen/Lang/patch2-Lang-43-CapGen.patch)|1|0|0|Y|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/CapGen_Patches_Assessment.csv)|
|[patch2-Lang-51-Jaid.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/D_correct/Jaid/Lang/patch2-Lang-51-Jaid.patch)|4|0|0|Y|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/Jaid_Patches_Assessment.csv)|
|[patch1-Chart-5-Nopol2015.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/D_correct/Nopol2015/Chart/patch1-Chart-5-Nopol2015.patch)|0|324|2|Y|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/Nopol2015_Patches_Assessment.csv)|
|[patch1-Lang-58-Nopol2015.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/D_correct/Nopol2015/Lang/patch1-Lang-58-Nopol2015.patch)|1|No-tests|0|Y|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/Nopol2015_Patches_Assessment.csv)|
|[patch1-Math-73-JGenProg2015.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/D_correct/JGenProg2015/Math/patch1-Math-73-JGenProg2015.patch)|9|0|No-tests|Y|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tstatistics/JGenProg2015_Patches_Assessment.csv)|
|[patch1-Lang-55-SketchFix.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/D_correct/SketchFix/Lang/patch1-Lang-55-SketchFix.patch)|1|0|0|Y|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/SOFix_Patches_Assessment.csv)|
|[patch2-Lang-55-SketchFix.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/D_correct/SketchFix/Lang/patch2-Lang-55-SketchFix.patch)|10|0|21|Y|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/SketchFix_Patches_Assessment.csv)|


## Setup Experiment Environment

#### Checkout our project
```
git clone https://github.com/kth-tcs/defects4-repair-reloaded.git
```
#### Add submodule defects4j
```
cd /PATH/TO/Project
git submodule add https://github.com/rjust/defects4j
cd defects4j 
./init.sh
cd ..
./drr.py postInit
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

## Credits

For more details about Defects4J, see the original repository of the [Defects4J benchmark](https://github.com/rjust/defects4j).



