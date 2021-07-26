package androidx.appcompat.widget;

import a.b.f;
import a.b.g;
import a.b.p.c;
import a.b.p.d1;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView extends a.b.p.a {
    public CharSequence j;
    public CharSequence k;
    public View l;
    public View m;
    public LinearLayout n;
    public TextView o;
    public TextView p;
    public int q;
    public int r;
    public boolean s;
    public int t;

    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a.b.o.a f470b;

        public a(ActionBarContextView actionBarContextView, a.b.o.a aVar) {
            this.f470b = aVar;
        }

        public void onClick(View view) {
            this.f470b.a();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b.a.actionModeStyle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r0 = r4.getResourceId(r5, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionBarContextView(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            r2.<init>(r3, r4, r5)
            int[] r0 = a.b.j.ActionMode
            r1 = 0
            android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r0, r5, r1)
            int r5 = a.b.j.ActionMode_background
            boolean r0 = r4.hasValue(r5)
            if (r0 == 0) goto L_0x001d
            int r0 = r4.getResourceId(r5, r1)
            if (r0 == 0) goto L_0x001d
            android.graphics.drawable.Drawable r3 = a.b.l.a.a.b(r3, r0)
            goto L_0x0021
        L_0x001d:
            android.graphics.drawable.Drawable r3 = r4.getDrawable(r5)
        L_0x0021:
            a.f.k.k.a((android.view.View) r2, (android.graphics.drawable.Drawable) r3)
            int r3 = a.b.j.ActionMode_titleTextStyle
            int r3 = r4.getResourceId(r3, r1)
            r2.q = r3
            int r3 = a.b.j.ActionMode_subtitleTextStyle
            int r3 = r4.getResourceId(r3, r1)
            r2.r = r3
            int r3 = a.b.j.ActionMode_height
            int r3 = r4.getLayoutDimension(r3, r1)
            r2.f = r3
            int r3 = a.b.j.ActionMode_closeItemLayout
            int r5 = a.b.g.abc_action_mode_close_item_material
            int r3 = r4.getResourceId(r3, r5)
            r2.t = r3
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void a() {
        if (this.n == null) {
            LayoutInflater.from(getContext()).inflate(g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.n = linearLayout;
            this.o = (TextView) linearLayout.findViewById(f.action_bar_title);
            this.p = (TextView) this.n.findViewById(f.action_bar_subtitle);
            if (this.q != 0) {
                this.o.setTextAppearance(getContext(), this.q);
            }
            if (this.r != 0) {
                this.p.setTextAppearance(getContext(), this.r);
            }
        }
        this.o.setText(this.j);
        this.p.setText(this.k);
        boolean z = !TextUtils.isEmpty(this.j);
        boolean z2 = !TextUtils.isEmpty(this.k);
        int i = 0;
        this.p.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.n;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.n.getParent() == null) {
            addView(this.n);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(a.b.o.a r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.l
            r1 = 0
            if (r0 != 0) goto L_0x0016
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r6.t
            android.view.View r0 = r0.inflate(r2, r6, r1)
            r6.l = r0
            goto L_0x001e
        L_0x0016:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0021
            android.view.View r0 = r6.l
        L_0x001e:
            r6.addView(r0)
        L_0x0021:
            android.view.View r0 = r6.l
            int r2 = a.b.f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r2)
            androidx.appcompat.widget.ActionBarContextView$a r2 = new androidx.appcompat.widget.ActionBarContextView$a
            r2.<init>(r6, r7)
            r0.setOnClickListener(r2)
            android.view.Menu r7 = r7.c()
            a.b.o.i.g r7 = (a.b.o.i.g) r7
            a.b.p.c r0 = r6.e
            if (r0 == 0) goto L_0x003e
            r0.a()
        L_0x003e:
            a.b.p.c r0 = new a.b.p.c
            android.content.Context r2 = r6.getContext()
            r0.<init>(r2)
            r6.e = r0
            r2 = 1
            r0.m = r2
            r0.n = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r0.<init>(r3, r4)
            a.b.p.c r3 = r6.e
            android.content.Context r4 = r6.c
            r7.a((a.b.o.i.m) r3, (android.content.Context) r4)
            a.b.p.c r7 = r6.e
            a.b.o.i.n r3 = r7.i
            if (r3 != 0) goto L_0x0076
            android.view.LayoutInflater r4 = r7.e
            int r5 = r7.g
            android.view.View r1 = r4.inflate(r5, r6, r1)
            a.b.o.i.n r1 = (a.b.o.i.n) r1
            r7.i = r1
            a.b.o.i.g r4 = r7.d
            r1.a(r4)
            r7.a((boolean) r2)
        L_0x0076:
            a.b.o.i.n r1 = r7.i
            if (r3 == r1) goto L_0x0080
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r7)
        L_0x0080:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r6.d = r1
            r7 = 0
            a.f.k.k.a((android.view.View) r1, (android.graphics.drawable.Drawable) r7)
            androidx.appcompat.widget.ActionMenuView r7 = r6.d
            r6.addView(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.a(a.b.o.a):void");
    }

    public void b() {
        removeAllViews();
        this.m = null;
        this.d = null;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.k;
    }

    public CharSequence getTitle() {
        return this.j;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.e;
        if (cVar != null) {
            cVar.c();
            this.e.d();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(ActionBarContextView.class.getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.j);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean a2 = d1.a(this);
        int paddingRight = a2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.l;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
            int i5 = a2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = a2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = a2 ? paddingRight - i5 : paddingRight + i5;
            int a3 = i7 + a(this.l, i7, paddingTop, paddingTop2, a2);
            paddingRight = a2 ? a3 - i6 : a3 + i6;
        }
        int i8 = paddingRight;
        LinearLayout linearLayout = this.n;
        if (!(linearLayout == null || this.m != null || linearLayout.getVisibility() == 8)) {
            i8 += a(this.n, i8, paddingTop, paddingTop2, a2);
        }
        int i9 = i8;
        View view2 = this.m;
        if (view2 != null) {
            a(view2, i9, paddingTop, paddingTop2, a2);
        }
        int paddingLeft = a2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.d;
        if (actionMenuView != null) {
            a(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a2);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.f;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.l;
            if (view != null) {
                int a2 = a(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
                paddingLeft = a2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.d;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = a(this.d, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.n;
            if (linearLayout != null && this.m == null) {
                if (this.s) {
                    this.n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.n.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.n.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = a(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.m;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                int i7 = layoutParams.width;
                if (i7 >= 0) {
                    paddingLeft = Math.min(i7, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                int i8 = layoutParams.height;
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f <= 0) {
                int childCount = getChildCount();
                i4 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i4) {
                        i4 = measuredHeight;
                    }
                }
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public void setContentHeight(int i) {
        this.f = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.m;
        if (view2 != null) {
            removeView(view2);
        }
        this.m = view;
        if (!(view == null || (linearLayout = this.n) == null)) {
            removeView(linearLayout);
            this.n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.k = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.j = charSequence;
        a();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.s) {
            requestLayout();
        }
        this.s = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
