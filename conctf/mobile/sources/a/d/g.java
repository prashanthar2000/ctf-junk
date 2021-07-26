package a.d;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public abstract class g<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public g<K, V>.b f213a;

    /* renamed from: b  reason: collision with root package name */
    public g<K, V>.c f214b;
    public g<K, V>.e c;

    public final class a<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        public final int f215b;
        public int c;
        public int d;
        public boolean e = false;

        public a(int i) {
            this.f215b = i;
            this.c = g.this.c();
        }

        public boolean hasNext() {
            return this.d < this.c;
        }

        public T next() {
            if (hasNext()) {
                T a2 = g.this.a(this.d, this.f215b);
                this.d++;
                this.e = true;
                return a2;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.e) {
                int i = this.d - 1;
                this.d = i;
                this.c--;
                this.e = false;
                g.this.a(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int c = g.this.c();
            for (Map.Entry entry : collection) {
                g.this.a(entry.getKey(), entry.getValue());
            }
            return c != g.this.c();
        }

        public void clear() {
            g.this.a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a2 = g.this.a(entry.getKey());
            if (a2 < 0) {
                return false;
            }
            return d.a(g.this.a(a2, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return g.a(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int c = g.this.c() - 1; c >= 0; c--) {
                Object a2 = g.this.a(c, 0);
                Object a3 = g.this.a(c, 1);
                i += (a2 == null ? 0 : a2.hashCode()) ^ (a3 == null ? 0 : a3.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return g.this.c() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return g.this.c();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    public final class c implements Set<K> {
        public c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            g.this.a();
        }

        public boolean contains(Object obj) {
            return g.this.a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            Map b2 = g.this.b();
            for (Object containsKey : collection) {
                if (!b2.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return g.a(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int c = g.this.c() - 1; c >= 0; c--) {
                Object a2 = g.this.a(c, 0);
                i += a2 == null ? 0 : a2.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return g.this.c() == 0;
        }

        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object obj) {
            int a2 = g.this.a(obj);
            if (a2 < 0) {
                return false;
            }
            g.this.a(a2);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            Map b2 = g.this.b();
            int size = b2.size();
            for (Object remove : collection) {
                b2.remove(remove);
            }
            return size != b2.size();
        }

        public boolean retainAll(Collection<?> collection) {
            return g.a(g.this.b(), collection);
        }

        public int size() {
            return g.this.c();
        }

        public Object[] toArray() {
            return g.this.b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return g.this.a(tArr, 0);
        }
    }

    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        public int f218b;
        public int c;
        public boolean d = false;

        public d() {
            this.f218b = g.this.c() - 1;
            this.c = -1;
        }

        public boolean equals(Object obj) {
            if (!this.d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return d.a(entry.getKey(), g.this.a(this.c, 0)) && d.a(entry.getValue(), g.this.a(this.c, 1));
            }
        }

        public K getKey() {
            if (this.d) {
                return g.this.a(this.c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.d) {
                return g.this.a(this.c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.c < this.f218b;
        }

        public int hashCode() {
            if (this.d) {
                int i = 0;
                Object a2 = g.this.a(this.c, 0);
                Object a3 = g.this.a(this.c, 1);
                int hashCode = a2 == null ? 0 : a2.hashCode();
                if (a3 != null) {
                    i = a3.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public Object next() {
            if (hasNext()) {
                this.c++;
                this.d = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.d) {
                g.this.a(this.c);
                this.c--;
                this.f218b--;
                this.d = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.d) {
                return g.this.a(this.c, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class e implements Collection<V> {
        public e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            g.this.a();
        }

        public boolean contains(Object obj) {
            return g.this.b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return g.this.c() == 0;
        }

        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object obj) {
            int b2 = g.this.b(obj);
            if (b2 < 0) {
                return false;
            }
            g.this.a(b2);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int c = g.this.c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (collection.contains(g.this.a(i, 1))) {
                    g.this.a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int c = g.this.c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (!collection.contains(g.this.a(i, 1))) {
                    g.this.a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return g.this.c();
        }

        public Object[] toArray() {
            return g.this.b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return g.this.a(tArr, 1);
        }
    }

    public static <K, V> boolean a(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public static <T> boolean a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public abstract int a(Object obj);

    public abstract Object a(int i, int i2);

    public abstract V a(int i, V v);

    public abstract void a();

    public abstract void a(int i);

    public abstract void a(K k, V v);

    public <T> T[] a(T[] tArr, int i) {
        int c2 = c();
        if (tArr.length < c2) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), c2);
        }
        for (int i2 = 0; i2 < c2; i2++) {
            tArr[i2] = a(i2, i);
        }
        if (tArr.length > c2) {
            tArr[c2] = null;
        }
        return tArr;
    }

    public abstract int b(Object obj);

    public abstract Map<K, V> b();

    public Object[] b(int i) {
        int c2 = c();
        Object[] objArr = new Object[c2];
        for (int i2 = 0; i2 < c2; i2++) {
            objArr[i2] = a(i2, i);
        }
        return objArr;
    }

    public abstract int c();
}
