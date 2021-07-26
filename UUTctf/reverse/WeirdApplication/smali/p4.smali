.class public Lp4;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/widget/ImageView;

.field public b:Lz6;

.field public c:Lz6;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp4;->a:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 8

    iget-object v0, p0, Lp4;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lt5;->b(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    if-eqz v0, :cond_d

    .line 1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v2, 0x1

    const/16 v3, 0x15

    const/4 v4, 0x0

    if-le v1, v3, :cond_2

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    :cond_2
    if-ne v1, v3, :cond_1

    const/4 v1, 0x1

    :goto_0
    if-eqz v1, :cond_c

    .line 2
    iget-object v1, p0, Lp4;->c:Lz6;

    if-nez v1, :cond_3

    new-instance v1, Lz6;

    invoke-direct {v1}, Lz6;-><init>()V

    iput-object v1, p0, Lp4;->c:Lz6;

    :cond_3
    iget-object v1, p0, Lp4;->c:Lz6;

    const/4 v5, 0x0

    .line 3
    iput-object v5, v1, Lz6;->a:Landroid/content/res/ColorStateList;

    iput-boolean v4, v1, Lz6;->d:Z

    iput-object v5, v1, Lz6;->b:Landroid/graphics/PorterDuff$Mode;

    iput-boolean v4, v1, Lz6;->c:Z

    .line 4
    iget-object v6, p0, Lp4;->a:Landroid/widget/ImageView;

    .line 5
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v7, v3, :cond_4

    invoke-virtual {v6}, Landroid/widget/ImageView;->getImageTintList()Landroid/content/res/ColorStateList;

    move-result-object v6

    goto :goto_1

    :cond_4
    instance-of v7, v6, Lwc;

    if-eqz v7, :cond_5

    check-cast v6, Lwc;

    invoke-interface {v6}, Lwc;->getSupportImageTintList()Landroid/content/res/ColorStateList;

    move-result-object v6

    goto :goto_1

    :cond_5
    move-object v6, v5

    :goto_1
    if-eqz v6, :cond_6

    .line 6
    iput-boolean v2, v1, Lz6;->d:Z

    iput-object v6, v1, Lz6;->a:Landroid/content/res/ColorStateList;

    :cond_6
    iget-object v6, p0, Lp4;->a:Landroid/widget/ImageView;

    .line 7
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v7, v3, :cond_7

    invoke-virtual {v6}, Landroid/widget/ImageView;->getImageTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object v5

    goto :goto_2

    :cond_7
    instance-of v3, v6, Lwc;

    if-eqz v3, :cond_8

    check-cast v6, Lwc;

    invoke-interface {v6}, Lwc;->getSupportImageTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object v5

    :cond_8
    :goto_2
    if-eqz v5, :cond_9

    .line 8
    iput-boolean v2, v1, Lz6;->c:Z

    iput-object v5, v1, Lz6;->b:Landroid/graphics/PorterDuff$Mode;

    :cond_9
    iget-boolean v3, v1, Lz6;->d:Z

    if-nez v3, :cond_b

    iget-boolean v3, v1, Lz6;->c:Z

    if-eqz v3, :cond_a

    goto :goto_3

    :cond_a
    const/4 v2, 0x0

    goto :goto_4

    :cond_b
    :goto_3
    iget-object v3, p0, Lp4;->a:Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/widget/ImageView;->getDrawableState()[I

    move-result-object v3

    invoke-static {v0, v1, v3}, Lm4;->e(Landroid/graphics/drawable/Drawable;Lz6;[I)V

    :goto_4
    if-eqz v2, :cond_c

    return-void

    .line 9
    :cond_c
    iget-object v1, p0, Lp4;->b:Lz6;

    if-eqz v1, :cond_d

    iget-object v2, p0, Lp4;->a:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getDrawableState()[I

    move-result-object v2

    invoke-static {v0, v1, v2}, Lm4;->e(Landroid/graphics/drawable/Drawable;Lz6;[I)V

    :cond_d
    return-void
.end method

.method public b()Z
    .locals 3

    iget-object v0, p0, Lp4;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_0

    instance-of v0, v0, Landroid/graphics/drawable/RippleDrawable;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public c(Landroid/util/AttributeSet;I)V
    .locals 4

    iget-object v0, p0, Lp4;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo;->AppCompatImageView:[I

    const/4 v2, 0x0

    invoke-static {v0, p1, v1, p2, v2}, Lb7;->o(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lb7;

    move-result-object p1

    :try_start_0
    iget-object p2, p0, Lp4;->a:Landroid/widget/ImageView;

    invoke-virtual {p2}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    const/4 v0, -0x1

    if-nez p2, :cond_0

    sget v1, Lo;->AppCompatImageView_srcCompat:I

    invoke-virtual {p1, v1, v0}, Lb7;->j(II)I

    move-result v1

    if-eq v1, v0, :cond_0

    iget-object p2, p0, Lp4;->a:Landroid/widget/ImageView;

    invoke-virtual {p2}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, v1}, Ll1;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object v1, p0, Lp4;->a:Landroid/widget/ImageView;

    invoke-virtual {v1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    if-eqz p2, :cond_1

    invoke-static {p2}, Lt5;->b(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    sget p2, Lo;->AppCompatImageView_tint:I

    invoke-virtual {p1, p2}, Lb7;->m(I)Z

    move-result p2

    const/16 v1, 0x15

    if-eqz p2, :cond_4

    iget-object p2, p0, Lp4;->a:Landroid/widget/ImageView;

    sget v2, Lo;->AppCompatImageView_tint:I

    invoke-virtual {p1, v2}, Lb7;->b(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    .line 1
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v1, :cond_3

    invoke-virtual {p2, v2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ne v2, v1, :cond_4

    invoke-virtual {p2}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {p2}, Landroid/widget/ImageView;->getImageTintList()Landroid/content/res/ColorStateList;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p2}, Landroid/widget/ImageView;->getDrawableState()[I

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_2
    :goto_0
    invoke-virtual {p2, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    :cond_3
    instance-of v3, p2, Lwc;

    if-eqz v3, :cond_4

    check-cast p2, Lwc;

    invoke-interface {p2, v2}, Lwc;->setSupportImageTintList(Landroid/content/res/ColorStateList;)V

    .line 2
    :cond_4
    :goto_1
    sget p2, Lo;->AppCompatImageView_tintMode:I

    invoke-virtual {p1, p2}, Lb7;->m(I)Z

    move-result p2

    if-eqz p2, :cond_7

    iget-object p2, p0, Lp4;->a:Landroid/widget/ImageView;

    sget v2, Lo;->AppCompatImageView_tintMode:I

    invoke-virtual {p1, v2, v0}, Lb7;->h(II)I

    move-result v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lt5;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    .line 3
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v1, :cond_6

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageTintMode(Landroid/graphics/PorterDuff$Mode;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ne v0, v1, :cond_7

    invoke-virtual {p2}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p2}, Landroid/widget/ImageView;->getImageTintList()Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p2}, Landroid/widget/ImageView;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_5
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    :cond_6
    instance-of v1, p2, Lwc;

    if-eqz v1, :cond_7

    check-cast p2, Lwc;

    invoke-interface {p2, v0}, Lwc;->setSupportImageTintMode(Landroid/graphics/PorterDuff$Mode;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :cond_7
    :goto_2
    iget-object p1, p1, Lb7;->b:Landroid/content/res/TypedArray;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :goto_3
    iget-object p1, p1, Lb7;->b:Landroid/content/res/TypedArray;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 5
    throw p2
.end method

.method public d(I)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lp4;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ll1;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lt5;->b(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    iget-object v0, p0, Lp4;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lp4;->a:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    invoke-virtual {p0}, Lp4;->a()V

    return-void
.end method

.method public e(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lp4;->b:Lz6;

    if-nez v0, :cond_0

    new-instance v0, Lz6;

    invoke-direct {v0}, Lz6;-><init>()V

    iput-object v0, p0, Lp4;->b:Lz6;

    :cond_0
    iget-object v0, p0, Lp4;->b:Lz6;

    iput-object p1, v0, Lz6;->a:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lz6;->d:Z

    invoke-virtual {p0}, Lp4;->a()V

    return-void
.end method

.method public f(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lp4;->b:Lz6;

    if-nez v0, :cond_0

    new-instance v0, Lz6;

    invoke-direct {v0}, Lz6;-><init>()V

    iput-object v0, p0, Lp4;->b:Lz6;

    :cond_0
    iget-object v0, p0, Lp4;->b:Lz6;

    iput-object p1, v0, Lz6;->b:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lz6;->c:Z

    invoke-virtual {p0}, Lp4;->a()V

    return-void
.end method
