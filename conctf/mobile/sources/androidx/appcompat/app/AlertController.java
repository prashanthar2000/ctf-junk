package androidx.appcompat.app;

import a.b.j;
import a.b.k.n;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

public class AlertController {
    public NestedScrollView A;
    public int B = 0;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int I = -1;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public int Q = 0;
    public Handler R;
    public final View.OnClickListener S = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Context f457a;

    /* renamed from: b  reason: collision with root package name */
    public final n f458b;
    public final Window c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public ListView g;
    public View h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n = false;
    public Button o;
    public CharSequence p;
    public Message q;
    public Drawable r;
    public Button s;
    public CharSequence t;
    public Message u;
    public Drawable v;
    public Button w;
    public CharSequence x;
    public Message y;
    public Drawable z;

    public static class RecycleListView extends ListView {

        /* renamed from: b  reason: collision with root package name */
        public final int f459b;
        public final int c;

        public RecycleListView(Context context) {
            this(context, (AttributeSet) null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.RecycleListView);
            this.c = obtainStyledAttributes.getDimensionPixelOffset(j.RecycleListView_paddingBottomNoButtons, -1);
            this.f459b = obtainStyledAttributes.getDimensionPixelOffset(j.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
            r3 = r0.y;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.o
                if (r3 != r1) goto L_0x000f
                android.os.Message r0 = r0.q
                if (r0 == 0) goto L_0x000f
            L_0x000a:
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L_0x002a
            L_0x000f:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.s
                if (r3 != r1) goto L_0x001a
                android.os.Message r0 = r0.u
                if (r0 == 0) goto L_0x001a
                goto L_0x000a
            L_0x001a:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.w
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.y
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.R
                r1 = 1
                a.b.k.n r3 = r3.f458b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.a.onClick(android.view.View):void");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f461a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f462b;
        public int c = 0;
        public Drawable d;
        public int e = 0;
        public CharSequence f;
        public View g;
        public boolean h;
        public DialogInterface.OnCancelListener i;
        public DialogInterface.OnDismissListener j;
        public DialogInterface.OnKeyListener k;
        public ListAdapter l;
        public DialogInterface.OnClickListener m;
        public boolean n = false;
        public boolean o;
        public int p = -1;

        public b(Context context) {
            this.f461a = context;
            this.h = true;
            this.f462b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    public static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<DialogInterface> f463a;

        public c(DialogInterface dialogInterface) {
            this.f463a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f463a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, n nVar, Window window) {
        this.f457a = context;
        this.f458b = nVar;
        this.c = window;
        this.R = new c(nVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, j.AlertDialog, a.b.a.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(j.AlertDialog_android_layout, 0);
        this.K = obtainStyledAttributes.getResourceId(j.AlertDialog_buttonPanelSideLayout, 0);
        this.L = obtainStyledAttributes.getResourceId(j.AlertDialog_listLayout, 0);
        this.M = obtainStyledAttributes.getResourceId(j.AlertDialog_multiChoiceItemLayout, 0);
        this.N = obtainStyledAttributes.getResourceId(j.AlertDialog_singleChoiceItemLayout, 0);
        this.O = obtainStyledAttributes.getResourceId(j.AlertDialog_listItemLayout, 0);
        this.P = obtainStyledAttributes.getBoolean(j.AlertDialog_showTitle, true);
        this.d = obtainStyledAttributes.getDimensionPixelSize(j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        nVar.a().a(1);
    }

    public static void a(View view, View view2, View view3) {
        int i2 = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i2 = 4;
            }
            view3.setVisibility(i2);
        }
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public final ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public void a(int i2) {
        this.C = null;
        this.B = i2;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (i2 != 0) {
            imageView.setVisibility(0);
            this.D.setImageResource(this.B);
            return;
        }
        imageView.setVisibility(8);
    }

    public final void a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }
}
