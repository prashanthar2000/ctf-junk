package a.b.p;

import a.b.a;
import a.b.k.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class d extends AutoCompleteTextView {
    public static final int[] d = {16843126};

    /* renamed from: b  reason: collision with root package name */
    public final e f121b;
    public final y c;

    public d(Context context) {
        this(context, (AttributeSet) null);
    }

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.autoCompleteTextViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        u0.a(context);
        x0 a2 = x0.a(getContext(), attributeSet, d, i, 0);
        if (a2.f(0)) {
            setDropDownBackgroundDrawable(a2.b(0));
        }
        a2.f186b.recycle();
        e eVar = new e(this);
        this.f121b = eVar;
        eVar.a(attributeSet, i);
        y yVar = new y(this);
        this.c = yVar;
        yVar.a(attributeSet, i);
        this.c.a();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f121b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.c;
        if (yVar != null) {
            yVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f121b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f121b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        o.a(onCreateInputConnection, editorInfo, (View) this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f121b;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f121b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(o.a((TextView) this, callback));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(a.b.l.a.a.b(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f121b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f121b;
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
