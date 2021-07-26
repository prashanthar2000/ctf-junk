package a.b.p;

import a.b.p.j;
import a.d.i;
import a.m.a.a.c;
import a.m.a.a.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

public final class n0 {
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static n0 i;
    public static final c j = new c(6);

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<Context, i<ColorStateList>> f156a;

    /* renamed from: b  reason: collision with root package name */
    public a.d.a<String, d> f157b;
    public i<String> c;
    public final WeakHashMap<Context, a.d.e<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<>(0);
    public TypedValue e;
    public boolean f;
    public e g;

    public static class a implements d {
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return a.b.m.a.a.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    public static class b implements d {
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                a.m.a.a.c cVar = new a.m.a.a.c(context, (c.b) null, (Resources) null);
                cVar.inflate(resources, xmlPullParser, attributeSet, theme);
                return cVar;
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    public static class c extends a.d.f<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }
    }

    public interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface e {
    }

    public static class f implements d {
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return g.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    public final Drawable a(Context context, int i2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable a2 = a(context, j2);
        if (a2 != null) {
            return a2;
        }
        e eVar = this.g;
        LayerDrawable layerDrawable = null;
        if (eVar != null) {
            j.a aVar = (j.a) eVar;
            if (i2 == a.b.e.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{b(context, a.b.e.abc_cab_background_internal_bg), b(context, a.b.e.abc_cab_background_top_mtrl_alpha)});
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j2, (Drawable) layerDrawable);
        }
        return layerDrawable;
    }

    public synchronized void a(e eVar) {
        this.g = eVar;
    }

    public final void a(String str, d dVar) {
        if (this.f157b == null) {
            this.f157b = new a.d.a<>();
        }
        this.f157b.put(str, dVar);
    }

