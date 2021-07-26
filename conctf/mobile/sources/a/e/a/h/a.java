package a.e.a.h;

import a.e.a.b;
import a.e.a.e;
import a.e.a.g;
import a.e.a.h.d;
import java.util.ArrayList;

public class a extends h {
    public int m0 = 0;
    public ArrayList<j> n0 = new ArrayList<>(4);
    public boolean o0 = true;

    public void a(e eVar) {
        c[] cVarArr;
        boolean z;
        g gVar;
        c cVar;
        int i;
        int i2;
        c[] cVarArr2 = this.A;
        cVarArr2[0] = this.s;
        cVarArr2[2] = this.t;
        cVarArr2[1] = this.u;
        cVarArr2[3] = this.v;
        int i3 = 0;
        while (true) {
            cVarArr = this.A;
            if (i3 >= cVarArr.length) {
                break;
            }
            cVarArr[i3].i = eVar.a((Object) cVarArr[i3]);
            i3++;
        }
        int i4 = this.m0;
        if (i4 >= 0 && i4 < 4) {
            c cVar2 = cVarArr[i4];
            int i5 = 0;
            while (true) {
                if (i5 >= this.l0) {
                    z = false;
                    break;
                }
                d dVar = this.k0[i5];
                if ((this.o0 || dVar.a()) && ((((i = this.m0) == 0 || i == 1) && dVar.e() == d.a.MATCH_CONSTRAINT) || (((i2 = this.m0) == 2 || i2 == 3) && dVar.i() == d.a.MATCH_CONSTRAINT))) {
                    z = true;
                } else {
                    i5++;
                }
            }
            int i6 = this.m0;
            if (i6 == 0 || i6 == 1 ? this.D.e() == d.a.WRAP_CONTENT : this.D.i() == d.a.WRAP_CONTENT) {
                z = false;
            }
            for (int i7 = 0; i7 < this.l0; i7++) {
                d dVar2 = this.k0[i7];
                if (this.o0 || dVar2.a()) {
                    g a2 = eVar.a((Object) dVar2.A[this.m0]);
                    c[] cVarArr3 = dVar2.A;
                    int i8 = this.m0;
                    cVarArr3[i8].i = a2;
                    if (i8 == 0 || i8 == 2) {
                        g gVar2 = cVar2.i;
                        b b2 = eVar.b();
                        g c = eVar.c();
                        c.d = 0;
                        b2.b(gVar2, a2, c, 0);
                        if (z) {
                            b2.d.a(eVar.a(1, (String) null), (float) ((int) (b2.d.a(c) * -1.0f)));
                        }
                        eVar.a(b2);
                    } else {
                        g gVar3 = cVar2.i;
                        b b3 = eVar.b();
                        g c2 = eVar.c();
                        c2.d = 0;
                        b3.a(gVar3, a2, c2, 0);
                        if (z) {
                            b3.d.a(eVar.a(1, (String) null), (float) ((int) (b3.d.a(c2) * -1.0f)));
                        }
                        eVar.a(b3);
                    }
                }
            }
            int i9 = this.m0;
            if (i9 == 0) {
                eVar.a(this.u.i, this.s.i, 0, 6);
                if (!z) {
                    gVar = this.s.i;
                    cVar = this.D.u;
                } else {
                    return;
                }
            } else if (i9 == 1) {
                eVar.a(this.s.i, this.u.i, 0, 6);
                if (!z) {
                    gVar = this.s.i;
                    cVar = this.D.s;
                } else {
                    return;
                }
            } else if (i9 == 2) {
                eVar.a(this.v.i, this.t.i, 0, 6);
                if (!z) {
                    gVar = this.t.i;
                    cVar = this.D.v;
                } else {
                    return;
                }
            } else if (i9 == 3) {
                eVar.a(this.t.i, this.v.i, 0, 6);
                if (!z) {
                    gVar = this.t.i;
                    cVar = this.D.t;
                } else {
                    return;
                }
            } else {
                return;
            }
            eVar.a(gVar, cVar.i, 0, 5);
        }
    }

    public boolean a() {
        return true;
    }

