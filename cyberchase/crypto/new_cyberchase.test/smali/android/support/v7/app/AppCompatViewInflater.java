public class android.support.v7.app.AppCompatViewInflater {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/v7/app/AppCompatViewInflater$a; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.util.Map a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/reflect/Constructor<", */
/* "+", */
/* "Landroid/view/View;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
public static final a;
private static final java.lang.Class a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "[", */
/* "Ljava/lang/Class<", */
/* "*>;" */
/* } */
} // .end annotation
} // .end field
private static final java.lang.String a;
/* # instance fields */
private final java.lang.Object a;
/* # direct methods */
static android.support.v7.app.AppCompatViewInflater ( ) {
/* .locals 4 */
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [Ljava/lang/Class; */
/* const-class v1, Landroid/content/Context; */
int v2 = 0; // const/4 v2, 0x0
/* aput-object v1, v0, v2 */
/* const-class v1, Landroid/util/AttributeSet; */
int v3 = 1; // const/4 v3, 0x1
/* aput-object v1, v0, v3 */
/* new-array v0, v3, [I */
/* const v1, 0x101026f */
/* aput v1, v0, v2 */
final String v0 = "android.widget."; // const-string v0, "android.widget."
final String v1 = "android.view."; // const-string v1, "android.view."
final String v2 = "android.webkit."; // const-string v2, "android.webkit."
/* filled-new-array {v0, v1, v2}, [Ljava/lang/String; */
/* new-instance v0, Ldj; */
/* invoke-direct {v0}, Ldj;-><init>()V */
return;
} // .end method
public android.support.v7.app.AppCompatViewInflater ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [Ljava/lang/Object; */
this.a = v0;
return;
} // .end method
private android.view.View a ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 1 */
v0 = android.support.v7.app.AppCompatViewInflater.a;
/* check-cast v0, Ljava/lang/reflect/Constructor; */
/* if-nez v0, :cond_1 */
try { // :try_start_0
(( android.content.Context ) p1 ).getClassLoader ( ); // invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;
if ( p3 != null) { // if-eqz p3, :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_0
/* move-object p3, p2 */
} // :goto_0
(( java.lang.ClassLoader ) p1 ).loadClass ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
/* const-class p3, Landroid/view/View; */
(( java.lang.Class ) p1 ).asSubclass ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;
p3 = android.support.v7.app.AppCompatViewInflater.a;
(( java.lang.Class ) p1 ).getConstructor ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
p1 = android.support.v7.app.AppCompatViewInflater.a;
} // :cond_1
int p1 = 1; // const/4 p1, 0x1
(( java.lang.reflect.Constructor ) v0 ).setAccessible ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V
p1 = this.a;
(( java.lang.reflect.Constructor ) v0 ).newInstance ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Landroid/view/View; */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
/* # virtual methods */
public final android.view.View a ( android.content.Context p0, java.lang.String p1, android.util.AttributeSet p2 ) {
/* .locals 4 */
final String v0 = "view"; // const-string v0, "view"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
final String p2 = "class"; // const-string p2, "class"
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
int v2 = 0; // const/4 v2, 0x0
try { // :try_start_0
v3 = this.a;
/* aput-object p1, v3, v2 */
v3 = this.a;
/* aput-object p3, v3, v0 */
int p3 = -1; // const/4 p3, -0x1
/* const/16 v3, 0x2e */
v3 = (( java.lang.String ) p2 ).indexOf ( v3 ); // invoke-virtual {p2, v3}, Ljava/lang/String;->indexOf(I)I
/* if-ne p3, v3, :cond_3 */
int p3 = 0; // const/4 p3, 0x0
} // :goto_0
v3 = android.support.v7.app.AppCompatViewInflater.a;
/* array-length v3, v3 */
/* if-ge p3, v3, :cond_2 */
v3 = android.support.v7.app.AppCompatViewInflater.a;
/* aget-object v3, v3, p3 */
/* invoke-direct {p0, p1, p2, v3}, Landroid/support/v7/app/AppCompatViewInflater;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View; */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v3 != null) { // if-eqz v3, :cond_1
p1 = this.a;
/* aput-object v1, p1, v2 */
/* aput-object v1, p1, v0 */
} // :cond_1
/* add-int/lit8 p3, p3, 0x1 */
} // :cond_2
p1 = this.a;
/* aput-object v1, p1, v2 */
/* aput-object v1, p1, v0 */
} // :cond_3
try { // :try_start_1
/* invoke-direct {p0, p1, p2, v1}, Landroid/support/v7/app/AppCompatViewInflater;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View; */
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
p2 = this.a;
/* aput-object v1, p2, v2 */
/* aput-object v1, p2, v0 */
/* :catchall_0 */
/* move-exception p1 */
p2 = this.a;
/* aput-object v1, p2, v2 */
/* aput-object v1, p2, v0 */
/* throw p1 */
/* :catch_0 */
p1 = this.a;
/* aput-object v1, p1, v2 */
/* aput-object v1, p1, v0 */
} // .end method
