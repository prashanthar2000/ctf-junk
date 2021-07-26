class cv {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcv$a; */
	 /* } */
} // .end annotation
/* # direct methods */
 cv ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
protected static android.graphics.Typeface a ( android.content.Context p0, java.io.InputStream p1 ) {
	 /* .locals 1 */
	 cw .a ( p0 );
	 int v0 = 0; // const/4 v0, 0x0
	 /* if-nez p0, :cond_0 */
} // :cond_0
try { // :try_start_0
	 p1 = 	 cw .a ( p0,p1 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* if-nez p1, :cond_1 */
	 (( java.io.File ) p0 ).delete ( ); // invoke-virtual {p0}, Ljava/io/File;->delete()Z
} // :cond_1
try { // :try_start_1
	 (( java.io.File ) p0 ).getPath ( ); // invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;
	 android.graphics.Typeface .createFromFile ( p1 );
	 /* :try_end_1 */
	 /* .catch Ljava/lang/RuntimeException; {:try_start_1 ..:try_end_1} :catch_0 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 (( java.io.File ) p0 ).delete ( ); // invoke-virtual {p0}, Ljava/io/File;->delete()Z
	 /* :catchall_0 */
	 /* move-exception p1 */
	 (( java.io.File ) p0 ).delete ( ); // invoke-virtual {p0}, Ljava/io/File;->delete()Z
	 /* throw p1 */
	 /* :catch_0 */
	 (( java.io.File ) p0 ).delete ( ); // invoke-virtual {p0}, Ljava/io/File;->delete()Z
} // .end method
private static java.lang.Object a ( java.lang.Object[] p0, Integer p1, cv$a p2 ) {
	 /* .locals 10 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">([TT;I", */
	 /* "Lcv$a<", */
	 /* "TT;>;)TT;" */
	 /* } */
} // .end annotation
/* and-int/lit8 v0, p1, 0x1 */
/* if-nez v0, :cond_0 */
/* const/16 v0, 0x190 */
} // :cond_0
/* const/16 v0, 0x2bc */
} // :goto_0
/* and-int/lit8 p1, p1, 0x2 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
if ( p1 != null) { // if-eqz p1, :cond_1
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :goto_1
int v3 = 0; // const/4 v3, 0x0
/* const v4, 0x7fffffff */
/* array-length v5, p0 */
/* move-object v4, v3 */
int v3 = 0; // const/4 v3, 0x0
/* const v6, 0x7fffffff */
} // :goto_2
/* if-ge v3, v5, :cond_5 */
v8 = /* aget-object v7, p0, v3 */
/* sub-int/2addr v8, v0 */
v8 = java.lang.Math .abs ( v8 );
v9 = /* mul-int/lit8 v8, v8, 0x2 */
/* if-ne v9, p1, :cond_2 */
int v9 = 0; // const/4 v9, 0x0
} // :cond_2
int v9 = 1; // const/4 v9, 0x1
} // :goto_3
/* add-int/2addr v8, v9 */
if ( v4 != null) { // if-eqz v4, :cond_3
/* if-le v6, v8, :cond_4 */
} // :cond_3
/* move-object v4, v7 */
/* move v6, v8 */
} // :cond_4
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_5
} // .end method
/* # virtual methods */
public android.graphics.Typeface a ( android.content.Context p0, android.content.res.Resources p1, Integer p2, java.lang.String p3, Integer p4 ) {
/* .locals 0 */
cw .a ( p1 );
int p4 = 0; // const/4 p4, 0x0
/* if-nez p1, :cond_0 */
} // :cond_0
try { // :try_start_0
p2 = cw .a ( p1,p2,p3 );
/* :try_end_0 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez p2, :cond_1 */
(( java.io.File ) p1 ).delete ( ); // invoke-virtual {p1}, Ljava/io/File;->delete()Z
} // :cond_1
try { // :try_start_1
(( java.io.File ) p1 ).getPath ( ); // invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;
android.graphics.Typeface .createFromFile ( p2 );
/* :try_end_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
(( java.io.File ) p1 ).delete ( ); // invoke-virtual {p1}, Ljava/io/File;->delete()Z
/* :catchall_0 */
/* move-exception p2 */
(( java.io.File ) p1 ).delete ( ); // invoke-virtual {p1}, Ljava/io/File;->delete()Z
/* throw p2 */
/* :catch_0 */
(( java.io.File ) p1 ).delete ( ); // invoke-virtual {p1}, Ljava/io/File;->delete()Z
} // .end method
public android.graphics.Typeface a ( android.content.Context p0, cj$b p1, android.content.res.Resources p2, Integer p3 ) {
/* .locals 1 */
p2 = this.a;
/* new-instance v0, Lcv$2; */
/* invoke-direct {v0, p0}, Lcv$2;-><init>(Lcv;)V */
cv .a ( p2,p4,v0 );
/* check-cast p2, Lcj$c; */
/* if-nez p2, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
/* iget v0, p2, Lcj$c;->c:I */
p2 = this.a;
cq .a ( p1,p3,v0,p2,p4 );
} // .end method
public android.graphics.Typeface a ( android.content.Context p0, dg$b[] p1, Integer p2 ) {
/* .locals 2 */
/* array-length v0, p2 */
int v1 = 0; // const/4 v1, 0x0
/* if-gtz v0, :cond_0 */
} // :cond_0
(( cv ) p0 ).a ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Lcv;->a([Ldg$b;I)Ldg$b;
try { // :try_start_0
(( android.content.Context ) p1 ).getContentResolver ( ); // invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
p2 = this.a;
(( android.content.ContentResolver ) p3 ).openInputStream ( p2 ); // invoke-virtual {p3, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
try { // :try_start_1
cv .a ( p1,p2 );
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
cw .a ( p2 );
/* :catchall_0 */
/* move-exception p1 */
/* move-object v1, p2 */
/* :catchall_1 */
/* move-exception p1 */
} // :goto_0
cw .a ( v1 );
/* throw p1 */
/* :catch_0 */
/* move-object p2, v1 */
/* :catch_1 */
cw .a ( p2 );
} // .end method
protected final dg$b a ( dg$b[] p0, Integer p1 ) {
/* .locals 1 */
/* new-instance v0, Lcv$1; */
/* invoke-direct {v0, p0}, Lcv$1;-><init>(Lcv;)V */
cv .a ( p1,p2,v0 );
/* check-cast p1, Ldg$b; */
} // .end method
