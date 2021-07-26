package a.b.p;

import android.view.View;
import android.widget.AdapterView;

public class j0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k0 f144b;

    public j0(k0 k0Var) {
        this.f144b = k0Var;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        f0 f0Var;
        if (i != -1 && (f0Var = this.f144b.d) != null) {
            f0Var.setListSelectionHidden(false);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
