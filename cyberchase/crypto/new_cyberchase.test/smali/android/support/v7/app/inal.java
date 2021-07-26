public class inal implements android.view.View$OnClickListener {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/support/v7/app/AppCompatViewInflater; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "a" */
} // .end annotation
/* # instance fields */
private android.content.Context a;
private final android.view.View a;
private final java.lang.String a;
private java.lang.reflect.Method a;
/* # direct methods */
public inal ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
this.a = p1;
this.a = p2;
return;
} // .end method
/* # virtual methods */
public final void onClick ( android.view.View p0 ) {
/* .locals 7 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* if-nez v0, :cond_4 */
v0 = this.a;
(( android.view.View ) v0 ).getContext ( ); // invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_2
try { // :try_start_0
	 v3 = 	 (( android.content.Context ) v0 ).isRestricted ( ); // invoke-virtual {v0}, Landroid/content/Context;->isRestricted()Z
	 /* if-nez v3, :cond_0 */
	 (( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
	 v4 = this.a;
	 /* new-array v5, v2, [Ljava/lang/Class; */
	 /* const-class v6, Landroid/view/View; */
	 /* aput-object v6, v5, v1 */
	 (( java.lang.Class ) v3 ).getMethod ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
	 if ( v3 != null) { // if-eqz v3, :cond_0
		 this.a = v3;
		 this.a = v0;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
	 } // :cond_0
	 /* instance-of v3, v0, Landroid/content/ContextWrapper; */
	 if ( v3 != null) { // if-eqz v3, :cond_1
		 /* check-cast v0, Landroid/content/ContextWrapper; */
		 (( android.content.ContextWrapper ) v0 ).getBaseContext ( ); // invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;
	 } // :cond_1
	 int v0 = 0; // const/4 v0, 0x0
} // :cond_2
p1 = this.a;
p1 = (( android.view.View ) p1 ).getId ( ); // invoke-virtual {p1}, Landroid/view/View;->getId()I
int v0 = -1; // const/4 v0, -0x1
/* if-ne p1, v0, :cond_3 */
final String p1 = ""; // const-string p1, ""
} // :cond_3
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = " with id \'"; // const-string v1, " with id \'"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v1 = this.a;
(( android.view.View ) v1 ).getContext ( ); // invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getResourceEntryName ( p1 ); // invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "\'"; // const-string p1, "\'"
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Could not find method "; // const-string v2, "Could not find method "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v2 = this.a;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "(View) in a parent or ancestor Context for android:onClick attribute defined on view "; // const-string v2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.a;
(( java.lang.Object ) v2 ).getClass ( ); // invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_4
} // :goto_2
try { // :try_start_1
v0 = this.a;
v3 = this.a;
/* new-array v2, v2, [Ljava/lang/Object; */
/* aput-object p1, v2, v1 */
(( java.lang.reflect.Method ) v0 ).invoke ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_1 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_2 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 ..:try_end_1} :catch_1 */
return;
/* :catch_1 */
/* move-exception p1 */
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Could not execute method for android:onClick"; // const-string v1, "Could not execute method for android:onClick"
/* invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v0 */
/* :catch_2 */
/* move-exception p1 */
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Could not execute non-public method for android:onClick"; // const-string v1, "Could not execute non-public method for android:onClick"
/* invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v0 */
return;
} // .end method
