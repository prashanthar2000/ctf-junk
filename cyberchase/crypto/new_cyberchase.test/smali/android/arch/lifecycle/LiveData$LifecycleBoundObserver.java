public class android.arch.lifecycle.LiveData$LifecycleBoundObserver extends android.arch.lifecycle.LiveData$a implements android.arch.lifecycle.GenericLifecycleObserver {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/arch/lifecycle/LiveData; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "LifecycleBoundObserver" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/arch/lifecycle/LiveData<", */
/* "TT;>.a;", */
/* "Landroid/arch/lifecycle/GenericLifecycleObserver;" */
/* } */
} // .end annotation
/* # instance fields */
final android.arch.lifecycle.LiveData a; //synthetic
final j a;
/* # direct methods */
public android.arch.lifecycle.LiveData$LifecycleBoundObserver ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lj;", */
/* "Lp<", */
/* "TT;>;)V" */
/* } */
} // .end annotation
this.a = p1;
/* invoke-direct {p0, p1, p3}, Landroid/arch/lifecycle/LiveData$a;-><init>(Landroid/arch/lifecycle/LiveData;Lp;)V */
this.a = p2;
return;
} // .end method
/* # virtual methods */
final void a ( ) {
/* .locals 1 */
v0 = this.a;
(( h ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Lh;->b(Li;)V
return;
} // .end method
public final void a ( j p0, h$a p1 ) {
/* .locals 0 */
p1 = this.a;
(( h ) p1 ).a ( ); // invoke-virtual {p1}, Lh;->a()Lh$b;
p2 = h$b.a;
/* if-ne p1, p2, :cond_0 */
p1 = this.a;
p2 = this.a;
(( android.arch.lifecycle.LiveData ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Landroid/arch/lifecycle/LiveData;->a(Lp;)V
return;
} // :cond_0
p1 = (( android.arch.lifecycle.LiveData$LifecycleBoundObserver ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/arch/lifecycle/LiveData$LifecycleBoundObserver;->a()Z
(( android.arch.lifecycle.LiveData$LifecycleBoundObserver ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroid/arch/lifecycle/LiveData$LifecycleBoundObserver;->a(Z)V
return;
} // .end method
final Boolean a ( ) {
/* .locals 2 */
v0 = this.a;
(( h ) v0 ).a ( ); // invoke-virtual {v0}, Lh;->a()Lh$b;
v1 = h$b.d;
v0 = (( h$b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lh$b;->a(Lh$b;)Z
} // .end method
final Boolean a ( j p0 ) {
/* .locals 1 */
v0 = this.a;
/* if-ne v0, p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
