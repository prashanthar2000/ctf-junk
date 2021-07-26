
/* WARNING: Could not reconcile some variable overlaps */

long lang_start_internal(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4
                        )

{
  code *pcVar1;
  undefined8 uVar2;
  code **ppcVar3;
  int iVar4;
  __sighandler_t p_Var5;
  long *plVar6;
  long lVar7;
  int *ctx;
  undefined8 local_90;
  int local_88;
  int local_84;
  undefined8 local_80;
  code **local_78;
  undefined8 local_70;
  undefined8 local_68;
  undefined4 uStack96;
  undefined4 uStack92;
  code **local_58;
  undefined8 local_50;
  undefined8 local_48;
  undefined8 local_40;
  int local_38;
  int iStack52;
  undefined4 uStack48;
  undefined4 uStack44;
  code **local_28;
  
  local_48 = param_1;
  local_40 = param_2;
  p_Var5 = signal(0xd,(__sighandler_t)0x1);
  if (p_Var5 == (__sighandler_t)0xffffffffffffffff) {
    begin_panic<&str>(0x156032,0x47,&PTR_s_libstd/sys/unix/mod.rsassertion_f_0036ac20);
    do {
      invalidInstructionException();
    } while( true );
  }
  ctx = &local_38;
  init((EVP_PKEY_CTX *)ctx);
  init((EVP_PKEY_CTX *)ctx);
  to_owned<u8>(&local_88,
                              
               "mainlibstd/sys/unix/mod.rsassertion failed: signal(libc::SIGPIPE, libc::SIG_IGN) !=libc::SIG_ERRlibstd/sys/unix/fs.rsinternal error: entered unreachablecodeliballoc/vec.rsassertion failed: end <= len"
               ,4);
  local_90 = (code **)new(&local_88);
  local_58 = local_28;
  local_68._0_4_ = local_38;
  local_68._4_4_ = iStack52;
  uStack96 = uStack48;
  uStack92 = uStack44;
  ha700a99ba45598a7(anon.446b44f0171f812e3f7bce38e05b000b.14.llvm.13410690767873925266);
  local_78 = local_58;
  local_88 = (int)local_68;
  local_84 = local_68._4_4_;
  local_80 = CONCAT44(uStack92,uStack96);
  local_70 = local_90;
  ha866f2a56867b7e2(anon.446b44f0171f812e3f7bce38e05b000b.14.llvm.13410690767873925266,&local_88);
  pthread_mutex_lock((pthread_mutex_t *)
                     _ZN3std3sys4unix4args3imp4LOCK17h53112ee15864051cE.llvm.12433506558495411169);
  _ZN3std3sys4unix4args3imp4ARGC17h0018d8be2eaded5fE.llvm.12433506558495411169 = param_3;
  h45ba42be9b93cf5e = param_4;
  pthread_mutex_unlock
            ((pthread_mutex_t *)
             _ZN3std3sys4unix4args3imp4LOCK17h53112ee15864051cE.llvm.12433506558495411169);
  local_50 = 0;
  local_90 = (code **)0x0;
  local_68 = &local_48;
  iVar4 = __rust_maybe_catch_panic(do_call<closure,i32>,&local_68,&local_50,&local_90);
  if (iVar4 == 0) {
    local_84 = (int)local_68;
    local_88 = 0;
  }
  else {
    plVar6 = (long *)(*anon.300d480d1e71f81cecdaf167d6aa81e8.48.llvm.12888936999216587986._0_8_)();
    if (plVar6 == (long *)0x0) {
      unwrap_failed<std--thread--local--AccessError>(0x156e77,0x39);
      do {
        invalidInstructionException();
      } while( true );
    }
    if (*plVar6 == 1) {
      lVar7 = plVar6[1];
    }
    else {
      lVar7 = (*anon.300d480d1e71f81cecdaf167d6aa81e8.48.llvm.12888936999216587986._8_8_)();
      *plVar6 = 1;
      plVar6[1] = lVar7;
    }
    plVar6[1] = lVar7 + -1;
    local_80 = local_50;
    local_78 = local_90;
    local_88 = 1;
  }
  if (_ZN3std10sys_common7cleanup7CLEANUP17h28338e968f18ab23E.llvm.7677134499402319517 != 3) {
    local_90 = (code **)CONCAT71(local_90._1_7_,1);
    local_68 = &local_90;
    call_inner(&_ZN3std10sys_common7cleanup7CLEANUP17h28338e968f18ab23E.llvm.7677134499402319517,0,
               &local_68,&vtable);
  }
  ppcVar3 = local_78;
  uVar2 = local_80;
  iVar4 = 0x65;
  if (local_88 != 1) {
    iVar4 = local_84;
  }
  if (local_88 != 0) {
    (**local_78)(local_80);
    pcVar1 = ppcVar3[1];
    if (pcVar1 != (code *)0x0) {
      __rust_dealloc(uVar2,pcVar1,ppcVar3[2]);
    }
  }
  return (long)iVar4;
}




