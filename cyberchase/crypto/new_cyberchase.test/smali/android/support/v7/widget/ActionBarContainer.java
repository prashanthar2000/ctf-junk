public class android.support.v7.widget.ActionBarContainer extends android.widget.FrameLayout {
	 /* # instance fields */
	 private Integer a;
	 public android.graphics.drawable.Drawable a;
	 private android.view.View a;
	 public Boolean a;
	 public android.graphics.drawable.Drawable b;
	 private android.view.View b;
	 public Boolean b;
	 public android.graphics.drawable.Drawable c;
	 private android.view.View c;
	 private Boolean c;
	 /* # direct methods */
	 public android.support.v7.widget.ActionBarContainer ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/ActionBarContainer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.ActionBarContainer ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* new-instance v0, Lhp; */
		 /* invoke-direct {v0, p0}, Lhp;-><init>(Landroid/support/v7/widget/ActionBarContainer;)V */
		 em .a ( p0,v0 );
		 v0 = gc$j.ActionBar;
		 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
		 (( android.content.res.TypedArray ) p1 ).getDrawable ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
		 this.a = p2;
		 (( android.content.res.TypedArray ) p1 ).getDrawable ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
		 this.b = p2;
		 int v0 = -1; // const/4 v0, -0x1
		 p2 = 		 (( android.content.res.TypedArray ) p1 ).getDimensionPixelSize ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
		 /* iput p2, p0, Landroid/support/v7/widget/ActionBarContainer;->a:I */
		 p2 = 		 (( android.support.v7.widget.ActionBarContainer ) p0 ).getId ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContainer;->getId()I
		 int v1 = 1; // const/4 v1, 0x1
		 /* if-ne p2, v0, :cond_0 */
		 /* iput-boolean v1, p0, Landroid/support/v7/widget/ActionBarContainer;->a:Z */
		 (( android.content.res.TypedArray ) p1 ).getDrawable ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
		 this.c = p2;
	 } // :cond_0
	 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
	 /* iget-boolean p1, p0, Landroid/support/v7/widget/ActionBarContainer;->a:Z */
	 int p2 = 0; // const/4 p2, 0x0
	 if ( p1 != null) { // if-eqz p1, :cond_1
		 p1 = this.c;
		 /* if-nez p1, :cond_2 */
	 } // :goto_0
	 int p2 = 1; // const/4 p2, 0x1
} // :cond_1
p1 = this.a;
/* if-nez p1, :cond_2 */
p1 = this.b;
/* if-nez p1, :cond_2 */
} // :cond_2
} // :goto_1
(( android.support.v7.widget.ActionBarContainer ) p0 ).setWillNotDraw ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/widget/ActionBarContainer;->setWillNotDraw(Z)V
return;
} // .end method
private static Integer a ( android.view.View p0 ) {
/* .locals 2 */
(( android.view.View ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/widget/FrameLayout$LayoutParams; */
p0 = (( android.view.View ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I
/* iget v1, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
/* add-int/2addr p0, v1 */
/* iget v0, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr p0, v0 */
} // .end method
private static Boolean a ( android.view.View p0 ) {
/* .locals 2 */
if ( p0 != null) { // if-eqz p0, :cond_1
v0 = (( android.view.View ) p0 ).getVisibility ( ); // invoke-virtual {p0}, Landroid/view/View;->getVisibility()I
/* const/16 v1, 0x8 */
/* if-eq v0, v1, :cond_1 */
p0 = (( android.view.View ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I
/* if-nez p0, :cond_0 */
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :cond_1
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
} // .end method
/* # virtual methods */
protected void drawableStateChanged ( ) {
/* .locals 2 */
/* invoke-super {p0}, Landroid/widget/FrameLayout;->drawableStateChanged()V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( android.graphics.drawable.Drawable ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( android.support.v7.widget.ActionBarContainer ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContainer;->getDrawableState()[I
(( android.graphics.drawable.Drawable ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
} // :cond_0
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( android.graphics.drawable.Drawable ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.b;
(( android.support.v7.widget.ActionBarContainer ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContainer;->getDrawableState()[I
(( android.graphics.drawable.Drawable ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
} // :cond_1
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = (( android.graphics.drawable.Drawable ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.c;
(( android.support.v7.widget.ActionBarContainer ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContainer;->getDrawableState()[I
(( android.graphics.drawable.Drawable ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
} // :cond_2
return;
} // .end method
public android.view.View getTabContainer ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public void jumpDrawablesToCurrentState ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/widget/FrameLayout;->jumpDrawablesToCurrentState()V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.graphics.drawable.Drawable ) v0 ).jumpToCurrentState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
} // :cond_0
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
(( android.graphics.drawable.Drawable ) v0 ).jumpToCurrentState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
} // :cond_1
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_2
(( android.graphics.drawable.Drawable ) v0 ).jumpToCurrentState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
} // :cond_2
return;
} // .end method
public void onFinishInflate ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/widget/FrameLayout;->onFinishInflate()V */
(( android.support.v7.widget.ActionBarContainer ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActionBarContainer;->findViewById(I)Landroid/view/View;
this.b = v0;
(( android.support.v7.widget.ActionBarContainer ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActionBarContainer;->findViewById(I)Landroid/view/View;
this.c = v0;
return;
} // .end method
public Boolean onHoverEvent ( android.view.MotionEvent p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onHoverEvent(Landroid/view/MotionEvent;)Z */
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean onInterceptTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Landroid/support/v7/widget/ActionBarContainer;->c:Z */
/* if-nez v0, :cond_1 */
p1 = /* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z */
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // .end method
public void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 5 */
/* invoke-super/range {p0 ..p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V */
p1 = this.a;
/* const/16 p3, 0x8 */
int p5 = 1; // const/4 p5, 0x1
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_0
v1 = (( android.view.View ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/view/View;->getVisibility()I
/* if-eq v1, p3, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
if ( p1 != null) { // if-eqz p1, :cond_1
v2 = (( android.view.View ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/view/View;->getVisibility()I
/* if-eq v2, p3, :cond_1 */
p3 = (( android.support.v7.widget.ActionBarContainer ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContainer;->getMeasuredHeight()I
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroid/widget/FrameLayout$LayoutParams; */
v3 = (( android.view.View ) p1 ).getMeasuredHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
/* sub-int v3, p3, v3 */
/* iget v4, v2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* sub-int/2addr v3, v4 */
/* iget v2, v2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* sub-int/2addr p3, v2 */
(( android.view.View ) p1 ).layout ( p2, v3, p4, p3 ); // invoke-virtual {p1, p2, v3, p4, p3}, Landroid/view/View;->layout(IIII)V
} // :cond_1
/* iget-boolean p2, p0, Landroid/support/v7/widget/ActionBarContainer;->a:Z */
if ( p2 != null) { // if-eqz p2, :cond_3
p1 = this.c;
if ( p1 != null) { // if-eqz p1, :cond_2
p2 = (( android.support.v7.widget.ActionBarContainer ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContainer;->getMeasuredWidth()I
p3 = (( android.support.v7.widget.ActionBarContainer ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContainer;->getMeasuredHeight()I
(( android.graphics.drawable.Drawable ) p1 ).setBounds ( v0, v0, p2, p3 ); // invoke-virtual {p1, v0, v0, p2, p3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* goto/16 :goto_3 */
} // :cond_2
int p5 = 0; // const/4 p5, 0x0
} // :cond_3
p2 = this.a;
if ( p2 != null) { // if-eqz p2, :cond_6
p2 = this.b;
p2 = (( android.view.View ) p2 ).getVisibility ( ); // invoke-virtual {p2}, Landroid/view/View;->getVisibility()I
/* if-nez p2, :cond_4 */
p2 = this.a;
p3 = this.b;
p3 = (( android.view.View ) p3 ).getLeft ( ); // invoke-virtual {p3}, Landroid/view/View;->getLeft()I
p4 = this.b;
p4 = (( android.view.View ) p4 ).getTop ( ); // invoke-virtual {p4}, Landroid/view/View;->getTop()I
v0 = this.b;
v0 = (( android.view.View ) v0 ).getRight ( ); // invoke-virtual {v0}, Landroid/view/View;->getRight()I
v2 = this.b;
} // :goto_1
v2 = (( android.view.View ) v2 ).getBottom ( ); // invoke-virtual {v2}, Landroid/view/View;->getBottom()I
(( android.graphics.drawable.Drawable ) p2 ).setBounds ( p3, p4, v0, v2 ); // invoke-virtual {p2, p3, p4, v0, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
} // :cond_4
p2 = this.c;
if ( p2 != null) { // if-eqz p2, :cond_5
p2 = (( android.view.View ) p2 ).getVisibility ( ); // invoke-virtual {p2}, Landroid/view/View;->getVisibility()I
/* if-nez p2, :cond_5 */
p2 = this.a;
p3 = this.c;
p3 = (( android.view.View ) p3 ).getLeft ( ); // invoke-virtual {p3}, Landroid/view/View;->getLeft()I
p4 = this.c;
p4 = (( android.view.View ) p4 ).getTop ( ); // invoke-virtual {p4}, Landroid/view/View;->getTop()I
v0 = this.c;
v0 = (( android.view.View ) v0 ).getRight ( ); // invoke-virtual {v0}, Landroid/view/View;->getRight()I
v2 = this.c;
} // :cond_5
p2 = this.a;
(( android.graphics.drawable.Drawable ) p2 ).setBounds ( v0, v0, v0, v0 ); // invoke-virtual {p2, v0, v0, v0, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
} // :goto_2
int v0 = 1; // const/4 v0, 0x1
} // :cond_6
/* iput-boolean v1, p0, Landroid/support/v7/widget/ActionBarContainer;->b:Z */
if ( v1 != null) { // if-eqz v1, :cond_7
p2 = this.b;
if ( p2 != null) { // if-eqz p2, :cond_7
p3 = (( android.view.View ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getLeft()I
p4 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
v0 = (( android.view.View ) p1 ).getRight ( ); // invoke-virtual {p1}, Landroid/view/View;->getRight()I
p1 = (( android.view.View ) p1 ).getBottom ( ); // invoke-virtual {p1}, Landroid/view/View;->getBottom()I
(( android.graphics.drawable.Drawable ) p2 ).setBounds ( p3, p4, v0, p1 ); // invoke-virtual {p2, p3, p4, v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
} // :cond_7
/* move p5, v0 */
} // :goto_3
if ( p5 != null) { // if-eqz p5, :cond_8
(( android.support.v7.widget.ActionBarContainer ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContainer;->invalidate()V
} // :cond_8
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 3 */
v0 = this.b;
/* const/high16 v1, -0x80000000 */
/* if-nez v0, :cond_0 */
v0 = android.view.View$MeasureSpec .getMode ( p2 );
/* if-ne v0, v1, :cond_0 */
/* iget v0, p0, Landroid/support/v7/widget/ActionBarContainer;->a:I */
/* if-ltz v0, :cond_0 */
p2 = android.view.View$MeasureSpec .getSize ( p2 );
p2 = java.lang.Math .min ( v0,p2 );
p2 = android.view.View$MeasureSpec .makeMeasureSpec ( p2,v1 );
} // :cond_0
/* invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V */
p1 = this.b;
/* if-nez p1, :cond_1 */
return;
} // :cond_1
p1 = android.view.View$MeasureSpec .getMode ( p2 );
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_5
v0 = (( android.view.View ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
/* const/16 v2, 0x8 */
/* if-eq v0, v2, :cond_5 */
/* const/high16 v0, 0x40000000 # 2.0f */
/* if-eq p1, v0, :cond_5 */
v0 = this.b;
v0 = android.support.v7.widget.ActionBarContainer .a ( v0 );
/* if-nez v0, :cond_2 */
v0 = this.b;
} // :goto_0
v0 = android.support.v7.widget.ActionBarContainer .a ( v0 );
} // :cond_2
v0 = this.c;
v0 = android.support.v7.widget.ActionBarContainer .a ( v0 );
/* if-nez v0, :cond_3 */
v0 = this.c;
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
/* if-ne p1, v1, :cond_4 */
p1 = android.view.View$MeasureSpec .getSize ( p2 );
} // :cond_4
/* const p1, 0x7fffffff */
} // :goto_2
p2 = (( android.support.v7.widget.ActionBarContainer ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContainer;->getMeasuredWidth()I
v1 = this.a;
v1 = android.support.v7.widget.ActionBarContainer .a ( v1 );
/* add-int/2addr v0, v1 */
p1 = java.lang.Math .min ( v0,p1 );
(( android.support.v7.widget.ActionBarContainer ) p0 ).setMeasuredDimension ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Landroid/support/v7/widget/ActionBarContainer;->setMeasuredDimension(II)V
} // :cond_5
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z */
int p1 = 1; // const/4 p1, 0x1
} // .end method
public void setPrimaryBackground ( android.graphics.drawable.Drawable p0 ) {
/* .locals 4 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 0; // const/4 v1, 0x0
(( android.graphics.drawable.Drawable ) v0 ).setCallback ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
v0 = this.a;
(( android.support.v7.widget.ActionBarContainer ) p0 ).unscheduleDrawable ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActionBarContainer;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V
} // :cond_0
this.a = p1;
if ( p1 != null) { // if-eqz p1, :cond_1
(( android.graphics.drawable.Drawable ) p1 ).setCallback ( p0 ); // invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
p1 = this.b;
if ( p1 != null) { // if-eqz p1, :cond_1
v0 = this.a;
p1 = (( android.view.View ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getLeft()I
v1 = this.b;
v1 = (( android.view.View ) v1 ).getTop ( ); // invoke-virtual {v1}, Landroid/view/View;->getTop()I
v2 = this.b;
v2 = (( android.view.View ) v2 ).getRight ( ); // invoke-virtual {v2}, Landroid/view/View;->getRight()I
v3 = this.b;
v3 = (( android.view.View ) v3 ).getBottom ( ); // invoke-virtual {v3}, Landroid/view/View;->getBottom()I
(( android.graphics.drawable.Drawable ) v0 ).setBounds ( p1, v1, v2, v3 ); // invoke-virtual {v0, p1, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
} // :cond_1
/* iget-boolean p1, p0, Landroid/support/v7/widget/ActionBarContainer;->a:Z */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
if ( p1 != null) { // if-eqz p1, :cond_2
p1 = this.c;
/* if-nez p1, :cond_3 */
} // :cond_2
p1 = this.a;
/* if-nez p1, :cond_3 */
p1 = this.b;
/* if-nez p1, :cond_3 */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
(( android.support.v7.widget.ActionBarContainer ) p0 ).setWillNotDraw ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActionBarContainer;->setWillNotDraw(Z)V
(( android.support.v7.widget.ActionBarContainer ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContainer;->invalidate()V
return;
} // .end method
public void setSplitBackground ( android.graphics.drawable.Drawable p0 ) {
/* .locals 3 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 0; // const/4 v1, 0x0
(( android.graphics.drawable.Drawable ) v0 ).setCallback ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
v0 = this.c;
(( android.support.v7.widget.ActionBarContainer ) p0 ).unscheduleDrawable ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActionBarContainer;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V
} // :cond_0
this.c = p1;
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_1
(( android.graphics.drawable.Drawable ) p1 ).setCallback ( p0 ); // invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
/* iget-boolean p1, p0, Landroid/support/v7/widget/ActionBarContainer;->a:Z */
if ( p1 != null) { // if-eqz p1, :cond_1
p1 = this.c;
if ( p1 != null) { // if-eqz p1, :cond_1
v1 = (( android.support.v7.widget.ActionBarContainer ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContainer;->getMeasuredWidth()I
v2 = (( android.support.v7.widget.ActionBarContainer ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContainer;->getMeasuredHeight()I
(( android.graphics.drawable.Drawable ) p1 ).setBounds ( v0, v0, v1, v2 ); // invoke-virtual {p1, v0, v0, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
} // :cond_1
/* iget-boolean p1, p0, Landroid/support/v7/widget/ActionBarContainer;->a:Z */
int v1 = 1; // const/4 v1, 0x1
if ( p1 != null) { // if-eqz p1, :cond_2
p1 = this.c;
/* if-nez p1, :cond_3 */
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
p1 = this.a;
/* if-nez p1, :cond_3 */
p1 = this.b;
/* if-nez p1, :cond_3 */
} // :cond_3
} // :goto_1
(( android.support.v7.widget.ActionBarContainer ) p0 ).setWillNotDraw ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActionBarContainer;->setWillNotDraw(Z)V
(( android.support.v7.widget.ActionBarContainer ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContainer;->invalidate()V
return;
} // .end method
public void setStackedBackground ( android.graphics.drawable.Drawable p0 ) {
/* .locals 4 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 0; // const/4 v1, 0x0
(( android.graphics.drawable.Drawable ) v0 ).setCallback ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
v0 = this.b;
(( android.support.v7.widget.ActionBarContainer ) p0 ).unscheduleDrawable ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActionBarContainer;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V
} // :cond_0
this.b = p1;
if ( p1 != null) { // if-eqz p1, :cond_1
(( android.graphics.drawable.Drawable ) p1 ).setCallback ( p0 ); // invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
/* iget-boolean p1, p0, Landroid/support/v7/widget/ActionBarContainer;->b:Z */
if ( p1 != null) { // if-eqz p1, :cond_1
p1 = this.b;
if ( p1 != null) { // if-eqz p1, :cond_1
v0 = this.a;
v0 = (( android.view.View ) v0 ).getLeft ( ); // invoke-virtual {v0}, Landroid/view/View;->getLeft()I
v1 = this.a;
v1 = (( android.view.View ) v1 ).getTop ( ); // invoke-virtual {v1}, Landroid/view/View;->getTop()I
v2 = this.a;
v2 = (( android.view.View ) v2 ).getRight ( ); // invoke-virtual {v2}, Landroid/view/View;->getRight()I
v3 = this.a;
v3 = (( android.view.View ) v3 ).getBottom ( ); // invoke-virtual {v3}, Landroid/view/View;->getBottom()I
(( android.graphics.drawable.Drawable ) p1 ).setBounds ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
} // :cond_1
/* iget-boolean p1, p0, Landroid/support/v7/widget/ActionBarContainer;->a:Z */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
if ( p1 != null) { // if-eqz p1, :cond_2
p1 = this.c;
/* if-nez p1, :cond_3 */
} // :cond_2
p1 = this.a;
/* if-nez p1, :cond_3 */
p1 = this.b;
/* if-nez p1, :cond_3 */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
(( android.support.v7.widget.ActionBarContainer ) p0 ).setWillNotDraw ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActionBarContainer;->setWillNotDraw(Z)V
(( android.support.v7.widget.ActionBarContainer ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContainer;->invalidate()V
return;
} // .end method
public void setTabContainer ( android.support.v7.widget.ScrollingTabContainerView p0 ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.support.v7.widget.ActionBarContainer ) p0 ).removeView ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActionBarContainer;->removeView(Landroid/view/View;)V
} // :cond_0
this.a = p1;
if ( p1 != null) { // if-eqz p1, :cond_1
(( android.support.v7.widget.ActionBarContainer ) p0 ).addView ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/ActionBarContainer;->addView(Landroid/view/View;)V
(( android.support.v7.widget.ScrollingTabContainerView ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/support/v7/widget/ScrollingTabContainerView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
int v1 = -1; // const/4 v1, -0x1
/* iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I */
int v1 = -2; // const/4 v1, -0x2
/* iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I */
int v0 = 0; // const/4 v0, 0x0
(( android.support.v7.widget.ScrollingTabContainerView ) p1 ).setAllowCollapse ( v0 ); // invoke-virtual {p1, v0}, Landroid/support/v7/widget/ScrollingTabContainerView;->setAllowCollapse(Z)V
} // :cond_1
return;
} // .end method
public void setTransitioning ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Landroid/support/v7/widget/ActionBarContainer;->c:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
/* const/high16 p1, 0x60000 */
} // :cond_0
/* const/high16 p1, 0x40000 */
} // :goto_0
(( android.support.v7.widget.ActionBarContainer ) p0 ).setDescendantFocusability ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/ActionBarContainer;->setDescendantFocusability(I)V
return;
} // .end method
public void setVisibility ( Integer p0 ) {
/* .locals 2 */
/* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setVisibility(I)V */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_1
(( android.graphics.drawable.Drawable ) v1 ).setVisible ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
} // :cond_1
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_2
(( android.graphics.drawable.Drawable ) v1 ).setVisible ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
} // :cond_2
v1 = this.c;
if ( v1 != null) { // if-eqz v1, :cond_3
(( android.graphics.drawable.Drawable ) v1 ).setVisible ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
} // :cond_3
return;
} // .end method
public android.view.ActionMode startActionModeForChild ( android.view.View p0, android.view.ActionMode$Callback p1 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public android.view.ActionMode startActionModeForChild ( android.view.View p0, android.view.ActionMode$Callback p1, Integer p2 ) {
/* .locals 0 */
if ( p3 != null) { // if-eqz p3, :cond_0
/* invoke-super {p0, p1, p2, p3}, Landroid/widget/FrameLayout;->startActionModeForChild(Landroid/view/View;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode; */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
protected Boolean verifyDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
v0 = this.a;
/* if-ne p1, v0, :cond_0 */
/* iget-boolean v0, p0, Landroid/support/v7/widget/ActionBarContainer;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
} // :cond_0
v0 = this.b;
/* if-ne p1, v0, :cond_1 */
/* iget-boolean v0, p0, Landroid/support/v7/widget/ActionBarContainer;->b:Z */
/* if-nez v0, :cond_3 */
} // :cond_1
v0 = this.c;
/* if-ne p1, v0, :cond_2 */
/* iget-boolean v0, p0, Landroid/support/v7/widget/ActionBarContainer;->a:Z */
/* if-nez v0, :cond_3 */
} // :cond_2
p1 = /* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z */
if ( p1 != null) { // if-eqz p1, :cond_4
} // :cond_3
int p1 = 1; // const/4 p1, 0x1
} // :cond_4
int p1 = 0; // const/4 p1, 0x0
} // .end method
