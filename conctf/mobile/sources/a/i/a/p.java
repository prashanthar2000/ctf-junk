package a.i.a;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

@SuppressLint({"BanParcelableUsage"})
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f383b;
    public final String c;
    public final boolean d;
    public final int e;
    public final int f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final Bundle k;
    public final boolean l;
    public final int m;
    public Bundle n;
    public Fragment o;

    public static class a implements Parcelable.Creator<p> {
        public Object createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        public Object[] newArray(int i) {
            return new p[i];
        }
    }

    public p(Parcel parcel) {
        this.f383b = parcel.readString();
        this.c = parcel.readString();
        boolean z = true;
        this.d = parcel.readInt() != 0;
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readBundle();
        this.l = parcel.readInt() == 0 ? false : z;
        this.n = parcel.readBundle();
        this.m = parcel.readInt();
    }

    public p(Fragment fragment) {
        this.f383b = fragment.getClass().getName();
        this.c = fragment.f;
        this.d = fragment.n;
        this.e = fragment.w;
        this.f = fragment.x;
        this.g = fragment.y;
        this.h = fragment.B;
        this.i = fragment.m;
        this.j = fragment.A;
        this.k = fragment.g;
        this.l = fragment.z;
        this.m = fragment.R.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f383b);
        sb.append(" (");
        sb.append(this.c);
        sb.append(")}:");
        if (this.d) {
            sb.append(" fromLayout");
        }
        if (this.f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f));
        }
        String str = this.g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.g);
        }
        if (this.h) {
            sb.append(" retainInstance");
        }
        if (this.i) {
            sb.append(" removing");
        }
        if (this.j) {
            sb.append(" detached");
        }
        if (this.l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f383b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeBundle(this.n);
        parcel.writeInt(this.m);
    }
}
