#include<signal.h>
#include<stdio.h>
#include<unistd.h>
#include<string.h>
#include<stdlib.h>

void handler(int sig)
{
    char c[100];
    FILE *fptr;
    fptr = fopen("flag.txt","r");
    fscanf(fptr,"%s",c);
    printf("Congrats you were able to overflow, here is your reward!!\n");
    printf("Key: %s\n",c);
    fclose(fptr);

    return;
}

void copy(char *arg)
{
    char buf[10];
    strcpy(buf,arg);
    //printf("%s\n",buf);
}

int main(int argc, char *argv[])
{
    if(argc <= 1){
        fprintf(stderr,"Insufficient Arguments\n");
        return 0;
    }
    copy(argv[1]);
    return 0;

}
