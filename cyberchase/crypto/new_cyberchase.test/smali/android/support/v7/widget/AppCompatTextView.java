public class android.support.v7.widget.AppCompatTextView extends android.widget.TextView implements el implements fb {
	 /* # interfaces */
	 /* # instance fields */
	 private final hs a;
	 private final hz a;
	 private java.util.concurrent.Future a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/concurrent/Future<", */
	 /* "Ldi;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public android.support.v7.widget.AppCompatTextView ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
return;
} // .end method
public android.support.v7.widget.AppCompatTextView ( ) {
/* .locals 1 */
/* const v0, 0x1010084 */
/* invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
return;
} // .end method
public android.support.v7.widget.AppCompatTextView ( ) {
/* .locals 0 */
im .a ( p1 );
/* invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
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
private void a ( ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
	 int v1 = 0; // const/4 v1, 0x0
	 try { // :try_start_0
		 this.a = v1;
		 /* check-cast v0, Ldi; */
		 fn .a ( p0,v0 );
		 /* :try_end_0 */
		 /* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
	 } // :cond_0
	 return;
} // .end method
/* # virtual methods */
protected void drawableStateChanged ( ) {
	 /* .locals 1 */
	 /* invoke-super {p0}, Landroid/widget/TextView;->drawableStateChanged()V */
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
	 /* sget-boolean v0, Landroid/support/v7/widget/AppCompatTextView;->a:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = 		 /* invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMaxTextSize()I */
	 } // :cond_0
	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 v0 = this.a;
		 /* iget v0, v0, Lia;->c:F */
		 v0 = 		 java.lang.Math .round ( v0 );
	 } // :cond_1
	 int v0 = -1; // const/4 v0, -0x1
} // .end method
public Integer getAutoSizeMinTextSize ( ) {
	 /* .locals 1 */
	 /* sget-boolean v0, Landroid/support/v7/widget/AppCompatTextView;->a:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = 		 /* invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMinTextSize()I */
	 } // :cond_0
	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 v0 = this.a;
		 /* iget v0, v0, Lia;->b:F */
		 v0 = 		 java.lang.Math .round ( v0 );
	 } // :cond_1
	 int v0 = -1; // const/4 v0, -0x1
} // .end method
public Integer getAutoSizeStepGranularity ( ) {
	 /* .locals 1 */
	 /* sget-boolean v0, Landroid/support/v7/widget/AppCompatTextView;->a:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = 		 /* invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I */
	 } // :cond_0
	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 v0 = this.a;
		 /* iget v0, v0, Lia;->a:F */
		 v0 = 		 java.lang.Math .round ( v0 );
	 } // :cond_1
	 int v0 = -1; // const/4 v0, -0x1
} // .end method
public getAutoSizeTextAvailableSizes ( ) {
	 /* .locals 1 */
	 /* sget-boolean v0, Landroid/support/v7/widget/AppCompatTextView;->a:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextAvailableSizes()[I */
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
	 /* sget-boolean v0, Landroid/support/v7/widget/AppCompatTextView;->a:Z */
	 int v1 = 0; // const/4 v1, 0x0
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 v0 = 		 /* invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextType()I */
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
public Integer getFirstBaselineToTopHeight ( ) {
/* .locals 2 */
v0 = (( android.widget.TextView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingTop()I
(( android.widget.TextView ) p0 ).getPaint ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;
(( android.text.TextPaint ) v1 ).getFontMetricsInt ( ); // invoke-virtual {v1}, Landroid/text/TextPaint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;
/* iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->top:I */
/* sub-int/2addr v0, v1 */
} // .end method
public Integer getLastBaselineToBottomHeight ( ) {
/* .locals 2 */
v0 = (( android.widget.TextView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingBottom()I
(( android.widget.TextView ) p0 ).getPaint ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;
(( android.text.TextPaint ) v1 ).getFontMetricsInt ( ); // invoke-virtual {v1}, Landroid/text/TextPaint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;
/* iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I */
/* add-int/2addr v0, v1 */
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
public java.lang.CharSequence getText ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/support/v7/widget/AppCompatTextView;->a()V */
/* invoke-super {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence; */
} // .end method
public di$a getTextMetricsParamsCompat ( ) {
/* .locals 1 */
fn .a ( p0 );
} // .end method
public android.view.inputmethod.InputConnection onCreateInputConnection ( android.view.inputmethod.EditorInfo p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Landroid/widget/TextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection; */
hv .a ( v0,p1,p0 );
} // .end method
protected void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
/* invoke-super/range {p0 ..p5}, Landroid/widget/TextView;->onLayout(ZIIII)V */
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_0
	 (( hz ) p1 ).b ( ); // invoke-virtual {p1}, Lhz;->b()V
} // :cond_0
return;
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* invoke-direct {p0}, Landroid/support/v7/widget/AppCompatTextView;->a()V */
/* invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V */
return;
} // .end method
protected void onTextChanged ( java.lang.CharSequence p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onTextChanged(Ljava/lang/CharSequence;III)V */
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* sget-boolean p1, Landroid/support/v7/widget/AppCompatTextView;->a:Z */
	 /* if-nez p1, :cond_0 */
	 p1 = this.a;
	 p1 = this.a;
	 p1 = 	 (( ia ) p1 ).a ( ); // invoke-virtual {p1}, Lia;->a()Z
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 p1 = this.a;
		 p1 = this.a;
		 (( ia ) p1 ).a ( ); // invoke-virtual {p1}, Lia;->a()V
	 } // :cond_0
	 return;
} // .end method
public void setAutoSizeTextTypeUniformWithConfiguration ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
	 /* .locals 1 */
	 /* sget-boolean v0, Landroid/support/v7/widget/AppCompatTextView;->a:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V */
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
	 /* sget-boolean v0, Landroid/support/v7/widget/AppCompatTextView;->a:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithPresetSizes([II)V */
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
	 /* sget-boolean v0, Landroid/support/v7/widget/AppCompatTextView;->a:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* invoke-super {p0, p1}, Landroid/widget/TextView;->setAutoSizeTextTypeWithDefaults(I)V */
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
	 /* invoke-super {p0, p1}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V */
	 p1 = this.a;
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 (( hs ) p1 ).a ( ); // invoke-virtual {p1}, Lhs;->a()V
	 } // :cond_0
	 return;
} // .end method
public void setBackgroundResource ( Integer p0 ) {
	 /* .locals 1 */
	 /* invoke-super {p0, p1}, Landroid/widget/TextView;->setBackgroundResource(I)V */
	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 (( hs ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lhs;->a(I)V
	 } // :cond_0
	 return;
} // .end method
public void setCustomSelectionActionModeCallback ( android.view.ActionMode$Callback p0 ) {
	 /* .locals 0 */
	 fn .a ( p0,p1 );
	 /* invoke-super {p0, p1}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V */
	 return;
} // .end method
public void setFirstBaselineToTopHeight ( Integer p0 ) {
	 /* .locals 2 */
	 /* const/16 v1, 0x1c */
	 /* if-lt v0, v1, :cond_0 */
	 /* invoke-super {p0, p1}, Landroid/widget/TextView;->setFirstBaselineToTopHeight(I)V */
	 return;
} // :cond_0
fn .b ( p0,p1 );
return;
} // .end method
public void setLastBaselineToBottomHeight ( Integer p0 ) {
/* .locals 2 */
/* const/16 v1, 0x1c */
/* if-lt v0, v1, :cond_0 */
/* invoke-super {p0, p1}, Landroid/widget/TextView;->setLastBaselineToBottomHeight(I)V */
return;
} // :cond_0
fn .c ( p0,p1 );
return;
} // .end method
public void setLineHeight ( Integer p0 ) {
/* .locals 0 */
fn .d ( p0,p1 );
return;
} // .end method
public void setPrecomputedText ( di p0 ) {
/* .locals 0 */
fn .a ( p0,p1 );
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
/* invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( hz ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lhz;->a(Landroid/content/Context;I)V
} // :cond_0
return;
} // .end method
public void setTextFuture ( java.util.concurrent.Future p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/concurrent/Future<", */
/* "Ldi;", */
/* ">;)V" */
/* } */
} // .end annotation
this.a = p1;
(( android.support.v7.widget.AppCompatTextView ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AppCompatTextView;->requestLayout()V
return;
} // .end method
public void setTextMetricsParamsCompat ( di$a p0 ) {
/* .locals 2 */
/* const/16 v1, 0x12 */
/* if-lt v0, v1, :cond_6 */
v0 = this.a;
v1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
/* if-eq v0, v1, :cond_5 */
v1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
/* if-eq v0, v1, :cond_5 */
v1 = android.text.TextDirectionHeuristics.ANYRTL_LTR;
/* if-ne v0, v1, :cond_0 */
int v0 = 2; // const/4 v0, 0x2
} // :cond_0
v1 = android.text.TextDirectionHeuristics.LTR;
/* if-ne v0, v1, :cond_1 */
int v0 = 3; // const/4 v0, 0x3
} // :cond_1
v1 = android.text.TextDirectionHeuristics.RTL;
/* if-ne v0, v1, :cond_2 */
int v0 = 4; // const/4 v0, 0x4
} // :cond_2
v1 = android.text.TextDirectionHeuristics.LOCALE;
/* if-ne v0, v1, :cond_3 */
int v0 = 5; // const/4 v0, 0x5
} // :cond_3
v1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
/* if-ne v0, v1, :cond_4 */
int v0 = 6; // const/4 v0, 0x6
} // :cond_4
v1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
/* if-ne v0, v1, :cond_5 */
int v0 = 7; // const/4 v0, 0x7
} // :cond_5
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
(( android.widget.TextView ) p0 ).setTextDirection ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextDirection(I)V
} // :cond_6
/* const/16 v1, 0x17 */
/* if-ge v0, v1, :cond_8 */
v0 = this.a;
v0 = (( android.text.TextPaint ) v0 ).getTextScaleX ( ); // invoke-virtual {v0}, Landroid/text/TextPaint;->getTextScaleX()F
(( android.widget.TextView ) p0 ).getPaint ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;
p1 = this.a;
(( android.text.TextPaint ) v1 ).set ( p1 ); // invoke-virtual {v1, p1}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V
p1 = (( android.widget.TextView ) p0 ).getTextScaleX ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getTextScaleX()F
/* cmpl-float p1, v0, p1 */
/* if-nez p1, :cond_7 */
/* const/high16 p1, 0x40000000 # 2.0f */
/* div-float p1, v0, p1 */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* add-float/2addr p1, v1 */
(( android.widget.TextView ) p0 ).setTextScaleX ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextScaleX(F)V
} // :cond_7
(( android.widget.TextView ) p0 ).setTextScaleX ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextScaleX(F)V
return;
} // :cond_8
(( android.widget.TextView ) p0 ).getPaint ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;
v1 = this.a;
(( android.text.TextPaint ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V
/* iget v0, p1, Ldi$a;->a:I */
(( android.widget.TextView ) p0 ).setBreakStrategy ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/TextView;->setBreakStrategy(I)V
/* iget p1, p1, Ldi$a;->b:I */
(( android.widget.TextView ) p0 ).setHyphenationFrequency ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/TextView;->setHyphenationFrequency(I)V
return;
} // .end method
public void setTextSize ( Integer p0, Float p1 ) {
/* .locals 1 */
/* sget-boolean v0, Landroid/support/v7/widget/AppCompatTextView;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V */
return;
} // :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
(( hz ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lhz;->a(IF)V
} // :cond_1
return;
} // .end method
