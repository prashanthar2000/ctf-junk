.class public final Lci;
.super Ljava/lang/Object;


# instance fields
.field public a:I

.field private final a:Landroid/content/res/ColorStateList;

.field public final a:Landroid/graphics/Shader;


# direct methods
.method private constructor <init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lci;->a:Landroid/graphics/Shader;

    iput-object p2, p0, Lci;->a:Landroid/content/res/ColorStateList;

    iput p3, p0, Lci;->a:I

    return-void
.end method

.method static a(I)Lci;
    .locals 2

    new-instance v0, Lci;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, p0}, Lci;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object v0
.end method

.method public static a(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Lci;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    :try_start_0
    invoke-virtual/range {p0 .. p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v3

    invoke-static {v3}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v4

    :cond_0
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v5

    const/4 v6, 0x1

    const/4 v7, 0x2

    if-eq v5, v7, :cond_1

    if-ne v5, v6, :cond_0

    :cond_1
    if-ne v5, v7, :cond_9

    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    const/4 v7, -0x1

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v8

    const v9, 0x557f730

    const/4 v10, 0x0

    if-eq v8, v9, :cond_3

    const v6, 0x4705f3df

    if-eq v8, v6, :cond_2

    goto :goto_0

    :cond_2
    const-string v6, "selector"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/4 v6, 0x0

    goto :goto_1

    :cond_3
    const-string v8, "gradient"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v6, -0x1

    :goto_1
    packed-switch v6, :pswitch_data_0

    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    goto/16 :goto_5

    :pswitch_0
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "gradient"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    sget-object v5, Lw$c;->GradientColor:[I

    invoke-static {v0, v1, v4, v5}, Lcn;->a(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v5

    const-string v6, "startX"

    sget v7, Lw$c;->GradientColor_android_startX:I

    const/4 v8, 0x0

    invoke-static {v5, v3, v6, v7, v8}, Lcn;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v12

    const-string v6, "startY"

    sget v7, Lw$c;->GradientColor_android_startY:I

    invoke-static {v5, v3, v6, v7, v8}, Lcn;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v13

    const-string v6, "endX"

    sget v7, Lw$c;->GradientColor_android_endX:I

    invoke-static {v5, v3, v6, v7, v8}, Lcn;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v14

    const-string v6, "endY"

    sget v7, Lw$c;->GradientColor_android_endY:I

    invoke-static {v5, v3, v6, v7, v8}, Lcn;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v15

    const-string v6, "centerX"

    sget v7, Lw$c;->GradientColor_android_centerX:I

    invoke-static {v5, v3, v6, v7, v8}, Lcn;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v6

    const-string v7, "centerY"

    sget v9, Lw$c;->GradientColor_android_centerY:I

    invoke-static {v5, v3, v7, v9, v8}, Lcn;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v7

    const-string v9, "type"

    sget v11, Lw$c;->GradientColor_android_type:I

    invoke-static {v5, v3, v9, v11, v10}, Lcn;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v9

    const-string v11, "startColor"

    sget v2, Lw$c;->GradientColor_android_startColor:I

    invoke-static {v5, v3, v11, v2}, Lcn;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v2

    const-string v11, "centerColor"

    invoke-static {v3, v11}, Lcn;->a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v11

    const-string v8, "centerColor"

    sget v10, Lw$c;->GradientColor_android_centerColor:I

    invoke-static {v5, v3, v8, v10}, Lcn;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v8

    const-string v10, "endColor"

    move/from16 v16, v15

    sget v15, Lw$c;->GradientColor_android_endColor:I

    invoke-static {v5, v3, v10, v15}, Lcn;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v10

    const-string v15, "tileMode"

    move/from16 v17, v14

    sget v14, Lw$c;->GradientColor_android_tileMode:I

    move/from16 v18, v13

    const/4 v13, 0x0

    invoke-static {v5, v3, v15, v14, v13}, Lcn;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v14

    const-string v13, "gradientRadius"

    sget v15, Lw$c;->GradientColor_android_gradientRadius:I

    move/from16 v19, v12

    const/4 v12, 0x0

    invoke-static {v5, v3, v13, v15, v12}, Lcn;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v13

    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    invoke-static {v0, v3, v4, v1}, Lck;->a(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Lck$a;

    move-result-object v0

    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    if-eqz v11, :cond_6

    new-instance v0, Lck$a;

    invoke-direct {v0, v2, v8, v10}, Lck$a;-><init>(III)V

    goto :goto_2

    :cond_6
    new-instance v0, Lck$a;

    invoke-direct {v0, v2, v10}, Lck$a;-><init>(II)V

    :goto_2
    packed-switch v9, :pswitch_data_1

    new-instance v1, Landroid/graphics/LinearGradient;

    goto :goto_3

    :pswitch_1
    new-instance v1, Landroid/graphics/SweepGradient;

    iget-object v2, v0, Lck$a;->a:[I

    iget-object v0, v0, Lck$a;->a:[F

    invoke-direct {v1, v6, v7, v2, v0}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    goto :goto_4

    :pswitch_2
    const/4 v1, 0x0

    cmpg-float v1, v13, v1

    if-lez v1, :cond_7

    new-instance v1, Landroid/graphics/RadialGradient;

    iget-object v2, v0, Lck$a;->a:[I

    iget-object v0, v0, Lck$a;->a:[F

    invoke-static {v14}, Lck;->a(I)Landroid/graphics/Shader$TileMode;

    move-result-object v22

    move-object/from16 v16, v1

    move/from16 v17, v6

    move/from16 v18, v7

    move/from16 v19, v13

    move-object/from16 v20, v2

    move-object/from16 v21, v0

    invoke-direct/range {v16 .. v22}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    goto :goto_4

    :cond_7
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "<gradient> tag requires \'gradientRadius\' attribute with radial type"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_3
    iget-object v2, v0, Lck$a;->a:[I

    iget-object v0, v0, Lck$a;->a:[F

    invoke-static {v14}, Lck;->a(I)Landroid/graphics/Shader$TileMode;

    move-result-object v3

    move-object v11, v1

    move/from16 v12, v19

    move/from16 v13, v18

    move/from16 v14, v17

    move/from16 v15, v16

    move-object/from16 v16, v2

    move-object/from16 v17, v0

    move-object/from16 v18, v3

    invoke-direct/range {v11 .. v18}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    :goto_4
    new-instance v0, Lci;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lci;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object v0

    :cond_8
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": invalid gradient color tag "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_3
    invoke-static {v0, v3, v4, v1}, Lch;->a(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object v0

    new-instance v1, Lci;

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v2

    const/4 v3, 0x0

    invoke-direct {v1, v3, v0, v2}, Lci;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object v1

    :goto_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": unsupported complex color tag "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "No start tag found"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    const-string v1, "ComplexColorCompat"

    const-string v2, "Failed to inflate ComplexColor."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v1, 0x0

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lci;->a:Landroid/graphics/Shader;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final a([I)Z
    .locals 2

    invoke-virtual {p0}, Lci;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lci;->a:Landroid/content/res/ColorStateList;

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    iget v0, p0, Lci;->a:I

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    iput p1, p0, Lci;->a:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lci;->a:Landroid/graphics/Shader;

    if-nez v0, :cond_0

    iget-object v0, p0, Lci;->a:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c()Z
    .locals 1

    invoke-virtual {p0}, Lci;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lci;->a:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
