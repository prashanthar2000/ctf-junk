package a.b.p;

import a.b.k.o;
import a.f.f.c;
import a.f.i.a;
import a.f.l.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class z extends TextView implements b {

    /* renamed from: b  reason: collision with root package name */
    public final e f193b;
    public final y c;
    public final x d;
    public Future<a> e;

    public z(Context context) {
        this(context, (AttributeSet) null);
    }

    public z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        u0.a(context);
        e eVar = new e(this);
        this.f193b = eVar;
        eVar.a(attributeSet, i);
        y yVar = new y(this);
        this.c = yVar;
        yVar.a(attributeSet, i);
        this.c.a();
        this.d = new x(this);
    }

    public final void d() {
        Future<a> future = this.e;
        if (future != null) {
            try {
                this.e = null;
                a aVar = future.get();
                o.a((TextView) this);
                if (aVar != null) {
                    throw null;
                }
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f193b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.c;
        if (yVar != null) {
            yVar.a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f347a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.c;
        if (yVar != null) {
            return Math.round(yVar.i.e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f347a) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.c;
        if (yVar != null) {
            return Math.round(yVar.i.d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.f347a) {
            return super.getAutoSizeStepGranularity();
        }
        y yVar = this.c;
        if (yVar != null) {
            return Math.round(yVar.i.c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f347a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.c;
        return yVar != null ? yVar.i.f : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.f347a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y yVar = this.c;
        if (yVar != null) {
            return yVar.i.f109a;
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f193b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f193b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        v0 v0Var = this.c.h;
        if (v0Var != null) {
            return v0Var.f173a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        v0 v0Var = this.c.h;
        if (v0Var != null) {
            return v0Var.f174b;
        }
        return null;
    }

    public CharSequence getText() {
        d();
        return super.getText();
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
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.z.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public a.C0016a getTextMetricsParamsCompat() {
        return o.a((TextView) this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        o.a(onCreateInputConnection, editorInfo, (View) this);
        return onCreateInputConnection;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        y yVar = this.c;
        if (yVar != null && !b.f347a) {
            yVar.i.a();
        }
    }

    public void onMeasure(int i, int i2) {
        d();
        super.onMeasure(i, i2);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        y yVar = this.c;
        if (yVar != null && !b.f347a && yVar.b()) {
            this.c.i.a();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (b.f347a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        y yVar = this.c;
        if (yVar != null) {
            yVar.a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (b.f347a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        y yVar = this.c;
        if (yVar != null) {
            yVar.a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (b.f347a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        y yVar = this.c;
        if (yVar != null) {
            yVar.a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f193b;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f193b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y yVar = this.c;
        if (yVar != null) {
            yVar.a();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y yVar = this.c;
        if (yVar != null) {
            yVar.a();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b2 = i != 0 ? a.b.l.a.a.b(context, i) : null;
        Drawable b3 = i2 != 0 ? a.b.l.a.a.b(context, i2) : null;
        Drawable b4 = i3 != 0 ? a.b.l.a.a.b(context, i3) : null;
        if (i4 != 0) {
            drawable = a.b.l.a.a.b(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b2, b3, b4, drawable);
        y yVar = this.c;
        if (yVar != null) {
            yVar.a();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b2 = i != 0 ? a.b.l.a.a.b(context, i) : null;
        Drawable b3 = i2 != 0 ? a.b.l.a.a.b(context, i2) : null;
        Drawable b4 = i3 != 0 ? a.b.l.a.a.b(context, i3) : null;
        if (i4 != 0) {
            drawable = a.b.l.a.a.b(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(b2, b3, b4, drawable);
        y yVar = this.c;
        if (yVar != null) {
            yVar.a();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(o.a((TextView) this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            o.a((TextView) this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            o.b((TextView) this, i);
        }
    }

    public void setLineHeight(int i) {
        o.c(this, i);
    }

    public void setPrecomputedText(a aVar) {
        o.a((TextView) this);
        if (aVar != null) {
            throw null;
        }
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f193b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f193b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        y yVar = this.c;
        if (yVar.h == null) {
            yVar.h = new v0();
        }
        v0 v0Var = yVar.h;
        v0Var.f173a = colorStateList;
        v0Var.d = colorStateList != null;
        v0 v0Var2 = yVar.h;
        yVar.f188b = v0Var2;
        yVar.c = v0Var2;
        yVar.d = v0Var2;
        yVar.e = v0Var2;
        yVar.f = v0Var2;
        yVar.g = v0Var2;
        this.c.a();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        y yVar = this.c;
        if (yVar.h == null) {
            yVar.h = new v0();
        }
        v0 v0Var = yVar.h;
        v0Var.f174b = mode;
        v0Var.c = mode != null;
        v0 v0Var2 = yVar.h;
        yVar.f188b = v0Var2;
        yVar.c = v0Var2;
        yVar.d = v0Var2;
        yVar.e = v0Var2;
        yVar.f = v0Var2;
        yVar.g = v0Var2;
        this.c.a();
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

    public void setTextFuture(Future<a> future) {
        this.e = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(a.C0016a aVar) {
        TextDirectionHeuristic textDirectionHeuristic = aVar.f310b;
        int i = 1;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(aVar.f309a);
        setBreakStrategy(aVar.c);
        setHyphenationFrequency(aVar.d);
    }

    public void setTextSize(int i, float f) {
        boolean z = b.f347a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        y yVar = this.c;
        if (yVar != null && !z && !yVar.b()) {
            yVar.i.a(i, f);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        Typeface a2 = (typeface == null || i <= 0) ? null : c.a(getContext(), typeface, i);
        if (a2 != null) {
            typeface = a2;
        }
        super.setTypeface(typeface, i);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.c;
        if (yVar != null) {
            yVar.a();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.c;
        if (yVar != null) {
            yVar.a();
        }
    }
}
