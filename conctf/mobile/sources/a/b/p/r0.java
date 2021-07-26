package a.b.p;

import a.b.f;
import a.g.a.c;
import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
public class r0 extends c implements View.OnClickListener {
    public final SearchView m;
    public final SearchableInfo n;
    public final Context o;
    public final WeakHashMap<String, Drawable.ConstantState> p;
    public final int q;
    public boolean r = false;
    public int s = 1;
    public ColorStateList t;
    public int u = -1;
    public int v = -1;
    public int w = -1;
    public int x = -1;
    public int y = -1;
    public int z = -1;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f166a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f167b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;

        public a(View view) {
            this.f166a = (TextView) view.findViewById(16908308);
            this.f167b = (TextView) view.findViewById(16908309);
            this.c = (ImageView) view.findViewById(16908295);
            this.d = (ImageView) view.findViewById(16908296);
            this.e = (ImageView) view.findViewById(f.edit_query);
        }
    }

    public r0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        SearchManager searchManager = (SearchManager) this.e.getSystemService("search");
        this.m = searchView;
        this.n = searchableInfo;
        this.q = searchView.getSuggestionCommitIconResId();
        this.o = context;
        this.p = weakHashMap;
    }

    public static String a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    public static String a(Cursor cursor, String str) {
        return a(cursor, cursor.getColumnIndex(str));
    }

    public Cursor a(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.e.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    public Drawable a(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.e.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    public void a(Cursor cursor) {
        if (this.r) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.u = cursor.getColumnIndex("suggest_text_1");
                this.v = cursor.getColumnIndex("suggest_text_2");
                this.w = cursor.getColumnIndex("suggest_text_2_url");
                this.x = cursor.getColumnIndex("suggest_icon_1");
                this.y = cursor.getColumnIndex("suggest_icon_2");
                this.z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r19, android.content.Context r20, android.database.Cursor r21) {
        /*
            r18 = this;
            r1 = r18
            r2 = r21
            java.lang.Object r0 = r19.getTag()
            r3 = r0
            a.b.p.r0$a r3 = (a.b.p.r0.a) r3
            int r0 = r1.z
            r4 = -1
            r5 = 0
            if (r0 == r4) goto L_0x0017
            int r0 = r2.getInt(r0)
            r6 = r0
            goto L_0x0018
        L_0x0017:
            r6 = r5
        L_0x0018:
            android.widget.TextView r0 = r3.f166a
            if (r0 == 0) goto L_0x0034
            int r0 = r1.u
            java.lang.String r0 = a((android.database.Cursor) r2, (int) r0)
            android.widget.TextView r8 = r3.f166a
            r8.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 8
            goto L_0x0031
        L_0x0030:
            r0 = r5
        L_0x0031:
            r8.setVisibility(r0)
        L_0x0034:
            android.widget.TextView r0 = r3.f167b
            r8 = 2
            r9 = 1
            if (r0 == 0) goto L_0x00bc
            int r0 = r1.w
            java.lang.String r0 = a((android.database.Cursor) r2, (int) r0)
            if (r0 == 0) goto L_0x0085
            android.content.res.ColorStateList r10 = r1.t
            if (r10 != 0) goto L_0x0064
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            android.content.Context r11 = r1.e
            android.content.res.Resources$Theme r11 = r11.getTheme()
            int r12 = a.b.a.textColorSearchUrl
            r11.resolveAttribute(r12, r10, r9)
            android.content.Context r11 = r1.e
            android.content.res.Resources r11 = r11.getResources()
            int r10 = r10.resourceId
            android.content.res.ColorStateList r10 = r11.getColorStateList(r10)
            r1.t = r10
        L_0x0064:
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r0)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r12 = 0
            r13 = 0
            r14 = 0
            android.content.res.ColorStateList r11 = r1.t
            r16 = 0
            r17 = r11
            r11 = r15
            r7 = r15
            r15 = r17
            r11.<init>(r12, r13, r14, r15, r16)
            int r0 = r0.length()
            r11 = 33
            r10.setSpan(r7, r5, r0, r11)
            goto L_0x008b
        L_0x0085:
            int r0 = r1.v
            java.lang.String r10 = a((android.database.Cursor) r2, (int) r0)
        L_0x008b:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x009e
            android.widget.TextView r0 = r3.f166a
            if (r0 == 0) goto L_0x00aa
            r0.setSingleLine(r5)
            android.widget.TextView r0 = r3.f166a
            r0.setMaxLines(r8)
            goto L_0x00aa
        L_0x009e:
            android.widget.TextView r0 = r3.f166a
            if (r0 == 0) goto L_0x00aa
            r0.setSingleLine(r9)
            android.widget.TextView r0 = r3.f166a
            r0.setMaxLines(r9)
        L_0x00aa:
            android.widget.TextView r0 = r3.f167b
            r0.setText(r10)
            boolean r7 = android.text.TextUtils.isEmpty(r10)
            if (r7 == 0) goto L_0x00b8
            r7 = 8
            goto L_0x00b9
        L_0x00b8:
            r7 = r5
        L_0x00b9:
            r0.setVisibility(r7)
        L_0x00bc:
            android.widget.ImageView r7 = r3.c
            r10 = 0
            if (r7 == 0) goto L_0x0174
            int r0 = r1.x
            if (r0 != r4) goto L_0x00c8
            r0 = r10
            goto L_0x0161
        L_0x00c8:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x00d4
            goto L_0x0161
        L_0x00d4:
            android.app.SearchableInfo r0 = r1.n
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r11 = r0.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r12 = r1.p
            boolean r12 = r12.containsKey(r11)
            if (r12 == 0) goto L_0x00fd
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r1.p
            java.lang.Object r0 = r0.get(r11)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L_0x00f2
            r0 = r10
            goto L_0x0154
        L_0x00f2:
            android.content.Context r11 = r1.o
            android.content.res.Resources r11 = r11.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r11)
            goto L_0x0154
        L_0x00fd:
            android.content.Context r12 = r1.e
            android.content.pm.PackageManager r12 = r12.getPackageManager()
            r13 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r13 = r12.getActivityInfo(r0, r13)     // Catch:{ NameNotFoundException -> 0x013a }
            int r14 = r13.getIconResource()
            if (r14 != 0) goto L_0x0110
            goto L_0x0145
        L_0x0110:
            java.lang.String r15 = r0.getPackageName()
            android.content.pm.ApplicationInfo r13 = r13.applicationInfo
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r15, r14, r13)
            if (r12 != 0) goto L_0x0146
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Invalid icon resource "
            r12.append(r13)
            r12.append(r14)
            java.lang.String r13 = " for "
            r12.append(r13)
            java.lang.String r0 = r0.flattenToShortString()
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            goto L_0x0140
        L_0x013a:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = r12.toString()
        L_0x0140:
            java.lang.String r12 = "SuggestionsAdapter"
            android.util.Log.w(r12, r0)
        L_0x0145:
            r12 = r10
        L_0x0146:
            if (r12 != 0) goto L_0x014a
            r0 = r10
            goto L_0x014e
        L_0x014a:
            android.graphics.drawable.Drawable$ConstantState r0 = r12.getConstantState()
        L_0x014e:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r13 = r1.p
            r13.put(r11, r0)
            r0 = r12
        L_0x0154:
            if (r0 == 0) goto L_0x0157
            goto L_0x0161
        L_0x0157:
            android.content.Context r0 = r1.e
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L_0x0161:
            r11 = 4
            r7.setImageDrawable(r0)
            if (r0 != 0) goto L_0x016b
            r7.setVisibility(r11)
            goto L_0x0174
        L_0x016b:
            r7.setVisibility(r5)
            r0.setVisible(r5, r5)
            r0.setVisible(r9, r5)
        L_0x0174:
            android.widget.ImageView r0 = r3.d
            if (r0 == 0) goto L_0x0199
            int r7 = r1.y
            if (r7 != r4) goto L_0x017d
            goto L_0x0185
        L_0x017d:
            java.lang.String r2 = r2.getString(r7)
            android.graphics.drawable.Drawable r10 = r1.a((java.lang.String) r2)
        L_0x0185:
            r0.setImageDrawable(r10)
            if (r10 != 0) goto L_0x0190
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x0199
        L_0x0190:
            r0.setVisibility(r5)
            r10.setVisible(r5, r5)
            r10.setVisible(r9, r5)
        L_0x0199:
            int r0 = r1.s
            if (r0 == r8) goto L_0x01ac
            if (r0 != r9) goto L_0x01a4
            r0 = r6 & 1
            if (r0 == 0) goto L_0x01a4
            goto L_0x01ac
        L_0x01a4:
            android.widget.ImageView r0 = r3.e
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x01c1
        L_0x01ac:
            android.widget.ImageView r0 = r3.e
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r3.e
            android.widget.TextView r2 = r3.f166a
            java.lang.CharSequence r2 = r2.getText()
            r0.setTag(r2)
            android.widget.ImageView r0 = r3.e
            r0.setOnClickListener(r1)
        L_0x01c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.r0.a(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    public CharSequence b(Cursor cursor) {
        String a2;
        String a3;
        if (cursor == null) {
            return null;
        }
        String a4 = a(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (a4 != null) {
            return a4;
        }
        if (this.n.shouldRewriteQueryFromData() && (a3 = a(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return a3;
        }
        if (!this.n.shouldRewriteQueryFromText() || (a2 = a(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return a2;
    }

    public final void c(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            if (!this.f350b) {
                return null;
            }
            this.d.moveToPosition(i);
            if (view == null) {
                view = this.l.inflate(this.k, viewGroup, false);
            }
            a(view, this.e, this.d);
            return view;
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = this.l.inflate(this.k, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).f166a.setText(e.toString());
            }
            return inflate;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a2 = a(this.e, this.d, viewGroup);
            if (a2 != null) {
                ((a) a2.getTag()).f166a.setText(e.toString());
            }
            return a2;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        c(this.d);
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        c(this.d);
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.m.a((CharSequence) tag);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b4, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x009e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "SuggestionsAdapter"
            r1 = 0
            if (r8 == 0) goto L_0x013a
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x013a
            java.lang.String r2 = "0"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0015
            goto L_0x013a
        L_0x0015:
            int r2 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            r3.<init>()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.String r4 = "android.resource://"
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            android.content.Context r4 = r7.o     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.String r4 = "/"
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            r3.append(r2)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.String r3 = r3.toString()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r7.p     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            if (r4 != 0) goto L_0x0044
            r4 = r1
            goto L_0x0048
        L_0x0044:
            android.graphics.drawable.Drawable r4 = r4.newDrawable()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
        L_0x0048:
            if (r4 == 0) goto L_0x004b
            return r4
        L_0x004b:
            android.content.Context r4 = r7.o     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable r2 = a.f.e.a.a(r4, r2)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            if (r2 == 0) goto L_0x005c
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r7.p     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable$ConstantState r5 = r2.getConstantState()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            r4.put(r3, r5)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
        L_0x005c:
            return r2
        L_0x005d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Icon resource not found: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            android.util.Log.w(r0, r8)
            return r1
        L_0x0072:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r2 = r7.p
            java.lang.Object r2 = r2.get(r8)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 != 0) goto L_0x007e
            r2 = r1
            goto L_0x0082
        L_0x007e:
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
        L_0x0082:
            if (r2 == 0) goto L_0x0085
            return r2
        L_0x0085:
            android.net.Uri r2 = android.net.Uri.parse(r8)
            java.lang.String r3 = "Error closing icon stream for "
            java.lang.String r4 = r2.getScheme()     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.String r5 = "android.resource"
            boolean r4 = r5.equals(r4)     // Catch:{ FileNotFoundException -> 0x010e }
            if (r4 == 0) goto L_0x00b5
            android.graphics.drawable.Drawable r0 = r7.a((android.net.Uri) r2)     // Catch:{ NotFoundException -> 0x009e }
            r1 = r0
            goto L_0x012f
        L_0x009e:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010e }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.String r5 = "Resource does not exist: "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x010e }
            r4.append(r2)     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x010e }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x010e }
            throw r3     // Catch:{ FileNotFoundException -> 0x010e }
        L_0x00b5:
            android.content.Context r4 = r7.o     // Catch:{ FileNotFoundException -> 0x010e }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ FileNotFoundException -> 0x010e }
            java.io.InputStream r4 = r4.openInputStream(r2)     // Catch:{ FileNotFoundException -> 0x010e }
            if (r4 == 0) goto L_0x00f7
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromStream(r4, r1)     // Catch:{ all -> 0x00de }
            r4.close()     // Catch:{ IOException -> 0x00c9 }
            goto L_0x00dc
        L_0x00c9:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010e }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x010e }
            r6.append(r3)     // Catch:{ FileNotFoundException -> 0x010e }
            r6.append(r2)     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.String r3 = r6.toString()     // Catch:{ FileNotFoundException -> 0x010e }
            android.util.Log.e(r0, r3, r4)     // Catch:{ FileNotFoundException -> 0x010e }
        L_0x00dc:
            r1 = r5
            goto L_0x012f
        L_0x00de:
            r5 = move-exception
            r4.close()     // Catch:{ IOException -> 0x00e3 }
            goto L_0x00f6
        L_0x00e3:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010e }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x010e }
            r6.append(r3)     // Catch:{ FileNotFoundException -> 0x010e }
            r6.append(r2)     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.String r3 = r6.toString()     // Catch:{ FileNotFoundException -> 0x010e }
            android.util.Log.e(r0, r3, r4)     // Catch:{ FileNotFoundException -> 0x010e }
        L_0x00f6:
            throw r5     // Catch:{ FileNotFoundException -> 0x010e }
        L_0x00f7:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010e }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.String r5 = "Failed to open "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x010e }
            r4.append(r2)     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x010e }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x010e }
            throw r3     // Catch:{ FileNotFoundException -> 0x010e }
        L_0x010e:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Icon not found: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ", "
            r4.append(r2)
            java.lang.String r2 = r3.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.w(r0, r2)
        L_0x012f:
            if (r1 == 0) goto L_0x013a
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r7.p
            android.graphics.drawable.Drawable$ConstantState r2 = r1.getConstantState()
            r0.put(r8, r2)
        L_0x013a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.r0.a(java.lang.String):android.graphics.drawable.Drawable");
    }

    public View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.l.inflate(this.j, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(f.edit_query)).setImageResource(this.q);
        return inflate;
    }
}
