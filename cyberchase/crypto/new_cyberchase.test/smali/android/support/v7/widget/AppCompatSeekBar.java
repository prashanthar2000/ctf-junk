public class android.support.v7.widget.AppCompatSeekBar extends android.widget.SeekBar {
	 /* # instance fields */
	 private final hy a;
	 /* # direct methods */
	 public android.support.v7.widget.AppCompatSeekBar ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/AppCompatSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.AppCompatSeekBar ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/AppCompatSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.AppCompatSeekBar ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* new-instance p1, Lhy; */
		 /* invoke-direct {p1, p0}, Lhy;-><init>(Landroid/widget/SeekBar;)V */
		 this.a = p1;
		 p1 = this.a;
		 (( hy ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lhy;->a(Landroid/util/AttributeSet;I)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void drawableStateChanged ( ) {
		 /* .locals 3 */
		 /* invoke-super {p0}, Landroid/widget/SeekBar;->drawableStateChanged()V */
		 v0 = this.a;
		 v1 = this.a;
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 v2 = 			 (( android.graphics.drawable.Drawable ) v1 ).isStateful ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z
			 if ( v2 != null) { // if-eqz v2, :cond_0
				 v2 = this.a;
				 (( android.widget.SeekBar ) v2 ).getDrawableState ( ); // invoke-virtual {v2}, Landroid/widget/SeekBar;->getDrawableState()[I
				 v2 = 				 (( android.graphics.drawable.Drawable ) v1 ).setState ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setState([I)Z
				 if ( v2 != null) { // if-eqz v2, :cond_0
					 v0 = this.a;
					 (( android.widget.SeekBar ) v0 ).invalidateDrawable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
				 } // :cond_0
				 return;
			 } // .end method
			 public void jumpDrawablesToCurrentState ( ) {
				 /* .locals 2 */
				 /* invoke-super {p0}, Landroid/widget/SeekBar;->jumpDrawablesToCurrentState()V */
				 v0 = this.a;
				 v1 = this.a;
				 if ( v1 != null) { // if-eqz v1, :cond_0
					 v0 = this.a;
					 (( android.graphics.drawable.Drawable ) v0 ).jumpToCurrentState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
				 } // :cond_0
				 return;
			 } // .end method
			 protected synchronized void onDraw ( android.graphics.Canvas p0 ) {
				 /* .locals 7 */
				 /* monitor-enter p0 */
				 try { // :try_start_0
					 /* invoke-super {p0, p1}, Landroid/widget/SeekBar;->onDraw(Landroid/graphics/Canvas;)V */
					 v0 = this.a;
					 v1 = this.a;
					 if ( v1 != null) { // if-eqz v1, :cond_3
						 v1 = this.a;
						 v1 = 						 (( android.widget.SeekBar ) v1 ).getMax ( ); // invoke-virtual {v1}, Landroid/widget/SeekBar;->getMax()I
						 int v2 = 1; // const/4 v2, 0x1
						 /* if-le v1, v2, :cond_3 */
						 v3 = this.a;
						 v3 = 						 (( android.graphics.drawable.Drawable ) v3 ).getIntrinsicWidth ( ); // invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
						 v4 = this.a;
						 v4 = 						 (( android.graphics.drawable.Drawable ) v4 ).getIntrinsicHeight ( ); // invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
						 /* if-ltz v3, :cond_0 */
						 /* div-int/lit8 v3, v3, 0x2 */
					 } // :cond_0
					 int v3 = 1; // const/4 v3, 0x1
				 } // :goto_0
				 /* if-ltz v4, :cond_1 */
				 /* div-int/lit8 v2, v4, 0x2 */
			 } // :cond_1
			 v4 = this.a;
			 /* neg-int v5, v3 */
			 /* neg-int v6, v2 */
			 (( android.graphics.drawable.Drawable ) v4 ).setBounds ( v5, v6, v3, v2 ); // invoke-virtual {v4, v5, v6, v3, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
			 v2 = this.a;
			 v2 = 			 (( android.widget.SeekBar ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/widget/SeekBar;->getWidth()I
			 v3 = this.a;
			 v3 = 			 (( android.widget.SeekBar ) v3 ).getPaddingLeft ( ); // invoke-virtual {v3}, Landroid/widget/SeekBar;->getPaddingLeft()I
			 /* sub-int/2addr v2, v3 */
			 v3 = this.a;
			 v3 = 			 (( android.widget.SeekBar ) v3 ).getPaddingRight ( ); // invoke-virtual {v3}, Landroid/widget/SeekBar;->getPaddingRight()I
			 /* sub-int/2addr v2, v3 */
			 /* int-to-float v2, v2 */
			 /* int-to-float v3, v1 */
			 /* div-float/2addr v2, v3 */
			 v3 = 			 (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
			 v4 = this.a;
			 v4 = 			 (( android.widget.SeekBar ) v4 ).getPaddingLeft ( ); // invoke-virtual {v4}, Landroid/widget/SeekBar;->getPaddingLeft()I
			 /* int-to-float v4, v4 */
			 v5 = this.a;
			 v5 = 			 (( android.widget.SeekBar ) v5 ).getHeight ( ); // invoke-virtual {v5}, Landroid/widget/SeekBar;->getHeight()I
			 /* div-int/lit8 v5, v5, 0x2 */
			 /* int-to-float v5, v5 */
			 (( android.graphics.Canvas ) p1 ).translate ( v4, v5 ); // invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V
			 int v4 = 0; // const/4 v4, 0x0
		 } // :goto_1
		 /* if-gt v4, v1, :cond_2 */
		 v5 = this.a;
		 (( android.graphics.drawable.Drawable ) v5 ).draw ( p1 ); // invoke-virtual {v5, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
		 int v5 = 0; // const/4 v5, 0x0
		 (( android.graphics.Canvas ) p1 ).translate ( v2, v5 ); // invoke-virtual {p1, v2, v5}, Landroid/graphics/Canvas;->translate(FF)V
		 /* add-int/lit8 v4, v4, 0x1 */
	 } // :cond_2
	 (( android.graphics.Canvas ) p1 ).restoreToCount ( v3 ); // invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_3
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
return;
} // .end method
