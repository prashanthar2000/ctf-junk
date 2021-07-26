public class bl implements android.content.ComponentCallbacks implements android.view.View$OnCreateContextMenuListener implements j implements v {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lbl$a;, */
	 /* Lbl$c;, */
	 /* Lbl$b; */
	 /* } */
} // .end annotation
/* # static fields */
private static final du a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ldu<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Class<", */
/* "*>;>;" */
/* } */
} // .end annotation
} // .end field
static final java.lang.Object a;
/* # instance fields */
Float a;
Integer a;
android.os.Bundle a;
android.util.SparseArray a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/util/SparseArray<", */
/* "Landroid/os/Parcelable;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
android.view.LayoutInflater a;
android.view.View a;
android.view.ViewGroup a;
bl$a a;
bl a;
bo a;
bq a;
br a;
j a;
java.lang.Boolean a;
java.lang.String a;
public k a;
o a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lo<", */
/* "Lj;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
u a;
Boolean a;
Integer b;
android.os.Bundle b;
android.view.View b;
bl b;
public bq b;
java.lang.String b;
k b;
Boolean b;
Integer c;
Boolean c;
Integer d;
Boolean d;
Integer e;
Boolean e;
Integer f;
Boolean f;
Integer g;
Boolean g;
public Boolean h;
Boolean i;
Boolean j;
Boolean k;
Boolean l;
Boolean m;
Boolean n;
Boolean o;
Boolean p;
Boolean q;
Boolean r;
/* # direct methods */
static bl ( ) {
/* .locals 1 */
/* new-instance v0, Ldu; */
/* invoke-direct {v0}, Ldu;-><init>()V */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public bl ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lbl;->a:I */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lbl;->b:I */
/* iput v0, p0, Lbl;->c:I */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lbl;->l:Z */
/* iput-boolean v0, p0, Lbl;->o:Z */
/* new-instance v0, Lk; */
/* invoke-direct {v0, p0}, Lk;-><init>(Lj;)V */
this.a = v0;
/* new-instance v0, Lo; */
/* invoke-direct {v0}, Lo;-><init>()V */
this.a = v0;
return;
} // .end method
private bl$a a ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lbl$a; */
/* invoke-direct {v0}, Lbl$a;-><init>()V */
this.a = v0;
} // :cond_0
v0 = this.a;
} // .end method
public static bl a ( android.content.Context p0, java.lang.String p1, android.os.Bundle p2 ) {
/* .locals 2 */
try { // :try_start_0
v0 = bl.a;
(( du ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ldu;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Class; */
/* if-nez v0, :cond_0 */
(( android.content.Context ) p0 ).getClassLoader ( ); // invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;
(( java.lang.ClassLoader ) p0 ).loadClass ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
p0 = bl.a;
(( du ) p0 ).put ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Ldu;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
/* new-array v1, p0, [Ljava/lang/Class; */
(( java.lang.Class ) v0 ).getConstructor ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
/* new-array v1, p0, [Ljava/lang/Object; */
(( java.lang.reflect.Constructor ) v0 ).newInstance ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lbl; */
if ( p2 != null) { // if-eqz p2, :cond_4
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v1 ).getClassLoader ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
(( android.os.Bundle ) p2 ).setClassLoader ( v1 ); // invoke-virtual {p2, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
/* iget v1, v0, Lbl;->b:I */
/* if-ltz v1, :cond_3 */
v1 = this.a;
/* if-nez v1, :cond_1 */
} // :cond_1
p0 = this.a;
p0 = (( bq ) p0 ).c ( ); // invoke-virtual {p0}, Lbq;->c()Z
} // :goto_0
/* if-nez p0, :cond_2 */
} // :cond_2
/* new-instance p0, Ljava/lang/IllegalStateException; */
final String p2 = "Fragment already active and state has been saved"; // const-string p2, "Fragment already active and state has been saved"
/* invoke-direct {p0, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // :cond_3
} // :goto_1
this.b = p2;
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_4 */
/* .catch Ljava/lang/InstantiationException; {:try_start_0 ..:try_end_0} :catch_3 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_4
/* :catch_0 */
/* move-exception p0 */
/* new-instance p2, Lbl$b; */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "Unable to instantiate fragment "; // const-string v1, "Unable to instantiate fragment "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ": calling Fragment constructor caused an exception"; // const-string p1, ": calling Fragment constructor caused an exception"
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1, p0}, Lbl$b;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V */
/* throw p2 */
/* :catch_1 */
/* move-exception p0 */
/* new-instance p2, Lbl$b; */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "Unable to instantiate fragment "; // const-string v1, "Unable to instantiate fragment "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ": could not find Fragment constructor"; // const-string p1, ": could not find Fragment constructor"
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1, p0}, Lbl$b;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V */
/* throw p2 */
/* :catch_2 */
/* move-exception p0 */
/* new-instance p2, Lbl$b; */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "Unable to instantiate fragment "; // const-string v1, "Unable to instantiate fragment "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ": make sure class name exists, is public, and has an empty constructor that is public"; // const-string p1, ": make sure class name exists, is public, and has an empty constructor that is public"
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1, p0}, Lbl$b;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V */
/* throw p2 */
/* :catch_3 */
/* move-exception p0 */
/* new-instance p2, Lbl$b; */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "Unable to instantiate fragment "; // const-string v1, "Unable to instantiate fragment "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ": make sure class name exists, is public, and has an empty constructor that is public"; // const-string p1, ": make sure class name exists, is public, and has an empty constructor that is public"
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1, p0}, Lbl$b;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V */
/* throw p2 */
/* :catch_4 */
/* move-exception p0 */
/* new-instance p2, Lbl$b; */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "Unable to instantiate fragment "; // const-string v1, "Unable to instantiate fragment "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ": make sure class name exists, is public, and has an empty constructor that is public"; // const-string p1, ": make sure class name exists, is public, and has an empty constructor that is public"
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1, p0}, Lbl$b;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V */
/* throw p2 */
} // .end method
static Boolean a ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 1 */
try { // :try_start_0
v0 = bl.a;
(( du ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ldu;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Class; */
/* if-nez v0, :cond_0 */
(( android.content.Context ) p0 ).getClassLoader ( ); // invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;
(( java.lang.ClassLoader ) p0 ).loadClass ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
p0 = bl.a;
(( du ) p0 ).put ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Ldu;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_0
/* const-class p0, Lbl; */
p0 = (( java.lang.Class ) p0 ).isAssignableFrom ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
int p0 = 0; // const/4 p0, 0x0
} // .end method
private void j ( ) {
/* .locals 3 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v0, Lbq; */
/* invoke-direct {v0}, Lbq;-><init>()V */
this.b = v0;
v0 = this.b;
v1 = this.a;
/* new-instance v2, Lbl$2; */
/* invoke-direct {v2, p0}, Lbl$2;-><init>(Lbl;)V */
(( bq ) v0 ).a ( v1, v2, p0 ); // invoke-virtual {v0, v1, v2, p0}, Lbq;->a(Lbo;Lbm;Lbl;)V
return;
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Fragment has not been attached yet."; // const-string v1, "Fragment has not been attached yet."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
/* # virtual methods */
final Integer a ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
/* iget v0, v0, Lbl$a;->b:I */
} // .end method
final android.animation.Animator a ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = this.a;
} // .end method
public final android.content.Context a ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = this.a;
} // .end method
final android.support.v4.app.FragmentActivity a ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = this.a;
/* check-cast v0, Landroid/support/v4/app/FragmentActivity; */
} // .end method
final android.view.LayoutInflater a ( ) {
/* .locals 3 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_4
(( bo ) v0 ).a ( ); // invoke-virtual {v0}, Lbo;->a()Landroid/view/LayoutInflater;
v1 = this.b;
/* if-nez v1, :cond_3 */
/* invoke-direct {p0}, Lbl;->j()V */
/* iget v1, p0, Lbl;->a:I */
int v2 = 4; // const/4 v2, 0x4
/* if-lt v1, v2, :cond_0 */
v1 = this.b;
(( bq ) v1 ).g ( ); // invoke-virtual {v1}, Lbq;->g()V
} // :cond_0
int v2 = 3; // const/4 v2, 0x3
/* if-lt v1, v2, :cond_1 */
v1 = this.b;
(( bq ) v1 ).f ( ); // invoke-virtual {v1}, Lbq;->f()V
} // :cond_1
int v2 = 2; // const/4 v2, 0x2
/* if-lt v1, v2, :cond_2 */
v1 = this.b;
(( bq ) v1 ).e ( ); // invoke-virtual {v1}, Lbq;->e()V
} // :cond_2
/* if-lez v1, :cond_3 */
v1 = this.b;
(( bq ) v1 ).d ( ); // invoke-virtual {v1}, Lbq;->d()V
} // :cond_3
} // :goto_0
v1 = this.b;
eb .a ( v0,v1 );
this.a = v0;
v0 = this.a;
} // :cond_4
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."; // const-string v1, "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
final android.view.View a ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = this.a;
} // .end method
final bl a ( java.lang.String p0 ) {
/* .locals 1 */
v0 = this.a;
v0 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
(( bq ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lbq;->b(Ljava/lang/String;)Lbl;
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
final cb a ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = this.a;
} // .end method
public final h a ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public final java.lang.Object a ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = this.a;
} // .end method
public final u a ( ) {
/* .locals 2 */
(( bl ) p0 ).a ( ); // invoke-virtual {p0}, Lbl;->a()Landroid/content/Context;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lu; */
/* invoke-direct {v0}, Lu;-><init>()V */
this.a = v0;
} // :cond_0
v0 = this.a;
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Can\'t access ViewModels from detached fragment"; // const-string v1, "Can\'t access ViewModels from detached fragment"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public final void a ( ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lbl;->m:Z */
v1 = this.a;
/* if-nez v1, :cond_0 */
int v1 = 0; // const/4 v1, 0x0
} // :cond_0
v1 = this.a;
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lbl;->m:Z */
/* iput-boolean v0, p0, Lbl;->m:Z */
} // :cond_1
return;
} // .end method
final void a ( Integer p0 ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* if-nez p1, :cond_0 */
return;
} // :cond_0
/* invoke-direct {p0}, Lbl;->a()Lbl$a; */
/* iput p1, v0, Lbl$a;->b:I */
return;
} // .end method
final void a ( Integer p0, Integer p1 ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* if-nez p1, :cond_0 */
/* if-nez p2, :cond_0 */
return;
} // :cond_0
/* invoke-direct {p0}, Lbl;->a()Lbl$a; */
v0 = this.a;
/* iput p1, v0, Lbl$a;->c:I */
/* iput p2, v0, Lbl$a;->d:I */
return;
} // .end method
final void a ( Integer p0, bl p1 ) {
/* .locals 0 */
/* iput p1, p0, Lbl;->b:I */
if ( p2 != null) { // if-eqz p2, :cond_0
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
p2 = this.a;
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p2 = ":"; // const-string p2, ":"
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :goto_0
/* iget p2, p0, Lbl;->b:I */
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.a = p1;
return;
} // :cond_0
/* new-instance p1, Ljava/lang/StringBuilder; */
final String p2 = "android:fragment:"; // const-string p2, "android:fragment:"
/* invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
} // .end method
final void a ( android.animation.Animator p0 ) {
/* .locals 1 */
/* invoke-direct {p0}, Lbl;->a()Lbl$a; */
this.a = p1;
return;
} // .end method
final void a ( android.content.res.Configuration p0 ) {
/* .locals 1 */
(( bl ) p0 ).onConfigurationChanged ( p1 ); // invoke-virtual {p0, p1}, Lbl;->onConfigurationChanged(Landroid/content/res/Configuration;)V
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
(( bq ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lbq;->a(Landroid/content/res/Configuration;)V
} // :cond_0
return;
} // .end method
final void a ( android.os.Bundle p0 ) {
/* .locals 2 */
if ( p1 != null) { // if-eqz p1, :cond_1
final String v0 = "android:support:fragments"; // const-string v0, "android:support:fragments"
(( android.os.Bundle ) p1 ).getParcelable ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
if ( p1 != null) { // if-eqz p1, :cond_1
v0 = this.b;
/* if-nez v0, :cond_0 */
/* invoke-direct {p0}, Lbl;->j()V */
} // :cond_0
v0 = this.b;
v1 = this.a;
(( bq ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lbq;->a(Landroid/os/Parcelable;Lbr;)V
int p1 = 0; // const/4 p1, 0x0
this.a = p1;
p1 = this.b;
(( bq ) p1 ).d ( ); // invoke-virtual {p1}, Lbq;->d()V
} // :cond_1
return;
} // .end method
final void a ( android.view.Menu p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lbl;->g:Z */
/* if-nez v0, :cond_0 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
(( bq ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lbq;->a(Landroid/view/Menu;)V
} // :cond_0
return;
} // .end method
final void a ( android.view.View p0 ) {
/* .locals 1 */
/* invoke-direct {p0}, Lbl;->a()Lbl$a; */
this.a = p1;
return;
} // .end method
final void a ( bl$c p0 ) {
/* .locals 2 */
/* invoke-direct {p0}, Lbl;->a()Lbl$a; */
v0 = this.a;
v0 = this.a;
/* if-ne p1, v0, :cond_0 */
return;
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_2
v0 = this.a;
v0 = this.a;
/* if-nez v0, :cond_1 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
java.lang.String .valueOf ( p0 );
final String v1 = "Trying to set a replacement startPostponedEnterTransition on "; // const-string v1, "Trying to set a replacement startPostponedEnterTransition on "
(( java.lang.String ) v1 ).concat ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_2
} // :goto_0
v0 = this.a;
/* iget-boolean v0, v0, Lbl$a;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.a;
this.a = p1;
} // :cond_3
if ( p1 != null) { // if-eqz p1, :cond_4
} // :cond_4
return;
} // .end method
final void a ( Boolean p0 ) {
/* .locals 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
(( bq ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lbq;->a(Z)V
} // :cond_0
return;
} // .end method
final Boolean a ( ) {
/* .locals 1 */
/* iget v0, p0, Lbl;->e:I */
/* if-lez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
final Boolean a ( android.view.Menu p0 ) {
/* .locals 2 */
/* iget-boolean v0, p0, Lbl;->g:Z */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_1 */
/* iget-boolean v0, p0, Lbl;->k:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lbl;->l:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
p1 = (( bq ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lbq;->a(Landroid/view/Menu;)Z
/* or-int/2addr v1, p1 */
} // :cond_1
} // .end method
final Boolean a ( android.view.Menu p0, android.view.MenuInflater p1 ) {
/* .locals 2 */
/* iget-boolean v0, p0, Lbl;->g:Z */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_1 */
/* iget-boolean v0, p0, Lbl;->k:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lbl;->l:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
p1 = (( bq ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lbq;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
/* or-int/2addr v1, p1 */
} // :cond_1
} // .end method
final Boolean a ( android.view.MenuItem p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lbl;->g:Z */
/* if-nez v0, :cond_0 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = (( bq ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lbq;->a(Landroid/view/MenuItem;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
final Integer b ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
/* iget v0, v0, Lbl$a;->c:I */
} // .end method
final cb b ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = this.b;
} // .end method
public final java.lang.Object b ( ) {
/* .locals 2 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = this.b;
v1 = bl.a;
/* if-ne v0, v1, :cond_1 */
(( bl ) p0 ).a ( ); // invoke-virtual {p0}, Lbl;->a()Ljava/lang/Object;
} // :cond_1
v0 = this.a;
v0 = this.b;
} // .end method
public final void b ( ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.a;
/* if-nez v0, :cond_0 */
} // :cond_0
android.os.Looper .myLooper ( );
v1 = this.a;
v1 = this.a;
v1 = this.a;
(( android.os.Handler ) v1 ).getLooper ( ); // invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;
/* if-eq v0, v1, :cond_1 */
v0 = this.a;
v0 = this.a;
v0 = this.a;
/* new-instance v1, Lbl$1; */
/* invoke-direct {v1, p0}, Lbl$1;-><init>(Lbl;)V */
(( android.os.Handler ) v0 ).postAtFrontOfQueue ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z
return;
} // :cond_1
(( bl ) p0 ).c ( ); // invoke-virtual {p0}, Lbl;->c()V
return;
} // :cond_2
} // :goto_0
/* invoke-direct {p0}, Lbl;->a()Lbl$a; */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, v0, Lbl$a;->a:Z */
return;
} // .end method
final void b ( Integer p0 ) {
/* .locals 1 */
/* invoke-direct {p0}, Lbl;->a()Lbl$a; */
/* iput p1, v0, Lbl$a;->a:I */
return;
} // .end method
final void b ( android.os.Bundle p0 ) {
/* .locals 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
(( bq ) v0 ).c ( ); // invoke-virtual {v0}, Lbq;->c()V
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput v0, p0, Lbl;->a:I */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lbl;->m:Z */
/* iput-boolean v0, p0, Lbl;->m:Z */
(( bl ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lbl;->a(Landroid/os/Bundle;)V
p1 = this.b;
if ( p1 != null) { // if-eqz p1, :cond_2
/* iget p1, p1, Lbq;->b:I */
/* if-lez p1, :cond_1 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_1
/* if-nez v1, :cond_2 */
p1 = this.b;
(( bq ) p1 ).d ( ); // invoke-virtual {p1}, Lbq;->d()V
} // :cond_2
/* iput-boolean v0, p0, Lbl;->r:Z */
/* iget-boolean p1, p0, Lbl;->m:Z */
if ( p1 != null) { // if-eqz p1, :cond_3
p1 = this.a;
v0 = h$a.ON_CREATE;
(( k ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lk;->a(Lh$a;)V
return;
} // :cond_3
/* new-instance p1, Lcc; */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "Fragment "; // const-string v1, "Fragment "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " did not call through to super.onCreate()"; // const-string v1, " did not call through to super.onCreate()"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Lcc;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
final void b ( Boolean p0 ) {
/* .locals 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
(( bq ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lbq;->b(Z)V
} // :cond_0
return;
} // .end method
public final Boolean b ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.b;
/* if-nez v0, :cond_0 */
} // :cond_0
v0 = this.a;
v0 = this.b;
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
final Boolean b ( android.view.MenuItem p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lbl;->g:Z */
/* if-nez v0, :cond_0 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = (( bq ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lbq;->b(Landroid/view/MenuItem;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
final Integer c ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
/* iget v0, v0, Lbl$a;->d:I */
} // .end method
public final java.lang.Object c ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = this.c;
} // .end method
final void c ( ) {
/* .locals 3 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* move-object v0, v1 */
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* iput-boolean v2, v0, Lbl$a;->a:Z */
v0 = this.a;
v2 = this.a;
this.a = v1;
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_1
return;
} // .end method
final void c ( android.os.Bundle p0 ) {
/* .locals 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
(( bq ) v0 ).a ( ); // invoke-virtual {v0}, Lbq;->a()Landroid/os/Parcelable;
if ( v0 != null) { // if-eqz v0, :cond_0
final String v1 = "android:support:fragments"; // const-string v1, "android:support:fragments"
(( android.os.Bundle ) p1 ).putParcelable ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
} // :cond_0
return;
} // .end method
final void c ( Boolean p0 ) {
/* .locals 1 */
/* invoke-direct {p0}, Lbl;->a()Lbl$a; */
/* iput-boolean p1, v0, Lbl$a;->b:Z */
return;
} // .end method
public final Boolean c ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
/* if-nez v0, :cond_0 */
} // :cond_0
v0 = this.a;
v0 = this.a;
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
final Integer d ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
/* iget v0, v0, Lbl$a;->a:I */
} // .end method
public final java.lang.Object d ( ) {
/* .locals 2 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = this.d;
v1 = bl.a;
/* if-ne v0, v1, :cond_1 */
(( bl ) p0 ).c ( ); // invoke-virtual {p0}, Lbl;->c()Ljava/lang/Object;
} // :cond_1
v0 = this.a;
v0 = this.d;
} // .end method
final void d ( ) {
/* .locals 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
(( bq ) v0 ).c ( ); // invoke-virtual {v0}, Lbq;->c()V
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lbl;->f:Z */
/* new-instance v0, Lbl$3; */
/* invoke-direct {v0, p0}, Lbl$3;-><init>(Lbl;)V */
this.a = v0;
int v0 = 0; // const/4 v0, 0x0
this.b = v0;
this.a = v0;
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_1
v0 = this.a;
v0 = this.a;
v1 = this.a;
(( o ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lo;->a(Ljava/lang/Object;)V
return;
} // :cond_1
v1 = this.b;
/* if-nez v1, :cond_2 */
this.a = v0;
return;
} // :cond_2
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Called getViewLifecycleOwner() but onCreateView() returned null"; // const-string v1, "Called getViewLifecycleOwner() but onCreateView() returned null"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
final Boolean d ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
/* iget-boolean v0, v0, Lbl$a;->a:Z */
} // .end method
public final java.lang.Object e ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = this.e;
} // .end method
final void e ( ) {
/* .locals 3 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
(( bq ) v0 ).c ( ); // invoke-virtual {v0}, Lbq;->c()V
} // :cond_0
int v0 = 2; // const/4 v0, 0x2
/* iput v0, p0, Lbl;->a:I */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lbl;->m:Z */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lbl;->m:Z */
/* iget-boolean v0, p0, Lbl;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
(( bq ) v0 ).e ( ); // invoke-virtual {v0}, Lbq;->e()V
} // :cond_1
return;
} // :cond_2
/* new-instance v0, Lcc; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Fragment "; // const-string v2, "Fragment "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " did not call through to super.onActivityCreated()"; // const-string v2, " did not call through to super.onActivityCreated()"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lcc;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
final Boolean e ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
/* iget-boolean v0, v0, Lbl$a;->b:Z */
} // .end method
public final Boolean equals ( java.lang.Object p0 ) {
/* .locals 0 */
p1 = /* invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z */
} // .end method
public final java.lang.Object f ( ) {
/* .locals 2 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = this.f;
v1 = bl.a;
/* if-ne v0, v1, :cond_1 */
(( bl ) p0 ).e ( ); // invoke-virtual {p0}, Lbl;->e()Ljava/lang/Object;
} // :cond_1
v0 = this.a;
v0 = this.f;
} // .end method
final void f ( ) {
/* .locals 3 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
(( bq ) v0 ).c ( ); // invoke-virtual {v0}, Lbq;->c()V
v0 = this.b;
(( bq ) v0 ).d ( ); // invoke-virtual {v0}, Lbq;->d()Z
} // :cond_0
int v0 = 3; // const/4 v0, 0x3
/* iput v0, p0, Lbl;->a:I */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lbl;->m:Z */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lbl;->m:Z */
/* iget-boolean v0, p0, Lbl;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
(( bq ) v0 ).f ( ); // invoke-virtual {v0}, Lbq;->f()V
} // :cond_1
v0 = this.a;
v1 = h$a.ON_START;
(( k ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lk;->a(Lh$a;)V
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.b;
v1 = h$a.ON_START;
(( k ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lk;->a(Lh$a;)V
} // :cond_2
return;
} // :cond_3
/* new-instance v0, Lcc; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Fragment "; // const-string v2, "Fragment "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " did not call through to super.onStart()"; // const-string v2, " did not call through to super.onStart()"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lcc;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
final void g ( ) {
/* .locals 3 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
(( bq ) v0 ).c ( ); // invoke-virtual {v0}, Lbq;->c()V
v0 = this.b;
(( bq ) v0 ).d ( ); // invoke-virtual {v0}, Lbq;->d()Z
} // :cond_0
int v0 = 4; // const/4 v0, 0x4
/* iput v0, p0, Lbl;->a:I */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lbl;->m:Z */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lbl;->m:Z */
/* iget-boolean v0, p0, Lbl;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
(( bq ) v0 ).g ( ); // invoke-virtual {v0}, Lbq;->g()V
v0 = this.b;
(( bq ) v0 ).d ( ); // invoke-virtual {v0}, Lbq;->d()Z
} // :cond_1
v0 = this.a;
v1 = h$a.ON_RESUME;
(( k ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lk;->a(Lh$a;)V
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.b;
v1 = h$a.ON_RESUME;
(( k ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lk;->a(Lh$a;)V
} // :cond_2
return;
} // :cond_3
/* new-instance v0, Lcc; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Fragment "; // const-string v2, "Fragment "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " did not call through to super.onResume()"; // const-string v2, " did not call through to super.onResume()"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lcc;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
final void h ( ) {
/* .locals 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
(( bq ) v0 ).c ( ); // invoke-virtual {v0}, Lbq;->c()V
} // :cond_0
return;
} // .end method
public final Integer hashCode ( ) {
/* .locals 1 */
v0 = /* invoke-super {p0}, Ljava/lang/Object;->hashCode()I */
} // .end method
final void i ( ) {
/* .locals 1 */
(( bl ) p0 ).onLowMemory ( ); // invoke-virtual {p0}, Lbl;->onLowMemory()V
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
(( bq ) v0 ).j ( ); // invoke-virtual {v0}, Lbq;->j()V
} // :cond_0
return;
} // .end method
public void onConfigurationChanged ( android.content.res.Configuration p0 ) {
/* .locals 0 */
int p1 = 1; // const/4 p1, 0x1
/* iput-boolean p1, p0, Lbl;->m:Z */
return;
} // .end method
public void onCreateContextMenu ( android.view.ContextMenu p0, android.view.View p1, android.view.ContextMenu$ContextMenuInfo p2 ) {
/* .locals 1 */
(( bl ) p0 ).a ( ); // invoke-virtual {p0}, Lbl;->a()Landroid/support/v4/app/FragmentActivity;
(( android.support.v4.app.FragmentActivity ) v0 ).onCreateContextMenu ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/app/FragmentActivity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
return;
} // .end method
public void onLowMemory ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lbl;->m:Z */
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* const/16 v1, 0x80 */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
dm .a ( p0,v0 );
/* iget v1, p0, Lbl;->b:I */
/* if-ltz v1, :cond_0 */
final String v1 = " #"; // const-string v1, " #"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lbl;->b:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
} // :cond_0
/* iget v1, p0, Lbl;->f:I */
if ( v1 != null) { // if-eqz v1, :cond_1
final String v1 = " id=0x"; // const-string v1, " id=0x"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lbl;->f:I */
java.lang.Integer .toHexString ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_1
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_2
final String v1 = " "; // const-string v1, " "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_2
/* const/16 v1, 0x7d */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
