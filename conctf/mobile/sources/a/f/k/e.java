package a.f.k;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f318a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f319b;
    public final View c;
    public boolean d;
    public int[] e;

    public e(View view) {
        this.c = view;
    }

    public final ViewParent a(int i) {
        if (i == 0) {
            return this.f318a;
        }
        if (i != 1) {
            return null;
        }
        return this.f319b;
    }

    public final boolean a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent a2;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i8 = i5;
        if (!this.d || (a2 = a(i8)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.c.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            int[] iArr5 = this.e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        View view = this.c;
        if (a2 instanceof g) {
            ((g) a2).a(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (a2 instanceof f) {
                ((f) a2).a(view, i, i2, i3, i4, i5);
            } else if (i8 == 0) {
                try {
                    a2.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + a2 + " does not implement interface method onNestedScroll", e2);
                }
            }
        }
        if (iArr4 != null) {
            this.c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }
}
