package a.c.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    public c<K, V> f203b;
    public c<K, V> c;
    public WeakHashMap<f<K, V>, Boolean> d = new WeakHashMap<>();
    public int e = 0;

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public c<K, V> b(c<K, V> cVar) {
            return cVar.e;
        }

        public c<K, V> c(c<K, V> cVar) {
            return cVar.d;
        }
    }

    /* renamed from: a.c.a.b.b$b  reason: collision with other inner class name */
    public static class C0009b<K, V> extends e<K, V> {
        public C0009b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public c<K, V> b(c<K, V> cVar) {
            return cVar.d;
        }

        public c<K, V> c(c<K, V> cVar) {
            return cVar.e;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        public final K f204b;
        public final V c;
        public c<K, V> d;
        public c<K, V> e;

        public c(K k, V v) {
            this.f204b = k;
            this.c = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f204b.equals(cVar.f204b) && this.c.equals(cVar.c);
        }

        public K getKey() {
            return this.f204b;
        }

        public V getValue() {
            return this.c;
        }

        public int hashCode() {
            return this.f204b.hashCode() ^ this.c.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f204b + "=" + this.c;
        }
    }

    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b  reason: collision with root package name */
        public c<K, V> f205b;
        public boolean c = true;

        public d() {
        }

        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f205b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.e;
                this.f205b = cVar3;
                this.c = cVar3 == null;
            }
        }

        public boolean hasNext() {
            if (this.c) {
                return b.this.f203b != null;
            }
            c<K, V> cVar = this.f205b;
            return (cVar == null || cVar.d == null) ? false : true;
        }

        public Object next() {
            c<K, V> cVar;
            if (this.c) {
                this.c = false;
                cVar = b.this.f203b;
            } else {
                c<K, V> cVar2 = this.f205b;
                cVar = cVar2 != null ? cVar2.d : null;
            }
            this.f205b = cVar;
            return cVar;
        }
    }

    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b  reason: collision with root package name */
        public c<K, V> f206b;
        public c<K, V> c;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f206b = cVar2;
            this.c = cVar;
        }

        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f206b == cVar && cVar == this.c) {
                this.c = null;
                this.f206b = null;
            }
            c<K, V> cVar3 = this.f206b;
            if (cVar3 == cVar) {
                this.f206b = b(cVar3);
            }
            c<K, V> cVar4 = this.c;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f206b;
                if (!(cVar4 == cVar5 || cVar5 == null)) {
                    cVar2 = c(cVar4);
                }
                this.c = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        public boolean hasNext() {
            return this.c != null;
        }

        public Object next() {
            c<K, V> cVar = this.c;
            c<K, V> cVar2 = this.f206b;
            this.c = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> a(K k) {
        c<K, V> cVar = this.f203b;
        while (cVar != null && !cVar.f204b.equals(k)) {
            cVar = cVar.d;
        }
        return cVar;
    }

    public c<K, V> a(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.e++;
        c<K, V> cVar2 = this.c;
        if (cVar2 == null) {
            this.f203b = cVar;
        } else {
            cVar2.d = cVar;
            cVar.e = cVar2;
        }
        this.c = cVar;
        return cVar;
    }

    public b<K, V>.d a() {
        b<K, V>.d dVar = new d();
        this.d.put(dVar, false);
        return dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((a.c.a.b.b.e) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof a.c.a.b.b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            a.c.a.b.b r7 = (a.c.a.b.b) r7
            int r1 = r6.e
            int r3 = r7.e
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            a.c.a.b.b$e r3 = (a.c.a.b.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            a.c.a.b.b$e r4 = (a.c.a.b.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            a.c.a.b.b$e r7 = (a.c.a.b.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.c.a.b.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f203b, this.c);
        this.d.put(aVar, false);
        return aVar;
    }

    public V remove(K k) {
        c a2 = a(k);
        if (a2 == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            for (f<K, V> a3 : this.d.keySet()) {
                a3.a(a2);
            }
        }
        c<K, V> cVar = a2.e;
        if (cVar != null) {
            cVar.d = a2.d;
        } else {
            this.f203b = a2.d;
        }
        c<K, V> cVar2 = a2.d;
        if (cVar2 != null) {
            cVar2.e = a2.e;
        } else {
            this.c = a2.e;
        }
        a2.d = null;
        a2.e = null;
        return a2.c;
    }

    public String toString() {
        StringBuilder a2 = b.a.a.a.a.a("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                a2.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    a2.append(", ");
                }
            } else {
                a2.append("]");
                return a2.toString();
            }
        }
    }
}
