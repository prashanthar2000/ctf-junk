public abstract class ig implements android.view.View$OnAttachStateChangeListener implements android.view.View$OnTouchListener {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lig$b;, */
	 /* Lig$a; */
	 /* } */
} // .end annotation
/* # instance fields */
private final Float a;
private final Integer a;
final android.view.View a;
private java.lang.Runnable a;
private Boolean a;
private final a;
private final Integer b;
private java.lang.Runnable b;
private Integer c;
/* # direct methods */
public ig ( ) {
	 /* .locals 2 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 int v0 = 2; // const/4 v0, 0x2
	 /* new-array v1, v0, [I */
	 this.a = v1;
	 this.a = p1;
	 int v1 = 1; // const/4 v1, 0x1
	 (( android.view.View ) p1 ).setLongClickable ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/View;->setLongClickable(Z)V
	 (( android.view.View ) p1 ).addOnAttachStateChangeListener ( p0 ); // invoke-virtual {p1, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V
	 (( android.view.View ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
	 android.view.ViewConfiguration .get ( p1 );
	 p1 = 	 (( android.view.ViewConfiguration ) p1 ).getScaledTouchSlop ( ); // invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I
	 /* int-to-float p1, p1 */
	 /* iput p1, p0, Lig;->a:F */
	 p1 = 	 android.view.ViewConfiguration .getTapTimeout ( );
	 /* iput p1, p0, Lig;->a:I */
	 /* iget p1, p0, Lig;->a:I */
	 v1 = 	 android.view.ViewConfiguration .getLongPressTimeout ( );
	 /* add-int/2addr p1, v1 */
	 /* div-int/2addr p1, v0 */
	 /* iput p1, p0, Lig;->b:I */
	 return;
} // .end method
private void b ( ) {
	 /* .locals 2 */
	 v0 = this.b;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v1 = this.a;
		 (( android.view.View ) v1 ).removeCallbacks ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z
	 } // :cond_0
	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 v1 = this.a;
		 (( android.view.View ) v1 ).removeCallbacks ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z
	 } // :cond_1
	 return;
} // .end method
/* # virtual methods */
public abstract hk a ( ) {
} // .end method
final void a ( ) {
	 /* .locals 11 */
	 /* invoke-direct {p0}, Lig;->b()V */
	 v0 = this.a;
	 v1 = 	 (( android.view.View ) v0 ).isEnabled ( ); // invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z
	 if ( v1 != null) { // if-eqz v1, :cond_2
		 v1 = 		 (( android.view.View ) v0 ).isLongClickable ( ); // invoke-virtual {v0}, Landroid/view/View;->isLongClickable()Z
		 if ( v1 != null) { // if-eqz v1, :cond_0
		 } // :cond_0
		 v1 = 		 (( ig ) p0 ).a ( ); // invoke-virtual {p0}, Lig;->a()Z
		 /* if-nez v1, :cond_1 */
		 return;
	 } // :cond_1
	 (( android.view.View ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
	 int v2 = 1; // const/4 v2, 0x1
	 android.os.SystemClock .uptimeMillis ( );
	 /* move-result-wide v5 */
	 int v7 = 3; // const/4 v7, 0x3
	 int v8 = 0; // const/4 v8, 0x0
	 int v9 = 0; // const/4 v9, 0x0
	 int v10 = 0; // const/4 v10, 0x0
	 /* move-wide v3, v5 */
	 /* invoke-static/range {v3 ..v10}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent; */
	 (( android.view.View ) v0 ).onTouchEvent ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z
	 (( android.view.MotionEvent ) v1 ).recycle ( ); // invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V
	 /* iput-boolean v2, p0, Lig;->a:Z */
} // :cond_2
} // :goto_0
return;
} // .end method
protected Boolean a ( ) {
/* .locals 2 */
(( ig ) p0 ).a ( ); // invoke-virtual {p0}, Lig;->a()Lhk;
v1 = if ( v0 != null) { // if-eqz v0, :cond_0
/* if-nez v1, :cond_0 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
protected Boolean b ( ) {
/* .locals 2 */
(( ig ) p0 ).a ( ); // invoke-virtual {p0}, Lig;->a()Lhk;
v1 = if ( v0 != null) { // if-eqz v0, :cond_0
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean onTouch ( android.view.View p0, android.view.MotionEvent p1 ) {
/* .locals 10 */
/* iget-boolean p1, p0, Lig;->a:Z */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
if ( p1 != null) { // if-eqz p1, :cond_6
	 v2 = this.a;
	 (( ig ) p0 ).a ( ); // invoke-virtual {p0}, Lig;->a()Lhk;
		 v4 = 	 if ( v3 != null) { // if-eqz v3, :cond_3
		 /* if-nez v4, :cond_0 */
	 } // :cond_0
	 /* check-cast v3, Lie; */
	 if ( v3 != null) { // if-eqz v3, :cond_3
		 v4 = 		 (( ie ) v3 ).isShown ( ); // invoke-virtual {v3}, Lie;->isShown()Z
		 /* if-nez v4, :cond_1 */
	 } // :cond_1
	 android.view.MotionEvent .obtainNoHistory ( p2 );
	 v5 = this.a;
	 (( android.view.View ) v2 ).getLocationOnScreen ( v5 ); // invoke-virtual {v2, v5}, Landroid/view/View;->getLocationOnScreen([I)V
	 /* aget v2, v5, v1 */
	 /* int-to-float v2, v2 */
	 /* aget v5, v5, v0 */
	 /* int-to-float v5, v5 */
	 (( android.view.MotionEvent ) v4 ).offsetLocation ( v2, v5 ); // invoke-virtual {v4, v2, v5}, Landroid/view/MotionEvent;->offsetLocation(FF)V
	 v2 = this.a;
	 (( android.view.View ) v3 ).getLocationOnScreen ( v2 ); // invoke-virtual {v3, v2}, Landroid/view/View;->getLocationOnScreen([I)V
	 /* aget v5, v2, v1 */
	 /* neg-int v5, v5 */
	 /* int-to-float v5, v5 */
	 /* aget v2, v2, v0 */
	 /* neg-int v2, v2 */
	 /* int-to-float v2, v2 */
	 (( android.view.MotionEvent ) v4 ).offsetLocation ( v5, v2 ); // invoke-virtual {v4, v5, v2}, Landroid/view/MotionEvent;->offsetLocation(FF)V
	 /* iget v2, p0, Lig;->c:I */
	 v2 = 	 (( ie ) v3 ).a ( v4, v2 ); // invoke-virtual {v3, v4, v2}, Lie;->a(Landroid/view/MotionEvent;I)Z
	 (( android.view.MotionEvent ) v4 ).recycle ( ); // invoke-virtual {v4}, Landroid/view/MotionEvent;->recycle()V
	 p2 = 	 (( android.view.MotionEvent ) p2 ).getActionMasked ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I
	 /* if-eq p2, v0, :cond_2 */
	 int v3 = 3; // const/4 v3, 0x3
	 /* if-eq p2, v3, :cond_2 */
	 int p2 = 1; // const/4 p2, 0x1
} // :cond_2
int p2 = 0; // const/4 p2, 0x0
} // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_3
if ( p2 != null) { // if-eqz p2, :cond_3
	 int p2 = 1; // const/4 p2, 0x1
} // :cond_3
} // :goto_1
int p2 = 0; // const/4 p2, 0x0
} // :goto_2
/* if-nez p2, :cond_5 */
p2 = (( ig ) p0 ).b ( ); // invoke-virtual {p0}, Lig;->b()Z
/* if-nez p2, :cond_4 */
} // :cond_4
int p2 = 0; // const/4 p2, 0x0
/* goto/16 :goto_8 */
} // :cond_5
} // :goto_3
int p2 = 1; // const/4 p2, 0x1
/* goto/16 :goto_8 */
} // :cond_6
v2 = this.a;
v3 = (( android.view.View ) v2 ).isEnabled ( ); // invoke-virtual {v2}, Landroid/view/View;->isEnabled()Z
if ( v3 != null) { // if-eqz v3, :cond_a
v3 = (( android.view.MotionEvent ) p2 ).getActionMasked ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I
/* packed-switch v3, :pswitch_data_0 */
/* goto/16 :goto_5 */
/* :pswitch_0 */
/* iget v3, p0, Lig;->c:I */
v3 = (( android.view.MotionEvent ) p2 ).findPointerIndex ( v3 ); // invoke-virtual {p2, v3}, Landroid/view/MotionEvent;->findPointerIndex(I)I
/* if-ltz v3, :cond_a */
v4 = (( android.view.MotionEvent ) p2 ).getX ( v3 ); // invoke-virtual {p2, v3}, Landroid/view/MotionEvent;->getX(I)F
p2 = (( android.view.MotionEvent ) p2 ).getY ( v3 ); // invoke-virtual {p2, v3}, Landroid/view/MotionEvent;->getY(I)F
/* iget v3, p0, Lig;->a:F */
/* neg-float v5, v3 */
/* cmpl-float v6, v4, v5 */
/* if-ltz v6, :cond_7 */
/* cmpl-float v5, p2, v5 */
/* if-ltz v5, :cond_7 */
v5 = (( android.view.View ) v2 ).getRight ( ); // invoke-virtual {v2}, Landroid/view/View;->getRight()I
v6 = (( android.view.View ) v2 ).getLeft ( ); // invoke-virtual {v2}, Landroid/view/View;->getLeft()I
/* sub-int/2addr v5, v6 */
/* int-to-float v5, v5 */
/* add-float/2addr v5, v3 */
/* cmpg-float v4, v4, v5 */
/* if-gez v4, :cond_7 */
v4 = (( android.view.View ) v2 ).getBottom ( ); // invoke-virtual {v2}, Landroid/view/View;->getBottom()I
v5 = (( android.view.View ) v2 ).getTop ( ); // invoke-virtual {v2}, Landroid/view/View;->getTop()I
/* sub-int/2addr v4, v5 */
/* int-to-float v4, v4 */
/* add-float/2addr v4, v3 */
/* cmpg-float p2, p2, v4 */
/* if-gez p2, :cond_7 */
int p2 = 1; // const/4 p2, 0x1
} // :cond_7
int p2 = 0; // const/4 p2, 0x0
} // :goto_4
/* if-nez p2, :cond_a */
/* invoke-direct {p0}, Lig;->b()V */
(( android.view.View ) v2 ).getParent ( ); // invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
int p2 = 1; // const/4 p2, 0x1
/* :pswitch_1 */
/* invoke-direct {p0}, Lig;->b()V */
/* :pswitch_2 */
p2 = (( android.view.MotionEvent ) p2 ).getPointerId ( v1 ); // invoke-virtual {p2, v1}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput p2, p0, Lig;->c:I */
p2 = this.a;
/* if-nez p2, :cond_8 */
/* new-instance p2, Lig$a; */
/* invoke-direct {p2, p0}, Lig$a;-><init>(Lig;)V */
this.a = p2;
} // :cond_8
p2 = this.a;
/* iget v3, p0, Lig;->a:I */
/* int-to-long v3, v3 */
(( android.view.View ) v2 ).postDelayed ( p2, v3, v4 ); // invoke-virtual {v2, p2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z
p2 = this.b;
/* if-nez p2, :cond_9 */
/* new-instance p2, Lig$b; */
/* invoke-direct {p2, p0}, Lig$b;-><init>(Lig;)V */
this.b = p2;
} // :cond_9
p2 = this.b;
/* iget v3, p0, Lig;->b:I */
/* int-to-long v3, v3 */
(( android.view.View ) v2 ).postDelayed ( p2, v3, v4 ); // invoke-virtual {v2, p2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z
} // :cond_a
} // :goto_5
int p2 = 0; // const/4 p2, 0x0
} // :goto_6
if ( p2 != null) { // if-eqz p2, :cond_b
p2 = (( ig ) p0 ).a ( ); // invoke-virtual {p0}, Lig;->a()Z
if ( p2 != null) { // if-eqz p2, :cond_b
int p2 = 1; // const/4 p2, 0x1
} // :cond_b
int p2 = 0; // const/4 p2, 0x0
} // :goto_7
if ( p2 != null) { // if-eqz p2, :cond_c
android.os.SystemClock .uptimeMillis ( );
/* move-result-wide v4 */
int v6 = 3; // const/4 v6, 0x3
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
/* move-wide v2, v4 */
/* invoke-static/range {v2 ..v9}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent; */
v3 = this.a;
(( android.view.View ) v3 ).onTouchEvent ( v2 ); // invoke-virtual {v3, v2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z
(( android.view.MotionEvent ) v2 ).recycle ( ); // invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V
} // :cond_c
} // :goto_8
/* iput-boolean p2, p0, Lig;->a:Z */
/* if-nez p2, :cond_e */
if ( p1 != null) { // if-eqz p1, :cond_d
} // :cond_d
} // :cond_e
} // :goto_9
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public void onViewAttachedToWindow ( android.view.View p0 ) {
/* .locals 0 */
return;
} // .end method
public void onViewDetachedFromWindow ( android.view.View p0 ) {
/* .locals 1 */
int p1 = 0; // const/4 p1, 0x0
/* iput-boolean p1, p0, Lig;->a:Z */
int p1 = -1; // const/4 p1, -0x1
/* iput p1, p0, Lig;->c:I */
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = this.a;
(( android.view.View ) v0 ).removeCallbacks ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z
} // :cond_0
return;
} // .end method
