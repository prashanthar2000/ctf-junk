package a.b.k;

import a.b.k.h;
import a.b.o.a;
import a.b.p.c1;
import a.b.p.j;
import a.f.d.f;
import a.i.a.d;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class e extends d implements f, f {
    public g n;
    public Resources o;

    public a a(a.C0004a aVar) {
        return null;
    }

    public void a(a aVar) {
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g().a(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        h hVar = (h) g();
        hVar.a(false);
        hVar.J = true;
    }

    public void b(a aVar) {
    }

    public void closeOptionsMenu() {
        a h = h();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a h = h();
        return super.dispatchKeyEvent(keyEvent);
    }

    public Intent e() {
        return o.a((Activity) this);
    }

    public void f() {
        g().b();
    }

    public <T extends View> T findViewById(int i) {
        h hVar = (h) g();
        hVar.f();
        return hVar.f.findViewById(i);
    }

    public g g() {
        if (this.n == null) {
            this.n = g.a((Activity) this, (f) this);
        }
        return this.n;
    }

    public MenuInflater getMenuInflater() {
        h hVar = (h) g();
        if (hVar.j == null) {
            hVar.j();
            a aVar = hVar.i;
            hVar.j = new a.b.o.f(aVar != null ? aVar.c() : hVar.e);
        }
        return hVar.j;
    }

    public Resources getResources() {
        if (this.o == null) {
            c1.a();
        }
        Resources resources = this.o;
        return resources == null ? super.getResources() : resources;
    }

    public a h() {
        h hVar = (h) g();
        hVar.j();
        return hVar.i;
    }

    public void invalidateOptionsMenu() {
        g().b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.o != null) {
            this.o.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        h hVar = (h) g();
        if (hVar.A && hVar.u) {
            hVar.j();
            a aVar = hVar.i;
            if (aVar != null) {
                aVar.a(configuration);
            }
        }
        j.a().a(hVar.e);
        hVar.a(false);
    }

    public void onContentChanged() {
    }

    public void onCreate(Bundle bundle) {
        g g = g();
        g.a();
        g.a(bundle);
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        h hVar = (h) g();
        if (hVar != null) {
            g.b((g) hVar);
            if (hVar.T) {
                hVar.f.getDecorView().removeCallbacks(hVar.V);
            }
            hVar.L = false;
            hVar.M = true;
            a aVar = hVar.i;
            h.g gVar = hVar.R;
            if (gVar != null) {
                gVar.a();
            }
            h.g gVar2 = hVar.S;
            if (gVar2 != null) {
                gVar2.a();
                return;
            }
            return;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r0 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 1
            if (r0 >= r1) goto L_0x003f
            boolean r0 = r5.isCtrlPressed()
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getRepeatCount()
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003f
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L_0x003f
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003f
            android.view.View r0 = r0.getDecorView()
            boolean r0 = r0.dispatchKeyShortcutEvent(r5)
            if (r0 == 0) goto L_0x003f
            r0 = r2
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x0043
            return r2
        L_0x0043:
            boolean r4 = super.onKeyDown(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.e.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        a h = h();
        if (menuItem.getItemId() != 16908332 || h == null || (h.b() & 4) == 0) {
            return false;
        }
        Intent a2 = o.a((Activity) this);
        if (a2 == null) {
            return false;
        }
        if (shouldUpRecreateTask(a2)) {
            ArrayList arrayList = new ArrayList();
            Intent e = e();
            if (e == null) {
                e = o.a((Activity) this);
            }
            if (e != null) {
                ComponentName component = e.getComponent();
                if (component == null) {
                    component = e.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                while (true) {
                    try {
                        Intent a3 = o.a((Context) this, component);
                        if (a3 == null) {
                            break;
                        }
                        arrayList.add(size, a3);
                        component = a3.getComponent();
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e2);
                    }
                }
                arrayList.add(e);
            }
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                a.f.e.a.a(this, intentArr, (Bundle) null);
                try {
                    a.f.d.a.a(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            navigateUpTo(a2);
            return true;
        }
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((h) g()).f();
    }

    public void onPostResume() {
        super.onPostResume();
        h hVar = (h) g();
        hVar.j();
        a aVar = hVar.i;
        if (aVar != null) {
            aVar.c(true);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        h hVar = (h) g();
        if (hVar.N != -100) {
            h.a0.put(hVar.d.getClass(), Integer.valueOf(hVar.N));
        }
    }

    public void onStart() {
        super.onStart();
        h hVar = (h) g();
        hVar.L = true;
        hVar.d();
        g.a((g) hVar);
    }

    public void onStop() {
        super.onStop();
        g().c();
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        g().a(charSequence);
    }

    public void openOptionsMenu() {
        a h = h();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        g().b(i);
    }

    public void setContentView(View view) {
        g().a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g().b(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        ((h) g()).O = i;
    }
}
