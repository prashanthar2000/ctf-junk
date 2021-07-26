package a.i.a;

import a.f.k.k;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class b0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f357b;
    public final /* synthetic */ Map c;

    public b0(d0 d0Var, ArrayList arrayList, Map map) {
        this.f357b = arrayList;
        this.c = map;
    }

    public void run() {
        String str;
        int size = this.f357b.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f357b.get(i);
            String e = k.e(view);
            if (e != null) {
                Iterator it = this.c.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (e.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                view.setTransitionName(str);
            }
        }
    }
}
