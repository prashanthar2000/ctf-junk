package androidx.savedstate;

import a.j.d;
import a.j.e;
import a.j.h;
import a.l.a;

public class SavedStateRegistry$1 implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f529a;

    public SavedStateRegistry$1(a aVar) {
        this.f529a = aVar;
    }

    public void a(h hVar, e.a aVar) {
        a aVar2;
        boolean z;
        if (aVar == e.a.ON_START) {
            aVar2 = this.f529a;
            z = true;
        } else if (aVar == e.a.ON_STOP) {
            aVar2 = this.f529a;
            z = false;
        } else {
            return;
        }
        aVar2.d = z;
    }
}
