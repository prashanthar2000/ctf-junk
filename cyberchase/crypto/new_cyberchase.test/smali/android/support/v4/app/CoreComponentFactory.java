public class android.support.v4.app.CoreComponentFactory extends android.app.AppComponentFactory {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/v4/app/CoreComponentFactory$a; */
	 /* } */
} // .end annotation
/* # direct methods */
public android.support.v4.app.CoreComponentFactory ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0}, Landroid/app/AppComponentFactory;-><init>()V */
	 return;
} // .end method
private static java.lang.Object a ( java.lang.Object p0 ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">(TT;)TT;" */
	 /* } */
} // .end annotation
/* instance-of v0, p0, Landroid/support/v4/app/CoreComponentFactory$a; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* move-object v0, p0 */
	 /* check-cast v0, Landroid/support/v4/app/CoreComponentFactory$a; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
	 } // :cond_0
} // .end method
/* # virtual methods */
public android.app.Activity instantiateActivity ( java.lang.ClassLoader p0, java.lang.String p1, android.content.Intent p2 ) {
	 /* .locals 0 */
	 /* invoke-super {p0, p1, p2, p3}, Landroid/app/AppComponentFactory;->instantiateActivity(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Activity; */
	 android.support.v4.app.CoreComponentFactory .a ( p1 );
	 /* check-cast p1, Landroid/app/Activity; */
} // .end method
public android.app.Application instantiateApplication ( java.lang.ClassLoader p0, java.lang.String p1 ) {
	 /* .locals 0 */
	 /* invoke-super {p0, p1, p2}, Landroid/app/AppComponentFactory;->instantiateApplication(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroid/app/Application; */
	 android.support.v4.app.CoreComponentFactory .a ( p1 );
	 /* check-cast p1, Landroid/app/Application; */
} // .end method
public android.content.ContentProvider instantiateProvider ( java.lang.ClassLoader p0, java.lang.String p1 ) {
	 /* .locals 0 */
	 /* invoke-super {p0, p1, p2}, Landroid/app/AppComponentFactory;->instantiateProvider(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroid/content/ContentProvider; */
	 android.support.v4.app.CoreComponentFactory .a ( p1 );
	 /* check-cast p1, Landroid/content/ContentProvider; */
} // .end method
public android.content.BroadcastReceiver instantiateReceiver ( java.lang.ClassLoader p0, java.lang.String p1, android.content.Intent p2 ) {
	 /* .locals 0 */
	 /* invoke-super {p0, p1, p2, p3}, Landroid/app/AppComponentFactory;->instantiateReceiver(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/content/BroadcastReceiver; */
	 android.support.v4.app.CoreComponentFactory .a ( p1 );
	 /* check-cast p1, Landroid/content/BroadcastReceiver; */
} // .end method
public android.app.Service instantiateService ( java.lang.ClassLoader p0, java.lang.String p1, android.content.Intent p2 ) {
	 /* .locals 0 */
	 /* invoke-super {p0, p1, p2, p3}, Landroid/app/AppComponentFactory;->instantiateService(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Service; */
	 android.support.v4.app.CoreComponentFactory .a ( p1 );
	 /* check-cast p1, Landroid/app/Service; */
} // .end method
