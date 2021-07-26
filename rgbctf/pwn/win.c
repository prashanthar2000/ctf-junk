#include<stdio.h>
#include<stdlib.h>
void win(long param_1)

{
  long in_FS_OFFSET;
  long local_3c;
  long  local_38;
  long  local_30;
  long  local_28;
  long  local_20;
  long  local_18;
  long   local_14;
  long local_10;
  
//   local_10 = *(long *)(in_FS_OFFSET + 0x28);
  local_38 = 0x12297e12426e6f53;
  local_30 = 0x79242e48796e7141;
  local_28 = 0x49334216426e2e4d;
  local_20 = 0x473e425717696a7c;
  local_18 = 0x42642a41;
  local_14 = 0;
  local_3c = 0;
  while (local_3c < 9) {
    *(int *)((long)&local_38 + (ulong)local_3c * 4) =
         *(int *)((long)&local_38 + (ulong)local_3c * 4) ^ param_1;
    local_3c = local_3c + 1;
  }
  printf("Your flag: rgbCTF{%36s}\n",&local_38);
//   if (local_10 != *(long *)(in_FS_OFFSET + 0x28)) {
//                     /* WARNING: Subroutine does not return */
//     __stack_chk_fail();
//   }
  return;
}

int main()
{
    for(long i = 643636509; i < 643636530; i++)
    {
        printf("%d: ", i);
        win(i);

    }
}