    public void m() {
        super.m();
        this.n0.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n() {
        /*
            r11 = this;
            int r0 = r11.m0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0020
            if (r0 == r4) goto L_0x001a
            if (r0 == r3) goto L_0x0015
            if (r0 == r2) goto L_0x0012
            return
        L_0x0012:
            a.e.a.h.c r0 = r11.v
            goto L_0x001c
        L_0x0015:
            a.e.a.h.c r0 = r11.t
        L_0x0017:
            a.e.a.h.j r0 = r0.f237a
            goto L_0x0023
        L_0x001a:
            a.e.a.h.c r0 = r11.u
        L_0x001c:
            a.e.a.h.j r0 = r0.f237a
            r1 = r5
            goto L_0x0023
        L_0x0020:
            a.e.a.h.c r0 = r11.s
            goto L_0x0017
        L_0x0023:
            java.util.ArrayList<a.e.a.h.j> r5 = r11.n0
            int r5 = r5.size()
            r6 = 0
            r7 = 0
        L_0x002b:
            if (r7 >= r5) goto L_0x0055
            java.util.ArrayList<a.e.a.h.j> r8 = r11.n0
            java.lang.Object r8 = r8.get(r7)
            a.e.a.h.j r8 = (a.e.a.h.j) r8
            int r9 = r8.f249b
            if (r9 == r4) goto L_0x003a
            return
        L_0x003a:
            int r9 = r11.m0
            if (r9 == 0) goto L_0x0048
            if (r9 != r3) goto L_0x0041
            goto L_0x0048
        L_0x0041:
            float r9 = r8.g
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 <= 0) goto L_0x0052
            goto L_0x004e
        L_0x0048:
            float r9 = r8.g
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x0052
        L_0x004e:
            a.e.a.h.j r1 = r8.f
            r6 = r1
            r1 = r9
        L_0x0052:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0055:
            r0.f = r6
            r0.g = r1
            r0.a()
            int r0 = r11.m0
            if (r0 == 0) goto L_0x0070
            if (r0 == r4) goto L_0x006d
            if (r0 == r3) goto L_0x006a
            if (r0 == r2) goto L_0x0067
            return
        L_0x0067:
            a.e.a.h.c r0 = r11.t
            goto L_0x0072
        L_0x006a:
            a.e.a.h.c r0 = r11.v
            goto L_0x0072
        L_0x006d:
            a.e.a.h.c r0 = r11.s
            goto L_0x0072
        L_0x0070:
            a.e.a.h.c r0 = r11.u
        L_0x0072:
            a.e.a.h.j r0 = r0.f237a
            r0.a((a.e.a.h.j) r6, (float) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.h.a.n():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r8) {
        /*
            r7 = this;
            a.e.a.h.d r8 = r7.D
            if (r8 != 0) goto L_0x0005
            return
        L_0x0005:
            a.e.a.h.e r8 = (a.e.a.h.e) r8
            r0 = 2
            boolean r8 = r8.g(r0)
            if (r8 != 0) goto L_0x000f
            return
        L_0x000f:
            int r8 = r7.m0
            r1 = 3
            r2 = 1
            if (r8 == 0) goto L_0x0027
            if (r8 == r2) goto L_0x0024
            if (r8 == r0) goto L_0x0021
            if (r8 == r1) goto L_0x001c
            return
        L_0x001c:
            a.e.a.h.c r8 = r7.v
        L_0x001e:
            a.e.a.h.j r8 = r8.f237a
            goto L_0x002a
        L_0x0021:
            a.e.a.h.c r8 = r7.t
            goto L_0x001e
        L_0x0024:
            a.e.a.h.c r8 = r7.u
            goto L_0x001e
        L_0x0027:
            a.e.a.h.c r8 = r7.s
            goto L_0x001e
        L_0x002a:
            r3 = 5
            r8.h = r3
            int r3 = r7.m0
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x0040
            if (r3 != r2) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            a.e.a.h.c r3 = r7.s
            a.e.a.h.j r3 = r3.f237a
            r3.a((a.e.a.h.j) r5, (float) r4)
            a.e.a.h.c r3 = r7.u
            goto L_0x0049
        L_0x0040:
            a.e.a.h.c r3 = r7.t
            a.e.a.h.j r3 = r3.f237a
            r3.a((a.e.a.h.j) r5, (float) r4)
            a.e.a.h.c r3 = r7.v
        L_0x0049:
            a.e.a.h.j r3 = r3.f237a
            r3.a((a.e.a.h.j) r5, (float) r4)
            java.util.ArrayList<a.e.a.h.j> r3 = r7.n0
            r3.clear()
            r3 = 0
        L_0x0054:
            int r4 = r7.l0
            if (r3 >= r4) goto L_0x0090
            a.e.a.h.d[] r4 = r7.k0
            r4 = r4[r3]
            boolean r6 = r7.o0
            if (r6 != 0) goto L_0x0067
            boolean r6 = r4.a()
            if (r6 != 0) goto L_0x0067
            goto L_0x008d
        L_0x0067:
            int r6 = r7.m0
            if (r6 == 0) goto L_0x007e
            if (r6 == r2) goto L_0x007b
            if (r6 == r0) goto L_0x0078
            if (r6 == r1) goto L_0x0073
            r4 = r5
            goto L_0x0081
        L_0x0073:
            a.e.a.h.c r4 = r4.v
        L_0x0075:
            a.e.a.h.j r4 = r4.f237a
            goto L_0x0081
        L_0x0078:
            a.e.a.h.c r4 = r4.t
            goto L_0x0075
        L_0x007b:
            a.e.a.h.c r4 = r4.u
            goto L_0x0075
        L_0x007e:
            a.e.a.h.c r4 = r4.s
            goto L_0x0075
        L_0x0081:
            if (r4 == 0) goto L_0x008d
            java.util.ArrayList<a.e.a.h.j> r6 = r7.n0
            r6.add(r4)
            java.util.HashSet<a.e.a.h.l> r4 = r4.f248a
            r4.add(r8)
        L_0x008d:
            int r3 = r3 + 1
            goto L_0x0054
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.h.a.a(int):void");
    }
}
