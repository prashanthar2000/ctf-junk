.class public Landroidx/constraintlayout/widget/ConstraintLayout;
.super Landroid/view/ViewGroup;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/widget/ConstraintLayout$a;
    }
.end annotation


# instance fields
.field public b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lz8;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lo8;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lp8;

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:Z

.field public k:I

.field public l:Lc9;

.field public m:I

.field public n:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public o:I

.field public p:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0x64

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Ljava/util/ArrayList;

    new-instance p1, Lp8;

    invoke-direct {p1}, Lp8;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    const/4 p1, 0x0

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    const v0, 0x7fffffff

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Z

    const/4 v0, 0x7

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lc9;

    const/4 v1, -0x1

    iput v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    iput v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    iput v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:I

    .line 1
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    .line 2
    iput-object p0, v1, Lo8;->X:Ljava/lang/Object;

    .line 3
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getId()I

    move-result v2

    invoke-virtual {v1, v2, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lc9;

    if-eqz p2, :cond_7

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lf9;->ConstraintLayout_Layout:[I

    invoke-virtual {v1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_6

    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    sget v4, Lf9;->ConstraintLayout_Layout_android_minWidth:I

    if-ne v3, v4, :cond_0

    iget v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    goto :goto_2

    :cond_0
    sget v4, Lf9;->ConstraintLayout_Layout_android_minHeight:I

    if-ne v3, v4, :cond_1

    iget v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    goto :goto_2

    :cond_1
    sget v4, Lf9;->ConstraintLayout_Layout_android_maxWidth:I

    if-ne v3, v4, :cond_2

    iget v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    goto :goto_2

    :cond_2
    sget v4, Lf9;->ConstraintLayout_Layout_android_maxHeight:I

    if-ne v3, v4, :cond_3

    iget v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    goto :goto_2

    :cond_3
    sget v4, Lf9;->ConstraintLayout_Layout_layout_optimizationLevel:I

    if-ne v3, v4, :cond_4

    iget v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    goto :goto_2

    :cond_4
    sget v4, Lf9;->ConstraintLayout_Layout_constraintSet:I

    if-ne v3, v4, :cond_5

    invoke-virtual {p2, v3, p1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    :try_start_0
    new-instance v4, Lc9;

    invoke-direct {v4}, Lc9;-><init>()V

    iput-object v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lc9;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v4, v5, v3}, Lc9;->c(Landroid/content/Context;I)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lc9;

    :goto_1
    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    :cond_5
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_6
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    :cond_7
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    iget p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    .line 4
    iput p2, p1, Lp8;->B0:I

    return-void
.end method


# virtual methods
.method public a()Landroidx/constraintlayout/widget/ConstraintLayout$a;
    .locals 2

    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>(II)V

    return-object v0
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public b(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p1, :cond_0

    instance-of p1, p2, Ljava/lang/String;

    if-eqz p1, :cond_0

    check-cast p2, Ljava/lang/String;

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final c(I)Lo8;
    .locals 1

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    return-object p1

    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eq v0, p0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-ne p1, p0, :cond_1

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewAdded(Landroid/view/View;)V

    :cond_1
    if-ne v0, p0, :cond_2

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    return-object p1

    :cond_2
    if-nez v0, :cond_3

    const/4 p1, 0x0

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object p1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k0:Lo8;

    :goto_0
    return-object p1
.end method

.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    instance-of p1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    return p1
.end method

.method public final d(Landroid/view/View;)Lo8;
    .locals 0

    if-ne p1, p0, :cond_0

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object p1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k0:Lo8;

    :goto_0
    return-object p1
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 20

    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x44870000    # 1080.0f

    const/high16 v4, 0x44f00000    # 1920.0f

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v0, :cond_2

    move-object/from16 v7, p0

    invoke-virtual {v7, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v9

    const/16 v10, 0x8

    if-ne v9, v10, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_1

    instance-of v9, v8, Ljava/lang/String;

    if-eqz v9, :cond_1

    check-cast v8, Ljava/lang/String;

    const-string v9, ","

    invoke-virtual {v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    array-length v9, v8

    const/4 v10, 0x4

    if-ne v9, v10, :cond_1

    aget-object v9, v8, v5

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    const/4 v10, 0x1

    aget-object v10, v8, v10

    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    const/4 v11, 0x2

    aget-object v11, v8, v11

    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    const/4 v12, 0x3

    aget-object v8, v8, v12

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    int-to-float v9, v9

    div-float/2addr v9, v3

    mul-float v9, v9, v1

    float-to-int v9, v9

    int-to-float v10, v10

    div-float/2addr v10, v4

    mul-float v10, v10, v2

    float-to-int v10, v10

    int-to-float v11, v11

    div-float/2addr v11, v3

    mul-float v11, v11, v1

    float-to-int v11, v11

    int-to-float v8, v8

    div-float/2addr v8, v4

    mul-float v8, v8, v2

    float-to-int v8, v8

    new-instance v15, Landroid/graphics/Paint;

    invoke-direct {v15}, Landroid/graphics/Paint;-><init>()V

    const/high16 v12, -0x10000

    invoke-virtual {v15, v12}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v14, v9

    int-to-float v13, v10

    add-int/2addr v9, v11

    int-to-float v9, v9

    move-object/from16 v12, p1

    move v11, v13

    move v13, v14

    move/from16 v18, v14

    move v14, v11

    move-object/from16 v19, v15

    move v15, v9

    move/from16 v16, v11

    move-object/from16 v17, v19

    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-int/2addr v10, v8

    int-to-float v8, v10

    move v13, v9

    move/from16 v16, v8

    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v14, v8

    move/from16 v15, v18

    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move/from16 v13, v18

    move/from16 v16, v11

    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    const v10, -0xff0100

    move-object/from16 v15, v19

    invoke-virtual {v15, v10}, Landroid/graphics/Paint;->setColor(I)V

    move v14, v11

    move-object v10, v15

    move v15, v9

    move/from16 v16, v8

    move-object/from16 v17, v10

    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v14, v8

    move/from16 v16, v11

    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_1
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_2
    move-object/from16 v7, p0

    return-void
.end method

.method public final e(II)V
    .locals 19

    move/from16 v0, p1

    move/from16 v1, p2

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v4

    add-int/2addr v4, v2

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    const/4 v6, 0x0

    :goto_0
    move-object/from16 v7, p0

    if-ge v6, v2, :cond_f

    invoke-virtual {v7, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v9

    const/16 v10, 0x8

    if-ne v9, v10, :cond_0

    goto/16 :goto_9

    :cond_0
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object v10, v9, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k0:Lo8;

    iget-boolean v11, v9, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    if-nez v11, :cond_e

    iget-boolean v11, v9, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    if-eqz v11, :cond_1

    goto/16 :goto_9

    :cond_1
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v11

    .line 1
    iput v11, v10, Lo8;->Y:I

    .line 2
    iget v11, v9, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iget v12, v9, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget-boolean v13, v9, Landroidx/constraintlayout/widget/ConstraintLayout$a;->U:Z

    const/4 v14, -0x1

    const/4 v15, 0x1

    if-nez v13, :cond_4

    iget-boolean v5, v9, Landroidx/constraintlayout/widget/ConstraintLayout$a;->V:Z

    if-nez v5, :cond_4

    if-nez v13, :cond_2

    iget v5, v9, Landroidx/constraintlayout/widget/ConstraintLayout$a;->H:I

    if-eq v5, v15, :cond_4

    :cond_2
    iget v5, v9, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-eq v5, v14, :cond_4

    iget-boolean v5, v9, Landroidx/constraintlayout/widget/ConstraintLayout$a;->V:Z

    if-nez v5, :cond_3

    iget v5, v9, Landroidx/constraintlayout/widget/ConstraintLayout$a;->I:I

    if-eq v5, v15, :cond_4

    iget v5, v9, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-ne v5, v14, :cond_3

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v5, 0x1

    :goto_2
    if-eqz v5, :cond_b

    const/4 v5, -0x2

    if-nez v11, :cond_5

    invoke-static {v0, v4, v5}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v13

    const/16 v16, 0x1

    goto :goto_4

    :cond_5
    if-ne v11, v14, :cond_6

    invoke-static {v0, v4, v14}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v13

    const/16 v16, 0x0

    goto :goto_4

    :cond_6
    if-ne v11, v5, :cond_7

    const/4 v13, 0x1

    goto :goto_3

    :cond_7
    const/4 v13, 0x0

    :goto_3
    invoke-static {v0, v4, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v16

    move/from16 v18, v16

    move/from16 v16, v13

    move/from16 v13, v18

    :goto_4
    if-nez v12, :cond_8

    invoke-static {v1, v3, v5}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v17

    :goto_5
    move/from16 v14, v17

    goto :goto_7

    :cond_8
    if-ne v12, v14, :cond_9

    invoke-static {v1, v3, v14}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v17

    move/from16 v14, v17

    const/4 v15, 0x0

    goto :goto_7

    :cond_9
    if-ne v12, v5, :cond_a

    goto :goto_6

    :cond_a
    const/4 v15, 0x0

    :goto_6
    invoke-static {v1, v3, v12}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v17

    goto :goto_5

    :goto_7
    invoke-virtual {v8, v13, v14}, Landroid/view/View;->measure(II)V

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v11

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v12

    goto :goto_8

    :cond_b
    const/4 v15, 0x0

    const/16 v16, 0x0

    :goto_8
    invoke-virtual {v10, v11}, Lo8;->C(I)V

    invoke-virtual {v10, v12}, Lo8;->w(I)V

    if-eqz v16, :cond_c

    .line 3
    iput v11, v10, Lo8;->T:I

    :cond_c
    if-eqz v15, :cond_d

    .line 4
    iput v12, v10, Lo8;->U:I

    .line 5
    :cond_d
    iget-boolean v5, v9, Landroidx/constraintlayout/widget/ConstraintLayout$a;->W:Z

    if-eqz v5, :cond_e

    invoke-virtual {v8}, Landroid/view/View;->getBaseline()I

    move-result v5

    const/4 v8, -0x1

    if-eq v5, v8, :cond_e

    .line 6
    iput v5, v10, Lo8;->Q:I

    :cond_e
    :goto_9
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_f
    return-void
.end method

.method public final f(II)V
    .locals 30

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    sget-object v3, Lo8$a;->d:Lo8$a;

    sget-object v4, Lo8$a;->c:Lo8$a;

    sget-object v5, Ln8$b;->f:Ln8$b;

    sget-object v6, Ln8$b;->d:Ln8$b;

    sget-object v7, Ln8$b;->e:Ln8$b;

    sget-object v8, Ln8$b;->c:Ln8$b;

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v9

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v10

    add-int/2addr v10, v9

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v9

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v11

    add-int/2addr v11, v9

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v9

    const/4 v13, 0x0

    :goto_0
    const/16 v14, 0x8

    const/16 v17, 0x1

    if-ge v13, v9, :cond_b

    invoke-virtual {v0, v13}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v15

    invoke-virtual {v15}, Landroid/view/View;->getVisibility()I

    move-result v12

    if-ne v12, v14, :cond_0

    move-object/from16 v19, v3

    goto/16 :goto_4

    :cond_0
    invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    check-cast v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object v14, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k0:Lo8;

    move-object/from16 v19, v3

    iget-boolean v3, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    if-nez v3, :cond_9

    iget-boolean v3, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    invoke-virtual {v15}, Landroid/view/View;->getVisibility()I

    move-result v3

    .line 1
    iput v3, v14, Lo8;->Y:I

    .line 2
    iget v3, v12, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    move-object/from16 v20, v4

    iget v4, v12, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-eqz v3, :cond_8

    if-nez v4, :cond_2

    goto :goto_3

    :cond_2
    move-object/from16 v21, v5

    const/4 v5, -0x2

    if-ne v3, v5, :cond_3

    const/16 v18, 0x1

    goto :goto_1

    :cond_3
    const/16 v18, 0x0

    :goto_1
    invoke-static {v1, v11, v3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v3

    if-ne v4, v5, :cond_4

    goto :goto_2

    :cond_4
    const/16 v17, 0x0

    :goto_2
    invoke-static {v2, v10, v4}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v4

    invoke-virtual {v15, v3, v4}, Landroid/view/View;->measure(II)V

    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    invoke-virtual {v15}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    invoke-virtual {v14, v3}, Lo8;->C(I)V

    invoke-virtual {v14, v4}, Lo8;->w(I)V

    if-eqz v18, :cond_5

    .line 3
    iput v3, v14, Lo8;->T:I

    :cond_5
    if-eqz v17, :cond_6

    .line 4
    iput v4, v14, Lo8;->U:I

    .line 5
    :cond_6
    iget-boolean v5, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->W:Z

    if-eqz v5, :cond_7

    invoke-virtual {v15}, Landroid/view/View;->getBaseline()I

    move-result v5

    const/4 v15, -0x1

    if-eq v5, v15, :cond_7

    .line 6
    iput v5, v14, Lo8;->Q:I

    .line 7
    :cond_7
    iget-boolean v5, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->U:Z

    if-eqz v5, :cond_a

    iget-boolean v5, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->V:Z

    if-eqz v5, :cond_a

    invoke-virtual {v14}, Lo8;->l()Lu8;

    move-result-object v5

    invoke-virtual {v5, v3}, Lu8;->e(I)V

    invoke-virtual {v14}, Lo8;->k()Lu8;

    move-result-object v3

    invoke-virtual {v3, v4}, Lu8;->e(I)V

    goto :goto_5

    :cond_8
    :goto_3
    move-object/from16 v21, v5

    invoke-virtual {v14}, Lo8;->l()Lu8;

    move-result-object v3

    invoke-virtual {v3}, Lv8;->b()V

    invoke-virtual {v14}, Lo8;->k()Lu8;

    move-result-object v3

    invoke-virtual {v3}, Lv8;->b()V

    goto :goto_5

    :cond_9
    :goto_4
    move-object/from16 v20, v4

    move-object/from16 v21, v5

    :cond_a
    :goto_5
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v3, v19

    move-object/from16 v4, v20

    move-object/from16 v5, v21

    goto/16 :goto_0

    :cond_b
    move-object/from16 v19, v3

    move-object/from16 v20, v4

    move-object/from16 v21, v5

    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v3}, Lp8;->L()V

    const/4 v3, 0x0

    :goto_6
    if-ge v3, v9, :cond_29

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v5

    if-ne v5, v14, :cond_c

    goto/16 :goto_15

    :cond_c
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object v12, v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k0:Lo8;

    iget-boolean v13, v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    if-nez v13, :cond_27

    iget-boolean v13, v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    if-eqz v13, :cond_d

    goto/16 :goto_15

    :cond_d
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v13

    .line 8
    iput v13, v12, Lo8;->Y:I

    .line 9
    iget v13, v5, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iget v15, v5, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-eqz v13, :cond_e

    if-eqz v15, :cond_e

    goto/16 :goto_15

    :cond_e
    invoke-virtual {v12, v8}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v14

    .line 10
    iget-object v14, v14, Ln8;->a:Lt8;

    move/from16 v22, v9

    .line 11
    invoke-virtual {v12, v7}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v9

    .line 12
    iget-object v9, v9, Ln8;->a:Lt8;

    move/from16 v23, v3

    .line 13
    invoke-virtual {v12, v8}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v3

    .line 14
    iget-object v3, v3, Ln8;->d:Ln8;

    if-eqz v3, :cond_f

    .line 15
    invoke-virtual {v12, v7}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v3

    .line 16
    iget-object v3, v3, Ln8;->d:Ln8;

    if-eqz v3, :cond_f

    move-object/from16 v24, v7

    const/4 v3, 0x1

    goto :goto_7

    :cond_f
    move-object/from16 v24, v7

    const/4 v3, 0x0

    .line 17
    :goto_7
    invoke-virtual {v12, v6}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v7

    .line 18
    iget-object v7, v7, Ln8;->a:Lt8;

    move-object/from16 v25, v8

    move-object/from16 v8, v21

    move-object/from16 v21, v5

    .line 19
    invoke-virtual {v12, v8}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v5

    .line 20
    iget-object v5, v5, Ln8;->a:Lt8;

    move-object/from16 v26, v4

    .line 21
    invoke-virtual {v12, v6}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v4

    .line 22
    iget-object v4, v4, Ln8;->d:Ln8;

    if-eqz v4, :cond_10

    .line 23
    invoke-virtual {v12, v8}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v4

    .line 24
    iget-object v4, v4, Ln8;->d:Ln8;

    if-eqz v4, :cond_10

    const/4 v4, 0x1

    goto :goto_8

    :cond_10
    const/4 v4, 0x0

    :goto_8
    if-nez v13, :cond_11

    if-nez v15, :cond_11

    if-eqz v3, :cond_11

    if-eqz v4, :cond_11

    move v5, v2

    move-object/from16 v27, v6

    move-object/from16 v28, v8

    move-object/from16 v0, v19

    move-object/from16 v8, v20

    goto/16 :goto_16

    :cond_11
    move-object/from16 v27, v6

    .line 25
    iget-object v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v6}, Lo8;->i()Lo8$a;

    move-result-object v6

    move-object/from16 v28, v8

    move-object/from16 v8, v20

    if-eq v6, v8, :cond_12

    const/4 v6, 0x1

    goto :goto_9

    :cond_12
    const/4 v6, 0x0

    :goto_9
    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v2}, Lo8;->m()Lo8$a;

    move-result-object v2

    if-eq v2, v8, :cond_13

    const/4 v2, 0x1

    goto :goto_a

    :cond_13
    const/4 v2, 0x0

    :goto_a
    if-nez v6, :cond_14

    invoke-virtual {v12}, Lo8;->l()Lu8;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Lv8;->b()V

    :cond_14
    if-nez v2, :cond_15

    invoke-virtual {v12}, Lo8;->k()Lu8;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Lv8;->b()V

    :cond_15
    const/16 v20, 0x0

    if-nez v13, :cond_1a

    if-eqz v6, :cond_18

    .line 26
    iget v13, v12, Lo8;->e:I

    if-nez v13, :cond_16

    iget v13, v12, Lo8;->G:F

    cmpl-float v13, v13, v20

    if-nez v13, :cond_16

    iget v13, v12, Lo8;->h:I

    if-nez v13, :cond_16

    iget v13, v12, Lo8;->i:I

    if-nez v13, :cond_16

    iget-object v13, v12, Lo8;->C:[Lo8$a;

    const/16 v16, 0x0

    aget-object v13, v13, v16

    move-object/from16 v0, v19

    if-ne v13, v0, :cond_17

    const/4 v13, 0x1

    goto :goto_b

    :cond_16
    move-object/from16 v0, v19

    const/16 v16, 0x0

    :cond_17
    const/4 v13, 0x0

    :goto_b
    if-eqz v13, :cond_19

    if-eqz v3, :cond_19

    .line 27
    invoke-virtual {v14}, Lv8;->c()Z

    move-result v3

    if-eqz v3, :cond_19

    invoke-virtual {v9}, Lv8;->c()Z

    move-result v3

    if-eqz v3, :cond_19

    .line 28
    iget v3, v9, Lt8;->g:F

    iget v9, v14, Lt8;->g:F

    sub-float/2addr v3, v9

    float-to-int v3, v3

    .line 29
    invoke-virtual {v12}, Lo8;->l()Lu8;

    move-result-object v9

    invoke-virtual {v9, v3}, Lu8;->e(I)V

    invoke-static {v1, v11, v3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v3

    move v13, v3

    const/4 v3, -0x2

    goto :goto_c

    :cond_18
    move-object/from16 v0, v19

    const/16 v16, 0x0

    :cond_19
    const/4 v3, -0x2

    invoke-static {v1, v11, v3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v6

    const/4 v3, 0x1

    const/4 v9, 0x0

    goto :goto_e

    :cond_1a
    move-object/from16 v0, v19

    const/4 v3, -0x2

    const/4 v9, -0x1

    const/16 v16, 0x0

    if-ne v13, v9, :cond_1b

    invoke-static {v1, v11, v9}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v13

    :goto_c
    move v9, v6

    move v6, v13

    const/4 v3, 0x0

    goto :goto_e

    :cond_1b
    if-ne v13, v3, :cond_1c

    const/4 v3, 0x1

    goto :goto_d

    :cond_1c
    const/4 v3, 0x0

    :goto_d
    invoke-static {v1, v11, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v9

    move/from16 v29, v9

    move v9, v6

    move/from16 v6, v29

    :goto_e
    if-nez v15, :cond_1f

    if-eqz v2, :cond_1e

    .line 30
    iget v13, v12, Lo8;->f:I

    if-nez v13, :cond_1d

    iget v13, v12, Lo8;->G:F

    cmpl-float v13, v13, v20

    if-nez v13, :cond_1d

    iget v13, v12, Lo8;->k:I

    if-nez v13, :cond_1d

    iget v13, v12, Lo8;->l:I

    if-nez v13, :cond_1d

    iget-object v13, v12, Lo8;->C:[Lo8$a;

    aget-object v13, v13, v17

    if-ne v13, v0, :cond_1d

    const/4 v13, 0x1

    goto :goto_f

    :cond_1d
    const/4 v13, 0x0

    :goto_f
    if-eqz v13, :cond_1e

    if-eqz v4, :cond_1e

    .line 31
    invoke-virtual {v7}, Lv8;->c()Z

    move-result v4

    if-eqz v4, :cond_1e

    invoke-virtual {v5}, Lv8;->c()Z

    move-result v4

    if-eqz v4, :cond_1e

    .line 32
    iget v4, v5, Lt8;->g:F

    iget v5, v7, Lt8;->g:F

    sub-float/2addr v4, v5

    float-to-int v4, v4

    .line 33
    invoke-virtual {v12}, Lo8;->k()Lu8;

    move-result-object v5

    invoke-virtual {v5, v4}, Lu8;->e(I)V

    move/from16 v5, p2

    invoke-static {v5, v10, v4}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v4

    move v13, v4

    const/4 v4, -0x2

    goto :goto_10

    :cond_1e
    move/from16 v5, p2

    const/4 v4, -0x2

    invoke-static {v5, v10, v4}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v2

    move-object/from16 v14, v26

    const/4 v7, 0x0

    const/4 v13, 0x1

    goto :goto_12

    :cond_1f
    move/from16 v5, p2

    const/4 v4, -0x2

    const/4 v7, -0x1

    if-ne v15, v7, :cond_20

    invoke-static {v5, v10, v7}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v13

    :goto_10
    move v7, v2

    move v2, v13

    move-object/from16 v14, v26

    const/4 v13, 0x0

    goto :goto_12

    :cond_20
    if-ne v15, v4, :cond_21

    const/4 v7, 0x1

    goto :goto_11

    :cond_21
    const/4 v7, 0x0

    :goto_11
    invoke-static {v5, v10, v15}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v13

    move-object/from16 v14, v26

    move/from16 v29, v7

    move v7, v2

    move v2, v13

    move/from16 v13, v29

    :goto_12
    invoke-virtual {v14, v6, v2}, Landroid/view/View;->measure(II)V

    invoke-virtual {v14}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {v14}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    invoke-virtual {v12, v2}, Lo8;->C(I)V

    invoke-virtual {v12, v6}, Lo8;->w(I)V

    if-eqz v3, :cond_22

    .line 34
    iput v2, v12, Lo8;->T:I

    :cond_22
    if-eqz v13, :cond_23

    .line 35
    iput v6, v12, Lo8;->U:I

    :cond_23
    const/4 v3, 0x2

    if-eqz v9, :cond_24

    .line 36
    invoke-virtual {v12}, Lo8;->l()Lu8;

    move-result-object v9

    invoke-virtual {v9, v2}, Lu8;->e(I)V

    goto :goto_13

    :cond_24
    invoke-virtual {v12}, Lo8;->l()Lu8;

    move-result-object v2

    .line 37
    iput v3, v2, Lv8;->b:I

    .line 38
    :goto_13
    invoke-virtual {v12}, Lo8;->k()Lu8;

    move-result-object v2

    if-eqz v7, :cond_25

    invoke-virtual {v2, v6}, Lu8;->e(I)V

    goto :goto_14

    .line 39
    :cond_25
    iput v3, v2, Lv8;->b:I

    :goto_14
    move-object/from16 v2, v21

    .line 40
    iget-boolean v2, v2, Landroidx/constraintlayout/widget/ConstraintLayout$a;->W:Z

    if-eqz v2, :cond_26

    invoke-virtual {v14}, Landroid/view/View;->getBaseline()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_28

    .line 41
    iput v2, v12, Lo8;->Q:I

    goto :goto_17

    :cond_26
    const/4 v3, -0x1

    goto :goto_17

    :cond_27
    :goto_15
    move v5, v2

    move/from16 v23, v3

    move-object/from16 v27, v6

    move-object/from16 v24, v7

    move-object/from16 v25, v8

    move/from16 v22, v9

    move-object/from16 v0, v19

    move-object/from16 v8, v20

    move-object/from16 v28, v21

    :goto_16
    const/4 v3, -0x1

    const/4 v4, -0x2

    const/16 v16, 0x0

    :cond_28
    :goto_17
    add-int/lit8 v2, v23, 0x1

    move-object/from16 v19, v0

    move v3, v2

    move v2, v5

    move-object/from16 v20, v8

    move/from16 v9, v22

    move-object/from16 v7, v24

    move-object/from16 v8, v25

    move-object/from16 v6, v27

    move-object/from16 v21, v28

    const/16 v14, 0x8

    move-object/from16 v0, p0

    goto/16 :goto_6

    :cond_29
    return-void
.end method

.method public g(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    if-nez p1, :cond_2

    instance-of p1, p2, Ljava/lang/String;

    if-eqz p1, :cond_2

    instance-of p1, p3, Ljava/lang/Integer;

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    :cond_0
    check-cast p2, Ljava/lang/String;

    const-string p1, "/"

    invoke-virtual {p2, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    :cond_1
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object p3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p3, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->a()Landroidx/constraintlayout/widget/ConstraintLayout$a;

    move-result-object v0

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1
    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    invoke-direct {v0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getMaxHeight()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    return v0
.end method

.method public getMaxWidth()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    return v0
.end method

.method public getMinHeight()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    return v0
.end method

.method public getMinWidth()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    return v0
.end method

.method public getOptimizationLevel()I
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    .line 1
    iget v0, v0, Lp8;->B0:I

    return v0
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v0}, Lp8;->H()V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result p2

    const/4 p3, 0x0

    const/4 p4, 0x0

    :goto_0
    if-ge p4, p1, :cond_2

    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p5

    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k0:Lo8;

    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_0

    iget-boolean v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    if-nez v2, :cond_0

    iget-boolean v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    if-nez v2, :cond_0

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Z:Z

    if-eqz v0, :cond_1

    goto :goto_1

    .line 1
    :cond_1
    iget v0, v1, Lo8;->M:I

    iget v2, v1, Lo8;->O:I

    add-int/2addr v0, v2

    .line 2
    iget v2, v1, Lo8;->N:I

    iget v3, v1, Lo8;->P:I

    add-int/2addr v2, v3

    .line 3
    invoke-virtual {v1}, Lo8;->n()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {v1}, Lo8;->h()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {p5, v0, v2, v3, v1}, Landroid/view/View;->layout(IIII)V

    :goto_1
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_4

    :goto_2
    if-ge p3, p1, :cond_4

    iget-object p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lz8;

    if-eqz p2, :cond_3

    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    .line 4
    throw p1

    :cond_4
    return-void
.end method

.method public onMeasure(II)V
    .locals 54

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    sget-object v9, Ln8$b;->f:Ln8$b;

    sget-object v10, Ln8$b;->e:Ln8$b;

    sget-object v11, Lo8$a;->b:Lo8$a;

    sget-object v12, Lo8$a;->c:Lo8$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v13

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v14

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v15

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v8

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v6

    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    .line 1
    iput v7, v3, Lo8;->I:I

    .line 2
    iput v6, v3, Lo8;->J:I

    .line 3
    iget v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    .line 4
    iget-object v5, v3, Lo8;->q:[I

    const/4 v2, 0x0

    aput v4, v5, v2

    .line 5
    iget v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    const/4 v2, 0x1

    .line 6
    aput v4, v5, v2

    .line 7
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x11

    if-lt v4, v5, :cond_1

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getLayoutDirection()I

    move-result v4

    if-ne v4, v2, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 8
    :goto_0
    iput-boolean v4, v3, Lp8;->k0:Z

    .line 9
    :cond_1
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v17

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v18

    add-int v18, v18, v17

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v17

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v19

    add-int v19, v19, v17

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    const/high16 v1, -0x80000000

    move/from16 v17, v15

    const/high16 v15, 0x40000000    # 2.0f

    if-eq v3, v1, :cond_4

    if-eqz v3, :cond_3

    if-eq v3, v15, :cond_2

    move-object v3, v11

    goto :goto_1

    :cond_2
    iget v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    sub-int v3, v3, v19

    move v4, v3

    move-object v3, v11

    goto :goto_2

    :cond_3
    move-object v3, v12

    :goto_1
    const/4 v4, 0x0

    goto :goto_2

    :cond_4
    move-object v3, v12

    :goto_2
    if-eq v5, v1, :cond_7

    if-eqz v5, :cond_6

    if-eq v5, v15, :cond_5

    move-object v2, v11

    goto :goto_3

    :cond_5
    iget v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    sub-int v2, v2, v18

    move v5, v2

    move-object v2, v11

    goto :goto_4

    :cond_6
    move-object v2, v12

    :goto_3
    const/4 v5, 0x0

    goto :goto_4

    :cond_7
    move v5, v2

    move-object v2, v12

    :goto_4
    iget-object v15, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    const/4 v1, 0x0

    .line 10
    iput v1, v15, Lo8;->R:I

    .line 11
    iput v1, v15, Lo8;->S:I

    .line 12
    invoke-virtual {v15, v3}, Lo8;->y(Lo8$a;)V

    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v1, v4}, Lo8;->C(I)V

    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v1, v2}, Lo8;->B(Lo8$a;)V

    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v1, v5}, Lo8;->w(I)V

    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    iget v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    if-gez v2, :cond_8

    const/4 v2, 0x0

    .line 13
    :cond_8
    iput v2, v1, Lo8;->R:I

    .line 14
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    iget v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    if-gez v2, :cond_9

    const/4 v2, 0x0

    .line 15
    :cond_9
    iput v2, v1, Lo8;->S:I

    .line 16
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v1}, Lo8;->n()I

    move-result v1

    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v2}, Lo8;->h()I

    move-result v2

    iget-boolean v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Z

    if-eqz v3, :cond_58

    const/4 v3, 0x0

    iput-boolean v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Z

    .line 17
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    const/4 v15, 0x0

    :goto_5
    if-ge v15, v3, :cond_b

    invoke-virtual {v0, v15}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->isLayoutRequested()Z

    move-result v20

    if-eqz v20, :cond_a

    const/4 v3, 0x1

    goto :goto_6

    :cond_a
    add-int/lit8 v15, v15, 0x1

    goto :goto_5

    :cond_b
    const/4 v3, 0x0

    :goto_6
    if-eqz v3, :cond_57

    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 18
    sget-object v15, Ln8$b;->g:Ln8$b;

    sget-object v3, Lo8$a;->e:Lo8$a;

    sget-object v5, Lo8$a;->d:Lo8$a;

    sget-object v4, Ln8$b;->c:Ln8$b;

    move/from16 v28, v14

    sget-object v14, Ln8$b;->d:Ln8$b;

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result v29

    move/from16 v30, v13

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v13

    move-object/from16 v31, v3

    if-eqz v29, :cond_d

    const/4 v3, 0x0

    :goto_7
    if-ge v3, v13, :cond_d

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v21

    move-object/from16 v32, v5

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v5
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move/from16 v33, v6

    :try_start_1
    invoke-virtual/range {v21 .. v21}, Landroid/view/View;->getId()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v21 .. v21}, Landroid/view/View;->getId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    move/from16 v34, v7

    const/4 v7, 0x0

    :try_start_2
    invoke-virtual {v0, v7, v5, v6}, Landroidx/constraintlayout/widget/ConstraintLayout;->g(ILjava/lang/Object;Ljava/lang/Object;)V

    const/16 v6, 0x2f

    invoke-virtual {v5, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    const/4 v7, -0x1

    if-eq v6, v7, :cond_c

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    :cond_c
    invoke-virtual/range {v21 .. v21}, Landroid/view/View;->getId()I

    move-result v6

    invoke-virtual {v0, v6}, Landroidx/constraintlayout/widget/ConstraintLayout;->c(I)Lo8;

    move-result-object v6

    .line 19
    iput-object v5, v6, Lo8;->Z:Ljava/lang/String;
    :try_end_2
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_8

    :catch_0
    move/from16 v33, v6

    :catch_1
    move/from16 v34, v7

    :catch_2
    :goto_8
    add-int/lit8 v3, v3, 0x1

    move-object/from16 v5, v32

    move/from16 v6, v33

    move/from16 v7, v34

    goto :goto_7

    :cond_d
    move-object/from16 v32, v5

    move/from16 v33, v6

    move/from16 v34, v7

    const/4 v3, 0x0

    :goto_9
    if-ge v3, v13, :cond_f

    .line 20
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->d(Landroid/view/View;)Lo8;

    move-result-object v5

    if-nez v5, :cond_e

    goto :goto_a

    :cond_e
    invoke-virtual {v5}, Lo8;->r()V

    :goto_a
    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_f
    iget v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    const/4 v5, -0x1

    if-eq v3, v5, :cond_10

    const/4 v3, 0x0

    :goto_b
    if-ge v3, v13, :cond_10

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_b

    :cond_10
    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lc9;

    if-eqz v3, :cond_20

    .line 21
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    new-instance v6, Ljava/util/HashSet;

    iget-object v7, v3, Lc9;->a:Ljava/util/HashMap;

    invoke-virtual {v7}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/4 v7, 0x0

    :goto_c
    if-ge v7, v5, :cond_1a

    move/from16 v21, v5

    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    move/from16 v35, v8

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v8

    move/from16 v36, v2

    const/4 v2, -0x1

    if-eq v8, v2, :cond_19

    iget-object v2, v3, Lc9;->a:Ljava/util/HashMap;

    move/from16 v37, v1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    iget-object v1, v3, Lc9;->a:Ljava/util/HashMap;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb9;

    instance-of v2, v5, Ly8;

    if-eqz v2, :cond_11

    const/4 v2, 0x1

    iput v2, v1, Lb9;->t0:I

    goto :goto_d

    :cond_11
    const/4 v2, 0x1

    :goto_d
    move-object/from16 v38, v12

    iget v12, v1, Lb9;->t0:I

    move-object/from16 v39, v11

    const/4 v11, -0x1

    if-eq v12, v11, :cond_14

    if-eq v12, v2, :cond_12

    goto :goto_e

    :cond_12
    move-object v2, v5

    check-cast v2, Ly8;

    invoke-virtual {v2, v8}, Landroid/view/View;->setId(I)V

    iget v8, v1, Lb9;->s0:I

    invoke-virtual {v2, v8}, Ly8;->setType(I)V

    iget-boolean v8, v1, Lb9;->r0:Z

    invoke-virtual {v2, v8}, Ly8;->setAllowsGoneWidget(Z)V

    iget-object v8, v1, Lb9;->u0:[I

    if-eqz v8, :cond_13

    invoke-virtual {v2, v8}, Lz8;->setReferencedIds([I)V

    goto :goto_e

    :cond_13
    iget-object v8, v1, Lb9;->v0:Ljava/lang/String;

    if-eqz v8, :cond_14

    invoke-virtual {v3, v2, v8}, Lc9;->a(Landroid/view/View;Ljava/lang/String;)[I

    move-result-object v8

    iput-object v8, v1, Lb9;->u0:[I

    invoke-virtual {v2, v8}, Lz8;->setReferencedIds([I)V

    :cond_14
    :goto_e
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    invoke-virtual {v1, v2}, Lb9;->a(Landroidx/constraintlayout/widget/ConstraintLayout$a;)V

    invoke-virtual {v5, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget v2, v1, Lb9;->J:I

    invoke-virtual {v5, v2}, Landroid/view/View;->setVisibility(I)V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x11

    if-lt v2, v8, :cond_18

    iget v2, v1, Lb9;->U:F

    invoke-virtual {v5, v2}, Landroid/view/View;->setAlpha(F)V

    iget v2, v1, Lb9;->X:F

    invoke-virtual {v5, v2}, Landroid/view/View;->setRotation(F)V

    iget v2, v1, Lb9;->Y:F

    invoke-virtual {v5, v2}, Landroid/view/View;->setRotationX(F)V

    iget v2, v1, Lb9;->Z:F

    invoke-virtual {v5, v2}, Landroid/view/View;->setRotationY(F)V

    iget v2, v1, Lb9;->a0:F

    invoke-virtual {v5, v2}, Landroid/view/View;->setScaleX(F)V

    iget v2, v1, Lb9;->b0:F

    invoke-virtual {v5, v2}, Landroid/view/View;->setScaleY(F)V

    iget v2, v1, Lb9;->c0:F

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_15

    iget v2, v1, Lb9;->c0:F

    invoke-virtual {v5, v2}, Landroid/view/View;->setPivotX(F)V

    :cond_15
    iget v2, v1, Lb9;->d0:F

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_16

    iget v2, v1, Lb9;->d0:F

    invoke-virtual {v5, v2}, Landroid/view/View;->setPivotY(F)V

    :cond_16
    iget v2, v1, Lb9;->e0:F

    invoke-virtual {v5, v2}, Landroid/view/View;->setTranslationX(F)V

    iget v2, v1, Lb9;->f0:F

    invoke-virtual {v5, v2}, Landroid/view/View;->setTranslationY(F)V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x15

    if-lt v2, v8, :cond_18

    iget v2, v1, Lb9;->g0:F

    invoke-virtual {v5, v2}, Landroid/view/View;->setTranslationZ(F)V

    iget-boolean v2, v1, Lb9;->V:Z

    if-eqz v2, :cond_18

    iget v1, v1, Lb9;->W:F

    invoke-virtual {v5, v1}, Landroid/view/View;->setElevation(F)V

    goto :goto_f

    :cond_17
    move-object/from16 v39, v11

    move-object/from16 v38, v12

    :cond_18
    :goto_f
    add-int/lit8 v7, v7, 0x1

    move/from16 v5, v21

    move/from16 v8, v35

    move/from16 v2, v36

    move/from16 v1, v37

    move-object/from16 v12, v38

    move-object/from16 v11, v39

    goto/16 :goto_c

    :cond_19
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "All children of ConstraintLayout must have ids to use ConstraintSet"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1a
    move/from16 v37, v1

    move/from16 v36, v2

    move/from16 v35, v8

    move-object/from16 v39, v11

    move-object/from16 v38, v12

    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1b
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_21

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iget-object v5, v3, Lc9;->a:Ljava/util/HashMap;

    invoke-virtual {v5, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb9;

    iget v6, v5, Lb9;->t0:I

    const/4 v7, -0x1

    if-eq v6, v7, :cond_1f

    const/4 v7, 0x1

    if-eq v6, v7, :cond_1c

    goto :goto_12

    :cond_1c
    new-instance v6, Ly8;

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-direct {v6, v7}, Ly8;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {v6, v7}, Landroid/view/View;->setId(I)V

    iget-object v7, v5, Lb9;->u0:[I

    if-eqz v7, :cond_1d

    invoke-virtual {v6, v7}, Lz8;->setReferencedIds([I)V

    goto :goto_11

    :cond_1d
    iget-object v7, v5, Lb9;->v0:Ljava/lang/String;

    if-eqz v7, :cond_1e

    invoke-virtual {v3, v6, v7}, Lc9;->a(Landroid/view/View;Ljava/lang/String;)[I

    move-result-object v7

    iput-object v7, v5, Lb9;->u0:[I

    invoke-virtual {v6, v7}, Lz8;->setReferencedIds([I)V

    :cond_1e
    :goto_11
    iget v7, v5, Lb9;->s0:I

    invoke-virtual {v6, v7}, Ly8;->setType(I)V

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->a()Landroidx/constraintlayout/widget/ConstraintLayout$a;

    move-result-object v7

    invoke-virtual {v6}, Lz8;->d()V

    invoke-virtual {v5, v7}, Lb9;->a(Landroidx/constraintlayout/widget/ConstraintLayout$a;)V

    invoke-virtual {v0, v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1f
    :goto_12
    iget-boolean v6, v5, Lb9;->a:Z

    if-eqz v6, :cond_1b

    new-instance v6, Ld9;

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-direct {v6, v7}, Ld9;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v6, v2}, Landroid/view/View;->setId(I)V

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->a()Landroidx/constraintlayout/widget/ConstraintLayout$a;

    move-result-object v2

    invoke-virtual {v5, v2}, Lb9;->a(Landroidx/constraintlayout/widget/ConstraintLayout$a;)V

    invoke-virtual {v0, v6, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_10

    :cond_20
    move/from16 v37, v1

    move/from16 v36, v2

    move/from16 v35, v8

    move-object/from16 v39, v11

    move-object/from16 v38, v12

    .line 22
    :cond_21
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    .line 23
    iget-object v1, v1, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 24
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_22

    const/4 v2, 0x0

    :goto_13
    if-ge v2, v1, :cond_22

    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz8;

    invoke-virtual {v3, v0}, Lz8;->c(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_13

    :cond_22
    const/4 v1, 0x0

    :goto_14
    if-ge v1, v13, :cond_23

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    add-int/lit8 v1, v1, 0x1

    goto :goto_14

    :cond_23
    const/4 v1, 0x0

    :goto_15
    if-ge v1, v13, :cond_56

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->d(Landroid/view/View;)Lo8;

    move-result-object v11

    if-nez v11, :cond_24

    const/16 v5, 0x8

    goto/16 :goto_17

    :cond_24
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    invoke-virtual {v12}, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a()V

    iget-boolean v3, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:Z

    if-eqz v3, :cond_25

    const/4 v3, 0x0

    iput-boolean v3, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:Z

    goto :goto_16

    :cond_25
    if-eqz v29, :cond_26

    :try_start_3
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v0, v6, v3, v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->g(ILjava/lang/Object;Ljava/lang/Object;)V

    const-string v5, "id/"

    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    add-int/lit8 v5, v5, 0x3

    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {v0, v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->c(I)Lo8;

    move-result-object v5

    .line 25
    iput-object v3, v5, Lo8;->Z:Ljava/lang/String;
    :try_end_3
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_16

    :catch_3
    nop

    .line 26
    :cond_26
    :goto_16
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    .line 27
    iput v3, v11, Lo8;->Y:I

    .line 28
    iget-boolean v3, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Z:Z

    const/16 v5, 0x8

    if-eqz v3, :cond_27

    .line 29
    iput v5, v11, Lo8;->Y:I

    .line 30
    :cond_27
    iput-object v2, v11, Lo8;->X:Ljava/lang/Object;

    .line 31
    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    .line 32
    iget-object v3, v2, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    iget-object v3, v11, Lo8;->D:Lo8;

    if-eqz v3, :cond_28

    .line 34
    check-cast v3, Lp8;

    .line 35
    iget-object v3, v3, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    .line 36
    iput-object v3, v11, Lo8;->D:Lo8;

    .line 37
    :cond_28
    iput-object v2, v11, Lo8;->D:Lo8;

    .line 38
    iget-boolean v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->V:Z

    if-eqz v2, :cond_29

    iget-boolean v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->U:Z

    if-nez v2, :cond_2a

    :cond_29
    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2a
    iget-boolean v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    if-eqz v2, :cond_2e

    check-cast v11, Lr8;

    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->h0:I

    iget v3, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->i0:I

    iget v6, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->j0:F

    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x11

    if-ge v7, v8, :cond_2b

    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a:I

    iget v3, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->b:I

    iget v6, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->c:F

    :cond_2b
    const/high16 v7, -0x40800000    # -1.0f

    cmpl-float v8, v6, v7

    if-eqz v8, :cond_2c

    cmpl-float v2, v6, v7

    if-lez v2, :cond_2f

    .line 39
    iput v6, v11, Lr8;->j0:F

    const/4 v6, -0x1

    iput v6, v11, Lr8;->k0:I

    iput v6, v11, Lr8;->l0:I

    goto/16 :goto_17

    :cond_2c
    const/4 v6, -0x1

    if-eq v2, v6, :cond_2d

    if-le v2, v6, :cond_2f

    .line 40
    iput v7, v11, Lr8;->j0:F

    iput v2, v11, Lr8;->k0:I

    iput v6, v11, Lr8;->l0:I

    goto :goto_17

    :cond_2d
    if-eq v3, v6, :cond_2f

    if-le v3, v6, :cond_2f

    .line 41
    iput v7, v11, Lr8;->j0:F

    iput v6, v11, Lr8;->k0:I

    iput v3, v11, Lr8;->l0:I

    goto :goto_17

    :cond_2e
    const/4 v6, -0x1

    .line 42
    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->d:I

    if-ne v2, v6, :cond_30

    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->e:I

    if-ne v2, v6, :cond_30

    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->f:I

    if-ne v2, v6, :cond_30

    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->g:I

    if-ne v2, v6, :cond_30

    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->q:I

    if-ne v2, v6, :cond_30

    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->p:I

    if-ne v2, v6, :cond_30

    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->r:I

    if-ne v2, v6, :cond_30

    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->s:I

    if-ne v2, v6, :cond_30

    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->h:I

    if-ne v2, v6, :cond_30

    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->i:I

    if-ne v2, v6, :cond_30

    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->j:I

    if-ne v2, v6, :cond_30

    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k:I

    if-ne v2, v6, :cond_30

    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l:I

    if-ne v2, v6, :cond_30

    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->P:I

    if-ne v2, v6, :cond_30

    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Q:I

    if-ne v2, v6, :cond_30

    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->m:I

    if-ne v2, v6, :cond_30

    iget v2, v12, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-eq v2, v6, :cond_30

    iget v2, v12, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-ne v2, v6, :cond_2f

    goto :goto_18

    :cond_2f
    :goto_17
    move-object/from16 v42, v4

    move/from16 v41, v13

    move-object/from16 v13, v31

    move-object/from16 v4, v32

    move/from16 v20, v33

    move/from16 v27, v34

    move/from16 v44, v35

    move-object/from16 v5, v39

    const/16 v16, 0x11

    goto/16 :goto_2e

    :cond_30
    :goto_18
    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a0:I

    iget v3, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->b0:I

    iget v6, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->c0:I

    iget v7, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->d0:I

    iget v8, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->e0:I

    iget v5, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->f0:I

    move/from16 v21, v2

    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->g0:F

    move/from16 v22, v2

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    move/from16 v23, v5

    const/16 v5, 0x11

    if-ge v2, v5, :cond_37

    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->d:I

    iget v3, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->e:I

    iget v6, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->f:I

    iget v7, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->g:I

    iget v8, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->t:I

    iget v5, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->v:I

    move/from16 v21, v5

    iget v5, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->z:F

    move/from16 v22, v5

    const/4 v5, -0x1

    if-ne v2, v5, :cond_32

    if-ne v3, v5, :cond_32

    move/from16 v23, v2

    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->q:I

    if-eq v2, v5, :cond_31

    goto :goto_1a

    :cond_31
    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->p:I

    if-eq v2, v5, :cond_33

    move v3, v2

    goto :goto_19

    :cond_32
    move/from16 v23, v2

    :cond_33
    :goto_19
    move/from16 v2, v23

    :goto_1a
    if-ne v6, v5, :cond_35

    if-ne v7, v5, :cond_35

    move/from16 v23, v2

    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->r:I

    if-eq v2, v5, :cond_34

    move v6, v2

    goto :goto_1b

    :cond_34
    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->s:I

    if-eq v2, v5, :cond_36

    move v7, v2

    :goto_1b
    move/from16 v26, v8

    move/from16 v40, v21

    move/from16 v8, v22

    move/from16 v2, v23

    goto :goto_1d

    :cond_35
    move/from16 v23, v2

    :cond_36
    move/from16 v5, v21

    move/from16 v2, v22

    move/from16 v21, v23

    goto :goto_1c

    :cond_37
    move/from16 v2, v22

    move/from16 v5, v23

    :goto_1c
    move/from16 v40, v5

    move/from16 v26, v8

    move v8, v2

    move/from16 v2, v21

    :goto_1d
    iget v5, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->m:I

    move/from16 v41, v13

    const/4 v13, -0x1

    if-eq v5, v13, :cond_39

    invoke-virtual {v0, v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->c(I)Lo8;

    move-result-object v23

    if-eqz v23, :cond_38

    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->o:F

    iget v3, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->n:I

    .line 43
    sget-object v24, Ln8$b;->h:Ln8$b;

    const/16 v26, 0x0

    move-object/from16 v21, v11

    move-object/from16 v22, v24

    move/from16 v25, v3

    invoke-virtual/range {v21 .. v26}, Lo8;->o(Ln8$b;Lo8;Ln8$b;II)V

    iput v2, v11, Lo8;->r:F

    :cond_38
    move-object/from16 v42, v4

    move-object/from16 v13, v31

    move-object/from16 v43, v32

    move/from16 v20, v33

    move/from16 v27, v34

    move/from16 v44, v35

    const/4 v2, -0x1

    const/16 v16, 0x11

    goto/16 :goto_25

    :cond_39
    const/4 v5, -0x1

    if-eq v2, v5, :cond_3a

    .line 44
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->c(I)Lo8;

    move-result-object v2

    if-eqz v2, :cond_3b

    iget v3, v12, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move-object/from16 v23, v2

    move/from16 v25, v3

    move-object/from16 v24, v4

    goto :goto_1e

    :cond_3a
    if-eq v3, v5, :cond_3b

    invoke-virtual {v0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->c(I)Lo8;

    move-result-object v2

    if-eqz v2, :cond_3b

    iget v3, v12, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move-object/from16 v23, v2

    move/from16 v25, v3

    move-object/from16 v24, v10

    :goto_1e
    move-object/from16 v21, v11

    move-object/from16 v22, v4

    invoke-virtual/range {v21 .. v26}, Lo8;->o(Ln8$b;Lo8;Ln8$b;II)V

    :cond_3b
    const/4 v2, -0x1

    if-eq v6, v2, :cond_3c

    invoke-virtual {v0, v6}, Landroidx/constraintlayout/widget/ConstraintLayout;->c(I)Lo8;

    move-result-object v3

    if-eqz v3, :cond_3d

    iget v5, v12, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move-object v6, v4

    move v7, v5

    :goto_1f
    move-object v5, v3

    goto :goto_20

    :cond_3c
    if-eq v7, v2, :cond_3d

    invoke-virtual {v0, v7}, Landroidx/constraintlayout/widget/ConstraintLayout;->c(I)Lo8;

    move-result-object v3

    if-eqz v3, :cond_3d

    iget v5, v12, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move v7, v5

    move-object v6, v10

    goto :goto_1f

    :goto_20
    move-object/from16 v13, v31

    move-object v3, v11

    move-object/from16 v42, v4

    move-object v4, v10

    move-object/from16 v43, v32

    const/16 v16, 0x11

    move/from16 v20, v33

    move/from16 v27, v34

    move/from16 v45, v8

    move/from16 v44, v35

    move/from16 v8, v40

    invoke-virtual/range {v3 .. v8}, Lo8;->o(Ln8$b;Lo8;Ln8$b;II)V

    goto :goto_21

    :cond_3d
    move-object/from16 v42, v4

    move/from16 v45, v8

    move-object/from16 v13, v31

    move-object/from16 v43, v32

    move/from16 v20, v33

    move/from16 v27, v34

    move/from16 v44, v35

    const/16 v16, 0x11

    :goto_21
    iget v3, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->h:I

    if-eq v3, v2, :cond_3e

    invoke-virtual {v0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->c(I)Lo8;

    move-result-object v3

    if-eqz v3, :cond_3f

    iget v4, v12, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v5, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->u:I

    move-object/from16 v23, v3

    move/from16 v25, v4

    move/from16 v26, v5

    move-object/from16 v24, v14

    goto :goto_22

    :cond_3e
    iget v3, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->i:I

    if-eq v3, v2, :cond_3f

    invoke-virtual {v0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->c(I)Lo8;

    move-result-object v3

    if-eqz v3, :cond_3f

    iget v4, v12, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v5, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->u:I

    move-object/from16 v23, v3

    move/from16 v25, v4

    move/from16 v26, v5

    move-object/from16 v24, v9

    :goto_22
    move-object/from16 v21, v11

    move-object/from16 v22, v14

    invoke-virtual/range {v21 .. v26}, Lo8;->o(Ln8$b;Lo8;Ln8$b;II)V

    :cond_3f
    iget v3, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->j:I

    if-eq v3, v2, :cond_40

    invoke-virtual {v0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->c(I)Lo8;

    move-result-object v3

    if-eqz v3, :cond_41

    iget v4, v12, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v5, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->w:I

    move v7, v4

    move v8, v5

    move-object v6, v14

    :goto_23
    move-object v5, v3

    goto :goto_24

    :cond_40
    iget v3, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k:I

    if-eq v3, v2, :cond_41

    invoke-virtual {v0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->c(I)Lo8;

    move-result-object v3

    if-eqz v3, :cond_41

    iget v4, v12, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v5, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->w:I

    move v7, v4

    move v8, v5

    move-object v6, v9

    goto :goto_23

    :goto_24
    move-object v3, v11

    move-object v4, v9

    invoke-virtual/range {v3 .. v8}, Lo8;->o(Ln8$b;Lo8;Ln8$b;II)V

    :cond_41
    iget v3, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l:I

    if-eq v3, v2, :cond_42

    iget-object v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    iget v4, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l:I

    invoke-virtual {v0, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->c(I)Lo8;

    move-result-object v4

    if-eqz v4, :cond_42

    if-eqz v3, :cond_42

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    instance-of v5, v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    if-eqz v5, :cond_42

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    const/4 v5, 0x1

    iput-boolean v5, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->W:Z

    iput-boolean v5, v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;->W:Z

    invoke-virtual {v11, v15}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v46

    invoke-virtual {v4, v15}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v47

    const/16 v48, 0x0

    const/16 v49, -0x1

    sget-object v50, Ln8$a;->c:Ln8$a;

    const/16 v51, 0x0

    const/16 v52, 0x1

    invoke-virtual/range {v46 .. v52}, Ln8;->a(Ln8;IILn8$a;IZ)Z

    invoke-virtual {v11, v14}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v3

    invoke-virtual {v3}, Ln8;->d()V

    invoke-virtual {v11, v9}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v3

    invoke-virtual {v3}, Ln8;->d()V

    :cond_42
    const/high16 v3, 0x3f000000    # 0.5f

    move/from16 v4, v45

    const/4 v5, 0x0

    cmpl-float v6, v4, v5

    if-ltz v6, :cond_43

    cmpl-float v6, v4, v3

    if-eqz v6, :cond_43

    .line 45
    iput v4, v11, Lo8;->V:F

    .line 46
    :cond_43
    iget v4, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->A:F

    cmpl-float v6, v4, v5

    if-ltz v6, :cond_44

    cmpl-float v3, v4, v3

    if-eqz v3, :cond_44

    .line 47
    iput v4, v11, Lo8;->W:F

    :cond_44
    :goto_25
    if-eqz v29, :cond_46

    .line 48
    iget v3, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->P:I

    if-ne v3, v2, :cond_45

    iget v3, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Q:I

    if-eq v3, v2, :cond_46

    :cond_45
    iget v3, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->P:I

    iget v4, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Q:I

    .line 49
    iput v3, v11, Lo8;->I:I

    iput v4, v11, Lo8;->J:I

    .line 50
    :cond_46
    iget-boolean v3, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->U:Z

    if-nez v3, :cond_48

    iget v3, v12, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-ne v3, v2, :cond_47

    invoke-virtual {v11, v13}, Lo8;->y(Lo8$a;)V

    move-object/from16 v3, v42

    invoke-virtual {v11, v3}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v4

    iget v5, v12, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v5, v4, Ln8;->e:I

    invoke-virtual {v11, v10}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v4

    iget v5, v12, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v5, v4, Ln8;->e:I

    move-object/from16 v5, v39

    move-object/from16 v4, v43

    goto :goto_26

    :cond_47
    move-object/from16 v3, v42

    move-object/from16 v4, v43

    invoke-virtual {v11, v4}, Lo8;->y(Lo8$a;)V

    const/4 v5, 0x0

    invoke-virtual {v11, v5}, Lo8;->C(I)V

    move-object/from16 v5, v39

    goto :goto_26

    :cond_48
    move-object/from16 v5, v39

    move-object/from16 v3, v42

    move-object/from16 v4, v43

    invoke-virtual {v11, v5}, Lo8;->y(Lo8$a;)V

    iget v6, v12, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-virtual {v11, v6}, Lo8;->C(I)V

    :goto_26
    iget-boolean v6, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->V:Z

    if-nez v6, :cond_4a

    iget v6, v12, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-ne v6, v2, :cond_49

    invoke-virtual {v11, v13}, Lo8;->B(Lo8$a;)V

    invoke-virtual {v11, v14}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v6

    iget v7, v12, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v7, v6, Ln8;->e:I

    invoke-virtual {v11, v9}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v6

    iget v7, v12, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v7, v6, Ln8;->e:I

    goto :goto_28

    :cond_49
    invoke-virtual {v11, v4}, Lo8;->B(Lo8$a;)V

    const/4 v6, 0x0

    goto :goto_27

    :cond_4a
    invoke-virtual {v11, v5}, Lo8;->B(Lo8$a;)V

    iget v6, v12, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    :goto_27
    invoke-virtual {v11, v6}, Lo8;->w(I)V

    :goto_28
    iget-object v6, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->B:Ljava/lang/String;

    if-eqz v6, :cond_52

    .line 51
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_4b

    const/4 v7, 0x0

    iput v7, v11, Lo8;->G:F

    goto/16 :goto_2c

    :cond_4b
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    const/16 v8, 0x2c

    invoke-virtual {v6, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v8

    if-lez v8, :cond_4e

    add-int/lit8 v2, v7, -0x1

    if-ge v8, v2, :cond_4e

    move-object/from16 v42, v3

    const/4 v2, 0x0

    invoke-virtual {v6, v2, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const-string v2, "W"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4c

    const/4 v2, 0x0

    goto :goto_29

    :cond_4c
    const-string v2, "H"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4d

    const/4 v2, 0x1

    goto :goto_29

    :cond_4d
    const/4 v2, -0x1

    :goto_29
    add-int/lit8 v3, v8, 0x1

    goto :goto_2a

    :cond_4e
    move-object/from16 v42, v3

    const/4 v2, -0x1

    const/4 v3, 0x0

    :goto_2a
    const/16 v8, 0x3a

    invoke-virtual {v6, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v8

    if-ltz v8, :cond_50

    add-int/lit8 v7, v7, -0x1

    if-ge v8, v7, :cond_50

    invoke-virtual {v6, v3, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v8, v8, 0x1

    invoke-virtual {v6, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_51

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_51

    :try_start_4
    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    const/4 v7, 0x0

    cmpl-float v8, v3, v7

    if-lez v8, :cond_51

    cmpl-float v8, v6, v7

    if-lez v8, :cond_51

    const/4 v7, 0x1

    if-ne v2, v7, :cond_4f

    div-float/2addr v6, v3

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v3

    goto :goto_2b

    :cond_4f
    div-float/2addr v3, v6

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_2b

    :cond_50
    invoke-virtual {v6, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_51

    :try_start_5
    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_4

    goto :goto_2b

    :catch_4
    :cond_51
    const/4 v3, 0x0

    :goto_2b
    const/4 v6, 0x0

    cmpl-float v6, v3, v6

    if-lez v6, :cond_53

    iput v3, v11, Lo8;->G:F

    iput v2, v11, Lo8;->H:I

    goto :goto_2d

    :cond_52
    :goto_2c
    move-object/from16 v42, v3

    .line 52
    :cond_53
    :goto_2d
    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->D:F

    .line 53
    iget-object v3, v11, Lo8;->g0:[F

    const/4 v6, 0x0

    aput v2, v3, v6

    .line 54
    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->E:F

    const/4 v6, 0x1

    .line 55
    aput v2, v3, v6

    .line 56
    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->F:I

    .line 57
    iput v2, v11, Lo8;->e0:I

    .line 58
    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->G:I

    .line 59
    iput v2, v11, Lo8;->f0:I

    .line 60
    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->H:I

    iget v3, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->J:I

    iget v6, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->L:I

    iget v7, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->N:F

    .line 61
    iput v2, v11, Lo8;->e:I

    iput v3, v11, Lo8;->h:I

    iput v6, v11, Lo8;->i:I

    iput v7, v11, Lo8;->j:F

    const/4 v3, 0x2

    const/high16 v6, 0x3f800000    # 1.0f

    cmpg-float v7, v7, v6

    if-gez v7, :cond_54

    if-nez v2, :cond_54

    iput v3, v11, Lo8;->e:I

    .line 62
    :cond_54
    iget v2, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->I:I

    iget v7, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->K:I

    iget v8, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->M:I

    iget v12, v12, Landroidx/constraintlayout/widget/ConstraintLayout$a;->O:F

    .line 63
    iput v2, v11, Lo8;->f:I

    iput v7, v11, Lo8;->k:I

    iput v8, v11, Lo8;->l:I

    iput v12, v11, Lo8;->m:F

    cmpg-float v6, v12, v6

    if-gez v6, :cond_55

    if-nez v2, :cond_55

    iput v3, v11, Lo8;->f:I

    :cond_55
    :goto_2e
    add-int/lit8 v1, v1, 0x1

    move-object/from16 v32, v4

    move-object/from16 v39, v5

    move-object/from16 v31, v13

    move/from16 v33, v20

    move/from16 v34, v27

    move/from16 v13, v41

    move-object/from16 v4, v42

    move/from16 v35, v44

    goto/16 :goto_15

    :cond_56
    move/from16 v20, v33

    move/from16 v27, v34

    move/from16 v44, v35

    move-object/from16 v5, v39

    goto :goto_2f

    :cond_57
    move/from16 v37, v1

    move/from16 v36, v2

    move/from16 v20, v6

    move/from16 v27, v7

    move/from16 v44, v8

    move-object v5, v11

    move-object/from16 v38, v12

    move/from16 v30, v13

    move/from16 v28, v14

    :goto_2f
    const/4 v1, 0x1

    goto :goto_30

    :cond_58
    move/from16 v37, v1

    move/from16 v36, v2

    move/from16 v20, v6

    move/from16 v27, v7

    move/from16 v44, v8

    move-object v5, v11

    move-object/from16 v38, v12

    move/from16 v30, v13

    move/from16 v28, v14

    const/4 v1, 0x0

    .line 64
    :goto_30
    iget v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    const/16 v3, 0x8

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_59

    const/4 v2, 0x1

    goto :goto_31

    :cond_59
    const/4 v2, 0x0

    :goto_31
    if-eqz v2, :cond_5c

    iget-object v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    .line 65
    invoke-virtual {v4}, Lp8;->J()V

    iget v6, v4, Lp8;->B0:I

    invoke-virtual {v4, v6}, Lp8;->c(I)V

    .line 66
    iget-object v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    .line 67
    iget-object v6, v4, Lo8;->C:[Lo8$a;

    const/4 v7, 0x0

    aget-object v6, v6, v7

    move-object/from16 v7, v38

    if-eq v6, v7, :cond_5a

    iget-object v6, v4, Lo8;->c:Lu8;

    if-eqz v6, :cond_5a

    move/from16 v8, v37

    invoke-virtual {v6, v8}, Lu8;->e(I)V

    goto :goto_32

    :cond_5a
    move/from16 v8, v37

    :goto_32
    iget-object v6, v4, Lo8;->C:[Lo8$a;

    const/4 v11, 0x1

    aget-object v6, v6, v11

    if-eq v6, v7, :cond_5b

    iget-object v4, v4, Lo8;->d:Lu8;

    if-eqz v4, :cond_5b

    move/from16 v6, v36

    invoke-virtual {v4, v6}, Lu8;->e(I)V

    goto :goto_33

    :cond_5b
    move/from16 v6, v36

    .line 68
    :goto_33
    invoke-virtual/range {p0 .. p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->f(II)V

    goto :goto_34

    :cond_5c
    move/from16 v6, v36

    move/from16 v8, v37

    move-object/from16 v7, v38

    invoke-virtual/range {p0 .. p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->e(II)V

    .line 69
    :goto_34
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    const/4 v11, 0x0

    :goto_35
    if-ge v11, v4, :cond_5d

    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    add-int/lit8 v11, v11, 0x1

    goto :goto_35

    :cond_5d
    iget-object v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_5f

    const/4 v11, 0x0

    :goto_36
    if-ge v11, v4, :cond_5f

    iget-object v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lz8;

    if-eqz v12, :cond_5e

    add-int/lit8 v11, v11, 0x1

    goto :goto_36

    :cond_5e
    const/4 v11, 0x0

    .line 70
    throw v11

    .line 71
    :cond_5f
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    if-lez v4, :cond_60

    if-eqz v1, :cond_60

    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-static {v1}, Lb1;->s(Lp8;)V

    :cond_60
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    iget-boolean v4, v1, Lp8;->w0:Z

    if-eqz v4, :cond_66

    iget-boolean v4, v1, Lp8;->x0:Z

    if-eqz v4, :cond_63

    move/from16 v4, v30

    const/high16 v11, -0x80000000

    if-ne v4, v11, :cond_62

    iget v11, v1, Lp8;->z0:I

    move/from16 v12, v28

    if-ge v11, v12, :cond_61

    invoke-virtual {v1, v11}, Lo8;->C(I)V

    :cond_61
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v1, v5}, Lo8;->y(Lo8$a;)V

    goto :goto_37

    :cond_62
    move/from16 v12, v28

    goto :goto_37

    :cond_63
    move/from16 v12, v28

    move/from16 v4, v30

    :goto_37
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    iget-boolean v11, v1, Lp8;->y0:Z

    if-eqz v11, :cond_65

    move/from16 v11, v17

    const/high16 v13, -0x80000000

    if-ne v11, v13, :cond_67

    iget v13, v1, Lp8;->A0:I

    move/from16 v14, v44

    if-ge v13, v14, :cond_64

    invoke-virtual {v1, v13}, Lo8;->w(I)V

    :cond_64
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v1, v5}, Lo8;->B(Lo8$a;)V

    goto :goto_39

    :cond_65
    move/from16 v11, v17

    goto :goto_38

    :cond_66
    move/from16 v11, v17

    move/from16 v12, v28

    move/from16 v4, v30

    :cond_67
    :goto_38
    move/from16 v14, v44

    :goto_39
    iget v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    const/16 v5, 0x20

    and-int/2addr v1, v5

    if-ne v1, v5, :cond_6c

    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v1}, Lo8;->n()I

    move-result v1

    iget-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v5}, Lo8;->h()I

    move-result v5

    iget v13, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    if-eq v13, v1, :cond_68

    const/high16 v13, 0x40000000    # 2.0f

    if-ne v4, v13, :cond_69

    iget-object v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    iget-object v4, v4, Lp8;->v0:Ljava/util/List;

    const/4 v15, 0x0

    invoke-static {v4, v15, v1}, Lb1;->m0(Ljava/util/List;II)V

    goto :goto_3a

    :cond_68
    const/high16 v13, 0x40000000    # 2.0f

    :cond_69
    :goto_3a
    iget v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:I

    if-eq v1, v5, :cond_6a

    if-ne v11, v13, :cond_6a

    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    iget-object v1, v1, Lp8;->v0:Ljava/util/List;

    const/4 v4, 0x1

    invoke-static {v1, v4, v5}, Lb1;->m0(Ljava/util/List;II)V

    :cond_6a
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    iget-boolean v4, v1, Lp8;->x0:Z

    if-eqz v4, :cond_6b

    iget v4, v1, Lp8;->z0:I

    if-le v4, v12, :cond_6b

    iget-object v1, v1, Lp8;->v0:Ljava/util/List;

    const/4 v4, 0x0

    invoke-static {v1, v4, v12}, Lb1;->m0(Ljava/util/List;II)V

    goto :goto_3b

    :cond_6b
    const/4 v4, 0x0

    :goto_3b
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    iget-boolean v5, v1, Lp8;->y0:Z

    if-eqz v5, :cond_6d

    iget v5, v1, Lp8;->A0:I

    if-le v5, v14, :cond_6d

    iget-object v1, v1, Lp8;->v0:Ljava/util/List;

    const/4 v5, 0x1

    invoke-static {v1, v5, v14}, Lb1;->m0(Ljava/util/List;II)V

    goto :goto_3c

    :cond_6c
    const/4 v4, 0x0

    :cond_6d
    const/4 v5, 0x1

    :goto_3c
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-lez v1, :cond_6e

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->h()V

    :cond_6e
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v11

    add-int v11, v11, v20

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v12

    add-int v12, v12, v27

    if-lez v1, :cond_8b

    iget-object v13, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v13}, Lo8;->i()Lo8$a;

    move-result-object v13

    if-ne v13, v7, :cond_6f

    const/4 v13, 0x1

    goto :goto_3d

    :cond_6f
    const/4 v13, 0x0

    :goto_3d
    iget-object v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v14}, Lo8;->m()Lo8$a;

    move-result-object v14

    if-ne v14, v7, :cond_70

    const/4 v7, 0x1

    goto :goto_3e

    :cond_70
    const/4 v7, 0x0

    :goto_3e
    iget-object v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v14}, Lo8;->n()I

    move-result v14

    iget v15, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    move-result v14

    iget-object v15, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v15}, Lo8;->h()I

    move-result v15

    iget v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-static {v15, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    move v5, v4

    move/from16 v53, v14

    const/4 v4, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_3f
    if-ge v4, v1, :cond_81

    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo8;

    move/from16 v16, v1

    .line 72
    iget-object v1, v3, Lo8;->X:Ljava/lang/Object;

    .line 73
    check-cast v1, Landroid/view/View;

    if-nez v1, :cond_71

    move/from16 v36, v6

    move/from16 v37, v8

    goto/16 :goto_45

    :cond_71
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v17

    move/from16 v36, v6

    move-object/from16 v6, v17

    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    move/from16 v37, v8

    iget-boolean v8, v6, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    if-nez v8, :cond_80

    iget-boolean v8, v6, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    if-eqz v8, :cond_72

    goto/16 :goto_45

    :cond_72
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v8

    const/16 v0, 0x8

    if-ne v8, v0, :cond_73

    goto/16 :goto_45

    :cond_73
    if-eqz v2, :cond_74

    invoke-virtual {v3}, Lo8;->l()Lu8;

    move-result-object v0

    invoke-virtual {v0}, Lv8;->c()Z

    move-result v0

    if-eqz v0, :cond_74

    invoke-virtual {v3}, Lo8;->k()Lu8;

    move-result-object v0

    invoke-virtual {v0}, Lv8;->c()Z

    move-result v0

    if-eqz v0, :cond_74

    goto/16 :goto_45

    :cond_74
    iget v0, v6, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    const/4 v8, -0x2

    if-ne v0, v8, :cond_75

    iget-boolean v8, v6, Landroidx/constraintlayout/widget/ConstraintLayout$a;->U:Z

    if-eqz v8, :cond_75

    move/from16 v8, p1

    invoke-static {v8, v12, v0}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v0

    goto :goto_40

    :cond_75
    move/from16 v8, p1

    invoke-virtual {v3}, Lo8;->n()I

    move-result v0

    const/high16 v8, 0x40000000    # 2.0f

    invoke-static {v0, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    :goto_40
    iget v8, v6, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    move/from16 v19, v12

    const/4 v12, -0x2

    if-ne v8, v12, :cond_76

    iget-boolean v12, v6, Landroidx/constraintlayout/widget/ConstraintLayout$a;->V:Z

    if-eqz v12, :cond_76

    move/from16 v12, p2

    invoke-static {v12, v11, v8}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v8

    goto :goto_41

    :cond_76
    move/from16 v12, p2

    invoke-virtual {v3}, Lo8;->h()I

    move-result v8

    const/high16 v12, 0x40000000    # 2.0f

    invoke-static {v8, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    :goto_41
    invoke-virtual {v1, v0, v8}, Landroid/view/View;->measure(II)V

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    invoke-virtual {v3}, Lo8;->n()I

    move-result v12

    if-eq v0, v12, :cond_7a

    invoke-virtual {v3, v0}, Lo8;->C(I)V

    if-eqz v2, :cond_77

    invoke-virtual {v3}, Lo8;->l()Lu8;

    move-result-object v12

    invoke-virtual {v12, v0}, Lu8;->e(I)V

    :cond_77
    if-eqz v13, :cond_78

    .line 74
    iget v0, v3, Lo8;->I:I

    .line 75
    iget v12, v3, Lo8;->E:I

    add-int/2addr v0, v12

    move/from16 v12, v53

    if-le v0, v12, :cond_79

    .line 76
    invoke-virtual {v3, v10}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v14

    invoke-virtual {v14}, Ln8;->b()I

    move-result v14

    add-int/2addr v14, v0

    invoke-static {v12, v14}, Ljava/lang/Math;->max(II)I

    move-result v53

    goto :goto_42

    :cond_78
    move/from16 v12, v53

    :cond_79
    move/from16 v53, v12

    :goto_42
    const/4 v14, 0x1

    goto :goto_43

    :cond_7a
    move/from16 v12, v53

    :goto_43
    invoke-virtual {v3}, Lo8;->h()I

    move-result v0

    if-eq v8, v0, :cond_7d

    invoke-virtual {v3, v8}, Lo8;->w(I)V

    if-eqz v2, :cond_7b

    invoke-virtual {v3}, Lo8;->k()Lu8;

    move-result-object v0

    invoke-virtual {v0, v8}, Lu8;->e(I)V

    :cond_7b
    if-eqz v7, :cond_7c

    .line 77
    iget v0, v3, Lo8;->J:I

    .line 78
    iget v8, v3, Lo8;->F:I

    add-int/2addr v0, v8

    if-le v0, v5, :cond_7c

    .line 79
    invoke-virtual {v3, v9}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v8

    invoke-virtual {v8}, Ln8;->b()I

    move-result v8

    add-int/2addr v8, v0

    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    move-result v0

    move v5, v0

    :cond_7c
    const/4 v14, 0x1

    :cond_7d
    iget-boolean v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout$a;->W:Z

    if-eqz v0, :cond_7e

    invoke-virtual {v1}, Landroid/view/View;->getBaseline()I

    move-result v0

    const/4 v6, -0x1

    if-eq v0, v6, :cond_7f

    .line 80
    iget v8, v3, Lo8;->Q:I

    if-eq v0, v8, :cond_7f

    .line 81
    iput v0, v3, Lo8;->Q:I

    const/4 v14, 0x1

    goto :goto_44

    :cond_7e
    const/4 v6, -0x1

    .line 82
    :cond_7f
    :goto_44
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredState()I

    move-result v0

    invoke-static {v15, v0}, Landroid/view/ViewGroup;->combineMeasuredStates(II)I

    move-result v0

    move v15, v0

    goto :goto_46

    :cond_80
    :goto_45
    move/from16 v19, v12

    move/from16 v12, v53

    const/4 v6, -0x1

    move/from16 v53, v12

    :goto_46
    add-int/lit8 v4, v4, 0x1

    const/16 v3, 0x8

    move-object/from16 v0, p0

    move/from16 v1, v16

    move/from16 v12, v19

    move/from16 v6, v36

    move/from16 v8, v37

    goto/16 :goto_3f

    :cond_81
    move/from16 v16, v1

    move/from16 v36, v6

    move/from16 v37, v8

    move/from16 v19, v12

    move/from16 v12, v53

    move-object/from16 v0, p0

    if-eqz v14, :cond_85

    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    move/from16 v3, v37

    invoke-virtual {v1, v3}, Lo8;->C(I)V

    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    move/from16 v3, v36

    invoke-virtual {v1, v3}, Lo8;->w(I)V

    if-eqz v2, :cond_82

    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v1}, Lp8;->L()V

    :cond_82
    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->h()V

    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v1}, Lo8;->n()I

    move-result v1

    if-ge v1, v12, :cond_83

    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v1, v12}, Lo8;->C(I)V

    const/4 v2, 0x1

    goto :goto_47

    :cond_83
    const/4 v2, 0x0

    :goto_47
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v1}, Lo8;->h()I

    move-result v1

    if-ge v1, v5, :cond_84

    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v1, v5}, Lo8;->w(I)V

    const/4 v2, 0x1

    :cond_84
    if-eqz v2, :cond_85

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->h()V

    :cond_85
    move/from16 v1, v16

    const/4 v2, 0x0

    :goto_48
    if-ge v2, v1, :cond_8a

    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo8;

    .line 83
    iget-object v4, v3, Lo8;->X:Ljava/lang/Object;

    .line 84
    check-cast v4, Landroid/view/View;

    if-nez v4, :cond_86

    goto :goto_49

    :cond_86
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    invoke-virtual {v3}, Lo8;->n()I

    move-result v6

    if-ne v5, v6, :cond_89

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    invoke-virtual {v3}, Lo8;->h()I

    move-result v6

    if-eq v5, v6, :cond_87

    goto :goto_4a

    :cond_87
    :goto_49
    const/16 v6, 0x8

    :cond_88
    const/high16 v7, 0x40000000    # 2.0f

    goto :goto_4b

    .line 85
    :cond_89
    :goto_4a
    iget v5, v3, Lo8;->Y:I

    const/16 v6, 0x8

    if-eq v5, v6, :cond_88

    .line 86
    invoke-virtual {v3}, Lo8;->n()I

    move-result v5

    const/high16 v7, 0x40000000    # 2.0f

    invoke-static {v5, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    invoke-virtual {v3}, Lo8;->h()I

    move-result v3

    invoke-static {v3, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-virtual {v4, v5, v3}, Landroid/view/View;->measure(II)V

    :goto_4b
    add-int/lit8 v2, v2, 0x1

    goto :goto_48

    :cond_8a
    move v2, v15

    goto :goto_4c

    :cond_8b
    move/from16 v19, v12

    const/4 v2, 0x0

    :goto_4c
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v1}, Lo8;->n()I

    move-result v1

    add-int v1, v1, v19

    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    invoke-virtual {v3}, Lo8;->h()I

    move-result v3

    add-int/2addr v3, v11

    move/from16 v4, p1

    invoke-static {v1, v4, v2}, Landroid/view/ViewGroup;->resolveSizeAndState(III)I

    move-result v1

    shl-int/lit8 v2, v2, 0x10

    move/from16 v4, p2

    invoke-static {v3, v4, v2}, Landroid/view/ViewGroup;->resolveSizeAndState(III)I

    move-result v2

    const v3, 0xffffff

    and-int/2addr v1, v3

    and-int/2addr v2, v3

    iget v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    .line 87
    iget-boolean v3, v3, Lp8;->D0:Z

    const/high16 v4, 0x1000000

    if-eqz v3, :cond_8c

    or-int/2addr v1, v4

    .line 88
    :cond_8c
    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    .line 89
    iget-boolean v3, v3, Lp8;->E0:Z

    if-eqz v3, :cond_8d

    or-int/2addr v2, v4

    .line 90
    :cond_8d
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    iput v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    iput v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:I

    return-void
.end method

.method public onViewAdded(Landroid/view/View;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewAdded(Landroid/view/View;)V

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->d(Landroid/view/View;)Lo8;

    move-result-object v0

    instance-of v1, p1, Ld9;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    instance-of v0, v0, Lr8;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    new-instance v1, Lr8;

    invoke-direct {v1}, Lr8;-><init>()V

    iput-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k0:Lo8;

    iput-boolean v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    check-cast v1, Lr8;

    iget v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->R:I

    invoke-virtual {v1, v0}, Lr8;->F(I)V

    :cond_0
    instance-of v0, p1, Lz8;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lz8;

    invoke-virtual {v0}, Lz8;->d()V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iput-boolean v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iput-boolean v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Z

    return-void
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewRemoved(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->remove(I)V

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->d(Landroid/view/View;)Lo8;

    move-result-object v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    .line 1
    iget-object v1, v1, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    .line 2
    iput-object v1, v0, Lo8;->D:Lo8;

    .line 3
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Z

    return-void
.end method

.method public removeView(Landroid/view/View;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public requestLayout()V
    .locals 1

    invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Z

    const/4 v0, -0x1

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:I

    return-void
.end method

.method public setConstraintSet(Lc9;)V
    .locals 0

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lc9;

    return-void
.end method

.method public setId(I)V
    .locals 2

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->remove(I)V

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setId(I)V

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getId()I

    move-result v0

    invoke-virtual {p1, v0, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public setMaxHeight(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMaxWidth(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMinHeight(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMinWidth(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setOptimizationLevel(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:Lp8;

    .line 1
    iput p1, v0, Lp8;->B0:I

    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
