package a.d;

public class e<E> implements Cloneable {
    public static final Object f = new Object();

    /* renamed from: b  reason: collision with root package name */
    public boolean f210b = false;
    public long[] c;
    public Object[] d;
    public int e;

    public e() {
        int c2 = d.c(10);
        this.c = new long[c2];
        this.d = new Object[c2];
    }

    public final void a() {
        int i = this.e;
        long[] jArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f210b = false;
        this.e = i2;
    }

    public void a(long j, E e2) {
        int i = this.e;
        if (i == 0 || j > this.c[i - 1]) {
            if (this.f210b && this.e >= this.c.length) {
                a();
            }
            int i2 = this.e;
            if (i2 >= this.c.length) {
                int c2 = d.c(i2 + 1);
                long[] jArr = new long[c2];
                Object[] objArr = new Object[c2];
                long[] jArr2 = this.c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.c = jArr;
                this.d = objArr;
            }
            this.c[i2] = j;
            this.d[i2] = e2;
            this.e = i2 + 1;
            return;
        }
        c(j, e2);
    }

    public E b(long j, E e2) {
        int a2 = d.a(this.c, this.e, j);
        if (a2 >= 0) {
            E[] eArr = this.d;
            if (eArr[a2] != f) {
                return eArr[a2];
            }
        }
        return e2;
    }

    public void c(long j, E e2) {
        int a2 = d.a(this.c, this.e, j);
        if (a2 >= 0) {
            this.d[a2] = e2;
            return;
        }
        int i = ~a2;
        if (i < this.e) {
            Object[] objArr = this.d;
            if (objArr[i] == f) {
                this.c[i] = j;
                objArr[i] = e2;
                return;
            }
        }
        if (this.f210b && this.e >= this.c.length) {
            a();
            i = ~d.a(this.c, this.e, j);
        }
        int i2 = this.e;
        if (i2 >= this.c.length) {
            int c2 = d.c(i2 + 1);
            long[] jArr = new long[c2];
            Object[] objArr2 = new Object[c2];
            long[] jArr2 = this.c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.c = jArr;
            this.d = objArr2;
        }
        int i3 = this.e;
        if (i3 - i != 0) {
            long[] jArr3 = this.c;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i, objArr4, i4, this.e - i);
        }
        this.c[i] = j;
        this.d[i] = e2;
        this.e++;
    }

    public e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.c = (long[]) this.c.clone();
            eVar.d = (Object[]) this.d.clone();
            return eVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public String toString() {
        if (this.f210b) {
            a();
        }
        int i = this.e;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f210b) {
                a();
            }
            sb.append(this.c[i2]);
            sb.append('=');
            if (this.f210b) {
                a();
            }
            Object obj = this.d[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
