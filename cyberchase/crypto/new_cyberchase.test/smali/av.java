public class av {
	 /* # instance fields */
	 java.util.HashSet a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashSet<", */
	 /* "Lav;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public Integer b;
/* # direct methods */
public av ( ) {
/* .locals 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* new-instance v0, Ljava/util/HashSet; */
int v1 = 2; // const/4 v1, 0x2
/* invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V */
this.a = v0;
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lav;->b:I */
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 0 */
return;
} // .end method
public final void a ( av p0 ) {
/* .locals 1 */
v0 = this.a;
(( java.util.HashSet ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
return;
} // .end method
public final Boolean a ( ) {
/* .locals 2 */
/* iget v0, p0, Lav;->b:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void b ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lav;->b:I */
v0 = this.a;
(( java.util.HashSet ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/HashSet;->clear()V
return;
} // .end method
public final void c ( ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lav;->b:I */
v0 = this.a;
(( java.util.HashSet ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Lav; */
(( av ) v1 ).c ( ); // invoke-virtual {v1}, Lav;->c()V
} // :cond_0
return;
} // .end method
public final void d ( ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
/* iput v0, p0, Lav;->b:I */
v0 = this.a;
(( java.util.HashSet ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Lav; */
(( av ) v1 ).a ( ); // invoke-virtual {v1}, Lav;->a()V
} // :cond_0
return;
} // .end method
