public class android.support.v7.widget.ButtonBarLayout extends android.widget.LinearLayout {
	 /* # instance fields */
	 private Integer a;
	 private Boolean a;
	 private Integer b;
	 /* # direct methods */
	 public android.support.v7.widget.ButtonBarLayout ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Landroid/support/v7/widget/ButtonBarLayout;->a:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Landroid/support/v7/widget/ButtonBarLayout;->b:I */
		 v0 = gc$j.ButtonBarLayout;
		 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
		 int v0 = 1; // const/4 v0, 0x1
		 p2 = 		 (( android.content.res.TypedArray ) p1 ).getBoolean ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
		 /* iput-boolean p2, p0, Landroid/support/v7/widget/ButtonBarLayout;->a:Z */
		 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
		 return;
	 } // .end method
	 private Integer a ( Integer p0 ) {
		 /* .locals 2 */
		 v0 = 		 (( android.support.v7.widget.ButtonBarLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ButtonBarLayout;->getChildCount()I
	 } // :goto_0
	 /* if-ge p1, v0, :cond_1 */
	 (( android.support.v7.widget.ButtonBarLayout ) p0 ).getChildAt ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/ButtonBarLayout;->getChildAt(I)Landroid/view/View;
	 v1 = 	 (( android.view.View ) v1 ).getVisibility ( ); // invoke-virtual {v1}, Landroid/view/View;->getVisibility()I
	 /* if-nez v1, :cond_0 */
} // :cond_0
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_1
int p1 = -1; // const/4 p1, -0x1
} // .end method
private Boolean a ( ) {
/* .locals 2 */
v0 = (( android.support.v7.widget.ButtonBarLayout ) p0 ).getOrientation ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ButtonBarLayout;->getOrientation()I
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
private void setStacked ( Boolean p0 ) {
/* .locals 1 */
(( android.support.v7.widget.ButtonBarLayout ) p0 ).setOrientation ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/ButtonBarLayout;->setOrientation(I)V
if ( p1 != null) { // if-eqz p1, :cond_0
int v0 = 5; // const/4 v0, 0x5
} // :cond_0
/* const/16 v0, 0x50 */
} // :goto_0
(( android.support.v7.widget.ButtonBarLayout ) p0 ).setGravity ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ButtonBarLayout;->setGravity(I)V
(( android.support.v7.widget.ButtonBarLayout ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ButtonBarLayout;->findViewById(I)Landroid/view/View;
if ( v0 != null) { // if-eqz v0, :cond_2
if ( p1 != null) { // if-eqz p1, :cond_1
/* const/16 p1, 0x8 */
} // :cond_1
int p1 = 4; // const/4 p1, 0x4
} // :goto_1
(( android.view.View ) v0 ).setVisibility ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V
} // :cond_2
p1 = (( android.support.v7.widget.ButtonBarLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ButtonBarLayout;->getChildCount()I
/* add-int/lit8 p1, p1, -0x2 */
} // :goto_2
/* if-ltz p1, :cond_3 */
(( android.support.v7.widget.ButtonBarLayout ) p0 ).getChildAt ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/ButtonBarLayout;->getChildAt(I)Landroid/view/View;
(( android.support.v7.widget.ButtonBarLayout ) p0 ).bringChildToFront ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ButtonBarLayout;->bringChildToFront(Landroid/view/View;)V
/* add-int/lit8 p1, p1, -0x1 */
} // :cond_3
return;
} // .end method
/* # virtual methods */
public Integer getMinimumHeight ( ) {
/* .locals 2 */
/* iget v0, p0, Landroid/support/v7/widget/ButtonBarLayout;->b:I */
v1 = /* invoke-super {p0}, Landroid/widget/LinearLayout;->getMinimumHeight()I */
v0 = java.lang.Math .max ( v0,v1 );
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 5 */
v0 = android.view.View$MeasureSpec .getSize ( p1 );
/* iget-boolean v1, p0, Landroid/support/v7/widget/ButtonBarLayout;->a:Z */
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_1
/* iget v1, p0, Landroid/support/v7/widget/ButtonBarLayout;->a:I */
/* if-le v0, v1, :cond_0 */
v1 = /* invoke-direct {p0}, Landroid/support/v7/widget/ButtonBarLayout;->a()Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* invoke-direct {p0, v2}, Landroid/support/v7/widget/ButtonBarLayout;->setStacked(Z)V */
} // :cond_0
/* iput v0, p0, Landroid/support/v7/widget/ButtonBarLayout;->a:I */
} // :cond_1
v1 = /* invoke-direct {p0}, Landroid/support/v7/widget/ButtonBarLayout;->a()Z */
int v3 = 1; // const/4 v3, 0x1
/* if-nez v1, :cond_2 */
v1 = android.view.View$MeasureSpec .getMode ( p1 );
/* const/high16 v4, 0x40000000 # 2.0f */
/* if-ne v1, v4, :cond_2 */
/* const/high16 v1, -0x80000000 */
v0 = android.view.View$MeasureSpec .makeMeasureSpec ( v0,v1 );
int v1 = 1; // const/4 v1, 0x1
} // :cond_2
/* move v0, p1 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* invoke-super {p0, v0, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V */
/* iget-boolean v0, p0, Landroid/support/v7/widget/ButtonBarLayout;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = /* invoke-direct {p0}, Landroid/support/v7/widget/ButtonBarLayout;->a()Z */
/* if-nez v0, :cond_4 */
v0 = (( android.support.v7.widget.ButtonBarLayout ) p0 ).getMeasuredWidthAndState ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ButtonBarLayout;->getMeasuredWidthAndState()I
/* const/high16 v4, -0x1000000 */
/* and-int/2addr v0, v4 */
/* const/high16 v4, 0x1000000 */
/* if-ne v0, v4, :cond_3 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_4
/* invoke-direct {p0, v3}, Landroid/support/v7/widget/ButtonBarLayout;->setStacked(Z)V */
int v1 = 1; // const/4 v1, 0x1
} // :cond_4
if ( v1 != null) { // if-eqz v1, :cond_5
/* invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V */
} // :cond_5
p1 = /* invoke-direct {p0, v2}, Landroid/support/v7/widget/ButtonBarLayout;->a(I)I */
/* if-ltz p1, :cond_8 */
(( android.support.v7.widget.ButtonBarLayout ) p0 ).getChildAt ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/ButtonBarLayout;->getChildAt(I)Landroid/view/View;
(( android.view.View ) p2 ).getLayoutParams ( ); // invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/widget/LinearLayout$LayoutParams; */
v1 = (( android.support.v7.widget.ButtonBarLayout ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ButtonBarLayout;->getPaddingTop()I
p2 = (( android.view.View ) p2 ).getMeasuredHeight ( ); // invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v1, p2 */
/* iget p2, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v1, p2 */
/* iget p2, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v1, p2 */
/* add-int/2addr v1, v2 */
p2 = /* invoke-direct {p0}, Landroid/support/v7/widget/ButtonBarLayout;->a()Z */
if ( p2 != null) { // if-eqz p2, :cond_7
/* add-int/2addr p1, v3 */
p1 = /* invoke-direct {p0, p1}, Landroid/support/v7/widget/ButtonBarLayout;->a(I)I */
/* if-ltz p1, :cond_6 */
(( android.support.v7.widget.ButtonBarLayout ) p0 ).getChildAt ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/ButtonBarLayout;->getChildAt(I)Landroid/view/View;
p1 = (( android.view.View ) p1 ).getPaddingTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I
/* const/high16 p2, 0x41800000 # 16.0f */
(( android.support.v7.widget.ButtonBarLayout ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ButtonBarLayout;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget v0, v0, Landroid/util/DisplayMetrics;->density:F */
/* mul-float v0, v0, p2 */
/* float-to-int p2, v0 */
/* add-int/2addr p1, p2 */
/* add-int/2addr v1, p1 */
} // :cond_6
/* move v2, v1 */
} // :cond_7
p1 = (( android.support.v7.widget.ButtonBarLayout ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ButtonBarLayout;->getPaddingBottom()I
/* add-int v2, v1, p1 */
} // :cond_8
} // :goto_2
p1 = em .c ( p0 );
/* if-eq p1, v2, :cond_9 */
(( android.support.v7.widget.ButtonBarLayout ) p0 ).setMinimumHeight ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/v7/widget/ButtonBarLayout;->setMinimumHeight(I)V
} // :cond_9
return;
} // .end method
public void setAllowStacking ( Boolean p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Landroid/support/v7/widget/ButtonBarLayout;->a:Z */
/* if-eq v0, p1, :cond_1 */
/* iput-boolean p1, p0, Landroid/support/v7/widget/ButtonBarLayout;->a:Z */
/* iget-boolean p1, p0, Landroid/support/v7/widget/ButtonBarLayout;->a:Z */
/* if-nez p1, :cond_0 */
p1 = (( android.support.v7.widget.ButtonBarLayout ) p0 ).getOrientation ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ButtonBarLayout;->getOrientation()I
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* invoke-direct {p0, p1}, Landroid/support/v7/widget/ButtonBarLayout;->setStacked(Z)V */
} // :cond_0
(( android.support.v7.widget.ButtonBarLayout ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ButtonBarLayout;->requestLayout()V
} // :cond_1
return;
} // .end method
