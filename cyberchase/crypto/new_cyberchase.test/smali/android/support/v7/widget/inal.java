public class inal extends android.view.View {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/v7/widget/ViewStubCompat$a; */
	 /* } */
} // .end annotation
/* # instance fields */
private Integer a;
private android.support.v7.widget.ViewStubCompat$a a;
private android.view.LayoutInflater a;
private java.lang.ref.WeakReference a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ref/WeakReference<", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private Integer b;
/* # direct methods */
public inal ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/ViewStubCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
return;
} // .end method
public inal ( ) {
/* .locals 2 */
/* invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Landroid/support/v7/widget/ViewStubCompat;->a:I */
v1 = gc$j.ViewStubCompat;
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v1, p3, v0 ); // invoke-virtual {p1, p2, v1, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
int p3 = -1; // const/4 p3, -0x1
p2 = (( android.content.res.TypedArray ) p1 ).getResourceId ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I
/* iput p2, p0, Landroid/support/v7/widget/ViewStubCompat;->b:I */
p2 = (( android.content.res.TypedArray ) p1 ).getResourceId ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I
/* iput p2, p0, Landroid/support/v7/widget/ViewStubCompat;->a:I */
p2 = (( android.content.res.TypedArray ) p1 ).getResourceId ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I
(( android.support.v7.widget.ViewStubCompat ) p0 ).setId ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/widget/ViewStubCompat;->setId(I)V
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
/* const/16 p1, 0x8 */
(( android.support.v7.widget.ViewStubCompat ) p0 ).setVisibility ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/ViewStubCompat;->setVisibility(I)V
int p1 = 1; // const/4 p1, 0x1
(( android.support.v7.widget.ViewStubCompat ) p0 ).setWillNotDraw ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/ViewStubCompat;->setWillNotDraw(Z)V
return;
} // .end method
/* # virtual methods */
public final android.view.View a ( ) {
/* .locals 4 */
(( android.support.v7.widget.ViewStubCompat ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ViewStubCompat;->getParent()Landroid/view/ViewParent;
if ( v0 != null) { // if-eqz v0, :cond_4
/* instance-of v1, v0, Landroid/view/ViewGroup; */
if ( v1 != null) { // if-eqz v1, :cond_4
	 /* iget v1, p0, Landroid/support/v7/widget/ViewStubCompat;->a:I */
	 if ( v1 != null) { // if-eqz v1, :cond_3
		 /* check-cast v0, Landroid/view/ViewGroup; */
		 v1 = this.a;
		 if ( v1 != null) { // if-eqz v1, :cond_0
		 } // :cond_0
		 (( android.support.v7.widget.ViewStubCompat ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ViewStubCompat;->getContext()Landroid/content/Context;
		 android.view.LayoutInflater .from ( v1 );
	 } // :goto_0
	 /* iget v2, p0, Landroid/support/v7/widget/ViewStubCompat;->a:I */
	 int v3 = 0; // const/4 v3, 0x0
	 (( android.view.LayoutInflater ) v1 ).inflate ( v2, v0, v3 ); // invoke-virtual {v1, v2, v0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
	 /* iget v2, p0, Landroid/support/v7/widget/ViewStubCompat;->b:I */
	 int v3 = -1; // const/4 v3, -0x1
	 /* if-eq v2, v3, :cond_1 */
	 (( android.view.View ) v1 ).setId ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/View;->setId(I)V
} // :cond_1
v2 = (( android.view.ViewGroup ) v0 ).indexOfChild ( p0 ); // invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I
(( android.view.ViewGroup ) v0 ).removeViewInLayout ( p0 ); // invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeViewInLayout(Landroid/view/View;)V
(( android.support.v7.widget.ViewStubCompat ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ViewStubCompat;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
if ( v3 != null) { // if-eqz v3, :cond_2
	 (( android.view.ViewGroup ) v0 ).addView ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
} // :cond_2
(( android.view.ViewGroup ) v0 ).addView ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V
} // :goto_1
/* new-instance v0, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.a = v0;
} // :cond_3
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "ViewStub must have a valid layoutResource"; // const-string v1, "ViewStub must have a valid layoutResource"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_4
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "ViewStub must have a non-null ViewGroup viewParent"; // const-string v1, "ViewStub must have a non-null ViewGroup viewParent"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
protected final void dispatchDraw ( android.graphics.Canvas p0 ) {
/* .locals 0 */
return;
} // .end method
public final void draw ( android.graphics.Canvas p0 ) {
/* .locals 0 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "MissingSuperCall" */
/* } */
} // .end annotation
return;
} // .end method
public final Integer getInflatedId ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v7/widget/ViewStubCompat;->b:I */
} // .end method
public final android.view.LayoutInflater getLayoutInflater ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public final Integer getLayoutResource ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v7/widget/ViewStubCompat;->a:I */
} // .end method
protected final void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
(( android.support.v7.widget.ViewStubCompat ) p0 ).setMeasuredDimension ( p1, p1 ); // invoke-virtual {p0, p1, p1}, Landroid/support/v7/widget/ViewStubCompat;->setMeasuredDimension(II)V
return;
} // .end method
public final void setInflatedId ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v7/widget/ViewStubCompat;->b:I */
return;
} // .end method
public final void setLayoutInflater ( android.view.LayoutInflater p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
public final void setLayoutResource ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v7/widget/ViewStubCompat;->a:I */
return;
} // .end method
public final void setOnInflateListener ( android.support.v7.widget.ViewStubCompat$a p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
public final void setVisibility ( Integer p0 ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.view.View ) v0 ).setVisibility ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V
return;
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "setVisibility called on un-referenced view"; // const-string v0, "setVisibility called on un-referenced view"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_1
/* invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V */
if ( p1 != null) { // if-eqz p1, :cond_2
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_3 */
} // :cond_2
(( android.support.v7.widget.ViewStubCompat ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ViewStubCompat;->a()Landroid/view/View;
} // :cond_3
return;
} // .end method
