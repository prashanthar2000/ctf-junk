package a.e.a.h;

import java.util.HashSet;
import java.util.Iterator;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public HashSet<l> f248a = new HashSet<>(2);

    /* renamed from: b  reason: collision with root package name */
    public int f249b = 0;

    public void a() {
        this.f249b = 1;
        Iterator<l> it = this.f248a.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    public void b() {
        this.f249b = 0;
        Iterator<l> it = this.f248a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public boolean c() {
        return this.f249b == 1;
    }

    public void d() {
    }
}
