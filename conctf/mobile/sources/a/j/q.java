package a.j;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f416a = new HashMap();

    public final void a() {
        Map<String, Object> map = this.f416a;
        if (map != null) {
            synchronized (map) {
                for (Object next : this.f416a.values()) {
                    if (next instanceof Closeable) {
                        try {
                            ((Closeable) next).close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
        b();
    }

    public void b() {
    }
}
