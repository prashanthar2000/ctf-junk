package a.b.p;

import a.b.h;
import a.b.j;
import a.b.o.i.g;
import a.b.o.i.i;
import a.b.o.i.m;
import a.f.k.k;
import a.f.k.p;
import a.f.k.r;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;

public class z0 implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f194a;

    /* renamed from: b  reason: collision with root package name */
    public int f195b;
    public View c;
    public View d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public boolean h;
    public CharSequence i;
    public CharSequence j;
    public CharSequence k;
    public Window.Callback l;
    public boolean m;
    public c n;
    public int o = 0;
    public int p = 0;
    public Drawable q;

    public class a extends r {

        /* renamed from: a  reason: collision with root package name */
        public boolean f196a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f197b;

        public a(int i) {
            this.f197b = i;
        }

        public void a(View view) {
            if (!this.f196a) {
                z0.this.f194a.setVisibility(this.f197b);
            }
        }

        public void b(View view) {
            z0.this.f194a.setVisibility(0);
        }

        public void c(View view) {
            this.f196a = true;
        }
    }

    public z0(Toolbar toolbar, boolean z) {
        int i2;
        Drawable drawable;
        int i3 = h.abc_action_bar_up_description;
        this.f194a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        String str = null;
        x0 a2 = x0.a(toolbar.getContext(), (AttributeSet) null, j.ActionBar, a.b.a.actionBarStyle, 0);
        this.q = a2.b(j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence e2 = a2.e(j.ActionBar_title);
            if (!TextUtils.isEmpty(e2)) {
                this.h = true;
                this.i = e2;
                if ((this.f195b & 8) != 0) {
                    this.f194a.setTitle(e2);
                }
            }
            CharSequence e3 = a2.e(j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(e3)) {
                this.j = e3;
                if ((this.f195b & 8) != 0) {
                    this.f194a.setSubtitle(e3);
                }
            }
            Drawable b2 = a2.b(j.ActionBar_logo);
            if (b2 != null) {
                this.f = b2;
                q();
            }
            Drawable b3 = a2.b(j.ActionBar_icon);
            if (b3 != null) {
                this.e = b3;
                q();
            }
            if (this.g == null && (drawable = this.q) != null) {
                this.g = drawable;
                p();
            }
            c(a2.c(j.ActionBar_displayOptions, 0));
            int e4 = a2.e(j.ActionBar_customNavigationLayout, 0);
            if (e4 != 0) {
                View inflate = LayoutInflater.from(this.f194a.getContext()).inflate(e4, this.f194a, false);
                View view = this.d;
                if (!(view == null || (this.f195b & 16) == 0)) {
                    this.f194a.removeView(view);
                }
                this.d = inflate;
                if (!(inflate == null || (this.f195b & 16) == 0)) {
                    this.f194a.addView(inflate);
                }
                c(this.f195b | 16);
            }
            int d2 = a2.d(j.ActionBar_height, 0);
            if (d2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f194a.getLayoutParams();
                layoutParams.height = d2;
                this.f194a.setLayoutParams(layoutParams);
            }
            int a3 = a2.a(j.ActionBar_contentInsetStart, -1);
            int a4 = a2.a(j.ActionBar_contentInsetEnd, -1);
            if (a3 >= 0 || a4 >= 0) {
                Toolbar toolbar2 = this.f194a;
                int max = Math.max(a3, 0);
                int max2 = Math.max(a4, 0);
                toolbar2.b();
                toolbar2.u.a(max, max2);
            }
            int e5 = a2.e(j.ActionBar_titleTextStyle, 0);
            if (e5 != 0) {
                Toolbar toolbar3 = this.f194a;
                Context context = toolbar3.getContext();
                toolbar3.m = e5;
                TextView textView = toolbar3.c;
                if (textView != null) {
                    textView.setTextAppearance(context, e5);
                }
            }
            int e6 = a2.e(j.ActionBar_subtitleTextStyle, 0);
            if (e6 != 0) {
                Toolbar toolbar4 = this.f194a;
                Context context2 = toolbar4.getContext();
                toolbar4.n = e6;
                TextView textView2 = toolbar4.d;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, e6);
                }
            }
            int e7 = a2.e(j.ActionBar_popupTheme, 0);
            if (e7 != 0) {
                this.f194a.setPopupTheme(e7);
            }
        } else {
            if (this.f194a.getNavigationIcon() != null) {
                i2 = 15;
                this.q = this.f194a.getNavigationIcon();
            } else {
                i2 = 11;
            }
            this.f195b = i2;
        }
        a2.f186b.recycle();
        if (i3 != this.p) {
            this.p = i3;
            if (TextUtils.isEmpty(this.f194a.getNavigationContentDescription())) {
                int i4 = this.p;
                this.k = i4 != 0 ? m().getString(i4) : str;
                o();
            }
        }
        this.k = this.f194a.getNavigationContentDescription();
        this.f194a.setNavigationOnClickListener(new y0(this));
    }

    public void a(int i2) {
        this.f194a.setVisibility(i2);
    }

    public void a(q0 q0Var) {
        Toolbar toolbar;
        View view = this.c;
        if (view != null && view.getParent() == (toolbar = this.f194a)) {
            toolbar.removeView(this.c);
        }
        this.c = q0Var;
        if (q0Var != null && this.o == 2) {
            this.f194a.addView(q0Var, 0);
            Toolbar.e eVar = (Toolbar.e) this.c.getLayoutParams();
            eVar.width = -2;
            eVar.height = -2;
            eVar.f2a = 8388691;
            q0Var.setAllowCollapse(true);
        }
    }

    public void a(Menu menu, m.a aVar) {
        i iVar;
        if (this.n == null) {
            this.n = new c(this.f194a.getContext());
        }
        c cVar = this.n;
        cVar.f = aVar;
        Toolbar toolbar = this.f194a;
        g gVar = (g) menu;
        if (gVar != null || toolbar.f496b != null) {
            toolbar.d();
            g gVar2 = toolbar.f496b.q;
            if (gVar2 != gVar) {
                if (gVar2 != null) {
                    gVar2.a((m) toolbar.K);
                    gVar2.a((m) toolbar.L);
                }
                if (toolbar.L == null) {
                    toolbar.L = new Toolbar.d();
                }
                cVar.r = true;
                if (gVar != null) {
                    gVar.a((m) cVar, toolbar.k);
                    gVar.a((m) toolbar.L, toolbar.k);
                } else {
                    cVar.a(toolbar.k, (g) null);
                    Toolbar.d dVar = toolbar.L;
                    g gVar3 = dVar.f500b;
                    if (!(gVar3 == null || (iVar = dVar.c) == null)) {
                        gVar3.a(iVar);
                    }
                    dVar.f500b = null;
                    cVar.a(true);
                    toolbar.L.a(true);
                }
                toolbar.f496b.setPopupTheme(toolbar.l);
                toolbar.f496b.setPresenter(cVar);
                toolbar.K = cVar;
            }
        }
    }

    public void a(boolean z) {
    }

    public boolean a() {
        return this.f194a.g();
    }

    public void b(boolean z) {
        this.f194a.setCollapsible(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f194a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f496b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            a.b.p.c r0 = r0.u
            if (r0 == 0) goto L_0x001e
            a.b.p.c$c r3 = r0.w
            if (r3 != 0) goto L_0x0019
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = r2
            goto L_0x001a
        L_0x0019:
            r0 = r1
        L_0x001a:
            if (r0 == 0) goto L_0x001e
            r0 = r1
            goto L_0x001f
        L_0x001e:
            r0 = r2
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r2
        L_0x0023:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.z0.b():boolean");
    }

    public void c() {
        this.m = true;
    }

    public void c(int i2) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i3 = this.f195b ^ i2;
        this.f195b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    o();
                }
                p();
            }
            if ((i3 & 3) != 0) {
                q();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.f194a.setTitle(this.i);
                    toolbar = this.f194a;
                    charSequence = this.j;
                } else {
                    charSequence = null;
                    this.f194a.setTitle((CharSequence) null);
                    toolbar = this.f194a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i3 & 16) != 0 && (view = this.d) != null) {
                if ((i2 & 16) != 0) {
                    this.f194a.addView(view);
                } else {
                    this.f194a.removeView(view);
                }
            }
        }
    }

    public void collapseActionView() {
        Toolbar.d dVar = this.f194a.L;
        i iVar = dVar == null ? null : dVar.c;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public boolean d() {
        return this.f194a.f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.f496b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e() {
        /*
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.f194a
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r0.f496b
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.t
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.z0.e():boolean");
    }

    public boolean f() {
        ActionMenuView actionMenuView = this.f194a.f496b;
        if (actionMenuView != null) {
            c cVar = actionMenuView.u;
            if (cVar != null && cVar.c()) {
                return true;
            }
        }
        return false;
    }

    public void g() {
        c cVar;
        ActionMenuView actionMenuView = this.f194a.f496b;
        if (actionMenuView != null && (cVar = actionMenuView.u) != null) {
            cVar.a();
        }
    }

    public CharSequence getTitle() {
        return this.f194a.getTitle();
    }

    public int h() {
        return this.f195b;
    }

    public void i() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public boolean j() {
        Toolbar.d dVar = this.f194a.L;
        return (dVar == null || dVar.c == null) ? false : true;
    }

    public ViewGroup k() {
        return this.f194a;
    }

    public void l() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public Context m() {
        return this.f194a.getContext();
    }

    public int n() {
        return this.o;
    }

    public final void o() {
        if ((this.f195b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.k)) {
            this.f194a.setNavigationContentDescription(this.p);
        } else {
            this.f194a.setNavigationContentDescription(this.k);
        }
    }

    public final void p() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f195b & 4) != 0) {
            toolbar = this.f194a;
            drawable = this.g;
            if (drawable == null) {
                drawable = this.q;
            }
        } else {
            toolbar = this.f194a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void q() {
        Drawable drawable;
        int i2 = this.f195b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f) == null) {
            drawable = this.e;
        }
        this.f194a.setLogo(drawable);
    }

    public void setIcon(int i2) {
        this.e = i2 != 0 ? a.b.l.a.a.b(m(), i2) : null;
        q();
    }

    public void setIcon(Drawable drawable) {
        this.e = drawable;
        q();
    }

    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.h) {
            this.i = charSequence;
            if ((this.f195b & 8) != 0) {
                this.f194a.setTitle(charSequence);
            }
        }
    }

    public void b(int i2) {
        this.f = i2 != 0 ? a.b.l.a.a.b(m(), i2) : null;
        q();
    }

    public p a(int i2, long j2) {
        p a2 = k.a(this.f194a);
        a2.a(i2 == 0 ? 1.0f : 0.0f);
        a2.a(j2);
        a aVar = new a(i2);
        View view = (View) a2.f330a.get();
        if (view != null) {
            a2.a(view, aVar);
        }
        return a2;
    }
}
