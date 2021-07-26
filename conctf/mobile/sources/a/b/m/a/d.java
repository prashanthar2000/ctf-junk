package a.b.m.a;

import a.b.m.a.b;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

@SuppressLint({"RestrictedAPI"})
public class d extends b {
    public a n;
    public boolean o;

    public static class a extends b.c {
        public int[][] J;

        public a(a aVar, d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[this.g.length][];
            }
        }

        public int a(int[] iArr) {
            int[][] iArr2 = this.J;
            int i = this.h;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        public void d() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.J = iArr2;
        }

        public Drawable newDrawable() {
            return new d(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new d(this, resources);
        }
    }

    public d(a aVar) {
        if (aVar != null) {
            a(aVar);
        }
    }

    public d(a aVar, Resources resources) {
        a(new a(aVar, this, resources));
        onStateChange(getState());
    }

    public a a() {
        return new a(this.n, this, (Resources) null);
    }

    public void a(b.c cVar) {
        super.a(cVar);
        if (cVar instanceof a) {
            this.n = (a) cVar;
        }
    }

    public void applyTheme(Resources.Theme theme) {
        b.c cVar = this.f50b;
        if (cVar != null) {
            if (theme != null) {
                cVar.c();
                int i = cVar.h;
                Drawable[] drawableArr = cVar.g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        cVar.e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                cVar.a(theme.getResources());
            }
            onStateChange(getState());
            return;
        }
        throw null;
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.o) {
            super.mutate();
            if (this == this) {
                this.n.d();
                this.o = true;
            }
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r0 = r3.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStateChange(int[] r4) {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.e
            r1 = 0
            if (r0 == 0) goto L_0x000a
        L_0x0005:
            boolean r0 = r0.setState(r4)
            goto L_0x0010
        L_0x000a:
            android.graphics.drawable.Drawable r0 = r3.d
            if (r0 == 0) goto L_0x000f
            goto L_0x0005
        L_0x000f:
            r0 = r1
        L_0x0010:
            a.b.m.a.d$a r2 = r3.n
            int r4 = r2.a(r4)
            if (r4 >= 0) goto L_0x0020
            a.b.m.a.d$a r4 = r3.n
            int[] r2 = android.util.StateSet.WILD_CARD
            int r4 = r4.a(r2)
        L_0x0020:
            boolean r4 = r3.a((int) r4)
            if (r4 != 0) goto L_0x0028
            if (r0 == 0) goto L_0x0029
        L_0x0028:
            r1 = 1
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.m.a.d.onStateChange(int[]):boolean");
    }
}
