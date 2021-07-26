public class android.support.constraint.Placeholder extends android.view.View {
	 /* # instance fields */
	 Integer a;
	 android.view.View a;
	 Integer b;
	 /* # direct methods */
	 public android.support.constraint.Placeholder ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V */
		 int p1 = -1; // const/4 p1, -0x1
		 /* iput p1, p0, Landroid/support/constraint/Placeholder;->a:I */
		 int p1 = 0; // const/4 p1, 0x0
		 this.a = p1;
		 int v0 = 4; // const/4 v0, 0x4
		 /* iput v0, p0, Landroid/support/constraint/Placeholder;->b:I */
		 /* invoke-direct {p0, p1}, Landroid/support/constraint/Placeholder;->a(Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public android.support.constraint.Placeholder ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 int p1 = -1; // const/4 p1, -0x1
		 /* iput p1, p0, Landroid/support/constraint/Placeholder;->a:I */
		 int p1 = 0; // const/4 p1, 0x0
		 this.a = p1;
		 int p1 = 4; // const/4 p1, 0x4
		 /* iput p1, p0, Landroid/support/constraint/Placeholder;->b:I */
		 /* invoke-direct {p0, p2}, Landroid/support/constraint/Placeholder;->a(Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public android.support.constraint.Placeholder ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 int p1 = -1; // const/4 p1, -0x1
		 /* iput p1, p0, Landroid/support/constraint/Placeholder;->a:I */
		 int p1 = 0; // const/4 p1, 0x0
		 this.a = p1;
		 int p1 = 4; // const/4 p1, 0x4
		 /* iput p1, p0, Landroid/support/constraint/Placeholder;->b:I */
		 /* invoke-direct {p0, p2}, Landroid/support/constraint/Placeholder;->a(Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 private void a ( android.util.AttributeSet p0 ) {
		 /* .locals 4 */
		 /* iget v0, p0, Landroid/support/constraint/Placeholder;->b:I */
		 /* invoke-super {p0, v0}, Landroid/view/View;->setVisibility(I)V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Landroid/support/constraint/Placeholder;->a:I */
		 if ( p1 != null) { // if-eqz p1, :cond_2
			 (( android.support.constraint.Placeholder ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/constraint/Placeholder;->getContext()Landroid/content/Context;
			 v1 = y$b.ConstraintLayout_placeholder;
			 (( android.content.Context ) v0 ).obtainStyledAttributes ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
			 v0 = 			 (( android.content.res.TypedArray ) p1 ).getIndexCount ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I
			 int v1 = 0; // const/4 v1, 0x0
		 } // :goto_0
		 /* if-ge v1, v0, :cond_2 */
		 v2 = 		 (( android.content.res.TypedArray ) p1 ).getIndex ( v1 ); // invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I
		 /* if-ne v2, v3, :cond_0 */
		 /* iget v3, p0, Landroid/support/constraint/Placeholder;->a:I */
		 v2 = 		 (( android.content.res.TypedArray ) p1 ).getResourceId ( v2, v3 ); // invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I
		 /* iput v2, p0, Landroid/support/constraint/Placeholder;->a:I */
	 } // :cond_0
	 /* if-ne v2, v3, :cond_1 */
	 /* iget v3, p0, Landroid/support/constraint/Placeholder;->b:I */
	 v2 = 	 (( android.content.res.TypedArray ) p1 ).getInt ( v2, v3 ); // invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I
	 /* iput v2, p0, Landroid/support/constraint/Placeholder;->b:I */
} // :cond_1
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
return;
} // .end method
/* # virtual methods */
public android.view.View getContent ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public Integer getEmptyVisibility ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/constraint/Placeholder;->b:I */
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 7 */
v0 = (( android.support.constraint.Placeholder ) p0 ).isInEditMode ( ); // invoke-virtual {p0}, Landroid/support/constraint/Placeholder;->isInEditMode()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* const/16 v0, 0xdf */
(( android.graphics.Canvas ) p1 ).drawRGB ( v0, v0, v0 ); // invoke-virtual {p1, v0, v0, v0}, Landroid/graphics/Canvas;->drawRGB(III)V
/* new-instance v0, Landroid/graphics/Paint; */
/* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
/* const/16 v1, 0xff */
/* const/16 v2, 0xd2 */
(( android.graphics.Paint ) v0 ).setARGB ( v1, v2, v2, v2 ); // invoke-virtual {v0, v1, v2, v2, v2}, Landroid/graphics/Paint;->setARGB(IIII)V
v1 = android.graphics.Paint$Align.CENTER;
(( android.graphics.Paint ) v0 ).setTextAlign ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V
v1 = android.graphics.Typeface.DEFAULT;
int v2 = 0; // const/4 v2, 0x0
android.graphics.Typeface .create ( v1,v2 );
(( android.graphics.Paint ) v0 ).setTypeface ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
/* new-instance v1, Landroid/graphics/Rect; */
/* invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V */
(( android.graphics.Canvas ) p1 ).getClipBounds ( v1 ); // invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z
v3 = (( android.graphics.Rect ) v1 ).height ( ); // invoke-virtual {v1}, Landroid/graphics/Rect;->height()I
/* int-to-float v3, v3 */
(( android.graphics.Paint ) v0 ).setTextSize ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTextSize(F)V
v3 = (( android.graphics.Rect ) v1 ).height ( ); // invoke-virtual {v1}, Landroid/graphics/Rect;->height()I
v4 = (( android.graphics.Rect ) v1 ).width ( ); // invoke-virtual {v1}, Landroid/graphics/Rect;->width()I
v5 = android.graphics.Paint$Align.LEFT;
(( android.graphics.Paint ) v0 ).setTextAlign ( v5 ); // invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V
final String v5 = "?"; // const-string v5, "?"
int v6 = 1; // const/4 v6, 0x1
(( android.graphics.Paint ) v0 ).getTextBounds ( v5, v2, v6, v1 ); // invoke-virtual {v0, v5, v2, v6, v1}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V
/* int-to-float v2, v4 */
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v2, v4 */
v6 = (( android.graphics.Rect ) v1 ).width ( ); // invoke-virtual {v1}, Landroid/graphics/Rect;->width()I
/* int-to-float v6, v6 */
/* div-float/2addr v6, v4 */
/* sub-float/2addr v2, v6 */
/* iget v6, v1, Landroid/graphics/Rect;->left:I */
/* int-to-float v6, v6 */
/* sub-float/2addr v2, v6 */
/* int-to-float v3, v3 */
/* div-float/2addr v3, v4 */
v6 = (( android.graphics.Rect ) v1 ).height ( ); // invoke-virtual {v1}, Landroid/graphics/Rect;->height()I
/* int-to-float v6, v6 */
/* div-float/2addr v6, v4 */
/* add-float/2addr v3, v6 */
/* iget v1, v1, Landroid/graphics/Rect;->bottom:I */
/* int-to-float v1, v1 */
/* sub-float/2addr v3, v1 */
(( android.graphics.Canvas ) p1 ).drawText ( v5, v2, v3, v0 ); // invoke-virtual {p1, v5, v2, v3, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
} // :cond_0
return;
} // .end method
public void setContentId ( Integer p0 ) {
/* .locals 2 */
/* iget v0, p0, Landroid/support/constraint/Placeholder;->a:I */
/* if-ne v0, p1, :cond_0 */
return;
} // :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
int v1 = 0; // const/4 v1, 0x0
(( android.view.View ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
v0 = this.a;
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/support/constraint/ConstraintLayout$LayoutParams; */
/* iput-boolean v1, v0, Landroid/support/constraint/ConstraintLayout$LayoutParams;->h:Z */
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
} // :cond_1
/* iput p1, p0, Landroid/support/constraint/Placeholder;->a:I */
int v0 = -1; // const/4 v0, -0x1
/* if-eq p1, v0, :cond_2 */
(( android.support.constraint.Placeholder ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/support/constraint/Placeholder;->getParent()Landroid/view/ViewParent;
/* check-cast v0, Landroid/view/View; */
(( android.view.View ) v0 ).findViewById ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
if ( p1 != null) { // if-eqz p1, :cond_2
/* const/16 v0, 0x8 */
(( android.view.View ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V
} // :cond_2
return;
} // .end method
public void setEmptyVisibility ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/constraint/Placeholder;->b:I */
return;
} // .end method
