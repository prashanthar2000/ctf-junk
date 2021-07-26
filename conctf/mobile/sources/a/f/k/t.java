package a.f.k;

public class t {

    /* renamed from: a  reason: collision with root package name */
    public final Object f336a;

    public t(Object obj) {
        this.f336a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f336a;
        Object obj3 = ((t) obj).f336a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f336a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
