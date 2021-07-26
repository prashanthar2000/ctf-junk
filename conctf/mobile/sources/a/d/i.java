package a.d;

public class i<E> implements Cloneable {
    public static final Object f = new Object();

    /* renamed from: b  reason: collision with root package name */
    public boolean f221b;
    public int[] c;
    public Object[] d;
    public int e;

    public i() {
        this(10);
    }

    public i(int i) {
        this.f221b = false;
        if (i == 0) {
            this.c = d.f208a;
            this.d = d.c;
            return;
        }
        int b2 = d.b(i);
        this.c = new int[b2];
        this.d = new Object[b2];
    }

    public E a(int i) {
        return b(i, (Object) null);
    }

    public final void a() {
        int i = this.e;
        int[] iArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f221b = false;
        this.e = i2;
    }

    public void a(int i, E e2) {
        int i2 = this.e;
        if (i2 == 0 || i > this.c[i2 - 1]) {
            if (this.f221b && this.e >= this.c.length) {
                a();
            }
            int i3 = this.e;
            if (i3 >= this.c.length) {
                int b2 = d.b(i3 + 1);
                int[] iArr = new int[b2];
                Object[] objArr = new Object[b2];
                int[] iArr2 = this.c;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.c = iArr;
                this.d = objArr;
            }
            this.c[i3] = i;
            this.d[i3] = e2;
            this.e = i3 + 1;
            return;
        }
        c(i, e2);
    }

    public int b() {
        if (this.f221b) {
            a();
        }
        return this.e;
    }

    public int b(int i) {
        if (this.f221b) {
            a();
        }
        return this.c[i];
    }

    public E b(int i, E e2) {
        int a2 = d.a(this.c, this.e, i);
        if (a2 >= 0) {
            E[] eArr = this.d;
            if (eArr[a2] != f) {
                return eArr[a2];
            }
        }
        return e2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.c
            int r1 = r3.e
            int r4 = a.d.d.a((int[]) r0, (int) r1, (int) r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.d
            r1 = r0[r4]
            java.lang.Object r2 = f
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.f221b = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d.i.c(int):void");
    }

    public void c(int i, E e2) {
        int a2 = d.a(this.c, this.e, i);
        if (a2 >= 0) {
            this.d[a2] = e2;
            return;
        }
        int i2 = ~a2;
        if (i2 < this.e) {
            Object[] objArr = this.d;
            if (objArr[i2] == f) {
                this.c[i2] = i;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f221b && this.e >= this.c.length) {
            a();
            i2 = ~d.a(this.c, this.e, i);
        }
        int i3 = this.e;
        if (i3 >= this.c.length) {
            int b2 = d.b(i3 + 1);
            int[] iArr = new int[b2];
            Object[] objArr2 = new Object[b2];
            int[] iArr2 = this.c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.c = iArr;
            this.d = objArr2;
        }
        int i4 = this.e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.e - i2);
        }
        this.c[i2] = i;
        this.d[i2] = e2;
        this.e++;
    }

    public i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.c = (int[]) this.c.clone();
            iVar.d = (Object[]) this.d.clone();
            return iVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E d(int i) {
        if (this.f221b) {
            a();
        }
        return this.d[i];
    }

    public String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(b(i));
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
}
