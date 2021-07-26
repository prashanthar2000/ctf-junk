package a.m.a.a;

import a.b.k.o;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class c extends f implements b {
    public b c;
    public Context d;
    public ArgbEvaluator e;
    public final Drawable.Callback f;

    public class a implements Drawable.Callback {
        public a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            c.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    public static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f428a;

        /* renamed from: b  reason: collision with root package name */
        public g f429b;
        public AnimatorSet c;
        public ArrayList<Animator> d;
        public a.d.a<Animator, String> e;

        public b(b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f428a = bVar.f428a;
                g gVar = bVar.f429b;
                if (gVar != null) {
                    Drawable.ConstantState constantState = gVar.getConstantState();
                    g gVar2 = (g) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    this.f429b = gVar2;
                    gVar2.mutate();
                    this.f429b = gVar2;
                    gVar2.setCallback(callback);
                    this.f429b.setBounds(bVar.f429b.getBounds());
                    this.f429b.g = false;
                }
                ArrayList<Animator> arrayList = bVar.d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.d = new ArrayList<>(size);
                    this.e = new a.d.a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.d.get(i);
                        Animator clone = animator.clone();
                        String orDefault = bVar.e.getOrDefault(animator, null);
                        clone.setTarget(this.f429b.c.f441b.p.getOrDefault(orDefault, null));
                        this.d.add(clone);
                        this.e.put(clone, orDefault);
                    }
                    if (this.c == null) {
                        this.c = new AnimatorSet();
                    }
                    this.c.playTogether(this.d);
                }
            }
        }

        public int getChangingConfigurations() {
            return this.f428a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public c() {
        this((Context) null, (b) null, (Resources) null);
    }

    public c(Context context, b bVar, Resources resources) {
        this.e = null;
        this.f = new a();
        this.d = context;
        if (bVar != null) {
            this.c = bVar;
        } else {
            this.c = new b(bVar, this.f, resources);
        }
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.c.f429b.draw(canvas);
        if (this.c.c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.c.f429b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f433b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.c.f428a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.c.f429b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f433b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0025c(this.f433b.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f433b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.c.f429b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f433b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.c.f429b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f433b;
        return drawable != null ? drawable.getOpacity() : this.c.f429b.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00eb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ec, code lost:
        r7 = "Can't load animation resource ID #0x";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f1, code lost:
        r7 = "Can't load animation resource ID #0x";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e9 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:32:0x0093] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = r24
            r3 = r25
            android.graphics.drawable.Drawable r4 = r1.f433b
            r5 = r23
            if (r4 == 0) goto L_0x0012
            r4.inflate(r0, r5, r2, r3)
            return
        L_0x0012:
            int r4 = r23.getEventType()
            int r6 = r23.getDepth()
            r7 = 1
            int r6 = r6 + r7
        L_0x001c:
            if (r4 == r7) goto L_0x0150
            int r8 = r23.getDepth()
            if (r8 >= r6) goto L_0x0027
            r8 = 3
            if (r4 == r8) goto L_0x0150
        L_0x0027:
            r8 = 2
            if (r4 != r8) goto L_0x0149
            java.lang.String r4 = r23.getName()
            java.lang.String r8 = "animated-vector"
            boolean r8 = r8.equals(r4)
            r9 = 0
            r10 = 0
            if (r8 == 0) goto L_0x005e
            int[] r4 = a.m.a.a.a.e
            android.content.res.TypedArray r4 = a.b.k.o.a((android.content.res.Resources) r0, (android.content.res.Resources.Theme) r3, (android.util.AttributeSet) r2, (int[]) r4)
            int r8 = r4.getResourceId(r10, r10)
            if (r8 == 0) goto L_0x0146
            a.m.a.a.g r8 = a.m.a.a.g.a(r0, r8, r3)
            r8.g = r10
            android.graphics.drawable.Drawable$Callback r10 = r1.f
            r8.setCallback(r10)
            a.m.a.a.c$b r10 = r1.c
            a.m.a.a.g r10 = r10.f429b
            if (r10 == 0) goto L_0x0058
            r10.setCallback(r9)
        L_0x0058:
            a.m.a.a.c$b r9 = r1.c
            r9.f429b = r8
            goto L_0x0146
        L_0x005e:
            java.lang.String r8 = "target"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x0149
            int[] r4 = a.m.a.a.a.f
            android.content.res.TypedArray r4 = r0.obtainAttributes(r2, r4)
            java.lang.String r8 = r4.getString(r10)
            int r10 = r4.getResourceId(r7, r10)
            if (r10 == 0) goto L_0x0146
            android.content.Context r11 = r1.d
            if (r11 == 0) goto L_0x013b
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 24
            if (r12 < r13) goto L_0x0085
            android.animation.Animator r10 = android.animation.AnimatorInflater.loadAnimator(r11, r10)
            goto L_0x00af
        L_0x0085:
            android.content.res.Resources r12 = r11.getResources()
            android.content.res.Resources$Theme r13 = r11.getTheme()
            java.lang.String r15 = "Can't load animation resource ID #0x"
            android.content.res.XmlResourceParser r19 = r12.getAnimation(r10)     // Catch:{ XmlPullParserException -> 0x0115, IOException -> 0x00f7 }
            android.util.AttributeSet r16 = android.util.Xml.asAttributeSet(r19)     // Catch:{ XmlPullParserException -> 0x00f0, IOException -> 0x00eb, all -> 0x00e9 }
            r17 = 0
            r18 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r14 = r19
            r7 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r20
            android.animation.Animator r10 = a.b.k.o.a(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e5, all -> 0x00e9 }
            r19.close()
        L_0x00af:
            a.m.a.a.c$b r7 = r1.c
            a.m.a.a.g r7 = r7.f429b
            a.m.a.a.g$h r7 = r7.c
            a.m.a.a.g$g r7 = r7.f441b
            a.d.a<java.lang.String, java.lang.Object> r7 = r7.p
            java.lang.Object r7 = r7.getOrDefault(r8, r9)
            r10.setTarget(r7)
            a.m.a.a.c$b r7 = r1.c
            java.util.ArrayList<android.animation.Animator> r9 = r7.d
            if (r9 != 0) goto L_0x00d6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r7.d = r9
            a.m.a.a.c$b r7 = r1.c
            a.d.a r9 = new a.d.a
            r9.<init>()
            r7.e = r9
        L_0x00d6:
            a.m.a.a.c$b r7 = r1.c
            java.util.ArrayList<android.animation.Animator> r7 = r7.d
            r7.add(r10)
            a.m.a.a.c$b r7 = r1.c
            a.d.a<android.animation.Animator, java.lang.String> r7 = r7.e
            r7.put(r10, r8)
            goto L_0x0146
        L_0x00e5:
            r0 = move-exception
            goto L_0x00ed
        L_0x00e7:
            r0 = move-exception
            goto L_0x00f2
        L_0x00e9:
            r0 = move-exception
            goto L_0x0135
        L_0x00eb:
            r0 = move-exception
            r7 = r15
        L_0x00ed:
            r9 = r19
            goto L_0x00f9
        L_0x00f0:
            r0 = move-exception
            r7 = r15
        L_0x00f2:
            r9 = r19
            goto L_0x0117
        L_0x00f5:
            r0 = move-exception
            goto L_0x0133
        L_0x00f7:
            r0 = move-exception
            r7 = r15
        L_0x00f9:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x00f5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r3.<init>()     // Catch:{ all -> 0x00f5 }
            r3.append(r7)     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = java.lang.Integer.toHexString(r10)     // Catch:{ all -> 0x00f5 }
            r3.append(r4)     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00f5 }
            r2.<init>(r3)     // Catch:{ all -> 0x00f5 }
            r2.initCause(r0)     // Catch:{ all -> 0x00f5 }
            throw r2     // Catch:{ all -> 0x00f5 }
        L_0x0115:
            r0 = move-exception
            r7 = r15
        L_0x0117:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x00f5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r3.<init>()     // Catch:{ all -> 0x00f5 }
            r3.append(r7)     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = java.lang.Integer.toHexString(r10)     // Catch:{ all -> 0x00f5 }
            r3.append(r4)     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00f5 }
            r2.<init>(r3)     // Catch:{ all -> 0x00f5 }
            r2.initCause(r0)     // Catch:{ all -> 0x00f5 }
            throw r2     // Catch:{ all -> 0x00f5 }
        L_0x0133:
            r19 = r9
        L_0x0135:
            if (r19 == 0) goto L_0x013a
            r19.close()
        L_0x013a:
            throw r0
        L_0x013b:
            r4.recycle()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Context can't be null when inflating animators"
            r0.<init>(r2)
            throw r0
        L_0x0146:
            r4.recycle()
        L_0x0149:
            int r4 = r23.next()
            r7 = 1
            goto L_0x001c
        L_0x0150:
            a.m.a.a.c$b r0 = r1.c
            android.animation.AnimatorSet r2 = r0.c
            if (r2 != 0) goto L_0x015d
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r0.c = r2
        L_0x015d:
            android.animation.AnimatorSet r2 = r0.c
            java.util.ArrayList<android.animation.Animator> r0 = r0.d
            r2.playTogether(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m.a.a.c.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.c.f429b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f433b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.c.c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f433b;
        return drawable != null ? drawable.isStateful() : this.c.f429b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.c.f429b.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.f433b;
        return drawable != null ? drawable.setLevel(i) : this.c.f429b.setLevel(i);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f433b;
        return drawable != null ? drawable.setState(iArr) : this.c.f429b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.c.f429b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
            return;
        }
        g gVar = this.c.f429b;
        Drawable drawable2 = gVar.f433b;
        if (drawable2 != null) {
            drawable2.setAutoMirrored(z);
        } else {
            gVar.c.e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        g gVar = this.c.f429b;
        Drawable drawable2 = gVar.f433b;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
            return;
        }
        gVar.e = colorFilter;
        gVar.invalidateSelf();
    }

    public void setTint(int i) {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            o.a(drawable, i);
        } else {
            this.c.f429b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            o.a(drawable, colorStateList);
        } else {
            this.c.f429b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            o.a(drawable, mode);
        } else {
            this.c.f429b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.c.f429b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.c.c.isStarted()) {
            this.c.c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.c.c.end();
        }
    }

    /* renamed from: a.m.a.a.c$c  reason: collision with other inner class name */
    public static class C0025c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f430a;

        public C0025c(Drawable.ConstantState constantState) {
            this.f430a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f430a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f430a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            c cVar = new c((Context) null, (b) null, (Resources) null);
            Drawable newDrawable = this.f430a.newDrawable();
            cVar.f433b = newDrawable;
            newDrawable.setCallback(cVar.f);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            c cVar = new c((Context) null, (b) null, (Resources) null);
            Drawable newDrawable = this.f430a.newDrawable(resources);
            cVar.f433b = newDrawable;
            newDrawable.setCallback(cVar.f);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c((Context) null, (b) null, (Resources) null);
            Drawable newDrawable = this.f430a.newDrawable(resources, theme);
            cVar.f433b = newDrawable;
            newDrawable.setCallback(cVar.f);
            return cVar;
        }
    }
}
