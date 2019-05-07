echo "Enter limit"
read l
echo "Enter elements in array:"
i=0
while [ $i -lt $l ]
do
read t
eval a$i=$t
i=`expr $i + 1`
done
echo "Sorted array:"
i=0
n=`expr $l - 1`
while [ $i -lt $n ]
do
j=`expr $i + 1`
while [ $j -lt $l ]
do
eval x=\$a$i
eval y=\$a$j
if [ $x -gt $y ]; then
eval a$i=$y
eval a$j=$x
fi
j=`expr $j + 1`
done
i=`expr $i + 1`
done
i=0
while [ $i -lt $l ]
do
eval x=\$a$i
echo "$x"
i=`expr $i + 1`
done
f=0
low=0
high=`expr $l - 1`
echo "Enter searching item:"
read s
while [ $f -eq 0 -a $low -le $high ]
do
mid=`expr \( $low + $high \) / 2`
eval d=\$a$mid
if [ $d -eq $s ]; then
f=1
elif [ $d -lt $s ]; then
low=`expr $mid + 1`
else
high=`expr $mid - 1`
fi
done
if [ $f -eq 0 ]; then 
echo "Item not found"
else
echo "Item found at position `expr $mid + 1`" 
fi
