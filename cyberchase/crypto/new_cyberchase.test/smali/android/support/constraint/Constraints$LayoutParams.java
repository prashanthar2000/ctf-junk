public class android.support.constraint.Constraints$LayoutParams extends android.support.constraint.ConstraintLayout$LayoutParams {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/support/constraint/Constraints; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "LayoutParams" */
} // .end annotation
/* # instance fields */
public Boolean j;
public Float l;
public Float m;
public Float n;
public Float o;
public Float p;
public Float q;
public Float r;
public Float s;
public Float t;
public Float u;
public Float v;
public Float w;
/* # direct methods */
public android.support.constraint.Constraints$LayoutParams ( ) {
/* .locals 2 */
/* invoke-direct {p0}, Landroid/support/constraint/ConstraintLayout$LayoutParams;-><init>()V */
/* const/high16 v0, 0x3f800000 # 1.0f */
/* iput v0, p0, Landroid/support/constraint/Constraints$LayoutParams;->l:F */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Landroid/support/constraint/Constraints$LayoutParams;->j:Z */
int v1 = 0; // const/4 v1, 0x0
/* iput v1, p0, Landroid/support/constraint/Constraints$LayoutParams;->m:F */
/* iput v1, p0, Landroid/support/constraint/Constraints$LayoutParams;->n:F */
/* iput v1, p0, Landroid/support/constraint/Constraints$LayoutParams;->o:F */
/* iput v1, p0, Landroid/support/constraint/Constraints$LayoutParams;->p:F */
/* iput v0, p0, Landroid/support/constraint/Constraints$LayoutParams;->q:F */
/* iput v0, p0, Landroid/support/constraint/Constraints$LayoutParams;->r:F */
/* iput v1, p0, Landroid/support/constraint/Constraints$LayoutParams;->s:F */
/* iput v1, p0, Landroid/support/constraint/Constraints$LayoutParams;->t:F */
/* iput v1, p0, Landroid/support/constraint/Constraints$LayoutParams;->u:F */
/* iput v1, p0, Landroid/support/constraint/Constraints$LayoutParams;->v:F */
/* iput v1, p0, Landroid/support/constraint/Constraints$LayoutParams;->w:F */
return;
} // .end method
public android.support.constraint.Constraints$LayoutParams ( ) {
/* .locals 3 */
/* invoke-direct {p0, p1, p2}, Landroid/support/constraint/ConstraintLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
/* const/high16 v0, 0x3f800000 # 1.0f */
/* iput v0, p0, Landroid/support/constraint/Constraints$LayoutParams;->l:F */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Landroid/support/constraint/Constraints$LayoutParams;->j:Z */
int v2 = 0; // const/4 v2, 0x0
/* iput v2, p0, Landroid/support/constraint/Constraints$LayoutParams;->m:F */
/* iput v2, p0, Landroid/support/constraint/Constraints$LayoutParams;->n:F */
/* iput v2, p0, Landroid/support/constraint/Constraints$LayoutParams;->o:F */
/* iput v2, p0, Landroid/support/constraint/Constraints$LayoutParams;->p:F */
/* iput v0, p0, Landroid/support/constraint/Constraints$LayoutParams;->q:F */
/* iput v0, p0, Landroid/support/constraint/Constraints$LayoutParams;->r:F */
/* iput v2, p0, Landroid/support/constraint/Constraints$LayoutParams;->s:F */
/* iput v2, p0, Landroid/support/constraint/Constraints$LayoutParams;->t:F */
/* iput v2, p0, Landroid/support/constraint/Constraints$LayoutParams;->u:F */
/* iput v2, p0, Landroid/support/constraint/Constraints$LayoutParams;->v:F */
/* iput v2, p0, Landroid/support/constraint/Constraints$LayoutParams;->w:F */
v0 = y$b.ConstraintSet;
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
p2 = (( android.content.res.TypedArray ) p1 ).getIndexCount ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I
} // :goto_0
/* if-ge v1, p2, :cond_c */
v0 = (( android.content.res.TypedArray ) p1 ).getIndex ( v1 ); // invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I
/* if-ne v0, v2, :cond_0 */
/* iget v2, p0, Landroid/support/constraint/Constraints$LayoutParams;->l:F */
v0 = (( android.content.res.TypedArray ) p1 ).getFloat ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F
/* iput v0, p0, Landroid/support/constraint/Constraints$LayoutParams;->l:F */
/* goto/16 :goto_2 */
} // :cond_0
/* if-ne v0, v2, :cond_1 */
/* iget v2, p0, Landroid/support/constraint/Constraints$LayoutParams;->m:F */
v0 = (( android.content.res.TypedArray ) p1 ).getFloat ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F
/* iput v0, p0, Landroid/support/constraint/Constraints$LayoutParams;->m:F */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Landroid/support/constraint/Constraints$LayoutParams;->j:Z */
/* goto/16 :goto_2 */
} // :cond_1
/* if-ne v0, v2, :cond_2 */
/* iget v2, p0, Landroid/support/constraint/Constraints$LayoutParams;->o:F */
v0 = (( android.content.res.TypedArray ) p1 ).getFloat ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F
/* iput v0, p0, Landroid/support/constraint/Constraints$LayoutParams;->o:F */
/* goto/16 :goto_2 */
} // :cond_2
/* if-ne v0, v2, :cond_3 */
/* iget v2, p0, Landroid/support/constraint/Constraints$LayoutParams;->p:F */
v0 = (( android.content.res.TypedArray ) p1 ).getFloat ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F
/* iput v0, p0, Landroid/support/constraint/Constraints$LayoutParams;->p:F */
} // :cond_3
/* if-ne v0, v2, :cond_4 */
/* iget v2, p0, Landroid/support/constraint/Constraints$LayoutParams;->n:F */
v0 = (( android.content.res.TypedArray ) p1 ).getFloat ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F
/* iput v0, p0, Landroid/support/constraint/Constraints$LayoutParams;->n:F */
} // :cond_4
/* if-ne v0, v2, :cond_5 */
/* iget v2, p0, Landroid/support/constraint/Constraints$LayoutParams;->q:F */
v0 = (( android.content.res.TypedArray ) p1 ).getFloat ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F
/* iput v0, p0, Landroid/support/constraint/Constraints$LayoutParams;->q:F */
} // :cond_5
/* if-ne v0, v2, :cond_6 */
/* iget v2, p0, Landroid/support/constraint/Constraints$LayoutParams;->r:F */
v0 = (( android.content.res.TypedArray ) p1 ).getFloat ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F
/* iput v0, p0, Landroid/support/constraint/Constraints$LayoutParams;->r:F */
} // :cond_6
/* if-ne v0, v2, :cond_7 */
/* iget v2, p0, Landroid/support/constraint/Constraints$LayoutParams;->s:F */
v0 = (( android.content.res.TypedArray ) p1 ).getFloat ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F
/* iput v0, p0, Landroid/support/constraint/Constraints$LayoutParams;->s:F */
} // :cond_7
/* if-ne v0, v2, :cond_8 */
/* iget v2, p0, Landroid/support/constraint/Constraints$LayoutParams;->t:F */
v0 = (( android.content.res.TypedArray ) p1 ).getFloat ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F
/* iput v0, p0, Landroid/support/constraint/Constraints$LayoutParams;->t:F */
} // :cond_8
/* if-ne v0, v2, :cond_9 */
/* iget v2, p0, Landroid/support/constraint/Constraints$LayoutParams;->u:F */
} // :goto_1
v0 = (( android.content.res.TypedArray ) p1 ).getFloat ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F
/* iput v0, p0, Landroid/support/constraint/Constraints$LayoutParams;->u:F */
} // :cond_9
/* if-ne v0, v2, :cond_a */
/* iget v2, p0, Landroid/support/constraint/Constraints$LayoutParams;->v:F */
v0 = (( android.content.res.TypedArray ) p1 ).getFloat ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F
/* iput v0, p0, Landroid/support/constraint/Constraints$LayoutParams;->v:F */
} // :cond_a
/* if-ne v0, v2, :cond_b */
/* iget v2, p0, Landroid/support/constraint/Constraints$LayoutParams;->w:F */
} // :cond_b
} // :goto_2
/* add-int/lit8 v1, v1, 0x1 */
/* goto/16 :goto_0 */
} // :cond_c
return;
} // .end method
