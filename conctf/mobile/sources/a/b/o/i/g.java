package a.b.o.i;

import a.f.k.o;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class g implements a.f.g.a.a {
    public static final int[] z = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f88a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f89b;
    public boolean c;
    public boolean d;
    public a e;
    public ArrayList<i> f;
    public ArrayList<i> g;
    public boolean h;
    public ArrayList<i> i;
    public ArrayList<i> j;
    public boolean k;
    public int l = 0;
    public CharSequence m;
    public Drawable n;
    public View o;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public ArrayList<i> u = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<m>> v = new CopyOnWriteArrayList<>();
    public i w;
    public boolean x = false;
    public boolean y;

    public interface a {
        void a(g gVar);

        boolean a(g gVar, MenuItem menuItem);
    }

    public interface b {
        boolean a(i iVar);
    }

    public g(Context context) {
        boolean z2 = false;
        this.f88a = context;
        this.f89b = context.getResources();
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.h = true;
        this.i = new ArrayList<>();
        this.j = new ArrayList<>();
        this.k = true;
        if (this.f89b.getConfiguration().keyboard != 1 && o.a(ViewConfiguration.get(this.f88a), this.f88a)) {
            z2 = true;
        }
        this.d = z2;
    }

    public MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = (-65536 & i4) >> 16;
        if (i6 >= 0) {
            int[] iArr = z;
            if (i6 < iArr.length) {
                int i7 = (iArr[i6] << 16) | (65535 & i4);
                i iVar = new i(this, i2, i3, i4, i7, charSequence, this.l);
                ArrayList<i> arrayList = this.f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (arrayList.get(size).d <= i7) {
                            i5 = size + 1;
                            break;
                        }
                    } else {
                        i5 = 0;
                        break;
                    }
                }
                arrayList.add(i5, iVar);
                b(true);
                return iVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public void a() {
        ArrayList<i> d2 = d();
        if (this.k) {
            Iterator<WeakReference<m>> it = this.v.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                m mVar = (m) next.get();
                if (mVar == null) {
                    this.v.remove(next);
                } else {
                    z2 |= mVar.b();
                }
            }
            if (z2) {
                this.i.clear();
                this.j.clear();
                int size = d2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    i iVar = d2.get(i2);
                    (iVar.d() ? this.i : this.j).add(iVar);
                }
            } else {
                this.i.clear();
                this.j.clear();
                this.j.addAll(d());
            }
            this.k = false;
        }
    }

    public final void a(int i2, boolean z2) {
        if (i2 >= 0 && i2 < this.f.size()) {
            this.f.remove(i2);
            if (z2) {
                b(true);
            }
        }
    }

    public void a(m mVar) {
        Iterator<WeakReference<m>> it = this.v.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            m mVar2 = (m) next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.v.remove(next);
            }
        }
    }

    public void a(m mVar, Context context) {
        this.v.add(new WeakReference(mVar));
        mVar.a(context, this);
        this.k = true;
    }

    public void a(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(b());
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = getItem(i2);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((r) item.getSubMenu()).a(bundle);
                }
            }
            int i3 = bundle.getInt("android:menu:expandedactionview");
            if (i3 > 0 && (findItem = findItem(i3)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public final void a(boolean z2) {
        if (!this.t) {
            this.t = true;
            Iterator<WeakReference<m>> it = this.v.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                m mVar = (m) next.get();
                if (mVar == null) {
                    this.v.remove(next);
                } else {
                    mVar.a(this, z2);
                }
            }
            this.t = false;
        }
    }

    public boolean a(g gVar, MenuItem menuItem) {
        a aVar = this.e;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    public boolean a(i iVar) {
        boolean z2 = false;
        if (!this.v.isEmpty() && this.w == iVar) {
            j();
            Iterator<WeakReference<m>> it = this.v.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                m mVar = (m) next.get();
                if (mVar == null) {
                    this.v.remove(next);
                } else {
                    z2 = mVar.b(this, iVar);
                    if (z2) {
                        break;
                    }
                }
            }
            i();
            if (z2) {
                this.w = null;
            }
        }
        return z2;
    }

    public boolean a(MenuItem menuItem, int i2) {
        return a(menuItem, (m) null, i2);
    }

    public MenuItem add(int i2) {
        return a(0, 0, 0, this.f89b.getString(i2));
    }

    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f89b.getString(i5));
    }

    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f88a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = a(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f89b.getString(i2));
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, (CharSequence) this.f89b.getString(i5));
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        i iVar = (i) a(i2, i3, i4, charSequence);
        r rVar = new r(this.f88a, this, iVar);
        iVar.o = rVar;
        rVar.setHeaderTitle(iVar.e);
        return rVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public String b() {
        return "android:menu:actionviewstates";
    }

    public void b(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).b(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(b(), sparseArray);
        }
    }

    public void b(boolean z2) {
        if (!this.p) {
            if (z2) {
                this.h = true;
                this.k = true;
            }
            if (!this.v.isEmpty()) {
                j();
                Iterator<WeakReference<m>> it = this.v.iterator();
                while (it.hasNext()) {
                    WeakReference next = it.next();
                    m mVar = (m) next.get();
                    if (mVar == null) {
                        this.v.remove(next);
                    } else {
                        mVar.a(z2);
                    }
                }
                i();
                return;
            }
            return;
        }
        this.q = true;
        if (z2) {
            this.r = true;
        }
    }

    public boolean b(i iVar) {
        boolean z2 = false;
        if (this.v.isEmpty()) {
            return false;
        }
        j();
        Iterator<WeakReference<m>> it = this.v.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            m mVar = (m) next.get();
            if (mVar == null) {
                this.v.remove(next);
            } else {
                z2 = mVar.a(this, iVar);
                if (z2) {
                    break;
                }
            }
        }
        i();
        if (z2) {
            this.w = iVar;
        }
        return z2;
    }

    public g c() {
        return this;
    }

    public void clear() {
        i iVar = this.w;
        if (iVar != null) {
            a(iVar);
        }
        this.f.clear();
        b(true);
    }

    public void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        b(false);
    }

    public void close() {
        a(true);
    }

    public ArrayList<i> d() {
        if (!this.h) {
            return this.g;
        }
        this.g.clear();
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f.get(i2);
            if (iVar.isVisible()) {
                this.g.add(iVar);
            }
        }
        this.h = false;
        this.k = true;
        return this.g;
    }

    public boolean e() {
        return this.x;
    }

    public boolean f() {
        return this.c;
    }

    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f.get(i3);
            if (iVar.f91a == i2) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.o.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public boolean g() {
        return this.d;
    }

    public MenuItem getItem(int i2) {
        return this.f.get(i2);
    }

    public void h() {
        this.k = true;
        b(true);
    }

    public boolean hasVisibleItems() {
        if (this.y) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void i() {
        this.p = false;
        if (this.q) {
            this.q = false;
            b(this.r);
        }
    }

    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return a(i2, keyEvent) != null;
    }

    public void j() {
        if (!this.p) {
            this.p = true;
            this.q = false;
            this.r = false;
        }
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return a(findItem(i2), i3);
    }

    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        i a2 = a(i2, keyEvent);
        boolean a3 = a2 != null ? a((MenuItem) a2, (m) null, i3) : false;
        if ((i3 & 2) != 0) {
            a(true);
        }
        return a3;
    }

    public void removeGroup(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (this.f.get(i3).f92b == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = this.f.size() - i3;
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= size2 || this.f.get(i3).f92b != i2) {
                    b(true);
                } else {
                    a(i3, false);
                    i4 = i5;
                }
            }
            b(true);
        }
    }

    public void removeItem(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (this.f.get(i3).f91a == i2) {
                break;
            } else {
                i3++;
            }
        }
        a(i3, true);
    }

    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        int size = this.f.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f.get(i3);
            if (iVar.f92b == i2) {
                iVar.x = (iVar.x & -5) | (z3 ? 4 : 0);
                iVar.setCheckable(z2);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z2) {
        this.x = z2;
    }

    public void setGroupEnabled(int i2, boolean z2) {
        int size = this.f.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f.get(i3);
            if (iVar.f92b == i2) {
                iVar.setEnabled(z2);
            }
        }
    }

    public void setGroupVisible(int i2, boolean z2) {
        int size = this.f.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f.get(i3);
            if (iVar.f92b == i2 && iVar.c(z2)) {
                z3 = true;
            }
        }
        if (z3) {
            b(true);
        }
    }

    public void setQwertyMode(boolean z2) {
        this.c = z2;
        b(false);
    }

    public int size() {
        return this.f.size();
    }

    public i a(int i2, KeyEvent keyEvent) {
        char c2;
        ArrayList<i> arrayList = this.u;
        arrayList.clear();
        a((List<i>) arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean f2 = f();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = arrayList.get(i3);
            if (f2) {
                c2 = iVar.j;
            } else {
                c2 = iVar.h;
            }
            if ((c2 == keyData.meta[0] && (metaState & 2) == 0) || ((c2 == keyData.meta[2] && (metaState & 2) != 0) || (f2 && c2 == 8 && i2 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    public void a(List<i> list, int i2, KeyEvent keyEvent) {
        char c2;
        int i3;
        boolean f2 = f();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f.size();
            for (int i4 = 0; i4 < size; i4++) {
                i iVar = this.f.get(i4);
                if (iVar.hasSubMenu()) {
                    iVar.o.a(list, i2, keyEvent);
                }
                if (f2) {
                    c2 = iVar.j;
                } else {
                    c2 = iVar.h;
                }
                if (f2) {
                    i3 = iVar.k;
                } else {
                    i3 = iVar.i;
                }
                if (((modifiers & 69647) == (i3 & 69647)) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (f2 && c2 == 8 && i2 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        if (r1 != false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0073, code lost:
        if ((r9 & 1) == 0) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d9, code lost:
        if (r1 == false) goto L_0x00db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.MenuItem r7, a.b.o.i.m r8, int r9) {
        /*
            r6 = this;
            a.b.o.i.i r7 = (a.b.o.i.i) r7
            r0 = 0
            if (r7 == 0) goto L_0x00df
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00df
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.p
            r2 = 1
            if (r1 == 0) goto L_0x0019
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x0019
            goto L_0x0044
        L_0x0019:
            a.b.o.i.g r1 = r7.n
            boolean r1 = r1.a((a.b.o.i.g) r1, (android.view.MenuItem) r7)
            if (r1 == 0) goto L_0x0022
            goto L_0x0044
        L_0x0022:
            android.content.Intent r1 = r7.g
            if (r1 == 0) goto L_0x0036
            a.b.o.i.g r3 = r7.n     // Catch:{ ActivityNotFoundException -> 0x002e }
            android.content.Context r3 = r3.f88a     // Catch:{ ActivityNotFoundException -> 0x002e }
            r3.startActivity(r1)     // Catch:{ ActivityNotFoundException -> 0x002e }
            goto L_0x0044
        L_0x002e:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L_0x0036:
            a.f.k.b r1 = r7.A
            if (r1 == 0) goto L_0x0046
            a.b.o.i.j$a r1 = (a.b.o.i.j.a) r1
            android.view.ActionProvider r1 = r1.f94b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L_0x0046
        L_0x0044:
            r1 = r2
            goto L_0x0047
        L_0x0046:
            r1 = r0
        L_0x0047:
            a.f.k.b r3 = r7.A
            if (r3 == 0) goto L_0x0058
            r4 = r3
            a.b.o.i.j$a r4 = (a.b.o.i.j.a) r4
            android.view.ActionProvider r4 = r4.f94b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L_0x0058
            r4 = r2
            goto L_0x0059
        L_0x0058:
            r4 = r0
        L_0x0059:
            boolean r5 = r7.c()
            if (r5 == 0) goto L_0x0068
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00de
            goto L_0x00db
        L_0x0068:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x0076
            if (r4 == 0) goto L_0x0071
            goto L_0x0076
        L_0x0071:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00de
            goto L_0x00db
        L_0x0076:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x007d
            r6.a((boolean) r0)
        L_0x007d:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0091
            a.b.o.i.r r9 = new a.b.o.i.r
            android.content.Context r5 = r6.f88a
            r9.<init>(r5, r6, r7)
            r7.o = r9
            java.lang.CharSequence r5 = r7.e
            r9.setHeaderTitle((java.lang.CharSequence) r5)
        L_0x0091:
            a.b.o.i.r r7 = r7.o
            if (r4 == 0) goto L_0x00a2
            a.b.o.i.j$a r3 = (a.b.o.i.j.a) r3
            android.view.ActionProvider r9 = r3.f94b
            a.b.o.i.j r3 = a.b.o.i.j.this
            android.view.SubMenu r3 = r3.a((android.view.SubMenu) r7)
            r9.onPrepareSubMenu(r3)
        L_0x00a2:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<a.b.o.i.m>> r9 = r6.v
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x00ab
            goto L_0x00d8
        L_0x00ab:
            if (r8 == 0) goto L_0x00b1
            boolean r0 = r8.a((a.b.o.i.r) r7)
        L_0x00b1:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<a.b.o.i.m>> r8 = r6.v
            java.util.Iterator r8 = r8.iterator()
        L_0x00b7:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00d8
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            a.b.o.i.m r3 = (a.b.o.i.m) r3
            if (r3 != 0) goto L_0x00d1
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<a.b.o.i.m>> r3 = r6.v
            r3.remove(r9)
            goto L_0x00b7
        L_0x00d1:
            if (r0 != 0) goto L_0x00b7
            boolean r0 = r3.a((a.b.o.i.r) r7)
            goto L_0x00b7
        L_0x00d8:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00de
        L_0x00db:
            r6.a((boolean) r2)
        L_0x00de:
            return r1
        L_0x00df:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.o.i.g.a(android.view.MenuItem, a.b.o.i.m, int):boolean");
    }

    public final void a(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resources = this.f89b;
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i2 > 0) {
                this.m = resources.getText(i2);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i3 > 0) {
                this.n = a.f.e.a.a(this.f88a, i3);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        b(false);
    }
}
