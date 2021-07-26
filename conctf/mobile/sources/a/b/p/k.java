package a.b.p;

import a.b.k.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;

public class k extends EditText {

    /* renamed from: b  reason: collision with root package name */
    public final e f145b;
    public final y c;
    public final x d = new x(this);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = a.b.a.editTextStyle
            a.b.p.u0.a(r2)
            r1.<init>(r2, r3, r0)
            a.b.p.e r2 = new a.b.p.e
            r2.<init>(r1)
            r1.f145b = r2
            r2.a(r3, r0)
            a.b.p.y r2 = new a.b.p.y
            r2.<init>(r1)
            r1.c = r2
            r2.a((android.util.AttributeSet) r3, (int) r0)
            a.b.p.y r2 = r1.c
            r2.a()
            a.b.p.x r2 = new a.b.p.x
            r2.<init>(r1)
            r1.d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.k.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f145b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.c;
        if (yVar != null) {
            yVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f145b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f145b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            a.b.p.x r0 = r2.d
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.a()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.k.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        o.a(onCreateInputConnection, editorInfo, (View) this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f145b;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f145b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(o.a((TextView) this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f145b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f145b;
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

    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.f184b = textClassifier;
        }
    }
}
