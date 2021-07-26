package a.i.a;

import a.d.g;
import a.f.k.k;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class v {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f392a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b  reason: collision with root package name */
    public static final d0 f393b = new y();
    public static final d0 c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Fragment f394a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f395b;
        public a c;
        public Fragment d;
        public boolean e;
        public a f;
    }

    static {
        d0 d0Var;
        try {
            d0Var = (d0) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            d0Var = null;
        }
        c = d0Var;
    }

    public static View a(a.d.a<String, View> aVar, a aVar2, Object obj, boolean z) {
        ArrayList<String> arrayList;
        a aVar3 = aVar2.c;
        if (obj == null || aVar == null || (arrayList = aVar3.n) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar3.n : aVar3.o).get(0));
    }

    public static void a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    public static void a(ArrayList<View> arrayList, a.d.a<String, View> aVar, Collection<String> collection) {
        for (int i = aVar.d - 1; i >= 0; i--) {
            View d = aVar.d(i);
            if (collection.contains(k.e(d))) {
                arrayList.add(d);
            }
        }
    }

    public static a.d.a<String, View> b(d0 d0Var, a.d.a<String, String> aVar, Object obj, a aVar2) {
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = aVar2.d;
        a.d.a<String, View> aVar3 = new a.d.a<>();
        d0Var.a((Map<String, View>) aVar3, fragment.t());
        a aVar4 = aVar2.f;
        g.a(aVar3, (Collection<?>) aVar2.e ? aVar4.o : aVar4.n);
        g.a(aVar, (Collection<?>) aVar3.keySet());
        return aVar3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0041, code lost:
        if (r10.l != false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x007d, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x008f, code lost:
        if (r10.z == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0091, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x00f3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(a.i.a.a r16, a.i.a.q.a r17, android.util.SparseArray<a.i.a.v.a> r18, boolean r19, boolean r20) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            androidx.fragment.app.Fragment r10 = r1.f387b
            if (r10 != 0) goto L_0x000d
            return
        L_0x000d:
            int r11 = r10.x
            if (r11 != 0) goto L_0x0012
            return
        L_0x0012:
            if (r3 == 0) goto L_0x001b
            int[] r4 = f392a
            int r1 = r1.f386a
            r1 = r4[r1]
            goto L_0x001d
        L_0x001b:
            int r1 = r1.f386a
        L_0x001d:
            r4 = 0
            r5 = 1
            if (r1 == r5) goto L_0x0084
            r6 = 3
            if (r1 == r6) goto L_0x005f
            r6 = 4
            if (r1 == r6) goto L_0x0047
            r6 = 5
            if (r1 == r6) goto L_0x0035
            r6 = 6
            if (r1 == r6) goto L_0x005f
            r6 = 7
            if (r1 == r6) goto L_0x0084
            r1 = r4
            r12 = r1
            r13 = r12
            goto L_0x0098
        L_0x0035:
            if (r20 == 0) goto L_0x0044
            boolean r1 = r10.N
            if (r1 == 0) goto L_0x0093
            boolean r1 = r10.z
            if (r1 != 0) goto L_0x0093
            boolean r1 = r10.l
            if (r1 == 0) goto L_0x0093
            goto L_0x0091
        L_0x0044:
            boolean r1 = r10.z
            goto L_0x0094
        L_0x0047:
            if (r20 == 0) goto L_0x0056
            boolean r1 = r10.N
            if (r1 == 0) goto L_0x007f
            boolean r1 = r10.l
            if (r1 == 0) goto L_0x007f
            boolean r1 = r10.z
            if (r1 == 0) goto L_0x007f
            goto L_0x007d
        L_0x0056:
            boolean r1 = r10.l
            if (r1 == 0) goto L_0x007f
            boolean r1 = r10.z
            if (r1 != 0) goto L_0x007f
            goto L_0x007d
        L_0x005f:
            boolean r1 = r10.l
            if (r20 == 0) goto L_0x0077
            if (r1 != 0) goto L_0x007f
            android.view.View r1 = r10.H
            if (r1 == 0) goto L_0x007f
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x007f
            float r1 = r10.O
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x007f
            goto L_0x007d
        L_0x0077:
            if (r1 == 0) goto L_0x007f
            boolean r1 = r10.z
            if (r1 != 0) goto L_0x007f
        L_0x007d:
            r1 = r5
            goto L_0x0080
        L_0x007f:
            r1 = r4
        L_0x0080:
            r13 = r1
            r1 = r4
            r12 = r5
            goto L_0x0098
        L_0x0084:
            if (r20 == 0) goto L_0x0089
            boolean r1 = r10.M
            goto L_0x0094
        L_0x0089:
            boolean r1 = r10.l
            if (r1 != 0) goto L_0x0093
            boolean r1 = r10.z
            if (r1 != 0) goto L_0x0093
        L_0x0091:
            r1 = r5
            goto L_0x0094
        L_0x0093:
            r1 = r4
        L_0x0094:
            r12 = r4
            r13 = r12
            r4 = r1
            r1 = r5
        L_0x0098:
            java.lang.Object r6 = r2.get(r11)
            a.i.a.v$a r6 = (a.i.a.v.a) r6
            if (r4 == 0) goto L_0x00b1
            if (r6 != 0) goto L_0x00ab
            a.i.a.v$a r4 = new a.i.a.v$a
            r4.<init>()
            r2.put(r11, r4)
            r6 = r4
        L_0x00ab:
            r6.f394a = r10
            r6.f395b = r3
            r6.c = r0
        L_0x00b1:
            r14 = r6
            r15 = 0
            if (r20 != 0) goto L_0x00d8
            if (r1 == 0) goto L_0x00d8
            if (r14 == 0) goto L_0x00bf
            androidx.fragment.app.Fragment r1 = r14.d
            if (r1 != r10) goto L_0x00bf
            r14.d = r15
        L_0x00bf:
            a.i.a.j r4 = r0.r
            int r1 = r10.f513b
            if (r1 >= r5) goto L_0x00d8
            int r1 = r4.o
            if (r1 < r5) goto L_0x00d8
            boolean r1 = r0.p
            if (r1 != 0) goto L_0x00d8
            r4.f(r10)
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r10
            r4.a(r5, r6, r7, r8, r9)
        L_0x00d8:
            if (r13 == 0) goto L_0x00f1
            if (r14 == 0) goto L_0x00e0
            androidx.fragment.app.Fragment r1 = r14.d
            if (r1 != 0) goto L_0x00f1
        L_0x00e0:
            if (r14 != 0) goto L_0x00eb
            a.i.a.v$a r1 = new a.i.a.v$a
            r1.<init>()
            r2.put(r11, r1)
            r14 = r1
        L_0x00eb:
            r14.d = r10
            r14.e = r3
            r14.f = r0
        L_0x00f1:
            if (r20 != 0) goto L_0x00fd
            if (r12 == 0) goto L_0x00fd
            if (r14 == 0) goto L_0x00fd
            androidx.fragment.app.Fragment r0 = r14.f394a
            if (r0 != r10) goto L_0x00fd
            r14.f394a = r15
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.v.a(a.i.a.a, a.i.a.q$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static Object b(d0 d0Var, Fragment fragment, boolean z) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            Fragment.b bVar = fragment.L;
            if (bVar != null && (obj = bVar.h) == Fragment.W) {
                obj = fragment.j();
            }
        } else {
            obj = fragment.k();
        }
        return d0Var.a(obj);
    }

    public static void a(Fragment fragment, Fragment fragment2, boolean z, a.d.a<String, View> aVar, boolean z2) {
        if (z) {
            Fragment.b bVar = fragment2.L;
        } else {
            Fragment.b bVar2 = fragment.L;
        }
    }

    public static boolean a(d0 d0Var, List<Object> list) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            Object obj = list.get(i);
            if (((y) d0Var) == null) {
                throw null;
            } else if (!(obj instanceof Transition)) {
                return false;
            } else {
                i++;
            }
        }
        return true;
    }

    public static a.d.a<String, View> a(d0 d0Var, a.d.a<String, String> aVar, Object obj, a aVar2) {
        View view = aVar2.f394a.H;
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        a.d.a<String, View> aVar3 = new a.d.a<>();
        d0Var.a((Map<String, View>) aVar3, view);
        a aVar4 = aVar2.c;
        ArrayList<String> arrayList = aVar2.f395b ? aVar4.n : aVar4.o;
        if (arrayList != null) {
            g.a(aVar3, (Collection<?>) arrayList);
            g.a(aVar3, (Collection<?>) aVar.values());
        }
        int i = aVar.d;
        while (true) {
            i--;
            if (i < 0) {
                return aVar3;
            }
            if (!aVar3.containsKey(aVar.d(i))) {
                aVar.c(i);
            }
        }
    }

    public static d0 a(Fragment fragment, Fragment fragment2) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object k = fragment.k();
            if (k != null) {
                arrayList.add(k);
            }
            Fragment.b bVar = fragment.L;
            if (bVar == null) {
                obj2 = null;
            } else {
                obj2 = bVar.h;
                if (obj2 == Fragment.W) {
                    obj2 = fragment.j();
                }
            }
            if (obj2 != null) {
                arrayList.add(obj2);
            }
            Fragment.b bVar2 = fragment.L;
            if (bVar2 == null) {
                obj3 = null;
            } else {
                obj3 = bVar2.l;
                if (obj3 == Fragment.W) {
                    obj3 = fragment.o();
                }
            }
            if (obj3 != null) {
                arrayList.add(obj3);
            }
        }
        if (fragment2 != null) {
            Object j = fragment2.j();
            if (j != null) {
                arrayList.add(j);
            }
            Fragment.b bVar3 = fragment2.L;
            if (bVar3 == null) {
                obj = null;
            } else {
                obj = bVar3.j;
                if (obj == Fragment.W) {
                    obj = fragment2.k();
                }
            }
            if (obj != null) {
                arrayList.add(obj);
            }
            Object o = fragment2.o();
            if (o != null) {
                arrayList.add(o);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        d0 d0Var = f393b;
        if (d0Var != null && a(d0Var, (List<Object>) arrayList)) {
            return f393b;
        }
        d0 d0Var2 = c;
        if (d0Var2 != null && a(d0Var2, (List<Object>) arrayList)) {
            return c;
        }
        if (f393b == null && c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static ArrayList<View> a(d0 d0Var, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.H;
        if (view2 != null) {
            d0Var.a(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        d0Var.a(obj, arrayList2);
        return arrayList2;
    }

    public static Object a(d0 d0Var, Fragment fragment, boolean z) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            Fragment.b bVar = fragment.L;
            if (bVar != null && (obj = bVar.j) == Fragment.W) {
                obj = fragment.k();
            }
        } else {
            obj = fragment.j();
        }
        return d0Var.a(obj);
    }

    public static Object a(d0 d0Var, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            Fragment.b bVar = fragment2.L;
            if (bVar == null) {
                obj = null;
            } else {
                obj = bVar.l;
                if (obj == Fragment.W) {
                    obj = fragment2.o();
                }
            }
        } else {
            obj = fragment.o();
        }
        Object a2 = d0Var.a(obj);
        if (a2 == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) a2);
        return transitionSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object a(a.i.a.d0 r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, androidx.fragment.app.Fragment r5, boolean r6) {
        /*
            r0 = 1
            if (r2 == 0) goto L_0x0025
            if (r3 == 0) goto L_0x0025
            if (r5 == 0) goto L_0x0025
            if (r6 == 0) goto L_0x0017
            androidx.fragment.app.Fragment$b r5 = r5.L
            if (r5 == 0) goto L_0x0025
            java.lang.Boolean r5 = r5.m
            if (r5 != 0) goto L_0x0012
            goto L_0x0025
        L_0x0012:
            boolean r5 = r5.booleanValue()
            goto L_0x0026
        L_0x0017:
            androidx.fragment.app.Fragment$b r5 = r5.L
            if (r5 == 0) goto L_0x0025
            java.lang.Boolean r5 = r5.n
            if (r5 != 0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            boolean r5 = r5.booleanValue()
            goto L_0x0026
        L_0x0025:
            r5 = r0
        L_0x0026:
            r6 = 0
            a.i.a.y r1 = (a.i.a.y) r1
            if (r5 == 0) goto L_0x0049
            if (r1 == 0) goto L_0x0048
            android.transition.TransitionSet r1 = new android.transition.TransitionSet
            r1.<init>()
            if (r3 == 0) goto L_0x0039
            android.transition.Transition r3 = (android.transition.Transition) r3
            r1.addTransition(r3)
        L_0x0039:
            if (r2 == 0) goto L_0x0040
            android.transition.Transition r2 = (android.transition.Transition) r2
            r1.addTransition(r2)
        L_0x0040:
            if (r4 == 0) goto L_0x007f
            android.transition.Transition r4 = (android.transition.Transition) r4
            r1.addTransition(r4)
            goto L_0x007f
        L_0x0048:
            throw r6
        L_0x0049:
            if (r1 == 0) goto L_0x0080
            android.transition.Transition r3 = (android.transition.Transition) r3
            android.transition.Transition r2 = (android.transition.Transition) r2
            android.transition.Transition r4 = (android.transition.Transition) r4
            if (r3 == 0) goto L_0x0067
            if (r2 == 0) goto L_0x0067
            android.transition.TransitionSet r1 = new android.transition.TransitionSet
            r1.<init>()
            android.transition.TransitionSet r1 = r1.addTransition(r3)
            android.transition.TransitionSet r1 = r1.addTransition(r2)
            android.transition.TransitionSet r6 = r1.setOrdering(r0)
            goto L_0x006e
        L_0x0067:
            if (r3 == 0) goto L_0x006b
            r6 = r3
            goto L_0x006e
        L_0x006b:
            if (r2 == 0) goto L_0x006e
            r6 = r2
        L_0x006e:
            if (r4 == 0) goto L_0x007e
            android.transition.TransitionSet r1 = new android.transition.TransitionSet
            r1.<init>()
            if (r6 == 0) goto L_0x007a
            r1.addTransition(r6)
        L_0x007a:
            r1.addTransition(r4)
            goto L_0x007f
        L_0x007e:
            r1 = r6
        L_0x007f:
            return r1
        L_0x0080:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.v.a(a.i.a.d0, java.lang.Object, java.lang.Object, java.lang.Object, androidx.fragment.app.Fragment, boolean):java.lang.Object");
    }

    public static void a(d0 d0Var, Object obj, Object obj2, a.d.a<String, View> aVar, boolean z, a aVar2) {
        ArrayList<String> arrayList = aVar2.n;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = aVar.get((z ? aVar2.o : aVar2.n).get(0));
            y yVar = (y) d0Var;
            if (yVar != null) {
                if (view != null) {
                    Rect rect = new Rect();
                    yVar.a(view, rect);
                    ((Transition) obj).setEpicenterCallback(new w(yVar, rect));
                }
                if (obj2 != null && view != null) {
                    Rect rect2 = new Rect();
                    yVar.a(view, rect2);
                    ((Transition) obj2).setEpicenterCallback(new w(yVar, rect2));
                    return;
                }
                return;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: android.transition.TransitionSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: android.transition.TransitionSet} */
    /* JADX WARNING: type inference failed for: r3v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x048f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0231 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(a.i.a.j r39, java.util.ArrayList<a.i.a.a> r40, java.util.ArrayList<java.lang.Boolean> r41, int r42, int r43, boolean r44) {
        /*
            r0 = r39
            r1 = r40
            r2 = r41
            r3 = r43
            r4 = r44
            int r5 = r0.o
            r6 = 1
            if (r5 >= r6) goto L_0x0010
            return
        L_0x0010:
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            r7 = r42
        L_0x0017:
            r8 = 0
            if (r7 >= r3) goto L_0x0068
            java.lang.Object r9 = r1.get(r7)
            a.i.a.a r9 = (a.i.a.a) r9
            java.lang.Object r10 = r2.get(r7)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x004e
            a.i.a.j r8 = r9.r
            a.i.a.e r8 = r8.q
            boolean r8 = r8.e()
            if (r8 != 0) goto L_0x0037
            goto L_0x0065
        L_0x0037:
            java.util.ArrayList<a.i.a.q$a> r8 = r9.f384a
            int r8 = r8.size()
            int r8 = r8 - r6
        L_0x003e:
            if (r8 < 0) goto L_0x0065
            java.util.ArrayList<a.i.a.q$a> r10 = r9.f384a
            java.lang.Object r10 = r10.get(r8)
            a.i.a.q$a r10 = (a.i.a.q.a) r10
            a((a.i.a.a) r9, (a.i.a.q.a) r10, (android.util.SparseArray<a.i.a.v.a>) r5, (boolean) r6, (boolean) r4)
            int r8 = r8 + -1
            goto L_0x003e
        L_0x004e:
            java.util.ArrayList<a.i.a.q$a> r10 = r9.f384a
            int r10 = r10.size()
            r11 = r8
        L_0x0055:
            if (r11 >= r10) goto L_0x0065
            java.util.ArrayList<a.i.a.q$a> r12 = r9.f384a
            java.lang.Object r12 = r12.get(r11)
            a.i.a.q$a r12 = (a.i.a.q.a) r12
            a((a.i.a.a) r9, (a.i.a.q.a) r12, (android.util.SparseArray<a.i.a.v.a>) r5, (boolean) r8, (boolean) r4)
            int r11 = r11 + 1
            goto L_0x0055
        L_0x0065:
            int r7 = r7 + 1
            goto L_0x0017
        L_0x0068:
            int r7 = r5.size()
            if (r7 == 0) goto L_0x04a3
            android.view.View r7 = new android.view.View
            a.i.a.h r9 = r0.p
            android.content.Context r9 = r9.c
            r7.<init>(r9)
            int r15 = r5.size()
            r14 = r8
        L_0x007c:
            if (r14 >= r15) goto L_0x04a3
            int r9 = r5.keyAt(r14)
            a.d.a r13 = new a.d.a
            r13.<init>()
            int r10 = r3 + -1
            r12 = r42
        L_0x008b:
            if (r10 < r12) goto L_0x00f2
            java.lang.Object r11 = r1.get(r10)
            a.i.a.a r11 = (a.i.a.a) r11
            boolean r16 = r11.b(r9)
            if (r16 != 0) goto L_0x009a
            goto L_0x00e7
        L_0x009a:
            java.lang.Object r16 = r2.get(r10)
            java.lang.Boolean r16 = (java.lang.Boolean) r16
            boolean r16 = r16.booleanValue()
            java.util.ArrayList<java.lang.String> r6 = r11.n
            if (r6 == 0) goto L_0x00e7
            int r6 = r6.size()
            java.util.ArrayList<java.lang.String> r8 = r11.n
            java.util.ArrayList<java.lang.String> r11 = r11.o
            if (r16 == 0) goto L_0x00b3
            goto L_0x00b8
        L_0x00b3:
            r38 = r11
            r11 = r8
            r8 = r38
        L_0x00b8:
            r1 = 0
        L_0x00b9:
            if (r1 >= r6) goto L_0x00e7
            java.lang.Object r16 = r11.get(r1)
            r2 = r16
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r16 = r8.get(r1)
            r3 = r16
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r16 = r13.remove(r3)
            r17 = r6
            r6 = r16
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x00db
            r13.put(r2, r6)
            goto L_0x00de
        L_0x00db:
            r13.put(r2, r3)
        L_0x00de:
            int r1 = r1 + 1
            r2 = r41
            r3 = r43
            r6 = r17
            goto L_0x00b9
        L_0x00e7:
            int r10 = r10 + -1
            r1 = r40
            r2 = r41
            r3 = r43
            r6 = 1
            r8 = 0
            goto L_0x008b
        L_0x00f2:
            java.lang.Object r1 = r5.valueAt(r14)
            a.i.a.v$a r1 = (a.i.a.v.a) r1
            if (r4 == 0) goto L_0x031a
            a.i.a.e r3 = r0.q
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x010b
            a.i.a.e r3 = r0.q
            android.view.View r3 = r3.a(r9)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto L_0x010c
        L_0x010b:
            r3 = 0
        L_0x010c:
            if (r3 != 0) goto L_0x0116
        L_0x010e:
            r31 = r5
            r32 = r14
            r33 = r15
            goto L_0x0313
        L_0x0116:
            androidx.fragment.app.Fragment r6 = r1.f394a
            androidx.fragment.app.Fragment r8 = r1.d
            a.i.a.d0 r9 = a((androidx.fragment.app.Fragment) r8, (androidx.fragment.app.Fragment) r6)
            if (r9 != 0) goto L_0x0121
            goto L_0x010e
        L_0x0121:
            boolean r10 = r1.f395b
            boolean r11 = r1.e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r31 = r5
            java.lang.Object r5 = a((a.i.a.d0) r9, (androidx.fragment.app.Fragment) r6, (boolean) r10)
            java.lang.Object r11 = b(r9, r8, r11)
            androidx.fragment.app.Fragment r12 = r1.f394a
            r32 = r14
            androidx.fragment.app.Fragment r14 = r1.d
            r33 = r15
            if (r12 == 0) goto L_0x014b
            android.view.View r15 = r12.t()
            r0 = 0
            r15.setVisibility(r0)
        L_0x014b:
            if (r12 == 0) goto L_0x01fe
            if (r14 != 0) goto L_0x0151
            goto L_0x01fe
        L_0x0151:
            boolean r0 = r1.f395b
            boolean r15 = r13.isEmpty()
            if (r15 == 0) goto L_0x015d
            r34 = r10
            r15 = 0
            goto L_0x0163
        L_0x015d:
            java.lang.Object r15 = a((a.i.a.d0) r9, (androidx.fragment.app.Fragment) r12, (androidx.fragment.app.Fragment) r14, (boolean) r0)
            r34 = r10
        L_0x0163:
            a.d.a r10 = b(r9, r13, r15, r1)
            r35 = r6
            a.d.a r6 = a((a.i.a.d0) r9, (a.d.a<java.lang.String, java.lang.String>) r13, (java.lang.Object) r15, (a.i.a.v.a) r1)
            boolean r16 = r13.isEmpty()
            if (r16 == 0) goto L_0x017f
            if (r10 == 0) goto L_0x0178
            r10.clear()
        L_0x0178:
            if (r6 == 0) goto L_0x017d
            r6.clear()
        L_0x017d:
            r15 = 0
            goto L_0x0191
        L_0x017f:
            r16 = r15
            java.util.Set r15 = r13.keySet()
            a((java.util.ArrayList<android.view.View>) r4, (a.d.a<java.lang.String, android.view.View>) r10, (java.util.Collection<java.lang.String>) r15)
            java.util.Collection r15 = r13.values()
            a((java.util.ArrayList<android.view.View>) r2, (a.d.a<java.lang.String, android.view.View>) r6, (java.util.Collection<java.lang.String>) r15)
            r15 = r16
        L_0x0191:
            if (r5 != 0) goto L_0x019b
            if (r11 != 0) goto L_0x019b
            if (r15 != 0) goto L_0x019b
            r37 = r2
            goto L_0x0204
        L_0x019b:
            r36 = r13
            r13 = 1
            a((androidx.fragment.app.Fragment) r12, (androidx.fragment.app.Fragment) r14, (boolean) r0, (a.d.a<java.lang.String, android.view.View>) r10, (boolean) r13)
            if (r15 == 0) goto L_0x01e3
            r2.add(r7)
            r9.a((java.lang.Object) r15, (android.view.View) r7, (java.util.ArrayList<android.view.View>) r4)
            boolean r13 = r1.e
            r37 = r2
            a.i.a.a r2 = r1.f
            r16 = r9
            r17 = r15
            r18 = r11
            r19 = r10
            r20 = r13
            r21 = r2
            a((a.i.a.d0) r16, (java.lang.Object) r17, (java.lang.Object) r18, (a.d.a<java.lang.String, android.view.View>) r19, (boolean) r20, (a.i.a.a) r21)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.view.View r1 = a((a.d.a<java.lang.String, android.view.View>) r6, (a.i.a.v.a) r1, (java.lang.Object) r5, (boolean) r0)
            if (r1 == 0) goto L_0x01dc
            r10 = r9
            a.i.a.y r10 = (a.i.a.y) r10
            if (r5 == 0) goto L_0x01dc
            r13 = r5
            android.transition.Transition r13 = (android.transition.Transition) r13
            r16 = r1
            a.i.a.z r1 = new a.i.a.z
            r1.<init>(r10, r2)
            r13.setEpicenterCallback(r1)
            goto L_0x01de
        L_0x01dc:
            r16 = r1
        L_0x01de:
            r29 = r2
            r27 = r16
            goto L_0x01e9
        L_0x01e3:
            r37 = r2
            r27 = 0
            r29 = 0
        L_0x01e9:
            a.i.a.t r1 = new a.i.a.t
            r22 = r1
            r23 = r12
            r24 = r14
            r25 = r0
            r26 = r6
            r28 = r9
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            a.f.k.j.a(r3, r1)
            goto L_0x0207
        L_0x01fe:
            r37 = r2
            r35 = r6
            r34 = r10
        L_0x0204:
            r36 = r13
            r15 = 0
        L_0x0207:
            if (r5 != 0) goto L_0x020f
            if (r15 != 0) goto L_0x020f
            if (r11 != 0) goto L_0x020f
            goto L_0x0313
        L_0x020f:
            java.util.ArrayList r0 = a((a.i.a.d0) r9, (java.lang.Object) r11, (androidx.fragment.app.Fragment) r8, (java.util.ArrayList<android.view.View>) r4, (android.view.View) r7)
            r1 = r35
            r2 = r37
            java.util.ArrayList r6 = a((a.i.a.d0) r9, (java.lang.Object) r5, (androidx.fragment.app.Fragment) r1, (java.util.ArrayList<android.view.View>) r2, (android.view.View) r7)
            r10 = 4
            a((java.util.ArrayList<android.view.View>) r6, (int) r10)
            r16 = r9
            r17 = r5
            r18 = r11
            r19 = r15
            r20 = r1
            r21 = r34
            java.lang.Object r1 = a((a.i.a.d0) r16, (java.lang.Object) r17, (java.lang.Object) r18, (java.lang.Object) r19, (androidx.fragment.app.Fragment) r20, (boolean) r21)
            if (r1 == 0) goto L_0x0313
            if (r8 == 0) goto L_0x025f
            if (r11 == 0) goto L_0x025f
            boolean r10 = r8.l
            if (r10 == 0) goto L_0x025f
            boolean r10 = r8.z
            if (r10 == 0) goto L_0x025f
            boolean r10 = r8.N
            if (r10 == 0) goto L_0x025f
            r10 = 1
            r8.a((boolean) r10)
            android.view.View r10 = r8.H
            r12 = r9
            a.i.a.y r12 = (a.i.a.y) r12
            r13 = r11
            android.transition.Transition r13 = (android.transition.Transition) r13
            a.i.a.x r14 = new a.i.a.x
            r14.<init>(r12, r10, r0)
            r13.addListener(r14)
            android.view.ViewGroup r8 = r8.G
            a.i.a.r r10 = new a.i.a.r
            r10.<init>(r0)
            a.f.k.j.a(r8, r10)
        L_0x025f:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r10 = r2.size()
            r12 = 0
        L_0x0269:
            if (r12 >= r10) goto L_0x027f
            java.lang.Object r13 = r2.get(r12)
            android.view.View r13 = (android.view.View) r13
            java.lang.String r14 = a.f.k.k.e(r13)
            r8.add(r14)
            r14 = 0
            r13.setTransitionName(r14)
            int r12 = r12 + 1
            goto L_0x0269
        L_0x027f:
            r22 = r9
            r23 = r1
            r24 = r5
            r25 = r6
            r26 = r11
            r27 = r0
            r28 = r15
            r29 = r2
            r22.a(r23, r24, r25, r26, r27, r28, r29)
            android.transition.Transition r1 = (android.transition.Transition) r1
            android.transition.TransitionManager.beginDelayedTransition(r3, r1)
            int r0 = r2.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5 = 0
        L_0x02a1:
            if (r5 >= r0) goto L_0x02e1
            java.lang.Object r10 = r4.get(r5)
            android.view.View r10 = (android.view.View) r10
            java.lang.String r11 = a.f.k.k.e(r10)
            r1.add(r11)
            if (r11 != 0) goto L_0x02b5
            r13 = r36
            goto L_0x02dc
        L_0x02b5:
            r14 = 0
            r10.setTransitionName(r14)
            r13 = r36
            java.lang.Object r10 = r13.get(r11)
            java.lang.String r10 = (java.lang.String) r10
            r12 = 0
        L_0x02c2:
            if (r12 >= r0) goto L_0x02dc
            java.lang.Object r14 = r8.get(r12)
            boolean r14 = r10.equals(r14)
            if (r14 == 0) goto L_0x02d8
            java.lang.Object r10 = r2.get(r12)
            android.view.View r10 = (android.view.View) r10
            r10.setTransitionName(r11)
            goto L_0x02dc
        L_0x02d8:
            int r12 = r12 + 1
            r14 = 0
            goto L_0x02c2
        L_0x02dc:
            int r5 = r5 + 1
            r36 = r13
            goto L_0x02a1
        L_0x02e1:
            a.i.a.a0 r5 = new a.i.a.a0
            r22 = r5
            r23 = r9
            r24 = r0
            r25 = r2
            r26 = r8
            r27 = r4
            r28 = r1
            r22.<init>(r23, r24, r25, r26, r27, r28)
            a.f.k.j.a(r3, r5)
            r0 = 0
            a((java.util.ArrayList<android.view.View>) r6, (int) r0)
            a.i.a.y r9 = (a.i.a.y) r9
            android.transition.TransitionSet r15 = (android.transition.TransitionSet) r15
            if (r15 == 0) goto L_0x0314
            java.util.List r1 = r15.getTargets()
            r1.clear()
            java.util.List r1 = r15.getTargets()
            r1.addAll(r2)
            r9.a((java.lang.Object) r15, (java.util.ArrayList<android.view.View>) r4, (java.util.ArrayList<android.view.View>) r2)
            goto L_0x0314
        L_0x0313:
            r0 = 0
        L_0x0314:
            r27 = r32
            r30 = r33
            goto L_0x048f
        L_0x031a:
            r31 = r5
            r32 = r14
            r33 = r15
            r0 = 0
            r2 = r39
            a.i.a.e r3 = r2.q
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x0336
            a.i.a.e r3 = r2.q
            android.view.View r3 = r3.a(r9)
            r14 = r3
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            r3 = r14
            goto L_0x0337
        L_0x0336:
            r3 = 0
        L_0x0337:
            if (r3 != 0) goto L_0x033a
            goto L_0x0314
        L_0x033a:
            androidx.fragment.app.Fragment r4 = r1.f394a
            androidx.fragment.app.Fragment r5 = r1.d
            a.i.a.d0 r6 = a((androidx.fragment.app.Fragment) r5, (androidx.fragment.app.Fragment) r4)
            if (r6 != 0) goto L_0x0345
            goto L_0x0314
        L_0x0345:
            boolean r8 = r1.f395b
            boolean r9 = r1.e
            java.lang.Object r8 = a((a.i.a.d0) r6, (androidx.fragment.app.Fragment) r4, (boolean) r8)
            java.lang.Object r12 = b(r6, r5, r9)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            androidx.fragment.app.Fragment r9 = r1.f394a
            androidx.fragment.app.Fragment r15 = r1.d
            if (r9 == 0) goto L_0x0408
            if (r15 != 0) goto L_0x0365
            goto L_0x0408
        L_0x0365:
            boolean r14 = r1.f395b
            boolean r16 = r13.isEmpty()
            if (r16 == 0) goto L_0x036f
            r0 = 0
            goto L_0x0375
        L_0x036f:
            java.lang.Object r16 = a((a.i.a.d0) r6, (androidx.fragment.app.Fragment) r9, (androidx.fragment.app.Fragment) r15, (boolean) r14)
            r0 = r16
        L_0x0375:
            a.d.a r2 = b(r6, r13, r0, r1)
            boolean r16 = r13.isEmpty()
            if (r16 == 0) goto L_0x0381
            r0 = 0
            goto L_0x038c
        L_0x0381:
            r16 = r0
            java.util.Collection r0 = r2.values()
            r11.addAll(r0)
            r0 = r16
        L_0x038c:
            if (r8 != 0) goto L_0x0394
            if (r12 != 0) goto L_0x0394
            if (r0 != 0) goto L_0x0394
            goto L_0x0408
        L_0x0394:
            r22 = r4
            r4 = 1
            a((androidx.fragment.app.Fragment) r9, (androidx.fragment.app.Fragment) r15, (boolean) r14, (a.d.a<java.lang.String, android.view.View>) r2, (boolean) r4)
            if (r0 == 0) goto L_0x03ce
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r6.a((java.lang.Object) r0, (android.view.View) r7, (java.util.ArrayList<android.view.View>) r11)
            r20 = r9
            boolean r9 = r1.e
            r21 = r10
            a.i.a.a r10 = r1.f
            r23 = r14
            r14 = r6
            r24 = r15
            r15 = r0
            r16 = r12
            r17 = r2
            r18 = r9
            r19 = r10
            a((a.i.a.d0) r14, (java.lang.Object) r15, (java.lang.Object) r16, (a.d.a<java.lang.String, android.view.View>) r17, (boolean) r18, (a.i.a.a) r19)
            if (r8 == 0) goto L_0x03d7
            r2 = r6
            a.i.a.y r2 = (a.i.a.y) r2
            r9 = r8
            android.transition.Transition r9 = (android.transition.Transition) r9
            a.i.a.z r10 = new a.i.a.z
            r10.<init>(r2, r4)
            r9.setEpicenterCallback(r10)
            goto L_0x03d7
        L_0x03ce:
            r20 = r9
            r21 = r10
            r23 = r14
            r24 = r15
            r4 = 0
        L_0x03d7:
            a.i.a.u r2 = new a.i.a.u
            r16 = r20
            r9 = r2
            r15 = r21
            r10 = r6
            r14 = r11
            r11 = r13
            r25 = r5
            r5 = r12
            r12 = r0
            r26 = r0
            r0 = r13
            r13 = r1
            r28 = r14
            r27 = r32
            r29 = 0
            r14 = r15
            r32 = r15
            r30 = r33
            r15 = r7
            r17 = r24
            r18 = r23
            r19 = r28
            r20 = r8
            r21 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            a.f.k.j.a(r3, r2)
            r20 = r26
            goto L_0x041a
        L_0x0408:
            r22 = r4
            r25 = r5
            r28 = r11
            r5 = r12
            r0 = r13
            r27 = r32
            r30 = r33
            r29 = 0
            r32 = r10
            r20 = r29
        L_0x041a:
            if (r8 != 0) goto L_0x0422
            if (r20 != 0) goto L_0x0422
            if (r5 != 0) goto L_0x0422
            goto L_0x048f
        L_0x0422:
            r2 = r25
            r4 = r28
            java.util.ArrayList r2 = a((a.i.a.d0) r6, (java.lang.Object) r5, (androidx.fragment.app.Fragment) r2, (java.util.ArrayList<android.view.View>) r4, (android.view.View) r7)
            if (r2 == 0) goto L_0x0435
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x0433
            goto L_0x0435
        L_0x0433:
            r29 = r5
        L_0x0435:
            if (r8 == 0) goto L_0x043d
            r4 = r8
            android.transition.Transition r4 = (android.transition.Transition) r4
            r4.addTarget(r7)
        L_0x043d:
            boolean r1 = r1.f395b
            r14 = r6
            r15 = r8
            r16 = r29
            r17 = r20
            r18 = r22
            r19 = r1
            java.lang.Object r1 = a((a.i.a.d0) r14, (java.lang.Object) r15, (java.lang.Object) r16, (java.lang.Object) r17, (androidx.fragment.app.Fragment) r18, (boolean) r19)
            if (r1 == 0) goto L_0x048f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r14 = r6
            r15 = r1
            r16 = r8
            r17 = r4
            r18 = r29
            r19 = r2
            r21 = r32
            r14.a(r15, r16, r17, r18, r19, r20, r21)
            a.i.a.s r5 = new a.i.a.s
            r9 = r5
            r10 = r8
            r11 = r6
            r12 = r7
            r13 = r22
            r14 = r32
            r15 = r4
            r16 = r2
            r17 = r29
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            a.f.k.j.a(r3, r5)
            a.i.a.b0 r2 = new a.i.a.b0
            r4 = r32
            r2.<init>(r6, r4, r0)
            a.f.k.j.a(r3, r2)
            android.transition.Transition r1 = (android.transition.Transition) r1
            android.transition.TransitionManager.beginDelayedTransition(r3, r1)
            a.i.a.c0 r1 = new a.i.a.c0
            r1.<init>(r6, r4, r0)
            a.f.k.j.a(r3, r1)
        L_0x048f:
            int r14 = r27 + 1
            r0 = r39
            r1 = r40
            r2 = r41
            r3 = r43
            r4 = r44
            r15 = r30
            r5 = r31
            r6 = 1
            r8 = 0
            goto L_0x007c
        L_0x04a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.v.a(a.i.a.j, java.util.ArrayList, java.util.ArrayList, int, int, boolean):void");
    }
}
