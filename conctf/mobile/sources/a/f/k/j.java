package a.f.k;

import android.view.View;
import android.view.ViewTreeObserver;

public final class j implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    public final View f322b;
    public ViewTreeObserver c;
    public final Runnable d;

    public j(View view, Runnable runnable) {
        this.f322b = view;
        this.c = view.getViewTreeObserver();
        this.d = runnable;
    }

    public static j a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            j jVar = new j(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(jVar);
            view.addOnAttachStateChangeListener(jVar);
            return jVar;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public void a() {
        (this.c.isAlive() ? this.c : this.f322b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f322b.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        a();
        this.d.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.c = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        a();
    }
}
