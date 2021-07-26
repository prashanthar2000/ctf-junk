package a.f.k;

import a.b.o.i.j;
import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public a f315a;

    public interface a {
    }

    public b(Context context) {
    }

    public View a(MenuItem menuItem) {
        return ((j.a) this).f94b.onCreateActionView();
    }

    public void a(a aVar) {
        if (!(this.f315a == null || aVar == null)) {
            StringBuilder a2 = b.a.a.a.a.a("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            a2.append(getClass().getSimpleName());
            a2.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", a2.toString());
        }
        this.f315a = aVar;
    }

    public boolean a() {
        return true;
    }

    public boolean b() {
        return false;
    }
}
