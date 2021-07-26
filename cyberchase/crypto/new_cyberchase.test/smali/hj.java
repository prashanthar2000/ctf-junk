class hj extends gu implements android.view.Menu {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lgu<", */
	 /* "Ldc;", */
	 /* ">;", */
	 /* "Landroid/view/Menu;" */
	 /* } */
} // .end annotation
/* # direct methods */
 hj ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0, p1, p2}, Lgu;-><init>(Landroid/content/Context;Ljava/lang/Object;)V */
	 return;
} // .end method
/* # virtual methods */
public android.view.MenuItem add ( Integer p0 ) {
	 /* .locals 1 */
	 v0 = this.a;
	 /* check-cast v0, Ldc; */
	 (( hj ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lhj;->a(Landroid/view/MenuItem;)Landroid/view/MenuItem;
} // .end method
public android.view.MenuItem add ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
	 /* .locals 1 */
	 v0 = this.a;
	 /* check-cast v0, Ldc; */
	 (( hj ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lhj;->a(Landroid/view/MenuItem;)Landroid/view/MenuItem;
} // .end method
public android.view.MenuItem add ( Integer p0, Integer p1, Integer p2, java.lang.CharSequence p3 ) {
	 /* .locals 1 */
	 v0 = this.a;
	 /* check-cast v0, Ldc; */
	 (( hj ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lhj;->a(Landroid/view/MenuItem;)Landroid/view/MenuItem;
} // .end method
public android.view.MenuItem add ( java.lang.CharSequence p0 ) {
	 /* .locals 1 */
	 v0 = this.a;
	 /* check-cast v0, Ldc; */
	 (( hj ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lhj;->a(Landroid/view/MenuItem;)Landroid/view/MenuItem;
} // .end method
public Integer addIntentOptions ( Integer p0, Integer p1, Integer p2, android.content.ComponentName p3, android.content.Intent[] p4, android.content.Intent p5, Integer p6, android.view.MenuItem[] p7 ) {
	 /* .locals 12 */
	 /* move-object v0, p0 */
	 /* move-object/from16 v1, p8 */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* array-length v2, v1 */
		 /* new-array v2, v2, [Landroid/view/MenuItem; */
	 } // :cond_0
	 int v2 = 0; // const/4 v2, 0x0
} // :goto_0
v3 = this.a;
/* check-cast v3, Ldc; */
/* move v4, p1 */
/* move v5, p2 */
/* move v6, p3 */
/* move-object/from16 v7, p4 */
/* move-object/from16 v8, p5 */
/* move-object/from16 v9, p6 */
/* move/from16 v10, p7 */
/* move-object v11, v2 */
v3 = /* invoke-interface/range {v3 ..v11}, Ldc;->addIntentOptions(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Landroid/view/MenuItem;)I */
if ( v2 != null) { // if-eqz v2, :cond_1
	 int v4 = 0; // const/4 v4, 0x0
	 /* array-length v5, v2 */
} // :goto_1
/* if-ge v4, v5, :cond_1 */
/* aget-object v6, v2, v4 */
(( hj ) p0 ).a ( v6 ); // invoke-virtual {p0, v6}, Lhj;->a(Landroid/view/MenuItem;)Landroid/view/MenuItem;
/* aput-object v6, v1, v4 */
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_1
} // .end method
public android.view.SubMenu addSubMenu ( Integer p0 ) {
/* .locals 1 */
v0 = this.a;
/* check-cast v0, Ldc; */
(( hj ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lhj;->a(Landroid/view/SubMenu;)Landroid/view/SubMenu;
} // .end method
public android.view.SubMenu addSubMenu ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
v0 = this.a;
/* check-cast v0, Ldc; */
(( hj ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lhj;->a(Landroid/view/SubMenu;)Landroid/view/SubMenu;
} // .end method
public android.view.SubMenu addSubMenu ( Integer p0, Integer p1, Integer p2, java.lang.CharSequence p3 ) {
/* .locals 1 */
v0 = this.a;
/* check-cast v0, Ldc; */
(( hj ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lhj;->a(Landroid/view/SubMenu;)Landroid/view/SubMenu;
} // .end method
public android.view.SubMenu addSubMenu ( java.lang.CharSequence p0 ) {
/* .locals 1 */
v0 = this.a;
/* check-cast v0, Ldc; */
(( hj ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lhj;->a(Landroid/view/SubMenu;)Landroid/view/SubMenu;
} // .end method
public void clear ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
} // :cond_0
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.b;
} // :cond_1
v0 = this.a;
/* check-cast v0, Ldc; */
return;
} // .end method
public void close ( ) {
/* .locals 1 */
v0 = this.a;
/* check-cast v0, Ldc; */
return;
} // .end method
public android.view.MenuItem findItem ( Integer p0 ) {
/* .locals 1 */
v0 = this.a;
/* check-cast v0, Ldc; */
(( hj ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lhj;->a(Landroid/view/MenuItem;)Landroid/view/MenuItem;
} // .end method
public android.view.MenuItem getItem ( Integer p0 ) {
/* .locals 1 */
v0 = this.a;
/* check-cast v0, Ldc; */
(( hj ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lhj;->a(Landroid/view/MenuItem;)Landroid/view/MenuItem;
} // .end method
public Boolean hasVisibleItems ( ) {
/* .locals 1 */
v0 = this.a;
v0 = /* check-cast v0, Ldc; */
} // .end method
public Boolean isShortcutKey ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
v0 = this.a;
p1 = /* check-cast v0, Ldc; */
} // .end method
public Boolean performIdentifierAction ( Integer p0, Integer p1 ) {
/* .locals 1 */
v0 = this.a;
p1 = /* check-cast v0, Ldc; */
} // .end method
public Boolean performShortcut ( Integer p0, android.view.KeyEvent p1, Integer p2 ) {
/* .locals 1 */
v0 = this.a;
p1 = /* check-cast v0, Ldc; */
} // .end method
public void removeGroup ( Integer p0 ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
} // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = /* check-cast v1, Landroid/view/MenuItem; */
/* if-ne p1, v1, :cond_0 */
} // :cond_1
v0 = this.a;
/* check-cast v0, Ldc; */
return;
} // .end method
public void removeItem ( Integer p0 ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = /* check-cast v1, Landroid/view/MenuItem; */
/* if-ne p1, v1, :cond_0 */
} // :cond_1
v0 = this.a;
/* check-cast v0, Ldc; */
return;
} // .end method
public void setGroupCheckable ( Integer p0, Boolean p1, Boolean p2 ) {
/* .locals 1 */
v0 = this.a;
/* check-cast v0, Ldc; */
return;
} // .end method
public void setGroupEnabled ( Integer p0, Boolean p1 ) {
/* .locals 1 */
v0 = this.a;
/* check-cast v0, Ldc; */
return;
} // .end method
public void setGroupVisible ( Integer p0, Boolean p1 ) {
/* .locals 1 */
v0 = this.a;
/* check-cast v0, Ldc; */
return;
} // .end method
public void setQwertyMode ( Boolean p0 ) {
/* .locals 1 */
v0 = this.a;
/* check-cast v0, Ldc; */
return;
} // .end method
public Integer size ( ) {
/* .locals 1 */
v0 = this.a;
v0 = /* check-cast v0, Ldc; */
} // .end method
