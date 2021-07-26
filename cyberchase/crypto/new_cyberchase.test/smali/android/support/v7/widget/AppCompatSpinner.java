public class android.support.v7.widget.AppCompatSpinner extends android.widget.Spinner implements el {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/v7/widget/AppCompatSpinner$b;, */
	 /* Landroid/support/v7/widget/AppCompatSpinner$a; */
	 /* } */
} // .end annotation
/* # static fields */
private static final a;
/* # instance fields */
Integer a;
private final android.content.Context a;
final android.graphics.Rect a;
android.support.v7.widget.AppCompatSpinner$b a;
private android.widget.SpinnerAdapter a;
private final hs a;
private ig a;
private final Boolean a;
/* # direct methods */
static android.support.v7.widget.AppCompatSpinner ( ) {
	 /* .locals 3 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* new-array v0, v0, [I */
	 int v1 = 0; // const/4 v1, 0x0
	 /* const v2, 0x10102f1 */
	 /* aput v2, v0, v1 */
	 return;
} // .end method
public android.support.v7.widget.AppCompatSpinner ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/AppCompatSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 return;
} // .end method
public android.support.v7.widget.AppCompatSpinner ( ) {
	 /* .locals 1 */
	 /* invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/AppCompatSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 return;
} // .end method
public android.support.v7.widget.AppCompatSpinner ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, p1, p2, p3, v0}, Landroid/support/v7/widget/AppCompatSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IB)V */
	 return;
} // .end method
private android.support.v7.widget.AppCompatSpinner ( ) {
	 /* .locals 0 */
	 int p4 = -1; // const/4 p4, -0x1
	 /* invoke-direct {p0, p1, p2, p3, p4}, Landroid/support/v7/widget/AppCompatSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
	 return;
} // .end method
private android.support.v7.widget.AppCompatSpinner ( ) {
	 /* .locals 8 */
	 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/Spinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 /* new-instance v0, Landroid/graphics/Rect; */
	 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
	 this.a = v0;
	 v0 = gc$j.Spinner;
	 int v1 = 0; // const/4 v1, 0x0
	 ip .a ( p1,p2,v0,p3,v1 );
	 /* new-instance v2, Lhs; */
	 /* invoke-direct {v2, p0}, Lhs;-><init>(Landroid/view/View;)V */
	 this.a = v2;
	 v2 = 	 (( ip ) v0 ).g ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Lip;->g(II)I
	 int v3 = 0; // const/4 v3, 0x0
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 /* new-instance v4, Lgm; */
		 /* invoke-direct {v4, p1, v2}, Lgm;-><init>(Landroid/content/Context;I)V */
	 } // :cond_0
	 /* const/16 v4, 0x17 */
	 /* if-ge v2, v4, :cond_1 */
	 /* move-object v4, p1 */
} // :cond_1
/* move-object v4, v3 */
} // :goto_0
this.a = v4;
v2 = this.a;
int v4 = 1; // const/4 v4, 0x1
if ( v2 != null) { // if-eqz v2, :cond_5
try { // :try_start_0
	 v2 = android.support.v7.widget.AppCompatSpinner.a;
	 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v2, p3, v1 ); // invoke-virtual {p1, p2, v2, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 try { // :try_start_1
		 v5 = 		 (( android.content.res.TypedArray ) v2 ).hasValue ( v1 ); // invoke-virtual {v2, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z
		 if ( v5 != null) { // if-eqz v5, :cond_2
			 p4 = 			 (( android.content.res.TypedArray ) v2 ).getInt ( v1, v1 ); // invoke-virtual {v2, v1, v1}, Landroid/content/res/TypedArray;->getInt(II)I
			 /* :try_end_1 */
			 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
		 } // :cond_2
		 if ( v2 != null) { // if-eqz v2, :cond_3
		 } // :goto_1
		 (( android.content.res.TypedArray ) v2 ).recycle ( ); // invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V
		 /* :catch_0 */
		 /* move-exception v5 */
		 /* :catchall_0 */
		 /* move-exception p1 */
		 /* move-object v2, v3 */
		 /* :catch_1 */
		 /* move-exception v5 */
		 /* move-object v2, v3 */
	 } // :goto_2
	 try { // :try_start_2
		 final String v6 = "AppCompatSpinner"; // const-string v6, "AppCompatSpinner"
		 final String v7 = "Could not read android:spinnerMode"; // const-string v7, "Could not read android:spinnerMode"
		 android.util.Log .i ( v6,v7,v5 );
		 /* :try_end_2 */
		 /* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
		 if ( v2 != null) { // if-eqz v2, :cond_3
		 } // :cond_3
	 } // :goto_3
	 /* if-ne p4, v4, :cond_5 */
	 /* new-instance p4, Landroid/support/v7/widget/AppCompatSpinner$b; */
	 v2 = this.a;
	 /* invoke-direct {p4, p0, v2, p2, p3}, Landroid/support/v7/widget/AppCompatSpinner$b;-><init>(Landroid/support/v7/widget/AppCompatSpinner;Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 v2 = this.a;
	 v5 = gc$j.Spinner;
	 ip .a ( v2,p2,v5,p3,v1 );
	 int v5 = -2; // const/4 v5, -0x2
	 v2 = 	 (( ip ) v1 ).f ( v2, v5 ); // invoke-virtual {v1, v2, v5}, Lip;->f(II)I
	 /* iput v2, p0, Landroid/support/v7/widget/AppCompatSpinner;->a:I */
	 (( ip ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lip;->a(I)Landroid/graphics/drawable/Drawable;
	 (( android.support.v7.widget.AppCompatSpinner$b ) p4 ).a ( v2 ); // invoke-virtual {p4, v2}, Landroid/support/v7/widget/AppCompatSpinner$b;->a(Landroid/graphics/drawable/Drawable;)V
	 (( ip ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lip;->a(I)Ljava/lang/String;
	 this.a = v2;
	 v1 = this.a;
	 (( android.content.res.TypedArray ) v1 ).recycle ( ); // invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V
	 this.a = p4;
	 /* new-instance v1, Landroid/support/v7/widget/AppCompatSpinner$1; */
	 /* invoke-direct {v1, p0, p0, p4}, Landroid/support/v7/widget/AppCompatSpinner$1;-><init>(Landroid/support/v7/widget/AppCompatSpinner;Landroid/view/View;Landroid/support/v7/widget/AppCompatSpinner$b;)V */
	 this.a = v1;
	 /* :catchall_1 */
	 /* move-exception p1 */
} // :goto_4
if ( v2 != null) { // if-eqz v2, :cond_4
	 (( android.content.res.TypedArray ) v2 ).recycle ( ); // invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V
} // :cond_4
/* throw p1 */
} // :cond_5
} // :goto_5
v1 = this.a;
(( android.content.res.TypedArray ) v1 ).getTextArray ( p4 ); // invoke-virtual {v1, p4}, Landroid/content/res/TypedArray;->getTextArray(I)[Ljava/lang/CharSequence;
if ( p4 != null) { // if-eqz p4, :cond_6
/* new-instance v1, Landroid/widget/ArrayAdapter; */
/* const v2, 0x1090008 */
/* invoke-direct {v1, p1, v2, p4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V */
(( android.widget.ArrayAdapter ) v1 ).setDropDownViewResource ( p1 ); // invoke-virtual {v1, p1}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V
(( android.support.v7.widget.AppCompatSpinner ) p0 ).setAdapter ( v1 ); // invoke-virtual {p0, v1}, Landroid/support/v7/widget/AppCompatSpinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V
} // :cond_6
p1 = this.a;
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
/* iput-boolean v4, p0, Landroid/support/v7/widget/AppCompatSpinner;->a:Z */
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_7
(( android.support.v7.widget.AppCompatSpinner ) p0 ).setAdapter ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/AppCompatSpinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V
this.a = v3;
} // :cond_7
p1 = this.a;
(( hs ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lhs;->a(Landroid/util/AttributeSet;I)V
return;
} // .end method
/* # virtual methods */
final Integer a ( android.widget.SpinnerAdapter p0, android.graphics.drawable.Drawable p1 ) {
/* .locals 10 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
} // :cond_0
v1 = (( android.support.v7.widget.AppCompatSpinner ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AppCompatSpinner;->getMeasuredWidth()I
v1 = android.view.View$MeasureSpec .makeMeasureSpec ( v1,v0 );
v2 = (( android.support.v7.widget.AppCompatSpinner ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AppCompatSpinner;->getMeasuredHeight()I
v2 = android.view.View$MeasureSpec .makeMeasureSpec ( v2,v0 );
v3 = (( android.support.v7.widget.AppCompatSpinner ) p0 ).getSelectedItemPosition ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AppCompatSpinner;->getSelectedItemPosition()I
v4 = v3 = java.lang.Math .max ( v0,v3 );
/* add-int/lit8 v5, v3, 0xf */
v4 = java.lang.Math .min ( v4,v5 );
/* sub-int v5, v4, v3 */
/* rsub-int/lit8 v5, v5, 0xf */
/* sub-int/2addr v3, v5 */
v3 = java.lang.Math .max ( v0,v3 );
int v5 = 0; // const/4 v5, 0x0
/* move-object v7, v5 */
int v6 = 0; // const/4 v6, 0x0
} // :goto_0
v8 = /* if-ge v3, v4, :cond_3 */
/* if-eq v8, v0, :cond_1 */
/* move-object v7, v5 */
/* move v0, v8 */
} // :cond_1
(( android.view.View ) v7 ).getLayoutParams ( ); // invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* if-nez v8, :cond_2 */
/* new-instance v8, Landroid/view/ViewGroup$LayoutParams; */
int v9 = -2; // const/4 v9, -0x2
/* invoke-direct {v8, v9, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
(( android.view.View ) v7 ).setLayoutParams ( v8 ); // invoke-virtual {v7, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
} // :cond_2
(( android.view.View ) v7 ).measure ( v1, v2 ); // invoke-virtual {v7, v1, v2}, Landroid/view/View;->measure(II)V
v8 = (( android.view.View ) v7 ).getMeasuredWidth ( ); // invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I
v6 = java.lang.Math .max ( v6,v8 );
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_3
if ( p2 != null) { // if-eqz p2, :cond_4
p1 = this.a;
(( android.graphics.drawable.Drawable ) p2 ).getPadding ( p1 ); // invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
p1 = this.a;
/* iget p1, p1, Landroid/graphics/Rect;->left:I */
p2 = this.a;
/* iget p2, p2, Landroid/graphics/Rect;->right:I */
/* add-int/2addr p1, p2 */
/* add-int/2addr v6, p1 */
} // :cond_4
} // .end method
protected void drawableStateChanged ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/widget/Spinner;->drawableStateChanged()V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( hs ) v0 ).b ( ); // invoke-virtual {v0}, Lhs;->b()V
} // :cond_0
return;
} // .end method
public Integer getDropDownHorizontalOffset ( ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, v0, Landroid/support/v7/widget/ListPopupWindow;->b:I */
} // :cond_0
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_1 */
v0 = /* invoke-super {p0}, Landroid/widget/Spinner;->getDropDownHorizontalOffset()I */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer getDropDownVerticalOffset ( ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( android.support.v7.widget.AppCompatSpinner$b ) v0 ).a ( ); // invoke-virtual {v0}, Landroid/support/v7/widget/AppCompatSpinner$b;->a()I
} // :cond_0
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_1 */
v0 = /* invoke-super {p0}, Landroid/widget/Spinner;->getDropDownVerticalOffset()I */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer getDropDownWidth ( ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Landroid/support/v7/widget/AppCompatSpinner;->a:I */
} // :cond_0
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_1 */
v0 = /* invoke-super {p0}, Landroid/widget/Spinner;->getDropDownWidth()I */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public android.graphics.drawable.Drawable getPopupBackground ( ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( android.widget.PopupWindow ) v0 ).getBackground ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;
} // :cond_0
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_1 */
/* invoke-super {p0}, Landroid/widget/Spinner;->getPopupBackground()Landroid/graphics/drawable/Drawable; */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public android.content.Context getPopupContext ( ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
} // :cond_0
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_1 */
/* invoke-super {p0}, Landroid/widget/Spinner;->getPopupContext()Landroid/content/Context; */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.CharSequence getPrompt ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
} // :cond_0
/* invoke-super {p0}, Landroid/widget/Spinner;->getPrompt()Ljava/lang/CharSequence; */
} // .end method
public android.content.res.ColorStateList getSupportBackgroundTintList ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( hs ) v0 ).a ( ); // invoke-virtual {v0}, Lhs;->a()Landroid/content/res/ColorStateList;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public android.graphics.PorterDuff$Mode getSupportBackgroundTintMode ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( hs ) v0 ).a ( ); // invoke-virtual {v0}, Lhs;->a()Landroid/graphics/PorterDuff$Mode;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
protected void onDetachedFromWindow ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/widget/Spinner;->onDetachedFromWindow()V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
v0 = (( android.widget.PopupWindow ) v0 ).isShowing ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( android.support.v7.widget.AppCompatSpinner$b ) v0 ).b ( ); // invoke-virtual {v0}, Landroid/support/v7/widget/AppCompatSpinner$b;->b()V
} // :cond_0
return;
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* invoke-super {p0, p1, p2}, Landroid/widget/Spinner;->onMeasure(II)V */
p2 = this.a;
if ( p2 != null) { // if-eqz p2, :cond_0
p2 = android.view.View$MeasureSpec .getMode ( p1 );
/* const/high16 v0, -0x80000000 */
/* if-ne p2, v0, :cond_0 */
p2 = (( android.support.v7.widget.AppCompatSpinner ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AppCompatSpinner;->getMeasuredWidth()I
(( android.support.v7.widget.AppCompatSpinner ) p0 ).getAdapter ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AppCompatSpinner;->getAdapter()Landroid/widget/SpinnerAdapter;
(( android.support.v7.widget.AppCompatSpinner ) p0 ).getBackground ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AppCompatSpinner;->getBackground()Landroid/graphics/drawable/Drawable;
v0 = (( android.support.v7.widget.AppCompatSpinner ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/support/v7/widget/AppCompatSpinner;->a(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I
p2 = java.lang.Math .max ( p2,v0 );
p1 = android.view.View$MeasureSpec .getSize ( p1 );
p1 = java.lang.Math .min ( p2,p1 );
p2 = (( android.support.v7.widget.AppCompatSpinner ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AppCompatSpinner;->getMeasuredHeight()I
(( android.support.v7.widget.AppCompatSpinner ) p0 ).setMeasuredDimension ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/support/v7/widget/AppCompatSpinner;->setMeasuredDimension(II)V
} // :cond_0
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( ig ) v0 ).onTouch ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lig;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
p1 = /* invoke-super {p0, p1}, Landroid/widget/Spinner;->onTouchEvent(Landroid/view/MotionEvent;)Z */
} // .end method
public Boolean performClick ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
v0 = (( android.widget.PopupWindow ) v0 ).isShowing ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z
/* if-nez v0, :cond_0 */
v0 = this.a;
(( android.support.v7.widget.AppCompatSpinner$b ) v0 ).a ( ); // invoke-virtual {v0}, Landroid/support/v7/widget/AppCompatSpinner$b;->a()V
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
v0 = /* invoke-super {p0}, Landroid/widget/Spinner;->performClick()Z */
} // .end method
public void setAdapter ( android.widget.Adapter p0 ) { //bridge//synthethic
/* .locals 0 */
/* check-cast p1, Landroid/widget/SpinnerAdapter; */
(( android.support.v7.widget.AppCompatSpinner ) p0 ).setAdapter ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/AppCompatSpinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V
return;
} // .end method
public void setAdapter ( android.widget.SpinnerAdapter p0 ) {
/* .locals 3 */
/* iget-boolean v0, p0, Landroid/support/v7/widget/AppCompatSpinner;->a:Z */
/* if-nez v0, :cond_0 */
this.a = p1;
return;
} // :cond_0
/* invoke-super {p0, p1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.a;
/* if-nez v0, :cond_1 */
(( android.support.v7.widget.AppCompatSpinner ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AppCompatSpinner;->getContext()Landroid/content/Context;
} // :cond_1
v1 = this.a;
/* new-instance v2, Landroid/support/v7/widget/AppCompatSpinner$a; */
(( android.content.Context ) v0 ).getTheme ( ); // invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
/* invoke-direct {v2, p1, v0}, Landroid/support/v7/widget/AppCompatSpinner$a;-><init>(Landroid/widget/SpinnerAdapter;Landroid/content/res/Resources$Theme;)V */
(( android.support.v7.widget.AppCompatSpinner$b ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Landroid/support/v7/widget/AppCompatSpinner$b;->a(Landroid/widget/ListAdapter;)V
} // :cond_2
return;
} // .end method
public void setBackgroundDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1}, Landroid/widget/Spinner;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V */
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_0
(( hs ) p1 ).a ( ); // invoke-virtual {p1}, Lhs;->a()V
} // :cond_0
return;
} // .end method
public void setBackgroundResource ( Integer p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Landroid/widget/Spinner;->setBackgroundResource(I)V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( hs ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lhs;->a(I)V
} // :cond_0
return;
} // .end method
public void setDropDownHorizontalOffset ( Integer p0 ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iput p1, v0, Landroid/support/v7/widget/ListPopupWindow;->b:I */
return;
} // :cond_0
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_1 */
/* invoke-super {p0, p1}, Landroid/widget/Spinner;->setDropDownHorizontalOffset(I)V */
} // :cond_1
return;
} // .end method
public void setDropDownVerticalOffset ( Integer p0 ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.support.v7.widget.AppCompatSpinner$b ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Landroid/support/v7/widget/AppCompatSpinner$b;->a(I)V
return;
} // :cond_0
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_1 */
/* invoke-super {p0, p1}, Landroid/widget/Spinner;->setDropDownVerticalOffset(I)V */
} // :cond_1
return;
} // .end method
public void setDropDownWidth ( Integer p0 ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iput p1, p0, Landroid/support/v7/widget/AppCompatSpinner;->a:I */
return;
} // :cond_0
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_1 */
/* invoke-super {p0, p1}, Landroid/widget/Spinner;->setDropDownWidth(I)V */
} // :cond_1
return;
} // .end method
public void setPopupBackgroundDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.support.v7.widget.AppCompatSpinner$b ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Landroid/support/v7/widget/AppCompatSpinner$b;->a(Landroid/graphics/drawable/Drawable;)V
return;
} // :cond_0
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_1 */
/* invoke-super {p0, p1}, Landroid/widget/Spinner;->setPopupBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V */
} // :cond_1
return;
} // .end method
public void setPopupBackgroundResource ( Integer p0 ) {
/* .locals 1 */
(( android.support.v7.widget.AppCompatSpinner ) p0 ).getPopupContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AppCompatSpinner;->getPopupContext()Landroid/content/Context;
gd .a ( v0,p1 );
(( android.support.v7.widget.AppCompatSpinner ) p0 ).setPopupBackgroundDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/AppCompatSpinner;->setPopupBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setPrompt ( java.lang.CharSequence p0 ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
this.a = p1;
return;
} // :cond_0
/* invoke-super {p0, p1}, Landroid/widget/Spinner;->setPrompt(Ljava/lang/CharSequence;)V */
return;
} // .end method
public void setSupportBackgroundTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( hs ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lhs;->a(Landroid/content/res/ColorStateList;)V
} // :cond_0
return;
} // .end method
public void setSupportBackgroundTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( hs ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lhs;->a(Landroid/graphics/PorterDuff$Mode;)V
} // :cond_0
return;
} // .end method
