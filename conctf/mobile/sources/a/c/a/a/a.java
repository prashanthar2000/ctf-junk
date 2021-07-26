package a.c.a.a;

public class a extends c {
    public static volatile a c;

    /* renamed from: a  reason: collision with root package name */
    public c f198a;

    /* renamed from: b  reason: collision with root package name */
    public c f199b;

    public a() {
        b bVar = new b();
        this.f199b = bVar;
        this.f198a = bVar;
    }

    public static a b() {
        if (c != null) {
            return c;
        }
        synchronized (a.class) {
            if (c == null) {
                c = new a();
            }
        }
        return c;
    }

    public boolean a() {
        return this.f198a.a();
    }
}
