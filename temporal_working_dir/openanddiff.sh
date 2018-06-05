

approach=$1
project=$2
bugid=$3
filename=${4}
pathfile=(${filename//.//})
patchid=$5
if [ -z "$5" ]; then
patchid=1
fi

./copyopenoriginal.sh $1 $2 $3 $4 $5

read -p "Press enter to continue"


./calculatediff.sh $1 $2 $3 $4 $5 