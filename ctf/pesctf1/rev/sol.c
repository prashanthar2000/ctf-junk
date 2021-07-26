
#include<stdio.h>
#include<stdlib.h>

ulong FUN_00101165(long param_1,long param_2,int param_3)

{
  uint local_10;
  int local_c;
  
  local_10 = 0;
  local_c = 0;
  while (((local_c < param_3 && (*(char *)(param_1 + local_c) != '\0')) &&
         (*(char *)(param_2 + local_c) != '\0'))) {
    local_10 = local_10 |
               (int)(char)(*(byte *)(param_2 + local_c) ^ *(byte *)(param_1 + local_c) ^ 0x55);
    local_c = local_c + 1;
  }
  return (ulong)local_10;
}
//local_c = 37




int main()

{
  int iVar1;
  long in_FS_OFFSET;
  char local_58 [72];
  long local_10;
  
  local_10 = *(long *)(in_FS_OFFSET + 0x28);
  puts("--=[ Not So Easy Crackme ]=--");
  printf("passwd > ");
  fgets(local_58,0x40,stdin);
  iVar1 = FUN_00101165(local_58,&DAT_00102030,0x25);
  if (iVar1 == 0) {
    puts("Correct Password...");
  }
  else {
    puts("Wrong Password...");
  }
  if (local_10 != *(long *)(in_FS_OFFSET + 0x28)) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}


