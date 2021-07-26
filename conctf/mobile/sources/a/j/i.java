package a.j;

import a.c.a.b.b;
import a.j.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class i extends e {

    /* renamed from: a  reason: collision with root package name */
    public a.c.a.b.a<g, a> f409a = new a.c.a.b.a<>();

    /* renamed from: b  reason: collision with root package name */
    public e.b f410b;
    public final WeakReference<h> c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;
    public ArrayList<e.b> g = new ArrayList<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public e.b f411a;

        /* renamed from: b  reason: collision with root package name */
        public f f412b;

        public a(g gVar, e.b bVar) {
            this.f412b = k.a((Object) gVar);
            this.f411a = bVar;
        }

        public void a(h hVar, e.a aVar) {
            e.b b2 = i.b(aVar);
            this.f411a = i.a(this.f411a, b2);
            this.f412b.a(hVar, aVar);
            this.f411a = b2;
        }
    }

    public i(h hVar) {
        this.c = new WeakReference<>(hVar);
        this.f410b = e.b.INITIALIZED;
    }

    public static e.b a(e.b bVar, e.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    public static e.a b(e.b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return e.a.ON_CREATE;
        }
        if (ordinal == 2) {
            return e.a.ON_START;
        }
        if (ordinal == 3) {
            return e.a.ON_RESUME;
        }
        if (ordinal != 4) {
            throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
        throw new IllegalArgumentException();
    }

    public static e.b b(e.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return e.b.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return e.b.DESTROYED;
                        }
                        throw new IllegalArgumentException("Unexpected event value " + aVar);
                    }
                }
            }
            return e.b.STARTED;
        }
        return e.b.CREATED;
    }

    public final void a() {
        ArrayList<e.b> arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    public void a(e.a aVar) {
        a(b(aVar));
    }

    public final void a(e.b bVar) {
        if (this.f410b != bVar) {
            this.f410b = bVar;
            if (this.e || this.d != 0) {
                this.f = true;
                return;
            }
            this.e = true;
            b();
            this.e = false;
        }
    }

    public void a(g gVar) {
        h hVar;
        e.b bVar = this.f410b;
        e.b bVar2 = e.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = e.b.INITIALIZED;
        }
        a aVar = new a(gVar, bVar2);
        if (this.f409a.b(gVar, aVar) == null && (hVar = (h) this.c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            e.b b2 = b(gVar);
            this.d++;
            while (aVar.f411a.compareTo(b2) < 0 && this.f409a.f.containsKey(gVar)) {
                this.g.add(aVar.f411a);
                aVar.a(hVar, b(aVar.f411a));
                a();
                b2 = b(gVar);
            }
            if (!z) {
                b();
            }
            this.d--;
        }
    }

    public final e.b b(g gVar) {
        a.c.a.b.a<g, a> aVar = this.f409a;
        e.b bVar = null;
        b.c<K, V> cVar = aVar.f.containsKey(gVar) ? aVar.f.get(gVar).e : null;
        e.b bVar2 = cVar != null ? ((a) cVar.getValue()).f411a : null;
        if (!this.g.isEmpty()) {
            ArrayList<e.b> arrayList = this.g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return a(a(this.f410b, bVar2), bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r1 = ((a.j.i.a) r1.f203b.getValue()).f411a;
        r2 = ((a.j.i.a) r8.f409a.c.getValue()).f411a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r8 = this;
            java.lang.ref.WeakReference<a.j.h> r0 = r8.c
            java.lang.Object r0 = r0.get()
            a.j.h r0 = (a.j.h) r0
            if (r0 == 0) goto L_0x0141
        L_0x000a:
            a.c.a.b.a<a.j.g, a.j.i$a> r1 = r8.f409a
            int r2 = r1.e
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0013
            goto L_0x002f
        L_0x0013:
            a.c.a.b.b$c<K, V> r1 = r1.f203b
            java.lang.Object r1 = r1.getValue()
            a.j.i$a r1 = (a.j.i.a) r1
            a.j.e$b r1 = r1.f411a
            a.c.a.b.a<a.j.g, a.j.i$a> r2 = r8.f409a
            a.c.a.b.b$c<K, V> r2 = r2.c
            java.lang.Object r2 = r2.getValue()
            a.j.i$a r2 = (a.j.i.a) r2
            a.j.e$b r2 = r2.f411a
            if (r1 != r2) goto L_0x0031
            a.j.e$b r1 = r8.f410b
            if (r1 != r2) goto L_0x0031
        L_0x002f:
            r1 = r3
            goto L_0x0032
        L_0x0031:
            r1 = r4
        L_0x0032:
            r8.f = r4
            if (r1 != 0) goto L_0x0140
            a.j.e$b r1 = r8.f410b
            a.c.a.b.a<a.j.g, a.j.i$a> r2 = r8.f409a
            a.c.a.b.b$c<K, V> r2 = r2.f203b
            java.lang.Object r2 = r2.getValue()
            a.j.i$a r2 = (a.j.i.a) r2
            a.j.e$b r2 = r2.f411a
            int r1 = r1.compareTo(r2)
            if (r1 >= 0) goto L_0x00dc
            a.c.a.b.a<a.j.g, a.j.i$a> r1 = r8.f409a
            a.c.a.b.b$b r2 = new a.c.a.b.b$b
            a.c.a.b.b$c<K, V> r5 = r1.c
            a.c.a.b.b$c<K, V> r6 = r1.f203b
            r2.<init>(r5, r6)
            java.util.WeakHashMap<a.c.a.b.b$f<K, V>, java.lang.Boolean> r1 = r1.d
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.put(r2, r4)
        L_0x005e:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x00dc
            boolean r1 = r8.f
            if (r1 != 0) goto L_0x00dc
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r4 = r1.getValue()
            a.j.i$a r4 = (a.j.i.a) r4
        L_0x0074:
            a.j.e$b r5 = r4.f411a
            a.j.e$b r6 = r8.f410b
            int r5 = r5.compareTo(r6)
            if (r5 <= 0) goto L_0x005e
            boolean r5 = r8.f
            if (r5 != 0) goto L_0x005e
            a.c.a.b.a<a.j.g, a.j.i$a> r5 = r8.f409a
            java.lang.Object r6 = r1.getKey()
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x005e
            a.j.e$b r5 = r4.f411a
            int r6 = r5.ordinal()
            if (r6 == 0) goto L_0x00d6
            if (r6 == r3) goto L_0x00d0
            r7 = 2
            if (r6 == r7) goto L_0x00be
            r7 = 3
            if (r6 == r7) goto L_0x00bb
            r7 = 4
            if (r6 != r7) goto L_0x00a4
            a.j.e$a r5 = a.j.e.a.ON_PAUSE
            goto L_0x00c0
        L_0x00a4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected state value "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00bb:
            a.j.e$a r5 = a.j.e.a.ON_STOP
            goto L_0x00c0
        L_0x00be:
            a.j.e$a r5 = a.j.e.a.ON_DESTROY
        L_0x00c0:
            a.j.e$b r6 = b((a.j.e.a) r5)
            java.util.ArrayList<a.j.e$b> r7 = r8.g
            r7.add(r6)
            r4.a(r0, r5)
            r8.a()
            goto L_0x0074
        L_0x00d0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x00d6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x00dc:
            a.c.a.b.a<a.j.g, a.j.i$a> r1 = r8.f409a
            a.c.a.b.b$c<K, V> r1 = r1.c
            boolean r2 = r8.f
            if (r2 != 0) goto L_0x000a
            if (r1 == 0) goto L_0x000a
            a.j.e$b r2 = r8.f410b
            java.lang.Object r1 = r1.getValue()
            a.j.i$a r1 = (a.j.i.a) r1
            a.j.e$b r1 = r1.f411a
            int r1 = r2.compareTo(r1)
            if (r1 <= 0) goto L_0x000a
            a.c.a.b.a<a.j.g, a.j.i$a> r1 = r8.f409a
            a.c.a.b.b$d r1 = r1.a()
        L_0x00fc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x000a
            boolean r2 = r8.f
            if (r2 != 0) goto L_0x000a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            a.j.i$a r3 = (a.j.i.a) r3
        L_0x0112:
            a.j.e$b r4 = r3.f411a
            a.j.e$b r5 = r8.f410b
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L_0x00fc
            boolean r4 = r8.f
            if (r4 != 0) goto L_0x00fc
            a.c.a.b.a<a.j.g, a.j.i$a> r4 = r8.f409a
            java.lang.Object r5 = r2.getKey()
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x00fc
            a.j.e$b r4 = r3.f411a
            java.util.ArrayList<a.j.e$b> r5 = r8.g
            r5.add(r4)
            a.j.e$b r4 = r3.f411a
            a.j.e$a r4 = b((a.j.e.b) r4)
            r3.a(r0, r4)
            r8.a()
            goto L_0x0112
        L_0x0140:
            return
        L_0x0141:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j.i.b():void");
    }
}
