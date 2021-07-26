package a.e.a;

import a.e.a.e;

public class b implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public g f224a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f225b = 0.0f;
    public boolean c;
    public final a d;
    public boolean e = false;

    public b(c cVar) {
        this.d = new a(this, cVar);
    }

    public b a(e eVar, int i) {
        this.d.a(eVar.a(i, "ep"), 1.0f);
        this.d.a(eVar.a(i, "em"), -1.0f);
        return this;
    }

    public b a(g gVar, g gVar2, g gVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f225b = (float) i;
        }
        if (!z) {
            this.d.a(gVar, -1.0f);
            this.d.a(gVar2, 1.0f);
            this.d.a(gVar3, 1.0f);
        } else {
            this.d.a(gVar, 1.0f);
            this.d.a(gVar2, -1.0f);
            this.d.a(gVar3, -1.0f);
        }
        return this;
    }

    public b a(g gVar, g gVar2, g gVar3, g gVar4, float f) {
        this.d.a(gVar, -1.0f);
        this.d.a(gVar2, 1.0f);
        this.d.a(gVar3, f);
        this.d.a(gVar4, -f);
        return this;
    }

    public void a(g gVar) {
        int i = gVar.d;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.d.a(gVar, f);
    }

    public b b(g gVar, g gVar2, g gVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f225b = (float) i;
        }
        if (!z) {
            this.d.a(gVar, -1.0f);
            this.d.a(gVar2, 1.0f);
            this.d.a(gVar3, -1.0f);
        } else {
            this.d.a(gVar, 1.0f);
            this.d.a(gVar2, -1.0f);
            this.d.a(gVar3, 1.0f);
        }
        return this;
    }

    public b b(g gVar, g gVar2, g gVar3, g gVar4, float f) {
        this.d.a(gVar3, 0.5f);
        this.d.a(gVar4, 0.5f);
        this.d.a(gVar, -0.5f);
        this.d.a(gVar2, -0.5f);
        this.f225b = -f;
        return this;
    }

    public void b(g gVar) {
        g gVar2 = this.f224a;
        if (gVar2 != null) {
            this.d.a(gVar2, -1.0f);
            this.f224a = null;
        }
        float a2 = this.d.a(gVar, true) * -1.0f;
        this.f224a = gVar;
        if (a2 != 1.0f) {
            this.f225b /= a2;
            a aVar = this.d;
            int i = aVar.i;
            int i2 = 0;
            while (i != -1 && i2 < aVar.f222a) {
                float[] fArr = aVar.h;
                fArr[i] = fArr[i] / a2;
                i = aVar.g[i];
                i2++;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            a.e.a.g r0 = r10.f224a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0016
        L_0x0007:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = b.a.a.a.a.a(r0)
            a.e.a.g r1 = r10.f224a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0016:
            java.lang.String r1 = " = "
            java.lang.String r0 = b.a.a.a.a.a(r0, r1)
            float r1 = r10.f225b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0034
            java.lang.StringBuilder r0 = b.a.a.a.a.a(r0)
            float r1 = r10.f225b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L_0x0035
        L_0x0034:
            r1 = r3
        L_0x0035:
            a.e.a.a r5 = r10.d
            int r5 = r5.f222a
        L_0x0039:
            if (r3 >= r5) goto L_0x00a3
            a.e.a.a r6 = r10.d
            a.e.a.g r6 = r6.a((int) r3)
            if (r6 != 0) goto L_0x0044
            goto L_0x00a0
        L_0x0044:
            a.e.a.a r7 = r10.d
            float r7 = r7.b((int) r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x004f
            goto L_0x00a0
        L_0x004f:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0062
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x007c
            java.lang.StringBuilder r0 = b.a.a.a.a.a(r0)
            java.lang.String r1 = "- "
            goto L_0x0074
        L_0x0062:
            java.lang.StringBuilder r0 = b.a.a.a.a.a(r0)
            if (r8 <= 0) goto L_0x0072
            java.lang.String r1 = " + "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x007c
        L_0x0072:
            java.lang.String r1 = " - "
        L_0x0074:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            float r7 = r7 * r9
        L_0x007c:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0088
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x0095
        L_0x0088:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L_0x0095:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = r4
        L_0x00a0:
            int r3 = r3 + 1
            goto L_0x0039
        L_0x00a3:
            if (r1 != 0) goto L_0x00ab
            java.lang.String r1 = "0.0"
            java.lang.String r0 = b.a.a.a.a.a(r0, r1)
        L_0x00ab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.b.toString():java.lang.String");
    }
}
