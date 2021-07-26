package a.b.o;

import a.b.o.i.i;
import a.b.o.i.j;
import a.b.p.e0;
import a.b.p.x0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class f extends MenuInflater {
    public static final Class<?>[] e;
    public static final Class<?>[] f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f63a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f64b;
    public Context c;
    public Object d;

    public static class a implements MenuItem.OnMenuItemClickListener {
        public static final Class<?>[] c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public Object f65a;

        /* renamed from: b  reason: collision with root package name */
        public Method f66b;

        public a(Object obj, String str) {
            this.f65a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f66b = cls.getMethod(str, c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f66b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f66b.invoke(this.f65a, new Object[]{menuItem})).booleanValue();
                }
                this.f66b.invoke(this.f65a, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public class b {
        public a.f.k.b A;
        public CharSequence B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;

        /* renamed from: a  reason: collision with root package name */
        public Menu f67a;

        /* renamed from: b  reason: collision with root package name */
        public int f68b;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public String z;

        public b(Menu menu) {
            this.f67a = menu;
            this.f68b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }

        public SubMenu a() {
            this.h = true;
            SubMenu addSubMenu = this.f67a.addSubMenu(this.f68b, this.i, this.j, this.k);
            a(addSubMenu.getItem());
            return addSubMenu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        public final void a(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i2 = this.v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (!f.this.c.isRestricted()) {
                    f fVar = f.this;
                    if (fVar.d == null) {
                        fVar.d = fVar.a(fVar.c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(fVar.d, this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z3 = menuItem instanceof i;
            if (z3) {
                i iVar = (i) menuItem;
            }
            if (this.r >= 2) {
                if (z3) {
                    i iVar2 = (i) menuItem;
                    iVar2.x = (iVar2.x & -5) | 4;
                } else if (menuItem instanceof j) {
                    j jVar = (j) menuItem;
                    try {
                        if (jVar.e == null) {
                            jVar.e = jVar.d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        jVar.e.invoke(jVar.d, new Object[]{true});
                    } catch (Exception e2) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                    }
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) a(str, f.e, f.this.f63a));
                z2 = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (!z2) {
                    menuItem.setActionView(i3);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            a.f.k.b bVar = this.A;
            if (bVar != null) {
                if (menuItem instanceof a.f.g.a.b) {
                    ((a.f.g.a.b) menuItem).a(bVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.B;
            boolean z4 = menuItem instanceof a.f.g.a.b;
            if (z4) {
                ((a.f.g.a.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.C;
            if (z4) {
                ((a.f.g.a.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c2 = this.n;
            int i4 = this.o;
            if (z4) {
                ((a.f.g.a.b) menuItem).setAlphabeticShortcut(c2, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c2, i4);
            }
            char c3 = this.p;
            int i5 = this.q;
            if (z4) {
                ((a.f.g.a.b) menuItem).setNumericShortcut(c3, i5);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c3, i5);
            }
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                if (z4) {
                    ((a.f.g.a.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList == null) {
                return;
            }
            if (z4) {
                ((a.f.g.a.b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            e = r0
            f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.o.f.<clinit>():void");
    }

    public f(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.f63a = objArr;
        this.f64b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        char c2;
        char c3;
        AttributeSet attributeSet2 = attributeSet;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException(b.a.a.a.a.a("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlPullParser xmlPullParser2 = xmlPullParser;
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            XmlPullParser xmlPullParser3 = xmlPullParser;
                            str = null;
                            z2 = false;
                            eventType = xmlPullParser.next();
                        } else if (name2.equals("group")) {
                            bVar.f68b = 0;
                            bVar.c = 0;
                            bVar.d = 0;
                            bVar.e = 0;
                            bVar.f = true;
                            bVar.g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar.h) {
                                a.f.k.b bVar2 = bVar.A;
                                if (bVar2 == null || !((j.a) bVar2).f94b.hasSubMenu()) {
                                    bVar.h = true;
                                    bVar.a(bVar.f67a.add(bVar.f68b, bVar.i, bVar.j, bVar.k));
                                } else {
                                    bVar.a();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            XmlPullParser xmlPullParser4 = xmlPullParser;
                            z = true;
                            eventType = xmlPullParser.next();
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = f.this.c.obtainStyledAttributes(attributeSet2, a.b.j.MenuGroup);
                        bVar.f68b = obtainStyledAttributes.getResourceId(a.b.j.MenuGroup_android_id, 0);
                        bVar.c = obtainStyledAttributes.getInt(a.b.j.MenuGroup_android_menuCategory, 0);
                        bVar.d = obtainStyledAttributes.getInt(a.b.j.MenuGroup_android_orderInCategory, 0);
                        bVar.e = obtainStyledAttributes.getInt(a.b.j.MenuGroup_android_checkableBehavior, 0);
                        bVar.f = obtainStyledAttributes.getBoolean(a.b.j.MenuGroup_android_visible, true);
                        bVar.g = obtainStyledAttributes.getBoolean(a.b.j.MenuGroup_android_enabled, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        x0 a2 = x0.a(f.this.c, attributeSet2, a.b.j.MenuItem);
                        bVar.i = a2.e(a.b.j.MenuItem_android_id, 0);
                        bVar.j = (a2.c(a.b.j.MenuItem_android_menuCategory, bVar.c) & -65536) | (a2.c(a.b.j.MenuItem_android_orderInCategory, bVar.d) & 65535);
                        bVar.k = a2.e(a.b.j.MenuItem_android_title);
                        bVar.l = a2.e(a.b.j.MenuItem_android_titleCondensed);
                        bVar.m = a2.e(a.b.j.MenuItem_android_icon, 0);
                        String d2 = a2.d(a.b.j.MenuItem_android_alphabeticShortcut);
                        if (d2 == null) {
                            c2 = 0;
                        } else {
                            c2 = d2.charAt(0);
                        }
                        bVar.n = c2;
                        bVar.o = a2.c(a.b.j.MenuItem_alphabeticModifiers, 4096);
                        String d3 = a2.d(a.b.j.MenuItem_android_numericShortcut);
                        if (d3 == null) {
                            c3 = 0;
                        } else {
                            c3 = d3.charAt(0);
                        }
                        bVar.p = c3;
                        bVar.q = a2.c(a.b.j.MenuItem_numericModifiers, 4096);
                        bVar.r = a2.f(a.b.j.MenuItem_android_checkable) ? a2.a(a.b.j.MenuItem_android_checkable, false) : bVar.e;
                        bVar.s = a2.a(a.b.j.MenuItem_android_checked, false);
                        bVar.t = a2.a(a.b.j.MenuItem_android_visible, bVar.f);
                        bVar.u = a2.a(a.b.j.MenuItem_android_enabled, bVar.g);
                        bVar.v = a2.c(a.b.j.MenuItem_showAsAction, -1);
                        bVar.z = a2.d(a.b.j.MenuItem_android_onClick);
                        bVar.w = a2.e(a.b.j.MenuItem_actionLayout, 0);
                        bVar.x = a2.d(a.b.j.MenuItem_actionViewClass);
                        String d4 = a2.d(a.b.j.MenuItem_actionProviderClass);
                        bVar.y = d4;
                        boolean z3 = d4 != null;
                        if (z3 && bVar.w == 0 && bVar.x == null) {
                            bVar.A = (a.f.k.b) bVar.a(bVar.y, f, f.this.f64b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar.A = null;
                        }
                        bVar.B = a2.e(a.b.j.MenuItem_contentDescription);
                        bVar.C = a2.e(a.b.j.MenuItem_tooltipText);
                        if (a2.f(a.b.j.MenuItem_iconTintMode)) {
                            bVar.E = e0.a(a2.c(a.b.j.MenuItem_iconTintMode, -1), bVar.E);
                        } else {
                            bVar.E = null;
                        }
                        if (a2.f(a.b.j.MenuItem_iconTint)) {
                            bVar.D = a2.a(a.b.j.MenuItem_iconTint);
                        } else {
                            bVar.D = null;
                        }
                        a2.f186b.recycle();
                        bVar.h = false;
                    } else {
                        if (name3.equals("menu")) {
                            a(xmlPullParser, attributeSet2, bVar.a());
                        } else {
                            XmlPullParser xmlPullParser5 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser.next();
                    }
                }
                XmlPullParser xmlPullParser6 = xmlPullParser;
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof a.f.g.a.a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.c.getResources().getLayout(i);
            a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
