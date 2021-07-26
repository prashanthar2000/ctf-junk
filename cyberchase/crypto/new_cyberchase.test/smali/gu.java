abstract class gu extends gv {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Lgv<", */
	 /* "TT;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
final android.content.Context a;
java.util.Map a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ldd;", */
/* "Landroid/view/MenuItem;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
java.util.Map b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Lde;", */
/* "Landroid/view/SubMenu;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
 gu ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "TT;)V" */
/* } */
} // .end annotation
/* invoke-direct {p0, p2}, Lgv;-><init>(Ljava/lang/Object;)V */
this.a = p1;
return;
} // .end method
/* # virtual methods */
final android.view.MenuItem a ( android.view.MenuItem p0 ) {
/* .locals 2 */
/* instance-of v0, p1, Ldd; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* move-object v0, p1 */
/* check-cast v0, Ldd; */
v1 = this.a;
/* if-nez v1, :cond_0 */
/* new-instance v1, Ldj; */
/* invoke-direct {v1}, Ldj;-><init>()V */
this.a = v1;
} // :cond_0
v1 = this.a;
/* check-cast p1, Landroid/view/MenuItem; */
/* if-nez p1, :cond_1 */
p1 = this.a;
hi .a ( p1,v0 );
v1 = this.a;
} // :cond_1
} // .end method
final android.view.SubMenu a ( android.view.SubMenu p0 ) {
/* .locals 2 */
/* instance-of v0, p1, Lde; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* check-cast p1, Lde; */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* new-instance v0, Ldj; */
/* invoke-direct {v0}, Ldj;-><init>()V */
this.b = v0;
} // :cond_0
v0 = this.b;
/* check-cast v0, Landroid/view/SubMenu; */
/* if-nez v0, :cond_1 */
v0 = this.a;
/* new-instance v1, Lhn; */
/* invoke-direct {v1, v0, p1}, Lhn;-><init>(Landroid/content/Context;Lde;)V */
v0 = this.b;
/* move-object v0, v1 */
} // :cond_1
} // :cond_2
} // .end method
