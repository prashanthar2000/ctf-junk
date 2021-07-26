package a.b.k;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

public class c implements AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AlertController f5b;
    public final /* synthetic */ AlertController.b c;

    public c(AlertController.b bVar, AlertController alertController) {
        this.c = bVar;
        this.f5b = alertController;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.c.m.onClick(this.f5b.f458b, i);
        if (!this.c.o) {
            this.f5b.f458b.dismiss();
        }
    }
}
