package a.b.o;

import a.b.o.a;
import a.b.o.i.g;
import a.b.p.c;
import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

public class d extends a implements g.a {
    public Context d;
    public ActionBarContextView e;
    public a.C0004a f;
    public WeakReference<View> g;
    public boolean h;
    public g i;

    public d(Context context, ActionBarContextView actionBarContextView, a.C0004a aVar, boolean z) {
        this.d = context;
        this.e = actionBarContextView;
        this.f = aVar;
        g gVar = new g(actionBarContextView.getContext());
        gVar.l = 1;
        this.i = gVar;
        gVar.e = this;
    }

    public void a() {
        if (!this.h) {
            this.h = true;
            this.e.sendAccessibilityEvent(32);
            this.f.a(this);
        }
    }

    public void a(g gVar) {
        g();
        c cVar = this.e.e;
        if (cVar != null) {
            cVar.f();
        }
    }

    public void a(View view) {
        this.e.setCustomView(view);
        this.g = view != null ? new WeakReference<>(view) : null;
    }

    public void a(CharSequence charSequence) {
        this.e.setSubtitle(charSequence);
    }

    public boolean a(g gVar, MenuItem menuItem) {
        return this.f.a((a) this, menuItem);
    }

    public View b() {
        WeakReference<View> weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public void b(int i2) {
        this.e.setTitle(this.d.getString(i2));
    }

    public void b(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    public Menu c() {
        return this.i;
    }

    public MenuInflater d() {
        return new f(this.e.getContext());
    }

    public CharSequence e() {
        return this.e.getSubtitle();
    }

    public CharSequence f() {
        return this.e.getTitle();
    }

    public void g() {
        this.f.a((a) this, (Menu) this.i);
    }

    public boolean h() {
        return this.e.s;
    }

    public void a(int i2) {
        this.e.setSubtitle(this.d.getString(i2));
    }

    public void a(boolean z) {
        this.c = z;
        this.e.setTitleOptional(z);
    }
}
