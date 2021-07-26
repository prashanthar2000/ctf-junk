package a.f.f;

import a.b.j;
import a.b.k.o;
import android.graphics.Path;
import android.util.Log;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public char f281a;

    /* renamed from: b  reason: collision with root package name */
    public float[] f282b;

    public b(char c, float[] fArr) {
        this.f281a = c;
        this.f282b = fArr;
    }

    public b(b bVar) {
        this.f281a = bVar.f281a;
        float[] fArr = bVar.f282b;
        this.f282b = o.a(fArr, 0, fArr.length);
    }

    public static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        float f8 = f;
        float f9 = f3;
        float f10 = f5;
        boolean z3 = z2;
        double radians = Math.toRadians((double) f7);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d3 = (double) f8;
        double d4 = (double) f2;
        double d5 = (d4 * sin) + (d3 * cos);
        double d6 = d3;
        double d7 = (double) f10;
        double d8 = d5 / d7;
        double d9 = radians;
        double d10 = (double) f6;
        double d11 = ((d4 * cos) + (((double) (-f8)) * sin)) / d10;
        double d12 = d4;
        double d13 = (double) f4;
        double d14 = ((d13 * sin) + (((double) f9) * cos)) / d7;
        double d15 = ((d13 * cos) + (((double) (-f9)) * sin)) / d10;
        double d16 = d8 - d14;
        double d17 = d11 - d15;
        double d18 = (d8 + d14) / 2.0d;
        double d19 = (d11 + d15) / 2.0d;
        double d20 = sin;
        double d21 = (d17 * d17) + (d16 * d16);
        if (d21 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d21);
            float sqrt = (float) (Math.sqrt(d21) / 1.99999d);
            a(path, f, f2, f3, f4, f10 * sqrt, f6 * sqrt, f7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d22);
        double d23 = d16 * sqrt2;
        double d24 = sqrt2 * d17;
        if (z == z3) {
            d2 = d18 - d24;
            d = d19 + d23;
        } else {
            d2 = d18 + d24;
            d = d19 - d23;
        }
        double atan2 = Math.atan2(d11 - d, d8 - d2);
        double atan22 = Math.atan2(d15 - d, d14 - d2) - atan2;
        int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (z3 != (i >= 0)) {
            atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d25 = d2 * d7;
        double d26 = d * d10;
        double d27 = (d25 * cos) - (d26 * d20);
        double d28 = (d26 * cos) + (d25 * d20);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(d9);
        double sin2 = Math.sin(d9);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d29 = -d7;
        double d30 = d29 * cos2;
        double d31 = d10 * sin2;
        double d32 = (d30 * sin3) - (d31 * cos3);
        double d33 = d29 * sin2;
        double d34 = d10 * cos2;
        double d35 = (cos3 * d34) + (sin3 * d33);
        double d36 = d34;
        double d37 = atan22 / ((double) ceil);
        int i2 = 0;
        while (i2 < ceil) {
            double d38 = atan2 + d37;
            double sin4 = Math.sin(d38);
            double cos4 = Math.cos(d38);
            double d39 = d37;
            double d40 = (((d7 * cos2) * cos4) + d27) - (d31 * sin4);
            double d41 = d27;
            double d42 = (d36 * sin4) + (d7 * sin2 * cos4) + d28;
            double d43 = (d30 * sin4) - (d31 * cos4);
            double d44 = (cos4 * d36) + (sin4 * d33);
            double d45 = d38 - atan2;
            double tan = Math.tan(d45 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            double d46 = d38;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d32 * sqrt3) + d6), (float) ((d35 * sqrt3) + d12), (float) (d40 - (sqrt3 * d43)), (float) (d42 - (sqrt3 * d44)), (float) d40, (float) d42);
            i2++;
            atan2 = d46;
            cos2 = cos2;
            d33 = d33;
            d35 = d44;
            ceil = ceil;
            d7 = d7;
            d32 = d43;
            d6 = d40;
            d12 = d42;
            d37 = d39;
            d27 = d41;
        }
    }

    public static void a(b[] bVarArr, Path path) {
        int i;
        float f;
        float f2;
        int i2;
        int i3;
        float[] fArr;
        char c;
        int i4;
        float[] fArr2;
        char c2;
        int i5;
        float f3;
        float f4;
        float f5;
        float f6;
        int i6;
        float f7;
        float f8;
        int i7;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        b[] bVarArr2 = bVarArr;
        Path path2 = path;
        int i8 = 6;
        float[] fArr3 = new float[6];
        char c3 = 'm';
        int i9 = 0;
        char c4 = 'm';
        int i10 = 0;
        while (i10 < bVarArr2.length) {
            char c5 = bVarArr2[i10].f281a;
            float[] fArr4 = bVarArr2[i10].f282b;
            float f24 = fArr3[i9];
            float f25 = fArr3[1];
            float f26 = fArr3[2];
            float f27 = fArr3[3];
            float f28 = fArr3[4];
            float f29 = fArr3[5];
            switch (c5) {
                case 'A':
                case j.AppCompatTheme_spinnerDropDownItemStyle:
                    i = 7;
                    break;
                case 'C':
                case j.AppCompatTheme_switchStyle:
                    i = i8;
                    break;
                case 'H':
                case j.AppCompatTheme_panelMenuListWidth:
                case j.AppCompatTheme_textAppearancePopupMenuHeader:
                case j.AppCompatTheme_windowFixedHeightMajor:
                    i = 1;
                    break;
                case j.AppCompatTheme_listPreferredItemPaddingLeft:
                case j.AppCompatTheme_listPreferredItemPaddingStart:
                case j.AppCompatTheme_tooltipFrameBackground:
                case j.AppCompatTheme_windowActionBar:
                    i = 4;
                    break;
                case j.AppCompatTheme_ratingBarStyle:
                case j.AppCompatTheme_windowMinWidthMajor:
                    path.close();
                    path2.moveTo(f28, f29);
                    f24 = f28;
                    f26 = f24;
                    f25 = f29;
                    f27 = f25;
                    break;
            }
            i = 2;
            float f30 = f28;
            float f31 = f29;
            float f32 = f24;
            float f33 = f25;
            int i11 = i9;
            while (i11 < fArr4.length) {
                if (c5 != 'A') {
                    if (c5 != 'C') {
                        if (c5 == 'H') {
                            i2 = i11;
                            fArr = fArr4;
                            c = c5;
                            i3 = i10;
                            int i12 = i2 + 0;
                            path2.lineTo(fArr[i12], f33);
                            f32 = fArr[i12];
                        } else if (c5 == 'Q') {
                            i6 = i11;
                            fArr = fArr4;
                            c = c5;
                            i3 = i10;
                            int i13 = i6 + 0;
                            int i14 = i6 + 1;
                            int i15 = i6 + 2;
                            int i16 = i6 + 3;
                            path2.quadTo(fArr[i13], fArr[i14], fArr[i15], fArr[i16]);
                            f6 = fArr[i13];
                            f5 = fArr[i14];
                            f32 = fArr[i15];
                            f33 = fArr[i16];
                        } else if (c5 == 'V') {
                            i2 = i11;
                            fArr = fArr4;
                            c = c5;
                            i3 = i10;
                            int i17 = i2 + 0;
                            path2.lineTo(f32, fArr[i17]);
                            f33 = fArr[i17];
                        } else if (c5 != 'a') {
                            if (c5 != 'c') {
                                if (c5 == 'h') {
                                    i2 = i11;
                                    float f34 = f33;
                                    int i18 = i2 + 0;
                                    path2.rLineTo(fArr4[i18], 0.0f);
                                    f32 += fArr4[i18];
                                } else if (c5 != 'q') {
                                    if (c5 == 'v') {
                                        i2 = i11;
                                        f14 = f33;
                                        float f35 = f32;
                                        int i19 = i2 + 0;
                                        path2.rLineTo(0.0f, fArr4[i19]);
                                        f15 = fArr4[i19];
                                    } else if (c5 != 'L') {
                                        if (c5 == 'M') {
                                            i2 = i11;
                                            int i20 = i2 + 0;
                                            float f36 = fArr4[i20];
                                            int i21 = i2 + 1;
                                            float f37 = fArr4[i21];
                                            if (i2 > 0) {
                                                path2.lineTo(fArr4[i20], fArr4[i21]);
                                                f32 = f36;
                                                f33 = f37;
                                            } else {
                                                path2.moveTo(fArr4[i20], fArr4[i21]);
                                                f32 = f36;
                                                f33 = f37;
                                            }
                                        } else if (c5 == 'S') {
                                            i7 = i11;
                                            float f38 = f33;
                                            float f39 = f32;
                                            if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                f16 = (f38 * 2.0f) - f;
                                                f17 = (f39 * 2.0f) - f2;
                                            } else {
                                                f17 = f39;
                                                f16 = f38;
                                            }
                                            int i22 = i7 + 0;
                                            int i23 = i7 + 1;
                                            int i24 = i7 + 2;
                                            int i25 = i7 + 3;
                                            path.cubicTo(f17, f16, fArr4[i22], fArr4[i23], fArr4[i24], fArr4[i25]);
                                            float f40 = fArr4[i22];
                                            float f41 = fArr4[i23];
                                            f8 = fArr4[i24];
                                            f7 = fArr4[i25];
                                            f2 = f40;
                                            f = f41;
                                            f32 = f8;
                                            f33 = f7;
                                        } else if (c5 == 'T') {
                                            i2 = i11;
                                            float f42 = f33;
                                            float f43 = f32;
                                            if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                f18 = (f43 * 2.0f) - f2;
                                                f19 = (f42 * 2.0f) - f;
                                            } else {
                                                f18 = f43;
                                                f19 = f42;
                                            }
                                            int i26 = i2 + 0;
                                            int i27 = i2 + 1;
                                            path2.quadTo(f18, f19, fArr4[i26], fArr4[i27]);
                                            f = f19;
                                            f2 = f18;
                                            fArr = fArr4;
                                            c = c5;
                                            i3 = i10;
                                            f32 = fArr4[i26];
                                            f33 = fArr4[i27];
                                        } else if (c5 == 'l') {
                                            i2 = i11;
                                            f14 = f33;
                                            int i28 = i2 + 0;
                                            int i29 = i2 + 1;
                                            path2.rLineTo(fArr4[i28], fArr4[i29]);
                                            f32 += fArr4[i28];
                                            f15 = fArr4[i29];
                                        } else if (c5 == c3) {
                                            i2 = i11;
                                            int i30 = i2 + 0;
                                            f32 += fArr4[i30];
                                            int i31 = i2 + 1;
                                            f33 += fArr4[i31];
                                            if (i2 > 0) {
                                                path2.rLineTo(fArr4[i30], fArr4[i31]);
                                            } else {
                                                path2.rMoveTo(fArr4[i30], fArr4[i31]);
                                            }
                                        } else if (c5 != 's') {
                                            if (c5 == 't') {
                                                if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                    f22 = f32 - f2;
                                                    f23 = f33 - f;
                                                } else {
                                                    f23 = 0.0f;
                                                    f22 = 0;
                                                }
                                                int i32 = i11 + 0;
                                                int i33 = i11 + 1;
                                                path2.rQuadTo(f22, f23, fArr4[i32], fArr4[i33]);
                                                f2 = f22 + f32;
                                                float f44 = f23 + f33;
                                                f32 += fArr4[i32];
                                                f33 += fArr4[i33];
                                                f = f44;
                                            }
                                            i2 = i11;
                                        } else {
                                            if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                f20 = f33 - f;
                                                f21 = f32 - f2;
                                            } else {
                                                f21 = 0.0f;
                                                f20 = 0.0f;
                                            }
                                            int i34 = i11 + 0;
                                            int i35 = i11 + 1;
                                            int i36 = i11 + 2;
                                            int i37 = i11 + 3;
                                            i7 = i11;
                                            f9 = f33;
                                            float f45 = f32;
                                            path.rCubicTo(f21, f20, fArr4[i34], fArr4[i35], fArr4[i36], fArr4[i37]);
                                            f12 = fArr4[i34] + f45;
                                            f11 = fArr4[i35] + f9;
                                            f10 = f45 + fArr4[i36];
                                            f13 = fArr4[i37];
                                        }
                                        f31 = f33;
                                        f30 = f32;
                                    } else {
                                        i2 = i11;
                                        int i38 = i2 + 0;
                                        int i39 = i2 + 1;
                                        path2.lineTo(fArr4[i38], fArr4[i39]);
                                        f32 = fArr4[i38];
                                        f33 = fArr4[i39];
                                    }
                                    f33 = f14 + f15;
                                } else {
                                    i7 = i11;
                                    f9 = f33;
                                    float f46 = f32;
                                    int i40 = i7 + 0;
                                    int i41 = i7 + 1;
                                    int i42 = i7 + 2;
                                    int i43 = i7 + 3;
                                    path2.rQuadTo(fArr4[i40], fArr4[i41], fArr4[i42], fArr4[i43]);
                                    f12 = fArr4[i40] + f46;
                                    f11 = fArr4[i41] + f9;
                                    float f47 = f46 + fArr4[i42];
                                    float f48 = fArr4[i43];
                                    f10 = f47;
                                    f13 = f48;
                                }
                                fArr = fArr4;
                                c = c5;
                                i3 = i10;
                            } else {
                                i7 = i11;
                                f9 = f33;
                                float f49 = f32;
                                int i44 = i7 + 2;
                                int i45 = i7 + 3;
                                int i46 = i7 + 4;
                                int i47 = i7 + 5;
                                path.rCubicTo(fArr4[i7 + 0], fArr4[i7 + 1], fArr4[i44], fArr4[i45], fArr4[i46], fArr4[i47]);
                                f12 = fArr4[i44] + f49;
                                f11 = fArr4[i45] + f9;
                                f10 = f49 + fArr4[i46];
                                f13 = fArr4[i47];
                            }
                            f7 = f9 + f13;
                            f2 = f12;
                            f = f11;
                            f8 = f10;
                            f32 = f8;
                            f33 = f7;
                            fArr = fArr4;
                            c = c5;
                            i3 = i10;
                        } else {
                            i4 = i11;
                            float f50 = f33;
                            float f51 = f32;
                            int i48 = i4 + 5;
                            float f52 = fArr4[i48] + f51;
                            int i49 = i4 + 6;
                            float f53 = fArr4[i49] + f50;
                            float f54 = fArr4[i4 + 0];
                            float f55 = fArr4[i4 + 1];
                            float f56 = fArr4[i4 + 2];
                            boolean z = fArr4[i4 + 3] != 0.0f;
                            boolean z2 = fArr4[i4 + 4] != 0.0f;
                            fArr2 = fArr4;
                            float f57 = f56;
                            c2 = c5;
                            i5 = i10;
                            a(path, f51, f50, f52, f53, f54, f55, f57, z, z2);
                            f3 = f51 + fArr2[i48];
                            f4 = f50 + fArr2[i49];
                        }
                        i11 = i2 + i;
                        c3 = 'm';
                        i9 = 0;
                        b[] bVarArr3 = bVarArr;
                        c4 = c;
                        c5 = c4;
                        fArr4 = fArr;
                        i10 = i3;
                    } else {
                        i6 = i11;
                        fArr = fArr4;
                        c = c5;
                        i3 = i10;
                        int i50 = i6 + 2;
                        int i51 = i6 + 3;
                        int i52 = i6 + 4;
                        int i53 = i6 + 5;
                        path.cubicTo(fArr[i6 + 0], fArr[i6 + 1], fArr[i50], fArr[i51], fArr[i52], fArr[i53]);
                        f32 = fArr[i52];
                        f33 = fArr[i53];
                        f6 = fArr[i50];
                        f5 = fArr[i51];
                    }
                    f2 = f6;
                    f = f5;
                    i11 = i2 + i;
                    c3 = 'm';
                    i9 = 0;
                    b[] bVarArr32 = bVarArr;
                    c4 = c;
                    c5 = c4;
                    fArr4 = fArr;
                    i10 = i3;
                } else {
                    i4 = i11;
                    fArr2 = fArr4;
                    c2 = c5;
                    i5 = i10;
                    int i54 = i4 + 5;
                    int i55 = i4 + 6;
                    a(path, f32, f33, fArr2[i54], fArr2[i55], fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                    f3 = fArr2[i54];
                    f4 = fArr2[i55];
                }
                f = f33;
                f2 = f32;
                i11 = i2 + i;
                c3 = 'm';
                i9 = 0;
                b[] bVarArr322 = bVarArr;
                c4 = c;
                c5 = c4;
                fArr4 = fArr;
                i10 = i3;
            }
            int i56 = i10;
            int i57 = i9;
            fArr3[i57] = f32;
            fArr3[1] = f33;
            fArr3[2] = f2;
            fArr3[3] = f;
            fArr3[4] = f30;
            fArr3[5] = f31;
            i10 = i56 + 1;
            i8 = 6;
            c3 = 'm';
            i9 = i57;
            c4 = bVarArr[i56].f281a;
            bVarArr2 = bVarArr;
        }
    }
}
