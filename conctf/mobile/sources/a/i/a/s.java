package a.i.a;

import android.transition.Transition;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public final class s implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f389b;
    public final /* synthetic */ d0 c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Fragment e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ Object i;

    public s(Object obj, d0 d0Var, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f389b = obj;
        this.c = d0Var;
        this.d = view;
        this.e = fragment;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = arrayList3;
        this.i = obj2;
    }

    public void run() {
        Object obj = this.f389b;
        if (obj != null) {
            d0 d0Var = this.c;
            View view = this.d;
            if (((y) d0Var) != null) {
                if (obj != null) {
                    ((Transition) obj).removeTarget(view);
                }
                this.g.addAll(v.a(this.c, this.f389b, this.e, (ArrayList<View>) this.f, this.d));
            } else {
                throw null;
            }
        }
        if (this.h != null) {
            if (this.i != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.d);
                this.c.a(this.i, (ArrayList<View>) this.h, (ArrayList<View>) arrayList);
            }
            this.h.clear();
            this.h.add(this.d);
        }
    }
}
