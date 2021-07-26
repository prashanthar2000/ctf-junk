package a.b.p;

import a.b.j;
import a.b.l.a.a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f153a;

    /* renamed from: b  reason: collision with root package name */
    public v0 f154b;

    public m(ImageView imageView) {
        this.f153a = imageView;
    }

    public void a() {
        v0 v0Var;
        Drawable drawable = this.f153a.getDrawable();
        if (drawable != null) {
            e0.b(drawable);
        }
        if (drawable != null && (v0Var = this.f154b) != null) {
            j.a(drawable, v0Var, this.f153a.getDrawableState());
        }
    }

    public void a(int i) {
        if (i != 0) {
            Drawable b2 = a.b(this.f153a.getContext(), i);
            if (b2 != null) {
                e0.b(b2);
            }
            this.f153a.setImageDrawable(b2);
        } else {
            this.f153a.setImageDrawable((Drawable) null);
        }
        a();
    }

    public void a(ColorStateList colorStateList) {
        if (this.f154b == null) {
            this.f154b = new v0();
        }
        v0 v0Var = this.f154b;
        v0Var.f173a = colorStateList;
        v0Var.d = true;
        a();
    }

    public void a(PorterDuff.Mode mode) {
        if (this.f154b == null) {
            this.f154b = new v0();
        }
        v0 v0Var = this.f154b;
        v0Var.f174b = mode;
        v0Var.c = true;
        a();
    }

    public void a(AttributeSet attributeSet, int i) {
        int e;
        x0 a2 = x0.a(this.f153a.getContext(), attributeSet, j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f153a.getDrawable();
            if (!(drawable != null || (e = a2.e(j.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = a.b(this.f153a.getContext(), e)) == null)) {
                this.f153a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                e0.b(drawable);
            }
            if (a2.f(j.AppCompatImageView_tint)) {
                this.f153a.setImageTintList(a2.a(j.AppCompatImageView_tint));
            }
            if (a2.f(j.AppCompatImageView_tintMode)) {
                this.f153a.setImageTintMode(e0.a(a2.c(j.AppCompatImageView_tintMode, -1), (PorterDuff.Mode) null));
            }
            a2.f186b.recycle();
        } catch (Throwable th) {
            a2.f186b.recycle();
            throw th;
        }
    }
}
