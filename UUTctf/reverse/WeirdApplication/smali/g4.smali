.class public Lg4;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Lm4;

.field public c:I

.field public d:Lz6;

.field public e:Lz6;

.field public f:Lz6;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lg4;->c:I

    iput-object p1, p0, Lg4;->a:Landroid/view/View;

    invoke-static {}, Lm4;->a()Lm4;

    move-result-object p1

    iput-object p1, p0, Lg4;->b:Lm4;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 8

    iget-object v0, p0, Lg4;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-le v1, v2, :cond_1

    iget-object v1, p0, Lg4;->d:Lz6;

    if-eqz v1, :cond_0

    :goto_0
    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    if-ne v1, v2, :cond_0

    goto :goto_0

    :goto_1
    if-eqz v1, :cond_9

    .line 2
    iget-object v1, p0, Lg4;->f:Lz6;

    if-nez v1, :cond_2

    new-instance v1, Lz6;

    invoke-direct {v1}, Lz6;-><init>()V

    iput-object v1, p0, Lg4;->f:Lz6;

    :cond_2
    iget-object v1, p0, Lg4;->f:Lz6;

    const/4 v5, 0x0

    .line 3
    iput-object v5, v1, Lz6;->a:Landroid/content/res/ColorStateList;

    iput-boolean v4, v1, Lz6;->d:Z

    iput-object v5, v1, Lz6;->b:Landroid/graphics/PorterDuff$Mode;

    iput-boolean v4, v1, Lz6;->c:Z

    .line 4
    iget-object v6, p0, Lg4;->a:Landroid/view/View;

    invoke-static {v6}, Lbc;->d(Landroid/view/View;)Landroid/content/res/ColorStateList;

    move-result-object v6

    if-eqz v6, :cond_3

    iput-boolean v3, v1, Lz6;->d:Z

    iput-object v6, v1, Lz6;->a:Landroid/content/res/ColorStateList;

    :cond_3
    iget-object v6, p0, Lg4;->a:Landroid/view/View;

    .line 5
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v7, v2, :cond_4

    invoke-virtual {v6}, Landroid/view/View;->getBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object v5

    goto :goto_2

    :cond_4
    instance-of v2, v6, Ltb;

    if-eqz v2, :cond_5

    check-cast v6, Ltb;

    invoke-interface {v6}, Ltb;->getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object v5

    :cond_5
    :goto_2
    if-eqz v5, :cond_6

    .line 6
    iput-boolean v3, v1, Lz6;->c:Z

    iput-object v5, v1, Lz6;->b:Landroid/graphics/PorterDuff$Mode;

    :cond_6
    iget-boolean v2, v1, Lz6;->d:Z

    if-nez v2, :cond_8

    iget-boolean v2, v1, Lz6;->c:Z

    if-eqz v2, :cond_7

    goto :goto_3

    :cond_7
    const/4 v3, 0x0

    goto :goto_4

    :cond_8
    :goto_3
    iget-object v2, p0, Lg4;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getDrawableState()[I

    move-result-object v2

    invoke-static {v0, v1, v2}, Lm4;->e(Landroid/graphics/drawable/Drawable;Lz6;[I)V

    :goto_4
    if-eqz v3, :cond_9

    return-void

    .line 7
    :cond_9
    iget-object v1, p0, Lg4;->e:Lz6;

    if-eqz v1, :cond_a

    iget-object v2, p0, Lg4;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getDrawableState()[I

    move-result-object v2

    invoke-static {v0, v1, v2}, Lm4;->e(Landroid/graphics/drawable/Drawable;Lz6;[I)V

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lg4;->d:Lz6;

    if-eqz v1, :cond_b

    iget-object v2, p0, Lg4;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getDrawableState()[I

    move-result-object v2

    invoke-static {v0, v1, v2}, Lm4;->e(Landroid/graphics/drawable/Drawable;Lz6;[I)V

    :cond_b
    :goto_5
    return-void
.end method

.method public b()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lg4;->e:Lz6;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lz6;->a:Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public c()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lg4;->e:Lz6;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lz6;->b:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public d(Landroid/util/AttributeSet;I)V
    .locals 3

    iget-object v0, p0, Lg4;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo;->ViewBackgroundHelper:[I

    const/4 v2, 0x0

    invoke-static {v0, p1, v1, p2, v2}, Lb7;->o(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lb7;

    move-result-object p1

    :try_start_0
    sget p2, Lo;->ViewBackgroundHelper_android_background:I

    invoke-virtual {p1, p2}, Lb7;->m(I)Z

    move-result p2

    const/4 v0, -0x1

    if-eqz p2, :cond_0

    sget p2, Lo;->ViewBackgroundHelper_android_background:I

    invoke-virtual {p1, p2, v0}, Lb7;->j(II)I

    move-result p2

    iput p2, p0, Lg4;->c:I

    iget-object p2, p0, Lg4;->b:Lm4;

    iget-object v1, p0, Lg4;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Lg4;->c:I

    invoke-virtual {p2, v1, v2}, Lm4;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Lg4;->g(Landroid/content/res/ColorStateList;)V

    :cond_0
    sget p2, Lo;->ViewBackgroundHelper_backgroundTint:I

    invoke-virtual {p1, p2}, Lb7;->m(I)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lg4;->a:Landroid/view/View;

    sget v1, Lo;->ViewBackgroundHelper_backgroundTint:I

    invoke-virtual {p1, v1}, Lb7;->b(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-static {p2, v1}, Lbc;->s(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    :cond_1
    sget p2, Lo;->ViewBackgroundHelper_backgroundTintMode:I

    invoke-virtual {p1, p2}, Lb7;->m(I)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lg4;->a:Landroid/view/View;

    sget v1, Lo;->ViewBackgroundHelper_backgroundTintMode:I

    invoke-virtual {p1, v1, v0}, Lb7;->h(II)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lt5;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    invoke-static {p2, v0}, Lbc;->t(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1
    :cond_2
    iget-object p1, p1, Lb7;->b:Landroid/content/res/TypedArray;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception p2

    iget-object p1, p1, Lb7;->b:Landroid/content/res/TypedArray;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 2
    throw p2
.end method

.method public e()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lg4;->c:I

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lg4;->g(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Lg4;->a()V

    return-void
.end method

.method public f(I)V
    .locals 2

    iput p1, p0, Lg4;->c:I

    iget-object v0, p0, Lg4;->b:Lm4;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lg4;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lm4;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lg4;->g(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Lg4;->a()V

    return-void
.end method

.method public g(Landroid/content/res/ColorStateList;)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lg4;->d:Lz6;

    if-nez v0, :cond_0

    new-instance v0, Lz6;

    invoke-direct {v0}, Lz6;-><init>()V

    iput-object v0, p0, Lg4;->d:Lz6;

    :cond_0
    iget-object v0, p0, Lg4;->d:Lz6;

    iput-object p1, v0, Lz6;->a:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lz6;->d:Z

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lg4;->d:Lz6;

    :goto_0
    invoke-virtual {p0}, Lg4;->a()V

    return-void
.end method

.method public h(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lg4;->e:Lz6;

    if-nez v0, :cond_0

    new-instance v0, Lz6;

    invoke-direct {v0}, Lz6;-><init>()V

    iput-object v0, p0, Lg4;->e:Lz6;

    :cond_0
    iget-object v0, p0, Lg4;->e:Lz6;

    iput-object p1, v0, Lz6;->a:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lz6;->d:Z

    invoke-virtual {p0}, Lg4;->a()V

    return-void
.end method

.method public i(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lg4;->e:Lz6;

    if-nez v0, :cond_0

    new-instance v0, Lz6;

    invoke-direct {v0}, Lz6;-><init>()V

    iput-object v0, p0, Lg4;->e:Lz6;

    :cond_0
    iget-object v0, p0, Lg4;->e:Lz6;

    iput-object p1, v0, Lz6;->b:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lz6;->c:Z

    invoke-virtual {p0}, Lg4;->a()V

    return-void
.end method
