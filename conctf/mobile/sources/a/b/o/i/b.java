package a.b.o.i;

import a.b.o.i.m;
import a.b.o.i.n;
import a.b.p.c;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

public abstract class b implements m {

    /* renamed from: b  reason: collision with root package name */
    public Context f76b;
    public Context c;
    public g d;
    public LayoutInflater e;
    public m.a f;
    public int g;
    public int h;
    public n i;

    public b(Context context, int i2, int i3) {
        this.f76b = context;
        this.e = LayoutInflater.from(context);
        this.g = i2;
        this.h = i3;
    }

    public View a(i iVar, View view, ViewGroup viewGroup) {
        n.a aVar = view instanceof n.a ? (n.a) view : (n.a) this.e.inflate(this.h, viewGroup, false);
        c cVar = (c) this;
        aVar.a(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) cVar.i);
        if (cVar.x == null) {
            cVar.x = new c.b();
        }
        actionMenuItemView.setPopupCallback(cVar.x);
        return (View) aVar;
    }

    public void a(m.a aVar) {
        this.f = aVar;
    }

    public boolean a(g gVar, i iVar) {
        return false;
    }

    public boolean a(r rVar) {
        m.a aVar = this.f;
        if (aVar != null) {
            return aVar.a(rVar);
        }
        return false;
    }

    public boolean b(g gVar, i iVar) {
        return false;
    }

    public void a(boolean z) {
        int i2;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup != null) {
            g gVar = this.d;
            if (gVar != null) {
                gVar.a();
                ArrayList<i> d2 = this.d.d();
                int size = d2.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    i iVar = d2.get(i3);
                    if (iVar.d()) {
                        View childAt = viewGroup.getChildAt(i2);
                        i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                        View a2 = a(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.i).addView(a2, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == ((c) this).j) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i2);
                    z2 = true;
                }
                if (!z2) {
                    i2++;
                }
            }
        }
    }
}
