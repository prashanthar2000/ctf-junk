package a.k.a;

import a.b.k.o;
import a.d.i;
import a.j.h;
import a.j.m;
import a.j.n;
import a.j.q;
import a.j.r;
import a.j.s;
import a.j.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final h f418a;

    /* renamed from: b  reason: collision with root package name */
    public final c f419b;

    public static class a<D> extends m<D> {
        public h j;
        public C0023b<D> k;

        public void a() {
            throw null;
        }

        public void a(n<? super D> nVar) {
            super.a(nVar);
            this.j = null;
            this.k = null;
        }

        public void a(D d) {
            super.a(d);
        }

        public void b() {
            throw null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(0);
            sb.append(" : ");
            o.a((Object) null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: a.k.a.b$b  reason: collision with other inner class name */
    public static class C0023b<D> implements n<D> {
    }

    public static class c extends q {
        public static final r c = new a();

        /* renamed from: b  reason: collision with root package name */
        public i<a> f420b = new i<>(10);

        public static class a implements r {
            public <T extends q> T a(Class<T> cls) {
                return new c();
            }
        }

        public void b() {
            if (this.f420b.b() > 0) {
                a d = this.f420b.d(0);
                throw null;
            }
            i<a> iVar = this.f420b;
            int i = iVar.e;
            Object[] objArr = iVar.d;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            iVar.e = 0;
            iVar.f221b = false;
        }
    }

    public b(h hVar, t tVar) {
        this.f418a = hVar;
        r rVar = c.c;
        Class cls = c.class;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String a2 = b.a.a.a.a.a("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            q qVar = tVar.f417a.get(a2);
            if (!cls.isInstance(qVar)) {
                qVar = rVar instanceof s ? ((s) rVar).a(a2, cls) : rVar.a(cls);
                q put = tVar.f417a.put(a2, qVar);
                if (put != null) {
                    put.b();
                }
            }
            this.f419b = (c) qVar;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        c cVar = this.f419b;
        if (cVar.f420b.b() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (cVar.f420b.b() > 0) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(cVar.f420b.b(0));
                printWriter.print(": ");
                printWriter.println(cVar.f420b.d(0).toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println((Object) null);
                throw null;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        o.a((Object) this.f418a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
