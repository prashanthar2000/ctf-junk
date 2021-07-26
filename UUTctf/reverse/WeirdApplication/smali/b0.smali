.class public Lb0;
.super Landroid/app/Dialog;
.source ""

# interfaces
.implements Landroid/content/DialogInterface;
.implements Ld0;


# instance fields
.field public b:Le0;

.field public final c:Llb;

.field public final d:Landroidx/appcompat/app/AlertController;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 4

    invoke-static {p1, p2}, Lb0;->c(Landroid/content/Context;I)I

    move-result p2

    const/4 v0, 0x1

    if-nez p2, :cond_0

    .line 1
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    sget v3, Lf;->dialogTheme:I

    invoke-virtual {v2, v3, v1, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    goto :goto_0

    :cond_0
    move v1, p2

    .line 2
    :goto_0
    invoke-direct {p0, p1, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    new-instance v1, Lz0;

    invoke-direct {v1, p0}, Lz0;-><init>(Lb0;)V

    iput-object v1, p0, Lb0;->c:Llb;

    invoke-virtual {p0}, Lb0;->b()Le0;

    move-result-object v1

    if-nez p2, :cond_1

    .line 3
    new-instance p2, Landroid/util/TypedValue;

    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget v2, Lf;->dialogTheme:I

    invoke-virtual {p1, v2, p2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p2, p2, Landroid/util/TypedValue;->resourceId:I

    .line 4
    :cond_1
    move-object p1, v1

    check-cast p1, Ly0;

    .line 5
    iput p2, p1, Ly0;->O:I

    const/4 p1, 0x0

    .line 6
    invoke-virtual {v1, p1}, Le0;->h(Landroid/os/Bundle;)V

    .line 7
    new-instance p1, Landroidx/appcompat/app/AlertController;

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-direct {p1, p2, p0, v0}, Landroidx/appcompat/app/AlertController;-><init>(Landroid/content/Context;Lb0;Landroid/view/Window;)V

    iput-object p1, p0, Lb0;->d:Landroidx/appcompat/app/AlertController;

    return-void
.end method

.method public static c(Landroid/content/Context;I)I
    .locals 2

    ushr-int/lit8 v0, p1, 0x18

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    return p1

    :cond_0
    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    sget v0, Lf;->alertDialogTheme:I

    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p0, p1, Landroid/util/TypedValue;->resourceId:I

    return p0
.end method


# virtual methods
.method public a(Ld2;)V
    .locals 0

    return-void
.end method

.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lb0;->b()Le0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Le0;->c(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public b()Le0;
    .locals 1

    .line 1
    iget-object v0, p0, Lb0;->b:Le0;

    if-nez v0, :cond_0

    invoke-static {p0, p0}, Le0;->e(Landroid/app/Dialog;Ld0;)Le0;

    move-result-object v0

    iput-object v0, p0, Lb0;->b:Le0;

    :cond_0
    iget-object v0, p0, Lb0;->b:Le0;

    return-object v0
.end method

.method public d(Ld2;)V
    .locals 0

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lb0;->c:Llb;

    invoke-static {v1, v0, p0, p1}, Lmb;->a(Llb;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public e(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public f(Lc2;)Ld2;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lb0;->b()Le0;

    move-result-object v0

    check-cast v0, Ly0;

    .line 2
    invoke-virtual {v0}, Ly0;->y()V

    iget-object v0, v0, Ly0;->f:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lb0;->b()Le0;

    move-result-object v0

    invoke-virtual {v0}, Le0;->g()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 16

    .line 1
    invoke-virtual/range {p0 .. p0}, Lb0;->b()Le0;

    move-result-object v0

    invoke-virtual {v0}, Le0;->f()V

    invoke-super/range {p0 .. p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual/range {p0 .. p0}, Lb0;->b()Le0;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Le0;->h(Landroid/os/Bundle;)V

    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, Lb0;->d:Landroidx/appcompat/app/AlertController;

    .line 3
    iget v2, v1, Landroidx/appcompat/app/AlertController;->K:I

    const/4 v3, 0x1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget v4, v1, Landroidx/appcompat/app/AlertController;->Q:I

    if-ne v4, v3, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    iget v2, v1, Landroidx/appcompat/app/AlertController;->J:I

    .line 4
    :goto_1
    iget-object v4, v1, Landroidx/appcompat/app/AlertController;->b:Lb0;

    .line 5
    invoke-virtual {v4}, Lb0;->b()Le0;

    move-result-object v4

    invoke-virtual {v4, v2}, Le0;->l(I)V

    .line 6
    iget-object v2, v1, Landroidx/appcompat/app/AlertController;->c:Landroid/view/Window;

    sget v4, Lk;->parentPanel:I

    invoke-virtual {v2, v4}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v2

    sget v4, Lk;->topPanel:I

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    sget v5, Lk;->contentPanel:I

    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    sget v6, Lk;->buttonPanel:I

    invoke-virtual {v2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    sget v7, Lk;->customPanel:I

    invoke-virtual {v2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    .line 7
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->h:Landroid/view/View;

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v7, :cond_2

    goto :goto_2

    :cond_2
    iget v7, v1, Landroidx/appcompat/app/AlertController;->i:I

    if-eqz v7, :cond_3

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->a:Landroid/content/Context;

    invoke-static {v7}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v7

    iget v10, v1, Landroidx/appcompat/app/AlertController;->i:I

    invoke-virtual {v7, v10, v2, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v7

    goto :goto_2

    :cond_3
    move-object v7, v8

    :goto_2
    if-eqz v7, :cond_4

    const/4 v10, 0x1

    goto :goto_3

    :cond_4
    const/4 v10, 0x0

    :goto_3
    if-eqz v10, :cond_5

    invoke-static {v7}, Landroidx/appcompat/app/AlertController;->a(Landroid/view/View;)Z

    move-result v11

    if-nez v11, :cond_6

    :cond_5
    iget-object v11, v1, Landroidx/appcompat/app/AlertController;->c:Landroid/view/Window;

    const/high16 v12, 0x20000

    invoke-virtual {v11, v12, v12}, Landroid/view/Window;->setFlags(II)V

    :cond_6
    const/4 v11, -0x1

    const/16 v12, 0x8

    if-eqz v10, :cond_8

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->c:Landroid/view/Window;

    sget v13, Lk;->custom:I

    invoke-virtual {v10, v13}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/FrameLayout;

    new-instance v13, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v13, v11, v11}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v10, v7, v13}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-boolean v7, v1, Landroidx/appcompat/app/AlertController;->n:Z

    if-eqz v7, :cond_7

    iget v7, v1, Landroidx/appcompat/app/AlertController;->j:I

    iget v13, v1, Landroidx/appcompat/app/AlertController;->k:I

    iget v14, v1, Landroidx/appcompat/app/AlertController;->l:I

    iget v15, v1, Landroidx/appcompat/app/AlertController;->m:I

    invoke-virtual {v10, v7, v13, v14, v15}, Landroid/widget/FrameLayout;->setPadding(IIII)V

    :cond_7
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->g:Landroid/widget/ListView;

    if-eqz v7, :cond_9

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Lb6$a;

    const/4 v10, 0x0

    iput v10, v7, Lb6$a;->a:F

    goto :goto_4

    :cond_8
    invoke-virtual {v2, v12}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 8
    :cond_9
    :goto_4
    sget v7, Lk;->topPanel:I

    invoke-virtual {v2, v7}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v7

    sget v10, Lk;->contentPanel:I

    invoke-virtual {v2, v10}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v10

    sget v13, Lk;->buttonPanel:I

    invoke-virtual {v2, v13}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v13

    invoke-virtual {v1, v7, v4}, Landroidx/appcompat/app/AlertController;->d(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v4

    invoke-virtual {v1, v10, v5}, Landroidx/appcompat/app/AlertController;->d(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v5

    invoke-virtual {v1, v13, v6}, Landroidx/appcompat/app/AlertController;->d(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v6

    .line 9
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->c:Landroid/view/Window;

    sget v10, Lk;->scrollView:I

    invoke-virtual {v7, v10}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroidx/core/widget/NestedScrollView;

    iput-object v7, v1, Landroidx/appcompat/app/AlertController;->A:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {v7, v9}, Landroid/widget/FrameLayout;->setFocusable(Z)V

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->A:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {v7, v9}, Landroidx/core/widget/NestedScrollView;->setNestedScrollingEnabled(Z)V

    const v7, 0x102000b

    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    iput-object v7, v1, Landroidx/appcompat/app/AlertController;->F:Landroid/widget/TextView;

    if-nez v7, :cond_a

    goto :goto_5

    :cond_a
    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->f:Ljava/lang/CharSequence;

    if-eqz v10, :cond_b

    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    :cond_b
    invoke-virtual {v7, v12}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->A:Landroidx/core/widget/NestedScrollView;

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->F:Landroid/widget/TextView;

    invoke-virtual {v7, v10}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->g:Landroid/widget/ListView;

    if-eqz v7, :cond_c

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->A:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {v7}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    check-cast v7, Landroid/view/ViewGroup;

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->A:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {v7, v10}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v10

    invoke-virtual {v7, v10}, Landroid/view/ViewGroup;->removeViewAt(I)V

    iget-object v13, v1, Landroidx/appcompat/app/AlertController;->g:Landroid/widget/ListView;

    new-instance v14, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v14, v11, v11}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v7, v13, v10, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_5

    :cond_c
    invoke-virtual {v5, v12}, Landroid/view/ViewGroup;->setVisibility(I)V

    :goto_5
    const v7, 0x1020019

    .line 10
    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/Button;

    iput-object v7, v1, Landroidx/appcompat/app/AlertController;->o:Landroid/widget/Button;

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->S:Landroid/view/View$OnClickListener;

    invoke-virtual {v7, v10}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->p:Ljava/lang/CharSequence;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_d

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->r:Landroid/graphics/drawable/Drawable;

    if-nez v7, :cond_d

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->o:Landroid/widget/Button;

    invoke-virtual {v7, v12}, Landroid/widget/Button;->setVisibility(I)V

    const/4 v7, 0x0

    goto :goto_6

    :cond_d
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->o:Landroid/widget/Button;

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->p:Ljava/lang/CharSequence;

    invoke-virtual {v7, v10}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->r:Landroid/graphics/drawable/Drawable;

    if-eqz v7, :cond_e

    iget v10, v1, Landroidx/appcompat/app/AlertController;->d:I

    invoke-virtual {v7, v9, v9, v10, v10}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->o:Landroid/widget/Button;

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->r:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v7, v10, v8, v8, v8}, Landroid/widget/Button;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_e
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->o:Landroid/widget/Button;

    invoke-virtual {v7, v9}, Landroid/widget/Button;->setVisibility(I)V

    const/4 v7, 0x1

    :goto_6
    const v10, 0x102001a

    invoke-virtual {v6, v10}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/Button;

    iput-object v10, v1, Landroidx/appcompat/app/AlertController;->s:Landroid/widget/Button;

    iget-object v13, v1, Landroidx/appcompat/app/AlertController;->S:Landroid/view/View$OnClickListener;

    invoke-virtual {v10, v13}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->t:Ljava/lang/CharSequence;

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_f

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->v:Landroid/graphics/drawable/Drawable;

    if-nez v10, :cond_f

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->s:Landroid/widget/Button;

    invoke-virtual {v10, v12}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_7

    :cond_f
    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->s:Landroid/widget/Button;

    iget-object v13, v1, Landroidx/appcompat/app/AlertController;->t:Ljava/lang/CharSequence;

    invoke-virtual {v10, v13}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->v:Landroid/graphics/drawable/Drawable;

    if-eqz v10, :cond_10

    iget v13, v1, Landroidx/appcompat/app/AlertController;->d:I

    invoke-virtual {v10, v9, v9, v13, v13}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->s:Landroid/widget/Button;

    iget-object v13, v1, Landroidx/appcompat/app/AlertController;->v:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v10, v13, v8, v8, v8}, Landroid/widget/Button;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_10
    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->s:Landroid/widget/Button;

    invoke-virtual {v10, v9}, Landroid/widget/Button;->setVisibility(I)V

    or-int/lit8 v7, v7, 0x2

    :goto_7
    const v10, 0x102001b

    invoke-virtual {v6, v10}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/Button;

    iput-object v10, v1, Landroidx/appcompat/app/AlertController;->w:Landroid/widget/Button;

    iget-object v13, v1, Landroidx/appcompat/app/AlertController;->S:Landroid/view/View$OnClickListener;

    invoke-virtual {v10, v13}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->x:Ljava/lang/CharSequence;

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_11

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->z:Landroid/graphics/drawable/Drawable;

    if-nez v10, :cond_11

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->w:Landroid/widget/Button;

    invoke-virtual {v10, v12}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_8

    :cond_11
    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->w:Landroid/widget/Button;

    iget-object v13, v1, Landroidx/appcompat/app/AlertController;->x:Ljava/lang/CharSequence;

    invoke-virtual {v10, v13}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->r:Landroid/graphics/drawable/Drawable;

    if-eqz v10, :cond_12

    iget v13, v1, Landroidx/appcompat/app/AlertController;->d:I

    invoke-virtual {v10, v9, v9, v13, v13}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->o:Landroid/widget/Button;

    iget-object v13, v1, Landroidx/appcompat/app/AlertController;->r:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v10, v13, v8, v8, v8}, Landroid/widget/Button;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_12
    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->w:Landroid/widget/Button;

    invoke-virtual {v10, v9}, Landroid/widget/Button;->setVisibility(I)V

    or-int/lit8 v7, v7, 0x4

    :goto_8
    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->a:Landroid/content/Context;

    .line 11
    new-instance v13, Landroid/util/TypedValue;

    invoke-direct {v13}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v10}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v10

    sget v14, Lf;->alertDialogCenterButtons:I

    invoke-virtual {v10, v14, v13, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v10, v13, Landroid/util/TypedValue;->data:I

    if-eqz v10, :cond_13

    const/4 v10, 0x1

    goto :goto_9

    :cond_13
    const/4 v10, 0x0

    :goto_9
    const/4 v13, 0x2

    if-eqz v10, :cond_16

    if-ne v7, v3, :cond_14

    .line 12
    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->o:Landroid/widget/Button;

    goto :goto_a

    :cond_14
    if-ne v7, v13, :cond_15

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->s:Landroid/widget/Button;

    goto :goto_a

    :cond_15
    const/4 v10, 0x4

    if-ne v7, v10, :cond_16

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->w:Landroid/widget/Button;

    :goto_a
    invoke-virtual {v1, v10}, Landroidx/appcompat/app/AlertController;->b(Landroid/widget/Button;)V

    :cond_16
    if-eqz v7, :cond_17

    const/4 v7, 0x1

    goto :goto_b

    :cond_17
    const/4 v7, 0x0

    :goto_b
    if-nez v7, :cond_18

    invoke-virtual {v6, v12}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 13
    :cond_18
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->G:Landroid/view/View;

    if-eqz v7, :cond_19

    new-instance v7, Landroid/view/ViewGroup$LayoutParams;

    const/4 v10, -0x2

    invoke-direct {v7, v11, v10}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->G:Landroid/view/View;

    invoke-virtual {v4, v10, v9, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->c:Landroid/view/Window;

    sget v10, Lk;->title_template:I

    invoke-virtual {v7, v10}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7, v12}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_c

    :cond_19
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->c:Landroid/view/Window;

    const v10, 0x1020006

    invoke-virtual {v7, v10}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/ImageView;

    iput-object v7, v1, Landroidx/appcompat/app/AlertController;->D:Landroid/widget/ImageView;

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->e:Ljava/lang/CharSequence;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    xor-int/2addr v7, v3

    if-eqz v7, :cond_1c

    iget-boolean v7, v1, Landroidx/appcompat/app/AlertController;->P:Z

    if-eqz v7, :cond_1c

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->c:Landroid/view/Window;

    sget v10, Lk;->alertTitle:I

    invoke-virtual {v7, v10}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    iput-object v7, v1, Landroidx/appcompat/app/AlertController;->E:Landroid/widget/TextView;

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->e:Ljava/lang/CharSequence;

    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget v7, v1, Landroidx/appcompat/app/AlertController;->B:I

    if-eqz v7, :cond_1a

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->D:Landroid/widget/ImageView;

    invoke-virtual {v10, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_c

    :cond_1a
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->C:Landroid/graphics/drawable/Drawable;

    if-eqz v7, :cond_1b

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->D:Landroid/widget/ImageView;

    invoke-virtual {v10, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_c

    :cond_1b
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->E:Landroid/widget/TextView;

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->D:Landroid/widget/ImageView;

    invoke-virtual {v10}, Landroid/widget/ImageView;->getPaddingLeft()I

    move-result v10

    iget-object v14, v1, Landroidx/appcompat/app/AlertController;->D:Landroid/widget/ImageView;

    invoke-virtual {v14}, Landroid/widget/ImageView;->getPaddingTop()I

    move-result v14

    iget-object v15, v1, Landroidx/appcompat/app/AlertController;->D:Landroid/widget/ImageView;

    invoke-virtual {v15}, Landroid/widget/ImageView;->getPaddingRight()I

    move-result v15

    iget-object v11, v1, Landroidx/appcompat/app/AlertController;->D:Landroid/widget/ImageView;

    invoke-virtual {v11}, Landroid/widget/ImageView;->getPaddingBottom()I

    move-result v11

    invoke-virtual {v7, v10, v14, v15, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->D:Landroid/widget/ImageView;

    invoke-virtual {v7, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_c

    :cond_1c
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->c:Landroid/view/Window;

    sget v10, Lk;->title_template:I

    invoke-virtual {v7, v10}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7, v12}, Landroid/view/View;->setVisibility(I)V

    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->D:Landroid/widget/ImageView;

    invoke-virtual {v7, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {v4, v12}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 14
    :goto_c
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v2

    if-eq v2, v12, :cond_1d

    const/4 v2, 0x1

    goto :goto_d

    :cond_1d
    const/4 v2, 0x0

    :goto_d
    if-eqz v4, :cond_1e

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v7

    if-eq v7, v12, :cond_1e

    const/4 v7, 0x1

    goto :goto_e

    :cond_1e
    const/4 v7, 0x0

    :goto_e
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v6

    if-eq v6, v12, :cond_1f

    const/4 v6, 0x1

    goto :goto_f

    :cond_1f
    const/4 v6, 0x0

    :goto_f
    if-nez v6, :cond_20

    sget v10, Lk;->textSpacerNoButtons:I

    invoke-virtual {v5, v10}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v10

    if-eqz v10, :cond_20

    invoke-virtual {v10, v9}, Landroid/view/View;->setVisibility(I)V

    :cond_20
    if-eqz v7, :cond_24

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->A:Landroidx/core/widget/NestedScrollView;

    if-eqz v10, :cond_21

    invoke-virtual {v10, v3}, Landroid/widget/FrameLayout;->setClipToPadding(Z)V

    :cond_21
    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->f:Ljava/lang/CharSequence;

    if-nez v10, :cond_23

    iget-object v10, v1, Landroidx/appcompat/app/AlertController;->g:Landroid/widget/ListView;

    if-eqz v10, :cond_22

    goto :goto_10

    :cond_22
    move-object v4, v8

    goto :goto_11

    :cond_23
    :goto_10
    sget v10, Lk;->titleDividerNoCustom:I

    invoke-virtual {v4, v10}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v4

    :goto_11
    if-eqz v4, :cond_25

    goto :goto_12

    :cond_24
    sget v4, Lk;->textSpacerNoTitle:I

    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_25

    :goto_12
    invoke-virtual {v4, v9}, Landroid/view/View;->setVisibility(I)V

    :cond_25
    iget-object v4, v1, Landroidx/appcompat/app/AlertController;->g:Landroid/widget/ListView;

    instance-of v10, v4, Landroidx/appcompat/app/AlertController$RecycleListView;

    if-eqz v10, :cond_2a

    check-cast v4, Landroidx/appcompat/app/AlertController$RecycleListView;

    if-eqz v4, :cond_29

    if-eqz v6, :cond_26

    if-nez v7, :cond_2a

    .line 15
    :cond_26
    invoke-virtual {v4}, Landroid/widget/ListView;->getPaddingLeft()I

    move-result v10

    if-eqz v7, :cond_27

    invoke-virtual {v4}, Landroid/widget/ListView;->getPaddingTop()I

    move-result v11

    goto :goto_13

    :cond_27
    iget v11, v4, Landroidx/appcompat/app/AlertController$RecycleListView;->b:I

    :goto_13
    invoke-virtual {v4}, Landroid/widget/ListView;->getPaddingRight()I

    move-result v12

    if-eqz v6, :cond_28

    invoke-virtual {v4}, Landroid/widget/ListView;->getPaddingBottom()I

    move-result v14

    goto :goto_14

    :cond_28
    iget v14, v4, Landroidx/appcompat/app/AlertController$RecycleListView;->c:I

    :goto_14
    invoke-virtual {v4, v10, v11, v12, v14}, Landroid/widget/ListView;->setPadding(IIII)V

    goto :goto_15

    :cond_29
    throw v8

    :cond_2a
    :goto_15
    if-nez v2, :cond_35

    .line 16
    iget-object v2, v1, Landroidx/appcompat/app/AlertController;->g:Landroid/widget/ListView;

    if-eqz v2, :cond_2b

    goto :goto_16

    :cond_2b
    iget-object v2, v1, Landroidx/appcompat/app/AlertController;->A:Landroidx/core/widget/NestedScrollView;

    :goto_16
    if-eqz v2, :cond_35

    if-eqz v6, :cond_2c

    const/4 v9, 0x2

    :cond_2c
    or-int v4, v7, v9

    const/4 v6, 0x3

    .line 17
    iget-object v7, v1, Landroidx/appcompat/app/AlertController;->c:Landroid/view/Window;

    sget v9, Lk;->scrollIndicatorUp:I

    invoke-virtual {v7, v9}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v7

    iget-object v9, v1, Landroidx/appcompat/app/AlertController;->c:Landroid/view/Window;

    sget v10, Lk;->scrollIndicatorDown:I

    invoke-virtual {v9, v10}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v9

    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x17

    if-lt v10, v11, :cond_2e

    invoke-static {v2, v4, v6}, Lbc;->w(Landroid/view/View;II)V

    if-eqz v7, :cond_2d

    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_2d
    if-eqz v9, :cond_35

    goto :goto_18

    :cond_2e
    if-eqz v7, :cond_2f

    and-int/lit8 v2, v4, 0x1

    if-nez v2, :cond_2f

    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    move-object v7, v8

    :cond_2f
    if-eqz v9, :cond_30

    and-int/lit8 v2, v4, 0x2

    if-nez v2, :cond_30

    invoke-virtual {v5, v9}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    goto :goto_17

    :cond_30
    move-object v8, v9

    :goto_17
    if-nez v7, :cond_31

    if-eqz v8, :cond_35

    :cond_31
    iget-object v2, v1, Landroidx/appcompat/app/AlertController;->f:Ljava/lang/CharSequence;

    if-eqz v2, :cond_32

    iget-object v2, v1, Landroidx/appcompat/app/AlertController;->A:Landroidx/core/widget/NestedScrollView;

    new-instance v4, Ls;

    invoke-direct {v4, v1, v7, v8}, Ls;-><init>(Landroidx/appcompat/app/AlertController;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v2, v4}, Landroidx/core/widget/NestedScrollView;->setOnScrollChangeListener(Landroidx/core/widget/NestedScrollView$b;)V

    iget-object v2, v1, Landroidx/appcompat/app/AlertController;->A:Landroidx/core/widget/NestedScrollView;

    new-instance v4, Lt;

    invoke-direct {v4, v1, v7, v8}, Lt;-><init>(Landroidx/appcompat/app/AlertController;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v2, v4}, Landroid/widget/FrameLayout;->post(Ljava/lang/Runnable;)Z

    goto :goto_19

    :cond_32
    iget-object v2, v1, Landroidx/appcompat/app/AlertController;->g:Landroid/widget/ListView;

    if-eqz v2, :cond_33

    new-instance v4, Lu;

    invoke-direct {v4, v1, v7, v8}, Lu;-><init>(Landroidx/appcompat/app/AlertController;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v2, v4}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    iget-object v2, v1, Landroidx/appcompat/app/AlertController;->g:Landroid/widget/ListView;

    new-instance v4, Lv;

    invoke-direct {v4, v1, v7, v8}, Lv;-><init>(Landroidx/appcompat/app/AlertController;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v2, v4}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    goto :goto_19

    :cond_33
    if-eqz v7, :cond_34

    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_34
    if-eqz v8, :cond_35

    move-object v9, v8

    :goto_18
    invoke-virtual {v5, v9}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 18
    :cond_35
    :goto_19
    iget-object v2, v1, Landroidx/appcompat/app/AlertController;->g:Landroid/widget/ListView;

    if-eqz v2, :cond_36

    iget-object v4, v1, Landroidx/appcompat/app/AlertController;->H:Landroid/widget/ListAdapter;

    if-eqz v4, :cond_36

    invoke-virtual {v2, v4}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget v1, v1, Landroidx/appcompat/app/AlertController;->I:I

    const/4 v4, -0x1

    if-le v1, v4, :cond_36

    invoke-virtual {v2, v1, v3}, Landroid/widget/ListView;->setItemChecked(IZ)V

    invoke-virtual {v2, v1}, Landroid/widget/ListView;->setSelection(I)V

    :cond_36
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    iget-object v0, p0, Lb0;->d:Landroidx/appcompat/app/AlertController;

    .line 1
    iget-object v0, v0, Landroidx/appcompat/app/AlertController;->A:Landroidx/core/widget/NestedScrollView;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Landroidx/core/widget/NestedScrollView;->n(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return v1

    .line 2
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 2

    iget-object v0, p0, Lb0;->d:Landroidx/appcompat/app/AlertController;

    .line 1
    iget-object v0, v0, Landroidx/appcompat/app/AlertController;->A:Landroidx/core/widget/NestedScrollView;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Landroidx/core/widget/NestedScrollView;->n(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return v1

    .line 2
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public onStop()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->onStop()V

    invoke-virtual {p0}, Lb0;->b()Le0;

    move-result-object v0

    invoke-virtual {v0}, Le0;->i()V

    return-void
.end method

.method public setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lb0;->b()Le0;

    move-result-object v0

    invoke-virtual {v0, p1}, Le0;->l(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .line 2
    invoke-virtual {p0}, Lb0;->b()Le0;

    move-result-object v0

    invoke-virtual {v0, p1}, Le0;->m(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Lb0;->b()Le0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Le0;->n(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setTitle(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V

    invoke-virtual {p0}, Lb0;->b()Le0;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Le0;->o(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 2
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lb0;->b()Le0;

    move-result-object v0

    invoke-virtual {v0, p1}, Le0;->o(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Lb0;->d:Landroidx/appcompat/app/AlertController;

    .line 4
    iput-object p1, v0, Landroidx/appcompat/app/AlertController;->e:Ljava/lang/CharSequence;

    iget-object v0, v0, Landroidx/appcompat/app/AlertController;->E:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method
