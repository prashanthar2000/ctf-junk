public class android.support.design.widget.CoordinatorLayout extends android.view.ViewGroup implements eh {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/design/widget/CoordinatorLayout$f;, */
	 /* Landroid/support/design/widget/CoordinatorLayout$c;, */
	 /* Landroid/support/design/widget/CoordinatorLayout$d;, */
	 /* Landroid/support/design/widget/CoordinatorLayout$Behavior;, */
	 /* Landroid/support/design/widget/CoordinatorLayout$a;, */
	 /* Landroid/support/design/widget/CoordinatorLayout$b;, */
	 /* Landroid/support/design/widget/CoordinatorLayout$g;, */
	 /* Landroid/support/design/widget/CoordinatorLayout$e; */
	 /* } */
} // .end annotation
/* # static fields */
private static final ds$a a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lds$a<", */
/* "Landroid/graphics/Rect;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
static final java.lang.String a;
static final java.lang.ThreadLocal a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ThreadLocal<", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/reflect/Constructor<", */
/* "Landroid/support/design/widget/CoordinatorLayout$Behavior;", */
/* ">;>;>;" */
/* } */
} // .end annotation
} // .end field
static final java.util.Comparator a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Comparator<", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
static final java.lang.Class a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "[", */
/* "Ljava/lang/Class<", */
/* "*>;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
private android.graphics.drawable.Drawable a;
private android.support.design.widget.CoordinatorLayout$e a;
private android.view.View a;
android.view.ViewGroup$OnHierarchyChangeListener a;
private final ei a;
private ej a;
et a;
private final fh a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lfh<", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private final java.util.List a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
Boolean a;
private final a;
private android.view.View b;
private final java.util.List b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private Boolean b;
private b;
private final java.util.List c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private Boolean c;
private Boolean d;
/* # direct methods */
static android.support.design.widget.CoordinatorLayout ( ) {
/* .locals 3 */
/* const-class v0, Landroid/support/design/widget/CoordinatorLayout; */
(( java.lang.Class ) v0 ).getPackage ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
(( java.lang.Package ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;
} // :cond_0
/* move-object v0, v1 */
} // :goto_0
/* const/16 v2, 0x15 */
/* if-lt v0, v2, :cond_1 */
/* new-instance v0, Landroid/support/design/widget/CoordinatorLayout$g; */
/* invoke-direct {v0}, Landroid/support/design/widget/CoordinatorLayout$g;-><init>()V */
} // :cond_1
} // :goto_1
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [Ljava/lang/Class; */
int v1 = 0; // const/4 v1, 0x0
/* const-class v2, Landroid/content/Context; */
/* aput-object v2, v0, v1 */
int v1 = 1; // const/4 v1, 0x1
/* const-class v2, Landroid/util/AttributeSet; */
/* aput-object v2, v0, v1 */
/* new-instance v0, Ljava/lang/ThreadLocal; */
/* invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V */
/* new-instance v0, Lds$c; */
/* invoke-direct {v0}, Lds$c;-><init>()V */
return;
} // .end method
public android.support.design.widget.CoordinatorLayout ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, v0}, Landroid/support/design/widget/CoordinatorLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
return;
} // .end method
public android.support.design.widget.CoordinatorLayout ( ) {
/* .locals 1 */
/* invoke-direct {p0, p1, p2, v0}, Landroid/support/design/widget/CoordinatorLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
return;
} // .end method
public android.support.design.widget.CoordinatorLayout ( ) {
/* .locals 3 */
/* invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.a = v0;
/* new-instance v0, Lfh; */
/* invoke-direct {v0}, Lfh;-><init>()V */
this.a = v0;
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.b = v0;
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.c = v0;
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [I */
this.a = v0;
/* new-instance v0, Lei; */
/* invoke-direct {v0, p0}, Lei;-><init>(Landroid/view/ViewGroup;)V */
this.a = v0;
int v0 = 0; // const/4 v0, 0x0
/* if-nez p3, :cond_0 */
p3 = ay$c.CoordinatorLayout;
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, p3, v0, v1 ); // invoke-virtual {p1, p2, p3, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
} // :cond_0
v1 = ay$c.CoordinatorLayout;
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v1, p3, v0 ); // invoke-virtual {p1, p2, v1, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
} // :goto_0
p3 = (( android.content.res.TypedArray ) p2 ).getResourceId ( p3, v0 ); // invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I
if ( p3 != null) { // if-eqz p3, :cond_1
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) p1 ).getIntArray ( p3 ); // invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getIntArray(I)[I
this.b = p3;
(( android.content.res.Resources ) p1 ).getDisplayMetrics ( ); // invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget p1, p1, Landroid/util/DisplayMetrics;->density:F */
p3 = this.b;
/* array-length p3, p3 */
} // :goto_1
/* if-ge v0, p3, :cond_1 */
v1 = this.b;
/* aget v2, v1, v0 */
/* int-to-float v2, v2 */
/* mul-float v2, v2, p1 */
/* float-to-int v2, v2 */
/* aput v2, v1, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
(( android.content.res.TypedArray ) p2 ).getDrawable ( p1 ); // invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
this.a = p1;
(( android.content.res.TypedArray ) p2 ).recycle ( ); // invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V
/* invoke-direct {p0}, Landroid/support/design/widget/CoordinatorLayout;->c()V */
/* new-instance p1, Landroid/support/design/widget/CoordinatorLayout$c; */
/* invoke-direct {p1, p0}, Landroid/support/design/widget/CoordinatorLayout$c;-><init>(Landroid/support/design/widget/CoordinatorLayout;)V */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V */
return;
} // .end method
private Integer a ( Integer p0 ) {
/* .locals 4 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
final String v0 = "CoordinatorLayout"; // const-string v0, "CoordinatorLayout"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "No keylines defined for "; // const-string v3, "No keylines defined for "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v3 = " - attempted index lookup "; // const-string v3, " - attempted index lookup "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
} // :goto_0
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v0,p1 );
} // :cond_0
/* if-ltz p1, :cond_2 */
/* array-length v2, v0 */
/* if-lt p1, v2, :cond_1 */
} // :cond_1
/* aget p1, v0, p1 */
} // :cond_2
} // :goto_1
final String v0 = "CoordinatorLayout"; // const-string v0, "CoordinatorLayout"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "Keyline index "; // const-string v3, "Keyline index "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p1 = " out of range for "; // const-string p1, " out of range for "
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
} // .end method
private static android.graphics.Rect a ( ) {
/* .locals 1 */
v0 = android.support.design.widget.CoordinatorLayout.a;
/* check-cast v0, Landroid/graphics/Rect; */
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
} // :cond_0
} // .end method
static android.support.design.widget.CoordinatorLayout$Behavior a ( android.content.Context p0, android.util.AttributeSet p1, java.lang.String p2 ) {
/* .locals 4 */
v0 = android.text.TextUtils .isEmpty ( p2 );
if ( v0 != null) { // if-eqz v0, :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :cond_0
final String v0 = "."; // const-string v0, "."
v0 = (( java.lang.String ) p2 ).startsWith ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_1
/* const/16 v0, 0x2e */
v1 = (( java.lang.String ) p2 ).indexOf ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I
/* if-gez v1, :cond_2 */
v1 = android.support.design.widget.CoordinatorLayout.a;
v1 = android.text.TextUtils .isEmpty ( v1 );
/* if-nez v1, :cond_2 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
v2 = android.support.design.widget.CoordinatorLayout.a;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_2
} // :goto_0
try { // :try_start_0
v0 = android.support.design.widget.CoordinatorLayout.a;
(( java.lang.ThreadLocal ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
/* check-cast v0, Ljava/util/Map; */
/* if-nez v0, :cond_3 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
v1 = android.support.design.widget.CoordinatorLayout.a;
(( java.lang.ThreadLocal ) v1 ).set ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
} // :cond_3
/* check-cast v1, Ljava/lang/reflect/Constructor; */
int v2 = 1; // const/4 v2, 0x1
/* if-nez v1, :cond_4 */
(( android.content.Context ) p0 ).getClassLoader ( ); // invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;
(( java.lang.ClassLoader ) v1 ).loadClass ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
v3 = android.support.design.widget.CoordinatorLayout.a;
(( java.lang.Class ) v1 ).getConstructor ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
(( java.lang.reflect.Constructor ) v1 ).setAccessible ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V
} // :cond_4
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
/* aput-object p0, v0, v3 */
/* aput-object p1, v0, v2 */
(( java.lang.reflect.Constructor ) v1 ).newInstance ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Landroid/support/design/widget/CoordinatorLayout$Behavior; */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
/* new-instance p1, Ljava/lang/RuntimeException; */
java.lang.String .valueOf ( p2 );
final String v0 = "Could not inflate Behavior subclass "; // const-string v0, "Could not inflate Behavior subclass "
(( java.lang.String ) v0 ).concat ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
/* invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw p1 */
} // .end method
private static android.support.design.widget.CoordinatorLayout$d a ( android.view.View p0 ) {
/* .locals 6 */
(( android.view.View ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/support/design/widget/CoordinatorLayout$d; */
/* iget-boolean v1, v0, Landroid/support/design/widget/CoordinatorLayout$d;->a:Z */
/* if-nez v1, :cond_4 */
/* instance-of v1, p0, Landroid/support/design/widget/CoordinatorLayout$a; */
int v2 = 1; // const/4 v2, 0x1
if ( v1 != null) { // if-eqz v1, :cond_2
/* check-cast p0, Landroid/support/design/widget/CoordinatorLayout$a; */
/* if-nez p0, :cond_0 */
final String v1 = "CoordinatorLayout"; // const-string v1, "CoordinatorLayout"
final String v3 = "Attached behavior class is null"; // const-string v3, "Attached behavior class is null"
android.util.Log .e ( v1,v3 );
} // :cond_0
(( android.support.design.widget.CoordinatorLayout$d ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Landroid/support/design/widget/CoordinatorLayout$d;->a(Landroid/support/design/widget/CoordinatorLayout$Behavior;)V
} // :cond_1
} // :goto_0
/* iput-boolean v2, v0, Landroid/support/design/widget/CoordinatorLayout$d;->a:Z */
} // :cond_2
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
if ( p0 != null) { // if-eqz p0, :cond_3
/* const-class v1, Landroid/support/design/widget/CoordinatorLayout$b; */
(( java.lang.Class ) p0 ).getAnnotation ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
/* check-cast v1, Landroid/support/design/widget/CoordinatorLayout$b; */
/* if-nez v1, :cond_3 */
(( java.lang.Class ) p0 ).getSuperclass ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;
} // :cond_3
if ( v1 != null) { // if-eqz v1, :cond_1
try { // :try_start_0
int v3 = 0; // const/4 v3, 0x0
/* new-array v4, v3, [Ljava/lang/Class; */
(( java.lang.Class ) p0 ).getDeclaredConstructor ( v4 ); // invoke-virtual {p0, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
/* new-array v3, v3, [Ljava/lang/Object; */
(( java.lang.reflect.Constructor ) p0 ).newInstance ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Landroid/support/design/widget/CoordinatorLayout$Behavior; */
(( android.support.design.widget.CoordinatorLayout$d ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Landroid/support/design/widget/CoordinatorLayout$d;->a(Landroid/support/design/widget/CoordinatorLayout$Behavior;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
final String v3 = "CoordinatorLayout"; // const-string v3, "CoordinatorLayout"
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "Default behavior class "; // const-string v5, "Default behavior class "
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.Class ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " could not be instantiated.Did you forget a default constructor?"; // const-string v1, " could not be instantiated.Did you forget a default constructor?"
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v3,v1,p0 );
} // :cond_4
} // :goto_2
} // .end method
private void a ( ) {
/* .locals 12 */
v0 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_1 */
(( android.support.design.widget.CoordinatorLayout ) p0 ).getChildAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/design/widget/CoordinatorLayout;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Landroid/support/design/widget/CoordinatorLayout$d; */
v3 = this.a;
if ( v3 != null) { // if-eqz v3, :cond_0
android.os.SystemClock .uptimeMillis ( );
/* move-result-wide v6 */
int v8 = 3; // const/4 v8, 0x3
int v9 = 0; // const/4 v9, 0x0
int v10 = 0; // const/4 v10, 0x0
int v11 = 0; // const/4 v11, 0x0
/* move-wide v4, v6 */
/* invoke-static/range {v4 ..v11}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent; */
(( android.view.MotionEvent ) v3 ).recycle ( ); // invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
} // :goto_1
/* if-ge v2, v0, :cond_2 */
(( android.support.design.widget.CoordinatorLayout ) p0 ).getChildAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/design/widget/CoordinatorLayout;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Landroid/support/design/widget/CoordinatorLayout$d; */
/* iput-boolean v1, v3, Landroid/support/design/widget/CoordinatorLayout$d;->b:Z */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
/* iput-boolean v1, p0, Landroid/support/design/widget/CoordinatorLayout;->b:Z */
return;
} // .end method
private static void a ( Integer p0, android.graphics.Rect p1, android.graphics.Rect p2, android.support.design.widget.CoordinatorLayout$d p3, Integer p4, Integer p5 ) {
/* .locals 6 */
/* iget v0, p3, Landroid/support/design/widget/CoordinatorLayout$d;->a:I */
v0 = android.support.design.widget.CoordinatorLayout .d ( v0 );
v0 = dz .a ( v0,p0 );
/* iget p3, p3, Landroid/support/design/widget/CoordinatorLayout$d;->b:I */
p3 = android.support.design.widget.CoordinatorLayout .b ( p3 );
p0 = dz .a ( p3,p0 );
/* and-int/lit8 p3, v0, 0x7 */
/* and-int/lit8 v0, v0, 0x70 */
/* and-int/lit8 v1, p0, 0x7 */
/* and-int/lit8 p0, p0, 0x70 */
int v2 = 5; // const/4 v2, 0x5
int v3 = 1; // const/4 v3, 0x1
/* if-eq v1, v3, :cond_1 */
/* if-eq v1, v2, :cond_0 */
/* iget v1, p1, Landroid/graphics/Rect;->left:I */
} // :cond_0
/* iget v1, p1, Landroid/graphics/Rect;->right:I */
} // :cond_1
/* iget v1, p1, Landroid/graphics/Rect;->left:I */
v4 = (( android.graphics.Rect ) p1 ).width ( ); // invoke-virtual {p1}, Landroid/graphics/Rect;->width()I
/* div-int/lit8 v4, v4, 0x2 */
/* add-int/2addr v1, v4 */
} // :goto_0
/* const/16 v4, 0x50 */
/* const/16 v5, 0x10 */
/* if-eq p0, v5, :cond_3 */
/* if-eq p0, v4, :cond_2 */
/* iget p0, p1, Landroid/graphics/Rect;->top:I */
} // :cond_2
/* iget p0, p1, Landroid/graphics/Rect;->bottom:I */
} // :cond_3
/* iget p0, p1, Landroid/graphics/Rect;->top:I */
p1 = (( android.graphics.Rect ) p1 ).height ( ); // invoke-virtual {p1}, Landroid/graphics/Rect;->height()I
/* div-int/lit8 p1, p1, 0x2 */
/* add-int/2addr p0, p1 */
} // :goto_1
/* if-eq p3, v3, :cond_4 */
/* if-eq p3, v2, :cond_5 */
/* sub-int/2addr v1, p4 */
} // :cond_4
/* div-int/lit8 p1, p4, 0x2 */
/* sub-int/2addr v1, p1 */
} // :cond_5
} // :goto_2
/* if-eq v0, v5, :cond_6 */
/* if-eq v0, v4, :cond_7 */
/* sub-int/2addr p0, p5 */
} // :cond_6
/* div-int/lit8 p1, p5, 0x2 */
/* sub-int/2addr p0, p1 */
} // :cond_7
} // :goto_3
/* add-int/2addr p4, v1 */
/* add-int/2addr p5, p0 */
(( android.graphics.Rect ) p2 ).set ( v1, p0, p4, p5 ); // invoke-virtual {p2, v1, p0, p4, p5}, Landroid/graphics/Rect;->set(IIII)V
return;
} // .end method
private static void a ( android.graphics.Rect p0 ) {
/* .locals 1 */
(( android.graphics.Rect ) p0 ).setEmpty ( ); // invoke-virtual {p0}, Landroid/graphics/Rect;->setEmpty()V
v0 = android.support.design.widget.CoordinatorLayout.a;
return;
} // .end method
private void a ( android.support.design.widget.CoordinatorLayout$d p0, android.graphics.Rect p1, Integer p2, Integer p3 ) {
/* .locals 5 */
v0 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getWidth()I
v1 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getHeight()I
v2 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getPaddingLeft()I
/* iget v3, p1, Landroid/support/design/widget/CoordinatorLayout$d;->leftMargin:I */
/* add-int/2addr v2, v3 */
/* iget v3, p2, Landroid/graphics/Rect;->left:I */
v4 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getPaddingRight()I
/* sub-int/2addr v0, v4 */
/* sub-int/2addr v0, p3 */
/* iget v4, p1, Landroid/support/design/widget/CoordinatorLayout$d;->rightMargin:I */
/* sub-int/2addr v0, v4 */
v0 = java.lang.Math .min ( v3,v0 );
v0 = java.lang.Math .max ( v2,v0 );
v2 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getPaddingTop()I
/* iget v3, p1, Landroid/support/design/widget/CoordinatorLayout$d;->topMargin:I */
/* add-int/2addr v2, v3 */
/* iget v3, p2, Landroid/graphics/Rect;->top:I */
v4 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getPaddingBottom()I
/* sub-int/2addr v1, v4 */
/* sub-int/2addr v1, p4 */
/* iget p1, p1, Landroid/support/design/widget/CoordinatorLayout$d;->bottomMargin:I */
/* sub-int/2addr v1, p1 */
p1 = java.lang.Math .min ( v3,v1 );
p1 = java.lang.Math .max ( v2,p1 );
/* add-int/2addr p3, v0 */
/* add-int/2addr p4, p1 */
(( android.graphics.Rect ) p2 ).set ( v0, p1, p3, p4 ); // invoke-virtual {p2, v0, p1, p3, p4}, Landroid/graphics/Rect;->set(IIII)V
return;
} // .end method
private static void a ( android.view.View p0, Integer p1 ) {
/* .locals 2 */
(( android.view.View ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/support/design/widget/CoordinatorLayout$d; */
/* iget v1, v0, Landroid/support/design/widget/CoordinatorLayout$d;->g:I */
/* if-eq v1, p1, :cond_0 */
/* iget v1, v0, Landroid/support/design/widget/CoordinatorLayout$d;->g:I */
/* sub-int v1, p1, v1 */
em .c ( p0,v1 );
/* iput p1, v0, Landroid/support/design/widget/CoordinatorLayout$d;->g:I */
} // :cond_0
return;
} // .end method
private void a ( android.view.View p0, Boolean p1, android.graphics.Rect p2 ) {
/* .locals 2 */
v0 = (( android.view.View ) p1 ).isLayoutRequested ( ); // invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z
/* if-nez v0, :cond_2 */
v0 = (( android.view.View ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/view/View;->getVisibility()I
/* const/16 v1, 0x8 */
/* if-ne v0, v1, :cond_0 */
} // :cond_0
if ( p2 != null) { // if-eqz p2, :cond_1
fr .a ( p0,p1,p3 );
return;
} // :cond_1
p2 = (( android.view.View ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getLeft()I
v0 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
v1 = (( android.view.View ) p1 ).getRight ( ); // invoke-virtual {p1}, Landroid/view/View;->getRight()I
p1 = (( android.view.View ) p1 ).getBottom ( ); // invoke-virtual {p1}, Landroid/view/View;->getBottom()I
(( android.graphics.Rect ) p3 ).set ( p2, v0, v1, p1 ); // invoke-virtual {p3, p2, v0, v1, p1}, Landroid/graphics/Rect;->set(IIII)V
return;
} // :cond_2
} // :goto_0
(( android.graphics.Rect ) p3 ).setEmpty ( ); // invoke-virtual {p3}, Landroid/graphics/Rect;->setEmpty()V
return;
} // .end method
private Boolean a ( android.view.MotionEvent p0 ) {
/* .locals 18 */
/* move-object/from16 v0, p0 */
v1 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getActionMasked()I */
v2 = this.b;
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->isChildrenDrawingOrderEnabled()Z */
v4 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getChildCount()I */
/* add-int/lit8 v5, v4, -0x1 */
} // :goto_0
/* if-ltz v5, :cond_1 */
if ( v3 != null) { // if-eqz v3, :cond_0
v6 = (( android.support.design.widget.CoordinatorLayout ) v0 ).getChildDrawingOrder ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Landroid/support/design/widget/CoordinatorLayout;->getChildDrawingOrder(II)I
} // :cond_0
/* move v6, v5 */
} // :goto_1
(( android.support.design.widget.CoordinatorLayout ) v0 ).getChildAt ( v6 ); // invoke-virtual {v0, v6}, Landroid/support/design/widget/CoordinatorLayout;->getChildAt(I)Landroid/view/View;
/* add-int/lit8 v5, v5, -0x1 */
} // :cond_1
v3 = android.support.design.widget.CoordinatorLayout.a;
if ( v3 != null) { // if-eqz v3, :cond_2
java.util.Collections .sort ( v2,v3 );
v3 = } // :cond_2
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* move-object v7, v5 */
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
} // :goto_2
/* if-ge v5, v3, :cond_9 */
/* check-cast v8, Landroid/view/View; */
(( android.view.View ) v8 ).getLayoutParams ( ); // invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v8, Landroid/support/design/widget/CoordinatorLayout$d; */
v9 = this.a;
if ( v6 != null) { // if-eqz v6, :cond_3
if ( v1 != null) { // if-eqz v1, :cond_3
if ( v9 != null) { // if-eqz v9, :cond_8
/* if-nez v7, :cond_8 */
android.os.SystemClock .uptimeMillis ( );
/* move-result-wide v12 */
int v14 = 3; // const/4 v14, 0x3
int v15 = 0; // const/4 v15, 0x0
/* const/16 v16, 0x0 */
/* const/16 v17, 0x0 */
/* move-wide v10, v12 */
/* invoke-static/range {v10 ..v17}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent; */
} // :cond_3
v6 = this.a;
/* if-nez v6, :cond_4 */
/* iput-boolean v4, v8, Landroid/support/design/widget/CoordinatorLayout$d;->b:Z */
} // :cond_4
/* iget-boolean v6, v8, Landroid/support/design/widget/CoordinatorLayout$d;->b:Z */
/* iget-boolean v9, v8, Landroid/support/design/widget/CoordinatorLayout$d;->b:Z */
int v10 = 1; // const/4 v10, 0x1
if ( v9 != null) { // if-eqz v9, :cond_5
int v9 = 1; // const/4 v9, 0x1
} // :cond_5
/* iget-boolean v9, v8, Landroid/support/design/widget/CoordinatorLayout$d;->b:Z */
/* or-int/2addr v9, v4 */
/* iput-boolean v9, v8, Landroid/support/design/widget/CoordinatorLayout$d;->b:Z */
} // :goto_3
if ( v9 != null) { // if-eqz v9, :cond_6
/* if-nez v6, :cond_6 */
} // :cond_6
int v10 = 0; // const/4 v10, 0x0
} // :goto_4
if ( v9 != null) { // if-eqz v9, :cond_7
if ( v10 != null) { // if-eqz v10, :cond_9
} // :cond_7
/* move v6, v10 */
} // :cond_8
} // :goto_5
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_9
} // .end method
private static Integer b ( Integer p0 ) {
/* .locals 1 */
/* and-int/lit8 v0, p0, 0x7 */
/* if-nez v0, :cond_0 */
/* const v0, 0x800003 */
/* or-int/2addr p0, v0 */
} // :cond_0
/* and-int/lit8 v0, p0, 0x70 */
/* if-nez v0, :cond_1 */
/* or-int/lit8 p0, p0, 0x30 */
} // :cond_1
} // .end method
private void b ( ) {
/* .locals 11 */
v0 = this.a;
v0 = this.a;
v1 = this.a;
v1 = (( du ) v1 ).size ( ); // invoke-virtual {v1}, Ldu;->size()I
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v1, :cond_1 */
v4 = this.a;
(( du ) v4 ).b ( v3 ); // invoke-virtual {v4, v3}, Ldu;->b(I)Ljava/lang/Object;
/* check-cast v4, Ljava/util/ArrayList; */
if ( v4 != null) { // if-eqz v4, :cond_0
(( java.util.ArrayList ) v4 ).clear ( ); // invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V
v5 = this.a;
} // :cond_0
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_1
v0 = this.a;
(( du ) v0 ).clear ( ); // invoke-virtual {v0}, Ldu;->clear()V
v0 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
/* if-ge v1, v0, :cond_1a */
(( android.support.design.widget.CoordinatorLayout ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/support/design/widget/CoordinatorLayout;->getChildAt(I)Landroid/view/View;
android.support.design.widget.CoordinatorLayout .a ( v3 );
/* iget v5, v4, Landroid/support/design/widget/CoordinatorLayout$d;->d:I */
int v6 = -1; // const/4 v6, -0x1
int v7 = 0; // const/4 v7, 0x0
int v8 = 1; // const/4 v8, 0x1
/* if-ne v5, v6, :cond_2 */
} // :goto_2
this.b = v7;
this.a = v7;
/* goto/16 :goto_8 */
} // :cond_2
v5 = this.a;
if ( v5 != null) { // if-eqz v5, :cond_8
v5 = this.a;
v5 = (( android.view.View ) v5 ).getId ( ); // invoke-virtual {v5}, Landroid/view/View;->getId()I
/* iget v6, v4, Landroid/support/design/widget/CoordinatorLayout$d;->d:I */
/* if-eq v5, v6, :cond_3 */
} // :goto_3
int v5 = 0; // const/4 v5, 0x0
} // :cond_3
v5 = this.a;
v6 = this.a;
(( android.view.View ) v6 ).getParent ( ); // invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
} // :goto_4
/* if-eq v6, p0, :cond_7 */
if ( v6 != null) { // if-eqz v6, :cond_6
/* if-ne v6, v3, :cond_4 */
} // :cond_4
/* instance-of v9, v6, Landroid/view/View; */
if ( v9 != null) { // if-eqz v9, :cond_5
/* move-object v5, v6 */
/* check-cast v5, Landroid/view/View; */
} // :cond_5
} // :cond_6
} // :goto_5
this.b = v7;
this.a = v7;
} // :cond_7
this.b = v5;
int v5 = 1; // const/4 v5, 0x1
} // :goto_6
/* if-nez v5, :cond_10 */
} // :cond_8
/* iget v5, v4, Landroid/support/design/widget/CoordinatorLayout$d;->d:I */
(( android.support.design.widget.CoordinatorLayout ) p0 ).findViewById ( v5 ); // invoke-virtual {p0, v5}, Landroid/support/design/widget/CoordinatorLayout;->findViewById(I)Landroid/view/View;
this.a = v5;
v5 = this.a;
if ( v5 != null) { // if-eqz v5, :cond_f
v5 = this.a;
/* if-ne v5, p0, :cond_a */
v5 = (( android.support.design.widget.CoordinatorLayout ) p0 ).isInEditMode ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->isInEditMode()Z
if ( v5 != null) { // if-eqz v5, :cond_9
} // :cond_9
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "View can not be anchored to the the parent CoordinatorLayout"; // const-string v1, "View can not be anchored to the the parent CoordinatorLayout"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_a
v5 = this.a;
v6 = this.a;
(( android.view.View ) v6 ).getParent ( ); // invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
} // :goto_7
/* if-eq v6, p0, :cond_e */
if ( v6 != null) { // if-eqz v6, :cond_e
/* if-ne v6, v3, :cond_c */
v5 = (( android.support.design.widget.CoordinatorLayout ) p0 ).isInEditMode ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->isInEditMode()Z
if ( v5 != null) { // if-eqz v5, :cond_b
} // :cond_b
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Anchor must not be a descendant of the anchored view"; // const-string v1, "Anchor must not be a descendant of the anchored view"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_c
/* instance-of v9, v6, Landroid/view/View; */
if ( v9 != null) { // if-eqz v9, :cond_d
/* move-object v5, v6 */
/* check-cast v5, Landroid/view/View; */
} // :cond_d
} // :cond_e
this.b = v5;
} // :cond_f
v5 = (( android.support.design.widget.CoordinatorLayout ) p0 ).isInEditMode ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->isInEditMode()Z
if ( v5 != null) { // if-eqz v5, :cond_19
/* goto/16 :goto_2 */
} // :cond_10
} // :goto_8
v5 = this.a;
(( fh ) v5 ).a ( v3 ); // invoke-virtual {v5, v3}, Lfh;->a(Ljava/lang/Object;)V
int v5 = 0; // const/4 v5, 0x0
} // :goto_9
/* if-ge v5, v0, :cond_18 */
/* if-eq v5, v1, :cond_17 */
(( android.support.design.widget.CoordinatorLayout ) p0 ).getChildAt ( v5 ); // invoke-virtual {p0, v5}, Landroid/support/design/widget/CoordinatorLayout;->getChildAt(I)Landroid/view/View;
v7 = this.b;
/* if-eq v6, v7, :cond_12 */
v7 = em .b ( p0 );
(( android.view.View ) v6 ).getLayoutParams ( ); // invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v9, Landroid/support/design/widget/CoordinatorLayout$d; */
/* iget v9, v9, Landroid/support/design/widget/CoordinatorLayout$d;->e:I */
v9 = dz .a ( v9,v7 );
if ( v9 != null) { // if-eqz v9, :cond_11
/* iget v10, v4, Landroid/support/design/widget/CoordinatorLayout$d;->f:I */
v7 = dz .a ( v10,v7 );
/* and-int/2addr v7, v9 */
/* if-ne v7, v9, :cond_11 */
int v7 = 1; // const/4 v7, 0x1
} // :cond_11
int v7 = 0; // const/4 v7, 0x0
} // :goto_a
/* if-nez v7, :cond_12 */
v7 = this.a;
int v7 = 0; // const/4 v7, 0x0
} // :cond_12
int v7 = 1; // const/4 v7, 0x1
} // :goto_b
if ( v7 != null) { // if-eqz v7, :cond_17
v7 = this.a;
v7 = this.a;
v7 = (( du ) v7 ).containsKey ( v6 ); // invoke-virtual {v7, v6}, Ldu;->containsKey(Ljava/lang/Object;)Z
/* if-nez v7, :cond_13 */
v7 = this.a;
(( fh ) v7 ).a ( v6 ); // invoke-virtual {v7, v6}, Lfh;->a(Ljava/lang/Object;)V
} // :cond_13
v7 = this.a;
v9 = this.a;
v9 = (( du ) v9 ).containsKey ( v6 ); // invoke-virtual {v9, v6}, Ldu;->containsKey(Ljava/lang/Object;)Z
if ( v9 != null) { // if-eqz v9, :cond_16
v9 = this.a;
v9 = (( du ) v9 ).containsKey ( v3 ); // invoke-virtual {v9, v3}, Ldu;->containsKey(Ljava/lang/Object;)Z
if ( v9 != null) { // if-eqz v9, :cond_16
v9 = this.a;
(( du ) v9 ).get ( v6 ); // invoke-virtual {v9, v6}, Ldu;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v9, Ljava/util/ArrayList; */
/* if-nez v9, :cond_15 */
v9 = this.a;
/* check-cast v9, Ljava/util/ArrayList; */
/* if-nez v9, :cond_14 */
/* new-instance v9, Ljava/util/ArrayList; */
/* invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V */
} // :cond_14
v7 = this.a;
(( du ) v7 ).put ( v6, v9 ); // invoke-virtual {v7, v6, v9}, Ldu;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_15
(( java.util.ArrayList ) v9 ).add ( v3 ); // invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_16
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "All nodes must be present in the graph before being added as an edge"; // const-string v1, "All nodes must be present in the graph before being added as an edge"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_17
} // :goto_c
/* add-int/lit8 v5, v5, 0x1 */
/* goto/16 :goto_9 */
} // :cond_18
/* add-int/lit8 v1, v1, 0x1 */
/* goto/16 :goto_1 */
} // :cond_19
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Could not find CoordinatorLayout descendant view with id "; // const-string v2, "Could not find CoordinatorLayout descendant view with id "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( android.support.design.widget.CoordinatorLayout ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getResources()Landroid/content/res/Resources;
/* iget v4, v4, Landroid/support/design/widget/CoordinatorLayout$d;->d:I */
(( android.content.res.Resources ) v2 ).getResourceName ( v4 ); // invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " to anchor view "; // const-string v2, " to anchor view "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1a
v0 = this.a;
v1 = this.a;
(( fh ) v1 ).a ( ); // invoke-virtual {v1}, Lfh;->a()Ljava/util/ArrayList;
v0 = this.a;
java.util.Collections .reverse ( v0 );
return;
} // .end method
private static void b ( android.view.View p0, Integer p1 ) {
/* .locals 2 */
(( android.view.View ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/support/design/widget/CoordinatorLayout$d; */
/* iget v1, v0, Landroid/support/design/widget/CoordinatorLayout$d;->h:I */
/* if-eq v1, p1, :cond_0 */
/* iget v1, v0, Landroid/support/design/widget/CoordinatorLayout$d;->h:I */
/* sub-int v1, p1, v1 */
em .b ( p0,v1 );
/* iput p1, v0, Landroid/support/design/widget/CoordinatorLayout$d;->h:I */
} // :cond_0
return;
} // .end method
private static Integer c ( Integer p0 ) {
/* .locals 0 */
/* if-nez p0, :cond_0 */
/* const p0, 0x800035 */
} // :cond_0
} // .end method
private void c ( ) {
/* .locals 2 */
/* const/16 v1, 0x15 */
/* if-ge v0, v1, :cond_0 */
return;
} // :cond_0
v0 = em .a ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.a;
/* if-nez v0, :cond_1 */
/* new-instance v0, Landroid/support/design/widget/CoordinatorLayout$1; */
/* invoke-direct {v0, p0}, Landroid/support/design/widget/CoordinatorLayout$1;-><init>(Landroid/support/design/widget/CoordinatorLayout;)V */
this.a = v0;
} // :cond_1
v0 = this.a;
em .a ( p0,v0 );
/* const/16 v0, 0x500 */
(( android.support.design.widget.CoordinatorLayout ) p0 ).setSystemUiVisibility ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/design/widget/CoordinatorLayout;->setSystemUiVisibility(I)V
return;
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
em .a ( p0,v0 );
return;
} // .end method
private static Integer d ( Integer p0 ) {
/* .locals 0 */
/* if-nez p0, :cond_0 */
/* const/16 p0, 0x11 */
} // :cond_0
} // .end method
/* # virtual methods */
final void a ( Integer p0 ) {
/* .locals 23 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, p1 */
v8 = /* invoke-static/range {p0 ..p0}, Lem;->b(Landroid/view/View;)I */
v9 = v2 = this.a;
android.support.design.widget.CoordinatorLayout .a ( );
android.support.design.widget.CoordinatorLayout .a ( );
android.support.design.widget.CoordinatorLayout .a ( );
int v13 = 0; // const/4 v13, 0x0
int v14 = 0; // const/4 v14, 0x0
} // :goto_0
/* if-ge v14, v9, :cond_17 */
v2 = this.a;
/* move-object v15, v2 */
/* check-cast v15, Landroid/view/View; */
(( android.view.View ) v15 ).getLayoutParams ( ); // invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* move-object v7, v2 */
/* check-cast v7, Landroid/support/design/widget/CoordinatorLayout$d; */
/* if-nez v1, :cond_1 */
v2 = (( android.view.View ) v15 ).getVisibility ( ); // invoke-virtual {v15}, Landroid/view/View;->getVisibility()I
/* const/16 v3, 0x8 */
/* if-eq v2, v3, :cond_0 */
} // :cond_0
/* move v3, v9 */
/* move/from16 v22, v14 */
int v2 = 0; // const/4 v2, 0x0
/* goto/16 :goto_e */
} // :cond_1
} // :goto_1
int v6 = 0; // const/4 v6, 0x0
} // :goto_2
/* if-ge v6, v14, :cond_6 */
v2 = this.a;
/* check-cast v2, Landroid/view/View; */
v3 = this.b;
/* if-ne v3, v2, :cond_5 */
(( android.view.View ) v15 ).getLayoutParams ( ); // invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* move-object v5, v2 */
/* check-cast v5, Landroid/support/design/widget/CoordinatorLayout$d; */
v2 = this.a;
if ( v2 != null) { // if-eqz v2, :cond_5
android.support.design.widget.CoordinatorLayout .a ( );
android.support.design.widget.CoordinatorLayout .a ( );
android.support.design.widget.CoordinatorLayout .a ( );
/* move-object/from16 v16, v2 */
v2 = this.a;
fr .a ( v0,v2,v4 );
/* invoke-direct {v0, v15, v13, v3}, Landroid/support/design/widget/CoordinatorLayout;->a(Landroid/view/View;ZLandroid/graphics/Rect;)V */
v2 = (( android.view.View ) v15 ).getMeasuredWidth ( ); // invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I
v13 = (( android.view.View ) v15 ).getMeasuredHeight ( ); // invoke-virtual {v15}, Landroid/view/View;->getMeasuredHeight()I
/* move-object/from16 v17, v16 */
/* move/from16 v16, v2 */
/* move v2, v8 */
/* move/from16 v18, v9 */
/* move-object v9, v3 */
/* move-object v3, v4 */
/* move-object/from16 v19, v4 */
/* move-object/from16 v4, v17 */
/* move-object/from16 v20, v5 */
/* move/from16 v21, v6 */
/* move/from16 v6, v16 */
/* move/from16 v22, v14 */
/* move-object v14, v7 */
/* move v7, v13 */
/* invoke-static/range {v2 ..v7}, Landroid/support/design/widget/CoordinatorLayout;->a(ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroid/support/design/widget/CoordinatorLayout$d;II)V */
/* move-object/from16 v2, v17 */
/* iget v3, v2, Landroid/graphics/Rect;->left:I */
/* iget v4, v9, Landroid/graphics/Rect;->left:I */
/* if-ne v3, v4, :cond_2 */
/* iget v3, v2, Landroid/graphics/Rect;->top:I */
/* iget v3, v9, Landroid/graphics/Rect;->top:I */
} // :cond_2
/* move/from16 v4, v16 */
/* move-object/from16 v3, v20 */
/* invoke-direct {v0, v3, v2, v4, v13}, Landroid/support/design/widget/CoordinatorLayout;->a(Landroid/support/design/widget/CoordinatorLayout$d;Landroid/graphics/Rect;II)V */
/* iget v3, v2, Landroid/graphics/Rect;->left:I */
/* iget v4, v9, Landroid/graphics/Rect;->left:I */
/* sub-int/2addr v3, v4 */
/* iget v4, v2, Landroid/graphics/Rect;->top:I */
/* iget v5, v9, Landroid/graphics/Rect;->top:I */
/* sub-int/2addr v4, v5 */
if ( v3 != null) { // if-eqz v3, :cond_3
em .c ( v15,v3 );
} // :cond_3
if ( v4 != null) { // if-eqz v4, :cond_4
em .b ( v15,v4 );
} // :cond_4
/* invoke-static/range {v19 ..v19}, Landroid/support/design/widget/CoordinatorLayout;->a(Landroid/graphics/Rect;)V */
android.support.design.widget.CoordinatorLayout .a ( v9 );
android.support.design.widget.CoordinatorLayout .a ( v2 );
} // :cond_5
/* move/from16 v21, v6 */
/* move/from16 v18, v9 */
/* move/from16 v22, v14 */
/* move-object v14, v7 */
} // :goto_3
/* add-int/lit8 v6, v21, 0x1 */
/* move-object v7, v14 */
/* move/from16 v9, v18 */
/* move/from16 v14, v22 */
int v13 = 0; // const/4 v13, 0x0
/* goto/16 :goto_2 */
} // :cond_6
/* move/from16 v18, v9 */
/* move/from16 v22, v14 */
/* move-object v14, v7 */
int v13 = 1; // const/4 v13, 0x1
/* invoke-direct {v0, v15, v13, v11}, Landroid/support/design/widget/CoordinatorLayout;->a(Landroid/view/View;ZLandroid/graphics/Rect;)V */
/* iget v2, v14, Landroid/support/design/widget/CoordinatorLayout$d;->e:I */
int v3 = 5; // const/4 v3, 0x5
int v4 = 3; // const/4 v4, 0x3
/* const/16 v5, 0x50 */
/* const/16 v6, 0x30 */
if ( v2 != null) { // if-eqz v2, :cond_b
v2 = (( android.graphics.Rect ) v11 ).isEmpty ( ); // invoke-virtual {v11}, Landroid/graphics/Rect;->isEmpty()Z
/* if-nez v2, :cond_b */
/* iget v2, v14, Landroid/support/design/widget/CoordinatorLayout$d;->e:I */
v2 = dz .a ( v2,v8 );
/* and-int/lit8 v7, v2, 0x70 */
/* if-eq v7, v6, :cond_8 */
/* if-eq v7, v5, :cond_7 */
} // :cond_7
/* iget v7, v10, Landroid/graphics/Rect;->bottom:I */
v9 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getHeight()I */
/* iget v13, v11, Landroid/graphics/Rect;->top:I */
/* sub-int/2addr v9, v13 */
v7 = java.lang.Math .max ( v7,v9 );
/* iput v7, v10, Landroid/graphics/Rect;->bottom:I */
} // :cond_8
/* iget v7, v10, Landroid/graphics/Rect;->top:I */
/* iget v9, v11, Landroid/graphics/Rect;->bottom:I */
v7 = java.lang.Math .max ( v7,v9 );
/* iput v7, v10, Landroid/graphics/Rect;->top:I */
} // :goto_4
/* and-int/lit8 v2, v2, 0x7 */
/* if-eq v2, v4, :cond_a */
/* if-eq v2, v3, :cond_9 */
} // :cond_9
/* iget v2, v10, Landroid/graphics/Rect;->right:I */
v7 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getWidth()I */
/* iget v9, v11, Landroid/graphics/Rect;->left:I */
/* sub-int/2addr v7, v9 */
v2 = java.lang.Math .max ( v2,v7 );
/* iput v2, v10, Landroid/graphics/Rect;->right:I */
} // :cond_a
/* iget v2, v10, Landroid/graphics/Rect;->left:I */
/* iget v7, v11, Landroid/graphics/Rect;->right:I */
v2 = java.lang.Math .max ( v2,v7 );
/* iput v2, v10, Landroid/graphics/Rect;->left:I */
} // :cond_b
} // :goto_5
/* iget v2, v14, Landroid/support/design/widget/CoordinatorLayout$d;->f:I */
if ( v2 != null) { // if-eqz v2, :cond_13
v2 = (( android.view.View ) v15 ).getVisibility ( ); // invoke-virtual {v15}, Landroid/view/View;->getVisibility()I
/* if-nez v2, :cond_13 */
v2 = em .d ( v15 );
if ( v2 != null) { // if-eqz v2, :cond_13
v2 = (( android.view.View ) v15 ).getWidth ( ); // invoke-virtual {v15}, Landroid/view/View;->getWidth()I
/* if-lez v2, :cond_13 */
v2 = (( android.view.View ) v15 ).getHeight ( ); // invoke-virtual {v15}, Landroid/view/View;->getHeight()I
/* if-gtz v2, :cond_c */
/* goto/16 :goto_a */
} // :cond_c
(( android.view.View ) v15 ).getLayoutParams ( ); // invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroid/support/design/widget/CoordinatorLayout$d; */
android.support.design.widget.CoordinatorLayout .a ( );
android.support.design.widget.CoordinatorLayout .a ( );
v13 = (( android.view.View ) v15 ).getLeft ( ); // invoke-virtual {v15}, Landroid/view/View;->getLeft()I
v14 = (( android.view.View ) v15 ).getTop ( ); // invoke-virtual {v15}, Landroid/view/View;->getTop()I
v3 = (( android.view.View ) v15 ).getRight ( ); // invoke-virtual {v15}, Landroid/view/View;->getRight()I
v4 = (( android.view.View ) v15 ).getBottom ( ); // invoke-virtual {v15}, Landroid/view/View;->getBottom()I
(( android.graphics.Rect ) v9 ).set ( v13, v14, v3, v4 ); // invoke-virtual {v9, v13, v14, v3, v4}, Landroid/graphics/Rect;->set(IIII)V
(( android.graphics.Rect ) v7 ).set ( v9 ); // invoke-virtual {v7, v9}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
android.support.design.widget.CoordinatorLayout .a ( v9 );
v3 = (( android.graphics.Rect ) v7 ).isEmpty ( ); // invoke-virtual {v7}, Landroid/graphics/Rect;->isEmpty()Z
/* if-nez v3, :cond_12 */
/* iget v3, v2, Landroid/support/design/widget/CoordinatorLayout$d;->f:I */
v3 = dz .a ( v3,v8 );
/* and-int/lit8 v4, v3, 0x30 */
/* if-ne v4, v6, :cond_d */
/* iget v4, v7, Landroid/graphics/Rect;->top:I */
/* iget v6, v2, Landroid/support/design/widget/CoordinatorLayout$d;->topMargin:I */
/* sub-int/2addr v4, v6 */
/* iget v6, v2, Landroid/support/design/widget/CoordinatorLayout$d;->h:I */
/* sub-int/2addr v4, v6 */
/* iget v6, v10, Landroid/graphics/Rect;->top:I */
/* if-ge v4, v6, :cond_d */
/* iget v6, v10, Landroid/graphics/Rect;->top:I */
/* sub-int/2addr v6, v4 */
android.support.design.widget.CoordinatorLayout .b ( v15,v6 );
int v13 = 1; // const/4 v13, 0x1
} // :cond_d
int v13 = 0; // const/4 v13, 0x0
} // :goto_6
/* and-int/lit8 v4, v3, 0x50 */
/* if-ne v4, v5, :cond_e */
v4 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getHeight()I */
/* iget v5, v7, Landroid/graphics/Rect;->bottom:I */
/* sub-int/2addr v4, v5 */
/* iget v5, v2, Landroid/support/design/widget/CoordinatorLayout$d;->bottomMargin:I */
/* sub-int/2addr v4, v5 */
/* iget v5, v2, Landroid/support/design/widget/CoordinatorLayout$d;->h:I */
/* add-int/2addr v4, v5 */
/* iget v5, v10, Landroid/graphics/Rect;->bottom:I */
/* if-ge v4, v5, :cond_e */
/* iget v5, v10, Landroid/graphics/Rect;->bottom:I */
/* sub-int/2addr v4, v5 */
android.support.design.widget.CoordinatorLayout .b ( v15,v4 );
int v13 = 1; // const/4 v13, 0x1
} // :cond_e
/* if-nez v13, :cond_f */
int v4 = 0; // const/4 v4, 0x0
android.support.design.widget.CoordinatorLayout .b ( v15,v4 );
} // :cond_f
/* and-int/lit8 v4, v3, 0x3 */
int v5 = 3; // const/4 v5, 0x3
/* if-ne v4, v5, :cond_10 */
/* iget v4, v7, Landroid/graphics/Rect;->left:I */
/* iget v5, v2, Landroid/support/design/widget/CoordinatorLayout$d;->leftMargin:I */
/* sub-int/2addr v4, v5 */
/* iget v5, v2, Landroid/support/design/widget/CoordinatorLayout$d;->g:I */
/* sub-int/2addr v4, v5 */
/* iget v5, v10, Landroid/graphics/Rect;->left:I */
/* if-ge v4, v5, :cond_10 */
/* iget v5, v10, Landroid/graphics/Rect;->left:I */
/* sub-int/2addr v5, v4 */
android.support.design.widget.CoordinatorLayout .a ( v15,v5 );
int v13 = 1; // const/4 v13, 0x1
} // :cond_10
int v13 = 0; // const/4 v13, 0x0
} // :goto_7
/* and-int/lit8 v3, v3, 0x5 */
int v4 = 5; // const/4 v4, 0x5
/* if-ne v3, v4, :cond_11 */
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getWidth()I */
/* iget v4, v7, Landroid/graphics/Rect;->right:I */
/* sub-int/2addr v3, v4 */
/* iget v4, v2, Landroid/support/design/widget/CoordinatorLayout$d;->rightMargin:I */
/* sub-int/2addr v3, v4 */
/* iget v2, v2, Landroid/support/design/widget/CoordinatorLayout$d;->g:I */
/* add-int/2addr v3, v2 */
/* iget v2, v10, Landroid/graphics/Rect;->right:I */
/* if-ge v3, v2, :cond_11 */
/* iget v2, v10, Landroid/graphics/Rect;->right:I */
/* sub-int/2addr v3, v2 */
android.support.design.widget.CoordinatorLayout .a ( v15,v3 );
/* const/16 v16, 0x1 */
} // :cond_11
/* move/from16 v16, v13 */
} // :goto_8
/* if-nez v16, :cond_12 */
int v2 = 0; // const/4 v2, 0x0
android.support.design.widget.CoordinatorLayout .a ( v15,v2 );
} // :cond_12
int v2 = 0; // const/4 v2, 0x0
} // :goto_9
android.support.design.widget.CoordinatorLayout .a ( v7 );
} // :cond_13
} // :goto_a
int v2 = 0; // const/4 v2, 0x0
} // :goto_b
int v3 = 2; // const/4 v3, 0x2
/* if-eq v1, v3, :cond_15 */
(( android.view.View ) v15 ).getLayoutParams ( ); // invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Landroid/support/design/widget/CoordinatorLayout$d; */
v3 = this.a;
(( android.graphics.Rect ) v12 ).set ( v3 ); // invoke-virtual {v12, v3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
v3 = (( android.graphics.Rect ) v12 ).equals ( v11 ); // invoke-virtual {v12, v11}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_14 */
(( android.view.View ) v15 ).getLayoutParams ( ); // invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Landroid/support/design/widget/CoordinatorLayout$d; */
v3 = this.a;
(( android.graphics.Rect ) v3 ).set ( v11 ); // invoke-virtual {v3, v11}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
} // :cond_14
/* move/from16 v3, v18 */
} // :cond_15
} // :goto_c
/* add-int/lit8 v14, v22, 0x1 */
/* move/from16 v3, v18 */
} // :goto_d
/* if-ge v14, v3, :cond_16 */
v4 = this.a;
/* check-cast v4, Landroid/view/View; */
(( android.view.View ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* add-int/lit8 v14, v14, 0x1 */
} // :cond_16
} // :goto_e
/* add-int/lit8 v14, v22, 0x1 */
/* move v9, v3 */
int v13 = 0; // const/4 v13, 0x0
/* goto/16 :goto_0 */
} // :cond_17
android.support.design.widget.CoordinatorLayout .a ( v10 );
android.support.design.widget.CoordinatorLayout .a ( v11 );
android.support.design.widget.CoordinatorLayout .a ( v12 );
return;
} // .end method
public final void a ( Integer p0, Integer p1 ) {
/* .locals 6 */
p1 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getChildCount()I
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
int v2 = 1; // const/4 v2, 0x1
/* if-ge v0, p1, :cond_1 */
(( android.support.design.widget.CoordinatorLayout ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/design/widget/CoordinatorLayout;->getChildAt(I)Landroid/view/View;
v4 = (( android.view.View ) v3 ).getVisibility ( ); // invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
/* const/16 v5, 0x8 */
/* if-eq v4, v5, :cond_0 */
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Landroid/support/design/widget/CoordinatorLayout$d; */
v4 = (( android.support.design.widget.CoordinatorLayout$d ) v3 ).a ( p2 ); // invoke-virtual {v3, p2}, Landroid/support/design/widget/CoordinatorLayout$d;->a(I)Z
if ( v4 != null) { // if-eqz v4, :cond_0
v3 = this.a;
if ( v3 != null) { // if-eqz v3, :cond_0
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
if ( v1 != null) { // if-eqz v1, :cond_2
(( android.support.design.widget.CoordinatorLayout ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/design/widget/CoordinatorLayout;->a(I)V
} // :cond_2
return;
} // .end method
public final void a ( Integer p0, Integer p1, Integer[] p2, Integer p3 ) {
/* .locals 10 */
v0 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
int v6 = 1; // const/4 v6, 0x1
/* if-ge v2, v0, :cond_3 */
(( android.support.design.widget.CoordinatorLayout ) p0 ).getChildAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/design/widget/CoordinatorLayout;->getChildAt(I)Landroid/view/View;
v8 = (( android.view.View ) v7 ).getVisibility ( ); // invoke-virtual {v7}, Landroid/view/View;->getVisibility()I
/* const/16 v9, 0x8 */
/* if-eq v8, v9, :cond_2 */
(( android.view.View ) v7 ).getLayoutParams ( ); // invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v7, Landroid/support/design/widget/CoordinatorLayout$d; */
v8 = (( android.support.design.widget.CoordinatorLayout$d ) v7 ).a ( p4 ); // invoke-virtual {v7, p4}, Landroid/support/design/widget/CoordinatorLayout$d;->a(I)Z
if ( v8 != null) { // if-eqz v8, :cond_2
v7 = this.a;
if ( v7 != null) { // if-eqz v7, :cond_2
v5 = this.a;
/* aput v1, v5, v6 */
/* aput v1, v5, v1 */
/* if-lez p1, :cond_0 */
/* aget v5, v5, v1 */
v3 = java.lang.Math .max ( v3,v5 );
} // :cond_0
/* aget v5, v5, v1 */
v3 = java.lang.Math .min ( v3,v5 );
} // :goto_1
/* if-lez p2, :cond_1 */
v5 = this.a;
/* aget v5, v5, v6 */
v4 = java.lang.Math .max ( v4,v5 );
} // :cond_1
v5 = this.a;
/* aget v5, v5, v6 */
v4 = java.lang.Math .min ( v4,v5 );
} // :goto_2
int v5 = 1; // const/4 v5, 0x1
} // :cond_2
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_3
/* aput v3, p3, v1 */
/* aput v4, p3, v6 */
if ( v5 != null) { // if-eqz v5, :cond_4
(( android.support.design.widget.CoordinatorLayout ) p0 ).a ( v6 ); // invoke-virtual {p0, v6}, Landroid/support/design/widget/CoordinatorLayout;->a(I)V
} // :cond_4
return;
} // .end method
public final void a ( android.view.View p0, Integer p1, Integer p2 ) {
/* .locals 0 */
p3 = this.a;
/* iput p2, p3, Lei;->a:I */
this.b = p1;
p1 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getChildCount()I
int p2 = 0; // const/4 p2, 0x0
} // :goto_0
/* if-ge p2, p1, :cond_0 */
(( android.support.design.widget.CoordinatorLayout ) p0 ).getChildAt ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/design/widget/CoordinatorLayout;->getChildAt(I)Landroid/view/View;
(( android.view.View ) p3 ).getLayoutParams ( ); // invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* add-int/lit8 p2, p2, 0x1 */
} // :cond_0
return;
} // .end method
public final Boolean a ( Integer p0, Integer p1 ) {
/* .locals 5 */
p1 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getChildCount()I
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, p1, :cond_1 */
(( android.support.design.widget.CoordinatorLayout ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/support/design/widget/CoordinatorLayout;->getChildAt(I)Landroid/view/View;
v3 = (( android.view.View ) v2 ).getVisibility ( ); // invoke-virtual {v2}, Landroid/view/View;->getVisibility()I
/* const/16 v4, 0x8 */
/* if-eq v3, v4, :cond_0 */
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroid/support/design/widget/CoordinatorLayout$d; */
(( android.support.design.widget.CoordinatorLayout$d ) v2 ).a ( p2 ); // invoke-virtual {v2, p2}, Landroid/support/design/widget/CoordinatorLayout$d;->a(I)V
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
} // .end method
public final void b ( Integer p0 ) {
/* .locals 5 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
/* iput v1, v0, Lei;->a:I */
v0 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getChildCount()I
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_1 */
(( android.support.design.widget.CoordinatorLayout ) p0 ).getChildAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/design/widget/CoordinatorLayout;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Landroid/support/design/widget/CoordinatorLayout$d; */
v4 = (( android.support.design.widget.CoordinatorLayout$d ) v3 ).a ( p1 ); // invoke-virtual {v3, p1}, Landroid/support/design/widget/CoordinatorLayout$d;->a(I)Z
if ( v4 != null) { // if-eqz v4, :cond_0
(( android.support.design.widget.CoordinatorLayout$d ) v3 ).a ( p1 ); // invoke-virtual {v3, p1}, Landroid/support/design/widget/CoordinatorLayout$d;->a(I)V
/* iput-boolean v1, v3, Landroid/support/design/widget/CoordinatorLayout$d;->c:Z */
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
this.b = p1;
return;
} // .end method
protected Boolean checkLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 1 */
/* instance-of v0, p1, Landroid/support/design/widget/CoordinatorLayout$d; */
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
protected Boolean drawChild ( android.graphics.Canvas p0, android.view.View p1, Long p2 ) {
/* .locals 0 */
(( android.view.View ) p2 ).getLayoutParams ( ); // invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
p1 = /* invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z */
} // .end method
protected void drawableStateChanged ( ) {
/* .locals 4 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->drawableStateChanged()V */
(( android.support.design.widget.CoordinatorLayout ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getDrawableState()[I
v1 = this.a;
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_0
v3 = (( android.graphics.drawable.Drawable ) v1 ).isStateful ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( v3 != null) { // if-eqz v3, :cond_0
v0 = (( android.graphics.drawable.Drawable ) v1 ).setState ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z
/* or-int/2addr v2, v0 */
} // :cond_0
if ( v2 != null) { // if-eqz v2, :cond_1
(( android.support.design.widget.CoordinatorLayout ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->invalidate()V
} // :cond_1
return;
} // .end method
protected android.view.ViewGroup$LayoutParams generateDefaultLayoutParams ( ) { //synthethic
/* .locals 1 */
/* new-instance v0, Landroid/support/design/widget/CoordinatorLayout$d; */
/* invoke-direct {v0}, Landroid/support/design/widget/CoordinatorLayout$d;-><init>()V */
} // .end method
public android.view.ViewGroup$LayoutParams generateLayoutParams ( android.util.AttributeSet p0 ) { //synthethic
/* .locals 2 */
/* new-instance v0, Landroid/support/design/widget/CoordinatorLayout$d; */
(( android.support.design.widget.CoordinatorLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1, p1}, Landroid/support/design/widget/CoordinatorLayout$d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
protected android.view.ViewGroup$LayoutParams generateLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) { //synthethic
/* .locals 1 */
/* instance-of v0, p1, Landroid/support/design/widget/CoordinatorLayout$d; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v0, Landroid/support/design/widget/CoordinatorLayout$d; */
/* check-cast p1, Landroid/support/design/widget/CoordinatorLayout$d; */
/* invoke-direct {v0, p1}, Landroid/support/design/widget/CoordinatorLayout$d;-><init>(Landroid/support/design/widget/CoordinatorLayout$d;)V */
} // :cond_0
/* instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* new-instance v0, Landroid/support/design/widget/CoordinatorLayout$d; */
/* check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams; */
/* invoke-direct {v0, p1}, Landroid/support/design/widget/CoordinatorLayout$d;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V */
} // :cond_1
/* new-instance v0, Landroid/support/design/widget/CoordinatorLayout$d; */
/* invoke-direct {v0, p1}, Landroid/support/design/widget/CoordinatorLayout$d;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
} // .end method
final java.util.List getDependencySortedChildren ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
/* invoke-direct {p0}, Landroid/support/design/widget/CoordinatorLayout;->b()V */
v0 = this.a;
java.util.Collections .unmodifiableList ( v0 );
} // .end method
public final et getLastWindowInsets ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public Integer getNestedScrollAxes ( ) {
/* .locals 1 */
v0 = this.a;
/* iget v0, v0, Lei;->a:I */
} // .end method
public android.graphics.drawable.Drawable getStatusBarBackground ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
protected Integer getSuggestedMinimumHeight ( ) {
/* .locals 3 */
v0 = /* invoke-super {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumHeight()I */
v1 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getPaddingTop()I
v2 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getPaddingBottom()I
/* add-int/2addr v1, v2 */
v0 = java.lang.Math .max ( v0,v1 );
} // .end method
protected Integer getSuggestedMinimumWidth ( ) {
/* .locals 3 */
v0 = /* invoke-super {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumWidth()I */
v1 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getPaddingLeft()I
v2 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getPaddingRight()I
/* add-int/2addr v1, v2 */
v0 = java.lang.Math .max ( v0,v1 );
} // .end method
public void onAttachedToWindow ( ) {
/* .locals 2 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V */
/* invoke-direct {p0}, Landroid/support/design/widget/CoordinatorLayout;->a()V */
/* iget-boolean v0, p0, Landroid/support/design/widget/CoordinatorLayout;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/support/design/widget/CoordinatorLayout$e; */
/* invoke-direct {v0, p0}, Landroid/support/design/widget/CoordinatorLayout$e;-><init>(Landroid/support/design/widget/CoordinatorLayout;)V */
this.a = v0;
} // :cond_0
(( android.support.design.widget.CoordinatorLayout ) p0 ).getViewTreeObserver ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
v1 = this.a;
(( android.view.ViewTreeObserver ) v0 ).addOnPreDrawListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
} // :cond_1
v0 = this.a;
/* if-nez v0, :cond_2 */
v0 = em .a ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_2
em .b ( p0 );
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Landroid/support/design/widget/CoordinatorLayout;->c:Z */
return;
} // .end method
public void onDetachedFromWindow ( ) {
/* .locals 2 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V */
/* invoke-direct {p0}, Landroid/support/design/widget/CoordinatorLayout;->a()V */
/* iget-boolean v0, p0, Landroid/support/design/widget/CoordinatorLayout;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.support.design.widget.CoordinatorLayout ) p0 ).getViewTreeObserver ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
v1 = this.a;
(( android.view.ViewTreeObserver ) v0 ).removeOnPreDrawListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
} // :cond_0
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
(( android.support.design.widget.CoordinatorLayout ) p0 ).onStopNestedScroll ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/design/widget/CoordinatorLayout;->onStopNestedScroll(Landroid/view/View;)V
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Landroid/support/design/widget/CoordinatorLayout;->c:Z */
return;
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 4 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V */
/* iget-boolean v0, p0, Landroid/support/design/widget/CoordinatorLayout;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( et ) v0 ).b ( ); // invoke-virtual {v0}, Let;->b()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-lez v0, :cond_1 */
v2 = this.a;
v3 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getWidth()I
(( android.graphics.drawable.Drawable ) v2 ).setBounds ( v1, v1, v3, v0 ); // invoke-virtual {v2, v1, v1, v3, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
v0 = this.a;
(( android.graphics.drawable.Drawable ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
} // :cond_1
return;
} // .end method
public Boolean onInterceptTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 1 */
v0 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
/* if-nez v0, :cond_0 */
/* invoke-direct {p0}, Landroid/support/design/widget/CoordinatorLayout;->a()V */
} // :cond_0
/* invoke-direct {p0, p1}, Landroid/support/design/widget/CoordinatorLayout;->a(Landroid/view/MotionEvent;)Z */
int p1 = 1; // const/4 p1, 0x1
/* if-eq v0, p1, :cond_1 */
int p1 = 3; // const/4 p1, 0x3
/* if-ne v0, p1, :cond_2 */
} // :cond_1
/* invoke-direct {p0}, Landroid/support/design/widget/CoordinatorLayout;->a()V */
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
} // .end method
protected void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 16 */
/* move-object/from16 v1, p0 */
v0 = /* invoke-static/range {p0 ..p0}, Lem;->b(Landroid/view/View;)I */
v8 = v2 = this.a;
int v9 = 0; // const/4 v9, 0x0
int v10 = 0; // const/4 v10, 0x0
} // :goto_0
/* if-ge v10, v8, :cond_c */
v2 = this.a;
/* move-object v11, v2 */
/* check-cast v11, Landroid/view/View; */
v2 = (( android.view.View ) v11 ).getVisibility ( ); // invoke-virtual {v11}, Landroid/view/View;->getVisibility()I
/* const/16 v3, 0x8 */
/* if-eq v2, v3, :cond_b */
(( android.view.View ) v11 ).getLayoutParams ( ); // invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
(( android.view.View ) v11 ).getLayoutParams ( ); // invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroid/support/design/widget/CoordinatorLayout$d; */
v3 = this.a;
int v4 = 1; // const/4 v4, 0x1
/* if-nez v3, :cond_0 */
/* iget v3, v2, Landroid/support/design/widget/CoordinatorLayout$d;->d:I */
int v5 = -1; // const/4 v5, -0x1
/* if-eq v3, v5, :cond_0 */
int v3 = 1; // const/4 v3, 0x1
} // :cond_0
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
/* if-nez v3, :cond_a */
v3 = this.a;
if ( v3 != null) { // if-eqz v3, :cond_1
v2 = this.a;
android.support.design.widget.CoordinatorLayout .a ( );
android.support.design.widget.CoordinatorLayout .a ( );
try { // :try_start_0
fr .a ( v1,v2,v12 );
(( android.view.View ) v11 ).getLayoutParams ( ); // invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* move-object v14, v2 */
/* check-cast v14, Landroid/support/design/widget/CoordinatorLayout$d; */
v15 = (( android.view.View ) v11 ).getMeasuredWidth ( ); // invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I
v7 = (( android.view.View ) v11 ).getMeasuredHeight ( ); // invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I
/* move v2, v0 */
/* move-object v3, v12 */
/* move-object v4, v13 */
/* move-object v5, v14 */
/* move v6, v15 */
/* move/from16 p1, v7 */
/* invoke-static/range {v2 ..v7}, Landroid/support/design/widget/CoordinatorLayout;->a(ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroid/support/design/widget/CoordinatorLayout$d;II)V */
/* move/from16 v2, p1 */
/* invoke-direct {v1, v14, v13, v15, v2}, Landroid/support/design/widget/CoordinatorLayout;->a(Landroid/support/design/widget/CoordinatorLayout$d;Landroid/graphics/Rect;II)V */
/* iget v2, v13, Landroid/graphics/Rect;->left:I */
/* iget v3, v13, Landroid/graphics/Rect;->top:I */
/* iget v4, v13, Landroid/graphics/Rect;->right:I */
/* iget v5, v13, Landroid/graphics/Rect;->bottom:I */
(( android.view.View ) v11 ).layout ( v2, v3, v4, v5 ); // invoke-virtual {v11, v2, v3, v4, v5}, Landroid/view/View;->layout(IIII)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* goto/16 :goto_5 */
/* :catchall_0 */
/* move-exception v0 */
android.support.design.widget.CoordinatorLayout .a ( v12 );
android.support.design.widget.CoordinatorLayout .a ( v13 );
/* throw v0 */
} // :cond_1
/* iget v3, v2, Landroid/support/design/widget/CoordinatorLayout$d;->c:I */
/* if-ltz v3, :cond_7 */
/* iget v2, v2, Landroid/support/design/widget/CoordinatorLayout$d;->c:I */
(( android.view.View ) v11 ).getLayoutParams ( ); // invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Landroid/support/design/widget/CoordinatorLayout$d; */
/* iget v5, v3, Landroid/support/design/widget/CoordinatorLayout$d;->a:I */
v5 = android.support.design.widget.CoordinatorLayout .c ( v5 );
v5 = dz .a ( v5,v0 );
/* and-int/lit8 v6, v5, 0x7 */
/* and-int/lit8 v5, v5, 0x70 */
v7 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getWidth()I */
v12 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getHeight()I */
v13 = (( android.view.View ) v11 ).getMeasuredWidth ( ); // invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I
v14 = (( android.view.View ) v11 ).getMeasuredHeight ( ); // invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I
/* if-ne v0, v4, :cond_2 */
/* sub-int v2, v7, v2 */
} // :cond_2
v2 = /* invoke-direct {v1, v2}, Landroid/support/design/widget/CoordinatorLayout;->a(I)I */
/* sub-int/2addr v2, v13 */
/* if-eq v6, v4, :cond_4 */
int v4 = 5; // const/4 v4, 0x5
/* if-eq v6, v4, :cond_3 */
} // :cond_3
/* add-int/2addr v2, v13 */
} // :cond_4
/* div-int/lit8 v4, v13, 0x2 */
/* add-int/2addr v2, v4 */
} // :goto_2
/* const/16 v4, 0x10 */
/* if-eq v5, v4, :cond_6 */
/* const/16 v4, 0x50 */
/* if-eq v5, v4, :cond_5 */
int v4 = 0; // const/4 v4, 0x0
} // :cond_5
/* add-int/lit8 v4, v14, 0x0 */
} // :cond_6
/* div-int/lit8 v4, v14, 0x2 */
/* add-int/2addr v4, v9 */
} // :goto_3
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getPaddingLeft()I */
/* iget v6, v3, Landroid/support/design/widget/CoordinatorLayout$d;->leftMargin:I */
/* add-int/2addr v5, v6 */
v6 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getPaddingRight()I */
/* sub-int/2addr v7, v6 */
/* sub-int/2addr v7, v13 */
/* iget v6, v3, Landroid/support/design/widget/CoordinatorLayout$d;->rightMargin:I */
/* sub-int/2addr v7, v6 */
v2 = java.lang.Math .min ( v2,v7 );
v2 = java.lang.Math .max ( v5,v2 );
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getPaddingTop()I */
/* iget v6, v3, Landroid/support/design/widget/CoordinatorLayout$d;->topMargin:I */
/* add-int/2addr v5, v6 */
v6 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getPaddingBottom()I */
/* sub-int/2addr v12, v6 */
/* sub-int/2addr v12, v14 */
/* iget v3, v3, Landroid/support/design/widget/CoordinatorLayout$d;->bottomMargin:I */
/* sub-int/2addr v12, v3 */
v3 = java.lang.Math .min ( v4,v12 );
v3 = java.lang.Math .max ( v5,v3 );
/* add-int/2addr v13, v2 */
/* add-int/2addr v14, v3 */
(( android.view.View ) v11 ).layout ( v2, v3, v13, v14 ); // invoke-virtual {v11, v2, v3, v13, v14}, Landroid/view/View;->layout(IIII)V
/* goto/16 :goto_6 */
} // :cond_7
(( android.view.View ) v11 ).getLayoutParams ( ); // invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroid/support/design/widget/CoordinatorLayout$d; */
android.support.design.widget.CoordinatorLayout .a ( );
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getPaddingLeft()I */
/* iget v4, v2, Landroid/support/design/widget/CoordinatorLayout$d;->leftMargin:I */
/* add-int/2addr v3, v4 */
v4 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getPaddingTop()I */
/* iget v5, v2, Landroid/support/design/widget/CoordinatorLayout$d;->topMargin:I */
/* add-int/2addr v4, v5 */
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getWidth()I */
v6 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getPaddingRight()I */
/* sub-int/2addr v5, v6 */
/* iget v6, v2, Landroid/support/design/widget/CoordinatorLayout$d;->rightMargin:I */
/* sub-int/2addr v5, v6 */
v6 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getHeight()I */
v7 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getPaddingBottom()I */
/* sub-int/2addr v6, v7 */
/* iget v7, v2, Landroid/support/design/widget/CoordinatorLayout$d;->bottomMargin:I */
/* sub-int/2addr v6, v7 */
(( android.graphics.Rect ) v12 ).set ( v3, v4, v5, v6 ); // invoke-virtual {v12, v3, v4, v5, v6}, Landroid/graphics/Rect;->set(IIII)V
v3 = this.a;
if ( v3 != null) { // if-eqz v3, :cond_8
v3 = /* invoke-static/range {p0 ..p0}, Lem;->a(Landroid/view/View;)Z */
if ( v3 != null) { // if-eqz v3, :cond_8
v3 = em .a ( v11 );
/* if-nez v3, :cond_8 */
/* iget v3, v12, Landroid/graphics/Rect;->left:I */
v4 = this.a;
v4 = (( et ) v4 ).a ( ); // invoke-virtual {v4}, Let;->a()I
/* add-int/2addr v3, v4 */
/* iput v3, v12, Landroid/graphics/Rect;->left:I */
/* iget v3, v12, Landroid/graphics/Rect;->top:I */
v4 = this.a;
v4 = (( et ) v4 ).b ( ); // invoke-virtual {v4}, Let;->b()I
/* add-int/2addr v3, v4 */
/* iput v3, v12, Landroid/graphics/Rect;->top:I */
/* iget v3, v12, Landroid/graphics/Rect;->right:I */
v4 = this.a;
v4 = (( et ) v4 ).c ( ); // invoke-virtual {v4}, Let;->c()I
/* sub-int/2addr v3, v4 */
/* iput v3, v12, Landroid/graphics/Rect;->right:I */
/* iget v3, v12, Landroid/graphics/Rect;->bottom:I */
v4 = this.a;
v4 = (( et ) v4 ).d ( ); // invoke-virtual {v4}, Let;->d()I
/* sub-int/2addr v3, v4 */
/* iput v3, v12, Landroid/graphics/Rect;->bottom:I */
} // :cond_8
android.support.design.widget.CoordinatorLayout .a ( );
/* iget v2, v2, Landroid/support/design/widget/CoordinatorLayout$d;->a:I */
v2 = android.support.design.widget.CoordinatorLayout .b ( v2 );
v3 = (( android.view.View ) v11 ).getMeasuredWidth ( ); // invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I
v4 = (( android.view.View ) v11 ).getMeasuredHeight ( ); // invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I
/* const/16 v6, 0x11 */
/* if-lt v5, v6, :cond_9 */
/* move-object v5, v12 */
/* move-object v6, v13 */
/* move v7, v0 */
/* invoke-static/range {v2 ..v7}, Landroid/view/Gravity;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;I)V */
} // :cond_9
android.view.Gravity .apply ( v2,v3,v4,v12,v13 );
} // :goto_4
/* iget v2, v13, Landroid/graphics/Rect;->left:I */
/* iget v3, v13, Landroid/graphics/Rect;->top:I */
/* iget v4, v13, Landroid/graphics/Rect;->right:I */
/* iget v5, v13, Landroid/graphics/Rect;->bottom:I */
(( android.view.View ) v11 ).layout ( v2, v3, v4, v5 ); // invoke-virtual {v11, v2, v3, v4, v5}, Landroid/view/View;->layout(IIII)V
} // :goto_5
android.support.design.widget.CoordinatorLayout .a ( v12 );
android.support.design.widget.CoordinatorLayout .a ( v13 );
} // :cond_a
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v2 = "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete."; // const-string v2, "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete."
/* invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_b
} // :goto_6
/* add-int/lit8 v10, v10, 0x1 */
/* goto/16 :goto_0 */
} // :cond_c
return;
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 28 */
/* move-object/from16 v6, p0 */
/* invoke-direct/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->b()V */
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getChildCount()I */
int v7 = 0; // const/4 v7, 0x0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
int v2 = 1; // const/4 v2, 0x1
/* if-ge v1, v0, :cond_3 */
(( android.support.design.widget.CoordinatorLayout ) v6 ).getChildAt ( v1 ); // invoke-virtual {v6, v1}, Landroid/support/design/widget/CoordinatorLayout;->getChildAt(I)Landroid/view/View;
v4 = this.a;
v5 = this.a;
v5 = (( du ) v5 ).size ( ); // invoke-virtual {v5}, Ldu;->size()I
int v8 = 0; // const/4 v8, 0x0
} // :goto_1
/* if-ge v8, v5, :cond_1 */
v9 = this.a;
(( du ) v9 ).b ( v8 ); // invoke-virtual {v9, v8}, Ldu;->b(I)Ljava/lang/Object;
/* check-cast v9, Ljava/util/ArrayList; */
if ( v9 != null) { // if-eqz v9, :cond_0
v9 = (( java.util.ArrayList ) v9 ).contains ( v3 ); // invoke-virtual {v9, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
if ( v9 != null) { // if-eqz v9, :cond_0
int v3 = 1; // const/4 v3, 0x1
} // :cond_0
/* add-int/lit8 v8, v8, 0x1 */
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
} // :goto_2
if ( v3 != null) { // if-eqz v3, :cond_2
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // :goto_3
/* iget-boolean v1, v6, Landroid/support/design/widget/CoordinatorLayout;->d:Z */
/* if-eq v0, v1, :cond_8 */
if ( v0 != null) { // if-eqz v0, :cond_6
/* iget-boolean v0, v6, Landroid/support/design/widget/CoordinatorLayout;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_5
v0 = this.a;
/* if-nez v0, :cond_4 */
/* new-instance v0, Landroid/support/design/widget/CoordinatorLayout$e; */
/* invoke-direct {v0, v6}, Landroid/support/design/widget/CoordinatorLayout$e;-><init>(Landroid/support/design/widget/CoordinatorLayout;)V */
this.a = v0;
} // :cond_4
/* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver; */
v1 = this.a;
(( android.view.ViewTreeObserver ) v0 ).addOnPreDrawListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
} // :cond_5
/* iput-boolean v2, v6, Landroid/support/design/widget/CoordinatorLayout;->d:Z */
} // :cond_6
/* iget-boolean v0, v6, Landroid/support/design/widget/CoordinatorLayout;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_7
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_7
/* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver; */
v1 = this.a;
(( android.view.ViewTreeObserver ) v0 ).removeOnPreDrawListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
} // :cond_7
/* iput-boolean v7, v6, Landroid/support/design/widget/CoordinatorLayout;->d:Z */
} // :cond_8
} // :goto_4
v8 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getPaddingLeft()I */
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getPaddingTop()I */
v9 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getPaddingRight()I */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getPaddingBottom()I */
v10 = /* invoke-static/range {p0 ..p0}, Lem;->b(Landroid/view/View;)I */
/* if-ne v10, v2, :cond_9 */
int v11 = 1; // const/4 v11, 0x1
} // :cond_9
int v11 = 0; // const/4 v11, 0x0
} // :goto_5
v12 = /* invoke-static/range {p1 ..p1}, Landroid/view/View$MeasureSpec;->getMode(I)I */
v13 = /* invoke-static/range {p1 ..p1}, Landroid/view/View$MeasureSpec;->getSize(I)I */
v14 = /* invoke-static/range {p2 ..p2}, Landroid/view/View$MeasureSpec;->getMode(I)I */
v15 = /* invoke-static/range {p2 ..p2}, Landroid/view/View$MeasureSpec;->getSize(I)I */
/* add-int v16, v8, v9 */
/* add-int v17, v0, v1 */
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getSuggestedMinimumWidth()I */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/design/widget/CoordinatorLayout;->getSuggestedMinimumHeight()I */
v3 = this.a;
if ( v3 != null) { // if-eqz v3, :cond_a
v3 = /* invoke-static/range {p0 ..p0}, Lem;->a(Landroid/view/View;)Z */
if ( v3 != null) { // if-eqz v3, :cond_a
/* const/16 v18, 0x1 */
} // :cond_a
/* const/16 v18, 0x0 */
} // :goto_6
v5 = v2 = this.a;
/* move v3, v0 */
int v2 = 0; // const/4 v2, 0x0
int v4 = 0; // const/4 v4, 0x0
} // :goto_7
/* if-ge v4, v5, :cond_14 */
v0 = this.a;
/* move-object/from16 v19, v0 */
/* check-cast v19, Landroid/view/View; */
v0 = /* invoke-virtual/range {v19 ..v19}, Landroid/view/View;->getVisibility()I */
/* const/16 v7, 0x8 */
/* if-eq v0, v7, :cond_13 */
/* invoke-virtual/range {v19 ..v19}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
/* move-object v7, v0 */
/* check-cast v7, Landroid/support/design/widget/CoordinatorLayout$d; */
/* iget v0, v7, Landroid/support/design/widget/CoordinatorLayout$d;->c:I */
/* if-ltz v0, :cond_10 */
if ( v12 != null) { // if-eqz v12, :cond_10
/* iget v0, v7, Landroid/support/design/widget/CoordinatorLayout$d;->c:I */
v0 = /* invoke-direct {v6, v0}, Landroid/support/design/widget/CoordinatorLayout;->a(I)I */
/* move/from16 v21, v1 */
/* iget v1, v7, Landroid/support/design/widget/CoordinatorLayout$d;->a:I */
v1 = android.support.design.widget.CoordinatorLayout .c ( v1 );
v1 = dz .a ( v1,v10 );
/* and-int/lit8 v1, v1, 0x7 */
/* move/from16 v22, v2 */
int v2 = 3; // const/4 v2, 0x3
/* if-ne v1, v2, :cond_b */
if ( v11 != null) { // if-eqz v11, :cond_c
} // :cond_b
int v2 = 5; // const/4 v2, 0x5
/* if-ne v1, v2, :cond_d */
if ( v11 != null) { // if-eqz v11, :cond_d
} // :cond_c
/* sub-int v1, v13, v9 */
/* sub-int/2addr v1, v0 */
int v0 = 0; // const/4 v0, 0x0
v1 = java.lang.Math .max ( v0,v1 );
/* move/from16 v20, v1 */
int v2 = 0; // const/4 v2, 0x0
} // :cond_d
/* if-ne v1, v2, :cond_e */
if ( v11 != null) { // if-eqz v11, :cond_f
} // :cond_e
int v2 = 3; // const/4 v2, 0x3
/* if-ne v1, v2, :cond_11 */
if ( v11 != null) { // if-eqz v11, :cond_11
} // :cond_f
/* sub-int/2addr v0, v8 */
int v2 = 0; // const/4 v2, 0x0
v0 = java.lang.Math .max ( v2,v0 );
/* move/from16 v20, v0 */
} // :cond_10
/* move/from16 v21, v1 */
/* move/from16 v22, v2 */
} // :cond_11
int v2 = 0; // const/4 v2, 0x0
/* const/16 v20, 0x0 */
} // :goto_8
if ( v18 != null) { // if-eqz v18, :cond_12
v0 = /* invoke-static/range {v19 ..v19}, Lem;->a(Landroid/view/View;)Z */
/* if-nez v0, :cond_12 */
v0 = this.a;
v0 = (( et ) v0 ).a ( ); // invoke-virtual {v0}, Let;->a()I
v1 = this.a;
v1 = (( et ) v1 ).c ( ); // invoke-virtual {v1}, Let;->c()I
/* add-int/2addr v0, v1 */
v1 = this.a;
v1 = (( et ) v1 ).b ( ); // invoke-virtual {v1}, Let;->b()I
v2 = this.a;
v2 = (( et ) v2 ).d ( ); // invoke-virtual {v2}, Let;->d()I
/* add-int/2addr v1, v2 */
/* sub-int v0, v13, v0 */
v0 = android.view.View$MeasureSpec .makeMeasureSpec ( v0,v12 );
/* sub-int v1, v15, v1 */
v1 = android.view.View$MeasureSpec .makeMeasureSpec ( v1,v14 );
/* move v2, v0 */
/* move/from16 v23, v1 */
} // :cond_12
/* move/from16 v2, p1 */
/* move/from16 v23, p2 */
} // :goto_9
/* const/16 v24, 0x0 */
/* move-object/from16 v0, p0 */
/* move/from16 v25, v21 */
/* move-object/from16 v1, v19 */
/* move/from16 v26, v22 */
/* const/16 v21, 0x0 */
/* move/from16 v27, v3 */
/* move/from16 v3, v20 */
/* move/from16 v20, v4 */
/* move/from16 v4, v23 */
/* move/from16 v22, v5 */
/* move/from16 v5, v24 */
/* invoke-virtual/range {v0 ..v5}, Landroid/support/design/widget/CoordinatorLayout;->measureChildWithMargins(Landroid/view/View;IIII)V */
v0 = /* invoke-virtual/range {v19 ..v19}, Landroid/view/View;->getMeasuredWidth()I */
/* add-int v0, v16, v0 */
/* iget v1, v7, Landroid/support/design/widget/CoordinatorLayout$d;->leftMargin:I */
/* add-int/2addr v0, v1 */
/* iget v1, v7, Landroid/support/design/widget/CoordinatorLayout$d;->rightMargin:I */
/* add-int/2addr v0, v1 */
/* move/from16 v1, v27 */
v0 = java.lang.Math .max ( v1,v0 );
v1 = /* invoke-virtual/range {v19 ..v19}, Landroid/view/View;->getMeasuredHeight()I */
/* add-int v1, v17, v1 */
/* iget v2, v7, Landroid/support/design/widget/CoordinatorLayout$d;->topMargin:I */
/* add-int/2addr v1, v2 */
/* iget v2, v7, Landroid/support/design/widget/CoordinatorLayout$d;->bottomMargin:I */
/* add-int/2addr v1, v2 */
/* move/from16 v2, v25 */
v1 = java.lang.Math .max ( v2,v1 );
v2 = /* invoke-virtual/range {v19 ..v19}, Landroid/view/View;->getMeasuredState()I */
/* move/from16 v7, v26 */
v2 = android.view.View .combineMeasuredStates ( v7,v2 );
/* move v3, v0 */
} // :cond_13
/* move v7, v2 */
/* move/from16 v20, v4 */
/* move/from16 v22, v5 */
/* const/16 v21, 0x0 */
/* move v2, v1 */
/* move v1, v3 */
/* move v1, v2 */
/* move v2, v7 */
} // :goto_a
/* add-int/lit8 v4, v20, 0x1 */
/* move/from16 v5, v22 */
int v7 = 0; // const/4 v7, 0x0
/* goto/16 :goto_7 */
} // :cond_14
/* move v7, v2 */
/* move v2, v1 */
/* move v1, v3 */
/* const/high16 v0, -0x1000000 */
/* and-int/2addr v0, v7 */
/* move/from16 v3, p1 */
v0 = android.view.View .resolveSizeAndState ( v1,v3,v0 );
/* shl-int/lit8 v1, v7, 0x10 */
/* move/from16 v3, p2 */
v1 = android.view.View .resolveSizeAndState ( v2,v3,v1 );
(( android.support.design.widget.CoordinatorLayout ) v6 ).setMeasuredDimension ( v0, v1 ); // invoke-virtual {v6, v0, v1}, Landroid/support/design/widget/CoordinatorLayout;->setMeasuredDimension(II)V
return;
} // .end method
public Boolean onNestedFling ( android.view.View p0, Float p1, Float p2, Boolean p3 ) {
/* .locals 2 */
p1 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getChildCount()I
int p2 = 0; // const/4 p2, 0x0
int p3 = 0; // const/4 p3, 0x0
} // :goto_0
/* if-ge p3, p1, :cond_1 */
(( android.support.design.widget.CoordinatorLayout ) p0 ).getChildAt ( p3 ); // invoke-virtual {p0, p3}, Landroid/support/design/widget/CoordinatorLayout;->getChildAt(I)Landroid/view/View;
v0 = (( android.view.View ) p4 ).getVisibility ( ); // invoke-virtual {p4}, Landroid/view/View;->getVisibility()I
/* const/16 v1, 0x8 */
/* if-eq v0, v1, :cond_0 */
(( android.view.View ) p4 ).getLayoutParams ( ); // invoke-virtual {p4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
} // :cond_0
/* add-int/lit8 p3, p3, 0x1 */
} // :cond_1
} // .end method
public Boolean onNestedPreFling ( android.view.View p0, Float p1, Float p2 ) {
/* .locals 3 */
p1 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getChildCount()I
int p2 = 0; // const/4 p2, 0x0
int p3 = 0; // const/4 p3, 0x0
} // :goto_0
/* if-ge p3, p1, :cond_1 */
(( android.support.design.widget.CoordinatorLayout ) p0 ).getChildAt ( p3 ); // invoke-virtual {p0, p3}, Landroid/support/design/widget/CoordinatorLayout;->getChildAt(I)Landroid/view/View;
v1 = (( android.view.View ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
/* const/16 v2, 0x8 */
/* if-eq v1, v2, :cond_0 */
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
} // :cond_0
/* add-int/lit8 p3, p3, 0x1 */
} // :cond_1
} // .end method
public void onNestedPreScroll ( android.view.View p0, Integer p1, Integer p2, Integer[] p3 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
(( android.support.design.widget.CoordinatorLayout ) p0 ).a ( p2, p3, p4, p1 ); // invoke-virtual {p0, p2, p3, p4, p1}, Landroid/support/design/widget/CoordinatorLayout;->a(II[II)V
return;
} // .end method
public void onNestedScroll ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
(( android.support.design.widget.CoordinatorLayout ) p0 ).a ( p5, p1 ); // invoke-virtual {p0, p5, p1}, Landroid/support/design/widget/CoordinatorLayout;->a(II)V
return;
} // .end method
public void onNestedScrollAccepted ( android.view.View p0, android.view.View p1, Integer p2 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
(( android.support.design.widget.CoordinatorLayout ) p0 ).a ( p2, p3, p1 ); // invoke-virtual {p0, p2, p3, p1}, Landroid/support/design/widget/CoordinatorLayout;->a(Landroid/view/View;II)V
return;
} // .end method
protected void onRestoreInstanceState ( android.os.Parcelable p0 ) {
/* .locals 5 */
/* instance-of v0, p1, Landroid/support/design/widget/CoordinatorLayout$f; */
/* if-nez v0, :cond_0 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
return;
} // :cond_0
/* check-cast p1, Landroid/support/design/widget/CoordinatorLayout$f; */
v0 = this.a;
/* invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
p1 = this.a;
int v0 = 0; // const/4 v0, 0x0
v1 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getChildCount()I
} // :goto_0
/* if-ge v0, v1, :cond_2 */
(( android.support.design.widget.CoordinatorLayout ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/design/widget/CoordinatorLayout;->getChildAt(I)Landroid/view/View;
v3 = (( android.view.View ) v2 ).getId ( ); // invoke-virtual {v2}, Landroid/view/View;->getId()I
android.support.design.widget.CoordinatorLayout .a ( v2 );
v2 = this.a;
int v4 = -1; // const/4 v4, -0x1
/* if-eq v3, v4, :cond_1 */
if ( v2 != null) { // if-eqz v2, :cond_1
(( android.util.SparseArray ) p1 ).get ( v3 ); // invoke-virtual {p1, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
return;
} // .end method
protected android.os.Parcelable onSaveInstanceState ( ) {
/* .locals 7 */
/* new-instance v0, Landroid/support/design/widget/CoordinatorLayout$f; */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable; */
/* invoke-direct {v0, v1}, Landroid/support/design/widget/CoordinatorLayout$f;-><init>(Landroid/os/Parcelable;)V */
/* new-instance v1, Landroid/util/SparseArray; */
/* invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V */
v2 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getChildCount()I
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v2, :cond_1 */
(( android.support.design.widget.CoordinatorLayout ) p0 ).getChildAt ( v3 ); // invoke-virtual {p0, v3}, Landroid/support/design/widget/CoordinatorLayout;->getChildAt(I)Landroid/view/View;
v5 = (( android.view.View ) v4 ).getId ( ); // invoke-virtual {v4}, Landroid/view/View;->getId()I
(( android.view.View ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v4, Landroid/support/design/widget/CoordinatorLayout$d; */
v4 = this.a;
int v6 = -1; // const/4 v6, -0x1
/* if-eq v5, v6, :cond_0 */
if ( v4 != null) { // if-eqz v4, :cond_0
android.support.design.widget.CoordinatorLayout$Behavior .a ( );
if ( v4 != null) { // if-eqz v4, :cond_0
(( android.util.SparseArray ) v1 ).append ( v5, v4 ); // invoke-virtual {v1, v5, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V
} // :cond_0
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_1
this.a = v1;
} // .end method
public Boolean onStartNestedScroll ( android.view.View p0, android.view.View p1, Integer p2 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
p1 = (( android.support.design.widget.CoordinatorLayout ) p0 ).a ( p3, p1 ); // invoke-virtual {p0, p3, p1}, Landroid/support/design/widget/CoordinatorLayout;->a(II)Z
} // .end method
public void onStopNestedScroll ( android.view.View p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
(( android.support.design.widget.CoordinatorLayout ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/design/widget/CoordinatorLayout;->b(I)V
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 3 */
v0 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
v1 = this.a;
/* if-nez v1, :cond_0 */
/* invoke-direct {p0, p1}, Landroid/support/design/widget/CoordinatorLayout;->a(Landroid/view/MotionEvent;)Z */
} // :cond_0
(( android.view.View ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/support/design/widget/CoordinatorLayout$d; */
v1 = this.a;
} // :goto_0
v1 = this.a;
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_1 */
p1 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z */
/* or-int/2addr v2, p1 */
} // :cond_1
int p1 = 1; // const/4 p1, 0x1
/* if-eq v0, p1, :cond_2 */
int p1 = 3; // const/4 p1, 0x3
/* if-ne v0, p1, :cond_3 */
} // :cond_2
/* invoke-direct {p0}, Landroid/support/design/widget/CoordinatorLayout;->a()V */
} // :cond_3
} // .end method
public Boolean requestChildRectangleOnScreen ( android.view.View p0, android.graphics.Rect p1, Boolean p2 ) {
/* .locals 0 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
p1 = /* invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z */
} // .end method
public void requestDisallowInterceptTouchEvent ( Boolean p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V */
if ( p1 != null) { // if-eqz p1, :cond_0
/* iget-boolean p1, p0, Landroid/support/design/widget/CoordinatorLayout;->b:Z */
/* if-nez p1, :cond_0 */
/* invoke-direct {p0}, Landroid/support/design/widget/CoordinatorLayout;->a()V */
int p1 = 1; // const/4 p1, 0x1
/* iput-boolean p1, p0, Landroid/support/design/widget/CoordinatorLayout;->b:Z */
} // :cond_0
return;
} // .end method
public void setFitsSystemWindows ( Boolean p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->setFitsSystemWindows(Z)V */
/* invoke-direct {p0}, Landroid/support/design/widget/CoordinatorLayout;->c()V */
return;
} // .end method
public void setOnHierarchyChangeListener ( android.view.ViewGroup$OnHierarchyChangeListener p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
public void setStatusBarBackground ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
v0 = this.a;
/* if-eq v0, p1, :cond_5 */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.graphics.drawable.Drawable ) v0 ).setCallback ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_1
(( android.graphics.drawable.Drawable ) p1 ).mutate ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;
} // :cond_1
this.a = v1;
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_4
p1 = (( android.graphics.drawable.Drawable ) p1 ).isStateful ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( p1 != null) { // if-eqz p1, :cond_2
p1 = this.a;
(( android.support.design.widget.CoordinatorLayout ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getDrawableState()[I
(( android.graphics.drawable.Drawable ) p1 ).setState ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z
} // :cond_2
p1 = this.a;
v0 = em .b ( p0 );
cx .a ( p1,v0 );
p1 = this.a;
v0 = (( android.support.design.widget.CoordinatorLayout ) p0 ).getVisibility ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getVisibility()I
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_3 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
(( android.graphics.drawable.Drawable ) p1 ).setVisible ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
p1 = this.a;
(( android.graphics.drawable.Drawable ) p1 ).setCallback ( p0 ); // invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
} // :cond_4
em .a ( p0 );
} // :cond_5
return;
} // .end method
public void setStatusBarBackgroundColor ( Integer p0 ) {
/* .locals 1 */
/* new-instance v0, Landroid/graphics/drawable/ColorDrawable; */
/* invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V */
(( android.support.design.widget.CoordinatorLayout ) p0 ).setStatusBarBackground ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/design/widget/CoordinatorLayout;->setStatusBarBackground(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setStatusBarBackgroundResource ( Integer p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
(( android.support.design.widget.CoordinatorLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout;->getContext()Landroid/content/Context;
ce .a ( v0,p1 );
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
(( android.support.design.widget.CoordinatorLayout ) p0 ).setStatusBarBackground ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/design/widget/CoordinatorLayout;->setStatusBarBackground(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setVisibility ( Integer p0 ) {
/* .locals 2 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = (( android.graphics.drawable.Drawable ) v1 ).isVisible ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isVisible()Z
/* if-eq v1, p1, :cond_1 */
v1 = this.a;
(( android.graphics.drawable.Drawable ) v1 ).setVisible ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
} // :cond_1
return;
} // .end method
protected Boolean verifyDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
v0 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z */
/* if-nez v0, :cond_1 */
v0 = this.a;
/* if-ne p1, v0, :cond_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // .end method
