.class public Landroid/support/v7/widget/AppCompatImageView;
.super Landroid/widget/ImageView;

# interfaces
.implements Lel;
.implements Lfp;


# instance fields
.field private final a:Lhs;

.field private final a:Lhw;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-static {p1}, Lim;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Lhs;

    invoke-direct {p1, p0}, Lhs;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroid/support/v7/widget/AppCompatImageView;->a:Lhs;

    iget-object p1, p0, Landroid/support/v7/widget/AppCompatImageView;->a:Lhs;

    invoke-virtual {p1, p2, p3}, Lhs;->a(Landroid/util/AttributeSet;I)V

    new-instance p1, Lhw;

    invoke-direct {p1, p0}, Lhw;-><init>(Landroid/widget/ImageView;)V

    iput-object p1, p0, Landroid/support/v7/widget/AppCompatImageView;->a:Lhw;

    iget-object p1, p0, Landroid/support/v7/widget/AppCompatImageView;->a:Lhw;

    invoke-virtual {p1, p2, p3}, Lhw;->a(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method protected drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/ImageView;->drawableStateChanged()V

    iget-object v0, p0, Landroid/support/v7/widget/AppCompatImageView;->a:Lhs;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lhs;->b()V

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/AppCompatImageView;->a:Lhw;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lhw;->a()V

    :cond_1
    return-void
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/AppCompatImageView;->a:Lhs;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lhs;->a()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/AppCompatImageView;->a:Lhs;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lhs;->a()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportImageTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/AppCompatImageView;->a:Lhw;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lhw;->a()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportImageTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/AppCompatImageView;->a:Lhw;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lhw;->a()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public hasOverlappingRendering()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/AppCompatImageView;->a:Lhw;

    invoke-virtual {v0}, Lhw;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/ImageView;->hasOverlappingRendering()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroid/support/v7/widget/AppCompatImageView;->a:Lhs;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lhs;->a()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, p0, Landroid/support/v7/widget/AppCompatImageView;->a:Lhs;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lhs;->a(I)V

    :cond_0
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, Landroid/support/v7/widget/AppCompatImageView;->a:Lhw;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lhw;->a()V

    :cond_0
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroid/support/v7/widget/AppCompatImageView;->a:Lhw;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lhw;->a()V

    :cond_0
    return-void
.end method

.method public setImageResource(I)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/AppCompatImageView;->a:Lhw;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lhw;->a(I)V

    :cond_0
    return-void
.end method

.method public setImageURI(Landroid/net/Uri;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    iget-object p1, p0, Landroid/support/v7/widget/AppCompatImageView;->a:Lhw;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lhw;->a()V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/AppCompatImageView;->a:Lhs;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lhs;->a(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/AppCompatImageView;->a:Lhs;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lhs;->a(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportImageTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/AppCompatImageView;->a:Lhw;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lhw;->a(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportImageTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/AppCompatImageView;->a:Lhw;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lhw;->a(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method
