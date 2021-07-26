public abstract class android.support.constraint.ConstraintHelper extends android.view.View {
	 /* # instance fields */
	 protected Integer a;
	 protected android.content.Context a;
	 protected aq a;
	 private java.lang.String a;
	 protected Boolean a;
	 protected a;
	 /* # direct methods */
	 public android.support.constraint.ConstraintHelper ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V */
		 /* const/16 v0, 0x20 */
		 /* new-array v0, v0, [I */
		 this.a = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Landroid/support/constraint/ConstraintHelper;->a:Z */
		 this.a = p1;
		 int p1 = 0; // const/4 p1, 0x0
		 (( android.support.constraint.ConstraintHelper ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/constraint/ConstraintHelper;->a(Landroid/util/AttributeSet;)V
		 return;
	 } // .end method
	 public android.support.constraint.ConstraintHelper ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* const/16 v0, 0x20 */
		 /* new-array v0, v0, [I */
		 this.a = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Landroid/support/constraint/ConstraintHelper;->a:Z */
		 this.a = p1;
		 (( android.support.constraint.ConstraintHelper ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/constraint/ConstraintHelper;->a(Landroid/util/AttributeSet;)V
		 return;
	 } // .end method
	 public android.support.constraint.ConstraintHelper ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* const/16 p3, 0x20 */
		 /* new-array p3, p3, [I */
		 this.a = p3;
		 int p3 = 0; // const/4 p3, 0x0
		 /* iput-boolean p3, p0, Landroid/support/constraint/ConstraintHelper;->a:Z */
		 this.a = p1;
		 (( android.support.constraint.ConstraintHelper ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Landroid/support/constraint/ConstraintHelper;->a(Landroid/util/AttributeSet;)V
		 return;
	 } // .end method
	 private void a ( java.lang.String p0 ) {
		 /* .locals 4 */
		 /* if-nez p1, :cond_0 */
		 return;
	 } // :cond_0
	 v0 = this.a;
	 /* if-nez v0, :cond_1 */
	 return;
} // :cond_1
(( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
try { // :try_start_0
	 /* const-class v2, Ly$a; */
	 (( java.lang.Class ) v2 ).getField ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
	 v0 = 	 (( java.lang.reflect.Field ) v2 ).getInt ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* if-nez v0, :cond_2 */
	 v0 = this.a;
	 (( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
	 final String v2 = "id"; // const-string v2, "id"
	 v3 = this.a;
	 (( android.content.Context ) v3 ).getPackageName ( ); // invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
	 v0 = 	 (( android.content.res.Resources ) v0 ).getIdentifier ( p1, v2, v3 ); // invoke-virtual {v0, p1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
} // :cond_2
/* if-nez v0, :cond_3 */
v2 = (( android.support.constraint.ConstraintHelper ) p0 ).isInEditMode ( ); // invoke-virtual {p0}, Landroid/support/constraint/ConstraintHelper;->isInEditMode()Z
if ( v2 != null) { // if-eqz v2, :cond_3
	 (( android.support.constraint.ConstraintHelper ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/support/constraint/ConstraintHelper;->getParent()Landroid/view/ViewParent;
	 /* instance-of v2, v2, Landroid/support/constraint/ConstraintLayout; */
	 if ( v2 != null) { // if-eqz v2, :cond_3
		 (( android.support.constraint.ConstraintHelper ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/support/constraint/ConstraintHelper;->getParent()Landroid/view/ViewParent;
		 /* check-cast v2, Landroid/support/constraint/ConstraintLayout; */
		 (( android.support.constraint.ConstraintLayout ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Landroid/support/constraint/ConstraintLayout;->a(Ljava/lang/Object;)Ljava/lang/Object;
		 if ( v2 != null) { // if-eqz v2, :cond_3
			 /* instance-of v3, v2, Ljava/lang/Integer; */
			 if ( v3 != null) { // if-eqz v3, :cond_3
				 /* check-cast v2, Ljava/lang/Integer; */
				 v0 = 				 (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
			 } // :cond_3
			 if ( v0 != null) { // if-eqz v0, :cond_4
				 (( android.support.constraint.ConstraintHelper ) p0 ).setTag ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/support/constraint/ConstraintHelper;->setTag(ILjava/lang/Object;)V
				 return;
			 } // :cond_4
			 final String v0 = "ConstraintHelper"; // const-string v0, "ConstraintHelper"
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 final String v2 = "Could not find id of \""; // const-string v2, "Could not find id of \""
			 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String p1 = "\""; // const-string p1, "\""
			 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 android.util.Log .w ( v0,p1 );
			 return;
		 } // .end method
		 private void setIds ( java.lang.String p0 ) {
			 /* .locals 3 */
			 /* if-nez p1, :cond_0 */
			 return;
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
	 /* const/16 v1, 0x2c */
	 v1 = 	 (( java.lang.String ) p1 ).indexOf ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Ljava/lang/String;->indexOf(II)I
	 int v2 = -1; // const/4 v2, -0x1
	 /* if-ne v1, v2, :cond_1 */
	 (( java.lang.String ) p1 ).substring ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
	 /* invoke-direct {p0, p1}, Landroid/support/constraint/ConstraintHelper;->a(Ljava/lang/String;)V */
	 return;
} // :cond_1
(( java.lang.String ) p1 ).substring ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* invoke-direct {p0, v0}, Landroid/support/constraint/ConstraintHelper;->a(Ljava/lang/String;)V */
/* add-int/lit8 v0, v1, 0x1 */
} // .end method
/* # virtual methods */
public final void a ( ) {
/* .locals 2 */
v0 = this.a;
/* if-nez v0, :cond_0 */
return;
} // :cond_0
(( android.support.constraint.ConstraintHelper ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/support/constraint/ConstraintHelper;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* instance-of v1, v0, Landroid/support/constraint/ConstraintLayout$LayoutParams; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v0, Landroid/support/constraint/ConstraintLayout$LayoutParams; */
v1 = this.a;
this.a = v1;
} // :cond_1
return;
} // .end method
public void a ( android.support.constraint.ConstraintLayout p0 ) {
/* .locals 3 */
v0 = (( android.support.constraint.ConstraintHelper ) p0 ).isInEditMode ( ); // invoke-virtual {p0}, Landroid/support/constraint/ConstraintHelper;->isInEditMode()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
/* invoke-direct {p0, v0}, Landroid/support/constraint/ConstraintHelper;->setIds(Ljava/lang/String;)V */
} // :cond_0
v0 = this.a;
/* if-nez v0, :cond_1 */
return;
} // :cond_1
(( aq ) v0 ).h ( ); // invoke-virtual {v0}, Laq;->h()V
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* iget v1, p0, Landroid/support/constraint/ConstraintHelper;->a:I */
/* if-ge v0, v1, :cond_3 */
v1 = this.a;
/* aget v1, v1, v0 */
(( android.support.constraint.ConstraintLayout ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Landroid/support/constraint/ConstraintLayout;->a(I)Landroid/view/View;
if ( v1 != null) { // if-eqz v1, :cond_2
v2 = this.a;
(( android.support.constraint.ConstraintLayout ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Landroid/support/constraint/ConstraintLayout;->a(Landroid/view/View;)Lam;
(( aq ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Laq;->a(Lam;)V
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_3
return;
} // .end method
protected void a ( android.util.AttributeSet p0 ) {
/* .locals 4 */
if ( p1 != null) { // if-eqz p1, :cond_1
(( android.support.constraint.ConstraintHelper ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/constraint/ConstraintHelper;->getContext()Landroid/content/Context;
v1 = y$b.ConstraintLayout_Layout;
(( android.content.Context ) v0 ).obtainStyledAttributes ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
v0 = (( android.content.res.TypedArray ) p1 ).getIndexCount ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
v2 = (( android.content.res.TypedArray ) p1 ).getIndex ( v1 ); // invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I
/* if-ne v2, v3, :cond_0 */
(( android.content.res.TypedArray ) p1 ).getString ( v2 ); // invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
this.a = v2;
v2 = this.a;
/* invoke-direct {p0, v2}, Landroid/support/constraint/ConstraintHelper;->setIds(Ljava/lang/String;)V */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
return;
} // .end method
public void b ( ) {
/* .locals 0 */
return;
} // .end method
public getReferencedIds ( ) {
/* .locals 2 */
v0 = this.a;
/* iget v1, p0, Landroid/support/constraint/ConstraintHelper;->a:I */
java.util.Arrays .copyOf ( v0,v1 );
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 0 */
return;
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Landroid/support/constraint/ConstraintHelper;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V */
return;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
(( android.support.constraint.ConstraintHelper ) p0 ).setMeasuredDimension ( p1, p1 ); // invoke-virtual {p0, p1, p1}, Landroid/support/constraint/ConstraintHelper;->setMeasuredDimension(II)V
return;
} // .end method
public void setReferencedIds ( Integer[] p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Landroid/support/constraint/ConstraintHelper;->a:I */
} // :goto_0
/* array-length v1, p1 */
/* if-ge v0, v1, :cond_0 */
/* aget v1, p1, v0 */
int v2 = 0; // const/4 v2, 0x0
(( android.support.constraint.ConstraintHelper ) p0 ).setTag ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroid/support/constraint/ConstraintHelper;->setTag(ILjava/lang/Object;)V
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
public void setTag ( Integer p0, java.lang.Object p1 ) {
/* .locals 2 */
/* iget p2, p0, Landroid/support/constraint/ConstraintHelper;->a:I */
/* add-int/lit8 p2, p2, 0x1 */
v0 = this.a;
/* array-length v1, v0 */
/* if-le p2, v1, :cond_0 */
/* array-length p2, v0 */
/* mul-int/lit8 p2, p2, 0x2 */
java.util.Arrays .copyOf ( v0,p2 );
this.a = p2;
} // :cond_0
p2 = this.a;
/* iget v0, p0, Landroid/support/constraint/ConstraintHelper;->a:I */
/* aput p1, p2, v0 */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Landroid/support/constraint/ConstraintHelper;->a:I */
return;
} // .end method
