public class android.support.v4.view.PagerTabStrip extends android.support.v4.view.PagerTitleStrip {
	 /* # instance fields */
	 private final android.graphics.Paint a;
	 private final android.graphics.Rect a;
	 private Boolean a;
	 private Float b;
	 private Integer b;
	 private Boolean b;
	 private Float c;
	 private Integer c;
	 private Boolean c;
	 private Integer d;
	 private Integer e;
	 private Integer f;
	 private Integer g;
	 private Integer h;
	 private Integer i;
	 private Integer j;
	 /* # direct methods */
	 public android.support.v4.view.PagerTabStrip ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0}, Landroid/support/v4/view/PagerTabStrip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public android.support.v4.view.PagerTabStrip ( ) {
		 /* .locals 3 */
		 /* invoke-direct {p0, p1, p2}, Landroid/support/v4/view/PagerTitleStrip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* new-instance p2, Landroid/graphics/Paint; */
		 /* invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V */
		 this.a = p2;
		 /* new-instance p2, Landroid/graphics/Rect; */
		 /* invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V */
		 this.a = p2;
		 /* const/16 p2, 0xff */
		 /* iput p2, p0, Landroid/support/v4/view/PagerTabStrip;->h:I */
		 int p2 = 0; // const/4 p2, 0x0
		 /* iput-boolean p2, p0, Landroid/support/v4/view/PagerTabStrip;->a:Z */
		 /* iput-boolean p2, p0, Landroid/support/v4/view/PagerTabStrip;->b:Z */
		 /* iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->a:I */
		 /* iput v0, p0, Landroid/support/v4/view/PagerTabStrip;->b:I */
		 v0 = this.a;
		 /* iget v1, p0, Landroid/support/v4/view/PagerTabStrip;->b:I */
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 /* iget v0, v0, Landroid/util/DisplayMetrics;->density:F */
		 /* const/high16 v1, 0x40400000 # 3.0f */
		 /* mul-float v1, v1, v0 */
		 /* const/high16 v2, 0x3f000000 # 0.5f */
		 /* add-float/2addr v1, v2 */
		 /* float-to-int v1, v1 */
		 /* iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->c:I */
		 /* const/high16 v1, 0x40c00000 # 6.0f */
		 /* mul-float v1, v1, v0 */
		 /* add-float/2addr v1, v2 */
		 /* float-to-int v1, v1 */
		 /* iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->d:I */
		 /* const/high16 v1, 0x42800000 # 64.0f */
		 /* mul-float v1, v1, v0 */
		 /* float-to-int v1, v1 */
		 /* iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->e:I */
		 /* const/high16 v1, 0x41800000 # 16.0f */
		 /* mul-float v1, v1, v0 */
		 /* add-float/2addr v1, v2 */
		 /* float-to-int v1, v1 */
		 /* iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->g:I */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* mul-float v1, v1, v0 */
		 /* add-float/2addr v1, v2 */
		 /* float-to-int v1, v1 */
		 /* iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->i:I */
		 /* const/high16 v1, 0x42000000 # 32.0f */
		 /* mul-float v0, v0, v1 */
		 /* add-float/2addr v0, v2 */
		 /* float-to-int v0, v0 */
		 /* iput v0, p0, Landroid/support/v4/view/PagerTabStrip;->f:I */
		 android.view.ViewConfiguration .get ( p1 );
		 p1 = 		 (( android.view.ViewConfiguration ) p1 ).getScaledTouchSlop ( ); // invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I
		 /* iput p1, p0, Landroid/support/v4/view/PagerTabStrip;->j:I */
		 p1 = 		 (( android.support.v4.view.PagerTabStrip ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getPaddingLeft()I
		 v0 = 		 (( android.support.v4.view.PagerTabStrip ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getPaddingTop()I
		 v1 = 		 (( android.support.v4.view.PagerTabStrip ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getPaddingRight()I
		 v2 = 		 (( android.support.v4.view.PagerTabStrip ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getPaddingBottom()I
		 (( android.support.v4.view.PagerTabStrip ) p0 ).setPadding ( p1, v0, v1, v2 ); // invoke-virtual {p0, p1, v0, v1, v2}, Landroid/support/v4/view/PagerTabStrip;->setPadding(IIII)V
		 p1 = 		 (( android.support.v4.view.PagerTabStrip ) p0 ).getTextSpacing ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getTextSpacing()I
		 (( android.support.v4.view.PagerTabStrip ) p0 ).setTextSpacing ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/view/PagerTabStrip;->setTextSpacing(I)V
		 (( android.support.v4.view.PagerTabStrip ) p0 ).setWillNotDraw ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v4/view/PagerTabStrip;->setWillNotDraw(Z)V
		 p1 = this.a;
		 int p2 = 1; // const/4 p2, 0x1
		 (( android.widget.TextView ) p1 ).setFocusable ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/TextView;->setFocusable(Z)V
		 p1 = this.a;
		 /* new-instance v0, Landroid/support/v4/view/PagerTabStrip$1; */
		 /* invoke-direct {v0, p0}, Landroid/support/v4/view/PagerTabStrip$1;-><init>(Landroid/support/v4/view/PagerTabStrip;)V */
		 (( android.widget.TextView ) p1 ).setOnClickListener ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 p1 = this.c;
		 (( android.widget.TextView ) p1 ).setFocusable ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/TextView;->setFocusable(Z)V
		 p1 = this.c;
		 /* new-instance v0, Landroid/support/v4/view/PagerTabStrip$2; */
		 /* invoke-direct {v0, p0}, Landroid/support/v4/view/PagerTabStrip$2;-><init>(Landroid/support/v4/view/PagerTabStrip;)V */
		 (( android.widget.TextView ) p1 ).setOnClickListener ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 (( android.support.v4.view.PagerTabStrip ) p0 ).getBackground ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getBackground()Landroid/graphics/drawable/Drawable;
		 /* if-nez p1, :cond_0 */
		 /* iput-boolean p2, p0, Landroid/support/v4/view/PagerTabStrip;->a:Z */
	 } // :cond_0
	 return;
} // .end method
/* # virtual methods */
final void a ( Integer p0, Float p1, Boolean p2 ) {
	 /* .locals 5 */
	 v0 = this.a;
	 v1 = 	 (( android.support.v4.view.PagerTabStrip ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getHeight()I
	 v2 = this.b;
	 v2 = 	 (( android.widget.TextView ) v2 ).getLeft ( ); // invoke-virtual {v2}, Landroid/widget/TextView;->getLeft()I
	 /* iget v3, p0, Landroid/support/v4/view/PagerTabStrip;->g:I */
	 /* sub-int/2addr v2, v3 */
	 v3 = this.b;
	 v3 = 	 (( android.widget.TextView ) v3 ).getRight ( ); // invoke-virtual {v3}, Landroid/widget/TextView;->getRight()I
	 /* iget v4, p0, Landroid/support/v4/view/PagerTabStrip;->g:I */
	 /* add-int/2addr v3, v4 */
	 /* iget v4, p0, Landroid/support/v4/view/PagerTabStrip;->c:I */
	 /* sub-int v4, v1, v4 */
	 (( android.graphics.Rect ) v0 ).set ( v2, v4, v3, v1 ); // invoke-virtual {v0, v2, v4, v3, v1}, Landroid/graphics/Rect;->set(IIII)V
	 /* invoke-super {p0, p1, p2, p3}, Landroid/support/v4/view/PagerTitleStrip;->a(IFZ)V */
	 /* const/high16 p1, 0x3f000000 # 0.5f */
	 /* sub-float/2addr p2, p1 */
	 p1 = 	 java.lang.Math .abs ( p2 );
	 /* const/high16 p2, 0x40000000 # 2.0f */
	 /* mul-float p1, p1, p2 */
	 /* const/high16 p2, 0x437f0000 # 255.0f */
	 /* mul-float p1, p1, p2 */
	 /* float-to-int p1, p1 */
	 /* iput p1, p0, Landroid/support/v4/view/PagerTabStrip;->h:I */
	 p1 = this.b;
	 p1 = 	 (( android.widget.TextView ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->getLeft()I
	 /* iget p2, p0, Landroid/support/v4/view/PagerTabStrip;->g:I */
	 /* sub-int/2addr p1, p2 */
	 p2 = this.b;
	 p2 = 	 (( android.widget.TextView ) p2 ).getRight ( ); // invoke-virtual {p2}, Landroid/widget/TextView;->getRight()I
	 /* iget p3, p0, Landroid/support/v4/view/PagerTabStrip;->g:I */
	 /* add-int/2addr p2, p3 */
	 (( android.graphics.Rect ) v0 ).union ( p1, v4, p2, v1 ); // invoke-virtual {v0, p1, v4, p2, v1}, Landroid/graphics/Rect;->union(IIII)V
	 (( android.support.v4.view.PagerTabStrip ) p0 ).invalidate ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/view/PagerTabStrip;->invalidate(Landroid/graphics/Rect;)V
	 return;
} // .end method
public Boolean getDrawFullUnderline ( ) {
	 /* .locals 1 */
	 /* iget-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->a:Z */
} // .end method
Integer getMinHeight ( ) {
	 /* .locals 2 */
	 v0 = 	 /* invoke-super {p0}, Landroid/support/v4/view/PagerTitleStrip;->getMinHeight()I */
	 /* iget v1, p0, Landroid/support/v4/view/PagerTabStrip;->f:I */
	 v0 = 	 java.lang.Math .max ( v0,v1 );
} // .end method
public Integer getTabIndicatorColor ( ) {
	 /* .locals 1 */
	 /* iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->b:I */
} // .end method
protected void onDraw ( android.graphics.Canvas p0 ) {
	 /* .locals 14 */
	 /* invoke-super {p0, p1}, Landroid/support/v4/view/PagerTitleStrip;->onDraw(Landroid/graphics/Canvas;)V */
	 v0 = 	 (( android.support.v4.view.PagerTabStrip ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getHeight()I
	 v1 = this.b;
	 v1 = 	 (( android.widget.TextView ) v1 ).getLeft ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->getLeft()I
	 /* iget v2, p0, Landroid/support/v4/view/PagerTabStrip;->g:I */
	 /* sub-int/2addr v1, v2 */
	 v2 = this.b;
	 v2 = 	 (( android.widget.TextView ) v2 ).getRight ( ); // invoke-virtual {v2}, Landroid/widget/TextView;->getRight()I
	 /* iget v3, p0, Landroid/support/v4/view/PagerTabStrip;->g:I */
	 /* add-int/2addr v2, v3 */
	 /* iget v3, p0, Landroid/support/v4/view/PagerTabStrip;->c:I */
	 /* sub-int v3, v0, v3 */
	 v4 = this.a;
	 /* iget v5, p0, Landroid/support/v4/view/PagerTabStrip;->h:I */
	 /* shl-int/lit8 v5, v5, 0x18 */
	 /* iget v6, p0, Landroid/support/v4/view/PagerTabStrip;->b:I */
	 /* const v7, 0xffffff */
	 /* and-int/2addr v6, v7 */
	 /* or-int/2addr v5, v6 */
	 (( android.graphics.Paint ) v4 ).setColor ( v5 ); // invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V
	 /* int-to-float v9, v1 */
	 /* int-to-float v10, v3 */
	 /* int-to-float v11, v2 */
	 /* int-to-float v5, v0 */
	 v13 = this.a;
	 /* move-object v8, p1 */
	 /* move v12, v5 */
	 /* invoke-virtual/range {v8 ..v13}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
	 /* iget-boolean v1, p0, Landroid/support/v4/view/PagerTabStrip;->a:Z */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 v1 = this.a;
		 /* const/high16 v2, -0x1000000 */
		 /* iget v3, p0, Landroid/support/v4/view/PagerTabStrip;->b:I */
		 /* and-int/2addr v3, v7 */
		 /* or-int/2addr v2, v3 */
		 (( android.graphics.Paint ) v1 ).setColor ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V
		 v1 = 		 (( android.support.v4.view.PagerTabStrip ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getPaddingLeft()I
		 /* int-to-float v2, v1 */
		 /* iget v1, p0, Landroid/support/v4/view/PagerTabStrip;->i:I */
		 /* sub-int/2addr v0, v1 */
		 /* int-to-float v3, v0 */
		 v0 = 		 (( android.support.v4.view.PagerTabStrip ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getWidth()I
		 v1 = 		 (( android.support.v4.view.PagerTabStrip ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getPaddingRight()I
		 /* sub-int/2addr v0, v1 */
		 /* int-to-float v4, v0 */
		 v6 = this.a;
		 /* move-object v1, p1 */
		 /* invoke-virtual/range {v1 ..v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
	 } // :cond_0
	 return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
	 /* .locals 4 */
	 v0 = 	 (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
	 int v1 = 0; // const/4 v1, 0x0
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* iget-boolean v2, p0, Landroid/support/v4/view/PagerTabStrip;->c:Z */
		 if ( v2 != null) { // if-eqz v2, :cond_0
		 } // :cond_0
		 v2 = 		 (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
		 p1 = 		 (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
		 int v3 = 1; // const/4 v3, 0x1
		 /* packed-switch v0, :pswitch_data_0 */
		 /* :pswitch_0 */
		 /* iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->b:F */
		 /* sub-float/2addr v2, v0 */
		 v0 = 		 java.lang.Math .abs ( v2 );
		 /* iget v1, p0, Landroid/support/v4/view/PagerTabStrip;->j:I */
		 /* int-to-float v1, v1 */
		 /* cmpl-float v0, v0, v1 */
		 /* if-gtz v0, :cond_1 */
		 /* iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->c:F */
		 /* sub-float/2addr p1, v0 */
		 p1 = 		 java.lang.Math .abs ( p1 );
		 /* iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->j:I */
		 /* int-to-float v0, v0 */
		 /* cmpl-float p1, p1, v0 */
		 /* if-lez p1, :cond_3 */
	 } // :cond_1
	 /* iput-boolean v3, p0, Landroid/support/v4/view/PagerTabStrip;->c:Z */
	 /* :pswitch_1 */
	 p1 = this.b;
	 p1 = 	 (( android.widget.TextView ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->getLeft()I
	 /* iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->g:I */
	 /* sub-int/2addr p1, v0 */
	 /* int-to-float p1, p1 */
	 /* cmpg-float p1, v2, p1 */
	 /* if-gez p1, :cond_2 */
	 p1 = this.a;
	 v0 = this.a;
	 v0 = 	 (( android.support.v4.view.ViewPager ) v0 ).getCurrentItem ( ); // invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I
	 /* sub-int/2addr v0, v3 */
} // :goto_0
(( android.support.v4.view.ViewPager ) p1 ).setCurrentItem ( v0 ); // invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V
} // :cond_2
p1 = this.b;
p1 = (( android.widget.TextView ) p1 ).getRight ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->getRight()I
/* iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->g:I */
/* add-int/2addr p1, v0 */
/* int-to-float p1, p1 */
/* cmpl-float p1, v2, p1 */
/* if-lez p1, :cond_3 */
p1 = this.a;
v0 = this.a;
v0 = (( android.support.v4.view.ViewPager ) v0 ).getCurrentItem ( ); // invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I
/* add-int/2addr v0, v3 */
/* :pswitch_2 */
/* iput v2, p0, Landroid/support/v4/view/PagerTabStrip;->b:F */
/* iput p1, p0, Landroid/support/v4/view/PagerTabStrip;->c:F */
/* iput-boolean v1, p0, Landroid/support/v4/view/PagerTabStrip;->c:Z */
} // :cond_3
} // :goto_1
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public void setBackgroundColor ( Integer p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Landroid/support/v4/view/PagerTitleStrip;->setBackgroundColor(I)V */
/* iget-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->b:Z */
/* if-nez v0, :cond_1 */
/* const/high16 v0, -0x1000000 */
/* and-int/2addr p1, v0 */
/* if-nez p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
/* iput-boolean p1, p0, Landroid/support/v4/view/PagerTabStrip;->a:Z */
} // :cond_1
return;
} // .end method
public void setBackgroundDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Landroid/support/v4/view/PagerTitleStrip;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V */
/* iget-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->b:Z */
/* if-nez v0, :cond_1 */
/* if-nez p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
/* iput-boolean p1, p0, Landroid/support/v4/view/PagerTabStrip;->a:Z */
} // :cond_1
return;
} // .end method
public void setBackgroundResource ( Integer p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Landroid/support/v4/view/PagerTitleStrip;->setBackgroundResource(I)V */
/* iget-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->b:Z */
/* if-nez v0, :cond_1 */
/* if-nez p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
/* iput-boolean p1, p0, Landroid/support/v4/view/PagerTabStrip;->a:Z */
} // :cond_1
return;
} // .end method
public void setDrawFullUnderline ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Landroid/support/v4/view/PagerTabStrip;->a:Z */
int p1 = 1; // const/4 p1, 0x1
/* iput-boolean p1, p0, Landroid/support/v4/view/PagerTabStrip;->b:Z */
(( android.support.v4.view.PagerTabStrip ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->invalidate()V
return;
} // .end method
public void setPadding ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->d:I */
/* if-ge p4, v0, :cond_0 */
/* move p4, v0 */
} // :cond_0
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v4/view/PagerTitleStrip;->setPadding(IIII)V */
return;
} // .end method
public void setTabIndicatorColor ( Integer p0 ) {
/* .locals 1 */
/* iput p1, p0, Landroid/support/v4/view/PagerTabStrip;->b:I */
p1 = this.a;
/* iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->b:I */
(( android.graphics.Paint ) p1 ).setColor ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V
(( android.support.v4.view.PagerTabStrip ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->invalidate()V
return;
} // .end method
public void setTabIndicatorColorResource ( Integer p0 ) {
/* .locals 1 */
(( android.support.v4.view.PagerTabStrip ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getContext()Landroid/content/Context;
p1 = ce .a ( v0,p1 );
(( android.support.v4.view.PagerTabStrip ) p0 ).setTabIndicatorColor ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/view/PagerTabStrip;->setTabIndicatorColor(I)V
return;
} // .end method
public void setTextSpacing ( Integer p0 ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->e:I */
/* if-ge p1, v0, :cond_0 */
/* move p1, v0 */
} // :cond_0
/* invoke-super {p0, p1}, Landroid/support/v4/view/PagerTitleStrip;->setTextSpacing(I)V */
return;
} // .end method
