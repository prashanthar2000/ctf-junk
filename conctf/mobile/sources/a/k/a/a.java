package a.k.a;

import a.j.h;
import a.j.u;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {
    public static <T extends h & u> a a(T t) {
        return new b(t, ((u) t).d());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
