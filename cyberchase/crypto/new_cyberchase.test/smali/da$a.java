public abstract class da$a extends android.graphics.drawable.Drawable$ConstantState {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lda; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x409 */
/* name = "a" */
} // .end annotation
/* # instance fields */
Integer a;
android.content.res.ColorStateList a;
android.graphics.PorterDuff$Mode a;
android.graphics.drawable.Drawable$ConstantState a;
/* # direct methods */
 da$a ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
v0 = da.a;
this.a = v0;
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* iget v0, p1, Lda$a;->a:I */
	 /* iput v0, p0, Lda$a;->a:I */
	 v0 = this.a;
	 this.a = v0;
	 v0 = this.a;
	 this.a = v0;
	 p1 = this.a;
	 this.a = p1;
} // :cond_0
return;
} // .end method
/* # virtual methods */
public Integer getChangingConfigurations ( ) {
/* .locals 2 */
/* iget v0, p0, Lda$a;->a:I */
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_0
	 v1 = 	 (( android.graphics.drawable.Drawable$ConstantState ) v1 ).getChangingConfigurations ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable$ConstantState;->getChangingConfigurations()I
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* or-int/2addr v0, v1 */
} // .end method
public android.graphics.drawable.Drawable newDrawable ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
(( da$a ) p0 ).newDrawable ( v0 ); // invoke-virtual {p0, v0}, Lda$a;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
} // .end method
public abstract android.graphics.drawable.Drawable newDrawable ( android.content.res.Resources p0 ) {
} // .end method
