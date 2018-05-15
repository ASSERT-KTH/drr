#!/usr/bin/env bash



# checkout buggy Chart projects follow the format /defects4j/Chart/chart_$vid_buggy 

function clonegit() {
    git clone https://github.com/rjust/defects4j.git
    cd defects4j
    ./init.sh
}  

function exportpath(){
    currentpath=`pwd`
    export PATH=$PATH:$currentpath/defects4j/framework/bin
}


function chart(){
for k in $( seq 1 26 )
do
    mkdir -p buggy_projects/Chart
    
    defects4j checkout -p Chart -v ${k}b -w ./buggy_projects/Chart/chart_${k}_buggy
done
}


# checkout buggy Closure projects follow the format /defects4j/Closure/closure_$vid_buggy 
function closure() {
for k in $( seq 1 133 )
do
    mkdir -p buggy_projects/Closure
    defects4j checkout -p Closure -v ${k}b -w ./buggy_projects/Closure/closure_${k}_buggy
done
}

# checkout buggy Lang projects follow the format /defects4j/Lang/lang_$vid_buggy

function lang() {
for k in $( seq 1 65 )
do
    mkdir -p buggy_projects/Lang
    defects4j checkout -p Lang -v ${k}b -w ./buggy_projects/Lang/lang_${k}_buggy
done
}

# checkout buggy Math projects follow the format /defects4j/Math/math_$vid_buggy 
function math() {
for k in $( seq 1 106 )
do
    mkdir -p buggy_projects/Math
    defects4j checkout -p Math -v ${k}b -w ./buggy_projects/Math/math_${k}_buggy
done
}

# checkout buggy Mockito projects follow the format /defects4j/Mockito/mockito_$vid_buggy 
function mockito(){
for k in $( seq 1 38 )
do
    mkdir -p buggy_projects/Mockito
    defects4j checkout -p Mockito -v ${k}b -w ./buggy_projects/Mockito/mockito_${k}_buggy
done
}

# checkout buggy Time projects follow the format /defects4j/Time/time_$vid_buggy 
function timep() {

for k in $( seq 1 27 )
do
    mkdir -p buggy_projects/Time
    defects4j checkout -p Time -v ${k}b -w ./buggy_projects/Time/time_${k}_buggy
done
}




case $1 in
defects4j)
    clonegit
    ;;
project)
        
    case $2 in 

    Chart)
        exportpath
        chart
        echo "Checked out the buggy Chart project"
        ;;
    Closure)
        exportpath
        closure
        echo "Checked out the buggy Closure project"
        ;;
    Lang)
        exportpath
        lang
        echo "Checked out the buggy Lang project"
        ;;
    Math)
        exportpath
        math
        echo "Checked out the buggy Math project"
        ;;
    Mockito)
        exportpath
        mockito
        echo "Checked out the buggy Mockito project"
        ;;
    Time)
        exportpath
        timep
        echo "Checked out the buggy Time project"
        ;;    
     *)   
        exportpath
        chart
        closure
        lang
        math    
        mockito
        timep    
        echo "Checked out the buggy Closure project"
        ;;

    esac;;  

esac 


