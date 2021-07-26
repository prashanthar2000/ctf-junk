package a.b.p;

import a.b.o.i.a;
import android.view.View;
import android.view.Window;

public class y0 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final a f192b = new a(this.c.f194a.getContext(), 0, 16908332, 0, 0, this.c.i);
    public final /* synthetic */ z0 c;

    public y0(z0 z0Var) {
        this.c = z0Var;
    }

    public void onClick(View view) {
        z0 z0Var = this.c;
        Window.Callback callback = z0Var.l;
        if (callback != null && z0Var.m) {
            callback.onMenuItemSelected(0, this.f192b);
        }
    }
}
