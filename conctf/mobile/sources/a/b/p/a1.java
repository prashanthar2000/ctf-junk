package a.b.p;

import a.b.d;
import a.f.k.k;
import a.f.k.o;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;

public class a1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static a1 k;
    public static a1 l;

    /* renamed from: b  reason: collision with root package name */
    public final View f111b;
    public final CharSequence c;
    public final int d;
    public final Runnable e = new a();
    public final Runnable f = new b();
    public int g;
    public int h;
    public b1 i;
    public boolean j;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            a1.this.a(false);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            a1.this.b();
        }
    }

    public a1(View view, CharSequence charSequence) {
        this.f111b = view;
        this.c = charSequence;
        this.d = o.a(ViewConfiguration.get(view.getContext()));
        a();
        this.f111b.setOnLongClickListener(this);
        this.f111b.setOnHoverListener(this);
    }

    public static void a(a1 a1Var) {
        a1 a1Var2 = k;
        if (a1Var2 != null) {
            a1Var2.f111b.removeCallbacks(a1Var2.e);
        }
        k = a1Var;
        if (a1Var != null) {
            a1Var.f111b.postDelayed(a1Var.e, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
    }

    public void b() {
        if (l == this) {
            l = null;
            b1 b1Var = this.i;
            if (b1Var != null) {
                b1Var.a();
                this.i = null;
                a();
                this.f111b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (k == this) {
            a((a1) null);
        }
        this.f111b.removeCallbacks(this.f);
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.i != null && this.j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f111b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                a();
                b();
            }
        } else if (this.f111b.isEnabled() && this.i == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.g) > this.d || Math.abs(y - this.h) > this.d) {
                this.g = x;
                this.h = y;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                a(this);
            }
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.g = view.getWidth() / 2;
        this.h = view.getHeight() / 2;
        a(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }

    public void a(boolean z) {
        int i2;
        int i3;
        long j2;
        if (k.h(this.f111b)) {
            a((a1) null);
            a1 a1Var = l;
            if (a1Var != null) {
                a1Var.b();
            }
            l = this;
            this.j = z;
            b1 b1Var = new b1(this.f111b.getContext());
            this.i = b1Var;
            View view = this.f111b;
            int i4 = this.g;
            int i5 = this.h;
            boolean z2 = this.j;
            CharSequence charSequence = this.c;
            if (b1Var.f117b.getParent() != null) {
                b1Var.a();
            }
            b1Var.c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = b1Var.d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = b1Var.f116a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i4 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = b1Var.f116a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_extra_offset);
                i2 = i5 + dimensionPixelOffset2;
                i3 = i5 - dimensionPixelOffset2;
            } else {
                i2 = view.getHeight();
                i3 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = b1Var.f116a.getResources().getDimensionPixelOffset(z2 ? d.tooltip_y_offset_touch : d.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(b1Var.e);
                Rect rect = b1Var.e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = b1Var.f116a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    b1Var.e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(b1Var.g);
                view.getLocationOnScreen(b1Var.f);
                int[] iArr = b1Var.f;
                int i6 = iArr[0];
                int[] iArr2 = b1Var.g;
                iArr[0] = i6 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i4) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                b1Var.f117b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = b1Var.f117b.getMeasuredHeight();
                int[] iArr3 = b1Var.f;
                int i7 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
                int i8 = iArr3[1] + i2 + dimensionPixelOffset3;
                if (!z2 ? measuredHeight + i8 > b1Var.e.height() : i7 >= 0) {
                    layoutParams.y = i7;
                } else {
                    layoutParams.y = i8;
                }
            }
            ((WindowManager) b1Var.f116a.getSystemService("window")).addView(b1Var.f117b, b1Var.d);
            this.f111b.addOnAttachStateChangeListener(this);
            if (this.j) {
                j2 = 2500;
            } else {
                j2 = ((this.f111b.getWindowSystemUiVisibility() & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f111b.removeCallbacks(this.f);
            this.f111b.postDelayed(this.f, j2);
        }
    }
}
