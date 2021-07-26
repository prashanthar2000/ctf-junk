package a.f.e;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f269a = new Object();

    public static Drawable a(Context context, int i) {
        return context.getDrawable(i);
    }

    public static boolean a(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