/* WARNING: Could not reconcile some variable overlaps */
/* rusty_vault::main::h01669180137fcbb4 */

void h01669180137fcbb4(void)

{
  undefined8 *puVar1;
  int iVar2;
  undefined **ppuVar3;
  undefined **__n;
  undefined **ppuVar4;
  long lVar5;
  bool bVar6;
  undefined auVar7 [16];
  undefined **local_a8;
  undefined **local_a0;
  undefined **local_98;
  undefined **local_90;
  char *local_88;
  undefined8 local_80;
  undefined local_78 [16];
  undefined **local_68;
  undefined8 local_58;
  undefined4 local_50;
  undefined4 uStack76;
  undefined4 local_48;
  undefined4 uStack68;
  undefined8 *local_40;
  code *local_38;
  
  local_58 = 1;
  local_50 = 0;
  uStack76 = 0;
  local_48 = 0;
  uStack68 = 0;
  local_a8 = &PTR_s_[*]_Please_enter_the_key_to_unlo_0036aae0;
  local_a0 = (undefined **)0x1;
  local_98 = (undefined **)0x0;
  local_88 = "Invalid input[*] You entered: \n";
  local_80 = 0;
  _print(&local_a8);
  local_78._0_8_ = (undefined **)stdin();
  read_line(&local_a8,local_78,&local_58);
  puVar1 = local_98;
  if (local_a8 != (undefined **)0x0) {
    if (1 < (byte)local_a0) {
      (**(code **)local_98[1])(*local_98);
      lVar5 = *(long *)(puVar1[1] + 8);
      if (lVar5 != 0) {
        __rust_dealloc(*puVar1,lVar5,*(undefined8 *)(puVar1[1] + 0x10));
      }
      __rust_dealloc(puVar1,0x18,8);
    }
    expect_failed("Invalid input[*] You entered: \n",0xd);
LAB_0010aafa:
    do {
      invalidInstructionException();
    } while( true );
  }
  LOCK();
  *(long *)local_78._0_8_ = (long)*local_78._0_8_ + -1;
  if (*local_78._0_8_ == (undefined *)0x0) {
    h155a6c26b89d66bb(local_78);
  }
  local_78 = trim(local_58,CONCAT44(uStack68,local_48));
  local_38 = h341eacf8acacc134;
  local_a8 = (undefined **)&DAT_0036aaf0;
  local_a0 = (undefined **)0x2;
  local_98 = (undefined **)&DAT_00155bb0;
  local_90 = (undefined **)0x1;
  local_88 = (char *)&local_40;
  local_80 = 1;
  local_40 = (undefined8 *)local_78;
  _print(&local_a8);
  auVar7 = trim(local_58,CONCAT44(uStack68,local_48));
  __n = SUB168(auVar7 >> 0x40,0);
  local_a8 = (undefined **)0x1;
  local_a0 = (undefined **)0x0;
  local_98 = (undefined **)0x0;
  ppuVar3 = (undefined **)__rust_alloc(1,1);
  if (ppuVar3 == (undefined **)0x0) {
    handle_alloc_error(1,1);
    do {
      invalidInstructionException();
    } while( true );
  }
  local_a0 = (undefined **)0x1;
  local_98 = (undefined **)0x1;
  local_a8 = ppuVar3;
  h2e5a620cf8df7ac7(ppuVar3,1,"Th3_KY2dv4uLt[*] Please enter the key to unlock the vault\n",1);
  ppuVar3 = local_a8;
  ppuVar4 = local_a0;
  if (local_a0 == local_98) {
    if ((undefined **)0xfffffffffffffffe < local_98) {
      capacity_overflow();
      goto LAB_0010aafa;
    }
    ppuVar4 = (undefined **)((long)local_98 + 1U);
    if ((undefined **)((long)local_98 + 1U) < (undefined **)((long)local_98 * 2)) {
      ppuVar4 = (undefined **)((long)local_98 * 2);
    }
    if (local_98 == (undefined **)0x0) {
      ppuVar3 = (undefined **)__rust_alloc(ppuVar4,1);
    }
    else {
      ppuVar3 = (undefined **)__rust_realloc(local_a8,local_98,1,ppuVar4);
    }
    if (ppuVar3 == (undefined **)0x0) goto LAB_0010a9b7;
  }
  local_a0 = ppuVar4;
  local_a8 = ppuVar3;
  lVar5 = (long)local_a8 + (long)local_98;
  local_98 = (undefined **)((long)local_98 + 1);
  h2e5a620cf8df7ac7(lVar5,1,0x155b51,1);
  ppuVar3 = local_a8;
  ppuVar4 = local_a0;
  if (local_a0 == local_98) {
    if ((undefined **)0xfffffffffffffffe < local_98) {
      capacity_overflow();
      goto LAB_0010aafa;
    }
    ppuVar4 = (undefined **)((long)local_98 + 1U);
    if ((undefined **)((long)local_98 + 1U) < (undefined **)((long)local_98 * 2)) {
      ppuVar4 = (undefined **)((long)local_98 * 2);
    }
    if (local_98 == (undefined **)0x0) {
      ppuVar3 = (undefined **)__rust_alloc(ppuVar4,1);
    }
    else {
      ppuVar3 = (undefined **)__rust_realloc(local_a8,local_98,1,ppuVar4);
    }
    if (ppuVar3 == (undefined **)0x0) goto LAB_0010a9b7;
  }
  local_a0 = ppuVar4;
  local_a8 = ppuVar3;
  lVar5 = (long)local_a8 + (long)local_98;
  local_98 = (undefined **)((long)local_98 + 1);
  h2e5a620cf8df7ac7(lVar5,1,0x155b52,1);
  ppuVar3 = local_a8;
  ppuVar4 = local_a0;
  if (local_a0 == local_98) {
    if ((undefined **)0xfffffffffffffffe < local_98) {
      capacity_overflow();
      goto LAB_0010aafa;
    }
    ppuVar4 = (undefined **)((long)local_98 + 1U);
    if ((undefined **)((long)local_98 + 1U) < (undefined **)((long)local_98 * 2)) {
      ppuVar4 = (undefined **)((long)local_98 * 2);
    }
    if (local_98 == (undefined **)0x0) {
      ppuVar3 = (undefined **)__rust_alloc(ppuVar4,1);
    }
    else {
      ppuVar3 = (undefined **)__rust_realloc(local_a8,local_98,1,ppuVar4);
    }
    if (ppuVar3 == (undefined **)0x0) goto LAB_0010a9b7;
  }
  local_a0 = ppuVar4;
  local_a8 = ppuVar3;
  lVar5 = (long)local_a8 + (long)local_98;
  local_98 = (undefined **)((long)local_98 + 1);
  h2e5a620cf8df7ac7(lVar5,1,0x155b53,1);
  ppuVar3 = local_a8;
  ppuVar4 = local_a0;
  if (local_a0 == local_98) {
    if ((undefined **)0xfffffffffffffffe < local_98) {
      capacity_overflow();
      goto LAB_0010aafa;
    }
    ppuVar4 = (undefined **)((long)local_98 + 1U);
    if ((undefined **)((long)local_98 + 1U) < (undefined **)((long)local_98 * 2)) {
      ppuVar4 = (undefined **)((long)local_98 * 2);
    }
    if (local_98 == (undefined **)0x0) {
      ppuVar3 = (undefined **)__rust_alloc(ppuVar4,1);
    }
    else {
      ppuVar3 = (undefined **)__rust_realloc(local_a8,local_98,1,ppuVar4);
    }
    if (ppuVar3 == (undefined **)0x0) goto LAB_0010a9b7;
  }
  local_a0 = ppuVar4;
  local_a8 = ppuVar3;
  lVar5 = (long)local_a8 + (long)local_98;
  local_98 = (undefined **)((long)local_98 + 1);
  h2e5a620cf8df7ac7(lVar5,1,0x155b54,1);
  ppuVar3 = local_a8;
  ppuVar4 = local_a0;
  if (local_a0 == local_98) {
    if ((undefined **)0xfffffffffffffffe < local_98) {
      capacity_overflow();
      goto LAB_0010aafa;
    }
    ppuVar4 = (undefined **)((long)local_98 + 1U);
    if ((undefined **)((long)local_98 + 1U) < (undefined **)((long)local_98 * 2)) {
      ppuVar4 = (undefined **)((long)local_98 * 2);
    }
    if (local_98 == (undefined **)0x0) {
      ppuVar3 = (undefined **)__rust_alloc(ppuVar4,1);
    }
    else {
      ppuVar3 = (undefined **)__rust_realloc(local_a8,local_98,1,ppuVar4);
    }
    if (ppuVar3 == (undefined **)0x0) goto LAB_0010a9b7;
  }
  local_a0 = ppuVar4;
  local_a8 = ppuVar3;
  lVar5 = (long)local_a8 + (long)local_98;
  local_98 = (undefined **)((long)local_98 + 1);
  h2e5a620cf8df7ac7(lVar5,1,0x155b52,1);
  ppuVar3 = local_a8;
  ppuVar4 = local_a0;
  if (local_a0 == local_98) {
    if ((undefined **)0xfffffffffffffffe < local_98) {
      capacity_overflow();
      goto LAB_0010aafa;
    }
    ppuVar4 = (undefined **)((long)local_98 + 1U);
    if ((undefined **)((long)local_98 + 1U) < (undefined **)((long)local_98 * 2)) {
      ppuVar4 = (undefined **)((long)local_98 * 2);
    }
    if (local_98 == (undefined **)0x0) {
      ppuVar3 = (undefined **)__rust_alloc(ppuVar4,1);
    }
    else {
      ppuVar3 = (undefined **)__rust_realloc(local_a8,local_98,1,ppuVar4);
    }
    if (ppuVar3 == (undefined **)0x0) goto LAB_0010a9b7;
  }
  local_a0 = ppuVar4;
  local_a8 = ppuVar3;
  lVar5 = (long)local_a8 + (long)local_98;
  local_98 = (undefined **)((long)local_98 + 1);
  h2e5a620cf8df7ac7(lVar5,1,0x155b55,1);
  ppuVar3 = local_a8;
  ppuVar4 = local_a0;
  if (local_a0 == local_98) {
    if ((undefined **)0xfffffffffffffffe < local_98) {
      capacity_overflow();
      goto LAB_0010aafa;
    }
    ppuVar4 = (undefined **)((long)local_98 + 1U);
    if ((undefined **)((long)local_98 + 1U) < (undefined **)((long)local_98 * 2)) {
      ppuVar4 = (undefined **)((long)local_98 * 2);
    }
    if (local_98 == (undefined **)0x0) {
      ppuVar3 = (undefined **)__rust_alloc(ppuVar4,1);
    }
    else {
      ppuVar3 = (undefined **)__rust_realloc(local_a8,local_98,1,ppuVar4);
    }
    if (ppuVar3 == (undefined **)0x0) goto LAB_0010a9b7;
  }
  local_a0 = ppuVar4;
  local_a8 = ppuVar3;
  lVar5 = (long)local_a8 + (long)local_98;
  local_98 = (undefined **)((long)local_98 + 1);
  h2e5a620cf8df7ac7(lVar5,1,0x155b53,1);
  ppuVar3 = local_a8;
  ppuVar4 = local_a0;
  if (local_a0 == local_98) {
    if ((undefined **)0xfffffffffffffffe < local_98) {
      capacity_overflow();
      goto LAB_0010aafa;
    }
    ppuVar4 = (undefined **)((long)local_98 + 1U);
    if ((undefined **)((long)local_98 + 1U) < (undefined **)((long)local_98 * 2)) {
      ppuVar4 = (undefined **)((long)local_98 * 2);
    }
    if (local_98 == (undefined **)0x0) {
      ppuVar3 = (undefined **)__rust_alloc(ppuVar4,1);
    }
    else {
      ppuVar3 = (undefined **)__rust_realloc(local_a8,local_98,1,ppuVar4);
    }
    if (ppuVar3 == (undefined **)0x0) goto LAB_0010a9b7;
  }
  local_a0 = ppuVar4;
  local_a8 = ppuVar3;
  lVar5 = (long)local_a8 + (long)local_98;
  local_98 = (undefined **)((long)local_98 + 1);
  h2e5a620cf8df7ac7(lVar5,1,0x155b56,1);
  ppuVar3 = local_a8;
  ppuVar4 = local_a0;
  if (local_a0 == local_98) {
    if ((undefined **)0xfffffffffffffffe < local_98) {
      capacity_overflow();
      goto LAB_0010aafa;
    }
    ppuVar4 = (undefined **)((long)local_98 + 1U);
    if ((undefined **)((long)local_98 + 1U) < (undefined **)((long)local_98 * 2)) {
      ppuVar4 = (undefined **)((long)local_98 * 2);
    }
    if (local_98 == (undefined **)0x0) {
      ppuVar3 = (undefined **)__rust_alloc(ppuVar4,1);
    }
    else {
      ppuVar3 = (undefined **)__rust_realloc(local_a8,local_98,1,ppuVar4);
    }
    if (ppuVar3 == (undefined **)0x0) goto LAB_0010a9b7;
  }
  local_a0 = ppuVar4;
  local_a8 = ppuVar3;
  lVar5 = (long)local_a8 + (long)local_98;
  local_98 = (undefined **)((long)local_98 + 1);
  h2e5a620cf8df7ac7(lVar5,1,0x155b53,1);
  ppuVar3 = local_a8;
  ppuVar4 = local_a0;
  if (local_a0 == local_98) {
    if ((undefined **)0xfffffffffffffffe < local_98) {
      capacity_overflow();
      goto LAB_0010aafa;
    }
    ppuVar4 = (undefined **)((long)local_98 + 1U);
    if ((undefined **)((long)local_98 + 1U) < (undefined **)((long)local_98 * 2)) {
      ppuVar4 = (undefined **)((long)local_98 * 2);
    }
    if (local_98 == (undefined **)0x0) {
      ppuVar3 = (undefined **)__rust_alloc(ppuVar4,1);
    }
    else {
      ppuVar3 = (undefined **)__rust_realloc(local_a8,local_98,1,ppuVar4);
    }
    if (ppuVar3 == (undefined **)0x0) goto LAB_0010a9b7;
  }
  local_a0 = ppuVar4;
  local_a8 = ppuVar3;
  lVar5 = (long)local_a8 + (long)local_98;
  local_98 = (undefined **)((long)local_98 + 1);
  h2e5a620cf8df7ac7(lVar5,1,0x155b57,1);
  ppuVar3 = local_a8;
  ppuVar4 = local_a0;
  if (local_a0 == local_98) {
    if ((undefined **)0xfffffffffffffffe < local_98) {
      capacity_overflow();
      goto LAB_0010aafa;
    }
    ppuVar4 = (undefined **)((long)local_98 + 1U);
    if ((undefined **)((long)local_98 + 1U) < (undefined **)((long)local_98 * 2)) {
      ppuVar4 = (undefined **)((long)local_98 * 2);
    }
    if (local_98 == (undefined **)0x0) {
      ppuVar3 = (undefined **)__rust_alloc(ppuVar4,1);
    }
    else {
      ppuVar3 = (undefined **)__rust_realloc(local_a8,local_98,1,ppuVar4);
    }
    if (ppuVar3 == (undefined **)0x0) goto LAB_0010a9b7;
  }
  local_a0 = ppuVar4;
  local_a8 = ppuVar3;
  lVar5 = (long)local_a8 + (long)local_98;
  local_98 = (undefined **)((long)local_98 + 1);
  h2e5a620cf8df7ac7(lVar5,1,0x155b52,1);
  ppuVar3 = local_a8;
  ppuVar4 = local_a0;
  if (local_a0 == local_98) {
    if ((undefined **)0xfffffffffffffffe < local_98) {
      capacity_overflow();
      goto LAB_0010aafa;
    }
    ppuVar4 = (undefined **)((long)local_98 + 1U);
    if ((undefined **)((long)local_98 + 1U) < (undefined **)((long)local_98 * 2)) {
      ppuVar4 = (undefined **)((long)local_98 * 2);
    }
    if (local_98 == (undefined **)0x0) {
      ppuVar3 = (undefined **)__rust_alloc(ppuVar4,1);
    }
    else {
      ppuVar3 = (undefined **)__rust_realloc(local_a8,local_98,1,ppuVar4);
    }
    if (ppuVar3 == (undefined **)0x0) goto LAB_0010a9b7;
  }
  local_a0 = ppuVar4;
  local_a8 = ppuVar3;
  lVar5 = (long)local_a8 + (long)local_98;
  local_98 = (undefined **)((long)local_98 + 1);
  h2e5a620cf8df7ac7(lVar5,1,0x155b53,1);
  ppuVar3 = local_a8;
  ppuVar4 = local_a0;
  if (local_a0 == local_98) {
    if ((undefined **)0xfffffffffffffffe < local_98) {
      capacity_overflow();
      goto LAB_0010aafa;
    }
    ppuVar4 = (undefined **)((long)local_98 + 1U);
    if ((undefined **)((long)local_98 + 1U) < (undefined **)((long)local_98 * 2)) {
      ppuVar4 = (undefined **)((long)local_98 * 2);
    }
    if (local_98 == (undefined **)0x0) {
      ppuVar3 = (undefined **)__rust_alloc(ppuVar4,1);
    }
    else {
      ppuVar3 = (undefined **)__rust_realloc(local_a8,local_98,1,ppuVar4);
    }
    if (ppuVar3 == (undefined **)0x0) goto LAB_0010a9b7;
  }
  local_a0 = ppuVar4;
  local_a8 = ppuVar3;
  lVar5 = (long)local_a8 + (long)local_98;
  local_98 = (undefined **)((long)local_98 + 1);
  h2e5a620cf8df7ac7(lVar5,1,0x155b58,1);
  ppuVar3 = local_a8;
  ppuVar4 = local_a0;
  if (local_a0 == local_98) {
    if ((undefined **)0xfffffffffffffffe < local_98) {
      capacity_overflow();
      goto LAB_0010aafa;
    }
    ppuVar4 = (undefined **)((long)local_98 + 1U);
    if ((undefined **)((long)local_98 + 1U) < (undefined **)((long)local_98 * 2)) {
      ppuVar4 = (undefined **)((long)local_98 * 2);
    }
    if (local_98 == (undefined **)0x0) {
      ppuVar3 = (undefined **)__rust_alloc(ppuVar4,1);
    }
    else {
      ppuVar3 = (undefined **)__rust_realloc(local_a8,local_98,1,ppuVar4);
    }
    if (ppuVar3 == (undefined **)0x0) goto LAB_0010a9b7;
  }
  local_a0 = ppuVar4;
  local_a8 = ppuVar3;
  lVar5 = (long)local_a8 + (long)local_98;
  local_98 = (undefined **)((long)local_98 + 1);
  h2e5a620cf8df7ac7(lVar5,1,0x155b59,1);
  ppuVar3 = local_a8;
  ppuVar4 = local_a0;
  if (local_a0 == local_98) {
    if ((undefined **)0xfffffffffffffffe < local_98) {
      capacity_overflow();
      goto LAB_0010aafa;
    }
    ppuVar4 = (undefined **)((long)local_98 + 1U);
    if ((undefined **)((long)local_98 + 1U) < (undefined **)((long)local_98 * 2)) {
      ppuVar4 = (undefined **)((long)local_98 * 2);
    }
    if (local_98 == (undefined **)0x0) {
      ppuVar3 = (undefined **)__rust_alloc(ppuVar4,1);
    }
    else {
      ppuVar3 = (undefined **)__rust_realloc(local_a8,local_98,1,ppuVar4);
    }
    if (ppuVar3 == (undefined **)0x0) goto LAB_0010a9b7;
  }
  local_a0 = ppuVar4;
  local_a8 = ppuVar3;
  lVar5 = (long)local_a8 + (long)local_98;
  local_98 = (undefined **)((long)local_98 + 1);
  h2e5a620cf8df7ac7(lVar5,1,0x155b5a,1);
  ppuVar3 = local_a8;
  ppuVar4 = local_a0;
  if (local_a0 == local_98) {
    if ((undefined **)0xfffffffffffffffe < local_98) {
      capacity_overflow();
      goto LAB_0010aafa;
    }
    ppuVar4 = (undefined **)((long)local_98 + 1U);
    if ((undefined **)((long)local_98 + 1U) < (undefined **)((long)local_98 * 2)) {
      ppuVar4 = (undefined **)((long)local_98 * 2);
    }
    if (local_98 == (undefined **)0x0) {
      ppuVar3 = (undefined **)__rust_alloc(ppuVar4,1);
    }
    else {
      ppuVar3 = (undefined **)__rust_realloc(local_a8,local_98,1,ppuVar4);
    }
    if (ppuVar3 == (undefined **)0x0) goto LAB_0010a9b7;
  }
  local_a0 = ppuVar4;
  local_a8 = ppuVar3;
  lVar5 = (long)local_a8 + (long)local_98;
  local_98 = (undefined **)((long)local_98 + 1);
  h2e5a620cf8df7ac7(lVar5,1,0x155b5b,1);
  ppuVar3 = local_a8;
  ppuVar4 = local_a0;
  if (local_a0 == local_98) {
    if ((undefined **)0xfffffffffffffffe < local_98) {
      capacity_overflow();
      goto LAB_0010aafa;
    }
    ppuVar4 = (undefined **)((long)local_98 + 1U);
    if ((undefined **)((long)local_98 + 1U) < (undefined **)((long)local_98 * 2)) {
      ppuVar4 = (undefined **)((long)local_98 * 2);
    }
    if (local_98 == (undefined **)0x0) {
      ppuVar3 = (undefined **)__rust_alloc(ppuVar4,1);
    }
    else {
      ppuVar3 = (undefined **)__rust_realloc(local_a8,local_98,1,ppuVar4);
    }
    if (ppuVar3 == (undefined **)0x0) {
LAB_0010a9b7:
      handle_alloc_error(ppuVar4,1);
      do {
        invalidInstructionException();
      } while( true );
    }
  }
  local_a0 = ppuVar4;
  local_a8 = ppuVar3;
  lVar5 = (long)local_a8 + (long)local_98;
  local_98 = (undefined **)((long)local_98 + 1);
  h2e5a620cf8df7ac7(lVar5,1,0x155b5c,1);
  ppuVar3 = local_a8;
  local_68 = local_98;
  local_78._0_8_ = local_a8;
  local_78._8_8_ = local_a0;
  if (__n == local_98) {
    if (SUB168(auVar7,0) == local_a8) {
      bVar6 = true;
    }
    else {
      iVar2 = memcmp(SUB168(auVar7,0),local_a8,(size_t)__n);
      bVar6 = iVar2 == 0;
    }
  }
  else {
    bVar6 = false;
  }
  if (local_78._8_8_ != (undefined **)0x0) {
    __rust_dealloc(ppuVar3,local_78._8_8_,1);
  }
  if (bVar6) {
    hb5d9f8d72916ce70(&local_a8,
                                            
                      "/tmp/flag.txt[-] Unable to read flag.txt[+] Vault unlocked\n[+] Here\'s yourprecious flag: [-] Incorrect!\nstream did not contain valid UTF-8assertionfailed: `(left == right)`\n  left: ``,\n right: ``: destination and sourceslices have different lengths"
                      ,0xd);
    if (local_a8 == (undefined **)0x1) {
      local_78._0_8_ = local_a0;
      local_78._8_8_ = local_98;
      he69c88696e456312(0x155bfd,0x1b,local_78);
      goto LAB_0010aafa;
    }
    local_68 = local_90;
    local_78._0_8_ = local_a0;
    local_78._8_8_ = local_98;
    local_a8 = &PTR_s_[+]_Vault_unlocked_[+]_Here's_yo_0036ab10;
    local_a0 = (undefined **)0x1;
    local_98 = (undefined **)0x0;
    local_88 = "Invalid input[*] You entered: \n";
    local_80 = 0;
    _print(&local_a8);
    local_38 = h0c5204a4d0e1be39;
    local_a8 = &PTR_s_[+]_Here's_your_precious_flag:_[_0036ab20;
    local_a0 = (undefined **)0x2;
    local_98 = (undefined **)&DAT_00155bb0;
    local_90 = (undefined **)0x1;
    local_88 = (char *)&local_40;
    local_80 = 1;
    local_40 = (undefined8 *)local_78;
    _print(&local_a8);
    if (local_78._8_8_ != (undefined **)0x0) {
      __rust_dealloc(local_78._0_8_,local_78._8_8_,1);
      lVar5 = CONCAT44(uStack76,local_50);
      goto joined_r0x0010a97c;
    }
  }
  else {
    local_a8 = &PTR_s_[-]_Incorrect!_stream_did_not_co_0036ab40;
    local_a0 = (undefined **)0x1;
    local_98 = (undefined **)0x0;
    local_88 = "Invalid input[*] You entered: \n";
    local_80 = 0;
    _print(&local_a8);
  }
  lVar5 = CONCAT44(uStack76,local_50);
joined_r0x0010a97c:
  if (lVar5 != 0) {
    __rust_dealloc(local_58,lVar5,1);
  }
  return;
}


void main(int param_1,undefined8 param_2)

{
  code *local_8;
  
  local_8 = h01669180137fcbb4;
  lang_start_internal(&local_8,anon.4e5ae921a0abba8576a078a69e298cf1.0.llvm.11140362644264669943,
                      (long)param_1,param_2);
  return;
}


