#!/usr/bin/env bash

currentdir=$(dirname $(echo $PWD))
originalpath=${currentdir}/buggy_projects/
temporal_patched_program=$currentdir/patched_programs/
svpath=$currentdir/temporal_working_dir/spoonedversions

echo '======COPY AND OPEN===='
echo currentdir: ${currentdir}
echo originalpath: ${originalpath}
echo Approach: ${1} #
echo Project: ${2} # project
echo Bug id: ${3} # id
echo File to modify: ${4} #file to modify
echo Patch id: ${5} #patch id
 
 ####
openspooned () {
echo open spooned arguments: 1 $1 2 $2 3 $3  4 $4 5 $5 #
filename0=${3}
pathfile0=(${filename0//.//})
sdir0=$svpath/${1}/${2}/default/$pathfile0.java
echo $sdir0
open $sdir0
}
 
 #####
copyAndOpenFile () {
project=$1
	bugid=$2
 mvnstruc=$3
 filename=$4
 pid=$5
 approach=$6
 
 buggypath=$project/${project}_${bugid}_buggy/
 
 
 sdir=$originalpath/$buggypath/$mvnstruc/$filename.java
 echo dir:  $sdir
 if [ -f "$sdir" ]; then


 	echo arguments: 1 $1 2 $2 3 $3  4 $4 5 $5 #
   openspooned $1 $2 $4
   ##Reset project
 
  cd $originalpath/$buggypath/$mvnstruc/
  git checkout .
  cd $currentdir
  #
  pathpatched=$project/bug_${bugid}/
  destination=$temporal_patched_program/$approach/$pathpatched/patch$pid/$filename.java
  echo Destination: 
  echo $destination
  ##Copy and make dirs
 mkdir -p `dirname $destination`
  cp $sdir $destination
  open $destination
  
  echo "##DONE OK#"
  exit 1
  
fi
}
####
approach=$1
project=$2
bugid=$3
filename=${4}
pathfile=(${filename//.//})
patchid=$5
if [ -z "$5" ]; then
patchid=1
fi
 


echo approach $1

mavendir=/src/java/
copyAndOpenFile $project $bugid $mavendir $pathfile $patchid $approach $approach

mavendir=/src/main/java/
copyAndOpenFile $project $bugid $mavendir $pathfile $patchid $approach $approach

mavendir=/src/
copyAndOpenFile $project $bugid $mavendir $pathfile $patchid $approach $approach

mavendir=/sources/
copyAndOpenFile $project $bugid $mavendir $pathfile $patchid $approach $approach

mavendir=/source/
copyAndOpenFile $project $bugid $mavendir $pathfile $patchid $approach $approach

echo 'Any possibility'