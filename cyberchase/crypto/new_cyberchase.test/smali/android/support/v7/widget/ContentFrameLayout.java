public class android.support.v7.widget.ContentFrameLayout extends android.widget.FrameLayout {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/v7/widget/ContentFrameLayout$a; */
	 /* } */
} // .end annotation
/* # instance fields */
private final android.graphics.Rect a;
private android.support.v7.widget.ContentFrameLayout$a a;
private android.util.TypedValue a;
private android.util.TypedValue b;
private android.util.TypedValue c;
private android.util.TypedValue d;
private android.util.TypedValue e;
private android.util.TypedValue f;
/* # direct methods */
public android.support.v7.widget.ContentFrameLayout ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/ContentFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 return;
} // .end method
public android.support.v7.widget.ContentFrameLayout ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/ContentFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 return;
} // .end method
public android.support.v7.widget.ContentFrameLayout ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 /* new-instance p1, Landroid/graphics/Rect; */
	 /* invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V */
	 this.a = p1;
	 return;
} // .end method
/* # virtual methods */
public final void a ( android.graphics.Rect p0 ) {
	 /* .locals 0 */
	 (( android.support.v7.widget.ContentFrameLayout ) p0 ).fitSystemWindows ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/ContentFrameLayout;->fitSystemWindows(Landroid/graphics/Rect;)Z
	 return;
} // .end method
public android.util.TypedValue getFixedHeightMajor ( ) {
	 /* .locals 1 */
	 v0 = this.e;
	 /* if-nez v0, :cond_0 */
	 /* new-instance v0, Landroid/util/TypedValue; */
	 /* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
	 this.e = v0;
} // :cond_0
v0 = this.e;
} // .end method
public android.util.TypedValue getFixedHeightMinor ( ) {
/* .locals 1 */
v0 = this.f;
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
this.f = v0;
} // :cond_0
v0 = this.f;
} // .end method
public android.util.TypedValue getFixedWidthMajor ( ) {
/* .locals 1 */
v0 = this.c;
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
this.c = v0;
} // :cond_0
v0 = this.c;
} // .end method
public android.util.TypedValue getFixedWidthMinor ( ) {
/* .locals 1 */
v0 = this.d;
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
this.d = v0;
} // :cond_0
v0 = this.d;
} // .end method
public android.util.TypedValue getMinWidthMajor ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
this.a = v0;
} // :cond_0
v0 = this.a;
} // .end method
public android.util.TypedValue getMinWidthMinor ( ) {
/* .locals 1 */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
this.b = v0;
} // :cond_0
v0 = this.b;
} // .end method
protected void onAttachedToWindow ( ) {
/* .locals 0 */
/* invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V */
return;
} // .end method
protected void onDetachedFromWindow ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
return;
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 13 */
(( android.support.v7.widget.ContentFrameLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ContentFrameLayout;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I */
/* iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I */
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
/* if-ge v1, v2, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
v2 = android.view.View$MeasureSpec .getMode ( p1 );
v5 = android.view.View$MeasureSpec .getMode ( p2 );
int v6 = 6; // const/4 v6, 0x6
int v7 = 5; // const/4 v7, 0x5
/* const/high16 v8, -0x80000000 */
/* const/high16 v9, 0x40000000 # 2.0f */
/* if-ne v2, v8, :cond_4 */
if ( v1 != null) { // if-eqz v1, :cond_1
v10 = this.d;
} // :cond_1
v10 = this.c;
} // :goto_1
if ( v10 != null) { // if-eqz v10, :cond_4
/* iget v11, v10, Landroid/util/TypedValue;->type:I */
if ( v11 != null) { // if-eqz v11, :cond_4
/* iget v11, v10, Landroid/util/TypedValue;->type:I */
/* if-ne v11, v7, :cond_2 */
v10 = (( android.util.TypedValue ) v10 ).getDimension ( v0 ); // invoke-virtual {v10, v0}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F
} // :goto_2
/* float-to-int v10, v10 */
} // :cond_2
/* iget v11, v10, Landroid/util/TypedValue;->type:I */
/* if-ne v11, v6, :cond_3 */
/* iget v11, v0, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-float v11, v11 */
/* iget v12, v0, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-float v12, v12 */
v10 = (( android.util.TypedValue ) v10 ).getFraction ( v11, v12 ); // invoke-virtual {v10, v11, v12}, Landroid/util/TypedValue;->getFraction(FF)F
} // :cond_3
int v10 = 0; // const/4 v10, 0x0
} // :goto_3
/* if-lez v10, :cond_4 */
v11 = this.a;
/* iget v11, v11, Landroid/graphics/Rect;->left:I */
v12 = this.a;
/* iget v12, v12, Landroid/graphics/Rect;->right:I */
/* add-int/2addr v11, v12 */
/* sub-int/2addr v10, v11 */
p1 = android.view.View$MeasureSpec .getSize ( p1 );
p1 = java.lang.Math .min ( v10,p1 );
p1 = android.view.View$MeasureSpec .makeMeasureSpec ( p1,v9 );
/* move v10, p1 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_4
/* move v10, p1 */
int p1 = 0; // const/4 p1, 0x0
} // :goto_4
/* if-ne v5, v8, :cond_8 */
if ( v1 != null) { // if-eqz v1, :cond_5
v5 = this.e;
} // :cond_5
v5 = this.f;
} // :goto_5
if ( v5 != null) { // if-eqz v5, :cond_8
/* iget v11, v5, Landroid/util/TypedValue;->type:I */
if ( v11 != null) { // if-eqz v11, :cond_8
/* iget v11, v5, Landroid/util/TypedValue;->type:I */
/* if-ne v11, v7, :cond_6 */
v5 = (( android.util.TypedValue ) v5 ).getDimension ( v0 ); // invoke-virtual {v5, v0}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F
} // :goto_6
/* float-to-int v5, v5 */
} // :cond_6
/* iget v11, v5, Landroid/util/TypedValue;->type:I */
/* if-ne v11, v6, :cond_7 */
/* iget v11, v0, Landroid/util/DisplayMetrics;->heightPixels:I */
/* int-to-float v11, v11 */
/* iget v12, v0, Landroid/util/DisplayMetrics;->heightPixels:I */
/* int-to-float v12, v12 */
v5 = (( android.util.TypedValue ) v5 ).getFraction ( v11, v12 ); // invoke-virtual {v5, v11, v12}, Landroid/util/TypedValue;->getFraction(FF)F
} // :cond_7
int v5 = 0; // const/4 v5, 0x0
} // :goto_7
/* if-lez v5, :cond_8 */
v11 = this.a;
/* iget v11, v11, Landroid/graphics/Rect;->top:I */
v12 = this.a;
/* iget v12, v12, Landroid/graphics/Rect;->bottom:I */
/* add-int/2addr v11, v12 */
/* sub-int/2addr v5, v11 */
p2 = android.view.View$MeasureSpec .getSize ( p2 );
p2 = java.lang.Math .min ( v5,p2 );
p2 = android.view.View$MeasureSpec .makeMeasureSpec ( p2,v9 );
} // :cond_8
/* invoke-super {p0, v10, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V */
v5 = (( android.support.v7.widget.ContentFrameLayout ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ContentFrameLayout;->getMeasuredWidth()I
v10 = android.view.View$MeasureSpec .makeMeasureSpec ( v5,v9 );
/* if-nez p1, :cond_d */
/* if-ne v2, v8, :cond_d */
if ( v1 != null) { // if-eqz v1, :cond_9
p1 = this.b;
} // :cond_9
p1 = this.a;
} // :goto_8
if ( p1 != null) { // if-eqz p1, :cond_d
/* iget v1, p1, Landroid/util/TypedValue;->type:I */
if ( v1 != null) { // if-eqz v1, :cond_d
/* iget v1, p1, Landroid/util/TypedValue;->type:I */
/* if-ne v1, v7, :cond_a */
p1 = (( android.util.TypedValue ) p1 ).getDimension ( v0 ); // invoke-virtual {p1, v0}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F
} // :goto_9
/* float-to-int p1, p1 */
} // :cond_a
/* iget v1, p1, Landroid/util/TypedValue;->type:I */
/* if-ne v1, v6, :cond_b */
/* iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-float v1, v1 */
/* iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-float v0, v0 */
p1 = (( android.util.TypedValue ) p1 ).getFraction ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/util/TypedValue;->getFraction(FF)F
} // :cond_b
int p1 = 0; // const/4 p1, 0x0
} // :goto_a
/* if-lez p1, :cond_c */
v0 = this.a;
/* iget v0, v0, Landroid/graphics/Rect;->left:I */
v1 = this.a;
/* iget v1, v1, Landroid/graphics/Rect;->right:I */
/* add-int/2addr v0, v1 */
/* sub-int/2addr p1, v0 */
} // :cond_c
/* if-ge v5, p1, :cond_d */
v10 = android.view.View$MeasureSpec .makeMeasureSpec ( p1,v9 );
} // :cond_d
int v3 = 0; // const/4 v3, 0x0
} // :goto_b
if ( v3 != null) { // if-eqz v3, :cond_e
/* invoke-super {p0, v10, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V */
} // :cond_e
return;
} // .end method
public void setAttachListener ( android.support.v7.widget.ContentFrameLayout$a p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
public void setDecorPadding ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
v0 = this.a;
(( android.graphics.Rect ) v0 ).set ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V
p1 = em .d ( p0 );
if ( p1 != null) { // if-eqz p1, :cond_0
(( android.support.v7.widget.ContentFrameLayout ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ContentFrameLayout;->requestLayout()V
} // :cond_0
return;
} // .end method
