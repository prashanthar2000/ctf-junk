package androidx.appcompat.widget;

import a.b.k.j;
import a.b.p.g0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class FitWindowsFrameLayout extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public g0 f479b;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean fitSystemWindows(Rect rect) {
        g0 g0Var = this.f479b;
        if (g0Var != null) {
            rect.top = ((j) g0Var).f22a.f(rect.top);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(g0 g0Var) {
        this.f479b = g0Var;
    }
}
