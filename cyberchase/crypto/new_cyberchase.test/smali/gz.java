public class gz implements dc {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lgz$b;, */
	 /* Lgz$a; */
	 /* } */
} // .end annotation
/* # static fields */
private static final a;
/* # instance fields */
public Integer a;
public final android.content.Context a;
private final android.content.res.Resources a;
android.graphics.drawable.Drawable a;
private android.view.ContextMenu$ContextMenuInfo a;
android.view.View a;
public gz$a a;
hb a;
java.lang.CharSequence a;
java.util.ArrayList a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Lhb;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private java.util.concurrent.CopyOnWriteArrayList a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/concurrent/CopyOnWriteArrayList<", */
/* "Ljava/lang/ref/WeakReference<", */
/* "Lhg;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
public Boolean a;
public java.util.ArrayList b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Lhb;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public Boolean b;
private java.util.ArrayList c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Lhb;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private Boolean c;
private java.util.ArrayList d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Lhb;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private Boolean d;
private java.util.ArrayList e;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Lhb;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private Boolean e;
private Boolean f;
private Boolean g;
private Boolean h;
private Boolean i;
private Boolean j;
private Boolean k;
/* # direct methods */
static gz ( ) {
/* .locals 1 */
int v0 = 6; // const/4 v0, 0x6
/* new-array v0, v0, [I */
/* fill-array-data v0, :array_0 */
return;
/* nop */
/* :array_0 */
/* .array-data 4 */
/* 0x1 */
/* 0x4 */
/* 0x5 */
/* 0x3 */
/* 0x2 */
/* 0x0 */
} // .end array-data
} // .end method
public gz ( ) {
/* .locals 3 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lgz;->a:I */
/* iput-boolean v0, p0, Lgz;->g:Z */
/* iput-boolean v0, p0, Lgz;->h:Z */
/* iput-boolean v0, p0, Lgz;->i:Z */
/* iput-boolean v0, p0, Lgz;->a:Z */
/* iput-boolean v0, p0, Lgz;->j:Z */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
this.e = v1;
/* new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList; */
/* invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V */
this.a = v1;
/* iput-boolean v0, p0, Lgz;->k:Z */
this.a = p1;
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
this.a = p1;
/* new-instance p1, Ljava/util/ArrayList; */
/* invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V */
this.a = p1;
/* new-instance p1, Ljava/util/ArrayList; */
/* invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V */
this.c = p1;
int p1 = 1; // const/4 p1, 0x1
/* iput-boolean p1, p0, Lgz;->e:Z */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
this.b = v1;
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
this.d = v1;
/* iput-boolean p1, p0, Lgz;->f:Z */
v1 = this.a;
(( android.content.res.Resources ) v1 ).getConfiguration ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* iget v1, v1, Landroid/content/res/Configuration;->keyboard:I */
/* if-eq v1, p1, :cond_0 */
v1 = this.a;
android.view.ViewConfiguration .get ( v1 );
v2 = this.a;
v1 = en .a ( v1,v2 );
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
/* iput-boolean p1, p0, Lgz;->d:Z */
return;
} // .end method
private static Integer a ( java.util.ArrayList p0, Integer p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/ArrayList<", */
/* "Lhb;", */
/* ">;I)I" */
/* } */
} // .end annotation
v0 = (( java.util.ArrayList ) p0 ).size ( ); // invoke-virtual {p0}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_1 */
(( java.util.ArrayList ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Lhb; */
/* iget v1, v1, Lhb;->a:I */
/* if-gt v1, p1, :cond_0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // .end method
private android.view.MenuItem a ( Integer p0, Integer p1, Integer p2, java.lang.CharSequence p3 ) {
/* .locals 10 */
/* const/high16 v0, -0x10000 */
/* and-int/2addr v0, p3 */
/* shr-int/lit8 v0, v0, 0x10 */
/* if-ltz v0, :cond_1 */
v1 = gz.a;
/* array-length v2, v1 */
/* if-ge v0, v2, :cond_1 */
/* aget v0, v1, v0 */
/* shl-int/lit8 v0, v0, 0x10 */
/* const v1, 0xffff */
/* and-int/2addr v1, p3 */
/* or-int/2addr v0, v1 */
/* iget v9, p0, Lgz;->a:I */
/* new-instance v1, Lhb; */
/* move-object v2, v1 */
/* move-object v3, p0 */
/* move v4, p1 */
/* move v5, p2 */
/* move v6, p3 */
/* move v7, v0 */
/* move-object v8, p4 */
/* invoke-direct/range {v2 ..v9}, Lhb;-><init>(Lgz;IIIILjava/lang/CharSequence;I)V */
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_0
this.a = p1;
} // :cond_0
p1 = this.a;
p2 = gz .a ( p1,v0 );
(( java.util.ArrayList ) p1 ).add ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
int p1 = 1; // const/4 p1, 0x1
(( gz ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lgz;->b(Z)V
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String p2 = "order does not contain a valid category."; // const-string p2, "order does not contain a valid category."
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
private hb a ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 11 */
v0 = this.e;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* invoke-direct {p0, v0, p1, p2}, Lgz;->a(Ljava/util/List;ILandroid/view/KeyEvent;)V */
v1 = (( java.util.ArrayList ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_0
v1 = (( android.view.KeyEvent ) p2 ).getMetaState ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I
/* new-instance v3, Landroid/view/KeyCharacterMap$KeyData; */
/* invoke-direct {v3}, Landroid/view/KeyCharacterMap$KeyData;-><init>()V */
(( android.view.KeyEvent ) p2 ).getKeyData ( v3 ); // invoke-virtual {p2, v3}, Landroid/view/KeyEvent;->getKeyData(Landroid/view/KeyCharacterMap$KeyData;)Z
p2 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
/* if-ne p2, v4, :cond_1 */
(( java.util.ArrayList ) v0 ).get ( v5 ); // invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p1, Lhb; */
} // :cond_1
v4 = (( gz ) p0 ).b ( ); // invoke-virtual {p0}, Lgz;->b()Z
int v6 = 0; // const/4 v6, 0x0
} // :goto_0
/* if-ge v6, p2, :cond_7 */
(( java.util.ArrayList ) v0 ).get ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v7, Lhb; */
if ( v4 != null) { // if-eqz v4, :cond_2
v8 = (( hb ) v7 ).getAlphabeticShortcut ( ); // invoke-virtual {v7}, Lhb;->getAlphabeticShortcut()C
} // :cond_2
v8 = (( hb ) v7 ).getNumericShortcut ( ); // invoke-virtual {v7}, Lhb;->getNumericShortcut()C
} // :goto_1
v9 = this.meta;
/* aget-char v9, v9, v5 */
/* if-ne v8, v9, :cond_3 */
/* and-int/lit8 v9, v1, 0x2 */
if ( v9 != null) { // if-eqz v9, :cond_5
} // :cond_3
v9 = this.meta;
int v10 = 2; // const/4 v10, 0x2
/* aget-char v9, v9, v10 */
/* if-ne v8, v9, :cond_4 */
/* and-int/lit8 v9, v1, 0x2 */
/* if-nez v9, :cond_5 */
} // :cond_4
if ( v4 != null) { // if-eqz v4, :cond_6
/* const/16 v9, 0x8 */
/* if-ne v8, v9, :cond_6 */
/* const/16 v8, 0x43 */
/* if-ne p1, v8, :cond_6 */
} // :cond_5
} // :cond_6
/* add-int/lit8 v6, v6, 0x1 */
} // :cond_7
} // .end method
private void a ( Integer p0, Boolean p1 ) {
/* .locals 1 */
/* if-ltz p1, :cond_1 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-lt p1, v0, :cond_0 */
} // :cond_0
v0 = this.a;
(( java.util.ArrayList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
if ( p2 != null) { // if-eqz p2, :cond_1
int p1 = 1; // const/4 p1, 0x1
(( gz ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lgz;->b(Z)V
} // :cond_1
} // :goto_0
return;
} // .end method
private void a ( java.util.List p0, Integer p1, android.view.KeyEvent p2 ) {
/* .locals 12 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lhb;", */
/* ">;I", */
/* "Landroid/view/KeyEvent;", */
/* ")V" */
/* } */
} // .end annotation
v0 = (( gz ) p0 ).b ( ); // invoke-virtual {p0}, Lgz;->b()Z
v1 = (( android.view.KeyEvent ) p3 ).getModifiers ( ); // invoke-virtual {p3}, Landroid/view/KeyEvent;->getModifiers()I
/* new-instance v2, Landroid/view/KeyCharacterMap$KeyData; */
/* invoke-direct {v2}, Landroid/view/KeyCharacterMap$KeyData;-><init>()V */
v3 = (( android.view.KeyEvent ) p3 ).getKeyData ( v2 ); // invoke-virtual {p3, v2}, Landroid/view/KeyEvent;->getKeyData(Landroid/view/KeyCharacterMap$KeyData;)Z
/* const/16 v4, 0x43 */
/* if-nez v3, :cond_0 */
/* if-eq p2, v4, :cond_0 */
return;
} // :cond_0
v3 = this.a;
v3 = (( java.util.ArrayList ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
} // :goto_0
/* if-ge v6, v3, :cond_7 */
v7 = this.a;
(( java.util.ArrayList ) v7 ).get ( v6 ); // invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v7, Lhb; */
v8 = (( hb ) v7 ).hasSubMenu ( ); // invoke-virtual {v7}, Lhb;->hasSubMenu()Z
if ( v8 != null) { // if-eqz v8, :cond_1
(( hb ) v7 ).getSubMenu ( ); // invoke-virtual {v7}, Lhb;->getSubMenu()Landroid/view/SubMenu;
/* check-cast v8, Lgz; */
/* invoke-direct {v8, p1, p2, p3}, Lgz;->a(Ljava/util/List;ILandroid/view/KeyEvent;)V */
} // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_2
v8 = (( hb ) v7 ).getAlphabeticShortcut ( ); // invoke-virtual {v7}, Lhb;->getAlphabeticShortcut()C
} // :cond_2
v8 = (( hb ) v7 ).getNumericShortcut ( ); // invoke-virtual {v7}, Lhb;->getNumericShortcut()C
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_3
v9 = (( hb ) v7 ).getAlphabeticModifiers ( ); // invoke-virtual {v7}, Lhb;->getAlphabeticModifiers()I
} // :cond_3
v9 = (( hb ) v7 ).getNumericModifiers ( ); // invoke-virtual {v7}, Lhb;->getNumericModifiers()I
} // :goto_2
/* const v10, 0x1100f */
/* and-int v11, v1, v10 */
/* and-int/2addr v9, v10 */
/* if-ne v11, v9, :cond_4 */
int v9 = 1; // const/4 v9, 0x1
} // :cond_4
int v9 = 0; // const/4 v9, 0x0
} // :goto_3
if ( v9 != null) { // if-eqz v9, :cond_6
if ( v8 != null) { // if-eqz v8, :cond_6
v9 = this.meta;
/* aget-char v9, v9, v5 */
/* if-eq v8, v9, :cond_5 */
v9 = this.meta;
int v10 = 2; // const/4 v10, 0x2
/* aget-char v9, v9, v10 */
/* if-eq v8, v9, :cond_5 */
if ( v0 != null) { // if-eqz v0, :cond_6
/* const/16 v9, 0x8 */
/* if-ne v8, v9, :cond_6 */
/* if-ne p2, v4, :cond_6 */
} // :cond_5
v8 = (( hb ) v7 ).isEnabled ( ); // invoke-virtual {v7}, Lhb;->isEnabled()Z
if ( v8 != null) { // if-eqz v8, :cond_6
} // :cond_6
/* add-int/lit8 v6, v6, 0x1 */
} // :cond_7
return;
} // .end method
private Boolean a ( hm p0, hg p1 ) {
/* .locals 3 */
v0 = this.a;
v0 = (( java.util.concurrent.CopyOnWriteArrayList ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
v1 = if ( p2 != null) { // if-eqz p2, :cond_1
} // :cond_1
p2 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) p2 ).iterator ( ); // invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
} // :cond_2
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_4
/* check-cast v0, Ljava/lang/ref/WeakReference; */
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v2, Lhg; */
/* if-nez v2, :cond_3 */
v2 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v2 ).remove ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z
} // :cond_3
v0 = /* if-nez v1, :cond_2 */
/* move v1, v0 */
} // :cond_4
} // .end method
private void c ( Boolean p0 ) {
/* .locals 3 */
v0 = this.a;
v0 = (( java.util.concurrent.CopyOnWriteArrayList ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_0
return;
} // :cond_0
(( gz ) p0 ).a ( ); // invoke-virtual {p0}, Lgz;->a()V
v0 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* check-cast v1, Ljava/lang/ref/WeakReference; */
(( java.lang.ref.WeakReference ) v1 ).get ( ); // invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v2, Lhg; */
/* if-nez v2, :cond_1 */
v2 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v2 ).remove ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z
} // :cond_1
} // :cond_2
(( gz ) p0 ).b ( ); // invoke-virtual {p0}, Lgz;->b()V
return;
} // .end method
/* # virtual methods */
public gz a ( ) {
/* .locals 0 */
} // .end method
protected java.lang.String a ( ) {
/* .locals 1 */
final String v0 = "android:menu:actionviewstates"; // const-string v0, "android:menu:actionviewstates"
} // .end method
public final java.util.ArrayList a ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/ArrayList<", */
/* "Lhb;", */
/* ">;" */
/* } */
} // .end annotation
/* iget-boolean v0, p0, Lgz;->e:Z */
/* if-nez v0, :cond_0 */
v0 = this.c;
} // :cond_0
v0 = this.c;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_2 */
v3 = this.a;
(( java.util.ArrayList ) v3 ).get ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Lhb; */
v4 = (( hb ) v3 ).isVisible ( ); // invoke-virtual {v3}, Lhb;->isVisible()Z
if ( v4 != null) { // if-eqz v4, :cond_1
v4 = this.c;
(( java.util.ArrayList ) v4 ).add ( v3 ); // invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
/* iput-boolean v1, p0, Lgz;->e:Z */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lgz;->f:Z */
v0 = this.c;
} // .end method
public final void a ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lgz;->g:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lgz;->g:Z */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lgz;->h:Z */
/* iput-boolean v0, p0, Lgz;->i:Z */
} // :cond_0
return;
} // .end method
final void a ( Integer p0, java.lang.CharSequence p1, Integer p2, android.graphics.drawable.Drawable p3, android.view.View p4 ) {
/* .locals 2 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
if ( p5 != null) { // if-eqz p5, :cond_0
this.a = p5;
this.a = v1;
this.a = v1;
} // :cond_0
/* if-lez p1, :cond_1 */
(( android.content.res.Resources ) v0 ).getText ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;
this.a = p1;
} // :cond_1
if ( p2 != null) { // if-eqz p2, :cond_2
this.a = p2;
} // :cond_2
} // :goto_0
/* if-lez p3, :cond_3 */
p1 = this.a;
ce .a ( p1,p3 );
this.a = p1;
} // :cond_3
if ( p4 != null) { // if-eqz p4, :cond_4
this.a = p4;
} // :cond_4
} // :goto_1
this.a = v1;
} // :goto_2
int p1 = 0; // const/4 p1, 0x0
(( gz ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lgz;->b(Z)V
return;
} // .end method
public final void a ( android.os.Bundle p0 ) {
/* .locals 7 */
v0 = (( gz ) p0 ).size ( ); // invoke-virtual {p0}, Lgz;->size()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_3 */
(( gz ) p0 ).getItem ( v2 ); // invoke-virtual {p0, v2}, Lgz;->getItem(I)Landroid/view/MenuItem;
if ( v4 != null) { // if-eqz v4, :cond_1
v5 = (( android.view.View ) v4 ).getId ( ); // invoke-virtual {v4}, Landroid/view/View;->getId()I
int v6 = -1; // const/4 v6, -0x1
/* if-eq v5, v6, :cond_1 */
/* if-nez v1, :cond_0 */
/* new-instance v1, Landroid/util/SparseArray; */
/* invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V */
} // :cond_0
v4 = (( android.view.View ) v4 ).saveHierarchyState ( v1 ); // invoke-virtual {v4, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V
if ( v4 != null) { // if-eqz v4, :cond_1
v5 = final String v4 = "android:menu:expandedactionview"; // const-string v4, "android:menu:expandedactionview"
(( android.os.Bundle ) p1 ).putInt ( v4, v5 ); // invoke-virtual {p1, v4, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
v4 = } // :cond_1
if ( v4 != null) { // if-eqz v4, :cond_2
/* check-cast v3, Lhm; */
(( hm ) v3 ).a ( p1 ); // invoke-virtual {v3, p1}, Lhm;->a(Landroid/os/Bundle;)V
} // :cond_2
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_3
if ( v1 != null) { // if-eqz v1, :cond_4
(( gz ) p0 ).a ( ); // invoke-virtual {p0}, Lgz;->a()Ljava/lang/String;
(( android.os.Bundle ) p1 ).putSparseParcelableArray ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V
} // :cond_4
return;
} // .end method
public void a ( gz$a p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
public final void a ( hg p0 ) {
/* .locals 1 */
v0 = this.a;
(( gz ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lgz;->a(Lhg;Landroid/content/Context;)V
return;
} // .end method
public final void a ( hg p0, android.content.Context p1 ) {
/* .locals 2 */
v0 = this.a;
/* new-instance v1, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
(( java.util.concurrent.CopyOnWriteArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z
int p1 = 1; // const/4 p1, 0x1
/* iput-boolean p1, p0, Lgz;->f:Z */
return;
} // .end method
public final void a ( Boolean p0 ) {
/* .locals 3 */
/* iget-boolean v0, p0, Lgz;->j:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lgz;->j:Z */
v0 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* check-cast v1, Ljava/lang/ref/WeakReference; */
(( java.lang.ref.WeakReference ) v1 ).get ( ); // invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v2, Lhg; */
/* if-nez v2, :cond_1 */
v2 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v2 ).remove ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z
} // :cond_1
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
/* iput-boolean p1, p0, Lgz;->j:Z */
return;
} // .end method
public Boolean a ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lgz;->k:Z */
} // .end method
public final Boolean a ( android.view.MenuItem p0, hg p1, Integer p2 ) {
/* .locals 6 */
/* check-cast p1, Lhb; */
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_9
v1 = (( hb ) p1 ).isEnabled ( ); // invoke-virtual {p1}, Lhb;->isEnabled()Z
/* if-nez v1, :cond_0 */
} // :cond_0
v1 = (( hb ) p1 ).a ( ); // invoke-virtual {p1}, Lhb;->a()Z
v2 = this.a;
int v3 = 1; // const/4 v3, 0x1
if ( v2 != null) { // if-eqz v2, :cond_1
v4 = (( dy ) v2 ).d ( ); // invoke-virtual {v2}, Ldy;->d()Z
if ( v4 != null) { // if-eqz v4, :cond_1
int v4 = 1; // const/4 v4, 0x1
} // :cond_1
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
v5 = (( hb ) p1 ).h ( ); // invoke-virtual {p1}, Lhb;->h()Z
if ( v5 != null) { // if-eqz v5, :cond_2
p1 = (( hb ) p1 ).expandActionView ( ); // invoke-virtual {p1}, Lhb;->expandActionView()Z
/* or-int/2addr v1, p1 */
if ( v1 != null) { // if-eqz v1, :cond_8
} // :goto_1
(( gz ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Lgz;->a(Z)V
} // :cond_2
v5 = (( hb ) p1 ).hasSubMenu ( ); // invoke-virtual {p1}, Lhb;->hasSubMenu()Z
/* if-nez v5, :cond_4 */
if ( v4 != null) { // if-eqz v4, :cond_3
} // :cond_3
/* and-int/lit8 p1, p3, 0x1 */
/* if-nez p1, :cond_8 */
} // :cond_4
} // :goto_2
/* and-int/lit8 p3, p3, 0x4 */
/* if-nez p3, :cond_5 */
(( gz ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lgz;->a(Z)V
} // :cond_5
p3 = (( hb ) p1 ).hasSubMenu ( ); // invoke-virtual {p1}, Lhb;->hasSubMenu()Z
/* if-nez p3, :cond_6 */
/* new-instance p3, Lhm; */
v0 = this.a;
/* invoke-direct {p3, v0, p0, p1}, Lhm;-><init>(Landroid/content/Context;Lgz;Lhb;)V */
(( hb ) p1 ).a ( p3 ); // invoke-virtual {p1, p3}, Lhb;->a(Lhm;)V
} // :cond_6
(( hb ) p1 ).getSubMenu ( ); // invoke-virtual {p1}, Lhb;->getSubMenu()Landroid/view/SubMenu;
/* check-cast p1, Lhm; */
if ( v4 != null) { // if-eqz v4, :cond_7
(( dy ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Ldy;->a(Landroid/view/SubMenu;)V
} // :cond_7
p1 = /* invoke-direct {p0, p1, p2}, Lgz;->a(Lhm;Lhg;)Z */
/* or-int/2addr v1, p1 */
/* if-nez v1, :cond_8 */
} // :cond_8
} // :goto_3
} // :cond_9
} // :goto_4
} // .end method
Boolean a ( gz p0, android.view.MenuItem p1 ) {
/* .locals 1 */
v0 = this.a;
p1 = if ( v0 != null) { // if-eqz v0, :cond_0
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean a ( hb p0 ) {
/* .locals 4 */
v0 = this.a;
v0 = (( java.util.concurrent.CopyOnWriteArrayList ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
(( gz ) p0 ).a ( ); // invoke-virtual {p0}, Lgz;->a()V
v0 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
} // :cond_1
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_3
/* check-cast v2, Ljava/lang/ref/WeakReference; */
(( java.lang.ref.WeakReference ) v2 ).get ( ); // invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v3, Lhg; */
/* if-nez v3, :cond_2 */
v3 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v3 ).remove ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z
v1 = } // :cond_2
if ( v1 != null) { // if-eqz v1, :cond_1
} // :cond_3
(( gz ) p0 ).b ( ); // invoke-virtual {p0}, Lgz;->b()V
if ( v1 != null) { // if-eqz v1, :cond_4
this.a = p1;
} // :cond_4
} // .end method
public android.view.MenuItem add ( Integer p0 ) {
/* .locals 1 */
v0 = this.a;
(( android.content.res.Resources ) v0 ).getString ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0, v0, v0, p1}, Lgz;->a(IIILjava/lang/CharSequence;)Landroid/view/MenuItem; */
} // .end method
public android.view.MenuItem add ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
v0 = this.a;
(( android.content.res.Resources ) v0 ).getString ( p4 ); // invoke-virtual {v0, p4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
/* invoke-direct {p0, p1, p2, p3, p4}, Lgz;->a(IIILjava/lang/CharSequence;)Landroid/view/MenuItem; */
} // .end method
public android.view.MenuItem add ( Integer p0, Integer p1, Integer p2, java.lang.CharSequence p3 ) {
/* .locals 0 */
/* invoke-direct {p0, p1, p2, p3, p4}, Lgz;->a(IIILjava/lang/CharSequence;)Landroid/view/MenuItem; */
} // .end method
public android.view.MenuItem add ( java.lang.CharSequence p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0, v0, v0, p1}, Lgz;->a(IIILjava/lang/CharSequence;)Landroid/view/MenuItem; */
} // .end method
public Integer addIntentOptions ( Integer p0, Integer p1, Integer p2, android.content.ComponentName p3, android.content.Intent[] p4, android.content.Intent p5, Integer p6, android.view.MenuItem[] p7 ) {
/* .locals 7 */
v0 = this.a;
(( android.content.Context ) v0 ).getPackageManager ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
int v1 = 0; // const/4 v1, 0x0
(( android.content.pm.PackageManager ) v0 ).queryIntentActivityOptions ( p4, p5, p6, v1 ); // invoke-virtual {v0, p4, p5, p6, v1}, Landroid/content/pm/PackageManager;->queryIntentActivityOptions(Landroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I)Ljava/util/List;
v2 = if ( p4 != null) { // if-eqz p4, :cond_0
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* and-int/lit8 p7, p7, 0x1 */
/* if-nez p7, :cond_1 */
(( gz ) p0 ).removeGroup ( p1 ); // invoke-virtual {p0, p1}, Lgz;->removeGroup(I)V
} // :cond_1
} // :goto_1
/* if-ge v1, v2, :cond_4 */
/* check-cast p7, Landroid/content/pm/ResolveInfo; */
/* new-instance v3, Landroid/content/Intent; */
/* iget v4, p7, Landroid/content/pm/ResolveInfo;->specificIndex:I */
/* if-gez v4, :cond_2 */
/* move-object v4, p6 */
} // :cond_2
/* iget v4, p7, Landroid/content/pm/ResolveInfo;->specificIndex:I */
/* aget-object v4, p5, v4 */
} // :goto_2
/* invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V */
/* new-instance v4, Landroid/content/ComponentName; */
v5 = this.activityInfo;
v5 = this.applicationInfo;
v5 = this.packageName;
v6 = this.activityInfo;
v6 = this.name;
/* invoke-direct {v4, v5, v6}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( android.content.Intent ) v3 ).setComponent ( v4 ); // invoke-virtual {v3, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
(( android.content.pm.ResolveInfo ) p7 ).loadLabel ( v0 ); // invoke-virtual {p7, v0}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
(( gz ) p0 ).add ( p1, p2, p3, v4 ); // invoke-virtual {p0, p1, p2, p3, v4}, Lgz;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
(( android.content.pm.ResolveInfo ) p7 ).loadIcon ( v0 ); // invoke-virtual {p7, v0}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
if ( p8 != null) { // if-eqz p8, :cond_3
/* iget v4, p7, Landroid/content/pm/ResolveInfo;->specificIndex:I */
/* if-ltz v4, :cond_3 */
/* iget p7, p7, Landroid/content/pm/ResolveInfo;->specificIndex:I */
/* aput-object v3, p8, p7 */
} // :cond_3
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_4
} // .end method
public android.view.SubMenu addSubMenu ( Integer p0 ) {
/* .locals 1 */
v0 = this.a;
(( android.content.res.Resources ) v0 ).getString ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
int v0 = 0; // const/4 v0, 0x0
(( gz ) p0 ).addSubMenu ( v0, v0, v0, p1 ); // invoke-virtual {p0, v0, v0, v0, p1}, Lgz;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
} // .end method
public android.view.SubMenu addSubMenu ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
v0 = this.a;
(( android.content.res.Resources ) v0 ).getString ( p4 ); // invoke-virtual {v0, p4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
(( gz ) p0 ).addSubMenu ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Lgz;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
} // .end method
public android.view.SubMenu addSubMenu ( Integer p0, Integer p1, Integer p2, java.lang.CharSequence p3 ) {
/* .locals 0 */
/* invoke-direct {p0, p1, p2, p3, p4}, Lgz;->a(IIILjava/lang/CharSequence;)Landroid/view/MenuItem; */
/* check-cast p1, Lhb; */
/* new-instance p2, Lhm; */
p3 = this.a;
/* invoke-direct {p2, p3, p0, p1}, Lhm;-><init>(Landroid/content/Context;Lgz;Lhb;)V */
(( hb ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lhb;->a(Lhm;)V
} // .end method
public android.view.SubMenu addSubMenu ( java.lang.CharSequence p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
(( gz ) p0 ).addSubMenu ( v0, v0, v0, p1 ); // invoke-virtual {p0, v0, v0, v0, p1}, Lgz;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
} // .end method
public final java.util.ArrayList b ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/ArrayList<", */
/* "Lhb;", */
/* ">;" */
/* } */
} // .end annotation
(( gz ) p0 ).e ( ); // invoke-virtual {p0}, Lgz;->e()V
v0 = this.d;
} // .end method
public final void b ( ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lgz;->g:Z */
/* iget-boolean v1, p0, Lgz;->h:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* iput-boolean v0, p0, Lgz;->h:Z */
/* iget-boolean v0, p0, Lgz;->i:Z */
(( gz ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lgz;->b(Z)V
} // :cond_0
return;
} // .end method
public final void b ( android.os.Bundle p0 ) {
/* .locals 7 */
/* if-nez p1, :cond_0 */
return;
} // :cond_0
(( gz ) p0 ).a ( ); // invoke-virtual {p0}, Lgz;->a()Ljava/lang/String;
(( android.os.Bundle ) p1 ).getSparseParcelableArray ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;
v1 = (( gz ) p0 ).size ( ); // invoke-virtual {p0}, Lgz;->size()I
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_3 */
(( gz ) p0 ).getItem ( v2 ); // invoke-virtual {p0, v2}, Lgz;->getItem(I)Landroid/view/MenuItem;
if ( v4 != null) { // if-eqz v4, :cond_1
v5 = (( android.view.View ) v4 ).getId ( ); // invoke-virtual {v4}, Landroid/view/View;->getId()I
int v6 = -1; // const/4 v6, -0x1
/* if-eq v5, v6, :cond_1 */
(( android.view.View ) v4 ).restoreHierarchyState ( v0 ); // invoke-virtual {v4, v0}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V
v4 = } // :cond_1
if ( v4 != null) { // if-eqz v4, :cond_2
/* check-cast v3, Lhm; */
(( hm ) v3 ).b ( p1 ); // invoke-virtual {v3, p1}, Lhm;->b(Landroid/os/Bundle;)V
} // :cond_2
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_3
final String v0 = "android:menu:expandedactionview"; // const-string v0, "android:menu:expandedactionview"
p1 = (( android.os.Bundle ) p1 ).getInt ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
/* if-lez p1, :cond_4 */
(( gz ) p0 ).findItem ( p1 ); // invoke-virtual {p0, p1}, Lgz;->findItem(I)Landroid/view/MenuItem;
if ( p1 != null) { // if-eqz p1, :cond_4
} // :cond_4
return;
} // .end method
public final void b ( hg p0 ) {
/* .locals 3 */
v0 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
} // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* check-cast v1, Ljava/lang/ref/WeakReference; */
(( java.lang.ref.WeakReference ) v1 ).get ( ); // invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v2, Lhg; */
if ( v2 != null) { // if-eqz v2, :cond_1
/* if-ne v2, p1, :cond_0 */
} // :cond_1
v2 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v2 ).remove ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z
} // :cond_2
return;
} // .end method
public final void b ( Boolean p0 ) {
/* .locals 2 */
/* iget-boolean v0, p0, Lgz;->g:Z */
int v1 = 1; // const/4 v1, 0x1
/* if-nez v0, :cond_1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* iput-boolean v1, p0, Lgz;->e:Z */
/* iput-boolean v1, p0, Lgz;->f:Z */
} // :cond_0
/* invoke-direct {p0, p1}, Lgz;->c(Z)V */
return;
} // :cond_1
/* iput-boolean v1, p0, Lgz;->h:Z */
if ( p1 != null) { // if-eqz p1, :cond_2
/* iput-boolean v1, p0, Lgz;->i:Z */
} // :cond_2
return;
} // .end method
public Boolean b ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lgz;->c:Z */
} // .end method
public Boolean b ( hb p0 ) {
/* .locals 4 */
v0 = this.a;
v0 = (( java.util.concurrent.CopyOnWriteArrayList ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_4 */
v0 = this.a;
/* if-eq v0, p1, :cond_0 */
} // :cond_0
(( gz ) p0 ).a ( ); // invoke-virtual {p0}, Lgz;->a()V
v0 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
} // :cond_1
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_3
/* check-cast v2, Ljava/lang/ref/WeakReference; */
(( java.lang.ref.WeakReference ) v2 ).get ( ); // invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v3, Lhg; */
/* if-nez v3, :cond_2 */
v3 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v3 ).remove ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z
v1 = } // :cond_2
if ( v1 != null) { // if-eqz v1, :cond_1
} // :cond_3
(( gz ) p0 ).b ( ); // invoke-virtual {p0}, Lgz;->b()V
if ( v1 != null) { // if-eqz v1, :cond_4
int p1 = 0; // const/4 p1, 0x0
this.a = p1;
} // :cond_4
} // :goto_1
} // .end method
final void c ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lgz;->e:Z */
(( gz ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lgz;->b(Z)V
return;
} // .end method
public Boolean c ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lgz;->d:Z */
} // .end method
public void clear ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( gz ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lgz;->b(Lhb;)Z
} // :cond_0
v0 = this.a;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
int v0 = 1; // const/4 v0, 0x1
(( gz ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lgz;->b(Z)V
return;
} // .end method
public void clearHeader ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
this.a = v0;
this.a = v0;
int v0 = 0; // const/4 v0, 0x0
(( gz ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lgz;->b(Z)V
return;
} // .end method
public void close ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
(( gz ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lgz;->a(Z)V
return;
} // .end method
public final void d ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lgz;->f:Z */
(( gz ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lgz;->b(Z)V
return;
} // .end method
public final void e ( ) {
/* .locals 6 */
(( gz ) p0 ).a ( ); // invoke-virtual {p0}, Lgz;->a()Ljava/util/ArrayList;
/* iget-boolean v1, p0, Lgz;->f:Z */
/* if-nez v1, :cond_0 */
return;
} // :cond_0
v1 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v1 ).iterator ( ); // invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
v4 = } // :goto_0
if ( v4 != null) { // if-eqz v4, :cond_2
/* check-cast v4, Ljava/lang/ref/WeakReference; */
(( java.lang.ref.WeakReference ) v4 ).get ( ); // invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v5, Lhg; */
/* if-nez v5, :cond_1 */
v5 = this.a;
(( java.util.concurrent.CopyOnWriteArrayList ) v5 ).remove ( v4 ); // invoke-virtual {v5, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z
v4 = } // :cond_1
/* or-int/2addr v3, v4 */
} // :cond_2
if ( v3 != null) { // if-eqz v3, :cond_4
v1 = this.b;
(( java.util.ArrayList ) v1 ).clear ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
v1 = this.d;
(( java.util.ArrayList ) v1 ).clear ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
v1 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
/* if-ge v3, v1, :cond_5 */
(( java.util.ArrayList ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v4, Lhb; */
v5 = (( hb ) v4 ).d ( ); // invoke-virtual {v4}, Lhb;->d()Z
if ( v5 != null) { // if-eqz v5, :cond_3
v5 = this.b;
} // :cond_3
v5 = this.d;
} // :goto_2
(( java.util.ArrayList ) v5 ).add ( v4 ); // invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_4
v0 = this.b;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
v0 = this.d;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
v0 = this.d;
(( gz ) p0 ).a ( ); // invoke-virtual {p0}, Lgz;->a()Ljava/util/ArrayList;
(( java.util.ArrayList ) v0 ).addAll ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
} // :cond_5
/* iput-boolean v2, p0, Lgz;->f:Z */
return;
} // .end method
public android.view.MenuItem findItem ( Integer p0 ) {
/* .locals 4 */
v0 = (( gz ) p0 ).size ( ); // invoke-virtual {p0}, Lgz;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_2 */
v2 = this.a;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Lhb; */
v3 = (( hb ) v2 ).getItemId ( ); // invoke-virtual {v2}, Lhb;->getItemId()I
/* if-ne v3, p1, :cond_0 */
} // :cond_0
v3 = (( hb ) v2 ).hasSubMenu ( ); // invoke-virtual {v2}, Lhb;->hasSubMenu()Z
if ( v3 != null) { // if-eqz v3, :cond_1
(( hb ) v2 ).getSubMenu ( ); // invoke-virtual {v2}, Lhb;->getSubMenu()Landroid/view/SubMenu;
if ( v2 != null) { // if-eqz v2, :cond_1
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
} // .end method
public android.view.MenuItem getItem ( Integer p0 ) {
/* .locals 1 */
v0 = this.a;
(( java.util.ArrayList ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p1, Landroid/view/MenuItem; */
} // .end method
public Boolean hasVisibleItems ( ) {
/* .locals 5 */
/* iget-boolean v0, p0, Lgz;->b:Z */
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
v0 = (( gz ) p0 ).size ( ); // invoke-virtual {p0}, Lgz;->size()I
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v0, :cond_2 */
v4 = this.a;
(( java.util.ArrayList ) v4 ).get ( v3 ); // invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v4, Lhb; */
v4 = (( hb ) v4 ).isVisible ( ); // invoke-virtual {v4}, Lhb;->isVisible()Z
if ( v4 != null) { // if-eqz v4, :cond_1
} // :cond_1
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_2
} // .end method
public Boolean isShortcutKey ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 0 */
/* invoke-direct {p0, p1, p2}, Lgz;->a(ILandroid/view/KeyEvent;)Lhb; */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean performIdentifierAction ( Integer p0, Integer p1 ) {
/* .locals 1 */
(( gz ) p0 ).findItem ( p1 ); // invoke-virtual {p0, p1}, Lgz;->findItem(I)Landroid/view/MenuItem;
int v0 = 0; // const/4 v0, 0x0
p1 = (( gz ) p0 ).a ( p1, v0, p2 ); // invoke-virtual {p0, p1, v0, p2}, Lgz;->a(Landroid/view/MenuItem;Lhg;I)Z
} // .end method
public Boolean performShortcut ( Integer p0, android.view.KeyEvent p1, Integer p2 ) {
/* .locals 0 */
/* invoke-direct {p0, p1, p2}, Lgz;->a(ILandroid/view/KeyEvent;)Lhb; */
if ( p1 != null) { // if-eqz p1, :cond_0
int p2 = 0; // const/4 p2, 0x0
p1 = (( gz ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lgz;->a(Landroid/view/MenuItem;Lhg;I)Z
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
/* and-int/lit8 p2, p3, 0x2 */
if ( p2 != null) { // if-eqz p2, :cond_1
int p2 = 1; // const/4 p2, 0x1
(( gz ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lgz;->a(Z)V
} // :cond_1
} // .end method
public void removeGroup ( Integer p0 ) {
/* .locals 5 */
v0 = (( gz ) p0 ).size ( ); // invoke-virtual {p0}, Lgz;->size()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_1 */
v3 = this.a;
(( java.util.ArrayList ) v3 ).get ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Lhb; */
v3 = (( hb ) v3 ).getGroupId ( ); // invoke-virtual {v3}, Lhb;->getGroupId()I
/* if-ne v3, p1, :cond_0 */
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
int v2 = -1; // const/4 v2, -0x1
} // :goto_1
/* if-ltz v2, :cond_3 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* sub-int/2addr v0, v2 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_2
/* add-int/lit8 v4, v3, 0x1 */
/* if-ge v3, v0, :cond_2 */
v3 = this.a;
(( java.util.ArrayList ) v3 ).get ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Lhb; */
v3 = (( hb ) v3 ).getGroupId ( ); // invoke-virtual {v3}, Lhb;->getGroupId()I
/* if-ne v3, p1, :cond_2 */
/* invoke-direct {p0, v2, v1}, Lgz;->a(IZ)V */
/* move v3, v4 */
} // :cond_2
int p1 = 1; // const/4 p1, 0x1
(( gz ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lgz;->b(Z)V
} // :cond_3
return;
} // .end method
public void removeItem ( Integer p0 ) {
/* .locals 3 */
v0 = (( gz ) p0 ).size ( ); // invoke-virtual {p0}, Lgz;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
v2 = this.a;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Lhb; */
v2 = (( hb ) v2 ).getItemId ( ); // invoke-virtual {v2}, Lhb;->getItemId()I
/* if-ne v2, p1, :cond_0 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int v1 = -1; // const/4 v1, -0x1
} // :goto_1
int p1 = 1; // const/4 p1, 0x1
/* invoke-direct {p0, v1, p1}, Lgz;->a(IZ)V */
return;
} // .end method
public void setGroupCheckable ( Integer p0, Boolean p1, Boolean p2 ) {
/* .locals 4 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
v2 = this.a;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Lhb; */
v3 = (( hb ) v2 ).getGroupId ( ); // invoke-virtual {v2}, Lhb;->getGroupId()I
/* if-ne v3, p1, :cond_0 */
(( hb ) v2 ).a ( p3 ); // invoke-virtual {v2, p3}, Lhb;->a(Z)V
(( hb ) v2 ).setCheckable ( p2 ); // invoke-virtual {v2, p2}, Lhb;->setCheckable(Z)Landroid/view/MenuItem;
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
return;
} // .end method
public void setGroupDividerEnabled ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lgz;->k:Z */
return;
} // .end method
public void setGroupEnabled ( Integer p0, Boolean p1 ) {
/* .locals 4 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
v2 = this.a;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Lhb; */
v3 = (( hb ) v2 ).getGroupId ( ); // invoke-virtual {v2}, Lhb;->getGroupId()I
/* if-ne v3, p1, :cond_0 */
(( hb ) v2 ).setEnabled ( p2 ); // invoke-virtual {v2, p2}, Lhb;->setEnabled(Z)Landroid/view/MenuItem;
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
return;
} // .end method
public void setGroupVisible ( Integer p0, Boolean p1 ) {
/* .locals 6 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
int v3 = 1; // const/4 v3, 0x1
/* if-ge v1, v0, :cond_1 */
v4 = this.a;
(( java.util.ArrayList ) v4 ).get ( v1 ); // invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v4, Lhb; */
v5 = (( hb ) v4 ).getGroupId ( ); // invoke-virtual {v4}, Lhb;->getGroupId()I
/* if-ne v5, p1, :cond_0 */
v4 = (( hb ) v4 ).a ( p2 ); // invoke-virtual {v4, p2}, Lhb;->a(Z)Z
if ( v4 != null) { // if-eqz v4, :cond_0
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
if ( v2 != null) { // if-eqz v2, :cond_2
(( gz ) p0 ).b ( v3 ); // invoke-virtual {p0, v3}, Lgz;->b(Z)V
} // :cond_2
return;
} // .end method
public void setQwertyMode ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lgz;->c:Z */
int p1 = 0; // const/4 p1, 0x0
(( gz ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lgz;->b(Z)V
return;
} // .end method
public Integer size ( ) {
/* .locals 1 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
} // .end method
