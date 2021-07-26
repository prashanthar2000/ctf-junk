public abstract class bo extends bm {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<E:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Lbm;" */
	 /* } */
} // .end annotation
/* # instance fields */
private final Integer a;
final android.app.Activity a;
final android.content.Context a;
final android.os.Handler a;
public final bq a;
/* # direct methods */
private bo ( ) {
	 /* .locals 1 */
	 /* invoke-direct {p0}, Lbm;-><init>()V */
	 /* new-instance v0, Lbq; */
	 /* invoke-direct {v0}, Lbq;-><init>()V */
	 this.a = v0;
	 this.a = p1;
	 final String p1 = "context == null"; // const-string p1, "context == null"
	 dt .a ( p2,p1 );
	 /* check-cast p1, Landroid/content/Context; */
	 this.a = p1;
	 final String p1 = "handler == null"; // const-string p1, "handler == null"
	 dt .a ( p3,p1 );
	 /* check-cast p1, Landroid/os/Handler; */
	 this.a = p1;
	 int p1 = 0; // const/4 p1, 0x0
	 /* iput p1, p0, Lbo;->a:I */
	 return;
} // .end method
protected bo ( ) {
	 /* .locals 1 */
	 v0 = this.a;
	 /* invoke-direct {p0, p1, p1, v0}, Lbo;-><init>(Landroid/app/Activity;Landroid/content/Context;Landroid/os/Handler;)V */
	 return;
} // .end method
/* # virtual methods */
public Integer a ( ) {
	 /* .locals 1 */
	 /* iget v0, p0, Lbo;->a:I */
} // .end method
public android.view.LayoutInflater a ( ) {
	 /* .locals 1 */
	 v0 = this.a;
	 android.view.LayoutInflater .from ( v0 );
} // .end method
public android.view.View a ( Integer p0 ) {
	 /* .locals 0 */
	 int p1 = 0; // const/4 p1, 0x0
} // .end method
public void a ( ) {
	 /* .locals 0 */
	 return;
} // .end method
public void a ( java.lang.String p0, java.io.PrintWriter p1, java.lang.String[] p2 ) {
	 /* .locals 0 */
	 return;
} // .end method
public Boolean a ( ) {
	 /* .locals 1 */
	 int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean b ( ) {
	 /* .locals 1 */
	 int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean c ( ) {
	 /* .locals 1 */
	 int v0 = 1; // const/4 v0, 0x1
} // .end method
