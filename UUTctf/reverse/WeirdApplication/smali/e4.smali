.class public Le4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm3;


# instance fields
.field public b:Landroid/content/Context;

.field public c:Landroid/content/Context;

.field public d:Lz2;

.field public e:Landroid/view/LayoutInflater;

.field public f:Lm3$a;

.field public g:I

.field public h:I

.field public i:Ln3;

.field public j:Lb4;

.field public k:Landroid/graphics/drawable/Drawable;

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:I

.field public p:I

.field public q:I

.field public r:Z

.field public s:I

.field public final t:Landroid/util/SparseBooleanArray;

.field public u:Lc4;

.field public v:Lx3;

.field public w:Lz3;

.field public x:Ly3;

.field public final y:Ld4;

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    sget v0, Ll;->abc_action_menu_layout:I

    sget v1, Ll;->abc_action_menu_item_layout:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le4;->b:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Le4;->e:Landroid/view/LayoutInflater;

    iput v0, p0, Le4;->g:I

    iput v1, p0, Le4;->h:I

    .line 2
    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Le4;->t:Landroid/util/SparseBooleanArray;

    new-instance p1, Ld4;

    invoke-direct {p1, p0}, Ld4;-><init>(Le4;)V

    iput-object p1, p0, Le4;->y:Ld4;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    invoke-virtual {p0}, Le4;->i()Z

    move-result v0

    invoke-virtual {p0}, Le4;->l()Z

    move-result v1

    or-int/2addr v0, v1

    return v0
.end method

.method public b(Lz2;Z)V
    .locals 1

    invoke-virtual {p0}, Le4;->a()Z

    .line 1
    iget-object v0, p0, Le4;->f:Lm3$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lm3$a;->b(Lz2;Z)V

    :cond_0
    return-void
.end method

