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
./autotest.py <patch name>  <correct|plausible> <ASE15|EMSE18> 
i.e. ./autotest.py patch1-Chart-1-CapGen.patch correct ASE15
```
