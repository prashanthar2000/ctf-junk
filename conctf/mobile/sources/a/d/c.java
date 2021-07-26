package a.d;

import a.d.g;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class c<E> implements Collection<E>, Set<E> {
    public static final int[] f = new int[0];
    public static final Object[] g = new Object[0];
    public static Object[] h;
    public static int i;
    public static Object[] j;
    public static int k;

    /* renamed from: b  reason: collision with root package name */
    public int[] f207b = f;
    public Object[] c = g;
    public int d = 0;
    public g<E, E> e;

    public static void a(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (k < 10) {
                    objArr[0] = j;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    j = objArr;
                    k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (c.class) {
                if (i < 10) {
                    objArr[0] = h;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    h = objArr;
                    i++;
                }
            }
        }
    }

    public final int a() {
        int i2 = this.d;
        if (i2 == 0) {
            return -1;
        }
        int a2 = d.a(this.f207b, i2, 0);
        if (a2 < 0 || this.c[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f207b[i3] == 0) {
            if (this.c[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.f207b[i4] == 0) {
            if (this.c[i4] == null) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public int a(Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    public final int a(Object obj, int i2) {
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int a2 = d.a(this.f207b, i3, i2);
        if (a2 < 0 || obj.equals(this.c[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f207b[i4] == i2) {
            if (obj.equals(this.c[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.f207b[i5] == i2) {
            if (obj.equals(this.c[i5])) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (c.class) {
                if (j != null) {
                    Object[] objArr = j;
                    this.c = objArr;
                    j = (Object[]) objArr[0];
                    this.f207b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    k--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (c.class) {
                if (h != null) {
                    Object[] objArr2 = h;
                    this.c = objArr2;
                    h = (Object[]) objArr2[0];
                    this.f207b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    i--;
                    return;
                }
            }
        }
        this.f207b = new int[i2];
        this.c = new Object[i2];
    }

    public boolean add(E e2) {
        int i2;
        int i3;
        if (e2 == null) {
            i3 = a();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            i3 = a(e2, hashCode);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = ~i3;
        int i5 = this.d;
        if (i5 >= this.f207b.length) {
            int i6 = 4;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f207b;
            Object[] objArr = this.c;
            a(i6);
            int[] iArr2 = this.f207b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.c, 0, objArr.length);
            }
            a(iArr, objArr, this.d);
        }
        int i7 = this.d;
        if (i4 < i7) {
            int[] iArr3 = this.f207b;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.c;
            System.arraycopy(objArr2, i4, objArr2, i8, this.d - i4);
        }
        this.f207b[i4] = i2;
        this.c[i4] = e2;
        this.d++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.d;
        int[] iArr = this.f207b;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.c;
            a(size);
            int i2 = this.d;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f207b, 0, i2);
                System.arraycopy(objArr, 0, this.c, 0, this.d);
            }
            a(iArr, objArr, this.d);
        }
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public E b(int i2) {
        E[] eArr = this.c;
        E e2 = eArr[i2];
        int i3 = this.d;
        if (i3 <= 1) {
            a(this.f207b, eArr, i3);
            this.f207b = f;
            this.c = g;
            this.d = 0;
        } else {
            int[] iArr = this.f207b;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i5 = this.d - 1;
                this.d = i5;
                if (i2 < i5) {
                    int[] iArr2 = this.f207b;
                    int i6 = i2 + 1;
                    System.arraycopy(iArr2, i6, iArr2, i2, i5 - i2);
                    Object[] objArr = this.c;
                    System.arraycopy(objArr, i6, objArr, i2, this.d - i2);
                }
                this.c[this.d] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                int[] iArr3 = this.f207b;
                Object[] objArr2 = this.c;
                a(i4);
                this.d--;
                if (i2 > 0) {
                    System.arraycopy(iArr3, 0, this.f207b, 0, i2);
                    System.arraycopy(objArr2, 0, this.c, 0, i2);
                }
                int i7 = this.d;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr3, i8, this.f207b, i2, i7 - i2);
                    System.arraycopy(objArr2, i8, this.c, i2, this.d - i2);
                }
            }
        }
        return e2;
    }

    public void clear() {
        int i2 = this.d;
        if (i2 != 0) {
            a(this.f207b, this.c, i2);
            this.f207b = f;
            this.c = g;
            this.d = 0;
        }
    }

    public boolean contains(Object obj) {
        return a(obj) >= 0;
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
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.d != set.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.d) {
                try {
                    if (!set.contains(this.c[i2])) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f207b;
        int i2 = this.d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public boolean isEmpty() {
        return this.d <= 0;
    }

    public Iterator<E> iterator() {
        if (this.e == null) {
            this.e = new b(this);
        }
        g<E, E> gVar = this.e;
        if (gVar.f214b == null) {
            gVar.f214b = new g.c();
        }
        return gVar.f214b.iterator();
    }

    public boolean remove(Object obj) {
        int a2 = a(obj);
        if (a2 < 0) {
            return false;
        }
        b(a2);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.d - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.c[i2])) {
                b(i2);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.d;
    }

    public Object[] toArray() {
        int i2 = this.d;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.c, 0, objArr, 0, i2);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.d) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.d);
        }
        System.arraycopy(this.c, 0, tArr, 0, this.d);
        int length = tArr.length;
        int i2 = this.d;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.c[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
