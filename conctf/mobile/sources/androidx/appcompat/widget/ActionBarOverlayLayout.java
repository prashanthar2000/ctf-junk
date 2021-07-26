package androidx.appcompat.widget;

import a.b.k.r;
import a.b.o.i.m;
import a.b.p.c0;
import a.b.p.d0;
import a.b.p.d1;
import a.f.k.f;
import a.f.k.g;
import a.f.k.h;
import a.f.k.k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;

public class ActionBarOverlayLayout extends ViewGroup implements c0, f, g {
    public static final int[] C = {a.b.a.actionBarSize, 16842841};
    public final Runnable A;
    public final h B;

    /* renamed from: b  reason: collision with root package name */
    public int f471b;
    public int c;
    public ContentFrameLayout d;
    public ActionBarContainer e;
    public d0 f;
    public Drawable g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public final Rect o;
    public final Rect p;
    public final Rect q;
    public final Rect r;
    public final Rect s;
    public final Rect t;
    public final Rect u;
    public d v;
    public OverScroller w;
    public ViewPropertyAnimator x;
    public final AnimatorListenerAdapter y;
    public final Runnable z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = null;
            actionBarOverlayLayout.l = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = null;
            actionBarOverlayLayout.l = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.h();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = actionBarOverlayLayout.e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.y);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.h();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = actionBarOverlayLayout.e.animate().translationY((float) (-ActionBarOverlayLayout.this.e.getHeight())).setListener(ActionBarOverlayLayout.this.y);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i, int i2) {
            super(i, i2);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.y = new a();
        this.z = new b();
        this.A = new c();
        a(context);
        this.B = new h();
    }

    public void a(int i2) {
        i();
        if (i2 == 2) {
            this.f.i();
        } else if (i2 == 5) {
            this.f.l();
        } else if (i2 == 109) {
            setOverlayMode(true);
        }
    }

    public final void a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        boolean z2 = false;
        this.f471b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.h = z2;
        this.w = new OverScroller(context);
    }

    public void a(Menu menu, m.a aVar) {
        i();
        this.f.a(menu, aVar);
    }

    public void a(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    public void a(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            int i7 = this.m + i3;
            this.m = i7;
            setActionBarHideOffset(i7);
        }
    }

    public void a(View view, int i2, int i3, int[] iArr, int i4) {
    }

    public void a(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    public boolean a() {
        i();
        return this.f.a();
    }

    public final boolean a(View view, Rect rect, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        int i2;
        int i3;
        int i4;
        int i5;
        e eVar = (e) view.getLayoutParams();
        if (!z2 || eVar.leftMargin == (i5 = rect.left)) {
            z6 = false;
        } else {
            eVar.leftMargin = i5;
            z6 = true;
        }
        if (z3 && eVar.topMargin != (i4 = rect.top)) {
            eVar.topMargin = i4;
            z6 = true;
        }
        if (z5 && eVar.rightMargin != (i3 = rect.right)) {
            eVar.rightMargin = i3;
            z6 = true;
        }
        if (!z4 || eVar.bottomMargin == (i2 = rect.bottom)) {
            return z6;
        }
        eVar.bottomMargin = i2;
        return true;
    }

    public boolean b() {
        i();
        return this.f.b();
    }

    public boolean b(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    public void c() {
        i();
        this.f.c();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public boolean d() {
        i();
        return this.f.d();
    }

    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.g != null && !this.h) {
            if (this.e.getVisibility() == 0) {
                i2 = (int) (this.e.getTranslationY() + ((float) this.e.getBottom()) + 0.5f);
            } else {
                i2 = 0;
            }
            this.g.setBounds(0, i2, getWidth(), this.g.getIntrinsicHeight() + i2);
            this.g.draw(canvas);
        }
    }

    public boolean e() {
        i();
        return this.f.e();
    }

    public boolean f() {
        i();
        return this.f.f();
    }

    public boolean fitSystemWindows(Rect rect) {
        i();
        int f2 = k.f(this) & 256;
        boolean a2 = a((View) this.e, rect, true, true, false, true);
        this.r.set(rect);
        d1.a(this, this.r, this.o);
        if (!this.s.equals(this.r)) {
            this.s.set(this.r);
            a2 = true;
        }
        if (!this.p.equals(this.o)) {
            this.p.set(this.o);
            a2 = true;
        }
        if (a2) {
            requestLayout();
        }
        return true;
    }

    public void g() {
        i();
        this.f.g();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        h hVar = this.B;
        return hVar.f321b | hVar.f320a;
    }

    public CharSequence getTitle() {
        i();
        return this.f.getTitle();
    }

    public void h() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public void i() {
        d0 d0Var;
        if (this.d == null) {
            this.d = (ContentFrameLayout) findViewById(a.b.f.action_bar_activity_content);
            this.e = (ActionBarContainer) findViewById(a.b.f.action_bar_container);
            View findViewById = findViewById(a.b.f.action_bar);
            if (findViewById instanceof d0) {
                d0Var = (d0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                d0Var = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder a2 = b.a.a.a.a.a("Can't make a decor toolbar out of ");
                a2.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(a2.toString());
            }
            this.f = d0Var;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(getContext());
        k.l(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = eVar.leftMargin + paddingLeft;
                int i8 = eVar.topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        i();
        measureChildWithMargins(this.e, i2, 0, i3, 0);
        e eVar = (e) this.e.getLayoutParams();
        int max = Math.max(0, this.e.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.e.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.e.getMeasuredState());
        boolean z2 = (k.f(this) & 256) != 0;
        if (z2) {
            i4 = this.f471b;
            if (this.j && this.e.getTabContainer() != null) {
                i4 += this.f471b;
            }
        } else {
            i4 = this.e.getVisibility() != 8 ? this.e.getMeasuredHeight() : 0;
        }
        this.q.set(this.o);
        this.t.set(this.r);
        Rect rect = (this.i || z2) ? this.t : this.q;
        rect.top += i4;
        rect.bottom += 0;
        a((View) this.d, this.q, true, true, true, true);
        if (!this.u.equals(this.t)) {
            this.u.set(this.t);
            this.d.a(this.t);
        }
        measureChildWithMargins(this.d, i2, 0, i3, 0);
        e eVar2 = (e) this.d.getLayoutParams();
        int max3 = Math.max(max, this.d.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.d.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        boolean z3 = false;
        if (!this.k || !z2) {
            return false;
        }
        this.w.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.w.getFinalY() > this.e.getHeight()) {
            z3 = true;
        }
        if (z3) {
            h();
            this.A.run();
        } else {
            h();
            this.z.run();
        }
        this.l = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.m + i3;
        this.m = i6;
        setActionBarHideOffset(i6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (a.b.k.r) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            a.f.k.h r1 = r0.B
            r1.f320a = r3
            int r1 = r0.getActionBarHideOffset()
            r0.m = r1
            r0.h()
            androidx.appcompat.widget.ActionBarOverlayLayout$d r1 = r0.v
            if (r1 == 0) goto L_0x001d
            a.b.k.r r1 = (a.b.k.r) r1
            a.b.o.g r2 = r1.u
            if (r2 == 0) goto L_0x001d
            r2.a()
            r2 = 0
            r1.u = r2
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.e.getVisibility() != 0) {
            return false;
        }
        return this.k;
    }

    public void onStopNestedScroll(View view) {
        if (this.k && !this.l) {
            if (this.m <= this.e.getHeight()) {
                h();
                postDelayed(this.z, 600);
            } else {
                h();
                postDelayed(this.A, 600);
            }
        }
        d dVar = this.v;
        if (dVar != null && ((r) dVar) == null) {
            throw null;
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        i();
        int i3 = this.n ^ i2;
        this.n = i2;
        boolean z2 = (i2 & 4) == 0;
        boolean z3 = (i2 & 256) != 0;
        d dVar = this.v;
        if (dVar != null) {
            ((r) dVar).p = !z3;
            if (z2 || !z3) {
                r rVar = (r) this.v;
                if (rVar.r) {
                    rVar.r = false;
                    rVar.f(true);
                }
            } else {
                r rVar2 = (r) dVar;
                if (!rVar2.r) {
                    rVar2.r = true;
                    rVar2.f(true);
                }
            }
        }
        if ((i3 & 256) != 0 && this.v != null) {
            k.l(this);
        }
    }

    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.c = i2;
        d dVar = this.v;
        if (dVar != null) {
            ((r) dVar).o = i2;
        }
    }

    public void setActionBarHideOffset(int i2) {
        h();
        this.e.setTranslationY((float) (-Math.max(0, Math.min(i2, this.e.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.v = dVar;
        if (getWindowToken() != null) {
            ((r) this.v).o = this.c;
            int i2 = this.n;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                k.l(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.j = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.k) {
            this.k = z2;
            if (!z2) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i2) {
        i();
        this.f.setIcon(i2);
    }

    public void setIcon(Drawable drawable) {
        i();
        this.f.setIcon(drawable);
    }

    public void setLogo(int i2) {
        i();
        this.f.b(i2);
    }

    public void setOverlayMode(boolean z2) {
        this.i = z2;
        this.h = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        i();
        this.f.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        i();
        this.f.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void a(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i6 == 0) {
            int i7 = this.m + i3;
            this.m = i7;
            setActionBarHideOffset(i7);
        }
    }
}
