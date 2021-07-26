public class android.support.v4.widget.Space extends android.view.View {
	 /* # annotations */
	 /* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* # direct methods */
public android.support.v4.widget.Space ( ) {
	 /* .locals 1 */
	 /* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, v0}, Landroid/support/v4/widget/Space;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
return;
} // .end method
public android.support.v4.widget.Space ( ) {
/* .locals 1 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, p2, v0}, Landroid/support/v4/widget/Space;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
return;
} // .end method
public android.support.v4.widget.Space ( ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
p1 = (( android.support.v4.widget.Space ) p0 ).getVisibility ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/Space;->getVisibility()I
/* if-nez p1, :cond_0 */
int p1 = 4; // const/4 p1, 0x4
(( android.support.v4.widget.Space ) p0 ).setVisibility ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/Space;->setVisibility(I)V
} // :cond_0
return;
} // .end method
private static Integer a ( Integer p0, Integer p1 ) {
/* .locals 2 */
v0 = android.view.View$MeasureSpec .getMode ( p1 );
p1 = android.view.View$MeasureSpec .getSize ( p1 );
/* const/high16 v1, -0x80000000 */
/* if-eq v0, v1, :cond_1 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* const/high16 v1, 0x40000000 # 2.0f */
/* if-eq v0, v1, :cond_0 */
} // :cond_0
/* move p0, p1 */
} // :cond_1
p0 = java.lang.Math .min ( p0,p1 );
} // :cond_2
} // :goto_0
} // .end method
/* # virtual methods */
public void draw ( android.graphics.Canvas p0 ) {
/* .locals 0 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "MissingSuperCall" */
/* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
return;
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
v0 = (( android.support.v4.widget.Space ) p0 ).getSuggestedMinimumWidth ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/Space;->getSuggestedMinimumWidth()I
p1 = android.support.v4.widget.Space .a ( v0,p1 );
v0 = (( android.support.v4.widget.Space ) p0 ).getSuggestedMinimumHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/Space;->getSuggestedMinimumHeight()I
p2 = android.support.v4.widget.Space .a ( v0,p2 );
(( android.support.v4.widget.Space ) p0 ).setMeasuredDimension ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/support/v4/widget/Space;->setMeasuredDimension(II)V
return;
} // .end method
