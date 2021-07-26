class ii extends android.content.res.Resources {
	 /* # instance fields */
	 private final android.content.res.Resources a;
	 /* # direct methods */
	 public ii ( ) {
		 /* .locals 3 */
		 (( android.content.res.Resources ) p1 ).getAssets ( ); // invoke-virtual {p1}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;
		 (( android.content.res.Resources ) p1 ).getDisplayMetrics ( ); // invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 (( android.content.res.Resources ) p1 ).getConfiguration ( ); // invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
		 /* invoke-direct {p0, v0, v1, v2}, Landroid/content/res/Resources;-><init>(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.content.res.XmlResourceParser getAnimation ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getAnimation ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getAnimation(I)Landroid/content/res/XmlResourceParser;
	 } // .end method
	 public Boolean getBoolean ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 p1 = 		 (( android.content.res.Resources ) v0 ).getBoolean ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getBoolean(I)Z
	 } // .end method
	 public Integer getColor ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 p1 = 		 (( android.content.res.Resources ) v0 ).getColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I
	 } // .end method
	 public android.content.res.ColorStateList getColorStateList ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getColorStateList ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;
	 } // .end method
	 public android.content.res.Configuration getConfiguration ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getConfiguration ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
	 } // .end method
	 public Float getDimension ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 p1 = 		 (( android.content.res.Resources ) v0 ).getDimension ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F
	 } // .end method
	 public Integer getDimensionPixelOffset ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 p1 = 		 (( android.content.res.Resources ) v0 ).getDimensionPixelOffset ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I
	 } // .end method
	 public Integer getDimensionPixelSize ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 p1 = 		 (( android.content.res.Resources ) v0 ).getDimensionPixelSize ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
	 } // .end method
	 public android.util.DisplayMetrics getDisplayMetrics ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
	 } // .end method
	 public android.graphics.drawable.Drawable getDrawable ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getDrawable ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
	 } // .end method
	 public android.graphics.drawable.Drawable getDrawable ( Integer p0, android.content.res.Resources$Theme p1 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getDrawable ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
	 } // .end method
	 public android.graphics.drawable.Drawable getDrawableForDensity ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getDrawableForDensity ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/res/Resources;->getDrawableForDensity(II)Landroid/graphics/drawable/Drawable;
	 } // .end method
	 public android.graphics.drawable.Drawable getDrawableForDensity ( Integer p0, Integer p1, android.content.res.Resources$Theme p2 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getDrawableForDensity ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroid/content/res/Resources;->getDrawableForDensity(IILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
	 } // .end method
	 public Float getFraction ( Integer p0, Integer p1, Integer p2 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 p1 = 		 (( android.content.res.Resources ) v0 ).getFraction ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroid/content/res/Resources;->getFraction(III)F
	 } // .end method
	 public Integer getIdentifier ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 p1 = 		 (( android.content.res.Resources ) v0 ).getIdentifier ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
	 } // .end method
	 public getIntArray ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getIntArray ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getIntArray(I)[I
	 } // .end method
	 public Integer getInteger ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 p1 = 		 (( android.content.res.Resources ) v0 ).getInteger ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getInteger(I)I
	 } // .end method
	 public android.content.res.XmlResourceParser getLayout ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getLayout ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getLayout(I)Landroid/content/res/XmlResourceParser;
	 } // .end method
	 public android.graphics.Movie getMovie ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getMovie ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getMovie(I)Landroid/graphics/Movie;
	 } // .end method
	 public java.lang.String getQuantityString ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getQuantityString ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;
	 } // .end method
	 public java.lang.String getQuantityString ( Integer p0, Integer p1, java.lang.Object...p2 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getQuantityString ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;
	 } // .end method
	 public java.lang.CharSequence getQuantityText ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getQuantityText ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/res/Resources;->getQuantityText(II)Ljava/lang/CharSequence;
	 } // .end method
	 public java.lang.String getResourceEntryName ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getResourceEntryName ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;
	 } // .end method
	 public java.lang.String getResourceName ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getResourceName ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;
	 } // .end method
	 public java.lang.String getResourcePackageName ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getResourcePackageName ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;
	 } // .end method
	 public java.lang.String getResourceTypeName ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getResourceTypeName ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;
	 } // .end method
	 public java.lang.String getString ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getString ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
	 } // .end method
	 public java.lang.String getString ( Integer p0, java.lang.Object...p1 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getString ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
	 } // .end method
	 public java.lang.String getStringArray ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getStringArray ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
	 } // .end method
	 public java.lang.CharSequence getText ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getText ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;
	 } // .end method
	 public java.lang.CharSequence getText ( Integer p0, java.lang.CharSequence p1 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getText ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/res/Resources;->getText(ILjava/lang/CharSequence;)Ljava/lang/CharSequence;
	 } // .end method
	 public java.lang.CharSequence getTextArray ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getTextArray ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getTextArray(I)[Ljava/lang/CharSequence;
	 } // .end method
	 public void getValue ( Integer p0, android.util.TypedValue p1, Boolean p2 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getValue ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V
		 return;
	 } // .end method
	 public void getValue ( java.lang.String p0, android.util.TypedValue p1, Boolean p2 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getValue ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroid/content/res/Resources;->getValue(Ljava/lang/String;Landroid/util/TypedValue;Z)V
		 return;
	 } // .end method
	 public void getValueForDensity ( Integer p0, Integer p1, android.util.TypedValue p2, Boolean p3 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getValueForDensity ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Landroid/content/res/Resources;->getValueForDensity(IILandroid/util/TypedValue;Z)V
		 return;
	 } // .end method
	 public android.content.res.XmlResourceParser getXml ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).getXml ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;
	 } // .end method
	 public android.content.res.TypedArray obtainAttributes ( android.util.AttributeSet p0, Integer[] p1 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).obtainAttributes ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
	 } // .end method
	 public android.content.res.TypedArray obtainTypedArray ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).obtainTypedArray ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;
	 } // .end method
	 public java.io.InputStream openRawResource ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).openRawResource ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;
	 } // .end method
	 public java.io.InputStream openRawResource ( Integer p0, android.util.TypedValue p1 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).openRawResource ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/res/Resources;->openRawResource(ILandroid/util/TypedValue;)Ljava/io/InputStream;
	 } // .end method
	 public android.content.res.AssetFileDescriptor openRawResourceFd ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).openRawResourceFd ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->openRawResourceFd(I)Landroid/content/res/AssetFileDescriptor;
	 } // .end method
	 public void parseBundleExtra ( java.lang.String p0, android.util.AttributeSet p1, android.os.Bundle p2 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).parseBundleExtra ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroid/content/res/Resources;->parseBundleExtra(Ljava/lang/String;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
		 return;
	 } // .end method
	 public void parseBundleExtras ( android.content.res.XmlResourceParser p0, android.os.Bundle p1 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.content.res.Resources ) v0 ).parseBundleExtras ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/res/Resources;->parseBundleExtras(Landroid/content/res/XmlResourceParser;Landroid/os/Bundle;)V
		 return;
	 } // .end method
	 public void updateConfiguration ( android.content.res.Configuration p0, android.util.DisplayMetrics p1 ) {
		 /* .locals 1 */
		 /* invoke-super {p0, p1, p2}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( android.content.res.Resources ) v0 ).updateConfiguration ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V
		 } // :cond_0
		 return;
	 } // .end method
