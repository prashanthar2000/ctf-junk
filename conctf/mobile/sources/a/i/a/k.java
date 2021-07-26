package a.i.a;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;

public class k implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f374a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Fragment f375b;
    public final /* synthetic */ j c;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            if (k.this.f375b.g() != null) {
                k.this.f375b.a((View) null);
                k kVar = k.this;
                j jVar = kVar.c;
                Fragment fragment = kVar.f375b;
                jVar.a(fragment, fragment.p(), 0, 0, false);
            }
        }
    }

    public k(j jVar, ViewGroup viewGroup, Fragment fragment) {
        this.c = jVar;
        this.f374a = viewGroup;
        this.f375b = fragment;
    }

    public void onAnimationEnd(Animation animation) {
        this.f374a.post(new a());
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
