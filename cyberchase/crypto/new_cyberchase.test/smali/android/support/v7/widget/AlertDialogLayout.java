public class android.support.v7.widget.AlertDialogLayout extends android.support.v7.widget.LinearLayoutCompat {
	 /* # direct methods */
	 public android.support.v7.widget.AlertDialogLayout ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Landroid/support/v7/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.AlertDialogLayout ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
		 /* .locals 9 */
		 p1 = 		 (( android.support.v7.widget.AlertDialogLayout ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getPaddingLeft()I
		 /* sub-int/2addr p4, p2 */
		 p2 = 		 (( android.support.v7.widget.AlertDialogLayout ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getPaddingRight()I
		 /* sub-int p2, p4, p2 */
		 /* sub-int/2addr p4, p1 */
		 v0 = 		 (( android.support.v7.widget.AlertDialogLayout ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getPaddingRight()I
		 /* sub-int/2addr p4, v0 */
		 v0 = 		 (( android.support.v7.widget.AlertDialogLayout ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getMeasuredHeight()I
		 v1 = 		 (( android.support.v7.widget.AlertDialogLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getChildCount()I
		 v2 = 		 (( android.support.v7.widget.AlertDialogLayout ) p0 ).getGravity ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getGravity()I
		 /* and-int/lit8 v3, v2, 0x70 */
		 /* const v4, 0x800007 */
		 /* and-int/2addr v2, v4 */
		 /* const/16 v4, 0x10 */
		 /* if-eq v3, v4, :cond_1 */
		 /* const/16 v4, 0x50 */
		 /* if-eq v3, v4, :cond_0 */
		 p3 = 		 (( android.support.v7.widget.AlertDialogLayout ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getPaddingTop()I
	 } // :cond_0
	 v3 = 	 (( android.support.v7.widget.AlertDialogLayout ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getPaddingTop()I
	 /* add-int/2addr v3, p5 */
	 /* sub-int/2addr v3, p3 */
	 /* sub-int p3, v3, v0 */
} // :cond_1
v3 = (( android.support.v7.widget.AlertDialogLayout ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getPaddingTop()I
/* sub-int/2addr p5, p3 */
/* sub-int/2addr p5, v0 */
/* div-int/lit8 p5, p5, 0x2 */
/* add-int p3, v3, p5 */
} // :goto_0
(( android.support.v7.widget.AlertDialogLayout ) p0 ).getDividerDrawable ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getDividerDrawable()Landroid/graphics/drawable/Drawable;
int v0 = 0; // const/4 v0, 0x0
/* if-nez p5, :cond_2 */
int p5 = 0; // const/4 p5, 0x0
} // :cond_2
p5 = (( android.graphics.drawable.Drawable ) p5 ).getIntrinsicHeight ( ); // invoke-virtual {p5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
} // :goto_1
/* if-ge v0, v1, :cond_8 */
(( android.support.v7.widget.AlertDialogLayout ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/AlertDialogLayout;->getChildAt(I)Landroid/view/View;
if ( v3 != null) { // if-eqz v3, :cond_7
v4 = (( android.view.View ) v3 ).getVisibility ( ); // invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
/* const/16 v5, 0x8 */
/* if-eq v4, v5, :cond_7 */
v4 = (( android.view.View ) v3 ).getMeasuredWidth ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I
v5 = (( android.view.View ) v3 ).getMeasuredHeight ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v6, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
/* iget v7, v6, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->c:I */
/* if-gez v7, :cond_3 */
/* move v7, v2 */
} // :cond_3
v8 = em .b ( p0 );
v7 = dz .a ( v7,v8 );
/* and-int/lit8 v7, v7, 0x7 */
int v8 = 1; // const/4 v8, 0x1
/* if-eq v7, v8, :cond_5 */
int v8 = 5; // const/4 v8, 0x5
/* if-eq v7, v8, :cond_4 */
/* iget v7, v6, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->leftMargin:I */
/* add-int/2addr v7, p1 */
} // :cond_4
/* sub-int v7, p2, v4 */
} // :cond_5
/* sub-int v7, p4, v4 */
/* div-int/lit8 v7, v7, 0x2 */
/* add-int/2addr v7, p1 */
/* iget v8, v6, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->leftMargin:I */
/* add-int/2addr v7, v8 */
} // :goto_2
/* iget v8, v6, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->rightMargin:I */
/* sub-int/2addr v7, v8 */
} // :goto_3
v8 = (( android.support.v7.widget.AlertDialogLayout ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/AlertDialogLayout;->a(I)Z
if ( v8 != null) { // if-eqz v8, :cond_6
/* add-int/2addr p3, p5 */
} // :cond_6
/* iget v8, v6, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->topMargin:I */
/* add-int/2addr p3, v8 */
/* add-int/2addr v4, v7 */
/* add-int v8, p3, v5 */
(( android.view.View ) v3 ).layout ( v7, p3, v4, v8 ); // invoke-virtual {v3, v7, p3, v4, v8}, Landroid/view/View;->layout(IIII)V
/* iget v3, v6, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->bottomMargin:I */
/* add-int/2addr v5, v3 */
/* add-int/2addr p3, v5 */
} // :cond_7
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_8
return;
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 16 */
/* move-object/from16 v6, p0 */
/* move/from16 v7, p1 */
v8 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/AlertDialogLayout;->getChildCount()I */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
/* move-object v2, v0 */
/* move-object v3, v2 */
/* move-object v4, v3 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* const/16 v9, 0x8 */
int v10 = 1; // const/4 v10, 0x1
/* if-ge v0, v8, :cond_6 */
(( android.support.v7.widget.AlertDialogLayout ) v6 ).getChildAt ( v0 ); // invoke-virtual {v6, v0}, Landroid/support/v7/widget/AlertDialogLayout;->getChildAt(I)Landroid/view/View;
v10 = (( android.view.View ) v5 ).getVisibility ( ); // invoke-virtual {v5}, Landroid/view/View;->getVisibility()I
/* if-eq v10, v9, :cond_5 */
v9 = (( android.view.View ) v5 ).getId ( ); // invoke-virtual {v5}, Landroid/view/View;->getId()I
/* if-ne v9, v10, :cond_0 */
/* move-object v2, v5 */
} // :cond_0
/* if-ne v9, v10, :cond_1 */
/* move-object v3, v5 */
} // :cond_1
/* if-eq v9, v10, :cond_2 */
/* if-ne v9, v10, :cond_3 */
} // :cond_2
if ( v4 != null) { // if-eqz v4, :cond_4
} // :cond_3
/* move/from16 v13, p2 */
/* goto/16 :goto_a */
} // :cond_4
/* move-object v4, v5 */
} // :cond_5
} // :goto_1
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_6
v0 = /* invoke-static/range {p2 ..p2}, Landroid/view/View$MeasureSpec;->getMode(I)I */
v5 = /* invoke-static/range {p2 ..p2}, Landroid/view/View$MeasureSpec;->getSize(I)I */
v11 = /* invoke-static/range {p1 ..p1}, Landroid/view/View$MeasureSpec;->getMode(I)I */
v12 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/AlertDialogLayout;->getPaddingTop()I */
v13 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/AlertDialogLayout;->getPaddingBottom()I */
/* add-int/2addr v12, v13 */
if ( v2 != null) { // if-eqz v2, :cond_7
(( android.view.View ) v2 ).measure ( v7, v1 ); // invoke-virtual {v2, v7, v1}, Landroid/view/View;->measure(II)V
v13 = (( android.view.View ) v2 ).getMeasuredHeight ( ); // invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v12, v13 */
v2 = (( android.view.View ) v2 ).getMeasuredState ( ); // invoke-virtual {v2}, Landroid/view/View;->getMeasuredState()I
v2 = android.view.View .combineMeasuredStates ( v1,v2 );
} // :cond_7
int v2 = 0; // const/4 v2, 0x0
} // :goto_2
if ( v3 != null) { // if-eqz v3, :cond_a
(( android.view.View ) v3 ).measure ( v7, v1 ); // invoke-virtual {v3, v7, v1}, Landroid/view/View;->measure(II)V
/* move-object v13, v3 */
} // :goto_3
v14 = em .c ( v13 );
/* if-lez v14, :cond_8 */
} // :cond_8
/* instance-of v14, v13, Landroid/view/ViewGroup; */
if ( v14 != null) { // if-eqz v14, :cond_9
/* check-cast v13, Landroid/view/ViewGroup; */
v14 = (( android.view.ViewGroup ) v13 ).getChildCount ( ); // invoke-virtual {v13}, Landroid/view/ViewGroup;->getChildCount()I
/* if-ne v14, v10, :cond_9 */
(( android.view.ViewGroup ) v13 ).getChildAt ( v1 ); // invoke-virtual {v13, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
} // :cond_9
int v14 = 0; // const/4 v14, 0x0
} // :goto_4
v13 = (( android.view.View ) v3 ).getMeasuredHeight ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I
/* sub-int/2addr v13, v14 */
/* add-int/2addr v12, v14 */
v15 = (( android.view.View ) v3 ).getMeasuredState ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredState()I
v2 = android.view.View .combineMeasuredStates ( v2,v15 );
} // :cond_a
int v13 = 0; // const/4 v13, 0x0
int v14 = 0; // const/4 v14, 0x0
} // :goto_5
if ( v4 != null) { // if-eqz v4, :cond_c
/* if-nez v0, :cond_b */
int v15 = 0; // const/4 v15, 0x0
} // :cond_b
/* sub-int v15, v5, v12 */
v15 = java.lang.Math .max ( v1,v15 );
v15 = android.view.View$MeasureSpec .makeMeasureSpec ( v15,v0 );
} // :goto_6
(( android.view.View ) v4 ).measure ( v7, v15 ); // invoke-virtual {v4, v7, v15}, Landroid/view/View;->measure(II)V
v15 = (( android.view.View ) v4 ).getMeasuredHeight ( ); // invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v12, v15 */
v10 = (( android.view.View ) v4 ).getMeasuredState ( ); // invoke-virtual {v4}, Landroid/view/View;->getMeasuredState()I
v2 = android.view.View .combineMeasuredStates ( v2,v10 );
} // :cond_c
int v15 = 0; // const/4 v15, 0x0
} // :goto_7
/* sub-int/2addr v5, v12 */
/* const/high16 v10, 0x40000000 # 2.0f */
if ( v3 != null) { // if-eqz v3, :cond_e
/* sub-int/2addr v12, v14 */
v13 = java.lang.Math .min ( v5,v13 );
/* if-lez v13, :cond_d */
/* sub-int/2addr v5, v13 */
/* add-int/2addr v14, v13 */
} // :cond_d
v13 = android.view.View$MeasureSpec .makeMeasureSpec ( v14,v10 );
(( android.view.View ) v3 ).measure ( v7, v13 ); // invoke-virtual {v3, v7, v13}, Landroid/view/View;->measure(II)V
v13 = (( android.view.View ) v3 ).getMeasuredHeight ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v12, v13 */
v3 = (( android.view.View ) v3 ).getMeasuredState ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredState()I
v2 = android.view.View .combineMeasuredStates ( v2,v3 );
} // :cond_e
if ( v4 != null) { // if-eqz v4, :cond_f
/* if-lez v5, :cond_f */
/* sub-int/2addr v12, v15 */
/* add-int/2addr v15, v5 */
v0 = android.view.View$MeasureSpec .makeMeasureSpec ( v15,v0 );
(( android.view.View ) v4 ).measure ( v7, v0 ); // invoke-virtual {v4, v7, v0}, Landroid/view/View;->measure(II)V
v0 = (( android.view.View ) v4 ).getMeasuredHeight ( ); // invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v12, v0 */
v0 = (( android.view.View ) v4 ).getMeasuredState ( ); // invoke-virtual {v4}, Landroid/view/View;->getMeasuredState()I
v2 = android.view.View .combineMeasuredStates ( v2,v0 );
} // :cond_f
int v0 = 0; // const/4 v0, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_8
/* if-ge v0, v8, :cond_11 */
(( android.support.v7.widget.AlertDialogLayout ) v6 ).getChildAt ( v0 ); // invoke-virtual {v6, v0}, Landroid/support/v7/widget/AlertDialogLayout;->getChildAt(I)Landroid/view/View;
v5 = (( android.view.View ) v4 ).getVisibility ( ); // invoke-virtual {v4}, Landroid/view/View;->getVisibility()I
/* if-eq v5, v9, :cond_10 */
v4 = (( android.view.View ) v4 ).getMeasuredWidth ( ); // invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I
v3 = java.lang.Math .max ( v3,v4 );
} // :cond_10
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_11
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/AlertDialogLayout;->getPaddingLeft()I */
v4 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/AlertDialogLayout;->getPaddingRight()I */
/* add-int/2addr v0, v4 */
/* add-int/2addr v3, v0 */
v0 = android.view.View .resolveSizeAndState ( v3,v7,v2 );
/* move/from16 v13, p2 */
v2 = android.view.View .resolveSizeAndState ( v12,v13,v1 );
(( android.support.v7.widget.AlertDialogLayout ) v6 ).setMeasuredDimension ( v0, v2 ); // invoke-virtual {v6, v0, v2}, Landroid/support/v7/widget/AlertDialogLayout;->setMeasuredDimension(II)V
/* if-eq v11, v10, :cond_13 */
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/support/v7/widget/AlertDialogLayout;->getMeasuredWidth()I */
v10 = android.view.View$MeasureSpec .makeMeasureSpec ( v0,v10 );
int v11 = 0; // const/4 v11, 0x0
} // :goto_9
/* if-ge v11, v8, :cond_13 */
(( android.support.v7.widget.AlertDialogLayout ) v6 ).getChildAt ( v11 ); // invoke-virtual {v6, v11}, Landroid/support/v7/widget/AlertDialogLayout;->getChildAt(I)Landroid/view/View;
v0 = (( android.view.View ) v1 ).getVisibility ( ); // invoke-virtual {v1}, Landroid/view/View;->getVisibility()I
/* if-eq v0, v9, :cond_12 */
(( android.view.View ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* move-object v12, v0 */
/* check-cast v12, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams; */
/* iget v0, v12, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->width:I */
int v2 = -1; // const/4 v2, -0x1
/* if-ne v0, v2, :cond_12 */
/* iget v14, v12, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->height:I */
v0 = (( android.view.View ) v1 ).getMeasuredHeight ( ); // invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I
/* iput v0, v12, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->height:I */
int v3 = 0; // const/4 v3, 0x0
int v5 = 0; // const/4 v5, 0x0
/* move-object/from16 v0, p0 */
/* move v2, v10 */
/* move/from16 v4, p2 */
/* invoke-virtual/range {v0 ..v5}, Landroid/support/v7/widget/AlertDialogLayout;->measureChildWithMargins(Landroid/view/View;IIII)V */
/* iput v14, v12, Landroid/support/v7/widget/LinearLayoutCompat$LayoutParams;->height:I */
} // :cond_12
/* add-int/lit8 v11, v11, 0x1 */
} // :cond_13
int v1 = 1; // const/4 v1, 0x1
} // :goto_a
/* if-nez v1, :cond_14 */
/* invoke-super/range {p0 ..p2}, Landroid/support/v7/widget/LinearLayoutCompat;->onMeasure(II)V */
} // :cond_14
return;
} // .end method
