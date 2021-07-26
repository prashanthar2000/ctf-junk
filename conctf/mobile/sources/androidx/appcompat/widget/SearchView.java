package androidx.appcompat.widget;

import a.b.p.d1;
import a.b.p.i0;
import a.b.p.r0;
import a.b.p.x0;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends i0 implements a.b.o.b {
    public static final k r0 = new k();
    public Rect A;
    public Rect B;
    public int[] C;
    public int[] D;
    public final ImageView E;
    public final Drawable F;
    public final int G;
    public final int H;
    public final Intent I;
    public final Intent J;
    public final CharSequence K;
    public m L;
    public l M;
    public View.OnFocusChangeListener N;
    public n O;
    public View.OnClickListener P;
    public boolean Q;
    public boolean R;
    public a.g.a.a S;
    public boolean T;
    public CharSequence U;
    public boolean V;
    public boolean W;
    public int a0;
    public boolean b0;
    public CharSequence c0;
    public CharSequence d0;
    public boolean e0;
    public int f0;
    public SearchableInfo g0;
    public Bundle h0;
    public final Runnable i0;
    public Runnable j0;
    public final WeakHashMap<String, Drawable.ConstantState> k0;
    public final View.OnClickListener l0;
    public View.OnKeyListener m0;
    public final TextView.OnEditorActionListener n0;
    public final AdapterView.OnItemClickListener o0;
    public final AdapterView.OnItemSelectedListener p0;
    public final SearchAutoComplete q;
    public TextWatcher q0;
    public final View r;
    public final View s;
    public final View t;
    public final ImageView u;
    public final ImageView v;
    public final ImageView w;
    public final ImageView x;
    public final View y;
    public p z;

    public static class SearchAutoComplete extends a.b.p.d {
        public int e;
        public SearchView f;
        public boolean g;
        public final Runnable h;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.g) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.g = false;
                }
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, a.b.a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.h = new a();
            this.e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        public boolean enoughToFilter() {
            return this.e <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.g) {
                removeCallbacks(this.h);
                post(this.h);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f;
            searchView.b(searchView.R);
            searchView.post(searchView.i0);
            if (searchView.q.hasFocus()) {
                searchView.c();
            }
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            Method method;
            super.onWindowFocusChanged(z);
            if (z && this.f.hasFocus() && getVisibility() == 0) {
                this.g = true;
                if (SearchView.a(getContext()) && (method = SearchView.r0.c) != null) {
                    try {
                        method.invoke(this, new Object[]{true});
                    } catch (Exception unused) {
                    }
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.g = false;
                removeCallbacks(this.h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.g = false;
                removeCallbacks(this.h);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.g = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.e = i;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.q.getText();
            searchView.d0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.a(z);
            searchView.c(!z);
            searchView.g();
            searchView.j();
            if (searchView.L != null && !TextUtils.equals(charSequence, searchView.c0)) {
                searchView.L.b(charSequence.toString());
            }
            searchView.c0 = charSequence.toString();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            SearchView.this.h();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            a.g.a.a aVar = SearchView.this.S;
            if (aVar instanceof r0) {
                aVar.a((Cursor) null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.N;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView searchView = SearchView.this;
            if (searchView.y.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.s.getPaddingLeft();
                Rect rect = new Rect();
                boolean a2 = d1.a(searchView);
                int dimensionPixelSize = searchView.Q ? resources.getDimensionPixelSize(a.b.d.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(a.b.d.abc_dropdownitem_icon_width) : 0;
                searchView.q.getDropDownBackground().getPadding(rect);
                searchView.q.setDropDownHorizontalOffset(a2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.q.setDropDownWidth((((searchView.y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.u) {
                searchView.e();
            } else if (view == searchView.w) {
                searchView.d();
            } else if (view == searchView.v) {
                searchView.f();
            } else if (view == searchView.x) {
                SearchableInfo searchableInfo = searchView.g0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.I);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.a(searchView.J, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchView.q) {
                searchView.c();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.g0 == null) {
                return false;
            }
            if (!searchView.q.isPopupShowing() || SearchView.this.q.getListSelection() == -1) {
                if ((TextUtils.getTrimmedLength(SearchView.this.q.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.a(0, (String) null, searchView2.q.getText().toString());
                return true;
            }
            SearchView searchView3 = SearchView.this;
            if (searchView3.g0 == null || searchView3.S == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i == 66 || i == 84 || i == 61) {
                return searchView3.b(searchView3.q.getListSelection());
            }
            if (i == 21 || i == 22) {
                searchView3.q.setSelection(i == 21 ? 0 : searchView3.q.length());
                searchView3.q.setListSelection(0);
                searchView3.q.clearListSelection();
                k kVar = SearchView.r0;
                SearchAutoComplete searchAutoComplete = searchView3.q;
                Method method = kVar.c;
                if (method != null) {
                    try {
                        method.invoke(searchAutoComplete, new Object[]{true});
                    } catch (Exception unused) {
                    }
                }
                return true;
            } else if (i != 19) {
                return false;
            } else {
                int listSelection = searchView3.q.getListSelection();
                return false;
            }
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.f();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.b(i);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.c(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public static class k {

        /* renamed from: a  reason: collision with root package name */
        public Method f492a;

        /* renamed from: b  reason: collision with root package name */
        public Method f493b;
        public Method c;

        public k() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f492a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f493b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public interface l {
        boolean a();
    }

    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    public interface n {
        boolean a(int i);

        boolean b(int i);
    }

    public static class o extends a.h.a.a {
        public static final Parcelable.Creator<o> CREATOR = new a();
        public boolean d;

        public static class a implements Parcelable.ClassLoaderCreator<o> {
            public Object createFromParcel(Parcel parcel) {
                return new o(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new o[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        public o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a2 = b.a.a.a.a.a("SearchView.SavedState{");
            a2.append(Integer.toHexString(System.identityHashCode(this)));
            a2.append(" isIconified=");
            a2.append(this.d);
            a2.append("}");
            return a2.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f354b, i);
            parcel.writeValue(Boolean.valueOf(this.d));
        }
    }

    public static class p extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final View f494a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f495b = new Rect();
        public final Rect c = new Rect();
        public final Rect d = new Rect();
        public final int e;
        public boolean f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.f494a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f495b.set(rect);
            this.d.set(rect);
            Rect rect3 = this.d;
            int i = this.e;
            rect3.inset(-i, -i);
            this.c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0033
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003f
            L_0x001b:
                boolean r2 = r8.f
                r8.f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r8.f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r8.d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = r5
                goto L_0x0041
            L_0x002f:
                r7 = r4
                r4 = r2
                r2 = r7
                goto L_0x0041
            L_0x0033:
                android.graphics.Rect r2 = r8.f495b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003f
                r8.f = r4
                r2 = r4
                goto L_0x0041
            L_0x003f:
                r2 = r4
                r4 = r5
            L_0x0041:
                if (r4 == 0) goto L_0x0070
                if (r2 == 0) goto L_0x005d
                android.graphics.Rect r2 = r8.c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005d
                android.view.View r0 = r8.f494a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r8.f494a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L_0x0066
            L_0x005d:
                android.graphics.Rect r2 = r8.c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x0066:
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                android.view.View r0 = r8.f494a
                boolean r5 = r0.dispatchTouchEvent(r9)
            L_0x0070:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b.a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A = new Rect();
        this.B = new Rect();
        this.C = new int[2];
        this.D = new int[2];
        this.i0 = new b();
        this.j0 = new c();
        this.k0 = new WeakHashMap<>();
        this.l0 = new f();
        this.m0 = new g();
        this.n0 = new h();
        this.o0 = new i();
        this.p0 = new j();
        this.q0 = new a();
        x0 x0Var = new x0(context, context.obtainStyledAttributes(attributeSet, a.b.j.SearchView, i2, 0));
        LayoutInflater.from(context).inflate(x0Var.e(a.b.j.SearchView_layout, a.b.g.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(a.b.f.search_src_text);
        this.q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.r = findViewById(a.b.f.search_edit_frame);
        this.s = findViewById(a.b.f.search_plate);
        this.t = findViewById(a.b.f.submit_area);
        this.u = (ImageView) findViewById(a.b.f.search_button);
        this.v = (ImageView) findViewById(a.b.f.search_go_btn);
        this.w = (ImageView) findViewById(a.b.f.search_close_btn);
        this.x = (ImageView) findViewById(a.b.f.search_voice_btn);
        this.E = (ImageView) findViewById(a.b.f.search_mag_icon);
        a.f.k.k.a(this.s, x0Var.b(a.b.j.SearchView_queryBackground));
        this.t.setBackground(x0Var.b(a.b.j.SearchView_submitBackground));
        this.u.setImageDrawable(x0Var.b(a.b.j.SearchView_searchIcon));
        this.v.setImageDrawable(x0Var.b(a.b.j.SearchView_goIcon));
        this.w.setImageDrawable(x0Var.b(a.b.j.SearchView_closeIcon));
        this.x.setImageDrawable(x0Var.b(a.b.j.SearchView_voiceIcon));
        this.E.setImageDrawable(x0Var.b(a.b.j.SearchView_searchIcon));
        this.F = x0Var.b(a.b.j.SearchView_searchHintIcon);
        a.b.k.o.a((View) this.u, (CharSequence) getResources().getString(a.b.h.abc_searchview_description_search));
        this.G = x0Var.e(a.b.j.SearchView_suggestionRowLayout, a.b.g.abc_search_dropdown_item_icons_2line);
        this.H = x0Var.e(a.b.j.SearchView_commitIcon, 0);
        this.u.setOnClickListener(this.l0);
        this.w.setOnClickListener(this.l0);
        this.v.setOnClickListener(this.l0);
        this.x.setOnClickListener(this.l0);
        this.q.setOnClickListener(this.l0);
        this.q.addTextChangedListener(this.q0);
        this.q.setOnEditorActionListener(this.n0);
        this.q.setOnItemClickListener(this.o0);
        this.q.setOnItemSelectedListener(this.p0);
        this.q.setOnKeyListener(this.m0);
        this.q.setOnFocusChangeListener(new d());
        setIconifiedByDefault(x0Var.a(a.b.j.SearchView_iconifiedByDefault, true));
        int b2 = x0Var.b(a.b.j.SearchView_android_maxWidth, -1);
        if (b2 != -1) {
            setMaxWidth(b2);
        }
        this.K = x0Var.e(a.b.j.SearchView_defaultQueryHint);
        this.U = x0Var.e(a.b.j.SearchView_queryHint);
        int c2 = x0Var.c(a.b.j.SearchView_android_imeOptions, -1);
        if (c2 != -1) {
            setImeOptions(c2);
        }
        int c3 = x0Var.c(a.b.j.SearchView_android_inputType, -1);
        if (c3 != -1) {
            setInputType(c3);
        }
        setFocusable(x0Var.a(a.b.j.SearchView_android_focusable, true));
        x0Var.f186b.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.I = intent;
        intent.addFlags(268435456);
        this.I.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.J = intent2;
        intent2.addFlags(268435456);
        View findViewById = findViewById(this.q.getDropDownAnchor());
        this.y = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new e());
        }
        b(this.Q);
        i();
    }

    public static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(a.b.d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(a.b.d.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.q.setText(charSequence);
        this.q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final Intent a(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.h0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i2 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i2 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i2);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final Intent a(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.d0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.g0.getSearchActivity());
        return intent;
    }

    public void a() {
        if (!this.e0) {
            this.e0 = true;
            int imeOptions = this.q.getImeOptions();
            this.f0 = imeOptions;
            this.q.setImeOptions(imeOptions | 33554432);
            this.q.setText("");
            setIconified(false);
        }
    }

    public void a(int i2, String str, String str2) {
        getContext().startActivity(a("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i2, str));
    }

    public void a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r2.b0 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.T
            r1 = 0
            if (r0 == 0) goto L_0x0021
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.b0
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.R
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.b0
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.v
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.a(boolean):void");
    }

    public void b() {
        this.q.setText("");
        SearchAutoComplete searchAutoComplete = this.q;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.d0 = "";
        clearFocus();
        b(true);
        this.q.setImeOptions(this.f0);
        this.e0 = false;
    }

    public final void b(boolean z2) {
        this.R = z2;
        int i2 = 0;
        int i3 = z2 ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.q.getText());
        this.u.setVisibility(i3);
        a(z3);
        this.r.setVisibility(z2 ? 8 : 0);
        if (this.E.getDrawable() == null || this.Q) {
            i2 = 8;
        }
        this.E.setVisibility(i2);
        g();
        c(!z3);
        j();
    }

    public void c() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.q.refreshAutoCompleteResults();
            return;
        }
        k kVar = r0;
        SearchAutoComplete searchAutoComplete = this.q;
        Method method = kVar.f492a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        k kVar2 = r0;
        SearchAutoComplete searchAutoComplete2 = this.q;
        Method method2 = kVar2.f493b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public void clearFocus() {
        this.W = true;
        super.clearFocus();
        this.q.clearFocus();
        this.q.setImeVisibility(false);
        this.W = false;
    }

    public void d() {
        if (!TextUtils.isEmpty(this.q.getText())) {
            this.q.setText("");
            this.q.requestFocus();
            this.q.setImeVisibility(true);
        } else if (this.Q) {
            l lVar = this.M;
            if (lVar == null || !lVar.a()) {
                clearFocus();
                b(true);
            }
        }
    }

    public void e() {
        b(false);
        this.q.requestFocus();
        this.q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void f() {
        Editable text = this.q.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            m mVar = this.L;
            if (mVar == null || !mVar.a(text.toString())) {
                if (this.g0 != null) {
                    a(0, (String) null, text.toString());
                }
                this.q.setImeVisibility(false);
                this.q.dismissDropDown();
            }
        }
    }

    public final void g() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.q.getText());
        int i2 = 0;
        if (!z3 && (!this.Q || this.e0)) {
            z2 = false;
        }
        ImageView imageView = this.w;
        if (!z2) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.w.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public int getImeOptions() {
        return this.q.getImeOptions();
    }

    public int getInputType() {
        return this.q.getInputType();
    }

    public int getMaxWidth() {
        return this.a0;
    }

    public CharSequence getQuery() {
        return this.q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.g0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.K : getContext().getText(this.g0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.H;
    }

    public int getSuggestionRowLayout() {
        return this.G;
    }

    public a.g.a.a getSuggestionsAdapter() {
        return this.S;
    }

    public void h() {
        int[] iArr = this.q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void i() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.q;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.Q && this.F != null) {
            int textSize = (int) (((double) this.q.getTextSize()) * 1.25d);
            this.F.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.F), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void j() {
        int i2 = 0;
        if (!((this.T || this.b0) && !this.R) || !(this.v.getVisibility() == 0 || this.x.getVisibility() == 0)) {
            i2 = 8;
        }
        this.t.setVisibility(i2);
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.i0);
        post(this.j0);
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            SearchAutoComplete searchAutoComplete = this.q;
            Rect rect = this.A;
            searchAutoComplete.getLocationInWindow(this.C);
            getLocationInWindow(this.D);
            int[] iArr = this.C;
            int i6 = iArr[1];
            int[] iArr2 = this.D;
            int i7 = i6 - iArr2[1];
            int i8 = iArr[0] - iArr2[0];
            rect.set(i8, i7, searchAutoComplete.getWidth() + i8, searchAutoComplete.getHeight() + i7);
            Rect rect2 = this.B;
            Rect rect3 = this.A;
            rect2.set(rect3.left, 0, rect3.right, i5 - i3);
            p pVar = this.z;
            if (pVar == null) {
                p pVar2 = new p(this.B, this.A, this.q);
                this.z = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.a(this.B, this.A);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 <= 0) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.R
            if (r0 == 0) goto L_0x0008
            super.onMeasure(r4, r5)
            return
        L_0x0008:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002a
            if (r0 == 0) goto L_0x0020
            if (r0 == r2) goto L_0x001b
            goto L_0x0037
        L_0x001b:
            int r0 = r3.a0
            if (r0 <= 0) goto L_0x0037
            goto L_0x002e
        L_0x0020:
            int r4 = r3.a0
            if (r4 <= 0) goto L_0x0025
            goto L_0x0037
        L_0x0025:
            int r4 = r3.getPreferredWidth()
            goto L_0x0037
        L_0x002a:
            int r0 = r3.a0
            if (r0 <= 0) goto L_0x002f
        L_0x002e:
            goto L_0x0033
        L_0x002f:
            int r0 = r3.getPreferredWidth()
        L_0x0033:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0037:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x0049
            if (r0 == 0) goto L_0x0044
            goto L_0x0051
        L_0x0044:
            int r5 = r3.getPreferredHeight()
            goto L_0x0051
        L_0x0049:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0051:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.f354b);
        b(oVar.d);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.d = this.R;
        return oVar;
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.i0);
    }

    public boolean requestFocus(int i2, Rect rect) {
        if (this.W || !isFocusable()) {
            return false;
        }
        if (this.R) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.q.requestFocus(i2, rect);
        if (requestFocus) {
            b(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.h0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            d();
        } else {
            e();
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.Q != z2) {
            this.Q = z2;
            b(z2);
            i();
        }
    }

    public void setImeOptions(int i2) {
        this.q.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.q.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.a0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.M = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.L = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.P = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
        this.O = nVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.U = charSequence;
        i();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.V = z2;
        a.g.a.a aVar = this.S;
        if (aVar instanceof r0) {
            ((r0) aVar).s = z2 ? 2 : 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.g0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L_0x006e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.q
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.q
            android.app.SearchableInfo r3 = r6.g0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.g0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L_0x0036
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.g0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L_0x0036
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L_0x0036:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.q
            r3.setInputType(r7)
            a.g.a.a r7 = r6.S
            if (r7 == 0) goto L_0x0042
            r7.a(r2)
        L_0x0042:
            android.app.SearchableInfo r7 = r6.g0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L_0x006b
            a.b.p.r0 r7 = new a.b.p.r0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.g0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.k0
            r7.<init>(r3, r6, r4, r5)
            r6.S = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.q
            r3.setAdapter(r7)
            a.g.a.a r7 = r6.S
            a.b.p.r0 r7 = (a.b.p.r0) r7
            boolean r3 = r6.V
            if (r3 == 0) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = r0
        L_0x0069:
            r7.s = r3
        L_0x006b:
            r6.i()
        L_0x006e:
            android.app.SearchableInfo r7 = r6.g0
            r3 = 0
            if (r7 == 0) goto L_0x009f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L_0x009f
            android.app.SearchableInfo r7 = r6.g0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L_0x0084
            android.content.Intent r2 = r6.I
            goto L_0x008e
        L_0x0084:
            android.app.SearchableInfo r7 = r6.g0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L_0x008e
            android.content.Intent r2 = r6.J
        L_0x008e:
            if (r2 == 0) goto L_0x009f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r0 = r3
        L_0x00a0:
            r6.b0 = r0
            if (r0 == 0) goto L_0x00ab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.q
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        L_0x00ab:
            boolean r7 = r6.R
            r6.b((boolean) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.T = z2;
        b(this.R);
    }

    public void setSuggestionsAdapter(a.g.a.a aVar) {
        this.S = aVar;
        this.q.setAdapter(aVar);
    }

    public boolean b(int i2) {
        int i3;
        String a2;
        n nVar = this.O;
        if (nVar != null && nVar.b(i2)) {
            return false;
        }
        Cursor cursor = this.S.d;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intent = null;
            try {
                String a3 = r0.a(cursor, "suggest_intent_action");
                if (a3 == null) {
                    a3 = this.g0.getSuggestIntentAction();
                }
                if (a3 == null) {
                    a3 = "android.intent.action.SEARCH";
                }
                String str = a3;
                String a4 = r0.a(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (a4 == null) {
                    a4 = this.g0.getSuggestIntentData();
                }
                if (!(a4 == null || (a2 = r0.a(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) == null)) {
                    a4 = a4 + "/" + Uri.encode(a2);
                }
                intent = a(str, a4 == null ? null : Uri.parse(a4), r0.a(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), r0.a(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, (String) null);
            } catch (RuntimeException e2) {
                try {
                    i3 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i3 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e3);
                }
            }
        }
        this.q.setImeVisibility(false);
        this.q.dismissDropDown();
        return true;
    }

    public boolean c(int i2) {
        CharSequence b2;
        n nVar = this.O;
        if (nVar != null && nVar.a(i2)) {
            return false;
        }
        Editable text = this.q.getText();
        Cursor cursor = this.S.d;
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i2) || (b2 = this.S.b(cursor)) == null) {
            setQuery(text);
            return true;
        }
        setQuery(b2);
        return true;
    }

    public final void c(boolean z2) {
        int i2 = 8;
        if (this.b0 && !this.R && z2) {
            this.v.setVisibility(8);
            i2 = 0;
        }
        this.x.setVisibility(i2);
    }
}
