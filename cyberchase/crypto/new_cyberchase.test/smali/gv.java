public class gv {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.lang.Object a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "TT;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
 gv ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)V" */
/* } */
} // .end annotation
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
if ( p1 != null) { // if-eqz p1, :cond_0
this.a = p1;
return;
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "Wrapped Object can not be null."; // const-string v0, "Wrapped Object can not be null."
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
