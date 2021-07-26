package a.b.o.i;

import a.b.g;
import a.b.o.i.m;
import a.b.p.l0;
import a.b.p.m0;
import a.f.k.k;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.List;

public final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int C = g.abc_cascading_menu_item_layout;
    public PopupWindow.OnDismissListener A;
    public boolean B;
    public final Context c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final Handler h;
    public final List<g> i = new ArrayList();
    public final List<C0005d> j = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    public final View.OnAttachStateChangeListener l = new b();
    public final l0 m = new c();
    public int n;
    public int o;
    public View p;
    public View q;
    public int r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public m.a y;
    public ViewTreeObserver z;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (d.this.a() && d.this.j.size() > 0 && !d.this.j.get(0).f83a.B) {
                View view = d.this.q;
                if (view == null || !view.isShown()) {
                    d.this.dismiss();
                    return;
                }
                for (C0005d dVar : d.this.j) {
                    dVar.f83a.e();
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
            ViewTreeObserver viewTreeObserver = d.this.z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.z = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.z.removeGlobalOnLayoutListener(dVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements l0 {

        public class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ C0005d f82b;
            public final /* synthetic */ MenuItem c;
            public final /* synthetic */ g d;

            public a(C0005d dVar, MenuItem menuItem, g gVar) {
                this.f82b = dVar;
                this.c = menuItem;
                this.d = gVar;
            }

            public void run() {
                C0005d dVar = this.f82b;
                if (dVar != null) {
                    d.this.B = true;
                    dVar.f84b.a(false);
                    d.this.B = false;
                }
                if (this.c.isEnabled() && this.c.hasSubMenu()) {
                    this.d.a(this.c, 4);
                }
            }
        }

        public c() {
        }

        public void a(g gVar, MenuItem menuItem) {
            C0005d dVar = null;
            d.this.h.removeCallbacksAndMessages((Object) null);
            int size = d.this.j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == d.this.j.get(i).f84b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < d.this.j.size()) {
                    dVar = d.this.j.get(i2);
                }
                d.this.h.postAtTime(new a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        public void b(g gVar, MenuItem menuItem) {
            d.this.h.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: a.b.o.i.d$d  reason: collision with other inner class name */
    public static class C0005d {

        /* renamed from: a  reason: collision with root package name */
        public final m0 f83a;

        /* renamed from: b  reason: collision with root package name */
        public final g f84b;
        public final int c;

        public C0005d(m0 m0Var, g gVar, int i) {
            this.f83a = m0Var;
            this.f84b = gVar;
            this.c = i;
        }
    }

    public d(Context context, View view, int i2, int i3, boolean z2) {
        int i4 = 0;
        this.n = 0;
        this.o = 0;
        this.c = context;
        this.p = view;
        this.e = i2;
        this.f = i3;
        this.g = z2;
        this.w = false;
        this.r = k.c(view) != 1 ? 1 : i4;
        Resources resources = context.getResources();
        this.d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.b.d.abc_config_prefDialogWidth));
        this.h = new Handler();
    }

    public void a(g gVar) {
        gVar.a((m) this, this.c);
        if (a()) {
            c(gVar);
        } else {
            this.i.add(gVar);
        }
    }

    public void a(g gVar, boolean z2) {
        int i2;
        int size = this.j.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (gVar == this.j.get(i3).f84b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int i4 = i3 + 1;
            if (i4 < this.j.size()) {
                this.j.get(i4).f84b.a(false);
            }
            C0005d remove = this.j.remove(i3);
            remove.f84b.a((m) this);
            if (this.B) {
                remove.f83a.C.setExitTransition((Transition) null);
                remove.f83a.C.setAnimationStyle(0);
            }
            remove.f83a.dismiss();
            int size2 = this.j.size();
            if (size2 > 0) {
                i2 = this.j.get(size2 - 1).c;
            } else {
                i2 = k.c(this.p) == 1 ? 0 : 1;
            }
            this.r = i2;
            if (size2 == 0) {
                dismiss();
                m.a aVar = this.y;
                if (aVar != null) {
                    aVar.a(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.z;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.z.removeGlobalOnLayoutListener(this.k);
                    }
                    this.z = null;
                }
                this.q.removeOnAttachStateChangeListener(this.l);
                this.A.onDismiss();
            } else if (z2) {
                this.j.get(0).f84b.a(false);
            }
        }
    }

    public void a(m.a aVar) {
        this.y = aVar;
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    public boolean a() {
        return this.j.size() > 0 && this.j.get(0).f83a.a();
    }

    public void b(int i2) {
        this.s = true;
        this.u = i2;
    }

    public void b(boolean z2) {
        this.w = z2;
    }

    public boolean b() {
        return false;
    }

    public void c(int i2) {
        this.t = true;
        this.v = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0143, code lost:
        if (((r9.getWidth() + r11[0]) + r4) > r10.right) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0149, code lost:
        if ((r11[0] - r4) < 0) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014d, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(a.b.o.i.g r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.content.Context r2 = r0.c
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            a.b.o.i.f r3 = new a.b.o.i.f
            boolean r4 = r0.g
            int r5 = C
            r3.<init>(r1, r2, r4, r5)
            boolean r4 = r16.a()
            r5 = 1
            if (r4 != 0) goto L_0x0021
            boolean r4 = r0.w
            if (r4 == 0) goto L_0x0021
            r3.d = r5
            goto L_0x002d
        L_0x0021:
            boolean r4 = r16.a()
            if (r4 == 0) goto L_0x002d
            boolean r4 = a.b.o.i.k.b((a.b.o.i.g) r17)
            r3.d = r4
        L_0x002d:
            android.content.Context r4 = r0.c
            int r6 = r0.d
            r7 = 0
            int r4 = a.b.o.i.k.a(r3, r7, r4, r6)
            a.b.p.m0 r6 = new a.b.p.m0
            android.content.Context r8 = r0.c
            int r9 = r0.e
            int r10 = r0.f
            r6.<init>(r8, r7, r9, r10)
            a.b.p.l0 r8 = r0.m
            r6.G = r8
            r6.t = r0
            android.widget.PopupWindow r8 = r6.C
            r8.setOnDismissListener(r0)
            android.view.View r8 = r0.p
            r6.s = r8
            int r8 = r0.o
            r6.m = r8
            r6.a((boolean) r5)
            android.widget.PopupWindow r8 = r6.C
            r9 = 2
            r8.setInputMethodMode(r9)
            r6.a((android.widget.ListAdapter) r3)
            r6.d(r4)
            int r3 = r0.o
            r6.m = r3
            java.util.List<a.b.o.i.d$d> r3 = r0.j
            int r3 = r3.size()
            r8 = 0
            if (r3 <= 0) goto L_0x00e5
            java.util.List<a.b.o.i.d$d> r3 = r0.j
            int r10 = r3.size()
            int r10 = r10 - r5
            java.lang.Object r3 = r3.get(r10)
            a.b.o.i.d$d r3 = (a.b.o.i.d.C0005d) r3
            a.b.o.i.g r10 = r3.f84b
            int r11 = r10.size()
            r12 = r8
        L_0x0084:
            if (r12 >= r11) goto L_0x009a
            android.view.MenuItem r13 = r10.getItem(r12)
            boolean r14 = r13.hasSubMenu()
            if (r14 == 0) goto L_0x0097
            android.view.SubMenu r14 = r13.getSubMenu()
            if (r1 != r14) goto L_0x0097
            goto L_0x009b
        L_0x0097:
            int r12 = r12 + 1
            goto L_0x0084
        L_0x009a:
            r13 = r7
        L_0x009b:
            if (r13 != 0) goto L_0x009e
            goto L_0x00e7
        L_0x009e:
            a.b.p.m0 r10 = r3.f83a
            a.b.p.f0 r10 = r10.d
            android.widget.ListAdapter r11 = r10.getAdapter()
            boolean r12 = r11 instanceof android.widget.HeaderViewListAdapter
            if (r12 == 0) goto L_0x00b7
            android.widget.HeaderViewListAdapter r11 = (android.widget.HeaderViewListAdapter) r11
            int r12 = r11.getHeadersCount()
            android.widget.ListAdapter r11 = r11.getWrappedAdapter()
            a.b.o.i.f r11 = (a.b.o.i.f) r11
            goto L_0x00ba
        L_0x00b7:
            a.b.o.i.f r11 = (a.b.o.i.f) r11
            r12 = r8
        L_0x00ba:
            int r14 = r11.getCount()
            r15 = r8
        L_0x00bf:
            r9 = -1
            if (r15 >= r14) goto L_0x00cd
            a.b.o.i.i r7 = r11.getItem((int) r15)
            if (r13 != r7) goto L_0x00c9
            goto L_0x00ce
        L_0x00c9:
            int r15 = r15 + 1
            r7 = 0
            goto L_0x00bf
        L_0x00cd:
            r15 = r9
        L_0x00ce:
            if (r15 != r9) goto L_0x00d1
            goto L_0x00e6
        L_0x00d1:
            int r15 = r15 + r12
            int r7 = r10.getFirstVisiblePosition()
            int r15 = r15 - r7
            if (r15 < 0) goto L_0x00e6
            int r7 = r10.getChildCount()
            if (r15 < r7) goto L_0x00e0
            goto L_0x00e6
        L_0x00e0:
            android.view.View r7 = r10.getChildAt(r15)
            goto L_0x00e7
        L_0x00e5:
            r3 = 0
        L_0x00e6:
            r7 = 0
        L_0x00e7:
            if (r7 == 0) goto L_0x01b2
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r9 > r10) goto L_0x0109
            java.lang.reflect.Method r9 = a.b.p.m0.H
            if (r9 == 0) goto L_0x010e
            android.widget.PopupWindow r10 = r6.C     // Catch:{ Exception -> 0x0101 }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0101 }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r8)     // Catch:{ Exception -> 0x0101 }
            r11[r8] = r12     // Catch:{ Exception -> 0x0101 }
            r9.invoke(r10, r11)     // Catch:{ Exception -> 0x0101 }
            goto L_0x010e
        L_0x0101:
            java.lang.String r9 = "MenuPopupWindow"
            java.lang.String r10 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r9, r10)
            goto L_0x010e
        L_0x0109:
            android.widget.PopupWindow r9 = r6.C
            r9.setTouchModal(r8)
        L_0x010e:
            android.widget.PopupWindow r9 = r6.C
            r10 = 0
            r9.setEnterTransition(r10)
            java.util.List<a.b.o.i.d$d> r9 = r0.j
            int r10 = r9.size()
            int r10 = r10 - r5
            java.lang.Object r9 = r9.get(r10)
            a.b.o.i.d$d r9 = (a.b.o.i.d.C0005d) r9
            a.b.p.m0 r9 = r9.f83a
            a.b.p.f0 r9 = r9.d
            r10 = 2
            int[] r11 = new int[r10]
            r9.getLocationOnScreen(r11)
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            android.view.View r12 = r0.q
            r12.getWindowVisibleDisplayFrame(r10)
            int r12 = r0.r
            if (r12 != r5) goto L_0x0146
            r11 = r11[r8]
            int r9 = r9.getWidth()
            int r9 = r9 + r11
            int r9 = r9 + r4
            int r10 = r10.right
            if (r9 <= r10) goto L_0x014b
            goto L_0x014d
        L_0x0146:
            r9 = r11[r8]
            int r9 = r9 - r4
            if (r9 >= 0) goto L_0x014d
        L_0x014b:
            r9 = r5
            goto L_0x014e
        L_0x014d:
            r9 = r8
        L_0x014e:
            if (r9 != r5) goto L_0x0152
            r10 = r5
            goto L_0x0153
        L_0x0152:
            r10 = r8
        L_0x0153:
            r0.r = r9
            int r9 = android.os.Build.VERSION.SDK_INT
            r11 = 26
            r12 = 5
            if (r9 < r11) goto L_0x0161
            r6.s = r7
            r9 = r8
            r13 = r9
            goto L_0x0192
        L_0x0161:
            r9 = 2
            int[] r11 = new int[r9]
            android.view.View r13 = r0.p
            r13.getLocationOnScreen(r11)
            int[] r9 = new int[r9]
            r7.getLocationOnScreen(r9)
            int r13 = r0.o
            r13 = r13 & 7
            if (r13 != r12) goto L_0x0188
            r13 = r11[r8]
            android.view.View r14 = r0.p
            int r14 = r14.getWidth()
            int r14 = r14 + r13
            r11[r8] = r14
            r13 = r9[r8]
            int r14 = r7.getWidth()
            int r14 = r14 + r13
            r9[r8] = r14
        L_0x0188:
            r13 = r9[r8]
            r14 = r11[r8]
            int r13 = r13 - r14
            r9 = r9[r5]
            r11 = r11[r5]
            int r9 = r9 - r11
        L_0x0192:
            int r11 = r0.o
            r11 = r11 & r12
            if (r11 != r12) goto L_0x019f
            if (r10 == 0) goto L_0x019a
            goto L_0x01a5
        L_0x019a:
            int r4 = r7.getWidth()
            goto L_0x01a7
        L_0x019f:
            if (r10 == 0) goto L_0x01a7
            int r4 = r7.getWidth()
        L_0x01a5:
            int r13 = r13 + r4
            goto L_0x01a8
        L_0x01a7:
            int r13 = r13 - r4
        L_0x01a8:
            r6.g = r13
            r6.l = r5
            r6.k = r5
            r6.b(r9)
            goto L_0x01d0
        L_0x01b2:
            boolean r4 = r0.s
            if (r4 == 0) goto L_0x01ba
            int r4 = r0.u
            r6.g = r4
        L_0x01ba:
            boolean r4 = r0.t
            if (r4 == 0) goto L_0x01c3
            int r4 = r0.v
            r6.b(r4)
        L_0x01c3:
            android.graphics.Rect r4 = r0.f100b
            if (r4 == 0) goto L_0x01cd
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r4)
            goto L_0x01ce
        L_0x01cd:
            r10 = 0
        L_0x01ce:
            r6.A = r10
        L_0x01d0:
            a.b.o.i.d$d r4 = new a.b.o.i.d$d
            int r5 = r0.r
            r4.<init>(r6, r1, r5)
            java.util.List<a.b.o.i.d$d> r5 = r0.j
            r5.add(r4)
            r6.e()
            a.b.p.f0 r4 = r6.d
            r4.setOnKeyListener(r0)
            if (r3 != 0) goto L_0x020e
            boolean r3 = r0.x
            if (r3 == 0) goto L_0x020e
            java.lang.CharSequence r3 = r1.m
            if (r3 == 0) goto L_0x020e
            int r3 = a.b.g.abc_popup_menu_header_item_layout
            android.view.View r2 = r2.inflate(r3, r4, r8)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.setEnabled(r8)
            java.lang.CharSequence r1 = r1.m
            r3.setText(r1)
            r1 = 0
            r4.addHeaderView(r2, r1, r8)
            r6.e()
        L_0x020e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.o.i.d.c(a.b.o.i.g):void");
    }

    public void c(boolean z2) {
        this.x = z2;
    }

    public boolean c() {
        return false;
    }

    public ListView d() {
        if (this.j.isEmpty()) {
            return null;
        }
        List<C0005d> list = this.j;
        return list.get(list.size() - 1).f83a.d;
    }

    public void dismiss() {
        int size = this.j.size();
        if (size > 0) {
            C0005d[] dVarArr = (C0005d[]) this.j.toArray(new C0005d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0005d dVar = dVarArr[i2];
                if (dVar.f83a.a()) {
                    dVar.f83a.dismiss();
                }
            }
        }
    }

    public void e() {
        if (!a()) {
            for (g c2 : this.i) {
                c(c2);
            }
            this.i.clear();
            View view = this.p;
            this.q = view;
            if (view != null) {
                boolean z2 = this.z == null;
                ViewTreeObserver viewTreeObserver = this.q.getViewTreeObserver();
                this.z = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.k);
                }
                this.q.addOnAttachStateChangeListener(this.l);
            }
        }
    }

    public void onDismiss() {
        C0005d dVar;
        int size = this.j.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dVar = null;
                break;
            }
            dVar = this.j.get(i2);
            if (!dVar.f83a.a()) {
                break;
            }
            i2++;
        }
        if (dVar != null) {
            dVar.f84b.a(false);
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public boolean a(r rVar) {
        for (C0005d next : this.j) {
            if (rVar == next.f84b) {
                next.f83a.d.requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        rVar.a((m) this, this.c);
        if (a()) {
            c((g) rVar);
        } else {
            this.i.add(rVar);
        }
        m.a aVar = this.y;
        if (aVar != null) {
            aVar.a(rVar);
        }
        return true;
    }

    public void a(View view) {
        if (this.p != view) {
            this.p = view;
            this.o = Gravity.getAbsoluteGravity(this.n, k.c(view));
        }
    }

    public void a(int i2) {
        if (this.n != i2) {
            this.n = i2;
            this.o = Gravity.getAbsoluteGravity(i2, k.c(this.p));
        }
    }

    public void a(boolean z2) {
        for (C0005d dVar : this.j) {
            ListAdapter adapter = dVar.f83a.d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((f) adapter).notifyDataSetChanged();
        }
    }
}
