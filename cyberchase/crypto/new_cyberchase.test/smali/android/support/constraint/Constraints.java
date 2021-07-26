public class android.support.constraint.Constraints extends android.view.ViewGroup {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/constraint/Constraints$LayoutParams; */
	 /* } */
} // .end annotation
/* # instance fields */
x a;
/* # direct methods */
public android.support.constraint.Constraints ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V */
	 /* const/16 p1, 0x8 */
	 /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V */
	 return;
} // .end method
public android.support.constraint.Constraints ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 android.support.constraint.Constraints .a ( );
	 /* const/16 p1, 0x8 */
	 /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V */
	 return;
} // .end method
public android.support.constraint.Constraints ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 android.support.constraint.Constraints .a ( );
	 /* const/16 p1, 0x8 */
	 /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V */
	 return;
} // .end method
private static void a ( ) {
	 /* .locals 2 */
	 final String v0 = "Constraints"; // const-string v0, "Constraints"
	 final String v1 = " ################# init"; // const-string v1, " ################# init"
	 android.util.Log .v ( v0,v1 );
	 return;
} // .end method
/* # virtual methods */
protected android.view.ViewGroup$LayoutParams generateDefaultLayoutParams ( ) { //synthethic
	 /* .locals 1 */
	 /* new-instance v0, Landroid/support/constraint/Constraints$LayoutParams; */
	 /* invoke-direct {v0}, Landroid/support/constraint/Constraints$LayoutParams;-><init>()V */
} // .end method
public android.view.ViewGroup$LayoutParams generateLayoutParams ( android.util.AttributeSet p0 ) { //synthethic
	 /* .locals 2 */
	 /* new-instance v0, Landroid/support/constraint/Constraints$LayoutParams; */
	 (( android.support.constraint.Constraints ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/constraint/Constraints;->getContext()Landroid/content/Context;
	 /* invoke-direct {v0, v1, p1}, Landroid/support/constraint/Constraints$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
protected android.view.ViewGroup$LayoutParams generateLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
	 /* .locals 1 */
	 /* new-instance v0, Landroid/support/constraint/ConstraintLayout$LayoutParams; */
	 /* invoke-direct {v0, p1}, Landroid/support/constraint/ConstraintLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
} // .end method
public x getConstraintSet ( ) {
	 /* .locals 10 */
	 v0 = this.a;
	 /* if-nez v0, :cond_0 */
	 /* new-instance v0, Lx; */
	 /* invoke-direct {v0}, Lx;-><init>()V */
	 this.a = v0;
} // :cond_0
v0 = this.a;
v1 = (( android.support.constraint.Constraints ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/constraint/Constraints;->getChildCount()I
v2 = this.a;
(( java.util.HashMap ) v2 ).clear ( ); // invoke-virtual {v2}, Ljava/util/HashMap;->clear()V
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v1, :cond_4 */
(( android.support.constraint.Constraints ) p0 ).getChildAt ( v3 ); // invoke-virtual {p0, v3}, Landroid/support/constraint/Constraints;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v5, Landroid/support/constraint/Constraints$LayoutParams; */
v6 = (( android.view.View ) v4 ).getId ( ); // invoke-virtual {v4}, Landroid/view/View;->getId()I
int v7 = -1; // const/4 v7, -0x1
/* if-eq v6, v7, :cond_3 */
v7 = this.a;
java.lang.Integer .valueOf ( v6 );
v7 = (( java.util.HashMap ) v7 ).containsKey ( v8 ); // invoke-virtual {v7, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
/* if-nez v7, :cond_1 */
v7 = this.a;
java.lang.Integer .valueOf ( v6 );
/* new-instance v9, Lx$a; */
/* invoke-direct {v9, v2}, Lx$a;-><init>(B)V */
(( java.util.HashMap ) v7 ).put ( v8, v9 ); // invoke-virtual {v7, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_1
v7 = this.a;
java.lang.Integer .valueOf ( v6 );
(( java.util.HashMap ) v7 ).get ( v8 ); // invoke-virtual {v7, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v7, Lx$a; */
/* instance-of v8, v4, Landroid/support/constraint/ConstraintHelper; */
if ( v8 != null) { // if-eqz v8, :cond_2
/* check-cast v4, Landroid/support/constraint/ConstraintHelper; */
(( x$a ) v7 ).a ( v6, v5 ); // invoke-virtual {v7, v6, v5}, Lx$a;->a(ILandroid/support/constraint/Constraints$LayoutParams;)V
/* instance-of v8, v4, Landroid/support/constraint/Barrier; */
if ( v8 != null) { // if-eqz v8, :cond_2
int v8 = 1; // const/4 v8, 0x1
/* iput v8, v7, Lx$a;->T:I */
/* check-cast v4, Landroid/support/constraint/Barrier; */
v8 = (( android.support.constraint.Barrier ) v4 ).getType ( ); // invoke-virtual {v4}, Landroid/support/constraint/Barrier;->getType()I
/* iput v8, v7, Lx$a;->S:I */
(( android.support.constraint.Barrier ) v4 ).getReferencedIds ( ); // invoke-virtual {v4}, Landroid/support/constraint/Barrier;->getReferencedIds()[I
this.a = v4;
} // :cond_2
(( x$a ) v7 ).a ( v6, v5 ); // invoke-virtual {v7, v6, v5}, Lx$a;->a(ILandroid/support/constraint/Constraints$LayoutParams;)V
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_3
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = "All children of ConstraintLayout must have ids to use ConstraintSet"; // const-string v1, "All children of ConstraintLayout must have ids to use ConstraintSet"
/* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_4
v0 = this.a;
} // .end method
protected void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
return;
} // .end method
