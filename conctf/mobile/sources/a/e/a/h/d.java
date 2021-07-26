package a.e.a.h;

import a.e.a.e;
import a.e.a.h.c;
import java.util.ArrayList;

public class d {
    public static float j0 = 0.5f;
    public c[] A;
    public ArrayList<c> B;
    public a[] C;
    public d D;
    public int E;
    public int F;
    public float G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public float V;
    public float W;
    public Object X;
    public int Y;
    public String Z;

    /* renamed from: a  reason: collision with root package name */
    public int f242a = -1;
    public String a0;

    /* renamed from: b  reason: collision with root package name */
    public int f243b = -1;
    public boolean b0;
    public k c;
    public boolean c0;
    public k d;
    public boolean d0;
    public int e = 0;
    public int e0;
    public int f = 0;
    public int f0;
    public int[] g = new int[2];
    public float[] g0;
    public int h = 0;
    public d[] h0;
    public int i = 0;
    public d[] i0;
    public float j = 1.0f;
    public int k = 0;
    public int l = 0;
    public float m = 1.0f;
    public int n = -1;
    public float o = 1.0f;
    public f p = null;
    public int[] q = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float r = 0.0f;
    public c s = new c(this, c.C0011c.LEFT);
    public c t = new c(this, c.C0011c.TOP);
    public c u = new c(this, c.C0011c.RIGHT);
    public c v = new c(this, c.C0011c.BOTTOM);
    public c w = new c(this, c.C0011c.BASELINE);
    public c x = new c(this, c.C0011c.CENTER_X);
    public c y = new c(this, c.C0011c.CENTER_Y);
    public c z;

    public enum a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public d() {
        c cVar = new c(this, c.C0011c.CENTER);
        this.z = cVar;
        this.A = new c[]{this.s, this.u, this.t, this.v, this.w, cVar};
        ArrayList<c> arrayList = new ArrayList<>();
        this.B = arrayList;
        a aVar = a.FIXED;
        this.C = new a[]{aVar, aVar};
        this.D = null;
        this.E = 0;
        this.F = 0;
        this.G = 0.0f;
        this.H = -1;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        float f2 = j0;
        this.V = f2;
        this.W = f2;
        this.Y = 0;
        this.Z = null;
        this.a0 = null;
        this.b0 = false;
        this.c0 = false;
        this.d0 = false;
        this.e0 = 0;
        this.f0 = 0;
        this.g0 = new float[]{-1.0f, -1.0f};
        this.h0 = new d[]{null, null};
        this.i0 = new d[]{null, null};
        arrayList.add(this.s);
        this.B.add(this.t);
        this.B.add(this.u);
        this.B.add(this.v);
        this.B.add(this.x);
        this.B.add(this.y);
        this.B.add(this.z);
        this.B.add(this.w);
    }

