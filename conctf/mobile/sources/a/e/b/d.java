package a.e.b;

import a.e.b.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

public class d extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public c f259b;

    public static class a extends ConstraintLayout.a {
        public float m0;
        public boolean n0;
        public float o0;
        public float p0;
        public float q0;
        public float r0;
        public float s0;
        public float t0;
        public float u0;
        public float v0;
        public float w0;
        public float x0;
        public float y0;

        public a(int i, int i2) {
            super(i, i2);
            this.m0 = 1.0f;
            this.n0 = false;
            this.o0 = 0.0f;
            this.p0 = 0.0f;
            this.q0 = 0.0f;
            this.r0 = 0.0f;
            this.s0 = 1.0f;
            this.t0 = 1.0f;
            this.u0 = 0.0f;
            this.v0 = 0.0f;
            this.w0 = 0.0f;
            this.x0 = 0.0f;
            this.y0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            float f;
            this.m0 = 1.0f;
            this.n0 = false;
            this.o0 = 0.0f;
            this.p0 = 0.0f;
            this.q0 = 0.0f;
            this.r0 = 0.0f;
            this.s0 = 1.0f;
            this.t0 = 1.0f;
            this.u0 = 0.0f;
            this.v0 = 0.0f;
            this.w0 = 0.0f;
            this.x0 = 0.0f;
            this.y0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == h.ConstraintSet_android_alpha) {
                    this.m0 = obtainStyledAttributes.getFloat(index, this.m0);
                } else if (index == h.ConstraintSet_android_elevation) {
                    this.o0 = obtainStyledAttributes.getFloat(index, this.o0);
                    this.n0 = true;
                } else if (index == h.ConstraintSet_android_rotationX) {
                    this.q0 = obtainStyledAttributes.getFloat(index, this.q0);
                } else if (index == h.ConstraintSet_android_rotationY) {
                    this.r0 = obtainStyledAttributes.getFloat(index, this.r0);
                } else if (index == h.ConstraintSet_android_rotation) {
                    this.p0 = obtainStyledAttributes.getFloat(index, this.p0);
                } else if (index == h.ConstraintSet_android_scaleX) {
                    this.s0 = obtainStyledAttributes.getFloat(index, this.s0);
                } else if (index == h.ConstraintSet_android_scaleY) {
                    this.t0 = obtainStyledAttributes.getFloat(index, this.t0);
                } else if (index == h.ConstraintSet_android_transformPivotX) {
                    this.u0 = obtainStyledAttributes.getFloat(index, this.u0);
                } else if (index == h.ConstraintSet_android_transformPivotY) {
                    this.v0 = obtainStyledAttributes.getFloat(index, this.v0);
                } else {
                    if (index == h.ConstraintSet_android_translationX) {
                        f = this.w0;
                    } else if (index == h.ConstraintSet_android_translationY) {
                        this.x0 = obtainStyledAttributes.getFloat(index, this.x0);
                    } else if (index == h.ConstraintSet_android_translationZ) {
                        f = this.y0;
                    }
                    this.w0 = obtainStyledAttributes.getFloat(index, f);
                }
            }
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    public c getConstraintSet() {
        if (this.f259b == null) {
            this.f259b = new c();
        }
        c cVar = this.f259b;
        if (cVar != null) {
            int childCount = getChildCount();
            cVar.f256a.clear();
            int i = 0;
            while (i < childCount) {
                View childAt = getChildAt(i);
                a aVar = (a) childAt.getLayoutParams();
                int id = childAt.getId();
                if (id != -1) {
                    if (!cVar.f256a.containsKey(Integer.valueOf(id))) {
                        cVar.f256a.put(Integer.valueOf(id), new c.a());
                    }
                    c.a aVar2 = cVar.f256a.get(Integer.valueOf(id));
                    if (childAt instanceof b) {
                        b bVar = (b) childAt;
                        aVar2.a(id, aVar);
                        if (bVar instanceof a) {
                            aVar2.t0 = 1;
                            a aVar3 = (a) bVar;
                            aVar2.s0 = aVar3.getType();
                            aVar2.u0 = aVar3.getReferencedIds();
                        }
                    }
                    aVar2.a(id, aVar);
                    i++;
                } else {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
            }
            return this.f259b;
        }
        throw null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
