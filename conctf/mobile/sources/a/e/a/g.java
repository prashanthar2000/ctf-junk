package a.e.a;

import java.util.Arrays;

public class g {
    public static int k = 1;

    /* renamed from: a  reason: collision with root package name */
    public String f232a;

    /* renamed from: b  reason: collision with root package name */
    public int f233b = -1;
    public int c = -1;
    public int d = 0;
    public float e;
    public float[] f = new float[7];
    public a g;
    public b[] h = new b[8];
    public int i = 0;
    public int j = 0;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public g(a aVar) {
        this.g = aVar;
    }

    public void a() {
        this.f232a = null;
        this.g = a.UNKNOWN;
        this.d = 0;
        this.f233b = -1;
        this.c = -1;
        this.e = 0.0f;
        this.i = 0;
        this.j = 0;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.i;
            if (i2 >= i3) {
                b[] bVarArr = this.h;
                if (i3 >= bVarArr.length) {
                    this.h = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.h;
                int i4 = this.i;
                bVarArr2[i4] = bVar;
                this.i = i4 + 1;
                return;
            } else if (this.h[i2] != bVar) {
                i2++;
            } else {
                return;
            }
        }
    }

    public final void b(b bVar) {
        int i2 = this.i;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.h[i3] == bVar) {
                for (int i4 = 0; i4 < (i2 - i3) - 1; i4++) {
                    b[] bVarArr = this.h;
                    int i5 = i3 + i4;
                    bVarArr[i5] = bVarArr[i5 + 1];
                }
                this.i--;
                return;
            }
        }
    }

    public final void c(b bVar) {
        int i2 = this.i;
        for (int i3 = 0; i3 < i2; i3++) {
            b[] bVarArr = this.h;
            a aVar = bVarArr[i3].d;
            b bVar2 = bVarArr[i3];
            while (true) {
                int i4 = aVar.i;
                int i5 = 0;
                while (i4 != -1 && i5 < aVar.f222a) {
                    int i6 = aVar.f[i4];
                    g gVar = bVar.f224a;
                    if (i6 == gVar.f233b) {
                        float f2 = aVar.h[i4];
                        aVar.a(gVar, false);
                        a aVar2 = bVar.d;
                        int i7 = aVar2.i;
                        int i8 = 0;
                        while (i7 != -1 && i8 < aVar2.f222a) {
                            aVar.a(aVar.c.c[aVar2.f[i7]], aVar2.h[i7] * f2, false);
                            i7 = aVar2.g[i7];
                            i8++;
                        }
                        bVar2.f225b = (bVar.f225b * f2) + bVar2.f225b;
                    } else {
                        i4 = aVar.g[i4];
                        i5++;
                    }
                }
            }
        }
        this.i = 0;
    }

    public String toString() {
        StringBuilder a2 = b.a.a.a.a.a("");
        a2.append(this.f232a);
        return a2.toString();
    }
}
