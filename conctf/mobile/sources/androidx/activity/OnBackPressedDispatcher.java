package androidx.activity;

import a.a.b;
import a.i.a.j;
import a.j.e;
import a.j.f;
import a.j.h;
import a.j.i;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f451a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<b> f452b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements f, a.a.a {

        /* renamed from: a  reason: collision with root package name */
        public final e f453a;

        /* renamed from: b  reason: collision with root package name */
        public final b f454b;
        public a.a.a c;

        public LifecycleOnBackPressedCancellable(e eVar, b bVar) {
            this.f453a = eVar;
            this.f454b = bVar;
            eVar.a(this);
        }

        public void a(h hVar, e.a aVar) {
            if (aVar == e.a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                b bVar = this.f454b;
                onBackPressedDispatcher.f452b.add(bVar);
                a aVar2 = new a(bVar);
                bVar.f1b.add(aVar2);
                this.c = aVar2;
            } else if (aVar == e.a.ON_STOP) {
                a.a.a aVar3 = this.c;
                if (aVar3 != null) {
                    aVar3.cancel();
                }
            } else if (aVar == e.a.ON_DESTROY) {
                cancel();
            }
        }

        public void cancel() {
            ((i) this.f453a).f409a.remove(this);
            this.f454b.f1b.remove(this);
            a.a.a aVar = this.c;
            if (aVar != null) {
                aVar.cancel();
                this.c = null;
            }
        }
    }

    public class a implements a.a.a {

        /* renamed from: a  reason: collision with root package name */
        public final b f455a;

        public a(b bVar) {
            this.f455a = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f452b.remove(this.f455a);
            this.f455a.f1b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f451a = runnable;
    }

    public void a() {
        Iterator<b> descendingIterator = this.f452b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.f0a) {
                j jVar = j.this;
                jVar.g();
                if (jVar.k.f0a) {
                    jVar.b();
                    return;
                } else {
                    jVar.j.a();
                    return;
                }
            }
        }
        Runnable runnable = this.f451a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
