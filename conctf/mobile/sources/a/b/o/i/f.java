package a.b.o.i;

import a.b.o.i.n;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

public class f extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    public g f87b;
    public int c = -1;
    public boolean d;
    public final boolean e;
    public final LayoutInflater f;
    public final int g;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.e = z;
        this.f = layoutInflater;
        this.f87b = gVar;
        this.g = i;
        a();
    }

    public void a() {
        g gVar = this.f87b;
        i iVar = gVar.w;
        if (iVar != null) {
            gVar.a();
            ArrayList<i> arrayList = gVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == iVar) {
                    this.c = i;
                    return;
                }
            }
        }
        this.c = -1;
    }

    public int getCount() {
        ArrayList<i> arrayList;
        if (this.e) {
            g gVar = this.f87b;
            gVar.a();
            arrayList = gVar.j;
        } else {
            arrayList = this.f87b.d();
        }
        int i = this.c;
        int size = arrayList.size();
        return i < 0 ? size : size - 1;
    }

    public i getItem(int i) {
        ArrayList<i> arrayList;
        if (this.e) {
            g gVar = this.f87b;
            gVar.a();
            arrayList = gVar.j;
        } else {
            arrayList = this.f87b.d();
        }
        int i2 = this.c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayList.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f.inflate(this.g, viewGroup, false);
        }
        int i2 = getItem(i).f92b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f87b.e() && i2 != (i3 >= 0 ? getItem(i3).f92b : i2));
        n.a aVar = (n.a) view;
        if (this.d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.a(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
