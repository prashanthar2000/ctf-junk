package a.i.a;

import a.d.a;
import a.i.a.v;
import android.graphics.Rect;
import android.transition.TransitionSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public final class u implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d0 f391b;
    public final /* synthetic */ a c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ v.a e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ View g;
    public final /* synthetic */ Fragment h;
    public final /* synthetic */ Fragment i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ ArrayList k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Rect m;

    public u(d0 d0Var, a aVar, Object obj, v.a aVar2, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f391b = d0Var;
        this.c = aVar;
        this.d = obj;
        this.e = aVar2;
        this.f = arrayList;
        this.g = view;
        this.h = fragment;
        this.i = fragment2;
        this.j = z;
        this.k = arrayList2;
        this.l = obj2;
        this.m = rect;
    }

    public void run() {
        a<String, View> a2 = v.a(this.f391b, (a<String, String>) this.c, this.d, this.e);
        if (a2 != null) {
            this.f.addAll(a2.values());
            this.f.add(this.g);
        }
        v.a(this.h, this.i, this.j, a2, false);
        Object obj = this.d;
        if (obj != null) {
            d0 d0Var = this.f391b;
            ArrayList arrayList = this.k;
            ArrayList arrayList2 = this.f;
            y yVar = (y) d0Var;
            if (yVar != null) {
                TransitionSet transitionSet = (TransitionSet) obj;
                transitionSet.getTargets().clear();
                transitionSet.getTargets().addAll(arrayList2);
                yVar.a((Object) transitionSet, (ArrayList<View>) arrayList, (ArrayList<View>) arrayList2);
                View a3 = v.a(a2, this.e, this.l, this.j);
                if (a3 != null) {
                    this.f391b.a(a3, this.m);
                    return;
                }
                return;
            }
            throw null;
        }
    }
}
