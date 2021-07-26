package a.i.a;

import a.b.k.o;
import a.i.a.q;
import a.j.e;
import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class j extends i implements LayoutInflater.Factory2 {
    public static boolean G = false;
    public static final Interpolator H = new DecelerateInterpolator(2.5f);
    public static final Interpolator I = new DecelerateInterpolator(1.5f);
    public ArrayList<Fragment> A;
    public Bundle B = null;
    public SparseArray<Parcelable> C = null;
    public ArrayList<h> D;
    public o E;
    public Runnable F = new b();
    public boolean d;
    public int e = 0;
    public final ArrayList<Fragment> f = new ArrayList<>();
    public final HashMap<String, Fragment> g = new HashMap<>();
    public ArrayList<a> h;
    public ArrayList<Fragment> i;
    public OnBackPressedDispatcher j;
    public final a.a.b k = new a(false);
    public ArrayList<a> l;
    public ArrayList<Integer> m;
    public final CopyOnWriteArrayList<f> n = new CopyOnWriteArrayList<>();
    public int o = 0;
    public h p;
    public e q;
    public Fragment r;
    public Fragment s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public ArrayList<a> y;
    public ArrayList<Boolean> z;

    public class a extends a.a.b {
        public a(boolean z) {
            super(z);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            j.this.g();
        }
    }

    public class c extends g {
        public c() {
        }

        public Fragment a(ClassLoader classLoader, String str) {
            h hVar = j.this.p;
            Context context = hVar.c;
            if (hVar != null) {
                return Fragment.a(context, str, (Bundle) null);
            }
            throw null;
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f367a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f368b;

        public d(Animator animator) {
            this.f367a = null;
            this.f368b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        public d(Animation animation) {
            this.f367a = animation;
            this.f368b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    public static class e extends AnimationSet implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final ViewGroup f369b;
        public final View c;
        public boolean d;
        public boolean e;
        public boolean f = true;

        public e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f369b = viewGroup;
            this.c = view;
            addAnimation(animation);
            this.f369b.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f = true;
            if (this.d) {
                return !this.e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.d = true;
                a.f.k.j.a(this.f369b, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f2) {
            this.f = true;
            if (this.d) {
                return !this.e;
            }
            if (!super.getTransformation(j, transformation, f2)) {
                this.d = true;
                a.f.k.j.a(this.f369b, this);
            }
            return true;
        }

        public void run() {
            if (this.d || !this.f) {
                this.f369b.endViewTransition(this.c);
                this.e = true;
                return;
            }
            this.f = false;
            this.f369b.post(this);
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f370a;
    }

    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public static final int[] f371a = {16842755, 16842960, 16842961};
    }

    public static class h implements Fragment.d {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f372a;

        /* renamed from: b  reason: collision with root package name */
        public final a f373b;
        public int c;

        public h(a aVar, boolean z) {
            this.f372a = z;
            this.f373b = aVar;
        }

        public void a() {
            boolean z = this.c > 0;
            j jVar = this.f373b.r;
            int size = jVar.f.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = jVar.f.get(i);
                fragment.a((Fragment.d) null);
                if (z) {
                    Fragment.b bVar = fragment.L;
                    if (bVar == null ? false : bVar.q) {
                        fragment.u();
                    }
                }
            }
            a aVar = this.f373b;
            aVar.r.a(aVar, this.f372a, !z, true);
        }
    }

    public static d a(float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(H);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(I);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new d((Animation) animationSet);
    }

    public static int d(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    public List<Fragment> a() {
        List<Fragment> list;
        if (this.f.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f) {
            list = (List) this.f.clone();
        }
        return list;
    }

    /* JADX INFO: finally extract failed */
    public final void a(int i2) {
        try {
            this.d = true;
            a(i2, false);
            this.d = false;
            g();
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public void a(int i2, a aVar) {
        synchronized (this) {
            if (this.l == null) {
                this.l = new ArrayList<>();
            }
            int size = this.l.size();
            if (i2 < size) {
                this.l.set(i2, aVar);
            } else {
                while (size < i2) {
                    this.l.add((Object) null);
                    if (this.m == null) {
                        this.m = new ArrayList<>();
                    }
                    this.m.add(Integer.valueOf(size));
                    size++;
                }
                this.l.add(aVar);
            }
        }
    }

    public final void a(a.d.c<Fragment> cVar) {
        int i2 = this.o;
        if (i2 >= 1) {
            int min = Math.min(i2, 3);
            int size = this.f.size();
            for (int i3 = 0; i3 < size; i3++) {
                Fragment fragment = this.f.get(i3);
                if (fragment.f513b < min) {
                    a(fragment, min, fragment.l(), fragment.m(), false);
                    if (fragment.H != null && !fragment.z && fragment.M) {
                        cVar.add(fragment);
                    }
                }
            }
        }
    }

    public void a(a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.a(z4);
        } else {
            aVar.a();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            v.a(this, (ArrayList<a>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z4) {
            a(this.o, true);
        }
        for (Fragment next : this.g.values()) {
            if (next != null && next.H != null && next.M && aVar.b(next.x)) {
                float f2 = next.O;
                if (f2 > 0.0f) {
                    next.H.setAlpha(f2);
                }
                if (z4) {
                    next.O = 0.0f;
                } else {
                    next.O = -1.0f;
                    next.M = false;
                }
            }
        }
    }

    public void a(Fragment fragment) {
        if (fragment.A) {
            fragment.A = false;
            if (fragment.l) {
                return;
            }
            if (!this.f.contains(fragment)) {
                synchronized (this.f) {
                    this.f.add(fragment);
                }
                fragment.l = true;
                if (d(fragment)) {
                    this.t = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
    }

    public void a(Fragment fragment, boolean z2) {
        f(fragment);
        if (fragment.A) {
            return;
        }
        if (!this.f.contains(fragment)) {
            synchronized (this.f) {
                this.f.add(fragment);
            }
            fragment.l = true;
            fragment.m = false;
            if (fragment.H == null) {
                fragment.N = false;
            }
            if (d(fragment)) {
                this.t = true;
            }
            if (z2) {
                a(fragment, this.o, 0, 0, false);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public Fragment b(int i2) {
        for (int size = this.f.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f.get(size);
            if (fragment != null && fragment.w == i2) {
                return fragment;
            }
        }
        for (Fragment next : this.g.values()) {
            if (next != null && next.w == i2) {
                return next;
            }
        }
        return null;
    }

    public void b(Fragment fragment) {
        if (!fragment.A) {
            fragment.A = true;
            if (fragment.l) {
                synchronized (this.f) {
                    this.f.remove(fragment);
                }
                if (d(fragment)) {
                    this.t = true;
                }
                fragment.l = false;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(androidx.fragment.app.Fragment r3, android.os.Bundle r4, boolean r5) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.r
            if (r0 == 0) goto L_0x000e
            a.i.a.j r0 = r0.s
            boolean r1 = r0 instanceof a.i.a.j
            if (r1 == 0) goto L_0x000e
            r1 = 1
            r0.b((androidx.fragment.app.Fragment) r3, (android.os.Bundle) r4, (boolean) r1)
        L_0x000e:
            java.util.concurrent.CopyOnWriteArrayList<a.i.a.j$f> r3 = r2.n
            java.util.Iterator r3 = r3.iterator()
        L_0x0014:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0029
            java.lang.Object r4 = r3.next()
            a.i.a.j$f r4 = (a.i.a.j.f) r4
            if (r5 == 0) goto L_0x0027
            boolean r4 = r4.f370a
            if (r4 != 0) goto L_0x0027
            goto L_0x0014
        L_0x0027:
            r3 = 0
            throw r3
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.j.b(androidx.fragment.app.Fragment, android.os.Bundle, boolean):void");
    }

    public final boolean b(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
        }
        return false;
    }

    public final void c() {
        this.d = false;
        this.z.clear();
        this.y.clear();
    }

    public void c(int i2) {
        synchronized (this) {
            this.l.set(i2, (Object) null);
            if (this.m == null) {
                this.m = new ArrayList<>();
            }
            this.m.add(Integer.valueOf(i2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.r
            if (r0 == 0) goto L_0x000e
            a.i.a.j r0 = r0.s
            boolean r1 = r0 instanceof a.i.a.j
            if (r1 == 0) goto L_0x000e
            r1 = 1
            r0.c((androidx.fragment.app.Fragment) r3, (boolean) r1)
        L_0x000e:
            java.util.concurrent.CopyOnWriteArrayList<a.i.a.j$f> r3 = r2.n
            java.util.Iterator r3 = r3.iterator()
        L_0x0014:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r3.next()
            a.i.a.j$f r0 = (a.i.a.j.f) r0
            if (r4 == 0) goto L_0x0027
            boolean r0 = r0.f370a
            if (r0 != 0) goto L_0x0027
            goto L_0x0014
        L_0x0027:
            r3 = 0
            throw r3
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.j.c(androidx.fragment.app.Fragment, boolean):void");
    }

    public final void c(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            a(arrayList, arrayList2);
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (!arrayList.get(i2).p) {
                    if (i3 != i2) {
                        a(arrayList, arrayList2, i3, i2);
                    }
                    i3 = i2 + 1;
                    if (arrayList2.get(i2).booleanValue()) {
                        while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).p) {
                            i3++;
                        }
                    }
                    a(arrayList, arrayList2, i2, i3);
                    i2 = i3 - 1;
                }
                i2++;
            }
            if (i3 != size) {
                a(arrayList, arrayList2, i3, size);
            }
        }
    }

    public void d() {
        this.u = false;
        this.v = false;
        a(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.r
            if (r0 == 0) goto L_0x000e
            a.i.a.j r0 = r0.s
            boolean r1 = r0 instanceof a.i.a.j
            if (r1 == 0) goto L_0x000e
            r1 = 1
            r0.d(r3, r1)
        L_0x000e:
            java.util.concurrent.CopyOnWriteArrayList<a.i.a.j$f> r3 = r2.n
            java.util.Iterator r3 = r3.iterator()
        L_0x0014:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r3.next()
            a.i.a.j$f r0 = (a.i.a.j.f) r0
            if (r4 == 0) goto L_0x0027
            boolean r0 = r0.f370a
            if (r0 != 0) goto L_0x0027
            goto L_0x0014
        L_0x0027:
            r3 = 0
            throw r3
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.j.d(androidx.fragment.app.Fragment, boolean):void");
    }

    public void e() {
        this.w = true;
        g();
        a(0);
        this.p = null;
        this.q = null;
        this.r = null;
        if (this.j != null) {
            Iterator<a.a.a> it = this.k.f1b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.j = null;
        }
    }

    public void f() {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment != null) {
                fragment.F = true;
                fragment.u.f();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.r
            if (r0 == 0) goto L_0x000e
            a.i.a.j r0 = r0.s
            boolean r1 = r0 instanceof a.i.a.j
            if (r1 == 0) goto L_0x000e
            r1 = 1
            r0.g(r3, r1)
        L_0x000e:
            java.util.concurrent.CopyOnWriteArrayList<a.i.a.j$f> r3 = r2.n
            java.util.Iterator r3 = r3.iterator()
        L_0x0014:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r3.next()
            a.i.a.j$f r0 = (a.i.a.j.f) r0
            if (r4 == 0) goto L_0x0027
            boolean r0 = r0.f370a
            if (r0 != 0) goto L_0x0027
            goto L_0x0014
        L_0x0027:
            r3 = 0
            throw r3
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.j.g(androidx.fragment.app.Fragment, boolean):void");
    }

    public void h(Fragment fragment) {
        boolean z2 = !fragment.s();
        if (!fragment.A || z2) {
            synchronized (this.f) {
                this.f.remove(fragment);
            }
            if (d(fragment)) {
                this.t = true;
            }
            fragment.l = false;
            fragment.m = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.r
            if (r0 == 0) goto L_0x000e
            a.i.a.j r0 = r0.s
            boolean r1 = r0 instanceof a.i.a.j
            if (r1 == 0) goto L_0x000e
            r1 = 1
            r0.h(r3, r1)
        L_0x000e:
            java.util.concurrent.CopyOnWriteArrayList<a.i.a.j$f> r3 = r2.n
            java.util.Iterator r3 = r3.iterator()
        L_0x0014:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r3.next()
            a.i.a.j$f r0 = (a.i.a.j.f) r0
            if (r4 == 0) goto L_0x0027
            boolean r0 = r0.f370a
            if (r0 != 0) goto L_0x0027
            goto L_0x0014
        L_0x0027:
            r3 = 0
            throw r3
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.j.h(androidx.fragment.app.Fragment, boolean):void");
    }

    public void i(Fragment fragment) {
        if (fragment.I != null) {
            SparseArray<Parcelable> sparseArray = this.C;
            if (sparseArray == null) {
                this.C = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            fragment.I.saveHierarchyState(this.C);
            if (this.C.size() > 0) {
                fragment.d = this.C;
                this.C = null;
            }
        }
    }

    public boolean i() {
        return this.u || this.v;
    }

    public void j() {
        this.u = false;
        this.v = false;
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment != null) {
                fragment.u.j();
            }
        }
    }

    public Parcelable k() {
        b[] bVarArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle;
        if (this.D != null) {
            while (!this.D.isEmpty()) {
                this.D.remove(0).a();
            }
        }
        Iterator<Fragment> it = this.g.values().iterator();
        while (true) {
            bVarArr = null;
            if (!it.hasNext()) {
                break;
            }
            Fragment next = it.next();
            if (next != null) {
                if (next.g() != null) {
                    int p2 = next.p();
                    View g2 = next.g();
                    Animation animation = g2.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        g2.clearAnimation();
                    }
                    next.a((View) null);
                    a(next, p2, 0, 0, false);
                } else if (next.h() != null) {
                    next.h().end();
                }
            }
        }
        g();
        this.u = true;
        if (this.g.isEmpty()) {
            return null;
        }
        ArrayList<p> arrayList2 = new ArrayList<>(this.g.size());
        boolean z2 = false;
        for (Fragment next2 : this.g.values()) {
            if (next2 != null) {
                if (next2.s == this) {
                    p pVar = new p(next2);
                    arrayList2.add(pVar);
                    if (next2.f513b <= 0 || pVar.n != null) {
                        pVar.n = next2.c;
                    } else {
                        if (this.B == null) {
                            this.B = new Bundle();
                        }
                        Bundle bundle2 = this.B;
                        next2.V.b(bundle2);
                        Parcelable k2 = next2.u.k();
                        if (k2 != null) {
                            bundle2.putParcelable("android:support:fragments", k2);
                        }
                        d(next2, this.B, false);
                        if (!this.B.isEmpty()) {
                            bundle = this.B;
                            this.B = null;
                        } else {
                            bundle = null;
                        }
                        if (next2.H != null) {
                            i(next2);
                        }
                        if (next2.d != null) {
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            bundle.putSparseParcelableArray("android:view_state", next2.d);
                        }
                        if (!next2.K) {
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            bundle.putBoolean("android:user_visible_hint", next2.K);
                        }
                        pVar.n = bundle;
                        String str = next2.i;
                        if (str != null) {
                            Fragment fragment = this.g.get(str);
                            if (fragment != null) {
                                if (pVar.n == null) {
                                    pVar.n = new Bundle();
                                }
                                Bundle bundle3 = pVar.n;
                                if (fragment.s == this) {
                                    bundle3.putString("android:target_state", fragment.f);
                                    int i2 = next2.j;
                                    if (i2 != 0) {
                                        pVar.n.putInt("android:target_req_state", i2);
                                    }
                                } else {
                                    a((RuntimeException) new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
                                    throw null;
                                }
                            } else {
                                a((RuntimeException) new IllegalStateException("Failure saving state: " + next2 + " has target not in fragment manager: " + next2.i));
                                throw null;
                            }
                        }
                    }
                    z2 = true;
                } else {
                    a((RuntimeException) new IllegalStateException("Failure saving state: active " + next2 + " was removed from the FragmentManager"));
                    throw null;
                }
            }
        }
        if (!z2) {
            return null;
        }
        int size2 = this.f.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<Fragment> it2 = this.f.iterator();
            while (it2.hasNext()) {
                Fragment next3 = it2.next();
                arrayList.add(next3.f);
                if (next3.s != this) {
                    a((RuntimeException) new IllegalStateException("Failure saving state: active " + next3 + " was removed from the FragmentManager"));
                    throw null;
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<a> arrayList3 = this.h;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new b[size];
            for (int i3 = 0; i3 < size; i3++) {
                bVarArr[i3] = new b(this.h.get(i3));
            }
        }
        n nVar = new n();
        nVar.f381b = arrayList2;
        nVar.c = arrayList;
        nVar.d = bVarArr;
        Fragment fragment2 = this.s;
        if (fragment2 != null) {
            nVar.e = fragment2.f;
        }
        nVar.f = this.e;
        return nVar;
    }

    public void l() {
        synchronized (this) {
            if (this.D != null && !this.D.isEmpty()) {
                this.p.d.removeCallbacks(this.F);
                this.p.d.post(this.F);
                n();
            }
        }
    }

    public void m() {
        for (Fragment next : this.g.values()) {
            if (next != null && next.J) {
                if (this.d) {
                    this.x = true;
                } else {
                    next.J = false;
                    a(next, this.o, 0, 0, false);
                }
            }
        }
    }

    public final void n() {
        a.a.b bVar = this.k;
        ArrayList<a> arrayList = this.h;
        boolean z2 = false;
        if ((arrayList != null ? arrayList.size() : 0) > 0 && e(this.r)) {
            z2 = true;
        }
        bVar.f0a = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
        r2 = r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.View r14, java.lang.String r15, android.content.Context r16, android.util.AttributeSet r17) {
        /*
            r13 = this;
            r6 = r13
            r0 = r17
            java.lang.String r1 = "fragment"
            r2 = r15
            boolean r1 = r1.equals(r15)
            r2 = 0
            if (r1 != 0) goto L_0x000e
            return r2
        L_0x000e:
            java.lang.String r1 = "class"
            java.lang.String r1 = r0.getAttributeValue(r2, r1)
            int[] r3 = a.i.a.j.g.f371a
            r4 = r16
            android.content.res.TypedArray r3 = r4.obtainStyledAttributes(r0, r3)
            r5 = 0
            if (r1 != 0) goto L_0x0023
            java.lang.String r1 = r3.getString(r5)
        L_0x0023:
            r7 = r1
            r1 = 1
            r8 = -1
            int r9 = r3.getResourceId(r1, r8)
            r10 = 2
            java.lang.String r10 = r3.getString(r10)
            r3.recycle()
            if (r7 == 0) goto L_0x0190
            java.lang.ClassLoader r3 = r16.getClassLoader()
            boolean r3 = a.i.a.g.b(r3, r7)
            if (r3 != 0) goto L_0x0040
            goto L_0x0190
        L_0x0040:
            if (r14 == 0) goto L_0x0046
            int r5 = r14.getId()
        L_0x0046:
            if (r5 != r8) goto L_0x006b
            if (r9 != r8) goto L_0x006b
            if (r10 == 0) goto L_0x004d
            goto L_0x006b
        L_0x004d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r17.getPositionDescription()
            r2.append(r0)
            java.lang.String r0 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x006b:
            if (r9 == r8) goto L_0x0072
            androidx.fragment.app.Fragment r3 = r13.b((int) r9)
            goto L_0x0073
        L_0x0072:
            r3 = r2
        L_0x0073:
            if (r3 != 0) goto L_0x00b9
            if (r10 == 0) goto L_0x00b9
            java.util.ArrayList<androidx.fragment.app.Fragment> r3 = r6.f
            int r3 = r3.size()
            int r3 = r3 + r8
        L_0x007e:
            if (r3 < 0) goto L_0x0097
            java.util.ArrayList<androidx.fragment.app.Fragment> r11 = r6.f
            java.lang.Object r11 = r11.get(r3)
            androidx.fragment.app.Fragment r11 = (androidx.fragment.app.Fragment) r11
            if (r11 == 0) goto L_0x0094
            java.lang.String r12 = r11.y
            boolean r12 = r10.equals(r12)
            if (r12 == 0) goto L_0x0094
        L_0x0092:
            r2 = r11
            goto L_0x00b8
        L_0x0094:
            int r3 = r3 + -1
            goto L_0x007e
        L_0x0097:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r3 = r6.g
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L_0x00a1:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x00b8
            java.lang.Object r11 = r3.next()
            androidx.fragment.app.Fragment r11 = (androidx.fragment.app.Fragment) r11
            if (r11 == 0) goto L_0x00a1
            java.lang.String r12 = r11.y
            boolean r12 = r10.equals(r12)
            if (r12 == 0) goto L_0x00a1
            goto L_0x0092
        L_0x00b8:
            r3 = r2
        L_0x00b9:
            if (r3 != 0) goto L_0x00c1
            if (r5 == r8) goto L_0x00c1
            androidx.fragment.app.Fragment r3 = r13.b((int) r5)
        L_0x00c1:
            if (r3 != 0) goto L_0x00ef
            a.i.a.g r2 = r13.h()
            java.lang.ClassLoader r3 = r16.getClassLoader()
            androidx.fragment.app.Fragment r3 = r2.a(r3, r7)
            r3.n = r1
            if (r9 == 0) goto L_0x00d5
            r2 = r9
            goto L_0x00d6
        L_0x00d5:
            r2 = r5
        L_0x00d6:
            r3.w = r2
            r3.x = r5
            r3.y = r10
            r3.o = r1
            r3.s = r6
            a.i.a.h r2 = r6.p
            r3.t = r2
            android.content.Context r2 = r2.c
            android.os.Bundle r2 = r3.c
            r3.a(r0, r2)
            r13.a((androidx.fragment.app.Fragment) r3, (boolean) r1)
            goto L_0x0100
        L_0x00ef:
            boolean r2 = r3.o
            if (r2 != 0) goto L_0x0152
            r3.o = r1
            a.i.a.h r2 = r6.p
            r3.t = r2
            android.content.Context r2 = r2.c
            android.os.Bundle r2 = r3.c
            r3.a(r0, r2)
        L_0x0100:
            r8 = r3
            int r0 = r6.o
            if (r0 >= r1) goto L_0x0113
            boolean r0 = r8.n
            if (r0 == 0) goto L_0x0113
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r13
            r1 = r8
            r0.a(r1, r2, r3, r4, r5)
            goto L_0x011d
        L_0x0113:
            int r2 = r6.o
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r13
            r1 = r8
            r0.a(r1, r2, r3, r4, r5)
        L_0x011d:
            android.view.View r0 = r8.H
            if (r0 == 0) goto L_0x0136
            if (r9 == 0) goto L_0x0126
            r0.setId(r9)
        L_0x0126:
            android.view.View r0 = r8.H
            java.lang.Object r0 = r0.getTag()
            if (r0 != 0) goto L_0x0133
            android.view.View r0 = r8.H
            r0.setTag(r10)
        L_0x0133:
            android.view.View r0 = r8.H
            return r0
        L_0x0136:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " did not create a view."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0152:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r17.getPositionDescription()
            r2.append(r0)
            java.lang.String r0 = ": Duplicate id 0x"
            r2.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r9)
            r2.append(r0)
            java.lang.String r0 = ", tag "
            r2.append(r0)
            r2.append(r10)
            java.lang.String r0 = ", or parent id 0x"
            r2.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r5)
            r2.append(r0)
            java.lang.String r0 = " with another fragment for "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0190:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.j.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.r;
        if (obj == null) {
            obj = this.p;
        }
        o.a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    public void j(Fragment fragment) {
        if (fragment == null || (this.g.get(fragment.f) == fragment && (fragment.t == null || fragment.s == this))) {
            Fragment fragment2 = this.s;
            this.s = fragment;
            c(fragment2);
            c(this.s);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: a.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(a.i.a.h r5, a.i.a.e r6, androidx.fragment.app.Fragment r7) {
        /*
            r4 = this;
            a.i.a.h r0 = r4.p
            if (r0 != 0) goto L_0x00bf
            r4.p = r5
            r4.q = r6
            r4.r = r7
            if (r7 == 0) goto L_0x000f
            r4.n()
        L_0x000f:
            boolean r6 = r5 instanceof a.a.c
            if (r6 == 0) goto L_0x0040
            r6 = r5
            a.a.c r6 = (a.a.c) r6
            androidx.activity.OnBackPressedDispatcher r0 = r6.b()
            r4.j = r0
            if (r7 == 0) goto L_0x001f
            r6 = r7
        L_0x001f:
            androidx.activity.OnBackPressedDispatcher r0 = r4.j
            a.a.b r1 = r4.k
            if (r0 == 0) goto L_0x003e
            a.j.e r6 = r6.a()
            r2 = r6
            a.j.i r2 = (a.j.i) r2
            a.j.e$b r2 = r2.f410b
            a.j.e$b r3 = a.j.e.b.DESTROYED
            if (r2 != r3) goto L_0x0033
            goto L_0x0040
        L_0x0033:
            androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r2 = new androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            r2.<init>(r6, r1)
            java.util.concurrent.CopyOnWriteArrayList<a.a.a> r6 = r1.f1b
            r6.add(r2)
            goto L_0x0040
        L_0x003e:
            r5 = 0
            throw r5
        L_0x0040:
            if (r7 == 0) goto L_0x0063
            a.i.a.j r5 = r7.s
            a.i.a.o r5 = r5.E
            java.util.HashMap<java.lang.String, a.i.a.o> r6 = r5.c
            java.lang.String r0 = r7.f
            java.lang.Object r6 = r6.get(r0)
            a.i.a.o r6 = (a.i.a.o) r6
            if (r6 != 0) goto L_0x0060
            a.i.a.o r6 = new a.i.a.o
            boolean r0 = r5.e
            r6.<init>(r0)
            java.util.HashMap<java.lang.String, a.i.a.o> r5 = r5.c
            java.lang.String r7 = r7.f
            r5.put(r7, r6)
        L_0x0060:
            r4.E = r6
            goto L_0x00be
        L_0x0063:
            boolean r6 = r5 instanceof a.j.u
            if (r6 == 0) goto L_0x00b6
            a.j.u r5 = (a.j.u) r5
            a.j.t r5 = r5.d()
            a.j.r r6 = a.i.a.o.h
            java.lang.Class<a.i.a.o> r7 = a.i.a.o.class
            java.lang.String r0 = r7.getCanonicalName()
            if (r0 == 0) goto L_0x00ae
            java.lang.String r1 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r0 = b.a.a.a.a.a(r1, r0)
            java.util.HashMap<java.lang.String, a.j.q> r1 = r5.f417a
            java.lang.Object r1 = r1.get(r0)
            a.j.q r1 = (a.j.q) r1
            boolean r2 = r7.isInstance(r1)
            if (r2 == 0) goto L_0x008c
            goto L_0x00a9
        L_0x008c:
            boolean r1 = r6 instanceof a.j.s
            if (r1 == 0) goto L_0x0097
            a.j.s r6 = (a.j.s) r6
            a.j.q r6 = r6.a(r0, r7)
            goto L_0x009b
        L_0x0097:
            a.j.q r6 = r6.a(r7)
        L_0x009b:
            r1 = r6
            java.util.HashMap<java.lang.String, a.j.q> r5 = r5.f417a
            java.lang.Object r5 = r5.put(r0, r1)
            a.j.q r5 = (a.j.q) r5
            if (r5 == 0) goto L_0x00a9
            r5.b()
        L_0x00a9:
            a.i.a.o r1 = (a.i.a.o) r1
            r4.E = r1
            goto L_0x00be
        L_0x00ae:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Local and anonymous classes can not be ViewModels"
            r5.<init>(r6)
            throw r5
        L_0x00b6:
            a.i.a.o r5 = new a.i.a.o
            r6 = 0
            r5.<init>(r6)
            r4.E = r5
        L_0x00be:
            return
        L_0x00bf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Already attached"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.j.a(a.i.a.h, a.i.a.e, androidx.fragment.app.Fragment):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.r
            if (r0 == 0) goto L_0x000e
            a.i.a.j r0 = r0.s
            boolean r1 = r0 instanceof a.i.a.j
            if (r1 == 0) goto L_0x000e
            r1 = 1
            r0.b((androidx.fragment.app.Fragment) r3, (boolean) r1)
        L_0x000e:
            java.util.concurrent.CopyOnWriteArrayList<a.i.a.j$f> r3 = r2.n
            java.util.Iterator r3 = r3.iterator()
        L_0x0014:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r3.next()
            a.i.a.j$f r0 = (a.i.a.j.f) r0
            if (r4 == 0) goto L_0x0027
            boolean r0 = r0.f370a
            if (r0 != 0) goto L_0x0027
            goto L_0x0014
        L_0x0027:
            r3 = 0
            throw r3
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.j.b(androidx.fragment.app.Fragment, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(androidx.fragment.app.Fragment r3, android.os.Bundle r4, boolean r5) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.r
            if (r0 == 0) goto L_0x000e
            a.i.a.j r0 = r0.s
            boolean r1 = r0 instanceof a.i.a.j
            if (r1 == 0) goto L_0x000e
            r1 = 1
            r0.c(r3, r4, r1)
        L_0x000e:
            java.util.concurrent.CopyOnWriteArrayList<a.i.a.j$f> r3 = r2.n
            java.util.Iterator r3 = r3.iterator()
        L_0x0014:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0029
            java.lang.Object r4 = r3.next()
            a.i.a.j$f r4 = (a.i.a.j.f) r4
            if (r5 == 0) goto L_0x0027
            boolean r4 = r4.f370a
            if (r4 != 0) goto L_0x0027
            goto L_0x0014
        L_0x0027:
            r3 = 0
            throw r3
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.j.c(androidx.fragment.app.Fragment, android.os.Bundle, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(androidx.fragment.app.Fragment r3, android.os.Bundle r4, boolean r5) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.r
            if (r0 == 0) goto L_0x000e
            a.i.a.j r0 = r0.s
            boolean r1 = r0 instanceof a.i.a.j
            if (r1 == 0) goto L_0x000e
            r1 = 1
            r0.d(r3, r4, r1)
        L_0x000e:
            java.util.concurrent.CopyOnWriteArrayList<a.i.a.j$f> r3 = r2.n
            java.util.Iterator r3 = r3.iterator()
        L_0x0014:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0029
            java.lang.Object r4 = r3.next()
            a.i.a.j$f r4 = (a.i.a.j.f) r4
            if (r5 == 0) goto L_0x0027
            boolean r4 = r4.f370a
            if (r4 != 0) goto L_0x0027
            goto L_0x0014
        L_0x0027:
            r3 = 0
            throw r3
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.j.d(androidx.fragment.app.Fragment, android.os.Bundle, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.r
            if (r0 == 0) goto L_0x000e
            a.i.a.j r0 = r0.s
            boolean r1 = r0 instanceof a.i.a.j
            if (r1 == 0) goto L_0x000e
            r1 = 1
            r0.e(r3, r1)
        L_0x000e:
            java.util.concurrent.CopyOnWriteArrayList<a.i.a.j$f> r3 = r2.n
            java.util.Iterator r3 = r3.iterator()
        L_0x0014:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r3.next()
            a.i.a.j$f r0 = (a.i.a.j.f) r0
            if (r4 == 0) goto L_0x0027
            boolean r0 = r0.f370a
            if (r0 != 0) goto L_0x0027
            goto L_0x0014
        L_0x0027:
            r3 = 0
            throw r3
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.j.e(androidx.fragment.app.Fragment, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.r
            if (r0 == 0) goto L_0x000e
            a.i.a.j r0 = r0.s
            boolean r1 = r0 instanceof a.i.a.j
            if (r1 == 0) goto L_0x000e
            r1 = 1
            r0.f(r3, r1)
        L_0x000e:
            java.util.concurrent.CopyOnWriteArrayList<a.i.a.j$f> r3 = r2.n
            java.util.Iterator r3 = r3.iterator()
        L_0x0014:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r3.next()
            a.i.a.j$f r0 = (a.i.a.j.f) r0
            if (r4 == 0) goto L_0x0027
            boolean r0 = r0.f370a
            if (r0 != 0) goto L_0x0027
            goto L_0x0014
        L_0x0027:
            r3 = 0
            throw r3
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.j.f(androidx.fragment.app.Fragment, boolean):void");
    }

    public boolean g() {
        c(true);
        b(this.y, this.z);
        n();
        if (this.x) {
            this.x = false;
            m();
        }
        this.g.values().removeAll(Collections.singleton((Object) null));
        return false;
    }

    public g h() {
        if (this.f364b == null) {
            this.f364b = i.c;
        }
        if (this.f364b == i.c) {
            Fragment fragment = this.r;
            if (fragment != null) {
                return fragment.s.h();
            }
            this.f364b = new c();
        }
        if (this.f364b == null) {
            this.f364b = i.c;
        }
        return this.f364b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(androidx.fragment.app.Fragment r3, android.content.Context r4, boolean r5) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.r
            if (r0 == 0) goto L_0x000e
            a.i.a.j r0 = r0.s
            boolean r1 = r0 instanceof a.i.a.j
            if (r1 == 0) goto L_0x000e
            r1 = 1
            r0.b((androidx.fragment.app.Fragment) r3, (android.content.Context) r4, (boolean) r1)
        L_0x000e:
            java.util.concurrent.CopyOnWriteArrayList<a.i.a.j$f> r3 = r2.n
            java.util.Iterator r3 = r3.iterator()
        L_0x0014:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0029
            java.lang.Object r4 = r3.next()
            a.i.a.j$f r4 = (a.i.a.j.f) r4
            if (r5 == 0) goto L_0x0027
            boolean r4 = r4.f370a
            if (r4 != 0) goto L_0x0027
            goto L_0x0014
        L_0x0027:
            r3 = 0
            throw r3
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.j.b(androidx.fragment.app.Fragment, android.content.Context, boolean):void");
    }

    public final void c(Fragment fragment) {
        if (fragment != null && this.g.get(fragment.f) == fragment) {
            boolean e2 = fragment.s.e(fragment);
            Boolean bool = fragment.k;
            if (bool == null || bool.booleanValue() != e2) {
                fragment.k = Boolean.valueOf(e2);
                j jVar = fragment.u;
                jVar.n();
                jVar.c(jVar.s);
            }
        }
    }

    public final boolean d(Fragment fragment) {
        boolean z2;
        if (fragment.D && fragment.E) {
            return true;
        }
        j jVar = fragment.u;
        Iterator<Fragment> it = jVar.g.values().iterator();
        boolean z3 = false;
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            Fragment next = it.next();
            if (next != null) {
                z3 = jVar.d(next);
                continue;
            }
            if (z3) {
                z2 = true;
                break;
            }
        }
        return z2;
    }

    public boolean e(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        j jVar = fragment.s;
        if (fragment != jVar.s || !e(jVar.r)) {
            return false;
        }
        return true;
    }

    public void f(Fragment fragment) {
        if (this.g.get(fragment.f) == null) {
            this.g.put(fragment.f, fragment);
            if (fragment.C) {
                if (fragment.B) {
                    if (!i()) {
                        this.E.f382b.add(fragment);
                    }
                } else if (!i()) {
                    this.E.f382b.remove(fragment);
                }
                fragment.C = false;
            }
        }
    }

    public void g(Fragment fragment) {
        Animator animator;
        ViewGroup viewGroup;
        int indexOfChild;
        int indexOfChild2;
        if (fragment != null && this.g.containsKey(fragment.f)) {
            int i2 = this.o;
            if (fragment.m) {
                i2 = fragment.s() ? Math.min(i2, 1) : Math.min(i2, 0);
            }
            a(fragment, i2, fragment.m(), fragment.n(), false);
            View view = fragment.H;
            if (view != null) {
                ViewGroup viewGroup2 = fragment.G;
                Fragment fragment2 = null;
                if (viewGroup2 != null && view != null) {
                    int indexOf = this.f.indexOf(fragment);
                    while (true) {
                        indexOf--;
                        if (indexOf < 0) {
                            break;
                        }
                        Fragment fragment3 = this.f.get(indexOf);
                        if (fragment3.G == viewGroup2 && fragment3.H != null) {
                            fragment2 = fragment3;
                            break;
                        }
                    }
                }
                if (fragment2 != null && (indexOfChild2 = viewGroup.indexOfChild(fragment.H)) < (indexOfChild = viewGroup.indexOfChild(fragment2.H))) {
                    (viewGroup = fragment.G).removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.H, indexOfChild);
                }
                if (fragment.M && fragment.G != null) {
                    float f2 = fragment.O;
                    if (f2 > 0.0f) {
                        fragment.H.setAlpha(f2);
                    }
                    fragment.O = 0.0f;
                    fragment.M = false;
                    d a2 = a(fragment, fragment.m(), true, fragment.n());
                    if (a2 != null) {
                        Animation animation = a2.f367a;
                        if (animation != null) {
                            fragment.H.startAnimation(animation);
                        } else {
                            a2.f368b.setTarget(fragment.H);
                            a2.f368b.start();
                        }
                    }
                }
            }
            if (fragment.N) {
                if (fragment.H != null) {
                    d a3 = a(fragment, fragment.m(), !fragment.z, fragment.n());
                    if (a3 == null || (animator = a3.f368b) == null) {
                        if (a3 != null) {
                            fragment.H.startAnimation(a3.f367a);
                            a3.f367a.start();
                        }
                        fragment.H.setVisibility((!fragment.z || fragment.r()) ? 0 : 8);
                        if (fragment.r()) {
                            fragment.a(false);
                        }
                    } else {
                        animator.setTarget(fragment.H);
                        if (!fragment.z) {
                            fragment.H.setVisibility(0);
                        } else if (fragment.r()) {
                            fragment.a(false);
                        } else {
                            ViewGroup viewGroup3 = fragment.G;
                            View view2 = fragment.H;
                            viewGroup3.startViewTransition(view2);
                            a3.f368b.addListener(new m(this, viewGroup3, view2, fragment));
                        }
                        a3.f368b.start();
                    }
                }
                if (fragment.l && d(fragment)) {
                    this.t = true;
                }
                fragment.N = false;
            }
        }
    }

    public boolean b(MenuItem menuItem) {
        if (this.o < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment != null) {
                if (!fragment.z && fragment.u.b(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(boolean z2) {
        if (this.d) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.p == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() != this.p.d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (z2 || !i()) {
            if (this.y == null) {
                this.y = new ArrayList<>();
                this.z = new ArrayList<>();
            }
            this.d = true;
            try {
                a((ArrayList<a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.d = false;
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public void b(boolean z2) {
        int size = this.f.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = this.f.get(size);
                if (fragment != null) {
                    fragment.u.b(z2);
                }
            } else {
                return;
            }
        }
    }

    public boolean b(Menu menu) {
        if (this.o < 1) {
            return false;
        }
        boolean z2 = false;
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment != null) {
                if (!fragment.z ? fragment.u.b(menu) | false : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public boolean b() {
        boolean z2;
        int size;
        if (!i()) {
            g();
            c(true);
            Fragment fragment = this.s;
            if (fragment != null && fragment.i().b()) {
                return true;
            }
            ArrayList<a> arrayList = this.y;
            ArrayList<Boolean> arrayList2 = this.z;
            ArrayList<a> arrayList3 = this.h;
            if (arrayList3 != null && (size = arrayList3.size() - 1) >= 0) {
                arrayList.add(this.h.remove(size));
                arrayList2.add(true);
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.d = true;
                try {
                    c(this.y, this.z);
                } finally {
                    c();
                }
            }
            n();
            if (this.x) {
                this.x = false;
                m();
            }
            this.g.values().removeAll(Collections.singleton((Object) null));
            return z2;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public void a(Configuration configuration) {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment != null) {
                fragment.F = true;
                fragment.u.a(configuration);
            }
        }
    }

    public boolean a(MenuItem menuItem) {
        if (this.o < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment != null) {
                if (!fragment.z && fragment.u.a(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        if (this.o < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment != null) {
                if (!fragment.z ? fragment.u.a(menu, menuInflater) | false : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fragment);
                    z2 = true;
                }
            }
        }
        if (this.i != null) {
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                Fragment fragment2 = this.i.get(i3);
                if ((arrayList == null || !arrayList.contains(fragment2)) && fragment2 == null) {
                    throw null;
                }
            }
        }
        this.i = arrayList;
        return z2;
    }

    public void a(boolean z2) {
        int size = this.f.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = this.f.get(size);
                if (fragment != null) {
                    fragment.u.a(z2);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.fragment.app.Fragment r3, android.os.Bundle r4, boolean r5) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.r
            if (r0 == 0) goto L_0x000e
            a.i.a.j r0 = r0.s
            boolean r1 = r0 instanceof a.i.a.j
            if (r1 == 0) goto L_0x000e
            r1 = 1
            r0.a((androidx.fragment.app.Fragment) r3, (android.os.Bundle) r4, (boolean) r1)
        L_0x000e:
            java.util.concurrent.CopyOnWriteArrayList<a.i.a.j$f> r3 = r2.n
            java.util.Iterator r3 = r3.iterator()
        L_0x0014:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0029
            java.lang.Object r4 = r3.next()
            a.i.a.j$f r4 = (a.i.a.j.f) r4
            if (r5 == 0) goto L_0x0027
            boolean r4 = r4.f370a
            if (r4 != 0) goto L_0x0027
            goto L_0x0014
        L_0x0027:
            r3 = 0
            throw r3
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.j.a(androidx.fragment.app.Fragment, android.os.Bundle, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.fragment.app.Fragment r3, android.content.Context r4, boolean r5) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.r
            if (r0 == 0) goto L_0x000e
            a.i.a.j r0 = r0.s
            boolean r1 = r0 instanceof a.i.a.j
            if (r1 == 0) goto L_0x000e
            r1 = 1
            r0.a((androidx.fragment.app.Fragment) r3, (android.content.Context) r4, (boolean) r1)
        L_0x000e:
            java.util.concurrent.CopyOnWriteArrayList<a.i.a.j$f> r3 = r2.n
            java.util.Iterator r3 = r3.iterator()
        L_0x0014:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0029
            java.lang.Object r4 = r3.next()
            a.i.a.j$f r4 = (a.i.a.j.f) r4
            if (r5 == 0) goto L_0x0027
            boolean r4 = r4.f370a
            if (r4 != 0) goto L_0x0027
            goto L_0x0014
        L_0x0027:
            r3 = 0
            throw r3
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.j.a(androidx.fragment.app.Fragment, android.content.Context, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.fragment.app.Fragment r3, android.view.View r4, android.os.Bundle r5, boolean r6) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.r
            if (r0 == 0) goto L_0x000e
            a.i.a.j r0 = r0.s
            boolean r1 = r0 instanceof a.i.a.j
            if (r1 == 0) goto L_0x000e
            r1 = 1
            r0.a((androidx.fragment.app.Fragment) r3, (android.view.View) r4, (android.os.Bundle) r5, (boolean) r1)
        L_0x000e:
            java.util.concurrent.CopyOnWriteArrayList<a.i.a.j$f> r3 = r2.n
            java.util.Iterator r3 = r3.iterator()
        L_0x0014:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0029
            java.lang.Object r4 = r3.next()
            a.i.a.j$f r4 = (a.i.a.j.f) r4
            if (r6 == 0) goto L_0x0027
            boolean r4 = r4.f370a
            if (r4 != 0) goto L_0x0027
            goto L_0x0014
        L_0x0027:
            r3 = 0
            throw r3
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.j.a(androidx.fragment.app.Fragment, android.view.View, android.os.Bundle, boolean):void");
    }

    public void a(Menu menu) {
        if (this.o >= 1) {
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                Fragment fragment = this.f.get(i2);
                if (fragment != null && !fragment.z) {
                    fragment.u.a(menu);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x016a, code lost:
        r6 = r3.i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r8, java.io.FileDescriptor r9, java.io.PrintWriter r10, java.lang.String[] r11) {
        /*
            r7 = this;
            java.lang.String r0 = "    "
            java.lang.String r0 = b.a.a.a.a.a(r8, r0)
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r7.g
            boolean r1 = r1.isEmpty()
            r2 = 0
            if (r1 != 0) goto L_0x0236
            r10.print(r8)
            java.lang.String r1 = "Active Fragments in "
            r10.print(r1)
            int r1 = java.lang.System.identityHashCode(r7)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r10.print(r1)
            java.lang.String r1 = ":"
            r10.println(r1)
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r7.g
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x0031:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0236
            java.lang.Object r3 = r1.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            r10.print(r8)
            r10.println(r3)
            if (r3 == 0) goto L_0x0031
            r10.print(r0)
            java.lang.String r4 = "mFragmentId=#"
            r10.print(r4)
            int r4 = r3.w
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r10.print(r4)
            java.lang.String r4 = " mContainerId=#"
            r10.print(r4)
            int r4 = r3.x
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r10.print(r4)
            java.lang.String r4 = " mTag="
            r10.print(r4)
            java.lang.String r4 = r3.y
            r10.println(r4)
            r10.print(r0)
            java.lang.String r4 = "mState="
            r10.print(r4)
            int r4 = r3.f513b
            r10.print(r4)
            java.lang.String r4 = " mWho="
            r10.print(r4)
            java.lang.String r4 = r3.f
            r10.print(r4)
            java.lang.String r4 = " mBackStackNesting="
            r10.print(r4)
            int r4 = r3.r
            r10.println(r4)
            r10.print(r0)
            java.lang.String r4 = "mAdded="
            r10.print(r4)
            boolean r4 = r3.l
            r10.print(r4)
            java.lang.String r4 = " mRemoving="
            r10.print(r4)
            boolean r4 = r3.m
            r10.print(r4)
            java.lang.String r4 = " mFromLayout="
            r10.print(r4)
            boolean r4 = r3.n
            r10.print(r4)
            java.lang.String r4 = " mInLayout="
            r10.print(r4)
            boolean r4 = r3.o
            r10.println(r4)
            r10.print(r0)
            java.lang.String r4 = "mHidden="
            r10.print(r4)
            boolean r4 = r3.z
            r10.print(r4)
            java.lang.String r4 = " mDetached="
            r10.print(r4)
            boolean r4 = r3.A
            r10.print(r4)
            java.lang.String r4 = " mMenuVisible="
            r10.print(r4)
            boolean r4 = r3.E
            r10.print(r4)
            java.lang.String r4 = " mHasMenu="
            r10.print(r4)
            r10.println(r2)
            r10.print(r0)
            java.lang.String r4 = "mRetainInstance="
            r10.print(r4)
            boolean r4 = r3.B
            r10.print(r4)
            java.lang.String r4 = " mUserVisibleHint="
            r10.print(r4)
            boolean r4 = r3.K
            r10.println(r4)
            a.i.a.j r4 = r3.s
            if (r4 == 0) goto L_0x010b
            r10.print(r0)
            java.lang.String r4 = "mFragmentManager="
            r10.print(r4)
            a.i.a.j r4 = r3.s
            r10.println(r4)
        L_0x010b:
            a.i.a.h r4 = r3.t
            if (r4 == 0) goto L_0x011c
            r10.print(r0)
            java.lang.String r4 = "mHost="
            r10.print(r4)
            a.i.a.h r4 = r3.t
            r10.println(r4)
        L_0x011c:
            androidx.fragment.app.Fragment r4 = r3.v
            if (r4 == 0) goto L_0x012d
            r10.print(r0)
            java.lang.String r4 = "mParentFragment="
            r10.print(r4)
            androidx.fragment.app.Fragment r4 = r3.v
            r10.println(r4)
        L_0x012d:
            android.os.Bundle r4 = r3.g
            if (r4 == 0) goto L_0x013e
            r10.print(r0)
            java.lang.String r4 = "mArguments="
            r10.print(r4)
            android.os.Bundle r4 = r3.g
            r10.println(r4)
        L_0x013e:
            android.os.Bundle r4 = r3.c
            if (r4 == 0) goto L_0x014f
            r10.print(r0)
            java.lang.String r4 = "mSavedFragmentState="
            r10.print(r4)
            android.os.Bundle r4 = r3.c
            r10.println(r4)
        L_0x014f:
            android.util.SparseArray<android.os.Parcelable> r4 = r3.d
            if (r4 == 0) goto L_0x0160
            r10.print(r0)
            java.lang.String r4 = "mSavedViewState="
            r10.print(r4)
            android.util.SparseArray<android.os.Parcelable> r4 = r3.d
            r10.println(r4)
        L_0x0160:
            androidx.fragment.app.Fragment r4 = r3.h
            r5 = 0
            if (r4 == 0) goto L_0x0166
            goto L_0x0178
        L_0x0166:
            a.i.a.j r4 = r3.s
            if (r4 == 0) goto L_0x0177
            java.lang.String r6 = r3.i
            if (r6 == 0) goto L_0x0177
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r4 = r4.g
            java.lang.Object r4 = r4.get(r6)
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            goto L_0x0178
        L_0x0177:
            r4 = r5
        L_0x0178:
            if (r4 == 0) goto L_0x018f
            r10.print(r0)
            java.lang.String r6 = "mTarget="
            r10.print(r6)
            r10.print(r4)
            java.lang.String r4 = " mTargetRequestCode="
            r10.print(r4)
            int r4 = r3.j
            r10.println(r4)
        L_0x018f:
            int r4 = r3.l()
            if (r4 == 0) goto L_0x01a4
            r10.print(r0)
            java.lang.String r4 = "mNextAnim="
            r10.print(r4)
            int r4 = r3.l()
            r10.println(r4)
        L_0x01a4:
            android.view.ViewGroup r4 = r3.G
            if (r4 == 0) goto L_0x01b5
            r10.print(r0)
            java.lang.String r4 = "mContainer="
            r10.print(r4)
            android.view.ViewGroup r4 = r3.G
            r10.println(r4)
        L_0x01b5:
            android.view.View r4 = r3.H
            if (r4 == 0) goto L_0x01c6
            r10.print(r0)
            java.lang.String r4 = "mView="
            r10.print(r4)
            android.view.View r4 = r3.H
            r10.println(r4)
        L_0x01c6:
            android.view.View r4 = r3.I
            if (r4 == 0) goto L_0x01d7
            r10.print(r0)
            java.lang.String r4 = "mInnerView="
            r10.print(r4)
            android.view.View r4 = r3.H
            r10.println(r4)
        L_0x01d7:
            android.view.View r4 = r3.g()
            if (r4 == 0) goto L_0x01fb
            r10.print(r0)
            java.lang.String r4 = "mAnimatingAway="
            r10.print(r4)
            android.view.View r4 = r3.g()
            r10.println(r4)
            r10.print(r0)
            java.lang.String r4 = "mStateAfterAnimating="
            r10.print(r4)
            int r4 = r3.p()
            r10.println(r4)
        L_0x01fb:
            a.i.a.h r4 = r3.t
            if (r4 != 0) goto L_0x0200
            goto L_0x0202
        L_0x0200:
            android.content.Context r5 = r4.c
        L_0x0202:
            if (r5 == 0) goto L_0x020b
            a.k.a.a r4 = a.k.a.a.a(r3)
            r4.a(r0, r9, r10, r11)
        L_0x020b:
            r10.print(r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Child "
            r4.append(r5)
            a.i.a.j r5 = r3.u
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r10.println(r4)
            a.i.a.j r3 = r3.u
            java.lang.String r4 = "  "
            java.lang.String r4 = b.a.a.a.a.a(r0, r4)
            r3.a((java.lang.String) r4, (java.io.FileDescriptor) r9, (java.io.PrintWriter) r10, (java.lang.String[]) r11)
            goto L_0x0031
        L_0x0236:
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r7.f
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x026b
            r10.print(r8)
            java.lang.String r11 = "Added Fragments:"
            r10.println(r11)
            r11 = r2
        L_0x0247:
            if (r11 >= r9) goto L_0x026b
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r7.f
            java.lang.Object r1 = r1.get(r11)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r10.print(r8)
            java.lang.String r3 = "  #"
            r10.print(r3)
            r10.print(r11)
            java.lang.String r3 = ": "
            r10.print(r3)
            java.lang.String r1 = r1.toString()
            r10.println(r1)
            int r11 = r11 + 1
            goto L_0x0247
        L_0x026b:
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r7.i
            if (r9 == 0) goto L_0x02a2
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x02a2
            r10.print(r8)
            java.lang.String r11 = "Fragments Created Menus:"
            r10.println(r11)
            r11 = r2
        L_0x027e:
            if (r11 >= r9) goto L_0x02a2
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r7.i
            java.lang.Object r1 = r1.get(r11)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r10.print(r8)
            java.lang.String r3 = "  #"
            r10.print(r3)
            r10.print(r11)
            java.lang.String r3 = ": "
            r10.print(r3)
            java.lang.String r1 = r1.toString()
            r10.println(r1)
            int r11 = r11 + 1
            goto L_0x027e
        L_0x02a2:
            java.util.ArrayList<a.i.a.a> r9 = r7.h
            if (r9 == 0) goto L_0x02dd
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x02dd
            r10.print(r8)
            java.lang.String r11 = "Back Stack:"
            r10.println(r11)
            r11 = r2
        L_0x02b5:
            if (r11 >= r9) goto L_0x02dd
            java.util.ArrayList<a.i.a.a> r1 = r7.h
            java.lang.Object r1 = r1.get(r11)
            a.i.a.a r1 = (a.i.a.a) r1
            r10.print(r8)
            java.lang.String r3 = "  #"
            r10.print(r3)
            r10.print(r11)
            java.lang.String r3 = ": "
            r10.print(r3)
            java.lang.String r3 = r1.toString()
            r10.println(r3)
            r3 = 1
            r1.a((java.lang.String) r0, (java.io.PrintWriter) r10, (boolean) r3)
            int r11 = r11 + 1
            goto L_0x02b5
        L_0x02dd:
            monitor-enter(r7)
            java.util.ArrayList<a.i.a.a> r9 = r7.l     // Catch:{ all -> 0x03a4 }
            if (r9 == 0) goto L_0x0312
            java.util.ArrayList<a.i.a.a> r9 = r7.l     // Catch:{ all -> 0x03a4 }
            int r9 = r9.size()     // Catch:{ all -> 0x03a4 }
            if (r9 <= 0) goto L_0x0312
            r10.print(r8)     // Catch:{ all -> 0x03a4 }
            java.lang.String r11 = "Back Stack Indices:"
            r10.println(r11)     // Catch:{ all -> 0x03a4 }
        L_0x02f2:
            if (r2 >= r9) goto L_0x0312
            java.util.ArrayList<a.i.a.a> r11 = r7.l     // Catch:{ all -> 0x03a4 }
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x03a4 }
            a.i.a.a r11 = (a.i.a.a) r11     // Catch:{ all -> 0x03a4 }
            r10.print(r8)     // Catch:{ all -> 0x03a4 }
            java.lang.String r0 = "  #"
            r10.print(r0)     // Catch:{ all -> 0x03a4 }
            r10.print(r2)     // Catch:{ all -> 0x03a4 }
            java.lang.String r0 = ": "
            r10.print(r0)     // Catch:{ all -> 0x03a4 }
            r10.println(r11)     // Catch:{ all -> 0x03a4 }
            int r2 = r2 + 1
            goto L_0x02f2
        L_0x0312:
            java.util.ArrayList<java.lang.Integer> r9 = r7.m     // Catch:{ all -> 0x03a4 }
            if (r9 == 0) goto L_0x0333
            java.util.ArrayList<java.lang.Integer> r9 = r7.m     // Catch:{ all -> 0x03a4 }
            int r9 = r9.size()     // Catch:{ all -> 0x03a4 }
            if (r9 <= 0) goto L_0x0333
            r10.print(r8)     // Catch:{ all -> 0x03a4 }
            java.lang.String r9 = "mAvailBackStackIndices: "
            r10.print(r9)     // Catch:{ all -> 0x03a4 }
            java.util.ArrayList<java.lang.Integer> r9 = r7.m     // Catch:{ all -> 0x03a4 }
            java.lang.Object[] r9 = r9.toArray()     // Catch:{ all -> 0x03a4 }
            java.lang.String r9 = java.util.Arrays.toString(r9)     // Catch:{ all -> 0x03a4 }
            r10.println(r9)     // Catch:{ all -> 0x03a4 }
        L_0x0333:
            monitor-exit(r7)     // Catch:{ all -> 0x03a4 }
            r10.print(r8)
            java.lang.String r9 = "FragmentManager misc state:"
            r10.println(r9)
            r10.print(r8)
            java.lang.String r9 = "  mHost="
            r10.print(r9)
            a.i.a.h r9 = r7.p
            r10.println(r9)
            r10.print(r8)
            java.lang.String r9 = "  mContainer="
            r10.print(r9)
            a.i.a.e r9 = r7.q
            r10.println(r9)
            androidx.fragment.app.Fragment r9 = r7.r
            if (r9 == 0) goto L_0x0367
            r10.print(r8)
            java.lang.String r9 = "  mParent="
            r10.print(r9)
            androidx.fragment.app.Fragment r9 = r7.r
            r10.println(r9)
        L_0x0367:
            r10.print(r8)
            java.lang.String r9 = "  mCurState="
            r10.print(r9)
            int r9 = r7.o
            r10.print(r9)
            java.lang.String r9 = " mStateSaved="
            r10.print(r9)
            boolean r9 = r7.u
            r10.print(r9)
            java.lang.String r9 = " mStopped="
            r10.print(r9)
            boolean r9 = r7.v
            r10.print(r9)
            java.lang.String r9 = " mDestroyed="
            r10.print(r9)
            boolean r9 = r7.w
            r10.println(r9)
            boolean r9 = r7.t
            if (r9 == 0) goto L_0x03a3
            r10.print(r8)
            java.lang.String r8 = "  mNeedMenuInvalidate="
            r10.print(r8)
            boolean r8 = r7.t
            r10.println(r8)
        L_0x03a3:
            return
        L_0x03a4:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x03a4 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.j.a(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public final void a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        ArrayList<a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i10 = i2;
        int i11 = i3;
        boolean z3 = arrayList3.get(i10).p;
        ArrayList<Fragment> arrayList5 = this.A;
        if (arrayList5 == null) {
            this.A = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.A.addAll(this.f);
        Fragment fragment = this.s;
        int i12 = i10;
        boolean z4 = false;
        while (true) {
            int i13 = 1;
            if (i12 < i11) {
                a aVar = arrayList3.get(i12);
                int i14 = 3;
                if (!arrayList4.get(i12).booleanValue()) {
                    ArrayList<Fragment> arrayList6 = this.A;
                    int i15 = 0;
                    while (i15 < aVar.f384a.size()) {
                        q.a aVar2 = aVar.f384a.get(i15);
                        int i16 = aVar2.f386a;
                        if (i16 != i13) {
                            if (i16 == 2) {
                                Fragment fragment2 = aVar2.f387b;
                                int i17 = fragment2.x;
                                int size = arrayList6.size() - 1;
                                boolean z5 = false;
                                while (size >= 0) {
                                    Fragment fragment3 = arrayList6.get(size);
                                    if (fragment3.x != i17) {
                                        i9 = i17;
                                    } else if (fragment3 == fragment2) {
                                        i9 = i17;
                                        z5 = true;
                                    } else {
                                        if (fragment3 == fragment) {
                                            i9 = i17;
                                            aVar.f384a.add(i15, new q.a(9, fragment3));
                                            i15++;
                                            fragment = null;
                                        } else {
                                            i9 = i17;
                                        }
                                        q.a aVar3 = new q.a(3, fragment3);
                                        aVar3.c = aVar2.c;
                                        aVar3.e = aVar2.e;
                                        aVar3.d = aVar2.d;
                                        aVar3.f = aVar2.f;
                                        aVar.f384a.add(i15, aVar3);
                                        arrayList6.remove(fragment3);
                                        i15++;
                                    }
                                    size--;
                                    ArrayList<Boolean> arrayList7 = arrayList2;
                                    i17 = i9;
                                }
                                if (z5) {
                                    aVar.f384a.remove(i15);
                                    i15--;
                                } else {
                                    i8 = 1;
                                    aVar2.f386a = 1;
                                    arrayList6.add(fragment2);
                                    i15 += i8;
                                    ArrayList<Boolean> arrayList8 = arrayList2;
                                    int i18 = i2;
                                    i13 = i8;
                                    i14 = 3;
                                }
                            } else if (i16 == i14 || i16 == 6) {
                                arrayList6.remove(aVar2.f387b);
                                Fragment fragment4 = aVar2.f387b;
                                if (fragment4 == fragment) {
                                    aVar.f384a.add(i15, new q.a(9, fragment4));
                                    i15++;
                                    fragment = null;
                                }
                            } else if (i16 == 7) {
                                i8 = 1;
                            } else if (i16 == 8) {
                                aVar.f384a.add(i15, new q.a(9, fragment));
                                i15++;
                                fragment = aVar2.f387b;
                            }
                            i8 = 1;
                            i15 += i8;
                            ArrayList<Boolean> arrayList82 = arrayList2;
                            int i182 = i2;
                            i13 = i8;
                            i14 = 3;
                        } else {
                            i8 = i13;
                        }
                        arrayList6.add(aVar2.f387b);
                        i15 += i8;
                        ArrayList<Boolean> arrayList822 = arrayList2;
                        int i1822 = i2;
                        i13 = i8;
                        i14 = 3;
                    }
                } else {
                    int i19 = 1;
                    ArrayList<Fragment> arrayList9 = this.A;
                    int size2 = aVar.f384a.size() - 1;
                    while (size2 >= 0) {
                        q.a aVar4 = aVar.f384a.get(size2);
                        int i20 = aVar4.f386a;
                        if (i20 != i19) {
                            if (i20 != 3) {
                                switch (i20) {
                                    case 6:
                                        break;
                                    case 7:
                                        break;
                                    case 8:
                                        fragment = null;
                                        break;
                                    case 9:
                                        fragment = aVar4.f387b;
                                        break;
                                    case 10:
                                        aVar4.h = aVar4.g;
                                        break;
                                }
                            }
                            arrayList9.add(aVar4.f387b);
                            size2--;
                            i19 = 1;
                        }
                        arrayList9.remove(aVar4.f387b);
                        size2--;
                        i19 = 1;
                    }
                }
                z4 = z4 || aVar.h;
                i12++;
                arrayList4 = arrayList2;
                int i21 = i2;
            } else {
                this.A.clear();
                if (!z3) {
                    v.a(this, arrayList, arrayList2, i2, i3, false);
                }
                int i22 = i2;
                while (i22 < i11) {
                    a aVar5 = arrayList3.get(i22);
                    if (arrayList2.get(i22).booleanValue()) {
                        aVar5.a(-1);
                        aVar5.a(i22 == i11 + -1);
                    } else {
                        aVar5.a(1);
                        aVar5.a();
                    }
                    i22++;
                }
                ArrayList<Boolean> arrayList10 = arrayList2;
                if (z3) {
                    a.d.c cVar = new a.d.c();
                    a((a.d.c<Fragment>) cVar);
                    i5 = i2;
                    int i23 = i11;
                    for (int i24 = i11 - 1; i24 >= i5; i24--) {
                        a aVar6 = arrayList3.get(i24);
                        boolean booleanValue = arrayList10.get(i24).booleanValue();
                        int i25 = 0;
                        while (true) {
                            if (i25 >= aVar6.f384a.size()) {
                                z2 = false;
                            } else if (a.a(aVar6.f384a.get(i25))) {
                                z2 = true;
                            } else {
                                i25++;
                            }
                        }
                        if (z2 && !aVar6.a(arrayList3, i24 + 1, i11)) {
                            if (this.D == null) {
                                this.D = new ArrayList<>();
                            }
                            h hVar = new h(aVar6, booleanValue);
                            this.D.add(hVar);
                            for (int i26 = 0; i26 < aVar6.f384a.size(); i26++) {
                                q.a aVar7 = aVar6.f384a.get(i26);
                                if (a.a(aVar7)) {
                                    aVar7.f387b.a((Fragment.d) hVar);
                                }
                            }
                            if (booleanValue) {
                                aVar6.a();
                            } else {
                                aVar6.a(false);
                            }
                            i23--;
                            if (i24 != i23) {
                                arrayList3.remove(i24);
                                arrayList3.add(i23, aVar6);
                            }
                            a((a.d.c<Fragment>) cVar);
                        }
                    }
                    i4 = 0;
                    int i27 = cVar.d;
                    for (int i28 = 0; i28 < i27; i28++) {
                        Fragment fragment5 = (Fragment) cVar.c[i28];
                        if (!fragment5.l) {
                            View t2 = fragment5.t();
                            fragment5.O = t2.getAlpha();
                            t2.setAlpha(0.0f);
                        }
                    }
                    i6 = i23;
                } else {
                    i5 = i2;
                    i4 = 0;
                    i6 = i11;
                }
                if (i6 != i5 && z3) {
                    v.a(this, arrayList, arrayList2, i2, i6, true);
                    a(this.o, true);
                }
                while (i5 < i11) {
                    a aVar8 = arrayList3.get(i5);
                    if (arrayList10.get(i5).booleanValue() && (i7 = aVar8.s) >= 0) {
                        c(i7);
                        aVar8.s = -1;
                    }
                    if (aVar8.q != null) {
                        for (int i29 = i4; i29 < aVar8.q.size(); i29++) {
                            aVar8.q.get(i29).run();
                        }
                        aVar8.q = null;
                    }
                    i5++;
                }
                return;
            }
        }
    }

    public final void a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<h> arrayList3 = this.D;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            h hVar = this.D.get(i2);
            if (arrayList == null || hVar.f372a || (indexOf2 = arrayList.indexOf(hVar.f373b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if ((hVar.c == 0) || (arrayList != null && hVar.f373b.a(arrayList, 0, arrayList.size()))) {
                    this.D.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || hVar.f372a || (indexOf = arrayList.indexOf(hVar.f373b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        hVar.a();
                    }
                }
                i2++;
            } else {
                this.D.remove(i2);
                i2--;
                size--;
            }
            a aVar = hVar.f373b;
            aVar.r.a(aVar, hVar.f372a, false, false);
            i2++;
        }
    }

    public Fragment a(String str) {
        for (Fragment next : this.g.values()) {
            if (next != null) {
                if (!str.equals(next.f)) {
                    next = next.u.a(str);
                }
                if (next != null) {
                    return next;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042 A[SYNTHETIC, Splitter:B:20:0x0042] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a.i.a.j.d a(androidx.fragment.app.Fragment r7, int r8, boolean r9, int r10) {
        /*
            r6 = this;
            int r0 = r7.l()
            r1 = 0
            r7.a((int) r1)
            android.view.ViewGroup r7 = r7.G
            r2 = 0
            if (r7 == 0) goto L_0x0014
            android.animation.LayoutTransition r7 = r7.getLayoutTransition()
            if (r7 == 0) goto L_0x0014
            return r2
        L_0x0014:
            r7 = 1
            if (r0 == 0) goto L_0x0066
            a.i.a.h r3 = r6.p
            android.content.Context r3 = r3.c
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getResourceTypeName(r0)
            java.lang.String r4 = "anim"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x003f
            a.i.a.h r4 = r6.p     // Catch:{ NotFoundException -> 0x003d, RuntimeException -> 0x003f }
            android.content.Context r4 = r4.c     // Catch:{ NotFoundException -> 0x003d, RuntimeException -> 0x003f }
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r4, r0)     // Catch:{ NotFoundException -> 0x003d, RuntimeException -> 0x003f }
            if (r4 == 0) goto L_0x003b
            a.i.a.j$d r5 = new a.i.a.j$d     // Catch:{ NotFoundException -> 0x003d, RuntimeException -> 0x003f }
            r5.<init>((android.view.animation.Animation) r4)     // Catch:{ NotFoundException -> 0x003d, RuntimeException -> 0x003f }
            return r5
        L_0x003b:
            r4 = r7
            goto L_0x0040
        L_0x003d:
            r7 = move-exception
            throw r7
        L_0x003f:
            r4 = r1
        L_0x0040:
            if (r4 != 0) goto L_0x0066
            a.i.a.h r4 = r6.p     // Catch:{ RuntimeException -> 0x0052 }
            android.content.Context r4 = r4.c     // Catch:{ RuntimeException -> 0x0052 }
            android.animation.Animator r4 = android.animation.AnimatorInflater.loadAnimator(r4, r0)     // Catch:{ RuntimeException -> 0x0052 }
            if (r4 == 0) goto L_0x0066
            a.i.a.j$d r5 = new a.i.a.j$d     // Catch:{ RuntimeException -> 0x0052 }
            r5.<init>((android.animation.Animator) r4)     // Catch:{ RuntimeException -> 0x0052 }
            return r5
        L_0x0052:
            r4 = move-exception
            if (r3 != 0) goto L_0x0065
            a.i.a.h r3 = r6.p
            android.content.Context r3 = r3.c
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r3, r0)
            if (r0 == 0) goto L_0x0066
            a.i.a.j$d r7 = new a.i.a.j$d
            r7.<init>((android.view.animation.Animation) r0)
            return r7
        L_0x0065:
            throw r4
        L_0x0066:
            if (r8 != 0) goto L_0x0069
            return r2
        L_0x0069:
            r0 = 4097(0x1001, float:5.741E-42)
            if (r8 == r0) goto L_0x0083
            r0 = 4099(0x1003, float:5.744E-42)
            if (r8 == r0) goto L_0x007d
            r0 = 8194(0x2002, float:1.1482E-41)
            if (r8 == r0) goto L_0x0077
            r8 = -1
            goto L_0x0088
        L_0x0077:
            if (r9 == 0) goto L_0x007b
            r8 = 3
            goto L_0x0088
        L_0x007b:
            r8 = 4
            goto L_0x0088
        L_0x007d:
            if (r9 == 0) goto L_0x0081
            r8 = 5
            goto L_0x0088
        L_0x0081:
            r8 = 6
            goto L_0x0088
        L_0x0083:
            if (r9 == 0) goto L_0x0087
            r8 = r7
            goto L_0x0088
        L_0x0087:
            r8 = 2
        L_0x0088:
            if (r8 >= 0) goto L_0x008b
            return r2
        L_0x008b:
            r3 = 220(0xdc, double:1.087E-321)
            r9 = 1064933786(0x3f79999a, float:0.975)
            r0 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            switch(r8) {
                case 1: goto L_0x00d3;
                case 2: goto L_0x00ce;
                case 3: goto L_0x00c9;
                case 4: goto L_0x00c1;
                case 5: goto L_0x00ae;
                case 6: goto L_0x009b;
                default: goto L_0x0096;
            }
        L_0x0096:
            if (r10 != 0) goto L_0x00fa
            a.i.a.h r8 = r6.p
            goto L_0x00da
        L_0x009b:
            android.view.animation.AlphaAnimation r7 = new android.view.animation.AlphaAnimation
            r7.<init>(r5, r0)
            android.view.animation.Interpolator r8 = I
            r7.setInterpolator(r8)
            r7.setDuration(r3)
            a.i.a.j$d r8 = new a.i.a.j$d
            r8.<init>((android.view.animation.Animation) r7)
            return r8
        L_0x00ae:
            android.view.animation.AlphaAnimation r7 = new android.view.animation.AlphaAnimation
            r7.<init>(r0, r5)
            android.view.animation.Interpolator r8 = I
            r7.setInterpolator(r8)
            r7.setDuration(r3)
            a.i.a.j$d r8 = new a.i.a.j$d
            r8.<init>((android.view.animation.Animation) r7)
            return r8
        L_0x00c1:
            r7 = 1065982362(0x3f89999a, float:1.075)
            a.i.a.j$d r7 = a((float) r5, (float) r7, (float) r5, (float) r0)
            return r7
        L_0x00c9:
            a.i.a.j$d r7 = a((float) r9, (float) r5, (float) r0, (float) r5)
            return r7
        L_0x00ce:
            a.i.a.j$d r7 = a((float) r5, (float) r9, (float) r5, (float) r0)
            return r7
        L_0x00d3:
            r7 = 1066401792(0x3f900000, float:1.125)
            a.i.a.j$d r7 = a((float) r7, (float) r5, (float) r0, (float) r5)
            return r7
        L_0x00da:
            a.i.a.d$a r8 = (a.i.a.d.a) r8
            a.i.a.d r8 = a.i.a.d.this
            android.view.Window r8 = r8.getWindow()
            if (r8 == 0) goto L_0x00e5
            r1 = r7
        L_0x00e5:
            if (r1 == 0) goto L_0x00fa
            a.i.a.h r7 = r6.p
            a.i.a.d$a r7 = (a.i.a.d.a) r7
            a.i.a.d r7 = a.i.a.d.this
            android.view.Window r7 = r7.getWindow()
            if (r7 != 0) goto L_0x00f4
            goto L_0x00fa
        L_0x00f4:
            android.view.WindowManager$LayoutParams r7 = r7.getAttributes()
            int r7 = r7.windowAnimations
        L_0x00fa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.j.a(androidx.fragment.app.Fragment, int, boolean, int):a.i.a.j$d");
    }

    public void a(int i2, boolean z2) {
        h hVar;
        if (this.p == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.o) {
            this.o = i2;
            int size = this.f.size();
            for (int i3 = 0; i3 < size; i3++) {
                g(this.f.get(i3));
            }
            for (Fragment next : this.g.values()) {
                if (next != null && ((next.m || next.A) && !next.M)) {
                    g(next);
                }
            }
            m();
            if (this.t && (hVar = this.p) != null && this.o == 4) {
                d.this.f();
                this.t = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0084, code lost:
        if (r0 != 3) goto L_0x0702;
     */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03ca  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03fd  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0707  */
    /* JADX WARNING: Removed duplicated region for block: B:347:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.fragment.app.Fragment r17, int r18, int r19, int r20, boolean r21) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            boolean r0 = r7.l
            r8 = 1
            if (r0 == 0) goto L_0x0011
            boolean r0 = r7.A
            if (r0 == 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            r0 = r18
            goto L_0x0016
        L_0x0011:
            r0 = r18
            if (r0 <= r8) goto L_0x0016
            r0 = r8
        L_0x0016:
            boolean r1 = r7.m
            if (r1 == 0) goto L_0x002a
            int r1 = r7.f513b
            if (r0 <= r1) goto L_0x002a
            if (r1 != 0) goto L_0x0028
            boolean r0 = r17.s()
            if (r0 == 0) goto L_0x0028
            r0 = r8
            goto L_0x002a
        L_0x0028:
            int r0 = r7.f513b
        L_0x002a:
            boolean r1 = r7.J
            r9 = 2
            r10 = 3
            if (r1 == 0) goto L_0x0037
            int r1 = r7.f513b
            if (r1 >= r10) goto L_0x0037
            if (r0 <= r9) goto L_0x0037
            r0 = r9
        L_0x0037:
            a.j.e$b r1 = r7.R
            a.j.e$b r2 = a.j.e.b.CREATED
            if (r1 != r2) goto L_0x0042
            int r0 = java.lang.Math.min(r0, r8)
            goto L_0x004a
        L_0x0042:
            int r1 = r1.ordinal()
            int r0 = java.lang.Math.min(r0, r1)
        L_0x004a:
            r11 = r0
            int r0 = r7.f513b
            r12 = 0
            r13 = 0
            if (r0 > r11) goto L_0x043d
            boolean r0 = r7.n
            if (r0 == 0) goto L_0x005a
            boolean r0 = r7.o
            if (r0 != 0) goto L_0x005a
            return
        L_0x005a:
            android.view.View r0 = r17.g()
            if (r0 != 0) goto L_0x0066
            android.animation.Animator r0 = r17.h()
            if (r0 == 0) goto L_0x007a
        L_0x0066:
            r7.a((android.view.View) r13)
            r7.a((android.animation.Animator) r13)
            int r2 = r17.p()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r16
            r1 = r17
            r0.a(r1, r2, r3, r4, r5)
        L_0x007a:
            int r0 = r7.f513b
            java.lang.String r14 = "Fragment "
            if (r0 == 0) goto L_0x0088
            if (r0 == r8) goto L_0x0281
            if (r0 == r9) goto L_0x03c8
            if (r0 == r10) goto L_0x03fe
            goto L_0x0702
        L_0x0088:
            if (r11 <= 0) goto L_0x0281
            android.os.Bundle r0 = r7.c
            if (r0 == 0) goto L_0x0110
            a.i.a.h r1 = r6.p
            android.content.Context r1 = r1.c
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.c
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.d = r0
            android.os.Bundle r0 = r7.c
            java.lang.String r1 = "android:target_state"
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L_0x00af
            r2 = r13
            goto L_0x00b9
        L_0x00af:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r2 = r6.g
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            if (r2 == 0) goto L_0x00ee
        L_0x00b9:
            if (r2 == 0) goto L_0x00be
            java.lang.String r0 = r2.f
            goto L_0x00bf
        L_0x00be:
            r0 = r13
        L_0x00bf:
            r7.i = r0
            if (r0 == 0) goto L_0x00cd
            android.os.Bundle r0 = r7.c
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r12)
            r7.j = r0
        L_0x00cd:
            java.lang.Boolean r0 = r7.e
            if (r0 == 0) goto L_0x00da
            boolean r0 = r0.booleanValue()
            r7.K = r0
            r7.e = r13
            goto L_0x00e4
        L_0x00da:
            android.os.Bundle r0 = r7.c
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.K = r0
        L_0x00e4:
            boolean r0 = r7.K
            if (r0 != 0) goto L_0x0110
            r7.J = r8
            if (r11 <= r9) goto L_0x0110
            r11 = r9
            goto L_0x0110
        L_0x00ee:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Fragment no longer exists for key "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ": unique id "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r6.a((java.lang.RuntimeException) r2)
            throw r13
        L_0x0110:
            a.i.a.h r0 = r6.p
            r7.t = r0
            androidx.fragment.app.Fragment r1 = r6.r
            r7.v = r1
            if (r1 == 0) goto L_0x011d
            a.i.a.j r0 = r1.u
            goto L_0x011f
        L_0x011d:
            a.i.a.j r0 = r0.f
        L_0x011f:
            r7.s = r0
            androidx.fragment.app.Fragment r0 = r7.h
            java.lang.String r10 = " that does not belong to this FragmentManager!"
            java.lang.String r15 = " declared target fragment "
            if (r0 == 0) goto L_0x016b
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.g
            java.lang.String r0 = r0.f
            java.lang.Object r0 = r1.get(r0)
            androidx.fragment.app.Fragment r1 = r7.h
            if (r0 != r1) goto L_0x014b
            int r0 = r1.f513b
            if (r0 >= r8) goto L_0x0142
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r16
            r0.a(r1, r2, r3, r4, r5)
        L_0x0142:
            androidx.fragment.app.Fragment r0 = r7.h
            java.lang.String r0 = r0.f
            r7.i = r0
            r7.h = r13
            goto L_0x016b
        L_0x014b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r1.append(r7)
            r1.append(r15)
            androidx.fragment.app.Fragment r2 = r7.h
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x016b:
            java.lang.String r0 = r7.i
            if (r0 == 0) goto L_0x01a8
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.g
            java.lang.Object r0 = r1.get(r0)
            r1 = r0
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L_0x0188
            int r0 = r1.f513b
            if (r0 >= r8) goto L_0x01a8
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r16
            r0.a(r1, r2, r3, r4, r5)
            goto L_0x01a8
        L_0x0188:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r1.append(r7)
            r1.append(r15)
            java.lang.String r2 = r7.i
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01a8:
            a.i.a.h r0 = r6.p
            android.content.Context r0 = r0.c
            r6.b((androidx.fragment.app.Fragment) r7, (android.content.Context) r0, (boolean) r12)
            a.i.a.j r0 = r7.u
            a.i.a.h r1 = r7.t
            a.i.a.c r2 = new a.i.a.c
            r2.<init>(r7)
            r0.a((a.i.a.h) r1, (a.i.a.e) r2, (androidx.fragment.app.Fragment) r7)
            r7.F = r12
            a.i.a.h r0 = r7.t
            android.content.Context r1 = r0.c
            r7.F = r8
            android.app.Activity r0 = r0.f363b
            if (r0 == 0) goto L_0x01cb
            r7.F = r12
            r7.F = r8
        L_0x01cb:
            boolean r0 = r7.F
            if (r0 == 0) goto L_0x0267
            androidx.fragment.app.Fragment r0 = r7.v
            if (r0 != 0) goto L_0x01dd
            a.i.a.h r0 = r6.p
            a.i.a.d$a r0 = (a.i.a.d.a) r0
            a.i.a.d r0 = a.i.a.d.this
            if (r0 == 0) goto L_0x01dc
            goto L_0x01dd
        L_0x01dc:
            throw r13
        L_0x01dd:
            a.i.a.h r0 = r6.p
            android.content.Context r0 = r0.c
            r6.a((androidx.fragment.app.Fragment) r7, (android.content.Context) r0, (boolean) r12)
            boolean r0 = r7.Q
            java.lang.String r1 = "android:support:fragments"
            if (r0 != 0) goto L_0x0250
            android.os.Bundle r0 = r7.c
            r6.c(r7, r0, r12)
            android.os.Bundle r0 = r7.c
            a.i.a.j r2 = r7.u
            r2.j()
            r7.f513b = r8
            r7.F = r12
            a.l.b r2 = r7.V
            r2.a(r0)
            r7.F = r8
            if (r0 == 0) goto L_0x0213
            android.os.Parcelable r0 = r0.getParcelable(r1)
            if (r0 == 0) goto L_0x0213
            a.i.a.j r1 = r7.u
            r1.a((android.os.Parcelable) r0)
            a.i.a.j r0 = r7.u
            r0.d()
        L_0x0213:
            a.i.a.j r0 = r7.u
            int r0 = r0.o
            if (r0 < r8) goto L_0x021b
            r0 = r8
            goto L_0x021c
        L_0x021b:
            r0 = r12
        L_0x021c:
            if (r0 != 0) goto L_0x0223
            a.i.a.j r0 = r7.u
            r0.d()
        L_0x0223:
            r7.Q = r8
            boolean r0 = r7.F
            if (r0 == 0) goto L_0x0236
            a.j.i r0 = r7.S
            a.j.e$a r1 = a.j.e.a.ON_CREATE
            r0.a((a.j.e.a) r1)
            android.os.Bundle r0 = r7.c
            r6.b((androidx.fragment.app.Fragment) r7, (android.os.Bundle) r0, (boolean) r12)
            goto L_0x0281
        L_0x0236:
            a.i.a.f0 r0 = new a.i.a.f0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r1.append(r7)
            java.lang.String r2 = " did not call through to super.onCreate()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0250:
            android.os.Bundle r0 = r7.c
            if (r0 == 0) goto L_0x0264
            android.os.Parcelable r0 = r0.getParcelable(r1)
            if (r0 == 0) goto L_0x0264
            a.i.a.j r1 = r7.u
            r1.a((android.os.Parcelable) r0)
            a.i.a.j r0 = r7.u
            r0.d()
        L_0x0264:
            r7.f513b = r8
            goto L_0x0281
        L_0x0267:
            a.i.a.f0 r0 = new a.i.a.f0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r1.append(r7)
            java.lang.String r2 = " did not call through to super.onAttach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0281:
            r0 = 8
            if (r11 <= 0) goto L_0x02b4
            boolean r1 = r7.n
            if (r1 == 0) goto L_0x02b4
            boolean r1 = r7.q
            if (r1 != 0) goto L_0x02b4
            android.os.Bundle r1 = r7.c
            android.view.LayoutInflater r1 = r7.a((android.os.Bundle) r1)
            android.os.Bundle r2 = r7.c
            r7.a((android.view.LayoutInflater) r1, (android.view.ViewGroup) r13, (android.os.Bundle) r2)
            android.view.View r1 = r7.H
            if (r1 == 0) goto L_0x02b2
            r7.I = r1
            r1.setSaveFromParentEnabled(r12)
            boolean r1 = r7.z
            if (r1 == 0) goto L_0x02aa
            android.view.View r1 = r7.H
            r1.setVisibility(r0)
        L_0x02aa:
            android.view.View r1 = r7.H
            android.os.Bundle r2 = r7.c
            r6.a((androidx.fragment.app.Fragment) r7, (android.view.View) r1, (android.os.Bundle) r2, (boolean) r12)
            goto L_0x02b4
        L_0x02b2:
            r7.I = r13
        L_0x02b4:
            if (r11 <= r8) goto L_0x03c8
            boolean r1 = r7.n
            if (r1 != 0) goto L_0x038d
            int r1 = r7.x
            if (r1 == 0) goto L_0x034b
            r2 = -1
            if (r1 == r2) goto L_0x032c
            a.i.a.e r2 = r6.q
            android.view.View r1 = r2.a(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 != 0) goto L_0x034c
            boolean r2 = r7.p
            if (r2 != 0) goto L_0x034c
            a.i.a.h r0 = r7.t     // Catch:{ NotFoundException -> 0x02fe }
            if (r0 != 0) goto L_0x02d5
            r0 = r13
            goto L_0x02d7
        L_0x02d5:
            android.content.Context r0 = r0.c     // Catch:{ NotFoundException -> 0x02fe }
        L_0x02d7:
            if (r0 == 0) goto L_0x02e4
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x02fe }
            int r1 = r7.x     // Catch:{ NotFoundException -> 0x02fe }
            java.lang.String r0 = r0.getResourceName(r1)     // Catch:{ NotFoundException -> 0x02fe }
            goto L_0x0300
        L_0x02e4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ NotFoundException -> 0x02fe }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NotFoundException -> 0x02fe }
            r1.<init>()     // Catch:{ NotFoundException -> 0x02fe }
            r1.append(r14)     // Catch:{ NotFoundException -> 0x02fe }
            r1.append(r7)     // Catch:{ NotFoundException -> 0x02fe }
            java.lang.String r2 = " not attached to a context."
            r1.append(r2)     // Catch:{ NotFoundException -> 0x02fe }
            java.lang.String r1 = r1.toString()     // Catch:{ NotFoundException -> 0x02fe }
            r0.<init>(r1)     // Catch:{ NotFoundException -> 0x02fe }
            throw r0     // Catch:{ NotFoundException -> 0x02fe }
        L_0x02fe:
            java.lang.String r0 = "unknown"
        L_0x0300:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "No view found for id 0x"
            java.lang.StringBuilder r2 = b.a.a.a.a.a(r2)
            int r3 = r7.x
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            r6.a((java.lang.RuntimeException) r1)
            throw r13
        L_0x032c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r6.a((java.lang.RuntimeException) r0)
            throw r13
        L_0x034b:
            r1 = r13
        L_0x034c:
            r7.G = r1
            android.os.Bundle r2 = r7.c
            android.view.LayoutInflater r2 = r7.a((android.os.Bundle) r2)
            android.os.Bundle r3 = r7.c
            r7.a((android.view.LayoutInflater) r2, (android.view.ViewGroup) r1, (android.os.Bundle) r3)
            android.view.View r2 = r7.H
            if (r2 == 0) goto L_0x038b
            r7.I = r2
            r2.setSaveFromParentEnabled(r12)
            if (r1 == 0) goto L_0x0369
            android.view.View r2 = r7.H
            r1.addView(r2)
        L_0x0369:
            boolean r1 = r7.z
            if (r1 == 0) goto L_0x0372
            android.view.View r1 = r7.H
            r1.setVisibility(r0)
        L_0x0372:
            android.view.View r0 = r7.H
            android.os.Bundle r1 = r7.c
            r6.a((androidx.fragment.app.Fragment) r7, (android.view.View) r0, (android.os.Bundle) r1, (boolean) r12)
            android.view.View r0 = r7.H
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0387
            android.view.ViewGroup r0 = r7.G
            if (r0 == 0) goto L_0x0387
            r0 = r8
            goto L_0x0388
        L_0x0387:
            r0 = r12
        L_0x0388:
            r7.M = r0
            goto L_0x038d
        L_0x038b:
            r7.I = r13
        L_0x038d:
            a.i.a.j r0 = r7.u
            r0.j()
            r7.f513b = r9
            r7.F = r12
            r7.F = r8
            a.i.a.j r0 = r7.u
            r0.u = r12
            r0.v = r12
            r0.a((int) r9)
            android.os.Bundle r0 = r7.c
            r6.a((androidx.fragment.app.Fragment) r7, (android.os.Bundle) r0, (boolean) r12)
            android.view.View r0 = r7.H
            if (r0 == 0) goto L_0x03c6
            android.util.SparseArray<android.os.Parcelable> r0 = r7.d
            if (r0 == 0) goto L_0x03b5
            android.view.View r1 = r7.I
            r1.restoreHierarchyState(r0)
            r7.d = r13
        L_0x03b5:
            r7.F = r12
            r7.F = r8
            android.view.View r0 = r7.H
            if (r0 == 0) goto L_0x03c6
            a.i.a.e0 r0 = r7.T
            a.j.e$a r1 = a.j.e.a.ON_CREATE
            a.j.i r0 = r0.f360b
            r0.a((a.j.e.a) r1)
        L_0x03c6:
            r7.c = r13
        L_0x03c8:
            if (r11 <= r9) goto L_0x03fd
            a.i.a.j r0 = r7.u
            r0.j()
            a.i.a.j r0 = r7.u
            r0.g()
            r0 = 3
            r7.f513b = r0
            r7.F = r12
            r7.F = r8
            a.j.i r0 = r7.S
            a.j.e$a r1 = a.j.e.a.ON_START
            r0.a((a.j.e.a) r1)
            android.view.View r0 = r7.H
            if (r0 == 0) goto L_0x03ef
            a.i.a.e0 r0 = r7.T
            a.j.e$a r1 = a.j.e.a.ON_START
            a.j.i r0 = r0.f360b
            r0.a((a.j.e.a) r1)
        L_0x03ef:
            a.i.a.j r0 = r7.u
            r0.u = r12
            r0.v = r12
            r10 = 3
            r0.a((int) r10)
            r6.f(r7, r12)
            goto L_0x03fe
        L_0x03fd:
            r10 = 3
        L_0x03fe:
            if (r11 <= r10) goto L_0x0702
            a.i.a.j r0 = r7.u
            r0.j()
            a.i.a.j r0 = r7.u
            r0.g()
            r0 = 4
            r7.f513b = r0
            r7.F = r12
            r7.F = r8
            a.j.i r0 = r7.S
            a.j.e$a r1 = a.j.e.a.ON_RESUME
            r0.a((a.j.e.a) r1)
            android.view.View r0 = r7.H
            if (r0 == 0) goto L_0x0425
            a.i.a.e0 r0 = r7.T
            a.j.e$a r1 = a.j.e.a.ON_RESUME
            a.j.i r0 = r0.f360b
            r0.a((a.j.e.a) r1)
        L_0x0425:
            a.i.a.j r0 = r7.u
            r0.u = r12
            r0.v = r12
            r1 = 4
            r0.a((int) r1)
            a.i.a.j r0 = r7.u
            r0.g()
            r6.e(r7, r12)
            r7.c = r13
            r7.d = r13
            goto L_0x0702
        L_0x043d:
            if (r0 <= r11) goto L_0x0702
            if (r0 == r8) goto L_0x057e
            if (r0 == r9) goto L_0x0496
            r1 = 3
            if (r0 == r1) goto L_0x0470
            r2 = 4
            if (r0 == r2) goto L_0x044b
            goto L_0x0702
        L_0x044b:
            if (r11 >= r2) goto L_0x0470
            a.i.a.j r0 = r7.u
            r0.a((int) r1)
            android.view.View r0 = r7.H
            if (r0 == 0) goto L_0x045f
            a.i.a.e0 r0 = r7.T
            a.j.e$a r1 = a.j.e.a.ON_PAUSE
            a.j.i r0 = r0.f360b
            r0.a((a.j.e.a) r1)
        L_0x045f:
            a.j.i r0 = r7.S
            a.j.e$a r1 = a.j.e.a.ON_PAUSE
            r0.a((a.j.e.a) r1)
            r1 = 3
            r7.f513b = r1
            r7.F = r12
            r7.F = r8
            r6.d(r7, r12)
        L_0x0470:
            if (r11 >= r1) goto L_0x0496
            a.i.a.j r0 = r7.u
            r0.v = r8
            r0.a((int) r9)
            android.view.View r0 = r7.H
            if (r0 == 0) goto L_0x0486
            a.i.a.e0 r0 = r7.T
            a.j.e$a r1 = a.j.e.a.ON_STOP
            a.j.i r0 = r0.f360b
            r0.a((a.j.e.a) r1)
        L_0x0486:
            a.j.i r0 = r7.S
            a.j.e$a r1 = a.j.e.a.ON_STOP
            r0.a((a.j.e.a) r1)
            r7.f513b = r9
            r7.F = r12
            r7.F = r8
            r6.g(r7, r12)
        L_0x0496:
            if (r11 >= r9) goto L_0x057e
            android.view.View r0 = r7.H
            if (r0 == 0) goto L_0x04b0
            a.i.a.h r0 = r6.p
            a.i.a.d$a r0 = (a.i.a.d.a) r0
            a.i.a.d r0 = a.i.a.d.this
            boolean r0 = r0.isFinishing()
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x04b0
            android.util.SparseArray<android.os.Parcelable> r0 = r7.d
            if (r0 != 0) goto L_0x04b0
            r16.i(r17)
        L_0x04b0:
            a.i.a.j r0 = r7.u
            r0.a((int) r8)
            android.view.View r0 = r7.H
            if (r0 == 0) goto L_0x04c2
            a.i.a.e0 r0 = r7.T
            a.j.e$a r1 = a.j.e.a.ON_DESTROY
            a.j.i r0 = r0.f360b
            r0.a((a.j.e.a) r1)
        L_0x04c2:
            r7.f513b = r8
            r7.F = r12
            r7.F = r8
            a.k.a.a r0 = a.k.a.a.a(r17)
            a.k.a.b r0 = (a.k.a.b) r0
            a.k.a.b$c r0 = r0.f419b
            a.d.i<a.k.a.b$a> r1 = r0.f420b
            int r1 = r1.b()
            r2 = r12
        L_0x04d7:
            if (r2 >= r1) goto L_0x04e6
            a.d.i<a.k.a.b$a> r3 = r0.f420b
            java.lang.Object r3 = r3.d(r2)
            a.k.a.b$a r3 = (a.k.a.b.a) r3
            a.j.h r3 = r3.j
            int r2 = r2 + 1
            goto L_0x04d7
        L_0x04e6:
            r7.q = r12
            r6.h(r7, r12)
            android.view.View r0 = r7.H
            if (r0 == 0) goto L_0x056f
            android.view.ViewGroup r1 = r7.G
            if (r1 == 0) goto L_0x056f
            r1.endViewTransition(r0)
            android.view.View r0 = r7.H
            r0.clearAnimation()
            androidx.fragment.app.Fragment r0 = r7.v
            if (r0 == 0) goto L_0x0503
            boolean r0 = r0.m
            if (r0 != 0) goto L_0x056f
        L_0x0503:
            int r0 = r6.o
            r1 = 0
            if (r0 <= 0) goto L_0x0523
            boolean r0 = r6.w
            if (r0 != 0) goto L_0x0523
            android.view.View r0 = r7.H
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0523
            float r0 = r7.O
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0523
            r0 = r19
            r2 = r20
            a.i.a.j$d r0 = r6.a((androidx.fragment.app.Fragment) r7, (int) r0, (boolean) r12, (int) r2)
            goto L_0x0524
        L_0x0523:
            r0 = r13
        L_0x0524:
            r7.O = r1
            if (r0 == 0) goto L_0x0568
            android.view.View r1 = r7.H
            android.view.ViewGroup r2 = r7.G
            r2.startViewTransition(r1)
            androidx.fragment.app.Fragment$b r3 = r17.f()
            r3.c = r11
            android.view.animation.Animation r3 = r0.f367a
            if (r3 == 0) goto L_0x0553
            a.i.a.j$e r3 = new a.i.a.j$e
            android.view.animation.Animation r0 = r0.f367a
            r3.<init>(r0, r2, r1)
            android.view.View r0 = r7.H
            r7.a((android.view.View) r0)
            a.i.a.k r0 = new a.i.a.k
            r0.<init>(r6, r2, r7)
            r3.setAnimationListener(r0)
            android.view.View r0 = r7.H
            r0.startAnimation(r3)
            goto L_0x0568
        L_0x0553:
            android.animation.Animator r0 = r0.f368b
            r7.a((android.animation.Animator) r0)
            a.i.a.l r3 = new a.i.a.l
            r3.<init>(r6, r2, r1, r7)
            r0.addListener(r3)
            android.view.View r1 = r7.H
            r0.setTarget(r1)
            r0.start()
        L_0x0568:
            android.view.ViewGroup r0 = r7.G
            android.view.View r1 = r7.H
            r0.removeView(r1)
        L_0x056f:
            r7.G = r13
            r7.H = r13
            r7.T = r13
            a.j.m<a.j.h> r0 = r7.U
            r0.a(r13)
            r7.I = r13
            r7.o = r12
        L_0x057e:
            if (r11 >= r8) goto L_0x0702
            boolean r0 = r6.w
            if (r0 == 0) goto L_0x05a5
            android.view.View r0 = r17.g()
            if (r0 == 0) goto L_0x0595
            android.view.View r0 = r17.g()
            r7.a((android.view.View) r13)
            r0.clearAnimation()
            goto L_0x05a5
        L_0x0595:
            android.animation.Animator r0 = r17.h()
            if (r0 == 0) goto L_0x05a5
            android.animation.Animator r0 = r17.h()
            r7.a((android.animation.Animator) r13)
            r0.cancel()
        L_0x05a5:
            android.view.View r0 = r17.g()
            if (r0 != 0) goto L_0x06fb
            android.animation.Animator r0 = r17.h()
            if (r0 == 0) goto L_0x05b3
            goto L_0x06fb
        L_0x05b3:
            boolean r0 = r7.m
            if (r0 == 0) goto L_0x05bf
            boolean r0 = r17.s()
            if (r0 != 0) goto L_0x05bf
            r0 = r8
            goto L_0x05c0
        L_0x05bf:
            r0 = r12
        L_0x05c0:
            if (r0 != 0) goto L_0x05ce
            a.i.a.o r1 = r6.E
            boolean r1 = r1.a(r7)
            if (r1 == 0) goto L_0x05cb
            goto L_0x05ce
        L_0x05cb:
            r7.f513b = r12
            goto L_0x0633
        L_0x05ce:
            a.i.a.h r1 = r6.p
            boolean r2 = r1 instanceof a.j.u
            if (r2 == 0) goto L_0x05d9
            a.i.a.o r1 = r6.E
            boolean r1 = r1.f
            goto L_0x05e8
        L_0x05d9:
            android.content.Context r1 = r1.c
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L_0x05e7
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            r1 = r1 ^ r8
            goto L_0x05e8
        L_0x05e7:
            r1 = r8
        L_0x05e8:
            if (r0 != 0) goto L_0x05ec
            if (r1 == 0) goto L_0x061c
        L_0x05ec:
            a.i.a.o r1 = r6.E
            if (r1 == 0) goto L_0x06fa
            java.util.HashMap<java.lang.String, a.i.a.o> r2 = r1.c
            java.lang.String r3 = r7.f
            java.lang.Object r2 = r2.get(r3)
            a.i.a.o r2 = (a.i.a.o) r2
            if (r2 == 0) goto L_0x0606
            r2.b()
            java.util.HashMap<java.lang.String, a.i.a.o> r2 = r1.c
            java.lang.String r3 = r7.f
            r2.remove(r3)
        L_0x0606:
            java.util.HashMap<java.lang.String, a.j.t> r2 = r1.d
            java.lang.String r3 = r7.f
            java.lang.Object r2 = r2.get(r3)
            a.j.t r2 = (a.j.t) r2
            if (r2 == 0) goto L_0x061c
            r2.a()
            java.util.HashMap<java.lang.String, a.j.t> r1 = r1.d
            java.lang.String r2 = r7.f
            r1.remove(r2)
        L_0x061c:
            a.i.a.j r1 = r7.u
            r1.e()
            a.j.i r1 = r7.S
            a.j.e$a r2 = a.j.e.a.ON_DESTROY
            r1.a((a.j.e.a) r2)
            r7.f513b = r12
            r7.F = r12
            r7.Q = r12
            r7.F = r8
            r6.b((androidx.fragment.app.Fragment) r7, (boolean) r12)
        L_0x0633:
            r7.F = r12
            r7.F = r8
            r7.P = r13
            a.i.a.j r1 = r7.u
            boolean r2 = r1.w
            if (r2 != 0) goto L_0x0649
            r1.e()
            a.i.a.j r1 = new a.i.a.j
            r1.<init>()
            r7.u = r1
        L_0x0649:
            r6.c((androidx.fragment.app.Fragment) r7, (boolean) r12)
            if (r21 != 0) goto L_0x0702
            if (r0 != 0) goto L_0x0675
            a.i.a.o r0 = r6.E
            boolean r0 = r0.a(r7)
            if (r0 == 0) goto L_0x0659
            goto L_0x0675
        L_0x0659:
            r7.t = r13
            r7.v = r13
            r7.s = r13
            java.lang.String r0 = r7.i
            if (r0 == 0) goto L_0x0702
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.g
            java.lang.Object r0 = r1.get(r0)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x0702
            boolean r1 = r0.B
            if (r1 == 0) goto L_0x0702
            r7.h = r0
            goto L_0x0702
        L_0x0675:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r6.g
            java.lang.String r1 = r7.f
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x0681
            goto L_0x0702
        L_0x0681:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r6.g
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x068b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x06a8
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L_0x068b
            java.lang.String r2 = r7.f
            java.lang.String r3 = r1.i
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x068b
            r1.h = r7
            r1.i = r13
            goto L_0x068b
        L_0x06a8:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r6.g
            java.lang.String r1 = r7.f
            r0.put(r1, r13)
            boolean r0 = r16.i()
            if (r0 == 0) goto L_0x06b6
            goto L_0x06bd
        L_0x06b6:
            a.i.a.o r0 = r6.E
            java.util.HashSet<androidx.fragment.app.Fragment> r0 = r0.f382b
            r0.remove(r7)
        L_0x06bd:
            java.lang.String r0 = r7.i
            if (r0 == 0) goto L_0x06cb
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.g
            java.lang.Object r0 = r1.get(r0)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r7.h = r0
        L_0x06cb:
            r17.q()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r7.f = r0
            r7.l = r12
            r7.m = r12
            r7.n = r12
            r7.o = r12
            r7.p = r12
            r7.r = r12
            r7.s = r13
            a.i.a.j r0 = new a.i.a.j
            r0.<init>()
            r7.u = r0
            r7.t = r13
            r7.w = r12
            r7.x = r12
            r7.y = r13
            r7.z = r12
            r7.A = r12
            goto L_0x0702
        L_0x06fa:
            throw r13
        L_0x06fb:
            androidx.fragment.app.Fragment$b r0 = r17.f()
            r0.c = r11
            goto L_0x0703
        L_0x0702:
            r8 = r11
        L_0x0703:
            int r0 = r7.f513b
            if (r0 == r8) goto L_0x0731
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r7.f513b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.w(r1, r0)
            r7.f513b = r8
        L_0x0731:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.j.a(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    public void a(Parcelable parcelable) {
        Bundle bundle;
        Fragment fragment;
        p pVar;
        if (parcelable != null) {
            n nVar = (n) parcelable;
            if (nVar.f381b != null) {
                for (Fragment next : this.E.f382b) {
                    Iterator<p> it = nVar.f381b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            pVar = null;
                            break;
                        }
                        pVar = it.next();
                        if (pVar.c.equals(next.f)) {
                            break;
                        }
                    }
                    if (pVar == null) {
                        Fragment fragment2 = next;
                        a(fragment2, 1, 0, 0, false);
                        next.m = true;
                        a(fragment2, 0, 0, 0, false);
                    } else {
                        pVar.o = next;
                        next.d = null;
                        next.r = 0;
                        next.o = false;
                        next.l = false;
                        Fragment fragment3 = next.h;
                        next.i = fragment3 != null ? fragment3.f : null;
                        next.h = null;
                        Bundle bundle2 = pVar.n;
                        if (bundle2 != null) {
                            bundle2.setClassLoader(this.p.c.getClassLoader());
                            next.d = pVar.n.getSparseParcelableArray("android:view_state");
                            next.c = pVar.n;
                        }
                    }
                }
                this.g.clear();
                Iterator<p> it2 = nVar.f381b.iterator();
                while (it2.hasNext()) {
                    p next2 = it2.next();
                    if (next2 != null) {
                        ClassLoader classLoader = this.p.c.getClassLoader();
                        g h2 = h();
                        if (next2.o == null) {
                            Bundle bundle3 = next2.k;
                            if (bundle3 != null) {
                                bundle3.setClassLoader(classLoader);
                            }
                            Fragment a2 = h2.a(classLoader, next2.f383b);
                            next2.o = a2;
                            a2.b(next2.k);
                            Bundle bundle4 = next2.n;
                            if (bundle4 != null) {
                                bundle4.setClassLoader(classLoader);
                                fragment = next2.o;
                                bundle = next2.n;
                            } else {
                                fragment = next2.o;
                                bundle = new Bundle();
                            }
                            fragment.c = bundle;
                            Fragment fragment4 = next2.o;
                            fragment4.f = next2.c;
                            fragment4.n = next2.d;
                            fragment4.p = true;
                            fragment4.w = next2.e;
                            fragment4.x = next2.f;
                            fragment4.y = next2.g;
                            fragment4.B = next2.h;
                            fragment4.m = next2.i;
                            fragment4.A = next2.j;
                            fragment4.z = next2.l;
                            fragment4.R = e.b.values()[next2.m];
                            if (G) {
                                StringBuilder a3 = b.a.a.a.a.a("Instantiated fragment ");
                                a3.append(next2.o);
                                Log.v("FragmentManager", a3.toString());
                            }
                        }
                        Fragment fragment5 = next2.o;
                        fragment5.s = this;
                        this.g.put(fragment5.f, fragment5);
                        next2.o = null;
                    }
                }
                this.f.clear();
                ArrayList<String> arrayList = nVar.c;
                if (arrayList != null) {
                    Iterator<String> it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        String next3 = it3.next();
                        Fragment fragment6 = this.g.get(next3);
                        if (fragment6 != null) {
                            fragment6.l = true;
                            if (!this.f.contains(fragment6)) {
                                synchronized (this.f) {
                                    this.f.add(fragment6);
                                }
                            } else {
                                throw new IllegalStateException("Already added " + fragment6);
                            }
                        } else {
                            a((RuntimeException) new IllegalStateException("No instantiated fragment for (" + next3 + ")"));
                            throw null;
                        }
                    }
                }
                if (nVar.d != null) {
                    this.h = new ArrayList<>(nVar.d.length);
                    int i2 = 0;
                    while (true) {
                        b[] bVarArr = nVar.d;
                        if (i2 >= bVarArr.length) {
                            break;
                        }
                        b bVar = bVarArr[i2];
                        if (bVar != null) {
                            a aVar = new a(this);
                            int i3 = 0;
                            int i4 = 0;
                            while (i3 < bVar.f356b.length) {
                                q.a aVar2 = new q.a();
                                int i5 = i3 + 1;
                                aVar2.f386a = bVar.f356b[i3];
                                if (G) {
                                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i4 + " base fragment #" + bVar.f356b[i5]);
                                }
                                String str = bVar.c.get(i4);
                                aVar2.f387b = str != null ? this.g.get(str) : null;
                                aVar2.g = e.b.values()[bVar.d[i4]];
                                aVar2.h = e.b.values()[bVar.e[i4]];
                                int[] iArr = bVar.f356b;
                                int i6 = i5 + 1;
                                int i7 = iArr[i5];
                                aVar2.c = i7;
                                int i8 = i6 + 1;
                                int i9 = iArr[i6];
                                aVar2.d = i9;
                                int i10 = i8 + 1;
                                int i11 = iArr[i8];
                                aVar2.e = i11;
                                int i12 = iArr[i10];
                                aVar2.f = i12;
                                aVar.f385b = i7;
                                aVar.c = i9;
                                aVar.d = i11;
                                aVar.e = i12;
                                aVar.f384a.add(aVar2);
                                aVar2.c = aVar.f385b;
                                aVar2.d = aVar.c;
                                aVar2.e = aVar.d;
                                aVar2.f = aVar.e;
                                i4++;
                                i3 = i10 + 1;
                            }
                            aVar.f = bVar.f;
                            aVar.g = bVar.g;
                            aVar.i = bVar.h;
                            aVar.s = bVar.i;
                            aVar.h = true;
                            aVar.j = bVar.j;
                            aVar.k = bVar.k;
                            aVar.l = bVar.l;
                            aVar.m = bVar.m;
                            aVar.n = bVar.n;
                            aVar.o = bVar.o;
                            aVar.p = bVar.p;
                            aVar.a(1);
                            this.h.add(aVar);
                            int i13 = aVar.s;
                            if (i13 >= 0) {
                                a(i13, aVar);
                            }
                            i2++;
                        } else {
                            throw null;
                        }
                    }
                } else {
                    this.h = null;
                }
                String str2 = nVar.e;
                if (str2 != null) {
                    Fragment fragment7 = this.g.get(str2);
                    this.s = fragment7;
                    c(fragment7);
                }
                this.e = nVar.f;
            }
        }
    }

    public void a(Fragment fragment, e.b bVar) {
        if (this.g.get(fragment.f) == fragment && (fragment.t == null || fragment.s == this)) {
            fragment.R = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new a.f.j.a("FragmentManager"));
        h hVar = this.p;
        if (hVar != null) {
            try {
                d.this.dump("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            a("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }
}
