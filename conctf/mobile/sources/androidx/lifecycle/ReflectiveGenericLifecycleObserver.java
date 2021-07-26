package androidx.lifecycle;

import a.j.a;
import a.j.e;
import a.j.f;
import a.j.h;

public class ReflectiveGenericLifecycleObserver implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f525a;

    /* renamed from: b  reason: collision with root package name */
    public final a.C0022a f526b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f525a = obj;
        this.f526b = a.c.a(obj.getClass());
    }

    public void a(h hVar, e.a aVar) {
        a.C0022a aVar2 = this.f526b;
        Object obj = this.f525a;
        a.C0022a.a(aVar2.f404a.get(aVar), hVar, aVar, obj);
        a.C0022a.a(aVar2.f404a.get(e.a.ON_ANY), hVar, aVar, obj);
    }
}
