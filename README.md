# defects4-repair-reloaded
A large-scale empirical study on the correctness of Defects4 generated patches

Major Contribution:

* a clear, systematic, consolidated methodology for fully automated assessment of patch correctness

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

#### Website: http://drr.patches4j.com/

### Setup Experiment Environment


#### 1 Clone and initialize Defects4J:
```
./setup.py defects4j
```
#### 2 Checkout buggy programs:

Checkout all buggy programs in Defects4J:
```
./setup.py project 
```
Checkout one specific buggy program of Chart|Closure|Lang|Math|Mockito|Time:
```
./setup.py project Chart 
```
#### 3 Generate patched programs
```
./generate_patched_programs.py correct|plausible "path/to/patches"
i.e. ./generate_patched_programs.py correct "./correct_patches/ACS/"
```
#### 4 Test patches
```
./autotest.py <patch name>  <correct|plausible> <ASE15|EMSE18> <evosuite|randoop>
i.e. ./autotest.py patch1-Chart-1-CapGen.patch correct ASE15 randoop
```


## Patches

 | Claimed Correct Patches| plausible but not correct patches   | Total Patches   | Link          |
 | -------------          | -------------                       | -------------   | ------------- |
 | 213                    |               713                  | 926             | [click for detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/patches_info.csv) |




## Automatically_Generated_Tests

|                 |    Total Tests| Empty Tests   | Failing Tests on the correct version  | Valid Tests  | Link          |
| -------------   | ------------- | ------------- | -------------  | -------------| ------------- |
|ASE15-Evosuite   | 151376       |     0         |   6234        |   145143    | [Failing Tests](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/failing_ase15_evosuite_tests.csv)|
|ASE15-Randoop  | 18148341       |    3188793        |   12303       |   14947245    | [Failing Tests](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/failing_ase15_randoop_tests.csv)|
|EMSE18-Evosuite   | 73200      |     0         |  687      |  72513    |[Failing Tests](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/failing_ase15_evosuite_tests.csv)|

## Automated Patches correctness assessment result
|                     |    assessed by Author| assessed by ASE15 evosuite   | assessed by ASE15 randoop  | assessed by EMSE18 evosuite              | link |
| -------------       | ------------- | ------------- | -------------  | -------------| --------|
|Author Claimed Correct Patches|229 | 225|229|-| [detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/patches_evaluation.csv)|

##  Patches make automatically generated tests fail:

For claimed correct patches:

|patch id|Discarded by tests| failing tests No|failing info|data|
|---|---|---|---|---|
|patch1-Lang-43-Arja.patch|ASE15-Evosuite|1|seed2(test11)|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|patch1-Math-73-Arja.patch|ASE15-Evosuite|6|seed0(test09);seed2(test06)...|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|patch1-Math-86-Arja.patch|ASE15-Randoop|88| - RandoopTest10::test203...|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|patch1-Lang-43-CapGen.patch|ASE15-Evosuite|1|seed2(test11)|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/CapGen_Patches_Assessment.csv)|
|patch2-Lang-43-CapGen.patch|ASE15-Evosuite|1|seed2(test11)|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/CapGen_Patches_Assessment.csv)|


For claimed incorrecte patches

|patch id|Failing ASE15-Evosuite|Failing ASE15-Randoop|Failing EMSE18-Evosuite|data|
|---|---|---|---|---|
|[patch1-Lang-39-ACS-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/ACS/Lang/patch1-Lang-39-ACS-plausible.patch)|No-tests|0|No-tests|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/ACS_Patches_Assessment.csv)|
|[patch1-Math-28-ACS-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/ACS/Math/patch1-Math-28-ACS-plausible.patch)|0|0|No-tests|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/ACS_Patches_Assessment.csv)|
|[patch1-Math-73-ACS-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/ACS/Math/patch1-Math-73-ACS-plausible.patch)|3|0|No-tests|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/ACS_Patches_Assessment.csv)|
|[patch1-Math-81-ACS-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/ACS/Math/patch1-Math-81-ACS-plausible.patch)|7|0|9|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/ACS_Patches_Assessment.csv)|
|[patch1-Math-97-ACS-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/ACS/Math/patch1-Math-97-ACS-plausible.patch)|2|0|No-tests|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/ACS_Patches_Assessment.csv)|
|[patch1-Chart-1-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch1-Chart-1-Arja-plausible.patch)|1|9|0|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch2-Chart-1-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch2-Chart-1-Arja-plausible.patch)|1|9|0|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch3-Chart-1-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch3-Chart-1-Arja-plausible.patch)|1|9|0|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch4-Chart-1-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch4-Chart-1-Arja-plausible.patch)|1|9|0|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch1-Chart-7-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch1-Chart-7-Arja-plausible.patch)|0|0|0|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch1-Chart-12-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch1-Chart-12-Arja-plausible.patch)|0|135|No-tests|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch2-Chart-12-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch2-Chart-12-Arja-plausible.patch)|10|118|No-tests|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch3-Chart-12-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch3-Chart-12-Arja-plausible.patch)|26|1632|No-tests|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch1-Chart-13-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch1-Chart-13-Arja-plausible.patch)|1|0|0|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch2-Chart-13-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch2-Chart-13-Arja-plausible.patch)|1|0|0|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch3-Chart-13-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch3-Chart-13-Arja-plausible.patch)|1|0|0|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch4-Chart-13-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch4-Chart-13-Arja-plausible.patch)|1|0|0|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch5-Chart-13-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch5-Chart-13-Arja-plausible.patch)|1|0|0|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch6-Chart-13-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch6-Chart-13-Arja-plausible.patch)|1|0|0|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch1-Chart-15-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch1-Chart-15-Arja-plausible.patch)|13|1129|0|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch2-Chart-15-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch2-Chart-15-Arja-plausible.patch)|13|1129|0|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch3-Chart-15-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch3-Chart-15-Arja-plausible.patch)|13|1129|0|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch1-Chart-19-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch1-Chart-19-Arja-plausible.patch)|8|271|No-tests|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch1-Chart-25-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch1-Chart-25-Arja-plausible.patch)|0|427|5|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch2-Chart-25-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch2-Chart-25-Arja-plausible.patch)|0|120|5|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch3-Chart-25-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch3-Chart-25-Arja-plausible.patch)|0|31|2|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch4-Chart-25-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch4-Chart-25-Arja-plausible.patch)|0|69|27|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch5-Chart-25-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Chart/patch5-Chart-25-Arja-plausible.patch)|0|76|27|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch1-Lang-16-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Lang/patch1-Lang-16-Arja-plausible.patch)|0|0|No-tests|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch2-Lang-16-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Lang/patch2-Lang-16-Arja-plausible.patch)|0|0|No-tests|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch1-Lang-20-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Lang/patch1-Lang-20-Arja-plausible.patch)|No-tests|0|No-tests|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch2-Lang-20-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Lang/patch2-Lang-20-Arja-plausible.patch)|No-tests|0|No-tests|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch3-Lang-20-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Lang/patch3-Lang-20-Arja-plausible.patch)|No-tests|0|No-tests|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch4-Lang-20-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Lang/patch4-Lang-20-Arja-plausible.patch)|No-tests|0|No-tests|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch1-Lang-39-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Lang/patch1-Lang-39-Arja-plausible.patch)|No-tests|0|No-tests|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|
|[patch1-Lang-41-Arja-plausible.patch](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/plausible_patches/Arja/Lang/patch1-Lang-41-Arja-plausible.patch)|0|0|No-tests|[check detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/Patches_Assessment_Result/Arja_Patches_Assessment.csv)|




For plausible patches without manual analysis available (eg Cardumen):

TODO


