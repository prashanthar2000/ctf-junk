package a.i.a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<p> f381b;
    public ArrayList<String> c;
    public b[] d;
    public String e = null;
    public int f;

    public static class a implements Parcelable.Creator<n> {
        public Object createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        public Object[] newArray(int i) {
            return new n[i];
        }
    }

    public n() {
    }

    public n(Parcel parcel) {
        this.f381b = parcel.createTypedArrayList(p.CREATOR);
        this.c = parcel.createStringArrayList();
        this.d = (b[]) parcel.createTypedArray(b.CREATOR);
        this.e = parcel.readString();
        this.f = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f381b);
        parcel.writeStringList(this.c);
        parcel.writeTypedArray(this.d, i);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
    }
}
