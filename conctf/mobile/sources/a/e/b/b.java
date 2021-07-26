package a.e.b;

import a.e.a.h.d;
import a.e.a.h.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;

public abstract class b extends View {

    /* renamed from: b  reason: collision with root package name */
    public int[] f254b = new int[32];
    public int c;
    public Context d;
    public h e;
    public boolean f = false;
    public String g;

    public b(Context context) {
        super(context);
        this.d = context;
        a((AttributeSet) null);
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    a(str.substring(i));
                    return;
                } else {
                    a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void a() {
        if (this.e != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.a) {
                ((ConstraintLayout.a) layoutParams).k0 = this.e;
            }
        }
    }

    public void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == h.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.g = string;
                    setIds(string);
                }
            }
        }
    }

    public void a(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.g);
        }
        h hVar = this.e;
        if (hVar != null) {
            hVar.l0 = 0;
            for (int i = 0; i < this.c; i++) {
                View view = constraintLayout.f503b.get(this.f254b[i]);
                if (view != null) {
                    h hVar2 = this.e;
                    d a2 = constraintLayout.a(view);
                    int i2 = hVar2.l0 + 1;
                    d[] dVarArr = hVar2.k0;
                    if (i2 > dVarArr.length) {
                        hVar2.k0 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    }
                    d[] dVarArr2 = hVar2.k0;
                    int i3 = hVar2.l0;
                    dVarArr2[i3] = a2;
                    hVar2.l0 = i3 + 1;
                }
            }
        }
    }

    public final void a(String str) {
        int i;
        Object a2;
        if (str != null && this.d != null) {
            String trim = str.trim();
            try {
                i = g.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = this.d.getResources().getIdentifier(trim, "id", this.d.getPackageName());
            }
            if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (a2 = ((ConstraintLayout) getParent()).a(0, (Object) trim)) != null && (a2 instanceof Integer)) {
                i = ((Integer) a2).intValue();
            }
            if (i != 0) {
                setTag(i, (Object) null);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f254b, this.c);
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i, int i2) {
        if (this.f) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.c = 0;
        for (int tag : iArr) {
            setTag(tag, (Object) null);
        }
    }

    public void setTag(int i, Object obj) {
        int i2 = this.c + 1;
        int[] iArr = this.f254b;
        if (i2 > iArr.length) {
            this.f254b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f254b;
        int i3 = this.c;
        iArr2[i3] = i;
        this.c = i3 + 1;
    }
}
