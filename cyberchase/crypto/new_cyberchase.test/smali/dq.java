public abstract class dq {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Ldq$e;, */
	 /* Ldq$c;, */
	 /* Ldq$b;, */
	 /* Ldq$d;, */
	 /* Ldq$a; */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<K:", */
/* "Ljava/lang/Object;", */
/* "V:", */
/* "Ljava/lang/Object;", */
/* ">", */
/* "Ljava/lang/Object;" */
/* } */
} // .end annotation
/* # instance fields */
dq$b a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ldq<", */
/* "TK;TV;>.b;" */
/* } */
} // .end annotation
} // .end field
dq$c a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ldq<", */
/* "TK;TV;>.c;" */
/* } */
} // .end annotation
} // .end field
dq$e a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ldq<", */
/* "TK;TV;>.e;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
 dq ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static Boolean a ( java.util.Map p0, java.util.Collection p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<K:", */
/* "Ljava/lang/Object;", */
/* "V:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/util/Map<", */
/* "TK;TV;>;", */
/* "Ljava/util/Collection<", */
/* "*>;)Z" */
/* } */
v0 = } // .end annotation
} // :cond_0
v2 = } // :goto_0
v2 = if ( v2 != null) { // if-eqz v2, :cond_1
/* if-nez v2, :cond_0 */
p0 = } // :cond_1
/* if-eq v0, p0, :cond_2 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_2
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Boolean a ( java.util.Set p0, java.lang.Object p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/util/Set<", */
/* "TT;>;", */
/* "Ljava/lang/Object;", */
/* ")Z" */
/* } */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
/* if-ne p0, p1, :cond_0 */
} // :cond_0
/* instance-of v1, p1, Ljava/util/Set; */
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast p1, Ljava/util/Set; */
v3 = v1 = try { // :try_start_0
p0 = /* if-ne v1, v3, :cond_1 */
/* :try_end_0 */
/* .catch Ljava/lang/NullPointerException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/ClassCastException; {:try_start_0 ..:try_end_0} :catch_0 */
if ( p0 != null) { // if-eqz p0, :cond_1
/* :catch_0 */
} // :cond_1
} // .end method
/* # virtual methods */
protected abstract Integer a ( ) {
} // .end method
protected abstract Integer a ( java.lang.Object p0 ) {
} // .end method
protected abstract java.lang.Object a ( Integer p0, Integer p1 ) {
} // .end method
protected abstract java.lang.Object a ( Integer p0, java.lang.Object p1 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(ITV;)TV;" */
/* } */
} // .end annotation
} // .end method
protected abstract java.util.Map a ( ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
} // .end method
public final java.util.Set a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set<", */
/* "TK;>;" */
/* } */
} // .end annotation
v0 = this.a;
/* if-nez v0, :cond_0 */
/* new-instance v0, Ldq$c; */
/* invoke-direct {v0, p0}, Ldq$c;-><init>(Ldq;)V */
this.a = v0;
} // :cond_0
v0 = this.a;
} // .end method
protected abstract void a ( ) {
} // .end method
protected abstract void a ( Integer p0 ) {
} // .end method
protected abstract void a ( java.lang.Object p0, java.lang.Object p1 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;TV;)V" */
/* } */
} // .end annotation
} // .end method
public final java.lang.Object a ( Integer p0 ) {
/* .locals 4 */
v0 = (( dq ) p0 ).a ( ); // invoke-virtual {p0}, Ldq;->a()I
/* new-array v1, v0, [Ljava/lang/Object; */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_0 */
(( dq ) p0 ).a ( v2, p1 ); // invoke-virtual {p0, v2, p1}, Ldq;->a(II)Ljava/lang/Object;
/* aput-object v3, v1, v2 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
} // .end method
public final java.lang.Object a ( java.lang.Object[] p0, Integer p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">([TT;I)[TT;" */
/* } */
} // .end annotation
v0 = (( dq ) p0 ).a ( ); // invoke-virtual {p0}, Ldq;->a()I
/* array-length v1, p1 */
/* if-ge v1, v0, :cond_0 */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) p1 ).getComponentType ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
java.lang.reflect.Array .newInstance ( p1,v0 );
/* check-cast p1, [Ljava/lang/Object; */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
(( dq ) p0 ).a ( v1, p2 ); // invoke-virtual {p0, v1, p2}, Ldq;->a(II)Ljava/lang/Object;
/* aput-object v2, p1, v1 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
/* array-length p2, p1 */
/* if-le p2, v0, :cond_2 */
int p2 = 0; // const/4 p2, 0x0
/* aput-object p2, p1, v0 */
} // :cond_2
} // .end method
protected abstract Integer b ( java.lang.Object p0 ) {
} // .end method
