package a.e.a.h;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public List<d> f245a;

    /* renamed from: b  reason: collision with root package name */
    public int f246b = -1;
    public int c = -1;
    public boolean d = false;
    public final int[] e = {-1, -1};
    public List<d> f = new ArrayList();
    public List<d> g = new ArrayList();
    public HashSet<d> h = new HashSet<>();
    public HashSet<d> i = new HashSet<>();
    public List<d> j = new ArrayList();
    public List<d> k = new ArrayList();

    public f(List<d> list) {
        this.f245a = list;
    }

    public f(List<d> list, boolean z) {
        this.f245a = list;
        this.d = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(a.e.a.h.d r7) {
        /*
            r6 = this;
            boolean r0 = r7.b0
            if (r0 == 0) goto L_0x00d9
            boolean r0 = r7.k()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            a.e.a.h.c r0 = r7.u
            a.e.a.h.c r0 = r0.d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            r0 = r2
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 == 0) goto L_0x001b
            a.e.a.h.c r3 = r7.u
            goto L_0x001d
        L_0x001b:
            a.e.a.h.c r3 = r7.s
        L_0x001d:
            a.e.a.h.c r3 = r3.d
            if (r3 == 0) goto L_0x0043
            a.e.a.h.d r4 = r3.f238b
            boolean r5 = r4.c0
            if (r5 != 0) goto L_0x002a
            r6.a(r4)
        L_0x002a:
            a.e.a.h.c$c r4 = r3.c
            a.e.a.h.c$c r5 = a.e.a.h.c.C0011c.RIGHT
            if (r4 != r5) goto L_0x003a
            a.e.a.h.d r3 = r3.f238b
            int r4 = r3.I
            int r3 = r3.j()
            int r3 = r3 + r4
            goto L_0x0044
        L_0x003a:
            a.e.a.h.c$c r5 = a.e.a.h.c.C0011c.LEFT
            if (r4 != r5) goto L_0x0043
            a.e.a.h.d r3 = r3.f238b
            int r3 = r3.I
            goto L_0x0044
        L_0x0043:
            r3 = r1
        L_0x0044:
            if (r0 == 0) goto L_0x004e
            a.e.a.h.c r0 = r7.u
            int r0 = r0.a()
            int r3 = r3 - r0
            goto L_0x005a
        L_0x004e:
            a.e.a.h.c r0 = r7.s
            int r0 = r0.a()
            int r4 = r7.j()
            int r4 = r4 + r0
            int r3 = r3 + r4
        L_0x005a:
            int r0 = r7.j()
            int r0 = r3 - r0
            r7.a(r0, r3)
            a.e.a.h.c r0 = r7.w
            a.e.a.h.c r0 = r0.d
            if (r0 == 0) goto L_0x0085
            a.e.a.h.d r1 = r0.f238b
            boolean r3 = r1.c0
            if (r3 != 0) goto L_0x0072
            r6.a(r1)
        L_0x0072:
            a.e.a.h.d r0 = r0.f238b
            int r1 = r0.J
            int r0 = r0.Q
            int r1 = r1 + r0
            int r0 = r7.Q
            int r1 = r1 - r0
            int r0 = r7.F
            int r0 = r0 + r1
            r7.c(r1, r0)
            r7.c0 = r2
            return
        L_0x0085:
            a.e.a.h.c r0 = r7.v
            a.e.a.h.c r0 = r0.d
            if (r0 == 0) goto L_0x008c
            r1 = r2
        L_0x008c:
            if (r1 == 0) goto L_0x0091
            a.e.a.h.c r0 = r7.v
            goto L_0x0093
        L_0x0091:
            a.e.a.h.c r0 = r7.t
        L_0x0093:
            a.e.a.h.c r0 = r0.d
            if (r0 == 0) goto L_0x00b8
            a.e.a.h.d r4 = r0.f238b
            boolean r5 = r4.c0
            if (r5 != 0) goto L_0x00a0
            r6.a(r4)
        L_0x00a0:
            a.e.a.h.c$c r4 = r0.c
            a.e.a.h.c$c r5 = a.e.a.h.c.C0011c.BOTTOM
            if (r4 != r5) goto L_0x00b0
            a.e.a.h.d r0 = r0.f238b
            int r3 = r0.J
            int r0 = r0.d()
            int r3 = r3 + r0
            goto L_0x00b8
        L_0x00b0:
            a.e.a.h.c$c r5 = a.e.a.h.c.C0011c.TOP
            if (r4 != r5) goto L_0x00b8
            a.e.a.h.d r0 = r0.f238b
            int r3 = r0.J
        L_0x00b8:
            if (r1 == 0) goto L_0x00c2
            a.e.a.h.c r0 = r7.v
            int r0 = r0.a()
            int r3 = r3 - r0
            goto L_0x00ce
        L_0x00c2:
            a.e.a.h.c r0 = r7.t
            int r0 = r0.a()
            int r1 = r7.d()
            int r1 = r1 + r0
            int r3 = r3 + r1
        L_0x00ce:
            int r0 = r7.d()
            int r0 = r3 - r0
            r7.c(r0, r3)
            r7.c0 = r2
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.h.f.a(a.e.a.h.d):void");
    }

    public void a(d dVar, int i2) {
        HashSet<d> hashSet;
        if (i2 == 0) {
            hashSet = this.h;
        } else if (i2 == 1) {
            hashSet = this.i;
        } else {
            return;
        }
        hashSet.add(dVar);
    }

    public final void a(ArrayList<d> arrayList, d dVar) {
        d dVar2;
        if (!dVar.d0) {
            arrayList.add(dVar);
            dVar.d0 = true;
            if (!dVar.k()) {
                if (dVar instanceof h) {
                    h hVar = (h) dVar;
                    int i2 = hVar.l0;
                    for (int i3 = 0; i3 < i2; i3++) {
                        a(arrayList, hVar.k0[i3]);
                    }
                }
                for (c cVar : dVar.A) {
                    c cVar2 = cVar.d;
                    if (!(cVar2 == null || (dVar2 = cVar2.f238b) == dVar.D)) {
                        a(arrayList, dVar2);
                    }
                }
            }
        }
    }
}
