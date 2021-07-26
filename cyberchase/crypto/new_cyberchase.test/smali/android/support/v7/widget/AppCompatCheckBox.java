public class android.support.v7.widget.AppCompatCheckBox extends android.widget.CheckBox implements fo {
	 /* # interfaces */
	 /* # instance fields */
	 private final ht a;
	 /* # direct methods */
	 public android.support.v7.widget.AppCompatCheckBox ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/AppCompatCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.AppCompatCheckBox ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/AppCompatCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.AppCompatCheckBox ( ) {
		 /* .locals 0 */
		 im .a ( p1 );
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* new-instance p1, Lht; */
		 /* invoke-direct {p1, p0}, Lht;-><init>(Landroid/widget/CompoundButton;)V */
		 this.a = p1;
		 p1 = this.a;
		 (( ht ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lht;->a(Landroid/util/AttributeSet;I)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer getCompoundPaddingLeft ( ) {
		 /* .locals 2 */
		 v0 = 		 /* invoke-super {p0}, Landroid/widget/CheckBox;->getCompoundPaddingLeft()I */
		 v1 = this.a;
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 v0 = 			 (( ht ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lht;->a(I)I
		 } // :cond_0
	 } // .end method
	 public android.content.res.ColorStateList getSupportButtonTintList ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.a;
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public android.graphics.PorterDuff$Mode getSupportButtonTintMode ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.a;
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public void setButtonDrawable ( Integer p0 ) {
		 /* .locals 1 */
		 (( android.support.v7.widget.AppCompatCheckBox ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AppCompatCheckBox;->getContext()Landroid/content/Context;
		 gd .a ( v0,p1 );
		 (( android.support.v7.widget.AppCompatCheckBox ) p0 ).setButtonDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/AppCompatCheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
		 return;
	 } // .end method
	 public void setButtonDrawable ( android.graphics.drawable.Drawable p0 ) {
		 /* .locals 0 */
		 /* invoke-super {p0, p1}, Landroid/widget/CheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V */
		 p1 = this.a;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 (( ht ) p1 ).a ( ); // invoke-virtual {p1}, Lht;->a()V
		 } // :cond_0
		 return;
	 } // .end method
	 public void setSupportButtonTintList ( android.content.res.ColorStateList p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( ht ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lht;->a(Landroid/content/res/ColorStateList;)V
		 } // :cond_0
		 return;
	 } // .end method
	 public void setSupportButtonTintMode ( android.graphics.PorterDuff$Mode p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( ht ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lht;->a(Landroid/graphics/PorterDuff$Mode;)V
		 } // :cond_0
		 return;
	 } // .end method
