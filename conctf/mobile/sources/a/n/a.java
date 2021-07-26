package a.n;

import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final a.d.a<String, Method> f443a;

    /* renamed from: b  reason: collision with root package name */
    public final a.d.a<String, Method> f444b;
    public final a.d.a<String, Class> c;

    public a(a.d.a<String, Method> aVar, a.d.a<String, Method> aVar2, a.d.a<String, Class> aVar3) {
        this.f443a = aVar;
        this.f444b = aVar2;
        this.c = aVar3;
    }

    public final Class a(Class<? extends c> cls) {
        Class orDefault = this.c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.c.put(cls.getName(), cls2);
        return cls2;
    }

    public abstract void a();

    public abstract boolean a(int i);

    public abstract a b();

    public final Method b(Class cls) {
        Method orDefault = this.f444b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class a2 = a((Class<? extends c>) cls);
        System.currentTimeMillis();
        Method declaredMethod = a2.getDeclaredMethod("write", new Class[]{cls, a.class});
        this.f444b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract void b(int i);

    public <T extends c> T c() {
        String readString = ((b) this).e.readString();
        if (readString == null) {
            return null;
        }
        a b2 = b();
        try {
            return (c) a(readString).invoke((Object) null, new Object[]{b2});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    public final Method a(String str) {
        Class<a> cls = a.class;
        Method orDefault = this.f443a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f443a.put(str, declaredMethod);
        return declaredMethod;
    }

    public void b(int i, int i2) {
        b(i2);
        ((b) this).e.writeInt(i);
    }

    public void b(Parcelable parcelable, int i) {
        b(i);
        ((b) this).e.writeParcelable(parcelable, 0);
    }

    public boolean a(boolean z, int i) {
        if (!a(i)) {
            return z;
        }
        return ((b) this).e.readInt() != 0;
    }

    public CharSequence a(CharSequence charSequence, int i) {
        return !a(i) ? charSequence : (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) this).e);
    }

    public int a(int i, int i2) {
        return !a(i2) ? i : ((b) this).e.readInt();
    }

    public <T extends Parcelable> T a(T t, int i) {
        return !a(i) ? t : ((b) this).e.readParcelable(b.class.getClassLoader());
    }

    public void a(c cVar) {
        if (cVar == null) {
            ((b) this).e.writeString((String) null);
            return;
        }
        try {
            ((b) this).e.writeString(a((Class<? extends c>) cVar.getClass()).getName());
            a b2 = b();
            try {
                b((Class) cVar.getClass()).invoke((Object) null, new Object[]{cVar, b2});
                b2.a();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e2.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }
}
