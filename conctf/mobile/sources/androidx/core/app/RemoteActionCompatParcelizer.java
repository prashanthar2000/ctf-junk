package androidx.core.app;

import a.n.a;
import a.n.b;
import a.n.c;
import android.app.PendingIntent;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f507a;
        if (aVar.a(1)) {
            obj = aVar.c();
        }
        remoteActionCompat.f507a = (IconCompat) obj;
        remoteActionCompat.f508b = aVar.a(remoteActionCompat.f508b, 2);
        remoteActionCompat.c = aVar.a(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) aVar.a(remoteActionCompat.d, 4);
        remoteActionCompat.e = aVar.a(remoteActionCompat.e, 5);
        remoteActionCompat.f = aVar.a(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        if (aVar != null) {
            IconCompat iconCompat = remoteActionCompat.f507a;
            aVar.b(1);
            aVar.a((c) iconCompat);
            CharSequence charSequence = remoteActionCompat.f508b;
            aVar.b(2);
            b bVar = (b) aVar;
            TextUtils.writeToParcel(charSequence, bVar.e, 0);
            CharSequence charSequence2 = remoteActionCompat.c;
            aVar.b(3);
            TextUtils.writeToParcel(charSequence2, bVar.e, 0);
            aVar.b((Parcelable) remoteActionCompat.d, 4);
            boolean z = remoteActionCompat.e;
            aVar.b(5);
            bVar.e.writeInt(z ? 1 : 0);
            boolean z2 = remoteActionCompat.f;
            aVar.b(6);
            bVar.e.writeInt(z2 ? 1 : 0);
            return;
        }
        throw null;
    }
}
