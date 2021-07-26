public abstract class ho extends android.view.ViewGroup {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lho$a; */
	 /* } */
} // .end annotation
/* # instance fields */
protected Integer a;
protected final android.content.Context a;
protected android.support.v7.widget.ActionMenuView a;
protected ep a;
protected final ho$a a;
protected hq a;
private Boolean a;
private Boolean b;
/* # direct methods */
 ho ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, p1, p2, v0}, Lho;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 return;
} // .end method
protected ho ( ) {
	 /* .locals 2 */
	 /* invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 /* new-instance p2, Lho$a; */
	 /* invoke-direct {p2, p0}, Lho$a;-><init>(Lho;)V */
	 this.a = p2;
	 /* new-instance p2, Landroid/util/TypedValue; */
	 /* invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V */
	 (( android.content.Context ) p1 ).getTheme ( ); // invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
	 int v1 = 1; // const/4 v1, 0x1
	 p3 = 	 (( android.content.res.Resources$Theme ) p3 ).resolveAttribute ( v0, p2, v1 ); // invoke-virtual {p3, v0, p2, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
	 if ( p3 != null) { // if-eqz p3, :cond_0
		 /* iget p3, p2, Landroid/util/TypedValue;->resourceId:I */
		 if ( p3 != null) { // if-eqz p3, :cond_0
			 /* new-instance p3, Landroid/view/ContextThemeWrapper; */
			 /* iget p2, p2, Landroid/util/TypedValue;->resourceId:I */
			 /* invoke-direct {p3, p1, p2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V */
			 this.a = p3;
			 return;
		 } // :cond_0
		 this.a = p1;
		 return;
	 } // .end method
	 protected static Integer a ( Integer p0, Integer p1, Boolean p2 ) {
		 /* .locals 0 */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* sub-int/2addr p0, p1 */
		 } // :cond_0
		 /* add-int/2addr p0, p1 */
	 } // .end method
	 protected static Integer a ( android.view.View p0, Integer p1, Integer p2 ) {
		 /* .locals 1 */
		 /* const/high16 v0, -0x80000000 */
		 v0 = 		 android.view.View$MeasureSpec .makeMeasureSpec ( p1,v0 );
		 (( android.view.View ) p0 ).measure ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Landroid/view/View;->measure(II)V
		 p0 = 		 (( android.view.View ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I
		 /* sub-int/2addr p1, p0 */
		 int p0 = 0; // const/4 p0, 0x0
		 /* sub-int/2addr p1, p0 */
		 p0 = 		 java.lang.Math .max ( p0,p1 );
	 } // .end method
	 protected static Integer a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Boolean p4 ) {
		 /* .locals 2 */
		 v0 = 		 (( android.view.View ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I
		 v1 = 		 (( android.view.View ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I
		 /* sub-int/2addr p3, v1 */
		 /* div-int/lit8 p3, p3, 0x2 */
		 /* add-int/2addr p2, p3 */
		 if ( p4 != null) { // if-eqz p4, :cond_0
			 /* sub-int p3, p1, v0 */
			 /* add-int/2addr v1, p2 */
			 (( android.view.View ) p0 ).layout ( p3, p2, p1, v1 ); // invoke-virtual {p0, p3, p2, p1, v1}, Landroid/view/View;->layout(IIII)V
		 } // :cond_0
		 /* add-int p3, p1, v0 */
		 /* add-int/2addr v1, p2 */
		 (( android.view.View ) p0 ).layout ( p1, p2, p3, v1 ); // invoke-virtual {p0, p1, p2, p3, v1}, Landroid/view/View;->layout(IIII)V
	 } // :goto_0
	 if ( p4 != null) { // if-eqz p4, :cond_1
		 /* neg-int p0, v0 */
	 } // :cond_1
} // .end method
static void a ( ho p0 ) { //synthethic
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-super {p0, v0}, Landroid/view/ViewGroup;->setVisibility(I)V */
	 return;
} // .end method
static void a ( ho p0, Integer p1 ) { //synthethic
	 /* .locals 0 */
	 /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V */
	 return;
} // .end method
/* # virtual methods */
public ep a ( Integer p0, Long p1 ) {
	 /* .locals 2 */
	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 (( ep ) v0 ).a ( ); // invoke-virtual {v0}, Lep;->a()V
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
	 /* if-nez p1, :cond_2 */
	 v1 = 	 (( ho ) p0 ).getVisibility ( ); // invoke-virtual {p0}, Lho;->getVisibility()I
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 (( ho ) p0 ).setAlpha ( v0 ); // invoke-virtual {p0, v0}, Lho;->setAlpha(F)V
	 } // :cond_1
	 em .a ( p0 );
	 /* const/high16 v1, 0x3f800000 # 1.0f */
	 (( ep ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lep;->a(F)Lep;
} // :goto_0
(( ep ) v0 ).a ( p2, p3 ); // invoke-virtual {v0, p2, p3}, Lep;->a(J)Lep;
p2 = this.a;
(( ho$a ) p2 ).a ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Lho$a;->a(Lep;I)Lho$a;
(( ep ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lep;->a(Leq;)Lep;
} // :cond_2
em .a ( p0 );
(( ep ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lep;->a(F)Lep;
} // .end method
public Boolean a ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( hq ) v0 ).b ( ); // invoke-virtual {v0}, Lhq;->b()Z
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer getAnimatedVisibility ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
/* iget v0, v0, Lho$a;->a:I */
} // :cond_0
v0 = (( ho ) p0 ).getVisibility ( ); // invoke-virtual {p0}, Lho;->getVisibility()I
} // .end method
public Integer getContentHeight ( ) {
/* .locals 1 */
/* iget v0, p0, Lho;->a:I */
} // .end method
protected void onConfigurationChanged ( android.content.res.Configuration p0 ) {
/* .locals 4 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V */
(( ho ) p0 ).getContext ( ); // invoke-virtual {p0}, Lho;->getContext()Landroid/content/Context;
v0 = gc$j.ActionBar;
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
(( android.content.Context ) p1 ).obtainStyledAttributes ( v3, v0, v1, v2 ); // invoke-virtual {p1, v3, v0, v1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
v0 = (( android.content.res.TypedArray ) p1 ).getLayoutDimension ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I
(( ho ) p0 ).setContentHeight ( v0 ); // invoke-virtual {p0, v0}, Lho;->setContentHeight(I)V
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_0
(( hq ) p1 ).a ( ); // invoke-virtual {p1}, Lhq;->a()V
} // :cond_0
return;
} // .end method
public Boolean onHoverEvent ( android.view.MotionEvent p0 ) {
/* .locals 5 */
v0 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
int v1 = 0; // const/4 v1, 0x0
/* const/16 v2, 0x9 */
/* if-ne v0, v2, :cond_0 */
/* iput-boolean v1, p0, Lho;->b:Z */
} // :cond_0
/* iget-boolean v3, p0, Lho;->b:Z */
int v4 = 1; // const/4 v4, 0x1
/* if-nez v3, :cond_1 */
p1 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onHoverEvent(Landroid/view/MotionEvent;)Z */
/* if-ne v0, v2, :cond_1 */
/* if-nez p1, :cond_1 */
/* iput-boolean v4, p0, Lho;->b:Z */
} // :cond_1
/* const/16 p1, 0xa */
/* if-eq v0, p1, :cond_2 */
int p1 = 3; // const/4 p1, 0x3
/* if-ne v0, p1, :cond_3 */
} // :cond_2
/* iput-boolean v1, p0, Lho;->b:Z */
} // :cond_3
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 4 */
v0 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* iput-boolean v1, p0, Lho;->a:Z */
} // :cond_0
/* iget-boolean v2, p0, Lho;->a:Z */
int v3 = 1; // const/4 v3, 0x1
/* if-nez v2, :cond_1 */
p1 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z */
/* if-nez v0, :cond_1 */
/* if-nez p1, :cond_1 */
/* iput-boolean v3, p0, Lho;->a:Z */
} // :cond_1
/* if-eq v0, v3, :cond_2 */
int p1 = 3; // const/4 p1, 0x3
/* if-ne v0, p1, :cond_3 */
} // :cond_2
/* iput-boolean v1, p0, Lho;->a:Z */
} // :cond_3
} // .end method
public void setContentHeight ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Lho;->a:I */
(( ho ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Lho;->requestLayout()V
return;
} // .end method
public void setVisibility ( Integer p0 ) {
/* .locals 1 */
v0 = (( ho ) p0 ).getVisibility ( ); // invoke-virtual {p0}, Lho;->getVisibility()I
/* if-eq p1, v0, :cond_1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( ep ) v0 ).a ( ); // invoke-virtual {v0}, Lep;->a()V
} // :cond_0
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V */
} // :cond_1
return;
} // .end method
