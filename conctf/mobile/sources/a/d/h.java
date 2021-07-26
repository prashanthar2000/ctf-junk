package a.d;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class h<K, V> {
    public static Object[] e;
    public static int f;
    public static Object[] g;
    public static int h;

    /* renamed from: b  reason: collision with root package name */
    public int[] f220b;
    public Object[] c;
    public int d;

    public h() {
        this.f220b = d.f208a;
        this.c = d.c;
        this.d = 0;
    }

    public h(int i) {
        if (i == 0) {
            this.f220b = d.f208a;
            this.c = d.c;
        } else {
            a(i);
        }
        this.d = 0;
    }

    public static void a(int[] iArr, Object[] objArr, int i) {
        Class<h> cls = h.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (h < 10) {
                    objArr[0] = g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    g = objArr;
                    h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f < 10) {
                    objArr[0] = e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    e = objArr;
                    f++;
                }
            }
        }
    }

    public int a(Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    public int a(Object obj, int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a2 = d.a(this.f220b, i2, i);
            if (a2 < 0 || obj.equals(this.c[a2 << 1])) {
                return a2;
            }
            int i3 = a2 + 1;
            while (i3 < i2 && this.f220b[i3] == i) {
                if (obj.equals(this.c[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            int i4 = a2 - 1;
            while (i4 >= 0 && this.f220b[i4] == i) {
                if (obj.equals(this.c[i4 << 1])) {
                    return i4;
                }
                i4--;
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public V a(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.c;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    public final void a(int i) {
        Class<h> cls = h.class;
        if (i == 8) {
            synchronized (cls) {
                if (g != null) {
                    Object[] objArr = g;
                    this.c = objArr;
                    g = (Object[]) objArr[0];
                    this.f220b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                if (e != null) {
                    Object[] objArr2 = e;
                    this.c = objArr2;
                    e = (Object[]) objArr2[0];
                    this.f220b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f--;
                    return;
                }
            }
        }
        this.f220b = new int[i];
        this.c = new Object[(i << 1)];
    }

    public int b(Object obj) {
        int i = this.d * 2;
        Object[] objArr = this.c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public K b(int i) {
        return this.c[i << 1];
    }

    public V c(int i) {
        V[] vArr = this.c;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.d;
        int i4 = 0;
        if (i3 <= 1) {
            a(this.f220b, vArr, i3);
            this.f220b = d.f208a;
            this.c = d.c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f220b;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int[] iArr2 = this.f220b;
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr2, i7, iArr2, i, i8);
                    Object[] objArr = this.c;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.c;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                int[] iArr3 = this.f220b;
                Object[] objArr3 = this.c;
                a(i6);
                if (i3 == this.d) {
                    if (i > 0) {
                        System.arraycopy(iArr3, 0, this.f220b, 0, i);
                        System.arraycopy(objArr3, 0, this.c, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr3, i10, this.f220b, i, i11);
                        System.arraycopy(objArr3, i10 << 1, this.c, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.d) {
            this.d = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f220b;
            Object[] objArr = this.c;
            this.f220b = d.f208a;
            this.c = d.c;
            this.d = 0;
            a(iArr, objArr, i);
        }
        if (this.d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public V d(int i) {
        return this.c[(i << 1) + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.d != hVar.d) {
                return false;
            }
            int i = 0;
            while (i < this.d) {
                try {
                    Object b2 = b(i);
                    Object d2 = d(i);
                    Object obj2 = hVar.get(b2);
                    if (d2 == null) {
                        if (obj2 != null || !hVar.containsKey(b2)) {
                            return false;
                        }
                    } else if (!d2.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.d != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.d) {
                try {
                    Object b3 = b(i2);
                    Object d3 = d(i2);
                    Object obj3 = map.get(b3);
                    if (d3 == null) {
                        if (obj3 != null || !map.containsKey(b3)) {
                            return false;
                        }
                    } else if (!d3.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int a2 = a(obj);
        return a2 >= 0 ? this.c[(a2 << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.f220b;
        Object[] objArr = this.c;
        int i = this.d;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.d <= 0;
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.d;
        if (k == null) {
            i2 = a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = a((Object) k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.c;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        if (i3 >= this.f220b.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f220b;
            Object[] objArr = this.c;
            a(i6);
            if (i3 == this.d) {
                int[] iArr2 = this.f220b;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.c, 0, objArr.length);
                }
                a(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f220b;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.c;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.d - i5) << 1);
        }
        int i8 = this.d;
        if (i3 == i8) {
            int[] iArr4 = this.f220b;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.c;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.d = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, (Object) null);
        return orDefault == null ? put(k, v) : orDefault;
    }

    public V remove(Object obj) {
        int a2 = a(obj);
        if (a2 >= 0) {
            return c(a2);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int a2 = a(obj);
        if (a2 < 0) {
            return false;
        }
        Object d2 = d(a2);
        if (obj2 != d2 && (obj2 == null || !obj2.equals(d2))) {
            return false;
        }
        c(a2);
        return true;
    }

    public V replace(K k, V v) {
        int a2 = a((Object) k);
        if (a2 >= 0) {
            return a(a2, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int a2 = a((Object) k);
        if (a2 < 0) {
            return false;
        }
        V d2 = d(a2);
        if (d2 != v && (v == null || !v.equals(d2))) {
            return false;
        }
        a(a2, v2);
        return true;
    }

    public int size() {
        return this.d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        for (int i = 0; i < this.d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b2 = b(i);
            if (b2 != this) {
                sb.append(b2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object d2 = d(i);
            if (d2 != this) {
                sb.append(d2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public int a() {
        int i = this.d;
        if (i == 0) {
            return -1;
        }
        try {
            int a2 = d.a(this.f220b, i, 0);
            if (a2 < 0 || this.c[a2 << 1] == null) {
                return a2;
            }
            int i2 = a2 + 1;
            while (i2 < i && this.f220b[i2] == 0) {
                if (this.c[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            int i3 = a2 - 1;
            while (i3 >= 0 && this.f220b[i3] == 0) {
                if (this.c[i3 << 1] == null) {
                    return i3;
                }
                i3--;
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
