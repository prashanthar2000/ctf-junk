public abstract class ek {
	 /* # instance fields */
	 private final android.database.DataSetObservable a;
	 private android.database.DataSetObserver a;
	 /* # direct methods */
	 public ek ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Landroid/database/DataSetObservable; */
		 /* invoke-direct {v0}, Landroid/database/DataSetObservable;-><init>()V */
		 this.a = v0;
		 return;
	 } // .end method
	 public static void a ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Ljava/lang/UnsupportedOperationException; */
		 final String v1 = "Required method destroyItem was not overridden"; // const-string v1, "Required method destroyItem was not overridden"
		 /* invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // .end method
	 /* # virtual methods */
	 public abstract Integer a ( ) {
	 } // .end method
	 public final void a ( android.database.DataSetObserver p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.database.DataSetObservable ) v0 ).registerObserver ( p1 ); // invoke-virtual {v0, p1}, Landroid/database/DataSetObservable;->registerObserver(Ljava/lang/Object;)V
		 return;
	 } // .end method
	 public abstract Boolean a ( ) {
	 } // .end method
	 public final void b ( android.database.DataSetObserver p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.database.DataSetObservable ) v0 ).unregisterObserver ( p1 ); // invoke-virtual {v0, p1}, Landroid/database/DataSetObservable;->unregisterObserver(Ljava/lang/Object;)V
		 return;
	 } // .end method
	 public final void c ( android.database.DataSetObserver p0 ) {
		 /* .locals 0 */
		 /* monitor-enter p0 */
		 try { // :try_start_0
			 this.a = p1;
			 /* monitor-exit p0 */
			 return;
			 /* :catchall_0 */
			 /* move-exception p1 */
			 /* monitor-exit p0 */
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* throw p1 */
		 } // .end method
