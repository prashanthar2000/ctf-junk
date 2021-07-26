public class android.support.v4.app.FragmentTabHost extends android.widget.TabHost implements android.widget.TabHost$OnTabChangeListener {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/v4/app/FragmentTabHost$a;, */
	 /* Landroid/support/v4/app/FragmentTabHost$b; */
	 /* } */
} // .end annotation
/* # instance fields */
private Integer a;
private android.content.Context a;
private android.support.v4.app.FragmentTabHost$b a;
private android.widget.FrameLayout a;
private android.widget.TabHost$OnTabChangeListener a;
private bp a;
private final java.util.ArrayList a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Landroid/support/v4/app/FragmentTabHost$b;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private Boolean a;
/* # direct methods */
public android.support.v4.app.FragmentTabHost ( ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, v0}, Landroid/widget/TabHost;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
this.a = v1;
/* invoke-direct {p0, p1, v0}, Landroid/support/v4/app/FragmentTabHost;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V */
return;
} // .end method
public android.support.v4.app.FragmentTabHost ( ) {
/* .locals 1 */
/* invoke-direct {p0, p1, p2}, Landroid/widget/TabHost;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.a = v0;
/* invoke-direct {p0, p1, p2}, Landroid/support/v4/app/FragmentTabHost;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V */
return;
} // .end method
private android.support.v4.app.FragmentTabHost$b a ( java.lang.String p0 ) {
/* .locals 4 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
v2 = this.a;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/support/v4/app/FragmentTabHost$b; */
v3 = this.a;
v3 = (( java.lang.String ) v3 ).equals ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
private bu a ( java.lang.String p0, bu p1 ) {
/* .locals 3 */
/* invoke-direct {p0, p1}, Landroid/support/v4/app/FragmentTabHost;->a(Ljava/lang/String;)Landroid/support/v4/app/FragmentTabHost$b; */
v0 = this.a;
/* if-eq v0, p1, :cond_4 */
/* if-nez p2, :cond_0 */
p2 = this.a;
(( bp ) p2 ).a ( ); // invoke-virtual {p2}, Lbp;->a()Lbu;
} // :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
v0 = this.a;
(( bu ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Lbu;->a(Lbl;)Lbu;
} // :cond_1
if ( p1 != null) { // if-eqz p1, :cond_3
v0 = this.a;
/* if-nez v0, :cond_2 */
v0 = this.a;
v1 = this.a;
(( java.lang.Class ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
v2 = this.a;
bl .a ( v0,v1,v2 );
this.a = v0;
/* iget v0, p0, Landroid/support/v4/app/FragmentTabHost;->a:I */
v1 = this.a;
v2 = this.a;
(( bu ) p2 ).a ( v0, v1, v2 ); // invoke-virtual {p2, v0, v1, v2}, Lbu;->a(ILbl;Ljava/lang/String;)Lbu;
} // :cond_2
v0 = this.a;
(( bu ) p2 ).b ( v0 ); // invoke-virtual {p2, v0}, Lbu;->b(Lbl;)Lbu;
} // :cond_3
} // :goto_0
this.a = p1;
} // :cond_4
} // .end method
private void a ( ) {
/* .locals 3 */
v0 = this.a;
/* if-nez v0, :cond_1 */
/* iget v0, p0, Landroid/support/v4/app/FragmentTabHost;->a:I */
(( android.support.v4.app.FragmentTabHost ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/app/FragmentTabHost;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/FrameLayout; */
this.a = v0;
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "No tab content FrameLayout found for id "; // const-string v2, "No tab content FrameLayout found for id "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v2, p0, Landroid/support/v4/app/FragmentTabHost;->a:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
} // :goto_0
return;
} // .end method
private void a ( android.content.Context p0 ) {
/* .locals 7 */
/* const v0, 0x1020013 */
(( android.support.v4.app.FragmentTabHost ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v4/app/FragmentTabHost;->findViewById(I)Landroid/view/View;
/* if-nez v1, :cond_0 */
/* new-instance v1, Landroid/widget/LinearLayout; */
/* invoke-direct {v1, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
int v2 = 1; // const/4 v2, 0x1
(( android.widget.LinearLayout ) v1 ).setOrientation ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V
/* new-instance v2, Landroid/widget/FrameLayout$LayoutParams; */
int v3 = -1; // const/4 v3, -0x1
/* invoke-direct {v2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V */
(( android.support.v4.app.FragmentTabHost ) p0 ).addView ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroid/support/v4/app/FragmentTabHost;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* new-instance v2, Landroid/widget/TabWidget; */
/* invoke-direct {v2, p1}, Landroid/widget/TabWidget;-><init>(Landroid/content/Context;)V */
(( android.widget.TabWidget ) v2 ).setId ( v0 ); // invoke-virtual {v2, v0}, Landroid/widget/TabWidget;->setId(I)V
int v0 = 0; // const/4 v0, 0x0
(( android.widget.TabWidget ) v2 ).setOrientation ( v0 ); // invoke-virtual {v2, v0}, Landroid/widget/TabWidget;->setOrientation(I)V
/* new-instance v4, Landroid/widget/LinearLayout$LayoutParams; */
int v5 = -2; // const/4 v5, -0x2
int v6 = 0; // const/4 v6, 0x0
/* invoke-direct {v4, v3, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V */
(( android.widget.LinearLayout ) v1 ).addView ( v2, v4 ); // invoke-virtual {v1, v2, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* new-instance v2, Landroid/widget/FrameLayout; */
/* invoke-direct {v2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
/* const v4, 0x1020011 */
(( android.widget.FrameLayout ) v2 ).setId ( v4 ); // invoke-virtual {v2, v4}, Landroid/widget/FrameLayout;->setId(I)V
/* new-instance v4, Landroid/widget/LinearLayout$LayoutParams; */
/* invoke-direct {v4, v0, v0, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V */
(( android.widget.LinearLayout ) v1 ).addView ( v2, v4 ); // invoke-virtual {v1, v2, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* new-instance v2, Landroid/widget/FrameLayout; */
/* invoke-direct {v2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
this.a = v2;
p1 = this.a;
/* iget v4, p0, Landroid/support/v4/app/FragmentTabHost;->a:I */
(( android.widget.FrameLayout ) p1 ).setId ( v4 ); // invoke-virtual {p1, v4}, Landroid/widget/FrameLayout;->setId(I)V
/* new-instance p1, Landroid/widget/LinearLayout$LayoutParams; */
/* const/high16 v4, 0x3f800000 # 1.0f */
/* invoke-direct {p1, v3, v0, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V */
(( android.widget.LinearLayout ) v1 ).addView ( v2, p1 ); // invoke-virtual {v1, v2, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
} // :cond_0
return;
} // .end method
private void a ( android.content.Context p0, android.util.AttributeSet p1 ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [I */
int v1 = 0; // const/4 v1, 0x0
/* const v2, 0x10100f3 */
/* aput v2, v0, v1 */
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0, v1, v1 ); // invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
p2 = (( android.content.res.TypedArray ) p1 ).getResourceId ( v1, v1 ); // invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I
/* iput p2, p0, Landroid/support/v4/app/FragmentTabHost;->a:I */
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
/* invoke-super {p0, p0}, Landroid/widget/TabHost;->setOnTabChangedListener(Landroid/widget/TabHost$OnTabChangeListener;)V */
return;
} // .end method
/* # virtual methods */
protected void onAttachedToWindow ( ) {
/* .locals 7 */
/* invoke-super {p0}, Landroid/widget/TabHost;->onAttachedToWindow()V */
(( android.support.v4.app.FragmentTabHost ) p0 ).getCurrentTabTag ( ); // invoke-virtual {p0}, Landroid/support/v4/app/FragmentTabHost;->getCurrentTabTag()Ljava/lang/String;
v1 = this.a;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v1, :cond_3 */
v4 = this.a;
(( java.util.ArrayList ) v4 ).get ( v3 ); // invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v4, Landroid/support/v4/app/FragmentTabHost$b; */
v5 = this.a;
v6 = this.a;
(( bp ) v5 ).a ( v6 ); // invoke-virtual {v5, v6}, Lbp;->a(Ljava/lang/String;)Lbl;
this.a = v5;
v5 = this.a;
if ( v5 != null) { // if-eqz v5, :cond_2
v5 = this.a;
/* iget-boolean v5, v5, Lbl;->h:Z */
/* if-nez v5, :cond_2 */
v5 = this.a;
v5 = (( java.lang.String ) v5 ).equals ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_0
this.a = v4;
} // :cond_0
/* if-nez v2, :cond_1 */
v2 = this.a;
(( bp ) v2 ).a ( ); // invoke-virtual {v2}, Lbp;->a()Lbu;
} // :cond_1
v4 = this.a;
(( bu ) v2 ).a ( v4 ); // invoke-virtual {v2, v4}, Lbu;->a(Lbl;)Lbu;
} // :cond_2
} // :goto_1
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_3
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Landroid/support/v4/app/FragmentTabHost;->a:Z */
/* invoke-direct {p0, v0, v2}, Landroid/support/v4/app/FragmentTabHost;->a(Ljava/lang/String;Lbu;)Lbu; */
if ( v0 != null) { // if-eqz v0, :cond_4
(( bu ) v0 ).a ( ); // invoke-virtual {v0}, Lbu;->a()I
v0 = this.a;
(( bp ) v0 ).a ( ); // invoke-virtual {v0}, Lbp;->a()Z
} // :cond_4
return;
} // .end method
protected void onDetachedFromWindow ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/widget/TabHost;->onDetachedFromWindow()V */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Landroid/support/v4/app/FragmentTabHost;->a:Z */
return;
} // .end method
protected void onRestoreInstanceState ( android.os.Parcelable p0 ) {
/* .locals 1 */
/* instance-of v0, p1, Landroid/support/v4/app/FragmentTabHost$a; */
/* if-nez v0, :cond_0 */
/* invoke-super {p0, p1}, Landroid/widget/TabHost;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
return;
} // :cond_0
/* check-cast p1, Landroid/support/v4/app/FragmentTabHost$a; */
(( android.support.v4.app.FragmentTabHost$a ) p1 ).getSuperState ( ); // invoke-virtual {p1}, Landroid/support/v4/app/FragmentTabHost$a;->getSuperState()Landroid/os/Parcelable;
/* invoke-super {p0, v0}, Landroid/widget/TabHost;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
p1 = this.a;
(( android.support.v4.app.FragmentTabHost ) p0 ).setCurrentTabByTag ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/app/FragmentTabHost;->setCurrentTabByTag(Ljava/lang/String;)V
return;
} // .end method
protected android.os.Parcelable onSaveInstanceState ( ) {
/* .locals 2 */
/* invoke-super {p0}, Landroid/widget/TabHost;->onSaveInstanceState()Landroid/os/Parcelable; */
/* new-instance v1, Landroid/support/v4/app/FragmentTabHost$a; */
/* invoke-direct {v1, v0}, Landroid/support/v4/app/FragmentTabHost$a;-><init>(Landroid/os/Parcelable;)V */
(( android.support.v4.app.FragmentTabHost ) p0 ).getCurrentTabTag ( ); // invoke-virtual {p0}, Landroid/support/v4/app/FragmentTabHost;->getCurrentTabTag()Ljava/lang/String;
this.a = v0;
} // .end method
public void onTabChanged ( java.lang.String p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Landroid/support/v4/app/FragmentTabHost;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, v0}, Landroid/support/v4/app/FragmentTabHost;->a(Ljava/lang/String;Lbu;)Lbu; */
if ( v0 != null) { // if-eqz v0, :cond_0
(( bu ) v0 ).a ( ); // invoke-virtual {v0}, Lbu;->a()I
} // :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_1
return;
} // .end method
public void setOnTabChangedListener ( android.widget.TabHost$OnTabChangeListener p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
public void setup ( ) {
/* .locals 2 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Must call setup() that takes a Context and FragmentManager"; // const-string v1, "Must call setup() that takes a Context and FragmentManager"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void setup ( android.content.Context p0, bp p1 ) {
/* .locals 0 */
/* invoke-direct {p0, p1}, Landroid/support/v4/app/FragmentTabHost;->a(Landroid/content/Context;)V */
/* invoke-super {p0}, Landroid/widget/TabHost;->setup()V */
this.a = p1;
this.a = p2;
/* invoke-direct {p0}, Landroid/support/v4/app/FragmentTabHost;->a()V */
return;
} // .end method
public void setup ( android.content.Context p0, bp p1, Integer p2 ) {
/* .locals 0 */
/* invoke-direct {p0, p1}, Landroid/support/v4/app/FragmentTabHost;->a(Landroid/content/Context;)V */
/* invoke-super {p0}, Landroid/widget/TabHost;->setup()V */
this.a = p1;
this.a = p2;
/* iput p3, p0, Landroid/support/v4/app/FragmentTabHost;->a:I */
/* invoke-direct {p0}, Landroid/support/v4/app/FragmentTabHost;->a()V */
p1 = this.a;
(( android.widget.FrameLayout ) p1 ).setId ( p3 ); // invoke-virtual {p1, p3}, Landroid/widget/FrameLayout;->setId(I)V
p1 = (( android.support.v4.app.FragmentTabHost ) p0 ).getId ( ); // invoke-virtual {p0}, Landroid/support/v4/app/FragmentTabHost;->getId()I
int p2 = -1; // const/4 p2, -0x1
/* if-ne p1, p2, :cond_0 */
/* const p1, 0x1020012 */
(( android.support.v4.app.FragmentTabHost ) p0 ).setId ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v4/app/FragmentTabHost;->setId(I)V
} // :cond_0
return;
} // .end method
