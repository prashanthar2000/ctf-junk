public class android.support.v7.widget.AppCompatCheckedTextView extends android.widget.CheckedTextView {
	 /* # static fields */
	 private static final a;
	 /* # instance fields */
	 private final hz a;
	 /* # direct methods */
	 static android.support.v7.widget.AppCompatCheckedTextView ( ) {
		 /* .locals 3 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [I */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const v2, 0x1010108 */
		 /* aput v2, v0, v1 */
		 return;
	 } // .end method
	 public android.support.v7.widget.AppCompatCheckedTextView ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/AppCompatCheckedTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.AppCompatCheckedTextView ( ) {
		 /* .locals 1 */
		 /* const v0, 0x10103c8 */
		 /* invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/AppCompatCheckedTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.AppCompatCheckedTextView ( ) {
		 /* .locals 2 */
		 im .a ( p1 );
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/CheckedTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* new-instance p1, Lhz; */
		 /* invoke-direct {p1, p0}, Lhz;-><init>(Landroid/widget/TextView;)V */
		 this.a = p1;
		 p1 = this.a;
		 (( hz ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lhz;->a(Landroid/util/AttributeSet;I)V
		 p1 = this.a;
		 (( hz ) p1 ).a ( ); // invoke-virtual {p1}, Lhz;->a()V
		 (( android.support.v7.widget.AppCompatCheckedTextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AppCompatCheckedTextView;->getContext()Landroid/content/Context;
		 v0 = android.support.v7.widget.AppCompatCheckedTextView.a;
		 int v1 = 0; // const/4 v1, 0x0
		 ip .a ( p1,p2,v0,p3,v1 );
		 (( ip ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lip;->a(I)Landroid/graphics/drawable/Drawable;
		 (( android.support.v7.widget.AppCompatCheckedTextView ) p0 ).setCheckMarkDrawable ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/widget/AppCompatCheckedTextView;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V
		 p1 = this.a;
		 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void drawableStateChanged ( ) {
		 /* .locals 1 */
		 /* invoke-super {p0}, Landroid/widget/CheckedTextView;->drawableStateChanged()V */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( hz ) v0 ).a ( ); // invoke-virtual {v0}, Lhz;->a()V
		 } // :cond_0
		 return;
	 } // .end method
	 public android.view.inputmethod.InputConnection onCreateInputConnection ( android.view.inputmethod.EditorInfo p0 ) {
		 /* .locals 1 */
		 /* invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection; */
		 hv .a ( v0,p1,p0 );
	 } // .end method
	 public void setCheckMarkDrawable ( Integer p0 ) {
		 /* .locals 1 */
		 (( android.support.v7.widget.AppCompatCheckedTextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AppCompatCheckedTextView;->getContext()Landroid/content/Context;
		 gd .a ( v0,p1 );
		 (( android.support.v7.widget.AppCompatCheckedTextView ) p0 ).setCheckMarkDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/AppCompatCheckedTextView;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V
		 return;
	 } // .end method
	 public void setCustomSelectionActionModeCallback ( android.view.ActionMode$Callback p0 ) {
		 /* .locals 0 */
		 fn .a ( p0,p1 );
		 /* invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V */
		 return;
	 } // .end method
	 public void setTextAppearance ( android.content.Context p0, Integer p1 ) {
		 /* .locals 1 */
		 /* invoke-super {p0, p1, p2}, Landroid/widget/CheckedTextView;->setTextAppearance(Landroid/content/Context;I)V */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( hz ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lhz;->a(Landroid/content/Context;I)V
		 } // :cond_0
		 return;
	 } // .end method
