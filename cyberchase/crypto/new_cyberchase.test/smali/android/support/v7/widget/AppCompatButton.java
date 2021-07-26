public class android.support.v7.widget.AppCompatButton extends android.widget.Button implements el implements fb {
	 /* # interfaces */
	 /* # instance fields */
	 private final hs a;
	 private final hz a;
	 /* # direct methods */
	 public android.support.v7.widget.AppCompatButton ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/AppCompatButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.AppCompatButton ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/AppCompatButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.AppCompatButton ( ) {
		 /* .locals 0 */
		 im .a ( p1 );
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
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
		 /* invoke-super {p0}, Landroid/widget/Button;->drawableStateChanged()V */
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
	 public Integer getAutoSizeMaxTextSize ( ) {
		 /* .locals 1 */
		 /* sget-boolean v0, Landroid/support/v7/widget/AppCompatButton;->a:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = 			 /* invoke-super {p0}, Landroid/widget/Button;->getAutoSizeMaxTextSize()I */
		 } // :cond_0
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 v0 = this.a;
			 /* iget v0, v0, Lia;->c:F */
			 v0 = 			 java.lang.Math .round ( v0 );
		 } // :cond_1
		 int v0 = -1; // const/4 v0, -0x1
	 } // .end method
	 public Integer getAutoSizeMinTextSize ( ) {
		 /* .locals 1 */
		 /* sget-boolean v0, Landroid/support/v7/widget/AppCompatButton;->a:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = 			 /* invoke-super {p0}, Landroid/widget/Button;->getAutoSizeMinTextSize()I */
		 } // :cond_0
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 v0 = this.a;
			 /* iget v0, v0, Lia;->b:F */
			 v0 = 			 java.lang.Math .round ( v0 );
		 } // :cond_1
		 int v0 = -1; // const/4 v0, -0x1
	 } // .end method
	 public Integer getAutoSizeStepGranularity ( ) {
		 /* .locals 1 */
		 /* sget-boolean v0, Landroid/support/v7/widget/AppCompatButton;->a:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = 			 /* invoke-super {p0}, Landroid/widget/Button;->getAutoSizeStepGranularity()I */
		 } // :cond_0
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 v0 = this.a;
			 /* iget v0, v0, Lia;->a:F */
			 v0 = 			 java.lang.Math .round ( v0 );
		 } // :cond_1
		 int v0 = -1; // const/4 v0, -0x1
	 } // .end method
	 public getAutoSizeTextAvailableSizes ( ) {
		 /* .locals 1 */
		 /* sget-boolean v0, Landroid/support/v7/widget/AppCompatButton;->a:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* invoke-super {p0}, Landroid/widget/Button;->getAutoSizeTextAvailableSizes()[I */
		 } // :cond_0
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 v0 = this.a;
			 v0 = this.a;
		 } // :cond_1
		 int v0 = 0; // const/4 v0, 0x0
		 /* new-array v0, v0, [I */
	 } // .end method
	 public Integer getAutoSizeTextType ( ) {
		 /* .locals 3 */
		 /* sget-boolean v0, Landroid/support/v7/widget/AppCompatButton;->a:Z */
		 int v1 = 0; // const/4 v1, 0x0
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 v0 = 			 /* invoke-super {p0}, Landroid/widget/Button;->getAutoSizeTextType()I */
			 int v2 = 1; // const/4 v2, 0x1
			 /* if-ne v0, v2, :cond_0 */
		 } // :cond_0
	 } // :cond_1
	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 v0 = this.a;
		 /* iget v0, v0, Lia;->a:I */
	 } // :cond_2
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
public void onInitializeAccessibilityEvent ( android.view.accessibility.AccessibilityEvent p0 ) {
	 /* .locals 1 */
	 /* invoke-super {p0, p1}, Landroid/widget/Button;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V */
	 /* const-class v0, Landroid/widget/Button; */
	 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
	 (( android.view.accessibility.AccessibilityEvent ) p1 ).setClassName ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V
	 return;
} // .end method
public void onInitializeAccessibilityNodeInfo ( android.view.accessibility.AccessibilityNodeInfo p0 ) {
	 /* .locals 1 */
	 /* invoke-super {p0, p1}, Landroid/widget/Button;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V */
	 /* const-class v0, Landroid/widget/Button; */
	 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
	 (( android.view.accessibility.AccessibilityNodeInfo ) p1 ).setClassName ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V
	 return;
} // .end method
protected void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
	 /* .locals 0 */
	 /* invoke-super/range {p0 ..p5}, Landroid/widget/Button;->onLayout(ZIIII)V */
	 p1 = this.a;
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 (( hz ) p1 ).b ( ); // invoke-virtual {p1}, Lhz;->b()V
	 } // :cond_0
	 return;
} // .end method
protected void onTextChanged ( java.lang.CharSequence p0, Integer p1, Integer p2, Integer p3 ) {
	 /* .locals 0 */
	 /* invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/Button;->onTextChanged(Ljava/lang/CharSequence;III)V */
	 p1 = this.a;
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* sget-boolean p1, Landroid/support/v7/widget/AppCompatButton;->a:Z */
		 /* if-nez p1, :cond_0 */
		 p1 = this.a;
		 p1 = this.a;
		 p1 = 		 (( ia ) p1 ).a ( ); // invoke-virtual {p1}, Lia;->a()Z
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 p1 = this.a;
			 p1 = this.a;
			 (( ia ) p1 ).a ( ); // invoke-virtual {p1}, Lia;->a()V
		 } // :cond_0
		 return;
	 } // .end method
	 public void setAutoSizeTextTypeUniformWithConfiguration ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 1 */
		 /* sget-boolean v0, Landroid/support/v7/widget/AppCompatButton;->a:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/Button;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V */
			 return;
		 } // :cond_0
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 (( hz ) v0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Lhz;->a(IIII)V
		 } // :cond_1
		 return;
	 } // .end method
	 public void setAutoSizeTextTypeUniformWithPresetSizes ( Integer[] p0, Integer p1 ) {
		 /* .locals 1 */
		 /* sget-boolean v0, Landroid/support/v7/widget/AppCompatButton;->a:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* invoke-super {p0, p1, p2}, Landroid/widget/Button;->setAutoSizeTextTypeUniformWithPresetSizes([II)V */
			 return;
		 } // :cond_0
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 (( hz ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lhz;->a([II)V
		 } // :cond_1
		 return;
	 } // .end method
	 public void setAutoSizeTextTypeWithDefaults ( Integer p0 ) {
		 /* .locals 1 */
		 /* sget-boolean v0, Landroid/support/v7/widget/AppCompatButton;->a:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* invoke-super {p0, p1}, Landroid/widget/Button;->setAutoSizeTextTypeWithDefaults(I)V */
			 return;
		 } // :cond_0
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 (( hz ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lhz;->a(I)V
		 } // :cond_1
		 return;
	 } // .end method
	 public void setBackgroundDrawable ( android.graphics.drawable.Drawable p0 ) {
		 /* .locals 0 */
		 /* invoke-super {p0, p1}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V */
		 p1 = this.a;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 (( hs ) p1 ).a ( ); // invoke-virtual {p1}, Lhs;->a()V
		 } // :cond_0
		 return;
	 } // .end method
	 public void setBackgroundResource ( Integer p0 ) {
		 /* .locals 1 */
		 /* invoke-super {p0, p1}, Landroid/widget/Button;->setBackgroundResource(I)V */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( hs ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lhs;->a(I)V
		 } // :cond_0
		 return;
	 } // .end method
	 public void setCustomSelectionActionModeCallback ( android.view.ActionMode$Callback p0 ) {
		 /* .locals 0 */
		 fn .a ( p0,p1 );
		 /* invoke-super {p0, p1}, Landroid/widget/Button;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V */
		 return;
	 } // .end method
	 public void setSupportAllCaps ( Boolean p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( hz ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lhz;->a(Z)V
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
	 public void setTextAppearance ( android.content.Context p0, Integer p1 ) {
		 /* .locals 1 */
		 /* invoke-super {p0, p1, p2}, Landroid/widget/Button;->setTextAppearance(Landroid/content/Context;I)V */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( hz ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lhz;->a(Landroid/content/Context;I)V
		 } // :cond_0
		 return;
	 } // .end method
	 public void setTextSize ( Integer p0, Float p1 ) {
		 /* .locals 1 */
		 /* sget-boolean v0, Landroid/support/v7/widget/AppCompatButton;->a:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* invoke-super {p0, p1, p2}, Landroid/widget/Button;->setTextSize(IF)V */
			 return;
		 } // :cond_0
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 (( hz ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lhz;->a(IF)V
		 } // :cond_1
		 return;
	 } // .end method
