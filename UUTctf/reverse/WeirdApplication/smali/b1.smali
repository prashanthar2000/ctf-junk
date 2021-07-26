.class public abstract Lb1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:Ljava/lang/reflect/Field;

.field public static b:Z

.field public static c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static d:Z

.field public static e:Ljava/lang/reflect/Field;

.field public static f:Z

.field public static g:Ljava/lang/reflect/Field;

.field public static h:Z

.field public static i:Ljava/lang/reflect/Method;

.field public static j:Z

.field public static k:Ljava/lang/reflect/Method;

.field public static l:Z

.field public static m:Ljava/lang/reflect/Field;

.field public static n:Z

.field public static o:Ljava/lang/reflect/Field;

.field public static p:Z

.field public static q:Ljava/lang/reflect/Method;

.field public static r:Z

.field public static s:Ljava/lang/reflect/Field;

.field public static t:Z


# direct methods
.method public static A(Lo8;IZI)I
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    iget-boolean v3, v0, Lo8;->b0:Z

    const/4 v4, 0x0

    if-nez v3, :cond_0

    return v4

    :cond_0
    iget-object v3, v0, Lo8;->w:Ln8;

    iget-object v3, v3, Ln8;->d:Ln8;

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    if-ne v1, v5, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 1
    iget v6, v0, Lo8;->Q:I

    .line 2
    invoke-virtual/range {p0 .. p0}, Lo8;->h()I

    move-result v7

    .line 3
    iget v8, v0, Lo8;->Q:I

    sub-int/2addr v7, v8

    mul-int/lit8 v8, v1, 0x2

    add-int/lit8 v9, v8, 0x1

    goto :goto_1

    .line 4
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lo8;->h()I

    move-result v6

    .line 5
    iget v7, v0, Lo8;->Q:I

    sub-int/2addr v6, v7

    mul-int/lit8 v9, v1, 0x2

    add-int/lit8 v8, v9, 0x1

    .line 6
    :goto_1
    iget-object v10, v0, Lo8;->A:[Ln8;

    aget-object v11, v10, v9

    iget-object v11, v11, Ln8;->d:Ln8;

    if-eqz v11, :cond_3

    aget-object v10, v10, v8

    iget-object v10, v10, Ln8;->d:Ln8;

    if-nez v10, :cond_3

    const/4 v10, -0x1

    move/from16 v18, v9

    move v9, v8

    move/from16 v8, v18

    goto :goto_2

    :cond_3
    const/4 v10, 0x1

    :goto_2
    if-eqz v3, :cond_4

    sub-int v11, p3, v6

    goto :goto_3

    :cond_4
    move/from16 v11, p3

    :goto_3
    iget-object v13, v0, Lo8;->A:[Ln8;

    aget-object v13, v13, v8

    invoke-virtual {v13}, Ln8;->b()I

    move-result v13

    mul-int v13, v13, v10

    invoke-static/range {p0 .. p1}, Lb1;->K(Lo8;I)I

    move-result v14

    add-int/2addr v14, v13

    add-int/2addr v11, v14

    if-nez v1, :cond_5

    invoke-virtual/range {p0 .. p0}, Lo8;->n()I

    move-result v13

    goto :goto_4

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lo8;->h()I

    move-result v13

    :goto_4
    mul-int v13, v13, v10

    iget-object v15, v0, Lo8;->A:[Ln8;

    aget-object v15, v15, v8

    .line 7
    iget-object v15, v15, Ln8;->a:Lt8;

    .line 8
    iget-object v15, v15, Lv8;->a:Ljava/util/HashSet;

    invoke-virtual {v15}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_5
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_6

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lv8;

    move-object/from16 v12, v17

    check-cast v12, Lt8;

    iget-object v12, v12, Lt8;->c:Ln8;

    iget-object v12, v12, Ln8;->b:Lo8;

    invoke-static {v12, v1, v2, v11}, Lb1;->A(Lo8;IZI)I

    move-result v12

    invoke-static {v4, v12}, Ljava/lang/Math;->max(II)I

    move-result v4

    goto :goto_5

    :cond_6
    iget-object v12, v0, Lo8;->A:[Ln8;

    aget-object v12, v12, v9

    .line 9
    iget-object v12, v12, Ln8;->a:Lt8;

    .line 10
    iget-object v12, v12, Lv8;->a:Ljava/util/HashSet;

    invoke-virtual {v12}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v12

    const/4 v15, 0x0

    :goto_6
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_7

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lv8;

    move-object/from16 v5, v17

    check-cast v5, Lt8;

    iget-object v5, v5, Lt8;->c:Ln8;

    iget-object v5, v5, Ln8;->b:Lo8;

    move-object/from16 p3, v12

    add-int v12, v13, v11

    invoke-static {v5, v1, v2, v12}, Lb1;->A(Lo8;IZI)I

    move-result v5

    invoke-static {v15, v5}, Ljava/lang/Math;->max(II)I

    move-result v15

    move-object/from16 v12, p3

    const/4 v5, 0x1

    goto :goto_6

    :cond_7
    if-eqz v3, :cond_8

    sub-int/2addr v4, v6

    add-int/2addr v15, v7

    :goto_7
    const/4 v5, 0x1

    goto :goto_9

    :cond_8
    if-nez v1, :cond_9

    invoke-virtual/range {p0 .. p0}, Lo8;->n()I

    move-result v5

    goto :goto_8

    :cond_9
    invoke-virtual/range {p0 .. p0}, Lo8;->h()I

    move-result v5

    :goto_8
    mul-int v5, v5, v10

    add-int/2addr v15, v5

    goto :goto_7

    :goto_9
    if-ne v1, v5, :cond_e

    iget-object v5, v0, Lo8;->w:Ln8;

    .line 11
    iget-object v5, v5, Ln8;->a:Lt8;

    .line 12
    iget-object v5, v5, Lv8;->a:Ljava/util/HashSet;

    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v12, 0x0

    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lv8;

    move-object/from16 p3, v5

    move-object/from16 v5, v16

    check-cast v5, Lt8;

    move/from16 v17, v9

    const/4 v9, 0x1

    iget-object v5, v5, Lt8;->c:Ln8;

    iget-object v5, v5, Ln8;->b:Lo8;

    if-ne v10, v9, :cond_a

    add-int v9, v6, v11

    goto :goto_b

    :cond_a
    mul-int v9, v7, v10

    add-int/2addr v9, v11

    :goto_b
    invoke-static {v5, v1, v2, v9}, Lb1;->A(Lo8;IZI)I

    move-result v5

    invoke-static {v12, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    move v12, v5

    move-object/from16 v5, p3

    move/from16 v9, v17

    goto :goto_a

    :cond_b
    move/from16 v17, v9

    iget-object v5, v0, Lo8;->w:Ln8;

    .line 13
    iget-object v5, v5, Ln8;->a:Lt8;

    .line 14
    iget-object v5, v5, Lv8;->a:Ljava/util/HashSet;

    invoke-virtual {v5}, Ljava/util/HashSet;->size()I

    move-result v5

    if-lez v5, :cond_d

    if-nez v3, :cond_d

    const/4 v3, 0x1

    if-ne v10, v3, :cond_c

    add-int v3, v12, v6

    goto :goto_c

    :cond_c
    sub-int v3, v12, v7

    goto :goto_c

    :cond_d
    move v3, v12

    goto :goto_c

    :cond_e
    move/from16 v17, v9

    const/4 v3, 0x0

    :goto_c
    invoke-static {v15, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/2addr v3, v14

    add-int/2addr v13, v11

    const/4 v4, -0x1

    if-ne v10, v4, :cond_f

    move/from16 v18, v13

    move v13, v11

    move/from16 v11, v18

    :cond_f
    if-eqz v2, :cond_10

    invoke-static {v0, v1, v11}, Ls8;->b(Lo8;II)V

    invoke-virtual {v0, v11, v13, v1}, Lo8;->v(III)V

    goto :goto_d

    :cond_10
    iget-object v2, v0, Lo8;->p:Lq8;

    invoke-virtual {v2, v0, v1}, Lq8;->a(Lo8;I)V

    if-nez v1, :cond_11

    .line 15
    iput v11, v0, Lo8;->K:I

    goto :goto_d

    :cond_11
    const/4 v2, 0x1

    if-ne v1, v2, :cond_12

    iput v11, v0, Lo8;->L:I

    .line 16
    :cond_12
    :goto_d
    invoke-virtual/range {p0 .. p1}, Lo8;->g(I)Lo8$a;

    move-result-object v2

    sget-object v4, Lo8$a;->d:Lo8$a;

    if-ne v2, v4, :cond_13

    iget v2, v0, Lo8;->G:F

    const/4 v4, 0x0

    cmpl-float v2, v2, v4

    if-eqz v2, :cond_13

    iget-object v2, v0, Lo8;->p:Lq8;

    invoke-virtual {v2, v0, v1}, Lq8;->a(Lo8;I)V

    :cond_13
    iget-object v2, v0, Lo8;->A:[Ln8;

    aget-object v4, v2, v8

    iget-object v4, v4, Ln8;->d:Ln8;

    if-eqz v4, :cond_14

    aget-object v4, v2, v17

    iget-object v4, v4, Ln8;->d:Ln8;

    if-eqz v4, :cond_14

    .line 17
    iget-object v4, v0, Lo8;->D:Lo8;

    .line 18
    aget-object v5, v2, v8

    iget-object v5, v5, Ln8;->d:Ln8;

    iget-object v5, v5, Ln8;->b:Lo8;

    if-ne v5, v4, :cond_14

    aget-object v2, v2, v17

    iget-object v2, v2, Ln8;->d:Ln8;

    iget-object v2, v2, Ln8;->b:Lo8;

    if-ne v2, v4, :cond_14

    iget-object v2, v0, Lo8;->p:Lq8;

    invoke-virtual {v2, v0, v1}, Lq8;->a(Lo8;I)V

    :cond_14
    return v3
.end method

.method public static B(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I
    .locals 0

    invoke-static {p1, p2}, Lb1;->N(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    return p4

    :cond_0
    invoke-virtual {p0, p3, p4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p0

    return p0
.end method

.method public static C(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;II)Lr9;
    .locals 2

    invoke-static {p1, p3}, Lb1;->N(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result p1

    const/4 p3, 0x0

    if-eqz p1, :cond_1

    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0, p4, p1}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    iget v0, p1, Landroid/util/TypedValue;->type:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    const/16 v1, 0x1f

    if-gt v0, v1, :cond_0

    iget p0, p1, Landroid/util/TypedValue;->data:I

    .line 1
    new-instance p1, Lr9;

    invoke-direct {p1, p3, p3, p0}, Lr9;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object p1

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p4, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p0

    .line 3
    :try_start_0
    invoke-static {p1, p0, p2}, Lr9;->a(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Lr9;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string p1, "ComplexColorCompat"

    const-string p2, "Failed to inflate ComplexColor."

    invoke-static {p1, p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object p0, p3

    :goto_0
    if-eqz p0, :cond_1

    return-object p0

    .line 4
    :cond_1
    new-instance p0, Lr9;

    invoke-direct {p0, p3, p3, p5}, Lr9;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object p0
.end method

.method public static D(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
    .locals 0

    invoke-static {p1, p2}, Lb1;->N(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    return p4

    :cond_0
    invoke-virtual {p0, p3, p4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p0

    return p0
.end method

.method public static E(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I
    .locals 0

    invoke-static {p1, p2}, Lb1;->N(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    return p4

    :cond_0
    invoke-virtual {p0, p3, p4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p0

    return p0
.end method

.method public static F(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;
    .locals 0

    invoke-static {p1, p2}, Lb1;->N(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static G(Landroid/content/res/TypedArray;IIILjava/lang/String;)Landroid/animation/PropertyValuesHolder;
    .locals 11

    invoke-virtual {p0, p2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    iget v0, v0, Landroid/util/TypedValue;->type:I

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0, p3}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v4

    if-eqz v4, :cond_2

    const/4 v5, 0x1

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    :goto_2
    if-eqz v5, :cond_3

    iget v4, v4, Landroid/util/TypedValue;->type:I

    goto :goto_3

    :cond_3
    const/4 v4, 0x0

    :goto_3
    const/4 v6, 0x4

    const/4 v7, 0x3

    if-ne p1, v6, :cond_7

    if-eqz v3, :cond_4

    invoke-static {v0}, Lb1;->Q(I)Z

    move-result p1

    if-nez p1, :cond_5

    :cond_4
    if-eqz v5, :cond_6

    invoke-static {v4}, Lb1;->Q(I)Z

    move-result p1

    if-eqz p1, :cond_6

    :cond_5
    const/4 p1, 0x3

    goto :goto_4

    :cond_6
    const/4 p1, 0x0

    :cond_7
    :goto_4
    if-nez p1, :cond_8

    const/4 v6, 0x1

    goto :goto_5

    :cond_8
    const/4 v6, 0x0

    :goto_5
    const/4 v8, 0x0

    const/4 v9, 0x2

    if-ne p1, v9, :cond_d

    invoke-virtual {p0, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1}, Lb1;->p(Ljava/lang/String;)[Laa;

    move-result-object p2

    invoke-static {p0}, Lb1;->p(Ljava/lang/String;)[Laa;

    move-result-object p3

    if-nez p2, :cond_9

    if-eqz p3, :cond_1e

    :cond_9
    if-eqz p2, :cond_c

    new-instance v0, Lpf;

    invoke-direct {v0}, Lpf;-><init>()V

    if-eqz p3, :cond_b

    invoke-static {p2, p3}, Lb1;->d([Laa;[Laa;)Z

    move-result v3

    if-eqz v3, :cond_a

    new-array p0, v9, [Ljava/lang/Object;

    aput-object p2, p0, v2

    aput-object p3, p0, v1

    invoke-static {p4, v0, p0}, Landroid/animation/PropertyValuesHolder;->ofObject(Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/PropertyValuesHolder;

    move-result-object p0

    goto :goto_6

    :cond_a
    new-instance p2, Landroid/view/InflateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, " Can\'t morph from "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_b
    new-array p0, v1, [Ljava/lang/Object;

    aput-object p2, p0, v2

    invoke-static {p4, v0, p0}, Landroid/animation/PropertyValuesHolder;->ofObject(Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/PropertyValuesHolder;

    move-result-object p0

    :goto_6
    move-object v8, p0

    goto/16 :goto_f

    :cond_c
    if-eqz p3, :cond_1e

    new-instance p0, Lpf;

    invoke-direct {p0}, Lpf;-><init>()V

    new-array p1, v1, [Ljava/lang/Object;

    aput-object p3, p1, v2

    invoke-static {p4, p0, p1}, Landroid/animation/PropertyValuesHolder;->ofObject(Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/PropertyValuesHolder;

    move-result-object v8

    goto/16 :goto_f

    :cond_d
    if-ne p1, v7, :cond_e

    .line 1
    sget-object p1, Lqf;->a:Lqf;

    goto :goto_7

    :cond_e
    move-object p1, v8

    :goto_7
    const/4 v7, 0x5

    const/4 v10, 0x0

    if-eqz v6, :cond_14

    if-eqz v3, :cond_12

    if-ne v0, v7, :cond_f

    .line 2
    invoke-virtual {p0, p2, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    goto :goto_8

    :cond_f
    invoke-virtual {p0, p2, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    :goto_8
    if-eqz v5, :cond_11

    if-ne v4, v7, :cond_10

    invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p0

    goto :goto_9

    :cond_10
    invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p0

    :goto_9
    new-array p3, v9, [F

    aput p2, p3, v2

    aput p0, p3, v1

    invoke-static {p4, p3}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object p0

    goto/16 :goto_e

    :cond_11
    new-array p0, v1, [F

    aput p2, p0, v2

    invoke-static {p4, p0}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object p0

    goto/16 :goto_e

    :cond_12
    if-ne v4, v7, :cond_13

    invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p0

    goto :goto_a

    :cond_13
    invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p0

    :goto_a
    new-array p2, v1, [F

    aput p0, p2, v2

    invoke-static {p4, p2}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object p0

    goto/16 :goto_e

    :cond_14
    if-eqz v3, :cond_1a

    if-ne v0, v7, :cond_15

    invoke-virtual {p0, p2, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    float-to-int p2, p2

    goto :goto_b

    :cond_15
    invoke-static {v0}, Lb1;->Q(I)Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-virtual {p0, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    goto :goto_b

    :cond_16
    invoke-virtual {p0, p2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    :goto_b
    if-eqz v5, :cond_19

    if-ne v4, v7, :cond_17

    invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p0

    float-to-int p0, p0

    goto :goto_c

    :cond_17
    invoke-static {v4}, Lb1;->Q(I)Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-virtual {p0, p3, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p0

    goto :goto_c

    :cond_18
    invoke-virtual {p0, p3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p0

    :goto_c
    new-array p3, v9, [I

    aput p2, p3, v2

    aput p0, p3, v1

    invoke-static {p4, p3}, Landroid/animation/PropertyValuesHolder;->ofInt(Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;

    move-result-object p0

    goto :goto_e

    :cond_19
    new-array p0, v1, [I

    aput p2, p0, v2

    invoke-static {p4, p0}, Landroid/animation/PropertyValuesHolder;->ofInt(Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;

    move-result-object p0

    goto :goto_e

    :cond_1a
    if-eqz v5, :cond_1d

    if-ne v4, v7, :cond_1b

    invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p0

    float-to-int p0, p0

    goto :goto_d

    :cond_1b
    invoke-static {v4}, Lb1;->Q(I)Z

    move-result p2

    if-eqz p2, :cond_1c

    invoke-virtual {p0, p3, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p0

    goto :goto_d

    :cond_1c
    invoke-virtual {p0, p3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p0

    :goto_d
    new-array p2, v1, [I

    aput p0, p2, v2

    invoke-static {p4, p2}, Landroid/animation/PropertyValuesHolder;->ofInt(Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;

    move-result-object p0

    :goto_e
    move-object v8, p0

    :cond_1d
    if-eqz v8, :cond_1e

    if-eqz p1, :cond_1e

    invoke-virtual {v8, p1}, Landroid/animation/PropertyValuesHolder;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    :cond_1e
    :goto_f
    return-object v8
.end method

.method public static H(Landroid/app/Activity;)Landroid/content/Intent;
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getParentActivityIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 1
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v0

    invoke-static {p0, v0}, Lb1;->J(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return-object v1

    .line 2
    :cond_1
    new-instance v2, Landroid/content/ComponentName;

    invoke-direct {v2, p0, v0}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    :try_start_1
    invoke-static {p0, v2}, Lb1;->J(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2

    invoke-static {v2}, Landroid/content/Intent;->makeMainActivity(Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object p0

    goto :goto_0

    :cond_2
    new-instance p0, Landroid/content/Intent;

    invoke-direct {p0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p0, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object p0
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_0
    return-object p0

    :catch_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getParentActivityIntent: bad parentActivityName \'"

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' in manifest"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "NavUtils"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :catch_1
    move-exception p0

    .line 3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static I(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;
    .locals 2

    invoke-static {p0, p1}, Lb1;->J(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v1, Landroid/content/ComponentName;

    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0, v1}, Lb1;->J(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    invoke-static {v1}, Landroid/content/Intent;->makeMainActivity(Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object p0

    goto :goto_0

    :cond_1
    new-instance p0, Landroid/content/Intent;

    invoke-direct {p0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static J(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    const/16 v1, 0x280

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object p1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    iget-object v0, p1, Landroid/content/pm/ActivityInfo;->parentActivityName:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    const/4 v0, 0x0

    if-nez p1, :cond_1

    return-object v0

    :cond_1
    const-string v1, "android.support.PARENT_ACTIVITY"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    return-object v0

    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x2e

    if-ne v0, v1, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_3
    return-object p1
.end method

.method public static K(Lo8;I)I
    .locals 4

    mul-int/lit8 v0, p1, 0x2

    iget-object v1, p0, Lo8;->A:[Ln8;

    aget-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    aget-object v0, v1, v0

    iget-object v1, v2, Ln8;->d:Ln8;

    if-eqz v1, :cond_1

    iget-object v1, v1, Ln8;->b:Lo8;

    iget-object v3, p0, Lo8;->D:Lo8;

    if-ne v1, v3, :cond_1

    iget-object v1, v0, Ln8;->d:Ln8;

    if-eqz v1, :cond_1

    iget-object v1, v1, Ln8;->b:Lo8;

    if-ne v1, v3, :cond_1

    invoke-virtual {v3, p1}, Lo8;->j(I)I

    move-result v1

    if-nez p1, :cond_0

    iget v3, p0, Lo8;->V:F

    goto :goto_0

    :cond_0
    iget v3, p0, Lo8;->W:F

    :goto_0
    invoke-virtual {p0, p1}, Lo8;->j(I)I

    move-result p0

    invoke-virtual {v2}, Ln8;->b()I

    move-result p1

    sub-int/2addr v1, p1

    invoke-virtual {v0}, Ln8;->b()I

    move-result p1

    sub-int/2addr v1, p1

    sub-int/2addr v1, p0

    int-to-float p0, v1

    mul-float p0, p0, v3

    float-to-int p0, p0

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static L(Landroid/content/Context;)Ljava/io/File;
    .locals 5

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const-string v1, ".font"

    invoke-static {v1}, Lgg;->d(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x64

    if-ge v2, v3, :cond_2

    new-instance v3, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, p0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    move-result v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v4, :cond_1

    return-object v3

    :catch_0
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static M(Landroid/widget/TextView;)Lgb;
    .locals 10

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    new-instance v0, Lgb;

    invoke-virtual {p0}, Landroid/widget/TextView;->getTextMetricsParams()Landroid/text/PrecomputedText$Params;

    move-result-object p0

    invoke-direct {v0, p0}, Lgb;-><init>(Landroid/text/PrecomputedText$Params;)V

    return-object v0

    :cond_0
    new-instance v0, Landroid/text/TextPaint;

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    .line 1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v3, 0x0

    const/16 v4, 0x17

    const/4 v5, 0x1

    if-lt v2, v4, :cond_1

    const/4 v2, 0x1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    const/4 v6, 0x0

    :goto_0
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x12

    if-lt v7, v8, :cond_2

    sget-object v7, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    .line 2
    :goto_1
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v9, v4, :cond_3

    invoke-virtual {p0}, Landroid/widget/TextView;->getBreakStrategy()I

    move-result v2

    invoke-virtual {p0}, Landroid/widget/TextView;->getHyphenationFrequency()I

    move-result v6

    :cond_3
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v4, v8, :cond_a

    .line 3
    invoke-virtual {p0}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v4

    instance-of v4, v4, Landroid/text/method/PasswordTransformationMethod;

    if-eqz v4, :cond_5

    :cond_4
    :pswitch_0
    sget-object p0, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    :goto_2
    move-object v7, p0

    goto :goto_4

    :cond_5
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v4, v1, :cond_6

    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    move-result v1

    and-int/lit8 v1, v1, 0xf

    const/4 v4, 0x3

    if-ne v1, v4, :cond_6

    invoke-virtual {p0}, Landroid/widget/TextView;->getTextLocale()Ljava/util/Locale;

    move-result-object p0

    invoke-static {p0}, Landroid/icu/text/DecimalFormatSymbols;->getInstance(Ljava/util/Locale;)Landroid/icu/text/DecimalFormatSymbols;

    move-result-object p0

    invoke-virtual {p0}, Landroid/icu/text/DecimalFormatSymbols;->getDigitStrings()[Ljava/lang/String;

    move-result-object p0

    aget-object p0, p0, v3

    invoke-virtual {p0, v3}, Ljava/lang/String;->codePointAt(I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Character;->getDirectionality(I)B

    move-result p0

    if-eq p0, v5, :cond_9

    const/4 v1, 0x2

    if-ne p0, v1, :cond_4

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Landroid/widget/TextView;->getLayoutDirection()I

    move-result v1

    if-ne v1, v5, :cond_7

    const/4 v3, 0x1

    :cond_7
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextDirection()I

    move-result p0

    packed-switch p0, :pswitch_data_0

    if-eqz v3, :cond_8

    :pswitch_1
    sget-object p0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_RTL:Landroid/text/TextDirectionHeuristic;

    goto :goto_2

    :cond_8
    :pswitch_2
    sget-object p0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    goto :goto_2

    :pswitch_3
    sget-object p0, Landroid/text/TextDirectionHeuristics;->LOCALE:Landroid/text/TextDirectionHeuristic;

    goto :goto_2

    :cond_9
    :goto_3
    :pswitch_4
    sget-object p0, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    goto :goto_2

    :pswitch_5
    sget-object p0, Landroid/text/TextDirectionHeuristics;->ANYRTL_LTR:Landroid/text/TextDirectionHeuristic;

    goto :goto_2

    .line 4
    :cond_a
    :goto_4
    new-instance p0, Lgb;

    invoke-direct {p0, v0, v7, v2, v6}, Lgb;-><init>(Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;II)V

    return-object p0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static N(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "http://schemas.android.com/apk/res/android"

    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static varargs O([Ljava/lang/Object;)I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result p0

    return p0

    :cond_0
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static P(Landroid/graphics/drawable/Drawable;)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isAutoMirrored()Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static Q(I)Z
    .locals 1

    const/16 v0, 0x1c

    if-lt p0, v0, :cond_0

    const/16 v0, 0x1f

    if-gt p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static R(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Landroid/animation/ValueAnimator;FLorg/xmlpull/v1/XmlPullParser;)Landroid/animation/ValueAnimator;
    .locals 19

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    sget-object v4, Lkf;->g:[I

    invoke-static {v0, v1, v2, v4}, Lb1;->V(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v4

    sget-object v5, Lkf;->k:[I

    invoke-static {v0, v1, v2, v5}, Lb1;->V(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    if-nez p4, :cond_0

    new-instance v1, Landroid/animation/ValueAnimator;

    invoke-direct {v1}, Landroid/animation/ValueAnimator;-><init>()V

    goto :goto_0

    :cond_0
    move-object/from16 v1, p4

    :goto_0
    const/16 v2, 0x12c

    const-string v5, "duration"

    const/4 v6, 0x1

    .line 1
    invoke-static {v4, v3, v5, v6, v2}, Lb1;->E(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v2

    int-to-long v7, v2

    const-string v2, "startOffset"

    const/4 v5, 0x2

    const/4 v9, 0x0

    invoke-static {v4, v3, v2, v5, v9}, Lb1;->E(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v2

    int-to-long v10, v2

    const/4 v2, 0x7

    const/4 v12, 0x4

    const-string v13, "valueType"

    invoke-static {v4, v3, v13, v2, v12}, Lb1;->E(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v2

    const-string v13, "valueFrom"

    invoke-static {v3, v13}, Lb1;->N(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v13

    const/4 v14, 0x3

    if-eqz v13, :cond_9

    const-string v13, "valueTo"

    invoke-static {v3, v13}, Lb1;->N(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_9

    const/4 v13, 0x6

    const/4 v15, 0x5

    if-ne v2, v12, :cond_8

    .line 2
    invoke-virtual {v4, v15}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v2

    if-eqz v2, :cond_1

    const/16 v16, 0x1

    goto :goto_1

    :cond_1
    const/16 v16, 0x0

    :goto_1
    if-eqz v16, :cond_2

    iget v2, v2, Landroid/util/TypedValue;->type:I

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    invoke-virtual {v4, v13}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v5

    if-eqz v5, :cond_3

    const/16 v17, 0x1

    goto :goto_3

    :cond_3
    const/16 v17, 0x0

    :goto_3
    if-eqz v17, :cond_4

    iget v5, v5, Landroid/util/TypedValue;->type:I

    goto :goto_4

    :cond_4
    const/4 v5, 0x0

    :goto_4
    if-eqz v16, :cond_5

    invoke-static {v2}, Lb1;->Q(I)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_5
    if-eqz v17, :cond_7

    invoke-static {v5}, Lb1;->Q(I)Z

    move-result v2

    if-eqz v2, :cond_7

    :cond_6
    const/4 v2, 0x3

    goto :goto_5

    :cond_7
    const/4 v2, 0x0

    :cond_8
    :goto_5
    const-string v5, ""

    .line 3
    invoke-static {v4, v2, v15, v13, v5}, Lb1;->G(Landroid/content/res/TypedArray;IIILjava/lang/String;)Landroid/animation/PropertyValuesHolder;

    move-result-object v2

    if-eqz v2, :cond_9

    new-array v5, v6, [Landroid/animation/PropertyValuesHolder;

    aput-object v2, v5, v9

    invoke-virtual {v1, v5}, Landroid/animation/ValueAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    :cond_9
    invoke-virtual {v1, v7, v8}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {v1, v10, v11}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    const-string v2, "repeatCount"

    invoke-static {v4, v3, v2, v14, v9}, Lb1;->E(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    const-string v2, "repeatMode"

    invoke-static {v4, v3, v2, v12, v6}, Lb1;->E(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    if-eqz v0, :cond_14

    .line 4
    move-object v2, v1

    check-cast v2, Landroid/animation/ObjectAnimator;

    const-string v5, "pathData"

    invoke-static {v0, v3, v5, v6}, Lb1;->F(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_13

    const-string v7, "propertyXName"

    const/4 v8, 0x2

    invoke-static {v0, v3, v7, v8}, Lb1;->F(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v7

    const-string v8, "propertyYName"

    invoke-static {v0, v3, v8, v14}, Lb1;->F(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v8

    if-nez v7, :cond_b

    if-eqz v8, :cond_a

    goto :goto_6

    :cond_a
    new-instance v1, Landroid/view/InflateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " propertyXName or propertyYName is needed for PathData"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b
    :goto_6
    invoke-static {v5}, Lb1;->q(Ljava/lang/String;)Landroid/graphics/Path;

    move-result-object v5

    const/high16 v10, 0x3f000000    # 0.5f

    mul-float v10, v10, p5

    .line 5
    new-instance v11, Landroid/graphics/PathMeasure;

    invoke-direct {v11, v5, v9}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    const/4 v13, 0x0

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v14, 0x0

    :cond_c
    invoke-virtual {v11}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v15

    add-float/2addr v14, v15

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v11}, Landroid/graphics/PathMeasure;->nextContour()Z

    move-result v15

    if-nez v15, :cond_c

    new-instance v11, Landroid/graphics/PathMeasure;

    invoke-direct {v11, v5, v9}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    const/16 v5, 0x64

    div-float v10, v14, v10

    float-to-int v10, v10

    add-int/2addr v10, v6

    invoke-static {v5, v10}, Ljava/lang/Math;->min(II)I

    move-result v5

    new-array v10, v5, [F

    new-array v15, v5, [F

    const/4 v13, 0x2

    new-array v6, v13, [F

    add-int/lit8 v13, v5, -0x1

    int-to-float v13, v13

    div-float/2addr v14, v13

    move-object/from16 v16, v1

    move-object/from16 v17, v4

    const/4 v1, 0x0

    const/4 v13, 0x0

    :goto_7
    const/4 v4, 0x0

    if-ge v9, v5, :cond_e

    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ljava/lang/Float;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Float;->floatValue()F

    move-result v18

    move/from16 p5, v5

    sub-float v5, v13, v18

    invoke-virtual {v11, v5, v6, v4}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    const/4 v4, 0x0

    aget v5, v6, v4

    aput v5, v10, v9

    const/4 v4, 0x1

    aget v5, v6, v4

    aput v5, v15, v9

    add-float/2addr v13, v14

    add-int/lit8 v4, v1, 0x1

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_d

    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    cmpl-float v5, v13, v5

    if-lez v5, :cond_d

    invoke-virtual {v11}, Landroid/graphics/PathMeasure;->nextContour()Z

    move v1, v4

    :cond_d
    add-int/lit8 v9, v9, 0x1

    move/from16 v5, p5

    goto :goto_7

    :cond_e
    if-eqz v7, :cond_f

    invoke-static {v7, v10}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v1

    goto :goto_8

    :cond_f
    move-object v1, v4

    :goto_8
    if-eqz v8, :cond_10

    invoke-static {v8, v15}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v4

    :cond_10
    const/4 v6, 0x1

    if-nez v1, :cond_11

    new-array v1, v6, [Landroid/animation/PropertyValuesHolder;

    const/4 v9, 0x0

    aput-object v4, v1, v9

    invoke-virtual {v2, v1}, Landroid/animation/ObjectAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    goto :goto_9

    :cond_11
    const/4 v9, 0x0

    if-nez v4, :cond_12

    new-array v4, v6, [Landroid/animation/PropertyValuesHolder;

    aput-object v1, v4, v9

    invoke-virtual {v2, v4}, Landroid/animation/ObjectAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    goto :goto_9

    :cond_12
    const/4 v13, 0x2

    new-array v5, v13, [Landroid/animation/PropertyValuesHolder;

    aput-object v1, v5, v9

    aput-object v4, v5, v6

    invoke-virtual {v2, v5}, Landroid/animation/ObjectAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    goto :goto_9

    :cond_13
    move-object/from16 v16, v1

    move-object/from16 v17, v4

    const-string v1, "propertyName"

    .line 6
    invoke-static {v0, v3, v1, v9}, Lb1;->F(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/animation/ObjectAnimator;->setPropertyName(Ljava/lang/String;)V

    goto :goto_9

    :cond_14
    move-object/from16 v16, v1

    move-object/from16 v17, v4

    :goto_9
    const-string v1, "interpolator"

    .line 7
    invoke-static {v3, v1}, Lb1;->N(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_15

    move-object/from16 v1, v17

    goto :goto_a

    :cond_15
    move-object/from16 v1, v17

    invoke-virtual {v1, v9, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v9

    :goto_a
    if-lez v9, :cond_16

    move-object/from16 v2, p0

    .line 8
    invoke-static {v2, v9}, Lb1;->S(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object v2

    move-object/from16 v3, v16

    invoke-virtual {v3, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    goto :goto_b

    :cond_16
    move-object/from16 v3, v16

    :goto_b
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    :cond_17
    return-object v3
.end method

.method public static S(Landroid/content/Context;I)Landroid/view/animation/Interpolator;
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    const v1, 0x10c000f

    const-string v2, "Can\'t load animation resource ID #0x"

    if-ne p1, v1, :cond_1

    :try_start_0
    new-instance p0, Lge;

    invoke-direct {p0}, Lge;-><init>()V

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_2

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_1

    :cond_1
    const v1, 0x10c000d

    if-ne p1, v1, :cond_2

    new-instance p0, Lhe;

    invoke-direct {p0}, Lhe;-><init>()V

    return-object p0

    :cond_2
    const v1, 0x10c000e

    if-ne p1, v1, :cond_3

    new-instance p0, Lie;

    invoke-direct {p0}, Lie;-><init>()V

    return-object p0

    :cond_3
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getAnimation(I)Landroid/content/res/XmlResourceParser;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    invoke-static {p0, v0}, Lb1;->n(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)Landroid/view/animation/Interpolator;

    move-result-object p0
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Landroid/content/res/XmlResourceParser;->close()V

    return-object p0

    :goto_0
    :try_start_1
    new-instance v1, Landroid/content/res/Resources$NotFoundException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Landroid/content/res/Resources$NotFoundException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v1

    :goto_1
    new-instance v1, Landroid/content/res/Resources$NotFoundException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Landroid/content/res/Resources$NotFoundException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    if-eqz v0, :cond_4

    invoke-interface {v0}, Landroid/content/res/XmlResourceParser;->close()V

    :cond_4
    throw p0
.end method

.method public static T(Landroid/content/Context;Landroid/os/CancellationSignal;Landroid/net/Uri;)Ljava/nio/ByteBuffer;
    .locals 7

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "r"

    invoke-virtual {p0, p2, v1, p1}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;

    move-result-object p0

    if-nez p0, :cond_1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object v0

    :cond_1
    :try_start_1
    new-instance p1, Ljava/io/FileInputStream;

    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :try_start_2
    invoke-virtual {p1}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v5

    sget-object v2, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;

    const-wide/16 v3, 0x0

    invoke-virtual/range {v1 .. v6}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :try_start_4
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    return-object p2

    :catchall_0
    move-exception p2

    :try_start_5
    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v1

    :try_start_6
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception p1

    :try_start_7
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_3
    move-exception p1

    :try_start_8
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :catchall_4
    move-exception p2

    :try_start_9
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto :goto_1

    :catchall_5
    move-exception p0

    :try_start_a
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p2
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0

    :catch_0
    return-object v0
.end method

.method public static U(J)J
    .locals 4

    const-wide/32 v0, 0xffff

    and-long v2, p0, v0

    long-to-int v3, v2

    int-to-short v2, v3

    const/16 v3, 0x10

    ushr-long/2addr p0, v3

    and-long/2addr p0, v0

    long-to-int p1, p0

    int-to-short p0, p1

    add-int p1, v2, p0

    int-to-short p1, p1

    const/16 v0, 0x9

    invoke-static {p1, v0}, Lb1;->e0(SI)S

    move-result p1

    add-int/2addr p1, v2

    int-to-short p1, p1

    xor-int/2addr p0, v2

    int-to-short p0, p0

    const/16 v0, 0xd

    invoke-static {v2, v0}, Lb1;->e0(SI)S

    move-result v0

    xor-int/2addr v0, p0

    int-to-short v0, v0

    shl-int/lit8 v1, p0, 0x5

    xor-int/2addr v0, v1

    int-to-short v0, v0

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lb1;->e0(SI)S

    move-result p0

    int-to-long v1, p1

    shl-long/2addr v1, v3

    int-to-long p0, p0

    or-long/2addr p0, v1

    shl-long/2addr p0, v3

    int-to-long v0, v0

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static V(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    .locals 0

    if-nez p1, :cond_0

    invoke-virtual {p0, p2, p3}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    invoke-virtual {p1, p2, p3, p0, p0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p0

    return-object p0
.end method

.method public static W(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)Landroid/view/inputmethod/InputConnection;
    .locals 0

    if-eqz p0, :cond_0

    iget-object p1, p1, Landroid/view/inputmethod/EditorInfo;->hintText:Ljava/lang/CharSequence;

    if-nez p1, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    :goto_0
    instance-of p2, p1, Landroid/view/View;

    if-eqz p2, :cond_0

    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public static X(Landroid/view/ViewParent;Landroid/view/View;FFZ)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    :try_start_0
    invoke-interface {p0, p1, p2, p3, p4}, Landroid/view/ViewParent;->onNestedFling(Landroid/view/View;FFZ)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "ViewParent "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " does not implement interface method onNestedFling"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p2, "ViewParentCompat"

    invoke-static {p2, p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lrb;

    if-eqz v0, :cond_1

    check-cast p0, Lrb;

    invoke-interface {p0, p1, p2, p3, p4}, Lrb;->onNestedFling(Landroid/view/View;FFZ)Z

    move-result p0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static Y(Landroid/view/ViewParent;Landroid/view/View;FF)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    :try_start_0
    invoke-interface {p0, p1, p2, p3}, Landroid/view/ViewParent;->onNestedPreFling(Landroid/view/View;FF)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "ViewParent "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " does not implement interface method onNestedPreFling"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p2, "ViewParentCompat"

    invoke-static {p2, p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lrb;

    if-eqz v0, :cond_1

    check-cast p0, Lrb;

    invoke-interface {p0, p1, p2, p3}, Lrb;->onNestedPreFling(Landroid/view/View;FF)Z

    move-result p0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static Z(Landroid/view/ViewParent;Landroid/view/View;II[II)V
    .locals 7

    instance-of v0, p0, Lpb;

    if-eqz v0, :cond_0

    move-object v1, p0

    check-cast v1, Lpb;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p5

    invoke-interface/range {v1 .. v6}, Lpb;->e(Landroid/view/View;II[II)V

    goto :goto_0

    :cond_0
    if-nez p5, :cond_2

    sget p5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x15

    if-lt p5, v0, :cond_1

    :try_start_0
    invoke-interface {p0, p1, p2, p3, p4}, Landroid/view/ViewParent;->onNestedPreScroll(Landroid/view/View;II[I)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "ViewParent "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " does not implement interface method onNestedPreScroll"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p2, "ViewParentCompat"

    invoke-static {p2, p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_1
    instance-of p5, p0, Lrb;

    if-eqz p5, :cond_2

    check-cast p0, Lrb;

    invoke-interface {p0, p1, p2, p3, p4}, Lrb;->onNestedPreScroll(Landroid/view/View;II[I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static a(Lp8;Lh8;I)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    sget-object v3, Lo8$a;->d:Lo8$a;

    const/4 v4, 0x2

    if-nez v2, :cond_0

    iget v6, v0, Lp8;->r0:I

    iget-object v7, v0, Lp8;->u0:[Lm8;

    const/4 v8, 0x0

    goto :goto_0

    :cond_0
    iget v6, v0, Lp8;->s0:I

    iget-object v7, v0, Lp8;->t0:[Lm8;

    const/4 v8, 0x2

    :goto_0
    move-object v10, v0

    move-object v11, v1

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v6, :cond_53

    aget-object v12, v7, v9

    .line 1
    iget-boolean v13, v12, Lm8;->q:Z

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/4 v5, 0x1

    if-nez v13, :cond_13

    .line 2
    iget v13, v12, Lm8;->l:I

    mul-int/lit8 v13, v13, 0x2

    iget-object v4, v12, Lm8;->a:Lo8;

    move-object/from16 v18, v4

    const/16 v19, 0x0

    :goto_2
    if-nez v19, :cond_10

    iget v15, v12, Lm8;->i:I

    add-int/2addr v15, v5

    iput v15, v12, Lm8;->i:I

    iget-object v15, v4, Lo8;->i0:[Lo8;

    iget v5, v12, Lm8;->l:I

    aput-object v14, v15, v5

    iget-object v15, v4, Lo8;->h0:[Lo8;

    aput-object v14, v15, v5

    .line 3
    iget v5, v4, Lo8;->Y:I

    const/16 v15, 0x8

    if-eq v5, v15, :cond_b

    .line 4
    iget-object v5, v12, Lm8;->b:Lo8;

    if-nez v5, :cond_1

    iput-object v4, v12, Lm8;->b:Lo8;

    :cond_1
    iput-object v4, v12, Lm8;->d:Lo8;

    iget-object v5, v4, Lo8;->C:[Lo8$a;

    iget v15, v12, Lm8;->l:I

    aget-object v5, v5, v15

    if-ne v5, v3, :cond_b

    iget-object v5, v4, Lo8;->g:[I

    aget v20, v5, v15

    const/4 v14, 0x3

    if-eqz v20, :cond_2

    aget v0, v5, v15

    if-eq v0, v14, :cond_2

    aget v0, v5, v15

    const/4 v5, 0x2

    if-ne v0, v5, :cond_b

    :cond_2
    iget v0, v12, Lm8;->j:I

    const/4 v5, 0x1

    add-int/2addr v0, v5

    iput v0, v12, Lm8;->j:I

    iget-object v0, v4, Lo8;->g0:[F

    iget v5, v12, Lm8;->l:I

    aget v15, v0, v5

    cmpl-float v20, v15, v16

    if-lez v20, :cond_3

    iget v14, v12, Lm8;->k:F

    aget v0, v0, v5

    add-float/2addr v14, v0

    iput v14, v12, Lm8;->k:F

    :cond_3
    iget v0, v12, Lm8;->l:I

    .line 5
    iget v5, v4, Lo8;->Y:I

    const/16 v14, 0x8

    if-eq v5, v14, :cond_5

    .line 6
    iget-object v5, v4, Lo8;->C:[Lo8$a;

    aget-object v5, v5, v0

    if-ne v5, v3, :cond_5

    iget-object v5, v4, Lo8;->g:[I

    aget v14, v5, v0

    if-eqz v14, :cond_4

    aget v0, v5, v0

    const/4 v5, 0x3

    if-ne v0, v5, :cond_5

    :cond_4
    const/4 v0, 0x1

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    :goto_3
    if-eqz v0, :cond_8

    cmpg-float v0, v15, v16

    if-gez v0, :cond_6

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, v12, Lm8;->n:Z

    goto :goto_4

    :cond_6
    const/4 v0, 0x1

    iput-boolean v0, v12, Lm8;->o:Z

    :goto_4
    iget-object v0, v12, Lm8;->h:Ljava/util/ArrayList;

    if-nez v0, :cond_7

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v12, Lm8;->h:Ljava/util/ArrayList;

    :cond_7
    iget-object v0, v12, Lm8;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    iget-object v0, v12, Lm8;->f:Lo8;

    if-nez v0, :cond_9

    iput-object v4, v12, Lm8;->f:Lo8;

    :cond_9
    iget-object v0, v12, Lm8;->g:Lo8;

    if-eqz v0, :cond_a

    iget-object v0, v0, Lo8;->h0:[Lo8;

    iget v5, v12, Lm8;->l:I

    aput-object v4, v0, v5

    :cond_a
    iput-object v4, v12, Lm8;->g:Lo8;

    :cond_b
    move-object/from16 v0, v18

    if-eq v0, v4, :cond_c

    iget-object v0, v0, Lo8;->i0:[Lo8;

    iget v5, v12, Lm8;->l:I

    aput-object v4, v0, v5

    :cond_c
    iget-object v0, v4, Lo8;->A:[Ln8;

    add-int/lit8 v5, v13, 0x1

    aget-object v0, v0, v5

    iget-object v0, v0, Ln8;->d:Ln8;

    if-eqz v0, :cond_d

    iget-object v0, v0, Ln8;->b:Lo8;

    iget-object v5, v0, Lo8;->A:[Ln8;

    aget-object v14, v5, v13

    iget-object v14, v14, Ln8;->d:Ln8;

    if-eqz v14, :cond_d

    aget-object v5, v5, v13

    iget-object v5, v5, Ln8;->d:Ln8;

    iget-object v5, v5, Ln8;->b:Lo8;

    if-eq v5, v4, :cond_e

    :cond_d
    const/4 v0, 0x0

    :cond_e
    if-eqz v0, :cond_f

    goto :goto_5

    :cond_f
    move-object v0, v4

    const/16 v19, 0x1

    :goto_5
    move-object/from16 v18, v4

    const/4 v5, 0x1

    const/4 v14, 0x0

    move-object v4, v0

    move-object/from16 v0, p0

    goto/16 :goto_2

    :cond_10
    iput-object v4, v12, Lm8;->c:Lo8;

    iget v0, v12, Lm8;->l:I

    if-nez v0, :cond_11

    iget-boolean v0, v12, Lm8;->m:Z

    if-eqz v0, :cond_11

    iput-object v4, v12, Lm8;->e:Lo8;

    goto :goto_6

    :cond_11
    iget-object v0, v12, Lm8;->a:Lo8;

    iput-object v0, v12, Lm8;->e:Lo8;

    :goto_6
    iget-boolean v0, v12, Lm8;->o:Z

    if-eqz v0, :cond_12

    iget-boolean v0, v12, Lm8;->n:Z

    if-eqz v0, :cond_12

    const/4 v0, 0x1

    goto :goto_7

    :cond_12
    const/4 v0, 0x0

    :goto_7
    iput-boolean v0, v12, Lm8;->p:Z

    :cond_13
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, v12, Lm8;->q:Z

    const/4 v0, 0x4

    .line 9
    invoke-virtual {v10, v0}, Lp8;->I(I)Z

    move-result v0

    if-eqz v0, :cond_51

    .line 10
    sget-object v0, Lo8$a;->c:Lo8$a;

    iget-object v4, v12, Lm8;->a:Lo8;

    iget-object v5, v12, Lm8;->c:Lo8;

    iget-object v11, v12, Lm8;->b:Lo8;

    iget-object v13, v12, Lm8;->d:Lo8;

    iget-object v14, v12, Lm8;->e:Lo8;

    iget v15, v12, Lm8;->k:F

    iget-object v10, v10, Lo8;->C:[Lo8$a;

    aget-object v10, v10, v2

    if-nez v2, :cond_16

    iget v10, v14, Lo8;->e0:I

    move/from16 v18, v6

    if-nez v10, :cond_14

    const/4 v10, 0x1

    goto :goto_8

    :cond_14
    const/4 v10, 0x0

    :goto_8
    iget v6, v14, Lo8;->e0:I

    move-object/from16 v19, v7

    const/4 v7, 0x1

    if-ne v6, v7, :cond_15

    const/4 v6, 0x1

    goto :goto_9

    :cond_15
    const/4 v6, 0x0

    :goto_9
    iget v7, v14, Lo8;->e0:I

    const/4 v14, 0x2

    if-ne v7, v14, :cond_1a

    goto :goto_c

    :cond_16
    move/from16 v18, v6

    move-object/from16 v19, v7

    iget v6, v14, Lo8;->f0:I

    if-nez v6, :cond_17

    const/4 v6, 0x1

    goto :goto_a

    :cond_17
    const/4 v6, 0x0

    :goto_a
    iget v7, v14, Lo8;->f0:I

    const/4 v10, 0x1

    if-ne v7, v10, :cond_18

    const/4 v7, 0x1

    goto :goto_b

    :cond_18
    const/4 v7, 0x0

    :goto_b
    iget v10, v14, Lo8;->f0:I

    const/4 v14, 0x2

    if-ne v10, v14, :cond_19

    move v10, v6

    move v6, v7

    :goto_c
    const/4 v7, 0x1

    goto :goto_d

    :cond_19
    move v10, v6

    move v6, v7

    :cond_1a
    const/4 v7, 0x0

    :goto_d
    move-object v14, v4

    move/from16 v22, v9

    move-object/from16 v24, v12

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/16 v17, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    :goto_e
    if-nez v17, :cond_28

    .line 11
    iget v1, v14, Lo8;->Y:I

    move/from16 v26, v15

    const/16 v15, 0x8

    if-eq v1, v15, :cond_1e

    add-int/lit8 v9, v9, 0x1

    if-nez v2, :cond_1b

    .line 12
    invoke-virtual {v14}, Lo8;->n()I

    move-result v1

    goto :goto_f

    :cond_1b
    invoke-virtual {v14}, Lo8;->h()I

    move-result v1

    :goto_f
    int-to-float v1, v1

    add-float v23, v23, v1

    if-eq v14, v11, :cond_1c

    iget-object v1, v14, Lo8;->A:[Ln8;

    aget-object v1, v1, v8

    invoke-virtual {v1}, Ln8;->b()I

    move-result v1

    int-to-float v1, v1

    add-float v23, v23, v1

    :cond_1c
    if-eq v14, v13, :cond_1d

    iget-object v1, v14, Lo8;->A:[Ln8;

    add-int/lit8 v15, v8, 0x1

    aget-object v1, v1, v15

    invoke-virtual {v1}, Ln8;->b()I

    move-result v1

    int-to-float v1, v1

    add-float v23, v23, v1

    :cond_1d
    iget-object v1, v14, Lo8;->A:[Ln8;

    aget-object v1, v1, v8

    invoke-virtual {v1}, Ln8;->b()I

    move-result v1

    int-to-float v1, v1

    add-float v25, v25, v1

    iget-object v1, v14, Lo8;->A:[Ln8;

    add-int/lit8 v15, v8, 0x1

    aget-object v1, v1, v15

    invoke-virtual {v1}, Ln8;->b()I

    move-result v1

    int-to-float v1, v1

    add-float v25, v25, v1

    :cond_1e
    iget-object v1, v14, Lo8;->A:[Ln8;

    aget-object v1, v1, v8

    .line 13
    iget v1, v14, Lo8;->Y:I

    const/16 v15, 0x8

    if-eq v1, v15, :cond_24

    .line 14
    iget-object v1, v14, Lo8;->C:[Lo8$a;

    aget-object v1, v1, v2

    if-ne v1, v3, :cond_24

    add-int/lit8 v12, v12, 0x1

    if-nez v2, :cond_20

    iget v1, v14, Lo8;->e:I

    if-eqz v1, :cond_1f

    goto :goto_10

    :cond_1f
    iget v1, v14, Lo8;->h:I

    if-nez v1, :cond_23

    iget v1, v14, Lo8;->i:I

    if-eqz v1, :cond_22

    goto :goto_10

    :cond_20
    iget v1, v14, Lo8;->f:I

    if-eqz v1, :cond_21

    goto :goto_10

    :cond_21
    iget v1, v14, Lo8;->k:I

    if-nez v1, :cond_23

    iget v1, v14, Lo8;->l:I

    if-eqz v1, :cond_22

    goto :goto_10

    :cond_22
    iget v1, v14, Lo8;->G:F

    cmpl-float v1, v1, v16

    if-eqz v1, :cond_24

    :cond_23
    :goto_10
    move-object/from16 v15, p1

    move-object/from16 v21, v3

    goto/16 :goto_2a

    :cond_24
    iget-object v1, v14, Lo8;->A:[Ln8;

    add-int/lit8 v15, v8, 0x1

    aget-object v1, v1, v15

    iget-object v1, v1, Ln8;->d:Ln8;

    if-eqz v1, :cond_26

    iget-object v1, v1, Ln8;->b:Lo8;

    iget-object v15, v1, Lo8;->A:[Ln8;

    move-object/from16 v27, v1

    aget-object v1, v15, v8

    iget-object v1, v1, Ln8;->d:Ln8;

    if-eqz v1, :cond_26

    aget-object v1, v15, v8

    iget-object v1, v1, Ln8;->d:Ln8;

    iget-object v1, v1, Ln8;->b:Lo8;

    if-eq v1, v14, :cond_25

    goto :goto_11

    :cond_25
    move-object/from16 v1, v27

    goto :goto_12

    :cond_26
    :goto_11
    const/4 v1, 0x0

    :goto_12
    if-eqz v1, :cond_27

    move-object v14, v1

    goto :goto_13

    :cond_27
    const/16 v17, 0x1

    :goto_13
    move-object/from16 v1, p1

    move/from16 v15, v26

    goto/16 :goto_e

    :cond_28
    move/from16 v26, v15

    iget-object v1, v4, Lo8;->A:[Ln8;

    aget-object v1, v1, v8

    .line 15
    iget-object v1, v1, Ln8;->a:Lt8;

    .line 16
    iget-object v15, v5, Lo8;->A:[Ln8;

    add-int/lit8 v17, v8, 0x1

    aget-object v15, v15, v17

    .line 17
    iget-object v15, v15, Ln8;->a:Lt8;

    move-object/from16 v21, v3

    .line 18
    iget-object v3, v1, Lt8;->d:Lt8;

    if-eqz v3, :cond_50

    move-object/from16 v27, v4

    iget-object v4, v15, Lt8;->d:Lt8;

    if-nez v4, :cond_29

    goto/16 :goto_29

    :cond_29
    iget v3, v3, Lv8;->b:I

    move-object/from16 v28, v5

    const/4 v5, 0x1

    if-ne v3, v5, :cond_50

    iget v3, v4, Lv8;->b:I

    if-eq v3, v5, :cond_2a

    goto/16 :goto_29

    :cond_2a
    if-lez v12, :cond_2b

    if-eq v12, v9, :cond_2b

    goto/16 :goto_29

    :cond_2b
    if-nez v7, :cond_2d

    if-nez v10, :cond_2d

    if-eqz v6, :cond_2c

    goto :goto_14

    :cond_2c
    const/4 v3, 0x0

    goto :goto_16

    :cond_2d
    :goto_14
    if-eqz v11, :cond_2e

    iget-object v3, v11, Lo8;->A:[Ln8;

    aget-object v3, v3, v8

    invoke-virtual {v3}, Ln8;->b()I

    move-result v3

    int-to-float v3, v3

    goto :goto_15

    :cond_2e
    const/4 v3, 0x0

    :goto_15
    if-eqz v13, :cond_2f

    iget-object v4, v13, Lo8;->A:[Ln8;

    aget-object v4, v4, v17

    invoke-virtual {v4}, Ln8;->b()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v3, v4

    :cond_2f
    :goto_16
    iget-object v4, v1, Lt8;->d:Lt8;

    iget v4, v4, Lt8;->g:F

    iget-object v5, v15, Lt8;->d:Lt8;

    iget v5, v5, Lt8;->g:F

    cmpg-float v13, v4, v5

    if-gez v13, :cond_30

    sub-float/2addr v5, v4

    goto :goto_17

    :cond_30
    sub-float v5, v4, v5

    :goto_17
    sub-float v5, v5, v23

    const/high16 v13, -0x40800000    # -1.0f

    if-lez v12, :cond_38

    if-ne v12, v9, :cond_38

    .line 19
    iget-object v3, v14, Lo8;->D:Lo8;

    if-eqz v3, :cond_31

    .line 20
    iget-object v3, v3, Lo8;->C:[Lo8$a;

    aget-object v3, v3, v2

    if-ne v3, v0, :cond_31

    goto/16 :goto_29

    :cond_31
    add-float v5, v5, v23

    sub-float v5, v5, v25

    move v0, v4

    move-object/from16 v4, v27

    :goto_18
    if-eqz v4, :cond_37

    iget-object v3, v4, Lo8;->i0:[Lo8;

    aget-object v3, v3, v2

    move-object/from16 v14, v28

    if-nez v3, :cond_33

    if-ne v4, v14, :cond_32

    goto :goto_19

    :cond_32
    move-object/from16 v15, p1

    goto :goto_1b

    :cond_33
    :goto_19
    int-to-float v6, v12

    div-float v6, v5, v6

    cmpl-float v7, v26, v16

    if-lez v7, :cond_35

    iget-object v6, v4, Lo8;->g0:[F

    aget v7, v6, v2

    cmpl-float v7, v7, v13

    if-nez v7, :cond_34

    const/4 v6, 0x0

    goto :goto_1a

    :cond_34
    aget v6, v6, v2

    mul-float v6, v6, v5

    div-float v6, v6, v26

    .line 21
    :cond_35
    :goto_1a
    iget v7, v4, Lo8;->Y:I

    const/16 v9, 0x8

    if-ne v7, v9, :cond_36

    const/4 v6, 0x0

    .line 22
    :cond_36
    iget-object v7, v4, Lo8;->A:[Ln8;

    aget-object v7, v7, v8

    invoke-virtual {v7}, Ln8;->b()I

    move-result v7

    int-to-float v7, v7

    add-float/2addr v0, v7

    iget-object v7, v4, Lo8;->A:[Ln8;

    aget-object v7, v7, v8

    .line 23
    iget-object v7, v7, Ln8;->a:Lt8;

    .line 24
    iget-object v9, v1, Lt8;->f:Lt8;

    invoke-virtual {v7, v9, v0}, Lt8;->j(Lt8;F)V

    iget-object v7, v4, Lo8;->A:[Ln8;

    aget-object v7, v7, v17

    .line 25
    iget-object v7, v7, Ln8;->a:Lt8;

    .line 26
    iget-object v9, v1, Lt8;->f:Lt8;

    add-float/2addr v0, v6

    invoke-virtual {v7, v9, v0}, Lt8;->j(Lt8;F)V

    iget-object v6, v4, Lo8;->A:[Ln8;

    aget-object v6, v6, v8

    .line 27
    iget-object v6, v6, Ln8;->a:Lt8;

    move-object/from16 v15, p1

    .line 28
    invoke-virtual {v6, v15}, Lt8;->e(Lh8;)V

    iget-object v6, v4, Lo8;->A:[Ln8;

    aget-object v6, v6, v17

    .line 29
    iget-object v6, v6, Ln8;->a:Lt8;

    .line 30
    invoke-virtual {v6, v15}, Lt8;->e(Lh8;)V

    iget-object v4, v4, Lo8;->A:[Ln8;

    aget-object v4, v4, v17

    invoke-virtual {v4}, Ln8;->b()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v0, v4

    :goto_1b
    move-object v4, v3

    move-object/from16 v28, v14

    goto :goto_18

    :cond_37
    move-object/from16 v15, p1

    goto/16 :goto_1f

    :cond_38
    move-object/from16 v15, p1

    move-object/from16 v14, v28

    cmpg-float v0, v5, v16

    if-gez v0, :cond_39

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v10, 0x0

    :cond_39
    if-eqz v7, :cond_3f

    sub-float/2addr v5, v3

    if-nez v2, :cond_3a

    move-object/from16 v0, v27

    .line 31
    iget v13, v0, Lo8;->V:F

    goto :goto_1c

    :cond_3a
    move-object/from16 v0, v27

    const/4 v3, 0x1

    if-ne v2, v3, :cond_3b

    iget v13, v0, Lo8;->W:F

    :cond_3b
    :goto_1c
    mul-float v5, v5, v13

    add-float/2addr v5, v4

    :cond_3c
    :goto_1d
    move-object v4, v0

    if-eqz v4, :cond_40

    .line 32
    iget-object v0, v4, Lo8;->i0:[Lo8;

    aget-object v0, v0, v2

    if-nez v0, :cond_3d

    if-ne v4, v14, :cond_3c

    :cond_3d
    if-nez v2, :cond_3e

    invoke-virtual {v4}, Lo8;->n()I

    move-result v3

    goto :goto_1e

    :cond_3e
    invoke-virtual {v4}, Lo8;->h()I

    move-result v3

    :goto_1e
    int-to-float v3, v3

    iget-object v6, v4, Lo8;->A:[Ln8;

    aget-object v6, v6, v8

    invoke-virtual {v6}, Ln8;->b()I

    move-result v6

    int-to-float v6, v6

    add-float/2addr v5, v6

    iget-object v6, v4, Lo8;->A:[Ln8;

    aget-object v6, v6, v8

    .line 33
    iget-object v6, v6, Ln8;->a:Lt8;

    .line 34
    iget-object v7, v1, Lt8;->f:Lt8;

    invoke-virtual {v6, v7, v5}, Lt8;->j(Lt8;F)V

    iget-object v6, v4, Lo8;->A:[Ln8;

    aget-object v6, v6, v17

    .line 35
    iget-object v6, v6, Ln8;->a:Lt8;

    .line 36
    iget-object v7, v1, Lt8;->f:Lt8;

    add-float/2addr v5, v3

    invoke-virtual {v6, v7, v5}, Lt8;->j(Lt8;F)V

    iget-object v3, v4, Lo8;->A:[Ln8;

    aget-object v3, v3, v8

    .line 37
    iget-object v3, v3, Ln8;->a:Lt8;

    .line 38
    invoke-virtual {v3, v15}, Lt8;->e(Lh8;)V

    iget-object v3, v4, Lo8;->A:[Ln8;

    aget-object v3, v3, v17

    .line 39
    iget-object v3, v3, Ln8;->a:Lt8;

    .line 40
    invoke-virtual {v3, v15}, Lt8;->e(Lh8;)V

    iget-object v3, v4, Lo8;->A:[Ln8;

    aget-object v3, v3, v17

    invoke-virtual {v3}, Ln8;->b()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v5, v3

    goto :goto_1d

    :cond_3f
    move-object/from16 v0, v27

    if-nez v10, :cond_41

    if-eqz v6, :cond_40

    goto :goto_20

    :cond_40
    :goto_1f
    const/4 v6, 0x1

    goto/16 :goto_28

    :cond_41
    :goto_20
    if-eqz v10, :cond_42

    goto :goto_21

    :cond_42
    if-eqz v6, :cond_43

    :goto_21
    sub-float/2addr v5, v3

    :cond_43
    add-int/lit8 v3, v9, 0x1

    int-to-float v3, v3

    div-float v3, v5, v3

    if-eqz v6, :cond_45

    const/4 v7, 0x1

    if-le v9, v7, :cond_44

    add-int/lit8 v3, v9, -0x1

    int-to-float v3, v3

    goto :goto_22

    :cond_44
    const/high16 v3, 0x40000000    # 2.0f

    :goto_22
    div-float v3, v5, v3

    .line 41
    :cond_45
    iget v5, v0, Lo8;->Y:I

    const/16 v7, 0x8

    if-eq v5, v7, :cond_46

    add-float v5, v4, v3

    goto :goto_23

    :cond_46
    move v5, v4

    :goto_23
    if-eqz v6, :cond_47

    const/4 v6, 0x1

    if-le v9, v6, :cond_48

    .line 42
    iget-object v5, v11, Lo8;->A:[Ln8;

    aget-object v5, v5, v8

    invoke-virtual {v5}, Ln8;->b()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr v5, v4

    goto :goto_24

    :cond_47
    const/4 v6, 0x1

    :cond_48
    :goto_24
    if-eqz v10, :cond_49

    if-eqz v11, :cond_49

    iget-object v4, v11, Lo8;->A:[Ln8;

    aget-object v4, v4, v8

    invoke-virtual {v4}, Ln8;->b()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v5, v4

    :cond_49
    move-object v4, v0

    :goto_25
    if-eqz v4, :cond_4f

    iget-object v0, v4, Lo8;->i0:[Lo8;

    aget-object v0, v0, v2

    if-nez v0, :cond_4a

    if-ne v4, v14, :cond_49

    :cond_4a
    if-nez v2, :cond_4b

    invoke-virtual {v4}, Lo8;->n()I

    move-result v7

    goto :goto_26

    :cond_4b
    invoke-virtual {v4}, Lo8;->h()I

    move-result v7

    :goto_26
    int-to-float v7, v7

    if-eq v4, v11, :cond_4c

    iget-object v9, v4, Lo8;->A:[Ln8;

    aget-object v9, v9, v8

    invoke-virtual {v9}, Ln8;->b()I

    move-result v9

    int-to-float v9, v9

    add-float/2addr v5, v9

    :cond_4c
    iget-object v9, v4, Lo8;->A:[Ln8;

    aget-object v9, v9, v8

    .line 43
    iget-object v9, v9, Ln8;->a:Lt8;

    .line 44
    iget-object v10, v1, Lt8;->f:Lt8;

    invoke-virtual {v9, v10, v5}, Lt8;->j(Lt8;F)V

    iget-object v9, v4, Lo8;->A:[Ln8;

    aget-object v9, v9, v17

    .line 45
    iget-object v9, v9, Ln8;->a:Lt8;

    .line 46
    iget-object v10, v1, Lt8;->f:Lt8;

    add-float v12, v5, v7

    invoke-virtual {v9, v10, v12}, Lt8;->j(Lt8;F)V

    iget-object v9, v4, Lo8;->A:[Ln8;

    aget-object v9, v9, v8

    .line 47
    iget-object v9, v9, Ln8;->a:Lt8;

    .line 48
    invoke-virtual {v9, v15}, Lt8;->e(Lh8;)V

    iget-object v9, v4, Lo8;->A:[Ln8;

    aget-object v9, v9, v17

    .line 49
    iget-object v9, v9, Ln8;->a:Lt8;

    .line 50
    invoke-virtual {v9, v15}, Lt8;->e(Lh8;)V

    iget-object v4, v4, Lo8;->A:[Ln8;

    aget-object v4, v4, v17

    invoke-virtual {v4}, Ln8;->b()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v7, v4

    add-float/2addr v7, v5

    if-eqz v0, :cond_4d

    .line 51
    iget v4, v0, Lo8;->Y:I

    const/16 v5, 0x8

    if-eq v4, v5, :cond_4e

    add-float/2addr v7, v3

    goto :goto_27

    :cond_4d
    const/16 v5, 0x8

    :cond_4e
    :goto_27
    move-object v4, v0

    move v5, v7

    goto :goto_25

    :cond_4f
    :goto_28
    const/4 v5, 0x1

    goto :goto_2b

    :cond_50
    :goto_29
    move-object/from16 v15, p1

    :goto_2a
    const/4 v5, 0x0

    :goto_2b
    move-object/from16 v10, p0

    move-object v11, v15

    if-nez v5, :cond_52

    move-object/from16 v0, v24

    goto :goto_2c

    :cond_51
    move-object v15, v1

    move-object/from16 v21, v3

    move/from16 v18, v6

    move-object/from16 v19, v7

    move/from16 v22, v9

    move-object v0, v12

    .line 52
    :goto_2c
    invoke-static {v10, v11, v2, v8, v0}, Lb1;->b(Lp8;Lh8;IILm8;)V

    :cond_52
    add-int/lit8 v9, v22, 0x1

    move-object/from16 v0, p0

    move-object v1, v15

    move/from16 v6, v18

    move-object/from16 v7, v19

    move-object/from16 v3, v21

    const/4 v4, 0x2

    goto/16 :goto_1

    :cond_53
    return-void
.end method

.method public static a0(Landroid/view/ViewParent;Landroid/view/View;IIIII[I)V
    .locals 10

    move-object v1, p0

    instance-of v0, v1, Lqb;

    if-eqz v0, :cond_0

    check-cast v1, Lqb;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    invoke-interface/range {v1 .. v8}, Lqb;->b(Landroid/view/View;IIIII[I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    aget v2, p7, v0

    add-int/2addr v2, p4

    aput v2, p7, v0

    const/4 v0, 0x1

    aget v2, p7, v0

    add-int/2addr v2, p5

    aput v2, p7, v0

    instance-of v0, v1, Lpb;

    if-eqz v0, :cond_1

    move-object v3, v1

    check-cast v3, Lpb;

    move-object v4, p1

    move v5, p2

    move v6, p3

    move v7, p4

    move v8, p5

    move/from16 v9, p6

    invoke-interface/range {v3 .. v9}, Lpb;->c(Landroid/view/View;IIIII)V

    goto :goto_0

    :cond_1
    if-nez p6, :cond_3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v0, v2, :cond_2

    :try_start_0
    invoke-interface/range {p0 .. p5}, Landroid/view/ViewParent;->onNestedScroll(Landroid/view/View;IIII)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v2, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ViewParent "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " does not implement interface method onNestedScroll"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ViewParentCompat"

    invoke-static {v1, v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_2
    instance-of v0, v1, Lrb;

    if-eqz v0, :cond_3

    move-object v3, v1

    check-cast v3, Lrb;

    move-object v4, p1

    move v5, p2

    move v6, p3

    move v7, p4

    move v8, p5

    invoke-interface/range {v3 .. v8}, Lrb;->onNestedScroll(Landroid/view/View;IIII)V

    :cond_3
    :goto_0
    return-void
.end method

.method public static b(Lp8;Lh8;IILm8;)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    move-object/from16 v1, p4

    iget-object v10, v1, Lm8;->a:Lo8;

    iget-object v11, v1, Lm8;->c:Lo8;

    iget-object v12, v1, Lm8;->b:Lo8;

    iget-object v13, v1, Lm8;->d:Lo8;

    iget-object v2, v1, Lm8;->e:Lo8;

    iget v3, v1, Lm8;->k:F

    iget-object v4, v0, Lo8;->C:[Lo8$a;

    aget-object v4, v4, p2

    sget-object v5, Lo8$a;->c:Lo8$a;

    const/4 v7, 0x1

    if-ne v4, v5, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x2

    if-nez p2, :cond_3

    iget v8, v2, Lo8;->e0:I

    if-nez v8, :cond_1

    const/4 v8, 0x1

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :goto_1
    iget v14, v2, Lo8;->e0:I

    if-ne v14, v7, :cond_2

    const/4 v14, 0x1

    goto :goto_2

    :cond_2
    const/4 v14, 0x0

    :goto_2
    iget v15, v2, Lo8;->e0:I

    if-ne v15, v5, :cond_6

    goto :goto_5

    :cond_3
    iget v8, v2, Lo8;->f0:I

    if-nez v8, :cond_4

    const/4 v8, 0x1

    goto :goto_3

    :cond_4
    const/4 v8, 0x0

    :goto_3
    iget v14, v2, Lo8;->f0:I

    if-ne v14, v7, :cond_5

    const/4 v14, 0x1

    goto :goto_4

    :cond_5
    const/4 v14, 0x0

    :goto_4
    iget v15, v2, Lo8;->f0:I

    if-ne v15, v5, :cond_6

    :goto_5
    move v15, v14

    const/4 v5, 0x1

    :goto_6
    move v14, v8

    goto :goto_7

    :cond_6
    move v15, v14

    const/4 v5, 0x0

    goto :goto_6

    :goto_7
    move-object v7, v10

    const/4 v8, 0x0

    :goto_8
    const/16 v17, 0x0

    if-nez v8, :cond_13

    iget-object v6, v7, Lo8;->A:[Ln8;

    aget-object v6, v6, p3

    if-nez v4, :cond_8

    if-eqz v5, :cond_7

    goto :goto_9

    :cond_7
    const/16 v23, 0x4

    goto :goto_a

    :cond_8
    :goto_9
    const/16 v23, 0x1

    :goto_a
    invoke-virtual {v6}, Ln8;->b()I

    move-result v24

    move/from16 v25, v3

    iget-object v3, v6, Ln8;->d:Ln8;

    if-eqz v3, :cond_9

    if-eq v7, v10, :cond_9

    invoke-virtual {v3}, Ln8;->b()I

    move-result v3

    add-int v24, v3, v24

    :cond_9
    move/from16 v3, v24

    if-eqz v5, :cond_a

    if-eq v7, v10, :cond_a

    if-eq v7, v12, :cond_a

    move/from16 v24, v8

    move/from16 v23, v15

    const/4 v8, 0x6

    goto :goto_b

    :cond_a
    if-eqz v14, :cond_b

    if-eqz v4, :cond_b

    move/from16 v24, v8

    move/from16 v23, v15

    const/4 v8, 0x4

    goto :goto_b

    :cond_b
    move/from16 v24, v8

    move/from16 v8, v23

    move/from16 v23, v15

    :goto_b
    iget-object v15, v6, Ln8;->d:Ln8;

    if-eqz v15, :cond_d

    if-ne v7, v12, :cond_c

    move/from16 v26, v14

    iget-object v14, v6, Ln8;->i:Lk8;

    iget-object v15, v15, Ln8;->i:Lk8;

    move-object/from16 v27, v2

    const/4 v2, 0x5

    invoke-virtual {v9, v14, v15, v3, v2}, Lh8;->f(Lk8;Lk8;II)V

    goto :goto_c

    :cond_c
    move-object/from16 v27, v2

    move/from16 v26, v14

    iget-object v2, v6, Ln8;->i:Lk8;

    iget-object v14, v15, Ln8;->i:Lk8;

    const/4 v15, 0x6

    invoke-virtual {v9, v2, v14, v3, v15}, Lh8;->f(Lk8;Lk8;II)V

    :goto_c
    iget-object v2, v6, Ln8;->i:Lk8;

    iget-object v6, v6, Ln8;->d:Ln8;

    iget-object v6, v6, Ln8;->i:Lk8;

    invoke-virtual {v9, v2, v6, v3, v8}, Lh8;->d(Lk8;Lk8;II)Le8;

    goto :goto_d

    :cond_d
    move-object/from16 v27, v2

    move/from16 v26, v14

    :goto_d
    if-eqz v4, :cond_f

    .line 1
    iget v2, v7, Lo8;->Y:I

    const/16 v3, 0x8

    if-eq v2, v3, :cond_e

    .line 2
    iget-object v2, v7, Lo8;->C:[Lo8$a;

    aget-object v2, v2, p2

    sget-object v3, Lo8$a;->d:Lo8$a;

    if-ne v2, v3, :cond_e

    iget-object v2, v7, Lo8;->A:[Ln8;

    add-int/lit8 v3, p3, 0x1

    aget-object v3, v2, v3

    iget-object v3, v3, Ln8;->i:Lk8;

    aget-object v2, v2, p3

    iget-object v2, v2, Ln8;->i:Lk8;

    const/4 v6, 0x5

    const/4 v8, 0x0

    invoke-virtual {v9, v3, v2, v8, v6}, Lh8;->f(Lk8;Lk8;II)V

    goto :goto_e

    :cond_e
    const/4 v8, 0x0

    :goto_e
    iget-object v2, v7, Lo8;->A:[Ln8;

    aget-object v2, v2, p3

    iget-object v2, v2, Ln8;->i:Lk8;

    iget-object v3, v0, Lo8;->A:[Ln8;

    aget-object v3, v3, p3

    iget-object v3, v3, Ln8;->i:Lk8;

    const/4 v6, 0x6

    invoke-virtual {v9, v2, v3, v8, v6}, Lh8;->f(Lk8;Lk8;II)V

    :cond_f
    iget-object v2, v7, Lo8;->A:[Ln8;

    add-int/lit8 v3, p3, 0x1

    aget-object v2, v2, v3

    iget-object v2, v2, Ln8;->d:Ln8;

    if-eqz v2, :cond_11

    iget-object v2, v2, Ln8;->b:Lo8;

    iget-object v3, v2, Lo8;->A:[Ln8;

    aget-object v6, v3, p3

    iget-object v6, v6, Ln8;->d:Ln8;

    if-eqz v6, :cond_11

    aget-object v3, v3, p3

    iget-object v3, v3, Ln8;->d:Ln8;

    iget-object v3, v3, Ln8;->b:Lo8;

    if-eq v3, v7, :cond_10

    goto :goto_f

    :cond_10
    move-object/from16 v17, v2

    :cond_11
    :goto_f
    if-eqz v17, :cond_12

    move-object/from16 v7, v17

    move/from16 v8, v24

    goto :goto_10

    :cond_12
    const/4 v8, 0x1

    :goto_10
    move/from16 v15, v23

    move/from16 v3, v25

    move/from16 v14, v26

    move-object/from16 v2, v27

    goto/16 :goto_8

    :cond_13
    move-object/from16 v27, v2

    move/from16 v25, v3

    move/from16 v26, v14

    move/from16 v23, v15

    if-eqz v13, :cond_14

    iget-object v2, v11, Lo8;->A:[Ln8;

    add-int/lit8 v3, p3, 0x1

    aget-object v6, v2, v3

    iget-object v6, v6, Ln8;->d:Ln8;

    if-eqz v6, :cond_14

    iget-object v6, v13, Lo8;->A:[Ln8;

    aget-object v6, v6, v3

    iget-object v7, v6, Ln8;->i:Lk8;

    aget-object v2, v2, v3

    iget-object v2, v2, Ln8;->d:Ln8;

    iget-object v2, v2, Ln8;->i:Lk8;

    invoke-virtual {v6}, Ln8;->b()I

    move-result v3

    neg-int v3, v3

    const/4 v6, 0x5

    invoke-virtual {v9, v7, v2, v3, v6}, Lh8;->g(Lk8;Lk8;II)V

    goto :goto_11

    :cond_14
    const/4 v6, 0x5

    :goto_11
    if-eqz v4, :cond_15

    iget-object v0, v0, Lo8;->A:[Ln8;

    add-int/lit8 v2, p3, 0x1

    aget-object v0, v0, v2

    iget-object v0, v0, Ln8;->i:Lk8;

    iget-object v3, v11, Lo8;->A:[Ln8;

    aget-object v4, v3, v2

    iget-object v4, v4, Ln8;->i:Lk8;

    aget-object v2, v3, v2

    invoke-virtual {v2}, Ln8;->b()I

    move-result v2

    const/4 v3, 0x6

    invoke-virtual {v9, v0, v4, v2, v3}, Lh8;->f(Lk8;Lk8;II)V

    :cond_15
    iget-object v0, v1, Lm8;->h:Ljava/util/ArrayList;

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_1f

    iget-boolean v4, v1, Lm8;->n:Z

    if-eqz v4, :cond_16

    iget-boolean v4, v1, Lm8;->p:Z

    if-nez v4, :cond_16

    iget v4, v1, Lm8;->j:I

    int-to-float v4, v4

    goto :goto_12

    :cond_16
    move/from16 v4, v25

    :goto_12
    const/4 v7, 0x0

    move-object/from16 v14, v17

    const/4 v8, 0x0

    const/4 v15, 0x0

    :goto_13
    if-ge v8, v2, :cond_1f

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v3, v16

    check-cast v3, Lo8;

    iget-object v6, v3, Lo8;->g0:[F

    aget v6, v6, p2

    move-object/from16 v24, v0

    cmpg-float v25, v6, v7

    if-gez v25, :cond_18

    iget-boolean v6, v1, Lm8;->p:Z

    if-eqz v6, :cond_17

    iget-object v0, v3, Lo8;->A:[Ln8;

    add-int/lit8 v3, p3, 0x1

    aget-object v3, v0, v3

    iget-object v3, v3, Ln8;->i:Lk8;

    aget-object v0, v0, p3

    iget-object v0, v0, Ln8;->i:Lk8;

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-virtual {v9, v3, v0, v7, v6}, Lh8;->d(Lk8;Lk8;II)Le8;

    const/4 v6, 0x6

    goto :goto_14

    :cond_17
    const/high16 v6, 0x3f800000    # 1.0f

    :cond_18
    const/4 v7, 0x4

    const/16 v20, 0x0

    cmpl-float v25, v6, v20

    if-nez v25, :cond_19

    iget-object v0, v3, Lo8;->A:[Ln8;

    add-int/lit8 v3, p3, 0x1

    aget-object v3, v0, v3

    iget-object v3, v3, Ln8;->i:Lk8;

    aget-object v0, v0, p3

    iget-object v0, v0, Ln8;->i:Lk8;

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-virtual {v9, v3, v0, v7, v6}, Lh8;->d(Lk8;Lk8;II)Le8;

    :goto_14
    move/from16 v29, v2

    move-object/from16 v30, v11

    const/16 v18, 0x6

    goto/16 :goto_19

    :cond_19
    const/4 v7, 0x0

    const/16 v18, 0x6

    if-eqz v14, :cond_1e

    iget-object v14, v14, Lo8;->A:[Ln8;

    aget-object v7, v14, p3

    iget-object v7, v7, Ln8;->i:Lk8;

    add-int/lit8 v25, p3, 0x1

    aget-object v14, v14, v25

    iget-object v14, v14, Ln8;->i:Lk8;

    iget-object v0, v3, Lo8;->A:[Ln8;

    move/from16 v29, v2

    aget-object v2, v0, p3

    iget-object v2, v2, Ln8;->i:Lk8;

    aget-object v0, v0, v25

    iget-object v0, v0, Ln8;->i:Lk8;

    move-object/from16 v25, v3

    invoke-virtual/range {p1 .. p1}, Lh8;->m()Le8;

    move-result-object v3

    const/4 v1, 0x0

    .line 3
    iput v1, v3, Le8;->b:F

    move-object/from16 v30, v11

    const/high16 v11, -0x40800000    # -1.0f

    cmpl-float v31, v4, v1

    if-eqz v31, :cond_1d

    cmpl-float v31, v15, v6

    if-nez v31, :cond_1a

    goto :goto_15

    :cond_1a
    cmpl-float v31, v15, v1

    if-nez v31, :cond_1b

    iget-object v0, v3, Le8;->d:Ld8;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v7, v2}, Ld8;->h(Lk8;F)V

    iget-object v0, v3, Le8;->d:Ld8;

    invoke-virtual {v0, v14, v11}, Ld8;->h(Lk8;F)V

    goto :goto_17

    :cond_1b
    const/high16 v11, 0x3f800000    # 1.0f

    cmpl-float v28, v6, v1

    if-nez v28, :cond_1c

    iget-object v7, v3, Le8;->d:Ld8;

    invoke-virtual {v7, v2, v11}, Ld8;->h(Lk8;F)V

    iget-object v2, v3, Le8;->d:Ld8;

    const/high16 v7, -0x40800000    # -1.0f

    invoke-virtual {v2, v0, v7}, Ld8;->h(Lk8;F)V

    goto :goto_17

    :cond_1c
    const/high16 v1, -0x40800000    # -1.0f

    div-float/2addr v15, v4

    div-float v28, v6, v4

    div-float v15, v15, v28

    iget-object v1, v3, Le8;->d:Ld8;

    invoke-virtual {v1, v7, v11}, Ld8;->h(Lk8;F)V

    iget-object v1, v3, Le8;->d:Ld8;

    const/high16 v7, -0x40800000    # -1.0f

    invoke-virtual {v1, v14, v7}, Ld8;->h(Lk8;F)V

    iget-object v1, v3, Le8;->d:Ld8;

    invoke-virtual {v1, v0, v15}, Ld8;->h(Lk8;F)V

    iget-object v0, v3, Le8;->d:Ld8;

    neg-float v11, v15

    goto :goto_16

    :cond_1d
    :goto_15
    const/high16 v1, -0x40800000    # -1.0f

    const/high16 v11, 0x3f800000    # 1.0f

    iget-object v15, v3, Le8;->d:Ld8;

    invoke-virtual {v15, v7, v11}, Ld8;->h(Lk8;F)V

    iget-object v7, v3, Le8;->d:Ld8;

    invoke-virtual {v7, v14, v1}, Ld8;->h(Lk8;F)V

    iget-object v7, v3, Le8;->d:Ld8;

    invoke-virtual {v7, v0, v11}, Ld8;->h(Lk8;F)V

    iget-object v0, v3, Le8;->d:Ld8;

    const/high16 v11, -0x40800000    # -1.0f

    :goto_16
    invoke-virtual {v0, v2, v11}, Ld8;->h(Lk8;F)V

    .line 4
    :goto_17
    invoke-virtual {v9, v3}, Lh8;->c(Le8;)V

    goto :goto_18

    :cond_1e
    move/from16 v29, v2

    move-object/from16 v25, v3

    move-object/from16 v30, v11

    :goto_18
    move v15, v6

    move-object/from16 v14, v25

    :goto_19
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v1, p4

    move-object/from16 v0, v24

    move/from16 v2, v29

    move-object/from16 v11, v30

    const/4 v3, 0x1

    const/4 v6, 0x5

    const/4 v7, 0x0

    goto/16 :goto_13

    :cond_1f
    move-object/from16 v30, v11

    const/16 v18, 0x6

    if-eqz v12, :cond_25

    if-eq v12, v13, :cond_20

    if-eqz v5, :cond_25

    :cond_20
    iget-object v0, v10, Lo8;->A:[Ln8;

    aget-object v1, v0, p3

    move-object/from16 v11, v30

    iget-object v2, v11, Lo8;->A:[Ln8;

    add-int/lit8 v3, p3, 0x1

    aget-object v2, v2, v3

    aget-object v4, v0, p3

    iget-object v4, v4, Ln8;->d:Ln8;

    if-eqz v4, :cond_21

    aget-object v0, v0, p3

    iget-object v0, v0, Ln8;->d:Ln8;

    iget-object v0, v0, Ln8;->i:Lk8;

    move-object v4, v0

    goto :goto_1a

    :cond_21
    move-object/from16 v4, v17

    :goto_1a
    iget-object v0, v11, Lo8;->A:[Ln8;

    aget-object v5, v0, v3

    iget-object v5, v5, Ln8;->d:Ln8;

    if-eqz v5, :cond_22

    aget-object v0, v0, v3

    iget-object v0, v0, Ln8;->d:Ln8;

    iget-object v0, v0, Ln8;->i:Lk8;

    move-object v5, v0

    goto :goto_1b

    :cond_22
    move-object/from16 v5, v17

    :goto_1b
    if-ne v12, v13, :cond_23

    iget-object v0, v12, Lo8;->A:[Ln8;

    aget-object v1, v0, p3

    aget-object v2, v0, v3

    :cond_23
    if-eqz v4, :cond_47

    if-eqz v5, :cond_47

    move-object/from16 v0, v27

    if-nez p2, :cond_24

    iget v0, v0, Lo8;->V:F

    goto :goto_1c

    :cond_24
    iget v0, v0, Lo8;->W:F

    :goto_1c
    move v6, v0

    invoke-virtual {v1}, Ln8;->b()I

    move-result v3

    invoke-virtual {v2}, Ln8;->b()I

    move-result v7

    iget-object v1, v1, Ln8;->i:Lk8;

    iget-object v8, v2, Ln8;->i:Lk8;

    const/4 v10, 0x5

    move-object/from16 v0, p1

    move-object v2, v4

    move v4, v6

    move-object v6, v8

    move v8, v10

    invoke-virtual/range {v0 .. v8}, Lh8;->b(Lk8;Lk8;IFLk8;Lk8;II)V

    goto/16 :goto_36

    :cond_25
    move-object/from16 v11, v30

    if-eqz v26, :cond_37

    if-eqz v12, :cond_37

    move-object/from16 v0, p4

    iget v1, v0, Lm8;->j:I

    if-lez v1, :cond_26

    iget v0, v0, Lm8;->i:I

    if-ne v0, v1, :cond_26

    const/16 v21, 0x1

    goto :goto_1d

    :cond_26
    const/16 v21, 0x0

    :goto_1d
    move-object v14, v12

    move-object v15, v14

    :goto_1e
    if-eqz v14, :cond_47

    iget-object v0, v14, Lo8;->i0:[Lo8;

    aget-object v0, v0, p2

    move-object v8, v0

    :goto_1f
    if-eqz v8, :cond_27

    .line 5
    iget v0, v8, Lo8;->Y:I

    const/16 v6, 0x8

    if-ne v0, v6, :cond_28

    .line 6
    iget-object v0, v8, Lo8;->i0:[Lo8;

    aget-object v8, v0, p2

    goto :goto_1f

    :cond_27
    const/16 v6, 0x8

    :cond_28
    if-nez v8, :cond_2a

    if-ne v14, v13, :cond_29

    goto :goto_20

    :cond_29
    move-object/from16 v16, v8

    const/16 v18, 0x4

    const/16 v19, 0x6

    goto/16 :goto_28

    :cond_2a
    :goto_20
    iget-object v0, v14, Lo8;->A:[Ln8;

    aget-object v0, v0, p3

    iget-object v1, v0, Ln8;->i:Lk8;

    iget-object v2, v0, Ln8;->d:Ln8;

    if-eqz v2, :cond_2b

    iget-object v2, v2, Ln8;->i:Lk8;

    goto :goto_21

    :cond_2b
    move-object/from16 v2, v17

    :goto_21
    if-eq v15, v14, :cond_2c

    iget-object v2, v15, Lo8;->A:[Ln8;

    add-int/lit8 v3, p3, 0x1

    aget-object v2, v2, v3

    goto :goto_22

    :cond_2c
    if-ne v14, v12, :cond_2e

    if-ne v15, v14, :cond_2e

    iget-object v2, v10, Lo8;->A:[Ln8;

    aget-object v3, v2, p3

    iget-object v3, v3, Ln8;->d:Ln8;

    if-eqz v3, :cond_2d

    aget-object v2, v2, p3

    iget-object v2, v2, Ln8;->d:Ln8;

    :goto_22
    iget-object v2, v2, Ln8;->i:Lk8;

    goto :goto_23

    :cond_2d
    move-object/from16 v2, v17

    :cond_2e
    :goto_23
    invoke-virtual {v0}, Ln8;->b()I

    move-result v0

    iget-object v3, v14, Lo8;->A:[Ln8;

    add-int/lit8 v4, p3, 0x1

    aget-object v3, v3, v4

    invoke-virtual {v3}, Ln8;->b()I

    move-result v3

    if-eqz v8, :cond_2f

    iget-object v5, v8, Lo8;->A:[Ln8;

    aget-object v5, v5, p3

    iget-object v7, v5, Ln8;->i:Lk8;

    iget-object v6, v14, Lo8;->A:[Ln8;

    aget-object v6, v6, v4

    iget-object v6, v6, Ln8;->i:Lk8;

    move-object/from16 v32, v7

    move-object v7, v6

    move-object/from16 v6, v32

    goto :goto_25

    :cond_2f
    iget-object v5, v11, Lo8;->A:[Ln8;

    aget-object v5, v5, v4

    iget-object v5, v5, Ln8;->d:Ln8;

    if-eqz v5, :cond_30

    iget-object v6, v5, Ln8;->i:Lk8;

    goto :goto_24

    :cond_30
    move-object/from16 v6, v17

    :goto_24
    iget-object v7, v14, Lo8;->A:[Ln8;

    aget-object v7, v7, v4

    iget-object v7, v7, Ln8;->i:Lk8;

    :goto_25
    if-eqz v5, :cond_31

    invoke-virtual {v5}, Ln8;->b()I

    move-result v5

    add-int/2addr v3, v5

    :cond_31
    if-eqz v15, :cond_32

    iget-object v5, v15, Lo8;->A:[Ln8;

    aget-object v5, v5, v4

    invoke-virtual {v5}, Ln8;->b()I

    move-result v5

    add-int/2addr v0, v5

    :cond_32
    if-eqz v1, :cond_29

    if-eqz v2, :cond_29

    if-eqz v6, :cond_29

    if-eqz v7, :cond_29

    if-ne v14, v12, :cond_33

    iget-object v0, v12, Lo8;->A:[Ln8;

    aget-object v0, v0, p3

    invoke-virtual {v0}, Ln8;->b()I

    move-result v0

    :cond_33
    move v5, v0

    if-ne v14, v13, :cond_34

    iget-object v0, v13, Lo8;->A:[Ln8;

    aget-object v0, v0, v4

    invoke-virtual {v0}, Ln8;->b()I

    move-result v0

    move/from16 v16, v0

    goto :goto_26

    :cond_34
    move/from16 v16, v3

    :goto_26
    if-eqz v21, :cond_35

    const/16 v22, 0x6

    goto :goto_27

    :cond_35
    const/16 v22, 0x4

    :goto_27
    const/high16 v4, 0x3f000000    # 0.5f

    move-object/from16 v0, p1

    move v3, v5

    move-object v5, v6

    const/16 v18, 0x4

    const/16 v19, 0x6

    move-object v6, v7

    move/from16 v7, v16

    move-object/from16 v16, v8

    move/from16 v8, v22

    invoke-virtual/range {v0 .. v8}, Lh8;->b(Lk8;Lk8;IFLk8;Lk8;II)V

    .line 7
    :goto_28
    iget v0, v14, Lo8;->Y:I

    const/16 v8, 0x8

    if-eq v0, v8, :cond_36

    move-object v15, v14

    :cond_36
    move-object/from16 v14, v16

    const/16 v18, 0x6

    goto/16 :goto_1e

    :cond_37
    move-object/from16 v0, p4

    const/16 v8, 0x8

    const/16 v18, 0x4

    const/16 v19, 0x6

    if-eqz v23, :cond_47

    if-eqz v12, :cond_47

    .line 8
    iget v1, v0, Lm8;->j:I

    if-lez v1, :cond_38

    iget v0, v0, Lm8;->i:I

    if-ne v0, v1, :cond_38

    const/16 v21, 0x1

    goto :goto_29

    :cond_38
    const/16 v21, 0x0

    :goto_29
    move-object v14, v12

    move-object v15, v14

    :goto_2a
    if-eqz v14, :cond_43

    iget-object v0, v14, Lo8;->i0:[Lo8;

    aget-object v0, v0, p2

    :goto_2b
    if-eqz v0, :cond_39

    .line 9
    iget v1, v0, Lo8;->Y:I

    if-ne v1, v8, :cond_39

    .line 10
    iget-object v0, v0, Lo8;->i0:[Lo8;

    aget-object v0, v0, p2

    goto :goto_2b

    :cond_39
    if-eq v14, v12, :cond_41

    if-eq v14, v13, :cond_41

    if-eqz v0, :cond_41

    if-ne v0, v13, :cond_3a

    move-object/from16 v7, v17

    goto :goto_2c

    :cond_3a
    move-object v7, v0

    :goto_2c
    iget-object v0, v14, Lo8;->A:[Ln8;

    aget-object v0, v0, p3

    iget-object v1, v0, Ln8;->i:Lk8;

    iget-object v2, v0, Ln8;->d:Ln8;

    iget-object v2, v15, Lo8;->A:[Ln8;

    add-int/lit8 v3, p3, 0x1

    aget-object v2, v2, v3

    iget-object v2, v2, Ln8;->i:Lk8;

    invoke-virtual {v0}, Ln8;->b()I

    move-result v0

    iget-object v4, v14, Lo8;->A:[Ln8;

    aget-object v4, v4, v3

    invoke-virtual {v4}, Ln8;->b()I

    move-result v4

    if-eqz v7, :cond_3c

    iget-object v5, v7, Lo8;->A:[Ln8;

    aget-object v5, v5, p3

    iget-object v6, v5, Ln8;->i:Lk8;

    iget-object v8, v5, Ln8;->d:Ln8;

    if-eqz v8, :cond_3b

    goto :goto_2e

    :cond_3b
    move-object/from16 v8, v17

    goto :goto_2f

    :cond_3c
    iget-object v5, v14, Lo8;->A:[Ln8;

    aget-object v5, v5, v3

    iget-object v5, v5, Ln8;->d:Ln8;

    if-eqz v5, :cond_3d

    iget-object v6, v5, Ln8;->i:Lk8;

    goto :goto_2d

    :cond_3d
    move-object/from16 v6, v17

    :goto_2d
    iget-object v8, v14, Lo8;->A:[Ln8;

    aget-object v8, v8, v3

    :goto_2e
    iget-object v8, v8, Ln8;->i:Lk8;

    :goto_2f
    if-eqz v5, :cond_3e

    invoke-virtual {v5}, Ln8;->b()I

    move-result v5

    add-int/2addr v5, v4

    move/from16 v20, v5

    goto :goto_30

    :cond_3e
    move/from16 v20, v4

    :goto_30
    iget-object v4, v15, Lo8;->A:[Ln8;

    aget-object v3, v4, v3

    invoke-virtual {v3}, Ln8;->b()I

    move-result v3

    add-int/2addr v3, v0

    if-eqz v21, :cond_3f

    const/16 v22, 0x6

    goto :goto_31

    :cond_3f
    const/16 v22, 0x4

    :goto_31
    if-eqz v1, :cond_40

    if-eqz v2, :cond_40

    if-eqz v6, :cond_40

    if-eqz v8, :cond_40

    const/high16 v4, 0x3f000000    # 0.5f

    move-object/from16 v0, p1

    move-object v5, v6

    move-object v6, v8

    move-object/from16 v16, v7

    move/from16 v7, v20

    move-object/from16 v20, v15

    const/16 v15, 0x8

    move/from16 v8, v22

    invoke-virtual/range {v0 .. v8}, Lh8;->b(Lk8;Lk8;IFLk8;Lk8;II)V

    goto :goto_32

    :cond_40
    move-object/from16 v16, v7

    move-object/from16 v20, v15

    const/16 v15, 0x8

    :goto_32
    move-object/from16 v0, v16

    goto :goto_33

    :cond_41
    move-object/from16 v20, v15

    const/16 v15, 0x8

    .line 11
    :goto_33
    iget v1, v14, Lo8;->Y:I

    if-eq v1, v15, :cond_42

    goto :goto_34

    :cond_42
    move-object/from16 v14, v20

    :goto_34
    move-object v15, v14

    const/16 v8, 0x8

    move-object v14, v0

    goto/16 :goto_2a

    .line 12
    :cond_43
    iget-object v0, v12, Lo8;->A:[Ln8;

    aget-object v0, v0, p3

    iget-object v1, v10, Lo8;->A:[Ln8;

    aget-object v1, v1, p3

    iget-object v1, v1, Ln8;->d:Ln8;

    iget-object v2, v13, Lo8;->A:[Ln8;

    add-int/lit8 v3, p3, 0x1

    aget-object v10, v2, v3

    iget-object v2, v11, Lo8;->A:[Ln8;

    aget-object v2, v2, v3

    iget-object v14, v2, Ln8;->d:Ln8;

    if-eqz v1, :cond_45

    if-eq v12, v13, :cond_44

    iget-object v2, v0, Ln8;->i:Lk8;

    iget-object v1, v1, Ln8;->i:Lk8;

    invoke-virtual {v0}, Ln8;->b()I

    move-result v0

    const/4 v15, 0x5

    invoke-virtual {v9, v2, v1, v0, v15}, Lh8;->d(Lk8;Lk8;II)Le8;

    goto :goto_35

    :cond_44
    const/4 v15, 0x5

    if-eqz v14, :cond_46

    iget-object v2, v0, Ln8;->i:Lk8;

    iget-object v3, v1, Ln8;->i:Lk8;

    invoke-virtual {v0}, Ln8;->b()I

    move-result v4

    const/high16 v5, 0x3f000000    # 0.5f

    iget-object v6, v10, Ln8;->i:Lk8;

    iget-object v7, v14, Ln8;->i:Lk8;

    invoke-virtual {v10}, Ln8;->b()I

    move-result v8

    const/16 v16, 0x5

    move-object/from16 v0, p1

    move-object v1, v2

    move-object v2, v3

    move v3, v4

    move v4, v5

    move-object v5, v6

    move-object v6, v7

    move v7, v8

    move/from16 v8, v16

    invoke-virtual/range {v0 .. v8}, Lh8;->b(Lk8;Lk8;IFLk8;Lk8;II)V

    goto :goto_35

    :cond_45
    const/4 v15, 0x5

    :cond_46
    :goto_35
    if-eqz v14, :cond_47

    if-eq v12, v13, :cond_47

    iget-object v0, v10, Ln8;->i:Lk8;

    iget-object v1, v14, Ln8;->i:Lk8;

    invoke-virtual {v10}, Ln8;->b()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {v9, v0, v1, v2, v15}, Lh8;->d(Lk8;Lk8;II)Le8;

    :cond_47
    :goto_36
    if-nez v26, :cond_48

    if-eqz v23, :cond_4e

    :cond_48
    if-eqz v12, :cond_4e

    iget-object v0, v12, Lo8;->A:[Ln8;

    aget-object v0, v0, p3

    iget-object v1, v13, Lo8;->A:[Ln8;

    add-int/lit8 v2, p3, 0x1

    aget-object v1, v1, v2

    iget-object v3, v0, Ln8;->d:Ln8;

    if-eqz v3, :cond_49

    iget-object v3, v3, Ln8;->i:Lk8;

    goto :goto_37

    :cond_49
    move-object/from16 v3, v17

    :goto_37
    iget-object v4, v1, Ln8;->d:Ln8;

    if-eqz v4, :cond_4a

    iget-object v4, v4, Ln8;->i:Lk8;

    goto :goto_38

    :cond_4a
    move-object/from16 v4, v17

    :goto_38
    if-eq v11, v13, :cond_4c

    iget-object v4, v11, Lo8;->A:[Ln8;

    aget-object v4, v4, v2

    iget-object v4, v4, Ln8;->d:Ln8;

    if-eqz v4, :cond_4b

    iget-object v4, v4, Ln8;->i:Lk8;

    move-object/from16 v17, v4

    :cond_4b
    move-object/from16 v5, v17

    goto :goto_39

    :cond_4c
    move-object v5, v4

    :goto_39
    if-ne v12, v13, :cond_4d

    iget-object v0, v12, Lo8;->A:[Ln8;

    aget-object v1, v0, p3

    aget-object v0, v0, v2

    move-object/from16 v32, v1

    move-object v1, v0

    move-object/from16 v0, v32

    :cond_4d
    if-eqz v3, :cond_4e

    if-eqz v5, :cond_4e

    const/high16 v4, 0x3f000000    # 0.5f

    invoke-virtual {v0}, Ln8;->b()I

    move-result v6

    iget-object v7, v13, Lo8;->A:[Ln8;

    aget-object v2, v7, v2

    invoke-virtual {v2}, Ln8;->b()I

    move-result v7

    iget-object v2, v0, Ln8;->i:Lk8;

    iget-object v8, v1, Ln8;->i:Lk8;

    const/4 v10, 0x5

    move-object/from16 v0, p1

    move-object v1, v2

    move-object v2, v3

    move v3, v6

    move-object v6, v8

    move v8, v10

    invoke-virtual/range {v0 .. v8}, Lh8;->b(Lk8;Lk8;IFLk8;Lk8;II)V

    :cond_4e
    return-void
.end method

.method public static b0(Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources;)Ls9;
    .locals 18

    move-object/from16 v0, p1

    :goto_0
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v2, :cond_0

    if-eq v1, v3, :cond_0

    goto :goto_0

    :cond_0
    if-ne v1, v2, :cond_f

    const/4 v1, 0x0

    const-string v4, "font-family"

    move-object/from16 v5, p0

    .line 1
    invoke-interface {v5, v2, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    .line 2
    invoke-static/range {p0 .. p0}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v4

    sget-object v6, Li9;->FontFamily:[I

    invoke-virtual {v0, v4, v6}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v4

    sget v6, Li9;->FontFamily_fontProviderAuthority:I

    invoke-virtual {v4, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    sget v7, Li9;->FontFamily_fontProviderPackage:I

    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    sget v8, Li9;->FontFamily_fontProviderQuery:I

    invoke-virtual {v4, v8}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    sget v9, Li9;->FontFamily_fontProviderCerts:I

    const/4 v10, 0x0

    invoke-virtual {v4, v9, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v9

    sget v11, Li9;->FontFamily_fontProviderFetchStrategy:I

    invoke-virtual {v4, v11, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v11

    sget v12, Li9;->FontFamily_fontProviderFetchTimeout:I

    const/16 v13, 0x1f4

    invoke-virtual {v4, v12, v13}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v12

    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    const/4 v4, 0x3

    if-eqz v6, :cond_2

    if-eqz v7, :cond_2

    if-eqz v8, :cond_2

    :goto_1
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    if-eq v1, v4, :cond_1

    invoke-static/range {p0 .. p0}, Lb1;->s0(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_1

    :cond_1
    invoke-static {v0, v9}, Lb1;->c0(Landroid/content/res/Resources;I)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lv9;

    new-instance v2, Lra;

    invoke-direct {v2, v6, v7, v8, v0}, Lra;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    invoke-direct {v1, v2, v11, v12}, Lv9;-><init>(Lra;II)V

    goto/16 :goto_a

    :cond_2
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v7

    if-eq v7, v4, :cond_c

    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v7

    if-eq v7, v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v7

    const-string v8, "font"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    .line 3
    invoke-static/range {p0 .. p0}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v7

    sget-object v8, Li9;->FontFamilyFont:[I

    invoke-virtual {v0, v7, v8}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v7

    sget v8, Li9;->FontFamilyFont_fontWeight:I

    invoke-virtual {v7, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v8

    if-eqz v8, :cond_4

    sget v8, Li9;->FontFamilyFont_fontWeight:I

    goto :goto_3

    :cond_4
    sget v8, Li9;->FontFamilyFont_android_fontWeight:I

    :goto_3
    const/16 v9, 0x190

    invoke-virtual {v7, v8, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v13

    sget v8, Li9;->FontFamilyFont_fontStyle:I

    invoke-virtual {v7, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v8

    if-eqz v8, :cond_5

    sget v8, Li9;->FontFamilyFont_fontStyle:I

    goto :goto_4

    :cond_5
    sget v8, Li9;->FontFamilyFont_android_fontStyle:I

    :goto_4
    invoke-virtual {v7, v8, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v8

    if-ne v3, v8, :cond_6

    const/4 v14, 0x1

    goto :goto_5

    :cond_6
    const/4 v14, 0x0

    :goto_5
    sget v8, Li9;->FontFamilyFont_ttcIndex:I

    invoke-virtual {v7, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v8

    if-eqz v8, :cond_7

    sget v8, Li9;->FontFamilyFont_ttcIndex:I

    goto :goto_6

    :cond_7
    sget v8, Li9;->FontFamilyFont_android_ttcIndex:I

    :goto_6
    sget v9, Li9;->FontFamilyFont_fontVariationSettings:I

    invoke-virtual {v7, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v9

    if-eqz v9, :cond_8

    sget v9, Li9;->FontFamilyFont_fontVariationSettings:I

    goto :goto_7

    :cond_8
    sget v9, Li9;->FontFamilyFont_android_fontVariationSettings:I

    :goto_7
    invoke-virtual {v7, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v7, v8, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v16

    sget v8, Li9;->FontFamilyFont_font:I

    invoke-virtual {v7, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v8

    if-eqz v8, :cond_9

    sget v8, Li9;->FontFamilyFont_font:I

    goto :goto_8

    :cond_9
    sget v8, Li9;->FontFamilyFont_android_font:I

    :goto_8
    invoke-virtual {v7, v8, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v17

    invoke-virtual {v7, v8}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    :goto_9
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v7

    if-eq v7, v4, :cond_a

    invoke-static/range {p0 .. p0}, Lb1;->s0(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_9

    :cond_a
    new-instance v7, Lu9;

    move-object v11, v7

    invoke-direct/range {v11 .. v17}, Lu9;-><init>(Ljava/lang/String;IZLjava/lang/String;II)V

    .line 4
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_b
    invoke-static/range {p0 .. p0}, Lb1;->s0(Lorg/xmlpull/v1/XmlPullParser;)V

    goto/16 :goto_2

    :cond_c
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_a

    :cond_d
    new-instance v1, Lt9;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Lu9;

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lu9;

    invoke-direct {v1, v0}, Lt9;-><init>([Lu9;)V

    goto :goto_a

    .line 5
    :cond_e
    invoke-static/range {p0 .. p0}, Lb1;->s0(Lorg/xmlpull/v1/XmlPullParser;)V

    :goto_a
    return-object v1

    .line 6
    :cond_f
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "No start tag found"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    goto :goto_c

    :goto_b
    throw v0

    :goto_c
    goto :goto_b
.end method

.method public static c(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
    .locals 2

    if-nez p0, :cond_0

    const-string p0, "null"

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    if-lez v1, :cond_1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x7b

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static c0(Landroid/content/res/Resources;I)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources;",
            "I)",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "[B>;>;"
        }
    .end annotation

    if-nez p1, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    move-result-object v0

    :try_start_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->length()I

    move-result v1

    if-nez v1, :cond_1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-object p0

    :cond_1
    :try_start_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    const/4 v4, 0x0

    if-lt v2, v3, :cond_2

    invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getType(I)I

    move-result v2

    goto :goto_0

    :cond_2
    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v0, v4, v2}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    iget v2, v2, Landroid/util/TypedValue;->type:I

    :goto_0
    const/4 v3, 0x1

    if-ne v2, v3, :cond_4

    const/4 p1, 0x0

    .line 2
    :goto_1
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->length()I

    move-result v2

    if-ge p1, v2, :cond_5

    invoke-virtual {v0, p1, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lb1;->t0([Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lb1;->t0([Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_5
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-object v1

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_3

    :goto_2
    throw p0

    :goto_3
    goto :goto_2
.end method

.method public static d([Laa;[Laa;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    if-nez p1, :cond_0

    goto :goto_2

    :cond_0
    array-length v1, p0

    array-length v2, p1

    if-eq v1, v2, :cond_1

    return v0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_4

    aget-object v2, p0, v1

    iget-char v2, v2, Laa;->a:C

    aget-object v3, p1, v1

    iget-char v3, v3, Laa;->a:C

    if-ne v2, v3, :cond_3

    aget-object v2, p0, v1

    iget-object v2, v2, Laa;->b:[F

    array-length v2, v2

    aget-object v3, p1, v1

    iget-object v3, v3, Laa;->b:[F

    array-length v3, v3

    if-eq v2, v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v0

    :cond_4
    const/4 p0, 0x1

    return p0

    :cond_5
    :goto_2
    return v0
.end method

.method public static d0(Lo8;)I
    .locals 2

    sget-object v0, Lo8$a;->d:Lo8$a;

    invoke-virtual {p0}, Lo8;->i()Lo8$a;

    move-result-object v1

    if-ne v1, v0, :cond_1

    iget v0, p0, Lo8;->H:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lo8;->h()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lo8;->G:F

    mul-float v0, v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lo8;->h()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lo8;->G:F

    div-float/2addr v0, v1

    :goto_0
    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lo8;->C(I)V

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Lo8;->m()Lo8$a;

    move-result-object v1

    if-ne v1, v0, :cond_3

    iget v0, p0, Lo8;->H:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lo8;->n()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lo8;->G:F

    mul-float v0, v0, v1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lo8;->n()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lo8;->G:F

    div-float/2addr v0, v1

    :goto_1
    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lo8;->w(I)V

    goto :goto_2

    :cond_3
    const/4 v0, -0x1

    :goto_2
    return v0
.end method

.method public static e(I)I
    .locals 0

    if-ltz p0, :cond_0

    return p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static e0(SI)S
    .locals 1

    shl-int v0, p0, p1

    rsub-int/lit8 p1, p1, 0x20

    ushr-int/2addr p0, p1

    or-int/2addr p0, v0

    int-to-short p0, p0

    return p0
.end method

.method public static f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static f0(Landroid/graphics/drawable/Drawable;Z)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    :cond_0
    return-void
.end method

.method public static g(Landroid/content/Context;Ljava/lang/String;)I
    .locals 6

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 1
    invoke-virtual {p0, p1, v0, v1}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result v0

    const/4 v3, 0x0

    const/4 v4, -0x1

    if-ne v0, v4, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x17

    if-lt v0, v5, :cond_1

    invoke-static {p1}, Landroid/app/AppOpsManager;->permissionToOp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    goto :goto_4

    :cond_2
    if-nez v2, :cond_5

    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    array-length v1, v0

    if-gtz v1, :cond_3

    goto :goto_1

    :cond_3
    aget-object v2, v0, v3

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v3, -0x1

    goto :goto_4

    .line 4
    :cond_5
    :goto_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v5, :cond_6

    const-class v0, Landroid/app/AppOpsManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/AppOpsManager;

    invoke-virtual {p0, p1, v2}, Landroid/app/AppOpsManager;->noteProxyOpNoThrow(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    goto :goto_3

    :cond_6
    const/4 p0, 0x1

    :goto_3
    if-eqz p0, :cond_7

    const/4 v3, -0x2

    :cond_7
    :goto_4
    return v3
.end method

.method public static g0(Landroid/widget/TextView;I)V
    .locals 3

    invoke-static {p1}, Lb1;->e(I)I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setFirstBaselineToTopHeight(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0}, Landroid/text/TextPaint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x10

    if-lt v1, v2, :cond_2

    invoke-virtual {p0}, Landroid/widget/TextView;->getIncludeFontPadding()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    goto :goto_1

    :cond_2
    :goto_0
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->top:I

    :goto_1
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-le p1, v1, :cond_3

    neg-int v0, v0

    sub-int/2addr p1, v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingRight()I

    move-result v1

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingBottom()I

    move-result v2

    invoke-virtual {p0, v0, p1, v1, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    :cond_3
    return-void
.end method

.method public static h([FII)[F
    .locals 2

    if-gt p1, p2, :cond_1

    array-length v0, p0

    if-ltz p1, :cond_0

    if-gt p1, v0, :cond_0

    sub-int/2addr p2, p1

    sub-int/2addr v0, p1

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-array p2, p2, [F

    const/4 v1, 0x0

    invoke-static {p0, p1, p2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p2

    :cond_0
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static h0(Landroid/graphics/drawable/Drawable;FF)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V

    :cond_0
    return-void
.end method

.method public static i(Ljava/io/File;Landroid/content/res/Resources;I)Z
    .locals 0

    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {p0, p1}, Lb1;->j(Ljava/io/File;Ljava/io/InputStream;)Z

    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_0

    .line 1
    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_0
    return p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :catchall_1
    move-exception p0

    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    :try_start_3
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 2
    :catch_1
    :cond_1
    throw p0
.end method

.method public static i0(Landroid/graphics/drawable/Drawable;IIII)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->setHotspotBounds(IIII)V

    :cond_0
    return-void
.end method

.method public static j(Ljava/io/File;Ljava/io/InputStream;)Z
    .locals 5

    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskWrites()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, p0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 p0, 0x400

    :try_start_1
    new-array p0, p0, [B

    :goto_0
    invoke-virtual {p1, p0}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v4, -0x1

    if-eq v2, v4, :cond_0

    invoke-virtual {v3, p0, v1, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    .line 1
    :try_start_2
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 2
    :catch_0
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    return p0

    :catchall_0
    move-exception p0

    move-object v2, v3

    goto :goto_2

    :catch_1
    move-exception p0

    move-object v2, v3

    goto :goto_1

    :catchall_1
    move-exception p0

    goto :goto_2

    :catch_2
    move-exception p0

    :goto_1
    :try_start_3
    const-string p1, "TypefaceCompatUtil"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error copying resource contents to temp file: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v2, :cond_1

    .line 3
    :try_start_4
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 4
    :catch_3
    :cond_1
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    return v1

    :goto_2
    if-eqz v2, :cond_2

    .line 5
    :try_start_5
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 6
    :catch_4
    :cond_2
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    goto :goto_4

    :goto_3
    throw p0

    :goto_4
    goto :goto_3
.end method

.method public static j0(Landroid/widget/TextView;I)V
    .locals 3

    invoke-static {p1}, Lb1;->e(I)I

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0}, Landroid/text/TextPaint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x10

    if-lt v1, v2, :cond_1

    invoke-virtual {p0}, Landroid/widget/TextView;->getIncludeFontPadding()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    goto :goto_1

    :cond_1
    :goto_0
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    :goto_1
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-le p1, v1, :cond_2

    sub-int/2addr p1, v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingRight()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    :cond_2
    return-void
.end method

.method public static k(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/animation/AnimatorSet;IF)Landroid/animation/Animator;
    .locals 22

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    move-object/from16 v11, p5

    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v12

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v13, v1

    :goto_0
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v2, 0x3

    const/4 v14, 0x0

    if-ne v1, v2, :cond_0

    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v3

    if-le v3, v12, :cond_2f

    :cond_0
    const/4 v3, 0x1

    if-eq v1, v3, :cond_2f

    const/4 v4, 0x2

    if-eq v1, v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v5, "objectAnimator"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 1
    new-instance v7, Landroid/animation/ObjectAnimator;

    invoke-direct {v7}, Landroid/animation/ObjectAnimator;-><init>()V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move-object v4, v7

    move/from16 v5, p7

    move-object/from16 v6, p3

    invoke-static/range {v0 .. v6}, Lb1;->R(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Landroid/animation/ValueAnimator;FLorg/xmlpull/v1/XmlPullParser;)Landroid/animation/ValueAnimator;

    goto :goto_1

    :cond_2
    const-string v5, "animator"

    .line 2
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move/from16 v5, p7

    move-object/from16 v6, p3

    invoke-static/range {v0 .. v6}, Lb1;->R(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Landroid/animation/ValueAnimator;FLorg/xmlpull/v1/XmlPullParser;)Landroid/animation/ValueAnimator;

    move-result-object v7

    :goto_1
    move-object v0, v7

    move/from16 v19, v12

    goto/16 :goto_17

    :cond_3
    const-string v5, "set"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    new-instance v15, Landroid/animation/AnimatorSet;

    invoke-direct {v15}, Landroid/animation/AnimatorSet;-><init>()V

    sget-object v0, Lkf;->h:[I

    move-object/from16 v7, p4

    invoke-static {v8, v9, v7, v0}, Lb1;->V(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v6

    const-string v0, "ordering"

    invoke-static {v6, v10, v0, v14, v14}, Lb1;->E(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object v5, v15

    move-object/from16 v17, v6

    move/from16 v6, v16

    move/from16 v7, p7

    invoke-static/range {v0 .. v7}, Lb1;->k(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/animation/AnimatorSet;IF)Landroid/animation/Animator;

    invoke-virtual/range {v17 .. v17}, Landroid/content/res/TypedArray;->recycle()V

    move/from16 v19, v12

    move-object v0, v15

    goto/16 :goto_17

    :cond_4
    const-string v5, "propertyValuesHolder"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2e

    invoke-static/range {p3 .. p3}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v1

    const/4 v6, 0x0

    .line 3
    :goto_2
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v7

    if-eq v7, v2, :cond_28

    if-eq v7, v3, :cond_28

    if-eq v7, v4, :cond_5

    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    goto :goto_2

    :cond_5
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_27

    sget-object v3, Lkf;->i:[I

    invoke-static {v8, v9, v1, v3}, Lb1;->V(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v3

    const-string v7, "propertyName"

    invoke-static {v3, v10, v7, v2}, Lb1;->F(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v7

    const-string v14, "valueType"

    const/4 v15, 0x4

    invoke-static {v3, v10, v14, v4, v15}, Lb1;->E(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v4

    const/4 v14, 0x0

    move-object/from16 v16, v1

    move v15, v4

    .line 4
    :goto_3
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    if-eq v1, v2, :cond_17

    move/from16 v17, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_17

    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "keyframe"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    const-string v1, "value"

    const/4 v2, 0x4

    if-ne v15, v2, :cond_9

    invoke-static/range {p3 .. p3}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v2

    .line 5
    sget-object v15, Lkf;->j:[I

    invoke-static {v8, v9, v2, v15}, Lb1;->V(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 6
    invoke-static {v10, v1}, Lb1;->N(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v15

    if-nez v15, :cond_6

    const/4 v15, 0x0

    goto :goto_4

    :cond_6
    const/4 v15, 0x0

    invoke-virtual {v2, v15}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v15

    :goto_4
    if-eqz v15, :cond_7

    const/16 v17, 0x1

    goto :goto_5

    :cond_7
    const/16 v17, 0x0

    :goto_5
    if-eqz v17, :cond_8

    .line 7
    iget v15, v15, Landroid/util/TypedValue;->type:I

    invoke-static {v15}, Lb1;->Q(I)Z

    move-result v15

    if-eqz v15, :cond_8

    const/4 v15, 0x3

    goto :goto_6

    :cond_8
    const/4 v15, 0x0

    :goto_6
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 8
    :cond_9
    invoke-static/range {p3 .. p3}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v2

    move-object/from16 v18, v5

    .line 9
    sget-object v5, Lkf;->j:[I

    invoke-static {v8, v9, v2, v5}, Lb1;->V(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    const/high16 v5, -0x40800000    # -1.0f

    const-string v8, "fraction"

    const/4 v9, 0x3

    invoke-static {v2, v10, v8, v9, v5}, Lb1;->D(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v5

    .line 10
    invoke-static {v10, v1}, Lb1;->N(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_a

    const/4 v8, 0x0

    goto :goto_7

    :cond_a
    const/4 v8, 0x0

    invoke-virtual {v2, v8}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v8

    :goto_7
    if-eqz v8, :cond_b

    const/4 v9, 0x1

    goto :goto_8

    :cond_b
    const/4 v9, 0x0

    :goto_8
    move/from16 v19, v12

    const/4 v12, 0x4

    if-ne v15, v12, :cond_d

    if-eqz v9, :cond_c

    .line 11
    iget v8, v8, Landroid/util/TypedValue;->type:I

    invoke-static {v8}, Lb1;->Q(I)Z

    move-result v8

    if-eqz v8, :cond_c

    const/4 v8, 0x3

    goto :goto_9

    :cond_c
    const/4 v8, 0x0

    goto :goto_9

    :cond_d
    move v8, v15

    :goto_9
    if-eqz v9, :cond_10

    if-eqz v8, :cond_f

    const/4 v9, 0x1

    if-eq v8, v9, :cond_e

    const/4 v9, 0x3

    if-eq v8, v9, :cond_e

    const/4 v1, 0x0

    goto :goto_a

    :cond_e
    const/4 v8, 0x0

    invoke-static {v2, v10, v1, v8, v8}, Lb1;->E(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v1

    invoke-static {v5, v1}, Landroid/animation/Keyframe;->ofInt(FI)Landroid/animation/Keyframe;

    move-result-object v1

    goto :goto_a

    :cond_f
    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static {v2, v10, v1, v8, v9}, Lb1;->D(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v1

    invoke-static {v5, v1}, Landroid/animation/Keyframe;->ofFloat(FF)Landroid/animation/Keyframe;

    move-result-object v1

    goto :goto_a

    :cond_10
    if-nez v8, :cond_11

    invoke-static {v5}, Landroid/animation/Keyframe;->ofFloat(F)Landroid/animation/Keyframe;

    move-result-object v1

    goto :goto_a

    :cond_11
    invoke-static {v5}, Landroid/animation/Keyframe;->ofInt(F)Landroid/animation/Keyframe;

    move-result-object v1

    :goto_a
    const-string v5, "interpolator"

    .line 12
    invoke-static {v10, v5}, Lb1;->N(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_12

    const/4 v5, 0x0

    goto :goto_b

    :cond_12
    const/4 v5, 0x0

    const/4 v8, 0x1

    invoke-virtual {v2, v8, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    :goto_b
    move-object/from16 v8, p0

    if-lez v5, :cond_13

    .line 13
    invoke-static {v8, v5}, Lb1;->S(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/animation/Keyframe;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    :cond_13
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v1, :cond_15

    if-nez v14, :cond_14

    .line 14
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    :cond_14
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_15
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    const/4 v2, 0x3

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move-object/from16 v5, v18

    move/from16 v12, v19

    goto/16 :goto_3

    :cond_16
    move-object/from16 v8, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move/from16 v2, v17

    goto/16 :goto_3

    :cond_17
    move-object/from16 v8, p0

    move-object/from16 v18, v5

    move/from16 v19, v12

    if-eqz v14, :cond_22

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_22

    const/4 v2, 0x0

    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/animation/Keyframe;

    add-int/lit8 v5, v1, -0x1

    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/animation/Keyframe;

    invoke-virtual {v5}, Landroid/animation/Keyframe;->getFraction()F

    move-result v9

    const/high16 v12, 0x3f800000    # 1.0f

    cmpg-float v17, v9, v12

    if-gez v17, :cond_19

    const/16 v17, 0x0

    cmpg-float v9, v9, v17

    if-gez v9, :cond_18

    invoke-virtual {v5, v12}, Landroid/animation/Keyframe;->setFraction(F)V

    goto :goto_c

    :cond_18
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v9

    invoke-static {v5, v12}, Lb1;->o(Landroid/animation/Keyframe;F)Landroid/animation/Keyframe;

    move-result-object v5

    invoke-virtual {v14, v9, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    :cond_19
    :goto_c
    invoke-virtual {v2}, Landroid/animation/Keyframe;->getFraction()F

    move-result v5

    const/4 v9, 0x0

    cmpl-float v12, v5, v9

    if-eqz v12, :cond_1b

    cmpg-float v5, v5, v9

    if-gez v5, :cond_1a

    invoke-virtual {v2, v9}, Landroid/animation/Keyframe;->setFraction(F)V

    goto :goto_d

    :cond_1a
    invoke-static {v2, v9}, Lb1;->o(Landroid/animation/Keyframe;F)Landroid/animation/Keyframe;

    move-result-object v2

    const/4 v5, 0x0

    invoke-virtual {v14, v5, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    :cond_1b
    :goto_d
    new-array v2, v1, [Landroid/animation/Keyframe;

    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    const/4 v5, 0x0

    :goto_e
    if-ge v5, v1, :cond_21

    aget-object v9, v2, v5

    invoke-virtual {v9}, Landroid/animation/Keyframe;->getFraction()F

    move-result v12

    const/4 v14, 0x0

    cmpg-float v12, v12, v14

    if-gez v12, :cond_20

    if-nez v5, :cond_1c

    goto :goto_f

    :cond_1c
    add-int/lit8 v12, v1, -0x1

    const/high16 v14, 0x3f800000    # 1.0f

    if-ne v5, v12, :cond_1d

    :goto_f
    invoke-virtual {v9, v14}, Landroid/animation/Keyframe;->setFraction(F)V

    goto :goto_13

    :cond_1d
    add-int/lit8 v9, v5, 0x1

    move v14, v5

    :goto_10
    if-ge v9, v12, :cond_1f

    aget-object v17, v2, v9

    invoke-virtual/range {v17 .. v17}, Landroid/animation/Keyframe;->getFraction()F

    move-result v17

    const/16 v20, 0x0

    cmpl-float v17, v17, v20

    if-ltz v17, :cond_1e

    goto :goto_11

    :cond_1e
    add-int/lit8 v14, v9, 0x1

    move/from16 v21, v14

    move v14, v9

    move/from16 v9, v21

    goto :goto_10

    :cond_1f
    :goto_11
    add-int/lit8 v9, v14, 0x1

    aget-object v9, v2, v9

    invoke-virtual {v9}, Landroid/animation/Keyframe;->getFraction()F

    move-result v9

    add-int/lit8 v12, v5, -0x1

    aget-object v12, v2, v12

    invoke-virtual {v12}, Landroid/animation/Keyframe;->getFraction()F

    move-result v12

    sub-float/2addr v9, v12

    sub-int v12, v14, v5

    add-int/lit8 v12, v12, 0x2

    int-to-float v12, v12

    div-float/2addr v9, v12

    move v12, v5

    :goto_12
    if-gt v12, v14, :cond_20

    move/from16 v17, v1

    .line 15
    aget-object v1, v2, v12

    add-int/lit8 v20, v12, -0x1

    aget-object v20, v2, v20

    invoke-virtual/range {v20 .. v20}, Landroid/animation/Keyframe;->getFraction()F

    move-result v20

    add-float v8, v20, v9

    invoke-virtual {v1, v8}, Landroid/animation/Keyframe;->setFraction(F)V

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v8, p0

    move/from16 v1, v17

    goto :goto_12

    :cond_20
    :goto_13
    move/from16 v17, v1

    add-int/lit8 v5, v5, 0x1

    move-object/from16 v8, p0

    move/from16 v1, v17

    goto :goto_e

    .line 16
    :cond_21
    invoke-static {v7, v2}, Landroid/animation/PropertyValuesHolder;->ofKeyframe(Ljava/lang/String;[Landroid/animation/Keyframe;)Landroid/animation/PropertyValuesHolder;

    move-result-object v1

    const/4 v2, 0x3

    if-ne v15, v2, :cond_23

    .line 17
    sget-object v5, Lqf;->a:Lqf;

    .line 18
    invoke-virtual {v1, v5}, Landroid/animation/PropertyValuesHolder;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    goto :goto_14

    :cond_22
    const/4 v2, 0x3

    const/4 v1, 0x0

    :cond_23
    :goto_14
    const/4 v5, 0x0

    const/4 v8, 0x1

    if-nez v1, :cond_24

    .line 19
    invoke-static {v3, v4, v5, v8, v7}, Lb1;->G(Landroid/content/res/TypedArray;IIILjava/lang/String;)Landroid/animation/PropertyValuesHolder;

    move-result-object v1

    :cond_24
    if-eqz v1, :cond_26

    if-nez v6, :cond_25

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move-object v6, v4

    :cond_25
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_26
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_15

    :cond_27
    move-object/from16 v16, v1

    move-object/from16 v18, v5

    move/from16 v19, v12

    :goto_15
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    const/4 v3, 0x1

    const/4 v4, 0x2

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move-object/from16 v1, v16

    move-object/from16 v5, v18

    move/from16 v12, v19

    goto/16 :goto_2

    :cond_28
    move/from16 v19, v12

    if-eqz v6, :cond_29

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v2, v1, [Landroid/animation/PropertyValuesHolder;

    const/4 v3, 0x0

    :goto_16
    if-ge v3, v1, :cond_2a

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/animation/PropertyValuesHolder;

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_16

    :cond_29
    const/4 v2, 0x0

    :cond_2a
    if-eqz v2, :cond_2b

    .line 20
    instance-of v1, v0, Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_2b

    move-object v1, v0

    check-cast v1, Landroid/animation/ValueAnimator;

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    :cond_2b
    const/4 v14, 0x1

    :goto_17
    if-eqz v11, :cond_2d

    if-nez v14, :cond_2d

    if-nez v13, :cond_2c

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    :cond_2c
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2d
    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move/from16 v12, v19

    goto/16 :goto_0

    :cond_2e
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unknown animator name: "

    invoke-static {v1}, Lgg;->d(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2f
    if-eqz v11, :cond_32

    if-eqz v13, :cond_32

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Landroid/animation/Animator;

    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_18
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_30

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/animation/Animator;

    add-int/lit8 v5, v3, 0x1

    aput-object v4, v1, v3

    move v3, v5

    goto :goto_18

    :cond_30
    if-nez p6, :cond_31

    invoke-virtual {v11, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    goto :goto_19

    :cond_31
    invoke-virtual {v11, v1}, Landroid/animation/AnimatorSet;->playSequentially([Landroid/animation/Animator;)V

    :cond_32
    :goto_19
    return-object v0
.end method

.method public static k0(Landroid/widget/TextView;I)V
    .locals 2

    invoke-static {p1}, Lb1;->e(I)I

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    move-result v0

    if-eq p1, v0, :cond_0

    sub-int/2addr p1, v0

    int-to-float p1, p1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, p1, v0}, Landroid/widget/TextView;->setLineSpacing(FF)V

    :cond_0
    return-void
.end method

.method public static l(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;
    .locals 4

    invoke-static {p1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v0

    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_0

    goto :goto_0

    :cond_0
    if-ne v1, v2, :cond_1

    invoke-static {p0, p1, v0, p2}, Lb1;->m(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string p1, "No start tag found"

    invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw p0

    :goto_2
    goto :goto_1
.end method

.method public static l0(Landroid/widget/PopupWindow;Z)V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setOverlapAnchor(Z)V

    goto :goto_1

    :cond_0
    const/16 v1, 0x15

    if-lt v0, v1, :cond_2

    sget-boolean v0, Lb1;->t:Z

    const-string v1, "PopupWindowCompatApi21"

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :try_start_0
    const-class v2, Landroid/widget/PopupWindow;

    const-string v3, "mOverlapAnchor"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    sput-object v2, Lb1;->s:Ljava/lang/reflect/Field;

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "Could not fetch mOverlapAnchor field from PopupWindow"

    invoke-static {v1, v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    sput-boolean v0, Lb1;->t:Z

    :cond_1
    sget-object v0, Lb1;->s:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_2

    :try_start_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p0

    const-string p1, "Could not set overlap anchor field in PopupWindow"

    invoke-static {v1, p1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2
    :goto_1
    return-void
.end method

.method public static m(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;
    .locals 17

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "selector"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    .line 1
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v2

    const/4 v3, 0x1

    add-int/2addr v2, v3

    const/16 v4, 0x14

    new-array v5, v4, [[I

    new-array v4, v4, [I

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v8

    if-eq v8, v3, :cond_d

    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v9

    if-ge v9, v2, :cond_0

    const/4 v10, 0x3

    if-eq v8, v10, :cond_d

    :cond_0
    const/4 v10, 0x2

    if-ne v8, v10, :cond_c

    if-gt v9, v2, :cond_c

    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v9, "item"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    goto/16 :goto_7

    :cond_1
    sget-object v8, Li9;->ColorStateListItem:[I

    if-nez v1, :cond_2

    move-object/from16 v9, p0

    .line 2
    invoke-virtual {v9, v0, v8}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v8

    goto :goto_1

    :cond_2
    move-object/from16 v9, p0

    invoke-virtual {v1, v0, v8, v6, v6}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v8

    .line 3
    :goto_1
    sget v10, Li9;->ColorStateListItem_android_color:I

    const v11, -0xff01

    invoke-virtual {v8, v10, v11}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v10

    const/high16 v11, 0x3f800000    # 1.0f

    sget v12, Li9;->ColorStateListItem_android_alpha:I

    invoke-virtual {v8, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v12

    if-eqz v12, :cond_3

    sget v12, Li9;->ColorStateListItem_android_alpha:I

    goto :goto_2

    :cond_3
    sget v12, Li9;->ColorStateListItem_alpha:I

    invoke-virtual {v8, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v12

    if-eqz v12, :cond_4

    sget v12, Li9;->ColorStateListItem_alpha:I

    :goto_2
    invoke-virtual {v8, v12, v11}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v11

    :cond_4
    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getAttributeCount()I

    move-result v8

    new-array v12, v8, [I

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_3
    if-ge v13, v8, :cond_7

    invoke-interface {v0, v13}, Landroid/util/AttributeSet;->getAttributeNameResource(I)I

    move-result v15

    const v3, 0x10101a5

    if-eq v15, v3, :cond_6

    const v3, 0x101031f

    if-eq v15, v3, :cond_6

    sget v3, Lg9;->alpha:I

    if-eq v15, v3, :cond_6

    add-int/lit8 v3, v14, 0x1

    invoke-interface {v0, v13, v6}, Landroid/util/AttributeSet;->getAttributeBooleanValue(IZ)Z

    move-result v16

    if-eqz v16, :cond_5

    goto :goto_4

    :cond_5
    neg-int v15, v15

    :goto_4
    aput v15, v12, v14

    move v14, v3

    :cond_6
    add-int/lit8 v13, v13, 0x1

    const/4 v3, 0x1

    goto :goto_3

    :cond_7
    invoke-static {v12, v14}, Landroid/util/StateSet;->trimStateSet([II)[I

    move-result-object v3

    .line 4
    invoke-static {v10}, Landroid/graphics/Color;->alpha(I)I

    move-result v8

    int-to-float v8, v8

    mul-float v8, v8, v11

    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v8

    const v11, 0xffffff

    and-int/2addr v10, v11

    shl-int/lit8 v8, v8, 0x18

    or-int/2addr v8, v10

    add-int/lit8 v10, v7, 0x1

    .line 5
    array-length v11, v4

    const/4 v12, 0x4

    const/16 v13, 0x8

    if-le v10, v11, :cond_9

    if-gt v7, v12, :cond_8

    const/16 v11, 0x8

    goto :goto_5

    :cond_8
    mul-int/lit8 v11, v7, 0x2

    :goto_5
    new-array v11, v11, [I

    invoke-static {v4, v6, v11, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v4, v11

    :cond_9
    aput v8, v4, v7

    .line 6
    array-length v8, v5

    if-le v10, v8, :cond_b

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v8

    if-gt v7, v12, :cond_a

    goto :goto_6

    :cond_a
    mul-int/lit8 v13, v7, 0x2

    :goto_6
    invoke-static {v8, v13}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Ljava/lang/Object;

    invoke-static {v5, v6, v8, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v5, v8

    :cond_b
    aput-object v3, v5, v7

    .line 7
    check-cast v5, [[I

    move v7, v10

    goto :goto_8

    :cond_c
    :goto_7
    move-object/from16 v9, p0

    :goto_8
    const/4 v3, 0x1

    goto/16 :goto_0

    :cond_d
    new-array v0, v7, [I

    new-array v1, v7, [[I

    invoke-static {v4, v6, v0, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v5, v6, v1, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v2, Landroid/content/res/ColorStateList;

    invoke-direct {v2, v1, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object v2

    .line 8
    :cond_e
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": invalid color state list tag "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    goto :goto_a

    :goto_9
    throw v0

    :goto_a
    goto :goto_9
.end method

.method public static m0(Ljava/util/List;II)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lq8;",
            ">;II)V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_a

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq8;

    const/4 v4, 0x0

    if-eqz v3, :cond_9

    const/4 v5, 0x1

    if-nez p1, :cond_0

    .line 1
    iget-object v4, v3, Lq8;->h:Ljava/util/HashSet;

    goto :goto_1

    :cond_0
    if-ne p1, v5, :cond_1

    iget-object v4, v3, Lq8;->i:Ljava/util/HashSet;

    .line 2
    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo8;

    iget-boolean v6, v4, Lo8;->b0:Z

    if-eqz v6, :cond_2

    mul-int/lit8 v6, p1, 0x2

    .line 3
    iget-object v7, v4, Lo8;->A:[Ln8;

    aget-object v8, v7, v6

    add-int/lit8 v9, v6, 0x1

    aget-object v7, v7, v9

    iget-object v9, v8, Ln8;->d:Ln8;

    if-eqz v9, :cond_3

    iget-object v9, v7, Ln8;->d:Ln8;

    if-eqz v9, :cond_3

    const/4 v9, 0x1

    goto :goto_3

    :cond_3
    const/4 v9, 0x0

    :goto_3
    if-eqz v9, :cond_4

    invoke-static {v4, p1}, Lb1;->K(Lo8;I)I

    move-result v6

    invoke-virtual {v8}, Ln8;->b()I

    move-result v7

    add-int/2addr v7, v6

    :goto_4
    invoke-static {v4, p1, v7}, Ls8;->b(Lo8;II)V

    goto :goto_2

    :cond_4
    iget v9, v4, Lo8;->G:F

    const/4 v10, 0x0

    cmpl-float v9, v9, v10

    if-eqz v9, :cond_5

    invoke-virtual {v4, p1}, Lo8;->g(I)Lo8$a;

    move-result-object v9

    sget-object v10, Lo8$a;->d:Lo8$a;

    if-ne v9, v10, :cond_5

    invoke-static {v4}, Lb1;->d0(Lo8;)I

    move-result v9

    iget-object v10, v4, Lo8;->A:[Ln8;

    aget-object v6, v10, v6

    .line 4
    iget-object v6, v6, Ln8;->a:Lt8;

    .line 5
    iget v6, v6, Lt8;->g:F

    float-to-int v6, v6

    add-int v10, v6, v9

    .line 6
    iget-object v7, v7, Ln8;->a:Lt8;

    iget-object v8, v8, Ln8;->a:Lt8;

    .line 7
    iput-object v8, v7, Lt8;->f:Lt8;

    int-to-float v8, v9

    iput v8, v7, Lt8;->g:F

    iput v5, v7, Lv8;->b:I

    invoke-virtual {v4, v6, v10, p1}, Lo8;->v(III)V

    goto :goto_2

    :cond_5
    if-nez p1, :cond_6

    .line 8
    iget v6, v4, Lo8;->K:I

    goto :goto_5

    :cond_6
    if-ne p1, v5, :cond_7

    iget v6, v4, Lo8;->L:I

    goto :goto_5

    :cond_7
    const/4 v6, 0x0

    :goto_5
    sub-int v6, p2, v6

    .line 9
    invoke-virtual {v4, p1}, Lo8;->j(I)I

    move-result v7

    sub-int v7, v6, v7

    invoke-virtual {v4, v7, v6, p1}, Lo8;->v(III)V

    goto :goto_4

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 10
    :cond_9
    throw v4

    :cond_a
    return-void
.end method

.method public static n(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)Landroid/view/animation/Interpolator;
    .locals 4

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v3

    if-le v3, v0, :cond_c

    :cond_0
    const/4 v3, 0x1

    if-eq v2, v3, :cond_c

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v1

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "linearInterpolator"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    goto :goto_0

    :cond_2
    const-string v3, "accelerateInterpolator"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v2, p0, v1}, Landroid/view/animation/AccelerateInterpolator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    :goto_1
    move-object v1, v2

    goto :goto_0

    :cond_3
    const-string v3, "decelerateInterpolator"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2, p0, v1}, Landroid/view/animation/DecelerateInterpolator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_1

    :cond_4
    const-string v3, "accelerateDecelerateInterpolator"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    new-instance v1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    goto :goto_0

    :cond_5
    const-string v3, "cycleInterpolator"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    new-instance v2, Landroid/view/animation/CycleInterpolator;

    invoke-direct {v2, p0, v1}, Landroid/view/animation/CycleInterpolator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_1

    :cond_6
    const-string v3, "anticipateInterpolator"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    new-instance v2, Landroid/view/animation/AnticipateInterpolator;

    invoke-direct {v2, p0, v1}, Landroid/view/animation/AnticipateInterpolator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_1

    :cond_7
    const-string v3, "overshootInterpolator"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    new-instance v2, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {v2, p0, v1}, Landroid/view/animation/OvershootInterpolator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_1

    :cond_8
    const-string v3, "anticipateOvershootInterpolator"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    new-instance v2, Landroid/view/animation/AnticipateOvershootInterpolator;

    invoke-direct {v2, p0, v1}, Landroid/view/animation/AnticipateOvershootInterpolator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_1

    :cond_9
    const-string v3, "bounceInterpolator"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    new-instance v1, Landroid/view/animation/BounceInterpolator;

    invoke-direct {v1}, Landroid/view/animation/BounceInterpolator;-><init>()V

    goto/16 :goto_0

    :cond_a
    const-string v3, "pathInterpolator"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    new-instance v2, Lrf;

    invoke-direct {v2, p0, v1, p1}, Lrf;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_1

    :cond_b
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "Unknown interpolator name: "

    invoke-static {v0}, Lgg;->d(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_c
    return-object v1
.end method

.method public static n0(Landroid/graphics/drawable/Drawable;I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lka;

    if-eqz v0, :cond_1

    check-cast p0, Lka;

    invoke-interface {p0, p1}, Lka;->setTint(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static o(Landroid/animation/Keyframe;F)Landroid/animation/Keyframe;
    .locals 2

    invoke-virtual {p0}, Landroid/animation/Keyframe;->getType()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Landroid/animation/Keyframe;->ofFloat(F)Landroid/animation/Keyframe;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/animation/Keyframe;->getType()Ljava/lang/Class;

    move-result-object p0

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_1

    invoke-static {p1}, Landroid/animation/Keyframe;->ofInt(F)Landroid/animation/Keyframe;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-static {p1}, Landroid/animation/Keyframe;->ofObject(F)Landroid/animation/Keyframe;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static o0(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lka;

    if-eqz v0, :cond_1

    check-cast p0, Lka;

    invoke-interface {p0, p1}, Lka;->setTintList(Landroid/content/res/ColorStateList;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static p(Ljava/lang/String;)[Laa;
    .locals 16

    move-object/from16 v0, p0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    :goto_0
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v3, v5, :cond_10

    .line 1
    :goto_1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v5

    const/16 v6, 0x45

    const/16 v7, 0x65

    if-ge v3, v5, :cond_3

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    add-int/lit8 v8, v5, -0x41

    add-int/lit8 v9, v5, -0x5a

    mul-int v9, v9, v8

    if-lez v9, :cond_1

    add-int/lit8 v8, v5, -0x61

    add-int/lit8 v9, v5, -0x7a

    mul-int v9, v9, v8

    if-gtz v9, :cond_2

    :cond_1
    if-eq v5, v7, :cond_2

    if-eq v5, v6, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 2
    :cond_3
    :goto_2
    invoke-virtual {v0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_f

    .line 3
    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v8, 0x7a

    if-eq v5, v8, :cond_e

    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v8, 0x5a

    if-ne v5, v8, :cond_4

    goto/16 :goto_a

    :cond_4
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    new-array v5, v5, [F

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    const/4 v9, 0x1

    const/4 v10, 0x0

    :goto_3
    if-ge v9, v8, :cond_d

    const/4 v2, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move v14, v9

    .line 4
    :goto_4
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v15

    if-ge v14, v15, :cond_a

    invoke-virtual {v4, v14}, Ljava/lang/String;->charAt(I)C

    move-result v15

    const/16 v7, 0x20

    if-eq v15, v7, :cond_7

    const/16 v7, 0x65

    if-eq v15, v6, :cond_6

    if-eq v15, v7, :cond_6

    packed-switch v15, :pswitch_data_0

    goto :goto_6

    :pswitch_0
    if-nez v12, :cond_5

    const/4 v12, 0x1

    goto :goto_6

    :pswitch_1
    if-eq v14, v9, :cond_8

    if-nez v13, :cond_8

    :cond_5
    const/4 v11, 0x1

    goto :goto_5

    :cond_6
    const/4 v13, 0x1

    goto :goto_7

    :cond_7
    const/16 v7, 0x65

    :goto_5
    :pswitch_2
    const/4 v2, 0x1

    :cond_8
    :goto_6
    const/4 v13, 0x0

    :goto_7
    if-eqz v2, :cond_9

    goto :goto_8

    :cond_9
    add-int/lit8 v14, v14, 0x1

    goto :goto_4

    :cond_a
    :goto_8
    if-ge v9, v14, :cond_b

    add-int/lit8 v2, v10, 0x1

    .line 5
    invoke-virtual {v4, v9, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v9

    aput v9, v5, v10

    move v10, v2

    :cond_b
    if-eqz v11, :cond_c

    goto :goto_9

    :cond_c
    add-int/lit8 v14, v14, 0x1

    :goto_9
    move v9, v14

    const/4 v2, 0x0

    goto :goto_3

    :cond_d
    invoke-static {v5, v2, v10}, Lb1;->h([FII)[F

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v5, 0x0

    move-object v5, v2

    const/4 v2, 0x0

    goto :goto_b

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "error in parsing \""

    const-string v3, "\""

    invoke-static {v2, v4, v3}, Lgg;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_e
    :goto_a
    new-array v5, v2, [F

    .line 6
    :goto_b
    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 7
    new-instance v4, Laa;

    invoke-direct {v4, v2, v5}, Laa;-><init>(C[F)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_f
    add-int/lit8 v2, v3, 0x1

    const/4 v4, 0x0

    move v4, v3

    move v3, v2

    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_10
    sub-int/2addr v3, v4

    const/4 v2, 0x1

    if-ne v3, v2, :cond_11

    .line 8
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v4, v2, :cond_11

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/4 v2, 0x0

    new-array v2, v2, [F

    .line 9
    new-instance v3, Laa;

    invoke-direct {v3, v0, v2}, Laa;-><init>(C[F)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    :cond_11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Laa;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Laa;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x2c
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static p0(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lka;

    if-eqz v0, :cond_1

    check-cast p0, Lka;

    invoke-interface {p0, p1}, Lka;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static q(Ljava/lang/String;)Landroid/graphics/Path;
    .locals 3

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    invoke-static {p0}, Lb1;->p(Ljava/lang/String;)[Laa;

    move-result-object v1

    if-eqz v1, :cond_0

    :try_start_0
    invoke-static {v1, v0}, Laa;->b([Laa;Landroid/graphics/Path;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Error in parsing "

    invoke-static {v2, p0}, Lgg;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static q0(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1}, Landroid/view/View;->setTooltipText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1
    :cond_0
    sget-object v0, Li7;->k:Li7;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, v0, Li7;->b:Landroid/view/View;

    if-ne v0, p0, :cond_1

    invoke-static {v1}, Li7;->c(Li7;)V

    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, Li7;->l:Li7;

    if-eqz p1, :cond_2

    iget-object v0, p1, Li7;->b:Landroid/view/View;

    if-ne v0, p0, :cond_2

    invoke-virtual {p1}, Li7;->b()V

    :cond_2
    invoke-virtual {p0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setLongClickable(Z)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setOnHoverListener(Landroid/view/View$OnHoverListener;)V

    goto :goto_0

    :cond_3
    new-instance v0, Li7;

    invoke-direct {v0, p0, p1}, Li7;-><init>(Landroid/view/View;Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public static r([Laa;)[Laa;
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    array-length v0, p0

    new-array v0, v0, [Laa;

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    new-instance v2, Laa;

    aget-object v3, p0, v1

    invoke-direct {v2, v3}, Laa;-><init>(Laa;)V

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static r0(Landroid/widget/PopupWindow;I)V
    .locals 6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setWindowLayoutType(I)V

    return-void

    :cond_0
    sget-boolean v0, Lb1;->r:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    :try_start_0
    const-class v0, Landroid/widget/PopupWindow;

    const-string v3, "setWindowLayoutType"

    new-array v4, v2, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v4, v1

    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lb1;->q:Ljava/lang/reflect/Method;

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    sput-boolean v2, Lb1;->r:Z

    :cond_1
    sget-object v0, Lb1;->q:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_2

    :try_start_1
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v1

    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_2
    return-void
.end method

.method public static s(Lp8;)V
    .locals 11

    .line 1
    sget-object v0, Lo8$a;->b:Lo8$a;

    sget-object v1, Lo8$a;->c:Lo8$a;

    iget v2, p0, Lp8;->B0:I

    const/16 v3, 0x20

    and-int/2addr v2, v3

    const/4 v4, 0x0

    if-eq v2, v3, :cond_0

    .line 2
    iget-object v0, p0, Lp8;->v0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lp8;->v0:Ljava/util/List;

    new-instance v1, Lq8;

    iget-object p0, p0, Lp8;->j0:Ljava/util/ArrayList;

    invoke-direct {v1, p0}, Lq8;-><init>(Ljava/util/List;)V

    invoke-interface {v0, v4, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void

    :cond_0
    const/4 v2, 0x1

    .line 3
    iput-boolean v2, p0, Lp8;->C0:Z

    iput-boolean v4, p0, Lp8;->w0:Z

    iput-boolean v4, p0, Lp8;->x0:Z

    iput-boolean v4, p0, Lp8;->y0:Z

    iget-object v3, p0, Lp8;->j0:Ljava/util/ArrayList;

    iget-object v5, p0, Lp8;->v0:Ljava/util/List;

    invoke-virtual {p0}, Lo8;->i()Lo8$a;

    move-result-object v6

    if-ne v6, v1, :cond_1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {p0}, Lo8;->m()Lo8$a;

    move-result-object v7

    if-ne v7, v1, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    if-nez v6, :cond_4

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    const/4 v7, 0x0

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v7, 0x1

    :goto_3
    invoke-interface {v5}, Ljava/util/List;->clear()V

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lo8;

    const/4 v10, 0x0

    iput-object v10, v9, Lo8;->p:Lq8;

    iput-boolean v4, v9, Lo8;->d0:Z

    invoke-virtual {v9}, Lo8;->s()V

    goto :goto_4

    :cond_5
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lo8;

    iget-object v9, v8, Lo8;->p:Lq8;

    if-nez v9, :cond_6

    .line 4
    new-instance v9, Lq8;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v9, v10, v2}, Lq8;-><init>(Ljava/util/List;Z)V

    invoke-interface {v5, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v8, v9, v5, v7}, Lb1;->u0(Lo8;Lq8;Ljava/util/List;Z)Z

    move-result v8

    if-nez v8, :cond_6

    .line 5
    iget-object v0, p0, Lp8;->v0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lp8;->v0:Ljava/util/List;

    new-instance v1, Lq8;

    iget-object v2, p0, Lp8;->j0:Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Lq8;-><init>(Ljava/util/List;)V

    invoke-interface {v0, v4, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 6
    iput-boolean v4, p0, Lp8;->C0:Z

    return-void

    :cond_7
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lq8;

    invoke-static {v9, v4}, Lb1;->z(Lq8;I)I

    move-result v10

    invoke-static {v7, v10}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-static {v9, v2}, Lb1;->z(Lq8;I)I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v8

    goto :goto_5

    :cond_8
    if-eqz v6, :cond_9

    invoke-virtual {p0, v0}, Lo8;->y(Lo8$a;)V

    invoke-virtual {p0, v7}, Lo8;->C(I)V

    iput-boolean v2, p0, Lp8;->w0:Z

    iput-boolean v2, p0, Lp8;->x0:Z

    iput v7, p0, Lp8;->z0:I

    :cond_9
    if-eqz v1, :cond_a

    invoke-virtual {p0, v0}, Lo8;->B(Lo8$a;)V

    invoke-virtual {p0, v8}, Lo8;->w(I)V

    iput-boolean v2, p0, Lp8;->w0:Z

    iput-boolean v2, p0, Lp8;->y0:Z

    iput v8, p0, Lp8;->A0:I

    :cond_a
    invoke-virtual {p0}, Lo8;->n()I

    move-result v0

    invoke-static {v5, v4, v0}, Lb1;->m0(Ljava/util/List;II)V

    invoke-virtual {p0}, Lo8;->h()I

    move-result p0

    invoke-static {v5, v2, p0}, Lb1;->m0(Ljava/util/List;II)V

    return-void
.end method

.method public static s0(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 3

    const/4 v0, 0x1

    :goto_0
    if-lez v0, :cond_2

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static t(Ljava/lang/Object;)V
    .locals 4

    sget-boolean v0, Lb1;->d:Z

    const/4 v1, 0x1

    const-string v2, "ResourcesFlusher"

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "android.content.res.ThemedResourceCache"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lb1;->c:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v3, "Could not find ThemedResourceCache class"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    sput-boolean v1, Lb1;->d:Z

    :cond_0
    sget-object v0, Lb1;->c:Ljava/lang/Class;

    if-nez v0, :cond_1

    return-void

    :cond_1
    sget-boolean v3, Lb1;->f:Z

    if-nez v3, :cond_2

    :try_start_1
    const-string v3, "mUnthemedEntries"

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Lb1;->e:Ljava/lang/reflect/Field;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    const-string v3, "Could not retrieve ThemedResourceCache#mUnthemedEntries field"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    sput-boolean v1, Lb1;->f:Z

    :cond_2
    sget-object v0, Lb1;->e:Ljava/lang/reflect/Field;

    if-nez v0, :cond_3

    return-void

    :cond_3
    const/4 v1, 0x0

    :try_start_2
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/util/LongSparseArray;
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2

    move-object v1, p0

    goto :goto_2

    :catch_2
    move-exception p0

    const-string v0, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries"

    invoke-static {v2, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_2
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/util/LongSparseArray;->clear()V

    :cond_4
    return-void
.end method

.method public static t0([Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p0, v3

    invoke-static {v4, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static u(Landroid/view/LayoutInflater;Landroid/view/LayoutInflater$Factory2;)V
    .locals 6

    sget-boolean v0, Lb1;->n:Z

    const-string v1, "; inflation may have unexpected results."

    const-string v2, "LayoutInflaterCompatHC"

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :try_start_0
    const-class v3, Landroid/view/LayoutInflater;

    const-string v4, "mFactory2"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    sput-object v3, Lb1;->m:Ljava/lang/reflect/Field;

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v4, "forceSetFactory2 Could not find field \'mFactory2\' on class "

    invoke-static {v4}, Lgg;->d(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-class v5, Landroid/view/LayoutInflater;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    sput-boolean v0, Lb1;->n:Z

    :cond_0
    sget-object v0, Lb1;->m:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "forceSetFactory2 could not set the Factory2 on LayoutInflater "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_1
    return-void
.end method

.method public static u0(Lo8;Lq8;Ljava/util/List;Z)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo8;",
            "Lq8;",
            "Ljava/util/List<",
            "Lq8;",
            ">;Z)Z"
        }
    .end annotation

    sget-object v0, Lo8$a;->d:Lo8$a;

    const/4 v1, 0x1

    if-nez p0, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    iput-boolean v2, p0, Lo8;->c0:Z

    .line 1
    iget-object v3, p0, Lo8;->D:Lo8;

    .line 2
    check-cast v3, Lp8;

    iget-object v4, p0, Lo8;->p:Lq8;

    if-nez v4, :cond_1e

    iput-boolean v1, p0, Lo8;->b0:Z

    iget-object v4, p1, Lq8;->a:Ljava/util/List;

    invoke-interface {v4, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput-object p1, p0, Lo8;->p:Lq8;

    iget-object v4, p0, Lo8;->s:Ln8;

    iget-object v4, v4, Ln8;->d:Ln8;

    if-nez v4, :cond_1

    iget-object v4, p0, Lo8;->u:Ln8;

    iget-object v4, v4, Ln8;->d:Ln8;

    if-nez v4, :cond_1

    iget-object v4, p0, Lo8;->t:Ln8;

    iget-object v4, v4, Ln8;->d:Ln8;

    if-nez v4, :cond_1

    iget-object v4, p0, Lo8;->v:Ln8;

    iget-object v4, v4, Ln8;->d:Ln8;

    if-nez v4, :cond_1

    iget-object v4, p0, Lo8;->w:Ln8;

    iget-object v4, v4, Ln8;->d:Ln8;

    if-nez v4, :cond_1

    iget-object v4, p0, Lo8;->z:Ln8;

    iget-object v4, v4, Ln8;->d:Ln8;

    if-nez v4, :cond_1

    .line 3
    iput-boolean v2, p1, Lq8;->d:Z

    iput-boolean v2, v3, Lp8;->C0:Z

    iput-boolean v2, p0, Lo8;->b0:Z

    if-eqz p3, :cond_1

    return v2

    .line 4
    :cond_1
    iget-object v4, p0, Lo8;->t:Ln8;

    iget-object v4, v4, Ln8;->d:Ln8;

    if-eqz v4, :cond_4

    iget-object v4, p0, Lo8;->v:Ln8;

    iget-object v4, v4, Ln8;->d:Ln8;

    if-eqz v4, :cond_4

    invoke-virtual {v3}, Lo8;->m()Lo8$a;

    if-eqz p3, :cond_2

    .line 5
    :goto_0
    iput-boolean v2, p1, Lq8;->d:Z

    iput-boolean v2, v3, Lp8;->C0:Z

    iput-boolean v2, p0, Lo8;->b0:Z

    return v2

    .line 6
    :cond_2
    iget-object v4, p0, Lo8;->t:Ln8;

    iget-object v4, v4, Ln8;->d:Ln8;

    iget-object v4, v4, Ln8;->b:Lo8;

    .line 7
    iget-object v5, p0, Lo8;->D:Lo8;

    if-ne v4, v5, :cond_3

    .line 8
    iget-object v4, p0, Lo8;->v:Ln8;

    iget-object v4, v4, Ln8;->d:Ln8;

    iget-object v4, v4, Ln8;->b:Lo8;

    if-eq v4, v5, :cond_4

    .line 9
    :cond_3
    iput-boolean v2, p1, Lq8;->d:Z

    iput-boolean v2, v3, Lp8;->C0:Z

    iput-boolean v2, p0, Lo8;->b0:Z

    .line 10
    :cond_4
    iget-object v4, p0, Lo8;->s:Ln8;

    iget-object v4, v4, Ln8;->d:Ln8;

    if-eqz v4, :cond_7

    iget-object v4, p0, Lo8;->u:Ln8;

    iget-object v4, v4, Ln8;->d:Ln8;

    if-eqz v4, :cond_7

    invoke-virtual {v3}, Lo8;->i()Lo8$a;

    if-eqz p3, :cond_5

    goto :goto_0

    :cond_5
    iget-object v4, p0, Lo8;->s:Ln8;

    iget-object v4, v4, Ln8;->d:Ln8;

    iget-object v4, v4, Ln8;->b:Lo8;

    .line 11
    iget-object v5, p0, Lo8;->D:Lo8;

    if-ne v4, v5, :cond_6

    .line 12
    iget-object v4, p0, Lo8;->u:Ln8;

    iget-object v4, v4, Ln8;->d:Ln8;

    iget-object v4, v4, Ln8;->b:Lo8;

    if-eq v4, v5, :cond_7

    .line 13
    :cond_6
    iput-boolean v2, p1, Lq8;->d:Z

    iput-boolean v2, v3, Lp8;->C0:Z

    iput-boolean v2, p0, Lo8;->b0:Z

    .line 14
    :cond_7
    invoke-virtual {p0}, Lo8;->i()Lo8$a;

    move-result-object v4

    if-ne v4, v0, :cond_8

    const/4 v4, 0x1

    goto :goto_1

    :cond_8
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {p0}, Lo8;->m()Lo8$a;

    move-result-object v5

    if-ne v5, v0, :cond_9

    const/4 v5, 0x1

    goto :goto_2

    :cond_9
    const/4 v5, 0x0

    :goto_2
    xor-int/2addr v4, v5

    if-eqz v4, :cond_a

    iget v4, p0, Lo8;->G:F

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    if-eqz v4, :cond_a

    invoke-static {p0}, Lb1;->d0(Lo8;)I

    goto :goto_3

    :cond_a
    invoke-virtual {p0}, Lo8;->i()Lo8$a;

    move-result-object v4

    if-eq v4, v0, :cond_b

    invoke-virtual {p0}, Lo8;->m()Lo8$a;

    move-result-object v4

    if-ne v4, v0, :cond_c

    .line 15
    :cond_b
    iput-boolean v2, p1, Lq8;->d:Z

    iput-boolean v2, v3, Lp8;->C0:Z

    iput-boolean v2, p0, Lo8;->b0:Z

    if-eqz p3, :cond_c

    return v2

    .line 16
    :cond_c
    :goto_3
    iget-object v0, p0, Lo8;->s:Ln8;

    iget-object v0, v0, Ln8;->d:Ln8;

    if-nez v0, :cond_d

    iget-object v0, p0, Lo8;->u:Ln8;

    iget-object v0, v0, Ln8;->d:Ln8;

    if-eqz v0, :cond_10

    :cond_d
    iget-object v0, p0, Lo8;->s:Ln8;

    iget-object v0, v0, Ln8;->d:Ln8;

    if-eqz v0, :cond_e

    iget-object v0, v0, Ln8;->b:Lo8;

    iget-object v4, p0, Lo8;->D:Lo8;

    if-ne v0, v4, :cond_e

    iget-object v0, p0, Lo8;->u:Ln8;

    iget-object v0, v0, Ln8;->d:Ln8;

    if-eqz v0, :cond_10

    :cond_e
    iget-object v0, p0, Lo8;->u:Ln8;

    iget-object v0, v0, Ln8;->d:Ln8;

    if-eqz v0, :cond_f

    iget-object v0, v0, Ln8;->b:Lo8;

    iget-object v4, p0, Lo8;->D:Lo8;

    if-ne v0, v4, :cond_f

    iget-object v0, p0, Lo8;->s:Ln8;

    iget-object v0, v0, Ln8;->d:Ln8;

    if-eqz v0, :cond_10

    :cond_f
    iget-object v0, p0, Lo8;->s:Ln8;

    iget-object v0, v0, Ln8;->d:Ln8;

    if-eqz v0, :cond_11

    iget-object v0, v0, Ln8;->b:Lo8;

    iget-object v4, p0, Lo8;->D:Lo8;

    if-ne v0, v4, :cond_11

    iget-object v0, p0, Lo8;->u:Ln8;

    iget-object v0, v0, Ln8;->d:Ln8;

    if-eqz v0, :cond_11

    iget-object v0, v0, Ln8;->b:Lo8;

    if-ne v0, v4, :cond_11

    :cond_10
    iget-object v0, p0, Lo8;->z:Ln8;

    iget-object v0, v0, Ln8;->d:Ln8;

    if-nez v0, :cond_11

    instance-of v0, p0, Lr8;

    if-nez v0, :cond_11

    instance-of v0, p0, Ll8;

    if-nez v0, :cond_11

    iget-object v0, p1, Lq8;->f:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_11
    iget-object v0, p0, Lo8;->t:Ln8;

    iget-object v0, v0, Ln8;->d:Ln8;

    if-nez v0, :cond_12

    iget-object v0, p0, Lo8;->v:Ln8;

    iget-object v0, v0, Ln8;->d:Ln8;

    if-eqz v0, :cond_15

    :cond_12
    iget-object v0, p0, Lo8;->t:Ln8;

    iget-object v0, v0, Ln8;->d:Ln8;

    if-eqz v0, :cond_13

    iget-object v0, v0, Ln8;->b:Lo8;

    iget-object v4, p0, Lo8;->D:Lo8;

    if-ne v0, v4, :cond_13

    iget-object v0, p0, Lo8;->v:Ln8;

    iget-object v0, v0, Ln8;->d:Ln8;

    if-eqz v0, :cond_15

    :cond_13
    iget-object v0, p0, Lo8;->v:Ln8;

    iget-object v0, v0, Ln8;->d:Ln8;

    if-eqz v0, :cond_14

    iget-object v0, v0, Ln8;->b:Lo8;

    iget-object v4, p0, Lo8;->D:Lo8;

    if-ne v0, v4, :cond_14

    iget-object v0, p0, Lo8;->t:Ln8;

    iget-object v0, v0, Ln8;->d:Ln8;

    if-eqz v0, :cond_15

    :cond_14
    iget-object v0, p0, Lo8;->t:Ln8;

    iget-object v0, v0, Ln8;->d:Ln8;

    if-eqz v0, :cond_16

    iget-object v0, v0, Ln8;->b:Lo8;

    iget-object v4, p0, Lo8;->D:Lo8;

    if-ne v0, v4, :cond_16

    iget-object v0, p0, Lo8;->v:Ln8;

    iget-object v0, v0, Ln8;->d:Ln8;

    if-eqz v0, :cond_16

    iget-object v0, v0, Ln8;->b:Lo8;

    if-ne v0, v4, :cond_16

    :cond_15
    iget-object v0, p0, Lo8;->z:Ln8;

    iget-object v0, v0, Ln8;->d:Ln8;

    if-nez v0, :cond_16

    iget-object v0, p0, Lo8;->w:Ln8;

    iget-object v0, v0, Ln8;->d:Ln8;

    if-nez v0, :cond_16

    instance-of v0, p0, Lr8;

    if-nez v0, :cond_16

    instance-of v0, p0, Ll8;

    if-nez v0, :cond_16

    iget-object v0, p1, Lq8;->g:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_16
    instance-of v0, p0, Ll8;

    if-eqz v0, :cond_19

    .line 17
    iput-boolean v2, p1, Lq8;->d:Z

    iput-boolean v2, v3, Lp8;->C0:Z

    iput-boolean v2, p0, Lo8;->b0:Z

    if-eqz p3, :cond_17

    return v2

    .line 18
    :cond_17
    move-object v0, p0

    check-cast v0, Ll8;

    const/4 v4, 0x0

    :goto_4
    iget v5, v0, Ll8;->k0:I

    if-ge v4, v5, :cond_19

    iget-object v5, v0, Ll8;->j0:[Lo8;

    aget-object v5, v5, v4

    invoke-static {v5, p1, p2, p3}, Lb1;->u0(Lo8;Lq8;Ljava/util/List;Z)Z

    move-result v5

    if-nez v5, :cond_18

    return v2

    :cond_18
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_19
    iget-object v0, p0, Lo8;->A:[Ln8;

    array-length v0, v0

    const/4 v4, 0x0

    :goto_5
    if-ge v4, v0, :cond_1d

    iget-object v5, p0, Lo8;->A:[Ln8;

    aget-object v5, v5, v4

    iget-object v6, v5, Ln8;->d:Ln8;

    if-eqz v6, :cond_1c

    iget-object v7, v6, Ln8;->b:Lo8;

    .line 19
    iget-object v8, p0, Lo8;->D:Lo8;

    if-eq v7, v8, :cond_1c

    .line 20
    iget-object v7, v5, Ln8;->c:Ln8$b;

    sget-object v8, Ln8$b;->h:Ln8$b;

    if-ne v7, v8, :cond_1a

    .line 21
    iput-boolean v2, p1, Lq8;->d:Z

    iput-boolean v2, v3, Lp8;->C0:Z

    iput-boolean v2, p0, Lo8;->b0:Z

    if-eqz p3, :cond_1b

    return v2

    .line 22
    :cond_1a
    iget-object v7, v5, Ln8;->a:Lt8;

    .line 23
    iget-object v8, v6, Ln8;->d:Ln8;

    if-eq v8, v5, :cond_1b

    .line 24
    iget-object v6, v6, Ln8;->a:Lt8;

    .line 25
    iget-object v6, v6, Lv8;->a:Ljava/util/HashSet;

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 26
    :cond_1b
    iget-object v5, v5, Ln8;->d:Ln8;

    iget-object v5, v5, Ln8;->b:Lo8;

    invoke-static {v5, p1, p2, p3}, Lb1;->u0(Lo8;Lq8;Ljava/util/List;Z)Z

    move-result v5

    if-nez v5, :cond_1c

    return v2

    :cond_1c
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_1d
    return v1

    :cond_1e
    if-eq v4, p1, :cond_20

    iget-object p3, p1, Lq8;->a:Ljava/util/List;

    iget-object v0, v4, Lq8;->a:Ljava/util/List;

    invoke-interface {p3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object p3, p1, Lq8;->f:Ljava/util/List;

    iget-object v0, p0, Lo8;->p:Lq8;

    iget-object v0, v0, Lq8;->f:Ljava/util/List;

    invoke-interface {p3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object p3, p1, Lq8;->g:Ljava/util/List;

    iget-object v0, p0, Lo8;->p:Lq8;

    iget-object v0, v0, Lq8;->g:Ljava/util/List;

    invoke-interface {p3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object p3, p0, Lo8;->p:Lq8;

    iget-boolean p3, p3, Lq8;->d:Z

    if-nez p3, :cond_1f

    iput-boolean v2, p1, Lq8;->d:Z

    :cond_1f
    iget-object p3, p0, Lo8;->p:Lq8;

    invoke-interface {p2, p3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p0, p0, Lo8;->p:Lq8;

    iget-object p0, p0, Lq8;->a:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_20

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lo8;

    iput-object p1, p2, Lo8;->p:Lq8;

    goto :goto_6

    :cond_20
    return v1
.end method

.method public static v(II)I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result p0

    return p0

    :cond_0
    const p1, -0x800001

    and-int/2addr p0, p1

    return p0
.end method

.method public static v0(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    return-object p0

    :cond_0
    const/16 v1, 0x15

    if-lt v0, v1, :cond_2

    instance-of v0, p0, Lka;

    if-nez v0, :cond_1

    new-instance v0, Lna;

    invoke-direct {v0, p0}, Lna;-><init>(Landroid/graphics/drawable/Drawable;)V

    return-object v0

    :cond_1
    return-object p0

    :cond_2
    instance-of v0, p0, Lka;

    if-nez v0, :cond_3

    new-instance v0, Lma;

    invoke-direct {v0, p0}, Lma;-><init>(Landroid/graphics/drawable/Drawable;)V

    return-object v0

    :cond_3
    return-object p0
.end method

.method public static w(Landroid/widget/CompoundButton;)Landroid/graphics/drawable/Drawable;
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getButtonDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0

    :cond_0
    sget-boolean v0, Lb1;->p:Z

    const-string v1, "CompoundButtonCompat"

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :try_start_0
    const-class v2, Landroid/widget/CompoundButton;

    const-string v3, "mButtonDrawable"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    sput-object v2, Lb1;->o:Ljava/lang/reflect/Field;

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "Failed to retrieve mButtonDrawable field"

    invoke-static {v1, v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    sput-boolean v0, Lb1;->p:Z

    :cond_1
    sget-object v0, Lb1;->o:Ljava/lang/reflect/Field;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    :try_start_1
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/drawable/Drawable;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    :catch_1
    move-exception p0

    const-string v0, "Failed to get button drawable via reflection"

    invoke-static {v1, v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    sput-object v2, Lb1;->o:Ljava/lang/reflect/Field;

    :cond_2
    return-object v2
.end method

.method public static w0(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    const/16 v1, 0x1b

    if-gt v0, v1, :cond_1

    instance-of v0, p1, Ltc;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ltc;

    invoke-direct {v0, p1, p0}, Ltc;-><init>(Landroid/view/ActionMode$Callback;Landroid/widget/TextView;)V

    return-object v0

    :cond_1
    :goto_0
    return-object p1
.end method

.method public static x(I[Ljava/lang/String;J)J
    .locals 1

    invoke-static {p2, p3}, Lb1;->U(J)J

    move-result-wide p2

    div-int/lit16 v0, p0, 0x1fff

    aget-object p1, p1, v0

    rem-int/lit16 p0, p0, 0x1fff

    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    int-to-long p0, p0

    const/16 v0, 0x20

    shl-long/2addr p0, v0

    xor-long/2addr p0, p2

    return-wide p0
.end method

.method public static y(Landroid/graphics/drawable/Drawable;)I
    .locals 6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    move-result p0

    return p0

    :cond_0
    const/16 v1, 0x11

    const/4 v2, 0x0

    if-lt v0, v1, :cond_2

    sget-boolean v0, Lb1;->l:Z

    const-string v1, "DrawableCompat"

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :try_start_0
    const-class v3, Landroid/graphics/drawable/Drawable;

    const-string v4, "getLayoutDirection"

    new-array v5, v2, [Ljava/lang/Class;

    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    sput-object v3, Lb1;->k:Ljava/lang/reflect/Method;

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v4, "Failed to retrieve getLayoutDirection() method"

    invoke-static {v1, v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    sput-boolean v0, Lb1;->l:Z

    :cond_1
    sget-object v0, Lb1;->k:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_2

    :try_start_1
    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return p0

    :catch_1
    move-exception p0

    const-string v0, "Failed to invoke getLayoutDirection() via reflection"

    invoke-static {v1, v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p0, 0x0

    sput-object p0, Lb1;->k:Ljava/lang/reflect/Method;

    :cond_2
    return v2
.end method

.method public static z(Lq8;I)I
    .locals 11

    mul-int/lit8 v0, p1, 0x2

    const/4 v1, 0x0

    if-eqz p0, :cond_5

    const/4 v2, 0x1

    if-nez p1, :cond_0

    .line 1
    iget-object v1, p0, Lq8;->f:Ljava/util/List;

    goto :goto_0

    :cond_0
    if-ne p1, v2, :cond_1

    iget-object v1, p0, Lq8;->g:Ljava/util/List;

    .line 2
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_1
    if-ge v5, v3, :cond_4

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lo8;

    iget-object v8, v7, Lo8;->A:[Ln8;

    add-int/lit8 v9, v0, 0x1

    aget-object v10, v8, v9

    iget-object v10, v10, Ln8;->d:Ln8;

    if-eqz v10, :cond_3

    aget-object v10, v8, v0

    iget-object v10, v10, Ln8;->d:Ln8;

    if-eqz v10, :cond_2

    aget-object v8, v8, v9

    iget-object v8, v8, Ln8;->d:Ln8;

    if-eqz v8, :cond_2

    goto :goto_2

    :cond_2
    const/4 v8, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v8, 0x1

    :goto_3
    invoke-static {v7, p1, v8, v4}, Lb1;->A(Lo8;IZI)I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    iget-object p0, p0, Lq8;->e:[I

    aput v6, p0, p1

    return v6

    .line 3
    :cond_5
    goto :goto_5

    :goto_4
    throw v1

    :goto_5
    goto :goto_4
.end method
