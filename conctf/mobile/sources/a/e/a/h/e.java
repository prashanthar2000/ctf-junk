package a.e.a.h;

import a.b.k.o;
import a.e.a.h.c;
import a.e.a.h.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class e extends n {
    public int A0 = 0;
    public int B0 = 0;
    public int C0 = 7;
    public boolean D0 = false;
    public boolean E0 = false;
    public boolean F0 = false;
    public boolean l0 = false;
    public a.e.a.e m0 = new a.e.a.e();
    public m n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0 = 0;
    public int t0 = 0;
    public b[] u0 = new b[4];
    public b[] v0 = new b[4];
    public List<f> w0 = new ArrayList();
    public boolean x0 = false;
    public boolean y0 = false;
    public boolean z0 = false;

    public void a(int i) {
        super.a(i);
        int size = this.k0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.k0.get(i2).a(i);
        }
    }

    public void a(d dVar, int i) {
        if (i == 0) {
            int i2 = this.s0 + 1;
            b[] bVarArr = this.v0;
            if (i2 >= bVarArr.length) {
                this.v0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            this.v0[this.s0] = new b(dVar, 0, this.l0);
            this.s0++;
        } else if (i == 1) {
            int i3 = this.t0 + 1;
            b[] bVarArr2 = this.u0;
            if (i3 >= bVarArr2.length) {
                this.u0 = (b[]) Arrays.copyOf(bVarArr2, bVarArr2.length * 2);
            }
            this.u0[this.t0] = new b(dVar, 1, this.l0);
            this.t0++;
        }
    }

    public void d(int i, int i2) {
        k kVar;
        k kVar2;
        if (!(this.C[0] == d.a.WRAP_CONTENT || (kVar2 = this.c) == null)) {
            kVar2.a(i);
        }
        if (this.C[1] != d.a.WRAP_CONTENT && (kVar = this.d) != null) {
            kVar.a(i2);
        }
    }

    public boolean d(a.e.a.e eVar) {
        a(eVar);
        int size = this.k0.size();
        for (int i = 0; i < size; i++) {
            d dVar = this.k0.get(i);
            if (dVar instanceof e) {
                d.a[] aVarArr = dVar.C;
                d.a aVar = aVarArr[0];
                d.a aVar2 = aVarArr[1];
                if (aVar == d.a.WRAP_CONTENT) {
                    dVar.a(d.a.FIXED);
                }
                if (aVar2 == d.a.WRAP_CONTENT) {
                    dVar.b(d.a.FIXED);
                }
                dVar.a(eVar);
                if (aVar == d.a.WRAP_CONTENT) {
                    dVar.a(aVar);
                }
                if (aVar2 == d.a.WRAP_CONTENT) {
                    dVar.b(aVar2);
                }
            } else {
                if (this.C[0] != d.a.WRAP_CONTENT && dVar.C[0] == d.a.MATCH_PARENT) {
                    int i2 = dVar.s.e;
                    int j = j() - dVar.u.e;
                    c cVar = dVar.s;
                    cVar.i = eVar.a((Object) cVar);
                    c cVar2 = dVar.u;
                    cVar2.i = eVar.a((Object) cVar2);
                    eVar.a(dVar.s.i, i2);
                    eVar.a(dVar.u.i, j);
                    dVar.f242a = 2;
                    dVar.a(i2, j);
                }
                if (this.C[1] != d.a.WRAP_CONTENT && dVar.C[1] == d.a.MATCH_PARENT) {
                    int i3 = dVar.t.e;
                    int d = d() - dVar.v.e;
                    c cVar3 = dVar.t;
                    cVar3.i = eVar.a((Object) cVar3);
                    c cVar4 = dVar.v;
                    cVar4.i = eVar.a((Object) cVar4);
                    eVar.a(dVar.t.i, i3);
                    eVar.a(dVar.v.i, d);
                    if (dVar.Q > 0 || dVar.Y == 8) {
                        c cVar5 = dVar.w;
                        cVar5.i = eVar.a((Object) cVar5);
                        eVar.a(dVar.w.i, dVar.Q + i3);
                    }
                    dVar.f243b = 2;
                    dVar.c(i3, d);
                }
                dVar.a(eVar);
            }
        }
        if (this.s0 > 0) {
            o.a(this, eVar, 0);
        }
        if (this.t0 > 0) {
            o.a(this, eVar, 1);
        }
        return true;
    }

    public boolean g(int i) {
        return (this.C0 & i) == i;
    }

    public void l() {
        this.m0.f();
        this.o0 = 0;
        this.q0 = 0;
        this.p0 = 0;
        this.r0 = 0;
        this.w0.clear();
        this.D0 = false;
        super.l();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: a.e.a.h.e} */
    /* JADX WARNING: type inference failed for: r8v12, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p() {
        /*
            r25 = this;
            r1 = r25
            int r2 = r1.I
            int r3 = r1.J
            int r0 = r25.j()
            r4 = 0
            int r5 = java.lang.Math.max(r4, r0)
            int r0 = r25.d()
            int r6 = java.lang.Math.max(r4, r0)
            r1.E0 = r4
            r1.F0 = r4
            a.e.a.h.d r0 = r1.D
            if (r0 == 0) goto L_0x00b3
            a.e.a.h.m r0 = r1.n0
            if (r0 != 0) goto L_0x002a
            a.e.a.h.m r0 = new a.e.a.h.m
            r0.<init>(r1)
            r1.n0 = r0
        L_0x002a:
            a.e.a.h.m r0 = r1.n0
            r7 = 0
            if (r0 == 0) goto L_0x00b2
            int r8 = r1.I
            r0.f250a = r8
            int r8 = r1.J
            r0.f251b = r8
            int r8 = r25.j()
            r0.c = r8
            int r8 = r25.d()
            r0.d = r8
            java.util.ArrayList<a.e.a.h.m$a> r8 = r0.e
            int r8 = r8.size()
            r9 = r4
        L_0x004a:
            if (r9 >= r8) goto L_0x0081
            java.util.ArrayList<a.e.a.h.m$a> r10 = r0.e
            java.lang.Object r10 = r10.get(r9)
            a.e.a.h.m$a r10 = (a.e.a.h.m.a) r10
            a.e.a.h.c r11 = r10.f252a
            a.e.a.h.c$c r11 = r11.c
            a.e.a.h.c r11 = r1.a((a.e.a.h.c.C0011c) r11)
            r10.f252a = r11
            if (r11 == 0) goto L_0x0073
            a.e.a.h.c r12 = r11.d
            r10.f253b = r12
            int r11 = r11.a()
            r10.c = r11
            a.e.a.h.c r11 = r10.f252a
            a.e.a.h.c$b r12 = r11.g
            r10.d = r12
            int r11 = r11.h
            goto L_0x007c
        L_0x0073:
            r10.f253b = r7
            r10.c = r4
            a.e.a.h.c$b r11 = a.e.a.h.c.b.STRONG
            r10.d = r11
            r11 = r4
        L_0x007c:
            r10.e = r11
            int r9 = r9 + 1
            goto L_0x004a
        L_0x0081:
            int r0 = r1.o0
            r1.I = r0
            int r0 = r1.p0
            r1.J = r0
            a.e.a.h.d r0 = r1.D
            if (r0 == 0) goto L_0x0093
            boolean r7 = r0 instanceof a.e.a.h.e
            if (r7 == 0) goto L_0x0093
            a.e.a.h.e r0 = (a.e.a.h.e) r0
        L_0x0093:
            java.util.ArrayList<a.e.a.h.c> r0 = r1.B
            int r0 = r0.size()
            r7 = r4
        L_0x009a:
            if (r7 >= r0) goto L_0x00aa
            java.util.ArrayList<a.e.a.h.c> r8 = r1.B
            java.lang.Object r8 = r8.get(r7)
            a.e.a.h.c r8 = (a.e.a.h.c) r8
            r8.c()
            int r7 = r7 + 1
            goto L_0x009a
        L_0x00aa:
            a.e.a.e r0 = r1.m0
            a.e.a.c r0 = r0.l
            r1.a(r0)
            goto L_0x00b7
        L_0x00b2:
            throw r7
        L_0x00b3:
            r1.I = r4
            r1.J = r4
        L_0x00b7:
            int r0 = r1.C0
            r7 = 8
            r8 = 32
            r9 = 1
            if (r0 == 0) goto L_0x00e2
            boolean r0 = r1.g(r7)
            if (r0 != 0) goto L_0x00c9
            r25.q()
        L_0x00c9:
            boolean r0 = r1.g(r8)
            if (r0 != 0) goto L_0x00dd
            boolean r0 = r1.g(r7)
            if (r0 != 0) goto L_0x00da
            int r0 = r1.C0
            r1.a(r0)
        L_0x00da:
            r25.t()
        L_0x00dd:
            a.e.a.e r0 = r1.m0
            r0.g = r9
            goto L_0x00e6
        L_0x00e2:
            a.e.a.e r0 = r1.m0
            r0.g = r4
        L_0x00e6:
            a.e.a.h.d$a[] r0 = r1.C
            r10 = r0[r9]
            r11 = r0[r4]
            r25.s()
            java.util.List<a.e.a.h.f> r0 = r1.w0
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0108
            java.util.List<a.e.a.h.f> r0 = r1.w0
            r0.clear()
            java.util.List<a.e.a.h.f> r0 = r1.w0
            a.e.a.h.f r12 = new a.e.a.h.f
            java.util.ArrayList<a.e.a.h.d> r13 = r1.k0
            r12.<init>(r13)
            r0.add(r4, r12)
        L_0x0108:
            java.util.List<a.e.a.h.f> r0 = r1.w0
            int r12 = r0.size()
            java.util.ArrayList<a.e.a.h.d> r13 = r1.k0
            a.e.a.h.d$a r0 = r25.e()
            a.e.a.h.d$a r14 = a.e.a.h.d.a.WRAP_CONTENT
            if (r0 == r14) goto L_0x0123
            a.e.a.h.d$a r0 = r25.i()
            a.e.a.h.d$a r14 = a.e.a.h.d.a.WRAP_CONTENT
            if (r0 != r14) goto L_0x0121
            goto L_0x0123
        L_0x0121:
            r14 = r4
            goto L_0x0124
        L_0x0123:
            r14 = r9
        L_0x0124:
            r0 = r4
            r15 = r0
        L_0x0126:
            if (r15 >= r12) goto L_0x042d
            boolean r7 = r1.D0
            if (r7 != 0) goto L_0x042d
            java.util.List<a.e.a.h.f> r7 = r1.w0
            java.lang.Object r7 = r7.get(r15)
            a.e.a.h.f r7 = (a.e.a.h.f) r7
            boolean r7 = r7.d
            if (r7 == 0) goto L_0x013e
            r22 = r3
            r19 = r12
            goto L_0x041f
        L_0x013e:
            boolean r7 = r1.g(r8)
            if (r7 == 0) goto L_0x01ac
            a.e.a.h.d$a r7 = r25.e()
            a.e.a.h.d$a r8 = a.e.a.h.d.a.FIXED
            if (r7 != r8) goto L_0x019e
            a.e.a.h.d$a r7 = r25.i()
            a.e.a.h.d$a r8 = a.e.a.h.d.a.FIXED
            if (r7 != r8) goto L_0x019e
            java.util.List<a.e.a.h.f> r7 = r1.w0
            java.lang.Object r7 = r7.get(r15)
            a.e.a.h.f r7 = (a.e.a.h.f) r7
            java.util.List<a.e.a.h.d> r8 = r7.j
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0165
            goto L_0x019b
        L_0x0165:
            java.util.List<a.e.a.h.d> r8 = r7.f245a
            int r8 = r8.size()
        L_0x016b:
            if (r4 >= r8) goto L_0x0188
            java.util.List<a.e.a.h.d> r9 = r7.f245a
            java.lang.Object r9 = r9.get(r4)
            a.e.a.h.d r9 = (a.e.a.h.d) r9
            r17 = r8
            boolean r8 = r9.b0
            if (r8 != 0) goto L_0x0182
            java.util.List<a.e.a.h.d> r8 = r7.j
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r7.a((java.util.ArrayList<a.e.a.h.d>) r8, (a.e.a.h.d) r9)
        L_0x0182:
            int r4 = r4 + 1
            r8 = r17
            r9 = 1
            goto L_0x016b
        L_0x0188:
            java.util.List<a.e.a.h.d> r4 = r7.k
            r4.clear()
            java.util.List<a.e.a.h.d> r4 = r7.k
            java.util.List<a.e.a.h.d> r8 = r7.f245a
            r4.addAll(r8)
            java.util.List<a.e.a.h.d> r4 = r7.k
            java.util.List<a.e.a.h.d> r8 = r7.j
            r4.removeAll(r8)
        L_0x019b:
            java.util.List<a.e.a.h.d> r4 = r7.j
            goto L_0x01a8
        L_0x019e:
            java.util.List<a.e.a.h.f> r4 = r1.w0
            java.lang.Object r4 = r4.get(r15)
            a.e.a.h.f r4 = (a.e.a.h.f) r4
            java.util.List<a.e.a.h.d> r4 = r4.f245a
        L_0x01a8:
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r1.k0 = r4
        L_0x01ac:
            r25.s()
            java.util.ArrayList<a.e.a.h.d> r4 = r1.k0
            int r4 = r4.size()
            r7 = 0
        L_0x01b6:
            if (r7 >= r4) goto L_0x01cc
            java.util.ArrayList<a.e.a.h.d> r8 = r1.k0
            java.lang.Object r8 = r8.get(r7)
            a.e.a.h.d r8 = (a.e.a.h.d) r8
            boolean r9 = r8 instanceof a.e.a.h.n
            if (r9 == 0) goto L_0x01c9
            a.e.a.h.n r8 = (a.e.a.h.n) r8
            r8.p()
        L_0x01c9:
            int r7 = r7 + 1
            goto L_0x01b6
        L_0x01cc:
            r7 = r0
            r0 = 0
            r8 = 1
        L_0x01cf:
            if (r8 == 0) goto L_0x03f8
            r17 = r7
            r9 = 1
            int r7 = r0 + 1
            a.e.a.e r0 = r1.m0     // Catch:{ Exception -> 0x0231 }
            r0.f()     // Catch:{ Exception -> 0x0231 }
            r25.s()     // Catch:{ Exception -> 0x0231 }
            a.e.a.e r0 = r1.m0     // Catch:{ Exception -> 0x0231 }
            r1.b((a.e.a.e) r0)     // Catch:{ Exception -> 0x0231 }
            r0 = 0
        L_0x01e4:
            if (r0 >= r4) goto L_0x01fa
            java.util.ArrayList<a.e.a.h.d> r9 = r1.k0     // Catch:{ Exception -> 0x0231 }
            java.lang.Object r9 = r9.get(r0)     // Catch:{ Exception -> 0x0231 }
            a.e.a.h.d r9 = (a.e.a.h.d) r9     // Catch:{ Exception -> 0x0231 }
            r18 = r8
            a.e.a.e r8 = r1.m0     // Catch:{ Exception -> 0x022f }
            r9.b((a.e.a.e) r8)     // Catch:{ Exception -> 0x022f }
            int r0 = r0 + 1
            r8 = r18
            goto L_0x01e4
        L_0x01fa:
            r18 = r8
            a.e.a.e r0 = r1.m0     // Catch:{ Exception -> 0x022f }
            r1.d(r0)     // Catch:{ Exception -> 0x022f }
            a.e.a.e r0 = r1.m0     // Catch:{ Exception -> 0x022b }
            boolean r8 = r0.g     // Catch:{ Exception -> 0x022b }
            if (r8 == 0) goto L_0x0221
            r8 = 0
        L_0x0208:
            int r9 = r0.j     // Catch:{ Exception -> 0x022b }
            if (r8 >= r9) goto L_0x0219
            a.e.a.b[] r9 = r0.f     // Catch:{ Exception -> 0x022b }
            r9 = r9[r8]     // Catch:{ Exception -> 0x022b }
            boolean r9 = r9.e     // Catch:{ Exception -> 0x022b }
            if (r9 != 0) goto L_0x0216
            r8 = 0
            goto L_0x021a
        L_0x0216:
            int r8 = r8 + 1
            goto L_0x0208
        L_0x0219:
            r8 = 1
        L_0x021a:
            if (r8 != 0) goto L_0x021d
            goto L_0x0221
        L_0x021d:
            r0.a()     // Catch:{ Exception -> 0x022b }
            goto L_0x0226
        L_0x0221:
            a.e.a.e$a r8 = r0.c     // Catch:{ Exception -> 0x022b }
            r0.a((a.e.a.e.a) r8)     // Catch:{ Exception -> 0x022b }
        L_0x0226:
            r19 = r12
            r18 = 1
            goto L_0x024f
        L_0x022b:
            r0 = move-exception
            r18 = 1
            goto L_0x0234
        L_0x022f:
            r0 = move-exception
            goto L_0x0234
        L_0x0231:
            r0 = move-exception
            r18 = r8
        L_0x0234:
            r0.printStackTrace()
            java.io.PrintStream r8 = java.lang.System.out
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r19 = r12
            java.lang.String r12 = "EXCEPTION : "
            r9.append(r12)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            r8.println(r0)
        L_0x024f:
            r0 = 2
            if (r18 == 0) goto L_0x02b0
            a.e.a.e r8 = r1.m0
            boolean[] r9 = a.e.a.h.i.f247a
            r16 = 0
            r9[r0] = r16
            r1.c((a.e.a.e) r8)
            java.util.ArrayList<a.e.a.h.d> r12 = r1.k0
            int r12 = r12.size()
            r0 = r16
        L_0x0265:
            if (r0 >= r12) goto L_0x02ad
            r20 = r12
            java.util.ArrayList<a.e.a.h.d> r12 = r1.k0
            java.lang.Object r12 = r12.get(r0)
            a.e.a.h.d r12 = (a.e.a.h.d) r12
            r12.c((a.e.a.e) r8)
            r21 = r8
            a.e.a.h.d$a[] r8 = r12.C
            r8 = r8[r16]
            r22 = r3
            a.e.a.h.d$a r3 = a.e.a.h.d.a.MATCH_CONSTRAINT
            if (r8 != r3) goto L_0x028d
            int r3 = r12.j()
            int r8 = r12.T
            if (r3 >= r8) goto L_0x028d
            r3 = 2
            r8 = 1
            r9[r3] = r8
            goto L_0x028e
        L_0x028d:
            r8 = 1
        L_0x028e:
            a.e.a.h.d$a[] r3 = r12.C
            r3 = r3[r8]
            a.e.a.h.d$a r8 = a.e.a.h.d.a.MATCH_CONSTRAINT
            if (r3 != r8) goto L_0x02a2
            int r3 = r12.d()
            int r8 = r12.U
            if (r3 >= r8) goto L_0x02a2
            r3 = 2
            r8 = 1
            r9[r3] = r8
        L_0x02a2:
            int r0 = r0 + 1
            r12 = r20
            r8 = r21
            r3 = r22
            r16 = 0
            goto L_0x0265
        L_0x02ad:
            r22 = r3
            goto L_0x02f4
        L_0x02b0:
            r22 = r3
            a.e.a.e r0 = r1.m0
            r1.c((a.e.a.e) r0)
            r0 = 0
        L_0x02b8:
            if (r0 >= r4) goto L_0x02f4
            java.util.ArrayList<a.e.a.h.d> r3 = r1.k0
            java.lang.Object r3 = r3.get(r0)
            a.e.a.h.d r3 = (a.e.a.h.d) r3
            a.e.a.h.d$a[] r8 = r3.C
            r9 = 0
            r8 = r8[r9]
            a.e.a.h.d$a r9 = a.e.a.h.d.a.MATCH_CONSTRAINT
            if (r8 != r9) goto L_0x02da
            int r8 = r3.j()
            int r9 = r3.T
            if (r8 >= r9) goto L_0x02da
            boolean[] r0 = a.e.a.h.i.f247a
            r3 = 2
            r8 = 1
            r0[r3] = r8
            goto L_0x02f4
        L_0x02da:
            r8 = 1
            a.e.a.h.d$a[] r9 = r3.C
            r9 = r9[r8]
            a.e.a.h.d$a r12 = a.e.a.h.d.a.MATCH_CONSTRAINT
            if (r9 != r12) goto L_0x02f1
            int r9 = r3.d()
            int r3 = r3.U
            if (r9 >= r3) goto L_0x02f1
            boolean[] r0 = a.e.a.h.i.f247a
            r3 = 2
            r0[r3] = r8
            goto L_0x02f4
        L_0x02f1:
            int r0 = r0 + 1
            goto L_0x02b8
        L_0x02f4:
            if (r14 == 0) goto L_0x0367
            r3 = 8
            if (r7 >= r3) goto L_0x0367
            boolean[] r0 = a.e.a.h.i.f247a
            r8 = 2
            boolean r0 = r0[r8]
            if (r0 == 0) goto L_0x0367
            r0 = 0
            r8 = 0
            r9 = 0
        L_0x0304:
            if (r0 >= r4) goto L_0x032a
            java.util.ArrayList<a.e.a.h.d> r12 = r1.k0
            java.lang.Object r12 = r12.get(r0)
            a.e.a.h.d r12 = (a.e.a.h.d) r12
            int r3 = r12.I
            int r18 = r12.j()
            int r3 = r18 + r3
            int r8 = java.lang.Math.max(r8, r3)
            int r3 = r12.J
            int r12 = r12.d()
            int r12 = r12 + r3
            int r9 = java.lang.Math.max(r9, r12)
            int r0 = r0 + 1
            r3 = 8
            goto L_0x0304
        L_0x032a:
            int r0 = r1.R
            int r0 = java.lang.Math.max(r0, r8)
            int r3 = r1.S
            int r3 = java.lang.Math.max(r3, r9)
            a.e.a.h.d$a r8 = a.e.a.h.d.a.WRAP_CONTENT
            if (r11 != r8) goto L_0x034e
            int r8 = r25.j()
            if (r8 >= r0) goto L_0x034e
            r1.f(r0)
            a.e.a.h.d$a[] r0 = r1.C
            a.e.a.h.d$a r8 = a.e.a.h.d.a.WRAP_CONTENT
            r9 = 0
            r0[r9] = r8
            r0 = 1
            r17 = 1
            goto L_0x034f
        L_0x034e:
            r0 = 0
        L_0x034f:
            a.e.a.h.d$a r8 = a.e.a.h.d.a.WRAP_CONTENT
            if (r10 != r8) goto L_0x0368
            int r8 = r25.d()
            if (r8 >= r3) goto L_0x0368
            r1.e(r3)
            a.e.a.h.d$a[] r0 = r1.C
            a.e.a.h.d$a r3 = a.e.a.h.d.a.WRAP_CONTENT
            r8 = 1
            r0[r8] = r3
            r0 = 1
            r17 = 1
            goto L_0x0368
        L_0x0367:
            r0 = 0
        L_0x0368:
            int r3 = r1.R
            int r8 = r25.j()
            int r3 = java.lang.Math.max(r3, r8)
            int r8 = r25.j()
            if (r3 <= r8) goto L_0x0385
            r1.f(r3)
            a.e.a.h.d$a[] r0 = r1.C
            a.e.a.h.d$a r3 = a.e.a.h.d.a.FIXED
            r8 = 0
            r0[r8] = r3
            r0 = 1
            r17 = 1
        L_0x0385:
            int r3 = r1.S
            int r8 = r25.d()
            int r3 = java.lang.Math.max(r3, r8)
            int r8 = r25.d()
            if (r3 <= r8) goto L_0x03a2
            r1.e(r3)
            a.e.a.h.d$a[] r0 = r1.C
            a.e.a.h.d$a r3 = a.e.a.h.d.a.FIXED
            r8 = 1
            r0[r8] = r3
            r0 = r8
            r9 = r0
            goto L_0x03a5
        L_0x03a2:
            r8 = 1
            r9 = r17
        L_0x03a5:
            if (r9 != 0) goto L_0x03ef
            a.e.a.h.d$a[] r3 = r1.C
            r12 = 0
            r3 = r3[r12]
            a.e.a.h.d$a r12 = a.e.a.h.d.a.WRAP_CONTENT
            if (r3 != r12) goto L_0x03c7
            if (r5 <= 0) goto L_0x03c7
            int r3 = r25.j()
            if (r3 <= r5) goto L_0x03c7
            r1.E0 = r8
            a.e.a.h.d$a[] r0 = r1.C
            a.e.a.h.d$a r3 = a.e.a.h.d.a.FIXED
            r9 = 0
            r0[r9] = r3
            r1.f(r5)
            r0 = r8
            r9 = r0
            goto L_0x03cc
        L_0x03c7:
            r24 = r9
            r9 = r0
            r0 = r24
        L_0x03cc:
            a.e.a.h.d$a[] r3 = r1.C
            r3 = r3[r8]
            a.e.a.h.d$a r12 = a.e.a.h.d.a.WRAP_CONTENT
            if (r3 != r12) goto L_0x03ea
            if (r6 <= 0) goto L_0x03ea
            int r3 = r25.d()
            if (r3 <= r6) goto L_0x03ea
            r1.F0 = r8
            a.e.a.h.d$a[] r0 = r1.C
            a.e.a.h.d$a r3 = a.e.a.h.d.a.FIXED
            r0[r8] = r3
            r1.e(r6)
            r8 = 1
            r9 = 1
            goto L_0x03f0
        L_0x03ea:
            r24 = r9
            r9 = r0
            r0 = r24
        L_0x03ef:
            r8 = r0
        L_0x03f0:
            r0 = r7
            r7 = r9
            r12 = r19
            r3 = r22
            goto L_0x01cf
        L_0x03f8:
            r22 = r3
            r17 = r7
            r19 = r12
            java.util.List<a.e.a.h.f> r0 = r1.w0
            java.lang.Object r0 = r0.get(r15)
            a.e.a.h.f r0 = (a.e.a.h.f) r0
            java.util.List<a.e.a.h.d> r3 = r0.k
            int r3 = r3.size()
            r4 = 0
        L_0x040d:
            if (r4 >= r3) goto L_0x041d
            java.util.List<a.e.a.h.d> r7 = r0.k
            java.lang.Object r7 = r7.get(r4)
            a.e.a.h.d r7 = (a.e.a.h.d) r7
            r0.a(r7)
            int r4 = r4 + 1
            goto L_0x040d
        L_0x041d:
            r0 = r17
        L_0x041f:
            int r15 = r15 + 1
            r12 = r19
            r3 = r22
            r4 = 0
            r7 = 8
            r8 = 32
            r9 = 1
            goto L_0x0126
        L_0x042d:
            r22 = r3
            r1.k0 = r13
            a.e.a.h.d r3 = r1.D
            if (r3 == 0) goto L_0x04a3
            int r2 = r1.R
            int r3 = r25.j()
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r1.S
            int r4 = r25.d()
            int r3 = java.lang.Math.max(r3, r4)
            a.e.a.h.m r4 = r1.n0
            int r5 = r4.f250a
            r1.I = r5
            int r5 = r4.f251b
            r1.J = r5
            int r5 = r4.c
            r1.f(r5)
            int r5 = r4.d
            r1.e(r5)
            java.util.ArrayList<a.e.a.h.m$a> r5 = r4.e
            int r5 = r5.size()
            r6 = 0
        L_0x0464:
            if (r6 >= r5) goto L_0x0490
            java.util.ArrayList<a.e.a.h.m$a> r7 = r4.e
            java.lang.Object r7 = r7.get(r6)
            a.e.a.h.m$a r7 = (a.e.a.h.m.a) r7
            a.e.a.h.c r8 = r7.f252a
            a.e.a.h.c$c r8 = r8.c
            a.e.a.h.c r17 = r1.a((a.e.a.h.c.C0011c) r8)
            a.e.a.h.c r8 = r7.f253b
            int r9 = r7.c
            a.e.a.h.c$b r12 = r7.d
            int r7 = r7.e
            r20 = -1
            r23 = 0
            r18 = r8
            r19 = r9
            r21 = r12
            r22 = r7
            r17.a(r18, r19, r20, r21, r22, r23)
            int r6 = r6 + 1
            goto L_0x0464
        L_0x0490:
            int r4 = r1.o0
            int r2 = r2 + r4
            int r4 = r1.q0
            int r2 = r2 + r4
            r1.f(r2)
            int r2 = r1.p0
            int r3 = r3 + r2
            int r2 = r1.r0
            int r3 = r3 + r2
            r1.e(r3)
            goto L_0x04a9
        L_0x04a3:
            r1.I = r2
            r2 = r22
            r1.J = r2
        L_0x04a9:
            if (r0 == 0) goto L_0x04b3
            a.e.a.h.d$a[] r0 = r1.C
            r2 = 0
            r0[r2] = r11
            r2 = 1
            r0[r2] = r10
        L_0x04b3:
            a.e.a.e r0 = r1.m0
            a.e.a.c r0 = r0.l
            r1.a(r0)
            a.e.a.h.d r0 = r1.D
            r2 = r1
        L_0x04bd:
            if (r0 == 0) goto L_0x04ca
            a.e.a.h.d r3 = r0.D
            boolean r4 = r0 instanceof a.e.a.h.e
            if (r4 == 0) goto L_0x04c8
            r2 = r0
            a.e.a.h.e r2 = (a.e.a.h.e) r2
        L_0x04c8:
            r0 = r3
            goto L_0x04bd
        L_0x04ca:
            if (r1 != r2) goto L_0x04cf
            r25.o()
        L_0x04cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.h.e.p():void");
    }

    public void q() {
        int size = this.k0.size();
        m();
        for (int i = 0; i < size; i++) {
            this.k0.get(i).m();
        }
    }

    public void r() {
        q();
        a(this.C0);
    }

    public final void s() {
        this.s0 = 0;
        this.t0 = 0;
    }

    public void t() {
        j jVar = a(c.C0011c.LEFT).f237a;
        j jVar2 = a(c.C0011c.TOP).f237a;
        jVar.a((j) null, 0.0f);
        jVar2.a((j) null, 0.0f);
    }
}
