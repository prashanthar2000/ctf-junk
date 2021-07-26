package a.b.o.i;

import a.b.g;
import a.b.k.d;
import a.b.o.i.m;
import a.b.o.i.n;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.ExpandedMenuView;
import java.util.ArrayList;

public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public Context f85b;
    public LayoutInflater c;
    public g d;
    public ExpandedMenuView e;
    public int f;
    public int g = 0;
    public int h;
    public m.a i;
    public a j;

    public class a extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        public int f86b = -1;

        public a() {
            a();
        }

        public void a() {
            g gVar = e.this.d;
            i iVar = gVar.w;
            if (iVar != null) {
                gVar.a();
                ArrayList<i> arrayList = gVar.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == iVar) {
                        this.f86b = i;
                        return;
                    }
                }
            }
            this.f86b = -1;
        }

        public int getCount() {
            g gVar = e.this.d;
            gVar.a();
            int size = gVar.j.size() - e.this.f;
            return this.f86b < 0 ? size : size - 1;
        }

        public i getItem(int i) {
            g gVar = e.this.d;
            gVar.a();
            ArrayList<i> arrayList = gVar.j;
            int i2 = i + e.this.f;
            int i3 = this.f86b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayList.get(i2);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.c.inflate(eVar.h, viewGroup, false);
            }
            ((n.a) view).a(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context, int i2) {
        this.h = i2;
        this.f85b = context;
        this.c = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.j == null) {
            this.j = new a();
        }
        return this.j;
    }

    public void a(g gVar, boolean z) {
        m.a aVar = this.i;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    public void a(m.a aVar) {
        this.i = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r3, a.b.o.i.g r4) {
        /*
            r2 = this;
            int r0 = r2.g
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.g
            r0.<init>(r3, r1)
            r2.f85b = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L_0x0011:
            r2.c = r3
            goto L_0x0023
        L_0x0014:
            android.content.Context r0 = r2.f85b
            if (r0 == 0) goto L_0x0023
            r2.f85b = r3
            android.view.LayoutInflater r0 = r2.c
            if (r0 != 0) goto L_0x0023
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L_0x0011
        L_0x0023:
            r2.d = r4
            a.b.o.i.e$a r3 = r2.j
            if (r3 == 0) goto L_0x002c
            r3.notifyDataSetChanged()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.o.i.e.a(android.content.Context, a.b.o.i.g):void");
    }

    public void a(boolean z) {
        a aVar = this.j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public boolean a(g gVar, i iVar) {
        return false;
    }

    public boolean a(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        h hVar = new h(rVar);
        g gVar = hVar.f90b;
        d.a aVar = new d.a(gVar.f88a);
        e eVar = new e(aVar.f6a.f461a, g.abc_list_menu_item_layout);
        hVar.d = eVar;
        eVar.i = hVar;
        g gVar2 = hVar.f90b;
        gVar2.a((m) eVar, gVar2.f88a);
        ListAdapter a2 = hVar.d.a();
        AlertController.b bVar = aVar.f6a;
        bVar.l = a2;
        bVar.m = hVar;
        View view = gVar.o;
        if (view != null) {
            bVar.g = view;
        } else {
            bVar.d = gVar.n;
            bVar.f = gVar.m;
        }
        aVar.f6a.k = hVar;
        d a3 = aVar.a();
        hVar.c = a3;
        a3.setOnDismissListener(hVar);
        WindowManager.LayoutParams attributes = hVar.c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        hVar.c.show();
        m.a aVar2 = this.i;
        if (aVar2 == null) {
            return true;
        }
        aVar2.a(rVar);
        return true;
    }

    public boolean b() {
        return false;
    }

    public boolean b(g gVar, i iVar) {
        return false;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.d.a((MenuItem) this.j.getItem(i2), (m) this, 0);
    }
}
