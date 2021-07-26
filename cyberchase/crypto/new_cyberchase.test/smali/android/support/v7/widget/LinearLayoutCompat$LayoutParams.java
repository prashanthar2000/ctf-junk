public class android.support.v7.widget.LinearLayoutCompat$LayoutParams extends android.view.ViewGroup$MarginLayoutParams {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/support/v7/widget/LinearLayoutCompat; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "LayoutParams" */
} // .end annotation
/* # instance fields */
public Float a;
public Integer c;
/* # direct methods */
public android.support.v7.widget.LinearLayoutCompat$LayoutParams ( ) {
/* .locals 0 */
/* invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V */
int p1 = -1; // const/4 p1, -0x1
/* iput p1, p0, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->c:I */
int p1 = 0; // const/4 p1, 0x0
/* iput p1, p0, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->a:F */
return;
} // .end method
public android.support.v7.widget.LinearLayoutCompat$LayoutParams ( ) {
/* .locals 2 */
/* invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->c:I */
v1 = gc$j.LinearLayoutCompat_Layout;
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
int v1 = 0; // const/4 v1, 0x0
p2 = (( android.content.res.TypedArray ) p1 ).getFloat ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F
/* iput p2, p0, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->a:F */
p2 = (( android.content.res.TypedArray ) p1 ).getInt ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I
/* iput p2, p0, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->c:I */
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
return;
} // .end method
public android.support.v7.widget.LinearLayoutCompat$LayoutParams ( ) {
/* .locals 0 */
/* invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
int p1 = -1; // const/4 p1, -0x1
/* iput p1, p0, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->c:I */
return;
} // .end method
