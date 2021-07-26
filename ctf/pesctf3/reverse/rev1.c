#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(int argc, char **args)
{
    if(argc <= 1)
    {
        printf("Invalid argument\nUsage: rev1 <flag>\n");
        return -1;
    }
    if(strcmp(args[1], "CTF{1NTR0_T0_R3V}") == 0)
    {
        printf("\n\nThe Secret!!!\n\n\n");
    }
    else{
        printf("Invalid Flag\n");
    }
    return 0;
}