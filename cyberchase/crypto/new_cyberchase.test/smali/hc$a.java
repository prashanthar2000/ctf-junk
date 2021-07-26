class hc$a extends dy {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lhc; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "a" */
} // .end annotation
/* # instance fields */
final android.view.ActionProvider a;
final hc a; //synthetic
/* # direct methods */
public hc$a ( ) {
/* .locals 0 */
this.a = p1;
/* invoke-direct {p0, p2}, Ldy;-><init>(Landroid/content/Context;)V */
this.a = p3;
return;
} // .end method
/* # virtual methods */
public final android.view.View a ( ) {
/* .locals 1 */
v0 = this.a;
(( android.view.ActionProvider ) v0 ).onCreateActionView ( ); // invoke-virtual {v0}, Landroid/view/ActionProvider;->onCreateActionView()Landroid/view/View;
} // .end method
public final void a ( android.view.SubMenu p0 ) {
/* .locals 2 */
v0 = this.a;
v1 = this.a;
(( hc ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lhc;->a(Landroid/view/SubMenu;)Landroid/view/SubMenu;
(( android.view.ActionProvider ) v0 ).onPrepareSubMenu ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ActionProvider;->onPrepareSubMenu(Landroid/view/SubMenu;)V
return;
} // .end method
public final Boolean c ( ) {
/* .locals 1 */
v0 = this.a;
v0 = (( android.view.ActionProvider ) v0 ).onPerformDefaultAction ( ); // invoke-virtual {v0}, Landroid/view/ActionProvider;->onPerformDefaultAction()Z
} // .end method
public final Boolean d ( ) {
/* .locals 1 */
v0 = this.a;
v0 = (( android.view.ActionProvider ) v0 ).hasSubMenu ( ); // invoke-virtual {v0}, Landroid/view/ActionProvider;->hasSubMenu()Z
} // .end method
