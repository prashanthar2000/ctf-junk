public class android.support.v7.widget.ActionBarContextView extends ho {
	 /* # instance fields */
	 private android.view.View a;
	 private android.widget.LinearLayout a;
	 private android.widget.TextView a;
	 private java.lang.CharSequence a;
	 public Boolean a;
	 private Integer b;
	 private android.view.View b;
	 private android.widget.TextView b;
	 private java.lang.CharSequence b;
	 private Integer c;
	 private Integer d;
	 /* # direct methods */
	 public android.support.v7.widget.ActionBarContextView ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/ActionBarContextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.ActionBarContextView ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/ActionBarContextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.ActionBarContextView ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0, p1, p2, p3}, Lho;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 v0 = gc$j.ActionMode;
		 int v1 = 0; // const/4 v1, 0x0
		 ip .a ( p1,p2,v0,p3,v1 );
		 (( ip ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lip;->a(I)Landroid/graphics/drawable/Drawable;
		 em .a ( p0,p2 );
		 p2 = 		 (( ip ) p1 ).g ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lip;->g(II)I
		 /* iput p2, p0, Landroid/support/v7/widget/ActionBarContextView;->b:I */
		 p2 = 		 (( ip ) p1 ).g ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lip;->g(II)I
		 /* iput p2, p0, Landroid/support/v7/widget/ActionBarContextView;->c:I */
		 p2 = 		 (( ip ) p1 ).f ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lip;->f(II)I
		 /* iput p2, p0, Landroid/support/v7/widget/ActionBarContextView;->a:I */
		 p2 = 		 (( ip ) p1 ).g ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lip;->g(II)I
		 /* iput p2, p0, Landroid/support/v7/widget/ActionBarContextView;->d:I */
		 p1 = this.a;
		 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
		 return;
	 } // .end method
	 private void c ( ) {
		 /* .locals 6 */
		 v0 = this.a;
		 /* if-nez v0, :cond_1 */
		 (( android.support.v7.widget.ActionBarContextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->getContext()Landroid/content/Context;
		 android.view.LayoutInflater .from ( v0 );
		 (( android.view.LayoutInflater ) v0 ).inflate ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
		 v0 = 		 (( android.support.v7.widget.ActionBarContextView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->getChildCount()I
		 /* add-int/lit8 v0, v0, -0x1 */
		 (( android.support.v7.widget.ActionBarContextView ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActionBarContextView;->getChildAt(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/LinearLayout; */
		 this.a = v0;
		 v0 = this.a;
		 (( android.widget.LinearLayout ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/TextView; */
		 this.a = v0;
		 v0 = this.a;
		 (( android.widget.LinearLayout ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/TextView; */
		 this.b = v0;
		 /* iget v0, p0, Landroid/support/v7/widget/ActionBarContextView;->b:I */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.a;
			 (( android.support.v7.widget.ActionBarContextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->getContext()Landroid/content/Context;
			 /* iget v2, p0, Landroid/support/v7/widget/ActionBarContextView;->b:I */
			 (( android.widget.TextView ) v0 ).setTextAppearance ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
		 } // :cond_0
		 /* iget v0, p0, Landroid/support/v7/widget/ActionBarContextView;->c:I */
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 v0 = this.b;
			 (( android.support.v7.widget.ActionBarContextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->getContext()Landroid/content/Context;
			 /* iget v2, p0, Landroid/support/v7/widget/ActionBarContextView;->c:I */
			 (( android.widget.TextView ) v0 ).setTextAppearance ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
		 } // :cond_1
		 v0 = this.a;
		 v1 = this.a;
		 (( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
		 v0 = this.b;
		 v1 = this.b;
		 (( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
		 v0 = this.a;
		 v0 = 		 android.text.TextUtils .isEmpty ( v0 );
		 /* xor-int/lit8 v0, v0, 0x1 */
		 v1 = this.b;
		 v1 = 		 android.text.TextUtils .isEmpty ( v1 );
		 /* xor-int/lit8 v1, v1, 0x1 */
		 v2 = this.b;
		 int v3 = 0; // const/4 v3, 0x0
		 /* const/16 v4, 0x8 */
		 if ( v1 != null) { // if-eqz v1, :cond_2
			 int v5 = 0; // const/4 v5, 0x0
		 } // :cond_2
		 /* const/16 v5, 0x8 */
	 } // :goto_0
	 (( android.widget.TextView ) v2 ).setVisibility ( v5 ); // invoke-virtual {v2, v5}, Landroid/widget/TextView;->setVisibility(I)V
	 v2 = this.a;
	 /* if-nez v0, :cond_4 */
	 if ( v1 != null) { // if-eqz v1, :cond_3
	 } // :cond_3
	 /* const/16 v3, 0x8 */
} // :cond_4
} // :goto_1
(( android.widget.LinearLayout ) v2 ).setVisibility ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V
v0 = this.a;
(( android.widget.LinearLayout ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/widget/LinearLayout;->getParent()Landroid/view/ViewParent;
/* if-nez v0, :cond_5 */
v0 = this.a;
(( android.support.v7.widget.ActionBarContextView ) p0 ).addView ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActionBarContextView;->addView(Landroid/view/View;)V
} // :cond_5
return;
} // .end method
/* # virtual methods */
public final ep a ( Integer p0, Long p1 ) { //bridge//synthethic
/* .locals 0 */
/* invoke-super {p0, p1, p2, p3}, Lho;->a(IJ)Lep; */
} // .end method
public final void a ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
(( android.support.v7.widget.ActionBarContextView ) p0 ).b ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->b()V
} // :cond_0
return;
} // .end method
public final void a ( gk p0 ) {
/* .locals 3 */
v0 = this.a;
/* if-nez v0, :cond_0 */
(( android.support.v7.widget.ActionBarContextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->getContext()Landroid/content/Context;
android.view.LayoutInflater .from ( v0 );
/* iget v1, p0, Landroid/support/v7/widget/ActionBarContextView;->d:I */
int v2 = 0; // const/4 v2, 0x0
(( android.view.LayoutInflater ) v0 ).inflate ( v1, p0, v2 ); // invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
this.a = v0;
} // :goto_0
v0 = this.a;
(( android.support.v7.widget.ActionBarContextView ) p0 ).addView ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActionBarContextView;->addView(Landroid/view/View;)V
} // :cond_0
(( android.view.View ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* if-nez v0, :cond_1 */
} // :cond_1
} // :goto_1
v0 = this.a;
(( android.view.View ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* new-instance v1, Landroid/support/v7/widget/ActionBarContextView$1; */
/* invoke-direct {v1, p0, p1}, Landroid/support/v7/widget/ActionBarContextView$1;-><init>(Landroid/support/v7/widget/ActionBarContextView;Lgk;)V */
(( android.view.View ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
(( gk ) p1 ).a ( ); // invoke-virtual {p1}, Lgk;->a()Landroid/view/Menu;
/* check-cast p1, Lgz; */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.a;
(( hq ) v0 ).d ( ); // invoke-virtual {v0}, Lhq;->d()Z
} // :cond_2
/* new-instance v0, Lhq; */
(( android.support.v7.widget.ActionBarContextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1}, Lhq;-><init>(Landroid/content/Context;)V */
this.a = v0;
v0 = this.a;
(( hq ) v0 ).b ( ); // invoke-virtual {v0}, Lhq;->b()V
/* new-instance v0, Landroid/view/ViewGroup$LayoutParams; */
int v1 = -2; // const/4 v1, -0x2
int v2 = -1; // const/4 v2, -0x1
/* invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
v1 = this.a;
v2 = this.a;
(( gz ) p1 ).a ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Lgz;->a(Lhg;Landroid/content/Context;)V
p1 = this.a;
(( hq ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lhq;->a(Landroid/view/ViewGroup;)Lhh;
/* check-cast p1, Landroid/support/v7/widget/ActionMenuView; */
this.a = p1;
p1 = this.a;
int v1 = 0; // const/4 v1, 0x0
em .a ( p1,v1 );
p1 = this.a;
(( android.support.v7.widget.ActionBarContextView ) p0 ).addView ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/support/v7/widget/ActionBarContextView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
return;
} // .end method
public final Boolean a ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
v0 = (( hq ) v0 ).b ( ); // invoke-virtual {v0}, Lhq;->b()Z
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final void b ( ) {
/* .locals 1 */
(( android.support.v7.widget.ActionBarContextView ) p0 ).removeAllViews ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->removeAllViews()V
int v0 = 0; // const/4 v0, 0x0
this.b = v0;
this.a = v0;
return;
} // .end method
protected android.view.ViewGroup$LayoutParams generateDefaultLayoutParams ( ) {
/* .locals 3 */
/* new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams; */
int v1 = -1; // const/4 v1, -0x1
int v2 = -2; // const/4 v2, -0x2
/* invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V */
} // .end method
public android.view.ViewGroup$LayoutParams generateLayoutParams ( android.util.AttributeSet p0 ) {
/* .locals 2 */
/* new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams; */
(( android.support.v7.widget.ActionBarContextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public Integer getAnimatedVisibility ( ) { //bridge//synthethic
/* .locals 1 */
v0 = /* invoke-super {p0}, Lho;->getAnimatedVisibility()I */
} // .end method
public Integer getContentHeight ( ) { //bridge//synthethic
/* .locals 1 */
v0 = /* invoke-super {p0}, Lho;->getContentHeight()I */
} // .end method
public java.lang.CharSequence getSubtitle ( ) {
/* .locals 1 */
v0 = this.b;
} // .end method
public java.lang.CharSequence getTitle ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public void onDetachedFromWindow ( ) {
/* .locals 1 */
/* invoke-super {p0}, Lho;->onDetachedFromWindow()V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( hq ) v0 ).c ( ); // invoke-virtual {v0}, Lhq;->c()Z
v0 = this.a;
(( hq ) v0 ).e ( ); // invoke-virtual {v0}, Lhq;->e()Z
} // :cond_0
return;
} // .end method
public Boolean onHoverEvent ( android.view.MotionEvent p0 ) { //bridge//synthethic
/* .locals 0 */
p1 = /* invoke-super {p0, p1}, Lho;->onHoverEvent(Landroid/view/MotionEvent;)Z */
} // .end method
public void onInitializeAccessibilityEvent ( android.view.accessibility.AccessibilityEvent p0 ) {
/* .locals 2 */
v0 = (( android.view.accessibility.AccessibilityEvent ) p1 ).getEventType ( ); // invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I
/* const/16 v1, 0x20 */
/* if-ne v0, v1, :cond_0 */
(( android.view.accessibility.AccessibilityEvent ) p1 ).setSource ( p0 ); // invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityEvent;->setSource(Landroid/view/View;)V
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( android.view.accessibility.AccessibilityEvent ) p1 ).setClassName ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V
(( android.support.v7.widget.ActionBarContextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getPackageName ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( android.view.accessibility.AccessibilityEvent ) p1 ).setPackageName ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V
v0 = this.a;
(( android.view.accessibility.AccessibilityEvent ) p1 ).setContentDescription ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setContentDescription(Ljava/lang/CharSequence;)V
return;
} // :cond_0
/* invoke-super {p0, p1}, Lho;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V */
return;
} // .end method
protected void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 4 */
p1 = iv .a ( p0 );
if ( p1 != null) { // if-eqz p1, :cond_0
/* sub-int v0, p4, p2 */
v1 = (( android.support.v7.widget.ActionBarContextView ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->getPaddingRight()I
/* sub-int/2addr v0, v1 */
} // :cond_0
v0 = (( android.support.v7.widget.ActionBarContextView ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->getPaddingLeft()I
} // :goto_0
v1 = (( android.support.v7.widget.ActionBarContextView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->getPaddingTop()I
/* sub-int/2addr p5, p3 */
p3 = (( android.support.v7.widget.ActionBarContextView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->getPaddingTop()I
/* sub-int/2addr p5, p3 */
p3 = (( android.support.v7.widget.ActionBarContextView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->getPaddingBottom()I
/* sub-int/2addr p5, p3 */
p3 = this.a;
/* const/16 v2, 0x8 */
if ( p3 != null) { // if-eqz p3, :cond_3
p3 = (( android.view.View ) p3 ).getVisibility ( ); // invoke-virtual {p3}, Landroid/view/View;->getVisibility()I
/* if-eq p3, v2, :cond_3 */
p3 = this.a;
(( android.view.View ) p3 ).getLayoutParams ( ); // invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p3, Landroid/view/ViewGroup$MarginLayoutParams; */
if ( p1 != null) { // if-eqz p1, :cond_1
/* iget v3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
} // :cond_1
/* iget v3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
} // :goto_1
if ( p1 != null) { // if-eqz p1, :cond_2
/* iget p3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
} // :cond_2
/* iget p3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
} // :goto_2
v0 = android.support.v7.widget.ActionBarContextView .a ( v0,v3,p1 );
v3 = this.a;
v3 = android.support.v7.widget.ActionBarContextView .a ( v3,v0,v1,p5,p1 );
/* add-int/2addr v0, v3 */
v0 = android.support.v7.widget.ActionBarContextView .a ( v0,p3,p1 );
} // :cond_3
p3 = this.a;
if ( p3 != null) { // if-eqz p3, :cond_4
v3 = this.b;
/* if-nez v3, :cond_4 */
p3 = (( android.widget.LinearLayout ) p3 ).getVisibility ( ); // invoke-virtual {p3}, Landroid/widget/LinearLayout;->getVisibility()I
/* if-eq p3, v2, :cond_4 */
p3 = this.a;
p3 = android.support.v7.widget.ActionBarContextView .a ( p3,v0,v1,p5,p1 );
/* add-int/2addr v0, p3 */
} // :cond_4
p3 = this.b;
if ( p3 != null) { // if-eqz p3, :cond_5
android.support.v7.widget.ActionBarContextView .a ( p3,v0,v1,p5,p1 );
} // :cond_5
if ( p1 != null) { // if-eqz p1, :cond_6
p2 = (( android.support.v7.widget.ActionBarContextView ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->getPaddingLeft()I
} // :cond_6
/* sub-int/2addr p4, p2 */
p2 = (( android.support.v7.widget.ActionBarContextView ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->getPaddingRight()I
/* sub-int p2, p4, p2 */
} // :goto_3
p3 = this.a;
if ( p3 != null) { // if-eqz p3, :cond_7
p3 = this.a;
/* xor-int/lit8 p1, p1, 0x1 */
android.support.v7.widget.ActionBarContextView .a ( p3,p2,v1,p5,p1 );
} // :cond_7
return;
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 10 */
v0 = android.view.View$MeasureSpec .getMode ( p1 );
/* const/high16 v1, 0x40000000 # 2.0f */
/* if-ne v0, v1, :cond_11 */
v0 = android.view.View$MeasureSpec .getMode ( p2 );
if ( v0 != null) { // if-eqz v0, :cond_10
p1 = android.view.View$MeasureSpec .getSize ( p1 );
/* iget v0, p0, Landroid/support/v7/widget/ActionBarContextView;->a:I */
/* if-lez v0, :cond_0 */
/* iget p2, p0, Landroid/support/v7/widget/ActionBarContextView;->a:I */
} // :cond_0
p2 = android.view.View$MeasureSpec .getSize ( p2 );
} // :goto_0
v0 = (( android.support.v7.widget.ActionBarContextView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->getPaddingTop()I
v2 = (( android.support.v7.widget.ActionBarContextView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->getPaddingBottom()I
/* add-int/2addr v0, v2 */
v2 = (( android.support.v7.widget.ActionBarContextView ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->getPaddingLeft()I
/* sub-int v2, p1, v2 */
v3 = (( android.support.v7.widget.ActionBarContextView ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->getPaddingRight()I
/* sub-int/2addr v2, v3 */
/* sub-int v3, p2, v0 */
/* const/high16 v4, -0x80000000 */
v5 = android.view.View$MeasureSpec .makeMeasureSpec ( v3,v4 );
v6 = this.a;
if ( v6 != null) { // if-eqz v6, :cond_1
v2 = android.support.v7.widget.ActionBarContextView .a ( v6,v2,v5 );
v6 = this.a;
(( android.view.View ) v6 ).getLayoutParams ( ); // invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams; */
/* iget v7, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v7, v6 */
/* sub-int/2addr v2, v7 */
} // :cond_1
v6 = this.a;
if ( v6 != null) { // if-eqz v6, :cond_2
v6 = this.a;
(( android.support.v7.widget.ActionMenuView ) v6 ).getParent ( ); // invoke-virtual {v6}, Landroid/support/v7/widget/ActionMenuView;->getParent()Landroid/view/ViewParent;
/* if-ne v6, p0, :cond_2 */
v6 = this.a;
v2 = android.support.v7.widget.ActionBarContextView .a ( v6,v2,v5 );
} // :cond_2
v6 = this.a;
int v7 = 0; // const/4 v7, 0x0
if ( v6 != null) { // if-eqz v6, :cond_7
v8 = this.b;
/* if-nez v8, :cond_7 */
/* iget-boolean v8, p0, Landroid/support/v7/widget/ActionBarContextView;->a:Z */
if ( v8 != null) { // if-eqz v8, :cond_6
v6 = android.view.View$MeasureSpec .makeMeasureSpec ( v7,v7 );
v8 = this.a;
(( android.widget.LinearLayout ) v8 ).measure ( v6, v5 ); // invoke-virtual {v8, v6, v5}, Landroid/widget/LinearLayout;->measure(II)V
v5 = this.a;
v5 = (( android.widget.LinearLayout ) v5 ).getMeasuredWidth ( ); // invoke-virtual {v5}, Landroid/widget/LinearLayout;->getMeasuredWidth()I
/* if-gt v5, v2, :cond_3 */
int v6 = 1; // const/4 v6, 0x1
} // :cond_3
int v6 = 0; // const/4 v6, 0x0
} // :goto_1
if ( v6 != null) { // if-eqz v6, :cond_4
/* sub-int/2addr v2, v5 */
} // :cond_4
v5 = this.a;
if ( v6 != null) { // if-eqz v6, :cond_5
int v6 = 0; // const/4 v6, 0x0
} // :cond_5
/* const/16 v6, 0x8 */
} // :goto_2
(( android.widget.LinearLayout ) v5 ).setVisibility ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V
} // :cond_6
v2 = android.support.v7.widget.ActionBarContextView .a ( v6,v2,v5 );
} // :cond_7
} // :goto_3
v5 = this.b;
if ( v5 != null) { // if-eqz v5, :cond_c
(( android.view.View ) v5 ).getLayoutParams ( ); // invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* iget v6, v5, Landroid/view/ViewGroup$LayoutParams;->width:I */
int v8 = -2; // const/4 v8, -0x2
/* if-eq v6, v8, :cond_8 */
/* const/high16 v6, 0x40000000 # 2.0f */
} // :cond_8
/* const/high16 v6, -0x80000000 */
} // :goto_4
/* iget v9, v5, Landroid/view/ViewGroup$LayoutParams;->width:I */
/* if-ltz v9, :cond_9 */
/* iget v9, v5, Landroid/view/ViewGroup$LayoutParams;->width:I */
v2 = java.lang.Math .min ( v9,v2 );
} // :cond_9
/* iget v9, v5, Landroid/view/ViewGroup$LayoutParams;->height:I */
/* if-eq v9, v8, :cond_a */
} // :cond_a
/* const/high16 v1, -0x80000000 */
} // :goto_5
/* iget v4, v5, Landroid/view/ViewGroup$LayoutParams;->height:I */
/* if-ltz v4, :cond_b */
/* iget v4, v5, Landroid/view/ViewGroup$LayoutParams;->height:I */
v3 = java.lang.Math .min ( v4,v3 );
} // :cond_b
v4 = this.b;
v2 = android.view.View$MeasureSpec .makeMeasureSpec ( v2,v6 );
v1 = android.view.View$MeasureSpec .makeMeasureSpec ( v3,v1 );
(( android.view.View ) v4 ).measure ( v2, v1 ); // invoke-virtual {v4, v2, v1}, Landroid/view/View;->measure(II)V
} // :cond_c
/* iget v1, p0, Landroid/support/v7/widget/ActionBarContextView;->a:I */
/* if-gtz v1, :cond_f */
p2 = (( android.support.v7.widget.ActionBarContextView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_6
/* if-ge v7, p2, :cond_e */
(( android.support.v7.widget.ActionBarContextView ) p0 ).getChildAt ( v7 ); // invoke-virtual {p0, v7}, Landroid/support/v7/widget/ActionBarContextView;->getChildAt(I)Landroid/view/View;
v2 = (( android.view.View ) v2 ).getMeasuredHeight ( ); // invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v2, v0 */
/* if-le v2, v1, :cond_d */
/* move v1, v2 */
} // :cond_d
/* add-int/lit8 v7, v7, 0x1 */
} // :cond_e
(( android.support.v7.widget.ActionBarContextView ) p0 ).setMeasuredDimension ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Landroid/support/v7/widget/ActionBarContextView;->setMeasuredDimension(II)V
return;
} // :cond_f
(( android.support.v7.widget.ActionBarContextView ) p0 ).setMeasuredDimension ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/support/v7/widget/ActionBarContextView;->setMeasuredDimension(II)V
return;
} // :cond_10
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = " can only be used with android:layout_height=\"wrap_content\""; // const-string v0, " can only be used with android:layout_height=\"wrap_content\""
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_11
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = " can only be used with android:layout_width=\"match_parent\" (or fill_parent)"; // const-string v0, " can only be used with android:layout_width=\"match_parent\" (or fill_parent)"
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) { //bridge//synthethic
/* .locals 0 */
p1 = /* invoke-super {p0, p1}, Lho;->onTouchEvent(Landroid/view/MotionEvent;)Z */
} // .end method
public void setContentHeight ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v7/widget/ActionBarContextView;->a:I */
return;
} // .end method
public void setCustomView ( android.view.View p0 ) {
/* .locals 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.support.v7.widget.ActionBarContextView ) p0 ).removeView ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActionBarContextView;->removeView(Landroid/view/View;)V
} // :cond_0
this.b = p1;
if ( p1 != null) { // if-eqz p1, :cond_1
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
(( android.support.v7.widget.ActionBarContextView ) p0 ).removeView ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActionBarContextView;->removeView(Landroid/view/View;)V
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
} // :cond_1
if ( p1 != null) { // if-eqz p1, :cond_2
(( android.support.v7.widget.ActionBarContextView ) p0 ).addView ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/ActionBarContextView;->addView(Landroid/view/View;)V
} // :cond_2
(( android.support.v7.widget.ActionBarContextView ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->requestLayout()V
return;
} // .end method
public void setSubtitle ( java.lang.CharSequence p0 ) {
/* .locals 0 */
this.b = p1;
/* invoke-direct {p0}, Landroid/support/v7/widget/ActionBarContextView;->c()V */
return;
} // .end method
public void setTitle ( java.lang.CharSequence p0 ) {
/* .locals 0 */
this.a = p1;
/* invoke-direct {p0}, Landroid/support/v7/widget/ActionBarContextView;->c()V */
return;
} // .end method
public void setTitleOptional ( Boolean p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Landroid/support/v7/widget/ActionBarContextView;->a:Z */
/* if-eq p1, v0, :cond_0 */
(( android.support.v7.widget.ActionBarContextView ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActionBarContextView;->requestLayout()V
} // :cond_0
/* iput-boolean p1, p0, Landroid/support/v7/widget/ActionBarContextView;->a:Z */
return;
} // .end method
public void setVisibility ( Integer p0 ) { //bridge//synthethic
/* .locals 0 */
/* invoke-super {p0, p1}, Lho;->setVisibility(I)V */
return;
} // .end method
public Boolean shouldDelayChildPressedState ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
