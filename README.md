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
 | 229                    |               697                   | 926             | [click for detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/patches_info.csv) |




## Automatically_Generated_Tests

|                 |    Total Tests| Empty Tests   | Failing Tests  | Valid Tests  | Link          |
| -------------   | ------------- | ------------- | -------------  | -------------| ------------- |
|ASE15-Evosuite   | 151,376       |     0         |   4,143        |   147,233    | [Failing Tests](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/failing_ase15_evosuite_tests.csv)|
|ASE15-Randoop  | 18,148,341       |    3,188,793        |   12,303       |   14,947,245    | [Failing Tests](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/failing_ase15_randoop_tests.csv)|
|EMSE18-Evosuite   | 6,311       |     0         |   -       |   -    |[Failing Tests](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/failing_ase15_evosuite_tests.csv)|

## Automated Patches correctness assessment result
|                     |    assessed by Author| assessed by ASE15 evosuite   | assessed by ASE15 randoop  | assessed by EMSE18 evosuite              | link |
| -------------       | ------------- | ------------- | -------------  | -------------| --------|
|Author Claimed Correct Patches|229 | 226|229|-| [detail](https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/tables/patches_evaluation.csv)|


