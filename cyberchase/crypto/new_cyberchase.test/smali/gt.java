public abstract class gt implements hg {
	 /* # interfaces */
	 /* # instance fields */
	 public Integer a;
	 protected android.content.Context a;
	 protected android.view.LayoutInflater a;
	 public gz a;
	 public hg$a a;
	 public hh a;
	 private Integer b;
	 protected android.content.Context b;
	 protected android.view.LayoutInflater b;
	 private Integer c;
	 /* # direct methods */
	 public gt ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.a = p1;
		 android.view.LayoutInflater .from ( p1 );
		 this.a = p1;
		 /* iput p2, p0, Lgt;->b:I */
		 /* iput p3, p0, Lgt;->c:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.view.View a ( hb p0, android.view.View p1, android.view.ViewGroup p2 ) {
		 /* .locals 2 */
		 /* instance-of v0, p2, Lhh$a; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 } // :cond_0
		 p2 = this.a;
		 /* iget v0, p0, Lgt;->c:I */
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.view.LayoutInflater ) p2 ).inflate ( v0, p3, v1 ); // invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
	 } // :goto_0
	 /* check-cast p2, Lhh$a; */
	 (( gt ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lgt;->a(Lhb;Lhh$a;)V
	 /* check-cast p2, Landroid/view/View; */
} // .end method
public hh a ( android.view.ViewGroup p0 ) {
	 /* .locals 3 */
	 v0 = this.a;
	 /* if-nez v0, :cond_0 */
	 v0 = this.a;
	 /* iget v1, p0, Lgt;->b:I */
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.view.LayoutInflater ) v0 ).inflate ( v1, p1, v2 ); // invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
	 /* check-cast p1, Lhh; */
	 this.a = p1;
	 p1 = this.a;
	 v0 = this.a;
	 int p1 = 1; // const/4 p1, 0x1
	 (( gt ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lgt;->b(Z)V
} // :cond_0
p1 = this.a;
} // .end method
public void a ( android.content.Context p0, gz p1 ) {
/* .locals 0 */
this.b = p1;
p1 = this.b;
android.view.LayoutInflater .from ( p1 );
this.b = p1;
this.a = p2;
return;
} // .end method
public void a ( gz p0, Boolean p1 ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
return;
} // .end method
public abstract void a ( hb p0, hh$a p1 ) {
} // .end method
public final void a ( hg$a p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
public Boolean a ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
protected Boolean a ( android.view.ViewGroup p0, Integer p1 ) {
/* .locals 0 */
(( android.view.ViewGroup ) p1 ).removeViewAt ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->removeViewAt(I)V
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean a ( hb p0 ) {
/* .locals 0 */
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean a ( hm p0 ) {
/* .locals 1 */
v0 = this.a;
	 p1 = if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void b ( Boolean p0 ) {
/* .locals 9 */
p1 = this.a;
/* check-cast p1, Landroid/view/ViewGroup; */
/* if-nez p1, :cond_0 */
return;
} // :cond_0
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_7
(( gz ) v0 ).e ( ); // invoke-virtual {v0}, Lgz;->e()V
v0 = this.a;
(( gz ) v0 ).a ( ); // invoke-virtual {v0}, Lgz;->a()Ljava/util/ArrayList;
v2 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v3, v2, :cond_6 */
(( java.util.ArrayList ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v5, Lhb; */
v6 = (( gt ) p0 ).a ( v5 ); // invoke-virtual {p0, v5}, Lgt;->a(Lhb;)Z
if ( v6 != null) { // if-eqz v6, :cond_5
(( android.view.ViewGroup ) p1 ).getChildAt ( v4 ); // invoke-virtual {p1, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* instance-of v7, v6, Lhh$a; */
if ( v7 != null) { // if-eqz v7, :cond_1
	 /* move-object v7, v6 */
	 /* check-cast v7, Lhh$a; */
} // :cond_1
int v7 = 0; // const/4 v7, 0x0
} // :goto_1
(( gt ) p0 ).a ( v5, v6, p1 ); // invoke-virtual {p0, v5, v6, p1}, Lgt;->a(Lhb;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
/* if-eq v5, v7, :cond_2 */
(( android.view.View ) v8 ).setPressed ( v1 ); // invoke-virtual {v8, v1}, Landroid/view/View;->setPressed(Z)V
(( android.view.View ) v8 ).jumpDrawablesToCurrentState ( ); // invoke-virtual {v8}, Landroid/view/View;->jumpDrawablesToCurrentState()V
} // :cond_2
/* if-eq v8, v6, :cond_4 */
(( android.view.View ) v8 ).getParent ( ); // invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* check-cast v5, Landroid/view/ViewGroup; */
if ( v5 != null) { // if-eqz v5, :cond_3
(( android.view.ViewGroup ) v5 ).removeView ( v8 ); // invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
} // :cond_3
v5 = this.a;
/* check-cast v5, Landroid/view/ViewGroup; */
(( android.view.ViewGroup ) v5 ).addView ( v8, v4 ); // invoke-virtual {v5, v8, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V
} // :cond_4
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_5
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_6
/* move v1, v4 */
} // :cond_7
} // :goto_2
v0 = (( android.view.ViewGroup ) p1 ).getChildCount ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I
/* if-ge v1, v0, :cond_8 */
v0 = (( gt ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Lgt;->a(Landroid/view/ViewGroup;I)Z
/* if-nez v0, :cond_7 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_8
return;
} // .end method
public final Boolean b ( hb p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final Boolean c ( hb p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
