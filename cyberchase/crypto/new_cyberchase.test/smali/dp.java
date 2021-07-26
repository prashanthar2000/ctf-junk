public class dp {
	 /* # annotations */
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
private Integer a;
private final java.util.LinkedHashMap a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/LinkedHashMap<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
} // .end field
private Integer b;
private Integer c;
private Integer d;
private Integer e;
private Integer f;
/* # direct methods */
public dp ( ) {
/* .locals 3 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* if-lez p1, :cond_0 */
/* iput p1, p0, Ldp;->b:I */
/* new-instance p1, Ljava/util/LinkedHashMap; */
int v0 = 0; // const/4 v0, 0x0
/* const/high16 v1, 0x3f400000 # 0.75f */
int v2 = 1; // const/4 v2, 0x1
/* invoke-direct {p1, v0, v1, v2}, Ljava/util/LinkedHashMap;-><init>(IFZ)V */
this.a = p1;
return;
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "maxSize <= 0"; // const-string v0, "maxSize <= 0"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
private void a ( Integer p0 ) {
/* .locals 2 */
} // :goto_0
/* monitor-enter p0 */
try { // :try_start_0
/* iget v0, p0, Ldp;->a:I */
/* if-ltz v0, :cond_3 */
v0 = this.a;
v0 = (( java.util.LinkedHashMap ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Ldp;->a:I */
/* if-nez v0, :cond_3 */
} // :cond_0
/* iget v0, p0, Ldp;->a:I */
/* if-le v0, p1, :cond_2 */
v0 = this.a;
v0 = (( java.util.LinkedHashMap ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_1
v0 = this.a;
(( java.util.LinkedHashMap ) v0 ).entrySet ( ); // invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;
/* check-cast v0, Ljava/util/Map$Entry; */
v0 = this.a;
(( java.util.LinkedHashMap ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* iget v0, p0, Ldp;->a:I */
/* add-int/lit8 v0, v0, -0x1 */
/* iput v0, p0, Ldp;->a:I */
/* iget v0, p0, Ldp;->d:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Ldp;->d:I */
/* monitor-exit p0 */
} // :cond_2
} // :goto_1
/* monitor-exit p0 */
return;
} // :cond_3
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ".sizeOf() is reporting inconsistent results!"; // const-string v1, ".sizeOf() is reporting inconsistent results!"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
return;
} // .end method
/* # virtual methods */
public final java.lang.Object a ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;)TV;" */
/* } */
} // .end annotation
if ( p1 != null) { // if-eqz p1, :cond_1
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.a;
(( java.util.LinkedHashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
if ( p1 != null) { // if-eqz p1, :cond_0
/* iget v0, p0, Ldp;->e:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Ldp;->e:I */
/* monitor-exit p0 */
} // :cond_0
/* iget p1, p0, Ldp;->f:I */
/* add-int/lit8 p1, p1, 0x1 */
/* iput p1, p0, Ldp;->f:I */
/* monitor-exit p0 */
int p1 = 0; // const/4 p1, 0x0
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // :cond_1
/* new-instance p1, Ljava/lang/NullPointerException; */
final String v0 = "key == null"; // const-string v0, "key == null"
/* invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final java.lang.Object a ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;TV;)TV;" */
/* } */
} // .end annotation
if ( p1 != null) { // if-eqz p1, :cond_1
if ( p2 != null) { // if-eqz p2, :cond_1
/* monitor-enter p0 */
try { // :try_start_0
/* iget v0, p0, Ldp;->c:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Ldp;->c:I */
/* iget v0, p0, Ldp;->a:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Ldp;->a:I */
v0 = this.a;
(( java.util.LinkedHashMap ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
if ( p1 != null) { // if-eqz p1, :cond_0
/* iget p2, p0, Ldp;->a:I */
/* add-int/lit8 p2, p2, -0x1 */
/* iput p2, p0, Ldp;->a:I */
} // :cond_0
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* iget p2, p0, Ldp;->b:I */
/* invoke-direct {p0, p2}, Ldp;->a(I)V */
/* :catchall_0 */
/* move-exception p1 */
try { // :try_start_1
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw p1 */
} // :cond_1
/* new-instance p1, Ljava/lang/NullPointerException; */
final String p2 = "key == null || value == null"; // const-string p2, "key == null || value == null"
/* invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public synchronized final java.lang.String toString ( ) {
/* .locals 6 */
/* monitor-enter p0 */
try { // :try_start_0
/* iget v0, p0, Ldp;->e:I */
/* iget v1, p0, Ldp;->f:I */
/* add-int/2addr v0, v1 */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v2, p0, Ldp;->e:I */
/* mul-int/lit8 v2, v2, 0x64 */
/* div-int v0, v2, v0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v2 = java.util.Locale.US;
final String v3 = "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]"; // const-string v3, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]"
int v4 = 4; // const/4 v4, 0x4
/* new-array v4, v4, [Ljava/lang/Object; */
/* iget v5, p0, Ldp;->b:I */
java.lang.Integer .valueOf ( v5 );
/* aput-object v5, v4, v1 */
int v1 = 1; // const/4 v1, 0x1
/* iget v5, p0, Ldp;->e:I */
java.lang.Integer .valueOf ( v5 );
/* aput-object v5, v4, v1 */
int v1 = 2; // const/4 v1, 0x2
/* iget v5, p0, Ldp;->f:I */
java.lang.Integer .valueOf ( v5 );
/* aput-object v5, v4, v1 */
int v1 = 3; // const/4 v1, 0x3
java.lang.Integer .valueOf ( v0 );
/* aput-object v0, v4, v1 */
java.lang.String .format ( v2,v3,v4 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
