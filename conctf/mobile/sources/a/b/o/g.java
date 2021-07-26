package a.b.o;

import a.f.k.p;
import a.f.k.q;
import a.f.k.r;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<p> f69a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public long f70b = -1;
    public Interpolator c;
    public q d;
    public boolean e;
    public final r f = new a();

    public class a extends r {

        /* renamed from: a  reason: collision with root package name */
        public boolean f71a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f72b = 0;

        public a() {
        }

        public void a(View view) {
            int i = this.f72b + 1;
            this.f72b = i;
            if (i == g.this.f69a.size()) {
                q qVar = g.this.d;
                if (qVar != null) {
                    qVar.a((View) null);
                }
                this.f72b = 0;
                this.f71a = false;
                g.this.e = false;
            }
        }

        public void b(View view) {
            if (!this.f71a) {
                this.f71a = true;
                q qVar = g.this.d;
                if (qVar != null) {
                    qVar.b((View) null);
                }
            }
        }
    }

    public void a() {
        if (this.e) {
            Iterator<p> it = this.f69a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.e = false;
        }
    }

    public void b() {
        View view;
        if (!this.e) {
            Iterator<p> it = this.f69a.iterator();
            while (it.hasNext()) {
                p next = it.next();
                long j = this.f70b;
                if (j >= 0) {
                    next.a(j);
                }
                Interpolator interpolator = this.c;
                if (!(interpolator == null || (view = (View) next.f330a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.d != null) {
                    next.a((q) this.f);
                }
                View view2 = (View) next.f330a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.e = true;
        }
    }
}
