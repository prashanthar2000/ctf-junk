public class android.support.v7.widget.FitWindowsFrameLayout extends android.widget.FrameLayout implements if {
	 /* # interfaces */
	 /* # instance fields */
	 private if$a a;
	 /* # direct methods */
	 public android.support.v7.widget.FitWindowsFrameLayout ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.FitWindowsFrameLayout ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected Boolean fitSystemWindows ( android.graphics.Rect p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 } // :cond_0
		 p1 = 		 /* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->fitSystemWindows(Landroid/graphics/Rect;)Z */
	 } // .end method
	 public void setOnFitSystemWindowsListener ( if$a p0 ) {
		 /* .locals 0 */
		 this.a = p1;
		 return;
	 } // .end method
