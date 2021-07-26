#include<stdio.h>
int main()
{
    char[50] key = "(ff'e ,;4 >'e\" !;&fe1 2;<6a'!.   !3<'"
    printf("%s", &key);


}

int FUN(char* param_1,char* param_2,int param_3)

{
  int local_10;
  int local_c;
  
  local_10 = 0;
  local_c = 0;
  while (((local_c < param_3 && (*(char *)(param_1 + local_c) != '\0')) &&
         (*(char *)(param_2 + local_c) != '\0'))) {
    local_10 = local_10 |
               (int)*(param_2 + local_c) ^ (int)*(param_1 + local_c) ^ 0x55);
    local_c = local_c + 1;
  }
  return local_10;
}
