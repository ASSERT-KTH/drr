# defects4-repair-reloaded
A large-scale empirical study on the correctness of Defects4 generated patches

### Setup Experiment Environment


#### 1 Clone and initialize Defects4J:
```
./setup.sh defects4j
```
#### 2 Checkout buggy programs:

Checkout all buggy programs in Defects4J:
```
./setup.sh project 
```
Checkout one specific buggy program of Chart|Closure|Lang|Math|Mockito|Time:
```
./setup.sh project Chart 
```
#### 3 Generate patched programs
```
./patched_programs.sh
```
#### 4 Test patches
```
./test_patch.sh (patch name, i.e.,  patch-Lang-16-ssFix.patch)
```
