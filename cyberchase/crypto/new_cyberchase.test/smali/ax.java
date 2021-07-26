public class ax extends am {
	 /* # instance fields */
	 protected java.util.ArrayList b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList<", */
	 /* "Lam;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public ax ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Lam;-><init>()V */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.b = v0;
return;
} // .end method
/* # virtual methods */
public final void a ( ab p0 ) {
/* .locals 3 */
/* invoke-super {p0, p1}, Lam;->a(Lab;)V */
v0 = this.b;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
v2 = this.b;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Lam; */
(( am ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Lam;->a(Lab;)V
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
public final void a ( am p0 ) {
/* .locals 1 */
v0 = this.b;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
/* check-cast v0, Lax; */
(( ax ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lax;->b(Lam;)V
} // :cond_0
this.a = p0;
return;
} // .end method
public final void b ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* invoke-super {p0, p1, p2}, Lam;->b(II)V */
p1 = this.b;
p1 = (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
int p2 = 0; // const/4 p2, 0x0
} // :goto_0
/* if-ge p2, p1, :cond_0 */
v0 = this.b;
(( java.util.ArrayList ) v0 ).get ( p2 ); // invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lam; */
v1 = (( ax ) p0 ).g ( ); // invoke-virtual {p0}, Lax;->g()I
v2 = (( ax ) p0 ).h ( ); // invoke-virtual {p0}, Lax;->h()I
(( am ) v0 ).b ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lam;->b(II)V
/* add-int/lit8 p2, p2, 0x1 */
} // :cond_0
return;
} // .end method
public final void b ( am p0 ) {
/* .locals 1 */
v0 = this.b;
(( java.util.ArrayList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
return;
} // .end method
public void c ( ) {
/* .locals 1 */
v0 = this.b;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* invoke-super {p0}, Lam;->c()V */
return;
} // .end method
public final void e ( ) {
/* .locals 5 */
/* invoke-super {p0}, Lam;->e()V */
v0 = this.b;
/* if-nez v0, :cond_0 */
return;
} // :cond_0
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_2 */
v2 = this.b;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Lam; */
v3 = (( ax ) p0 ).e ( ); // invoke-virtual {p0}, Lax;->e()I
v4 = (( ax ) p0 ).f ( ); // invoke-virtual {p0}, Lax;->f()I
(( am ) v2 ).b ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lam;->b(II)V
/* instance-of v3, v2, Lan; */
/* if-nez v3, :cond_1 */
(( am ) v2 ).e ( ); // invoke-virtual {v2}, Lam;->e()V
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
return;
} // .end method
public void h ( ) {
/* .locals 4 */
(( ax ) p0 ).e ( ); // invoke-virtual {p0}, Lax;->e()V
v0 = this.b;
/* if-nez v0, :cond_0 */
return;
} // :cond_0
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_2 */
v2 = this.b;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Lam; */
/* instance-of v3, v2, Lax; */
if ( v3 != null) { // if-eqz v3, :cond_1
/* check-cast v2, Lax; */
(( ax ) v2 ).h ( ); // invoke-virtual {v2}, Lax;->h()V
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
return;
} // .end method
public final void k ( ) {
/* .locals 1 */
v0 = this.b;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
return;
} // .end method
