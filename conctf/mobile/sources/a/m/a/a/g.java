package a.m.a.a;

import a.b.k.o;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class g extends f {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    public h c;
    public PorterDuffColorFilter d;
    public ColorFilter e;
    public boolean f;
    public boolean g;
    public final float[] h;
    public final Matrix i;
    public final Rect j;

    public static class b extends f {
        public b() {
        }

        public b(b bVar) {
            super(bVar);
        }

        public boolean b() {
            return true;
        }
    }

    public static class c extends f {
        public int[] e;
        public a.f.e.b.a f;
        public float g = 0.0f;
        public a.f.e.b.a h;
        public float i = 1.0f;
        public float j = 1.0f;
        public float k = 0.0f;
        public float l = 1.0f;
        public float m = 0.0f;
        public Paint.Cap n = Paint.Cap.BUTT;
        public Paint.Join o = Paint.Join.MITER;
        public float p = 4.0f;

        public c() {
        }

        public c(c cVar) {
            super(cVar);
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.i = cVar.i;
            this.h = cVar.h;
            this.c = cVar.c;
            this.j = cVar.j;
            this.k = cVar.k;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
        }

        public boolean a() {
            return this.h.b() || this.f.b();
        }

        public boolean a(int[] iArr) {
            return this.f.a(iArr) | this.h.a(iArr);
        }

        public float getFillAlpha() {
            return this.j;
        }

        public int getFillColor() {
            return this.h.c;
        }

        public float getStrokeAlpha() {
            return this.i;
        }

        public int getStrokeColor() {
            return this.f.c;
        }

        public float getStrokeWidth() {
            return this.g;
        }

        public float getTrimPathEnd() {
            return this.l;
        }

        public float getTrimPathOffset() {
            return this.m;
        }

        public float getTrimPathStart() {
            return this.k;
        }

        public void setFillAlpha(float f2) {
            this.j = f2;
        }

        public void setFillColor(int i2) {
            this.h.c = i2;
        }

        public void setStrokeAlpha(float f2) {
            this.i = f2;
        }

        public void setStrokeColor(int i2) {
            this.f.c = i2;
        }

        public void setStrokeWidth(float f2) {
            this.g = f2;
        }

        public void setTrimPathEnd(float f2) {
            this.l = f2;
        }

        public void setTrimPathOffset(float f2) {
            this.m = f2;
        }

        public void setTrimPathStart(float f2) {
            this.k = f2;
        }
    }

    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f434a = new Matrix();

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<e> f435b = new ArrayList<>();
        public float c = 0.0f;
        public float d = 0.0f;
        public float e = 0.0f;
        public float f = 1.0f;
        public float g = 1.0f;
        public float h = 0.0f;
        public float i = 0.0f;
        public final Matrix j = new Matrix();
        public int k;
        public int[] l;
        public String m = null;

        public d() {
            super((a) null);
        }

        public d(d dVar, a.d.a<String, Object> aVar) {
            super((a) null);
            f fVar;
            this.c = dVar.c;
            this.d = dVar.d;
            this.e = dVar.e;
            this.f = dVar.f;
            this.g = dVar.g;
            this.h = dVar.h;
            this.i = dVar.i;
            this.l = dVar.l;
            String str = dVar.m;
            this.m = str;
            this.k = dVar.k;
            if (str != null) {
                aVar.put(str, this);
            }
            this.j.set(dVar.j);
            ArrayList<e> arrayList = dVar.f435b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof d) {
                    this.f435b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        fVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f435b.add(fVar);
                    String str2 = fVar.f437b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        public boolean a() {
            for (int i2 = 0; i2 < this.f435b.size(); i2++) {
                if (this.f435b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        public boolean a(int[] iArr) {
            boolean z = false;
            for (int i2 = 0; i2 < this.f435b.size(); i2++) {
                z |= this.f435b.get(i2).a(iArr);
            }
            return z;
        }

        public final void b() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.d) {
                this.d = f2;
                b();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.e) {
                this.e = f2;
                b();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.c) {
                this.c = f2;
                b();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f) {
                this.f = f2;
                b();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.g) {
                this.g = f2;
                b();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.h) {
                this.h = f2;
                b();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.i) {
                this.i = f2;
                b();
            }
        }
    }

    public static abstract class e {
        public e() {
        }

        public /* synthetic */ e(a aVar) {
        }

        public boolean a() {
            return false;
        }

        public boolean a(int[] iArr) {
            return false;
        }
    }

    public static abstract class f extends e {

        /* renamed from: a  reason: collision with root package name */
        public a.f.f.b[] f436a = null;

        /* renamed from: b  reason: collision with root package name */
        public String f437b;
        public int c = 0;
        public int d;

        public f() {
            super((a) null);
        }

        public f(f fVar) {
            super((a) null);
            this.f437b = fVar.f437b;
            this.d = fVar.d;
            this.f436a = o.a(fVar.f436a);
        }

        public boolean b() {
            return false;
        }

        public a.f.f.b[] getPathData() {
            return this.f436a;
        }

        public String getPathName() {
            return this.f437b;
        }

        public void setPathData(a.f.f.b[] bVarArr) {
            if (!o.a(this.f436a, bVarArr)) {
                this.f436a = o.a(bVarArr);
                return;
            }
            a.f.f.b[] bVarArr2 = this.f436a;
            for (int i = 0; i < bVarArr.length; i++) {
                bVarArr2[i].f281a = bVarArr[i].f281a;
                for (int i2 = 0; i2 < bVarArr[i].f282b.length; i2++) {
                    bVarArr2[i].f282b[i2] = bVarArr[i].f282b[i2];
                }
            }
        }
    }

    /* renamed from: a.m.a.a.g$g  reason: collision with other inner class name */
    public static class C0026g {
        public static final Matrix q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Path f438a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f439b;
        public final Matrix c;
        public Paint d;
        public Paint e;
        public PathMeasure f;
        public int g;
        public final d h;
        public float i;
        public float j;
        public float k;
        public float l;
        public int m;
        public String n;
        public Boolean o;
        public final a.d.a<String, Object> p;

        public C0026g() {
            this.c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new a.d.a<>();
            this.h = new d();
            this.f438a = new Path();
            this.f439b = new Path();
        }

        public C0026g(C0026g gVar) {
            this.c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            a.d.a<String, Object> aVar = new a.d.a<>();
            this.p = aVar;
            this.h = new d(gVar.h, aVar);
            this.f438a = new Path(gVar.f438a);
            this.f439b = new Path(gVar.f439b);
            this.i = gVar.i;
            this.j = gVar.j;
            this.k = gVar.k;
            this.l = gVar.l;
            this.g = gVar.g;
            this.m = gVar.m;
            this.n = gVar.n;
            String str = gVar.n;
            if (str != null) {
                this.p.put(str, this);
            }
            this.o = gVar.o;
        }

        /* JADX WARNING: type inference failed for: r11v0 */
        /* JADX WARNING: type inference failed for: r11v1, types: [boolean] */
        /* JADX WARNING: type inference failed for: r11v2 */
        public final void a(d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            C0026g gVar;
            C0026g gVar2 = this;
            d dVar2 = dVar;
            Canvas canvas2 = canvas;
            ColorFilter colorFilter2 = colorFilter;
            dVar2.f434a.set(matrix);
            dVar2.f434a.preConcat(dVar2.j);
            canvas.save();
            ? r11 = 0;
            int i4 = 0;
            while (i4 < dVar2.f435b.size()) {
                e eVar = dVar2.f435b.get(i4);
                if (eVar instanceof d) {
                    a((d) eVar, dVar2.f434a, canvas, i2, i3, colorFilter);
                } else if (eVar instanceof f) {
                    f fVar = (f) eVar;
                    float f2 = ((float) i2) / gVar2.k;
                    float f3 = ((float) i3) / gVar2.l;
                    float min = Math.min(f2, f3);
                    Matrix matrix2 = dVar2.f434a;
                    gVar2.c.set(matrix2);
                    gVar2.c.postScale(f2, f3);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f4 = min;
                    float f5 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot((double) fArr[r11], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
                    float abs = max > 0.0f ? Math.abs(f5) / max : 0.0f;
                    if (abs == 0.0f) {
                        gVar = this;
                    } else {
                        gVar = this;
                        Path path = gVar.f438a;
                        if (fVar != null) {
                            path.reset();
                            a.f.f.b[] bVarArr = fVar.f436a;
                            if (bVarArr != null) {
                                a.f.f.b.a(bVarArr, path);
                            }
                            Path path2 = gVar.f438a;
                            gVar.f439b.reset();
                            if (fVar.b()) {
                                gVar.f439b.setFillType(fVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                gVar.f439b.addPath(path2, gVar.c);
                                canvas2.clipPath(gVar.f439b);
                            } else {
                                c cVar = (c) fVar;
                                if (!(cVar.k == 0.0f && cVar.l == 1.0f)) {
                                    float f6 = cVar.k;
                                    float f7 = cVar.m;
                                    float f8 = (f6 + f7) % 1.0f;
                                    float f9 = (cVar.l + f7) % 1.0f;
                                    if (gVar.f == null) {
                                        gVar.f = new PathMeasure();
                                    }
                                    gVar.f.setPath(gVar.f438a, r11);
                                    float length = gVar.f.getLength();
                                    float f10 = f8 * length;
                                    float f11 = f9 * length;
                                    path2.reset();
                                    if (f10 > f11) {
                                        gVar.f.getSegment(f10, length, path2, true);
                                        gVar.f.getSegment(0.0f, f11, path2, true);
                                    } else {
                                        gVar.f.getSegment(f10, f11, path2, true);
                                    }
                                    path2.rLineTo(0.0f, 0.0f);
                                }
                                gVar.f439b.addPath(path2, gVar.c);
                                a.f.e.b.a aVar = cVar.h;
                                if (aVar.a() || aVar.c != 0) {
                                    a.f.e.b.a aVar2 = cVar.h;
                                    if (gVar.e == null) {
                                        Paint paint = new Paint(1);
                                        gVar.e = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    }
                                    Paint paint2 = gVar.e;
                                    if (aVar2.a()) {
                                        Shader shader = aVar2.f270a;
                                        shader.setLocalMatrix(gVar.c);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(cVar.j * 255.0f));
                                    } else {
                                        paint2.setShader((Shader) null);
                                        paint2.setAlpha(255);
                                        paint2.setColor(g.a(aVar2.c, cVar.j));
                                    }
                                    paint2.setColorFilter(colorFilter2);
                                    gVar.f439b.setFillType(cVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    canvas2.drawPath(gVar.f439b, paint2);
                                }
                                a.f.e.b.a aVar3 = cVar.f;
                                if (aVar3.a() || aVar3.c != 0) {
                                    a.f.e.b.a aVar4 = cVar.f;
                                    if (gVar.d == null) {
                                        Paint paint3 = new Paint(1);
                                        gVar.d = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    }
                                    Paint paint4 = gVar.d;
                                    Paint.Join join = cVar.o;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = cVar.n;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(cVar.p);
                                    if (aVar4.a()) {
                                        Shader shader2 = aVar4.f270a;
                                        shader2.setLocalMatrix(gVar.c);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(cVar.i * 255.0f));
                                    } else {
                                        paint4.setShader((Shader) null);
                                        paint4.setAlpha(255);
                                        paint4.setColor(g.a(aVar4.c, cVar.i));
                                    }
                                    paint4.setColorFilter(colorFilter2);
                                    paint4.setStrokeWidth(cVar.g * abs * f4);
                                    canvas2.drawPath(gVar.f439b, paint4);
                                }
                            }
                        } else {
                            throw null;
                        }
                    }
                    i4++;
                    gVar2 = gVar;
                    r11 = 0;
                }
                int i5 = i2;
                int i6 = i3;
                gVar = gVar2;
                i4++;
                gVar2 = gVar;
                r11 = 0;
            }
            C0026g gVar3 = gVar2;
            canvas.restore();
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.m = i2;
        }
    }

    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f440a;

        /* renamed from: b  reason: collision with root package name */
        public C0026g f441b;
        public ColorStateList c;
        public PorterDuff.Mode d;
        public boolean e;
        public Bitmap f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public int i;
        public boolean j;
        public boolean k;
        public Paint l;

        public h() {
            this.c = null;
            this.d = g.k;
            this.f441b = new C0026g();
        }

        public h(h hVar) {
            this.c = null;
            this.d = g.k;
            if (hVar != null) {
                this.f440a = hVar.f440a;
                C0026g gVar = new C0026g(hVar.f441b);
                this.f441b = gVar;
                if (hVar.f441b.e != null) {
                    gVar.e = new Paint(hVar.f441b.e);
                }
                if (hVar.f441b.d != null) {
                    this.f441b.d = new Paint(hVar.f441b.d);
                }
                this.c = hVar.c;
                this.d = hVar.d;
                this.e = hVar.e;
            }
        }

        public boolean a() {
            C0026g gVar = this.f441b;
            if (gVar.o == null) {
                gVar.o = Boolean.valueOf(gVar.h.a());
            }
            return gVar.o.booleanValue();
        }

        public int getChangingConfigurations() {
            return this.f440a;
        }

        public Drawable newDrawable() {
            return new g(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new g(this);
        }

        public void a(int i2, int i3) {
            this.f.eraseColor(0);
            Canvas canvas = new Canvas(this.f);
            C0026g gVar = this.f441b;
            gVar.a(gVar.h, C0026g.q, canvas, i2, i3, (ColorFilter) null);
        }
    }

    public static class i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f442a;

        public i(Drawable.ConstantState constantState) {
            this.f442a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f442a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f442a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            g gVar = new g();
            gVar.f433b = (VectorDrawable) this.f442a.newDrawable();
            return gVar;
        }

        public Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.f433b = (VectorDrawable) this.f442a.newDrawable(resources);
            return gVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.f433b = (VectorDrawable) this.f442a.newDrawable(resources, theme);
            return gVar;
        }
    }

    public g() {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.c = new h();
    }

    public g(h hVar) {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.c = hVar;
        this.d = a(hVar.c, hVar.d);
    }

    public static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (((float) Color.alpha(i2)) * f2)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032 A[Catch:{ IOException | XmlPullParserException -> 0x003f }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037 A[Catch:{ IOException | XmlPullParserException -> 0x003f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static a.m.a.a.g a(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x001d
            a.m.a.a.g r0 = new a.m.a.a.g
            r0.<init>()
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r5, r6)
            r0.f433b = r4
            a.m.a.a.g$i r4 = new a.m.a.a.g$i
            android.graphics.drawable.Drawable r5 = r0.f433b
            android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
            r4.<init>(r5)
            return r0
        L_0x001d:
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)     // Catch:{ XmlPullParserException -> 0x0041, IOException -> 0x003f }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ XmlPullParserException -> 0x0041, IOException -> 0x003f }
        L_0x0025:
            int r1 = r5.next()     // Catch:{ XmlPullParserException -> 0x0041, IOException -> 0x003f }
            r2 = 2
            if (r1 == r2) goto L_0x0030
            r3 = 1
            if (r1 == r3) goto L_0x0030
            goto L_0x0025
        L_0x0030:
            if (r1 != r2) goto L_0x0037
            a.m.a.a.g r4 = createFromXmlInner(r4, r5, r0, r6)     // Catch:{ XmlPullParserException -> 0x0041, IOException -> 0x003f }
            return r4
        L_0x0037:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0041, IOException -> 0x003f }
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)     // Catch:{ XmlPullParserException -> 0x0041, IOException -> 0x003f }
            throw r4     // Catch:{ XmlPullParserException -> 0x0041, IOException -> 0x003f }
        L_0x003f:
            r4 = move-exception
            goto L_0x0042
        L_0x0041:
            r4 = move-exception
        L_0x0042:
            java.lang.String r5 = "parser error"
            java.lang.String r6 = "VectorDrawableCompat"
            android.util.Log.e(r6, r5, r4)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m.a.a.g.a(android.content.res.Resources, int, android.content.res.Resources$Theme):a.m.a.a.g");
    }

    public static g createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        g gVar = new g();
        gVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return gVar;
    }

    public PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f433b;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cf, code lost:
        if ((r1 == r7.getWidth() && r3 == r6.f.getHeight()) == false) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            android.graphics.drawable.Drawable r0 = r10.f433b
            if (r0 == 0) goto L_0x0008
            r0.draw(r11)
            return
        L_0x0008:
            android.graphics.Rect r0 = r10.j
            r10.copyBounds(r0)
            android.graphics.Rect r0 = r10.j
            int r0 = r0.width()
            if (r0 <= 0) goto L_0x0167
            android.graphics.Rect r0 = r10.j
            int r0 = r0.height()
            if (r0 > 0) goto L_0x001f
            goto L_0x0167
        L_0x001f:
            android.graphics.ColorFilter r0 = r10.e
            if (r0 != 0) goto L_0x0025
            android.graphics.PorterDuffColorFilter r0 = r10.d
        L_0x0025:
            android.graphics.Matrix r1 = r10.i
            r11.getMatrix(r1)
            android.graphics.Matrix r1 = r10.i
            float[] r2 = r10.h
            r1.getValues(r2)
            float[] r1 = r10.h
            r2 = 0
            r1 = r1[r2]
            float r1 = java.lang.Math.abs(r1)
            float[] r3 = r10.h
            r4 = 4
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r4 = r10.h
            r5 = 1
            r4 = r4[r5]
            float r4 = java.lang.Math.abs(r4)
            float[] r6 = r10.h
            r7 = 3
            r6 = r6[r7]
            float r6 = java.lang.Math.abs(r6)
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r4 != 0) goto L_0x0060
            int r4 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0062
        L_0x0060:
            r1 = r8
            r3 = r1
        L_0x0062:
            android.graphics.Rect r4 = r10.j
            int r4 = r4.width()
            float r4 = (float) r4
            float r4 = r4 * r1
            int r1 = (int) r4
            android.graphics.Rect r4 = r10.j
            int r4 = r4.height()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            r4 = 2048(0x800, float:2.87E-42)
            int r1 = java.lang.Math.min(r4, r1)
            int r3 = java.lang.Math.min(r4, r3)
            if (r1 <= 0) goto L_0x0167
            if (r3 > 0) goto L_0x0084
            goto L_0x0167
        L_0x0084:
            int r4 = r11.save()
            android.graphics.Rect r6 = r10.j
            int r9 = r6.left
            float r9 = (float) r9
            int r6 = r6.top
            float r6 = (float) r6
            r11.translate(r9, r6)
            boolean r6 = r10.isAutoMirrored()
            if (r6 == 0) goto L_0x00a1
            int r6 = r10.getLayoutDirection()
            if (r6 != r5) goto L_0x00a1
            r6 = r5
            goto L_0x00a2
        L_0x00a1:
            r6 = r2
        L_0x00a2:
            if (r6 == 0) goto L_0x00b3
            android.graphics.Rect r6 = r10.j
            int r6 = r6.width()
            float r6 = (float) r6
            r11.translate(r6, r7)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11.scale(r6, r8)
        L_0x00b3:
            android.graphics.Rect r6 = r10.j
            r6.offsetTo(r2, r2)
            a.m.a.a.g$h r6 = r10.c
            android.graphics.Bitmap r7 = r6.f
            if (r7 == 0) goto L_0x00d1
            int r7 = r7.getWidth()
            if (r1 != r7) goto L_0x00ce
            android.graphics.Bitmap r7 = r6.f
            int r7 = r7.getHeight()
            if (r3 != r7) goto L_0x00ce
            r7 = r5
            goto L_0x00cf
        L_0x00ce:
            r7 = r2
        L_0x00cf:
            if (r7 != 0) goto L_0x00db
        L_0x00d1:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r1, r3, r7)
            r6.f = r7
            r6.k = r5
        L_0x00db:
            boolean r6 = r10.g
            if (r6 != 0) goto L_0x00e5
            a.m.a.a.g$h r6 = r10.c
            r6.a(r1, r3)
            goto L_0x0129
        L_0x00e5:
            a.m.a.a.g$h r6 = r10.c
            boolean r7 = r6.k
            if (r7 != 0) goto L_0x0109
            android.content.res.ColorStateList r7 = r6.g
            android.content.res.ColorStateList r8 = r6.c
            if (r7 != r8) goto L_0x0109
            android.graphics.PorterDuff$Mode r7 = r6.h
            android.graphics.PorterDuff$Mode r8 = r6.d
            if (r7 != r8) goto L_0x0109
            boolean r7 = r6.j
            boolean r8 = r6.e
            if (r7 != r8) goto L_0x0109
            int r7 = r6.i
            a.m.a.a.g$g r6 = r6.f441b
            int r6 = r6.getRootAlpha()
            if (r7 != r6) goto L_0x0109
            r6 = r5
            goto L_0x010a
        L_0x0109:
            r6 = r2
        L_0x010a:
            if (r6 != 0) goto L_0x0129
            a.m.a.a.g$h r6 = r10.c
            r6.a(r1, r3)
            a.m.a.a.g$h r1 = r10.c
            android.content.res.ColorStateList r3 = r1.c
            r1.g = r3
            android.graphics.PorterDuff$Mode r3 = r1.d
            r1.h = r3
            a.m.a.a.g$g r3 = r1.f441b
            int r3 = r3.getRootAlpha()
            r1.i = r3
            boolean r3 = r1.e
            r1.j = r3
            r1.k = r2
        L_0x0129:
            a.m.a.a.g$h r1 = r10.c
            android.graphics.Rect r3 = r10.j
            a.m.a.a.g$g r6 = r1.f441b
            int r6 = r6.getRootAlpha()
            r7 = 255(0xff, float:3.57E-43)
            if (r6 >= r7) goto L_0x0138
            r2 = r5
        L_0x0138:
            r6 = 0
            if (r2 != 0) goto L_0x013f
            if (r0 != 0) goto L_0x013f
            r0 = r6
            goto L_0x015f
        L_0x013f:
            android.graphics.Paint r2 = r1.l
            if (r2 != 0) goto L_0x014d
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.l = r2
            r2.setFilterBitmap(r5)
        L_0x014d:
            android.graphics.Paint r2 = r1.l
            a.m.a.a.g$g r5 = r1.f441b
            int r5 = r5.getRootAlpha()
            r2.setAlpha(r5)
            android.graphics.Paint r2 = r1.l
            r2.setColorFilter(r0)
            android.graphics.Paint r0 = r1.l
        L_0x015f:
            android.graphics.Bitmap r1 = r1.f
            r11.drawBitmap(r1, r6, r3, r0)
            r11.restoreToCount(r4)
        L_0x0167:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m.a.a.g.draw(android.graphics.Canvas):void");
    }

    public int getAlpha() {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.c.f441b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f433b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.e;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f433b != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f433b.getConstantState());
        }
        this.c.f440a = getChangingConfigurations();
        return this.c;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f433b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.c.f441b.j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f433b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.c.f441b.i;
    }

    public int getOpacity() {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:132:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inflate(android.content.res.Resources r28, org.xmlpull.v1.XmlPullParser r29, android.util.AttributeSet r30, android.content.res.Resources.Theme r31) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            android.graphics.drawable.Drawable r0 = r1.f433b
            if (r0 == 0) goto L_0x0012
            r0.inflate(r2, r9, r10, r11)
            return
        L_0x0012:
            a.m.a.a.g$h r12 = r1.c
            a.m.a.a.g$g r0 = new a.m.a.a.g$g
            r0.<init>()
            r12.f441b = r0
            int[] r0 = a.m.a.a.a.f425a
            android.content.res.TypedArray r3 = a.b.k.o.a((android.content.res.Resources) r2, (android.content.res.Resources.Theme) r11, (android.util.AttributeSet) r10, (int[]) r0)
            a.m.a.a.g$h r4 = r1.c
            a.m.a.a.g$g r5 = r4.f441b
            r13 = 6
            r14 = -1
            java.lang.String r0 = "tintMode"
            int r0 = a.b.k.o.b(r3, r9, r0, r13, r14)
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_IN
            r15 = 9
            r8 = 5
            r7 = 3
            if (r0 == r7) goto L_0x0049
            if (r0 == r8) goto L_0x004b
            if (r0 == r15) goto L_0x0046
            switch(r0) {
                case 14: goto L_0x0043;
                case 15: goto L_0x0040;
                case 16: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x004b
        L_0x003d:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.ADD
            goto L_0x004b
        L_0x0040:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SCREEN
            goto L_0x004b
        L_0x0043:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x004b
        L_0x0046:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L_0x004b
        L_0x0049:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_OVER
        L_0x004b:
            r4.d = r6
            java.lang.String r0 = "tint"
            boolean r0 = a.b.k.o.a((org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r0)
            r13 = 0
            r15 = 1
            r14 = 2
            if (r0 == 0) goto L_0x00ac
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r3.getValue(r15, r0)
            int r6 = r0.type
            if (r6 == r14) goto L_0x008d
            r14 = 28
            if (r6 < r14) goto L_0x0073
            r14 = 31
            if (r6 > r14) goto L_0x0073
            int r0 = r0.data
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            goto L_0x00ad
        L_0x0073:
            android.content.res.Resources r0 = r3.getResources()
            int r6 = r3.getResourceId(r15, r13)
            android.content.res.XmlResourceParser r6 = r0.getXml(r6)     // Catch:{ Exception -> 0x0084 }
            android.content.res.ColorStateList r0 = a.b.k.o.a((android.content.res.Resources) r0, (org.xmlpull.v1.XmlPullParser) r6, (android.content.res.Resources.Theme) r11)     // Catch:{ Exception -> 0x0084 }
            goto L_0x00ad
        L_0x0084:
            r0 = move-exception
            java.lang.String r6 = "CSLCompat"
            java.lang.String r14 = "Failed to inflate ColorStateList."
            android.util.Log.e(r6, r14, r0)
            goto L_0x00ac
        L_0x008d:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to resolve attribute at index "
            r3.append(r4)
            r3.append(r15)
            java.lang.String r4 = ": "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x00ac:
            r0 = 0
        L_0x00ad:
            if (r0 == 0) goto L_0x00b1
            r4.c = r0
        L_0x00b1:
            boolean r0 = r4.e
            java.lang.String r6 = "autoMirrored"
            boolean r6 = a.b.k.o.a((org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r6)
            if (r6 != 0) goto L_0x00bc
            goto L_0x00c0
        L_0x00bc:
            boolean r0 = r3.getBoolean(r8, r0)
        L_0x00c0:
            r4.e = r0
            float r0 = r5.k
            r14 = 7
            java.lang.String r4 = "viewportWidth"
            float r0 = a.b.k.o.a((android.content.res.TypedArray) r3, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r4, (int) r14, (float) r0)
            r5.k = r0
            float r0 = r5.l
            r6 = 8
            java.lang.String r4 = "viewportHeight"
            float r0 = a.b.k.o.a((android.content.res.TypedArray) r3, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r4, (int) r6, (float) r0)
            r5.l = r0
            float r4 = r5.k
            r19 = 0
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x043f
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x0423
            float r0 = r5.i
            float r0 = r3.getDimension(r7, r0)
            r5.i = r0
            float r0 = r5.j
            r4 = 2
            float r0 = r3.getDimension(r4, r0)
            r5.j = r0
            float r4 = r5.i
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x0407
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x03eb
            float r0 = r5.getAlpha()
            r4 = 4
            java.lang.String r6 = "alpha"
            float r0 = a.b.k.o.a((android.content.res.TypedArray) r3, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r6, (int) r4, (float) r0)
            r5.setAlpha(r0)
            java.lang.String r0 = r3.getString(r13)
            if (r0 == 0) goto L_0x011b
            r5.n = r0
            a.d.a<java.lang.String, java.lang.Object> r6 = r5.p
            r6.put(r0, r5)
        L_0x011b:
            r3.recycle()
            int r0 = r27.getChangingConfigurations()
            r12.f440a = r0
            r12.k = r15
            a.m.a.a.g$h r0 = r1.c
            a.m.a.a.g$g r6 = r0.f441b
            java.util.ArrayDeque r5 = new java.util.ArrayDeque
            r5.<init>()
            a.m.a.a.g$d r3 = r6.h
            r5.push(r3)
            int r3 = r29.getEventType()
            int r20 = r29.getDepth()
            int r14 = r20 + 1
            r20 = r15
        L_0x0140:
            if (r3 == r15) goto L_0x03d2
            int r4 = r29.getDepth()
            if (r4 >= r14) goto L_0x014a
            if (r3 == r7) goto L_0x03d2
        L_0x014a:
            java.lang.String r4 = "group"
            r7 = 2
            if (r3 != r7) goto L_0x03a2
            java.lang.String r3 = r29.getName()
            java.lang.Object r7 = r5.peek()
            a.m.a.a.g$d r7 = (a.m.a.a.g.d) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            java.lang.String r15 = "fillType"
            java.lang.String r13 = "pathData"
            if (r8 == 0) goto L_0x02a9
            a.m.a.a.g$c r8 = new a.m.a.a.g$c
            r8.<init>()
            int[] r3 = a.m.a.a.a.c
            android.content.res.TypedArray r4 = a.b.k.o.a((android.content.res.Resources) r2, (android.content.res.Resources.Theme) r11, (android.util.AttributeSet) r10, (int[]) r3)
            r3 = 0
            r8.e = r3
            boolean r13 = a.b.k.o.a((org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r13)
            if (r13 != 0) goto L_0x018b
            r1 = r4
            r25 = r5
            r26 = r6
            r13 = r8
            r18 = r14
            r5 = 4
            r17 = -1
            r21 = 9
            r22 = 8
            r14 = r7
            goto L_0x027a
        L_0x018b:
            r13 = 0
            java.lang.String r3 = r4.getString(r13)
            if (r3 == 0) goto L_0x0194
            r8.f437b = r3
        L_0x0194:
            r3 = 2
            java.lang.String r13 = r4.getString(r3)
            if (r13 == 0) goto L_0x01a1
            a.f.f.b[] r3 = a.b.k.o.a((java.lang.String) r13)
            r8.f436a = r3
        L_0x01a1:
            r13 = 1
            r20 = 0
            java.lang.String r23 = "fillColor"
            r18 = 0
            r3 = r4
            r24 = r4
            r4 = r29
            r25 = r5
            r5 = r31
            r26 = r6
            r6 = r23
            r18 = r14
            r1 = 3
            r14 = r7
            r7 = r13
            r13 = r8
            r1 = 5
            r8 = r20
            a.f.e.b.a r3 = a.b.k.o.a((android.content.res.TypedArray) r3, (org.xmlpull.v1.XmlPullParser) r4, (android.content.res.Resources.Theme) r5, (java.lang.String) r6, (int) r7, (int) r8)
            r13.h = r3
            r3 = 12
            float r4 = r13.j
            java.lang.String r5 = "fillAlpha"
            r8 = r24
            float r3 = a.b.k.o.a((android.content.res.TypedArray) r8, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r5, (int) r3, (float) r4)
            r13.j = r3
            java.lang.String r3 = "strokeLineCap"
            r4 = -1
            r7 = 8
            int r3 = a.b.k.o.b(r8, r9, r3, r7, r4)
            android.graphics.Paint$Cap r4 = r13.n
            if (r3 == 0) goto L_0x01ec
            r5 = 1
            if (r3 == r5) goto L_0x01e9
            r5 = 2
            if (r3 == r5) goto L_0x01e6
            goto L_0x01ee
        L_0x01e6:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.SQUARE
            goto L_0x01ee
        L_0x01e9:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.ROUND
            goto L_0x01ee
        L_0x01ec:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.BUTT
        L_0x01ee:
            r13.n = r4
            java.lang.String r3 = "strokeLineJoin"
            r5 = -1
            r6 = 9
            int r3 = a.b.k.o.b(r8, r9, r3, r6, r5)
            android.graphics.Paint$Join r4 = r13.o
            if (r3 == 0) goto L_0x020a
            r5 = 1
            if (r3 == r5) goto L_0x0207
            r5 = 2
            if (r3 == r5) goto L_0x0204
            goto L_0x020c
        L_0x0204:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.BEVEL
            goto L_0x020c
        L_0x0207:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.ROUND
            goto L_0x020c
        L_0x020a:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER
        L_0x020c:
            r13.o = r4
            r3 = 10
            float r4 = r13.p
            java.lang.String r5 = "strokeMiterLimit"
            float r3 = a.b.k.o.a((android.content.res.TypedArray) r8, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r5, (int) r3, (float) r4)
            r13.p = r3
            r16 = 3
            r19 = 0
            java.lang.String r20 = "strokeColor"
            r3 = r8
            r4 = r29
            r17 = -1
            r5 = r31
            r21 = r6
            r6 = r20
            r22 = r7
            r7 = r16
            r1 = r8
            r8 = r19
            a.f.e.b.a r3 = a.b.k.o.a((android.content.res.TypedArray) r3, (org.xmlpull.v1.XmlPullParser) r4, (android.content.res.Resources.Theme) r5, (java.lang.String) r6, (int) r7, (int) r8)
            r13.f = r3
            r3 = 11
            float r4 = r13.i
            java.lang.String r5 = "strokeAlpha"
            float r3 = a.b.k.o.a((android.content.res.TypedArray) r1, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r5, (int) r3, (float) r4)
            r13.i = r3
            float r3 = r13.g
            java.lang.String r4 = "strokeWidth"
            r5 = 4
            float r3 = a.b.k.o.a((android.content.res.TypedArray) r1, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r4, (int) r5, (float) r3)
            r13.g = r3
            float r3 = r13.l
            java.lang.String r4 = "trimPathEnd"
            r6 = 6
            float r3 = a.b.k.o.a((android.content.res.TypedArray) r1, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r4, (int) r6, (float) r3)
            r13.l = r3
            float r3 = r13.m
            java.lang.String r4 = "trimPathOffset"
            r6 = 7
            float r3 = a.b.k.o.a((android.content.res.TypedArray) r1, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r4, (int) r6, (float) r3)
            r13.m = r3
            float r3 = r13.k
            java.lang.String r4 = "trimPathStart"
            r6 = 5
            float r3 = a.b.k.o.a((android.content.res.TypedArray) r1, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r4, (int) r6, (float) r3)
            r13.k = r3
            r3 = 13
            int r4 = r13.c
            int r3 = a.b.k.o.b(r1, r9, r15, r3, r4)
            r13.c = r3
        L_0x027a:
            r1.recycle()
            java.util.ArrayList<a.m.a.a.g$e> r1 = r14.f435b
            r1.add(r13)
            java.lang.String r1 = r13.getPathName()
            if (r1 == 0) goto L_0x0294
            r1 = r26
            a.d.a<java.lang.String, java.lang.Object> r3 = r1.p
            java.lang.String r4 = r13.getPathName()
            r3.put(r4, r13)
            goto L_0x0296
        L_0x0294:
            r1 = r26
        L_0x0296:
            int r3 = r0.f440a
            int r4 = r13.d
            r3 = r3 | r4
            r0.f440a = r3
            r7 = r25
            r5 = 7
            r6 = 0
            r8 = 6
            r13 = 5
            r14 = 3
            r15 = 2
            r20 = 0
            goto L_0x03c1
        L_0x02a9:
            r25 = r5
            r1 = r6
            r18 = r14
            r5 = 4
            r17 = -1
            r21 = 9
            r22 = 8
            r14 = r7
            java.lang.String r6 = "clip-path"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x030d
            a.m.a.a.g$b r3 = new a.m.a.a.g$b
            r3.<init>()
            boolean r4 = a.b.k.o.a((org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r13)
            if (r4 != 0) goto L_0x02ca
            goto L_0x02f0
        L_0x02ca:
            int[] r4 = a.m.a.a.a.d
            android.content.res.TypedArray r4 = a.b.k.o.a((android.content.res.Resources) r2, (android.content.res.Resources.Theme) r11, (android.util.AttributeSet) r10, (int[]) r4)
            r6 = 0
            java.lang.String r7 = r4.getString(r6)
            if (r7 == 0) goto L_0x02d9
            r3.f437b = r7
        L_0x02d9:
            r7 = 1
            java.lang.String r8 = r4.getString(r7)
            if (r8 == 0) goto L_0x02e6
            a.f.f.b[] r7 = a.b.k.o.a((java.lang.String) r8)
            r3.f436a = r7
        L_0x02e6:
            r7 = 2
            int r8 = a.b.k.o.b(r4, r9, r15, r7, r6)
            r3.c = r8
            r4.recycle()
        L_0x02f0:
            java.util.ArrayList<a.m.a.a.g$e> r4 = r14.f435b
            r4.add(r3)
            java.lang.String r4 = r3.getPathName()
            if (r4 == 0) goto L_0x0304
            a.d.a<java.lang.String, java.lang.Object> r4 = r1.p
            java.lang.String r6 = r3.getPathName()
            r4.put(r6, r3)
        L_0x0304:
            int r4 = r0.f440a
            int r3 = r3.d
            r3 = r3 | r4
            r0.f440a = r3
            goto L_0x0399
        L_0x030d:
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0399
            a.m.a.a.g$d r3 = new a.m.a.a.g$d
            r3.<init>()
            int[] r4 = a.m.a.a.a.f426b
            android.content.res.TypedArray r4 = a.b.k.o.a((android.content.res.Resources) r2, (android.content.res.Resources.Theme) r11, (android.util.AttributeSet) r10, (int[]) r4)
            r6 = 0
            r3.l = r6
            float r7 = r3.c
            java.lang.String r8 = "rotation"
            r13 = 5
            float r7 = a.b.k.o.a((android.content.res.TypedArray) r4, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r8, (int) r13, (float) r7)
            r3.c = r7
            float r7 = r3.d
            r8 = 1
            float r7 = r4.getFloat(r8, r7)
            r3.d = r7
            float r7 = r3.e
            r15 = 2
            float r7 = r4.getFloat(r15, r7)
            r3.e = r7
            float r7 = r3.f
            java.lang.String r6 = "scaleX"
            r8 = 3
            float r6 = a.b.k.o.a((android.content.res.TypedArray) r4, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r6, (int) r8, (float) r7)
            r3.f = r6
            float r6 = r3.g
            java.lang.String r7 = "scaleY"
            float r6 = a.b.k.o.a((android.content.res.TypedArray) r4, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r7, (int) r5, (float) r6)
            r3.g = r6
            float r6 = r3.h
            java.lang.String r7 = "translateX"
            r8 = 6
            float r6 = a.b.k.o.a((android.content.res.TypedArray) r4, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r7, (int) r8, (float) r6)
            r3.h = r6
            float r6 = r3.i
            java.lang.String r7 = "translateY"
            r5 = 7
            float r6 = a.b.k.o.a((android.content.res.TypedArray) r4, (org.xmlpull.v1.XmlPullParser) r9, (java.lang.String) r7, (int) r5, (float) r6)
            r3.i = r6
            r6 = 0
            java.lang.String r7 = r4.getString(r6)
            if (r7 == 0) goto L_0x0372
            r3.m = r7
        L_0x0372:
            r3.b()
            r4.recycle()
            java.util.ArrayList<a.m.a.a.g$e> r4 = r14.f435b
            r4.add(r3)
            r7 = r25
            r7.push(r3)
            java.lang.String r4 = r3.getGroupName()
            if (r4 == 0) goto L_0x0391
            a.d.a<java.lang.String, java.lang.Object> r4 = r1.p
            java.lang.String r14 = r3.getGroupName()
            r4.put(r14, r3)
        L_0x0391:
            int r4 = r0.f440a
            int r3 = r3.k
            r3 = r3 | r4
            r0.f440a = r3
            goto L_0x03a0
        L_0x0399:
            r7 = r25
            r5 = 7
            r6 = 0
            r8 = 6
            r13 = 5
            r15 = 2
        L_0x03a0:
            r14 = 3
            goto L_0x03c1
        L_0x03a2:
            r1 = r6
            r15 = r7
            r6 = r13
            r18 = r14
            r14 = 3
            r17 = -1
            r21 = 9
            r22 = 8
            r7 = r5
            r13 = r8
            r5 = 7
            r8 = 6
            if (r3 != r14) goto L_0x03c1
            java.lang.String r3 = r29.getName()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x03c1
            r7.pop()
        L_0x03c1:
            int r3 = r29.next()
            r5 = r7
            r8 = r13
            r7 = r14
            r14 = r18
            r4 = 4
            r15 = 1
            r13 = r6
            r6 = r1
            r1 = r27
            goto L_0x0140
        L_0x03d2:
            if (r20 != 0) goto L_0x03e1
            android.content.res.ColorStateList r0 = r12.c
            android.graphics.PorterDuff$Mode r1 = r12.d
            r2 = r27
            android.graphics.PorterDuffColorFilter r0 = r2.a((android.content.res.ColorStateList) r0, (android.graphics.PorterDuff.Mode) r1)
            r2.d = r0
            return
        L_0x03e1:
            r2 = r27
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "no path defined"
            r0.<init>(r1)
            throw r0
        L_0x03eb:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires height > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0407:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires width > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0423:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportHeight > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x043f:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportWidth > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m.a.a.g.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public void invalidateSelf() {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.c.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.c.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f433b
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            a.m.a.a.g$h r0 = r1.c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0028
            a.m.a.a.g$h r0 = r1.c
            android.content.res.ColorStateList r0 = r0.c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m.a.a.g.isStateful():boolean");
    }

    public Drawable mutate() {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f && super.mutate() == this) {
            this.c = new h(this.c);
            this.f = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f433b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        h hVar = this.c;
        ColorStateList colorStateList = hVar.c;
        if (!(colorStateList == null || (mode = hVar.d) == null)) {
            this.d = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (hVar.a()) {
            boolean a2 = hVar.f441b.h.a(iArr);
            hVar.k |= a2;
            if (a2) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.c.f441b.getRootAlpha() != i2) {
            this.c.f441b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.c.e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.e = colorFilter;
        invalidateSelf();
    }

    public void setTint(int i2) {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            o.a(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            o.a(drawable, colorStateList);
            return;
        }
        h hVar = this.c;
        if (hVar.c != colorStateList) {
            hVar.c = colorStateList;
            this.d = a(colorStateList, hVar.d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            o.a(drawable, mode);
            return;
        }
        h hVar = this.c;
        if (hVar.d != mode) {
            hVar.d = mode;
            this.d = a(hVar.c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f433b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f433b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