    public c a(c.C0011c cVar) {
        switch (cVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.s;
            case 2:
                return this.t;
            case 3:
                return this.u;
            case 4:
                return this.v;
            case 5:
                return this.w;
            case 6:
                return this.z;
            case 7:
                return this.x;
            case 8:
                return this.y;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    public void a(int i2, int i3) {
        this.I = i2;
        int i4 = i3 - i2;
        this.E = i4;
        int i5 = this.R;
        if (i4 < i5) {
            this.E = i5;
        }
    }

    public void a(a.e.a.c cVar) {
        this.s.d();
        this.t.d();
        this.u.d();
        this.v.d();
        this.w.d();
        this.z.d();
        this.x.d();
        this.y.d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0349 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x03a6  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x03eb  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(a.e.a.e r39) {
        /*
            r38 = this;
            r15 = r38
            r14 = r39
            a.e.a.h.c r0 = r15.s
            a.e.a.g r21 = r14.a((java.lang.Object) r0)
            a.e.a.h.c r0 = r15.u
            a.e.a.g r10 = r14.a((java.lang.Object) r0)
            a.e.a.h.c r0 = r15.t
            a.e.a.g r6 = r14.a((java.lang.Object) r0)
            a.e.a.h.c r0 = r15.v
            a.e.a.g r4 = r14.a((java.lang.Object) r0)
            a.e.a.h.c r0 = r15.w
            a.e.a.g r3 = r14.a((java.lang.Object) r0)
            a.e.a.h.d r0 = r15.D
            r1 = 8
            r2 = 1
            r13 = 0
            if (r0 == 0) goto L_0x00d7
            if (r0 == 0) goto L_0x0036
            a.e.a.h.d$a[] r0 = r0.C
            r0 = r0[r13]
            a.e.a.h.d$a r5 = a.e.a.h.d.a.WRAP_CONTENT
            if (r0 != r5) goto L_0x0036
            r0 = r2
            goto L_0x0037
        L_0x0036:
            r0 = r13
        L_0x0037:
            a.e.a.h.d r5 = r15.D
            if (r5 == 0) goto L_0x0045
            a.e.a.h.d$a[] r5 = r5.C
            r5 = r5[r2]
            a.e.a.h.d$a r7 = a.e.a.h.d.a.WRAP_CONTENT
            if (r5 != r7) goto L_0x0045
            r5 = r2
            goto L_0x0046
        L_0x0045:
            r5 = r13
        L_0x0046:
            boolean r7 = r15.d(r13)
            if (r7 == 0) goto L_0x0055
            a.e.a.h.d r7 = r15.D
            a.e.a.h.e r7 = (a.e.a.h.e) r7
            r7.a(r15, r13)
        L_0x0053:
            r7 = r2
            goto L_0x006b
        L_0x0055:
            a.e.a.h.c r7 = r15.s
            a.e.a.h.c r8 = r7.d
            if (r8 == 0) goto L_0x005f
            a.e.a.h.c r8 = r8.d
            if (r8 == r7) goto L_0x0053
        L_0x005f:
            a.e.a.h.c r7 = r15.u
            a.e.a.h.c r8 = r7.d
            if (r8 == 0) goto L_0x006a
            a.e.a.h.c r8 = r8.d
            if (r8 != r7) goto L_0x006a
            goto L_0x0053
        L_0x006a:
            r7 = r13
        L_0x006b:
            boolean r8 = r15.d(r2)
            if (r8 == 0) goto L_0x007a
            a.e.a.h.d r8 = r15.D
            a.e.a.h.e r8 = (a.e.a.h.e) r8
            r8.a(r15, r2)
        L_0x0078:
            r8 = r2
            goto L_0x0090
        L_0x007a:
            a.e.a.h.c r8 = r15.t
            a.e.a.h.c r9 = r8.d
            if (r9 == 0) goto L_0x0084
            a.e.a.h.c r9 = r9.d
            if (r9 == r8) goto L_0x0078
        L_0x0084:
            a.e.a.h.c r8 = r15.v
            a.e.a.h.c r9 = r8.d
            if (r9 == 0) goto L_0x008f
            a.e.a.h.c r9 = r9.d
            if (r9 != r8) goto L_0x008f
            goto L_0x0078
        L_0x008f:
            r8 = r13
        L_0x0090:
            if (r0 == 0) goto L_0x00ad
            int r9 = r15.Y
            if (r9 == r1) goto L_0x00ad
            a.e.a.h.c r9 = r15.s
            a.e.a.h.c r9 = r9.d
            if (r9 != 0) goto L_0x00ad
            a.e.a.h.c r9 = r15.u
            a.e.a.h.c r9 = r9.d
            if (r9 != 0) goto L_0x00ad
            a.e.a.h.d r9 = r15.D
            a.e.a.h.c r9 = r9.u
            a.e.a.g r9 = r14.a((java.lang.Object) r9)
            r14.b(r9, r10, r13, r2)
        L_0x00ad:
            if (r5 == 0) goto L_0x00ce
            int r9 = r15.Y
            if (r9 == r1) goto L_0x00ce
            a.e.a.h.c r9 = r15.t
            a.e.a.h.c r9 = r9.d
            if (r9 != 0) goto L_0x00ce
            a.e.a.h.c r9 = r15.v
            a.e.a.h.c r9 = r9.d
            if (r9 != 0) goto L_0x00ce
            a.e.a.h.c r9 = r15.w
            if (r9 != 0) goto L_0x00ce
            a.e.a.h.d r9 = r15.D
            a.e.a.h.c r9 = r9.v
            a.e.a.g r9 = r14.a((java.lang.Object) r9)
            r14.b(r9, r4, r13, r2)
        L_0x00ce:
            r16 = r0
            r22 = r5
            r20 = r7
            r23 = r8
            goto L_0x00df
        L_0x00d7:
            r16 = r13
            r20 = r16
            r22 = r20
            r23 = r22
        L_0x00df:
            int r0 = r15.E
            int r5 = r15.R
            if (r0 >= r5) goto L_0x00e6
            r0 = r5
        L_0x00e6:
            int r5 = r15.F
            int r7 = r15.S
            if (r5 >= r7) goto L_0x00ed
            r5 = r7
        L_0x00ed:
            a.e.a.h.d$a[] r7 = r15.C
            r7 = r7[r13]
            a.e.a.h.d$a r8 = a.e.a.h.d.a.MATCH_CONSTRAINT
            if (r7 == r8) goto L_0x00f7
            r7 = r2
            goto L_0x00f8
        L_0x00f7:
            r7 = r13
        L_0x00f8:
            a.e.a.h.d$a[] r8 = r15.C
            r8 = r8[r2]
            a.e.a.h.d$a r9 = a.e.a.h.d.a.MATCH_CONSTRAINT
            if (r8 == r9) goto L_0x0102
            r8 = r2
            goto L_0x0103
        L_0x0102:
            r8 = r13
        L_0x0103:
            int r9 = r15.H
            r15.n = r9
            float r9 = r15.G
            r15.o = r9
            int r11 = r15.e
            int r12 = r15.f
            r17 = 0
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            r17 = 4
            if (r9 <= 0) goto L_0x0296
            int r9 = r15.Y
            if (r9 == r1) goto L_0x0296
            a.e.a.h.d$a[] r1 = r15.C
            r1 = r1[r13]
            a.e.a.h.d$a r9 = a.e.a.h.d.a.MATCH_CONSTRAINT
            r2 = 3
            if (r1 != r9) goto L_0x0127
            if (r11 != 0) goto L_0x0127
            r11 = r2
        L_0x0127:
            a.e.a.h.d$a[] r1 = r15.C
            r9 = 1
            r1 = r1[r9]
            a.e.a.h.d$a r9 = a.e.a.h.d.a.MATCH_CONSTRAINT
            if (r1 != r9) goto L_0x0133
            if (r12 != 0) goto L_0x0133
            r12 = r2
        L_0x0133:
            a.e.a.h.d$a[] r1 = r15.C
            r9 = r1[r13]
            a.e.a.h.d$a r13 = a.e.a.h.d.a.MATCH_CONSTRAINT
            r19 = 1065353216(0x3f800000, float:1.0)
            if (r9 != r13) goto L_0x0231
            r9 = 1
            r1 = r1[r9]
            if (r1 != r13) goto L_0x0231
            if (r11 != r2) goto L_0x0231
            if (r12 != r2) goto L_0x0231
            int r1 = r15.n
            r2 = -1
            if (r1 != r2) goto L_0x0164
            if (r7 == 0) goto L_0x0153
            if (r8 != 0) goto L_0x0153
            r1 = 0
            r15.n = r1
            goto L_0x0164
        L_0x0153:
            if (r7 != 0) goto L_0x0164
            if (r8 == 0) goto L_0x0164
            r1 = 1
            r15.n = r1
            int r1 = r15.H
            if (r1 != r2) goto L_0x0164
            float r1 = r15.o
            float r1 = r19 / r1
            r15.o = r1
        L_0x0164:
            int r1 = r15.n
            if (r1 != 0) goto L_0x017c
            a.e.a.h.c r1 = r15.t
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x0178
            a.e.a.h.c r1 = r15.v
            boolean r1 = r1.b()
            if (r1 != 0) goto L_0x017c
        L_0x0178:
            r1 = 1
        L_0x0179:
            r15.n = r1
            goto L_0x0193
        L_0x017c:
            r1 = 1
            int r2 = r15.n
            if (r2 != r1) goto L_0x0193
            a.e.a.h.c r1 = r15.s
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x0191
            a.e.a.h.c r1 = r15.u
            boolean r1 = r1.b()
            if (r1 != 0) goto L_0x0193
        L_0x0191:
            r1 = 0
            goto L_0x0179
        L_0x0193:
            int r1 = r15.n
            r2 = -1
            if (r1 != r2) goto L_0x01e4
            a.e.a.h.c r1 = r15.t
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x01b8
            a.e.a.h.c r1 = r15.v
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x01b8
            a.e.a.h.c r1 = r15.s
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x01b8
            a.e.a.h.c r1 = r15.u
            boolean r1 = r1.b()
            if (r1 != 0) goto L_0x01e4
        L_0x01b8:
            a.e.a.h.c r1 = r15.t
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x01cc
            a.e.a.h.c r1 = r15.v
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x01cc
            r1 = 0
        L_0x01c9:
            r15.n = r1
            goto L_0x01e4
        L_0x01cc:
            a.e.a.h.c r1 = r15.s
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x01e4
            a.e.a.h.c r1 = r15.u
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x01e4
            float r1 = r15.o
            float r1 = r19 / r1
            r15.o = r1
            r1 = 1
            goto L_0x01c9
        L_0x01e4:
            int r1 = r15.n
            r2 = -1
            if (r1 != r2) goto L_0x01fd
            if (r16 == 0) goto L_0x01f1
            if (r22 != 0) goto L_0x01f1
            r1 = 0
        L_0x01ee:
            r15.n = r1
            goto L_0x01fd
        L_0x01f1:
            if (r16 != 0) goto L_0x01fd
            if (r22 == 0) goto L_0x01fd
            float r1 = r15.o
            float r1 = r19 / r1
            r15.o = r1
            r1 = 1
            goto L_0x01ee
        L_0x01fd:
            int r1 = r15.n
            r2 = -1
            if (r1 != r2) goto L_0x021e
            int r1 = r15.h
            if (r1 <= 0) goto L_0x020e
            int r1 = r15.k
            if (r1 != 0) goto L_0x020e
            r1 = 0
        L_0x020b:
            r15.n = r1
            goto L_0x021e
        L_0x020e:
            int r1 = r15.h
            if (r1 != 0) goto L_0x021e
            int r1 = r15.k
            if (r1 <= 0) goto L_0x021e
            float r1 = r15.o
            float r1 = r19 / r1
            r15.o = r1
            r1 = 1
            goto L_0x020b
        L_0x021e:
            int r1 = r15.n
            r2 = -1
            if (r1 != r2) goto L_0x028b
            if (r16 == 0) goto L_0x028b
            if (r22 == 0) goto L_0x028b
            float r1 = r15.o
            float r1 = r19 / r1
            r15.o = r1
            r1 = 1
            r15.n = r1
            goto L_0x028b
        L_0x0231:
            a.e.a.h.d$a[] r1 = r15.C
            r7 = 0
            r8 = r1[r7]
            a.e.a.h.d$a r9 = a.e.a.h.d.a.MATCH_CONSTRAINT
            if (r8 != r9) goto L_0x025a
            if (r11 != r2) goto L_0x025a
            r15.n = r7
            float r0 = r15.o
            int r2 = r15.F
            float r2 = (float) r2
            float r0 = r0 * r2
            int r0 = (int) r0
            r7 = 1
            r1 = r1[r7]
            r27 = r0
            r28 = r5
            if (r1 == r9) goto L_0x0253
            r30 = r12
            r29 = r17
            goto L_0x029e
        L_0x0253:
            r26 = r7
            r29 = r11
            r30 = r12
            goto L_0x02a0
        L_0x025a:
            r7 = 1
            a.e.a.h.d$a[] r1 = r15.C
            r1 = r1[r7]
            a.e.a.h.d$a r8 = a.e.a.h.d.a.MATCH_CONSTRAINT
            if (r1 != r8) goto L_0x028b
            if (r12 != r2) goto L_0x028b
            r15.n = r7
            int r1 = r15.H
            r2 = -1
            if (r1 != r2) goto L_0x0272
            float r1 = r15.o
            float r1 = r19 / r1
            r15.o = r1
        L_0x0272:
            float r1 = r15.o
            int r2 = r15.E
            float r2 = (float) r2
            float r1 = r1 * r2
            int r1 = (int) r1
            a.e.a.h.d$a[] r2 = r15.C
            r5 = 0
            r2 = r2[r5]
            a.e.a.h.d$a r5 = a.e.a.h.d.a.MATCH_CONSTRAINT
            r27 = r0
            r28 = r1
            r29 = r11
            if (r2 == r5) goto L_0x0291
            r30 = r17
            goto L_0x029e
        L_0x028b:
            r27 = r0
            r28 = r5
            r29 = r11
        L_0x0291:
            r30 = r12
            r26 = 1
            goto L_0x02a0
        L_0x0296:
            r27 = r0
            r28 = r5
            r29 = r11
            r30 = r12
        L_0x029e:
            r26 = 0
        L_0x02a0:
            int[] r0 = r15.g
            r1 = 0
            r0[r1] = r29
            r1 = 1
            r0[r1] = r30
            if (r26 == 0) goto L_0x02b4
            int r0 = r15.n
            r2 = -1
            if (r0 == 0) goto L_0x02b1
            if (r0 != r2) goto L_0x02b5
        L_0x02b1:
            r25 = 1
            goto L_0x02b7
        L_0x02b4:
            r2 = -1
        L_0x02b5:
            r25 = 0
        L_0x02b7:
            a.e.a.h.d$a[] r0 = r15.C
            r1 = 0
            r0 = r0[r1]
            a.e.a.h.d$a r1 = a.e.a.h.d.a.WRAP_CONTENT
            if (r0 != r1) goto L_0x02c7
            boolean r0 = r15 instanceof a.e.a.h.e
            if (r0 == 0) goto L_0x02c7
            r31 = 1
            goto L_0x02c9
        L_0x02c7:
            r31 = 0
        L_0x02c9:
            a.e.a.h.c r0 = r15.z
            boolean r0 = r0.b()
            r24 = 1
            r32 = r0 ^ 1
            int r0 = r15.f242a
            r1 = 2
            r33 = 0
            if (r0 == r1) goto L_0x033a
            a.e.a.h.d r0 = r15.D
            if (r0 == 0) goto L_0x02e7
            a.e.a.h.c r0 = r0.u
            a.e.a.g r0 = r14.a((java.lang.Object) r0)
            r34 = r0
            goto L_0x02e9
        L_0x02e7:
            r34 = r33
        L_0x02e9:
            a.e.a.h.d r0 = r15.D
            if (r0 == 0) goto L_0x02f6
            a.e.a.h.c r0 = r0.s
            a.e.a.g r0 = r14.a((java.lang.Object) r0)
            r35 = r0
            goto L_0x02f8
        L_0x02f6:
            r35 = r33
        L_0x02f8:
            a.e.a.h.d$a[] r0 = r15.C
            r13 = 0
            r5 = r0[r13]
            a.e.a.h.c r7 = r15.s
            a.e.a.h.c r8 = r15.u
            int r9 = r15.I
            int r11 = r15.R
            int[] r0 = r15.q
            r12 = r0[r13]
            float r0 = r15.V
            r13 = r0
            int r0 = r15.h
            r17 = r0
            int r0 = r15.i
            r18 = r0
            float r0 = r15.j
            r19 = r0
            r0 = r38
            r1 = r39
            r2 = r16
            r36 = r3
            r3 = r35
            r24 = r4
            r4 = r34
            r37 = r6
            r6 = r31
            r31 = r10
            r10 = r27
            r14 = r25
            r15 = r20
            r16 = r29
            r20 = r32
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0342
        L_0x033a:
            r36 = r3
            r24 = r4
            r37 = r6
            r31 = r10
        L_0x0342:
            r15 = r38
            int r0 = r15.f243b
            r1 = 2
            if (r0 != r1) goto L_0x034a
            return
        L_0x034a:
            a.e.a.h.d$a[] r0 = r15.C
            r14 = 1
            r0 = r0[r14]
            a.e.a.h.d$a r1 = a.e.a.h.d.a.WRAP_CONTENT
            if (r0 != r1) goto L_0x0359
            boolean r0 = r15 instanceof a.e.a.h.e
            if (r0 == 0) goto L_0x0359
            r6 = r14
            goto L_0x035a
        L_0x0359:
            r6 = 0
        L_0x035a:
            if (r26 == 0) goto L_0x0366
            int r0 = r15.n
            if (r0 == r14) goto L_0x0363
            r1 = -1
            if (r0 != r1) goto L_0x0366
        L_0x0363:
            r16 = r14
            goto L_0x0368
        L_0x0366:
            r16 = 0
        L_0x0368:
            int r0 = r15.Q
            if (r0 <= 0) goto L_0x0393
            a.e.a.h.c r1 = r15.w
            a.e.a.h.j r1 = r1.f237a
            int r2 = r1.f249b
            r10 = r39
            if (r2 != r14) goto L_0x037a
            r1.a((a.e.a.e) r10)
            goto L_0x0395
        L_0x037a:
            r1 = 6
            r2 = r36
            r4 = r37
            r10.a(r2, r4, r0, r1)
            a.e.a.h.c r0 = r15.w
            a.e.a.h.c r0 = r0.d
            if (r0 == 0) goto L_0x0397
            a.e.a.g r0 = r10.a((java.lang.Object) r0)
            r3 = 0
            r10.a(r2, r0, r3, r1)
            r20 = r3
            goto L_0x0399
        L_0x0393:
            r10 = r39
        L_0x0395:
            r4 = r37
        L_0x0397:
            r20 = r32
        L_0x0399:
            a.e.a.h.d r0 = r15.D
            if (r0 == 0) goto L_0x03a6
            a.e.a.h.c r0 = r0.v
            a.e.a.g r0 = r10.a((java.lang.Object) r0)
            r25 = r0
            goto L_0x03a8
        L_0x03a6:
            r25 = r33
        L_0x03a8:
            a.e.a.h.d r0 = r15.D
            if (r0 == 0) goto L_0x03b4
            a.e.a.h.c r0 = r0.t
            a.e.a.g r0 = r10.a((java.lang.Object) r0)
            r3 = r0
            goto L_0x03b6
        L_0x03b4:
            r3 = r33
        L_0x03b6:
            a.e.a.h.d$a[] r0 = r15.C
            r5 = r0[r14]
            a.e.a.h.c r7 = r15.t
            a.e.a.h.c r8 = r15.v
            int r9 = r15.J
            int r11 = r15.S
            int[] r0 = r15.q
            r12 = r0[r14]
            float r13 = r15.W
            int r0 = r15.k
            r17 = r0
            int r0 = r15.l
            r18 = r0
            float r0 = r15.m
            r19 = r0
            r0 = r38
            r1 = r39
            r2 = r22
            r22 = r4
            r4 = r25
            r10 = r28
            r14 = r16
            r15 = r23
            r16 = r30
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r26 == 0) goto L_0x040f
            r6 = 6
            r7 = r38
            int r0 = r7.n
            r1 = 1
            float r5 = r7.o
            if (r0 != r1) goto L_0x0400
            r0 = r39
            r1 = r24
            r2 = r22
            r3 = r31
            r4 = r21
            goto L_0x040b
        L_0x0400:
            r6 = 6
            r0 = r39
            r1 = r31
            r2 = r21
            r3 = r24
            r4 = r22
        L_0x040b:
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x0411
        L_0x040f:
            r7 = r38
        L_0x0411:
            a.e.a.h.c r0 = r7.z
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x04b0
            a.e.a.h.c r0 = r7.z
            a.e.a.h.c r0 = r0.d
            a.e.a.h.d r0 = r0.f238b
            float r1 = r7.r
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            a.e.a.h.c r2 = r7.z
            int r2 = r2.a()
            a.e.a.h.c$c r3 = a.e.a.h.c.C0011c.LEFT
            a.e.a.h.c r3 = r7.a((a.e.a.h.c.C0011c) r3)
            r4 = r39
            a.e.a.g r9 = r4.a((java.lang.Object) r3)
            a.e.a.h.c$c r3 = a.e.a.h.c.C0011c.TOP
            a.e.a.h.c r3 = r7.a((a.e.a.h.c.C0011c) r3)
            a.e.a.g r11 = r4.a((java.lang.Object) r3)
            a.e.a.h.c$c r3 = a.e.a.h.c.C0011c.RIGHT
            a.e.a.h.c r3 = r7.a((a.e.a.h.c.C0011c) r3)
            a.e.a.g r3 = r4.a((java.lang.Object) r3)
            a.e.a.h.c$c r5 = a.e.a.h.c.C0011c.BOTTOM
            a.e.a.h.c r5 = r7.a((a.e.a.h.c.C0011c) r5)
            a.e.a.g r12 = r4.a((java.lang.Object) r5)
            a.e.a.h.c$c r5 = a.e.a.h.c.C0011c.LEFT
            a.e.a.h.c r5 = r0.a((a.e.a.h.c.C0011c) r5)
            a.e.a.g r5 = r4.a((java.lang.Object) r5)
            a.e.a.h.c$c r6 = a.e.a.h.c.C0011c.TOP
            a.e.a.h.c r6 = r0.a((a.e.a.h.c.C0011c) r6)
            a.e.a.g r13 = r4.a((java.lang.Object) r6)
            a.e.a.h.c$c r6 = a.e.a.h.c.C0011c.RIGHT
            a.e.a.h.c r6 = r0.a((a.e.a.h.c.C0011c) r6)
            a.e.a.g r6 = r4.a((java.lang.Object) r6)
            a.e.a.h.c$c r8 = a.e.a.h.c.C0011c.BOTTOM
            a.e.a.h.c r0 = r0.a((a.e.a.h.c.C0011c) r8)
            a.e.a.g r14 = r4.a((java.lang.Object) r0)
            a.e.a.b r0 = r39.b()
            double r7 = (double) r1
            double r15 = java.lang.Math.sin(r7)
            double r1 = (double) r2
            r17 = r5
            r18 = r6
            double r5 = r15 * r1
            float r15 = (float) r5
            r10 = r0
            r10.b(r11, r12, r13, r14, r15)
            r4.a((a.e.a.b) r0)
            a.e.a.b r0 = r39.b()
            double r5 = java.lang.Math.cos(r7)
            double r5 = r5 * r1
            float r13 = (float) r5
            r8 = r0
            r10 = r3
            r11 = r17
            r12 = r18
            r8.b(r9, r10, r11, r12, r13)
            r4.a((a.e.a.b) r0)
        L_0x04b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.h.d.a(a.e.a.e):void");
    }

    public void a(c.C0011c cVar, d dVar, c.C0011c cVar2, int i2, int i3) {
        a(cVar).a(dVar.a(cVar2), i2, i3, c.b.STRONG, 0, true);
    }

    public void a(a aVar) {
        this.C[0] = aVar;
        if (aVar == a.WRAP_CONTENT) {
            f(this.T);
        }
    }

    public boolean a() {
        return this.Y != 8;
    }

    public a b(int i2) {
        if (i2 == 0) {
            return e();
        }
        if (i2 == 1) {
            return i();
        }
        return null;
    }

    public ArrayList<c> b() {
        return this.B;
    }

    public void b(int i2, int i3) {
        this.O = i2;
        this.P = i3;
    }

    public void b(e eVar) {
        eVar.a((Object) this.s);
        eVar.a((Object) this.t);
        eVar.a((Object) this.u);
        eVar.a((Object) this.v);
        if (this.Q > 0) {
            eVar.a((Object) this.w);
        }
    }

    public void b(a aVar) {
        this.C[1] = aVar;
        if (aVar == a.WRAP_CONTENT) {
            e(this.U);
        }
    }

    public int c() {
        return this.J + this.F;
    }

    public int c(int i2) {
        if (i2 == 0) {
            return j();
        }
        if (i2 == 1) {
            return d();
        }
        return 0;
    }

    public void c(int i2, int i3) {
        this.J = i2;
        int i4 = i3 - i2;
        this.F = i4;
        int i5 = this.S;
        if (i4 < i5) {
            this.F = i5;
        }
    }

    public int d() {
        if (this.Y == 8) {
            return 0;
        }
        return this.F;
    }

    public final boolean d(int i2) {
        int i3 = i2 * 2;
        c[] cVarArr = this.A;
        if (!(cVarArr[i3].d == null || cVarArr[i3].d.d == cVarArr[i3])) {
            int i4 = i3 + 1;
            return cVarArr[i4].d != null && cVarArr[i4].d.d == cVarArr[i4];
        }
    }

    public a e() {
        return this.C[0];
    }

    public void e(int i2) {
        this.F = i2;
        int i3 = this.S;
        if (i2 < i3) {
            this.F = i3;
        }
    }

    public k f() {
        if (this.d == null) {
            this.d = new k();
        }
        return this.d;
    }

    public void f(int i2) {
        this.E = i2;
        int i3 = this.R;
        if (i2 < i3) {
            this.E = i3;
        }
    }

    public k g() {
        if (this.c == null) {
            this.c = new k();
        }
        return this.c;
    }

    public int h() {
        return this.I + this.E;
    }

    public a i() {
        return this.C[1];
    }

    public int j() {
        if (this.Y == 8) {
            return 0;
        }
        return this.E;
    }

    public boolean k() {
        if (this.s.f237a.f249b == 1 && this.u.f237a.f249b == 1 && this.t.f237a.f249b == 1 && this.v.f237a.f249b == 1) {
            return true;
        }
        return false;
    }

    public void l() {
        this.s.c();
        this.t.c();
        this.u.c();
        this.v.c();
        this.w.c();
        this.x.c();
        this.y.c();
        this.z.c();
        this.D = null;
        this.r = 0.0f;
        this.E = 0;
        this.F = 0;
        this.G = 0.0f;
        this.H = -1;
        this.I = 0;
        this.J = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        float f2 = j0;
        this.V = f2;
        this.W = f2;
        a[] aVarArr = this.C;
        a aVar = a.FIXED;
        aVarArr[0] = aVar;
        aVarArr[1] = aVar;
        this.X = null;
        this.Y = 0;
        this.a0 = null;
        this.e0 = 0;
        this.f0 = 0;
        float[] fArr = this.g0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f242a = -1;
        this.f243b = -1;
        int[] iArr = this.q;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.e = 0;
        this.f = 0;
        this.j = 1.0f;
        this.m = 1.0f;
        this.i = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.h = 0;
        this.k = 0;
        this.n = -1;
        this.o = 1.0f;
        k kVar = this.c;
        if (kVar != null) {
            kVar.f249b = 0;
            kVar.f248a.clear();
            kVar.c = 0.0f;
        }
        k kVar2 = this.d;
        if (kVar2 != null) {
            kVar2.f249b = 0;
            kVar2.f248a.clear();
            kVar2.c = 0.0f;
        }
        this.p = null;
        this.b0 = false;
        this.c0 = false;
        this.d0 = false;
    }

    public void m() {
        for (int i2 = 0; i2 < 6; i2++) {
            this.A[i2].f237a.e();
        }
    }

    public void n() {
    }

    public void o() {
        int i2 = this.I;
        int i3 = this.J;
        this.M = i2;
        this.N = i3;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.a0 != null) {
            StringBuilder a2 = b.a.a.a.a.a("type: ");
            a2.append(this.a0);
            a2.append(" ");
            str = a2.toString();
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.Z != null) {
            StringBuilder a3 = b.a.a.a.a.a("id: ");
            a3.append(this.Z);
            a3.append(" ");
            str2 = a3.toString();
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.I);
        sb.append(", ");
        sb.append(this.J);
        sb.append(") - (");
        sb.append(this.E);
        sb.append(" x ");
        sb.append(this.F);
        sb.append(") wrap: (");
        sb.append(this.T);
        sb.append(" x ");
        sb.append(this.U);
        sb.append(")");
        return sb.toString();
    }

    public void c(e eVar) {
        int i2;
        int i3;
        int b2 = eVar.b((Object) this.s);
        int b3 = eVar.b((Object) this.t);
        int b4 = eVar.b((Object) this.u);
        int b5 = eVar.b((Object) this.v);
        int i4 = b5 - b3;
        if (b4 - b2 < 0 || i4 < 0 || b2 == Integer.MIN_VALUE || b2 == Integer.MAX_VALUE || b3 == Integer.MIN_VALUE || b3 == Integer.MAX_VALUE || b4 == Integer.MIN_VALUE || b4 == Integer.MAX_VALUE || b5 == Integer.MIN_VALUE || b5 == Integer.MAX_VALUE) {
            b5 = 0;
            b2 = 0;
            b3 = 0;
            b4 = 0;
        }
        int i5 = b4 - b2;
        int i6 = b5 - b3;
        this.I = b2;
        this.J = b3;
        if (this.Y == 8) {
            this.E = 0;
            this.F = 0;
            return;
        }
        if (this.C[0] == a.FIXED && i5 < (i3 = this.E)) {
            i5 = i3;
        }
        if (this.C[1] == a.FIXED && i6 < (i2 = this.F)) {
            i6 = i2;
        }
        this.E = i5;
        this.F = i6;
        int i7 = this.S;
        if (i6 < i7) {
            this.F = i7;
        }
        int i8 = this.E;
        int i9 = this.R;
        if (i8 < i9) {
            this.E = i9;
        }
        this.c0 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01e7, code lost:
        if (r8 != false) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01f6, code lost:
        if (r8 != false) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0201, code lost:
        r6.d = r3;
        r6.e = (float) r1;
        r3.f248a.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        if (r8 != false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a7, code lost:
        if (r8 != false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b7, code lost:
        if (r8 != false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0104, code lost:
        if (r8 != false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0117, code lost:
        if (r8 != false) goto L_0x0119;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = 0
            r2 = r1
        L_0x0004:
            r3 = 6
            r4 = 4
            if (r2 >= r3) goto L_0x003a
            a.e.a.h.c[] r3 = r0.A
            r3 = r3[r2]
            a.e.a.h.j r3 = r3.f237a
            a.e.a.h.c r5 = r3.c
            a.e.a.h.c r6 = r5.d
            if (r6 != 0) goto L_0x0015
            goto L_0x0037
        L_0x0015:
            a.e.a.h.c r7 = r6.d
            if (r7 != r5) goto L_0x001f
            r3.h = r4
            a.e.a.h.j r5 = r6.f237a
            r5.h = r4
        L_0x001f:
            a.e.a.h.c r4 = r3.c
            int r4 = r4.a()
            a.e.a.h.c r5 = r3.c
            a.e.a.h.c$c r5 = r5.c
            a.e.a.h.c$c r7 = a.e.a.h.c.C0011c.RIGHT
            if (r5 == r7) goto L_0x0031
            a.e.a.h.c$c r7 = a.e.a.h.c.C0011c.BOTTOM
            if (r5 != r7) goto L_0x0032
        L_0x0031:
            int r4 = -r4
        L_0x0032:
            a.e.a.h.j r5 = r6.f237a
            r3.a((a.e.a.h.j) r5, (int) r4)
        L_0x0037:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x003a:
            a.e.a.h.c r2 = r0.s
            a.e.a.h.j r2 = r2.f237a
            a.e.a.h.c r3 = r0.t
            a.e.a.h.j r3 = r3.f237a
            a.e.a.h.c r5 = r0.u
            a.e.a.h.j r5 = r5.f237a
            a.e.a.h.c r6 = r0.v
            a.e.a.h.j r6 = r6.f237a
            r7 = 8
            r8 = r17 & 8
            r9 = 1
            if (r8 != r7) goto L_0x0053
            r8 = r9
            goto L_0x0054
        L_0x0053:
            r8 = r1
        L_0x0054:
            a.e.a.h.d$a[] r10 = r0.C
            r10 = r10[r1]
            a.e.a.h.d$a r11 = a.e.a.h.d.a.MATCH_CONSTRAINT
            if (r10 != r11) goto L_0x0064
            boolean r10 = a.e.a.h.i.a(r0, r1)
            if (r10 == 0) goto L_0x0064
            r10 = r9
            goto L_0x0065
        L_0x0064:
            r10 = r1
        L_0x0065:
            int r11 = r2.h
            r12 = 0
            r13 = 3
            r14 = -1
            r15 = 2
            if (r11 == r4) goto L_0x01a8
            int r11 = r5.h
            if (r11 == r4) goto L_0x01a8
            a.e.a.h.d$a[] r11 = r0.C
            r11 = r11[r1]
            a.e.a.h.d$a r1 = a.e.a.h.d.a.FIXED
            if (r11 == r1) goto L_0x00f4
            if (r10 == 0) goto L_0x0081
            int r1 = r0.Y
            if (r1 != r7) goto L_0x0081
            goto L_0x00f4
        L_0x0081:
            if (r10 == 0) goto L_0x01a8
            int r1 = r16.j()
            r2.h = r9
            r5.h = r9
            a.e.a.h.c r10 = r0.s
            a.e.a.h.c r10 = r10.d
            if (r10 != 0) goto L_0x009b
            a.e.a.h.c r10 = r0.u
            a.e.a.h.c r10 = r10.d
            if (r10 != 0) goto L_0x009b
            if (r8 == 0) goto L_0x0126
            goto L_0x0119
        L_0x009b:
            a.e.a.h.c r10 = r0.s
            a.e.a.h.c r10 = r10.d
            if (r10 == 0) goto L_0x00ab
            a.e.a.h.c r10 = r0.u
            a.e.a.h.c r10 = r10.d
            if (r10 != 0) goto L_0x00ab
            if (r8 == 0) goto L_0x0126
            goto L_0x0119
        L_0x00ab:
            a.e.a.h.c r10 = r0.s
            a.e.a.h.c r10 = r10.d
            if (r10 != 0) goto L_0x00bb
            a.e.a.h.c r10 = r0.u
            a.e.a.h.c r10 = r10.d
            if (r10 == 0) goto L_0x00bb
            if (r8 == 0) goto L_0x015f
            goto L_0x0153
        L_0x00bb:
            a.e.a.h.c r10 = r0.s
            a.e.a.h.c r10 = r10.d
            if (r10 == 0) goto L_0x01a8
            a.e.a.h.c r10 = r0.u
            a.e.a.h.c r10 = r10.d
            if (r10 == 0) goto L_0x01a8
            if (r8 == 0) goto L_0x00db
            a.e.a.h.k r10 = r16.g()
            java.util.HashSet<a.e.a.h.l> r10 = r10.f248a
            r10.add(r2)
            a.e.a.h.k r10 = r16.g()
            java.util.HashSet<a.e.a.h.l> r10 = r10.f248a
            r10.add(r5)
        L_0x00db:
            float r10 = r0.G
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x00e7
            r2.h = r13
            r5.h = r13
            goto L_0x01a4
        L_0x00e7:
            r2.h = r15
            r5.h = r15
            r2.i = r5
            r5.i = r2
            r0.f(r1)
            goto L_0x01a8
        L_0x00f4:
            a.e.a.h.c r1 = r0.s
            a.e.a.h.c r1 = r1.d
            if (r1 != 0) goto L_0x0107
            a.e.a.h.c r1 = r0.u
            a.e.a.h.c r1 = r1.d
            if (r1 != 0) goto L_0x0107
            r2.h = r9
            r5.h = r9
            if (r8 == 0) goto L_0x0122
            goto L_0x0119
        L_0x0107:
            a.e.a.h.c r1 = r0.s
            a.e.a.h.c r1 = r1.d
            if (r1 == 0) goto L_0x0132
            a.e.a.h.c r1 = r0.u
            a.e.a.h.c r1 = r1.d
            if (r1 != 0) goto L_0x0132
            r2.h = r9
            r5.h = r9
            if (r8 == 0) goto L_0x0122
        L_0x0119:
            a.e.a.h.k r1 = r16.g()
            r5.a((a.e.a.h.j) r2, (int) r9, (a.e.a.h.k) r1)
            goto L_0x01a8
        L_0x0122:
            int r1 = r16.j()
        L_0x0126:
            r5.d = r2
            float r1 = (float) r1
            r5.e = r1
            java.util.HashSet<a.e.a.h.l> r1 = r2.f248a
            r1.add(r5)
            goto L_0x01a8
        L_0x0132:
            a.e.a.h.c r1 = r0.s
            a.e.a.h.c r1 = r1.d
            if (r1 != 0) goto L_0x016b
            a.e.a.h.c r1 = r0.u
            a.e.a.h.c r1 = r1.d
            if (r1 == 0) goto L_0x016b
            r2.h = r9
            r5.h = r9
            int r1 = r16.j()
            int r1 = -r1
            r2.d = r5
            float r1 = (float) r1
            r2.e = r1
            java.util.HashSet<a.e.a.h.l> r1 = r5.f248a
            r1.add(r2)
            if (r8 == 0) goto L_0x015b
        L_0x0153:
            a.e.a.h.k r1 = r16.g()
            r2.a((a.e.a.h.j) r5, (int) r14, (a.e.a.h.k) r1)
            goto L_0x01a8
        L_0x015b:
            int r1 = r16.j()
        L_0x015f:
            int r1 = -r1
            r2.d = r5
            float r1 = (float) r1
            r2.e = r1
            java.util.HashSet<a.e.a.h.l> r1 = r5.f248a
            r1.add(r2)
            goto L_0x01a8
        L_0x016b:
            a.e.a.h.c r1 = r0.s
            a.e.a.h.c r1 = r1.d
            if (r1 == 0) goto L_0x01a8
            a.e.a.h.c r1 = r0.u
            a.e.a.h.c r1 = r1.d
            if (r1 == 0) goto L_0x01a8
            r2.h = r15
            r5.h = r15
            if (r8 == 0) goto L_0x01a4
            a.e.a.h.k r1 = r16.g()
            java.util.HashSet<a.e.a.h.l> r1 = r1.f248a
            r1.add(r2)
            a.e.a.h.k r1 = r16.g()
            java.util.HashSet<a.e.a.h.l> r1 = r1.f248a
            r1.add(r5)
            a.e.a.h.k r1 = r16.g()
            r2.i = r5
            r2.l = r1
            r2.m = r14
            a.e.a.h.k r1 = r16.g()
            r5.i = r2
            r5.l = r1
            r5.m = r9
            goto L_0x01a8
        L_0x01a4:
            r2.i = r5
            r5.i = r2
        L_0x01a8:
            a.e.a.h.d$a[] r1 = r0.C
            r1 = r1[r9]
            a.e.a.h.d$a r2 = a.e.a.h.d.a.MATCH_CONSTRAINT
            if (r1 != r2) goto L_0x01b8
            boolean r1 = a.e.a.h.i.a(r0, r9)
            if (r1 == 0) goto L_0x01b8
            r1 = r9
            goto L_0x01b9
        L_0x01b8:
            r1 = 0
        L_0x01b9:
            int r2 = r3.h
            if (r2 == r4) goto L_0x0350
            int r2 = r6.h
            if (r2 == r4) goto L_0x0350
            a.e.a.h.d$a[] r2 = r0.C
            r2 = r2[r9]
            a.e.a.h.d$a r4 = a.e.a.h.d.a.FIXED
            if (r2 == r4) goto L_0x0271
            if (r1 == 0) goto L_0x01d1
            int r2 = r0.Y
            if (r2 != r7) goto L_0x01d1
            goto L_0x0271
        L_0x01d1:
            if (r1 == 0) goto L_0x0350
            int r1 = r16.d()
            r3.h = r9
            r6.h = r9
            a.e.a.h.c r2 = r0.t
            a.e.a.h.c r2 = r2.d
            if (r2 != 0) goto L_0x01ea
            a.e.a.h.c r2 = r0.v
            a.e.a.h.c r2 = r2.d
            if (r2 != 0) goto L_0x01ea
            if (r8 == 0) goto L_0x0201
            goto L_0x01f8
        L_0x01ea:
            a.e.a.h.c r2 = r0.t
            a.e.a.h.c r2 = r2.d
            if (r2 == 0) goto L_0x020d
            a.e.a.h.c r2 = r0.v
            a.e.a.h.c r2 = r2.d
            if (r2 != 0) goto L_0x020d
            if (r8 == 0) goto L_0x0201
        L_0x01f8:
            a.e.a.h.k r1 = r16.f()
            r6.a((a.e.a.h.j) r3, (int) r9, (a.e.a.h.k) r1)
            goto L_0x0350
        L_0x0201:
            r6.d = r3
            float r1 = (float) r1
            r6.e = r1
            java.util.HashSet<a.e.a.h.l> r1 = r3.f248a
            r1.add(r6)
            goto L_0x0350
        L_0x020d:
            a.e.a.h.c r2 = r0.t
            a.e.a.h.c r2 = r2.d
            if (r2 != 0) goto L_0x0231
            a.e.a.h.c r2 = r0.v
            a.e.a.h.c r2 = r2.d
            if (r2 == 0) goto L_0x0231
            if (r8 == 0) goto L_0x0224
            a.e.a.h.k r1 = r16.f()
            r3.a((a.e.a.h.j) r6, (int) r14, (a.e.a.h.k) r1)
            goto L_0x0350
        L_0x0224:
            int r1 = -r1
            r3.d = r6
            float r1 = (float) r1
            r3.e = r1
            java.util.HashSet<a.e.a.h.l> r1 = r6.f248a
            r1.add(r3)
            goto L_0x0350
        L_0x0231:
            a.e.a.h.c r2 = r0.t
            a.e.a.h.c r2 = r2.d
            if (r2 == 0) goto L_0x0350
            a.e.a.h.c r2 = r0.v
            a.e.a.h.c r2 = r2.d
            if (r2 == 0) goto L_0x0350
            if (r8 == 0) goto L_0x0251
            a.e.a.h.k r2 = r16.f()
            java.util.HashSet<a.e.a.h.l> r2 = r2.f248a
            r2.add(r3)
            a.e.a.h.k r2 = r16.g()
            java.util.HashSet<a.e.a.h.l> r2 = r2.f248a
            r2.add(r6)
        L_0x0251:
            float r2 = r0.G
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0261
            r3.h = r13
            r6.h = r13
            r3.i = r6
            r6.i = r3
            goto L_0x0350
        L_0x0261:
            r3.h = r15
            r6.h = r15
            r3.i = r6
            r6.i = r3
            r0.e(r1)
            int r1 = r0.Q
            if (r1 <= 0) goto L_0x0350
            goto L_0x02d7
        L_0x0271:
            a.e.a.h.c r1 = r0.t
            a.e.a.h.c r1 = r1.d
            if (r1 != 0) goto L_0x02ab
            a.e.a.h.c r1 = r0.v
            a.e.a.h.c r1 = r1.d
            if (r1 != 0) goto L_0x02ab
            r3.h = r9
            r6.h = r9
            if (r8 == 0) goto L_0x028b
            a.e.a.h.k r1 = r16.f()
            r6.a((a.e.a.h.j) r3, (int) r9, (a.e.a.h.k) r1)
            goto L_0x0299
        L_0x028b:
            int r1 = r16.d()
            r6.d = r3
            float r1 = (float) r1
            r6.e = r1
            java.util.HashSet<a.e.a.h.l> r1 = r3.f248a
            r1.add(r6)
        L_0x0299:
            a.e.a.h.c r1 = r0.w
            a.e.a.h.c r2 = r1.d
            if (r2 == 0) goto L_0x0350
            a.e.a.h.j r1 = r1.f237a
            r1.h = r9
            int r2 = r0.Q
            int r2 = -r2
            r3.a((int) r9, (a.e.a.h.j) r1, (int) r2)
            goto L_0x0350
        L_0x02ab:
            a.e.a.h.c r1 = r0.t
            a.e.a.h.c r1 = r1.d
            if (r1 == 0) goto L_0x02db
            a.e.a.h.c r1 = r0.v
            a.e.a.h.c r1 = r1.d
            if (r1 != 0) goto L_0x02db
            r3.h = r9
            r6.h = r9
            if (r8 == 0) goto L_0x02c5
            a.e.a.h.k r1 = r16.f()
            r6.a((a.e.a.h.j) r3, (int) r9, (a.e.a.h.k) r1)
            goto L_0x02d3
        L_0x02c5:
            int r1 = r16.d()
            r6.d = r3
            float r1 = (float) r1
            r6.e = r1
            java.util.HashSet<a.e.a.h.l> r1 = r3.f248a
            r1.add(r6)
        L_0x02d3:
            int r1 = r0.Q
            if (r1 <= 0) goto L_0x0350
        L_0x02d7:
            a.e.a.h.c r2 = r0.w
            goto L_0x034b
        L_0x02db:
            a.e.a.h.c r1 = r0.t
            a.e.a.h.c r1 = r1.d
            if (r1 != 0) goto L_0x0309
            a.e.a.h.c r1 = r0.v
            a.e.a.h.c r1 = r1.d
            if (r1 == 0) goto L_0x0309
            r3.h = r9
            r6.h = r9
            if (r8 == 0) goto L_0x02f5
            a.e.a.h.k r1 = r16.f()
            r3.a((a.e.a.h.j) r6, (int) r14, (a.e.a.h.k) r1)
            goto L_0x0304
        L_0x02f5:
            int r1 = r16.d()
            int r1 = -r1
            r3.d = r6
            float r1 = (float) r1
            r3.e = r1
            java.util.HashSet<a.e.a.h.l> r1 = r6.f248a
            r1.add(r3)
        L_0x0304:
            int r1 = r0.Q
            if (r1 <= 0) goto L_0x0350
            goto L_0x02d7
        L_0x0309:
            a.e.a.h.c r1 = r0.t
            a.e.a.h.c r1 = r1.d
            if (r1 == 0) goto L_0x0350
            a.e.a.h.c r1 = r0.v
            a.e.a.h.c r1 = r1.d
            if (r1 == 0) goto L_0x0350
            r3.h = r15
            r6.h = r15
            if (r8 == 0) goto L_0x0342
            a.e.a.h.k r1 = r16.f()
            r3.i = r6
            r3.l = r1
            r3.m = r14
            a.e.a.h.k r1 = r16.f()
            r6.i = r3
            r6.l = r1
            r6.m = r9
            a.e.a.h.k r1 = r16.f()
            java.util.HashSet<a.e.a.h.l> r1 = r1.f248a
            r1.add(r3)
            a.e.a.h.k r1 = r16.g()
            java.util.HashSet<a.e.a.h.l> r1 = r1.f248a
            r1.add(r6)
            goto L_0x0346
        L_0x0342:
            r3.i = r6
            r6.i = r3
        L_0x0346:
            int r1 = r0.Q
            if (r1 <= 0) goto L_0x0350
            goto L_0x02d7
        L_0x034b:
            a.e.a.h.j r2 = r2.f237a
            r2.a((int) r9, (a.e.a.h.j) r3, (int) r1)
        L_0x0350:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.h.d.a(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01df, code lost:
        if (r30 != false) goto L_0x01e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x030d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:186:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01c6 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(a.e.a.e r29, boolean r30, a.e.a.g r31, a.e.a.g r32, a.e.a.h.d.a r33, boolean r34, a.e.a.h.c r35, a.e.a.h.c r36, int r37, int r38, int r39, int r40, float r41, boolean r42, boolean r43, int r44, int r45, int r46, float r47, boolean r48) {
        /*
            r28 = this;
            r0 = r28
            r10 = r29
            r11 = r31
            r12 = r32
            r13 = r35
            r14 = r36
            r1 = r39
            r2 = r40
            a.e.a.g r15 = r10.a((java.lang.Object) r13)
            a.e.a.g r9 = r10.a((java.lang.Object) r14)
            a.e.a.h.c r3 = r13.d
            a.e.a.g r8 = r10.a((java.lang.Object) r3)
            a.e.a.h.c r3 = r14.d
            a.e.a.g r7 = r10.a((java.lang.Object) r3)
            boolean r3 = r10.g
            r6 = 1
            r5 = 6
            if (r3 == 0) goto L_0x0047
            a.e.a.h.j r3 = r13.f237a
            int r4 = r3.f249b
            if (r4 != r6) goto L_0x0047
            a.e.a.h.j r4 = r14.f237a
            int r4 = r4.f249b
            if (r4 != r6) goto L_0x0047
            r3.a((a.e.a.e) r10)
            a.e.a.h.j r1 = r14.f237a
            r1.a((a.e.a.e) r10)
            if (r43 != 0) goto L_0x0046
            if (r30 == 0) goto L_0x0046
            r1 = 0
            r10.b(r12, r9, r1, r5)
        L_0x0046:
            return
        L_0x0047:
            boolean r16 = r35.b()
            boolean r17 = r36.b()
            a.e.a.h.c r3 = r0.z
            boolean r18 = r3.b()
            if (r16 == 0) goto L_0x0059
            r3 = r6
            goto L_0x005a
        L_0x0059:
            r3 = 0
        L_0x005a:
            if (r17 == 0) goto L_0x005e
            int r3 = r3 + 1
        L_0x005e:
            if (r18 == 0) goto L_0x0062
            int r3 = r3 + 1
        L_0x0062:
            r4 = r3
            if (r42 == 0) goto L_0x0067
            r5 = 3
            goto L_0x0069
        L_0x0067:
            r5 = r44
        L_0x0069:
            int r3 = r33.ordinal()
            r6 = 2
            r22 = r4
            if (r3 == 0) goto L_0x0078
            r4 = 1
            if (r3 == r4) goto L_0x0078
            if (r3 == r6) goto L_0x007a
            r4 = 3
        L_0x0078:
            r3 = 0
            goto L_0x007f
        L_0x007a:
            r3 = 4
            if (r5 != r3) goto L_0x007e
            goto L_0x0078
        L_0x007e:
            r3 = 1
        L_0x007f:
            int r4 = r0.Y
            r6 = 8
            if (r4 != r6) goto L_0x0088
            r3 = 0
            r4 = 0
            goto L_0x008b
        L_0x0088:
            r4 = r3
            r3 = r38
        L_0x008b:
            if (r48 == 0) goto L_0x00a8
            if (r16 != 0) goto L_0x0099
            if (r17 != 0) goto L_0x0099
            if (r18 != 0) goto L_0x0099
            r6 = r37
            r10.a((a.e.a.g) r15, (int) r6)
            goto L_0x00a8
        L_0x0099:
            if (r16 == 0) goto L_0x00a8
            if (r17 != 0) goto L_0x00a8
            int r6 = r35.a()
            r23 = r7
            r7 = 6
            r10.a(r15, r8, r6, r7)
            goto L_0x00ab
        L_0x00a8:
            r23 = r7
            r7 = 6
        L_0x00ab:
            if (r4 != 0) goto L_0x00db
            if (r34 == 0) goto L_0x00c4
            r6 = 3
            r7 = 0
            r10.a(r9, r15, r7, r6)
            r3 = 6
            if (r1 <= 0) goto L_0x00ba
            r10.b(r9, r15, r1, r3)
        L_0x00ba:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r6) goto L_0x00c2
            r10.c(r9, r15, r2, r3)
        L_0x00c2:
            r6 = r3
            goto L_0x00c9
        L_0x00c4:
            r6 = r7
            r7 = 0
            r10.a(r9, r15, r3, r6)
        L_0x00c9:
            r3 = r45
            r13 = r4
            r25 = r5
            r0 = r22
            r26 = r23
            r1 = 2
            r21 = 4
            r22 = r8
            r8 = r46
            goto L_0x01c4
        L_0x00db:
            r6 = r7
            r7 = 0
            r2 = -2
            r7 = r45
            r6 = r46
            if (r7 != r2) goto L_0x00e5
            r7 = r3
        L_0x00e5:
            if (r6 != r2) goto L_0x00e8
            r6 = r3
        L_0x00e8:
            r2 = 6
            if (r7 <= 0) goto L_0x00f2
            r10.b(r9, r15, r7, r2)
            int r3 = java.lang.Math.max(r3, r7)
        L_0x00f2:
            if (r6 <= 0) goto L_0x00fb
            r10.c(r9, r15, r6, r2)
            int r3 = java.lang.Math.min(r3, r6)
        L_0x00fb:
            r2 = 1
            if (r5 != r2) goto L_0x0131
            r2 = 6
            if (r30 == 0) goto L_0x0115
            r10.a(r9, r15, r3, r2)
            r14 = r3
            r25 = r5
            r27 = r7
            r0 = r22
            r26 = r23
            r1 = 2
            r21 = 4
            r22 = r8
            r8 = r6
            goto L_0x01a9
        L_0x0115:
            r34 = r6
            if (r43 == 0) goto L_0x011e
            r6 = 4
            r10.a(r9, r15, r3, r6)
            goto L_0x0123
        L_0x011e:
            r2 = 1
            r6 = 4
            r10.a(r9, r15, r3, r2)
        L_0x0123:
            r14 = r3
            r25 = r5
            r21 = r6
            r27 = r7
            r0 = r22
            r26 = r23
            r1 = 2
            goto L_0x01a5
        L_0x0131:
            r34 = r6
            r6 = 2
            if (r5 != r6) goto L_0x0199
            a.e.a.h.c$c r4 = r13.c
            a.e.a.h.c$c r2 = a.e.a.h.c.C0011c.TOP
            if (r4 == r2) goto L_0x0152
            a.e.a.h.c$c r2 = a.e.a.h.c.C0011c.BOTTOM
            if (r4 != r2) goto L_0x0141
            goto L_0x0152
        L_0x0141:
            a.e.a.h.d r2 = r0.D
            a.e.a.h.c$c r4 = a.e.a.h.c.C0011c.LEFT
            a.e.a.h.c r2 = r2.a((a.e.a.h.c.C0011c) r4)
            a.e.a.g r2 = r10.a((java.lang.Object) r2)
            a.e.a.h.d r4 = r0.D
            a.e.a.h.c$c r6 = a.e.a.h.c.C0011c.RIGHT
            goto L_0x0162
        L_0x0152:
            a.e.a.h.d r2 = r0.D
            a.e.a.h.c$c r4 = a.e.a.h.c.C0011c.TOP
            a.e.a.h.c r2 = r2.a((a.e.a.h.c.C0011c) r4)
            a.e.a.g r2 = r10.a((java.lang.Object) r2)
            a.e.a.h.d r4 = r0.D
            a.e.a.h.c$c r6 = a.e.a.h.c.C0011c.BOTTOM
        L_0x0162:
            a.e.a.h.c r4 = r4.a((a.e.a.h.c.C0011c) r6)
            a.e.a.g r4 = r10.a((java.lang.Object) r4)
            r24 = r2
            r6 = r4
            a.e.a.b r4 = r29.b()
            r19 = 1
            r21 = 6
            r2 = r4
            r14 = r3
            r13 = 3
            r3 = r9
            r13 = r4
            r0 = r22
            r4 = r15
            r25 = r5
            r22 = r8
            r8 = r21
            r5 = r6
            r8 = r34
            r1 = 2
            r21 = 4
            r6 = r24
            r27 = r7
            r26 = r23
            r7 = r47
            r2.a(r3, r4, r5, r6, r7)
            r10.a((a.e.a.b) r13)
            r4 = 0
            goto L_0x01a9
        L_0x0199:
            r14 = r3
            r25 = r5
            r1 = r6
            r27 = r7
            r0 = r22
            r26 = r23
            r21 = 4
        L_0x01a5:
            r22 = r8
            r8 = r34
        L_0x01a9:
            if (r4 == 0) goto L_0x01c1
            if (r0 == r1) goto L_0x01c1
            if (r42 != 0) goto L_0x01c1
            r3 = r27
            int r2 = java.lang.Math.max(r3, r14)
            if (r8 <= 0) goto L_0x01bb
            int r2 = java.lang.Math.min(r8, r2)
        L_0x01bb:
            r4 = 6
            r10.a(r9, r15, r2, r4)
            r13 = 0
            goto L_0x01c4
        L_0x01c1:
            r3 = r27
            r13 = r4
        L_0x01c4:
            if (r48 == 0) goto L_0x0305
            if (r43 == 0) goto L_0x01ca
            goto L_0x0305
        L_0x01ca:
            r0 = 5
            if (r16 != 0) goto L_0x01da
            if (r17 != 0) goto L_0x01da
            if (r18 != 0) goto L_0x01da
            if (r30 == 0) goto L_0x01d5
            r1 = 0
            goto L_0x01e1
        L_0x01d5:
            r12 = r9
            r0 = 6
            r1 = 0
            goto L_0x02fc
        L_0x01da:
            r1 = 0
            if (r16 == 0) goto L_0x01e6
            if (r17 != 0) goto L_0x01e6
            if (r30 == 0) goto L_0x02fa
        L_0x01e1:
            r10.b(r12, r9, r1, r0)
            goto L_0x02fa
        L_0x01e6:
            if (r16 != 0) goto L_0x01fc
            if (r17 == 0) goto L_0x01fc
            int r2 = r36.a()
            int r2 = -r2
            r14 = r26
            r3 = 6
            r10.a(r9, r14, r2, r3)
            if (r30 == 0) goto L_0x02fa
            r10.b(r15, r11, r1, r0)
            goto L_0x02fa
        L_0x01fc:
            r14 = r26
            if (r16 == 0) goto L_0x02fa
            if (r17 == 0) goto L_0x02fa
            if (r13 == 0) goto L_0x0276
            if (r30 == 0) goto L_0x020d
            if (r39 != 0) goto L_0x020d
            r7 = 6
            r10.b(r9, r15, r1, r7)
            goto L_0x020e
        L_0x020d:
            r7 = 6
        L_0x020e:
            r1 = r25
            if (r1 != 0) goto L_0x023e
            if (r8 > 0) goto L_0x021a
            if (r3 <= 0) goto L_0x0217
            goto L_0x021a
        L_0x0217:
            r5 = r7
            r6 = 0
            goto L_0x021d
        L_0x021a:
            r5 = r21
            r6 = 1
        L_0x021d:
            int r1 = r35.a()
            r4 = r22
            r10.a(r15, r4, r1, r5)
            int r1 = r36.a()
            int r1 = -r1
            r10.a(r9, r14, r1, r5)
            if (r8 > 0) goto L_0x0235
            if (r3 <= 0) goto L_0x0233
            goto L_0x0235
        L_0x0233:
            r1 = 0
            goto L_0x0236
        L_0x0235:
            r1 = 1
        L_0x0236:
            r5 = r28
            r17 = r0
            r16 = r6
            r6 = 1
            goto L_0x0281
        L_0x023e:
            r4 = r22
            r6 = 1
            if (r1 != r6) goto L_0x024b
            r5 = r28
            r1 = r6
            r16 = r1
            r17 = r7
            goto L_0x0281
        L_0x024b:
            r2 = 3
            r5 = r28
            if (r1 != r2) goto L_0x0272
            if (r42 != 0) goto L_0x025b
            int r1 = r5.n
            r2 = -1
            if (r1 == r2) goto L_0x025b
            if (r8 > 0) goto L_0x025b
            r1 = r7
            goto L_0x025d
        L_0x025b:
            r1 = r21
        L_0x025d:
            int r2 = r35.a()
            r10.a(r15, r4, r2, r1)
            int r2 = r36.a()
            int r2 = -r2
            r10.a(r9, r14, r2, r1)
            r17 = r0
            r1 = r6
            r16 = r1
            goto L_0x0281
        L_0x0272:
            r17 = r0
            r1 = 0
            goto L_0x027f
        L_0x0276:
            r4 = r22
            r6 = 1
            r7 = 6
            r5 = r28
            r17 = r0
            r1 = r6
        L_0x027f:
            r16 = 0
        L_0x0281:
            if (r1 == 0) goto L_0x02c7
            int r8 = r35.a()
            int r18 = r36.a()
            r1 = r29
            r2 = r15
            r3 = r4
            r19 = r4
            r4 = r8
            r5 = r41
            r20 = r6
            r6 = r14
            r8 = r7
            r7 = r9
            r12 = r8
            r0 = r19
            r8 = r18
            r12 = r9
            r9 = r17
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = r35
            a.e.a.h.c r2 = r1.d
            a.e.a.h.d r2 = r2.f238b
            boolean r2 = r2 instanceof a.e.a.h.a
            r3 = r36
            a.e.a.h.c r4 = r3.d
            a.e.a.h.d r4 = r4.f238b
            boolean r4 = r4 instanceof a.e.a.h.a
            if (r2 == 0) goto L_0x02bc
            if (r4 != 0) goto L_0x02bc
            r6 = r30
            r2 = 6
            goto L_0x02d2
        L_0x02bc:
            if (r2 != 0) goto L_0x02cd
            if (r4 == 0) goto L_0x02cd
            r6 = r20
            r2 = 5
            r5 = 6
            r20 = r30
            goto L_0x02d3
        L_0x02c7:
            r1 = r35
            r3 = r36
            r0 = r4
            r12 = r9
        L_0x02cd:
            r6 = r30
            r20 = r6
            r2 = 5
        L_0x02d2:
            r5 = 5
        L_0x02d3:
            if (r16 == 0) goto L_0x02d7
            r2 = 6
            r5 = 6
        L_0x02d7:
            if (r13 != 0) goto L_0x02db
            if (r6 != 0) goto L_0x02dd
        L_0x02db:
            if (r16 == 0) goto L_0x02e4
        L_0x02dd:
            int r1 = r35.a()
            r10.b(r15, r0, r1, r5)
        L_0x02e4:
            if (r13 != 0) goto L_0x02e8
            if (r20 != 0) goto L_0x02ea
        L_0x02e8:
            if (r16 == 0) goto L_0x02f2
        L_0x02ea:
            int r0 = r36.a()
            int r0 = -r0
            r10.c(r12, r14, r0, r2)
        L_0x02f2:
            r0 = 6
            r1 = 0
            if (r30 == 0) goto L_0x02fc
            r10.b(r15, r11, r1, r0)
            goto L_0x02fc
        L_0x02fa:
            r12 = r9
            r0 = 6
        L_0x02fc:
            if (r30 == 0) goto L_0x0304
            r2 = r0
            r0 = r32
            r10.b(r0, r12, r1, r2)
        L_0x0304:
            return
        L_0x0305:
            r3 = r0
            r4 = r1
            r0 = r12
            r1 = 0
            r2 = 6
            r12 = r9
            if (r3 >= r4) goto L_0x0315
            if (r30 == 0) goto L_0x0315
            r10.b(r15, r11, r1, r2)
            r10.b(r0, r12, r1, r2)
        L_0x0315:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.h.d.a(a.e.a.e, boolean, a.e.a.g, a.e.a.g, a.e.a.h.d$a, boolean, a.e.a.h.c, a.e.a.h.c, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    public void a(int i2, int i3, int i4) {
        if (i4 == 0) {
            this.I = i2;
            int i5 = i3 - i2;
            this.E = i5;
            int i6 = this.R;
            if (i5 < i6) {
                this.E = i6;
            }
        } else if (i4 == 1) {
            this.J = i2;
            int i7 = i3 - i2;
            this.F = i7;
            int i8 = this.S;
            if (i7 < i8) {
                this.F = i8;
            }
        }
        this.c0 = true;
    }
}
