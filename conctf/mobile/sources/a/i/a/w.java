package a.i.a;

import android.graphics.Rect;
import android.transition.Transition;

public class w extends Transition.EpicenterCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Rect f396a;

    public w(y yVar, Rect rect) {
        this.f396a = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        return this.f396a;
    }
}
