package a.j;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static Map<Class, Integer> f413a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static Map<Class, List<Constructor<? extends c>>> f414b = new HashMap();

    public static int a(Class<?> cls) {
        Constructor<?> constructor;
        Map<Class, List<Constructor<? extends c>>> map;
        boolean z;
        Integer num = f413a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        Class<g> cls2 = g.class;
        int i = 1;
        if (cls.getCanonicalName() != null) {
            List<?> list = null;
            try {
                Package packageR = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = packageR != null ? packageR.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String a2 = a(canonicalName);
                if (!name.isEmpty()) {
                    a2 = name + "." + a2;
                }
                constructor = Class.forName(a2).getDeclaredConstructor(new Class[]{cls});
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            if (constructor != null) {
                map = f414b;
                list = Collections.singletonList(constructor);
            } else {
                a aVar = a.c;
                Boolean bool = aVar.f403b.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                aVar.f403b.put(cls, false);
                                z = false;
                                break;
                            } else if (((o) declaredMethods[i2].getAnnotation(o.class)) != null) {
                                aVar.a(cls, declaredMethods);
                                z = true;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!z) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (superclass != null && cls2.isAssignableFrom(superclass)) {
                        if (a((Class<?>) superclass) != 1) {
                            list = new ArrayList<>(f414b.get(superclass));
                        }
                    }
                    Class[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class cls3 = interfaces[i3];
                            if (cls3 != null && cls2.isAssignableFrom(cls3)) {
                                if (a((Class<?>) cls3) == 1) {
                                    break;
                                }
                                if (list == null) {
                                    list = new ArrayList<>();
                                }
                                list.addAll(f414b.get(cls3));
                            }
                            i3++;
                        } else if (list != null) {
                            map = f414b;
                        }
                    }
                }
            }
            map.put(cls, list);
            i = 2;
        }
        f413a.put(cls, Integer.valueOf(i));
        return i;
    }

    public static c a(Constructor<? extends c> constructor, Object obj) {
        try {
            return (c) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static f a(Object obj) {
        boolean z = obj instanceof f;
        boolean z2 = obj instanceof b;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((b) obj, (f) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((b) obj, (f) null);
        }
        if (z) {
            return (f) obj;
        }
        Class<?> cls = obj.getClass();
        if (a(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = f414b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(a((Constructor) list.get(0), obj));
        }
        c[] cVarArr = new c[list.size()];
        for (int i = 0; i < list.size(); i++) {
            cVarArr[i] = a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(cVarArr);
    }

    public static String a(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }
}
