.class public Lw5;
.super Landroid/widget/ListView;
.source ""


# instance fields
.field public final b:Landroid/graphics/Rect;

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Ljava/lang/reflect/Field;

.field public i:Lu5;

.field public j:Z

.field public k:Z

.field public l:Z

.field public m:Lgc;

.field public n:Lrc;

.field public o:Lv5;


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 2

    sget v0, Lf;->dropDownListViewStyle:I

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lw5;->b:Landroid/graphics/Rect;

    const/4 p1, 0x0

    iput p1, p0, Lw5;->c:I

    iput p1, p0, Lw5;->d:I

    iput p1, p0, Lw5;->e:I

    iput p1, p0, Lw5;->f:I

    iput-boolean p2, p0, Lw5;->k:Z

    invoke-virtual {p0, p1}, Landroid/widget/ListView;->setCacheColorHint(I)V

    :try_start_0
    const-class p1, Landroid/widget/AbsListView;

    const-string p2, "mIsChildViewEnabled"

    invoke-virtual {p1, p2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    iput-object p1, p0, Lw5;->h:Ljava/lang/reflect/Field;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/NoSuchFieldException;->printStackTrace()V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(III)I
    .locals 12

    invoke-virtual {p0}, Landroid/widget/ListView;->getListPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/ListView;->getListPaddingBottom()I

    move-result v1

    invoke-virtual {p0}, Landroid/widget/ListView;->getListPaddingLeft()I

    invoke-virtual {p0}, Landroid/widget/ListView;->getListPaddingRight()I

    invoke-virtual {p0}, Landroid/widget/ListView;->getDividerHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/widget/ListView;->getDivider()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v4

    add-int/2addr v0, v1

    if-nez v4, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-lez v2, :cond_1

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v4}, Landroid/widget/ListAdapter;->getCount()I

    move-result v3

    const/4 v5, 0x0

    move-object v8, v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    :goto_1
    if-ge v6, v3, :cond_9

    invoke-interface {v4, v6}, Landroid/widget/ListAdapter;->getItemViewType(I)I

    move-result v10

    if-eq v10, v7, :cond_2

    move-object v8, v5

    move v7, v10

    :cond_2
    invoke-interface {v4, v6, v8, p0}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    if-nez v10, :cond_3

    invoke-virtual {p0}, Landroid/widget/ListView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_3
    iget v10, v10, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-lez v10, :cond_4

    const/high16 v11, 0x40000000    # 2.0f

    invoke-static {v10, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    goto :goto_2

    :cond_4
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    :goto_2
    invoke-virtual {v8, p1, v10}, Landroid/view/View;->measure(II)V

    invoke-virtual {v8}, Landroid/view/View;->forceLayout()V

    if-lez v6, :cond_5

    add-int/2addr v0, v2

    :cond_5
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v10

    add-int/2addr v0, v10

    if-lt v0, p2, :cond_7

    if-ltz p3, :cond_6

    if-le v6, p3, :cond_6

    if-lez v9, :cond_6

    if-eq v0, p2, :cond_6

    move p2, v9

    :cond_6
    return p2

    :cond_7
    if-ltz p3, :cond_8

    if-lt v6, p3, :cond_8

    move v9, v0

    :cond_8
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_9
    return v0
.end method

.method public b(Landroid/view/MotionEvent;I)Z
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v3, v7, :cond_1

    if-eq v3, v4, :cond_0

    if-eq v3, v5, :cond_2

    goto/16 :goto_5

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v8

    if-gez v8, :cond_3

    :cond_2
    const/4 v0, 0x0

    goto/16 :goto_6

    :cond_3
    invoke-virtual {v2, v8}, Landroid/view/MotionEvent;->getX(I)F

    move-result v9

    float-to-int v9, v9

    invoke-virtual {v2, v8}, Landroid/view/MotionEvent;->getY(I)F

    move-result v8

    float-to-int v8, v8

    invoke-virtual {v1, v9, v8}, Landroid/widget/ListView;->pointToPosition(II)I

    move-result v10

    const/4 v11, -0x1

    if-ne v10, v11, :cond_4

    goto/16 :goto_7

    :cond_4
    invoke-virtual/range {p0 .. p0}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v0

    sub-int v0, v10, v0

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    int-to-float v9, v9

    int-to-float v8, v8

    .line 1
    iput-boolean v7, v1, Lw5;->l:Z

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v13, 0x15

    if-lt v0, v13, :cond_5

    invoke-virtual {v1, v9, v8}, Landroid/widget/ListView;->drawableHotspotChanged(FF)V

    :cond_5
    invoke-virtual/range {p0 .. p0}, Landroid/widget/ListView;->isPressed()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v1, v7}, Landroid/widget/ListView;->setPressed(Z)V

    :cond_6
    invoke-virtual/range {p0 .. p0}, Landroid/widget/ListView;->layoutChildren()V

    iget v0, v1, Lw5;->g:I

    if-eq v0, v11, :cond_7

    invoke-virtual/range {p0 .. p0}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v14

    sub-int/2addr v0, v14

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_7

    if-eq v0, v12, :cond_7

    invoke-virtual {v0}, Landroid/view/View;->isPressed()Z

    move-result v14

    if-eqz v14, :cond_7

    invoke-virtual {v0, v6}, Landroid/view/View;->setPressed(Z)V

    :cond_7
    iput v10, v1, Lw5;->g:I

    invoke-virtual {v12}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    sub-float v0, v9, v0

    invoke-virtual {v12}, Landroid/view/View;->getTop()I

    move-result v14

    int-to-float v14, v14

    sub-float v14, v8, v14

    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v15, v13, :cond_8

    invoke-virtual {v12, v0, v14}, Landroid/view/View;->drawableHotspotChanged(FF)V

    :cond_8
    invoke-virtual {v12}, Landroid/view/View;->isPressed()Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {v12, v7}, Landroid/view/View;->setPressed(Z)V

    .line 2
    :cond_9
    invoke-virtual/range {p0 .. p0}, Landroid/widget/ListView;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v13

    if-eqz v13, :cond_a

    if-eq v10, v11, :cond_a

    const/4 v14, 0x1

    goto :goto_1

    :cond_a
    const/4 v14, 0x0

    :goto_1
    if-eqz v14, :cond_b

    invoke-virtual {v13, v6, v6}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 3
    :cond_b
    iget-object v0, v1, Lw5;->b:Landroid/graphics/Rect;

    invoke-virtual {v12}, Landroid/view/View;->getLeft()I

    move-result v15

    invoke-virtual {v12}, Landroid/view/View;->getTop()I

    move-result v5

    invoke-virtual {v12}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {v12}, Landroid/view/View;->getBottom()I

    move-result v7

    invoke-virtual {v0, v15, v5, v4, v7}, Landroid/graphics/Rect;->set(IIII)V

    iget v4, v0, Landroid/graphics/Rect;->left:I

    iget v5, v1, Lw5;->c:I

    sub-int/2addr v4, v5

    iput v4, v0, Landroid/graphics/Rect;->left:I

    iget v4, v0, Landroid/graphics/Rect;->top:I

    iget v5, v1, Lw5;->d:I

    sub-int/2addr v4, v5

    iput v4, v0, Landroid/graphics/Rect;->top:I

    iget v4, v0, Landroid/graphics/Rect;->right:I

    iget v5, v1, Lw5;->e:I

    add-int/2addr v4, v5

    iput v4, v0, Landroid/graphics/Rect;->right:I

    iget v4, v0, Landroid/graphics/Rect;->bottom:I

    iget v5, v1, Lw5;->f:I

    add-int/2addr v4, v5

    iput v4, v0, Landroid/graphics/Rect;->bottom:I

    :try_start_0
    iget-object v0, v1, Lw5;->h:Ljava/lang/reflect/Field;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v12}, Landroid/view/View;->isEnabled()Z

    move-result v4

    if-eq v4, v0, :cond_d

    iget-object v4, v1, Lw5;->h:Ljava/lang/reflect/Field;

    if-nez v0, :cond_c

    const/4 v0, 0x1

    goto :goto_2

    :cond_c
    const/4 v0, 0x0

    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v4, v1, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eq v10, v11, :cond_d

    invoke-virtual/range {p0 .. p0}, Landroid/widget/ListView;->refreshDrawableState()V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    :cond_d
    :goto_3
    if-eqz v14, :cond_f

    .line 4
    iget-object v0, v1, Lw5;->b:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterX()F

    move-result v4

    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterY()F

    move-result v0

    invoke-virtual/range {p0 .. p0}, Landroid/widget/ListView;->getVisibility()I

    move-result v5

    if-nez v5, :cond_e

    const/4 v5, 0x1

    goto :goto_4

    :cond_e
    const/4 v5, 0x0

    :goto_4
    invoke-virtual {v13, v5, v6}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    invoke-static {v13, v4, v0}, Lb1;->h0(Landroid/graphics/drawable/Drawable;FF)V

    .line 5
    :cond_f
    invoke-virtual/range {p0 .. p0}, Landroid/widget/ListView;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_10

    if-eq v10, v11, :cond_10

    invoke-static {v0, v9, v8}, Lb1;->h0(Landroid/graphics/drawable/Drawable;FF)V

    .line 6
    :cond_10
    iget-object v0, v1, Lw5;->i:Lu5;

    if-eqz v0, :cond_11

    .line 7
    iput-boolean v6, v0, Lu5;->c:Z

    .line 8
    :cond_11
    invoke-virtual/range {p0 .. p0}, Landroid/widget/ListView;->refreshDrawableState()V

    const/4 v4, 0x1

    if-ne v3, v4, :cond_12

    .line 9
    invoke-virtual {v1, v10}, Landroid/widget/ListView;->getItemIdAtPosition(I)J

    move-result-wide v3

    invoke-virtual {v1, v12, v10, v3, v4}, Landroid/widget/ListView;->performItemClick(Landroid/view/View;IJ)Z

    :cond_12
    :goto_5
    const/4 v0, 0x1

    :goto_6
    const/4 v7, 0x0

    :goto_7
    if-eqz v0, :cond_13

    if-eqz v7, :cond_15

    .line 10
    :cond_13
    iput-boolean v6, v1, Lw5;->l:Z

    invoke-virtual {v1, v6}, Landroid/widget/ListView;->setPressed(Z)V

    invoke-virtual/range {p0 .. p0}, Lw5;->drawableStateChanged()V

    iget v3, v1, Lw5;->g:I

    invoke-virtual/range {p0 .. p0}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {v1, v3}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_14

    invoke-virtual {v3, v6}, Landroid/view/View;->setPressed(Z)V

    :cond_14
    iget-object v3, v1, Lw5;->m:Lgc;

    if-eqz v3, :cond_15

    invoke-virtual {v3}, Lgc;->b()V

    const/4 v3, 0x0

    iput-object v3, v1, Lw5;->m:Lgc;

    :cond_15
    if-eqz v0, :cond_1b

    .line 11
    iget-object v3, v1, Lw5;->n:Lrc;

    if-nez v3, :cond_16

    new-instance v3, Lrc;

    invoke-direct {v3, v1}, Lrc;-><init>(Landroid/widget/ListView;)V

    iput-object v3, v1, Lw5;->n:Lrc;

    :cond_16
    iget-object v3, v1, Lw5;->n:Lrc;

    .line 12
    iget-boolean v4, v3, Lrc;->q:Z

    const/4 v5, 0x1

    iput-boolean v5, v3, Lrc;->q:Z

    if-nez v5, :cond_17

    goto :goto_8

    .line 13
    :cond_17
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    if-eqz v4, :cond_19

    if-eq v4, v5, :cond_18

    const/4 v7, 0x2

    if-eq v4, v7, :cond_1a

    const/4 v7, 0x3

    if-eq v4, v7, :cond_18

    goto :goto_8

    :cond_18
    invoke-virtual {v3}, Lrc;->f()V

    goto :goto_8

    :cond_19
    iput-boolean v5, v3, Lrc;->o:Z

    iput-boolean v6, v3, Lrc;->m:Z

    :cond_1a
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v5, v5

    iget-object v7, v3, Lrc;->d:Landroid/view/View;

    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v3, v6, v4, v5, v7}, Lrc;->a(IFFF)F

    move-result v4

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    iget-object v6, v3, Lrc;->d:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    move-result v6

    int-to-float v6, v6

    const/4 v7, 0x1

    invoke-virtual {v3, v7, v2, v5, v6}, Lrc;->a(IFFF)F

    move-result v2

    iget-object v5, v3, Lrc;->b:Loc;

    .line 14
    iput v4, v5, Loc;->c:F

    iput v2, v5, Loc;->d:F

    .line 15
    iget-boolean v2, v3, Lrc;->p:Z

    if-nez v2, :cond_1d

    invoke-virtual {v3}, Lrc;->g()Z

    move-result v2

    if-eqz v2, :cond_1d

    invoke-virtual {v3}, Lrc;->h()V

    goto :goto_8

    .line 16
    :cond_1b
    iget-object v2, v1, Lw5;->n:Lrc;

    if-eqz v2, :cond_1d

    .line 17
    iget-boolean v3, v2, Lrc;->q:Z

    if-eqz v3, :cond_1c

    invoke-virtual {v2}, Lrc;->f()V

    :cond_1c
    iput-boolean v6, v2, Lrc;->q:Z

    :cond_1d
    :goto_8
    return v0
