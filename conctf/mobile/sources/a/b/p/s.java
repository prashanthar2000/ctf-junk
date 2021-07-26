package a.b.p;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.RatingBar;

public class s extends RatingBar {

    /* renamed from: b  reason: collision with root package name */
    public final q f168b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = a.b.a.ratingBarStyle
            r1.<init>(r2, r3, r0)
            a.b.p.q r2 = new a.b.p.q
            r2.<init>(r1)
            r1.f168b = r2
            r2.a((android.util.AttributeSet) r3, (int) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.s.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f168b.f162b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
