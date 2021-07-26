package a.f.h;

import a.f.h.c;
import android.os.Handler;
import java.util.concurrent.Callable;

public class d implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f307b;
    public final /* synthetic */ Handler c;
    public final /* synthetic */ c.C0015c d;

    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f308b;

        public a(Object obj) {
            this.f308b = obj;
        }

        public void run() {
            d.this.d.a(this.f308b);
        }
    }

    public d(c cVar, Callable callable, Handler handler, c.C0015c cVar2) {
        this.f307b = callable;
        this.c = handler;
        this.d = cVar2;
    }

    public void run() {
        Object obj;
        try {
            obj = this.f307b.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.c.post(new a(obj));
    }
}
