public class android.support.v7.widget.ScrollingTabContainerView extends android.widget.HorizontalScrollView implements android.widget.AdapterView$OnItemSelectedListener {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/v7/widget/ScrollingTabContainerView$c;, */
	 /* Landroid/support/v7/widget/ScrollingTabContainerView$a;, */
	 /* Landroid/support/v7/widget/ScrollingTabContainerView$b; */
	 /* } */
} // .end annotation
/* # static fields */
private static final android.view.animation.Interpolator a;
/* # instance fields */
Integer a;
android.support.v7.widget.LinearLayoutCompat a;
protected final android.support.v7.widget.ScrollingTabContainerView$c a;
protected android.view.ViewPropertyAnimator a;
private android.widget.Spinner a;
java.lang.Runnable a;
private Boolean a;
Integer b;
Integer c;
private Integer d;
/* # direct methods */
static android.support.v7.widget.ScrollingTabContainerView ( ) {
	 /* .locals 1 */
	 /* new-instance v0, Landroid/view/animation/DecelerateInterpolator; */
	 /* invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V */
	 return;
} // .end method
public android.support.v7.widget.ScrollingTabContainerView ( ) {
	 /* .locals 3 */
	 /* invoke-direct {p0, p1}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V */
	 /* new-instance v0, Landroid/support/v7/widget/ScrollingTabContainerView$c; */
	 /* invoke-direct {v0, p0}, Landroid/support/v7/widget/ScrollingTabContainerView$c;-><init>(Landroid/support/v7/widget/ScrollingTabContainerView;)V */
	 this.a = v0;
	 int v0 = 0; // const/4 v0, 0x0
	 (( android.support.v7.widget.ScrollingTabContainerView ) p0 ).setHorizontalScrollBarEnabled ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ScrollingTabContainerView;->setHorizontalScrollBarEnabled(Z)V
	 gj .a ( p1 );
	 v0 = 	 (( gj ) p1 ).b ( ); // invoke-virtual {p1}, Lgj;->b()I
	 (( android.support.v7.widget.ScrollingTabContainerView ) p0 ).setContentHeight ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ScrollingTabContainerView;->setContentHeight(I)V
	 p1 = 	 (( gj ) p1 ).c ( ); // invoke-virtual {p1}, Lgj;->c()I
	 /* iput p1, p0, Landroid/support/v7/widget/ScrollingTabContainerView;->b:I */
	 /* new-instance p1, Landroid/support/v7/widget/LinearLayoutCompat; */
	 (( android.support.v7.widget.ScrollingTabContainerView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ScrollingTabContainerView;->getContext()Landroid/content/Context;
	 int v2 = 0; // const/4 v2, 0x0
	 /* invoke-direct {p1, v0, v2, v1}, Landroid/support/v7/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 int v0 = 1; // const/4 v0, 0x1
	 (( android.support.v7.widget.LinearLayoutCompat ) p1 ).setMeasureWithLargestChildEnabled ( v0 ); // invoke-virtual {p1, v0}, Landroid/support/v7/widget/LinearLayoutCompat;->setMeasureWithLargestChildEnabled(Z)V
	 /* const/16 v0, 0x11 */
	 (( android.support.v7.widget.LinearLayoutCompat ) p1 ).setGravity ( v0 ); // invoke-virtual {p1, v0}, Landroid/support/v7/widget/LinearLayoutCompat;->setGravity(I)V
	 /* new-instance v0, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
	 int v1 = -1; // const/4 v1, -0x1
	 int v2 = -2; // const/4 v2, -0x2
	 /* invoke-direct {v0, v2, v1}, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V */
	 (( android.support.v7.widget.LinearLayoutCompat ) p1 ).setLayoutParams ( v0 ); // invoke-virtual {p1, v0}, Landroid/support/v7/widget/LinearLayoutCompat;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
	 this.a = p1;
	 p1 = this.a;
	 /* new-instance v0, Landroid/view/ViewGroup$LayoutParams; */
	 /* invoke-direct {v0, v2, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
	 (( android.support.v7.widget.ScrollingTabContainerView ) p0 ).addView ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/support/v7/widget/ScrollingTabContainerView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
	 return;
} // .end method
private Boolean a ( ) {
	 /* .locals 1 */
	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 (( android.widget.Spinner ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/widget/Spinner;->getParent()Landroid/view/ViewParent;
		 /* if-ne v0, p0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
private Boolean b ( ) {
	 /* .locals 5 */
	 v0 = 	 /* invoke-direct {p0}, Landroid/support/v7/widget/ScrollingTabContainerView;->a()Z */
	 int v1 = 0; // const/4 v1, 0x0
	 /* if-nez v0, :cond_0 */
} // :cond_0
v0 = this.a;
(( android.support.v7.widget.ScrollingTabContainerView ) p0 ).removeView ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ScrollingTabContainerView;->removeView(Landroid/view/View;)V
v0 = this.a;
/* new-instance v2, Landroid/view/ViewGroup$LayoutParams; */
int v3 = -2; // const/4 v3, -0x2
int v4 = -1; // const/4 v4, -0x1
/* invoke-direct {v2, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
(( android.support.v7.widget.ScrollingTabContainerView ) p0 ).addView ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Landroid/support/v7/widget/ScrollingTabContainerView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
v0 = this.a;
v0 = (( android.widget.Spinner ) v0 ).getSelectedItemPosition ( ); // invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItemPosition()I
(( android.support.v7.widget.ScrollingTabContainerView ) p0 ).setTabSelected ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ScrollingTabContainerView;->setTabSelected(I)V
} // .end method
/* # virtual methods */
public void onAttachedToWindow ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onAttachedToWindow()V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
	 (( android.support.v7.widget.ScrollingTabContainerView ) p0 ).post ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ScrollingTabContainerView;->post(Ljava/lang/Runnable;)Z
} // :cond_0
return;
} // .end method
protected void onConfigurationChanged ( android.content.res.Configuration p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onConfigurationChanged(Landroid/content/res/Configuration;)V */
(( android.support.v7.widget.ScrollingTabContainerView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ScrollingTabContainerView;->getContext()Landroid/content/Context;
gj .a ( p1 );
v0 = (( gj ) p1 ).b ( ); // invoke-virtual {p1}, Lgj;->b()I
(( android.support.v7.widget.ScrollingTabContainerView ) p0 ).setContentHeight ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ScrollingTabContainerView;->setContentHeight(I)V
p1 = (( gj ) p1 ).c ( ); // invoke-virtual {p1}, Lgj;->c()I
/* iput p1, p0, Landroid/support/v7/widget/ScrollingTabContainerView;->b:I */
return;
} // .end method
public void onDetachedFromWindow ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onDetachedFromWindow()V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
	 (( android.support.v7.widget.ScrollingTabContainerView ) p0 ).removeCallbacks ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ScrollingTabContainerView;->removeCallbacks(Ljava/lang/Runnable;)Z
} // :cond_0
return;
} // .end method
public void onItemSelected ( android.widget.AdapterView p0, android.view.View p1, Integer p2, Long p3 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/widget/AdapterView<", */
/* "*>;", */
/* "Landroid/view/View;", */
/* "IJ)V" */
/* } */
} // .end annotation
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 7 */
p2 = android.view.View$MeasureSpec .getMode ( p1 );
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* const/high16 v2, 0x40000000 # 2.0f */
/* if-ne p2, v2, :cond_0 */
int v3 = 1; // const/4 v3, 0x1
} // :cond_0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
(( android.support.v7.widget.ScrollingTabContainerView ) p0 ).setFillViewport ( v3 ); // invoke-virtual {p0, v3}, Landroid/support/v7/widget/ScrollingTabContainerView;->setFillViewport(Z)V
v4 = this.a;
v4 = (( android.support.v7.widget.LinearLayoutCompat ) v4 ).getChildCount ( ); // invoke-virtual {v4}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildCount()I
int v5 = -1; // const/4 v5, -0x1
/* if-le v4, v0, :cond_3 */
/* if-eq p2, v2, :cond_1 */
/* const/high16 v6, -0x80000000 */
/* if-ne p2, v6, :cond_3 */
} // :cond_1
int p2 = 2; // const/4 p2, 0x2
/* if-le v4, p2, :cond_2 */
p2 = android.view.View$MeasureSpec .getSize ( p1 );
/* int-to-float p2, p2 */
/* const v4, 0x3ecccccd # 0.4f */
/* mul-float p2, p2, v4 */
/* float-to-int p2, p2 */
/* iput p2, p0, Landroid/support/v7/widget/ScrollingTabContainerView;->a:I */
} // :cond_2
v4 = android.view.View$MeasureSpec .getSize ( p1 );
/* div-int/2addr v4, p2 */
/* iput v4, p0, Landroid/support/v7/widget/ScrollingTabContainerView;->a:I */
} // :goto_1
/* iget p2, p0, Landroid/support/v7/widget/ScrollingTabContainerView;->a:I */
/* iget v4, p0, Landroid/support/v7/widget/ScrollingTabContainerView;->b:I */
p2 = java.lang.Math .min ( p2,v4 );
/* iput p2, p0, Landroid/support/v7/widget/ScrollingTabContainerView;->a:I */
} // :cond_3
/* iput v5, p0, Landroid/support/v7/widget/ScrollingTabContainerView;->a:I */
} // :goto_2
/* iget p2, p0, Landroid/support/v7/widget/ScrollingTabContainerView;->c:I */
p2 = android.view.View$MeasureSpec .makeMeasureSpec ( p2,v2 );
/* if-nez v3, :cond_4 */
/* iget-boolean v2, p0, Landroid/support/v7/widget/ScrollingTabContainerView;->a:Z */
if ( v2 != null) { // if-eqz v2, :cond_4
} // :cond_4
int v0 = 0; // const/4 v0, 0x0
} // :goto_3
if ( v0 != null) { // if-eqz v0, :cond_8
v0 = this.a;
(( android.support.v7.widget.LinearLayoutCompat ) v0 ).measure ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Landroid/support/v7/widget/LinearLayoutCompat;->measure(II)V
v0 = this.a;
v0 = (( android.support.v7.widget.LinearLayoutCompat ) v0 ).getMeasuredWidth ( ); // invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutCompat;->getMeasuredWidth()I
v1 = android.view.View$MeasureSpec .getSize ( p1 );
/* if-le v0, v1, :cond_8 */
v0 = /* invoke-direct {p0}, Landroid/support/v7/widget/ScrollingTabContainerView;->a()Z */
/* if-nez v0, :cond_9 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
int v2 = -2; // const/4 v2, -0x2
/* if-nez v0, :cond_5 */
/* new-instance v0, Landroid/support/v7/widget/AppCompatSpinner; */
(( android.support.v7.widget.ScrollingTabContainerView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ScrollingTabContainerView;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v4, v1, v6}, Landroid/support/v7/widget/AppCompatSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
/* new-instance v4, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
/* invoke-direct {v4, v2, v5}, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V */
(( android.widget.Spinner ) v0 ).setLayoutParams ( v4 ); // invoke-virtual {v0, v4}, Landroid/widget/Spinner;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
(( android.widget.Spinner ) v0 ).setOnItemSelectedListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
this.a = v0;
} // :cond_5
v0 = this.a;
(( android.support.v7.widget.ScrollingTabContainerView ) p0 ).removeView ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ScrollingTabContainerView;->removeView(Landroid/view/View;)V
v0 = this.a;
/* new-instance v4, Landroid/view/ViewGroup$LayoutParams; */
/* invoke-direct {v4, v2, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
(( android.support.v7.widget.ScrollingTabContainerView ) p0 ).addView ( v0, v4 ); // invoke-virtual {p0, v0, v4}, Landroid/support/v7/widget/ScrollingTabContainerView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
v0 = this.a;
(( android.widget.Spinner ) v0 ).getAdapter ( ); // invoke-virtual {v0}, Landroid/widget/Spinner;->getAdapter()Landroid/widget/SpinnerAdapter;
/* if-nez v0, :cond_6 */
v0 = this.a;
/* new-instance v2, Landroid/support/v7/widget/ScrollingTabContainerView$a; */
/* invoke-direct {v2, p0}, Landroid/support/v7/widget/ScrollingTabContainerView$a;-><init>(Landroid/support/v7/widget/ScrollingTabContainerView;)V */
(( android.widget.Spinner ) v0 ).setAdapter ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V
} // :cond_6
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_7
(( android.support.v7.widget.ScrollingTabContainerView ) p0 ).removeCallbacks ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ScrollingTabContainerView;->removeCallbacks(Ljava/lang/Runnable;)Z
this.a = v1;
} // :cond_7
v0 = this.a;
/* iget v1, p0, Landroid/support/v7/widget/ScrollingTabContainerView;->d:I */
(( android.widget.Spinner ) v0 ).setSelection ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setSelection(I)V
} // :cond_8
/* invoke-direct {p0}, Landroid/support/v7/widget/ScrollingTabContainerView;->b()Z */
} // :cond_9
} // :goto_4
v0 = (( android.support.v7.widget.ScrollingTabContainerView ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ScrollingTabContainerView;->getMeasuredWidth()I
/* invoke-super {p0, p1, p2}, Landroid/widget/HorizontalScrollView;->onMeasure(II)V */
p1 = (( android.support.v7.widget.ScrollingTabContainerView ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ScrollingTabContainerView;->getMeasuredWidth()I
if ( v3 != null) { // if-eqz v3, :cond_a
/* if-eq v0, p1, :cond_a */
/* iget p1, p0, Landroid/support/v7/widget/ScrollingTabContainerView;->d:I */
(( android.support.v7.widget.ScrollingTabContainerView ) p0 ).setTabSelected ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/ScrollingTabContainerView;->setTabSelected(I)V
} // :cond_a
return;
} // .end method
public void onNothingSelected ( android.widget.AdapterView p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/widget/AdapterView<", */
/* "*>;)V" */
/* } */
} // .end annotation
return;
} // .end method
public void setAllowCollapse ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Landroid/support/v7/widget/ScrollingTabContainerView;->a:Z */
return;
} // .end method
public void setContentHeight ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v7/widget/ScrollingTabContainerView;->c:I */
(( android.support.v7.widget.ScrollingTabContainerView ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ScrollingTabContainerView;->requestLayout()V
return;
} // .end method
public void setTabSelected ( Integer p0 ) {
/* .locals 5 */
/* iput p1, p0, Landroid/support/v7/widget/ScrollingTabContainerView;->d:I */
v0 = this.a;
v0 = (( android.support.v7.widget.LinearLayoutCompat ) v0 ).getChildCount ( ); // invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_3 */
v3 = this.a;
(( android.support.v7.widget.LinearLayoutCompat ) v3 ).getChildAt ( v2 ); // invoke-virtual {v3, v2}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildAt(I)Landroid/view/View;
/* if-ne v2, p1, :cond_0 */
int v4 = 1; // const/4 v4, 0x1
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
} // :goto_1
(( android.view.View ) v3 ).setSelected ( v4 ); // invoke-virtual {v3, v4}, Landroid/view/View;->setSelected(Z)V
if ( v4 != null) { // if-eqz v4, :cond_2
v3 = this.a;
(( android.support.v7.widget.LinearLayoutCompat ) v3 ).getChildAt ( p1 ); // invoke-virtual {v3, p1}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildAt(I)Landroid/view/View;
v4 = this.a;
if ( v4 != null) { // if-eqz v4, :cond_1
(( android.support.v7.widget.ScrollingTabContainerView ) p0 ).removeCallbacks ( v4 ); // invoke-virtual {p0, v4}, Landroid/support/v7/widget/ScrollingTabContainerView;->removeCallbacks(Ljava/lang/Runnable;)Z
} // :cond_1
/* new-instance v4, Landroid/support/v7/widget/ScrollingTabContainerView$1; */
/* invoke-direct {v4, p0, v3}, Landroid/support/v7/widget/ScrollingTabContainerView$1;-><init>(Landroid/support/v7/widget/ScrollingTabContainerView;Landroid/view/View;)V */
this.a = v4;
v3 = this.a;
(( android.support.v7.widget.ScrollingTabContainerView ) p0 ).post ( v3 ); // invoke-virtual {p0, v3}, Landroid/support/v7/widget/ScrollingTabContainerView;->post(Ljava/lang/Runnable;)Z
} // :cond_2
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_3
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_4
/* if-ltz p1, :cond_4 */
(( android.widget.Spinner ) v0 ).setSelection ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/Spinner;->setSelection(I)V
} // :cond_4
return;
} // .end method
