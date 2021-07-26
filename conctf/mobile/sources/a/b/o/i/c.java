package a.b.o.i;

import a.d.a;
import a.f.g.a.b;
import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f77a;

    /* renamed from: b  reason: collision with root package name */
    public Map<b, MenuItem> f78b;
    public Map<a.f.g.a.c, SubMenu> c;

    public c(Context context) {
        this.f77a = context;
    }

    public final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b bVar = (b) menuItem;
        if (this.f78b == null) {
            this.f78b = new a();
        }
        MenuItem menuItem2 = this.f78b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.f77a, bVar);
        this.f78b.put(bVar, jVar);
        return jVar;
    }

    public final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof a.f.g.a.c)) {
            return subMenu;
        }
        a.f.g.a.c cVar = (a.f.g.a.c) subMenu;
        if (this.c == null) {
            this.c = new a();
        }
        SubMenu subMenu2 = this.c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.f77a, cVar);
        this.c.put(cVar, sVar);
        return sVar;
    }
}
