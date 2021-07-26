public abstract class dw implements android.os.Parcelable {
	 /* # interfaces */
	 /* # static fields */
	 public static final android.os.Parcelable$Creator CREATOR;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/os/Parcelable$Creator<", */
	 /* "Ldw;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static final dw a;
/* # instance fields */
public final android.os.Parcelable a;
/* # direct methods */
static dw ( ) {
/* .locals 1 */
/* new-instance v0, Ldw$1; */
/* invoke-direct {v0}, Ldw$1;-><init>()V */
/* new-instance v0, Ldw$2; */
/* invoke-direct {v0}, Ldw$2;-><init>()V */
return;
} // .end method
private dw ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
return;
} // .end method
 dw ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Ldw;-><init>()V */
return;
} // .end method
protected dw ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
(( android.os.Parcel ) p1 ).readParcelable ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
p1 = dw.a;
} // :goto_0
this.a = p1;
return;
} // .end method
protected dw ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
if ( p1 != null) { // if-eqz p1, :cond_1
v0 = dw.a;
/* if-eq p1, v0, :cond_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
this.a = p1;
return;
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "superState must not be null"; // const-string v0, "superState must not be null"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
/* # virtual methods */
public Integer describeContents ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 1 */
v0 = this.a;
(( android.os.Parcel ) p1 ).writeParcelable ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V
return;
} // .end method
