public class android.arch.lifecycle.FullLifecycleObserverAdapter implements android.arch.lifecycle.GenericLifecycleObserver {
	 /* # interfaces */
	 /* # instance fields */
	 private final android.arch.lifecycle.FullLifecycleObserver a;
	 /* # direct methods */
	 public android.arch.lifecycle.FullLifecycleObserverAdapter ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( j p0, h$a p1 ) {
		 /* .locals 0 */
		 p1 = android.arch.lifecycle.FullLifecycleObserverAdapter$1.a;
		 p2 = 		 (( h$a ) p2 ).ordinal ( ); // invoke-virtual {p2}, Lh$a;->ordinal()I
		 /* aget p1, p1, p2 */
		 /* packed-switch p1, :pswitch_data_0 */
		 return;
		 /* :pswitch_0 */
		 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
		 final String p2 = "ON_ANY must not been send by anybody"; // const-string p2, "ON_ANY must not been send by anybody"
		 /* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
		 /* :pswitch_1 */
		 return;
		 /* nop */
		 /* :pswitch_data_0 */
		 /* .packed-switch 0x1 */
		 /* :pswitch_1 */
		 /* :pswitch_1 */
		 /* :pswitch_1 */
		 /* :pswitch_1 */
		 /* :pswitch_1 */
		 /* :pswitch_1 */
		 /* :pswitch_0 */
	 } // .end packed-switch
} // .end method
