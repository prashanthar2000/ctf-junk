package a.b.l.a;

import a.b.p.n0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f42a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<Context, SparseArray<Object>> f43b = new WeakHashMap<>(0);
    public static final Object c = new Object();

    public static ColorStateList a(Context context, int i) {
        return context.getColorStateList(i);
    }

    public static Drawable b(Context context, int i) {
        return n0.a().b(context, i);
    }
}
