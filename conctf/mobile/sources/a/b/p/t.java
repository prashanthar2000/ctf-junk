package a.b.p;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;

public class t extends SeekBar {

    /* renamed from: b  reason: collision with root package name */
    public final u f171b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = a.b.a.seekBarStyle
            r1.<init>(r2, r3, r0)
            a.b.p.u r2 = new a.b.p.u
            r2.<init>(r1)
            r1.f171b = r2
            r2.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.t.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        u uVar = this.f171b;
        Drawable drawable = uVar.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(uVar.d.getDrawableState())) {
            uVar.d.invalidateDrawable(drawable);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f171b.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f171b.a(canvas);
    }
}
