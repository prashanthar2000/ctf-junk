package androidx.fragment.app;

import a.i.a.d;
import a.i.a.e0;
import a.i.a.g;
import a.i.a.j;
import a.i.a.o;
import a.j.e;
import a.j.f;
import a.j.h;
import a.j.i;
import a.j.m;
import a.j.t;
import a.j.u;
import android.animation.Animator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, h, u, a.l.c {
    public static final Object W = new Object();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E = true;
    public boolean F;
    public ViewGroup G;
    public View H;
    public View I;
    public boolean J;
    public boolean K = true;
    public b L;
    public boolean M;
    public boolean N;
    public float O;
    public LayoutInflater P;
    public boolean Q;
    public e.b R = e.b.RESUMED;
    public i S;
    public e0 T;
    public m<h> U = new m<>();
    public a.l.b V;

    /* renamed from: b  reason: collision with root package name */
    public int f513b = 0;
    public Bundle c;
    public SparseArray<Parcelable> d;
    public Boolean e;
    public String f = UUID.randomUUID().toString();
    public Bundle g;
    public Fragment h;
    public String i = null;
    public int j;
    public Boolean k = null;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public j s;
    public a.i.a.h t;
    public j u = new j();
    public Fragment v;
    public int w;
    public int x;
    public String y;
    public boolean z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            Fragment.this.e();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public View f516a;

        /* renamed from: b  reason: collision with root package name */
        public Animator f517b;
        public int c;
        public int d;
        public int e;
        public int f;
        public Object g = null;
        public Object h;
        public Object i;
        public Object j;
        public Object k;
        public Object l;
        public Boolean m;
        public Boolean n;
        public a.f.d.e o;
        public a.f.d.e p;
        public boolean q;
        public d r;
        public boolean s;

        public b() {
            Object obj = Fragment.W;
            this.h = obj;
            this.i = null;
            this.j = obj;
            this.k = null;
            this.l = obj;
            this.o = null;
            this.p = null;
        }
    }

    public static class c extends RuntimeException {
        public c(String str, Exception exc) {
            super(str, exc);
        }
    }

    public interface d {
    }

    public Fragment() {
        q();
    }

    @Deprecated
    public static Fragment a(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) g.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.b(bundle);
            }
            return fragment;
        } catch (InstantiationException e2) {
            throw new c("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new c("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new c("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new c("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    public e a() {
        return this.S;
    }

    public void a(int i2) {
        if (this.L != null || i2 != 0) {
            f().d = i2;
        }
    }

    public void a(Animator animator) {
        f().f517b = animator;
    }

    public void a(AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
        a.i.a.h hVar = this.t;
        if ((hVar == null ? null : hVar.f363b) != null) {
            this.F = false;
            this.F = true;
        }
    }

    public void a(View view) {
        f().f516a = view;
    }

    public void a(boolean z2) {
        f().s = z2;
    }

    public void b(Bundle bundle) {
        j jVar = this.s;
        if (jVar != null) {
            if (jVar == null ? false : jVar.i()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.g = bundle;
    }

    public final a.l.a c() {
        return this.V.f424b;
    }

    public t d() {
        j jVar = this.s;
        if (jVar != null) {
            o oVar = jVar.E;
            t tVar = oVar.d.get(this.f);
            if (tVar != null) {
                return tVar;
            }
            t tVar2 = new t();
            oVar.d.put(this.f, tVar2);
            return tVar2;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void e() {
        b bVar = this.L;
        Object obj = null;
        if (bVar != null) {
            bVar.q = false;
            Object obj2 = bVar.r;
            bVar.r = null;
            obj = obj2;
        }
        if (obj != null) {
            j.h hVar = (j.h) obj;
            int i2 = hVar.c - 1;
            hVar.c = i2;
            if (i2 == 0) {
                hVar.f373b.r.l();
            }
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final b f() {
        if (this.L == null) {
            this.L = new b();
        }
        return this.L;
    }

    public View g() {
        b bVar = this.L;
        if (bVar == null) {
            return null;
        }
        return bVar.f516a;
    }

    public Animator h() {
        b bVar = this.L;
        if (bVar == null) {
            return null;
        }
        return bVar.f517b;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final a.i.a.i i() {
        if (this.t != null) {
            return this.u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Object j() {
        b bVar = this.L;
        if (bVar == null) {
            return null;
        }
        return bVar.g;
    }

    public Object k() {
        b bVar = this.L;
        if (bVar == null) {
            return null;
        }
        return bVar.i;
    }

    public int l() {
        b bVar = this.L;
        if (bVar == null) {
            return 0;
        }
        return bVar.d;
    }

    public int m() {
        b bVar = this.L;
        if (bVar == null) {
            return 0;
        }
        return bVar.e;
    }

    public int n() {
        b bVar = this.L;
        if (bVar == null) {
            return 0;
        }
        return bVar.f;
    }

    public Object o() {
        b bVar = this.L;
        if (bVar == null) {
            return null;
        }
        return bVar.k;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.F = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        a.i.a.d dVar;
        a.i.a.h hVar = this.t;
        if (hVar == null) {
            dVar = null;
        } else {
            dVar = (a.i.a.d) hVar.f363b;
        }
        if (dVar != null) {
            dVar.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public void onLowMemory() {
        this.F = true;
    }

    public int p() {
        b bVar = this.L;
        if (bVar == null) {
            return 0;
        }
        return bVar.c;
    }

    public final void q() {
        this.S = new i(this);
        this.V = new a.l.b(this);
        this.S.a((a.j.g) new f() {
            public void a(h hVar, e.a aVar) {
                View view;
                if (aVar == e.a.ON_STOP && (view = Fragment.this.H) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
    }

    public boolean r() {
        b bVar = this.L;
        if (bVar == null) {
            return false;
        }
        return bVar.s;
    }

    public final boolean s() {
        return this.r > 0;
    }

    public final View t() {
        View view = this.H;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        a.b.k.o.a((Object) this, sb);
        sb.append(" (");
        sb.append(this.f);
        sb.append(")");
        if (this.w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.w));
        }
        if (this.y != null) {
            sb.append(" ");
            sb.append(this.y);
        }
        sb.append('}');
        return sb.toString();
    }

    public void u() {
        j jVar = this.s;
        if (jVar == null || jVar.p == null) {
            f().q = false;
        } else if (Looper.myLooper() != this.s.p.d.getLooper()) {
            this.s.p.d.postAtFrontOfQueue(new a());
        } else {
            e();
        }
    }

    public void a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.u.j();
        boolean z2 = true;
        this.q = true;
        e0 e0Var = new e0();
        this.T = e0Var;
        this.H = null;
        if (e0Var.f360b == null) {
            z2 = false;
        }
        if (!z2) {
            this.T = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public LayoutInflater a(Bundle bundle) {
        a.i.a.h hVar = this.t;
        if (hVar != null) {
            d.a aVar = (d.a) hVar;
            LayoutInflater cloneInContext = a.i.a.d.this.getLayoutInflater().cloneInContext(a.i.a.d.this);
            j jVar = this.u;
            if (jVar != null) {
                cloneInContext.setFactory2(jVar);
                this.P = cloneInContext;
                return cloneInContext;
            }
            throw null;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void a(d dVar) {
        f();
        d dVar2 = this.L.r;
        if (dVar != dVar2) {
            if (dVar == null || dVar2 == null) {
                b bVar = this.L;
                if (bVar.q) {
                    bVar.r = dVar;
                }
                if (dVar != null) {
                    ((j.h) dVar).c++;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }
}
