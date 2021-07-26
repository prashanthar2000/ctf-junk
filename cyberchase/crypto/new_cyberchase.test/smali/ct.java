public class ct extends cr {
	 /* # instance fields */
	 protected final java.lang.Class a;
	 protected final java.lang.reflect.Constructor a;
	 protected final java.lang.reflect.Method a;
	 protected final java.lang.reflect.Method b;
	 protected final java.lang.reflect.Method c;
	 protected final java.lang.reflect.Method d;
	 protected final java.lang.reflect.Method e;
	 /* # direct methods */
	 public ct ( ) {
		 /* .locals 14 */
		 /* invoke-direct {p0}, Lcr;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 try { // :try_start_0
			 final String v1 = "android.graphics.FontFamily"; // const-string v1, "android.graphics.FontFamily"
			 java.lang.Class .forName ( v1 );
			 int v2 = 0; // const/4 v2, 0x0
			 /* new-array v3, v2, [Ljava/lang/Class; */
			 (( java.lang.Class ) v1 ).getConstructor ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
			 final String v4 = "addFontFromAssetManager"; // const-string v4, "addFontFromAssetManager"
			 /* const/16 v5, 0x8 */
			 /* new-array v5, v5, [Ljava/lang/Class; */
			 /* const-class v6, Landroid/content/res/AssetManager; */
			 /* aput-object v6, v5, v2 */
			 /* const-class v6, Ljava/lang/String; */
			 int v7 = 1; // const/4 v7, 0x1
			 /* aput-object v6, v5, v7 */
			 v6 = java.lang.Integer.TYPE;
			 int v8 = 2; // const/4 v8, 0x2
			 /* aput-object v6, v5, v8 */
			 v6 = java.lang.Boolean.TYPE;
			 int v9 = 3; // const/4 v9, 0x3
			 /* aput-object v6, v5, v9 */
			 v6 = java.lang.Integer.TYPE;
			 int v10 = 4; // const/4 v10, 0x4
			 /* aput-object v6, v5, v10 */
			 v6 = java.lang.Integer.TYPE;
			 int v11 = 5; // const/4 v11, 0x5
			 /* aput-object v6, v5, v11 */
			 int v6 = 6; // const/4 v6, 0x6
			 v12 = java.lang.Integer.TYPE;
			 /* aput-object v12, v5, v6 */
			 int v6 = 7; // const/4 v6, 0x7
			 /* const-class v12, [Landroid/graphics/fonts/FontVariationAxis; */
			 /* aput-object v12, v5, v6 */
			 (( java.lang.Class ) v1 ).getMethod ( v4, v5 ); // invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 final String v5 = "addFontFromBuffer"; // const-string v5, "addFontFromBuffer"
			 /* new-array v6, v11, [Ljava/lang/Class; */
			 /* const-class v11, Ljava/nio/ByteBuffer; */
			 /* aput-object v11, v6, v2 */
			 v11 = java.lang.Integer.TYPE;
			 /* aput-object v11, v6, v7 */
			 /* const-class v7, [Landroid/graphics/fonts/FontVariationAxis; */
			 /* aput-object v7, v6, v8 */
			 v7 = java.lang.Integer.TYPE;
			 /* aput-object v7, v6, v9 */
			 v7 = java.lang.Integer.TYPE;
			 /* aput-object v7, v6, v10 */
			 (( java.lang.Class ) v1 ).getMethod ( v5, v6 ); // invoke-virtual {v1, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 final String v6 = "freeze"; // const-string v6, "freeze"
			 /* new-array v7, v2, [Ljava/lang/Class; */
			 (( java.lang.Class ) v1 ).getMethod ( v6, v7 ); // invoke-virtual {v1, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 final String v7 = "abortCreation"; // const-string v7, "abortCreation"
			 /* new-array v2, v2, [Ljava/lang/Class; */
			 (( java.lang.Class ) v1 ).getMethod ( v7, v2 ); // invoke-virtual {v1, v7, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 (( ct ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lct;->a(Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* move-object v13, v1 */
			 /* move-object v1, v0 */
			 /* move-object v0, v13 */
			 /* :catch_0 */
			 /* move-exception v1 */
			 /* :catch_1 */
			 /* move-exception v1 */
		 } // :goto_0
		 final String v2 = "TypefaceCompatApi26Impl"; // const-string v2, "TypefaceCompatApi26Impl"
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 final String v4 = "Unable to collect necessary methods for class "; // const-string v4, "Unable to collect necessary methods for class "
		 /* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.Object ) v1 ).getClass ( ); // invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 (( java.lang.Class ) v4 ).getName ( ); // invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .e ( v2,v3,v1 );
		 /* move-object v1, v0 */
		 /* move-object v2, v1 */
		 /* move-object v3, v2 */
		 /* move-object v4, v3 */
		 /* move-object v5, v4 */
		 /* move-object v6, v5 */
	 } // :goto_1
	 this.a = v0;
	 this.a = v3;
	 this.a = v4;
	 this.b = v5;
	 this.c = v6;
	 this.d = v2;
	 this.e = v1;
	 return;
} // .end method
private java.lang.Object a ( ) {
	 /* .locals 2 */
	 try { // :try_start_0
		 v0 = this.a;
		 int v1 = 0; // const/4 v1, 0x0
		 /* new-array v1, v1, [Ljava/lang/Object; */
		 (( java.lang.reflect.Constructor ) v0 ).newInstance ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_2 */
		 /* .catch Ljava/lang/InstantiationException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* :catch_1 */
		 /* move-exception v0 */
		 /* :catch_2 */
		 /* move-exception v0 */
	 } // :goto_0
	 /* new-instance v1, Ljava/lang/RuntimeException; */
	 /* invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
	 /* throw v1 */
} // .end method
private void a ( java.lang.Object p0 ) {
	 /* .locals 2 */
	 try { // :try_start_0
		 v0 = this.d;
		 int v1 = 0; // const/4 v1, 0x0
		 /* new-array v1, v1, [Ljava/lang/Object; */
		 (( java.lang.reflect.Method ) v0 ).invoke ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
		 return;
		 /* :catch_0 */
		 /* move-exception p1 */
		 /* :catch_1 */
		 /* move-exception p1 */
	 } // :goto_0
	 /* new-instance v0, Ljava/lang/RuntimeException; */
	 /* invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
	 /* throw v0 */
} // .end method
private Boolean a ( ) {
	 /* .locals 2 */
	 v0 = this.a;
	 /* if-nez v0, :cond_0 */
	 final String v0 = "TypefaceCompatApi26Impl"; // const-string v0, "TypefaceCompatApi26Impl"
	 final String v1 = "Unable to collect necessary private methods.Fallback to legacy implementation."; // const-string v1, "Unable to collect necessary private methods.Fallback to legacy implementation."
	 android.util.Log .w ( v0,v1 );
} // :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
	 int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
