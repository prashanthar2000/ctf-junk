package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;

public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f509a = -1;

    /* renamed from: b  reason: collision with root package name */
    public Object f510b;
    public byte[] c = null;
    public Parcelable d = null;
    public int e = 0;
    public int f = 0;
    public ColorStateList g = null;
    public PorterDuff.Mode h = j;
    public String i = null;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (r2 != 5) goto L_0x0156;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r12 = this;
            int r0 = r12.f509a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r12.f510b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Icon(typ="
            r0.<init>(r2)
            int r2 = r12.f509a
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 1
            r7 = 2
            if (r2 == r6) goto L_0x0033
            if (r2 == r7) goto L_0x0030
            if (r2 == r5) goto L_0x002d
            if (r2 == r4) goto L_0x002a
            if (r2 == r3) goto L_0x0027
            java.lang.String r2 = "UNKNOWN"
            goto L_0x0035
        L_0x0027:
            java.lang.String r2 = "BITMAP_MASKABLE"
            goto L_0x0035
        L_0x002a:
            java.lang.String r2 = "URI"
            goto L_0x0035
        L_0x002d:
            java.lang.String r2 = "DATA"
            goto L_0x0035
        L_0x0030:
            java.lang.String r2 = "RESOURCE"
            goto L_0x0035
        L_0x0033:
            java.lang.String r2 = "BITMAP"
        L_0x0035:
            r0.append(r2)
            int r2 = r12.f509a
            if (r2 == r6) goto L_0x0136
            if (r2 == r7) goto L_0x0069
            if (r2 == r5) goto L_0x0052
            if (r2 == r4) goto L_0x0046
            if (r2 == r3) goto L_0x0136
            goto L_0x0156
        L_0x0046:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r12.f510b
            r0.append(r1)
            goto L_0x0156
        L_0x0052:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r12.e
            r0.append(r1)
            int r1 = r12.f
            if (r1 == 0) goto L_0x0156
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r12.f
            goto L_0x0153
        L_0x0069:
            java.lang.String r2 = " pkg="
            r0.append(r2)
            int r2 = r12.f509a
            r3 = 28
            java.lang.String r4 = "IconCompat"
            r5 = 0
            if (r2 != r1) goto L_0x00a6
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r8 = r12.f510b
            android.graphics.drawable.Icon r8 = (android.graphics.drawable.Icon) r8
            if (r2 < r3) goto L_0x0084
            java.lang.String r2 = r8.getResPackage()
            goto L_0x00b4
        L_0x0084:
            r2 = 0
            java.lang.Class r9 = r8.getClass()     // Catch:{ IllegalAccessException -> 0x009f, InvocationTargetException -> 0x009d, NoSuchMethodException -> 0x009b }
            java.lang.String r10 = "getResPackage"
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ IllegalAccessException -> 0x009f, InvocationTargetException -> 0x009d, NoSuchMethodException -> 0x009b }
            java.lang.reflect.Method r9 = r9.getMethod(r10, r11)     // Catch:{ IllegalAccessException -> 0x009f, InvocationTargetException -> 0x009d, NoSuchMethodException -> 0x009b }
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException -> 0x009f, InvocationTargetException -> 0x009d, NoSuchMethodException -> 0x009b }
            java.lang.Object r8 = r9.invoke(r8, r10)     // Catch:{ IllegalAccessException -> 0x009f, InvocationTargetException -> 0x009d, NoSuchMethodException -> 0x009b }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IllegalAccessException -> 0x009f, InvocationTargetException -> 0x009d, NoSuchMethodException -> 0x009b }
            r2 = r8
            goto L_0x00b4
        L_0x009b:
            r8 = move-exception
            goto L_0x00a0
        L_0x009d:
            r8 = move-exception
            goto L_0x00a0
        L_0x009f:
            r8 = move-exception
        L_0x00a0:
            java.lang.String r9 = "Unable to get icon package"
            android.util.Log.e(r4, r9, r8)
            goto L_0x00b4
        L_0x00a6:
            if (r2 != r7) goto L_0x011f
            java.lang.Object r2 = r12.f510b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r8 = ":"
            java.lang.String[] r2 = r2.split(r8, r1)
            r2 = r2[r5]
        L_0x00b4:
            r0.append(r2)
            java.lang.String r2 = " id="
            r0.append(r2)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            int r6 = r12.f509a
            if (r6 != r1) goto L_0x00f4
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r6 = r12.f510b
            android.graphics.drawable.Icon r6 = (android.graphics.drawable.Icon) r6
            if (r1 < r3) goto L_0x00cf
            int r1 = r6.getResId()
            goto L_0x00f8
        L_0x00cf:
            java.lang.Class r1 = r6.getClass()     // Catch:{ IllegalAccessException -> 0x00ec, InvocationTargetException -> 0x00ea, NoSuchMethodException -> 0x00e8 }
            java.lang.String r3 = "getResId"
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ IllegalAccessException -> 0x00ec, InvocationTargetException -> 0x00ea, NoSuchMethodException -> 0x00e8 }
            java.lang.reflect.Method r1 = r1.getMethod(r3, r7)     // Catch:{ IllegalAccessException -> 0x00ec, InvocationTargetException -> 0x00ea, NoSuchMethodException -> 0x00e8 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException -> 0x00ec, InvocationTargetException -> 0x00ea, NoSuchMethodException -> 0x00e8 }
            java.lang.Object r1 = r1.invoke(r6, r3)     // Catch:{ IllegalAccessException -> 0x00ec, InvocationTargetException -> 0x00ea, NoSuchMethodException -> 0x00e8 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IllegalAccessException -> 0x00ec, InvocationTargetException -> 0x00ea, NoSuchMethodException -> 0x00e8 }
            int r1 = r1.intValue()     // Catch:{ IllegalAccessException -> 0x00ec, InvocationTargetException -> 0x00ea, NoSuchMethodException -> 0x00e8 }
            goto L_0x00f8
        L_0x00e8:
            r1 = move-exception
            goto L_0x00ed
        L_0x00ea:
            r1 = move-exception
            goto L_0x00ed
        L_0x00ec:
            r1 = move-exception
        L_0x00ed:
            java.lang.String r3 = "Unable to get icon resource"
            android.util.Log.e(r4, r3, r1)
            r1 = r5
            goto L_0x00f8
        L_0x00f4:
            if (r6 != r7) goto L_0x0108
            int r1 = r12.e
        L_0x00f8:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r5] = r1
            java.lang.String r1 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.append(r1)
            goto L_0x0156
        L_0x0108:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getResId() on "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x011f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getResPackage() on "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0136:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r12.f510b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r12.f510b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x0153:
            r0.append(r1)
        L_0x0156:
            android.content.res.ColorStateList r1 = r12.g
            if (r1 == 0) goto L_0x0164
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r12.g
            r0.append(r1)
        L_0x0164:
            android.graphics.PorterDuff$Mode r1 = r12.h
            android.graphics.PorterDuff$Mode r2 = j
            if (r1 == r2) goto L_0x0174
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r12.h
            r0.append(r1)
        L_0x0174:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
