public class android.support.v4.widget.SlidingPaneLayout$LayoutParams extends android.view.ViewGroup$MarginLayoutParams {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/support/v4/widget/SlidingPaneLayout; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "LayoutParams" */
} // .end annotation
/* # static fields */
private static final a;
/* # instance fields */
public Float a;
android.graphics.Paint a;
Boolean a;
Boolean b;
/* # direct methods */
static android.support.v4.widget.SlidingPaneLayout$LayoutParams ( ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [I */
int v1 = 0; // const/4 v1, 0x0
/* const v2, 0x1010181 */
/* aput v2, v0, v1 */
return;
} // .end method
public android.support.v4.widget.SlidingPaneLayout$LayoutParams ( ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
/* invoke-direct {p0, v0, v0}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->a:F */
return;
} // .end method
public android.support.v4.widget.SlidingPaneLayout$LayoutParams ( ) {
/* .locals 2 */
/* invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->a:F */
v1 = android.support.v4.widget.SlidingPaneLayout$LayoutParams.a;
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
int p2 = 0; // const/4 p2, 0x0
p2 = (( android.content.res.TypedArray ) p1 ).getFloat ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F
/* iput p2, p0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->a:F */
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
return;
} // .end method
public android.support.v4.widget.SlidingPaneLayout$LayoutParams ( ) {
/* .locals 0 */
/* invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
int p1 = 0; // const/4 p1, 0x0
/* iput p1, p0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->a:F */
return;
} // .end method
public android.support.v4.widget.SlidingPaneLayout$LayoutParams ( ) {
/* .locals 0 */
/* invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V */
int p1 = 0; // const/4 p1, 0x0
/* iput p1, p0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->a:F */
return;
} // .end method
