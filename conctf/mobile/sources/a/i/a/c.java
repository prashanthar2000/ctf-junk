package a.i.a;

import android.view.View;
import androidx.fragment.app.Fragment;

public class c extends e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Fragment f358a;

    public c(Fragment fragment) {
        this.f358a = fragment;
    }

    public View a(int i) {
        View view = this.f358a.H;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + this + " does not have a view");
    }

    public boolean e() {
        return this.f358a.H != null;
    }
}
