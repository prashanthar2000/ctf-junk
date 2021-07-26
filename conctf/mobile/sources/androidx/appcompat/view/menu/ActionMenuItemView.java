package androidx.appcompat.view.menu;

import a.b.j;
import a.b.k.o;
import a.b.o.i.g;
import a.b.o.i.i;
import a.b.o.i.n;
import a.b.o.i.p;
import a.b.p.c;
import a.b.p.h0;
import a.b.p.z;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;

public class ActionMenuItemView extends z implements n.a, View.OnClickListener, ActionMenuView.a {
    public i f;
    public CharSequence g;
    public Drawable h;
    public g.b i;
    public h0 j;
    public b k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;

    public class a extends h0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        public p b() {
            c.a aVar;
            b bVar = ActionMenuItemView.this.k;
            if (bVar == null || (aVar = c.this.v) == null) {
                return null;
            }
            return aVar.a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = b();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                a.b.o.i.g$b r1 = r0.i
                r2 = 0
                if (r1 == 0) goto L_0x001c
                a.b.o.i.i r0 = r0.f
                boolean r0 = r1.a(r0)
                if (r0 == 0) goto L_0x001c
                a.b.o.i.p r0 = r3.b()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.a()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.a.c():boolean");
        }
    }

    public static abstract class b {
    }

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.l = f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionMenuItemView, i2, 0);
        this.n = obtainStyledAttributes.getDimensionPixelSize(j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.p = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.o = -1;
        setSaveEnabled(false);
    }

    public void a(i iVar, int i2) {
        CharSequence charSequence;
        this.f = iVar;
        setIcon(iVar.getIcon());
        if (c()) {
            charSequence = iVar.getTitleCondensed();
        } else {
            charSequence = iVar.e;
        }
        setTitle(charSequence);
        setId(iVar.f91a);
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.j == null) {
            this.j = new a();
        }
    }

    public boolean a() {
        return e() && this.f.getIcon() == null;
    }

    public boolean b() {
        return e();
    }

    public boolean c() {
        return true;
    }

    public boolean e() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.g);
        if (this.h != null) {
            if (!((this.f.y & 4) == 4) || (!this.l && !this.m)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.g : null);
        CharSequence charSequence2 = this.f.q;
        if (TextUtils.isEmpty(charSequence2)) {
            if (z3) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f.e;
            }
        }
        setContentDescription(charSequence2);
        CharSequence charSequence3 = this.f.r;
        if (TextUtils.isEmpty(charSequence3)) {
            if (!z3) {
                charSequence = this.f.e;
            }
            o.a((View) this, charSequence);
            return;
        }
        o.a((View) this, charSequence3);
    }

    public i getItemData() {
        return this.f;
    }

    public void onClick(View view) {
        g.b bVar = this.i;
        if (bVar != null) {
            bVar.a(this.f);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.l = f();
        g();
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        boolean e = e();
        if (e && (i4 = this.o) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.n) : this.n;
        if (mode != 1073741824 && this.n > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!e && this.h != null) {
            super.setPadding((getMeasuredWidth() - this.h.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var;
        if (!this.f.hasSubMenu() || (h0Var = this.j) == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.m != z) {
            this.m = z;
            i iVar = this.f;
            if (iVar != null) {
                iVar.n.h();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.h = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.p;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i2) / ((float) intrinsicWidth)));
                intrinsicWidth = i2;
            }
            int i3 = this.p;
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i3) / ((float) intrinsicHeight)));
                intrinsicHeight = i3;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        g();
    }

    public void setItemInvoker(g.b bVar) {
        this.i = bVar;
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        this.o = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.k = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.g = charSequence;
        g();
    }
}
