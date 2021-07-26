class inal implements java.util.Comparator {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/support/design/widget/CoordinatorLayout; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = "g" */
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
/* .locals 1 */
/* check-cast p1, Landroid/view/View; */
/* check-cast p2, Landroid/view/View; */
p1 = em .b ( p1 );
p2 = em .b ( p2 );
/* cmpl-float v0, p1, p2 */
/* if-lez v0, :cond_0 */
int p1 = -1; // const/4 p1, -0x1
} // :cond_0
/* cmpg-float p1, p1, p2 */
/* if-gez p1, :cond_1 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
