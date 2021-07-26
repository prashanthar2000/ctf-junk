package a.i.a;

import a.b.k.o;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;

public abstract class h<E> extends e {

    /* renamed from: b  reason: collision with root package name */
    public final Activity f363b;
    public final Context c;
    public final Handler d;
    public final int e;
    public final j f = new j();

    public h(d dVar) {
        Handler handler = new Handler();
        this.f363b = dVar;
        o.a(dVar, (Object) "context == null");
        this.c = dVar;
        o.a(handler, (Object) "handler == null");
        this.d = handler;
        this.e = 0;
    }
}
