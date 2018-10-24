## A large-scale empirical study on the correctness of Defects4 generated patches

Open research data from KTH Royal Institute of Technology. 

Paper under review.

### Repository structure

```
.
├── D_correct: contains 241 claimed correct patches classified by repair systems
|   
├── D_incorrect: contains 332 claimed incorrect patches classified by repair systems
|   
├── D_unassess: contains 636 unassessed patches classified by repair systems
|   
├── defects4j: core of Defects4J benchmark for checking out the original buggy projects
|   
├── generately_tests: the collection of automatically generated tests
|      ├── ASE15
|      |     ├── evosuite
|      |     └── randoop
|      └── EMSE18
|   
├── statistics: contains the all staticstics of patches, consistency check, plausibility check, etc
|      └── Patches_Assessment_Result
|   
└── drr.py: contains the commands for sanity check and automatically assess patches correctness

```

* `defects4j` contains 395 bugs from the six open-source projects:JFreeChart (Chart), Closure compiler (Closure), Apache commons-lang (Lang), Apache commons-math (Math), Mockito (Mockito), Joda-Time (Time). 
For the detail, please reference to the original repository of [Defects4J benchmark](https://github.com/rjust/defects4j).

*  Below table describes the consist of the three patches dataset:

|         | D_correct   |D_incorrect|D_unassessed |  sum       |
| ----    |     :-----: |   :-----: |    :---:    |   :---:    |
| ACS     |     18      |     5     |     0       |   23       |
|  Arja   |     18      |    160    |     0       |   178      |
| CapGen  |     28      |     43    |     0       |   71       |
|DeepRepair|    5       |    10     |     0       |   15       |
| Elixir  |     25      |    15     |     0       |   40       |
| Jaid    |    41       |    40     |     0       |   81       |
|JGenProg2015|  5       |     5     |     0       |   10       |
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








### Setup Experiment Environment
##### Check the overall patches information
```
cd defects4j 
./init.sh
```

####  Sanity Check

##### Overview information about patches

Command to have an overview information of patches. This generates a new generated csv file under the statistics folder: [patches_overview.csv](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/statistics/patches_overview.csv)
```
./drr.py patches_overview
```
##### Patch consistency

Command to check if a patch is patchable against the original Defects4J version of the programs. This generates a new generated csv file which is available under the statistics folder:[consistency_check.csv](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/consistency_check.csv)
```
./drr.py consistency_check
```
##### Patch plausibility

Command check if the collected patches are plausible (i.g. pass all tests provided by human developers). This generates a new csv file under the statistics folder:[plausibility_check.csv](TODO)
```
./drr.py plausible_check
```

#### Automated correctness assessment
Command to automatically assess the correctness of a given patch with the specific test suite.
This generates a new csv file under the statistics folder: TODO

```
./drr.py autotest <patch_id> <dataset:D_correct|D_incorrect|D_unassessed> <tests:ASE15_Evosuite|ASE15_Randoop|EMSE18_Evosuite>
Example:./drr.py autotest patch1-Chart-1-CapGen.patch D_correct ASE15_Evosuite

```


 

####  Patches that make generated tests fail in D_correct:


|Patch_ID|ASE15_Evosuite|ASE15_Randoop|EMSE18_Evosuite|Assessment|
|---------------------|---|---|---|---|
|[patch1-Math-73-Arja.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/claimed_correct_patches/Arja/Math/patch1-Math-73-Arja.patch)|6|0|0|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch1-Math-86-Arja.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/claimed_correct_patches/Arja/Math/patch1-Math-86-Arja.patch)|0|88| 0|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch1-Lang-43-CapGen.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/claimed_correct_patches/CapGen/Lang/patch1-Lang-43-CapGen.patch)|1|0|0|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/CapGen_Patches_Assessment.csv)|
|[patch2-Lang-43-CapGen.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/claimed_correct_patches/CapGen/Lang/patch2-Lang-43-CapGen.patch)|1|0|0|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/CapGen_Patches_Assessment.csv)|
|[patch2-Lang-51-Jaid.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/claimed_correct_patches/Jaid/Lang/patch2-Lang-24-Jaid.patch)|4|0|0|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Jaid_Patches_Assessment.csv)|
|[patch1-Chart-5-Nopol2015.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/claimed_correct_patches/Nopol2015/Chart/patch1-Chart-5-Nopol2015)|0|324|2|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Nopol2015_Patches_Assessment.csv)|
|[patch1-Lang-58-Nopol2015.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/claimed_correct_patches/Nopol2015/Lang/patch1-Lang-58-Nopol2015)|1|No-tests|0|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Nopol2015_Patches_Assessment.csv)|
|[patch1-Math-73-JGenProg2015.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/claimed_correct_patches/JGenProg2015/Math/patch1-Math-73-JGenProg2015)|9|0|No-tests|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/JGenProg2015_Patches_Assessment.csv)|
|[patch1-Lang-55-SketchFix.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/claimed_correct_patches/SketchFix/Lang/patch1-Lang-55-SketchFix)|1|0|0|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/SOFix_Patches_Assessment.csv)|
|[patch2-Lang-55-SketchFix.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/claimed_correct_patches/SketchFix/Lang/patch1-Lang-55-SketchFix)|10|0|21|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/SketchFix_Patches_Assessment.csv)|



Research questions:

* To what extent is manual correctness assessment by the author reliable?
* To what extent can generated tests on the patched version be used to discard incorrect patches?

|                               | Correct (generated tests) | Incorrect (generated tests)  |
| -------------                 | -------------             | -------------                |
| Correct (manual assessment)   | X             | false positive FP   (FP=0 in an ideal world)       |
| Incorrect (manual assessment) | false negative  FN (FN=0 in an ideal world, will be different)              | Y  |

Different versions of this table:

* global one (over all test generation techniques)
* only for Evosuite
* only for Random
* maybe others
