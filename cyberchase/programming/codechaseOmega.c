#include<stdio.h>
#include<stdlib.h>

int main(void)
{
   char *ptr_h;
   char h[64];

   ptr_h = getenv("HOME");
   if(ptr_h != NULL) {
           sprintf(h, "Your current directory is: %s !", ptr_h);
           printf("%s\n", h);
   }

   return 0;
}