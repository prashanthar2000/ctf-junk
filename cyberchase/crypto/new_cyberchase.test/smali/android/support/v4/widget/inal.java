class inal extends android.view.animation.Animation {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Landroid/support/v4/widget/SwipeRefreshLayout;->c(ILandroid/view/animation/Animation$AnimationListener;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final android.support.v4.widget.SwipeRefreshLayout a; //synthetic
/* # direct methods */
 inal ( ) {
/* .locals 0 */
this.a = p1;
/* invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V */
return;
} // .end method
/* # virtual methods */
public final void applyTransformation ( Float p0, android.view.animation.Transformation p1 ) {
/* .locals 1 */
p2 = this.a;
/* iget p2, p2, Landroid/support/v4/widget/SwipeRefreshLayout;->a:F */
v0 = this.a;
/* iget v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->a:F */
/* neg-float v0, v0 */
/* mul-float v0, v0, p1 */
/* add-float/2addr p2, v0 */
v0 = this.a;
(( android.support.v4.widget.SwipeRefreshLayout ) v0 ).setAnimationProgress ( p2 ); // invoke-virtual {v0, p2}, Landroid/support/v4/widget/SwipeRefreshLayout;->setAnimationProgress(F)V
p2 = this.a;
(( android.support.v4.widget.SwipeRefreshLayout ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->a(F)V
return;
} // .end method
