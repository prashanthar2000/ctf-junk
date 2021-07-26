public class android.support.v4.content.FileProvider extends android.content.ContentProvider {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/v4/content/FileProvider$b;, */
	 /* Landroid/support/v4/content/FileProvider$a; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.io.File a;
private static java.util.HashMap a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap<", */
/* "Ljava/lang/String;", */
/* "Landroid/support/v4/content/FileProvider$a;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static final java.lang.String a;
/* # instance fields */
private android.support.v4.content.FileProvider$a a;
/* # direct methods */
static android.support.v4.content.FileProvider ( ) {
/* .locals 2 */
final String v0 = "_display_name"; // const-string v0, "_display_name"
final String v1 = "_size"; // const-string v1, "_size"
/* filled-new-array {v0, v1}, [Ljava/lang/String; */
/* new-instance v0, Ljava/io/File; */
final String v1 = "/"; // const-string v1, "/"
/* invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
return;
} // .end method
public android.support.v4.content.FileProvider ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V */
return;
} // .end method
private static android.support.v4.content.FileProvider$a a ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 11 */
v0 = android.support.v4.content.FileProvider.a;
/* monitor-enter v0 */
try { // :try_start_0
v1 = android.support.v4.content.FileProvider.a;
(( java.util.HashMap ) v1 ).get ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Landroid/support/v4/content/FileProvider$a; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v1, :cond_b */
try { // :try_start_1
	 /* new-instance v1, Landroid/support/v4/content/FileProvider$b; */
	 /* invoke-direct {v1, p1}, Landroid/support/v4/content/FileProvider$b;-><init>(Ljava/lang/String;)V */
	 (( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
	 /* const/16 v3, 0x80 */
	 (( android.content.pm.PackageManager ) v2 ).resolveContentProvider ( p1, v3 ); // invoke-virtual {v2, p1, v3}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
	 (( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
	 final String v4 = "android.support.FILE_PROVIDER_PATHS"; // const-string v4, "android.support.FILE_PROVIDER_PATHS"
	 (( android.content.pm.ProviderInfo ) v2 ).loadXmlMetaData ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/content/pm/ProviderInfo;->loadXmlMetaData(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/res/XmlResourceParser;
	 if ( v2 != null) { // if-eqz v2, :cond_a
	 } // :cond_0
v3 = } // :goto_0
int v4 = 1; // const/4 v4, 0x1
/* if-eq v3, v4, :cond_9 */
int v5 = 2; // const/4 v5, 0x2
/* if-ne v3, v5, :cond_0 */
final String v5 = "name"; // const-string v5, "name"
int v6 = 0; // const/4 v6, 0x0
final String v7 = "path"; // const-string v7, "path"
final String v8 = "root-path"; // const-string v8, "root-path"
v8 = (( java.lang.String ) v8 ).equals ( v3 ); // invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
int v9 = 0; // const/4 v9, 0x0
if ( v8 != null) { // if-eqz v8, :cond_1
	 v6 = android.support.v4.content.FileProvider.a;
} // :cond_1
final String v8 = "files-path"; // const-string v8, "files-path"
v8 = (( java.lang.String ) v8 ).equals ( v3 ); // invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v8 != null) { // if-eqz v8, :cond_2
	 (( android.content.Context ) p0 ).getFilesDir ( ); // invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
} // :cond_2
final String v8 = "cache-path"; // const-string v8, "cache-path"
v8 = (( java.lang.String ) v8 ).equals ( v3 ); // invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v8 != null) { // if-eqz v8, :cond_3
	 (( android.content.Context ) p0 ).getCacheDir ( ); // invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;
} // :cond_3
final String v8 = "external-path"; // const-string v8, "external-path"
v8 = (( java.lang.String ) v8 ).equals ( v3 ); // invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v8 != null) { // if-eqz v8, :cond_4
	 android.os.Environment .getExternalStorageDirectory ( );
} // :cond_4
final String v8 = "external-files-path"; // const-string v8, "external-files-path"
v8 = (( java.lang.String ) v8 ).equals ( v3 ); // invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v8 != null) { // if-eqz v8, :cond_5
	 ce .a ( p0 );
	 /* array-length v8, v3 */
	 /* if-lez v8, :cond_7 */
	 /* aget-object v6, v3, v9 */
} // :cond_5
final String v8 = "external-cache-path"; // const-string v8, "external-cache-path"
v8 = (( java.lang.String ) v8 ).equals ( v3 ); // invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v8 != null) { // if-eqz v8, :cond_6
	 ce .b ( p0 );
	 /* array-length v8, v3 */
	 /* if-lez v8, :cond_7 */
	 /* aget-object v6, v3, v9 */
} // :cond_6
/* const/16 v10, 0x15 */
/* if-lt v8, v10, :cond_7 */
final String v8 = "external-media-path"; // const-string v8, "external-media-path"
v3 = (( java.lang.String ) v8 ).equals ( v3 ); // invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_7
	 (( android.content.Context ) p0 ).getExternalMediaDirs ( ); // invoke-virtual {p0}, Landroid/content/Context;->getExternalMediaDirs()[Ljava/io/File;
	 /* array-length v8, v3 */
	 /* if-lez v8, :cond_7 */
	 /* aget-object v6, v3, v9 */
} // :cond_7
} // :goto_1
if ( v6 != null) { // if-eqz v6, :cond_0
/* new-array v3, v4, [Ljava/lang/String; */
/* aput-object v7, v3, v9 */
android.support.v4.content.FileProvider .a ( v6,v3 );
v4 = android.text.TextUtils .isEmpty ( v5 );
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_2 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* if-nez v4, :cond_8 */
try { // :try_start_2
	 (( java.io.File ) v3 ).getCanonicalFile ( ); // invoke-virtual {v3}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;
	 /* :try_end_2 */
	 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
	 /* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 ..:try_end_2} :catch_1 */
	 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
	 try { // :try_start_3
		 v4 = this.a;
		 (( java.util.HashMap ) v4 ).put ( v5, v3 ); // invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 /* goto/16 :goto_0 */
		 /* :catch_0 */
		 /* move-exception p0 */
		 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
		 final String v1 = "Failed to resolve canonical path for "; // const-string v1, "Failed to resolve canonical path for "
		 java.lang.String .valueOf ( v3 );
		 (( java.lang.String ) v1 ).concat ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
		 /* invoke-direct {p1, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
		 /* throw p1 */
	 } // :cond_8
	 /* new-instance p0, Ljava/lang/IllegalArgumentException; */
	 final String p1 = "Name must not be empty"; // const-string p1, "Name must not be empty"
	 /* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw p0 */
	 /* :try_end_3 */
	 /* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_2 */
	 /* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 ..:try_end_3} :catch_1 */
	 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
} // :cond_9
try { // :try_start_4
	 p0 = android.support.v4.content.FileProvider.a;
	 (( java.util.HashMap ) p0 ).put ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* :try_end_4 */
	 /* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
} // :cond_a
try { // :try_start_5
	 /* new-instance p0, Ljava/lang/IllegalArgumentException; */
	 final String p1 = "Missing android.support.FILE_PROVIDER_PATHS meta-data"; // const-string p1, "Missing android.support.FILE_PROVIDER_PATHS meta-data"
	 /* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw p0 */
	 /* :try_end_5 */
	 /* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_2 */
	 /* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_5 ..:try_end_5} :catch_1 */
	 /* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
	 /* :catch_1 */
	 /* move-exception p0 */
	 try { // :try_start_6
		 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
		 final String v1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"; // const-string v1, "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
		 /* invoke-direct {p1, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
		 /* throw p1 */
		 /* :catch_2 */
		 /* move-exception p0 */
		 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
		 final String v1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"; // const-string v1, "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
		 /* invoke-direct {p1, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
		 /* throw p1 */
	 } // :cond_b
} // :goto_2
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p0 */
/* monitor-exit v0 */
/* :try_end_6 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
/* throw p0 */
return;
} // .end method
private static java.io.File a ( java.io.File p0, java.lang.String...p1 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
/* move-object v1, p0 */
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
/* if-gtz p0, :cond_1 */
/* aget-object v2, p1, v0 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* new-instance v3, Ljava/io/File; */
/* invoke-direct {v3, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* move-object v1, v3 */
} // :cond_0
/* add-int/lit8 p0, p0, 0x1 */
} // :cond_1
} // .end method
/* # virtual methods */
public void attachInfo ( android.content.Context p0, android.content.pm.ProviderInfo p1 ) {
/* .locals 1 */
/* invoke-super {p0, p1, p2}, Landroid/content/ContentProvider;->attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V */
/* iget-boolean v0, p2, Landroid/content/pm/ProviderInfo;->exported:Z */
/* if-nez v0, :cond_1 */
/* iget-boolean v0, p2, Landroid/content/pm/ProviderInfo;->grantUriPermissions:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
p2 = this.authority;
android.support.v4.content.FileProvider .a ( p1,p2 );
this.a = p1;
return;
} // :cond_0
/* new-instance p1, Ljava/lang/SecurityException; */
final String p2 = "Provider must grant uri permissions"; // const-string p2, "Provider must grant uri permissions"
/* invoke-direct {p1, p2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_1
/* new-instance p1, Ljava/lang/SecurityException; */
final String p2 = "Provider must not be exported"; // const-string p2, "Provider must not be exported"
/* invoke-direct {p1, p2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public Integer delete ( android.net.Uri p0, java.lang.String p1, java.lang.String[] p2 ) {
/* .locals 0 */
p2 = this.a;
p1 = (( java.io.File ) p1 ).delete ( ); // invoke-virtual {p1}, Ljava/io/File;->delete()Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.lang.String getType ( android.net.Uri p0 ) {
/* .locals 2 */
v0 = this.a;
(( java.io.File ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;
/* const/16 v1, 0x2e */
v0 = (( java.lang.String ) v0 ).lastIndexOf ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I
/* if-ltz v0, :cond_0 */
(( java.io.File ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;
/* add-int/lit8 v0, v0, 0x1 */
(( java.lang.String ) p1 ).substring ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
android.webkit.MimeTypeMap .getSingleton ( );
(( android.webkit.MimeTypeMap ) v0 ).getMimeTypeFromExtension ( p1 ); // invoke-virtual {v0, p1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
final String p1 = "application/octet-stream"; // const-string p1, "application/octet-stream"
} // .end method
public android.net.Uri insert ( android.net.Uri p0, android.content.ContentValues p1 ) {
/* .locals 0 */
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
final String p2 = "No external inserts"; // const-string p2, "No external inserts"
/* invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public Boolean onCreate ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public android.os.ParcelFileDescriptor openFile ( android.net.Uri p0, java.lang.String p1 ) {
/* .locals 1 */
v0 = this.a;
final String v0 = "r"; // const-string v0, "r"
v0 = (( java.lang.String ) v0 ).equals ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* const/high16 p2, 0x10000000 */
} // :cond_0
final String v0 = "w"; // const-string v0, "w"
v0 = (( java.lang.String ) v0 ).equals ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_5 */
final String v0 = "wt"; // const-string v0, "wt"
v0 = (( java.lang.String ) v0 ).equals ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_1
final String v0 = "wa"; // const-string v0, "wa"
v0 = (( java.lang.String ) v0 ).equals ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* const/high16 p2, 0x2a000000 */
} // :cond_2
final String v0 = "rw"; // const-string v0, "rw"
v0 = (( java.lang.String ) v0 ).equals ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* const/high16 p2, 0x38000000 */
} // :cond_3
final String v0 = "rwt"; // const-string v0, "rwt"
v0 = (( java.lang.String ) v0 ).equals ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* const/high16 p2, 0x3c000000 # 0.0078125f */
} // :cond_4
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
java.lang.String .valueOf ( p2 );
final String v0 = "Invalid mode: "; // const-string v0, "Invalid mode: "
(( java.lang.String ) v0 ).concat ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_5
} // :goto_0
/* const/high16 p2, 0x2c000000 */
} // :goto_1
android.os.ParcelFileDescriptor .open ( p1,p2 );
} // .end method
public android.database.Cursor query ( android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4 ) {
/* .locals 6 */
p3 = this.a;
/* if-nez p2, :cond_0 */
p2 = android.support.v4.content.FileProvider.a;
} // :cond_0
/* array-length p3, p2 */
/* new-array p3, p3, [Ljava/lang/String; */
/* array-length p4, p2 */
/* new-array p4, p4, [Ljava/lang/Object; */
/* array-length p5, p2 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v1, p5, :cond_3 */
/* aget-object v3, p2, v1 */
final String v4 = "_display_name"; // const-string v4, "_display_name"
v4 = (( java.lang.String ) v4 ).equals ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_1
final String v3 = "_display_name"; // const-string v3, "_display_name"
/* aput-object v3, p3, v2 */
/* add-int/lit8 v3, v2, 0x1 */
(( java.io.File ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;
/* aput-object v4, p4, v2 */
} // :goto_1
/* move v2, v3 */
} // :cond_1
final String v4 = "_size"; // const-string v4, "_size"
v3 = (( java.lang.String ) v4 ).equals ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_2
final String v3 = "_size"; // const-string v3, "_size"
/* aput-object v3, p3, v2 */
/* add-int/lit8 v3, v2, 0x1 */
(( java.io.File ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/io/File;->length()J
/* move-result-wide v4 */
java.lang.Long .valueOf ( v4,v5 );
/* aput-object v4, p4, v2 */
} // :cond_2
} // :goto_2
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_3
/* new-array p1, v2, [Ljava/lang/String; */
java.lang.System .arraycopy ( p3,v0,p1,v0,v2 );
/* new-array p2, v2, [Ljava/lang/Object; */
java.lang.System .arraycopy ( p4,v0,p2,v0,v2 );
/* new-instance p3, Landroid/database/MatrixCursor; */
int p4 = 1; // const/4 p4, 0x1
/* invoke-direct {p3, p1, p4}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;I)V */
(( android.database.MatrixCursor ) p3 ).addRow ( p2 ); // invoke-virtual {p3, p2}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V
} // .end method
public Integer update ( android.net.Uri p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3 ) {
/* .locals 0 */
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
final String p2 = "No external updates"; // const-string p2, "No external updates"
/* invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
