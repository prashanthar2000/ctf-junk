package a.b.p;

import a.b.f;
import a.b.g;
import a.b.i;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

public class b1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f116a;

    /* renamed from: b  reason: collision with root package name */
    public final View f117b;
    public final TextView c;
    public final WindowManager.LayoutParams d = new WindowManager.LayoutParams();
    public final Rect e = new Rect();
    public final int[] f = new int[2];
    public final int[] g = new int[2];

    public b1(Context context) {
        this.f116a = context;
        View inflate = LayoutInflater.from(context).inflate(g.abc_tooltip, (ViewGroup) null);
        this.f117b = inflate;
        this.c = (TextView) inflate.findViewById(f.message);
        this.d.setTitle(b1.class.getSimpleName());
        this.d.packageName = this.f116a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public void a() {
        if (this.f117b.getParent() != null) {
            ((WindowManager) this.f116a.getSystemService("window")).removeView(this.f117b);
        }
    }
}
