abstract class he implements android.widget.AdapterView$OnItemClickListener implements hg implements hk {
	 /* # interfaces */
	 /* # instance fields */
	 android.graphics.Rect a;
	 /* # direct methods */
	 he ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 protected static Integer a ( android.widget.ListAdapter p0, android.view.ViewGroup p1, android.content.Context p2, Integer p3 ) {
		 /* .locals 9 */
		 int v0 = 0; // const/4 v0, 0x0
		 v1 = 		 android.view.View$MeasureSpec .makeMeasureSpec ( v0,v0 );
		 v3 = 		 v2 = 		 android.view.View$MeasureSpec .makeMeasureSpec ( v0,v0 );
		 int v4 = 0; // const/4 v4, 0x0
		 /* move-object v6, p1 */
		 /* move-object v7, v4 */
		 int p1 = 0; // const/4 p1, 0x0
		 int v5 = 0; // const/4 v5, 0x0
	 } // :goto_0
	 v8 = 	 /* if-ge v0, v3, :cond_4 */
	 /* if-eq v8, v5, :cond_0 */
	 /* move-object v7, v4 */
	 /* move v5, v8 */
} // :cond_0
/* if-nez v6, :cond_1 */
/* new-instance v6, Landroid/widget/FrameLayout; */
/* invoke-direct {v6, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
} // :cond_1
(( android.view.View ) v7 ).measure ( v1, v2 ); // invoke-virtual {v7, v1, v2}, Landroid/view/View;->measure(II)V
v8 = (( android.view.View ) v7 ).getMeasuredWidth ( ); // invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I
/* if-lt v8, p3, :cond_2 */
} // :cond_2
/* if-le v8, p1, :cond_3 */
/* move p1, v8 */
} // :cond_3
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_4
} // .end method
protected static gy a ( android.widget.ListAdapter p0 ) {
/* .locals 1 */
/* instance-of v0, p0, Landroid/widget/HeaderViewListAdapter; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast p0, Landroid/widget/HeaderViewListAdapter; */
(( android.widget.HeaderViewListAdapter ) p0 ).getWrappedAdapter ( ); // invoke-virtual {p0}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;
/* check-cast p0, Lgy; */
} // :cond_0
/* check-cast p0, Lgy; */
} // .end method
protected static Boolean a ( gz p0 ) {
/* .locals 5 */
v0 = (( gz ) p0 ).size ( ); // invoke-virtual {p0}, Lgz;->size()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_1 */
v4 = (( gz ) p0 ).getItem ( v2 ); // invoke-virtual {p0, v2}, Lgz;->getItem(I)Landroid/view/MenuItem;
if ( v4 != null) { // if-eqz v4, :cond_0
if ( v3 != null) { // if-eqz v3, :cond_0
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
} // :goto_1
} // .end method
/* # virtual methods */
public abstract void a ( Integer p0 ) {
} // .end method
public final void a ( android.content.Context p0, gz p1 ) {
/* .locals 0 */
return;
} // .end method
public abstract void a ( android.view.View p0 ) {
} // .end method
public abstract void a ( android.widget.PopupWindow$OnDismissListener p0 ) {
} // .end method
public abstract void a ( gz p0 ) {
} // .end method
public abstract void a ( Boolean p0 ) {
} // .end method
public abstract void b ( Integer p0 ) {
} // .end method
public final Boolean b ( hb p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public abstract void c ( Integer p0 ) {
} // .end method
public abstract void c ( Boolean p0 ) {
} // .end method
protected Boolean c ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public final Boolean c ( hb p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void onItemClick ( android.widget.AdapterView p0, android.view.View p1, Integer p2, Long p3 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/widget/AdapterView<", */
/* "*>;", */
/* "Landroid/view/View;", */
/* "IJ)V" */
/* } */
} // .end annotation
(( android.widget.AdapterView ) p1 ).getAdapter ( ); // invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;
/* check-cast p1, Landroid/widget/ListAdapter; */
he .a ( p1 );
p2 = this.a;
/* check-cast p1, Landroid/view/MenuItem; */
p3 = (( he ) p0 ).c ( ); // invoke-virtual {p0}, Lhe;->c()Z
if ( p3 != null) { // if-eqz p3, :cond_0
int p3 = 0; // const/4 p3, 0x0
} // :cond_0
int p3 = 4; // const/4 p3, 0x4
} // :goto_0
(( gz ) p2 ).a ( p1, p0, p3 ); // invoke-virtual {p2, p1, p0, p3}, Lgz;->a(Landroid/view/MenuItem;Lhg;I)Z
return;
} // .end method
