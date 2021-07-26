public class android.support.v4.widget.SwipeRefreshLayout extends android.view.ViewGroup implements ed implements eg {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/v4/widget/SwipeRefreshLayout$a;, */
	 /* Landroid/support/v4/widget/SwipeRefreshLayout$b; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String a;
private static final c;
/* # instance fields */
Float a;
Integer a;
private android.support.v4.widget.SwipeRefreshLayout$a a;
android.support.v4.widget.SwipeRefreshLayout$b a;
private android.view.View a;
private android.view.animation.Animation$AnimationListener a;
private android.view.animation.Animation a;
private final android.view.animation.DecelerateInterpolator a;
private final ef a;
private final ei a;
fc a;
fd a;
Boolean a;
private final a;
private Float b;
protected Integer b;
private android.view.animation.Animation b;
Boolean b;
private final b;
private Float c;
protected Integer c;
private android.view.animation.Animation c;
Boolean c;
private Float d;
Integer d;
private android.view.animation.Animation d;
Boolean d;
private Float e;
Integer e;
private android.view.animation.Animation e;
private Boolean e;
private Integer f;
private final android.view.animation.Animation f;
private Boolean f;
private Integer g;
private final android.view.animation.Animation g;
private Boolean g;
private Integer h;
private Integer i;
private Integer j;
/* # direct methods */
static android.support.v4.widget.SwipeRefreshLayout ( ) {
	 /* .locals 3 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* new-array v0, v0, [I */
	 int v1 = 0; // const/4 v1, 0x0
	 /* const v2, 0x101000e */
	 /* aput v2, v0, v1 */
	 return;
} // .end method
public android.support.v4.widget.SwipeRefreshLayout ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, p1, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 return;
} // .end method
public android.support.v4.widget.SwipeRefreshLayout ( ) {
	 /* .locals 5 */
	 /* invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput-boolean v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->a:Z */
	 /* const/high16 v1, -0x40800000 # -1.0f */
	 /* iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->b:F */
	 int v1 = 2; // const/4 v1, 0x2
	 /* new-array v2, v1, [I */
	 this.a = v2;
	 /* new-array v1, v1, [I */
	 this.b = v1;
	 int v1 = -1; // const/4 v1, -0x1
	 /* iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->h:I */
	 /* iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->i:I */
	 /* new-instance v1, Landroid/support/v4/widget/SwipeRefreshLayout$1; */
	 /* invoke-direct {v1, p0}, Landroid/support/v4/widget/SwipeRefreshLayout$1;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V */
	 this.a = v1;
	 /* new-instance v1, Landroid/support/v4/widget/SwipeRefreshLayout$6; */
	 /* invoke-direct {v1, p0}, Landroid/support/v4/widget/SwipeRefreshLayout$6;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V */
	 this.f = v1;
	 /* new-instance v1, Landroid/support/v4/widget/SwipeRefreshLayout$7; */
	 /* invoke-direct {v1, p0}, Landroid/support/v4/widget/SwipeRefreshLayout$7;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V */
	 this.g = v1;
	 android.view.ViewConfiguration .get ( p1 );
	 v1 = 	 (( android.view.ViewConfiguration ) v1 ).getScaledTouchSlop ( ); // invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I
	 /* iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->f:I */
	 (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getResources()Landroid/content/res/Resources;
	 /* const v2, 0x10e0001 */
	 v1 = 	 (( android.content.res.Resources ) v1 ).getInteger ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I
	 /* iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->g:I */
	 (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).setWillNotDraw ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setWillNotDraw(Z)V
	 /* new-instance v1, Landroid/view/animation/DecelerateInterpolator; */
	 /* const/high16 v2, 0x40000000 # 2.0f */
	 /* invoke-direct {v1, v2}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V */
	 this.a = v1;
	 (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v1 ).getDisplayMetrics ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
	 /* iget v2, v1, Landroid/util/DisplayMetrics;->density:F */
	 /* const/high16 v3, 0x42200000 # 40.0f */
	 /* mul-float v2, v2, v3 */
	 /* float-to-int v2, v2 */
	 /* iput v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->j:I */
	 /* new-instance v2, Lfc; */
	 (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getContext()Landroid/content/Context;
	 /* invoke-direct {v2, v3}, Lfc;-><init>(Landroid/content/Context;)V */
	 this.a = v2;
	 /* new-instance v2, Lfd; */
	 (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getContext()Landroid/content/Context;
	 /* invoke-direct {v2, v3}, Lfd;-><init>(Landroid/content/Context;)V */
	 this.a = v2;
	 v2 = this.a;
	 int v3 = 1; // const/4 v3, 0x1
	 (( fd ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lfd;->a(I)V
	 v2 = this.a;
	 v4 = this.a;
	 (( fc ) v2 ).setImageDrawable ( v4 ); // invoke-virtual {v2, v4}, Lfc;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
	 v2 = this.a;
	 /* const/16 v4, 0x8 */
	 (( fc ) v2 ).setVisibility ( v4 ); // invoke-virtual {v2, v4}, Lfc;->setVisibility(I)V
	 v2 = this.a;
	 (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).addView ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/v4/widget/SwipeRefreshLayout;->addView(Landroid/view/View;)V
	 (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).setChildrenDrawingOrderEnabled ( v3 ); // invoke-virtual {p0, v3}, Landroid/support/v4/widget/SwipeRefreshLayout;->setChildrenDrawingOrderEnabled(Z)V
	 /* iget v1, v1, Landroid/util/DisplayMetrics;->density:F */
	 /* const/high16 v2, 0x42800000 # 64.0f */
	 /* mul-float v1, v1, v2 */
	 /* float-to-int v1, v1 */
	 /* iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->d:I */
	 /* iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->d:I */
	 /* int-to-float v1, v1 */
	 /* iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->b:F */
	 /* new-instance v1, Lei; */
	 /* invoke-direct {v1, p0}, Lei;-><init>(Landroid/view/ViewGroup;)V */
	 this.a = v1;
	 /* new-instance v1, Lef; */
	 /* invoke-direct {v1, p0}, Lef;-><init>(Landroid/view/View;)V */
	 this.a = v1;
	 (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).setNestedScrollingEnabled ( v3 ); // invoke-virtual {p0, v3}, Landroid/support/v4/widget/SwipeRefreshLayout;->setNestedScrollingEnabled(Z)V
	 /* iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->j:I */
	 /* neg-int v1, v1 */
	 /* iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->a:I */
	 /* iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:I */
	 /* const/high16 v1, 0x3f800000 # 1.0f */
	 (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->a(F)V
	 v1 = android.support.v4.widget.SwipeRefreshLayout.c;
	 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
	 p2 = 	 (( android.content.res.TypedArray ) p1 ).getBoolean ( v0, v3 ); // invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
	 (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).setEnabled ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v4/widget/SwipeRefreshLayout;->setEnabled(Z)V
	 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
	 return;
} // .end method
private android.view.animation.Animation a ( Integer p0, Integer p1 ) {
	 /* .locals 1 */
	 /* new-instance v0, Landroid/support/v4/widget/SwipeRefreshLayout$4; */
	 /* invoke-direct {v0, p0, p1, p2}, Landroid/support/v4/widget/SwipeRefreshLayout$4;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;II)V */
	 /* const-wide/16 p1, 0x12c */
	 (( android.view.animation.Animation ) v0 ).setDuration ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/view/animation/Animation;->setDuration(J)V
	 p1 = this.a;
	 int p2 = 0; // const/4 p2, 0x0
	 this.a = p2;
	 (( fc ) p1 ).clearAnimation ( ); // invoke-virtual {p1}, Lfc;->clearAnimation()V
	 p1 = this.a;
	 (( fc ) p1 ).startAnimation ( v0 ); // invoke-virtual {p1, v0}, Lfc;->startAnimation(Landroid/view/animation/Animation;)V
} // .end method
private void a ( Integer p0, android.view.animation.Animation$AnimationListener p1 ) {
	 /* .locals 2 */
	 /* iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->b:I */
	 p1 = this.f;
	 (( android.view.animation.Animation ) p1 ).reset ( ); // invoke-virtual {p1}, Landroid/view/animation/Animation;->reset()V
	 p1 = this.f;
	 /* const-wide/16 v0, 0xc8 */
	 (( android.view.animation.Animation ) p1 ).setDuration ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V
	 p1 = this.f;
	 v0 = this.a;
	 (( android.view.animation.Animation ) p1 ).setInterpolator ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V
	 if ( p2 != null) { // if-eqz p2, :cond_0
		 p1 = this.a;
		 this.a = p2;
	 } // :cond_0
	 p1 = this.a;
	 (( fc ) p1 ).clearAnimation ( ); // invoke-virtual {p1}, Lfc;->clearAnimation()V
	 p1 = this.a;
	 p2 = this.f;
	 (( fc ) p1 ).startAnimation ( p2 ); // invoke-virtual {p1, p2}, Lfc;->startAnimation(Landroid/view/animation/Animation;)V
	 return;
} // .end method
private void a ( android.view.MotionEvent p0 ) {
	 /* .locals 3 */
	 v0 = 	 (( android.view.MotionEvent ) p1 ).getActionIndex ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I
	 v1 = 	 (( android.view.MotionEvent ) p1 ).getPointerId ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I
	 /* iget v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->h:I */
	 /* if-ne v1, v2, :cond_1 */
	 /* if-nez v0, :cond_0 */
	 int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
p1 = (( android.view.MotionEvent ) p1 ).getPointerId ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->h:I */
} // :cond_1
return;
} // .end method
private void a ( Boolean p0, Boolean p1 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->a:Z */
/* if-eq v0, p1, :cond_1 */
/* iput-boolean p2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:Z */
/* invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->d()V */
/* iput-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->a:Z */
/* iget-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->a:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
/* iget p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->a:I */
p2 = this.a;
/* invoke-direct {p0, p1, p2}, Landroid/support/v4/widget/SwipeRefreshLayout;->a(ILandroid/view/animation/Animation$AnimationListener;)V */
return;
} // :cond_0
p1 = this.a;
(( android.support.v4.widget.SwipeRefreshLayout ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->a(Landroid/view/animation/Animation$AnimationListener;)V
} // :cond_1
return;
} // .end method
private Boolean a ( ) {
/* .locals 4 */
v0 = this.a;
v0 = if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
v0 = this.a;
/* instance-of v1, v0, Landroid/widget/ListView; */
int v2 = -1; // const/4 v2, -0x1
if ( v1 != null) { // if-eqz v1, :cond_4
/* check-cast v0, Landroid/widget/ListView; */
/* const/16 v3, 0x13 */
/* if-lt v1, v3, :cond_1 */
v0 = (( android.widget.ListView ) v0 ).canScrollList ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/ListView;->canScrollList(I)Z
} // :cond_1
v1 = (( android.widget.ListView ) v0 ).getChildCount ( ); // invoke-virtual {v0}, Landroid/widget/ListView;->getChildCount()I
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_3
v1 = (( android.widget.ListView ) v0 ).getFirstVisiblePosition ( ); // invoke-virtual {v0}, Landroid/widget/ListView;->getFirstVisiblePosition()I
(( android.widget.ListView ) v0 ).getChildAt ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;
v3 = (( android.view.View ) v3 ).getTop ( ); // invoke-virtual {v3}, Landroid/view/View;->getTop()I
/* if-gtz v1, :cond_2 */
v0 = (( android.widget.ListView ) v0 ).getListPaddingTop ( ); // invoke-virtual {v0}, Landroid/widget/ListView;->getListPaddingTop()I
/* if-ge v3, v0, :cond_3 */
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
} // :cond_3
} // :cond_4
v0 = (( android.view.View ) v0 ).canScrollVertically ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z
} // .end method
private static Boolean a ( android.view.animation.Animation p0 ) {
/* .locals 1 */
if ( p0 != null) { // if-eqz p0, :cond_0
v0 = (( android.view.animation.Animation ) p0 ).hasStarted ( ); // invoke-virtual {p0}, Landroid/view/animation/Animation;->hasStarted()Z
if ( v0 != null) { // if-eqz v0, :cond_0
p0 = (( android.view.animation.Animation ) p0 ).hasEnded ( ); // invoke-virtual {p0}, Landroid/view/animation/Animation;->hasEnded()Z
/* if-nez p0, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
private void b ( ) {
/* .locals 2 */
v0 = this.a;
v0 = (( fd ) v0 ).getAlpha ( ); // invoke-virtual {v0}, Lfd;->getAlpha()I
/* const/16 v1, 0x4c */
/* invoke-direct {p0, v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->a(II)Landroid/view/animation/Animation; */
this.c = v0;
return;
} // .end method
private void b ( Float p0 ) {
/* .locals 9 */
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
(( fd ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lfd;->a(Z)V
/* iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->b:F */
/* div-float v0, p1, v0 */
v0 = java.lang.Math .abs ( v0 );
/* const/high16 v1, 0x3f800000 # 1.0f */
v0 = java.lang.Math .min ( v1,v0 );
/* float-to-double v2, v0 */
/* const-wide v4, 0x3fd999999999999aL # 0.4 */
java.lang.Double .isNaN ( v2,v3 );
/* sub-double/2addr v2, v4 */
/* double-to-float v2, v2 */
int v3 = 0; // const/4 v3, 0x0
v2 = java.lang.Math .max ( v2,v3 );
/* const/high16 v4, 0x40a00000 # 5.0f */
/* mul-float v2, v2, v4 */
/* const/high16 v4, 0x40400000 # 3.0f */
/* div-float/2addr v2, v4 */
v4 = java.lang.Math .abs ( p1 );
/* iget v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->b:F */
/* sub-float/2addr v4, v5 */
/* iget v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->e:I */
/* if-lez v5, :cond_0 */
} // :cond_0
/* iget-boolean v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->d:Z */
if ( v5 != null) { // if-eqz v5, :cond_1
/* iget v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->d:I */
/* iget v6, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:I */
/* sub-int/2addr v5, v6 */
} // :cond_1
/* iget v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->d:I */
} // :goto_0
/* int-to-float v5, v5 */
/* const/high16 v6, 0x40000000 # 2.0f */
/* mul-float v7, v5, v6 */
v4 = java.lang.Math .min ( v4,v7 );
/* div-float/2addr v4, v5 */
v3 = java.lang.Math .max ( v3,v4 );
/* const/high16 v4, 0x40800000 # 4.0f */
/* div-float/2addr v3, v4 */
/* float-to-double v3, v3 */
/* const-wide/high16 v7, 0x4000000000000000L # 2.0 */
java.lang.Math .pow ( v3,v4,v7,v8 );
/* move-result-wide v7 */
java.lang.Double .isNaN ( v3,v4 );
/* sub-double/2addr v3, v7 */
/* double-to-float v3, v3 */
/* mul-float v3, v3, v6 */
/* mul-float v4, v5, v3 */
/* mul-float v4, v4, v6 */
/* iget v7, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:I */
/* mul-float v5, v5, v0 */
/* add-float/2addr v5, v4 */
/* float-to-int v0, v5 */
/* add-int/2addr v7, v0 */
v0 = this.a;
v0 = (( fc ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Lfc;->getVisibility()I
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.a;
int v4 = 0; // const/4 v4, 0x0
(( fc ) v0 ).setVisibility ( v4 ); // invoke-virtual {v0, v4}, Lfc;->setVisibility(I)V
} // :cond_2
/* iget-boolean v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->b:Z */
/* if-nez v0, :cond_3 */
v0 = this.a;
(( fc ) v0 ).setScaleX ( v1 ); // invoke-virtual {v0, v1}, Lfc;->setScaleX(F)V
v0 = this.a;
(( fc ) v0 ).setScaleY ( v1 ); // invoke-virtual {v0, v1}, Lfc;->setScaleY(F)V
} // :cond_3
/* iget-boolean v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
/* iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->b:F */
/* div-float v0, p1, v0 */
v0 = java.lang.Math .min ( v1,v0 );
(( android.support.v4.widget.SwipeRefreshLayout ) p0 ).setAnimationProgress ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setAnimationProgress(F)V
} // :cond_4
/* iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->b:F */
/* cmpg-float p1, p1, v0 */
/* if-gez p1, :cond_5 */
p1 = this.a;
p1 = (( fd ) p1 ).getAlpha ( ); // invoke-virtual {p1}, Lfd;->getAlpha()I
/* const/16 v0, 0x4c */
/* if-le p1, v0, :cond_6 */
p1 = this.c;
p1 = android.support.v4.widget.SwipeRefreshLayout .a ( p1 );
/* if-nez p1, :cond_6 */
/* invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->b()V */
} // :cond_5
p1 = this.a;
p1 = (( fd ) p1 ).getAlpha ( ); // invoke-virtual {p1}, Lfd;->getAlpha()I
/* const/16 v0, 0xff */
/* if-ge p1, v0, :cond_6 */
p1 = this.d;
p1 = android.support.v4.widget.SwipeRefreshLayout .a ( p1 );
/* if-nez p1, :cond_6 */
/* invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->c()V */
} // :cond_6
} // :goto_1
/* const p1, 0x3f4ccccd # 0.8f */
/* mul-float v0, v2, p1 */
v4 = this.a;
p1 = java.lang.Math .min ( p1,v0 );
(( fd ) v4 ).b ( p1 ); // invoke-virtual {v4, p1}, Lfd;->b(F)V
p1 = this.a;
v0 = java.lang.Math .min ( v1,v2 );
(( fd ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lfd;->a(F)V
/* const/high16 p1, -0x41800000 # -0.25f */
/* const v0, 0x3ecccccd # 0.4f */
/* mul-float v2, v2, v0 */
/* add-float/2addr v2, p1 */
/* mul-float v3, v3, v6 */
/* add-float/2addr v2, v3 */
/* const/high16 p1, 0x3f000000 # 0.5f */
/* mul-float v2, v2, p1 */
p1 = this.a;
(( fd ) p1 ).c ( v2 ); // invoke-virtual {p1, v2}, Lfd;->c(F)V
/* iget p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->a:I */
/* sub-int/2addr v7, p1 */
(( android.support.v4.widget.SwipeRefreshLayout ) p0 ).setTargetOffsetTopAndBottom ( v7 ); // invoke-virtual {p0, v7}, Landroid/support/v4/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V
return;
} // .end method
private void b ( Integer p0, android.view.animation.Animation$AnimationListener p1 ) {
/* .locals 2 */
/* iget-boolean v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* invoke-direct {p0, p1, p2}, Landroid/support/v4/widget/SwipeRefreshLayout;->c(ILandroid/view/animation/Animation$AnimationListener;)V */
return;
} // :cond_0
/* iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->b:I */
p1 = this.g;
(( android.view.animation.Animation ) p1 ).reset ( ); // invoke-virtual {p1}, Landroid/view/animation/Animation;->reset()V
p1 = this.g;
/* const-wide/16 v0, 0xc8 */
(( android.view.animation.Animation ) p1 ).setDuration ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V
p1 = this.g;
v0 = this.a;
(( android.view.animation.Animation ) p1 ).setInterpolator ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V
if ( p2 != null) { // if-eqz p2, :cond_1
p1 = this.a;
this.a = p2;
} // :cond_1
p1 = this.a;
(( fc ) p1 ).clearAnimation ( ); // invoke-virtual {p1}, Lfc;->clearAnimation()V
p1 = this.a;
p2 = this.g;
(( fc ) p1 ).startAnimation ( p2 ); // invoke-virtual {p1, p2}, Lfc;->startAnimation(Landroid/view/animation/Animation;)V
return;
} // .end method
private void c ( ) {
/* .locals 2 */
v0 = this.a;
v0 = (( fd ) v0 ).getAlpha ( ); // invoke-virtual {v0}, Lfd;->getAlpha()I
/* const/16 v1, 0xff */
/* invoke-direct {p0, v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->a(II)Landroid/view/animation/Animation; */
this.d = v0;
return;
} // .end method
private void c ( Float p0 ) {
/* .locals 2 */
/* iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->b:F */
/* cmpl-float p1, p1, v0 */
/* if-lez p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
/* invoke-direct {p0, p1, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->a(ZZ)V */
return;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* iput-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->a:Z */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( fd ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lfd;->b(F)V
int v0 = 0; // const/4 v0, 0x0
/* iget-boolean v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->b:Z */
/* if-nez v1, :cond_1 */
/* new-instance v0, Landroid/support/v4/widget/SwipeRefreshLayout$5; */
/* invoke-direct {v0, p0}, Landroid/support/v4/widget/SwipeRefreshLayout$5;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V */
} // :cond_1
/* iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->a:I */
/* invoke-direct {p0, v1, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->b(ILandroid/view/animation/Animation$AnimationListener;)V */
v0 = this.a;
(( fd ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lfd;->a(Z)V
return;
} // .end method
private void c ( Integer p0, android.view.animation.Animation$AnimationListener p1 ) {
/* .locals 2 */
/* iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->b:I */
p1 = this.a;
p1 = (( fc ) p1 ).getScaleX ( ); // invoke-virtual {p1}, Lfc;->getScaleX()F
/* iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->a:F */
/* new-instance p1, Landroid/support/v4/widget/SwipeRefreshLayout$8; */
/* invoke-direct {p1, p0}, Landroid/support/v4/widget/SwipeRefreshLayout$8;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V */
this.e = p1;
p1 = this.e;
/* const-wide/16 v0, 0x96 */
(( android.view.animation.Animation ) p1 ).setDuration ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V
if ( p2 != null) { // if-eqz p2, :cond_0
p1 = this.a;
this.a = p2;
} // :cond_0
p1 = this.a;
(( fc ) p1 ).clearAnimation ( ); // invoke-virtual {p1}, Lfc;->clearAnimation()V
p1 = this.a;
p2 = this.e;
(( fc ) p1 ).startAnimation ( p2 ); // invoke-virtual {p1, p2}, Lfc;->startAnimation(Landroid/view/animation/Animation;)V
return;
} // .end method
private void d ( ) {
/* .locals 3 */
v0 = this.a;
/* if-nez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v1 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildCount()I
/* if-ge v0, v1, :cond_1 */
(( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildAt(I)Landroid/view/View;
v2 = this.a;
v2 = (( java.lang.Object ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_0 */
this.a = v1;
return;
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
return;
} // .end method
private void d ( Float p0 ) {
/* .locals 3 */
/* iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->e:F */
/* sub-float/2addr p1, v0 */
/* iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->f:I */
/* int-to-float v2, v1 */
/* cmpl-float p1, p1, v2 */
/* if-lez p1, :cond_0 */
/* iget-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->f:Z */
/* if-nez p1, :cond_0 */
/* int-to-float p1, v1 */
/* add-float/2addr v0, p1 */
/* iput v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->d:F */
int p1 = 1; // const/4 p1, 0x1
/* iput-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->f:Z */
p1 = this.a;
/* const/16 v0, 0x4c */
(( fd ) p1 ).setAlpha ( v0 ); // invoke-virtual {p1, v0}, Lfd;->setAlpha(I)V
} // :cond_0
return;
} // .end method
private void setColorViewAlpha ( Integer p0 ) {
/* .locals 1 */
v0 = this.a;
(( fc ) v0 ).getBackground ( ); // invoke-virtual {v0}, Lfc;->getBackground()Landroid/graphics/drawable/Drawable;
(( android.graphics.drawable.Drawable ) v0 ).setAlpha ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
v0 = this.a;
(( fd ) v0 ).setAlpha ( p1 ); // invoke-virtual {v0, p1}, Lfd;->setAlpha(I)V
return;
} // .end method
/* # virtual methods */
final void a ( ) {
/* .locals 2 */
v0 = this.a;
(( fc ) v0 ).clearAnimation ( ); // invoke-virtual {v0}, Lfc;->clearAnimation()V
v0 = this.a;
(( fd ) v0 ).stop ( ); // invoke-virtual {v0}, Lfd;->stop()V
v0 = this.a;
/* const/16 v1, 0x8 */
(( fc ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Lfc;->setVisibility(I)V
/* const/16 v0, 0xff */
/* invoke-direct {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setColorViewAlpha(I)V */
/* iget-boolean v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
(( android.support.v4.widget.SwipeRefreshLayout ) p0 ).setAnimationProgress ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setAnimationProgress(F)V
} // :cond_0
/* iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:I */
/* iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->a:I */
/* sub-int/2addr v0, v1 */
(( android.support.v4.widget.SwipeRefreshLayout ) p0 ).setTargetOffsetTopAndBottom ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V
} // :goto_0
v0 = this.a;
v0 = (( fc ) v0 ).getTop ( ); // invoke-virtual {v0}, Lfc;->getTop()I
/* iput v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->a:I */
return;
} // .end method
final void a ( Float p0 ) {
/* .locals 2 */
/* iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->b:I */
/* iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:I */
/* sub-int/2addr v1, v0 */
/* int-to-float v1, v1 */
/* mul-float v1, v1, p1 */
/* float-to-int p1, v1 */
/* add-int/2addr v0, p1 */
p1 = this.a;
p1 = (( fc ) p1 ).getTop ( ); // invoke-virtual {p1}, Lfc;->getTop()I
/* sub-int/2addr v0, p1 */
(( android.support.v4.widget.SwipeRefreshLayout ) p0 ).setTargetOffsetTopAndBottom ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V
return;
} // .end method
final void a ( android.view.animation.Animation$AnimationListener p0 ) {
/* .locals 3 */
/* new-instance v0, Landroid/support/v4/widget/SwipeRefreshLayout$3; */
/* invoke-direct {v0, p0}, Landroid/support/v4/widget/SwipeRefreshLayout$3;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V */
this.b = v0;
v0 = this.b;
/* const-wide/16 v1, 0x96 */
(( android.view.animation.Animation ) v0 ).setDuration ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V
v0 = this.a;
this.a = p1;
(( fc ) v0 ).clearAnimation ( ); // invoke-virtual {v0}, Lfc;->clearAnimation()V
p1 = this.a;
v0 = this.b;
(( fc ) p1 ).startAnimation ( v0 ); // invoke-virtual {p1, v0}, Lfc;->startAnimation(Landroid/view/animation/Animation;)V
return;
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
v0 = this.a;
int v5 = 0; // const/4 v5, 0x0
/* move v1, p1 */
/* move v2, p2 */
/* move-object v3, p3 */
/* move-object v4, p4 */
p1 = /* invoke-virtual/range {v0 ..v5}, Lef;->a(II[I[II)Z */
} // .end method
public Boolean dispatchNestedScroll ( Integer p0, Integer p1, Integer p2, Integer p3, Integer[] p4 ) {
/* .locals 7 */
v0 = this.a;
int v6 = 0; // const/4 v6, 0x0
/* move v1, p1 */
/* move v2, p2 */
/* move v3, p3 */
/* move v4, p4 */
/* move-object v5, p5 */
p1 = /* invoke-virtual/range {v0 ..v6}, Lef;->a(IIII[II)Z */
} // .end method
protected Integer getChildDrawingOrder ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->i:I */
/* if-gez v0, :cond_0 */
} // :cond_0
/* add-int/lit8 p1, p1, -0x1 */
/* if-ne p2, p1, :cond_1 */
} // :cond_1
/* if-lt p2, v0, :cond_2 */
/* add-int/lit8 p2, p2, 0x1 */
} // :cond_2
} // .end method
public Integer getNestedScrollAxes ( ) {
/* .locals 1 */
v0 = this.a;
/* iget v0, v0, Lei;->a:I */
} // .end method
public Integer getProgressCircleDiameter ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->j:I */
} // .end method
public Integer getProgressViewEndOffset ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->d:I */
} // .end method
public Integer getProgressViewStartOffset ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:I */
} // .end method
public Boolean hasNestedScrollingParent ( ) {
/* .locals 2 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
v0 = (( ef ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lef;->a(I)Z
} // .end method
public Boolean isNestedScrollingEnabled ( ) {
/* .locals 1 */
v0 = this.a;
/* iget-boolean v0, v0, Lef;->a:Z */
} // .end method
protected void onDetachedFromWindow ( ) {
/* .locals 0 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V */
(( android.support.v4.widget.SwipeRefreshLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->a()V
return;
} // .end method
public Boolean onInterceptTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 3 */
/* invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->d()V */
v0 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
/* iget-boolean v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->g:Z */
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_0
/* if-nez v0, :cond_0 */
/* iput-boolean v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->g:Z */
} // :cond_0
v1 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).isEnabled ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->isEnabled()Z
if ( v1 != null) { // if-eqz v1, :cond_6
/* iget-boolean v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->g:Z */
/* if-nez v1, :cond_6 */
v1 = /* invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->a()Z */
/* if-nez v1, :cond_6 */
/* iget-boolean v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->a:Z */
/* if-nez v1, :cond_6 */
/* iget-boolean v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->e:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
} // :cond_1
int v1 = 6; // const/4 v1, 0x6
/* if-eq v0, v1, :cond_5 */
int v1 = -1; // const/4 v1, -0x1
/* packed-switch v0, :pswitch_data_0 */
/* :pswitch_0 */
/* iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->h:I */
/* if-ne v0, v1, :cond_2 */
p1 = android.support.v4.widget.SwipeRefreshLayout.a;
final String v0 = "Got ACTION_MOVE event but don\'t have an active pointer id."; // const-string v0, "Got ACTION_MOVE event but don\'t have an active pointer id."
android.util.Log .e ( p1,v0 );
} // :cond_2
v0 = (( android.view.MotionEvent ) p1 ).findPointerIndex ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I
/* if-gez v0, :cond_3 */
} // :cond_3
p1 = (( android.view.MotionEvent ) p1 ).getY ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F
/* invoke-direct {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->d(F)V */
/* :pswitch_1 */
/* iput-boolean v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->f:Z */
/* iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->h:I */
/* :pswitch_2 */
/* iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:I */
v1 = this.a;
v1 = (( fc ) v1 ).getTop ( ); // invoke-virtual {v1}, Lfc;->getTop()I
/* sub-int/2addr v0, v1 */
(( android.support.v4.widget.SwipeRefreshLayout ) p0 ).setTargetOffsetTopAndBottom ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V
v0 = (( android.view.MotionEvent ) p1 ).getPointerId ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->h:I */
/* iput-boolean v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->f:Z */
/* iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->h:I */
v0 = (( android.view.MotionEvent ) p1 ).findPointerIndex ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I
/* if-gez v0, :cond_4 */
} // :cond_4
p1 = (( android.view.MotionEvent ) p1 ).getY ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F
/* iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->e:F */
} // :cond_5
/* invoke-direct {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->a(Landroid/view/MotionEvent;)V */
} // :goto_0
/* iget-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->f:Z */
} // :cond_6
} // :goto_1
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
protected void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 2 */
p1 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getMeasuredWidth()I
p2 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getMeasuredHeight()I
p3 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildCount()I
/* if-nez p3, :cond_0 */
return;
} // :cond_0
p3 = this.a;
/* if-nez p3, :cond_1 */
/* invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->d()V */
} // :cond_1
p3 = this.a;
/* if-nez p3, :cond_2 */
return;
} // :cond_2
p4 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingLeft()I
p5 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingTop()I
v0 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingLeft()I
/* sub-int v0, p1, v0 */
v1 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingRight()I
/* sub-int/2addr v0, v1 */
v1 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingTop()I
/* sub-int/2addr p2, v1 */
v1 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingBottom()I
/* sub-int/2addr p2, v1 */
/* add-int/2addr v0, p4 */
/* add-int/2addr p2, p5 */
(( android.view.View ) p3 ).layout ( p4, p5, v0, p2 ); // invoke-virtual {p3, p4, p5, v0, p2}, Landroid/view/View;->layout(IIII)V
p2 = this.a;
p2 = (( fc ) p2 ).getMeasuredWidth ( ); // invoke-virtual {p2}, Lfc;->getMeasuredWidth()I
p3 = this.a;
p3 = (( fc ) p3 ).getMeasuredHeight ( ); // invoke-virtual {p3}, Lfc;->getMeasuredHeight()I
p4 = this.a;
/* div-int/lit8 p1, p1, 0x2 */
/* div-int/lit8 p2, p2, 0x2 */
/* sub-int p5, p1, p2 */
/* iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->a:I */
/* add-int/2addr p1, p2 */
/* add-int/2addr p3, v0 */
(( fc ) p4 ).layout ( p5, v0, p1, p3 ); // invoke-virtual {p4, p5, v0, p1, p3}, Lfc;->layout(IIII)V
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onMeasure(II)V */
p1 = this.a;
/* if-nez p1, :cond_0 */
/* invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->d()V */
} // :cond_0
p1 = this.a;
/* if-nez p1, :cond_1 */
return;
} // :cond_1
p2 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getMeasuredWidth()I
v0 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingLeft()I
/* sub-int/2addr p2, v0 */
v0 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingRight()I
/* sub-int/2addr p2, v0 */
/* const/high16 v0, 0x40000000 # 2.0f */
p2 = android.view.View$MeasureSpec .makeMeasureSpec ( p2,v0 );
v1 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getMeasuredHeight()I
v2 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingTop()I
/* sub-int/2addr v1, v2 */
v2 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingBottom()I
/* sub-int/2addr v1, v2 */
v1 = android.view.View$MeasureSpec .makeMeasureSpec ( v1,v0 );
(( android.view.View ) p1 ).measure ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Landroid/view/View;->measure(II)V
p1 = this.a;
/* iget p2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->j:I */
p2 = android.view.View$MeasureSpec .makeMeasureSpec ( p2,v0 );
/* iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->j:I */
v0 = android.view.View$MeasureSpec .makeMeasureSpec ( v1,v0 );
(( fc ) p1 ).measure ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Lfc;->measure(II)V
int p1 = -1; // const/4 p1, -0x1
/* iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->i:I */
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
p2 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildCount()I
/* if-ge p1, p2, :cond_3 */
(( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getChildAt ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildAt(I)Landroid/view/View;
v0 = this.a;
/* if-ne p2, v0, :cond_2 */
/* iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->i:I */
return;
} // :cond_2
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_3
return;
} // .end method
public Boolean onNestedFling ( android.view.View p0, Float p1, Float p2, Boolean p3 ) {
/* .locals 0 */
p1 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).dispatchNestedFling ( p2, p3, p4 ); // invoke-virtual {p0, p2, p3, p4}, Landroid/support/v4/widget/SwipeRefreshLayout;->dispatchNestedFling(FFZ)Z
} // .end method
public Boolean onNestedPreFling ( android.view.View p0, Float p1, Float p2 ) {
/* .locals 0 */
p1 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).dispatchNestedPreFling ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Landroid/support/v4/widget/SwipeRefreshLayout;->dispatchNestedPreFling(FF)Z
} // .end method
public void onNestedPreScroll ( android.view.View p0, Integer p1, Integer p2, Integer[] p3 ) {
/* .locals 4 */
int p1 = 0; // const/4 p1, 0x0
int v0 = 1; // const/4 v0, 0x1
/* if-lez p3, :cond_1 */
/* iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:F */
/* cmpl-float v2, v1, p1 */
/* if-lez v2, :cond_1 */
/* int-to-float v2, p3 */
/* cmpl-float v3, v2, v1 */
/* if-lez v3, :cond_0 */
/* float-to-int v1, v1 */
/* sub-int v1, p3, v1 */
/* aput v1, p4, v0 */
/* iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:F */
} // :cond_0
/* sub-float/2addr v1, v2 */
/* iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:F */
/* aput p3, p4, v0 */
} // :goto_0
/* iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:F */
/* invoke-direct {p0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->b(F)V */
} // :cond_1
/* iget-boolean v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->d:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* if-lez p3, :cond_2 */
/* iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:F */
/* cmpl-float p1, v1, p1 */
/* if-nez p1, :cond_2 */
/* aget p1, p4, v0 */
/* sub-int p1, p3, p1 */
p1 = java.lang.Math .abs ( p1 );
/* if-lez p1, :cond_2 */
p1 = this.a;
/* const/16 v1, 0x8 */
(( fc ) p1 ).setVisibility ( v1 ); // invoke-virtual {p1, v1}, Lfc;->setVisibility(I)V
} // :cond_2
p1 = this.a;
int v1 = 0; // const/4 v1, 0x0
/* aget v2, p4, v1 */
/* sub-int/2addr p2, v2 */
/* aget v2, p4, v0 */
/* sub-int/2addr p3, v2 */
int v2 = 0; // const/4 v2, 0x0
p2 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).dispatchNestedPreScroll ( p2, p3, p1, v2 ); // invoke-virtual {p0, p2, p3, p1, v2}, Landroid/support/v4/widget/SwipeRefreshLayout;->dispatchNestedPreScroll(II[I[I)Z
if ( p2 != null) { // if-eqz p2, :cond_3
/* aget p2, p4, v1 */
/* aget p3, p1, v1 */
/* add-int/2addr p2, p3 */
/* aput p2, p4, v1 */
/* aget p2, p4, v0 */
/* aget p1, p1, v0 */
/* add-int/2addr p2, p1 */
/* aput p2, p4, v0 */
} // :cond_3
return;
} // .end method
public void onNestedScroll ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 6 */
v5 = this.b;
/* move-object v0, p0 */
/* move v1, p2 */
/* move v2, p3 */
/* move v3, p4 */
/* move v4, p5 */
/* invoke-virtual/range {v0 ..v5}, Landroid/support/v4/widget/SwipeRefreshLayout;->dispatchNestedScroll(IIII[I)Z */
p1 = this.b;
int p2 = 1; // const/4 p2, 0x1
/* aget p1, p1, p2 */
/* add-int/2addr p5, p1 */
/* if-gez p5, :cond_0 */
p1 = /* invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->a()Z */
/* if-nez p1, :cond_0 */
/* iget p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:F */
p2 = java.lang.Math .abs ( p5 );
/* int-to-float p2, p2 */
/* add-float/2addr p1, p2 */
/* iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:F */
/* iget p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:F */
/* invoke-direct {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->b(F)V */
} // :cond_0
return;
} // .end method
public void onNestedScrollAccepted ( android.view.View p0, android.view.View p1, Integer p2 ) {
/* .locals 0 */
p1 = this.a;
/* iput p3, p1, Lei;->a:I */
/* and-int/lit8 p1, p3, 0x2 */
(( android.support.v4.widget.SwipeRefreshLayout ) p0 ).startNestedScroll ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->startNestedScroll(I)Z
int p1 = 0; // const/4 p1, 0x0
/* iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:F */
int p1 = 1; // const/4 p1, 0x1
/* iput-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->e:Z */
return;
} // .end method
public Boolean onStartNestedScroll ( android.view.View p0, android.view.View p1, Integer p2 ) {
/* .locals 0 */
p1 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).isEnabled ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->isEnabled()Z
if ( p1 != null) { // if-eqz p1, :cond_0
/* iget-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->g:Z */
/* if-nez p1, :cond_0 */
/* iget-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->a:Z */
/* if-nez p1, :cond_0 */
/* and-int/lit8 p1, p3, 0x2 */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void onStopNestedScroll ( android.view.View p0 ) {
/* .locals 2 */
p1 = this.a;
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p1, Lei;->a:I */
/* iput-boolean v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->e:Z */
/* iget p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:F */
int v0 = 0; // const/4 v0, 0x0
/* cmpl-float v1, p1, v0 */
/* if-lez v1, :cond_0 */
/* invoke-direct {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->c(F)V */
/* iput v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:F */
} // :cond_0
(( android.support.v4.widget.SwipeRefreshLayout ) p0 ).stopNestedScroll ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->stopNestedScroll()V
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 4 */
v0 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
/* iget-boolean v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->g:Z */
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_0
/* if-nez v0, :cond_0 */
/* iput-boolean v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->g:Z */
} // :cond_0
v1 = (( android.support.v4.widget.SwipeRefreshLayout ) p0 ).isEnabled ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->isEnabled()Z
if ( v1 != null) { // if-eqz v1, :cond_8
/* iget-boolean v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->g:Z */
/* if-nez v1, :cond_8 */
v1 = /* invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->a()Z */
/* if-nez v1, :cond_8 */
/* iget-boolean v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->a:Z */
/* if-nez v1, :cond_8 */
/* iget-boolean v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->e:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* goto/16 :goto_1 */
} // :cond_1
/* const/high16 v1, 0x3f000000 # 0.5f */
/* packed-switch v0, :pswitch_data_0 */
/* :pswitch_0 */
/* goto/16 :goto_0 */
/* :pswitch_1 */
/* invoke-direct {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->a(Landroid/view/MotionEvent;)V */
/* :pswitch_2 */
v0 = (( android.view.MotionEvent ) p1 ).getActionIndex ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I
/* if-gez v0, :cond_2 */
p1 = android.support.v4.widget.SwipeRefreshLayout.a;
final String v0 = "Got ACTION_POINTER_DOWN event but have an invalid action index."; // const-string v0, "Got ACTION_POINTER_DOWN event but have an invalid action index."
android.util.Log .e ( p1,v0 );
} // :cond_2
p1 = (( android.view.MotionEvent ) p1 ).getPointerId ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->h:I */
/* :pswitch_3 */
/* :pswitch_4 */
/* iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->h:I */
v0 = (( android.view.MotionEvent ) p1 ).findPointerIndex ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I
/* if-gez v0, :cond_3 */
p1 = android.support.v4.widget.SwipeRefreshLayout.a;
final String v0 = "Got ACTION_MOVE event but have an invalid active pointer id."; // const-string v0, "Got ACTION_MOVE event but have an invalid active pointer id."
android.util.Log .e ( p1,v0 );
} // :cond_3
p1 = (( android.view.MotionEvent ) p1 ).getY ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F
/* invoke-direct {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->d(F)V */
/* iget-boolean v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_7
/* iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->d:F */
/* sub-float/2addr p1, v0 */
/* mul-float p1, p1, v1 */
int v0 = 0; // const/4 v0, 0x0
/* cmpl-float v0, p1, v0 */
/* if-lez v0, :cond_4 */
/* invoke-direct {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->b(F)V */
} // :cond_4
/* :pswitch_5 */
/* iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->h:I */
v0 = (( android.view.MotionEvent ) p1 ).findPointerIndex ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I
/* if-gez v0, :cond_5 */
p1 = android.support.v4.widget.SwipeRefreshLayout.a;
final String v0 = "Got ACTION_UP event but don\'t have an active pointer id."; // const-string v0, "Got ACTION_UP event but don\'t have an active pointer id."
android.util.Log .e ( p1,v0 );
} // :cond_5
/* iget-boolean v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->f:Z */
if ( v3 != null) { // if-eqz v3, :cond_6
p1 = (( android.view.MotionEvent ) p1 ).getY ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F
/* iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->d:F */
/* sub-float/2addr p1, v0 */
/* mul-float p1, p1, v1 */
/* iput-boolean v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->f:Z */
/* invoke-direct {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->c(F)V */
} // :cond_6
int p1 = -1; // const/4 p1, -0x1
/* iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->h:I */
/* :pswitch_6 */
p1 = (( android.view.MotionEvent ) p1 ).getPointerId ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->h:I */
/* iput-boolean v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->f:Z */
} // :cond_7
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_8
} // :goto_1
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
public void requestDisallowInterceptTouchEvent ( Boolean p0 ) {
/* .locals 2 */
/* const/16 v1, 0x15 */
/* if-ge v0, v1, :cond_0 */
v0 = this.a;
/* instance-of v0, v0, Landroid/widget/AbsListView; */
/* if-nez v0, :cond_2 */
} // :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = em .c ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_2
} // :cond_1
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V */
} // :cond_2
return;
} // .end method
void setAnimationProgress ( Float p0 ) {
/* .locals 1 */
v0 = this.a;
(( fc ) v0 ).setScaleX ( p1 ); // invoke-virtual {v0, p1}, Lfc;->setScaleX(F)V
v0 = this.a;
(( fc ) v0 ).setScaleY ( p1 ); // invoke-virtual {v0, p1}, Lfc;->setScaleY(F)V
return;
} // .end method
public void setColorScheme ( Integer...p0 ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
(( android.support.v4.widget.SwipeRefreshLayout ) p0 ).setColorSchemeResources ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setColorSchemeResources([I)V
return;
} // .end method
public void setColorSchemeColors ( Integer...p0 ) {
/* .locals 2 */
/* invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->d()V */
v0 = this.a;
v1 = this.a;
(( fd$a ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lfd$a;->a([I)V
p1 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( fd$a ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lfd$a;->a(I)V
(( fd ) v0 ).invalidateSelf ( ); // invoke-virtual {v0}, Lfd;->invalidateSelf()V
return;
} // .end method
public void setColorSchemeResources ( Integer...p0 ) {
/* .locals 4 */
(( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getContext()Landroid/content/Context;
/* array-length v1, p1 */
/* new-array v1, v1, [I */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* array-length v3, p1 */
/* if-ge v2, v3, :cond_0 */
/* aget v3, p1, v2 */
v3 = ce .a ( v0,v3 );
/* aput v3, v1, v2 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
(( android.support.v4.widget.SwipeRefreshLayout ) p0 ).setColorSchemeColors ( v1 ); // invoke-virtual {p0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setColorSchemeColors([I)V
return;
} // .end method
public void setDistanceToTriggerSync ( Integer p0 ) {
/* .locals 0 */
/* int-to-float p1, p1 */
/* iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->b:F */
return;
} // .end method
public void setEnabled ( Boolean p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->setEnabled(Z)V */
/* if-nez p1, :cond_0 */
(( android.support.v4.widget.SwipeRefreshLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->a()V
} // :cond_0
return;
} // .end method
public void setNestedScrollingEnabled ( Boolean p0 ) {
/* .locals 1 */
v0 = this.a;
(( ef ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lef;->a(Z)V
return;
} // .end method
public void setOnChildScrollUpCallback ( android.support.v4.widget.SwipeRefreshLayout$a p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
public void setOnRefreshListener ( android.support.v4.widget.SwipeRefreshLayout$b p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
public void setProgressBackgroundColor ( Integer p0 ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
(( android.support.v4.widget.SwipeRefreshLayout ) p0 ).setProgressBackgroundColorSchemeResource ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setProgressBackgroundColorSchemeResource(I)V
return;
} // .end method
public void setProgressBackgroundColorSchemeColor ( Integer p0 ) {
/* .locals 1 */
v0 = this.a;
(( fc ) v0 ).setBackgroundColor ( p1 ); // invoke-virtual {v0, p1}, Lfc;->setBackgroundColor(I)V
return;
} // .end method
public void setProgressBackgroundColorSchemeResource ( Integer p0 ) {
/* .locals 1 */
(( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getContext()Landroid/content/Context;
p1 = ce .a ( v0,p1 );
(( android.support.v4.widget.SwipeRefreshLayout ) p0 ).setProgressBackgroundColorSchemeColor ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setProgressBackgroundColorSchemeColor(I)V
return;
} // .end method
public void setProgressViewEndTarget ( Boolean p0, Integer p1 ) {
/* .locals 0 */
/* iput p2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->d:I */
/* iput-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->b:Z */
p1 = this.a;
(( fc ) p1 ).invalidate ( ); // invoke-virtual {p1}, Lfc;->invalidate()V
return;
} // .end method
public void setProgressViewOffset ( Boolean p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->b:Z */
/* iput p2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:I */
/* iput p3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->d:I */
int p1 = 1; // const/4 p1, 0x1
/* iput-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->d:Z */
(( android.support.v4.widget.SwipeRefreshLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->a()V
int p1 = 0; // const/4 p1, 0x0
/* iput-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->a:Z */
return;
} // .end method
public void setRefreshing ( Boolean p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_2
/* iget-boolean v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->a:Z */
/* if-eq v1, p1, :cond_2 */
/* iput-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->a:Z */
/* iget-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->d:Z */
/* if-nez p1, :cond_0 */
/* iget p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->d:I */
/* iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:I */
/* add-int/2addr p1, v1 */
} // :cond_0
/* iget p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->d:I */
} // :goto_0
/* iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->a:I */
/* sub-int/2addr p1, v1 */
(( android.support.v4.widget.SwipeRefreshLayout ) p0 ).setTargetOffsetTopAndBottom ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V
/* iput-boolean v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:Z */
p1 = this.a;
v1 = this.a;
(( fc ) v1 ).setVisibility ( v0 ); // invoke-virtual {v1, v0}, Lfc;->setVisibility(I)V
v0 = this.a;
/* const/16 v1, 0xff */
(( fd ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Lfd;->setAlpha(I)V
/* new-instance v0, Landroid/support/v4/widget/SwipeRefreshLayout$2; */
/* invoke-direct {v0, p0}, Landroid/support/v4/widget/SwipeRefreshLayout$2;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V */
this.a = v0;
v0 = this.a;
/* iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->g:I */
/* int-to-long v1, v1 */
(( android.view.animation.Animation ) v0 ).setDuration ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V
if ( p1 != null) { // if-eqz p1, :cond_1
v0 = this.a;
this.a = p1;
} // :cond_1
p1 = this.a;
(( fc ) p1 ).clearAnimation ( ); // invoke-virtual {p1}, Lfc;->clearAnimation()V
p1 = this.a;
v0 = this.a;
(( fc ) p1 ).startAnimation ( v0 ); // invoke-virtual {p1, v0}, Lfc;->startAnimation(Landroid/view/animation/Animation;)V
return;
} // :cond_2
/* invoke-direct {p0, p1, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->a(ZZ)V */
return;
} // .end method
public void setSize ( Integer p0 ) {
/* .locals 2 */
if ( p1 != null) { // if-eqz p1, :cond_0
int v0 = 1; // const/4 v0, 0x1
/* if-eq p1, v0, :cond_0 */
return;
} // :cond_0
(( android.support.v4.widget.SwipeRefreshLayout ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* if-nez p1, :cond_1 */
/* const/high16 v1, 0x42600000 # 56.0f */
} // :cond_1
/* const/high16 v1, 0x42200000 # 40.0f */
} // :goto_0
/* iget v0, v0, Landroid/util/DisplayMetrics;->density:F */
/* mul-float v0, v0, v1 */
/* float-to-int v0, v0 */
/* iput v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->j:I */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( fc ) v0 ).setImageDrawable ( v1 ); // invoke-virtual {v0, v1}, Lfc;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
v0 = this.a;
(( fd ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lfd;->a(I)V
p1 = this.a;
v0 = this.a;
(( fc ) p1 ).setImageDrawable ( v0 ); // invoke-virtual {p1, v0}, Lfc;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setSlingshotDistance ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->e:I */
return;
} // .end method
void setTargetOffsetTopAndBottom ( Integer p0 ) {
/* .locals 1 */
v0 = this.a;
(( fc ) v0 ).bringToFront ( ); // invoke-virtual {v0}, Lfc;->bringToFront()V
v0 = this.a;
em .b ( v0,p1 );
p1 = this.a;
p1 = (( fc ) p1 ).getTop ( ); // invoke-virtual {p1}, Lfc;->getTop()I
/* iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->a:I */
return;
} // .end method
public Boolean startNestedScroll ( Integer p0 ) {
/* .locals 2 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
p1 = (( ef ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lef;->a(II)Z
} // .end method
public void stopNestedScroll ( ) {
/* .locals 2 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( ef ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lef;->a(I)V
return;
} // .end method
