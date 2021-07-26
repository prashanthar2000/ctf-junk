package a.i.a;

import a.d.h;
import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static final h<String, Class<?>> f362a = new h<>();

    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class<?> c(ClassLoader classLoader, String str) {
        Class<?> orDefault = f362a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls = Class.forName(str, false, classLoader);
        f362a.put(str, cls);
        return cls;
    }

    public static Class<? extends Fragment> d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new Fragment.c("Unable to instantiate fragment " + str + ": make sure class name exists", e);
        } catch (ClassCastException e2) {
            throw new Fragment.c("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        try {
            return (Fragment) d(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e) {
            throw new Fragment.c("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new Fragment.c("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment.c("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment.c("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }
}
