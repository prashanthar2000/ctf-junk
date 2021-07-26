package a.b.k;

import a.b.o.a;
import a.b.o.i.g;
import a.b.o.i.m;
import a.b.p.c0;
import a.b.p.d1;
import a.b.p.x0;
import a.f.k.p;
import a.f.k.q;
import a.f.k.r;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import java.lang.Thread;
import java.util.List;
import java.util.Map;

public class h extends g implements g.a, LayoutInflater.Factory2 {
    public static final Map<Class<?>, Integer> a0 = new a.d.a();
    public static final boolean b0 = false;
    public static final int[] c0 = {16842836};
    public static boolean d0 = true;
    public static final boolean e0;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public j[] G;
    public j H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N = -100;
    public int O;
    public boolean P;
    public boolean Q;
    public g R;
    public g S;
    public boolean T;
    public int U;
    public final Runnable V = new b();
    public boolean W;
    public Rect X;
    public Rect Y;
    public AppCompatViewInflater Z;
    public final Object d;
    public final Context e;
    public Window f;
    public e g;
    public final f h;
    public a i;
    public MenuInflater j;
    public CharSequence k;
    public c0 l;
    public c m;
    public k n;
    public a.b.o.a o;
    public ActionBarContextView p;
    public PopupWindow q;
    public Runnable r;
    public p s = null;
    public boolean t = true;
    public boolean u;
    public ViewGroup v;
    public TextView w;
    public View x;
    public boolean y;
    public boolean z;

