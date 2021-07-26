class gf extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable$Callback {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lgf$a;, */
	 /* Lgf$b; */
	 /* } */
} // .end annotation
/* # instance fields */
Integer a;
private Long a;
private android.graphics.Rect a;
private android.graphics.drawable.Drawable a;
private gf$a a;
gf$b a;
private java.lang.Runnable a;
private Boolean a;
private Integer b;
private Long b;
private android.graphics.drawable.Drawable b;
private Boolean b;
private Integer c;
/* # direct methods */
 gf ( ) {
	 /* .locals 1 */
	 /* invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V */
	 /* const/16 v0, 0xff */
	 /* iput v0, p0, Lgf;->b:I */
	 int v0 = -1; // const/4 v0, -0x1
	 /* iput v0, p0, Lgf;->a:I */
	 /* iput v0, p0, Lgf;->c:I */
	 return;
} // .end method
static Integer a ( android.content.res.Resources p0, Integer p1 ) {
	 /* .locals 0 */
	 /* if-nez p0, :cond_0 */
} // :cond_0
(( android.content.res.Resources ) p0 ).getDisplayMetrics ( ); // invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget p1, p0, Landroid/util/DisplayMetrics;->densityDpi:I */
} // :goto_0
/* if-nez p1, :cond_1 */
/* const/16 p0, 0xa0 */
} // :cond_1
} // .end method
private void a ( android.graphics.drawable.Drawable p0 ) {
/* .locals 4 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lgf$a; */
/* invoke-direct {v0}, Lgf$a;-><init>()V */
this.a = v0;
} // :cond_0
v0 = this.a;
(( android.graphics.drawable.Drawable ) p1 ).getCallback ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;
this.a = v1;
(( android.graphics.drawable.Drawable ) p1 ).setCallback ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
try { // :try_start_0
v0 = this.a;
/* iget v0, v0, Lgf$b;->k:I */
/* if-gtz v0, :cond_1 */
/* iget-boolean v0, p0, Lgf;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget v0, p0, Lgf;->b:I */
(( android.graphics.drawable.Drawable ) p1 ).setAlpha ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
} // :cond_1
v0 = this.a;
/* iget-boolean v0, v0, Lgf$b;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.a;
v0 = this.a;
(( android.graphics.drawable.Drawable ) p1 ).setColorFilter ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V
} // :cond_2
v0 = this.a;
/* iget-boolean v0, v0, Lgf$b;->n:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.a;
v0 = this.a;
cx .a ( p1,v0 );
} // :cond_3
v0 = this.a;
/* iget-boolean v0, v0, Lgf$b;->o:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = this.a;
v0 = this.a;
cx .a ( p1,v0 );
} // :cond_4
} // :goto_0
v0 = (( gf ) p0 ).isVisible ( ); // invoke-virtual {p0}, Lgf;->isVisible()Z
int v1 = 1; // const/4 v1, 0x1
(( android.graphics.drawable.Drawable ) p1 ).setVisible ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
v0 = this.a;
/* iget-boolean v0, v0, Lgf$b;->j:Z */
(( android.graphics.drawable.Drawable ) p1 ).setDither ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setDither(Z)V
(( gf ) p0 ).getState ( ); // invoke-virtual {p0}, Lgf;->getState()[I
(( android.graphics.drawable.Drawable ) p1 ).setState ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z
v0 = (( gf ) p0 ).getLevel ( ); // invoke-virtual {p0}, Lgf;->getLevel()I
(( android.graphics.drawable.Drawable ) p1 ).setLevel ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
(( gf ) p0 ).getBounds ( ); // invoke-virtual {p0}, Lgf;->getBounds()Landroid/graphics/Rect;
(( android.graphics.drawable.Drawable ) p1 ).setBounds ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_5 */
v0 = (( gf ) p0 ).getLayoutDirection ( ); // invoke-virtual {p0}, Lgf;->getLayoutDirection()I
(( android.graphics.drawable.Drawable ) p1 ).setLayoutDirection ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z
} // :cond_5
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_6 */
v0 = this.a;
/* iget-boolean v0, v0, Lgf$b;->l:Z */
(( android.graphics.drawable.Drawable ) p1 ).setAutoMirrored ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V
} // :cond_6
v0 = this.a;
/* const/16 v2, 0x15 */
/* if-lt v1, v2, :cond_7 */
if ( v0 != null) { // if-eqz v0, :cond_7
/* iget v1, v0, Landroid/graphics/Rect;->left:I */
/* iget v2, v0, Landroid/graphics/Rect;->top:I */
/* iget v3, v0, Landroid/graphics/Rect;->right:I */
/* iget v0, v0, Landroid/graphics/Rect;->bottom:I */
(( android.graphics.drawable.Drawable ) p1 ).setHotspotBounds ( v1, v2, v3, v0 ); // invoke-virtual {p1, v1, v2, v3, v0}, Landroid/graphics/drawable/Drawable;->setHotspotBounds(IIII)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_7
v0 = this.a;
(( gf$a ) v0 ).a ( ); // invoke-virtual {v0}, Lgf$a;->a()Landroid/graphics/drawable/Drawable$Callback;
(( android.graphics.drawable.Drawable ) p1 ).setCallback ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
return;
/* :catchall_0 */
/* move-exception v0 */
v1 = this.a;
(( gf$a ) v1 ).a ( ); // invoke-virtual {v1}, Lgf$a;->a()Landroid/graphics/drawable/Drawable$Callback;
(( android.graphics.drawable.Drawable ) p1 ).setCallback ( v1 ); // invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
/* throw v0 */
} // .end method
/* # virtual methods */
gf$b a ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
protected void a ( gf$b p0 ) {
/* .locals 1 */
this.a = p1;
/* iget v0, p0, Lgf;->a:I */
/* if-ltz v0, :cond_0 */
(( gf$b ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lgf$b;->a(I)Landroid/graphics/drawable/Drawable;
this.a = p1;
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_0
/* invoke-direct {p0, p1}, Lgf;->a(Landroid/graphics/drawable/Drawable;)V */
} // :cond_0
int p1 = -1; // const/4 p1, -0x1
/* iput p1, p0, Lgf;->c:I */
int p1 = 0; // const/4 p1, 0x0
this.b = p1;
return;
} // .end method
final void a ( Boolean p0 ) {
/* .locals 13 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lgf;->a:Z */
android.os.SystemClock .uptimeMillis ( );
/* move-result-wide v1 */
v3 = this.a;
/* const-wide/16 v4, 0xff */
int v6 = 0; // const/4 v6, 0x0
/* const-wide/16 v7, 0x0 */
if ( v3 != null) { // if-eqz v3, :cond_1
/* iget-wide v9, p0, Lgf;->a:J */
/* cmp-long v11, v9, v7 */
if ( v11 != null) { // if-eqz v11, :cond_2
/* cmp-long v11, v9, v1 */
/* if-gtz v11, :cond_0 */
/* iget v9, p0, Lgf;->b:I */
(( android.graphics.drawable.Drawable ) v3 ).setAlpha ( v9 ); // invoke-virtual {v3, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
} // :cond_0
/* sub-long/2addr v9, v1 */
/* mul-long v9, v9, v4 */
/* long-to-int v3, v9 */
v9 = this.a;
/* iget v9, v9, Lgf$b;->k:I */
/* div-int/2addr v3, v9 */
v9 = this.a;
/* rsub-int v3, v3, 0xff */
/* iget v10, p0, Lgf;->b:I */
/* mul-int v3, v3, v10 */
/* div-int/lit16 v3, v3, 0xff */
(( android.graphics.drawable.Drawable ) v9 ).setAlpha ( v3 ); // invoke-virtual {v9, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
int v3 = 1; // const/4 v3, 0x1
} // :cond_1
} // :goto_0
/* iput-wide v7, p0, Lgf;->a:J */
} // :cond_2
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
v9 = this.b;
if ( v9 != null) { // if-eqz v9, :cond_4
/* iget-wide v10, p0, Lgf;->b:J */
/* cmp-long v12, v10, v7 */
if ( v12 != null) { // if-eqz v12, :cond_5
/* cmp-long v12, v10, v1 */
/* if-gtz v12, :cond_3 */
(( android.graphics.drawable.Drawable ) v9 ).setVisible ( v6, v6 ); // invoke-virtual {v9, v6, v6}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
int v0 = 0; // const/4 v0, 0x0
this.b = v0;
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lgf;->c:I */
} // :cond_3
/* sub-long/2addr v10, v1 */
/* mul-long v10, v10, v4 */
/* long-to-int v3, v10 */
v4 = this.a;
/* iget v4, v4, Lgf$b;->l:I */
/* div-int/2addr v3, v4 */
v4 = this.b;
/* iget v5, p0, Lgf;->b:I */
/* mul-int v3, v3, v5 */
/* div-int/lit16 v3, v3, 0xff */
(( android.graphics.drawable.Drawable ) v4 ).setAlpha ( v3 ); // invoke-virtual {v4, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
} // :cond_4
} // :goto_2
/* iput-wide v7, p0, Lgf;->b:J */
} // :cond_5
/* move v0, v3 */
} // :goto_3
if ( p1 != null) { // if-eqz p1, :cond_6
if ( v0 != null) { // if-eqz v0, :cond_6
p1 = this.a;
/* const-wide/16 v3, 0x10 */
/* add-long/2addr v1, v3 */
(( gf ) p0 ).scheduleSelf ( p1, v1, v2 ); // invoke-virtual {p0, p1, v1, v2}, Lgf;->scheduleSelf(Ljava/lang/Runnable;J)V
} // :cond_6
return;
} // .end method
final Boolean a ( Integer p0 ) {
/* .locals 8 */
/* iget v0, p0, Lgf;->a:I */
int v1 = 0; // const/4 v1, 0x0
/* if-ne p1, v0, :cond_0 */
} // :cond_0
android.os.SystemClock .uptimeMillis ( );
/* move-result-wide v2 */
v0 = this.a;
/* iget v0, v0, Lgf$b;->l:I */
int v4 = -1; // const/4 v4, -0x1
int v5 = 0; // const/4 v5, 0x0
/* const-wide/16 v6, 0x0 */
/* if-lez v0, :cond_3 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
(( android.graphics.drawable.Drawable ) v0 ).setVisible ( v1, v1 ); // invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
} // :cond_1
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_2
this.b = v0;
/* iget v0, p0, Lgf;->a:I */
/* iput v0, p0, Lgf;->c:I */
v0 = this.a;
/* iget v0, v0, Lgf$b;->l:I */
/* int-to-long v0, v0 */
/* add-long/2addr v0, v2 */
/* iput-wide v0, p0, Lgf;->b:J */
} // :cond_2
this.b = v5;
/* iput v4, p0, Lgf;->c:I */
/* iput-wide v6, p0, Lgf;->b:J */
} // :cond_3
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_4
(( android.graphics.drawable.Drawable ) v0 ).setVisible ( v1, v1 ); // invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
} // :cond_4
} // :goto_0
/* if-ltz p1, :cond_6 */
v0 = this.a;
/* iget v0, v0, Lgf$b;->d:I */
/* if-ge p1, v0, :cond_6 */
v0 = this.a;
(( gf$b ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lgf$b;->a(I)Landroid/graphics/drawable/Drawable;
this.a = v0;
/* iput p1, p0, Lgf;->a:I */
if ( v0 != null) { // if-eqz v0, :cond_7
p1 = this.a;
/* iget p1, p1, Lgf$b;->k:I */
/* if-lez p1, :cond_5 */
p1 = this.a;
/* iget p1, p1, Lgf$b;->k:I */
/* int-to-long v4, p1 */
/* add-long/2addr v2, v4 */
/* iput-wide v2, p0, Lgf;->a:J */
} // :cond_5
/* invoke-direct {p0, v0}, Lgf;->a(Landroid/graphics/drawable/Drawable;)V */
} // :cond_6
this.a = v5;
/* iput v4, p0, Lgf;->a:I */
} // :cond_7
} // :goto_1
/* iget-wide v0, p0, Lgf;->a:J */
int p1 = 1; // const/4 p1, 0x1
/* cmp-long v2, v0, v6 */
/* if-nez v2, :cond_8 */
/* iget-wide v0, p0, Lgf;->b:J */
/* cmp-long v2, v0, v6 */
if ( v2 != null) { // if-eqz v2, :cond_a
} // :cond_8
v0 = this.a;
/* if-nez v0, :cond_9 */
/* new-instance v0, Lgf$1; */
/* invoke-direct {v0, p0}, Lgf$1;-><init>(Lgf;)V */
this.a = v0;
} // :cond_9
(( gf ) p0 ).unscheduleSelf ( v0 ); // invoke-virtual {p0, v0}, Lgf;->unscheduleSelf(Ljava/lang/Runnable;)V
} // :goto_2
(( gf ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lgf;->a(Z)V
} // :cond_a
(( gf ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Lgf;->invalidateSelf()V
} // .end method
public void applyTheme ( android.content.res.Resources$Theme p0 ) {
/* .locals 6 */
v0 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_2
(( gf$b ) v0 ).c ( ); // invoke-virtual {v0}, Lgf$b;->c()V
/* iget v1, v0, Lgf$b;->d:I */
v2 = this.a;
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v1, :cond_1 */
/* aget-object v4, v2, v3 */
if ( v4 != null) { // if-eqz v4, :cond_0
/* aget-object v4, v2, v3 */
v4 = (( android.graphics.drawable.Drawable ) v4 ).canApplyTheme ( ); // invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->canApplyTheme()Z
if ( v4 != null) { // if-eqz v4, :cond_0
/* aget-object v4, v2, v3 */
(( android.graphics.drawable.Drawable ) v4 ).applyTheme ( p1 ); // invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->applyTheme(Landroid/content/res/Resources$Theme;)V
/* iget v4, v0, Lgf$b;->c:I */
/* aget-object v5, v2, v3 */
v5 = (( android.graphics.drawable.Drawable ) v5 ).getChangingConfigurations ( ); // invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I
/* or-int/2addr v4, v5 */
/* iput v4, v0, Lgf$b;->c:I */
} // :cond_0
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_1
(( android.content.res.Resources$Theme ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/res/Resources$Theme;->getResources()Landroid/content/res/Resources;
(( gf$b ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lgf$b;->a(Landroid/content/res/Resources;)V
} // :cond_2
return;
} // .end method
public Boolean canApplyTheme ( ) {
/* .locals 1 */
v0 = this.a;
v0 = (( gf$b ) v0 ).canApplyTheme ( ); // invoke-virtual {v0}, Lgf$b;->canApplyTheme()Z
} // .end method
public void draw ( android.graphics.Canvas p0 ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.graphics.drawable.Drawable ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
} // :cond_0
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
(( android.graphics.drawable.Drawable ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
} // :cond_1
return;
} // .end method
public Integer getAlpha ( ) {
/* .locals 1 */
/* iget v0, p0, Lgf;->b:I */
} // .end method
public Integer getChangingConfigurations ( ) {
/* .locals 2 */
v0 = /* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I */
v1 = this.a;
v1 = (( gf$b ) v1 ).getChangingConfigurations ( ); // invoke-virtual {v1}, Lgf$b;->getChangingConfigurations()I
/* or-int/2addr v0, v1 */
} // .end method
public final android.graphics.drawable.Drawable$ConstantState getConstantState ( ) {
/* .locals 2 */
v0 = this.a;
v0 = (( gf$b ) v0 ).a ( ); // invoke-virtual {v0}, Lgf$b;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
v1 = (( gf ) p0 ).getChangingConfigurations ( ); // invoke-virtual {p0}, Lgf;->getChangingConfigurations()I
/* iput v1, v0, Lgf$b;->b:I */
v0 = this.a;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public android.graphics.drawable.Drawable getCurrent ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public void getHotspotBounds ( android.graphics.Rect p0 ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.graphics.Rect ) p1 ).set ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
return;
} // :cond_0
/* invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->getHotspotBounds(Landroid/graphics/Rect;)V */
return;
} // .end method
public Integer getIntrinsicHeight ( ) {
/* .locals 2 */
v0 = this.a;
/* iget-boolean v0, v0, Lgf$b;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
/* iget-boolean v1, v0, Lgf$b;->d:Z */
/* if-nez v1, :cond_0 */
(( gf$b ) v0 ).d ( ); // invoke-virtual {v0}, Lgf$b;->d()V
} // :cond_0
/* iget v0, v0, Lgf$b;->f:I */
} // :cond_1
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = (( android.graphics.drawable.Drawable ) v0 ).getIntrinsicHeight ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
} // :cond_2
int v0 = -1; // const/4 v0, -0x1
} // .end method
public Integer getIntrinsicWidth ( ) {
/* .locals 2 */
v0 = this.a;
/* iget-boolean v0, v0, Lgf$b;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
/* iget-boolean v1, v0, Lgf$b;->d:Z */
/* if-nez v1, :cond_0 */
(( gf$b ) v0 ).d ( ); // invoke-virtual {v0}, Lgf$b;->d()V
} // :cond_0
/* iget v0, v0, Lgf$b;->e:I */
} // :cond_1
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = (( android.graphics.drawable.Drawable ) v0 ).getIntrinsicWidth ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
} // :cond_2
int v0 = -1; // const/4 v0, -0x1
} // .end method
public Integer getMinimumHeight ( ) {
/* .locals 2 */
v0 = this.a;
/* iget-boolean v0, v0, Lgf$b;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
/* iget-boolean v1, v0, Lgf$b;->d:Z */
/* if-nez v1, :cond_0 */
(( gf$b ) v0 ).d ( ); // invoke-virtual {v0}, Lgf$b;->d()V
} // :cond_0
/* iget v0, v0, Lgf$b;->h:I */
} // :cond_1
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = (( android.graphics.drawable.Drawable ) v0 ).getMinimumHeight ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer getMinimumWidth ( ) {
/* .locals 2 */
v0 = this.a;
/* iget-boolean v0, v0, Lgf$b;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
/* iget-boolean v1, v0, Lgf$b;->d:Z */
/* if-nez v1, :cond_0 */
(( gf$b ) v0 ).d ( ); // invoke-virtual {v0}, Lgf$b;->d()V
} // :cond_0
/* iget v0, v0, Lgf$b;->g:I */
} // :cond_1
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = (( android.graphics.drawable.Drawable ) v0 ).getMinimumWidth ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer getOpacity ( ) {
/* .locals 7 */
v0 = this.a;
int v1 = -2; // const/4 v1, -0x2
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = (( android.graphics.drawable.Drawable ) v0 ).isVisible ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isVisible()Z
/* if-nez v0, :cond_0 */
} // :cond_0
v0 = this.a;
/* iget-boolean v2, v0, Lgf$b;->e:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* iget v0, v0, Lgf$b;->i:I */
} // :cond_1
(( gf$b ) v0 ).c ( ); // invoke-virtual {v0}, Lgf$b;->c()V
/* iget v2, v0, Lgf$b;->d:I */
v3 = this.a;
/* if-lez v2, :cond_2 */
int v1 = 0; // const/4 v1, 0x0
/* aget-object v1, v3, v1 */
v1 = (( android.graphics.drawable.Drawable ) v1 ).getOpacity ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getOpacity()I
} // :cond_2
int v4 = 1; // const/4 v4, 0x1
/* move v5, v1 */
int v1 = 1; // const/4 v1, 0x1
} // :goto_0
/* if-ge v1, v2, :cond_3 */
/* aget-object v6, v3, v1 */
v6 = (( android.graphics.drawable.Drawable ) v6 ).getOpacity ( ); // invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getOpacity()I
v5 = android.graphics.drawable.Drawable .resolveOpacity ( v5,v6 );
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_3
/* iput v5, v0, Lgf$b;->i:I */
/* iput-boolean v4, v0, Lgf$b;->e:Z */
} // :cond_4
} // :goto_1
} // .end method
public void getOutline ( android.graphics.Outline p0 ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.graphics.drawable.Drawable ) v0 ).getOutline ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getOutline(Landroid/graphics/Outline;)V
} // :cond_0
return;
} // .end method
public Boolean getPadding ( android.graphics.Rect p0 ) {
/* .locals 10 */
v0 = this.a;
/* iget-boolean v1, v0, Lgf$b;->a:Z */
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_0
v1 = this.a;
/* if-nez v1, :cond_8 */
/* iget-boolean v1, v0, Lgf$b;->b:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
} // :cond_1
(( gf$b ) v0 ).c ( ); // invoke-virtual {v0}, Lgf$b;->c()V
/* new-instance v1, Landroid/graphics/Rect; */
/* invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V */
/* iget v5, v0, Lgf$b;->d:I */
v6 = this.a;
/* move-object v7, v2 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v5, :cond_7 */
/* aget-object v8, v6, v2 */
v8 = (( android.graphics.drawable.Drawable ) v8 ).getPadding ( v1 ); // invoke-virtual {v8, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
if ( v8 != null) { // if-eqz v8, :cond_6
/* if-nez v7, :cond_2 */
/* new-instance v7, Landroid/graphics/Rect; */
/* invoke-direct {v7, v4, v4, v4, v4}, Landroid/graphics/Rect;-><init>(IIII)V */
} // :cond_2
/* iget v8, v1, Landroid/graphics/Rect;->left:I */
/* iget v9, v7, Landroid/graphics/Rect;->left:I */
/* if-le v8, v9, :cond_3 */
/* iget v8, v1, Landroid/graphics/Rect;->left:I */
/* iput v8, v7, Landroid/graphics/Rect;->left:I */
} // :cond_3
/* iget v8, v1, Landroid/graphics/Rect;->top:I */
/* iget v9, v7, Landroid/graphics/Rect;->top:I */
/* if-le v8, v9, :cond_4 */
/* iget v8, v1, Landroid/graphics/Rect;->top:I */
/* iput v8, v7, Landroid/graphics/Rect;->top:I */
} // :cond_4
/* iget v8, v1, Landroid/graphics/Rect;->right:I */
/* iget v9, v7, Landroid/graphics/Rect;->right:I */
/* if-le v8, v9, :cond_5 */
/* iget v8, v1, Landroid/graphics/Rect;->right:I */
/* iput v8, v7, Landroid/graphics/Rect;->right:I */
} // :cond_5
/* iget v8, v1, Landroid/graphics/Rect;->bottom:I */
/* iget v9, v7, Landroid/graphics/Rect;->bottom:I */
/* if-le v8, v9, :cond_6 */
/* iget v8, v1, Landroid/graphics/Rect;->bottom:I */
/* iput v8, v7, Landroid/graphics/Rect;->bottom:I */
} // :cond_6
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_7
/* iput-boolean v3, v0, Lgf$b;->b:Z */
this.a = v7;
/* move-object v2, v7 */
} // :cond_8
} // :goto_1
v2 = this.a;
} // :goto_2
if ( v2 != null) { // if-eqz v2, :cond_a
(( android.graphics.Rect ) p1 ).set ( v2 ); // invoke-virtual {p1, v2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
/* iget v0, v2, Landroid/graphics/Rect;->left:I */
/* iget v1, v2, Landroid/graphics/Rect;->top:I */
/* or-int/2addr v0, v1 */
/* iget v1, v2, Landroid/graphics/Rect;->bottom:I */
/* or-int/2addr v0, v1 */
/* iget v1, v2, Landroid/graphics/Rect;->right:I */
/* or-int/2addr v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_9
int v0 = 1; // const/4 v0, 0x1
} // :cond_9
int v0 = 0; // const/4 v0, 0x0
} // :cond_a
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_b
v0 = (( android.graphics.drawable.Drawable ) v0 ).getPadding ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
} // :cond_b
v0 = /* invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z */
} // :goto_3
v1 = (( gf ) p0 ).isAutoMirrored ( ); // invoke-virtual {p0}, Lgf;->isAutoMirrored()Z
if ( v1 != null) { // if-eqz v1, :cond_c
v1 = (( gf ) p0 ).getLayoutDirection ( ); // invoke-virtual {p0}, Lgf;->getLayoutDirection()I
/* if-ne v1, v3, :cond_c */
} // :cond_c
int v3 = 0; // const/4 v3, 0x0
} // :goto_4
if ( v3 != null) { // if-eqz v3, :cond_d
/* iget v1, p1, Landroid/graphics/Rect;->left:I */
/* iget v2, p1, Landroid/graphics/Rect;->right:I */
/* iput v2, p1, Landroid/graphics/Rect;->left:I */
/* iput v1, p1, Landroid/graphics/Rect;->right:I */
} // :cond_d
} // .end method
public void invalidateDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( gf$b ) v0 ).b ( ); // invoke-virtual {v0}, Lgf$b;->b()V
} // :cond_0
v0 = this.a;
/* if-ne p1, v0, :cond_1 */
(( gf ) p0 ).getCallback ( ); // invoke-virtual {p0}, Lgf;->getCallback()Landroid/graphics/drawable/Drawable$Callback;
if ( p1 != null) { // if-eqz p1, :cond_1
(( gf ) p0 ).getCallback ( ); // invoke-virtual {p0}, Lgf;->getCallback()Landroid/graphics/drawable/Drawable$Callback;
} // :cond_1
return;
} // .end method
public Boolean isAutoMirrored ( ) {
/* .locals 1 */
v0 = this.a;
/* iget-boolean v0, v0, Lgf$b;->l:Z */
} // .end method
public Boolean isStateful ( ) {
/* .locals 7 */
v0 = this.a;
/* iget-boolean v1, v0, Lgf$b;->f:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* iget-boolean v0, v0, Lgf$b;->g:Z */
} // :cond_0
(( gf$b ) v0 ).c ( ); // invoke-virtual {v0}, Lgf$b;->c()V
/* iget v1, v0, Lgf$b;->d:I */
v2 = this.a;
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
int v5 = 1; // const/4 v5, 0x1
/* if-ge v4, v1, :cond_2 */
/* aget-object v6, v2, v4 */
v6 = (( android.graphics.drawable.Drawable ) v6 ).isStateful ( ); // invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( v6 != null) { // if-eqz v6, :cond_1
int v3 = 1; // const/4 v3, 0x1
} // :cond_1
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_2
} // :goto_1
/* iput-boolean v3, v0, Lgf$b;->g:Z */
/* iput-boolean v5, v0, Lgf$b;->f:Z */
} // .end method
public void jumpToCurrentState ( ) {
/* .locals 7 */
v0 = this.b;
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.graphics.drawable.Drawable ) v0 ).jumpToCurrentState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
int v0 = 0; // const/4 v0, 0x0
this.b = v0;
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lgf;->c:I */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v2 = this.a;
if ( v2 != null) { // if-eqz v2, :cond_1
(( android.graphics.drawable.Drawable ) v2 ).jumpToCurrentState ( ); // invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
/* iget-boolean v2, p0, Lgf;->a:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
v2 = this.a;
/* iget v3, p0, Lgf;->b:I */
(( android.graphics.drawable.Drawable ) v2 ).setAlpha ( v3 ); // invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
} // :cond_1
/* iget-wide v2, p0, Lgf;->b:J */
/* const-wide/16 v4, 0x0 */
/* cmp-long v6, v2, v4 */
if ( v6 != null) { // if-eqz v6, :cond_2
/* iput-wide v4, p0, Lgf;->b:J */
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
/* iget-wide v2, p0, Lgf;->a:J */
/* cmp-long v6, v2, v4 */
if ( v6 != null) { // if-eqz v6, :cond_3
/* iput-wide v4, p0, Lgf;->a:J */
int v0 = 1; // const/4 v0, 0x1
} // :cond_3
if ( v0 != null) { // if-eqz v0, :cond_4
(( gf ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Lgf;->invalidateSelf()V
} // :cond_4
return;
} // .end method
public android.graphics.drawable.Drawable mutate ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lgf;->b:Z */
/* if-nez v0, :cond_0 */
/* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable; */
/* if-ne v0, p0, :cond_0 */
(( gf ) p0 ).a ( ); // invoke-virtual {p0}, Lgf;->a()Lgf$b;
(( gf$b ) v0 ).a ( ); // invoke-virtual {v0}, Lgf$b;->a()V
(( gf ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lgf;->a(Lgf$b;)V
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lgf;->b:Z */
} // :cond_0
} // .end method
protected void onBoundsChange ( android.graphics.Rect p0 ) {
/* .locals 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.graphics.drawable.Drawable ) v0 ).setBounds ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V
} // :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
(( android.graphics.drawable.Drawable ) v0 ).setBounds ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V
} // :cond_1
return;
} // .end method
public Boolean onLayoutDirectionChanged ( Integer p0 ) {
/* .locals 9 */
v0 = this.a;
/* iget v1, p0, Lgf;->a:I */
/* iget v2, v0, Lgf$b;->d:I */
v3 = this.a;
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
} // :goto_0
/* if-ge v5, v2, :cond_2 */
/* aget-object v7, v3, v5 */
if ( v7 != null) { // if-eqz v7, :cond_1
/* const/16 v8, 0x17 */
/* if-lt v7, v8, :cond_0 */
/* aget-object v7, v3, v5 */
v7 = (( android.graphics.drawable.Drawable ) v7 ).setLayoutDirection ( p1 ); // invoke-virtual {v7, p1}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z
} // :cond_0
int v7 = 0; // const/4 v7, 0x0
} // :goto_1
/* if-ne v5, v1, :cond_1 */
/* move v6, v7 */
} // :cond_1
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_2
/* iput p1, v0, Lgf$b;->j:I */
} // .end method
protected Boolean onLevelChange ( Integer p0 ) {
/* .locals 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = (( android.graphics.drawable.Drawable ) v0 ).setLevel ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
} // :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
p1 = (( android.graphics.drawable.Drawable ) v0 ).setLevel ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
protected Boolean onStateChange ( Integer[] p0 ) {
/* .locals 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = (( android.graphics.drawable.Drawable ) v0 ).setState ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
} // :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
p1 = (( android.graphics.drawable.Drawable ) v0 ).setState ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void scheduleDrawable ( android.graphics.drawable.Drawable p0, java.lang.Runnable p1, Long p2 ) {
/* .locals 1 */
v0 = this.a;
/* if-ne p1, v0, :cond_0 */
(( gf ) p0 ).getCallback ( ); // invoke-virtual {p0}, Lgf;->getCallback()Landroid/graphics/drawable/Drawable$Callback;
if ( p1 != null) { // if-eqz p1, :cond_0
(( gf ) p0 ).getCallback ( ); // invoke-virtual {p0}, Lgf;->getCallback()Landroid/graphics/drawable/Drawable$Callback;
} // :cond_0
return;
} // .end method
public void setAlpha ( Integer p0 ) {
/* .locals 6 */
/* iget-boolean v0, p0, Lgf;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Lgf;->b:I */
/* if-eq v0, p1, :cond_2 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lgf;->a:Z */
/* iput p1, p0, Lgf;->b:I */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_2
/* iget-wide v1, p0, Lgf;->a:J */
/* const-wide/16 v3, 0x0 */
/* cmp-long v5, v1, v3 */
/* if-nez v5, :cond_1 */
(( android.graphics.drawable.Drawable ) v0 ).setAlpha ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
return;
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
(( gf ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lgf;->a(Z)V
} // :cond_2
return;
} // .end method
public void setAutoMirrored ( Boolean p0 ) {
/* .locals 1 */
v0 = this.a;
/* iget-boolean v0, v0, Lgf$b;->l:Z */
/* if-eq v0, p1, :cond_0 */
v0 = this.a;
/* iput-boolean p1, v0, Lgf$b;->l:Z */
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_0
/* iget-boolean v0, v0, Lgf$b;->l:Z */
cx .a ( p1,v0 );
} // :cond_0
return;
} // .end method
public void setColorFilter ( android.graphics.ColorFilter p0 ) {
/* .locals 2 */
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, v0, Lgf$b;->m:Z */
v0 = this.a;
/* if-eq v0, p1, :cond_0 */
v0 = this.a;
this.a = p1;
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.graphics.drawable.Drawable ) v0 ).setColorFilter ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V
} // :cond_0
return;
} // .end method
public void setDither ( Boolean p0 ) {
/* .locals 1 */
v0 = this.a;
/* iget-boolean v0, v0, Lgf$b;->j:Z */
/* if-eq v0, p1, :cond_0 */
v0 = this.a;
/* iput-boolean p1, v0, Lgf$b;->j:Z */
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_0
/* iget-boolean v0, v0, Lgf$b;->j:Z */
(( android.graphics.drawable.Drawable ) p1 ).setDither ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setDither(Z)V
} // :cond_0
return;
} // .end method
public void setHotspot ( Float p0, Float p1 ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
cx .a ( v0,p1,p2 );
} // :cond_0
return;
} // .end method
public void setHotspotBounds ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;-><init>(IIII)V */
this.a = v0;
} // :cond_0
(( android.graphics.Rect ) v0 ).set ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V
} // :goto_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
cx .a ( v0,p1,p2,p3,p4 );
} // :cond_1
return;
} // .end method
public void setTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 2 */
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, v0, Lgf$b;->n:Z */
v0 = this.a;
/* if-eq v0, p1, :cond_0 */
v0 = this.a;
this.a = p1;
v0 = this.a;
cx .a ( v0,p1 );
} // :cond_0
return;
} // .end method
public void setTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 2 */
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, v0, Lgf$b;->o:Z */
v0 = this.a;
/* if-eq v0, p1, :cond_0 */
v0 = this.a;
this.a = p1;
v0 = this.a;
cx .a ( v0,p1 );
} // :cond_0
return;
} // .end method
public Boolean setVisible ( Boolean p0, Boolean p1 ) {
/* .locals 2 */
v0 = /* invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z */
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_0
(( android.graphics.drawable.Drawable ) v1 ).setVisible ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
} // :cond_0
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_1
(( android.graphics.drawable.Drawable ) v1 ).setVisible ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
} // :cond_1
} // .end method
public void unscheduleDrawable ( android.graphics.drawable.Drawable p0, java.lang.Runnable p1 ) {
/* .locals 1 */
v0 = this.a;
/* if-ne p1, v0, :cond_0 */
(( gf ) p0 ).getCallback ( ); // invoke-virtual {p0}, Lgf;->getCallback()Landroid/graphics/drawable/Drawable$Callback;
if ( p1 != null) { // if-eqz p1, :cond_0
(( gf ) p0 ).getCallback ( ); // invoke-virtual {p0}, Lgf;->getCallback()Landroid/graphics/drawable/Drawable$Callback;
} // :cond_0
return;
} // .end method
