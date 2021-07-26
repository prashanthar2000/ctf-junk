public class android.support.v7.widget.ListPopupWindow implements hk {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/v7/widget/ListPopupWindow$c;, */
	 /* Landroid/support/v7/widget/ListPopupWindow$d;, */
	 /* Landroid/support/v7/widget/ListPopupWindow$e;, */
	 /* Landroid/support/v7/widget/ListPopupWindow$a;, */
	 /* Landroid/support/v7/widget/ListPopupWindow$b; */
	 /* } */
} // .end annotation
/* # static fields */
private static java.lang.reflect.Method a;
private static java.lang.reflect.Method b;
private static java.lang.reflect.Method c;
/* # instance fields */
Integer a;
private android.content.Context a;
private android.database.DataSetObserver a;
private final android.graphics.Rect a;
private android.graphics.drawable.Drawable a;
final android.os.Handler a;
private final android.support.v7.widget.ListPopupWindow$a a;
private final android.support.v7.widget.ListPopupWindow$c a;
private final android.support.v7.widget.ListPopupWindow$d a;
final android.support.v7.widget.ListPopupWindow$e a;
public android.view.View a;
public android.widget.AdapterView$OnItemClickListener a;
private android.widget.AdapterView$OnItemSelectedListener a;
private android.widget.ListAdapter a;
public android.widget.PopupWindow a;
public ie a;
private java.lang.Runnable a;
public Boolean a;
public Integer b;
public android.graphics.Rect b;
private android.view.View b;
private Boolean b;
public Integer c;
private Boolean c;
Integer d;
private Boolean d;
Integer e;
private Boolean e;
private Integer f;
private Boolean f;
private Integer g;
private Boolean g;
private Integer h;
/* # direct methods */
static android.support.v7.widget.ListPopupWindow ( ) {
	 /* .locals 7 */
	 int v0 = 0; // const/4 v0, 0x0
	 int v1 = 1; // const/4 v1, 0x1
	 try { // :try_start_0
		 /* const-class v2, Landroid/widget/PopupWindow; */
		 final String v3 = "setClipToScreenEnabled"; // const-string v3, "setClipToScreenEnabled"
		 /* new-array v4, v1, [Ljava/lang/Class; */
		 v5 = java.lang.Boolean.TYPE;
		 /* aput-object v5, v4, v0 */
		 (( java.lang.Class ) v2 ).getDeclaredMethod ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 final String v2 = "ListPopupWindow"; // const-string v2, "ListPopupWindow"
		 final String v3 = "Could not find method setClipToScreenEnabled() on PopupWindow.Oh well."; // const-string v3, "Could not find method setClipToScreenEnabled() on PopupWindow.Oh well."
		 android.util.Log .i ( v2,v3 );
	 } // :goto_0
	 try { // :try_start_1
		 /* const-class v2, Landroid/widget/PopupWindow; */
		 final String v3 = "getMaxAvailableHeight"; // const-string v3, "getMaxAvailableHeight"
		 int v4 = 3; // const/4 v4, 0x3
		 /* new-array v4, v4, [Ljava/lang/Class; */
		 /* const-class v5, Landroid/view/View; */
		 /* aput-object v5, v4, v0 */
		 v5 = java.lang.Integer.TYPE;
		 /* aput-object v5, v4, v1 */
		 int v5 = 2; // const/4 v5, 0x2
		 v6 = java.lang.Boolean.TYPE;
		 /* aput-object v6, v4, v5 */
		 (( java.lang.Class ) v2 ).getDeclaredMethod ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 /* :try_end_1 */
		 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_1 ..:try_end_1} :catch_1 */
		 /* :catch_1 */
		 final String v2 = "ListPopupWindow"; // const-string v2, "ListPopupWindow"
		 final String v3 = "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow.Oh well."; // const-string v3, "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow.Oh well."
		 android.util.Log .i ( v2,v3 );
	 } // :goto_1
	 try { // :try_start_2
		 /* const-class v2, Landroid/widget/PopupWindow; */
		 final String v3 = "setEpicenterBounds"; // const-string v3, "setEpicenterBounds"
		 /* new-array v1, v1, [Ljava/lang/Class; */
		 /* const-class v4, Landroid/graphics/Rect; */
		 /* aput-object v4, v1, v0 */
		 (( java.lang.Class ) v2 ).getDeclaredMethod ( v3, v1 ); // invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 /* :try_end_2 */
		 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_2 ..:try_end_2} :catch_2 */
		 return;
		 /* :catch_2 */
		 final String v0 = "ListPopupWindow"; // const-string v0, "ListPopupWindow"
		 final String v1 = "Could not find method setEpicenterBounds(Rect) on PopupWindow.Oh well."; // const-string v1, "Could not find method setEpicenterBounds(Rect) on PopupWindow.Oh well."
		 android.util.Log .i ( v0,v1 );
		 return;
	 } // .end method
	 public android.support.v7.widget.ListPopupWindow ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0, p1, v1, v0}, Landroid/support/v7/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.ListPopupWindow ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.ListPopupWindow ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, p2, p3, v0}, Landroid/support/v7/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
		 return;
	 } // .end method
	 public android.support.v7.widget.ListPopupWindow ( ) {
		 /* .locals 4 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = -2; // const/4 v0, -0x2
		 /* iput v0, p0, Landroid/support/v7/widget/ListPopupWindow;->f:I */
		 /* iput v0, p0, Landroid/support/v7/widget/ListPopupWindow;->a:I */
		 /* const/16 v0, 0x3ea */
		 /* iput v0, p0, Landroid/support/v7/widget/ListPopupWindow;->h:I */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Landroid/support/v7/widget/ListPopupWindow;->c:Z */
		 int v1 = 0; // const/4 v1, 0x0
		 /* iput v1, p0, Landroid/support/v7/widget/ListPopupWindow;->c:I */
		 /* iput-boolean v1, p0, Landroid/support/v7/widget/ListPopupWindow;->f:Z */
		 /* iput-boolean v1, p0, Landroid/support/v7/widget/ListPopupWindow;->g:Z */
		 /* const v2, 0x7fffffff */
		 /* iput v2, p0, Landroid/support/v7/widget/ListPopupWindow;->d:I */
		 /* iput v1, p0, Landroid/support/v7/widget/ListPopupWindow;->e:I */
		 /* new-instance v2, Landroid/support/v7/widget/ListPopupWindow$e; */
		 /* invoke-direct {v2, p0}, Landroid/support/v7/widget/ListPopupWindow$e;-><init>(Landroid/support/v7/widget/ListPopupWindow;)V */
		 this.a = v2;
		 /* new-instance v2, Landroid/support/v7/widget/ListPopupWindow$d; */
		 /* invoke-direct {v2, p0}, Landroid/support/v7/widget/ListPopupWindow$d;-><init>(Landroid/support/v7/widget/ListPopupWindow;)V */
		 this.a = v2;
		 /* new-instance v2, Landroid/support/v7/widget/ListPopupWindow$c; */
		 /* invoke-direct {v2, p0}, Landroid/support/v7/widget/ListPopupWindow$c;-><init>(Landroid/support/v7/widget/ListPopupWindow;)V */
		 this.a = v2;
		 /* new-instance v2, Landroid/support/v7/widget/ListPopupWindow$a; */
		 /* invoke-direct {v2, p0}, Landroid/support/v7/widget/ListPopupWindow$a;-><init>(Landroid/support/v7/widget/ListPopupWindow;)V */
		 this.a = v2;
		 /* new-instance v2, Landroid/graphics/Rect; */
		 /* invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V */
		 this.a = v2;
		 this.a = p1;
		 /* new-instance v2, Landroid/os/Handler; */
		 (( android.content.Context ) p1 ).getMainLooper ( ); // invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
		 /* invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
		 this.a = v2;
		 v2 = gc$j.ListPopupWindow;
		 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v2, p3, p4 ); // invoke-virtual {p1, p2, v2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
		 v3 = 		 (( android.content.res.TypedArray ) v2 ).getDimensionPixelOffset ( v3, v1 ); // invoke-virtual {v2, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I
		 /* iput v3, p0, Landroid/support/v7/widget/ListPopupWindow;->b:I */
		 v1 = 		 (( android.content.res.TypedArray ) v2 ).getDimensionPixelOffset ( v3, v1 ); // invoke-virtual {v2, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I
		 /* iput v1, p0, Landroid/support/v7/widget/ListPopupWindow;->g:I */
		 /* iget v1, p0, Landroid/support/v7/widget/ListPopupWindow;->g:I */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* iput-boolean v0, p0, Landroid/support/v7/widget/ListPopupWindow;->b:Z */
		 } // :cond_0
		 (( android.content.res.TypedArray ) v2 ).recycle ( ); // invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V
		 /* new-instance v1, Landroid/support/v7/widget/AppCompatPopupWindow; */
		 /* invoke-direct {v1, p1, p2, p3, p4}, Landroid/support/v7/widget/AppCompatPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
		 this.a = v1;
		 p1 = this.a;
		 (( android.widget.PopupWindow ) p1 ).setInputMethodMode ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V
		 return;
	 } // .end method
	 private Integer a ( android.view.View p0, Integer p1, Boolean p2 ) {
		 /* .locals 5 */
		 v0 = android.support.v7.widget.ListPopupWindow.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 try { // :try_start_0
				 v1 = this.a;
				 int v2 = 3; // const/4 v2, 0x3
				 /* new-array v2, v2, [Ljava/lang/Object; */
				 int v3 = 0; // const/4 v3, 0x0
				 /* aput-object p1, v2, v3 */
				 int v3 = 1; // const/4 v3, 0x1
				 java.lang.Integer .valueOf ( p2 );
				 /* aput-object v4, v2, v3 */
				 int v3 = 2; // const/4 v3, 0x2
				 java.lang.Boolean .valueOf ( p3 );
				 /* aput-object p3, v2, v3 */
				 (( java.lang.reflect.Method ) v0 ).invoke ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
				 /* check-cast p3, Ljava/lang/Integer; */
				 p1 = 				 (( java.lang.Integer ) p3 ).intValue ( ); // invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I
				 /* :try_end_0 */
				 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* :catch_0 */
				 final String p3 = "ListPopupWindow"; // const-string p3, "ListPopupWindow"
				 final String v0 = "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow.Using the public version."; // const-string v0, "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow.Using the public version."
				 android.util.Log .i ( p3,v0 );
			 } // :cond_0
			 p3 = this.a;
			 p1 = 			 (( android.widget.PopupWindow ) p3 ).getMaxAvailableHeight ( p1, p2 ); // invoke-virtual {p3, p1, p2}, Landroid/widget/PopupWindow;->getMaxAvailableHeight(Landroid/view/View;I)I
		 } // .end method
		 private void c ( ) {
			 /* .locals 2 */
			 v0 = this.b;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 (( android.view.View ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
				 /* instance-of v1, v0, Landroid/view/ViewGroup; */
				 if ( v1 != null) { // if-eqz v1, :cond_0
					 /* check-cast v0, Landroid/view/ViewGroup; */
					 v1 = this.b;
					 (( android.view.ViewGroup ) v0 ).removeView ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
				 } // :cond_0
				 return;
			 } // .end method
			 /* # virtual methods */
			 public final Integer a ( ) {
				 /* .locals 1 */
				 /* iget-boolean v0, p0, Landroid/support/v7/widget/ListPopupWindow;->b:Z */
				 /* if-nez v0, :cond_0 */
				 int v0 = 0; // const/4 v0, 0x0
			 } // :cond_0
			 /* iget v0, p0, Landroid/support/v7/widget/ListPopupWindow;->g:I */
		 } // .end method
		 public final android.widget.ListView a ( ) {
			 /* .locals 1 */
			 v0 = this.a;
		 } // .end method
		 ie a ( android.content.Context p0, Boolean p1 ) {
			 /* .locals 1 */
			 /* new-instance v0, Lie; */
			 /* invoke-direct {v0, p1, p2}, Lie;-><init>(Landroid/content/Context;Z)V */
		 } // .end method
		 public void a ( ) {
			 /* .locals 13 */
			 v0 = this.a;
			 /* const/high16 v1, -0x80000000 */
			 int v2 = 1; // const/4 v2, 0x1
			 int v3 = 0; // const/4 v3, 0x0
			 int v4 = -1; // const/4 v4, -0x1
			 /* if-nez v0, :cond_4 */
			 v0 = this.a;
			 /* new-instance v5, Landroid/support/v7/widget/ListPopupWindow$1; */
			 /* invoke-direct {v5, p0}, Landroid/support/v7/widget/ListPopupWindow$1;-><init>(Landroid/support/v7/widget/ListPopupWindow;)V */
			 this.a = v5;
			 /* iget-boolean v5, p0, Landroid/support/v7/widget/ListPopupWindow;->a:Z */
			 /* xor-int/2addr v5, v2 */
			 (( android.support.v7.widget.ListPopupWindow ) p0 ).a ( v0, v5 ); // invoke-virtual {p0, v0, v5}, Landroid/support/v7/widget/ListPopupWindow;->a(Landroid/content/Context;Z)Lie;
			 this.a = v5;
			 v5 = this.a;
			 if ( v5 != null) { // if-eqz v5, :cond_0
				 v6 = this.a;
				 (( ie ) v6 ).setSelector ( v5 ); // invoke-virtual {v6, v5}, Lie;->setSelector(Landroid/graphics/drawable/Drawable;)V
			 } // :cond_0
			 v5 = this.a;
			 v6 = this.a;
			 (( ie ) v5 ).setAdapter ( v6 ); // invoke-virtual {v5, v6}, Lie;->setAdapter(Landroid/widget/ListAdapter;)V
			 v5 = this.a;
			 v6 = this.a;
			 (( ie ) v5 ).setOnItemClickListener ( v6 ); // invoke-virtual {v5, v6}, Lie;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
			 v5 = this.a;
			 (( ie ) v5 ).setFocusable ( v2 ); // invoke-virtual {v5, v2}, Lie;->setFocusable(Z)V
			 v5 = this.a;
			 (( ie ) v5 ).setFocusableInTouchMode ( v2 ); // invoke-virtual {v5, v2}, Lie;->setFocusableInTouchMode(Z)V
			 v5 = this.a;
			 /* new-instance v6, Landroid/support/v7/widget/ListPopupWindow$2; */
			 /* invoke-direct {v6, p0}, Landroid/support/v7/widget/ListPopupWindow$2;-><init>(Landroid/support/v7/widget/ListPopupWindow;)V */
			 (( ie ) v5 ).setOnItemSelectedListener ( v6 ); // invoke-virtual {v5, v6}, Lie;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
			 v5 = this.a;
			 v6 = this.a;
			 (( ie ) v5 ).setOnScrollListener ( v6 ); // invoke-virtual {v5, v6}, Lie;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
			 v5 = this.a;
			 if ( v5 != null) { // if-eqz v5, :cond_1
				 v6 = this.a;
				 (( ie ) v6 ).setOnItemSelectedListener ( v5 ); // invoke-virtual {v6, v5}, Lie;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
			 } // :cond_1
			 v5 = this.a;
			 v6 = this.b;
			 if ( v6 != null) { // if-eqz v6, :cond_3
				 /* new-instance v7, Landroid/widget/LinearLayout; */
				 /* invoke-direct {v7, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
				 (( android.widget.LinearLayout ) v7 ).setOrientation ( v2 ); // invoke-virtual {v7, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V
				 /* new-instance v0, Landroid/widget/LinearLayout$LayoutParams; */
				 /* const/high16 v8, 0x3f800000 # 1.0f */
				 /* invoke-direct {v0, v4, v3, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V */
				 /* iget v8, p0, Landroid/support/v7/widget/ListPopupWindow;->e:I */
				 /* packed-switch v8, :pswitch_data_0 */
				 final String v0 = "ListPopupWindow"; // const-string v0, "ListPopupWindow"
				 /* new-instance v5, Ljava/lang/StringBuilder; */
				 final String v8 = "Invalid hint position "; // const-string v8, "Invalid hint position "
				 /* invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 /* iget v8, p0, Landroid/support/v7/widget/ListPopupWindow;->e:I */
				 (( java.lang.StringBuilder ) v5 ).append ( v8 ); // invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 android.util.Log .e ( v0,v5 );
				 /* :pswitch_0 */
				 (( android.widget.LinearLayout ) v7 ).addView ( v5, v0 ); // invoke-virtual {v7, v5, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
				 (( android.widget.LinearLayout ) v7 ).addView ( v6 ); // invoke-virtual {v7, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
				 /* :pswitch_1 */
				 (( android.widget.LinearLayout ) v7 ).addView ( v6 ); // invoke-virtual {v7, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
				 (( android.widget.LinearLayout ) v7 ).addView ( v5, v0 ); // invoke-virtual {v7, v5, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
			 } // :goto_0
			 /* iget v0, p0, Landroid/support/v7/widget/ListPopupWindow;->a:I */
			 /* if-ltz v0, :cond_2 */
			 /* const/high16 v5, -0x80000000 */
		 } // :cond_2
		 int v0 = 0; // const/4 v0, 0x0
		 int v5 = 0; // const/4 v5, 0x0
	 } // :goto_1
	 v0 = 	 android.view.View$MeasureSpec .makeMeasureSpec ( v0,v5 );
	 (( android.view.View ) v6 ).measure ( v0, v3 ); // invoke-virtual {v6, v0, v3}, Landroid/view/View;->measure(II)V
	 (( android.view.View ) v6 ).getLayoutParams ( ); // invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
	 /* check-cast v0, Landroid/widget/LinearLayout$LayoutParams; */
	 v5 = 	 (( android.view.View ) v6 ).getMeasuredHeight ( ); // invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I
	 /* iget v6, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I */
	 /* add-int/2addr v5, v6 */
	 /* iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I */
	 /* add-int/2addr v5, v0 */
	 /* move v0, v5 */
	 /* move-object v5, v7 */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // :goto_2
