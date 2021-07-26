package a.i.a;

import a.j.q;
import a.j.r;
import a.j.t;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class o extends q {
    public static final r h = new a();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<Fragment> f382b = new HashSet<>();
    public final HashMap<String, o> c = new HashMap<>();
    public final HashMap<String, t> d = new HashMap<>();
    public final boolean e;
    public boolean f = false;
    public boolean g = false;

    public static class a implements r {
        public <T extends q> T a(Class<T> cls) {
            return new o(true);
        }
    }

    public o(boolean z) {
        this.e = z;
    }

    public boolean a(Fragment fragment) {
        if (!this.f382b.contains(fragment)) {
            return true;
        }
        return this.e ? this.f : !this.g;
    }

    public void b() {
        if (j.G) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.f382b.equals(oVar.f382b) && this.c.equals(oVar.c) && this.d.equals(oVar.d);
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        return this.d.hashCode() + ((hashCode + (this.f382b.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f382b.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
