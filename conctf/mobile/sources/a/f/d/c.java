package a.f.d;

import android.util.Log;

public final class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f267b;
    public final /* synthetic */ Object c;

    public c(Object obj, Object obj2) {
        this.f267b = obj;
        this.c = obj2;
    }

    public void run() {
        try {
            if (b.d != null) {
                b.d.invoke(this.f267b, new Object[]{this.c, false, "AppCompat recreation"});
                return;
            }
            b.e.invoke(this.f267b, new Object[]{this.c, false});
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
