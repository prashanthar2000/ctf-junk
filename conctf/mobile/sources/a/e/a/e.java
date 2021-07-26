package a.e.a;

import a.e.a.g;
import a.e.a.h.c;
import java.util.Arrays;
import java.util.HashMap;

public class e {
    public static int p = 1000;

    /* renamed from: a  reason: collision with root package name */
    public int f228a;

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, g> f229b;
    public a c;
    public int d;
    public int e;
    public b[] f;
    public boolean g;
    public boolean[] h;
    public int i;
    public int j;
    public int k;
    public final c l;
    public g[] m;
    public int n;
    public final a o;

    public interface a {
        void a(g gVar);
    }

    public e() {
        this.f228a = 0;
        this.f229b = null;
        this.d = 32;
        this.e = 32;
        this.f = null;
        this.g = false;
        this.h = new boolean[32];
        this.i = 1;
        this.j = 0;
        this.k = 32;
        this.m = new g[p];
        this.n = 0;
        this.f = new b[32];
        e();
        c cVar = new c();
        this.l = cVar;
        this.c = new d(cVar);
        this.o = new b(this.l);
    }

    public g a(int i2, String str) {
        if (this.i + 1 >= this.e) {
            d();
        }
        g a2 = a(g.a.ERROR, str);
        int i3 = this.f228a + 1;
        this.f228a = i3;
        this.i++;
        a2.f233b = i3;
        a2.d = i2;
        this.l.c[i3] = a2;
        this.c.a(a2);
        return a2;
    }

