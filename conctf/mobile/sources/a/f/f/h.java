package a.f.f;

import a.b.k.o;
import a.f.e.b.c;
import a.f.h.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<Long, c> f287a = new ConcurrentHashMap<>();

    public b.f a(b.f[] fVarArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        b.f fVar = null;
        int i3 = Integer.MAX_VALUE;
        for (b.f fVar2 : fVarArr) {
            int abs = (Math.abs(fVar2.c - i2) * 2) + (fVar2.d == z ? 0 : 1);
            if (fVar == null || i3 > abs) {
                fVar = fVar2;
                i3 = abs;
            }
        }
        return fVar;
    }

    public Typeface a(Context context, c cVar, Resources resources, int i) {
        throw null;
    }

    public Typeface a(Context context, Resources resources, int i, String str, int i2) {
        File a2 = o.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (!o.a(a2, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a2.getPath());
            a2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a2.delete();
        }
    }

    public Typeface a(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i) {
        throw null;
    }

    public Typeface a(Context context, InputStream inputStream) {
        File a2 = o.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (!o.a(a2, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a2.getPath());
            a2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a2.delete();
        }
    }
}
