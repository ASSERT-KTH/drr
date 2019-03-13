# DiffTGen

DiffTGen is a testing technique which identifies test-suite-overfitted patches through test case generation.

### Why refactoring is needed for this project?
The tool was original from ISSTA'17 paper: Leveraging syntax-related code for automated program repair.
In this forked reporsitory, we conduct the refactoring tasks for the source code as the majority logic code was exist in one file. In addition, we added corresponding test cases for the majority functions.

### Refactor Tasks
| Issue|Type |Commit ID|Intention|Test Case|
|----  | ----  | ----  |  ----     |----  |
|[#2](https://github.com/SophieHYe/DiffTGen/issues/2)|  Refactor| [eff7805](https://github.com/SophieHYe/DiffTGen/commit/eff78054edee9bf9546417e59dcacf5f781b2c67)| Extract command mandatory options check |[CmdLineTest.java](https://github.com/SophieHYe/DiffTGen/commit/eff78054edee9bf9546417e59dcacf5f781b2c67#diff-2f41fc4fcb35bbbe3e0245b259632d7a)|
|[#3](https://github.com/SophieHYe/DiffTGen/issues/3)|Refactor|[e906714](https://github.com/SophieHYe/DiffTGen/commit/e90671403fe2944ef6d9812788556eecb0add8cd)|Extract function of parse command |[CmdLineTest.java](https://github.com/SophieHYe/DiffTGen/commit/e90671403fe2944ef6d9812788556eecb0add8cd#diff-2f41fc4fcb35bbbe3e0245b259632d7a)|
|[#4](https://github.com/SophieHYe/DiffTGen/issues/4)|Refactor|[564ce72](https://github.com/SophieHYe/DiffTGen/commit/564ce72d0db1dceea0e73c3c8d34078b3d5d3ebb)|Rename the variables|-|
|[#5](https://github.com/SophieHYe/DiffTGen/issues/5)|Refactor|[5fc54a2](https://github.com/SophieHYe/DiffTGen/commit/5fc54a20944016c4bae0123ba2e0dc62ec9f5576)|Extract file read lines function|[ReadInputsTest.java](https://github.com/SophieHYe/DiffTGen/commit/5a441eaf568ca37171d966e7645c268101728979#diff-2299f3953b445285791b0e175ee08d9e)|
|[#6](https://github.com/SophieHYe/DiffTGen/issues/6)|Refactor|[77b5278](https://github.com/SophieHYe/DiffTGen/commit/77b5278327af7f02e094aae8dbf8281aa62f67c0)|Extract init function|[InitialParams.java.java](https://github.com/SophieHYe/DiffTGen/commit/0aca11e48c9ab5589787d3ed1e48949ba81ec916)|
|[#8](https://github.com/SophieHYe/DiffTGen/issues/8)|Refactor|[9e625b4](https://github.com/SophieHYe/DiffTGen/commit/9e625b4690016cc4f697f54c18411bde7a7bff02)|Extract the function of creating instrumented files|[CreateInstrumentedFilesTest.java](https://github.com/SophieHYe/DiffTGen/commit/9e625b4690016cc4f697f54c18411bde7a7bff02#diff-019ef40761012bbd43185b8c0d71a2d9)|
|[#9](https://github.com/SophieHYe/DiffTGen/issues/9)|Refactor|[384c56d](https://github.com/SophieHYe/DiffTGen/commit/384c56d042b13dd2b103e81c19007d12cc7012ea)|Extract the function of compiling instrumented files|[CompileInstrumentedFilesTest.java](https://github.com/SophieHYe/DiffTGen/commit/384c56d042b13dd2b103e81c19007d12cc7012ea#diff-d7d2ff708c13d89e08b472e722d38e55)|
|[#10](https://github.com/SophieHYe/DiffTGen/issues/10)|Refactor|[7c094d9](https://github.com/SophieHYe/DiffTGen/commit/7c094d923c7360d4156555055a42b8b84b8547cb)|Extract the function of creating test targets|[CreateTestTargetsTest.java](https://github.com/SophieHYe/DiffTGen/commit/7c094d923c7360d4156555055a42b8b84b8547cb#diff-80fbffc89cc47454bd7b1b2276ecec4c)|
|[#11](https://github.com/SophieHYe/DiffTGen/issues/11)|Refactor|[db6fca5](https://github.com/SophieHYe/DiffTGen/commit/db6fca52f1256e0cd160e0ab7695e4dba2e95d8f)|Extract the function of compiling test targets|[CompileTestTargetsTest.java](https://github.com/SophieHYe/DiffTGen/commit/db6fca52f1256e0cd160e0ab7695e4dba2e95d8f#diff-3ebadfc0d760a1b407a0b54db239b4ac)|
|[#12](https://github.com/SophieHYe/DiffTGen/issues/12)|Refactor|[9982600](https://github.com/SophieHYe/DiffTGen/commit/99826007785c378636d777e831750680d8d72c37)|Extract the method of writing test case|[WriteTestCaseTest.java](https://github.com/SophieHYe/DiffTGen/commit/99826007785c378636d777e831750680d8d72c37#diff-b5ec2d6512e7178491c8900ff556e934)|
|[#13](https://github.com/SophieHYe/DiffTGen/issues/13)|Refactor|[97dd145](https://github.com/SophieHYe/DiffTGen/commit/97dd145fcf3fde52296ba02969349a1b5b55e989)|Extract the method of automatically generate test case|[AutomaticTestsGenerationTest.java](https://github.com/SophieHYe/DiffTGen/commit/97dd145fcf3fde52296ba02969349a1b5b55e989#diff-21a5467a3b9c5c01809186ecaedbd06e)|
|[#14](https://github.com/SophieHYe/DiffTGen/issues/14)|Refactor|[7607b2d](https://github.com/SophieHYe/DiffTGen/commit/7607b2d5ffe15baec0a7a3d3e82b5af9f8eb3bc8)|Extract the method of compiling test cases|[CompileTestCaseTest.java](https://github.com/SophieHYe/DiffTGen/commit/7607b2d5ffe15baec0a7a3d3e82b5af9f8eb3bc8#diff-a061e5a7036e8b733b5c44f4400cdf5c)|
|[#15](https://github.com/SophieHYe/DiffTGen/issues/15)|Refactor|[1d50d93](https://github.com/SophieHYe/DiffTGen/commit/1d50d93d187bb913c2b5f1b15dcc5ec3eb186535)|Extract the common method of validate process status|-|
|[#16](https://github.com/SophieHYe/DiffTGen/issues/16)|Refactor|[0feaef9](https://github.com/SophieHYe/DiffTGen/commit/0feaef9546cfba84becb39e7f9cd611093750e53)|Extract interface for compiling classes|-|


## Running Requirements

+ Linux environment
+ JDK 1.8
+ Apache Ant

## How to Build DiffTGen

Run `ant compile` to compile all the source files.

## How to Run DiffTGen

+ In the script file `run`, change the value of `proj_dir` to the *absolute* path of your DiffTGen directory (if you haven't done so).

+ Run the script file `run` with arguments as follows:
  * `-bugid`: the program id
  * `-repairtool`: the repair tool id (DiffTGen uses `repairtool` together with `bugid` to produce a testing id, if you are not sure what should be `repairtool`, then create a unique name)
  * `-difftgendpath`: the path of your DiffTGen directory
  * `-evosuitejpath`: the path of the EvoSuite jar (you may use the jar we provided in the `lib` directory)
  * `-dependjpath`: the dependency jar path of the faulty program (you should create a single jar file of the compiled faulty program including all dependencies)
  * `-outputdpath`: the path of the output directory
  * `-inputfpath`: the path of the input file indicating the syntactic deltas between the faulty program and the patched program
  * `-oracleinputfpath`: the path of the oracle input file containing oracle methods
  * `-evosuitetrials`: the number of the trials that EvoSuite runs
  * `-evosuitetimeout`: EvoSuite's running timeout in seconds for a trial
  * `-runparallel`: do you want to run the trials in parallel?
  * `-stopifoverfittingfound`: do you want to stop running if an overfitting-indicative is found?

### How to Create an Input File

The input file encodes a list of syntactic deltas between the faulty program and the patched program. For each delta, you write two lines in the file with the first line representing the modified statement in the faulty program and second representing the modified statement in the patched program. So in the file, the first two lines encode the first delta, the second two lines encode the second delta, and so on.

For a non-null modified statement, the form of a line in the input file is `filepath:ln,cn` where `filepath` is the file path of the program (either the faulty program or the patched program), `ln` is the starting line number of the statement, and `cn` is the starting column number of the statement. (Note that the column number is equal to the number of space characters from the start of a line to the first non-space character of the statement in the line. For example, if the first character of a statement is two tabs after the start of its line, the column number is 2.)

For a null modified statement as a removed statement (for an insertion, the modified statement in the faulty program is null, and for a deletion, the modified statement in the patched program is null), the form of a line in the input file is `null(filepath:ln,cn;ctxtloc)`. The keyword `null` is used to indicate it is a null modified statement. Within the parentheses, you need to specify a context statement using `filepath:ln,cn` and its location relative to the removed statement using `ctxtloc`. `ctxtloc` could be `before` or `after` to indicate the context statement is *before* or *after* the removed statement. It could also be something as `else-branch` to indicate the removed statement is the only statement in the else-branch of the context statement which is an *if*-statement. All the options for `ctxtloc` are `before`, `after`, `then-branch`, `else-branch`, `block-body`, `do-body`, `enhancedfor-body`, `for-body`, `switch-body`, `synchronized-body`, `try-body`, `catch-clause-body[x]` where x is the catch clause index, `finally-body`, and `while-body`. It is recommended that you always try using *before* or *after* as `ctxtloc` if you can.

### How to Create an Oracle File

Currently, DiffTGen uses a fixed version of the faulty program as oracle. DiffTGen creates an instrumented version of the oracle program and runs it against any EvoSuite-generated test methods (as test inputs) to obtain the expected outputs. In an oracle file, you need to specify *the methods in the fixed version that correspond to those that are patched in the patched program*. If they do not include all the methods where the correct fixes are made, you need to additionally specify *the files where the correct fixes are made*. For example, for the bug *Chart_26*, the repair tool jKali modifies a method in *CategoryPlot.java*, but the bug's correct version modifies something in *Axis.java*. In this case, you need to create an oracle file specifying (1) the same method of the fixed version of *CategoryPlot.java* and (2) the fixed version (as a file) of *Axis.java*.

When you need to specify a method of the fixed program, put a line in the form of `filepath:ln,cn` where `filepath` is the path of the method's class file, `ln` is the starting line number of the method, and `cn` is the starting column of the method. (Note that if a method starts with a javadoc, you need to specify the line and column numbers of its opening tag /\*\*.)

When you need to specify a fixed file, put a line in the form of `null(filepath)` where `null` is the keyword and `filepath` is the path of the fixed file.

Examples of the input and oracle files can be found under the directory `examples`.


## Output

The generated test cases, if any, can be found under `outputdir/testcase` where `outputdir` is the output directory you specified. The file named `DiffTGen0Test.java` is an regression-indicative test case. The file named `DiffTGen1Test.java` is a repair-indicative test case. The file named `DiffTGen2Test.java` is a defective-indicative test case. (A test-case-instrumented version of the faulty program can be found under `outputdir/bug/instru1`.)
