package a.b.k;

import a.f.k.k;
import a.f.k.q;
import a.f.k.r;
import android.view.View;

public class m extends r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f26a;

    public m(h hVar) {
        this.f26a = hVar;
    }

    public void a(View view) {
        this.f26a.p.setAlpha(1.0f);
        this.f26a.s.a((q) null);
        this.f26a.s = null;
    }

    public void b(View view) {
        this.f26a.p.setVisibility(0);
        this.f26a.p.sendAccessibilityEvent(32);
        if (this.f26a.p.getParent() instanceof View) {
            k.l((View) this.f26a.p.getParent());
        }
    }
}
