package a.b.k;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;

public class d extends n implements DialogInterface {
    public final AlertController d = new AlertController(getContext(), this, getWindow());

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final AlertController.b f6a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7b;

        public a(Context context) {
            int a2 = d.a(context, 0);
            this.f6a = new AlertController.b(new ContextThemeWrapper(context, d.a(context, a2)));
            this.f7b = a2;
        }

        public d a() {
            d dVar = new d(this.f6a.f461a, this.f7b);
            AlertController.b bVar = this.f6a;
            AlertController alertController = dVar.d;
            View view = bVar.g;
            if (view != null) {
                alertController.G = view;
            } else {
                CharSequence charSequence = bVar.f;
                if (charSequence != null) {
                    alertController.e = charSequence;
                    TextView textView = alertController.E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.d;
                if (drawable != null) {
                    alertController.C = drawable;
                    alertController.B = 0;
                    ImageView imageView = alertController.D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.D.setImageDrawable(drawable);
                    }
                }
                int i = bVar.c;
                if (i != 0) {
                    alertController.a(i);
                }
                int i2 = bVar.e;
                if (i2 != 0) {
                    if (alertController != null) {
                        TypedValue typedValue = new TypedValue();
                        alertController.f457a.getTheme().resolveAttribute(i2, typedValue, true);
                        alertController.a(typedValue.resourceId);
                    } else {
                        throw null;
                    }
                }
            }
            if (bVar.l != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.f462b.inflate(alertController.L, (ViewGroup) null);
                int i3 = bVar.o ? alertController.N : alertController.O;
                ListAdapter listAdapter = bVar.l;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar.f461a, i3, 16908308, (CharSequence[]) null);
                }
                alertController.H = listAdapter;
                alertController.I = bVar.p;
                if (bVar.m != null) {
                    recycleListView.setOnItemClickListener(new c(bVar, alertController));
                }
                if (bVar.o) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.g = recycleListView;
            }
            dVar.setCancelable(this.f6a.h);
            if (this.f6a.h) {
                dVar.setCanceledOnTouchOutside(true);
            }
            dVar.setOnCancelListener(this.f6a.i);
            dVar.setOnDismissListener(this.f6a.j);
            DialogInterface.OnKeyListener onKeyListener = this.f6a.k;
            if (onKeyListener != null) {
                dVar.setOnKeyListener(onKeyListener);
            }
            return dVar;
        }
    }

    public d(Context context, int i) {
        super(context, a(context, i));
    }

    public static int a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02df, code lost:
        if (r4 != null) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02e8, code lost:
        if (r4 != null) goto L_0x02ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            super.onCreate(r17)
            r0 = r16
            androidx.appcompat.app.AlertController r1 = r0.d
            int r2 = r1.K
            r3 = 1
            if (r2 != 0) goto L_0x000d
            goto L_0x0012
        L_0x000d:
            int r4 = r1.Q
            if (r4 != r3) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            int r2 = r1.J
        L_0x0014:
            a.b.k.n r4 = r1.f458b
            r4.setContentView((int) r2)
            android.view.Window r2 = r1.c
            int r4 = a.b.f.parentPanel
            android.view.View r2 = r2.findViewById(r4)
            int r4 = a.b.f.topPanel
            android.view.View r4 = r2.findViewById(r4)
            int r5 = a.b.f.contentPanel
            android.view.View r5 = r2.findViewById(r5)
            int r6 = a.b.f.buttonPanel
            android.view.View r6 = r2.findViewById(r6)
            int r7 = a.b.f.customPanel
            android.view.View r2 = r2.findViewById(r7)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r7 = r1.h
            r8 = 0
            r9 = 0
            if (r7 == 0) goto L_0x0042
            goto L_0x0054
        L_0x0042:
            int r7 = r1.i
            if (r7 == 0) goto L_0x0053
            android.content.Context r7 = r1.f457a
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r10 = r1.i
            android.view.View r7 = r7.inflate(r10, r2, r9)
            goto L_0x0054
        L_0x0053:
            r7 = r8
        L_0x0054:
            if (r7 == 0) goto L_0x0058
            r10 = r3
            goto L_0x0059
        L_0x0058:
            r10 = r9
        L_0x0059:
            if (r10 == 0) goto L_0x0061
            boolean r11 = androidx.appcompat.app.AlertController.a((android.view.View) r7)
            if (r11 != 0) goto L_0x0068
        L_0x0061:
            android.view.Window r11 = r1.c
            r12 = 131072(0x20000, float:1.83671E-40)
            r11.setFlags(r12, r12)
        L_0x0068:
            r11 = -1
            r12 = 8
            if (r10 == 0) goto L_0x009c
            android.view.Window r10 = r1.c
            int r13 = a.b.f.custom
            android.view.View r10 = r10.findViewById(r13)
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            android.view.ViewGroup$LayoutParams r13 = new android.view.ViewGroup$LayoutParams
            r13.<init>(r11, r11)
            r10.addView(r7, r13)
            boolean r7 = r1.n
            if (r7 == 0) goto L_0x008e
            int r7 = r1.j
            int r13 = r1.k
            int r14 = r1.l
            int r15 = r1.m
            r10.setPadding(r7, r13, r14, r15)
        L_0x008e:
            android.widget.ListView r7 = r1.g
            if (r7 == 0) goto L_0x009f
            android.view.ViewGroup$LayoutParams r7 = r2.getLayoutParams()
            a.b.p.i0$a r7 = (a.b.p.i0.a) r7
            r10 = 0
            r7.f138a = r10
            goto L_0x009f
        L_0x009c:
            r2.setVisibility(r12)
        L_0x009f:
            int r7 = a.b.f.topPanel
            android.view.View r7 = r2.findViewById(r7)
            int r10 = a.b.f.contentPanel
            android.view.View r10 = r2.findViewById(r10)
            int r13 = a.b.f.buttonPanel
            android.view.View r13 = r2.findViewById(r13)
            android.view.ViewGroup r4 = r1.a(r7, r4)
            android.view.ViewGroup r5 = r1.a(r10, r5)
            android.view.ViewGroup r6 = r1.a(r13, r6)
            android.view.Window r7 = r1.c
            int r10 = a.b.f.scrollView
            android.view.View r7 = r7.findViewById(r10)
            androidx.core.widget.NestedScrollView r7 = (androidx.core.widget.NestedScrollView) r7
            r1.A = r7
            r7.setFocusable(r9)
            androidx.core.widget.NestedScrollView r7 = r1.A
            r7.setNestedScrollingEnabled(r9)
            r7 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1.F = r7
            if (r7 != 0) goto L_0x00df
            goto L_0x0114
        L_0x00df:
            java.lang.CharSequence r10 = r1.f
            if (r10 == 0) goto L_0x00e7
            r7.setText(r10)
            goto L_0x0114
        L_0x00e7:
            r7.setVisibility(r12)
            androidx.core.widget.NestedScrollView r7 = r1.A
            android.widget.TextView r10 = r1.F
            r7.removeView(r10)
            android.widget.ListView r7 = r1.g
            if (r7 == 0) goto L_0x0111
            androidx.core.widget.NestedScrollView r7 = r1.A
            android.view.ViewParent r7 = r7.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            androidx.core.widget.NestedScrollView r10 = r1.A
            int r10 = r7.indexOfChild(r10)
            r7.removeViewAt(r10)
            android.widget.ListView r13 = r1.g
            android.view.ViewGroup$LayoutParams r14 = new android.view.ViewGroup$LayoutParams
            r14.<init>(r11, r11)
            r7.addView(r13, r10, r14)
            goto L_0x0114
        L_0x0111:
            r5.setVisibility(r12)
        L_0x0114:
            r7 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r1.o = r7
            android.view.View$OnClickListener r10 = r1.S
            r7.setOnClickListener(r10)
            java.lang.CharSequence r7 = r1.p
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x0137
            android.graphics.drawable.Drawable r7 = r1.r
            if (r7 != 0) goto L_0x0137
            android.widget.Button r7 = r1.o
            r7.setVisibility(r12)
            r7 = r9
            goto L_0x0154
        L_0x0137:
            android.widget.Button r7 = r1.o
            java.lang.CharSequence r10 = r1.p
            r7.setText(r10)
            android.graphics.drawable.Drawable r7 = r1.r
            if (r7 == 0) goto L_0x014e
            int r10 = r1.d
            r7.setBounds(r9, r9, r10, r10)
            android.widget.Button r7 = r1.o
            android.graphics.drawable.Drawable r10 = r1.r
            r7.setCompoundDrawables(r10, r8, r8, r8)
        L_0x014e:
            android.widget.Button r7 = r1.o
            r7.setVisibility(r9)
            r7 = r3
        L_0x0154:
            r10 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r10 = r6.findViewById(r10)
            android.widget.Button r10 = (android.widget.Button) r10
            r1.s = r10
            android.view.View$OnClickListener r13 = r1.S
            r10.setOnClickListener(r13)
            java.lang.CharSequence r10 = r1.t
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0176
            android.graphics.drawable.Drawable r10 = r1.v
            if (r10 != 0) goto L_0x0176
            android.widget.Button r10 = r1.s
            r10.setVisibility(r12)
            goto L_0x0194
        L_0x0176:
            android.widget.Button r10 = r1.s
            java.lang.CharSequence r13 = r1.t
            r10.setText(r13)
            android.graphics.drawable.Drawable r10 = r1.v
            if (r10 == 0) goto L_0x018d
            int r13 = r1.d
            r10.setBounds(r9, r9, r13, r13)
            android.widget.Button r10 = r1.s
            android.graphics.drawable.Drawable r13 = r1.v
            r10.setCompoundDrawables(r13, r8, r8, r8)
        L_0x018d:
            android.widget.Button r10 = r1.s
            r10.setVisibility(r9)
            r7 = r7 | 2
        L_0x0194:
            r10 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r10 = r6.findViewById(r10)
            android.widget.Button r10 = (android.widget.Button) r10
            r1.w = r10
            android.view.View$OnClickListener r13 = r1.S
            r10.setOnClickListener(r13)
            java.lang.CharSequence r10 = r1.x
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x01b6
            android.graphics.drawable.Drawable r10 = r1.z
            if (r10 != 0) goto L_0x01b6
            android.widget.Button r10 = r1.w
            r10.setVisibility(r12)
            goto L_0x01d4
        L_0x01b6:
            android.widget.Button r10 = r1.w
            java.lang.CharSequence r13 = r1.x
            r10.setText(r13)
            android.graphics.drawable.Drawable r10 = r1.r
            if (r10 == 0) goto L_0x01cd
            int r13 = r1.d
            r10.setBounds(r9, r9, r13, r13)
            android.widget.Button r10 = r1.o
            android.graphics.drawable.Drawable r13 = r1.r
            r10.setCompoundDrawables(r13, r8, r8, r8)
        L_0x01cd:
            android.widget.Button r10 = r1.w
            r10.setVisibility(r9)
            r7 = r7 | 4
        L_0x01d4:
            android.content.Context r10 = r1.f457a
            android.util.TypedValue r13 = new android.util.TypedValue
            r13.<init>()
            android.content.res.Resources$Theme r10 = r10.getTheme()
            int r14 = a.b.a.alertDialogCenterButtons
            r10.resolveAttribute(r14, r13, r3)
            int r10 = r13.data
            if (r10 == 0) goto L_0x01ea
            r10 = r3
            goto L_0x01eb
        L_0x01ea:
            r10 = r9
        L_0x01eb:
            r13 = 2
            if (r10 == 0) goto L_0x0200
            if (r7 != r3) goto L_0x01f3
            android.widget.Button r10 = r1.o
            goto L_0x01fd
        L_0x01f3:
            if (r7 != r13) goto L_0x01f8
            android.widget.Button r10 = r1.s
            goto L_0x01fd
        L_0x01f8:
            r10 = 4
            if (r7 != r10) goto L_0x0200
            android.widget.Button r10 = r1.w
        L_0x01fd:
            r1.a((android.widget.Button) r10)
        L_0x0200:
            if (r7 == 0) goto L_0x0204
            r7 = r3
            goto L_0x0205
        L_0x0204:
            r7 = r9
        L_0x0205:
            if (r7 != 0) goto L_0x020a
            r6.setVisibility(r12)
        L_0x020a:
            android.view.View r7 = r1.G
            if (r7 == 0) goto L_0x0226
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams
            r10 = -2
            r7.<init>(r11, r10)
            android.view.View r10 = r1.G
            r4.addView(r10, r9, r7)
            android.view.Window r7 = r1.c
            int r10 = a.b.f.title_template
            android.view.View r7 = r7.findViewById(r10)
            r7.setVisibility(r12)
            goto L_0x029b
        L_0x0226:
            android.view.Window r7 = r1.c
            r10 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r7 = r7.findViewById(r10)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r1.D = r7
            java.lang.CharSequence r7 = r1.e
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x0288
            boolean r7 = r1.P
            if (r7 == 0) goto L_0x0288
            android.view.Window r7 = r1.c
            int r10 = a.b.f.alertTitle
            android.view.View r7 = r7.findViewById(r10)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1.E = r7
            java.lang.CharSequence r10 = r1.e
            r7.setText(r10)
            int r7 = r1.B
            if (r7 == 0) goto L_0x025b
            android.widget.ImageView r10 = r1.D
            r10.setImageResource(r7)
            goto L_0x029b
        L_0x025b:
            android.graphics.drawable.Drawable r7 = r1.C
            if (r7 == 0) goto L_0x0265
            android.widget.ImageView r10 = r1.D
            r10.setImageDrawable(r7)
            goto L_0x029b
        L_0x0265:
            android.widget.TextView r7 = r1.E
            android.widget.ImageView r10 = r1.D
            int r10 = r10.getPaddingLeft()
            android.widget.ImageView r14 = r1.D
            int r14 = r14.getPaddingTop()
            android.widget.ImageView r15 = r1.D
            int r15 = r15.getPaddingRight()
            android.widget.ImageView r13 = r1.D
            int r13 = r13.getPaddingBottom()
            r7.setPadding(r10, r14, r15, r13)
            android.widget.ImageView r7 = r1.D
            r7.setVisibility(r12)
            goto L_0x029b
        L_0x0288:
            android.view.Window r7 = r1.c
            int r10 = a.b.f.title_template
            android.view.View r7 = r7.findViewById(r10)
            r7.setVisibility(r12)
            android.widget.ImageView r7 = r1.D
            r7.setVisibility(r12)
            r4.setVisibility(r12)
        L_0x029b:
            int r2 = r2.getVisibility()
            if (r2 == r12) goto L_0x02a3
            r2 = r3
            goto L_0x02a4
        L_0x02a3:
            r2 = r9
        L_0x02a4:
            if (r4 == 0) goto L_0x02ae
            int r7 = r4.getVisibility()
            if (r7 == r12) goto L_0x02ae
            r7 = r3
            goto L_0x02af
        L_0x02ae:
            r7 = r9
        L_0x02af:
            int r6 = r6.getVisibility()
            if (r6 == r12) goto L_0x02b7
            r6 = r3
            goto L_0x02b8
        L_0x02b7:
            r6 = r9
        L_0x02b8:
            if (r6 != 0) goto L_0x02c5
            int r10 = a.b.f.textSpacerNoButtons
            android.view.View r10 = r5.findViewById(r10)
            if (r10 == 0) goto L_0x02c5
            r10.setVisibility(r9)
        L_0x02c5:
            if (r7 == 0) goto L_0x02e2
            androidx.core.widget.NestedScrollView r10 = r1.A
            if (r10 == 0) goto L_0x02ce
            r10.setClipToPadding(r3)
        L_0x02ce:
            java.lang.CharSequence r10 = r1.f
            if (r10 != 0) goto L_0x02d9
            android.widget.ListView r10 = r1.g
            if (r10 == 0) goto L_0x02d7
            goto L_0x02d9
        L_0x02d7:
            r4 = r8
            goto L_0x02df
        L_0x02d9:
            int r10 = a.b.f.titleDividerNoCustom
            android.view.View r4 = r4.findViewById(r10)
        L_0x02df:
            if (r4 == 0) goto L_0x02ed
            goto L_0x02ea
        L_0x02e2:
            int r4 = a.b.f.textSpacerNoTitle
            android.view.View r4 = r5.findViewById(r4)
            if (r4 == 0) goto L_0x02ed
        L_0x02ea:
            r4.setVisibility(r9)
        L_0x02ed:
            android.widget.ListView r4 = r1.g
            boolean r10 = r4 instanceof androidx.appcompat.app.AlertController.RecycleListView
            if (r10 == 0) goto L_0x031a
            androidx.appcompat.app.AlertController$RecycleListView r4 = (androidx.appcompat.app.AlertController.RecycleListView) r4
            if (r4 == 0) goto L_0x0319
            if (r6 == 0) goto L_0x02fb
            if (r7 != 0) goto L_0x031a
        L_0x02fb:
            int r8 = r4.getPaddingLeft()
            if (r7 == 0) goto L_0x0306
            int r10 = r4.getPaddingTop()
            goto L_0x0308
        L_0x0306:
            int r10 = r4.f459b
        L_0x0308:
            int r12 = r4.getPaddingRight()
            if (r6 == 0) goto L_0x0313
            int r13 = r4.getPaddingBottom()
            goto L_0x0315
        L_0x0313:
            int r13 = r4.c
        L_0x0315:
            r4.setPadding(r8, r10, r12, r13)
            goto L_0x031a
        L_0x0319:
            throw r8
        L_0x031a:
            if (r2 != 0) goto L_0x0348
            android.widget.ListView r2 = r1.g
            if (r2 == 0) goto L_0x0321
            goto L_0x0323
        L_0x0321:
            androidx.core.widget.NestedScrollView r2 = r1.A
        L_0x0323:
            if (r2 == 0) goto L_0x0348
            if (r6 == 0) goto L_0x0328
            r9 = 2
        L_0x0328:
            r4 = r7 | r9
            r6 = 3
            android.view.Window r7 = r1.c
            int r8 = a.b.f.scrollIndicatorUp
            android.view.View r7 = r7.findViewById(r8)
            android.view.Window r8 = r1.c
            int r9 = a.b.f.scrollIndicatorDown
            android.view.View r8 = r8.findViewById(r9)
            a.f.k.k.a((android.view.View) r2, (int) r4, (int) r6)
            if (r7 == 0) goto L_0x0343
            r5.removeView(r7)
        L_0x0343:
            if (r8 == 0) goto L_0x0348
            r5.removeView(r8)
        L_0x0348:
            android.widget.ListView r2 = r1.g
            if (r2 == 0) goto L_0x035d
            android.widget.ListAdapter r4 = r1.H
            if (r4 == 0) goto L_0x035d
            r2.setAdapter(r4)
            int r1 = r1.I
            if (r1 <= r11) goto L_0x035d
            r2.setItemChecked(r1, r3)
            r2.setSelection(r1)
        L_0x035d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.d.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.d.A;
        if (nestedScrollView != null && nestedScrollView.a(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.d.A;
        if (nestedScrollView != null && nestedScrollView.a(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.d;
        alertController.e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
