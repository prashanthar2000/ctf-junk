class da extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable$Callback implements cy implements cz {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lda$b;, */
	 /* Lda$a; */
	 /* } */
} // .end annotation
/* # static fields */
static final android.graphics.PorterDuff$Mode a;
/* # instance fields */
private Integer a;
android.graphics.drawable.Drawable a;
da$a a;
private Boolean a;
private android.graphics.PorterDuff$Mode b;
private Boolean b;
/* # direct methods */
static da ( ) {
	 /* .locals 1 */
	 v0 = android.graphics.PorterDuff$Mode.SRC_IN;
	 return;
} // .end method
 da ( ) {
	 /* .locals 1 */
	 /* invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V */
	 (( da ) p0 ).a ( ); // invoke-virtual {p0}, Lda;->a()Lda$a;
	 this.a = v0;
	 (( da ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lda;->a(Landroid/graphics/drawable/Drawable;)V
	 return;
} // .end method
 da ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V */
	 this.a = p1;
	 p1 = this.a;
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 p1 = this.a;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 p1 = this.a;
			 p1 = this.a;
			 (( android.graphics.drawable.Drawable$ConstantState ) p1 ).newDrawable ( p2 ); // invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
			 (( da ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lda;->a(Landroid/graphics/drawable/Drawable;)V
		 } // :cond_0
		 return;
	 } // .end method
	 private Boolean a ( Integer[] p0 ) {
		 /* .locals 4 */
		 v0 = 		 (( da ) p0 ).a ( ); // invoke-virtual {p0}, Lda;->a()Z
		 int v1 = 0; // const/4 v1, 0x0
		 /* if-nez v0, :cond_0 */
	 } // :cond_0
	 v0 = this.a;
	 v0 = this.a;
	 v2 = this.a;
	 v2 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 if ( v2 != null) { // if-eqz v2, :cond_2
			 v3 = 			 (( android.content.res.ColorStateList ) v0 ).getDefaultColor ( ); // invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I
			 p1 = 			 (( android.content.res.ColorStateList ) v0 ).getColorForState ( p1, v3 ); // invoke-virtual {v0, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I
			 /* iget-boolean v0, p0, Lda;->a:Z */
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* iget v0, p0, Lda;->a:I */
				 /* if-ne p1, v0, :cond_1 */
				 v0 = this.b;
				 /* if-eq v2, v0, :cond_3 */
			 } // :cond_1
			 (( da ) p0 ).setColorFilter ( p1, v2 ); // invoke-virtual {p0, p1, v2}, Lda;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V
			 /* iput p1, p0, Lda;->a:I */
			 this.b = v2;
			 int p1 = 1; // const/4 p1, 0x1
			 /* iput-boolean p1, p0, Lda;->a:Z */
		 } // :cond_2
		 /* iput-boolean v1, p0, Lda;->a:Z */
		 (( da ) p0 ).clearColorFilter ( ); // invoke-virtual {p0}, Lda;->clearColorFilter()V
	 } // :cond_3
} // .end method
/* # virtual methods */
public final android.graphics.drawable.Drawable a ( ) {
	 /* .locals 1 */
	 v0 = this.a;
} // .end method
da$a a ( ) {
	 /* .locals 2 */
	 /* new-instance v0, Lda$b; */
	 v1 = this.a;
	 /* invoke-direct {v0, v1}, Lda$b;-><init>(Lda$a;)V */
} // .end method
public final void a ( android.graphics.drawable.Drawable p0 ) {
	 /* .locals 2 */
	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.graphics.drawable.Drawable ) v0 ).setCallback ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
	 } // :cond_0
	 this.a = p1;
	 if ( p1 != null) { // if-eqz p1, :cond_1
		 (( android.graphics.drawable.Drawable ) p1 ).setCallback ( p0 ); // invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
		 v0 = 		 (( android.graphics.drawable.Drawable ) p1 ).isVisible ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isVisible()Z
		 int v1 = 1; // const/4 v1, 0x1
		 (( da ) p0 ).setVisible ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lda;->setVisible(ZZ)Z
		 (( android.graphics.drawable.Drawable ) p1 ).getState ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getState()[I
		 (( da ) p0 ).setState ( v0 ); // invoke-virtual {p0, v0}, Lda;->setState([I)Z
		 v0 = 		 (( android.graphics.drawable.Drawable ) p1 ).getLevel ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getLevel()I
		 (( da ) p0 ).setLevel ( v0 ); // invoke-virtual {p0, v0}, Lda;->setLevel(I)Z
		 (( android.graphics.drawable.Drawable ) p1 ).getBounds ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;
		 (( da ) p0 ).setBounds ( v0 ); // invoke-virtual {p0, v0}, Lda;->setBounds(Landroid/graphics/Rect;)V
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 (( android.graphics.drawable.Drawable ) p1 ).getConstantState ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
			 this.a = p1;
		 } // :cond_1
		 (( da ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Lda;->invalidateSelf()V
		 return;
	 } // .end method
	 protected Boolean a ( ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // .end method
	 public void draw ( android.graphics.Canvas p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.graphics.drawable.Drawable ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
		 return;
	 } // .end method
	 public Integer getChangingConfigurations ( ) {
		 /* .locals 2 */
		 v0 = 		 /* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I */
		 v1 = this.a;
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 v1 = 			 (( da$a ) v1 ).getChangingConfigurations ( ); // invoke-virtual {v1}, Lda$a;->getChangingConfigurations()I
		 } // :cond_0
		 int v1 = 0; // const/4 v1, 0x0
	 } // :goto_0
	 /* or-int/2addr v0, v1 */
	 v1 = this.a;
	 v1 = 	 (( android.graphics.drawable.Drawable ) v1 ).getChangingConfigurations ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I
	 /* or-int/2addr v0, v1 */
} // .end method
public android.graphics.drawable.Drawable$ConstantState getConstantState ( ) {
	 /* .locals 2 */
	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 1; // const/4 v0, 0x1
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 v0 = this.a;
		 v1 = 		 (( da ) p0 ).getChangingConfigurations ( ); // invoke-virtual {p0}, Lda;->getChangingConfigurations()I
		 /* iput v1, v0, Lda$a;->a:I */
		 v0 = this.a;
	 } // :cond_1
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public android.graphics.drawable.Drawable getCurrent ( ) {
	 /* .locals 1 */
	 v0 = this.a;
	 (( android.graphics.drawable.Drawable ) v0 ).getCurrent ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;
} // .end method
public Integer getIntrinsicHeight ( ) {
	 /* .locals 1 */
	 v0 = this.a;
	 v0 = 	 (( android.graphics.drawable.Drawable ) v0 ).getIntrinsicHeight ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
} // .end method
public Integer getIntrinsicWidth ( ) {
	 /* .locals 1 */
	 v0 = this.a;
	 v0 = 	 (( android.graphics.drawable.Drawable ) v0 ).getIntrinsicWidth ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
} // .end method
public Integer getMinimumHeight ( ) {
	 /* .locals 1 */
	 v0 = this.a;
	 v0 = 	 (( android.graphics.drawable.Drawable ) v0 ).getMinimumHeight ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I
} // .end method
public Integer getMinimumWidth ( ) {
	 /* .locals 1 */
	 v0 = this.a;
	 v0 = 	 (( android.graphics.drawable.Drawable ) v0 ).getMinimumWidth ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I
} // .end method
public Integer getOpacity ( ) {
	 /* .locals 1 */
	 v0 = this.a;
	 v0 = 	 (( android.graphics.drawable.Drawable ) v0 ).getOpacity ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I
} // .end method
public Boolean getPadding ( android.graphics.Rect p0 ) {
	 /* .locals 1 */
	 v0 = this.a;
	 p1 = 	 (( android.graphics.drawable.Drawable ) v0 ).getPadding ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
} // .end method
public getState ( ) {
	 /* .locals 1 */
	 v0 = this.a;
	 (( android.graphics.drawable.Drawable ) v0 ).getState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getState()[I
} // .end method
public android.graphics.Region getTransparentRegion ( ) {
	 /* .locals 1 */
	 v0 = this.a;
	 (( android.graphics.drawable.Drawable ) v0 ).getTransparentRegion ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getTransparentRegion()Landroid/graphics/Region;
} // .end method
public void invalidateDrawable ( android.graphics.drawable.Drawable p0 ) {
	 /* .locals 0 */
	 (( da ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Lda;->invalidateSelf()V
	 return;
} // .end method
public Boolean isAutoMirrored ( ) {
	 /* .locals 1 */
	 v0 = this.a;
	 v0 = 	 (( android.graphics.drawable.Drawable ) v0 ).isAutoMirrored ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isAutoMirrored()Z
} // .end method
public Boolean isStateful ( ) {
	 /* .locals 1 */
	 v0 = 	 (( da ) p0 ).a ( ); // invoke-virtual {p0}, Lda;->a()Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.a;
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 v0 = 		 (( android.content.res.ColorStateList ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z
		 /* if-nez v0, :cond_2 */
	 } // :cond_1
	 v0 = this.a;
	 v0 = 	 (( android.graphics.drawable.Drawable ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
	 if ( v0 != null) { // if-eqz v0, :cond_3
	 } // :cond_2
	 int v0 = 1; // const/4 v0, 0x1
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void jumpToCurrentState ( ) {
/* .locals 1 */
v0 = this.a;
(( android.graphics.drawable.Drawable ) v0 ).jumpToCurrentState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
return;
} // .end method
public android.graphics.drawable.Drawable mutate ( ) {
/* .locals 2 */
/* iget-boolean v0, p0, Lda;->b:Z */
/* if-nez v0, :cond_3 */
/* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable; */
/* if-ne v0, p0, :cond_3 */
(( da ) p0 ).a ( ); // invoke-virtual {p0}, Lda;->a()Lda$a;
this.a = v0;
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
	 (( android.graphics.drawable.Drawable ) v0 ).mutate ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;
} // :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_2
	 v1 = this.a;
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 (( android.graphics.drawable.Drawable ) v1 ).getConstantState ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
	 } // :cond_1
	 int v1 = 0; // const/4 v1, 0x0
} // :goto_0
this.a = v1;
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lda;->b:Z */
} // :cond_3
} // .end method
protected void onBoundsChange ( android.graphics.Rect p0 ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.graphics.drawable.Drawable ) v0 ).setBounds ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V
} // :cond_0
return;
} // .end method
protected Boolean onLevelChange ( Integer p0 ) {
/* .locals 1 */
v0 = this.a;
p1 = (( android.graphics.drawable.Drawable ) v0 ).setLevel ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
} // .end method
public void scheduleDrawable ( android.graphics.drawable.Drawable p0, java.lang.Runnable p1, Long p2 ) {
/* .locals 0 */
(( da ) p0 ).scheduleSelf ( p2, p3, p4 ); // invoke-virtual {p0, p2, p3, p4}, Lda;->scheduleSelf(Ljava/lang/Runnable;J)V
return;
} // .end method
public void setAlpha ( Integer p0 ) {
/* .locals 1 */
v0 = this.a;
(( android.graphics.drawable.Drawable ) v0 ).setAlpha ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
return;
} // .end method
public void setAutoMirrored ( Boolean p0 ) {
/* .locals 1 */
v0 = this.a;
(( android.graphics.drawable.Drawable ) v0 ).setAutoMirrored ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V
return;
} // .end method
public void setChangingConfigurations ( Integer p0 ) {
/* .locals 1 */
v0 = this.a;
(( android.graphics.drawable.Drawable ) v0 ).setChangingConfigurations ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V
return;
} // .end method
public void setColorFilter ( android.graphics.ColorFilter p0 ) {
/* .locals 1 */
v0 = this.a;
(( android.graphics.drawable.Drawable ) v0 ).setColorFilter ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V
return;
} // .end method
public void setDither ( Boolean p0 ) {
/* .locals 1 */
v0 = this.a;
(( android.graphics.drawable.Drawable ) v0 ).setDither ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setDither(Z)V
return;
} // .end method
public void setFilterBitmap ( Boolean p0 ) {
/* .locals 1 */
v0 = this.a;
(( android.graphics.drawable.Drawable ) v0 ).setFilterBitmap ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setFilterBitmap(Z)V
return;
} // .end method
public Boolean setState ( Integer[] p0 ) {
/* .locals 1 */
v0 = this.a;
v0 = (( android.graphics.drawable.Drawable ) v0 ).setState ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
p1 = /* invoke-direct {p0, p1}, Lda;->a([I)Z */
/* if-nez p1, :cond_1 */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // .end method
public void setTint ( Integer p0 ) {
/* .locals 0 */
android.content.res.ColorStateList .valueOf ( p1 );
(( da ) p0 ).setTintList ( p1 ); // invoke-virtual {p0, p1}, Lda;->setTintList(Landroid/content/res/ColorStateList;)V
return;
} // .end method
public void setTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 1 */
v0 = this.a;
this.a = p1;
(( da ) p0 ).getState ( ); // invoke-virtual {p0}, Lda;->getState()[I
/* invoke-direct {p0, p1}, Lda;->a([I)Z */
return;
} // .end method
public void setTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 1 */
v0 = this.a;
this.a = p1;
(( da ) p0 ).getState ( ); // invoke-virtual {p0}, Lda;->getState()[I
/* invoke-direct {p0, p1}, Lda;->a([I)Z */
return;
} // .end method
public Boolean setVisible ( Boolean p0, Boolean p1 ) {
/* .locals 1 */
v0 = /* invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z */
/* if-nez v0, :cond_1 */
v0 = this.a;
p1 = (( android.graphics.drawable.Drawable ) v0 ).setVisible ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // .end method
public void unscheduleDrawable ( android.graphics.drawable.Drawable p0, java.lang.Runnable p1 ) {
/* .locals 0 */
(( da ) p0 ).unscheduleSelf ( p2 ); // invoke-virtual {p0, p2}, Lda;->unscheduleSelf(Ljava/lang/Runnable;)V
return;
} // .end method
