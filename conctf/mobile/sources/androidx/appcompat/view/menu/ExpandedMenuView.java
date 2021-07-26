package androidx.appcompat.view.menu;

import a.b.o.i.g;
import a.b.o.i.i;
import a.b.o.i.m;
import a.b.o.i.n;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements g.b, n, AdapterView.OnItemClickListener {
    public static final int[] c = {16842964, 16843049};

    /* renamed from: b  reason: collision with root package name */
    public g f467b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        r5 = r4.getResourceId(0, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExpandedMenuView(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            r2.<init>(r3, r4)
            r2.setOnItemClickListener(r2)
            int[] r0 = c
            r1 = 0
            android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r0, r5, r1)
            boolean r5 = r4.hasValue(r1)
            if (r5 == 0) goto L_0x002b
            boolean r5 = r4.hasValue(r1)
            if (r5 == 0) goto L_0x0024
            int r5 = r4.getResourceId(r1, r1)
            if (r5 == 0) goto L_0x0024
            android.graphics.drawable.Drawable r5 = a.b.l.a.a.b(r3, r5)
            goto L_0x0028
        L_0x0024:
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r1)
        L_0x0028:
            r2.setBackgroundDrawable(r5)
        L_0x002b:
            r5 = 1
            boolean r0 = r4.hasValue(r5)
            if (r0 == 0) goto L_0x004a
            boolean r0 = r4.hasValue(r5)
            if (r0 == 0) goto L_0x0043
            int r0 = r4.getResourceId(r5, r1)
            if (r0 == 0) goto L_0x0043
            android.graphics.drawable.Drawable r3 = a.b.l.a.a.b(r3, r0)
            goto L_0x0047
        L_0x0043:
            android.graphics.drawable.Drawable r3 = r4.getDrawable(r5)
        L_0x0047:
            r2.setDivider(r3)
        L_0x004a:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ExpandedMenuView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void a(g gVar) {
        this.f467b = gVar;
    }

    public boolean a(i iVar) {
        return this.f467b.a((MenuItem) iVar, (m) null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((i) getAdapter().getItem(i));
    }
}
