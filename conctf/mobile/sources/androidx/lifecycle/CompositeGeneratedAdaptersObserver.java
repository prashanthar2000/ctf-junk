package androidx.lifecycle;

import a.j.c;
import a.j.e;
import a.j.f;
import a.j.h;
import a.j.l;

public class CompositeGeneratedAdaptersObserver implements f {

    /* renamed from: a  reason: collision with root package name */
    public final c[] f518a;

    public CompositeGeneratedAdaptersObserver(c[] cVarArr) {
        this.f518a = cVarArr;
    }

    public void a(h hVar, e.a aVar) {
        l lVar = new l();
        for (c a2 : this.f518a) {
            a2.a(hVar, aVar, false, lVar);
        }
        for (c a3 : this.f518a) {
            a3.a(hVar, aVar, true, lVar);
        }
    }
}
