class inal implements java.util.Comparator {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/support/v4/view/ViewPager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = "i" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Object;", */
/* "Ljava/util/Comparator<", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
/* # direct methods */
 inal ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public final Integer compare ( java.lang.Object p0, java.lang.Object p1 ) { //synthethic
/* .locals 2 */
/* check-cast p1, Landroid/view/View; */
/* check-cast p2, Landroid/view/View; */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p1, Landroid/support/v4/view/ViewPager$LayoutParams; */
(( android.view.View ) p2 ).getLayoutParams ( ); // invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p2, Landroid/support/v4/view/ViewPager$LayoutParams; */
/* iget-boolean v0, p1, Landroid/support/v4/view/ViewPager$LayoutParams;->a:Z */
/* iget-boolean v1, p2, Landroid/support/v4/view/ViewPager$LayoutParams;->a:Z */
/* if-eq v0, v1, :cond_1 */
/* iget-boolean p1, p1, Landroid/support/v4/view/ViewPager$LayoutParams;->a:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = -1; // const/4 p1, -0x1
} // :cond_1
/* iget p1, p1, Landroid/support/v4/view/ViewPager$LayoutParams;->b:I */
/* iget p2, p2, Landroid/support/v4/view/ViewPager$LayoutParams;->b:I */
/* sub-int/2addr p1, p2 */
} // .end method
