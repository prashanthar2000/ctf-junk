package a.i.a;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

public class x implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f397a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f398b;

    public x(y yVar, View view, ArrayList arrayList) {
        this.f397a = view;
        this.f398b = arrayList;
    }

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f397a.setVisibility(8);
        int size = this.f398b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f398b.get(i)).setVisibility(0);
        }
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public void onTransitionStart(Transition transition) {
    }
}
