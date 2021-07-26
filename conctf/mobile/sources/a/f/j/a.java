package a.f.j;

import android.util.Log;
import java.io.Writer;

public class a extends Writer {

    /* renamed from: b  reason: collision with root package name */
    public final String f311b;
    public StringBuilder c = new StringBuilder(128);

    public a(String str) {
        this.f311b = str;
    }

    public final void a() {
        if (this.c.length() > 0) {
            Log.d(this.f311b, this.c.toString());
            StringBuilder sb = this.c;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        a();
    }

    public void flush() {
        a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == 10) {
                a();
            } else {
                this.c.append(c2);
            }
        }
    }
}
