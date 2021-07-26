package a.m.a.a;

import a.b.k.o;
import a.f.f.b;
import android.animation.TypeEvaluator;

public class d implements TypeEvaluator<b[]> {

    /* renamed from: a  reason: collision with root package name */
    public b[] f431a;

    public Object evaluate(float f, Object obj, Object obj2) {
        b[] bVarArr = (b[]) obj;
        b[] bVarArr2 = (b[]) obj2;
        if (o.a(bVarArr, bVarArr2)) {
            if (!o.a(this.f431a, bVarArr)) {
                this.f431a = o.a(bVarArr);
            }
            int i = 0;
            while (i < bVarArr.length) {
                b bVar = this.f431a[i];
                b bVar2 = bVarArr[i];
                b bVar3 = bVarArr2[i];
                if (bVar != null) {
                    bVar.f281a = bVar2.f281a;
                    int i2 = 0;
                    while (true) {
                        float[] fArr = bVar2.f282b;
                        if (i2 >= fArr.length) {
                            break;
                        }
                        bVar.f282b[i2] = (bVar3.f282b[i2] * f) + ((1.0f - f) * fArr[i2]);
                        i2++;
                    }
                    i++;
                } else {
                    throw null;
                }
            }
            return this.f431a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