.end method

.method public final c()V
    .locals 2

    invoke-virtual {p0}, Landroid/widget/ListView;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1
    iget-boolean v1, p0, Lw5;->l:Z

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/widget/ListView;->isPressed()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/widget/ListView;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_0
    return-void
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw5;->b:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/widget/ListView;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lw5;->b:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 2
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ListView;->dispatchDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public drawableStateChanged()V
    .locals 2

    iget-object v0, p0, Lw5;->o:Lv5;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-super {p0}, Landroid/widget/ListView;->drawableStateChanged()V

    const/4 v0, 0x1

    .line 1
    iget-object v1, p0, Lw5;->i:Lu5;

    if-eqz v1, :cond_1

    .line 2
    iput-boolean v0, v1, Lu5;->c:Z

    .line 3
    :cond_1
    invoke-virtual {p0}, Lw5;->c()V

    return-void
.end method

.method public hasFocus()Z
    .locals 1

    iget-boolean v0, p0, Lw5;->k:Z

    if-nez v0, :cond_1

    invoke-super {p0}, Landroid/widget/ListView;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public hasWindowFocus()Z
    .locals 1

    iget-boolean v0, p0, Lw5;->k:Z

    if-nez v0, :cond_1

    invoke-super {p0}, Landroid/widget/ListView;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public isFocused()Z
    .locals 1

    iget-boolean v0, p0, Lw5;->k:Z

    if-nez v0, :cond_1

    invoke-super {p0}, Landroid/widget/ListView;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public isInTouchMode()Z
    .locals 1

    iget-boolean v0, p0, Lw5;->k:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lw5;->j:Z

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/widget/ListView;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onDetachedFromWindow()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lw5;->o:Lv5;

    invoke-super {p0}, Landroid/widget/ListView;->onDetachedFromWindow()V

    return-void
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    invoke-super {p0, p1}, Landroid/widget/ListView;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    iget-object v1, p0, Lw5;->o:Lv5;

    if-nez v1, :cond_1

    new-instance v1, Lv5;

    invoke-direct {v1, p0}, Lv5;-><init>(Lw5;)V

    iput-object v1, p0, Lw5;->o:Lv5;

    .line 1
    iget-object v2, v1, Lv5;->b:Lw5;

    invoke-virtual {v2, v1}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    .line 2
    :cond_1
    invoke-super {p0, p1}, Landroid/widget/ListView;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    const/16 v2, 0x9

    const/4 v3, -0x1

    if-eq v0, v2, :cond_3

    const/4 v2, 0x7

    if-ne v0, v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v3}, Landroid/widget/ListView;->setSelection(I)V

    goto :goto_1

    :cond_3
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    invoke-virtual {p0, v0, p1}, Landroid/widget/ListView;->pointToPosition(II)I

    move-result p1

    if-eq p1, v3, :cond_5

    invoke-virtual {p0}, Landroid/widget/ListView;->getSelectedItemPosition()I

    move-result v0

    if-eq p1, v0, :cond_5

    invoke-virtual {p0}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v0

    sub-int v0, p1, v0

    invoke-virtual {p0, v0}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/ListView;->getTop()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p0, p1, v0}, Landroid/widget/ListView;->setSelectionFromTop(II)V

    :cond_4
    invoke-virtual {p0}, Lw5;->c()V

    :cond_5
    :goto_1
    return v1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p0, v0, v1}, Landroid/widget/ListView;->pointToPosition(II)I

    move-result v0

    iput v0, p0, Lw5;->g:I

    :goto_0
    iget-object v0, p0, Lw5;->o:Lv5;

    if-eqz v0, :cond_1

    .line 1
    iget-object v1, v0, Lv5;->b:Lw5;

    const/4 v2, 0x0

    iput-object v2, v1, Lw5;->o:Lv5;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 2
    :cond_1
    invoke-super {p0, p1}, Landroid/widget/ListView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setListSelectionHidden(Z)V
    .locals 0

    iput-boolean p1, p0, Lw5;->j:Z

    return-void
.end method

.method public setSelector(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    if-eqz p1, :cond_0

    new-instance v0, Lu5;

    invoke-direct {v0, p1}, Lu5;-><init>(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lw5;->i:Lu5;

    invoke-super {p0, v0}, Landroid/widget/ListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    :cond_1
    iget p1, v0, Landroid/graphics/Rect;->left:I

    iput p1, p0, Lw5;->c:I

    iget p1, v0, Landroid/graphics/Rect;->top:I

    iput p1, p0, Lw5;->d:I

    iget p1, v0, Landroid/graphics/Rect;->right:I

    iput p1, p0, Lw5;->e:I

    iget p1, v0, Landroid/graphics/Rect;->bottom:I

    iput p1, p0, Lw5;->f:I

    return-void
.end method
