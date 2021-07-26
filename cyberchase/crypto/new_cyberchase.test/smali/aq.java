public class aq extends am {
	 /* # instance fields */
	 protected Integer B;
	 protected am c;
	 /* # direct methods */
	 public aq ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Lam;-><init>()V */
		 int v0 = 4; // const/4 v0, 0x4
		 /* new-array v0, v0, [Lam; */
		 this.c = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Laq;->B:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( am p0 ) {
		 /* .locals 3 */
		 /* iget v0, p0, Laq;->B:I */
		 /* add-int/lit8 v0, v0, 0x1 */
		 v1 = this.c;
		 /* array-length v2, v1 */
		 /* if-le v0, v2, :cond_0 */
		 /* array-length v0, v1 */
		 /* mul-int/lit8 v0, v0, 0x2 */
		 java.util.Arrays .copyOf ( v1,v0 );
		 /* check-cast v0, [Lam; */
		 this.c = v0;
	 } // :cond_0
	 v0 = this.c;
	 /* iget v1, p0, Laq;->B:I */
	 /* aput-object p1, v0, v1 */
	 /* add-int/lit8 v1, v1, 0x1 */
	 /* iput v1, p0, Laq;->B:I */
	 return;
} // .end method
public final void h ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput v0, p0, Laq;->B:I */
	 return;
} // .end method
