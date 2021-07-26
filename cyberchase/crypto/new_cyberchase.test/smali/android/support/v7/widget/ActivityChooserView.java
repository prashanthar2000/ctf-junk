public class android.support.v7.widget.ActivityChooserView extends android.view.ViewGroup {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/v7/widget/ActivityChooserView$InnerLayout;, */
	 /* Landroid/support/v7/widget/ActivityChooserView$a;, */
	 /* Landroid/support/v7/widget/ActivityChooserView$b; */
	 /* } */
} // .end annotation
/* # instance fields */
Integer a;
final android.database.DataSetObserver a;
final android.graphics.drawable.Drawable a;
final android.support.v7.widget.ActivityChooserView$a a;
private final android.support.v7.widget.ActivityChooserView$b a;
private android.support.v7.widget.ListPopupWindow a;
final android.view.View a;
private final android.view.ViewTreeObserver$OnGlobalLayoutListener a;
final android.widget.FrameLayout a;
final android.widget.ImageView a;
android.widget.PopupWindow$OnDismissListener a;
dy a;
Boolean a;
Integer b;
final android.widget.FrameLayout b;
private final android.widget.ImageView b;
private Boolean b;
private final Integer c;
/* # direct methods */
public android.support.v7.widget.ActivityChooserView ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/ActivityChooserView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 return;
} // .end method
public android.support.v7.widget.ActivityChooserView ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/ActivityChooserView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 return;
} // .end method
public android.support.v7.widget.ActivityChooserView ( ) {
	 /* .locals 3 */
	 /* invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 /* new-instance v0, Landroid/support/v7/widget/ActivityChooserView$1; */
	 /* invoke-direct {v0, p0}, Landroid/support/v7/widget/ActivityChooserView$1;-><init>(Landroid/support/v7/widget/ActivityChooserView;)V */
	 this.a = v0;
	 /* new-instance v0, Landroid/support/v7/widget/ActivityChooserView$2; */
	 /* invoke-direct {v0, p0}, Landroid/support/v7/widget/ActivityChooserView$2;-><init>(Landroid/support/v7/widget/ActivityChooserView;)V */
	 this.a = v0;
	 int v0 = 4; // const/4 v0, 0x4
	 /* iput v0, p0, Landroid/support/v7/widget/ActivityChooserView;->a:I */
	 v1 = gc$j.ActivityChooserView;
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v1, p3, v2 ); // invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
	 p3 = 	 (( android.content.res.TypedArray ) p2 ).getInt ( p3, v0 ); // invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getInt(II)I
	 /* iput p3, p0, Landroid/support/v7/widget/ActivityChooserView;->a:I */
	 (( android.content.res.TypedArray ) p2 ).getDrawable ( p3 ); // invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
	 (( android.content.res.TypedArray ) p2 ).recycle ( ); // invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V
	 (( android.support.v7.widget.ActivityChooserView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->getContext()Landroid/content/Context;
	 android.view.LayoutInflater .from ( p2 );
	 int v1 = 1; // const/4 v1, 0x1
	 (( android.view.LayoutInflater ) p2 ).inflate ( v0, p0, v1 ); // invoke-virtual {p2, v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
	 /* new-instance p2, Landroid/support/v7/widget/ActivityChooserView$b; */
	 /* invoke-direct {p2, p0}, Landroid/support/v7/widget/ActivityChooserView$b;-><init>(Landroid/support/v7/widget/ActivityChooserView;)V */
	 this.a = p2;
	 (( android.support.v7.widget.ActivityChooserView ) p0 ).findViewById ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/widget/ActivityChooserView;->findViewById(I)Landroid/view/View;
	 this.a = p2;
	 p2 = this.a;
	 (( android.view.View ) p2 ).getBackground ( ); // invoke-virtual {p2}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
	 this.a = p2;
	 (( android.support.v7.widget.ActivityChooserView ) p0 ).findViewById ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/widget/ActivityChooserView;->findViewById(I)Landroid/view/View;
	 /* check-cast p2, Landroid/widget/FrameLayout; */
	 this.b = p2;
	 p2 = this.b;
	 v0 = this.a;
	 (( android.widget.FrameLayout ) p2 ).setOnClickListener ( v0 ); // invoke-virtual {p2, v0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
	 p2 = this.b;
	 v0 = this.a;
	 (( android.widget.FrameLayout ) p2 ).setOnLongClickListener ( v0 ); // invoke-virtual {p2, v0}, Landroid/widget/FrameLayout;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
	 p2 = this.b;
	 (( android.widget.FrameLayout ) p2 ).findViewById ( v0 ); // invoke-virtual {p2, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;
	 /* check-cast p2, Landroid/widget/ImageView; */
	 this.a = p2;
	 (( android.support.v7.widget.ActivityChooserView ) p0 ).findViewById ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/widget/ActivityChooserView;->findViewById(I)Landroid/view/View;
	 /* check-cast p2, Landroid/widget/FrameLayout; */
	 v0 = this.a;
	 (( android.widget.FrameLayout ) p2 ).setOnClickListener ( v0 ); // invoke-virtual {p2, v0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
	 /* new-instance v0, Landroid/support/v7/widget/ActivityChooserView$3; */
	 /* invoke-direct {v0, p0}, Landroid/support/v7/widget/ActivityChooserView$3;-><init>(Landroid/support/v7/widget/ActivityChooserView;)V */
	 (( android.widget.FrameLayout ) p2 ).setAccessibilityDelegate ( v0 ); // invoke-virtual {p2, v0}, Landroid/widget/FrameLayout;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V
	 /* new-instance v0, Landroid/support/v7/widget/ActivityChooserView$4; */
	 /* invoke-direct {v0, p0, p2}, Landroid/support/v7/widget/ActivityChooserView$4;-><init>(Landroid/support/v7/widget/ActivityChooserView;Landroid/view/View;)V */
	 (( android.widget.FrameLayout ) p2 ).setOnTouchListener ( v0 ); // invoke-virtual {p2, v0}, Landroid/widget/FrameLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
	 this.a = p2;
	 (( android.widget.FrameLayout ) p2 ).findViewById ( v0 ); // invoke-virtual {p2, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;
	 /* check-cast p2, Landroid/widget/ImageView; */
	 this.b = p2;
	 p2 = this.b;
	 (( android.widget.ImageView ) p2 ).setImageDrawable ( p3 ); // invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
	 /* new-instance p2, Landroid/support/v7/widget/ActivityChooserView$a; */
	 /* invoke-direct {p2, p0}, Landroid/support/v7/widget/ActivityChooserView$a;-><init>(Landroid/support/v7/widget/ActivityChooserView;)V */
	 this.a = p2;
	 p2 = this.a;
	 /* new-instance p3, Landroid/support/v7/widget/ActivityChooserView$5; */
	 /* invoke-direct {p3, p0}, Landroid/support/v7/widget/ActivityChooserView$5;-><init>(Landroid/support/v7/widget/ActivityChooserView;)V */
	 (( android.support.v7.widget.ActivityChooserView$a ) p2 ).registerDataSetObserver ( p3 ); // invoke-virtual {p2, p3}, Landroid/support/v7/widget/ActivityChooserView$a;->registerDataSetObserver(Landroid/database/DataSetObserver;)V
	 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) p1 ).getDisplayMetrics ( ); // invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
	 /* iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I */
	 /* div-int/lit8 p2, p2, 0x2 */
	 p1 = 	 (( android.content.res.Resources ) p1 ).getDimensionPixelSize ( p3 ); // invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
	 p1 = 	 java.lang.Math .max ( p2,p1 );
	 /* iput p1, p0, Landroid/support/v7/widget/ActivityChooserView;->c:I */
	 return;
} // .end method
/* # virtual methods */
final void a ( Integer p0 ) {
	 /* .locals 5 */
	 v0 = this.a;
	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_6
		 (( android.support.v7.widget.ActivityChooserView ) p0 ).getViewTreeObserver ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
		 v1 = this.a;
		 (( android.view.ViewTreeObserver ) v0 ).addOnGlobalLayoutListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
		 v0 = this.b;
		 v0 = 		 (( android.widget.FrameLayout ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/widget/FrameLayout;->getVisibility()I
		 int v1 = 1; // const/4 v1, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* if-nez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v3 = this.a;
v3 = this.a;
v3 = (( hr ) v3 ).a ( ); // invoke-virtual {v3}, Lhr;->a()I
/* const v4, 0x7fffffff */
/* if-eq p1, v4, :cond_1 */
/* add-int v4, p1, v0 */
/* if-le v3, v4, :cond_1 */
v3 = this.a;
(( android.support.v7.widget.ActivityChooserView$a ) v3 ).a ( v1 ); // invoke-virtual {v3, v1}, Landroid/support/v7/widget/ActivityChooserView$a;->a(Z)V
v3 = this.a;
/* sub-int/2addr p1, v1 */
} // :cond_1
v3 = this.a;
(( android.support.v7.widget.ActivityChooserView$a ) v3 ).a ( v2 ); // invoke-virtual {v3, v2}, Landroid/support/v7/widget/ActivityChooserView$a;->a(Z)V
v3 = this.a;
} // :goto_1
(( android.support.v7.widget.ActivityChooserView$a ) v3 ).a ( p1 ); // invoke-virtual {v3, p1}, Landroid/support/v7/widget/ActivityChooserView$a;->a(I)V
(( android.support.v7.widget.ActivityChooserView ) p0 ).getListPopupWindow ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->getListPopupWindow()Landroid/support/v7/widget/ListPopupWindow;
v3 = this.a;
v3 = (( android.widget.PopupWindow ) v3 ).isShowing ( ); // invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z
/* if-nez v3, :cond_5 */
/* iget-boolean v3, p0, Landroid/support/v7/widget/ActivityChooserView;->a:Z */
/* if-nez v3, :cond_3 */
/* if-nez v0, :cond_2 */
} // :cond_2
v0 = this.a;
(( android.support.v7.widget.ActivityChooserView$a ) v0 ).a ( v2, v2 ); // invoke-virtual {v0, v2, v2}, Landroid/support/v7/widget/ActivityChooserView$a;->a(ZZ)V
} // :cond_3
} // :goto_2
v3 = this.a;
(( android.support.v7.widget.ActivityChooserView$a ) v3 ).a ( v1, v0 ); // invoke-virtual {v3, v1, v0}, Landroid/support/v7/widget/ActivityChooserView$a;->a(ZZ)V
} // :goto_3
v0 = this.a;
v0 = (( android.support.v7.widget.ActivityChooserView$a ) v0 ).a ( ); // invoke-virtual {v0}, Landroid/support/v7/widget/ActivityChooserView$a;->a()I
/* iget v3, p0, Landroid/support/v7/widget/ActivityChooserView;->c:I */
v0 = java.lang.Math .min ( v0,v3 );
(( android.support.v7.widget.ListPopupWindow ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Landroid/support/v7/widget/ListPopupWindow;->b(I)V
(( android.support.v7.widget.ListPopupWindow ) p1 ).a ( ); // invoke-virtual {p1}, Landroid/support/v7/widget/ListPopupWindow;->a()V
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_4
(( dy ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Ldy;->a(Z)V
} // :cond_4
v0 = this.a;
(( android.support.v7.widget.ActivityChooserView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->getContext()Landroid/content/Context;
(( android.content.Context ) v1 ).getString ( v3 ); // invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;
(( android.widget.ListView ) v0 ).setContentDescription ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ListView;->setContentDescription(Ljava/lang/CharSequence;)V
p1 = this.a;
/* new-instance v0, Landroid/graphics/drawable/ColorDrawable; */
/* invoke-direct {v0, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V */
(( android.widget.ListView ) p1 ).setSelector ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/ListView;->setSelector(Landroid/graphics/drawable/Drawable;)V
} // :cond_5
return;
} // :cond_6
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "No data model.Did you call #setDataModel?"; // const-string v0, "No data model.Did you call #setDataModel?"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final Boolean a ( ) {
/* .locals 2 */
(( android.support.v7.widget.ActivityChooserView ) p0 ).getListPopupWindow ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->getListPopupWindow()Landroid/support/v7/widget/ListPopupWindow;
v0 = this.a;
v0 = (( android.widget.PopupWindow ) v0 ).isShowing ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_1 */
/* iget-boolean v0, p0, Landroid/support/v7/widget/ActivityChooserView;->b:Z */
/* if-nez v0, :cond_0 */
} // :cond_0
/* iput-boolean v1, p0, Landroid/support/v7/widget/ActivityChooserView;->a:Z */
/* iget v0, p0, Landroid/support/v7/widget/ActivityChooserView;->a:I */
(( android.support.v7.widget.ActivityChooserView ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActivityChooserView;->a(I)V
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
} // :goto_0
} // .end method
public final Boolean b ( ) {
/* .locals 2 */
(( android.support.v7.widget.ActivityChooserView ) p0 ).getListPopupWindow ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->getListPopupWindow()Landroid/support/v7/widget/ListPopupWindow;
v0 = this.a;
v0 = (( android.widget.PopupWindow ) v0 ).isShowing ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.support.v7.widget.ActivityChooserView ) p0 ).getListPopupWindow ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->getListPopupWindow()Landroid/support/v7/widget/ListPopupWindow;
(( android.support.v7.widget.ListPopupWindow ) v0 ).b ( ); // invoke-virtual {v0}, Landroid/support/v7/widget/ListPopupWindow;->b()V
(( android.support.v7.widget.ActivityChooserView ) p0 ).getViewTreeObserver ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
v1 = (( android.view.ViewTreeObserver ) v0 ).isAlive ( ); // invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.a;
(( android.view.ViewTreeObserver ) v0 ).removeGlobalOnLayoutListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public final Boolean c ( ) {
/* .locals 1 */
(( android.support.v7.widget.ActivityChooserView ) p0 ).getListPopupWindow ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->getListPopupWindow()Landroid/support/v7/widget/ListPopupWindow;
v0 = this.a;
v0 = (( android.widget.PopupWindow ) v0 ).isShowing ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z
} // .end method
public hr getDataModel ( ) {
/* .locals 1 */
v0 = this.a;
v0 = this.a;
} // .end method
android.support.v7.widget.ListPopupWindow getListPopupWindow ( ) {
/* .locals 2 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/support/v7/widget/ListPopupWindow; */
(( android.support.v7.widget.ActivityChooserView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1}, Landroid/support/v7/widget/ListPopupWindow;-><init>(Landroid/content/Context;)V */
this.a = v0;
v0 = this.a;
v1 = this.a;
(( android.support.v7.widget.ListPopupWindow ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Landroid/support/v7/widget/ListPopupWindow;->a(Landroid/widget/ListAdapter;)V
v0 = this.a;
this.a = p0;
(( android.support.v7.widget.ListPopupWindow ) v0 ).d ( ); // invoke-virtual {v0}, Landroid/support/v7/widget/ListPopupWindow;->d()V
v0 = this.a;
v1 = this.a;
this.a = v1;
(( android.support.v7.widget.ListPopupWindow ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Landroid/support/v7/widget/ListPopupWindow;->a(Landroid/widget/PopupWindow$OnDismissListener;)V
} // :cond_0
v0 = this.a;
} // .end method
protected void onAttachedToWindow ( ) {
/* .locals 2 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V */
v0 = this.a;
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = this.a;
(( hr ) v0 ).registerObserver ( v1 ); // invoke-virtual {v0, v1}, Lhr;->registerObserver(Ljava/lang/Object;)V
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Landroid/support/v7/widget/ActivityChooserView;->b:Z */
return;
} // .end method
protected void onDetachedFromWindow ( ) {
/* .locals 2 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V */
v0 = this.a;
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = this.a;
(( hr ) v0 ).unregisterObserver ( v1 ); // invoke-virtual {v0, v1}, Lhr;->unregisterObserver(Ljava/lang/Object;)V
} // :cond_0
(( android.support.v7.widget.ActivityChooserView ) p0 ).getViewTreeObserver ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
v1 = (( android.view.ViewTreeObserver ) v0 ).isAlive ( ); // invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = this.a;
(( android.view.ViewTreeObserver ) v0 ).removeGlobalOnLayoutListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
} // :cond_1
v0 = (( android.support.v7.widget.ActivityChooserView ) p0 ).c ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_2
(( android.support.v7.widget.ActivityChooserView ) p0 ).b ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->b()Z
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Landroid/support/v7/widget/ActivityChooserView;->b:Z */
return;
} // .end method
protected void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
p1 = this.a;
/* sub-int/2addr p4, p2 */
/* sub-int/2addr p5, p3 */
int p2 = 0; // const/4 p2, 0x0
(( android.view.View ) p1 ).layout ( p2, p2, p4, p5 ); // invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V
p1 = (( android.support.v7.widget.ActivityChooserView ) p0 ).c ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->c()Z
/* if-nez p1, :cond_0 */
(( android.support.v7.widget.ActivityChooserView ) p0 ).b ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->b()Z
} // :cond_0
return;
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 2 */
v0 = this.a;
v1 = this.b;
v1 = (( android.widget.FrameLayout ) v1 ).getVisibility ( ); // invoke-virtual {v1}, Landroid/widget/FrameLayout;->getVisibility()I
if ( v1 != null) { // if-eqz v1, :cond_0
p2 = android.view.View$MeasureSpec .getSize ( p2 );
/* const/high16 v1, 0x40000000 # 2.0f */
p2 = android.view.View$MeasureSpec .makeMeasureSpec ( p2,v1 );
} // :cond_0
(( android.support.v7.widget.ActivityChooserView ) p0 ).measureChild ( v0, p1, p2 ); // invoke-virtual {p0, v0, p1, p2}, Landroid/support/v7/widget/ActivityChooserView;->measureChild(Landroid/view/View;II)V
p1 = (( android.view.View ) v0 ).getMeasuredWidth ( ); // invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I
p2 = (( android.view.View ) v0 ).getMeasuredHeight ( ); // invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I
(( android.support.v7.widget.ActivityChooserView ) p0 ).setMeasuredDimension ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/support/v7/widget/ActivityChooserView;->setMeasuredDimension(II)V
return;
} // .end method
public void setActivityChooserModel ( hr p0 ) {
/* .locals 3 */
v0 = this.a;
v1 = this.a;
v1 = this.a;
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_0
v2 = this.a;
v2 = (( android.support.v7.widget.ActivityChooserView ) v2 ).isShown ( ); // invoke-virtual {v2}, Landroid/support/v7/widget/ActivityChooserView;->isShown()Z
if ( v2 != null) { // if-eqz v2, :cond_0
v2 = this.a;
v2 = this.a;
(( hr ) v1 ).unregisterObserver ( v2 ); // invoke-virtual {v1, v2}, Lhr;->unregisterObserver(Ljava/lang/Object;)V
} // :cond_0
this.a = p1;
if ( p1 != null) { // if-eqz p1, :cond_1
v1 = this.a;
v1 = (( android.support.v7.widget.ActivityChooserView ) v1 ).isShown ( ); // invoke-virtual {v1}, Landroid/support/v7/widget/ActivityChooserView;->isShown()Z
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = this.a;
v1 = this.a;
(( hr ) p1 ).registerObserver ( v1 ); // invoke-virtual {p1, v1}, Lhr;->registerObserver(Ljava/lang/Object;)V
} // :cond_1
(( android.support.v7.widget.ActivityChooserView$a ) v0 ).notifyDataSetChanged ( ); // invoke-virtual {v0}, Landroid/support/v7/widget/ActivityChooserView$a;->notifyDataSetChanged()V
(( android.support.v7.widget.ActivityChooserView ) p0 ).getListPopupWindow ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->getListPopupWindow()Landroid/support/v7/widget/ListPopupWindow;
p1 = this.a;
p1 = (( android.widget.PopupWindow ) p1 ).isShowing ( ); // invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z
if ( p1 != null) { // if-eqz p1, :cond_2
(( android.support.v7.widget.ActivityChooserView ) p0 ).b ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->b()Z
(( android.support.v7.widget.ActivityChooserView ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->a()Z
} // :cond_2
return;
} // .end method
public void setDefaultActionButtonContentDescription ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v7/widget/ActivityChooserView;->b:I */
return;
} // .end method
public void setExpandActivityOverflowButtonContentDescription ( Integer p0 ) {
/* .locals 1 */
(( android.support.v7.widget.ActivityChooserView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ActivityChooserView;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getString ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
v0 = this.b;
(( android.widget.ImageView ) v0 ).setContentDescription ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V
return;
} // .end method
public void setExpandActivityOverflowButtonDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
v0 = this.b;
(( android.widget.ImageView ) v0 ).setImageDrawable ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setInitialActivityCount ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v7/widget/ActivityChooserView;->a:I */
return;
} // .end method
public void setOnDismissListener ( android.widget.PopupWindow$OnDismissListener p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
public void setProvider ( dy p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
