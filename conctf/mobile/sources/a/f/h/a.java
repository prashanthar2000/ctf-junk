package a.f.h;

import android.util.Base64;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f288a;

    /* renamed from: b  reason: collision with root package name */
    public final String f289b;
    public final String c;
    public final List<List<byte[]>> d;
    public final int e;
    public final String f;

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        if (str != null) {
            this.f288a = str;
            if (str2 != null) {
                this.f289b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (list != null) {
                        this.d = list;
                        this.e = 0;
                        this.f = str + "-" + this.f289b + "-" + this.c;
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder a2 = b.a.a.a.a.a("FontRequest {mProviderAuthority: ");
        a2.append(this.f288a);
        a2.append(", mProviderPackage: ");
        a2.append(this.f289b);
        a2.append(", mQuery: ");
        a2.append(this.c);
        a2.append(", mCertificates:");
        sb.append(a2.toString());
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(" [");
            List list = this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.e);
        return sb.toString();
    }
}
