package a.b.p;

import a.b.j;
import a.b.k.o;
import a.f.e.b.g;
import a.f.l.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;

public class y {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f187a;

    /* renamed from: b  reason: collision with root package name */
    public v0 f188b;
    public v0 c;
    public v0 d;
    public v0 e;
    public v0 f;
    public v0 g;
    public v0 h;
    public final a0 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public static class a extends g {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<y> f189a;

        /* renamed from: b  reason: collision with root package name */
        public final int f190b;
        public final int c;

        /* renamed from: a.b.p.y$a$a  reason: collision with other inner class name */
        public class C0008a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            public final WeakReference<y> f191b;
            public final Typeface c;

            public C0008a(a aVar, WeakReference<y> weakReference, Typeface typeface) {
                this.f191b = weakReference;
                this.c = typeface;
            }

            public void run() {
                y yVar = (y) this.f191b.get();
                if (yVar != null) {
                    Typeface typeface = this.c;
                    if (yVar.m) {
                        yVar.f187a.setTypeface(typeface);
                        yVar.l = typeface;
                    }
                }
            }
        }

        public a(y yVar, int i, int i2) {
            this.f189a = new WeakReference<>(yVar);
            this.f190b = i;
            this.c = i2;
        }

        public void a(Typeface typeface) {
            int i;
            y yVar = (y) this.f189a.get();
            if (yVar != null) {
                if (Build.VERSION.SDK_INT >= 28 && (i = this.f190b) != -1) {
                    typeface = Typeface.create(typeface, i, (this.c & 2) != 0);
                }
                yVar.f187a.post(new C0008a(this, this.f189a, typeface));
            }
        }
    }

    public y(TextView textView) {
        this.f187a = textView;
        this.i = new a0(this.f187a);
    }

    public static v0 a(Context context, j jVar, int i2) {
        ColorStateList b2 = jVar.b(context, i2);
        if (b2 == null) {
            return null;
        }
        v0 v0Var = new v0();
        v0Var.d = true;
        v0Var.f173a = b2;
        return v0Var;
    }

    public void a() {
        if (!(this.f188b == null && this.c == null && this.d == null && this.e == null)) {
            Drawable[] compoundDrawables = this.f187a.getCompoundDrawables();
            a(compoundDrawables[0], this.f188b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f != null || this.g != null) {
            Drawable[] compoundDrawablesRelative = this.f187a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    public final void a(Context context, x0 x0Var) {
        String d2;
        Typeface typeface;
        Typeface typeface2;
        this.j = x0Var.c(j.TextAppearance_android_textStyle, this.j);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            int c2 = x0Var.c(j.TextAppearance_android_textFontWeight, -1);
            this.k = c2;
            if (c2 != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        if (x0Var.f(j.TextAppearance_android_fontFamily) || x0Var.f(j.TextAppearance_fontFamily)) {
            this.l = null;
            int i2 = x0Var.f(j.TextAppearance_fontFamily) ? j.TextAppearance_fontFamily : j.TextAppearance_android_fontFamily;
            int i3 = this.k;
            int i4 = this.j;
            if (!context.isRestricted()) {
                try {
                    Typeface a2 = x0Var.a(i2, this.j, (g) new a(this, i3, i4));
                    if (a2 != null) {
                        if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
                            a2 = Typeface.create(Typeface.create(a2, 0), this.k, (this.j & 2) != 0);
                        }
                        this.l = a2;
                    }
                    this.m = this.l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.l == null && (d2 = x0Var.d(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
                    typeface = Typeface.create(d2, this.j);
                } else {
                    Typeface create = Typeface.create(d2, 0);
                    int i5 = this.k;
                    if ((this.j & 2) != 0) {
                        z = true;
                    }
                    typeface = Typeface.create(create, i5, z);
                }
                this.l = typeface;
            }
        } else if (x0Var.f(j.TextAppearance_android_typeface)) {
            this.m = false;
            int c3 = x0Var.c(j.TextAppearance_android_typeface, 1);
            if (c3 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (c3 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (c3 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.l = typeface2;
        }
    }

    public final void a(Drawable drawable, v0 v0Var) {
        if (drawable != null && v0Var != null) {
            j.a(drawable, v0Var, this.f187a.getDrawableState());
        }
    }

    @SuppressLint({"NewApi"})
    public void a(AttributeSet attributeSet, int i2) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        int resourceId;
        AttributeSet attributeSet2 = attributeSet;
        int i3 = i2;
        Context context = this.f187a.getContext();
        j a2 = j.a();
        x0 a3 = x0.a(context, attributeSet2, j.AppCompatTextHelper, i3, 0);
        int e2 = a3.e(j.AppCompatTextHelper_android_textAppearance, -1);
        if (a3.f(j.AppCompatTextHelper_android_drawableLeft)) {
            this.f188b = a(context, a2, a3.e(j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a3.f(j.AppCompatTextHelper_android_drawableTop)) {
            this.c = a(context, a2, a3.e(j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a3.f(j.AppCompatTextHelper_android_drawableRight)) {
            this.d = a(context, a2, a3.e(j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a3.f(j.AppCompatTextHelper_android_drawableBottom)) {
            this.e = a(context, a2, a3.e(j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (a3.f(j.AppCompatTextHelper_android_drawableStart)) {
            this.f = a(context, a2, a3.e(j.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (a3.f(j.AppCompatTextHelper_android_drawableEnd)) {
            this.g = a(context, a2, a3.e(j.AppCompatTextHelper_android_drawableEnd, 0));
        }
        a3.f186b.recycle();
        boolean z3 = this.f187a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (e2 != -1) {
            x0 x0Var = new x0(context, context.obtainStyledAttributes(e2, j.TextAppearance));
            if (z3 || !x0Var.f(j.TextAppearance_textAllCaps)) {
                z2 = false;
                z = false;
            } else {
                z2 = x0Var.a(j.TextAppearance_textAllCaps, false);
                z = true;
            }
            a(context, x0Var);
            str2 = x0Var.f(j.TextAppearance_textLocale) ? x0Var.d(j.TextAppearance_textLocale) : null;
            str = (Build.VERSION.SDK_INT < 26 || !x0Var.f(j.TextAppearance_fontVariationSettings)) ? null : x0Var.d(j.TextAppearance_fontVariationSettings);
            x0Var.f186b.recycle();
        } else {
            z2 = false;
            z = false;
            str2 = null;
            str = null;
        }
        x0 x0Var2 = new x0(context, context.obtainStyledAttributes(attributeSet2, j.TextAppearance, i3, 0));
        if (!z3 && x0Var2.f(j.TextAppearance_textAllCaps)) {
            z2 = x0Var2.a(j.TextAppearance_textAllCaps, false);
            z = true;
        }
        if (x0Var2.f(j.TextAppearance_textLocale)) {
            str2 = x0Var2.d(j.TextAppearance_textLocale);
        }
        if (Build.VERSION.SDK_INT >= 26 && x0Var2.f(j.TextAppearance_fontVariationSettings)) {
            str = x0Var2.d(j.TextAppearance_fontVariationSettings);
        }
        if (Build.VERSION.SDK_INT >= 28 && x0Var2.f(j.TextAppearance_android_textSize) && x0Var2.b(j.TextAppearance_android_textSize, -1) == 0) {
            this.f187a.setTextSize(0, 0.0f);
        }
        a(context, x0Var2);
        x0Var2.f186b.recycle();
        if (!z3 && z) {
            this.f187a.setAllCaps(z2);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                this.f187a.setTypeface(typeface, this.j);
            } else {
                this.f187a.setTypeface(typeface);
            }
        }
        if (str != null) {
            this.f187a.setFontVariationSettings(str);
        }
        if (str2 != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                this.f187a.setTextLocales(LocaleList.forLanguageTags(str2));
            } else {
                this.f187a.setTextLocale(Locale.forLanguageTag(str2.substring(0, str2.indexOf(44))));
            }
        }
        a0 a0Var = this.i;
        TypedArray obtainStyledAttributes = a0Var.j.obtainStyledAttributes(attributeSet2, j.AppCompatTextView, i3, 0);
        if (obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeTextType)) {
            a0Var.f109a = obtainStyledAttributes.getInt(j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr = new int[length];
            if (length > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[i4] = obtainTypedArray.getDimensionPixelSize(i4, -1);
                }
                a0Var.f = a0Var.a(iArr);
                a0Var.c();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!a0Var.d()) {
            a0Var.f109a = 0;
        } else if (a0Var.f109a == 1) {
            if (!a0Var.g) {
                DisplayMetrics displayMetrics = a0Var.j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                a0Var.a(dimension2, dimension3, dimension);
            }
            a0Var.b();
        }
        if (b.f347a) {
            a0 a0Var2 = this.i;
            if (a0Var2.f109a != 0) {
                int[] iArr2 = a0Var2.f;
                if (iArr2.length > 0) {
                    if (((float) this.f187a.getAutoSizeStepGranularity()) != -1.0f) {
                        this.f187a.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.i.d), Math.round(this.i.e), Math.round(this.i.c), 0);
                    } else {
                        this.f187a.setAutoSizeTextTypeUniformWithPresetSizes(iArr2, 0);
                    }
                }
            }
        }
        x0 x0Var3 = new x0(context, context.obtainStyledAttributes(attributeSet2, j.AppCompatTextView));
        int e3 = x0Var3.e(j.AppCompatTextView_drawableLeftCompat, -1);
        Drawable a4 = e3 != -1 ? a2.a(context, e3) : null;
        int e4 = x0Var3.e(j.AppCompatTextView_drawableTopCompat, -1);
        Drawable a5 = e4 != -1 ? a2.a(context, e4) : null;
        int e5 = x0Var3.e(j.AppCompatTextView_drawableRightCompat, -1);
        Drawable a6 = e5 != -1 ? a2.a(context, e5) : null;
        int e6 = x0Var3.e(j.AppCompatTextView_drawableBottomCompat, -1);
        Drawable a7 = e6 != -1 ? a2.a(context, e6) : null;
        int e7 = x0Var3.e(j.AppCompatTextView_drawableStartCompat, -1);
        Drawable a8 = e7 != -1 ? a2.a(context, e7) : null;
        int e8 = x0Var3.e(j.AppCompatTextView_drawableEndCompat, -1);
        Drawable a9 = e8 != -1 ? a2.a(context, e8) : null;
        if (a8 != null || a9 != null) {
            Drawable[] compoundDrawablesRelative = this.f187a.getCompoundDrawablesRelative();
            TextView textView = this.f187a;
            if (a8 == null) {
                a8 = compoundDrawablesRelative[0];
            }
            if (a5 == null) {
                a5 = compoundDrawablesRelative[1];
            }
            if (a9 == null) {
                a9 = compoundDrawablesRelative[2];
            }
            if (a7 == null) {
                a7 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(a8, a5, a9, a7);
        } else if (!(a4 == null && a5 == null && a6 == null && a7 == null)) {
            Drawable[] compoundDrawablesRelative2 = this.f187a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.f187a.getCompoundDrawables();
                TextView textView2 = this.f187a;
                if (a4 == null) {
                    a4 = compoundDrawables[0];
                }
                if (a5 == null) {
                    a5 = compoundDrawables[1];
                }
                if (a6 == null) {
                    a6 = compoundDrawables[2];
                }
                if (a7 == null) {
                    a7 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(a4, a5, a6, a7);
            } else {
                TextView textView3 = this.f187a;
                Drawable drawable = compoundDrawablesRelative2[0];
                if (a5 == null) {
                    a5 = compoundDrawablesRelative2[1];
                }
                Drawable drawable2 = compoundDrawablesRelative2[2];
                if (a7 == null) {
                    a7 = compoundDrawablesRelative2[3];
                }
                textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, a5, drawable2, a7);
            }
        }
        if (x0Var3.f(j.AppCompatTextView_drawableTint)) {
            ColorStateList a10 = x0Var3.a(j.AppCompatTextView_drawableTint);
            TextView textView4 = this.f187a;
            if (textView4 != null) {
                textView4.setCompoundDrawableTintList(a10);
            } else {
                throw null;
            }
        }
        if (x0Var3.f(j.AppCompatTextView_drawableTintMode)) {
            PorterDuff.Mode a11 = e0.a(x0Var3.c(j.AppCompatTextView_drawableTintMode, -1), (PorterDuff.Mode) null);
            TextView textView5 = this.f187a;
            if (textView5 != null) {
                textView5.setCompoundDrawableTintMode(a11);
            } else {
                throw null;
            }
        }
        int b2 = x0Var3.b(j.AppCompatTextView_firstBaselineToTopHeight, -1);
        int b3 = x0Var3.b(j.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int b4 = x0Var3.b(j.AppCompatTextView_lineHeight, -1);
        x0Var3.f186b.recycle();
        if (b2 != -1) {
            o.a(this.f187a, b2);
        }
        if (b3 != -1) {
            o.b(this.f187a, b3);
        }
        if (b4 != -1) {
            o.c(this.f187a, b4);
        }
    }

    public boolean b() {
        a0 a0Var = this.i;
        return a0Var.d() && a0Var.f109a != 0;
    }

    public void a(Context context, int i2) {
        String d2;
        x0 x0Var = new x0(context, context.obtainStyledAttributes(i2, j.TextAppearance));
        if (x0Var.f(j.TextAppearance_textAllCaps)) {
            this.f187a.setAllCaps(x0Var.a(j.TextAppearance_textAllCaps, false));
        }
        if (x0Var.f(j.TextAppearance_android_textSize) && x0Var.b(j.TextAppearance_android_textSize, -1) == 0) {
            this.f187a.setTextSize(0, 0.0f);
        }
        a(context, x0Var);
        if (Build.VERSION.SDK_INT >= 26 && x0Var.f(j.TextAppearance_fontVariationSettings) && (d2 = x0Var.d(j.TextAppearance_fontVariationSettings)) != null) {
            this.f187a.setFontVariationSettings(d2);
        }
        x0Var.f186b.recycle();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.f187a.setTypeface(typeface, this.j);
        }
    }

    public void a(int i2, int i3, int i4, int i5) {
        a0 a0Var = this.i;
        if (a0Var.d()) {
            DisplayMetrics displayMetrics = a0Var.j.getResources().getDisplayMetrics();
            a0Var.a(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (a0Var.b()) {
                a0Var.a();
            }
        }
    }

    public void a(int[] iArr, int i2) {
        a0 a0Var = this.i;
        if (a0Var.d()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = a0Var.j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                    }
                }
                a0Var.f = a0Var.a(iArr2);
                if (!a0Var.c()) {
                    StringBuilder a2 = b.a.a.a.a.a("None of the preset sizes is valid: ");
                    a2.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(a2.toString());
                }
            } else {
                a0Var.g = false;
            }
            if (a0Var.b()) {
                a0Var.a();
            }
        }
    }

    public void a(int i2) {
        a0 a0Var = this.i;
        if (!a0Var.d()) {
            return;
        }
        if (i2 == 0) {
            a0Var.f109a = 0;
            a0Var.d = -1.0f;
            a0Var.e = -1.0f;
            a0Var.c = -1.0f;
            a0Var.f = new int[0];
            a0Var.f110b = false;
        } else if (i2 == 1) {
            DisplayMetrics displayMetrics = a0Var.j.getResources().getDisplayMetrics();
            a0Var.a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (a0Var.b()) {
                a0Var.a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
        }
    }
}
