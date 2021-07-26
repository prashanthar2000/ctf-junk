class inal implements android.support.v4.content.FileProvider$a {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/support/v4/content/FileProvider; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = "b" */
} // .end annotation
/* # instance fields */
private final java.lang.String a;
final java.util.HashMap a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap<", */
/* "Ljava/lang/String;", */
/* "Ljava/io/File;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
 inal ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.a = v0;
this.a = p1;
return;
} // .end method
/* # virtual methods */
public final java.io.File a ( android.net.Uri p0 ) {
/* .locals 4 */
(( android.net.Uri ) p1 ).getEncodedPath ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;
int v1 = 1; // const/4 v1, 0x1
/* const/16 v2, 0x2f */
v2 = (( java.lang.String ) v0 ).indexOf ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljava/lang/String;->indexOf(II)I
(( java.lang.String ) v0 ).substring ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
android.net.Uri .decode ( v3 );
/* add-int/2addr v2, v1 */
(( java.lang.String ) v0 ).substring ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
android.net.Uri .decode ( v0 );
v1 = this.a;
(( java.util.HashMap ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/io/File; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* new-instance p1, Ljava/io/File; */
/* invoke-direct {p1, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
try { // :try_start_0
(( java.io.File ) p1 ).getCanonicalFile ( ); // invoke-virtual {p1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
(( java.io.File ) p1 ).getPath ( ); // invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;
(( java.io.File ) v1 ).getPath ( ); // invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
/* new-instance p1, Ljava/lang/SecurityException; */
final String v0 = "Resolved path jumped beyond configured root"; // const-string v0, "Resolved path jumped beyond configured root"
/* invoke-direct {p1, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* :catch_0 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
java.lang.String .valueOf ( p1 );
final String v1 = "Failed to resolve canonical path for "; // const-string v1, "Failed to resolve canonical path for "
(( java.lang.String ) v1 ).concat ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
java.lang.String .valueOf ( p1 );
final String v1 = "Unable to find configured root for "; // const-string v1, "Unable to find configured root for "
(( java.lang.String ) v1 ).concat ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
