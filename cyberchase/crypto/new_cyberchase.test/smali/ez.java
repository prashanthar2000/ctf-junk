abstract class ez implements android.view.animation.Interpolator {
	 /* # interfaces */
	 /* # instance fields */
	 private final Float a;
	 private final a;
	 /* # direct methods */
	 protected ez ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.a = p1;
		 p1 = this.a;
		 /* array-length p1, p1 */
		 /* add-int/lit8 p1, p1, -0x1 */
		 /* int-to-float p1, p1 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* div-float/2addr v0, p1 */
		 /* iput v0, p0, Lez;->a:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Float getInterpolation ( Float p0 ) {
		 /* .locals 4 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* cmpl-float v1, p1, v0 */
		 /* if-ltz v1, :cond_0 */
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
	 /* cmpg-float v1, p1, v0 */
	 /* if-gtz v1, :cond_1 */
} // :cond_1
v0 = this.a;
/* array-length v1, v0 */
/* add-int/lit8 v1, v1, -0x1 */
/* int-to-float v1, v1 */
/* mul-float v1, v1, p1 */
/* float-to-int v1, v1 */
/* array-length v0, v0 */
/* add-int/lit8 v0, v0, -0x2 */
v0 = java.lang.Math .min ( v1,v0 );
/* int-to-float v1, v0 */
/* iget v2, p0, Lez;->a:F */
/* mul-float v1, v1, v2 */
/* sub-float/2addr p1, v1 */
/* div-float/2addr p1, v2 */
v1 = this.a;
/* aget v2, v1, v0 */
/* add-int/lit8 v3, v0, 0x1 */
/* aget v3, v1, v3 */
/* aget v0, v1, v0 */
/* sub-float/2addr v3, v0 */
/* mul-float p1, p1, v3 */
/* add-float/2addr v2, p1 */
} // .end method
