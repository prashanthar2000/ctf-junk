public class android.support.v7.widget.LinearLayoutCompat extends android.view.ViewGroup {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
	 /* } */
} // .end annotation
/* # instance fields */
private Float a;
private Integer a;
private android.graphics.drawable.Drawable a;
private Boolean a;
private a;
private Integer b;
private Boolean b;
private b;
private Integer c;
private Integer d;
private Integer e;
private Integer f;
private Integer g;
private Integer h;
private Integer i;
/* # direct methods */
public android.support.v7.widget.LinearLayoutCompat ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 return;
} // .end method
public android.support.v7.widget.LinearLayoutCompat ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 return;
} // .end method
public android.support.v7.widget.LinearLayoutCompat ( ) {
	 /* .locals 4 */
	 /* invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutCompat;->a:Z */
	 int v1 = -1; // const/4 v1, -0x1
	 /* iput v1, p0, Landroid/support/v7/widget/LinearLayoutCompat;->a:I */
	 int v2 = 0; // const/4 v2, 0x0
	 /* iput v2, p0, Landroid/support/v7/widget/LinearLayoutCompat;->b:I */
	 /* const v3, 0x800033 */
	 /* iput v3, p0, Landroid/support/v7/widget/LinearLayoutCompat;->d:I */
	 v3 = gc$j.LinearLayoutCompat;
	 ip .a ( p1,p2,v3,p3,v2 );
	 p2 = 	 (( ip ) p1 ).a ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lip;->a(II)I
	 /* if-ltz p2, :cond_0 */
	 (( android.support.v7.widget.LinearLayoutCompat ) p0 ).setOrientation ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/widget/LinearLayoutCompat;->setOrientation(I)V
} // :cond_0
p2 = (( ip ) p1 ).a ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lip;->a(II)I
/* if-ltz p2, :cond_1 */
(( android.support.v7.widget.LinearLayoutCompat ) p0 ).setGravity ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/widget/LinearLayoutCompat;->setGravity(I)V
} // :cond_1
p2 = (( ip ) p1 ).a ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Lip;->a(IZ)Z
/* if-nez p2, :cond_2 */
(( android.support.v7.widget.LinearLayoutCompat ) p0 ).setBaselineAligned ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/widget/LinearLayoutCompat;->setBaselineAligned(Z)V
} // :cond_2
p3 = this.a;
/* const/high16 v0, -0x40800000 # -1.0f */
p2 = (( android.content.res.TypedArray ) p3 ).getFloat ( p2, v0 ); // invoke-virtual {p3, p2, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F
/* iput p2, p0, Landroid/support/v7/widget/LinearLayoutCompat;->a:F */
p2 = (( ip ) p1 ).a ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lip;->a(II)I
/* iput p2, p0, Landroid/support/v7/widget/LinearLayoutCompat;->a:I */
p2 = (( ip ) p1 ).a ( p2, v2 ); // invoke-virtual {p1, p2, v2}, Lip;->a(IZ)Z
/* iput-boolean p2, p0, Landroid/support/v7/widget/LinearLayoutCompat;->b:Z */
(( ip ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lip;->a(I)Landroid/graphics/drawable/Drawable;
(( android.support.v7.widget.LinearLayoutCompat ) p0 ).setDividerDrawable ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/v7/widget/LinearLayoutCompat;->setDividerDrawable(Landroid/graphics/drawable/Drawable;)V
p2 = (( ip ) p1 ).a ( p2, v2 ); // invoke-virtual {p1, p2, v2}, Lip;->a(II)I
/* iput p2, p0, Landroid/support/v7/widget/LinearLayoutCompat;->h:I */
p2 = (( ip ) p1 ).e ( p2, v2 ); // invoke-virtual {p1, p2, v2}, Lip;->e(II)I
/* iput p2, p0, Landroid/support/v7/widget/LinearLayoutCompat;->i:I */
p1 = this.a;
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
return;
} // .end method
private void a ( Integer p0, Integer p1 ) {
/* .locals 10 */
v0 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getMeasuredWidth()I
/* const/high16 v1, 0x40000000 # 2.0f */
v0 = android.view.View$MeasureSpec .makeMeasureSpec ( v0,v1 );
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, p1, :cond_1 */
(( android.support.v7.widget.LinearLayoutCompat ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildAt(I)Landroid/view/View;
v2 = (( android.view.View ) v3 ).getVisibility ( ); // invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
/* const/16 v4, 0x8 */
/* if-eq v2, v4, :cond_0 */
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* move-object v8, v2 */
/* check-cast v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
/* iget v2, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->width:I */
int v4 = -1; // const/4 v4, -0x1
/* if-ne v2, v4, :cond_0 */
/* iget v9, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->height:I */
v2 = (( android.view.View ) v3 ).getMeasuredHeight ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I
/* iput v2, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->height:I */
int v5 = 0; // const/4 v5, 0x0
int v7 = 0; // const/4 v7, 0x0
/* move-object v2, p0 */
/* move v4, v0 */
/* move v6, p2 */
/* invoke-virtual/range {v2 ..v7}, Landroid/support/v7/widget/LinearLayoutCompat;->measureChildWithMargins(Landroid/view/View;IIII)V */
/* iput v9, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->height:I */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
return;
} // .end method
private void a ( android.graphics.Canvas p0, Integer p1 ) {
/* .locals 4 */
v0 = this.a;
v1 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingLeft()I
/* iget v2, p0, Landroid/support/v7/widget/LinearLayoutCompat;->i:I */
/* add-int/2addr v1, v2 */
v2 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getWidth()I
v3 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingRight()I
/* sub-int/2addr v2, v3 */
/* iget v3, p0, Landroid/support/v7/widget/LinearLayoutCompat;->i:I */
/* sub-int/2addr v2, v3 */
/* iget v3, p0, Landroid/support/v7/widget/LinearLayoutCompat;->g:I */
/* add-int/2addr v3, p2 */
(( android.graphics.drawable.Drawable ) v0 ).setBounds ( v1, p2, v2, v3 ); // invoke-virtual {v0, v1, p2, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
p2 = this.a;
(( android.graphics.drawable.Drawable ) p2 ).draw ( p1 ); // invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
return;
} // .end method
private void a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
/* invoke-virtual/range {p0 ..p5}, Landroid/support/v7/widget/LinearLayoutCompat;->measureChildWithMargins(Landroid/view/View;IIII)V */
return;
} // .end method
private void b ( Integer p0, Integer p1 ) {
/* .locals 36 */
/* move-object/from16 v6, p0 */
/* move/from16 v7, p2 */
int v8 = 0; // const/4 v8, 0x0
/* iput v8, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
v9 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getVirtualChildCount()I */
v10 = /* invoke-static/range {p1 ..p1}, Landroid/view/View$MeasureSpec;->getMode(I)I */
v11 = /* invoke-static/range {p2 ..p2}, Landroid/view/View$MeasureSpec;->getMode(I)I */
v0 = this.a;
int v12 = 4; // const/4 v12, 0x4
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.b;
/* if-nez v0, :cond_1 */
} // :cond_0
/* new-array v0, v12, [I */
this.a = v0;
/* new-array v0, v12, [I */
this.b = v0;
} // :cond_1
v13 = this.a;
v14 = this.b;
int v15 = 3; // const/4 v15, 0x3
int v5 = -1; // const/4 v5, -0x1
/* aput v5, v13, v15 */
/* const/16 v16, 0x2 */
/* aput v5, v13, v16 */
/* const/16 v17, 0x1 */
/* aput v5, v13, v17 */
/* aput v5, v13, v8 */
/* aput v5, v14, v15 */
/* aput v5, v14, v16 */
/* aput v5, v14, v17 */
/* aput v5, v14, v8 */
/* iget-boolean v4, v6, Landroid/support/v7/widget/LinearLayoutCompat;->a:Z */
/* iget-boolean v3, v6, Landroid/support/v7/widget/LinearLayoutCompat;->b:Z */
/* const/high16 v2, 0x40000000 # 2.0f */
/* if-ne v10, v2, :cond_2 */
/* const/16 v18, 0x1 */
} // :cond_2
/* const/16 v18, 0x0 */
} // :goto_0
/* const/16 v19, 0x0 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
int v12 = 0; // const/4 v12, 0x0
int v15 = 0; // const/4 v15, 0x0
/* const/16 v20, 0x0 */
/* const/16 v21, 0x0 */
/* const/16 v22, 0x0 */
/* const/16 v24, 0x0 */
/* const/16 v25, 0x1 */
/* const/16 v26, 0x0 */
} // :goto_1
/* const/16 v5, 0x8 */
/* if-ge v1, v9, :cond_15 */
(( android.support.v7.widget.LinearLayoutCompat ) v6 ).getChildAt ( v1 ); // invoke-virtual {v6, v1}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildAt(I)Landroid/view/View;
/* if-nez v2, :cond_3 */
/* iget v2, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* add-int/2addr v2, v8 */
/* iput v2, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* move/from16 v31, v0 */
/* move v0, v1 */
/* move/from16 v35, v3 */
/* move/from16 v28, v4 */
/* const/high16 v1, 0x40000000 # 2.0f */
/* goto/16 :goto_d */
} // :cond_3
v8 = (( android.view.View ) v2 ).getVisibility ( ); // invoke-virtual {v2}, Landroid/view/View;->getVisibility()I
/* if-eq v8, v5, :cond_14 */
v5 = (( android.support.v7.widget.LinearLayoutCompat ) v6 ).a ( v1 ); // invoke-virtual {v6, v1}, Landroid/support/v7/widget/LinearLayoutCompat;->a(I)Z
if ( v5 != null) { // if-eqz v5, :cond_4
/* iget v5, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* iget v8, v6, Landroid/support/v7/widget/LinearLayoutCompat;->f:I */
/* add-int/2addr v5, v8 */
/* iput v5, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
} // :cond_4
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* move-object v8, v5 */
/* check-cast v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
/* iget v5, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->a:F */
/* add-float v31, v0, v5 */
/* const/high16 v5, 0x40000000 # 2.0f */
/* if-ne v10, v5, :cond_7 */
/* iget v0, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->width:I */
/* if-nez v0, :cond_7 */
/* iget v0, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->a:F */
/* cmpl-float v0, v0, v19 */
/* if-lez v0, :cond_7 */
if ( v18 != null) { // if-eqz v18, :cond_5
/* iget v0, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* iget v5, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->leftMargin:I */
/* move/from16 v32, v1 */
/* iget v1, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->rightMargin:I */
/* add-int/2addr v5, v1 */
/* add-int/2addr v0, v5 */
} // :cond_5
/* move/from16 v32, v1 */
/* iget v0, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* iget v1, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->leftMargin:I */
/* add-int/2addr v1, v0 */
/* iget v5, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->rightMargin:I */
/* add-int/2addr v1, v5 */
v0 = java.lang.Math .max ( v0,v1 );
} // :goto_2
/* iput v0, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
if ( v4 != null) { // if-eqz v4, :cond_6
int v0 = 0; // const/4 v0, 0x0
v1 = android.view.View$MeasureSpec .makeMeasureSpec ( v0,v0 );
(( android.view.View ) v2 ).measure ( v1, v1 ); // invoke-virtual {v2, v1, v1}, Landroid/view/View;->measure(II)V
/* move-object/from16 v30, v2 */
/* move/from16 v35, v3 */
/* move/from16 v28, v4 */
/* const/16 v29, -0x2 */
/* goto/16 :goto_6 */
} // :cond_6
/* move-object/from16 v30, v2 */
/* move/from16 v35, v3 */
/* move/from16 v28, v4 */
/* const/high16 v1, 0x40000000 # 2.0f */
/* const/16 v22, 0x1 */
/* const/16 v29, -0x2 */
/* goto/16 :goto_7 */
} // :cond_7
/* move/from16 v32, v1 */
/* iget v0, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->width:I */
/* if-nez v0, :cond_8 */
/* iget v0, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->a:F */
/* cmpl-float v0, v0, v19 */
/* if-lez v0, :cond_8 */
int v5 = -2; // const/4 v5, -0x2
/* iput v5, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->width:I */
int v1 = 0; // const/4 v1, 0x0
} // :cond_8
int v5 = -2; // const/4 v5, -0x2
/* const/high16 v1, -0x80000000 */
} // :goto_3
/* cmpl-float v0, v31, v19 */
/* if-nez v0, :cond_9 */
/* iget v0, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* move/from16 v28, v0 */
} // :cond_9
/* const/16 v28, 0x0 */
} // :goto_4
/* const/16 v33, 0x0 */
/* move-object/from16 v0, p0 */
/* move/from16 v34, v1 */
/* move-object v1, v2 */
/* move-object/from16 v30, v2 */
/* move/from16 v2, p1 */
/* move/from16 v35, v3 */
/* move/from16 v3, v28 */
/* move/from16 v28, v4 */
/* move/from16 v4, p2 */
/* const/high16 v7, -0x80000000 */
/* const/16 v29, -0x2 */
/* move/from16 v5, v33 */
/* invoke-direct/range {v0 ..v5}, Landroid/support/v7/widget/LinearLayoutCompat;->a(Landroid/view/View;IIII)V */
/* move/from16 v0, v34 */
/* if-eq v0, v7, :cond_a */
/* iput v0, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->width:I */
} // :cond_a
v0 = /* invoke-virtual/range {v30 ..v30}, Landroid/view/View;->getMeasuredWidth()I */
if ( v18 != null) { // if-eqz v18, :cond_b
/* iget v1, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* iget v2, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->leftMargin:I */
/* add-int/2addr v2, v0 */
/* iget v3, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->rightMargin:I */
/* add-int/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
/* add-int/2addr v2, v3 */
/* add-int/2addr v1, v2 */
} // :cond_b
int v3 = 0; // const/4 v3, 0x0
/* iget v1, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* add-int v2, v1, v0 */
/* iget v4, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->leftMargin:I */
/* add-int/2addr v2, v4 */
/* iget v4, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->rightMargin:I */
/* add-int/2addr v2, v4 */
/* add-int/2addr v2, v3 */
v1 = java.lang.Math .max ( v1,v2 );
} // :goto_5
/* iput v1, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
if ( v35 != null) { // if-eqz v35, :cond_c
v12 = java.lang.Math .max ( v0,v12 );
} // :cond_c
} // :goto_6
/* const/high16 v1, 0x40000000 # 2.0f */
} // :goto_7
/* if-eq v11, v1, :cond_d */
/* iget v0, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->height:I */
int v2 = -1; // const/4 v2, -0x1
/* if-ne v0, v2, :cond_d */
int v0 = 1; // const/4 v0, 0x1
/* const/16 v26, 0x1 */
} // :cond_d
int v0 = 0; // const/4 v0, 0x0
} // :goto_8
/* iget v2, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->topMargin:I */
/* iget v3, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->bottomMargin:I */
/* add-int/2addr v2, v3 */
v3 = /* invoke-virtual/range {v30 ..v30}, Landroid/view/View;->getMeasuredHeight()I */
/* add-int/2addr v3, v2 */
v4 = /* invoke-virtual/range {v30 ..v30}, Landroid/view/View;->getMeasuredState()I */
/* move/from16 v5, v24 */
v24 = android.view.View .combineMeasuredStates ( v5,v4 );
if ( v28 != null) { // if-eqz v28, :cond_f
v4 = /* invoke-virtual/range {v30 ..v30}, Landroid/view/View;->getBaseline()I */
int v5 = -1; // const/4 v5, -0x1
/* if-eq v4, v5, :cond_f */
/* iget v5, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->c:I */
/* if-gez v5, :cond_e */
/* iget v5, v6, Landroid/support/v7/widget/LinearLayoutCompat;->d:I */
} // :cond_e
/* iget v5, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->c:I */
} // :goto_9
/* and-int/lit8 v5, v5, 0x70 */
int v7 = 4; // const/4 v7, 0x4
/* shr-int/2addr v5, v7 */
/* and-int/lit8 v5, v5, -0x2 */
/* shr-int/lit8 v5, v5, 0x1 */
/* aget v7, v13, v5 */
v7 = java.lang.Math .max ( v7,v4 );
/* aput v7, v13, v5 */
/* aget v7, v14, v5 */
/* sub-int v4, v3, v4 */
v4 = java.lang.Math .max ( v7,v4 );
/* aput v4, v14, v5 */
} // :cond_f
v15 = java.lang.Math .max ( v15,v3 );
if ( v25 != null) { // if-eqz v25, :cond_10
/* iget v4, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->height:I */
int v5 = -1; // const/4 v5, -0x1
/* if-ne v4, v5, :cond_10 */
/* const/16 v25, 0x1 */
} // :cond_10
/* const/16 v25, 0x0 */
} // :goto_a
/* iget v4, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->a:F */
/* cmpl-float v4, v4, v19 */
/* if-lez v4, :cond_12 */
if ( v0 != null) { // if-eqz v0, :cond_11
} // :cond_11
/* move v2, v3 */
} // :goto_b
/* move/from16 v8, v21 */
v21 = java.lang.Math .max ( v8,v2 );
/* move/from16 v8, v21 */
} // :cond_12
/* move/from16 v8, v21 */
if ( v0 != null) { // if-eqz v0, :cond_13
/* move v3, v2 */
} // :cond_13
/* move/from16 v2, v20 */
v20 = java.lang.Math .max ( v2,v3 );
} // :cond_14
/* move/from16 v32, v1 */
/* move/from16 v35, v3 */
/* move/from16 v28, v4 */
/* move/from16 v2, v20 */
/* move/from16 v8, v21 */
/* move/from16 v5, v24 */
/* const/high16 v1, 0x40000000 # 2.0f */
/* move/from16 v31, v0 */
} // :goto_c
/* add-int/lit8 v0, v32, 0x0 */
/* move/from16 v21, v8 */
} // :goto_d
/* add-int/lit8 v0, v0, 0x1 */
/* move v1, v0 */
/* move/from16 v4, v28 */
/* move/from16 v0, v31 */
/* move/from16 v3, v35 */
/* const/high16 v2, 0x40000000 # 2.0f */
int v5 = -1; // const/4 v5, -0x1
/* move/from16 v7, p2 */
int v8 = 0; // const/4 v8, 0x0
/* goto/16 :goto_1 */
} // :cond_15
/* move/from16 v35, v3 */
/* move/from16 v28, v4 */
/* move/from16 v2, v20 */
/* move/from16 v8, v21 */
/* const/high16 v1, 0x40000000 # 2.0f */
/* const/high16 v7, -0x80000000 */
/* const/16 v29, -0x2 */
/* iget v3, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* if-lez v3, :cond_16 */
v3 = (( android.support.v7.widget.LinearLayoutCompat ) v6 ).a ( v9 ); // invoke-virtual {v6, v9}, Landroid/support/v7/widget/LinearLayoutCompat;->a(I)Z
if ( v3 != null) { // if-eqz v3, :cond_16
/* iget v3, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* iget v4, v6, Landroid/support/v7/widget/LinearLayoutCompat;->f:I */
/* add-int/2addr v3, v4 */
/* iput v3, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
} // :cond_16
/* aget v3, v13, v17 */
int v4 = -1; // const/4 v4, -0x1
/* if-ne v3, v4, :cond_17 */
int v3 = 0; // const/4 v3, 0x0
/* aget v1, v13, v3 */
/* if-ne v1, v4, :cond_17 */
/* aget v1, v13, v16 */
/* if-ne v1, v4, :cond_17 */
int v1 = 3; // const/4 v1, 0x3
/* aget v3, v13, v1 */
/* if-eq v3, v4, :cond_18 */
} // :cond_17
int v1 = 3; // const/4 v1, 0x3
} // :goto_e
/* aget v3, v13, v1 */
int v4 = 0; // const/4 v4, 0x0
/* aget v5, v13, v4 */
/* aget v7, v13, v17 */
/* aget v4, v13, v16 */
v4 = java.lang.Math .max ( v7,v4 );
v4 = java.lang.Math .max ( v5,v4 );
v3 = java.lang.Math .max ( v3,v4 );
/* aget v4, v14, v1 */
int v1 = 0; // const/4 v1, 0x0
/* aget v5, v14, v1 */
/* aget v1, v14, v17 */
/* aget v7, v14, v16 */
v1 = java.lang.Math .max ( v1,v7 );
v1 = java.lang.Math .max ( v5,v1 );
v1 = java.lang.Math .max ( v4,v1 );
/* add-int/2addr v3, v1 */
v15 = java.lang.Math .max ( v15,v3 );
} // :cond_18
if ( v35 != null) { // if-eqz v35, :cond_1d
/* const/high16 v1, -0x80000000 */
/* if-eq v10, v1, :cond_19 */
/* if-nez v10, :cond_1d */
} // :cond_19
int v1 = 0; // const/4 v1, 0x0
/* iput v1, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
int v3 = 0; // const/4 v3, 0x0
} // :goto_f
/* if-ge v3, v9, :cond_1d */
(( android.support.v7.widget.LinearLayoutCompat ) v6 ).getChildAt ( v3 ); // invoke-virtual {v6, v3}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildAt(I)Landroid/view/View;
/* if-nez v4, :cond_1a */
/* iget v4, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* add-int/2addr v4, v1 */
} // :goto_10
/* iput v4, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
} // :cond_1a
v1 = (( android.view.View ) v4 ).getVisibility ( ); // invoke-virtual {v4}, Landroid/view/View;->getVisibility()I
/* const/16 v5, 0x8 */
/* if-ne v1, v5, :cond_1b */
/* add-int/lit8 v3, v3, 0x0 */
} // :cond_1b
(( android.view.View ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
if ( v18 != null) { // if-eqz v18, :cond_1c
/* iget v4, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* iget v5, v1, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->leftMargin:I */
/* add-int/2addr v5, v12 */
/* iget v1, v1, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->rightMargin:I */
/* add-int/2addr v5, v1 */
int v7 = 0; // const/4 v7, 0x0
/* add-int/2addr v5, v7 */
/* add-int/2addr v4, v5 */
} // :cond_1c
int v7 = 0; // const/4 v7, 0x0
/* iget v4, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* add-int v5, v4, v12 */
/* iget v7, v1, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->leftMargin:I */
/* add-int/2addr v5, v7 */
/* iget v1, v1, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->rightMargin:I */
/* add-int/2addr v5, v1 */
int v1 = 0; // const/4 v1, 0x0
/* add-int/2addr v5, v1 */
v1 = java.lang.Math .max ( v4,v5 );
/* iput v1, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
} // :goto_11
/* add-int/lit8 v3, v3, 0x1 */
int v1 = 0; // const/4 v1, 0x0
} // :cond_1d
/* iget v1, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingLeft()I */
v4 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingRight()I */
/* add-int/2addr v3, v4 */
/* add-int/2addr v1, v3 */
/* iput v1, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* iget v1, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getSuggestedMinimumWidth()I */
v1 = java.lang.Math .max ( v1,v3 );
/* move/from16 v7, p1 */
int v3 = 0; // const/4 v3, 0x0
v1 = android.view.View .resolveSizeAndState ( v1,v7,v3 );
/* const v3, 0xffffff */
/* and-int/2addr v3, v1 */
/* iget v4, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* sub-int/2addr v3, v4 */
/* if-nez v22, :cond_21 */
if ( v3 != null) { // if-eqz v3, :cond_1e
/* cmpl-float v5, v0, v19 */
/* if-lez v5, :cond_1e */
} // :cond_1e
v0 = java.lang.Math .max ( v2,v8 );
if ( v35 != null) { // if-eqz v35, :cond_20
/* const/high16 v2, 0x40000000 # 2.0f */
/* if-eq v10, v2, :cond_20 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_12
/* if-ge v2, v9, :cond_20 */
(( android.support.v7.widget.LinearLayoutCompat ) v6 ).getChildAt ( v2 ); // invoke-virtual {v6, v2}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildAt(I)Landroid/view/View;
if ( v3 != null) { // if-eqz v3, :cond_1f
v5 = (( android.view.View ) v3 ).getVisibility ( ); // invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
/* const/16 v8, 0x8 */
/* if-eq v5, v8, :cond_1f */
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v5, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
/* iget v5, v5, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->a:F */
/* cmpl-float v5, v5, v19 */
/* if-lez v5, :cond_1f */
/* const/high16 v5, 0x40000000 # 2.0f */
v8 = android.view.View$MeasureSpec .makeMeasureSpec ( v12,v5 );
v10 = (( android.view.View ) v3 ).getMeasuredHeight ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I
v10 = android.view.View$MeasureSpec .makeMeasureSpec ( v10,v5 );
(( android.view.View ) v3 ).measure ( v8, v10 ); // invoke-virtual {v3, v8, v10}, Landroid/view/View;->measure(II)V
} // :cond_1f
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_20
/* move/from16 v27, v1 */
/* move/from16 v22, v9 */
/* move/from16 v8, v24 */
int v2 = 0; // const/4 v2, 0x0
/* move/from16 v3, p2 */
/* goto/16 :goto_22 */
} // :cond_21
} // :goto_13
/* iget v5, v6, Landroid/support/v7/widget/LinearLayoutCompat;->a:F */
/* cmpl-float v8, v5, v19 */
/* if-lez v8, :cond_22 */
/* move v0, v5 */
} // :cond_22
int v5 = -1; // const/4 v5, -0x1
int v8 = 3; // const/4 v8, 0x3
/* aput v5, v13, v8 */
/* aput v5, v13, v16 */
/* aput v5, v13, v17 */
int v12 = 0; // const/4 v12, 0x0
/* aput v5, v13, v12 */
/* aput v5, v14, v8 */
/* aput v5, v14, v16 */
/* aput v5, v14, v17 */
/* aput v5, v14, v12 */
/* iput v12, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* move v12, v2 */
/* move/from16 v8, v24 */
int v15 = -1; // const/4 v15, -0x1
/* move v2, v0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_14
/* if-ge v0, v9, :cond_30 */
(( android.support.v7.widget.LinearLayoutCompat ) v6 ).getChildAt ( v0 ); // invoke-virtual {v6, v0}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildAt(I)Landroid/view/View;
if ( v5 != null) { // if-eqz v5, :cond_2f
v4 = (( android.view.View ) v5 ).getVisibility ( ); // invoke-virtual {v5}, Landroid/view/View;->getVisibility()I
/* const/16 v7, 0x8 */
/* if-eq v4, v7, :cond_2f */
(( android.view.View ) v5 ).getLayoutParams ( ); // invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v4, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
/* iget v7, v4, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->a:F */
/* cmpl-float v22, v7, v19 */
/* if-lez v22, :cond_27 */
/* move/from16 v22, v9 */
/* int-to-float v9, v3 */
/* mul-float v9, v9, v7 */
/* div-float/2addr v9, v2 */
/* float-to-int v9, v9 */
/* sub-float/2addr v2, v7 */
/* sub-int/2addr v3, v9 */
v7 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingTop()I */
v24 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingBottom()I */
/* add-int v7, v7, v24 */
/* move/from16 v24, v2 */
/* iget v2, v4, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->topMargin:I */
/* add-int/2addr v7, v2 */
/* iget v2, v4, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->bottomMargin:I */
/* add-int/2addr v7, v2 */
/* iget v2, v4, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->height:I */
/* move/from16 v27, v1 */
/* move/from16 v30, v3 */
int v1 = -1; // const/4 v1, -0x1
/* move/from16 v3, p2 */
v2 = android.support.v7.widget.LinearLayoutCompat .getChildMeasureSpec ( v3,v7,v2 );
/* iget v7, v4, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->width:I */
/* if-nez v7, :cond_25 */
/* const/high16 v7, 0x40000000 # 2.0f */
/* if-eq v10, v7, :cond_23 */
} // :cond_23
/* if-lez v9, :cond_24 */
/* move v7, v9 */
} // :cond_24
} // :goto_15
int v7 = 0; // const/4 v7, 0x0
} // :cond_25
} // :goto_16
v7 = (( android.view.View ) v5 ).getMeasuredWidth ( ); // invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I
/* add-int/2addr v7, v9 */
/* if-gez v7, :cond_26 */
} // :cond_26
} // :goto_17
/* const/high16 v9, 0x40000000 # 2.0f */
v7 = android.view.View$MeasureSpec .makeMeasureSpec ( v7,v9 );
(( android.view.View ) v5 ).measure ( v7, v2 ); // invoke-virtual {v5, v7, v2}, Landroid/view/View;->measure(II)V
v2 = (( android.view.View ) v5 ).getMeasuredState ( ); // invoke-virtual {v5}, Landroid/view/View;->getMeasuredState()I
/* const/high16 v7, -0x1000000 */
/* and-int/2addr v2, v7 */
v8 = android.view.View .combineMeasuredStates ( v8,v2 );
/* move/from16 v2, v24 */
} // :cond_27
/* move/from16 v27, v1 */
/* move v7, v3 */
/* move/from16 v22, v9 */
int v1 = -1; // const/4 v1, -0x1
/* move/from16 v3, p2 */
/* move/from16 v30, v7 */
} // :goto_18
if ( v18 != null) { // if-eqz v18, :cond_28
/* iget v7, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
v9 = (( android.view.View ) v5 ).getMeasuredWidth ( ); // invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I
/* iget v1, v4, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->leftMargin:I */
/* add-int/2addr v9, v1 */
/* iget v1, v4, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->rightMargin:I */
/* add-int/2addr v9, v1 */
int v1 = 0; // const/4 v1, 0x0
/* add-int/2addr v9, v1 */
/* add-int/2addr v7, v9 */
/* iput v7, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
} // :cond_28
int v1 = 0; // const/4 v1, 0x0
/* iget v7, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
v9 = (( android.view.View ) v5 ).getMeasuredWidth ( ); // invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I
/* add-int/2addr v9, v7 */
/* iget v1, v4, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->leftMargin:I */
/* add-int/2addr v9, v1 */
/* iget v1, v4, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->rightMargin:I */
/* add-int/2addr v9, v1 */
int v1 = 0; // const/4 v1, 0x0
/* add-int/2addr v9, v1 */
v1 = java.lang.Math .max ( v7,v9 );
/* iput v1, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
} // :goto_19
/* const/high16 v1, 0x40000000 # 2.0f */
/* if-eq v11, v1, :cond_29 */
/* iget v1, v4, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->height:I */
int v7 = -1; // const/4 v7, -0x1
/* if-ne v1, v7, :cond_29 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_29
int v1 = 0; // const/4 v1, 0x0
} // :goto_1a
/* iget v7, v4, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->topMargin:I */
/* iget v9, v4, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->bottomMargin:I */
/* add-int/2addr v7, v9 */
v9 = (( android.view.View ) v5 ).getMeasuredHeight ( ); // invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v9, v7 */
v15 = java.lang.Math .max ( v15,v9 );
if ( v1 != null) { // if-eqz v1, :cond_2a
} // :cond_2a
/* move v7, v9 */
} // :goto_1b
v1 = java.lang.Math .max ( v12,v7 );
if ( v25 != null) { // if-eqz v25, :cond_2b
/* iget v7, v4, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->height:I */
int v12 = -1; // const/4 v12, -0x1
/* if-ne v7, v12, :cond_2c */
int v7 = 1; // const/4 v7, 0x1
} // :cond_2b
int v12 = -1; // const/4 v12, -0x1
} // :cond_2c
int v7 = 0; // const/4 v7, 0x0
} // :goto_1c
if ( v28 != null) { // if-eqz v28, :cond_2e
v5 = (( android.view.View ) v5 ).getBaseline ( ); // invoke-virtual {v5}, Landroid/view/View;->getBaseline()I
/* if-eq v5, v12, :cond_2e */
/* iget v12, v4, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->c:I */
/* if-gez v12, :cond_2d */
/* iget v4, v6, Landroid/support/v7/widget/LinearLayoutCompat;->d:I */
} // :cond_2d
/* iget v4, v4, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->c:I */
} // :goto_1d
/* and-int/lit8 v4, v4, 0x70 */
/* const/16 v23, 0x4 */
/* shr-int/lit8 v4, v4, 0x4 */
/* and-int/lit8 v4, v4, -0x2 */
/* shr-int/lit8 v4, v4, 0x1 */
/* aget v12, v13, v4 */
v12 = java.lang.Math .max ( v12,v5 );
/* aput v12, v13, v4 */
/* aget v12, v14, v4 */
/* sub-int/2addr v9, v5 */
v5 = java.lang.Math .max ( v12,v9 );
/* aput v5, v14, v4 */
} // :cond_2e
/* const/16 v23, 0x4 */
} // :goto_1e
/* move v12, v1 */
/* move/from16 v25, v7 */
} // :cond_2f
/* move/from16 v27, v1 */
/* move v7, v3 */
/* move/from16 v22, v9 */
/* move/from16 v3, p2 */
/* const/16 v23, 0x4 */
/* move/from16 v30, v7 */
} // :goto_1f
/* add-int/lit8 v0, v0, 0x1 */
/* move/from16 v9, v22 */
/* move/from16 v1, v27 */
/* move/from16 v3, v30 */
int v5 = -1; // const/4 v5, -0x1
/* move/from16 v7, p1 */
/* goto/16 :goto_14 */
} // :cond_30
/* move/from16 v27, v1 */
/* move/from16 v22, v9 */
/* move/from16 v3, p2 */
/* iget v0, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingLeft()I */
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingRight()I */
/* add-int/2addr v1, v2 */
/* add-int/2addr v0, v1 */
/* iput v0, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* aget v0, v13, v17 */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_32 */
int v0 = 0; // const/4 v0, 0x0
/* aget v2, v13, v0 */
/* if-ne v2, v1, :cond_32 */
/* aget v0, v13, v16 */
/* if-ne v0, v1, :cond_32 */
int v0 = 3; // const/4 v0, 0x3
/* aget v2, v13, v0 */
/* if-eq v2, v1, :cond_31 */
} // :cond_31
int v2 = 0; // const/4 v2, 0x0
} // :cond_32
int v0 = 3; // const/4 v0, 0x3
} // :goto_20
/* aget v1, v13, v0 */
int v2 = 0; // const/4 v2, 0x0
/* aget v4, v13, v2 */
/* aget v5, v13, v17 */
/* aget v7, v13, v16 */
v5 = java.lang.Math .max ( v5,v7 );
v4 = java.lang.Math .max ( v4,v5 );
v1 = java.lang.Math .max ( v1,v4 );
/* aget v0, v14, v0 */
/* aget v4, v14, v2 */
/* aget v5, v14, v17 */
/* aget v7, v14, v16 */
v5 = java.lang.Math .max ( v5,v7 );
v4 = java.lang.Math .max ( v4,v5 );
v0 = java.lang.Math .max ( v0,v4 );
/* add-int/2addr v1, v0 */
v0 = java.lang.Math .max ( v15,v1 );
/* move v15, v0 */
} // :goto_21
/* move v0, v12 */
} // :goto_22
/* if-nez v25, :cond_33 */
/* const/high16 v1, 0x40000000 # 2.0f */
/* if-eq v11, v1, :cond_33 */
/* move v15, v0 */
} // :cond_33
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingTop()I */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingBottom()I */
/* add-int/2addr v0, v1 */
/* add-int/2addr v15, v0 */
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getSuggestedMinimumHeight()I */
v0 = java.lang.Math .max ( v15,v0 );
/* const/high16 v1, -0x1000000 */
/* and-int/2addr v1, v8 */
/* or-int v1, v27, v1 */
/* shl-int/lit8 v4, v8, 0x10 */
v0 = android.view.View .resolveSizeAndState ( v0,v3,v4 );
(( android.support.v7.widget.LinearLayoutCompat ) v6 ).setMeasuredDimension ( v1, v0 ); // invoke-virtual {v6, v1, v0}, Landroid/support/v7/widget/LinearLayoutCompat;->setMeasuredDimension(II)V
if ( v26 != null) { // if-eqz v26, :cond_35
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getMeasuredHeight()I */
/* const/high16 v1, 0x40000000 # 2.0f */
v7 = android.view.View$MeasureSpec .makeMeasureSpec ( v0,v1 );
/* move/from16 v8, v22 */
int v9 = 0; // const/4 v9, 0x0
} // :goto_23
/* if-ge v9, v8, :cond_35 */
(( android.support.v7.widget.LinearLayoutCompat ) v6 ).getChildAt ( v9 ); // invoke-virtual {v6, v9}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildAt(I)Landroid/view/View;
v0 = (( android.view.View ) v1 ).getVisibility ( ); // invoke-virtual {v1}, Landroid/view/View;->getVisibility()I
/* const/16 v5, 0x8 */
/* if-eq v0, v5, :cond_34 */
(( android.view.View ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* move-object v10, v0 */
/* check-cast v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
/* iget v0, v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->height:I */
int v2 = -1; // const/4 v2, -0x1
/* if-ne v0, v2, :cond_34 */
/* iget v11, v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->width:I */
v0 = (( android.view.View ) v1 ).getMeasuredWidth ( ); // invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I
/* iput v0, v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->width:I */
int v3 = 0; // const/4 v3, 0x0
int v12 = 0; // const/4 v12, 0x0
/* move-object/from16 v0, p0 */
int v13 = -1; // const/4 v13, -0x1
/* move/from16 v2, p1 */
/* move v4, v7 */
/* const/16 v14, 0x8 */
/* move v5, v12 */
/* invoke-virtual/range {v0 ..v5}, Landroid/support/v7/widget/LinearLayoutCompat;->measureChildWithMargins(Landroid/view/View;IIII)V */
/* iput v11, v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->width:I */
} // :cond_34
int v13 = -1; // const/4 v13, -0x1
/* const/16 v14, 0x8 */
} // :goto_24
/* add-int/lit8 v9, v9, 0x1 */
} // :cond_35
return;
} // .end method
private void b ( android.graphics.Canvas p0, Integer p1 ) {
/* .locals 5 */
v0 = this.a;
v1 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingTop()I
/* iget v2, p0, Landroid/support/v7/widget/LinearLayoutCompat;->i:I */
/* add-int/2addr v1, v2 */
/* iget v2, p0, Landroid/support/v7/widget/LinearLayoutCompat;->f:I */
/* add-int/2addr v2, p2 */
v3 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getHeight()I
v4 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingBottom()I
/* sub-int/2addr v3, v4 */
/* iget v4, p0, Landroid/support/v7/widget/LinearLayoutCompat;->i:I */
/* sub-int/2addr v3, v4 */
(( android.graphics.drawable.Drawable ) v0 ).setBounds ( p2, v1, v2, v3 ); // invoke-virtual {v0, p2, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
p2 = this.a;
(( android.graphics.drawable.Drawable ) p2 ).draw ( p1 ); // invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
return;
} // .end method
private static void b ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
/* add-int/2addr p3, p1 */
/* add-int/2addr p4, p2 */
(( android.view.View ) p0 ).layout ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->layout(IIII)V
return;
} // .end method
private static Integer getChildrenSkipCount$5359dca7 ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
private static Integer getLocationOffset$3c7ec8d0 ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
private static Integer getNextLocationOffset$3c7ec8d0 ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
/* # virtual methods */
protected android.support.v7.widget.LinearLayoutCompat$LayoutParams a ( ) {
/* .locals 3 */
/* iget v0, p0, Landroid/support/v7/widget/LinearLayoutCompat;->c:I */
int v1 = -2; // const/4 v1, -0x2
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
/* invoke-direct {v0, v1, v1}, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V */
} // :cond_0
int v2 = 1; // const/4 v2, 0x1
/* if-ne v0, v2, :cond_1 */
/* new-instance v0, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
int v2 = -1; // const/4 v2, -0x1
/* invoke-direct {v0, v2, v1}, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public android.support.v7.widget.LinearLayoutCompat$LayoutParams a ( android.util.AttributeSet p0 ) {
/* .locals 2 */
/* new-instance v0, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
(( android.support.v7.widget.LinearLayoutCompat ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1, p1}, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
protected android.support.v7.widget.LinearLayoutCompat$LayoutParams a ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 1 */
/* new-instance v0, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
/* invoke-direct {v0, p1}, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
} // .end method
protected final Boolean a ( Integer p0 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
/* if-nez p1, :cond_1 */
/* iget p1, p0, Landroid/support/v7/widget/LinearLayoutCompat;->h:I */
/* and-int/2addr p1, v1 */
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
} // :cond_1
v2 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildCount()I
/* if-ne p1, v2, :cond_3 */
/* iget p1, p0, Landroid/support/v7/widget/LinearLayoutCompat;->h:I */
/* and-int/lit8 p1, p1, 0x4 */
if ( p1 != null) { // if-eqz p1, :cond_2
} // :cond_2
} // :cond_3
/* iget v2, p0, Landroid/support/v7/widget/LinearLayoutCompat;->h:I */
/* and-int/lit8 v2, v2, 0x2 */
if ( v2 != null) { // if-eqz v2, :cond_5
/* sub-int/2addr p1, v1 */
} // :goto_0
/* if-ltz p1, :cond_5 */
(( android.support.v7.widget.LinearLayoutCompat ) p0 ).getChildAt ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildAt(I)Landroid/view/View;
v2 = (( android.view.View ) v2 ).getVisibility ( ); // invoke-virtual {v2}, Landroid/view/View;->getVisibility()I
/* const/16 v3, 0x8 */
/* if-eq v2, v3, :cond_4 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_4
/* add-int/lit8 p1, p1, -0x1 */
} // :cond_5
} // :goto_1
} // .end method
protected Boolean checkLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 0 */
/* instance-of p1, p1, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
} // .end method
protected android.view.ViewGroup$LayoutParams generateDefaultLayoutParams ( ) { //synthethic
/* .locals 1 */
(( android.support.v7.widget.LinearLayoutCompat ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->a()Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;
} // .end method
public android.view.ViewGroup$LayoutParams generateLayoutParams ( android.util.AttributeSet p0 ) { //synthethic
/* .locals 0 */
(( android.support.v7.widget.LinearLayoutCompat ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/LinearLayoutCompat;->a(Landroid/util/AttributeSet;)Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;
} // .end method
protected android.view.ViewGroup$LayoutParams generateLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) { //synthethic
/* .locals 0 */
(( android.support.v7.widget.LinearLayoutCompat ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/LinearLayoutCompat;->a(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;
} // .end method
public Integer getBaseline ( ) {
/* .locals 5 */
/* iget v0, p0, Landroid/support/v7/widget/LinearLayoutCompat;->a:I */
/* if-gez v0, :cond_0 */
v0 = /* invoke-super {p0}, Landroid/view/ViewGroup;->getBaseline()I */
} // :cond_0
v0 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildCount()I
/* iget v1, p0, Landroid/support/v7/widget/LinearLayoutCompat;->a:I */
/* if-le v0, v1, :cond_6 */
(( android.support.v7.widget.LinearLayoutCompat ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildAt(I)Landroid/view/View;
v1 = (( android.view.View ) v0 ).getBaseline ( ); // invoke-virtual {v0}, Landroid/view/View;->getBaseline()I
int v2 = -1; // const/4 v2, -0x1
/* if-ne v1, v2, :cond_2 */
/* iget v0, p0, Landroid/support/v7/widget/LinearLayoutCompat;->a:I */
/* if-nez v0, :cond_1 */
} // :cond_1
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline."; // const-string v1, "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline."
/* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_2
/* iget v2, p0, Landroid/support/v7/widget/LinearLayoutCompat;->b:I */
/* iget v3, p0, Landroid/support/v7/widget/LinearLayoutCompat;->c:I */
int v4 = 1; // const/4 v4, 0x1
/* if-ne v3, v4, :cond_5 */
/* iget v3, p0, Landroid/support/v7/widget/LinearLayoutCompat;->d:I */
/* and-int/lit8 v3, v3, 0x70 */
/* const/16 v4, 0x30 */
/* if-eq v3, v4, :cond_5 */
/* const/16 v4, 0x10 */
/* if-eq v3, v4, :cond_4 */
/* const/16 v4, 0x50 */
/* if-eq v3, v4, :cond_3 */
} // :cond_3
v2 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getBottom ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getBottom()I
v3 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getTop ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getTop()I
/* sub-int/2addr v2, v3 */
v3 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingBottom()I
/* sub-int/2addr v2, v3 */
/* iget v3, p0, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* sub-int/2addr v2, v3 */
} // :cond_4
v3 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getBottom ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getBottom()I
v4 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getTop ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getTop()I
/* sub-int/2addr v3, v4 */
v4 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingTop()I
/* sub-int/2addr v3, v4 */
v4 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingBottom()I
/* sub-int/2addr v3, v4 */
/* iget v4, p0, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* sub-int/2addr v3, v4 */
/* div-int/lit8 v3, v3, 0x2 */
/* add-int/2addr v2, v3 */
} // :cond_5
} // :goto_0
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
/* iget v0, v0, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->topMargin:I */
/* add-int/2addr v2, v0 */
/* add-int/2addr v2, v1 */
} // :cond_6
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."; // const-string v1, "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."
/* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public Integer getBaselineAlignedChildIndex ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v7/widget/LinearLayoutCompat;->a:I */
} // .end method
public android.graphics.drawable.Drawable getDividerDrawable ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public Integer getDividerPadding ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v7/widget/LinearLayoutCompat;->i:I */
} // .end method
public Integer getDividerWidth ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v7/widget/LinearLayoutCompat;->f:I */
} // .end method
public Integer getGravity ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v7/widget/LinearLayoutCompat;->d:I */
} // .end method
public Integer getOrientation ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v7/widget/LinearLayoutCompat;->c:I */
} // .end method
public Integer getShowDividers ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v7/widget/LinearLayoutCompat;->h:I */
} // .end method
Integer getVirtualChildCount ( ) {
/* .locals 1 */
v0 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildCount()I
} // .end method
public Float getWeightSum ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v7/widget/LinearLayoutCompat;->a:F */
} // .end method
protected void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 7 */
v0 = this.a;
/* if-nez v0, :cond_0 */
return;
} // :cond_0
/* iget v0, p0, Landroid/support/v7/widget/LinearLayoutCompat;->c:I */
/* const/16 v1, 0x8 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
/* if-ne v0, v3, :cond_5 */
v0 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getVirtualChildCount ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getVirtualChildCount()I
} // :goto_0
/* if-ge v2, v0, :cond_2 */
(( android.support.v7.widget.LinearLayoutCompat ) p0 ).getChildAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildAt(I)Landroid/view/View;
if ( v4 != null) { // if-eqz v4, :cond_1
v5 = (( android.view.View ) v4 ).getVisibility ( ); // invoke-virtual {v4}, Landroid/view/View;->getVisibility()I
/* if-eq v5, v1, :cond_1 */
v5 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/v7/widget/LinearLayoutCompat;->a(I)Z
if ( v5 != null) { // if-eqz v5, :cond_1
(( android.view.View ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v5, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
v4 = (( android.view.View ) v4 ).getTop ( ); // invoke-virtual {v4}, Landroid/view/View;->getTop()I
/* iget v5, v5, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->topMargin:I */
/* sub-int/2addr v4, v5 */
/* iget v5, p0, Landroid/support/v7/widget/LinearLayoutCompat;->g:I */
/* sub-int/2addr v4, v5 */
/* invoke-direct {p0, p1, v4}, Landroid/support/v7/widget/LinearLayoutCompat;->a(Landroid/graphics/Canvas;I)V */
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
v1 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutCompat;->a(I)Z
if ( v1 != null) { // if-eqz v1, :cond_4
/* sub-int/2addr v0, v3 */
(( android.support.v7.widget.LinearLayoutCompat ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildAt(I)Landroid/view/View;
/* if-nez v0, :cond_3 */
v0 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getHeight()I
v1 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingBottom()I
/* sub-int/2addr v0, v1 */
/* iget v1, p0, Landroid/support/v7/widget/LinearLayoutCompat;->g:I */
/* sub-int/2addr v0, v1 */
} // :cond_3
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
v0 = (( android.view.View ) v0 ).getBottom ( ); // invoke-virtual {v0}, Landroid/view/View;->getBottom()I
/* iget v1, v1, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->bottomMargin:I */
/* add-int/2addr v0, v1 */
} // :goto_1
/* invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/LinearLayoutCompat;->a(Landroid/graphics/Canvas;I)V */
} // :cond_4
return;
} // :cond_5
v0 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getVirtualChildCount ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getVirtualChildCount()I
v4 = iv .a ( p0 );
} // :goto_2
/* if-ge v2, v0, :cond_8 */
(( android.support.v7.widget.LinearLayoutCompat ) p0 ).getChildAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildAt(I)Landroid/view/View;
if ( v5 != null) { // if-eqz v5, :cond_7
v6 = (( android.view.View ) v5 ).getVisibility ( ); // invoke-virtual {v5}, Landroid/view/View;->getVisibility()I
/* if-eq v6, v1, :cond_7 */
v6 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Landroid/support/v7/widget/LinearLayoutCompat;->a(I)Z
if ( v6 != null) { // if-eqz v6, :cond_7
(( android.view.View ) v5 ).getLayoutParams ( ); // invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v6, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
if ( v4 != null) { // if-eqz v4, :cond_6
v5 = (( android.view.View ) v5 ).getRight ( ); // invoke-virtual {v5}, Landroid/view/View;->getRight()I
/* iget v6, v6, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->rightMargin:I */
/* add-int/2addr v5, v6 */
} // :cond_6
v5 = (( android.view.View ) v5 ).getLeft ( ); // invoke-virtual {v5}, Landroid/view/View;->getLeft()I
/* iget v6, v6, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->leftMargin:I */
/* sub-int/2addr v5, v6 */
/* iget v6, p0, Landroid/support/v7/widget/LinearLayoutCompat;->f:I */
/* sub-int/2addr v5, v6 */
} // :goto_3
/* invoke-direct {p0, p1, v5}, Landroid/support/v7/widget/LinearLayoutCompat;->b(Landroid/graphics/Canvas;I)V */
} // :cond_7
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_8
v1 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutCompat;->a(I)Z
if ( v1 != null) { // if-eqz v1, :cond_c
/* sub-int/2addr v0, v3 */
(( android.support.v7.widget.LinearLayoutCompat ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildAt(I)Landroid/view/View;
/* if-nez v0, :cond_a */
if ( v4 != null) { // if-eqz v4, :cond_9
v0 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingLeft()I
} // :cond_9
v0 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getWidth()I
v1 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingRight()I
} // :cond_a
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
if ( v4 != null) { // if-eqz v4, :cond_b
v0 = (( android.view.View ) v0 ).getLeft ( ); // invoke-virtual {v0}, Landroid/view/View;->getLeft()I
/* iget v1, v1, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->leftMargin:I */
} // :goto_4
/* sub-int/2addr v0, v1 */
/* iget v1, p0, Landroid/support/v7/widget/LinearLayoutCompat;->f:I */
/* sub-int/2addr v0, v1 */
} // :cond_b
v0 = (( android.view.View ) v0 ).getRight ( ); // invoke-virtual {v0}, Landroid/view/View;->getRight()I
/* iget v1, v1, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->rightMargin:I */
/* add-int/2addr v0, v1 */
} // :goto_5
/* invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/LinearLayoutCompat;->b(Landroid/graphics/Canvas;I)V */
} // :cond_c
return;
} // .end method
public void onInitializeAccessibilityEvent ( android.view.accessibility.AccessibilityEvent p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V */
/* const-class v0, Landroid/support/v7/widget/LinearLayoutCompat; */
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( android.view.accessibility.AccessibilityEvent ) p1 ).setClassName ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V
return;
} // .end method
public void onInitializeAccessibilityNodeInfo ( android.view.accessibility.AccessibilityNodeInfo p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V */
/* const-class v0, Landroid/support/v7/widget/LinearLayoutCompat; */
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( android.view.accessibility.AccessibilityNodeInfo ) p1 ).setClassName ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V
return;
} // .end method
protected void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 24 */
/* move-object/from16 v0, p0 */
/* iget v1, v0, Landroid/support/v7/widget/LinearLayoutCompat;->c:I */
/* const/16 v2, 0x8 */
/* const/16 v3, 0x50 */
/* const/16 v4, 0x10 */
int v5 = 5; // const/4 v5, 0x5
/* const v6, 0x800007 */
int v7 = 2; // const/4 v7, 0x2
int v8 = 1; // const/4 v8, 0x1
/* if-ne v1, v8, :cond_9 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingLeft()I */
/* sub-int v10, p4, p2 */
v11 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingRight()I */
/* sub-int v11, v10, v11 */
/* sub-int/2addr v10, v1 */
v12 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingRight()I */
/* sub-int/2addr v10, v12 */
v12 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getVirtualChildCount()I */
/* iget v13, v0, Landroid/support/v7/widget/LinearLayoutCompat;->d:I */
/* and-int/lit8 v14, v13, 0x70 */
/* and-int/2addr v6, v13 */
/* if-eq v14, v4, :cond_1 */
/* if-eq v14, v3, :cond_0 */
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingTop()I */
} // :cond_0
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingTop()I */
/* add-int v3, v3, p5 */
/* sub-int v3, v3, p3 */
/* iget v4, v0, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* sub-int/2addr v3, v4 */
} // :cond_1
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingTop()I */
/* sub-int v4, p5, p3 */
/* iget v13, v0, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* sub-int/2addr v4, v13 */
/* div-int/2addr v4, v7 */
/* add-int/2addr v3, v4 */
} // :goto_0
/* move v4, v3 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
/* if-ge v3, v12, :cond_8 */
(( android.support.v7.widget.LinearLayoutCompat ) v0 ).getChildAt ( v3 ); // invoke-virtual {v0, v3}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildAt(I)Landroid/view/View;
/* if-nez v13, :cond_2 */
/* add-int/lit8 v4, v4, 0x0 */
} // :cond_2
v14 = (( android.view.View ) v13 ).getVisibility ( ); // invoke-virtual {v13}, Landroid/view/View;->getVisibility()I
/* if-eq v14, v2, :cond_7 */
v14 = (( android.view.View ) v13 ).getMeasuredWidth ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I
v15 = (( android.view.View ) v13 ).getMeasuredHeight ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I
(( android.view.View ) v13 ).getLayoutParams ( ); // invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* move-object/from16 v2, v16 */
/* check-cast v2, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
/* iget v9, v2, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->c:I */
/* if-gez v9, :cond_3 */
/* move v9, v6 */
} // :cond_3
v7 = /* invoke-static/range {p0 ..p0}, Lem;->b(Landroid/view/View;)I */
v7 = dz .a ( v9,v7 );
/* and-int/lit8 v7, v7, 0x7 */
/* if-eq v7, v8, :cond_5 */
/* if-eq v7, v5, :cond_4 */
/* iget v7, v2, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->leftMargin:I */
/* add-int/2addr v7, v1 */
} // :cond_4
/* sub-int v7, v11, v14 */
} // :cond_5
/* sub-int v7, v10, v14 */
int v9 = 2; // const/4 v9, 0x2
/* div-int/2addr v7, v9 */
/* add-int/2addr v7, v1 */
/* iget v9, v2, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->leftMargin:I */
/* add-int/2addr v7, v9 */
} // :goto_2
/* iget v9, v2, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->rightMargin:I */
/* sub-int/2addr v7, v9 */
} // :goto_3
v9 = (( android.support.v7.widget.LinearLayoutCompat ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Landroid/support/v7/widget/LinearLayoutCompat;->a(I)Z
if ( v9 != null) { // if-eqz v9, :cond_6
/* iget v9, v0, Landroid/support/v7/widget/LinearLayoutCompat;->g:I */
/* add-int/2addr v4, v9 */
} // :cond_6
/* iget v9, v2, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->topMargin:I */
/* add-int/2addr v4, v9 */
/* add-int/lit8 v9, v4, 0x0 */
android.support.v7.widget.LinearLayoutCompat .b ( v13,v7,v9,v14,v15 );
/* iget v2, v2, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->bottomMargin:I */
/* add-int/2addr v15, v2 */
int v2 = 0; // const/4 v2, 0x0
/* add-int/2addr v15, v2 */
/* add-int/2addr v4, v15 */
/* add-int/lit8 v3, v3, 0x0 */
} // :cond_7
} // :goto_4
/* add-int/2addr v3, v8 */
/* const/16 v2, 0x8 */
int v7 = 2; // const/4 v7, 0x2
} // :cond_8
return;
} // :cond_9
v1 = /* invoke-static/range {p0 ..p0}, Liv;->a(Landroid/view/View;)Z */
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingTop()I */
/* sub-int v7, p5, p3 */
v9 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingBottom()I */
/* sub-int v9, v7, v9 */
/* sub-int/2addr v7, v2 */
v10 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingBottom()I */
/* sub-int/2addr v7, v10 */
v10 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getVirtualChildCount()I */
/* iget v11, v0, Landroid/support/v7/widget/LinearLayoutCompat;->d:I */
/* and-int/2addr v6, v11 */
/* and-int/lit8 v11, v11, 0x70 */
/* iget-boolean v12, v0, Landroid/support/v7/widget/LinearLayoutCompat;->a:Z */
v13 = this.a;
v14 = this.b;
v15 = /* invoke-static/range {p0 ..p0}, Lem;->b(Landroid/view/View;)I */
v6 = dz .a ( v6,v15 );
/* if-eq v6, v8, :cond_b */
/* if-eq v6, v5, :cond_a */
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingLeft()I */
} // :cond_a
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingLeft()I */
/* add-int v5, v5, p4 */
/* sub-int v5, v5, p2 */
/* iget v6, v0, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* sub-int/2addr v5, v6 */
} // :cond_b
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingLeft()I */
/* sub-int v6, p4, p2 */
/* iget v15, v0, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* sub-int/2addr v6, v15 */
int v15 = 2; // const/4 v15, 0x2
/* div-int/2addr v6, v15 */
/* add-int/2addr v5, v6 */
} // :goto_5
if ( v1 != null) { // if-eqz v1, :cond_c
/* add-int/lit8 v1, v10, -0x1 */
int v15 = -1; // const/4 v15, -0x1
} // :cond_c
int v1 = 0; // const/4 v1, 0x0
int v15 = 1; // const/4 v15, 0x1
} // :goto_6
/* move/from16 v17, v5 */
int v5 = 0; // const/4 v5, 0x0
} // :goto_7
/* if-ge v5, v10, :cond_17 */
/* mul-int v18, v15, v5 */
/* add-int v8, v1, v18 */
(( android.support.v7.widget.LinearLayoutCompat ) v0 ).getChildAt ( v8 ); // invoke-virtual {v0, v8}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildAt(I)Landroid/view/View;
/* if-nez v3, :cond_d */
/* add-int/lit8 v17, v17, 0x0 */
/* move/from16 p3, v1 */
/* move/from16 p5, v10 */
/* move/from16 v20, v11 */
/* move/from16 v21, v12 */
int v1 = 0; // const/4 v1, 0x0
int v3 = 1; // const/4 v3, 0x1
int v12 = -1; // const/4 v12, -0x1
/* goto/16 :goto_b */
} // :cond_d
v4 = (( android.view.View ) v3 ).getVisibility ( ); // invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
/* const/16 v6, 0x8 */
/* if-eq v4, v6, :cond_16 */
v4 = (( android.view.View ) v3 ).getMeasuredWidth ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I
v6 = (( android.view.View ) v3 ).getMeasuredHeight ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* move/from16 p3, v1 */
/* move-object/from16 v1, v20 */
/* check-cast v1, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
if ( v12 != null) { // if-eqz v12, :cond_e
/* move/from16 p5, v10 */
/* iget v10, v1, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->height:I */
/* move/from16 v20, v11 */
int v11 = -1; // const/4 v11, -0x1
/* if-eq v10, v11, :cond_f */
v10 = (( android.view.View ) v3 ).getBaseline ( ); // invoke-virtual {v3}, Landroid/view/View;->getBaseline()I
} // :cond_e
/* move/from16 p5, v10 */
/* move/from16 v20, v11 */
} // :cond_f
int v10 = -1; // const/4 v10, -0x1
} // :goto_8
/* iget v11, v1, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->c:I */
/* if-gez v11, :cond_10 */
/* move/from16 v11, v20 */
} // :cond_10
/* and-int/lit8 v11, v11, 0x70 */
/* move/from16 v21, v12 */
/* const/16 v12, 0x10 */
/* if-eq v11, v12, :cond_14 */
/* const/16 v12, 0x30 */
/* if-eq v11, v12, :cond_12 */
/* const/16 v12, 0x50 */
/* if-eq v11, v12, :cond_11 */
/* move v10, v2 */
int v12 = -1; // const/4 v12, -0x1
} // :cond_11
/* sub-int v11, v9, v6 */
/* iget v12, v1, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->bottomMargin:I */
/* sub-int/2addr v11, v12 */
int v12 = -1; // const/4 v12, -0x1
/* if-eq v10, v12, :cond_13 */
v22 = (( android.view.View ) v3 ).getMeasuredHeight ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I
/* sub-int v22, v22, v10 */
int v10 = 2; // const/4 v10, 0x2
/* aget v23, v14, v10 */
/* sub-int v23, v23, v22 */
/* sub-int v10, v11, v23 */
} // :cond_12
int v12 = -1; // const/4 v12, -0x1
/* iget v11, v1, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->topMargin:I */
/* add-int/2addr v11, v2 */
/* if-eq v10, v12, :cond_13 */
/* const/16 v19, 0x1 */
/* aget v22, v13, v19 */
/* sub-int v22, v22, v10 */
/* add-int v10, v11, v22 */
} // :cond_13
/* move v10, v11 */
} // :cond_14
int v12 = -1; // const/4 v12, -0x1
/* sub-int v10, v7, v6 */
int v11 = 2; // const/4 v11, 0x2
/* div-int/2addr v10, v11 */
/* add-int/2addr v10, v2 */
/* iget v11, v1, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->topMargin:I */
/* add-int/2addr v10, v11 */
/* iget v11, v1, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->bottomMargin:I */
/* sub-int/2addr v10, v11 */
} // :goto_9
v8 = (( android.support.v7.widget.LinearLayoutCompat ) v0 ).a ( v8 ); // invoke-virtual {v0, v8}, Landroid/support/v7/widget/LinearLayoutCompat;->a(I)Z
if ( v8 != null) { // if-eqz v8, :cond_15
/* iget v8, v0, Landroid/support/v7/widget/LinearLayoutCompat;->f:I */
/* add-int v17, v17, v8 */
} // :cond_15
/* iget v8, v1, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->leftMargin:I */
/* add-int v17, v17, v8 */
/* add-int/lit8 v8, v17, 0x0 */
android.support.v7.widget.LinearLayoutCompat .b ( v3,v8,v10,v4,v6 );
/* iget v1, v1, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->rightMargin:I */
/* add-int/2addr v4, v1 */
int v1 = 0; // const/4 v1, 0x0
/* add-int/2addr v4, v1 */
/* add-int v17, v17, v4 */
/* add-int/lit8 v5, v5, 0x0 */
} // :cond_16
/* move/from16 p3, v1 */
/* move/from16 p5, v10 */
/* move/from16 v20, v11 */
/* move/from16 v21, v12 */
int v1 = 0; // const/4 v1, 0x0
int v12 = -1; // const/4 v12, -0x1
} // :goto_a
int v3 = 1; // const/4 v3, 0x1
} // :goto_b
/* add-int/2addr v5, v3 */
/* move/from16 v1, p3 */
/* move/from16 v10, p5 */
/* move/from16 v11, v20 */
/* move/from16 v12, v21 */
/* const/16 v3, 0x50 */
/* const/16 v4, 0x10 */
int v8 = 1; // const/4 v8, 0x1
/* goto/16 :goto_7 */
} // :cond_17
return;
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 30 */
/* move-object/from16 v6, p0 */
/* move/from16 v7, p1 */
/* move/from16 v8, p2 */
/* iget v0, v6, Landroid/support/v7/widget/LinearLayoutCompat;->c:I */
int v9 = 1; // const/4 v9, 0x1
/* if-ne v0, v9, :cond_2c */
int v10 = 0; // const/4 v10, 0x0
/* iput v10, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
v11 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getVirtualChildCount()I */
v12 = /* invoke-static/range {p1 ..p1}, Landroid/view/View$MeasureSpec;->getMode(I)I */
v13 = /* invoke-static/range {p2 ..p2}, Landroid/view/View$MeasureSpec;->getMode(I)I */
/* iget v14, v6, Landroid/support/v7/widget/LinearLayoutCompat;->a:I */
/* iget-boolean v15, v6, Landroid/support/v7/widget/LinearLayoutCompat;->b:Z */
/* const/16 v16, 0x0 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
int v9 = 0; // const/4 v9, 0x0
/* const/16 v17, 0x0 */
/* const/16 v18, 0x1 */
/* const/16 v19, 0x0 */
/* const/16 v20, 0x0 */
} // :goto_0
/* if-ge v5, v11, :cond_12 */
(( android.support.v7.widget.LinearLayoutCompat ) v6 ).getChildAt ( v5 ); // invoke-virtual {v6, v5}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildAt(I)Landroid/view/View;
/* if-nez v23, :cond_0 */
/* iget v3, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* add-int/2addr v3, v10 */
/* iput v3, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* move/from16 v21, v11 */
/* move/from16 v8, v20 */
int v3 = 1; // const/4 v3, 0x1
/* move/from16 v20, v13 */
/* goto/16 :goto_b */
} // :cond_0
v10 = /* invoke-virtual/range {v23 ..v23}, Landroid/view/View;->getVisibility()I */
/* const/16 v3, 0x8 */
/* if-eq v10, v3, :cond_11 */
v3 = (( android.support.v7.widget.LinearLayoutCompat ) v6 ).a ( v5 ); // invoke-virtual {v6, v5}, Landroid/support/v7/widget/LinearLayoutCompat;->a(I)Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* iget v3, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* iget v10, v6, Landroid/support/v7/widget/LinearLayoutCompat;->g:I */
/* add-int/2addr v3, v10 */
/* iput v3, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
} // :cond_1
/* invoke-virtual/range {v23 ..v23}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
/* move-object v10, v3 */
/* check-cast v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
/* iget v3, v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->a:F */
/* add-float v22, v0, v3 */
/* const/high16 v3, 0x40000000 # 2.0f */
/* if-ne v13, v3, :cond_2 */
/* iget v0, v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->height:I */
/* if-nez v0, :cond_2 */
/* iget v0, v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->a:F */
/* cmpl-float v0, v0, v16 */
/* if-lez v0, :cond_2 */
/* iget v0, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* iget v3, v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->topMargin:I */
/* add-int/2addr v3, v0 */
/* move/from16 v24, v1 */
/* iget v1, v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->bottomMargin:I */
/* add-int/2addr v3, v1 */
v0 = java.lang.Math .max ( v0,v3 );
/* iput v0, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* move/from16 v28, v4 */
/* move/from16 v29, v5 */
/* move/from16 v21, v11 */
/* move/from16 v8, v20 */
/* move/from16 v27, v24 */
/* const/16 v17, 0x1 */
/* move/from16 v20, v13 */
/* goto/16 :goto_3 */
} // :cond_2
/* move/from16 v24, v1 */
/* iget v0, v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->height:I */
/* if-nez v0, :cond_3 */
/* iget v0, v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->a:F */
/* cmpl-float v0, v0, v16 */
/* if-lez v0, :cond_3 */
int v0 = -2; // const/4 v0, -0x2
/* iput v0, v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->height:I */
int v3 = 0; // const/4 v3, 0x0
} // :cond_3
/* const/high16 v3, -0x80000000 */
} // :goto_1
/* const/16 v25, 0x0 */
/* cmpl-float v0, v22, v16 */
/* if-nez v0, :cond_4 */
/* iget v0, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* move/from16 v26, v0 */
} // :cond_4
/* const/16 v26, 0x0 */
} // :goto_2
/* move-object/from16 v0, p0 */
/* move/from16 v27, v24 */
/* move-object/from16 v1, v23 */
/* move v7, v2 */
/* move/from16 v2, p1 */
/* move/from16 v21, v11 */
/* move/from16 v8, v20 */
/* const/high16 v11, -0x80000000 */
/* move/from16 v20, v13 */
/* move v13, v3 */
/* move/from16 v3, v25 */
/* move/from16 v28, v4 */
/* move/from16 v4, p2 */
/* move/from16 v29, v5 */
/* move/from16 v5, v26 */
/* invoke-direct/range {v0 ..v5}, Landroid/support/v7/widget/LinearLayoutCompat;->a(Landroid/view/View;IIII)V */
/* if-eq v13, v11, :cond_5 */
/* iput v13, v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->height:I */
} // :cond_5
v0 = /* invoke-virtual/range {v23 ..v23}, Landroid/view/View;->getMeasuredHeight()I */
/* iget v1, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* add-int v2, v1, v0 */
/* iget v3, v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->topMargin:I */
/* add-int/2addr v2, v3 */
/* iget v3, v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->bottomMargin:I */
/* add-int/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
/* add-int/2addr v2, v3 */
v1 = java.lang.Math .max ( v1,v2 );
/* iput v1, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
if ( v15 != null) { // if-eqz v15, :cond_6
v2 = java.lang.Math .max ( v0,v7 );
} // :cond_6
/* move v2, v7 */
} // :goto_3
/* if-ltz v14, :cond_7 */
/* move/from16 v1, v29 */
/* add-int/lit8 v5, v1, 0x1 */
/* if-ne v14, v5, :cond_8 */
/* iget v0, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* iput v0, v6, Landroid/support/v7/widget/LinearLayoutCompat;->b:I */
} // :cond_7
/* move/from16 v1, v29 */
} // :cond_8
} // :goto_4
/* if-ge v1, v14, :cond_a */
/* iget v0, v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->a:F */
/* cmpl-float v0, v0, v16 */
/* if-gtz v0, :cond_9 */
} // :cond_9
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.Either remove the weight, or don\'t set mBaselineAlignedChildIndex."; // const-string v1, "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.Either remove the weight, or don\'t set mBaselineAlignedChildIndex."
/* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_a
} // :goto_5
/* const/high16 v0, 0x40000000 # 2.0f */
/* if-eq v12, v0, :cond_b */
/* iget v0, v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->width:I */
int v3 = -1; // const/4 v3, -0x1
/* if-ne v0, v3, :cond_c */
int v0 = 1; // const/4 v0, 0x1
/* const/16 v19, 0x1 */
} // :cond_b
int v3 = -1; // const/4 v3, -0x1
} // :cond_c
int v0 = 0; // const/4 v0, 0x0
} // :goto_6
/* iget v4, v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->leftMargin:I */
/* iget v5, v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->rightMargin:I */
/* add-int/2addr v4, v5 */
v5 = /* invoke-virtual/range {v23 ..v23}, Landroid/view/View;->getMeasuredWidth()I */
/* add-int/2addr v5, v4 */
/* move/from16 v13, v27 */
v7 = java.lang.Math .max ( v13,v5 );
v11 = /* invoke-virtual/range {v23 ..v23}, Landroid/view/View;->getMeasuredState()I */
v9 = android.view.View .combineMeasuredStates ( v9,v11 );
if ( v18 != null) { // if-eqz v18, :cond_d
/* iget v11, v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->width:I */
/* if-ne v11, v3, :cond_d */
/* const/16 v18, 0x1 */
} // :cond_d
/* const/16 v18, 0x0 */
} // :goto_7
/* iget v3, v10, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->a:F */
/* cmpl-float v3, v3, v16 */
/* if-lez v3, :cond_f */
if ( v0 != null) { // if-eqz v0, :cond_e
} // :cond_e
/* move v4, v5 */
} // :goto_8
v0 = java.lang.Math .max ( v8,v4 );
/* move v8, v0 */
} // :cond_f
if ( v0 != null) { // if-eqz v0, :cond_10
} // :cond_10
/* move v4, v5 */
} // :goto_9
/* move/from16 v10, v28 */
v4 = java.lang.Math .max ( v10,v4 );
/* move/from16 v28, v4 */
} // :cond_11
/* move v7, v2 */
/* move v10, v4 */
/* move/from16 v21, v11 */
/* move/from16 v8, v20 */
/* move/from16 v20, v13 */
/* move v13, v1 */
/* move v1, v5 */
/* move/from16 v22, v0 */
/* move/from16 v28, v10 */
/* move v7, v13 */
} // :goto_a
/* add-int/lit8 v5, v1, 0x0 */
/* move v1, v7 */
/* move/from16 v0, v22 */
/* move/from16 v4, v28 */
int v3 = 1; // const/4 v3, 0x1
} // :goto_b
/* add-int/2addr v5, v3 */
/* move/from16 v13, v20 */
/* move/from16 v11, v21 */
/* move/from16 v7, p1 */
int v10 = 0; // const/4 v10, 0x0
/* move/from16 v20, v8 */
/* move/from16 v8, p2 */
/* goto/16 :goto_0 */
} // :cond_12
/* move v7, v2 */
/* move v10, v4 */
/* move/from16 v21, v11 */
/* move/from16 v8, v20 */
int v3 = -1; // const/4 v3, -0x1
/* const/high16 v11, -0x80000000 */
/* move/from16 v20, v13 */
/* move v13, v1 */
/* iget v1, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* if-lez v1, :cond_13 */
/* move/from16 v1, v21 */
v2 = (( android.support.v7.widget.LinearLayoutCompat ) v6 ).a ( v1 ); // invoke-virtual {v6, v1}, Landroid/support/v7/widget/LinearLayoutCompat;->a(I)Z
if ( v2 != null) { // if-eqz v2, :cond_14
/* iget v2, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* iget v4, v6, Landroid/support/v7/widget/LinearLayoutCompat;->g:I */
/* add-int/2addr v2, v4 */
/* iput v2, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
} // :cond_13
/* move/from16 v1, v21 */
} // :cond_14
} // :goto_c
if ( v15 != null) { // if-eqz v15, :cond_18
/* move/from16 v2, v20 */
/* if-eq v2, v11, :cond_15 */
/* if-nez v2, :cond_19 */
} // :cond_15
int v4 = 0; // const/4 v4, 0x0
/* iput v4, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
int v5 = 0; // const/4 v5, 0x0
} // :goto_d
/* if-ge v5, v1, :cond_19 */
(( android.support.v7.widget.LinearLayoutCompat ) v6 ).getChildAt ( v5 ); // invoke-virtual {v6, v5}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildAt(I)Landroid/view/View;
/* if-nez v11, :cond_16 */
/* iget v11, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* add-int/2addr v11, v4 */
/* iput v11, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
} // :cond_16
v4 = (( android.view.View ) v11 ).getVisibility ( ); // invoke-virtual {v11}, Landroid/view/View;->getVisibility()I
/* const/16 v14, 0x8 */
/* if-ne v4, v14, :cond_17 */
/* add-int/lit8 v5, v5, 0x0 */
} // :cond_17
(( android.view.View ) v11 ).getLayoutParams ( ); // invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v4, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
/* iget v11, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* add-int v14, v11, v7 */
/* iget v3, v4, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->topMargin:I */
/* add-int/2addr v14, v3 */
/* iget v3, v4, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->bottomMargin:I */
/* add-int/2addr v14, v3 */
int v3 = 0; // const/4 v3, 0x0
/* add-int/2addr v14, v3 */
v3 = java.lang.Math .max ( v11,v14 );
/* iput v3, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
} // :goto_e
int v3 = 1; // const/4 v3, 0x1
/* add-int/2addr v5, v3 */
int v3 = -1; // const/4 v3, -0x1
int v4 = 0; // const/4 v4, 0x0
} // :cond_18
/* move/from16 v2, v20 */
} // :cond_19
int v3 = 1; // const/4 v3, 0x1
/* iget v4, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingTop()I */
v11 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingBottom()I */
/* add-int/2addr v5, v11 */
/* add-int/2addr v4, v5 */
/* iput v4, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* iget v4, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
v5 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getSuggestedMinimumHeight()I */
v4 = java.lang.Math .max ( v4,v5 );
/* move/from16 v5, p2 */
int v11 = 0; // const/4 v11, 0x0
v4 = android.view.View .resolveSizeAndState ( v4,v5,v11 );
/* const v11, 0xffffff */
/* and-int/2addr v11, v4 */
/* iget v14, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* sub-int/2addr v11, v14 */
/* if-nez v17, :cond_1d */
if ( v11 != null) { // if-eqz v11, :cond_1a
/* cmpl-float v14, v0, v16 */
/* if-lez v14, :cond_1a */
} // :cond_1a
v0 = java.lang.Math .max ( v10,v8 );
if ( v15 != null) { // if-eqz v15, :cond_1c
/* const/high16 v3, 0x40000000 # 2.0f */
/* if-eq v2, v3, :cond_1c */
int v2 = 0; // const/4 v2, 0x0
} // :goto_f
/* if-ge v2, v1, :cond_1c */
(( android.support.v7.widget.LinearLayoutCompat ) v6 ).getChildAt ( v2 ); // invoke-virtual {v6, v2}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildAt(I)Landroid/view/View;
if ( v3 != null) { // if-eqz v3, :cond_1b
v8 = (( android.view.View ) v3 ).getVisibility ( ); // invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
/* const/16 v10, 0x8 */
/* if-eq v8, v10, :cond_1b */
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
/* iget v8, v8, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->a:F */
/* cmpl-float v8, v8, v16 */
/* if-lez v8, :cond_1b */
v8 = (( android.view.View ) v3 ).getMeasuredWidth ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I
/* const/high16 v10, 0x40000000 # 2.0f */
v8 = android.view.View$MeasureSpec .makeMeasureSpec ( v8,v10 );
v11 = android.view.View$MeasureSpec .makeMeasureSpec ( v7,v10 );
(( android.view.View ) v3 ).measure ( v8, v11 ); // invoke-virtual {v3, v8, v11}, Landroid/view/View;->measure(II)V
} // :cond_1b
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1c
/* move/from16 v11, p1 */
/* goto/16 :goto_19 */
} // :cond_1d
} // :goto_10
/* iget v7, v6, Landroid/support/v7/widget/LinearLayoutCompat;->a:F */
/* cmpl-float v8, v7, v16 */
/* if-lez v8, :cond_1e */
/* move v0, v7 */
} // :cond_1e
int v7 = 0; // const/4 v7, 0x0
/* iput v7, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* move v7, v0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_11
/* if-ge v0, v1, :cond_29 */
(( android.support.v7.widget.LinearLayoutCompat ) v6 ).getChildAt ( v0 ); // invoke-virtual {v6, v0}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildAt(I)Landroid/view/View;
v14 = (( android.view.View ) v8 ).getVisibility ( ); // invoke-virtual {v8}, Landroid/view/View;->getVisibility()I
/* const/16 v15, 0x8 */
/* if-eq v14, v15, :cond_28 */
(( android.view.View ) v8 ).getLayoutParams ( ); // invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v14, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
/* iget v3, v14, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->a:F */
/* cmpl-float v17, v3, v16 */
/* if-lez v17, :cond_23 */
/* int-to-float v15, v11 */
/* mul-float v15, v15, v3 */
/* div-float/2addr v15, v7 */
/* float-to-int v15, v15 */
/* sub-float/2addr v7, v3 */
/* sub-int/2addr v11, v15 */
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingLeft()I */
v17 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingRight()I */
/* add-int v3, v3, v17 */
/* move/from16 v17, v7 */
/* iget v7, v14, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->leftMargin:I */
/* add-int/2addr v3, v7 */
/* iget v7, v14, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->rightMargin:I */
/* add-int/2addr v3, v7 */
/* iget v7, v14, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->width:I */
/* move/from16 v20, v11 */
/* move/from16 v11, p1 */
v3 = android.support.v7.widget.LinearLayoutCompat .getChildMeasureSpec ( v11,v3,v7 );
/* iget v7, v14, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->height:I */
/* if-nez v7, :cond_21 */
/* const/high16 v7, 0x40000000 # 2.0f */
/* if-eq v2, v7, :cond_1f */
} // :cond_1f
/* if-lez v15, :cond_20 */
} // :cond_20
/* const/high16 v7, 0x40000000 # 2.0f */
int v15 = 0; // const/4 v15, 0x0
} // :cond_21
} // :goto_12
v7 = (( android.view.View ) v8 ).getMeasuredHeight ( ); // invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v7, v15 */
/* if-gez v7, :cond_22 */
int v7 = 0; // const/4 v7, 0x0
} // :cond_22
/* move v15, v7 */
} // :goto_13
/* const/high16 v7, 0x40000000 # 2.0f */
} // :goto_14
v15 = android.view.View$MeasureSpec .makeMeasureSpec ( v15,v7 );
(( android.view.View ) v8 ).measure ( v3, v15 ); // invoke-virtual {v8, v3, v15}, Landroid/view/View;->measure(II)V
v3 = (( android.view.View ) v8 ).getMeasuredState ( ); // invoke-virtual {v8}, Landroid/view/View;->getMeasuredState()I
/* and-int/lit16 v3, v3, -0x100 */
v9 = android.view.View .combineMeasuredStates ( v9,v3 );
/* move/from16 v3, v20 */
} // :cond_23
/* move v3, v11 */
/* move/from16 v11, p1 */
/* move/from16 v17, v7 */
} // :goto_15
/* iget v7, v14, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->leftMargin:I */
/* iget v15, v14, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->rightMargin:I */
/* add-int/2addr v7, v15 */
v15 = (( android.view.View ) v8 ).getMeasuredWidth ( ); // invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I
/* add-int/2addr v15, v7 */
v13 = java.lang.Math .max ( v13,v15 );
/* move/from16 v20, v2 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* if-eq v12, v2, :cond_24 */
/* iget v2, v14, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->width:I */
/* move/from16 v21, v3 */
int v3 = -1; // const/4 v3, -0x1
/* if-ne v2, v3, :cond_25 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_24
/* move/from16 v21, v3 */
int v3 = -1; // const/4 v3, -0x1
} // :cond_25
int v2 = 0; // const/4 v2, 0x0
} // :goto_16
if ( v2 != null) { // if-eqz v2, :cond_26
/* move v15, v7 */
} // :cond_26
v2 = java.lang.Math .max ( v10,v15 );
if ( v18 != null) { // if-eqz v18, :cond_27
/* iget v7, v14, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->width:I */
/* if-ne v7, v3, :cond_27 */
int v7 = 1; // const/4 v7, 0x1
} // :cond_27
int v7 = 0; // const/4 v7, 0x0
} // :goto_17
/* iget v10, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
v8 = (( android.view.View ) v8 ).getMeasuredHeight ( ); // invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v8, v10 */
/* iget v15, v14, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->topMargin:I */
/* add-int/2addr v8, v15 */
/* iget v14, v14, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->bottomMargin:I */
/* add-int/2addr v8, v14 */
int v14 = 0; // const/4 v14, 0x0
/* add-int/2addr v8, v14 */
v8 = java.lang.Math .max ( v10,v8 );
/* iput v8, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* move v10, v2 */
/* move/from16 v18, v7 */
/* move/from16 v7, v17 */
/* move/from16 v2, v21 */
} // :cond_28
/* move/from16 v20, v2 */
/* move v2, v11 */
int v3 = -1; // const/4 v3, -0x1
/* move/from16 v11, p1 */
int v14 = 0; // const/4 v14, 0x0
} // :goto_18
/* add-int/lit8 v0, v0, 0x1 */
/* move v11, v2 */
/* move/from16 v2, v20 */
int v3 = 1; // const/4 v3, 0x1
/* goto/16 :goto_11 */
} // :cond_29
/* move/from16 v11, p1 */
/* iget v0, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingTop()I */
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingBottom()I */
/* add-int/2addr v2, v3 */
/* add-int/2addr v0, v2 */
/* iput v0, v6, Landroid/support/v7/widget/LinearLayoutCompat;->e:I */
/* move v0, v10 */
} // :goto_19
/* if-nez v18, :cond_2a */
/* const/high16 v2, 0x40000000 # 2.0f */
/* if-eq v12, v2, :cond_2a */
/* move v13, v0 */
} // :cond_2a
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingLeft()I */
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getPaddingRight()I */
/* add-int/2addr v0, v2 */
/* add-int/2addr v13, v0 */
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getSuggestedMinimumWidth()I */
v0 = java.lang.Math .max ( v13,v0 );
v0 = android.view.View .resolveSizeAndState ( v0,v11,v9 );
(( android.support.v7.widget.LinearLayoutCompat ) v6 ).setMeasuredDimension ( v0, v4 ); // invoke-virtual {v6, v0, v4}, Landroid/support/v7/widget/LinearLayoutCompat;->setMeasuredDimension(II)V
if ( v19 != null) { // if-eqz v19, :cond_2b
/* invoke-direct {v6, v1, v5}, Landroid/support/v7/widget/LinearLayoutCompat;->a(II)V */
} // :cond_2b
return;
} // :cond_2c
/* move v11, v7 */
/* move v5, v8 */
/* invoke-direct/range {p0 ..p2}, Landroid/support/v7/widget/LinearLayoutCompat;->b(II)V */
return;
} // .end method
public void setBaselineAligned ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Landroid/support/v7/widget/LinearLayoutCompat;->a:Z */
return;
} // .end method
public void setBaselineAlignedChildIndex ( Integer p0 ) {
/* .locals 2 */
/* if-ltz p1, :cond_0 */
v0 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildCount()I
/* if-ge p1, v0, :cond_0 */
/* iput p1, p0, Landroid/support/v7/widget/LinearLayoutCompat;->a:I */
return;
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "base aligned child index out of range (0, "; // const-string v1, "base aligned child index out of range (0, "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v1 = (( android.support.v7.widget.LinearLayoutCompat ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildCount()I
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ")"; // const-string v1, ")"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void setDividerDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
v0 = this.a;
/* if-ne p1, v0, :cond_0 */
return;
} // :cond_0
this.a = p1;
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_1
v1 = (( android.graphics.drawable.Drawable ) p1 ).getIntrinsicWidth ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
/* iput v1, p0, Landroid/support/v7/widget/LinearLayoutCompat;->f:I */
v1 = (( android.graphics.drawable.Drawable ) p1 ).getIntrinsicHeight ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
/* iput v1, p0, Landroid/support/v7/widget/LinearLayoutCompat;->g:I */
} // :cond_1
/* iput v0, p0, Landroid/support/v7/widget/LinearLayoutCompat;->f:I */
/* iput v0, p0, Landroid/support/v7/widget/LinearLayoutCompat;->g:I */
} // :goto_0
/* if-nez p1, :cond_2 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
(( android.support.v7.widget.LinearLayoutCompat ) p0 ).setWillNotDraw ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutCompat;->setWillNotDraw(Z)V
(( android.support.v7.widget.LinearLayoutCompat ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->requestLayout()V
return;
} // .end method
public void setDividerPadding ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v7/widget/LinearLayoutCompat;->i:I */
return;
} // .end method
public void setGravity ( Integer p0 ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v7/widget/LinearLayoutCompat;->d:I */
/* if-eq v0, p1, :cond_2 */
/* const v0, 0x800007 */
/* and-int/2addr v0, p1 */
/* if-nez v0, :cond_0 */
/* const v0, 0x800003 */
/* or-int/2addr p1, v0 */
} // :cond_0
/* and-int/lit8 v0, p1, 0x70 */
/* if-nez v0, :cond_1 */
/* or-int/lit8 p1, p1, 0x30 */
} // :cond_1
/* iput p1, p0, Landroid/support/v7/widget/LinearLayoutCompat;->d:I */
(( android.support.v7.widget.LinearLayoutCompat ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->requestLayout()V
} // :cond_2
return;
} // .end method
public void setHorizontalGravity ( Integer p0 ) {
/* .locals 2 */
/* const v0, 0x800007 */
/* and-int/2addr p1, v0 */
/* iget v1, p0, Landroid/support/v7/widget/LinearLayoutCompat;->d:I */
/* and-int/2addr v0, v1 */
/* if-eq v0, p1, :cond_0 */
/* const v0, -0x800008 */
/* and-int/2addr v0, v1 */
/* or-int/2addr p1, v0 */
/* iput p1, p0, Landroid/support/v7/widget/LinearLayoutCompat;->d:I */
(( android.support.v7.widget.LinearLayoutCompat ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->requestLayout()V
} // :cond_0
return;
} // .end method
public void setMeasureWithLargestChildEnabled ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Landroid/support/v7/widget/LinearLayoutCompat;->b:Z */
return;
} // .end method
public void setOrientation ( Integer p0 ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v7/widget/LinearLayoutCompat;->c:I */
/* if-eq v0, p1, :cond_0 */
/* iput p1, p0, Landroid/support/v7/widget/LinearLayoutCompat;->c:I */
(( android.support.v7.widget.LinearLayoutCompat ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->requestLayout()V
} // :cond_0
return;
} // .end method
public void setShowDividers ( Integer p0 ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v7/widget/LinearLayoutCompat;->h:I */
/* if-eq p1, v0, :cond_0 */
(( android.support.v7.widget.LinearLayoutCompat ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->requestLayout()V
} // :cond_0
/* iput p1, p0, Landroid/support/v7/widget/LinearLayoutCompat;->h:I */
return;
} // .end method
public void setVerticalGravity ( Integer p0 ) {
/* .locals 2 */
/* and-int/lit8 p1, p1, 0x70 */
/* iget v0, p0, Landroid/support/v7/widget/LinearLayoutCompat;->d:I */
/* and-int/lit8 v1, v0, 0x70 */
/* if-eq v1, p1, :cond_0 */
/* and-int/lit8 v0, v0, -0x71 */
/* or-int/2addr p1, v0 */
/* iput p1, p0, Landroid/support/v7/widget/LinearLayoutCompat;->d:I */
(( android.support.v7.widget.LinearLayoutCompat ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->requestLayout()V
} // :cond_0
return;
} // .end method
public void setWeightSum ( Float p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
p1 = java.lang.Math .max ( v0,p1 );
/* iput p1, p0, Landroid/support/v7/widget/LinearLayoutCompat;->a:F */
return;
} // .end method
public Boolean shouldDelayChildPressedState ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
