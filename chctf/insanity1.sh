for i in $(seq 0  100)
do
    echo "4" > sample.txt
    echo "81" >> sample.txt
    echo "$i" >> sample.txt
    echo "$i"
    nc insanity1.chujowyc.tf 4004 < sample.txt
    
done