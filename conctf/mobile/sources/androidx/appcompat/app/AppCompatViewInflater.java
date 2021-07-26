package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class AppCompatViewInflater {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f464b = {Context.class, AttributeSet.class};
    public static final int[] c = {16843375};
    public static final String[] d = {"android.widget.", "android.view.", "android.webkit."};
    public static final Map<String, Constructor<? extends View>> e = new a.d.a();

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f465a = new Object[2];

    public static class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final View f466b;
        public final String c;
        public Method d;
        public Context e;

        public a(View view, String str) {
            this.f466b = view;
            this.c = str;
        }

        public void onClick(View view) {
            String str;
            Method method;
            if (this.d == null) {
                for (Context context = this.f466b.getContext(); context != null; context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.c, new Class[]{View.class})) != null) {
                            this.d = method;
                            this.e = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
                int id = this.f466b.getId();
                if (id == -1) {
                    str = "";
                } else {
                    StringBuilder a2 = b.a.a.a.a.a(" with id '");
                    a2.append(this.f466b.getContext().getResources().getResourceEntryName(id));
                    a2.append("'");
                    str = a2.toString();
                }
                StringBuilder a3 = b.a.a.a.a.a("Could not find method ");
                a3.append(this.c);
                a3.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                a3.append(this.f466b.getClass());
                a3.append(str);
                throw new IllegalStateException(a3.toString());
            }
            try {
                this.d.invoke(this.e, new Object[]{view});
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    public final View a(Context context, String str, String str2) {
        String str3;
        Constructor<? extends U> constructor = e.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f464b);
            e.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f465a);
    }

    public final void a(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(AppCompatViewInflater.class.getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }
}
