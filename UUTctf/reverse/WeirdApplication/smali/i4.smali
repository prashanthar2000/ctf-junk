.class public Li4;
.super Landroid/widget/CheckBox;
.source ""

# interfaces
.implements Luc;
.implements Ltb;


# instance fields
.field public final b:Lk4;

.field public final c:Lg4;

.field public final d:Ln5;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget v0, Lf;->checkboxStyle:I

    .line 1
    invoke-static {p1}, Ly6;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, v0}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Lk4;

    invoke-direct {p1, p0}, Lk4;-><init>(Landroid/widget/CompoundButton;)V

    iput-object p1, p0, Li4;->b:Lk4;

    invoke-virtual {p1, p2, v0}, Lk4;->c(Landroid/util/AttributeSet;I)V

    new-instance p1, Lg4;

    invoke-direct {p1, p0}, Lg4;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Li4;->c:Lg4;

    invoke-virtual {p1, p2, v0}, Lg4;->d(Landroid/util/AttributeSet;I)V

    new-instance p1, Ln5;

    invoke-direct {p1, p0}, Ln5;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Li4;->d:Ln5;

    invoke-virtual {p1, p2, v0}, Ln5;->e(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/CheckBox;->drawableStateChanged()V

    iget-object v0, p0, Li4;->c:Lg4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg4;->a()V

    :cond_0
    iget-object v0, p0, Li4;->d:Ln5;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ln5;->b()V

    :cond_1
    return-void
.end method

.method public getCompoundPaddingLeft()I
    .locals 2

    invoke-super {p0}, Landroid/widget/CheckBox;->getCompoundPaddingLeft()I

    move-result v0

    iget-object v1, p0, Li4;->b:Lk4;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Lk4;->b(I)I

    move-result v0

    :cond_0
    return v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Li4;->c:Lg4;

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

    iget-object v0, p0, Li4;->c:Lg4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg4;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportButtonTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Li4;->b:Lk4;

    if-eqz v0, :cond_0

    .line 1
    iget-object v0, v0, Lk4;->b:Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportButtonTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Li4;->b:Lk4;

    if-eqz v0, :cond_0

    .line 1
    iget-object v0, v0, Lk4;->c:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Li4;->c:Lg4;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lg4;->e()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setBackgroundResource(I)V

    iget-object v0, p0, Li4;->c:Lg4;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg4;->f(I)V

    :cond_0
    return-void
.end method

.method public setButtonDrawable(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/CheckBox;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ll1;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Li4;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Li4;->b:Lk4;

    if-eqz p1, :cond_1

    .line 1
    iget-boolean v0, p1, Lk4;->f:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p1, Lk4;->f:Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p1, Lk4;->f:Z

    invoke-virtual {p1}, Lk4;->a()V

    :cond_1
    :goto_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Li4;->c:Lg4;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg4;->h(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Li4;->c:Lg4;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg4;->i(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportButtonTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Li4;->b:Lk4;

    if-eqz v0, :cond_0

    .line 1
    iput-object p1, v0, Lk4;->b:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lk4;->d:Z

    invoke-virtual {v0}, Lk4;->a()V

    :cond_0
    return-void
.end method

.method public setSupportButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Li4;->b:Lk4;

    if-eqz v0, :cond_0

    .line 1
    iput-object p1, v0, Lk4;->c:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lk4;->e:Z

    invoke-virtual {v0}, Lk4;->a()V

    :cond_0
    return-void
.end method
