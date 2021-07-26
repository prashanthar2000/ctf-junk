package a.f.i;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;

public class a implements Spannable {

    /* renamed from: a.f.i.a$a  reason: collision with other inner class name */
    public static final class C0016a {

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f309a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f310b;
        public final int c;
        public final int d;
        public final PrecomputedText.Params e = null;

        public C0016a(PrecomputedText.Params params) {
            this.f309a = params.getTextPaint();
            this.f310b = params.getTextDirection();
            this.c = params.getBreakStrategy();
            this.d = params.getHyphenationFrequency();
        }

        public C0016a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f309a = textPaint;
            this.f310b = textDirectionHeuristic;
            this.c = i;
            this.d = i2;
        }

        public boolean a(C0016a aVar) {
            PrecomputedText.Params params = this.e;
            if (params != null) {
                return params.equals(aVar.e);
            }
            if (this.c != aVar.c || this.d != aVar.d || this.f309a.getTextSize() != aVar.f309a.getTextSize() || this.f309a.getTextScaleX() != aVar.f309a.getTextScaleX() || this.f309a.getTextSkewX() != aVar.f309a.getTextSkewX() || this.f309a.getLetterSpacing() != aVar.f309a.getLetterSpacing() || !TextUtils.equals(this.f309a.getFontFeatureSettings(), aVar.f309a.getFontFeatureSettings()) || this.f309a.getFlags() != aVar.f309a.getFlags()) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (!this.f309a.getTextLocales().equals(aVar.f309a.getTextLocales())) {
                    return false;
                }
            } else if (!this.f309a.getTextLocale().equals(aVar.f309a.getTextLocale())) {
                return false;
            }
            if (this.f309a.getTypeface() == null) {
                if (aVar.f309a.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f309a.getTypeface().equals(aVar.f309a.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0016a)) {
                return false;
            }
            C0016a aVar = (C0016a) obj;
            return a(aVar) && this.f310b == aVar.f310b;
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return Objects.hash(new Object[]{Float.valueOf(this.f309a.getTextSize()), Float.valueOf(this.f309a.getTextScaleX()), Float.valueOf(this.f309a.getTextSkewX()), Float.valueOf(this.f309a.getLetterSpacing()), Integer.valueOf(this.f309a.getFlags()), this.f309a.getTextLocales(), this.f309a.getTypeface(), Boolean.valueOf(this.f309a.isElegantTextHeight()), this.f310b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
            }
            return Objects.hash(new Object[]{Float.valueOf(this.f309a.getTextSize()), Float.valueOf(this.f309a.getTextScaleX()), Float.valueOf(this.f309a.getTextSkewX()), Float.valueOf(this.f309a.getLetterSpacing()), Integer.valueOf(this.f309a.getFlags()), this.f309a.getTextLocale(), this.f309a.getTypeface(), Boolean.valueOf(this.f309a.isElegantTextHeight()), this.f310b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
        }

        public String toString() {
            Object obj;
            StringBuilder sb;
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder a2 = b.a.a.a.a.a("textSize=");
            a2.append(this.f309a.getTextSize());
            sb2.append(a2.toString());
            sb2.append(", textScaleX=" + this.f309a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f309a.getTextSkewX());
            sb2.append(", letterSpacing=" + this.f309a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f309a.isElegantTextHeight());
            if (Build.VERSION.SDK_INT >= 24) {
                sb = b.a.a.a.a.a(", textLocale=");
                obj = this.f309a.getTextLocales();
            } else {
                sb = b.a.a.a.a.a(", textLocale=");
                obj = this.f309a.getTextLocale();
            }
            sb.append(obj);
            sb2.append(sb.toString());
            StringBuilder a3 = b.a.a.a.a.a(", typeface=");
            a3.append(this.f309a.getTypeface());
            sb2.append(a3.toString());
            if (Build.VERSION.SDK_INT >= 26) {
                StringBuilder a4 = b.a.a.a.a.a(", variationSettings=");
                a4.append(this.f309a.getFontVariationSettings());
                sb2.append(a4.toString());
            }
            StringBuilder a5 = b.a.a.a.a.a(", textDir=");
            a5.append(this.f310b);
            sb2.append(a5.toString());
            sb2.append(", breakStrategy=" + this.c);
            sb2.append(", hyphenationFrequency=" + this.d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    public char charAt(int i) {
        throw null;
    }

    public int getSpanEnd(Object obj) {
        throw null;
    }

    public int getSpanFlags(Object obj) {
        throw null;
    }

    public int getSpanStart(Object obj) {
        throw null;
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        throw null;
    }

    public int length() {
        throw null;
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        throw null;
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        throw null;
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        throw null;
    }

    public CharSequence subSequence(int i, int i2) {
        throw null;
    }

    public String toString() {
        throw null;
    }
}
