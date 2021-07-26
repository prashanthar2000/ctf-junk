package a.i.a;

import a.f.k.k;
import android.view.View;
import java.util.ArrayList;

public class a0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f355b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ ArrayList f;

    public a0(d0 d0Var, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f355b = i;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = arrayList4;
    }

    public void run() {
        for (int i = 0; i < this.f355b; i++) {
            k.a((View) this.c.get(i), (String) this.d.get(i));
            ((View) this.e.get(i)).setTransitionName((String) this.f.get(i));
        }
    }
}
