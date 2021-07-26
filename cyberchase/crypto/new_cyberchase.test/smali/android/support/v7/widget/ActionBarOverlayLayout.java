public class android.support.v7.widget.ActionBarOverlayLayout extends android.view.ViewGroup implements eg implements ib {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/v7/widget/ActionBarOverlayLayout$a;, */
	 /* Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams; */
	 /* } */
} // .end annotation
/* # static fields */
static final a;
/* # instance fields */
private Integer a;
final android.animation.AnimatorListenerAdapter a;
private final android.graphics.Rect a;
private android.graphics.drawable.Drawable a;
android.support.v7.widget.ActionBarContainer a;
private android.support.v7.widget.ActionBarOverlayLayout$a a;
private android.support.v7.widget.ContentFrameLayout a;
android.view.ViewPropertyAnimator a;
private android.widget.OverScroller a;
private final ei a;
private ic a;
private final java.lang.Runnable a;
public Boolean a;
private Integer b;
private final android.graphics.Rect b;
private final java.lang.Runnable b;
Boolean b;
private Integer c;
private final android.graphics.Rect c;
private Boolean c;
private Integer d;
private final android.graphics.Rect d;
private Boolean d;
private final android.graphics.Rect e;
private Boolean e;
private final android.graphics.Rect f;
private final android.graphics.Rect g;
/* # direct methods */
static android.support.v7.widget.ActionBarOverlayLayout ( ) {
	 /* .locals 3 */
	 int v0 = 2; // const/4 v0, 0x2
	 /* new-array v0, v0, [I */
	 int v2 = 0; // const/4 v2, 0x0
	 /* aput v1, v0, v2 */
	 int v1 = 1; // const/4 v1, 0x1
	 /* const v2, 0x1010059 */
	 /* aput v2, v0, v1 */
	 return;
} // .end method
public android.support.v7.widget.ActionBarOverlayLayout ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/ActionBarOverlayLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 return;
} // .end method
public android.support.v7.widget.ActionBarOverlayLayout ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 int p2 = 0; // const/4 p2, 0x0
	 /* iput p2, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->b:I */
	 /* new-instance p2, Landroid/graphics/Rect; */
	 /* invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V */
	 this.a = p2;
	 /* new-instance p2, Landroid/graphics/Rect; */
	 /* invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V */
	 this.b = p2;
	 /* new-instance p2, Landroid/graphics/Rect; */
	 /* invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V */
	 this.c = p2;
	 /* new-instance p2, Landroid/graphics/Rect; */
	 /* invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V */
	 this.d = p2;
	 /* new-instance p2, Landroid/graphics/Rect; */
	 /* invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V */
	 this.e = p2;
	 /* new-instance p2, Landroid/graphics/Rect; */
	 /* invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V */
	 this.f = p2;
	 /* new-instance p2, Landroid/graphics/Rect; */
	 /* invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V */
	 this.g = p2;
	 /* new-instance p2, Landroid/support/v7/widget/ActionBarOverlayLayout$1; */
	 /* invoke-direct {p2, p0}, Landroid/support/v7/widget/ActionBarOverlayLayout$1;-><init>(Landroid/support/v7/widget/ActionBarOverlayLayout;)V */
	 this.a = p2;
	 /* new-instance p2, Landroid/support/v7/widget/ActionBarOverlayLayout$2; */
	 /* invoke-direct {p2, p0}, Landroid/support/v7/widget/ActionBarOverlayLayout$2;-><init>(Landroid/support/v7/widget/ActionBarOverlayLayout;)V */
	 this.a = p2;
	 /* new-instance p2, Landroid/support/v7/widget/ActionBarOverlayLayout$3; */
	 /* invoke-direct {p2, p0}, Landroid/support/v7/widget/ActionBarOverlayLayout$3;-><init>(Landroid/support/v7/widget/ActionBarOverlayLayout;)V */
	 this.b = p2;
	 /* invoke-direct {p0, p1}, Landroid/support/v7/widget/ActionBarOverlayLayout;->a(Landroid/content/Context;)V */
	 /* new-instance p1, Lei; */
	 /* invoke-direct {p1, p0}, Lei;-><init>(Landroid/view/ViewGroup;)V */
	 this.a = p1;
	 return;
} // .end method
private static ic a ( android.view.View p0 ) {
	 /* .locals 3 */
	 /* instance-of v0, p0, Lic; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* check-cast p0, Lic; */
	 } // :cond_0
	 /* instance-of v0, p0, Landroid/support/v7/widget/Toolbar; */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* check-cast p0, Landroid/support/v7/widget/Toolbar; */
		 (( android.support.v7.widget.Toolbar ) p0 ).getWrapper ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getWrapper()Lic;
	 } // :cond_1
	 /* new-instance v0, Ljava/lang/IllegalStateException; */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "Can\'t make a decor toolbar out of "; // const-string v2, "Can\'t make a decor toolbar out of "
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
	 (( java.lang.Class ) p0 ).getSimpleName ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // .end method
