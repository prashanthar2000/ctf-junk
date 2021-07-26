public class a extends c {
	 /* # static fields */
	 private static volatile a a;
	 private static final java.util.concurrent.Executor a;
	 private static final java.util.concurrent.Executor b;
	 /* # instance fields */
	 public c a;
	 private c b;
	 /* # direct methods */
	 static a ( ) {
		 /* .locals 1 */
		 /* new-instance v0, La$1; */
		 /* invoke-direct {v0}, La$1;-><init>()V */
		 /* new-instance v0, La$2; */
		 /* invoke-direct {v0}, La$2;-><init>()V */
		 return;
	 } // .end method
	 private a ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Lc;-><init>()V */
		 /* new-instance v0, Lb; */
		 /* invoke-direct {v0}, Lb;-><init>()V */
		 this.b = v0;
		 v0 = this.b;
		 this.a = v0;
		 return;
	 } // .end method
	 public static a a ( ) {
		 /* .locals 2 */
		 v0 = a.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = a.a;
		 } // :cond_0
		 /* const-class v0, La; */
		 /* monitor-enter v0 */
		 try { // :try_start_0
			 v1 = a.a;
			 /* if-nez v1, :cond_1 */
			 /* new-instance v1, La; */
			 /* invoke-direct {v1}, La;-><init>()V */
		 } // :cond_1
		 /* monitor-exit v0 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 v0 = a.a;
		 /* :catchall_0 */
		 /* move-exception v1 */
		 try { // :try_start_1
			 /* monitor-exit v0 */
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 /* throw v1 */
		 } // .end method
		 /* # virtual methods */
		 public final void a ( java.lang.Runnable p0 ) {
			 /* .locals 1 */
			 v0 = this.a;
			 (( c ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc;->a(Ljava/lang/Runnable;)V
			 return;
		 } // .end method
		 public final Boolean a ( ) {
			 /* .locals 1 */
			 v0 = this.a;
			 v0 = 			 (( c ) v0 ).a ( ); // invoke-virtual {v0}, Lc;->a()Z
		 } // .end method
		 public final void b ( java.lang.Runnable p0 ) {
			 /* .locals 1 */
			 v0 = this.a;
			 (( c ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc;->b(Ljava/lang/Runnable;)V
			 return;
		 } // .end method
