#!/usr/bin/env bash

function travFolder(){ 
    #echo "travFolder"
    flist=`ls $1`
    cd $1
   echo $flist
    for f in $flist
    do
        if test -d $f
        then
            echo "dir: $f"
            travFolder $f
        else
            echo "file: $f"
            generate_patched_program $f

        fi

    done
    cd ../ 
}



function generate_patched_program() {
            # ${arr[0]}  patch number     
            # ${arr[1]}  project name, i.e., Lang, Chart...
            # ${arr[2]}  bug id
            # ${arr[3]}  repair tool name, i.e. Dynamoth
            filename=${1%.*}
            arr=(${filename//-/ })
          
            #make directory for generated patched files.
            mkdir -p ../../../patched_programs/${arr[3]}/${arr[1]}/bug_${arr[2]}/${arr[0]}
          
            #original file path
            fulldir=$(cd ../../../; pwd)
            proj=${arr[1]}  
            l_proj=$(echo $proj | tr '[A-Z]' '[a-z]')    

            #Get the original file info from     
            firstline=`cat $1|head -n 1`
            filename=${firstline##*/}
            filepath=${firstline##*--- }         
            original_dir=$fulldir/buggy_projects/${arr[1]}/${l_proj}_${arr[2]}_buggy
            original_file=${original_dir}${filepath}
            echo original_file  $original_file
            #echo $original_file
            patch  -l -u --fuzz=5 $original_file  -i $f -o $fulldir/patched_programs/${arr[3]}/${arr[1]}/bug_${arr[2]}/${arr[0]}/$filename
#patch $original_file -i $f -o TEST.java
}


dir=./patches/SketchFix/Math
travFolder $dir

