#include<stdio.h>
#include<stdlib.h>
int main()
{
    int test_cases;
    int* a;
    int* sum_a;
    scanf("%d\n",&test_cases);
    while(test_cases--){
        int n;
        scanf("%d\n",&n);
        a = (int*)malloc(n*sizeof(int));
        for(int i=0;i<n;++i)
        {
            scanf("%d",&a[i]);
        }
        //save sum of each index in a array 
        sum_a = (int*)malloc(n*sizeof(int));
        int sum=0;
        int result=0;
        sum_a[0]=0;
        for(int i=1;i<n;++i)
        {
            for(int j=i-1;j>=0;--j)
                {
                    
                    if(a[j]<a[i])
                        sum=sum+sum_a[j]+a[j];
                        break;
                }
            sum_a[i] = sum;
            
            result +=sum;
            sum=0;
        }
        free(a);
        printf("%d\n",result);
    }
    return 0;
}
