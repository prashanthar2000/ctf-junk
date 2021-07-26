package a.b.k;

import a.b.j;
import a.b.o.a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;

public abstract class a {

    /* renamed from: a.b.k.a$a  reason: collision with other inner class name */
    public static class C0000a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f2a;

        public C0000a(int i, int i2) {
            super(i, i2);
            this.f2a = 0;
            this.f2a = 8388627;
        }

        public C0000a(C0000a aVar) {
            super(aVar);
            this.f2a = 0;
            this.f2a = aVar.f2a;
        }

        public C0000a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionBarLayout);
            this.f2a = obtainStyledAttributes.getInt(j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0000a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2a = 0;
        }
    }

    public interface b {
        void a(boolean z);
    }

    @Deprecated
    public static abstract class c {
        public abstract void a();
    }

    public abstract a.b.o.a a(a.C0004a aVar);

    public abstract void a(Configuration configuration);

    public abstract void a(CharSequence charSequence);

    public abstract void a(boolean z);

    public abstract boolean a();

    public abstract boolean a(int i, KeyEvent keyEvent);

    public abstract int b();

    public abstract void b(boolean z);

    public abstract Context c();

    public abstract void c(boolean z);
}
