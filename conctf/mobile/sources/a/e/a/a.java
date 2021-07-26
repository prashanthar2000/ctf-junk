package a.e.a;

import a.e.a.g;
import java.util.Arrays;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public int f222a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final b f223b;
    public final c c;
    public int d = 8;
    public g e = null;
    public int[] f = new int[8];
    public int[] g = new int[8];
    public float[] h = new float[8];
    public int i = -1;
    public int j = -1;
    public boolean k = false;

    public a(b bVar, c cVar) {
        this.f223b = bVar;
        this.c = cVar;
    }

    public final float a(g gVar) {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f222a) {
            if (this.f[i2] == gVar.f233b) {
                return this.h[i2];
            }
            i2 = this.g[i2];
            i3++;
        }
        return 0.0f;
    }

    public final float a(g gVar, boolean z) {
        if (this.e == gVar) {
            this.e = null;
        }
        int i2 = this.i;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f222a) {
            if (this.f[i2] == gVar.f233b) {
                if (i2 == this.i) {
                    this.i = this.g[i2];
                } else {
                    int[] iArr = this.g;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    gVar.b(this.f223b);
                }
                gVar.j--;
                this.f222a--;
                this.f[i2] = -1;
                if (this.k) {
                    this.j = i2;
                }
                return this.h[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.g[i2];
        }
        return 0.0f;
    }

    public final g a(int i2) {
        int i3 = this.i;
        int i4 = 0;
        while (i3 != -1 && i4 < this.f222a) {
            if (i4 == i2) {
                return this.c.c[this.f[i3]];
            }
            i3 = this.g[i3];
            i4++;
        }
        return null;
    }

    public g a(boolean[] zArr, g gVar) {
        g.a aVar;
        int i2 = this.i;
        int i3 = 0;
        g gVar2 = null;
        float f2 = 0.0f;
        while (i2 != -1 && i3 < this.f222a) {
            if (this.h[i2] < 0.0f) {
                g gVar3 = this.c.c[this.f[i2]];
                if ((zArr == null || !zArr[gVar3.f233b]) && gVar3 != gVar && ((aVar = gVar3.g) == g.a.SLACK || aVar == g.a.ERROR)) {
                    float f3 = this.h[i2];
                    if (f3 < f2) {
                        gVar2 = gVar3;
                        f2 = f3;
                    }
                }
            }
            i2 = this.g[i2];
            i3++;
        }
        return gVar2;
    }

    public final void a() {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f222a) {
            g gVar = this.c.c[this.f[i2]];
            if (gVar != null) {
                gVar.b(this.f223b);
            }
            i2 = this.g[i2];
            i3++;
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.f222a = 0;
    }

    public final void a(g gVar, float f2) {
        if (f2 == 0.0f) {
            a(gVar, true);
            return;
        }
        int i2 = this.i;
        if (i2 == -1) {
            this.i = 0;
            this.h[0] = f2;
            this.f[0] = gVar.f233b;
            this.g[0] = -1;
            gVar.j++;
            gVar.a(this.f223b);
            this.f222a++;
            if (!this.k) {
                int i3 = this.j + 1;
                this.j = i3;
                int[] iArr = this.f;
                if (i3 >= iArr.length) {
                    this.k = true;
                    this.j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i2 != -1 && i4 < this.f222a) {
            int[] iArr2 = this.f;
            int i6 = iArr2[i2];
            int i7 = gVar.f233b;
            if (i6 == i7) {
                this.h[i2] = f2;
                return;
            }
            if (iArr2[i2] < i7) {
                i5 = i2;
            }
            i2 = this.g[i2];
            i4++;
        }
        int i8 = this.j;
        int i9 = i8 + 1;
        if (this.k) {
            int[] iArr3 = this.f;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.f;
        if (i8 >= iArr4.length && this.f222a < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.f;
                if (i10 >= iArr5.length) {
                    break;
                } else if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr6 = this.f;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            int i11 = this.d * 2;
            this.d = i11;
            this.k = false;
            this.j = i8 - 1;
            this.h = Arrays.copyOf(this.h, i11);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[i8] = gVar.f233b;
        this.h[i8] = f2;
        int[] iArr7 = this.g;
        if (i5 != -1) {
            iArr7[i8] = iArr7[i5];
            iArr7[i5] = i8;
        } else {
            iArr7[i8] = this.i;
            this.i = i8;
        }
        gVar.j++;
        gVar.a(this.f223b);
        this.f222a++;
        if (!this.k) {
            this.j++;
        }
        if (this.f222a >= this.f.length) {
            this.k = true;
        }
        int i12 = this.j;
        int[] iArr8 = this.f;
        if (i12 >= iArr8.length) {
            this.k = true;
            this.j = iArr8.length - 1;
        }
    }

    public final void a(g gVar, float f2, boolean z) {
        if (f2 != 0.0f) {
            int i2 = this.i;
            if (i2 == -1) {
                this.i = 0;
                this.h[0] = f2;
                this.f[0] = gVar.f233b;
                this.g[0] = -1;
                gVar.j++;
                gVar.a(this.f223b);
                this.f222a++;
                if (!this.k) {
                    int i3 = this.j + 1;
                    this.j = i3;
                    int[] iArr = this.f;
                    if (i3 >= iArr.length) {
                        this.k = true;
                        this.j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i2 != -1 && i4 < this.f222a) {
                int[] iArr2 = this.f;
                int i6 = iArr2[i2];
                int i7 = gVar.f233b;
                if (i6 == i7) {
                    float[] fArr = this.h;
                    fArr[i2] = fArr[i2] + f2;
                    if (fArr[i2] == 0.0f) {
                        if (i2 == this.i) {
                            this.i = this.g[i2];
                        } else {
                            int[] iArr3 = this.g;
                            iArr3[i5] = iArr3[i2];
                        }
                        if (z) {
                            gVar.b(this.f223b);
                        }
                        if (this.k) {
                            this.j = i2;
                        }
                        gVar.j--;
                        this.f222a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i2] < i7) {
                    i5 = i2;
                }
                i2 = this.g[i2];
                i4++;
            }
            int i8 = this.j;
            int i9 = i8 + 1;
            if (this.k) {
                int[] iArr4 = this.f;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.f;
            if (i8 >= iArr5.length && this.f222a < iArr5.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr6 = this.f;
                    if (i10 >= iArr6.length) {
                        break;
                    } else if (iArr6[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr7 = this.f;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                int i11 = this.d * 2;
                this.d = i11;
                this.k = false;
                this.j = i8 - 1;
                this.h = Arrays.copyOf(this.h, i11);
                this.f = Arrays.copyOf(this.f, this.d);
                this.g = Arrays.copyOf(this.g, this.d);
            }
            this.f[i8] = gVar.f233b;
            this.h[i8] = f2;
            int[] iArr8 = this.g;
            if (i5 != -1) {
                iArr8[i8] = iArr8[i5];
                iArr8[i5] = i8;
            } else {
                iArr8[i8] = this.i;
                this.i = i8;
            }
            gVar.j++;
            gVar.a(this.f223b);
            this.f222a++;
            if (!this.k) {
                this.j++;
            }
            int i12 = this.j;
            int[] iArr9 = this.f;
            if (i12 >= iArr9.length) {
                this.k = true;
                this.j = iArr9.length - 1;
            }
        }
    }

    public final float b(int i2) {
        int i3 = this.i;
        int i4 = 0;
        while (i3 != -1 && i4 < this.f222a) {
            if (i4 == i2) {
                return this.h[i3];
            }
            i3 = this.g[i3];
            i4++;
        }
        return 0.0f;
    }

    public final boolean b(g gVar) {
        return gVar.j <= 1;
    }

    public String toString() {
        int i2 = this.i;
        String str = "";
        int i3 = 0;
        while (i2 != -1 && i3 < this.f222a) {
            StringBuilder a2 = b.a.a.a.a.a(b.a.a.a.a.a(str, " -> "));
            a2.append(this.h[i2]);
            a2.append(" : ");
            StringBuilder a3 = b.a.a.a.a.a(a2.toString());
            a3.append(this.c.c[this.f[i2]]);
            str = a3.toString();
            i2 = this.g[i2];
            i3++;
        }
        return str;
    }
}
