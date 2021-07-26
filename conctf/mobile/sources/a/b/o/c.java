package a.b.o;

import a.b.i;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;

public class c extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public int f57a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f58b;
    public LayoutInflater c;
    public Resources d;

    public c() {
        super((Context) null);
    }

    public c(Context context, int i) {
        super(context);
        this.f57a = i;
    }

    public final void a() {
        if (this.f58b == null) {
            this.f58b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f58b.setTo(theme);
            }
        }
        this.f58b.applyStyle(this.f57a, true);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        if (this.d == null) {
            this.d = super.getResources();
        }
        return this.d;
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f58b;
        if (theme != null) {
            return theme;
        }
        if (this.f57a == 0) {
            this.f57a = i.Theme_AppCompat_Light;
        }
        a();
        return this.f58b;
    }

    public void setTheme(int i) {
        if (this.f57a != i) {
            this.f57a = i;
            a();
        }
    }
}
