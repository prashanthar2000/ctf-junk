public class android.support.v4.widget.NestedScrollView extends android.widget.FrameLayout implements ee implements eh {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/v4/widget/NestedScrollView$a;, */
	 /* Landroid/support/v4/widget/NestedScrollView$c;, */
	 /* Landroid/support/v4/widget/NestedScrollView$b; */
	 /* } */
} // .end annotation
/* # static fields */
private static final android.support.v4.widget.NestedScrollView$a a;
private static final c;
/* # instance fields */
private Float a;
private Integer a;
private Long a;
private final android.graphics.Rect a;
private android.support.v4.widget.NestedScrollView$b a;
private android.support.v4.widget.NestedScrollView$c a;
private android.view.VelocityTracker a;
private android.view.View a;
private android.widget.EdgeEffect a;
private android.widget.OverScroller a;
private final ef a;
private final ei a;
private Boolean a;
private final a;
private Integer b;
private android.widget.EdgeEffect b;
private Boolean b;
private final b;
private Integer c;
private Boolean c;
private Integer d;
private Boolean d;
private Integer e;
private Boolean e;
private Integer f;
private Integer g;
/* # direct methods */
static android.support.v4.widget.NestedScrollView ( ) {
	 /* .locals 3 */
	 /* new-instance v0, Landroid/support/v4/widget/NestedScrollView$a; */
	 /* invoke-direct {v0}, Landroid/support/v4/widget/NestedScrollView$a;-><init>()V */
	 int v0 = 1; // const/4 v0, 0x1
	 /* new-array v0, v0, [I */
	 int v1 = 0; // const/4 v1, 0x0
	 /* const v2, 0x101017a */
	 /* aput v2, v0, v1 */
	 return;
} // .end method
public android.support.v4.widget.NestedScrollView ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, p1, v0}, Landroid/support/v4/widget/NestedScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 return;
} // .end method
public android.support.v4.widget.NestedScrollView ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, p1, p2, v0}, Landroid/support/v4/widget/NestedScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 return;
} // .end method
public android.support.v4.widget.NestedScrollView ( ) {
	 /* .locals 4 */
	 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 /* new-instance v0, Landroid/graphics/Rect; */
	 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
	 this.a = v0;
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput-boolean v0, p0, Landroid/support/v4/widget/NestedScrollView;->a:Z */
	 int v1 = 0; // const/4 v1, 0x0
	 /* iput-boolean v1, p0, Landroid/support/v4/widget/NestedScrollView;->b:Z */
	 int v2 = 0; // const/4 v2, 0x0
	 this.a = v2;
	 /* iput-boolean v1, p0, Landroid/support/v4/widget/NestedScrollView;->c:Z */
	 /* iput-boolean v0, p0, Landroid/support/v4/widget/NestedScrollView;->e:Z */
	 int v2 = -1; // const/4 v2, -0x1
	 /* iput v2, p0, Landroid/support/v4/widget/NestedScrollView;->e:I */
	 int v2 = 2; // const/4 v2, 0x2
	 /* new-array v3, v2, [I */
	 this.a = v3;
	 /* new-array v2, v2, [I */
	 this.b = v2;
	 /* new-instance v2, Landroid/widget/OverScroller; */
	 (( android.support.v4.widget.NestedScrollView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getContext()Landroid/content/Context;
	 /* invoke-direct {v2, v3}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V */
	 this.a = v2;
	 (( android.support.v4.widget.NestedScrollView ) p0 ).setFocusable ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/NestedScrollView;->setFocusable(Z)V
	 /* const/high16 v2, 0x40000 */
	 (( android.support.v4.widget.NestedScrollView ) p0 ).setDescendantFocusability ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/v4/widget/NestedScrollView;->setDescendantFocusability(I)V
	 (( android.support.v4.widget.NestedScrollView ) p0 ).setWillNotDraw ( v1 ); // invoke-virtual {p0, v1}, Landroid/support/v4/widget/NestedScrollView;->setWillNotDraw(Z)V
	 (( android.support.v4.widget.NestedScrollView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getContext()Landroid/content/Context;
	 android.view.ViewConfiguration .get ( v2 );
	 v3 = 	 (( android.view.ViewConfiguration ) v2 ).getScaledTouchSlop ( ); // invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I
	 /* iput v3, p0, Landroid/support/v4/widget/NestedScrollView;->b:I */
	 v3 = 	 (( android.view.ViewConfiguration ) v2 ).getScaledMinimumFlingVelocity ( ); // invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I
	 /* iput v3, p0, Landroid/support/v4/widget/NestedScrollView;->c:I */
	 v2 = 	 (( android.view.ViewConfiguration ) v2 ).getScaledMaximumFlingVelocity ( ); // invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I
	 /* iput v2, p0, Landroid/support/v4/widget/NestedScrollView;->d:I */
	 v2 = android.support.v4.widget.NestedScrollView.c;
	 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v2, p3, v1 ); // invoke-virtual {p1, p2, v2, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
	 p2 = 	 (( android.content.res.TypedArray ) p1 ).getBoolean ( v1, v1 ); // invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
	 (( android.support.v4.widget.NestedScrollView ) p0 ).setFillViewport ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v4/widget/NestedScrollView;->setFillViewport(Z)V
	 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
	 /* new-instance p1, Lei; */
	 /* invoke-direct {p1, p0}, Lei;-><init>(Landroid/view/ViewGroup;)V */
	 this.a = p1;
	 /* new-instance p1, Lef; */
	 /* invoke-direct {p1, p0}, Lef;-><init>(Landroid/view/View;)V */
	 this.a = p1;
	 (( android.support.v4.widget.NestedScrollView ) p0 ).setNestedScrollingEnabled ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/NestedScrollView;->setNestedScrollingEnabled(Z)V
	 p1 = android.support.v4.widget.NestedScrollView.a;
	 em .a ( p0,p1 );
	 return;
} // .end method
private static Integer a ( Integer p0, Integer p1, Integer p2 ) {
	 /* .locals 1 */
	 /* if-ge p1, p2, :cond_2 */
	 /* if-gez p0, :cond_0 */
} // :cond_0
/* add-int v0, p1, p0 */
/* if-le v0, p2, :cond_1 */
/* sub-int/2addr p2, p1 */
} // :cond_1
} // :cond_2
} // :goto_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
private Integer a ( android.graphics.Rect p0 ) {
/* .locals 10 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
} // :cond_0
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getHeight()I
v2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
/* add-int v3, v2, v0 */
v4 = (( android.support.v4.widget.NestedScrollView ) p0 ).getVerticalFadingEdgeLength ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getVerticalFadingEdgeLength()I
/* iget v5, p1, Landroid/graphics/Rect;->top:I */
/* if-lez v5, :cond_1 */
/* add-int/2addr v2, v4 */
} // :cond_1
(( android.support.v4.widget.NestedScrollView ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/support/v4/widget/NestedScrollView;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v5 ).getLayoutParams ( ); // invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v6, Landroid/widget/FrameLayout$LayoutParams; */
/* iget v7, p1, Landroid/graphics/Rect;->bottom:I */
v8 = (( android.view.View ) v5 ).getHeight ( ); // invoke-virtual {v5}, Landroid/view/View;->getHeight()I
/* iget v9, v6, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v8, v9 */
/* iget v9, v6, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v8, v9 */
/* if-ge v7, v8, :cond_2 */
/* sub-int v4, v3, v4 */
} // :cond_2
/* move v4, v3 */
} // :goto_0
/* iget v7, p1, Landroid/graphics/Rect;->bottom:I */
/* if-le v7, v4, :cond_4 */
/* iget v7, p1, Landroid/graphics/Rect;->top:I */
/* if-le v7, v2, :cond_4 */
v7 = (( android.graphics.Rect ) p1 ).height ( ); // invoke-virtual {p1}, Landroid/graphics/Rect;->height()I
/* if-le v7, v0, :cond_3 */
/* iget p1, p1, Landroid/graphics/Rect;->top:I */
/* sub-int/2addr p1, v2 */
} // :cond_3
/* iget p1, p1, Landroid/graphics/Rect;->bottom:I */
/* sub-int/2addr p1, v4 */
} // :goto_1
/* add-int/2addr p1, v1 */
v0 = (( android.view.View ) v5 ).getBottom ( ); // invoke-virtual {v5}, Landroid/view/View;->getBottom()I
/* iget v1, v6, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v0, v1 */
/* sub-int/2addr v0, v3 */
v1 = java.lang.Math .min ( p1,v0 );
} // :cond_4
/* iget v3, p1, Landroid/graphics/Rect;->top:I */
/* if-ge v3, v2, :cond_6 */
/* iget v3, p1, Landroid/graphics/Rect;->bottom:I */
/* if-ge v3, v4, :cond_6 */
v3 = (( android.graphics.Rect ) p1 ).height ( ); // invoke-virtual {p1}, Landroid/graphics/Rect;->height()I
/* if-le v3, v0, :cond_5 */
/* iget p1, p1, Landroid/graphics/Rect;->bottom:I */
/* sub-int/2addr v4, p1 */
/* sub-int/2addr v1, v4 */
} // :cond_5
/* iget p1, p1, Landroid/graphics/Rect;->top:I */
/* sub-int/2addr v2, p1 */
/* sub-int/2addr v1, v2 */
} // :goto_2
p1 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
/* neg-int p1, p1 */
v1 = java.lang.Math .max ( v1,p1 );
} // :cond_6
} // :goto_3
} // .end method
private android.view.View a ( Boolean p0, Integer p1, Integer p2 ) {
/* .locals 12 */
int v0 = 2; // const/4 v0, 0x2
v1 = (( android.support.v4.widget.NestedScrollView ) p0 ).getFocusables ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/NestedScrollView;->getFocusables(I)Ljava/util/ArrayList;
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
/* move-object v4, v3 */
int v3 = 0; // const/4 v3, 0x0
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
/* if-ge v3, v1, :cond_8 */
/* check-cast v6, Landroid/view/View; */
v7 = (( android.view.View ) v6 ).getTop ( ); // invoke-virtual {v6}, Landroid/view/View;->getTop()I
v8 = (( android.view.View ) v6 ).getBottom ( ); // invoke-virtual {v6}, Landroid/view/View;->getBottom()I
int v9 = 1; // const/4 v9, 0x1
/* if-ge p2, v8, :cond_7 */
/* if-ge v7, p3, :cond_7 */
/* if-ge p2, v7, :cond_0 */
/* if-ge v8, p3, :cond_0 */
int v10 = 1; // const/4 v10, 0x1
} // :cond_0
int v10 = 0; // const/4 v10, 0x0
} // :goto_1
/* if-nez v4, :cond_1 */
/* move-object v4, v6 */
/* move v5, v10 */
} // :cond_1
if ( p1 != null) { // if-eqz p1, :cond_2
v11 = (( android.view.View ) v4 ).getTop ( ); // invoke-virtual {v4}, Landroid/view/View;->getTop()I
/* if-lt v7, v11, :cond_3 */
} // :cond_2
/* if-nez p1, :cond_4 */
v7 = (( android.view.View ) v4 ).getBottom ( ); // invoke-virtual {v4}, Landroid/view/View;->getBottom()I
/* if-le v8, v7, :cond_4 */
} // :cond_3
int v7 = 1; // const/4 v7, 0x1
} // :cond_4
int v7 = 0; // const/4 v7, 0x0
} // :goto_2
if ( v5 != null) { // if-eqz v5, :cond_5
if ( v10 != null) { // if-eqz v10, :cond_7
if ( v7 != null) { // if-eqz v7, :cond_7
} // :cond_5
if ( v10 != null) { // if-eqz v10, :cond_6
/* move-object v4, v6 */
int v5 = 1; // const/4 v5, 0x1
} // :cond_6
if ( v7 != null) { // if-eqz v7, :cond_7
} // :goto_3
/* move-object v4, v6 */
} // :cond_7
} // :goto_4
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_8
} // .end method
private void a ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
android.view.VelocityTracker .obtain ( );
this.a = v0;
} // :cond_0
return;
} // .end method
private void a ( android.view.MotionEvent p0 ) {
/* .locals 3 */
v0 = (( android.view.MotionEvent ) p1 ).getActionIndex ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I
v1 = (( android.view.MotionEvent ) p1 ).getPointerId ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iget v2, p0, Landroid/support/v4/widget/NestedScrollView;->e:I */
/* if-ne v1, v2, :cond_1 */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v1 = (( android.view.MotionEvent ) p1 ).getY ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F
/* float-to-int v1, v1 */
/* iput v1, p0, Landroid/support/v4/widget/NestedScrollView;->a:I */
p1 = (( android.view.MotionEvent ) p1 ).getPointerId ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput p1, p0, Landroid/support/v4/widget/NestedScrollView;->e:I */
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_1
(( android.view.VelocityTracker ) p1 ).clear ( ); // invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V
} // :cond_1
return;
} // .end method
private void a ( android.view.View p0 ) {
/* .locals 1 */
v0 = this.a;
(( android.view.View ) p1 ).getDrawingRect ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V
v0 = this.a;
(( android.support.v4.widget.NestedScrollView ) p0 ).offsetDescendantRectToMyCoords ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/NestedScrollView;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V
p1 = this.a;
p1 = /* invoke-direct {p0, p1}, Landroid/support/v4/widget/NestedScrollView;->a(Landroid/graphics/Rect;)I */
if ( p1 != null) { // if-eqz p1, :cond_0
int v0 = 0; // const/4 v0, 0x0
(( android.support.v4.widget.NestedScrollView ) p0 ).scrollBy ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Landroid/support/v4/widget/NestedScrollView;->scrollBy(II)V
} // :cond_0
return;
} // .end method
private Boolean a ( ) {
/* .locals 4 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
/* if-lez v0, :cond_0 */
(( android.support.v4.widget.NestedScrollView ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/support/v4/widget/NestedScrollView;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroid/widget/FrameLayout$LayoutParams; */
v0 = (( android.view.View ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/view/View;->getHeight()I
/* iget v3, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v0, v3 */
/* iget v2, v2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v0, v2 */
v2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getHeight()I
v3 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingTop()I
/* sub-int/2addr v2, v3 */
v3 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingBottom()I
/* sub-int/2addr v2, v3 */
/* if-le v0, v2, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
} // .end method
private Boolean a ( Integer p0 ) {
/* .locals 1 */
v0 = this.a;
p1 = (( ef ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lef;->a(I)Z
} // .end method
private Boolean a ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 6 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getHeight()I
v1 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
/* add-int/2addr v0, v1 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
/* const/16 v4, 0x21 */
/* if-ne p1, v4, :cond_0 */
int v4 = 1; // const/4 v4, 0x1
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* invoke-direct {p0, v4, p2, p3}, Landroid/support/v4/widget/NestedScrollView;->a(ZII)Landroid/view/View; */
/* if-nez v5, :cond_1 */
/* move-object v5, p0 */
} // :cond_1
/* if-lt p2, v1, :cond_2 */
/* if-gt p3, v0, :cond_2 */
} // :cond_2
if ( v4 != null) { // if-eqz v4, :cond_3
/* sub-int/2addr p2, v1 */
} // :cond_3
/* sub-int p2, p3, v0 */
} // :goto_1
/* invoke-direct {p0, p2}, Landroid/support/v4/widget/NestedScrollView;->d(I)V */
int v2 = 1; // const/4 v2, 0x1
} // :goto_2
(( android.support.v4.widget.NestedScrollView ) p0 ).findFocus ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->findFocus()Landroid/view/View;
/* if-eq v5, p2, :cond_4 */
(( android.view.View ) v5 ).requestFocus ( p1 ); // invoke-virtual {v5, p1}, Landroid/view/View;->requestFocus(I)Z
} // :cond_4
} // .end method
private Boolean a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 9 */
(( android.support.v4.widget.NestedScrollView ) p0 ).getOverScrollMode ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getOverScrollMode()I
(( android.support.v4.widget.NestedScrollView ) p0 ).computeHorizontalScrollRange ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->computeHorizontalScrollRange()I
(( android.support.v4.widget.NestedScrollView ) p0 ).computeHorizontalScrollExtent ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->computeHorizontalScrollExtent()I
(( android.support.v4.widget.NestedScrollView ) p0 ).computeVerticalScrollRange ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->computeVerticalScrollRange()I
(( android.support.v4.widget.NestedScrollView ) p0 ).computeVerticalScrollExtent ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->computeVerticalScrollExtent()I
int v0 = 0; // const/4 v0, 0x0
/* add-int/2addr p2, v0 */
/* add-int/2addr p1, p3 */
/* add-int/lit8 p3, p4, 0x0 */
int p4 = 1; // const/4 p4, 0x1
/* if-lez p2, :cond_0 */
} // :goto_0
int p2 = 0; // const/4 p2, 0x0
int v8 = 1; // const/4 v8, 0x1
} // :cond_0
/* if-gez p2, :cond_1 */
} // :cond_1
int v8 = 0; // const/4 v8, 0x0
} // :goto_1
/* if-le p1, p3, :cond_2 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_2
/* if-gez p1, :cond_3 */
int p1 = 1; // const/4 p1, 0x1
int p3 = 0; // const/4 p3, 0x0
} // :cond_3
/* move p3, p1 */
int p1 = 0; // const/4 p1, 0x0
} // :goto_2
if ( p1 != null) { // if-eqz p1, :cond_4
v1 = /* invoke-direct {p0, p4}, Landroid/support/v4/widget/NestedScrollView;->a(I)Z */
/* if-nez v1, :cond_4 */
v1 = this.a;
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
v7 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollRange ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollRange()I
/* move v2, p2 */
/* move v3, p3 */
/* invoke-virtual/range {v1 ..v7}, Landroid/widget/OverScroller;->springBack(IIIIII)Z */
} // :cond_4
(( android.support.v4.widget.NestedScrollView ) p0 ).onOverScrolled ( p2, p3, v8, p1 ); // invoke-virtual {p0, p2, p3, v8, p1}, Landroid/support/v4/widget/NestedScrollView;->onOverScrolled(IIZZ)V
/* if-nez v8, :cond_6 */
if ( p1 != null) { // if-eqz p1, :cond_5
} // :cond_5
} // :cond_6
} // :goto_3
} // .end method
private Boolean a ( Integer p0, Integer p1, Integer p2, Integer p3, Integer[] p4, Integer p5 ) {
/* .locals 7 */
v0 = this.a;
/* move v1, p1 */
/* move v2, p2 */
/* move v3, p3 */
/* move v4, p4 */
/* move-object v5, p5 */
/* move v6, p6 */
p1 = /* invoke-virtual/range {v0 ..v6}, Lef;->a(IIII[II)Z */
} // .end method
private Boolean a ( Integer p0, Integer p1, Integer[] p2, Integer[] p3, Integer p4 ) {
/* .locals 6 */
v0 = this.a;
/* move v1, p1 */
/* move v2, p2 */
/* move-object v3, p3 */
/* move-object v4, p4 */
/* move v5, p5 */
p1 = /* invoke-virtual/range {v0 ..v5}, Lef;->a(II[I[II)Z */
} // .end method
private Boolean a ( android.view.View p0 ) {
/* .locals 2 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getHeight()I
int v1 = 0; // const/4 v1, 0x0
p1 = /* invoke-direct {p0, p1, v1, v0}, Landroid/support/v4/widget/NestedScrollView;->a(Landroid/view/View;II)Z */
/* if-nez p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
} // .end method
private Boolean a ( android.view.View p0, Integer p1, Integer p2 ) {
/* .locals 1 */
v0 = this.a;
(( android.view.View ) p1 ).getDrawingRect ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V
v0 = this.a;
(( android.support.v4.widget.NestedScrollView ) p0 ).offsetDescendantRectToMyCoords ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/NestedScrollView;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V
p1 = this.a;
/* iget p1, p1, Landroid/graphics/Rect;->bottom:I */
/* add-int/2addr p1, p2 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
/* if-lt p1, v0, :cond_0 */
p1 = this.a;
/* iget p1, p1, Landroid/graphics/Rect;->top:I */
/* sub-int/2addr p1, p2 */
p2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
/* add-int/2addr p2, p3 */
/* if-gt p1, p2, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
private static Boolean a ( android.view.View p0, android.view.View p1 ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p0, p1, :cond_0 */
} // :cond_0
(( android.view.View ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* instance-of v1, p0, Landroid/view/ViewGroup; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast p0, Landroid/view/View; */
p0 = android.support.v4.widget.NestedScrollView .a ( p0,p1 );
if ( p0 != null) { // if-eqz p0, :cond_1
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // .end method
private void b ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.view.VelocityTracker ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
} // :cond_0
return;
} // .end method
private void b ( Integer p0, Integer p1 ) {
/* .locals 5 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getChildCount()I
/* if-nez v0, :cond_0 */
return;
} // :cond_0
android.view.animation.AnimationUtils .currentAnimationTimeMillis ( );
/* move-result-wide v0 */
/* iget-wide v2, p0, Landroid/support/v4/widget/NestedScrollView;->a:J */
/* sub-long/2addr v0, v2 */
/* const-wide/16 v2, 0xfa */
/* cmp-long v4, v0, v2 */
/* if-lez v4, :cond_1 */
int p1 = 0; // const/4 p1, 0x0
(( android.support.v4.widget.NestedScrollView ) p0 ).getChildAt ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/NestedScrollView;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/widget/FrameLayout$LayoutParams; */
v0 = (( android.view.View ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/view/View;->getHeight()I
/* iget v2, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v0, v2 */
/* iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v0, v1 */
v1 = (( android.support.v4.widget.NestedScrollView ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getHeight()I
v2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingTop()I
/* sub-int/2addr v1, v2 */
v2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingBottom()I
/* sub-int/2addr v1, v2 */
v2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
/* sub-int/2addr v0, v1 */
v0 = java.lang.Math .max ( p1,v0 );
/* add-int/2addr p2, v2 */
p2 = java.lang.Math .min ( p2,v0 );
p2 = java.lang.Math .max ( p1,p2 );
/* sub-int/2addr p2, v2 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
/* iput v0, p0, Landroid/support/v4/widget/NestedScrollView;->g:I */
v0 = this.a;
v1 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollX()I
(( android.widget.OverScroller ) v0 ).startScroll ( v1, v2, p1, p2 ); // invoke-virtual {v0, v1, v2, p1, p2}, Landroid/widget/OverScroller;->startScroll(IIII)V
em .a ( p0 );
} // :cond_1
v0 = this.a;
v0 = (( android.widget.OverScroller ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z
/* if-nez v0, :cond_2 */
v0 = this.a;
(( android.widget.OverScroller ) v0 ).abortAnimation ( ); // invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V
} // :cond_2
(( android.support.v4.widget.NestedScrollView ) p0 ).scrollBy ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/support/v4/widget/NestedScrollView;->scrollBy(II)V
} // :goto_0
android.view.animation.AnimationUtils .currentAnimationTimeMillis ( );
/* move-result-wide p1 */
/* iput-wide p1, p0, Landroid/support/v4/widget/NestedScrollView;->a:J */
return;
} // .end method
private Boolean b ( Integer p0 ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* const/16 v2, 0x82 */
/* if-ne p1, v2, :cond_0 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
v3 = (( android.support.v4.widget.NestedScrollView ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getHeight()I
if ( v2 != null) { // if-eqz v2, :cond_1
v1 = this.a;
v2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
/* add-int/2addr v2, v3 */
/* iput v2, v1, Landroid/graphics/Rect;->top:I */
v1 = (( android.support.v4.widget.NestedScrollView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getChildCount()I
/* if-lez v1, :cond_2 */
/* sub-int/2addr v1, v0 */
(( android.support.v4.widget.NestedScrollView ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/support/v4/widget/NestedScrollView;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/widget/FrameLayout$LayoutParams; */
v0 = (( android.view.View ) v0 ).getBottom ( ); // invoke-virtual {v0}, Landroid/view/View;->getBottom()I
/* iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v0, v1 */
v1 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingBottom()I
/* add-int/2addr v0, v1 */
v1 = this.a;
/* iget v1, v1, Landroid/graphics/Rect;->top:I */
/* add-int/2addr v1, v3 */
/* if-le v1, v0, :cond_2 */
v1 = this.a;
/* sub-int/2addr v0, v3 */
/* iput v0, v1, Landroid/graphics/Rect;->top:I */
} // :cond_1
v0 = this.a;
v2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
/* sub-int/2addr v2, v3 */
/* iput v2, v0, Landroid/graphics/Rect;->top:I */
v0 = this.a;
/* iget v0, v0, Landroid/graphics/Rect;->top:I */
/* if-gez v0, :cond_2 */
v0 = this.a;
/* iput v1, v0, Landroid/graphics/Rect;->top:I */
} // :cond_2
} // :goto_1
v0 = this.a;
/* iget v1, v0, Landroid/graphics/Rect;->top:I */
/* add-int/2addr v1, v3 */
/* iput v1, v0, Landroid/graphics/Rect;->bottom:I */
v0 = this.a;
/* iget v0, v0, Landroid/graphics/Rect;->top:I */
v1 = this.a;
/* iget v1, v1, Landroid/graphics/Rect;->bottom:I */
p1 = /* invoke-direct {p0, p1, v0, v1}, Landroid/support/v4/widget/NestedScrollView;->a(III)Z */
} // .end method
private Boolean b ( Integer p0, Integer p1 ) {
/* .locals 1 */
v0 = this.a;
p1 = (( ef ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lef;->a(II)Z
} // .end method
private void c ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Landroid/support/v4/widget/NestedScrollView;->c:Z */
/* invoke-direct {p0}, Landroid/support/v4/widget/NestedScrollView;->b()V */
/* invoke-direct {p0, v0}, Landroid/support/v4/widget/NestedScrollView;->c(I)V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.widget.EdgeEffect ) v0 ).onRelease ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V
v0 = this.b;
(( android.widget.EdgeEffect ) v0 ).onRelease ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V
} // :cond_0
return;
} // .end method
private void c ( Integer p0 ) {
/* .locals 1 */
v0 = this.a;
(( ef ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lef;->a(I)V
return;
} // .end method
private Boolean c ( Integer p0 ) {
/* .locals 5 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* const/16 v2, 0x82 */
/* if-ne p1, v2, :cond_0 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
v3 = (( android.support.v4.widget.NestedScrollView ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getHeight()I
v4 = this.a;
/* iput v1, v4, Landroid/graphics/Rect;->top:I */
/* iput v3, v4, Landroid/graphics/Rect;->bottom:I */
if ( v2 != null) { // if-eqz v2, :cond_1
v1 = (( android.support.v4.widget.NestedScrollView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getChildCount()I
/* if-lez v1, :cond_1 */
/* sub-int/2addr v1, v0 */
(( android.support.v4.widget.NestedScrollView ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/support/v4/widget/NestedScrollView;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/widget/FrameLayout$LayoutParams; */
v2 = this.a;
v0 = (( android.view.View ) v0 ).getBottom ( ); // invoke-virtual {v0}, Landroid/view/View;->getBottom()I
/* iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v0, v1 */
v1 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingBottom()I
/* add-int/2addr v0, v1 */
/* iput v0, v2, Landroid/graphics/Rect;->bottom:I */
v0 = this.a;
/* iget v1, v0, Landroid/graphics/Rect;->bottom:I */
/* sub-int/2addr v1, v3 */
/* iput v1, v0, Landroid/graphics/Rect;->top:I */
} // :cond_1
v0 = this.a;
/* iget v0, v0, Landroid/graphics/Rect;->top:I */
v1 = this.a;
/* iget v1, v1, Landroid/graphics/Rect;->bottom:I */
p1 = /* invoke-direct {p0, p1, v0, v1}, Landroid/support/v4/widget/NestedScrollView;->a(III)Z */
} // .end method
private void d ( ) {
/* .locals 2 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getOverScrollMode ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getOverScrollMode()I
int v1 = 2; // const/4 v1, 0x2
/* if-eq v0, v1, :cond_0 */
v0 = this.a;
/* if-nez v0, :cond_1 */
(( android.support.v4.widget.NestedScrollView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getContext()Landroid/content/Context;
/* new-instance v1, Landroid/widget/EdgeEffect; */
/* invoke-direct {v1, v0}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V */
this.a = v1;
/* new-instance v1, Landroid/widget/EdgeEffect; */
/* invoke-direct {v1, v0}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V */
this.b = v1;
return;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
this.b = v0;
} // :cond_1
return;
} // .end method
private void d ( Integer p0 ) {
/* .locals 2 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* iget-boolean v0, p0, Landroid/support/v4/widget/NestedScrollView;->e:Z */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* invoke-direct {p0, v1, p1}, Landroid/support/v4/widget/NestedScrollView;->b(II)V */
return;
} // :cond_0
(( android.support.v4.widget.NestedScrollView ) p0 ).scrollBy ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Landroid/support/v4/widget/NestedScrollView;->scrollBy(II)V
} // :cond_1
return;
} // .end method
private Boolean d ( Integer p0 ) {
/* .locals 7 */
(( android.support.v4.widget.NestedScrollView ) p0 ).findFocus ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->findFocus()Landroid/view/View;
/* if-ne v0, p0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
android.view.FocusFinder .getInstance ( );
(( android.view.FocusFinder ) v1 ).findNextFocus ( p0, v0, p1 ); // invoke-virtual {v1, p0, v0, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
v2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getMaxScrollAmount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getMaxScrollAmount()I
if ( v1 != null) { // if-eqz v1, :cond_1
v3 = (( android.support.v4.widget.NestedScrollView ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getHeight()I
v3 = /* invoke-direct {p0, v1, v2, v3}, Landroid/support/v4/widget/NestedScrollView;->a(Landroid/view/View;II)Z */
if ( v3 != null) { // if-eqz v3, :cond_1
v2 = this.a;
(( android.view.View ) v1 ).getDrawingRect ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V
v2 = this.a;
(( android.support.v4.widget.NestedScrollView ) p0 ).offsetDescendantRectToMyCoords ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroid/support/v4/widget/NestedScrollView;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V
v2 = this.a;
v2 = /* invoke-direct {p0, v2}, Landroid/support/v4/widget/NestedScrollView;->a(Landroid/graphics/Rect;)I */
/* invoke-direct {p0, v2}, Landroid/support/v4/widget/NestedScrollView;->d(I)V */
(( android.view.View ) v1 ).requestFocus ( p1 ); // invoke-virtual {v1, p1}, Landroid/view/View;->requestFocus(I)Z
} // :cond_1
/* const/16 v1, 0x21 */
int v3 = 0; // const/4 v3, 0x0
/* const/16 v4, 0x82 */
/* if-ne p1, v1, :cond_2 */
v1 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
/* if-ge v1, v2, :cond_2 */
v2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
} // :cond_2
/* if-ne p1, v4, :cond_3 */
v1 = (( android.support.v4.widget.NestedScrollView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getChildCount()I
/* if-lez v1, :cond_3 */
(( android.support.v4.widget.NestedScrollView ) p0 ).getChildAt ( v3 ); // invoke-virtual {p0, v3}, Landroid/support/v4/widget/NestedScrollView;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v5, Landroid/widget/FrameLayout$LayoutParams; */
v1 = (( android.view.View ) v1 ).getBottom ( ); // invoke-virtual {v1}, Landroid/view/View;->getBottom()I
/* iget v5, v5, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v1, v5 */
v5 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
v6 = (( android.support.v4.widget.NestedScrollView ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getHeight()I
/* add-int/2addr v5, v6 */
v6 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingBottom()I
/* sub-int/2addr v5, v6 */
/* sub-int/2addr v1, v5 */
v2 = java.lang.Math .min ( v1,v2 );
} // :cond_3
} // :goto_0
/* if-nez v2, :cond_4 */
} // :cond_4
/* if-ne p1, v4, :cond_5 */
} // :cond_5
/* neg-int v2, v2 */
} // :goto_1
/* invoke-direct {p0, v2}, Landroid/support/v4/widget/NestedScrollView;->d(I)V */
} // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_6
p1 = (( android.view.View ) v0 ).isFocused ( ); // invoke-virtual {v0}, Landroid/view/View;->isFocused()Z
if ( p1 != null) { // if-eqz p1, :cond_6
p1 = /* invoke-direct {p0, v0}, Landroid/support/v4/widget/NestedScrollView;->a(Landroid/view/View;)Z */
if ( p1 != null) { // if-eqz p1, :cond_6
p1 = (( android.support.v4.widget.NestedScrollView ) p0 ).getDescendantFocusability ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getDescendantFocusability()I
/* const/high16 v0, 0x20000 */
(( android.support.v4.widget.NestedScrollView ) p0 ).setDescendantFocusability ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/NestedScrollView;->setDescendantFocusability(I)V
(( android.support.v4.widget.NestedScrollView ) p0 ).requestFocus ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->requestFocus()Z
(( android.support.v4.widget.NestedScrollView ) p0 ).setDescendantFocusability ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/NestedScrollView;->setDescendantFocusability(I)V
} // :cond_6
int p1 = 1; // const/4 p1, 0x1
} // .end method
private void e ( Integer p0 ) {
/* .locals 13 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getChildCount()I
/* if-lez v0, :cond_0 */
int v0 = 2; // const/4 v0, 0x2
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {p0, v0, v1}, Landroid/support/v4/widget/NestedScrollView;->b(II)Z */
v2 = this.a;
v3 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollX()I
v4 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
int v5 = 0; // const/4 v5, 0x0
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
/* const/high16 v9, -0x80000000 */
/* const v10, 0x7fffffff */
int v11 = 0; // const/4 v11, 0x0
int v12 = 0; // const/4 v12, 0x0
/* move v6, p1 */
/* invoke-virtual/range {v2 ..v12}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V */
p1 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
/* iput p1, p0, Landroid/support/v4/widget/NestedScrollView;->g:I */
em .a ( p0 );
} // :cond_0
return;
} // .end method
private void f ( Integer p0 ) {
/* .locals 4 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
/* if-gtz v0, :cond_0 */
/* if-lez p1, :cond_1 */
} // :cond_0
v1 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollRange ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollRange()I
/* if-lt v0, v1, :cond_2 */
/* if-gez p1, :cond_1 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :cond_2
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
/* int-to-float v1, p1 */
int v2 = 0; // const/4 v2, 0x0
v3 = (( android.support.v4.widget.NestedScrollView ) p0 ).dispatchNestedPreFling ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Landroid/support/v4/widget/NestedScrollView;->dispatchNestedPreFling(FF)Z
/* if-nez v3, :cond_3 */
(( android.support.v4.widget.NestedScrollView ) p0 ).dispatchNestedFling ( v2, v1, v0 ); // invoke-virtual {p0, v2, v1, v0}, Landroid/support/v4/widget/NestedScrollView;->dispatchNestedFling(FFZ)Z
/* invoke-direct {p0, p1}, Landroid/support/v4/widget/NestedScrollView;->e(I)V */
} // :cond_3
return;
} // .end method
private Float getVerticalScrollFactorCompat ( ) {
/* .locals 5 */
/* iget v0, p0, Landroid/support/v4/widget/NestedScrollView;->a:F */
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_1 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
(( android.support.v4.widget.NestedScrollView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getContext()Landroid/content/Context;
(( android.content.Context ) v1 ).getTheme ( ); // invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
/* const v3, 0x101004d */
int v4 = 1; // const/4 v4, 0x1
v2 = (( android.content.res.Resources$Theme ) v2 ).resolveAttribute ( v3, v0, v4 ); // invoke-virtual {v2, v3, v0, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
if ( v2 != null) { // if-eqz v2, :cond_0
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getDisplayMetrics ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
v0 = (( android.util.TypedValue ) v0 ).getDimension ( v1 ); // invoke-virtual {v0, v1}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F
/* iput v0, p0, Landroid/support/v4/widget/NestedScrollView;->a:F */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Expected theme to define listPreferredItemHeight."; // const-string v1, "Expected theme to define listPreferredItemHeight."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
} // :goto_0
/* iget v0, p0, Landroid/support/v4/widget/NestedScrollView;->a:F */
} // .end method
/* # virtual methods */
public final void a ( Integer p0 ) {
/* .locals 2 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollX()I
/* rsub-int/lit8 v0, v0, 0x0 */
v1 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
/* sub-int/2addr p1, v1 */
/* invoke-direct {p0, v0, p1}, Landroid/support/v4/widget/NestedScrollView;->b(II)V */
return;
} // .end method
public final void a ( Integer p0, Integer p1 ) {
/* .locals 9 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
int v1 = 0; // const/4 v1, 0x0
(( android.support.v4.widget.NestedScrollView ) p0 ).scrollBy ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Landroid/support/v4/widget/NestedScrollView;->scrollBy(II)V
v1 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
/* sub-int v4, v1, v0 */
/* sub-int v6, p1, v4 */
int v3 = 0; // const/4 v3, 0x0
int v5 = 0; // const/4 v5, 0x0
int v7 = 0; // const/4 v7, 0x0
/* move-object v2, p0 */
/* move v8, p2 */
/* invoke-direct/range {v2 ..v8}, Landroid/support/v4/widget/NestedScrollView;->a(IIII[II)Z */
return;
} // .end method
public final void a ( Integer p0, Integer p1, Integer[] p2, Integer p3 ) {
/* .locals 6 */
int v4 = 0; // const/4 v4, 0x0
/* move-object v0, p0 */
/* move v1, p1 */
/* move v2, p2 */
/* move-object v3, p3 */
/* move v5, p4 */
/* invoke-direct/range {v0 ..v5}, Landroid/support/v4/widget/NestedScrollView;->a(II[I[II)Z */
return;
} // .end method
public final void a ( android.view.View p0, Integer p1, Integer p2 ) {
/* .locals 0 */
p1 = this.a;
/* iput p2, p1, Lei;->a:I */
int p1 = 2; // const/4 p1, 0x2
/* invoke-direct {p0, p1, p3}, Landroid/support/v4/widget/NestedScrollView;->b(II)Z */
return;
} // .end method
public final Boolean a ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* and-int/lit8 p1, p1, 0x2 */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final Boolean a ( android.view.KeyEvent p0 ) {
/* .locals 5 */
v0 = this.a;
(( android.graphics.Rect ) v0 ).setEmpty ( ); // invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V
v0 = /* invoke-direct {p0}, Landroid/support/v4/widget/NestedScrollView;->a()Z */
int v1 = 0; // const/4 v1, 0x0
/* const/16 v2, 0x82 */
/* if-nez v0, :cond_2 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).isFocused ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->isFocused()Z
if ( v0 != null) { // if-eqz v0, :cond_1
p1 = (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
int v0 = 4; // const/4 v0, 0x4
/* if-eq p1, v0, :cond_1 */
(( android.support.v4.widget.NestedScrollView ) p0 ).findFocus ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->findFocus()Landroid/view/View;
/* if-ne p1, p0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
android.view.FocusFinder .getInstance ( );
(( android.view.FocusFinder ) v0 ).findNextFocus ( p0, p1, v2 ); // invoke-virtual {v0, p0, p1, v2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
if ( p1 != null) { // if-eqz p1, :cond_1
/* if-eq p1, p0, :cond_1 */
p1 = (( android.view.View ) p1 ).requestFocus ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/View;->requestFocus(I)Z
if ( p1 != null) { // if-eqz p1, :cond_1
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
} // :cond_2
v0 = (( android.view.KeyEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I
/* if-nez v0, :cond_7 */
v0 = (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
/* const/16 v3, 0x3e */
/* const/16 v4, 0x21 */
/* if-eq v0, v3, :cond_5 */
/* packed-switch v0, :pswitch_data_0 */
/* :pswitch_0 */
p1 = (( android.view.KeyEvent ) p1 ).isAltPressed ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->isAltPressed()Z
/* if-nez p1, :cond_3 */
v1 = /* invoke-direct {p0, v2}, Landroid/support/v4/widget/NestedScrollView;->d(I)Z */
} // :cond_3
v1 = /* invoke-direct {p0, v2}, Landroid/support/v4/widget/NestedScrollView;->c(I)Z */
/* :pswitch_1 */
p1 = (( android.view.KeyEvent ) p1 ).isAltPressed ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->isAltPressed()Z
/* if-nez p1, :cond_4 */
v1 = /* invoke-direct {p0, v4}, Landroid/support/v4/widget/NestedScrollView;->d(I)Z */
} // :cond_4
v1 = /* invoke-direct {p0, v4}, Landroid/support/v4/widget/NestedScrollView;->c(I)Z */
} // :cond_5
p1 = (( android.view.KeyEvent ) p1 ).isShiftPressed ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z
if ( p1 != null) { // if-eqz p1, :cond_6
/* const/16 v2, 0x21 */
} // :cond_6
/* invoke-direct {p0, v2}, Landroid/support/v4/widget/NestedScrollView;->b(I)Z */
} // :cond_7
} // :goto_0
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x13 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public void addView ( android.view.View p0 ) {
/* .locals 1 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getChildCount()I
/* if-gtz v0, :cond_0 */
/* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V */
return;
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "ScrollView can host only one direct child"; // const-string v0, "ScrollView can host only one direct child"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void addView ( android.view.View p0, Integer p1 ) {
/* .locals 1 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getChildCount()I
/* if-gtz v0, :cond_0 */
/* invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;I)V */
return;
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "ScrollView can host only one direct child"; // const-string p2, "ScrollView can host only one direct child"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void addView ( android.view.View p0, Integer p1, android.view.ViewGroup$LayoutParams p2 ) {
/* .locals 1 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getChildCount()I
/* if-gtz v0, :cond_0 */
/* invoke-super {p0, p1, p2, p3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V */
return;
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "ScrollView can host only one direct child"; // const-string p2, "ScrollView can host only one direct child"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void addView ( android.view.View p0, android.view.ViewGroup$LayoutParams p1 ) {
/* .locals 1 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getChildCount()I
/* if-gtz v0, :cond_0 */
/* invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V */
return;
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "ScrollView can host only one direct child"; // const-string p2, "ScrollView can host only one direct child"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final void b ( Integer p0 ) {
/* .locals 2 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
/* iput v1, v0, Lei;->a:I */
/* invoke-direct {p0, p1}, Landroid/support/v4/widget/NestedScrollView;->c(I)V */
return;
} // .end method
public Integer computeHorizontalScrollExtent ( ) {
/* .locals 1 */
v0 = /* invoke-super {p0}, Landroid/widget/FrameLayout;->computeHorizontalScrollExtent()I */
} // .end method
public Integer computeHorizontalScrollOffset ( ) {
/* .locals 1 */
v0 = /* invoke-super {p0}, Landroid/widget/FrameLayout;->computeHorizontalScrollOffset()I */
} // .end method
public Integer computeHorizontalScrollRange ( ) {
/* .locals 1 */
v0 = /* invoke-super {p0}, Landroid/widget/FrameLayout;->computeHorizontalScrollRange()I */
} // .end method
public void computeScroll ( ) {
/* .locals 14 */
v0 = this.a;
v0 = (( android.widget.OverScroller ) v0 ).computeScrollOffset ( ); // invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
if ( v0 != null) { // if-eqz v0, :cond_5
v0 = this.a;
(( android.widget.OverScroller ) v0 ).getCurrX ( ); // invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I
v0 = this.a;
v0 = (( android.widget.OverScroller ) v0 ).getCurrY ( ); // invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I
/* iget v3, p0, Landroid/support/v4/widget/NestedScrollView;->g:I */
/* sub-int v3, v0, v3 */
int v5 = 0; // const/4 v5, 0x0
v7 = this.b;
int v8 = 0; // const/4 v8, 0x0
int v9 = 1; // const/4 v9, 0x1
/* move-object v4, p0 */
/* move v6, v3 */
v4 = /* invoke-direct/range {v4 ..v9}, Landroid/support/v4/widget/NestedScrollView;->a(II[I[II)Z */
if ( v4 != null) { // if-eqz v4, :cond_0
v4 = this.b;
/* aget v4, v4, v2 */
/* sub-int/2addr v3, v4 */
} // :cond_0
if ( v3 != null) { // if-eqz v3, :cond_4
v4 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollRange ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollRange()I
v5 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
v6 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollX()I
/* invoke-direct {p0, v3, v6, v5, v4}, Landroid/support/v4/widget/NestedScrollView;->a(IIII)Z */
v6 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
/* sub-int v9, v6, v5 */
/* sub-int v11, v3, v9 */
int v8 = 0; // const/4 v8, 0x0
int v10 = 0; // const/4 v10, 0x0
int v12 = 0; // const/4 v12, 0x0
int v13 = 1; // const/4 v13, 0x1
/* move-object v7, p0 */
v3 = /* invoke-direct/range {v7 ..v13}, Landroid/support/v4/widget/NestedScrollView;->a(IIII[II)Z */
/* if-nez v3, :cond_4 */
v3 = (( android.support.v4.widget.NestedScrollView ) p0 ).getOverScrollMode ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getOverScrollMode()I
if ( v3 != null) { // if-eqz v3, :cond_1
/* if-ne v3, v2, :cond_2 */
/* if-lez v4, :cond_2 */
} // :cond_1
int v1 = 1; // const/4 v1, 0x1
} // :cond_2
if ( v1 != null) { // if-eqz v1, :cond_4
/* invoke-direct {p0}, Landroid/support/v4/widget/NestedScrollView;->d()V */
/* if-gtz v0, :cond_3 */
/* if-lez v5, :cond_3 */
v1 = this.a;
} // :goto_0
v2 = this.a;
v2 = (( android.widget.OverScroller ) v2 ).getCurrVelocity ( ); // invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrVelocity()F
/* float-to-int v2, v2 */
(( android.widget.EdgeEffect ) v1 ).onAbsorb ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/EdgeEffect;->onAbsorb(I)V
} // :cond_3
/* if-lt v0, v4, :cond_4 */
/* if-ge v5, v4, :cond_4 */
v1 = this.b;
} // :cond_4
} // :goto_1
/* iput v0, p0, Landroid/support/v4/widget/NestedScrollView;->g:I */
em .a ( p0 );
return;
} // :cond_5
v0 = /* invoke-direct {p0, v2}, Landroid/support/v4/widget/NestedScrollView;->a(I)Z */
if ( v0 != null) { // if-eqz v0, :cond_6
/* invoke-direct {p0, v2}, Landroid/support/v4/widget/NestedScrollView;->c(I)V */
} // :cond_6
/* iput v1, p0, Landroid/support/v4/widget/NestedScrollView;->g:I */
return;
} // .end method
public Integer computeVerticalScrollExtent ( ) {
/* .locals 1 */
v0 = /* invoke-super {p0}, Landroid/widget/FrameLayout;->computeVerticalScrollExtent()I */
} // .end method
public Integer computeVerticalScrollOffset ( ) {
/* .locals 2 */
v0 = /* invoke-super {p0}, Landroid/widget/FrameLayout;->computeVerticalScrollOffset()I */
int v1 = 0; // const/4 v1, 0x0
v0 = java.lang.Math .max ( v1,v0 );
} // .end method
public Integer computeVerticalScrollRange ( ) {
/* .locals 4 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getChildCount()I
v1 = (( android.support.v4.widget.NestedScrollView ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getHeight()I
v2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingBottom()I
/* sub-int/2addr v1, v2 */
v2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingTop()I
/* sub-int/2addr v1, v2 */
/* if-nez v0, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
(( android.support.v4.widget.NestedScrollView ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/NestedScrollView;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Landroid/widget/FrameLayout$LayoutParams; */
v2 = (( android.view.View ) v2 ).getBottom ( ); // invoke-virtual {v2}, Landroid/view/View;->getBottom()I
/* iget v3, v3, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v2, v3 */
v3 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
/* sub-int v1, v2, v1 */
v0 = java.lang.Math .max ( v0,v1 );
/* if-gez v3, :cond_1 */
/* sub-int/2addr v2, v3 */
} // :cond_1
/* if-le v3, v0, :cond_2 */
/* sub-int/2addr v3, v0 */
/* add-int/2addr v2, v3 */
} // :cond_2
} // :goto_0
} // .end method
public Boolean dispatchKeyEvent ( android.view.KeyEvent p0 ) {
/* .locals 1 */
v0 = /* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z */
/* if-nez v0, :cond_1 */
p1 = (( android.support.v4.widget.NestedScrollView ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/NestedScrollView;->a(Landroid/view/KeyEvent;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean dispatchNestedFling ( Float p0, Float p1, Boolean p2 ) {
/* .locals 1 */
v0 = this.a;
p1 = (( ef ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lef;->a(FFZ)Z
} // .end method
public Boolean dispatchNestedPreFling ( Float p0, Float p1 ) {
/* .locals 1 */
v0 = this.a;
p1 = (( ef ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lef;->a(FF)Z
} // .end method
public Boolean dispatchNestedPreScroll ( Integer p0, Integer p1, Integer[] p2, Integer[] p3 ) {
/* .locals 6 */
int v5 = 0; // const/4 v5, 0x0
/* move-object v0, p0 */
/* move v1, p1 */
/* move v2, p2 */
/* move-object v3, p3 */
/* move-object v4, p4 */
p1 = /* invoke-direct/range {v0 ..v5}, Landroid/support/v4/widget/NestedScrollView;->a(II[I[II)Z */
} // .end method
public Boolean dispatchNestedScroll ( Integer p0, Integer p1, Integer p2, Integer p3, Integer[] p4 ) {
/* .locals 7 */
int v6 = 0; // const/4 v6, 0x0
/* move-object v0, p0 */
/* move v1, p1 */
/* move v2, p2 */
/* move v3, p3 */
/* move v4, p4 */
/* move-object v5, p5 */
p1 = /* invoke-direct/range {v0 ..v6}, Landroid/support/v4/widget/NestedScrollView;->a(IIII[II)Z */
} // .end method
public void draw ( android.graphics.Canvas p0 ) {
/* .locals 10 */
/* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_9
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
v1 = this.a;
v1 = (( android.widget.EdgeEffect ) v1 ).isFinished ( ); // invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z
/* const/16 v2, 0x15 */
int v3 = 0; // const/4 v3, 0x0
/* if-nez v1, :cond_4 */
v1 = (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
v4 = (( android.support.v4.widget.NestedScrollView ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getWidth()I
v5 = (( android.support.v4.widget.NestedScrollView ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getHeight()I
v6 = java.lang.Math .min ( v3,v0 );
/* if-lt v7, v2, :cond_1 */
v7 = (( android.support.v4.widget.NestedScrollView ) p0 ).getClipToPadding ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getClipToPadding()Z
if ( v7 != null) { // if-eqz v7, :cond_0
} // :cond_0
int v7 = 0; // const/4 v7, 0x0
} // :cond_1
} // :goto_0
v7 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingLeft()I
v8 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingRight()I
/* add-int/2addr v7, v8 */
/* sub-int/2addr v4, v7 */
v7 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingLeft()I
/* add-int/2addr v7, v3 */
} // :goto_1
/* if-lt v8, v2, :cond_2 */
v8 = (( android.support.v4.widget.NestedScrollView ) p0 ).getClipToPadding ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getClipToPadding()Z
if ( v8 != null) { // if-eqz v8, :cond_2
v8 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingTop()I
v9 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingBottom()I
/* add-int/2addr v8, v9 */
/* sub-int/2addr v5, v8 */
v8 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingTop()I
/* add-int/2addr v6, v8 */
} // :cond_2
/* int-to-float v7, v7 */
/* int-to-float v6, v6 */
(( android.graphics.Canvas ) p1 ).translate ( v7, v6 ); // invoke-virtual {p1, v7, v6}, Landroid/graphics/Canvas;->translate(FF)V
v6 = this.a;
(( android.widget.EdgeEffect ) v6 ).setSize ( v4, v5 ); // invoke-virtual {v6, v4, v5}, Landroid/widget/EdgeEffect;->setSize(II)V
v4 = this.a;
v4 = (( android.widget.EdgeEffect ) v4 ).draw ( p1 ); // invoke-virtual {v4, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z
if ( v4 != null) { // if-eqz v4, :cond_3
em .a ( p0 );
} // :cond_3
(( android.graphics.Canvas ) p1 ).restoreToCount ( v1 ); // invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V
} // :cond_4
v1 = this.b;
v1 = (( android.widget.EdgeEffect ) v1 ).isFinished ( ); // invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z
/* if-nez v1, :cond_9 */
v1 = (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
v4 = (( android.support.v4.widget.NestedScrollView ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getWidth()I
v5 = (( android.support.v4.widget.NestedScrollView ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getHeight()I
v6 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollRange ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollRange()I
v0 = java.lang.Math .max ( v6,v0 );
/* add-int/2addr v0, v5 */
/* if-lt v6, v2, :cond_5 */
v6 = (( android.support.v4.widget.NestedScrollView ) p0 ).getClipToPadding ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getClipToPadding()Z
if ( v6 != null) { // if-eqz v6, :cond_6
} // :cond_5
v6 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingLeft()I
v7 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingRight()I
/* add-int/2addr v6, v7 */
/* sub-int/2addr v4, v6 */
v6 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingLeft()I
/* add-int/2addr v3, v6 */
} // :cond_6
/* if-lt v6, v2, :cond_7 */
v2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getClipToPadding ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getClipToPadding()Z
if ( v2 != null) { // if-eqz v2, :cond_7
v2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingTop()I
v6 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingBottom()I
/* add-int/2addr v2, v6 */
/* sub-int/2addr v5, v2 */
v2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingBottom()I
/* sub-int/2addr v0, v2 */
} // :cond_7
/* sub-int/2addr v3, v4 */
/* int-to-float v2, v3 */
/* int-to-float v0, v0 */
(( android.graphics.Canvas ) p1 ).translate ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->translate(FF)V
/* const/high16 v0, 0x43340000 # 180.0f */
/* int-to-float v2, v4 */
int v3 = 0; // const/4 v3, 0x0
(( android.graphics.Canvas ) p1 ).rotate ( v0, v2, v3 ); // invoke-virtual {p1, v0, v2, v3}, Landroid/graphics/Canvas;->rotate(FFF)V
v0 = this.b;
(( android.widget.EdgeEffect ) v0 ).setSize ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Landroid/widget/EdgeEffect;->setSize(II)V
v0 = this.b;
v0 = (( android.widget.EdgeEffect ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z
if ( v0 != null) { // if-eqz v0, :cond_8
em .a ( p0 );
} // :cond_8
(( android.graphics.Canvas ) p1 ).restoreToCount ( v1 ); // invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V
} // :cond_9
return;
} // .end method
protected Float getBottomFadingEdgeStrength ( ) {
/* .locals 5 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getChildCount()I
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
(( android.support.v4.widget.NestedScrollView ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/NestedScrollView;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/widget/FrameLayout$LayoutParams; */
v2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getVerticalFadingEdgeLength ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getVerticalFadingEdgeLength()I
v3 = (( android.support.v4.widget.NestedScrollView ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getHeight()I
v4 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingBottom()I
/* sub-int/2addr v3, v4 */
v0 = (( android.view.View ) v0 ).getBottom ( ); // invoke-virtual {v0}, Landroid/view/View;->getBottom()I
/* iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v0, v1 */
v1 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
/* sub-int/2addr v0, v1 */
/* sub-int/2addr v0, v3 */
/* if-ge v0, v2, :cond_1 */
/* int-to-float v0, v0 */
/* int-to-float v1, v2 */
/* div-float/2addr v0, v1 */
} // :cond_1
/* const/high16 v0, 0x3f800000 # 1.0f */
} // .end method
public Integer getMaxScrollAmount ( ) {
/* .locals 2 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getHeight()I
/* int-to-float v0, v0 */
/* const/high16 v1, 0x3f000000 # 0.5f */
/* mul-float v0, v0, v1 */
/* float-to-int v0, v0 */
} // .end method
public Integer getNestedScrollAxes ( ) {
/* .locals 1 */
v0 = this.a;
/* iget v0, v0, Lei;->a:I */
} // .end method
Integer getScrollRange ( ) {
/* .locals 4 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
/* if-lez v0, :cond_0 */
(( android.support.v4.widget.NestedScrollView ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/support/v4/widget/NestedScrollView;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroid/widget/FrameLayout$LayoutParams; */
v0 = (( android.view.View ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/view/View;->getHeight()I
/* iget v3, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v0, v3 */
/* iget v2, v2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v0, v2 */
v2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getHeight()I
v3 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingTop()I
/* sub-int/2addr v2, v3 */
v3 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingBottom()I
/* sub-int/2addr v2, v3 */
/* sub-int/2addr v0, v2 */
v1 = java.lang.Math .max ( v1,v0 );
} // :cond_0
} // .end method
protected Float getTopFadingEdgeStrength ( ) {
/* .locals 2 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getChildCount()I
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getVerticalFadingEdgeLength ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getVerticalFadingEdgeLength()I
v1 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
/* if-ge v1, v0, :cond_1 */
/* int-to-float v1, v1 */
/* int-to-float v0, v0 */
/* div-float/2addr v1, v0 */
} // :cond_1
/* const/high16 v0, 0x3f800000 # 1.0f */
} // .end method
public Boolean hasNestedScrollingParent ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
v0 = /* invoke-direct {p0, v0}, Landroid/support/v4/widget/NestedScrollView;->a(I)Z */
} // .end method
public Boolean isNestedScrollingEnabled ( ) {
/* .locals 1 */
v0 = this.a;
/* iget-boolean v0, v0, Lef;->a:Z */
} // .end method
protected void measureChild ( android.view.View p0, Integer p1, Integer p2 ) {
/* .locals 2 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingLeft()I
v1 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingRight()I
/* add-int/2addr v0, v1 */
/* iget p3, p3, Landroid/view/ViewGroup$LayoutParams;->width:I */
p2 = android.support.v4.widget.NestedScrollView .getChildMeasureSpec ( p2,v0,p3 );
int p3 = 0; // const/4 p3, 0x0
p3 = android.view.View$MeasureSpec .makeMeasureSpec ( p3,p3 );
(( android.view.View ) p1 ).measure ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V
return;
} // .end method
protected void measureChildWithMargins ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 1 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p4, Landroid/view/ViewGroup$MarginLayoutParams; */
p5 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingLeft()I
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingRight()I
/* add-int/2addr p5, v0 */
/* iget v0, p4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr p5, v0 */
/* iget v0, p4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr p5, v0 */
/* add-int/2addr p5, p3 */
/* iget p3, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
p2 = android.support.v4.widget.NestedScrollView .getChildMeasureSpec ( p2,p5,p3 );
/* iget p3, p4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* iget p4, p4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr p3, p4 */
int p4 = 0; // const/4 p4, 0x0
p3 = android.view.View$MeasureSpec .makeMeasureSpec ( p3,p4 );
(( android.view.View ) p1 ).measure ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V
return;
} // .end method
public void onAttachedToWindow ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Landroid/support/v4/widget/NestedScrollView;->b:Z */
return;
} // .end method
public Boolean onGenericMotionEvent ( android.view.MotionEvent p0 ) {
/* .locals 3 */
v0 = (( android.view.MotionEvent ) p1 ).getSource ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I
/* and-int/lit8 v0, v0, 0x2 */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
/* const/16 v2, 0x8 */
/* if-eq v0, v2, :cond_0 */
} // :cond_0
/* iget-boolean v0, p0, Landroid/support/v4/widget/NestedScrollView;->c:Z */
/* if-nez v0, :cond_3 */
/* const/16 v0, 0x9 */
p1 = (( android.view.MotionEvent ) p1 ).getAxisValue ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F
int v0 = 0; // const/4 v0, 0x0
/* cmpl-float v0, p1, v0 */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = /* invoke-direct {p0}, Landroid/support/v4/widget/NestedScrollView;->getVerticalScrollFactorCompat()F */
/* mul-float p1, p1, v0 */
/* float-to-int p1, p1 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollRange ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollRange()I
v2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
/* sub-int p1, v2, p1 */
/* if-gez p1, :cond_1 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
/* if-le p1, v0, :cond_2 */
/* move p1, v0 */
} // :cond_2
} // :goto_0
/* if-eq p1, v2, :cond_3 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollX()I
/* invoke-super {p0, v0, p1}, Landroid/widget/FrameLayout;->scrollTo(II)V */
int p1 = 1; // const/4 p1, 0x1
} // :cond_3
} // :goto_1
} // .end method
public Boolean onInterceptTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 12 */
v0 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
int v1 = 2; // const/4 v1, 0x2
int v2 = 1; // const/4 v2, 0x1
/* if-ne v0, v1, :cond_0 */
/* iget-boolean v3, p0, Landroid/support/v4/widget/NestedScrollView;->c:Z */
if ( v3 != null) { // if-eqz v3, :cond_0
} // :cond_0
/* and-int/lit16 v0, v0, 0xff */
int v3 = 6; // const/4 v3, 0x6
/* if-eq v0, v3, :cond_6 */
int v3 = -1; // const/4 v3, -0x1
int v4 = 0; // const/4 v4, 0x0
/* packed-switch v0, :pswitch_data_0 */
/* goto/16 :goto_2 */
/* :pswitch_0 */
/* iget v0, p0, Landroid/support/v4/widget/NestedScrollView;->e:I */
/* if-eq v0, v3, :cond_7 */
v5 = (( android.view.MotionEvent ) p1 ).findPointerIndex ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I
/* if-ne v5, v3, :cond_1 */
final String p1 = "NestedScrollView"; // const-string p1, "NestedScrollView"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Invalid pointerId="; // const-string v2, "Invalid pointerId="
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v0 = " in onInterceptTouchEvent"; // const-string v0, " in onInterceptTouchEvent"
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( p1,v0 );
/* goto/16 :goto_2 */
} // :cond_1
v0 = (( android.view.MotionEvent ) p1 ).getY ( v5 ); // invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getY(I)F
/* float-to-int v0, v0 */
/* iget v3, p0, Landroid/support/v4/widget/NestedScrollView;->a:I */
/* sub-int v3, v0, v3 */
v3 = java.lang.Math .abs ( v3 );
/* iget v5, p0, Landroid/support/v4/widget/NestedScrollView;->b:I */
/* if-le v3, v5, :cond_7 */
v3 = (( android.support.v4.widget.NestedScrollView ) p0 ).getNestedScrollAxes ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getNestedScrollAxes()I
/* and-int/2addr v1, v3 */
/* if-nez v1, :cond_7 */
/* iput-boolean v2, p0, Landroid/support/v4/widget/NestedScrollView;->c:Z */
/* iput v0, p0, Landroid/support/v4/widget/NestedScrollView;->a:I */
/* invoke-direct {p0}, Landroid/support/v4/widget/NestedScrollView;->a()V */
v0 = this.a;
(( android.view.VelocityTracker ) v0 ).addMovement ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
/* iput v4, p0, Landroid/support/v4/widget/NestedScrollView;->f:I */
(( android.support.v4.widget.NestedScrollView ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getParent()Landroid/view/ViewParent;
if ( p1 != null) { // if-eqz p1, :cond_7
/* goto/16 :goto_2 */
/* :pswitch_1 */
/* iput-boolean v4, p0, Landroid/support/v4/widget/NestedScrollView;->c:Z */
/* iput v3, p0, Landroid/support/v4/widget/NestedScrollView;->e:I */
/* invoke-direct {p0}, Landroid/support/v4/widget/NestedScrollView;->b()V */
v5 = this.a;
v6 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollX()I
v7 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
int v10 = 0; // const/4 v10, 0x0
v11 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollRange ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollRange()I
p1 = /* invoke-virtual/range {v5 ..v11}, Landroid/widget/OverScroller;->springBack(IIIIII)Z */
if ( p1 != null) { // if-eqz p1, :cond_2
em .a ( p0 );
} // :cond_2
/* invoke-direct {p0, v4}, Landroid/support/v4/widget/NestedScrollView;->c(I)V */
/* :pswitch_2 */
v0 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* float-to-int v0, v0 */
v3 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* float-to-int v3, v3 */
v5 = (( android.support.v4.widget.NestedScrollView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getChildCount()I
/* if-lez v5, :cond_3 */
v5 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
(( android.support.v4.widget.NestedScrollView ) p0 ).getChildAt ( v4 ); // invoke-virtual {p0, v4}, Landroid/support/v4/widget/NestedScrollView;->getChildAt(I)Landroid/view/View;
v7 = (( android.view.View ) v6 ).getTop ( ); // invoke-virtual {v6}, Landroid/view/View;->getTop()I
/* sub-int/2addr v7, v5 */
/* if-lt v0, v7, :cond_3 */
v7 = (( android.view.View ) v6 ).getBottom ( ); // invoke-virtual {v6}, Landroid/view/View;->getBottom()I
/* sub-int/2addr v7, v5 */
/* if-ge v0, v7, :cond_3 */
v5 = (( android.view.View ) v6 ).getLeft ( ); // invoke-virtual {v6}, Landroid/view/View;->getLeft()I
/* if-lt v3, v5, :cond_3 */
v5 = (( android.view.View ) v6 ).getRight ( ); // invoke-virtual {v6}, Landroid/view/View;->getRight()I
/* if-ge v3, v5, :cond_3 */
int v3 = 1; // const/4 v3, 0x1
} // :cond_3
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-nez v3, :cond_4 */
/* iput-boolean v4, p0, Landroid/support/v4/widget/NestedScrollView;->c:Z */
/* invoke-direct {p0}, Landroid/support/v4/widget/NestedScrollView;->b()V */
} // :cond_4
/* iput v0, p0, Landroid/support/v4/widget/NestedScrollView;->a:I */
v0 = (( android.view.MotionEvent ) p1 ).getPointerId ( v4 ); // invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput v0, p0, Landroid/support/v4/widget/NestedScrollView;->e:I */
v0 = this.a;
/* if-nez v0, :cond_5 */
android.view.VelocityTracker .obtain ( );
this.a = v0;
} // :cond_5
(( android.view.VelocityTracker ) v0 ).clear ( ); // invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V
} // :goto_1
v0 = this.a;
(( android.view.VelocityTracker ) v0 ).addMovement ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
p1 = this.a;
(( android.widget.OverScroller ) p1 ).computeScrollOffset ( ); // invoke-virtual {p1}, Landroid/widget/OverScroller;->computeScrollOffset()Z
p1 = this.a;
p1 = (( android.widget.OverScroller ) p1 ).isFinished ( ); // invoke-virtual {p1}, Landroid/widget/OverScroller;->isFinished()Z
/* xor-int/2addr p1, v2 */
/* iput-boolean p1, p0, Landroid/support/v4/widget/NestedScrollView;->c:Z */
/* invoke-direct {p0, v1, v4}, Landroid/support/v4/widget/NestedScrollView;->b(II)Z */
} // :cond_6
/* invoke-direct {p0, p1}, Landroid/support/v4/widget/NestedScrollView;->a(Landroid/view/MotionEvent;)V */
} // :cond_7
} // :goto_2
/* iget-boolean p1, p0, Landroid/support/v4/widget/NestedScrollView;->c:Z */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
protected void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 1 */
/* invoke-super/range {p0 ..p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V */
int p1 = 0; // const/4 p1, 0x0
/* iput-boolean p1, p0, Landroid/support/v4/widget/NestedScrollView;->a:Z */
p2 = this.a;
if ( p2 != null) { // if-eqz p2, :cond_0
p2 = android.support.v4.widget.NestedScrollView .a ( p2,p0 );
if ( p2 != null) { // if-eqz p2, :cond_0
p2 = this.a;
/* invoke-direct {p0, p2}, Landroid/support/v4/widget/NestedScrollView;->a(Landroid/view/View;)V */
} // :cond_0
int p2 = 0; // const/4 p2, 0x0
this.a = p2;
/* iget-boolean p4, p0, Landroid/support/v4/widget/NestedScrollView;->b:Z */
/* if-nez p4, :cond_3 */
p4 = this.a;
if ( p4 != null) { // if-eqz p4, :cond_1
p4 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollX()I
v0 = this.a;
/* iget v0, v0, Landroid/support/v4/widget/NestedScrollView$c;->a:I */
(( android.support.v4.widget.NestedScrollView ) p0 ).scrollTo ( p4, v0 ); // invoke-virtual {p0, p4, v0}, Landroid/support/v4/widget/NestedScrollView;->scrollTo(II)V
this.a = p2;
} // :cond_1
p2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getChildCount()I
/* if-lez p2, :cond_2 */
(( android.support.v4.widget.NestedScrollView ) p0 ).getChildAt ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/NestedScrollView;->getChildAt(I)Landroid/view/View;
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p2, Landroid/widget/FrameLayout$LayoutParams; */
p1 = (( android.view.View ) p1 ).getMeasuredHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
/* iget p4, p2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
/* add-int/2addr p1, p4 */
/* iget p2, p2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr p1, p2 */
} // :cond_2
/* sub-int/2addr p5, p3 */
p2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingTop()I
/* sub-int/2addr p5, p2 */
p2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingBottom()I
/* sub-int/2addr p5, p2 */
p2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
p1 = android.support.v4.widget.NestedScrollView .a ( p2,p5,p1 );
/* if-eq p1, p2, :cond_3 */
p2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollX()I
(( android.support.v4.widget.NestedScrollView ) p0 ).scrollTo ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Landroid/support/v4/widget/NestedScrollView;->scrollTo(II)V
} // :cond_3
p1 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollX()I
p2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
(( android.support.v4.widget.NestedScrollView ) p0 ).scrollTo ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/support/v4/widget/NestedScrollView;->scrollTo(II)V
int p1 = 1; // const/4 p1, 0x1
/* iput-boolean p1, p0, Landroid/support/v4/widget/NestedScrollView;->b:Z */
return;
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 4 */
/* invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V */
/* iget-boolean v0, p0, Landroid/support/v4/widget/NestedScrollView;->d:Z */
/* if-nez v0, :cond_0 */
return;
} // :cond_0
p2 = android.view.View$MeasureSpec .getMode ( p2 );
/* if-nez p2, :cond_1 */
return;
} // :cond_1
p2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getChildCount()I
/* if-lez p2, :cond_2 */
int p2 = 0; // const/4 p2, 0x0
(( android.support.v4.widget.NestedScrollView ) p0 ).getChildAt ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v4/widget/NestedScrollView;->getChildAt(I)Landroid/view/View;
(( android.view.View ) p2 ).getLayoutParams ( ); // invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/widget/FrameLayout$LayoutParams; */
v1 = (( android.view.View ) p2 ).getMeasuredHeight ( ); // invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I
v2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getMeasuredHeight()I
v3 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingTop()I
/* sub-int/2addr v2, v3 */
v3 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingBottom()I
/* sub-int/2addr v2, v3 */
/* iget v3, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
/* sub-int/2addr v2, v3 */
/* iget v3, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* sub-int/2addr v2, v3 */
/* if-ge v1, v2, :cond_2 */
v1 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingLeft()I
v3 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingRight()I
/* add-int/2addr v1, v3 */
/* iget v3, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I */
/* add-int/2addr v1, v3 */
/* iget v3, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I */
/* add-int/2addr v1, v3 */
/* iget v0, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I */
p1 = android.support.v4.widget.NestedScrollView .getChildMeasureSpec ( p1,v1,v0 );
/* const/high16 v0, 0x40000000 # 2.0f */
v0 = android.view.View$MeasureSpec .makeMeasureSpec ( v2,v0 );
(( android.view.View ) p2 ).measure ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Landroid/view/View;->measure(II)V
} // :cond_2
return;
} // .end method
public Boolean onNestedFling ( android.view.View p0, Float p1, Float p2, Boolean p3 ) {
/* .locals 0 */
/* if-nez p4, :cond_0 */
/* float-to-int p1, p3 */
/* invoke-direct {p0, p1}, Landroid/support/v4/widget/NestedScrollView;->f(I)V */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean onNestedPreFling ( android.view.View p0, Float p1, Float p2 ) {
/* .locals 0 */
p1 = (( android.support.v4.widget.NestedScrollView ) p0 ).dispatchNestedPreFling ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Landroid/support/v4/widget/NestedScrollView;->dispatchNestedPreFling(FF)Z
} // .end method
public void onNestedPreScroll ( android.view.View p0, Integer p1, Integer p2, Integer[] p3 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
(( android.support.v4.widget.NestedScrollView ) p0 ).a ( p2, p3, p4, p1 ); // invoke-virtual {p0, p2, p3, p4, p1}, Landroid/support/v4/widget/NestedScrollView;->a(II[II)V
return;
} // .end method
public void onNestedScroll ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
(( android.support.v4.widget.NestedScrollView ) p0 ).a ( p5, p1 ); // invoke-virtual {p0, p5, p1}, Landroid/support/v4/widget/NestedScrollView;->a(II)V
return;
} // .end method
public void onNestedScrollAccepted ( android.view.View p0, android.view.View p1, Integer p2 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
(( android.support.v4.widget.NestedScrollView ) p0 ).a ( p2, p3, p1 ); // invoke-virtual {p0, p2, p3, p1}, Landroid/support/v4/widget/NestedScrollView;->a(Landroid/view/View;II)V
return;
} // .end method
protected void onOverScrolled ( Integer p0, Integer p1, Boolean p2, Boolean p3 ) {
/* .locals 0 */
/* invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->scrollTo(II)V */
return;
} // .end method
protected Boolean onRequestFocusInDescendants ( Integer p0, android.graphics.Rect p1 ) {
/* .locals 3 */
int v0 = 2; // const/4 v0, 0x2
/* if-ne p1, v0, :cond_0 */
/* const/16 p1, 0x82 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_1 */
/* const/16 p1, 0x21 */
} // :cond_1
} // :goto_0
/* if-nez p2, :cond_2 */
android.view.FocusFinder .getInstance ( );
int v1 = 0; // const/4 v1, 0x0
(( android.view.FocusFinder ) v0 ).findNextFocus ( p0, v1, p1 ); // invoke-virtual {v0, p0, v1, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
} // :cond_2
android.view.FocusFinder .getInstance ( );
(( android.view.FocusFinder ) v0 ).findNextFocusFromRect ( p0, p2, p1 ); // invoke-virtual {v0, p0, p2, p1}, Landroid/view/FocusFinder;->findNextFocusFromRect(Landroid/view/ViewGroup;Landroid/graphics/Rect;I)Landroid/view/View;
} // :goto_1
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_3 */
} // :cond_3
v2 = /* invoke-direct {p0, v0}, Landroid/support/v4/widget/NestedScrollView;->a(Landroid/view/View;)Z */
if ( v2 != null) { // if-eqz v2, :cond_4
} // :cond_4
p1 = (( android.view.View ) v0 ).requestFocus ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z
} // .end method
protected void onRestoreInstanceState ( android.os.Parcelable p0 ) {
/* .locals 1 */
/* instance-of v0, p1, Landroid/support/v4/widget/NestedScrollView$c; */
/* if-nez v0, :cond_0 */
/* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
return;
} // :cond_0
/* check-cast p1, Landroid/support/v4/widget/NestedScrollView$c; */
(( android.support.v4.widget.NestedScrollView$c ) p1 ).getSuperState ( ); // invoke-virtual {p1}, Landroid/support/v4/widget/NestedScrollView$c;->getSuperState()Landroid/os/Parcelable;
/* invoke-super {p0, v0}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
this.a = p1;
(( android.support.v4.widget.NestedScrollView ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->requestLayout()V
return;
} // .end method
protected android.os.Parcelable onSaveInstanceState ( ) {
/* .locals 2 */
/* invoke-super {p0}, Landroid/widget/FrameLayout;->onSaveInstanceState()Landroid/os/Parcelable; */
/* new-instance v1, Landroid/support/v4/widget/NestedScrollView$c; */
/* invoke-direct {v1, v0}, Landroid/support/v4/widget/NestedScrollView$c;-><init>(Landroid/os/Parcelable;)V */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
/* iput v0, v1, Landroid/support/v4/widget/NestedScrollView$c;->a:I */
} // .end method
protected void onScrollChanged ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onScrollChanged(IIII)V */
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
return;
} // .end method
protected void onSizeChanged ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V */
(( android.support.v4.widget.NestedScrollView ) p0 ).findFocus ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->findFocus()Landroid/view/View;
if ( p1 != null) { // if-eqz p1, :cond_1
/* if-ne p0, p1, :cond_0 */
} // :cond_0
int p2 = 0; // const/4 p2, 0x0
p2 = /* invoke-direct {p0, p1, p2, p4}, Landroid/support/v4/widget/NestedScrollView;->a(Landroid/view/View;II)Z */
if ( p2 != null) { // if-eqz p2, :cond_1
p2 = this.a;
(( android.view.View ) p1 ).getDrawingRect ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V
p2 = this.a;
(( android.support.v4.widget.NestedScrollView ) p0 ).offsetDescendantRectToMyCoords ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/support/v4/widget/NestedScrollView;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V
p1 = this.a;
p1 = /* invoke-direct {p0, p1}, Landroid/support/v4/widget/NestedScrollView;->a(Landroid/graphics/Rect;)I */
/* invoke-direct {p0, p1}, Landroid/support/v4/widget/NestedScrollView;->d(I)V */
} // :cond_1
} // :goto_0
return;
} // .end method
public Boolean onStartNestedScroll ( android.view.View p0, android.view.View p1, Integer p2 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
p1 = (( android.support.v4.widget.NestedScrollView ) p0 ).a ( p3, p1 ); // invoke-virtual {p0, p3, p1}, Landroid/support/v4/widget/NestedScrollView;->a(II)Z
} // .end method
public void onStopNestedScroll ( android.view.View p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
(( android.support.v4.widget.NestedScrollView ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/NestedScrollView;->b(I)V
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 19 */
/* move-object/from16 v7, p0 */
/* move-object/from16 v8, p1 */
/* invoke-direct/range {p0 ..p0}, Landroid/support/v4/widget/NestedScrollView;->a()V */
/* invoke-static/range {p1 ..p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent; */
v0 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getActionMasked()I */
int v6 = 0; // const/4 v6, 0x0
/* if-nez v0, :cond_0 */
/* iput v6, v7, Landroid/support/v4/widget/NestedScrollView;->f:I */
} // :cond_0
/* iget v1, v7, Landroid/support/v4/widget/NestedScrollView;->f:I */
/* int-to-float v1, v1 */
int v10 = 0; // const/4 v10, 0x0
(( android.view.MotionEvent ) v9 ).offsetLocation ( v10, v1 ); // invoke-virtual {v9, v10, v1}, Landroid/view/MotionEvent;->offsetLocation(FF)V
int v1 = -1; // const/4 v1, -0x1
int v11 = 1; // const/4 v11, 0x1
/* packed-switch v0, :pswitch_data_0 */
/* :pswitch_0 */
/* goto/16 :goto_7 */
/* :pswitch_1 */
/* invoke-direct/range {p0 ..p1}, Landroid/support/v4/widget/NestedScrollView;->a(Landroid/view/MotionEvent;)V */
/* iget v0, v7, Landroid/support/v4/widget/NestedScrollView;->e:I */
v0 = (( android.view.MotionEvent ) v8 ).findPointerIndex ( v0 ); // invoke-virtual {v8, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I
v0 = (( android.view.MotionEvent ) v8 ).getY ( v0 ); // invoke-virtual {v8, v0}, Landroid/view/MotionEvent;->getY(I)F
/* float-to-int v0, v0 */
/* iput v0, v7, Landroid/support/v4/widget/NestedScrollView;->a:I */
/* goto/16 :goto_7 */
/* :pswitch_2 */
v0 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getActionIndex()I */
v1 = (( android.view.MotionEvent ) v8 ).getY ( v0 ); // invoke-virtual {v8, v0}, Landroid/view/MotionEvent;->getY(I)F
/* float-to-int v1, v1 */
/* iput v1, v7, Landroid/support/v4/widget/NestedScrollView;->a:I */
v0 = (( android.view.MotionEvent ) v8 ).getPointerId ( v0 ); // invoke-virtual {v8, v0}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput v0, v7, Landroid/support/v4/widget/NestedScrollView;->e:I */
/* goto/16 :goto_7 */
/* :pswitch_3 */
/* iget-boolean v0, v7, Landroid/support/v4/widget/NestedScrollView;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/NestedScrollView;->getChildCount()I */
/* if-lez v0, :cond_1 */
v12 = this.a;
v13 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollX()I */
v14 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I */
int v15 = 0; // const/4 v15, 0x0
/* const/16 v16, 0x0 */
/* const/16 v17, 0x0 */
v18 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollRange()I */
v0 = /* invoke-virtual/range {v12 ..v18}, Landroid/widget/OverScroller;->springBack(IIIIII)Z */
if ( v0 != null) { // if-eqz v0, :cond_1
} // :goto_0
/* invoke-static/range {p0 ..p0}, Lem;->a(Landroid/view/View;)V */
} // :cond_1
} // :goto_1
/* iput v1, v7, Landroid/support/v4/widget/NestedScrollView;->e:I */
/* invoke-direct/range {p0 ..p0}, Landroid/support/v4/widget/NestedScrollView;->c()V */
/* goto/16 :goto_7 */
/* :pswitch_4 */
/* iget v0, v7, Landroid/support/v4/widget/NestedScrollView;->e:I */
v12 = (( android.view.MotionEvent ) v8 ).findPointerIndex ( v0 ); // invoke-virtual {v8, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I
/* if-ne v12, v1, :cond_2 */
final String v0 = "NestedScrollView"; // const-string v0, "NestedScrollView"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Invalid pointerId="; // const-string v2, "Invalid pointerId="
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v2, v7, Landroid/support/v4/widget/NestedScrollView;->e:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " in onTouchEvent"; // const-string v2, " in onTouchEvent"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v0,v1 );
/* goto/16 :goto_7 */
} // :cond_2
v0 = (( android.view.MotionEvent ) v8 ).getY ( v12 ); // invoke-virtual {v8, v12}, Landroid/view/MotionEvent;->getY(I)F
/* float-to-int v13, v0 */
/* iget v0, v7, Landroid/support/v4/widget/NestedScrollView;->a:I */
/* sub-int v14, v0, v13 */
int v1 = 0; // const/4 v1, 0x0
v3 = this.b;
v4 = this.a;
int v5 = 0; // const/4 v5, 0x0
/* move-object/from16 v0, p0 */
/* move v2, v14 */
v0 = /* invoke-direct/range {v0 ..v5}, Landroid/support/v4/widget/NestedScrollView;->a(II[I[II)Z */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.b;
/* aget v0, v0, v11 */
/* sub-int/2addr v14, v0 */
v0 = this.a;
/* aget v0, v0, v11 */
/* int-to-float v0, v0 */
(( android.view.MotionEvent ) v9 ).offsetLocation ( v10, v0 ); // invoke-virtual {v9, v10, v0}, Landroid/view/MotionEvent;->offsetLocation(FF)V
/* iget v0, v7, Landroid/support/v4/widget/NestedScrollView;->f:I */
v1 = this.a;
/* aget v1, v1, v11 */
/* add-int/2addr v0, v1 */
/* iput v0, v7, Landroid/support/v4/widget/NestedScrollView;->f:I */
} // :cond_3
/* iget-boolean v0, v7, Landroid/support/v4/widget/NestedScrollView;->c:Z */
/* if-nez v0, :cond_6 */
v0 = java.lang.Math .abs ( v14 );
/* iget v1, v7, Landroid/support/v4/widget/NestedScrollView;->b:I */
/* if-le v0, v1, :cond_6 */
/* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/NestedScrollView;->getParent()Landroid/view/ViewParent; */
if ( v0 != null) { // if-eqz v0, :cond_4
} // :cond_4
/* iput-boolean v11, v7, Landroid/support/v4/widget/NestedScrollView;->c:Z */
/* if-lez v14, :cond_5 */
/* iget v0, v7, Landroid/support/v4/widget/NestedScrollView;->b:I */
/* sub-int/2addr v14, v0 */
} // :cond_5
/* iget v0, v7, Landroid/support/v4/widget/NestedScrollView;->b:I */
/* add-int/2addr v14, v0 */
} // :cond_6
} // :goto_2
/* iget-boolean v0, v7, Landroid/support/v4/widget/NestedScrollView;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_12
v0 = this.a;
/* aget v0, v0, v11 */
/* sub-int/2addr v13, v0 */
/* iput v13, v7, Landroid/support/v4/widget/NestedScrollView;->a:I */
v13 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I */
v15 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollRange()I */
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/NestedScrollView;->getOverScrollMode()I */
if ( v0 != null) { // if-eqz v0, :cond_8
/* if-ne v0, v11, :cond_7 */
/* if-lez v15, :cond_7 */
} // :cond_7
/* const/16 v16, 0x0 */
} // :cond_8
} // :goto_3
/* const/16 v16, 0x1 */
} // :goto_4
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I */
v0 = /* invoke-direct {v7, v14, v6, v0, v15}, Landroid/support/v4/widget/NestedScrollView;->a(IIII)Z */
if ( v0 != null) { // if-eqz v0, :cond_9
v0 = /* invoke-direct {v7, v6}, Landroid/support/v4/widget/NestedScrollView;->a(I)Z */
/* if-nez v0, :cond_9 */
v0 = this.a;
(( android.view.VelocityTracker ) v0 ).clear ( ); // invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V
} // :cond_9
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I */
/* sub-int v2, v0, v13 */
/* sub-int v4, v14, v2 */
int v1 = 0; // const/4 v1, 0x0
int v3 = 0; // const/4 v3, 0x0
v5 = this.a;
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v0, p0 */
v0 = /* invoke-direct/range {v0 ..v6}, Landroid/support/v4/widget/NestedScrollView;->a(IIII[II)Z */
if ( v0 != null) { // if-eqz v0, :cond_a
/* iget v0, v7, Landroid/support/v4/widget/NestedScrollView;->a:I */
v1 = this.a;
/* aget v2, v1, v11 */
/* sub-int/2addr v0, v2 */
/* iput v0, v7, Landroid/support/v4/widget/NestedScrollView;->a:I */
/* aget v0, v1, v11 */
/* int-to-float v0, v0 */
(( android.view.MotionEvent ) v9 ).offsetLocation ( v10, v0 ); // invoke-virtual {v9, v10, v0}, Landroid/view/MotionEvent;->offsetLocation(FF)V
/* iget v0, v7, Landroid/support/v4/widget/NestedScrollView;->f:I */
v1 = this.a;
/* aget v1, v1, v11 */
/* add-int/2addr v0, v1 */
/* iput v0, v7, Landroid/support/v4/widget/NestedScrollView;->f:I */
/* goto/16 :goto_7 */
} // :cond_a
if ( v16 != null) { // if-eqz v16, :cond_12
/* invoke-direct/range {p0 ..p0}, Landroid/support/v4/widget/NestedScrollView;->d()V */
/* add-int/2addr v13, v14 */
/* if-gez v13, :cond_b */
v0 = this.a;
/* int-to-float v1, v14 */
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/NestedScrollView;->getHeight()I */
/* int-to-float v2, v2 */
/* div-float/2addr v1, v2 */
v2 = (( android.view.MotionEvent ) v8 ).getX ( v12 ); // invoke-virtual {v8, v12}, Landroid/view/MotionEvent;->getX(I)F
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/NestedScrollView;->getWidth()I */
/* int-to-float v3, v3 */
/* div-float/2addr v2, v3 */
fi .a ( v0,v1,v2 );
v0 = this.b;
v0 = (( android.widget.EdgeEffect ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z
/* if-nez v0, :cond_c */
v0 = this.b;
} // :goto_5
(( android.widget.EdgeEffect ) v0 ).onRelease ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V
} // :cond_b
/* if-le v13, v15, :cond_c */
v0 = this.b;
/* int-to-float v1, v14 */
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/NestedScrollView;->getHeight()I */
/* int-to-float v2, v2 */
/* div-float/2addr v1, v2 */
/* const/high16 v2, 0x3f800000 # 1.0f */
v3 = (( android.view.MotionEvent ) v8 ).getX ( v12 ); // invoke-virtual {v8, v12}, Landroid/view/MotionEvent;->getX(I)F
v4 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/NestedScrollView;->getWidth()I */
/* int-to-float v4, v4 */
/* div-float/2addr v3, v4 */
/* sub-float/2addr v2, v3 */
fi .a ( v0,v1,v2 );
v0 = this.a;
v0 = (( android.widget.EdgeEffect ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z
/* if-nez v0, :cond_c */
v0 = this.a;
} // :cond_c
} // :goto_6
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_12
v0 = (( android.widget.EdgeEffect ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z
if ( v0 != null) { // if-eqz v0, :cond_d
v0 = this.b;
v0 = (( android.widget.EdgeEffect ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z
/* if-nez v0, :cond_12 */
} // :cond_d
/* invoke-static/range {p0 ..p0}, Lem;->a(Landroid/view/View;)V */
/* :pswitch_5 */
v0 = this.a;
/* const/16 v2, 0x3e8 */
/* iget v3, v7, Landroid/support/v4/widget/NestedScrollView;->d:I */
/* int-to-float v3, v3 */
(( android.view.VelocityTracker ) v0 ).computeCurrentVelocity ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V
/* iget v2, v7, Landroid/support/v4/widget/NestedScrollView;->e:I */
v0 = (( android.view.VelocityTracker ) v0 ).getYVelocity ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/VelocityTracker;->getYVelocity(I)F
/* float-to-int v0, v0 */
v2 = java.lang.Math .abs ( v0 );
/* iget v3, v7, Landroid/support/v4/widget/NestedScrollView;->c:I */
/* if-le v2, v3, :cond_e */
/* neg-int v0, v0 */
/* invoke-direct {v7, v0}, Landroid/support/v4/widget/NestedScrollView;->f(I)V */
/* goto/16 :goto_1 */
} // :cond_e
v12 = this.a;
v13 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollX()I */
v14 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I */
int v15 = 0; // const/4 v15, 0x0
/* const/16 v16, 0x0 */
/* const/16 v17, 0x0 */
v18 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollRange()I */
v0 = /* invoke-virtual/range {v12 ..v18}, Landroid/widget/OverScroller;->springBack(IIIIII)Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* goto/16 :goto_0 */
/* :pswitch_6 */
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/NestedScrollView;->getChildCount()I */
/* if-nez v0, :cond_f */
} // :cond_f
v0 = this.a;
v0 = (( android.widget.OverScroller ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z
/* xor-int/2addr v0, v11 */
/* iput-boolean v0, v7, Landroid/support/v4/widget/NestedScrollView;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_10
/* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/NestedScrollView;->getParent()Landroid/view/ViewParent; */
if ( v0 != null) { // if-eqz v0, :cond_10
} // :cond_10
v0 = this.a;
v0 = (( android.widget.OverScroller ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z
/* if-nez v0, :cond_11 */
v0 = this.a;
(( android.widget.OverScroller ) v0 ).abortAnimation ( ); // invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V
} // :cond_11
v0 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getY()F */
/* float-to-int v0, v0 */
/* iput v0, v7, Landroid/support/v4/widget/NestedScrollView;->a:I */
v0 = (( android.view.MotionEvent ) v8 ).getPointerId ( v6 ); // invoke-virtual {v8, v6}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput v0, v7, Landroid/support/v4/widget/NestedScrollView;->e:I */
int v0 = 2; // const/4 v0, 0x2
/* invoke-direct {v7, v0, v6}, Landroid/support/v4/widget/NestedScrollView;->b(II)Z */
} // :cond_12
} // :goto_7
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_13
(( android.view.VelocityTracker ) v0 ).addMovement ( v9 ); // invoke-virtual {v0, v9}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
} // :cond_13
(( android.view.MotionEvent ) v9 ).recycle ( ); // invoke-virtual {v9}, Landroid/view/MotionEvent;->recycle()V
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_6 */
/* :pswitch_5 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public void requestChildFocus ( android.view.View p0, android.view.View p1 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Landroid/support/v4/widget/NestedScrollView;->a:Z */
/* if-nez v0, :cond_0 */
/* invoke-direct {p0, p2}, Landroid/support/v4/widget/NestedScrollView;->a(Landroid/view/View;)V */
} // :cond_0
this.a = p2;
} // :goto_0
/* invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V */
return;
} // .end method
public Boolean requestChildRectangleOnScreen ( android.view.View p0, android.graphics.Rect p1, Boolean p2 ) {
/* .locals 2 */
v0 = (( android.view.View ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getLeft()I
v1 = (( android.view.View ) p1 ).getScrollX ( ); // invoke-virtual {p1}, Landroid/view/View;->getScrollX()I
/* sub-int/2addr v0, v1 */
v1 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
p1 = (( android.view.View ) p1 ).getScrollY ( ); // invoke-virtual {p1}, Landroid/view/View;->getScrollY()I
/* sub-int/2addr v1, p1 */
(( android.graphics.Rect ) p2 ).offset ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Landroid/graphics/Rect;->offset(II)V
p1 = /* invoke-direct {p0, p2}, Landroid/support/v4/widget/NestedScrollView;->a(Landroid/graphics/Rect;)I */
int p2 = 0; // const/4 p2, 0x0
if ( p1 != null) { // if-eqz p1, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_2
if ( p3 != null) { // if-eqz p3, :cond_1
(( android.support.v4.widget.NestedScrollView ) p0 ).scrollBy ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Landroid/support/v4/widget/NestedScrollView;->scrollBy(II)V
} // :cond_1
/* invoke-direct {p0, p2, p1}, Landroid/support/v4/widget/NestedScrollView;->b(II)V */
} // :cond_2
} // :goto_1
} // .end method
public void requestDisallowInterceptTouchEvent ( Boolean p0 ) {
/* .locals 0 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* invoke-direct {p0}, Landroid/support/v4/widget/NestedScrollView;->b()V */
} // :cond_0
/* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->requestDisallowInterceptTouchEvent(Z)V */
return;
} // .end method
public void requestLayout ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Landroid/support/v4/widget/NestedScrollView;->a:Z */
/* invoke-super {p0}, Landroid/widget/FrameLayout;->requestLayout()V */
return;
} // .end method
public void scrollTo ( Integer p0, Integer p1 ) {
/* .locals 6 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getChildCount()I
/* if-lez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
(( android.support.v4.widget.NestedScrollView ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/NestedScrollView;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/widget/FrameLayout$LayoutParams; */
v2 = (( android.support.v4.widget.NestedScrollView ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getWidth()I
v3 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingLeft()I
/* sub-int/2addr v2, v3 */
v3 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingRight()I
/* sub-int/2addr v2, v3 */
v3 = (( android.view.View ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/view/View;->getWidth()I
/* iget v4, v1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I */
/* add-int/2addr v3, v4 */
/* iget v4, v1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I */
/* add-int/2addr v3, v4 */
v4 = (( android.support.v4.widget.NestedScrollView ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getHeight()I
v5 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingTop()I
/* sub-int/2addr v4, v5 */
v5 = (( android.support.v4.widget.NestedScrollView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getPaddingBottom()I
/* sub-int/2addr v4, v5 */
v0 = (( android.view.View ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/view/View;->getHeight()I
/* iget v5, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v0, v5 */
/* iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v0, v1 */
p1 = android.support.v4.widget.NestedScrollView .a ( p1,v2,v3 );
p2 = android.support.v4.widget.NestedScrollView .a ( p2,v4,v0 );
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollX()I
/* if-ne p1, v0, :cond_0 */
v0 = (( android.support.v4.widget.NestedScrollView ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->getScrollY()I
/* if-eq p2, v0, :cond_1 */
} // :cond_0
/* invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->scrollTo(II)V */
} // :cond_1
return;
} // .end method
public void setFillViewport ( Boolean p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Landroid/support/v4/widget/NestedScrollView;->d:Z */
/* if-eq p1, v0, :cond_0 */
/* iput-boolean p1, p0, Landroid/support/v4/widget/NestedScrollView;->d:Z */
(( android.support.v4.widget.NestedScrollView ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/NestedScrollView;->requestLayout()V
} // :cond_0
return;
} // .end method
public void setNestedScrollingEnabled ( Boolean p0 ) {
/* .locals 1 */
v0 = this.a;
(( ef ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lef;->a(Z)V
return;
} // .end method
public void setOnScrollChangeListener ( android.support.v4.widget.NestedScrollView$b p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
public void setSmoothScrollingEnabled ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Landroid/support/v4/widget/NestedScrollView;->e:Z */
return;
} // .end method
public Boolean shouldDelayChildPressedState ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean startNestedScroll ( Integer p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
p1 = /* invoke-direct {p0, p1, v0}, Landroid/support/v4/widget/NestedScrollView;->b(II)Z */
} // .end method
public void stopNestedScroll ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0}, Landroid/support/v4/widget/NestedScrollView;->c(I)V */
return;
} // .end method
