public class android.support.v7.widget.AppCompatRatingBar extends android.widget.RatingBar {
	 /* # instance fields */
	 private final hx a;
	 /* # direct methods */
	 public android.support.v7.widget.AppCompatRatingBar ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/AppCompatRatingBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.AppCompatRatingBar ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/AppCompatRatingBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.AppCompatRatingBar ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/RatingBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* new-instance p1, Lhx; */
		 /* invoke-direct {p1, p0}, Lhx;-><init>(Landroid/widget/ProgressBar;)V */
		 this.a = p1;
		 p1 = this.a;
		 (( hx ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lhx;->a(Landroid/util/AttributeSet;I)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected synchronized void onMeasure ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 /* monitor-enter p0 */
		 try { // :try_start_0
			 /* invoke-super {p0, p1, p2}, Landroid/widget/RatingBar;->onMeasure(II)V */
			 p2 = this.a;
			 p2 = this.a;
			 if ( p2 != null) { // if-eqz p2, :cond_0
				 p2 = 				 (( android.graphics.Bitmap ) p2 ).getWidth ( ); // invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I
				 v0 = 				 (( android.support.v7.widget.AppCompatRatingBar ) p0 ).getNumStars ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AppCompatRatingBar;->getNumStars()I
				 /* mul-int p2, p2, v0 */
				 int v0 = 0; // const/4 v0, 0x0
				 p1 = 				 android.view.View .resolveSizeAndState ( p2,p1,v0 );
				 p2 = 				 (( android.support.v7.widget.AppCompatRatingBar ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AppCompatRatingBar;->getMeasuredHeight()I
				 (( android.support.v7.widget.AppCompatRatingBar ) p0 ).setMeasuredDimension ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/support/v7/widget/AppCompatRatingBar;->setMeasuredDimension(II)V
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 } // :cond_0
			 /* monitor-exit p0 */
			 return;
			 /* :catchall_0 */
			 /* move-exception p1 */
			 /* monitor-exit p0 */
			 /* throw p1 */
		 } // .end method
