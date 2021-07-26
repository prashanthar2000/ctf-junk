.class public Le3;
.super Ld3;
.source ""

# interfaces
.implements Landroid/view/ActionProvider$VisibilityListener;


# instance fields
.field public d:Lb3;


# direct methods
.method public constructor <init>(Li3;Landroid/content/Context;Landroid/view/ActionProvider;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ld3;-><init>(Li3;Landroid/content/Context;Landroid/view/ActionProvider;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Ld3;->b:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->isVisible()Z

    move-result v0

    return v0
.end method

.method public b(Landroid/view/MenuItem;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Ld3;->b:Landroid/view/ActionProvider;

    invoke-virtual {v0, p1}, Landroid/view/ActionProvider;->onCreateActionView(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Ld3;->b:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->overridesItemVisibility()Z

    move-result v0

    return v0
.end method

.method public d(Lb3;)V
    .locals 0

    iput-object p1, p0, Le3;->d:Lb3;

    iget-object p1, p0, Ld3;->b:Landroid/view/ActionProvider;

    invoke-virtual {p1, p0}, Landroid/view/ActionProvider;->setVisibilityListener(Landroid/view/ActionProvider$VisibilityListener;)V

    return-void
.end method

.method public onActionProviderVisibilityChanged(Z)V
    .locals 1

    iget-object p1, p0, Le3;->d:Lb3;

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p1, Lb3;->a:Lc3;

    iget-object p1, p1, Lc3;->n:Lz2;

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p1, Lz2;->h:Z

    invoke-virtual {p1, v0}, Lz2;->q(Z)V

    :cond_0
    return-void
.end method
