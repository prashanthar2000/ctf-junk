package a.i.a;

import a.d.a;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;

public final class t implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Fragment f390b;
    public final /* synthetic */ Fragment c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ a e;
    public final /* synthetic */ View f;
    public final /* synthetic */ d0 g;
    public final /* synthetic */ Rect h;

    public t(Fragment fragment, Fragment fragment2, boolean z, a aVar, View view, d0 d0Var, Rect rect) {
        this.f390b = fragment;
        this.c = fragment2;
        this.d = z;
        this.e = aVar;
        this.f = view;
        this.g = d0Var;
        this.h = rect;
    }

    public void run() {
        v.a(this.f390b, this.c, this.d, (a<String, View>) this.e, false);
        View view = this.f;
        if (view != null) {
            this.g.a(view, this.h);
        }
    }
}
