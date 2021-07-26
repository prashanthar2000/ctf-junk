package a.b.m.a;

import a.b.m.a.b;
import a.b.m.a.d;
import a.d.i;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

@SuppressLint({"RestrictedAPI"})
public class a extends d {
    public c p;
    public g q;
    public int r;
    public int s;
    public boolean t;

    public static class b extends g {

        /* renamed from: a  reason: collision with root package name */
        public final Animatable f44a;

        public b(Animatable animatable) {
            super((C0002a) null);
            this.f44a = animatable;
        }

        public void c() {
            this.f44a.start();
        }

        public void d() {
            this.f44a.stop();
        }
    }

    public static class c extends d.a {
        public a.d.e<Long> K;
        public i<Integer> L;

        public c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            i<Integer> iVar;
            if (cVar != null) {
                this.K = cVar.K;
                iVar = cVar.L;
            } else {
                this.K = new a.d.e<>();
                iVar = new i<>(10);
            }
            this.L = iVar;
        }

        public static long a(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        public int a(int i, int i2, Drawable drawable, boolean z) {
            int a2 = super.a(drawable);
            long a3 = a(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a2;
            this.K.a(a3, Long.valueOf(j2 | j));
            if (z) {
                this.K.a(a(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a2;
        }

        public int b(int i) {
            if (i < 0) {
                return 0;
            }
            return this.L.b(i, 0).intValue();
        }

        public int b(int[] iArr) {
            int a2 = super.a(iArr);
            return a2 >= 0 ? a2 : super.a(StateSet.WILD_CARD);
        }

        public void d() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        public Drawable newDrawable() {
            return new a(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    public static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        public final a.m.a.a.c f45a;

        public d(a.m.a.a.c cVar) {
            super((C0002a) null);
            this.f45a = cVar;
        }

        public void c() {
            this.f45a.start();
        }

        public void d() {
            this.f45a.stop();
        }
    }

    public static class e extends g {

        /* renamed from: a  reason: collision with root package name */
        public final ObjectAnimator f46a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f47b;

        public e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super((C0002a) null);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            ofInt.setAutoCancel(true);
            ofInt.setDuration((long) fVar.c);
            ofInt.setInterpolator(fVar);
            this.f47b = z2;
            this.f46a = ofInt;
        }

        public boolean a() {
            return this.f47b;
        }

        public void b() {
            this.f46a.reverse();
        }

        public void c() {
            this.f46a.start();
        }

        public void d() {
            this.f46a.cancel();
        }
    }

    public static class f implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        public int[] f48a;

        /* renamed from: b  reason: collision with root package name */
        public int f49b;
        public int c;

        public f(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f49b = numberOfFrames;
            int[] iArr = this.f48a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f48a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f48a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.c = i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.c)) + 0.5f);
            int i2 = this.f49b;
            int[] iArr = this.f48a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.c) : 0.0f);
        }
    }

    public static abstract class g {
        public /* synthetic */ g(C0002a aVar) {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    static {
        Class<a> cls = a.class;
    }

    public a() {
        this((c) null, (Resources) null);
    }

    public a(c cVar, Resources resources) {
        super((d.a) null);
        this.r = -1;
        this.s = -1;
        c cVar2 = new c(cVar, this, resources);
        super.a(cVar2);
        this.p = cVar2;
        onStateChange(getState());
        jumpToCurrentState();
    }

    public b.c a() {
        return new c(this.p, this, (Resources) null);
    }

    public void a(b.c cVar) {
        super.a(cVar);
        if (cVar instanceof c) {
            this.p = (c) cVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.q;
        if (gVar != null) {
            gVar.d();
            this.q = null;
            a(this.r);
            this.r = -1;
            this.s = -1;
        }
    }

    public Drawable mutate() {
        if (!this.t) {
            super.mutate();
            if (this == this) {
                this.p.d();
                this.t = true;
            }
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e1, code lost:
        if (a(r0) == false) goto L_0x00e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStateChange(int[] r15) {
        /*
            r14 = this;
            a.b.m.a.a$c r0 = r14.p
            int r0 = r0.b((int[]) r15)
            int r1 = r14.h
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x00e4
            a.b.m.a.a$g r4 = r14.q
            if (r4 == 0) goto L_0x0030
            int r1 = r14.r
            if (r0 != r1) goto L_0x0017
        L_0x0014:
            r1 = r2
            goto L_0x00db
        L_0x0017:
            int r1 = r14.s
            if (r0 != r1) goto L_0x002b
            boolean r1 = r4.a()
            if (r1 == 0) goto L_0x002b
            r4.b()
            int r1 = r14.s
            r14.r = r1
            r14.s = r0
            goto L_0x0014
        L_0x002b:
            int r1 = r14.r
            r4.d()
        L_0x0030:
            r4 = 0
            r14.q = r4
            r4 = -1
            r14.s = r4
            r14.r = r4
            a.b.m.a.a$c r4 = r14.p
            int r5 = r4.b((int) r1)
            int r6 = r4.b((int) r0)
            if (r6 == 0) goto L_0x00da
            if (r5 != 0) goto L_0x0048
            goto L_0x00da
        L_0x0048:
            long r7 = a.b.m.a.a.c.a(r5, r6)
            a.d.e<java.lang.Long> r9 = r4.K
            r10 = -1
            java.lang.Long r12 = java.lang.Long.valueOf(r10)
            java.lang.Object r7 = r9.b(r7, r12)
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            int r7 = (int) r7
            if (r7 >= 0) goto L_0x0063
            goto L_0x00da
        L_0x0063:
            long r8 = a.b.m.a.a.c.a(r5, r6)
            a.d.e<java.lang.Long> r12 = r4.K
            java.lang.Long r13 = java.lang.Long.valueOf(r10)
            java.lang.Object r8 = r12.b(r8, r13)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            r12 = 8589934592(0x200000000, double:4.243991582E-314)
            long r8 = r8 & r12
            r12 = 0
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 == 0) goto L_0x0085
            r8 = r2
            goto L_0x0086
        L_0x0085:
            r8 = r3
        L_0x0086:
            r14.a((int) r7)
            android.graphics.drawable.Drawable r7 = r14.d
            boolean r9 = r7 instanceof android.graphics.drawable.AnimationDrawable
            if (r9 == 0) goto L_0x00b8
            long r5 = a.b.m.a.a.c.a(r5, r6)
            a.d.e<java.lang.Long> r4 = r4.K
            java.lang.Long r9 = java.lang.Long.valueOf(r10)
            java.lang.Object r4 = r4.b(r5, r9)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r9 = 4294967296(0x100000000, double:2.121995791E-314)
            long r4 = r4 & r9
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x00af
            r4 = r2
            goto L_0x00b0
        L_0x00af:
            r4 = r3
        L_0x00b0:
            a.b.m.a.a$e r5 = new a.b.m.a.a$e
            android.graphics.drawable.AnimationDrawable r7 = (android.graphics.drawable.AnimationDrawable) r7
            r5.<init>(r7, r4, r8)
            goto L_0x00cf
        L_0x00b8:
            boolean r4 = r7 instanceof a.m.a.a.c
            if (r4 == 0) goto L_0x00c4
            a.b.m.a.a$d r5 = new a.b.m.a.a$d
            a.m.a.a.c r7 = (a.m.a.a.c) r7
            r5.<init>(r7)
            goto L_0x00cf
        L_0x00c4:
            boolean r4 = r7 instanceof android.graphics.drawable.Animatable
            if (r4 == 0) goto L_0x00da
            a.b.m.a.a$b r5 = new a.b.m.a.a$b
            android.graphics.drawable.Animatable r7 = (android.graphics.drawable.Animatable) r7
            r5.<init>(r7)
        L_0x00cf:
            r5.c()
            r14.q = r5
            r14.s = r1
            r14.r = r0
            goto L_0x0014
        L_0x00da:
            r1 = r3
        L_0x00db:
            if (r1 != 0) goto L_0x00e5
            boolean r0 = r14.a((int) r0)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00e5
        L_0x00e4:
            r2 = r3
        L_0x00e5:
            android.graphics.drawable.Drawable r0 = r14.d
            if (r0 == 0) goto L_0x00ee
            boolean r15 = r0.setState(r15)
            r2 = r2 | r15
        L_0x00ee:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.m.a.a.onStateChange(int[]):boolean");
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.q != null && (visible || z2)) {
            if (z) {
                this.q.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    /* renamed from: a  reason: collision with other method in class */
    public d.a m0a() {
        return new c(this.p, this, (Resources) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d3, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(b.a.a.a.a.a(r2, new java.lang.StringBuilder(), ": <transition> tag requires 'fromId' & 'toId' attributes"));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static a.b.m.a.a a(android.content.Context r17, android.content.res.Resources r18, org.xmlpull.v1.XmlPullParser r19, android.util.AttributeSet r20, android.content.res.Resources.Theme r21) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.String r5 = r19.getName()
            java.lang.String r6 = "animated-selector"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x01ef
            a.b.m.a.a r5 = new a.b.m.a.a
            r6 = 0
            r5.<init>(r6, r6)
            int[] r7 = a.b.n.b.AnimatedStateListDrawableCompat
            android.content.res.TypedArray r7 = a.b.k.o.a((android.content.res.Resources) r1, (android.content.res.Resources.Theme) r4, (android.util.AttributeSet) r3, (int[]) r7)
            int r8 = a.b.n.b.AnimatedStateListDrawableCompat_android_visible
            r9 = 1
            boolean r8 = r7.getBoolean(r8, r9)
            r5.setVisible(r8, r9)
            a.b.m.a.a$c r8 = r5.p
            int r10 = r8.d
            int r11 = r7.getChangingConfigurations()
            r10 = r10 | r11
            r8.d = r10
            int r10 = a.b.n.b.AnimatedStateListDrawableCompat_android_variablePadding
            boolean r11 = r8.i
            boolean r10 = r7.getBoolean(r10, r11)
            r8.i = r10
            int r10 = a.b.n.b.AnimatedStateListDrawableCompat_android_constantSize
            boolean r11 = r8.l
            boolean r10 = r7.getBoolean(r10, r11)
            r8.l = r10
            int r10 = a.b.n.b.AnimatedStateListDrawableCompat_android_enterFadeDuration
            int r11 = r8.A
            int r10 = r7.getInt(r10, r11)
            r8.A = r10
            int r10 = a.b.n.b.AnimatedStateListDrawableCompat_android_exitFadeDuration
            int r11 = r8.B
            int r10 = r7.getInt(r10, r11)
            r8.B = r10
            int r10 = a.b.n.b.AnimatedStateListDrawableCompat_android_dither
            boolean r8 = r8.x
            boolean r8 = r7.getBoolean(r10, r8)
            r5.setDither(r8)
            a.b.m.a.b$c r8 = r5.f50b
            r8.a((android.content.res.Resources) r1)
            r7.recycle()
            int r7 = r19.getDepth()
            int r7 = r7 + r9
        L_0x0077:
            int r8 = r19.next()
            if (r8 == r9) goto L_0x01e7
            int r10 = r19.getDepth()
            if (r10 >= r7) goto L_0x0086
            r11 = 3
            if (r8 == r11) goto L_0x01e7
        L_0x0086:
            r11 = 2
            if (r8 == r11) goto L_0x008a
            goto L_0x0077
        L_0x008a:
            if (r10 <= r7) goto L_0x008d
            goto L_0x0077
        L_0x008d:
            java.lang.String r8 = r19.getName()
            java.lang.String r9 = "item"
            boolean r8 = r8.equals(r9)
            r10 = -1
            r11 = 0
            if (r8 == 0) goto L_0x0142
            int[] r8 = a.b.n.b.AnimatedStateListDrawableItem
            android.content.res.TypedArray r8 = a.b.k.o.a((android.content.res.Resources) r1, (android.content.res.Resources.Theme) r4, (android.util.AttributeSet) r3, (int[]) r8)
            int r12 = a.b.n.b.AnimatedStateListDrawableItem_android_id
            int r12 = r8.getResourceId(r12, r11)
            int r13 = a.b.n.b.AnimatedStateListDrawableItem_android_drawable
            int r10 = r8.getResourceId(r13, r10)
            if (r10 <= 0) goto L_0x00b7
            a.b.p.n0 r6 = a.b.p.n0.a()
            android.graphics.drawable.Drawable r6 = r6.b(r0, r10)
        L_0x00b7:
            r8.recycle()
            int r8 = r20.getAttributeCount()
            int[] r10 = new int[r8]
            r13 = r11
            r14 = r13
        L_0x00c2:
            if (r13 >= r8) goto L_0x00e4
            int r15 = r3.getAttributeNameResource(r13)
            if (r15 == 0) goto L_0x00e1
            r9 = 16842960(0x10100d0, float:2.369414E-38)
            if (r15 == r9) goto L_0x00e1
            r9 = 16843161(0x1010199, float:2.3694704E-38)
            if (r15 == r9) goto L_0x00e1
            int r9 = r14 + 1
            boolean r16 = r3.getAttributeBooleanValue(r13, r11)
            if (r16 == 0) goto L_0x00dd
            goto L_0x00de
        L_0x00dd:
            int r15 = -r15
        L_0x00de:
            r10[r14] = r15
            r14 = r9
        L_0x00e1:
            int r13 = r13 + 1
            goto L_0x00c2
        L_0x00e4:
            int[] r8 = android.util.StateSet.trimStateSet(r10, r14)
            java.lang.String r9 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r6 != 0) goto L_0x011c
        L_0x00ec:
            int r6 = r19.next()
            r10 = 4
            if (r6 != r10) goto L_0x00f4
            goto L_0x00ec
        L_0x00f4:
            r10 = 2
            if (r6 != r10) goto L_0x010d
            java.lang.String r6 = r19.getName()
            java.lang.String r10 = "vector"
            boolean r6 = r6.equals(r10)
            if (r6 == 0) goto L_0x0108
            a.m.a.a.g r6 = a.m.a.a.g.createFromXmlInner(r18, r19, r20, r21)
            goto L_0x011c
        L_0x0108:
            android.graphics.drawable.Drawable r6 = android.graphics.drawable.Drawable.createFromXmlInner(r18, r19, r20, r21)
            goto L_0x011c
        L_0x010d:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = b.a.a.a.a.a(r2, r1, r9)
            r0.<init>(r1)
            throw r0
        L_0x011c:
            if (r6 == 0) goto L_0x0133
            a.b.m.a.a$c r9 = r5.p
            int r6 = r9.a((android.graphics.drawable.Drawable) r6)
            int[][] r10 = r9.J
            r10[r6] = r8
            a.d.i<java.lang.Integer> r8 = r9.L
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r8.c(r6, r9)
            goto L_0x01e3
        L_0x0133:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = b.a.a.a.a.a(r2, r1, r9)
            r0.<init>(r1)
            throw r0
        L_0x0142:
            java.lang.String r6 = r19.getName()
            java.lang.String r8 = "transition"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x01e3
            int[] r6 = a.b.n.b.AnimatedStateListDrawableTransition
            android.content.res.TypedArray r6 = a.b.k.o.a((android.content.res.Resources) r1, (android.content.res.Resources.Theme) r4, (android.util.AttributeSet) r3, (int[]) r6)
            int r8 = a.b.n.b.AnimatedStateListDrawableTransition_android_fromId
            int r8 = r6.getResourceId(r8, r10)
            int r9 = a.b.n.b.AnimatedStateListDrawableTransition_android_toId
            int r9 = r6.getResourceId(r9, r10)
            int r12 = a.b.n.b.AnimatedStateListDrawableTransition_android_drawable
            int r12 = r6.getResourceId(r12, r10)
            if (r12 <= 0) goto L_0x0171
            a.b.p.n0 r13 = a.b.p.n0.a()
            android.graphics.drawable.Drawable r12 = r13.b(r0, r12)
            goto L_0x0172
        L_0x0171:
            r12 = 0
        L_0x0172:
            int r13 = a.b.n.b.AnimatedStateListDrawableTransition_android_reversible
            boolean r11 = r6.getBoolean(r13, r11)
            r6.recycle()
            java.lang.String r6 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r12 != 0) goto L_0x01b5
        L_0x017f:
            int r12 = r19.next()
            r13 = 4
            if (r12 != r13) goto L_0x0187
            goto L_0x017f
        L_0x0187:
            r13 = 2
            if (r12 != r13) goto L_0x01a6
            java.lang.String r12 = r19.getName()
            java.lang.String r13 = "animated-vector"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x01a0
            a.m.a.a.c r12 = new a.m.a.a.c
            r13 = 0
            r12.<init>(r0, r13, r13)
            r12.inflate(r1, r2, r3, r4)
            goto L_0x01b6
        L_0x01a0:
            r13 = 0
            android.graphics.drawable.Drawable r12 = android.graphics.drawable.Drawable.createFromXmlInner(r18, r19, r20, r21)
            goto L_0x01b6
        L_0x01a6:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = b.a.a.a.a.a(r2, r1, r6)
            r0.<init>(r1)
            throw r0
        L_0x01b5:
            r13 = 0
        L_0x01b6:
            if (r12 == 0) goto L_0x01d4
            if (r8 == r10) goto L_0x01c3
            if (r9 == r10) goto L_0x01c3
            a.b.m.a.a$c r6 = r5.p
            r6.a(r8, r9, r12, r11)
            r6 = r13
            goto L_0x01e4
        L_0x01c3:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            java.lang.String r1 = b.a.a.a.a.a(r2, r1, r3)
            r0.<init>(r1)
            throw r0
        L_0x01d4:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = b.a.a.a.a.a(r2, r1, r6)
            r0.<init>(r1)
            throw r0
        L_0x01e3:
            r6 = 0
        L_0x01e4:
            r9 = 1
            goto L_0x0077
        L_0x01e7:
            int[] r0 = r5.getState()
            r5.onStateChange(r0)
            return r5
        L_0x01ef:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r19.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid animated-selector tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.m.a.a.a(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):a.b.m.a.a");
    }
}
