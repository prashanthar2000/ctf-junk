public abstract class android.arch.lifecycle.LiveData {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/arch/lifecycle/LiveData$a;, */
	 /* Landroid/arch/lifecycle/LiveData$LifecycleBoundObserver; */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">", */
/* "Ljava/lang/Object;" */
/* } */
} // .end annotation
/* # static fields */
public static final java.lang.Object a;
/* # instance fields */
public Integer a;
protected e a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le<", */
/* "Lp<", */
/* "TT;>;", */
/* "Landroid/arch/lifecycle/LiveData<", */
/* "TT;>.a;>;" */
/* } */
} // .end annotation
} // .end field
private final java.lang.Runnable a;
private Boolean a;
private Integer b;
public volatile java.lang.Object b;
private Boolean b;
private final java.lang.Object c;
private volatile java.lang.Object d;
/* # direct methods */
static android.arch.lifecycle.LiveData ( ) {
/* .locals 1 */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public android.arch.lifecycle.LiveData ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
this.c = v0;
/* new-instance v0, Le; */
/* invoke-direct {v0}, Le;-><init>()V */
this.a = v0;
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Landroid/arch/lifecycle/LiveData;->a:I */
v0 = android.arch.lifecycle.LiveData.a;
this.b = v0;
this.d = v0;
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Landroid/arch/lifecycle/LiveData;->b:I */
/* new-instance v0, Landroid/arch/lifecycle/LiveData$1; */
/* invoke-direct {v0, p0}, Landroid/arch/lifecycle/LiveData$1;-><init>(Landroid/arch/lifecycle/LiveData;)V */
this.a = v0;
return;
} // .end method
static Integer a ( android.arch.lifecycle.LiveData p0 ) { //synthethic
/* .locals 0 */
/* iget p0, p0, Landroid/arch/lifecycle/LiveData;->a:I */
} // .end method
static Integer a ( android.arch.lifecycle.LiveData p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* iput p1, p0, Landroid/arch/lifecycle/LiveData;->a:I */
} // .end method
static java.lang.Object a ( ) { //synthethic
/* .locals 1 */
v0 = android.arch.lifecycle.LiveData.a;
} // .end method
static java.lang.Object a ( android.arch.lifecycle.LiveData p0 ) { //synthethic
/* .locals 0 */
p0 = this.c;
} // .end method
static java.lang.Object a ( android.arch.lifecycle.LiveData p0, java.lang.Object p1 ) { //synthethic
/* .locals 0 */
this.d = p1;
} // .end method
private void a ( android.arch.lifecycle.LiveData$a p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/arch/lifecycle/LiveData<", */
/* "TT;>.a;)V" */
/* } */
} // .end annotation
/* iget-boolean v0, p1, Landroid/arch/lifecycle/LiveData$a;->a:Z */
/* if-nez v0, :cond_0 */
return;
} // :cond_0
v0 = (( android.arch.lifecycle.LiveData$a ) p1 ).a ( ); // invoke-virtual {p1}, Landroid/arch/lifecycle/LiveData$a;->a()Z
/* if-nez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
(( android.arch.lifecycle.LiveData$a ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Landroid/arch/lifecycle/LiveData$a;->a(Z)V
return;
} // :cond_1
/* iget v0, p1, Landroid/arch/lifecycle/LiveData$a;->a:I */
/* iget v1, p0, Landroid/arch/lifecycle/LiveData;->b:I */
/* if-lt v0, v1, :cond_2 */
return;
} // :cond_2
/* iput v1, p1, Landroid/arch/lifecycle/LiveData$a;->a:I */
p1 = this.a;
v0 = this.b;
return;
} // .end method
static void a ( android.arch.lifecycle.LiveData p0, android.arch.lifecycle.LiveData$a p1 ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0, p1}, Landroid/arch/lifecycle/LiveData;->b(Landroid/arch/lifecycle/LiveData$a;)V */
return;
} // .end method
private static void a ( java.lang.String p0 ) {
/* .locals 3 */
a .a ( );
v0 = this.a;
v0 = (( c ) v0 ).a ( ); // invoke-virtual {v0}, Lc;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
return;
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Cannot invoke "; // const-string v2, "Cannot invoke "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p0 = " on a background thread"; // const-string p0, " on a background thread"
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
static java.lang.Object b ( android.arch.lifecycle.LiveData p0 ) { //synthethic
/* .locals 0 */
p0 = this.d;
} // .end method
private void b ( android.arch.lifecycle.LiveData$a p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/arch/lifecycle/LiveData<", */
/* "TT;>.a;)V" */
/* } */
} // .end annotation
/* iget-boolean v0, p0, Landroid/arch/lifecycle/LiveData;->a:Z */
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
/* iput-boolean v1, p0, Landroid/arch/lifecycle/LiveData;->b:Z */
return;
} // :cond_0
/* iput-boolean v1, p0, Landroid/arch/lifecycle/LiveData;->a:Z */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Landroid/arch/lifecycle/LiveData;->b:Z */
if ( p1 != null) { // if-eqz p1, :cond_2
/* invoke-direct {p0, p1}, Landroid/arch/lifecycle/LiveData;->a(Landroid/arch/lifecycle/LiveData$a;)V */
int p1 = 0; // const/4 p1, 0x0
} // :cond_2
v1 = this.a;
(( e ) v1 ).a ( ); // invoke-virtual {v1}, Le;->a()Le$d;
v2 = } // :cond_3
if ( v2 != null) { // if-eqz v2, :cond_4
/* check-cast v2, Ljava/util/Map$Entry; */
/* check-cast v2, Landroid/arch/lifecycle/LiveData$a; */
/* invoke-direct {p0, v2}, Landroid/arch/lifecycle/LiveData;->a(Landroid/arch/lifecycle/LiveData$a;)V */
/* iget-boolean v2, p0, Landroid/arch/lifecycle/LiveData;->b:Z */
if ( v2 != null) { // if-eqz v2, :cond_3
} // :cond_4
} // :goto_0
/* iget-boolean v1, p0, Landroid/arch/lifecycle/LiveData;->b:Z */
/* if-nez v1, :cond_1 */
/* iput-boolean v0, p0, Landroid/arch/lifecycle/LiveData;->a:Z */
return;
} // .end method
/* # virtual methods */
protected void a ( ) {
/* .locals 0 */
return;
} // .end method
protected void a ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)V" */
/* } */
} // .end annotation
final String v0 = "setValue"; // const-string v0, "setValue"
android.arch.lifecycle.LiveData .a ( v0 );
/* iget v0, p0, Landroid/arch/lifecycle/LiveData;->b:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Landroid/arch/lifecycle/LiveData;->b:I */
this.b = p1;
int p1 = 0; // const/4 p1, 0x0
/* invoke-direct {p0, p1}, Landroid/arch/lifecycle/LiveData;->b(Landroid/arch/lifecycle/LiveData$a;)V */
return;
} // .end method
public void a ( p p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lp<", */
/* "TT;>;)V" */
/* } */
} // .end annotation
final String v0 = "removeObserver"; // const-string v0, "removeObserver"
android.arch.lifecycle.LiveData .a ( v0 );
v0 = this.a;
(( e ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le;->a(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Landroid/arch/lifecycle/LiveData$a; */
/* if-nez p1, :cond_0 */
return;
} // :cond_0
(( android.arch.lifecycle.LiveData$a ) p1 ).a ( ); // invoke-virtual {p1}, Landroid/arch/lifecycle/LiveData$a;->a()V
int v0 = 0; // const/4 v0, 0x0
(( android.arch.lifecycle.LiveData$a ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Landroid/arch/lifecycle/LiveData$a;->a(Z)V
return;
} // .end method
protected void b ( ) {
/* .locals 0 */
return;
} // .end method
