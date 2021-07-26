package a.f.d;

import android.app.Activity;
import android.os.Build;

public class a extends a.f.e.a {

    /* renamed from: a.f.d.a$a  reason: collision with other inner class name */
    public interface C0012a {
    }

    public static C0012a a() {
        return null;
    }

    public static void a(Activity activity) {
        activity.finishAffinity();
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28 || !b.a(activity)) {
            activity.recreate();
        }
    }
}
