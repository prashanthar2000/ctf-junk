package a.e.a.h;

import a.e.a.h.c;
import java.util.ArrayList;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public int f250a;

    /* renamed from: b  reason: collision with root package name */
    public int f251b;
    public int c;
    public int d;
    public ArrayList<a> e = new ArrayList<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public c f252a;

        /* renamed from: b  reason: collision with root package name */
        public c f253b;
        public int c;
        public c.b d;
        public int e;

        public a(c cVar) {
            this.f252a = cVar;
            this.f253b = cVar.d;
            this.c = cVar.a();
            this.d = cVar.g;
            this.e = cVar.h;
        }
    }

    public m(d dVar) {
        this.f250a = dVar.I;
        this.f251b = dVar.J;
        this.c = dVar.j();
        this.d = dVar.d();
        ArrayList<c> b2 = dVar.b();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new a(b2.get(i)));
        }
    }
}
