public class android.support.v4.app.SupportActivity extends android.app.Activity implements ea$a implements j {
	 /* # interfaces */
	 /* # instance fields */
	 private du a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ldu<", */
	 /* "Ljava/lang/Class<", */
	 /* "+", */
	 /* "Ljava/lang/Object;", */
	 /* ">;", */
	 /* "Ljava/lang/Object;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private k a;
/* # direct methods */
public android.support.v4.app.SupportActivity ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
/* new-instance v0, Ldu; */
/* invoke-direct {v0}, Ldu;-><init>()V */
this.a = v0;
/* new-instance v0, Lk; */
/* invoke-direct {v0, p0}, Lk;-><init>(Lj;)V */
this.a = v0;
return;
} // .end method
/* # virtual methods */
public h a ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public final Boolean a ( android.view.KeyEvent p0 ) {
/* .locals 0 */
p1 = /* invoke-super {p0, p1}, Landroid/app/Activity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z */
} // .end method
public Boolean dispatchKeyEvent ( android.view.KeyEvent p0 ) {
/* .locals 2 */
(( android.support.v4.app.SupportActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Landroid/support/v4/app/SupportActivity;->getWindow()Landroid/view/Window;
(( android.view.Window ) v0 ).getDecorView ( ); // invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v1 = 	 ea .a ( v0,p1 );
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 int p1 = 1; // const/4 p1, 0x1
	 } // :cond_0
	 p1 = 	 ea .a ( p0,v0,p0,p1 );
} // .end method
public Boolean dispatchKeyShortcutEvent ( android.view.KeyEvent p0 ) {
	 /* .locals 1 */
	 (( android.support.v4.app.SupportActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Landroid/support/v4/app/SupportActivity;->getWindow()Landroid/view/Window;
	 (( android.view.Window ) v0 ).getDecorView ( ); // invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = 		 ea .a ( v0,p1 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int p1 = 1; // const/4 p1, 0x1
		 } // :cond_0
		 p1 = 		 /* invoke-super {p0, p1}, Landroid/app/Activity;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z */
	 } // .end method
	 protected void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 0 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 r .a ( p0 );
		 return;
	 } // .end method
	 protected void onSaveInstanceState ( android.os.Bundle p0 ) {
		 /* .locals 2 */
		 v0 = this.a;
		 v1 = h$b.c;
		 (( k ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lk;->a(Lh$b;)V
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V */
		 return;
	 } // .end method
