package a.b.p;

import a.b.l.a.a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckBox;

public class g extends CheckBox {

    /* renamed from: b  reason: collision with root package name */
    public final i f130b;
    public final e c;
    public final y d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = a.b.a.checkboxStyle
            a.b.p.u0.a(r2)
            r1.<init>(r2, r3, r0)
            a.b.p.i r2 = new a.b.p.i
            r2.<init>(r1)
            r1.f130b = r2
            r2.a(r3, r0)
            a.b.p.e r2 = new a.b.p.e
            r2.<init>(r1)
            r1.c = r2
            r2.a(r3, r0)
            a.b.p.y r2 = new a.b.p.y
            r2.<init>(r1)
            r1.d = r2
            r2.a((android.util.AttributeSet) r3, (int) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.g.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.c;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.d;
        if (yVar != null) {
            yVar.a();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f130b;
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f130b;
        if (iVar != null) {
            return iVar.f136b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f130b;
        if (iVar != null) {
            return iVar.c;
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.c;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.c;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(a.b(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.f130b;
        if (iVar == null) {
            return;
        }
        if (iVar.f) {
            iVar.f = false;
            return;
        }
        iVar.f = true;
        iVar.a();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.c;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.c;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.f130b;
        if (iVar != null) {
            iVar.f136b = colorStateList;
            iVar.d = true;
            iVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.f130b;
        if (iVar != null) {
            iVar.c = mode;
            iVar.e = true;
            iVar.a();
        }
    }
}
