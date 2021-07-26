package androidx.activity;

import a.f.d.d;
import a.j.e;
import a.j.f;
import a.j.h;
import a.j.i;
import a.j.p;
import a.j.t;
import a.j.u;
import a.l.c;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class ComponentActivity extends d implements h, u, c, a.a.c {
    public final i c = new i(this);
    public final a.l.b d = new a.l.b(this);
    public t e;
    public final OnBackPressedDispatcher f = new OnBackPressedDispatcher(new a());

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public t f448a;
    }

    public ComponentActivity() {
        i iVar = this.c;
        if (iVar != null) {
            iVar.a(new f() {
                public void a(h hVar, e.a aVar) {
                    if (aVar == e.a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
            this.c.a(new f() {
                public void a(h hVar, e.a aVar) {
                    if (aVar == e.a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.d().a();
                    }
                }
            });
            if (Build.VERSION.SDK_INT <= 23) {
                this.c.a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public e a() {
        return this.c;
    }

    public final OnBackPressedDispatcher b() {
        return this.f;
    }

    public final a.l.a c() {
        return this.d.f424b;
    }

    public t d() {
        if (getApplication() != null) {
            if (this.e == null) {
                b bVar = (b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.e = bVar.f448a;
                }
                if (this.e == null) {
                    this.e = new t();
                }
            }
            return this.e;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void onBackPressed() {
        this.f.a();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d.a(bundle);
        p.a((Activity) this);
    }

    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        t tVar = this.e;
        if (tVar == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            tVar = bVar.f448a;
        }
        if (tVar == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.f448a = tVar;
        return bVar2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        i iVar = this.c;
        if (iVar instanceof i) {
            iVar.a(e.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.d.b(bundle);
    }
}
