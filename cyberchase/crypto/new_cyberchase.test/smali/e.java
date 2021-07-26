public class e implements java.lang.Iterable {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Le$c;, */
	 /* Le$f;, */
	 /* Le$d;, */
	 /* Le$b;, */
	 /* Le$a;, */
	 /* Le$e; */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<K:", */
/* "Ljava/lang/Object;", */
/* "V:", */
/* "Ljava/lang/Object;", */
/* ">", */
/* "Ljava/lang/Object;", */
/* "Ljava/lang/Iterable<", */
/* "Ljava/util/Map$Entry<", */
/* "TK;TV;>;>;" */
/* } */
} // .end annotation
/* # instance fields */
public Integer a;
public e$c a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le$c<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
} // .end field
public java.util.WeakHashMap a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/WeakHashMap<", */
/* "Le$f<", */
/* "TK;TV;>;", */
/* "Ljava/lang/Boolean;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public e$c b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le$c<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* new-instance v0, Ljava/util/WeakHashMap; */
/* invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V */
this.a = v0;
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Le;->a:I */
return;
} // .end method
static e$c a ( e p0 ) { //synthethic
/* .locals 0 */
p0 = this.a;
} // .end method
/* # virtual methods */
protected e$c a ( java.lang.Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;)", */
/* "Le$c<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
v0 = this.a;
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = this.a;
v1 = (( java.lang.Object ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_0 */
v0 = this.a;
} // :cond_0
} // .end method
protected final e$c a ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;TV;)", */
/* "Le$c<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
/* new-instance v0, Le$c; */
/* invoke-direct {v0, p1, p2}, Le$c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V */
/* iget p1, p0, Le;->a:I */
/* add-int/lit8 p1, p1, 0x1 */
/* iput p1, p0, Le;->a:I */
p1 = this.b;
/* if-nez p1, :cond_0 */
this.a = v0;
p1 = this.a;
this.b = p1;
} // :cond_0
this.a = v0;
this.b = p1;
this.b = v0;
} // .end method
public final e$d a ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le<", */
/* "TK;TV;>.d;" */
/* } */
} // .end annotation
/* new-instance v0, Le$d; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Le$d;-><init>(Le;B)V */
v1 = this.a;
v2 = java.lang.Boolean.FALSE;
(( java.util.WeakHashMap ) v1 ).put ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
public java.lang.Object a ( java.lang.Object p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;)TV;" */
/* } */
} // .end annotation
(( e ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le;->a(Ljava/lang/Object;)Le$c;
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
} // :cond_0
/* iget v1, p0, Le;->a:I */
/* add-int/lit8 v1, v1, -0x1 */
/* iput v1, p0, Le;->a:I */
v1 = this.a;
v1 = (( java.util.WeakHashMap ) v1 ).isEmpty ( ); // invoke-virtual {v1}, Ljava/util/WeakHashMap;->isEmpty()Z
/* if-nez v1, :cond_1 */
v1 = this.a;
(( java.util.WeakHashMap ) v1 ).keySet ( ); // invoke-virtual {v1}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Le$f; */
} // :cond_1
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = this.b;
v2 = this.a;
this.a = v2;
} // :cond_2
v1 = this.a;
this.a = v1;
} // :goto_1
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_3
v1 = this.a;
v2 = this.b;
this.b = v2;
} // :cond_3
v1 = this.b;
this.b = v1;
} // :goto_2
this.a = v0;
this.b = v0;
p1 = this.b;
} // .end method
public java.lang.Object a ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;TV;)TV;" */
/* } */
} // .end annotation
(( e ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le;->a(Ljava/lang/Object;)Le$c;
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = this.b;
} // :cond_0
(( e ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le;->a(Ljava/lang/Object;Ljava/lang/Object;)Le$c;
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 5 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, p0, :cond_0 */
} // :cond_0
/* instance-of v1, p1, Le; */
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_1 */
} // :cond_1
/* check-cast p1, Le; */
/* iget v1, p0, Le;->a:I */
/* iget v3, p1, Le;->a:I */
/* if-eq v1, v3, :cond_2 */
} // :cond_2
(( e ) p0 ).iterator ( ); // invoke-virtual {p0}, Le;->iterator()Ljava/util/Iterator;
(( e ) p1 ).iterator ( ); // invoke-virtual {p1}, Le;->iterator()Ljava/util/Iterator;
v3 = } // :cond_3
v3 = if ( v3 != null) { // if-eqz v3, :cond_6
if ( v3 != null) { // if-eqz v3, :cond_6
/* check-cast v3, Ljava/util/Map$Entry; */
/* if-nez v3, :cond_4 */
/* if-nez v4, :cond_5 */
} // :cond_4
v3 = if ( v3 != null) { // if-eqz v3, :cond_3
/* if-nez v3, :cond_3 */
} // :cond_5
v1 = } // :cond_6
p1 = /* if-nez v1, :cond_7 */
/* if-nez p1, :cond_7 */
} // :cond_7
} // .end method
public java.util.Iterator iterator ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Iterator<", */
/* "Ljava/util/Map$Entry<", */
/* "TK;TV;>;>;" */
/* } */
} // .end annotation
/* new-instance v0, Le$a; */
v1 = this.a;
v2 = this.b;
/* invoke-direct {v0, v1, v2}, Le$a;-><init>(Le$c;Le$c;)V */
v1 = this.a;
v2 = java.lang.Boolean.FALSE;
(( java.util.WeakHashMap ) v1 ).put ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "["; // const-string v1, "["
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e ) p0 ).iterator ( ); // invoke-virtual {p0}, Le;->iterator()Ljava/util/Iterator;
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Ljava/util/Map$Entry; */
(( java.lang.Object ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
v2 = (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
if ( v2 != null) { // if-eqz v2, :cond_0
final String v2 = ", "; // const-string v2, ", "
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_1
final String v1 = "]"; // const-string v1, "]"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