v6 = this.a;
(( android.widget.PopupWindow ) v6 ).setContentView ( v5 ); // invoke-virtual {v6, v5}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V
} // :cond_4
v0 = this.a;
(( android.widget.PopupWindow ) v0 ).getContentView ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_5
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v5, Landroid/widget/LinearLayout$LayoutParams; */
v0 = (( android.view.View ) v0 ).getMeasuredHeight ( ); // invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I
/* iget v6, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v0, v6 */
/* iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v0, v5 */
} // :cond_5
int v0 = 0; // const/4 v0, 0x0
} // :goto_3
v5 = this.a;
(( android.widget.PopupWindow ) v5 ).getBackground ( ); // invoke-virtual {v5}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;
if ( v5 != null) { // if-eqz v5, :cond_6
v6 = this.a;
(( android.graphics.drawable.Drawable ) v5 ).getPadding ( v6 ); // invoke-virtual {v5, v6}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
v5 = this.a;
/* iget v5, v5, Landroid/graphics/Rect;->top:I */
v6 = this.a;
/* iget v6, v6, Landroid/graphics/Rect;->bottom:I */
/* add-int/2addr v5, v6 */
/* iget-boolean v6, p0, Landroid/support/v7/widget/ListPopupWindow;->b:Z */
/* if-nez v6, :cond_7 */
v6 = this.a;
/* iget v6, v6, Landroid/graphics/Rect;->top:I */
/* neg-int v6, v6 */
/* iput v6, p0, Landroid/support/v7/widget/ListPopupWindow;->g:I */
} // :cond_6
v5 = this.a;
(( android.graphics.Rect ) v5 ).setEmpty ( ); // invoke-virtual {v5}, Landroid/graphics/Rect;->setEmpty()V
int v5 = 0; // const/4 v5, 0x0
} // :cond_7
} // :goto_4
v6 = this.a;
v6 = (( android.widget.PopupWindow ) v6 ).getInputMethodMode ( ); // invoke-virtual {v6}, Landroid/widget/PopupWindow;->getInputMethodMode()I
int v7 = 2; // const/4 v7, 0x2
/* if-ne v6, v7, :cond_8 */
int v6 = 1; // const/4 v6, 0x1
} // :cond_8
int v6 = 0; // const/4 v6, 0x0
} // :goto_5
v7 = this.a;
/* iget v8, p0, Landroid/support/v7/widget/ListPopupWindow;->g:I */
v6 = /* invoke-direct {p0, v7, v8, v6}, Landroid/support/v7/widget/ListPopupWindow;->a(Landroid/view/View;IZ)I */
/* iget-boolean v7, p0, Landroid/support/v7/widget/ListPopupWindow;->f:Z */
/* if-nez v7, :cond_b */
/* iget v7, p0, Landroid/support/v7/widget/ListPopupWindow;->f:I */
/* if-ne v7, v4, :cond_9 */
} // :cond_9
/* iget v7, p0, Landroid/support/v7/widget/ListPopupWindow;->a:I */
/* const/high16 v8, 0x40000000 # 2.0f */
/* packed-switch v7, :pswitch_data_1 */
v1 = android.view.View$MeasureSpec .makeMeasureSpec ( v7,v8 );
} // :goto_6
/* move v8, v1 */
/* :pswitch_2 */
v1 = this.a;
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getDisplayMetrics ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I */
v7 = this.a;
/* iget v7, v7, Landroid/graphics/Rect;->left:I */
v9 = this.a;
/* iget v9, v9, Landroid/graphics/Rect;->right:I */
/* add-int/2addr v7, v9 */
/* sub-int/2addr v1, v7 */
v1 = android.view.View$MeasureSpec .makeMeasureSpec ( v1,v8 );
/* :pswitch_3 */
v7 = this.a;
(( android.content.Context ) v7 ).getResources ( ); // invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v7 ).getDisplayMetrics ( ); // invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget v7, v7, Landroid/util/DisplayMetrics;->widthPixels:I */
v8 = this.a;
/* iget v8, v8, Landroid/graphics/Rect;->left:I */
v9 = this.a;
/* iget v9, v9, Landroid/graphics/Rect;->right:I */
/* add-int/2addr v8, v9 */
/* sub-int/2addr v7, v8 */
v1 = android.view.View$MeasureSpec .makeMeasureSpec ( v7,v1 );
} // :goto_7
v7 = this.a;
int v9 = 0; // const/4 v9, 0x0
int v10 = -1; // const/4 v10, -0x1
/* sub-int v11, v6, v0 */
int v12 = -1; // const/4 v12, -0x1
v1 = /* invoke-virtual/range {v7 ..v12}, Lie;->a(IIIII)I */
/* if-lez v1, :cond_a */
v6 = this.a;
v6 = (( ie ) v6 ).getPaddingTop ( ); // invoke-virtual {v6}, Lie;->getPaddingTop()I
v7 = this.a;
v7 = (( ie ) v7 ).getPaddingBottom ( ); // invoke-virtual {v7}, Lie;->getPaddingBottom()I
/* add-int/2addr v6, v7 */
/* add-int/2addr v5, v6 */
/* add-int/2addr v0, v5 */
} // :cond_a
/* add-int/2addr v1, v0 */
} // :cond_b
} // :goto_8
/* add-int/2addr v6, v5 */
/* move v1, v6 */
} // :goto_9
v0 = (( android.support.v7.widget.ListPopupWindow ) p0 ).a ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ListPopupWindow;->a()Z
v5 = this.a;
/* iget v6, p0, Landroid/support/v7/widget/ListPopupWindow;->h:I */
fl .a ( v5,v6 );
v5 = this.a;
v5 = (( android.widget.PopupWindow ) v5 ).isShowing ( ); // invoke-virtual {v5}, Landroid/widget/PopupWindow;->isShowing()Z
int v6 = -2; // const/4 v6, -0x2
if ( v5 != null) { // if-eqz v5, :cond_18
v5 = this.a;
v5 = em .e ( v5 );
/* if-nez v5, :cond_c */
return;
} // :cond_c
/* iget v5, p0, Landroid/support/v7/widget/ListPopupWindow;->a:I */
/* if-ne v5, v4, :cond_d */
int v5 = -1; // const/4 v5, -0x1
} // :cond_d
/* if-ne v5, v6, :cond_e */
v5 = this.a;
v5 = (( android.view.View ) v5 ).getWidth ( ); // invoke-virtual {v5}, Landroid/view/View;->getWidth()I
} // :cond_e
} // :goto_a
/* iget v7, p0, Landroid/support/v7/widget/ListPopupWindow;->f:I */
/* if-ne v7, v4, :cond_13 */
if ( v0 != null) { // if-eqz v0, :cond_f
} // :cond_f
int v1 = -1; // const/4 v1, -0x1
} // :goto_b
if ( v0 != null) { // if-eqz v0, :cond_11
v0 = this.a;
/* iget v6, p0, Landroid/support/v7/widget/ListPopupWindow;->a:I */
/* if-ne v6, v4, :cond_10 */
int v6 = -1; // const/4 v6, -0x1
} // :cond_10
int v6 = 0; // const/4 v6, 0x0
} // :goto_c
(( android.widget.PopupWindow ) v0 ).setWidth ( v6 ); // invoke-virtual {v0, v6}, Landroid/widget/PopupWindow;->setWidth(I)V
v0 = this.a;
(( android.widget.PopupWindow ) v0 ).setHeight ( v3 ); // invoke-virtual {v0, v3}, Landroid/widget/PopupWindow;->setHeight(I)V
} // :cond_11
v0 = this.a;
/* iget v6, p0, Landroid/support/v7/widget/ListPopupWindow;->a:I */
/* if-ne v6, v4, :cond_12 */
int v6 = -1; // const/4 v6, -0x1
} // :cond_12
int v6 = 0; // const/4 v6, 0x0
} // :goto_d
(( android.widget.PopupWindow ) v0 ).setWidth ( v6 ); // invoke-virtual {v0, v6}, Landroid/widget/PopupWindow;->setWidth(I)V
v0 = this.a;
(( android.widget.PopupWindow ) v0 ).setHeight ( v4 ); // invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setHeight(I)V
} // :cond_13
/* if-eq v7, v6, :cond_14 */
/* move v1, v7 */
} // :cond_14
} // :goto_e
v0 = this.a;
/* iget-boolean v6, p0, Landroid/support/v7/widget/ListPopupWindow;->g:Z */
/* if-nez v6, :cond_15 */
/* iget-boolean v6, p0, Landroid/support/v7/widget/ListPopupWindow;->f:Z */
/* if-nez v6, :cond_15 */
} // :cond_15
int v2 = 0; // const/4 v2, 0x0
} // :goto_f
(( android.widget.PopupWindow ) v0 ).setOutsideTouchable ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V
v6 = this.a;
v7 = this.a;
/* iget v8, p0, Landroid/support/v7/widget/ListPopupWindow;->b:I */
/* iget v9, p0, Landroid/support/v7/widget/ListPopupWindow;->g:I */
/* if-gez v5, :cond_16 */
int v10 = -1; // const/4 v10, -0x1
} // :cond_16
/* move v10, v5 */
} // :goto_10
/* if-gez v1, :cond_17 */
int v11 = -1; // const/4 v11, -0x1
} // :cond_17
/* move v11, v1 */
} // :goto_11
/* invoke-virtual/range {v6 ..v11}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V */
return;
} // :cond_18
/* iget v0, p0, Landroid/support/v7/widget/ListPopupWindow;->a:I */
/* if-ne v0, v4, :cond_19 */
int v0 = -1; // const/4 v0, -0x1
} // :cond_19
/* if-ne v0, v6, :cond_1a */
v0 = this.a;
v0 = (( android.view.View ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/view/View;->getWidth()I
} // :cond_1a
} // :goto_12
/* iget v5, p0, Landroid/support/v7/widget/ListPopupWindow;->f:I */
/* if-ne v5, v4, :cond_1b */
int v1 = -1; // const/4 v1, -0x1
} // :cond_1b
/* if-eq v5, v6, :cond_1c */
/* move v1, v5 */
} // :cond_1c
} // :goto_13
v5 = this.a;
(( android.widget.PopupWindow ) v5 ).setWidth ( v0 ); // invoke-virtual {v5, v0}, Landroid/widget/PopupWindow;->setWidth(I)V
v0 = this.a;
(( android.widget.PopupWindow ) v0 ).setHeight ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setHeight(I)V
v0 = android.support.v7.widget.ListPopupWindow.a;
if ( v0 != null) { // if-eqz v0, :cond_1d
try { // :try_start_0
v1 = this.a;
/* new-array v5, v2, [Ljava/lang/Object; */
v6 = java.lang.Boolean.TRUE;
/* aput-object v6, v5, v3 */
(( java.lang.reflect.Method ) v0 ).invoke ( v1, v5 ); // invoke-virtual {v0, v1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
final String v0 = "ListPopupWindow"; // const-string v0, "ListPopupWindow"
final String v1 = "Could not call setClipToScreenEnabled() on PopupWindow.Oh well."; // const-string v1, "Could not call setClipToScreenEnabled() on PopupWindow.Oh well."
android.util.Log .i ( v0,v1 );
} // :cond_1d
} // :goto_14
v0 = this.a;
/* iget-boolean v1, p0, Landroid/support/v7/widget/ListPopupWindow;->g:Z */
/* if-nez v1, :cond_1e */
/* iget-boolean v1, p0, Landroid/support/v7/widget/ListPopupWindow;->f:Z */
/* if-nez v1, :cond_1e */
int v1 = 1; // const/4 v1, 0x1
} // :cond_1e
int v1 = 0; // const/4 v1, 0x0
} // :goto_15
(( android.widget.PopupWindow ) v0 ).setOutsideTouchable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V
v0 = this.a;
v1 = this.a;
(( android.widget.PopupWindow ) v0 ).setTouchInterceptor ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V
/* iget-boolean v0, p0, Landroid/support/v7/widget/ListPopupWindow;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_1f
v0 = this.a;
/* iget-boolean v1, p0, Landroid/support/v7/widget/ListPopupWindow;->d:Z */
fl .a ( v0,v1 );
} // :cond_1f
v0 = android.support.v7.widget.ListPopupWindow.c;
if ( v0 != null) { // if-eqz v0, :cond_20
try { // :try_start_1
v1 = this.a;
/* new-array v2, v2, [Ljava/lang/Object; */
v5 = this.b;
/* aput-object v5, v2, v3 */
(( java.lang.reflect.Method ) v0 ).invoke ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception v0 */
final String v1 = "ListPopupWindow"; // const-string v1, "ListPopupWindow"
final String v2 = "Could not invoke setEpicenterBounds on PopupWindow"; // const-string v2, "Could not invoke setEpicenterBounds on PopupWindow"
android.util.Log .e ( v1,v2,v0 );
} // :cond_20
} // :goto_16
v0 = this.a;
v1 = this.a;
/* iget v2, p0, Landroid/support/v7/widget/ListPopupWindow;->b:I */
/* iget v3, p0, Landroid/support/v7/widget/ListPopupWindow;->g:I */
/* iget v5, p0, Landroid/support/v7/widget/ListPopupWindow;->c:I */
/* const/16 v7, 0x13 */
/* if-lt v6, v7, :cond_21 */
(( android.widget.PopupWindow ) v0 ).showAsDropDown ( v1, v2, v3, v5 ); // invoke-virtual {v0, v1, v2, v3, v5}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V
} // :cond_21
v6 = em .b ( v1 );
v5 = dz .a ( v5,v6 );
/* and-int/lit8 v5, v5, 0x7 */
int v6 = 5; // const/4 v6, 0x5
/* if-ne v5, v6, :cond_22 */
v5 = (( android.widget.PopupWindow ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->getWidth()I
v6 = (( android.view.View ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/view/View;->getWidth()I
/* sub-int/2addr v5, v6 */
/* sub-int/2addr v2, v5 */
} // :cond_22
(( android.widget.PopupWindow ) v0 ).showAsDropDown ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V
} // :goto_17
v0 = this.a;
(( ie ) v0 ).setSelection ( v4 ); // invoke-virtual {v0, v4}, Lie;->setSelection(I)V
/* iget-boolean v0, p0, Landroid/support/v7/widget/ListPopupWindow;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_23
v0 = this.a;
v0 = (( ie ) v0 ).isInTouchMode ( ); // invoke-virtual {v0}, Lie;->isInTouchMode()Z
if ( v0 != null) { // if-eqz v0, :cond_24
} // :cond_23
(( android.support.v7.widget.ListPopupWindow ) p0 ).f ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/ListPopupWindow;->f()V
} // :cond_24
/* iget-boolean v0, p0, Landroid/support/v7/widget/ListPopupWindow;->a:Z */
/* if-nez v0, :cond_25 */
v0 = this.a;
v1 = this.a;
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
} // :cond_25
return;
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
/* :pswitch_data_1 */
/* .packed-switch -0x2 */
/* :pswitch_3 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public final void a ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Landroid/support/v7/widget/ListPopupWindow;->g:I */
int p1 = 1; // const/4 p1, 0x1
/* iput-boolean p1, p0, Landroid/support/v7/widget/ListPopupWindow;->b:Z */
return;
} // .end method
public final void a ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
v0 = this.a;
(( android.widget.PopupWindow ) v0 ).setBackgroundDrawable ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void a ( android.widget.ListAdapter p0 ) {
/* .locals 2 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/support/v7/widget/ListPopupWindow$b; */
/* invoke-direct {v0, p0}, Landroid/support/v7/widget/ListPopupWindow$b;-><init>(Landroid/support/v7/widget/ListPopupWindow;)V */
this.a = v0;
} // :cond_0
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_1
} // :cond_1
} // :goto_0
this.a = p1;
if ( p1 != null) { // if-eqz p1, :cond_2
v0 = this.a;
} // :cond_2
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_3
v0 = this.a;
(( ie ) p1 ).setAdapter ( v0 ); // invoke-virtual {p1, v0}, Lie;->setAdapter(Landroid/widget/ListAdapter;)V
} // :cond_3
return;
} // .end method
public final void a ( android.widget.PopupWindow$OnDismissListener p0 ) {
/* .locals 1 */
v0 = this.a;
(( android.widget.PopupWindow ) v0 ).setOnDismissListener ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V
return;
} // .end method
public final Boolean a ( ) {
/* .locals 2 */
v0 = this.a;
v0 = (( android.widget.PopupWindow ) v0 ).getInputMethodMode ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->getInputMethodMode()I
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final void b ( ) {
/* .locals 2 */
v0 = this.a;
(( android.widget.PopupWindow ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
/* invoke-direct {p0}, Landroid/support/v7/widget/ListPopupWindow;->c()V */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( android.widget.PopupWindow ) v0 ).setContentView ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V
this.a = v1;
v0 = this.a;
v1 = this.a;
(( android.os.Handler ) v0 ).removeCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
return;
} // .end method
public final void b ( Integer p0 ) {
/* .locals 2 */
v0 = this.a;
(( android.widget.PopupWindow ) v0 ).getBackground ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = this.a;
(( android.graphics.drawable.Drawable ) v0 ).getPadding ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
v0 = this.a;
/* iget v0, v0, Landroid/graphics/Rect;->left:I */
v1 = this.a;
/* iget v1, v1, Landroid/graphics/Rect;->right:I */
/* add-int/2addr v0, v1 */
/* add-int/2addr v0, p1 */
/* iput v0, p0, Landroid/support/v7/widget/ListPopupWindow;->a:I */
return;
} // :cond_0
/* iput p1, p0, Landroid/support/v7/widget/ListPopupWindow;->a:I */
return;
} // .end method
public final Boolean b ( ) {
/* .locals 1 */
v0 = this.a;
v0 = (( android.widget.PopupWindow ) v0 ).isShowing ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z
} // .end method
public final void d ( ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Landroid/support/v7/widget/ListPopupWindow;->a:Z */
v1 = this.a;
(( android.widget.PopupWindow ) v1 ).setFocusable ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setFocusable(Z)V
return;
} // .end method
public final void e ( ) {
/* .locals 2 */
v0 = this.a;
int v1 = 2; // const/4 v1, 0x2
(( android.widget.PopupWindow ) v0 ).setInputMethodMode ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V
return;
} // .end method
public final void f ( ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 1; // const/4 v1, 0x1
(( ie ) v0 ).setListSelectionHidden ( v1 ); // invoke-virtual {v0, v1}, Lie;->setListSelectionHidden(Z)V
(( ie ) v0 ).requestLayout ( ); // invoke-virtual {v0}, Lie;->requestLayout()V
} // :cond_0
return;
} // .end method
public final void g ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Landroid/support/v7/widget/ListPopupWindow;->e:Z */
/* iput-boolean v0, p0, Landroid/support/v7/widget/ListPopupWindow;->d:Z */
return;
} // .end method
