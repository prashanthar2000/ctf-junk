public class ce {
	 /* # static fields */
	 private static android.util.TypedValue a;
	 private static final java.lang.Object a;
	 /* # direct methods */
	 static ce ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Ljava/lang/Object; */
		 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Integer a ( android.content.Context p0, Integer p1 ) {
		 /* .locals 2 */
		 /* const/16 v1, 0x17 */
		 /* if-lt v0, v1, :cond_0 */
		 p0 = 		 (( android.content.Context ) p0 ).getColor ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/Context;->getColor(I)I
	 } // :cond_0
	 (( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
	 p0 = 	 (( android.content.res.Resources ) p0 ).getColor ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getColor(I)I
} // .end method
public static android.content.res.ColorStateList a ( android.content.Context p0, Integer p1 ) {
	 /* .locals 2 */
	 /* const/16 v1, 0x17 */
	 /* if-lt v0, v1, :cond_0 */
	 (( android.content.Context ) p0 ).getColorStateList ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/Context;->getColorStateList(I)Landroid/content/res/ColorStateList;
} // :cond_0
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) p0 ).getColorStateList ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;
} // .end method
public static android.graphics.drawable.Drawable a ( android.content.Context p0, Integer p1 ) {
/* .locals 4 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
(( android.content.Context ) p0 ).getDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;
} // :cond_0
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_1 */
} // :goto_0
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) p0 ).getDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
} // :cond_1
v0 = ce.a;
/* monitor-enter v0 */
try { // :try_start_0
v1 = ce.a;
/* if-nez v1, :cond_2 */
/* new-instance v1, Landroid/util/TypedValue; */
/* invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V */
} // :cond_2
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
v2 = ce.a;
int v3 = 1; // const/4 v3, 0x1
(( android.content.res.Resources ) v1 ).getValue ( p1, v2, v3 ); // invoke-virtual {v1, p1, v2, v3}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V
p1 = ce.a;
/* iget p1, p1, Landroid/util/TypedValue;->resourceId:I */
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p0 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p0 */
return;
} // .end method
public static Boolean a ( android.content.Context p0, android.content.Intent[] p1 ) {
/* .locals 2 */
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
(( android.content.Context ) p0 ).startActivities ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/content/Context;->startActivities([Landroid/content/Intent;Landroid/os/Bundle;)V
} // :cond_0
(( android.content.Context ) p0 ).startActivities ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/Context;->startActivities([Landroid/content/Intent;)V
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
} // .end method
public static java.io.File a ( android.content.Context p0 ) {
/* .locals 3 */
int v1 = 0; // const/4 v1, 0x0
/* const/16 v2, 0x13 */
/* if-lt v0, v2, :cond_0 */
(( android.content.Context ) p0 ).getExternalFilesDirs ( v1 ); // invoke-virtual {p0, v1}, Landroid/content/Context;->getExternalFilesDirs(Ljava/lang/String;)[Ljava/io/File;
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/io/File; */
int v2 = 0; // const/4 v2, 0x0
(( android.content.Context ) p0 ).getExternalFilesDir ( v1 ); // invoke-virtual {p0, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;
/* aput-object p0, v0, v2 */
} // .end method
public static java.io.File b ( android.content.Context p0 ) {
/* .locals 2 */
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_0 */
(( android.content.Context ) p0 ).getExternalCacheDirs ( ); // invoke-virtual {p0}, Landroid/content/Context;->getExternalCacheDirs()[Ljava/io/File;
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/io/File; */
int v1 = 0; // const/4 v1, 0x0
(( android.content.Context ) p0 ).getExternalCacheDir ( ); // invoke-virtual {p0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;
/* aput-object p0, v0, v1 */
} // .end method
