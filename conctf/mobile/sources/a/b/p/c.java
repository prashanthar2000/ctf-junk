package a.b.p;

import a.b.k.o;
import a.b.o.i.g;
import a.b.o.i.i;
import a.b.o.i.k;
import a.b.o.i.l;
import a.b.o.i.m;
import a.b.o.i.n;
import a.b.o.i.p;
import a.b.o.i.r;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

public class c extends a.b.o.i.b {
    public d j;
    public Drawable k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    public final SparseBooleanArray t = new SparseBooleanArray();
    public e u;
    public a v;
    public C0007c w;
    public b x;
    public final f y = new f();
    public int z;

    public class a extends l {
        public a(Context context, r rVar, View view) {
            super(context, rVar, view, false, a.b.a.actionOverflowMenuStyle, 0);
            if (!rVar.B.d()) {
                View view2 = c.this.j;
                this.f = view2 == null ? (View) c.this.i : view2;
            }
            a(c.this.y);
        }

        public void c() {
            c cVar = c.this;
            cVar.v = null;
            cVar.z = 0;
            super.c();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* renamed from: a.b.p.c$c  reason: collision with other inner class name */
    public class C0007c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public e f119b;

        public C0007c(e eVar) {
            this.f119b = eVar;
        }

        public void run() {
            g.a aVar;
            g gVar = c.this.d;
            if (!(gVar == null || (aVar = gVar.e) == null)) {
                aVar.a(gVar);
            }
            View view = (View) c.this.i;
            if (!(view == null || view.getWindowToken() == null || !this.f119b.d())) {
                c.this.u = this.f119b;
            }
            c.this.w = null;
        }
    }

    public class d extends n implements ActionMenuView.a {

        public class a extends h0 {
            public a(View view, c cVar) {
                super(view);
            }

