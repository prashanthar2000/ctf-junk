public abstract class fm extends ff {
	 /* # instance fields */
	 private android.view.LayoutInflater a;
	 private Integer b;
	 private Integer c;
	 /* # direct methods */
	 public fm ( ) {
		 /* .locals 0 */
		 /* .annotation runtime Ljava/lang/Deprecated; */
	 } // .end annotation
	 /* invoke-direct {p0, p1}, Lff;-><init>(Landroid/content/Context;)V */
	 /* iput p2, p0, Lfm;->c:I */
	 /* iput p2, p0, Lfm;->b:I */
	 final String p2 = "layout_inflater"; // const-string p2, "layout_inflater"
	 (( android.content.Context ) p1 ).getSystemService ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
	 /* check-cast p1, Landroid/view/LayoutInflater; */
	 this.a = p1;
	 return;
} // .end method
/* # virtual methods */
public android.view.View a ( android.content.Context p0, android.database.Cursor p1, android.view.ViewGroup p2 ) {
	 /* .locals 1 */
	 p1 = this.a;
	 /* iget p2, p0, Lfm;->b:I */
	 int v0 = 0; // const/4 v0, 0x0
	 (( android.view.LayoutInflater ) p1 ).inflate ( p2, p3, v0 ); // invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
} // .end method
public final android.view.View b ( android.content.Context p0, android.database.Cursor p1, android.view.ViewGroup p2 ) {
	 /* .locals 1 */
	 p1 = this.a;
	 /* iget p2, p0, Lfm;->c:I */
	 int v0 = 0; // const/4 v0, 0x0
	 (( android.view.LayoutInflater ) p1 ).inflate ( p2, p3, v0 ); // invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
} // .end method
