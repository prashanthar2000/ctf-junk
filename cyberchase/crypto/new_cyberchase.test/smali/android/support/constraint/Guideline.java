public class android.support.constraint.Guideline extends android.view.View {
	 /* # direct methods */
	 public android.support.constraint.Guideline ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V */
		 /* const/16 p1, 0x8 */
		 /* invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V */
		 return;
	 } // .end method
	 public android.support.constraint.Guideline ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* const/16 p1, 0x8 */
		 /* invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V */
		 return;
	 } // .end method
	 public android.support.constraint.Guideline ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* const/16 p1, 0x8 */
		 /* invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void draw ( android.graphics.Canvas p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 protected void onMeasure ( Integer p0, Integer p1 ) {
		 /* .locals 0 */
		 int p1 = 0; // const/4 p1, 0x0
		 (( android.support.constraint.Guideline ) p0 ).setMeasuredDimension ( p1, p1 ); // invoke-virtual {p0, p1, p1}, Landroid/support/constraint/Guideline;->setMeasuredDimension(II)V
		 return;
	 } // .end method
	 public void setGuidelineBegin ( Integer p0 ) {
		 /* .locals 1 */
		 (( android.support.constraint.Guideline ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/support/constraint/Guideline;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
		 /* check-cast v0, Landroid/support/constraint/ConstraintLayout$LayoutParams; */
		 /* iput p1, v0, Landroid/support/constraint/ConstraintLayout$LayoutParams;->a:I */
		 (( android.support.constraint.Guideline ) p0 ).setLayoutParams ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/constraint/Guideline;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
		 return;
	 } // .end method
	 public void setGuidelineEnd ( Integer p0 ) {
		 /* .locals 1 */
		 (( android.support.constraint.Guideline ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/support/constraint/Guideline;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
		 /* check-cast v0, Landroid/support/constraint/ConstraintLayout$LayoutParams; */
		 /* iput p1, v0, Landroid/support/constraint/ConstraintLayout$LayoutParams;->b:I */
		 (( android.support.constraint.Guideline ) p0 ).setLayoutParams ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/constraint/Guideline;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
		 return;
	 } // .end method
	 public void setGuidelinePercent ( Float p0 ) {
		 /* .locals 1 */
		 (( android.support.constraint.Guideline ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/support/constraint/Guideline;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
		 /* check-cast v0, Landroid/support/constraint/ConstraintLayout$LayoutParams; */
		 /* iput p1, v0, Landroid/support/constraint/ConstraintLayout$LayoutParams;->a:F */
		 (( android.support.constraint.Guideline ) p0 ).setLayoutParams ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/constraint/Guideline;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
		 return;
	 } // .end method
	 public void setVisibility ( Integer p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
