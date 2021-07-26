package a.b.m.a;

import a.b.k.o;
import a.b.m.a.d;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;

public class b extends Drawable implements Drawable.Callback {

    /* renamed from: b  reason: collision with root package name */
    public c f50b;
    public Rect c;
    public Drawable d;
    public Drawable e;
    public int f = 255;
    public boolean g;
    public int h = -1;
    public boolean i;
    public Runnable j;
    public long k;
    public long l;
    public C0003b m;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: a.b.m.a.b$b  reason: collision with other inner class name */
    public static class C0003b implements Drawable.Callback {

        /* renamed from: b  reason: collision with root package name */
        public Drawable.Callback f52b;

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f52b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f52b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    public static int a(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }

    public c a() {
        throw null;
    }

    public void a(c cVar) {
        this.f50b = cVar;
        int i2 = this.h;
        if (i2 >= 0) {
            Drawable a2 = cVar.a(i2);
            this.d = a2;
            if (a2 != null) {
                a(a2);
            }
        }
        this.e = null;
    }

    public final void a(Drawable drawable) {
        if (this.m == null) {
            this.m = new C0003b();
        }
        C0003b bVar = this.m;
        bVar.f52b = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f50b.A <= 0 && this.g) {
                drawable.setAlpha(this.f);
            }
            if (this.f50b.E) {
                drawable.setColorFilter(this.f50b.D);
            } else {
                if (this.f50b.H) {
                    drawable.setTintList(this.f50b.F);
                }
                if (this.f50b.I) {
                    drawable.setTintMode(this.f50b.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f50b.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f50b.C);
            Rect rect = this.c;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C0003b bVar2 = this.m;
            Drawable.Callback callback = bVar2.f52b;
            bVar2.f52b = null;
            drawable.setCallback(callback);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0034
            long r9 = r13.k
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0036
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0020
            int r9 = r13.f
            r3.setAlpha(r9)
            goto L_0x0034
        L_0x0020:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            a.b.m.a.b$c r10 = r13.f50b
            int r10 = r10.A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L_0x0037
        L_0x0034:
            r13.k = r7
        L_0x0036:
            r3 = r6
        L_0x0037:
            android.graphics.drawable.Drawable r9 = r13.e
            if (r9 == 0) goto L_0x005d
            long r10 = r13.l
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x005f
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x004c
            r9.setVisible(r6, r6)
            r0 = 0
            r13.e = r0
            goto L_0x005d
        L_0x004c:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            a.b.m.a.b$c r4 = r13.f50b
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0060
        L_0x005d:
            r13.l = r7
        L_0x005f:
            r0 = r3
        L_0x0060:
            if (r14 == 0) goto L_0x006c
            if (r0 == 0) goto L_0x006c
            java.lang.Runnable r14 = r13.j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.m.a.b.a(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r10) {
        /*
            r9 = this;
            int r0 = r9.h
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            a.b.m.a.b$c r0 = r9.f50b
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.e
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.d
            if (r0 == 0) goto L_0x0029
            r9.e = r0
            a.b.m.a.b$c r0 = r9.f50b
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.l = r0
            goto L_0x0035
        L_0x0029:
            r9.e = r4
            r9.l = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.d
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            a.b.m.a.b$c r0 = r9.f50b
            int r1 = r0.h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.a((int) r10)
            r9.d = r0
            r9.h = r10
            if (r0 == 0) goto L_0x005a
            a.b.m.a.b$c r10 = r9.f50b
            int r10 = r10.A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.k = r2
        L_0x0051:
            r9.a((android.graphics.drawable.Drawable) r0)
            goto L_0x005a
        L_0x0055:
            r9.d = r4
            r10 = -1
            r9.h = r10
        L_0x005a:
            long r0 = r9.k
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L_0x0067
            long r1 = r9.l
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r10 = r9.j
            if (r10 != 0) goto L_0x0073
            a.b.m.a.b$a r10 = new a.b.m.a.b$a
            r10.<init>()
            r9.j = r10
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r10)
        L_0x0076:
            r9.a((boolean) r0)
        L_0x0079:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.m.a.b.a(int):boolean");
    }

    public boolean canApplyTheme() {
        return this.f50b.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.f;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f50b.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f50b.a()) {
            return null;
        }
        this.f50b.d = getChangingConfigurations();
        return this.f50b;
    }

    public Drawable getCurrent() {
        return this.d;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        c cVar = this.f50b;
        if (cVar.l) {
            if (!cVar.m) {
                cVar.b();
            }
            return cVar.o;
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        c cVar = this.f50b;
        if (cVar.l) {
            if (!cVar.m) {
                cVar.b();
            }
            return cVar.n;
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        c cVar = this.f50b;
        if (cVar.l) {
            if (!cVar.m) {
                cVar.b();
            }
            return cVar.q;
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        c cVar = this.f50b;
        if (cVar.l) {
            if (!cVar.m) {
                cVar.b();
            }
            return cVar.p;
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.d;
        int i2 = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        c cVar = this.f50b;
        if (cVar.r) {
            return cVar.s;
        }
        cVar.c();
        int i3 = cVar.h;
        Drawable[] drawableArr = cVar.g;
        if (i3 > 0) {
            i2 = drawableArr[0].getOpacity();
        }
        for (int i4 = 1; i4 < i3; i4++) {
            i2 = Drawable.resolveOpacity(i2, drawableArr[i4].getOpacity());
        }
        cVar.s = i2;
        cVar.r = true;
        return i2;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        c cVar = this.f50b;
        Rect rect2 = null;
        boolean z2 = false;
        if (!cVar.i) {
            if (cVar.k != null || cVar.j) {
                rect2 = cVar.k;
            } else {
                cVar.c();
                Rect rect3 = new Rect();
                int i2 = cVar.h;
                Drawable[] drawableArr = cVar.g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3].getPadding(rect3)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i4 = rect3.left;
                        if (i4 > rect2.left) {
                            rect2.left = i4;
                        }
                        int i5 = rect3.top;
                        if (i5 > rect2.top) {
                            rect2.top = i5;
                        }
                        int i6 = rect3.right;
                        if (i6 > rect2.right) {
                            rect2.right = i6;
                        }
                        int i7 = rect3.bottom;
                        if (i7 > rect2.bottom) {
                            rect2.bottom = i7;
                        }
                    }
                }
                cVar.j = true;
                cVar.k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            z = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.d;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f50b.C && getLayoutDirection() == 1) {
            z2 = true;
        }
        if (z2) {
            int i8 = rect.left;
            rect.left = rect.right;
            rect.right = i8;
        }
        return z;
    }

    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f50b;
        if (cVar != null) {
            cVar.r = false;
            cVar.t = false;
        }
        if (drawable == this.d && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f50b.C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.e;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.g) {
                this.d.setAlpha(this.f);
            }
        }
        if (this.l != 0) {
            this.l = 0;
            z = true;
        }
        if (this.k != 0) {
            this.k = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.i && super.mutate() == this) {
            c a2 = a();
            a2.d();
            a(a2);
            this.i = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        c cVar = this.f50b;
        int i3 = this.h;
        int i4 = cVar.h;
        Drawable[] drawableArr = cVar.g;
        boolean z = false;
        for (int i5 = 0; i5 < i4; i5++) {
            if (drawableArr[i5] != null) {
                boolean layoutDirection = drawableArr[i5].setLayoutDirection(i2);
                if (i5 == i3) {
                    z = layoutDirection;
                }
            }
        }
        cVar.z = i2;
        return z;
    }

    public boolean onLevelChange(int i2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable == this.d && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        if (!this.g || this.f != i2) {
            this.g = true;
            this.f = i2;
            Drawable drawable = this.d;
            if (drawable == null) {
                return;
            }
            if (this.k == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        c cVar = this.f50b;
        if (cVar.C != z) {
            cVar.C = z;
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f50b;
        cVar.E = true;
        if (cVar.D != colorFilter) {
            cVar.D = colorFilter;
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        c cVar = this.f50b;
        if (cVar.x != z) {
            cVar.x = z;
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.c;
        if (rect == null) {
            this.c = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setHotspotBounds(i2, i3, i4, i5);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f50b;
        cVar.H = true;
        if (cVar.F != colorStateList) {
            cVar.F = colorStateList;
            o.a(this.d, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f50b;
        cVar.I = true;
        if (cVar.G != mode) {
            cVar.G = mode;
            o.a(this.d, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.d && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    public static abstract class c extends Drawable.ConstantState {
        public int A;
        public int B;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;

        /* renamed from: a  reason: collision with root package name */
        public final b f53a;

        /* renamed from: b  reason: collision with root package name */
        public Resources f54b;
        public int c = 160;
        public int d;
        public int e;
        public SparseArray<Drawable.ConstantState> f;
        public Drawable[] g;
        public int h;
        public boolean i;
        public boolean j;
        public Rect k;
        public boolean l;
        public boolean m;
        public int n;
        public int o;
        public int p;
        public int q;
        public boolean r;
        public int s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public boolean x;
        public boolean y;
        public int z;

        public c(c cVar, b bVar, Resources resources) {
            this.i = false;
            this.l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.f53a = bVar;
            this.f54b = resources != null ? resources : cVar != null ? cVar.f54b : null;
            int a2 = b.a(resources, cVar != null ? cVar.c : 0);
            this.c = a2;
            if (cVar != null) {
                this.d = cVar.d;
                this.e = cVar.e;
                this.v = true;
                this.w = true;
                this.i = cVar.i;
                this.l = cVar.l;
                this.x = cVar.x;
                this.y = cVar.y;
                this.z = cVar.z;
                this.A = cVar.A;
                this.B = cVar.B;
                this.C = cVar.C;
                this.D = cVar.D;
                this.E = cVar.E;
                this.F = cVar.F;
                this.G = cVar.G;
                this.H = cVar.H;
                this.I = cVar.I;
                if (cVar.c == a2) {
                    if (cVar.j) {
                        this.k = new Rect(cVar.k);
                        this.j = true;
                    }
                    if (cVar.m) {
                        this.n = cVar.n;
                        this.o = cVar.o;
                        this.p = cVar.p;
                        this.q = cVar.q;
                        this.m = true;
                    }
                }
                if (cVar.r) {
                    this.s = cVar.s;
                    this.r = true;
                }
                if (cVar.t) {
                    this.u = cVar.u;
                    this.t = true;
                }
                Drawable[] drawableArr = cVar.g;
                this.g = new Drawable[drawableArr.length];
                this.h = cVar.h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f;
                this.f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.h);
                int i2 = this.h;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null) {
                        Drawable.ConstantState constantState = drawableArr[i3].getConstantState();
                        if (constantState != null) {
                            this.f.put(i3, constantState);
                        } else {
                            this.g[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.g = new Drawable[10];
            this.h = 0;
        }

        public final int a(Drawable drawable) {
            int i2 = this.h;
            if (i2 >= this.g.length) {
                int i3 = i2 + 10;
                d.a aVar = (d.a) this;
                Drawable[] drawableArr = new Drawable[i3];
                System.arraycopy(aVar.g, 0, drawableArr, 0, i2);
                aVar.g = drawableArr;
                int[][] iArr = new int[i3][];
                System.arraycopy(aVar.J, 0, iArr, 0, i2);
                aVar.J = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f53a);
            this.g[i2] = drawable;
            this.h++;
            this.e = drawable.getChangingConfigurations() | this.e;
            this.r = false;
            this.t = false;
            this.k = null;
            this.j = false;
            this.m = false;
            this.v = false;
            return i2;
        }

        public final void a(Resources resources) {
            if (resources != null) {
                this.f54b = resources;
                int a2 = b.a(resources, this.c);
                int i2 = this.c;
                this.c = a2;
                if (i2 != a2) {
                    this.m = false;
                    this.j = false;
                }
            }
        }

        public synchronized boolean a() {
            if (this.v) {
                return this.w;
            }
            c();
            this.v = true;
            int i2 = this.h;
            Drawable[] drawableArr = this.g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.w = false;
                    return false;
                }
            }
            this.w = true;
            return true;
        }

        public void b() {
            this.m = true;
            c();
            int i2 = this.h;
            Drawable[] drawableArr = this.g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        public final void c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int keyAt = this.f.keyAt(i2);
                    Drawable[] drawableArr = this.g;
                    Drawable newDrawable = this.f.valueAt(i2).newDrawable(this.f54b);
                    newDrawable.setLayoutDirection(this.z);
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f53a);
                    drawableArr[keyAt] = mutate;
                }
                this.f = null;
            }
        }

        public boolean canApplyTheme() {
            int i2 = this.h;
            Drawable[] drawableArr = this.g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f.get(i3);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        public abstract void d();

        public int getChangingConfigurations() {
            return this.d | this.e;
        }

        public final Drawable a(int i2) {
            int indexOfKey;
            Drawable drawable = this.g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f.valueAt(indexOfKey).newDrawable(this.f54b);
            newDrawable.setLayoutDirection(this.z);
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f53a);
            this.g[i2] = mutate;
            this.f.removeAt(indexOfKey);
            if (this.f.size() == 0) {
                this.f = null;
            }
            return mutate;
        }
    }
}
