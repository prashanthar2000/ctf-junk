package a.b.o;

import a.b.o.a;
import a.b.o.i.j;
import a.b.o.i.o;
import a.d.h;
import a.f.g.a.b;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

public class e extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f59a;

    /* renamed from: b  reason: collision with root package name */
    public final a f60b;

    public static class a implements a.C0004a {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f61a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f62b;
        public final ArrayList<e> c = new ArrayList<>();
        public final h<Menu, Menu> d = new h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f62b = context;
            this.f61a = callback;
        }

        public final Menu a(Menu menu) {
            Menu orDefault = this.d.getOrDefault(menu, null);
            if (orDefault != null) {
                return orDefault;
            }
            o oVar = new o(this.f62b, (a.f.g.a.a) menu);
            this.d.put(menu, oVar);
            return oVar;
        }

        public void a(a aVar) {
            this.f61a.onDestroyActionMode(b(aVar));
        }

        public boolean a(a aVar, Menu menu) {
            return this.f61a.onPrepareActionMode(b(aVar), a(menu));
        }

        public boolean a(a aVar, MenuItem menuItem) {
            return this.f61a.onActionItemClicked(b(aVar), new j(this.f62b, (b) menuItem));
        }

        public ActionMode b(a aVar) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                e eVar = this.c.get(i);
                if (eVar != null && eVar.f60b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f62b, aVar);
            this.c.add(eVar2);
            return eVar2;
        }

        public boolean b(a aVar, Menu menu) {
            return this.f61a.onCreateActionMode(b(aVar), a(menu));
        }
    }

    public e(Context context, a aVar) {
        this.f59a = context;
        this.f60b = aVar;
    }

    public void finish() {
        this.f60b.a();
    }

    public View getCustomView() {
        return this.f60b.b();
    }

    public Menu getMenu() {
        return new o(this.f59a, (a.f.g.a.a) this.f60b.c());
    }

    public MenuInflater getMenuInflater() {
        return this.f60b.d();
    }

    public CharSequence getSubtitle() {
        return this.f60b.e();
    }

    public Object getTag() {
        return this.f60b.f56b;
    }

    public CharSequence getTitle() {
        return this.f60b.f();
    }

    public boolean getTitleOptionalHint() {
        return this.f60b.c;
    }

    public void invalidate() {
        this.f60b.g();
    }

    public boolean isTitleOptional() {
        return this.f60b.h();
    }

    public void setCustomView(View view) {
        this.f60b.a(view);
    }

    public void setSubtitle(int i) {
        this.f60b.a(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f60b.a(charSequence);
    }

    public void setTag(Object obj) {
        this.f60b.f56b = obj;
    }

    public void setTitle(int i) {
        this.f60b.b(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f60b.b(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f60b.a(z);
    }
}
