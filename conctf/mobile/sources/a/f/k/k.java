package a.f.k;

import a.b.k.i;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<View, p> f323a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Field f324b;
    public static boolean c = false;

    public static class a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f325a;

        public a(i iVar) {
            this.f325a = iVar;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            Object obj = null;
            t tVar = windowInsets == null ? null : new t(windowInsets);
            i iVar = (i) this.f325a;
            if (iVar != null) {
                int systemWindowInsetTop = ((WindowInsets) tVar.f336a).getSystemWindowInsetTop();
                int f = iVar.f21a.f(systemWindowInsetTop);
                if (systemWindowInsetTop != f) {
                    tVar = new t(((WindowInsets) tVar.f336a).replaceSystemWindowInsets(((WindowInsets) tVar.f336a).getSystemWindowInsetLeft(), f, ((WindowInsets) tVar.f336a).getSystemWindowInsetRight(), ((WindowInsets) tVar.f336a).getSystemWindowInsetBottom()));
                }
                t a2 = k.a(view, tVar);
                if (a2 != null) {
                    obj = a2.f336a;
                }
                return (WindowInsets) obj;
            }
            throw null;
        }
    }

    public static abstract class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f326a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f327b;
        public final int c;

        public b(int i, Class<T> cls, int i2) {
            this.f326a = i;
            this.f327b = cls;
            this.c = i2;
        }

        public b(int i, Class<T> cls, int i2, int i3) {
            this.f326a = i;
            this.f327b = cls;
            this.c = i3;
        }

        public abstract T a(View view);

        public T b(View view) {
            if (Build.VERSION.SDK_INT >= this.c) {
                return a(view);
            }
            T tag = view.getTag(this.f326a);
            if (this.f327b.isInstance(tag)) {
                return tag;
            }
            return null;
        }
    }

    public interface c {
        boolean a(View view, KeyEvent keyEvent);
    }

    public static class d {
        public static final ArrayList<WeakReference<View>> d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        public WeakHashMap<View, Boolean> f328a = null;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<WeakReference<View>> f329b = null;
        public WeakReference<KeyEvent> c = null;

        public static d a(View view) {
            d dVar = (d) view.getTag(a.f.b.tag_unhandled_key_event_manager);
            if (dVar != null) {
                return dVar;
            }
            d dVar2 = new d();
            view.setTag(a.f.b.tag_unhandled_key_event_manager, dVar2);
            return dVar2;
        }

        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f328a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View a2 = a(viewGroup.getChildAt(childCount), keyEvent);
                        if (a2 != null) {
                            return a2;
                        }
                    }
                }
                if (b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final void a() {
            WeakHashMap<View, Boolean> weakHashMap = this.f328a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!d.isEmpty()) {
                synchronized (d) {
                    if (this.f328a == null) {
                        this.f328a = new WeakHashMap<>();
                    }
                    for (int size = d.size() - 1; size >= 0; size--) {
                        View view = (View) d.get(size).get();
                        if (view == null) {
                            d.remove(size);
                        } else {
                            this.f328a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f328a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        public final boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(a.f.b.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((c) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        new AtomicInteger(1);
        new WeakHashMap();
    }

    public static p a(View view) {
        if (f323a == null) {
            f323a = new WeakHashMap<>();
        }
        p pVar = f323a.get(view);
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(view);
        f323a.put(view, pVar2);
        return pVar2;
    }

    public static void a(View view, float f) {
        view.setElevation(f);
    }

    public static void a(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }

    public static void a(View view, i iVar) {
        if (iVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
        } else {
            view.setOnApplyWindowInsetsListener(new a(iVar));
        }
    }

    public static void a(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void a(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void a(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public static void a(View view, String str) {
        view.setTransitionName(str);
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        d a2 = d.a(view);
        if (a2 != null) {
            if (keyEvent.getAction() == 0) {
                a2.a();
            }
            View a3 = a2.a(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a3 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (a2.f329b == null) {
                        a2.f329b = new SparseArray<>();
                    }
                    a2.f329b.put(keyCode, new WeakReference(a3));
                }
            }
            if (a3 != null) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public static ColorStateList b(View view) {
        return view.getBackgroundTintList();
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        int indexOfKey;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        d a2 = d.a(view);
        WeakReference<KeyEvent> weakReference = a2.c;
        if (weakReference != null && weakReference.get() == keyEvent) {
            return false;
        }
        a2.c = new WeakReference<>(keyEvent);
        WeakReference weakReference2 = null;
        if (a2.f329b == null) {
            a2.f329b = new SparseArray<>();
        }
        SparseArray<WeakReference<View>> sparseArray = a2.f329b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference2 = sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference2 == null) {
            weakReference2 = sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference2 == null) {
            return false;
        }
        View view2 = (View) weakReference2.get();
        if (view2 != null && h(view2)) {
            a2.b(view2, keyEvent);
        }
        return true;
    }

    public static int c(View view) {
        return view.getLayoutDirection();
    }

    public static int d(View view) {
        return view.getMinimumHeight();
    }

    public static String e(View view) {
        return view.getTransitionName();
    }

    public static int f(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static boolean g(View view) {
        return view.hasOnClickListeners();
    }

    public static boolean h(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean i(View view) {
        return view.isLaidOut();
    }

    public static boolean j(View view) {
        Boolean bool = (Boolean) new l(a.f.b.tag_screen_reader_focusable, Boolean.class, 28).b(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static void k(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void l(View view) {
        view.requestApplyInsets();
    }

    public static void m(View view) {
        view.stopNestedScroll();
    }

    public static t a(View view, t tVar) {
        WindowInsets windowInsets = (WindowInsets) (tVar == null ? null : tVar.f336a);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (!onApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        if (windowInsets == null) {
            return null;
        }
        return new t(windowInsets);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.view.View r4, a.f.k.a r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0033
            boolean r1 = c
            if (r1 == 0) goto L_0x0008
            goto L_0x0029
        L_0x0008:
            java.lang.reflect.Field r1 = f324b
            r2 = 1
            if (r1 != 0) goto L_0x001a
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r3 = "mAccessibilityDelegate"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch:{ all -> 0x0027 }
            f324b = r1     // Catch:{ all -> 0x0027 }
            r1.setAccessible(r2)     // Catch:{ all -> 0x0027 }
        L_0x001a:
            java.lang.reflect.Field r1 = f324b     // Catch:{ all -> 0x0027 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0027 }
            boolean r3 = r1 instanceof android.view.View.AccessibilityDelegate     // Catch:{ all -> 0x0027 }
            if (r3 == 0) goto L_0x0029
            android.view.View$AccessibilityDelegate r1 = (android.view.View.AccessibilityDelegate) r1     // Catch:{ all -> 0x0027 }
            goto L_0x002a
        L_0x0027:
            c = r2
        L_0x0029:
            r1 = r0
        L_0x002a:
            boolean r1 = r1 instanceof a.f.k.a.C0017a
            if (r1 == 0) goto L_0x0033
            a.f.k.a r5 = new a.f.k.a
            r5.<init>()
        L_0x0033:
            if (r5 != 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            android.view.View$AccessibilityDelegate r0 = r5.f313b
        L_0x0038:
            r4.setAccessibilityDelegate(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.k.k.a(android.view.View, a.f.k.a):void");
    }
}
