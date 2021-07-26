public class android.arch.lifecycle.ReflectiveGenericLifecycleObserver implements android.arch.lifecycle.GenericLifecycleObserver {
	 /* # interfaces */
	 /* # instance fields */
	 private final f$a a;
	 private final java.lang.Object a;
	 /* # direct methods */
	 public android.arch.lifecycle.ReflectiveGenericLifecycleObserver ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.a = p1;
		 p1 = f.a;
		 v0 = this.a;
		 (( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 (( f ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lf;->a(Ljava/lang/Class;)Lf$a;
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( j p0, h$a p1 ) {
		 /* .locals 3 */
		 v0 = this.a;
		 v1 = this.a;
		 v2 = this.a;
		 /* check-cast v2, Ljava/util/List; */
		 f$a .a ( v2,p1,p2,v1 );
		 v0 = this.a;
		 v2 = h$a.ON_ANY;
		 /* check-cast v0, Ljava/util/List; */
		 f$a .a ( v0,p1,p2,v1 );
		 return;
	 } // .end method
