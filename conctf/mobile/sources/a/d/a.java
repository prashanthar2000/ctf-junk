package a.d;

import a.d.g;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

public class a<K, V> extends h<K, V> implements Map<K, V> {
    public g<K, V> i;

    /* renamed from: a.d.a$a  reason: collision with other inner class name */
    public class C0010a extends g<K, V> {
        public C0010a() {
        }

        public int a(Object obj) {
            return a.this.a(obj);
        }

        public Object a(int i, int i2) {
            return a.this.c[(i << 1) + i2];
        }

        public V a(int i, V v) {
            int i2 = (i << 1) + 1;
            V[] vArr = a.this.c;
            V v2 = vArr[i2];
            vArr[i2] = v;
            return v2;
        }

        public void a() {
            a.this.clear();
        }

        public void a(int i) {
            a.this.c(i);
        }

        public void a(K k, V v) {
            a.this.put(k, v);
        }

        public int b(Object obj) {
            return a.this.b(obj);
        }

        public Map<K, V> b() {
            return a.this;
        }

        public int c() {
            return a.this.d;
        }
    }

    public a() {
    }

    public a(int i2) {
        super(i2);
    }

    public final g<K, V> b() {
        if (this.i == null) {
            this.i = new C0010a();
        }
        return this.i;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        g b2 = b();
        if (b2.f213a == null) {
            b2.f213a = new g.b();
        }
        return b2.f213a;
    }

    public Set<K> keySet() {
        g b2 = b();
        if (b2.f214b == null) {
            b2.f214b = new g.c();
        }
        return b2.f214b;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        int size = map.size() + this.d;
        int i2 = this.d;
        int[] iArr = this.f220b;
        if (iArr.length < size) {
            Object[] objArr = this.c;
            a(size);
            if (this.d > 0) {
                System.arraycopy(iArr, 0, this.f220b, 0, i2);
                System.arraycopy(objArr, 0, this.c, 0, i2 << 1);
            }
            h.a(iArr, objArr, i2);
        }
        if (this.d == i2) {
            for (Map.Entry next : map.entrySet()) {
                put(next.getKey(), next.getValue());
            }
            return;
        }
        throw new ConcurrentModificationException();
    }

    public Collection<V> values() {
        g b2 = b();
        if (b2.c == null) {
            b2.c = new g.e();
        }
        return b2.c;
    }
}
