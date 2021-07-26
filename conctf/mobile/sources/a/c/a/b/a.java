package a.c.a.b;

import a.c.a.b.b;
import java.util.HashMap;

public class a<K, V> extends b<K, V> {
    public HashMap<K, b.c<K, V>> f = new HashMap<>();

    public b.c<K, V> a(K k) {
        return this.f.get(k);
    }

    public V b(K k, V v) {
        b.c cVar = this.f.get(k);
        if (cVar != null) {
            return cVar.c;
        }
        this.f.put(k, a(k, v));
        return null;
    }

    public boolean contains(K k) {
        return this.f.containsKey(k);
    }

    public V remove(K k) {
        V remove = super.remove(k);
        this.f.remove(k);
        return remove;
    }
}
