package a.e.a.h;

import a.e.a.g;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public j f237a = new j(this);

    /* renamed from: b  reason: collision with root package name */
    public final d f238b;
    public final C0011c c;
    public c d;
    public int e = 0;
    public int f = -1;
    public b g = b.NONE;
    public int h;
    public g i;

    public enum a {
        RELAXED,
        STRICT
    }

    public enum b {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: a.e.a.h.c$c  reason: collision with other inner class name */
    public enum C0011c {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public c(d dVar, C0011c cVar) {
        a aVar = a.RELAXED;
        this.h = 0;
        this.f238b = dVar;
        this.c = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        if ((r4.f238b.Q > 0) == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
        if (r10 != a.e.a.h.c.C0011c.j) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0070, code lost:
        if (r10 != a.e.a.h.c.C0011c.j) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0073, code lost:
        r10 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x008b, code lost:
        if (r10 != a.e.a.h.c.C0011c.i) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0090 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(a.e.a.h.c r5, int r6, int r7, a.e.a.h.c.b r8, int r9, boolean r10) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L_0x0014
            r5 = 0
            r4.d = r5
            r4.e = r1
            r5 = -1
            r4.f = r5
            a.e.a.h.c$b r5 = a.e.a.h.c.b.NONE
            r4.g = r5
            r5 = 2
            r4.h = r5
            return r0
        L_0x0014:
            if (r10 != 0) goto L_0x0091
            a.e.a.h.c$c r10 = r5.c
            a.e.a.h.c$c r2 = r4.c
            if (r10 != r2) goto L_0x0037
            a.e.a.h.c$c r10 = a.e.a.h.c.C0011c.BASELINE
            if (r2 != r10) goto L_0x0056
            a.e.a.h.d r10 = r5.f238b
            int r10 = r10.Q
            if (r10 <= 0) goto L_0x0028
            r10 = r0
            goto L_0x0029
        L_0x0028:
            r10 = r1
        L_0x0029:
            if (r10 == 0) goto L_0x0058
            a.e.a.h.d r10 = r4.f238b
            int r10 = r10.Q
            if (r10 <= 0) goto L_0x0033
            r10 = r0
            goto L_0x0034
        L_0x0033:
            r10 = r1
        L_0x0034:
            if (r10 != 0) goto L_0x0056
            goto L_0x0058
        L_0x0037:
            int r2 = r2.ordinal()
            switch(r2) {
                case 0: goto L_0x0058;
                case 1: goto L_0x0075;
                case 2: goto L_0x005a;
                case 3: goto L_0x0075;
                case 4: goto L_0x005a;
                case 5: goto L_0x0058;
                case 6: goto L_0x004a;
                case 7: goto L_0x0058;
                case 8: goto L_0x0058;
                default: goto L_0x003e;
            }
        L_0x003e:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            a.e.a.h.c$c r6 = r4.c
            java.lang.String r6 = r6.name()
            r5.<init>(r6)
            throw r5
        L_0x004a:
            a.e.a.h.c$c r2 = a.e.a.h.c.C0011c.BASELINE
            if (r10 == r2) goto L_0x0058
            a.e.a.h.c$c r2 = a.e.a.h.c.C0011c.CENTER_X
            if (r10 == r2) goto L_0x0058
            a.e.a.h.c$c r2 = a.e.a.h.c.C0011c.CENTER_Y
            if (r10 == r2) goto L_0x0058
        L_0x0056:
            r10 = r0
            goto L_0x008e
        L_0x0058:
            r10 = r1
            goto L_0x008e
        L_0x005a:
            a.e.a.h.c$c r2 = a.e.a.h.c.C0011c.TOP
            if (r10 == r2) goto L_0x0065
            a.e.a.h.c$c r2 = a.e.a.h.c.C0011c.BOTTOM
            if (r10 != r2) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r2 = r1
            goto L_0x0066
        L_0x0065:
            r2 = r0
        L_0x0066:
            a.e.a.h.d r3 = r5.f238b
            boolean r3 = r3 instanceof a.e.a.h.g
            if (r3 == 0) goto L_0x0073
            if (r2 != 0) goto L_0x0056
            a.e.a.h.c$c r2 = a.e.a.h.c.C0011c.CENTER_Y
            if (r10 != r2) goto L_0x0058
            goto L_0x0056
        L_0x0073:
            r10 = r2
            goto L_0x008e
        L_0x0075:
            a.e.a.h.c$c r2 = a.e.a.h.c.C0011c.LEFT
            if (r10 == r2) goto L_0x0080
            a.e.a.h.c$c r2 = a.e.a.h.c.C0011c.RIGHT
            if (r10 != r2) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            r2 = r1
            goto L_0x0081
        L_0x0080:
            r2 = r0
        L_0x0081:
            a.e.a.h.d r3 = r5.f238b
            boolean r3 = r3 instanceof a.e.a.h.g
            if (r3 == 0) goto L_0x0073
            if (r2 != 0) goto L_0x0056
            a.e.a.h.c$c r2 = a.e.a.h.c.C0011c.CENTER_X
            if (r10 != r2) goto L_0x0058
            goto L_0x0056
        L_0x008e:
            if (r10 != 0) goto L_0x0091
            return r1
        L_0x0091:
            r4.d = r5
            if (r6 <= 0) goto L_0x0098
            r4.e = r6
            goto L_0x009a
        L_0x0098:
            r4.e = r1
        L_0x009a:
            r4.f = r7
            r4.g = r8
            r4.h = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.h.c.a(a.e.a.h.c, int, int, a.e.a.h.c$b, int, boolean):boolean");
    }

    public boolean b() {
        return this.d != null;
    }

    public void c() {
        this.d = null;
        this.e = 0;
        this.f = -1;
        this.g = b.STRONG;
        this.h = 0;
        a aVar = a.RELAXED;
        this.f237a.e();
    }

    public void d() {
        g gVar = this.i;
        if (gVar == null) {
            this.i = new g(g.a.UNRESTRICTED);
        } else {
            gVar.a();
        }
    }

    public String toString() {
        return this.f238b.Z + ":" + this.c.toString();
    }

    public int a() {
        c cVar;
        if (this.f238b.Y == 8) {
            return 0;
        }
        int i2 = this.f;
        if (i2 <= -1 || (cVar = this.d) == null || cVar.f238b.Y != 8) {
            return this.e;
        }
        return i2;
    }
}
