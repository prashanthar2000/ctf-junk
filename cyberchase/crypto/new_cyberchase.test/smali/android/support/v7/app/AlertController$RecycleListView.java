public class android.support.v7.app.AlertController$RecycleListView extends android.widget.ListView {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/support/v7/app/AlertController; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "RecycleListView" */
} // .end annotation
/* # instance fields */
private final Integer a;
private final Integer b;
/* # direct methods */
public android.support.v7.app.AlertController$RecycleListView ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, v0}, Landroid/support/v7/app/AlertController$RecycleListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
return;
} // .end method
public android.support.v7.app.AlertController$RecycleListView ( ) {
/* .locals 1 */
/* invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
v0 = gc$j.RecycleListView;
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
int v0 = -1; // const/4 v0, -0x1
p2 = (( android.content.res.TypedArray ) p1 ).getDimensionPixelOffset ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I
/* iput p2, p0, Landroid/support/v7/app/AlertController$RecycleListView;->b:I */
p1 = (( android.content.res.TypedArray ) p1 ).getDimensionPixelOffset ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I
/* iput p1, p0, Landroid/support/v7/app/AlertController$RecycleListView;->a:I */
return;
} // .end method
/* # virtual methods */
public void setHasDecor ( Boolean p0, Boolean p1 ) {
/* .locals 2 */
if ( p2 != null) { // if-eqz p2, :cond_0
	 /* if-nez p1, :cond_3 */
} // :cond_0
v0 = (( android.support.v7.app.AlertController$RecycleListView ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v7/app/AlertController$RecycleListView;->getPaddingLeft()I
if ( p1 != null) { // if-eqz p1, :cond_1
	 p1 = 	 (( android.support.v7.app.AlertController$RecycleListView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v7/app/AlertController$RecycleListView;->getPaddingTop()I
} // :cond_1
/* iget p1, p0, Landroid/support/v7/app/AlertController$RecycleListView;->a:I */
} // :goto_0
v1 = (( android.support.v7.app.AlertController$RecycleListView ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v7/app/AlertController$RecycleListView;->getPaddingRight()I
if ( p2 != null) { // if-eqz p2, :cond_2
p2 = (( android.support.v7.app.AlertController$RecycleListView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v7/app/AlertController$RecycleListView;->getPaddingBottom()I
} // :cond_2
/* iget p2, p0, Landroid/support/v7/app/AlertController$RecycleListView;->b:I */
} // :goto_1
(( android.support.v7.app.AlertController$RecycleListView ) p0 ).setPadding ( v0, p1, v1, p2 ); // invoke-virtual {p0, v0, p1, v1, p2}, Landroid/support/v7/app/AlertController$RecycleListView;->setPadding(IIII)V
} // :cond_3
return;
} // .end method
