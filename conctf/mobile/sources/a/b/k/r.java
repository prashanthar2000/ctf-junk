package a.b.k;

import a.b.f;
import a.b.j;
import a.b.k.a;
import a.b.o.a;
import a.b.o.g;
import a.b.o.i.g;
import a.b.p.d0;
import a.b.p.q0;
import a.f.k.k;
import a.f.k.p;
import a.f.k.q;
import a.f.k.s;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class r extends a implements ActionBarOverlayLayout.d {
    public static final Interpolator A = new AccelerateInterpolator();
    public static final Interpolator B = new DecelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    public Context f37a;

    /* renamed from: b  reason: collision with root package name */
    public Context f38b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public d0 e;
    public ActionBarContextView f;
    public View g;
    public boolean h;
    public d i;
    public a.b.o.a j;
    public a.C0004a k;
    public boolean l;
    public ArrayList<a.b> m = new ArrayList<>();
    public boolean n;
    public int o = 0;
    public boolean p = true;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t = true;
    public g u;
    public boolean v;
    public boolean w;
    public final q x = new a();
    public final q y = new b();
    public final s z = new c();

    public class a extends a.f.k.r {
        public a() {
        }

        public void a(View view) {
            View view2;
            r rVar = r.this;
            if (rVar.p && (view2 = rVar.g) != null) {
                view2.setTranslationY(0.0f);
                r.this.d.setTranslationY(0.0f);
            }
            r.this.d.setVisibility(8);
            r.this.d.setTransitioning(false);
            r rVar2 = r.this;
            rVar2.u = null;
            a.C0004a aVar = rVar2.k;
            if (aVar != null) {
                aVar.a(rVar2.j);
                rVar2.j = null;
                rVar2.k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = r.this.c;
            if (actionBarOverlayLayout != null) {
                k.l(actionBarOverlayLayout);
            }
        }
    }

    public class b extends a.f.k.r {
        public b() {
        }

        public void a(View view) {
            r rVar = r.this;
            rVar.u = null;
            rVar.d.requestLayout();
        }
    }

    public class c implements s {
        public c() {
        }
    }

    public r(Activity activity, boolean z2) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        a(decorView);
        if (!z2) {
            this.g = decorView.findViewById(16908290);
        }
    }

    public r(Dialog dialog) {
        new ArrayList();
        a(dialog.getWindow().getDecorView());
    }

    public final void a(View view) {
        d0 d0Var;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(f.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(f.action_bar);
        if (findViewById instanceof d0) {
            d0Var = (d0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            d0Var = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder a2 = b.a.a.a.a.a("Can't make a decor toolbar out of ");
            a2.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(a2.toString());
        }
        this.e = d0Var;
        this.f = (ActionBarContextView) view.findViewById(f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(f.action_bar_container);
        this.d = actionBarContainer;
        d0 d0Var2 = this.e;
        if (d0Var2 == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(r.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f37a = d0Var2.m();
        boolean z2 = (this.e.h() & 4) != 0;
        if (z2) {
            this.h = true;
        }
        Context context = this.f37a;
        this.e.a((context.getApplicationInfo().targetSdkVersion < 14) || z2);
        e(context.getResources().getBoolean(a.b.b.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f37a.obtainStyledAttributes((AttributeSet) null, j.ActionBar, a.b.a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(j.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2.i) {
                this.w = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            k.a((View) this.d, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public void a(CharSequence charSequence) {
        this.e.setWindowTitle(charSequence);
    }

    public void a(boolean z2) {
        if (z2 != this.l) {
            this.l = z2;
            int size = this.m.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.m.get(i2).a(z2);
            }
        }
    }

    public boolean a() {
        d0 d0Var = this.e;
        if (d0Var == null || !d0Var.j()) {
            return false;
        }
        this.e.collapseActionView();
        return true;
    }

    public int b() {
        return this.e.h();
    }

    public void b(boolean z2) {
        if (!this.h) {
            int i2 = z2 ? 4 : 0;
            int h2 = this.e.h();
            this.h = true;
            this.e.c((i2 & 4) | (h2 & -5));
        }
    }

    public Context c() {
        if (this.f38b == null) {
            TypedValue typedValue = new TypedValue();
            this.f37a.getTheme().resolveAttribute(a.b.a.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f38b = new ContextThemeWrapper(this.f37a, i2);
            } else {
                this.f38b = this.f37a;
            }
        }
        return this.f38b;
    }

    public void c(boolean z2) {
        g gVar;
        this.v = z2;
        if (!z2 && (gVar = this.u) != null) {
            gVar.a();
        }
    }

    public void d(boolean z2) {
        p pVar;
        p pVar2;
        if (z2) {
            if (!this.s) {
                this.s = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                f(false);
            }
        } else if (this.s) {
            this.s = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            f(false);
        }
        if (k.i(this.d)) {
            if (z2) {
                pVar = this.e.a(4, 100);
                pVar2 = this.f.a(0, 200);
            } else {
                pVar2 = this.e.a(0, 200);
                pVar = this.f.a(8, 100);
            }
            g gVar = new g();
            gVar.f69a.add(pVar);
            View view = (View) pVar.f330a.get();
            long duration = view != null ? view.animate().getDuration() : 0;
            View view2 = (View) pVar2.f330a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            gVar.f69a.add(pVar2);
            gVar.b();
        } else if (z2) {
            this.e.a(4);
            this.f.setVisibility(0);
        } else {
            this.e.a(0);
            this.f.setVisibility(8);
        }
    }

    public final void e(boolean z2) {
        this.n = z2;
        if (!z2) {
            this.e.a((q0) null);
            this.d.setTabContainer((q0) null);
        } else {
            this.d.setTabContainer((q0) null);
            this.e.a((q0) null);
        }
        boolean z3 = true;
        boolean z4 = this.e.n() == 2;
        this.e.b(!this.n && z4);
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (this.n || !z4) {
            z3 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z3);
    }

    public final void f(boolean z2) {
        View view;
        View view2;
        View view3;
        if (this.s || !this.r) {
            if (!this.t) {
                this.t = true;
                g gVar = this.u;
                if (gVar != null) {
                    gVar.a();
                }
                this.d.setVisibility(0);
                if (this.o != 0 || (!this.v && !z2)) {
                    this.d.setAlpha(1.0f);
                    this.d.setTranslationY(0.0f);
                    if (this.p && (view2 = this.g) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.y.a((View) null);
                } else {
                    this.d.setTranslationY(0.0f);
                    float f2 = (float) (-this.d.getHeight());
                    if (z2) {
                        int[] iArr = {0, 0};
                        this.d.getLocationInWindow(iArr);
                        f2 -= (float) iArr[1];
                    }
                    this.d.setTranslationY(f2);
                    g gVar2 = new g();
                    p a2 = k.a(this.d);
                    a2.b(0.0f);
                    a2.a(this.z);
                    if (!gVar2.e) {
                        gVar2.f69a.add(a2);
                    }
                    if (this.p && (view3 = this.g) != null) {
                        view3.setTranslationY(f2);
                        p a3 = k.a(this.g);
                        a3.b(0.0f);
                        if (!gVar2.e) {
                            gVar2.f69a.add(a3);
                        }
                    }
                    Interpolator interpolator = B;
                    if (!gVar2.e) {
                        gVar2.c = interpolator;
                    }
                    if (!gVar2.e) {
                        gVar2.f70b = 250;
                    }
                    q qVar = this.y;
                    if (!gVar2.e) {
                        gVar2.d = qVar;
                    }
                    this.u = gVar2;
                    gVar2.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    k.l(actionBarOverlayLayout);
                }
            }
        } else if (this.t) {
            this.t = false;
            g gVar3 = this.u;
            if (gVar3 != null) {
                gVar3.a();
            }
            if (this.o != 0 || (!this.v && !z2)) {
                this.x.a((View) null);
                return;
            }
            this.d.setAlpha(1.0f);
            this.d.setTransitioning(true);
            g gVar4 = new g();
            float f3 = (float) (-this.d.getHeight());
            if (z2) {
                int[] iArr2 = {0, 0};
                this.d.getLocationInWindow(iArr2);
                f3 -= (float) iArr2[1];
            }
            p a4 = k.a(this.d);
            a4.b(f3);
            a4.a(this.z);
            if (!gVar4.e) {
                gVar4.f69a.add(a4);
            }
            if (this.p && (view = this.g) != null) {
                p a5 = k.a(view);
                a5.b(f3);
                if (!gVar4.e) {
                    gVar4.f69a.add(a5);
                }
            }
            Interpolator interpolator2 = A;
            if (!gVar4.e) {
                gVar4.c = interpolator2;
            }
            if (!gVar4.e) {
                gVar4.f70b = 250;
            }
            q qVar2 = this.x;
            if (!gVar4.e) {
                gVar4.d = qVar2;
            }
            this.u = gVar4;
            gVar4.b();
        }
    }

    public class d extends a.b.o.a implements g.a {
        public final Context d;
        public final a.b.o.i.g e;
        public a.C0004a f;
        public WeakReference<View> g;

        public d(Context context, a.C0004a aVar) {
            this.d = context;
            this.f = aVar;
            a.b.o.i.g gVar = new a.b.o.i.g(context);
            gVar.l = 1;
            this.e = gVar;
            gVar.e = this;
        }

        public void a() {
            r rVar = r.this;
            if (rVar.i == this) {
                boolean z = rVar.q;
                boolean z2 = rVar.r;
                boolean z3 = true;
                if (z || z2) {
                    z3 = false;
                }
                if (!z3) {
                    r rVar2 = r.this;
                    rVar2.j = this;
                    rVar2.k = this.f;
                } else {
                    this.f.a(this);
                }
                this.f = null;
                r.this.d(false);
                ActionBarContextView actionBarContextView = r.this.f;
                if (actionBarContextView.l == null) {
                    actionBarContextView.b();
                }
                r.this.e.k().sendAccessibilityEvent(32);
                r rVar3 = r.this;
                rVar3.c.setHideOnContentScrollEnabled(rVar3.w);
                r.this.i = null;
            }
        }

        public void a(View view) {
            r.this.f.setCustomView(view);
            this.g = new WeakReference<>(view);
        }

        public void a(CharSequence charSequence) {
            r.this.f.setSubtitle(charSequence);
        }

        public boolean a(a.b.o.i.g gVar, MenuItem menuItem) {
            a.C0004a aVar = this.f;
            if (aVar != null) {
                return aVar.a((a.b.o.a) this, menuItem);
            }
            return false;
        }

        public View b() {
            WeakReference<View> weakReference = this.g;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public void b(int i) {
            r.this.f.setTitle(r.this.f37a.getResources().getString(i));
        }

        public void b(CharSequence charSequence) {
            r.this.f.setTitle(charSequence);
        }

        public Menu c() {
            return this.e;
        }

        public MenuInflater d() {
            return new a.b.o.f(this.d);
        }

        public CharSequence e() {
            return r.this.f.getSubtitle();
        }

        public CharSequence f() {
            return r.this.f.getTitle();
        }

        public void g() {
            if (r.this.i == this) {
                this.e.j();
                try {
                    this.f.a((a.b.o.a) this, (Menu) this.e);
                } finally {
                    this.e.i();
                }
            }
        }

        public boolean h() {
            return r.this.f.s;
        }

        public void a(a.b.o.i.g gVar) {
            if (this.f != null) {
                g();
                a.b.p.c cVar = r.this.f.e;
                if (cVar != null) {
                    cVar.f();
                }
            }
        }

        public void a(int i) {
            r.this.f.setSubtitle(r.this.f37a.getResources().getString(i));
        }

        public void a(boolean z) {
            this.c = z;
            r.this.f.setTitleOptional(z);
        }
    }

    public void a(Configuration configuration) {
        e(this.f37a.getResources().getBoolean(a.b.b.abc_action_bar_embed_tabs));
    }

    public boolean a(int i2, KeyEvent keyEvent) {
        a.b.o.i.g gVar;
        d dVar = this.i;
        if (dVar == null || (gVar = dVar.e) == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        gVar.setQwertyMode(z2);
        return gVar.performShortcut(i2, keyEvent, 0);
    }

    public a.b.o.a a(a.C0004a aVar) {
        d dVar = this.i;
        if (dVar != null) {
            dVar.a();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.b();
        d dVar2 = new d(this.f.getContext(), aVar);
        dVar2.e.j();
        try {
            if (!dVar2.f.b(dVar2, dVar2.e)) {
                return null;
            }
            this.i = dVar2;
            dVar2.g();
            this.f.a(dVar2);
            d(true);
            this.f.sendAccessibilityEvent(32);
            return dVar2;
        } finally {
            dVar2.e.i();
        }
    }
}
