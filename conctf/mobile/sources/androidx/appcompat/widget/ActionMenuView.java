package androidx.appcompat.widget;

import a.b.o.i.g;
import a.b.o.i.i;
import a.b.o.i.m;
import a.b.o.i.n;
import a.b.p.c;
import a.b.p.d1;
import a.b.p.i0;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;

public class ActionMenuView extends i0 implements g.b, n {
    public int A;
    public e B;
    public g q;
    public Context r;
    public int s;
    public boolean t;
    public a.b.p.c u;
    public m.a v;
    public g.a w;
    public boolean x;
    public int y;
    public int z;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements m.a {
        public void a(g gVar, boolean z) {
        }

        public boolean a(g gVar) {
            return false;
        }
    }

    public static class c extends i0.a {
        @ViewDebug.ExportedProperty
        public boolean c;
        @ViewDebug.ExportedProperty
        public int d;
        @ViewDebug.ExportedProperty
        public int e;
        @ViewDebug.ExportedProperty
        public boolean f;
        @ViewDebug.ExportedProperty
        public boolean g;
        public boolean h;

        public c(int i, int i2) {
            super(i, i2);
            this.c = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.c = cVar.c;
        }
    }

    public class d implements g.a {
        public d() {
        }

        public void a(g gVar) {
            g.a aVar = ActionMenuView.this.w;
            if (aVar != null) {
                aVar.a(gVar);
            }
        }

        public boolean a(g gVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.B;
            if (eVar == null) {
                return false;
            }
            Toolbar.f fVar = Toolbar.this.H;
            return fVar != null ? fVar.onMenuItemClick(menuItem) : false;
        }
    }

    public interface e {
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.z = (int) (56.0f * f);
        this.A = (int) (f * 4.0f);
        this.r = context;
        this.s = 0;
    }

