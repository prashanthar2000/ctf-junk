public class android.support.v4.app.FragmentActivity extends android.support.v4.app.SupportActivity implements v {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/v4/app/FragmentActivity$a;, */
	 /* Landroid/support/v4/app/FragmentActivity$b; */
	 /* } */
} // .end annotation
/* # instance fields */
Integer a;
public final android.os.Handler a;
final bn a;
dv a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ldv<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private u a;
Boolean a;
Boolean b;
Boolean c;
Boolean d;
Boolean e;
/* # direct methods */
public android.support.v4.app.FragmentActivity ( ) {
/* .locals 2 */
/* invoke-direct {p0}, Landroid/support/v4/app/SupportActivity;-><init>()V */
/* new-instance v0, Landroid/support/v4/app/FragmentActivity$1; */
/* invoke-direct {v0, p0}, Landroid/support/v4/app/FragmentActivity$1;-><init>(Landroid/support/v4/app/FragmentActivity;)V */
this.a = v0;
/* new-instance v0, Landroid/support/v4/app/FragmentActivity$a; */
/* invoke-direct {v0, p0}, Landroid/support/v4/app/FragmentActivity$a;-><init>(Landroid/support/v4/app/FragmentActivity;)V */
/* new-instance v1, Lbn; */
/* invoke-direct {v1, v0}, Lbn;-><init>(Lbo;)V */
this.a = v1;
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->c:Z */
return;
} // .end method
private android.view.View a ( android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3 ) {
/* .locals 1 */
v0 = this.a;
(( bn ) v0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Lbn;->a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
} // .end method
private bp a ( ) {
/* .locals 1 */
v0 = this.a;
v0 = this.a;
v0 = this.a;
} // .end method
private static void a ( Integer p0 ) {
/* .locals 1 */
/* const/high16 v0, -0x10000 */
/* and-int/2addr p0, v0 */
/* if-nez p0, :cond_0 */
return;
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String v0 = "Can only use lower 16 bits for requestCode"; // const-string v0, "Can only use lower 16 bits for requestCode"
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
private static Boolean a ( bp p0, h$b p1 ) {
/* .locals 4 */
(( bp ) p0 ).a ( ); // invoke-virtual {p0}, Lbp;->a()Ljava/util/List;
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* check-cast v1, Lbl; */
if ( v1 != null) { // if-eqz v1, :cond_0
(( bl ) v1 ).a ( ); // invoke-virtual {v1}, Lbl;->a()Lh;
(( h ) v2 ).a ( ); // invoke-virtual {v2}, Lh;->a()Lh$b;
v3 = h$b.d;
v2 = (( h$b ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lh$b;->a(Lh$b;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
v0 = this.a;
(( k ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lk;->a(Lh$b;)V
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = android.support.v4.app.FragmentActivity .a ( v1,p1 );
/* or-int/2addr v0, v1 */
} // :cond_2
} // .end method
private void b ( ) {
/* .locals 2 */
} // :cond_0
/* invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;->a()Lbp; */
v1 = h$b.c;
v0 = android.support.v4.app.FragmentActivity .a ( v0,v1 );
/* if-nez v0, :cond_0 */
return;
} // .end method
/* # virtual methods */
public final h a ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/support/v4/app/SupportActivity;->a()Lh; */
} // .end method
public final u a ( ) {
/* .locals 2 */
(( android.support.v4.app.FragmentActivity ) p0 ).getApplication ( ); // invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getApplication()Landroid/app/Application;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.a;
/* if-nez v0, :cond_1 */
(( android.support.v4.app.FragmentActivity ) p0 ).getLastNonConfigurationInstance ( ); // invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getLastNonConfigurationInstance()Ljava/lang/Object;
/* check-cast v0, Landroid/support/v4/app/FragmentActivity$b; */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
this.a = v0;
} // :cond_0
v0 = this.a;
/* if-nez v0, :cond_1 */
/* new-instance v0, Lu; */
/* invoke-direct {v0}, Lu;-><init>()V */
this.a = v0;
} // :cond_1
v0 = this.a;
} // :cond_2
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Your activity is not yet attached to the Application instance.You can\'t request ViewModel before onCreate call."; // const-string v1, "Your activity is not yet attached to the Application instance.You can\'t request ViewModel before onCreate call."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void a ( ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
(( android.support.v4.app.FragmentActivity ) p0 ).invalidateOptionsMenu ( ); // invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->invalidateOptionsMenu()V
return;
} // .end method
public void dump ( java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3 ) {
/* .locals 2 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v4/app/SupportActivity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "Local FragmentActivity "; // const-string v0, "Local FragmentActivity "
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
v0 = java.lang.System .identityHashCode ( p0 );
java.lang.Integer .toHexString ( v0 );
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = " State:"; // const-string v0, " State:"
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " "; // const-string v1, " "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v1 = "mCreated="; // const-string v1, "mCreated="
(( java.io.PrintWriter ) p3 ).print ( v1 ); // invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->a:Z */
(( java.io.PrintWriter ) p3 ).print ( v1 ); // invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V
final String v1 = " mResumed="; // const-string v1, " mResumed="
(( java.io.PrintWriter ) p3 ).print ( v1 ); // invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->b:Z */
(( java.io.PrintWriter ) p3 ).print ( v1 ); // invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V
final String v1 = " mStopped="; // const-string v1, " mStopped="
(( java.io.PrintWriter ) p3 ).print ( v1 ); // invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->c:Z */
(( java.io.PrintWriter ) p3 ).print ( v1 ); // invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V
(( android.support.v4.app.FragmentActivity ) p0 ).getApplication ( ); // invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getApplication()Landroid/app/Application;
if ( v1 != null) { // if-eqz v1, :cond_0
by .a ( p0 );
(( by ) v1 ).a ( v0, p3 ); // invoke-virtual {v1, v0, p3}, Lby;->a(Ljava/lang/String;Ljava/io/PrintWriter;)V
} // :cond_0
v0 = this.a;
v0 = this.a;
v0 = this.a;
(( bp ) v0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Lbp;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
return;
} // .end method
protected void onActivityResult ( Integer p0, Integer p1, android.content.Intent p2 ) {
/* .locals 1 */
v0 = this.a;
(( bn ) v0 ).a ( ); // invoke-virtual {v0}, Lbn;->a()V
/* shr-int/lit8 v0, p1, 0x10 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* add-int/lit8 v0, v0, -0x1 */
p1 = this.a;
int p2 = 0; // const/4 p2, 0x0
(( dv ) p1 ).a ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Ldv;->a(ILjava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Ljava/lang/String; */
p2 = this.a;
(( dv ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Ldv;->a(I)V
/* if-nez p1, :cond_0 */
final String p1 = "FragmentActivity"; // const-string p1, "FragmentActivity"
final String p2 = "Activity result delivered for unknown Fragment."; // const-string p2, "Activity result delivered for unknown Fragment."
android.util.Log .w ( p1,p2 );
return;
} // :cond_0
p2 = this.a;
(( bn ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Lbn;->a(Ljava/lang/String;)Lbl;
/* if-nez p2, :cond_1 */
final String p2 = "FragmentActivity"; // const-string p2, "FragmentActivity"
final String p3 = "Activity result no fragment exists for who: "; // const-string p3, "Activity result no fragment exists for who: "
java.lang.String .valueOf ( p1 );
(( java.lang.String ) p3 ).concat ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
android.util.Log .w ( p2,p1 );
} // :cond_1
return;
} // :cond_2
bi .a ( );
v0 = if ( v0 != null) { // if-eqz v0, :cond_3
if ( v0 != null) { // if-eqz v0, :cond_3
return;
} // :cond_3
/* invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/SupportActivity;->onActivityResult(IILandroid/content/Intent;)V */
return;
} // .end method
public void onBackPressed ( ) {
/* .locals 4 */
v0 = this.a;
v0 = this.a;
v0 = this.a;
v1 = (( bp ) v0 ).c ( ); // invoke-virtual {v0}, Lbp;->c()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* const/16 v3, 0x19 */
/* if-gt v2, v3, :cond_0 */
return;
} // :cond_0
/* if-nez v1, :cond_1 */
v0 = (( bp ) v0 ).b ( ); // invoke-virtual {v0}, Lbp;->b()Z
/* if-nez v0, :cond_2 */
} // :cond_1
/* invoke-super {p0}, Landroid/support/v4/app/SupportActivity;->onBackPressed()V */
} // :cond_2
return;
} // .end method
public void onConfigurationChanged ( android.content.res.Configuration p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Landroid/support/v4/app/SupportActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V */
v0 = this.a;
(( bn ) v0 ).a ( ); // invoke-virtual {v0}, Lbn;->a()V
v0 = this.a;
v0 = this.a;
v0 = this.a;
(( bq ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lbq;->a(Landroid/content/res/Configuration;)V
return;
} // .end method
protected void onCreate ( android.os.Bundle p0 ) {
/* .locals 6 */
v0 = this.a;
v1 = this.a;
v1 = this.a;
v2 = this.a;
v0 = this.a;
int v3 = 0; // const/4 v3, 0x0
(( bq ) v1 ).a ( v2, v0, v3 ); // invoke-virtual {v1, v2, v0, v3}, Lbq;->a(Lbo;Lbm;Lbl;)V
/* invoke-super {p0, p1}, Landroid/support/v4/app/SupportActivity;->onCreate(Landroid/os/Bundle;)V */
(( android.support.v4.app.FragmentActivity ) p0 ).getLastNonConfigurationInstance ( ); // invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getLastNonConfigurationInstance()Ljava/lang/Object;
/* check-cast v0, Landroid/support/v4/app/FragmentActivity$b; */
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.a;
/* if-nez v1, :cond_0 */
v1 = this.a;
this.a = v1;
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
if ( p1 != null) { // if-eqz p1, :cond_4
final String v2 = "android:support:fragments"; // const-string v2, "android:support:fragments"
(( android.os.Bundle ) p1 ).getParcelable ( v2 ); // invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
v4 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
v3 = this.a;
} // :cond_1
v0 = this.a;
v0 = this.a;
(( bq ) v0 ).a ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lbq;->a(Landroid/os/Parcelable;Lbr;)V
final String v0 = "android:support:next_request_index"; // const-string v0, "android:support:next_request_index"
v0 = (( android.os.Bundle ) p1 ).containsKey ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
final String v0 = "android:support:next_request_index"; // const-string v0, "android:support:next_request_index"
v0 = (( android.os.Bundle ) p1 ).getInt ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
/* iput v0, p0, Landroid/support/v4/app/FragmentActivity;->a:I */
final String v0 = "android:support:request_indicies"; // const-string v0, "android:support:request_indicies"
(( android.os.Bundle ) p1 ).getIntArray ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I
final String v2 = "android:support:request_fragment_who"; // const-string v2, "android:support:request_fragment_who"
(( android.os.Bundle ) p1 ).getStringArray ( v2 ); // invoke-virtual {p1, v2}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_3
if ( p1 != null) { // if-eqz p1, :cond_3
/* array-length v2, v0 */
/* array-length v3, p1 */
/* if-eq v2, v3, :cond_2 */
} // :cond_2
/* new-instance v2, Ldv; */
/* array-length v3, v0 */
/* invoke-direct {v2, v3}, Ldv;-><init>(I)V */
this.a = v2;
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* array-length v3, v0 */
/* if-ge v2, v3, :cond_4 */
v3 = this.a;
/* aget v4, v0, v2 */
/* aget-object v5, p1, v2 */
(( dv ) v3 ).a ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ldv;->a(ILjava/lang/Object;)V
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_3
} // :goto_1
final String p1 = "FragmentActivity"; // const-string p1, "FragmentActivity"
final String v0 = "Invalid requestCode mapping in savedInstanceState."; // const-string v0, "Invalid requestCode mapping in savedInstanceState."
android.util.Log .w ( p1,v0 );
} // :cond_4
p1 = this.a;
/* if-nez p1, :cond_5 */
/* new-instance p1, Ldv; */
/* invoke-direct {p1}, Ldv;-><init>()V */
this.a = p1;
/* iput v1, p0, Landroid/support/v4/app/FragmentActivity;->a:I */
} // :cond_5
p1 = this.a;
p1 = this.a;
p1 = this.a;
(( bq ) p1 ).d ( ); // invoke-virtual {p1}, Lbq;->d()V
return;
} // .end method
public Boolean onCreatePanelMenu ( Integer p0, android.view.Menu p1 ) {
/* .locals 2 */
/* if-nez p1, :cond_0 */
p1 = /* invoke-super {p0, p1, p2}, Landroid/support/v4/app/SupportActivity;->onCreatePanelMenu(ILandroid/view/Menu;)Z */
v0 = this.a;
(( android.support.v4.app.FragmentActivity ) p0 ).getMenuInflater ( ); // invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getMenuInflater()Landroid/view/MenuInflater;
v0 = this.a;
v0 = this.a;
p2 = (( bq ) v0 ).a ( p2, v1 ); // invoke-virtual {v0, p2, v1}, Lbq;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
/* or-int/2addr p1, p2 */
} // :cond_0
p1 = /* invoke-super {p0, p1, p2}, Landroid/support/v4/app/SupportActivity;->onCreatePanelMenu(ILandroid/view/Menu;)Z */
} // .end method
public android.view.View onCreateView ( android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3 ) {
/* .locals 1 */
/* invoke-direct {p0, p1, p2, p3, p4}, Landroid/support/v4/app/FragmentActivity;->a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View; */
/* if-nez v0, :cond_0 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v4/app/SupportActivity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View; */
} // :cond_0
} // .end method
public android.view.View onCreateView ( java.lang.String p0, android.content.Context p1, android.util.AttributeSet p2 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0, p1, p2, p3}, Landroid/support/v4/app/FragmentActivity;->a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View; */
/* if-nez v0, :cond_0 */
/* invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/SupportActivity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View; */
} // :cond_0
} // .end method
protected void onDestroy ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/support/v4/app/SupportActivity;->onDestroy()V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( android.support.v4.app.FragmentActivity ) p0 ).isChangingConfigurations ( ); // invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->isChangingConfigurations()Z
/* if-nez v0, :cond_0 */
v0 = this.a;
(( u ) v0 ).a ( ); // invoke-virtual {v0}, Lu;->a()V
} // :cond_0
v0 = this.a;
v0 = this.a;
v0 = this.a;
(( bq ) v0 ).i ( ); // invoke-virtual {v0}, Lbq;->i()V
return;
} // .end method
public void onLowMemory ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/support/v4/app/SupportActivity;->onLowMemory()V */
v0 = this.a;
v0 = this.a;
v0 = this.a;
(( bq ) v0 ).j ( ); // invoke-virtual {v0}, Lbq;->j()V
return;
} // .end method
public Boolean onMenuItemSelected ( Integer p0, android.view.MenuItem p1 ) {
/* .locals 1 */
v0 = /* invoke-super {p0, p1, p2}, Landroid/support/v4/app/SupportActivity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_2
int v0 = 6; // const/4 v0, 0x6
/* if-eq p1, v0, :cond_1 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
p1 = this.a;
p1 = this.a;
p1 = this.a;
p1 = (( bq ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Lbq;->b(Landroid/view/MenuItem;)Z
} // :cond_2
p1 = this.a;
p1 = this.a;
p1 = this.a;
p1 = (( bq ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lbq;->a(Landroid/view/MenuItem;)Z
} // .end method
public void onMultiWindowModeChanged ( Boolean p0 ) {
/* .locals 1 */
v0 = this.a;
v0 = this.a;
v0 = this.a;
(( bq ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lbq;->a(Z)V
return;
} // .end method
protected void onNewIntent ( android.content.Intent p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1}, Landroid/support/v4/app/SupportActivity;->onNewIntent(Landroid/content/Intent;)V */
p1 = this.a;
(( bn ) p1 ).a ( ); // invoke-virtual {p1}, Lbn;->a()V
return;
} // .end method
public void onPanelClosed ( Integer p0, android.view.Menu p1 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
v0 = this.a;
v0 = this.a;
v0 = this.a;
(( bq ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Lbq;->a(Landroid/view/Menu;)V
} // :goto_0
/* invoke-super {p0, p1, p2}, Landroid/support/v4/app/SupportActivity;->onPanelClosed(ILandroid/view/Menu;)V */
return;
} // .end method
protected void onPause ( ) {
/* .locals 2 */
/* invoke-super {p0}, Landroid/support/v4/app/SupportActivity;->onPause()V */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->b:Z */
v0 = this.a;
int v1 = 2; // const/4 v1, 0x2
v0 = (( android.os.Handler ) v0 ).hasMessages ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( android.os.Handler ) v0 ).removeMessages ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
v0 = this.a;
(( bn ) v0 ).b ( ); // invoke-virtual {v0}, Lbn;->b()V
} // :cond_0
v0 = this.a;
v0 = this.a;
v0 = this.a;
int v1 = 3; // const/4 v1, 0x3
(( bq ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lbq;->a(I)V
return;
} // .end method
public void onPictureInPictureModeChanged ( Boolean p0 ) {
/* .locals 1 */
v0 = this.a;
v0 = this.a;
v0 = this.a;
(( bq ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lbq;->b(Z)V
return;
} // .end method
protected void onPostResume ( ) {
/* .locals 2 */
/* invoke-super {p0}, Landroid/support/v4/app/SupportActivity;->onPostResume()V */
v0 = this.a;
int v1 = 2; // const/4 v1, 0x2
(( android.os.Handler ) v0 ).removeMessages ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
v0 = this.a;
(( bn ) v0 ).b ( ); // invoke-virtual {v0}, Lbn;->b()V
v0 = this.a;
(( bn ) v0 ).a ( ); // invoke-virtual {v0}, Lbn;->a()Z
return;
} // .end method
public Boolean onPreparePanel ( Integer p0, android.view.View p1, android.view.Menu p2 ) {
/* .locals 0 */
/* if-nez p1, :cond_0 */
if ( p3 != null) { // if-eqz p3, :cond_0
int p1 = 0; // const/4 p1, 0x0
p1 = /* invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/SupportActivity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z */
p2 = this.a;
p2 = this.a;
p2 = this.a;
p2 = (( bq ) p2 ).a ( p3 ); // invoke-virtual {p2, p3}, Lbq;->a(Landroid/view/Menu;)Z
/* or-int/2addr p1, p2 */
} // :cond_0
p1 = /* invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/SupportActivity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z */
} // .end method
public void onRequestPermissionsResult ( Integer p0, java.lang.String[] p1, Integer[] p2 ) {
/* .locals 0 */
p2 = this.a;
(( bn ) p2 ).a ( ); // invoke-virtual {p2}, Lbn;->a()V
/* shr-int/lit8 p1, p1, 0x10 */
/* const p2, 0xffff */
/* and-int/2addr p1, p2 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* add-int/lit8 p1, p1, -0x1 */
p2 = this.a;
int p3 = 0; // const/4 p3, 0x0
(( dv ) p2 ).a ( p1, p3 ); // invoke-virtual {p2, p1, p3}, Ldv;->a(ILjava/lang/Object;)Ljava/lang/Object;
/* check-cast p2, Ljava/lang/String; */
p3 = this.a;
(( dv ) p3 ).a ( p1 ); // invoke-virtual {p3, p1}, Ldv;->a(I)V
/* if-nez p2, :cond_0 */
final String p1 = "FragmentActivity"; // const-string p1, "FragmentActivity"
final String p2 = "Activity result delivered for unknown Fragment."; // const-string p2, "Activity result delivered for unknown Fragment."
android.util.Log .w ( p1,p2 );
return;
} // :cond_0
p1 = this.a;
(( bn ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lbn;->a(Ljava/lang/String;)Lbl;
/* if-nez p1, :cond_1 */
final String p1 = "FragmentActivity"; // const-string p1, "FragmentActivity"
final String p3 = "Activity result no fragment exists for who: "; // const-string p3, "Activity result no fragment exists for who: "
java.lang.String .valueOf ( p2 );
(( java.lang.String ) p3 ).concat ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
android.util.Log .w ( p1,p2 );
} // :cond_1
return;
} // .end method
protected void onResume ( ) {
/* .locals 2 */
/* invoke-super {p0}, Landroid/support/v4/app/SupportActivity;->onResume()V */
v0 = this.a;
int v1 = 2; // const/4 v1, 0x2
(( android.os.Handler ) v0 ).sendEmptyMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->b:Z */
v0 = this.a;
(( bn ) v0 ).a ( ); // invoke-virtual {v0}, Lbn;->a()Z
return;
} // .end method
public final java.lang.Object onRetainNonConfigurationInstance ( ) {
/* .locals 3 */
v0 = this.a;
v0 = this.a;
v0 = this.a;
v1 = this.a;
bq .a ( v1 );
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
v2 = this.a;
/* if-nez v2, :cond_0 */
} // :cond_0
/* new-instance v2, Landroid/support/v4/app/FragmentActivity$b; */
/* invoke-direct {v2}, Landroid/support/v4/app/FragmentActivity$b;-><init>()V */
this.a = v1;
v1 = this.a;
this.a = v1;
this.a = v0;
} // .end method
protected void onSaveInstanceState ( android.os.Bundle p0 ) {
/* .locals 4 */
/* invoke-super {p0, p1}, Landroid/support/v4/app/SupportActivity;->onSaveInstanceState(Landroid/os/Bundle;)V */
/* invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;->b()V */
v0 = this.a;
v0 = this.a;
v0 = this.a;
(( bq ) v0 ).a ( ); // invoke-virtual {v0}, Lbq;->a()Landroid/os/Parcelable;
if ( v0 != null) { // if-eqz v0, :cond_0
final String v1 = "android:support:fragments"; // const-string v1, "android:support:fragments"
(( android.os.Bundle ) p1 ).putParcelable ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
} // :cond_0
v0 = this.a;
v0 = (( dv ) v0 ).a ( ); // invoke-virtual {v0}, Ldv;->a()I
/* if-lez v0, :cond_2 */
final String v0 = "android:support:next_request_index"; // const-string v0, "android:support:next_request_index"
/* iget v1, p0, Landroid/support/v4/app/FragmentActivity;->a:I */
(( android.os.Bundle ) p1 ).putInt ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
v0 = this.a;
v0 = (( dv ) v0 ).a ( ); // invoke-virtual {v0}, Ldv;->a()I
/* new-array v0, v0, [I */
v1 = this.a;
v1 = (( dv ) v1 ).a ( ); // invoke-virtual {v1}, Ldv;->a()I
/* new-array v1, v1, [Ljava/lang/String; */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
v3 = this.a;
v3 = (( dv ) v3 ).a ( ); // invoke-virtual {v3}, Ldv;->a()I
/* if-ge v2, v3, :cond_1 */
v3 = this.a;
v3 = (( dv ) v3 ).a ( v2 ); // invoke-virtual {v3, v2}, Ldv;->a(I)I
/* aput v3, v0, v2 */
v3 = this.a;
(( dv ) v3 ).a ( v2 ); // invoke-virtual {v3, v2}, Ldv;->a(I)Ljava/lang/Object;
/* check-cast v3, Ljava/lang/String; */
/* aput-object v3, v1, v2 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
final String v2 = "android:support:request_indicies"; // const-string v2, "android:support:request_indicies"
(( android.os.Bundle ) p1 ).putIntArray ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V
final String v0 = "android:support:request_fragment_who"; // const-string v0, "android:support:request_fragment_who"
(( android.os.Bundle ) p1 ).putStringArray ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V
} // :cond_2
return;
} // .end method
protected void onStart ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/support/v4/app/SupportActivity;->onStart()V */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->c:Z */
/* iget-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->a:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->a:Z */
v0 = this.a;
v0 = this.a;
v0 = this.a;
(( bq ) v0 ).e ( ); // invoke-virtual {v0}, Lbq;->e()V
} // :cond_0
v0 = this.a;
(( bn ) v0 ).a ( ); // invoke-virtual {v0}, Lbn;->a()V
v0 = this.a;
(( bn ) v0 ).a ( ); // invoke-virtual {v0}, Lbn;->a()Z
v0 = this.a;
v0 = this.a;
v0 = this.a;
(( bq ) v0 ).f ( ); // invoke-virtual {v0}, Lbq;->f()V
return;
} // .end method
public void onStateNotSaved ( ) {
/* .locals 1 */
v0 = this.a;
(( bn ) v0 ).a ( ); // invoke-virtual {v0}, Lbn;->a()V
return;
} // .end method
protected void onStop ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/support/v4/app/SupportActivity;->onStop()V */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->c:Z */
/* invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;->b()V */
v0 = this.a;
v0 = this.a;
v0 = this.a;
(( bq ) v0 ).h ( ); // invoke-virtual {v0}, Lbq;->h()V
return;
} // .end method
public void startActivityForResult ( android.content.Intent p0, Integer p1 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->e:Z */
/* if-nez v0, :cond_0 */
int v0 = -1; // const/4 v0, -0x1
/* if-eq p2, v0, :cond_0 */
android.support.v4.app.FragmentActivity .a ( p2 );
} // :cond_0
/* invoke-super {p0, p1, p2}, Landroid/support/v4/app/SupportActivity;->startActivityForResult(Landroid/content/Intent;I)V */
return;
} // .end method
public void startActivityForResult ( android.content.Intent p0, Integer p1, android.os.Bundle p2 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->e:Z */
/* if-nez v0, :cond_0 */
int v0 = -1; // const/4 v0, -0x1
/* if-eq p2, v0, :cond_0 */
android.support.v4.app.FragmentActivity .a ( p2 );
} // :cond_0
/* invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/SupportActivity;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V */
return;
} // .end method
public void startIntentSenderForResult ( android.content.IntentSender p0, Integer p1, android.content.Intent p2, Integer p3, Integer p4, Integer p5 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->d:Z */
/* if-nez v0, :cond_0 */
int v0 = -1; // const/4 v0, -0x1
/* if-eq p2, v0, :cond_0 */
android.support.v4.app.FragmentActivity .a ( p2 );
} // :cond_0
/* invoke-super/range {p0 ..p6}, Landroid/support/v4/app/SupportActivity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V */
return;
} // .end method
public void startIntentSenderForResult ( android.content.IntentSender p0, Integer p1, android.content.Intent p2, Integer p3, Integer p4, Integer p5, android.os.Bundle p6 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->d:Z */
/* if-nez v0, :cond_0 */
int v0 = -1; // const/4 v0, -0x1
/* if-eq p2, v0, :cond_0 */
android.support.v4.app.FragmentActivity .a ( p2 );
} // :cond_0
/* invoke-super/range {p0 ..p7}, Landroid/support/v4/app/SupportActivity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V */
return;
} // .end method
