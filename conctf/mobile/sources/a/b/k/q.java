package a.b.k;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

public class q {
    public static q d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f33a;

    /* renamed from: b  reason: collision with root package name */
    public final LocationManager f34b;
    public final a c = new a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f35a;

        /* renamed from: b  reason: collision with root package name */
        public long f36b;
    }

    public q(Context context, LocationManager locationManager) {
        this.f33a = context;
        this.f34b = locationManager;
    }

    public final Location a(String str) {
        try {
            if (this.f34b.isProviderEnabled(str)) {
                return this.f34b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }
}
