public class android.support.v4.widget.ContentLoadingProgressBar extends android.widget.ProgressBar {
	 /* # instance fields */
	 Long a;
	 private final java.lang.Runnable a;
	 Boolean a;
	 private final java.lang.Runnable b;
	 Boolean b;
	 Boolean c;
	 /* # direct methods */
	 public android.support.v4.widget.ContentLoadingProgressBar ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0}, Landroid/support/v4/widget/ContentLoadingProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public android.support.v4.widget.ContentLoadingProgressBar ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, p2, v0}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* const-wide/16 p1, -0x1 */
		 /* iput-wide p1, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->a:J */
		 /* iput-boolean v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->a:Z */
		 /* iput-boolean v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->b:Z */
		 /* iput-boolean v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->c:Z */
		 /* new-instance p1, Landroid/support/v4/widget/ContentLoadingProgressBar$1; */
		 /* invoke-direct {p1, p0}, Landroid/support/v4/widget/ContentLoadingProgressBar$1;-><init>(Landroid/support/v4/widget/ContentLoadingProgressBar;)V */
		 this.a = p1;
		 /* new-instance p1, Landroid/support/v4/widget/ContentLoadingProgressBar$2; */
		 /* invoke-direct {p1, p0}, Landroid/support/v4/widget/ContentLoadingProgressBar$2;-><init>(Landroid/support/v4/widget/ContentLoadingProgressBar;)V */
		 this.b = p1;
		 return;
	 } // .end method
	 private void a ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.support.v4.widget.ContentLoadingProgressBar ) p0 ).removeCallbacks ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/ContentLoadingProgressBar;->removeCallbacks(Ljava/lang/Runnable;)Z
		 v0 = this.b;
		 (( android.support.v4.widget.ContentLoadingProgressBar ) p0 ).removeCallbacks ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/ContentLoadingProgressBar;->removeCallbacks(Ljava/lang/Runnable;)Z
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onAttachedToWindow ( ) {
		 /* .locals 0 */
		 /* invoke-super {p0}, Landroid/widget/ProgressBar;->onAttachedToWindow()V */
		 /* invoke-direct {p0}, Landroid/support/v4/widget/ContentLoadingProgressBar;->a()V */
		 return;
	 } // .end method
	 public void onDetachedFromWindow ( ) {
		 /* .locals 0 */
		 /* invoke-super {p0}, Landroid/widget/ProgressBar;->onDetachedFromWindow()V */
		 /* invoke-direct {p0}, Landroid/support/v4/widget/ContentLoadingProgressBar;->a()V */
		 return;
	 } // .end method
