package a.f.k.u;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: b  reason: collision with root package name */
    public final int f337b;
    public final b c;
    public final int d;

    public a(int i, b bVar, int i2) {
        this.f337b = i;
        this.c = bVar;
        this.d = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f337b);
        b bVar = this.c;
        bVar.f338a.performAction(this.d, bundle);
    }
}
