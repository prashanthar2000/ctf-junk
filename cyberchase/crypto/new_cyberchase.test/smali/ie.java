public class ie extends android.widget.ListView {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lie$b;, */
	 /* Lie$a; */
	 /* } */
} // .end annotation
/* # instance fields */
private Integer a;
private final android.graphics.Rect a;
private ep a;
private fk a;
private ie$a a;
ie$b a;
private java.lang.reflect.Field a;
private Boolean a;
private Integer b;
private Boolean b;
private Integer c;
private Boolean c;
private Integer d;
private Integer e;
/* # direct methods */
public ie ( ) {
	 /* .locals 2 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* invoke-direct {p0, p1, v1, v0}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 /* new-instance p1, Landroid/graphics/Rect; */
	 /* invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V */
	 this.a = p1;
	 int p1 = 0; // const/4 p1, 0x0
	 /* iput p1, p0, Lie;->a:I */
	 /* iput p1, p0, Lie;->b:I */
	 /* iput p1, p0, Lie;->c:I */
	 /* iput p1, p0, Lie;->d:I */
	 /* iput-boolean p2, p0, Lie;->b:Z */
	 (( ie ) p0 ).setCacheColorHint ( p1 ); // invoke-virtual {p0, p1}, Lie;->setCacheColorHint(I)V
	 try { // :try_start_0
		 /* const-class p1, Landroid/widget/AbsListView; */
		 final String p2 = "mIsChildViewEnabled"; // const-string p2, "mIsChildViewEnabled"
		 (( java.lang.Class ) p1 ).getDeclaredField ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
		 this.a = p1;
		 p1 = this.a;
		 int p2 = 1; // const/4 p2, 0x1
		 (( java.lang.reflect.Field ) p1 ).setAccessible ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/reflect/Field;->setAccessible(Z)V
		 /* :try_end_0 */
		 /* .catch Ljava/lang/NoSuchFieldException; {:try_start_0 ..:try_end_0} :catch_0 */
		 return;
		 /* :catch_0 */
		 /* move-exception p1 */
		 (( java.lang.NoSuchFieldException ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Ljava/lang/NoSuchFieldException;->printStackTrace()V
		 return;
	 } // .end method
	 private void a ( ) {
		 /* .locals 2 */
		 (( ie ) p0 ).getSelector ( ); // invoke-virtual {p0}, Lie;->getSelector()Landroid/graphics/drawable/Drawable;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* iget-boolean v1, p0, Lie;->c:Z */
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 v1 = 				 (( ie ) p0 ).isPressed ( ); // invoke-virtual {p0}, Lie;->isPressed()Z
				 if ( v1 != null) { // if-eqz v1, :cond_0
					 (( ie ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Lie;->getDrawableState()[I
					 (( android.graphics.drawable.Drawable ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
				 } // :cond_0
				 return;
			 } // .end method
			 private void setSelectorEnabled ( Boolean p0 ) {
				 /* .locals 1 */
				 v0 = this.a;
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 /* iput-boolean p1, v0, Lie$a;->a:Z */
				 } // :cond_0
				 return;
			 } // .end method
			 /* # virtual methods */
			 public Integer a ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
				 /* .locals 10 */
				 p2 = 				 (( ie ) p0 ).getListPaddingTop ( ); // invoke-virtual {p0}, Lie;->getListPaddingTop()I
				 p3 = 				 (( ie ) p0 ).getListPaddingBottom ( ); // invoke-virtual {p0}, Lie;->getListPaddingBottom()I
				 (( ie ) p0 ).getListPaddingLeft ( ); // invoke-virtual {p0}, Lie;->getListPaddingLeft()I
				 (( ie ) p0 ).getListPaddingRight ( ); // invoke-virtual {p0}, Lie;->getListPaddingRight()I
				 v0 = 				 (( ie ) p0 ).getDividerHeight ( ); // invoke-virtual {p0}, Lie;->getDividerHeight()I
				 (( ie ) p0 ).getDivider ( ); // invoke-virtual {p0}, Lie;->getDivider()Landroid/graphics/drawable/Drawable;
				 (( ie ) p0 ).getAdapter ( ); // invoke-virtual {p0}, Lie;->getAdapter()Landroid/widget/ListAdapter;
				 /* if-nez v2, :cond_0 */
				 /* add-int/2addr p2, p3 */
			 } // :cond_0
			 /* add-int/2addr p2, p3 */
			 int p3 = 0; // const/4 p3, 0x0
			 /* if-lez v0, :cond_1 */
			 if ( v1 != null) { // if-eqz v1, :cond_1
			 } // :cond_1
			 int v0 = 0; // const/4 v0, 0x0
		 v1 = 		 } // :goto_0
		 int v3 = 0; // const/4 v3, 0x0
		 /* move v4, p2 */
		 /* move-object v6, v3 */
		 int p2 = 0; // const/4 p2, 0x0
		 int v5 = 0; // const/4 v5, 0x0
		 int v7 = 0; // const/4 v7, 0x0
	 } // :goto_1
	 v8 = 	 /* if-ge p2, v1, :cond_9 */
	 /* if-eq v8, v5, :cond_2 */
	 /* move-object v6, v3 */
	 /* move v5, v8 */
} // :cond_2
(( android.view.View ) v6 ).getLayoutParams ( ); // invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* if-nez v8, :cond_3 */
(( ie ) p0 ).generateDefaultLayoutParams ( ); // invoke-virtual {p0}, Lie;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
(( android.view.View ) v6 ).setLayoutParams ( v8 ); // invoke-virtual {v6, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
} // :cond_3
/* iget v9, v8, Landroid/view/ViewGroup$LayoutParams;->height:I */
/* if-lez v9, :cond_4 */
/* iget v8, v8, Landroid/view/ViewGroup$LayoutParams;->height:I */
/* const/high16 v9, 0x40000000 # 2.0f */
v8 = android.view.View$MeasureSpec .makeMeasureSpec ( v8,v9 );
} // :cond_4
v8 = android.view.View$MeasureSpec .makeMeasureSpec ( p3,p3 );
} // :goto_2
(( android.view.View ) v6 ).measure ( p1, v8 ); // invoke-virtual {v6, p1, v8}, Landroid/view/View;->measure(II)V
(( android.view.View ) v6 ).forceLayout ( ); // invoke-virtual {v6}, Landroid/view/View;->forceLayout()V
/* if-lez p2, :cond_5 */
/* add-int/2addr v4, v0 */
} // :cond_5
v8 = (( android.view.View ) v6 ).getMeasuredHeight ( ); // invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v4, v8 */
/* if-lt v4, p4, :cond_7 */
/* if-ltz p5, :cond_6 */
/* if-le p2, p5, :cond_6 */
/* if-lez v7, :cond_6 */
/* if-eq v4, p4, :cond_6 */
} // :cond_6
} // :cond_7
/* if-ltz p5, :cond_8 */
/* if-lt p2, p5, :cond_8 */
/* move v7, v4 */
} // :cond_8
/* add-int/lit8 p2, p2, 0x1 */
} // :cond_9
} // .end method
public Boolean a ( android.view.MotionEvent p0, Integer p1 ) {
/* .locals 16 */
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, p1 */
v3 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getActionMasked()I */
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
/* packed-switch v3, :pswitch_data_0 */
} // :cond_0
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
int v4 = 0; // const/4 v4, 0x0
/* goto/16 :goto_8 */
} // :goto_2
/* :pswitch_0 */
int v0 = 0; // const/4 v0, 0x0
/* :pswitch_1 */
int v0 = 1; // const/4 v0, 0x1
/* :pswitch_2 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_3
v6 = /* invoke-virtual/range {p1 ..p2}, Landroid/view/MotionEvent;->findPointerIndex(I)I */
/* if-gez v6, :cond_1 */
} // :cond_1
v7 = (( android.view.MotionEvent ) v2 ).getX ( v6 ); // invoke-virtual {v2, v6}, Landroid/view/MotionEvent;->getX(I)F
/* float-to-int v7, v7 */
v6 = (( android.view.MotionEvent ) v2 ).getY ( v6 ); // invoke-virtual {v2, v6}, Landroid/view/MotionEvent;->getY(I)F
/* float-to-int v6, v6 */
v8 = (( ie ) v1 ).pointToPosition ( v7, v6 ); // invoke-virtual {v1, v7, v6}, Lie;->pointToPosition(II)I
int v9 = -1; // const/4 v9, -0x1
/* if-ne v8, v9, :cond_2 */
/* goto/16 :goto_8 */
} // :cond_2
v0 = /* invoke-virtual/range {p0 ..p0}, Lie;->getFirstVisiblePosition()I */
/* sub-int v0, v8, v0 */
(( ie ) v1 ).getChildAt ( v0 ); // invoke-virtual {v1, v0}, Lie;->getChildAt(I)Landroid/view/View;
/* int-to-float v7, v7 */
/* int-to-float v6, v6 */
/* iput-boolean v4, v1, Lie;->c:Z */
/* const/16 v11, 0x15 */
/* if-lt v0, v11, :cond_3 */
(( ie ) v1 ).drawableHotspotChanged ( v7, v6 ); // invoke-virtual {v1, v7, v6}, Lie;->drawableHotspotChanged(FF)V
} // :cond_3
v0 = /* invoke-virtual/range {p0 ..p0}, Lie;->isPressed()Z */
/* if-nez v0, :cond_4 */
(( ie ) v1 ).setPressed ( v4 ); // invoke-virtual {v1, v4}, Lie;->setPressed(Z)V
} // :cond_4
/* invoke-virtual/range {p0 ..p0}, Lie;->layoutChildren()V */
/* iget v0, v1, Lie;->e:I */
/* if-eq v0, v9, :cond_5 */
v12 = /* invoke-virtual/range {p0 ..p0}, Lie;->getFirstVisiblePosition()I */
/* sub-int/2addr v0, v12 */
(( ie ) v1 ).getChildAt ( v0 ); // invoke-virtual {v1, v0}, Lie;->getChildAt(I)Landroid/view/View;
if ( v0 != null) { // if-eqz v0, :cond_5
/* if-eq v0, v10, :cond_5 */
v12 = (( android.view.View ) v0 ).isPressed ( ); // invoke-virtual {v0}, Landroid/view/View;->isPressed()Z
if ( v12 != null) { // if-eqz v12, :cond_5
(( android.view.View ) v0 ).setPressed ( v5 ); // invoke-virtual {v0, v5}, Landroid/view/View;->setPressed(Z)V
} // :cond_5
/* iput v8, v1, Lie;->e:I */
v0 = (( android.view.View ) v10 ).getLeft ( ); // invoke-virtual {v10}, Landroid/view/View;->getLeft()I
/* int-to-float v0, v0 */
/* sub-float v0, v7, v0 */
v12 = (( android.view.View ) v10 ).getTop ( ); // invoke-virtual {v10}, Landroid/view/View;->getTop()I
/* int-to-float v12, v12 */
/* sub-float v12, v6, v12 */
/* if-lt v13, v11, :cond_6 */
(( android.view.View ) v10 ).drawableHotspotChanged ( v0, v12 ); // invoke-virtual {v10, v0, v12}, Landroid/view/View;->drawableHotspotChanged(FF)V
} // :cond_6
v0 = (( android.view.View ) v10 ).isPressed ( ); // invoke-virtual {v10}, Landroid/view/View;->isPressed()Z
/* if-nez v0, :cond_7 */
(( android.view.View ) v10 ).setPressed ( v4 ); // invoke-virtual {v10, v4}, Landroid/view/View;->setPressed(Z)V
} // :cond_7
/* invoke-virtual/range {p0 ..p0}, Lie;->getSelector()Landroid/graphics/drawable/Drawable; */
if ( v11 != null) { // if-eqz v11, :cond_8
/* if-eq v8, v9, :cond_8 */
int v12 = 1; // const/4 v12, 0x1
} // :cond_8
int v12 = 0; // const/4 v12, 0x0
} // :goto_4
if ( v12 != null) { // if-eqz v12, :cond_9
(( android.graphics.drawable.Drawable ) v11 ).setVisible ( v5, v5 ); // invoke-virtual {v11, v5, v5}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
} // :cond_9
v0 = this.a;
v13 = (( android.view.View ) v10 ).getLeft ( ); // invoke-virtual {v10}, Landroid/view/View;->getLeft()I
v14 = (( android.view.View ) v10 ).getTop ( ); // invoke-virtual {v10}, Landroid/view/View;->getTop()I
v15 = (( android.view.View ) v10 ).getRight ( ); // invoke-virtual {v10}, Landroid/view/View;->getRight()I
v4 = (( android.view.View ) v10 ).getBottom ( ); // invoke-virtual {v10}, Landroid/view/View;->getBottom()I
(( android.graphics.Rect ) v0 ).set ( v13, v14, v15, v4 ); // invoke-virtual {v0, v13, v14, v15, v4}, Landroid/graphics/Rect;->set(IIII)V
/* iget v4, v0, Landroid/graphics/Rect;->left:I */
/* iget v13, v1, Lie;->a:I */
/* sub-int/2addr v4, v13 */
/* iput v4, v0, Landroid/graphics/Rect;->left:I */
/* iget v4, v0, Landroid/graphics/Rect;->top:I */
/* iget v13, v1, Lie;->b:I */
/* sub-int/2addr v4, v13 */
/* iput v4, v0, Landroid/graphics/Rect;->top:I */
/* iget v4, v0, Landroid/graphics/Rect;->right:I */
/* iget v13, v1, Lie;->c:I */
/* add-int/2addr v4, v13 */
/* iput v4, v0, Landroid/graphics/Rect;->right:I */
/* iget v4, v0, Landroid/graphics/Rect;->bottom:I */
/* iget v13, v1, Lie;->d:I */
/* add-int/2addr v4, v13 */
/* iput v4, v0, Landroid/graphics/Rect;->bottom:I */
try { // :try_start_0
v0 = this.a;
v0 = (( java.lang.reflect.Field ) v0 ).getBoolean ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z
v4 = (( android.view.View ) v10 ).isEnabled ( ); // invoke-virtual {v10}, Landroid/view/View;->isEnabled()Z
/* if-eq v4, v0, :cond_b */
v4 = this.a;
/* if-nez v0, :cond_a */
int v0 = 1; // const/4 v0, 0x1
} // :cond_a
int v0 = 0; // const/4 v0, 0x0
} // :goto_5
java.lang.Boolean .valueOf ( v0 );
(( java.lang.reflect.Field ) v4 ).set ( v1, v0 ); // invoke-virtual {v4, v1, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
/* if-eq v8, v9, :cond_b */
/* invoke-virtual/range {p0 ..p0}, Lie;->refreshDrawableState()V */
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
(( java.lang.IllegalAccessException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V
} // :cond_b
} // :goto_6
if ( v12 != null) { // if-eqz v12, :cond_d
v0 = this.a;
v4 = (( android.graphics.Rect ) v0 ).exactCenterX ( ); // invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterX()F
v0 = (( android.graphics.Rect ) v0 ).exactCenterY ( ); // invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterY()F
v12 = /* invoke-virtual/range {p0 ..p0}, Lie;->getVisibility()I */
/* if-nez v12, :cond_c */
int v12 = 1; // const/4 v12, 0x1
} // :cond_c
int v12 = 0; // const/4 v12, 0x0
} // :goto_7
(( android.graphics.drawable.Drawable ) v11 ).setVisible ( v12, v5 ); // invoke-virtual {v11, v12, v5}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
cx .a ( v11,v4,v0 );
} // :cond_d
/* invoke-virtual/range {p0 ..p0}, Lie;->getSelector()Landroid/graphics/drawable/Drawable; */
if ( v0 != null) { // if-eqz v0, :cond_e
/* if-eq v8, v9, :cond_e */
cx .a ( v0,v7,v6 );
} // :cond_e
/* invoke-direct {v1, v5}, Lie;->setSelectorEnabled(Z)V */
/* invoke-virtual/range {p0 ..p0}, Lie;->refreshDrawableState()V */
int v4 = 1; // const/4 v4, 0x1
/* if-ne v3, v4, :cond_0 */
(( ie ) v1 ).getItemIdAtPosition ( v8 ); // invoke-virtual {v1, v8}, Lie;->getItemIdAtPosition(I)J
/* move-result-wide v3 */
(( ie ) v1 ).performItemClick ( v10, v8, v3, v4 ); // invoke-virtual {v1, v10, v8, v3, v4}, Lie;->performItemClick(Landroid/view/View;IJ)Z
/* goto/16 :goto_0 */
} // :goto_8
if ( v0 != null) { // if-eqz v0, :cond_f
if ( v4 != null) { // if-eqz v4, :cond_11
} // :cond_f
/* iput-boolean v5, v1, Lie;->c:Z */
(( ie ) v1 ).setPressed ( v5 ); // invoke-virtual {v1, v5}, Lie;->setPressed(Z)V
/* invoke-virtual/range {p0 ..p0}, Lie;->drawableStateChanged()V */
/* iget v3, v1, Lie;->e:I */
v4 = /* invoke-virtual/range {p0 ..p0}, Lie;->getFirstVisiblePosition()I */
/* sub-int/2addr v3, v4 */
(( ie ) v1 ).getChildAt ( v3 ); // invoke-virtual {v1, v3}, Lie;->getChildAt(I)Landroid/view/View;
if ( v3 != null) { // if-eqz v3, :cond_10
(( android.view.View ) v3 ).setPressed ( v5 ); // invoke-virtual {v3, v5}, Landroid/view/View;->setPressed(Z)V
} // :cond_10
v3 = this.a;
if ( v3 != null) { // if-eqz v3, :cond_11
(( ep ) v3 ).a ( ); // invoke-virtual {v3}, Lep;->a()V
int v3 = 0; // const/4 v3, 0x0
this.a = v3;
} // :cond_11
if ( v0 != null) { // if-eqz v0, :cond_13
v3 = this.a;
/* if-nez v3, :cond_12 */
/* new-instance v3, Lfk; */
/* invoke-direct {v3, v1}, Lfk;-><init>(Landroid/widget/ListView;)V */
this.a = v3;
} // :cond_12
v3 = this.a;
int v4 = 1; // const/4 v4, 0x1
(( fk ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Lfk;->a(Z)Lfa;
v3 = this.a;
(( fk ) v3 ).onTouch ( v1, v2 ); // invoke-virtual {v3, v1, v2}, Lfk;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
} // :cond_13
v2 = this.a;
if ( v2 != null) { // if-eqz v2, :cond_14
(( fk ) v2 ).a ( v5 ); // invoke-virtual {v2, v5}, Lfk;->a(Z)Lfa;
} // :cond_14
} // :goto_9
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
protected void dispatchDraw ( android.graphics.Canvas p0 ) {
/* .locals 2 */
v0 = this.a;
v0 = (( android.graphics.Rect ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z
/* if-nez v0, :cond_0 */
(( ie ) p0 ).getSelector ( ); // invoke-virtual {p0}, Lie;->getSelector()Landroid/graphics/drawable/Drawable;
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = this.a;
(( android.graphics.drawable.Drawable ) v0 ).setBounds ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V
(( android.graphics.drawable.Drawable ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
} // :cond_0
/* invoke-super {p0, p1}, Landroid/widget/ListView;->dispatchDraw(Landroid/graphics/Canvas;)V */
return;
} // .end method
protected void drawableStateChanged ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
return;
} // :cond_0
/* invoke-super {p0}, Landroid/widget/ListView;->drawableStateChanged()V */
int v0 = 1; // const/4 v0, 0x1
/* invoke-direct {p0, v0}, Lie;->setSelectorEnabled(Z)V */
/* invoke-direct {p0}, Lie;->a()V */
return;
} // .end method
public Boolean hasFocus ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lie;->b:Z */
/* if-nez v0, :cond_1 */
v0 = /* invoke-super {p0}, Landroid/widget/ListView;->hasFocus()Z */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean hasWindowFocus ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lie;->b:Z */
/* if-nez v0, :cond_1 */
v0 = /* invoke-super {p0}, Landroid/widget/ListView;->hasWindowFocus()Z */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean isFocused ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lie;->b:Z */
/* if-nez v0, :cond_1 */
v0 = /* invoke-super {p0}, Landroid/widget/ListView;->isFocused()Z */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean isInTouchMode ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lie;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lie;->a:Z */
/* if-nez v0, :cond_1 */
} // :cond_0
v0 = /* invoke-super {p0}, Landroid/widget/ListView;->isInTouchMode()Z */
if ( v0 != null) { // if-eqz v0, :cond_2
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // .end method
protected void onDetachedFromWindow ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
/* invoke-super {p0}, Landroid/widget/ListView;->onDetachedFromWindow()V */
return;
} // .end method
public Boolean onHoverEvent ( android.view.MotionEvent p0 ) {
/* .locals 4 */
/* const/16 v1, 0x1a */
/* if-ge v0, v1, :cond_0 */
p1 = /* invoke-super {p0, p1}, Landroid/widget/ListView;->onHoverEvent(Landroid/view/MotionEvent;)Z */
} // :cond_0
v0 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
/* const/16 v1, 0xa */
/* if-ne v0, v1, :cond_1 */
v1 = this.a;
/* if-nez v1, :cond_1 */
/* new-instance v1, Lie$b; */
/* invoke-direct {v1, p0}, Lie$b;-><init>(Lie;)V */
this.a = v1;
v1 = this.a;
v2 = this.a;
(( ie ) v2 ).post ( v1 ); // invoke-virtual {v2, v1}, Lie;->post(Ljava/lang/Runnable;)Z
} // :cond_1
v1 = /* invoke-super {p0, p1}, Landroid/widget/ListView;->onHoverEvent(Landroid/view/MotionEvent;)Z */
/* const/16 v2, 0x9 */
int v3 = -1; // const/4 v3, -0x1
/* if-eq v0, v2, :cond_3 */
int v2 = 7; // const/4 v2, 0x7
/* if-ne v0, v2, :cond_2 */
} // :cond_2
(( ie ) p0 ).setSelection ( v3 ); // invoke-virtual {p0, v3}, Lie;->setSelection(I)V
} // :cond_3
} // :goto_0
v0 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* float-to-int v0, v0 */
p1 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* float-to-int p1, p1 */
p1 = (( ie ) p0 ).pointToPosition ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lie;->pointToPosition(II)I
/* if-eq p1, v3, :cond_5 */
v0 = (( ie ) p0 ).getSelectedItemPosition ( ); // invoke-virtual {p0}, Lie;->getSelectedItemPosition()I
/* if-eq p1, v0, :cond_5 */
v0 = (( ie ) p0 ).getFirstVisiblePosition ( ); // invoke-virtual {p0}, Lie;->getFirstVisiblePosition()I
/* sub-int v0, p1, v0 */
(( ie ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Lie;->getChildAt(I)Landroid/view/View;
v2 = (( android.view.View ) v0 ).isEnabled ( ); // invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z
if ( v2 != null) { // if-eqz v2, :cond_4
v0 = (( android.view.View ) v0 ).getTop ( ); // invoke-virtual {v0}, Landroid/view/View;->getTop()I
v2 = (( ie ) p0 ).getTop ( ); // invoke-virtual {p0}, Lie;->getTop()I
/* sub-int/2addr v0, v2 */
(( ie ) p0 ).setSelectionFromTop ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lie;->setSelectionFromTop(II)V
} // :cond_4
/* invoke-direct {p0}, Lie;->a()V */
} // :cond_5
} // :goto_1
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 3 */
v0 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
v0 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* float-to-int v0, v0 */
v1 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* float-to-int v1, v1 */
v0 = (( ie ) p0 ).pointToPosition ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lie;->pointToPosition(II)I
/* iput v0, p0, Lie;->e:I */
} // :goto_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
v1 = this.a;
int v2 = 0; // const/4 v2, 0x0
this.a = v2;
v1 = this.a;
(( ie ) v1 ).removeCallbacks ( v0 ); // invoke-virtual {v1, v0}, Lie;->removeCallbacks(Ljava/lang/Runnable;)Z
} // :cond_1
p1 = /* invoke-super {p0, p1}, Landroid/widget/ListView;->onTouchEvent(Landroid/view/MotionEvent;)Z */
} // .end method
public void setListSelectionHidden ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lie;->a:Z */
return;
} // .end method
public void setSelector ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* new-instance v0, Lie$a; */
/* invoke-direct {v0, p1}, Lie$a;-><init>(Landroid/graphics/drawable/Drawable;)V */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
this.a = v0;
v0 = this.a;
/* invoke-super {p0, v0}, Landroid/widget/ListView;->setSelector(Landroid/graphics/drawable/Drawable;)V */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
if ( p1 != null) { // if-eqz p1, :cond_1
(( android.graphics.drawable.Drawable ) p1 ).getPadding ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
} // :cond_1
/* iget p1, v0, Landroid/graphics/Rect;->left:I */
/* iput p1, p0, Lie;->a:I */
/* iget p1, v0, Landroid/graphics/Rect;->top:I */
/* iput p1, p0, Lie;->b:I */
/* iget p1, v0, Landroid/graphics/Rect;->right:I */
/* iput p1, p0, Lie;->c:I */
/* iget p1, v0, Landroid/graphics/Rect;->bottom:I */
/* iput p1, p0, Lie;->d:I */
return;
} // .end method
