package a.b.p;

import a.b.k.d;
import a.f.k.k;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;

public class w extends Spinner {
    public static final int[] j = {16843505};

    /* renamed from: b  reason: collision with root package name */
    public final e f175b;
    public final Context c;
    public h0 d;
    public SpinnerAdapter e;
    public final boolean f;
    public f g;
    public int h;
    public final Rect i = new Rect();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (!w.this.getInternalPopup().a()) {
                w.this.a();
            }
            ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    public class b implements f, DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public a.b.k.d f177b;
        public ListAdapter c;
        public CharSequence d;

        public b() {
        }

        public void a(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public void a(int i, int i2) {
            if (this.c != null) {
                d.a aVar = new d.a(w.this.getPopupContext());
                CharSequence charSequence = this.d;
                if (charSequence != null) {
                    aVar.f6a.f = charSequence;
                }
                ListAdapter listAdapter = this.c;
                int selectedItemPosition = w.this.getSelectedItemPosition();
                AlertController.b bVar = aVar.f6a;
                bVar.l = listAdapter;
                bVar.m = this;
                bVar.p = selectedItemPosition;
                bVar.o = true;
                a.b.k.d a2 = aVar.a();
                this.f177b = a2;
                ListView listView = a2.d.g;
                listView.setTextDirection(i);
                listView.setTextAlignment(i2);
                this.f177b.show();
            }
        }

        public void a(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public void a(ListAdapter listAdapter) {
            this.c = listAdapter;
        }

        public void a(CharSequence charSequence) {
            this.d = charSequence;
        }

        public boolean a() {
            a.b.k.d dVar = this.f177b;
            if (dVar != null) {
                return dVar.isShowing();
            }
            return false;
        }

        public CharSequence b() {
            return this.d;
        }

        public void b(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public int c() {
            return 0;
        }

        public void c(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        public void dismiss() {
            a.b.k.d dVar = this.f177b;
            if (dVar != null) {
                dVar.dismiss();
                this.f177b = null;
            }
        }

        public int f() {
            return 0;
        }

        public Drawable g() {
            return null;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            w.this.setSelection(i);
            if (w.this.getOnItemClickListener() != null) {
                w.this.performItemClick((View) null, i, this.c.getItemId(i));
            }
            a.b.k.d dVar = this.f177b;
            if (dVar != null) {
                dVar.dismiss();
                this.f177b = null;
            }
        }
    }

    public static class c implements ListAdapter, SpinnerAdapter {

        /* renamed from: b  reason: collision with root package name */
        public SpinnerAdapter f178b;
        public ListAdapter c;

        public c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f178b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.c = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof t0) {
                t0 t0Var = (t0) spinnerAdapter;
                if (t0Var.getDropDownViewTheme() == null) {
                    t0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f178b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f178b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f178b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f178b;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f178b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f178b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f178b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f178b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class d extends k0 implements f {
        public CharSequence G;
        public ListAdapter H;
        public final Rect I = new Rect();
        public int J;

        public class a implements AdapterView.OnItemClickListener {
            public a(w wVar) {
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                w.this.setSelection(i);
                if (w.this.getOnItemClickListener() != null) {
                    d dVar = d.this;
                    w.this.performItemClick(view, i, dVar.H.getItemId(i));
                }
                d.this.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            public void onGlobalLayout() {
                d dVar = d.this;
                w wVar = w.this;
                if (dVar != null) {
                    if (!(k.h(wVar) && wVar.getGlobalVisibleRect(dVar.I))) {
                        d.this.dismiss();
                        return;
                    }
                    d.this.h();
                    d.super.e();
                    return;
                }
                throw null;
            }
        }

        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f181b;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f181b = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f181b);
                }
            }
        }

        public d(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.s = w.this;
            a(true);
            this.q = 0;
            this.t = new a(w.this);
        }

        public void a(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean a2 = a();
            h();
            this.C.setInputMethodMode(2);
            super.e();
            f0 f0Var = this.d;
            f0Var.setChoiceMode(1);
            f0Var.setTextDirection(i);
            f0Var.setTextAlignment(i2);
            int selectedItemPosition = w.this.getSelectedItemPosition();
            f0 f0Var2 = this.d;
            if (a() && f0Var2 != null) {
                f0Var2.setListSelectionHidden(false);
                f0Var2.setSelection(selectedItemPosition);
                if (f0Var2.getChoiceMode() != 0) {
                    f0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!a2 && (viewTreeObserver = w.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                this.C.setOnDismissListener(new c(bVar));
            }
        }

        public void a(ListAdapter listAdapter) {
            super.a(listAdapter);
            this.H = listAdapter;
        }

        public void a(CharSequence charSequence) {
            this.G = charSequence;
        }

        public CharSequence b() {
            return this.G;
        }

        public void c(int i) {
            this.J = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0096  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void h() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.g()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                a.b.p.w r1 = a.b.p.w.this
                android.graphics.Rect r1 = r1.i
                r0.getPadding(r1)
                a.b.p.w r0 = a.b.p.w.this
                boolean r0 = a.b.p.d1.a(r0)
                if (r0 == 0) goto L_0x001d
                a.b.p.w r0 = a.b.p.w.this
                android.graphics.Rect r0 = r0.i
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                a.b.p.w r0 = a.b.p.w.this
                android.graphics.Rect r0 = r0.i
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                a.b.p.w r0 = a.b.p.w.this
                android.graphics.Rect r0 = r0.i
                r0.right = r1
                r0.left = r1
            L_0x002e:
                a.b.p.w r0 = a.b.p.w.this
                int r0 = r0.getPaddingLeft()
                a.b.p.w r2 = a.b.p.w.this
                int r2 = r2.getPaddingRight()
                a.b.p.w r3 = a.b.p.w.this
                int r3 = r3.getWidth()
                a.b.p.w r4 = a.b.p.w.this
                int r5 = r4.h
                r6 = -2
                if (r5 != r6) goto L_0x0078
                android.widget.ListAdapter r5 = r8.H
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.g()
                int r4 = r4.a(r5, r6)
                a.b.p.w r5 = a.b.p.w.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                a.b.p.w r6 = a.b.p.w.this
                android.graphics.Rect r6 = r6.i
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x007e
            L_0x0078:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r0
                int r4 = r4 - r2
            L_0x007e:
                r8.d(r4)
                goto L_0x0085
            L_0x0082:
                r8.d(r5)
            L_0x0085:
                a.b.p.w r4 = a.b.p.w.this
                boolean r4 = a.b.p.d1.a(r4)
                if (r4 == 0) goto L_0x0096
                int r3 = r3 - r2
                int r0 = r8.f
                int r3 = r3 - r0
                int r0 = r8.J
                int r3 = r3 - r0
                int r3 = r3 + r1
                goto L_0x009b
            L_0x0096:
                int r2 = r8.J
                int r0 = r0 + r2
                int r3 = r0 + r1
            L_0x009b:
                r8.g = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.p.w.d.h():void");
        }
    }

    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public boolean f182b;

        public static class a implements Parcelable.Creator<e> {
            public Object createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            public Object[] newArray(int i) {
                return new e[i];
            }
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f182b = parcel.readByte() != 0;
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f182b ? (byte) 1 : 0);
        }
    }

    public interface f {
        void a(int i);

        void a(int i, int i2);

        void a(Drawable drawable);

        void a(ListAdapter listAdapter);

        void a(CharSequence charSequence);

        boolean a();

        CharSequence b();

        void b(int i);

        int c();

        void c(int i);

        void dismiss();

        int f();

        Drawable g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r4 != null) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.i = r0
            int[] r0 = a.b.j.Spinner
            r1 = 0
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r10, r0, r11, r1)
            a.b.p.e r2 = new a.b.p.e
            r2.<init>(r8)
            r8.f175b = r2
            int r2 = a.b.j.Spinner_popupTheme
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L_0x0028
            a.b.o.c r3 = new a.b.o.c
            r3.<init>(r9, r2)
            r8.c = r3
            goto L_0x002a
        L_0x0028:
            r8.c = r9
        L_0x002a:
            r2 = 0
            r3 = -1
            int[] r4 = j     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
            android.content.res.TypedArray r4 = r9.obtainStyledAttributes(r10, r4, r11, r1)     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
            boolean r5 = r4.hasValue(r1)     // Catch:{ Exception -> 0x0041 }
            if (r5 == 0) goto L_0x0052
            int r3 = r4.getInt(r1, r1)     // Catch:{ Exception -> 0x0041 }
            goto L_0x0052
        L_0x003d:
            r9 = move-exception
            r2 = r4
            goto L_0x00d1
        L_0x0041:
            r5 = move-exception
            goto L_0x0049
        L_0x0043:
            r9 = move-exception
            goto L_0x00d1
        L_0x0046:
            r4 = move-exception
            r5 = r4
            r4 = r2
        L_0x0049:
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r5)     // Catch:{ all -> 0x003d }
            if (r4 == 0) goto L_0x0055
        L_0x0052:
            r4.recycle()
        L_0x0055:
            r4 = 1
            if (r3 == 0) goto L_0x0095
            if (r3 == r4) goto L_0x005b
            goto L_0x00a5
        L_0x005b:
            a.b.p.w$d r3 = new a.b.p.w$d
            android.content.Context r5 = r8.c
            r3.<init>(r5, r10, r11)
            android.content.Context r5 = r8.c
            int[] r6 = a.b.j.Spinner
            a.b.p.x0 r1 = a.b.p.x0.a(r5, r10, r6, r11, r1)
            int r5 = a.b.j.Spinner_android_dropDownWidth
            r6 = -2
            int r5 = r1.d(r5, r6)
            r8.h = r5
            int r5 = a.b.j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r5 = r1.b(r5)
            android.widget.PopupWindow r6 = r3.C
            r6.setBackgroundDrawable(r5)
            int r5 = a.b.j.Spinner_android_prompt
            java.lang.String r5 = r0.getString(r5)
            r3.G = r5
            android.content.res.TypedArray r1 = r1.f186b
            r1.recycle()
            r8.g = r3
            a.b.p.v r1 = new a.b.p.v
            r1.<init>(r8, r8, r3)
            r8.d = r1
            goto L_0x00a5
        L_0x0095:
            a.b.p.w$b r1 = new a.b.p.w$b
            r1.<init>()
            r8.g = r1
            int r3 = a.b.j.Spinner_android_prompt
            java.lang.String r3 = r0.getString(r3)
            r1.a((java.lang.CharSequence) r3)
        L_0x00a5:
            int r1 = a.b.j.Spinner_android_entries
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto L_0x00bd
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r5 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r9, r5, r1)
            int r9 = a.b.g.support_simple_spinner_dropdown_item
            r3.setDropDownViewResource(r9)
            r8.setAdapter((android.widget.SpinnerAdapter) r3)
        L_0x00bd:
            r0.recycle()
            r8.f = r4
            android.widget.SpinnerAdapter r9 = r8.e
            if (r9 == 0) goto L_0x00cb
            r8.setAdapter((android.widget.SpinnerAdapter) r9)
            r8.e = r2
        L_0x00cb:
            a.b.p.e r9 = r8.f175b
            r9.a(r10, r11)
            return
        L_0x00d1:
            if (r2 == 0) goto L_0x00d6
            r2.recycle()
        L_0x00d6:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.w.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        drawable.getPadding(this.i);
        Rect rect = this.i;
        return i3 + rect.left + rect.right;
    }

    public void a() {
        this.g.a(getTextDirection(), getTextAlignment());
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f175b;
        if (eVar != null) {
            eVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        f fVar = this.g;
        return fVar != null ? fVar.c() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        f fVar = this.g;
        return fVar != null ? fVar.f() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.g != null ? this.h : super.getDropDownWidth();
    }

    public final f getInternalPopup() {
        return this.g;
    }

    public Drawable getPopupBackground() {
        f fVar = this.g;
        return fVar != null ? fVar.g() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.c;
    }

    public CharSequence getPrompt() {
        f fVar = this.g;
        return fVar != null ? fVar.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f175b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f175b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.g;
        if (fVar != null && fVar.a()) {
            this.g.dismiss();
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.g != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        if (eVar.f182b && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a());
        }
    }

    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        f fVar = this.g;
        eVar.f182b = fVar != null && fVar.a();
        return eVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var = this.d;
        if (h0Var == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        f fVar = this.g;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.a()) {
            return true;
        }
        a();
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f) {
            this.e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.g != null) {
            Context context = this.c;
            if (context == null) {
                context = getContext();
            }
            this.g.a((ListAdapter) new c(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f175b;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f175b;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    public void setDropDownHorizontalOffset(int i2) {
        f fVar = this.g;
        if (fVar != null) {
            fVar.c(i2);
            this.g.a(i2);
            return;
        }
        super.setDropDownHorizontalOffset(i2);
    }

    public void setDropDownVerticalOffset(int i2) {
        f fVar = this.g;
        if (fVar != null) {
            fVar.b(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    public void setDropDownWidth(int i2) {
        if (this.g != null) {
            this.h = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.g;
        if (fVar != null) {
            fVar.a(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(a.b.l.a.a.b(getPopupContext(), i2));
    }

    public void setPrompt(CharSequence charSequence) {
        f fVar = this.g;
        if (fVar != null) {
            fVar.a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f175b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f175b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }
}
