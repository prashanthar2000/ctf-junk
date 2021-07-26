public class android.support.v4.view.ViewPager$LayoutParams extends android.view.ViewGroup$LayoutParams {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/support/v4/view/ViewPager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "LayoutParams" */
} // .end annotation
/* # instance fields */
Float a;
public Integer a;
public Boolean a;
Integer b;
Boolean b;
Integer c;
/* # direct methods */
public android.support.v4.view.ViewPager$LayoutParams ( ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
/* invoke-direct {p0, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Landroid/support/v4/view/ViewPager$LayoutParams;->a:F */
return;
} // .end method
public android.support.v4.view.ViewPager$LayoutParams ( ) {
/* .locals 1 */
/* invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Landroid/support/v4/view/ViewPager$LayoutParams;->a:F */
v0 = android.support.v4.view.ViewPager.a;
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
int p2 = 0; // const/4 p2, 0x0
/* const/16 v0, 0x30 */
p2 = (( android.content.res.TypedArray ) p1 ).getInteger ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I
/* iput p2, p0, Landroid/support/v4/view/ViewPager$LayoutParams;->a:I */
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
return;
} // .end method
