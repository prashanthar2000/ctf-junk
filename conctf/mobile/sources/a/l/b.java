package a.l;

import a.j.e;
import a.j.i;
import a.l.a;
import android.os.Bundle;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry$1;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final c f423a;

    /* renamed from: b  reason: collision with root package name */
    public final a f424b = new a();

    public b(c cVar) {
        this.f423a = cVar;
    }

    public void a(Bundle bundle) {
        e a2 = this.f423a.a();
        if (((i) a2).f410b == e.b.INITIALIZED) {
            a2.a(new Recreator(this.f423a));
            a aVar = this.f424b;
            if (!aVar.c) {
                if (bundle != null) {
                    aVar.f422b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                a2.a(new SavedStateRegistry$1(aVar));
                aVar.c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void b(Bundle bundle) {
        a aVar = this.f424b;
        if (aVar != null) {
            Bundle bundle2 = new Bundle();
            Bundle bundle3 = aVar.f422b;
            if (bundle3 != null) {
                bundle2.putAll(bundle3);
            }
            a.c.a.b.b<K, V>.d a2 = aVar.f421a.a();
            while (a2.hasNext()) {
                Map.Entry entry = (Map.Entry) a2.next();
                bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
            }
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
            return;
        }
        throw null;
    }
}