            public p b() {
                e eVar = c.this.u;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            public boolean c() {
                c.this.f();
                return true;
            }

            public boolean d() {
                c cVar = c.this;
                if (cVar.w != null) {
                    return false;
                }
                cVar.c();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, a.b.a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            o.a((View) this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.f();
            return true;
        }

        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class e extends l {
        public e(Context context, g gVar, View view, boolean z) {
            super(context, gVar, view, z, a.b.a.actionOverflowMenuStyle, 0);
            this.g = 8388613;
            a(c.this.y);
        }

        public void c() {
            g gVar = c.this.d;
            if (gVar != null) {
                gVar.a(true);
            }
            c.this.u = null;
            super.c();
        }
    }

    public c(Context context) {
        super(context, a.b.g.abc_action_menu_layout, a.b.g.abc_action_menu_item_layout);
    }

    public View a(i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.c()) {
            actionView = super.a(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.C ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (actionMenuView != null) {
            if (!(layoutParams instanceof ActionMenuView.c)) {
                actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
            }
            return actionView;
        }
        throw null;
    }

    public boolean a() {
        return c() | d();
    }

    public boolean b() {
        int i;
        ArrayList<i> arrayList;
        int i2;
        boolean z2;
        g gVar = this.d;
        View view = null;
        if (gVar != null) {
            arrayList = gVar.d();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i3 = this.q;
        int i4 = this.p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.i;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z2 = true;
            if (i5 >= i) {
                break;
            }
            i iVar = arrayList.get(i5);
            if ((iVar.y & 2) == 2) {
                i7++;
            } else {
                if ((iVar.y & 1) == 1) {
                    i6++;
                } else {
                    z3 = true;
                }
            }
            if (this.r && iVar.C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.m && (z3 || i6 + i7 > i3)) {
            i3--;
        }
        int i8 = i3 - i7;
        SparseBooleanArray sparseBooleanArray = this.t;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < i) {
            i iVar2 = arrayList.get(i9);
            if ((iVar2.y & i2) == i2 ? z2 : false) {
                View a2 = a(iVar2, view, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                int i11 = iVar2.f92b;
                if (i11 != 0) {
                    sparseBooleanArray.put(i11, z2);
                }
                iVar2.b(z2);
            } else {
                if ((iVar2.y & z2) == z2 ? z2 : false) {
                    int i12 = iVar2.f92b;
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i4 > 0) ? z2 : false;
                    if (z5) {
                        View a3 = a(iVar2, view, viewGroup);
                        a3.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = a3.getMeasuredWidth();
                        i4 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i4 + i10 > 0 ? z2 : false;
                    }
                    boolean z6 = z5;
                    if (z6 && i12 != 0) {
                        sparseBooleanArray.put(i12, z2);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            i iVar3 = arrayList.get(i13);
                            if (iVar3.f92b == i12) {
                                if (iVar3.d()) {
                                    i8++;
                                }
                                iVar3.b(false);
                            }
                        }
                    }
                    if (z6) {
                        i8--;
                    }
                    iVar2.b(z6);
                } else {
                    iVar2.b(false);
                    i9++;
                    view = null;
                    i2 = 2;
                    z2 = true;
                }
            }
            i9++;
            view = null;
            i2 = 2;
            z2 = true;
        }
        return z2;
    }

    public boolean c() {
        n nVar;
        C0007c cVar = this.w;
        if (cVar == null || (nVar = this.i) == null) {
            e eVar = this.u;
            if (eVar == null) {
                return false;
            }
            if (eVar.b()) {
                eVar.j.dismiss();
            }
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.w = null;
        return true;
    }

    public boolean d() {
        a aVar = this.v;
        if (aVar == null) {
            return false;
        }
        if (!aVar.b()) {
            return true;
        }
        aVar.j.dismiss();
        return true;
    }

    public boolean e() {
        e eVar = this.u;
        return eVar != null && eVar.b();
    }

    public boolean f() {
        g gVar;
        if (!this.m || e() || (gVar = this.d) == null || this.i == null || this.w != null) {
            return false;
        }
        gVar.a();
        if (gVar.j.isEmpty()) {
            return false;
        }
        C0007c cVar = new C0007c(new e(this.c, this.d, this.j, true));
        this.w = cVar;
        ((View) this.i).post(cVar);
        super.a((r) null);
        return true;
    }

    public class f implements m.a {
        public f() {
        }

        public void a(g gVar, boolean z) {
            if (gVar instanceof r) {
                gVar.c().a(false);
            }
            m.a aVar = c.this.f;
            if (aVar != null) {
                aVar.a(gVar, z);
            }
        }

        public boolean a(g gVar) {
            if (gVar == null) {
                return false;
            }
            c.this.z = ((r) gVar).B.getItemId();
            m.a aVar = c.this.f;
            if (aVar != null) {
                return aVar.a(gVar);
            }
            return false;
        }
    }

    public void a(Context context, g gVar) {
        this.c = context;
        LayoutInflater.from(context);
        this.d = gVar;
        Resources resources = context.getResources();
        if (!this.n) {
            this.m = true;
        }
        int i = 2;
        this.o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.q = i;
        int i4 = this.o;
        if (this.m) {
            if (this.j == null) {
                d dVar = new d(this.f76b);
                this.j = dVar;
                if (this.l) {
                    dVar.setImageDrawable(this.k);
                    this.k = null;
                    this.l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.j.getMeasuredWidth();
        } else {
            this.j = null;
        }
        this.p = i4;
        this.s = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public void a(g gVar, boolean z2) {
        a();
        m.a aVar = this.f;
        if (aVar != null) {
            aVar.a(gVar, z2);
        }
    }

    public boolean a(r rVar) {
        boolean z2 = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        r rVar2 = rVar;
        while (true) {
            g gVar = rVar2.A;
            if (gVar == this.d) {
                break;
            }
            rVar2 = gVar;
        }
        i iVar = rVar2.B;
        ViewGroup viewGroup = (ViewGroup) this.i;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == iVar) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        rVar.B.getItemId();
        int size = rVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        a aVar = new a(this.c, rVar, view);
        this.v = aVar;
        aVar.h = z2;
        k kVar = aVar.j;
        if (kVar != null) {
            kVar.b(z2);
        }
        if (this.v.d()) {
            m.a aVar2 = this.f;
            if (aVar2 != null) {
                aVar2.a(rVar);
            }
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public void a(boolean z2) {
        ArrayList<i> arrayList;
        n nVar;
        super.a(z2);
        ((View) this.i).requestLayout();
        g gVar = this.d;
        boolean z3 = false;
        if (gVar != null) {
            gVar.a();
            ArrayList<i> arrayList2 = gVar.i;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                a.f.k.b bVar = arrayList2.get(i).A;
            }
        }
        g gVar2 = this.d;
        if (gVar2 != null) {
            gVar2.a();
            arrayList = gVar2.j;
        } else {
            arrayList = null;
        }
        if (this.m && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z3 = !arrayList.get(0).C;
            } else if (size2 > 0) {
                z3 = true;
            }
        }
        d dVar = this.j;
        if (z3) {
            if (dVar == null) {
                this.j = new d(this.f76b);
            }
            ViewGroup viewGroup = (ViewGroup) this.j.getParent();
            if (viewGroup != this.i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.i;
                d dVar2 = this.j;
                ActionMenuView.c generateDefaultLayoutParams = actionMenuView.generateDefaultLayoutParams();
                generateDefaultLayoutParams.c = true;
                actionMenuView.addView(dVar2, generateDefaultLayoutParams);
            }
        } else if (dVar != null && dVar.getParent() == (nVar = this.i)) {
            ((ViewGroup) nVar).removeView(this.j);
        }
        ((ActionMenuView) this.i).setOverflowReserved(this.m);
    }
}
