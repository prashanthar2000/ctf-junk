public abstract class android.arch.lifecycle.LiveData$a {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/arch/lifecycle/LiveData; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x401 */
/* name = "a" */
} // .end annotation
/* # instance fields */
Integer a;
final p a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lp<", */
/* "TT;>;" */
/* } */
} // .end annotation
} // .end field
Boolean a;
final android.arch.lifecycle.LiveData b; //synthetic
/* # direct methods */
 android.arch.lifecycle.LiveData$a ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lp<", */
/* "TT;>;)V" */
/* } */
} // .end annotation
this.b = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int p1 = -1; // const/4 p1, -0x1
/* iput p1, p0, Landroid/arch/lifecycle/LiveData$a;->a:I */
this.a = p2;
return;
} // .end method
/* # virtual methods */
void a ( ) {
/* .locals 0 */
return;
} // .end method
final void a ( Boolean p0 ) {
/* .locals 4 */
/* iget-boolean v0, p0, Landroid/arch/lifecycle/LiveData$a;->a:Z */
/* if-ne p1, v0, :cond_0 */
return;
} // :cond_0
/* iput-boolean p1, p0, Landroid/arch/lifecycle/LiveData$a;->a:Z */
p1 = this.b;
p1 = android.arch.lifecycle.LiveData .a ( p1 );
int v0 = 1; // const/4 v0, 0x1
/* if-nez p1, :cond_1 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
v1 = this.b;
v2 = android.arch.lifecycle.LiveData .a ( v1 );
/* iget-boolean v3, p0, Landroid/arch/lifecycle/LiveData$a;->a:Z */
if ( v3 != null) { // if-eqz v3, :cond_2
} // :cond_2
int v0 = -1; // const/4 v0, -0x1
} // :goto_1
/* add-int/2addr v2, v0 */
android.arch.lifecycle.LiveData .a ( v1,v2 );
if ( p1 != null) { // if-eqz p1, :cond_3
/* iget-boolean p1, p0, Landroid/arch/lifecycle/LiveData$a;->a:Z */
if ( p1 != null) { // if-eqz p1, :cond_3
p1 = this.b;
(( android.arch.lifecycle.LiveData ) p1 ).a ( ); // invoke-virtual {p1}, Landroid/arch/lifecycle/LiveData;->a()V
} // :cond_3
p1 = this.b;
p1 = android.arch.lifecycle.LiveData .a ( p1 );
/* if-nez p1, :cond_4 */
/* iget-boolean p1, p0, Landroid/arch/lifecycle/LiveData$a;->a:Z */
/* if-nez p1, :cond_4 */
p1 = this.b;
(( android.arch.lifecycle.LiveData ) p1 ).b ( ); // invoke-virtual {p1}, Landroid/arch/lifecycle/LiveData;->b()V
} // :cond_4
/* iget-boolean p1, p0, Landroid/arch/lifecycle/LiveData$a;->a:Z */
if ( p1 != null) { // if-eqz p1, :cond_5
p1 = this.b;
android.arch.lifecycle.LiveData .a ( p1,p0 );
} // :cond_5
return;
} // .end method
abstract Boolean a ( ) {
} // .end method
public Boolean a ( j p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
