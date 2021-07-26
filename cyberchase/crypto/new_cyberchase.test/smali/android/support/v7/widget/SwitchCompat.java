public class android.support.v7.widget.SwitchCompat extends android.widget.CompoundButton {
	 /* # static fields */
	 private static final android.util.Property a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/util/Property<", */
	 /* "Landroid/support/v7/widget/SwitchCompat;", */
	 /* "Ljava/lang/Float;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private static final a;
/* # instance fields */
Float a;
private Integer a;
android.animation.ObjectAnimator a;
private android.content.res.ColorStateList a;
private android.graphics.PorterDuff$Mode a;
private final android.graphics.Rect a;
private android.graphics.drawable.Drawable a;
private android.text.Layout a;
private final android.text.TextPaint a;
private android.text.method.TransformationMethod a;
private android.view.VelocityTracker a;
private java.lang.CharSequence a;
private Boolean a;
private Float b;
private Integer b;
private android.content.res.ColorStateList b;
private android.graphics.PorterDuff$Mode b;
private android.graphics.drawable.Drawable b;
private android.text.Layout b;
private java.lang.CharSequence b;
private Boolean b;
private Float c;
private Integer c;
private android.content.res.ColorStateList c;
private Boolean c;
private Integer d;
private Boolean d;
private Integer e;
private Boolean e;
private Integer f;
private Boolean f;
private Integer g;
private Integer h;
private Integer i;
private Integer j;
private Integer k;
private Integer l;
private Integer m;
/* # direct methods */
static android.support.v7.widget.SwitchCompat ( ) {
/* .locals 3 */
/* new-instance v0, Landroid/support/v7/widget/SwitchCompat$1; */
/* const-class v1, Ljava/lang/Float; */
final String v2 = "thumbPos"; // const-string v2, "thumbPos"
/* invoke-direct {v0, v1, v2}, Landroid/support/v7/widget/SwitchCompat$1;-><init>(Ljava/lang/Class;Ljava/lang/String;)V */
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [I */
int v1 = 0; // const/4 v1, 0x0
/* const v2, 0x10100a0 */
/* aput v2, v0, v1 */
return;
} // .end method
public android.support.v7.widget.SwitchCompat ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/SwitchCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
return;
} // .end method
public android.support.v7.widget.SwitchCompat ( ) {
/* .locals 1 */
/* invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/SwitchCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
return;
} // .end method
public android.support.v7.widget.SwitchCompat ( ) {
/* .locals 5 */
/* invoke-direct {p0, p1, p2, p3}, Landroid/widget/CompoundButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
this.a = v0;
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Landroid/support/v7/widget/SwitchCompat;->a:Z */
/* iput-boolean v1, p0, Landroid/support/v7/widget/SwitchCompat;->b:Z */
this.b = v0;
this.b = v0;
/* iput-boolean v1, p0, Landroid/support/v7/widget/SwitchCompat;->c:Z */
/* iput-boolean v1, p0, Landroid/support/v7/widget/SwitchCompat;->d:Z */
android.view.VelocityTracker .obtain ( );
this.a = v2;
/* new-instance v2, Landroid/graphics/Rect; */
/* invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V */
this.a = v2;
/* new-instance v2, Landroid/text/TextPaint; */
int v3 = 1; // const/4 v3, 0x1
/* invoke-direct {v2, v3}, Landroid/text/TextPaint;-><init>(I)V */
this.a = v2;
(( android.support.v7.widget.SwitchCompat ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getResources()Landroid/content/res/Resources;
v4 = this.a;
(( android.content.res.Resources ) v2 ).getDisplayMetrics ( ); // invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget v2, v2, Landroid/util/DisplayMetrics;->density:F */
/* iput v2, v4, Landroid/text/TextPaint;->density:F */
v2 = gc$j.SwitchCompat;
ip .a ( p1,p2,v2,p3,v1 );
(( ip ) p2 ).a ( p3 ); // invoke-virtual {p2, p3}, Lip;->a(I)Landroid/graphics/drawable/Drawable;
this.a = p3;
p3 = this.a;
if ( p3 != null) { // if-eqz p3, :cond_0
	 (( android.graphics.drawable.Drawable ) p3 ).setCallback ( p0 ); // invoke-virtual {p3, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
} // :cond_0
(( ip ) p2 ).a ( p3 ); // invoke-virtual {p2, p3}, Lip;->a(I)Landroid/graphics/drawable/Drawable;
this.b = p3;
p3 = this.b;
if ( p3 != null) { // if-eqz p3, :cond_1
	 (( android.graphics.drawable.Drawable ) p3 ).setCallback ( p0 ); // invoke-virtual {p3, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
} // :cond_1
(( ip ) p2 ).a ( p3 ); // invoke-virtual {p2, p3}, Lip;->a(I)Ljava/lang/CharSequence;
this.a = p3;
(( ip ) p2 ).a ( p3 ); // invoke-virtual {p2, p3}, Lip;->a(I)Ljava/lang/CharSequence;
this.b = p3;
p3 = (( ip ) p2 ).a ( p3, v3 ); // invoke-virtual {p2, p3, v3}, Lip;->a(IZ)Z
/* iput-boolean p3, p0, Landroid/support/v7/widget/SwitchCompat;->f:Z */
p3 = (( ip ) p2 ).e ( p3, v1 ); // invoke-virtual {p2, p3, v1}, Lip;->e(II)I
/* iput p3, p0, Landroid/support/v7/widget/SwitchCompat;->a:I */
p3 = (( ip ) p2 ).e ( p3, v1 ); // invoke-virtual {p2, p3, v1}, Lip;->e(II)I
/* iput p3, p0, Landroid/support/v7/widget/SwitchCompat;->b:I */
p3 = (( ip ) p2 ).e ( p3, v1 ); // invoke-virtual {p2, p3, v1}, Lip;->e(II)I
/* iput p3, p0, Landroid/support/v7/widget/SwitchCompat;->c:I */
p3 = (( ip ) p2 ).a ( p3, v1 ); // invoke-virtual {p2, p3, v1}, Lip;->a(IZ)Z
/* iput-boolean p3, p0, Landroid/support/v7/widget/SwitchCompat;->e:Z */
(( ip ) p2 ).a ( p3 ); // invoke-virtual {p2, p3}, Lip;->a(I)Landroid/content/res/ColorStateList;
if ( p3 != null) { // if-eqz p3, :cond_2
	 this.a = p3;
	 /* iput-boolean v3, p0, Landroid/support/v7/widget/SwitchCompat;->a:Z */
} // :cond_2
int v2 = -1; // const/4 v2, -0x1
p3 = (( ip ) p2 ).a ( p3, v2 ); // invoke-virtual {p2, p3, v2}, Lip;->a(II)I
id .a ( p3,v0 );
v4 = this.a;
/* if-eq v4, p3, :cond_3 */
this.a = p3;
/* iput-boolean v3, p0, Landroid/support/v7/widget/SwitchCompat;->b:Z */
} // :cond_3
/* iget-boolean p3, p0, Landroid/support/v7/widget/SwitchCompat;->a:Z */
/* if-nez p3, :cond_4 */
/* iget-boolean p3, p0, Landroid/support/v7/widget/SwitchCompat;->b:Z */
if ( p3 != null) { // if-eqz p3, :cond_5
} // :cond_4
/* invoke-direct {p0}, Landroid/support/v7/widget/SwitchCompat;->b()V */
} // :cond_5
(( ip ) p2 ).a ( p3 ); // invoke-virtual {p2, p3}, Lip;->a(I)Landroid/content/res/ColorStateList;
if ( p3 != null) { // if-eqz p3, :cond_6
this.b = p3;
/* iput-boolean v3, p0, Landroid/support/v7/widget/SwitchCompat;->c:Z */
} // :cond_6
p3 = (( ip ) p2 ).a ( p3, v2 ); // invoke-virtual {p2, p3, v2}, Lip;->a(II)I
id .a ( p3,v0 );
v0 = this.b;
/* if-eq v0, p3, :cond_7 */
this.b = p3;
/* iput-boolean v3, p0, Landroid/support/v7/widget/SwitchCompat;->d:Z */
} // :cond_7
/* iget-boolean p3, p0, Landroid/support/v7/widget/SwitchCompat;->c:Z */
/* if-nez p3, :cond_8 */
/* iget-boolean p3, p0, Landroid/support/v7/widget/SwitchCompat;->d:Z */
if ( p3 != null) { // if-eqz p3, :cond_9
} // :cond_8
/* invoke-direct {p0}, Landroid/support/v7/widget/SwitchCompat;->a()V */
} // :cond_9
p3 = (( ip ) p2 ).g ( p3, v1 ); // invoke-virtual {p2, p3, v1}, Lip;->g(II)I
if ( p3 != null) { // if-eqz p3, :cond_a
(( android.support.v7.widget.SwitchCompat ) p0 ).setSwitchTextAppearance ( p1, p3 ); // invoke-virtual {p0, p1, p3}, Landroid/support/v7/widget/SwitchCompat;->setSwitchTextAppearance(Landroid/content/Context;I)V
} // :cond_a
p2 = this.a;
(( android.content.res.TypedArray ) p2 ).recycle ( ); // invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V
android.view.ViewConfiguration .get ( p1 );
p2 = (( android.view.ViewConfiguration ) p1 ).getScaledTouchSlop ( ); // invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I
/* iput p2, p0, Landroid/support/v7/widget/SwitchCompat;->e:I */
p1 = (( android.view.ViewConfiguration ) p1 ).getScaledMinimumFlingVelocity ( ); // invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I
/* iput p1, p0, Landroid/support/v7/widget/SwitchCompat;->f:I */
(( android.support.v7.widget.SwitchCompat ) p0 ).refreshDrawableState ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->refreshDrawableState()V
p1 = (( android.support.v7.widget.SwitchCompat ) p0 ).isChecked ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->isChecked()Z
(( android.support.v7.widget.SwitchCompat ) p0 ).setChecked ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/SwitchCompat;->setChecked(Z)V
return;
} // .end method
private android.text.Layout a ( java.lang.CharSequence p0 ) {
/* .locals 8 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
/* move-object v1, p1 */
/* new-instance p1, Landroid/text/StaticLayout; */
v2 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_1
v0 = android.text.Layout .getDesiredWidth ( v1,v2 );
/* float-to-double v3, v0 */
java.lang.Math .ceil ( v3,v4 );
/* move-result-wide v3 */
/* double-to-int v0, v3 */
/* move v3, v0 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
v4 = android.text.Layout$Alignment.ALIGN_NORMAL;
/* const/high16 v5, 0x3f800000 # 1.0f */
int v6 = 0; // const/4 v6, 0x0
int v7 = 1; // const/4 v7, 0x1
/* move-object v0, p1 */
/* invoke-direct/range {v0 ..v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V */
} // .end method
private void a ( ) {
/* .locals 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_3
/* iget-boolean v0, p0, Landroid/support/v7/widget/SwitchCompat;->c:Z */
/* if-nez v0, :cond_0 */
/* iget-boolean v0, p0, Landroid/support/v7/widget/SwitchCompat;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
} // :cond_0
v0 = this.b;
(( android.graphics.drawable.Drawable ) v0 ).mutate ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;
this.b = v0;
/* iget-boolean v0, p0, Landroid/support/v7/widget/SwitchCompat;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.b;
v1 = this.b;
cx .a ( v0,v1 );
} // :cond_1
/* iget-boolean v0, p0, Landroid/support/v7/widget/SwitchCompat;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.b;
v1 = this.b;
cx .a ( v0,v1 );
} // :cond_2
v0 = this.b;
v0 = (( android.graphics.drawable.Drawable ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.b;
(( android.support.v7.widget.SwitchCompat ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getDrawableState()[I
(( android.graphics.drawable.Drawable ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
} // :cond_3
return;
} // .end method
private void b ( ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_3
/* iget-boolean v0, p0, Landroid/support/v7/widget/SwitchCompat;->a:Z */
/* if-nez v0, :cond_0 */
/* iget-boolean v0, p0, Landroid/support/v7/widget/SwitchCompat;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
} // :cond_0
v0 = this.a;
(( android.graphics.drawable.Drawable ) v0 ).mutate ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;
this.a = v0;
/* iget-boolean v0, p0, Landroid/support/v7/widget/SwitchCompat;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
v1 = this.a;
cx .a ( v0,v1 );
} // :cond_1
/* iget-boolean v0, p0, Landroid/support/v7/widget/SwitchCompat;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.a;
v1 = this.a;
cx .a ( v0,v1 );
} // :cond_2
v0 = this.a;
v0 = (( android.graphics.drawable.Drawable ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.a;
(( android.support.v7.widget.SwitchCompat ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getDrawableState()[I
(( android.graphics.drawable.Drawable ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
} // :cond_3
return;
} // .end method
private Boolean getTargetCheckedState ( ) {
/* .locals 2 */
/* iget v0, p0, Landroid/support/v7/widget/SwitchCompat;->a:F */
/* const/high16 v1, 0x3f000000 # 0.5f */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
private Integer getThumbOffset ( ) {
/* .locals 2 */
v0 = iv .a ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* const/high16 v0, 0x3f800000 # 1.0f */
/* iget v1, p0, Landroid/support/v7/widget/SwitchCompat;->a:F */
/* sub-float/2addr v0, v1 */
} // :cond_0
/* iget v0, p0, Landroid/support/v7/widget/SwitchCompat;->a:F */
} // :goto_0
v1 = /* invoke-direct {p0}, Landroid/support/v7/widget/SwitchCompat;->getThumbScrollRange()I */
/* int-to-float v1, v1 */
/* mul-float v0, v0, v1 */
/* const/high16 v1, 0x3f000000 # 0.5f */
/* add-float/2addr v0, v1 */
/* float-to-int v0, v0 */
} // .end method
private Integer getThumbScrollRange ( ) {
/* .locals 4 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
v1 = this.a;
(( android.graphics.drawable.Drawable ) v0 ).getPadding ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
id .a ( v0 );
} // :cond_0
v0 = id.a;
} // :goto_0
/* iget v2, p0, Landroid/support/v7/widget/SwitchCompat;->g:I */
/* iget v3, p0, Landroid/support/v7/widget/SwitchCompat;->i:I */
/* sub-int/2addr v2, v3 */
/* iget v3, v1, Landroid/graphics/Rect;->left:I */
/* sub-int/2addr v2, v3 */
/* iget v1, v1, Landroid/graphics/Rect;->right:I */
/* sub-int/2addr v2, v1 */
/* iget v1, v0, Landroid/graphics/Rect;->left:I */
/* sub-int/2addr v2, v1 */
/* iget v0, v0, Landroid/graphics/Rect;->right:I */
/* sub-int/2addr v2, v0 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
/* # virtual methods */
public void draw ( android.graphics.Canvas p0 ) {
/* .locals 10 */
v0 = this.a;
/* iget v1, p0, Landroid/support/v7/widget/SwitchCompat;->j:I */
/* iget v2, p0, Landroid/support/v7/widget/SwitchCompat;->k:I */
/* iget v3, p0, Landroid/support/v7/widget/SwitchCompat;->l:I */
/* iget v4, p0, Landroid/support/v7/widget/SwitchCompat;->m:I */
v5 = /* invoke-direct {p0}, Landroid/support/v7/widget/SwitchCompat;->getThumbOffset()I */
/* add-int/2addr v5, v1 */
v6 = this.a;
if ( v6 != null) { // if-eqz v6, :cond_0
id .a ( v6 );
} // :cond_0
v6 = id.a;
} // :goto_0
v7 = this.b;
if ( v7 != null) { // if-eqz v7, :cond_6
(( android.graphics.drawable.Drawable ) v7 ).getPadding ( v0 ); // invoke-virtual {v7, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
/* iget v7, v0, Landroid/graphics/Rect;->left:I */
/* add-int/2addr v5, v7 */
if ( v6 != null) { // if-eqz v6, :cond_4
/* iget v7, v6, Landroid/graphics/Rect;->left:I */
/* iget v8, v0, Landroid/graphics/Rect;->left:I */
/* if-le v7, v8, :cond_1 */
/* iget v7, v6, Landroid/graphics/Rect;->left:I */
/* iget v8, v0, Landroid/graphics/Rect;->left:I */
/* sub-int/2addr v7, v8 */
/* add-int/2addr v1, v7 */
} // :cond_1
/* iget v7, v6, Landroid/graphics/Rect;->top:I */
/* iget v8, v0, Landroid/graphics/Rect;->top:I */
/* if-le v7, v8, :cond_2 */
/* iget v7, v6, Landroid/graphics/Rect;->top:I */
/* iget v8, v0, Landroid/graphics/Rect;->top:I */
/* sub-int/2addr v7, v8 */
/* add-int/2addr v7, v2 */
} // :cond_2
/* move v7, v2 */
} // :goto_1
/* iget v8, v6, Landroid/graphics/Rect;->right:I */
/* iget v9, v0, Landroid/graphics/Rect;->right:I */
/* if-le v8, v9, :cond_3 */
/* iget v8, v6, Landroid/graphics/Rect;->right:I */
/* iget v9, v0, Landroid/graphics/Rect;->right:I */
/* sub-int/2addr v8, v9 */
/* sub-int/2addr v3, v8 */
} // :cond_3
/* iget v8, v6, Landroid/graphics/Rect;->bottom:I */
/* iget v9, v0, Landroid/graphics/Rect;->bottom:I */
/* if-le v8, v9, :cond_5 */
/* iget v6, v6, Landroid/graphics/Rect;->bottom:I */
/* iget v8, v0, Landroid/graphics/Rect;->bottom:I */
/* sub-int/2addr v6, v8 */
/* sub-int v6, v4, v6 */
} // :cond_4
/* move v7, v2 */
} // :cond_5
/* move v6, v4 */
} // :goto_2
v8 = this.b;
(( android.graphics.drawable.Drawable ) v8 ).setBounds ( v1, v7, v3, v6 ); // invoke-virtual {v8, v1, v7, v3, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
} // :cond_6
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_7
(( android.graphics.drawable.Drawable ) v1 ).getPadding ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
/* iget v1, v0, Landroid/graphics/Rect;->left:I */
/* sub-int v1, v5, v1 */
/* iget v3, p0, Landroid/support/v7/widget/SwitchCompat;->i:I */
/* add-int/2addr v5, v3 */
/* iget v0, v0, Landroid/graphics/Rect;->right:I */
/* add-int/2addr v5, v0 */
v0 = this.a;
(( android.graphics.drawable.Drawable ) v0 ).setBounds ( v1, v2, v5, v4 ); // invoke-virtual {v0, v1, v2, v5, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
(( android.support.v7.widget.SwitchCompat ) p0 ).getBackground ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getBackground()Landroid/graphics/drawable/Drawable;
if ( v0 != null) { // if-eqz v0, :cond_7
cx .a ( v0,v1,v2,v5,v4 );
} // :cond_7
/* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->draw(Landroid/graphics/Canvas;)V */
return;
} // .end method
public void drawableHotspotChanged ( Float p0, Float p1 ) {
/* .locals 2 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* invoke-super {p0, p1, p2}, Landroid/widget/CompoundButton;->drawableHotspotChanged(FF)V */
} // :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
cx .a ( v0,p1,p2 );
} // :cond_1
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_2
cx .a ( v0,p1,p2 );
} // :cond_2
return;
} // .end method
protected void drawableStateChanged ( ) {
/* .locals 4 */
/* invoke-super {p0}, Landroid/widget/CompoundButton;->drawableStateChanged()V */
(( android.support.v7.widget.SwitchCompat ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getDrawableState()[I
v1 = this.a;
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_0
v3 = (( android.graphics.drawable.Drawable ) v1 ).isStateful ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( v3 != null) { // if-eqz v3, :cond_0
v1 = (( android.graphics.drawable.Drawable ) v1 ).setState ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z
/* or-int/2addr v2, v1 */
} // :cond_0
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_1
v3 = (( android.graphics.drawable.Drawable ) v1 ).isStateful ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( v3 != null) { // if-eqz v3, :cond_1
v0 = (( android.graphics.drawable.Drawable ) v1 ).setState ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z
/* or-int/2addr v2, v0 */
} // :cond_1
if ( v2 != null) { // if-eqz v2, :cond_2
(( android.support.v7.widget.SwitchCompat ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->invalidate()V
} // :cond_2
return;
} // .end method
public Integer getCompoundPaddingLeft ( ) {
/* .locals 2 */
v0 = iv .a ( p0 );
/* if-nez v0, :cond_0 */
v0 = /* invoke-super {p0}, Landroid/widget/CompoundButton;->getCompoundPaddingLeft()I */
} // :cond_0
v0 = /* invoke-super {p0}, Landroid/widget/CompoundButton;->getCompoundPaddingLeft()I */
/* iget v1, p0, Landroid/support/v7/widget/SwitchCompat;->g:I */
/* add-int/2addr v0, v1 */
(( android.support.v7.widget.SwitchCompat ) p0 ).getText ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getText()Ljava/lang/CharSequence;
v1 = android.text.TextUtils .isEmpty ( v1 );
/* if-nez v1, :cond_1 */
/* iget v1, p0, Landroid/support/v7/widget/SwitchCompat;->c:I */
/* add-int/2addr v0, v1 */
} // :cond_1
} // .end method
public Integer getCompoundPaddingRight ( ) {
/* .locals 2 */
v0 = iv .a ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = /* invoke-super {p0}, Landroid/widget/CompoundButton;->getCompoundPaddingRight()I */
} // :cond_0
v0 = /* invoke-super {p0}, Landroid/widget/CompoundButton;->getCompoundPaddingRight()I */
/* iget v1, p0, Landroid/support/v7/widget/SwitchCompat;->g:I */
/* add-int/2addr v0, v1 */
(( android.support.v7.widget.SwitchCompat ) p0 ).getText ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getText()Ljava/lang/CharSequence;
v1 = android.text.TextUtils .isEmpty ( v1 );
/* if-nez v1, :cond_1 */
/* iget v1, p0, Landroid/support/v7/widget/SwitchCompat;->c:I */
/* add-int/2addr v0, v1 */
} // :cond_1
} // .end method
public Boolean getShowText ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Landroid/support/v7/widget/SwitchCompat;->f:Z */
} // .end method
public Boolean getSplitTrack ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Landroid/support/v7/widget/SwitchCompat;->e:Z */
} // .end method
public Integer getSwitchMinWidth ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v7/widget/SwitchCompat;->b:I */
} // .end method
public Integer getSwitchPadding ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v7/widget/SwitchCompat;->c:I */
} // .end method
public java.lang.CharSequence getTextOff ( ) {
/* .locals 1 */
v0 = this.b;
} // .end method
public java.lang.CharSequence getTextOn ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public android.graphics.drawable.Drawable getThumbDrawable ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public Integer getThumbTextPadding ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v7/widget/SwitchCompat;->a:I */
} // .end method
public android.content.res.ColorStateList getThumbTintList ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public android.graphics.PorterDuff$Mode getThumbTintMode ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public android.graphics.drawable.Drawable getTrackDrawable ( ) {
/* .locals 1 */
v0 = this.b;
} // .end method
public android.content.res.ColorStateList getTrackTintList ( ) {
/* .locals 1 */
v0 = this.b;
} // .end method
public android.graphics.PorterDuff$Mode getTrackTintMode ( ) {
/* .locals 1 */
v0 = this.b;
} // .end method
public void jumpDrawablesToCurrentState ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/widget/CompoundButton;->jumpDrawablesToCurrentState()V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.graphics.drawable.Drawable ) v0 ).jumpToCurrentState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
} // :cond_0
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
(( android.graphics.drawable.Drawable ) v0 ).jumpToCurrentState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
} // :cond_1
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = (( android.animation.ObjectAnimator ) v0 ).isStarted ( ); // invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isStarted()Z
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.a;
(( android.animation.ObjectAnimator ) v0 ).end ( ); // invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->end()V
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
} // :cond_2
return;
} // .end method
protected onCreateDrawableState ( Integer p0 ) {
/* .locals 1 */
/* add-int/lit8 p1, p1, 0x1 */
/* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onCreateDrawableState(I)[I */
v0 = (( android.support.v7.widget.SwitchCompat ) p0 ).isChecked ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->isChecked()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = android.support.v7.widget.SwitchCompat.a;
android.support.v7.widget.SwitchCompat .mergeDrawableStates ( p1,v0 );
} // :cond_0
} // .end method
protected void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 9 */
/* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onDraw(Landroid/graphics/Canvas;)V */
v0 = this.a;
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_0
(( android.graphics.drawable.Drawable ) v1 ).getPadding ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
} // :cond_0
(( android.graphics.Rect ) v0 ).setEmpty ( ); // invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V
} // :goto_0
/* iget v2, p0, Landroid/support/v7/widget/SwitchCompat;->k:I */
/* iget v3, p0, Landroid/support/v7/widget/SwitchCompat;->m:I */
/* iget v4, v0, Landroid/graphics/Rect;->top:I */
/* add-int/2addr v2, v4 */
/* iget v4, v0, Landroid/graphics/Rect;->bottom:I */
/* sub-int/2addr v3, v4 */
v4 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_2
/* iget-boolean v5, p0, Landroid/support/v7/widget/SwitchCompat;->e:Z */
if ( v5 != null) { // if-eqz v5, :cond_1
if ( v4 != null) { // if-eqz v4, :cond_1
id .a ( v4 );
(( android.graphics.drawable.Drawable ) v4 ).copyBounds ( v0 ); // invoke-virtual {v4, v0}, Landroid/graphics/drawable/Drawable;->copyBounds(Landroid/graphics/Rect;)V
/* iget v6, v0, Landroid/graphics/Rect;->left:I */
/* iget v7, v5, Landroid/graphics/Rect;->left:I */
/* add-int/2addr v6, v7 */
/* iput v6, v0, Landroid/graphics/Rect;->left:I */
/* iget v6, v0, Landroid/graphics/Rect;->right:I */
/* iget v5, v5, Landroid/graphics/Rect;->right:I */
/* sub-int/2addr v6, v5 */
/* iput v6, v0, Landroid/graphics/Rect;->right:I */
v5 = (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
v6 = android.graphics.Region$Op.DIFFERENCE;
(( android.graphics.Canvas ) p1 ).clipRect ( v0, v6 ); // invoke-virtual {p1, v0, v6}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;Landroid/graphics/Region$Op;)Z
(( android.graphics.drawable.Drawable ) v1 ).draw ( p1 ); // invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
(( android.graphics.Canvas ) p1 ).restoreToCount ( v5 ); // invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->restoreToCount(I)V
} // :cond_1
(( android.graphics.drawable.Drawable ) v1 ).draw ( p1 ); // invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
} // :cond_2
} // :goto_1
v0 = (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
if ( v4 != null) { // if-eqz v4, :cond_3
(( android.graphics.drawable.Drawable ) v4 ).draw ( p1 ); // invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
} // :cond_3
v1 = /* invoke-direct {p0}, Landroid/support/v7/widget/SwitchCompat;->getTargetCheckedState()Z */
if ( v1 != null) { // if-eqz v1, :cond_4
v1 = this.a;
} // :cond_4
v1 = this.b;
} // :goto_2
if ( v1 != null) { // if-eqz v1, :cond_7
(( android.support.v7.widget.SwitchCompat ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getDrawableState()[I
v6 = this.c;
if ( v6 != null) { // if-eqz v6, :cond_5
v7 = this.a;
int v8 = 0; // const/4 v8, 0x0
v6 = (( android.content.res.ColorStateList ) v6 ).getColorForState ( v5, v8 ); // invoke-virtual {v6, v5, v8}, Landroid/content/res/ColorStateList;->getColorForState([II)I
(( android.text.TextPaint ) v7 ).setColor ( v6 ); // invoke-virtual {v7, v6}, Landroid/text/TextPaint;->setColor(I)V
} // :cond_5
v6 = this.a;
this.drawableState = v5;
if ( v4 != null) { // if-eqz v4, :cond_6
(( android.graphics.drawable.Drawable ) v4 ).getBounds ( ); // invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;
/* iget v5, v4, Landroid/graphics/Rect;->left:I */
/* iget v4, v4, Landroid/graphics/Rect;->right:I */
/* add-int/2addr v5, v4 */
} // :cond_6
v5 = (( android.support.v7.widget.SwitchCompat ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getWidth()I
} // :goto_3
/* div-int/lit8 v5, v5, 0x2 */
v4 = (( android.text.Layout ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/text/Layout;->getWidth()I
/* div-int/lit8 v4, v4, 0x2 */
/* sub-int/2addr v5, v4 */
/* add-int/2addr v2, v3 */
/* div-int/lit8 v2, v2, 0x2 */
v3 = (( android.text.Layout ) v1 ).getHeight ( ); // invoke-virtual {v1}, Landroid/text/Layout;->getHeight()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* int-to-float v3, v5 */
/* int-to-float v2, v2 */
(( android.graphics.Canvas ) p1 ).translate ( v3, v2 ); // invoke-virtual {p1, v3, v2}, Landroid/graphics/Canvas;->translate(FF)V
(( android.text.Layout ) v1 ).draw ( p1 ); // invoke-virtual {v1, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V
} // :cond_7
(( android.graphics.Canvas ) p1 ).restoreToCount ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V
return;
} // .end method
public void onInitializeAccessibilityEvent ( android.view.accessibility.AccessibilityEvent p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V */
final String v0 = "android.widget.Switch"; // const-string v0, "android.widget.Switch"
(( android.view.accessibility.AccessibilityEvent ) p1 ).setClassName ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V
return;
} // .end method
public void onInitializeAccessibilityNodeInfo ( android.view.accessibility.AccessibilityNodeInfo p0 ) {
/* .locals 3 */
/* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V */
final String v0 = "android.widget.Switch"; // const-string v0, "android.widget.Switch"
(( android.view.accessibility.AccessibilityNodeInfo ) p1 ).setClassName ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V
v0 = (( android.support.v7.widget.SwitchCompat ) p0 ).isChecked ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->isChecked()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
} // :cond_0
v0 = this.b;
} // :goto_0
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_2 */
(( android.view.accessibility.AccessibilityNodeInfo ) p1 ).getText ( ); // invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;
v2 = android.text.TextUtils .isEmpty ( v1 );
if ( v2 != null) { // if-eqz v2, :cond_1
(( android.view.accessibility.AccessibilityNodeInfo ) p1 ).setText ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V
return;
} // :cond_1
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
/* const/16 v1, 0x20 */
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
(( android.view.accessibility.AccessibilityNodeInfo ) p1 ).setText ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V
} // :cond_2
return;
} // .end method
protected void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
/* invoke-super/range {p0 ..p5}, Landroid/widget/CompoundButton;->onLayout(ZIIII)V */
p1 = this.a;
int p2 = 0; // const/4 p2, 0x0
if ( p1 != null) { // if-eqz p1, :cond_1
p1 = this.a;
p3 = this.b;
if ( p3 != null) { // if-eqz p3, :cond_0
(( android.graphics.drawable.Drawable ) p3 ).getPadding ( p1 ); // invoke-virtual {p3, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
} // :cond_0
(( android.graphics.Rect ) p1 ).setEmpty ( ); // invoke-virtual {p1}, Landroid/graphics/Rect;->setEmpty()V
} // :goto_0
p3 = this.a;
id .a ( p3 );
/* iget p4, p3, Landroid/graphics/Rect;->left:I */
/* iget p5, p1, Landroid/graphics/Rect;->left:I */
/* sub-int/2addr p4, p5 */
p4 = java.lang.Math .max ( p2,p4 );
/* iget p3, p3, Landroid/graphics/Rect;->right:I */
/* iget p1, p1, Landroid/graphics/Rect;->right:I */
/* sub-int/2addr p3, p1 */
p2 = java.lang.Math .max ( p2,p3 );
} // :cond_1
int p4 = 0; // const/4 p4, 0x0
} // :goto_1
p1 = iv .a ( p0 );
if ( p1 != null) { // if-eqz p1, :cond_2
p1 = (( android.support.v7.widget.SwitchCompat ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getPaddingLeft()I
/* add-int/2addr p1, p4 */
/* iget p3, p0, Landroid/support/v7/widget/SwitchCompat;->g:I */
/* add-int/2addr p3, p1 */
/* sub-int/2addr p3, p4 */
/* sub-int/2addr p3, p2 */
} // :cond_2
p1 = (( android.support.v7.widget.SwitchCompat ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getWidth()I
p3 = (( android.support.v7.widget.SwitchCompat ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getPaddingRight()I
/* sub-int/2addr p1, p3 */
/* sub-int p3, p1, p2 */
/* iget p1, p0, Landroid/support/v7/widget/SwitchCompat;->g:I */
/* sub-int p1, p3, p1 */
/* add-int/2addr p1, p4 */
/* add-int/2addr p1, p2 */
} // :goto_2
p2 = (( android.support.v7.widget.SwitchCompat ) p0 ).getGravity ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getGravity()I
/* and-int/lit8 p2, p2, 0x70 */
/* const/16 p4, 0x10 */
/* if-eq p2, p4, :cond_4 */
/* const/16 p4, 0x50 */
/* if-eq p2, p4, :cond_3 */
p2 = (( android.support.v7.widget.SwitchCompat ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getPaddingTop()I
/* iget p4, p0, Landroid/support/v7/widget/SwitchCompat;->h:I */
} // :goto_3
/* add-int/2addr p4, p2 */
} // :cond_3
p2 = (( android.support.v7.widget.SwitchCompat ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getHeight()I
p4 = (( android.support.v7.widget.SwitchCompat ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getPaddingBottom()I
/* sub-int p4, p2, p4 */
/* iget p2, p0, Landroid/support/v7/widget/SwitchCompat;->h:I */
/* sub-int p2, p4, p2 */
} // :cond_4
p2 = (( android.support.v7.widget.SwitchCompat ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getPaddingTop()I
p4 = (( android.support.v7.widget.SwitchCompat ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getHeight()I
/* add-int/2addr p2, p4 */
p4 = (( android.support.v7.widget.SwitchCompat ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getPaddingBottom()I
/* sub-int/2addr p2, p4 */
/* div-int/lit8 p2, p2, 0x2 */
/* iget p4, p0, Landroid/support/v7/widget/SwitchCompat;->h:I */
/* div-int/lit8 p5, p4, 0x2 */
/* sub-int/2addr p2, p5 */
} // :goto_4
/* iput p1, p0, Landroid/support/v7/widget/SwitchCompat;->j:I */
/* iput p2, p0, Landroid/support/v7/widget/SwitchCompat;->k:I */
/* iput p4, p0, Landroid/support/v7/widget/SwitchCompat;->m:I */
/* iput p3, p0, Landroid/support/v7/widget/SwitchCompat;->l:I */
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 6 */
/* iget-boolean v0, p0, Landroid/support/v7/widget/SwitchCompat;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
/* if-nez v0, :cond_0 */
v0 = this.a;
/* invoke-direct {p0, v0}, Landroid/support/v7/widget/SwitchCompat;->a(Ljava/lang/CharSequence;)Landroid/text/Layout; */
this.a = v0;
} // :cond_0
v0 = this.b;
/* if-nez v0, :cond_1 */
v0 = this.b;
/* invoke-direct {p0, v0}, Landroid/support/v7/widget/SwitchCompat;->a(Ljava/lang/CharSequence;)Landroid/text/Layout; */
this.b = v0;
} // :cond_1
v0 = this.a;
v1 = this.a;
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_2
(( android.graphics.drawable.Drawable ) v1 ).getPadding ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
v1 = this.a;
v1 = (( android.graphics.drawable.Drawable ) v1 ).getIntrinsicWidth ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
/* iget v3, v0, Landroid/graphics/Rect;->left:I */
/* sub-int/2addr v1, v3 */
/* iget v3, v0, Landroid/graphics/Rect;->right:I */
/* sub-int/2addr v1, v3 */
v3 = this.a;
v3 = (( android.graphics.drawable.Drawable ) v3 ).getIntrinsicHeight ( ); // invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* iget-boolean v4, p0, Landroid/support/v7/widget/SwitchCompat;->f:Z */
if ( v4 != null) { // if-eqz v4, :cond_3
v4 = this.a;
v4 = (( android.text.Layout ) v4 ).getWidth ( ); // invoke-virtual {v4}, Landroid/text/Layout;->getWidth()I
v5 = this.b;
v5 = (( android.text.Layout ) v5 ).getWidth ( ); // invoke-virtual {v5}, Landroid/text/Layout;->getWidth()I
v4 = java.lang.Math .max ( v4,v5 );
/* iget v5, p0, Landroid/support/v7/widget/SwitchCompat;->a:I */
/* mul-int/lit8 v5, v5, 0x2 */
/* add-int/2addr v4, v5 */
} // :cond_3
int v4 = 0; // const/4 v4, 0x0
} // :goto_1
v1 = java.lang.Math .max ( v4,v1 );
/* iput v1, p0, Landroid/support/v7/widget/SwitchCompat;->i:I */
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_4
(( android.graphics.drawable.Drawable ) v1 ).getPadding ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
v1 = this.b;
v2 = (( android.graphics.drawable.Drawable ) v1 ).getIntrinsicHeight ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
} // :cond_4
(( android.graphics.Rect ) v0 ).setEmpty ( ); // invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V
} // :goto_2
/* iget v1, v0, Landroid/graphics/Rect;->left:I */
/* iget v0, v0, Landroid/graphics/Rect;->right:I */
v4 = this.a;
if ( v4 != null) { // if-eqz v4, :cond_5
id .a ( v4 );
/* iget v5, v4, Landroid/graphics/Rect;->left:I */
v1 = java.lang.Math .max ( v1,v5 );
/* iget v4, v4, Landroid/graphics/Rect;->right:I */
v0 = java.lang.Math .max ( v0,v4 );
} // :cond_5
/* iget v4, p0, Landroid/support/v7/widget/SwitchCompat;->b:I */
/* iget v5, p0, Landroid/support/v7/widget/SwitchCompat;->i:I */
/* mul-int/lit8 v5, v5, 0x2 */
/* add-int/2addr v5, v1 */
/* add-int/2addr v5, v0 */
v0 = java.lang.Math .max ( v4,v5 );
v1 = java.lang.Math .max ( v2,v3 );
/* iput v0, p0, Landroid/support/v7/widget/SwitchCompat;->g:I */
/* iput v1, p0, Landroid/support/v7/widget/SwitchCompat;->h:I */
/* invoke-super {p0, p1, p2}, Landroid/widget/CompoundButton;->onMeasure(II)V */
p1 = (( android.support.v7.widget.SwitchCompat ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getMeasuredHeight()I
/* if-ge p1, v1, :cond_6 */
p1 = (( android.support.v7.widget.SwitchCompat ) p0 ).getMeasuredWidthAndState ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getMeasuredWidthAndState()I
(( android.support.v7.widget.SwitchCompat ) p0 ).setMeasuredDimension ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Landroid/support/v7/widget/SwitchCompat;->setMeasuredDimension(II)V
} // :cond_6
return;
} // .end method
public void onPopulateAccessibilityEvent ( android.view.accessibility.AccessibilityEvent p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V */
v0 = (( android.support.v7.widget.SwitchCompat ) p0 ).isChecked ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->isChecked()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
} // :cond_0
v0 = this.b;
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
(( android.view.accessibility.AccessibilityEvent ) p1 ).getText ( ); // invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;
} // :cond_1
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 9 */
v0 = this.a;
(( android.view.VelocityTracker ) v0 ).addMovement ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
v0 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
int v1 = 2; // const/4 v1, 0x2
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 1; // const/4 v4, 0x1
/* packed-switch v0, :pswitch_data_0 */
/* goto/16 :goto_5 */
/* :pswitch_0 */
/* iget v0, p0, Landroid/support/v7/widget/SwitchCompat;->d:I */
/* packed-switch v0, :pswitch_data_1 */
/* goto/16 :goto_5 */
/* :pswitch_1 */
p1 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
v0 = /* invoke-direct {p0}, Landroid/support/v7/widget/SwitchCompat;->getThumbScrollRange()I */
/* iget v1, p0, Landroid/support/v7/widget/SwitchCompat;->b:F */
/* sub-float v1, p1, v1 */
/* const/high16 v3, 0x3f800000 # 1.0f */
if ( v0 != null) { // if-eqz v0, :cond_0
/* int-to-float v0, v0 */
/* div-float v0, v1, v0 */
} // :cond_0
/* cmpl-float v0, v1, v2 */
/* if-lez v0, :cond_1 */
/* const/high16 v0, 0x3f800000 # 1.0f */
} // :cond_1
/* const/high16 v0, -0x40800000 # -1.0f */
} // :goto_0
v1 = iv .a ( p0 );
if ( v1 != null) { // if-eqz v1, :cond_2
/* neg-float v0, v0 */
} // :cond_2
/* iget v1, p0, Landroid/support/v7/widget/SwitchCompat;->a:F */
/* add-float/2addr v0, v1 */
/* cmpg-float v1, v0, v2 */
/* if-gez v1, :cond_3 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_3
/* cmpl-float v1, v0, v3 */
/* if-lez v1, :cond_4 */
/* const/high16 v0, 0x3f800000 # 1.0f */
} // :cond_4
} // :goto_1
/* iget v1, p0, Landroid/support/v7/widget/SwitchCompat;->a:F */
/* cmpl-float v1, v0, v1 */
if ( v1 != null) { // if-eqz v1, :cond_5
/* iput p1, p0, Landroid/support/v7/widget/SwitchCompat;->b:F */
(( android.support.v7.widget.SwitchCompat ) p0 ).setThumbPosition ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/SwitchCompat;->setThumbPosition(F)V
} // :cond_5
/* :pswitch_2 */
v0 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
v2 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* iget v3, p0, Landroid/support/v7/widget/SwitchCompat;->b:F */
/* sub-float v3, v0, v3 */
v3 = java.lang.Math .abs ( v3 );
/* iget v5, p0, Landroid/support/v7/widget/SwitchCompat;->e:I */
/* int-to-float v5, v5 */
/* cmpl-float v3, v3, v5 */
/* if-gtz v3, :cond_6 */
/* iget v3, p0, Landroid/support/v7/widget/SwitchCompat;->c:F */
/* sub-float v3, v2, v3 */
v3 = java.lang.Math .abs ( v3 );
/* iget v5, p0, Landroid/support/v7/widget/SwitchCompat;->e:I */
/* int-to-float v5, v5 */
/* cmpl-float v3, v3, v5 */
/* if-lez v3, :cond_f */
} // :cond_6
/* iput v1, p0, Landroid/support/v7/widget/SwitchCompat;->d:I */
(( android.support.v7.widget.SwitchCompat ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getParent()Landroid/view/ViewParent;
/* iput v0, p0, Landroid/support/v7/widget/SwitchCompat;->b:F */
/* iput v2, p0, Landroid/support/v7/widget/SwitchCompat;->c:F */
/* :pswitch_3 */
/* iget v0, p0, Landroid/support/v7/widget/SwitchCompat;->d:I */
/* if-ne v0, v1, :cond_d */
/* iput v3, p0, Landroid/support/v7/widget/SwitchCompat;->d:I */
v0 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
/* if-ne v0, v4, :cond_7 */
v0 = (( android.support.v7.widget.SwitchCompat ) p0 ).isEnabled ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->isEnabled()Z
if ( v0 != null) { // if-eqz v0, :cond_7
int v0 = 1; // const/4 v0, 0x1
} // :cond_7
int v0 = 0; // const/4 v0, 0x0
} // :goto_2
v1 = (( android.support.v7.widget.SwitchCompat ) p0 ).isChecked ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->isChecked()Z
if ( v0 != null) { // if-eqz v0, :cond_b
v0 = this.a;
/* const/16 v5, 0x3e8 */
(( android.view.VelocityTracker ) v0 ).computeCurrentVelocity ( v5 ); // invoke-virtual {v0, v5}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V
v0 = this.a;
v0 = (( android.view.VelocityTracker ) v0 ).getXVelocity ( ); // invoke-virtual {v0}, Landroid/view/VelocityTracker;->getXVelocity()F
v5 = java.lang.Math .abs ( v0 );
/* iget v6, p0, Landroid/support/v7/widget/SwitchCompat;->f:I */
/* int-to-float v6, v6 */
/* cmpl-float v5, v5, v6 */
/* if-lez v5, :cond_a */
v5 = iv .a ( p0 );
if ( v5 != null) { // if-eqz v5, :cond_8
/* cmpg-float v0, v0, v2 */
/* if-gez v0, :cond_9 */
} // :cond_8
/* cmpl-float v0, v0, v2 */
/* if-lez v0, :cond_9 */
} // :goto_3
int v0 = 1; // const/4 v0, 0x1
} // :cond_9
int v0 = 0; // const/4 v0, 0x0
} // :cond_a
v0 = /* invoke-direct {p0}, Landroid/support/v7/widget/SwitchCompat;->getTargetCheckedState()Z */
} // :cond_b
/* move v0, v1 */
} // :goto_4
/* if-eq v0, v1, :cond_c */
(( android.support.v7.widget.SwitchCompat ) p0 ).playSoundEffect ( v3 ); // invoke-virtual {p0, v3}, Landroid/support/v7/widget/SwitchCompat;->playSoundEffect(I)V
} // :cond_c
(( android.support.v7.widget.SwitchCompat ) p0 ).setChecked ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/SwitchCompat;->setChecked(Z)V
android.view.MotionEvent .obtain ( p1 );
int v1 = 3; // const/4 v1, 0x3
(( android.view.MotionEvent ) v0 ).setAction ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->setAction(I)V
/* invoke-super {p0, v0}, Landroid/widget/CompoundButton;->onTouchEvent(Landroid/view/MotionEvent;)Z */
(( android.view.MotionEvent ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V
/* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onTouchEvent(Landroid/view/MotionEvent;)Z */
} // :cond_d
/* iput v3, p0, Landroid/support/v7/widget/SwitchCompat;->d:I */
v0 = this.a;
(( android.view.VelocityTracker ) v0 ).clear ( ); // invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V
/* :pswitch_4 */
v0 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
v1 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
v2 = (( android.support.v7.widget.SwitchCompat ) p0 ).isEnabled ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->isEnabled()Z
if ( v2 != null) { // if-eqz v2, :cond_f
v2 = this.a;
if ( v2 != null) { // if-eqz v2, :cond_e
v2 = /* invoke-direct {p0}, Landroid/support/v7/widget/SwitchCompat;->getThumbOffset()I */
v5 = this.a;
v6 = this.a;
(( android.graphics.drawable.Drawable ) v5 ).getPadding ( v6 ); // invoke-virtual {v5, v6}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
/* iget v5, p0, Landroid/support/v7/widget/SwitchCompat;->k:I */
/* iget v6, p0, Landroid/support/v7/widget/SwitchCompat;->e:I */
/* sub-int/2addr v5, v6 */
/* iget v7, p0, Landroid/support/v7/widget/SwitchCompat;->j:I */
/* add-int/2addr v7, v2 */
/* sub-int/2addr v7, v6 */
/* iget v2, p0, Landroid/support/v7/widget/SwitchCompat;->i:I */
/* add-int/2addr v2, v7 */
v6 = this.a;
/* iget v6, v6, Landroid/graphics/Rect;->left:I */
/* add-int/2addr v2, v6 */
v6 = this.a;
/* iget v6, v6, Landroid/graphics/Rect;->right:I */
/* add-int/2addr v2, v6 */
/* iget v6, p0, Landroid/support/v7/widget/SwitchCompat;->e:I */
/* add-int/2addr v2, v6 */
/* iget v8, p0, Landroid/support/v7/widget/SwitchCompat;->m:I */
/* add-int/2addr v8, v6 */
/* int-to-float v6, v7 */
/* cmpl-float v6, v0, v6 */
/* if-lez v6, :cond_e */
/* int-to-float v2, v2 */
/* cmpg-float v2, v0, v2 */
/* if-gez v2, :cond_e */
/* int-to-float v2, v5 */
/* cmpl-float v2, v1, v2 */
/* if-lez v2, :cond_e */
/* int-to-float v2, v8 */
/* cmpg-float v2, v1, v2 */
/* if-gez v2, :cond_e */
int v3 = 1; // const/4 v3, 0x1
} // :cond_e
if ( v3 != null) { // if-eqz v3, :cond_f
/* iput v4, p0, Landroid/support/v7/widget/SwitchCompat;->d:I */
/* iput v0, p0, Landroid/support/v7/widget/SwitchCompat;->b:F */
/* iput v1, p0, Landroid/support/v7/widget/SwitchCompat;->c:F */
} // :cond_f
} // :goto_5
/* :pswitch_5 */
p1 = /* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onTouchEvent(Landroid/view/MotionEvent;)Z */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_0 */
/* :pswitch_3 */
} // .end packed-switch
/* :pswitch_data_1 */
/* .packed-switch 0x0 */
/* :pswitch_5 */
/* :pswitch_2 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public void setChecked ( Boolean p0 ) {
/* .locals 4 */
/* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V */
p1 = (( android.support.v7.widget.SwitchCompat ) p0 ).isChecked ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->isChecked()Z
(( android.support.v7.widget.SwitchCompat ) p0 ).getWindowToken ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getWindowToken()Landroid/os/IBinder;
/* const/high16 v1, 0x3f800000 # 1.0f */
int v2 = 0; // const/4 v2, 0x0
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = em .d ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_2
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
p1 = android.support.v7.widget.SwitchCompat.a;
int v0 = 1; // const/4 v0, 0x1
/* new-array v2, v0, [F */
int v3 = 0; // const/4 v3, 0x0
/* aput v1, v2, v3 */
android.animation.ObjectAnimator .ofFloat ( p0,p1,v2 );
this.a = p1;
p1 = this.a;
/* const-wide/16 v1, 0xfa */
(( android.animation.ObjectAnimator ) p1 ).setDuration ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;
/* const/16 v1, 0x12 */
/* if-lt p1, v1, :cond_1 */
p1 = this.a;
(( android.animation.ObjectAnimator ) p1 ).setAutoCancel ( v0 ); // invoke-virtual {p1, v0}, Landroid/animation/ObjectAnimator;->setAutoCancel(Z)V
} // :cond_1
p1 = this.a;
(( android.animation.ObjectAnimator ) p1 ).start ( ); // invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V
return;
} // :cond_2
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_3
(( android.animation.ObjectAnimator ) v0 ).cancel ( ); // invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V
} // :cond_3
if ( p1 != null) { // if-eqz p1, :cond_4
} // :cond_4
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
(( android.support.v7.widget.SwitchCompat ) p0 ).setThumbPosition ( v1 ); // invoke-virtual {p0, v1}, Landroid/support/v7/widget/SwitchCompat;->setThumbPosition(F)V
return;
} // .end method
public void setCustomSelectionActionModeCallback ( android.view.ActionMode$Callback p0 ) {
/* .locals 0 */
fn .a ( p0,p1 );
/* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V */
return;
} // .end method
public void setShowText ( Boolean p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Landroid/support/v7/widget/SwitchCompat;->f:Z */
/* if-eq v0, p1, :cond_0 */
/* iput-boolean p1, p0, Landroid/support/v7/widget/SwitchCompat;->f:Z */
(( android.support.v7.widget.SwitchCompat ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->requestLayout()V
} // :cond_0
return;
} // .end method
public void setSplitTrack ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Landroid/support/v7/widget/SwitchCompat;->e:Z */
(( android.support.v7.widget.SwitchCompat ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->invalidate()V
return;
} // .end method
public void setSwitchMinWidth ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v7/widget/SwitchCompat;->b:I */
(( android.support.v7.widget.SwitchCompat ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->requestLayout()V
return;
} // .end method
public void setSwitchPadding ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v7/widget/SwitchCompat;->c:I */
(( android.support.v7.widget.SwitchCompat ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->requestLayout()V
return;
} // .end method
public void setSwitchTextAppearance ( android.content.Context p0, Integer p1 ) {
/* .locals 3 */
v0 = gc$j.TextAppearance;
ip .a ( p1,p2,v0 );
(( ip ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lip;->a(I)Landroid/content/res/ColorStateList;
if ( p2 != null) { // if-eqz p2, :cond_0
} // :cond_0
(( android.support.v7.widget.SwitchCompat ) p0 ).getTextColors ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getTextColors()Landroid/content/res/ColorStateList;
} // :goto_0
this.c = p2;
int v0 = 0; // const/4 v0, 0x0
p2 = (( ip ) p1 ).e ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Lip;->e(II)I
if ( p2 != null) { // if-eqz p2, :cond_1
/* int-to-float p2, p2 */
v1 = this.a;
v1 = (( android.text.TextPaint ) v1 ).getTextSize ( ); // invoke-virtual {v1}, Landroid/text/TextPaint;->getTextSize()F
/* cmpl-float v1, p2, v1 */
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = this.a;
(( android.text.TextPaint ) v1 ).setTextSize ( p2 ); // invoke-virtual {v1, p2}, Landroid/text/TextPaint;->setTextSize(F)V
(( android.support.v7.widget.SwitchCompat ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->requestLayout()V
} // :cond_1
int v1 = -1; // const/4 v1, -0x1
p2 = (( ip ) p1 ).a ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lip;->a(II)I
v1 = (( ip ) p1 ).a ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Lip;->a(II)I
int v2 = 0; // const/4 v2, 0x0
/* packed-switch p2, :pswitch_data_0 */
/* move-object p2, v2 */
/* :pswitch_0 */
p2 = android.graphics.Typeface.MONOSPACE;
/* :pswitch_1 */
p2 = android.graphics.Typeface.SERIF;
/* :pswitch_2 */
p2 = android.graphics.Typeface.SANS_SERIF;
} // :goto_1
(( android.support.v7.widget.SwitchCompat ) p0 ).setSwitchTypeface ( p2, v1 ); // invoke-virtual {p0, p2, v1}, Landroid/support/v7/widget/SwitchCompat;->setSwitchTypeface(Landroid/graphics/Typeface;I)V
p2 = (( ip ) p1 ).a ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Lip;->a(IZ)Z
if ( p2 != null) { // if-eqz p2, :cond_2
/* new-instance p2, Lgi; */
(( android.support.v7.widget.SwitchCompat ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getContext()Landroid/content/Context;
/* invoke-direct {p2, v0}, Lgi;-><init>(Landroid/content/Context;)V */
this.a = p2;
} // :cond_2
this.a = v2;
} // :goto_2
p1 = this.a;
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
return;
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public void setSwitchTypeface ( android.graphics.Typeface p0 ) {
/* .locals 1 */
v0 = this.a;
(( android.text.TextPaint ) v0 ).getTypeface ( ); // invoke-virtual {v0}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( android.text.TextPaint ) v0 ).getTypeface ( ); // invoke-virtual {v0}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;
v0 = (( android.graphics.Typeface ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
v0 = this.a;
(( android.text.TextPaint ) v0 ).getTypeface ( ); // invoke-virtual {v0}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;
/* if-nez v0, :cond_2 */
if ( p1 != null) { // if-eqz p1, :cond_2
} // :cond_1
v0 = this.a;
(( android.text.TextPaint ) v0 ).setTypeface ( p1 ); // invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
(( android.support.v7.widget.SwitchCompat ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->requestLayout()V
(( android.support.v7.widget.SwitchCompat ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->invalidate()V
} // :cond_2
return;
} // .end method
public void setSwitchTypeface ( android.graphics.Typeface p0, Integer p1 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
/* if-lez p2, :cond_4 */
/* if-nez p1, :cond_0 */
android.graphics.Typeface .defaultFromStyle ( p2 );
} // :cond_0
android.graphics.Typeface .create ( p1,p2 );
} // :goto_0
(( android.support.v7.widget.SwitchCompat ) p0 ).setSwitchTypeface ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/SwitchCompat;->setSwitchTypeface(Landroid/graphics/Typeface;)V
if ( p1 != null) { // if-eqz p1, :cond_1
p1 = (( android.graphics.Typeface ) p1 ).getStyle ( ); // invoke-virtual {p1}, Landroid/graphics/Typeface;->getStyle()I
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :goto_1
/* xor-int/lit8 p1, p1, -0x1 */
/* and-int/2addr p1, p2 */
p2 = this.a;
/* and-int/lit8 v2, p1, 0x1 */
if ( v2 != null) { // if-eqz v2, :cond_2
int v1 = 1; // const/4 v1, 0x1
} // :cond_2
(( android.text.TextPaint ) p2 ).setFakeBoldText ( v1 ); // invoke-virtual {p2, v1}, Landroid/text/TextPaint;->setFakeBoldText(Z)V
p2 = this.a;
/* and-int/lit8 p1, p1, 0x2 */
if ( p1 != null) { // if-eqz p1, :cond_3
/* const/high16 v0, -0x41800000 # -0.25f */
} // :cond_3
(( android.text.TextPaint ) p2 ).setTextSkewX ( v0 ); // invoke-virtual {p2, v0}, Landroid/text/TextPaint;->setTextSkewX(F)V
return;
} // :cond_4
p2 = this.a;
(( android.text.TextPaint ) p2 ).setFakeBoldText ( v1 ); // invoke-virtual {p2, v1}, Landroid/text/TextPaint;->setFakeBoldText(Z)V
p2 = this.a;
(( android.text.TextPaint ) p2 ).setTextSkewX ( v0 ); // invoke-virtual {p2, v0}, Landroid/text/TextPaint;->setTextSkewX(F)V
(( android.support.v7.widget.SwitchCompat ) p0 ).setSwitchTypeface ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/SwitchCompat;->setSwitchTypeface(Landroid/graphics/Typeface;)V
return;
} // .end method
public void setTextOff ( java.lang.CharSequence p0 ) {
/* .locals 0 */
this.b = p1;
(( android.support.v7.widget.SwitchCompat ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->requestLayout()V
return;
} // .end method
public void setTextOn ( java.lang.CharSequence p0 ) {
/* .locals 0 */
this.a = p1;
(( android.support.v7.widget.SwitchCompat ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->requestLayout()V
return;
} // .end method
public void setThumbDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 0; // const/4 v1, 0x0
(( android.graphics.drawable.Drawable ) v0 ).setCallback ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
} // :cond_0
this.a = p1;
if ( p1 != null) { // if-eqz p1, :cond_1
(( android.graphics.drawable.Drawable ) p1 ).setCallback ( p0 ); // invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
} // :cond_1
(( android.support.v7.widget.SwitchCompat ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->requestLayout()V
return;
} // .end method
void setThumbPosition ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v7/widget/SwitchCompat;->a:F */
(( android.support.v7.widget.SwitchCompat ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->invalidate()V
return;
} // .end method
public void setThumbResource ( Integer p0 ) {
/* .locals 1 */
(( android.support.v7.widget.SwitchCompat ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getContext()Landroid/content/Context;
gd .a ( v0,p1 );
(( android.support.v7.widget.SwitchCompat ) p0 ).setThumbDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/SwitchCompat;->setThumbDrawable(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setThumbTextPadding ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v7/widget/SwitchCompat;->a:I */
(( android.support.v7.widget.SwitchCompat ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->requestLayout()V
return;
} // .end method
public void setThumbTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 0 */
this.a = p1;
int p1 = 1; // const/4 p1, 0x1
/* iput-boolean p1, p0, Landroid/support/v7/widget/SwitchCompat;->a:Z */
/* invoke-direct {p0}, Landroid/support/v7/widget/SwitchCompat;->b()V */
return;
} // .end method
public void setThumbTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 0 */
this.a = p1;
int p1 = 1; // const/4 p1, 0x1
/* iput-boolean p1, p0, Landroid/support/v7/widget/SwitchCompat;->b:Z */
/* invoke-direct {p0}, Landroid/support/v7/widget/SwitchCompat;->b()V */
return;
} // .end method
public void setTrackDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 0; // const/4 v1, 0x0
(( android.graphics.drawable.Drawable ) v0 ).setCallback ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
} // :cond_0
this.b = p1;
if ( p1 != null) { // if-eqz p1, :cond_1
(( android.graphics.drawable.Drawable ) p1 ).setCallback ( p0 ); // invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
} // :cond_1
(( android.support.v7.widget.SwitchCompat ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->requestLayout()V
return;
} // .end method
public void setTrackResource ( Integer p0 ) {
/* .locals 1 */
(( android.support.v7.widget.SwitchCompat ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->getContext()Landroid/content/Context;
gd .a ( v0,p1 );
(( android.support.v7.widget.SwitchCompat ) p0 ).setTrackDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/SwitchCompat;->setTrackDrawable(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setTrackTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 0 */
this.b = p1;
int p1 = 1; // const/4 p1, 0x1
/* iput-boolean p1, p0, Landroid/support/v7/widget/SwitchCompat;->c:Z */
/* invoke-direct {p0}, Landroid/support/v7/widget/SwitchCompat;->a()V */
return;
} // .end method
public void setTrackTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 0 */
this.b = p1;
int p1 = 1; // const/4 p1, 0x1
/* iput-boolean p1, p0, Landroid/support/v7/widget/SwitchCompat;->d:Z */
/* invoke-direct {p0}, Landroid/support/v7/widget/SwitchCompat;->a()V */
return;
} // .end method
public void toggle ( ) {
/* .locals 1 */
v0 = (( android.support.v7.widget.SwitchCompat ) p0 ).isChecked ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SwitchCompat;->isChecked()Z
/* xor-int/lit8 v0, v0, 0x1 */
(( android.support.v7.widget.SwitchCompat ) p0 ).setChecked ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/SwitchCompat;->setChecked(Z)V
return;
} // .end method
protected Boolean verifyDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
v0 = /* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z */
/* if-nez v0, :cond_1 */
v0 = this.a;
/* if-eq p1, v0, :cond_1 */
v0 = this.b;
/* if-ne p1, v0, :cond_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // .end method
