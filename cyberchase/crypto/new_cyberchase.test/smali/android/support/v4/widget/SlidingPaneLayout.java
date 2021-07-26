public class android.support.v4.widget.SlidingPaneLayout extends android.view.ViewGroup {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/v4/widget/SlidingPaneLayout$b;, */
	 /* Landroid/support/v4/widget/SlidingPaneLayout$a;, */
	 /* Landroid/support/v4/widget/SlidingPaneLayout$e;, */
	 /* Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;, */
	 /* Landroid/support/v4/widget/SlidingPaneLayout$c;, */
	 /* Landroid/support/v4/widget/SlidingPaneLayout$d; */
	 /* } */
} // .end annotation
/* # instance fields */
Float a;
Integer a;
private final android.graphics.Rect a;
private android.graphics.drawable.Drawable a;
private android.support.v4.widget.SlidingPaneLayout$d a;
android.view.View a;
final fq a;
private java.lang.reflect.Field a;
private java.lang.reflect.Method a;
final java.util.ArrayList a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Landroid/support/v4/widget/SlidingPaneLayout$b;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
Boolean a;
private Float b;
Integer b;
private android.graphics.drawable.Drawable b;
Boolean b;
private Float c;
Integer c;
private Boolean c;
private Float d;
private Integer d;
private Boolean d;
private final Integer e;
private Boolean e;
/* # direct methods */
public android.support.v4.widget.SlidingPaneLayout ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, v0}, Landroid/support/v4/widget/SlidingPaneLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
return;
} // .end method
public android.support.v4.widget.SlidingPaneLayout ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, p2, v0}, Landroid/support/v4/widget/SlidingPaneLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
return;
} // .end method
public android.support.v4.widget.SlidingPaneLayout ( ) {
/* .locals 1 */
/* invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
/* const p2, -0x33333334 */
/* iput p2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->a:I */
int p2 = 1; // const/4 p2, 0x1
/* iput-boolean p2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->d:Z */
/* new-instance p3, Landroid/graphics/Rect; */
/* invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V */
this.a = p3;
/* new-instance p3, Ljava/util/ArrayList; */
/* invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V */
this.a = p3;
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) p1 ).getDisplayMetrics ( ); // invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget p1, p1, Landroid/util/DisplayMetrics;->density:F */
/* const/high16 p3, 0x42000000 # 32.0f */
/* mul-float p3, p3, p1 */
/* const/high16 v0, 0x3f000000 # 0.5f */
/* add-float/2addr p3, v0 */
/* float-to-int p3, p3 */
/* iput p3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->e:I */
int p3 = 0; // const/4 p3, 0x0
(( android.support.v4.widget.SlidingPaneLayout ) p0 ).setWillNotDraw ( p3 ); // invoke-virtual {p0, p3}, Landroid/support/v4/widget/SlidingPaneLayout;->setWillNotDraw(Z)V
/* new-instance p3, Landroid/support/v4/widget/SlidingPaneLayout$a; */
/* invoke-direct {p3, p0}, Landroid/support/v4/widget/SlidingPaneLayout$a;-><init>(Landroid/support/v4/widget/SlidingPaneLayout;)V */
em .a ( p0,p3 );
em .a ( p0,p2 );
/* new-instance p2, Landroid/support/v4/widget/SlidingPaneLayout$c; */
/* invoke-direct {p2, p0}, Landroid/support/v4/widget/SlidingPaneLayout$c;-><init>(Landroid/support/v4/widget/SlidingPaneLayout;)V */
fq .a ( p0,v0,p2 );
this.a = p2;
p2 = this.a;
/* const/high16 p3, 0x43c80000 # 400.0f */
/* mul-float p1, p1, p3 */
/* iput p1, p2, Lfq;->a:F */
return;
} // .end method
private Boolean a ( Float p0 ) {
/* .locals 5 */
/* iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->c:Z */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
} // :cond_0
v0 = (( android.support.v4.widget.SlidingPaneLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->a()Z
v2 = this.a;
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams; */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( android.support.v4.widget.SlidingPaneLayout ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I
/* iget v2, v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I */
/* add-int/2addr v0, v2 */
v2 = this.a;
v2 = (( android.view.View ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/view/View;->getWidth()I
v3 = (( android.support.v4.widget.SlidingPaneLayout ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getWidth()I
/* int-to-float v3, v3 */
/* int-to-float v0, v0 */
/* iget v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->b:I */
/* int-to-float v4, v4 */
/* mul-float p1, p1, v4 */
/* add-float/2addr v0, p1 */
/* int-to-float p1, v2 */
/* add-float/2addr v0, p1 */
/* sub-float/2addr v3, v0 */
/* float-to-int p1, v3 */
} // :cond_1
v0 = (( android.support.v4.widget.SlidingPaneLayout ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I
/* iget v2, v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I */
/* add-int/2addr v0, v2 */
/* int-to-float v0, v0 */
/* iget v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->b:I */
/* int-to-float v2, v2 */
/* mul-float p1, p1, v2 */
/* add-float/2addr v0, p1 */
/* float-to-int p1, v0 */
} // :goto_0
v0 = this.a;
v2 = this.a;
v3 = (( android.view.View ) v2 ).getTop ( ); // invoke-virtual {v2}, Landroid/view/View;->getTop()I
p1 = (( fq ) v0 ).a ( v2, p1, v3 ); // invoke-virtual {v0, v2, p1, v3}, Lfq;->a(Landroid/view/View;II)Z
if ( p1 != null) { // if-eqz p1, :cond_2
(( android.support.v4.widget.SlidingPaneLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->a()V
em .a ( p0 );
int p1 = 1; // const/4 p1, 0x1
} // :cond_2
} // .end method
private Boolean b ( ) {
/* .locals 2 */
/* iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->d:Z */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
v0 = /* invoke-direct {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->a(F)Z */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
} // :cond_1
} // :goto_0
/* iput-boolean v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->b:Z */
int v0 = 1; // const/4 v0, 0x1
} // .end method
/* # virtual methods */
final void a ( ) {
/* .locals 6 */
v0 = (( android.support.v4.widget.SlidingPaneLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_1 */
(( android.support.v4.widget.SlidingPaneLayout ) p0 ).getChildAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
v4 = (( android.view.View ) v3 ).getVisibility ( ); // invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
int v5 = 4; // const/4 v5, 0x4
/* if-ne v4, v5, :cond_0 */
(( android.view.View ) v3 ).setVisibility ( v1 ); // invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
return;
} // .end method
final void a ( Float p0 ) {
/* .locals 9 */
v0 = (( android.support.v4.widget.SlidingPaneLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->a()Z
v1 = this.a;
(( android.view.View ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams; */
/* iget-boolean v2, v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->b:Z */
int v3 = 0; // const/4 v3, 0x0
if ( v2 != null) { // if-eqz v2, :cond_1
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v1, v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I */
} // :cond_0
/* iget v1, v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I */
} // :goto_0
/* if-gtz v1, :cond_1 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
v2 = (( android.support.v4.widget.SlidingPaneLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I
} // :goto_2
/* if-ge v3, v2, :cond_5 */
(( android.support.v4.widget.SlidingPaneLayout ) p0 ).getChildAt ( v3 ); // invoke-virtual {p0, v3}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
v5 = this.a;
/* if-eq v4, v5, :cond_4 */
/* iget v5, p0, Landroid/support/v4/widget/SlidingPaneLayout;->b:F */
/* const/high16 v6, 0x3f800000 # 1.0f */
/* sub-float v5, v6, v5 */
/* iget v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->c:I */
/* int-to-float v8, v7 */
/* mul-float v5, v5, v8 */
/* float-to-int v5, v5 */
/* iput p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->b:F */
/* sub-float v8, v6, p1 */
/* int-to-float v7, v7 */
/* mul-float v8, v8, v7 */
/* float-to-int v7, v8 */
/* sub-int/2addr v5, v7 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* neg-int v5, v5 */
} // :cond_2
(( android.view.View ) v4 ).offsetLeftAndRight ( v5 ); // invoke-virtual {v4, v5}, Landroid/view/View;->offsetLeftAndRight(I)V
if ( v1 != null) { // if-eqz v1, :cond_4
if ( v0 != null) { // if-eqz v0, :cond_3
/* iget v5, p0, Landroid/support/v4/widget/SlidingPaneLayout;->b:F */
/* sub-float/2addr v5, v6 */
} // :cond_3
/* iget v5, p0, Landroid/support/v4/widget/SlidingPaneLayout;->b:F */
/* sub-float v5, v6, v5 */
} // :goto_3
/* iget v6, p0, Landroid/support/v4/widget/SlidingPaneLayout;->d:I */
(( android.support.v4.widget.SlidingPaneLayout ) p0 ).a ( v4, v5, v6 ); // invoke-virtual {p0, v4, v5, v6}, Landroid/support/v4/widget/SlidingPaneLayout;->a(Landroid/view/View;FI)V
} // :cond_4
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_5
return;
} // .end method
final void a ( android.view.View p0 ) {
/* .locals 17 */
/* move-object/from16 v0, p1 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->a()Z */
if ( v1 != null) { // if-eqz v1, :cond_0
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getWidth()I */
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I */
/* sub-int/2addr v2, v3 */
} // :cond_0
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I */
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I */
} // :cond_1
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getWidth()I */
v4 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I */
/* sub-int/2addr v3, v4 */
} // :goto_1
v4 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingTop()I */
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getHeight()I */
v6 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingBottom()I */
/* sub-int/2addr v5, v6 */
if ( v0 != null) { // if-eqz v0, :cond_4
v7 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/View;->isOpaque()Z */
int v8 = 1; // const/4 v8, 0x1
if ( v7 != null) { // if-eqz v7, :cond_2
} // :cond_2
/* const/16 v9, 0x12 */
/* if-ge v7, v9, :cond_3 */
/* invoke-virtual/range {p1 ..p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable; */
if ( v7 != null) { // if-eqz v7, :cond_3
v7 = (( android.graphics.drawable.Drawable ) v7 ).getOpacity ( ); // invoke-virtual {v7}, Landroid/graphics/drawable/Drawable;->getOpacity()I
int v9 = -1; // const/4 v9, -0x1
/* if-ne v7, v9, :cond_3 */
} // :cond_3
int v8 = 0; // const/4 v8, 0x0
} // :goto_2
if ( v8 != null) { // if-eqz v8, :cond_4
v7 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/View;->getLeft()I */
v8 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/View;->getRight()I */
v9 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/View;->getTop()I */
v10 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/View;->getBottom()I */
} // :cond_4
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
int v10 = 0; // const/4 v10, 0x0
} // :goto_3
v11 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I */
int v12 = 0; // const/4 v12, 0x0
} // :goto_4
/* if-ge v12, v11, :cond_9 */
/* move-object/from16 v13, p0 */
(( android.support.v4.widget.SlidingPaneLayout ) v13 ).getChildAt ( v12 ); // invoke-virtual {v13, v12}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
/* if-eq v14, v0, :cond_a */
v15 = (( android.view.View ) v14 ).getVisibility ( ); // invoke-virtual {v14}, Landroid/view/View;->getVisibility()I
/* const/16 v6, 0x8 */
/* if-eq v15, v6, :cond_8 */
if ( v1 != null) { // if-eqz v1, :cond_5
/* move v6, v3 */
} // :cond_5
/* move v6, v2 */
} // :goto_5
v15 = (( android.view.View ) v14 ).getLeft ( ); // invoke-virtual {v14}, Landroid/view/View;->getLeft()I
v6 = java.lang.Math .max ( v6,v15 );
v15 = (( android.view.View ) v14 ).getTop ( ); // invoke-virtual {v14}, Landroid/view/View;->getTop()I
v15 = java.lang.Math .max ( v4,v15 );
if ( v1 != null) { // if-eqz v1, :cond_6
/* move/from16 v16, v1 */
/* move v0, v2 */
} // :cond_6
/* move/from16 v16, v1 */
/* move v0, v3 */
} // :goto_6
v1 = (( android.view.View ) v14 ).getRight ( ); // invoke-virtual {v14}, Landroid/view/View;->getRight()I
v0 = java.lang.Math .min ( v0,v1 );
v1 = (( android.view.View ) v14 ).getBottom ( ); // invoke-virtual {v14}, Landroid/view/View;->getBottom()I
v1 = java.lang.Math .min ( v5,v1 );
/* if-lt v6, v7, :cond_7 */
/* if-lt v15, v9, :cond_7 */
/* if-gt v0, v8, :cond_7 */
/* if-gt v1, v10, :cond_7 */
int v6 = 4; // const/4 v6, 0x4
} // :cond_7
int v6 = 0; // const/4 v6, 0x0
} // :goto_7
(( android.view.View ) v14 ).setVisibility ( v6 ); // invoke-virtual {v14, v6}, Landroid/view/View;->setVisibility(I)V
} // :cond_8
/* move/from16 v16, v1 */
} // :goto_8
/* add-int/lit8 v12, v12, 0x1 */
/* move/from16 v1, v16 */
/* move-object/from16 v0, p1 */
} // :cond_9
/* move-object/from16 v13, p0 */
} // :cond_a
return;
} // .end method
final void a ( android.view.View p0, Float p1, Integer p2 ) {
/* .locals 3 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams; */
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v1, p2, v1 */
/* if-lez v1, :cond_2 */
if ( p3 != null) { // if-eqz p3, :cond_2
/* const/high16 v1, -0x1000000 */
/* and-int/2addr v1, p3 */
/* ushr-int/lit8 v1, v1, 0x18 */
/* int-to-float v1, v1 */
/* mul-float v1, v1, p2 */
/* float-to-int p2, v1 */
/* shl-int/lit8 p2, p2, 0x18 */
/* const v1, 0xffffff */
/* and-int/2addr p3, v1 */
/* or-int/2addr p2, p3 */
p3 = this.a;
/* if-nez p3, :cond_0 */
/* new-instance p3, Landroid/graphics/Paint; */
/* invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V */
this.a = p3;
} // :cond_0
p3 = this.a;
/* new-instance v1, Landroid/graphics/PorterDuffColorFilter; */
v2 = android.graphics.PorterDuff$Mode.SRC_OVER;
/* invoke-direct {v1, p2, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V */
(( android.graphics.Paint ) p3 ).setColorFilter ( v1 ); // invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
p2 = (( android.view.View ) p1 ).getLayerType ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayerType()I
int p3 = 2; // const/4 p3, 0x2
/* if-eq p2, p3, :cond_1 */
p2 = this.a;
(( android.view.View ) p1 ).setLayerType ( p3, p2 ); // invoke-virtual {p1, p3, p2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V
} // :cond_1
(( android.support.v4.widget.SlidingPaneLayout ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout;->b(Landroid/view/View;)V
return;
} // :cond_2
p2 = (( android.view.View ) p1 ).getLayerType ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayerType()I
if ( p2 != null) { // if-eqz p2, :cond_4
p2 = this.a;
if ( p2 != null) { // if-eqz p2, :cond_3
p2 = this.a;
int p3 = 0; // const/4 p3, 0x0
(( android.graphics.Paint ) p2 ).setColorFilter ( p3 ); // invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
} // :cond_3
/* new-instance p2, Landroid/support/v4/widget/SlidingPaneLayout$b; */
/* invoke-direct {p2, p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$b;-><init>(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/view/View;)V */
p1 = this.a;
(( java.util.ArrayList ) p1 ).add ( p2 ); // invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
em .a ( p0,p2 );
} // :cond_4
return;
} // .end method
final Boolean a ( ) {
/* .locals 2 */
v0 = em .b ( p0 );
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
final Boolean a ( android.view.View p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
} // :cond_0
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams; */
/* iget-boolean v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->c:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* iget-boolean p1, p1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->b:Z */
if ( p1 != null) { // if-eqz p1, :cond_1
/* iget p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->a:F */
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float p1, p1, v1 */
/* if-lez p1, :cond_1 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
} // .end method
final void b ( android.view.View p0 ) {
/* .locals 5 */
/* const/16 v1, 0x11 */
/* if-lt v0, v1, :cond_0 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams; */
v0 = this.a;
em .a ( p1,v0 );
return;
} // :cond_0
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_4 */
/* iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->e:Z */
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* if-nez v0, :cond_1 */
try { // :try_start_0
/* const-class v0, Landroid/view/View; */
final String v3 = "getDisplayList"; // const-string v3, "getDisplayList"
(( java.lang.Class ) v0 ).getDeclaredMethod ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
this.a = v0;
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v3 = "SlidingPaneLayout"; // const-string v3, "SlidingPaneLayout"
final String v4 = "Couldn\'t fetch getDisplayList method; dimming won\'t work right."; // const-string v4, "Couldn\'t fetch getDisplayList method; dimming won\'t work right."
android.util.Log .e ( v3,v4,v0 );
} // :goto_0
try { // :try_start_1
/* const-class v0, Landroid/view/View; */
final String v3 = "mRecreateDisplayList"; // const-string v3, "mRecreateDisplayList"
(( java.lang.Class ) v0 ).getDeclaredField ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
this.a = v0;
v0 = this.a;
(( java.lang.reflect.Field ) v0 ).setAccessible ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V
/* :try_end_1 */
/* .catch Ljava/lang/NoSuchFieldException; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception v0 */
final String v3 = "SlidingPaneLayout"; // const-string v3, "SlidingPaneLayout"
final String v4 = "Couldn\'t fetch mRecreateDisplayList field; dimming will be slow."; // const-string v4, "Couldn\'t fetch mRecreateDisplayList field; dimming will be slow."
android.util.Log .e ( v3,v4,v0 );
} // :goto_1
/* iput-boolean v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->e:Z */
} // :cond_1
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.a;
/* if-nez v0, :cond_2 */
} // :cond_2
try { // :try_start_2
(( java.lang.reflect.Field ) v0 ).setBoolean ( p1, v2 ); // invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V
v0 = this.a;
(( java.lang.reflect.Method ) v0 ).invoke ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_2 */
/* :catch_2 */
/* move-exception v0 */
final String v1 = "SlidingPaneLayout"; // const-string v1, "SlidingPaneLayout"
final String v2 = "Error refreshing display list state"; // const-string v2, "Error refreshing display list state"
android.util.Log .e ( v1,v2,v0 );
} // :cond_3
} // :goto_2
(( android.view.View ) p1 ).invalidate ( ); // invoke-virtual {p1}, Landroid/view/View;->invalidate()V
return;
} // :cond_4
} // :goto_3
v0 = (( android.view.View ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getLeft()I
v1 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
v2 = (( android.view.View ) p1 ).getRight ( ); // invoke-virtual {p1}, Landroid/view/View;->getRight()I
p1 = (( android.view.View ) p1 ).getBottom ( ); // invoke-virtual {p1}, Landroid/view/View;->getBottom()I
em .a ( p0,v0,v1,v2,p1 );
return;
} // .end method
protected Boolean checkLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 1 */
/* instance-of v0, p1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams; */
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void computeScroll ( ) {
/* .locals 1 */
v0 = this.a;
v0 = (( fq ) v0 ).a ( ); // invoke-virtual {v0}, Lfq;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->c:Z */
/* if-nez v0, :cond_0 */
v0 = this.a;
(( fq ) v0 ).b ( ); // invoke-virtual {v0}, Lfq;->b()V
return;
} // :cond_0
em .a ( p0 );
} // :cond_1
return;
} // .end method
public void draw ( android.graphics.Canvas p0 ) {
/* .locals 7 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V */
v0 = (( android.support.v4.widget.SlidingPaneLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.b;
} // :cond_0
v0 = this.a;
} // :goto_0
v1 = (( android.support.v4.widget.SlidingPaneLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I
int v2 = 1; // const/4 v2, 0x1
/* if-le v1, v2, :cond_1 */
(( android.support.v4.widget.SlidingPaneLayout ) p0 ).getChildAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_4
/* if-nez v0, :cond_2 */
} // :cond_2
v2 = (( android.view.View ) v1 ).getTop ( ); // invoke-virtual {v1}, Landroid/view/View;->getTop()I
v3 = (( android.view.View ) v1 ).getBottom ( ); // invoke-virtual {v1}, Landroid/view/View;->getBottom()I
v4 = (( android.graphics.drawable.Drawable ) v0 ).getIntrinsicWidth ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
v5 = (( android.support.v4.widget.SlidingPaneLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->a()Z
if ( v5 != null) { // if-eqz v5, :cond_3
v1 = (( android.view.View ) v1 ).getRight ( ); // invoke-virtual {v1}, Landroid/view/View;->getRight()I
/* add-int/2addr v4, v1 */
} // :cond_3
v1 = (( android.view.View ) v1 ).getLeft ( ); // invoke-virtual {v1}, Landroid/view/View;->getLeft()I
/* sub-int v4, v1, v4 */
/* move v6, v4 */
/* move v4, v1 */
/* move v1, v6 */
} // :goto_2
(( android.graphics.drawable.Drawable ) v0 ).setBounds ( v1, v2, v4, v3 ); // invoke-virtual {v0, v1, v2, v4, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
(( android.graphics.drawable.Drawable ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
} // :cond_4
} // :goto_3
return;
} // .end method
protected Boolean drawChild ( android.graphics.Canvas p0, android.view.View p1, Long p2 ) {
/* .locals 4 */
(( android.view.View ) p2 ).getLayoutParams ( ); // invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams; */
v1 = (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
/* iget-boolean v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->c:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->a:Z */
/* if-nez v0, :cond_1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
(( android.graphics.Canvas ) p1 ).getClipBounds ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z
v0 = (( android.support.v4.widget.SlidingPaneLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
/* iget v2, v0, Landroid/graphics/Rect;->left:I */
v3 = this.a;
v3 = (( android.view.View ) v3 ).getRight ( ); // invoke-virtual {v3}, Landroid/view/View;->getRight()I
v2 = java.lang.Math .max ( v2,v3 );
/* iput v2, v0, Landroid/graphics/Rect;->left:I */
} // :cond_0
v0 = this.a;
/* iget v2, v0, Landroid/graphics/Rect;->right:I */
v3 = this.a;
v3 = (( android.view.View ) v3 ).getLeft ( ); // invoke-virtual {v3}, Landroid/view/View;->getLeft()I
v2 = java.lang.Math .min ( v2,v3 );
/* iput v2, v0, Landroid/graphics/Rect;->right:I */
} // :goto_0
v0 = this.a;
(( android.graphics.Canvas ) p1 ).clipRect ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z
} // :cond_1
p2 = /* invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z */
(( android.graphics.Canvas ) p1 ).restoreToCount ( v1 ); // invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V
} // .end method
protected android.view.ViewGroup$LayoutParams generateDefaultLayoutParams ( ) {
/* .locals 1 */
/* new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams; */
/* invoke-direct {v0}, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;-><init>()V */
} // .end method
public android.view.ViewGroup$LayoutParams generateLayoutParams ( android.util.AttributeSet p0 ) {
/* .locals 2 */
/* new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams; */
(( android.support.v4.widget.SlidingPaneLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1, p1}, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
protected android.view.ViewGroup$LayoutParams generateLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 1 */
/* instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams; */
/* check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams; */
/* invoke-direct {v0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V */
} // :cond_0
/* new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams; */
/* invoke-direct {v0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
} // .end method
public Integer getCoveredFadeColor ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->d:I */
} // .end method
public Integer getParallaxDistance ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->c:I */
} // .end method
public Integer getSliderFadeColor ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->a:I */
} // .end method
protected void onAttachedToWindow ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->d:Z */
return;
} // .end method
protected void onDetachedFromWindow ( ) {
/* .locals 3 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->d:Z */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
v2 = this.a;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/support/v4/widget/SlidingPaneLayout$b; */
(( android.support.v4.widget.SlidingPaneLayout$b ) v2 ).run ( ); // invoke-virtual {v2}, Landroid/support/v4/widget/SlidingPaneLayout$b;->run()V
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
v0 = this.a;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
return;
} // .end method
public Boolean onInterceptTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 5 */
v0 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
/* iget-boolean v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->c:Z */
int v2 = 1; // const/4 v2, 0x1
/* if-nez v1, :cond_0 */
/* if-nez v0, :cond_0 */
v1 = (( android.support.v4.widget.SlidingPaneLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I
/* if-le v1, v2, :cond_0 */
(( android.support.v4.widget.SlidingPaneLayout ) p0 ).getChildAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
if ( v1 != null) { // if-eqz v1, :cond_0
v3 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* float-to-int v3, v3 */
v4 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* float-to-int v4, v4 */
v1 = fq .b ( v1,v3,v4 );
/* xor-int/2addr v1, v2 */
/* iput-boolean v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->b:Z */
} // :cond_0
/* iget-boolean v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->c:Z */
if ( v1 != null) { // if-eqz v1, :cond_9
/* iget-boolean v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->a:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
if ( v0 != null) { // if-eqz v0, :cond_1
/* goto/16 :goto_4 */
} // :cond_1
int v1 = 3; // const/4 v1, 0x3
int v3 = 0; // const/4 v3, 0x0
/* if-eq v0, v1, :cond_8 */
/* if-ne v0, v2, :cond_2 */
} // :cond_2
if ( v0 != null) { // if-eqz v0, :cond_4
int v1 = 2; // const/4 v1, 0x2
/* if-eq v0, v1, :cond_3 */
} // :cond_3
v0 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
v1 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* iget v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->c:F */
/* sub-float/2addr v0, v4 */
v0 = java.lang.Math .abs ( v0 );
/* iget v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->d:F */
/* sub-float/2addr v1, v4 */
v1 = java.lang.Math .abs ( v1 );
v4 = this.a;
/* iget v4, v4, Lfq;->b:I */
/* int-to-float v4, v4 */
/* cmpl-float v4, v0, v4 */
/* if-lez v4, :cond_5 */
/* cmpl-float v0, v1, v0 */
/* if-lez v0, :cond_5 */
p1 = this.a;
(( fq ) p1 ).a ( ); // invoke-virtual {p1}, Lfq;->a()V
/* iput-boolean v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->a:Z */
} // :cond_4
/* iput-boolean v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->a:Z */
v0 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
v1 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* iput v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->c:F */
/* iput v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->d:F */
v4 = this.a;
/* float-to-int v0, v0 */
/* float-to-int v1, v1 */
v0 = fq .b ( v4,v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_5
v0 = this.a;
v0 = (( android.support.v4.widget.SlidingPaneLayout ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->a(Landroid/view/View;)Z
if ( v0 != null) { // if-eqz v0, :cond_5
int v0 = 1; // const/4 v0, 0x1
} // :cond_5
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
v1 = this.a;
p1 = (( fq ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lfq;->a(Landroid/view/MotionEvent;)Z
/* if-nez p1, :cond_7 */
if ( v0 != null) { // if-eqz v0, :cond_6
} // :cond_6
} // :cond_7
} // :goto_2
} // :cond_8
} // :goto_3
p1 = this.a;
(( fq ) p1 ).a ( ); // invoke-virtual {p1}, Lfq;->a()V
} // :cond_9
} // :goto_4
v0 = this.a;
(( fq ) v0 ).a ( ); // invoke-virtual {v0}, Lfq;->a()V
p1 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z */
} // .end method
protected void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 18 */
/* move-object/from16 v0, p0 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->a()Z */
int v2 = 1; // const/4 v2, 0x1
if ( v1 != null) { // if-eqz v1, :cond_0
v3 = this.a;
int v4 = 2; // const/4 v4, 0x2
/* iput v4, v3, Lfq;->d:I */
} // :cond_0
v3 = this.a;
/* iput v2, v3, Lfq;->d:I */
} // :goto_0
/* sub-int v3, p4, p2 */
if ( v1 != null) { // if-eqz v1, :cond_1
v4 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I */
} // :cond_1
v4 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I */
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_2
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I */
} // :cond_2
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I */
} // :goto_2
v6 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingTop()I */
v7 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I */
/* iget-boolean v8, v0, Landroid/support/v4/widget/SlidingPaneLayout;->d:Z */
if ( v8 != null) { // if-eqz v8, :cond_4
/* iget-boolean v8, v0, Landroid/support/v4/widget/SlidingPaneLayout;->c:Z */
if ( v8 != null) { // if-eqz v8, :cond_3
/* iget-boolean v8, v0, Landroid/support/v4/widget/SlidingPaneLayout;->b:Z */
if ( v8 != null) { // if-eqz v8, :cond_3
/* const/high16 v8, 0x3f800000 # 1.0f */
} // :cond_3
int v8 = 0; // const/4 v8, 0x0
} // :goto_3
/* iput v8, v0, Landroid/support/v4/widget/SlidingPaneLayout;->a:F */
} // :cond_4
/* move v11, v4 */
/* move v12, v11 */
int v4 = 0; // const/4 v4, 0x0
} // :goto_4
/* if-ge v4, v7, :cond_b */
(( android.support.v4.widget.SlidingPaneLayout ) v0 ).getChildAt ( v4 ); // invoke-virtual {v0, v4}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
v14 = (( android.view.View ) v13 ).getVisibility ( ); // invoke-virtual {v13}, Landroid/view/View;->getVisibility()I
/* const/16 v15, 0x8 */
/* if-eq v14, v15, :cond_a */
(( android.view.View ) v13 ).getLayoutParams ( ); // invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v14, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams; */
v15 = (( android.view.View ) v13 ).getMeasuredWidth ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I
/* iget-boolean v2, v14, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->a:Z */
if ( v2 != null) { // if-eqz v2, :cond_7
/* iget v2, v14, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I */
/* iget v8, v14, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I */
/* add-int/2addr v2, v8 */
/* sub-int v8, v3, v5 */
/* iget v10, v0, Landroid/support/v4/widget/SlidingPaneLayout;->e:I */
/* sub-int v10, v8, v10 */
v10 = java.lang.Math .min ( v11,v10 );
/* sub-int/2addr v10, v12 */
/* sub-int/2addr v10, v2 */
/* iput v10, v0, Landroid/support/v4/widget/SlidingPaneLayout;->b:I */
if ( v1 != null) { // if-eqz v1, :cond_5
/* iget v2, v14, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I */
} // :cond_5
/* iget v2, v14, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I */
} // :goto_5
/* add-int v16, v12, v2 */
/* add-int v16, v16, v10 */
/* div-int/lit8 v17, v15, 0x2 */
/* add-int v9, v16, v17 */
/* if-le v9, v8, :cond_6 */
int v8 = 1; // const/4 v8, 0x1
} // :cond_6
int v8 = 0; // const/4 v8, 0x0
} // :goto_6
/* iput-boolean v8, v14, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->b:Z */
/* int-to-float v8, v10 */
/* iget v9, v0, Landroid/support/v4/widget/SlidingPaneLayout;->a:F */
/* mul-float v8, v8, v9 */
/* float-to-int v8, v8 */
/* add-int/2addr v2, v8 */
/* add-int/2addr v2, v12 */
/* int-to-float v8, v8 */
/* iget v9, v0, Landroid/support/v4/widget/SlidingPaneLayout;->b:I */
/* int-to-float v9, v9 */
/* div-float/2addr v8, v9 */
/* iput v8, v0, Landroid/support/v4/widget/SlidingPaneLayout;->a:F */
int v8 = 0; // const/4 v8, 0x0
/* const/high16 v9, 0x3f800000 # 1.0f */
} // :cond_7
/* iget-boolean v2, v0, Landroid/support/v4/widget/SlidingPaneLayout;->c:Z */
if ( v2 != null) { // if-eqz v2, :cond_8
/* iget v2, v0, Landroid/support/v4/widget/SlidingPaneLayout;->c:I */
if ( v2 != null) { // if-eqz v2, :cond_8
/* iget v8, v0, Landroid/support/v4/widget/SlidingPaneLayout;->a:F */
/* const/high16 v9, 0x3f800000 # 1.0f */
/* sub-float v8, v9, v8 */
/* int-to-float v2, v2 */
/* mul-float v8, v8, v2 */
/* float-to-int v8, v8 */
} // :cond_8
/* const/high16 v9, 0x3f800000 # 1.0f */
int v8 = 0; // const/4 v8, 0x0
} // :goto_7
/* move v2, v11 */
} // :goto_8
if ( v1 != null) { // if-eqz v1, :cond_9
/* sub-int v10, v3, v2 */
/* add-int/2addr v10, v8 */
/* sub-int v8, v10, v15 */
} // :cond_9
/* sub-int v8, v2, v8 */
/* add-int v10, v8, v15 */
} // :goto_9
v12 = (( android.view.View ) v13 ).getMeasuredHeight ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v12, v6 */
(( android.view.View ) v13 ).layout ( v8, v6, v10, v12 ); // invoke-virtual {v13, v8, v6, v10, v12}, Landroid/view/View;->layout(IIII)V
v8 = (( android.view.View ) v13 ).getWidth ( ); // invoke-virtual {v13}, Landroid/view/View;->getWidth()I
/* add-int/2addr v11, v8 */
/* move v12, v2 */
} // :cond_a
/* const/high16 v9, 0x3f800000 # 1.0f */
} // :goto_a
/* add-int/lit8 v4, v4, 0x1 */
int v2 = 1; // const/4 v2, 0x1
/* goto/16 :goto_4 */
} // :cond_b
/* iget-boolean v1, v0, Landroid/support/v4/widget/SlidingPaneLayout;->d:Z */
if ( v1 != null) { // if-eqz v1, :cond_f
/* iget-boolean v1, v0, Landroid/support/v4/widget/SlidingPaneLayout;->c:Z */
if ( v1 != null) { // if-eqz v1, :cond_d
/* iget v1, v0, Landroid/support/v4/widget/SlidingPaneLayout;->c:I */
if ( v1 != null) { // if-eqz v1, :cond_c
/* iget v1, v0, Landroid/support/v4/widget/SlidingPaneLayout;->a:F */
(( android.support.v4.widget.SlidingPaneLayout ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->a(F)V
} // :cond_c
v1 = this.a;
(( android.view.View ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams; */
/* iget-boolean v1, v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->b:Z */
if ( v1 != null) { // if-eqz v1, :cond_e
v1 = this.a;
/* iget v2, v0, Landroid/support/v4/widget/SlidingPaneLayout;->a:F */
/* iget v3, v0, Landroid/support/v4/widget/SlidingPaneLayout;->a:I */
(( android.support.v4.widget.SlidingPaneLayout ) v0 ).a ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/widget/SlidingPaneLayout;->a(Landroid/view/View;FI)V
} // :cond_d
int v1 = 0; // const/4 v1, 0x0
} // :goto_b
/* if-ge v1, v7, :cond_e */
(( android.support.v4.widget.SlidingPaneLayout ) v0 ).getChildAt ( v1 ); // invoke-virtual {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
/* iget v3, v0, Landroid/support/v4/widget/SlidingPaneLayout;->a:I */
int v4 = 0; // const/4 v4, 0x0
(( android.support.v4.widget.SlidingPaneLayout ) v0 ).a ( v2, v4, v3 ); // invoke-virtual {v0, v2, v4, v3}, Landroid/support/v4/widget/SlidingPaneLayout;->a(Landroid/view/View;FI)V
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_e
} // :goto_c
v1 = this.a;
(( android.support.v4.widget.SlidingPaneLayout ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->a(Landroid/view/View;)V
} // :cond_f
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, v0, Landroid/support/v4/widget/SlidingPaneLayout;->d:Z */
return;
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 20 */
/* move-object/from16 v0, p0 */
v1 = /* invoke-static/range {p1 ..p1}, Landroid/view/View$MeasureSpec;->getMode(I)I */
v2 = /* invoke-static/range {p1 ..p1}, Landroid/view/View$MeasureSpec;->getSize(I)I */
v3 = /* invoke-static/range {p2 ..p2}, Landroid/view/View$MeasureSpec;->getMode(I)I */
v4 = /* invoke-static/range {p2 ..p2}, Landroid/view/View$MeasureSpec;->getSize(I)I */
/* const/16 v5, 0x12c */
/* const/high16 v6, -0x80000000 */
/* const/high16 v7, 0x40000000 # 2.0f */
/* if-eq v1, v7, :cond_1 */
v8 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isInEditMode()Z */
if ( v8 != null) { // if-eqz v8, :cond_0
/* if-eq v1, v6, :cond_3 */
/* if-nez v1, :cond_3 */
/* const/16 v2, 0x12c */
} // :cond_0
/* new-instance v1, Ljava/lang/IllegalStateException; */
final String v2 = "Width must have an exact value or MATCH_PARENT"; // const-string v2, "Width must have an exact value or MATCH_PARENT"
/* invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
} // :cond_1
/* if-nez v3, :cond_3 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isInEditMode()Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* if-nez v3, :cond_3 */
/* const/high16 v3, -0x80000000 */
/* const/16 v4, 0x12c */
} // :cond_2
/* new-instance v1, Ljava/lang/IllegalStateException; */
final String v2 = "Height must not be UNSPECIFIED"; // const-string v2, "Height must not be UNSPECIFIED"
/* invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
} // :cond_3
} // :goto_0
int v1 = 0; // const/4 v1, 0x0
/* if-eq v3, v6, :cond_5 */
/* if-eq v3, v7, :cond_4 */
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
} // :cond_4
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingTop()I */
/* sub-int/2addr v4, v5 */
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingBottom()I */
/* sub-int/2addr v4, v5 */
/* move v5, v4 */
} // :cond_5
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingTop()I */
/* sub-int/2addr v4, v5 */
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingBottom()I */
/* sub-int/2addr v4, v5 */
/* move v5, v4 */
int v4 = 0; // const/4 v4, 0x0
} // :goto_1
v8 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I */
/* sub-int v8, v2, v8 */
v9 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I */
/* sub-int/2addr v8, v9 */
v9 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I */
int v10 = 2; // const/4 v10, 0x2
/* if-le v9, v10, :cond_6 */
final String v10 = "SlidingPaneLayout"; // const-string v10, "SlidingPaneLayout"
final String v11 = "onMeasure: More than two child views are not supported."; // const-string v11, "onMeasure: More than two child views are not supported."
android.util.Log .e ( v10,v11 );
} // :cond_6
int v10 = 0; // const/4 v10, 0x0
this.a = v10;
/* move v13, v4 */
/* move v14, v8 */
int v4 = 0; // const/4 v4, 0x0
int v11 = 0; // const/4 v11, 0x0
int v12 = 0; // const/4 v12, 0x0
} // :goto_2
/* const/16 v15, 0x8 */
/* const/16 v16, 0x1 */
/* if-ge v4, v9, :cond_11 */
(( android.support.v4.widget.SlidingPaneLayout ) v0 ).getChildAt ( v4 ); // invoke-virtual {v0, v4}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v6 ).getLayoutParams ( ); // invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* move-object/from16 v7, v18 */
/* check-cast v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams; */
v10 = (( android.view.View ) v6 ).getVisibility ( ); // invoke-virtual {v6}, Landroid/view/View;->getVisibility()I
/* if-ne v10, v15, :cond_7 */
/* iput-boolean v1, v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->b:Z */
/* goto/16 :goto_8 */
} // :cond_7
/* iget v10, v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->a:F */
int v15 = 0; // const/4 v15, 0x0
/* cmpl-float v10, v10, v15 */
/* if-lez v10, :cond_8 */
/* iget v10, v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->a:F */
/* add-float/2addr v12, v10 */
/* iget v10, v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I */
if ( v10 != null) { // if-eqz v10, :cond_10
} // :cond_8
/* iget v10, v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I */
/* iget v15, v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I */
/* add-int/2addr v10, v15 */
/* iget v15, v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I */
int v1 = -2; // const/4 v1, -0x2
/* if-ne v15, v1, :cond_9 */
/* sub-int v1, v8, v10 */
/* const/high16 v10, -0x80000000 */
v1 = android.view.View$MeasureSpec .makeMeasureSpec ( v1,v10 );
/* const/high16 v10, 0x40000000 # 2.0f */
} // :cond_9
/* iget v1, v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I */
int v15 = -1; // const/4 v15, -0x1
/* if-ne v1, v15, :cond_a */
/* sub-int v1, v8, v10 */
/* const/high16 v10, 0x40000000 # 2.0f */
} // :cond_a
/* const/high16 v10, 0x40000000 # 2.0f */
/* iget v1, v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I */
} // :goto_3
v1 = android.view.View$MeasureSpec .makeMeasureSpec ( v1,v10 );
} // :goto_4
/* iget v15, v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I */
int v10 = -2; // const/4 v10, -0x2
/* if-ne v15, v10, :cond_b */
/* const/high16 v10, -0x80000000 */
} // :goto_5
v15 = android.view.View$MeasureSpec .makeMeasureSpec ( v5,v10 );
} // :cond_b
/* iget v10, v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I */
int v15 = -1; // const/4 v15, -0x1
/* if-ne v10, v15, :cond_c */
/* const/high16 v10, 0x40000000 # 2.0f */
} // :cond_c
/* const/high16 v10, 0x40000000 # 2.0f */
/* iget v15, v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I */
v15 = android.view.View$MeasureSpec .makeMeasureSpec ( v15,v10 );
} // :goto_6
(( android.view.View ) v6 ).measure ( v1, v15 ); // invoke-virtual {v6, v1, v15}, Landroid/view/View;->measure(II)V
v1 = (( android.view.View ) v6 ).getMeasuredWidth ( ); // invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I
v10 = (( android.view.View ) v6 ).getMeasuredHeight ( ); // invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I
/* const/high16 v15, -0x80000000 */
/* if-ne v3, v15, :cond_d */
/* if-le v10, v13, :cond_d */
v13 = java.lang.Math .min ( v10,v5 );
} // :cond_d
/* sub-int/2addr v14, v1 */
/* if-gez v14, :cond_e */
int v1 = 1; // const/4 v1, 0x1
} // :cond_e
int v1 = 0; // const/4 v1, 0x0
} // :goto_7
/* iput-boolean v1, v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->a:Z */
/* or-int/2addr v1, v11 */
/* iget-boolean v7, v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->a:Z */
if ( v7 != null) { // if-eqz v7, :cond_f
this.a = v6;
} // :cond_f
/* move v11, v1 */
} // :cond_10
} // :goto_8
/* add-int/lit8 v4, v4, 0x1 */
int v1 = 0; // const/4 v1, 0x0
/* const/high16 v6, -0x80000000 */
/* const/high16 v7, 0x40000000 # 2.0f */
/* goto/16 :goto_2 */
} // :cond_11
/* if-nez v11, :cond_12 */
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v3, v12, v1 */
/* if-lez v3, :cond_20 */
} // :cond_12
/* iget v1, v0, Landroid/support/v4/widget/SlidingPaneLayout;->e:I */
/* sub-int v1, v8, v1 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_9
/* if-ge v3, v9, :cond_20 */
(( android.support.v4.widget.SlidingPaneLayout ) v0 ).getChildAt ( v3 ); // invoke-virtual {v0, v3}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
v6 = (( android.view.View ) v4 ).getVisibility ( ); // invoke-virtual {v4}, Landroid/view/View;->getVisibility()I
/* if-eq v6, v15, :cond_1e */
(( android.view.View ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v6, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams; */
v7 = (( android.view.View ) v4 ).getVisibility ( ); // invoke-virtual {v4}, Landroid/view/View;->getVisibility()I
/* if-eq v7, v15, :cond_1e */
/* iget v7, v6, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I */
/* if-nez v7, :cond_13 */
/* iget v7, v6, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->a:F */
int v10 = 0; // const/4 v10, 0x0
/* cmpl-float v7, v7, v10 */
/* if-lez v7, :cond_13 */
int v7 = 1; // const/4 v7, 0x1
} // :cond_13
int v7 = 0; // const/4 v7, 0x0
} // :goto_a
if ( v7 != null) { // if-eqz v7, :cond_14
int v10 = 0; // const/4 v10, 0x0
} // :cond_14
v10 = (( android.view.View ) v4 ).getMeasuredWidth ( ); // invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I
} // :goto_b
if ( v11 != null) { // if-eqz v11, :cond_19
v15 = this.a;
/* if-eq v4, v15, :cond_19 */
/* iget v15, v6, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I */
/* if-gez v15, :cond_1e */
/* if-gt v10, v1, :cond_15 */
/* iget v10, v6, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->a:F */
int v15 = 0; // const/4 v15, 0x0
/* cmpl-float v10, v10, v15 */
/* if-lez v10, :cond_1e */
} // :cond_15
if ( v7 != null) { // if-eqz v7, :cond_18
/* iget v7, v6, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I */
int v10 = -2; // const/4 v10, -0x2
/* if-ne v7, v10, :cond_16 */
/* const/high16 v7, -0x80000000 */
v6 = android.view.View$MeasureSpec .makeMeasureSpec ( v5,v7 );
/* const/high16 v7, 0x40000000 # 2.0f */
} // :cond_16
/* iget v7, v6, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I */
int v10 = -1; // const/4 v10, -0x1
/* if-ne v7, v10, :cond_17 */
/* const/high16 v7, 0x40000000 # 2.0f */
v6 = android.view.View$MeasureSpec .makeMeasureSpec ( v5,v7 );
} // :cond_17
/* const/high16 v7, 0x40000000 # 2.0f */
/* iget v6, v6, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I */
} // :cond_18
/* const/high16 v7, 0x40000000 # 2.0f */
v6 = (( android.view.View ) v4 ).getMeasuredHeight ( ); // invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I
} // :goto_c
v6 = android.view.View$MeasureSpec .makeMeasureSpec ( v6,v7 );
} // :goto_d
v10 = android.view.View$MeasureSpec .makeMeasureSpec ( v1,v7 );
(( android.view.View ) v4 ).measure ( v10, v6 ); // invoke-virtual {v4, v10, v6}, Landroid/view/View;->measure(II)V
} // :cond_19
/* iget v7, v6, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->a:F */
int v15 = 0; // const/4 v15, 0x0
/* cmpl-float v7, v7, v15 */
/* if-lez v7, :cond_1e */
/* iget v7, v6, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I */
/* if-nez v7, :cond_1c */
/* iget v7, v6, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I */
int v15 = -2; // const/4 v15, -0x2
/* if-ne v7, v15, :cond_1a */
/* const/high16 v7, -0x80000000 */
v17 = android.view.View$MeasureSpec .makeMeasureSpec ( v5,v7 );
/* move/from16 v15, v17 */
/* const/high16 v7, 0x40000000 # 2.0f */
} // :cond_1a
/* iget v7, v6, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I */
int v15 = -1; // const/4 v15, -0x1
/* if-ne v7, v15, :cond_1b */
/* const/high16 v7, 0x40000000 # 2.0f */
v19 = android.view.View$MeasureSpec .makeMeasureSpec ( v5,v7 );
/* move/from16 v15, v19 */
} // :cond_1b
/* const/high16 v7, 0x40000000 # 2.0f */
/* iget v15, v6, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I */
} // :cond_1c
/* const/high16 v7, 0x40000000 # 2.0f */
v15 = (( android.view.View ) v4 ).getMeasuredHeight ( ); // invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I
} // :goto_e
v15 = android.view.View$MeasureSpec .makeMeasureSpec ( v15,v7 );
} // :goto_f
if ( v11 != null) { // if-eqz v11, :cond_1d
/* iget v7, v6, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I */
/* iget v6, v6, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I */
/* add-int/2addr v7, v6 */
/* sub-int v6, v8, v7 */
/* move/from16 v19, v1 */
/* const/high16 v7, 0x40000000 # 2.0f */
v1 = android.view.View$MeasureSpec .makeMeasureSpec ( v6,v7 );
/* if-eq v10, v6, :cond_1f */
(( android.view.View ) v4 ).measure ( v1, v15 ); // invoke-virtual {v4, v1, v15}, Landroid/view/View;->measure(II)V
} // :cond_1d
/* move/from16 v19, v1 */
int v1 = 0; // const/4 v1, 0x0
v7 = java.lang.Math .max ( v1,v14 );
/* iget v6, v6, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->a:F */
/* int-to-float v7, v7 */
/* mul-float v6, v6, v7 */
/* div-float/2addr v6, v12 */
/* float-to-int v6, v6 */
/* add-int/2addr v10, v6 */
/* const/high16 v6, 0x40000000 # 2.0f */
v7 = android.view.View$MeasureSpec .makeMeasureSpec ( v10,v6 );
(( android.view.View ) v4 ).measure ( v7, v15 ); // invoke-virtual {v4, v7, v15}, Landroid/view/View;->measure(II)V
} // :cond_1e
} // :goto_10
/* move/from16 v19, v1 */
} // :cond_1f
} // :goto_11
int v1 = 0; // const/4 v1, 0x0
/* const/high16 v6, 0x40000000 # 2.0f */
} // :goto_12
/* add-int/lit8 v3, v3, 0x1 */
/* move/from16 v1, v19 */
/* const/16 v15, 0x8 */
/* goto/16 :goto_9 */
} // :cond_20
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingTop()I */
/* add-int/2addr v13, v1 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingBottom()I */
/* add-int/2addr v13, v1 */
(( android.support.v4.widget.SlidingPaneLayout ) v0 ).setMeasuredDimension ( v2, v13 ); // invoke-virtual {v0, v2, v13}, Landroid/support/v4/widget/SlidingPaneLayout;->setMeasuredDimension(II)V
/* iput-boolean v11, v0, Landroid/support/v4/widget/SlidingPaneLayout;->c:Z */
v1 = this.a;
/* iget v1, v1, Lfq;->a:I */
if ( v1 != null) { // if-eqz v1, :cond_21
/* if-nez v11, :cond_21 */
v1 = this.a;
(( fq ) v1 ).b ( ); // invoke-virtual {v1}, Lfq;->b()V
} // :cond_21
return;
} // .end method
protected void onRestoreInstanceState ( android.os.Parcelable p0 ) {
/* .locals 1 */
/* instance-of v0, p1, Landroid/support/v4/widget/SlidingPaneLayout$e; */
/* if-nez v0, :cond_0 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
return;
} // :cond_0
/* check-cast p1, Landroid/support/v4/widget/SlidingPaneLayout$e; */
v0 = this.a;
/* invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
/* iget-boolean v0, p1, Landroid/support/v4/widget/SlidingPaneLayout$e;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->d:Z */
/* if-nez v0, :cond_1 */
/* const/high16 v0, 0x3f800000 # 1.0f */
v0 = /* invoke-direct {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->a(F)Z */
if ( v0 != null) { // if-eqz v0, :cond_3
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->b:Z */
} // :cond_2
/* invoke-direct {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->b()Z */
} // :cond_3
} // :goto_0
/* iget-boolean p1, p1, Landroid/support/v4/widget/SlidingPaneLayout$e;->a:Z */
/* iput-boolean p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->b:Z */
return;
} // .end method
protected android.os.Parcelable onSaveInstanceState ( ) {
/* .locals 3 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable; */
/* new-instance v1, Landroid/support/v4/widget/SlidingPaneLayout$e; */
/* invoke-direct {v1, v0}, Landroid/support/v4/widget/SlidingPaneLayout$e;-><init>(Landroid/os/Parcelable;)V */
/* iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->a:F */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* cmpl-float v0, v0, v2 */
/* if-nez v0, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
/* iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->b:Z */
} // :goto_1
/* iput-boolean v0, v1, Landroid/support/v4/widget/SlidingPaneLayout$e;->a:Z */
} // .end method
protected void onSizeChanged ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V */
/* if-eq p1, p3, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
/* iput-boolean p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->d:Z */
} // :cond_0
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 4 */
/* iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->c:Z */
/* if-nez v0, :cond_0 */
p1 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z */
} // :cond_0
v0 = this.a;
(( fq ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lfq;->a(Landroid/view/MotionEvent;)V
v0 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
/* packed-switch v0, :pswitch_data_0 */
/* :pswitch_0 */
v0 = this.a;
v0 = (( android.support.v4.widget.SlidingPaneLayout ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->a(Landroid/view/View;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
p1 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* iget v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->c:F */
/* sub-float v1, v0, v1 */
/* iget v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->d:F */
/* sub-float v2, p1, v2 */
v3 = this.a;
/* iget v3, v3, Lfq;->b:I */
/* mul-float v1, v1, v1 */
/* mul-float v2, v2, v2 */
/* add-float/2addr v1, v2 */
/* mul-int v3, v3, v3 */
/* int-to-float v2, v3 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_1 */
v1 = this.a;
/* float-to-int v0, v0 */
/* float-to-int p1, p1 */
p1 = fq .b ( v1,v0,p1 );
if ( p1 != null) { // if-eqz p1, :cond_1
/* invoke-direct {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->b()Z */
/* :pswitch_1 */
v0 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
p1 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* iput v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->c:F */
/* iput p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->d:F */
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public void requestChildFocus ( android.view.View p0, android.view.View p1 ) {
/* .locals 0 */
/* invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V */
p2 = (( android.support.v4.widget.SlidingPaneLayout ) p0 ).isInTouchMode ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isInTouchMode()Z
/* if-nez p2, :cond_1 */
/* iget-boolean p2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->c:Z */
/* if-nez p2, :cond_1 */
p2 = this.a;
/* if-ne p1, p2, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
/* iput-boolean p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->b:Z */
} // :cond_1
return;
} // .end method
public void setCoveredFadeColor ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->d:I */
return;
} // .end method
public void setPanelSlideListener ( android.support.v4.widget.SlidingPaneLayout$d p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
public void setParallaxDistance ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->c:I */
(( android.support.v4.widget.SlidingPaneLayout ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->requestLayout()V
return;
} // .end method
public void setShadowDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
(( android.support.v4.widget.SlidingPaneLayout ) p0 ).setShadowDrawableLeft ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout;->setShadowDrawableLeft(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setShadowDrawableLeft ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
public void setShadowDrawableRight ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
this.b = p1;
return;
} // .end method
public void setShadowResource ( Integer p0 ) {
/* .locals 1 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
(( android.support.v4.widget.SlidingPaneLayout ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getDrawable ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
(( android.support.v4.widget.SlidingPaneLayout ) p0 ).setShadowDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout;->setShadowDrawable(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setShadowResourceLeft ( Integer p0 ) {
/* .locals 1 */
(( android.support.v4.widget.SlidingPaneLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getContext()Landroid/content/Context;
ce .a ( v0,p1 );
(( android.support.v4.widget.SlidingPaneLayout ) p0 ).setShadowDrawableLeft ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout;->setShadowDrawableLeft(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setShadowResourceRight ( Integer p0 ) {
/* .locals 1 */
(( android.support.v4.widget.SlidingPaneLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getContext()Landroid/content/Context;
ce .a ( v0,p1 );
(( android.support.v4.widget.SlidingPaneLayout ) p0 ).setShadowDrawableRight ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout;->setShadowDrawableRight(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setSliderFadeColor ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->a:I */
return;
} // .end method
