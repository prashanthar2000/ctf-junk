package a.i.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class l extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f377a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f378b;
    public final /* synthetic */ Fragment c;
    public final /* synthetic */ j d;

    public l(j jVar, ViewGroup viewGroup, View view, Fragment fragment) {
        this.d = jVar;
        this.f377a = viewGroup;
        this.f378b = view;
        this.c = fragment;
    }

    public void onAnimationEnd(Animator animator) {
        this.f377a.endViewTransition(this.f378b);
        Animator h = this.c.h();
        this.c.a((Animator) null);
        if (h != null && this.f377a.indexOfChild(this.f378b) < 0) {
            j jVar = this.d;
            Fragment fragment = this.c;
            jVar.a(fragment, fragment.p(), 0, 0, false);
        }
    }
}
