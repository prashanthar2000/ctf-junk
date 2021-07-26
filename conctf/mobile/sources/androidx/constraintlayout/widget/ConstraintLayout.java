package androidx.constraintlayout.widget;

import a.e.a.h.d;
import a.e.a.h.e;
import a.e.a.h.g;
import a.e.b.b;
import a.e.b.c;
import a.e.b.f;
import a.e.b.h;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public SparseArray<View> f503b = new SparseArray<>();
    public ArrayList<b> c = new ArrayList<>(4);
    public final ArrayList<d> d = new ArrayList<>(100);
    public e e = new e();
    public int f = 0;
    public int g = 0;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public boolean j = true;
    public int k = 7;
    public c l = null;
    public int m = -1;
    public HashMap<String, Integer> n = new HashMap<>();
    public int o = -1;
    public int p = -1;

    public static class a extends ViewGroup.MarginLayoutParams {
        public float A = 0.5f;
        public String B = null;
        public int C = 1;
        public float D = -1.0f;
        public float E = -1.0f;
        public int F = 0;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public float N = 1.0f;
        public float O = 1.0f;
        public int P = -1;
        public int Q = -1;
        public int R = -1;
        public boolean S = false;
        public boolean T = false;
        public boolean U = true;
        public boolean V = true;
        public boolean W = false;
        public boolean X = false;
        public boolean Y = false;
        public boolean Z = false;

        /* renamed from: a  reason: collision with root package name */
        public int f504a = -1;
        public int a0 = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f505b = -1;
        public int b0 = -1;
        public float c = -1.0f;
        public int c0 = -1;
        public int d = -1;
        public int d0 = -1;
        public int e = -1;
        public int e0 = -1;
        public int f = -1;
        public int f0 = -1;
        public int g = -1;
        public float g0 = 0.5f;
        public int h = -1;
        public int h0;
        public int i = -1;
        public int i0;
        public int j = -1;
        public float j0;
        public int k = -1;
        public d k0 = new d();
        public int l = -1;
        public boolean l0 = false;
        public int m = -1;
        public int n = 0;
        public float o = 0.0f;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public int x = -1;
        public int y = -1;
        public float z = 0.5f;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a  reason: collision with other inner class name */
        public static class C0027a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f506a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f506a = sparseIntArray;
                sparseIntArray.append(h.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f506a.append(h.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f506a.append(h.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f506a.append(h.ConstraintLayout_Layout_android_orientation, 1);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f506a.append(h.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f506a.append(h.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f506a.append(h.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f506a.append(h.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f506a.append(h.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f506a.append(h.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f506a.append(h.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f506a.append(h.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f506a.append(h.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }
        }

        public a(int i2, int i3) {
            super(i2, i3);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0204, code lost:
            android.util.Log.e("ConstraintLayout", r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(android.content.Context r10, android.util.AttributeSet r11) {
            /*
                r9 = this;
                r9.<init>(r10, r11)
                r0 = -1
                r9.f504a = r0
                r9.f505b = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r9.c = r1
                r9.d = r0
                r9.e = r0
                r9.f = r0
                r9.g = r0
                r9.h = r0
                r9.i = r0
                r9.j = r0
                r9.k = r0
                r9.l = r0
                r9.m = r0
                r2 = 0
                r9.n = r2
                r3 = 0
                r9.o = r3
                r9.p = r0
                r9.q = r0
                r9.r = r0
                r9.s = r0
                r9.t = r0
                r9.u = r0
                r9.v = r0
                r9.w = r0
                r9.x = r0
                r9.y = r0
                r4 = 1056964608(0x3f000000, float:0.5)
                r9.z = r4
                r9.A = r4
                r5 = 0
                r9.B = r5
                r5 = 1
                r9.C = r5
                r9.D = r1
                r9.E = r1
                r9.F = r2
                r9.G = r2
                r9.H = r2
                r9.I = r2
                r9.J = r2
                r9.K = r2
                r9.L = r2
                r9.M = r2
                r1 = 1065353216(0x3f800000, float:1.0)
                r9.N = r1
                r9.O = r1
                r9.P = r0
                r9.Q = r0
                r9.R = r0
                r9.S = r2
                r9.T = r2
                r9.U = r5
                r9.V = r5
                r9.W = r2
                r9.X = r2
                r9.Y = r2
                r9.Z = r2
                r9.a0 = r0
                r9.b0 = r0
                r9.c0 = r0
                r9.d0 = r0
                r9.e0 = r0
                r9.f0 = r0
                r9.g0 = r4
                a.e.a.h.d r1 = new a.e.a.h.d
                r1.<init>()
                r9.k0 = r1
                r9.l0 = r2
                int[] r1 = a.e.b.h.ConstraintLayout_Layout
                android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r1)
                int r11 = r10.getIndexCount()
                r1 = r2
            L_0x0098:
                if (r1 >= r11) goto L_0x03ab
                int r4 = r10.getIndex(r1)
                android.util.SparseIntArray r6 = androidx.constraintlayout.widget.ConstraintLayout.a.C0027a.f506a
                int r6 = r6.get(r4)
                java.lang.String r7 = "ConstraintLayout"
                r8 = -2
                switch(r6) {
                    case 1: goto L_0x039f;
                    case 2: goto L_0x038e;
                    case 3: goto L_0x0385;
                    case 4: goto L_0x0370;
                    case 5: goto L_0x0367;
                    case 6: goto L_0x035e;
                    case 7: goto L_0x0355;
                    case 8: goto L_0x0344;
                    case 9: goto L_0x0333;
                    case 10: goto L_0x0321;
                    case 11: goto L_0x030f;
                    case 12: goto L_0x02fd;
                    case 13: goto L_0x02eb;
                    case 14: goto L_0x02d9;
                    case 15: goto L_0x02c7;
                    case 16: goto L_0x02b5;
                    case 17: goto L_0x02a3;
                    case 18: goto L_0x0291;
                    case 19: goto L_0x027f;
                    case 20: goto L_0x026d;
                    case 21: goto L_0x0263;
                    case 22: goto L_0x0259;
                    case 23: goto L_0x024f;
                    case 24: goto L_0x0245;
                    case 25: goto L_0x023b;
                    case 26: goto L_0x0231;
                    case 27: goto L_0x0227;
                    case 28: goto L_0x021d;
                    case 29: goto L_0x0213;
                    case 30: goto L_0x0209;
                    case 31: goto L_0x01fa;
                    case 32: goto L_0x01ef;
                    case 33: goto L_0x01d9;
                    case 34: goto L_0x01c3;
                    case 35: goto L_0x01b5;
                    case 36: goto L_0x019f;
                    case 37: goto L_0x0189;
                    case 38: goto L_0x017b;
                    default: goto L_0x00aa;
                }
            L_0x00aa:
                switch(r6) {
                    case 44: goto L_0x00e7;
                    case 45: goto L_0x00dd;
                    case 46: goto L_0x00d3;
                    case 47: goto L_0x00cb;
                    case 48: goto L_0x00c3;
                    case 49: goto L_0x00b9;
                    case 50: goto L_0x00af;
                    default: goto L_0x00ad;
                }
            L_0x00ad:
                goto L_0x03a7
            L_0x00af:
                int r6 = r9.Q
                int r4 = r10.getDimensionPixelOffset(r4, r6)
                r9.Q = r4
                goto L_0x03a7
            L_0x00b9:
                int r6 = r9.P
                int r4 = r10.getDimensionPixelOffset(r4, r6)
                r9.P = r4
                goto L_0x03a7
            L_0x00c3:
                int r4 = r10.getInt(r4, r2)
                r9.G = r4
                goto L_0x03a7
            L_0x00cb:
                int r4 = r10.getInt(r4, r2)
                r9.F = r4
                goto L_0x03a7
            L_0x00d3:
                float r6 = r9.E
                float r4 = r10.getFloat(r4, r6)
                r9.E = r4
                goto L_0x03a7
            L_0x00dd:
                float r6 = r9.D
                float r4 = r10.getFloat(r4, r6)
                r9.D = r4
                goto L_0x03a7
            L_0x00e7:
                java.lang.String r4 = r10.getString(r4)
                r9.B = r4
                r9.C = r0
                if (r4 == 0) goto L_0x03a7
                int r4 = r4.length()
                java.lang.String r6 = r9.B
                r7 = 44
                int r6 = r6.indexOf(r7)
                if (r6 <= 0) goto L_0x0121
                int r7 = r4 + -1
                if (r6 >= r7) goto L_0x0121
                java.lang.String r7 = r9.B
                java.lang.String r7 = r7.substring(r2, r6)
                java.lang.String r8 = "W"
                boolean r8 = r7.equalsIgnoreCase(r8)
                if (r8 == 0) goto L_0x0114
                r9.C = r2
                goto L_0x011e
            L_0x0114:
                java.lang.String r8 = "H"
                boolean r7 = r7.equalsIgnoreCase(r8)
                if (r7 == 0) goto L_0x011e
                r9.C = r5
            L_0x011e:
                int r6 = r6 + 1
                goto L_0x0122
            L_0x0121:
                r6 = r2
            L_0x0122:
                java.lang.String r7 = r9.B
                r8 = 58
                int r7 = r7.indexOf(r8)
                if (r7 < 0) goto L_0x016a
                int r4 = r4 + -1
                if (r7 >= r4) goto L_0x016a
                java.lang.String r4 = r9.B
                java.lang.String r4 = r4.substring(r6, r7)
                java.lang.String r6 = r9.B
                int r7 = r7 + 1
                java.lang.String r6 = r6.substring(r7)
                int r7 = r4.length()
                if (r7 <= 0) goto L_0x03a7
                int r7 = r6.length()
                if (r7 <= 0) goto L_0x03a7
                float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03a7 }
                float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ NumberFormatException -> 0x03a7 }
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x03a7
                int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x03a7
                int r7 = r9.C     // Catch:{ NumberFormatException -> 0x03a7 }
                if (r7 != r5) goto L_0x0164
                float r6 = r6 / r4
                java.lang.Math.abs(r6)     // Catch:{ NumberFormatException -> 0x03a7 }
                goto L_0x03a7
            L_0x0164:
                float r4 = r4 / r6
                java.lang.Math.abs(r4)     // Catch:{ NumberFormatException -> 0x03a7 }
                goto L_0x03a7
            L_0x016a:
                java.lang.String r4 = r9.B
                java.lang.String r4 = r4.substring(r6)
                int r6 = r4.length()
                if (r6 <= 0) goto L_0x03a7
                java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03a7 }
                goto L_0x03a7
            L_0x017b:
                float r6 = r9.O
                float r4 = r10.getFloat(r4, r6)
                float r4 = java.lang.Math.max(r3, r4)
                r9.O = r4
                goto L_0x03a7
            L_0x0189:
                int r6 = r9.M     // Catch:{ Exception -> 0x0193 }
                int r6 = r10.getDimensionPixelSize(r4, r6)     // Catch:{ Exception -> 0x0193 }
                r9.M = r6     // Catch:{ Exception -> 0x0193 }
                goto L_0x03a7
            L_0x0193:
                int r6 = r9.M
                int r4 = r10.getInt(r4, r6)
                if (r4 != r8) goto L_0x03a7
                r9.M = r8
                goto L_0x03a7
            L_0x019f:
                int r6 = r9.K     // Catch:{ Exception -> 0x01a9 }
                int r6 = r10.getDimensionPixelSize(r4, r6)     // Catch:{ Exception -> 0x01a9 }
                r9.K = r6     // Catch:{ Exception -> 0x01a9 }
                goto L_0x03a7
            L_0x01a9:
                int r6 = r9.K
                int r4 = r10.getInt(r4, r6)
                if (r4 != r8) goto L_0x03a7
                r9.K = r8
                goto L_0x03a7
            L_0x01b5:
                float r6 = r9.N
                float r4 = r10.getFloat(r4, r6)
                float r4 = java.lang.Math.max(r3, r4)
                r9.N = r4
                goto L_0x03a7
            L_0x01c3:
                int r6 = r9.L     // Catch:{ Exception -> 0x01cd }
                int r6 = r10.getDimensionPixelSize(r4, r6)     // Catch:{ Exception -> 0x01cd }
                r9.L = r6     // Catch:{ Exception -> 0x01cd }
                goto L_0x03a7
            L_0x01cd:
                int r6 = r9.L
                int r4 = r10.getInt(r4, r6)
                if (r4 != r8) goto L_0x03a7
                r9.L = r8
                goto L_0x03a7
            L_0x01d9:
                int r6 = r9.J     // Catch:{ Exception -> 0x01e3 }
                int r6 = r10.getDimensionPixelSize(r4, r6)     // Catch:{ Exception -> 0x01e3 }
                r9.J = r6     // Catch:{ Exception -> 0x01e3 }
                goto L_0x03a7
            L_0x01e3:
                int r6 = r9.J
                int r4 = r10.getInt(r4, r6)
                if (r4 != r8) goto L_0x03a7
                r9.J = r8
                goto L_0x03a7
            L_0x01ef:
                int r4 = r10.getInt(r4, r2)
                r9.I = r4
                if (r4 != r5) goto L_0x03a7
                java.lang.String r4 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
                goto L_0x0204
            L_0x01fa:
                int r4 = r10.getInt(r4, r2)
                r9.H = r4
                if (r4 != r5) goto L_0x03a7
                java.lang.String r4 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
            L_0x0204:
                android.util.Log.e(r7, r4)
                goto L_0x03a7
            L_0x0209:
                float r6 = r9.A
                float r4 = r10.getFloat(r4, r6)
                r9.A = r4
                goto L_0x03a7
            L_0x0213:
                float r6 = r9.z
                float r4 = r10.getFloat(r4, r6)
                r9.z = r4
                goto L_0x03a7
            L_0x021d:
                boolean r6 = r9.T
                boolean r4 = r10.getBoolean(r4, r6)
                r9.T = r4
                goto L_0x03a7
            L_0x0227:
                boolean r6 = r9.S
                boolean r4 = r10.getBoolean(r4, r6)
                r9.S = r4
                goto L_0x03a7
            L_0x0231:
                int r6 = r9.y
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.y = r4
                goto L_0x03a7
            L_0x023b:
                int r6 = r9.x
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.x = r4
                goto L_0x03a7
            L_0x0245:
                int r6 = r9.w
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.w = r4
                goto L_0x03a7
            L_0x024f:
                int r6 = r9.v
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.v = r4
                goto L_0x03a7
            L_0x0259:
                int r6 = r9.u
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.u = r4
                goto L_0x03a7
            L_0x0263:
                int r6 = r9.t
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.t = r4
                goto L_0x03a7
            L_0x026d:
                int r6 = r9.s
                int r6 = r10.getResourceId(r4, r6)
                r9.s = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.s = r4
                goto L_0x03a7
            L_0x027f:
                int r6 = r9.r
                int r6 = r10.getResourceId(r4, r6)
                r9.r = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.r = r4
                goto L_0x03a7
            L_0x0291:
                int r6 = r9.q
                int r6 = r10.getResourceId(r4, r6)
                r9.q = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.q = r4
                goto L_0x03a7
            L_0x02a3:
                int r6 = r9.p
                int r6 = r10.getResourceId(r4, r6)
                r9.p = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.p = r4
                goto L_0x03a7
            L_0x02b5:
                int r6 = r9.l
                int r6 = r10.getResourceId(r4, r6)
                r9.l = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.l = r4
                goto L_0x03a7
            L_0x02c7:
                int r6 = r9.k
                int r6 = r10.getResourceId(r4, r6)
                r9.k = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.k = r4
                goto L_0x03a7
            L_0x02d9:
                int r6 = r9.j
                int r6 = r10.getResourceId(r4, r6)
                r9.j = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.j = r4
                goto L_0x03a7
            L_0x02eb:
                int r6 = r9.i
                int r6 = r10.getResourceId(r4, r6)
                r9.i = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.i = r4
                goto L_0x03a7
            L_0x02fd:
                int r6 = r9.h
                int r6 = r10.getResourceId(r4, r6)
                r9.h = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.h = r4
                goto L_0x03a7
            L_0x030f:
                int r6 = r9.g
                int r6 = r10.getResourceId(r4, r6)
                r9.g = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.g = r4
                goto L_0x03a7
            L_0x0321:
                int r6 = r9.f
                int r6 = r10.getResourceId(r4, r6)
                r9.f = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.f = r4
                goto L_0x03a7
            L_0x0333:
                int r6 = r9.e
                int r6 = r10.getResourceId(r4, r6)
                r9.e = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.e = r4
                goto L_0x03a7
            L_0x0344:
                int r6 = r9.d
                int r6 = r10.getResourceId(r4, r6)
                r9.d = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.d = r4
                goto L_0x03a7
            L_0x0355:
                float r6 = r9.c
                float r4 = r10.getFloat(r4, r6)
                r9.c = r4
                goto L_0x03a7
            L_0x035e:
                int r6 = r9.f505b
                int r4 = r10.getDimensionPixelOffset(r4, r6)
                r9.f505b = r4
                goto L_0x03a7
            L_0x0367:
                int r6 = r9.f504a
                int r4 = r10.getDimensionPixelOffset(r4, r6)
                r9.f504a = r4
                goto L_0x03a7
            L_0x0370:
                float r6 = r9.o
                float r4 = r10.getFloat(r4, r6)
                r6 = 1135869952(0x43b40000, float:360.0)
                float r4 = r4 % r6
                r9.o = r4
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 >= 0) goto L_0x03a7
                float r4 = r6 - r4
                float r4 = r4 % r6
                r9.o = r4
                goto L_0x03a7
            L_0x0385:
                int r6 = r9.n
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.n = r4
                goto L_0x03a7
            L_0x038e:
                int r6 = r9.m
                int r6 = r10.getResourceId(r4, r6)
                r9.m = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.m = r4
                goto L_0x03a7
            L_0x039f:
                int r6 = r9.R
                int r4 = r10.getInt(r4, r6)
                r9.R = r4
            L_0x03a7:
                int r1 = r1 + 1
                goto L_0x0098
            L_0x03ab:
                r10.recycle()
                r9.a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public void a() {
            this.X = false;
            this.U = true;
            this.V = true;
            if (this.width == -2 && this.S) {
                this.U = false;
                this.H = 1;
            }
            if (this.height == -2 && this.T) {
                this.V = false;
                this.I = 1;
            }
            int i2 = this.width;
            if (i2 == 0 || i2 == -1) {
                this.U = false;
                if (this.width == 0 && this.H == 1) {
                    this.width = -2;
                    this.S = true;
                }
            }
            int i3 = this.height;
            if (i3 == 0 || i3 == -1) {
                this.V = false;
                if (this.height == 0 && this.I == 1) {
                    this.height = -2;
                    this.T = true;
                }
            }
            if (this.c != -1.0f || this.f504a != -1 || this.f505b != -1) {
                this.X = true;
                this.U = true;
                this.V = true;
                if (!(this.k0 instanceof g)) {
                    this.k0 = new g();
                }
                ((g) this.k0).g(this.R);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d6, code lost:
            if (r1 > 0) goto L_0x00d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x00e5, code lost:
            if (r1 > 0) goto L_0x00d8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x00ec  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x00f7  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r7) {
            /*
                r6 = this;
                int r0 = r6.leftMargin
                int r1 = r6.rightMargin
                super.resolveLayoutDirection(r7)
                r7 = -1
                r6.c0 = r7
                r6.d0 = r7
                r6.a0 = r7
                r6.b0 = r7
                r6.e0 = r7
                r6.f0 = r7
                int r2 = r6.t
                r6.e0 = r2
                int r2 = r6.v
                r6.f0 = r2
                float r2 = r6.z
                r6.g0 = r2
                int r2 = r6.f504a
                r6.h0 = r2
                int r2 = r6.f505b
                r6.i0 = r2
                float r2 = r6.c
                r6.j0 = r2
                int r2 = r6.getLayoutDirection()
                r3 = 0
                r4 = 1
                if (r4 != r2) goto L_0x0036
                r2 = r4
                goto L_0x0037
            L_0x0036:
                r2 = r3
            L_0x0037:
                if (r2 == 0) goto L_0x0098
                int r2 = r6.p
                if (r2 == r7) goto L_0x0041
                r6.c0 = r2
            L_0x003f:
                r3 = r4
                goto L_0x0048
            L_0x0041:
                int r2 = r6.q
                if (r2 == r7) goto L_0x0048
                r6.d0 = r2
                goto L_0x003f
            L_0x0048:
                int r2 = r6.r
                if (r2 == r7) goto L_0x004f
                r6.b0 = r2
                r3 = r4
            L_0x004f:
                int r2 = r6.s
                if (r2 == r7) goto L_0x0056
                r6.a0 = r2
                r3 = r4
            L_0x0056:
                int r2 = r6.x
                if (r2 == r7) goto L_0x005c
                r6.f0 = r2
            L_0x005c:
                int r2 = r6.y
                if (r2 == r7) goto L_0x0062
                r6.e0 = r2
            L_0x0062:
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x006c
                float r3 = r6.z
                float r3 = r2 - r3
                r6.g0 = r3
            L_0x006c:
                boolean r3 = r6.X
                if (r3 == 0) goto L_0x00bc
                int r3 = r6.R
                if (r3 != r4) goto L_0x00bc
                float r3 = r6.c
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x0084
                float r2 = r2 - r3
                r6.j0 = r2
                r6.h0 = r7
                r6.i0 = r7
                goto L_0x00bc
            L_0x0084:
                int r2 = r6.f504a
                if (r2 == r7) goto L_0x008f
                r6.i0 = r2
                r6.h0 = r7
            L_0x008c:
                r6.j0 = r4
                goto L_0x00bc
            L_0x008f:
                int r2 = r6.f505b
                if (r2 == r7) goto L_0x00bc
                r6.h0 = r2
                r6.i0 = r7
                goto L_0x008c
            L_0x0098:
                int r2 = r6.p
                if (r2 == r7) goto L_0x009e
                r6.b0 = r2
            L_0x009e:
                int r2 = r6.q
                if (r2 == r7) goto L_0x00a4
                r6.a0 = r2
            L_0x00a4:
                int r2 = r6.r
                if (r2 == r7) goto L_0x00aa
                r6.c0 = r2
            L_0x00aa:
                int r2 = r6.s
                if (r2 == r7) goto L_0x00b0
                r6.d0 = r2
            L_0x00b0:
                int r2 = r6.x
                if (r2 == r7) goto L_0x00b6
                r6.e0 = r2
            L_0x00b6:
                int r2 = r6.y
                if (r2 == r7) goto L_0x00bc
                r6.f0 = r2
            L_0x00bc:
                int r2 = r6.r
                if (r2 != r7) goto L_0x0104
                int r2 = r6.s
                if (r2 != r7) goto L_0x0104
                int r2 = r6.q
                if (r2 != r7) goto L_0x0104
                int r2 = r6.p
                if (r2 != r7) goto L_0x0104
                int r2 = r6.f
                if (r2 == r7) goto L_0x00db
                r6.c0 = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00e8
                if (r1 <= 0) goto L_0x00e8
            L_0x00d8:
                r6.rightMargin = r1
                goto L_0x00e8
            L_0x00db:
                int r2 = r6.g
                if (r2 == r7) goto L_0x00e8
                r6.d0 = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00e8
                if (r1 <= 0) goto L_0x00e8
                goto L_0x00d8
            L_0x00e8:
                int r1 = r6.d
                if (r1 == r7) goto L_0x00f7
                r6.a0 = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x0104
                if (r0 <= 0) goto L_0x0104
            L_0x00f4:
                r6.leftMargin = r0
                goto L_0x0104
            L_0x00f7:
                int r1 = r6.e
                if (r1 == r7) goto L_0x0104
                r6.b0 = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x0104
                if (r0 <= 0) goto L_0x0104
                goto L_0x00f4
            L_0x0104:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        a((AttributeSet) null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(attributeSet);
    }

    public final d a(int i2) {
        if (i2 == 0) {
            return this.e;
        }
        View view = this.f503b.get(i2);
        if (view == null && (view = findViewById(i2)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.e;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).k0;
    }

    public final d a(View view) {
        if (view == this) {
            return this.e;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).k0;
    }

    public Object a(int i2, Object obj) {
        if (i2 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.n;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.n.get(str);
    }

    public void a(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.n == null) {
                this.n = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.n.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public final void a(AttributeSet attributeSet) {
        this.e.X = this;
        this.f503b.put(getId(), this);
        this.l = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == h.ConstraintLayout_Layout_android_minWidth) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == h.ConstraintLayout_Layout_android_minHeight) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == h.ConstraintLayout_Layout_android_maxWidth) {
                    this.h = obtainStyledAttributes.getDimensionPixelOffset(index, this.h);
                } else if (index == h.ConstraintLayout_Layout_android_maxHeight) {
                    this.i = obtainStyledAttributes.getDimensionPixelOffset(index, this.i);
                } else if (index == h.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.k = obtainStyledAttributes.getInt(index, this.k);
                } else if (index == h.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        c cVar = new c();
                        this.l = cVar;
                        cVar.a(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.l = null;
                    }
                    this.m = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.e.C0 = this.k;
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = (float) i3;
                        float f3 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f4 = (float) i4;
                        float f5 = f2;
                        float f6 = f2;
                        float f7 = f4;
                        Paint paint2 = paint;
                        float f8 = f3;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f5, f7, f8, f4, paint3);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f9 = f3;
                        float f10 = parseInt4;
                        canvas2.drawLine(f9, f7, f8, f10, paint3);
                        float f11 = parseInt4;
                        float f12 = f6;
                        canvas2.drawLine(f9, f11, f12, f10, paint3);
                        float f13 = f6;
                        canvas2.drawLine(f13, f11, f12, f4, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f14 = f3;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f13, f4, f14, parseInt4, paint6);
                        canvas2.drawLine(f13, parseInt4, f14, f4, paint6);
                    }
                }
            }
        }
    }

    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getMaxHeight() {
        return this.i;
    }

    public int getMaxWidth() {
        return this.h;
    }

    public int getMinHeight() {
        return this.g;
    }

    public int getMinWidth() {
        return this.f;
    }

    public int getOptimizationLevel() {
        return this.e.C0;
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            a aVar = (a) childAt.getLayoutParams();
            d dVar = aVar.k0;
            if ((childAt.getVisibility() != 8 || aVar.X || aVar.Y || isInEditMode) && !aVar.Z) {
                int i8 = dVar.M + dVar.O;
                int i9 = dVar.N + dVar.P;
                int j2 = dVar.j() + i8;
                int d2 = dVar.d() + i9;
                childAt.layout(i8, i9, j2, d2);
                if ((childAt instanceof f) && (content = ((f) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(i8, i9, j2, d2);
                }
            }
        }
        int size = this.c.size();
        if (size > 0) {
            while (i6 < size) {
                if (this.c.get(i6) != null) {
                    i6++;
                } else {
                    throw null;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:377:0x07e4, code lost:
        if (r8.H != 1) goto L_0x07e8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x04f5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x052c  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0568  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x058c  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0640  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0666  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0674  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0705  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0801  */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x0853  */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x0864  */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x0868  */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x094a  */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x0963  */
    /* JADX WARNING: Removed duplicated region for block: B:582:0x0b50  */
    /* JADX WARNING: Removed duplicated region for block: B:585:0x0b84  */
    /* JADX WARNING: Removed duplicated region for block: B:588:0x0b8b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r39, int r40) {
        /*
            r38 = this;
            r0 = r38
            r1 = r39
            r2 = r40
            java.lang.System.currentTimeMillis()
            int r3 = android.view.View.MeasureSpec.getMode(r39)
            int r4 = android.view.View.MeasureSpec.getSize(r39)
            int r5 = android.view.View.MeasureSpec.getMode(r40)
            int r6 = android.view.View.MeasureSpec.getSize(r40)
            int r7 = r38.getPaddingLeft()
            int r8 = r38.getPaddingTop()
            a.e.a.h.e r9 = r0.e
            r9.I = r7
            r9.J = r8
            int r10 = r0.h
            int[] r11 = r9.q
            r12 = 0
            r11[r12] = r10
            int r10 = r0.i
            r13 = 1
            r11[r13] = r10
            int r10 = r38.getLayoutDirection()
            if (r10 != r13) goto L_0x003b
            r10 = r13
            goto L_0x003c
        L_0x003b:
            r10 = r12
        L_0x003c:
            r9.l0 = r10
            int r9 = android.view.View.MeasureSpec.getMode(r39)
            int r10 = android.view.View.MeasureSpec.getSize(r39)
            int r11 = android.view.View.MeasureSpec.getMode(r40)
            int r14 = android.view.View.MeasureSpec.getSize(r40)
            int r15 = r38.getPaddingTop()
            int r16 = r38.getPaddingBottom()
            int r16 = r16 + r15
            int r15 = r38.getPaddingLeft()
            int r17 = r38.getPaddingRight()
            int r17 = r17 + r15
            a.e.a.h.d$a r15 = a.e.a.h.d.a.FIXED
            r38.getLayoutParams()
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 1073741824(0x40000000, float:2.0)
            if (r9 == r13) goto L_0x0081
            if (r9 == 0) goto L_0x007d
            if (r9 == r12) goto L_0x0073
            r9 = r15
            goto L_0x007f
        L_0x0073:
            int r9 = r0.h
            int r9 = java.lang.Math.min(r9, r10)
            int r10 = r9 - r17
            r9 = r15
            goto L_0x0083
        L_0x007d:
            a.e.a.h.d$a r9 = a.e.a.h.d.a.WRAP_CONTENT
        L_0x007f:
            r10 = 0
            goto L_0x0083
        L_0x0081:
            a.e.a.h.d$a r9 = a.e.a.h.d.a.WRAP_CONTENT
        L_0x0083:
            if (r11 == r13) goto L_0x0098
            if (r11 == 0) goto L_0x0093
            if (r11 == r12) goto L_0x008a
            goto L_0x0096
        L_0x008a:
            int r11 = r0.i
            int r11 = java.lang.Math.min(r11, r14)
            int r14 = r11 - r16
            goto L_0x009a
        L_0x0093:
            a.e.a.h.d$a r11 = a.e.a.h.d.a.WRAP_CONTENT
            r15 = r11
        L_0x0096:
            r14 = 0
            goto L_0x009a
        L_0x0098:
            a.e.a.h.d$a r15 = a.e.a.h.d.a.WRAP_CONTENT
        L_0x009a:
            a.e.a.h.e r11 = r0.e
            r12 = 0
            r11.R = r12
            r11.S = r12
            r11.a((a.e.a.h.d.a) r9)
            a.e.a.h.e r9 = r0.e
            r9.f(r10)
            a.e.a.h.e r9 = r0.e
            r9.b((a.e.a.h.d.a) r15)
            a.e.a.h.e r9 = r0.e
            r9.e(r14)
            a.e.a.h.e r9 = r0.e
            int r10 = r0.f
            int r11 = r38.getPaddingLeft()
            int r10 = r10 - r11
            int r11 = r38.getPaddingRight()
            int r10 = r10 - r11
            if (r10 >= 0) goto L_0x00c4
            r10 = 0
        L_0x00c4:
            r9.R = r10
            a.e.a.h.e r9 = r0.e
            int r10 = r0.g
            int r11 = r38.getPaddingTop()
            int r10 = r10 - r11
            int r11 = r38.getPaddingBottom()
            int r10 = r10 - r11
            if (r10 >= 0) goto L_0x00d7
            r10 = 0
        L_0x00d7:
            r9.S = r10
            a.e.a.h.e r9 = r0.e
            int r9 = r9.j()
            a.e.a.h.e r10 = r0.e
            int r10 = r10.d()
            boolean r11 = r0.j
            if (r11 == 0) goto L_0x0768
            r11 = 0
            r0.j = r11
            int r11 = r38.getChildCount()
            r15 = 0
        L_0x00f1:
            if (r15 >= r11) goto L_0x0102
            android.view.View r17 = r0.getChildAt(r15)
            boolean r17 = r17.isLayoutRequested()
            if (r17 == 0) goto L_0x00ff
            r11 = 1
            goto L_0x0103
        L_0x00ff:
            int r15 = r15 + 1
            goto L_0x00f1
        L_0x0102:
            r11 = 0
        L_0x0103:
            if (r11 == 0) goto L_0x075a
            java.util.ArrayList<a.e.a.h.d> r11 = r0.d
            r11.clear()
            boolean r11 = r38.isInEditMode()
            int r15 = r38.getChildCount()
            if (r11 == 0) goto L_0x0156
            r13 = 0
        L_0x0115:
            if (r13 >= r15) goto L_0x0156
            android.view.View r18 = r0.getChildAt(r13)
            android.content.res.Resources r12 = r38.getResources()     // Catch:{ NotFoundException -> 0x014f }
            int r14 = r18.getId()     // Catch:{ NotFoundException -> 0x014f }
            java.lang.String r12 = r12.getResourceName(r14)     // Catch:{ NotFoundException -> 0x014f }
            int r14 = r18.getId()     // Catch:{ NotFoundException -> 0x014f }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ NotFoundException -> 0x014f }
            r19 = r7
            r7 = 0
            r0.a(r7, r12, r14)     // Catch:{ NotFoundException -> 0x0151 }
            r7 = 47
            int r7 = r12.indexOf(r7)     // Catch:{ NotFoundException -> 0x0151 }
            r14 = -1
            if (r7 == r14) goto L_0x0144
            int r7 = r7 + 1
            java.lang.String r12 = r12.substring(r7)     // Catch:{ NotFoundException -> 0x0151 }
        L_0x0144:
            int r7 = r18.getId()     // Catch:{ NotFoundException -> 0x0151 }
            a.e.a.h.d r7 = r0.a((int) r7)     // Catch:{ NotFoundException -> 0x0151 }
            r7.Z = r12     // Catch:{ NotFoundException -> 0x0151 }
            goto L_0x0151
        L_0x014f:
            r19 = r7
        L_0x0151:
            int r13 = r13 + 1
            r7 = r19
            goto L_0x0115
        L_0x0156:
            r19 = r7
            r7 = 0
        L_0x0159:
            if (r7 >= r15) goto L_0x016c
            android.view.View r12 = r0.getChildAt(r7)
            a.e.a.h.d r12 = r0.a((android.view.View) r12)
            if (r12 != 0) goto L_0x0166
            goto L_0x0169
        L_0x0166:
            r12.l()
        L_0x0169:
            int r7 = r7 + 1
            goto L_0x0159
        L_0x016c:
            int r7 = r0.m
            r12 = -1
            if (r7 == r12) goto L_0x018f
            r7 = 0
        L_0x0172:
            if (r7 >= r15) goto L_0x018f
            android.view.View r12 = r0.getChildAt(r7)
            int r13 = r12.getId()
            int r14 = r0.m
            if (r13 != r14) goto L_0x018c
            boolean r13 = r12 instanceof a.e.b.d
            if (r13 == 0) goto L_0x018c
            a.e.b.d r12 = (a.e.b.d) r12
            a.e.b.c r12 = r12.getConstraintSet()
            r0.l = r12
        L_0x018c:
            int r7 = r7 + 1
            goto L_0x0172
        L_0x018f:
            a.e.b.c r7 = r0.l
            if (r7 == 0) goto L_0x0310
            int r12 = r38.getChildCount()
            java.util.HashSet r13 = new java.util.HashSet
            java.util.HashMap<java.lang.Integer, a.e.b.c$a> r14 = r7.f256a
            java.util.Set r14 = r14.keySet()
            r13.<init>(r14)
            r14 = 0
        L_0x01a3:
            if (r14 >= r12) goto L_0x028f
            r18 = r12
            android.view.View r12 = r0.getChildAt(r14)
            r20 = r8
            int r8 = r12.getId()
            r21 = r6
            r6 = -1
            if (r8 == r6) goto L_0x0287
            java.util.HashMap<java.lang.Integer, a.e.b.c$a> r6 = r7.f256a
            r22 = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            boolean r5 = r6.containsKey(r5)
            if (r5 == 0) goto L_0x0273
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r13.remove(r5)
            java.util.HashMap<java.lang.Integer, a.e.b.c$a> r5 = r7.f256a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            java.lang.Object r5 = r5.get(r6)
            a.e.b.c$a r5 = (a.e.b.c.a) r5
            boolean r6 = r12 instanceof a.e.b.a
            if (r6 == 0) goto L_0x01df
            r6 = 1
            r5.t0 = r6
            goto L_0x01e0
        L_0x01df:
            r6 = 1
        L_0x01e0:
            r23 = r4
            int r4 = r5.t0
            r24 = r3
            r3 = -1
            if (r4 == r3) goto L_0x0211
            if (r4 == r6) goto L_0x01ec
            goto L_0x0211
        L_0x01ec:
            r3 = r12
            a.e.b.a r3 = (a.e.b.a) r3
            r3.setId(r8)
            int r4 = r5.s0
            r3.setType(r4)
            boolean r4 = r5.r0
            r3.setAllowsGoneWidget(r4)
            int[] r4 = r5.u0
            if (r4 == 0) goto L_0x0204
            r3.setReferencedIds(r4)
            goto L_0x0211
        L_0x0204:
            java.lang.String r4 = r5.v0
            if (r4 == 0) goto L_0x0211
            int[] r4 = r7.a((android.view.View) r3, (java.lang.String) r4)
            r5.u0 = r4
            r3.setReferencedIds(r4)
        L_0x0211:
            android.view.ViewGroup$LayoutParams r3 = r12.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r3 = (androidx.constraintlayout.widget.ConstraintLayout.a) r3
            r5.a(r3)
            r12.setLayoutParams(r3)
            int r3 = r5.J
            r12.setVisibility(r3)
            float r3 = r5.U
            r12.setAlpha(r3)
            float r3 = r5.X
            r12.setRotation(r3)
            float r3 = r5.Y
            r12.setRotationX(r3)
            float r3 = r5.Z
            r12.setRotationY(r3)
            float r3 = r5.a0
            r12.setScaleX(r3)
            float r3 = r5.b0
            r12.setScaleY(r3)
            float r3 = r5.c0
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L_0x024d
            float r3 = r5.c0
            r12.setPivotX(r3)
        L_0x024d:
            float r3 = r5.d0
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L_0x025a
            float r3 = r5.d0
            r12.setPivotY(r3)
        L_0x025a:
            float r3 = r5.e0
            r12.setTranslationX(r3)
            float r3 = r5.f0
            r12.setTranslationY(r3)
            float r3 = r5.g0
            r12.setTranslationZ(r3)
            boolean r3 = r5.V
            if (r3 == 0) goto L_0x0277
            float r3 = r5.W
            r12.setElevation(r3)
            goto L_0x0277
        L_0x0273:
            r24 = r3
            r23 = r4
        L_0x0277:
            int r14 = r14 + 1
            r12 = r18
            r8 = r20
            r6 = r21
            r5 = r22
            r4 = r23
            r3 = r24
            goto L_0x01a3
        L_0x0287:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            r1.<init>(r2)
            throw r1
        L_0x028f:
            r24 = r3
            r23 = r4
            r22 = r5
            r21 = r6
            r20 = r8
            java.util.Iterator r3 = r13.iterator()
        L_0x029d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x031a
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.util.HashMap<java.lang.Integer, a.e.b.c$a> r5 = r7.f256a
            java.lang.Object r5 = r5.get(r4)
            a.e.b.c$a r5 = (a.e.b.c.a) r5
            int r6 = r5.t0
            r8 = -1
            if (r6 == r8) goto L_0x02f1
            r8 = 1
            if (r6 == r8) goto L_0x02ba
            goto L_0x02f1
        L_0x02ba:
            a.e.b.a r6 = new a.e.b.a
            android.content.Context r8 = r38.getContext()
            r6.<init>(r8)
            int r8 = r4.intValue()
            r6.setId(r8)
            int[] r8 = r5.u0
            if (r8 == 0) goto L_0x02d2
            r6.setReferencedIds(r8)
            goto L_0x02df
        L_0x02d2:
            java.lang.String r8 = r5.v0
            if (r8 == 0) goto L_0x02df
            int[] r8 = r7.a((android.view.View) r6, (java.lang.String) r8)
            r5.u0 = r8
            r6.setReferencedIds(r8)
        L_0x02df:
            int r8 = r5.s0
            r6.setType(r8)
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = r38.generateDefaultLayoutParams()
            r6.a()
            r5.a(r8)
            r0.addView(r6, r8)
        L_0x02f1:
            boolean r6 = r5.f257a
            if (r6 == 0) goto L_0x029d
            a.e.b.e r6 = new a.e.b.e
            android.content.Context r8 = r38.getContext()
            r6.<init>(r8)
            int r4 = r4.intValue()
            r6.setId(r4)
            androidx.constraintlayout.widget.ConstraintLayout$a r4 = r38.generateDefaultLayoutParams()
            r5.a(r4)
            r0.addView(r6, r4)
            goto L_0x029d
        L_0x0310:
            r24 = r3
            r23 = r4
            r22 = r5
            r21 = r6
            r20 = r8
        L_0x031a:
            a.e.a.h.e r3 = r0.e
            java.util.ArrayList<a.e.a.h.d> r3 = r3.k0
            r3.clear()
            java.util.ArrayList<a.e.b.b> r3 = r0.c
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x033a
            r4 = 0
        L_0x032a:
            if (r4 >= r3) goto L_0x033a
            java.util.ArrayList<a.e.b.b> r5 = r0.c
            java.lang.Object r5 = r5.get(r4)
            a.e.b.b r5 = (a.e.b.b) r5
            r5.a((androidx.constraintlayout.widget.ConstraintLayout) r0)
            int r4 = r4 + 1
            goto L_0x032a
        L_0x033a:
            r3 = 0
        L_0x033b:
            if (r3 >= r15) goto L_0x0376
            android.view.View r4 = r0.getChildAt(r3)
            boolean r5 = r4 instanceof a.e.b.f
            if (r5 == 0) goto L_0x0373
            a.e.b.f r4 = (a.e.b.f) r4
            int r5 = r4.f260b
            r6 = -1
            if (r5 != r6) goto L_0x0357
            boolean r5 = r4.isInEditMode()
            if (r5 != 0) goto L_0x0357
            int r5 = r4.d
            r4.setVisibility(r5)
        L_0x0357:
            int r5 = r4.f260b
            android.view.View r5 = r0.findViewById(r5)
            r4.c = r5
            if (r5 == 0) goto L_0x0373
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r5 = (androidx.constraintlayout.widget.ConstraintLayout.a) r5
            r6 = 1
            r5.Z = r6
            android.view.View r5 = r4.c
            r6 = 0
            r5.setVisibility(r6)
            r4.setVisibility(r6)
        L_0x0373:
            int r3 = r3 + 1
            goto L_0x033b
        L_0x0376:
            r3 = 0
        L_0x0377:
            r4 = 0
            if (r3 >= r15) goto L_0x0766
            android.view.View r5 = r0.getChildAt(r3)
            a.e.a.h.d r6 = r0.a((android.view.View) r5)
            if (r6 != 0) goto L_0x0386
            goto L_0x0478
        L_0x0386:
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r7 = (androidx.constraintlayout.widget.ConstraintLayout.a) r7
            r7.a()
            boolean r8 = r7.l0
            if (r8 == 0) goto L_0x0397
            r8 = 0
            r7.l0 = r8
            goto L_0x03c7
        L_0x0397:
            if (r11 == 0) goto L_0x03c7
            android.content.res.Resources r8 = r38.getResources()     // Catch:{ NotFoundException -> 0x03c7 }
            int r12 = r5.getId()     // Catch:{ NotFoundException -> 0x03c7 }
            java.lang.String r8 = r8.getResourceName(r12)     // Catch:{ NotFoundException -> 0x03c7 }
            int r12 = r5.getId()     // Catch:{ NotFoundException -> 0x03c7 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NotFoundException -> 0x03c7 }
            r13 = 0
            r0.a(r13, r8, r12)     // Catch:{ NotFoundException -> 0x03c7 }
            java.lang.String r12 = "id/"
            int r12 = r8.indexOf(r12)     // Catch:{ NotFoundException -> 0x03c7 }
            int r12 = r12 + 3
            java.lang.String r8 = r8.substring(r12)     // Catch:{ NotFoundException -> 0x03c7 }
            int r12 = r5.getId()     // Catch:{ NotFoundException -> 0x03c7 }
            a.e.a.h.d r12 = r0.a((int) r12)     // Catch:{ NotFoundException -> 0x03c7 }
            r12.Z = r8     // Catch:{ NotFoundException -> 0x03c7 }
        L_0x03c7:
            int r8 = r5.getVisibility()
            r6.Y = r8
            boolean r8 = r7.Z
            if (r8 == 0) goto L_0x03d5
            r8 = 8
            r6.Y = r8
        L_0x03d5:
            r6.X = r5
            a.e.a.h.e r5 = r0.e
            java.util.ArrayList<a.e.a.h.d> r8 = r5.k0
            r8.add(r6)
            a.e.a.h.d r8 = r6.D
            if (r8 == 0) goto L_0x03eb
            a.e.a.h.n r8 = (a.e.a.h.n) r8
            java.util.ArrayList<a.e.a.h.d> r8 = r8.k0
            r8.remove(r6)
            r6.D = r4
        L_0x03eb:
            r6.D = r5
            boolean r4 = r7.V
            if (r4 == 0) goto L_0x03f5
            boolean r4 = r7.U
            if (r4 != 0) goto L_0x03fa
        L_0x03f5:
            java.util.ArrayList<a.e.a.h.d> r4 = r0.d
            r4.add(r6)
        L_0x03fa:
            boolean r4 = r7.X
            if (r4 == 0) goto L_0x042e
            a.e.a.h.g r6 = (a.e.a.h.g) r6
            int r4 = r7.h0
            int r5 = r7.i0
            float r7 = r7.j0
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r12 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r12 == 0) goto L_0x0417
            if (r12 <= 0) goto L_0x0478
            r6.k0 = r7
            r12 = -1
            r6.l0 = r12
            r6.m0 = r12
            goto L_0x0478
        L_0x0417:
            r12 = -1
            if (r4 == r12) goto L_0x0423
            if (r4 <= r12) goto L_0x0478
            r6.k0 = r8
            r6.l0 = r4
            r6.m0 = r12
            goto L_0x0478
        L_0x0423:
            if (r5 == r12) goto L_0x0478
            if (r5 <= r12) goto L_0x0478
            r6.k0 = r8
            r6.l0 = r12
            r6.m0 = r5
            goto L_0x0478
        L_0x042e:
            r12 = -1
            int r4 = r7.d
            if (r4 != r12) goto L_0x047c
            int r4 = r7.e
            if (r4 != r12) goto L_0x047c
            int r4 = r7.f
            if (r4 != r12) goto L_0x047c
            int r4 = r7.g
            if (r4 != r12) goto L_0x047c
            int r4 = r7.q
            if (r4 != r12) goto L_0x047c
            int r4 = r7.p
            if (r4 != r12) goto L_0x047c
            int r4 = r7.r
            if (r4 != r12) goto L_0x047c
            int r4 = r7.s
            if (r4 != r12) goto L_0x047c
            int r4 = r7.h
            if (r4 != r12) goto L_0x047c
            int r4 = r7.i
            if (r4 != r12) goto L_0x047c
            int r4 = r7.j
            if (r4 != r12) goto L_0x047c
            int r4 = r7.k
            if (r4 != r12) goto L_0x047c
            int r4 = r7.l
            if (r4 != r12) goto L_0x047c
            int r4 = r7.P
            if (r4 != r12) goto L_0x047c
            int r4 = r7.Q
            if (r4 != r12) goto L_0x047c
            int r4 = r7.m
            if (r4 != r12) goto L_0x047c
            int r4 = r7.width
            if (r4 == r12) goto L_0x047c
            int r4 = r7.height
            if (r4 != r12) goto L_0x0478
            goto L_0x047c
        L_0x0478:
            r18 = r15
            goto L_0x0750
        L_0x047c:
            int r4 = r7.a0
            int r5 = r7.b0
            int r8 = r7.c0
            int r12 = r7.d0
            int r13 = r7.e0
            int r14 = r7.f0
            r18 = r15
            float r15 = r7.g0
            int r2 = r7.m
            r1 = -1
            if (r2 == r1) goto L_0x04ac
            a.e.a.h.d r27 = r0.a((int) r2)
            if (r27 == 0) goto L_0x05f5
            float r1 = r7.o
            int r2 = r7.n
            a.e.a.h.c$c r28 = a.e.a.h.c.C0011c.CENTER
            r30 = 0
            r25 = r6
            r26 = r28
            r29 = r2
            r25.a(r26, r27, r28, r29, r30)
            r6.r = r1
            goto L_0x05f5
        L_0x04ac:
            if (r4 == r1) goto L_0x04c1
            a.e.a.h.d r2 = r0.a((int) r4)
            if (r2 == 0) goto L_0x04de
            a.e.a.h.c$c r4 = a.e.a.h.c.C0011c.LEFT
            int r5 = r7.leftMargin
            r27 = r2
            r26 = r4
            r28 = r26
        L_0x04be:
            r29 = r5
            goto L_0x04d6
        L_0x04c1:
            if (r5 == r1) goto L_0x04de
            a.e.a.h.d r1 = r0.a((int) r5)
            if (r1 == 0) goto L_0x04dd
            a.e.a.h.c$c r2 = a.e.a.h.c.C0011c.LEFT
            a.e.a.h.c$c r4 = a.e.a.h.c.C0011c.RIGHT
            int r5 = r7.leftMargin
            r27 = r1
            r26 = r2
            r28 = r4
            goto L_0x04be
        L_0x04d6:
            r25 = r6
            r30 = r13
            r25.a(r26, r27, r28, r29, r30)
        L_0x04dd:
            r1 = -1
        L_0x04de:
            if (r8 == r1) goto L_0x04f5
            a.e.a.h.d r2 = r0.a((int) r8)
            if (r2 == 0) goto L_0x0510
            a.e.a.h.c$c r4 = a.e.a.h.c.C0011c.RIGHT
            a.e.a.h.c$c r5 = a.e.a.h.c.C0011c.LEFT
            int r8 = r7.rightMargin
            r27 = r2
            r26 = r4
            r28 = r5
            r29 = r8
            goto L_0x0509
        L_0x04f5:
            if (r12 == r1) goto L_0x0510
            a.e.a.h.d r1 = r0.a((int) r12)
            if (r1 == 0) goto L_0x0510
            a.e.a.h.c$c r2 = a.e.a.h.c.C0011c.RIGHT
            int r4 = r7.rightMargin
            r27 = r1
            r26 = r2
            r28 = r26
            r29 = r4
        L_0x0509:
            r25 = r6
            r30 = r14
            r25.a(r26, r27, r28, r29, r30)
        L_0x0510:
            int r1 = r7.h
            r2 = -1
            if (r1 == r2) goto L_0x052c
            a.e.a.h.d r1 = r0.a((int) r1)
            if (r1 == 0) goto L_0x054a
            a.e.a.h.c$c r4 = a.e.a.h.c.C0011c.TOP
            int r5 = r7.topMargin
            int r8 = r7.u
            r27 = r1
            r26 = r4
            r28 = r26
        L_0x0527:
            r29 = r5
            r30 = r8
            goto L_0x0545
        L_0x052c:
            int r1 = r7.i
            if (r1 == r2) goto L_0x054a
            a.e.a.h.d r1 = r0.a((int) r1)
            if (r1 == 0) goto L_0x054a
            a.e.a.h.c$c r2 = a.e.a.h.c.C0011c.TOP
            a.e.a.h.c$c r4 = a.e.a.h.c.C0011c.BOTTOM
            int r5 = r7.topMargin
            int r8 = r7.u
            r27 = r1
            r26 = r2
            r28 = r4
            goto L_0x0527
        L_0x0545:
            r25 = r6
            r25.a(r26, r27, r28, r29, r30)
        L_0x054a:
            int r1 = r7.j
            r2 = -1
            if (r1 == r2) goto L_0x0568
            a.e.a.h.d r1 = r0.a((int) r1)
            if (r1 == 0) goto L_0x0587
            a.e.a.h.c$c r4 = a.e.a.h.c.C0011c.BOTTOM
            a.e.a.h.c$c r5 = a.e.a.h.c.C0011c.TOP
            int r8 = r7.bottomMargin
            int r12 = r7.w
            r27 = r1
            r26 = r4
            r28 = r5
            r29 = r8
            r30 = r12
            goto L_0x0582
        L_0x0568:
            int r1 = r7.k
            if (r1 == r2) goto L_0x0587
            a.e.a.h.d r1 = r0.a((int) r1)
            if (r1 == 0) goto L_0x0587
            a.e.a.h.c$c r2 = a.e.a.h.c.C0011c.BOTTOM
            int r4 = r7.bottomMargin
            int r5 = r7.w
            r27 = r1
            r26 = r2
            r28 = r26
            r29 = r4
            r30 = r5
        L_0x0582:
            r25 = r6
            r25.a(r26, r27, r28, r29, r30)
        L_0x0587:
            int r1 = r7.l
            r2 = -1
            if (r1 == r2) goto L_0x05dc
            android.util.SparseArray<android.view.View> r2 = r0.f503b
            java.lang.Object r1 = r2.get(r1)
            android.view.View r1 = (android.view.View) r1
            int r2 = r7.l
            a.e.a.h.d r2 = r0.a((int) r2)
            if (r2 == 0) goto L_0x05dc
            if (r1 == 0) goto L_0x05dc
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            boolean r4 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.a
            if (r4 == 0) goto L_0x05dc
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r1 = (androidx.constraintlayout.widget.ConstraintLayout.a) r1
            r4 = 1
            r7.W = r4
            r1.W = r4
            a.e.a.h.c$c r1 = a.e.a.h.c.C0011c.BASELINE
            a.e.a.h.c r31 = r6.a((a.e.a.h.c.C0011c) r1)
            a.e.a.h.c$c r1 = a.e.a.h.c.C0011c.BASELINE
            a.e.a.h.c r32 = r2.a((a.e.a.h.c.C0011c) r1)
            r33 = 0
            r34 = -1
            a.e.a.h.c$b r35 = a.e.a.h.c.b.STRONG
            r36 = 0
            r37 = 1
            r31.a(r32, r33, r34, r35, r36, r37)
            a.e.a.h.c$c r1 = a.e.a.h.c.C0011c.TOP
            a.e.a.h.c r1 = r6.a((a.e.a.h.c.C0011c) r1)
            r1.c()
            a.e.a.h.c$c r1 = a.e.a.h.c.C0011c.BOTTOM
            a.e.a.h.c r1 = r6.a((a.e.a.h.c.C0011c) r1)
            r1.c()
        L_0x05dc:
            r1 = 0
            int r2 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            r4 = 1056964608(0x3f000000, float:0.5)
            if (r2 < 0) goto L_0x05e9
            int r2 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x05e9
            r6.V = r15
        L_0x05e9:
            float r2 = r7.A
            int r5 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r5 < 0) goto L_0x05f5
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x05f5
            r6.W = r2
        L_0x05f5:
            if (r11 == 0) goto L_0x0608
            int r1 = r7.P
            r2 = -1
            if (r1 != r2) goto L_0x0600
            int r1 = r7.Q
            if (r1 == r2) goto L_0x0608
        L_0x0600:
            int r1 = r7.P
            int r2 = r7.Q
            r6.I = r1
            r6.J = r2
        L_0x0608:
            boolean r1 = r7.U
            if (r1 != 0) goto L_0x0632
            int r1 = r7.width
            r2 = -1
            if (r1 != r2) goto L_0x062b
            a.e.a.h.d$a r1 = a.e.a.h.d.a.MATCH_PARENT
            r6.a((a.e.a.h.d.a) r1)
            a.e.a.h.c$c r1 = a.e.a.h.c.C0011c.LEFT
            a.e.a.h.c r1 = r6.a((a.e.a.h.c.C0011c) r1)
            int r2 = r7.leftMargin
            r1.e = r2
            a.e.a.h.c$c r1 = a.e.a.h.c.C0011c.RIGHT
            a.e.a.h.c r1 = r6.a((a.e.a.h.c.C0011c) r1)
            int r2 = r7.rightMargin
            r1.e = r2
            goto L_0x063c
        L_0x062b:
            a.e.a.h.d$a r1 = a.e.a.h.d.a.MATCH_CONSTRAINT
            r6.a((a.e.a.h.d.a) r1)
            r1 = 0
            goto L_0x0639
        L_0x0632:
            a.e.a.h.d$a r1 = a.e.a.h.d.a.FIXED
            r6.a((a.e.a.h.d.a) r1)
            int r1 = r7.width
        L_0x0639:
            r6.f(r1)
        L_0x063c:
            boolean r1 = r7.V
            if (r1 != 0) goto L_0x0666
            int r1 = r7.height
            r2 = -1
            if (r1 != r2) goto L_0x065f
            a.e.a.h.d$a r1 = a.e.a.h.d.a.MATCH_PARENT
            r6.b((a.e.a.h.d.a) r1)
            a.e.a.h.c$c r1 = a.e.a.h.c.C0011c.TOP
            a.e.a.h.c r1 = r6.a((a.e.a.h.c.C0011c) r1)
            int r2 = r7.topMargin
            r1.e = r2
            a.e.a.h.c$c r1 = a.e.a.h.c.C0011c.BOTTOM
            a.e.a.h.c r1 = r6.a((a.e.a.h.c.C0011c) r1)
            int r2 = r7.bottomMargin
            r1.e = r2
            goto L_0x0670
        L_0x065f:
            a.e.a.h.d$a r1 = a.e.a.h.d.a.MATCH_CONSTRAINT
            r6.b((a.e.a.h.d.a) r1)
            r1 = 0
            goto L_0x066d
        L_0x0666:
            a.e.a.h.d$a r1 = a.e.a.h.d.a.FIXED
            r6.b((a.e.a.h.d.a) r1)
            int r1 = r7.height
        L_0x066d:
            r6.e(r1)
        L_0x0670:
            java.lang.String r1 = r7.B
            if (r1 == 0) goto L_0x0709
            int r2 = r1.length()
            if (r2 != 0) goto L_0x067f
            r2 = 0
            r6.G = r2
            goto L_0x0709
        L_0x067f:
            int r2 = r1.length()
            r4 = 44
            int r4 = r1.indexOf(r4)
            if (r4 <= 0) goto L_0x06ac
            int r5 = r2 + -1
            if (r4 >= r5) goto L_0x06ac
            r5 = 0
            java.lang.String r8 = r1.substring(r5, r4)
            java.lang.String r5 = "W"
            boolean r5 = r8.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x069e
            r5 = 0
            goto L_0x06a9
        L_0x069e:
            java.lang.String r5 = "H"
            boolean r5 = r8.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x06a8
            r5 = 1
            goto L_0x06a9
        L_0x06a8:
            r5 = -1
        L_0x06a9:
            int r4 = r4 + 1
            goto L_0x06ae
        L_0x06ac:
            r4 = 0
            r5 = -1
        L_0x06ae:
            r8 = 58
            int r8 = r1.indexOf(r8)
            if (r8 < 0) goto L_0x06f0
            int r2 = r2 + -1
            if (r8 >= r2) goto L_0x06f0
            java.lang.String r2 = r1.substring(r4, r8)
            int r8 = r8 + 1
            java.lang.String r1 = r1.substring(r8)
            int r4 = r2.length()
            if (r4 <= 0) goto L_0x06ff
            int r4 = r1.length()
            if (r4 <= 0) goto L_0x06ff
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x06ff }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x06ff }
            r4 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x06ff
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x06ff
            r4 = 1
            if (r5 != r4) goto L_0x06ea
            float r1 = r1 / r2
            float r1 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x06ff }
            goto L_0x0700
        L_0x06ea:
            float r2 = r2 / r1
            float r1 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x06ff }
            goto L_0x0700
        L_0x06f0:
            java.lang.String r1 = r1.substring(r4)
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x06ff
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x06ff }
            goto L_0x0700
        L_0x06ff:
            r1 = 0
        L_0x0700:
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0709
            r6.G = r1
            r6.H = r5
        L_0x0709:
            float r1 = r7.D
            float[] r2 = r6.g0
            r4 = 0
            r2[r4] = r1
            float r1 = r7.E
            r4 = 1
            r2[r4] = r1
            int r1 = r7.F
            r6.e0 = r1
            int r1 = r7.G
            r6.f0 = r1
            int r1 = r7.H
            int r2 = r7.J
            int r4 = r7.L
            float r5 = r7.N
            r6.e = r1
            r6.h = r2
            r6.i = r4
            r6.j = r5
            r2 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r5 = 2
            if (r4 >= 0) goto L_0x0738
            if (r1 != 0) goto L_0x0738
            r6.e = r5
        L_0x0738:
            int r1 = r7.I
            int r4 = r7.K
            int r8 = r7.M
            float r7 = r7.O
            r6.f = r1
            r6.k = r4
            r6.l = r8
            r6.m = r7
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0750
            if (r1 != 0) goto L_0x0750
            r6.f = r5
        L_0x0750:
            int r3 = r3 + 1
            r1 = r39
            r2 = r40
            r15 = r18
            goto L_0x0377
        L_0x075a:
            r24 = r3
            r23 = r4
            r22 = r5
            r21 = r6
            r19 = r7
            r20 = r8
        L_0x0766:
            r1 = 1
            goto L_0x0775
        L_0x0768:
            r24 = r3
            r23 = r4
            r22 = r5
            r21 = r6
            r19 = r7
            r20 = r8
            r1 = 0
        L_0x0775:
            int r2 = r0.k
            r3 = 8
            r2 = r2 & r3
            if (r2 != r3) goto L_0x077e
            r12 = 1
            goto L_0x077f
        L_0x077e:
            r12 = 0
        L_0x077f:
            if (r12 == 0) goto L_0x0794
            a.e.a.h.e r3 = r0.e
            r3.r()
            a.e.a.h.e r3 = r0.e
            r3.d(r9, r10)
            r38.a((int) r39, (int) r40)
        L_0x078e:
            r2 = r39
            r3 = r40
            goto L_0x0884
        L_0x0794:
            int r3 = r38.getPaddingTop()
            int r4 = r38.getPaddingBottom()
            int r4 = r4 + r3
            int r3 = r38.getPaddingLeft()
            int r5 = r38.getPaddingRight()
            int r5 = r5 + r3
            int r3 = r38.getChildCount()
            r6 = 0
        L_0x07ab:
            if (r6 >= r3) goto L_0x078e
            android.view.View r7 = r0.getChildAt(r6)
            int r8 = r7.getVisibility()
            r11 = 8
            if (r8 != r11) goto L_0x07bb
            goto L_0x0878
        L_0x07bb:
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8
            a.e.a.h.d r11 = r8.k0
            boolean r13 = r8.X
            if (r13 != 0) goto L_0x0878
            boolean r13 = r8.Y
            if (r13 == 0) goto L_0x07cd
            goto L_0x0878
        L_0x07cd:
            int r13 = r7.getVisibility()
            r11.Y = r13
            int r13 = r8.width
            int r14 = r8.height
            boolean r15 = r8.U
            if (r15 != 0) goto L_0x07fe
            boolean r2 = r8.V
            if (r2 != 0) goto L_0x07fe
            if (r15 != 0) goto L_0x07e7
            int r2 = r8.H
            r15 = 1
            if (r2 == r15) goto L_0x07fe
            goto L_0x07e8
        L_0x07e7:
            r15 = 1
        L_0x07e8:
            int r2 = r8.width
            r15 = -1
            if (r2 == r15) goto L_0x07fe
            boolean r2 = r8.V
            if (r2 != 0) goto L_0x07fc
            int r2 = r8.I
            r15 = 1
            if (r2 == r15) goto L_0x07fe
            int r2 = r8.height
            r15 = -1
            if (r2 != r15) goto L_0x07fc
            goto L_0x07fe
        L_0x07fc:
            r2 = 0
            goto L_0x07ff
        L_0x07fe:
            r2 = 1
        L_0x07ff:
            if (r2 == 0) goto L_0x0853
            r2 = r39
            if (r13 != 0) goto L_0x080d
            r15 = -2
            int r13 = android.view.ViewGroup.getChildMeasureSpec(r2, r5, r15)
            r25 = 1
            goto L_0x0826
        L_0x080d:
            r15 = -1
            if (r13 != r15) goto L_0x0818
            int r13 = android.view.ViewGroup.getChildMeasureSpec(r2, r5, r15)
            r15 = -2
            r25 = 0
            goto L_0x0826
        L_0x0818:
            r15 = -2
            if (r13 != r15) goto L_0x081e
            r18 = 1
            goto L_0x0820
        L_0x081e:
            r18 = 0
        L_0x0820:
            int r13 = android.view.ViewGroup.getChildMeasureSpec(r2, r5, r13)
            r25 = r18
        L_0x0826:
            r26 = r3
            if (r14 != 0) goto L_0x0832
            r3 = r40
            int r14 = android.view.ViewGroup.getChildMeasureSpec(r3, r4, r15)
            r15 = 1
            goto L_0x0847
        L_0x0832:
            r15 = -1
            r3 = r40
            if (r14 != r15) goto L_0x083d
            int r14 = android.view.ViewGroup.getChildMeasureSpec(r3, r4, r15)
            r15 = 0
            goto L_0x0847
        L_0x083d:
            r15 = -2
            if (r14 != r15) goto L_0x0842
            r15 = 1
            goto L_0x0843
        L_0x0842:
            r15 = 0
        L_0x0843:
            int r14 = android.view.ViewGroup.getChildMeasureSpec(r3, r4, r14)
        L_0x0847:
            r7.measure(r13, r14)
            int r13 = r7.getMeasuredWidth()
            int r14 = r7.getMeasuredHeight()
            goto L_0x085c
        L_0x0853:
            r2 = r39
            r26 = r3
            r3 = r40
            r15 = 0
            r25 = 0
        L_0x085c:
            r11.f(r13)
            r11.e(r14)
            if (r25 == 0) goto L_0x0866
            r11.T = r13
        L_0x0866:
            if (r15 == 0) goto L_0x086a
            r11.U = r14
        L_0x086a:
            boolean r8 = r8.W
            if (r8 == 0) goto L_0x087e
            int r7 = r7.getBaseline()
            r8 = -1
            if (r7 == r8) goto L_0x087e
            r11.Q = r7
            goto L_0x087e
        L_0x0878:
            r2 = r39
            r26 = r3
            r3 = r40
        L_0x087e:
            int r6 = r6 + 1
            r3 = r26
            goto L_0x07ab
        L_0x0884:
            r38.a()
            int r4 = r38.getChildCount()
            if (r4 <= 0) goto L_0x0894
            if (r1 == 0) goto L_0x0894
            a.e.a.h.e r1 = r0.e
            a.b.k.o.a((a.e.a.h.e) r1)
        L_0x0894:
            a.e.a.h.e r1 = r0.e
            boolean r4 = r1.x0
            if (r4 == 0) goto L_0x08e1
            boolean r4 = r1.y0
            if (r4 == 0) goto L_0x08b8
            r4 = r24
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r5) goto L_0x08b5
            int r5 = r1.A0
            r6 = r23
            if (r5 >= r6) goto L_0x08ad
            r1.f(r5)
        L_0x08ad:
            a.e.a.h.e r1 = r0.e
            a.e.a.h.d$a r5 = a.e.a.h.d.a.FIXED
            r1.a((a.e.a.h.d.a) r5)
            goto L_0x08bc
        L_0x08b5:
            r6 = r23
            goto L_0x08bc
        L_0x08b8:
            r6 = r23
            r4 = r24
        L_0x08bc:
            a.e.a.h.e r1 = r0.e
            boolean r5 = r1.z0
            if (r5 == 0) goto L_0x08dc
            r5 = r22
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r7) goto L_0x08d9
            int r7 = r1.B0
            r8 = r21
            if (r7 >= r8) goto L_0x08d1
            r1.e(r7)
        L_0x08d1:
            a.e.a.h.e r1 = r0.e
            a.e.a.h.d$a r7 = a.e.a.h.d.a.FIXED
            r1.b((a.e.a.h.d.a) r7)
            goto L_0x08e9
        L_0x08d9:
            r8 = r21
            goto L_0x08e9
        L_0x08dc:
            r8 = r21
            r5 = r22
            goto L_0x08e9
        L_0x08e1:
            r8 = r21
            r5 = r22
            r6 = r23
            r4 = r24
        L_0x08e9:
            int r1 = r0.k
            r7 = 32
            r1 = r1 & r7
            if (r1 != r7) goto L_0x0942
            a.e.a.h.e r1 = r0.e
            int r1 = r1.j()
            a.e.a.h.e r7 = r0.e
            int r7 = r7.d()
            int r11 = r0.o
            if (r11 == r1) goto L_0x090d
            r11 = 1073741824(0x40000000, float:2.0)
            if (r4 != r11) goto L_0x090f
            a.e.a.h.e r4 = r0.e
            java.util.List<a.e.a.h.f> r4 = r4.w0
            r13 = 0
            a.b.k.o.a((java.util.List<a.e.a.h.f>) r4, (int) r13, (int) r1)
            goto L_0x090f
        L_0x090d:
            r11 = 1073741824(0x40000000, float:2.0)
        L_0x090f:
            int r1 = r0.p
            if (r1 == r7) goto L_0x091d
            if (r5 != r11) goto L_0x091d
            a.e.a.h.e r1 = r0.e
            java.util.List<a.e.a.h.f> r1 = r1.w0
            r4 = 1
            a.b.k.o.a((java.util.List<a.e.a.h.f>) r1, (int) r4, (int) r7)
        L_0x091d:
            a.e.a.h.e r1 = r0.e
            boolean r4 = r1.y0
            if (r4 == 0) goto L_0x092e
            int r4 = r1.A0
            if (r4 <= r6) goto L_0x092e
            java.util.List<a.e.a.h.f> r1 = r1.w0
            r4 = 0
            a.b.k.o.a((java.util.List<a.e.a.h.f>) r1, (int) r4, (int) r6)
            goto L_0x092f
        L_0x092e:
            r4 = 0
        L_0x092f:
            a.e.a.h.e r1 = r0.e
            boolean r5 = r1.z0
            if (r5 == 0) goto L_0x0940
            int r5 = r1.B0
            if (r5 <= r8) goto L_0x0940
            java.util.List<a.e.a.h.f> r1 = r1.w0
            r5 = 1
            a.b.k.o.a((java.util.List<a.e.a.h.f>) r1, (int) r5, (int) r8)
            goto L_0x0944
        L_0x0940:
            r5 = 1
            goto L_0x0944
        L_0x0942:
            r4 = 0
            goto L_0x0940
        L_0x0944:
            int r1 = r38.getChildCount()
            if (r1 <= 0) goto L_0x094f
            a.e.a.h.e r1 = r0.e
            r1.p()
        L_0x094f:
            java.util.ArrayList<a.e.a.h.d> r1 = r0.d
            int r1 = r1.size()
            int r6 = r38.getPaddingBottom()
            int r6 = r6 + r20
            int r7 = r38.getPaddingRight()
            int r7 = r7 + r19
            if (r1 <= 0) goto L_0x0b50
            a.e.a.h.e r8 = r0.e
            a.e.a.h.d$a r8 = r8.e()
            a.e.a.h.d$a r11 = a.e.a.h.d.a.WRAP_CONTENT
            if (r8 != r11) goto L_0x096f
            r8 = r5
            goto L_0x0970
        L_0x096f:
            r8 = r4
        L_0x0970:
            a.e.a.h.e r11 = r0.e
            a.e.a.h.d$a r11 = r11.i()
            a.e.a.h.d$a r13 = a.e.a.h.d.a.WRAP_CONTENT
            if (r11 != r13) goto L_0x097c
            r11 = r5
            goto L_0x097d
        L_0x097c:
            r11 = r4
        L_0x097d:
            a.e.a.h.e r13 = r0.e
            int r13 = r13.j()
            int r14 = r0.f
            int r13 = java.lang.Math.max(r13, r14)
            a.e.a.h.e r14 = r0.e
            int r14 = r14.d()
            int r15 = r0.g
            int r14 = java.lang.Math.max(r14, r15)
            r15 = r4
            r5 = r14
            r14 = r15
            r4 = r13
            r13 = r14
        L_0x099a:
            r17 = r1
            if (r13 >= r1) goto L_0x0ab7
            java.util.ArrayList<a.e.a.h.d> r1 = r0.d
            java.lang.Object r1 = r1.get(r13)
            a.e.a.h.d r1 = (a.e.a.h.d) r1
            r19 = r10
            java.lang.Object r10 = r1.X
            android.view.View r10 = (android.view.View) r10
            if (r10 != 0) goto L_0x09b2
            r21 = r9
            goto L_0x0aa3
        L_0x09b2:
            android.view.ViewGroup$LayoutParams r20 = r10.getLayoutParams()
            r21 = r9
            r9 = r20
            androidx.constraintlayout.widget.ConstraintLayout$a r9 = (androidx.constraintlayout.widget.ConstraintLayout.a) r9
            boolean r0 = r9.Y
            if (r0 != 0) goto L_0x0aa3
            boolean r0 = r9.X
            if (r0 == 0) goto L_0x09c6
            goto L_0x0aa3
        L_0x09c6:
            int r0 = r10.getVisibility()
            r20 = r14
            r14 = 8
            if (r0 != r14) goto L_0x09d1
            goto L_0x09e7
        L_0x09d1:
            if (r12 == 0) goto L_0x09ea
            a.e.a.h.k r0 = r1.g()
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x09ea
            a.e.a.h.k r0 = r1.f()
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x09ea
        L_0x09e7:
            r2 = -1
            goto L_0x0aa7
        L_0x09ea:
            int r0 = r9.width
            r14 = -2
            if (r0 != r14) goto L_0x09f8
            boolean r14 = r9.U
            if (r14 == 0) goto L_0x09f8
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r2, r7, r0)
            goto L_0x0a02
        L_0x09f8:
            int r0 = r1.j()
            r14 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r14)
        L_0x0a02:
            int r14 = r9.height
            r2 = -2
            if (r14 != r2) goto L_0x0a10
            boolean r2 = r9.V
            if (r2 == 0) goto L_0x0a10
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r3, r6, r14)
            goto L_0x0a1a
        L_0x0a10:
            int r2 = r1.d()
            r14 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r14)
        L_0x0a1a:
            r10.measure(r0, r2)
            int r0 = r10.getMeasuredWidth()
            int r2 = r10.getMeasuredHeight()
            int r14 = r1.j()
            if (r0 == r14) goto L_0x0a54
            r1.f(r0)
            if (r12 == 0) goto L_0x0a37
            a.e.a.h.k r14 = r1.g()
            r14.a(r0)
        L_0x0a37:
            if (r8 == 0) goto L_0x0a52
            int r0 = r1.h()
            if (r0 <= r4) goto L_0x0a52
            int r0 = r1.h()
            a.e.a.h.c$c r14 = a.e.a.h.c.C0011c.RIGHT
            a.e.a.h.c r14 = r1.a((a.e.a.h.c.C0011c) r14)
            int r14 = r14.a()
            int r14 = r14 + r0
            int r4 = java.lang.Math.max(r4, r14)
        L_0x0a52:
            r20 = 1
        L_0x0a54:
            int r0 = r1.d()
            if (r2 == r0) goto L_0x0a84
            r1.e(r2)
            if (r12 == 0) goto L_0x0a66
            a.e.a.h.k r0 = r1.f()
            r0.a(r2)
        L_0x0a66:
            if (r11 == 0) goto L_0x0a82
            int r0 = r1.c()
            if (r0 <= r5) goto L_0x0a82
            int r0 = r1.c()
            a.e.a.h.c$c r2 = a.e.a.h.c.C0011c.BOTTOM
            a.e.a.h.c r2 = r1.a((a.e.a.h.c.C0011c) r2)
            int r2 = r2.a()
            int r2 = r2 + r0
            int r0 = java.lang.Math.max(r5, r2)
            r5 = r0
        L_0x0a82:
            r20 = 1
        L_0x0a84:
            boolean r0 = r9.W
            if (r0 == 0) goto L_0x0a98
            int r0 = r10.getBaseline()
            r2 = -1
            if (r0 == r2) goto L_0x0a99
            int r9 = r1.Q
            if (r0 == r9) goto L_0x0a99
            r1.Q = r0
            r20 = 1
            goto L_0x0a99
        L_0x0a98:
            r2 = -1
        L_0x0a99:
            int r0 = r10.getMeasuredState()
            int r0 = android.view.ViewGroup.combineMeasuredStates(r15, r0)
            r15 = r0
            goto L_0x0aa7
        L_0x0aa3:
            r20 = r14
            goto L_0x09e7
        L_0x0aa7:
            r14 = r20
            int r13 = r13 + 1
            r0 = r38
            r2 = r39
            r1 = r17
            r10 = r19
            r9 = r21
            goto L_0x099a
        L_0x0ab7:
            r21 = r9
            r19 = r10
            r20 = r14
            r0 = r38
            if (r20 == 0) goto L_0x0b02
            a.e.a.h.e r1 = r0.e
            r2 = r21
            r1.f(r2)
            a.e.a.h.e r1 = r0.e
            r2 = r19
            r1.e(r2)
            if (r12 == 0) goto L_0x0ad6
            a.e.a.h.e r1 = r0.e
            r1.t()
        L_0x0ad6:
            a.e.a.h.e r1 = r0.e
            r1.p()
            a.e.a.h.e r1 = r0.e
            int r1 = r1.j()
            if (r1 >= r4) goto L_0x0aea
            a.e.a.h.e r1 = r0.e
            r1.f(r4)
            r12 = 1
            goto L_0x0aeb
        L_0x0aea:
            r12 = 0
        L_0x0aeb:
            a.e.a.h.e r1 = r0.e
            int r1 = r1.d()
            if (r1 >= r5) goto L_0x0afa
            a.e.a.h.e r1 = r0.e
            r1.e(r5)
            r13 = 1
            goto L_0x0afb
        L_0x0afa:
            r13 = r12
        L_0x0afb:
            if (r13 == 0) goto L_0x0b02
            a.e.a.h.e r1 = r0.e
            r1.p()
        L_0x0b02:
            r1 = r17
            r12 = 0
        L_0x0b05:
            if (r12 >= r1) goto L_0x0b4e
            java.util.ArrayList<a.e.a.h.d> r2 = r0.d
            java.lang.Object r2 = r2.get(r12)
            a.e.a.h.d r2 = (a.e.a.h.d) r2
            java.lang.Object r4 = r2.X
            android.view.View r4 = (android.view.View) r4
            if (r4 != 0) goto L_0x0b16
            goto L_0x0b2b
        L_0x0b16:
            int r5 = r4.getMeasuredWidth()
            int r8 = r2.j()
            if (r5 != r8) goto L_0x0b30
            int r5 = r4.getMeasuredHeight()
            int r8 = r2.d()
            if (r5 == r8) goto L_0x0b2b
            goto L_0x0b30
        L_0x0b2b:
            r8 = 8
        L_0x0b2d:
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x0b4b
        L_0x0b30:
            int r5 = r2.Y
            r8 = 8
            if (r5 == r8) goto L_0x0b2d
            int r5 = r2.j()
            r9 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r9)
            int r2 = r2.d()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r9)
            r4.measure(r5, r2)
        L_0x0b4b:
            int r12 = r12 + 1
            goto L_0x0b05
        L_0x0b4e:
            r12 = r15
            goto L_0x0b51
        L_0x0b50:
            r12 = 0
        L_0x0b51:
            a.e.a.h.e r1 = r0.e
            int r1 = r1.j()
            int r1 = r1 + r7
            a.e.a.h.e r2 = r0.e
            int r2 = r2.d()
            int r2 = r2 + r6
            r4 = r39
            int r1 = android.view.ViewGroup.resolveSizeAndState(r1, r4, r12)
            int r4 = r12 << 16
            int r2 = android.view.ViewGroup.resolveSizeAndState(r2, r3, r4)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r2 = r2 & r3
            int r3 = r0.h
            int r1 = java.lang.Math.min(r3, r1)
            int r3 = r0.i
            int r2 = java.lang.Math.min(r3, r2)
            a.e.a.h.e r3 = r0.e
            boolean r3 = r3.E0
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r3 == 0) goto L_0x0b85
            r1 = r1 | r4
        L_0x0b85:
            a.e.a.h.e r3 = r0.e
            boolean r3 = r3.F0
            if (r3 == 0) goto L_0x0b8c
            r2 = r2 | r4
        L_0x0b8c:
            r0.setMeasuredDimension(r1, r2)
            r0.o = r1
            r0.p = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        d a2 = a(view);
        if ((view instanceof a.e.b.e) && !(a2 instanceof g)) {
            a aVar = (a) view.getLayoutParams();
            g gVar = new g();
            aVar.k0 = gVar;
            aVar.X = true;
            gVar.g(aVar.R);
        }
        if (view instanceof b) {
            b bVar = (b) view;
            bVar.a();
            ((a) view.getLayoutParams()).Y = true;
            if (!this.c.contains(bVar)) {
                this.c.add(bVar);
            }
        }
        this.f503b.put(view.getId(), view);
        this.j = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f503b.remove(view.getId());
        d a2 = a(view);
        this.e.k0.remove(a2);
        a2.D = null;
        this.c.remove(view);
        this.d.remove(a2);
        this.j = true;
    }

    public void removeView(View view) {
        super.removeView(view);
    }

    public void requestLayout() {
        super.requestLayout();
        this.j = true;
        this.o = -1;
        this.p = -1;
    }

    public void setConstraintSet(c cVar) {
        this.l = cVar;
    }

    public void setId(int i2) {
        this.f503b.remove(getId());
        super.setId(i2);
        this.f503b.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 != this.i) {
            this.i = i2;
            requestLayout();
        }
    }

    public void setMaxWidth(int i2) {
        if (i2 != this.h) {
            this.h = i2;
            requestLayout();
        }
    }

    public void setMinHeight(int i2) {
        if (i2 != this.g) {
            this.g = i2;
            requestLayout();
        }
    }

    public void setMinWidth(int i2) {
        if (i2 != this.f) {
            this.f = i2;
            requestLayout();
        }
    }

    public void setOptimizationLevel(int i2) {
        this.e.C0 = i2;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x029e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r23, int r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            int r3 = r22.getPaddingTop()
            int r4 = r22.getPaddingBottom()
            int r4 = r4 + r3
            int r3 = r22.getPaddingLeft()
            int r5 = r22.getPaddingRight()
            int r5 = r5 + r3
            int r3 = r22.getChildCount()
            r7 = 0
        L_0x001d:
            r8 = 8
            r9 = -1
            r10 = -2
            if (r7 >= r3) goto L_0x00b2
            android.view.View r12 = r0.getChildAt(r7)
            int r13 = r12.getVisibility()
            if (r13 != r8) goto L_0x002f
            goto L_0x00ae
        L_0x002f:
            android.view.ViewGroup$LayoutParams r8 = r12.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8
            a.e.a.h.d r13 = r8.k0
            boolean r14 = r8.X
            if (r14 != 0) goto L_0x00ae
            boolean r14 = r8.Y
            if (r14 == 0) goto L_0x0041
            goto L_0x00ae
        L_0x0041:
            int r14 = r12.getVisibility()
            r13.Y = r14
            int r14 = r8.width
            int r15 = r8.height
            if (r14 == 0) goto L_0x00a0
            if (r15 != 0) goto L_0x0050
            goto L_0x00a0
        L_0x0050:
            if (r14 != r10) goto L_0x0055
            r16 = 1
            goto L_0x0057
        L_0x0055:
            r16 = 0
        L_0x0057:
            int r14 = android.view.ViewGroup.getChildMeasureSpec(r1, r5, r14)
            if (r15 != r10) goto L_0x005f
            r11 = 1
            goto L_0x0060
        L_0x005f:
            r11 = 0
        L_0x0060:
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r2, r4, r15)
            r12.measure(r14, r10)
            int r10 = r12.getMeasuredWidth()
            int r14 = r12.getMeasuredHeight()
            r13.f(r10)
            r13.e(r14)
            if (r16 == 0) goto L_0x0079
            r13.T = r10
        L_0x0079:
            if (r11 == 0) goto L_0x007d
            r13.U = r14
        L_0x007d:
            boolean r11 = r8.W
            if (r11 == 0) goto L_0x0089
            int r11 = r12.getBaseline()
            if (r11 == r9) goto L_0x0089
            r13.Q = r11
        L_0x0089:
            boolean r9 = r8.U
            if (r9 == 0) goto L_0x00ae
            boolean r8 = r8.V
            if (r8 == 0) goto L_0x00ae
            a.e.a.h.k r8 = r13.g()
            r8.a(r10)
            a.e.a.h.k r8 = r13.f()
            r8.a(r14)
            goto L_0x00ae
        L_0x00a0:
            a.e.a.h.k r8 = r13.g()
            r8.b()
            a.e.a.h.k r8 = r13.f()
            r8.b()
        L_0x00ae:
            int r7 = r7 + 1
            goto L_0x001d
        L_0x00b2:
            a.e.a.h.e r7 = r0.e
            r7.t()
            r7 = 0
        L_0x00b8:
            if (r7 >= r3) goto L_0x02b5
            android.view.View r12 = r0.getChildAt(r7)
            int r13 = r12.getVisibility()
            if (r13 != r8) goto L_0x00c6
            goto L_0x02a0
        L_0x00c6:
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r13 = (androidx.constraintlayout.widget.ConstraintLayout.a) r13
            a.e.a.h.d r14 = r13.k0
            boolean r15 = r13.X
            if (r15 != 0) goto L_0x02a0
            boolean r15 = r13.Y
            if (r15 == 0) goto L_0x00d8
            goto L_0x02a0
        L_0x00d8:
            int r15 = r12.getVisibility()
            r14.Y = r15
            int r15 = r13.width
            int r8 = r13.height
            if (r15 == 0) goto L_0x00e8
            if (r8 == 0) goto L_0x00e8
            goto L_0x02a0
        L_0x00e8:
            a.e.a.h.c$c r11 = a.e.a.h.c.C0011c.LEFT
            a.e.a.h.c r11 = r14.a((a.e.a.h.c.C0011c) r11)
            a.e.a.h.j r11 = r11.f237a
            a.e.a.h.c$c r9 = a.e.a.h.c.C0011c.RIGHT
            a.e.a.h.c r9 = r14.a((a.e.a.h.c.C0011c) r9)
            a.e.a.h.j r9 = r9.f237a
            a.e.a.h.c$c r10 = a.e.a.h.c.C0011c.LEFT
            a.e.a.h.c r10 = r14.a((a.e.a.h.c.C0011c) r10)
            a.e.a.h.c r10 = r10.d
            if (r10 == 0) goto L_0x010e
            a.e.a.h.c$c r10 = a.e.a.h.c.C0011c.RIGHT
            a.e.a.h.c r10 = r14.a((a.e.a.h.c.C0011c) r10)
            a.e.a.h.c r10 = r10.d
            if (r10 == 0) goto L_0x010e
            r10 = 1
            goto L_0x010f
        L_0x010e:
            r10 = 0
        L_0x010f:
            a.e.a.h.c$c r6 = a.e.a.h.c.C0011c.TOP
            a.e.a.h.c r6 = r14.a((a.e.a.h.c.C0011c) r6)
            a.e.a.h.j r6 = r6.f237a
            r18 = r3
            a.e.a.h.c$c r3 = a.e.a.h.c.C0011c.BOTTOM
            a.e.a.h.c r3 = r14.a((a.e.a.h.c.C0011c) r3)
            a.e.a.h.j r3 = r3.f237a
            r19 = r7
            a.e.a.h.c$c r7 = a.e.a.h.c.C0011c.TOP
            a.e.a.h.c r7 = r14.a((a.e.a.h.c.C0011c) r7)
            a.e.a.h.c r7 = r7.d
            if (r7 == 0) goto L_0x0139
            a.e.a.h.c$c r7 = a.e.a.h.c.C0011c.BOTTOM
            a.e.a.h.c r7 = r14.a((a.e.a.h.c.C0011c) r7)
            a.e.a.h.c r7 = r7.d
            if (r7 == 0) goto L_0x0139
            r7 = 1
            goto L_0x013a
        L_0x0139:
            r7 = 0
        L_0x013a:
            if (r15 != 0) goto L_0x0146
            if (r8 != 0) goto L_0x0146
            if (r10 == 0) goto L_0x0146
            if (r7 == 0) goto L_0x0146
            r3 = -2
            r6 = -1
            goto L_0x02a6
        L_0x0146:
            r20 = r13
            a.e.a.h.e r13 = r0.e
            a.e.a.h.d$a r13 = r13.e()
            r21 = r12
            a.e.a.h.d$a r12 = a.e.a.h.d.a.WRAP_CONTENT
            if (r13 == r12) goto L_0x0156
            r12 = 1
            goto L_0x0157
        L_0x0156:
            r12 = 0
        L_0x0157:
            a.e.a.h.e r13 = r0.e
            a.e.a.h.d$a r13 = r13.i()
            a.e.a.h.d$a r0 = a.e.a.h.d.a.WRAP_CONTENT
            if (r13 == r0) goto L_0x0163
            r0 = 1
            goto L_0x0164
        L_0x0163:
            r0 = 0
        L_0x0164:
            if (r12 != 0) goto L_0x016d
            a.e.a.h.k r13 = r14.g()
            r13.b()
        L_0x016d:
            if (r0 != 0) goto L_0x0176
            a.e.a.h.k r13 = r14.f()
            r13.b()
        L_0x0176:
            r13 = 0
            if (r15 != 0) goto L_0x01cc
            if (r12 == 0) goto L_0x01c1
            int r15 = r14.e
            if (r15 != 0) goto L_0x0199
            float r15 = r14.G
            int r15 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x0199
            int r15 = r14.h
            if (r15 != 0) goto L_0x0199
            int r15 = r14.i
            if (r15 != 0) goto L_0x0199
            a.e.a.h.d$a[] r15 = r14.C
            r17 = 0
            r15 = r15[r17]
            a.e.a.h.d$a r13 = a.e.a.h.d.a.MATCH_CONSTRAINT
            if (r15 != r13) goto L_0x019b
            r13 = 1
            goto L_0x019d
        L_0x0199:
            r17 = 0
        L_0x019b:
            r13 = r17
        L_0x019d:
            if (r13 == 0) goto L_0x01c3
            if (r10 == 0) goto L_0x01c3
            boolean r10 = r11.c()
            if (r10 == 0) goto L_0x01c3
            boolean r10 = r9.c()
            if (r10 == 0) goto L_0x01c3
            float r9 = r9.g
            float r10 = r11.g
            float r9 = r9 - r10
            int r9 = (int) r9
            a.e.a.h.k r10 = r14.g()
            r10.a(r9)
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r1, r5, r9)
            r11 = r9
            r9 = -2
            goto L_0x01d6
        L_0x01c1:
            r17 = 0
        L_0x01c3:
            r9 = -2
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r1, r5, r9)
            r12 = r17
            r9 = 1
            goto L_0x01e4
        L_0x01cc:
            r9 = -2
            r10 = -1
            r17 = 0
            if (r15 != r10) goto L_0x01da
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r1, r5, r10)
        L_0x01d6:
            r10 = r11
            r9 = r17
            goto L_0x01e4
        L_0x01da:
            if (r15 != r9) goto L_0x01de
            r9 = 1
            goto L_0x01e0
        L_0x01de:
            r9 = r17
        L_0x01e0:
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r1, r5, r15)
        L_0x01e4:
            if (r8 != 0) goto L_0x023c
            if (r0 == 0) goto L_0x0231
            int r8 = r14.f
            if (r8 != 0) goto L_0x0206
            float r8 = r14.G
            r11 = 0
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x0206
            int r8 = r14.k
            if (r8 != 0) goto L_0x0206
            int r8 = r14.l
            if (r8 != 0) goto L_0x0206
            a.e.a.h.d$a[] r8 = r14.C
            r11 = 1
            r8 = r8[r11]
            a.e.a.h.d$a r13 = a.e.a.h.d.a.MATCH_CONSTRAINT
            if (r8 != r13) goto L_0x0207
            r8 = r11
            goto L_0x0209
        L_0x0206:
            r11 = 1
        L_0x0207:
            r8 = r17
        L_0x0209:
            if (r8 == 0) goto L_0x0232
            if (r7 == 0) goto L_0x0232
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x0232
            boolean r7 = r3.c()
            if (r7 == 0) goto L_0x0232
            float r3 = r3.g
            float r6 = r6.g
            float r3 = r3 - r6
            int r3 = (int) r3
            a.e.a.h.k r6 = r14.f()
            r6.a(r3)
            int r3 = android.view.ViewGroup.getChildMeasureSpec(r2, r4, r3)
            r7 = r3
            r6 = r17
            r8 = r21
            r3 = -2
            goto L_0x0254
        L_0x0231:
            r11 = 1
        L_0x0232:
            r3 = -2
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r2, r4, r3)
            r7 = r0
            r6 = r11
            r0 = r17
            goto L_0x0252
        L_0x023c:
            r3 = -2
            r6 = -1
            r11 = 1
            if (r8 != r6) goto L_0x0248
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r2, r4, r6)
            r6 = r17
            goto L_0x0252
        L_0x0248:
            if (r8 != r3) goto L_0x024c
            r6 = r11
            goto L_0x024e
        L_0x024c:
            r6 = r17
        L_0x024e:
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r2, r4, r8)
        L_0x0252:
            r8 = r21
        L_0x0254:
            r8.measure(r10, r7)
            int r7 = r8.getMeasuredWidth()
            int r10 = r8.getMeasuredHeight()
            r14.f(r7)
            r14.e(r10)
            if (r9 == 0) goto L_0x0269
            r14.T = r7
        L_0x0269:
            if (r6 == 0) goto L_0x026d
            r14.U = r10
        L_0x026d:
            r6 = 2
            if (r12 == 0) goto L_0x0278
            a.e.a.h.k r9 = r14.g()
            r9.a(r7)
            goto L_0x027e
        L_0x0278:
            a.e.a.h.k r7 = r14.g()
            r7.f249b = r6
        L_0x027e:
            if (r0 == 0) goto L_0x0288
            a.e.a.h.k r0 = r14.f()
            r0.a(r10)
            goto L_0x028e
        L_0x0288:
            a.e.a.h.k r0 = r14.f()
            r0.f249b = r6
        L_0x028e:
            r13 = r20
            boolean r0 = r13.W
            if (r0 == 0) goto L_0x029e
            int r0 = r8.getBaseline()
            r6 = -1
            if (r0 == r6) goto L_0x02a9
            r14.Q = r0
            goto L_0x02a9
        L_0x029e:
            r6 = -1
            goto L_0x02a9
        L_0x02a0:
            r18 = r3
            r19 = r7
            r6 = r9
            r3 = r10
        L_0x02a6:
            r11 = 1
            r17 = 0
        L_0x02a9:
            int r7 = r19 + 1
            r8 = 8
            r0 = r22
            r10 = r3
            r9 = r6
            r3 = r18
            goto L_0x00b8
        L_0x02b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a(int, int):void");
    }

    public final void a() {
        int childCount = getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof f) {
                f fVar = (f) childAt;
                if (fVar.c != null) {
                    a aVar = (a) fVar.getLayoutParams();
                    a aVar2 = (a) fVar.c.getLayoutParams();
                    d dVar = aVar2.k0;
                    dVar.Y = 0;
                    aVar.k0.f(dVar.j());
                    aVar.k0.e(aVar2.k0.d());
                    aVar2.k0.Y = 8;
                }
            }
        }
        int size = this.c.size();
        if (size > 0) {
            while (i2 < size) {
                if (this.c.get(i2) != null) {
                    i2++;
                } else {
                    throw null;
                }
            }
        }
    }
}
