public class gg extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable$Callback {
	 /* # interfaces */
	 /* # instance fields */
	 public android.graphics.drawable.Drawable a;
	 /* # direct methods */
	 public gg ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v1 = 0; // const/4 v1, 0x0
			 (( android.graphics.drawable.Drawable ) v0 ).setCallback ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
		 } // :cond_0
		 this.a = p1;
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 (( android.graphics.drawable.Drawable ) p1 ).setCallback ( p0 ); // invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
		 } // :cond_1
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void draw ( android.graphics.Canvas p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.graphics.drawable.Drawable ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
		 return;
	 } // .end method
	 public Integer getChangingConfigurations ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 v0 = 		 (( android.graphics.drawable.Drawable ) v0 ).getChangingConfigurations ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I
	 } // .end method
	 public android.graphics.drawable.Drawable getCurrent ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.graphics.drawable.Drawable ) v0 ).getCurrent ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;
	 } // .end method
	 public Integer getIntrinsicHeight ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 v0 = 		 (( android.graphics.drawable.Drawable ) v0 ).getIntrinsicHeight ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
	 } // .end method
	 public Integer getIntrinsicWidth ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 v0 = 		 (( android.graphics.drawable.Drawable ) v0 ).getIntrinsicWidth ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
	 } // .end method
	 public Integer getMinimumHeight ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 v0 = 		 (( android.graphics.drawable.Drawable ) v0 ).getMinimumHeight ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I
	 } // .end method
	 public Integer getMinimumWidth ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 v0 = 		 (( android.graphics.drawable.Drawable ) v0 ).getMinimumWidth ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I
	 } // .end method
	 public Integer getOpacity ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 v0 = 		 (( android.graphics.drawable.Drawable ) v0 ).getOpacity ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I
	 } // .end method
	 public Boolean getPadding ( android.graphics.Rect p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 p1 = 		 (( android.graphics.drawable.Drawable ) v0 ).getPadding ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
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
		 (( gg ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Lgg;->invalidateSelf()V
		 return;
	 } // .end method
	 public Boolean isAutoMirrored ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 v0 = 		 cx .a ( v0 );
	 } // .end method
	 public Boolean isStateful ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 v0 = 		 (( android.graphics.drawable.Drawable ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
	 } // .end method
	 public void jumpToCurrentState ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.graphics.drawable.Drawable ) v0 ).jumpToCurrentState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
		 return;
	 } // .end method
	 protected void onBoundsChange ( android.graphics.Rect p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.graphics.drawable.Drawable ) v0 ).setBounds ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V
		 return;
	 } // .end method
	 protected Boolean onLevelChange ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 p1 = 		 (( android.graphics.drawable.Drawable ) v0 ).setLevel ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
	 } // .end method
	 public void scheduleDrawable ( android.graphics.drawable.Drawable p0, java.lang.Runnable p1, Long p2 ) {
		 /* .locals 0 */
		 (( gg ) p0 ).scheduleSelf ( p2, p3, p4 ); // invoke-virtual {p0, p2, p3, p4}, Lgg;->scheduleSelf(Ljava/lang/Runnable;J)V
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
		 cx .a ( v0,p1 );
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
	 public void setHotspot ( Float p0, Float p1 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 cx .a ( v0,p1,p2 );
		 return;
	 } // .end method
	 public void setHotspotBounds ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 cx .a ( v0,p1,p2,p3,p4 );
		 return;
	 } // .end method
	 public Boolean setState ( Integer[] p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 p1 = 		 (( android.graphics.drawable.Drawable ) v0 ).setState ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
	 } // .end method
	 public void setTint ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 cx .a ( v0,p1 );
		 return;
	 } // .end method
	 public void setTintList ( android.content.res.ColorStateList p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 cx .a ( v0,p1 );
		 return;
	 } // .end method
	 public void setTintMode ( android.graphics.PorterDuff$Mode p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 cx .a ( v0,p1 );
		 return;
	 } // .end method
	 public Boolean setVisible ( Boolean p0, Boolean p1 ) {
		 /* .locals 1 */
		 v0 = 		 /* invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z */
		 /* if-nez v0, :cond_1 */
		 v0 = this.a;
		 p1 = 		 (( android.graphics.drawable.Drawable ) v0 ).setVisible ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
		 if ( p1 != null) { // if-eqz p1, :cond_0
		 } // :cond_0
		 int p1 = 0; // const/4 p1, 0x0
	 } // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // .end method
public void unscheduleDrawable ( android.graphics.drawable.Drawable p0, java.lang.Runnable p1 ) {
/* .locals 0 */
(( gg ) p0 ).unscheduleSelf ( p2 ); // invoke-virtual {p0, p2}, Lgg;->unscheduleSelf(Ljava/lang/Runnable;)V
return;
} // .end method
