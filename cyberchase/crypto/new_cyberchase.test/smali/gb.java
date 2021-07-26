public class gb extends android.support.v7.app.ActionBar implements android.support.v7.widget.ActionBarOverlayLayout$a {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lgb$a; */
	 /* } */
} // .end annotation
/* # static fields */
private static final android.view.animation.Interpolator a;
private static final android.view.animation.Interpolator b;
static final Boolean e; //synthetic
/* # instance fields */
private Integer a;
private android.app.Activity a;
private android.app.Dialog a;
android.content.Context a;
android.support.v7.widget.ActionBarContainer a;
android.support.v7.widget.ActionBarContextView a;
android.support.v7.widget.ActionBarOverlayLayout a;
android.support.v7.widget.ScrollingTabContainerView a;
android.view.View a;
final eq a;
final es a;
gb$a a;
gk$a a;
gk a;
gq a;
ic a;
private java.util.ArrayList a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
Boolean a;
private Integer b;
private android.content.Context b;
final eq b;
private java.util.ArrayList b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
Boolean b;
Boolean c;
Boolean d;
private Boolean f;
private Boolean g;
private Boolean h;
private Boolean i;
private Boolean j;
private Boolean k;
/* # direct methods */
static gb ( ) {
/* .locals 1 */
/* const-class v0, Lgb; */
v0 = (( java.lang.Class ) v0 ).desiredAssertionStatus ( ); // invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z
/* xor-int/lit8 v0, v0, 0x1 */
gb.e = (v0!= 0);
/* new-instance v0, Landroid/view/animation/AccelerateInterpolator; */
/* invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V */
/* new-instance v0, Landroid/view/animation/DecelerateInterpolator; */
/* invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V */
return;
} // .end method
public gb ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/app/ActionBar;-><init>()V */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.a = v0;
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lgb;->a:I */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.b = v0;
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lgb;->b:I */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lgb;->a:Z */
/* iput-boolean v0, p0, Lgb;->j:Z */
/* new-instance v0, Lgb$1; */
/* invoke-direct {v0, p0}, Lgb$1;-><init>(Lgb;)V */
this.a = v0;
/* new-instance v0, Lgb$2; */
/* invoke-direct {v0, p0}, Lgb$2;-><init>(Lgb;)V */
this.b = v0;
/* new-instance v0, Lgb$3; */
/* invoke-direct {v0, p0}, Lgb$3;-><init>(Lgb;)V */
this.a = v0;
this.a = p1;
(( android.app.Activity ) p1 ).getWindow ( ); // invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
(( android.view.Window ) p1 ).getDecorView ( ); // invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;
/* invoke-direct {p0, p1}, Lgb;->a(Landroid/view/View;)V */
/* if-nez p2, :cond_0 */
/* const p2, 0x1020002 */
(( android.view.View ) p1 ).findViewById ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
this.a = p1;
} // :cond_0
return;
} // .end method
public gb ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/app/ActionBar;-><init>()V */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.a = v0;
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lgb;->a:I */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.b = v0;
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lgb;->b:I */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lgb;->a:Z */
/* iput-boolean v0, p0, Lgb;->j:Z */
/* new-instance v0, Lgb$1; */
/* invoke-direct {v0, p0}, Lgb$1;-><init>(Lgb;)V */
this.a = v0;
/* new-instance v0, Lgb$2; */
/* invoke-direct {v0, p0}, Lgb$2;-><init>(Lgb;)V */
this.b = v0;
/* new-instance v0, Lgb$3; */
/* invoke-direct {v0, p0}, Lgb$3;-><init>(Lgb;)V */
this.a = v0;
this.a = p1;
(( android.app.Dialog ) p1 ).getWindow ( ); // invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;
(( android.view.Window ) p1 ).getDecorView ( ); // invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;
/* invoke-direct {p0, p1}, Lgb;->a(Landroid/view/View;)V */
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
if ( p0 != null) { // if-eqz p0, :cond_2
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) p0 ).getSimpleName ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
} // :cond_2
final String p0 = "null"; // const-string p0, "null"
} // :goto_0
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
private void a ( android.view.View p0 ) {
/* .locals 4 */
(( android.view.View ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/support/v7/widget/ActionBarOverlayLayout; */
this.a = v0;
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.support.v7.widget.ActionBarOverlayLayout ) v0 ).setActionBarVisibilityCallback ( p0 ); // invoke-virtual {v0, p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->setActionBarVisibilityCallback(Landroid/support/v7/widget/ActionBarOverlayLayout$a;)V
} // :cond_0
(( android.view.View ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
gb .a ( v0 );
this.a = v0;
(( android.view.View ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/support/v7/widget/ActionBarContextView; */
this.a = v0;
(( android.view.View ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast p1, Landroid/support/v7/widget/ActionBarContainer; */
this.a = p1;
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_5
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_5
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_5
this.a = p1;
p1 = p1 = this.a;
/* and-int/lit8 p1, p1, 0x4 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
if ( p1 != null) { // if-eqz p1, :cond_1
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
if ( p1 != null) { // if-eqz p1, :cond_2
/* iput-boolean v0, p0, Lgb;->f:Z */
} // :cond_2
p1 = this.a;
gj .a ( p1 );
(( gj ) p1 ).b ( ); // invoke-virtual {p1}, Lgj;->b()Z
p1 = (( gj ) p1 ).a ( ); // invoke-virtual {p1}, Lgj;->a()Z
/* invoke-direct {p0, p1}, Lgb;->f(Z)V */
p1 = this.a;
int v0 = 0; // const/4 v0, 0x0
v2 = gc$j.ActionBar;
(( android.content.Context ) p1 ).obtainStyledAttributes ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
v0 = (( android.content.res.TypedArray ) p1 ).getBoolean ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
if ( v0 != null) { // if-eqz v0, :cond_3
(( gb ) p0 ).a ( ); // invoke-virtual {p0}, Lgb;->a()V
} // :cond_3
v0 = (( android.content.res.TypedArray ) p1 ).getDimensionPixelSize ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
if ( v0 != null) { // if-eqz v0, :cond_4
/* int-to-float v0, v0 */
(( gb ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lgb;->a(F)V
} // :cond_4
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
return;
} // :cond_5
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v1 ).getSimpleName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " can only be used with a compatible window decor layout"; // const-string v1, " can only be used with a compatible window decor layout"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
static Boolean a ( Boolean p0, Boolean p1, Boolean p2 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
if ( p2 != null) { // if-eqz p2, :cond_0
} // :cond_0
/* if-nez p0, :cond_2 */
if ( p1 != null) { // if-eqz p1, :cond_1
} // :cond_1
} // :cond_2
} // :goto_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
private Integer b ( ) {
/* .locals 1 */
v0 = v0 = this.a;
} // .end method
private void f ( ) {
/* .locals 2 */
/* iget-boolean v0, p0, Lgb;->i:Z */
/* if-nez v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lgb;->i:Z */
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_0
(( android.support.v7.widget.ActionBarOverlayLayout ) v1 ).setShowingForActionMode ( v0 ); // invoke-virtual {v1, v0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0}, Lgb;->g(Z)V */
} // :cond_1
return;
} // .end method
private void f ( Boolean p0 ) {
/* .locals 4 */
/* iput-boolean p1, p0, Lgb;->h:Z */
/* iget-boolean p1, p0, Lgb;->h:Z */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
p1 = this.a;
p1 = this.a;
v0 = this.a;
(( android.support.v7.widget.ActionBarContainer ) p1 ).setTabContainer ( v0 ); // invoke-virtual {p1, v0}, Landroid/support/v7/widget/ActionBarContainer;->setTabContainer(Landroid/support/v7/widget/ScrollingTabContainerView;)V
} // :cond_0
p1 = this.a;
(( android.support.v7.widget.ActionBarContainer ) p1 ).setTabContainer ( v0 ); // invoke-virtual {p1, v0}, Landroid/support/v7/widget/ActionBarContainer;->setTabContainer(Landroid/support/v7/widget/ScrollingTabContainerView;)V
p1 = this.a;
v0 = this.a;
} // :goto_0
p1 = /* invoke-direct {p0}, Lgb;->b()I */
int v0 = 2; // const/4 v0, 0x2
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* if-ne p1, v0, :cond_1 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :goto_1
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_3
if ( p1 != null) { // if-eqz p1, :cond_2
(( android.support.v7.widget.ScrollingTabContainerView ) v0 ).setVisibility ( v2 ); // invoke-virtual {v0, v2}, Landroid/support/v7/widget/ScrollingTabContainerView;->setVisibility(I)V
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_3
em .b ( v0 );
} // :cond_2
/* const/16 v3, 0x8 */
(( android.support.v7.widget.ScrollingTabContainerView ) v0 ).setVisibility ( v3 ); // invoke-virtual {v0, v3}, Landroid/support/v7/widget/ScrollingTabContainerView;->setVisibility(I)V
} // :cond_3
} // :goto_2
v0 = this.a;
/* iget-boolean v3, p0, Lgb;->h:Z */
/* if-nez v3, :cond_4 */
if ( p1 != null) { // if-eqz p1, :cond_4
int v3 = 1; // const/4 v3, 0x1
} // :cond_4
int v3 = 0; // const/4 v3, 0x0
} // :goto_3
v0 = this.a;
/* iget-boolean v3, p0, Lgb;->h:Z */
/* if-nez v3, :cond_5 */
if ( p1 != null) { // if-eqz p1, :cond_5
} // :cond_5
int v1 = 0; // const/4 v1, 0x0
} // :goto_4
(( android.support.v7.widget.ActionBarOverlayLayout ) v0 ).setHasNonEmbeddedTabs ( v1 ); // invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionBarOverlayLayout;->setHasNonEmbeddedTabs(Z)V
return;
} // .end method
private void g ( ) {
/* .locals 2 */
/* iget-boolean v0, p0, Lgb;->i:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lgb;->i:Z */
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_0
(( android.support.v7.widget.ActionBarOverlayLayout ) v1 ).setShowingForActionMode ( v0 ); // invoke-virtual {v1, v0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V
} // :cond_0
/* invoke-direct {p0, v0}, Lgb;->g(Z)V */
} // :cond_1
return;
} // .end method
private void g ( Boolean p0 ) {
/* .locals 3 */
/* iget-boolean v0, p0, Lgb;->b:Z */
/* iget-boolean v1, p0, Lgb;->c:Z */
/* iget-boolean v2, p0, Lgb;->i:Z */
v0 = gb .a ( v0,v1,v2 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lgb;->j:Z */
/* if-nez v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lgb;->j:Z */
/* invoke-direct {p0, p1}, Lgb;->h(Z)V */
return;
} // :cond_0
/* iget-boolean v0, p0, Lgb;->j:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lgb;->j:Z */
/* invoke-direct {p0, p1}, Lgb;->i(Z)V */
} // :cond_1
return;
} // .end method
private void h ( Boolean p0 ) {
/* .locals 4 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( gq ) v0 ).b ( ); // invoke-virtual {v0}, Lgq;->b()V
} // :cond_0
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( android.support.v7.widget.ActionBarContainer ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionBarContainer;->setVisibility(I)V
/* iget v0, p0, Lgb;->b:I */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_4 */
/* iget-boolean v0, p0, Lgb;->k:Z */
/* if-nez v0, :cond_1 */
if ( p1 != null) { // if-eqz p1, :cond_4
} // :cond_1
v0 = this.a;
(( android.support.v7.widget.ActionBarContainer ) v0 ).setTranslationY ( v1 ); // invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionBarContainer;->setTranslationY(F)V
v0 = this.a;
v0 = (( android.support.v7.widget.ActionBarContainer ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/support/v7/widget/ActionBarContainer;->getHeight()I
/* neg-int v0, v0 */
/* int-to-float v0, v0 */
if ( p1 != null) { // if-eqz p1, :cond_2
int p1 = 2; // const/4 p1, 0x2
/* new-array p1, p1, [I */
/* fill-array-data p1, :array_0 */
v2 = this.a;
(( android.support.v7.widget.ActionBarContainer ) v2 ).getLocationInWindow ( p1 ); // invoke-virtual {v2, p1}, Landroid/support/v7/widget/ActionBarContainer;->getLocationInWindow([I)V
int v2 = 1; // const/4 v2, 0x1
/* aget p1, p1, v2 */
/* int-to-float p1, p1 */
/* sub-float/2addr v0, p1 */
} // :cond_2
p1 = this.a;
(( android.support.v7.widget.ActionBarContainer ) p1 ).setTranslationY ( v0 ); // invoke-virtual {p1, v0}, Landroid/support/v7/widget/ActionBarContainer;->setTranslationY(F)V
/* new-instance p1, Lgq; */
/* invoke-direct {p1}, Lgq;-><init>()V */
v2 = this.a;
em .a ( v2 );
(( ep ) v2 ).b ( v1 ); // invoke-virtual {v2, v1}, Lep;->b(F)Lep;
v3 = this.a;
(( ep ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lep;->a(Les;)Lep;
(( gq ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Lgq;->a(Lep;)Lgq;
/* iget-boolean v2, p0, Lgb;->a:Z */
if ( v2 != null) { // if-eqz v2, :cond_3
v2 = this.a;
if ( v2 != null) { // if-eqz v2, :cond_3
(( android.view.View ) v2 ).setTranslationY ( v0 ); // invoke-virtual {v2, v0}, Landroid/view/View;->setTranslationY(F)V
v0 = this.a;
em .a ( v0 );
(( ep ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lep;->b(F)Lep;
(( gq ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lgq;->a(Lep;)Lgq;
} // :cond_3
v0 = gb.b;
(( gq ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lgq;->a(Landroid/view/animation/Interpolator;)Lgq;
(( gq ) p1 ).a ( ); // invoke-virtual {p1}, Lgq;->a()Lgq;
v0 = this.b;
(( gq ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lgq;->a(Leq;)Lgq;
this.a = p1;
(( gq ) p1 ).a ( ); // invoke-virtual {p1}, Lgq;->a()V
} // :cond_4
p1 = this.a;
/* const/high16 v0, 0x3f800000 # 1.0f */
(( android.support.v7.widget.ActionBarContainer ) p1 ).setAlpha ( v0 ); // invoke-virtual {p1, v0}, Landroid/support/v7/widget/ActionBarContainer;->setAlpha(F)V
p1 = this.a;
(( android.support.v7.widget.ActionBarContainer ) p1 ).setTranslationY ( v1 ); // invoke-virtual {p1, v1}, Landroid/support/v7/widget/ActionBarContainer;->setTranslationY(F)V
/* iget-boolean p1, p0, Lgb;->a:Z */
if ( p1 != null) { // if-eqz p1, :cond_5
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_5
(( android.view.View ) p1 ).setTranslationY ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/View;->setTranslationY(F)V
} // :cond_5
p1 = this.b;
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_6
em .b ( p1 );
} // :cond_6
return;
/* nop */
/* :array_0 */
/* .array-data 4 */
/* 0x0 */
/* 0x0 */
} // .end array-data
} // .end method
private void i ( Boolean p0 ) {
/* .locals 4 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( gq ) v0 ).b ( ); // invoke-virtual {v0}, Lgq;->b()V
} // :cond_0
/* iget v0, p0, Lgb;->b:I */
/* if-nez v0, :cond_4 */
/* iget-boolean v0, p0, Lgb;->k:Z */
/* if-nez v0, :cond_1 */
if ( p1 != null) { // if-eqz p1, :cond_4
} // :cond_1
v0 = this.a;
/* const/high16 v1, 0x3f800000 # 1.0f */
(( android.support.v7.widget.ActionBarContainer ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionBarContainer;->setAlpha(F)V
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
(( android.support.v7.widget.ActionBarContainer ) v0 ).setTransitioning ( v1 ); // invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionBarContainer;->setTransitioning(Z)V
/* new-instance v0, Lgq; */
/* invoke-direct {v0}, Lgq;-><init>()V */
v2 = this.a;
v2 = (( android.support.v7.widget.ActionBarContainer ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/support/v7/widget/ActionBarContainer;->getHeight()I
/* neg-int v2, v2 */
/* int-to-float v2, v2 */
if ( p1 != null) { // if-eqz p1, :cond_2
int p1 = 2; // const/4 p1, 0x2
/* new-array p1, p1, [I */
/* fill-array-data p1, :array_0 */
v3 = this.a;
(( android.support.v7.widget.ActionBarContainer ) v3 ).getLocationInWindow ( p1 ); // invoke-virtual {v3, p1}, Landroid/support/v7/widget/ActionBarContainer;->getLocationInWindow([I)V
/* aget p1, p1, v1 */
/* int-to-float p1, p1 */
/* sub-float/2addr v2, p1 */
} // :cond_2
p1 = this.a;
em .a ( p1 );
(( ep ) p1 ).b ( v2 ); // invoke-virtual {p1, v2}, Lep;->b(F)Lep;
v1 = this.a;
(( ep ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lep;->a(Les;)Lep;
(( gq ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lgq;->a(Lep;)Lgq;
/* iget-boolean p1, p0, Lgb;->a:Z */
if ( p1 != null) { // if-eqz p1, :cond_3
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_3
em .a ( p1 );
(( ep ) p1 ).b ( v2 ); // invoke-virtual {p1, v2}, Lep;->b(F)Lep;
(( gq ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lgq;->a(Lep;)Lgq;
} // :cond_3
p1 = gb.a;
(( gq ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lgq;->a(Landroid/view/animation/Interpolator;)Lgq;
(( gq ) v0 ).a ( ); // invoke-virtual {v0}, Lgq;->a()Lgq;
p1 = this.a;
(( gq ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lgq;->a(Leq;)Lgq;
this.a = v0;
(( gq ) v0 ).a ( ); // invoke-virtual {v0}, Lgq;->a()V
return;
} // :cond_4
p1 = this.a;
int v0 = 0; // const/4 v0, 0x0
return;
/* nop */
/* :array_0 */
/* .array-data 4 */
/* 0x0 */
/* 0x0 */
} // .end array-data
} // .end method
/* # virtual methods */
public final Integer a ( ) {
/* .locals 1 */
v0 = v0 = this.a;
} // .end method
public final android.content.Context a ( ) {
/* .locals 4 */
v0 = this.b;
/* if-nez v0, :cond_1 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
v1 = this.a;
(( android.content.Context ) v1 ).getTheme ( ); // invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
int v3 = 1; // const/4 v3, 0x1
(( android.content.res.Resources$Theme ) v1 ).resolveAttribute ( v2, v0, v3 ); // invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
/* iget v0, v0, Landroid/util/TypedValue;->resourceId:I */
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v1, Landroid/view/ContextThemeWrapper; */
v2 = this.a;
/* invoke-direct {v1, v2, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V */
this.b = v1;
} // :cond_0
v0 = this.a;
this.b = v0;
} // :cond_1
} // :goto_0
v0 = this.b;
} // .end method
public final gk a ( gk$a p0 ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( gb$a ) v0 ).a ( ); // invoke-virtual {v0}, Lgb$a;->a()V
} // :cond_0
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( android.support.v7.widget.ActionBarOverlayLayout ) v0 ).setHideOnContentScrollEnabled ( v1 ); // invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V
v0 = this.a;
(( android.support.v7.widget.ActionBarContextView ) v0 ).b ( ); // invoke-virtual {v0}, Landroid/support/v7/widget/ActionBarContextView;->b()V
/* new-instance v0, Lgb$a; */
v1 = this.a;
(( android.support.v7.widget.ActionBarContextView ) v1 ).getContext ( ); // invoke-virtual {v1}, Landroid/support/v7/widget/ActionBarContextView;->getContext()Landroid/content/Context;
/* invoke-direct {v0, p0, v1, p1}, Lgb$a;-><init>(Lgb;Landroid/content/Context;Lgk$a;)V */
p1 = (( gb$a ) v0 ).a ( ); // invoke-virtual {v0}, Lgb$a;->a()Z
if ( p1 != null) { // if-eqz p1, :cond_1
this.a = v0;
(( gb$a ) v0 ).b ( ); // invoke-virtual {v0}, Lgb$a;->b()V
p1 = this.a;
(( android.support.v7.widget.ActionBarContextView ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Landroid/support/v7/widget/ActionBarContextView;->a(Lgk;)V
int p1 = 1; // const/4 p1, 0x1
(( gb ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Lgb;->e(Z)V
p1 = this.a;
/* const/16 v1, 0x20 */
(( android.support.v7.widget.ActionBarContextView ) p1 ).sendAccessibilityEvent ( v1 ); // invoke-virtual {p1, v1}, Landroid/support/v7/widget/ActionBarContextView;->sendAccessibilityEvent(I)V
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final void a ( ) {
/* .locals 2 */
v0 = this.a;
/* iget-boolean v0, v0, Landroid/support/v7/widget/ActionBarOverlayLayout;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lgb;->d:Z */
v1 = this.a;
(( android.support.v7.widget.ActionBarOverlayLayout ) v1 ).setHideOnContentScrollEnabled ( v0 ); // invoke-virtual {v1, v0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V
return;
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"; // const-string v1, "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public final void a ( Float p0 ) {
/* .locals 1 */
v0 = this.a;
em .a ( v0,p1 );
return;
} // .end method
public final void a ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Lgb;->b:I */
return;
} // .end method
public final void a ( android.content.res.Configuration p0 ) {
/* .locals 0 */
p1 = this.a;
gj .a ( p1 );
p1 = (( gj ) p1 ).a ( ); // invoke-virtual {p1}, Lgj;->a()Z
/* invoke-direct {p0, p1}, Lgb;->f(Z)V */
return;
} // .end method
public final void a ( java.lang.CharSequence p0 ) {
/* .locals 1 */
v0 = this.a;
return;
} // .end method
public final void a ( Boolean p0 ) {
/* .locals 3 */
/* iget-boolean v0, p0, Lgb;->f:Z */
/* if-nez v0, :cond_1 */
int v0 = 4; // const/4 v0, 0x4
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 4; // const/4 p1, 0x4
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
v1 = v1 = this.a;
int v2 = 1; // const/4 v2, 0x1
/* iput-boolean v2, p0, Lgb;->f:Z */
v2 = this.a;
/* and-int/2addr p1, v0 */
/* and-int/lit8 v0, v1, -0x5 */
/* or-int/2addr p1, v0 */
} // :cond_1
return;
} // .end method
public final Boolean a ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 4 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
} // :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_3
if ( p2 != null) { // if-eqz p2, :cond_1
v2 = (( android.view.KeyEvent ) p2 ).getDeviceId ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I
} // :cond_1
int v2 = -1; // const/4 v2, -0x1
} // :goto_0
android.view.KeyCharacterMap .load ( v2 );
v2 = (( android.view.KeyCharacterMap ) v2 ).getKeyboardType ( ); // invoke-virtual {v2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I
int v3 = 1; // const/4 v3, 0x1
/* if-eq v2, v3, :cond_2 */
} // :cond_2
int v3 = 0; // const/4 v3, 0x0
p1 = } // :goto_1
} // :cond_3
} // .end method
public final void b ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lgb;->k:Z */
/* if-nez p1, :cond_0 */
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_0
(( gq ) p1 ).b ( ); // invoke-virtual {p1}, Lgq;->b()V
} // :cond_0
return;
} // .end method
public final void c ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lgb;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lgb;->c:Z */
int v0 = 1; // const/4 v0, 0x1
/* invoke-direct {p0, v0}, Lgb;->g(Z)V */
} // :cond_0
return;
} // .end method
public final void c ( Boolean p0 ) {
/* .locals 2 */
/* iget-boolean v0, p0, Lgb;->g:Z */
/* if-ne p1, v0, :cond_0 */
return;
} // :cond_0
/* iput-boolean p1, p0, Lgb;->g:Z */
p1 = this.b;
p1 = (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-ge v0, p1, :cond_1 */
v1 = this.b;
(( java.util.ArrayList ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
return;
} // .end method
public final void d ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lgb;->c:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lgb;->c:Z */
/* invoke-direct {p0, v0}, Lgb;->g(Z)V */
} // :cond_0
return;
} // .end method
public final void d ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lgb;->a:Z */
return;
} // .end method
public final Boolean d ( ) {
/* .locals 1 */
v0 = this.a;
v0 = if ( v0 != null) { // if-eqz v0, :cond_0
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final void e ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( gq ) v0 ).b ( ); // invoke-virtual {v0}, Lgq;->b()V
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
} // :cond_0
return;
} // .end method
public final void e ( Boolean p0 ) {
/* .locals 8 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* invoke-direct {p0}, Lgb;->f()V */
} // :cond_0
/* invoke-direct {p0}, Lgb;->g()V */
} // :goto_0
v0 = this.a;
v0 = em .d ( v0 );
int v1 = 4; // const/4 v1, 0x4
/* const/16 v2, 0x8 */
int v3 = 0; // const/4 v3, 0x0
if ( v0 != null) { // if-eqz v0, :cond_2
/* const-wide/16 v4, 0x64 */
/* const-wide/16 v6, 0xc8 */
if ( p1 != null) { // if-eqz p1, :cond_1
p1 = this.a;
v0 = this.a;
(( android.support.v7.widget.ActionBarContextView ) v0 ).a ( v3, v6, v7 ); // invoke-virtual {v0, v3, v6, v7}, Landroid/support/v7/widget/ActionBarContextView;->a(IJ)Lep;
} // :cond_1
p1 = this.a;
p1 = this.a;
(( android.support.v7.widget.ActionBarContextView ) p1 ).a ( v2, v4, v5 ); // invoke-virtual {p1, v2, v4, v5}, Landroid/support/v7/widget/ActionBarContextView;->a(IJ)Lep;
} // :goto_1
/* new-instance v1, Lgq; */
/* invoke-direct {v1}, Lgq;-><init>()V */
(( gq ) v1 ).a ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Lgq;->a(Lep;Lep;)Lgq;
(( gq ) v1 ).a ( ); // invoke-virtual {v1}, Lgq;->a()V
return;
} // :cond_2
if ( p1 != null) { // if-eqz p1, :cond_3
p1 = this.a;
p1 = this.a;
(( android.support.v7.widget.ActionBarContextView ) p1 ).setVisibility ( v3 ); // invoke-virtual {p1, v3}, Landroid/support/v7/widget/ActionBarContextView;->setVisibility(I)V
return;
} // :cond_3
p1 = this.a;
p1 = this.a;
(( android.support.v7.widget.ActionBarContextView ) p1 ).setVisibility ( v2 ); // invoke-virtual {p1, v2}, Landroid/support/v7/widget/ActionBarContextView;->setVisibility(I)V
return;
} // .end method
