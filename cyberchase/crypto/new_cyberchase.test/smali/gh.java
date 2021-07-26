class gh extends gf {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lgh$a; */
	 /* } */
} // .end annotation
/* # instance fields */
private gh$a a;
private Boolean a;
/* # direct methods */
 gh ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, v0, v0}, Lgh;-><init>(Lgh$a;Landroid/content/res/Resources;)V */
	 return;
} // .end method
 gh ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0}, Lgf;-><init>()V */
	 return;
} // .end method
 gh ( ) {
	 /* .locals 1 */
	 /* invoke-direct {p0}, Lgf;-><init>()V */
	 /* new-instance v0, Lgh$a; */
	 /* invoke-direct {v0, p1, p0, p2}, Lgh$a;-><init>(Lgh$a;Lgh;Landroid/content/res/Resources;)V */
	 (( gh ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lgh;->a(Lgf$b;)V
	 (( gh ) p0 ).getState ( ); // invoke-virtual {p0}, Lgh;->getState()[I
	 (( gh ) p0 ).onStateChange ( p1 ); // invoke-virtual {p0, p1}, Lgh;->onStateChange([I)Z
	 return;
} // .end method
/* # virtual methods */
gf$b a ( ) { //bridge//synthethic
	 /* .locals 1 */
	 (( gh ) p0 ).a ( ); // invoke-virtual {p0}, Lgh;->a()Lgh$a;
} // .end method
gh$a a ( ) {
	 /* .locals 3 */
	 /* new-instance v0, Lgh$a; */
	 v1 = this.a;
	 int v2 = 0; // const/4 v2, 0x0
	 /* invoke-direct {v0, v1, p0, v2}, Lgh$a;-><init>(Lgh$a;Lgh;Landroid/content/res/Resources;)V */
} // .end method
protected void a ( gf$b p0 ) {
	 /* .locals 1 */
	 /* invoke-super {p0, p1}, Lgf;->a(Lgf$b;)V */
	 /* instance-of v0, p1, Lgh$a; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* check-cast p1, Lgh$a; */
		 this.a = p1;
	 } // :cond_0
	 return;
} // .end method
public void applyTheme ( android.content.res.Resources$Theme p0 ) {
	 /* .locals 0 */
	 /* invoke-super {p0, p1}, Lgf;->applyTheme(Landroid/content/res/Resources$Theme;)V */
	 (( gh ) p0 ).getState ( ); // invoke-virtual {p0}, Lgh;->getState()[I
	 (( gh ) p0 ).onStateChange ( p1 ); // invoke-virtual {p0, p1}, Lgh;->onStateChange([I)Z
	 return;
} // .end method
public Boolean isStateful ( ) {
	 /* .locals 1 */
	 int v0 = 1; // const/4 v0, 0x1
} // .end method
public android.graphics.drawable.Drawable mutate ( ) {
	 /* .locals 1 */
	 /* iget-boolean v0, p0, Lgh;->a:Z */
	 /* if-nez v0, :cond_0 */
	 /* invoke-super {p0}, Lgf;->mutate()Landroid/graphics/drawable/Drawable; */
	 /* if-ne v0, p0, :cond_0 */
	 v0 = this.a;
	 (( gh$a ) v0 ).a ( ); // invoke-virtual {v0}, Lgh$a;->a()V
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput-boolean v0, p0, Lgh;->a:Z */
} // :cond_0
} // .end method
protected Boolean onStateChange ( Integer[] p0 ) {
/* .locals 2 */
v0 = /* invoke-super {p0, p1}, Lgf;->onStateChange([I)Z */
v1 = this.a;
p1 = (( gh$a ) v1 ).b ( p1 ); // invoke-virtual {v1, p1}, Lgh$a;->b([I)I
/* if-gez p1, :cond_0 */
p1 = this.a;
v1 = android.util.StateSet.WILD_CARD;
p1 = (( gh$a ) p1 ).b ( v1 ); // invoke-virtual {p1, v1}, Lgh$a;->b([I)I
} // :cond_0
p1 = (( gh ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lgh;->a(I)Z
/* if-nez p1, :cond_2 */
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :cond_2
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // .end method
