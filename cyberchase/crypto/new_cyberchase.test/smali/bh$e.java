abstract class bh$e extends bh$d {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lbh; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x408 */
/* name = "e" */
} // .end annotation
/* # instance fields */
java.lang.String a;
protected cp$b a;
Integer b;
/* # direct methods */
public bh$e ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0}, Lbh$d;-><init>(B)V */
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
return;
} // .end method
public bh$e ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0}, Lbh$d;-><init>(B)V */
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
v0 = this.a;
this.a = v0;
/* iget v0, p1, Lbh$e;->b:I */
/* iput v0, p0, Lbh$e;->b:I */
p1 = this.a;
cp .a ( p1 );
this.a = p1;
return;
} // .end method
/* # virtual methods */
public final void a ( android.graphics.Path p0 ) {
/* .locals 1 */
(( android.graphics.Path ) p1 ).reset ( ); // invoke-virtual {p1}, Landroid/graphics/Path;->reset()V
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
	 cp$b .a ( v0,p1 );
} // :cond_0
return;
} // .end method
public Boolean a ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public cp$b getPathData ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public java.lang.String getPathName ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public void setPathData ( cp$b[] p0 ) {
/* .locals 6 */
v0 = this.a;
v0 = cp .a ( v0,p1 );
/* if-nez v0, :cond_0 */
cp .a ( p1 );
this.a = p1;
return;
} // :cond_0
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* array-length v3, p1 */
/* if-ge v2, v3, :cond_2 */
/* aget-object v3, v0, v2 */
/* aget-object v4, p1, v2 */
/* iget-char v4, v4, Lcp$b;->a:C */
/* iput-char v4, v3, Lcp$b;->a:C */
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
/* aget-object v4, p1, v2 */
v4 = this.a;
/* array-length v4, v4 */
/* if-ge v3, v4, :cond_1 */
/* aget-object v4, v0, v2 */
v4 = this.a;
/* aget-object v5, p1, v2 */
v5 = this.a;
/* aget v5, v5, v3 */
/* aput v5, v4, v3 */
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
return;
} // .end method
