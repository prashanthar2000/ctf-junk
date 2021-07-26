package androidx.core.widget;

import a.b.k.o;
import a.f.k.d;
import a.f.k.e;
import a.f.k.f;
import a.f.k.g;
import a.f.k.h;
import a.f.k.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements g, d {
    public static final a B = new a();
    public static final int[] C = {16843130};
    public b A;

    /* renamed from: b  reason: collision with root package name */
    public long f511b;
    public final Rect c;
    public OverScroller d;
    public EdgeEffect e;
    public EdgeEffect f;
    public int g;
    public boolean h;
    public boolean i;
    public View j;
    public boolean k;
    public VelocityTracker l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public final int[] s;
    public final int[] t;
    public int u;
    public int v;
    public c w;
    public final h x;
    public final e y;
    public float z;

    public interface b {
    }

    public static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public int f512b;

        public static class a implements Parcelable.Creator<c> {
            public Object createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            public Object[] newArray(int i) {
                return new c[i];
            }
        }

        public c(Parcel parcel) {
            super(parcel);
            this.f512b = parcel.readInt();
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a2 = b.a.a.a.a.a("HorizontalScrollView.SavedState{");
            a2.append(Integer.toHexString(System.identityHashCode(this)));
            a2.append(" scrollPosition=");
            a2.append(this.f512b);
            a2.append("}");
            return a2.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f512b);
        }
    }

    public NestedScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.c = new Rect();
        this.h = true;
        this.i = false;
        this.j = null;
        this.k = false;
        this.n = true;
        this.r = -1;
        this.s = new int[2];
        this.t = new int[2];
        this.d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.o = viewConfiguration.getScaledTouchSlop();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C, i2, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.x = new h();
        this.y = new e(this);
        setNestedScrollingEnabled(true);
        k.a((View) this, (a.f.k.a) B);
    }

    public static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && a((View) parent, view2);
    }

    public static int b(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.z = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.z;
    }

    public int a(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        if (rect.bottom > i3 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i3) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        } else if (rect.top >= scrollY || rect.bottom >= i3) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public final void a() {
        this.d.abortAnimation();
        f(1);
    }

    public final void a(int i2, int i3) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f511b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                OverScroller overScroller = this.d;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY);
                a(false);
            } else {
                if (!this.d.isFinished()) {
                    a();
                }
                scrollBy(i2, i3);
            }
            this.f511b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.r) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.g = (int) motionEvent.getY(i2);
            this.r = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final void a(View view) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        int a2 = a(this.c);
        if (a2 != 0) {
            scrollBy(0, a2);
        }
    }

    public void a(View view, int i2, int i3, int i4, int i5, int i6) {
        a(i5, i6, (int[]) null);
    }

    public void a(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        a(i5, i6, iArr);
    }

    public void a(View view, int i2, int i3, int[] iArr, int i4) {
        a(i2, i3, iArr, (int[]) null, i4);
    }

    public final void a(boolean z2) {
        if (z2) {
            b(2, 1);
        } else {
            f(1);
        }
        this.v = getScrollY();
        k.k(this);
    }

    public boolean a(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            b(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.c);
            offsetDescendantRectToMyCoords(findNextFocus, this.c);
            b(a(this.c));
            findNextFocus.requestFocus(i2);
        }
        if (findFocus != null && findFocus.isFocused() && (!a(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final boolean a(View view, int i2, int i3) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        return this.c.bottom + i2 >= getScrollY() && this.c.top - i2 <= getScrollY() + i3;
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void b() {
        if (getOverScrollMode() == 2) {
            this.e = null;
            this.f = null;
        } else if (this.e == null) {
            Context context = getContext();
            this.e = new EdgeEffect(context);
            this.f = new EdgeEffect(context);
        }
    }

    public final void b(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.n) {
            a(0, i2);
        } else {
            scrollBy(0, i2);
        }
    }

    public boolean b(int i2, int i3) {
        boolean z2;
        e eVar = this.y;
        if (!(eVar.a(i3) != null)) {
            if (!eVar.d) {
                return false;
            }
            ViewParent parent = eVar.c.getParent();
            View view = eVar.c;
            while (parent != null) {
                View view2 = eVar.c;
                boolean z3 = parent instanceof f;
                if (z3) {
                    z2 = ((f) parent).b(view, view2, i2, i3);
                } else {
                    if (i3 == 0) {
                        try {
                            z2 = parent.onStartNestedScroll(view, view2, i2);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    if (i3 == 0) {
                        eVar.f318a = parent;
                    } else if (i3 == 1) {
                        eVar.f319b = parent;
                    }
                    View view3 = eVar.c;
                    if (z3) {
                        ((f) parent).a(view, view3, i2, i3);
                    } else if (i3 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view, view3, i2);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                        }
                    }
                } else {
                    if (parent instanceof View) {
                        view = (View) parent;
                    }
                    parent = parent.getParent();
                }
            }
            return false;
        }
        return true;
    }

    public boolean b(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public final void c() {
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public void c(int i2) {
        if (getChildCount() > 0) {
            this.d.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            a(true);
        }
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.d.isFinished()) {
            this.d.computeScrollOffset();
            int currY = this.d.getCurrY();
            int i2 = currY - this.v;
            this.v = currY;
            int[] iArr = this.t;
            boolean z2 = false;
            iArr[1] = 0;
            a(0, i2, iArr, (int[]) null, 1);
            int i3 = i2 - this.t[1];
            int scrollRange = getScrollRange();
            if (i3 != 0) {
                int scrollY = getScrollY();
                a(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i3 - scrollY2;
                int[] iArr2 = this.t;
                iArr2[1] = 0;
                this.y.a(0, scrollY2, 0, i4, this.s, 1, iArr2);
                i3 = i4 - this.t[1];
            }
            if (i3 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z2 = true;
                }
                if (z2) {
                    b();
                    if (i3 < 0) {
                        if (this.e.isFinished()) {
                            edgeEffect = this.e;
                        }
                    } else if (this.f.isFinished()) {
                        edgeEffect = this.f;
                    }
                    edgeEffect.onAbsorb((int) this.d.getCurrVelocity());
                }
                a();
            }
            if (!this.d.isFinished()) {
                k.k(this);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean d(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.c;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.c.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.c;
        return a(i2, rect3.top, rect3.bottom);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        ViewParent a2;
        e eVar = this.y;
        if (!eVar.d || (a2 = eVar.a(0)) == null) {
            return false;
        }
        return o.a(a2, eVar.c, f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        ViewParent a2;
        e eVar = this.y;
        if (!eVar.d || (a2 = eVar.a(0)) == null) {
            return false;
        }
        return o.a(a2, eVar.c, f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return a(i2, i3, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.y.a(i2, i3, i4, i5, iArr, 0, (int[]) null);
    }

    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.e != null) {
            int scrollY = getScrollY();
            int i3 = 0;
            if (!this.e.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    width -= getPaddingRight() + getPaddingLeft();
                    i2 = getPaddingLeft() + 0;
                } else {
                    i2 = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingBottom() + getPaddingTop();
                    min += getPaddingTop();
                }
                canvas.translate((float) i2, (float) min);
                this.e.setSize(width, height);
                if (this.e.draw(canvas)) {
                    k.k(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (getClipToPadding()) {
                    width2 -= getPaddingRight() + getPaddingLeft();
                    i3 = 0 + getPaddingLeft();
                }
                if (getClipToPadding()) {
                    height2 -= getPaddingBottom() + getPaddingTop();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i3 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f.setSize(width2, height2);
                if (this.f.draw(canvas)) {
                    k.k(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    public boolean e(int i2) {
        return this.y.a(i2) != null;
    }

    public void f(int i2) {
        e eVar = this.y;
        ViewParent a2 = eVar.a(i2);
        if (a2 != null) {
            View view = eVar.c;
            if (a2 instanceof f) {
                ((f) a2).a(view, i2);
            } else if (i2 == 0) {
                try {
                    a2.onStopNestedScroll(view);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + a2 + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i2 == 0) {
                eVar.f318a = null;
            } else if (i2 == 1) {
                eVar.f319b = null;
            }
        }
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        h hVar = this.x;
        return hVar.f321b | hVar.f320a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return e(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.y.d;
    }

    public void measureChild(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.k) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x000d
            boolean r3 = r11.k
            if (r3 == 0) goto L_0x000d
            return r2
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto L_0x00aa
            r4 = -1
            if (r0 == r2) goto L_0x0085
            if (r0 == r1) goto L_0x0024
            r1 = 3
            if (r0 == r1) goto L_0x0085
            r1 = 6
            if (r0 == r1) goto L_0x001f
            goto L_0x0113
        L_0x001f:
            r11.a((android.view.MotionEvent) r12)
            goto L_0x0113
        L_0x0024:
            int r0 = r11.r
            if (r0 != r4) goto L_0x002a
            goto L_0x0113
        L_0x002a:
            int r5 = r12.findPointerIndex(r0)
            if (r5 != r4) goto L_0x004d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r12.append(r1)
            r12.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r12)
            goto L_0x0113
        L_0x004d:
            float r0 = r12.getY(r5)
            int r0 = (int) r0
            int r4 = r11.g
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r11.o
            if (r4 <= r5) goto L_0x0113
            int r4 = r11.getNestedScrollAxes()
            r1 = r1 & r4
            if (r1 != 0) goto L_0x0113
            r11.k = r2
            r11.g = r0
            android.view.VelocityTracker r0 = r11.l
            if (r0 != 0) goto L_0x0073
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.l = r0
        L_0x0073:
            android.view.VelocityTracker r0 = r11.l
            r0.addMovement(r12)
            r11.u = r3
            android.view.ViewParent r12 = r11.getParent()
            if (r12 == 0) goto L_0x0113
            r12.requestDisallowInterceptTouchEvent(r2)
            goto L_0x0113
        L_0x0085:
            r11.k = r3
            r11.r = r4
            r11.c()
            android.widget.OverScroller r4 = r11.d
            int r5 = r11.getScrollX()
            int r6 = r11.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r11.getScrollRange()
            boolean r12 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L_0x00a6
            a.f.k.k.k(r11)
        L_0x00a6:
            r11.f(r3)
            goto L_0x0113
        L_0x00aa:
            float r0 = r12.getY()
            int r0 = (int) r0
            float r4 = r12.getX()
            int r4 = (int) r4
            int r5 = r11.getChildCount()
            if (r5 <= 0) goto L_0x00de
            int r5 = r11.getScrollY()
            android.view.View r6 = r11.getChildAt(r3)
            int r7 = r6.getTop()
            int r7 = r7 - r5
            if (r0 < r7) goto L_0x00de
            int r7 = r6.getBottom()
            int r7 = r7 - r5
            if (r0 >= r7) goto L_0x00de
            int r5 = r6.getLeft()
            if (r4 < r5) goto L_0x00de
            int r5 = r6.getRight()
            if (r4 >= r5) goto L_0x00de
            r4 = r2
            goto L_0x00df
        L_0x00de:
            r4 = r3
        L_0x00df:
            if (r4 != 0) goto L_0x00e7
            r11.k = r3
            r11.c()
            goto L_0x0113
        L_0x00e7:
            r11.g = r0
            int r0 = r12.getPointerId(r3)
            r11.r = r0
            android.view.VelocityTracker r0 = r11.l
            if (r0 != 0) goto L_0x00fa
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.l = r0
            goto L_0x00fd
        L_0x00fa:
            r0.clear()
        L_0x00fd:
            android.view.VelocityTracker r0 = r11.l
            r0.addMovement(r12)
            android.widget.OverScroller r12 = r11.d
            r12.computeScrollOffset()
            android.widget.OverScroller r12 = r11.d
            boolean r12 = r12.isFinished()
            r12 = r12 ^ r2
            r11.k = r12
            r11.b(r1, r3)
        L_0x0113:
            boolean r12 = r11.k
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.h = false;
        View view = this.j;
        if (view != null && a(view, (View) this)) {
            a(this.j);
        }
        this.j = null;
        if (!this.i) {
            if (this.w != null) {
                scrollTo(getScrollX(), this.w.f512b);
                this.w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int b2 = b(scrollY, paddingTop, i6);
            if (b2 != scrollY) {
                scrollTo(getScrollX(), b2);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.i = true;
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.m && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        c((int) f3);
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        a(i2, i3, iArr, (int[]) null, 0);
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        a(i5, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.x.f320a = i2;
        b(2, 0);
    }

    public void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, (View) null, i2) : instance.findNextFocusFromRect(this, rect, i2);
        if (findNextFocus != null && !(true ^ a(findNextFocus, 0, getHeight()))) {
            return findNextFocus.requestFocus(i2, rect);
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.w = cVar;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f512b = getScrollY();
        return cVar;
    }

    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        b bVar = this.A;
        if (bVar != null) {
            a.b.k.b bVar2 = (a.b.k.b) bVar;
            AlertController.a(this, bVar2.f3a, bVar2.f4b);
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && a(findFocus, 0, i5)) {
            findFocus.getDrawingRect(this.c);
            offsetDescendantRectToMyCoords(findFocus, this.c);
            b(a(this.c));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return (i2 & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.x.f320a = 0;
        f(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        if (r0 != null) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0227, code lost:
        if (r0 != null) goto L_0x0229;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            r22 = this;
            r9 = r22
            r10 = r23
            android.view.VelocityTracker r0 = r9.l
            if (r0 != 0) goto L_0x000e
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.l = r0
        L_0x000e:
            int r0 = r23.getActionMasked()
            r11 = 0
            if (r0 != 0) goto L_0x0017
            r9.u = r11
        L_0x0017:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r23)
            int r1 = r9.u
            float r1 = (float) r1
            r2 = 0
            r12.offsetLocation(r2, r1)
            r1 = 2
            r13 = 1
            if (r0 == 0) goto L_0x0232
            r3 = -1
            if (r0 == r13) goto L_0x01d6
            if (r0 == r1) goto L_0x0092
            r1 = 3
            if (r0 == r1) goto L_0x005b
            r1 = 5
            if (r0 == r1) goto L_0x0048
            r1 = 6
            if (r0 == r1) goto L_0x0036
            goto L_0x0268
        L_0x0036:
            r22.a((android.view.MotionEvent) r23)
            int r0 = r9.r
            int r0 = r10.findPointerIndex(r0)
            float r0 = r10.getY(r0)
            int r0 = (int) r0
            r9.g = r0
            goto L_0x0268
        L_0x0048:
            int r0 = r23.getActionIndex()
            float r1 = r10.getY(r0)
            int r1 = (int) r1
            r9.g = r1
            int r0 = r10.getPointerId(r0)
            r9.r = r0
            goto L_0x0268
        L_0x005b:
            boolean r0 = r9.k
            if (r0 == 0) goto L_0x0082
            int r0 = r22.getChildCount()
            if (r0 <= 0) goto L_0x0082
            android.widget.OverScroller r14 = r9.d
            int r15 = r22.getScrollX()
            int r16 = r22.getScrollY()
            r17 = 0
            r18 = 0
            r19 = 0
            int r20 = r22.getScrollRange()
            boolean r0 = r14.springBack(r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x0082
            a.f.k.k.k(r22)
        L_0x0082:
            r9.r = r3
            r9.k = r11
            r22.c()
            r9.f(r11)
            android.widget.EdgeEffect r0 = r9.e
            if (r0 == 0) goto L_0x0268
            goto L_0x0229
        L_0x0092:
            int r0 = r9.r
            int r14 = r10.findPointerIndex(r0)
            if (r14 != r3) goto L_0x00b5
            java.lang.String r0 = "Invalid pointerId="
            java.lang.StringBuilder r0 = b.a.a.a.a.a(r0)
            int r1 = r9.r
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L_0x0268
        L_0x00b5:
            float r0 = r10.getY(r14)
            int r6 = (int) r0
            int r0 = r9.g
            int r7 = r0 - r6
            r1 = 0
            int[] r3 = r9.t
            int[] r4 = r9.s
            r5 = 0
            r0 = r22
            r2 = r7
            boolean r0 = r0.a((int) r1, (int) r2, (int[]) r3, (int[]) r4, (int) r5)
            if (r0 == 0) goto L_0x00db
            int[] r0 = r9.t
            r0 = r0[r13]
            int r7 = r7 - r0
            int r0 = r9.u
            int[] r1 = r9.s
            r1 = r1[r13]
            int r0 = r0 + r1
            r9.u = r0
        L_0x00db:
            boolean r0 = r9.k
            if (r0 != 0) goto L_0x00f9
            int r0 = java.lang.Math.abs(r7)
            int r1 = r9.o
            if (r0 <= r1) goto L_0x00f9
            android.view.ViewParent r0 = r22.getParent()
            if (r0 == 0) goto L_0x00f0
            r0.requestDisallowInterceptTouchEvent(r13)
        L_0x00f0:
            r9.k = r13
            int r0 = r9.o
            if (r7 <= 0) goto L_0x00f8
            int r7 = r7 - r0
            goto L_0x00f9
        L_0x00f8:
            int r7 = r7 + r0
        L_0x00f9:
            r15 = r7
            boolean r0 = r9.k
            if (r0 == 0) goto L_0x0268
            int[] r0 = r9.s
            r0 = r0[r13]
            int r6 = r6 - r0
            r9.g = r6
            int r16 = r22.getScrollY()
            int r8 = r22.getScrollRange()
            int r0 = r22.getOverScrollMode()
            if (r0 == 0) goto L_0x011b
            if (r0 != r13) goto L_0x0118
            if (r8 <= 0) goto L_0x0118
            goto L_0x011b
        L_0x0118:
            r17 = r11
            goto L_0x011d
        L_0x011b:
            r17 = r13
        L_0x011d:
            r1 = 0
            r3 = 0
            int r4 = r22.getScrollY()
            r5 = 0
            r7 = 0
            r18 = 0
            r0 = r22
            r2 = r15
            r6 = r8
            r21 = r8
            r8 = r18
            boolean r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x0140
            boolean r0 = r9.e(r11)
            if (r0 != 0) goto L_0x0140
            android.view.VelocityTracker r0 = r9.l
            r0.clear()
        L_0x0140:
            int r0 = r22.getScrollY()
            int r3 = r0 - r16
            int r5 = r15 - r3
            int[] r8 = r9.t
            r8[r13] = r11
            r2 = 0
            r4 = 0
            int[] r6 = r9.s
            r7 = 0
            a.f.k.e r1 = r9.y
            r1.a(r2, r3, r4, r5, r6, r7, r8)
            int r0 = r9.g
            int[] r1 = r9.s
            r2 = r1[r13]
            int r0 = r0 - r2
            r9.g = r0
            int r0 = r9.u
            r1 = r1[r13]
            int r0 = r0 + r1
            r9.u = r0
            if (r17 == 0) goto L_0x0268
            int[] r0 = r9.t
            r0 = r0[r13]
            int r15 = r15 - r0
            r22.b()
            int r0 = r16 + r15
            if (r0 >= 0) goto L_0x0195
            android.widget.EdgeEffect r0 = r9.e
            float r1 = (float) r15
            int r2 = r22.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = r10.getX(r14)
            int r3 = r22.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            r0.onPull(r1, r2)
            android.widget.EdgeEffect r0 = r9.f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01bf
            android.widget.EdgeEffect r0 = r9.f
            goto L_0x01bc
        L_0x0195:
            r1 = r21
            if (r0 <= r1) goto L_0x01bf
            android.widget.EdgeEffect r0 = r9.f
            float r1 = (float) r15
            int r2 = r22.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r10.getX(r14)
            int r4 = r22.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = r2 - r3
            r0.onPull(r1, r2)
            android.widget.EdgeEffect r0 = r9.e
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01bf
            android.widget.EdgeEffect r0 = r9.e
        L_0x01bc:
            r0.onRelease()
        L_0x01bf:
            android.widget.EdgeEffect r0 = r9.e
            if (r0 == 0) goto L_0x0268
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01d1
            android.widget.EdgeEffect r0 = r9.f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0268
        L_0x01d1:
            a.f.k.k.k(r22)
            goto L_0x0268
        L_0x01d6:
            android.view.VelocityTracker r0 = r9.l
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r9.q
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r9.r
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r9.p
            if (r1 <= r4) goto L_0x01fe
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r9.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x021b
            r9.dispatchNestedFling(r2, r1, r13)
            r9.c(r0)
            goto L_0x021b
        L_0x01fe:
            android.widget.OverScroller r14 = r9.d
            int r15 = r22.getScrollX()
            int r16 = r22.getScrollY()
            r17 = 0
            r18 = 0
            r19 = 0
            int r20 = r22.getScrollRange()
            boolean r0 = r14.springBack(r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x021b
            a.f.k.k.k(r22)
        L_0x021b:
            r9.r = r3
            r9.k = r11
            r22.c()
            r9.f(r11)
            android.widget.EdgeEffect r0 = r9.e
            if (r0 == 0) goto L_0x0268
        L_0x0229:
            r0.onRelease()
            android.widget.EdgeEffect r0 = r9.f
            r0.onRelease()
            goto L_0x0268
        L_0x0232:
            int r0 = r22.getChildCount()
            if (r0 != 0) goto L_0x0239
            return r11
        L_0x0239:
            android.widget.OverScroller r0 = r9.d
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r13
            r9.k = r0
            if (r0 == 0) goto L_0x024d
            android.view.ViewParent r0 = r22.getParent()
            if (r0 == 0) goto L_0x024d
            r0.requestDisallowInterceptTouchEvent(r13)
        L_0x024d:
            android.widget.OverScroller r0 = r9.d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0258
            r22.a()
        L_0x0258:
            float r0 = r23.getY()
            int r0 = (int) r0
            r9.g = r0
            int r0 = r10.getPointerId(r11)
            r9.r = r0
            r9.b(r1, r11)
        L_0x0268:
            android.view.VelocityTracker r0 = r9.l
            if (r0 == 0) goto L_0x026f
            r0.addMovement(r12)
        L_0x026f:
            r12.recycle()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.h) {
            a(view2);
        } else {
            this.j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int a2 = a(rect);
        boolean z3 = a2 != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, a2);
            } else {
                a(0, a2);
            }
        }
        return z3;
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (z2) {
            c();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int b2 = b(i2, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int b3 = b(i3, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (b2 != getScrollX() || b3 != getScrollY()) {
                super.scrollTo(b2, b3);
            }
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.m) {
            this.m = z2;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        e eVar = this.y;
        if (eVar.d) {
            k.m(eVar.c);
        }
        eVar.d = z2;
    }

    public void setOnScrollChangeListener(b bVar) {
        this.A = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.n = z2;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i2) {
        return b(i2, 0);
    }

    public void stopNestedScroll() {
        f(0);
    }

    public boolean a(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent a2;
        int i5;
        int i6;
        int[] iArr3;
        int[] iArr4 = iArr2;
        e eVar = this.y;
        if (!eVar.d || (a2 = eVar.a(i4)) == null) {
            return false;
        }
        if (i2 != 0 || i3 != 0) {
            if (iArr4 != null) {
                eVar.c.getLocationInWindow(iArr4);
                i6 = iArr4[0];
                i5 = iArr4[1];
            } else {
                i6 = 0;
                i5 = 0;
            }
            if (iArr == null) {
                if (eVar.e == null) {
                    eVar.e = new int[2];
                }
                iArr3 = eVar.e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            o.a(a2, eVar.c, i2, i3, iArr3, i4);
            if (iArr4 != null) {
                eVar.c.getLocationInWindow(iArr4);
                iArr4[0] = iArr4[0] - i6;
                iArr4[1] = iArr4[1] - i5;
            }
            if (iArr3[0] == 0 && iArr3[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr4 == null) {
            return false;
        } else {
            iArr4[0] = 0;
            iArr4[1] = 0;
            return false;
        }
    }

    public static class a extends a.f.k.a {
        public void a(View view, AccessibilityEvent accessibilityEvent) {
            this.f312a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        public void a(View view, a.f.k.u.b bVar) {
            int scrollRange;
            this.f312a.onInitializeAccessibilityNodeInfo(view, bVar.f338a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            bVar.f338a.setClassName(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                bVar.f338a.setScrollable(true);
                if (nestedScrollView.getScrollY() > 0) {
                    bVar.f338a.addAction(8192);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    bVar.f338a.addAction(4096);
                }
            }
        }

        public boolean a(View view, int i, Bundle bundle) {
            int min;
            if (super.a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
            } else if (i != 8192) {
                return false;
            } else {
                min = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
            }
            nestedScrollView.a(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY());
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.graphics.Rect r0 = r6.c
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0033
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r6.getHeight()
            int r4 = r6.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r6.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L_0x0033
            r0 = r1
            goto L_0x0034
        L_0x0033:
            r0 = r2
        L_0x0034:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L_0x0062
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L_0x0061
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto L_0x0061
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto L_0x004c
            r7 = 0
        L_0x004c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto L_0x005f
            if (r7 == r6) goto L_0x005f
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r1 = r2
        L_0x0060:
            return r1
        L_0x0061:
            return r2
        L_0x0062:
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x00fa
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto L_0x00eb
            r4 = 20
            if (r0 == r4) goto L_0x00db
            r4 = 62
            if (r0 == r4) goto L_0x007c
            goto L_0x00fa
        L_0x007c:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r5 = r3
        L_0x0084:
            if (r5 != r3) goto L_0x0088
            r7 = r1
            goto L_0x0089
        L_0x0088:
            r7 = r2
        L_0x0089:
            int r0 = r6.getHeight()
            if (r7 == 0) goto L_0x00be
            android.graphics.Rect r7 = r6.c
            int r3 = r6.getScrollY()
            int r3 = r3 + r0
            r7.top = r3
            int r7 = r6.getChildCount()
            if (r7 <= 0) goto L_0x00d0
            int r7 = r7 - r1
            android.view.View r7 = r6.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r7 = r7.getBottom()
            int r1 = r1.bottomMargin
            int r7 = r7 + r1
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r7
            android.graphics.Rect r7 = r6.c
            int r3 = r7.top
            int r3 = r3 + r0
            if (r3 <= r1) goto L_0x00d0
            int r1 = r1 - r0
            goto L_0x00ce
        L_0x00be:
            android.graphics.Rect r7 = r6.c
            int r1 = r6.getScrollY()
            int r1 = r1 - r0
            r7.top = r1
            android.graphics.Rect r7 = r6.c
            int r1 = r7.top
            if (r1 >= 0) goto L_0x00d0
            r1 = r2
        L_0x00ce:
            r7.top = r1
        L_0x00d0:
            android.graphics.Rect r7 = r6.c
            int r1 = r7.top
            int r0 = r0 + r1
            r7.bottom = r0
            r6.a((int) r5, (int) r1, (int) r0)
            goto L_0x00fa
        L_0x00db:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00e6
            boolean r2 = r6.a((int) r3)
            goto L_0x00fa
        L_0x00e6:
            boolean r2 = r6.d(r3)
            goto L_0x00fa
        L_0x00eb:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00f6
            boolean r2 = r6.a((int) r5)
            goto L_0x00fa
        L_0x00f6:
            boolean r2 = r6.d(r5)
        L_0x00fa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.a(android.view.KeyEvent):boolean");
    }

    public void a(View view, View view2, int i2, int i3) {
        h hVar = this.x;
        if (i3 == 1) {
            hVar.f321b = i2;
        } else {
            hVar.f320a = i2;
        }
        b(2, i3);
    }

    public final void a(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.y.a(0, scrollY2, 0, i2 - scrollY2, (int[]) null, i3, iArr);
    }

    public void a(View view, int i2) {
        h hVar = this.x;
        if (i2 == 1) {
            hVar.f321b = 0;
        } else {
            hVar.f320a = 0;
        }
        f(i2);
    }

    public boolean a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        boolean z4 = super.computeHorizontalScrollRange() > super.computeHorizontalScrollExtent();
        boolean z5 = computeVerticalScrollRange() > super.computeVerticalScrollExtent();
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        int i10 = i4 + i2;
        int i11 = !z6 ? 0 : i8;
        int i12 = i5 + i3;
        int i13 = !z7 ? 0 : i9;
        int i14 = -i11;
        int i15 = i11 + i6;
        int i16 = -i13;
        int i17 = i13 + i7;
        if (i10 > i15) {
            i10 = i15;
            z2 = true;
        } else if (i10 < i14) {
            z2 = true;
            i10 = i14;
        } else {
            z2 = false;
        }
        if (i12 > i17) {
            i12 = i17;
            z3 = true;
        } else if (i12 < i16) {
            z3 = true;
            i12 = i16;
        } else {
            z3 = false;
        }
        if (z3 && !e(1)) {
            this.d.springBack(i10, i12, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i10, i12);
        if (z2 || z3) {
            return true;
        }
        return false;
    }

    public final boolean a(int i2, int i3, int i4) {
        boolean z2;
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = height + scrollY;
        boolean z3 = i5 == 33;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view2 = (View) focusables.get(i9);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i6 < bottom && top < i7) {
                boolean z5 = i6 < top && bottom < i7;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom());
                    if (z4) {
                        if (z5) {
                            if (!z6) {
                            }
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else if (!z6) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i6 < scrollY || i7 > i8) {
            b(z3 ? i6 - scrollY : i7 - i8);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i5);
        }
        return z2;
    }
}
