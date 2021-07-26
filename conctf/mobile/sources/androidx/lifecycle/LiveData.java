package androidx.lifecycle;

import a.c.a.b.b;
import a.j.d;
import a.j.e;
import a.j.h;
import a.j.i;
import a.j.n;
import java.util.Map;

public abstract class LiveData<T> {
    public static final Object i = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f521a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public b<n<? super T>, LiveData<T>.a> f522b = new b<>();
    public int c = 0;
    public volatile Object d = i;
    public volatile Object e = i;
    public int f = -1;
    public boolean g;
    public boolean h;

    public class LifecycleBoundObserver extends LiveData<T>.a implements d {
        public final h e;
        public final /* synthetic */ LiveData f;

        public void a(h hVar, e.a aVar) {
            if (((i) this.e.a()).f410b == e.b.DESTROYED) {
                this.f.a(this.f523a);
            } else {
                a(((i) this.e.a()).f410b.a(e.b.STARTED));
            }
        }
    }

    public abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final n<? super T> f523a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f524b;
        public int c;
        public final /* synthetic */ LiveData d;

        public void a(boolean z) {
            if (z != this.f524b) {
                this.f524b = z;
                int i = 1;
                boolean z2 = this.d.c == 0;
                LiveData liveData = this.d;
                int i2 = liveData.c;
                if (!this.f524b) {
                    i = -1;
                }
                liveData.c = i2 + i;
                if (z2 && this.f524b) {
                    this.d.a();
                }
                LiveData liveData2 = this.d;
                if (liveData2.c == 0 && !this.f524b) {
                    liveData2.b();
                }
                if (this.f524b) {
                    this.d.b(this);
                }
            }
        }
    }

    public static void a(String str) {
        if (!a.c.a.a.a.b().f198a.a()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background" + " thread");
        }
    }

    public void a() {
    }

    public void b() {
    }

    public void b(LiveData<T>.a aVar) {
        if (this.g) {
            this.h = true;
            return;
        }
        this.g = true;
        do {
            this.h = false;
            if (aVar == null) {
                b<K, V>.d a2 = this.f522b.a();
                while (a2.hasNext()) {
                    a((LiveData<T>.a) (a) ((Map.Entry) a2.next()).getValue());
                    if (this.h) {
                        break;
                    }
                }
            } else {
                a(aVar);
                aVar = null;
            }
        } while (this.h);
        this.g = false;
    }

    public final void a(LiveData<T>.a aVar) {
        if (aVar.f524b) {
            if (!((i) ((LifecycleBoundObserver) aVar).e.a()).f410b.a(e.b.STARTED)) {
                aVar.a(false);
                return;
            }
            int i2 = aVar.c;
            int i3 = this.f;
            if (i2 < i3) {
                aVar.c = i3;
                aVar.f523a.a(this.d);
            }
        }
    }

    public void a(n<? super T> nVar) {
        a("removeObserver");
        a remove = this.f522b.remove(nVar);
        if (remove != null) {
            LifecycleBoundObserver lifecycleBoundObserver = (LifecycleBoundObserver) remove;
            ((i) lifecycleBoundObserver.e.a()).f409a.remove(lifecycleBoundObserver);
            remove.a(false);
        }
    }
}
