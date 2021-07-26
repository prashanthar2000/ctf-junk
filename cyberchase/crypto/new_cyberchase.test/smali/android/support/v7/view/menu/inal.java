public class inal extends android.widget.ListView implements android.widget.AdapterView$OnItemClickListener implements gz$b implements hh {
	 /* # interfaces */
	 /* # static fields */
	 private static final a;
	 /* # instance fields */
	 private Integer a;
	 private gz a;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 1 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [I */
		 /* fill-array-data v0, :array_0 */
		 return;
		 /* nop */
		 /* :array_0 */
		 /* .array-data 4 */
		 /* 0x10100d4 */
		 /* 0x1010129 */
	 } // .end array-data
} // .end method
public inal ( ) {
	 /* .locals 1 */
	 /* const v0, 0x1010074 */
	 /* invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/view/menu/ExpandedMenuView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 return;
} // .end method
public inal ( ) {
	 /* .locals 2 */
	 /* invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 (( android.support.v7.view.menu.ExpandedMenuView ) p0 ).setOnItemClickListener ( p0 ); // invoke-virtual {p0, p0}, Landroid/support/v7/view/menu/ExpandedMenuView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
	 v0 = android.support.v7.view.menu.ExpandedMenuView.a;
	 int v1 = 0; // const/4 v1, 0x0
	 ip .a ( p1,p2,v0,p3,v1 );
	 p2 = 	 (( ip ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lip;->a(I)Z
	 if ( p2 != null) { // if-eqz p2, :cond_0
		 (( ip ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lip;->a(I)Landroid/graphics/drawable/Drawable;
		 (( android.support.v7.view.menu.ExpandedMenuView ) p0 ).setBackgroundDrawable ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/view/menu/ExpandedMenuView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
	 } // :cond_0
	 int p2 = 1; // const/4 p2, 0x1
	 p3 = 	 (( ip ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lip;->a(I)Z
	 if ( p3 != null) { // if-eqz p3, :cond_1
		 (( ip ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lip;->a(I)Landroid/graphics/drawable/Drawable;
		 (( android.support.v7.view.menu.ExpandedMenuView ) p0 ).setDivider ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/view/menu/ExpandedMenuView;->setDivider(Landroid/graphics/drawable/Drawable;)V
	 } // :cond_1
	 p1 = this.a;
	 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
	 return;
} // .end method
/* # virtual methods */
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
	 p1 = 	 (( gz ) v0 ).a ( p1, v1, v2 ); // invoke-virtual {v0, p1, v1, v2}, Lgz;->a(Landroid/view/MenuItem;Lhg;I)Z
} // .end method
public final Integer getWindowAnimations ( ) {
	 /* .locals 1 */
	 /* iget v0, p0, Landroid/support/v7/view/menu/ExpandedMenuView;->a:I */
} // .end method
protected final void onDetachedFromWindow ( ) {
	 /* .locals 1 */
	 /* invoke-super {p0}, Landroid/widget/ListView;->onDetachedFromWindow()V */
	 int v0 = 0; // const/4 v0, 0x0
	 (( android.support.v7.view.menu.ExpandedMenuView ) p0 ).setChildrenDrawingCacheEnabled ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/view/menu/ExpandedMenuView;->setChildrenDrawingCacheEnabled(Z)V
	 return;
} // .end method
public final void onItemClick ( android.widget.AdapterView p0, android.view.View p1, Integer p2, Long p3 ) {
	 /* .locals 0 */
	 (( android.support.v7.view.menu.ExpandedMenuView ) p0 ).getAdapter ( ); // invoke-virtual {p0}, Landroid/support/v7/view/menu/ExpandedMenuView;->getAdapter()Landroid/widget/ListAdapter;
	 /* check-cast p1, Lhb; */
	 (( android.support.v7.view.menu.ExpandedMenuView ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/view/menu/ExpandedMenuView;->a(Lhb;)Z
	 return;
} // .end method