    public final synchronized boolean a(Context context, long j2, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            a.d.e eVar = this.d.get(context);
            if (eVar == null) {
                eVar = new a.d.e();
                this.d.put(context, eVar);
            }
            eVar.c(j2, new WeakReference(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized Drawable b(Context context, int i2) {
        return a(context, i2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = r0.get(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.content.res.ColorStateList c(android.content.Context r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, a.d.i<android.content.res.ColorStateList>> r0 = r3.f156a     // Catch:{ all -> 0x004d }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x004d }
            a.d.i r0 = (a.d.i) r0     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.b(r5, r1)     // Catch:{ all -> 0x004d }
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x004d }
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 != 0) goto L_0x004f
            a.b.p.n0$e r0 = r3.g     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x001d
            goto L_0x0025
        L_0x001d:
            a.b.p.n0$e r0 = r3.g     // Catch:{ all -> 0x004d }
            a.b.p.j$a r0 = (a.b.p.j.a) r0
            android.content.res.ColorStateList r1 = r0.b(r4, r5)     // Catch:{ all -> 0x004d }
        L_0x0025:
            if (r1 == 0) goto L_0x004b
            java.util.WeakHashMap<android.content.Context, a.d.i<android.content.res.ColorStateList>> r0 = r3.f156a     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0032
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x004d }
            r0.<init>()     // Catch:{ all -> 0x004d }
            r3.f156a = r0     // Catch:{ all -> 0x004d }
        L_0x0032:
            java.util.WeakHashMap<android.content.Context, a.d.i<android.content.res.ColorStateList>> r0 = r3.f156a     // Catch:{ all -> 0x004d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x004d }
            a.d.i r0 = (a.d.i) r0     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0048
            a.d.i r0 = new a.d.i     // Catch:{ all -> 0x004d }
            r2 = 10
            r0.<init>(r2)     // Catch:{ all -> 0x004d }
            java.util.WeakHashMap<android.content.Context, a.d.i<android.content.res.ColorStateList>> r2 = r3.f156a     // Catch:{ all -> 0x004d }
            r2.put(r4, r0)     // Catch:{ all -> 0x004d }
        L_0x0048:
            r0.a(r5, r1)     // Catch:{ all -> 0x004d }
        L_0x004b:
            r0 = r1
            goto L_0x004f
        L_0x004d:
            r4 = move-exception
            goto L_0x0051
        L_0x004f:
            monitor-exit(r3)
            return r0
        L_0x0051:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.n0.c(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x007b A[Catch:{ Exception -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1 A[Catch:{ Exception -> 0x00a9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable d(android.content.Context r11, int r12) {
        /*
            r10 = this;
            a.d.a<java.lang.String, a.b.p.n0$d> r0 = r10.f157b
            r1 = 0
            if (r0 == 0) goto L_0x00b9
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b9
            a.d.i<java.lang.String> r0 = r10.c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.b(r12, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x0031
            a.d.a<java.lang.String, a.b.p.n0$d> r3 = r10.f157b
            java.lang.Object r0 = r3.getOrDefault(r0, r1)
            if (r0 != 0) goto L_0x0031
        L_0x0027:
            return r1
        L_0x0028:
            a.d.i r0 = new a.d.i
            r1 = 10
            r0.<init>(r1)
            r10.c = r0
        L_0x0031:
            android.util.TypedValue r0 = r10.e
            if (r0 != 0) goto L_0x003c
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.e = r0
        L_0x003c:
            android.util.TypedValue r0 = r10.e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            int r4 = r0.assetCookie
            long r4 = (long) r4
            r6 = 32
            long r4 = r4 << r6
            int r6 = r0.data
            long r6 = (long) r6
            long r4 = r4 | r6
            android.graphics.drawable.Drawable r6 = r10.a((android.content.Context) r11, (long) r4)
            if (r6 == 0) goto L_0x0057
            return r6
        L_0x0057:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00b1
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00b1
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a9 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a9 }
        L_0x006f:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a9 }
            r9 = 2
            if (r8 == r9) goto L_0x0079
            if (r8 == r3) goto L_0x0079
            goto L_0x006f
        L_0x0079:
            if (r8 != r9) goto L_0x00a1
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a9 }
            a.d.i<java.lang.String> r8 = r10.c     // Catch:{ Exception -> 0x00a9 }
            r8.a(r12, r3)     // Catch:{ Exception -> 0x00a9 }
            a.d.a<java.lang.String, a.b.p.n0$d> r8 = r10.f157b     // Catch:{ Exception -> 0x00a9 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a9 }
            a.b.p.n0$d r3 = (a.b.p.n0.d) r3     // Catch:{ Exception -> 0x00a9 }
            if (r3 == 0) goto L_0x0096
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a9 }
            android.graphics.drawable.Drawable r6 = r3.a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a9 }
        L_0x0096:
            if (r6 == 0) goto L_0x00b1
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a9 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a9 }
            r10.a((android.content.Context) r11, (long) r4, (android.graphics.drawable.Drawable) r6)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00b1
        L_0x00a1:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a9 }
            throw r11     // Catch:{ Exception -> 0x00a9 }
        L_0x00a9:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00b1:
            if (r6 != 0) goto L_0x00b8
            a.d.i<java.lang.String> r11 = r10.c
            r11.a(r12, r2)
        L_0x00b8:
            return r6
        L_0x00b9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.n0.d(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public static synchronized n0 a() {
        n0 n0Var;
        synchronized (n0.class) {
            if (i == null) {
                n0 n0Var2 = new n0();
                i = n0Var2;
                if (Build.VERSION.SDK_INT < 24) {
                    n0Var2.a("vector", (d) new f());
                    n0Var2.a("animated-vector", (d) new b());
                    n0Var2.a("animated-selector", (d) new a());
                }
            }
            n0Var = i;
        }
        return n0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r5 = r0.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable a(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, a.d.e<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.d     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0041 }
            a.d.e r0 = (a.d.e) r0     // Catch:{ all -> 0x0041 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.b(r5, r1)     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0041 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            long[] r4 = r0.c     // Catch:{ all -> 0x0041 }
            int r2 = r0.e     // Catch:{ all -> 0x0041 }
            int r4 = a.d.d.a((long[]) r4, (int) r2, (long) r5)     // Catch:{ all -> 0x0041 }
            if (r4 < 0) goto L_0x003f
            java.lang.Object[] r5 = r0.d     // Catch:{ all -> 0x0041 }
            r6 = r5[r4]     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = a.d.e.f     // Catch:{ all -> 0x0041 }
            if (r6 == r2) goto L_0x003f
            r5[r4] = r2     // Catch:{ all -> 0x0041 }
            r4 = 1
            r0.f210b = r4     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r3)
            return r1
        L_0x0041:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.n0.a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r0 != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.drawable.Drawable a(android.content.Context r5, int r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0006
            goto L_0x002a
        L_0x0006:
            r0 = 1
            r4.f = r0     // Catch:{ all -> 0x0047 }
            int r1 = a.b.n.a.abc_vector_test     // Catch:{ all -> 0x0047 }
            android.graphics.drawable.Drawable r1 = r4.b(r5, r1)     // Catch:{ all -> 0x0047 }
            r2 = 0
            if (r1 == 0) goto L_0x0049
            boolean r3 = r1 instanceof a.m.a.a.g     // Catch:{ all -> 0x0047 }
            if (r3 != 0) goto L_0x0028
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0047 }
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r2
        L_0x0028:
            if (r0 == 0) goto L_0x0049
        L_0x002a:
            android.graphics.drawable.Drawable r0 = r4.d(r5, r6)     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0034
            android.graphics.drawable.Drawable r0 = r4.a((android.content.Context) r5, (int) r6)     // Catch:{ all -> 0x0047 }
        L_0x0034:
            if (r0 != 0) goto L_0x003a
            android.graphics.drawable.Drawable r0 = a.f.e.a.a(r5, r6)     // Catch:{ all -> 0x0047 }
        L_0x003a:
            if (r0 == 0) goto L_0x0040
            android.graphics.drawable.Drawable r0 = r4.a(r5, r6, r7, r0)     // Catch:{ all -> 0x0047 }
        L_0x0040:
            if (r0 == 0) goto L_0x0045
            a.b.p.e0.b(r0)     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r4)
            return r0
        L_0x0047:
            r5 = move-exception
            goto L_0x0053
        L_0x0049:
            r4.f = r2     // Catch:{ all -> 0x0047 }
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0047 }
            java.lang.String r6 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r5.<init>(r6)     // Catch:{ all -> 0x0047 }
            throw r5     // Catch:{ all -> 0x0047 }
        L_0x0053:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.n0.a(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public static synchronized PorterDuffColorFilter a(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (n0.class) {
            c cVar = j;
            if (cVar != null) {
                int i3 = (i2 + 31) * 31;
                porterDuffColorFilter = (PorterDuffColorFilter) cVar.a(Integer.valueOf(mode.hashCode() + i3));
                if (porterDuffColorFilter == null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                    c cVar2 = j;
                    if (cVar2 != null) {
                        PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) cVar2.a(Integer.valueOf(mode.hashCode() + i3), porterDuffColorFilter);
                    } else {
                        throw null;
                    }
                }
            } else {
                throw null;
            }
        }
        return porterDuffColorFilter;
    }

    public synchronized void a(Context context) {
        a.d.e eVar = this.d.get(context);
        if (eVar != null) {
            int i2 = eVar.e;
            Object[] objArr = eVar.d;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = null;
            }
            eVar.e = 0;
            eVar.f210b = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable a(android.content.Context r10, int r11, boolean r12, android.graphics.drawable.Drawable r13) {
        /*
            r9 = this;
            android.content.res.ColorStateList r0 = r9.c(r10, r11)
            r1 = 0
            if (r0 == 0) goto L_0x0028
            boolean r10 = a.b.p.e0.a(r13)
            if (r10 == 0) goto L_0x0011
            android.graphics.drawable.Drawable r13 = r13.mutate()
        L_0x0011:
            r13.setTintList(r0)
            a.b.p.n0$e r10 = r9.g
            if (r10 != 0) goto L_0x0019
            goto L_0x0021
        L_0x0019:
            a.b.p.j$a r10 = (a.b.p.j.a) r10
            int r10 = a.b.e.abc_switch_thumb_material
            if (r11 != r10) goto L_0x0021
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
        L_0x0021:
            if (r1 == 0) goto L_0x00a3
            r13.setTintMode(r1)
            goto L_0x00a3
        L_0x0028:
            a.b.p.n0$e r0 = r9.g
            if (r0 == 0) goto L_0x009a
            a.b.p.j$a r0 = (a.b.p.j.a) r0
            if (r0 == 0) goto L_0x0099
            int r2 = a.b.e.abc_seekbar_track_material
            r3 = 1
            r4 = 16908301(0x102000d, float:2.3877265E-38)
            r5 = 16908303(0x102000f, float:2.387727E-38)
            r6 = 16908288(0x1020000, float:2.387723E-38)
            if (r11 != r2) goto L_0x006e
            r2 = r13
            android.graphics.drawable.LayerDrawable r2 = (android.graphics.drawable.LayerDrawable) r2
            android.graphics.drawable.Drawable r6 = r2.findDrawableByLayerId(r6)
            int r7 = a.b.a.colorControlNormal
            int r7 = a.b.p.s0.b(r10, r7)
            android.graphics.PorterDuff$Mode r8 = a.b.p.j.f140b
            r0.a(r6, r7, r8)
            android.graphics.drawable.Drawable r5 = r2.findDrawableByLayerId(r5)
            int r6 = a.b.a.colorControlNormal
        L_0x0055:
            int r6 = a.b.p.s0.b(r10, r6)
            android.graphics.PorterDuff$Mode r7 = a.b.p.j.f140b
            r0.a(r5, r6, r7)
            android.graphics.drawable.Drawable r2 = r2.findDrawableByLayerId(r4)
            int r4 = a.b.a.colorControlActivated
            int r4 = a.b.p.s0.b(r10, r4)
            android.graphics.PorterDuff$Mode r5 = a.b.p.j.f140b
            r0.a(r2, r4, r5)
            goto L_0x0096
        L_0x006e:
            int r2 = a.b.e.abc_ratingbar_material
            if (r11 == r2) goto L_0x007d
            int r2 = a.b.e.abc_ratingbar_indicator_material
            if (r11 == r2) goto L_0x007d
            int r2 = a.b.e.abc_ratingbar_small_material
            if (r11 != r2) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r3 = 0
            goto L_0x0096
        L_0x007d:
            r2 = r13
            android.graphics.drawable.LayerDrawable r2 = (android.graphics.drawable.LayerDrawable) r2
            android.graphics.drawable.Drawable r6 = r2.findDrawableByLayerId(r6)
            int r7 = a.b.a.colorControlNormal
            int r7 = a.b.p.s0.a(r10, r7)
            android.graphics.PorterDuff$Mode r8 = a.b.p.j.f140b
            r0.a(r6, r7, r8)
            android.graphics.drawable.Drawable r5 = r2.findDrawableByLayerId(r5)
            int r6 = a.b.a.colorControlActivated
            goto L_0x0055
        L_0x0096:
            if (r3 == 0) goto L_0x009a
            goto L_0x00a3
        L_0x0099:
            throw r1
        L_0x009a:
            boolean r10 = r9.a((android.content.Context) r10, (int) r11, (android.graphics.drawable.Drawable) r13)
            if (r10 != 0) goto L_0x00a3
            if (r12 == 0) goto L_0x00a3
            r13 = r1
        L_0x00a3:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.n0.a(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }

    public static void a(Drawable drawable, v0 v0Var, int[] iArr) {
        if (!e0.a(drawable) || drawable.mutate() == drawable) {
            if (v0Var.d || v0Var.c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = v0Var.d ? v0Var.f173a : null;
                PorterDuff.Mode mode = v0Var.c ? v0Var.f174b : h;
                if (!(colorStateList == null || mode == null)) {
                    porterDuffColorFilter = a(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            a.b.p.n0$e r0 = r7.g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x006f
            a.b.p.j$a r0 = (a.b.p.j.a) r0
            if (r0 == 0) goto L_0x006d
            android.graphics.PorterDuff$Mode r3 = a.b.p.j.f140b
            int[] r4 = r0.f142a
            boolean r4 = r0.a((int[]) r4, (int) r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L_0x001b
            int r5 = a.b.a.colorControlNormal
            goto L_0x0044
        L_0x001b:
            int[] r4 = r0.c
            boolean r4 = r0.a((int[]) r4, (int) r9)
            if (r4 == 0) goto L_0x0026
            int r5 = a.b.a.colorControlActivated
            goto L_0x0044
        L_0x0026:
            int[] r4 = r0.d
            boolean r0 = r0.a((int[]) r4, (int) r9)
            if (r0 == 0) goto L_0x0031
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0044
        L_0x0031:
            int r0 = a.b.e.abc_list_divider_mtrl_alpha
            if (r9 != r0) goto L_0x0040
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L_0x0046
        L_0x0040:
            int r0 = a.b.e.abc_dialog_material_background
            if (r9 != r0) goto L_0x0048
        L_0x0044:
            r9 = r5
            r0 = r6
        L_0x0046:
            r4 = r1
            goto L_0x004b
        L_0x0048:
            r9 = r2
            r4 = r9
            r0 = r6
        L_0x004b:
            if (r4 == 0) goto L_0x0069
            boolean r4 = a.b.p.e0.a(r10)
            if (r4 == 0) goto L_0x0057
            android.graphics.drawable.Drawable r10 = r10.mutate()
        L_0x0057:
            int r8 = a.b.p.s0.b(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = a.b.p.j.a((int) r8, (android.graphics.PorterDuff.Mode) r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L_0x0067
            r10.setAlpha(r0)
        L_0x0067:
            r8 = r1
            goto L_0x006a
        L_0x0069:
            r8 = r2
        L_0x006a:
            if (r8 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006d:
            r8 = 0
            throw r8
        L_0x006f:
            r1 = r2
        L_0x0070:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.n0.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
