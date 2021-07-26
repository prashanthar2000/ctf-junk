package a.j;

import a.j.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a {
    public static a c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class, C0022a> f402a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class, Boolean> f403b = new HashMap();

    /* renamed from: a.j.a$a  reason: collision with other inner class name */
    public static class C0022a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<e.a, List<b>> f404a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<b, e.a> f405b;

        public C0022a(Map<b, e.a> map) {
            this.f405b = map;
            for (Map.Entry next : map.entrySet()) {
                e.a aVar = (e.a) next.getValue();
                List list = this.f404a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f404a.put(aVar, list);
                }
                list.add(next.getKey());
            }
        }

        public static void a(List<b> list, h hVar, e.a aVar, Object obj) {
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    b bVar = list.get(size);
                    if (bVar != null) {
                        try {
                            int i = bVar.f406a;
                            if (i == 0) {
                                bVar.f407b.invoke(obj, new Object[0]);
                            } else if (i == 1) {
                                bVar.f407b.invoke(obj, new Object[]{hVar});
                            } else if (i == 2) {
                                bVar.f407b.invoke(obj, new Object[]{hVar, aVar});
                            }
                            size--;
                        } catch (InvocationTargetException e) {
                            throw new RuntimeException("Failed to call observer method", e.getCause());
                        } catch (IllegalAccessException e2) {
                            throw new RuntimeException(e2);
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f406a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f407b;

        public b(int i, Method method) {
            this.f406a = i;
            this.f407b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f406a == bVar.f406a && this.f407b.getName().equals(bVar.f407b.getName());
        }

        public int hashCode() {
            return this.f407b.getName().hashCode() + (this.f406a * 31);
        }
    }

    public C0022a a(Class cls) {
        C0022a aVar = this.f402a.get(cls);
        return aVar != null ? aVar : a(cls, (Method[]) null);
    }

    public final C0022a a(Class cls, Method[] methodArr) {
        int i;
        C0022a a2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (a2 = a(superclass)) == null)) {
            hashMap.putAll(a2.f405b);
        }
        for (Class a3 : cls.getInterfaces()) {
            for (Map.Entry next : a(a3).f405b.entrySet()) {
                a(hashMap, (b) next.getKey(), (e.a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            o oVar = (o) method.getAnnotation(o.class);
            if (oVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(h.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                e.a value = oVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(e.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == e.a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    a(hashMap, new b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0022a aVar = new C0022a(hashMap);
        this.f402a.put(cls, aVar);
        this.f403b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    public final void a(Map<b, e.a> map, b bVar, e.a aVar, Class cls) {
        e.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f407b;
            StringBuilder a2 = b.a.a.a.a.a("Method ");
            a2.append(method.getName());
            a2.append(" in ");
            a2.append(cls.getName());
            a2.append(" already declared with different @OnLifecycleEvent value: previous value ");
            a2.append(aVar2);
            a2.append(", new value ");
            a2.append(aVar);
            throw new IllegalArgumentException(a2.toString());
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }
}
