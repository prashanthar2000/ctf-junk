public class android.support.v7.view.menu.ActionMenuItemView extends android.support.v7.widget.AppCompatTextView implements android.support.v7.widget.ActionMenuView$a implements android.view.View$OnClickListener implements hh$a {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/v7/view/menu/ActionMenuItemView$b;, */
	 /* Landroid/support/v7/view/menu/ActionMenuItemView$a; */
	 /* } */
} // .end annotation
/* # instance fields */
private Integer a;
private android.graphics.drawable.Drawable a;
android.support.v7.view.menu.ActionMenuItemView$b a;
gz$b a;
hb a;
private ig a;
private java.lang.CharSequence a;
private Integer b;
private Boolean b;
private Integer c;
private Boolean c;
/* # direct methods */
public android.support.v7.view.menu.ActionMenuItemView ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, p1, v0}, Landroid/support/v7/view/menu/ActionMenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 return;
} // .end method
public android.support.v7.view.menu.ActionMenuItemView ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/view/menu/ActionMenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 return;
} // .end method
public android.support.v7.view.menu.ActionMenuItemView ( ) {
	 /* .locals 3 */
	 /* invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
	 v1 = 	 /* invoke-direct {p0}, Landroid/support/v7/view/menu/ActionMenuItemView;->e()Z */
	 /* iput-boolean v1, p0, Landroid/support/v7/view/menu/ActionMenuItemView;->b:Z */
	 v1 = gc$j.ActionMenuItemView;
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v1, p3, v2 ); // invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
	 p2 = 	 (( android.content.res.TypedArray ) p1 ).getDimensionPixelSize ( p2, v2 ); // invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
	 /* iput p2, p0, Landroid/support/v7/view/menu/ActionMenuItemView;->a:I */
	 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
	 (( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
	 /* iget p1, p1, Landroid/util/DisplayMetrics;->density:F */
	 /* const/high16 p2, 0x42000000 # 32.0f */
	 /* mul-float p1, p1, p2 */
	 /* const/high16 p2, 0x3f000000 # 0.5f */
	 /* add-float/2addr p1, p2 */
	 /* float-to-int p1, p1 */
	 /* iput p1, p0, Landroid/support/v7/view/menu/ActionMenuItemView;->c:I */
	 (( android.support.v7.view.menu.ActionMenuItemView ) p0 ).setOnClickListener ( p0 ); // invoke-virtual {p0, p0}, Landroid/support/v7/view/menu/ActionMenuItemView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
	 int p1 = -1; // const/4 p1, -0x1
	 /* iput p1, p0, Landroid/support/v7/view/menu/ActionMenuItemView;->b:I */
	 (( android.support.v7.view.menu.ActionMenuItemView ) p0 ).setSaveEnabled ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/v7/view/menu/ActionMenuItemView;->setSaveEnabled(Z)V
	 return;
} // .end method
private void a ( ) {
	 /* .locals 4 */
	 v0 = this.a;
	 v0 = 	 android.text.TextUtils .isEmpty ( v0 );
	 int v1 = 1; // const/4 v1, 0x1
	 /* xor-int/2addr v0, v1 */
	 v2 = this.a;
	 if ( v2 != null) { // if-eqz v2, :cond_1
		 v2 = this.a;
		 v2 = 		 (( hb ) v2 ).g ( ); // invoke-virtual {v2}, Lhb;->g()Z
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* iget-boolean v2, p0, Landroid/support/v7/view/menu/ActionMenuItemView;->b:Z */
			 /* if-nez v2, :cond_1 */
			 /* iget-boolean v2, p0, Landroid/support/v7/view/menu/ActionMenuItemView;->c:Z */
			 if ( v2 != null) { // if-eqz v2, :cond_0
			 } // :cond_0
			 int v1 = 0; // const/4 v1, 0x0
		 } // :cond_1
	 } // :goto_0
	 /* and-int/2addr v0, v1 */
	 int v1 = 0; // const/4 v1, 0x0
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 v2 = this.a;
	 } // :cond_2
	 /* move-object v2, v1 */
} // :goto_1
(( android.support.v7.view.menu.ActionMenuItemView ) p0 ).setText ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/v7/view/menu/ActionMenuItemView;->setText(Ljava/lang/CharSequence;)V
v2 = this.a;
(( hb ) v2 ).getContentDescription ( ); // invoke-virtual {v2}, Lhb;->getContentDescription()Ljava/lang/CharSequence;
v3 = android.text.TextUtils .isEmpty ( v2 );
if ( v3 != null) { // if-eqz v3, :cond_4
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 /* move-object v2, v1 */
	 } // :cond_3
	 v2 = this.a;
	 (( hb ) v2 ).getTitle ( ); // invoke-virtual {v2}, Lhb;->getTitle()Ljava/lang/CharSequence;
} // :cond_4
} // :goto_2
(( android.support.v7.view.menu.ActionMenuItemView ) p0 ).setContentDescription ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/v7/view/menu/ActionMenuItemView;->setContentDescription(Ljava/lang/CharSequence;)V
v2 = this.a;
(( hb ) v2 ).getTooltipText ( ); // invoke-virtual {v2}, Lhb;->getTooltipText()Ljava/lang/CharSequence;
v3 = android.text.TextUtils .isEmpty ( v2 );
if ( v3 != null) { // if-eqz v3, :cond_6
if ( v0 != null) { // if-eqz v0, :cond_5
} // :cond_5
v0 = this.a;
(( hb ) v0 ).getTitle ( ); // invoke-virtual {v0}, Lhb;->getTitle()Ljava/lang/CharSequence;
} // :goto_3
ir .a ( p0,v1 );
return;
} // :cond_6
ir .a ( p0,v2 );
return;
} // .end method
private Boolean e ( ) {
/* .locals 5 */
(( android.support.v7.view.menu.ActionMenuItemView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/view/menu/ActionMenuItemView;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getConfiguration ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* iget v1, v0, Landroid/content/res/Configuration;->screenWidthDp:I */
/* iget v2, v0, Landroid/content/res/Configuration;->screenHeightDp:I */
/* const/16 v3, 0x1e0 */
/* if-ge v1, v3, :cond_2 */
/* const/16 v4, 0x280 */
/* if-lt v1, v4, :cond_0 */
/* if-ge v2, v3, :cond_2 */
} // :cond_0
/* iget v0, v0, Landroid/content/res/Configuration;->orientation:I */
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_1 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :cond_2
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
/* # virtual methods */
public final void a ( hb p0 ) {
/* .locals 1 */
this.a = p1;
(( hb ) p1 ).getIcon ( ); // invoke-virtual {p1}, Lhb;->getIcon()Landroid/graphics/drawable/Drawable;
(( android.support.v7.view.menu.ActionMenuItemView ) p0 ).setIcon ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/view/menu/ActionMenuItemView;->setIcon(Landroid/graphics/drawable/Drawable;)V
(( hb ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lhb;->a(Lhh$a;)Ljava/lang/CharSequence;
(( android.support.v7.view.menu.ActionMenuItemView ) p0 ).setTitle ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/view/menu/ActionMenuItemView;->setTitle(Ljava/lang/CharSequence;)V
v0 = (( hb ) p1 ).getItemId ( ); // invoke-virtual {p1}, Lhb;->getItemId()I
(( android.support.v7.view.menu.ActionMenuItemView ) p0 ).setId ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/view/menu/ActionMenuItemView;->setId(I)V
v0 = (( hb ) p1 ).isVisible ( ); // invoke-virtual {p1}, Lhb;->isVisible()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
/* const/16 v0, 0x8 */
} // :goto_0
(( android.support.v7.view.menu.ActionMenuItemView ) p0 ).setVisibility ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/view/menu/ActionMenuItemView;->setVisibility(I)V
v0 = (( hb ) p1 ).isEnabled ( ); // invoke-virtual {p1}, Lhb;->isEnabled()Z
(( android.support.v7.view.menu.ActionMenuItemView ) p0 ).setEnabled ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/view/menu/ActionMenuItemView;->setEnabled(Z)V
p1 = (( hb ) p1 ).hasSubMenu ( ); // invoke-virtual {p1}, Lhb;->hasSubMenu()Z
if ( p1 != null) { // if-eqz p1, :cond_1
p1 = this.a;
/* if-nez p1, :cond_1 */
/* new-instance p1, Landroid/support/v7/view/menu/ActionMenuItemView$a; */
/* invoke-direct {p1, p0}, Landroid/support/v7/view/menu/ActionMenuItemView$a;-><init>(Landroid/support/v7/view/menu/ActionMenuItemView;)V */
this.a = p1;
} // :cond_1
return;
} // .end method
public final Boolean a ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public final Boolean b ( ) {
/* .locals 1 */
(( android.support.v7.view.menu.ActionMenuItemView ) p0 ).getText ( ); // invoke-virtual {p0}, Landroid/support/v7/view/menu/ActionMenuItemView;->getText()Ljava/lang/CharSequence;
v0 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final Boolean c ( ) {
/* .locals 1 */
v0 = (( android.support.v7.view.menu.ActionMenuItemView ) p0 ).b ( ); // invoke-virtual {p0}, Landroid/support/v7/view/menu/ActionMenuItemView;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( hb ) v0 ).getIcon ( ); // invoke-virtual {v0}, Lhb;->getIcon()Landroid/graphics/drawable/Drawable;
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final Boolean d ( ) {
/* .locals 1 */
v0 = (( android.support.v7.view.menu.ActionMenuItemView ) p0 ).b ( ); // invoke-virtual {p0}, Landroid/support/v7/view/menu/ActionMenuItemView;->b()Z
} // .end method
public hb getItemData ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public void onClick ( android.view.View p0 ) {
/* .locals 1 */
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = this.a;
} // :cond_0
return;
} // .end method
public void onConfigurationChanged ( android.content.res.Configuration p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1}, Landroid/support/v7/widget/AppCompatTextView;->onConfigurationChanged(Landroid/content/res/Configuration;)V */
p1 = /* invoke-direct {p0}, Landroid/support/v7/view/menu/ActionMenuItemView;->e()Z */
/* iput-boolean p1, p0, Landroid/support/v7/view/menu/ActionMenuItemView;->b:Z */
/* invoke-direct {p0}, Landroid/support/v7/view/menu/ActionMenuItemView;->a()V */
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 5 */
v0 = (( android.support.v7.view.menu.ActionMenuItemView ) p0 ).b ( ); // invoke-virtual {p0}, Landroid/support/v7/view/menu/ActionMenuItemView;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v1, p0, Landroid/support/v7/view/menu/ActionMenuItemView;->b:I */
/* if-ltz v1, :cond_0 */
v2 = (( android.support.v7.view.menu.ActionMenuItemView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v7/view/menu/ActionMenuItemView;->getPaddingTop()I
v3 = (( android.support.v7.view.menu.ActionMenuItemView ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v7/view/menu/ActionMenuItemView;->getPaddingRight()I
v4 = (( android.support.v7.view.menu.ActionMenuItemView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v7/view/menu/ActionMenuItemView;->getPaddingBottom()I
/* invoke-super {p0, v1, v2, v3, v4}, Landroid/support/v7/widget/AppCompatTextView;->setPadding(IIII)V */
} // :cond_0
/* invoke-super {p0, p1, p2}, Landroid/support/v7/widget/AppCompatTextView;->onMeasure(II)V */
v1 = android.view.View$MeasureSpec .getMode ( p1 );
p1 = android.view.View$MeasureSpec .getSize ( p1 );
v2 = (( android.support.v7.view.menu.ActionMenuItemView ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/support/v7/view/menu/ActionMenuItemView;->getMeasuredWidth()I
/* const/high16 v3, -0x80000000 */
/* if-ne v1, v3, :cond_1 */
/* iget v3, p0, Landroid/support/v7/view/menu/ActionMenuItemView;->a:I */
p1 = java.lang.Math .min ( p1,v3 );
} // :cond_1
/* iget p1, p0, Landroid/support/v7/view/menu/ActionMenuItemView;->a:I */
} // :goto_0
/* const/high16 v3, 0x40000000 # 2.0f */
/* if-eq v1, v3, :cond_2 */
/* iget v1, p0, Landroid/support/v7/view/menu/ActionMenuItemView;->a:I */
/* if-lez v1, :cond_2 */
/* if-ge v2, p1, :cond_2 */
p1 = android.view.View$MeasureSpec .makeMeasureSpec ( p1,v3 );
/* invoke-super {p0, p1, p2}, Landroid/support/v7/widget/AppCompatTextView;->onMeasure(II)V */
} // :cond_2
/* if-nez v0, :cond_3 */
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_3
p1 = (( android.support.v7.view.menu.ActionMenuItemView ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/support/v7/view/menu/ActionMenuItemView;->getMeasuredWidth()I
p2 = this.a;
(( android.graphics.drawable.Drawable ) p2 ).getBounds ( ); // invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;
p2 = (( android.graphics.Rect ) p2 ).width ( ); // invoke-virtual {p2}, Landroid/graphics/Rect;->width()I
/* sub-int/2addr p1, p2 */
/* div-int/lit8 p1, p1, 0x2 */
p2 = (( android.support.v7.view.menu.ActionMenuItemView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v7/view/menu/ActionMenuItemView;->getPaddingTop()I
v0 = (( android.support.v7.view.menu.ActionMenuItemView ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v7/view/menu/ActionMenuItemView;->getPaddingRight()I
v1 = (( android.support.v7.view.menu.ActionMenuItemView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v7/view/menu/ActionMenuItemView;->getPaddingBottom()I
/* invoke-super {p0, p1, p2, v0, v1}, Landroid/support/v7/widget/AppCompatTextView;->setPadding(IIII)V */
} // :cond_3
return;
} // .end method
public void onRestoreInstanceState ( android.os.Parcelable p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
/* invoke-super {p0, p1}, Landroid/support/v7/widget/AppCompatTextView;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 1 */
v0 = this.a;
v0 = (( hb ) v0 ).hasSubMenu ( ); // invoke-virtual {v0}, Lhb;->hasSubMenu()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( ig ) v0 ).onTouch ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lig;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
p1 = /* invoke-super {p0, p1}, Landroid/support/v7/widget/AppCompatTextView;->onTouchEvent(Landroid/view/MotionEvent;)Z */
} // .end method
public void setCheckable ( Boolean p0 ) {
/* .locals 0 */
return;
} // .end method
public void setChecked ( Boolean p0 ) {
/* .locals 0 */
return;
} // .end method
public void setExpandedFormat ( Boolean p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Landroid/support/v7/view/menu/ActionMenuItemView;->c:Z */
/* if-eq v0, p1, :cond_0 */
/* iput-boolean p1, p0, Landroid/support/v7/view/menu/ActionMenuItemView;->c:Z */
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = this.a;
(( gz ) p1 ).d ( ); // invoke-virtual {p1}, Lgz;->d()V
} // :cond_0
return;
} // .end method
public void setIcon ( android.graphics.drawable.Drawable p0 ) {
/* .locals 4 */
this.a = p1;
if ( p1 != null) { // if-eqz p1, :cond_2
v0 = (( android.graphics.drawable.Drawable ) p1 ).getIntrinsicWidth ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
v1 = (( android.graphics.drawable.Drawable ) p1 ).getIntrinsicHeight ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
/* iget v2, p0, Landroid/support/v7/view/menu/ActionMenuItemView;->c:I */
/* if-le v0, v2, :cond_0 */
/* int-to-float v3, v2 */
/* int-to-float v0, v0 */
/* div-float/2addr v3, v0 */
/* int-to-float v0, v1 */
/* mul-float v0, v0, v3 */
/* float-to-int v1, v0 */
/* move v0, v2 */
} // :cond_0
/* iget v2, p0, Landroid/support/v7/view/menu/ActionMenuItemView;->c:I */
/* if-le v1, v2, :cond_1 */
/* int-to-float v3, v2 */
/* int-to-float v1, v1 */
/* div-float/2addr v3, v1 */
/* int-to-float v0, v0 */
/* mul-float v0, v0, v3 */
/* float-to-int v0, v0 */
/* move v1, v2 */
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
(( android.graphics.drawable.Drawable ) p1 ).setBounds ( v2, v2, v0, v1 ); // invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
(( android.support.v7.view.menu.ActionMenuItemView ) p0 ).setCompoundDrawables ( p1, v0, v0, v0 ); // invoke-virtual {p0, p1, v0, v0, v0}, Landroid/support/v7/view/menu/ActionMenuItemView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
/* invoke-direct {p0}, Landroid/support/v7/view/menu/ActionMenuItemView;->a()V */
return;
} // .end method
public void setItemInvoker ( gz$b p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
public void setPadding ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v7/view/menu/ActionMenuItemView;->b:I */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v7/widget/AppCompatTextView;->setPadding(IIII)V */
return;
} // .end method
public void setPopupCallback ( android.support.v7.view.menu.ActionMenuItemView$b p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
public void setShortcut ( Boolean p0, Object p1 ) {
/* .locals 0 */
return;
} // .end method
public void setTitle ( java.lang.CharSequence p0 ) {
/* .locals 0 */
this.a = p1;
/* invoke-direct {p0}, Landroid/support/v7/view/menu/ActionMenuItemView;->a()V */
return;
} // .end method
