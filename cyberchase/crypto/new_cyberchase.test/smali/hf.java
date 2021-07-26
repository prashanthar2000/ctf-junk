public class hf {
	 /* # instance fields */
	 protected Integer a;
	 private final android.content.Context a;
	 protected android.view.View a;
	 android.widget.PopupWindow$OnDismissListener a;
	 private final gz a;
	 private he a;
	 private hg$a a;
	 private final Boolean a;
	 private final Integer b;
	 private final android.widget.PopupWindow$OnDismissListener b;
	 private Boolean b;
	 private final Integer c;
	 /* # direct methods */
	 public hf ( ) {
		 /* .locals 7 */
		 int v6 = 0; // const/4 v6, 0x0
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move-object v2, p2 */
		 /* move-object v3, p3 */
		 /* move v4, p4 */
		 /* move v5, p5 */
		 /* invoke-direct/range {v0 ..v6}, Lhf;-><init>(Landroid/content/Context;Lgz;Landroid/view/View;ZII)V */
		 return;
	 } // .end method
	 public hf ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const v0, 0x800003 */
		 /* iput v0, p0, Lhf;->a:I */
		 /* new-instance v0, Lhf$1; */
		 /* invoke-direct {v0, p0}, Lhf$1;-><init>(Lhf;)V */
		 this.b = v0;
		 this.a = p1;
		 this.a = p2;
		 this.a = p3;
		 /* iput-boolean p4, p0, Lhf;->a:Z */
		 /* iput p5, p0, Lhf;->b:I */
		 /* iput p6, p0, Lhf;->c:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final he a ( ) {
		 /* .locals 14 */
		 v0 = this.a;
		 /* if-nez v0, :cond_3 */
		 v0 = this.a;
		 final String v1 = "window"; // const-string v1, "window"
		 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/view/WindowManager; */
		 /* new-instance v1, Landroid/graphics/Point; */
		 /* invoke-direct {v1}, Landroid/graphics/Point;-><init>()V */
		 /* const/16 v3, 0x11 */
		 /* if-lt v2, v3, :cond_0 */
		 (( android.view.Display ) v0 ).getRealSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V
	 } // :cond_0
	 (( android.view.Display ) v0 ).getSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V
} // :goto_0
/* iget v0, v1, Landroid/graphics/Point;->x:I */
/* iget v1, v1, Landroid/graphics/Point;->y:I */
v0 = java.lang.Math .min ( v0,v1 );
v1 = this.a;
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
v1 = (( android.content.res.Resources ) v1 ).getDimensionPixelSize ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
/* if-lt v0, v1, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_2
/* new-instance v0, Lgw; */
v2 = this.a;
v3 = this.a;
/* iget v4, p0, Lhf;->b:I */
/* iget v5, p0, Lhf;->c:I */
/* iget-boolean v6, p0, Lhf;->a:Z */
/* move-object v1, v0 */
/* invoke-direct/range {v1 ..v6}, Lgw;-><init>(Landroid/content/Context;Landroid/view/View;IIZ)V */
} // :cond_2
/* new-instance v0, Lhl; */
v8 = this.a;
v9 = this.a;
v10 = this.a;
/* iget v11, p0, Lhf;->b:I */
/* iget v12, p0, Lhf;->c:I */
/* iget-boolean v13, p0, Lhf;->a:Z */
/* move-object v7, v0 */
/* invoke-direct/range {v7 ..v13}, Lhl;-><init>(Landroid/content/Context;Lgz;Landroid/view/View;IIZ)V */
} // :goto_2
v1 = this.a;
(( he ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lhe;->a(Lgz;)V
v1 = this.b;
(( he ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lhe;->a(Landroid/widget/PopupWindow$OnDismissListener;)V
v1 = this.a;
(( he ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lhe;->a(Landroid/view/View;)V
v1 = this.a;
(( he ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lhe;->a(Lhg$a;)V
/* iget-boolean v1, p0, Lhf;->b:Z */
(( he ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lhe;->a(Z)V
/* iget v1, p0, Lhf;->a:I */
(( he ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lhe;->a(I)V
this.a = v0;
} // :cond_3
v0 = this.a;
} // .end method
public final void a ( ) {
/* .locals 1 */
v0 = (( hf ) p0 ).b ( ); // invoke-virtual {p0}, Lhf;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( he ) v0 ).b ( ); // invoke-virtual {v0}, Lhe;->b()V
} // :cond_0
return;
} // .end method
final void a ( Integer p0, Integer p1, Boolean p2, Boolean p3 ) {
/* .locals 3 */
(( hf ) p0 ).a ( ); // invoke-virtual {p0}, Lhf;->a()Lhe;
(( he ) v0 ).c ( p4 ); // invoke-virtual {v0, p4}, Lhe;->c(Z)V
if ( p3 != null) { // if-eqz p3, :cond_1
/* iget p3, p0, Lhf;->a:I */
p4 = this.a;
p4 = em .b ( p4 );
p3 = dz .a ( p3,p4 );
/* and-int/lit8 p3, p3, 0x7 */
int p4 = 5; // const/4 p4, 0x5
/* if-ne p3, p4, :cond_0 */
p3 = this.a;
p3 = (( android.view.View ) p3 ).getWidth ( ); // invoke-virtual {p3}, Landroid/view/View;->getWidth()I
/* sub-int/2addr p1, p3 */
} // :cond_0
(( he ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lhe;->b(I)V
(( he ) v0 ).c ( p2 ); // invoke-virtual {v0, p2}, Lhe;->c(I)V
p3 = this.a;
(( android.content.Context ) p3 ).getResources ( ); // invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) p3 ).getDisplayMetrics ( ); // invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget p3, p3, Landroid/util/DisplayMetrics;->density:F */
/* const/high16 p4, 0x42400000 # 48.0f */
/* mul-float p3, p3, p4 */
/* const/high16 p4, 0x40000000 # 2.0f */
/* div-float/2addr p3, p4 */
/* float-to-int p3, p3 */
/* new-instance p4, Landroid/graphics/Rect; */
/* sub-int v1, p1, p3 */
/* sub-int v2, p2, p3 */
/* add-int/2addr p1, p3 */
/* add-int/2addr p2, p3 */
/* invoke-direct {p4, v1, v2, p1, p2}, Landroid/graphics/Rect;-><init>(IIII)V */
this.a = p4;
} // :cond_1
(( he ) v0 ).a ( ); // invoke-virtual {v0}, Lhe;->a()V
return;
} // .end method
public final void a ( hg$a p0 ) {
/* .locals 1 */
this.a = p1;
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( he ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lhe;->a(Lhg$a;)V
} // :cond_0
return;
} // .end method
public final void a ( Boolean p0 ) {
/* .locals 1 */
/* iput-boolean p1, p0, Lhf;->b:Z */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( he ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lhe;->a(Z)V
} // :cond_0
return;
} // .end method
public final Boolean a ( ) {
/* .locals 3 */
v0 = (( hf ) p0 ).b ( ); // invoke-virtual {p0}, Lhf;->b()Z
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
v0 = this.a;
int v2 = 0; // const/4 v2, 0x0
/* if-nez v0, :cond_1 */
} // :cond_1
(( hf ) p0 ).a ( v2, v2, v2, v2 ); // invoke-virtual {p0, v2, v2, v2, v2}, Lhf;->a(IIZZ)V
} // .end method
protected void b ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
return;
} // .end method
public final Boolean b ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( he ) v0 ).b ( ); // invoke-virtual {v0}, Lhe;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