    public static int a(View view, int i, int i2, int i3, int i4) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = true;
        boolean z3 = actionMenuItemView != null && actionMenuItemView.e();
        int i5 = 2;
        if (i2 <= 0 || (z3 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z3 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.c || !z3) {
            z2 = false;
        }
        cVar.f = z2;
        cVar.d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    public void a(g gVar) {
        this.q = gVar;
    }

    public boolean a(i iVar) {
        return this.q.a((MenuItem) iVar, (m) null, 0);
    }

    public boolean b(int i) {
        boolean z2 = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            z2 = false | ((a) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof a)) ? z2 : z2 | ((a) childAt2).a();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        cVar.f139b = 16;
        return cVar;
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public ViewGroup.LayoutParams m5generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.f139b <= 0) {
            cVar.f139b = 16;
        }
        return cVar;
    }

    public Menu getMenu() {
        if (this.q == null) {
            Context context = getContext();
            g gVar = new g(context);
            this.q = gVar;
            gVar.e = new d();
            a.b.p.c cVar = new a.b.p.c(context);
            this.u = cVar;
            cVar.m = true;
            cVar.n = true;
            m.a aVar = this.v;
            if (aVar == null) {
                aVar = new b();
            }
            cVar.f = aVar;
            this.q.a((m) this.u, this.r);
            a.b.p.c cVar2 = this.u;
            cVar2.i = this;
            this.q = cVar2.d;
        }
        return this.q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        a.b.p.c cVar = this.u;
        c.d dVar = cVar.j;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (cVar.l) {
            return cVar.k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a.b.p.c cVar = this.u;
        if (cVar != null) {
            cVar.a(false);
            if (this.u.e()) {
                this.u.c();
                this.u.f();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a.b.p.c cVar = this.u;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.x) {
            super.onLayout(z2, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = d1.a(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (b(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i5 = getPaddingLeft() + cVar.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    boolean b2 = b(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (a2) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.c) {
                    int i17 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.c) {
                int i20 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + cVar3.rightMargin + max + i20;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        g gVar;
        boolean z5 = this.x;
        boolean z6 = View.MeasureSpec.getMode(i) == 1073741824;
        this.x = z6;
        if (z5 != z6) {
            this.y = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.x || (gVar = this.q) == null || size == this.y)) {
            this.y = size;
            gVar.b(true);
        }
        int childCount = getChildCount();
        if (!this.x || childCount <= 0) {
            int i7 = i2;
            for (int i8 = 0; i8 < childCount; i8++) {
                c cVar = (c) getChildAt(i8).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i9 = size2 - paddingRight;
        int i10 = this.z;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = (i12 / i11) + i10;
        int childCount2 = getChildCount();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z7 = false;
        long j = 0;
        while (i18 < childCount2) {
            View childAt = getChildAt(i18);
            int i19 = size3;
            int i20 = i9;
            if (childAt.getVisibility() != 8) {
                boolean z8 = childAt instanceof ActionMenuItemView;
                int i21 = i14 + 1;
                if (z8) {
                    int i22 = this.A;
                    i6 = i21;
                    z4 = false;
                    childAt.setPadding(i22, 0, i22, 0);
                } else {
                    i6 = i21;
                    z4 = false;
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.h = z4;
                cVar2.e = z4 ? 1 : 0;
                cVar2.d = z4;
                cVar2.f = z4;
                cVar2.leftMargin = z4;
                cVar2.rightMargin = z4;
                cVar2.g = z8 && ((ActionMenuItemView) childAt).e();
                int a2 = a(childAt, i13, cVar2.c ? 1 : i11, childMeasureSpec, paddingBottom);
                i16 = Math.max(i16, a2);
                if (cVar2.f) {
                    i17++;
                }
                if (cVar2.c) {
                    z7 = true;
                }
                i11 -= a2;
                i15 = Math.max(i15, childAt.getMeasuredHeight());
                if (a2 == 1) {
                    j |= (long) (1 << i18);
                }
                i14 = i6;
            }
            i18++;
            size3 = i19;
            i9 = i20;
        }
        int i23 = i9;
        int i24 = size3;
        boolean z9 = z7 && i14 == 2;
        boolean z10 = false;
        while (true) {
            if (i17 <= 0 || i11 <= 0) {
                i3 = i15;
                z2 = z10;
            } else {
                int i25 = Integer.MAX_VALUE;
                int i26 = 0;
                int i27 = 0;
                long j2 = 0;
                while (i26 < childCount2) {
                    int i28 = i15;
                    c cVar3 = (c) getChildAt(i26).getLayoutParams();
                    boolean z11 = z10;
                    if (cVar3.f) {
                        int i29 = cVar3.d;
                        if (i29 < i25) {
                            j2 = 1 << i26;
                            i25 = i29;
                            i27 = 1;
                        } else if (i29 == i25) {
                            i27++;
                            j2 |= 1 << i26;
                        }
                    }
                    i26++;
                    z10 = z11;
                    i15 = i28;
                }
                i3 = i15;
                z2 = z10;
                j |= j2;
                if (i27 > i11) {
                    break;
                }
                int i30 = i25 + 1;
                int i31 = 0;
                while (i31 < childCount2) {
                    View childAt2 = getChildAt(i31);
                    c cVar4 = (c) childAt2.getLayoutParams();
                    int i32 = i17;
                    long j3 = (long) (1 << i31);
                    if ((j2 & j3) == 0) {
                        if (cVar4.d == i30) {
                            j |= j3;
                        }
                        z3 = z9;
                    } else {
                        if (!z9 || !cVar4.g || i11 != 1) {
                            z3 = z9;
                        } else {
                            int i33 = this.A;
                            z3 = z9;
                            childAt2.setPadding(i33 + i13, 0, i33, 0);
                        }
                        cVar4.d++;
                        cVar4.h = true;
                        i11--;
                    }
                    i31++;
                    i17 = i32;
                    z9 = z3;
                }
                i15 = i3;
                z10 = true;
            }
        }
        i3 = i15;
        z2 = z10;
        boolean z12 = !z7 && i14 == 1;
        if (i11 > 0 && j != 0 && (i11 < i14 - 1 || z12 || i16 > 1)) {
            float bitCount = (float) Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).g) {
                    bitCount -= 0.5f;
                }
                int i34 = childCount2 - 1;
                if ((j & ((long) (1 << i34))) != 0 && !((c) getChildAt(i34).getLayoutParams()).g) {
                    bitCount -= 0.5f;
                }
            }
            int i35 = bitCount > 0.0f ? (int) (((float) (i11 * i13)) / bitCount) : 0;
            for (int i36 = 0; i36 < childCount2; i36++) {
                if ((j & ((long) (1 << i36))) != 0) {
                    View childAt3 = getChildAt(i36);
                    c cVar5 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar5.e = i35;
                        cVar5.h = true;
                        if (i36 == 0 && !cVar5.g) {
                            cVar5.leftMargin = (-i35) / 2;
                        }
                        z2 = true;
                    } else if (cVar5.c) {
                        cVar5.e = i35;
                        cVar5.h = true;
                        cVar5.rightMargin = (-i35) / 2;
                        z2 = true;
                    } else {
                        if (i36 != 0) {
                            cVar5.leftMargin = i35 / 2;
                        }
                        if (i36 != childCount2 - 1) {
                            cVar5.rightMargin = i35 / 2;
                        }
                    }
                }
            }
        }
        if (z2) {
            for (int i37 = 0; i37 < childCount2; i37++) {
                View childAt4 = getChildAt(i37);
                c cVar6 = (c) childAt4.getLayoutParams();
                if (cVar6.h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar6.d * i13) + cVar6.e, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i5 = i23;
            i4 = i3;
        } else {
            i4 = i24;
            i5 = i23;
        }
        setMeasuredDimension(i5, i4);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.u.r = z2;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.B = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        a.b.p.c cVar = this.u;
        c.d dVar = cVar.j;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        cVar.l = true;
        cVar.k = drawable;
    }

    public void setOverflowReserved(boolean z2) {
        this.t = z2;
    }

    public void setPopupTheme(int i) {
        if (this.s != i) {
            this.s = i;
            if (i == 0) {
                this.r = getContext();
            } else {
                this.r = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(a.b.p.c cVar) {
        this.u = cVar;
        cVar.i = this;
        this.q = cVar.d;
    }

    public i0.a generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}