    public static class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f9a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f9a = uncaughtExceptionHandler;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            String message;
            boolean z = false;
            if ((th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains("drawable") || message.contains("Drawable"))) {
                z = true;
            }
            if (z) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f9a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f9a.uncaughtException(thread, th);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            h hVar = h.this;
            if ((hVar.U & 1) != 0) {
                hVar.c(0);
            }
            h hVar2 = h.this;
            if ((hVar2.U & 4096) != 0) {
                hVar2.c(a.b.j.AppCompatTheme_textColorAlertDialogListItem);
            }
            h hVar3 = h.this;
            hVar3.T = false;
            hVar3.U = 0;
        }
    }

    public final class c implements m.a {
        public c() {
        }

        public void a(a.b.o.i.g gVar, boolean z) {
            h.this.b(gVar);
        }

        public boolean a(a.b.o.i.g gVar) {
            Window.Callback i = h.this.i();
            if (i == null) {
                return true;
            }
            i.onMenuOpened(a.b.j.AppCompatTheme_textColorAlertDialogListItem, gVar);
            return true;
        }
    }

    public class d implements a.C0004a {

        /* renamed from: a  reason: collision with root package name */
        public a.C0004a f12a;

        public class a extends r {
            public a() {
            }

            public void a(View view) {
                h.this.p.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.p.getParent() instanceof View) {
                    a.f.k.k.l((View) h.this.p.getParent());
                }
                h.this.p.removeAllViews();
                h.this.s.a((q) null);
                h.this.s = null;
            }
        }

        public d(a.C0004a aVar) {
            this.f12a = aVar;
        }

        public void a(a.b.o.a aVar) {
            this.f12a.a(aVar);
            h hVar = h.this;
            if (hVar.q != null) {
                hVar.f.getDecorView().removeCallbacks(h.this.r);
            }
            h hVar2 = h.this;
            if (hVar2.p != null) {
                hVar2.e();
                h hVar3 = h.this;
                p a2 = a.f.k.k.a(hVar3.p);
                a2.a(0.0f);
                hVar3.s = a2;
                p pVar = h.this.s;
                a aVar2 = new a();
                View view = (View) pVar.f330a.get();
                if (view != null) {
                    pVar.a(view, aVar2);
                }
            }
            h hVar4 = h.this;
            f fVar = hVar4.h;
            if (fVar != null) {
                fVar.b(hVar4.o);
            }
            h.this.o = null;
        }

        public boolean a(a.b.o.a aVar, Menu menu) {
            return this.f12a.a(aVar, menu);
        }

        public boolean a(a.b.o.a aVar, MenuItem menuItem) {
            return this.f12a.a(aVar, menuItem);
        }

        public boolean b(a.b.o.a aVar, Menu menu) {
            return this.f12a.b(aVar, menu);
        }
    }

    public class e extends a.b.o.h {
        public e(Window.Callback callback) {
            super(callback);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0052  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.ActionMode a(android.view.ActionMode.Callback r10) {
            /*
                r9 = this;
                a.b.o.e$a r0 = new a.b.o.e$a
                a.b.k.h r1 = a.b.k.h.this
                android.content.Context r1 = r1.e
                r0.<init>(r1, r10)
                a.b.k.h r10 = a.b.k.h.this
                r1 = 0
                if (r10 == 0) goto L_0x01ba
                a.b.o.a r2 = r10.o
                if (r2 == 0) goto L_0x0015
                r2.a()
            L_0x0015:
                a.b.k.h$d r2 = new a.b.k.h$d
                r2.<init>(r0)
                r10.j()
                a.b.k.a r3 = r10.i
                if (r3 == 0) goto L_0x0030
                a.b.o.a r3 = r3.a((a.b.o.a.C0004a) r2)
                r10.o = r3
                if (r3 == 0) goto L_0x0030
                a.b.k.f r4 = r10.h
                if (r4 == 0) goto L_0x0030
                r4.a((a.b.o.a) r3)
            L_0x0030:
                a.b.o.a r3 = r10.o
                if (r3 != 0) goto L_0x01b0
                r10.e()
                a.b.o.a r3 = r10.o
                if (r3 == 0) goto L_0x003e
                r3.a()
            L_0x003e:
                a.b.k.f r3 = r10.h
                if (r3 == 0) goto L_0x004b
                boolean r4 = r10.M
                if (r4 != 0) goto L_0x004b
                a.b.o.a r3 = r3.a((a.b.o.a.C0004a) r2)     // Catch:{ AbstractMethodError -> 0x004b }
                goto L_0x004c
            L_0x004b:
                r3 = r1
            L_0x004c:
                if (r3 == 0) goto L_0x0052
                r10.o = r3
                goto L_0x01a1
            L_0x0052:
                androidx.appcompat.widget.ActionBarContextView r3 = r10.p
                r4 = 0
                r5 = 1
                if (r3 != 0) goto L_0x010a
                boolean r3 = r10.D
                if (r3 == 0) goto L_0x00de
                android.util.TypedValue r3 = new android.util.TypedValue
                r3.<init>()
                android.content.Context r6 = r10.e
                android.content.res.Resources$Theme r6 = r6.getTheme()
                int r7 = a.b.a.actionBarTheme
                r6.resolveAttribute(r7, r3, r5)
                int r7 = r3.resourceId
                if (r7 == 0) goto L_0x0091
                android.content.Context r7 = r10.e
                android.content.res.Resources r7 = r7.getResources()
                android.content.res.Resources$Theme r7 = r7.newTheme()
                r7.setTo(r6)
                int r6 = r3.resourceId
                r7.applyStyle(r6, r5)
                a.b.o.c r6 = new a.b.o.c
                android.content.Context r8 = r10.e
                r6.<init>(r8, r4)
                android.content.res.Resources$Theme r8 = r6.getTheme()
                r8.setTo(r7)
                goto L_0x0093
            L_0x0091:
                android.content.Context r6 = r10.e
            L_0x0093:
                androidx.appcompat.widget.ActionBarContextView r7 = new androidx.appcompat.widget.ActionBarContextView
                r7.<init>(r6)
                r10.p = r7
                android.widget.PopupWindow r7 = new android.widget.PopupWindow
                int r8 = a.b.a.actionModePopupWindowStyle
                r7.<init>(r6, r1, r8)
                r10.q = r7
                r8 = 2
                r7.setWindowLayoutType(r8)
                android.widget.PopupWindow r7 = r10.q
                androidx.appcompat.widget.ActionBarContextView r8 = r10.p
                r7.setContentView(r8)
                android.widget.PopupWindow r7 = r10.q
                r8 = -1
                r7.setWidth(r8)
                android.content.res.Resources$Theme r7 = r6.getTheme()
                int r8 = a.b.a.actionBarSize
                r7.resolveAttribute(r8, r3, r5)
                int r3 = r3.data
                android.content.res.Resources r6 = r6.getResources()
                android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
                int r3 = android.util.TypedValue.complexToDimensionPixelSize(r3, r6)
                androidx.appcompat.widget.ActionBarContextView r6 = r10.p
                r6.setContentHeight(r3)
                android.widget.PopupWindow r3 = r10.q
                r6 = -2
                r3.setHeight(r6)
                a.b.k.l r3 = new a.b.k.l
                r3.<init>(r10)
                r10.r = r3
                goto L_0x010a
            L_0x00de:
                android.view.ViewGroup r3 = r10.v
                int r6 = a.b.f.action_mode_bar_stub
                android.view.View r3 = r3.findViewById(r6)
                androidx.appcompat.widget.ViewStubCompat r3 = (androidx.appcompat.widget.ViewStubCompat) r3
                if (r3 == 0) goto L_0x010a
                r10.j()
                a.b.k.a r6 = r10.i
                if (r6 == 0) goto L_0x00f6
                android.content.Context r6 = r6.c()
                goto L_0x00f7
            L_0x00f6:
                r6 = r1
            L_0x00f7:
                if (r6 != 0) goto L_0x00fb
                android.content.Context r6 = r10.e
            L_0x00fb:
                android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
                r3.setLayoutInflater(r6)
                android.view.View r3 = r3.a()
                androidx.appcompat.widget.ActionBarContextView r3 = (androidx.appcompat.widget.ActionBarContextView) r3
                r10.p = r3
            L_0x010a:
                androidx.appcompat.widget.ActionBarContextView r3 = r10.p
                if (r3 == 0) goto L_0x01a1
                r10.e()
                androidx.appcompat.widget.ActionBarContextView r3 = r10.p
                r3.b()
                a.b.o.d r3 = new a.b.o.d
                androidx.appcompat.widget.ActionBarContextView r6 = r10.p
                android.content.Context r6 = r6.getContext()
                androidx.appcompat.widget.ActionBarContextView r7 = r10.p
                android.widget.PopupWindow r8 = r10.q
                if (r8 != 0) goto L_0x0125
                goto L_0x0126
            L_0x0125:
                r5 = r4
            L_0x0126:
                r3.<init>(r6, r7, r2, r5)
                a.b.o.i.g r5 = r3.i
                a.b.o.a$a r2 = r2.f12a
                boolean r2 = r2.b(r3, r5)
                if (r2 == 0) goto L_0x019f
                r3.g()
                androidx.appcompat.widget.ActionBarContextView r2 = r10.p
                r2.a(r3)
                r10.o = r3
                boolean r2 = r10.k()
                r3 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0169
                androidx.appcompat.widget.ActionBarContextView r2 = r10.p
                r4 = 0
                r2.setAlpha(r4)
                androidx.appcompat.widget.ActionBarContextView r2 = r10.p
                a.f.k.p r2 = a.f.k.k.a(r2)
                r2.a((float) r3)
                r10.s = r2
                a.b.k.m r3 = new a.b.k.m
                r3.<init>(r10)
                java.lang.ref.WeakReference<android.view.View> r4 = r2.f330a
                java.lang.Object r4 = r4.get()
                android.view.View r4 = (android.view.View) r4
                if (r4 == 0) goto L_0x018f
                r2.a(r4, r3)
                goto L_0x018f
            L_0x0169:
                androidx.appcompat.widget.ActionBarContextView r2 = r10.p
                r2.setAlpha(r3)
                androidx.appcompat.widget.ActionBarContextView r2 = r10.p
                r2.setVisibility(r4)
                androidx.appcompat.widget.ActionBarContextView r2 = r10.p
                r3 = 32
                r2.sendAccessibilityEvent(r3)
                androidx.appcompat.widget.ActionBarContextView r2 = r10.p
                android.view.ViewParent r2 = r2.getParent()
                boolean r2 = r2 instanceof android.view.View
                if (r2 == 0) goto L_0x018f
                androidx.appcompat.widget.ActionBarContextView r2 = r10.p
                android.view.ViewParent r2 = r2.getParent()
                android.view.View r2 = (android.view.View) r2
                r2.requestApplyInsets()
            L_0x018f:
                android.widget.PopupWindow r2 = r10.q
                if (r2 == 0) goto L_0x01a1
                android.view.Window r2 = r10.f
                android.view.View r2 = r2.getDecorView()
                java.lang.Runnable r3 = r10.r
                r2.post(r3)
                goto L_0x01a1
            L_0x019f:
                r10.o = r1
            L_0x01a1:
                a.b.o.a r2 = r10.o
                if (r2 == 0) goto L_0x01ac
                a.b.k.f r3 = r10.h
                if (r3 == 0) goto L_0x01ac
                r3.a((a.b.o.a) r2)
            L_0x01ac:
                a.b.o.a r2 = r10.o
                r10.o = r2
            L_0x01b0:
                a.b.o.a r10 = r10.o
                if (r10 == 0) goto L_0x01b9
                android.view.ActionMode r10 = r0.b(r10)
                return r10
            L_0x01b9:
                return r1
            L_0x01ba:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.k.h.e.a(android.view.ActionMode$Callback):android.view.ActionMode");
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.a(keyEvent) || this.f73b.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
            if (r6 != false) goto L_0x001d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                android.view.Window$Callback r0 = r5.f73b
                boolean r0 = r0.dispatchKeyShortcutEvent(r6)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x004f
                a.b.k.h r0 = a.b.k.h.this
                int r3 = r6.getKeyCode()
                r0.j()
                a.b.k.a r4 = r0.i
                if (r4 == 0) goto L_0x001f
                boolean r3 = r4.a(r3, r6)
                if (r3 == 0) goto L_0x001f
            L_0x001d:
                r6 = r2
                goto L_0x004d
            L_0x001f:
                a.b.k.h$j r3 = r0.H
                if (r3 == 0) goto L_0x0034
                int r4 = r6.getKeyCode()
                boolean r3 = r0.a(r3, r4, r6, r2)
                if (r3 == 0) goto L_0x0034
                a.b.k.h$j r6 = r0.H
                if (r6 == 0) goto L_0x001d
                r6.n = r2
                goto L_0x001d
            L_0x0034:
                a.b.k.h$j r3 = r0.H
                if (r3 != 0) goto L_0x004c
                a.b.k.h$j r3 = r0.d(r1)
                r0.b((a.b.k.h.j) r3, (android.view.KeyEvent) r6)
                int r4 = r6.getKeyCode()
                boolean r6 = r0.a(r3, r4, r6, r2)
                r3.m = r1
                if (r6 == 0) goto L_0x004c
                goto L_0x001d
            L_0x004c:
                r6 = r1
            L_0x004d:
                if (r6 == 0) goto L_0x0050
            L_0x004f:
                r1 = r2
            L_0x0050:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.k.h.e.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof a.b.o.i.g)) {
                return this.f73b.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            this.f73b.onMenuOpened(i, menu);
            h hVar = h.this;
            if (hVar != null) {
                if (i == 108) {
                    hVar.j();
                    a aVar = hVar.i;
                    if (aVar != null) {
                        aVar.a(true);
                    }
                }
                return true;
            }
            throw null;
        }

        public void onPanelClosed(int i, Menu menu) {
            this.f73b.onPanelClosed(i, menu);
            h hVar = h.this;
            if (hVar == null) {
                throw null;
            } else if (i == 108) {
                hVar.j();
                a aVar = hVar.i;
                if (aVar != null) {
                    aVar.a(false);
                }
            } else if (i == 0) {
                j d = hVar.d(i);
                if (d.o) {
                    hVar.a(d, false);
                }
            }
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            a.b.o.i.g gVar = menu instanceof a.b.o.i.g ? (a.b.o.i.g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.y = true;
            }
            boolean onPreparePanel = this.f73b.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.y = false;
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            a.b.o.i.g gVar;
            j d = h.this.d(0);
            if (d == null || (gVar = d.j) == null) {
                this.f73b.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                this.f73b.onProvideKeyboardShortcuts(list, gVar, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!h.this.t || i != 0) {
                return this.f73b.onWindowStartingActionMode(callback, i);
            }
            return a(callback);
        }
    }

    public class f extends g {
        public final PowerManager c;

        public f(Context context) {
            super();
            this.c = (PowerManager) context.getSystemService("power");
        }

        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public int c() {
            return this.c.isPowerSaveMode() ? 2 : 1;
        }

        public void d() {
            h.this.d();
        }
    }

    public abstract class g {

        /* renamed from: a  reason: collision with root package name */
        public BroadcastReceiver f15a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            public void onReceive(Context context, Intent intent) {
                g.this.d();
            }
        }

        public g() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f15a;
            if (broadcastReceiver != null) {
                try {
                    h.this.e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f15a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b2 = b();
            if (b2 != null && b2.countActions() != 0) {
                if (this.f15a == null) {
                    this.f15a = new a();
                }
                h.this.e.registerReceiver(this.f15a, b2);
            }
        }
    }

    /* renamed from: a.b.k.h$h  reason: collision with other inner class name */
    public class C0001h extends g {
        public final q c;

        public C0001h(q qVar) {
            super();
            this.c = qVar;
        }

        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:49:0x00ec A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int c() {
            /*
                r24 = this;
                r0 = r24
                a.b.k.q r1 = r0.c
                a.b.k.q$a r2 = r1.c
                long r3 = r2.f36b
                long r5 = java.lang.System.currentTimeMillis()
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                r4 = 1
                if (r3 <= 0) goto L_0x0013
                r3 = r4
                goto L_0x0014
            L_0x0013:
                r3 = 0
            L_0x0014:
                if (r3 == 0) goto L_0x001a
            L_0x0016:
                boolean r1 = r2.f35a
                goto L_0x00ea
            L_0x001a:
                android.content.Context r3 = r1.f33a
                java.lang.String r6 = "android.permission.ACCESS_COARSE_LOCATION"
                int r3 = a.b.k.o.a((android.content.Context) r3, (java.lang.String) r6)
                r6 = 0
                if (r3 != 0) goto L_0x002c
                java.lang.String r3 = "network"
                android.location.Location r3 = r1.a(r3)
                goto L_0x002d
            L_0x002c:
                r3 = r6
            L_0x002d:
                android.content.Context r7 = r1.f33a
                java.lang.String r8 = "android.permission.ACCESS_FINE_LOCATION"
                int r7 = a.b.k.o.a((android.content.Context) r7, (java.lang.String) r8)
                if (r7 != 0) goto L_0x003d
                java.lang.String r6 = "gps"
                android.location.Location r6 = r1.a(r6)
            L_0x003d:
                if (r6 == 0) goto L_0x004e
                if (r3 == 0) goto L_0x004e
                long r7 = r6.getTime()
                long r9 = r3.getTime()
                int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r7 <= 0) goto L_0x0051
                goto L_0x0050
            L_0x004e:
                if (r6 == 0) goto L_0x0051
            L_0x0050:
                r3 = r6
            L_0x0051:
                if (r3 == 0) goto L_0x00cd
                a.b.k.q$a r1 = r1.c
                long r13 = java.lang.System.currentTimeMillis()
                a.b.k.p r6 = a.b.k.p.d
                if (r6 != 0) goto L_0x0064
                a.b.k.p r6 = new a.b.k.p
                r6.<init>()
                a.b.k.p.d = r6
            L_0x0064:
                a.b.k.p r11 = a.b.k.p.d
                r22 = 86400000(0x5265c00, double:4.2687272E-316)
                long r16 = r13 - r22
                double r18 = r3.getLatitude()
                double r20 = r3.getLongitude()
                r15 = r11
                r15.a(r16, r18, r20)
                double r9 = r3.getLatitude()
                double r15 = r3.getLongitude()
                r6 = r11
                r7 = r13
                r5 = r11
                r11 = r15
                r6.a(r7, r9, r11)
                int r6 = r5.c
                if (r6 != r4) goto L_0x008c
                r6 = r4
                goto L_0x008d
            L_0x008c:
                r6 = 0
            L_0x008d:
                long r7 = r5.f32b
                long r9 = r5.f31a
                long r16 = r13 + r22
                double r18 = r3.getLatitude()
                double r20 = r3.getLongitude()
                r15 = r5
                r15.a(r16, r18, r20)
                long r11 = r5.f32b
                r15 = 0
                r17 = -1
                int r3 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
                if (r3 == 0) goto L_0x00c2
                int r3 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
                if (r3 != 0) goto L_0x00ae
                goto L_0x00c2
            L_0x00ae:
                int r3 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r3 <= 0) goto L_0x00b4
                long r11 = r11 + r15
                goto L_0x00bd
            L_0x00b4:
                int r3 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                if (r3 <= 0) goto L_0x00bb
                long r11 = r9 + r15
                goto L_0x00bd
            L_0x00bb:
                long r11 = r7 + r15
            L_0x00bd:
                r7 = 60000(0xea60, double:2.9644E-319)
                long r11 = r11 + r7
                goto L_0x00c7
            L_0x00c2:
                r7 = 43200000(0x2932e00, double:2.1343636E-316)
                long r11 = r13 + r7
            L_0x00c7:
                r1.f35a = r6
                r1.f36b = r11
                goto L_0x0016
            L_0x00cd:
                java.lang.String r1 = "TwilightManager"
                java.lang.String r2 = "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."
                android.util.Log.i(r1, r2)
                java.util.Calendar r1 = java.util.Calendar.getInstance()
                r2 = 11
                int r1 = r1.get(r2)
                r2 = 6
                if (r1 < r2) goto L_0x00e8
                r2 = 22
                if (r1 < r2) goto L_0x00e6
                goto L_0x00e8
            L_0x00e6:
                r5 = 0
                goto L_0x00e9
            L_0x00e8:
                r5 = r4
            L_0x00e9:
                r1 = r5
            L_0x00ea:
                if (r1 == 0) goto L_0x00ed
                r4 = 2
            L_0x00ed:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.k.h.C0001h.c():int");
        }

        public void d() {
            h.this.d();
        }
    }

    public class i extends ContentFrameLayout {
        public i(Context context) {
            super(context);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    h hVar = h.this;
                    hVar.a(hVar.d(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(a.b.l.a.a.b(getContext(), i));
        }
    }

    public static final class j {

        /* renamed from: a  reason: collision with root package name */
        public int f18a;

        /* renamed from: b  reason: collision with root package name */
        public int f19b;
        public int c;
        public int d;
        public int e;
        public int f;
        public ViewGroup g;
        public View h;
        public View i;
        public a.b.o.i.g j;
        public a.b.o.i.e k;
        public Context l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q = false;
        public boolean r;
        public Bundle s;

        public j(int i2) {
            this.f18a = i2;
        }

        public void a(a.b.o.i.g gVar) {
            a.b.o.i.e eVar;
            a.b.o.i.g gVar2 = this.j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.a((m) this.k);
                }
                this.j = gVar;
                if (gVar != null && (eVar = this.k) != null) {
                    gVar.a((m) eVar, gVar.f88a);
                }
            }
        }
    }

    public final class k implements m.a {
        public k() {
        }

        public void a(a.b.o.i.g gVar, boolean z) {
            a.b.o.i.g c = gVar.c();
            boolean z2 = c != gVar;
            h hVar = h.this;
            if (z2) {
                gVar = c;
            }
            j a2 = hVar.a((Menu) gVar);
            if (a2 == null) {
                return;
            }
            if (z2) {
                h.this.a(a2.f18a, a2, c);
                h.this.a(a2, true);
                return;
            }
            h.this.a(a2, z);
        }

        public boolean a(a.b.o.i.g gVar) {
            Window.Callback i;
            if (gVar != null) {
                return true;
            }
            h hVar = h.this;
            if (!hVar.A || (i = hVar.i()) == null || h.this.M) {
                return true;
            }
            i.onMenuOpened(a.b.j.AppCompatTheme_textColorAlertDialogListItem, gVar);
            return true;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (i2 <= 25) {
            z2 = true;
        }
        e0 = z2;
        if (b0 && !d0) {
            Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    public h(Context context, Window window, f fVar, Object obj) {
        Integer num;
        e eVar = null;
        this.e = context;
        this.h = fVar;
        this.d = obj;
        if (this.N == -100 && (obj instanceof Dialog)) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof e)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        eVar = (e) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (eVar != null) {
                this.N = ((h) eVar.g()).N;
            }
        }
        if (this.N == -100 && (num = a0.get(this.d.getClass())) != null) {
            this.N = num.intValue();
            a0.remove(this.d.getClass());
        }
        if (window != null) {
            a(window);
        }
        a.b.p.j.b();
    }

    public j a(Menu menu) {
        j[] jVarArr = this.G;
        int length = jVarArr != null ? jVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            j jVar = jVarArr[i2];
            if (jVar != null && jVar.j == menu) {
                return jVar;
            }
        }
        return null;
    }

    public void a(j jVar, boolean z2) {
        ViewGroup viewGroup;
        c0 c0Var;
        if (!z2 || jVar.f18a != 0 || (c0Var = this.l) == null || !c0Var.d()) {
            WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
            if (!(windowManager == null || !jVar.o || (viewGroup = jVar.g) == null)) {
                windowManager.removeView(viewGroup);
                if (z2) {
                    a(jVar.f18a, jVar, (Menu) null);
                }
            }
            jVar.m = false;
            jVar.n = false;
            jVar.o = false;
            jVar.h = null;
            jVar.q = true;
            if (this.H == jVar) {
                this.H = null;
                return;
            }
            return;
        }
        b(jVar.j);
    }

    public void a(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        ((ViewGroup) this.v.findViewById(16908290)).addView(view, layoutParams);
        this.g.f73b.onContentChanged();
    }

    public final boolean a(j jVar, int i2, KeyEvent keyEvent, int i3) {
        a.b.o.i.g gVar;
        boolean z2 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((jVar.m || b(jVar, keyEvent)) && (gVar = jVar.j) != null) {
            z2 = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (z2 && (i3 & 1) == 0 && this.l == null) {
            a(jVar, true);
        }
        return z2;
    }

    public boolean a(a.b.o.i.g gVar, MenuItem menuItem) {
        j a2;
        Window.Callback i2 = i();
        if (i2 == null || this.M || (a2 = a((Menu) gVar.c())) == null) {
            return false;
        }
        return i2.onMenuItemSelected(a2.f18a, menuItem);
    }

    public void b() {
        j();
        a aVar = this.i;
        e(0);
    }

    public void b(a.b.o.i.g gVar) {
        if (!this.F) {
            this.F = true;
            this.l.g();
            Window.Callback i2 = i();
            if (i2 != null && !this.M) {
                i2.onPanelClosed(a.b.j.AppCompatTheme_textColorAlertDialogListItem, gVar);
            }
            this.F = false;
        }
    }

    public void c() {
        this.L = false;
        g.b((g) this);
        j();
        a aVar = this.i;
        if (aVar != null) {
            aVar.c(false);
        }
        if (this.d instanceof Dialog) {
            g gVar = this.R;
            if (gVar != null) {
                gVar.a();
            }
            g gVar2 = this.S;
            if (gVar2 != null) {
                gVar2.a();
            }
        }
    }

    public void c(int i2) {
        j d2;
        j d3 = d(i2);
        if (d3.j != null) {
            Bundle bundle = new Bundle();
            d3.j.b(bundle);
            if (bundle.size() > 0) {
                d3.s = bundle;
            }
            d3.j.j();
            d3.j.clear();
        }
        d3.r = true;
        d3.q = true;
        if ((i2 == 108 || i2 == 0) && this.l != null && (d2 = d(0)) != null) {
            d2.m = false;
            b(d2, (KeyEvent) null);
        }
    }

    public j d(int i2) {
        j[] jVarArr = this.G;
        if (jVarArr == null || jVarArr.length <= i2) {
            j[] jVarArr2 = new j[(i2 + 1)];
            if (jVarArr != null) {
                System.arraycopy(jVarArr, 0, jVarArr2, 0, jVarArr.length);
            }
            this.G = jVarArr2;
            jVarArr = jVarArr2;
        }
        j jVar = jVarArr[i2];
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(i2);
        jVarArr[i2] = jVar2;
        return jVar2;
    }

    public boolean d() {
        return a(true);
    }

    public void e() {
        p pVar = this.s;
        if (pVar != null) {
            pVar.a();
        }
    }

    public final void e(int i2) {
        this.U = (1 << i2) | this.U;
        if (!this.T) {
            a.f.k.k.a(this.f.getDecorView(), this.V);
            this.T = true;
        }
    }

    public int f(int i2) {
        boolean z2;
        boolean z3;
        ActionBarContextView actionBarContextView = this.p;
        int i3 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            boolean z4 = true;
            if (this.p.isShown()) {
                if (this.X == null) {
                    this.X = new Rect();
                    this.Y = new Rect();
                }
                Rect rect = this.X;
                Rect rect2 = this.Y;
                rect.set(0, i2, 0, 0);
                d1.a(this.v, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i2 : 0)) {
                    marginLayoutParams.topMargin = i2;
                    View view = this.x;
                    if (view == null) {
                        View view2 = new View(this.e);
                        this.x = view2;
                        view2.setBackgroundColor(this.e.getResources().getColor(a.b.c.abc_input_method_navigation_guard));
                        this.v.addView(this.x, -1, new ViewGroup.LayoutParams(-1, i2));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i2) {
                            layoutParams.height = i2;
                            this.x.setLayoutParams(layoutParams);
                        }
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.x == null) {
                    z4 = false;
                }
                if (!this.C && z4) {
                    i2 = 0;
                }
                boolean z5 = z4;
                z4 = z3;
                z2 = z5;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                z4 = false;
            }
            if (z4) {
                this.p.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.x;
        if (view3 != null) {
            if (!z2) {
                i3 = 8;
            }
            view3.setVisibility(i3);
        }
        return i2;
    }

    public final void f() {
        ViewGroup viewGroup;
        if (!this.u) {
            TypedArray obtainStyledAttributes = this.e.obtainStyledAttributes(a.b.j.AppCompatTheme);
            if (obtainStyledAttributes.hasValue(a.b.j.AppCompatTheme_windowActionBar)) {
                if (obtainStyledAttributes.getBoolean(a.b.j.AppCompatTheme_windowNoTitle, false)) {
                    a(1);
                } else if (obtainStyledAttributes.getBoolean(a.b.j.AppCompatTheme_windowActionBar, false)) {
                    a((int) a.b.j.AppCompatTheme_textColorAlertDialogListItem);
                }
                if (obtainStyledAttributes.getBoolean(a.b.j.AppCompatTheme_windowActionBarOverlay, false)) {
                    a((int) a.b.j.AppCompatTheme_textColorSearchUrl);
                }
                if (obtainStyledAttributes.getBoolean(a.b.j.AppCompatTheme_windowActionModeOverlay, false)) {
                    a(10);
                }
                this.D = obtainStyledAttributes.getBoolean(a.b.j.AppCompatTheme_android_windowIsFloating, false);
                obtainStyledAttributes.recycle();
                g();
                this.f.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.e);
                if (this.E) {
                    viewGroup = (ViewGroup) from.inflate(this.C ? a.b.g.abc_screen_simple_overlay_action_mode : a.b.g.abc_screen_simple, (ViewGroup) null);
                    a.f.k.k.a((View) viewGroup, (a.f.k.i) new i(this));
                } else if (this.D) {
                    viewGroup = (ViewGroup) from.inflate(a.b.g.abc_dialog_title_material, (ViewGroup) null);
                    this.B = false;
                    this.A = false;
                } else if (this.A) {
                    TypedValue typedValue = new TypedValue();
                    this.e.getTheme().resolveAttribute(a.b.a.actionBarTheme, typedValue, true);
                    viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new a.b.o.c(this.e, typedValue.resourceId) : this.e).inflate(a.b.g.abc_screen_toolbar, (ViewGroup) null);
                    c0 c0Var = (c0) viewGroup.findViewById(a.b.f.decor_content_parent);
                    this.l = c0Var;
                    c0Var.setWindowCallback(i());
                    if (this.B) {
                        this.l.a(a.b.j.AppCompatTheme_textColorSearchUrl);
                    }
                    if (this.y) {
                        this.l.a(2);
                    }
                    if (this.z) {
                        this.l.a(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    if (this.l == null) {
                        this.w = (TextView) viewGroup.findViewById(a.b.f.title);
                    }
                    d1.b(viewGroup);
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(a.b.f.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.f.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new k(this));
                    this.v = viewGroup;
                    Object obj = this.d;
                    CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.k;
                    if (!TextUtils.isEmpty(title)) {
                        c0 c0Var2 = this.l;
                        if (c0Var2 != null) {
                            c0Var2.setWindowTitle(title);
                        } else {
                            a aVar = this.i;
                            if (aVar != null) {
                                aVar.a(title);
                            } else {
                                TextView textView = this.w;
                                if (textView != null) {
                                    textView.setText(title);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.v.findViewById(16908290);
                    View decorView = this.f.getDecorView();
                    contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (a.f.k.k.i(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.e.obtainStyledAttributes(a.b.j.AppCompatTheme);
                    obtainStyledAttributes2.getValue(a.b.j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(a.b.j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(a.b.j.AppCompatTheme_windowFixedWidthMajor)) {
                        obtainStyledAttributes2.getValue(a.b.j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(a.b.j.AppCompatTheme_windowFixedWidthMinor)) {
                        obtainStyledAttributes2.getValue(a.b.j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(a.b.j.AppCompatTheme_windowFixedHeightMajor)) {
                        obtainStyledAttributes2.getValue(a.b.j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(a.b.j.AppCompatTheme_windowFixedHeightMinor)) {
                        obtainStyledAttributes2.getValue(a.b.j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.u = true;
                    j d2 = d(0);
                    if (this.M) {
                        return;
                    }
                    if (d2 == null || d2.j == null) {
                        e(a.b.j.AppCompatTheme_textColorAlertDialogListItem);
                        return;
                    }
                    return;
                }
                StringBuilder a2 = b.a.a.a.a.a("AppCompat does not support the current theme features: { windowActionBar: ");
                a2.append(this.A);
                a2.append(", windowActionBarOverlay: ");
                a2.append(this.B);
                a2.append(", android:windowIsFloating: ");
                a2.append(this.D);
                a2.append(", windowActionModeOverlay: ");
                a2.append(this.C);
                a2.append(", windowNoTitle: ");
                a2.append(this.E);
                a2.append(" }");
                throw new IllegalArgumentException(a2.toString());
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void g() {
        if (this.f == null) {
            Object obj = this.d;
            if (obj instanceof Activity) {
                a(((Activity) obj).getWindow());
            }
        }
        if (this.f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final g h() {
        if (this.R == null) {
            Context context = this.e;
            if (q.d == null) {
                Context applicationContext = context.getApplicationContext();
                q.d = new q(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.R = new C0001h(q.d);
        }
        return this.R;
    }

    public final Window.Callback i() {
        return this.f.getCallback();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r3 = this;
            r3.f()
            boolean r0 = r3.A
            if (r0 == 0) goto L_0x0037
            a.b.k.a r0 = r3.i
            if (r0 == 0) goto L_0x000c
            goto L_0x0037
        L_0x000c:
            java.lang.Object r0 = r3.d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0020
            a.b.k.r r0 = new a.b.k.r
            java.lang.Object r1 = r3.d
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.B
            r0.<init>(r1, r2)
        L_0x001d:
            r3.i = r0
            goto L_0x002e
        L_0x0020:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x002e
            a.b.k.r r0 = new a.b.k.r
            java.lang.Object r1 = r3.d
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x002e:
            a.b.k.a r0 = r3.i
            if (r0 == 0) goto L_0x0037
            boolean r1 = r3.W
            r0.b(r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.h.j():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.v;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k() {
        /*
            r1 = this;
            boolean r0 = r1.u
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.v
            if (r0 == 0) goto L_0x0010
            boolean r0 = a.f.k.k.i(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.h.k():boolean");
    }

    public final void l() {
        if (this.u) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: a.b.o.c} */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r12).getDepth() > 1) goto L_0x0081;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r8 = this;
            androidx.appcompat.app.AppCompatViewInflater r0 = r8.Z
            r1 = 0
            if (r0 != 0) goto L_0x0060
            android.content.Context r0 = r8.e
            int[] r2 = a.b.j.AppCompatTheme
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            int r2 = a.b.j.AppCompatTheme_viewInflaterClass
            java.lang.String r0 = r0.getString(r2)
            if (r0 == 0) goto L_0x0059
            java.lang.Class<androidx.appcompat.app.AppCompatViewInflater> r2 = androidx.appcompat.app.AppCompatViewInflater.class
            java.lang.String r2 = r2.getName()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0022
            goto L_0x0059
        L_0x0022:
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0037 }
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0037 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ all -> 0x0037 }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x0037 }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ all -> 0x0037 }
            androidx.appcompat.app.AppCompatViewInflater r2 = (androidx.appcompat.app.AppCompatViewInflater) r2     // Catch:{ all -> 0x0037 }
            r8.Z = r2     // Catch:{ all -> 0x0037 }
            goto L_0x0060
        L_0x0037:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to instantiate custom view inflater "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ". Falling back to default."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "AppCompatDelegate"
            android.util.Log.i(r3, r0, r2)
            androidx.appcompat.app.AppCompatViewInflater r0 = new androidx.appcompat.app.AppCompatViewInflater
            r0.<init>()
            goto L_0x005e
        L_0x0059:
            androidx.appcompat.app.AppCompatViewInflater r0 = new androidx.appcompat.app.AppCompatViewInflater
            r0.<init>()
        L_0x005e:
            r8.Z = r0
        L_0x0060:
            boolean r0 = b0
            r2 = 1
            if (r0 == 0) goto L_0x0098
            boolean r0 = r12 instanceof org.xmlpull.v1.XmlPullParser
            if (r0 == 0) goto L_0x0073
            r0 = r12
            org.xmlpull.v1.XmlPullParser r0 = (org.xmlpull.v1.XmlPullParser) r0
            int r0 = r0.getDepth()
            if (r0 <= r2) goto L_0x0098
            goto L_0x0081
        L_0x0073:
            r0 = r9
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            if (r0 != 0) goto L_0x0079
            goto L_0x0098
        L_0x0079:
            android.view.Window r3 = r8.f
            android.view.View r3 = r3.getDecorView()
        L_0x007f:
            if (r0 != 0) goto L_0x0083
        L_0x0081:
            r0 = r2
            goto L_0x0099
        L_0x0083:
            if (r0 == r3) goto L_0x0098
            boolean r4 = r0 instanceof android.view.View
            if (r4 == 0) goto L_0x0098
            r4 = r0
            android.view.View r4 = (android.view.View) r4
            boolean r4 = a.f.k.k.h(r4)
            if (r4 == 0) goto L_0x0093
            goto L_0x0098
        L_0x0093:
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x007f
        L_0x0098:
            r0 = r1
        L_0x0099:
            androidx.appcompat.app.AppCompatViewInflater r3 = r8.Z
            boolean r4 = b0
            a.b.p.c1.a()
            r5 = 0
            if (r3 == 0) goto L_0x026e
            if (r0 == 0) goto L_0x00ac
            if (r9 == 0) goto L_0x00ac
            android.content.Context r9 = r9.getContext()
            goto L_0x00ad
        L_0x00ac:
            r9 = r11
        L_0x00ad:
            int[] r0 = a.b.j.View
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r12, r0, r1, r1)
            if (r4 == 0) goto L_0x00bc
            int r4 = a.b.j.View_android_theme
            int r4 = r0.getResourceId(r4, r1)
            goto L_0x00bd
        L_0x00bc:
            r4 = r1
        L_0x00bd:
            if (r4 != 0) goto L_0x00ce
            int r4 = a.b.j.View_theme
            int r4 = r0.getResourceId(r4, r1)
            if (r4 == 0) goto L_0x00ce
            java.lang.String r6 = "AppCompatViewInflater"
            java.lang.String r7 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r6, r7)
        L_0x00ce:
            r0.recycle()
            if (r4 == 0) goto L_0x00e4
            boolean r0 = r9 instanceof a.b.o.c
            if (r0 == 0) goto L_0x00de
            r0 = r9
            a.b.o.c r0 = (a.b.o.c) r0
            int r0 = r0.f57a
            if (r0 == r4) goto L_0x00e4
        L_0x00de:
            a.b.o.c r0 = new a.b.o.c
            r0.<init>(r9, r4)
            r9 = r0
        L_0x00e4:
            int r0 = r10.hashCode()
            r4 = -1
            switch(r0) {
                case -1946472170: goto L_0x017a;
                case -1455429095: goto L_0x016f;
                case -1346021293: goto L_0x0164;
                case -938935918: goto L_0x015a;
                case -937446323: goto L_0x0150;
                case -658531749: goto L_0x0145;
                case -339785223: goto L_0x013b;
                case 776382189: goto L_0x0131;
                case 799298502: goto L_0x0126;
                case 1125864064: goto L_0x011b;
                case 1413872058: goto L_0x010f;
                case 1601505219: goto L_0x0104;
                case 1666676343: goto L_0x00f9;
                case 2001146706: goto L_0x00ee;
                default: goto L_0x00ec;
            }
        L_0x00ec:
            goto L_0x0185
        L_0x00ee:
            java.lang.String r0 = "Button"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0185
            r0 = 2
            goto L_0x0186
        L_0x00f9:
            java.lang.String r0 = "EditText"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0185
            r0 = 3
            goto L_0x0186
        L_0x0104:
            java.lang.String r0 = "CheckBox"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0185
            r0 = 6
            goto L_0x0186
        L_0x010f:
            java.lang.String r0 = "AutoCompleteTextView"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0185
            r0 = 9
            goto L_0x0186
        L_0x011b:
            java.lang.String r0 = "ImageView"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0185
            r0 = r2
            goto L_0x0186
        L_0x0126:
            java.lang.String r0 = "ToggleButton"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0185
            r0 = 13
            goto L_0x0186
        L_0x0131:
            java.lang.String r0 = "RadioButton"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0185
            r0 = 7
            goto L_0x0186
        L_0x013b:
            java.lang.String r0 = "Spinner"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0185
            r0 = 4
            goto L_0x0186
        L_0x0145:
            java.lang.String r0 = "SeekBar"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0185
            r0 = 12
            goto L_0x0186
        L_0x0150:
            java.lang.String r0 = "ImageButton"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0185
            r0 = 5
            goto L_0x0186
        L_0x015a:
            java.lang.String r0 = "TextView"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0185
            r0 = r1
            goto L_0x0186
        L_0x0164:
            java.lang.String r0 = "MultiAutoCompleteTextView"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0185
            r0 = 10
            goto L_0x0186
        L_0x016f:
            java.lang.String r0 = "CheckedTextView"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0185
            r0 = 8
            goto L_0x0186
        L_0x017a:
            java.lang.String r0 = "RatingBar"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0185
            r0 = 11
            goto L_0x0186
        L_0x0185:
            r0 = r4
        L_0x0186:
            switch(r0) {
                case 0: goto L_0x01dc;
                case 1: goto L_0x01d6;
                case 2: goto L_0x01d0;
                case 3: goto L_0x01ca;
                case 4: goto L_0x01c2;
                case 5: goto L_0x01ba;
                case 6: goto L_0x01b4;
                case 7: goto L_0x01ae;
                case 8: goto L_0x01a8;
                case 9: goto L_0x01a2;
                case 10: goto L_0x019c;
                case 11: goto L_0x0196;
                case 12: goto L_0x0190;
                case 13: goto L_0x018a;
                default: goto L_0x0189;
            }
        L_0x0189:
            goto L_0x01e5
        L_0x018a:
            a.b.p.b0 r0 = new a.b.p.b0
            r0.<init>(r9, r12)
            goto L_0x01e1
        L_0x0190:
            a.b.p.t r0 = new a.b.p.t
            r0.<init>(r9, r12)
            goto L_0x01e1
        L_0x0196:
            a.b.p.s r0 = new a.b.p.s
            r0.<init>(r9, r12)
            goto L_0x01e1
        L_0x019c:
            a.b.p.o r0 = new a.b.p.o
            r0.<init>(r9, r12)
            goto L_0x01e1
        L_0x01a2:
            a.b.p.d r0 = new a.b.p.d
            r0.<init>(r9, r12)
            goto L_0x01e1
        L_0x01a8:
            a.b.p.h r0 = new a.b.p.h
            r0.<init>(r9, r12)
            goto L_0x01e1
        L_0x01ae:
            a.b.p.r r0 = new a.b.p.r
            r0.<init>(r9, r12)
            goto L_0x01e1
        L_0x01b4:
            a.b.p.g r0 = new a.b.p.g
            r0.<init>(r9, r12)
            goto L_0x01e1
        L_0x01ba:
            a.b.p.l r0 = new a.b.p.l
            int r6 = a.b.a.imageButtonStyle
            r0.<init>(r9, r12, r6)
            goto L_0x01e1
        L_0x01c2:
            a.b.p.w r0 = new a.b.p.w
            int r6 = a.b.a.spinnerStyle
            r0.<init>(r9, r12, r6)
            goto L_0x01e1
        L_0x01ca:
            a.b.p.k r0 = new a.b.p.k
            r0.<init>(r9, r12)
            goto L_0x01e1
        L_0x01d0:
            a.b.p.f r0 = new a.b.p.f
            r0.<init>(r9, r12)
            goto L_0x01e1
        L_0x01d6:
            a.b.p.n r0 = new a.b.p.n
            r0.<init>(r9, r12, r1)
            goto L_0x01e1
        L_0x01dc:
            a.b.p.z r0 = new a.b.p.z
            r0.<init>(r9, r12)
        L_0x01e1:
            r3.a(r0, r10)
            goto L_0x01e6
        L_0x01e5:
            r0 = r5
        L_0x01e6:
            if (r0 != 0) goto L_0x0245
            if (r11 == r9) goto L_0x0245
            java.lang.String r11 = "view"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x01f8
            java.lang.String r10 = "class"
            java.lang.String r10 = r12.getAttributeValue(r5, r10)
        L_0x01f8:
            java.lang.Object[] r11 = r3.f465a     // Catch:{ Exception -> 0x023e, all -> 0x0236 }
            r11[r1] = r9     // Catch:{ Exception -> 0x023e, all -> 0x0236 }
            java.lang.Object[] r11 = r3.f465a     // Catch:{ Exception -> 0x023e, all -> 0x0236 }
            r11[r2] = r12     // Catch:{ Exception -> 0x023e, all -> 0x0236 }
            r11 = 46
            int r11 = r10.indexOf(r11)     // Catch:{ Exception -> 0x023e, all -> 0x0236 }
            if (r4 != r11) goto L_0x022a
            r11 = r1
        L_0x0209:
            java.lang.String[] r0 = androidx.appcompat.app.AppCompatViewInflater.d     // Catch:{ Exception -> 0x023e, all -> 0x0236 }
            int r0 = r0.length     // Catch:{ Exception -> 0x023e, all -> 0x0236 }
            if (r11 >= r0) goto L_0x0223
            java.lang.String[] r0 = androidx.appcompat.app.AppCompatViewInflater.d     // Catch:{ Exception -> 0x023e, all -> 0x0236 }
            r0 = r0[r11]     // Catch:{ Exception -> 0x023e, all -> 0x0236 }
            android.view.View r0 = r3.a(r9, r10, r0)     // Catch:{ Exception -> 0x023e, all -> 0x0236 }
            if (r0 == 0) goto L_0x0220
            java.lang.Object[] r9 = r3.f465a
            r9[r1] = r5
            r9[r2] = r5
            r5 = r0
            goto L_0x0244
        L_0x0220:
            int r11 = r11 + 1
            goto L_0x0209
        L_0x0223:
            java.lang.Object[] r9 = r3.f465a
            r9[r1] = r5
            r9[r2] = r5
            goto L_0x0244
        L_0x022a:
            android.view.View r9 = r3.a(r9, r10, r5)     // Catch:{ Exception -> 0x023e, all -> 0x0236 }
            java.lang.Object[] r10 = r3.f465a
            r10[r1] = r5
            r10[r2] = r5
            r5 = r9
            goto L_0x0244
        L_0x0236:
            r9 = move-exception
            java.lang.Object[] r10 = r3.f465a
            r10[r1] = r5
            r10[r2] = r5
            throw r9
        L_0x023e:
            java.lang.Object[] r9 = r3.f465a
            r9[r1] = r5
            r9[r2] = r5
        L_0x0244:
            r0 = r5
        L_0x0245:
            if (r0 == 0) goto L_0x026d
            android.content.Context r9 = r0.getContext()
            boolean r10 = r9 instanceof android.content.ContextWrapper
            if (r10 == 0) goto L_0x026d
            boolean r10 = a.f.k.k.g(r0)
            if (r10 != 0) goto L_0x0256
            goto L_0x026d
        L_0x0256:
            int[] r10 = androidx.appcompat.app.AppCompatViewInflater.c
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r12, r10)
            java.lang.String r10 = r9.getString(r1)
            if (r10 == 0) goto L_0x026a
            androidx.appcompat.app.AppCompatViewInflater$a r11 = new androidx.appcompat.app.AppCompatViewInflater$a
            r11.<init>(r0, r10)
            r0.setOnClickListener(r11)
        L_0x026a:
            r9.recycle()
        L_0x026d:
            return r0
        L_0x026e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.h.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(boolean r12) {
        /*
            r11 = this;
            boolean r0 = r11.M
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r11.N
            r2 = -100
            if (r0 == r2) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = r2
        L_0x000e:
            r3 = -1
            r4 = 3
            r5 = 2
            r6 = 1
            if (r0 == r2) goto L_0x0051
            if (r0 == r3) goto L_0x0050
            if (r0 == 0) goto L_0x0036
            if (r0 == r6) goto L_0x0050
            if (r0 == r5) goto L_0x0050
            if (r0 != r4) goto L_0x002e
            a.b.k.h$g r2 = r11.S
            if (r2 != 0) goto L_0x002b
            a.b.k.h$f r2 = new a.b.k.h$f
            android.content.Context r3 = r11.e
            r2.<init>(r3)
            r11.S = r2
        L_0x002b:
            a.b.k.h$g r2 = r11.S
            goto L_0x004b
        L_0x002e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."
            r12.<init>(r0)
            throw r12
        L_0x0036:
            android.content.Context r2 = r11.e
            java.lang.Class<android.app.UiModeManager> r7 = android.app.UiModeManager.class
            java.lang.Object r2 = r2.getSystemService(r7)
            android.app.UiModeManager r2 = (android.app.UiModeManager) r2
            int r2 = r2.getNightMode()
            if (r2 != 0) goto L_0x0047
            goto L_0x0051
        L_0x0047:
            a.b.k.h$g r2 = r11.h()
        L_0x004b:
            int r3 = r2.c()
            goto L_0x0051
        L_0x0050:
            r3 = r0
        L_0x0051:
            android.content.Context r2 = r11.e
            android.content.Context r2 = r2.getApplicationContext()
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.uiMode
            r2 = r2 & 48
            if (r3 == r6) goto L_0x006c
            if (r3 == r5) goto L_0x0069
            r3 = r2
            goto L_0x006e
        L_0x0069:
            r3 = 32
            goto L_0x006e
        L_0x006c:
            r3 = 16
        L_0x006e:
            boolean r5 = r11.Q
            java.lang.String r7 = "AppCompatDelegate"
            if (r5 != 0) goto L_0x00ab
            java.lang.Object r5 = r11.d
            boolean r5 = r5 instanceof android.app.Activity
            if (r5 == 0) goto L_0x00ab
            android.content.Context r5 = r11.e
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            if (r5 != 0) goto L_0x0084
            r5 = r1
            goto L_0x00af
        L_0x0084:
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x00a3 }
            android.content.Context r9 = r11.e     // Catch:{ NameNotFoundException -> 0x00a3 }
            java.lang.Object r10 = r11.d     // Catch:{ NameNotFoundException -> 0x00a3 }
            java.lang.Class r10 = r10.getClass()     // Catch:{ NameNotFoundException -> 0x00a3 }
            r8.<init>(r9, r10)     // Catch:{ NameNotFoundException -> 0x00a3 }
            android.content.pm.ActivityInfo r5 = r5.getActivityInfo(r8, r1)     // Catch:{ NameNotFoundException -> 0x00a3 }
            if (r5 == 0) goto L_0x009f
            int r5 = r5.configChanges     // Catch:{ NameNotFoundException -> 0x00a3 }
            r5 = r5 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x009f
            r5 = r6
            goto L_0x00a0
        L_0x009f:
            r5 = r1
        L_0x00a0:
            r11.P = r5     // Catch:{ NameNotFoundException -> 0x00a3 }
            goto L_0x00ab
        L_0x00a3:
            r5 = move-exception
            java.lang.String r8 = "Exception while getting ActivityInfo"
            android.util.Log.d(r7, r8, r5)
            r11.P = r1
        L_0x00ab:
            r11.Q = r6
            boolean r5 = r11.P
        L_0x00af:
            boolean r8 = e0
            if (r8 != 0) goto L_0x00b5
            if (r3 == r2) goto L_0x00dc
        L_0x00b5:
            if (r5 != 0) goto L_0x00dc
            boolean r2 = r11.J
            if (r2 != 0) goto L_0x00dc
            java.lang.Object r2 = r11.d
            boolean r2 = r2 instanceof android.view.ContextThemeWrapper
            if (r2 == 0) goto L_0x00dc
            android.content.res.Configuration r2 = new android.content.res.Configuration
            r2.<init>()
            int r8 = r2.uiMode
            r8 = r8 & -49
            r8 = r8 | r3
            r2.uiMode = r8
            java.lang.Object r8 = r11.d     // Catch:{ IllegalStateException -> 0x00d6 }
            android.view.ContextThemeWrapper r8 = (android.view.ContextThemeWrapper) r8     // Catch:{ IllegalStateException -> 0x00d6 }
            r8.applyOverrideConfiguration(r2)     // Catch:{ IllegalStateException -> 0x00d6 }
            r1 = r6
            goto L_0x00dc
        L_0x00d6:
            r2 = move-exception
            java.lang.String r8 = "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()"
            android.util.Log.e(r7, r8, r2)
        L_0x00dc:
            android.content.Context r2 = r11.e
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.uiMode
            r2 = r2 & 48
            if (r1 != 0) goto L_0x0102
            if (r2 == r3) goto L_0x0102
            if (r12 == 0) goto L_0x0102
            if (r5 != 0) goto L_0x0102
            boolean r12 = r11.J
            if (r12 == 0) goto L_0x0102
            java.lang.Object r12 = r11.d
            boolean r7 = r12 instanceof android.app.Activity
            if (r7 == 0) goto L_0x0102
            android.app.Activity r12 = (android.app.Activity) r12
            a.f.d.a.b(r12)
            r1 = r6
        L_0x0102:
            r12 = 0
            if (r1 != 0) goto L_0x0203
            if (r2 == r3) goto L_0x0203
            android.content.Context r1 = r11.e
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r2 = new android.content.res.Configuration
            android.content.res.Configuration r7 = r1.getConfiguration()
            r2.<init>(r7)
            android.content.res.Configuration r7 = r1.getConfiguration()
            int r7 = r7.uiMode
            r7 = r7 & -49
            r3 = r3 | r7
            r2.uiMode = r3
            r1.updateConfiguration(r2, r12)
            int r3 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r3 >= r7) goto L_0x01c5
            r7 = 28
            if (r3 < r7) goto L_0x0130
            goto L_0x01c5
        L_0x0130:
            r7 = 24
            java.lang.String r8 = "mDrawableCache"
            java.lang.String r9 = "ResourcesFlusher"
            if (r3 < r7) goto L_0x0197
            boolean r3 = a.b.k.o.h
            if (r3 != 0) goto L_0x0152
            java.lang.Class<android.content.res.Resources> r3 = android.content.res.Resources.class
            java.lang.String r7 = "mResourcesImpl"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r7)     // Catch:{ NoSuchFieldException -> 0x014a }
            a.b.k.o.g = r3     // Catch:{ NoSuchFieldException -> 0x014a }
            r3.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x014a }
            goto L_0x0150
        L_0x014a:
            r3 = move-exception
            java.lang.String r7 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r9, r7, r3)
        L_0x0150:
            a.b.k.o.h = r6
        L_0x0152:
            java.lang.reflect.Field r3 = a.b.k.o.g
            if (r3 != 0) goto L_0x0158
            goto L_0x01c5
        L_0x0158:
            java.lang.Object r1 = r3.get(r1)     // Catch:{ IllegalAccessException -> 0x015d }
            goto L_0x0164
        L_0x015d:
            r1 = move-exception
            java.lang.String r3 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r9, r3, r1)
            r1 = r12
        L_0x0164:
            if (r1 != 0) goto L_0x0167
            goto L_0x01c5
        L_0x0167:
            boolean r3 = a.b.k.o.f30b
            if (r3 != 0) goto L_0x0181
            java.lang.Class r3 = r1.getClass()     // Catch:{ NoSuchFieldException -> 0x0179 }
            java.lang.reflect.Field r3 = r3.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x0179 }
            a.b.k.o.f29a = r3     // Catch:{ NoSuchFieldException -> 0x0179 }
            r3.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x0179 }
            goto L_0x017f
        L_0x0179:
            r3 = move-exception
            java.lang.String r7 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r9, r7, r3)
        L_0x017f:
            a.b.k.o.f30b = r6
        L_0x0181:
            java.lang.reflect.Field r3 = a.b.k.o.f29a
            if (r3 == 0) goto L_0x0190
            java.lang.Object r1 = r3.get(r1)     // Catch:{ IllegalAccessException -> 0x018a }
            goto L_0x0191
        L_0x018a:
            r1 = move-exception
            java.lang.String r3 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r9, r3, r1)
        L_0x0190:
            r1 = r12
        L_0x0191:
            if (r1 == 0) goto L_0x01c5
            a.b.k.o.a((java.lang.Object) r1)
            goto L_0x01c5
        L_0x0197:
            boolean r3 = a.b.k.o.f30b
            if (r3 != 0) goto L_0x01af
            java.lang.Class<android.content.res.Resources> r3 = android.content.res.Resources.class
            java.lang.reflect.Field r3 = r3.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x01a7 }
            a.b.k.o.f29a = r3     // Catch:{ NoSuchFieldException -> 0x01a7 }
            r3.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x01a7 }
            goto L_0x01ad
        L_0x01a7:
            r3 = move-exception
            java.lang.String r7 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r9, r7, r3)
        L_0x01ad:
            a.b.k.o.f30b = r6
        L_0x01af:
            java.lang.reflect.Field r3 = a.b.k.o.f29a
            if (r3 == 0) goto L_0x01be
            java.lang.Object r1 = r3.get(r1)     // Catch:{ IllegalAccessException -> 0x01b8 }
            goto L_0x01bf
        L_0x01b8:
            r1 = move-exception
            java.lang.String r3 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r9, r3, r1)
        L_0x01be:
            r1 = r12
        L_0x01bf:
            if (r1 != 0) goto L_0x01c2
            goto L_0x01c5
        L_0x01c2:
            a.b.k.o.a((java.lang.Object) r1)
        L_0x01c5:
            int r1 = r11.O
            if (r1 == 0) goto L_0x01d9
            android.content.Context r3 = r11.e
            r3.setTheme(r1)
            android.content.Context r1 = r11.e
            android.content.res.Resources$Theme r1 = r1.getTheme()
            int r3 = r11.O
            r1.applyStyle(r3, r6)
        L_0x01d9:
            if (r5 == 0) goto L_0x0204
            java.lang.Object r1 = r11.d
            boolean r3 = r1 instanceof android.app.Activity
            if (r3 == 0) goto L_0x0204
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r3 = r1 instanceof a.j.h
            if (r3 == 0) goto L_0x01fb
            r3 = r1
            a.j.h r3 = (a.j.h) r3
            a.j.e r3 = r3.a()
            a.j.i r3 = (a.j.i) r3
            a.j.e$b r3 = r3.f410b
            a.j.e$b r5 = a.j.e.b.STARTED
            boolean r3 = r3.a(r5)
            if (r3 == 0) goto L_0x0204
            goto L_0x01ff
        L_0x01fb:
            boolean r3 = r11.L
            if (r3 == 0) goto L_0x0204
        L_0x01ff:
            r1.onConfigurationChanged(r2)
            goto L_0x0204
        L_0x0203:
            r6 = r1
        L_0x0204:
            if (r6 == 0) goto L_0x0212
            java.lang.Object r1 = r11.d
            boolean r2 = r1 instanceof a.b.k.e
            if (r2 == 0) goto L_0x0212
            a.b.k.e r1 = (a.b.k.e) r1
            if (r1 == 0) goto L_0x0211
            goto L_0x0212
        L_0x0211:
            throw r12
        L_0x0212:
            if (r0 != 0) goto L_0x021c
            a.b.k.h$g r12 = r11.h()
            r12.e()
            goto L_0x0223
        L_0x021c:
            a.b.k.h$g r12 = r11.R
            if (r12 == 0) goto L_0x0223
            r12.a()
        L_0x0223:
            if (r0 != r4) goto L_0x0238
            a.b.k.h$g r12 = r11.S
            if (r12 != 0) goto L_0x0232
            a.b.k.h$f r12 = new a.b.k.h$f
            android.content.Context r0 = r11.e
            r12.<init>(r0)
            r11.S = r12
        L_0x0232:
            a.b.k.h$g r12 = r11.S
            r12.e()
            goto L_0x023f
        L_0x0238:
            a.b.k.h$g r12 = r11.S
            if (r12 == 0) goto L_0x023f
            r12.a()
        L_0x023f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.h.a(boolean):boolean");
    }

    public final boolean b(j jVar, KeyEvent keyEvent) {
        c0 c0Var;
        c0 c0Var2;
        Resources.Theme theme;
        c0 c0Var3;
        if (this.M) {
            return false;
        }
        if (jVar.m) {
            return true;
        }
        j jVar2 = this.H;
        if (!(jVar2 == null || jVar2 == jVar)) {
            a(jVar2, false);
        }
        Window.Callback i2 = i();
        if (i2 != null) {
            jVar.i = i2.onCreatePanelView(jVar.f18a);
        }
        int i3 = jVar.f18a;
        boolean z2 = i3 == 0 || i3 == 108;
        if (z2 && (c0Var3 = this.l) != null) {
            c0Var3.c();
        }
        if (jVar.i == null) {
            if (jVar.j == null || jVar.r) {
                if (jVar.j == null) {
                    Context context = this.e;
                    int i4 = jVar.f18a;
                    if ((i4 == 0 || i4 == 108) && this.l != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(a.b.a.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(a.b.a.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(a.b.a.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            a.b.o.c cVar = new a.b.o.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    a.b.o.i.g gVar = new a.b.o.i.g(context);
                    gVar.e = this;
                    jVar.a(gVar);
                    if (jVar.j == null) {
                        return false;
                    }
                }
                if (z2 && this.l != null) {
                    if (this.m == null) {
                        this.m = new c();
                    }
                    this.l.a(jVar.j, this.m);
                }
                jVar.j.j();
                if (!i2.onCreatePanelMenu(jVar.f18a, jVar.j)) {
                    jVar.a((a.b.o.i.g) null);
                    if (z2 && (c0Var2 = this.l) != null) {
                        c0Var2.a((Menu) null, this.m);
                    }
                    return false;
                }
                jVar.r = false;
            }
            jVar.j.j();
            Bundle bundle = jVar.s;
            if (bundle != null) {
                jVar.j.a(bundle);
                jVar.s = null;
            }
            if (!i2.onPreparePanel(0, jVar.i, jVar.j)) {
                if (z2 && (c0Var = this.l) != null) {
                    c0Var.a((Menu) null, this.m);
                }
                jVar.j.i();
                return false;
            }
            boolean z3 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            jVar.p = z3;
            jVar.j.setQwertyMode(z3);
            jVar.j.i();
        }
        jVar.m = true;
        jVar.n = false;
        this.H = jVar;
        return true;
    }

    public void b(int i2) {
        f();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.e).inflate(i2, viewGroup);
        this.g.f73b.onContentChanged();
    }

    public void b(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.g.f73b.onContentChanged();
    }

    public final void a(Window window) {
        if (this.f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof e)) {
                e eVar = new e(callback);
                this.g = eVar;
                window.setCallback(eVar);
                x0 a2 = x0.a(this.e, (AttributeSet) null, c0);
                Drawable c2 = a2.c(0);
                if (c2 != null) {
                    window.setBackgroundDrawable(c2);
                }
                a2.f186b.recycle();
                this.f = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public void a(int i2, j jVar, Menu menu) {
        if (menu == null) {
            if (jVar == null && i2 >= 0) {
                j[] jVarArr = this.G;
                if (i2 < jVarArr.length) {
                    jVar = jVarArr[i2];
                }
            }
            if (jVar != null) {
                menu = jVar.j;
            }
        }
        if ((jVar == null || jVar.o) && !this.M) {
            this.g.f73b.onPanelClosed(i2, menu);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.d
            boolean r1 = r0 instanceof a.f.k.c.a
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof a.b.k.n
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r6.f
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = a.f.k.k.b(r0, r7)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r7.getKeyCode()
            r1 = 82
            if (r0 != r1) goto L_0x002d
            a.b.k.h$e r0 = r6.g
            android.view.Window$Callback r0 = r0.f73b
            boolean r0 = r0.dispatchKeyEvent(r7)
            if (r0 == 0) goto L_0x002d
            return r2
        L_0x002d:
            int r0 = r7.getKeyCode()
            int r3 = r7.getAction()
            r4 = 0
            if (r3 != 0) goto L_0x003a
            r3 = r2
            goto L_0x003b
        L_0x003a:
            r3 = r4
        L_0x003b:
            r5 = 4
            if (r3 == 0) goto L_0x0065
            if (r0 == r5) goto L_0x0056
            if (r0 == r1) goto L_0x0043
            goto L_0x0062
        L_0x0043:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x0119
            a.b.k.h$j r0 = r6.d(r4)
            boolean r1 = r0.o
            if (r1 != 0) goto L_0x0119
            r6.b((a.b.k.h.j) r0, (android.view.KeyEvent) r7)
            goto L_0x0119
        L_0x0056:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r2 = r4
        L_0x0060:
            r6.I = r2
        L_0x0062:
            r2 = r4
            goto L_0x0119
        L_0x0065:
            if (r0 == r5) goto L_0x00eb
            if (r0 == r1) goto L_0x006a
            goto L_0x0062
        L_0x006a:
            a.b.o.a r0 = r6.o
            if (r0 == 0) goto L_0x0070
            goto L_0x0119
        L_0x0070:
            a.b.k.h$j r0 = r6.d(r4)
            a.b.p.c0 r1 = r6.l
            if (r1 == 0) goto L_0x00aa
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x00aa
            android.content.Context r1 = r6.e
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            boolean r1 = r1.hasPermanentMenuKey()
            if (r1 != 0) goto L_0x00aa
            a.b.p.c0 r1 = r6.l
            boolean r1 = r1.d()
            if (r1 != 0) goto L_0x00a3
            boolean r1 = r6.M
            if (r1 != 0) goto L_0x00ca
            boolean r7 = r6.b((a.b.k.h.j) r0, (android.view.KeyEvent) r7)
            if (r7 == 0) goto L_0x00ca
            a.b.p.c0 r7 = r6.l
            boolean r7 = r7.a()
            goto L_0x00d1
        L_0x00a3:
            a.b.p.c0 r7 = r6.l
            boolean r7 = r7.f()
            goto L_0x00d1
        L_0x00aa:
            boolean r1 = r0.o
            if (r1 != 0) goto L_0x00cc
            boolean r1 = r0.n
            if (r1 == 0) goto L_0x00b3
            goto L_0x00cc
        L_0x00b3:
            boolean r1 = r0.m
            if (r1 == 0) goto L_0x00ca
            boolean r1 = r0.r
            if (r1 == 0) goto L_0x00c2
            r0.m = r4
            boolean r1 = r6.b((a.b.k.h.j) r0, (android.view.KeyEvent) r7)
            goto L_0x00c3
        L_0x00c2:
            r1 = r2
        L_0x00c3:
            if (r1 == 0) goto L_0x00ca
            r6.a((a.b.k.h.j) r0, (android.view.KeyEvent) r7)
            r7 = r2
            goto L_0x00d1
        L_0x00ca:
            r7 = r4
            goto L_0x00d1
        L_0x00cc:
            boolean r7 = r0.o
            r6.a((a.b.k.h.j) r0, (boolean) r2)
        L_0x00d1:
            if (r7 == 0) goto L_0x0119
            android.content.Context r7 = r6.e
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x00e3
            r7.playSoundEffect(r4)
            goto L_0x0119
        L_0x00e3:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
            goto L_0x0119
        L_0x00eb:
            boolean r7 = r6.I
            r6.I = r4
            a.b.k.h$j r0 = r6.d(r4)
            if (r0 == 0) goto L_0x00ff
            boolean r1 = r0.o
            if (r1 == 0) goto L_0x00ff
            if (r7 != 0) goto L_0x0119
            r6.a((a.b.k.h.j) r0, (boolean) r2)
            goto L_0x0119
        L_0x00ff:
            a.b.o.a r7 = r6.o
            if (r7 == 0) goto L_0x0107
            r7.a()
            goto L_0x0114
        L_0x0107:
            r6.j()
            a.b.k.a r7 = r6.i
            if (r7 == 0) goto L_0x0116
            boolean r7 = r7.a()
            if (r7 == 0) goto L_0x0116
        L_0x0114:
            r7 = r2
            goto L_0x0117
        L_0x0116:
            r7 = r4
        L_0x0117:
            if (r7 == 0) goto L_0x0062
        L_0x0119:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.h.a(android.view.KeyEvent):boolean");
    }

    public void a() {
        LayoutInflater from = LayoutInflater.from(this.e);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof h)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public void a(Bundle bundle) {
        this.J = true;
        a(false);
        g();
        Object obj = this.d;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                str = o.b((Context) activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e2) {
                throw new IllegalArgumentException(e2);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a aVar = this.i;
                if (aVar == null) {
                    this.W = true;
                } else {
                    aVar.b(true);
                }
            }
        }
        this.K = true;
    }

    public void a(a.b.o.i.g gVar) {
        c0 c0Var = this.l;
        if (c0Var == null || !c0Var.e() || (ViewConfiguration.get(this.e).hasPermanentMenuKey() && !this.l.b())) {
            j d2 = d(0);
            d2.q = true;
            a(d2, false);
            a(d2, (KeyEvent) null);
            return;
        }
        Window.Callback i2 = i();
        if (this.l.d()) {
            this.l.f();
            if (!this.M) {
                i2.onPanelClosed(a.b.j.AppCompatTheme_textColorAlertDialogListItem, d(0).j);
            }
        } else if (i2 != null && !this.M) {
            if (this.T && (1 & this.U) != 0) {
                this.f.getDecorView().removeCallbacks(this.V);
                this.V.run();
            }
            j d3 = d(0);
            a.b.o.i.g gVar2 = d3.j;
            if (gVar2 != null && !d3.r && i2.onPreparePanel(0, d3.i, gVar2)) {
                i2.onMenuOpened(a.b.j.AppCompatTheme_textColorAlertDialogListItem, d3.j);
                this.l.a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0159, code lost:
        if (r3 != null) goto L_0x015b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(a.b.k.h.j r14, android.view.KeyEvent r15) {
        /*
            r13 = this;
            boolean r0 = r14.o
            if (r0 != 0) goto L_0x01d7
            boolean r0 = r13.M
            if (r0 == 0) goto L_0x000a
            goto L_0x01d7
        L_0x000a:
            int r0 = r14.f18a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0027
            android.content.Context r0 = r13.e
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r3 = 4
            if (r0 != r3) goto L_0x0023
            r0 = r2
            goto L_0x0024
        L_0x0023:
            r0 = r1
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            android.view.Window$Callback r0 = r13.i()
            if (r0 == 0) goto L_0x003b
            int r3 = r14.f18a
            a.b.o.i.g r4 = r14.j
            boolean r0 = r0.onMenuOpened(r3, r4)
            if (r0 != 0) goto L_0x003b
            r13.a((a.b.k.h.j) r14, (boolean) r2)
            return
        L_0x003b:
            android.content.Context r0 = r13.e
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            boolean r15 = r13.b((a.b.k.h.j) r14, (android.view.KeyEvent) r15)
            if (r15 != 0) goto L_0x004f
            return
        L_0x004f:
            android.view.ViewGroup r15 = r14.g
            r3 = -1
            r4 = -2
            if (r15 == 0) goto L_0x006b
            boolean r15 = r14.q
            if (r15 == 0) goto L_0x005a
            goto L_0x006b
        L_0x005a:
            android.view.View r15 = r14.i
            if (r15 == 0) goto L_0x01b5
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 == 0) goto L_0x01b5
            int r15 = r15.width
            if (r15 != r3) goto L_0x01b5
            r6 = r3
            goto L_0x01b6
        L_0x006b:
            android.view.ViewGroup r15 = r14.g
            r3 = 0
            if (r15 != 0) goto L_0x00e5
            r13.j()
            a.b.k.a r15 = r13.i
            if (r15 == 0) goto L_0x007c
            android.content.Context r15 = r15.c()
            goto L_0x007d
        L_0x007c:
            r15 = r3
        L_0x007d:
            if (r15 != 0) goto L_0x0081
            android.content.Context r15 = r13.e
        L_0x0081:
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources r6 = r15.getResources()
            android.content.res.Resources$Theme r6 = r6.newTheme()
            android.content.res.Resources$Theme r7 = r15.getTheme()
            r6.setTo(r7)
            int r7 = a.b.a.actionBarPopupTheme
            r6.resolveAttribute(r7, r5, r2)
            int r7 = r5.resourceId
            if (r7 == 0) goto L_0x00a1
            r6.applyStyle(r7, r2)
        L_0x00a1:
            int r7 = a.b.a.panelMenuListTheme
            r6.resolveAttribute(r7, r5, r2)
            int r5 = r5.resourceId
            if (r5 == 0) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            int r5 = a.b.i.Theme_AppCompat_CompactMenu
        L_0x00ad:
            r6.applyStyle(r5, r2)
            a.b.o.c r5 = new a.b.o.c
            r5.<init>(r15, r1)
            android.content.res.Resources$Theme r15 = r5.getTheme()
            r15.setTo(r6)
            r14.l = r5
            int[] r15 = a.b.j.AppCompatTheme
            android.content.res.TypedArray r15 = r5.obtainStyledAttributes(r15)
            int r5 = a.b.j.AppCompatTheme_panelBackground
            int r5 = r15.getResourceId(r5, r1)
            r14.f19b = r5
            int r5 = a.b.j.AppCompatTheme_android_windowAnimationStyle
            int r5 = r15.getResourceId(r5, r1)
            r14.f = r5
            r15.recycle()
            a.b.k.h$i r15 = new a.b.k.h$i
            android.content.Context r5 = r14.l
            r15.<init>(r5)
            r14.g = r15
            r15 = 81
            r14.c = r15
            goto L_0x00f4
        L_0x00e5:
            boolean r5 = r14.q
            if (r5 == 0) goto L_0x00f4
            int r15 = r15.getChildCount()
            if (r15 <= 0) goto L_0x00f4
            android.view.ViewGroup r15 = r14.g
            r15.removeAllViews()
        L_0x00f4:
            android.view.View r15 = r14.i
            if (r15 == 0) goto L_0x00fb
            r14.h = r15
            goto L_0x015b
        L_0x00fb:
            a.b.o.i.g r15 = r14.j
            if (r15 != 0) goto L_0x0100
            goto L_0x015d
        L_0x0100:
            a.b.k.h$k r15 = r13.n
            if (r15 != 0) goto L_0x010b
            a.b.k.h$k r15 = new a.b.k.h$k
            r15.<init>()
            r13.n = r15
        L_0x010b:
            a.b.k.h$k r15 = r13.n
            a.b.o.i.g r5 = r14.j
            if (r5 != 0) goto L_0x0112
            goto L_0x0157
        L_0x0112:
            a.b.o.i.e r3 = r14.k
            if (r3 != 0) goto L_0x012a
            a.b.o.i.e r3 = new a.b.o.i.e
            android.content.Context r5 = r14.l
            int r6 = a.b.g.abc_list_menu_item_layout
            r3.<init>(r5, r6)
            r14.k = r3
            r3.i = r15
            a.b.o.i.g r15 = r14.j
            android.content.Context r5 = r15.f88a
            r15.a((a.b.o.i.m) r3, (android.content.Context) r5)
        L_0x012a:
            a.b.o.i.e r15 = r14.k
            android.view.ViewGroup r3 = r14.g
            androidx.appcompat.view.menu.ExpandedMenuView r5 = r15.e
            if (r5 != 0) goto L_0x0155
            android.view.LayoutInflater r5 = r15.c
            int r6 = a.b.g.abc_expanded_menu_layout
            android.view.View r3 = r5.inflate(r6, r3, r1)
            androidx.appcompat.view.menu.ExpandedMenuView r3 = (androidx.appcompat.view.menu.ExpandedMenuView) r3
            r15.e = r3
            a.b.o.i.e$a r3 = r15.j
            if (r3 != 0) goto L_0x0149
            a.b.o.i.e$a r3 = new a.b.o.i.e$a
            r3.<init>()
            r15.j = r3
        L_0x0149:
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r15.e
            a.b.o.i.e$a r5 = r15.j
            r3.setAdapter(r5)
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r15.e
            r3.setOnItemClickListener(r15)
        L_0x0155:
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r15.e
        L_0x0157:
            r14.h = r3
            if (r3 == 0) goto L_0x015d
        L_0x015b:
            r15 = r2
            goto L_0x015e
        L_0x015d:
            r15 = r1
        L_0x015e:
            if (r15 == 0) goto L_0x01d7
            android.view.View r15 = r14.h
            if (r15 != 0) goto L_0x0165
            goto L_0x0178
        L_0x0165:
            android.view.View r15 = r14.i
            if (r15 == 0) goto L_0x016a
            goto L_0x0176
        L_0x016a:
            a.b.o.i.e r15 = r14.k
            android.widget.ListAdapter r15 = r15.a()
            int r15 = r15.getCount()
            if (r15 <= 0) goto L_0x0178
        L_0x0176:
            r15 = r2
            goto L_0x0179
        L_0x0178:
            r15 = r1
        L_0x0179:
            if (r15 != 0) goto L_0x017c
            goto L_0x01d7
        L_0x017c:
            android.view.View r15 = r14.h
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 != 0) goto L_0x0189
            android.view.ViewGroup$LayoutParams r15 = new android.view.ViewGroup$LayoutParams
            r15.<init>(r4, r4)
        L_0x0189:
            int r3 = r14.f19b
            android.view.ViewGroup r5 = r14.g
            r5.setBackgroundResource(r3)
            android.view.View r3 = r14.h
            android.view.ViewParent r3 = r3.getParent()
            boolean r5 = r3 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x01a1
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r5 = r14.h
            r3.removeView(r5)
        L_0x01a1:
            android.view.ViewGroup r3 = r14.g
            android.view.View r5 = r14.h
            r3.addView(r5, r15)
            android.view.View r15 = r14.h
            boolean r15 = r15.hasFocus()
            if (r15 != 0) goto L_0x01b5
            android.view.View r15 = r14.h
            r15.requestFocus()
        L_0x01b5:
            r6 = r4
        L_0x01b6:
            r14.n = r1
            android.view.WindowManager$LayoutParams r15 = new android.view.WindowManager$LayoutParams
            r7 = -2
            int r8 = r14.d
            int r9 = r14.e
            r10 = 1002(0x3ea, float:1.404E-42)
            r11 = 8519680(0x820000, float:1.1938615E-38)
            r12 = -3
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            int r1 = r14.c
            r15.gravity = r1
            int r1 = r14.f
            r15.windowAnimations = r1
            android.view.ViewGroup r1 = r14.g
            r0.addView(r1, r15)
            r14.o = r2
        L_0x01d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.h.a(a.b.k.h$j, android.view.KeyEvent):void");
    }

    public boolean a(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.E && i2 == 108) {
            return false;
        }
        if (this.A && i2 == 1) {
            this.A = false;
        }
        if (i2 == 1) {
            l();
            this.E = true;
            return true;
        } else if (i2 == 2) {
            l();
            this.y = true;
            return true;
        } else if (i2 == 5) {
            l();
            this.z = true;
            return true;
        } else if (i2 == 10) {
            l();
            this.C = true;
            return true;
        } else if (i2 == 108) {
            l();
            this.A = true;
            return true;
        } else if (i2 != 109) {
            return this.f.requestFeature(i2);
        } else {
            l();
            this.B = true;
            return true;
        }
    }

    public void a(View view) {
        f();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.g.f73b.onContentChanged();
    }

    public final void a(CharSequence charSequence) {
        this.k = charSequence;
        c0 c0Var = this.l;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
            return;
        }
        a aVar = this.i;
        if (aVar != null) {
            aVar.a(charSequence);
            return;
        }
        TextView textView = this.w;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
