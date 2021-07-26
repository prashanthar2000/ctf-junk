#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>

int main(int argc, char **argv)
{
    printf("Enter name boi : ");
    volatile int modified;
    char buffer[64];

    modified = 10;
    gets(buffer);


    if(modified == 126)
    {
        printf("Here's the flag : FLAG REDACTED\n");
    } 
    else if(modified!=10)
    {
        printf("You earned some money\nYou have : $%d\nYou need $126 to buy the flag\n",modified);
    }
    else
    {
        printf("You have : $%d\nYou need $126 to buy the flag\nEarn some money\n",modified);
    }
}
