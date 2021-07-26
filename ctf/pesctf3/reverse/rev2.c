#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define LENGTH 5

int main(int argc, char** argv)
{
    if(argc <= 1)
    {
        printf("Invalid Arguments\nUsage: rev2 <flag>\n");
        return -1;
    }
    char **subs;
    char *token;
    subs = (char**)malloc(sizeof(char*)*LENGTH);
    int i = 0;
    int flag = 1;
    /*
    token = strtok(argv[1], "_");
    while( token != NULL)
    {
        subs[i++] = token;
        if(i > LENGTH)
        {
            printf("Invalid Flag!!\n\n");
            return -1;
        }
        token = strtok(NULL, "_");
    }
    if( i <  LENGTH) 
    {
        printf("Invalid Flag!!\n\n");
        return -1;
    }
    for(int i =0; i< LENGTH; i++) printf("%s\n",subs[i]);
    */
    
    subs[2] = "b19";
    subs[0] ="CTF{4" ;
    subs[4] = "f14g}";
    subs[1] = "v3ry";
    subs[3] = "CTF";

    for(int i =0; i< LENGTH; i++) printf("%s\n",subs[i]);
    if(flag) printf("\n\nThe Secret\n\n\n");
    else
    {
        printf("Invalid Flag\n\n");
    }
    return 0;
}
