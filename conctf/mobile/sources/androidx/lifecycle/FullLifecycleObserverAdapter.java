package androidx.lifecycle;

import a.j.b;
import a.j.e;
import a.j.f;
import a.j.h;

public class FullLifecycleObserverAdapter implements f {

    /* renamed from: a  reason: collision with root package name */
    public final b f519a;

    /* renamed from: b  reason: collision with root package name */
    public final f f520b;

    public FullLifecycleObserverAdapter(b bVar, f fVar) {
        this.f519a = bVar;
        this.f520b = fVar;
    }

    public void a(h hVar, e.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                this.f519a.e(hVar);
                break;
            case 1:
                this.f519a.f(hVar);
                break;
            case 2:
                this.f519a.a(hVar);
                break;
            case 3:
                this.f519a.b(hVar);
                break;
            case 4:
                this.f519a.d(hVar);
                break;
            case 5:
                this.f519a.c(hVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        f fVar = this.f520b;
        if (fVar != null) {
            fVar.a(hVar, aVar);
        }
    }
}