private void a ( android.content.Context p0 ) {
	 /* .locals 4 */
	 (( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->getContext()Landroid/content/Context;
	 (( android.content.Context ) v0 ).getTheme ( ); // invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
	 v1 = android.support.v7.widget.ActionBarOverlayLayout.a;
	 (( android.content.res.Resources$Theme ) v0 ).obtainStyledAttributes ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;
	 int v1 = 0; // const/4 v1, 0x0
	 v2 = 	 (( android.content.res.TypedArray ) v0 ).getDimensionPixelSize ( v1, v1 ); // invoke-virtual {v0, v1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
	 /* iput v2, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->a:I */
	 int v2 = 1; // const/4 v2, 0x1
	 (( android.content.res.TypedArray ) v0 ).getDrawable ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
	 this.a = v3;
	 v3 = this.a;
	 /* if-nez v3, :cond_0 */
	 int v3 = 1; // const/4 v3, 0x1
} // :cond_0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).setWillNotDraw ( v3 ); // invoke-virtual {p0, v3}, Landroid/support/v7/widget/ActionBarOverlayLayout;->setWillNotDraw(Z)V
(( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
(( android.content.Context ) p1 ).getApplicationInfo ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
/* iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I */
/* const/16 v3, 0x13 */
/* if-ge v0, v3, :cond_1 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_1
/* iput-boolean v1, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->c:Z */
/* new-instance v0, Landroid/widget/OverScroller; */
/* invoke-direct {v0, p1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V */
this.a = v0;
return;
} // .end method
private static Boolean a ( android.view.View p0, android.graphics.Rect p1, Boolean p2 ) {
/* .locals 4 */
(( android.view.View ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p0, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams; */
/* iget v0, p0, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams;->leftMargin:I */
/* iget v1, p1, Landroid/graphics/Rect;->left:I */
int v2 = 1; // const/4 v2, 0x1
/* if-eq v0, v1, :cond_0 */
/* iget v0, p1, Landroid/graphics/Rect;->left:I */
/* iput v0, p0, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams;->leftMargin:I */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* iget v1, p0, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams;->topMargin:I */
/* iget v3, p1, Landroid/graphics/Rect;->top:I */
/* if-eq v1, v3, :cond_1 */
/* iget v0, p1, Landroid/graphics/Rect;->top:I */
/* iput v0, p0, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams;->topMargin:I */
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
/* iget v1, p0, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams;->rightMargin:I */
/* iget v3, p1, Landroid/graphics/Rect;->right:I */
/* if-eq v1, v3, :cond_2 */
/* iget v0, p1, Landroid/graphics/Rect;->right:I */
/* iput v0, p0, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams;->rightMargin:I */
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
if ( p2 != null) { // if-eqz p2, :cond_3
/* iget p2, p0, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams;->bottomMargin:I */
/* iget v1, p1, Landroid/graphics/Rect;->bottom:I */
/* if-eq p2, v1, :cond_3 */
/* iget p1, p1, Landroid/graphics/Rect;->bottom:I */
/* iput p1, p0, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams;->bottomMargin:I */
int v0 = 1; // const/4 v0, 0x1
} // :cond_3
} // .end method
private void c ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/support/v7/widget/ContentFrameLayout; */
this.a = v0;
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/support/v7/widget/ActionBarContainer; */
this.a = v0;
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->findViewById(I)Landroid/view/View;
android.support.v7.widget.ActionBarOverlayLayout .a ( v0 );
this.a = v0;
} // :cond_0
return;
} // .end method
/* # virtual methods */
final void a ( ) {
/* .locals 1 */
v0 = this.a;
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).removeCallbacks ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->removeCallbacks(Ljava/lang/Runnable;)Z
v0 = this.b;
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).removeCallbacks ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->removeCallbacks(Ljava/lang/Runnable;)Z
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.view.ViewPropertyAnimator ) v0 ).cancel ( ); // invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V
} // :cond_0
return;
} // .end method
public final void a ( Integer p0 ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->c()V */
int v0 = 2; // const/4 v0, 0x2
/* if-eq p1, v0, :cond_2 */
int v0 = 5; // const/4 v0, 0x5
/* if-eq p1, v0, :cond_1 */
/* const/16 v0, 0x6d */
/* if-eq p1, v0, :cond_0 */
} // :cond_0
int p1 = 1; // const/4 p1, 0x1
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).setOverlayMode ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/ActionBarOverlayLayout;->setOverlayMode(Z)V
} // :goto_0
return;
} // :cond_1
p1 = this.a;
return;
} // :cond_2
p1 = this.a;
return;
} // .end method
public final Boolean a ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->c()V */
v0 = v0 = this.a;
} // .end method
public final void b ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->c()V */
v0 = this.a;
return;
} // .end method
public final Boolean b ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->c()V */
v0 = v0 = this.a;
} // .end method
public final Boolean c ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->c()V */
v0 = v0 = this.a;
} // .end method
protected Boolean checkLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 0 */
/* instance-of p1, p1, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams; */
} // .end method
public final Boolean d ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->c()V */
v0 = v0 = this.a;
} // .end method
public void draw ( android.graphics.Canvas p0 ) {
/* .locals 5 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget-boolean v0, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->c:Z */
/* if-nez v0, :cond_1 */
v0 = this.a;
v0 = (( android.support.v7.widget.ActionBarContainer ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/support/v7/widget/ActionBarContainer;->getVisibility()I
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
v0 = this.a;
v0 = (( android.support.v7.widget.ActionBarContainer ) v0 ).getBottom ( ); // invoke-virtual {v0}, Landroid/support/v7/widget/ActionBarContainer;->getBottom()I
/* int-to-float v0, v0 */
v2 = this.a;
v2 = (( android.support.v7.widget.ActionBarContainer ) v2 ).getTranslationY ( ); // invoke-virtual {v2}, Landroid/support/v7/widget/ActionBarContainer;->getTranslationY()F
/* add-float/2addr v0, v2 */
/* const/high16 v2, 0x3f000000 # 0.5f */
/* add-float/2addr v0, v2 */
/* float-to-int v0, v0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v2 = this.a;
v3 = (( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->getWidth()I
v4 = this.a;
v4 = (( android.graphics.drawable.Drawable ) v4 ).getIntrinsicHeight ( ); // invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
/* add-int/2addr v4, v0 */
(( android.graphics.drawable.Drawable ) v2 ).setBounds ( v1, v0, v3, v4 ); // invoke-virtual {v2, v1, v0, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
v0 = this.a;
(( android.graphics.drawable.Drawable ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
} // :cond_1
return;
} // .end method
public final Boolean e ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->c()V */
v0 = v0 = this.a;
} // .end method
protected Boolean fitSystemWindows ( android.graphics.Rect p0 ) {
/* .locals 3 */
/* invoke-direct {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->c()V */
em .d ( p0 );
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
v0 = android.support.v7.widget.ActionBarOverlayLayout .a ( v0,p1,v1 );
v1 = this.d;
(( android.graphics.Rect ) v1 ).set ( p1 ); // invoke-virtual {v1, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
p1 = this.d;
v1 = this.a;
iv .a ( p0,p1,v1 );
p1 = this.e;
v1 = this.d;
p1 = (( android.graphics.Rect ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z
int v1 = 1; // const/4 v1, 0x1
/* if-nez p1, :cond_0 */
p1 = this.e;
v0 = this.d;
(( android.graphics.Rect ) p1 ).set ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
p1 = this.b;
v2 = this.a;
p1 = (( android.graphics.Rect ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z
/* if-nez p1, :cond_1 */
p1 = this.b;
v0 = this.a;
(( android.graphics.Rect ) p1 ).set ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_2
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->requestLayout()V
} // :cond_2
} // .end method
protected android.view.ViewGroup$LayoutParams generateDefaultLayoutParams ( ) { //synthethic
/* .locals 1 */
/* new-instance v0, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams; */
/* invoke-direct {v0}, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams;-><init>()V */
} // .end method
public android.view.ViewGroup$LayoutParams generateLayoutParams ( android.util.AttributeSet p0 ) { //synthethic
/* .locals 2 */
/* new-instance v0, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams; */
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1, p1}, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
protected android.view.ViewGroup$LayoutParams generateLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 1 */
/* new-instance v0, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams; */
/* invoke-direct {v0, p1}, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
} // .end method
public Integer getActionBarHideOffset ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( android.support.v7.widget.ActionBarContainer ) v0 ).getTranslationY ( ); // invoke-virtual {v0}, Landroid/support/v7/widget/ActionBarContainer;->getTranslationY()F
/* float-to-int v0, v0 */
/* neg-int v0, v0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer getNestedScrollAxes ( ) {
/* .locals 1 */
v0 = this.a;
/* iget v0, v0, Lei;->a:I */
} // .end method
public java.lang.CharSequence getTitle ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->c()V */
v0 = this.a;
} // .end method
protected void onConfigurationChanged ( android.content.res.Configuration p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V */
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->getContext()Landroid/content/Context;
/* invoke-direct {p0, p1}, Landroid/support/v7/widget/ActionBarOverlayLayout;->a(Landroid/content/Context;)V */
em .b ( p0 );
return;
} // .end method
protected void onDetachedFromWindow ( ) {
/* .locals 0 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V */
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->a()V
return;
} // .end method
protected void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 4 */
p1 = (( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->getChildCount()I
p2 = (( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->getPaddingLeft()I
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->getPaddingRight()I
p3 = (( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->getPaddingTop()I
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->getPaddingBottom()I
int p4 = 0; // const/4 p4, 0x0
} // :goto_0
/* if-ge p4, p1, :cond_1 */
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).getChildAt ( p4 ); // invoke-virtual {p0, p4}, Landroid/support/v7/widget/ActionBarOverlayLayout;->getChildAt(I)Landroid/view/View;
v0 = (( android.view.View ) p5 ).getVisibility ( ); // invoke-virtual {p5}, Landroid/view/View;->getVisibility()I
/* const/16 v1, 0x8 */
/* if-eq v0, v1, :cond_0 */
(( android.view.View ) p5 ).getLayoutParams ( ); // invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams; */
v1 = (( android.view.View ) p5 ).getMeasuredWidth ( ); // invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I
v2 = (( android.view.View ) p5 ).getMeasuredHeight ( ); // invoke-virtual {p5}, Landroid/view/View;->getMeasuredHeight()I
/* iget v3, v0, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams;->leftMargin:I */
/* add-int/2addr v3, p2 */
/* iget v0, v0, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v0, p3 */
/* add-int/2addr v1, v3 */
/* add-int/2addr v2, v0 */
(( android.view.View ) p5 ).layout ( v3, v0, v1, v2 ); // invoke-virtual {p5, v3, v0, v1, v2}, Landroid/view/View;->layout(IIII)V
} // :cond_0
/* add-int/lit8 p4, p4, 0x1 */
} // :cond_1
return;
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 11 */
/* invoke-direct {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->c()V */
v1 = this.a;
int v3 = 0; // const/4 v3, 0x0
int v5 = 0; // const/4 v5, 0x0
/* move-object v0, p0 */
/* move v2, p1 */
/* move v4, p2 */
/* invoke-virtual/range {v0 ..v5}, Landroid/support/v7/widget/ActionBarOverlayLayout;->measureChildWithMargins(Landroid/view/View;IIII)V */
v0 = this.a;
(( android.support.v7.widget.ActionBarContainer ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/support/v7/widget/ActionBarContainer;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams; */
v1 = this.a;
v1 = (( android.support.v7.widget.ActionBarContainer ) v1 ).getMeasuredWidth ( ); // invoke-virtual {v1}, Landroid/support/v7/widget/ActionBarContainer;->getMeasuredWidth()I
/* iget v2, v0, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams;->leftMargin:I */
/* add-int/2addr v1, v2 */
/* iget v2, v0, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams;->rightMargin:I */
/* add-int/2addr v1, v2 */
int v2 = 0; // const/4 v2, 0x0
v1 = java.lang.Math .max ( v2,v1 );
v3 = this.a;
v3 = (( android.support.v7.widget.ActionBarContainer ) v3 ).getMeasuredHeight ( ); // invoke-virtual {v3}, Landroid/support/v7/widget/ActionBarContainer;->getMeasuredHeight()I
/* iget v4, v0, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v3, v4 */
/* iget v0, v0, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v3, v0 */
v0 = java.lang.Math .max ( v2,v3 );
v3 = this.a;
v3 = (( android.support.v7.widget.ActionBarContainer ) v3 ).getMeasuredState ( ); // invoke-virtual {v3}, Landroid/support/v7/widget/ActionBarContainer;->getMeasuredState()I
v3 = android.view.View .combineMeasuredStates ( v2,v3 );
v4 = em .d ( p0 );
/* and-int/lit16 v4, v4, 0x100 */
int v5 = 1; // const/4 v5, 0x1
if ( v4 != null) { // if-eqz v4, :cond_0
int v4 = 1; // const/4 v4, 0x1
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
if ( v4 != null) { // if-eqz v4, :cond_1
/* iget v6, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->a:I */
/* iget-boolean v7, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->d:Z */
if ( v7 != null) { // if-eqz v7, :cond_3
v7 = this.a;
(( android.support.v7.widget.ActionBarContainer ) v7 ).getTabContainer ( ); // invoke-virtual {v7}, Landroid/support/v7/widget/ActionBarContainer;->getTabContainer()Landroid/view/View;
if ( v7 != null) { // if-eqz v7, :cond_3
/* iget v7, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->a:I */
/* add-int/2addr v6, v7 */
} // :cond_1
v6 = this.a;
v6 = (( android.support.v7.widget.ActionBarContainer ) v6 ).getVisibility ( ); // invoke-virtual {v6}, Landroid/support/v7/widget/ActionBarContainer;->getVisibility()I
/* const/16 v7, 0x8 */
/* if-eq v6, v7, :cond_2 */
v6 = this.a;
v6 = (( android.support.v7.widget.ActionBarContainer ) v6 ).getMeasuredHeight ( ); // invoke-virtual {v6}, Landroid/support/v7/widget/ActionBarContainer;->getMeasuredHeight()I
} // :cond_2
int v6 = 0; // const/4 v6, 0x0
} // :cond_3
} // :goto_1
v7 = this.c;
v8 = this.a;
(( android.graphics.Rect ) v7 ).set ( v8 ); // invoke-virtual {v7, v8}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
v7 = this.f;
v8 = this.d;
(( android.graphics.Rect ) v7 ).set ( v8 ); // invoke-virtual {v7, v8}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
/* iget-boolean v7, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->a:Z */
/* if-nez v7, :cond_4 */
/* if-nez v4, :cond_4 */
v4 = this.c;
/* iget v7, v4, Landroid/graphics/Rect;->top:I */
/* add-int/2addr v7, v6 */
/* iput v7, v4, Landroid/graphics/Rect;->top:I */
v4 = this.c;
} // :cond_4
v4 = this.f;
/* iget v7, v4, Landroid/graphics/Rect;->top:I */
/* add-int/2addr v7, v6 */
/* iput v7, v4, Landroid/graphics/Rect;->top:I */
v4 = this.f;
} // :goto_2
/* iget v6, v4, Landroid/graphics/Rect;->bottom:I */
/* add-int/2addr v6, v2 */
/* iput v6, v4, Landroid/graphics/Rect;->bottom:I */
v2 = this.a;
v4 = this.c;
android.support.v7.widget.ActionBarOverlayLayout .a ( v2,v4,v5 );
v2 = this.g;
v4 = this.f;
v2 = (( android.graphics.Rect ) v2 ).equals ( v4 ); // invoke-virtual {v2, v4}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_5 */
v2 = this.g;
v4 = this.f;
(( android.graphics.Rect ) v2 ).set ( v4 ); // invoke-virtual {v2, v4}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
v2 = this.a;
v4 = this.f;
(( android.support.v7.widget.ContentFrameLayout ) v2 ).a ( v4 ); // invoke-virtual {v2, v4}, Landroid/support/v7/widget/ContentFrameLayout;->a(Landroid/graphics/Rect;)V
} // :cond_5
v6 = this.a;
int v8 = 0; // const/4 v8, 0x0
int v10 = 0; // const/4 v10, 0x0
/* move-object v5, p0 */
/* move v7, p1 */
/* move v9, p2 */
/* invoke-virtual/range {v5 ..v10}, Landroid/support/v7/widget/ActionBarOverlayLayout;->measureChildWithMargins(Landroid/view/View;IIII)V */
v2 = this.a;
(( android.support.v7.widget.ContentFrameLayout ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/support/v7/widget/ContentFrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams; */
v4 = this.a;
v4 = (( android.support.v7.widget.ContentFrameLayout ) v4 ).getMeasuredWidth ( ); // invoke-virtual {v4}, Landroid/support/v7/widget/ContentFrameLayout;->getMeasuredWidth()I
/* iget v5, v2, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams;->leftMargin:I */
/* add-int/2addr v4, v5 */
/* iget v5, v2, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams;->rightMargin:I */
/* add-int/2addr v4, v5 */
v1 = java.lang.Math .max ( v1,v4 );
v4 = this.a;
v4 = (( android.support.v7.widget.ContentFrameLayout ) v4 ).getMeasuredHeight ( ); // invoke-virtual {v4}, Landroid/support/v7/widget/ContentFrameLayout;->getMeasuredHeight()I
/* iget v5, v2, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v4, v5 */
/* iget v2, v2, Landroid/support/v7/widget/ActionBarOverlayLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v4, v2 */
v0 = java.lang.Math .max ( v0,v4 );
v2 = this.a;
v2 = (( android.support.v7.widget.ContentFrameLayout ) v2 ).getMeasuredState ( ); // invoke-virtual {v2}, Landroid/support/v7/widget/ContentFrameLayout;->getMeasuredState()I
v2 = android.view.View .combineMeasuredStates ( v3,v2 );
v3 = (( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->getPaddingLeft()I
v4 = (( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->getPaddingRight()I
/* add-int/2addr v3, v4 */
/* add-int/2addr v1, v3 */
v3 = (( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->getPaddingTop()I
v4 = (( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->getPaddingBottom()I
/* add-int/2addr v3, v4 */
/* add-int/2addr v0, v3 */
v3 = (( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).getSuggestedMinimumHeight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->getSuggestedMinimumHeight()I
v0 = java.lang.Math .max ( v0,v3 );
v3 = (( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).getSuggestedMinimumWidth ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->getSuggestedMinimumWidth()I
v1 = java.lang.Math .max ( v1,v3 );
p1 = android.view.View .resolveSizeAndState ( v1,p1,v2 );
/* shl-int/lit8 v1, v2, 0x10 */
p2 = android.view.View .resolveSizeAndState ( v0,p2,v1 );
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).setMeasuredDimension ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/support/v7/widget/ActionBarOverlayLayout;->setMeasuredDimension(II)V
return;
} // .end method
public Boolean onNestedFling ( android.view.View p0, Float p1, Float p2, Boolean p3 ) {
/* .locals 9 */
/* iget-boolean p1, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->e:Z */
int p2 = 0; // const/4 p2, 0x0
if ( p1 != null) { // if-eqz p1, :cond_3
/* if-nez p4, :cond_0 */
} // :cond_0
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
/* float-to-int v4, p3 */
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* const/high16 v7, -0x80000000 */
/* const v8, 0x7fffffff */
/* invoke-virtual/range {v0 ..v8}, Landroid/widget/OverScroller;->fling(IIIIIIII)V */
p1 = this.a;
p1 = (( android.widget.OverScroller ) p1 ).getFinalY ( ); // invoke-virtual {p1}, Landroid/widget/OverScroller;->getFinalY()I
p3 = this.a;
p3 = (( android.support.v7.widget.ActionBarContainer ) p3 ).getHeight ( ); // invoke-virtual {p3}, Landroid/support/v7/widget/ActionBarContainer;->getHeight()I
int p4 = 1; // const/4 p4, 0x1
/* if-le p1, p3, :cond_1 */
int p2 = 1; // const/4 p2, 0x1
} // :cond_1
if ( p2 != null) { // if-eqz p2, :cond_2
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->a()V
p1 = this.b;
} // :cond_2
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->a()V
p1 = this.a;
} // :goto_0
/* iput-boolean p4, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->b:Z */
} // :cond_3
} // :goto_1
} // .end method
public Boolean onNestedPreFling ( android.view.View p0, Float p1, Float p2 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void onNestedPreScroll ( android.view.View p0, Integer p1, Integer p2, Integer[] p3 ) {
/* .locals 0 */
return;
} // .end method
public void onNestedScroll ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
/* iget p1, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->c:I */
/* add-int/2addr p1, p3 */
/* iput p1, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->c:I */
/* iget p1, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->c:I */
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).setActionBarHideOffset ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/ActionBarOverlayLayout;->setActionBarHideOffset(I)V
return;
} // .end method
public void onNestedScrollAccepted ( android.view.View p0, android.view.View p1, Integer p2 ) {
/* .locals 0 */
p1 = this.a;
/* iput p3, p1, Lei;->a:I */
p1 = (( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).getActionBarHideOffset ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->getActionBarHideOffset()I
/* iput p1, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->c:I */
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->a()V
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
return;
} // .end method
public Boolean onStartNestedScroll ( android.view.View p0, android.view.View p1, Integer p2 ) {
/* .locals 0 */
/* and-int/lit8 p1, p3, 0x2 */
if ( p1 != null) { // if-eqz p1, :cond_1
p1 = this.a;
p1 = (( android.support.v7.widget.ActionBarContainer ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/support/v7/widget/ActionBarContainer;->getVisibility()I
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
/* iget-boolean p1, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->e:Z */
} // :cond_1
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void onStopNestedScroll ( android.view.View p0 ) {
/* .locals 3 */
/* iget-boolean p1, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->e:Z */
if ( p1 != null) { // if-eqz p1, :cond_1
/* iget-boolean p1, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->b:Z */
/* if-nez p1, :cond_1 */
/* iget p1, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->c:I */
v0 = this.a;
v0 = (( android.support.v7.widget.ActionBarContainer ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/support/v7/widget/ActionBarContainer;->getHeight()I
/* const-wide/16 v1, 0x258 */
/* if-gt p1, v0, :cond_0 */
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->a()V
p1 = this.a;
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).postDelayed ( p1, v1, v2 ); // invoke-virtual {p0, p1, v1, v2}, Landroid/support/v7/widget/ActionBarOverlayLayout;->postDelayed(Ljava/lang/Runnable;J)Z
return;
} // :cond_0
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->a()V
p1 = this.b;
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).postDelayed ( p1, v1, v2 ); // invoke-virtual {p0, p1, v1, v2}, Landroid/support/v7/widget/ActionBarOverlayLayout;->postDelayed(Ljava/lang/Runnable;J)Z
} // :cond_1
return;
} // .end method
public void onWindowSystemUiVisibilityChanged ( Integer p0 ) {
/* .locals 4 */
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_0 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onWindowSystemUiVisibilityChanged(I)V */
} // :cond_0
/* invoke-direct {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->c()V */
/* iget v0, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->d:I */
/* xor-int/2addr v0, p1 */
/* iput p1, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->d:I */
/* and-int/lit8 v1, p1, 0x4 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
/* if-nez v1, :cond_1 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* and-int/lit16 p1, p1, 0x100 */
if ( p1 != null) { // if-eqz p1, :cond_2
int v2 = 1; // const/4 v2, 0x1
} // :cond_2
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_5
/* xor-int/lit8 v3, v2, 0x1 */
/* if-nez v1, :cond_4 */
/* if-nez v2, :cond_3 */
} // :cond_3
p1 = this.a;
} // :cond_4
} // :goto_1
p1 = this.a;
} // :cond_5
} // :goto_2
/* and-int/lit16 p1, v0, 0x100 */
if ( p1 != null) { // if-eqz p1, :cond_6
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_6
em .b ( p0 );
} // :cond_6
return;
} // .end method
protected void onWindowVisibilityChanged ( Integer p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onWindowVisibilityChanged(I)V */
/* iput p1, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->b:I */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
return;
} // .end method
public void setActionBarHideOffset ( Integer p0 ) {
/* .locals 1 */
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->a()V
v0 = this.a;
v0 = (( android.support.v7.widget.ActionBarContainer ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/support/v7/widget/ActionBarContainer;->getHeight()I
p1 = java.lang.Math .min ( p1,v0 );
int v0 = 0; // const/4 v0, 0x0
p1 = java.lang.Math .max ( v0,p1 );
v0 = this.a;
/* neg-int p1, p1 */
/* int-to-float p1, p1 */
(( android.support.v7.widget.ActionBarContainer ) v0 ).setTranslationY ( p1 ); // invoke-virtual {v0, p1}, Landroid/support/v7/widget/ActionBarContainer;->setTranslationY(F)V
return;
} // .end method
public void setActionBarVisibilityCallback ( android.support.v7.widget.ActionBarOverlayLayout$a p0 ) {
/* .locals 1 */
this.a = p1;
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).getWindowToken ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->getWindowToken()Landroid/os/IBinder;
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = this.a;
/* iget v0, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->b:I */
/* iget p1, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->d:I */
if ( p1 != null) { // if-eqz p1, :cond_0
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).onWindowSystemUiVisibilityChanged ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/ActionBarOverlayLayout;->onWindowSystemUiVisibilityChanged(I)V
em .b ( p0 );
} // :cond_0
return;
} // .end method
public void setHasNonEmbeddedTabs ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->d:Z */
return;
} // .end method
public void setHideOnContentScrollEnabled ( Boolean p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->e:Z */
/* if-eq p1, v0, :cond_0 */
/* iput-boolean p1, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->e:Z */
/* if-nez p1, :cond_0 */
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->a()V
int p1 = 0; // const/4 p1, 0x0
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).setActionBarHideOffset ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/ActionBarOverlayLayout;->setActionBarHideOffset(I)V
} // :cond_0
return;
} // .end method
public void setIcon ( Integer p0 ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->c()V */
v0 = this.a;
return;
} // .end method
public void setIcon ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->c()V */
v0 = this.a;
return;
} // .end method
public void setLogo ( Integer p0 ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->c()V */
v0 = this.a;
return;
} // .end method
public void setMenu ( android.view.Menu p0, hg$a p1 ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->c()V */
v0 = this.a;
return;
} // .end method
public void setMenuPrepared ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->c()V */
v0 = this.a;
return;
} // .end method
public void setOverlayMode ( Boolean p0 ) {
/* .locals 1 */
/* iput-boolean p1, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->a:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
(( android.support.v7.widget.ActionBarOverlayLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->getContext()Landroid/content/Context;
(( android.content.Context ) p1 ).getApplicationInfo ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
/* iget p1, p1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I */
/* const/16 v0, 0x13 */
/* if-ge p1, v0, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
/* iput-boolean p1, p0, Landroid/support/v7/widget/ActionBarOverlayLayout;->c:Z */
return;
} // .end method
public void setShowingForActionMode ( Boolean p0 ) {
/* .locals 0 */
return;
} // .end method
public void setUiOptions ( Integer p0 ) {
/* .locals 0 */
return;
} // .end method
public void setWindowCallback ( android.view.Window$Callback p0 ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->c()V */
v0 = this.a;
return;
} // .end method
public void setWindowTitle ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->c()V */
v0 = this.a;
return;
} // .end method
public Boolean shouldDelayChildPressedState ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
