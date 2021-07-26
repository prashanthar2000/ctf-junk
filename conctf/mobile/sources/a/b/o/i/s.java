package a.b.o.i;

import a.f.g.a.c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class s extends o implements SubMenu {
    public final c e;

    public s(Context context, c cVar) {
        super(context, cVar);
        this.e = cVar;
    }

    public void clearHeader() {
        this.e.clearHeader();
    }

    public MenuItem getItem() {
        return a(this.e.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.e.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.e.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.e.setIcon(drawable);
        return this;
    }
}
