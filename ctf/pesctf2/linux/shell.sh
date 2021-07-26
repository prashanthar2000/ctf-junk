python3 p1.py < secret > input
for i in $(seq 1 101)
do
    python3 p2.py < input > ouput; 
    python3 p1.py < ouput > input;
    echo $i ;
    #cat input;
    cat ouput;
done
