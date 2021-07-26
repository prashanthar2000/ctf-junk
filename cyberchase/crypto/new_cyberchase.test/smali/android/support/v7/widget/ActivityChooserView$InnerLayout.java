public class android.support.v7.widget.ActivityChooserView$InnerLayout extends android.widget.LinearLayout {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/support/v7/widget/ActivityChooserView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "InnerLayout" */
} // .end annotation
/* # static fields */
private static final a;
/* # direct methods */
static android.support.v7.widget.ActivityChooserView$InnerLayout ( ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [I */
int v1 = 0; // const/4 v1, 0x0
/* const v2, 0x10100d4 */
/* aput v2, v0, v1 */
return;
} // .end method
public android.support.v7.widget.ActivityChooserView$InnerLayout ( ) {
/* .locals 1 */
/* invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
v0 = android.support.v7.widget.ActivityChooserView$InnerLayout.a;
ip .a ( p1,p2,v0 );
int p2 = 0; // const/4 p2, 0x0
(( ip ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lip;->a(I)Landroid/graphics/drawable/Drawable;
(( android.support.v7.widget.ActivityChooserView$InnerLayout ) p0 ).setBackgroundDrawable ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/widget/ActivityChooserView$InnerLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
p1 = this.a;
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
return;
} // .end method
