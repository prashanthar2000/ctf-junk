package a.b.p;

import a.b.j;
import a.f.k.k;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final View f123a;

    /* renamed from: b  reason: collision with root package name */
    public final j f124b;
    public int c = -1;
    public v0 d;
    public v0 e;
    public v0 f;

    public e(View view) {
        this.f123a = view;
        this.f124b = j.a();
    }

    public void a() {
        Drawable background = this.f123a.getBackground();
        if (background != null) {
            boolean z = true;
            if (this.d != null) {
                if (this.f == null) {
                    this.f = new v0();
                }
                v0 v0Var = this.f;
                v0Var.f173a = null;
                v0Var.d = false;
                v0Var.f174b = null;
                v0Var.c = false;
                ColorStateList b2 = k.b(this.f123a);
                if (b2 != null) {
                    v0Var.d = true;
                    v0Var.f173a = b2;
                }
                PorterDuff.Mode backgroundTintMode = this.f123a.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    v0Var.c = true;
                    v0Var.f174b = backgroundTintMode;
                }
                if (v0Var.d || v0Var.c) {
                    j.a(background, v0Var, this.f123a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            v0 v0Var2 = this.e;
            if (v0Var2 != null) {
                j.a(background, v0Var2, this.f123a.getDrawableState());
                return;
            }
            v0 v0Var3 = this.d;
            if (v0Var3 != null) {
                j.a(background, v0Var3, this.f123a.getDrawableState());
            }
        }
    }

    public void a(int i) {
        this.c = i;
        j jVar = this.f124b;
        a(jVar != null ? jVar.b(this.f123a.getContext(), i) : null);
        a();
    }

    public void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new v0();
            }
            v0 v0Var = this.d;
            v0Var.f173a = colorStateList;
            v0Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void a(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new v0();
        }
        v0 v0Var = this.e;
        v0Var.f174b = mode;
        v0Var.c = true;
        a();
    }

    public ColorStateList b() {
        v0 v0Var = this.e;
        if (v0Var != null) {
            return v0Var.f173a;
        }
        return null;
    }

    public void b(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new v0();
        }
        v0 v0Var = this.e;
        v0Var.f173a = colorStateList;
        v0Var.d = true;
        a();
    }

    public PorterDuff.Mode c() {
        v0 v0Var = this.e;
        if (v0Var != null) {
            return v0Var.f174b;
        }
        return null;
    }

    public void d() {
        this.c = -1;
        a((ColorStateList) null);
        a();
    }

    public void a(AttributeSet attributeSet, int i) {
        x0 a2 = x0.a(this.f123a.getContext(), attributeSet, j.ViewBackgroundHelper, i, 0);
        try {
            if (a2.f(j.ViewBackgroundHelper_android_background)) {
                this.c = a2.e(j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b2 = this.f124b.b(this.f123a.getContext(), this.c);
                if (b2 != null) {
                    a(b2);
                }
            }
            if (a2.f(j.ViewBackgroundHelper_backgroundTint)) {
                k.a(this.f123a, a2.a(j.ViewBackgroundHelper_backgroundTint));
            }
            if (a2.f(j.ViewBackgroundHelper_backgroundTintMode)) {
                k.a(this.f123a, e0.a(a2.c(j.ViewBackgroundHelper_backgroundTintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            a2.f186b.recycle();
        }
    }
}
