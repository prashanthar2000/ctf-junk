public class android.support.v7.widget.AppCompatEditText extends android.widget.EditText implements el {
	 /* # interfaces */
	 /* # instance fields */
	 private final hs a;
	 private final hz a;
	 /* # direct methods */
	 public android.support.v7.widget.AppCompatEditText ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/AppCompatEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.AppCompatEditText ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/AppCompatEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.AppCompatEditText ( ) {
		 /* .locals 0 */
		 im .a ( p1 );
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* new-instance p1, Lhs; */
		 /* invoke-direct {p1, p0}, Lhs;-><init>(Landroid/view/View;)V */
		 this.a = p1;
		 p1 = this.a;
		 (( hs ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lhs;->a(Landroid/util/AttributeSet;I)V
		 /* new-instance p1, Lhz; */
		 /* invoke-direct {p1, p0}, Lhz;-><init>(Landroid/widget/TextView;)V */
		 this.a = p1;
		 p1 = this.a;
		 (( hz ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lhz;->a(Landroid/util/AttributeSet;I)V
		 p1 = this.a;
		 (( hz ) p1 ).a ( ); // invoke-virtual {p1}, Lhz;->a()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void drawableStateChanged ( ) {
		 /* .locals 1 */
		 /* invoke-super {p0}, Landroid/widget/EditText;->drawableStateChanged()V */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( hs ) v0 ).b ( ); // invoke-virtual {v0}, Lhs;->b()V
		 } // :cond_0
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 (( hz ) v0 ).a ( ); // invoke-virtual {v0}, Lhz;->a()V
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
	 public android.text.Editable getText ( ) {
		 /* .locals 2 */
		 /* const/16 v1, 0x1c */
		 /* if-lt v0, v1, :cond_0 */
		 /* invoke-super {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable; */
	 } // :cond_0
	 /* invoke-super {p0}, Landroid/widget/EditText;->getEditableText()Landroid/text/Editable; */
} // .end method
public java.lang.CharSequence getText ( ) { //bridge//synthethic
	 /* .locals 1 */
	 (( android.support.v7.widget.AppCompatEditText ) p0 ).getText ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AppCompatEditText;->getText()Landroid/text/Editable;
} // .end method
public android.view.inputmethod.InputConnection onCreateInputConnection ( android.view.inputmethod.EditorInfo p0 ) {
	 /* .locals 1 */
	 /* invoke-super {p0, p1}, Landroid/widget/EditText;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection; */
	 hv .a ( v0,p1,p0 );
} // .end method
public void setBackgroundDrawable ( android.graphics.drawable.Drawable p0 ) {
	 /* .locals 0 */
	 /* invoke-super {p0, p1}, Landroid/widget/EditText;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V */
	 p1 = this.a;
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 (( hs ) p1 ).a ( ); // invoke-virtual {p1}, Lhs;->a()V
	 } // :cond_0
	 return;
} // .end method
public void setBackgroundResource ( Integer p0 ) {
	 /* .locals 1 */
	 /* invoke-super {p0, p1}, Landroid/widget/EditText;->setBackgroundResource(I)V */
	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 (( hs ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lhs;->a(I)V
	 } // :cond_0
	 return;
} // .end method
public void setCustomSelectionActionModeCallback ( android.view.ActionMode$Callback p0 ) {
	 /* .locals 0 */
	 fn .a ( p0,p1 );
	 /* invoke-super {p0, p1}, Landroid/widget/EditText;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V */
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
public void setTextAppearance ( android.content.Context p0, Integer p1 ) {
	 /* .locals 1 */
	 /* invoke-super {p0, p1, p2}, Landroid/widget/EditText;->setTextAppearance(Landroid/content/Context;I)V */
	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 (( hz ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lhz;->a(Landroid/content/Context;I)V
	 } // :cond_0
	 return;
} // .end method
