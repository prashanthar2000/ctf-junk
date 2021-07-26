package a.b.p;

import a.b.j;
import a.f.k.k;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class u extends q {
    public final SeekBar d;
    public Drawable e;
    public ColorStateList f = null;
    public PorterDuff.Mode g = null;
    public boolean h = false;
    public boolean i = false;

    public u(SeekBar seekBar) {
        super(seekBar);
        this.d = seekBar;
    }

    public final void a() {
        if (this.e == null) {
            return;
        }
        if (this.h || this.i) {
            Drawable mutate = this.e.mutate();
            this.e = mutate;
            if (this.h) {
                mutate.setTintList(this.f);
            }
            if (this.i) {
                this.e.setTintMode(this.g);
            }
            if (this.e.isStateful()) {
                this.e.setState(this.d.getDrawableState());
            }
        }
    }

    public void a(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.e.setBounds(-i3, -i2, i3, i2);
                float width = ((float) ((this.d.getWidth() - this.d.getPaddingLeft()) - this.d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.d.getPaddingLeft(), (float) (this.d.getHeight() / 2));
                for (int i4 = 0; i4 <= max; i4++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public void a(AttributeSet attributeSet, int i2) {
        super.a(attributeSet, i2);
        x0 a2 = x0.a(this.d.getContext(), attributeSet, j.AppCompatSeekBar, i2, 0);
        Drawable c = a2.c(j.AppCompatSeekBar_android_thumb);
        if (c != null) {
            this.d.setThumb(c);
        }
        Drawable b2 = a2.b(j.AppCompatSeekBar_tickMark);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.e = b2;
        if (b2 != null) {
            b2.setCallback(this.d);
            b2.setLayoutDirection(k.c(this.d));
            if (b2.isStateful()) {
                b2.setState(this.d.getDrawableState());
            }
            a();
        }
        this.d.invalidate();
        if (a2.f(j.AppCompatSeekBar_tickMarkTintMode)) {
            this.g = e0.a(a2.c(j.AppCompatSeekBar_tickMarkTintMode, -1), this.g);
            this.i = true;
        }
        if (a2.f(j.AppCompatSeekBar_tickMarkTint)) {
            this.f = a2.a(j.AppCompatSeekBar_tickMarkTint);
            this.h = true;
        }
        a2.f186b.recycle();
        a();
    }
}
