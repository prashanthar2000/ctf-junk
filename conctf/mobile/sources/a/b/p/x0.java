package a.b.p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

public class x0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f185a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f186b;
    public TypedValue c;

    public x0(Context context, TypedArray typedArray) {
        this.f185a = context;
        this.f186b = typedArray;
    }

    public static x0 a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new x0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static x0 a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new x0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public int a(int i, int i2) {
        return this.f186b.getDimensionPixelOffset(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = a.b.l.a.a.a(r2.f185a, (r0 = r2.f186b.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList a(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f186b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f186b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f185a
            android.content.res.ColorStateList r0 = a.b.l.a.a.a(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f186b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.x0.a(int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r15 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b0, code lost:
        if (r15 != null) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface a(int r13, int r14, a.f.e.b.g r15) {
        /*
            r12 = this;
            android.content.res.TypedArray r0 = r12.f186b
            r1 = 0
            int r13 = r0.getResourceId(r13, r1)
            r0 = 0
            if (r13 != 0) goto L_0x000b
            return r0
        L_0x000b:
            android.util.TypedValue r1 = r12.c
            if (r1 != 0) goto L_0x0016
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r12.c = r1
        L_0x0016:
            android.content.Context r2 = r12.f185a
            android.util.TypedValue r1 = r12.c
            boolean r3 = r2.isRestricted()
            if (r3 == 0) goto L_0x0022
            goto L_0x00d6
        L_0x0022:
            r9 = 1
            android.content.res.Resources r4 = r2.getResources()
            r3 = 1
            r4.getValue(r13, r1, r3)
            java.lang.String r10 = "ResourcesCompat"
            java.lang.CharSequence r3 = r1.string
            if (r3 == 0) goto L_0x00d7
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "res/"
            boolean r3 = r1.startsWith(r3)
            r11 = -3
            if (r3 != 0) goto L_0x0042
            if (r15 == 0) goto L_0x00b5
            goto L_0x00b2
        L_0x0042:
            a.d.f<java.lang.String, android.graphics.Typeface> r3 = a.f.f.c.f284b
            java.lang.String r5 = a.f.f.c.a((android.content.res.Resources) r4, (int) r13, (int) r14)
            java.lang.Object r3 = r3.a(r5)
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3
            if (r3 == 0) goto L_0x0057
            if (r15 == 0) goto L_0x0055
            r15.a((android.graphics.Typeface) r3, (android.os.Handler) r0)
        L_0x0055:
            r0 = r3
            goto L_0x00b5
        L_0x0057:
            java.lang.String r3 = r1.toLowerCase()     // Catch:{ XmlPullParserException -> 0x009b, IOException -> 0x0092 }
            java.lang.String r5 = ".xml"
            boolean r3 = r3.endsWith(r5)     // Catch:{ XmlPullParserException -> 0x009b, IOException -> 0x0092 }
            if (r3 == 0) goto L_0x0081
            android.content.res.XmlResourceParser r3 = r4.getXml(r13)     // Catch:{ XmlPullParserException -> 0x009b, IOException -> 0x0092 }
            a.f.e.b.b r3 = a.b.k.o.a((org.xmlpull.v1.XmlPullParser) r3, (android.content.res.Resources) r4)     // Catch:{ XmlPullParserException -> 0x009b, IOException -> 0x0092 }
            if (r3 != 0) goto L_0x0078
            java.lang.String r14 = "Failed to find font-family tag"
            android.util.Log.e(r10, r14)     // Catch:{ XmlPullParserException -> 0x009b, IOException -> 0x0092 }
            if (r15 == 0) goto L_0x00b5
            r15.a((int) r11, (android.os.Handler) r0)     // Catch:{ XmlPullParserException -> 0x009b, IOException -> 0x0092 }
            goto L_0x00b5
        L_0x0078:
            r8 = 0
            r5 = r13
            r6 = r14
            r7 = r15
            android.graphics.Typeface r14 = a.f.f.c.a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ XmlPullParserException -> 0x009b, IOException -> 0x0092 }
            goto L_0x0090
        L_0x0081:
            android.graphics.Typeface r14 = a.f.f.c.a(r2, r4, r13, r1, r14)     // Catch:{ XmlPullParserException -> 0x009b, IOException -> 0x0092 }
            if (r15 == 0) goto L_0x0090
            if (r14 == 0) goto L_0x008d
            r15.a((android.graphics.Typeface) r14, (android.os.Handler) r0)     // Catch:{ XmlPullParserException -> 0x009b, IOException -> 0x0092 }
            goto L_0x0090
        L_0x008d:
            r15.a((int) r11, (android.os.Handler) r0)     // Catch:{ XmlPullParserException -> 0x009b, IOException -> 0x0092 }
        L_0x0090:
            r0 = r14
            goto L_0x00b5
        L_0x0092:
            r14 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to read xml resource "
            goto L_0x00a3
        L_0x009b:
            r14 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to parse xml resource "
        L_0x00a3:
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.e(r10, r1, r14)
            if (r15 == 0) goto L_0x00b5
        L_0x00b2:
            r15.a((int) r11, (android.os.Handler) r0)
        L_0x00b5:
            if (r0 != 0) goto L_0x00d6
            if (r15 == 0) goto L_0x00ba
            goto L_0x00d6
        L_0x00ba:
            android.content.res.Resources$NotFoundException r14 = new android.content.res.Resources$NotFoundException
            java.lang.String r15 = "Font resource ID #0x"
            java.lang.StringBuilder r15 = b.a.a.a.a.a(r15)
            java.lang.String r13 = java.lang.Integer.toHexString(r13)
            r15.append(r13)
            java.lang.String r13 = " could not be retrieved."
            r15.append(r13)
            java.lang.String r13 = r15.toString()
            r14.<init>(r13)
            throw r14
        L_0x00d6:
            return r0
        L_0x00d7:
            android.content.res.Resources$NotFoundException r14 = new android.content.res.Resources$NotFoundException
            java.lang.String r15 = "Resource \""
            java.lang.StringBuilder r15 = b.a.a.a.a.a(r15)
            java.lang.String r0 = r4.getResourceName(r13)
            r15.append(r0)
            java.lang.String r0 = "\" ("
            r15.append(r0)
            java.lang.String r13 = java.lang.Integer.toHexString(r13)
            r15.append(r13)
            java.lang.String r13 = ") is not a Font: "
            r15.append(r13)
            r15.append(r1)
            java.lang.String r13 = r15.toString()
            r14.<init>(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.x0.a(int, int, a.f.e.b.g):android.graphics.Typeface");
    }

    public boolean a(int i, boolean z) {
        return this.f186b.getBoolean(i, z);
    }

    public int b(int i, int i2) {
        return this.f186b.getDimensionPixelSize(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f186b.getResourceId(r3, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable b(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f186b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f186b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f185a
            android.graphics.drawable.Drawable r3 = a.b.l.a.a.b(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f186b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.x0.b(int):android.graphics.drawable.Drawable");
    }

    public int c(int i, int i2) {
        return this.f186b.getInt(i, i2);
    }

    public Drawable c(int i) {
        int resourceId;
        if (!this.f186b.hasValue(i) || (resourceId = this.f186b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return j.a().a(this.f185a, resourceId, true);
    }

    public int d(int i, int i2) {
        return this.f186b.getLayoutDimension(i, i2);
    }

    public String d(int i) {
        return this.f186b.getString(i);
    }

    public int e(int i, int i2) {
        return this.f186b.getResourceId(i, i2);
    }

    public CharSequence e(int i) {
        return this.f186b.getText(i);
    }

    public boolean f(int i) {
        return this.f186b.hasValue(i);
    }
}
