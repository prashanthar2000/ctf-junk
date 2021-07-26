package a.b.k;

import a.b.o.a;
import a.f.k.c;
import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

public class n extends Dialog implements f {

    /* renamed from: b  reason: collision with root package name */
    public g f27b;
    public final c.a c;

    public class a implements c.a {
        public a() {
        }

        public boolean a(KeyEvent keyEvent) {
            return n.this.a(keyEvent);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            if (r6 != 0) goto L_0x0014
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            int r3 = a.b.a.dialogTheme
            r2.resolveAttribute(r3, r1, r0)
            int r1 = r1.resourceId
            goto L_0x0015
        L_0x0014:
            r1 = r6
        L_0x0015:
            r4.<init>(r5, r1)
            a.b.k.n$a r1 = new a.b.k.n$a
            r1.<init>()
            r4.c = r1
            a.b.k.g r1 = r4.a()
            if (r6 != 0) goto L_0x0035
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            int r2 = a.b.a.dialogTheme
            r5.resolveAttribute(r2, r6, r0)
            int r6 = r6.resourceId
        L_0x0035:
            r5 = r1
            a.b.k.h r5 = (a.b.k.h) r5
            r5.O = r6
            r5 = 0
            r1.a((android.os.Bundle) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.n.<init>(android.content.Context, int):void");
    }

    public g a() {
        if (this.f27b == null) {
            this.f27b = g.a((Dialog) this, (f) this);
        }
        return this.f27b;
    }

    public a.b.o.a a(a.C0004a aVar) {
        return null;
    }

    public void a(a.b.o.a aVar) {
    }

    public boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().a(view, layoutParams);
    }

    public void b(a.b.o.a aVar) {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return c.a(this.c, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        h hVar = (h) a();
        hVar.f();
        return hVar.f.findViewById(i);
    }

    public void invalidateOptionsMenu() {
        a().b();
    }

    public void onCreate(Bundle bundle) {
        a().a();
        super.onCreate(bundle);
        a().a(bundle);
    }

    public void onStop() {
        super.onStop();
        a().c();
    }

    public void setContentView(int i) {
        a().b(i);
    }

    public void setContentView(View view) {
        a().a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().b(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        a().a((CharSequence) getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().a(charSequence);
    }
}
