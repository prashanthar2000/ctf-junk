package a.b.p;

import a.b.k.o;
import a.f.l.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;

public class f extends Button implements b {

    /* renamed from: b  reason: collision with root package name */
    public final e f127b;
    public final y c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = a.b.a.buttonStyle
            a.b.p.u0.a(r2)
            r1.<init>(r2, r3, r0)
            a.b.p.e r2 = new a.b.p.e
            r2.<init>(r1)
            r1.f127b = r2
            r2.a(r3, r0)
            a.b.p.y r2 = new a.b.p.y
            r2.<init>(r1)
            r1.c = r2
            r2.a((android.util.AttributeSet) r3, (int) r0)
            a.b.p.y r2 = r1.c
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.f.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f127b;
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

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f127b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f127b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        y yVar = this.c;
        if (yVar != null && !b.f347a) {
            yVar.i.a();
        }
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
        e eVar = this.f127b;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f127b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(o.a((TextView) this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        y yVar = this.c;
        if (yVar != null) {
            yVar.f187a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f127b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f127b;
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
}
