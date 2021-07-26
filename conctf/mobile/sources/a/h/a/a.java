package a.h.a;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();
    public static final a c = new C0021a();

    /* renamed from: b  reason: collision with root package name */
    public final Parcelable f354b;

    /* renamed from: a.h.a.a$a  reason: collision with other inner class name */
    public static class C0021a extends a {
        public C0021a() {
            super((C0021a) null);
        }
    }

    public static class b implements Parcelable.ClassLoaderCreator<a> {
        public Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable((ClassLoader) null) == null) {
                return a.c;
            }
            throw new IllegalStateException("superState must be null");
        }

        public Object[] newArray(int i) {
            return new a[i];
        }

        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.c;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public /* synthetic */ a(C0021a aVar) {
        this.f354b = null;
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f354b = readParcelable == null ? c : readParcelable;
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f354b = parcelable == c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f354b, i);
    }
}
