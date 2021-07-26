public class du {
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
/* # static fields */
static Integer a;
static java.lang.Object a;
static Integer b;
static java.lang.Object b;
/* # instance fields */
 a;
Integer c;
java.lang.Object c;
/* # direct methods */
public du ( ) {
	 /* .locals 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 v0 = dl.a;
	 this.a = v0;
	 v0 = dl.a;
	 this.c = v0;
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput v0, p0, Ldu;->c:I */
	 return;
} // .end method
private Integer a ( ) {
	 /* .locals 6 */
	 /* iget v0, p0, Ldu;->c:I */
	 int v1 = -1; // const/4 v1, -0x1
	 /* if-nez v0, :cond_0 */
} // :cond_0
v2 = this.a;
int v3 = 0; // const/4 v3, 0x0
v2 = du .a ( v2,v0,v3 );
/* if-gez v2, :cond_1 */
} // :cond_1
v3 = this.c;
/* shl-int/lit8 v4, v2, 0x1 */
/* aget-object v3, v3, v4 */
/* if-nez v3, :cond_2 */
} // :cond_2
/* add-int/lit8 v3, v2, 0x1 */
} // :goto_0
/* if-ge v3, v0, :cond_4 */
v4 = this.a;
/* aget v4, v4, v3 */
/* if-nez v4, :cond_4 */
v4 = this.c;
/* shl-int/lit8 v5, v3, 0x1 */
/* aget-object v4, v4, v5 */
/* if-nez v4, :cond_3 */
} // :cond_3
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_4
/* add-int/lit8 v2, v2, -0x1 */
} // :goto_1
/* if-ltz v2, :cond_6 */
v0 = this.a;
/* aget v0, v0, v2 */
/* if-nez v0, :cond_6 */
v0 = this.c;
/* shl-int/lit8 v4, v2, 0x1 */
/* aget-object v0, v0, v4 */
/* if-nez v0, :cond_5 */
} // :cond_5
/* add-int/lit8 v2, v2, -0x1 */
} // :cond_6
/* xor-int/lit8 v0, v3, -0x1 */
} // .end method
private Integer a ( java.lang.Object p0, Integer p1 ) {
/* .locals 6 */
/* iget v0, p0, Ldu;->c:I */
int v1 = -1; // const/4 v1, -0x1
/* if-nez v0, :cond_0 */
} // :cond_0
v2 = this.a;
v2 = du .a ( v2,v0,p2 );
/* if-gez v2, :cond_1 */
} // :cond_1
v3 = this.c;
/* shl-int/lit8 v4, v2, 0x1 */
/* aget-object v3, v3, v4 */
v3 = (( java.lang.Object ) p1 ).equals ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_2
} // :cond_2
/* add-int/lit8 v3, v2, 0x1 */
} // :goto_0
/* if-ge v3, v0, :cond_4 */
v4 = this.a;
/* aget v4, v4, v3 */
/* if-ne v4, p2, :cond_4 */
v4 = this.c;
/* shl-int/lit8 v5, v3, 0x1 */
/* aget-object v4, v4, v5 */
v4 = (( java.lang.Object ) p1 ).equals ( v4 ); // invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_3
} // :cond_3
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_4
/* add-int/lit8 v2, v2, -0x1 */
} // :goto_1
/* if-ltz v2, :cond_6 */
v0 = this.a;
/* aget v0, v0, v2 */
/* if-ne v0, p2, :cond_6 */
v0 = this.c;
/* shl-int/lit8 v4, v2, 0x1 */
/* aget-object v0, v0, v4 */
v0 = (( java.lang.Object ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_5
} // :cond_5
/* add-int/lit8 v2, v2, -0x1 */
} // :cond_6
/* xor-int/lit8 p1, v3, -0x1 */
} // .end method
private static Integer a ( Integer[] p0, Integer p1, Integer p2 ) {
/* .locals 0 */
try { // :try_start_0
p0 = dl .a ( p0,p1,p2 );
/* :try_end_0 */
/* .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* new-instance p0, Ljava/util/ConcurrentModificationException; */
/* invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V */
/* throw p0 */
} // .end method
static void a ( Integer[] p0, java.lang.Object[] p1, Integer p2 ) {
/* .locals 7 */
/* array-length v0, p0 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 2; // const/4 v2, 0x2
int v3 = 0; // const/4 v3, 0x0
/* const/16 v4, 0xa */
int v5 = 1; // const/4 v5, 0x1
/* const/16 v6, 0x8 */
/* if-ne v0, v6, :cond_2 */
/* const-class v0, Ldj; */
/* monitor-enter v0 */
try { // :try_start_0
/* if-ge v6, v4, :cond_1 */
v4 = du.b;
/* aput-object v4, p1, v3 */
/* aput-object p0, p1, v5 */
/* shl-int/lit8 p0, p2, 0x1 */
/* sub-int/2addr p0, v5 */
} // :goto_0
/* if-lt p0, v2, :cond_0 */
/* aput-object v1, p1, p0 */
/* add-int/lit8 p0, p0, -0x1 */
} // :cond_0
/* add-int/2addr p0, v5 */
} // :cond_1
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p0 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p0 */
} // :cond_2
/* array-length v0, p0 */
int v6 = 4; // const/4 v6, 0x4
/* if-ne v0, v6, :cond_5 */
/* const-class v0, Ldj; */
/* monitor-enter v0 */
try { // :try_start_1
/* if-ge v6, v4, :cond_4 */
v4 = du.a;
/* aput-object v4, p1, v3 */
/* aput-object p0, p1, v5 */
/* shl-int/lit8 p0, p2, 0x1 */
/* sub-int/2addr p0, v5 */
} // :goto_1
/* if-lt p0, v2, :cond_3 */
/* aput-object v1, p1, p0 */
/* add-int/lit8 p0, p0, -0x1 */
} // :cond_3
/* add-int/2addr p0, v5 */
} // :cond_4
/* monitor-exit v0 */
return;
/* :catchall_1 */
/* move-exception p0 */
/* monitor-exit v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* throw p0 */
} // :cond_5
return;
} // .end method
/* # virtual methods */
public final Integer a ( java.lang.Object p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
p1 = /* invoke-direct {p0}, Ldu;->a()I */
} // :cond_0
v0 = (( java.lang.Object ) p1 ).hashCode ( ); // invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
p1 = /* invoke-direct {p0, p1, v0}, Ldu;->a(Ljava/lang/Object;I)I */
} // .end method
public final java.lang.Object a ( Integer p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I)TK;" */
/* } */
} // .end annotation
v0 = this.c;
/* shl-int/lit8 p1, p1, 0x1 */
/* aget-object p1, v0, p1 */
} // .end method
final void a ( Integer p0 ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* const/16 v3, 0x8 */
/* if-ne p1, v3, :cond_1 */
/* const-class v3, Ldj; */
/* monitor-enter v3 */
try { // :try_start_0
v4 = du.b;
if ( v4 != null) { // if-eqz v4, :cond_0
p1 = du.b;
this.c = p1;
/* aget-object v4, p1, v1 */
/* check-cast v4, [Ljava/lang/Object; */
/* check-cast v4, [Ljava/lang/Object; */
/* aget-object v4, p1, v2 */
/* check-cast v4, [I */
/* check-cast v4, [I */
this.a = v4;
/* aput-object v0, p1, v2 */
/* aput-object v0, p1, v1 */
/* sub-int/2addr p1, v2 */
/* monitor-exit v3 */
return;
} // :cond_0
/* monitor-exit v3 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v3 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // :cond_1
int v3 = 4; // const/4 v3, 0x4
/* if-ne p1, v3, :cond_3 */
/* const-class v3, Ldj; */
/* monitor-enter v3 */
try { // :try_start_1
v4 = du.a;
if ( v4 != null) { // if-eqz v4, :cond_2
p1 = du.a;
this.c = p1;
/* aget-object v4, p1, v1 */
/* check-cast v4, [Ljava/lang/Object; */
/* check-cast v4, [Ljava/lang/Object; */
/* aget-object v4, p1, v2 */
/* check-cast v4, [I */
/* check-cast v4, [I */
this.a = v4;
/* aput-object v0, p1, v2 */
/* aput-object v0, p1, v1 */
/* sub-int/2addr p1, v2 */
/* monitor-exit v3 */
return;
} // :cond_2
/* monitor-exit v3 */
/* :catchall_1 */
/* move-exception p1 */
/* monitor-exit v3 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* throw p1 */
} // :cond_3
} // :goto_0
/* new-array v0, p1, [I */
this.a = v0;
/* shl-int/2addr p1, v2 */
/* new-array p1, p1, [Ljava/lang/Object; */
this.c = p1;
return;
} // .end method
final Integer b ( java.lang.Object p0 ) {
/* .locals 5 */
/* iget v0, p0, Ldu;->c:I */
/* mul-int/lit8 v0, v0, 0x2 */
v1 = this.c;
int v2 = 1; // const/4 v2, 0x1
/* if-nez p1, :cond_1 */
int p1 = 1; // const/4 p1, 0x1
} // :goto_0
/* if-ge p1, v0, :cond_3 */
/* aget-object v3, v1, p1 */
/* if-nez v3, :cond_0 */
/* shr-int/2addr p1, v2 */
} // :cond_0
/* add-int/lit8 p1, p1, 0x2 */
} // :cond_1
int v3 = 1; // const/4 v3, 0x1
} // :goto_1
/* if-ge v3, v0, :cond_3 */
/* aget-object v4, v1, v3 */
v4 = (( java.lang.Object ) p1 ).equals ( v4 ); // invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_2
/* shr-int/lit8 p1, v3, 0x1 */
} // :cond_2
/* add-int/lit8 v3, v3, 0x2 */
} // :cond_3
int p1 = -1; // const/4 p1, -0x1
} // .end method
public final java.lang.Object b ( Integer p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I)TV;" */
/* } */
} // .end annotation
v0 = this.c;
/* shl-int/lit8 p1, p1, 0x1 */
/* add-int/lit8 p1, p1, 0x1 */
/* aget-object p1, v0, p1 */
} // .end method
public final java.lang.Object c ( Integer p0 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I)TV;" */
/* } */
} // .end annotation
v0 = this.c;
/* shl-int/lit8 v1, p1, 0x1 */
/* add-int/lit8 v2, v1, 0x1 */
/* aget-object v2, v0, v2 */
/* iget v3, p0, Ldu;->c:I */
int v4 = 0; // const/4 v4, 0x0
int v5 = 1; // const/4 v5, 0x1
/* if-gt v3, v5, :cond_0 */
p1 = this.a;
du .a ( p1,v0,v3 );
p1 = dl.a;
this.a = p1;
p1 = dl.a;
this.c = p1;
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
/* add-int/lit8 v0, v3, -0x1 */
v6 = this.a;
/* array-length v7, v6 */
/* const/16 v8, 0x8 */
/* if-le v7, v8, :cond_4 */
/* array-length v6, v6 */
/* div-int/lit8 v6, v6, 0x3 */
/* if-ge v3, v6, :cond_4 */
/* if-le v3, v8, :cond_1 */
/* shr-int/lit8 v6, v3, 0x1 */
/* add-int v8, v3, v6 */
} // :cond_1
v6 = this.a;
v7 = this.c;
(( du ) p0 ).a ( v8 ); // invoke-virtual {p0, v8}, Ldu;->a(I)V
/* iget v8, p0, Ldu;->c:I */
/* if-ne v3, v8, :cond_3 */
/* if-lez p1, :cond_2 */
v8 = this.a;
java.lang.System .arraycopy ( v6,v4,v8,v4,p1 );
v8 = this.c;
java.lang.System .arraycopy ( v7,v4,v8,v4,v1 );
} // :cond_2
/* if-ge p1, v0, :cond_6 */
/* add-int/lit8 v4, p1, 0x1 */
v8 = this.a;
/* sub-int v9, v0, p1 */
java.lang.System .arraycopy ( v6,v4,v8,p1,v9 );
/* shl-int/lit8 p1, v4, 0x1 */
v4 = this.c;
/* shl-int/lit8 v5, v9, 0x1 */
java.lang.System .arraycopy ( v7,p1,v4,v1,v5 );
} // :cond_3
/* new-instance p1, Ljava/util/ConcurrentModificationException; */
/* invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V */
/* throw p1 */
} // :cond_4
/* if-ge p1, v0, :cond_5 */
v4 = this.a;
/* add-int/lit8 v6, p1, 0x1 */
/* sub-int v7, v0, p1 */
java.lang.System .arraycopy ( v4,v6,v4,p1,v7 );
p1 = this.c;
/* shl-int/lit8 v4, v6, 0x1 */
/* shl-int/lit8 v6, v7, 0x1 */
java.lang.System .arraycopy ( p1,v4,p1,v1,v6 );
} // :cond_5
p1 = this.c;
/* shl-int/lit8 v1, v0, 0x1 */
int v4 = 0; // const/4 v4, 0x0
/* aput-object v4, p1, v1 */
/* add-int/2addr v1, v5 */
/* aput-object v4, p1, v1 */
} // :cond_6
} // :goto_0
/* iget p1, p0, Ldu;->c:I */
/* if-ne v3, p1, :cond_7 */
/* iput v0, p0, Ldu;->c:I */
} // :cond_7
/* new-instance p1, Ljava/util/ConcurrentModificationException; */
/* invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V */
/* throw p1 */
} // .end method
public void clear ( ) {
/* .locals 4 */
/* iget v0, p0, Ldu;->c:I */
/* if-lez v0, :cond_0 */
v1 = this.a;
v2 = this.c;
v3 = dl.a;
this.a = v3;
v3 = dl.a;
this.c = v3;
int v3 = 0; // const/4 v3, 0x0
/* iput v3, p0, Ldu;->c:I */
du .a ( v1,v2,v0 );
} // :cond_0
/* iget v0, p0, Ldu;->c:I */
/* if-gtz v0, :cond_1 */
return;
} // :cond_1
/* new-instance v0, Ljava/util/ConcurrentModificationException; */
/* invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V */
/* throw v0 */
} // .end method
public Boolean containsKey ( java.lang.Object p0 ) {
/* .locals 0 */
p1 = (( du ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Ldu;->a(Ljava/lang/Object;)I
/* if-ltz p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean containsValue ( java.lang.Object p0 ) {
/* .locals 0 */
p1 = (( du ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Ldu;->b(Ljava/lang/Object;)I
/* if-ltz p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 6 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p0, p1, :cond_0 */
} // :cond_0
/* instance-of v1, p1, Ldu; */
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_6
/* check-cast p1, Ldu; */
v1 = (( du ) p0 ).size ( ); // invoke-virtual {p0}, Ldu;->size()I
v3 = (( du ) p1 ).size ( ); // invoke-virtual {p1}, Ldu;->size()I
/* if-eq v1, v3, :cond_1 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
try { // :try_start_0
/* iget v3, p0, Ldu;->c:I */
/* if-ge v1, v3, :cond_5 */
(( du ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Ldu;->a(I)Ljava/lang/Object;
(( du ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Ldu;->b(I)Ljava/lang/Object;
(( du ) p1 ).get ( v3 ); // invoke-virtual {p1, v3}, Ldu;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* if-nez v4, :cond_3 */
/* if-nez v5, :cond_2 */
v3 = (( du ) p1 ).containsKey ( v3 ); // invoke-virtual {p1, v3}, Ldu;->containsKey(Ljava/lang/Object;)Z
/* if-nez v3, :cond_4 */
} // :cond_2
} // :cond_3
v3 = (( java.lang.Object ) v4 ).equals ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* :try_end_0 */
/* .catch Ljava/lang/NullPointerException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/ClassCastException; {:try_start_0 ..:try_end_0} :catch_0 */
/* if-nez v3, :cond_4 */
} // :cond_4
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_5
/* :catch_0 */
} // :cond_6
/* instance-of v1, p1, Ljava/util/Map; */
if ( v1 != null) { // if-eqz v1, :cond_c
/* check-cast p1, Ljava/util/Map; */
v3 = v1 = (( du ) p0 ).size ( ); // invoke-virtual {p0}, Ldu;->size()I
/* if-eq v1, v3, :cond_7 */
} // :cond_7
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
try { // :try_start_1
/* iget v3, p0, Ldu;->c:I */
/* if-ge v1, v3, :cond_b */
(( du ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Ldu;->a(I)Ljava/lang/Object;
(( du ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Ldu;->b(I)Ljava/lang/Object;
/* if-nez v4, :cond_9 */
v3 = /* if-nez v5, :cond_8 */
/* if-nez v3, :cond_a */
} // :cond_8
} // :cond_9
v3 = (( java.lang.Object ) v4 ).equals ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* :try_end_1 */
/* .catch Ljava/lang/NullPointerException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/lang/ClassCastException; {:try_start_1 ..:try_end_1} :catch_1 */
/* if-nez v3, :cond_a */
} // :cond_a
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_b
/* :catch_1 */
} // :cond_c
} // .end method
public java.lang.Object get ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Object;", */
/* ")TV;" */
/* } */
} // .end annotation
p1 = (( du ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Ldu;->a(Ljava/lang/Object;)I
/* if-ltz p1, :cond_0 */
v0 = this.c;
/* shl-int/lit8 p1, p1, 0x1 */
/* add-int/lit8 p1, p1, 0x1 */
/* aget-object p1, v0, p1 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Integer hashCode ( ) {
/* .locals 9 */
v0 = this.a;
v1 = this.c;
/* iget v2, p0, Ldu;->c:I */
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
int v3 = 0; // const/4 v3, 0x0
int v5 = 0; // const/4 v5, 0x0
int v6 = 1; // const/4 v6, 0x1
} // :goto_0
/* if-ge v3, v2, :cond_1 */
/* aget-object v7, v1, v6 */
/* aget v8, v0, v3 */
/* if-nez v7, :cond_0 */
int v7 = 0; // const/4 v7, 0x0
} // :cond_0
v7 = (( java.lang.Object ) v7 ).hashCode ( ); // invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I
} // :goto_1
/* xor-int/2addr v7, v8 */
/* add-int/2addr v5, v7 */
/* add-int/lit8 v3, v3, 0x1 */
/* add-int/lit8 v6, v6, 0x2 */
} // :cond_1
} // .end method
public Boolean isEmpty ( ) {
/* .locals 1 */
/* iget v0, p0, Ldu;->c:I */
/* if-gtz v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.Object put ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;TV;)TV;" */
/* } */
} // .end annotation
/* iget v0, p0, Ldu;->c:I */
int v1 = 0; // const/4 v1, 0x0
/* if-nez p1, :cond_0 */
v2 = /* invoke-direct {p0}, Ldu;->a()I */
int v3 = 0; // const/4 v3, 0x0
} // :cond_0
v2 = (( java.lang.Object ) p1 ).hashCode ( ); // invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
v3 = /* invoke-direct {p0, p1, v2}, Ldu;->a(Ljava/lang/Object;I)I */
/* move v8, v3 */
/* move v3, v2 */
/* move v2, v8 */
} // :goto_0
/* if-ltz v2, :cond_1 */
/* shl-int/lit8 p1, v2, 0x1 */
/* add-int/lit8 p1, p1, 0x1 */
v0 = this.c;
/* aget-object v1, v0, p1 */
/* aput-object p2, v0, p1 */
} // :cond_1
/* xor-int/lit8 v2, v2, -0x1 */
v4 = this.a;
/* array-length v4, v4 */
/* if-lt v0, v4, :cond_6 */
int v4 = 4; // const/4 v4, 0x4
/* const/16 v5, 0x8 */
/* if-lt v0, v5, :cond_2 */
/* shr-int/lit8 v4, v0, 0x1 */
/* add-int/2addr v4, v0 */
} // :cond_2
/* if-lt v0, v4, :cond_3 */
/* const/16 v4, 0x8 */
} // :cond_3
} // :goto_1
v5 = this.a;
v6 = this.c;
(( du ) p0 ).a ( v4 ); // invoke-virtual {p0, v4}, Ldu;->a(I)V
/* iget v4, p0, Ldu;->c:I */
/* if-ne v0, v4, :cond_5 */
v4 = this.a;
/* array-length v7, v4 */
/* if-lez v7, :cond_4 */
/* array-length v7, v5 */
java.lang.System .arraycopy ( v5,v1,v4,v1,v7 );
v4 = this.c;
/* array-length v7, v6 */
java.lang.System .arraycopy ( v6,v1,v4,v1,v7 );
} // :cond_4
du .a ( v5,v6,v0 );
} // :cond_5
/* new-instance p1, Ljava/util/ConcurrentModificationException; */
/* invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V */
/* throw p1 */
} // :cond_6
} // :goto_2
/* if-ge v2, v0, :cond_7 */
v1 = this.a;
/* add-int/lit8 v4, v2, 0x1 */
/* sub-int v5, v0, v2 */
java.lang.System .arraycopy ( v1,v2,v1,v4,v5 );
v1 = this.c;
/* shl-int/lit8 v5, v2, 0x1 */
/* shl-int/lit8 v4, v4, 0x1 */
/* iget v6, p0, Ldu;->c:I */
/* sub-int/2addr v6, v2 */
/* shl-int/lit8 v6, v6, 0x1 */
java.lang.System .arraycopy ( v1,v5,v1,v4,v6 );
} // :cond_7
/* iget v1, p0, Ldu;->c:I */
/* if-ne v0, v1, :cond_8 */
v0 = this.a;
/* array-length v4, v0 */
/* if-ge v2, v4, :cond_8 */
/* aput v3, v0, v2 */
v0 = this.c;
/* shl-int/lit8 v2, v2, 0x1 */
/* aput-object p1, v0, v2 */
/* add-int/lit8 v2, v2, 0x1 */
/* aput-object p2, v0, v2 */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, p0, Ldu;->c:I */
int p1 = 0; // const/4 p1, 0x0
} // :cond_8
/* new-instance p1, Ljava/util/ConcurrentModificationException; */
/* invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V */
/* throw p1 */
} // .end method
public java.lang.Object remove ( java.lang.Object p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Object;", */
/* ")TV;" */
/* } */
} // .end annotation
p1 = (( du ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Ldu;->a(Ljava/lang/Object;)I
/* if-ltz p1, :cond_0 */
(( du ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Ldu;->c(I)Ljava/lang/Object;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Integer size ( ) {
/* .locals 1 */
/* iget v0, p0, Ldu;->c:I */
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
v0 = (( du ) p0 ).isEmpty ( ); // invoke-virtual {p0}, Ldu;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "{}"; // const-string v0, "{}"
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* iget v1, p0, Ldu;->c:I */
/* mul-int/lit8 v1, v1, 0x1c */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
/* const/16 v1, 0x7b */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* iget v2, p0, Ldu;->c:I */
/* if-ge v1, v2, :cond_4 */
/* if-lez v1, :cond_1 */
final String v2 = ", "; // const-string v2, ", "
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_1
(( du ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Ldu;->a(I)Ljava/lang/Object;
/* if-eq v2, p0, :cond_2 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
} // :cond_2
final String v2 = "(this Map)"; // const-string v2, "(this Map)"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :goto_1
/* const/16 v2, 0x3d */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( du ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Ldu;->b(I)Ljava/lang/Object;
/* if-eq v2, p0, :cond_3 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
} // :cond_3
final String v2 = "(this Map)"; // const-string v2, "(this Map)"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :goto_2
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_4
/* const/16 v1, 0x7d */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
