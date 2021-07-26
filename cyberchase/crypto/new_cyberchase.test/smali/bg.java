abstract class bg extends android.graphics.drawable.Drawable implements cy {
	 /* # interfaces */
	 /* # instance fields */
	 android.graphics.drawable.Drawable a;
	 /* # direct methods */
	 bg ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void applyTheme ( android.content.res.Resources$Theme p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 cx .a ( v0,p1 );
		 } // :cond_0
		 return;
	 } // .end method
	 public void clearColorFilter ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( android.graphics.drawable.Drawable ) v0 ).clearColorFilter ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V
			 return;
		 } // :cond_0
		 /* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V */
		 return;
	 } // .end method
	 public android.graphics.ColorFilter getColorFilter ( ) {
		 /* .locals 4 */
		 v0 = this.a;
		 int v1 = 0; // const/4 v1, 0x0
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* const/16 v3, 0x15 */
			 /* if-lt v2, v3, :cond_0 */
			 (( android.graphics.drawable.Drawable ) v0 ).getColorFilter ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getColorFilter()Landroid/graphics/ColorFilter;
		 } // :cond_0
	 } // .end method
	 public android.graphics.drawable.Drawable getCurrent ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( android.graphics.drawable.Drawable ) v0 ).getCurrent ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;
		 } // :cond_0
		 /* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable; */
	 } // .end method
	 public Integer getMinimumHeight ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = 			 (( android.graphics.drawable.Drawable ) v0 ).getMinimumHeight ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I
		 } // :cond_0
		 v0 = 		 /* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I */
	 } // .end method
	 public Integer getMinimumWidth ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = 			 (( android.graphics.drawable.Drawable ) v0 ).getMinimumWidth ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I
		 } // :cond_0
		 v0 = 		 /* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I */
	 } // .end method
	 public Boolean getPadding ( android.graphics.Rect p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 p1 = 			 (( android.graphics.drawable.Drawable ) v0 ).getPadding ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
		 } // :cond_0
		 p1 = 		 /* invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z */
	 } // .end method
	 public getState ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( android.graphics.drawable.Drawable ) v0 ).getState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getState()[I
		 } // :cond_0
		 /* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getState()[I */
	 } // .end method
	 public android.graphics.Region getTransparentRegion ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( android.graphics.drawable.Drawable ) v0 ).getTransparentRegion ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getTransparentRegion()Landroid/graphics/Region;
		 } // :cond_0
		 /* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getTransparentRegion()Landroid/graphics/Region; */
	 } // .end method
	 public void jumpToCurrentState ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( android.graphics.drawable.Drawable ) v0 ).jumpToCurrentState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
		 } // :cond_0
		 return;
	 } // .end method
	 protected void onBoundsChange ( android.graphics.Rect p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( android.graphics.drawable.Drawable ) v0 ).setBounds ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V
			 return;
		 } // :cond_0
		 /* invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V */
		 return;
	 } // .end method
	 protected Boolean onLevelChange ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 p1 = 			 (( android.graphics.drawable.Drawable ) v0 ).setLevel ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
		 } // :cond_0
		 p1 = 		 /* invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onLevelChange(I)Z */
	 } // .end method
	 public void setChangingConfigurations ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( android.graphics.drawable.Drawable ) v0 ).setChangingConfigurations ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V
			 return;
		 } // :cond_0
		 /* invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V */
		 return;
	 } // .end method
	 public void setColorFilter ( Integer p0, android.graphics.PorterDuff$Mode p1 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( android.graphics.drawable.Drawable ) v0 ).setColorFilter ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V
			 return;
		 } // :cond_0
		 /* invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V */
		 return;
	 } // .end method
	 public void setFilterBitmap ( Boolean p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( android.graphics.drawable.Drawable ) v0 ).setFilterBitmap ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setFilterBitmap(Z)V
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
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 cx .a ( v0,p1,p2,p3,p4 );
		 } // :cond_0
		 return;
	 } // .end method
	 public Boolean setState ( Integer[] p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 p1 = 			 (( android.graphics.drawable.Drawable ) v0 ).setState ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
		 } // :cond_0
		 p1 = 		 /* invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z */
	 } // .end method
