package a.i.a;

import a.f.k.k;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;

public class c0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f359b;
    public final /* synthetic */ Map c;

    public c0(d0 d0Var, ArrayList arrayList, Map map) {
        this.f359b = arrayList;
        this.c = map;
    }

    public void run() {
        int size = this.f359b.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f359b.get(i);
            view.setTransitionName((String) this.c.get(k.e(view)));
        }
    }
}
