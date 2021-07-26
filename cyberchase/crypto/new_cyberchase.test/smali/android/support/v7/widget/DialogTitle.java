public class android.support.v7.widget.DialogTitle extends android.widget.TextView {
	 /* # direct methods */
	 public android.support.v7.widget.DialogTitle ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.DialogTitle ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.DialogTitle ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onMeasure ( Integer p0, Integer p1 ) {
		 /* .locals 6 */
		 /* invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V */
		 (( android.support.v7.widget.DialogTitle ) p0 ).getLayout ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/DialogTitle;->getLayout()Landroid/text/Layout;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 v1 = 			 (( android.text.Layout ) v0 ).getLineCount ( ); // invoke-virtual {v0}, Landroid/text/Layout;->getLineCount()I
			 /* if-lez v1, :cond_1 */
			 /* add-int/lit8 v1, v1, -0x1 */
			 v0 = 			 (( android.text.Layout ) v0 ).getEllipsisCount ( v1 ); // invoke-virtual {v0, v1}, Landroid/text/Layout;->getEllipsisCount(I)I
			 /* if-lez v0, :cond_1 */
			 int v0 = 0; // const/4 v0, 0x0
			 (( android.support.v7.widget.DialogTitle ) p0 ).setSingleLine ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/DialogTitle;->setSingleLine(Z)V
			 int v1 = 2; // const/4 v1, 0x2
			 (( android.support.v7.widget.DialogTitle ) p0 ).setMaxLines ( v1 ); // invoke-virtual {p0, v1}, Landroid/support/v7/widget/DialogTitle;->setMaxLines(I)V
			 (( android.support.v7.widget.DialogTitle ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/DialogTitle;->getContext()Landroid/content/Context;
			 int v2 = 0; // const/4 v2, 0x0
			 v3 = gc$j.TextAppearance;
			 /* const v4, 0x1010041 */
			 /* const v5, 0x1030044 */
			 (( android.content.Context ) v1 ).obtainStyledAttributes ( v2, v3, v4, v5 ); // invoke-virtual {v1, v2, v3, v4, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
			 v2 = 			 (( android.content.res.TypedArray ) v1 ).getDimensionPixelSize ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
			 if ( v2 != null) { // if-eqz v2, :cond_0
				 /* int-to-float v2, v2 */
				 (( android.support.v7.widget.DialogTitle ) p0 ).setTextSize ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Landroid/support/v7/widget/DialogTitle;->setTextSize(IF)V
			 } // :cond_0
			 (( android.content.res.TypedArray ) v1 ).recycle ( ); // invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V
			 /* invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V */
		 } // :cond_1
		 return;
	 } // .end method
	 public void setCustomSelectionActionModeCallback ( android.view.ActionMode$Callback p0 ) {
		 /* .locals 0 */
		 fn .a ( p0,p1 );
		 /* invoke-super {p0, p1}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V */
		 return;
	 } // .end method
