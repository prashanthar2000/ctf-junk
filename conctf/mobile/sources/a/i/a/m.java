package a.i.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class m extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f379a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f380b;
    public final /* synthetic */ Fragment c;

    public m(j jVar, ViewGroup viewGroup, View view, Fragment fragment) {
        this.f379a = viewGroup;
        this.f380b = view;
        this.c = fragment;
    }

    public void onAnimationEnd(Animator animator) {
        this.f379a.endViewTransition(this.f380b);
        animator.removeListener(this);
        Fragment fragment = this.c;
        View view = fragment.H;
        if (view != null && fragment.z) {
            view.setVisibility(8);
        }
    }
}
