package a.b.p;

import android.view.View;
import android.widget.PopupWindow;

public class p extends PopupWindow {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        r5 = r3.getResourceId(r4, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
        /*
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            int[] r0 = a.b.j.PopupWindow
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r0, r4, r5)
            int r4 = a.b.j.PopupWindow_overlapAnchor
            boolean r4 = r3.hasValue(r4)
            r5 = 0
            if (r4 == 0) goto L_0x001b
            int r4 = a.b.j.PopupWindow_overlapAnchor
            boolean r4 = r3.getBoolean(r4, r5)
            r1.setOverlapAnchor(r4)
        L_0x001b:
            int r4 = a.b.j.PopupWindow_android_popupBackground
            boolean r0 = r3.hasValue(r4)
            if (r0 == 0) goto L_0x002e
            int r5 = r3.getResourceId(r4, r5)
            if (r5 == 0) goto L_0x002e
            android.graphics.drawable.Drawable r2 = a.b.l.a.a.b(r2, r5)
            goto L_0x0032
        L_0x002e:
            android.graphics.drawable.Drawable r2 = r3.getDrawable(r4)
        L_0x0032:
            r1.setBackgroundDrawable(r2)
            r3.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.p.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
    }
}
