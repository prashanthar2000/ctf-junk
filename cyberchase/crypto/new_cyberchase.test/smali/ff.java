public abstract class ff extends android.widget.BaseAdapter implements android.widget.Filterable implements fg$a {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lff$b;, */
	 /* Lff$a; */
	 /* } */
} // .end annotation
/* # instance fields */
protected Integer a;
protected android.content.Context a;
protected android.database.Cursor a;
protected android.database.DataSetObserver a;
protected android.widget.FilterQueryProvider a;
protected ff$a a;
protected fg a;
protected Boolean a;
protected Boolean b;
/* # direct methods */
public ff ( ) {
	 /* .locals 1 */
	 /* invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V */
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput-boolean v0, p0, Lff;->b:Z */
	 int v0 = 0; // const/4 v0, 0x0
	 this.a = v0;
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput-boolean v0, p0, Lff;->a:Z */
	 this.a = p1;
	 int p1 = -1; // const/4 p1, -0x1
	 /* iput p1, p0, Lff;->a:I */
	 /* new-instance p1, Lff$a; */
	 /* invoke-direct {p1, p0}, Lff$a;-><init>(Lff;)V */
	 this.a = p1;
	 /* new-instance p1, Lff$b; */
	 /* invoke-direct {p1, p0}, Lff$b;-><init>(Lff;)V */
	 this.a = p1;
	 return;
} // .end method
/* # virtual methods */
public final android.database.Cursor a ( ) {
	 /* .locals 1 */
	 v0 = this.a;
} // .end method
public android.database.Cursor a ( java.lang.CharSequence p0 ) {
	 /* .locals 1 */
	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_0
	 } // :cond_0
	 p1 = this.a;
} // .end method
public abstract android.view.View a ( android.content.Context p0, android.database.Cursor p1, android.view.ViewGroup p2 ) {
} // .end method
public java.lang.CharSequence a ( android.database.Cursor p0 ) {
	 /* .locals 0 */
	 /* if-nez p1, :cond_0 */
	 final String p1 = ""; // const-string p1, ""
} // :cond_0
(( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
} // .end method
protected final void a ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lff;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.a;
		 v0 = 	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* if-nez v0, :cond_0 */
		 v0 = 		 v0 = this.a;
		 /* iput-boolean v0, p0, Lff;->a:Z */
	 } // :cond_0
	 return;
} // .end method
public void a ( android.database.Cursor p0 ) {
	 /* .locals 2 */
	 v0 = this.a;
	 /* if-ne p1, v0, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_2
	 v1 = this.a;
	 if ( v1 != null) { // if-eqz v1, :cond_1
	 } // :cond_1
	 v1 = this.a;
	 if ( v1 != null) { // if-eqz v1, :cond_2
	 } // :cond_2
	 this.a = p1;
	 if ( p1 != null) { // if-eqz p1, :cond_5
		 v1 = this.a;
		 if ( v1 != null) { // if-eqz v1, :cond_3
		 } // :cond_3
		 v1 = this.a;
		 if ( v1 != null) { // if-eqz v1, :cond_4
		 } // :cond_4
		 p1 = 		 final String v1 = "_id"; // const-string v1, "_id"
		 /* iput p1, p0, Lff;->a:I */
		 int p1 = 1; // const/4 p1, 0x1
		 /* iput-boolean p1, p0, Lff;->a:Z */
		 (( ff ) p0 ).notifyDataSetChanged ( ); // invoke-virtual {p0}, Lff;->notifyDataSetChanged()V
	 } // :cond_5
	 int p1 = -1; // const/4 p1, -0x1
	 /* iput p1, p0, Lff;->a:I */
	 int p1 = 0; // const/4 p1, 0x0
	 /* iput-boolean p1, p0, Lff;->a:Z */
	 (( ff ) p0 ).notifyDataSetInvalidated ( ); // invoke-virtual {p0}, Lff;->notifyDataSetInvalidated()V
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_6
} // :cond_6
return;
} // .end method
public abstract void a ( android.view.View p0, android.database.Cursor p1 ) {
} // .end method
public android.view.View b ( android.content.Context p0, android.database.Cursor p1, android.view.ViewGroup p2 ) {
/* .locals 0 */
(( ff ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lff;->a(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
} // .end method
public Integer getCount ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lff;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.a;
		 v0 = 	 if ( v0 != null) { // if-eqz v0, :cond_0
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public android.view.View getDropDownView ( Integer p0, android.view.View p1, android.view.ViewGroup p2 ) {
	 /* .locals 1 */
	 /* iget-boolean v0, p0, Lff;->a:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 v0 = this.a;
		 /* if-nez p2, :cond_0 */
		 p1 = this.a;
		 p2 = this.a;
		 (( ff ) p0 ).b ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lff;->b(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
	 } // :cond_0
	 p1 = this.a;
	 (( ff ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Lff;->a(Landroid/view/View;Landroid/database/Cursor;)V
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public android.widget.Filter getFilter ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lfg; */
/* invoke-direct {v0, p0}, Lfg;-><init>(Lfg$a;)V */
this.a = v0;
} // :cond_0
v0 = this.a;
} // .end method
public java.lang.Object getItem ( Integer p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lff;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
	 p1 = this.a;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Long getItemId ( Integer p0 ) {
/* .locals 3 */
/* iget-boolean v0, p0, Lff;->a:Z */
/* const-wide/16 v1, 0x0 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.a;
		 p1 = 	 if ( v0 != null) { // if-eqz v0, :cond_0
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 p1 = this.a;
			 /* iget v0, p0, Lff;->a:I */
			 /* move-result-wide v0 */
			 /* return-wide v0 */
		 } // :cond_0
		 /* return-wide v1 */
	 } // .end method
	 public android.view.View getView ( Integer p0, android.view.View p1, android.view.ViewGroup p2 ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lff;->a:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 v0 = 			 v0 = this.a;
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* if-nez p2, :cond_0 */
				 p1 = this.a;
				 p2 = this.a;
				 (( ff ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lff;->a(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
			 } // :cond_0
			 p1 = this.a;
			 (( ff ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Lff;->a(Landroid/view/View;Landroid/database/Cursor;)V
		 } // :cond_1
		 /* new-instance p2, Ljava/lang/IllegalStateException; */
		 java.lang.String .valueOf ( p1 );
		 final String p3 = "couldn\'t move cursor to position "; // const-string p3, "couldn\'t move cursor to position "
		 (( java.lang.String ) p3 ).concat ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
		 /* invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
		 /* throw p2 */
	 } // :cond_2
	 /* new-instance p1, Ljava/lang/IllegalStateException; */
	 final String p2 = "this should only be called when the cursor is valid"; // const-string p2, "this should only be called when the cursor is valid"
	 /* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
	 /* throw p1 */
} // .end method
public Boolean hasStableIds ( ) {
	 /* .locals 1 */
	 int v0 = 1; // const/4 v0, 0x1
} // .end method
