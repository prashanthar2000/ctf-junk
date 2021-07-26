public class android.support.constraint.Barrier extends android.support.constraint.ConstraintHelper {
	 /* # instance fields */
	 private ai a;
	 private Integer b;
	 private Integer c;
	 /* # direct methods */
	 public android.support.constraint.Barrier ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Landroid/support/constraint/ConstraintHelper;-><init>(Landroid/content/Context;)V */
		 /* const/16 p1, 0x8 */
		 /* invoke-super {p0, p1}, Landroid/support/constraint/ConstraintHelper;->setVisibility(I)V */
		 return;
	 } // .end method
	 public android.support.constraint.Barrier ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Landroid/support/constraint/ConstraintHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* const/16 p1, 0x8 */
		 /* invoke-super {p0, p1}, Landroid/support/constraint/ConstraintHelper;->setVisibility(I)V */
		 return;
	 } // .end method
	 public android.support.constraint.Barrier ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/support/constraint/ConstraintHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* const/16 p1, 0x8 */
		 /* invoke-super {p0, p1}, Landroid/support/constraint/ConstraintHelper;->setVisibility(I)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected final void a ( android.util.AttributeSet p0 ) {
		 /* .locals 6 */
		 /* invoke-super {p0, p1}, Landroid/support/constraint/ConstraintHelper;->a(Landroid/util/AttributeSet;)V */
		 /* new-instance v0, Lai; */
		 /* invoke-direct {v0}, Lai;-><init>()V */
		 this.a = v0;
		 if ( p1 != null) { // if-eqz p1, :cond_2
			 (( android.support.constraint.Barrier ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/constraint/Barrier;->getContext()Landroid/content/Context;
			 v1 = y$b.ConstraintLayout_Layout;
			 (( android.content.Context ) v0 ).obtainStyledAttributes ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
			 v0 = 			 (( android.content.res.TypedArray ) p1 ).getIndexCount ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I
			 int v1 = 0; // const/4 v1, 0x0
			 int v2 = 0; // const/4 v2, 0x0
		 } // :goto_0
		 /* if-ge v2, v0, :cond_2 */
		 v3 = 		 (( android.content.res.TypedArray ) p1 ).getIndex ( v2 ); // invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I
		 /* if-ne v3, v4, :cond_0 */
		 v3 = 		 (( android.content.res.TypedArray ) p1 ).getInt ( v3, v1 ); // invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I
		 (( android.support.constraint.Barrier ) p0 ).setType ( v3 ); // invoke-virtual {p0, v3}, Landroid/support/constraint/Barrier;->setType(I)V
	 } // :cond_0
	 /* if-ne v3, v4, :cond_1 */
	 v4 = this.a;
	 int v5 = 1; // const/4 v5, 0x1
	 v3 = 	 (( android.content.res.TypedArray ) p1 ).getBoolean ( v3, v5 ); // invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
	 /* iput-boolean v3, v4, Lai;->a:Z */
} // :cond_1
} // :goto_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
p1 = this.a;
this.a = p1;
(( android.support.constraint.Barrier ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/constraint/Barrier;->a()V
return;
} // .end method
public Integer getType ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/constraint/Barrier;->b:I */
} // .end method
public void setAllowsGoneWidget ( Boolean p0 ) {
/* .locals 1 */
v0 = this.a;
/* iput-boolean p1, v0, Lai;->a:Z */
return;
} // .end method
public void setType ( Integer p0 ) {
/* .locals 5 */
/* iput p1, p0, Landroid/support/constraint/Barrier;->b:I */
/* iput p1, p0, Landroid/support/constraint/Barrier;->c:I */
int v0 = 6; // const/4 v0, 0x6
int v1 = 5; // const/4 v1, 0x5
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
/* const/16 v4, 0x11 */
/* if-ge p1, v4, :cond_1 */
/* iget p1, p0, Landroid/support/constraint/Barrier;->b:I */
/* if-ne p1, v1, :cond_0 */
} // :goto_0
/* iput v2, p0, Landroid/support/constraint/Barrier;->c:I */
} // :cond_0
/* if-ne p1, v0, :cond_6 */
} // :goto_1
/* iput v3, p0, Landroid/support/constraint/Barrier;->c:I */
} // :cond_1
(( android.support.constraint.Barrier ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/support/constraint/Barrier;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) p1 ).getConfiguration ( ); // invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
p1 = (( android.content.res.Configuration ) p1 ).getLayoutDirection ( ); // invoke-virtual {p1}, Landroid/content/res/Configuration;->getLayoutDirection()I
/* if-ne v3, p1, :cond_2 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
} // :goto_2
if ( p1 != null) { // if-eqz p1, :cond_4
/* iget p1, p0, Landroid/support/constraint/Barrier;->b:I */
/* if-ne p1, v1, :cond_3 */
} // :cond_3
/* if-ne p1, v0, :cond_6 */
} // :cond_4
/* iget p1, p0, Landroid/support/constraint/Barrier;->b:I */
/* if-ne p1, v1, :cond_5 */
} // :cond_5
/* if-ne p1, v0, :cond_6 */
} // :cond_6
} // :goto_3
p1 = this.a;
/* iget v0, p0, Landroid/support/constraint/Barrier;->c:I */
/* iput v0, p1, Lai;->a:I */
return;
} // .end method
