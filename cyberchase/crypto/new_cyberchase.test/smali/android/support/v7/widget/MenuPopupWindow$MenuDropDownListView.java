public class android.support.v7.widget.MenuPopupWindow$MenuDropDownListView extends ie {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/support/v7/widget/MenuPopupWindow; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "MenuDropDownListView" */
} // .end annotation
/* # instance fields */
final Integer a;
private android.view.MenuItem a;
private ih a;
final Integer b;
/* # direct methods */
public android.support.v7.widget.MenuPopupWindow$MenuDropDownListView ( ) {
/* .locals 3 */
/* invoke-direct {p0, p1, p2}, Lie;-><init>(Landroid/content/Context;Z)V */
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) p1 ).getConfiguration ( ); // invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* const/16 v0, 0x15 */
/* const/16 v1, 0x16 */
/* const/16 v2, 0x11 */
/* if-lt p2, v2, :cond_0 */
int p2 = 1; // const/4 p2, 0x1
p1 = (( android.content.res.Configuration ) p1 ).getLayoutDirection ( ); // invoke-virtual {p1}, Landroid/content/res/Configuration;->getLayoutDirection()I
/* if-ne p2, p1, :cond_0 */
/* iput v0, p0, Landroid/support/v7/widget/MenuPopupWindow$MenuDropDownListView;->a:I */
/* iput v1, p0, Landroid/support/v7/widget/MenuPopupWindow$MenuDropDownListView;->b:I */
return;
} // :cond_0
/* iput v1, p0, Landroid/support/v7/widget/MenuPopupWindow$MenuDropDownListView;->a:I */
/* iput v0, p0, Landroid/support/v7/widget/MenuPopupWindow$MenuDropDownListView;->b:I */
return;
} // .end method
/* # virtual methods */
public final Integer a ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4 ) { //bridge//synthethic
/* .locals 0 */
p1 = /* invoke-super/range {p0 ..p5}, Lie;->a(IIIII)I */
} // .end method
public final Boolean a ( android.view.MotionEvent p0, Integer p1 ) { //bridge//synthethic
/* .locals 0 */
p1 = /* invoke-super {p0, p1, p2}, Lie;->a(Landroid/view/MotionEvent;I)Z */
} // .end method
public Boolean hasFocus ( ) { //bridge//synthethic
/* .locals 1 */
v0 = /* invoke-super {p0}, Lie;->hasFocus()Z */
} // .end method
public Boolean hasWindowFocus ( ) { //bridge//synthethic
/* .locals 1 */
v0 = /* invoke-super {p0}, Lie;->hasWindowFocus()Z */
} // .end method
public Boolean isFocused ( ) { //bridge//synthethic
/* .locals 1 */
v0 = /* invoke-super {p0}, Lie;->isFocused()Z */
} // .end method
public Boolean isInTouchMode ( ) { //bridge//synthethic
/* .locals 1 */
v0 = /* invoke-super {p0}, Lie;->isInTouchMode()Z */
} // .end method
public Boolean onHoverEvent ( android.view.MotionEvent p0 ) {
/* .locals 5 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_3
(( android.support.v7.widget.MenuPopupWindow$MenuDropDownListView ) p0 ).getAdapter ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/MenuPopupWindow$MenuDropDownListView;->getAdapter()Landroid/widget/ListAdapter;
/* instance-of v1, v0, Landroid/widget/HeaderViewListAdapter; */
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* check-cast v0, Landroid/widget/HeaderViewListAdapter; */
	 v1 = 	 (( android.widget.HeaderViewListAdapter ) v0 ).getHeadersCount ( ); // invoke-virtual {v0}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I
	 (( android.widget.HeaderViewListAdapter ) v0 ).getWrappedAdapter ( ); // invoke-virtual {v0}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* check-cast v0, Lgy; */
int v2 = 0; // const/4 v2, 0x0
v3 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
/* const/16 v4, 0xa */
/* if-eq v3, v4, :cond_1 */
v3 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* float-to-int v3, v3 */
v4 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* float-to-int v4, v4 */
v3 = (( android.support.v7.widget.MenuPopupWindow$MenuDropDownListView ) p0 ).pointToPosition ( v3, v4 ); // invoke-virtual {p0, v3, v4}, Landroid/support/v7/widget/MenuPopupWindow$MenuDropDownListView;->pointToPosition(II)I
int v4 = -1; // const/4 v4, -0x1
/* if-eq v3, v4, :cond_1 */
/* sub-int/2addr v3, v1 */
/* if-ltz v3, :cond_1 */
v1 = (( gy ) v0 ).getCount ( ); // invoke-virtual {v0}, Lgy;->getCount()I
/* if-ge v3, v1, :cond_1 */
(( gy ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Lgy;->a(I)Lhb;
} // :cond_1
v1 = this.a;
/* if-eq v1, v2, :cond_3 */
v0 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_2
v3 = this.a;
} // :cond_2
this.a = v2;
if ( v2 != null) { // if-eqz v2, :cond_3
v1 = this.a;
} // :cond_3
p1 = /* invoke-super {p0, p1}, Lie;->onHoverEvent(Landroid/view/MotionEvent;)Z */
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 4 */
(( android.support.v7.widget.MenuPopupWindow$MenuDropDownListView ) p0 ).getSelectedView ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/MenuPopupWindow$MenuDropDownListView;->getSelectedView()Landroid/view/View;
/* check-cast v0, Landroid/support/v7/view/menu/ListMenuItemView; */
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget v2, p0, Landroid/support/v7/widget/MenuPopupWindow$MenuDropDownListView;->a:I */
/* if-ne p1, v2, :cond_1 */
p1 = (( android.support.v7.view.menu.ListMenuItemView ) v0 ).isEnabled ( ); // invoke-virtual {v0}, Landroid/support/v7/view/menu/ListMenuItemView;->isEnabled()Z
if ( p1 != null) { // if-eqz p1, :cond_0
(( android.support.v7.view.menu.ListMenuItemView ) v0 ).getItemData ( ); // invoke-virtual {v0}, Landroid/support/v7/view/menu/ListMenuItemView;->getItemData()Lhb;
p1 = (( hb ) p1 ).hasSubMenu ( ); // invoke-virtual {p1}, Lhb;->hasSubMenu()Z
if ( p1 != null) { // if-eqz p1, :cond_0
	 p1 = 	 (( android.support.v7.widget.MenuPopupWindow$MenuDropDownListView ) p0 ).getSelectedItemPosition ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/MenuPopupWindow$MenuDropDownListView;->getSelectedItemPosition()I
	 (( android.support.v7.widget.MenuPopupWindow$MenuDropDownListView ) p0 ).getSelectedItemId ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/MenuPopupWindow$MenuDropDownListView;->getSelectedItemId()J
	 /* move-result-wide v2 */
	 (( android.support.v7.widget.MenuPopupWindow$MenuDropDownListView ) p0 ).performItemClick ( v0, p1, v2, v3 ); // invoke-virtual {p0, v0, p1, v2, v3}, Landroid/support/v7/widget/MenuPopupWindow$MenuDropDownListView;->performItemClick(Landroid/view/View;IJ)Z
} // :cond_0
} // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_2
/* iget v0, p0, Landroid/support/v7/widget/MenuPopupWindow$MenuDropDownListView;->b:I */
/* if-ne p1, v0, :cond_2 */
int p1 = -1; // const/4 p1, -0x1
(( android.support.v7.widget.MenuPopupWindow$MenuDropDownListView ) p0 ).setSelection ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/MenuPopupWindow$MenuDropDownListView;->setSelection(I)V
(( android.support.v7.widget.MenuPopupWindow$MenuDropDownListView ) p0 ).getAdapter ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/MenuPopupWindow$MenuDropDownListView;->getAdapter()Landroid/widget/ListAdapter;
/* check-cast p1, Lgy; */
p1 = this.a;
int p2 = 0; // const/4 p2, 0x0
(( gz ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lgz;->a(Z)V
} // :cond_2
p1 = /* invoke-super {p0, p1, p2}, Lie;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) { //bridge//synthethic
/* .locals 0 */
p1 = /* invoke-super {p0, p1}, Lie;->onTouchEvent(Landroid/view/MotionEvent;)Z */
} // .end method
public void setHoverListener ( ih p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
public void setSelector ( android.graphics.drawable.Drawable p0 ) { //bridge//synthethic
/* .locals 0 */
/* invoke-super {p0, p1}, Lie;->setSelector(Landroid/graphics/drawable/Drawable;)V */
return;
} // .end method
