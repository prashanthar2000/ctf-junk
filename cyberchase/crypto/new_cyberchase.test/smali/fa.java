public abstract class fa implements android.view.View$OnTouchListener {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lfa$a;, */
	 /* Lfa$b; */
	 /* } */
} // .end annotation
/* # static fields */
private static final Integer c;
/* # instance fields */
private Integer a;
final android.view.View a;
private final android.view.animation.Interpolator a;
final fa$a a;
private java.lang.Runnable a;
Boolean a;
private a;
private Integer b;
Boolean b;
private b;
Boolean c;
private c;
private Boolean d;
private d;
private Boolean e;
private e;
private Boolean f;
/* # direct methods */
static fa ( ) {
	 /* .locals 1 */
	 v0 = 	 android.view.ViewConfiguration .getTapTimeout ( );
	 return;
} // .end method
public fa ( ) {
	 /* .locals 5 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* new-instance v0, Lfa$a; */
	 /* invoke-direct {v0}, Lfa$a;-><init>()V */
	 this.a = v0;
	 /* new-instance v0, Landroid/view/animation/AccelerateInterpolator; */
	 /* invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V */
	 this.a = v0;
	 int v0 = 2; // const/4 v0, 0x2
	 /* new-array v1, v0, [F */
	 /* fill-array-data v1, :array_0 */
	 this.a = v1;
	 /* new-array v1, v0, [F */
	 /* fill-array-data v1, :array_1 */
	 this.b = v1;
	 /* new-array v1, v0, [F */
	 /* fill-array-data v1, :array_2 */
	 this.c = v1;
	 /* new-array v1, v0, [F */
	 /* fill-array-data v1, :array_3 */
	 this.d = v1;
	 /* new-array v0, v0, [F */
	 /* fill-array-data v0, :array_4 */
	 this.e = v0;
	 this.a = p1;
	 android.content.res.Resources .getSystem ( );
	 (( android.content.res.Resources ) p1 ).getDisplayMetrics ( ); // invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
	 /* iget v0, p1, Landroid/util/DisplayMetrics;->density:F */
	 /* const v1, 0x44c4e000 # 1575.0f */
	 /* mul-float v0, v0, v1 */
	 /* const/high16 v1, 0x3f000000 # 0.5f */
	 /* add-float/2addr v0, v1 */
	 /* float-to-int v0, v0 */
	 /* iget p1, p1, Landroid/util/DisplayMetrics;->density:F */
	 /* const v2, 0x439d8000 # 315.0f */
	 /* mul-float p1, p1, v2 */
	 /* add-float/2addr p1, v1 */
	 /* float-to-int p1, p1 */
	 /* int-to-float v0, v0 */
	 v1 = this.e;
	 /* const/high16 v2, 0x447a0000 # 1000.0f */
	 /* div-float/2addr v0, v2 */
	 int v3 = 0; // const/4 v3, 0x0
	 /* aput v0, v1, v3 */
	 int v4 = 1; // const/4 v4, 0x1
	 /* aput v0, v1, v4 */
	 /* int-to-float p1, p1 */
	 v0 = this.d;
	 /* div-float/2addr p1, v2 */
	 /* aput p1, v0, v3 */
	 /* aput p1, v0, v4 */
	 /* iput v4, p0, Lfa;->a:I */
	 p1 = this.b;
	 /* const v0, 0x7f7fffff # Float.MAX_VALUE */
	 /* aput v0, p1, v3 */
	 /* aput v0, p1, v4 */
	 p1 = this.a;
	 /* const v0, 0x3e4ccccd # 0.2f */
	 /* aput v0, p1, v3 */
	 /* aput v0, p1, v4 */
	 p1 = this.c;
	 /* const v0, 0x3a83126f # 0.001f */
	 /* aput v0, p1, v3 */
	 /* aput v0, p1, v4 */
	 /* iput p1, p0, Lfa;->b:I */
	 p1 = this.a;
	 /* const/16 v0, 0x1f4 */
	 /* iput v0, p1, Lfa$a;->a:I */
	 /* iput v0, p1, Lfa$a;->b:I */
	 return;
	 /* nop */
	 /* :array_0 */
	 /* .array-data 4 */
	 /* 0x0 */
	 /* 0x0 */
} // .end array-data
/* :array_1 */
/* .array-data 4 */
/* 0x7f7fffff # Float.MAX_VALUE */
/* 0x7f7fffff # Float.MAX_VALUE */
} // .end array-data
/* :array_2 */
/* .array-data 4 */
/* 0x0 */
/* 0x0 */
} // .end array-data
/* :array_3 */
/* .array-data 4 */
/* 0x0 */
/* 0x0 */
} // .end array-data
/* :array_4 */
/* .array-data 4 */
/* 0x7f7fffff # Float.MAX_VALUE */
/* 0x7f7fffff # Float.MAX_VALUE */
} // .end array-data
} // .end method
private Float a ( Float p0, Float p1 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
/* cmpl-float v1, p2, v0 */
/* if-nez v1, :cond_0 */
} // :cond_0
/* iget v1, p0, Lfa;->a:I */
/* packed-switch v1, :pswitch_data_0 */
/* :pswitch_0 */
/* cmpg-float v1, p1, v0 */
/* if-gez v1, :cond_2 */
/* neg-float p2, p2 */
/* div-float/2addr p1, p2 */
/* :pswitch_1 */
/* cmpg-float v2, p1, p2 */
/* if-gez v2, :cond_2 */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* cmpl-float v3, p1, v0 */
/* if-ltz v3, :cond_1 */
/* div-float/2addr p1, p2 */
/* sub-float/2addr v2, p1 */
} // :cond_1
/* iget-boolean p1, p0, Lfa;->c:Z */
if ( p1 != null) { // if-eqz p1, :cond_2
int p1 = 1; // const/4 p1, 0x1
/* if-ne v1, p1, :cond_2 */
} // :cond_2
} // :goto_0
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_1 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
static Float a ( Float p0, Float p1, Float p2 ) {
/* .locals 1 */
/* cmpl-float v0, p0, p2 */
/* if-lez v0, :cond_0 */
} // :cond_0
/* cmpg-float p2, p0, p1 */
/* if-gez p2, :cond_1 */
} // :cond_1
} // .end method
private Float a ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 1 */
/* mul-float p1, p1, p2 */
int v0 = 0; // const/4 v0, 0x0
p1 = fa .a ( p1,v0,p3 );
p3 = /* invoke-direct {p0, p4, p1}, Lfa;->a(FF)F */
/* sub-float/2addr p2, p4 */
p1 = /* invoke-direct {p0, p2, p1}, Lfa;->a(FF)F */
/* sub-float/2addr p1, p3 */
/* cmpg-float p2, p1, v0 */
/* if-gez p2, :cond_0 */
p2 = this.a;
p1 = /* neg-float p1, p1 */
/* neg-float p1, p1 */
} // :cond_0
/* cmpl-float p2, p1, v0 */
/* if-lez p2, :cond_1 */
p1 = p2 = this.a;
} // :goto_0
/* const/high16 p2, -0x40800000 # -1.0f */
/* const/high16 p3, 0x3f800000 # 1.0f */
p1 = fa .a ( p1,p2,p3 );
} // :cond_1
} // .end method
private Float a ( Integer p0, Float p1, Float p2, Float p3 ) {
/* .locals 3 */
v0 = this.a;
/* aget v0, v0, p1 */
v1 = this.b;
/* aget v1, v1, p1 */
p2 = /* invoke-direct {p0, v0, p3, v1, p2}, Lfa;->a(FFFF)F */
int p3 = 0; // const/4 p3, 0x0
/* cmpl-float v0, p2, p3 */
/* if-nez v0, :cond_0 */
} // :cond_0
v0 = this.c;
/* aget v0, v0, p1 */
v1 = this.d;
/* aget v1, v1, p1 */
v2 = this.e;
/* aget p1, v2, p1 */
/* mul-float v0, v0, p4 */
/* cmpl-float p3, p2, p3 */
/* if-lez p3, :cond_1 */
/* mul-float p2, p2, v0 */
p1 = fa .a ( p2,v1,p1 );
} // :cond_1
/* neg-float p2, p2 */
/* mul-float p2, p2, v0 */
p1 = fa .a ( p2,v1,p1 );
/* neg-float p1, p1 */
} // .end method
static Integer a ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* if-le p0, p1, :cond_0 */
} // :cond_0
/* if-gez p0, :cond_1 */
int p0 = 0; // const/4 p0, 0x0
} // :cond_1
} // .end method
private void a ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lfa;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lfa;->c:Z */
return;
} // :cond_0
v0 = this.a;
(( fa$a ) v0 ).a ( ); // invoke-virtual {v0}, Lfa$a;->a()V
return;
} // .end method
/* # virtual methods */
public final fa a ( Boolean p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lfa;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* if-nez p1, :cond_0 */
/* invoke-direct {p0}, Lfa;->a()V */
} // :cond_0
/* iput-boolean p1, p0, Lfa;->e:Z */
} // .end method
public abstract void a ( Integer p0 ) {
} // .end method
final Boolean a ( ) {
/* .locals 2 */
v0 = this.a;
v1 = (( fa$a ) v0 ).b ( ); // invoke-virtual {v0}, Lfa$a;->b()I
v0 = (( fa$a ) v0 ).a ( ); // invoke-virtual {v0}, Lfa$a;->a()I
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = (( fa ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lfa;->a(I)Z
/* if-nez v1, :cond_0 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public abstract Boolean a ( Integer p0 ) {
} // .end method
public Boolean onTouch ( android.view.View p0, android.view.MotionEvent p1 ) {
/* .locals 5 */
/* iget-boolean v0, p0, Lfa;->e:Z */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
} // :cond_0
v0 = (( android.view.MotionEvent ) p2 ).getActionMasked ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I
int v2 = 1; // const/4 v2, 0x1
/* packed-switch v0, :pswitch_data_0 */
/* :pswitch_0 */
/* invoke-direct {p0}, Lfa;->a()V */
/* :pswitch_1 */
/* iput-boolean v2, p0, Lfa;->b:Z */
/* iput-boolean v1, p0, Lfa;->d:Z */
/* :pswitch_2 */
v0 = (( android.view.MotionEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
v3 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
/* int-to-float v3, v3 */
v4 = this.a;
v4 = (( android.view.View ) v4 ).getWidth ( ); // invoke-virtual {v4}, Landroid/view/View;->getWidth()I
/* int-to-float v4, v4 */
v0 = /* invoke-direct {p0, v1, v0, v3, v4}, Lfa;->a(IFFF)F */
p2 = (( android.view.MotionEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F
p1 = (( android.view.View ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getHeight()I
/* int-to-float p1, p1 */
v3 = this.a;
v3 = (( android.view.View ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/view/View;->getHeight()I
/* int-to-float v3, v3 */
p1 = /* invoke-direct {p0, v2, p2, p1, v3}, Lfa;->a(IFFF)F */
p2 = this.a;
/* iput v0, p2, Lfa$a;->a:F */
/* iput p1, p2, Lfa$a;->b:F */
/* iget-boolean p1, p0, Lfa;->c:Z */
/* if-nez p1, :cond_3 */
p1 = (( fa ) p0 ).a ( ); // invoke-virtual {p0}, Lfa;->a()Z
if ( p1 != null) { // if-eqz p1, :cond_3
p1 = this.a;
/* if-nez p1, :cond_1 */
/* new-instance p1, Lfa$b; */
/* invoke-direct {p1, p0}, Lfa$b;-><init>(Lfa;)V */
this.a = p1;
} // :cond_1
/* iput-boolean v2, p0, Lfa;->c:Z */
/* iput-boolean v2, p0, Lfa;->a:Z */
/* iget-boolean p1, p0, Lfa;->d:Z */
/* if-nez p1, :cond_2 */
/* iget p1, p0, Lfa;->b:I */
/* if-lez p1, :cond_2 */
p2 = this.a;
v0 = this.a;
/* int-to-long v3, p1 */
em .a ( p2,v0,v3,v4 );
} // :cond_2
p1 = this.a;
} // :goto_0
/* iput-boolean v2, p0, Lfa;->d:Z */
} // :cond_3
} // :goto_1
/* iget-boolean p1, p0, Lfa;->f:Z */
if ( p1 != null) { // if-eqz p1, :cond_4
/* iget-boolean p1, p0, Lfa;->c:Z */
if ( p1 != null) { // if-eqz p1, :cond_4
} // :cond_4
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
