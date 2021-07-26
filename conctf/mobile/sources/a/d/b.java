package a.d;

import java.util.Map;

public class b extends g<E, E> {
    public final /* synthetic */ c d;

    public b(c cVar) {
        this.d = cVar;
    }

    public int a(Object obj) {
        return this.d.a(obj);
    }

    public Object a(int i, int i2) {
        return this.d.c[i];
    }

    public E a(int i, E e) {
        throw new UnsupportedOperationException("not a map");
    }

    public void a() {
        this.d.clear();
    }

    public void a(int i) {
        this.d.b(i);
    }

    public void a(E e, E e2) {
        this.d.add(e);
    }

    public int b(Object obj) {
        return this.d.a(obj);
    }

    public Map<E, E> b() {
        throw new UnsupportedOperationException("not a map");
    }

    public int c() {
        return this.d.d;
    }
}