    public final g a(g.a aVar, String str) {
        g a2 = this.l.f227b.a();
        if (a2 == null) {
            a2 = new g(aVar);
        } else {
            a2.a();
        }
        a2.g = aVar;
        int i2 = this.n;
        int i3 = p;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            p = i4;
            this.m = (g[]) Arrays.copyOf(this.m, i4);
        }
        g[] gVarArr = this.m;
        int i5 = this.n;
        this.n = i5 + 1;
        gVarArr[i5] = a2;
        return a2;
    }

    public final void a() {
        for (int i2 = 0; i2 < this.j; i2++) {
            b bVar = this.f[i2];
            bVar.f224a.e = bVar.f225b;
        }
    }

    public void a(g gVar, g gVar2, g gVar3, g gVar4, float f2, int i2) {
        b b2 = b();
        b2.a(gVar, gVar2, gVar3, gVar4, f2);
        if (i2 != 6) {
            b2.a(this, i2);
        }
        a(b2);
    }

    public final void b(b bVar) {
        b[] bVarArr = this.f;
        int i2 = this.j;
        if (bVarArr[i2] != null) {
            this.l.f226a.a(bVarArr[i2]);
        }
        b[] bVarArr2 = this.f;
        int i3 = this.j;
        bVarArr2[i3] = bVar;
        g gVar = bVar.f224a;
        gVar.c = i3;
        this.j = i3 + 1;
        gVar.c(bVar);
    }

    public void b(g gVar, g gVar2, int i2, int i3) {
        b b2 = b();
        g c2 = c();
        c2.d = 0;
        b2.a(gVar, gVar2, c2, i2);
        if (i3 != 6) {
            b2.d.a(a(i3, (String) null), (float) ((int) (b2.d.a(c2) * -1.0f)));
        }
        a(b2);
    }

    public g c() {
        if (this.i + 1 >= this.e) {
            d();
        }
        g a2 = a(g.a.SLACK, (String) null);
        int i2 = this.f228a + 1;
        this.f228a = i2;
        this.i++;
        a2.f233b = i2;
        this.l.c[i2] = a2;
        return a2;
    }

    public void c(g gVar, g gVar2, int i2, int i3) {
        b b2 = b();
        g c2 = c();
        c2.d = 0;
        b2.b(gVar, gVar2, c2, i2);
        if (i3 != 6) {
            b2.d.a(a(i3, (String) null), (float) ((int) (b2.d.a(c2) * -1.0f)));
        }
        a(b2);
    }

    public final void d() {
        int i2 = this.d * 2;
        this.d = i2;
        this.f = (b[]) Arrays.copyOf(this.f, i2);
        c cVar = this.l;
        cVar.c = (g[]) Arrays.copyOf(cVar.c, this.d);
        int i3 = this.d;
        this.h = new boolean[i3];
        this.e = i3;
        this.k = i3;
    }

    public final void e() {
        int i2 = 0;
        while (true) {
            b[] bVarArr = this.f;
            if (i2 < bVarArr.length) {
                b bVar = bVarArr[i2];
                if (bVar != null) {
                    this.l.f226a.a(bVar);
                }
                this.f[i2] = null;
                i2++;
            } else {
                return;
            }
        }
    }

    public void f() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.l;
            g[] gVarArr = cVar.c;
            if (i2 >= gVarArr.length) {
                break;
            }
            g gVar = gVarArr[i2];
            if (gVar != null) {
                gVar.a();
            }
            i2++;
        }
        f<g> fVar = cVar.f227b;
        g[] gVarArr2 = this.m;
        int i3 = this.n;
        if (fVar != null) {
            if (i3 > gVarArr2.length) {
                i3 = gVarArr2.length;
            }
            for (int i4 = 0; i4 < i3; i4++) {
                g gVar2 = gVarArr2[i4];
                int i5 = fVar.f231b;
                Object[] objArr = fVar.f230a;
                if (i5 < objArr.length) {
                    objArr[i5] = gVar2;
                    fVar.f231b = i5 + 1;
                }
            }
            this.n = 0;
            Arrays.fill(this.l.c, (Object) null);
            HashMap<String, g> hashMap = this.f229b;
            if (hashMap != null) {
                hashMap.clear();
            }
            this.f228a = 0;
            b bVar = (b) this.c;
            bVar.d.a();
            bVar.f224a = null;
            bVar.f225b = 0.0f;
            this.i = 1;
            for (int i6 = 0; i6 < this.j; i6++) {
                this.f[i6].c = false;
            }
            e();
            this.j = 0;
            return;
        }
        throw null;
    }

    public void a(g gVar, g gVar2, int i2, float f2, g gVar3, g gVar4, int i3, int i4) {
        float f3;
        b b2 = b();
        if (gVar2 == gVar3) {
            b2.d.a(gVar, 1.0f);
            b2.d.a(gVar4, 1.0f);
            b2.d.a(gVar2, -2.0f);
        } else {
            if (f2 == 0.5f) {
                b2.d.a(gVar, 1.0f);
                b2.d.a(gVar2, -1.0f);
                b2.d.a(gVar3, -1.0f);
                b2.d.a(gVar4, 1.0f);
                if (i2 > 0 || i3 > 0) {
                    f3 = (float) ((-i2) + i3);
                }
            } else if (f2 <= 0.0f) {
                b2.d.a(gVar, -1.0f);
                b2.d.a(gVar2, 1.0f);
                f3 = (float) i2;
            } else if (f2 >= 1.0f) {
                b2.d.a(gVar3, -1.0f);
                b2.d.a(gVar4, 1.0f);
                f3 = (float) i3;
            } else {
                float f4 = 1.0f - f2;
                b2.d.a(gVar, f4 * 1.0f);
                b2.d.a(gVar2, f4 * -1.0f);
                b2.d.a(gVar3, -1.0f * f2);
                b2.d.a(gVar4, 1.0f * f2);
                if (i2 > 0 || i3 > 0) {
                    b2.f225b = (((float) i3) * f2) + (((float) (-i2)) * f4);
                }
            }
            b2.f225b = f3;
        }
        if (i4 != 6) {
            b2.a(this, i4);
        }
        a(b2);
    }

    public b b() {
        b a2 = this.l.f226a.a();
        if (a2 == null) {
            a2 = new b(this.l);
        } else {
            a2.f224a = null;
            a2.d.a();
            a2.f225b = 0.0f;
            a2.e = false;
        }
        g.k++;
        return a2;
    }

    public final void c(b bVar) {
        if (this.j > 0) {
            a aVar = bVar.d;
            b[] bVarArr = this.f;
            int i2 = aVar.i;
            loop0:
            while (true) {
                int i3 = 0;
                while (i2 != -1 && i3 < aVar.f222a) {
                    g gVar = aVar.c.c[aVar.f[i2]];
                    if (gVar.c != -1) {
                        float f2 = aVar.h[i2];
                        aVar.a(gVar, true);
                        b bVar2 = bVarArr[gVar.c];
                        if (!bVar2.e) {
                            a aVar2 = bVar2.d;
                            int i4 = aVar2.i;
                            int i5 = 0;
                            while (i4 != -1 && i5 < aVar2.f222a) {
                                aVar.a(aVar.c.c[aVar2.f[i4]], aVar2.h[i4] * f2, true);
                                i4 = aVar2.g[i4];
                                i5++;
                            }
                        }
                        bVar.f225b = (bVar2.f225b * f2) + bVar.f225b;
                        bVar2.f224a.b(bVar);
                        i2 = aVar.i;
                    } else {
                        i2 = aVar.g[i2];
                        i3++;
                    }
                }
            }
            if (bVar.d.f222a == 0) {
                bVar.e = true;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x00dc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(a.e.a.b r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            int r2 = r0.j
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.k
            if (r2 >= r4) goto L_0x0016
            int r2 = r0.i
            int r2 = r2 + r3
            int r4 = r0.e
            if (r2 < r4) goto L_0x0019
        L_0x0016:
            r18.d()
        L_0x0019:
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x018c
            r18.c(r19)
            a.e.a.g r2 = r1.f224a
            r5 = 0
            if (r2 != 0) goto L_0x0033
            float r2 = r1.f225b
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0033
            a.e.a.a r2 = r1.d
            int r2 = r2.f222a
            if (r2 != 0) goto L_0x0033
            r2 = r3
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            if (r2 == 0) goto L_0x0037
            return
        L_0x0037:
            float r2 = r1.f225b
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            r7 = -1
            if (r6 >= 0) goto L_0x005c
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r6
            r1.f225b = r2
            a.e.a.a r2 = r1.d
            int r8 = r2.i
            r9 = 0
        L_0x0048:
            if (r8 == r7) goto L_0x005c
            int r10 = r2.f222a
            if (r9 >= r10) goto L_0x005c
            float[] r10 = r2.h
            r11 = r10[r8]
            float r11 = r11 * r6
            r10[r8] = r11
            int[] r10 = r2.g
            r8 = r10[r8]
            int r9 = r9 + 1
            goto L_0x0048
        L_0x005c:
            a.e.a.a r2 = r1.d
            int r6 = r2.i
            r12 = r5
            r14 = r12
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r15 = 0
        L_0x0067:
            if (r6 == r7) goto L_0x00e4
            int r4 = r2.f222a
            if (r9 >= r4) goto L_0x00e4
            float[] r4 = r2.h
            r16 = r4[r6]
            r17 = 981668463(0x3a83126f, float:0.001)
            a.e.a.c r7 = r2.c
            a.e.a.g[] r7 = r7.c
            int[] r8 = r2.f
            r8 = r8[r6]
            r7 = r7[r8]
            int r8 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x008c
            r8 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r8 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x0099
            r4[r6] = r5
            goto L_0x0092
        L_0x008c:
            int r8 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r8 >= 0) goto L_0x0099
            r4[r6] = r5
        L_0x0092:
            a.e.a.b r4 = r2.f223b
            r7.b(r4)
            r16 = r5
        L_0x0099:
            int r4 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x00dc
            a.e.a.g$a r4 = r7.g
            a.e.a.g$a r8 = a.e.a.g.a.UNRESTRICTED
            if (r4 != r8) goto L_0x00bd
            if (r11 != 0) goto L_0x00a6
            goto L_0x00aa
        L_0x00a6:
            int r4 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b0
        L_0x00aa:
            boolean r4 = r2.b((a.e.a.g) r7)
            r13 = r4
            goto L_0x00b9
        L_0x00b0:
            if (r13 != 0) goto L_0x00dc
            boolean r4 = r2.b((a.e.a.g) r7)
            if (r4 == 0) goto L_0x00dc
            r13 = r3
        L_0x00b9:
            r11 = r7
            r12 = r16
            goto L_0x00dc
        L_0x00bd:
            if (r11 != 0) goto L_0x00dc
            int r4 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00dc
            if (r10 != 0) goto L_0x00c6
            goto L_0x00ca
        L_0x00c6:
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x00d0
        L_0x00ca:
            boolean r4 = r2.b((a.e.a.g) r7)
            r15 = r4
            goto L_0x00d9
        L_0x00d0:
            if (r15 != 0) goto L_0x00dc
            boolean r4 = r2.b((a.e.a.g) r7)
            if (r4 == 0) goto L_0x00dc
            r15 = r3
        L_0x00d9:
            r10 = r7
            r14 = r16
        L_0x00dc:
            int[] r4 = r2.g
            r6 = r4[r6]
            int r9 = r9 + 1
            r7 = -1
            goto L_0x0067
        L_0x00e4:
            if (r11 == 0) goto L_0x00e7
            r10 = r11
        L_0x00e7:
            if (r10 != 0) goto L_0x00eb
            r2 = r3
            goto L_0x00ef
        L_0x00eb:
            r1.b(r10)
            r2 = 0
        L_0x00ef:
            a.e.a.a r4 = r1.d
            int r4 = r4.f222a
            if (r4 != 0) goto L_0x00f7
            r1.e = r3
        L_0x00f7:
            if (r2 == 0) goto L_0x0174
            int r2 = r0.i
            int r2 = r2 + r3
            int r4 = r0.e
            if (r2 < r4) goto L_0x0103
            r18.d()
        L_0x0103:
            a.e.a.g$a r2 = a.e.a.g.a.SLACK
            r4 = 0
            a.e.a.g r2 = r0.a((a.e.a.g.a) r2, (java.lang.String) r4)
            int r4 = r0.f228a
            int r4 = r4 + r3
            r0.f228a = r4
            int r6 = r0.i
            int r6 = r6 + r3
            r0.i = r6
            r2.f233b = r4
            a.e.a.c r6 = r0.l
            a.e.a.g[] r6 = r6.c
            r6[r4] = r2
            r1.f224a = r2
            r18.b((a.e.a.b) r19)
            a.e.a.e$a r4 = r0.o
            a.e.a.b r4 = (a.e.a.b) r4
            if (r4 == 0) goto L_0x0172
            r6 = 0
            r4.f224a = r6
            a.e.a.a r6 = r4.d
            r6.a()
            r6 = 0
        L_0x0130:
            a.e.a.a r7 = r1.d
            int r8 = r7.f222a
            if (r6 >= r8) goto L_0x0148
            a.e.a.g r7 = r7.a((int) r6)
            a.e.a.a r8 = r1.d
            float r8 = r8.b((int) r6)
            a.e.a.a r9 = r4.d
            r9.a(r7, r8, r3)
            int r6 = r6 + 1
            goto L_0x0130
        L_0x0148:
            a.e.a.e$a r4 = r0.o
            r0.b((a.e.a.e.a) r4)
            int r4 = r2.c
            r6 = -1
            if (r4 != r6) goto L_0x0170
            a.e.a.g r4 = r1.f224a
            if (r4 != r2) goto L_0x0162
            a.e.a.a r4 = r1.d
            r6 = 0
            a.e.a.g r2 = r4.a((boolean[]) r6, (a.e.a.g) r2)
            if (r2 == 0) goto L_0x0162
            r1.b(r2)
        L_0x0162:
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x016b
            a.e.a.g r2 = r1.f224a
            r2.c(r1)
        L_0x016b:
            int r2 = r0.j
            int r2 = r2 - r3
            r0.j = r2
        L_0x0170:
            r2 = r3
            goto L_0x0175
        L_0x0172:
            r2 = 0
            throw r2
        L_0x0174:
            r2 = 0
        L_0x0175:
            a.e.a.g r4 = r1.f224a
            if (r4 == 0) goto L_0x0186
            a.e.a.g$a r4 = r4.g
            a.e.a.g$a r6 = a.e.a.g.a.UNRESTRICTED
            if (r4 == r6) goto L_0x0187
            float r4 = r1.f225b
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x0186
            goto L_0x0187
        L_0x0186:
            r3 = 0
        L_0x0187:
            if (r3 != 0) goto L_0x018a
            return
        L_0x018a:
            r4 = r2
            goto L_0x018d
        L_0x018c:
            r4 = 0
        L_0x018d:
            if (r4 != 0) goto L_0x0192
            r18.b((a.e.a.b) r19)
        L_0x0192:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.e.a(a.e.a.b):void");
    }

    public int b(Object obj) {
        g gVar = ((c) obj).i;
        if (gVar != null) {
            return (int) (gVar.e + 0.5f);
        }
        return 0;
    }

    public final int b(a aVar) {
        boolean z;
        for (int i2 = 0; i2 < this.i; i2++) {
            this.h[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.i * 2) {
                return i3;
            }
            b bVar = (b) aVar;
            g gVar = bVar.f224a;
            if (gVar != null) {
                this.h[gVar.f233b] = true;
            }
            g a2 = bVar.d.a(this.h, (g) null);
            if (a2 != null) {
                boolean[] zArr = this.h;
                int i4 = a2.f233b;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (a2 != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.j; i6++) {
                    b bVar2 = this.f[i6];
                    if (bVar2.f224a.g != g.a.UNRESTRICTED && !bVar2.e) {
                        a aVar2 = bVar2.d;
                        int i7 = aVar2.i;
                        if (i7 != -1) {
                            int i8 = 0;
                            while (true) {
                                if (i7 == -1 || i8 >= aVar2.f222a) {
                                    break;
                                } else if (aVar2.f[i7] == a2.f233b) {
                                    z = true;
                                    break;
                                } else {
                                    i7 = aVar2.g[i7];
                                    i8++;
                                }
                            }
                        }
                        z = false;
                        if (z) {
                            float a3 = bVar2.d.a(a2);
                            if (a3 < 0.0f) {
                                float f3 = (-bVar2.f225b) / a3;
                                if (f3 < f2) {
                                    i5 = i6;
                                    f2 = f3;
                                }
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    b bVar3 = this.f[i5];
                    bVar3.f224a.c = -1;
                    bVar3.b(a2);
                    g gVar2 = bVar3.f224a;
                    gVar2.c = i5;
                    gVar2.c(bVar3);
                }
            }
            z2 = true;
        }
        return i3;
    }

    public b a(g gVar, g gVar2, int i2, int i3) {
        b b2 = b();
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            b2.f225b = (float) i2;
        }
        if (!z) {
            b2.d.a(gVar, -1.0f);
            b2.d.a(gVar2, 1.0f);
        } else {
            b2.d.a(gVar, 1.0f);
            b2.d.a(gVar2, -1.0f);
        }
        if (i3 != 6) {
            b2.a(this, i3);
        }
        a(b2);
        return b2;
    }

    public void a(g gVar, int i2) {
        b bVar;
        a aVar;
        float f2;
        int i3 = gVar.c;
        if (i3 != -1) {
            b bVar2 = this.f[i3];
            if (!bVar2.e) {
                if (bVar2.d.f222a == 0) {
                    bVar2.e = true;
                } else {
                    bVar = b();
                    if (i2 < 0) {
                        bVar.f225b = (float) (i2 * -1);
                        aVar = bVar.d;
                        f2 = 1.0f;
                    } else {
                        bVar.f225b = (float) i2;
                        aVar = bVar.d;
                        f2 = -1.0f;
                    }
                    aVar.a(gVar, f2);
                }
            }
            bVar2.f225b = (float) i2;
            return;
        }
        bVar = b();
        bVar.f224a = gVar;
        float f3 = (float) i2;
        gVar.e = f3;
        bVar.f225b = f3;
        bVar.e = true;
        a(bVar);
    }

    public g a(Object obj) {
        g gVar = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            d();
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            gVar = cVar.i;
            if (gVar == null) {
                cVar.d();
                gVar = cVar.i;
            }
            int i2 = gVar.f233b;
            if (i2 == -1 || i2 > this.f228a || this.l.c[i2] == null) {
                if (gVar.f233b != -1) {
                    gVar.a();
                }
                int i3 = this.f228a + 1;
                this.f228a = i3;
                this.i++;
                gVar.f233b = i3;
                gVar.g = g.a.UNRESTRICTED;
                this.l.c[i3] = gVar;
            }
        }
        return gVar;
    }

    public void a(a aVar) {
        float f2;
        boolean z;
        c((b) aVar);
        int i2 = 0;
        while (true) {
            f2 = 0.0f;
            if (i2 >= this.j) {
                z = false;
                break;
            }
            b[] bVarArr = this.f;
            if (bVarArr[i2].f224a.g != g.a.UNRESTRICTED && bVarArr[i2].f225b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3++;
                float f3 = Float.MAX_VALUE;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                int i7 = 0;
                while (i6 < this.j) {
                    b bVar = this.f[i6];
                    if (bVar.f224a.g != g.a.UNRESTRICTED && !bVar.e && bVar.f225b < f2) {
                        int i8 = 1;
                        while (i8 < this.i) {
                            g gVar = this.l.c[i8];
                            float a2 = bVar.d.a(gVar);
                            if (a2 > f2) {
                                for (int i9 = 0; i9 < 7; i9++) {
                                    float f4 = gVar.f[i9] / a2;
                                    if ((f4 < f3 && i9 == i7) || i9 > i7) {
                                        i7 = i9;
                                        f3 = f4;
                                        i4 = i6;
                                        i5 = i8;
                                    }
                                }
                            }
                            i8++;
                            f2 = 0.0f;
                        }
                    }
                    i6++;
                    f2 = 0.0f;
                }
                if (i4 != -1) {
                    b bVar2 = this.f[i4];
                    bVar2.f224a.c = -1;
                    bVar2.b(this.l.c[i5]);
                    g gVar2 = bVar2.f224a;
                    gVar2.c = i4;
                    gVar2.c(bVar2);
                } else {
                    z2 = true;
                }
                if (i3 > this.i / 2) {
                    z2 = true;
                }
                f2 = 0.0f;
            }
        }
        b(aVar);
        a();
    }
}
