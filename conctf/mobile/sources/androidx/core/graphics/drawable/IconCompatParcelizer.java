package androidx.core.graphics.drawable;

public class IconCompatParcelizer {
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007c, code lost:
        if (r8 != 5) goto L_0x00aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.graphics.drawable.IconCompat read(a.n.a r8) {
        /*
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.f509a
            r2 = 1
            int r1 = r8.a((int) r1, (int) r2)
            r0.f509a = r1
            byte[] r1 = r0.c
            r3 = 2
            boolean r4 = r8.a((int) r3)
            if (r4 != 0) goto L_0x0018
            goto L_0x002d
        L_0x0018:
            r1 = r8
            a.n.b r1 = (a.n.b) r1
            android.os.Parcel r4 = r1.e
            int r4 = r4.readInt()
            if (r4 >= 0) goto L_0x0025
            r1 = 0
            goto L_0x002d
        L_0x0025:
            byte[] r4 = new byte[r4]
            android.os.Parcel r1 = r1.e
            r1.readByteArray(r4)
            r1 = r4
        L_0x002d:
            r0.c = r1
            android.os.Parcelable r1 = r0.d
            r4 = 3
            android.os.Parcelable r1 = r8.a(r1, (int) r4)
            r0.d = r1
            int r1 = r0.e
            r5 = 4
            int r1 = r8.a((int) r1, (int) r5)
            r0.e = r1
            int r1 = r0.f
            r6 = 5
            int r1 = r8.a((int) r1, (int) r6)
            r0.f = r1
            android.content.res.ColorStateList r1 = r0.g
            r7 = 6
            android.os.Parcelable r1 = r8.a(r1, (int) r7)
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.g = r1
            java.lang.String r1 = r0.i
            r7 = 7
            boolean r7 = r8.a((int) r7)
            if (r7 != 0) goto L_0x005f
            goto L_0x0067
        L_0x005f:
            a.n.b r8 = (a.n.b) r8
            android.os.Parcel r8 = r8.e
            java.lang.String r1 = r8.readString()
        L_0x0067:
            r0.i = r1
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.valueOf(r1)
            r0.h = r8
            int r8 = r0.f509a
            r1 = -1
            if (r8 == r1) goto L_0x00a4
            if (r8 == r2) goto L_0x0092
            if (r8 == r3) goto L_0x0084
            if (r8 == r4) goto L_0x007f
            if (r8 == r5) goto L_0x0084
            if (r8 == r6) goto L_0x0092
            goto L_0x00aa
        L_0x007f:
            byte[] r8 = r0.c
            r0.f510b = r8
            goto L_0x00aa
        L_0x0084:
            java.lang.String r8 = new java.lang.String
            byte[] r1 = r0.c
            java.lang.String r2 = "UTF-16"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            r8.<init>(r1, r2)
            goto L_0x00a8
        L_0x0092:
            android.os.Parcelable r8 = r0.d
            if (r8 == 0) goto L_0x0097
            goto L_0x00a8
        L_0x0097:
            byte[] r8 = r0.c
            r0.f510b = r8
            r0.f509a = r4
            r1 = 0
            r0.e = r1
            int r8 = r8.length
            r0.f = r8
            goto L_0x00aa
        L_0x00a4:
            android.os.Parcelable r8 = r0.d
            if (r8 == 0) goto L_0x00ab
        L_0x00a8:
            r0.f510b = r8
        L_0x00aa:
            return r0
        L_0x00ab:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid icon"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.read(a.n.a):androidx.core.graphics.drawable.IconCompat");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 5) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void write(androidx.core.graphics.drawable.IconCompat r8, a.n.a r9) {
        /*
            if (r9 == 0) goto L_0x00a8
            android.graphics.PorterDuff$Mode r0 = r8.h
            java.lang.String r0 = r0.name()
            r8.i = r0
            int r0 = r8.f509a
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = -1
            if (r0 == r6) goto L_0x0048
            if (r0 == r5) goto L_0x0048
            java.lang.String r7 = "UTF-16"
            if (r0 == r4) goto L_0x0039
            if (r0 == r3) goto L_0x0032
            if (r0 == r2) goto L_0x0021
            if (r0 == r1) goto L_0x0048
            goto L_0x004e
        L_0x0021:
            java.lang.Object r0 = r8.f510b
            java.lang.String r0 = r0.toString()
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)
            byte[] r0 = r0.getBytes(r7)
            r8.c = r0
            goto L_0x004e
        L_0x0032:
            java.lang.Object r0 = r8.f510b
            byte[] r0 = (byte[]) r0
            r8.c = r0
            goto L_0x004e
        L_0x0039:
            java.lang.Object r0 = r8.f510b
            java.lang.String r0 = (java.lang.String) r0
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)
            byte[] r0 = r0.getBytes(r7)
            r8.c = r0
            goto L_0x004e
        L_0x0048:
            java.lang.Object r0 = r8.f510b
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r8.d = r0
        L_0x004e:
            int r0 = r8.f509a
            if (r6 == r0) goto L_0x0055
            r9.b((int) r0, (int) r5)
        L_0x0055:
            byte[] r0 = r8.c
            if (r0 == 0) goto L_0x006a
            r9.b((int) r4)
            r4 = r9
            a.n.b r4 = (a.n.b) r4
            android.os.Parcel r5 = r4.e
            int r6 = r0.length
            r5.writeInt(r6)
            android.os.Parcel r4 = r4.e
            r4.writeByteArray(r0)
        L_0x006a:
            android.os.Parcelable r0 = r8.d
            r4 = 0
            if (r0 == 0) goto L_0x007a
            r9.b((int) r3)
            r3 = r9
            a.n.b r3 = (a.n.b) r3
            android.os.Parcel r3 = r3.e
            r3.writeParcelable(r0, r4)
        L_0x007a:
            int r0 = r8.e
            if (r0 == 0) goto L_0x0081
            r9.b((int) r0, (int) r2)
        L_0x0081:
            int r0 = r8.f
            if (r0 == 0) goto L_0x0088
            r9.b((int) r0, (int) r1)
        L_0x0088:
            android.content.res.ColorStateList r0 = r8.g
            if (r0 == 0) goto L_0x0098
            r1 = 6
            r9.b((int) r1)
            r1 = r9
            a.n.b r1 = (a.n.b) r1
            android.os.Parcel r1 = r1.e
            r1.writeParcelable(r0, r4)
        L_0x0098:
            java.lang.String r8 = r8.i
            if (r8 == 0) goto L_0x00a7
            r0 = 7
            r9.b((int) r0)
            a.n.b r9 = (a.n.b) r9
            android.os.Parcel r9 = r9.e
            r9.writeString(r8)
        L_0x00a7:
            return
        L_0x00a8:
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.write(androidx.core.graphics.drawable.IconCompat, a.n.a):void");
    }
}
