public class androidx.versionedparcelable.ParcelImpl implements android.os.Parcelable {
	 /* # interfaces */
	 /* # static fields */
	 public static final android.os.Parcelable$Creator CREATOR;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/os/Parcelable$Creator<", */
	 /* "Landroidx/versionedparcelable/ParcelImpl;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
private final iz a;
/* # direct methods */
static androidx.versionedparcelable.ParcelImpl ( ) {
/* .locals 1 */
/* new-instance v0, Landroidx/versionedparcelable/ParcelImpl$1; */
/* invoke-direct {v0}, Landroidx/versionedparcelable/ParcelImpl$1;-><init>()V */
return;
} // .end method
protected androidx.versionedparcelable.ParcelImpl ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* new-instance v0, Liy; */
/* invoke-direct {v0, p1}, Liy;-><init>(Landroid/os/Parcel;)V */
(( iy ) v0 ).a ( ); // invoke-virtual {v0}, Liy;->a()Liz;
this.a = p1;
return;
} // .end method
/* # virtual methods */
public Integer describeContents ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 0 */
/* new-instance p2, Liy; */
/* invoke-direct {p2, p1}, Liy;-><init>(Landroid/os/Parcel;)V */
p1 = this.a;
(( iy ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Liy;->a(Liz;)V
return;
} // .end method
