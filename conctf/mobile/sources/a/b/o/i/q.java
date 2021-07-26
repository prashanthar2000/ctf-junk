package a.b.o.i;

import a.b.d;
import a.b.g;
import a.b.o.i.m;
import a.b.p.f0;
import a.b.p.m0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

public final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {
    public static final int w = g.abc_popup_menu_item_layout;
    public final Context c;
    public final g d;
    public final f e;
    public final boolean f;
    public final int g;
    public final int h;
    public final int i;
    public final m0 j;
    public final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    public final View.OnAttachStateChangeListener l = new b();
    public PopupWindow.OnDismissListener m;
    public View n;
    public View o;
    public m.a p;
    public ViewTreeObserver q;
    public boolean r;
    public boolean s;
    public int t;
    public int u = 0;
    public boolean v;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (q.this.a()) {
                q qVar = q.this;
                if (!qVar.j.B) {
                    View view = qVar.o;
                    if (view == null || !view.isShown()) {
                        q.this.dismiss();
                    } else {
                        q.this.j.e();
                    }
                }
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.q = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.q.removeGlobalOnLayoutListener(qVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i2, int i3, boolean z) {
        this.c = context;
        this.d = gVar;
        this.f = z;
        this.e = new f(gVar, LayoutInflater.from(context), this.f, w);
        this.h = i2;
        this.i = i3;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.abc_config_prefDialogWidth));
        this.n = view;
        this.j = new m0(this.c, (AttributeSet) null, this.h, this.i);
        gVar.a((m) this, context);
    }

    public void a(int i2) {
        this.u = i2;
    }

    public void a(g gVar) {
    }

    public void a(g gVar, boolean z) {
        if (gVar == this.d) {
            dismiss();
            m.a aVar = this.p;
            if (aVar != null) {
                aVar.a(gVar, z);
            }
        }
    }

    public void a(m.a aVar) {
        this.p = aVar;
    }

    public void a(View view) {
        this.n = view;
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    public void a(boolean z) {
        this.s = false;
        f fVar = this.e;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    public boolean a() {
        return !this.r && this.j.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(a.b.o.i.r r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x0076
            a.b.o.i.l r0 = new a.b.o.i.l
            android.content.Context r3 = r9.c
            android.view.View r5 = r9.o
            boolean r6 = r9.f
            int r7 = r9.h
            int r8 = r9.i
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            a.b.o.i.m$a r2 = r9.p
            r0.a(r2)
            boolean r2 = a.b.o.i.k.b((a.b.o.i.g) r10)
            r0.h = r2
            a.b.o.i.k r3 = r0.j
            if (r3 == 0) goto L_0x002a
            r3.b((boolean) r2)
        L_0x002a:
            android.widget.PopupWindow$OnDismissListener r2 = r9.m
            r0.k = r2
            r2 = 0
            r9.m = r2
            a.b.o.i.g r2 = r9.d
            r2.a((boolean) r1)
            a.b.p.m0 r2 = r9.j
            int r3 = r2.g
            boolean r4 = r2.j
            if (r4 != 0) goto L_0x0040
            r2 = r1
            goto L_0x0042
        L_0x0040:
            int r2 = r2.h
        L_0x0042:
            int r4 = r9.u
            android.view.View r5 = r9.n
            int r5 = a.f.k.k.c(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x005a
            android.view.View r4 = r9.n
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L_0x005a:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L_0x0062
            goto L_0x006b
        L_0x0062:
            android.view.View r4 = r0.f
            if (r4 != 0) goto L_0x0068
            r0 = r1
            goto L_0x006c
        L_0x0068:
            r0.a(r3, r2, r5, r5)
        L_0x006b:
            r0 = r5
        L_0x006c:
            if (r0 == 0) goto L_0x0076
            a.b.o.i.m$a r0 = r9.p
            if (r0 == 0) goto L_0x0075
            r0.a(r10)
        L_0x0075:
            return r5
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.o.i.q.a(a.b.o.i.r):boolean");
    }

    public void b(boolean z) {
        this.e.d = z;
    }

    public boolean b() {
        return false;
    }

    public void c(int i2) {
        m0 m0Var = this.j;
        m0Var.h = i2;
        m0Var.j = true;
    }

    public void c(boolean z) {
        this.v = z;
    }

    public ListView d() {
        return this.j.d;
    }

    public void dismiss() {
        if (a()) {
            this.j.dismiss();
        }
    }

    public void e() {
        View view;
        boolean z = true;
        if (!a()) {
            if (this.r || (view = this.n) == null) {
                z = false;
            } else {
                this.o = view;
                this.j.C.setOnDismissListener(this);
                m0 m0Var = this.j;
                m0Var.t = this;
                m0Var.a(true);
                View view2 = this.o;
                boolean z2 = this.q == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.q = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.k);
                }
                view2.addOnAttachStateChangeListener(this.l);
                m0 m0Var2 = this.j;
                m0Var2.s = view2;
                m0Var2.m = this.u;
                if (!this.s) {
                    this.t = k.a(this.e, (ViewGroup) null, this.c, this.g);
                    this.s = true;
                }
                this.j.d(this.t);
                this.j.C.setInputMethodMode(2);
                m0 m0Var3 = this.j;
                Rect rect = this.f100b;
                if (m0Var3 != null) {
                    m0Var3.A = rect != null ? new Rect(rect) : null;
                    this.j.e();
                    f0 f0Var = this.j.d;
                    f0Var.setOnKeyListener(this);
                    if (this.v && this.d.m != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.c).inflate(g.abc_popup_menu_header_item_layout, f0Var, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(this.d.m);
                        }
                        frameLayout.setEnabled(false);
                        f0Var.addHeaderView(frameLayout, (Object) null, false);
                    }
                    this.j.a((ListAdapter) this.e);
                    this.j.e();
                } else {
                    throw null;
                }
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public void onDismiss() {
        this.r = true;
        this.d.a(true);
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.q = this.o.getViewTreeObserver();
            }
            this.q.removeGlobalOnLayoutListener(this.k);
            this.q = null;
        }
        this.o.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void b(int i2) {
        this.j.g = i2;
    }
}
