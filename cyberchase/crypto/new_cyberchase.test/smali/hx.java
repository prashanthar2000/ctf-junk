public class hx {
	 /* # static fields */
	 private static final a;
	 /* # instance fields */
	 public android.graphics.Bitmap a;
	 private final android.widget.ProgressBar a;
	 /* # direct methods */
	 static hx ( ) {
		 /* .locals 1 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [I */
		 /* fill-array-data v0, :array_0 */
		 return;
		 /* nop */
		 /* :array_0 */
		 /* .array-data 4 */
		 /* 0x101013b */
		 /* 0x101013c */
	 } // .end array-data
} // .end method
public hx ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 this.a = p1;
	 return;
} // .end method
private android.graphics.drawable.Drawable a ( android.graphics.drawable.Drawable p0, Boolean p1 ) {
	 /* .locals 7 */
	 /* instance-of v0, p1, Lcz; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* move-object v0, p1 */
		 /* check-cast v0, Lcz; */
		 if ( v1 != null) { // if-eqz v1, :cond_8
			 /* invoke-direct {p0, v1, p2}, Lhx;->a(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable; */
			 /* goto/16 :goto_4 */
		 } // :cond_0
		 /* instance-of v0, p1, Landroid/graphics/drawable/LayerDrawable; */
		 int v1 = 1; // const/4 v1, 0x1
		 if ( v0 != null) { // if-eqz v0, :cond_5
			 /* check-cast p1, Landroid/graphics/drawable/LayerDrawable; */
			 p2 = 			 (( android.graphics.drawable.LayerDrawable ) p1 ).getNumberOfLayers ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I
			 /* new-array v0, p2, [Landroid/graphics/drawable/Drawable; */
			 int v2 = 0; // const/4 v2, 0x0
			 int v3 = 0; // const/4 v3, 0x0
		 } // :goto_0
		 /* if-ge v3, p2, :cond_3 */
		 v4 = 		 (( android.graphics.drawable.LayerDrawable ) p1 ).getId ( v3 ); // invoke-virtual {p1, v3}, Landroid/graphics/drawable/LayerDrawable;->getId(I)I
		 (( android.graphics.drawable.LayerDrawable ) p1 ).getDrawable ( v3 ); // invoke-virtual {p1, v3}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;
		 /* const v6, 0x102000d */
		 /* if-eq v4, v6, :cond_2 */
		 /* const v6, 0x102000f */
		 /* if-ne v4, v6, :cond_1 */
	 } // :cond_1
	 int v4 = 0; // const/4 v4, 0x0
} // :cond_2
} // :goto_1
int v4 = 1; // const/4 v4, 0x1
} // :goto_2
/* invoke-direct {p0, v5, v4}, Lhx;->a(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable; */
/* aput-object v4, v0, v3 */
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_3
/* new-instance v1, Landroid/graphics/drawable/LayerDrawable; */
/* invoke-direct {v1, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V */
} // :goto_3
/* if-ge v2, p2, :cond_4 */
v0 = (( android.graphics.drawable.LayerDrawable ) p1 ).getId ( v2 ); // invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getId(I)I
(( android.graphics.drawable.LayerDrawable ) v1 ).setId ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_4
} // :cond_5
/* instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable; */
if ( v0 != null) { // if-eqz v0, :cond_8
/* check-cast p1, Landroid/graphics/drawable/BitmapDrawable; */
(( android.graphics.drawable.BitmapDrawable ) p1 ).getBitmap ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;
v2 = this.a;
/* if-nez v2, :cond_6 */
this.a = v0;
} // :cond_6
/* new-instance v2, Landroid/graphics/drawable/ShapeDrawable; */
/* const/16 v3, 0x8 */
/* new-array v3, v3, [F */
/* fill-array-data v3, :array_0 */
/* new-instance v4, Landroid/graphics/drawable/shapes/RoundRectShape; */
int v5 = 0; // const/4 v5, 0x0
/* invoke-direct {v4, v3, v5, v5}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V */
/* invoke-direct {v2, v4}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V */
/* new-instance v3, Landroid/graphics/BitmapShader; */
v4 = android.graphics.Shader$TileMode.REPEAT;
v5 = android.graphics.Shader$TileMode.CLAMP;
/* invoke-direct {v3, v0, v4, v5}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V */
(( android.graphics.drawable.ShapeDrawable ) v2 ).getPaint ( ); // invoke-virtual {v2}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;
(( android.graphics.Paint ) v0 ).setShader ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;
(( android.graphics.drawable.ShapeDrawable ) v2 ).getPaint ( ); // invoke-virtual {v2}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;
(( android.graphics.drawable.BitmapDrawable ) p1 ).getPaint ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getPaint()Landroid/graphics/Paint;
(( android.graphics.Paint ) p1 ).getColorFilter ( ); // invoke-virtual {p1}, Landroid/graphics/Paint;->getColorFilter()Landroid/graphics/ColorFilter;
(( android.graphics.Paint ) v0 ).setColorFilter ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
if ( p2 != null) { // if-eqz p2, :cond_7
/* new-instance p1, Landroid/graphics/drawable/ClipDrawable; */
int p2 = 3; // const/4 p2, 0x3
/* invoke-direct {p1, v2, p2, v1}, Landroid/graphics/drawable/ClipDrawable;-><init>(Landroid/graphics/drawable/Drawable;II)V */
} // :cond_7
} // :cond_8
} // :goto_4
/* :array_0 */
/* .array-data 4 */
/* 0x40a00000 # 5.0f */
/* 0x40a00000 # 5.0f */
/* 0x40a00000 # 5.0f */
/* 0x40a00000 # 5.0f */
/* 0x40a00000 # 5.0f */
/* 0x40a00000 # 5.0f */
/* 0x40a00000 # 5.0f */
/* 0x40a00000 # 5.0f */
} // .end array-data
} // .end method
/* # virtual methods */
public void a ( android.util.AttributeSet p0, Integer p1 ) {
/* .locals 8 */
v0 = this.a;
(( android.widget.ProgressBar ) v0 ).getContext ( ); // invoke-virtual {v0}, Landroid/widget/ProgressBar;->getContext()Landroid/content/Context;
v1 = hx.a;
int v2 = 0; // const/4 v2, 0x0
ip .a ( v0,p1,v1,p2,v2 );
(( ip ) p1 ).b ( v2 ); // invoke-virtual {p1, v2}, Lip;->b(I)Landroid/graphics/drawable/Drawable;
int v0 = 1; // const/4 v0, 0x1
if ( p2 != null) { // if-eqz p2, :cond_2
v1 = this.a;
/* instance-of v3, p2, Landroid/graphics/drawable/AnimationDrawable; */
if ( v3 != null) { // if-eqz v3, :cond_1
/* check-cast p2, Landroid/graphics/drawable/AnimationDrawable; */
v3 = (( android.graphics.drawable.AnimationDrawable ) p2 ).getNumberOfFrames ( ); // invoke-virtual {p2}, Landroid/graphics/drawable/AnimationDrawable;->getNumberOfFrames()I
/* new-instance v4, Landroid/graphics/drawable/AnimationDrawable; */
/* invoke-direct {v4}, Landroid/graphics/drawable/AnimationDrawable;-><init>()V */
v5 = (( android.graphics.drawable.AnimationDrawable ) p2 ).isOneShot ( ); // invoke-virtual {p2}, Landroid/graphics/drawable/AnimationDrawable;->isOneShot()Z
(( android.graphics.drawable.AnimationDrawable ) v4 ).setOneShot ( v5 ); // invoke-virtual {v4, v5}, Landroid/graphics/drawable/AnimationDrawable;->setOneShot(Z)V
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
/* const/16 v6, 0x2710 */
/* if-ge v5, v3, :cond_0 */
(( android.graphics.drawable.AnimationDrawable ) p2 ).getFrame ( v5 ); // invoke-virtual {p2, v5}, Landroid/graphics/drawable/AnimationDrawable;->getFrame(I)Landroid/graphics/drawable/Drawable;
/* invoke-direct {p0, v7, v0}, Lhx;->a(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable; */
(( android.graphics.drawable.Drawable ) v7 ).setLevel ( v6 ); // invoke-virtual {v7, v6}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
v6 = (( android.graphics.drawable.AnimationDrawable ) p2 ).getDuration ( v5 ); // invoke-virtual {p2, v5}, Landroid/graphics/drawable/AnimationDrawable;->getDuration(I)I
(( android.graphics.drawable.AnimationDrawable ) v4 ).addFrame ( v7, v6 ); // invoke-virtual {v4, v7, v6}, Landroid/graphics/drawable/AnimationDrawable;->addFrame(Landroid/graphics/drawable/Drawable;I)V
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_0
(( android.graphics.drawable.AnimationDrawable ) v4 ).setLevel ( v6 ); // invoke-virtual {v4, v6}, Landroid/graphics/drawable/AnimationDrawable;->setLevel(I)Z
/* move-object p2, v4 */
} // :cond_1
(( android.widget.ProgressBar ) v1 ).setIndeterminateDrawable ( p2 ); // invoke-virtual {v1, p2}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V
} // :cond_2
(( ip ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Lip;->b(I)Landroid/graphics/drawable/Drawable;
if ( p2 != null) { // if-eqz p2, :cond_3
v0 = this.a;
/* invoke-direct {p0, p2, v2}, Lhx;->a(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable; */
(( android.widget.ProgressBar ) v0 ).setProgressDrawable ( p2 ); // invoke-virtual {v0, p2}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V
} // :cond_3
p1 = this.a;
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
return;
} // .end method
