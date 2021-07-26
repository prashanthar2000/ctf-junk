.class public abstract Lz1;
.super Lx1;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "RestrictedAPI"
    }
.end annotation


# instance fields
.field public n:Ly1;

.field public o:Z


# direct methods
.method public constructor <init>(Ly1;)V
    .locals 0

    invoke-direct {p0}, Lx1;-><init>()V

    return-void
.end method


# virtual methods
.method public applyTheme(Landroid/content/res/Resources$Theme;)V
    .locals 0

    invoke-super {p0, p1}, Lx1;->applyTheme(Landroid/content/res/Resources$Theme;)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lz1;->onStateChange([I)Z

    return-void
.end method

.method public e(Lw1;)V
    .locals 1

    invoke-super {p0, p1}, Lx1;->e(Lw1;)V

    instance-of v0, p1, Ly1;

    if-eqz v0, :cond_0

    check-cast p1, Ly1;

    iput-object p1, p0, Lz1;->n:Ly1;

    :cond_0
    return-void
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-boolean v0, p0, Lz1;->o:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Lx1;->mutate()Landroid/graphics/drawable/Drawable;

    if-ne p0, p0, :cond_0

    iget-object v0, p0, Lz1;->n:Ly1;

    invoke-virtual {v0}, Lw1;->e()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz1;->o:Z

    :cond_0
    return-object p0
.end method

.method public abstract onStateChange([I)Z
.end method
