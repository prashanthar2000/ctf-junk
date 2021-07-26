package a.b.p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class l extends ImageButton {

    /* renamed from: b  reason: collision with root package name */
    public final e f152b;
    public final m c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        u0.a(context);
        e eVar = new e(this);
        this.f152b = eVar;
        eVar.a(attributeSet, i);
        m mVar = new m(this);
        this.c = mVar;
        mVar.a(attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f152b;
        if (eVar != null) {
            eVar.a();
        }
        m mVar = this.c;
        if (mVar != null) {
            mVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f152b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f152b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        v0 v0Var;
        m mVar = this.c;
        if (mVar == null || (v0Var = mVar.f154b) == null) {
            return null;
        }
        return v0Var.f173a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        v0 v0Var;
        m mVar = this.c;
        if (mVar == null || (v0Var = mVar.f154b) == null) {
            return null;
        }
        return v0Var.f174b;
    }

    public boolean hasOverlappingRendering() {
        if (!(!(this.c.f153a.getBackground() instanceof RippleDrawable)) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f152b;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f152b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m mVar = this.c;
        if (mVar != null) {
            mVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m mVar = this.c;
        if (mVar != null) {
            mVar.a();
        }
    }

    public void setImageResource(int i) {
        this.c.a(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m mVar = this.c;
        if (mVar != null) {
            mVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f152b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f152b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        m mVar = this.c;
        if (mVar != null) {
            mVar.a(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        m mVar = this.c;
        if (mVar != null) {
            mVar.a(mode);
        }
    }
}
