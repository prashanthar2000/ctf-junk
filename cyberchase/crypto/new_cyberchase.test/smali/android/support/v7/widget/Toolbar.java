public class android.support.v7.widget.Toolbar extends android.view.ViewGroup {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/v7/widget/Toolbar$a;, */
	 /* Landroid/support/v7/widget/Toolbar$c;, */
	 /* Landroid/support/v7/widget/Toolbar$LayoutParams;, */
	 /* Landroid/support/v7/widget/Toolbar$b; */
	 /* } */
} // .end annotation
/* # instance fields */
Integer a;
private android.content.Context a;
android.graphics.drawable.Drawable a;
private final android.support.v7.widget.ActionMenuView$d a;
public android.support.v7.widget.ActionMenuView a;
public android.support.v7.widget.Toolbar$a a;
android.support.v7.widget.Toolbar$b a;
android.view.View a;
android.widget.ImageButton a;
private android.widget.ImageView a;
private android.widget.TextView a;
private gz$a a;
private hg$a a;
private hq a;
private ij a;
private iq a;
java.lang.CharSequence a;
private final java.lang.Runnable a;
final java.util.ArrayList a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private Boolean a;
private final a;
private Integer b;
private android.widget.ImageButton b;
private android.widget.TextView b;
private java.lang.CharSequence b;
private final java.util.ArrayList b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private Boolean b;
private Integer c;
private java.lang.CharSequence c;
private Boolean c;
private Integer d;
private Integer e;
private Integer f;
private Integer g;
private Integer h;
private Integer i;
private Integer j;
private Integer k;
private Integer l;
private Integer m;
private Integer n;
/* # direct methods */
public android.support.v7.widget.Toolbar ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/Toolbar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
return;
} // .end method
public android.support.v7.widget.Toolbar ( ) {
/* .locals 1 */
/* invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/Toolbar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
return;
} // .end method
public android.support.v7.widget.Toolbar ( ) {
/* .locals 6 */
/* invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
/* const p1, 0x800013 */
/* iput p1, p0, Landroid/support/v7/widget/Toolbar;->l:I */
/* new-instance p1, Ljava/util/ArrayList; */
/* invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V */
this.b = p1;
/* new-instance p1, Ljava/util/ArrayList; */
/* invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V */
this.a = p1;
int p1 = 2; // const/4 p1, 0x2
/* new-array p1, p1, [I */
this.a = p1;
/* new-instance p1, Landroid/support/v7/widget/Toolbar$1; */
/* invoke-direct {p1, p0}, Landroid/support/v7/widget/Toolbar$1;-><init>(Landroid/support/v7/widget/Toolbar;)V */
this.a = p1;
/* new-instance p1, Landroid/support/v7/widget/Toolbar$2; */
/* invoke-direct {p1, p0}, Landroid/support/v7/widget/Toolbar$2;-><init>(Landroid/support/v7/widget/Toolbar;)V */
this.a = p1;
(( android.support.v7.widget.Toolbar ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;
v0 = gc$j.Toolbar;
int v1 = 0; // const/4 v1, 0x0
ip .a ( p1,p2,v0,p3,v1 );
p2 = (( ip ) p1 ).g ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lip;->g(II)I
/* iput p2, p0, Landroid/support/v7/widget/Toolbar;->c:I */
p2 = (( ip ) p1 ).g ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lip;->g(II)I
/* iput p2, p0, Landroid/support/v7/widget/Toolbar;->d:I */
/* iget p3, p0, Landroid/support/v7/widget/Toolbar;->l:I */
p2 = (( ip ) p1 ).c ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lip;->c(II)I
/* iput p2, p0, Landroid/support/v7/widget/Toolbar;->l:I */
/* const/16 p3, 0x30 */
p2 = (( ip ) p1 ).c ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lip;->c(II)I
/* iput p2, p0, Landroid/support/v7/widget/Toolbar;->a:I */
p2 = (( ip ) p1 ).d ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lip;->d(II)I
p3 = (( ip ) p1 ).a ( p3 ); // invoke-virtual {p1, p3}, Lip;->a(I)Z
if ( p3 != null) { // if-eqz p3, :cond_0
p2 = (( ip ) p1 ).d ( p3, p2 ); // invoke-virtual {p1, p3, p2}, Lip;->d(II)I
} // :cond_0
/* iput p2, p0, Landroid/support/v7/widget/Toolbar;->i:I */
/* iput p2, p0, Landroid/support/v7/widget/Toolbar;->h:I */
/* iput p2, p0, Landroid/support/v7/widget/Toolbar;->g:I */
/* iput p2, p0, Landroid/support/v7/widget/Toolbar;->f:I */
int p3 = -1; // const/4 p3, -0x1
p2 = (( ip ) p1 ).d ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lip;->d(II)I
/* if-ltz p2, :cond_1 */
/* iput p2, p0, Landroid/support/v7/widget/Toolbar;->f:I */
} // :cond_1
p2 = (( ip ) p1 ).d ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lip;->d(II)I
/* if-ltz p2, :cond_2 */
/* iput p2, p0, Landroid/support/v7/widget/Toolbar;->g:I */
} // :cond_2
p2 = (( ip ) p1 ).d ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lip;->d(II)I
/* if-ltz p2, :cond_3 */
/* iput p2, p0, Landroid/support/v7/widget/Toolbar;->h:I */
} // :cond_3
p2 = (( ip ) p1 ).d ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lip;->d(II)I
/* if-ltz p2, :cond_4 */
/* iput p2, p0, Landroid/support/v7/widget/Toolbar;->i:I */
} // :cond_4
p2 = (( ip ) p1 ).e ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lip;->e(II)I
/* iput p2, p0, Landroid/support/v7/widget/Toolbar;->e:I */
/* const/high16 v0, -0x80000000 */
p2 = (( ip ) p1 ).d ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Lip;->d(II)I
v2 = (( ip ) p1 ).d ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Lip;->d(II)I
v3 = (( ip ) p1 ).e ( v3, v1 ); // invoke-virtual {p1, v3, v1}, Lip;->e(II)I
v4 = (( ip ) p1 ).e ( v4, v1 ); // invoke-virtual {p1, v4, v1}, Lip;->e(II)I
/* invoke-direct {p0}, Landroid/support/v7/widget/Toolbar;->g()V */
v5 = this.a;
(( ij ) v5 ).b ( v3, v4 ); // invoke-virtual {v5, v3, v4}, Lij;->b(II)V
/* if-ne p2, v0, :cond_5 */
/* if-eq v2, v0, :cond_6 */
} // :cond_5
v3 = this.a;
(( ij ) v3 ).a ( p2, v2 ); // invoke-virtual {v3, p2, v2}, Lij;->a(II)V
} // :cond_6
p2 = (( ip ) p1 ).d ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Lip;->d(II)I
/* iput p2, p0, Landroid/support/v7/widget/Toolbar;->j:I */
p2 = (( ip ) p1 ).d ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Lip;->d(II)I
/* iput p2, p0, Landroid/support/v7/widget/Toolbar;->k:I */
(( ip ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lip;->a(I)Landroid/graphics/drawable/Drawable;
this.a = p2;
(( ip ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lip;->a(I)Ljava/lang/CharSequence;
this.a = p2;
(( ip ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lip;->a(I)Ljava/lang/CharSequence;
v0 = android.text.TextUtils .isEmpty ( p2 );
/* if-nez v0, :cond_7 */
(( android.support.v7.widget.Toolbar ) p0 ).setTitle ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V
} // :cond_7
(( ip ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lip;->a(I)Ljava/lang/CharSequence;
v0 = android.text.TextUtils .isEmpty ( p2 );
/* if-nez v0, :cond_8 */
(( android.support.v7.widget.Toolbar ) p0 ).setSubtitle ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V
} // :cond_8
(( android.support.v7.widget.Toolbar ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;
this.a = p2;
p2 = (( ip ) p1 ).g ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lip;->g(II)I
(( android.support.v7.widget.Toolbar ) p0 ).setPopupTheme ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/widget/Toolbar;->setPopupTheme(I)V
(( ip ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lip;->a(I)Landroid/graphics/drawable/Drawable;
if ( p2 != null) { // if-eqz p2, :cond_9
(( android.support.v7.widget.Toolbar ) p0 ).setNavigationIcon ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V
} // :cond_9
(( ip ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lip;->a(I)Ljava/lang/CharSequence;
v0 = android.text.TextUtils .isEmpty ( p2 );
/* if-nez v0, :cond_a */
(( android.support.v7.widget.Toolbar ) p0 ).setNavigationContentDescription ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/widget/Toolbar;->setNavigationContentDescription(Ljava/lang/CharSequence;)V
} // :cond_a
(( ip ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lip;->a(I)Landroid/graphics/drawable/Drawable;
if ( p2 != null) { // if-eqz p2, :cond_b
(( android.support.v7.widget.Toolbar ) p0 ).setLogo ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/widget/Toolbar;->setLogo(Landroid/graphics/drawable/Drawable;)V
} // :cond_b
(( ip ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lip;->a(I)Ljava/lang/CharSequence;
v0 = android.text.TextUtils .isEmpty ( p2 );
/* if-nez v0, :cond_c */
(( android.support.v7.widget.Toolbar ) p0 ).setLogoDescription ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/widget/Toolbar;->setLogoDescription(Ljava/lang/CharSequence;)V
} // :cond_c
p2 = (( ip ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lip;->a(I)Z
if ( p2 != null) { // if-eqz p2, :cond_d
p2 = (( ip ) p1 ).b ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lip;->b(II)I
(( android.support.v7.widget.Toolbar ) p0 ).setTitleTextColor ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/widget/Toolbar;->setTitleTextColor(I)V
} // :cond_d
p2 = (( ip ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lip;->a(I)Z
if ( p2 != null) { // if-eqz p2, :cond_e
p2 = (( ip ) p1 ).b ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lip;->b(II)I
(( android.support.v7.widget.Toolbar ) p0 ).setSubtitleTextColor ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/widget/Toolbar;->setSubtitleTextColor(I)V
} // :cond_e
p1 = this.a;
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
return;
} // .end method
private Integer a ( Integer p0 ) {
/* .locals 1 */
/* and-int/lit8 p1, p1, 0x70 */
/* const/16 v0, 0x10 */
/* if-eq p1, v0, :cond_0 */
/* const/16 v0, 0x30 */
/* if-eq p1, v0, :cond_0 */
/* const/16 v0, 0x50 */
/* if-eq p1, v0, :cond_0 */
/* iget p1, p0, Landroid/support/v7/widget/Toolbar;->l:I */
/* and-int/lit8 p1, p1, 0x70 */
} // :cond_0
} // .end method
private static Integer a ( android.view.View p0 ) {
/* .locals 1 */
(( android.view.View ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams; */
v0 = ec .a ( p0 );
p0 = ec .b ( p0 );
/* add-int/2addr v0, p0 */
} // .end method
private Integer a ( android.view.View p0, Integer p1 ) {
/* .locals 6 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/support/v7/widget/Toolbar$LayoutParams; */
p1 = (( android.view.View ) p1 ).getMeasuredHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
int v1 = 0; // const/4 v1, 0x0
/* if-lez p2, :cond_0 */
/* sub-int p2, p1, p2 */
/* div-int/lit8 p2, p2, 0x2 */
} // :cond_0
int p2 = 0; // const/4 p2, 0x0
} // :goto_0
/* iget v2, v0, Landroid/support/v7/widget/Toolbar$LayoutParams;->a:I */
v2 = /* invoke-direct {p0, v2}, Landroid/support/v7/widget/Toolbar;->a(I)I */
/* const/16 v3, 0x30 */
/* if-eq v2, v3, :cond_4 */
/* const/16 v3, 0x50 */
/* if-eq v2, v3, :cond_3 */
p2 = (( android.support.v7.widget.Toolbar ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getPaddingTop()I
v2 = (( android.support.v7.widget.Toolbar ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getPaddingBottom()I
v3 = (( android.support.v7.widget.Toolbar ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getHeight()I
/* sub-int v4, v3, p2 */
/* sub-int/2addr v4, v2 */
/* sub-int/2addr v4, p1 */
/* div-int/lit8 v4, v4, 0x2 */
/* iget v5, v0, Landroid/support/v7/widget/Toolbar$LayoutParams;->topMargin:I */
/* if-ge v4, v5, :cond_1 */
/* iget v4, v0, Landroid/support/v7/widget/Toolbar$LayoutParams;->topMargin:I */
} // :cond_1
/* sub-int/2addr v3, v2 */
/* sub-int/2addr v3, p1 */
/* sub-int/2addr v3, v4 */
/* sub-int/2addr v3, p2 */
/* iget p1, v0, Landroid/support/v7/widget/Toolbar$LayoutParams;->bottomMargin:I */
/* if-ge v3, p1, :cond_2 */
/* iget p1, v0, Landroid/support/v7/widget/Toolbar$LayoutParams;->bottomMargin:I */
/* sub-int/2addr p1, v3 */
/* sub-int/2addr v4, p1 */
v4 = java.lang.Math .max ( v1,v4 );
} // :cond_2
} // :goto_1
/* add-int/2addr p2, v4 */
} // :cond_3
v1 = (( android.support.v7.widget.Toolbar ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getHeight()I
v2 = (( android.support.v7.widget.Toolbar ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getPaddingBottom()I
/* sub-int/2addr v1, v2 */
/* sub-int/2addr v1, p1 */
/* iget p1, v0, Landroid/support/v7/widget/Toolbar$LayoutParams;->bottomMargin:I */
/* sub-int/2addr v1, p1 */
/* sub-int/2addr v1, p2 */
} // :cond_4
p1 = (( android.support.v7.widget.Toolbar ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getPaddingTop()I
/* sub-int/2addr p1, p2 */
} // .end method
private Integer a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer[] p5 ) {
/* .locals 7 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams; */
/* iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
int v2 = 0; // const/4 v2, 0x0
/* aget v3, p6, v2 */
/* sub-int/2addr v1, v3 */
/* iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
int v4 = 1; // const/4 v4, 0x1
/* aget v5, p6, v4 */
/* sub-int/2addr v3, v5 */
v5 = java.lang.Math .max ( v2,v1 );
v6 = java.lang.Math .max ( v2,v3 );
/* add-int/2addr v5, v6 */
/* neg-int v1, v1 */
v1 = java.lang.Math .max ( v2,v1 );
/* aput v1, p6, v2 */
/* neg-int v1, v3 */
v1 = java.lang.Math .max ( v2,v1 );
/* aput v1, p6, v4 */
p6 = (( android.support.v7.widget.Toolbar ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getPaddingLeft()I
v1 = (( android.support.v7.widget.Toolbar ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getPaddingRight()I
/* add-int/2addr p6, v1 */
/* add-int/2addr p6, v5 */
/* add-int/2addr p6, p3 */
/* iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
p2 = android.support.v7.widget.Toolbar .getChildMeasureSpec ( p2,p6,p3 );
p3 = (( android.support.v7.widget.Toolbar ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getPaddingTop()I
p6 = (( android.support.v7.widget.Toolbar ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getPaddingBottom()I
/* add-int/2addr p3, p6 */
/* iget p6, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr p3, p6 */
/* iget p6, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr p3, p6 */
/* add-int/2addr p3, p5 */
/* iget p5, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
p3 = android.support.v7.widget.Toolbar .getChildMeasureSpec ( p4,p3,p5 );
(( android.view.View ) p1 ).measure ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V
p1 = (( android.view.View ) p1 ).getMeasuredWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I
/* add-int/2addr p1, v5 */
} // .end method
private Integer a ( android.view.View p0, Integer p1, Integer[] p2, Integer p3 ) {
/* .locals 4 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/support/v7/widget/Toolbar$LayoutParams; */
/* iget v1, v0, Landroid/support/v7/widget/Toolbar$LayoutParams;->leftMargin:I */
int v2 = 0; // const/4 v2, 0x0
/* aget v3, p3, v2 */
/* sub-int/2addr v1, v3 */
v3 = java.lang.Math .max ( v2,v1 );
/* add-int/2addr p2, v3 */
/* neg-int v1, v1 */
v1 = java.lang.Math .max ( v2,v1 );
/* aput v1, p3, v2 */
p3 = /* invoke-direct {p0, p1, p4}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;I)I */
p4 = (( android.view.View ) p1 ).getMeasuredWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I
/* add-int v1, p2, p4 */
v2 = (( android.view.View ) p1 ).getMeasuredHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v2, p3 */
(( android.view.View ) p1 ).layout ( p2, p3, v1, v2 ); // invoke-virtual {p1, p2, p3, v1, v2}, Landroid/view/View;->layout(IIII)V
/* iget p1, v0, Landroid/support/v7/widget/Toolbar$LayoutParams;->rightMargin:I */
/* add-int/2addr p4, p1 */
/* add-int/2addr p2, p4 */
} // .end method
protected static android.support.v7.widget.Toolbar$LayoutParams a ( ) {
/* .locals 1 */
/* new-instance v0, Landroid/support/v7/widget/Toolbar$LayoutParams; */
/* invoke-direct {v0}, Landroid/support/v7/widget/Toolbar$LayoutParams;-><init>()V */
} // .end method
private static android.support.v7.widget.Toolbar$LayoutParams a ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 1 */
/* instance-of v0, p0, Landroid/support/v7/widget/Toolbar$LayoutParams; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v0, Landroid/support/v7/widget/Toolbar$LayoutParams; */
/* check-cast p0, Landroid/support/v7/widget/Toolbar$LayoutParams; */
/* invoke-direct {v0, p0}, Landroid/support/v7/widget/Toolbar$LayoutParams;-><init>(Landroid/support/v7/widget/Toolbar$LayoutParams;)V */
} // :cond_0
/* instance-of v0, p0, Landroid/support/v7/app/ActionBar$LayoutParams; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* new-instance v0, Landroid/support/v7/widget/Toolbar$LayoutParams; */
/* check-cast p0, Landroid/support/v7/app/ActionBar$LayoutParams; */
/* invoke-direct {v0, p0}, Landroid/support/v7/widget/Toolbar$LayoutParams;-><init>(Landroid/support/v7/app/ActionBar$LayoutParams;)V */
} // :cond_1
/* instance-of v0, p0, Landroid/view/ViewGroup$MarginLayoutParams; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* new-instance v0, Landroid/support/v7/widget/Toolbar$LayoutParams; */
/* check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams; */
/* invoke-direct {v0, p0}, Landroid/support/v7/widget/Toolbar$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V */
} // :cond_2
/* new-instance v0, Landroid/support/v7/widget/Toolbar$LayoutParams; */
/* invoke-direct {v0, p0}, Landroid/support/v7/widget/Toolbar$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
} // .end method
private void a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 3 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams; */
v1 = (( android.support.v7.widget.Toolbar ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getPaddingLeft()I
v2 = (( android.support.v7.widget.Toolbar ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getPaddingRight()I
/* add-int/2addr v1, v2 */
/* iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v1, v2 */
/* iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v1, v2 */
/* add-int/2addr v1, p3 */
/* iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
p2 = android.support.v7.widget.Toolbar .getChildMeasureSpec ( p2,v1,p3 );
p3 = (( android.support.v7.widget.Toolbar ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getPaddingTop()I
v1 = (( android.support.v7.widget.Toolbar ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getPaddingBottom()I
/* add-int/2addr p3, v1 */
/* iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr p3, v1 */
/* iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr p3, v1 */
/* add-int/lit8 p3, p3, 0x0 */
/* iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
p3 = android.support.v7.widget.Toolbar .getChildMeasureSpec ( p4,p3,v0 );
p4 = android.view.View$MeasureSpec .getMode ( p3 );
/* const/high16 v0, 0x40000000 # 2.0f */
/* if-eq p4, v0, :cond_1 */
/* if-ltz p5, :cond_1 */
if ( p4 != null) { // if-eqz p4, :cond_0
p3 = android.view.View$MeasureSpec .getSize ( p3 );
p5 = java.lang.Math .min ( p3,p5 );
} // :cond_0
p3 = android.view.View$MeasureSpec .makeMeasureSpec ( p5,v0 );
} // :cond_1
(( android.view.View ) p1 ).measure ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V
return;
} // .end method
private void a ( android.view.View p0, Boolean p1 ) {
/* .locals 2 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/support/v7/widget/Toolbar$LayoutParams; */
/* invoke-direct {v0}, Landroid/support/v7/widget/Toolbar$LayoutParams;-><init>()V */
} // :cond_0
v1 = (( android.support.v7.widget.Toolbar ) p0 ).checkLayoutParams ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/Toolbar;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
/* if-nez v1, :cond_1 */
android.support.v7.widget.Toolbar .a ( v0 );
} // :cond_1
/* check-cast v0, Landroid/support/v7/widget/Toolbar$LayoutParams; */
} // :goto_0
int v1 = 1; // const/4 v1, 0x1
/* iput v1, v0, Landroid/support/v7/widget/Toolbar$LayoutParams;->b:I */
if ( p2 != null) { // if-eqz p2, :cond_2
p2 = this.a;
if ( p2 != null) { // if-eqz p2, :cond_2
(( android.view.View ) p1 ).setLayoutParams ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
p2 = this.a;
(( java.util.ArrayList ) p2 ).add ( p1 ); // invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
return;
} // :cond_2
(( android.support.v7.widget.Toolbar ) p0 ).addView ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/support/v7/widget/Toolbar;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
return;
} // .end method
private void a ( java.util.List p0, Integer p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Landroid/view/View;", */
/* ">;I)V" */
/* } */
} // .end annotation
v0 = em .b ( p0 );
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* if-ne v0, v2, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v3 = (( android.support.v7.widget.Toolbar ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getChildCount()I
v4 = em .b ( p0 );
p2 = dz .a ( p2,v4 );
if ( v0 != null) { // if-eqz v0, :cond_3
/* sub-int/2addr v3, v2 */
} // :goto_1
/* if-ltz v3, :cond_2 */
(( android.support.v7.widget.Toolbar ) p0 ).getChildAt ( v3 ); // invoke-virtual {p0, v3}, Landroid/support/v7/widget/Toolbar;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/support/v7/widget/Toolbar$LayoutParams; */
/* iget v2, v1, Landroid/support/v7/widget/Toolbar$LayoutParams;->b:I */
/* if-nez v2, :cond_1 */
v2 = /* invoke-direct {p0, v0}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;)Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* iget v1, v1, Landroid/support/v7/widget/Toolbar$LayoutParams;->a:I */
v1 = /* invoke-direct {p0, v1}, Landroid/support/v7/widget/Toolbar;->b(I)I */
/* if-ne v1, p2, :cond_1 */
} // :cond_1
/* add-int/lit8 v3, v3, -0x1 */
} // :cond_2
return;
} // :cond_3
} // :goto_2
/* if-ge v1, v3, :cond_5 */
(( android.support.v7.widget.Toolbar ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/support/v7/widget/Toolbar;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroid/support/v7/widget/Toolbar$LayoutParams; */
/* iget v4, v2, Landroid/support/v7/widget/Toolbar$LayoutParams;->b:I */
/* if-nez v4, :cond_4 */
v4 = /* invoke-direct {p0, v0}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;)Z */
if ( v4 != null) { // if-eqz v4, :cond_4
/* iget v2, v2, Landroid/support/v7/widget/Toolbar$LayoutParams;->a:I */
v2 = /* invoke-direct {p0, v2}, Landroid/support/v7/widget/Toolbar;->b(I)I */
/* if-ne v2, p2, :cond_4 */
} // :cond_4
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_5
return;
} // .end method
private Boolean a ( android.view.View p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
(( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* if-ne v0, p0, :cond_0 */
p1 = (( android.view.View ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/view/View;->getVisibility()I
/* const/16 v0, 0x8 */
/* if-eq p1, v0, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
private Integer b ( Integer p0 ) {
/* .locals 4 */
v0 = em .b ( p0 );
p1 = dz .a ( p1,v0 );
/* and-int/lit8 p1, p1, 0x7 */
int v1 = 1; // const/4 v1, 0x1
/* if-eq p1, v1, :cond_1 */
int v2 = 3; // const/4 v2, 0x3
/* if-eq p1, v2, :cond_1 */
int v3 = 5; // const/4 v3, 0x5
/* if-eq p1, v3, :cond_1 */
/* if-ne v0, v1, :cond_0 */
} // :cond_0
} // :cond_1
} // .end method
private static Integer b ( android.view.View p0 ) {
/* .locals 1 */
(( android.view.View ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams; */
/* iget v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr v0, p0 */
} // .end method
private Integer b ( android.view.View p0, Integer p1, Integer[] p2, Integer p3 ) {
/* .locals 5 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/support/v7/widget/Toolbar$LayoutParams; */
/* iget v1, v0, Landroid/support/v7/widget/Toolbar$LayoutParams;->rightMargin:I */
int v2 = 1; // const/4 v2, 0x1
/* aget v3, p3, v2 */
/* sub-int/2addr v1, v3 */
int v3 = 0; // const/4 v3, 0x0
v4 = java.lang.Math .max ( v3,v1 );
/* sub-int/2addr p2, v4 */
/* neg-int v1, v1 */
v1 = java.lang.Math .max ( v3,v1 );
/* aput v1, p3, v2 */
p3 = /* invoke-direct {p0, p1, p4}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;I)I */
p4 = (( android.view.View ) p1 ).getMeasuredWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I
/* sub-int v1, p2, p4 */
v2 = (( android.view.View ) p1 ).getMeasuredHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v2, p3 */
(( android.view.View ) p1 ).layout ( v1, p3, p2, v2 ); // invoke-virtual {p1, v1, p3, p2, v2}, Landroid/view/View;->layout(IIII)V
/* iget p1, v0, Landroid/support/v7/widget/Toolbar$LayoutParams;->leftMargin:I */
/* add-int/2addr p4, p1 */
/* sub-int/2addr p2, p4 */
} // .end method
private Boolean b ( android.view.View p0 ) {
/* .locals 1 */
(( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* if-eq v0, p0, :cond_1 */
v0 = this.a;
p1 = (( java.util.ArrayList ) v0 ).contains ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // .end method
private void c ( ) {
/* .locals 2 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/support/v7/widget/AppCompatImageView; */
(( android.support.v7.widget.Toolbar ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1}, Landroid/support/v7/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V */
this.a = v0;
} // :cond_0
return;
} // .end method
private void d ( ) {
/* .locals 3 */
/* invoke-direct {p0}, Landroid/support/v7/widget/Toolbar;->e()V */
v0 = this.a;
v0 = this.a;
/* if-nez v0, :cond_1 */
v0 = this.a;
(( android.support.v7.widget.ActionMenuView ) v0 ).getMenu ( ); // invoke-virtual {v0}, Landroid/support/v7/widget/ActionMenuView;->getMenu()Landroid/view/Menu;
/* check-cast v0, Lgz; */
v1 = this.a;
/* if-nez v1, :cond_0 */
/* new-instance v1, Landroid/support/v7/widget/Toolbar$a; */
/* invoke-direct {v1, p0}, Landroid/support/v7/widget/Toolbar$a;-><init>(Landroid/support/v7/widget/Toolbar;)V */
this.a = v1;
} // :cond_0
v1 = this.a;
int v2 = 1; // const/4 v2, 0x1
(( android.support.v7.widget.ActionMenuView ) v1 ).setExpandedActionViewsExclusive ( v2 ); // invoke-virtual {v1, v2}, Landroid/support/v7/widget/ActionMenuView;->setExpandedActionViewsExclusive(Z)V
v1 = this.a;
v2 = this.a;
(( gz ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lgz;->a(Lhg;Landroid/content/Context;)V
} // :cond_1
return;
} // .end method
private void e ( ) {
/* .locals 3 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/support/v7/widget/ActionMenuView; */
(( android.support.v7.widget.Toolbar ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1}, Landroid/support/v7/widget/ActionMenuView;-><init>(Landroid/content/Context;)V */
this.a = v0;
v0 = this.a;
/* iget v1, p0, Landroid/support/v7/widget/Toolbar;->b:I */
(( android.support.v7.widget.ActionMenuView ) v0 ).setPopupTheme ( v1 ); // invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionMenuView;->setPopupTheme(I)V
v0 = this.a;
v1 = this.a;
(( android.support.v7.widget.ActionMenuView ) v0 ).setOnMenuItemClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionMenuView;->setOnMenuItemClickListener(Landroid/support/v7/widget/ActionMenuView$d;)V
v0 = this.a;
v1 = this.a;
v2 = this.a;
(( android.support.v7.widget.ActionMenuView ) v0 ).setMenuCallbacks ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/ActionMenuView;->setMenuCallbacks(Lhg$a;Lgz$a;)V
/* new-instance v0, Landroid/support/v7/widget/Toolbar$LayoutParams; */
/* invoke-direct {v0}, Landroid/support/v7/widget/Toolbar$LayoutParams;-><init>()V */
/* const v1, 0x800005 */
/* iget v2, p0, Landroid/support/v7/widget/Toolbar;->a:I */
/* and-int/lit8 v2, v2, 0x70 */
/* or-int/2addr v1, v2 */
/* iput v1, v0, Landroid/support/v7/widget/Toolbar$LayoutParams;->a:I */
v1 = this.a;
(( android.support.v7.widget.ActionMenuView ) v1 ).setLayoutParams ( v0 ); // invoke-virtual {v1, v0}, Landroid/support/v7/widget/ActionMenuView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {p0, v0, v1}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;Z)V */
} // :cond_0
return;
} // .end method
private void f ( ) {
/* .locals 4 */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/support/v7/widget/AppCompatImageButton; */
(( android.support.v7.widget.Toolbar ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, v1, v2, v3}, Landroid/support/v7/widget/AppCompatImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
this.b = v0;
/* new-instance v0, Landroid/support/v7/widget/Toolbar$LayoutParams; */
/* invoke-direct {v0}, Landroid/support/v7/widget/Toolbar$LayoutParams;-><init>()V */
/* const v1, 0x800003 */
/* iget v2, p0, Landroid/support/v7/widget/Toolbar;->a:I */
/* and-int/lit8 v2, v2, 0x70 */
/* or-int/2addr v1, v2 */
/* iput v1, v0, Landroid/support/v7/widget/Toolbar$LayoutParams;->a:I */
v1 = this.b;
(( android.widget.ImageButton ) v1 ).setLayoutParams ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
} // :cond_0
return;
} // .end method
private void g ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lij; */
/* invoke-direct {v0}, Lij;-><init>()V */
this.a = v0;
} // :cond_0
return;
} // .end method
private android.view.MenuInflater getMenuInflater ( ) {
/* .locals 2 */
/* new-instance v0, Lgp; */
(( android.support.v7.widget.Toolbar ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1}, Lgp;-><init>(Landroid/content/Context;)V */
} // .end method
/* # virtual methods */
public final void a ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = this.a;
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
(( hb ) v0 ).collapseActionView ( ); // invoke-virtual {v0}, Lhb;->collapseActionView()Z
} // :cond_1
return;
} // .end method
public final Boolean a ( ) {
/* .locals 4 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
v2 = this.a;
int v3 = 1; // const/4 v3, 0x1
if ( v2 != null) { // if-eqz v2, :cond_0
v0 = this.a;
v0 = (( hq ) v0 ).f ( ); // invoke-virtual {v0}, Lhq;->f()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_1
} // .end method
final void b ( ) {
/* .locals 2 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_0 */
v1 = this.a;
(( java.util.ArrayList ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/view/View; */
(( android.support.v7.widget.Toolbar ) p0 ).addView ( v1 ); // invoke-virtual {p0, v1}, Landroid/support/v7/widget/Toolbar;->addView(Landroid/view/View;)V
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_0
v0 = this.a;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
return;
} // .end method
public final Boolean b ( ) {
/* .locals 4 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
v2 = this.a;
int v3 = 1; // const/4 v3, 0x1
if ( v2 != null) { // if-eqz v2, :cond_0
v0 = this.a;
v0 = (( hq ) v0 ).b ( ); // invoke-virtual {v0}, Lhq;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_1
} // .end method
protected Boolean checkLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 1 */
v0 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* instance-of p1, p1, Landroid/support/v7/widget/Toolbar$LayoutParams; */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
protected android.view.ViewGroup$LayoutParams generateDefaultLayoutParams ( ) { //synthethic
/* .locals 1 */
/* new-instance v0, Landroid/support/v7/widget/Toolbar$LayoutParams; */
/* invoke-direct {v0}, Landroid/support/v7/widget/Toolbar$LayoutParams;-><init>()V */
} // .end method
public android.view.ViewGroup$LayoutParams generateLayoutParams ( android.util.AttributeSet p0 ) { //synthethic
/* .locals 2 */
/* new-instance v0, Landroid/support/v7/widget/Toolbar$LayoutParams; */
(( android.support.v7.widget.Toolbar ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1, p1}, Landroid/support/v7/widget/Toolbar$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
protected android.view.ViewGroup$LayoutParams generateLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) { //synthethic
/* .locals 0 */
android.support.v7.widget.Toolbar .a ( p1 );
} // .end method
public Integer getContentInsetEnd ( ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget-boolean v1, v0, Lij;->a:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* iget v0, v0, Lij;->a:I */
} // :cond_0
/* iget v0, v0, Lij;->b:I */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer getContentInsetEndWithActions ( ) {
/* .locals 2 */
/* iget v0, p0, Landroid/support/v7/widget/Toolbar;->k:I */
/* const/high16 v1, -0x80000000 */
/* if-eq v0, v1, :cond_0 */
} // :cond_0
v0 = (( android.support.v7.widget.Toolbar ) p0 ).getContentInsetEnd ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContentInsetEnd()I
} // .end method
public Integer getContentInsetLeft ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, v0, Lij;->a:I */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer getContentInsetRight ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, v0, Lij;->b:I */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer getContentInsetStart ( ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget-boolean v1, v0, Lij;->a:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* iget v0, v0, Lij;->b:I */
} // :cond_0
/* iget v0, v0, Lij;->a:I */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer getContentInsetStartWithNavigation ( ) {
/* .locals 2 */
/* iget v0, p0, Landroid/support/v7/widget/Toolbar;->j:I */
/* const/high16 v1, -0x80000000 */
/* if-eq v0, v1, :cond_0 */
} // :cond_0
v0 = (( android.support.v7.widget.Toolbar ) p0 ).getContentInsetStart ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContentInsetStart()I
} // .end method
public Integer getCurrentContentInsetEnd ( ) {
/* .locals 3 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( gz ) v0 ).hasVisibleItems ( ); // invoke-virtual {v0}, Lgz;->hasVisibleItems()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( android.support.v7.widget.Toolbar ) p0 ).getContentInsetEnd ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContentInsetEnd()I
/* iget v2, p0, Landroid/support/v7/widget/Toolbar;->k:I */
v1 = java.lang.Math .max ( v2,v1 );
v0 = java.lang.Math .max ( v0,v1 );
} // :cond_1
v0 = (( android.support.v7.widget.Toolbar ) p0 ).getContentInsetEnd ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContentInsetEnd()I
} // .end method
public Integer getCurrentContentInsetLeft ( ) {
/* .locals 2 */
v0 = em .b ( p0 );
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
v0 = (( android.support.v7.widget.Toolbar ) p0 ).getCurrentContentInsetEnd ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getCurrentContentInsetEnd()I
} // :cond_0
v0 = (( android.support.v7.widget.Toolbar ) p0 ).getCurrentContentInsetStart ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getCurrentContentInsetStart()I
} // .end method
public Integer getCurrentContentInsetRight ( ) {
/* .locals 2 */
v0 = em .b ( p0 );
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
v0 = (( android.support.v7.widget.Toolbar ) p0 ).getCurrentContentInsetStart ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getCurrentContentInsetStart()I
} // :cond_0
v0 = (( android.support.v7.widget.Toolbar ) p0 ).getCurrentContentInsetEnd ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getCurrentContentInsetEnd()I
} // .end method
public Integer getCurrentContentInsetStart ( ) {
/* .locals 3 */
(( android.support.v7.widget.Toolbar ) p0 ).getNavigationIcon ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( android.support.v7.widget.Toolbar ) p0 ).getContentInsetStart ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContentInsetStart()I
/* iget v1, p0, Landroid/support/v7/widget/Toolbar;->j:I */
int v2 = 0; // const/4 v2, 0x0
v1 = java.lang.Math .max ( v1,v2 );
v0 = java.lang.Math .max ( v0,v1 );
} // :cond_0
v0 = (( android.support.v7.widget.Toolbar ) p0 ).getContentInsetStart ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContentInsetStart()I
} // .end method
public android.graphics.drawable.Drawable getLogo ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.widget.ImageView ) v0 ).getDrawable ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.CharSequence getLogoDescription ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.widget.ImageView ) v0 ).getContentDescription ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getContentDescription()Ljava/lang/CharSequence;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public android.view.Menu getMenu ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/widget/Toolbar;->d()V */
v0 = this.a;
(( android.support.v7.widget.ActionMenuView ) v0 ).getMenu ( ); // invoke-virtual {v0}, Landroid/support/v7/widget/ActionMenuView;->getMenu()Landroid/view/Menu;
} // .end method
public java.lang.CharSequence getNavigationContentDescription ( ) {
/* .locals 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.widget.ImageButton ) v0 ).getContentDescription ( ); // invoke-virtual {v0}, Landroid/widget/ImageButton;->getContentDescription()Ljava/lang/CharSequence;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public android.graphics.drawable.Drawable getNavigationIcon ( ) {
/* .locals 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.widget.ImageButton ) v0 ).getDrawable ( ); // invoke-virtual {v0}, Landroid/widget/ImageButton;->getDrawable()Landroid/graphics/drawable/Drawable;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
hq getOuterActionMenuPresenter ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public android.graphics.drawable.Drawable getOverflowIcon ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/widget/Toolbar;->d()V */
v0 = this.a;
(( android.support.v7.widget.ActionMenuView ) v0 ).getOverflowIcon ( ); // invoke-virtual {v0}, Landroid/support/v7/widget/ActionMenuView;->getOverflowIcon()Landroid/graphics/drawable/Drawable;
} // .end method
android.content.Context getPopupContext ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public Integer getPopupTheme ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v7/widget/Toolbar;->b:I */
} // .end method
public java.lang.CharSequence getSubtitle ( ) {
/* .locals 1 */
v0 = this.c;
} // .end method
public java.lang.CharSequence getTitle ( ) {
/* .locals 1 */
v0 = this.b;
} // .end method
public Integer getTitleMarginBottom ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v7/widget/Toolbar;->i:I */
} // .end method
public Integer getTitleMarginEnd ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v7/widget/Toolbar;->g:I */
} // .end method
public Integer getTitleMarginStart ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v7/widget/Toolbar;->f:I */
} // .end method
public Integer getTitleMarginTop ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v7/widget/Toolbar;->h:I */
} // .end method
public ic getWrapper ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* new-instance v0, Liq; */
/* invoke-direct {v0, p0}, Liq;-><init>(Landroid/support/v7/widget/Toolbar;)V */
this.a = v0;
} // :cond_0
v0 = this.a;
} // .end method
protected void onDetachedFromWindow ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V */
v0 = this.a;
(( android.support.v7.widget.Toolbar ) p0 ).removeCallbacks ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/Toolbar;->removeCallbacks(Ljava/lang/Runnable;)Z
return;
} // .end method
public Boolean onHoverEvent ( android.view.MotionEvent p0 ) {
/* .locals 5 */
v0 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
int v1 = 0; // const/4 v1, 0x0
/* const/16 v2, 0x9 */
/* if-ne v0, v2, :cond_0 */
/* iput-boolean v1, p0, Landroid/support/v7/widget/Toolbar;->b:Z */
} // :cond_0
/* iget-boolean v3, p0, Landroid/support/v7/widget/Toolbar;->b:Z */
int v4 = 1; // const/4 v4, 0x1
/* if-nez v3, :cond_1 */
p1 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onHoverEvent(Landroid/view/MotionEvent;)Z */
/* if-ne v0, v2, :cond_1 */
/* if-nez p1, :cond_1 */
/* iput-boolean v4, p0, Landroid/support/v7/widget/Toolbar;->b:Z */
} // :cond_1
/* const/16 p1, 0xa */
/* if-eq v0, p1, :cond_2 */
int p1 = 3; // const/4 p1, 0x3
/* if-ne v0, p1, :cond_3 */
} // :cond_2
/* iput-boolean v1, p0, Landroid/support/v7/widget/Toolbar;->b:Z */
} // :cond_3
} // .end method
protected void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 18 */
/* move-object/from16 v0, p0 */
v1 = /* invoke-static/range {p0 ..p0}, Lem;->b(Landroid/view/View;)I */
int v2 = 1; // const/4 v2, 0x1
int v3 = 0; // const/4 v3, 0x0
/* if-ne v1, v2, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
v4 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/Toolbar;->getWidth()I */
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/Toolbar;->getHeight()I */
v6 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/Toolbar;->getPaddingLeft()I */
v7 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/Toolbar;->getPaddingRight()I */
v8 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/Toolbar;->getPaddingTop()I */
v9 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/Toolbar;->getPaddingBottom()I */
/* sub-int v10, v4, v7 */
v11 = this.a;
/* aput v3, v11, v2 */
/* aput v3, v11, v3 */
v12 = /* invoke-static/range {p0 ..p0}, Lem;->c(Landroid/view/View;)I */
/* if-ltz v12, :cond_1 */
/* sub-int v13, p5, p3 */
v12 = java.lang.Math .min ( v12,v13 );
} // :cond_1
int v12 = 0; // const/4 v12, 0x0
} // :goto_1
v13 = this.b;
v13 = /* invoke-direct {v0, v13}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;)Z */
if ( v13 != null) { // if-eqz v13, :cond_3
if ( v1 != null) { // if-eqz v1, :cond_2
v13 = this.b;
v13 = /* invoke-direct {v0, v13, v10, v11, v12}, Landroid/support/v7/widget/Toolbar;->b(Landroid/view/View;I[II)I */
/* move v14, v13 */
/* move v13, v6 */
} // :cond_2
v13 = this.b;
v13 = /* invoke-direct {v0, v13, v6, v11, v12}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;I[II)I */
} // :cond_3
/* move v13, v6 */
} // :goto_2
/* move v14, v10 */
} // :goto_3
v15 = this.a;
v15 = /* invoke-direct {v0, v15}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;)Z */
if ( v15 != null) { // if-eqz v15, :cond_5
if ( v1 != null) { // if-eqz v1, :cond_4
v15 = this.a;
v14 = /* invoke-direct {v0, v15, v14, v11, v12}, Landroid/support/v7/widget/Toolbar;->b(Landroid/view/View;I[II)I */
} // :cond_4
v15 = this.a;
v13 = /* invoke-direct {v0, v15, v13, v11, v12}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;I[II)I */
} // :cond_5
} // :goto_4
v15 = this.a;
v15 = /* invoke-direct {v0, v15}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;)Z */
if ( v15 != null) { // if-eqz v15, :cond_7
if ( v1 != null) { // if-eqz v1, :cond_6
v15 = this.a;
v13 = /* invoke-direct {v0, v15, v13, v11, v12}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;I[II)I */
} // :cond_6
v15 = this.a;
v14 = /* invoke-direct {v0, v15, v14, v11, v12}, Landroid/support/v7/widget/Toolbar;->b(Landroid/view/View;I[II)I */
} // :cond_7
} // :goto_5
v15 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/Toolbar;->getCurrentContentInsetLeft()I */
v16 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/Toolbar;->getCurrentContentInsetRight()I */
/* sub-int v2, v15, v13 */
v2 = java.lang.Math .max ( v3,v2 );
/* aput v2, v11, v3 */
/* sub-int v2, v10, v14 */
/* sub-int v2, v16, v2 */
v2 = java.lang.Math .max ( v3,v2 );
/* const/16 v17, 0x1 */
/* aput v2, v11, v17 */
v2 = java.lang.Math .max ( v13,v15 );
/* sub-int v10, v10, v16 */
v10 = java.lang.Math .min ( v14,v10 );
v13 = this.a;
v13 = /* invoke-direct {v0, v13}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;)Z */
if ( v13 != null) { // if-eqz v13, :cond_9
if ( v1 != null) { // if-eqz v1, :cond_8
v13 = this.a;
v10 = /* invoke-direct {v0, v13, v10, v11, v12}, Landroid/support/v7/widget/Toolbar;->b(Landroid/view/View;I[II)I */
} // :cond_8
v13 = this.a;
v2 = /* invoke-direct {v0, v13, v2, v11, v12}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;I[II)I */
} // :cond_9
} // :goto_6
v13 = this.a;
v13 = /* invoke-direct {v0, v13}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;)Z */
if ( v13 != null) { // if-eqz v13, :cond_b
if ( v1 != null) { // if-eqz v1, :cond_a
v13 = this.a;
v10 = /* invoke-direct {v0, v13, v10, v11, v12}, Landroid/support/v7/widget/Toolbar;->b(Landroid/view/View;I[II)I */
} // :cond_a
v13 = this.a;
v2 = /* invoke-direct {v0, v13, v2, v11, v12}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;I[II)I */
} // :cond_b
} // :goto_7
v13 = this.a;
v13 = /* invoke-direct {v0, v13}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;)Z */
v14 = this.b;
v14 = /* invoke-direct {v0, v14}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;)Z */
if ( v13 != null) { // if-eqz v13, :cond_c
v15 = this.a;
(( android.widget.TextView ) v15 ).getLayoutParams ( ); // invoke-virtual {v15}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v15, Landroid/support/v7/widget/Toolbar$LayoutParams; */
/* iget v3, v15, Landroid/support/v7/widget/Toolbar$LayoutParams;->topMargin:I */
/* move/from16 p4, v7 */
v7 = this.a;
v7 = (( android.widget.TextView ) v7 ).getMeasuredHeight ( ); // invoke-virtual {v7}, Landroid/widget/TextView;->getMeasuredHeight()I
/* add-int/2addr v3, v7 */
/* iget v7, v15, Landroid/support/v7/widget/Toolbar$LayoutParams;->bottomMargin:I */
/* add-int/2addr v3, v7 */
int v7 = 0; // const/4 v7, 0x0
/* add-int/2addr v3, v7 */
} // :cond_c
/* move/from16 p4, v7 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_8
if ( v14 != null) { // if-eqz v14, :cond_d
v7 = this.b;
(( android.widget.TextView ) v7 ).getLayoutParams ( ); // invoke-virtual {v7}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v7, Landroid/support/v7/widget/Toolbar$LayoutParams; */
/* iget v15, v7, Landroid/support/v7/widget/Toolbar$LayoutParams;->topMargin:I */
/* move/from16 v16, v4 */
v4 = this.b;
v4 = (( android.widget.TextView ) v4 ).getMeasuredHeight ( ); // invoke-virtual {v4}, Landroid/widget/TextView;->getMeasuredHeight()I
/* add-int/2addr v15, v4 */
/* iget v4, v7, Landroid/support/v7/widget/Toolbar$LayoutParams;->bottomMargin:I */
/* add-int/2addr v15, v4 */
/* add-int/2addr v3, v15 */
} // :cond_d
/* move/from16 v16, v4 */
} // :goto_9
/* if-nez v13, :cond_f */
if ( v14 != null) { // if-eqz v14, :cond_e
} // :cond_e
/* move/from16 v17, v6 */
/* move/from16 p3, v12 */
/* goto/16 :goto_16 */
} // :cond_f
} // :goto_a
if ( v13 != null) { // if-eqz v13, :cond_10
v4 = this.a;
} // :cond_10
v4 = this.b;
} // :goto_b
if ( v14 != null) { // if-eqz v14, :cond_11
v7 = this.b;
} // :cond_11
v7 = this.a;
} // :goto_c
(( android.view.View ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v4, Landroid/support/v7/widget/Toolbar$LayoutParams; */
(( android.view.View ) v7 ).getLayoutParams ( ); // invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v7, Landroid/support/v7/widget/Toolbar$LayoutParams; */
if ( v13 != null) { // if-eqz v13, :cond_12
v15 = this.a;
v15 = (( android.widget.TextView ) v15 ).getMeasuredWidth ( ); // invoke-virtual {v15}, Landroid/widget/TextView;->getMeasuredWidth()I
/* if-gtz v15, :cond_13 */
} // :cond_12
if ( v14 != null) { // if-eqz v14, :cond_14
v15 = this.b;
v15 = (( android.widget.TextView ) v15 ).getMeasuredWidth ( ); // invoke-virtual {v15}, Landroid/widget/TextView;->getMeasuredWidth()I
/* if-lez v15, :cond_14 */
} // :cond_13
/* move/from16 v17, v6 */
int v15 = 1; // const/4 v15, 0x1
} // :cond_14
/* move/from16 v17, v6 */
int v15 = 0; // const/4 v15, 0x0
} // :goto_d
/* iget v6, v0, Landroid/support/v7/widget/Toolbar;->l:I */
/* and-int/lit8 v6, v6, 0x70 */
/* move/from16 p3, v12 */
/* const/16 v12, 0x30 */
/* if-eq v6, v12, :cond_18 */
/* const/16 v12, 0x50 */
/* if-eq v6, v12, :cond_17 */
/* sub-int v6, v5, v8 */
/* sub-int/2addr v6, v9 */
/* sub-int/2addr v6, v3 */
/* div-int/lit8 v6, v6, 0x2 */
/* iget v12, v4, Landroid/support/v7/widget/Toolbar$LayoutParams;->topMargin:I */
/* move/from16 p5, v2 */
/* iget v2, v0, Landroid/support/v7/widget/Toolbar;->h:I */
/* add-int/2addr v12, v2 */
/* if-ge v6, v12, :cond_15 */
/* iget v2, v4, Landroid/support/v7/widget/Toolbar$LayoutParams;->topMargin:I */
/* iget v3, v0, Landroid/support/v7/widget/Toolbar;->h:I */
/* add-int v6, v2, v3 */
} // :cond_15
/* sub-int/2addr v5, v9 */
/* sub-int/2addr v5, v3 */
/* sub-int/2addr v5, v6 */
/* sub-int/2addr v5, v8 */
/* iget v2, v4, Landroid/support/v7/widget/Toolbar$LayoutParams;->bottomMargin:I */
/* iget v3, v0, Landroid/support/v7/widget/Toolbar;->i:I */
/* add-int/2addr v2, v3 */
/* if-ge v5, v2, :cond_16 */
/* iget v2, v7, Landroid/support/v7/widget/Toolbar$LayoutParams;->bottomMargin:I */
/* iget v3, v0, Landroid/support/v7/widget/Toolbar;->i:I */
/* add-int/2addr v2, v3 */
/* sub-int/2addr v2, v5 */
/* sub-int/2addr v6, v2 */
int v2 = 0; // const/4 v2, 0x0
v6 = java.lang.Math .max ( v2,v6 );
} // :cond_16
} // :goto_e
/* add-int/2addr v8, v6 */
} // :cond_17
/* move/from16 p5, v2 */
/* sub-int/2addr v5, v9 */
/* iget v2, v7, Landroid/support/v7/widget/Toolbar$LayoutParams;->bottomMargin:I */
/* sub-int/2addr v5, v2 */
/* iget v2, v0, Landroid/support/v7/widget/Toolbar;->i:I */
/* sub-int/2addr v5, v2 */
/* sub-int v8, v5, v3 */
} // :cond_18
/* move/from16 p5, v2 */
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/Toolbar;->getPaddingTop()I */
/* iget v3, v4, Landroid/support/v7/widget/Toolbar$LayoutParams;->topMargin:I */
/* add-int/2addr v2, v3 */
/* iget v3, v0, Landroid/support/v7/widget/Toolbar;->h:I */
/* add-int v8, v2, v3 */
} // :goto_f
if ( v1 != null) { // if-eqz v1, :cond_1d
if ( v15 != null) { // if-eqz v15, :cond_19
/* iget v3, v0, Landroid/support/v7/widget/Toolbar;->f:I */
int v1 = 1; // const/4 v1, 0x1
} // :cond_19
int v1 = 1; // const/4 v1, 0x1
int v3 = 0; // const/4 v3, 0x0
} // :goto_10
/* aget v2, v11, v1 */
/* sub-int/2addr v3, v2 */
int v2 = 0; // const/4 v2, 0x0
v4 = java.lang.Math .max ( v2,v3 );
/* sub-int/2addr v10, v4 */
/* neg-int v3, v3 */
v3 = java.lang.Math .max ( v2,v3 );
/* aput v3, v11, v1 */
if ( v13 != null) { // if-eqz v13, :cond_1a
v1 = this.a;
(( android.widget.TextView ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/support/v7/widget/Toolbar$LayoutParams; */
v2 = this.a;
v2 = (( android.widget.TextView ) v2 ).getMeasuredWidth ( ); // invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredWidth()I
/* sub-int v2, v10, v2 */
v3 = this.a;
v3 = (( android.widget.TextView ) v3 ).getMeasuredHeight ( ); // invoke-virtual {v3}, Landroid/widget/TextView;->getMeasuredHeight()I
/* add-int/2addr v3, v8 */
v4 = this.a;
(( android.widget.TextView ) v4 ).layout ( v2, v8, v10, v3 ); // invoke-virtual {v4, v2, v8, v10, v3}, Landroid/widget/TextView;->layout(IIII)V
/* iget v4, v0, Landroid/support/v7/widget/Toolbar;->g:I */
/* sub-int/2addr v2, v4 */
/* iget v1, v1, Landroid/support/v7/widget/Toolbar$LayoutParams;->bottomMargin:I */
/* add-int v8, v3, v1 */
} // :cond_1a
/* move v2, v10 */
} // :goto_11
if ( v14 != null) { // if-eqz v14, :cond_1b
v1 = this.b;
(( android.widget.TextView ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/support/v7/widget/Toolbar$LayoutParams; */
/* iget v3, v1, Landroid/support/v7/widget/Toolbar$LayoutParams;->topMargin:I */
/* add-int/2addr v8, v3 */
v3 = this.b;
v3 = (( android.widget.TextView ) v3 ).getMeasuredWidth ( ); // invoke-virtual {v3}, Landroid/widget/TextView;->getMeasuredWidth()I
/* sub-int v3, v10, v3 */
v4 = this.b;
v4 = (( android.widget.TextView ) v4 ).getMeasuredHeight ( ); // invoke-virtual {v4}, Landroid/widget/TextView;->getMeasuredHeight()I
/* add-int/2addr v4, v8 */
v5 = this.b;
(( android.widget.TextView ) v5 ).layout ( v3, v8, v10, v4 ); // invoke-virtual {v5, v3, v8, v10, v4}, Landroid/widget/TextView;->layout(IIII)V
/* iget v3, v0, Landroid/support/v7/widget/Toolbar;->g:I */
/* sub-int v3, v10, v3 */
/* iget v1, v1, Landroid/support/v7/widget/Toolbar$LayoutParams;->bottomMargin:I */
} // :cond_1b
/* move v3, v10 */
} // :goto_12
if ( v15 != null) { // if-eqz v15, :cond_1c
v1 = java.lang.Math .min ( v2,v3 );
/* move v10, v1 */
} // :cond_1c
/* move/from16 v2, p5 */
} // :cond_1d
if ( v15 != null) { // if-eqz v15, :cond_1e
/* iget v3, v0, Landroid/support/v7/widget/Toolbar;->f:I */
int v1 = 0; // const/4 v1, 0x0
} // :cond_1e
int v1 = 0; // const/4 v1, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_13
/* aget v2, v11, v1 */
/* sub-int/2addr v3, v2 */
v2 = java.lang.Math .max ( v1,v3 );
/* add-int v2, p5, v2 */
/* neg-int v3, v3 */
v3 = java.lang.Math .max ( v1,v3 );
/* aput v3, v11, v1 */
if ( v13 != null) { // if-eqz v13, :cond_1f
v1 = this.a;
(( android.widget.TextView ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/support/v7/widget/Toolbar$LayoutParams; */
v3 = this.a;
v3 = (( android.widget.TextView ) v3 ).getMeasuredWidth ( ); // invoke-virtual {v3}, Landroid/widget/TextView;->getMeasuredWidth()I
/* add-int/2addr v3, v2 */
v4 = this.a;
v4 = (( android.widget.TextView ) v4 ).getMeasuredHeight ( ); // invoke-virtual {v4}, Landroid/widget/TextView;->getMeasuredHeight()I
/* add-int/2addr v4, v8 */
v5 = this.a;
(( android.widget.TextView ) v5 ).layout ( v2, v8, v3, v4 ); // invoke-virtual {v5, v2, v8, v3, v4}, Landroid/widget/TextView;->layout(IIII)V
/* iget v5, v0, Landroid/support/v7/widget/Toolbar;->g:I */
/* add-int/2addr v3, v5 */
/* iget v1, v1, Landroid/support/v7/widget/Toolbar$LayoutParams;->bottomMargin:I */
/* add-int v8, v4, v1 */
} // :cond_1f
/* move v3, v2 */
} // :goto_14
if ( v14 != null) { // if-eqz v14, :cond_20
v1 = this.b;
(( android.widget.TextView ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/support/v7/widget/Toolbar$LayoutParams; */
/* iget v4, v1, Landroid/support/v7/widget/Toolbar$LayoutParams;->topMargin:I */
/* add-int/2addr v8, v4 */
v4 = this.b;
v4 = (( android.widget.TextView ) v4 ).getMeasuredWidth ( ); // invoke-virtual {v4}, Landroid/widget/TextView;->getMeasuredWidth()I
/* add-int/2addr v4, v2 */
v5 = this.b;
v5 = (( android.widget.TextView ) v5 ).getMeasuredHeight ( ); // invoke-virtual {v5}, Landroid/widget/TextView;->getMeasuredHeight()I
/* add-int/2addr v5, v8 */
v6 = this.b;
(( android.widget.TextView ) v6 ).layout ( v2, v8, v4, v5 ); // invoke-virtual {v6, v2, v8, v4, v5}, Landroid/widget/TextView;->layout(IIII)V
/* iget v5, v0, Landroid/support/v7/widget/Toolbar;->g:I */
/* add-int/2addr v4, v5 */
/* iget v1, v1, Landroid/support/v7/widget/Toolbar$LayoutParams;->bottomMargin:I */
} // :cond_20
/* move v4, v2 */
} // :goto_15
if ( v15 != null) { // if-eqz v15, :cond_21
v2 = java.lang.Math .max ( v3,v4 );
} // :cond_21
} // :goto_16
v1 = this.b;
int v3 = 3; // const/4 v3, 0x3
/* invoke-direct {v0, v1, v3}, Landroid/support/v7/widget/Toolbar;->a(Ljava/util/List;I)V */
v1 = this.b;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* move v3, v2 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_17
/* if-ge v2, v1, :cond_22 */
v4 = this.b;
(( java.util.ArrayList ) v4 ).get ( v2 ); // invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v4, Landroid/view/View; */
/* move/from16 v12, p3 */
v3 = /* invoke-direct {v0, v4, v3, v11, v12}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;I[II)I */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_22
/* move/from16 v12, p3 */
v1 = this.b;
int v2 = 5; // const/4 v2, 0x5
/* invoke-direct {v0, v1, v2}, Landroid/support/v7/widget/Toolbar;->a(Ljava/util/List;I)V */
v1 = this.b;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
int v2 = 0; // const/4 v2, 0x0
} // :goto_18
/* if-ge v2, v1, :cond_23 */
v4 = this.b;
(( java.util.ArrayList ) v4 ).get ( v2 ); // invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v4, Landroid/view/View; */
v10 = /* invoke-direct {v0, v4, v10, v11, v12}, Landroid/support/v7/widget/Toolbar;->b(Landroid/view/View;I[II)I */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_23
v1 = this.b;
int v2 = 1; // const/4 v2, 0x1
/* invoke-direct {v0, v1, v2}, Landroid/support/v7/widget/Toolbar;->a(Ljava/util/List;I)V */
v1 = this.b;
int v4 = 0; // const/4 v4, 0x0
/* aget v5, v11, v4 */
v4 = /* aget v2, v11, v2 */
/* move v7, v2 */
/* move v6, v5 */
int v2 = 0; // const/4 v2, 0x0
int v5 = 0; // const/4 v5, 0x0
} // :goto_19
/* if-ge v2, v4, :cond_24 */
/* check-cast v8, Landroid/view/View; */
(( android.view.View ) v8 ).getLayoutParams ( ); // invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v9, Landroid/support/v7/widget/Toolbar$LayoutParams; */
/* iget v13, v9, Landroid/support/v7/widget/Toolbar$LayoutParams;->leftMargin:I */
/* sub-int/2addr v13, v6 */
/* iget v6, v9, Landroid/support/v7/widget/Toolbar$LayoutParams;->rightMargin:I */
/* sub-int/2addr v6, v7 */
int v7 = 0; // const/4 v7, 0x0
v9 = java.lang.Math .max ( v7,v13 );
v14 = java.lang.Math .max ( v7,v6 );
/* neg-int v13, v13 */
v13 = java.lang.Math .max ( v7,v13 );
/* neg-int v6, v6 */
v6 = java.lang.Math .max ( v7,v6 );
v8 = (( android.view.View ) v8 ).getMeasuredWidth ( ); // invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I
/* add-int/2addr v9, v8 */
/* add-int/2addr v9, v14 */
/* add-int/2addr v5, v9 */
/* add-int/lit8 v2, v2, 0x1 */
/* move v7, v6 */
/* move v6, v13 */
} // :cond_24
int v7 = 0; // const/4 v7, 0x0
/* sub-int v4, v16, v17 */
/* sub-int v4, v4, p4 */
/* div-int/lit8 v4, v4, 0x2 */
/* add-int v6, v17, v4 */
/* div-int/lit8 v1, v5, 0x2 */
/* sub-int v1, v6, v1 */
/* add-int/2addr v5, v1 */
/* if-ge v1, v3, :cond_25 */
} // :cond_25
/* if-le v5, v10, :cond_26 */
/* sub-int/2addr v5, v10 */
/* sub-int v3, v1, v5 */
} // :cond_26
/* move v3, v1 */
} // :goto_1a
v1 = this.b;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
} // :goto_1b
/* if-ge v7, v1, :cond_27 */
v2 = this.b;
(( java.util.ArrayList ) v2 ).get ( v7 ); // invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/view/View; */
v3 = /* invoke-direct {v0, v2, v3, v11, v12}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;I[II)I */
/* add-int/lit8 v7, v7, 0x1 */
} // :cond_27
v1 = this.b;
(( java.util.ArrayList ) v1 ).clear ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
return;
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 17 */
/* move-object/from16 v7, p0 */
v8 = this.a;
v0 = /* invoke-static/range {p0 ..p0}, Liv;->a(Landroid/view/View;)Z */
int v9 = 1; // const/4 v9, 0x1
int v10 = 0; // const/4 v10, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
int v6 = 1; // const/4 v6, 0x1
int v11 = 0; // const/4 v11, 0x0
} // :cond_0
int v6 = 0; // const/4 v6, 0x0
int v11 = 1; // const/4 v11, 0x1
} // :goto_0
v0 = this.b;
v0 = /* invoke-direct {v7, v0}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;)Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v1 = this.b;
int v3 = 0; // const/4 v3, 0x0
/* iget v5, v7, Landroid/support/v7/widget/Toolbar;->e:I */
/* move-object/from16 v0, p0 */
/* move/from16 v2, p1 */
/* move/from16 v4, p2 */
/* invoke-direct/range {v0 ..v5}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;IIII)V */
v0 = this.b;
v0 = (( android.widget.ImageButton ) v0 ).getMeasuredWidth ( ); // invoke-virtual {v0}, Landroid/widget/ImageButton;->getMeasuredWidth()I
v1 = this.b;
v1 = android.support.v7.widget.Toolbar .a ( v1 );
/* add-int/2addr v0, v1 */
v1 = this.b;
v1 = (( android.widget.ImageButton ) v1 ).getMeasuredHeight ( ); // invoke-virtual {v1}, Landroid/widget/ImageButton;->getMeasuredHeight()I
v2 = this.b;
v2 = android.support.v7.widget.Toolbar .b ( v2 );
/* add-int/2addr v1, v2 */
v1 = java.lang.Math .max ( v10,v1 );
v2 = this.b;
v2 = (( android.widget.ImageButton ) v2 ).getMeasuredState ( ); // invoke-virtual {v2}, Landroid/widget/ImageButton;->getMeasuredState()I
v2 = android.view.View .combineMeasuredStates ( v10,v2 );
/* move v12, v1 */
/* move v13, v2 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
int v12 = 0; // const/4 v12, 0x0
int v13 = 0; // const/4 v13, 0x0
} // :goto_1
v1 = this.a;
v1 = /* invoke-direct {v7, v1}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;)Z */
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = this.a;
int v3 = 0; // const/4 v3, 0x0
/* iget v5, v7, Landroid/support/v7/widget/Toolbar;->e:I */
/* move-object/from16 v0, p0 */
/* move/from16 v2, p1 */
/* move/from16 v4, p2 */
/* invoke-direct/range {v0 ..v5}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;IIII)V */
v0 = this.a;
v0 = (( android.widget.ImageButton ) v0 ).getMeasuredWidth ( ); // invoke-virtual {v0}, Landroid/widget/ImageButton;->getMeasuredWidth()I
v1 = this.a;
v1 = android.support.v7.widget.Toolbar .a ( v1 );
/* add-int/2addr v0, v1 */
v1 = this.a;
v1 = (( android.widget.ImageButton ) v1 ).getMeasuredHeight ( ); // invoke-virtual {v1}, Landroid/widget/ImageButton;->getMeasuredHeight()I
v2 = this.a;
v2 = android.support.v7.widget.Toolbar .b ( v2 );
/* add-int/2addr v1, v2 */
v12 = java.lang.Math .max ( v12,v1 );
v1 = this.a;
v1 = (( android.widget.ImageButton ) v1 ).getMeasuredState ( ); // invoke-virtual {v1}, Landroid/widget/ImageButton;->getMeasuredState()I
v13 = android.view.View .combineMeasuredStates ( v13,v1 );
} // :cond_2
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/Toolbar;->getCurrentContentInsetStart()I */
v2 = java.lang.Math .max ( v1,v0 );
/* add-int/lit8 v14, v2, 0x0 */
/* sub-int/2addr v1, v0 */
v0 = java.lang.Math .max ( v10,v1 );
/* aput v0, v8, v6 */
v0 = this.a;
v0 = /* invoke-direct {v7, v0}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;)Z */
if ( v0 != null) { // if-eqz v0, :cond_3
v1 = this.a;
/* iget v5, v7, Landroid/support/v7/widget/Toolbar;->e:I */
/* move-object/from16 v0, p0 */
/* move/from16 v2, p1 */
/* move v3, v14 */
/* move/from16 v4, p2 */
/* invoke-direct/range {v0 ..v5}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;IIII)V */
v0 = this.a;
v0 = (( android.support.v7.widget.ActionMenuView ) v0 ).getMeasuredWidth ( ); // invoke-virtual {v0}, Landroid/support/v7/widget/ActionMenuView;->getMeasuredWidth()I
v1 = this.a;
v1 = android.support.v7.widget.Toolbar .a ( v1 );
/* add-int/2addr v0, v1 */
v1 = this.a;
v1 = (( android.support.v7.widget.ActionMenuView ) v1 ).getMeasuredHeight ( ); // invoke-virtual {v1}, Landroid/support/v7/widget/ActionMenuView;->getMeasuredHeight()I
v2 = this.a;
v2 = android.support.v7.widget.Toolbar .b ( v2 );
/* add-int/2addr v1, v2 */
v12 = java.lang.Math .max ( v12,v1 );
v1 = this.a;
v1 = (( android.support.v7.widget.ActionMenuView ) v1 ).getMeasuredState ( ); // invoke-virtual {v1}, Landroid/support/v7/widget/ActionMenuView;->getMeasuredState()I
v13 = android.view.View .combineMeasuredStates ( v13,v1 );
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // :goto_2
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/Toolbar;->getCurrentContentInsetEnd()I */
v2 = java.lang.Math .max ( v1,v0 );
/* add-int/2addr v14, v2 */
/* sub-int/2addr v1, v0 */
v0 = java.lang.Math .max ( v10,v1 );
/* aput v0, v8, v11 */
v0 = this.a;
v0 = /* invoke-direct {v7, v0}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;)Z */
if ( v0 != null) { // if-eqz v0, :cond_4
v1 = this.a;
int v5 = 0; // const/4 v5, 0x0
/* move-object/from16 v0, p0 */
/* move/from16 v2, p1 */
/* move v3, v14 */
/* move/from16 v4, p2 */
/* move-object v6, v8 */
v0 = /* invoke-direct/range {v0 ..v6}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;IIII[I)I */
/* add-int/2addr v14, v0 */
v0 = this.a;
v0 = (( android.view.View ) v0 ).getMeasuredHeight ( ); // invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I
v1 = this.a;
v1 = android.support.v7.widget.Toolbar .b ( v1 );
/* add-int/2addr v0, v1 */
v12 = java.lang.Math .max ( v12,v0 );
v0 = this.a;
v0 = (( android.view.View ) v0 ).getMeasuredState ( ); // invoke-virtual {v0}, Landroid/view/View;->getMeasuredState()I
v13 = android.view.View .combineMeasuredStates ( v13,v0 );
} // :cond_4
v0 = this.a;
v0 = /* invoke-direct {v7, v0}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;)Z */
if ( v0 != null) { // if-eqz v0, :cond_5
v1 = this.a;
int v5 = 0; // const/4 v5, 0x0
/* move-object/from16 v0, p0 */
/* move/from16 v2, p1 */
/* move v3, v14 */
/* move/from16 v4, p2 */
/* move-object v6, v8 */
v0 = /* invoke-direct/range {v0 ..v6}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;IIII[I)I */
/* add-int/2addr v14, v0 */
v0 = this.a;
v0 = (( android.widget.ImageView ) v0 ).getMeasuredHeight ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getMeasuredHeight()I
v1 = this.a;
v1 = android.support.v7.widget.Toolbar .b ( v1 );
/* add-int/2addr v0, v1 */
v12 = java.lang.Math .max ( v12,v0 );
v0 = this.a;
v0 = (( android.widget.ImageView ) v0 ).getMeasuredState ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getMeasuredState()I
v13 = android.view.View .combineMeasuredStates ( v13,v0 );
} // :cond_5
v11 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/Toolbar;->getChildCount()I */
/* move v15, v12 */
int v12 = 0; // const/4 v12, 0x0
} // :goto_3
/* if-ge v12, v11, :cond_7 */
(( android.support.v7.widget.Toolbar ) v7 ).getChildAt ( v12 ); // invoke-virtual {v7, v12}, Landroid/support/v7/widget/Toolbar;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v6 ).getLayoutParams ( ); // invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/support/v7/widget/Toolbar$LayoutParams; */
/* iget v0, v0, Landroid/support/v7/widget/Toolbar$LayoutParams;->b:I */
/* if-nez v0, :cond_6 */
v0 = /* invoke-direct {v7, v6}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;)Z */
if ( v0 != null) { // if-eqz v0, :cond_6
int v5 = 0; // const/4 v5, 0x0
/* move-object/from16 v0, p0 */
/* move-object v1, v6 */
/* move/from16 v2, p1 */
/* move v3, v14 */
/* move/from16 v4, p2 */
/* move-object/from16 v16, v6 */
/* move-object v6, v8 */
v0 = /* invoke-direct/range {v0 ..v6}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;IIII[I)I */
/* add-int/2addr v14, v0 */
v0 = /* invoke-virtual/range {v16 ..v16}, Landroid/view/View;->getMeasuredHeight()I */
v1 = /* invoke-static/range {v16 ..v16}, Landroid/support/v7/widget/Toolbar;->b(Landroid/view/View;)I */
/* add-int/2addr v0, v1 */
v0 = java.lang.Math .max ( v15,v0 );
v1 = /* invoke-virtual/range {v16 ..v16}, Landroid/view/View;->getMeasuredState()I */
v1 = android.view.View .combineMeasuredStates ( v13,v1 );
/* move v15, v0 */
/* move v13, v1 */
} // :cond_6
/* add-int/lit8 v12, v12, 0x1 */
} // :cond_7
/* iget v0, v7, Landroid/support/v7/widget/Toolbar;->h:I */
/* iget v1, v7, Landroid/support/v7/widget/Toolbar;->i:I */
/* add-int v11, v0, v1 */
/* iget v0, v7, Landroid/support/v7/widget/Toolbar;->f:I */
/* iget v1, v7, Landroid/support/v7/widget/Toolbar;->g:I */
/* add-int v12, v0, v1 */
v0 = this.a;
v0 = /* invoke-direct {v7, v0}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;)Z */
if ( v0 != null) { // if-eqz v0, :cond_8
v1 = this.a;
/* add-int v3, v14, v12 */
/* move-object/from16 v0, p0 */
/* move/from16 v2, p1 */
/* move/from16 v4, p2 */
/* move v5, v11 */
/* move-object v6, v8 */
/* invoke-direct/range {v0 ..v6}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;IIII[I)I */
v0 = this.a;
v0 = (( android.widget.TextView ) v0 ).getMeasuredWidth ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredWidth()I
v1 = this.a;
v1 = android.support.v7.widget.Toolbar .a ( v1 );
/* add-int/2addr v0, v1 */
v1 = this.a;
v1 = (( android.widget.TextView ) v1 ).getMeasuredHeight ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->getMeasuredHeight()I
v2 = this.a;
v2 = android.support.v7.widget.Toolbar .b ( v2 );
/* add-int/2addr v1, v2 */
v2 = this.a;
v2 = (( android.widget.TextView ) v2 ).getMeasuredState ( ); // invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredState()I
v13 = android.view.View .combineMeasuredStates ( v13,v2 );
/* move/from16 v16, v1 */
/* move v6, v13 */
/* move v13, v0 */
} // :cond_8
/* move v6, v13 */
int v13 = 0; // const/4 v13, 0x0
/* const/16 v16, 0x0 */
} // :goto_4
v0 = this.b;
v0 = /* invoke-direct {v7, v0}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;)Z */
if ( v0 != null) { // if-eqz v0, :cond_9
v1 = this.b;
/* add-int v3, v14, v12 */
/* add-int v5, v16, v11 */
/* move-object/from16 v0, p0 */
/* move/from16 v2, p1 */
/* move/from16 v4, p2 */
/* move v11, v6 */
/* move-object v6, v8 */
v0 = /* invoke-direct/range {v0 ..v6}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;IIII[I)I */
v13 = java.lang.Math .max ( v13,v0 );
v0 = this.b;
v0 = (( android.widget.TextView ) v0 ).getMeasuredHeight ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredHeight()I
v1 = this.b;
v1 = android.support.v7.widget.Toolbar .b ( v1 );
/* add-int/2addr v0, v1 */
/* add-int v16, v16, v0 */
v0 = this.b;
v0 = (( android.widget.TextView ) v0 ).getMeasuredState ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredState()I
v6 = android.view.View .combineMeasuredStates ( v11,v0 );
} // :cond_9
/* move v11, v6 */
} // :goto_5
/* move/from16 v0, v16 */
/* add-int/2addr v14, v13 */
v0 = java.lang.Math .max ( v15,v0 );
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/Toolbar;->getPaddingLeft()I */
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/Toolbar;->getPaddingRight()I */
/* add-int/2addr v1, v2 */
/* add-int/2addr v14, v1 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/Toolbar;->getPaddingTop()I */
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/Toolbar;->getPaddingBottom()I */
/* add-int/2addr v1, v2 */
/* add-int/2addr v0, v1 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/Toolbar;->getSuggestedMinimumWidth()I */
v1 = java.lang.Math .max ( v14,v1 );
/* const/high16 v2, -0x1000000 */
/* and-int/2addr v2, v6 */
/* move/from16 v3, p1 */
v1 = android.view.View .resolveSizeAndState ( v1,v3,v2 );
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/Toolbar;->getSuggestedMinimumHeight()I */
v0 = java.lang.Math .max ( v0,v2 );
/* shl-int/lit8 v2, v6, 0x10 */
/* move/from16 v3, p2 */
v0 = android.view.View .resolveSizeAndState ( v0,v3,v2 );
/* iget-boolean v2, v7, Landroid/support/v7/widget/Toolbar;->c:Z */
/* if-nez v2, :cond_a */
} // :goto_6
int v9 = 0; // const/4 v9, 0x0
} // :cond_a
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/Toolbar;->getChildCount()I */
int v3 = 0; // const/4 v3, 0x0
} // :goto_7
/* if-ge v3, v2, :cond_c */
(( android.support.v7.widget.Toolbar ) v7 ).getChildAt ( v3 ); // invoke-virtual {v7, v3}, Landroid/support/v7/widget/Toolbar;->getChildAt(I)Landroid/view/View;
v5 = /* invoke-direct {v7, v4}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;)Z */
if ( v5 != null) { // if-eqz v5, :cond_b
v5 = (( android.view.View ) v4 ).getMeasuredWidth ( ); // invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I
/* if-lez v5, :cond_b */
v4 = (( android.view.View ) v4 ).getMeasuredHeight ( ); // invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I
/* if-lez v4, :cond_b */
} // :cond_b
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_c
} // :goto_8
if ( v9 != null) { // if-eqz v9, :cond_d
int v0 = 0; // const/4 v0, 0x0
} // :cond_d
(( android.support.v7.widget.Toolbar ) v7 ).setMeasuredDimension ( v1, v0 ); // invoke-virtual {v7, v1, v0}, Landroid/support/v7/widget/Toolbar;->setMeasuredDimension(II)V
return;
} // .end method
protected void onRestoreInstanceState ( android.os.Parcelable p0 ) {
/* .locals 2 */
/* instance-of v0, p1, Landroid/support/v7/widget/Toolbar$c; */
/* if-nez v0, :cond_0 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
return;
} // :cond_0
/* check-cast p1, Landroid/support/v7/widget/Toolbar$c; */
v0 = this.a;
/* invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* iget v1, p1, Landroid/support/v7/widget/Toolbar$c;->a:I */
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_2
if ( v0 != null) { // if-eqz v0, :cond_2
/* iget v1, p1, Landroid/support/v7/widget/Toolbar$c;->a:I */
if ( v0 != null) { // if-eqz v0, :cond_2
} // :cond_2
/* iget-boolean p1, p1, Landroid/support/v7/widget/Toolbar$c;->a:Z */
if ( p1 != null) { // if-eqz p1, :cond_3
p1 = this.a;
(( android.support.v7.widget.Toolbar ) p0 ).removeCallbacks ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/Toolbar;->removeCallbacks(Ljava/lang/Runnable;)Z
p1 = this.a;
(( android.support.v7.widget.Toolbar ) p0 ).post ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/Toolbar;->post(Ljava/lang/Runnable;)Z
} // :cond_3
return;
} // .end method
public void onRtlPropertiesChanged ( Integer p0 ) {
/* .locals 2 */
/* const/16 v1, 0x11 */
/* if-lt v0, v1, :cond_0 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRtlPropertiesChanged(I)V */
} // :cond_0
/* invoke-direct {p0}, Landroid/support/v7/widget/Toolbar;->g()V */
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
/* if-ne p1, v1, :cond_1 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* iget-boolean p1, v0, Lij;->a:Z */
/* if-eq v1, p1, :cond_8 */
/* iput-boolean v1, v0, Lij;->a:Z */
/* iget-boolean p1, v0, Lij;->b:Z */
if ( p1 != null) { // if-eqz p1, :cond_7
/* const/high16 p1, -0x80000000 */
if ( v1 != null) { // if-eqz v1, :cond_4
/* iget v1, v0, Lij;->d:I */
/* if-eq v1, p1, :cond_2 */
/* iget v1, v0, Lij;->d:I */
} // :cond_2
/* iget v1, v0, Lij;->e:I */
} // :goto_1
/* iput v1, v0, Lij;->a:I */
/* iget v1, v0, Lij;->c:I */
/* if-eq v1, p1, :cond_3 */
/* iget p1, v0, Lij;->c:I */
} // :cond_3
/* iget p1, v0, Lij;->f:I */
} // :goto_2
/* iput p1, v0, Lij;->b:I */
return;
} // :cond_4
/* iget v1, v0, Lij;->c:I */
/* if-eq v1, p1, :cond_5 */
/* iget v1, v0, Lij;->c:I */
} // :cond_5
/* iget v1, v0, Lij;->e:I */
} // :goto_3
/* iput v1, v0, Lij;->a:I */
/* iget v1, v0, Lij;->d:I */
/* if-eq v1, p1, :cond_6 */
/* iget p1, v0, Lij;->d:I */
} // :cond_6
/* iget p1, v0, Lij;->f:I */
} // :goto_4
/* iput p1, v0, Lij;->b:I */
return;
} // :cond_7
/* iget p1, v0, Lij;->e:I */
/* iput p1, v0, Lij;->a:I */
/* iget p1, v0, Lij;->f:I */
/* iput p1, v0, Lij;->b:I */
} // :cond_8
return;
} // .end method
protected android.os.Parcelable onSaveInstanceState ( ) {
/* .locals 2 */
/* new-instance v0, Landroid/support/v7/widget/Toolbar$c; */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable; */
/* invoke-direct {v0, v1}, Landroid/support/v7/widget/Toolbar$c;-><init>(Landroid/os/Parcelable;)V */
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.a;
v1 = this.a;
v1 = (( hb ) v1 ).getItemId ( ); // invoke-virtual {v1}, Lhb;->getItemId()I
/* iput v1, v0, Landroid/support/v7/widget/Toolbar$c;->a:I */
} // :cond_0
v1 = (( android.support.v7.widget.Toolbar ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->a()Z
/* iput-boolean v1, v0, Landroid/support/v7/widget/Toolbar$c;->a:Z */
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 4 */
v0 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* iput-boolean v1, p0, Landroid/support/v7/widget/Toolbar;->a:Z */
} // :cond_0
/* iget-boolean v2, p0, Landroid/support/v7/widget/Toolbar;->a:Z */
int v3 = 1; // const/4 v3, 0x1
/* if-nez v2, :cond_1 */
p1 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z */
/* if-nez v0, :cond_1 */
/* if-nez p1, :cond_1 */
/* iput-boolean v3, p0, Landroid/support/v7/widget/Toolbar;->a:Z */
} // :cond_1
/* if-eq v0, v3, :cond_2 */
int p1 = 3; // const/4 p1, 0x3
/* if-ne v0, p1, :cond_3 */
} // :cond_2
/* iput-boolean v1, p0, Landroid/support/v7/widget/Toolbar;->a:Z */
} // :cond_3
} // .end method
public void setCollapsible ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Landroid/support/v7/widget/Toolbar;->c:Z */
(( android.support.v7.widget.Toolbar ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->requestLayout()V
return;
} // .end method
public void setContentInsetEndWithActions ( Integer p0 ) {
/* .locals 1 */
/* if-gez p1, :cond_0 */
/* const/high16 p1, -0x80000000 */
} // :cond_0
/* iget v0, p0, Landroid/support/v7/widget/Toolbar;->k:I */
/* if-eq p1, v0, :cond_1 */
/* iput p1, p0, Landroid/support/v7/widget/Toolbar;->k:I */
(( android.support.v7.widget.Toolbar ) p0 ).getNavigationIcon ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;
if ( p1 != null) { // if-eqz p1, :cond_1
(( android.support.v7.widget.Toolbar ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->requestLayout()V
} // :cond_1
return;
} // .end method
public void setContentInsetStartWithNavigation ( Integer p0 ) {
/* .locals 1 */
/* if-gez p1, :cond_0 */
/* const/high16 p1, -0x80000000 */
} // :cond_0
/* iget v0, p0, Landroid/support/v7/widget/Toolbar;->j:I */
/* if-eq p1, v0, :cond_1 */
/* iput p1, p0, Landroid/support/v7/widget/Toolbar;->j:I */
(( android.support.v7.widget.Toolbar ) p0 ).getNavigationIcon ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;
if ( p1 != null) { // if-eqz p1, :cond_1
(( android.support.v7.widget.Toolbar ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->requestLayout()V
} // :cond_1
return;
} // .end method
public void setContentInsetsAbsolute ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/widget/Toolbar;->g()V */
v0 = this.a;
(( ij ) v0 ).b ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lij;->b(II)V
return;
} // .end method
public void setContentInsetsRelative ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/widget/Toolbar;->g()V */
v0 = this.a;
(( ij ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lij;->a(II)V
return;
} // .end method
public void setLogo ( Integer p0 ) {
/* .locals 1 */
(( android.support.v7.widget.Toolbar ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;
gd .a ( v0,p1 );
(( android.support.v7.widget.Toolbar ) p0 ).setLogo ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/Toolbar;->setLogo(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setLogo ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* invoke-direct {p0}, Landroid/support/v7/widget/Toolbar;->c()V */
v0 = this.a;
v0 = /* invoke-direct {p0, v0}, Landroid/support/v7/widget/Toolbar;->b(Landroid/view/View;)Z */
/* if-nez v0, :cond_1 */
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {p0, v0, v1}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;Z)V */
} // :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = /* invoke-direct {p0, v0}, Landroid/support/v7/widget/Toolbar;->b(Landroid/view/View;)Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
(( android.support.v7.widget.Toolbar ) p0 ).removeView ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/Toolbar;->removeView(Landroid/view/View;)V
v0 = this.a;
v1 = this.a;
(( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
} // :cond_1
} // :goto_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_2
(( android.widget.ImageView ) v0 ).setImageDrawable ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
} // :cond_2
return;
} // .end method
public void setLogoDescription ( Integer p0 ) {
/* .locals 1 */
(( android.support.v7.widget.Toolbar ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getText ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;
(( android.support.v7.widget.Toolbar ) p0 ).setLogoDescription ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/Toolbar;->setLogoDescription(Ljava/lang/CharSequence;)V
return;
} // .end method
public void setLogoDescription ( java.lang.CharSequence p0 ) {
/* .locals 1 */
v0 = android.text.TextUtils .isEmpty ( p1 );
/* if-nez v0, :cond_0 */
/* invoke-direct {p0}, Landroid/support/v7/widget/Toolbar;->c()V */
} // :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
(( android.widget.ImageView ) v0 ).setContentDescription ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V
} // :cond_1
return;
} // .end method
public void setMenu ( gz p0, hq p1 ) {
/* .locals 3 */
/* if-nez p1, :cond_0 */
v0 = this.a;
/* if-nez v0, :cond_0 */
return;
} // :cond_0
/* invoke-direct {p0}, Landroid/support/v7/widget/Toolbar;->e()V */
v0 = this.a;
v0 = this.a;
/* if-ne v0, p1, :cond_1 */
return;
} // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_2
v1 = this.a;
(( gz ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lgz;->b(Lhg;)V
v1 = this.a;
(( gz ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lgz;->b(Lhg;)V
} // :cond_2
v0 = this.a;
/* if-nez v0, :cond_3 */
/* new-instance v0, Landroid/support/v7/widget/Toolbar$a; */
/* invoke-direct {v0, p0}, Landroid/support/v7/widget/Toolbar$a;-><init>(Landroid/support/v7/widget/Toolbar;)V */
this.a = v0;
} // :cond_3
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p2, Lhq;->b:Z */
if ( p1 != null) { // if-eqz p1, :cond_4
v0 = this.a;
(( gz ) p1 ).a ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Lgz;->a(Lhg;Landroid/content/Context;)V
v0 = this.a;
v1 = this.a;
(( gz ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lgz;->a(Lhg;Landroid/content/Context;)V
} // :cond_4
p1 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( hq ) p2 ).a ( p1, v1 ); // invoke-virtual {p2, p1, v1}, Lhq;->a(Landroid/content/Context;Lgz;)V
p1 = this.a;
v2 = this.a;
(( android.support.v7.widget.Toolbar$a ) p1 ).a ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Landroid/support/v7/widget/Toolbar$a;->a(Landroid/content/Context;Lgz;)V
(( hq ) p2 ).b ( v0 ); // invoke-virtual {p2, v0}, Lhq;->b(Z)V
p1 = this.a;
(( android.support.v7.widget.Toolbar$a ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Landroid/support/v7/widget/Toolbar$a;->b(Z)V
} // :goto_0
p1 = this.a;
/* iget v0, p0, Landroid/support/v7/widget/Toolbar;->b:I */
(( android.support.v7.widget.ActionMenuView ) p1 ).setPopupTheme ( v0 ); // invoke-virtual {p1, v0}, Landroid/support/v7/widget/ActionMenuView;->setPopupTheme(I)V
p1 = this.a;
(( android.support.v7.widget.ActionMenuView ) p1 ).setPresenter ( p2 ); // invoke-virtual {p1, p2}, Landroid/support/v7/widget/ActionMenuView;->setPresenter(Lhq;)V
this.a = p2;
return;
} // .end method
public void setMenuCallbacks ( hg$a p0, gz$a p1 ) {
/* .locals 1 */
this.a = p1;
this.a = p2;
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.support.v7.widget.ActionMenuView ) v0 ).setMenuCallbacks ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/support/v7/widget/ActionMenuView;->setMenuCallbacks(Lhg$a;Lgz$a;)V
} // :cond_0
return;
} // .end method
public void setNavigationContentDescription ( Integer p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
(( android.support.v7.widget.Toolbar ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getText ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
(( android.support.v7.widget.Toolbar ) p0 ).setNavigationContentDescription ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/Toolbar;->setNavigationContentDescription(Ljava/lang/CharSequence;)V
return;
} // .end method
public void setNavigationContentDescription ( java.lang.CharSequence p0 ) {
/* .locals 1 */
v0 = android.text.TextUtils .isEmpty ( p1 );
/* if-nez v0, :cond_0 */
/* invoke-direct {p0}, Landroid/support/v7/widget/Toolbar;->f()V */
} // :cond_0
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
(( android.widget.ImageButton ) v0 ).setContentDescription ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setContentDescription(Ljava/lang/CharSequence;)V
} // :cond_1
return;
} // .end method
public void setNavigationIcon ( Integer p0 ) {
/* .locals 1 */
(( android.support.v7.widget.Toolbar ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;
gd .a ( v0,p1 );
(( android.support.v7.widget.Toolbar ) p0 ).setNavigationIcon ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setNavigationIcon ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* invoke-direct {p0}, Landroid/support/v7/widget/Toolbar;->f()V */
v0 = this.b;
v0 = /* invoke-direct {p0, v0}, Landroid/support/v7/widget/Toolbar;->b(Landroid/view/View;)Z */
/* if-nez v0, :cond_1 */
v0 = this.b;
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {p0, v0, v1}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;Z)V */
} // :cond_0
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = /* invoke-direct {p0, v0}, Landroid/support/v7/widget/Toolbar;->b(Landroid/view/View;)Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.b;
(( android.support.v7.widget.Toolbar ) p0 ).removeView ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/Toolbar;->removeView(Landroid/view/View;)V
v0 = this.a;
v1 = this.b;
(( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
} // :cond_1
} // :goto_0
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_2
(( android.widget.ImageButton ) v0 ).setImageDrawable ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
} // :cond_2
return;
} // .end method
public void setNavigationOnClickListener ( android.view.View$OnClickListener p0 ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/widget/Toolbar;->f()V */
v0 = this.b;
(( android.widget.ImageButton ) v0 ).setOnClickListener ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
return;
} // .end method
public void setOnMenuItemClickListener ( android.support.v7.widget.Toolbar$b p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
public void setOverflowIcon ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/widget/Toolbar;->d()V */
v0 = this.a;
(( android.support.v7.widget.ActionMenuView ) v0 ).setOverflowIcon ( p1 ); // invoke-virtual {v0, p1}, Landroid/support/v7/widget/ActionMenuView;->setOverflowIcon(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setPopupTheme ( Integer p0 ) {
/* .locals 2 */
/* iget v0, p0, Landroid/support/v7/widget/Toolbar;->b:I */
/* if-eq v0, p1, :cond_1 */
/* iput p1, p0, Landroid/support/v7/widget/Toolbar;->b:I */
/* if-nez p1, :cond_0 */
(( android.support.v7.widget.Toolbar ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;
this.a = p1;
return;
} // :cond_0
/* new-instance v0, Landroid/view/ContextThemeWrapper; */
(( android.support.v7.widget.Toolbar ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V */
this.a = v0;
} // :cond_1
return;
} // .end method
public void setSubtitle ( Integer p0 ) {
/* .locals 1 */
(( android.support.v7.widget.Toolbar ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getText ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;
(( android.support.v7.widget.Toolbar ) p0 ).setSubtitle ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V
return;
} // .end method
public void setSubtitle ( java.lang.CharSequence p0 ) {
/* .locals 3 */
v0 = android.text.TextUtils .isEmpty ( p1 );
/* if-nez v0, :cond_2 */
v0 = this.b;
/* if-nez v0, :cond_1 */
(( android.support.v7.widget.Toolbar ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;
/* new-instance v1, Landroid/support/v7/widget/AppCompatTextView; */
/* invoke-direct {v1, v0}, Landroid/support/v7/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V */
this.b = v1;
v1 = this.b;
(( android.widget.TextView ) v1 ).setSingleLine ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V
v1 = this.b;
v2 = android.text.TextUtils$TruncateAt.END;
(( android.widget.TextView ) v1 ).setEllipsize ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V
/* iget v1, p0, Landroid/support/v7/widget/Toolbar;->d:I */
if ( v1 != null) { // if-eqz v1, :cond_0
v2 = this.b;
(( android.widget.TextView ) v2 ).setTextAppearance ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
} // :cond_0
/* iget v0, p0, Landroid/support/v7/widget/Toolbar;->n:I */
if ( v0 != null) { // if-eqz v0, :cond_1
v1 = this.b;
(( android.widget.TextView ) v1 ).setTextColor ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V
} // :cond_1
v0 = this.b;
v0 = /* invoke-direct {p0, v0}, Landroid/support/v7/widget/Toolbar;->b(Landroid/view/View;)Z */
/* if-nez v0, :cond_3 */
v0 = this.b;
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {p0, v0, v1}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;Z)V */
} // :cond_2
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = /* invoke-direct {p0, v0}, Landroid/support/v7/widget/Toolbar;->b(Landroid/view/View;)Z */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.b;
(( android.support.v7.widget.Toolbar ) p0 ).removeView ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/Toolbar;->removeView(Landroid/view/View;)V
v0 = this.a;
v1 = this.b;
(( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
} // :cond_3
} // :goto_0
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_4
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
} // :cond_4
this.c = p1;
return;
} // .end method
public void setSubtitleTextAppearance ( android.content.Context p0, Integer p1 ) {
/* .locals 1 */
/* iput p2, p0, Landroid/support/v7/widget/Toolbar;->d:I */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.widget.TextView ) v0 ).setTextAppearance ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
} // :cond_0
return;
} // .end method
public void setSubtitleTextColor ( Integer p0 ) {
/* .locals 1 */
/* iput p1, p0, Landroid/support/v7/widget/Toolbar;->n:I */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.widget.TextView ) v0 ).setTextColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V
} // :cond_0
return;
} // .end method
public void setTitle ( Integer p0 ) {
/* .locals 1 */
(( android.support.v7.widget.Toolbar ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getText ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;
(( android.support.v7.widget.Toolbar ) p0 ).setTitle ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V
return;
} // .end method
public void setTitle ( java.lang.CharSequence p0 ) {
/* .locals 3 */
v0 = android.text.TextUtils .isEmpty ( p1 );
/* if-nez v0, :cond_2 */
v0 = this.a;
/* if-nez v0, :cond_1 */
(( android.support.v7.widget.Toolbar ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;
/* new-instance v1, Landroid/support/v7/widget/AppCompatTextView; */
/* invoke-direct {v1, v0}, Landroid/support/v7/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V */
this.a = v1;
v1 = this.a;
(( android.widget.TextView ) v1 ).setSingleLine ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V
v1 = this.a;
v2 = android.text.TextUtils$TruncateAt.END;
(( android.widget.TextView ) v1 ).setEllipsize ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V
/* iget v1, p0, Landroid/support/v7/widget/Toolbar;->c:I */
if ( v1 != null) { // if-eqz v1, :cond_0
v2 = this.a;
(( android.widget.TextView ) v2 ).setTextAppearance ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
} // :cond_0
/* iget v0, p0, Landroid/support/v7/widget/Toolbar;->m:I */
if ( v0 != null) { // if-eqz v0, :cond_1
v1 = this.a;
(( android.widget.TextView ) v1 ).setTextColor ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V
} // :cond_1
v0 = this.a;
v0 = /* invoke-direct {p0, v0}, Landroid/support/v7/widget/Toolbar;->b(Landroid/view/View;)Z */
/* if-nez v0, :cond_3 */
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {p0, v0, v1}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;Z)V */
} // :cond_2
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = /* invoke-direct {p0, v0}, Landroid/support/v7/widget/Toolbar;->b(Landroid/view/View;)Z */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.a;
(( android.support.v7.widget.Toolbar ) p0 ).removeView ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/Toolbar;->removeView(Landroid/view/View;)V
v0 = this.a;
v1 = this.a;
(( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
} // :cond_3
} // :goto_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_4
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
} // :cond_4
this.b = p1;
return;
} // .end method
public void setTitleMargin ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v7/widget/Toolbar;->f:I */
/* iput p2, p0, Landroid/support/v7/widget/Toolbar;->h:I */
/* iput p3, p0, Landroid/support/v7/widget/Toolbar;->g:I */
/* iput p4, p0, Landroid/support/v7/widget/Toolbar;->i:I */
(( android.support.v7.widget.Toolbar ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->requestLayout()V
return;
} // .end method
public void setTitleMarginBottom ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v7/widget/Toolbar;->i:I */
(( android.support.v7.widget.Toolbar ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->requestLayout()V
return;
} // .end method
public void setTitleMarginEnd ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v7/widget/Toolbar;->g:I */
(( android.support.v7.widget.Toolbar ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->requestLayout()V
return;
} // .end method
public void setTitleMarginStart ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v7/widget/Toolbar;->f:I */
(( android.support.v7.widget.Toolbar ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->requestLayout()V
return;
} // .end method
public void setTitleMarginTop ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v7/widget/Toolbar;->h:I */
(( android.support.v7.widget.Toolbar ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/Toolbar;->requestLayout()V
return;
} // .end method
public void setTitleTextAppearance ( android.content.Context p0, Integer p1 ) {
/* .locals 1 */
/* iput p2, p0, Landroid/support/v7/widget/Toolbar;->c:I */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.widget.TextView ) v0 ).setTextAppearance ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
} // :cond_0
return;
} // .end method
public void setTitleTextColor ( Integer p0 ) {
/* .locals 1 */
/* iput p1, p0, Landroid/support/v7/widget/Toolbar;->m:I */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.widget.TextView ) v0 ).setTextColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V
} // :cond_0
return;
} // .end method
