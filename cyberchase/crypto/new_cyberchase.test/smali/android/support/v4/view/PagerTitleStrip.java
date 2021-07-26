public class android.support.v4.view.PagerTitleStrip extends android.view.ViewGroup {
	 /* # annotations */
	 /* .annotation runtime Landroid/support/v4/view/ViewPager$a; */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Landroid/support/v4/view/PagerTitleStrip$a;, */
/* Landroid/support/v4/view/PagerTitleStrip$b; */
/* } */
} // .end annotation
/* # static fields */
private static final a;
private static final b;
/* # instance fields */
Float a;
Integer a;
private final android.support.v4.view.PagerTitleStrip$a a;
android.support.v4.view.ViewPager a;
android.widget.TextView a;
private java.lang.ref.WeakReference a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ref/WeakReference<", */
/* "Lek;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private Boolean a;
private Integer b;
android.widget.TextView b;
private Boolean b;
private Integer c;
android.widget.TextView c;
private Integer d;
private Integer e;
/* # direct methods */
static android.support.v4.view.PagerTitleStrip ( ) {
/* .locals 3 */
int v0 = 4; // const/4 v0, 0x4
/* new-array v0, v0, [I */
/* fill-array-data v0, :array_0 */
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [I */
int v1 = 0; // const/4 v1, 0x0
/* const v2, 0x101038c */
/* aput v2, v0, v1 */
return;
/* :array_0 */
/* .array-data 4 */
/* 0x1010034 */
/* 0x1010095 */
/* 0x1010098 */
/* 0x10100af */
} // .end array-data
} // .end method
public android.support.v4.view.PagerTitleStrip ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, v0}, Landroid/support/v4/view/PagerTitleStrip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
return;
} // .end method
public android.support.v4.view.PagerTitleStrip ( ) {
/* .locals 4 */
/* invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Landroid/support/v4/view/PagerTitleStrip;->b:I */
/* const/high16 v0, -0x40800000 # -1.0f */
/* iput v0, p0, Landroid/support/v4/view/PagerTitleStrip;->a:F */
/* new-instance v0, Landroid/support/v4/view/PagerTitleStrip$a; */
/* invoke-direct {v0, p0}, Landroid/support/v4/view/PagerTitleStrip$a;-><init>(Landroid/support/v4/view/PagerTitleStrip;)V */
this.a = v0;
/* new-instance v0, Landroid/widget/TextView; */
/* invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V */
this.a = v0;
(( android.support.v4.view.PagerTitleStrip ) p0 ).addView ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/view/PagerTitleStrip;->addView(Landroid/view/View;)V
/* new-instance v0, Landroid/widget/TextView; */
/* invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V */
this.b = v0;
(( android.support.v4.view.PagerTitleStrip ) p0 ).addView ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/view/PagerTitleStrip;->addView(Landroid/view/View;)V
/* new-instance v0, Landroid/widget/TextView; */
/* invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V */
this.c = v0;
(( android.support.v4.view.PagerTitleStrip ) p0 ).addView ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/view/PagerTitleStrip;->addView(Landroid/view/View;)V
v0 = android.support.v4.view.PagerTitleStrip.a;
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
int v0 = 0; // const/4 v0, 0x0
v1 = (( android.content.res.TypedArray ) p2 ).getResourceId ( v0, v0 ); // invoke-virtual {p2, v0, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I
if ( v1 != null) { // if-eqz v1, :cond_0
v2 = this.a;
fn .a ( v2,v1 );
v2 = this.b;
fn .a ( v2,v1 );
v2 = this.c;
fn .a ( v2,v1 );
} // :cond_0
int v2 = 1; // const/4 v2, 0x1
v2 = (( android.content.res.TypedArray ) p2 ).getDimensionPixelSize ( v2, v0 ); // invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
if ( v2 != null) { // if-eqz v2, :cond_1
/* int-to-float v2, v2 */
(( android.support.v4.view.PagerTitleStrip ) p0 ).setTextSize ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Landroid/support/v4/view/PagerTitleStrip;->setTextSize(IF)V
} // :cond_1
int v2 = 2; // const/4 v2, 0x2
v3 = (( android.content.res.TypedArray ) p2 ).hasValue ( v2 ); // invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( v3 != null) { // if-eqz v3, :cond_2
v2 = (( android.content.res.TypedArray ) p2 ).getColor ( v2, v0 ); // invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getColor(II)I
v3 = this.a;
(( android.widget.TextView ) v3 ).setTextColor ( v2 ); // invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V
v3 = this.b;
(( android.widget.TextView ) v3 ).setTextColor ( v2 ); // invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V
v3 = this.c;
(( android.widget.TextView ) v3 ).setTextColor ( v2 ); // invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V
} // :cond_2
int v2 = 3; // const/4 v2, 0x3
/* const/16 v3, 0x50 */
v2 = (( android.content.res.TypedArray ) p2 ).getInteger ( v2, v3 ); // invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getInteger(II)I
/* iput v2, p0, Landroid/support/v4/view/PagerTitleStrip;->d:I */
(( android.content.res.TypedArray ) p2 ).recycle ( ); // invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V
p2 = this.b;
(( android.widget.TextView ) p2 ).getTextColors ( ); // invoke-virtual {p2}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;
p2 = (( android.content.res.ColorStateList ) p2 ).getDefaultColor ( ); // invoke-virtual {p2}, Landroid/content/res/ColorStateList;->getDefaultColor()I
/* iput p2, p0, Landroid/support/v4/view/PagerTitleStrip;->a:I */
/* const p2, 0x3f19999a # 0.6f */
(( android.support.v4.view.PagerTitleStrip ) p0 ).setNonPrimaryAlpha ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v4/view/PagerTitleStrip;->setNonPrimaryAlpha(F)V
p2 = this.a;
v2 = android.text.TextUtils$TruncateAt.END;
(( android.widget.TextView ) p2 ).setEllipsize ( v2 ); // invoke-virtual {p2, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V
p2 = this.b;
v2 = android.text.TextUtils$TruncateAt.END;
(( android.widget.TextView ) p2 ).setEllipsize ( v2 ); // invoke-virtual {p2, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V
p2 = this.c;
v2 = android.text.TextUtils$TruncateAt.END;
(( android.widget.TextView ) p2 ).setEllipsize ( v2 ); // invoke-virtual {p2, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V
if ( v1 != null) { // if-eqz v1, :cond_3
p2 = android.support.v4.view.PagerTitleStrip.b;
(( android.content.Context ) p1 ).obtainStyledAttributes ( v1, p2 ); // invoke-virtual {p1, v1, p2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;
v0 = (( android.content.res.TypedArray ) p2 ).getBoolean ( v0, v0 ); // invoke-virtual {p2, v0, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
(( android.content.res.TypedArray ) p2 ).recycle ( ); // invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V
} // :cond_3
if ( v0 != null) { // if-eqz v0, :cond_4
p2 = this.a;
android.support.v4.view.PagerTitleStrip .setSingleLineAllCaps ( p2 );
p2 = this.b;
android.support.v4.view.PagerTitleStrip .setSingleLineAllCaps ( p2 );
p2 = this.c;
android.support.v4.view.PagerTitleStrip .setSingleLineAllCaps ( p2 );
} // :cond_4
p2 = this.a;
(( android.widget.TextView ) p2 ).setSingleLine ( ); // invoke-virtual {p2}, Landroid/widget/TextView;->setSingleLine()V
p2 = this.b;
(( android.widget.TextView ) p2 ).setSingleLine ( ); // invoke-virtual {p2}, Landroid/widget/TextView;->setSingleLine()V
p2 = this.c;
(( android.widget.TextView ) p2 ).setSingleLine ( ); // invoke-virtual {p2}, Landroid/widget/TextView;->setSingleLine()V
} // :goto_0
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) p1 ).getDisplayMetrics ( ); // invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget p1, p1, Landroid/util/DisplayMetrics;->density:F */
/* const/high16 p2, 0x41800000 # 16.0f */
/* mul-float p1, p1, p2 */
/* float-to-int p1, p1 */
/* iput p1, p0, Landroid/support/v4/view/PagerTitleStrip;->c:I */
return;
} // .end method
private static void setSingleLineAllCaps ( android.widget.TextView p0 ) {
/* .locals 2 */
/* new-instance v0, Landroid/support/v4/view/PagerTitleStrip$b; */
(( android.widget.TextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1}, Landroid/support/v4/view/PagerTitleStrip$b;-><init>(Landroid/content/Context;)V */
(( android.widget.TextView ) p0 ).setTransformationMethod ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V
return;
} // .end method
/* # virtual methods */
final void a ( Integer p0 ) {
/* .locals 5 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Landroid/support/v4/view/PagerTitleStrip;->a:Z */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
v0 = this.b;
(( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
v0 = this.c;
(( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
v0 = (( android.support.v4.view.PagerTitleStrip ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getWidth()I
v1 = (( android.support.v4.view.PagerTitleStrip ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingLeft()I
/* sub-int/2addr v0, v1 */
v1 = (( android.support.v4.view.PagerTitleStrip ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingRight()I
/* sub-int/2addr v0, v1 */
/* int-to-float v0, v0 */
/* const v1, 0x3f4ccccd # 0.8f */
/* mul-float v0, v0, v1 */
/* float-to-int v0, v0 */
int v1 = 0; // const/4 v1, 0x0
v0 = java.lang.Math .max ( v1,v0 );
/* const/high16 v2, -0x80000000 */
v0 = android.view.View$MeasureSpec .makeMeasureSpec ( v0,v2 );
v3 = (( android.support.v4.view.PagerTitleStrip ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getHeight()I
v4 = (( android.support.v4.view.PagerTitleStrip ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingTop()I
/* sub-int/2addr v3, v4 */
v4 = (( android.support.v4.view.PagerTitleStrip ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingBottom()I
/* sub-int/2addr v3, v4 */
v3 = java.lang.Math .max ( v1,v3 );
v2 = android.view.View$MeasureSpec .makeMeasureSpec ( v3,v2 );
v3 = this.a;
(( android.widget.TextView ) v3 ).measure ( v0, v2 ); // invoke-virtual {v3, v0, v2}, Landroid/widget/TextView;->measure(II)V
v3 = this.b;
(( android.widget.TextView ) v3 ).measure ( v0, v2 ); // invoke-virtual {v3, v0, v2}, Landroid/widget/TextView;->measure(II)V
v3 = this.c;
(( android.widget.TextView ) v3 ).measure ( v0, v2 ); // invoke-virtual {v3, v0, v2}, Landroid/widget/TextView;->measure(II)V
/* iput p1, p0, Landroid/support/v4/view/PagerTitleStrip;->b:I */
/* iget-boolean v0, p0, Landroid/support/v4/view/PagerTitleStrip;->b:Z */
/* if-nez v0, :cond_0 */
/* iget v0, p0, Landroid/support/v4/view/PagerTitleStrip;->a:F */
(( android.support.v4.view.PagerTitleStrip ) p0 ).a ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Landroid/support/v4/view/PagerTitleStrip;->a(IFZ)V
} // :cond_0
/* iput-boolean v1, p0, Landroid/support/v4/view/PagerTitleStrip;->a:Z */
return;
} // .end method
void a ( Integer p0, Float p1, Boolean p2 ) {
/* .locals 17 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, p2 */
/* iget v2, v0, Landroid/support/v4/view/PagerTitleStrip;->b:I */
/* move/from16 v3, p1 */
/* if-eq v3, v2, :cond_0 */
v2 = this.a;
(( android.support.v4.view.ViewPager ) v2 ).getAdapter ( ); // invoke-virtual {v2}, Landroid/support/v4/view/ViewPager;->getAdapter()Lek;
/* invoke-virtual/range {p0 ..p1}, Landroid/support/v4/view/PagerTitleStrip;->a(I)V */
} // :cond_0
/* if-nez p3, :cond_1 */
/* iget v2, v0, Landroid/support/v4/view/PagerTitleStrip;->a:F */
/* cmpl-float v2, v1, v2 */
/* if-nez v2, :cond_1 */
return;
} // :cond_1
} // :goto_0
int v2 = 1; // const/4 v2, 0x1
/* iput-boolean v2, v0, Landroid/support/v4/view/PagerTitleStrip;->b:Z */
v2 = this.a;
v2 = (( android.widget.TextView ) v2 ).getMeasuredWidth ( ); // invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredWidth()I
v3 = this.b;
v3 = (( android.widget.TextView ) v3 ).getMeasuredWidth ( ); // invoke-virtual {v3}, Landroid/widget/TextView;->getMeasuredWidth()I
v4 = this.c;
v4 = (( android.widget.TextView ) v4 ).getMeasuredWidth ( ); // invoke-virtual {v4}, Landroid/widget/TextView;->getMeasuredWidth()I
/* div-int/lit8 v5, v3, 0x2 */
v6 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/view/PagerTitleStrip;->getWidth()I */
v7 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/view/PagerTitleStrip;->getHeight()I */
v8 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingLeft()I */
v9 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingRight()I */
v10 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingTop()I */
v11 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingBottom()I */
/* add-int v12, v8, v5 */
/* add-int v13, v9, v5 */
/* sub-int v12, v6, v12 */
/* sub-int/2addr v12, v13 */
/* const/high16 v14, 0x3f000000 # 0.5f */
/* add-float/2addr v14, v1 */
/* const/high16 v15, 0x3f800000 # 1.0f */
/* cmpl-float v16, v14, v15 */
/* if-lez v16, :cond_2 */
/* sub-float/2addr v14, v15 */
} // :cond_2
/* sub-int v13, v6, v13 */
/* int-to-float v12, v12 */
/* mul-float v12, v12, v14 */
/* float-to-int v12, v12 */
/* sub-int/2addr v13, v12 */
/* sub-int/2addr v13, v5 */
/* add-int/2addr v3, v13 */
v5 = this.a;
v5 = (( android.widget.TextView ) v5 ).getBaseline ( ); // invoke-virtual {v5}, Landroid/widget/TextView;->getBaseline()I
v12 = this.b;
v12 = (( android.widget.TextView ) v12 ).getBaseline ( ); // invoke-virtual {v12}, Landroid/widget/TextView;->getBaseline()I
v14 = this.c;
v14 = (( android.widget.TextView ) v14 ).getBaseline ( ); // invoke-virtual {v14}, Landroid/widget/TextView;->getBaseline()I
v15 = java.lang.Math .max ( v5,v12 );
v15 = java.lang.Math .max ( v15,v14 );
/* sub-int v5, v15, v5 */
/* sub-int v12, v15, v12 */
/* sub-int/2addr v15, v14 */
v14 = this.a;
v14 = (( android.widget.TextView ) v14 ).getMeasuredHeight ( ); // invoke-virtual {v14}, Landroid/widget/TextView;->getMeasuredHeight()I
/* add-int/2addr v14, v5 */
v1 = this.b;
v1 = (( android.widget.TextView ) v1 ).getMeasuredHeight ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->getMeasuredHeight()I
/* add-int/2addr v1, v12 */
/* move/from16 p1, v4 */
v4 = this.c;
v4 = (( android.widget.TextView ) v4 ).getMeasuredHeight ( ); // invoke-virtual {v4}, Landroid/widget/TextView;->getMeasuredHeight()I
/* add-int/2addr v4, v15 */
v1 = java.lang.Math .max ( v14,v1 );
v1 = java.lang.Math .max ( v1,v4 );
/* iget v4, v0, Landroid/support/v4/view/PagerTitleStrip;->d:I */
/* and-int/lit8 v4, v4, 0x70 */
/* const/16 v14, 0x10 */
/* if-eq v4, v14, :cond_4 */
/* const/16 v14, 0x50 */
/* if-eq v4, v14, :cond_3 */
/* add-int/2addr v5, v10 */
/* add-int/2addr v12, v10 */
/* add-int/2addr v10, v15 */
} // :cond_3
/* sub-int/2addr v7, v11 */
/* sub-int/2addr v7, v1 */
} // :cond_4
/* sub-int/2addr v7, v10 */
/* sub-int/2addr v7, v11 */
/* sub-int/2addr v7, v1 */
/* div-int/lit8 v7, v7, 0x2 */
} // :goto_1
/* add-int/2addr v5, v7 */
/* add-int/2addr v12, v7 */
/* add-int v10, v7, v15 */
} // :goto_2
v1 = this.b;
v4 = (( android.widget.TextView ) v1 ).getMeasuredHeight ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->getMeasuredHeight()I
/* add-int/2addr v4, v12 */
(( android.widget.TextView ) v1 ).layout ( v13, v12, v3, v4 ); // invoke-virtual {v1, v13, v12, v3, v4}, Landroid/widget/TextView;->layout(IIII)V
/* iget v1, v0, Landroid/support/v4/view/PagerTitleStrip;->c:I */
/* sub-int/2addr v13, v1 */
/* sub-int/2addr v13, v2 */
v1 = java.lang.Math .min ( v8,v13 );
v4 = this.a;
/* add-int/2addr v2, v1 */
v7 = (( android.widget.TextView ) v4 ).getMeasuredHeight ( ); // invoke-virtual {v4}, Landroid/widget/TextView;->getMeasuredHeight()I
/* add-int/2addr v7, v5 */
(( android.widget.TextView ) v4 ).layout ( v1, v5, v2, v7 ); // invoke-virtual {v4, v1, v5, v2, v7}, Landroid/widget/TextView;->layout(IIII)V
/* sub-int/2addr v6, v9 */
/* sub-int v6, v6, p1 */
/* iget v1, v0, Landroid/support/v4/view/PagerTitleStrip;->c:I */
/* add-int/2addr v3, v1 */
v1 = java.lang.Math .max ( v6,v3 );
v2 = this.c;
/* add-int v4, v1, p1 */
v3 = (( android.widget.TextView ) v2 ).getMeasuredHeight ( ); // invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredHeight()I
/* add-int/2addr v3, v10 */
(( android.widget.TextView ) v2 ).layout ( v1, v10, v4, v3 ); // invoke-virtual {v2, v1, v10, v4, v3}, Landroid/widget/TextView;->layout(IIII)V
/* move/from16 v1, p2 */
/* iput v1, v0, Landroid/support/v4/view/PagerTitleStrip;->a:F */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, v0, Landroid/support/v4/view/PagerTitleStrip;->b:Z */
return;
} // .end method
final void a ( ek p0, ek p1 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = this.a;
(( ek ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Lek;->b(Landroid/database/DataSetObserver;)V
int p1 = 0; // const/4 p1, 0x0
this.a = p1;
} // :cond_0
if ( p2 != null) { // if-eqz p2, :cond_1
p1 = this.a;
(( ek ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Lek;->a(Landroid/database/DataSetObserver;)V
/* new-instance p1, Ljava/lang/ref/WeakReference; */
/* invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.a = p1;
} // :cond_1
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_2
int p2 = -1; // const/4 p2, -0x1
/* iput p2, p0, Landroid/support/v4/view/PagerTitleStrip;->b:I */
/* const/high16 p2, -0x40800000 # -1.0f */
/* iput p2, p0, Landroid/support/v4/view/PagerTitleStrip;->a:F */
p1 = (( android.support.v4.view.ViewPager ) p1 ).getCurrentItem ( ); // invoke-virtual {p1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I
(( android.support.v4.view.PagerTitleStrip ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/view/PagerTitleStrip;->a(I)V
(( android.support.v4.view.PagerTitleStrip ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->requestLayout()V
} // :cond_2
return;
} // .end method
Integer getMinHeight ( ) {
/* .locals 1 */
(( android.support.v4.view.PagerTitleStrip ) p0 ).getBackground ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getBackground()Landroid/graphics/drawable/Drawable;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( android.graphics.drawable.Drawable ) v0 ).getIntrinsicHeight ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Integer getTextSpacing ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v4/view/PagerTitleStrip;->c:I */
} // .end method
protected void onAttachedToWindow ( ) {
/* .locals 4 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V */
(( android.support.v4.view.PagerTitleStrip ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getParent()Landroid/view/ViewParent;
/* instance-of v1, v0, Landroid/support/v4/view/ViewPager; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* check-cast v0, Landroid/support/v4/view/ViewPager; */
(( android.support.v4.view.ViewPager ) v0 ).getAdapter ( ); // invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Lek;
v2 = this.a;
(( android.support.v4.view.ViewPager ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/ViewPager$e;)Landroid/support/v4/view/ViewPager$e;
v2 = this.a;
v3 = this.a;
/* if-nez v3, :cond_0 */
/* new-instance v3, Ljava/util/ArrayList; */
/* invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V */
this.a = v3;
} // :cond_0
v3 = this.a;
this.a = v0;
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Lek; */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
(( android.support.v4.view.PagerTitleStrip ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/support/v4/view/PagerTitleStrip;->a(Lek;Lek;)V
return;
} // :cond_2
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "PagerTitleStrip must be a direct child of a ViewPager."; // const-string v1, "PagerTitleStrip must be a direct child of a ViewPager."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
protected void onDetachedFromWindow ( ) {
/* .locals 4 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
(( android.support.v4.view.ViewPager ) v0 ).getAdapter ( ); // invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Lek;
int v1 = 0; // const/4 v1, 0x0
(( android.support.v4.view.PagerTitleStrip ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/support/v4/view/PagerTitleStrip;->a(Lek;Lek;)V
v0 = this.a;
(( android.support.v4.view.ViewPager ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/ViewPager$e;)Landroid/support/v4/view/ViewPager$e;
v0 = this.a;
v2 = this.a;
v3 = this.a;
if ( v3 != null) { // if-eqz v3, :cond_0
v0 = this.a;
} // :cond_0
this.a = v1;
} // :cond_1
return;
} // .end method
protected void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_1
/* iget p1, p0, Landroid/support/v4/view/PagerTitleStrip;->a:F */
int p2 = 0; // const/4 p2, 0x0
/* cmpl-float p3, p1, p2 */
/* if-ltz p3, :cond_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
/* iget p2, p0, Landroid/support/v4/view/PagerTitleStrip;->b:I */
int p3 = 1; // const/4 p3, 0x1
(( android.support.v4.view.PagerTitleStrip ) p0 ).a ( p2, p1, p3 ); // invoke-virtual {p0, p2, p1, p3}, Landroid/support/v4/view/PagerTitleStrip;->a(IFZ)V
} // :cond_1
return;
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 7 */
v0 = android.view.View$MeasureSpec .getMode ( p1 );
/* const/high16 v1, 0x40000000 # 2.0f */
/* if-ne v0, v1, :cond_1 */
v0 = (( android.support.v4.view.PagerTitleStrip ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingTop()I
v2 = (( android.support.v4.view.PagerTitleStrip ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingBottom()I
/* add-int/2addr v0, v2 */
int v2 = -2; // const/4 v2, -0x2
v3 = android.support.v4.view.PagerTitleStrip .getChildMeasureSpec ( p2,v0,v2 );
v4 = android.view.View$MeasureSpec .getSize ( p1 );
/* int-to-float v5, v4 */
/* const v6, 0x3e4ccccd # 0.2f */
/* mul-float v5, v5, v6 */
/* float-to-int v5, v5 */
p1 = android.support.v4.view.PagerTitleStrip .getChildMeasureSpec ( p1,v5,v2 );
v2 = this.a;
(( android.widget.TextView ) v2 ).measure ( p1, v3 ); // invoke-virtual {v2, p1, v3}, Landroid/widget/TextView;->measure(II)V
v2 = this.b;
(( android.widget.TextView ) v2 ).measure ( p1, v3 ); // invoke-virtual {v2, p1, v3}, Landroid/widget/TextView;->measure(II)V
v2 = this.c;
(( android.widget.TextView ) v2 ).measure ( p1, v3 ); // invoke-virtual {v2, p1, v3}, Landroid/widget/TextView;->measure(II)V
p1 = android.view.View$MeasureSpec .getMode ( p2 );
/* if-ne p1, v1, :cond_0 */
p1 = android.view.View$MeasureSpec .getSize ( p2 );
} // :cond_0
p1 = this.b;
p1 = (( android.widget.TextView ) p1 ).getMeasuredHeight ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->getMeasuredHeight()I
v1 = (( android.support.v4.view.PagerTitleStrip ) p0 ).getMinHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getMinHeight()I
/* add-int/2addr p1, v0 */
p1 = java.lang.Math .max ( v1,p1 );
} // :goto_0
v0 = this.b;
v0 = (( android.widget.TextView ) v0 ).getMeasuredState ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredState()I
/* shl-int/lit8 v0, v0, 0x10 */
p1 = android.view.View .resolveSizeAndState ( p1,p2,v0 );
(( android.support.v4.view.PagerTitleStrip ) p0 ).setMeasuredDimension ( v4, p1 ); // invoke-virtual {p0, v4, p1}, Landroid/support/v4/view/PagerTitleStrip;->setMeasuredDimension(II)V
return;
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "Must measure with an exact width"; // const-string p2, "Must measure with an exact width"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void requestLayout ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Landroid/support/v4/view/PagerTitleStrip;->a:Z */
/* if-nez v0, :cond_0 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V */
} // :cond_0
return;
} // .end method
public void setGravity ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v4/view/PagerTitleStrip;->d:I */
(( android.support.v4.view.PagerTitleStrip ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->requestLayout()V
return;
} // .end method
public void setNonPrimaryAlpha ( Float p0 ) {
/* .locals 2 */
/* const/high16 v0, 0x437f0000 # 255.0f */
/* mul-float p1, p1, v0 */
/* float-to-int p1, p1 */
/* and-int/lit16 p1, p1, 0xff */
/* iput p1, p0, Landroid/support/v4/view/PagerTitleStrip;->e:I */
/* iget p1, p0, Landroid/support/v4/view/PagerTitleStrip;->e:I */
/* shl-int/lit8 p1, p1, 0x18 */
/* iget v0, p0, Landroid/support/v4/view/PagerTitleStrip;->a:I */
/* const v1, 0xffffff */
/* and-int/2addr v0, v1 */
/* or-int/2addr p1, v0 */
v0 = this.a;
(( android.widget.TextView ) v0 ).setTextColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V
v0 = this.c;
(( android.widget.TextView ) v0 ).setTextColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V
return;
} // .end method
public void setTextColor ( Integer p0 ) {
/* .locals 2 */
/* iput p1, p0, Landroid/support/v4/view/PagerTitleStrip;->a:I */
v0 = this.b;
(( android.widget.TextView ) v0 ).setTextColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V
/* iget p1, p0, Landroid/support/v4/view/PagerTitleStrip;->e:I */
/* shl-int/lit8 p1, p1, 0x18 */
/* iget v0, p0, Landroid/support/v4/view/PagerTitleStrip;->a:I */
/* const v1, 0xffffff */
/* and-int/2addr v0, v1 */
/* or-int/2addr p1, v0 */
v0 = this.a;
(( android.widget.TextView ) v0 ).setTextColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V
v0 = this.c;
(( android.widget.TextView ) v0 ).setTextColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V
return;
} // .end method
public void setTextSize ( Integer p0, Float p1 ) {
/* .locals 1 */
v0 = this.a;
(( android.widget.TextView ) v0 ).setTextSize ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V
v0 = this.b;
(( android.widget.TextView ) v0 ).setTextSize ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V
v0 = this.c;
(( android.widget.TextView ) v0 ).setTextSize ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V
return;
} // .end method
public void setTextSpacing ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v4/view/PagerTitleStrip;->c:I */
(( android.support.v4.view.PagerTitleStrip ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->requestLayout()V
return;
} // .end method
