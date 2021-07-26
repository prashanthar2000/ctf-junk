package a.b.k;

import a.d.c;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public abstract class g {

    /* renamed from: b  reason: collision with root package name */
    public static final c<WeakReference<g>> f8b = new c<>();
    public static final Object c = new Object();

    public static g a(Activity activity, f fVar) {
        return new h(activity, (Window) null, fVar, activity);
    }

    public static void a(g gVar) {
        synchronized (c) {
            c(gVar);
            f8b.add(new WeakReference(gVar));
        }
    }

    public static void b(g gVar) {
        synchronized (c) {
            c(gVar);
        }
    }

    public static void c(g gVar) {
        synchronized (c) {
            Iterator<WeakReference<g>> it = f8b.iterator();
            while (it.hasNext()) {
                g gVar2 = (g) it.next().get();
                if (gVar2 == gVar || gVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void a();

    public abstract void a(Bundle bundle);

    public abstract void a(View view);

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void a(CharSequence charSequence);

    public abstract boolean a(int i);

    public abstract void b();

    public abstract void b(int i);

    public abstract void b(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void c();

    public static g a(Dialog dialog, f fVar) {
        return new h(dialog.getContext(), dialog.getWindow(), fVar, dialog);
    }
}
