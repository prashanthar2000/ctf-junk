class inal implements java.lang.Runnable {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/arch/lifecycle/LiveData; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final android.arch.lifecycle.LiveData a; //synthetic
/* # direct methods */
 inal ( ) {
/* .locals 0 */
this.a = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public final void run ( ) {
/* .locals 4 */
v0 = this.a;
android.arch.lifecycle.LiveData .a ( v0 );
/* monitor-enter v0 */
try { // :try_start_0
	 v1 = this.a;
	 android.arch.lifecycle.LiveData .b ( v1 );
	 v2 = this.a;
	 android.arch.lifecycle.LiveData .a ( );
	 android.arch.lifecycle.LiveData .a ( v2,v3 );
	 /* monitor-exit v0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 v0 = this.a;
	 (( android.arch.lifecycle.LiveData ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Landroid/arch/lifecycle/LiveData;->a(Ljava/lang/Object;)V
	 return;
	 /* :catchall_0 */
	 /* move-exception v1 */
	 try { // :try_start_1
		 /* monitor-exit v0 */
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 /* throw v1 */
	 } // .end method
