abstract class e$e implements e$f implements java.util.Iterator {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Le; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x408 */
/* name = "e" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<K:", */
/* "Ljava/lang/Object;", */
/* "V:", */
/* "Ljava/lang/Object;", */
/* ">", */
/* "Ljava/lang/Object;", */
/* "Le$f<", */
/* "TK;TV;>;", */
/* "Ljava/util/Iterator<", */
/* "Ljava/util/Map$Entry<", */
/* "TK;TV;>;>;" */
/* } */
} // .end annotation
/* # instance fields */
e$c a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le$c<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
} // .end field
e$c b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le$c<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
 e$e ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le$c<", */
/* "TK;TV;>;", */
/* "Le$c<", */
/* "TK;TV;>;)V" */
/* } */
} // .end annotation
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
this.a = p2;
this.b = p1;
return;
} // .end method
private e$c a ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le$c<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
v0 = this.b;
v1 = this.a;
/* if-eq v0, v1, :cond_1 */
/* if-nez v1, :cond_0 */
} // :cond_0
(( e$e ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le$e;->a(Le$c;)Le$c;
} // :cond_1
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
/* # virtual methods */
abstract e$c a ( e$c p0 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le$c<", */
/* "TK;TV;>;)", */
/* "Le$c<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
} // .end method
public final void a ( e$c p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le$c<", */
/* "TK;TV;>;)V" */
/* } */
} // .end annotation
v0 = this.a;
/* if-ne v0, p1, :cond_0 */
v0 = this.b;
/* if-ne p1, v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
this.b = v0;
this.a = v0;
} // :cond_0
v0 = this.a;
/* if-ne v0, p1, :cond_1 */
(( e$e ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le$e;->b(Le$c;)Le$c;
this.a = v0;
} // :cond_1
v0 = this.b;
/* if-ne v0, p1, :cond_2 */
/* invoke-direct {p0}, Le$e;->a()Le$c; */
this.b = p1;
} // :cond_2
return;
} // .end method
abstract e$c b ( e$c p0 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le$c<", */
/* "TK;TV;>;)", */
/* "Le$c<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
} // .end method
public Boolean hasNext ( ) {
/* .locals 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.Object next ( ) { //synthethic
/* .locals 2 */
v0 = this.b;
/* invoke-direct {p0}, Le$e;->a()Le$c; */
this.b = v1;
} // .end method
