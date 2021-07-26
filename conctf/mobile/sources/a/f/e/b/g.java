package a.f.e.b;

import a.b.p.y;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

public abstract class g {

    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Typeface f279b;

        public a(Typeface typeface) {
            this.f279b = typeface;
        }

        public void run() {
            g.this.a(this.f279b);
        }
    }

    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f280b;

        public b(int i) {
            this.f280b = i;
        }

        public void run() {
            if (((y.a) g.this) == null) {
                throw null;
            }
        }
    }

    public final void a(int i, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new b(i));
    }

    public abstract void a(Typeface typeface);

    public final void a(Typeface typeface, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new a(typeface));
    }
}
