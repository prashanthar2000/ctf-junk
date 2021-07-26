public class android.support.v7.widget.ActionMenuView extends android.support.v7.widget.LinearLayoutCompat implements gz$b implements hh {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/v7/widget/ActionMenuView$LayoutParams;, */
	 /* Landroid/support/v7/widget/ActionMenuView$a;, */
	 /* Landroid/support/v7/widget/ActionMenuView$b;, */
	 /* Landroid/support/v7/widget/ActionMenuView$c;, */
	 /* Landroid/support/v7/widget/ActionMenuView$d; */
	 /* } */
} // .end annotation
/* # instance fields */
private Integer a;
private android.content.Context a;
android.support.v7.widget.ActionMenuView$d a;
gz$a a;
public gz a;
private hg$a a;
public hq a;
public Boolean a;
private Integer b;
private Boolean b;
private Integer c;
private Integer d;
/* # direct methods */
public android.support.v7.widget.ActionMenuView ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/ActionMenuView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 return;
} // .end method
public android.support.v7.widget.ActionMenuView ( ) {
	 /* .locals 2 */
	 /* invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 int p2 = 0; // const/4 p2, 0x0
	 (( android.support.v7.widget.ActionMenuView ) p0 ).setBaselineAligned ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/widget/ActionMenuView;->setBaselineAligned(Z)V
	 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
	 /* iget v0, v0, Landroid/util/DisplayMetrics;->density:F */
	 /* const/high16 v1, 0x42600000 # 56.0f */
	 /* mul-float v1, v1, v0 */
	 /* float-to-int v1, v1 */
	 /* iput v1, p0, Landroid/support/v7/widget/ActionMenuView;->c:I */
	 /* const/high16 v1, 0x40800000 # 4.0f */
	 /* mul-float v0, v0, v1 */
	 /* float-to-int v0, v0 */
	 /* iput v0, p0, Landroid/support/v7/widget/ActionMenuView;->d:I */
	 this.a = p1;
	 /* iput p2, p0, Landroid/support/v7/widget/ActionMenuView;->a:I */
	 return;
} // .end method
public static Integer a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
	 /* .locals 5 */
	 (( android.view.View ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
	 /* check-cast v0, Landroid/support/v7/widget/ActionMenuView$LayoutParams; */
	 v1 = 	 android.view.View$MeasureSpec .getSize ( p3 );
	 /* sub-int/2addr v1, p4 */
	 p3 = 	 android.view.View$MeasureSpec .getMode ( p3 );
	 p3 = 	 android.view.View$MeasureSpec .makeMeasureSpec ( v1,p3 );
	 /* instance-of p4, p0, Landroid/support/v7/view/menu/ActionMenuItemView; */
	 if ( p4 != null) { // if-eqz p4, :cond_0
		 /* move-object p4, p0 */
		 /* check-cast p4, Landroid/support/v7/view/menu/ActionMenuItemView; */
	 } // :cond_0
	 int p4 = 0; // const/4 p4, 0x0
} // :goto_0
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
if ( p4 != null) { // if-eqz p4, :cond_1
	 p4 = 	 (( android.support.v7.view.menu.ActionMenuItemView ) p4 ).b ( ); // invoke-virtual {p4}, Landroid/support/v7/view/menu/ActionMenuItemView;->b()Z
	 if ( p4 != null) { // if-eqz p4, :cond_1
		 int p4 = 1; // const/4 p4, 0x1
	 } // :cond_1
	 int p4 = 0; // const/4 p4, 0x0
} // :goto_1
int v3 = 2; // const/4 v3, 0x2
/* if-lez p2, :cond_5 */
if ( p4 != null) { // if-eqz p4, :cond_2
	 /* if-lt p2, v3, :cond_5 */
} // :cond_2
/* mul-int p2, p2, p1 */
/* const/high16 v4, -0x80000000 */
p2 = android.view.View$MeasureSpec .makeMeasureSpec ( p2,v4 );
(( android.view.View ) p0 ).measure ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Landroid/view/View;->measure(II)V
p2 = (( android.view.View ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I
/* div-int v4, p2, p1 */
/* rem-int/2addr p2, p1 */
if ( p2 != null) { // if-eqz p2, :cond_3
	 /* add-int/lit8 v4, v4, 0x1 */
} // :cond_3
if ( p4 != null) { // if-eqz p4, :cond_4
	 /* if-ge v4, v3, :cond_4 */
} // :cond_4
/* move v3, v4 */
} // :cond_5
int v3 = 0; // const/4 v3, 0x0
} // :goto_2
/* iget-boolean p2, v0, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->a:Z */
/* if-nez p2, :cond_6 */
if ( p4 != null) { // if-eqz p4, :cond_6
} // :cond_6
int v1 = 0; // const/4 v1, 0x0
} // :goto_3
/* iput-boolean v1, v0, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->b:Z */
/* iput v3, v0, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->a:I */
/* mul-int p1, p1, v3 */
/* const/high16 p2, 0x40000000 # 2.0f */
p1 = android.view.View$MeasureSpec .makeMeasureSpec ( p1,p2 );
(( android.view.View ) p0 ).measure ( p1, p3 ); // invoke-virtual {p0, p1, p3}, Landroid/view/View;->measure(II)V
} // .end method
public static android.support.v7.widget.ActionMenuView$LayoutParams a ( ) {
/* .locals 2 */
android.support.v7.widget.ActionMenuView .b ( );
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, v0, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->a:Z */
} // .end method
private android.support.v7.widget.ActionMenuView$LayoutParams a ( android.util.AttributeSet p0 ) {
/* .locals 2 */
/* new-instance v0, Landroid/support/v7/widget/ActionMenuView$LayoutParams; */
(( android.support.v7.widget.ActionMenuView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1, p1}, Landroid/support/v7/widget/ActionMenuView$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public static android.support.v7.widget.ActionMenuView$LayoutParams a ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 1 */
if ( p0 != null) { // if-eqz p0, :cond_2
/* instance-of v0, p0, Landroid/support/v7/widget/ActionMenuView$LayoutParams; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v0, Landroid/support/v7/widget/ActionMenuView$LayoutParams; */
/* check-cast p0, Landroid/support/v7/widget/ActionMenuView$LayoutParams; */
/* invoke-direct {v0, p0}, Landroid/support/v7/widget/ActionMenuView$LayoutParams;-><init>(Landroid/support/v7/widget/ActionMenuView$LayoutParams;)V */
} // :cond_0
/* new-instance v0, Landroid/support/v7/widget/ActionMenuView$LayoutParams; */
/* invoke-direct {v0, p0}, Landroid/support/v7/widget/ActionMenuView$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
} // :goto_0
/* iget p0, v0, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->c:I */
/* if-gtz p0, :cond_1 */
/* const/16 p0, 0x10 */
/* iput p0, v0, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->c:I */
} // :cond_1
} // :cond_2
android.support.v7.widget.ActionMenuView .b ( );
} // .end method
private static android.support.v7.widget.ActionMenuView$LayoutParams b ( ) {
/* .locals 2 */
/* new-instance v0, Landroid/support/v7/widget/ActionMenuView$LayoutParams; */
/* invoke-direct {v0}, Landroid/support/v7/widget/ActionMenuView$LayoutParams;-><init>()V */
/* const/16 v1, 0x10 */
/* iput v1, v0, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->c:I */
} // .end method
private Boolean b ( Integer p0 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
} // :cond_0
/* add-int/lit8 v1, p1, -0x1 */
(( android.support.v7.widget.ActionMenuView ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;
(( android.support.v7.widget.ActionMenuView ) p0 ).getChildAt ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;
v3 = (( android.support.v7.widget.ActionMenuView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getChildCount()I
/* if-ge p1, v3, :cond_1 */
/* instance-of v3, v1, Landroid/support/v7/widget/ActionMenuView$a; */
if ( v3 != null) { // if-eqz v3, :cond_1
v1 = /* check-cast v1, Landroid/support/v7/widget/ActionMenuView$a; */
/* or-int/2addr v0, v1 */
} // :cond_1
/* if-lez p1, :cond_2 */
/* instance-of p1, v2, Landroid/support/v7/widget/ActionMenuView$a; */
if ( p1 != null) { // if-eqz p1, :cond_2
p1 = /* check-cast v2, Landroid/support/v7/widget/ActionMenuView$a; */
/* or-int/2addr v0, p1 */
} // :cond_2
} // .end method
/* # virtual methods */
protected final android.support.v7.widget.LinearLayoutCompat$LayoutParams a ( ) { //synthethic
/* .locals 1 */
android.support.v7.widget.ActionMenuView .b ( );
} // .end method
public final android.support.v7.widget.LinearLayoutCompat$LayoutParams a ( android.util.AttributeSet p0 ) { //bridge//synthethic
/* .locals 0 */
/* invoke-direct {p0, p1}, Landroid/support/v7/widget/ActionMenuView;->a(Landroid/util/AttributeSet;)Landroid/support/v7/widget/ActionMenuView$LayoutParams; */
} // .end method
protected final android.support.v7.widget.LinearLayoutCompat$LayoutParams a ( android.view.ViewGroup$LayoutParams p0 ) { //bridge//synthethic
/* .locals 0 */
android.support.v7.widget.ActionMenuView .a ( p1 );
} // .end method
public final void a ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( hq ) v0 ).d ( ); // invoke-virtual {v0}, Lhq;->d()Z
} // :cond_0
return;
} // .end method
public final void a ( gz p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
public final Boolean a ( hb p0 ) {
/* .locals 3 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
p1 = (( gz ) v0 ).a ( p1, v1, v2 ); // invoke-virtual {v0, p1, v1, v2}, Lgz;->a(Landroid/view/MenuItem;Lhg;I)Z
} // .end method
public Boolean checkLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 0 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* instance-of p1, p1, Landroid/support/v7/widget/ActionMenuView$LayoutParams; */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean dispatchPopulateAccessibilityEvent ( android.view.accessibility.AccessibilityEvent p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
protected android.view.ViewGroup$LayoutParams generateDefaultLayoutParams ( ) { //synthethic
/* .locals 1 */
android.support.v7.widget.ActionMenuView .b ( );
} // .end method
public android.view.ViewGroup$LayoutParams generateLayoutParams ( android.util.AttributeSet p0 ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0, p1}, Landroid/support/v7/widget/ActionMenuView;->a(Landroid/util/AttributeSet;)Landroid/support/v7/widget/ActionMenuView$LayoutParams; */
} // .end method
protected android.view.ViewGroup$LayoutParams generateLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) { //synthethic
/* .locals 0 */
android.support.v7.widget.ActionMenuView .a ( p1 );
} // .end method
public android.view.Menu getMenu ( ) {
/* .locals 3 */
v0 = this.a;
/* if-nez v0, :cond_1 */
(( android.support.v7.widget.ActionMenuView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getContext()Landroid/content/Context;
/* new-instance v1, Lgz; */
/* invoke-direct {v1, v0}, Lgz;-><init>(Landroid/content/Context;)V */
this.a = v1;
v1 = this.a;
/* new-instance v2, Landroid/support/v7/widget/ActionMenuView$c; */
/* invoke-direct {v2, p0}, Landroid/support/v7/widget/ActionMenuView$c;-><init>(Landroid/support/v7/widget/ActionMenuView;)V */
(( gz ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lgz;->a(Lgz$a;)V
/* new-instance v1, Lhq; */
/* invoke-direct {v1, v0}, Lhq;-><init>(Landroid/content/Context;)V */
this.a = v1;
v0 = this.a;
(( hq ) v0 ).b ( ); // invoke-virtual {v0}, Lhq;->b()V
v0 = this.a;
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_0
/* new-instance v1, Landroid/support/v7/widget/ActionMenuView$b; */
/* invoke-direct {v1}, Landroid/support/v7/widget/ActionMenuView$b;-><init>()V */
} // :goto_0
this.a = v1;
v0 = this.a;
v1 = this.a;
v2 = this.a;
(( gz ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lgz;->a(Lhg;Landroid/content/Context;)V
v0 = this.a;
(( hq ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lhq;->a(Landroid/support/v7/widget/ActionMenuView;)V
} // :cond_1
v0 = this.a;
} // .end method
public android.graphics.drawable.Drawable getOverflowIcon ( ) {
/* .locals 2 */
(( android.support.v7.widget.ActionMenuView ) p0 ).getMenu ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getMenu()Landroid/view/Menu;
v0 = this.a;
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_0
v0 = this.a;
(( hq$d ) v0 ).getDrawable ( ); // invoke-virtual {v0}, Lhq$d;->getDrawable()Landroid/graphics/drawable/Drawable;
} // :cond_0
/* iget-boolean v1, v0, Lhq;->a:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
v0 = this.a;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer getPopupTheme ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v7/widget/ActionMenuView;->a:I */
} // .end method
public Integer getWindowAnimations ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void onConfigurationChanged ( android.content.res.Configuration p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Landroid/support/v7/widget/LinearLayoutCompat;->onConfigurationChanged(Landroid/content/res/Configuration;)V */
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_0
int v0 = 0; // const/4 v0, 0x0
(( hq ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Lhq;->b(Z)V
p1 = this.a;
p1 = (( hq ) p1 ).f ( ); // invoke-virtual {p1}, Lhq;->f()Z
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = this.a;
(( hq ) p1 ).c ( ); // invoke-virtual {p1}, Lhq;->c()Z
p1 = this.a;
(( hq ) p1 ).b ( ); // invoke-virtual {p1}, Lhq;->b()Z
} // :cond_0
return;
} // .end method
public void onDetachedFromWindow ( ) {
/* .locals 0 */
/* invoke-super {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->onDetachedFromWindow()V */
(( android.support.v7.widget.ActionMenuView ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->a()V
return;
} // .end method
protected void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 17 */
/* move-object/from16 v0, p0 */
/* iget-boolean v1, v0, Landroid/support/v7/widget/ActionMenuView;->b:Z */
/* if-nez v1, :cond_0 */
/* invoke-super/range {p0 ..p5}, Landroid/support/v7/widget/LinearLayoutCompat;->onLayout(ZIIII)V */
return;
} // :cond_0
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/ActionMenuView;->getChildCount()I */
/* sub-int v2, p5, p3 */
/* div-int/lit8 v2, v2, 0x2 */
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/ActionMenuView;->getDividerWidth()I */
/* sub-int v4, p4, p2 */
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingRight()I */
/* sub-int v5, v4, v5 */
v6 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingLeft()I */
/* sub-int/2addr v5, v6 */
v6 = /* invoke-static/range {p0 ..p0}, Liv;->a(Landroid/view/View;)Z */
/* move v10, v5 */
int v5 = 0; // const/4 v5, 0x0
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
} // :goto_0
/* const/16 v11, 0x8 */
int v12 = 1; // const/4 v12, 0x1
/* if-ge v5, v1, :cond_5 */
(( android.support.v7.widget.ActionMenuView ) v0 ).getChildAt ( v5 ); // invoke-virtual {v0, v5}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;
v14 = (( android.view.View ) v13 ).getVisibility ( ); // invoke-virtual {v13}, Landroid/view/View;->getVisibility()I
/* if-eq v14, v11, :cond_4 */
(( android.view.View ) v13 ).getLayoutParams ( ); // invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v11, Landroid/support/v7/widget/ActionMenuView$LayoutParams; */
/* iget-boolean v14, v11, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->a:Z */
if ( v14 != null) { // if-eqz v14, :cond_3
v8 = (( android.view.View ) v13 ).getMeasuredWidth ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I
v14 = /* invoke-direct {v0, v5}, Landroid/support/v7/widget/ActionMenuView;->b(I)Z */
if ( v14 != null) { // if-eqz v14, :cond_1
/* add-int/2addr v8, v3 */
} // :cond_1
v14 = (( android.view.View ) v13 ).getMeasuredHeight ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I
if ( v6 != null) { // if-eqz v6, :cond_2
v15 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingLeft()I */
/* iget v11, v11, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->leftMargin:I */
/* add-int/2addr v15, v11 */
/* add-int v11, v15, v8 */
} // :cond_2
v15 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/ActionMenuView;->getWidth()I */
v16 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingRight()I */
/* sub-int v15, v15, v16 */
/* iget v11, v11, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->rightMargin:I */
/* sub-int v11, v15, v11 */
/* sub-int v15, v11, v8 */
} // :goto_1
/* div-int/lit8 v16, v14, 0x2 */
/* sub-int v7, v2, v16 */
/* add-int/2addr v14, v7 */
(( android.view.View ) v13 ).layout ( v15, v7, v11, v14 ); // invoke-virtual {v13, v15, v7, v11, v14}, Landroid/view/View;->layout(IIII)V
/* sub-int/2addr v10, v8 */
int v8 = 1; // const/4 v8, 0x1
} // :cond_3
v7 = (( android.view.View ) v13 ).getMeasuredWidth ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I
/* iget v12, v11, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->leftMargin:I */
/* add-int/2addr v7, v12 */
/* iget v11, v11, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->rightMargin:I */
/* add-int/2addr v7, v11 */
/* sub-int/2addr v10, v7 */
/* invoke-direct {v0, v5}, Landroid/support/v7/widget/ActionMenuView;->b(I)Z */
/* add-int/lit8 v9, v9, 0x1 */
} // :cond_4
} // :goto_2
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_5
/* if-ne v1, v12, :cond_6 */
/* if-nez v8, :cond_6 */
int v3 = 0; // const/4 v3, 0x0
(( android.support.v7.widget.ActionMenuView ) v0 ).getChildAt ( v3 ); // invoke-virtual {v0, v3}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;
v3 = (( android.view.View ) v1 ).getMeasuredWidth ( ); // invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I
v5 = (( android.view.View ) v1 ).getMeasuredHeight ( ); // invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I
/* div-int/lit8 v4, v4, 0x2 */
/* div-int/lit8 v6, v3, 0x2 */
/* sub-int/2addr v4, v6 */
/* div-int/lit8 v6, v5, 0x2 */
/* sub-int/2addr v2, v6 */
/* add-int/2addr v3, v4 */
/* add-int/2addr v5, v2 */
(( android.view.View ) v1 ).layout ( v4, v2, v3, v5 ); // invoke-virtual {v1, v4, v2, v3, v5}, Landroid/view/View;->layout(IIII)V
return;
} // :cond_6
/* xor-int/lit8 v3, v8, 0x1 */
/* sub-int/2addr v9, v3 */
/* if-lez v9, :cond_7 */
/* div-int v7, v10, v9 */
int v3 = 0; // const/4 v3, 0x0
} // :cond_7
int v3 = 0; // const/4 v3, 0x0
int v7 = 0; // const/4 v7, 0x0
} // :goto_3
v4 = java.lang.Math .max ( v3,v7 );
if ( v6 != null) { // if-eqz v6, :cond_a
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/ActionMenuView;->getWidth()I */
v6 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingRight()I */
/* sub-int/2addr v5, v6 */
} // :goto_4
/* if-ge v3, v1, :cond_9 */
(( android.support.v7.widget.ActionMenuView ) v0 ).getChildAt ( v3 ); // invoke-virtual {v0, v3}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v6 ).getLayoutParams ( ); // invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v7, Landroid/support/v7/widget/ActionMenuView$LayoutParams; */
v8 = (( android.view.View ) v6 ).getVisibility ( ); // invoke-virtual {v6}, Landroid/view/View;->getVisibility()I
/* if-eq v8, v11, :cond_8 */
/* iget-boolean v8, v7, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->a:Z */
/* if-nez v8, :cond_8 */
/* iget v8, v7, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->rightMargin:I */
/* sub-int/2addr v5, v8 */
v8 = (( android.view.View ) v6 ).getMeasuredWidth ( ); // invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I
v9 = (( android.view.View ) v6 ).getMeasuredHeight ( ); // invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I
/* div-int/lit8 v10, v9, 0x2 */
/* sub-int v10, v2, v10 */
/* sub-int v12, v5, v8 */
/* add-int/2addr v9, v10 */
(( android.view.View ) v6 ).layout ( v12, v10, v5, v9 ); // invoke-virtual {v6, v12, v10, v5, v9}, Landroid/view/View;->layout(IIII)V
/* iget v6, v7, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->leftMargin:I */
/* add-int/2addr v8, v6 */
/* add-int/2addr v8, v4 */
/* sub-int/2addr v5, v8 */
} // :cond_8
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_9
return;
} // :cond_a
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingLeft()I */
} // :goto_5
/* if-ge v3, v1, :cond_c */
(( android.support.v7.widget.ActionMenuView ) v0 ).getChildAt ( v3 ); // invoke-virtual {v0, v3}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v6 ).getLayoutParams ( ); // invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v7, Landroid/support/v7/widget/ActionMenuView$LayoutParams; */
v8 = (( android.view.View ) v6 ).getVisibility ( ); // invoke-virtual {v6}, Landroid/view/View;->getVisibility()I
/* if-eq v8, v11, :cond_b */
/* iget-boolean v8, v7, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->a:Z */
/* if-nez v8, :cond_b */
/* iget v8, v7, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->leftMargin:I */
/* add-int/2addr v5, v8 */
v8 = (( android.view.View ) v6 ).getMeasuredWidth ( ); // invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I
v9 = (( android.view.View ) v6 ).getMeasuredHeight ( ); // invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I
/* div-int/lit8 v10, v9, 0x2 */
/* sub-int v10, v2, v10 */
/* add-int v12, v5, v8 */
/* add-int/2addr v9, v10 */
(( android.view.View ) v6 ).layout ( v5, v10, v12, v9 ); // invoke-virtual {v6, v5, v10, v12, v9}, Landroid/view/View;->layout(IIII)V
/* iget v6, v7, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->rightMargin:I */
/* add-int/2addr v8, v6 */
/* add-int/2addr v8, v4 */
/* add-int/2addr v5, v8 */
} // :cond_b
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_c
return;
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 30 */
/* move-object/from16 v0, p0 */
/* iget-boolean v1, v0, Landroid/support/v7/widget/ActionMenuView;->b:Z */
v2 = /* invoke-static/range {p1 ..p1}, Landroid/view/View$MeasureSpec;->getMode(I)I */
/* const/high16 v3, 0x40000000 # 2.0f */
int v4 = 0; // const/4 v4, 0x0
int v5 = 1; // const/4 v5, 0x1
/* if-ne v2, v3, :cond_0 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* iput-boolean v2, v0, Landroid/support/v7/widget/ActionMenuView;->b:Z */
/* iget-boolean v2, v0, Landroid/support/v7/widget/ActionMenuView;->b:Z */
/* if-eq v1, v2, :cond_1 */
/* iput v4, v0, Landroid/support/v7/widget/ActionMenuView;->b:I */
} // :cond_1
v1 = /* invoke-static/range {p1 ..p1}, Landroid/view/View$MeasureSpec;->getSize(I)I */
/* iget-boolean v2, v0, Landroid/support/v7/widget/ActionMenuView;->b:Z */
if ( v2 != null) { // if-eqz v2, :cond_2
v2 = this.a;
if ( v2 != null) { // if-eqz v2, :cond_2
/* iget v6, v0, Landroid/support/v7/widget/ActionMenuView;->b:I */
/* if-eq v1, v6, :cond_2 */
/* iput v1, v0, Landroid/support/v7/widget/ActionMenuView;->b:I */
(( gz ) v2 ).b ( v5 ); // invoke-virtual {v2, v5}, Lgz;->b(Z)V
} // :cond_2
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/ActionMenuView;->getChildCount()I */
/* iget-boolean v2, v0, Landroid/support/v7/widget/ActionMenuView;->b:Z */
if ( v2 != null) { // if-eqz v2, :cond_27
/* if-lez v1, :cond_27 */
v1 = /* invoke-static/range {p2 ..p2}, Landroid/view/View$MeasureSpec;->getMode(I)I */
v2 = /* invoke-static/range {p1 ..p1}, Landroid/view/View$MeasureSpec;->getSize(I)I */
v6 = /* invoke-static/range {p2 ..p2}, Landroid/view/View$MeasureSpec;->getSize(I)I */
v7 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingLeft()I */
v8 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingRight()I */
/* add-int/2addr v7, v8 */
v8 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingTop()I */
v9 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingBottom()I */
/* add-int/2addr v8, v9 */
int v9 = -2; // const/4 v9, -0x2
/* move/from16 v10, p2 */
v9 = android.support.v7.widget.ActionMenuView .getChildMeasureSpec ( v10,v8,v9 );
/* sub-int/2addr v2, v7 */
/* iget v7, v0, Landroid/support/v7/widget/ActionMenuView;->c:I */
/* div-int v10, v2, v7 */
/* rem-int v11, v2, v7 */
/* if-nez v10, :cond_3 */
(( android.support.v7.widget.ActionMenuView ) v0 ).setMeasuredDimension ( v2, v4 ); // invoke-virtual {v0, v2, v4}, Landroid/support/v7/widget/ActionMenuView;->setMeasuredDimension(II)V
return;
} // :cond_3
/* div-int/2addr v11, v10 */
/* add-int/2addr v7, v11 */
v11 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/ActionMenuView;->getChildCount()I */
/* move/from16 v16, v10 */
int v3 = 0; // const/4 v3, 0x0
int v10 = 0; // const/4 v10, 0x0
int v12 = 0; // const/4 v12, 0x0
int v14 = 0; // const/4 v14, 0x0
int v15 = 0; // const/4 v15, 0x0
/* const/16 v17, 0x0 */
/* const-wide/16 v18, 0x0 */
} // :goto_1
/* if-ge v10, v11, :cond_b */
(( android.support.v7.widget.ActionMenuView ) v0 ).getChildAt ( v10 ); // invoke-virtual {v0, v10}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;
v5 = (( android.view.View ) v13 ).getVisibility ( ); // invoke-virtual {v13}, Landroid/view/View;->getVisibility()I
/* const/16 v4, 0x8 */
/* if-eq v5, v4, :cond_a */
/* instance-of v4, v13, Landroid/support/v7/view/menu/ActionMenuItemView; */
/* add-int/lit8 v15, v15, 0x1 */
if ( v4 != null) { // if-eqz v4, :cond_4
/* iget v5, v0, Landroid/support/v7/widget/ActionMenuView;->d:I */
/* move/from16 v20, v6 */
int v6 = 0; // const/4 v6, 0x0
(( android.view.View ) v13 ).setPadding ( v5, v6, v5, v6 ); // invoke-virtual {v13, v5, v6, v5, v6}, Landroid/view/View;->setPadding(IIII)V
} // :cond_4
/* move/from16 v20, v6 */
int v6 = 0; // const/4 v6, 0x0
} // :goto_2
(( android.view.View ) v13 ).getLayoutParams ( ); // invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v5, Landroid/support/v7/widget/ActionMenuView$LayoutParams; */
/* iput-boolean v6, v5, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->d:Z */
/* iput v6, v5, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->b:I */
/* iput v6, v5, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->a:I */
/* iput-boolean v6, v5, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->b:Z */
/* iput v6, v5, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->leftMargin:I */
/* iput v6, v5, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->rightMargin:I */
if ( v4 != null) { // if-eqz v4, :cond_5
/* move-object v4, v13 */
/* check-cast v4, Landroid/support/v7/view/menu/ActionMenuItemView; */
v4 = (( android.support.v7.view.menu.ActionMenuItemView ) v4 ).b ( ); // invoke-virtual {v4}, Landroid/support/v7/view/menu/ActionMenuItemView;->b()Z
if ( v4 != null) { // if-eqz v4, :cond_5
int v4 = 1; // const/4 v4, 0x1
} // :cond_5
int v4 = 0; // const/4 v4, 0x0
} // :goto_3
/* iput-boolean v4, v5, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->c:Z */
/* iget-boolean v4, v5, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->a:Z */
if ( v4 != null) { // if-eqz v4, :cond_6
int v4 = 1; // const/4 v4, 0x1
} // :cond_6
/* move/from16 v4, v16 */
} // :goto_4
v4 = android.support.v7.widget.ActionMenuView .a ( v13,v7,v4,v9,v8 );
v3 = java.lang.Math .max ( v3,v4 );
/* iget-boolean v6, v5, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->b:Z */
if ( v6 != null) { // if-eqz v6, :cond_7
/* add-int/lit8 v17, v17, 0x1 */
} // :cond_7
/* iget-boolean v5, v5, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->a:Z */
if ( v5 != null) { // if-eqz v5, :cond_8
int v14 = 1; // const/4 v14, 0x1
} // :cond_8
/* sub-int v16, v16, v4 */
v5 = (( android.view.View ) v13 ).getMeasuredHeight ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I
v5 = java.lang.Math .max ( v12,v5 );
int v6 = 1; // const/4 v6, 0x1
/* if-ne v4, v6, :cond_9 */
/* shl-int v4, v6, v10 */
/* int-to-long v12, v4 */
/* or-long v12, v18, v12 */
/* move-wide/from16 v18, v12 */
} // :cond_9
/* move v12, v5 */
} // :cond_a
/* move/from16 v20, v6 */
} // :goto_5
/* add-int/lit8 v10, v10, 0x1 */
/* move/from16 v6, v20 */
int v4 = 0; // const/4 v4, 0x0
int v5 = 1; // const/4 v5, 0x1
} // :cond_b
/* move/from16 v20, v6 */
int v4 = 2; // const/4 v4, 0x2
if ( v14 != null) { // if-eqz v14, :cond_c
/* if-ne v15, v4, :cond_c */
int v5 = 1; // const/4 v5, 0x1
} // :cond_c
int v5 = 0; // const/4 v5, 0x0
} // :goto_6
/* move/from16 v6, v16 */
int v8 = 0; // const/4 v8, 0x0
} // :goto_7
/* const-wide/16 v21, 0x1 */
/* if-lez v17, :cond_15 */
/* if-lez v6, :cond_15 */
/* const v10, 0x7fffffff */
/* const v4, 0x7fffffff */
int v10 = 0; // const/4 v10, 0x0
int v13 = 0; // const/4 v13, 0x0
/* const-wide/16 v23, 0x0 */
} // :goto_8
/* if-ge v10, v11, :cond_f */
(( android.support.v7.widget.ActionMenuView ) v0 ).getChildAt ( v10 ); // invoke-virtual {v0, v10}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;
/* invoke-virtual/range {v25 ..v25}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
/* move/from16 v26, v8 */
/* move-object/from16 v8, v25 */
/* check-cast v8, Landroid/support/v7/widget/ActionMenuView$LayoutParams; */
/* move/from16 v25, v12 */
/* iget-boolean v12, v8, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->b:Z */
if ( v12 != null) { // if-eqz v12, :cond_e
/* iget v12, v8, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->a:I */
/* if-ge v12, v4, :cond_d */
/* iget v4, v8, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->a:I */
/* shl-long v12, v21, v10 */
/* move-wide/from16 v23, v12 */
int v13 = 1; // const/4 v13, 0x1
} // :cond_d
/* iget v8, v8, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->a:I */
/* if-ne v8, v4, :cond_e */
/* shl-long v27, v21, v10 */
/* or-long v23, v23, v27 */
/* add-int/lit8 v13, v13, 0x1 */
} // :cond_e
} // :goto_9
/* add-int/lit8 v10, v10, 0x1 */
/* move/from16 v12, v25 */
/* move/from16 v8, v26 */
} // :cond_f
/* move/from16 v26, v8 */
/* move/from16 v25, v12 */
/* or-long v18, v18, v23 */
/* if-gt v13, v6, :cond_14 */
/* add-int/lit8 v4, v4, 0x1 */
/* move v8, v6 */
int v6 = 0; // const/4 v6, 0x0
} // :goto_a
/* if-ge v6, v11, :cond_13 */
(( android.support.v7.widget.ActionMenuView ) v0 ).getChildAt ( v6 ); // invoke-virtual {v0, v6}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v10 ).getLayoutParams ( ); // invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v12, Landroid/support/v7/widget/ActionMenuView$LayoutParams; */
/* move/from16 v27, v2 */
int v13 = 1; // const/4 v13, 0x1
/* shl-int v2, v13, v6 */
/* move v13, v1 */
/* int-to-long v1, v2 */
/* and-long v21, v23, v1 */
/* const-wide/16 v28, 0x0 */
/* cmp-long v26, v21, v28 */
/* if-nez v26, :cond_11 */
/* iget v10, v12, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->a:I */
/* if-ne v10, v4, :cond_10 */
/* or-long v18, v18, v1 */
} // :cond_10
/* move/from16 v21, v4 */
} // :cond_11
if ( v5 != null) { // if-eqz v5, :cond_12
/* iget-boolean v1, v12, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->c:Z */
if ( v1 != null) { // if-eqz v1, :cond_12
int v1 = 1; // const/4 v1, 0x1
/* if-ne v8, v1, :cond_12 */
/* iget v2, v0, Landroid/support/v7/widget/ActionMenuView;->d:I */
/* add-int v1, v2, v7 */
/* move/from16 v21, v4 */
int v4 = 0; // const/4 v4, 0x0
(( android.view.View ) v10 ).setPadding ( v1, v4, v2, v4 ); // invoke-virtual {v10, v1, v4, v2, v4}, Landroid/view/View;->setPadding(IIII)V
} // :cond_12
/* move/from16 v21, v4 */
} // :goto_b
/* iget v1, v12, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->a:I */
int v2 = 1; // const/4 v2, 0x1
/* add-int/2addr v1, v2 */
/* iput v1, v12, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->a:I */
/* iput-boolean v2, v12, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->d:Z */
/* add-int/lit8 v8, v8, -0x1 */
} // :goto_c
/* add-int/lit8 v6, v6, 0x1 */
/* move v1, v13 */
/* move/from16 v4, v21 */
/* move/from16 v2, v27 */
} // :cond_13
/* move v6, v8 */
/* move/from16 v12, v25 */
int v4 = 2; // const/4 v4, 0x2
int v8 = 1; // const/4 v8, 0x1
/* goto/16 :goto_7 */
} // :cond_14
/* move v13, v1 */
/* move/from16 v27, v2 */
} // :cond_15
/* move v13, v1 */
/* move/from16 v27, v2 */
/* move/from16 v26, v8 */
/* move/from16 v25, v12 */
} // :goto_d
/* if-nez v14, :cond_16 */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v15, v1, :cond_17 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_16
int v1 = 1; // const/4 v1, 0x1
} // :cond_17
int v2 = 0; // const/4 v2, 0x0
} // :goto_e
/* if-lez v6, :cond_23 */
/* const-wide/16 v4, 0x0 */
/* cmp-long v8, v18, v4 */
if ( v8 != null) { // if-eqz v8, :cond_23
/* sub-int/2addr v15, v1 */
/* if-lt v6, v15, :cond_18 */
/* if-nez v2, :cond_18 */
/* if-le v3, v1, :cond_23 */
} // :cond_18
v1 = /* invoke-static/range {v18 ..v19}, Ljava/lang/Long;->bitCount(J)I */
/* int-to-float v1, v1 */
/* if-nez v2, :cond_1a */
/* and-long v2, v18, v21 */
/* const/high16 v4, 0x3f000000 # 0.5f */
/* const-wide/16 v14, 0x0 */
/* cmp-long v5, v2, v14 */
if ( v5 != null) { // if-eqz v5, :cond_19
int v2 = 0; // const/4 v2, 0x0
(( android.support.v7.widget.ActionMenuView ) v0 ).getChildAt ( v2 ); // invoke-virtual {v0, v2}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroid/support/v7/widget/ActionMenuView$LayoutParams; */
/* iget-boolean v2, v2, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->c:Z */
/* if-nez v2, :cond_19 */
/* sub-float/2addr v1, v4 */
} // :cond_19
/* add-int/lit8 v2, v11, -0x1 */
int v3 = 1; // const/4 v3, 0x1
/* shl-int v5, v3, v2 */
/* int-to-long v14, v5 */
/* and-long v14, v18, v14 */
/* const-wide/16 v21, 0x0 */
/* cmp-long v3, v14, v21 */
if ( v3 != null) { // if-eqz v3, :cond_1a
(( android.support.v7.widget.ActionMenuView ) v0 ).getChildAt ( v2 ); // invoke-virtual {v0, v2}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroid/support/v7/widget/ActionMenuView$LayoutParams; */
/* iget-boolean v2, v2, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->c:Z */
/* if-nez v2, :cond_1a */
/* sub-float/2addr v1, v4 */
} // :cond_1a
int v2 = 0; // const/4 v2, 0x0
/* cmpl-float v2, v1, v2 */
/* if-lez v2, :cond_1b */
/* mul-int v6, v6, v7 */
/* int-to-float v2, v6 */
/* div-float/2addr v2, v1 */
/* float-to-int v4, v2 */
} // :cond_1b
int v4 = 0; // const/4 v4, 0x0
} // :goto_f
/* move/from16 v5, v26 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_10
/* if-ge v1, v11, :cond_22 */
int v2 = 1; // const/4 v2, 0x1
/* shl-int v3, v2, v1 */
/* int-to-long v14, v3 */
/* and-long v14, v18, v14 */
/* const-wide/16 v21, 0x0 */
/* cmp-long v3, v14, v21 */
if ( v3 != null) { // if-eqz v3, :cond_20
(( android.support.v7.widget.ActionMenuView ) v0 ).getChildAt ( v1 ); // invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v6, Landroid/support/v7/widget/ActionMenuView$LayoutParams; */
/* instance-of v3, v3, Landroid/support/v7/view/menu/ActionMenuItemView; */
if ( v3 != null) { // if-eqz v3, :cond_1d
/* iput v4, v6, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->b:I */
/* iput-boolean v2, v6, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->d:Z */
/* if-nez v1, :cond_1c */
/* iget-boolean v2, v6, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->c:Z */
/* if-nez v2, :cond_1c */
/* neg-int v2, v4 */
int v3 = 2; // const/4 v3, 0x2
/* div-int/2addr v2, v3 */
/* iput v2, v6, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->leftMargin:I */
} // :cond_1c
int v3 = 2; // const/4 v3, 0x2
} // :goto_11
int v2 = 1; // const/4 v2, 0x1
} // :cond_1d
int v3 = 2; // const/4 v3, 0x2
/* iget-boolean v2, v6, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->a:Z */
if ( v2 != null) { // if-eqz v2, :cond_1e
/* iput v4, v6, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->b:I */
int v2 = 1; // const/4 v2, 0x1
/* iput-boolean v2, v6, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->d:Z */
/* neg-int v5, v4 */
/* div-int/2addr v5, v3 */
/* iput v5, v6, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->rightMargin:I */
} // :goto_12
int v5 = 1; // const/4 v5, 0x1
} // :cond_1e
int v2 = 1; // const/4 v2, 0x1
if ( v1 != null) { // if-eqz v1, :cond_1f
/* div-int/lit8 v8, v4, 0x2 */
/* iput v8, v6, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->leftMargin:I */
} // :cond_1f
/* add-int/lit8 v8, v11, -0x1 */
/* if-eq v1, v8, :cond_21 */
/* div-int/lit8 v8, v4, 0x2 */
/* iput v8, v6, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->rightMargin:I */
} // :cond_20
int v3 = 2; // const/4 v3, 0x2
} // :cond_21
} // :goto_13
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_22
/* move/from16 v26, v5 */
} // :cond_23
if ( v26 != null) { // if-eqz v26, :cond_25
int v1 = 0; // const/4 v1, 0x0
} // :goto_14
/* if-ge v1, v11, :cond_25 */
(( android.support.v7.widget.ActionMenuView ) v0 ).getChildAt ( v1 ); // invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Landroid/support/v7/widget/ActionMenuView$LayoutParams; */
/* iget-boolean v4, v3, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->d:Z */
if ( v4 != null) { // if-eqz v4, :cond_24
/* iget v4, v3, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->a:I */
/* mul-int v4, v4, v7 */
/* iget v3, v3, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->b:I */
/* add-int/2addr v4, v3 */
/* const/high16 v3, 0x40000000 # 2.0f */
v4 = android.view.View$MeasureSpec .makeMeasureSpec ( v4,v3 );
(( android.view.View ) v2 ).measure ( v4, v9 ); // invoke-virtual {v2, v4, v9}, Landroid/view/View;->measure(II)V
} // :cond_24
/* const/high16 v3, 0x40000000 # 2.0f */
} // :goto_15
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_25
/* const/high16 v3, 0x40000000 # 2.0f */
/* move v1, v13 */
/* if-eq v1, v3, :cond_26 */
/* move/from16 v1, v25 */
} // :cond_26
/* move/from16 v1, v20 */
} // :goto_16
/* move/from16 v2, v27 */
(( android.support.v7.widget.ActionMenuView ) v0 ).setMeasuredDimension ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/support/v7/widget/ActionMenuView;->setMeasuredDimension(II)V
return;
} // :cond_27
/* move/from16 v10, p2 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_17
/* if-ge v2, v1, :cond_28 */
(( android.support.v7.widget.ActionMenuView ) v0 ).getChildAt ( v2 ); // invoke-virtual {v0, v2}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Landroid/support/v7/widget/ActionMenuView$LayoutParams; */
int v4 = 0; // const/4 v4, 0x0
/* iput v4, v3, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->rightMargin:I */
/* iput v4, v3, Landroid/support/v7/widget/ActionMenuView$LayoutParams;->leftMargin:I */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_28
/* invoke-super/range {p0 ..p2}, Landroid/support/v7/widget/LinearLayoutCompat;->onMeasure(II)V */
return;
} // .end method
public void setExpandedActionViewsExclusive ( Boolean p0 ) {
/* .locals 1 */
v0 = this.a;
/* iput-boolean p1, v0, Lhq;->b:Z */
return;
} // .end method
public void setMenuCallbacks ( hg$a p0, gz$a p1 ) {
/* .locals 0 */
this.a = p1;
this.a = p2;
return;
} // .end method
public void setOnMenuItemClickListener ( android.support.v7.widget.ActionMenuView$d p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
public void setOverflowIcon ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
(( android.support.v7.widget.ActionMenuView ) p0 ).getMenu ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getMenu()Landroid/view/Menu;
v0 = this.a;
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_0
v0 = this.a;
(( hq$d ) v0 ).setImageDrawable ( p1 ); // invoke-virtual {v0, p1}, Lhq$d;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
return;
} // :cond_0
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, v0, Lhq;->a:Z */
this.a = p1;
return;
} // .end method
public void setOverflowReserved ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Landroid/support/v7/widget/ActionMenuView;->a:Z */
return;
} // .end method
public void setPopupTheme ( Integer p0 ) {
/* .locals 2 */
/* iget v0, p0, Landroid/support/v7/widget/ActionMenuView;->a:I */
/* if-eq v0, p1, :cond_1 */
/* iput p1, p0, Landroid/support/v7/widget/ActionMenuView;->a:I */
/* if-nez p1, :cond_0 */
(( android.support.v7.widget.ActionMenuView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getContext()Landroid/content/Context;
this.a = p1;
return;
} // :cond_0
/* new-instance v0, Landroid/view/ContextThemeWrapper; */
(( android.support.v7.widget.ActionMenuView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V */
this.a = v0;
} // :cond_1
return;
} // .end method
public void setPresenter ( hq p0 ) {
/* .locals 0 */
this.a = p1;
p1 = this.a;
(( hq ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lhq;->a(Landroid/support/v7/widget/ActionMenuView;)V
return;
} // .end method
