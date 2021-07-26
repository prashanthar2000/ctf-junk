package a.f.l;

import a.f.k.k;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class a implements View.OnTouchListener {
    public static final int r = ViewConfiguration.getTapTimeout();

    /* renamed from: b  reason: collision with root package name */
    public final C0019a f343b = new C0019a();
    public final Interpolator c = new AccelerateInterpolator();
    public final View d;
    public Runnable e;
    public float[] f = {0.0f, 0.0f};
    public float[] g = {Float.MAX_VALUE, Float.MAX_VALUE};
    public int h;
    public int i;
    public float[] j = {0.0f, 0.0f};
    public float[] k = {0.0f, 0.0f};
    public float[] l = {Float.MAX_VALUE, Float.MAX_VALUE};
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    /* renamed from: a.f.l.a$a  reason: collision with other inner class name */
    public static class C0019a {

        /* renamed from: a  reason: collision with root package name */
        public int f344a;

        /* renamed from: b  reason: collision with root package name */
        public int f345b;
        public float c;
        public float d;
        public long e = Long.MIN_VALUE;
        public long f = 0;
        public int g = 0;
        public int h = 0;
        public long i = -1;
        public float j;
        public int k;

        public final float a(long j2) {
            if (j2 < this.e) {
                return 0.0f;
            }
            long j3 = this.i;
            if (j3 < 0 || j2 < j3) {
                return a.a(((float) (j2 - this.e)) / ((float) this.f344a), 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.j;
            return (a.a(((float) (j2 - j3)) / ((float) this.k), 0.0f, 1.0f) * f2) + (1.0f - f2);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.p) {
                if (aVar.n) {
                    aVar.n = false;
                    C0019a aVar2 = aVar.f343b;
                    if (aVar2 != null) {
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar2.e = currentAnimationTimeMillis;
                        aVar2.i = -1;
                        aVar2.f = currentAnimationTimeMillis;
                        aVar2.j = 0.5f;
                        aVar2.g = 0;
                        aVar2.h = 0;
                    } else {
                        throw null;
                    }
                }
                C0019a aVar3 = a.this.f343b;
                if ((aVar3.i > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar3.i + ((long) aVar3.k)) || !a.this.b()) {
                    a.this.p = false;
                    return;
                }
                a aVar4 = a.this;
                if (aVar4.o) {
                    aVar4.o = false;
                    if (aVar4 != null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        aVar4.d.onTouchEvent(obtain);
                        obtain.recycle();
                    } else {
                        throw null;
                    }
                }
                if (aVar3.f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar3.a(currentAnimationTimeMillis2);
                    aVar3.f = currentAnimationTimeMillis2;
                    float f = ((float) (currentAnimationTimeMillis2 - aVar3.f)) * ((a2 * 4.0f) + (-4.0f * a2 * a2));
                    aVar3.g = (int) (aVar3.c * f);
                    int i = (int) (f * aVar3.d);
                    aVar3.h = i;
                    ((c) a.this).s.scrollListBy(i);
                    k.a(a.this.d, (Runnable) this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    public a(View view) {
        this.d = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.l;
        float f3 = ((float) ((int) ((1575.0f * f2) + 0.5f))) / 1000.0f;
        fArr[0] = f3;
        fArr[1] = f3;
        float[] fArr2 = this.k;
        float f4 = ((float) ((int) ((f2 * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f4;
        fArr2[1] = f4;
        this.h = 1;
        float[] fArr3 = this.g;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.j;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.i = r;
        C0019a aVar = this.f343b;
        aVar.f344a = 500;
        aVar.f345b = 500;
    }

    public static float a(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    public final float a(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.h;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                return f2 >= 0.0f ? 1.0f - (f2 / f3) : (!this.p || this.h != 1) ? 0.0f : 1.0f;
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f
            r0 = r0[r4]
            float[] r1 = r3.g
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = a(r0, r2, r1)
            float r1 = r3.a(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.a(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0025
            android.view.animation.Interpolator r6 = r3.c
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L_0x002f
        L_0x0025:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0038
            android.view.animation.Interpolator r6 = r3.c
            float r5 = r6.getInterpolation(r5)
        L_0x002f:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = a(r5, r6, r0)
            goto L_0x0039
        L_0x0038:
            r5 = r2
        L_0x0039:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x003e
            return r2
        L_0x003e:
            float[] r0 = r3.j
            r0 = r0[r4]
            float[] r1 = r3.k
            r1 = r1[r4]
            float[] r2 = r3.l
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L_0x0053
            float r5 = r5 * r0
            float r4 = a(r5, r1, r4)
            return r4
        L_0x0053:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = a(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.l.a.a(int, float, float, float):float");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b() {
        /*
            r9 = this;
            a.f.l.a$a r0 = r9.f343b
            float r1 = r0.d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0053
            r4 = r9
            a.f.l.c r4 = (a.f.l.c) r4
            android.widget.ListView r4 = r4.s
            int r5 = r4.getCount()
            if (r5 != 0) goto L_0x0023
        L_0x0021:
            r1 = r3
            goto L_0x0051
        L_0x0023:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L_0x0041
            if (r8 < r5) goto L_0x0050
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L_0x0050
            goto L_0x0021
        L_0x0041:
            if (r1 >= 0) goto L_0x0021
            if (r7 > 0) goto L_0x0050
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0050
            goto L_0x0021
        L_0x0050:
            r1 = r2
        L_0x0051:
            if (r1 != 0) goto L_0x0054
        L_0x0053:
            r2 = r3
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.l.a.b():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.q
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x007d
        L_0x0016:
            r5.a()
            goto L_0x007d
        L_0x001a:
            r5.o = r2
            r5.m = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.a(r2, r7, r6, r3)
            a.f.l.a$a r7 = r5.f343b
            r7.c = r0
            r7.d = r6
            boolean r6 = r5.p
            if (r6 != 0) goto L_0x007d
            boolean r6 = r5.b()
            if (r6 == 0) goto L_0x007d
            java.lang.Runnable r6 = r5.e
            if (r6 != 0) goto L_0x0061
            a.f.l.a$b r6 = new a.f.l.a$b
            r6.<init>()
            r5.e = r6
        L_0x0061:
            r5.p = r2
            r5.n = r2
            boolean r6 = r5.m
            if (r6 != 0) goto L_0x0076
            int r6 = r5.i
            if (r6 <= 0) goto L_0x0076
            android.view.View r7 = r5.d
            java.lang.Runnable r0 = r5.e
            long r3 = (long) r6
            a.f.k.k.a((android.view.View) r7, (java.lang.Runnable) r0, (long) r3)
            goto L_0x007b
        L_0x0076:
            java.lang.Runnable r6 = r5.e
            r6.run()
        L_0x007b:
            r5.m = r2
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.l.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void a() {
        int i2 = 0;
        if (this.n) {
            this.p = false;
            return;
        }
        C0019a aVar = this.f343b;
        if (aVar != null) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i3 = (int) (currentAnimationTimeMillis - aVar.e);
            int i4 = aVar.f345b;
            if (i3 > i4) {
                i2 = i4;
            } else if (i3 >= 0) {
                i2 = i3;
            }
            aVar.k = i2;
            aVar.j = aVar.a(currentAnimationTimeMillis);
            aVar.i = currentAnimationTimeMillis;
            return;
        }
        throw null;
    }
}
