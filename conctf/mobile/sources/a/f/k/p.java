package a.f.k;

import a.b.k.r;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<View> f330a;

    /* renamed from: b  reason: collision with root package name */
    public Runnable f331b = null;
    public Runnable c = null;
    public int d = -1;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q f332a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f333b;

        public a(p pVar, q qVar, View view) {
            this.f332a = qVar;
            this.f333b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f332a.c(this.f333b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f332a.a(this.f333b);
        }

        public void onAnimationStart(Animator animator) {
            this.f332a.b(this.f333b);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s f334a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f335b;

        public b(p pVar, s sVar, View view) {
            this.f334a = sVar;
            this.f335b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) r.this.d.getParent()).invalidate();
        }
    }

    public p(View view) {
        this.f330a = new WeakReference<>(view);
    }

    public p a(float f) {
        View view = (View) this.f330a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public p a(long j) {
        View view = (View) this.f330a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public p a(q qVar) {
        View view = (View) this.f330a.get();
        if (view != null) {
            a(view, qVar);
        }
        return this;
    }

    public p a(s sVar) {
        View view = (View) this.f330a.get();
        if (view != null) {
            b bVar = null;
            if (sVar != null) {
                bVar = new b(this, sVar, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public void a() {
        View view = (View) this.f330a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void a(View view, q qVar) {
        if (qVar != null) {
            view.animate().setListener(new a(this, qVar, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public p b(float f) {
        View view = (View) this.f330a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
