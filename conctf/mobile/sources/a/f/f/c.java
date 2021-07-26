package a.f.f;

import a.d.f;
import a.f.e.b.b;
import a.f.e.b.e;
import a.f.e.b.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.util.Log;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final h f283a;

    /* renamed from: b  reason: collision with root package name */
    public static final f<String, Typeface> f284b = new f<>(16);

    static {
        h hVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            hVar = new g();
        } else if (i >= 26) {
            hVar = new f();
        } else {
            if (i >= 24) {
                if (e.d == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (e.d != null) {
                    hVar = new e();
                }
            }
            hVar = new d();
        }
        f283a = hVar;
    }

    public static Typeface a(Context context, b bVar, Resources resources, int i, int i2, g gVar, Handler handler, boolean z) {
        Typeface typeface;
        if (bVar instanceof e) {
            e eVar = (e) bVar;
            boolean z2 = false;
            if (!z ? gVar == null : eVar.c == 0) {
                z2 = true;
            }
            typeface = a.f.h.b.a(context, eVar.f275a, gVar, handler, z2, z ? eVar.f276b : -1, i2);
        } else {
            typeface = f283a.a(context, (a.f.e.b.c) bVar, resources, i2);
            if (gVar != null) {
                if (typeface != null) {
                    gVar.a(typeface, handler);
                } else {
                    gVar.a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f284b.a(a(resources, i, i2), typeface);
        }
        return typeface;
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a2 = f283a.a(context, resources, i, str, i2);
        if (a2 != null) {
            f284b.a(a(resources, i, i2), a2);
        }
        return a2;
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static String a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
