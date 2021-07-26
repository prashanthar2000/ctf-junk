public class android.support.v4.widget.DrawerLayout$LayoutParams extends android.view.ViewGroup$MarginLayoutParams {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/support/v4/widget/DrawerLayout; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "LayoutParams" */
} // .end annotation
/* # instance fields */
Float a;
public Integer a;
Boolean a;
Integer b;
/* # direct methods */
public android.support.v4.widget.DrawerLayout$LayoutParams ( ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
/* invoke-direct {p0, v0, v0}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:I */
return;
} // .end method
public android.support.v4.widget.DrawerLayout$LayoutParams ( ) {
/* .locals 2 */
/* invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:I */
v1 = android.support.v4.widget.DrawerLayout.a;
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
p2 = (( android.content.res.TypedArray ) p1 ).getInt ( v0, v0 ); // invoke-virtual {p1, v0, v0}, Landroid/content/res/TypedArray;->getInt(II)I
/* iput p2, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:I */
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
return;
} // .end method
public android.support.v4.widget.DrawerLayout$LayoutParams ( ) {
/* .locals 1 */
/* invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:I */
/* iget p1, p1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:I */
/* iput p1, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:I */
return;
} // .end method
public android.support.v4.widget.DrawerLayout$LayoutParams ( ) {
/* .locals 0 */
/* invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
int p1 = 0; // const/4 p1, 0x0
/* iput p1, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:I */
return;
} // .end method
public android.support.v4.widget.DrawerLayout$LayoutParams ( ) {
/* .locals 0 */
/* invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V */
int p1 = 0; // const/4 p1, 0x0
/* iput p1, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:I */
return;
} // .end method
