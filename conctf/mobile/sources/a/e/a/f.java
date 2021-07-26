package a.e.a;

public class f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f230a;

    /* renamed from: b  reason: collision with root package name */
    public int f231b;

    public f(int i) {
        if (i > 0) {
            this.f230a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public T a() {
        int i = this.f231b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f230a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f231b = i - 1;
        return t;
    }

    public boolean a(T t) {
        int i = this.f231b;
        Object[] objArr = this.f230a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f231b = i + 1;
        return true;
    }
}
