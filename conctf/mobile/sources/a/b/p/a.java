package a.b.p;

import a.b.j;
import a.b.o.i.g;
import a.f.k.k;
import a.f.k.p;
import a.f.k.q;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;

public abstract class a extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public final C0006a f106b;
    public final Context c;
    public ActionMenuView d;
    public c e;
    public int f;
    public p g;
    public boolean h;
    public boolean i;

    /* renamed from: a.b.p.a$a  reason: collision with other inner class name */
    public class C0006a implements q {

        /* renamed from: a  reason: collision with root package name */
        public boolean f107a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f108b;

        public C0006a() {
        }

        public void a(View view) {
            if (!this.f107a) {
                a aVar = a.this;
                aVar.g = null;
                a.super.setVisibility(this.f108b);
            }
        }

        public void b(View view) {
            a.super.setVisibility(0);
            this.f107a = false;
        }

        public void c(View view) {
            this.f107a = true;
        }
    }

    public a(Context context) {
        this(context, (AttributeSet) null);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f106b = new C0006a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(a.b.a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.c = context;
        } else {
            this.c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public int a(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    public int a(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public p a(int i2, long j) {
        p pVar = this.g;
        if (pVar != null) {
            pVar.a();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            p a2 = k.a(this);
            a2.a(1.0f);
            a2.a(j);
            C0006a aVar = this.f106b;
            a.this.g = a2;
            aVar.f108b = i2;
            View view = (View) a2.f330a.get();
            if (view != null) {
                a2.a(view, aVar);
            }
            return a2;
        }
        p a3 = k.a(this);
        a3.a(0.0f);
        a3.a(j);
        C0006a aVar2 = this.f106b;
        a.this.g = a3;
        aVar2.f108b = i2;
        View view2 = (View) a3.f330a.get();
        if (view2 != null) {
            a3.a(view2, aVar2);
        }
        return a3;
    }

    public int getAnimatedVisibility() {
        return this.g != null ? this.f106b.f108b : getVisibility();
    }

    public int getContentHeight() {
        return this.f;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, j.ActionBar, a.b.a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.e;
        if (cVar != null) {
            Configuration configuration2 = cVar.c.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            cVar.q = (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || (i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960)) ? 5 : (i2 >= 500 || (i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640)) ? 4 : i2 >= 360 ? 3 : 2;
            g gVar = cVar.d;
            if (gVar != null) {
                gVar.b(true);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.i = false;
        }
        if (!this.i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.i = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.h = false;
        }
        if (!this.h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i2);

    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            p pVar = this.g;
            if (pVar != null) {
                pVar.a();
            }
            super.setVisibility(i2);
        }
    }
}
