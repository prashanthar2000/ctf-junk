class android.support.v7.widget.AppCompatPopupWindow extends android.widget.PopupWindow {
	 /* # static fields */
	 private static final Boolean a;
	 /* # instance fields */
	 private Boolean b;
	 /* # direct methods */
	 static android.support.v7.widget.AppCompatPopupWindow ( ) {
		 /* .locals 2 */
		 /* const/16 v1, 0x15 */
		 /* if-ge v0, v1, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
android.support.v7.widget.AppCompatPopupWindow.a = (v0!= 0);
return;
} // .end method
public android.support.v7.widget.AppCompatPopupWindow ( ) {
/* .locals 1 */
/* invoke-direct {p0, p1, p2, p3}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, p2, p3, v0}, Landroid/support/v7/widget/AppCompatPopupWindow;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
return;
} // .end method
public android.support.v7.widget.AppCompatPopupWindow ( ) {
/* .locals 0 */
/* invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
/* invoke-direct {p0, p1, p2, p3, p4}, Landroid/support/v7/widget/AppCompatPopupWindow;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
return;
} // .end method
private void a ( android.content.Context p0, android.util.AttributeSet p1, Integer p2, Integer p3 ) {
/* .locals 1 */
v0 = gc$j.PopupWindow;
ip .a ( p1,p2,v0,p3,p4 );
p2 = (( ip ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lip;->a(I)Z
if ( p2 != null) { // if-eqz p2, :cond_0
	 int p3 = 0; // const/4 p3, 0x0
	 p2 = 	 (( ip ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lip;->a(IZ)Z
	 /* invoke-direct {p0, p2}, Landroid/support/v7/widget/AppCompatPopupWindow;->a(Z)V */
} // :cond_0
(( ip ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lip;->a(I)Landroid/graphics/drawable/Drawable;
(( android.support.v7.widget.AppCompatPopupWindow ) p0 ).setBackgroundDrawable ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/widget/AppCompatPopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
p1 = this.a;
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
return;
} // .end method
private void a ( Boolean p0 ) {
/* .locals 1 */
/* sget-boolean v0, Landroid/support/v7/widget/AppCompatPopupWindow;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* iput-boolean p1, p0, Landroid/support/v7/widget/AppCompatPopupWindow;->b:Z */
	 return;
} // :cond_0
fl .a ( p0,p1 );
return;
} // .end method
/* # virtual methods */
public void showAsDropDown ( android.view.View p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* sget-boolean v0, Landroid/support/v7/widget/AppCompatPopupWindow;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* iget-boolean v0, p0, Landroid/support/v7/widget/AppCompatPopupWindow;->b:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = 		 (( android.view.View ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getHeight()I
		 /* sub-int/2addr p3, v0 */
	 } // :cond_0
	 /* invoke-super {p0, p1, p2, p3}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V */
	 return;
} // .end method
public void showAsDropDown ( android.view.View p0, Integer p1, Integer p2, Integer p3 ) {
	 /* .locals 1 */
	 /* sget-boolean v0, Landroid/support/v7/widget/AppCompatPopupWindow;->a:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* iget-boolean v0, p0, Landroid/support/v7/widget/AppCompatPopupWindow;->b:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = 			 (( android.view.View ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getHeight()I
			 /* sub-int/2addr p3, v0 */
		 } // :cond_0
		 /* invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V */
		 return;
	 } // .end method
	 public void update ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
		 /* .locals 6 */
		 /* sget-boolean v0, Landroid/support/v7/widget/AppCompatPopupWindow;->a:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* iget-boolean v0, p0, Landroid/support/v7/widget/AppCompatPopupWindow;->b:Z */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 v0 = 				 (( android.view.View ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getHeight()I
				 /* sub-int/2addr p3, v0 */
			 } // :cond_0
			 /* move v3, p3 */
			 /* move-object v0, p0 */
			 /* move-object v1, p1 */
			 /* move v2, p2 */
			 /* move v4, p4 */
			 /* move v5, p5 */
			 /* invoke-super/range {v0 ..v5}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V */
			 return;
		 } // .end method
