package a.b.k;

import a.f.k.k;
import a.f.k.p;
import a.f.k.q;
import a.f.k.r;
import android.view.View;

public class l implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f24b;

    public class a extends r {
        public a() {
        }

        public void a(View view) {
            l.this.f24b.p.setAlpha(1.0f);
            l.this.f24b.s.a((q) null);
            l.this.f24b.s = null;
        }

        public void b(View view) {
            l.this.f24b.p.setVisibility(0);
        }
    }

    public l(h hVar) {
        this.f24b = hVar;
    }

    public void run() {
        h hVar = this.f24b;
        hVar.q.showAtLocation(hVar.p, 55, 0, 0);
        this.f24b.e();
        if (this.f24b.k()) {
            this.f24b.p.setAlpha(0.0f);
            h hVar2 = this.f24b;
            p a2 = k.a(hVar2.p);
            a2.a(1.0f);
            hVar2.s = a2;
            p pVar = this.f24b.s;
            a aVar = new a();
            View view = (View) pVar.f330a.get();
            if (view != null) {
                pVar.a(view, aVar);
                return;
            }
            return;
        }
        this.f24b.p.setAlpha(1.0f);
        this.f24b.p.setVisibility(0);
    }
}
