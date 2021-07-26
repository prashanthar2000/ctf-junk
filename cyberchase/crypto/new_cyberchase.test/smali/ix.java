public abstract class ix {
	 /* # direct methods */
	 public ix ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 private static iz a ( java.lang.String p0, ix p1 ) {
		 /* .locals 5 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<T::", */
		 /* "Liz;", */
		 /* ">(", */
		 /* "Ljava/lang/String;", */
		 /* "Lix;", */
		 /* ")TT;" */
		 /* } */
	 } // .end annotation
	 try { // :try_start_0
		 /* const-class v0, Lix; */
		 (( java.lang.Class ) v0 ).getClassLoader ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
		 int v1 = 1; // const/4 v1, 0x1
		 java.lang.Class .forName ( p0,v1,v0 );
		 final String v0 = "read"; // const-string v0, "read"
		 /* new-array v2, v1, [Ljava/lang/Class; */
		 /* const-class v3, Lix; */
		 int v4 = 0; // const/4 v4, 0x0
		 /* aput-object v3, v2, v4 */
		 (( java.lang.Class ) p0 ).getDeclaredMethod ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 int v0 = 0; // const/4 v0, 0x0
		 /* new-array v1, v1, [Ljava/lang/Object; */
		 /* aput-object p1, v1, v4 */
		 (( java.lang.reflect.Method ) p0 ).invoke ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
		 /* check-cast p0, Liz; */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_3 */
		 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_2 */
		 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception p0 */
		 /* new-instance p1, Ljava/lang/RuntimeException; */
		 final String v0 = "VersionedParcel encountered ClassNotFoundException"; // const-string v0, "VersionedParcel encountered ClassNotFoundException"
		 /* invoke-direct {p1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
		 /* throw p1 */
		 /* :catch_1 */
		 /* move-exception p0 */
		 /* new-instance p1, Ljava/lang/RuntimeException; */
		 final String v0 = "VersionedParcel encountered NoSuchMethodException"; // const-string v0, "VersionedParcel encountered NoSuchMethodException"
		 /* invoke-direct {p1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
		 /* throw p1 */
		 /* :catch_2 */
		 /* move-exception p0 */
		 (( java.lang.reflect.InvocationTargetException ) p0 ).getCause ( ); // invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;
		 /* instance-of p1, p1, Ljava/lang/RuntimeException; */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 (( java.lang.reflect.InvocationTargetException ) p0 ).getCause ( ); // invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;
			 /* check-cast p0, Ljava/lang/RuntimeException; */
			 /* throw p0 */
		 } // :cond_0
		 /* new-instance p1, Ljava/lang/RuntimeException; */
		 final String v0 = "VersionedParcel encountered InvocationTargetException"; // const-string v0, "VersionedParcel encountered InvocationTargetException"
		 /* invoke-direct {p1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
		 /* throw p1 */
		 /* :catch_3 */
		 /* move-exception p0 */
		 /* new-instance p1, Ljava/lang/RuntimeException; */
		 final String v0 = "VersionedParcel encountered IllegalAccessException"; // const-string v0, "VersionedParcel encountered IllegalAccessException"
		 /* invoke-direct {p1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
		 /* throw p1 */
	 } // .end method
	 private static java.lang.Class a ( java.lang.Class p0 ) {
		 /* .locals 5 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/lang/Class<", */
		 /* "+", */
		 /* "Liz;", */
		 /* ">;)", */
		 /* "Ljava/lang/Class;" */
		 /* } */
	 } // .end annotation
	 (( java.lang.Class ) p0 ).getPackage ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;
	 (( java.lang.Package ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;
	 final String v1 = "%s.%sParcelizer"; // const-string v1, "%s.%sParcelizer"
	 int v2 = 2; // const/4 v2, 0x2
	 /* new-array v2, v2, [Ljava/lang/Object; */
	 int v3 = 0; // const/4 v3, 0x0
	 /* aput-object v0, v2, v3 */
	 (( java.lang.Class ) p0 ).getSimpleName ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
	 int v4 = 1; // const/4 v4, 0x1
	 /* aput-object v0, v2, v4 */
	 java.lang.String .format ( v1,v2 );
	 (( java.lang.Class ) p0 ).getClassLoader ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
	 java.lang.Class .forName ( v0,v3,p0 );
} // .end method
/* # virtual methods */
protected abstract Integer a ( ) {
} // .end method
public final Integer a ( Integer p0, Integer p1 ) {
	 /* .locals 0 */
	 p2 = 	 (( ix ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lix;->a(I)Z
	 /* if-nez p2, :cond_0 */
} // :cond_0
p1 = (( ix ) p0 ).a ( ); // invoke-virtual {p0}, Lix;->a()I
} // .end method
protected abstract android.os.Parcelable a ( ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T::", */
/* "Landroid/os/Parcelable;", */
/* ">()TT;" */
/* } */
} // .end annotation
} // .end method
public final android.os.Parcelable a ( android.os.Parcelable p0, Integer p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T::", */
/* "Landroid/os/Parcelable;", */
/* ">(TT;I)TT;" */
/* } */
} // .end annotation
p2 = (( ix ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lix;->a(I)Z
/* if-nez p2, :cond_0 */
} // :cond_0
(( ix ) p0 ).a ( ); // invoke-virtual {p0}, Lix;->a()Landroid/os/Parcelable;
} // .end method
protected abstract ix a ( ) {
} // .end method
public final iz a ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T::", */
/* "Liz;", */
/* ">()TT;" */
/* } */
} // .end annotation
(( ix ) p0 ).a ( ); // invoke-virtual {p0}, Lix;->a()Ljava/lang/String;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
(( ix ) p0 ).a ( ); // invoke-virtual {p0}, Lix;->a()Lix;
ix .a ( v0,v1 );
} // .end method
protected abstract java.lang.String a ( ) {
} // .end method
public final java.lang.String a ( java.lang.String p0 ) {
/* .locals 1 */
int v0 = 7; // const/4 v0, 0x7
v0 = (( ix ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lix;->a(I)Z
/* if-nez v0, :cond_0 */
} // :cond_0
(( ix ) p0 ).a ( ); // invoke-virtual {p0}, Lix;->a()Ljava/lang/String;
} // .end method
protected abstract void a ( ) {
} // .end method
protected abstract void a ( Integer p0 ) {
} // .end method
public final void a ( Integer p0, Integer p1 ) {
/* .locals 0 */
(( ix ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Lix;->b(I)V
(( ix ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lix;->a(I)V
return;
} // .end method
protected abstract void a ( android.os.Parcelable p0 ) {
} // .end method
public final void a ( android.os.Parcelable p0, Integer p1 ) {
/* .locals 0 */
(( ix ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Lix;->b(I)V
(( ix ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lix;->a(Landroid/os/Parcelable;)V
return;
} // .end method
public final void a ( iz p0 ) {
/* .locals 9 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
(( ix ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lix;->a(Ljava/lang/String;)V
return;
} // :cond_0
try { // :try_start_0
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
ix .a ( v1 );
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_4 */
(( java.lang.Class ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( ix ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lix;->a(Ljava/lang/String;)V
(( ix ) p0 ).a ( ); // invoke-virtual {p0}, Lix;->a()Lix;
try { // :try_start_1
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
ix .a ( v2 );
final String v3 = "write"; // const-string v3, "write"
int v4 = 2; // const/4 v4, 0x2
/* new-array v5, v4, [Ljava/lang/Class; */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
int v7 = 0; // const/4 v7, 0x0
/* aput-object v6, v5, v7 */
/* const-class v6, Lix; */
int v8 = 1; // const/4 v8, 0x1
/* aput-object v6, v5, v8 */
(( java.lang.Class ) v2 ).getDeclaredMethod ( v3, v5 ); // invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* new-array v3, v4, [Ljava/lang/Object; */
/* aput-object p1, v3, v7 */
/* aput-object v1, v3, v8 */
(( java.lang.reflect.Method ) v2 ).invoke ( v0, v3 ); // invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_1 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_3 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 ..:try_end_1} :catch_2 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_1 ..:try_end_1} :catch_0 */
(( ix ) v1 ).a ( ); // invoke-virtual {v1}, Lix;->a()V
return;
/* :catch_0 */
/* move-exception p1 */
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = "VersionedParcel encountered ClassNotFoundException"; // const-string v1, "VersionedParcel encountered ClassNotFoundException"
/* invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v0 */
/* :catch_1 */
/* move-exception p1 */
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = "VersionedParcel encountered NoSuchMethodException"; // const-string v1, "VersionedParcel encountered NoSuchMethodException"
/* invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v0 */
/* :catch_2 */
/* move-exception p1 */
(( java.lang.reflect.InvocationTargetException ) p1 ).getCause ( ); // invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;
/* instance-of v0, v0, Ljava/lang/RuntimeException; */
if ( v0 != null) { // if-eqz v0, :cond_1
(( java.lang.reflect.InvocationTargetException ) p1 ).getCause ( ); // invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;
/* check-cast p1, Ljava/lang/RuntimeException; */
/* throw p1 */
} // :cond_1
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = "VersionedParcel encountered InvocationTargetException"; // const-string v1, "VersionedParcel encountered InvocationTargetException"
/* invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v0 */
/* :catch_3 */
/* move-exception p1 */
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = "VersionedParcel encountered IllegalAccessException"; // const-string v1, "VersionedParcel encountered IllegalAccessException"
/* invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v0 */
/* :catch_4 */
/* move-exception v0 */
/* new-instance v1, Ljava/lang/RuntimeException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) p1 ).getSimpleName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " does not have a Parcelizer"; // const-string p1, " does not have a Parcelizer"
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
protected abstract void a ( java.lang.String p0 ) {
} // .end method
protected abstract void a ( Object[] p0 ) {
} // .end method
protected abstract Boolean a ( Integer p0 ) {
} // .end method
protected abstract a ( ) {
} // .end method
public final a ( Object[] p0 ) {
/* .locals 1 */
int v0 = 2; // const/4 v0, 0x2
v0 = (( ix ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lix;->a(I)Z
/* if-nez v0, :cond_0 */
} // :cond_0
(( ix ) p0 ).a ( ); // invoke-virtual {p0}, Lix;->a()[B
} // .end method
protected abstract void b ( Integer p0 ) {
} // .end method
public final void b ( java.lang.String p0 ) {
/* .locals 1 */
int v0 = 7; // const/4 v0, 0x7
(( ix ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lix;->b(I)V
(( ix ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lix;->a(Ljava/lang/String;)V
return;
} // .end method
public final void b ( Object[] p0 ) {
/* .locals 1 */
int v0 = 2; // const/4 v0, 0x2
(( ix ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lix;->b(I)V
(( ix ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lix;->a([B)V
return;
} // .end method
