public class android.support.constraint.Group extends android.support.constraint.ConstraintHelper {
	 /* # direct methods */
	 public android.support.constraint.Group ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Landroid/support/constraint/ConstraintHelper;-><init>(Landroid/content/Context;)V */
		 return;
	 } // .end method
	 public android.support.constraint.Group ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Landroid/support/constraint/ConstraintHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public android.support.constraint.Group ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/support/constraint/ConstraintHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( android.support.constraint.ConstraintLayout p0 ) {
		 /* .locals 7 */
		 v0 = 		 (( android.support.constraint.Group ) p0 ).getVisibility ( ); // invoke-virtual {p0}, Landroid/support/constraint/Group;->getVisibility()I
		 /* const/16 v2, 0x15 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* if-lt v1, v2, :cond_0 */
		 v1 = 		 (( android.support.constraint.Group ) p0 ).getElevation ( ); // invoke-virtual {p0}, Landroid/support/constraint/Group;->getElevation()F
	 } // :cond_0
	 int v1 = 0; // const/4 v1, 0x0
} // :goto_0
int v4 = 0; // const/4 v4, 0x0
} // :goto_1
/* iget v5, p0, Landroid/support/constraint/Group;->a:I */
/* if-ge v4, v5, :cond_2 */
v5 = this.a;
/* aget v5, v5, v4 */
(( android.support.constraint.ConstraintLayout ) p1 ).a ( v5 ); // invoke-virtual {p1, v5}, Landroid/support/constraint/ConstraintLayout;->a(I)Landroid/view/View;
if ( v5 != null) { // if-eqz v5, :cond_1
(( android.view.View ) v5 ).setVisibility ( v0 ); // invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V
/* cmpl-float v6, v1, v3 */
/* if-lez v6, :cond_1 */
/* if-lt v6, v2, :cond_1 */
(( android.view.View ) v5 ).setElevation ( v1 ); // invoke-virtual {v5, v1}, Landroid/view/View;->setElevation(F)V
} // :cond_1
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_2
return;
} // .end method
protected final void a ( android.util.AttributeSet p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1}, Landroid/support/constraint/ConstraintHelper;->a(Landroid/util/AttributeSet;)V */
int p1 = 0; // const/4 p1, 0x0
/* iput-boolean p1, p0, Landroid/support/constraint/Group;->a:Z */
return;
} // .end method
public final void b ( ) {
/* .locals 3 */
(( android.support.constraint.Group ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/support/constraint/Group;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/support/constraint/ConstraintLayout$LayoutParams; */
v1 = this.a;
int v2 = 0; // const/4 v2, 0x0
(( am ) v1 ).d ( v2 ); // invoke-virtual {v1, v2}, Lam;->d(I)V
v0 = this.a;
(( am ) v0 ).e ( v2 ); // invoke-virtual {v0, v2}, Lam;->e(I)V
return;
} // .end method
