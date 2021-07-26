public class fw extends android.app.Dialog implements ft {
	 /* # interfaces */
	 /* # instance fields */
	 private final ea$a a;
	 private fu a;
	 /* # direct methods */
	 public fw ( ) {
		 /* .locals 3 */
		 /* if-nez p2, :cond_0 */
		 /* new-instance p2, Landroid/util/TypedValue; */
		 /* invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V */
		 (( android.content.Context ) p1 ).getTheme ( ); // invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
		 int v2 = 1; // const/4 v2, 0x1
		 (( android.content.res.Resources$Theme ) v0 ).resolveAttribute ( v1, p2, v2 ); // invoke-virtual {v0, v1, p2, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
		 /* iget p2, p2, Landroid/util/TypedValue;->resourceId:I */
	 } // :cond_0
	 /* invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V */
	 /* new-instance p1, Lfw$1; */
	 /* invoke-direct {p1, p0}, Lfw$1;-><init>(Lfw;)V */
	 this.a = p1;
	 (( fw ) p0 ).a ( ); // invoke-virtual {p0}, Lfw;->a()Lfu;
	 int p2 = 0; // const/4 p2, 0x0
	 (( fu ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lfu;->a(Landroid/os/Bundle;)V
	 (( fw ) p0 ).a ( ); // invoke-virtual {p0}, Lfw;->a()Lfu;
	 (( fu ) p1 ).a ( ); // invoke-virtual {p1}, Lfu;->a()Z
	 return;
} // .end method
/* # virtual methods */
public final fu a ( ) {
	 /* .locals 1 */
	 v0 = this.a;
	 /* if-nez v0, :cond_0 */
	 fu .a ( p0,p0 );
	 this.a = v0;
} // :cond_0
v0 = this.a;
} // .end method
final Boolean a ( android.view.KeyEvent p0 ) {
/* .locals 0 */
p1 = /* invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z */
} // .end method
public void addContentView ( android.view.View p0, android.view.ViewGroup$LayoutParams p1 ) {
/* .locals 1 */
(( fw ) p0 ).a ( ); // invoke-virtual {p0}, Lfw;->a()Lfu;
(( fu ) v0 ).b ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lfu;->b(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
return;
} // .end method
public Boolean dispatchKeyEvent ( android.view.KeyEvent p0 ) {
/* .locals 2 */
(( fw ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lfw;->getWindow()Landroid/view/Window;
(( android.view.Window ) v0 ).getDecorView ( ); // invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
v1 = this.a;
p1 = ea .a ( v1,v0,p0,p1 );
} // .end method
public android.view.View findViewById ( Integer p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Landroid/view/View;", */
/* ">(I)TT;" */
/* } */
} // .end annotation
(( fw ) p0 ).a ( ); // invoke-virtual {p0}, Lfw;->a()Lfu;
(( fu ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lfu;->a(I)Landroid/view/View;
} // .end method
public void invalidateOptionsMenu ( ) {
/* .locals 1 */
(( fw ) p0 ).a ( ); // invoke-virtual {p0}, Lfw;->a()Lfu;
(( fu ) v0 ).e ( ); // invoke-virtual {v0}, Lfu;->e()V
return;
} // .end method
protected void onCreate ( android.os.Bundle p0 ) {
/* .locals 1 */
(( fw ) p0 ).a ( ); // invoke-virtual {p0}, Lfw;->a()Lfu;
(( fu ) v0 ).g ( ); // invoke-virtual {v0}, Lfu;->g()V
/* invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V */
(( fw ) p0 ).a ( ); // invoke-virtual {p0}, Lfw;->a()Lfu;
(( fu ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lfu;->a(Landroid/os/Bundle;)V
return;
} // .end method
protected void onStop ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/app/Dialog;->onStop()V */
(( fw ) p0 ).a ( ); // invoke-virtual {p0}, Lfw;->a()Lfu;
(( fu ) v0 ).c ( ); // invoke-virtual {v0}, Lfu;->c()V
return;
} // .end method
public void setContentView ( Integer p0 ) {
/* .locals 1 */
(( fw ) p0 ).a ( ); // invoke-virtual {p0}, Lfw;->a()Lfu;
(( fu ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lfu;->a(I)V
return;
} // .end method
public void setContentView ( android.view.View p0 ) {
/* .locals 1 */
(( fw ) p0 ).a ( ); // invoke-virtual {p0}, Lfw;->a()Lfu;
(( fu ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lfu;->a(Landroid/view/View;)V
return;
} // .end method
public void setContentView ( android.view.View p0, android.view.ViewGroup$LayoutParams p1 ) {
/* .locals 1 */
(( fw ) p0 ).a ( ); // invoke-virtual {p0}, Lfw;->a()Lfu;
(( fu ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lfu;->a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
return;
} // .end method
public void setTitle ( Integer p0 ) {
/* .locals 2 */
/* invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V */
(( fw ) p0 ).a ( ); // invoke-virtual {p0}, Lfw;->a()Lfu;
(( fw ) p0 ).getContext ( ); // invoke-virtual {p0}, Lfw;->getContext()Landroid/content/Context;
(( android.content.Context ) v1 ).getString ( p1 ); // invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
(( fu ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lfu;->a(Ljava/lang/CharSequence;)V
return;
} // .end method
public void setTitle ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V */
(( fw ) p0 ).a ( ); // invoke-virtual {p0}, Lfw;->a()Lfu;
(( fu ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lfu;->a(Ljava/lang/CharSequence;)V
return;
} // .end method
