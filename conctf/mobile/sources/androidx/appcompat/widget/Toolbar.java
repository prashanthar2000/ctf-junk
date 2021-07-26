package androidx.appcompat.widget;

import a.b.j;
import a.b.k.a;
import a.b.o.i.i;
import a.b.o.i.m;
import a.b.o.i.r;
import a.b.p.d0;
import a.b.p.d1;
import a.b.p.l;
import a.b.p.n;
import a.b.p.p0;
import a.b.p.x0;
import a.b.p.z;
import a.b.p.z0;
import a.f.k.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public ColorStateList B;
    public boolean C;
    public boolean D;
    public final ArrayList<View> E;
    public final ArrayList<View> F;
    public final int[] G;
    public f H;
    public final ActionMenuView.e I;
    public z0 J;
    public a.b.p.c K;
    public d L;
    public boolean M;
    public final Runnable N;

    /* renamed from: b  reason: collision with root package name */
    public ActionMenuView f496b;
    public TextView c;
    public TextView d;
    public ImageButton e;
    public ImageView f;
    public Drawable g;
    public CharSequence h;
    public ImageButton i;
    public View j;
    public Context k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public p0 u;
    public int v;
    public int w;
    public int x;
    public CharSequence y;
    public CharSequence z;

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            Toolbar.this.g();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            d dVar = Toolbar.this.L;
            i iVar = dVar == null ? null : dVar.c;
            if (iVar != null) {
                iVar.collapseActionView();
            }
        }
    }

    public class d implements m {

        /* renamed from: b  reason: collision with root package name */
        public a.b.o.i.g f500b;
        public i c;

        public d() {
        }

        public void a(a.b.o.i.g gVar, boolean z) {
        }

        public void a(m.a aVar) {
        }

        public void a(Context context, a.b.o.i.g gVar) {
            i iVar;
            a.b.o.i.g gVar2 = this.f500b;
            if (!(gVar2 == null || (iVar = this.c) == null)) {
                gVar2.a(iVar);
            }
            this.f500b = gVar;
        }

        public void a(boolean z) {
            if (this.c != null) {
                a.b.o.i.g gVar = this.f500b;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f500b.getItem(i) == this.c) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    b(this.f500b, this.c);
                }
            }
        }

        public boolean a(a.b.o.i.g gVar, i iVar) {
            Toolbar.this.a();
            ViewParent parent = Toolbar.this.i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.i);
            }
            Toolbar.this.j = iVar.getActionView();
            this.c = iVar;
            ViewParent parent2 = Toolbar.this.j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.j);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f2a = 8388611 | (toolbar4.o & j.AppCompatTheme_tooltipForegroundColor);
                generateDefaultLayoutParams.f501b = 2;
                toolbar4.j.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.j);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (!(((e) childAt.getLayoutParams()).f501b == 2 || childAt == toolbar6.f496b)) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.F.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            iVar.C = true;
            iVar.n.b(false);
            View view = Toolbar.this.j;
            if (view instanceof a.b.o.b) {
                ((a.b.o.b) view).a();
            }
            return true;
        }

        public boolean a(r rVar) {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean b(a.b.o.i.g gVar, i iVar) {
            View view = Toolbar.this.j;
            if (view instanceof a.b.o.b) {
                ((a.b.o.b) view).b();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.j = null;
            int size = toolbar3.F.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView(toolbar3.F.get(size));
                } else {
                    toolbar3.F.clear();
                    this.c = null;
                    Toolbar.this.requestLayout();
                    iVar.C = false;
                    iVar.n.b(false);
                    return true;
                }
            }
        }
    }

    public static class e extends a.C0000a {

        /* renamed from: b  reason: collision with root package name */
        public int f501b = 0;

        public e(int i, int i2) {
            super(i, i2);
            this.f2a = 8388627;
        }

        public e(a.C0000a aVar) {
            super(aVar);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(e eVar) {
            super((a.C0000a) eVar);
            this.f501b = eVar.f501b;
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class g extends a.h.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public int d;
        public boolean e;

        public static class a implements Parcelable.ClassLoaderCreator<g> {
            public Object createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new g[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readInt();
            this.e = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f354b, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b.a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.I = new a();
        this.N = new b();
        x0 a2 = x0.a(getContext(), attributeSet, j.Toolbar, i2, 0);
        this.m = a2.e(j.Toolbar_titleTextAppearance, 0);
        this.n = a2.e(j.Toolbar_subtitleTextAppearance, 0);
        this.x = a2.f186b.getInteger(j.Toolbar_android_gravity, this.x);
        this.o = a2.f186b.getInteger(j.Toolbar_buttonGravity, 48);
        int a3 = a2.a(j.Toolbar_titleMargin, 0);
        a3 = a2.f(j.Toolbar_titleMargins) ? a2.a(j.Toolbar_titleMargins, a3) : a3;
        this.t = a3;
        this.s = a3;
        this.r = a3;
        this.q = a3;
        int a4 = a2.a(j.Toolbar_titleMarginStart, -1);
        if (a4 >= 0) {
            this.q = a4;
        }
        int a5 = a2.a(j.Toolbar_titleMarginEnd, -1);
        if (a5 >= 0) {
            this.r = a5;
        }
        int a6 = a2.a(j.Toolbar_titleMarginTop, -1);
        if (a6 >= 0) {
            this.s = a6;
        }
        int a7 = a2.a(j.Toolbar_titleMarginBottom, -1);
        if (a7 >= 0) {
            this.t = a7;
        }
        this.p = a2.b(j.Toolbar_maxButtonHeight, -1);
        int a8 = a2.a(j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int a9 = a2.a(j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int b2 = a2.b(j.Toolbar_contentInsetLeft, 0);
        int b3 = a2.b(j.Toolbar_contentInsetRight, 0);
        b();
        p0 p0Var = this.u;
        p0Var.h = false;
        if (b2 != Integer.MIN_VALUE) {
            p0Var.e = b2;
            p0Var.f159a = b2;
        }
        if (b3 != Integer.MIN_VALUE) {
            p0Var.f = b3;
            p0Var.f160b = b3;
        }
        if (!(a8 == Integer.MIN_VALUE && a9 == Integer.MIN_VALUE)) {
            this.u.a(a8, a9);
        }
        this.v = a2.a(j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.w = a2.a(j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.g = a2.b(j.Toolbar_collapseIcon);
        this.h = a2.e(j.Toolbar_collapseContentDescription);
        CharSequence e2 = a2.e(j.Toolbar_title);
        if (!TextUtils.isEmpty(e2)) {
            setTitle(e2);
        }
        CharSequence e3 = a2.e(j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(e3)) {
            setSubtitle(e3);
        }
        this.k = getContext();
        setPopupTheme(a2.e(j.Toolbar_popupTheme, 0));
        Drawable b4 = a2.b(j.Toolbar_navigationIcon);
        if (b4 != null) {
            setNavigationIcon(b4);
        }
        CharSequence e4 = a2.e(j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(e4)) {
            setNavigationContentDescription(e4);
        }
        Drawable b5 = a2.b(j.Toolbar_logo);
        if (b5 != null) {
            setLogo(b5);
        }
        CharSequence e5 = a2.e(j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(e5)) {
            setLogoDescription(e5);
        }
        if (a2.f(j.Toolbar_titleTextColor)) {
            setTitleTextColor(a2.a(j.Toolbar_titleTextColor));
        }
        if (a2.f(j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a2.a(j.Toolbar_subtitleTextColor));
        }
        if (a2.f(j.Toolbar_menu)) {
            getMenuInflater().inflate(a2.e(j.Toolbar_menu, 0), getMenu());
        }
        a2.f186b.recycle();
    }

    private MenuInflater getMenuInflater() {
        return new a.b.o.f(getContext());
    }

    public final int a(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final int a(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.leftMargin - iArr[0];
        int max = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a2, max + measuredWidth, view.getMeasuredHeight() + a2);
        return measuredWidth + eVar.rightMargin + max;
    }

    public void a() {
        if (this.i == null) {
            l lVar = new l(getContext(), (AttributeSet) null, a.b.a.toolbarNavigationButtonStyle);
            this.i = lVar;
            lVar.setImageDrawable(this.g);
            this.i.setContentDescription(this.h);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2a = 8388611 | (this.o & j.AppCompatTheme_tooltipForegroundColor);
            generateDefaultLayoutParams.f501b = 2;
            this.i.setLayoutParams(generateDefaultLayoutParams);
            this.i.setOnClickListener(new c());
        }
    }

    public final void a(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void a(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        generateDefaultLayoutParams.f501b = 1;
        if (!z2 || this.j == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.F.add(view);
    }

    public final void a(List<View> list, int i2) {
        boolean z2 = k.c(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        list.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f501b == 0 && d(childAt) && a(eVar.f2a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f501b == 0 && d(childAt2) && a(eVar2.f2a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    public final int b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int b(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a2, max, view.getMeasuredHeight() + a2);
        return max - (measuredWidth + eVar.leftMargin);
    }

    public final void b() {
        if (this.u == null) {
            this.u = new p0();
        }
    }

    public final void c() {
        d();
        ActionMenuView actionMenuView = this.f496b;
        if (actionMenuView.q == null) {
            a.b.o.i.g gVar = (a.b.o.i.g) actionMenuView.getMenu();
            if (this.L == null) {
                this.L = new d();
            }
            this.f496b.setExpandedActionViewsExclusive(true);
            gVar.a((m) this.L, this.k);
        }
    }

    public final boolean c(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public final void d() {
        if (this.f496b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f496b = actionMenuView;
            actionMenuView.setPopupTheme(this.l);
            this.f496b.setOnMenuItemClickListener(this.I);
            ActionMenuView actionMenuView2 = this.f496b;
            actionMenuView2.v = null;
            actionMenuView2.w = null;
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2a = 8388613 | (this.o & j.AppCompatTheme_tooltipForegroundColor);
            this.f496b.setLayoutParams(generateDefaultLayoutParams);
            a((View) this.f496b, false);
        }
    }

    public final boolean d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void e() {
        if (this.e == null) {
            this.e = new l(getContext(), (AttributeSet) null, a.b.a.toolbarNavigationButtonStyle);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2a = 8388611 | (this.o & j.AppCompatTheme_tooltipForegroundColor);
            this.e.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    public boolean f() {
        ActionMenuView actionMenuView = this.f496b;
        if (actionMenuView != null) {
            a.b.p.c cVar = actionMenuView.u;
            if (cVar != null && cVar.e()) {
                return true;
            }
        }
        return false;
    }

    public boolean g() {
        ActionMenuView actionMenuView = this.f496b;
        if (actionMenuView != null) {
            a.b.p.c cVar = actionMenuView.u;
            if (cVar != null && cVar.f()) {
                return true;
            }
        }
        return false;
    }

    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0000a ? new e((a.C0000a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.g ? p0Var.f159a : p0Var.f160b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.w;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.f159a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.f160b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.g ? p0Var.f160b : p0Var.f159a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f496b
            r1 = 0
            if (r0 == 0) goto L_0x0011
            a.b.o.i.g r0 = r0.q
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0023
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.w
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0027
        L_0x0023:
            int r0 = r3.getContentInsetEnd()
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return k.c(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return k.c(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        c();
        return this.f496b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public a.b.p.c getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        c();
        return this.f496b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.k;
    }

    public int getPopupTheme() {
        return this.l;
    }

    public CharSequence getSubtitle() {
        return this.z;
    }

    public final TextView getSubtitleTextView() {
        return this.d;
    }

    public CharSequence getTitle() {
        return this.y;
    }

    public int getTitleMarginBottom() {
        return this.t;
    }

    public int getTitleMarginEnd() {
        return this.r;
    }

    public int getTitleMarginStart() {
        return this.q;
    }

    public int getTitleMarginTop() {
        return this.s;
    }

    public final TextView getTitleTextView() {
        return this.c;
    }

    public d0 getWrapper() {
        if (this.J == null) {
            this.J = new z0(this, true);
        }
        return this.J;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.N);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0295 A[LOOP:0: B:106:0x0293->B:107:0x0295, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b7 A[LOOP:1: B:109:0x02b5->B:110:0x02b7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02dc A[LOOP:2: B:112:0x02da->B:113:0x02dc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0331 A[LOOP:3: B:120:0x032f->B:121:0x0331, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x021b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r21, int r22, int r23, int r24, int r25) {
        /*
            r20 = this;
            r0 = r20
            int r1 = a.f.k.k.c(r20)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = r2
            goto L_0x000d
        L_0x000c:
            r1 = r3
        L_0x000d:
            int r4 = r20.getWidth()
            int r5 = r20.getHeight()
            int r6 = r20.getPaddingLeft()
            int r7 = r20.getPaddingRight()
            int r8 = r20.getPaddingTop()
            int r9 = r20.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.G
            r11[r2] = r3
            r11[r3] = r3
            int r12 = r20.getMinimumHeight()
            if (r12 < 0) goto L_0x003a
            int r13 = r25 - r23
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = r3
        L_0x003b:
            android.widget.ImageButton r13 = r0.e
            boolean r13 = r0.d(r13)
            if (r13 == 0) goto L_0x0053
            android.widget.ImageButton r13 = r0.e
            if (r1 == 0) goto L_0x004e
            int r13 = r0.b(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0055
        L_0x004e:
            int r13 = r0.a(r13, r6, r11, r12)
            goto L_0x0054
        L_0x0053:
            r13 = r6
        L_0x0054:
            r14 = r10
        L_0x0055:
            android.widget.ImageButton r15 = r0.i
            boolean r15 = r0.d(r15)
            if (r15 == 0) goto L_0x006a
            android.widget.ImageButton r15 = r0.i
            if (r1 == 0) goto L_0x0066
            int r14 = r0.b(r15, r14, r11, r12)
            goto L_0x006a
        L_0x0066:
            int r13 = r0.a(r15, r13, r11, r12)
        L_0x006a:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f496b
            boolean r15 = r0.d(r15)
            if (r15 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f496b
            if (r1 == 0) goto L_0x007b
            int r13 = r0.a(r15, r13, r11, r12)
            goto L_0x007f
        L_0x007b:
            int r14 = r0.b(r15, r14, r11, r12)
        L_0x007f:
            int r15 = r20.getCurrentContentInsetLeft()
            int r16 = r20.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.j
            boolean r13 = r0.d(r13)
            if (r13 == 0) goto L_0x00ba
            android.view.View r13 = r0.j
            if (r1 == 0) goto L_0x00b6
            int r10 = r0.b(r13, r10, r11, r12)
            goto L_0x00ba
        L_0x00b6:
            int r2 = r0.a(r13, r2, r11, r12)
        L_0x00ba:
            android.widget.ImageView r13 = r0.f
            boolean r13 = r0.d(r13)
            if (r13 == 0) goto L_0x00cf
            android.widget.ImageView r13 = r0.f
            if (r1 == 0) goto L_0x00cb
            int r10 = r0.b(r13, r10, r11, r12)
            goto L_0x00cf
        L_0x00cb:
            int r2 = r0.a(r13, r2, r11, r12)
        L_0x00cf:
            android.widget.TextView r13 = r0.c
            boolean r13 = r0.d(r13)
            android.widget.TextView r14 = r0.d
            boolean r14 = r0.d(r14)
            if (r13 == 0) goto L_0x00f6
            android.widget.TextView r15 = r0.c
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.e) r15
            int r3 = r15.topMargin
            r24 = r7
            android.widget.TextView r7 = r0.c
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r3
            int r3 = r15.bottomMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            goto L_0x00f9
        L_0x00f6:
            r24 = r7
            r7 = 0
        L_0x00f9:
            if (r14 == 0) goto L_0x0113
            android.widget.TextView r3 = r0.d
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            int r15 = r3.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.d
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r3 = r3.bottomMargin
            int r4 = r4 + r3
            int r7 = r7 + r4
            goto L_0x0115
        L_0x0113:
            r16 = r4
        L_0x0115:
            if (r13 != 0) goto L_0x0120
            if (r14 == 0) goto L_0x011a
            goto L_0x0120
        L_0x011a:
            r18 = r6
            r23 = r12
            goto L_0x0285
        L_0x0120:
            if (r13 == 0) goto L_0x0125
            android.widget.TextView r3 = r0.c
            goto L_0x0127
        L_0x0125:
            android.widget.TextView r3 = r0.d
        L_0x0127:
            if (r14 == 0) goto L_0x012c
            android.widget.TextView r4 = r0.d
            goto L_0x012e
        L_0x012c:
            android.widget.TextView r4 = r0.c
        L_0x012e:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.e) r4
            if (r13 == 0) goto L_0x0144
            android.widget.TextView r15 = r0.c
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x014e
        L_0x0144:
            if (r14 == 0) goto L_0x0151
            android.widget.TextView r15 = r0.d
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0151
        L_0x014e:
            r17 = 1
            goto L_0x0153
        L_0x0151:
            r17 = 0
        L_0x0153:
            int r15 = r0.x
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x019b
            r6 = 80
            if (r15 == r6) goto L_0x018d
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r15 = r3.topMargin
            r23 = r12
            int r12 = r0.s
            r25 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0176
            int r6 = r15 + r12
            goto L_0x018b
        L_0x0176:
            int r5 = r5 - r9
            int r5 = r5 - r7
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r3.bottomMargin
            int r3 = r0.t
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x018b
            int r2 = r4.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x018b:
            int r8 = r8 + r6
            goto L_0x01aa
        L_0x018d:
            r25 = r2
            r23 = r12
            int r5 = r5 - r9
            int r2 = r4.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.t
            int r5 = r5 - r2
            int r8 = r5 - r7
            goto L_0x01aa
        L_0x019b:
            r25 = r2
            r23 = r12
            int r2 = r20.getPaddingTop()
            int r3 = r3.topMargin
            int r2 = r2 + r3
            int r3 = r0.s
            int r8 = r2 + r3
        L_0x01aa:
            if (r1 == 0) goto L_0x021b
            if (r17 == 0) goto L_0x01b1
            int r1 = r0.q
            goto L_0x01b2
        L_0x01b1:
            r1 = 0
        L_0x01b2:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01e9
            android.widget.TextView r1 = r0.c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r2 = r0.c
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.c
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.r
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01ea
        L_0x01e9:
            r2 = r10
        L_0x01ea:
            if (r14 == 0) goto L_0x0210
            android.widget.TextView r1 = r0.d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.d
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.d
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.d
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.r
            int r1 = r10 - r1
            goto L_0x0211
        L_0x0210:
            r1 = r10
        L_0x0211:
            if (r17 == 0) goto L_0x0218
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0218:
            r2 = r25
            goto L_0x0285
        L_0x021b:
            if (r17 == 0) goto L_0x0220
            int r1 = r0.q
            goto L_0x0221
        L_0x0220:
            r1 = 0
        L_0x0221:
            r2 = 0
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r25
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x0257
            android.widget.TextView r1 = r0.c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r2 = r0.c
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            android.widget.TextView r4 = r0.c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.c
            r5.layout(r3, r8, r2, r4)
            int r5 = r0.r
            int r2 = r2 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x0258
        L_0x0257:
            r2 = r3
        L_0x0258:
            if (r14 == 0) goto L_0x027c
            android.widget.TextView r1 = r0.d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.d
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            android.widget.TextView r4 = r0.d
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.d
            r5.layout(r3, r8, r1, r4)
            int r4 = r0.r
            int r1 = r1 + r4
            goto L_0x027d
        L_0x027c:
            r1 = r3
        L_0x027d:
            if (r17 == 0) goto L_0x0284
            int r2 = java.lang.Math.max(r2, r1)
            goto L_0x0285
        L_0x0284:
            r2 = r3
        L_0x0285:
            java.util.ArrayList<android.view.View> r1 = r0.E
            r3 = 3
            r0.a((java.util.List<android.view.View>) r1, (int) r3)
            java.util.ArrayList<android.view.View> r1 = r0.E
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x0293:
            if (r2 >= r1) goto L_0x02a6
            java.util.ArrayList<android.view.View> r4 = r0.E
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r23
            int r3 = r0.a(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x0293
        L_0x02a6:
            r12 = r23
            java.util.ArrayList<android.view.View> r1 = r0.E
            r2 = 5
            r0.a((java.util.List<android.view.View>) r1, (int) r2)
            java.util.ArrayList<android.view.View> r1 = r0.E
            int r1 = r1.size()
            r2 = 0
        L_0x02b5:
            if (r2 >= r1) goto L_0x02c6
            java.util.ArrayList<android.view.View> r4 = r0.E
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.b(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02b5
        L_0x02c6:
            java.util.ArrayList<android.view.View> r1 = r0.E
            r2 = 1
            r0.a((java.util.List<android.view.View>) r1, (int) r2)
            java.util.ArrayList<android.view.View> r1 = r0.E
            r4 = 0
            r5 = r11[r4]
            r2 = r11[r2]
            int r4 = r1.size()
            r7 = r5
            r5 = 0
            r6 = 0
        L_0x02da:
            if (r5 >= r4) goto L_0x030d
            java.lang.Object r8 = r1.get(r5)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r9 = (androidx.appcompat.widget.Toolbar.e) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r2
            r2 = 0
            int r9 = java.lang.Math.max(r2, r13)
            int r14 = java.lang.Math.max(r2, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r2, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r2, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r6 = r6 + r8
            int r5 = r5 + 1
            r2 = r7
            r7 = r13
            goto L_0x02da
        L_0x030d:
            r2 = 0
            int r4 = r16 - r18
            int r4 = r4 - r24
            int r4 = r4 / 2
            int r4 = r4 + r18
            int r1 = r6 / 2
            int r4 = r4 - r1
            int r6 = r6 + r4
            if (r4 >= r3) goto L_0x031d
            goto L_0x0324
        L_0x031d:
            if (r6 <= r10) goto L_0x0323
            int r6 = r6 - r10
            int r3 = r4 - r6
            goto L_0x0324
        L_0x0323:
            r3 = r4
        L_0x0324:
            java.util.ArrayList<android.view.View> r1 = r0.E
            int r1 = r1.size()
            r19 = r3
            r3 = r2
            r2 = r19
        L_0x032f:
            if (r3 >= r1) goto L_0x0340
            java.util.ArrayList<android.view.View> r4 = r0.E
            java.lang.Object r4 = r4.get(r3)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.a(r4, r2, r11, r12)
            int r3 = r3 + 1
            goto L_0x032f
        L_0x0340:
            java.util.ArrayList<android.view.View> r1 = r0.E
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.G;
        boolean z2 = true;
        int i11 = 0;
        if (d1.a(this)) {
            c3 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c3 = 0;
        }
        if (d(this.e)) {
            a((View) this.e, i2, 0, i3, 0, this.p);
            i6 = a((View) this.e) + this.e.getMeasuredWidth();
            i5 = Math.max(0, b(this.e) + this.e.getMeasuredHeight());
            i4 = View.combineMeasuredStates(0, this.e.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (d(this.i)) {
            a((View) this.i, i2, 0, i3, 0, this.p);
            i6 = a((View) this.i) + this.i.getMeasuredWidth();
            i5 = Math.max(i5, b(this.i) + this.i.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i6) + 0;
        iArr[c3] = Math.max(0, currentContentInsetStart - i6);
        if (d(this.f496b)) {
            a((View) this.f496b, i2, max, i3, 0, this.p);
            i7 = a((View) this.f496b) + this.f496b.getMeasuredWidth();
            i5 = Math.max(i5, b(this.f496b) + this.f496b.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f496b.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = Math.max(currentContentInsetEnd, i7) + max;
        iArr[c2] = Math.max(0, currentContentInsetEnd - i7);
        if (d(this.j)) {
            max2 += a(this.j, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, b(this.j) + this.j.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.j.getMeasuredState());
        }
        if (d(this.f)) {
            max2 += a((View) this.f, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, b(this.f) + this.f.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((e) childAt.getLayoutParams()).f501b == 0 && d(childAt)) {
                View view = childAt;
                max2 += a(childAt, i2, max2, i3, 0, iArr);
                View view2 = view;
                i5 = Math.max(i5, b(view2) + view.getMeasuredHeight());
                i4 = View.combineMeasuredStates(i4, view2.getMeasuredState());
            }
        }
        int i13 = this.s + this.t;
        int i14 = this.q + this.r;
        if (d(this.c)) {
            a((View) this.c, i2, max2 + i14, i3, i13, iArr);
            int a2 = a((View) this.c) + this.c.getMeasuredWidth();
            i8 = b(this.c) + this.c.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i4, this.c.getMeasuredState());
            i9 = a2;
        } else {
            i8 = 0;
            i10 = i4;
            i9 = 0;
        }
        if (d(this.d)) {
            i9 = Math.max(i9, a((View) this.d, i2, max2 + i14, i3, i8 + i13, iArr));
            i8 = b(this.d) + this.d.getMeasuredHeight() + i8;
            i10 = View.combineMeasuredStates(i10, this.d.getMeasuredState());
        } else {
            int i15 = i10;
        }
        int max3 = Math.max(i5, i8);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max2 + i9, getSuggestedMinimumWidth()), i2, -16777216 & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, i10 << 16);
        if (this.M) {
            int childCount2 = getChildCount();
            int i16 = 0;
            while (true) {
                if (i16 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i16);
                if (d(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i16++;
            }
        }
        z2 = false;
        if (!z2) {
            i11 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f354b);
        ActionMenuView actionMenuView = this.f496b;
        a.b.o.i.g gVar2 = actionMenuView != null ? actionMenuView.q : null;
        int i2 = gVar.d;
        if (!(i2 == 0 || this.L == null || gVar2 == null || (findItem = gVar2.findItem(i2)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.e) {
            removeCallbacks(this.N);
            post(this.N);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            r2.b()
            a.b.p.p0 r0 = r2.u
            r1 = 1
            if (r3 != r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            boolean r3 = r0.g
            if (r1 != r3) goto L_0x0012
            goto L_0x0040
        L_0x0012:
            r0.g = r1
            boolean r3 = r0.h
            if (r3 == 0) goto L_0x0038
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x002a
            int r1 = r0.d
            if (r1 == r3) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            int r1 = r0.e
        L_0x0023:
            r0.f159a = r1
            int r1 = r0.c
            if (r1 == r3) goto L_0x003c
            goto L_0x003e
        L_0x002a:
            int r1 = r0.c
            if (r1 == r3) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            int r1 = r0.e
        L_0x0031:
            r0.f159a = r1
            int r1 = r0.d
            if (r1 == r3) goto L_0x003c
            goto L_0x003e
        L_0x0038:
            int r3 = r0.e
            r0.f159a = r3
        L_0x003c:
            int r1 = r0.f
        L_0x003e:
            r0.f160b = r1
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    public Parcelable onSaveInstanceState() {
        i iVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.L;
        if (!(dVar == null || (iVar = dVar.c) == null)) {
            gVar.d = iVar.f91a;
        }
        gVar.e = f();
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            a();
        }
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(a.b.l.a.a.b(getContext(), i2));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            a();
            this.i.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.g);
        }
    }

    public void setCollapsible(boolean z2) {
        this.M = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.w) {
            this.w = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.v) {
            this.v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(a.b.l.a.a.b(getContext(), i2));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f == null) {
                this.f = new n(getContext(), (AttributeSet) null, 0);
            }
            if (!c(this.f)) {
                a((View) this.f, true);
            }
        } else {
            ImageView imageView = this.f;
            if (imageView != null && c(imageView)) {
                removeView(this.f);
                this.F.remove(this.f);
            }
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f == null) {
            this.f = new n(getContext(), (AttributeSet) null, 0);
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            e();
        }
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(a.b.l.a.a.b(getContext(), i2));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            e();
            if (!c(this.e)) {
                a((View) this.e, true);
            }
        } else {
            ImageButton imageButton = this.e;
            if (imageButton != null && c(imageButton)) {
                removeView(this.e);
                this.F.remove(this.e);
            }
        }
        ImageButton imageButton2 = this.e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        e();
        this.e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.H = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        c();
        this.f496b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.l != i2) {
            this.l = i2;
            if (i2 == 0) {
                this.k = getContext();
            } else {
                this.k = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.d == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.d = zVar;
                zVar.setSingleLine();
                this.d.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.n;
                if (i2 != 0) {
                    this.d.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.d.setTextColor(colorStateList);
                }
            }
            if (!c(this.d)) {
                a((View) this.d, true);
            }
        } else {
            TextView textView = this.d;
            if (textView != null && c(textView)) {
                removeView(this.d);
                this.F.remove(this.d);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.z = charSequence;
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.c = zVar;
                zVar.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.m;
                if (i2 != 0) {
                    this.c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!c(this.c)) {
                a((View) this.c, true);
            }
        } else {
            TextView textView = this.c;
            if (textView != null && c(textView)) {
                removeView(this.c);
                this.F.remove(this.c);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setTitleMarginBottom(int i2) {
        this.t = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.r = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.q = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.s = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final int a(int i2) {
        int c2 = k.c(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, c2) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return c2 == 1 ? 5 : 3;
    }

    public final int a(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = eVar.f2a & j.AppCompatTheme_tooltipForegroundColor;
        if (!(i4 == 16 || i4 == 48 || i4 == 80)) {
            i4 = this.x & j.AppCompatTheme_tooltipForegroundColor;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = eVar.topMargin;
        if (i5 < i6) {
            i5 = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
            int i8 = eVar.bottomMargin;
            if (i7 < i8) {
                i5 = Math.max(0, i5 - (i8 - i7));
            }
        }
        return paddingTop + i5;
    }

    public final int a(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }
}
