package a.i.a;

import a.a.c;
import a.b.k.o;
import a.j.e;
import a.j.i;
import a.j.t;
import a.j.u;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class d extends ComponentActivity {
    public final f g;
    public final i h = new i(this);
    public boolean i;
    public boolean j;
    public boolean k = true;
    public int l;
    public a.d.i<String> m;

    public class a extends h<d> implements u, c {
        public a() {
            super(d.this);
        }

        public e a() {
            return d.this.h;
        }

        public View a(int i) {
            return d.this.findViewById(i);
        }

        public OnBackPressedDispatcher b() {
            return d.this.f;
        }

        public t d() {
            return d.this.d();
        }

        public boolean e() {
            Window window = d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    }

    public d() {
        a aVar = new a();
        o.a(aVar, (Object) "callbacks == null");
        this.g = new f(aVar);
    }

    public static void a(int i2) {
        if ((i2 & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public static boolean a(i iVar, e.b bVar) {
        d dVar;
        boolean z = false;
        for (Fragment next : iVar.a()) {
            if (next != null) {
                if (next.S.f410b.a(e.b.STARTED)) {
                    next.S.a(bVar);
                    z = true;
                }
                h hVar = next.t;
                if (hVar == null) {
                    dVar = null;
                } else {
                    dVar = d.this;
                }
                if (dVar != null) {
                    z |= a(next.i(), bVar);
                }
            }
        }
        return z;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.i);
        printWriter.print(" mResumed=");
        printWriter.print(this.j);
        printWriter.print(" mStopped=");
        printWriter.print(this.k);
        if (getApplication() != null) {
            a.k.a.a.a(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.g.f361a.f.a(str, fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    public void f() {
        invalidateOptionsMenu();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        this.g.a();
        int i4 = i2 >> 16;
        if (i4 != 0) {
            int i5 = i4 - 1;
            String a2 = this.m.a(i5);
            this.m.c(i5);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            } else if (this.g.f361a.f.a(a2) == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a2);
            }
        } else {
            a.f.d.a.a();
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g.a();
        this.g.f361a.f.a(configuration);
    }

    public void onCreate(Bundle bundle) {
        h<?> hVar = this.g.f361a;
        hVar.f.a((h) hVar, (e) hVar, (Fragment) null);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            h<?> hVar2 = this.g.f361a;
            if (hVar2 instanceof u) {
                hVar2.f.a(parcelable);
                if (bundle.containsKey("android:support:next_request_index")) {
                    this.l = bundle.getInt("android:support:next_request_index");
                    int[] intArray = bundle.getIntArray("android:support:request_indicies");
                    String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                    if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                        Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                    } else {
                        this.m = new a.d.i<>(intArray.length);
                        for (int i2 = 0; i2 < intArray.length; i2++) {
                            this.m.c(intArray[i2], stringArray[i2]);
                        }
                    }
                }
            } else {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
        }
        if (this.m == null) {
            this.m = new a.d.i<>(10);
            this.l = 0;
        }
        super.onCreate(bundle);
        this.h.a(e.a.ON_CREATE);
        this.g.f361a.f.d();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return super.onCreatePanelMenu(i2, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i2, menu);
        f fVar = this.g;
        return onCreatePanelMenu | fVar.f361a.f.a(menu, getMenuInflater());
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.g.f361a.f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.g.f361a.f.e();
        this.h.a(e.a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.g.f361a.f.f();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.g.f361a.f.b(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.g.f361a.f.a(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.g.f361a.f.a(z);
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.g.a();
    }

    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.g.f361a.f.a(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    public void onPause() {
        super.onPause();
        this.j = false;
        this.g.f361a.f.a(3);
        this.h.a(e.a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.g.f361a.f.b(z);
    }

    public void onPostResume() {
        super.onPostResume();
        this.h.a(e.a.ON_RESUME);
        j jVar = this.g.f361a.f;
        jVar.u = false;
        jVar.v = false;
        jVar.a(4);
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 == 0) {
            return super.onPreparePanel(0, view, menu) | this.g.f361a.f.b(menu);
        }
        return super.onPreparePanel(i2, view, menu);
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.g.a();
        int i3 = (i2 >> 16) & 65535;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String a2 = this.m.a(i4);
            this.m.c(i4);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            } else if (this.g.f361a.f.a(a2) == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a2);
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.j = true;
        this.g.a();
        this.g.f361a.f.g();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        do {
        } while (a(this.g.f361a.f, e.b.CREATED));
        this.h.a(e.a.ON_STOP);
        Parcelable k2 = this.g.f361a.f.k();
        if (k2 != null) {
            bundle.putParcelable("android:support:fragments", k2);
        }
        if (this.m.b() > 0) {
            bundle.putInt("android:support:next_request_index", this.l);
            int[] iArr = new int[this.m.b()];
            String[] strArr = new String[this.m.b()];
            for (int i2 = 0; i2 < this.m.b(); i2++) {
                iArr[i2] = this.m.b(i2);
                strArr[i2] = this.m.d(i2);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    public void onStart() {
        super.onStart();
        this.k = false;
        if (!this.i) {
            this.i = true;
            j jVar = this.g.f361a.f;
            jVar.u = false;
            jVar.v = false;
            jVar.a(2);
        }
        this.g.a();
        this.g.f361a.f.g();
        this.h.a(e.a.ON_START);
        j jVar2 = this.g.f361a.f;
        jVar2.u = false;
        jVar2.v = false;
        jVar2.a(3);
    }

    public void onStateNotSaved() {
        this.g.a();
    }

    public void onStop() {
        super.onStop();
        this.k = true;
        do {
        } while (a(this.g.f361a.f, e.b.CREATED));
        j jVar = this.g.f361a.f;
        jVar.v = true;
        jVar.a(2);
        this.h.a(e.a.ON_STOP);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        if (i2 != -1) {
            a(i2);
        }
        super.startActivityForResult(intent, i2);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (i2 != -1) {
            a(i2);
        }
        super.startActivityForResult(intent, i2, bundle);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        if (i2 != -1) {
            a(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        if (i2 != -1) {
            a(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.g.f361a.f.onCreateView((View) null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
