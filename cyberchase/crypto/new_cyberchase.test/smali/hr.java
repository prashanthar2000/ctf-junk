public class hr extends android.database.DataSetObservable {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lhr$e;, */
	 /* Lhr$a;, */
	 /* Lhr$c;, */
	 /* Lhr$d;, */
	 /* Lhr$b; */
	 /* } */
} // .end annotation
/* # static fields */
static final java.lang.String a;
private static final java.util.Map a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Lhr;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static final java.lang.Object b;
/* # instance fields */
private Integer a;
final android.content.Context a;
private android.content.Intent a;
private hr$b a;
private hr$d a;
public final java.lang.Object a;
public final java.util.List a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Lhr$a;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
Boolean a;
final java.lang.String b;
private final java.util.List b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Lhr$c;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private Boolean b;
private Boolean c;
private Boolean d;
/* # direct methods */
static hr ( ) {
/* .locals 1 */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
return;
} // .end method
private Boolean a ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = v0 = this.a;
/* if-nez v0, :cond_0 */
v0 = v0 = this.b;
/* if-nez v0, :cond_0 */
v0 = this.b;
java.util.Collections .unmodifiableList ( v0 );
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
private void b ( ) {
/* .locals 6 */
/* iget-boolean v0, p0, Lhr;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* iget-boolean v0, p0, Lhr;->c:Z */
/* if-nez v0, :cond_0 */
return;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lhr;->c:Z */
v1 = this.b;
v1 = android.text.TextUtils .isEmpty ( v1 );
/* if-nez v1, :cond_1 */
/* new-instance v1, Lhr$e; */
/* invoke-direct {v1, p0}, Lhr$e;-><init>(Lhr;)V */
v2 = android.os.AsyncTask.THREAD_POOL_EXECUTOR;
int v3 = 2; // const/4 v3, 0x2
/* new-array v3, v3, [Ljava/lang/Object; */
/* new-instance v4, Ljava/util/ArrayList; */
v5 = this.b;
/* invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
/* aput-object v4, v3, v0 */
int v0 = 1; // const/4 v0, 0x1
v4 = this.b;
/* aput-object v4, v3, v0 */
(( hr$e ) v1 ).executeOnExecutor ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lhr$e;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;
} // :cond_1
return;
} // :cond_2
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "No preceding call to #readHistoricalData"; // const-string v1, "No preceding call to #readHistoricalData"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
private Boolean b ( ) {
/* .locals 6 */
/* iget-boolean v0, p0, Lhr;->d:Z */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
/* iput-boolean v1, p0, Lhr;->d:Z */
v0 = this.a;
v0 = this.a;
(( android.content.Context ) v0 ).getPackageManager ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
v2 = this.a;
v2 = (( android.content.pm.PackageManager ) v0 ).queryIntentActivities ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
} // :goto_0
/* if-ge v1, v2, :cond_0 */
/* check-cast v3, Landroid/content/pm/ResolveInfo; */
v4 = this.a;
/* new-instance v5, Lhr$a; */
/* invoke-direct {v5, v3}, Lhr$a;-><init>(Landroid/content/pm/ResolveInfo;)V */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
} // .end method
private void c ( ) {
/* .locals 4 */
v0 = v0 = this.b;
/* iget v1, p0, Lhr;->a:I */
/* sub-int/2addr v0, v1 */
/* if-gtz v0, :cond_0 */
return;
} // :cond_0
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Lhr;->c:Z */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_1 */
v3 = this.b;
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
return;
} // .end method
private Boolean c ( ) {
/* .locals 2 */
/* iget-boolean v0, p0, Lhr;->a:Z */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lhr;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.b;
v0 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v0, :cond_0 */
/* iput-boolean v1, p0, Lhr;->a:Z */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lhr;->b:Z */
/* invoke-direct {p0}, Lhr;->d()V */
} // :cond_0
} // .end method
private void d ( ) {
/* .locals 9 */
try { // :try_start_0
v0 = this.a;
v1 = this.b;
(( android.content.Context ) v0 ).openFileInput ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
/* :try_end_0 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_0 ..:try_end_0} :catch_6 */
try { // :try_start_1
android.util.Xml .newPullParser ( );
final String v2 = "UTF-8"; // const-string v2, "UTF-8"
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
int v3 = 1; // const/4 v3, 0x1
/* if-eq v2, v3, :cond_0 */
int v4 = 2; // const/4 v4, 0x2
v2 = /* if-eq v2, v4, :cond_0 */
} // :cond_0
final String v2 = "historical-records"; // const-string v2, "historical-records"
v2 = (( java.lang.String ) v2 ).equals ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_4
v2 = this.b;
} // :cond_1
v4 = } // :goto_1
/* if-eq v4, v3, :cond_3 */
int v5 = 3; // const/4 v5, 0x3
/* if-eq v4, v5, :cond_1 */
int v5 = 4; // const/4 v5, 0x4
/* if-eq v4, v5, :cond_1 */
final String v5 = "historical-record"; // const-string v5, "historical-record"
v4 = (( java.lang.String ) v5 ).equals ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_2
final String v4 = "activity"; // const-string v4, "activity"
int v5 = 0; // const/4 v5, 0x0
final String v6 = "time"; // const-string v6, "time"
java.lang.Long .parseLong ( v6 );
/* move-result-wide v6 */
final String v8 = "weight"; // const-string v8, "weight"
v5 = java.lang.Float .parseFloat ( v5 );
/* new-instance v8, Lhr$c; */
/* invoke-direct {v8, v4, v6, v7, v5}, Lhr$c;-><init>(Ljava/lang/String;JF)V */
} // :cond_2
/* new-instance v1, Lorg/xmlpull/v1/XmlPullParserException; */
final String v2 = "Share records file not well-formed."; // const-string v2, "Share records file not well-formed."
/* invoke-direct {v1, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* :try_end_1 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 ..:try_end_1} :catch_3 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :cond_3
if ( v0 != null) { // if-eqz v0, :cond_5
try { // :try_start_2
(( java.io.FileInputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
/* :catch_0 */
return;
} // :cond_4
try { // :try_start_3
/* new-instance v1, Lorg/xmlpull/v1/XmlPullParserException; */
final String v2 = "Share records file does not start with historical-records tag."; // const-string v2, "Share records file does not start with historical-records tag."
/* invoke-direct {v1, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* :try_end_3 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 ..:try_end_3} :catch_3 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_1 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* :catchall_0 */
/* move-exception v1 */
/* :catch_1 */
/* move-exception v1 */
try { // :try_start_4
v2 = hr.a;
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "Error reading historical recrod file: "; // const-string v4, "Error reading historical recrod file: "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v4 = this.b;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v2,v3,v1 );
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_5
try { // :try_start_5
(( java.io.FileInputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
/* :try_end_5 */
/* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_2 */
/* :catch_2 */
return;
/* :catch_3 */
/* move-exception v1 */
try { // :try_start_6
v2 = hr.a;
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "Error reading historical recrod file: "; // const-string v4, "Error reading historical recrod file: "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v4 = this.b;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v2,v3,v1 );
/* :try_end_6 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_5
try { // :try_start_7
(( java.io.FileInputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
/* :try_end_7 */
/* .catch Ljava/io/IOException; {:try_start_7 ..:try_end_7} :catch_4 */
/* :catch_4 */
} // :cond_5
return;
} // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_6
try { // :try_start_8
(( java.io.FileInputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
/* :try_end_8 */
/* .catch Ljava/io/IOException; {:try_start_8 ..:try_end_8} :catch_5 */
/* :catch_5 */
} // :cond_6
/* throw v1 */
/* :catch_6 */
return;
} // .end method
/* # virtual methods */
public final Integer a ( ) {
/* .locals 2 */
v0 = this.a;
/* monitor-enter v0 */
try { // :try_start_0
(( hr ) p0 ).a ( ); // invoke-virtual {p0}, Lhr;->a()V
v1 = v1 = this.a;
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
public final Integer a ( android.content.pm.ResolveInfo p0 ) {
/* .locals 5 */
v0 = this.a;
/* monitor-enter v0 */
try { // :try_start_0
(( hr ) p0 ).a ( ); // invoke-virtual {p0}, Lhr;->a()V
v2 = v1 = this.a;
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v2, :cond_1 */
/* check-cast v4, Lhr$a; */
v4 = this.a;
/* if-ne v4, p1, :cond_0 */
/* monitor-exit v0 */
} // :cond_0
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_1
int p1 = -1; // const/4 p1, -0x1
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
return;
} // .end method
public final android.content.Intent a ( Integer p0 ) {
/* .locals 6 */
v0 = this.a;
/* monitor-enter v0 */
try { // :try_start_0
v1 = this.a;
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_0 */
/* monitor-exit v0 */
} // :cond_0
(( hr ) p0 ).a ( ); // invoke-virtual {p0}, Lhr;->a()V
v1 = this.a;
/* check-cast p1, Lhr$a; */
/* new-instance v1, Landroid/content/ComponentName; */
v3 = this.a;
v3 = this.activityInfo;
v3 = this.packageName;
p1 = this.a;
p1 = this.activityInfo;
p1 = this.name;
/* invoke-direct {v1, v3, p1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* new-instance p1, Landroid/content/Intent; */
v3 = this.a;
/* invoke-direct {p1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V */
(( android.content.Intent ) p1 ).setComponent ( v1 ); // invoke-virtual {p1, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
v3 = this.a;
if ( v3 != null) { // if-eqz v3, :cond_1
/* new-instance v3, Landroid/content/Intent; */
/* invoke-direct {v3, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V */
v3 = v3 = this.a;
if ( v3 != null) { // if-eqz v3, :cond_1
/* monitor-exit v0 */
} // :cond_1
/* new-instance v2, Lhr$c; */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
/* const/high16 v5, 0x3f800000 # 1.0f */
/* invoke-direct {v2, v1, v3, v4, v5}, Lhr$c;-><init>(Landroid/content/ComponentName;JF)V */
(( hr ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lhr;->a(Lhr$c;)Z
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
public final android.content.pm.ResolveInfo a ( ) {
/* .locals 3 */
v0 = this.a;
/* monitor-enter v0 */
try { // :try_start_0
(( hr ) p0 ).a ( ); // invoke-virtual {p0}, Lhr;->a()V
v1 = v1 = this.a;
/* if-nez v1, :cond_0 */
v1 = this.a;
int v2 = 0; // const/4 v2, 0x0
/* check-cast v1, Lhr$a; */
v1 = this.a;
/* monitor-exit v0 */
} // :cond_0
/* monitor-exit v0 */
int v0 = 0; // const/4 v0, 0x0
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
public final android.content.pm.ResolveInfo a ( Integer p0 ) {
/* .locals 2 */
v0 = this.a;
/* monitor-enter v0 */
try { // :try_start_0
(( hr ) p0 ).a ( ); // invoke-virtual {p0}, Lhr;->a()V
v1 = this.a;
/* check-cast p1, Lhr$a; */
p1 = this.a;
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
public final void a ( ) {
/* .locals 2 */
v0 = /* invoke-direct {p0}, Lhr;->b()Z */
v1 = /* invoke-direct {p0}, Lhr;->c()Z */
/* or-int/2addr v0, v1 */
/* invoke-direct {p0}, Lhr;->c()V */
if ( v0 != null) { // if-eqz v0, :cond_0
/* invoke-direct {p0}, Lhr;->a()Z */
(( hr ) p0 ).notifyChanged ( ); // invoke-virtual {p0}, Lhr;->notifyChanged()V
} // :cond_0
return;
} // .end method
public final Boolean a ( hr$c p0 ) {
/* .locals 1 */
p1 = v0 = this.b;
if ( p1 != null) { // if-eqz p1, :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lhr;->c:Z */
/* invoke-direct {p0}, Lhr;->c()V */
/* invoke-direct {p0}, Lhr;->b()V */
/* invoke-direct {p0}, Lhr;->a()Z */
(( hr ) p0 ).notifyChanged ( ); // invoke-virtual {p0}, Lhr;->notifyChanged()V
} // :cond_0
} // .end method
public final Integer b ( ) {
/* .locals 2 */
v0 = this.a;
/* monitor-enter v0 */
try { // :try_start_0
(( hr ) p0 ).a ( ); // invoke-virtual {p0}, Lhr;->a()V
v1 = v1 = this.b;
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
