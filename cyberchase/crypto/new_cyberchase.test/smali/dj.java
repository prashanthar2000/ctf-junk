public class dj extends du implements java.util.Map {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<K:", */
	 /* "Ljava/lang/Object;", */
	 /* "V:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ldu<", */
	 /* "TK;TV;>;", */
	 /* "Ljava/util/Map<", */
	 /* "TK;TV;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
dq a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ldq<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public dj ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ldu;-><init>()V */
return;
} // .end method
private dq a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ldq<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
v0 = this.a;
/* if-nez v0, :cond_0 */
/* new-instance v0, Ldj$1; */
/* invoke-direct {v0, p0}, Ldj$1;-><init>(Ldj;)V */
this.a = v0;
} // :cond_0
v0 = this.a;
} // .end method
/* # virtual methods */
public java.util.Set entrySet ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set<", */
/* "Ljava/util/Map$Entry<", */
/* "TK;TV;>;>;" */
/* } */
} // .end annotation
/* invoke-direct {p0}, Ldj;->a()Ldq; */
v1 = this.a;
/* if-nez v1, :cond_0 */
/* new-instance v1, Ldq$b; */
/* invoke-direct {v1, v0}, Ldq$b;-><init>(Ldq;)V */
this.a = v1;
} // :cond_0
v0 = this.a;
} // .end method
public java.util.Set keySet ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set<", */
/* "TK;>;" */
/* } */
} // .end annotation
/* invoke-direct {p0}, Ldj;->a()Ldq; */
(( dq ) v0 ).a ( ); // invoke-virtual {v0}, Ldq;->a()Ljava/util/Set;
} // .end method
public void putAll ( java.util.Map p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map<", */
/* "+TK;+TV;>;)V" */
/* } */
} // .end annotation
v1 = /* iget v0, p0, Ldj;->c:I */
/* add-int/2addr v0, v1 */
/* iget v1, p0, Ldu;->c:I */
v2 = this.a;
/* array-length v2, v2 */
/* if-ge v2, v0, :cond_1 */
v2 = this.a;
v3 = this.c;
/* invoke-super {p0, v0}, Ldu;->a(I)V */
/* iget v0, p0, Ldu;->c:I */
/* if-lez v0, :cond_0 */
v0 = this.a;
int v4 = 0; // const/4 v4, 0x0
java.lang.System .arraycopy ( v2,v4,v0,v4,v1 );
v0 = this.c;
/* shl-int/lit8 v5, v1, 0x1 */
java.lang.System .arraycopy ( v3,v4,v0,v4,v5 );
} // :cond_0
du .a ( v2,v3,v1 );
} // :cond_1
/* iget v0, p0, Ldu;->c:I */
/* if-ne v0, v1, :cond_3 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_2
/* check-cast v0, Ljava/util/Map$Entry; */
(( dj ) p0 ).put ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Ldj;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_2
return;
} // :cond_3
/* new-instance p1, Ljava/util/ConcurrentModificationException; */
/* invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V */
/* throw p1 */
return;
} // .end method
public java.util.Collection values ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Collection<", */
/* "TV;>;" */
/* } */
} // .end annotation
/* invoke-direct {p0}, Ldj;->a()Ldq; */
v1 = this.a;
/* if-nez v1, :cond_0 */
/* new-instance v1, Ldq$e; */
/* invoke-direct {v1, v0}, Ldq$e;-><init>(Ldq;)V */
this.a = v1;
} // :cond_0
v0 = this.a;
} // .end method