private Boolean a ( android.content.Context p0, java.lang.Object p1, java.lang.String p2, Integer p3, Integer p4, Integer p5, android.graphics.fonts.FontVariationAxis[] p6 ) {
/* .locals 3 */
try { // :try_start_0
	 v0 = this.a;
	 /* const/16 v1, 0x8 */
	 /* new-array v1, v1, [Ljava/lang/Object; */
	 (( android.content.Context ) p1 ).getAssets ( ); // invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
	 int v2 = 0; // const/4 v2, 0x0
	 /* aput-object p1, v1, v2 */
	 int p1 = 1; // const/4 p1, 0x1
	 /* aput-object p3, v1, p1 */
	 int p1 = 2; // const/4 p1, 0x2
	 java.lang.Integer .valueOf ( v2 );
	 /* aput-object p3, v1, p1 */
	 int p1 = 3; // const/4 p1, 0x3
	 p3 = java.lang.Boolean.FALSE;
	 /* aput-object p3, v1, p1 */
	 int p1 = 4; // const/4 p1, 0x4
	 java.lang.Integer .valueOf ( p4 );
	 /* aput-object p3, v1, p1 */
	 int p1 = 5; // const/4 p1, 0x5
	 java.lang.Integer .valueOf ( p5 );
	 /* aput-object p3, v1, p1 */
	 int p1 = 6; // const/4 p1, 0x6
	 java.lang.Integer .valueOf ( p6 );
	 /* aput-object p3, v1, p1 */
	 int p1 = 7; // const/4 p1, 0x7
	 /* aput-object p7, v1, p1 */
	 (( java.lang.reflect.Method ) v0 ).invoke ( p2, v1 ); // invoke-virtual {v0, p2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast p1, Ljava/lang/Boolean; */
	 p1 = 	 (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
	 /* :try_end_0 */
	 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception p1 */
	 /* :catch_1 */
	 /* move-exception p1 */
} // :goto_0
/* new-instance p2, Ljava/lang/RuntimeException; */
/* invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw p2 */
} // .end method
private Boolean a ( java.lang.Object p0 ) {
/* .locals 2 */
try { // :try_start_0
	 v0 = this.c;
	 int v1 = 0; // const/4 v1, 0x0
	 /* new-array v1, v1, [Ljava/lang/Object; */
	 (( java.lang.reflect.Method ) v0 ).invoke ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast p1, Ljava/lang/Boolean; */
	 p1 = 	 (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
	 /* :try_end_0 */
	 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception p1 */
	 /* :catch_1 */
	 /* move-exception p1 */
} // :goto_0
/* new-instance v0, Ljava/lang/RuntimeException; */
/* invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v0 */
} // .end method
private Boolean a ( java.lang.Object p0, java.nio.ByteBuffer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 3 */
try { // :try_start_0
	 v0 = this.b;
	 int v1 = 5; // const/4 v1, 0x5
	 /* new-array v1, v1, [Ljava/lang/Object; */
	 int v2 = 0; // const/4 v2, 0x0
	 /* aput-object p2, v1, v2 */
	 int p2 = 1; // const/4 p2, 0x1
	 java.lang.Integer .valueOf ( p3 );
	 /* aput-object p3, v1, p2 */
	 int p2 = 2; // const/4 p2, 0x2
	 int p3 = 0; // const/4 p3, 0x0
	 /* aput-object p3, v1, p2 */
	 int p2 = 3; // const/4 p2, 0x3
	 java.lang.Integer .valueOf ( p4 );
	 /* aput-object p3, v1, p2 */
	 int p2 = 4; // const/4 p2, 0x4
	 java.lang.Integer .valueOf ( p5 );
	 /* aput-object p3, v1, p2 */
	 (( java.lang.reflect.Method ) v0 ).invoke ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast p1, Ljava/lang/Boolean; */
	 p1 = 	 (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
	 /* :try_end_0 */
	 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception p1 */
	 /* :catch_1 */
	 /* move-exception p1 */
} // :goto_0
/* new-instance p2, Ljava/lang/RuntimeException; */
/* invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw p2 */
} // .end method
/* # virtual methods */
public final android.graphics.Typeface a ( android.content.Context p0, android.content.res.Resources p1, Integer p2, java.lang.String p3, Integer p4 ) {
/* .locals 8 */
v0 = /* invoke-direct {p0}, Lct;->a()Z */
/* if-nez v0, :cond_0 */
/* invoke-super/range {p0 ..p5}, Lcr;->a(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface; */
} // :cond_0
/* invoke-direct {p0}, Lct;->a()Ljava/lang/Object; */
int v4 = 0; // const/4 v4, 0x0
int v5 = -1; // const/4 v5, -0x1
int v6 = -1; // const/4 v6, -0x1
int v7 = 0; // const/4 v7, 0x0
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v3, p4 */
p1 = /* invoke-direct/range {v0 ..v7}, Lct;->a(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;III[Landroid/graphics/fonts/FontVariationAxis;)Z */
int p3 = 0; // const/4 p3, 0x0
/* if-nez p1, :cond_1 */
/* invoke-direct {p0, p2}, Lct;->a(Ljava/lang/Object;)V */
} // :cond_1
p1 = /* invoke-direct {p0, p2}, Lct;->a(Ljava/lang/Object;)Z */
/* if-nez p1, :cond_2 */
} // :cond_2
(( ct ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lct;->a(Ljava/lang/Object;)Landroid/graphics/Typeface;
} // .end method
public final android.graphics.Typeface a ( android.content.Context p0, cj$b p1, android.content.res.Resources p2, Integer p3 ) {
/* .locals 10 */
v0 = /* invoke-direct {p0}, Lct;->a()Z */
/* if-nez v0, :cond_0 */
/* invoke-super {p0, p1, p2, p3, p4}, Lcr;->a(Landroid/content/Context;Lcj$b;Landroid/content/res/Resources;I)Landroid/graphics/Typeface; */
} // :cond_0
/* invoke-direct {p0}, Lct;->a()Ljava/lang/Object; */
p2 = this.a;
/* array-length p4, p2 */
int v0 = 0; // const/4 v0, 0x0
int v8 = 0; // const/4 v8, 0x0
} // :goto_0
int v9 = 0; // const/4 v9, 0x0
/* if-ge v8, p4, :cond_2 */
/* aget-object v0, p2, v8 */
v3 = this.a;
/* iget v4, v0, Lcj$c;->b:I */
/* iget v5, v0, Lcj$c;->a:I */
/* iget-boolean v6, v0, Lcj$c;->a:Z */
v0 = this.b;
android.graphics.fonts.FontVariationAxis .fromFontVariationSettings ( v0 );
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p3 */
v0 = /* invoke-direct/range {v0 ..v7}, Lct;->a(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;III[Landroid/graphics/fonts/FontVariationAxis;)Z */
/* if-nez v0, :cond_1 */
/* invoke-direct {p0, p3}, Lct;->a(Ljava/lang/Object;)V */
} // :cond_1
/* add-int/lit8 v8, v8, 0x1 */
} // :cond_2
p1 = /* invoke-direct {p0, p3}, Lct;->a(Ljava/lang/Object;)Z */
/* if-nez p1, :cond_3 */
} // :cond_3
(( ct ) p0 ).a ( p3 ); // invoke-virtual {p0, p3}, Lct;->a(Ljava/lang/Object;)Landroid/graphics/Typeface;
} // .end method
public final android.graphics.Typeface a ( android.content.Context p0, dg$b[] p1, Integer p2 ) {
/* .locals 11 */
/* array-length v0, p2 */
int v1 = 0; // const/4 v1, 0x0
/* if-gtz v0, :cond_0 */
} // :cond_0
v0 = /* invoke-direct {p0}, Lct;->a()Z */
/* if-nez v0, :cond_6 */
(( ct ) p0 ).a ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Lct;->a([Ldg$b;I)Ldg$b;
(( android.content.Context ) p1 ).getContentResolver ( ); // invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
try { // :try_start_0
p3 = this.a;
final String v0 = "r"; // const-string v0, "r"
(( android.content.ContentResolver ) p1 ).openFileDescriptor ( p3, v0, v1 ); // invoke-virtual {p1, p3, v0, v1}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
/* if-nez p1, :cond_2 */
if ( p1 != null) { // if-eqz p1, :cond_1
(( android.os.ParcelFileDescriptor ) p1 ).close ( ); // invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_2 */
} // :cond_1
} // :cond_2
try { // :try_start_1
/* new-instance p3, Landroid/graphics/Typeface$Builder; */
(( android.os.ParcelFileDescriptor ) p1 ).getFileDescriptor ( ); // invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
/* invoke-direct {p3, v0}, Landroid/graphics/Typeface$Builder;-><init>(Ljava/io/FileDescriptor;)V */
/* iget v0, p2, Ldg$b;->b:I */
(( android.graphics.Typeface$Builder ) p3 ).setWeight ( v0 ); // invoke-virtual {p3, v0}, Landroid/graphics/Typeface$Builder;->setWeight(I)Landroid/graphics/Typeface$Builder;
/* iget-boolean p2, p2, Ldg$b;->a:Z */
(( android.graphics.Typeface$Builder ) p3 ).setItalic ( p2 ); // invoke-virtual {p3, p2}, Landroid/graphics/Typeface$Builder;->setItalic(Z)Landroid/graphics/Typeface$Builder;
(( android.graphics.Typeface$Builder ) p2 ).build ( ); // invoke-virtual {p2}, Landroid/graphics/Typeface$Builder;->build()Landroid/graphics/Typeface;
/* :try_end_1 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
if ( p1 != null) { // if-eqz p1, :cond_3
try { // :try_start_2
(( android.os.ParcelFileDescriptor ) p1 ).close ( ); // invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_2 */
} // :cond_3
/* :catchall_0 */
/* move-exception p2 */
/* move-object p3, v1 */
/* :catch_0 */
/* move-exception p2 */
try { // :try_start_3
/* throw p2 */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* :catchall_1 */
/* move-exception p3 */
/* move-object v10, p3 */
/* move-object p3, p2 */
/* move-object p2, v10 */
} // :goto_0
if ( p1 != null) { // if-eqz p1, :cond_5
if ( p3 != null) { // if-eqz p3, :cond_4
try { // :try_start_4
(( android.os.ParcelFileDescriptor ) p1 ).close ( ); // invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
/* :try_end_4 */
/* .catch Ljava/lang/Throwable; {:try_start_4 ..:try_end_4} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_2 */
/* :catch_1 */
/* move-exception p1 */
try { // :try_start_5
(( java.lang.Throwable ) p3 ).addSuppressed ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
} // :cond_4
(( android.os.ParcelFileDescriptor ) p1 ).close ( ); // invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
} // :cond_5
} // :goto_1
/* throw p2 */
/* :try_end_5 */
/* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_2 */
/* :catch_2 */
} // :cond_6
dg .a ( p1,p2 );
/* invoke-direct {p0}, Lct;->a()Ljava/lang/Object; */
/* array-length v8, p2 */
int v2 = 0; // const/4 v2, 0x0
int v9 = 0; // const/4 v9, 0x0
} // :goto_2
/* if-ge v9, v8, :cond_9 */
/* aget-object v3, p2, v9 */
v4 = this.a;
/* check-cast v4, Ljava/nio/ByteBuffer; */
if ( v4 != null) { // if-eqz v4, :cond_8
/* iget v5, v3, Ldg$b;->a:I */
/* iget v6, v3, Ldg$b;->b:I */
/* iget-boolean v7, v3, Ldg$b;->a:Z */
/* move-object v2, p0 */
/* move-object v3, v0 */
v2 = /* invoke-direct/range {v2 ..v7}, Lct;->a(Ljava/lang/Object;Ljava/nio/ByteBuffer;III)Z */
/* if-nez v2, :cond_7 */
/* invoke-direct {p0, v0}, Lct;->a(Ljava/lang/Object;)V */
} // :cond_7
int v2 = 1; // const/4 v2, 0x1
} // :cond_8
/* add-int/lit8 v9, v9, 0x1 */
} // :cond_9
/* if-nez v2, :cond_a */
/* invoke-direct {p0, v0}, Lct;->a(Ljava/lang/Object;)V */
} // :cond_a
p1 = /* invoke-direct {p0, v0}, Lct;->a(Ljava/lang/Object;)Z */
/* if-nez p1, :cond_b */
} // :cond_b
(( ct ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lct;->a(Ljava/lang/Object;)Landroid/graphics/Typeface;
android.graphics.Typeface .create ( p1,p3 );
} // .end method
protected android.graphics.Typeface a ( java.lang.Object p0 ) {
/* .locals 5 */
try { // :try_start_0
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
java.lang.reflect.Array .newInstance ( v0,v1 );
int v2 = 0; // const/4 v2, 0x0
java.lang.reflect.Array .set ( v0,v2,p1 );
p1 = this.e;
int v3 = 0; // const/4 v3, 0x0
int v4 = 3; // const/4 v4, 0x3
/* new-array v4, v4, [Ljava/lang/Object; */
/* aput-object v0, v4, v2 */
int v0 = -1; // const/4 v0, -0x1
java.lang.Integer .valueOf ( v0 );
/* aput-object v2, v4, v1 */
int v1 = 2; // const/4 v1, 0x2
java.lang.Integer .valueOf ( v0 );
/* aput-object v0, v4, v1 */
(( java.lang.reflect.Method ) p1 ).invoke ( v3, v4 ); // invoke-virtual {p1, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Landroid/graphics/Typeface; */
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* :catch_1 */
/* move-exception p1 */
} // :goto_0
/* new-instance v0, Ljava/lang/RuntimeException; */
/* invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v0 */
} // .end method
protected java.lang.reflect.Method a ( java.lang.Class p0 ) {
/* .locals 5 */
int v0 = 1; // const/4 v0, 0x1
java.lang.reflect.Array .newInstance ( p1,v0 );
/* const-class v1, Landroid/graphics/Typeface; */
final String v2 = "createFromFamiliesWithDefault"; // const-string v2, "createFromFamiliesWithDefault"
int v3 = 3; // const/4 v3, 0x3
/* new-array v3, v3, [Ljava/lang/Class; */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
int v4 = 0; // const/4 v4, 0x0
/* aput-object p1, v3, v4 */
p1 = java.lang.Integer.TYPE;
/* aput-object p1, v3, v0 */
p1 = java.lang.Integer.TYPE;
int v4 = 2; // const/4 v4, 0x2
/* aput-object p1, v3, v4 */
(( java.lang.Class ) v1 ).getDeclaredMethod ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
(( java.lang.reflect.Method ) p1 ).setAccessible ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V
} // .end method
