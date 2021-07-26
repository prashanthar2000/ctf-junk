package a.b.o.i;

import a.b.k.d;
import a.b.o.i.m;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

public class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: b  reason: collision with root package name */
    public g f90b;
    public d c;
    public e d;

    public h(g gVar) {
        this.f90b = gVar;
    }

    public void a(g gVar, boolean z) {
        d dVar;
        if ((z || gVar == this.f90b) && (dVar = this.c) != null) {
            dVar.dismiss();
        }
    }

    public boolean a(g gVar) {
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f90b.a((MenuItem) (i) this.d.a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        e eVar = this.d;
        g gVar = this.f90b;
        m.a aVar = eVar.i;
        if (aVar != null) {
            aVar.a(gVar, true);
        }
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.c.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f90b.a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f90b.performShortcut(i, keyEvent, 0);
    }
}
