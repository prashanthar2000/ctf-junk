public class ge extends gh {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lge$e;, */
	 /* Lge$b;, */
	 /* Lge$c;, */
	 /* Lge$d;, */
	 /* Lge$a;, */
	 /* Lge$f; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String a;
/* # instance fields */
private ge$b a;
private ge$f a;
private Boolean a;
private Integer b;
private Integer c;
/* # direct methods */
static ge ( ) {
	 /* .locals 0 */
	 return;
} // .end method
public ge ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, v0, v0}, Lge;-><init>(Lge$b;Landroid/content/res/Resources;)V */
	 return;
} // .end method
 ge ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, v0}, Lgh;-><init>(B)V */
	 int v0 = -1; // const/4 v0, -0x1
	 /* iput v0, p0, Lge;->b:I */
	 /* iput v0, p0, Lge;->c:I */
	 /* new-instance v0, Lge$b; */
	 /* invoke-direct {v0, p1, p0, p2}, Lge$b;-><init>(Lge$b;Lge;Landroid/content/res/Resources;)V */
	 (( ge ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lge;->a(Lgf$b;)V
	 (( ge ) p0 ).getState ( ); // invoke-virtual {p0}, Lge;->getState()[I
	 (( ge ) p0 ).onStateChange ( p1 ); // invoke-virtual {p0, p1}, Lge;->onStateChange([I)Z
	 (( ge ) p0 ).jumpToCurrentState ( ); // invoke-virtual {p0}, Lge;->jumpToCurrentState()V
	 return;
} // .end method
private Integer a ( android.content.Context p0, android.content.res.Resources p1, org.xmlpull.v1.XmlPullParser p2, android.util.AttributeSet p3, android.content.res.Resources$Theme p4 ) {
	 /* .locals 7 */
	 v0 = gc$j.AnimatedStateListDrawableTransition;
	 cn .a ( p2,p5,p4,v0 );
	 int v2 = -1; // const/4 v2, -0x1
	 v1 = 	 (( android.content.res.TypedArray ) v0 ).getResourceId ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I
	 v3 = 	 (( android.content.res.TypedArray ) v0 ).getResourceId ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I
	 v4 = 	 (( android.content.res.TypedArray ) v0 ).getResourceId ( v4, v2 ); // invoke-virtual {v0, v4, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I
	 /* if-lez v4, :cond_0 */
	 gd .a ( p1,v4 );
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
int v6 = 0; // const/4 v6, 0x0
v5 = (( android.content.res.TypedArray ) v0 ).getBoolean ( v5, v6 ); // invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
(( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
/* if-nez v4, :cond_5 */
v0 = } // :cond_1
int v4 = 4; // const/4 v4, 0x4
/* if-eq v0, v4, :cond_1 */
int v4 = 2; // const/4 v4, 0x2
/* if-ne v0, v4, :cond_4 */
final String v4 = "animated-vector"; // const-string v4, "animated-vector"
v0 = (( java.lang.String ) v0 ).equals ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
bb .a ( p1,p2,p3,p4,p5 );
} // :cond_2
/* const/16 v0, 0x15 */
/* if-lt p1, v0, :cond_3 */
android.graphics.drawable.Drawable .createFromXmlInner ( p2,p3,p4,p5 );
} // :cond_3
android.graphics.drawable.Drawable .createFromXmlInner ( p2,p3,p4 );
} // :cond_4
/* new-instance p1, Lorg/xmlpull/v1/XmlPullParserException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p3 = ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable"; // const-string p3, ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable"
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_5
} // :goto_1
if ( v4 != null) { // if-eqz v4, :cond_7
/* if-eq v1, v2, :cond_6 */
/* if-eq v3, v2, :cond_6 */
p1 = this.a;
p1 = (( ge$b ) p1 ).a ( v1, v3, v4, v5 ); // invoke-virtual {p1, v1, v3, v4, v5}, Lge$b;->a(IILandroid/graphics/drawable/Drawable;Z)I
} // :cond_6
/* new-instance p1, Lorg/xmlpull/v1/XmlPullParserException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p3 = ": <transition> tag requires \'fromId\' & \'toId\' attributes"; // const-string p3, ": <transition> tag requires \'fromId\' & \'toId\' attributes"
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_7
/* new-instance p1, Lorg/xmlpull/v1/XmlPullParserException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p3 = ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable"; // const-string p3, ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable"
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
return;
} // .end method
private ge$b a ( ) {
/* .locals 3 */
/* new-instance v0, Lge$b; */
v1 = this.a;
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, v1, p0, v2}, Lge$b;-><init>(Lge$b;Lge;Landroid/content/res/Resources;)V */
} // .end method
public static ge a ( android.content.Context p0, android.content.res.Resources p1, org.xmlpull.v1.XmlPullParser p2, android.util.AttributeSet p3, android.content.res.Resources$Theme p4 ) {
/* .locals 8 */
final String v1 = "animated-selector"; // const-string v1, "animated-selector"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* new-instance v0, Lge; */
/* invoke-direct {v0}, Lge;-><init>()V */
v1 = gc$j.AnimatedStateListDrawableCompat;
cn .a ( p1,p4,p3,v1 );
int v3 = 1; // const/4 v3, 0x1
v2 = (( android.content.res.TypedArray ) v1 ).getBoolean ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
(( ge ) v0 ).setVisible ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lge;->setVisible(ZZ)Z
v2 = this.a;
/* const/16 v4, 0x15 */
/* if-lt v3, v4, :cond_0 */
/* iget v3, v2, Lge$b;->b:I */
v4 = (( android.content.res.TypedArray ) v1 ).getChangingConfigurations ( ); // invoke-virtual {v1}, Landroid/content/res/TypedArray;->getChangingConfigurations()I
/* or-int/2addr v3, v4 */
/* iput v3, v2, Lge$b;->b:I */
} // :cond_0
/* iget-boolean v4, v2, Lge$b;->a:Z */
v3 = (( android.content.res.TypedArray ) v1 ).getBoolean ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
/* iput-boolean v3, v2, Lgf$b;->a:Z */
/* iget-boolean v4, v2, Lge$b;->c:Z */
v3 = (( android.content.res.TypedArray ) v1 ).getBoolean ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
/* iput-boolean v3, v2, Lgf$b;->c:Z */
/* iget v4, v2, Lge$b;->k:I */
v3 = (( android.content.res.TypedArray ) v1 ).getInt ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I
/* iput v3, v2, Lgf$b;->k:I */
/* iget v4, v2, Lge$b;->l:I */
v3 = (( android.content.res.TypedArray ) v1 ).getInt ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I
/* iput v3, v2, Lgf$b;->l:I */
/* iget-boolean v2, v2, Lge$b;->j:Z */
v2 = (( android.content.res.TypedArray ) v1 ).getBoolean ( v3, v2 ); // invoke-virtual {v1, v3, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
(( ge ) v0 ).setDither ( v2 ); // invoke-virtual {v0, v2}, Lge;->setDither(Z)V
v2 = this.a;
(( gf$b ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Lgf$b;->a(Landroid/content/res/Resources;)V
(( android.content.res.TypedArray ) v1 ).recycle ( ); // invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V
/* move-object v2, v0 */
/* move-object v3, p0 */
/* move-object v4, p1 */
/* move-object v5, p2 */
/* move-object v6, p3 */
/* move-object v7, p4 */
/* invoke-direct/range {v2 ..v7}, Lge;->a(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V */
(( ge ) v0 ).getState ( ); // invoke-virtual {v0}, Lge;->getState()[I
(( ge ) v0 ).onStateChange ( p0 ); // invoke-virtual {v0, p0}, Lge;->onStateChange([I)Z
} // :cond_1
/* new-instance p0, Lorg/xmlpull/v1/XmlPullParserException; */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p2 = ": invalid animated-selector tag "; // const-string p2, ": invalid animated-selector tag "
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
private void a ( android.content.Context p0, android.content.res.Resources p1, org.xmlpull.v1.XmlPullParser p2, android.util.AttributeSet p3, android.content.res.Resources$Theme p4 ) {
/* .locals 17 */
/* move-object/from16 v0, p4 */
v1 = /* invoke-interface/range {p3 ..p3}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I */
int v2 = 1; // const/4 v2, 0x1
/* add-int/2addr v1, v2 */
} // :cond_0
} // :goto_0
v3 = /* invoke-interface/range {p3 ..p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I */
/* if-eq v3, v2, :cond_e */
v4 = /* invoke-interface/range {p3 ..p3}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I */
/* if-ge v4, v1, :cond_1 */
int v5 = 3; // const/4 v5, 0x3
/* if-eq v3, v5, :cond_e */
} // :cond_1
int v5 = 2; // const/4 v5, 0x2
/* if-ne v3, v5, :cond_d */
/* if-gt v4, v1, :cond_d */
/* invoke-interface/range {p3 ..p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String; */
final String v4 = "item"; // const-string v4, "item"
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_c
v3 = gc$j.AnimatedStateListDrawableItem;
/* move-object/from16 v4, p2 */
/* move-object/from16 v6, p5 */
cn .a ( v4,v6,v0,v3 );
int v8 = 0; // const/4 v8, 0x0
v7 = (( android.content.res.TypedArray ) v3 ).getResourceId ( v7, v8 ); // invoke-virtual {v3, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I
int v9 = 0; // const/4 v9, 0x0
int v11 = -1; // const/4 v11, -0x1
v10 = (( android.content.res.TypedArray ) v3 ).getResourceId ( v10, v11 ); // invoke-virtual {v3, v10, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I
/* if-lez v10, :cond_2 */
/* move-object/from16 v11, p1 */
gd .a ( v11,v10 );
} // :cond_2
/* move-object/from16 v11, p1 */
} // :goto_1
(( android.content.res.TypedArray ) v3 ).recycle ( ); // invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V
v3 = /* invoke-interface/range {p4 ..p4}, Landroid/util/AttributeSet;->getAttributeCount()I */
/* new-array v10, v3, [I */
int v12 = 0; // const/4 v12, 0x0
int v13 = 0; // const/4 v13, 0x0
} // :goto_2
v14 = /* if-ge v12, v3, :cond_5 */
if ( v14 != null) { // if-eqz v14, :cond_4
/* const v15, 0x10100d0 */
/* if-eq v14, v15, :cond_4 */
/* const v15, 0x1010199 */
/* if-eq v14, v15, :cond_4 */
v16 = /* add-int/lit8 v15, v13, 0x1 */
if ( v16 != null) { // if-eqz v16, :cond_3
} // :cond_3
/* neg-int v14, v14 */
} // :goto_3
/* aput v14, v10, v13 */
/* move v13, v15 */
} // :cond_4
/* add-int/lit8 v12, v12, 0x1 */
} // :cond_5
android.util.StateSet .trimStateSet ( v10,v13 );
/* if-nez v9, :cond_a */
} // :cond_6
v8 = /* invoke-interface/range {p3 ..p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I */
int v9 = 4; // const/4 v9, 0x4
/* if-eq v8, v9, :cond_6 */
/* if-ne v8, v5, :cond_9 */
/* invoke-interface/range {p3 ..p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String; */
final String v8 = "vector"; // const-string v8, "vector"
v5 = (( java.lang.String ) v5 ).equals ( v8 ); // invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_7
/* invoke-static/range {p2 ..p5}, Lbh;->a(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Lbh; */
} // :cond_7
/* const/16 v8, 0x15 */
/* if-lt v5, v8, :cond_8 */
/* invoke-static/range {p2 ..p5}, Landroid/graphics/drawable/Drawable;->createFromXmlInner(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable; */
} // :cond_8
/* invoke-static/range {p2 ..p4}, Landroid/graphics/drawable/Drawable;->createFromXmlInner(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)Landroid/graphics/drawable/Drawable; */
} // :cond_9
/* new-instance v0, Lorg/xmlpull/v1/XmlPullParserException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
/* invoke-interface/range {p3 ..p3}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String; */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable"; // const-string v2, ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_a
} // :goto_4
if ( v9 != null) { // if-eqz v9, :cond_b
/* move-object/from16 v5, p0 */
v8 = this.a;
v9 = (( gh$a ) v8 ).a ( v9 ); // invoke-virtual {v8, v9}, Lgh$a;->a(Landroid/graphics/drawable/Drawable;)I
v10 = this.a;
/* aput-object v3, v10, v9 */
v3 = this.a;
java.lang.Integer .valueOf ( v7 );
(( dv ) v3 ).a ( v9, v7 ); // invoke-virtual {v3, v9, v7}, Ldv;->a(ILjava/lang/Object;)V
/* goto/16 :goto_0 */
} // :cond_b
/* move-object/from16 v5, p0 */
/* new-instance v0, Lorg/xmlpull/v1/XmlPullParserException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
/* invoke-interface/range {p3 ..p3}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String; */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable"; // const-string v2, ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_c
/* move-object/from16 v5, p0 */
/* move-object/from16 v11, p1 */
/* move-object/from16 v4, p2 */
/* move-object/from16 v6, p5 */
/* invoke-interface/range {p3 ..p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String; */
final String v7 = "transition"; // const-string v7, "transition"
v3 = (( java.lang.String ) v3 ).equals ( v7 ); // invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* invoke-direct/range {p0 ..p5}, Lge;->a(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)I */
/* goto/16 :goto_0 */
} // :cond_d
/* move-object/from16 v5, p0 */
/* move-object/from16 v11, p1 */
/* move-object/from16 v4, p2 */
/* move-object/from16 v6, p5 */
/* goto/16 :goto_0 */
} // :cond_e
/* move-object/from16 v5, p0 */
return;
} // .end method
/* # virtual methods */
final gf$b a ( ) { //bridge//synthethic
/* .locals 1 */
/* invoke-direct {p0}, Lge;->a()Lge$b; */
} // .end method
final gh$a a ( ) { //bridge//synthethic
/* .locals 1 */
/* invoke-direct {p0}, Lge;->a()Lge$b; */
} // .end method
protected final void a ( gf$b p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Lgh;->a(Lgf$b;)V */
/* instance-of v0, p1, Lge$b; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast p1, Lge$b; */
this.a = p1;
} // :cond_0
return;
} // .end method
public void applyTheme ( android.content.res.Resources$Theme p0 ) { //bridge//synthethic
/* .locals 0 */
/* invoke-super {p0, p1}, Lgh;->applyTheme(Landroid/content/res/Resources$Theme;)V */
return;
} // .end method
public Boolean canApplyTheme ( ) { //bridge//synthethic
/* .locals 1 */
v0 = /* invoke-super {p0}, Lgh;->canApplyTheme()Z */
} // .end method
public void draw ( android.graphics.Canvas p0 ) { //bridge//synthethic
/* .locals 0 */
/* invoke-super {p0, p1}, Lgh;->draw(Landroid/graphics/Canvas;)V */
return;
} // .end method
public Integer getAlpha ( ) { //bridge//synthethic
/* .locals 1 */
v0 = /* invoke-super {p0}, Lgh;->getAlpha()I */
} // .end method
public Integer getChangingConfigurations ( ) { //bridge//synthethic
/* .locals 1 */
v0 = /* invoke-super {p0}, Lgh;->getChangingConfigurations()I */
} // .end method
public android.graphics.drawable.Drawable getCurrent ( ) { //bridge//synthethic
/* .locals 1 */
/* invoke-super {p0}, Lgh;->getCurrent()Landroid/graphics/drawable/Drawable; */
} // .end method
public void getHotspotBounds ( android.graphics.Rect p0 ) { //bridge//synthethic
/* .locals 0 */
/* invoke-super {p0, p1}, Lgh;->getHotspotBounds(Landroid/graphics/Rect;)V */
return;
} // .end method
public Integer getIntrinsicHeight ( ) { //bridge//synthethic
/* .locals 1 */
v0 = /* invoke-super {p0}, Lgh;->getIntrinsicHeight()I */
} // .end method
public Integer getIntrinsicWidth ( ) { //bridge//synthethic
/* .locals 1 */
v0 = /* invoke-super {p0}, Lgh;->getIntrinsicWidth()I */
} // .end method
public Integer getMinimumHeight ( ) { //bridge//synthethic
/* .locals 1 */
v0 = /* invoke-super {p0}, Lgh;->getMinimumHeight()I */
} // .end method
public Integer getMinimumWidth ( ) { //bridge//synthethic
/* .locals 1 */
v0 = /* invoke-super {p0}, Lgh;->getMinimumWidth()I */
} // .end method
public Integer getOpacity ( ) { //bridge//synthethic
/* .locals 1 */
v0 = /* invoke-super {p0}, Lgh;->getOpacity()I */
} // .end method
public void getOutline ( android.graphics.Outline p0 ) { //bridge//synthethic
/* .locals 0 */
/* invoke-super {p0, p1}, Lgh;->getOutline(Landroid/graphics/Outline;)V */
return;
} // .end method
public Boolean getPadding ( android.graphics.Rect p0 ) { //bridge//synthethic
/* .locals 0 */
p1 = /* invoke-super {p0, p1}, Lgh;->getPadding(Landroid/graphics/Rect;)Z */
} // .end method
public void invalidateDrawable ( android.graphics.drawable.Drawable p0 ) { //bridge//synthethic
/* .locals 0 */
/* invoke-super {p0, p1}, Lgh;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V */
return;
} // .end method
public Boolean isAutoMirrored ( ) { //bridge//synthethic
/* .locals 1 */
v0 = /* invoke-super {p0}, Lgh;->isAutoMirrored()Z */
} // .end method
public Boolean isStateful ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void jumpToCurrentState ( ) {
/* .locals 1 */
/* invoke-super {p0}, Lgh;->jumpToCurrentState()V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( ge$f ) v0 ).b ( ); // invoke-virtual {v0}, Lge$f;->b()V
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
/* iget v0, p0, Lge;->b:I */
(( ge ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lge;->a(I)Z
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lge;->b:I */
/* iput v0, p0, Lge;->c:I */
} // :cond_0
return;
} // .end method
public android.graphics.drawable.Drawable mutate ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lge;->a:Z */
/* if-nez v0, :cond_0 */
/* invoke-super {p0}, Lgh;->mutate()Landroid/graphics/drawable/Drawable; */
/* if-ne v0, p0, :cond_0 */
v0 = this.a;
(( ge$b ) v0 ).a ( ); // invoke-virtual {v0}, Lge$b;->a()V
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lge;->a:Z */
} // :cond_0
} // .end method
public Boolean onLayoutDirectionChanged ( Integer p0 ) { //bridge//synthethic
/* .locals 0 */
p1 = /* invoke-super {p0, p1}, Lgh;->onLayoutDirectionChanged(I)Z */
} // .end method
protected Boolean onStateChange ( Integer[] p0 ) {
/* .locals 18 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p1 */
v2 = this.a;
v2 = (( ge$b ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Lge$b;->a([I)I
/* iget v3, v0, Lgf;->a:I */
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
/* if-eq v2, v3, :cond_a */
v3 = this.a;
if ( v3 != null) { // if-eqz v3, :cond_2
/* iget v6, v0, Lge;->b:I */
/* if-ne v2, v6, :cond_0 */
} // :goto_0
int v3 = 1; // const/4 v3, 0x1
/* goto/16 :goto_6 */
} // :cond_0
/* iget v6, v0, Lge;->c:I */
/* if-ne v2, v6, :cond_1 */
v6 = (( ge$f ) v3 ).a ( ); // invoke-virtual {v3}, Lge$f;->a()Z
if ( v6 != null) { // if-eqz v6, :cond_1
(( ge$f ) v3 ).c ( ); // invoke-virtual {v3}, Lge$f;->c()V
/* iget v3, v0, Lge;->c:I */
/* iput v3, v0, Lge;->b:I */
/* iput v2, v0, Lge;->c:I */
} // :cond_1
/* iget v6, v0, Lge;->b:I */
(( ge$f ) v3 ).b ( ); // invoke-virtual {v3}, Lge$f;->b()V
} // :cond_2
/* iget v6, v0, Lgf;->a:I */
} // :goto_1
int v3 = 0; // const/4 v3, 0x0
this.a = v3;
int v3 = -1; // const/4 v3, -0x1
/* iput v3, v0, Lge;->c:I */
/* iput v3, v0, Lge;->b:I */
v3 = this.a;
v7 = (( ge$b ) v3 ).a ( v6 ); // invoke-virtual {v3, v6}, Lge$b;->a(I)I
v8 = (( ge$b ) v3 ).a ( v2 ); // invoke-virtual {v3, v2}, Lge$b;->a(I)I
if ( v8 != null) { // if-eqz v8, :cond_9
/* if-nez v7, :cond_3 */
/* goto/16 :goto_5 */
} // :cond_3
ge$b .a ( v7,v8 );
/* move-result-wide v9 */
v11 = this.a;
/* const-wide/16 v12, -0x1 */
java.lang.Long .valueOf ( v12,v13 );
(( do ) v11 ).a ( v9, v10, v14 ); // invoke-virtual {v11, v9, v10, v14}, Ldo;->a(JLjava/lang/Object;)Ljava/lang/Object;
/* check-cast v9, Ljava/lang/Long; */
(( java.lang.Long ) v9 ).longValue ( ); // invoke-virtual {v9}, Ljava/lang/Long;->longValue()J
/* move-result-wide v9 */
/* long-to-int v10, v9 */
/* if-gez v10, :cond_4 */
/* goto/16 :goto_5 */
} // :cond_4
ge$b .a ( v7,v8 );
/* move-result-wide v14 */
v9 = this.a;
java.lang.Long .valueOf ( v12,v13 );
(( do ) v9 ).a ( v14, v15, v11 ); // invoke-virtual {v9, v14, v15, v11}, Ldo;->a(JLjava/lang/Object;)Ljava/lang/Object;
/* check-cast v9, Ljava/lang/Long; */
(( java.lang.Long ) v9 ).longValue ( ); // invoke-virtual {v9}, Ljava/lang/Long;->longValue()J
/* move-result-wide v14 */
/* const-wide v16, 0x200000000L */
/* and-long v14, v14, v16 */
/* const-wide/16 v16, 0x0 */
/* cmp-long v9, v14, v16 */
if ( v9 != null) { // if-eqz v9, :cond_5
int v9 = 1; // const/4 v9, 0x1
} // :cond_5
int v9 = 0; // const/4 v9, 0x0
} // :goto_2
(( ge ) v0 ).a ( v10 ); // invoke-virtual {v0, v10}, Lge;->a(I)Z
/* invoke-virtual/range {p0 ..p0}, Lge;->getCurrent()Landroid/graphics/drawable/Drawable; */
/* instance-of v11, v10, Landroid/graphics/drawable/AnimationDrawable; */
if ( v11 != null) { // if-eqz v11, :cond_7
ge$b .a ( v7,v8 );
/* move-result-wide v7 */
v3 = this.a;
java.lang.Long .valueOf ( v12,v13 );
(( do ) v3 ).a ( v7, v8, v11 ); // invoke-virtual {v3, v7, v8, v11}, Ldo;->a(JLjava/lang/Object;)Ljava/lang/Object;
/* check-cast v3, Ljava/lang/Long; */
(( java.lang.Long ) v3 ).longValue ( ); // invoke-virtual {v3}, Ljava/lang/Long;->longValue()J
/* move-result-wide v7 */
/* const-wide v11, 0x100000000L */
/* and-long/2addr v7, v11 */
/* cmp-long v3, v7, v16 */
if ( v3 != null) { // if-eqz v3, :cond_6
int v3 = 1; // const/4 v3, 0x1
} // :cond_6
int v3 = 0; // const/4 v3, 0x0
} // :goto_3
/* new-instance v7, Lge$d; */
/* check-cast v10, Landroid/graphics/drawable/AnimationDrawable; */
/* invoke-direct {v7, v10, v3, v9}, Lge$d;-><init>(Landroid/graphics/drawable/AnimationDrawable;ZZ)V */
} // :cond_7
/* instance-of v3, v10, Lbb; */
if ( v3 != null) { // if-eqz v3, :cond_8
/* new-instance v7, Lge$c; */
/* check-cast v10, Lbb; */
/* invoke-direct {v7, v10}, Lge$c;-><init>(Lbb;)V */
} // :cond_8
/* instance-of v3, v10, Landroid/graphics/drawable/Animatable; */
if ( v3 != null) { // if-eqz v3, :cond_9
/* new-instance v7, Lge$a; */
/* check-cast v10, Landroid/graphics/drawable/Animatable; */
/* invoke-direct {v7, v10}, Lge$a;-><init>(Landroid/graphics/drawable/Animatable;)V */
} // :goto_4
(( ge$f ) v7 ).a ( ); // invoke-virtual {v7}, Lge$f;->a()V
this.a = v7;
/* iput v6, v0, Lge;->c:I */
/* iput v2, v0, Lge;->b:I */
/* goto/16 :goto_0 */
} // :cond_9
} // :goto_5
int v3 = 0; // const/4 v3, 0x0
} // :goto_6
/* if-nez v3, :cond_b */
v2 = (( ge ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lge;->a(I)Z
if ( v2 != null) { // if-eqz v2, :cond_a
} // :cond_a
int v4 = 0; // const/4 v4, 0x0
} // :cond_b
} // :goto_7
/* invoke-virtual/range {p0 ..p0}, Lge;->getCurrent()Landroid/graphics/drawable/Drawable; */
if ( v2 != null) { // if-eqz v2, :cond_c
v1 = (( android.graphics.drawable.Drawable ) v2 ).setState ( v1 ); // invoke-virtual {v2, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
/* or-int/2addr v4, v1 */
} // :cond_c
} // .end method
public void scheduleDrawable ( android.graphics.drawable.Drawable p0, java.lang.Runnable p1, Long p2 ) { //bridge//synthethic
/* .locals 0 */
/* invoke-super {p0, p1, p2, p3, p4}, Lgh;->scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V */
return;
} // .end method
public void setAlpha ( Integer p0 ) { //bridge//synthethic
/* .locals 0 */
/* invoke-super {p0, p1}, Lgh;->setAlpha(I)V */
return;
} // .end method
public void setAutoMirrored ( Boolean p0 ) { //bridge//synthethic
/* .locals 0 */
/* invoke-super {p0, p1}, Lgh;->setAutoMirrored(Z)V */
return;
} // .end method
public void setColorFilter ( android.graphics.ColorFilter p0 ) { //bridge//synthethic
/* .locals 0 */
/* invoke-super {p0, p1}, Lgh;->setColorFilter(Landroid/graphics/ColorFilter;)V */
return;
} // .end method
public void setDither ( Boolean p0 ) { //bridge//synthethic
/* .locals 0 */
/* invoke-super {p0, p1}, Lgh;->setDither(Z)V */
return;
} // .end method
public void setHotspot ( Float p0, Float p1 ) { //bridge//synthethic
/* .locals 0 */
/* invoke-super {p0, p1, p2}, Lgh;->setHotspot(FF)V */
return;
} // .end method
public void setHotspotBounds ( Integer p0, Integer p1, Integer p2, Integer p3 ) { //bridge//synthethic
/* .locals 0 */
/* invoke-super {p0, p1, p2, p3, p4}, Lgh;->setHotspotBounds(IIII)V */
return;
} // .end method
public void setTintList ( android.content.res.ColorStateList p0 ) { //bridge//synthethic
/* .locals 0 */
/* invoke-super {p0, p1}, Lgh;->setTintList(Landroid/content/res/ColorStateList;)V */
return;
} // .end method
public void setTintMode ( android.graphics.PorterDuff$Mode p0 ) { //bridge//synthethic
/* .locals 0 */
/* invoke-super {p0, p1}, Lgh;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V */
return;
} // .end method
public Boolean setVisible ( Boolean p0, Boolean p1 ) {
/* .locals 2 */
v0 = /* invoke-super {p0, p1, p2}, Lgh;->setVisible(ZZ)Z */
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_2
/* if-nez v0, :cond_0 */
if ( p2 != null) { // if-eqz p2, :cond_2
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_1
p1 = this.a;
(( ge$f ) p1 ).a ( ); // invoke-virtual {p1}, Lge$f;->a()V
} // :cond_1
(( ge ) p0 ).jumpToCurrentState ( ); // invoke-virtual {p0}, Lge;->jumpToCurrentState()V
} // :cond_2
} // :goto_0
} // .end method
public void unscheduleDrawable ( android.graphics.drawable.Drawable p0, java.lang.Runnable p1 ) { //bridge//synthethic
/* .locals 0 */
/* invoke-super {p0, p1, p2}, Lgh;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V */
return;
} // .end method