.method public c(Lz2;Lc3;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public d(Lm3$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le4;->f:Lm3$a;

    return-void
.end method

.method public e(Lc3;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    invoke-virtual {p1}, Lc3;->getActionView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lc3;->f()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1
    :cond_0
    instance-of v0, p2, Ln3$a;

    if-eqz v0, :cond_1

    check-cast p2, Ln3$a;

    goto :goto_0

    .line 2
    :cond_1
    iget-object p2, p0, Le4;->e:Landroid/view/LayoutInflater;

    iget v0, p0, Le4;->h:I

    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    check-cast p2, Ln3$a;

    .line 3
    :goto_0
    invoke-interface {p2, p1, v1}, Ln3$a;->c(Lc3;I)V

    iget-object v0, p0, Le4;->i:Ln3;

    check-cast v0, Landroidx/appcompat/widget/ActionMenuView;

    move-object v2, p2

    check-cast v2, Landroidx/appcompat/view/menu/ActionMenuItemView;

    invoke-virtual {v2, v0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->setItemInvoker(Lz2$b;)V

    iget-object v0, p0, Le4;->x:Ly3;

    if-nez v0, :cond_2

    new-instance v0, Ly3;

    invoke-direct {v0, p0}, Ly3;-><init>(Le4;)V

    iput-object v0, p0, Le4;->x:Ly3;

    :cond_2
    iget-object v0, p0, Le4;->x:Ly3;

    invoke-virtual {v2, v0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->setPopupCallback(Landroidx/appcompat/view/menu/ActionMenuItemView$b;)V

    .line 4
    move-object v0, p2

    check-cast v0, Landroid/view/View;

    .line 5
    :cond_3
    iget-boolean p1, p1, Lc3;->C:Z

    if-eqz p1, :cond_4

    const/16 v1, 0x8

    .line 6
    :cond_4
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    check-cast p3, Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroidx/appcompat/widget/ActionMenuView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result p2

    if-nez p2, :cond_5

    invoke-virtual {p3, p1}, Landroidx/appcompat/widget/ActionMenuView;->q(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/ActionMenuView$c;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_5
    return-object v0
.end method

.method public f(Lt3;)Z
    .locals 8

    invoke-virtual {p1}, Lz2;->hasVisibleItems()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    move-object v0, p1

    .line 1
    :goto_0
    iget-object v2, v0, Lt3;->A:Lz2;

    .line 2
    iget-object v3, p0, Le4;->d:Lz2;

    if-eq v2, v3, :cond_1

    move-object v0, v2

    check-cast v0, Lt3;

    goto :goto_0

    .line 3
    :cond_1
    iget-object v0, v0, Lt3;->B:Lc3;

    .line 4
    iget-object v2, p0, Le4;->i:Ln3;

    check-cast v2, Landroid/view/ViewGroup;

    const/4 v3, 0x0

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_4

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    instance-of v7, v6, Ln3$a;

    if-eqz v7, :cond_3

    move-object v7, v6

    check-cast v7, Ln3$a;

    invoke-interface {v7}, Ln3$a;->getItemData()Lc3;

    move-result-object v7

    if-ne v7, v0, :cond_3

    move-object v3, v6

    goto :goto_2

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    if-nez v3, :cond_5

    return v1

    .line 5
    :cond_5
    iget-object v0, p1, Lt3;->B:Lc3;

    .line 6
    iget v0, v0, Lc3;->a:I

    .line 7
    invoke-virtual {p1}, Lz2;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_3
    const/4 v4, 0x1

    if-ge v2, v0, :cond_7

    invoke-virtual {p1, v2}, Lz2;->getItem(I)Landroid/view/MenuItem;

    move-result-object v5

    invoke-interface {v5}, Landroid/view/MenuItem;->isVisible()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v5}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-eqz v5, :cond_6

    const/4 v1, 0x1

    goto :goto_4

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_7
    :goto_4
    new-instance v0, Lx3;

    iget-object v2, p0, Le4;->c:Landroid/content/Context;

    invoke-direct {v0, p0, v2, p1, v3}, Lx3;-><init>(Le4;Landroid/content/Context;Lt3;Landroid/view/View;)V

    iput-object v0, p0, Le4;->v:Lx3;

    .line 8
    iput-boolean v1, v0, Ll3;->h:Z

    iget-object v0, v0, Ll3;->j:Lj3;

    if-eqz v0, :cond_8

    invoke-virtual {v0, v1}, Lj3;->p(Z)V

    .line 9
    :cond_8
    iget-object v0, p0, Le4;->v:Lx3;

    .line 10
    invoke-virtual {v0}, Ll3;->f()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 11
    iget-object v0, p0, Le4;->f:Lm3$a;

    if-eqz v0, :cond_9

    invoke-interface {v0, p1}, Lm3$a;->c(Lz2;)Z

    :cond_9
    return v4

    .line 12
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "MenuPopupHelper cannot be used without an anchor"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_6

    :goto_5
    throw p1

    :goto_6
    goto :goto_5
.end method

.method public g()Z
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Le4;->d:Lz2;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lz2;->l()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    goto :goto_0

    :cond_0
    move-object v1, v2

    const/4 v4, 0x0

    :goto_0
    iget v5, v0, Le4;->q:I

    iget v6, v0, Le4;->p:I

    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    iget-object v8, v0, Le4;->i:Ln3;

    check-cast v8, Landroid/view/ViewGroup;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_1
    const/4 v13, 0x2

    const/4 v14, 0x1

    if-ge v9, v4, :cond_6

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lc3;

    .line 1
    iget v3, v15, Lc3;->y:I

    and-int/2addr v3, v13

    if-ne v3, v13, :cond_1

    const/4 v3, 0x1

    goto :goto_2

    :cond_1
    const/4 v3, 0x0

    :goto_2
    if-eqz v3, :cond_2

    add-int/lit8 v12, v12, 0x1

    goto :goto_4

    .line 2
    :cond_2
    iget v3, v15, Lc3;->y:I

    and-int/2addr v3, v14

    if-ne v3, v14, :cond_3

    const/4 v3, 0x1

    goto :goto_3

    :cond_3
    const/4 v3, 0x0

    :goto_3
    if-eqz v3, :cond_4

    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    :cond_4
    const/4 v10, 0x1

    .line 3
    :goto_4
    iget-boolean v3, v0, Le4;->r:Z

    if-eqz v3, :cond_5

    .line 4
    iget-boolean v3, v15, Lc3;->C:Z

    if-eqz v3, :cond_5

    const/4 v5, 0x0

    :cond_5
    add-int/lit8 v9, v9, 0x1

    const/4 v3, 0x0

    goto :goto_1

    .line 5
    :cond_6
    iget-boolean v3, v0, Le4;->m:Z

    if-eqz v3, :cond_8

    if-nez v10, :cond_7

    add-int/2addr v11, v12

    if-le v11, v5, :cond_8

    :cond_7
    add-int/lit8 v5, v5, -0x1

    :cond_8
    sub-int/2addr v5, v12

    iget-object v3, v0, Le4;->t:Landroid/util/SparseBooleanArray;

    invoke-virtual {v3}, Landroid/util/SparseBooleanArray;->clear()V

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_5
    if-ge v9, v4, :cond_19

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lc3;

    .line 6
    iget v12, v11, Lc3;->y:I

    and-int/2addr v12, v13

    if-ne v12, v13, :cond_9

    const/4 v12, 0x1

    goto :goto_6

    :cond_9
    const/4 v12, 0x0

    :goto_6
    if-eqz v12, :cond_c

    .line 7
    invoke-virtual {v0, v11, v2, v8}, Le4;->e(Lc3;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v12

    invoke-virtual {v12, v7, v7}, Landroid/view/View;->measure(II)V

    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    move-result v12

    sub-int/2addr v6, v12

    if-nez v10, :cond_a

    move v10, v12

    .line 8
    :cond_a
    iget v12, v11, Lc3;->b:I

    if-eqz v12, :cond_b

    .line 9
    invoke-virtual {v3, v12, v14}, Landroid/util/SparseBooleanArray;->put(IZ)V

    :cond_b
    invoke-virtual {v11, v14}, Lc3;->k(Z)V

    goto/16 :goto_c

    .line 10
    :cond_c
    iget v12, v11, Lc3;->y:I

    and-int/2addr v12, v14

    if-ne v12, v14, :cond_d

    const/4 v12, 0x1

    goto :goto_7

    :cond_d
    const/4 v12, 0x0

    :goto_7
    if-eqz v12, :cond_18

    .line 11
    iget v12, v11, Lc3;->b:I

    .line 12
    invoke-virtual {v3, v12}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v15

    if-gtz v5, :cond_e

    if-eqz v15, :cond_f

    :cond_e
    if-lez v6, :cond_f

    const/16 v16, 0x1

    goto :goto_8

    :cond_f
    const/16 v16, 0x0

    :goto_8
    if-eqz v16, :cond_12

    invoke-virtual {v0, v11, v2, v8}, Le4;->e(Lc3;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v13

    invoke-virtual {v13, v7, v7}, Landroid/view/View;->measure(II)V

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v13

    sub-int/2addr v6, v13

    if-nez v10, :cond_10

    move v10, v13

    :cond_10
    add-int v13, v6, v10

    if-lez v13, :cond_11

    const/4 v13, 0x1

    goto :goto_9

    :cond_11
    const/4 v13, 0x0

    :goto_9
    and-int v16, v16, v13

    :cond_12
    move/from16 v13, v16

    if-eqz v13, :cond_13

    if-eqz v12, :cond_13

    invoke-virtual {v3, v12, v14}, Landroid/util/SparseBooleanArray;->put(IZ)V

    goto :goto_b

    :cond_13
    if-eqz v15, :cond_16

    const/4 v15, 0x0

    invoke-virtual {v3, v12, v15}, Landroid/util/SparseBooleanArray;->put(IZ)V

    const/4 v15, 0x0

    :goto_a
    if-ge v15, v9, :cond_16

    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v2, v16

    check-cast v2, Lc3;

    .line 13
    iget v14, v2, Lc3;->b:I

    if-ne v14, v12, :cond_15

    .line 14
    invoke-virtual {v2}, Lc3;->g()Z

    move-result v14

    if-eqz v14, :cond_14

    add-int/lit8 v5, v5, 0x1

    :cond_14
    const/4 v14, 0x0

    invoke-virtual {v2, v14}, Lc3;->k(Z)V

    :cond_15
    add-int/lit8 v15, v15, 0x1

    const/4 v2, 0x0

    const/4 v14, 0x1

    goto :goto_a

    :cond_16
    :goto_b
    if-eqz v13, :cond_17

    add-int/lit8 v5, v5, -0x1

    :cond_17
    invoke-virtual {v11, v13}, Lc3;->k(Z)V

    :goto_c
    const/4 v2, 0x0

    goto :goto_d

    :cond_18
    const/4 v2, 0x0

    invoke-virtual {v11, v2}, Lc3;->k(Z)V

    :goto_d
    add-int/lit8 v9, v9, 0x1

    const/4 v2, 0x0

    const/4 v13, 0x2

    const/4 v14, 0x1

    goto/16 :goto_5

    :cond_19
    const/4 v5, 0x1

    return v5
.end method

.method public h(Z)V
    .locals 11

    .line 1
    iget-object p1, p0, Le4;->i:Ln3;

    check-cast p1, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-object v3, p0, Le4;->d:Lz2;

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lz2;->i()V

    iget-object v3, p0, Le4;->d:Lz2;

    invoke-virtual {v3}, Lz2;->l()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v5, v4, :cond_7

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lc3;

    .line 2
    invoke-virtual {v7}, Lc3;->g()Z

    move-result v8

    if-eqz v8, :cond_5

    .line 3
    invoke-virtual {p1, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    instance-of v9, v8, Ln3$a;

    if-eqz v9, :cond_1

    move-object v9, v8

    check-cast v9, Ln3$a;

    invoke-interface {v9}, Ln3$a;->getItemData()Lc3;

    move-result-object v9

    goto :goto_1

    :cond_1
    move-object v9, v0

    :goto_1
    invoke-virtual {p0, v7, v8, p1}, Le4;->e(Lc3;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v10

    if-eq v7, v9, :cond_2

    invoke-virtual {v10, v2}, Landroid/view/View;->setPressed(Z)V

    invoke-virtual {v10}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    :cond_2
    if-eq v10, v8, :cond_4

    .line 4
    invoke-virtual {v10}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    check-cast v7, Landroid/view/ViewGroup;

    if-eqz v7, :cond_3

    invoke-virtual {v7, v10}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_3
    iget-object v7, p0, Le4;->i:Ln3;

    check-cast v7, Landroid/view/ViewGroup;

    invoke-virtual {v7, v10, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    :cond_4
    add-int/lit8 v6, v6, 0x1

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_6
    const/4 v6, 0x0

    .line 5
    :cond_7
    :goto_2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-ge v6, v3, :cond_9

    .line 6
    invoke-virtual {p1, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    iget-object v4, p0, Le4;->j:Lb4;

    if-ne v3, v4, :cond_8

    const/4 v3, 0x0

    goto :goto_3

    .line 7
    :cond_8
    invoke-virtual {p1, v6}, Landroid/view/ViewGroup;->removeViewAt(I)V

    const/4 v3, 0x1

    :goto_3
    if-nez v3, :cond_7

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 8
    :cond_9
    :goto_4
    iget-object p1, p0, Le4;->i:Ln3;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    iget-object p1, p0, Le4;->d:Lz2;

    if-eqz p1, :cond_a

    .line 9
    invoke-virtual {p1}, Lz2;->i()V

    iget-object p1, p1, Lz2;->i:Ljava/util/ArrayList;

    .line 10
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_5
    if-ge v4, v3, :cond_a

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lc3;

    .line 11
    iget-object v5, v5, Lc3;->A:Ld3;

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 12
    :cond_a
    iget-object p1, p0, Le4;->d:Lz2;

    if-eqz p1, :cond_b

    .line 13
    invoke-virtual {p1}, Lz2;->i()V

    iget-object v0, p1, Lz2;->j:Ljava/util/ArrayList;

    .line 14
    :cond_b
    iget-boolean p1, p0, Le4;->m:Z

    if-eqz p1, :cond_d

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ne p1, v1, :cond_c

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc3;

    .line 15
    iget-boolean p1, p1, Lc3;->C:Z

    xor-int/lit8 v2, p1, 0x1

    goto :goto_6

    :cond_c
    if-lez p1, :cond_d

    const/4 v2, 0x1

    .line 16
    :cond_d
    :goto_6
    iget-object p1, p0, Le4;->j:Lb4;

    if-eqz v2, :cond_10

    if-nez p1, :cond_e

    new-instance p1, Lb4;

    iget-object v0, p0, Le4;->b:Landroid/content/Context;

    invoke-direct {p1, p0, v0}, Lb4;-><init>(Le4;Landroid/content/Context;)V

    iput-object p1, p0, Le4;->j:Lb4;

    :cond_e
    iget-object p1, p0, Le4;->j:Lb4;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, Le4;->i:Ln3;

    if-eq p1, v0, :cond_11

    if-eqz p1, :cond_f

    iget-object v0, p0, Le4;->j:Lb4;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_f
    iget-object p1, p0, Le4;->i:Ln3;

    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    iget-object v0, p0, Le4;->j:Lb4;

    .line 17
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionMenuView;->p()Landroidx/appcompat/widget/ActionMenuView$c;

    move-result-object v2

    iput-boolean v1, v2, Landroidx/appcompat/widget/ActionMenuView$c;->c:Z

    .line 18
    invoke-virtual {p1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_7

    :cond_10
    if-eqz p1, :cond_11

    invoke-virtual {p1}, Landroid/widget/ImageView;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    iget-object v0, p0, Le4;->i:Ln3;

    if-ne p1, v0, :cond_11

    check-cast v0, Landroid/view/ViewGroup;

    iget-object p1, p0, Le4;->j:Lb4;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_11
    :goto_7
    iget-object p1, p0, Le4;->i:Ln3;

    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    iget-boolean v0, p0, Le4;->m:Z

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionMenuView;->setOverflowReserved(Z)V

    return-void
.end method

.method public i()Z
    .locals 3

    iget-object v0, p0, Le4;->w:Lz3;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v2, p0, Le4;->i:Ln3;

    if-eqz v2, :cond_0

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Le4;->w:Lz3;

    return v1

    :cond_0
    iget-object v0, p0, Le4;->u:Lc4;

    if-eqz v0, :cond_2

    .line 1
    invoke-virtual {v0}, Ll3;->b()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v0, v0, Ll3;->j:Lj3;

    invoke-interface {v0}, Lp3;->dismiss()V

    :cond_1
    return v1

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public j(Landroid/content/Context;Lz2;)V
    .locals 4

    .line 1
    iput-object p1, p0, Le4;->c:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    iput-object p2, p0, Le4;->d:Lz2;

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    iget-boolean v0, p0, Le4;->n:Z

    if-nez v0, :cond_1

    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/16 v2, 0x13

    if-lt v0, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result v0

    xor-int/2addr v1, v0

    .line 4
    :goto_0
    iput-boolean v1, p0, Le4;->m:Z

    .line 5
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    const/4 v1, 0x2

    div-int/2addr v0, v1

    .line 6
    iput v0, p0, Le4;->o:I

    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget v0, p1, Landroid/content/res/Configuration;->screenWidthDp:I

    iget v2, p1, Landroid/content/res/Configuration;->screenHeightDp:I

    iget p1, p1, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    const/16 v3, 0x258

    if-gt p1, v3, :cond_7

    if-gt v0, v3, :cond_7

    const/16 p1, 0x2d0

    const/16 v3, 0x3c0

    if-le v0, v3, :cond_2

    if-gt v2, p1, :cond_7

    :cond_2
    if-le v0, p1, :cond_3

    if-le v2, v3, :cond_3

    goto :goto_2

    :cond_3
    const/16 p1, 0x1f4

    if-ge v0, p1, :cond_6

    const/16 p1, 0x1e0

    const/16 v3, 0x280

    if-le v0, v3, :cond_4

    if-gt v2, p1, :cond_6

    :cond_4
    if-le v0, p1, :cond_5

    if-le v2, v3, :cond_5

    goto :goto_1

    :cond_5
    const/16 p1, 0x168

    if-lt v0, p1, :cond_8

    const/4 v1, 0x3

    goto :goto_3

    :cond_6
    :goto_1
    const/4 v1, 0x4

    goto :goto_3

    :cond_7
    :goto_2
    const/4 v1, 0x5

    .line 8
    :cond_8
    :goto_3
    iput v1, p0, Le4;->q:I

    iget p1, p0, Le4;->o:I

    iget-boolean v0, p0, Le4;->m:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_b

    iget-object v0, p0, Le4;->j:Lb4;

    if-nez v0, :cond_a

    new-instance v0, Lb4;

    iget-object v2, p0, Le4;->b:Landroid/content/Context;

    invoke-direct {v0, p0, v2}, Lb4;-><init>(Le4;Landroid/content/Context;)V

    iput-object v0, p0, Le4;->j:Lb4;

    iget-boolean v2, p0, Le4;->l:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_9

    iget-object v2, p0, Le4;->k:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v2}, Lq4;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iput-object v1, p0, Le4;->k:Landroid/graphics/drawable/Drawable;

    iput-boolean v3, p0, Le4;->l:Z

    :cond_9
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    iget-object v1, p0, Le4;->j:Lb4;

    invoke-virtual {v1, v0, v0}, Landroid/widget/ImageView;->measure(II)V

    :cond_a
    iget-object v0, p0, Le4;->j:Lb4;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v0

    sub-int/2addr p1, v0

    goto :goto_4

    :cond_b
    iput-object v1, p0, Le4;->j:Lb4;

    :goto_4
    iput p1, p0, Le4;->p:I

    const/high16 p1, 0x42600000    # 56.0f

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    mul-float p2, p2, p1

    float-to-int p1, p2

    iput p1, p0, Le4;->s:I

    return-void
.end method

.method public k(Lz2;Lc3;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public l()Z
    .locals 2

    iget-object v0, p0, Le4;->v:Lx3;

    if-eqz v0, :cond_1

    .line 1
    invoke-virtual {v0}, Ll3;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Ll3;->j:Lj3;

    invoke-interface {v0}, Lp3;->dismiss()V

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public m()Z
    .locals 1

    iget-object v0, p0, Le4;->u:Lc4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll3;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public n()Z
    .locals 7

    iget-boolean v0, p0, Le4;->m:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Le4;->m()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Le4;->d:Lz2;

    if-eqz v0, :cond_1

    iget-object v1, p0, Le4;->i:Ln3;

    if-eqz v1, :cond_1

    iget-object v1, p0, Le4;->w:Lz3;

    if-nez v1, :cond_1

    .line 1
    invoke-virtual {v0}, Lz2;->i()V

    iget-object v0, v0, Lz2;->j:Ljava/util/ArrayList;

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lc4;

    iget-object v3, p0, Le4;->c:Landroid/content/Context;

    iget-object v4, p0, Le4;->d:Lz2;

    iget-object v5, p0, Le4;->j:Lb4;

    const/4 v6, 0x1

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lc4;-><init>(Le4;Landroid/content/Context;Lz2;Landroid/view/View;Z)V

    new-instance v1, Lz3;

    invoke-direct {v1, p0, v0}, Lz3;-><init>(Le4;Lc4;)V

    iput-object v1, p0, Le4;->w:Lz3;

    iget-object v0, p0, Le4;->i:Ln3;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    .line 3
    iget-object v1, p0, Le4;->f:Lm3$a;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lm3$a;->c(Lz2;)Z

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
