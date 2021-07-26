#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(int argc, char** argv)
{
    setbuf(stdout,NULL);
    if(argc <= 1)
    {
        printf("Invalid Arguments\nUsage: rev3 <flag>\n");
        return -1;
    }
    if(strlen(argv[1]) != 22)
    {
        printf("Invalid flag!!\n\n");
        return -1;
    }

    int flag = 1;
    if(argv[1][8] != 0x5f || argv[1][16] != 0x5f) flag = 0;
    if(strncmp(argv[1]+4,"ju5t",4) != 0) flag = 0;
    if(strncmp(argv[1]+17, "f14g}", 5) != 0) flag = 0;
    if(strncmp(argv[1],"CTF{", 4) != 0) flag = 0;
    if(strncmp(argv[1]+9, "4n0th3r", 7) != 0) flag = 0;
    if(flag) printf("\n\nThe Secret\n\n\n");
    else
    {   
        printf("Invalid Flag\n\n");
    }
    return 0;
}
