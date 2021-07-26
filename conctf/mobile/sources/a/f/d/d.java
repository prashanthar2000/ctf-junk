package a.f.d;

import a.f.k.c;
import a.f.k.k;
import a.j.e;
import a.j.h;
import a.j.i;
import a.j.p;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class d extends Activity implements h, c.a {

    /* renamed from: b  reason: collision with root package name */
    public i f268b = new i(this);

    public boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !k.b(decorView, keyEvent)) {
            return c.a(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !k.b(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p.a((Activity) this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f268b.a(e.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
