package a.j;

import a.j.e;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

public class p extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public a f415b;

    public interface a {
        void a();

        void b();

        void c();
    }

    public static void a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new p(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void a(e.a aVar) {
        Activity activity = getActivity();
        if (activity instanceof j) {
            ((j) activity).a().a(aVar);
        } else if (activity instanceof h) {
            e a2 = ((h) activity).a();
            if (a2 instanceof i) {
                ((i) a2).a(aVar);
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a aVar = this.f415b;
        if (aVar != null) {
            aVar.a();
        }
        a(e.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        a(e.a.ON_DESTROY);
        this.f415b = null;
    }

    public void onPause() {
        super.onPause();
        a(e.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        a aVar = this.f415b;
        if (aVar != null) {
            aVar.b();
        }
        a(e.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        a aVar = this.f415b;
        if (aVar != null) {
            aVar.c();
        }
        a(e.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        a(e.a.ON_STOP);
    }
}
