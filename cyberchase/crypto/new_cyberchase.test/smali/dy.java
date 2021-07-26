public abstract class dy {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Ldy$b;, */
	 /* Ldy$a; */
	 /* } */
} // .end annotation
/* # instance fields */
private final android.content.Context a;
public dy$a a;
public dy$b a;
/* # direct methods */
public dy ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 this.a = p1;
	 return;
} // .end method
/* # virtual methods */
public abstract android.view.View a ( ) {
} // .end method
public android.view.View a ( android.view.MenuItem p0 ) {
	 /* .locals 0 */
	 (( dy ) p0 ).a ( ); // invoke-virtual {p0}, Ldy;->a()Landroid/view/View;
} // .end method
public void a ( android.view.SubMenu p0 ) {
	 /* .locals 0 */
	 return;
} // .end method
public void a ( dy$b p0 ) {
	 /* .locals 3 */
	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 final String v0 = "ActionProvider(support)"; // const-string v0, "ActionProvider(support)"
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 final String v2 = "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set.Are you reusing this "; // const-string v2, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set.Are you reusing this "
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 (( java.lang.Class ) v2 ).getSimpleName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = " instance while it is still in use somewhere else?"; // const-string v2, " instance while it is still in use somewhere else?"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .w ( v0,v1 );
	 } // :cond_0
	 this.a = p1;
	 return;
} // .end method
public final void a ( Boolean p0 ) {
	 /* .locals 1 */
	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_0
	 } // :cond_0
	 return;
} // .end method
public Boolean a ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean b ( ) {
	 /* .locals 1 */
	 int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean c ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean d ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
