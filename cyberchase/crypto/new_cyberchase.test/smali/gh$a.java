class gh$a extends gf$b {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lgh; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = "a" */
} // .end annotation
/* # instance fields */
I a;
/* # direct methods */
 gh$a ( ) {
/* .locals 0 */
/* invoke-direct {p0, p1, p2, p3}, Lgf$b;-><init>(Lgf$b;Lgf;Landroid/content/res/Resources;)V */
if ( p1 != null) { // if-eqz p1, :cond_0
	 p1 = this.a;
} // :goto_0
this.a = p1;
return;
} // :cond_0
p1 = this.a;
/* array-length p1, p1 */
/* new-array p1, p1, [[I */
} // .end method
/* # virtual methods */
void a ( ) {
/* .locals 4 */
v0 = this.a;
/* array-length v1, v0 */
/* new-array v1, v1, [[I */
/* array-length v0, v0 */
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_1 */
v2 = this.a;
/* aget-object v3, v2, v0 */
if ( v3 != null) { // if-eqz v3, :cond_0
/* aget-object v2, v2, v0 */
(( ) v2 ).clone ( ); // invoke-virtual {v2}, [I->clone()Ljava/lang/Object;
/* check-cast v2, [I */
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_1
/* aput-object v2, v1, v0 */
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_1
this.a = v1;
return;
} // .end method
public final void a ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* invoke-super {p0, p1, p2}, Lgf$b;->a(II)V */
/* new-array p2, p2, [[I */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
java.lang.System .arraycopy ( v0,v1,p2,v1,p1 );
this.a = p2;
return;
} // .end method
final Integer b ( Integer[] p0 ) {
/* .locals 4 */
v0 = this.a;
/* iget v1, p0, Lgf$b;->d:I */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_1 */
/* aget-object v3, v0, v2 */
v3 = android.util.StateSet .stateSetMatches ( v3,p1 );
if ( v3 != null) { // if-eqz v3, :cond_0
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
int p1 = -1; // const/4 p1, -0x1
} // .end method
public android.graphics.drawable.Drawable newDrawable ( ) {
/* .locals 2 */
/* new-instance v0, Lgh; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lgh;-><init>(Lgh$a;Landroid/content/res/Resources;)V */
} // .end method
public android.graphics.drawable.Drawable newDrawable ( android.content.res.Resources p0 ) {
/* .locals 1 */
/* new-instance v0, Lgh; */
/* invoke-direct {v0, p0, p1}, Lgh;-><init>(Lgh$a;Landroid/content/res/Resources;)V */
} // .end method
