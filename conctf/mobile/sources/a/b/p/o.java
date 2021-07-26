package a.b.p;

import a.b.l.a.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

public class o extends MultiAutoCompleteTextView {
    public static final int[] d = {16843126};

    /* renamed from: b  reason: collision with root package name */
    public final e f158b;
    public final y c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            int r0 = a.b.a.autoCompleteTextViewStyle
            a.b.p.u0.a(r4)
            r3.<init>(r4, r5, r0)
            android.content.Context r4 = r3.getContext()
            int[] r1 = d
            r2 = 0
            a.b.p.x0 r4 = a.b.p.x0.a(r4, r5, r1, r0, r2)
            boolean r1 = r4.f(r2)
            if (r1 == 0) goto L_0x0020
            android.graphics.drawable.Drawable r1 = r4.b(r2)
            r3.setDropDownBackgroundDrawable(r1)
        L_0x0020:
            android.content.res.TypedArray r4 = r4.f186b
            r4.recycle()
            a.b.p.e r4 = new a.b.p.e
            r4.<init>(r3)
            r3.f158b = r4
            r4.a(r5, r0)
            a.b.p.y r4 = new a.b.p.y
            r4.<init>(r3)
            r3.c = r4
            r4.a((android.util.AttributeSet) r5, (int) r0)
            a.b.p.y r4 = r3.c
            r4.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.o.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f158b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.c;
        if (yVar != null) {
            yVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f158b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f158b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.b.k.o.a(onCreateInputConnection, editorInfo, (View) this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f158b;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f158b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(a.b(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f158b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f158b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.c;
        if (yVar != null) {
            yVar.a(context, i);
        }
    }
}
