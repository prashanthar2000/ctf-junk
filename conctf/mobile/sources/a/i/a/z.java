package a.i.a;

import android.graphics.Rect;
import android.transition.Transition;

public class z extends Transition.EpicenterCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Rect f401a;

    public z(y yVar, Rect rect) {
        this.f401a = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        Rect rect = this.f401a;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return this.f401a;
    }
}
