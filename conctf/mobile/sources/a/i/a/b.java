package a.i.a;

import a.i.a.q;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final int[] f356b;
    public final ArrayList<String> c;
    public final int[] d;
    public final int[] e;
    public final int f;
    public final int g;
    public final String h;
    public final int i;
    public final int j;
    public final CharSequence k;
    public final int l;
    public final CharSequence m;
    public final ArrayList<String> n;
    public final ArrayList<String> o;
    public final boolean p;

    public static class a implements Parcelable.Creator<b> {
        public Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public Object[] newArray(int i) {
            return new b[i];
        }
    }

    public b(a aVar) {
        int size = aVar.f384a.size();
        this.f356b = new int[(size * 5)];
        if (aVar.h) {
            this.c = new ArrayList<>(size);
            this.d = new int[size];
            this.e = new int[size];
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                q.a aVar2 = aVar.f384a.get(i2);
                int i4 = i3 + 1;
                this.f356b[i3] = aVar2.f386a;
                ArrayList<String> arrayList = this.c;
                Fragment fragment = aVar2.f387b;
                arrayList.add(fragment != null ? fragment.f : null);
                int[] iArr = this.f356b;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.c;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.d;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.e;
                iArr[i7] = aVar2.f;
                this.d[i2] = aVar2.g.ordinal();
                this.e[i2] = aVar2.h.ordinal();
                i2++;
                i3 = i7 + 1;
            }
            this.f = aVar.f;
            this.g = aVar.g;
            this.h = aVar.i;
            this.i = aVar.s;
            this.j = aVar.j;
            this.k = aVar.k;
            this.l = aVar.l;
            this.m = aVar.m;
            this.n = aVar.n;
            this.o = aVar.o;
            this.p = aVar.p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public b(Parcel parcel) {
        this.f356b = parcel.createIntArray();
        this.c = parcel.createStringArrayList();
        this.d = parcel.createIntArray();
        this.e = parcel.createIntArray();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.readInt();
        this.m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.n = parcel.createStringArrayList();
        this.o = parcel.createStringArrayList();
        this.p = parcel.readInt() != 0;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f356b);
        parcel.writeStringList(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeIntArray(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeInt(this.l);
        TextUtils.writeToParcel(this.m, parcel, 0);
        parcel.writeStringList(this.n);
        parcel.writeStringList(this.o);
        parcel.writeInt(this.p ? 1 : 0);
    }
}
