public class android.support.v7.widget.AppCompatImageView extends android.widget.ImageView implements el implements fp {
	 /* # interfaces */
	 /* # instance fields */
	 private final hs a;
	 private final hw a;
	 /* # direct methods */
	 public android.support.v7.widget.AppCompatImageView ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.AppCompatImageView ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.AppCompatImageView ( ) {
		 /* .locals 0 */
		 im .a ( p1 );
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* new-instance p1, Lhs; */
		 /* invoke-direct {p1, p0}, Lhs;-><init>(Landroid/view/View;)V */
		 this.a = p1;
		 p1 = this.a;
		 (( hs ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lhs;->a(Landroid/util/AttributeSet;I)V
		 /* new-instance p1, Lhw; */
		 /* invoke-direct {p1, p0}, Lhw;-><init>(Landroid/widget/ImageView;)V */
		 this.a = p1;
		 p1 = this.a;
		 (( hw ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lhw;->a(Landroid/util/AttributeSet;I)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void drawableStateChanged ( ) {
		 /* .locals 1 */
		 /* invoke-super {p0}, Landroid/widget/ImageView;->drawableStateChanged()V */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( hs ) v0 ).b ( ); // invoke-virtual {v0}, Lhs;->b()V
		 } // :cond_0
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 (( hw ) v0 ).a ( ); // invoke-virtual {v0}, Lhw;->a()V
		 } // :cond_1
		 return;
	 } // .end method
	 public android.content.res.ColorStateList getSupportBackgroundTintList ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( hs ) v0 ).a ( ); // invoke-virtual {v0}, Lhs;->a()Landroid/content/res/ColorStateList;
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public android.graphics.PorterDuff$Mode getSupportBackgroundTintMode ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( hs ) v0 ).a ( ); // invoke-virtual {v0}, Lhs;->a()Landroid/graphics/PorterDuff$Mode;
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public android.content.res.ColorStateList getSupportImageTintList ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( hw ) v0 ).a ( ); // invoke-virtual {v0}, Lhw;->a()Landroid/content/res/ColorStateList;
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public android.graphics.PorterDuff$Mode getSupportImageTintMode ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( hw ) v0 ).a ( ); // invoke-virtual {v0}, Lhw;->a()Landroid/graphics/PorterDuff$Mode;
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public Boolean hasOverlappingRendering ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 v0 = 		 (( hw ) v0 ).a ( ); // invoke-virtual {v0}, Lhw;->a()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = 			 /* invoke-super {p0}, Landroid/widget/ImageView;->hasOverlappingRendering()Z */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 int v0 = 1; // const/4 v0, 0x1
			 } // :cond_0
			 int v0 = 0; // const/4 v0, 0x0
		 } // .end method
		 public void setBackgroundDrawable ( android.graphics.drawable.Drawable p0 ) {
			 /* .locals 0 */
			 /* invoke-super {p0, p1}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V */
			 p1 = this.a;
			 if ( p1 != null) { // if-eqz p1, :cond_0
				 (( hs ) p1 ).a ( ); // invoke-virtual {p1}, Lhs;->a()V
			 } // :cond_0
			 return;
		 } // .end method
		 public void setBackgroundResource ( Integer p0 ) {
			 /* .locals 1 */
			 /* invoke-super {p0, p1}, Landroid/widget/ImageView;->setBackgroundResource(I)V */
			 v0 = this.a;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 (( hs ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lhs;->a(I)V
			 } // :cond_0
			 return;
		 } // .end method
		 public void setImageBitmap ( android.graphics.Bitmap p0 ) {
			 /* .locals 0 */
			 /* invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V */
			 p1 = this.a;
			 if ( p1 != null) { // if-eqz p1, :cond_0
				 (( hw ) p1 ).a ( ); // invoke-virtual {p1}, Lhw;->a()V
			 } // :cond_0
			 return;
		 } // .end method
		 public void setImageDrawable ( android.graphics.drawable.Drawable p0 ) {
			 /* .locals 0 */
			 /* invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V */
			 p1 = this.a;
			 if ( p1 != null) { // if-eqz p1, :cond_0
				 (( hw ) p1 ).a ( ); // invoke-virtual {p1}, Lhw;->a()V
			 } // :cond_0
			 return;
		 } // .end method
		 public void setImageResource ( Integer p0 ) {
			 /* .locals 1 */
			 v0 = this.a;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 (( hw ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lhw;->a(I)V
			 } // :cond_0
			 return;
		 } // .end method
		 public void setImageURI ( android.net.Uri p0 ) {
			 /* .locals 0 */
			 /* invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V */
			 p1 = this.a;
			 if ( p1 != null) { // if-eqz p1, :cond_0
				 (( hw ) p1 ).a ( ); // invoke-virtual {p1}, Lhw;->a()V
			 } // :cond_0
			 return;
		 } // .end method
		 public void setSupportBackgroundTintList ( android.content.res.ColorStateList p0 ) {
			 /* .locals 1 */
			 v0 = this.a;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 (( hs ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lhs;->a(Landroid/content/res/ColorStateList;)V
			 } // :cond_0
			 return;
		 } // .end method
		 public void setSupportBackgroundTintMode ( android.graphics.PorterDuff$Mode p0 ) {
			 /* .locals 1 */
			 v0 = this.a;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 (( hs ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lhs;->a(Landroid/graphics/PorterDuff$Mode;)V
			 } // :cond_0
			 return;
		 } // .end method
		 public void setSupportImageTintList ( android.content.res.ColorStateList p0 ) {
			 /* .locals 1 */
			 v0 = this.a;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 (( hw ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lhw;->a(Landroid/content/res/ColorStateList;)V
			 } // :cond_0
			 return;
		 } // .end method
		 public void setSupportImageTintMode ( android.graphics.PorterDuff$Mode p0 ) {
			 /* .locals 1 */
			 v0 = this.a;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 (( hw ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lhw;->a(Landroid/graphics/PorterDuff$Mode;)V
			 } // :cond_0
			 return;
		 } // .end method
