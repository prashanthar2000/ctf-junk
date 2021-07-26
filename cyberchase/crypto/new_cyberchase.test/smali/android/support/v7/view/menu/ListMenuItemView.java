public class android.support.v7.view.menu.ListMenuItemView extends android.widget.LinearLayout implements android.widget.AbsListView$SelectionBoundsAdjuster implements hh$a {
	 /* # interfaces */
	 /* # instance fields */
	 private Integer a;
	 private android.content.Context a;
	 private android.graphics.drawable.Drawable a;
	 private android.view.LayoutInflater a;
	 private android.widget.CheckBox a;
	 private android.widget.ImageView a;
	 private android.widget.LinearLayout a;
	 private android.widget.RadioButton a;
	 private android.widget.TextView a;
	 private hb a;
	 private Boolean a;
	 private Integer b;
	 private android.graphics.drawable.Drawable b;
	 private android.widget.ImageView b;
	 private android.widget.TextView b;
	 private Boolean b;
	 private android.widget.ImageView c;
	 private Boolean c;
	 /* # direct methods */
	 public android.support.v7.view.menu.ListMenuItemView ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/view/menu/ListMenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public android.support.v7.view.menu.ListMenuItemView ( ) {
		 /* .locals 3 */
		 /* invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 (( android.support.v7.view.menu.ListMenuItemView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/view/menu/ListMenuItemView;->getContext()Landroid/content/Context;
		 v1 = gc$j.MenuView;
		 int v2 = 0; // const/4 v2, 0x0
		 ip .a ( v0,p2,v1,p3,v2 );
		 (( ip ) p2 ).a ( p3 ); // invoke-virtual {p2, p3}, Lip;->a(I)Landroid/graphics/drawable/Drawable;
		 this.a = p3;
		 int v0 = -1; // const/4 v0, -0x1
		 p3 = 		 (( ip ) p2 ).g ( p3, v0 ); // invoke-virtual {p2, p3, v0}, Lip;->g(II)I
		 /* iput p3, p0, Landroid/support/v7/view/menu/ListMenuItemView;->a:I */
		 p3 = 		 (( ip ) p2 ).a ( p3, v2 ); // invoke-virtual {p2, p3, v2}, Lip;->a(IZ)Z
		 /* iput-boolean p3, p0, Landroid/support/v7/view/menu/ListMenuItemView;->a:Z */
		 this.a = p1;
		 (( ip ) p2 ).a ( p3 ); // invoke-virtual {p2, p3}, Lip;->a(I)Landroid/graphics/drawable/Drawable;
		 this.b = p3;
		 (( android.content.Context ) p1 ).getTheme ( ); // invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
		 int p3 = 1; // const/4 p3, 0x1
		 /* new-array p3, p3, [I */
		 /* const v0, 0x1010129 */
		 /* aput v0, p3, v2 */
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.content.res.Resources$Theme ) p1 ).obtainStyledAttributes ( v1, p3, v0, v2 ); // invoke-virtual {p1, v1, p3, v0, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
		 p3 = 		 (( android.content.res.TypedArray ) p1 ).hasValue ( v2 ); // invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z
		 /* iput-boolean p3, p0, Landroid/support/v7/view/menu/ListMenuItemView;->b:Z */
		 p2 = this.a;
		 (( android.content.res.TypedArray ) p2 ).recycle ( ); // invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V
		 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
		 return;
	 } // .end method
	 private void a ( ) {
		 /* .locals 3 */
		 /* invoke-direct {p0}, Landroid/support/v7/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater; */
		 int v2 = 0; // const/4 v2, 0x0
		 (( android.view.LayoutInflater ) v0 ).inflate ( v1, p0, v2 ); // invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/RadioButton; */
		 this.a = v0;
		 v0 = this.a;
		 int v1 = -1; // const/4 v1, -0x1
		 /* invoke-direct {p0, v0, v1}, Landroid/support/v7/view/menu/ListMenuItemView;->a(Landroid/view/View;I)V */
		 return;
	 } // .end method
	 private void a ( android.view.View p0, Integer p1 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( android.widget.LinearLayout ) v0 ).addView ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V
			 return;
		 } // :cond_0
		 (( android.support.v7.view.menu.ListMenuItemView ) p0 ).addView ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/support/v7/view/menu/ListMenuItemView;->addView(Landroid/view/View;I)V
		 return;
	 } // .end method
	 private void b ( ) {
		 /* .locals 3 */
		 /* invoke-direct {p0}, Landroid/support/v7/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater; */
		 int v2 = 0; // const/4 v2, 0x0
		 (( android.view.LayoutInflater ) v0 ).inflate ( v1, p0, v2 ); // invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/CheckBox; */
		 this.a = v0;
		 v0 = this.a;
		 int v1 = -1; // const/4 v1, -0x1
		 /* invoke-direct {p0, v0, v1}, Landroid/support/v7/view/menu/ListMenuItemView;->a(Landroid/view/View;I)V */
		 return;
	 } // .end method
	 private android.view.LayoutInflater getInflater ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 /* if-nez v0, :cond_0 */
		 (( android.support.v7.view.menu.ListMenuItemView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/view/menu/ListMenuItemView;->getContext()Landroid/content/Context;
		 android.view.LayoutInflater .from ( v0 );
		 this.a = v0;
	 } // :cond_0
	 v0 = this.a;
} // .end method
private void setSubMenuArrowVisible ( Boolean p0 ) {
	 /* .locals 1 */
	 v0 = this.b;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 int p1 = 0; // const/4 p1, 0x0
		 } // :cond_0
		 /* const/16 p1, 0x8 */
	 } // :goto_0
	 (( android.widget.ImageView ) v0 ).setVisibility ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V
} // :cond_1
return;
} // .end method
/* # virtual methods */
public final void a ( hb p0 ) {
/* .locals 2 */
this.a = p1;
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Landroid/support/v7/view/menu/ListMenuItemView;->b:I */
v1 = (( hb ) p1 ).isVisible ( ); // invoke-virtual {p1}, Lhb;->isVisible()Z
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_0
/* const/16 v0, 0x8 */
} // :goto_0
(( android.support.v7.view.menu.ListMenuItemView ) p0 ).setVisibility ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/view/menu/ListMenuItemView;->setVisibility(I)V
(( hb ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lhb;->a(Lhh$a;)Ljava/lang/CharSequence;
(( android.support.v7.view.menu.ListMenuItemView ) p0 ).setTitle ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/view/menu/ListMenuItemView;->setTitle(Ljava/lang/CharSequence;)V
v0 = (( hb ) p1 ).isCheckable ( ); // invoke-virtual {p1}, Lhb;->isCheckable()Z
(( android.support.v7.view.menu.ListMenuItemView ) p0 ).setCheckable ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/view/menu/ListMenuItemView;->setCheckable(Z)V
v0 = (( hb ) p1 ).b ( ); // invoke-virtual {p1}, Lhb;->b()Z
v1 = (( hb ) p1 ).a ( ); // invoke-virtual {p1}, Lhb;->a()C
(( android.support.v7.view.menu.ListMenuItemView ) p0 ).setShortcut ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/support/v7/view/menu/ListMenuItemView;->setShortcut(ZC)V
(( hb ) p1 ).getIcon ( ); // invoke-virtual {p1}, Lhb;->getIcon()Landroid/graphics/drawable/Drawable;
(( android.support.v7.view.menu.ListMenuItemView ) p0 ).setIcon ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/view/menu/ListMenuItemView;->setIcon(Landroid/graphics/drawable/Drawable;)V
v0 = (( hb ) p1 ).isEnabled ( ); // invoke-virtual {p1}, Lhb;->isEnabled()Z
(( android.support.v7.view.menu.ListMenuItemView ) p0 ).setEnabled ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/view/menu/ListMenuItemView;->setEnabled(Z)V
v0 = (( hb ) p1 ).hasSubMenu ( ); // invoke-virtual {p1}, Lhb;->hasSubMenu()Z
/* invoke-direct {p0, v0}, Landroid/support/v7/view/menu/ListMenuItemView;->setSubMenuArrowVisible(Z)V */
(( hb ) p1 ).getContentDescription ( ); // invoke-virtual {p1}, Lhb;->getContentDescription()Ljava/lang/CharSequence;
(( android.support.v7.view.menu.ListMenuItemView ) p0 ).setContentDescription ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/view/menu/ListMenuItemView;->setContentDescription(Ljava/lang/CharSequence;)V
return;
} // .end method
public final Boolean a ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void adjustListItemSelectionBounds ( android.graphics.Rect p0 ) {
/* .locals 4 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( android.widget.ImageView ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I
/* if-nez v0, :cond_0 */
v0 = this.c;
(( android.widget.ImageView ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/widget/LinearLayout$LayoutParams; */
/* iget v1, p1, Landroid/graphics/Rect;->top:I */
v2 = this.c;
v2 = (( android.widget.ImageView ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/widget/ImageView;->getHeight()I
/* iget v3, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v2, v3 */
/* iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v2, v0 */
/* add-int/2addr v1, v2 */
/* iput v1, p1, Landroid/graphics/Rect;->top:I */
} // :cond_0
return;
} // .end method
public hb getItemData ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
protected void onFinishInflate ( ) {
/* .locals 3 */
/* invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V */
v0 = this.a;
em .a ( p0,v0 );
(( android.support.v7.view.menu.ListMenuItemView ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/view/menu/ListMenuItemView;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/TextView; */
this.a = v0;
/* iget v0, p0, Landroid/support/v7/view/menu/ListMenuItemView;->a:I */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
v1 = this.a;
v2 = this.a;
(( android.widget.TextView ) v1 ).setTextAppearance ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
} // :cond_0
(( android.support.v7.view.menu.ListMenuItemView ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/view/menu/ListMenuItemView;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/TextView; */
this.b = v0;
(( android.support.v7.view.menu.ListMenuItemView ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/view/menu/ListMenuItemView;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/ImageView; */
this.b = v0;
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
v1 = this.b;
(( android.widget.ImageView ) v0 ).setImageDrawable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
} // :cond_1
(( android.support.v7.view.menu.ListMenuItemView ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/view/menu/ListMenuItemView;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/ImageView; */
this.c = v0;
(( android.support.v7.view.menu.ListMenuItemView ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/view/menu/ListMenuItemView;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/LinearLayout; */
this.a = v0;
return;
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 3 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Landroid/support/v7/view/menu/ListMenuItemView;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.support.v7.view.menu.ListMenuItemView ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/support/v7/view/menu/ListMenuItemView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
v1 = this.a;
(( android.widget.ImageView ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/widget/LinearLayout$LayoutParams; */
/* iget v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I */
/* if-lez v2, :cond_0 */
/* iget v2, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I */
/* if-gtz v2, :cond_0 */
/* iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I */
/* iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I */
} // :cond_0
/* invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V */
return;
} // .end method
public void setCheckable ( Boolean p0 ) {
/* .locals 3 */
/* if-nez p1, :cond_0 */
v0 = this.a;
/* if-nez v0, :cond_0 */
v0 = this.a;
/* if-nez v0, :cond_0 */
return;
} // :cond_0
v0 = this.a;
v0 = (( hb ) v0 ).c ( ); // invoke-virtual {v0}, Lhb;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.a;
/* if-nez v0, :cond_1 */
/* invoke-direct {p0}, Landroid/support/v7/view/menu/ListMenuItemView;->a()V */
} // :cond_1
v0 = this.a;
v1 = this.a;
} // :cond_2
v0 = this.a;
/* if-nez v0, :cond_3 */
/* invoke-direct {p0}, Landroid/support/v7/view/menu/ListMenuItemView;->b()V */
} // :cond_3
v0 = this.a;
v1 = this.a;
} // :goto_0
/* const/16 v2, 0x8 */
if ( p1 != null) { // if-eqz p1, :cond_5
p1 = this.a;
p1 = (( hb ) p1 ).isChecked ( ); // invoke-virtual {p1}, Lhb;->isChecked()Z
(( android.widget.CompoundButton ) v0 ).setChecked ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V
p1 = (( android.widget.CompoundButton ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/widget/CompoundButton;->getVisibility()I
if ( p1 != null) { // if-eqz p1, :cond_4
int p1 = 0; // const/4 p1, 0x0
(( android.widget.CompoundButton ) v0 ).setVisibility ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setVisibility(I)V
} // :cond_4
if ( v1 != null) { // if-eqz v1, :cond_7
p1 = (( android.widget.CompoundButton ) v1 ).getVisibility ( ); // invoke-virtual {v1}, Landroid/widget/CompoundButton;->getVisibility()I
/* if-eq p1, v2, :cond_7 */
(( android.widget.CompoundButton ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setVisibility(I)V
return;
} // :cond_5
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_6
(( android.widget.CheckBox ) p1 ).setVisibility ( v2 ); // invoke-virtual {p1, v2}, Landroid/widget/CheckBox;->setVisibility(I)V
} // :cond_6
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_7
(( android.widget.RadioButton ) p1 ).setVisibility ( v2 ); // invoke-virtual {p1, v2}, Landroid/widget/RadioButton;->setVisibility(I)V
} // :cond_7
return;
} // .end method
public void setChecked ( Boolean p0 ) {
/* .locals 1 */
v0 = this.a;
v0 = (( hb ) v0 ).c ( ); // invoke-virtual {v0}, Lhb;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
/* if-nez v0, :cond_0 */
/* invoke-direct {p0}, Landroid/support/v7/view/menu/ListMenuItemView;->a()V */
} // :cond_0
v0 = this.a;
} // :cond_1
v0 = this.a;
/* if-nez v0, :cond_2 */
/* invoke-direct {p0}, Landroid/support/v7/view/menu/ListMenuItemView;->b()V */
} // :cond_2
v0 = this.a;
} // :goto_0
(( android.widget.CompoundButton ) v0 ).setChecked ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V
return;
} // .end method
public void setForceShowIcon ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Landroid/support/v7/view/menu/ListMenuItemView;->c:Z */
/* iput-boolean p1, p0, Landroid/support/v7/view/menu/ListMenuItemView;->a:Z */
return;
} // .end method
public void setGroupDividerEnabled ( Boolean p0 ) {
/* .locals 2 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget-boolean v1, p0, Landroid/support/v7/view/menu/ListMenuItemView;->b:Z */
/* if-nez v1, :cond_0 */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
/* const/16 p1, 0x8 */
} // :goto_0
(( android.widget.ImageView ) v0 ).setVisibility ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V
} // :cond_1
return;
} // .end method
public void setIcon ( android.graphics.drawable.Drawable p0 ) {
/* .locals 4 */
v0 = this.a;
v0 = this.a;
/* iget-boolean v0, v0, Lgz;->a:Z */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_1 */
/* iget-boolean v0, p0, Landroid/support/v7/view/menu/ListMenuItemView;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
/* if-nez v0, :cond_2 */
/* iget-boolean v2, p0, Landroid/support/v7/view/menu/ListMenuItemView;->a:Z */
/* if-nez v2, :cond_2 */
return;
} // :cond_2
v2 = this.a;
/* if-nez v2, :cond_3 */
/* if-nez p1, :cond_3 */
/* iget-boolean v2, p0, Landroid/support/v7/view/menu/ListMenuItemView;->a:Z */
/* if-nez v2, :cond_3 */
return;
} // :cond_3
v2 = this.a;
/* if-nez v2, :cond_4 */
/* invoke-direct {p0}, Landroid/support/v7/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater; */
(( android.view.LayoutInflater ) v2 ).inflate ( v3, p0, v1 ); // invoke-virtual {v2, v3, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
/* check-cast v2, Landroid/widget/ImageView; */
this.a = v2;
v2 = this.a;
/* invoke-direct {p0, v2, v1}, Landroid/support/v7/view/menu/ListMenuItemView;->a(Landroid/view/View;I)V */
} // :cond_4
/* if-nez p1, :cond_6 */
/* iget-boolean v2, p0, Landroid/support/v7/view/menu/ListMenuItemView;->a:Z */
if ( v2 != null) { // if-eqz v2, :cond_5
} // :cond_5
p1 = this.a;
/* const/16 v0, 0x8 */
(( android.widget.ImageView ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V
} // :cond_6
} // :goto_2
v2 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_7
} // :cond_7
int p1 = 0; // const/4 p1, 0x0
} // :goto_3
(( android.widget.ImageView ) v2 ).setImageDrawable ( p1 ); // invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
p1 = this.a;
p1 = (( android.widget.ImageView ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/widget/ImageView;->getVisibility()I
if ( p1 != null) { // if-eqz p1, :cond_8
p1 = this.a;
(( android.widget.ImageView ) p1 ).setVisibility ( v1 ); // invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V
} // :cond_8
} // :goto_4
return;
} // .end method
public void setShortcut ( Boolean p0, Object p1 ) {
/* .locals 7 */
/* const/16 p2, 0x8 */
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = this.a;
p1 = (( hb ) p1 ).b ( ); // invoke-virtual {p1}, Lhb;->b()Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
/* const/16 p1, 0x8 */
} // :goto_0
/* if-nez p1, :cond_7 */
v0 = this.b;
v1 = this.a;
v2 = (( hb ) v1 ).a ( ); // invoke-virtual {v1}, Lhb;->a()C
/* if-nez v2, :cond_1 */
final String p2 = ""; // const-string p2, ""
/* goto/16 :goto_4 */
} // :cond_1
v3 = this.a;
v3 = this.a;
(( android.content.Context ) v3 ).getResources ( ); // invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
v5 = this.a;
v5 = this.a;
android.view.ViewConfiguration .get ( v5 );
v5 = (( android.view.ViewConfiguration ) v5 ).hasPermanentMenuKey ( ); // invoke-virtual {v5}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z
if ( v5 != null) { // if-eqz v5, :cond_2
(( android.content.res.Resources ) v3 ).getString ( v5 ); // invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_2
v5 = this.a;
v5 = (( gz ) v5 ).b ( ); // invoke-virtual {v5}, Lgz;->b()Z
if ( v5 != null) { // if-eqz v5, :cond_3
/* iget v1, v1, Lhb;->c:I */
} // :cond_3
/* iget v1, v1, Lhb;->b:I */
} // :goto_1
/* const/high16 v5, 0x10000 */
(( android.content.res.Resources ) v3 ).getString ( v6 ); // invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
hb .a ( v4,v1,v5,v6 );
/* const/16 v5, 0x1000 */
(( android.content.res.Resources ) v3 ).getString ( v6 ); // invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
hb .a ( v4,v1,v5,v6 );
int v5 = 2; // const/4 v5, 0x2
(( android.content.res.Resources ) v3 ).getString ( v6 ); // invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
hb .a ( v4,v1,v5,v6 );
int v5 = 1; // const/4 v5, 0x1
(( android.content.res.Resources ) v3 ).getString ( v6 ); // invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
hb .a ( v4,v1,v5,v6 );
int v5 = 4; // const/4 v5, 0x4
(( android.content.res.Resources ) v3 ).getString ( v6 ); // invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
hb .a ( v4,v1,v5,v6 );
(( android.content.res.Resources ) v3 ).getString ( v5 ); // invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
hb .a ( v4,v1,p2,v5 );
/* if-eq v2, p2, :cond_6 */
/* const/16 p2, 0xa */
/* if-eq v2, p2, :cond_5 */
/* const/16 p2, 0x20 */
/* if-eq v2, p2, :cond_4 */
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
} // :cond_4
} // :cond_5
} // :cond_6
} // :goto_2
(( android.content.res.Resources ) v3 ).getString ( p2 ); // invoke-virtual {v3, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v4 ).append ( p2 ); // invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :goto_3
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_4
(( android.widget.TextView ) v0 ).setText ( p2 ); // invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
} // :cond_7
p2 = this.b;
p2 = (( android.widget.TextView ) p2 ).getVisibility ( ); // invoke-virtual {p2}, Landroid/widget/TextView;->getVisibility()I
/* if-eq p2, p1, :cond_8 */
p2 = this.b;
(( android.widget.TextView ) p2 ).setVisibility ( p1 ); // invoke-virtual {p2, p1}, Landroid/widget/TextView;->setVisibility(I)V
} // :cond_8
return;
} // .end method
public void setTitle ( java.lang.CharSequence p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = this.a;
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
p1 = this.a;
p1 = (( android.widget.TextView ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->getVisibility()I
if ( p1 != null) { // if-eqz p1, :cond_1
p1 = this.a;
int v0 = 0; // const/4 v0, 0x0
(( android.widget.TextView ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V
return;
} // :cond_0
p1 = this.a;
p1 = (( android.widget.TextView ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->getVisibility()I
/* const/16 v0, 0x8 */
/* if-eq p1, v0, :cond_1 */
p1 = this.a;
(( android.widget.TextView ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V
} // :cond_1
return;
} // .end method
