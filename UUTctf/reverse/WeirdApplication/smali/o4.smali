.class public Lo4;
.super Landroid/widget/ImageButton;
.source ""

# interfaces
.implements Ltb;
.implements Lwc;


# instance fields
.field public final b:Lg4;

.field public final c:Lp4;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-static {p1}, Ly6;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Lg4;

    invoke-direct {p1, p0}, Lg4;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lo4;->b:Lg4;

    invoke-virtual {p1, p2, p3}, Lg4;->d(Landroid/util/AttributeSet;I)V

    new-instance p1, Lp4;

    invoke-direct {p1, p0}, Lp4;-><init>(Landroid/widget/ImageView;)V

    iput-object p1, p0, Lo4;->c:Lp4;

    invoke-virtual {p1, p2, p3}, Lp4;->c(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/ImageButton;->drawableStateChanged()V

    iget-object v0, p0, Lo4;->b:Lg4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg4;->a()V

    :cond_0
    iget-object v0, p0, Lo4;->c:Lp4;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lp4;->a()V

    :cond_1
    return-void
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lo4;->b:Lg4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg4;->b()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lo4;->b:Lg4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg4;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportImageTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lo4;->c:Lp4;

    if-eqz v0, :cond_0

    .line 1
    iget-object v0, v0, Lp4;->b:Lz6;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lz6;->a:Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportImageTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lo4;->c:Lp4;

    if-eqz v0, :cond_0

    .line 1
    iget-object v0, v0, Lp4;->b:Lz6;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lz6;->b:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public hasOverlappingRendering()Z
    .locals 1

    iget-object v0, p0, Lo4;->c:Lp4;

    invoke-virtual {v0}, Lp4;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/ImageButton;->hasOverlappingRendering()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lo4;->b:Lg4;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lg4;->e()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    iget-object v0, p0, Lo4;->b:Lg4;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg4;->f(I)V

    :cond_0
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, Lo4;->c:Lp4;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lp4;->a()V

    :cond_0
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lo4;->c:Lp4;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lp4;->a()V

    :cond_0
    return-void
.end method

.method public setImageResource(I)V
    .locals 1

    iget-object v0, p0, Lo4;->c:Lp4;

    invoke-virtual {v0, p1}, Lp4;->d(I)V

    return-void
.end method

.method public setImageURI(Landroid/net/Uri;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setImageURI(Landroid/net/Uri;)V

    iget-object p1, p0, Lo4;->c:Lp4;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lp4;->a()V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lo4;->b:Lg4;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg4;->h(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lo4;->b:Lg4;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg4;->i(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportImageTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lo4;->c:Lp4;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lp4;->e(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportImageTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lo4;->c:Lp4;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lp4;->f(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method
