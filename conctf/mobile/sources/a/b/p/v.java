package a.b.p;

import a.b.o.i.p;
import a.b.p.w;
import android.annotation.SuppressLint;
import android.view.View;

public class v extends h0 {
    public final /* synthetic */ w.d k;
    public final /* synthetic */ w l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(w wVar, View view, w.d dVar) {
        super(view);
        this.l = wVar;
        this.k = dVar;
    }

    public p b() {
        return this.k;
    }

    @SuppressLint({"SyntheticAccessor"})
    public boolean c() {
        if (this.l.getInternalPopup().a()) {
            return true;
        }
        this.l.a();
        return true;
    }
}
