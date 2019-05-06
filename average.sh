sum=0
for i in $*
do
sum=`expr $sum + $i`
done 
printf "Average="
echo `echo "scale=2; $sum / $# " | bc `


