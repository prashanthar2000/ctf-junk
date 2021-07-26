package a.b.p;

import a.b.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class i0 extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public boolean f137b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public float h;
    public boolean i;
    public int[] j;
    public int[] k;
    public Drawable l;
    public int m;
    public int n;
    public int o;
    public int p;

    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public float f138a;

        /* renamed from: b  reason: collision with root package name */
        public int f139b;

        public a(int i, int i2) {
            super(i, i2);
            this.f139b = -1;
            this.f138a = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f139b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.LinearLayoutCompat_Layout);
            this.f138a = obtainStyledAttributes.getFloat(j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f139b = obtainStyledAttributes.getInt(j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f139b = -1;
        }
    }

    public i0(Context context) {
        this(context, (AttributeSet) null);
    }

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005a, code lost:
        r0 = r6.getResourceId(r7, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            r4.<init>(r5, r6, r7)
            r0 = 1
            r4.f137b = r0
            r1 = -1
            r4.c = r1
            r2 = 0
            r4.d = r2
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r4.f = r3
            int[] r3 = a.b.j.LinearLayoutCompat
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r6, r3, r7, r2)
            int r7 = a.b.j.LinearLayoutCompat_android_orientation
            int r7 = r6.getInt(r7, r1)
            if (r7 < 0) goto L_0x0022
            r4.setOrientation(r7)
        L_0x0022:
            int r7 = a.b.j.LinearLayoutCompat_android_gravity
            int r7 = r6.getInt(r7, r1)
            if (r7 < 0) goto L_0x002d
            r4.setGravity(r7)
        L_0x002d:
            int r7 = a.b.j.LinearLayoutCompat_android_baselineAligned
            boolean r7 = r6.getBoolean(r7, r0)
            if (r7 != 0) goto L_0x0038
            r4.setBaselineAligned(r7)
        L_0x0038:
            int r7 = a.b.j.LinearLayoutCompat_android_weightSum
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r7 = r6.getFloat(r7, r0)
            r4.h = r7
            int r7 = a.b.j.LinearLayoutCompat_android_baselineAlignedChildIndex
            int r7 = r6.getInt(r7, r1)
            r4.c = r7
            int r7 = a.b.j.LinearLayoutCompat_measureWithLargestChild
            boolean r7 = r6.getBoolean(r7, r2)
            r4.i = r7
            int r7 = a.b.j.LinearLayoutCompat_divider
            boolean r0 = r6.hasValue(r7)
            if (r0 == 0) goto L_0x0065
            int r0 = r6.getResourceId(r7, r2)
            if (r0 == 0) goto L_0x0065
            android.graphics.drawable.Drawable r5 = a.b.l.a.a.b(r5, r0)
            goto L_0x0069
        L_0x0065:
            android.graphics.drawable.Drawable r5 = r6.getDrawable(r7)
        L_0x0069:
            r4.setDividerDrawable(r5)
            int r5 = a.b.j.LinearLayoutCompat_showDividers
            int r5 = r6.getInt(r5, r2)
            r4.o = r5
            int r5 = a.b.j.LinearLayoutCompat_dividerPadding
            int r5 = r6.getDimensionPixelSize(r5, r2)
            r4.p = r5
            r6.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.i0.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void a(Canvas canvas, int i2) {
        this.l.setBounds(getPaddingLeft() + this.p, i2, (getWidth() - getPaddingRight()) - this.p, this.n + i2);
        this.l.draw(canvas);
    }

    public boolean a(int i2) {
        if (i2 == 0) {
            return (this.o & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.o & 4) != 0;
        }
        if ((this.o & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public void b(Canvas canvas, int i2) {
        this.l.setBounds(i2, getPaddingTop() + this.p, this.m + i2, (getHeight() - getPaddingBottom()) - this.p);
        this.l.draw(canvas);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public a generateDefaultLayoutParams() {
        int i2 = this.e;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getBaseline() {
        int i2;
        if (this.c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.c;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i4 = this.d;
                if (this.e == 1 && (i2 = this.f & j.AppCompatTheme_tooltipForegroundColor) != 48) {
                    if (i2 == 16) {
                        i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.g) / 2;
                    } else if (i2 == 80) {
                        i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.g;
                    }
                }
                return i4 + ((a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.c == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.c;
    }

    public Drawable getDividerDrawable() {
        return this.l;
    }

    public int getDividerPadding() {
        return this.p;
    }

    public int getDividerWidth() {
        return this.m;
    }

    public int getGravity() {
        return this.f;
    }

    public int getOrientation() {
        return this.e;
    }

    public int getShowDividers() {
        return this.o;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.h;
    }

    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        if (this.l != null) {
            int i5 = 0;
            if (this.e == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i5 < virtualChildCount) {
                    View childAt = getChildAt(i5);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !a(i5))) {
                        a(canvas, (childAt.getTop() - ((a) childAt.getLayoutParams()).topMargin) - this.n);
                    }
                    i5++;
                }
                if (a(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    a(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.n : childAt2.getBottom() + ((a) childAt2.getLayoutParams()).bottomMargin);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a2 = d1.a(this);
            while (i5 < virtualChildCount2) {
                View childAt3 = getChildAt(i5);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !a(i5))) {
                    a aVar = (a) childAt3.getLayoutParams();
                    b(canvas, a2 ? childAt3.getRight() + aVar.rightMargin : (childAt3.getLeft() - aVar.leftMargin) - this.m);
                }
                i5++;
            }
            if (a(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    a aVar2 = (a) childAt4.getLayoutParams();
                    if (a2) {
                        i4 = childAt4.getLeft();
                        i3 = aVar2.leftMargin;
                    } else {
                        i2 = childAt4.getRight() + aVar2.rightMargin;
                        b(canvas, i2);
                    }
                } else if (a2) {
                    i2 = getPaddingLeft();
                    b(canvas, i2);
                } else {
                    i4 = getWidth();
                    i3 = getPaddingRight();
                }
                i2 = (i4 - i3) - this.m;
                b(canvas, i2);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            r24 = this;
            r0 = r24
            int r1 = r0.e
            r2 = 80
            r3 = 16
            r4 = 8
            r5 = 5
            r6 = 8388615(0x800007, float:1.1754953E-38)
            r7 = 2
            r8 = 1
            if (r1 != r8) goto L_0x00b7
            int r1 = r24.getPaddingLeft()
            int r10 = r28 - r26
            int r11 = r24.getPaddingRight()
            int r11 = r10 - r11
            int r10 = r10 - r1
            int r12 = r24.getPaddingRight()
            int r10 = r10 - r12
            int r12 = r24.getVirtualChildCount()
            int r13 = r0.f
            r14 = r13 & 112(0x70, float:1.57E-43)
            r6 = r6 & r13
            if (r14 == r3) goto L_0x0042
            if (r14 == r2) goto L_0x0036
            int r2 = r24.getPaddingTop()
            goto L_0x004d
        L_0x0036:
            int r2 = r24.getPaddingTop()
            int r2 = r2 + r29
            int r2 = r2 - r27
            int r3 = r0.g
            int r2 = r2 - r3
            goto L_0x004d
        L_0x0042:
            int r2 = r24.getPaddingTop()
            int r3 = r29 - r27
            int r13 = r0.g
            int r3 = r3 - r13
            int r3 = r3 / r7
            int r2 = r2 + r3
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 >= r12) goto L_0x01cd
            android.view.View r13 = r0.getChildAt(r3)
            if (r13 != 0) goto L_0x0059
            int r2 = r2 + 0
            goto L_0x00b1
        L_0x0059:
            int r14 = r13.getVisibility()
            if (r14 == r4) goto L_0x00b1
            int r14 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r16 = r13.getLayoutParams()
            r4 = r16
            a.b.p.i0$a r4 = (a.b.p.i0.a) r4
            int r9 = r4.f139b
            if (r9 >= 0) goto L_0x0074
            r9 = r6
        L_0x0074:
            int r7 = a.f.k.k.c(r24)
            int r7 = android.view.Gravity.getAbsoluteGravity(r9, r7)
            r7 = r7 & 7
            if (r7 == r8) goto L_0x0089
            if (r7 == r5) goto L_0x0086
            int r7 = r4.leftMargin
            int r7 = r7 + r1
            goto L_0x0094
        L_0x0086:
            int r7 = r11 - r14
            goto L_0x0091
        L_0x0089:
            int r7 = r10 - r14
            r9 = 2
            int r7 = r7 / r9
            int r7 = r7 + r1
            int r9 = r4.leftMargin
            int r7 = r7 + r9
        L_0x0091:
            int r9 = r4.rightMargin
            int r7 = r7 - r9
        L_0x0094:
            boolean r9 = r0.a(r3)
            if (r9 == 0) goto L_0x009d
            int r9 = r0.n
            int r2 = r2 + r9
        L_0x009d:
            int r9 = r4.topMargin
            int r2 = r2 + r9
            int r9 = r2 + 0
            int r14 = r14 + r7
            int r5 = r15 + r9
            r13.layout(r7, r9, r14, r5)
            int r4 = r4.bottomMargin
            int r15 = r15 + r4
            r4 = 0
            int r15 = r15 + r4
            int r15 = r15 + r2
            int r3 = r3 + 0
            r2 = r15
        L_0x00b1:
            int r3 = r3 + r8
            r4 = 8
            r5 = 5
            r7 = 2
            goto L_0x004e
        L_0x00b7:
            boolean r1 = a.b.p.d1.a(r24)
            int r4 = r24.getPaddingTop()
            int r5 = r29 - r27
            int r7 = r24.getPaddingBottom()
            int r7 = r5 - r7
            int r5 = r5 - r4
            int r9 = r24.getPaddingBottom()
            int r5 = r5 - r9
            int r9 = r24.getVirtualChildCount()
            int r10 = r0.f
            r6 = r6 & r10
            r10 = r10 & 112(0x70, float:1.57E-43)
            boolean r11 = r0.f137b
            int[] r12 = r0.j
            int[] r13 = r0.k
            int r14 = r24.getLayoutDirection()
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r14)
            if (r6 == r8) goto L_0x00fa
            r14 = 5
            if (r6 == r14) goto L_0x00ee
            int r6 = r24.getPaddingLeft()
            goto L_0x0106
        L_0x00ee:
            int r6 = r24.getPaddingLeft()
            int r6 = r6 + r28
            int r6 = r6 - r26
            int r14 = r0.g
            int r6 = r6 - r14
            goto L_0x0106
        L_0x00fa:
            int r6 = r24.getPaddingLeft()
            int r14 = r28 - r26
            int r15 = r0.g
            int r14 = r14 - r15
            r15 = 2
            int r14 = r14 / r15
            int r6 = r6 + r14
        L_0x0106:
            if (r1 == 0) goto L_0x010c
            int r1 = r9 + -1
            r15 = -1
            goto L_0x010e
        L_0x010c:
            r15 = r8
            r1 = 0
        L_0x010e:
            r17 = r6
            r6 = 0
        L_0x0111:
            if (r6 >= r9) goto L_0x01cd
            int r18 = r15 * r6
            int r8 = r18 + r1
            android.view.View r2 = r0.getChildAt(r8)
            if (r2 != 0) goto L_0x0129
            int r17 = r17 + 0
        L_0x011f:
            r27 = r1
            r29 = r9
            r21 = r10
            r1 = 0
        L_0x0126:
            r2 = 1
            goto L_0x01bf
        L_0x0129:
            int r3 = r2.getVisibility()
            r14 = 8
            if (r3 == r14) goto L_0x011f
            int r3 = r2.getMeasuredWidth()
            int r20 = r2.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r21 = r2.getLayoutParams()
            r14 = r21
            a.b.p.i0$a r14 = (a.b.p.i0.a) r14
            r27 = r1
            if (r11 == 0) goto L_0x0151
            int r1 = r14.height
            r29 = r9
            r9 = -1
            if (r1 == r9) goto L_0x0153
            int r9 = r2.getBaseline()
            goto L_0x0154
        L_0x0151:
            r29 = r9
        L_0x0153:
            r9 = -1
        L_0x0154:
            int r1 = r14.f139b
            if (r1 >= 0) goto L_0x0159
            r1 = r10
        L_0x0159:
            r1 = r1 & 112(0x70, float:1.57E-43)
            r21 = r10
            r10 = 16
            if (r1 == r10) goto L_0x0191
            r10 = 48
            if (r1 == r10) goto L_0x0182
            r10 = 80
            if (r1 == r10) goto L_0x016c
            r1 = r4
            r10 = -1
            goto L_0x019d
        L_0x016c:
            int r1 = r7 - r20
            int r10 = r14.bottomMargin
            int r1 = r1 - r10
            r10 = -1
            if (r9 == r10) goto L_0x019d
            int r22 = r2.getMeasuredHeight()
            int r22 = r22 - r9
            r9 = 2
            r23 = r13[r9]
            int r23 = r23 - r22
            int r1 = r1 - r23
            goto L_0x019d
        L_0x0182:
            r10 = -1
            int r1 = r14.topMargin
            int r1 = r1 + r4
            if (r9 == r10) goto L_0x019d
            r19 = 1
            r22 = r12[r19]
            int r22 = r22 - r9
            int r1 = r22 + r1
            goto L_0x019d
        L_0x0191:
            r10 = -1
            int r1 = r5 - r20
            r9 = 2
            int r1 = r1 / r9
            int r1 = r1 + r4
            int r9 = r14.topMargin
            int r1 = r1 + r9
            int r9 = r14.bottomMargin
            int r1 = r1 - r9
        L_0x019d:
            boolean r8 = r0.a(r8)
            if (r8 == 0) goto L_0x01a7
            int r8 = r0.m
            int r17 = r17 + r8
        L_0x01a7:
            int r8 = r14.leftMargin
            int r17 = r17 + r8
            int r8 = r17 + 0
            int r9 = r3 + r8
            int r10 = r20 + r1
            r2.layout(r8, r1, r9, r10)
            int r1 = r14.rightMargin
            int r3 = r3 + r1
            r1 = 0
            int r3 = r3 + r1
            int r17 = r3 + r17
            int r6 = r6 + 0
            goto L_0x0126
        L_0x01bf:
            int r6 = r6 + r2
            r1 = r27
            r9 = r29
            r8 = r2
            r10 = r21
            r2 = 80
            r3 = 16
            goto L_0x0111
        L_0x01cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.i0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02b2, code lost:
        if (r13 < 0) goto L_0x02b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x072d, code lost:
        if (r7 < 0) goto L_0x072f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0499  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04dc  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0502  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x051e  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0555  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x055d  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0568  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x05ff  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x06ba  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x06d7  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x07bf  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x07e3  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x0823  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x082c  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0885  */
    /* JADX WARNING: Removed duplicated region for block: B:421:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r38, int r39) {
        /*
            r37 = this;
            r6 = r37
            r7 = r38
            r8 = r39
            int r0 = r6.e
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r13 = 0
            r15 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            r4 = 0
            if (r0 != r5) goto L_0x038d
            r6.g = r4
            int r3 = r37.getVirtualChildCount()
            int r2 = android.view.View.MeasureSpec.getMode(r38)
            int r1 = android.view.View.MeasureSpec.getMode(r39)
            int r0 = r6.c
            boolean r9 = r6.i
            r14 = r4
            r17 = r14
            r18 = r17
            r19 = r18
            r20 = r19
            r22 = r20
            r24 = r22
            r25 = r24
            r23 = r5
            r21 = r13
        L_0x0039:
            if (r14 >= r3) goto L_0x017d
            android.view.View r26 = r6.getChildAt(r14)
            if (r26 != 0) goto L_0x0047
            int r5 = r6.g
            int r5 = r5 + r4
            r6.g = r5
            goto L_0x004f
        L_0x0047:
            int r5 = r26.getVisibility()
            if (r5 != r12) goto L_0x005b
            int r14 = r14 + 0
        L_0x004f:
            r10 = r0
            r28 = r1
            r0 = r2
            r30 = r3
            r4 = r19
            r27 = 1
            goto L_0x0166
        L_0x005b:
            boolean r5 = r6.a(r14)
            if (r5 == 0) goto L_0x0068
            int r5 = r6.g
            int r4 = r6.n
            int r5 = r5 + r4
            r6.g = r5
        L_0x0068:
            android.view.ViewGroup$LayoutParams r4 = r26.getLayoutParams()
            r5 = r4
            a.b.p.i0$a r5 = (a.b.p.i0.a) r5
            float r4 = r5.f138a
            float r21 = r21 + r4
            if (r1 != r15) goto L_0x0097
            int r12 = r5.height
            if (r12 != 0) goto L_0x0097
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0097
            int r4 = r6.g
            int r12 = r5.topMargin
            int r12 = r12 + r4
            int r15 = r5.bottomMargin
            int r12 = r12 + r15
            int r4 = java.lang.Math.max(r4, r12)
            r6.g = r4
            r10 = r0
            r28 = r1
            r29 = r2
            r30 = r3
            r13 = r5
            r5 = 1
            r27 = 1
            goto L_0x00ec
        L_0x0097:
            int r4 = r5.height
            if (r4 != 0) goto L_0x00a5
            float r4 = r5.f138a
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a5
            r5.height = r10
            r12 = 0
            goto L_0x00a6
        L_0x00a5:
            r12 = r11
        L_0x00a6:
            r4 = 0
            int r15 = (r21 > r13 ? 1 : (r21 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x00af
            int r15 = r6.g
            r10 = r0
            goto L_0x00b1
        L_0x00af:
            r10 = r0
            r15 = 0
        L_0x00b1:
            r0 = r37
            r28 = r1
            r1 = r26
            r29 = r2
            r2 = r38
            r30 = r3
            r3 = r4
            r13 = 0
            r4 = r39
            r13 = r5
            r27 = 1
            r5 = r15
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            if (r12 == r11) goto L_0x00cc
            r13.height = r12
        L_0x00cc:
            int r0 = r26.getMeasuredHeight()
            int r1 = r6.g
            int r2 = r1 + r0
            int r3 = r13.topMargin
            int r2 = r2 + r3
            int r3 = r13.bottomMargin
            int r2 = r2 + r3
            r3 = 0
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r6.g = r1
            r4 = r17
            if (r9 == 0) goto L_0x00ea
            int r17 = java.lang.Math.max(r0, r4)
        L_0x00ea:
            r5 = r22
        L_0x00ec:
            if (r10 < 0) goto L_0x00f6
            int r0 = r14 + 1
            if (r10 != r0) goto L_0x00f6
            int r0 = r6.g
            r6.d = r0
        L_0x00f6:
            if (r14 >= r10) goto L_0x0108
            float r0 = r13.f138a
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0100
            goto L_0x0108
        L_0x0100:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0108:
            r0 = r29
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x0118
            int r1 = r13.width
            r2 = -1
            if (r1 != r2) goto L_0x0118
            r1 = r27
            r24 = r1
            goto L_0x0119
        L_0x0118:
            r1 = 0
        L_0x0119:
            int r2 = r13.leftMargin
            int r3 = r13.rightMargin
            int r2 = r2 + r3
            int r3 = r26.getMeasuredWidth()
            int r3 = r3 + r2
            r12 = r19
            int r4 = java.lang.Math.max(r12, r3)
            int r12 = r26.getMeasuredState()
            r15 = r25
            int r12 = android.view.View.combineMeasuredStates(r15, r12)
            if (r23 == 0) goto L_0x013d
            int r15 = r13.width
            r11 = -1
            if (r15 != r11) goto L_0x013d
            r11 = r27
            goto L_0x013e
        L_0x013d:
            r11 = 0
        L_0x013e:
            float r13 = r13.f138a
            r15 = 0
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 <= 0) goto L_0x0150
            if (r1 == 0) goto L_0x0148
            goto L_0x0149
        L_0x0148:
            r2 = r3
        L_0x0149:
            r13 = r18
            int r18 = java.lang.Math.max(r13, r2)
            goto L_0x015e
        L_0x0150:
            r13 = r18
            if (r1 == 0) goto L_0x0155
            goto L_0x0156
        L_0x0155:
            r2 = r3
        L_0x0156:
            r1 = r20
            int r20 = java.lang.Math.max(r1, r2)
            r18 = r13
        L_0x015e:
            int r14 = r14 + 0
            r22 = r5
            r23 = r11
            r25 = r12
        L_0x0166:
            int r14 = r14 + 1
            r2 = r0
            r19 = r4
            r0 = r10
            r5 = r27
            r1 = r28
            r3 = r30
            r4 = 0
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r13 = 0
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x0039
        L_0x017d:
            r28 = r1
            r0 = r2
            r30 = r3
            r27 = r5
            r4 = r17
            r13 = r18
            r12 = r19
            r1 = r20
            r15 = r25
            int r2 = r6.g
            r10 = r30
            if (r2 <= 0) goto L_0x01a1
            boolean r2 = r6.a(r10)
            if (r2 == 0) goto L_0x01a1
            int r2 = r6.g
            int r3 = r6.n
            int r2 = r2 + r3
            r6.g = r2
        L_0x01a1:
            r2 = r28
            if (r9 == 0) goto L_0x01e5
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L_0x01ab
            if (r2 != 0) goto L_0x01e5
        L_0x01ab:
            r3 = 0
            r6.g = r3
            r5 = r3
        L_0x01af:
            if (r5 >= r10) goto L_0x01e5
            android.view.View r11 = r6.getChildAt(r5)
            if (r11 != 0) goto L_0x01bb
            int r11 = r6.g
            int r11 = r11 + r3
            goto L_0x01df
        L_0x01bb:
            int r3 = r11.getVisibility()
            r14 = 8
            if (r3 != r14) goto L_0x01c6
            int r5 = r5 + 0
            goto L_0x01e1
        L_0x01c6:
            android.view.ViewGroup$LayoutParams r3 = r11.getLayoutParams()
            a.b.p.i0$a r3 = (a.b.p.i0.a) r3
            int r11 = r6.g
            int r17 = r11 + r4
            int r14 = r3.topMargin
            int r17 = r17 + r14
            int r3 = r3.bottomMargin
            int r17 = r17 + r3
            r3 = 0
            int r14 = r17 + 0
            int r11 = java.lang.Math.max(r11, r14)
        L_0x01df:
            r6.g = r11
        L_0x01e1:
            int r5 = r5 + 1
            r3 = 0
            goto L_0x01af
        L_0x01e5:
            int r3 = r6.g
            int r5 = r37.getPaddingTop()
            int r11 = r37.getPaddingBottom()
            int r11 = r11 + r5
            int r11 = r11 + r3
            r6.g = r11
            int r3 = r37.getSuggestedMinimumHeight()
            int r3 = java.lang.Math.max(r11, r3)
            r5 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r8, r5)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r3
            int r11 = r6.g
            int r5 = r5 - r11
            if (r22 != 0) goto L_0x0252
            if (r5 == 0) goto L_0x0211
            r11 = 0
            int r14 = (r21 > r11 ? 1 : (r21 == r11 ? 0 : -1))
            if (r14 <= 0) goto L_0x0211
            goto L_0x0252
        L_0x0211:
            int r1 = java.lang.Math.max(r1, r13)
            if (r9 == 0) goto L_0x024e
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 == r5) goto L_0x024e
            r2 = 0
        L_0x021c:
            if (r2 >= r10) goto L_0x024e
            android.view.View r5 = r6.getChildAt(r2)
            if (r5 == 0) goto L_0x024b
            int r9 = r5.getVisibility()
            r11 = 8
            if (r9 != r11) goto L_0x022d
            goto L_0x024b
        L_0x022d:
            android.view.ViewGroup$LayoutParams r9 = r5.getLayoutParams()
            a.b.p.i0$a r9 = (a.b.p.i0.a) r9
            float r9 = r9.f138a
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x024b
            int r9 = r5.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r11)
            r5.measure(r9, r13)
        L_0x024b:
            int r2 = r2 + 1
            goto L_0x021c
        L_0x024e:
            r19 = r12
            goto L_0x032d
        L_0x0252:
            float r4 = r6.h
            r9 = 0
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x025b
            r21 = r4
        L_0x025b:
            r4 = 0
            r6.g = r4
            r4 = 0
        L_0x025f:
            if (r4 >= r10) goto L_0x031d
            android.view.View r9 = r6.getChildAt(r4)
            int r11 = r9.getVisibility()
            r13 = 8
            if (r11 != r13) goto L_0x0271
            r28 = r2
            goto L_0x0317
        L_0x0271:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            a.b.p.i0$a r11 = (a.b.p.i0.a) r11
            float r13 = r11.f138a
            r14 = 0
            int r16 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x02ca
            float r14 = (float) r5
            float r14 = r14 * r13
            float r14 = r14 / r21
            int r14 = (int) r14
            float r21 = r21 - r13
            int r5 = r5 - r14
            int r13 = r37.getPaddingLeft()
            int r16 = r37.getPaddingRight()
            int r16 = r16 + r13
            int r13 = r11.leftMargin
            int r16 = r16 + r13
            int r13 = r11.rightMargin
            int r13 = r16 + r13
            r16 = r5
            int r5 = r11.width
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r7, r13, r5)
            int r13 = r11.height
            if (r13 != 0) goto L_0x02ad
            r13 = 1073741824(0x40000000, float:2.0)
            if (r2 == r13) goto L_0x02a9
            goto L_0x02ad
        L_0x02a9:
            if (r14 <= 0) goto L_0x02b4
            r13 = r14
            goto L_0x02b5
        L_0x02ad:
            int r13 = r9.getMeasuredHeight()
            int r13 = r13 + r14
            if (r13 >= 0) goto L_0x02b5
        L_0x02b4:
            r13 = 0
        L_0x02b5:
            r14 = 1073741824(0x40000000, float:2.0)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r14)
            r9.measure(r5, r13)
            int r5 = r9.getMeasuredState()
            r5 = r5 & -256(0xffffffffffffff00, float:NaN)
            int r15 = android.view.View.combineMeasuredStates(r15, r5)
            r5 = r16
        L_0x02ca:
            int r13 = r11.leftMargin
            int r14 = r11.rightMargin
            int r13 = r13 + r14
            int r14 = r9.getMeasuredWidth()
            int r14 = r14 + r13
            int r12 = java.lang.Math.max(r12, r14)
            r28 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L_0x02e8
            int r2 = r11.width
            r16 = r5
            r5 = -1
            if (r2 != r5) goto L_0x02eb
            r2 = r27
            goto L_0x02ec
        L_0x02e8:
            r16 = r5
            r5 = -1
        L_0x02eb:
            r2 = 0
        L_0x02ec:
            if (r2 == 0) goto L_0x02ef
            goto L_0x02f0
        L_0x02ef:
            r13 = r14
        L_0x02f0:
            int r1 = java.lang.Math.max(r1, r13)
            if (r23 == 0) goto L_0x02fd
            int r2 = r11.width
            if (r2 != r5) goto L_0x02fd
            r5 = r27
            goto L_0x02fe
        L_0x02fd:
            r5 = 0
        L_0x02fe:
            int r2 = r6.g
            int r9 = r9.getMeasuredHeight()
            int r9 = r9 + r2
            int r13 = r11.topMargin
            int r9 = r9 + r13
            int r11 = r11.bottomMargin
            int r9 = r9 + r11
            r11 = 0
            int r9 = r9 + r11
            int r2 = java.lang.Math.max(r2, r9)
            r6.g = r2
            r23 = r5
            r5 = r16
        L_0x0317:
            int r4 = r4 + 1
            r2 = r28
            goto L_0x025f
        L_0x031d:
            int r2 = r6.g
            int r4 = r37.getPaddingTop()
            int r5 = r37.getPaddingBottom()
            int r5 = r5 + r4
            int r5 = r5 + r2
            r6.g = r5
            goto L_0x024e
        L_0x032d:
            if (r23 != 0) goto L_0x0334
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L_0x0334
            goto L_0x0336
        L_0x0334:
            r1 = r19
        L_0x0336:
            int r0 = r37.getPaddingLeft()
            int r2 = r37.getPaddingRight()
            int r2 = r2 + r0
            int r2 = r2 + r1
            int r0 = r37.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r2, r0)
            int r0 = android.view.View.resolveSizeAndState(r0, r7, r15)
            r6.setMeasuredDimension(r0, r3)
            if (r24 == 0) goto L_0x08c5
            int r0 = r37.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = 0
        L_0x035c:
            if (r9 >= r10) goto L_0x08c5
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x038a
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            a.b.p.i0$a r11 = (a.b.p.i0.a) r11
            int r0 = r11.width
            r2 = -1
            if (r0 != r2) goto L_0x038a
            int r12 = r11.height
            int r0 = r1.getMeasuredHeight()
            r11.height = r0
            r3 = 0
            r5 = 0
            r0 = r37
            r2 = r7
            r4 = r39
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.height = r12
        L_0x038a:
            int r9 = r9 + 1
            goto L_0x035c
        L_0x038d:
            r27 = r5
            r0 = r4
            r6.g = r0
            int r9 = r37.getVirtualChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r38)
            int r11 = android.view.View.MeasureSpec.getMode(r39)
            int[] r0 = r6.j
            r12 = 4
            if (r0 == 0) goto L_0x03a7
            int[] r0 = r6.k
            if (r0 != 0) goto L_0x03af
        L_0x03a7:
            int[] r0 = new int[r12]
            r6.j = r0
            int[] r0 = new int[r12]
            r6.k = r0
        L_0x03af:
            int[] r13 = r6.j
            int[] r14 = r6.k
            r15 = 3
            r0 = -1
            r13[r15] = r0
            r17 = 2
            r13[r17] = r0
            r13[r27] = r0
            r1 = 0
            r13[r1] = r0
            r14[r15] = r0
            r14[r17] = r0
            r14[r27] = r0
            r14[r1] = r0
            boolean r5 = r6.f137b
            boolean r4 = r6.i
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L_0x03d3
            r18 = r27
            goto L_0x03d5
        L_0x03d3:
            r18 = 0
        L_0x03d5:
            r23 = r27
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r8 = 0
            r12 = 0
            r15 = 0
            r22 = 0
            r24 = 0
        L_0x03e2:
            if (r3 >= r9) goto L_0x058d
            android.view.View r7 = r6.getChildAt(r3)
            if (r7 != 0) goto L_0x03f7
            int r7 = r6.g
            r25 = 0
            int r7 = r7 + 0
            r6.g = r7
            r25 = r0
            r26 = r2
            goto L_0x0405
        L_0x03f7:
            r25 = r0
            int r0 = r7.getVisibility()
            r26 = r2
            r2 = 8
            if (r0 != r2) goto L_0x040f
            int r3 = r3 + 0
        L_0x0405:
            r29 = r5
            r0 = r25
            r2 = r26
            r26 = r4
            goto L_0x0583
        L_0x040f:
            boolean r0 = r6.a(r3)
            if (r0 == 0) goto L_0x041c
            int r0 = r6.g
            int r2 = r6.m
            int r0 = r0 + r2
            r6.g = r0
        L_0x041c:
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            r2 = r0
            a.b.p.i0$a r2 = (a.b.p.i0.a) r2
            float r0 = r2.f138a
            float r28 = r1 + r0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 != r1) goto L_0x047b
            int r1 = r2.width
            if (r1 != 0) goto L_0x047b
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x047b
            if (r18 == 0) goto L_0x0443
            int r0 = r6.g
            int r1 = r2.leftMargin
            r29 = r3
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r1 = r1 + r0
            r6.g = r1
            goto L_0x0453
        L_0x0443:
            r29 = r3
            int r0 = r6.g
            int r1 = r2.leftMargin
            int r1 = r1 + r0
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r0 = java.lang.Math.max(r0, r1)
            r6.g = r0
        L_0x0453:
            if (r5 == 0) goto L_0x046a
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r7.measure(r1, r1)
            r1 = r2
            r32 = r25
            r33 = r26
            r25 = r29
            r26 = r4
            r29 = r5
            goto L_0x04f2
        L_0x046a:
            r1 = r2
            r32 = r25
            r33 = r26
            r25 = r29
            r0 = 1073741824(0x40000000, float:2.0)
            r26 = r4
            r29 = r5
            r5 = r27
            goto L_0x04f6
        L_0x047b:
            r29 = r3
            int r0 = r2.width
            if (r0 != 0) goto L_0x048d
            float r0 = r2.f138a
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x048e
            r0 = -2
            r2.width = r0
            r3 = 0
            goto L_0x0490
        L_0x048d:
            r1 = 0
        L_0x048e:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0490:
            int r0 = (r28 > r1 ? 1 : (r28 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0499
            int r0 = r6.g
            r30 = r0
            goto L_0x049b
        L_0x0499:
            r30 = 0
        L_0x049b:
            r31 = 0
            r1 = r25
            r0 = r37
            r32 = r1
            r1 = r7
            r34 = r2
            r33 = r26
            r2 = r38
            r35 = r3
            r25 = r29
            r3 = r30
            r26 = r4
            r4 = r39
            r29 = r5
            r5 = r31
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r0 = r35
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x04c6
            r1 = r34
            r1.width = r0
            goto L_0x04c8
        L_0x04c6:
            r1 = r34
        L_0x04c8:
            int r0 = r7.getMeasuredWidth()
            int r2 = r6.g
            if (r18 == 0) goto L_0x04dc
            int r3 = r1.leftMargin
            int r3 = r3 + r0
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            r4 = 0
            int r3 = r3 + r4
            int r3 = r3 + r2
            r6.g = r3
            goto L_0x04ec
        L_0x04dc:
            r4 = 0
            int r3 = r2 + r0
            int r5 = r1.leftMargin
            int r3 = r3 + r5
            int r5 = r1.rightMargin
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r2 = java.lang.Math.max(r2, r3)
            r6.g = r2
        L_0x04ec:
            if (r26 == 0) goto L_0x04f2
            int r8 = java.lang.Math.max(r0, r8)
        L_0x04f2:
            r5 = r22
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x04f6:
            if (r11 == r0) goto L_0x0502
            int r0 = r1.height
            r2 = -1
            if (r0 != r2) goto L_0x0502
            r0 = r27
            r24 = r0
            goto L_0x0503
        L_0x0502:
            r0 = 0
        L_0x0503:
            int r2 = r1.topMargin
            int r3 = r1.bottomMargin
            int r2 = r2 + r3
            int r3 = r7.getMeasuredHeight()
            int r3 = r3 + r2
            int r4 = r7.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r12, r4)
            if (r29 == 0) goto L_0x0545
            int r7 = r7.getBaseline()
            r12 = -1
            if (r7 == r12) goto L_0x0545
            int r12 = r1.f139b
            if (r12 >= 0) goto L_0x0524
            int r12 = r6.f
        L_0x0524:
            r12 = r12 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r12 = r12 >> 4
            r22 = -2
            r12 = r12 & -2
            int r12 = r12 >> 1
            r22 = r2
            r2 = r13[r12]
            int r2 = java.lang.Math.max(r2, r7)
            r13[r12] = r2
            r2 = r14[r12]
            int r7 = r3 - r7
            int r2 = java.lang.Math.max(r2, r7)
            r14[r12] = r2
            goto L_0x0547
        L_0x0545:
            r22 = r2
        L_0x0547:
            int r2 = java.lang.Math.max(r15, r3)
            if (r23 == 0) goto L_0x0555
            int r7 = r1.height
            r12 = -1
            if (r7 != r12) goto L_0x0555
            r7 = r27
            goto L_0x0556
        L_0x0555:
            r7 = 0
        L_0x0556:
            float r1 = r1.f138a
            r12 = 0
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x0568
            if (r0 == 0) goto L_0x0561
            r3 = r22
        L_0x0561:
            r1 = r32
            int r0 = java.lang.Math.max(r1, r3)
            goto L_0x0577
        L_0x0568:
            r1 = r32
            if (r0 == 0) goto L_0x056e
            r3 = r22
        L_0x056e:
            r0 = r33
            int r0 = java.lang.Math.max(r0, r3)
            r33 = r0
            r0 = r1
        L_0x0577:
            int r3 = r25 + 0
            r15 = r2
            r12 = r4
            r22 = r5
            r23 = r7
            r1 = r28
            r2 = r33
        L_0x0583:
            int r3 = r3 + 1
            r7 = r38
            r4 = r26
            r5 = r29
            goto L_0x03e2
        L_0x058d:
            r26 = r4
            r29 = r5
            r36 = r2
            r2 = r0
            r0 = r36
            int r3 = r6.g
            if (r3 <= 0) goto L_0x05a7
            boolean r3 = r6.a(r9)
            if (r3 == 0) goto L_0x05a7
            int r3 = r6.g
            int r4 = r6.m
            int r3 = r3 + r4
            r6.g = r3
        L_0x05a7:
            r3 = r13[r27]
            r4 = -1
            if (r3 != r4) goto L_0x05be
            r3 = 0
            r5 = r13[r3]
            if (r5 != r4) goto L_0x05be
            r3 = r13[r17]
            if (r3 != r4) goto L_0x05be
            r3 = 3
            r5 = r13[r3]
            if (r5 == r4) goto L_0x05bb
            goto L_0x05bf
        L_0x05bb:
            r25 = r12
            goto L_0x05f1
        L_0x05be:
            r3 = 3
        L_0x05bf:
            r4 = r13[r3]
            r5 = 0
            r7 = r13[r5]
            r5 = r13[r27]
            r3 = r13[r17]
            int r3 = java.lang.Math.max(r5, r3)
            int r3 = java.lang.Math.max(r7, r3)
            int r3 = java.lang.Math.max(r4, r3)
            r4 = 3
            r5 = r14[r4]
            r4 = 0
            r7 = r14[r4]
            r4 = r14[r27]
            r25 = r12
            r12 = r14[r17]
            int r4 = java.lang.Math.max(r4, r12)
            int r4 = java.lang.Math.max(r7, r4)
            int r4 = java.lang.Math.max(r5, r4)
            int r4 = r4 + r3
            int r15 = java.lang.Math.max(r15, r4)
        L_0x05f1:
            if (r26 == 0) goto L_0x063f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r3) goto L_0x05f9
            if (r10 != 0) goto L_0x063f
        L_0x05f9:
            r3 = 0
            r6.g = r3
            r4 = r3
        L_0x05fd:
            if (r4 >= r9) goto L_0x063f
            android.view.View r5 = r6.getChildAt(r4)
            if (r5 != 0) goto L_0x0609
            int r5 = r6.g
            int r5 = r5 + r3
            goto L_0x0639
        L_0x0609:
            int r3 = r5.getVisibility()
            r7 = 8
            if (r3 != r7) goto L_0x0614
            int r4 = r4 + 0
            goto L_0x063b
        L_0x0614:
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            a.b.p.i0$a r3 = (a.b.p.i0.a) r3
            int r5 = r6.g
            if (r18 == 0) goto L_0x062a
            int r7 = r3.leftMargin
            int r7 = r7 + r8
            int r3 = r3.rightMargin
            int r7 = r7 + r3
            r12 = 0
            int r7 = r7 + r12
            int r7 = r7 + r5
            r6.g = r7
            goto L_0x063b
        L_0x062a:
            r12 = 0
            int r7 = r5 + r8
            int r12 = r3.leftMargin
            int r7 = r7 + r12
            int r3 = r3.rightMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            int r5 = java.lang.Math.max(r5, r7)
        L_0x0639:
            r6.g = r5
        L_0x063b:
            int r4 = r4 + 1
            r3 = 0
            goto L_0x05fd
        L_0x063f:
            int r3 = r6.g
            int r4 = r37.getPaddingLeft()
            int r5 = r37.getPaddingRight()
            int r5 = r5 + r4
            int r5 = r5 + r3
            r6.g = r5
            int r3 = r37.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r5, r3)
            r7 = r38
            r4 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r7, r4)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r3
            int r5 = r6.g
            int r4 = r4 - r5
            if (r22 != 0) goto L_0x06b3
            if (r4 == 0) goto L_0x066d
            r12 = 0
            int r16 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r16 <= 0) goto L_0x066d
            goto L_0x06b3
        L_0x066d:
            int r0 = java.lang.Math.max(r0, r2)
            if (r26 == 0) goto L_0x06aa
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 == r1) goto L_0x06aa
            r4 = 0
        L_0x0678:
            if (r4 >= r9) goto L_0x06aa
            android.view.View r1 = r6.getChildAt(r4)
            if (r1 == 0) goto L_0x06a7
            int r2 = r1.getVisibility()
            r10 = 8
            if (r2 != r10) goto L_0x0689
            goto L_0x06a7
        L_0x0689:
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            a.b.p.i0$a r2 = (a.b.p.i0.a) r2
            float r2 = r2.f138a
            r10 = 0
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x06a7
            r2 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r2)
            int r12 = r1.getMeasuredHeight()
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r2)
            r1.measure(r10, r12)
        L_0x06a7:
            int r4 = r4 + 1
            goto L_0x0678
        L_0x06aa:
            r8 = r39
            r22 = r9
            r12 = r25
        L_0x06b0:
            r5 = 0
            goto L_0x085c
        L_0x06b3:
            float r2 = r6.h
            r8 = 0
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x06bb
            r1 = r2
        L_0x06bb:
            r2 = 3
            r8 = -1
            r13[r2] = r8
            r13[r17] = r8
            r13[r27] = r8
            r12 = 0
            r13[r12] = r8
            r14[r2] = r8
            r14[r17] = r8
            r14[r27] = r8
            r14[r12] = r8
            r6.g = r12
            r8 = r4
            r12 = r25
            r2 = -1
            r4 = 0
        L_0x06d5:
            if (r4 >= r9) goto L_0x0803
            android.view.View r15 = r6.getChildAt(r4)
            if (r15 == 0) goto L_0x07ec
            int r5 = r15.getVisibility()
            r7 = 8
            if (r5 != r7) goto L_0x06e7
            goto L_0x07ec
        L_0x06e7:
            android.view.ViewGroup$LayoutParams r5 = r15.getLayoutParams()
            a.b.p.i0$a r5 = (a.b.p.i0.a) r5
            float r7 = r5.f138a
            r19 = 0
            int r22 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r22 <= 0) goto L_0x0749
            r22 = r9
            float r9 = (float) r8
            float r9 = r9 * r7
            float r9 = r9 / r1
            int r9 = (int) r9
            float r1 = r1 - r7
            int r8 = r8 - r9
            int r7 = r37.getPaddingTop()
            int r25 = r37.getPaddingBottom()
            int r25 = r25 + r7
            int r7 = r5.topMargin
            int r25 = r25 + r7
            int r7 = r5.bottomMargin
            int r7 = r25 + r7
            r25 = r1
            int r1 = r5.height
            r26 = r8
            r8 = r39
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r8, r7, r1)
            int r7 = r5.width
            if (r7 != 0) goto L_0x0728
            r7 = 1073741824(0x40000000, float:2.0)
            if (r10 == r7) goto L_0x0724
            goto L_0x0728
        L_0x0724:
            if (r9 <= 0) goto L_0x072f
            r7 = r9
            goto L_0x0730
        L_0x0728:
            int r7 = r15.getMeasuredWidth()
            int r7 = r7 + r9
            if (r7 >= 0) goto L_0x0730
        L_0x072f:
            r7 = 0
        L_0x0730:
            r9 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            r15.measure(r7, r1)
            int r1 = r15.getMeasuredState()
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r7
            int r12 = android.view.View.combineMeasuredStates(r12, r1)
            r1 = r25
            r7 = r26
            goto L_0x074e
        L_0x0749:
            r7 = r8
            r22 = r9
            r8 = r39
        L_0x074e:
            if (r18 == 0) goto L_0x076a
            int r9 = r6.g
            int r25 = r15.getMeasuredWidth()
            r26 = r1
            int r1 = r5.leftMargin
            int r25 = r25 + r1
            int r1 = r5.rightMargin
            int r25 = r25 + r1
            r1 = 0
            int r25 = r25 + 0
            int r9 = r25 + r9
            r6.g = r9
            r28 = r7
            goto L_0x0788
        L_0x076a:
            r26 = r1
            r1 = 0
            int r9 = r6.g
            int r25 = r15.getMeasuredWidth()
            int r25 = r25 + r9
            int r1 = r5.leftMargin
            int r25 = r25 + r1
            int r1 = r5.rightMargin
            int r25 = r25 + r1
            r28 = r7
            r1 = 0
            int r7 = r25 + 0
            int r1 = java.lang.Math.max(r9, r7)
            r6.g = r1
        L_0x0788:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L_0x0794
            int r1 = r5.height
            r7 = -1
            if (r1 != r7) goto L_0x0794
            r1 = r27
            goto L_0x0795
        L_0x0794:
            r1 = 0
        L_0x0795:
            int r7 = r5.topMargin
            int r9 = r5.bottomMargin
            int r7 = r7 + r9
            int r9 = r15.getMeasuredHeight()
            int r9 = r9 + r7
            int r2 = java.lang.Math.max(r2, r9)
            if (r1 == 0) goto L_0x07a6
            goto L_0x07a7
        L_0x07a6:
            r7 = r9
        L_0x07a7:
            int r0 = java.lang.Math.max(r0, r7)
            if (r23 == 0) goto L_0x07b5
            int r1 = r5.height
            r7 = -1
            if (r1 != r7) goto L_0x07b6
            r1 = r27
            goto L_0x07b7
        L_0x07b5:
            r7 = -1
        L_0x07b6:
            r1 = 0
        L_0x07b7:
            if (r29 == 0) goto L_0x07e3
            int r15 = r15.getBaseline()
            if (r15 == r7) goto L_0x07e3
            int r5 = r5.f139b
            if (r5 >= 0) goto L_0x07c5
            int r5 = r6.f
        L_0x07c5:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r5 = r5 >> 4
            r25 = -2
            r5 = r5 & -2
            int r5 = r5 >> 1
            r7 = r13[r5]
            int r7 = java.lang.Math.max(r7, r15)
            r13[r5] = r7
            r7 = r14[r5]
            int r9 = r9 - r15
            int r7 = java.lang.Math.max(r7, r9)
            r14[r5] = r7
            goto L_0x07e7
        L_0x07e3:
            r21 = 4
            r25 = -2
        L_0x07e7:
            r23 = r1
            r1 = r26
            goto L_0x07f9
        L_0x07ec:
            r7 = r8
            r22 = r9
            r19 = 0
            r21 = 4
            r25 = -2
            r8 = r39
            r28 = r7
        L_0x07f9:
            int r4 = r4 + 1
            r7 = r38
            r9 = r22
            r8 = r28
            goto L_0x06d5
        L_0x0803:
            r8 = r39
            r22 = r9
            int r1 = r6.g
            int r4 = r37.getPaddingLeft()
            int r5 = r37.getPaddingRight()
            int r5 = r5 + r4
            int r5 = r5 + r1
            r6.g = r5
            r1 = r13[r27]
            r4 = -1
            if (r1 != r4) goto L_0x082c
            r1 = 0
            r5 = r13[r1]
            if (r5 != r4) goto L_0x082c
            r1 = r13[r17]
            if (r1 != r4) goto L_0x082c
            r1 = 3
            r5 = r13[r1]
            if (r5 == r4) goto L_0x0829
            goto L_0x082d
        L_0x0829:
            r15 = r2
            goto L_0x06b0
        L_0x082c:
            r1 = 3
        L_0x082d:
            r4 = r13[r1]
            r5 = 0
            r7 = r13[r5]
            r9 = r13[r27]
            r10 = r13[r17]
            int r9 = java.lang.Math.max(r9, r10)
            int r7 = java.lang.Math.max(r7, r9)
            int r4 = java.lang.Math.max(r4, r7)
            r1 = r14[r1]
            r7 = r14[r5]
            r9 = r14[r27]
            r10 = r14[r17]
            int r9 = java.lang.Math.max(r9, r10)
            int r7 = java.lang.Math.max(r7, r9)
            int r1 = java.lang.Math.max(r1, r7)
            int r1 = r1 + r4
            int r1 = java.lang.Math.max(r2, r1)
            r15 = r1
        L_0x085c:
            if (r23 != 0) goto L_0x0863
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L_0x0863
            goto L_0x0864
        L_0x0863:
            r0 = r15
        L_0x0864:
            int r1 = r37.getPaddingTop()
            int r2 = r37.getPaddingBottom()
            int r2 = r2 + r1
            int r2 = r2 + r0
            int r0 = r37.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r2, r0)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r12
            r1 = r1 | r3
            int r2 = r12 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r8, r2)
            r6.setMeasuredDimension(r1, r0)
            if (r24 == 0) goto L_0x08c5
            int r0 = r37.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r8 = r5
            r9 = r22
        L_0x0892:
            if (r8 >= r9) goto L_0x08c5
            android.view.View r1 = r6.getChildAt(r8)
            int r0 = r1.getVisibility()
            r10 = 8
            if (r0 == r10) goto L_0x08c1
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            a.b.p.i0$a r11 = (a.b.p.i0.a) r11
            int r0 = r11.height
            r12 = -1
            if (r0 != r12) goto L_0x08c2
            int r13 = r11.width
            int r0 = r1.getMeasuredWidth()
            r11.width = r0
            r3 = 0
            r5 = 0
            r0 = r37
            r2 = r38
            r4 = r7
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.width = r13
            goto L_0x08c2
        L_0x08c1:
            r12 = -1
        L_0x08c2:
            int r8 = r8 + 1
            goto L_0x0892
        L_0x08c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.i0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f137b = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            StringBuilder a2 = b.a.a.a.a.a("base aligned child index out of range (0, ");
            a2.append(getChildCount());
            a2.append(")");
            throw new IllegalArgumentException(a2.toString());
        }
        this.c = i2;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.l) {
            this.l = drawable;
            boolean z = false;
            if (drawable != null) {
                this.m = drawable.getIntrinsicWidth();
                this.n = drawable.getIntrinsicHeight();
            } else {
                this.m = 0;
                this.n = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i2) {
        this.p = i2;
    }

    public void setGravity(int i2) {
        if (this.f != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & j.AppCompatTheme_tooltipForegroundColor) == 0) {
                i2 |= 48;
            }
            this.f = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f;
        if ((8388615 & i4) != i3) {
            this.f = i3 | (-8388616 & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.i = z;
    }

    public void setOrientation(int i2) {
        if (this.e != i2) {
            this.e = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.o) {
            requestLayout();
        }
        this.o = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & j.AppCompatTheme_tooltipForegroundColor;
        int i4 = this.f;
        if ((i4 & j.AppCompatTheme_tooltipForegroundColor) != i3) {
            this.f = i3 | (i4 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.h = Math.max(0.0f, f2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
