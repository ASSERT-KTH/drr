#!/usr/bin/env bash


# ${arr[0]}  patch number     
# ${arr[1]}  project name, i.e., Lang, Chart...
# ${arr[2]}  bug id
# ${arr[3]}  repair tool name, i.e. Dynamoth
filename=${1%.*}
arr=(${filename//-/ })

d4jdir=$(echo $PWD)
d4jpath=$d4jdir/defects4j/framework/bin/

echo $d4jpath

echo ${arr[0]} 
echo ${arr[1]} 
l_proj=$(echo ${arr[1]} | tr '[A-Z]' '[a-z]') 


#get patch path
patchpath=patches/${arr[3]}/${arr[1]}/$1

echo patchpath $patchpath

firstline=`cat $patchpath|head -n 1`
fulldir=$(pwd)
filename=${firstline##*/}
filepath=${firstline##*--- }         
original_dir=$fulldir/buggy_projects/${arr[1]}/${l_proj}_${arr[2]}_buggy
original_file=${original_dir}${filepath}
patchfile=$fulldir/$patchpath
#apply patch
#echo patch  -l $original_file  -i $patchfile -o $original_file
#patch --dry-run $original_file  -i $patchfile -o original_file.java

#compile and test patch
cd buggy_projects/${arr[1]}/${l_proj}_${arr[2]}_buggy
$d4jpath/defects4j compile
$d4jpath/defects4j test

#revert patch
#patch  -R $original_file  -i $patchpath -o $original_file