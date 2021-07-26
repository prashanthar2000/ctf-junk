public class android.support.v4.widget.DrawerLayout extends android.view.ViewGroup {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/v4/widget/DrawerLayout$b;, */
	 /* Landroid/support/v4/widget/DrawerLayout$a;, */
	 /* Landroid/support/v4/widget/DrawerLayout$LayoutParams;, */
	 /* Landroid/support/v4/widget/DrawerLayout$e;, */
	 /* Landroid/support/v4/widget/DrawerLayout$d;, */
	 /* Landroid/support/v4/widget/DrawerLayout$c; */
	 /* } */
} // .end annotation
/* # static fields */
static final Boolean a;
static final a;
private static final b;
private static final Boolean c;
/* # instance fields */
private Float a;
Integer a;
private android.graphics.Matrix a;
private android.graphics.Paint a;
private android.graphics.Rect a;
private android.graphics.drawable.Drawable a;
private final android.support.v4.widget.DrawerLayout$b a;
private android.support.v4.widget.DrawerLayout$c a;
private final android.support.v4.widget.DrawerLayout$e a;
final fq a;
java.lang.CharSequence a;
private java.lang.Object a;
private final java.util.ArrayList a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
java.util.List a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Landroid/support/v4/widget/DrawerLayout$c;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private Float b;
private Integer b;
private android.graphics.drawable.Drawable b;
private final android.support.v4.widget.DrawerLayout$e b;
final fq b;
java.lang.CharSequence b;
Boolean b;
private Float c;
private Integer c;
private android.graphics.drawable.Drawable c;
private Float d;
private Integer d;
private android.graphics.drawable.Drawable d;
private Boolean d;
private Integer e;
private android.graphics.drawable.Drawable e;
private Boolean e;
private Integer f;
private android.graphics.drawable.Drawable f;
private Boolean f;
private Integer g;
private android.graphics.drawable.Drawable g;
private Boolean g;
/* # direct methods */
static android.support.v4.widget.DrawerLayout ( ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
/* new-array v1, v0, [I */
int v2 = 0; // const/4 v2, 0x0
/* const v3, 0x1010434 */
/* aput v3, v1, v2 */
/* new-array v1, v0, [I */
/* const v3, 0x10100b3 */
/* aput v3, v1, v2 */
/* const/16 v3, 0x13 */
/* if-lt v1, v3, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
android.support.v4.widget.DrawerLayout.a = (v1!= 0);
/* const/16 v3, 0x15 */
/* if-lt v1, v3, :cond_1 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
android.support.v4.widget.DrawerLayout.c = (v0!= 0);
return;
} // .end method
public android.support.v4.widget.DrawerLayout ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
return;
} // .end method
public android.support.v4.widget.DrawerLayout ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, p2, v0}, Landroid/support/v4/widget/DrawerLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
return;
} // .end method
public android.support.v4.widget.DrawerLayout ( ) {
/* .locals 5 */
/* invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
/* new-instance p2, Landroid/support/v4/widget/DrawerLayout$b; */
/* invoke-direct {p2}, Landroid/support/v4/widget/DrawerLayout$b;-><init>()V */
this.a = p2;
/* const/high16 p2, -0x67000000 */
/* iput p2, p0, Landroid/support/v4/widget/DrawerLayout;->c:I */
/* new-instance p2, Landroid/graphics/Paint; */
/* invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V */
this.a = p2;
int p2 = 1; // const/4 p2, 0x1
/* iput-boolean p2, p0, Landroid/support/v4/widget/DrawerLayout;->e:Z */
int p3 = 3; // const/4 p3, 0x3
/* iput p3, p0, Landroid/support/v4/widget/DrawerLayout;->d:I */
/* iput p3, p0, Landroid/support/v4/widget/DrawerLayout;->e:I */
/* iput p3, p0, Landroid/support/v4/widget/DrawerLayout;->f:I */
/* iput p3, p0, Landroid/support/v4/widget/DrawerLayout;->g:I */
int v0 = 0; // const/4 v0, 0x0
this.d = v0;
this.e = v0;
this.f = v0;
this.g = v0;
/* const/high16 v1, 0x40000 */
(( android.support.v4.widget.DrawerLayout ) p0 ).setDescendantFocusability ( v1 ); // invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->setDescendantFocusability(I)V
(( android.support.v4.widget.DrawerLayout ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getDisplayMetrics ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget v1, v1, Landroid/util/DisplayMetrics;->density:F */
/* const/high16 v2, 0x42800000 # 64.0f */
/* mul-float v2, v2, v1 */
/* const/high16 v3, 0x3f000000 # 0.5f */
/* add-float/2addr v2, v3 */
/* float-to-int v2, v2 */
/* iput v2, p0, Landroid/support/v4/widget/DrawerLayout;->b:I */
/* const/high16 v2, 0x43c80000 # 400.0f */
/* mul-float v2, v2, v1 */
/* new-instance v3, Landroid/support/v4/widget/DrawerLayout$e; */
/* invoke-direct {v3, p0, p3}, Landroid/support/v4/widget/DrawerLayout$e;-><init>(Landroid/support/v4/widget/DrawerLayout;I)V */
this.a = v3;
/* new-instance p3, Landroid/support/v4/widget/DrawerLayout$e; */
int v3 = 5; // const/4 v3, 0x5
/* invoke-direct {p3, p0, v3}, Landroid/support/v4/widget/DrawerLayout$e;-><init>(Landroid/support/v4/widget/DrawerLayout;I)V */
this.b = p3;
p3 = this.a;
/* const/high16 v3, 0x3f800000 # 1.0f */
fq .a ( p0,v3,p3 );
this.a = p3;
p3 = this.a;
/* iput p2, p3, Lfq;->d:I */
/* iput v2, p3, Lfq;->a:F */
v4 = this.a;
this.a = p3;
p3 = this.b;
fq .a ( p0,v3,p3 );
this.b = p3;
p3 = this.b;
int v3 = 2; // const/4 v3, 0x2
/* iput v3, p3, Lfq;->d:I */
/* iput v2, p3, Lfq;->a:F */
v2 = this.b;
this.a = p3;
(( android.support.v4.widget.DrawerLayout ) p0 ).setFocusableInTouchMode ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v4/widget/DrawerLayout;->setFocusableInTouchMode(Z)V
em .a ( p0,p2 );
/* new-instance p2, Landroid/support/v4/widget/DrawerLayout$a; */
/* invoke-direct {p2, p0}, Landroid/support/v4/widget/DrawerLayout$a;-><init>(Landroid/support/v4/widget/DrawerLayout;)V */
em .a ( p0,p2 );
int p2 = 0; // const/4 p2, 0x0
(( android.support.v4.widget.DrawerLayout ) p0 ).setMotionEventSplittingEnabled ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v4/widget/DrawerLayout;->setMotionEventSplittingEnabled(Z)V
p3 = em .a ( p0 );
if ( p3 != null) { // if-eqz p3, :cond_1
/* const/16 v2, 0x15 */
/* if-lt p3, v2, :cond_0 */
/* new-instance p3, Landroid/support/v4/widget/DrawerLayout$1; */
/* invoke-direct {p3, p0}, Landroid/support/v4/widget/DrawerLayout$1;-><init>(Landroid/support/v4/widget/DrawerLayout;)V */
(( android.support.v4.widget.DrawerLayout ) p0 ).setOnApplyWindowInsetsListener ( p3 ); // invoke-virtual {p0, p3}, Landroid/support/v4/widget/DrawerLayout;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V
/* const/16 p3, 0x500 */
(( android.support.v4.widget.DrawerLayout ) p0 ).setSystemUiVisibility ( p3 ); // invoke-virtual {p0, p3}, Landroid/support/v4/widget/DrawerLayout;->setSystemUiVisibility(I)V
p3 = android.support.v4.widget.DrawerLayout.b;
(( android.content.Context ) p1 ).obtainStyledAttributes ( p3 ); // invoke-virtual {p1, p3}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;
try { // :try_start_0
(( android.content.res.TypedArray ) p1 ).getDrawable ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
this.a = p2;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
/* :catchall_0 */
/* move-exception p2 */
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
/* throw p2 */
} // :cond_0
this.a = v0;
} // :cond_1
} // :goto_0
/* const/high16 p1, 0x41200000 # 10.0f */
/* mul-float v1, v1, p1 */
/* iput v1, p0, Landroid/support/v4/widget/DrawerLayout;->a:F */
/* new-instance p1, Ljava/util/ArrayList; */
/* invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V */
this.a = p1;
return;
} // .end method
static Float a ( android.view.View p0 ) {
/* .locals 0 */
(( android.view.View ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
/* iget p0, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:F */
} // .end method
private android.graphics.drawable.Drawable a ( ) {
/* .locals 2 */
v0 = em .b ( p0 );
/* if-nez v0, :cond_0 */
v1 = this.d;
if ( v1 != null) { // if-eqz v1, :cond_1
android.support.v4.widget.DrawerLayout .a ( v1,v0 );
v0 = this.d;
} // :cond_0
v1 = this.e;
if ( v1 != null) { // if-eqz v1, :cond_1
android.support.v4.widget.DrawerLayout .a ( v1,v0 );
v0 = this.e;
} // :cond_1
v0 = this.f;
} // .end method
private void a ( ) {
/* .locals 1 */
/* sget-boolean v0, Landroid/support/v4/widget/DrawerLayout;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
} // :cond_0
/* invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->a()Landroid/graphics/drawable/Drawable; */
this.b = v0;
/* invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->b()Landroid/graphics/drawable/Drawable; */
this.c = v0;
return;
} // .end method
private void a ( Boolean p0 ) {
/* .locals 9 */
v0 = (( android.support.v4.widget.DrawerLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_3 */
(( android.support.v4.widget.DrawerLayout ) p0 ).getChildAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v5, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
v6 = android.support.v4.widget.DrawerLayout .a ( v4 );
if ( v6 != null) { // if-eqz v6, :cond_2
if ( p1 != null) { // if-eqz p1, :cond_0
/* iget-boolean v6, v5, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:Z */
if ( v6 != null) { // if-eqz v6, :cond_2
} // :cond_0
v6 = (( android.view.View ) v4 ).getWidth ( ); // invoke-virtual {v4}, Landroid/view/View;->getWidth()I
int v7 = 3; // const/4 v7, 0x3
v7 = (( android.support.v4.widget.DrawerLayout ) p0 ).a ( v4, v7 ); // invoke-virtual {p0, v4, v7}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;I)Z
if ( v7 != null) { // if-eqz v7, :cond_1
v7 = this.a;
/* neg-int v6, v6 */
v8 = (( android.view.View ) v4 ).getTop ( ); // invoke-virtual {v4}, Landroid/view/View;->getTop()I
v4 = (( fq ) v7 ).a ( v4, v6, v8 ); // invoke-virtual {v7, v4, v6, v8}, Lfq;->a(Landroid/view/View;II)Z
} // :cond_1
v6 = this.b;
v7 = (( android.support.v4.widget.DrawerLayout ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
v8 = (( android.view.View ) v4 ).getTop ( ); // invoke-virtual {v4}, Landroid/view/View;->getTop()I
v4 = (( fq ) v6 ).a ( v4, v7, v8 ); // invoke-virtual {v6, v4, v7, v8}, Lfq;->a(Landroid/view/View;II)Z
} // :goto_1
/* or-int/2addr v3, v4 */
/* iput-boolean v1, v5, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:Z */
} // :cond_2
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_3
p1 = this.a;
(( android.support.v4.widget.DrawerLayout$e ) p1 ).a ( ); // invoke-virtual {p1}, Landroid/support/v4/widget/DrawerLayout$e;->a()V
p1 = this.b;
(( android.support.v4.widget.DrawerLayout$e ) p1 ).a ( ); // invoke-virtual {p1}, Landroid/support/v4/widget/DrawerLayout$e;->a()V
if ( v3 != null) { // if-eqz v3, :cond_4
(( android.support.v4.widget.DrawerLayout ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
} // :cond_4
return;
} // .end method
private static Boolean a ( android.graphics.drawable.Drawable p0, Integer p1 ) {
/* .locals 1 */
if ( p0 != null) { // if-eqz p0, :cond_1
v0 = cx .a ( p0 );
/* if-nez v0, :cond_0 */
} // :cond_0
cx .a ( p0,p1 );
int p0 = 1; // const/4 p0, 0x1
} // :cond_1
} // :goto_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
static Boolean a ( android.view.View p0 ) {
/* .locals 2 */
(( android.view.View ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
/* iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:I */
p0 = em .b ( p0 );
p0 = dz .a ( v0,p0 );
/* and-int/lit8 v0, p0, 0x3 */
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
/* and-int/lit8 p0, p0, 0x5 */
if ( p0 != null) { // if-eqz p0, :cond_1
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // .end method
private android.graphics.drawable.Drawable b ( ) {
/* .locals 2 */
v0 = em .b ( p0 );
/* if-nez v0, :cond_0 */
v1 = this.e;
if ( v1 != null) { // if-eqz v1, :cond_1
android.support.v4.widget.DrawerLayout .a ( v1,v0 );
v0 = this.e;
} // :cond_0
v1 = this.d;
if ( v1 != null) { // if-eqz v1, :cond_1
android.support.v4.widget.DrawerLayout .a ( v1,v0 );
v0 = this.d;
} // :cond_1
v0 = this.g;
} // .end method
private android.view.View b ( ) {
/* .locals 5 */
v0 = (( android.support.v4.widget.DrawerLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
(( android.support.v4.widget.DrawerLayout ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
/* iget v3, v3, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->b:I */
int v4 = 1; // const/4 v4, 0x1
/* and-int/2addr v3, v4 */
/* if-ne v3, v4, :cond_0 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
private void b ( android.view.View p0 ) {
/* .locals 3 */
v0 = android.support.v4.widget.DrawerLayout .a ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_2
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
/* iget-boolean v1, p0, Landroid/support/v4/widget/DrawerLayout;->e:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* const/high16 v1, 0x3f800000 # 1.0f */
/* iput v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:F */
int v1 = 1; // const/4 v1, 0x1
/* iput v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->b:I */
(( android.support.v4.widget.DrawerLayout ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;Z)V
} // :cond_0
/* iget v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->b:I */
/* or-int/lit8 v1, v1, 0x2 */
/* iput v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->b:I */
int v0 = 3; // const/4 v0, 0x3
v0 = (( android.support.v4.widget.DrawerLayout ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;I)Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
} // :cond_1
v0 = this.b;
v1 = (( android.support.v4.widget.DrawerLayout ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
v2 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
/* sub-int/2addr v1, v2 */
} // :goto_0
v2 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
(( fq ) v0 ).a ( p1, v1, v2 ); // invoke-virtual {v0, p1, v1, v2}, Lfq;->a(Landroid/view/View;II)Z
} // :goto_1
(( android.support.v4.widget.DrawerLayout ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
return;
} // :cond_2
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "View "; // const-string v2, "View "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p1 = " is not a sliding drawer"; // const-string p1, " is not a sliding drawer"
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
static Boolean b ( android.view.View p0 ) {
/* .locals 2 */
v0 = em .a ( p0 );
int v1 = 4; // const/4 v1, 0x4
/* if-eq v0, v1, :cond_0 */
p0 = em .a ( p0 );
int v0 = 2; // const/4 v0, 0x2
/* if-eq p0, v0, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
private static Boolean c ( android.view.View p0 ) {
/* .locals 0 */
(( android.view.View ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
/* iget p0, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:I */
/* if-nez p0, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
/* # virtual methods */
public final Integer a ( android.view.View p0 ) {
/* .locals 3 */
v0 = android.support.v4.widget.DrawerLayout .a ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_d
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p1, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
/* iget p1, p1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:I */
v0 = em .b ( p0 );
int v1 = 3; // const/4 v1, 0x3
/* if-eq p1, v1, :cond_9 */
int v2 = 5; // const/4 v2, 0x5
/* if-eq p1, v2, :cond_6 */
/* const v2, 0x800003 */
/* if-eq p1, v2, :cond_3 */
/* const v2, 0x800005 */
/* if-eq p1, v2, :cond_0 */
} // :cond_0
/* iget p1, p0, Landroid/support/v4/widget/DrawerLayout;->g:I */
/* if-eq p1, v1, :cond_1 */
} // :cond_1
/* if-nez v0, :cond_2 */
/* iget p1, p0, Landroid/support/v4/widget/DrawerLayout;->e:I */
} // :cond_2
/* iget p1, p0, Landroid/support/v4/widget/DrawerLayout;->d:I */
} // :goto_0
/* if-eq p1, v1, :cond_c */
} // :cond_3
/* iget p1, p0, Landroid/support/v4/widget/DrawerLayout;->f:I */
/* if-eq p1, v1, :cond_4 */
} // :cond_4
/* if-nez v0, :cond_5 */
/* iget p1, p0, Landroid/support/v4/widget/DrawerLayout;->d:I */
} // :cond_5
/* iget p1, p0, Landroid/support/v4/widget/DrawerLayout;->e:I */
} // :goto_1
/* if-eq p1, v1, :cond_c */
} // :cond_6
/* iget p1, p0, Landroid/support/v4/widget/DrawerLayout;->e:I */
/* if-eq p1, v1, :cond_7 */
} // :cond_7
/* if-nez v0, :cond_8 */
/* iget p1, p0, Landroid/support/v4/widget/DrawerLayout;->g:I */
} // :cond_8
/* iget p1, p0, Landroid/support/v4/widget/DrawerLayout;->f:I */
} // :goto_2
/* if-eq p1, v1, :cond_c */
} // :cond_9
/* iget p1, p0, Landroid/support/v4/widget/DrawerLayout;->d:I */
/* if-eq p1, v1, :cond_a */
} // :cond_a
/* if-nez v0, :cond_b */
/* iget p1, p0, Landroid/support/v4/widget/DrawerLayout;->f:I */
} // :cond_b
/* iget p1, p0, Landroid/support/v4/widget/DrawerLayout;->g:I */
} // :goto_3
/* if-eq p1, v1, :cond_c */
} // :cond_c
} // :goto_4
int p1 = 0; // const/4 p1, 0x0
} // :cond_d
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "View "; // const-string v2, "View "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p1 = " is not a drawer"; // const-string p1, " is not a drawer"
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
final android.view.View a ( ) {
/* .locals 6 */
v0 = (( android.support.v4.widget.DrawerLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_3 */
(( android.support.v4.widget.DrawerLayout ) p0 ).getChildAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
v4 = android.support.v4.widget.DrawerLayout .a ( v3 );
if ( v4 != null) { // if-eqz v4, :cond_2
v4 = android.support.v4.widget.DrawerLayout .a ( v3 );
if ( v4 != null) { // if-eqz v4, :cond_1
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v4, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
/* iget v4, v4, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:F */
int v5 = 0; // const/4 v5, 0x0
/* cmpl-float v4, v4, v5 */
/* if-lez v4, :cond_0 */
int v4 = 1; // const/4 v4, 0x1
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
} // :goto_1
if ( v4 != null) { // if-eqz v4, :cond_2
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "View "; // const-string v2, "View "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " is not a drawer"; // const-string v2, " is not a drawer"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_2
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // .end method
final android.view.View a ( Integer p0 ) {
/* .locals 4 */
v0 = em .b ( p0 );
p1 = dz .a ( p1,v0 );
/* and-int/lit8 p1, p1, 0x7 */
v0 = (( android.support.v4.widget.DrawerLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
(( android.support.v4.widget.DrawerLayout ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
v3 = (( android.support.v4.widget.DrawerLayout ) p0 ).b ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->b(Landroid/view/View;)I
/* and-int/lit8 v3, v3, 0x7 */
/* if-ne v3, p1, :cond_0 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final void a ( android.view.View p0 ) {
/* .locals 3 */
v0 = android.support.v4.widget.DrawerLayout .a ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_2
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
/* iget-boolean v1, p0, Landroid/support/v4/widget/DrawerLayout;->e:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
int p1 = 0; // const/4 p1, 0x0
/* iput p1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:F */
int p1 = 0; // const/4 p1, 0x0
/* iput p1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->b:I */
} // :cond_0
/* iget v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->b:I */
/* or-int/lit8 v1, v1, 0x4 */
/* iput v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->b:I */
int v0 = 3; // const/4 v0, 0x3
v0 = (( android.support.v4.widget.DrawerLayout ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;I)Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
v1 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
/* neg-int v1, v1 */
} // :cond_1
v0 = this.b;
v1 = (( android.support.v4.widget.DrawerLayout ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
} // :goto_0
v2 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
(( fq ) v0 ).a ( p1, v1, v2 ); // invoke-virtual {v0, p1, v1, v2}, Lfq;->a(Landroid/view/View;II)Z
} // :goto_1
(( android.support.v4.widget.DrawerLayout ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
return;
} // :cond_2
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "View "; // const-string v2, "View "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p1 = " is not a sliding drawer"; // const-string p1, " is not a sliding drawer"
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
final void a ( android.view.View p0, Float p1 ) {
/* .locals 1 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p1, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
/* iget v0, p1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:F */
/* cmpl-float v0, p2, v0 */
/* if-nez v0, :cond_0 */
return;
} // :cond_0
/* iput p2, p1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:F */
p1 = this.a;
p1 = if ( p1 != null) { // if-eqz p1, :cond_1
/* add-int/lit8 p1, p1, -0x1 */
} // :goto_0
/* if-ltz p1, :cond_1 */
p2 = this.a;
/* add-int/lit8 p1, p1, -0x1 */
} // :cond_1
return;
} // .end method
final void a ( android.view.View p0, Boolean p1 ) {
/* .locals 4 */
v0 = (( android.support.v4.widget.DrawerLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_3 */
(( android.support.v4.widget.DrawerLayout ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
/* if-nez p2, :cond_0 */
v3 = android.support.v4.widget.DrawerLayout .a ( v2 );
if ( v3 != null) { // if-eqz v3, :cond_1
} // :cond_0
if ( p2 != null) { // if-eqz p2, :cond_2
/* if-ne v2, p1, :cond_2 */
} // :cond_1
int v3 = 1; // const/4 v3, 0x1
} // :cond_2
int v3 = 4; // const/4 v3, 0x4
} // :goto_1
em .a ( v2,v3 );
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_3
return;
} // .end method
final Boolean a ( android.view.View p0, Integer p1 ) {
/* .locals 0 */
p1 = (( android.support.v4.widget.DrawerLayout ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->b(Landroid/view/View;)I
/* and-int/2addr p1, p2 */
/* if-ne p1, p2, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void addFocusables ( java.util.ArrayList p0, Integer p1, Integer p2 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;II)V" */
/* } */
} // .end annotation
v0 = (( android.support.v4.widget.DrawerLayout ) p0 ).getDescendantFocusability ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getDescendantFocusability()I
/* const/high16 v1, 0x60000 */
/* if-ne v0, v1, :cond_0 */
return;
} // :cond_0
v0 = (( android.support.v4.widget.DrawerLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_5 */
(( android.support.v4.widget.DrawerLayout ) p0 ).getChildAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
v5 = android.support.v4.widget.DrawerLayout .a ( v4 );
int v6 = 1; // const/4 v6, 0x1
if ( v5 != null) { // if-eqz v5, :cond_3
v5 = android.support.v4.widget.DrawerLayout .a ( v4 );
if ( v5 != null) { // if-eqz v5, :cond_2
(( android.view.View ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v5, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
/* iget v5, v5, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->b:I */
/* and-int/2addr v5, v6 */
/* if-ne v5, v6, :cond_1 */
int v5 = 1; // const/4 v5, 0x1
} // :cond_1
int v5 = 0; // const/4 v5, 0x0
} // :goto_1
if ( v5 != null) { // if-eqz v5, :cond_4
(( android.view.View ) v4 ).addFocusables ( p1, p2, p3 ); // invoke-virtual {v4, p1, p2, p3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V
int v3 = 1; // const/4 v3, 0x1
} // :cond_2
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
final String p3 = "View "; // const-string p3, "View "
/* invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) p2 ).append ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p3 = " is not a drawer"; // const-string p3, " is not a drawer"
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_3
v5 = this.a;
(( java.util.ArrayList ) v5 ).add ( v4 ); // invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_4
} // :goto_2
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_5
/* if-nez v3, :cond_7 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
} // :goto_3
/* if-ge v1, v0, :cond_7 */
v2 = this.a;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/view/View; */
v3 = (( android.view.View ) v2 ).getVisibility ( ); // invoke-virtual {v2}, Landroid/view/View;->getVisibility()I
/* if-nez v3, :cond_6 */
(( android.view.View ) v2 ).addFocusables ( p1, p2, p3 ); // invoke-virtual {v2, p1, p2, p3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V
} // :cond_6
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_7
p1 = this.a;
(( java.util.ArrayList ) p1 ).clear ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V
return;
} // .end method
public void addView ( android.view.View p0, Integer p1, android.view.ViewGroup$LayoutParams p2 ) {
/* .locals 0 */
/* invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V */
/* invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->b()Landroid/view/View; */
/* if-nez p2, :cond_1 */
p2 = android.support.v4.widget.DrawerLayout .a ( p1 );
if ( p2 != null) { // if-eqz p2, :cond_0
} // :cond_0
int p2 = 1; // const/4 p2, 0x1
} // :cond_1
} // :goto_0
int p2 = 4; // const/4 p2, 0x4
} // :goto_1
em .a ( p1,p2 );
/* sget-boolean p2, Landroid/support/v4/widget/DrawerLayout;->a:Z */
/* if-nez p2, :cond_2 */
p2 = this.a;
em .a ( p1,p2 );
} // :cond_2
return;
} // .end method
final Integer b ( android.view.View p0 ) {
/* .locals 1 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p1, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
/* iget p1, p1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:I */
v0 = em .b ( p0 );
p1 = dz .a ( p1,v0 );
} // .end method
protected Boolean checkLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 1 */
/* instance-of v0, p1, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void computeScroll ( ) {
/* .locals 4 */
v0 = (( android.support.v4.widget.DrawerLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_0 */
(( android.support.v4.widget.DrawerLayout ) p0 ).getChildAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
/* iget v3, v3, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:F */
v1 = java.lang.Math .max ( v1,v3 );
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
/* iput v1, p0, Landroid/support/v4/widget/DrawerLayout;->b:F */
v0 = this.a;
v0 = (( fq ) v0 ).a ( ); // invoke-virtual {v0}, Lfq;->a()Z
v1 = this.b;
v1 = (( fq ) v1 ).a ( ); // invoke-virtual {v1}, Lfq;->a()Z
/* if-nez v0, :cond_1 */
if ( v1 != null) { // if-eqz v1, :cond_2
} // :cond_1
em .a ( p0 );
} // :cond_2
return;
} // .end method
public Boolean dispatchGenericMotionEvent ( android.view.MotionEvent p0 ) {
/* .locals 8 */
v0 = (( android.view.MotionEvent ) p1 ).getSource ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I
/* and-int/lit8 v0, v0, 0x2 */
if ( v0 != null) { // if-eqz v0, :cond_7
v0 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
/* const/16 v1, 0xa */
/* if-eq v0, v1, :cond_7 */
/* iget v0, p0, Landroid/support/v4/widget/DrawerLayout;->b:F */
int v1 = 0; // const/4 v1, 0x0
/* cmpg-float v0, v0, v1 */
/* if-gtz v0, :cond_0 */
/* goto/16 :goto_2 */
} // :cond_0
v0 = (( android.support.v4.widget.DrawerLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
if ( v0 != null) { // if-eqz v0, :cond_6
v1 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
v2 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
int v3 = 1; // const/4 v3, 0x1
/* sub-int/2addr v0, v3 */
} // :goto_0
/* if-ltz v0, :cond_6 */
(( android.support.v4.widget.DrawerLayout ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
v5 = this.a;
/* if-nez v5, :cond_1 */
/* new-instance v5, Landroid/graphics/Rect; */
/* invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V */
this.a = v5;
} // :cond_1
v5 = this.a;
(( android.view.View ) v4 ).getHitRect ( v5 ); // invoke-virtual {v4, v5}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V
v5 = this.a;
/* float-to-int v6, v1 */
/* float-to-int v7, v2 */
v5 = (( android.graphics.Rect ) v5 ).contains ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Landroid/graphics/Rect;->contains(II)Z
if ( v5 != null) { // if-eqz v5, :cond_5
v5 = android.support.v4.widget.DrawerLayout .c ( v4 );
/* if-nez v5, :cond_5 */
(( android.view.View ) v4 ).getMatrix ( ); // invoke-virtual {v4}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;
v5 = (( android.graphics.Matrix ) v5 ).isIdentity ( ); // invoke-virtual {v5}, Landroid/graphics/Matrix;->isIdentity()Z
/* if-nez v5, :cond_4 */
v5 = (( android.support.v4.widget.DrawerLayout ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getScrollX()I
v6 = (( android.view.View ) v4 ).getLeft ( ); // invoke-virtual {v4}, Landroid/view/View;->getLeft()I
/* sub-int/2addr v5, v6 */
/* int-to-float v5, v5 */
v6 = (( android.support.v4.widget.DrawerLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getScrollY()I
v7 = (( android.view.View ) v4 ).getTop ( ); // invoke-virtual {v4}, Landroid/view/View;->getTop()I
/* sub-int/2addr v6, v7 */
/* int-to-float v6, v6 */
android.view.MotionEvent .obtain ( p1 );
(( android.view.MotionEvent ) v7 ).offsetLocation ( v5, v6 ); // invoke-virtual {v7, v5, v6}, Landroid/view/MotionEvent;->offsetLocation(FF)V
(( android.view.View ) v4 ).getMatrix ( ); // invoke-virtual {v4}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;
v6 = (( android.graphics.Matrix ) v5 ).isIdentity ( ); // invoke-virtual {v5}, Landroid/graphics/Matrix;->isIdentity()Z
/* if-nez v6, :cond_3 */
v6 = this.a;
/* if-nez v6, :cond_2 */
/* new-instance v6, Landroid/graphics/Matrix; */
/* invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V */
this.a = v6;
} // :cond_2
v6 = this.a;
(( android.graphics.Matrix ) v5 ).invert ( v6 ); // invoke-virtual {v5, v6}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z
v5 = this.a;
(( android.view.MotionEvent ) v7 ).transform ( v5 ); // invoke-virtual {v7, v5}, Landroid/view/MotionEvent;->transform(Landroid/graphics/Matrix;)V
} // :cond_3
v4 = (( android.view.View ) v4 ).dispatchGenericMotionEvent ( v7 ); // invoke-virtual {v4, v7}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
(( android.view.MotionEvent ) v7 ).recycle ( ); // invoke-virtual {v7}, Landroid/view/MotionEvent;->recycle()V
} // :cond_4
v5 = (( android.support.v4.widget.DrawerLayout ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getScrollX()I
v6 = (( android.view.View ) v4 ).getLeft ( ); // invoke-virtual {v4}, Landroid/view/View;->getLeft()I
/* sub-int/2addr v5, v6 */
/* int-to-float v5, v5 */
v6 = (( android.support.v4.widget.DrawerLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getScrollY()I
v7 = (( android.view.View ) v4 ).getTop ( ); // invoke-virtual {v4}, Landroid/view/View;->getTop()I
/* sub-int/2addr v6, v7 */
/* int-to-float v6, v6 */
(( android.view.MotionEvent ) p1 ).offsetLocation ( v5, v6 ); // invoke-virtual {p1, v5, v6}, Landroid/view/MotionEvent;->offsetLocation(FF)V
v4 = (( android.view.View ) v4 ).dispatchGenericMotionEvent ( p1 ); // invoke-virtual {v4, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
/* neg-float v5, v5 */
/* neg-float v6, v6 */
(( android.view.MotionEvent ) p1 ).offsetLocation ( v5, v6 ); // invoke-virtual {p1, v5, v6}, Landroid/view/MotionEvent;->offsetLocation(FF)V
} // :goto_1
if ( v4 != null) { // if-eqz v4, :cond_5
} // :cond_5
/* add-int/lit8 v0, v0, -0x1 */
/* goto/16 :goto_0 */
} // :cond_6
int p1 = 0; // const/4 p1, 0x0
} // :cond_7
} // :goto_2
p1 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z */
} // .end method
protected Boolean drawChild ( android.graphics.Canvas p0, android.view.View p1, Long p2 ) {
/* .locals 15 */
/* move-object v0, p0 */
/* move-object/from16 v1, p1 */
/* move-object/from16 v2, p2 */
v3 = (( android.support.v4.widget.DrawerLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getHeight()I
v4 = /* invoke-static/range {p2 ..p2}, Landroid/support/v4/widget/DrawerLayout;->c(Landroid/view/View;)Z */
v5 = (( android.support.v4.widget.DrawerLayout ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
v6 = /* invoke-virtual/range {p1 ..p1}, Landroid/graphics/Canvas;->save()I */
int v7 = 3; // const/4 v7, 0x3
int v8 = 0; // const/4 v8, 0x0
if ( v4 != null) { // if-eqz v4, :cond_4
v9 = (( android.support.v4.widget.DrawerLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
/* move v11, v5 */
int v5 = 0; // const/4 v5, 0x0
int v10 = 0; // const/4 v10, 0x0
} // :goto_0
/* if-ge v5, v9, :cond_3 */
(( android.support.v4.widget.DrawerLayout ) p0 ).getChildAt ( v5 ); // invoke-virtual {p0, v5}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
/* if-eq v12, v2, :cond_2 */
v13 = (( android.view.View ) v12 ).getVisibility ( ); // invoke-virtual {v12}, Landroid/view/View;->getVisibility()I
/* if-nez v13, :cond_2 */
(( android.view.View ) v12 ).getBackground ( ); // invoke-virtual {v12}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
if ( v13 != null) { // if-eqz v13, :cond_0
v13 = (( android.graphics.drawable.Drawable ) v13 ).getOpacity ( ); // invoke-virtual {v13}, Landroid/graphics/drawable/Drawable;->getOpacity()I
int v14 = -1; // const/4 v14, -0x1
/* if-ne v13, v14, :cond_0 */
int v13 = 1; // const/4 v13, 0x1
} // :cond_0
int v13 = 0; // const/4 v13, 0x0
} // :goto_1
if ( v13 != null) { // if-eqz v13, :cond_2
v13 = android.support.v4.widget.DrawerLayout .a ( v12 );
if ( v13 != null) { // if-eqz v13, :cond_2
v13 = (( android.view.View ) v12 ).getHeight ( ); // invoke-virtual {v12}, Landroid/view/View;->getHeight()I
/* if-lt v13, v3, :cond_2 */
v13 = (( android.support.v4.widget.DrawerLayout ) p0 ).a ( v12, v7 ); // invoke-virtual {p0, v12, v7}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;I)Z
if ( v13 != null) { // if-eqz v13, :cond_1
v12 = (( android.view.View ) v12 ).getRight ( ); // invoke-virtual {v12}, Landroid/view/View;->getRight()I
/* if-le v12, v10, :cond_2 */
/* move v10, v12 */
} // :cond_1
v12 = (( android.view.View ) v12 ).getLeft ( ); // invoke-virtual {v12}, Landroid/view/View;->getLeft()I
/* if-ge v12, v11, :cond_2 */
/* move v11, v12 */
} // :cond_2
} // :goto_2
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_3
v3 = (( android.support.v4.widget.DrawerLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getHeight()I
(( android.graphics.Canvas ) v1 ).clipRect ( v10, v8, v11, v3 ); // invoke-virtual {v1, v10, v8, v11, v3}, Landroid/graphics/Canvas;->clipRect(IIII)Z
/* move v8, v10 */
} // :cond_4
/* move v11, v5 */
} // :goto_3
v9 = /* invoke-super/range {p0 ..p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z */
(( android.graphics.Canvas ) v1 ).restoreToCount ( v6 ); // invoke-virtual {v1, v6}, Landroid/graphics/Canvas;->restoreToCount(I)V
/* iget v3, v0, Landroid/support/v4/widget/DrawerLayout;->b:F */
int v5 = 0; // const/4 v5, 0x0
/* cmpl-float v6, v3, v5 */
/* if-lez v6, :cond_5 */
if ( v4 != null) { // if-eqz v4, :cond_5
/* iget v2, v0, Landroid/support/v4/widget/DrawerLayout;->c:I */
/* const/high16 v4, -0x1000000 */
/* and-int/2addr v4, v2 */
/* ushr-int/lit8 v4, v4, 0x18 */
/* int-to-float v4, v4 */
/* mul-float v4, v4, v3 */
/* float-to-int v3, v4 */
/* shl-int/lit8 v3, v3, 0x18 */
/* const v4, 0xffffff */
/* and-int/2addr v2, v4 */
/* or-int/2addr v2, v3 */
v3 = this.a;
(( android.graphics.Paint ) v3 ).setColor ( v2 ); // invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColor(I)V
/* int-to-float v2, v8 */
int v3 = 0; // const/4 v3, 0x0
/* int-to-float v4, v11 */
v5 = (( android.support.v4.widget.DrawerLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getHeight()I
/* int-to-float v5, v5 */
v6 = this.a;
/* move-object/from16 v1, p1 */
/* invoke-virtual/range {v1 ..v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
/* goto/16 :goto_5 */
} // :cond_5
v3 = this.b;
/* const/high16 v4, 0x437f0000 # 255.0f */
/* const/high16 v6, 0x3f800000 # 1.0f */
if ( v3 != null) { // if-eqz v3, :cond_6
v3 = (( android.support.v4.widget.DrawerLayout ) p0 ).a ( v2, v7 ); // invoke-virtual {p0, v2, v7}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;I)Z
if ( v3 != null) { // if-eqz v3, :cond_6
v3 = this.b;
v3 = (( android.graphics.drawable.Drawable ) v3 ).getIntrinsicWidth ( ); // invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
v7 = /* invoke-virtual/range {p2 ..p2}, Landroid/view/View;->getRight()I */
v8 = this.a;
/* iget v8, v8, Lfq;->c:I */
/* int-to-float v10, v7 */
/* int-to-float v8, v8 */
/* div-float/2addr v10, v8 */
v6 = java.lang.Math .min ( v10,v6 );
v5 = java.lang.Math .max ( v5,v6 );
v6 = this.b;
v8 = /* invoke-virtual/range {p2 ..p2}, Landroid/view/View;->getTop()I */
/* add-int/2addr v3, v7 */
v2 = /* invoke-virtual/range {p2 ..p2}, Landroid/view/View;->getBottom()I */
(( android.graphics.drawable.Drawable ) v6 ).setBounds ( v7, v8, v3, v2 ); // invoke-virtual {v6, v7, v8, v3, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
v2 = this.b;
/* mul-float v5, v5, v4 */
/* float-to-int v3, v5 */
(( android.graphics.drawable.Drawable ) v2 ).setAlpha ( v3 ); // invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
v2 = this.b;
} // :goto_4
(( android.graphics.drawable.Drawable ) v2 ).draw ( v1 ); // invoke-virtual {v2, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
} // :cond_6
v3 = this.c;
if ( v3 != null) { // if-eqz v3, :cond_7
int v3 = 5; // const/4 v3, 0x5
v3 = (( android.support.v4.widget.DrawerLayout ) p0 ).a ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;I)Z
if ( v3 != null) { // if-eqz v3, :cond_7
v3 = this.c;
v3 = (( android.graphics.drawable.Drawable ) v3 ).getIntrinsicWidth ( ); // invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
v7 = /* invoke-virtual/range {p2 ..p2}, Landroid/view/View;->getLeft()I */
v8 = (( android.support.v4.widget.DrawerLayout ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
/* sub-int/2addr v8, v7 */
v10 = this.b;
/* iget v10, v10, Lfq;->c:I */
/* int-to-float v8, v8 */
/* int-to-float v10, v10 */
/* div-float/2addr v8, v10 */
v6 = java.lang.Math .min ( v8,v6 );
v5 = java.lang.Math .max ( v5,v6 );
v6 = this.c;
/* sub-int v3, v7, v3 */
v8 = /* invoke-virtual/range {p2 ..p2}, Landroid/view/View;->getTop()I */
v2 = /* invoke-virtual/range {p2 ..p2}, Landroid/view/View;->getBottom()I */
(( android.graphics.drawable.Drawable ) v6 ).setBounds ( v3, v8, v7, v2 ); // invoke-virtual {v6, v3, v8, v7, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
v2 = this.c;
/* mul-float v5, v5, v4 */
/* float-to-int v3, v5 */
(( android.graphics.drawable.Drawable ) v2 ).setAlpha ( v3 ); // invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
v2 = this.c;
} // :cond_7
} // :goto_5
} // .end method
protected android.view.ViewGroup$LayoutParams generateDefaultLayoutParams ( ) {
/* .locals 1 */
/* new-instance v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
/* invoke-direct {v0}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>()V */
} // .end method
public android.view.ViewGroup$LayoutParams generateLayoutParams ( android.util.AttributeSet p0 ) {
/* .locals 2 */
/* new-instance v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
(( android.support.v4.widget.DrawerLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1, p1}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
protected android.view.ViewGroup$LayoutParams generateLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 1 */
/* instance-of v0, p1, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
/* check-cast p1, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
/* invoke-direct {v0, p1}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>(Landroid/support/v4/widget/DrawerLayout$LayoutParams;)V */
} // :cond_0
/* instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* new-instance v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
/* check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams; */
/* invoke-direct {v0, p1}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V */
} // :cond_1
/* new-instance v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
/* invoke-direct {v0, p1}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
} // .end method
public Float getDrawerElevation ( ) {
/* .locals 1 */
/* sget-boolean v0, Landroid/support/v4/widget/DrawerLayout;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Landroid/support/v4/widget/DrawerLayout;->a:F */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public android.graphics.drawable.Drawable getStatusBarBackgroundDrawable ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
protected void onAttachedToWindow ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->e:Z */
return;
} // .end method
protected void onDetachedFromWindow ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->e:Z */
return;
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 4 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V */
/* iget-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->g:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
/* const/16 v1, 0x15 */
int v2 = 0; // const/4 v2, 0x0
/* if-lt v0, v1, :cond_0 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Landroid/view/WindowInsets; */
v0 = (( android.view.WindowInsets ) v0 ).getSystemWindowInsetTop ( ); // invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-lez v0, :cond_1 */
v1 = this.a;
v3 = (( android.support.v4.widget.DrawerLayout ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
(( android.graphics.drawable.Drawable ) v1 ).setBounds ( v2, v2, v3, v0 ); // invoke-virtual {v1, v2, v2, v3, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
v0 = this.a;
(( android.graphics.drawable.Drawable ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
} // :cond_1
return;
} // .end method
public Boolean onInterceptTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 8 */
v0 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
v1 = this.a;
v1 = (( fq ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lfq;->a(Landroid/view/MotionEvent;)Z
v2 = this.b;
v2 = (( fq ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Lfq;->a(Landroid/view/MotionEvent;)Z
/* or-int/2addr v1, v2 */
int v2 = 1; // const/4 v2, 0x1
int v3 = 0; // const/4 v3, 0x0
/* packed-switch v0, :pswitch_data_0 */
/* goto/16 :goto_4 */
/* :pswitch_0 */
p1 = this.a;
v0 = this.a;
/* array-length v0, v0 */
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v4, v0, :cond_2 */
v5 = (( fq ) p1 ).a ( v4 ); // invoke-virtual {p1, v4}, Lfq;->a(I)Z
if ( v5 != null) { // if-eqz v5, :cond_0
v5 = this.c;
/* aget v5, v5, v4 */
v6 = this.a;
/* aget v6, v6, v4 */
/* sub-float/2addr v5, v6 */
v6 = this.d;
/* aget v6, v6, v4 */
v7 = this.b;
/* aget v7, v7, v4 */
/* sub-float/2addr v6, v7 */
/* mul-float v5, v5, v5 */
/* mul-float v6, v6, v6 */
/* add-float/2addr v5, v6 */
/* iget v6, p1, Lfq;->b:I */
/* iget v7, p1, Lfq;->b:I */
/* mul-int v6, v6, v7 */
/* int-to-float v6, v6 */
/* cmpl-float v5, v5, v6 */
/* if-lez v5, :cond_0 */
int v5 = 1; // const/4 v5, 0x1
} // :cond_0
int v5 = 0; // const/4 v5, 0x0
} // :goto_1
if ( v5 != null) { // if-eqz v5, :cond_1
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
} // :goto_2
if ( p1 != null) { // if-eqz p1, :cond_4
p1 = this.a;
(( android.support.v4.widget.DrawerLayout$e ) p1 ).a ( ); // invoke-virtual {p1}, Landroid/support/v4/widget/DrawerLayout$e;->a()V
p1 = this.b;
(( android.support.v4.widget.DrawerLayout$e ) p1 ).a ( ); // invoke-virtual {p1}, Landroid/support/v4/widget/DrawerLayout$e;->a()V
/* :pswitch_1 */
/* invoke-direct {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->a(Z)V */
/* iput-boolean v3, p0, Landroid/support/v4/widget/DrawerLayout;->f:Z */
/* iput-boolean v3, p0, Landroid/support/v4/widget/DrawerLayout;->b:Z */
/* :pswitch_2 */
v0 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
p1 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* iput v0, p0, Landroid/support/v4/widget/DrawerLayout;->c:F */
/* iput p1, p0, Landroid/support/v4/widget/DrawerLayout;->d:F */
/* iget v4, p0, Landroid/support/v4/widget/DrawerLayout;->b:F */
int v5 = 0; // const/4 v5, 0x0
/* cmpl-float v4, v4, v5 */
/* if-lez v4, :cond_3 */
v4 = this.a;
/* float-to-int v0, v0 */
/* float-to-int p1, p1 */
(( fq ) v4 ).a ( v0, p1 ); // invoke-virtual {v4, v0, p1}, Lfq;->a(II)Landroid/view/View;
if ( p1 != null) { // if-eqz p1, :cond_3
p1 = android.support.v4.widget.DrawerLayout .c ( p1 );
if ( p1 != null) { // if-eqz p1, :cond_3
int p1 = 1; // const/4 p1, 0x1
} // :cond_3
int p1 = 0; // const/4 p1, 0x0
} // :goto_3
/* iput-boolean v3, p0, Landroid/support/v4/widget/DrawerLayout;->f:Z */
/* iput-boolean v3, p0, Landroid/support/v4/widget/DrawerLayout;->b:Z */
} // :cond_4
} // :goto_4
int p1 = 0; // const/4 p1, 0x0
} // :goto_5
/* if-nez v1, :cond_8 */
/* if-nez p1, :cond_8 */
p1 = (( android.support.v4.widget.DrawerLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
int v0 = 0; // const/4 v0, 0x0
} // :goto_6
/* if-ge v0, p1, :cond_6 */
(( android.support.v4.widget.DrawerLayout ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
/* iget-boolean v1, v1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:Z */
if ( v1 != null) { // if-eqz v1, :cond_5
int p1 = 1; // const/4 p1, 0x1
} // :cond_5
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_6
int p1 = 0; // const/4 p1, 0x0
} // :goto_7
/* if-nez p1, :cond_8 */
/* iget-boolean p1, p0, Landroid/support/v4/widget/DrawerLayout;->b:Z */
if ( p1 != null) { // if-eqz p1, :cond_7
} // :cond_7
} // :cond_8
} // :goto_8
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 2 */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_1 */
(( android.support.v4.widget.DrawerLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->a()Landroid/view/View;
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
(( android.view.KeyEvent ) p2 ).startTracking ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->startTracking()V
} // :cond_1
p1 = /* invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
public Boolean onKeyUp ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_2 */
(( android.support.v4.widget.DrawerLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->a()Landroid/view/View;
int p2 = 0; // const/4 p2, 0x0
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = (( android.support.v4.widget.DrawerLayout ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;)I
/* if-nez v0, :cond_0 */
/* invoke-direct {p0, p2}, Landroid/support/v4/widget/DrawerLayout;->a(Z)V */
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_1
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
} // :cond_2
p1 = /* invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onKeyUp(ILandroid/view/KeyEvent;)Z */
} // .end method
protected void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 16 */
/* move-object/from16 v0, p0 */
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, v0, Landroid/support/v4/widget/DrawerLayout;->d:Z */
/* sub-int v2, p4, p2 */
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I */
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
/* if-ge v5, v3, :cond_a */
(( android.support.v4.widget.DrawerLayout ) v0 ).getChildAt ( v5 ); // invoke-virtual {v0, v5}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
v7 = (( android.view.View ) v6 ).getVisibility ( ); // invoke-virtual {v6}, Landroid/view/View;->getVisibility()I
/* const/16 v8, 0x8 */
/* if-eq v7, v8, :cond_9 */
(( android.view.View ) v6 ).getLayoutParams ( ); // invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v7, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
v8 = android.support.v4.widget.DrawerLayout .c ( v6 );
if ( v8 != null) { // if-eqz v8, :cond_0
/* iget v8, v7, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->leftMargin:I */
/* iget v9, v7, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I */
/* iget v10, v7, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->leftMargin:I */
v11 = (( android.view.View ) v6 ).getMeasuredWidth ( ); // invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I
/* add-int/2addr v10, v11 */
/* iget v7, v7, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I */
v11 = (( android.view.View ) v6 ).getMeasuredHeight ( ); // invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v7, v11 */
(( android.view.View ) v6 ).layout ( v8, v9, v10, v7 ); // invoke-virtual {v6, v8, v9, v10, v7}, Landroid/view/View;->layout(IIII)V
/* goto/16 :goto_6 */
} // :cond_0
v8 = (( android.view.View ) v6 ).getMeasuredWidth ( ); // invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I
v9 = (( android.view.View ) v6 ).getMeasuredHeight ( ); // invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I
int v10 = 3; // const/4 v10, 0x3
v10 = (( android.support.v4.widget.DrawerLayout ) v0 ).a ( v6, v10 ); // invoke-virtual {v0, v6, v10}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;I)Z
if ( v10 != null) { // if-eqz v10, :cond_1
/* neg-int v10, v8 */
/* int-to-float v11, v8 */
/* iget v12, v7, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:F */
/* mul-float v12, v12, v11 */
/* float-to-int v12, v12 */
/* add-int/2addr v10, v12 */
/* add-int v12, v8, v10 */
/* int-to-float v12, v12 */
/* div-float/2addr v12, v11 */
} // :cond_1
/* int-to-float v10, v8 */
/* iget v11, v7, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:F */
/* mul-float v11, v11, v10 */
/* float-to-int v11, v11 */
/* sub-int v11, v2, v11 */
/* sub-int v12, v2, v11 */
/* int-to-float v12, v12 */
/* div-float/2addr v12, v10 */
/* move v10, v11 */
} // :goto_1
/* iget v11, v7, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:F */
/* cmpl-float v11, v12, v11 */
if ( v11 != null) { // if-eqz v11, :cond_2
int v11 = 1; // const/4 v11, 0x1
} // :cond_2
int v11 = 0; // const/4 v11, 0x0
} // :goto_2
/* iget v13, v7, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:I */
/* and-int/lit8 v13, v13, 0x70 */
/* const/16 v14, 0x10 */
/* if-eq v13, v14, :cond_4 */
/* const/16 v14, 0x50 */
/* if-eq v13, v14, :cond_3 */
/* iget v13, v7, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v8, v10 */
/* iget v14, v7, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v14, v9 */
(( android.view.View ) v6 ).layout ( v10, v13, v8, v14 ); // invoke-virtual {v6, v10, v13, v8, v14}, Landroid/view/View;->layout(IIII)V
} // :cond_3
/* sub-int v9, p5, p3 */
/* iget v13, v7, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I */
/* sub-int v13, v9, v13 */
v14 = (( android.view.View ) v6 ).getMeasuredHeight ( ); // invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I
/* sub-int/2addr v13, v14 */
/* add-int/2addr v8, v10 */
/* iget v14, v7, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I */
/* sub-int/2addr v9, v14 */
(( android.view.View ) v6 ).layout ( v10, v13, v8, v9 ); // invoke-virtual {v6, v10, v13, v8, v9}, Landroid/view/View;->layout(IIII)V
} // :cond_4
/* sub-int v13, p5, p3 */
/* sub-int v14, v13, v9 */
/* div-int/lit8 v14, v14, 0x2 */
/* iget v15, v7, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I */
/* if-ge v14, v15, :cond_5 */
/* iget v14, v7, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I */
} // :cond_5
/* add-int v15, v14, v9 */
/* iget v1, v7, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I */
/* sub-int v1, v13, v1 */
/* if-le v15, v1, :cond_6 */
/* iget v1, v7, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I */
/* sub-int/2addr v13, v1 */
/* sub-int v14, v13, v9 */
} // :cond_6
} // :goto_3
/* add-int/2addr v8, v10 */
/* add-int/2addr v9, v14 */
(( android.view.View ) v6 ).layout ( v10, v14, v8, v9 ); // invoke-virtual {v6, v10, v14, v8, v9}, Landroid/view/View;->layout(IIII)V
} // :goto_4
if ( v11 != null) { // if-eqz v11, :cond_7
(( android.support.v4.widget.DrawerLayout ) v0 ).a ( v6, v12 ); // invoke-virtual {v0, v6, v12}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;F)V
} // :cond_7
/* iget v1, v7, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:F */
int v7 = 0; // const/4 v7, 0x0
/* cmpl-float v1, v1, v7 */
/* if-lez v1, :cond_8 */
int v1 = 0; // const/4 v1, 0x0
} // :cond_8
int v1 = 4; // const/4 v1, 0x4
} // :goto_5
v7 = (( android.view.View ) v6 ).getVisibility ( ); // invoke-virtual {v6}, Landroid/view/View;->getVisibility()I
/* if-eq v7, v1, :cond_9 */
(( android.view.View ) v6 ).setVisibility ( v1 ); // invoke-virtual {v6, v1}, Landroid/view/View;->setVisibility(I)V
} // :cond_9
} // :goto_6
/* add-int/lit8 v5, v5, 0x1 */
int v1 = 1; // const/4 v1, 0x1
/* goto/16 :goto_0 */
} // :cond_a
/* iput-boolean v4, v0, Landroid/support/v4/widget/DrawerLayout;->d:Z */
/* iput-boolean v4, v0, Landroid/support/v4/widget/DrawerLayout;->e:Z */
return;
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 17 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "WrongConstant" */
/* } */
} // .end annotation
/* move-object/from16 v0, p0 */
v1 = /* invoke-static/range {p1 ..p1}, Landroid/view/View$MeasureSpec;->getMode(I)I */
v2 = /* invoke-static/range {p2 ..p2}, Landroid/view/View$MeasureSpec;->getMode(I)I */
v3 = /* invoke-static/range {p1 ..p1}, Landroid/view/View$MeasureSpec;->getSize(I)I */
v4 = /* invoke-static/range {p2 ..p2}, Landroid/view/View$MeasureSpec;->getSize(I)I */
/* const/16 v5, 0x12c */
/* const/high16 v6, 0x40000000 # 2.0f */
/* if-ne v1, v6, :cond_0 */
/* if-eq v2, v6, :cond_2 */
} // :cond_0
v7 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/DrawerLayout;->isInEditMode()Z */
if ( v7 != null) { // if-eqz v7, :cond_16
/* const/high16 v7, -0x80000000 */
/* if-eq v1, v7, :cond_1 */
/* if-nez v1, :cond_1 */
/* const/16 v3, 0x12c */
} // :cond_1
/* if-eq v2, v7, :cond_2 */
/* if-nez v2, :cond_2 */
/* const/16 v4, 0x12c */
} // :cond_2
(( android.support.v4.widget.DrawerLayout ) v0 ).setMeasuredDimension ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Landroid/support/v4/widget/DrawerLayout;->setMeasuredDimension(II)V
v1 = this.a;
int v5 = 0; // const/4 v5, 0x0
if ( v1 != null) { // if-eqz v1, :cond_3
v1 = /* invoke-static/range {p0 ..p0}, Lem;->a(Landroid/view/View;)Z */
if ( v1 != null) { // if-eqz v1, :cond_3
int v1 = 1; // const/4 v1, 0x1
} // :cond_3
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
v7 = /* invoke-static/range {p0 ..p0}, Lem;->b(Landroid/view/View;)I */
v8 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I */
int v9 = 0; // const/4 v9, 0x0
int v10 = 0; // const/4 v10, 0x0
int v11 = 0; // const/4 v11, 0x0
} // :goto_1
/* if-ge v9, v8, :cond_15 */
(( android.support.v4.widget.DrawerLayout ) v0 ).getChildAt ( v9 ); // invoke-virtual {v0, v9}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
v13 = (( android.view.View ) v12 ).getVisibility ( ); // invoke-virtual {v12}, Landroid/view/View;->getVisibility()I
/* const/16 v14, 0x8 */
/* if-eq v13, v14, :cond_14 */
(( android.view.View ) v12 ).getLayoutParams ( ); // invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
int v15 = 3; // const/4 v15, 0x3
if ( v1 != null) { // if-eqz v1, :cond_9
/* iget v2, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:I */
v2 = dz .a ( v2,v7 );
v16 = em .a ( v12 );
/* const/16 v6, 0x15 */
if ( v16 != null) { // if-eqz v16, :cond_6
/* if-lt v14, v6, :cond_9 */
v6 = this.a;
/* check-cast v6, Landroid/view/WindowInsets; */
/* if-ne v2, v15, :cond_4 */
v2 = (( android.view.WindowInsets ) v6 ).getSystemWindowInsetLeft ( ); // invoke-virtual {v6}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I
v14 = (( android.view.WindowInsets ) v6 ).getSystemWindowInsetTop ( ); // invoke-virtual {v6}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I
v15 = (( android.view.WindowInsets ) v6 ).getSystemWindowInsetBottom ( ); // invoke-virtual {v6}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I
(( android.view.WindowInsets ) v6 ).replaceSystemWindowInsets ( v2, v14, v5, v15 ); // invoke-virtual {v6, v2, v14, v5, v15}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;
} // :cond_4
int v14 = 5; // const/4 v14, 0x5
/* if-ne v2, v14, :cond_5 */
v2 = (( android.view.WindowInsets ) v6 ).getSystemWindowInsetTop ( ); // invoke-virtual {v6}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I
v14 = (( android.view.WindowInsets ) v6 ).getSystemWindowInsetRight ( ); // invoke-virtual {v6}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I
v15 = (( android.view.WindowInsets ) v6 ).getSystemWindowInsetBottom ( ); // invoke-virtual {v6}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I
(( android.view.WindowInsets ) v6 ).replaceSystemWindowInsets ( v5, v2, v14, v15 ); // invoke-virtual {v6, v5, v2, v14, v15}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;
} // :cond_5
} // :goto_2
(( android.view.View ) v12 ).dispatchApplyWindowInsets ( v6 ); // invoke-virtual {v12, v6}, Landroid/view/View;->dispatchApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
} // :cond_6
/* if-lt v14, v6, :cond_9 */
v6 = this.a;
/* check-cast v6, Landroid/view/WindowInsets; */
int v14 = 3; // const/4 v14, 0x3
/* if-ne v2, v14, :cond_7 */
v2 = (( android.view.WindowInsets ) v6 ).getSystemWindowInsetLeft ( ); // invoke-virtual {v6}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I
v14 = (( android.view.WindowInsets ) v6 ).getSystemWindowInsetTop ( ); // invoke-virtual {v6}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I
v15 = (( android.view.WindowInsets ) v6 ).getSystemWindowInsetBottom ( ); // invoke-virtual {v6}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I
(( android.view.WindowInsets ) v6 ).replaceSystemWindowInsets ( v2, v14, v5, v15 ); // invoke-virtual {v6, v2, v14, v5, v15}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;
} // :cond_7
int v14 = 5; // const/4 v14, 0x5
/* if-ne v2, v14, :cond_8 */
v2 = (( android.view.WindowInsets ) v6 ).getSystemWindowInsetTop ( ); // invoke-virtual {v6}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I
v14 = (( android.view.WindowInsets ) v6 ).getSystemWindowInsetRight ( ); // invoke-virtual {v6}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I
v15 = (( android.view.WindowInsets ) v6 ).getSystemWindowInsetBottom ( ); // invoke-virtual {v6}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I
(( android.view.WindowInsets ) v6 ).replaceSystemWindowInsets ( v5, v2, v14, v15 ); // invoke-virtual {v6, v5, v2, v14, v15}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;
} // :cond_8
} // :goto_3
v2 = (( android.view.WindowInsets ) v6 ).getSystemWindowInsetLeft ( ); // invoke-virtual {v6}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I
/* iput v2, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->leftMargin:I */
v2 = (( android.view.WindowInsets ) v6 ).getSystemWindowInsetTop ( ); // invoke-virtual {v6}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I
/* iput v2, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I */
v2 = (( android.view.WindowInsets ) v6 ).getSystemWindowInsetRight ( ); // invoke-virtual {v6}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I
/* iput v2, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->rightMargin:I */
v2 = (( android.view.WindowInsets ) v6 ).getSystemWindowInsetBottom ( ); // invoke-virtual {v6}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I
/* iput v2, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I */
} // :cond_9
} // :goto_4
v2 = android.support.v4.widget.DrawerLayout .c ( v12 );
if ( v2 != null) { // if-eqz v2, :cond_a
/* iget v2, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->leftMargin:I */
/* sub-int v2, v3, v2 */
/* iget v6, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->rightMargin:I */
/* sub-int/2addr v2, v6 */
/* const/high16 v6, 0x40000000 # 2.0f */
v2 = android.view.View$MeasureSpec .makeMeasureSpec ( v2,v6 );
/* iget v14, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I */
/* sub-int v14, v4, v14 */
/* iget v13, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I */
/* sub-int/2addr v14, v13 */
v13 = android.view.View$MeasureSpec .makeMeasureSpec ( v14,v6 );
(( android.view.View ) v12 ).measure ( v2, v13 ); // invoke-virtual {v12, v2, v13}, Landroid/view/View;->measure(II)V
/* goto/16 :goto_8 */
} // :cond_a
/* const/high16 v6, 0x40000000 # 2.0f */
v2 = android.support.v4.widget.DrawerLayout .a ( v12 );
if ( v2 != null) { // if-eqz v2, :cond_13
/* sget-boolean v2, Landroid/support/v4/widget/DrawerLayout;->c:Z */
if ( v2 != null) { // if-eqz v2, :cond_b
v2 = em .a ( v12 );
/* iget v14, v0, Landroid/support/v4/widget/DrawerLayout;->a:F */
/* cmpl-float v2, v2, v14 */
if ( v2 != null) { // if-eqz v2, :cond_b
em .a ( v12,v14 );
} // :cond_b
v2 = (( android.support.v4.widget.DrawerLayout ) v0 ).b ( v12 ); // invoke-virtual {v0, v12}, Landroid/support/v4/widget/DrawerLayout;->b(Landroid/view/View;)I
/* and-int/lit8 v2, v2, 0x7 */
int v14 = 3; // const/4 v14, 0x3
/* if-ne v2, v14, :cond_c */
int v14 = 1; // const/4 v14, 0x1
} // :cond_c
int v14 = 0; // const/4 v14, 0x0
} // :goto_5
if ( v14 != null) { // if-eqz v14, :cond_d
/* if-nez v10, :cond_e */
} // :cond_d
/* if-nez v14, :cond_11 */
if ( v11 != null) { // if-eqz v11, :cond_11
} // :cond_e
/* new-instance v1, Ljava/lang/IllegalStateException; */
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "Child drawer has absolute gravity "; // const-string v4, "Child drawer has absolute gravity "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* and-int/lit8 v4, v2, 0x3 */
int v5 = 3; // const/4 v5, 0x3
/* if-eq v4, v5, :cond_10 */
/* and-int/lit8 v4, v2, 0x5 */
int v5 = 5; // const/4 v5, 0x5
/* if-ne v4, v5, :cond_f */
final String v2 = "RIGHT"; // const-string v2, "RIGHT"
} // :cond_f
java.lang.Integer .toHexString ( v2 );
} // :cond_10
final String v2 = "LEFT"; // const-string v2, "LEFT"
} // :goto_6
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " but this DrawerLayout already has a drawer view along that edge"; // const-string v2, " but this DrawerLayout already has a drawer view along that edge"
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
} // :cond_11
if ( v14 != null) { // if-eqz v14, :cond_12
int v10 = 1; // const/4 v10, 0x1
} // :cond_12
int v11 = 1; // const/4 v11, 0x1
} // :goto_7
/* iget v2, v0, Landroid/support/v4/widget/DrawerLayout;->b:I */
/* iget v14, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->leftMargin:I */
/* add-int/2addr v2, v14 */
/* iget v14, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->rightMargin:I */
/* add-int/2addr v2, v14 */
/* iget v14, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->width:I */
/* move/from16 v15, p1 */
v2 = android.support.v4.widget.DrawerLayout .getChildMeasureSpec ( v15,v2,v14 );
/* iget v14, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I */
/* iget v5, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v14, v5 */
/* iget v5, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->height:I */
/* move/from16 v13, p2 */
v5 = android.support.v4.widget.DrawerLayout .getChildMeasureSpec ( v13,v14,v5 );
(( android.view.View ) v12 ).measure ( v2, v5 ); // invoke-virtual {v12, v2, v5}, Landroid/view/View;->measure(II)V
} // :cond_13
/* new-instance v1, Ljava/lang/IllegalStateException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "Child "; // const-string v3, "Child "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v12 ); // invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v3 = " at index "; // const-string v3, " at index "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v9 ); // invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v3 = " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY"; // const-string v3, " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
} // :cond_14
} // :goto_8
/* move/from16 v15, p1 */
/* move/from16 v13, p2 */
} // :goto_9
/* add-int/lit8 v9, v9, 0x1 */
int v5 = 0; // const/4 v5, 0x0
/* goto/16 :goto_1 */
} // :cond_15
return;
} // :cond_16
/* new-instance v1, Ljava/lang/IllegalArgumentException; */
final String v2 = "DrawerLayout must be measured with MeasureSpec.EXACTLY."; // const-string v2, "DrawerLayout must be measured with MeasureSpec.EXACTLY."
/* invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
return;
} // .end method
protected void onRestoreInstanceState ( android.os.Parcelable p0 ) {
/* .locals 3 */
/* instance-of v0, p1, Landroid/support/v4/widget/DrawerLayout$d; */
/* if-nez v0, :cond_0 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
return;
} // :cond_0
/* check-cast p1, Landroid/support/v4/widget/DrawerLayout$d; */
v0 = this.a;
/* invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
/* iget v0, p1, Landroid/support/v4/widget/DrawerLayout$d;->a:I */
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget v0, p1, Landroid/support/v4/widget/DrawerLayout$d;->a:I */
(( android.support.v4.widget.DrawerLayout ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->a(I)Landroid/view/View;
if ( v0 != null) { // if-eqz v0, :cond_1
/* invoke-direct {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->b(Landroid/view/View;)V */
} // :cond_1
/* iget v0, p1, Landroid/support/v4/widget/DrawerLayout$d;->b:I */
int v1 = 3; // const/4 v1, 0x3
/* if-eq v0, v1, :cond_2 */
/* iget v0, p1, Landroid/support/v4/widget/DrawerLayout$d;->b:I */
(( android.support.v4.widget.DrawerLayout ) p0 ).setDrawerLockMode ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(II)V
} // :cond_2
/* iget v0, p1, Landroid/support/v4/widget/DrawerLayout$d;->c:I */
/* if-eq v0, v1, :cond_3 */
/* iget v0, p1, Landroid/support/v4/widget/DrawerLayout$d;->c:I */
int v2 = 5; // const/4 v2, 0x5
(( android.support.v4.widget.DrawerLayout ) p0 ).setDrawerLockMode ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(II)V
} // :cond_3
/* iget v0, p1, Landroid/support/v4/widget/DrawerLayout$d;->d:I */
/* if-eq v0, v1, :cond_4 */
/* iget v0, p1, Landroid/support/v4/widget/DrawerLayout$d;->d:I */
/* const v2, 0x800003 */
(( android.support.v4.widget.DrawerLayout ) p0 ).setDrawerLockMode ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(II)V
} // :cond_4
/* iget v0, p1, Landroid/support/v4/widget/DrawerLayout$d;->e:I */
/* if-eq v0, v1, :cond_5 */
/* iget p1, p1, Landroid/support/v4/widget/DrawerLayout$d;->e:I */
/* const v0, 0x800005 */
(( android.support.v4.widget.DrawerLayout ) p0 ).setDrawerLockMode ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(II)V
} // :cond_5
return;
} // .end method
public void onRtlPropertiesChanged ( Integer p0 ) {
/* .locals 0 */
/* invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->a()V */
return;
} // .end method
protected android.os.Parcelable onSaveInstanceState ( ) {
/* .locals 9 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable; */
/* new-instance v1, Landroid/support/v4/widget/DrawerLayout$d; */
/* invoke-direct {v1, v0}, Landroid/support/v4/widget/DrawerLayout$d;-><init>(Landroid/os/Parcelable;)V */
v0 = (( android.support.v4.widget.DrawerLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v0, :cond_4 */
(( android.support.v4.widget.DrawerLayout ) p0 ).getChildAt ( v3 ); // invoke-virtual {p0, v3}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v4, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
/* iget v5, v4, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->b:I */
int v6 = 1; // const/4 v6, 0x1
/* if-ne v5, v6, :cond_0 */
int v5 = 1; // const/4 v5, 0x1
} // :cond_0
int v5 = 0; // const/4 v5, 0x0
} // :goto_1
/* iget v7, v4, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->b:I */
int v8 = 2; // const/4 v8, 0x2
/* if-ne v7, v8, :cond_1 */
} // :cond_1
int v6 = 0; // const/4 v6, 0x0
} // :goto_2
/* if-nez v5, :cond_3 */
if ( v6 != null) { // if-eqz v6, :cond_2
} // :cond_2
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_3
} // :goto_3
/* iget v0, v4, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:I */
/* iput v0, v1, Landroid/support/v4/widget/DrawerLayout$d;->a:I */
} // :cond_4
/* iget v0, p0, Landroid/support/v4/widget/DrawerLayout;->d:I */
/* iput v0, v1, Landroid/support/v4/widget/DrawerLayout$d;->b:I */
/* iget v0, p0, Landroid/support/v4/widget/DrawerLayout;->e:I */
/* iput v0, v1, Landroid/support/v4/widget/DrawerLayout$d;->c:I */
/* iget v0, p0, Landroid/support/v4/widget/DrawerLayout;->f:I */
/* iput v0, v1, Landroid/support/v4/widget/DrawerLayout$d;->d:I */
/* iget v0, p0, Landroid/support/v4/widget/DrawerLayout;->g:I */
/* iput v0, v1, Landroid/support/v4/widget/DrawerLayout$d;->e:I */
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 6 */
v0 = this.a;
(( fq ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lfq;->a(Landroid/view/MotionEvent;)V
v0 = this.b;
(( fq ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lfq;->a(Landroid/view/MotionEvent;)V
v0 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
/* and-int/lit16 v0, v0, 0xff */
int v1 = 3; // const/4 v1, 0x3
int v2 = 1; // const/4 v2, 0x1
int v3 = 0; // const/4 v3, 0x0
/* if-eq v0, v1, :cond_2 */
/* packed-switch v0, :pswitch_data_0 */
/* :pswitch_0 */
v0 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
p1 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
v1 = this.a;
/* float-to-int v4, v0 */
/* float-to-int v5, p1 */
(( fq ) v1 ).a ( v4, v5 ); // invoke-virtual {v1, v4, v5}, Lfq;->a(II)Landroid/view/View;
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = android.support.v4.widget.DrawerLayout .c ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_1
/* iget v1, p0, Landroid/support/v4/widget/DrawerLayout;->c:F */
/* sub-float/2addr v0, v1 */
/* iget v1, p0, Landroid/support/v4/widget/DrawerLayout;->d:F */
/* sub-float/2addr p1, v1 */
v1 = this.a;
/* iget v1, v1, Lfq;->b:I */
/* mul-float v0, v0, v0 */
/* mul-float p1, p1, p1 */
/* add-float/2addr v0, p1 */
/* mul-int v1, v1, v1 */
/* int-to-float p1, v1 */
/* cmpg-float p1, v0, p1 */
/* if-gez p1, :cond_1 */
/* invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->b()Landroid/view/View; */
if ( p1 != null) { // if-eqz p1, :cond_1
p1 = (( android.support.v4.widget.DrawerLayout ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;)I
int v0 = 2; // const/4 v0, 0x2
/* if-ne p1, v0, :cond_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
/* invoke-direct {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->a(Z)V */
/* iput-boolean v3, p0, Landroid/support/v4/widget/DrawerLayout;->f:Z */
/* :pswitch_1 */
v0 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
p1 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* iput v0, p0, Landroid/support/v4/widget/DrawerLayout;->c:F */
/* iput p1, p0, Landroid/support/v4/widget/DrawerLayout;->d:F */
} // :goto_2
/* iput-boolean v3, p0, Landroid/support/v4/widget/DrawerLayout;->f:Z */
/* iput-boolean v3, p0, Landroid/support/v4/widget/DrawerLayout;->b:Z */
} // :cond_2
/* invoke-direct {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->a(Z)V */
} // :goto_3
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public void requestDisallowInterceptTouchEvent ( Boolean p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V */
/* iput-boolean p1, p0, Landroid/support/v4/widget/DrawerLayout;->f:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
/* invoke-direct {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->a(Z)V */
} // :cond_0
return;
} // .end method
public void requestLayout ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->d:Z */
/* if-nez v0, :cond_0 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V */
} // :cond_0
return;
} // .end method
public void setChildInsets ( java.lang.Object p0, Boolean p1 ) {
/* .locals 0 */
this.a = p1;
/* iput-boolean p2, p0, Landroid/support/v4/widget/DrawerLayout;->g:Z */
/* if-nez p2, :cond_0 */
(( android.support.v4.widget.DrawerLayout ) p0 ).getBackground ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getBackground()Landroid/graphics/drawable/Drawable;
/* if-nez p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
(( android.support.v4.widget.DrawerLayout ) p0 ).setWillNotDraw ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->setWillNotDraw(Z)V
(( android.support.v4.widget.DrawerLayout ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->requestLayout()V
return;
} // .end method
public void setDrawerElevation ( Float p0 ) {
/* .locals 2 */
/* iput p1, p0, Landroid/support/v4/widget/DrawerLayout;->a:F */
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
v0 = (( android.support.v4.widget.DrawerLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
/* if-ge p1, v0, :cond_1 */
(( android.support.v4.widget.DrawerLayout ) p0 ).getChildAt ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
v1 = android.support.v4.widget.DrawerLayout .a ( v0 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* iget v1, p0, Landroid/support/v4/widget/DrawerLayout;->a:F */
em .a ( v0,v1 );
} // :cond_0
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_1
return;
} // .end method
public void setDrawerListener ( android.support.v4.widget.DrawerLayout$c p0 ) {
/* .locals 2 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_2
if ( p1 != null) { // if-eqz p1, :cond_2
v0 = this.a;
/* if-nez v0, :cond_1 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.a = v0;
} // :cond_1
v0 = this.a;
} // :cond_2
this.a = p1;
return;
} // .end method
public void setDrawerLockMode ( Integer p0 ) {
/* .locals 1 */
int v0 = 3; // const/4 v0, 0x3
(( android.support.v4.widget.DrawerLayout ) p0 ).setDrawerLockMode ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(II)V
int v0 = 5; // const/4 v0, 0x5
(( android.support.v4.widget.DrawerLayout ) p0 ).setDrawerLockMode ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(II)V
return;
} // .end method
public void setDrawerLockMode ( Integer p0, Integer p1 ) {
/* .locals 3 */
v0 = em .b ( p0 );
v0 = dz .a ( p2,v0 );
int v1 = 3; // const/4 v1, 0x3
/* if-eq p2, v1, :cond_3 */
int v2 = 5; // const/4 v2, 0x5
/* if-eq p2, v2, :cond_2 */
/* const v2, 0x800003 */
/* if-eq p2, v2, :cond_1 */
/* const v2, 0x800005 */
/* if-eq p2, v2, :cond_0 */
} // :cond_0
/* iput p1, p0, Landroid/support/v4/widget/DrawerLayout;->g:I */
} // :cond_1
/* iput p1, p0, Landroid/support/v4/widget/DrawerLayout;->f:I */
} // :cond_2
/* iput p1, p0, Landroid/support/v4/widget/DrawerLayout;->e:I */
} // :cond_3
/* iput p1, p0, Landroid/support/v4/widget/DrawerLayout;->d:I */
} // :goto_0
if ( p1 != null) { // if-eqz p1, :cond_5
/* if-ne v0, v1, :cond_4 */
p2 = this.a;
} // :cond_4
p2 = this.b;
} // :goto_1
(( fq ) p2 ).a ( ); // invoke-virtual {p2}, Lfq;->a()V
} // :cond_5
/* packed-switch p1, :pswitch_data_0 */
/* :pswitch_0 */
(( android.support.v4.widget.DrawerLayout ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->a(I)Landroid/view/View;
if ( p1 != null) { // if-eqz p1, :cond_6
/* invoke-direct {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->b(Landroid/view/View;)V */
return;
/* :pswitch_1 */
(( android.support.v4.widget.DrawerLayout ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->a(I)Landroid/view/View;
if ( p1 != null) { // if-eqz p1, :cond_6
(( android.support.v4.widget.DrawerLayout ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;)V
} // :cond_6
} // :goto_2
return;
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public void setDrawerLockMode ( Integer p0, android.view.View p1 ) {
/* .locals 2 */
v0 = android.support.v4.widget.DrawerLayout .a ( p2 );
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.view.View ) p2 ).getLayoutParams ( ); // invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p2, Landroid/support/v4/widget/DrawerLayout$LayoutParams; */
/* iget p2, p2, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:I */
(( android.support.v4.widget.DrawerLayout ) p0 ).setDrawerLockMode ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(II)V
return;
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "View "; // const-string v1, "View "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p2 = " is not a drawer with appropriate layout_gravity"; // const-string p2, " is not a drawer with appropriate layout_gravity"
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void setDrawerShadow ( Integer p0, Integer p1 ) {
/* .locals 1 */
(( android.support.v4.widget.DrawerLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getContext()Landroid/content/Context;
ce .a ( v0,p1 );
(( android.support.v4.widget.DrawerLayout ) p0 ).setDrawerShadow ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/support/v4/widget/DrawerLayout;->setDrawerShadow(Landroid/graphics/drawable/Drawable;I)V
return;
} // .end method
public void setDrawerShadow ( android.graphics.drawable.Drawable p0, Integer p1 ) {
/* .locals 2 */
/* sget-boolean v0, Landroid/support/v4/widget/DrawerLayout;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
} // :cond_0
/* const v0, 0x800003 */
/* and-int v1, p2, v0 */
/* if-ne v1, v0, :cond_1 */
this.d = p1;
} // :cond_1
/* const v0, 0x800005 */
/* and-int v1, p2, v0 */
/* if-ne v1, v0, :cond_2 */
this.e = p1;
} // :cond_2
/* and-int/lit8 v0, p2, 0x3 */
int v1 = 3; // const/4 v1, 0x3
/* if-ne v0, v1, :cond_3 */
this.f = p1;
} // :cond_3
int v0 = 5; // const/4 v0, 0x5
/* and-int/2addr p2, v0 */
/* if-ne p2, v0, :cond_4 */
this.g = p1;
} // :goto_0
/* invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->a()V */
(( android.support.v4.widget.DrawerLayout ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
} // :cond_4
return;
} // .end method
public void setDrawerTitle ( Integer p0, java.lang.CharSequence p1 ) {
/* .locals 1 */
v0 = em .b ( p0 );
p1 = dz .a ( p1,v0 );
int v0 = 3; // const/4 v0, 0x3
/* if-ne p1, v0, :cond_0 */
this.a = p2;
return;
} // :cond_0
int v0 = 5; // const/4 v0, 0x5
/* if-ne p1, v0, :cond_1 */
this.b = p2;
} // :cond_1
return;
} // .end method
public void setScrimColor ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v4/widget/DrawerLayout;->c:I */
(( android.support.v4.widget.DrawerLayout ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
return;
} // .end method
public void setStatusBarBackground ( Integer p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
(( android.support.v4.widget.DrawerLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getContext()Landroid/content/Context;
ce .a ( v0,p1 );
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
this.a = p1;
(( android.support.v4.widget.DrawerLayout ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
return;
} // .end method
public void setStatusBarBackground ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
this.a = p1;
(( android.support.v4.widget.DrawerLayout ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
return;
} // .end method
public void setStatusBarBackgroundColor ( Integer p0 ) {
/* .locals 1 */
/* new-instance v0, Landroid/graphics/drawable/ColorDrawable; */
/* invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V */
this.a = v0;
(( android.support.v4.widget.DrawerLayout ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
return;
} // .end method
