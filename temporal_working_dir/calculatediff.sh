#!/usr/bin/env bash
#!/usr/bin/env bash

currentdir=$(dirname $(echo $PWD))
originalpath=${currentdir}/buggy_projects/
temporal_patched_program=$currentdir/patched_programs/
temporal_diff=/patches/

echo '======DIFFF Calculation===='
echo approach: ${1}
echo Project: ${2} # project
echo Bug id: ${3} # id
echo File to modify: ${4} #file to modify
echo Patch id: ${5} #patch id
 
currentdir=dirname $(echo $PWD)
d4jpath=$currentdir/defects4j/framework/bin/
 
 
calculateAndAppyDiff () {
 approach=$1
 buggypath=$2
 mvnstruc=$3
 filename=$4
 pid=$5
 project=$6
 bugid=$7
 
 pathpatch=${project}/bug_$bugid/
 
 originalfile=$originalpath/$buggypath/$mvnstruc/$filename.java
 if [ -f "$originalfile" ]; then
 
 	##dirs conf
 	l_proj=$(echo $project | tr '[A-Z]' '[a-z]') 
	buggydir=buggy_projects/$project/${l_proj}_${bugid}_buggy
 
  
  ##Reset project (just in case)
  cd $buggydir
  git checkout .
  cd $currentdir
  #Printing diff
  echo original:
  echo $originalfile
  destination=$temporal_patched_program/$approach/$pathpatch/patch$pid/$filename.java
  echo modif: 
  echo $destination

  outputdiffpath=$currentdir/$temporal_diff/$approach/$project//patch$pid-$project-$bugid-$approach.patch
  
  mkdir -p `dirname $outputdiffpath`
###Calculating the diff
  echo   diff   -u   --label=$mvnstruc/$filename.java  --label=$mvnstruc/$filename.java  $originalfile $destination
  diff  -u   --label=$mvnstruc/$filename.java  --label=$mvnstruc/$filename.java  $originalfile $destination > $outputdiffpath
  echo Patch paths:  $outputdiffpath $originalfile 

  echo '=======' 
  echo $approach $project $bugid patchid: $pid 
  echo '====END Successfully ===' 
  exit 1
fi
}

approach=$1
project=$2
bugid=$3
filename=${4}
pathfile=(${filename//.//})
patchid=$5
if [ -z "$5" ]; then
patchid=1
fi
 
buggypath=${2}/${2}_${3}_buggy/
#buggypath=${project}/bug_$bugid/


mavendir=/src/java/
calculateAndAppyDiff $approach $buggypath $mavendir $pathfile $patchid $project $bugid

mavendir=/src/main/java/
calculateAndAppyDiff $approach $buggypath $mavendir $pathfile $patchid $project $bugid

mavendir=/src/
calculateAndAppyDiff $approach $buggypath $mavendir $pathfile $patchid $project $bugid

mavendir=/sources/
calculateAndAppyDiff $approach $buggypath $mavendir $pathfile $patchid $project $bugid

mavendir=/source/
calculateAndAppyDiff $approach $buggypath $mavendir $pathfile $patchid $project $bugid

echo '====END WITHOUT CASE ANALYZED ==='