package a.f.f;

import a.f.e.b.c;
import a.f.e.b.d;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import b.a.a.a.a;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public class f extends d {
    public final Class g;
    public final Constructor h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;

    public f() {
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = a((Class) cls2);
            method2 = b((Class) cls2);
            method = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            Class<?> cls3 = cls2;
            method5 = c((Class) cls2);
            cls = cls3;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder a2 = a.a("Unable to collect necessary methods for class ");
            a2.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", a2.toString(), e);
            method5 = null;
            method4 = null;
            constructor = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.g = cls;
        this.h = constructor;
        this.i = method3;
        this.j = method2;
        this.k = method;
        this.l = method4;
        this.m = method5;
    }

    private Object c() {
        try {
            return this.h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Typeface a(Context context, c cVar, Resources resources, int i2) {
        if (!b()) {
            return super.a(context, cVar, resources, i2);
        }
        Object c = c();
        if (c == null) {
            return null;
        }
        for (d dVar : cVar.f272a) {
            if (!a(context, c, dVar.f273a, dVar.e, dVar.f274b, dVar.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d))) {
                a(c);
                return null;
            }
        }
        if (!c(c)) {
            return null;
        }
        return b(c);
    }

    public Typeface a(Context context, Resources resources, int i2, String str, int i3) {
        if (!b()) {
            return super.a(context, resources, i2, str, i3);
        }
        Object c = c();
        if (c == null) {
            return null;
        }
        if (!a(context, c, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            a(c);
            return null;
        } else if (!c(c)) {
            return null;
        } else {
            return b(c);
        }
    }

    public Method a(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    public final void a(Object obj) {
        try {
            this.l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean a(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, new Object[]{context.getAssets(), str, 0, false, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface b(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method b(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    public final boolean b() {
        if (this.i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.i != null;
    }

    public Method c(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public final boolean c(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        throw r14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface a(android.content.Context r12, android.os.CancellationSignal r13, a.f.h.b.f[] r14, int r15) {
        /*
            r11 = this;
            int r0 = r14.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L_0x0006
            return r2
        L_0x0006:
            boolean r0 = r11.b()
            if (r0 != 0) goto L_0x004e
            a.f.h.b$f r14 = r11.a((a.f.h.b.f[]) r14, (int) r15)
            android.content.ContentResolver r12 = r12.getContentResolver()
            android.net.Uri r15 = r14.f299a     // Catch:{ IOException -> 0x004d }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r12 = r12.openFileDescriptor(r15, r0, r13)     // Catch:{ IOException -> 0x004d }
            if (r12 != 0) goto L_0x0024
            if (r12 == 0) goto L_0x0023
            r12.close()     // Catch:{ IOException -> 0x004d }
        L_0x0023:
            return r2
        L_0x0024:
            android.graphics.Typeface$Builder r13 = new android.graphics.Typeface$Builder     // Catch:{ all -> 0x0041 }
            java.io.FileDescriptor r15 = r12.getFileDescriptor()     // Catch:{ all -> 0x0041 }
            r13.<init>(r15)     // Catch:{ all -> 0x0041 }
            int r15 = r14.c     // Catch:{ all -> 0x0041 }
            android.graphics.Typeface$Builder r13 = r13.setWeight(r15)     // Catch:{ all -> 0x0041 }
            boolean r14 = r14.d     // Catch:{ all -> 0x0041 }
            android.graphics.Typeface$Builder r13 = r13.setItalic(r14)     // Catch:{ all -> 0x0041 }
            android.graphics.Typeface r13 = r13.build()     // Catch:{ all -> 0x0041 }
            r12.close()     // Catch:{ IOException -> 0x004d }
            return r13
        L_0x0041:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r14 = move-exception
            r12.close()     // Catch:{ all -> 0x0048 }
            goto L_0x004c
        L_0x0048:
            r12 = move-exception
            r13.addSuppressed(r12)     // Catch:{ IOException -> 0x004d }
        L_0x004c:
            throw r14     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            return r2
        L_0x004e:
            java.util.Map r12 = a.f.h.b.a((android.content.Context) r12, (a.f.h.b.f[]) r14, (android.os.CancellationSignal) r13)
            java.lang.Object r13 = r11.c()
            if (r13 != 0) goto L_0x0059
            return r2
        L_0x0059:
            int r0 = r14.length
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x005d:
            if (r4 >= r0) goto L_0x00a6
            r6 = r14[r4]
            android.net.Uri r7 = r6.f299a
            java.lang.Object r7 = r12.get(r7)
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            if (r7 != 0) goto L_0x006c
            goto L_0x00a3
        L_0x006c:
            int r5 = r6.f300b
            int r8 = r6.c
            boolean r6 = r6.d
            java.lang.reflect.Method r9 = r11.j     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009b }
            r10 = 5
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009b }
            r10[r3] = r7     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009b }
            r10[r1] = r5     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009b }
            r5 = 2
            r10[r5] = r2     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009b }
            r5 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009b }
            r10[r5] = r7     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009b }
            r5 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009b }
            r10[r5] = r6     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009b }
            java.lang.Object r5 = r9.invoke(r13, r10)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009b }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009b }
            boolean r5 = r5.booleanValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009b }
            goto L_0x009c
        L_0x009b:
            r5 = r3
        L_0x009c:
            if (r5 != 0) goto L_0x00a2
            r11.a((java.lang.Object) r13)
            return r2
        L_0x00a2:
            r5 = r1
        L_0x00a3:
            int r4 = r4 + 1
            goto L_0x005d
        L_0x00a6:
            if (r5 != 0) goto L_0x00ac
            r11.a((java.lang.Object) r13)
            return r2
        L_0x00ac:
            boolean r12 = r11.c((java.lang.Object) r13)
            if (r12 != 0) goto L_0x00b3
            return r2
        L_0x00b3:
            android.graphics.Typeface r12 = r11.b((java.lang.Object) r13)
            if (r12 != 0) goto L_0x00ba
            return r2
        L_0x00ba:
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r12, r15)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.f.f.a(android.content.Context, android.os.CancellationSignal, a.f.h.b$f[], int):android.graphics.Typeface");
    }
}
