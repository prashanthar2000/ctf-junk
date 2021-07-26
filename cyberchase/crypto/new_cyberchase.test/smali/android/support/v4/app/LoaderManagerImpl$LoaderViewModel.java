class android.support.v4.app.LoaderManagerImpl$LoaderViewModel extends s {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/support/v4/app/LoaderManagerImpl; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = "LoaderViewModel" */
} // .end annotation
/* # static fields */
private static final t$a a;
/* # instance fields */
dv a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ldv<", */
/* "Landroid/support/v4/app/LoaderManagerImpl$a;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private Boolean a;
/* # direct methods */
static android.support.v4.app.LoaderManagerImpl$LoaderViewModel ( ) {
/* .locals 1 */
/* new-instance v0, Landroid/support/v4/app/LoaderManagerImpl$LoaderViewModel$1; */
/* invoke-direct {v0}, Landroid/support/v4/app/LoaderManagerImpl$LoaderViewModel$1;-><init>()V */
return;
} // .end method
 android.support.v4.app.LoaderManagerImpl$LoaderViewModel ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Ls;-><init>()V */
/* new-instance v0, Ldv; */
/* invoke-direct {v0}, Ldv;-><init>()V */
this.a = v0;
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderViewModel;->a:Z */
return;
} // .end method
static android.support.v4.app.LoaderManagerImpl$LoaderViewModel a ( u p0 ) {
/* .locals 3 */
/* new-instance v0, Lt; */
v1 = android.support.v4.app.LoaderManagerImpl$LoaderViewModel.a;
/* invoke-direct {v0, p0, v1}, Lt;-><init>(Lu;Lt$a;)V */
/* const-class p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderViewModel; */
(( java.lang.Class ) p0 ).getCanonicalName ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_1
final String v2 = "android.arch.lifecycle.ViewModelProvider.DefaultKey:"; // const-string v2, "android.arch.lifecycle.ViewModelProvider.DefaultKey:"
java.lang.String .valueOf ( v1 );
(( java.lang.String ) v2 ).concat ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
v2 = this.a;
v2 = this.a;
(( java.util.HashMap ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v2, Ls; */
p0 = (( java.lang.Class ) p0 ).isInstance ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z
if ( p0 != null) { // if-eqz p0, :cond_0
} // :cond_0
p0 = this.a;
p0 = this.a;
(( u ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lu;->a(Ljava/lang/String;Ls;)V
} // :goto_0
/* check-cast v2, Landroid/support/v4/app/LoaderManagerImpl$LoaderViewModel; */
} // :cond_1
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String v0 = "Local and anonymous classes can not be ViewModels"; // const-string v0, "Local and anonymous classes can not be ViewModels"
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
/* # virtual methods */
public final void a ( ) {
/* .locals 6 */
/* invoke-super {p0}, Ls;->a()V */
v0 = this.a;
v0 = (( dv ) v0 ).a ( ); // invoke-virtual {v0}, Ldv;->a()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_0 */
v3 = this.a;
(( dv ) v3 ).a ( v2 ); // invoke-virtual {v3, v2}, Ldv;->a(I)Ljava/lang/Object;
/* check-cast v3, Landroid/support/v4/app/LoaderManagerImpl$a; */
(( android.support.v4.app.LoaderManagerImpl$a ) v3 ).a ( ); // invoke-virtual {v3}, Landroid/support/v4/app/LoaderManagerImpl$a;->a()Lcf;
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
v0 = this.a;
/* iget v2, v0, Ldv;->a:I */
v3 = this.a;
int v4 = 0; // const/4 v4, 0x0
} // :goto_1
/* if-ge v4, v2, :cond_1 */
int v5 = 0; // const/4 v5, 0x0
/* aput-object v5, v3, v4 */
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_1
/* iput v1, v0, Ldv;->a:I */
/* iput-boolean v1, v0, Ldv;->a:Z */
return;
} // .end method
