.class public Li2;
.super Landroid/view/ActionMode;
.source ""


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ld2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ld2;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/ActionMode;-><init>()V

    iput-object p1, p0, Li2;->a:Landroid/content/Context;

    iput-object p2, p0, Li2;->b:Ld2;

    return-void
.end method


# virtual methods
.method public finish()V
    .locals 1

    iget-object v0, p0, Li2;->b:Ld2;

    invoke-virtual {v0}, Ld2;->c()V

    return-void
.end method

.method public getCustomView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Li2;->b:Ld2;

    invoke-virtual {v0}, Ld2;->d()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 3

    new-instance v0, Lo3;

    iget-object v1, p0, Li2;->a:Landroid/content/Context;

    iget-object v2, p0, Li2;->b:Ld2;

    invoke-virtual {v2}, Ld2;->e()Landroid/view/Menu;

    move-result-object v2

    check-cast v2, Lpa;

    invoke-direct {v0, v1, v2}, Lo3;-><init>(Landroid/content/Context;Lpa;)V

    return-object v0
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    iget-object v0, p0, Li2;->b:Ld2;

    invoke-virtual {v0}, Ld2;->f()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public getSubtitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Li2;->b:Ld2;

    invoke-virtual {v0}, Ld2;->g()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTag()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Li2;->b:Ld2;

    .line 1
    iget-object v0, v0, Ld2;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Li2;->b:Ld2;

    invoke-virtual {v0}, Ld2;->h()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTitleOptionalHint()Z
    .locals 1

    iget-object v0, p0, Li2;->b:Ld2;

    .line 1
    iget-boolean v0, v0, Ld2;->c:Z

    return v0
.end method

.method public invalidate()V
    .locals 1

    iget-object v0, p0, Li2;->b:Ld2;

    invoke-virtual {v0}, Ld2;->i()V

    return-void
.end method

.method public isTitleOptional()Z
    .locals 1

    iget-object v0, p0, Li2;->b:Ld2;

    invoke-virtual {v0}, Ld2;->j()Z

    move-result v0

    return v0
.end method

.method public setCustomView(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Li2;->b:Ld2;

    invoke-virtual {v0, p1}, Ld2;->k(Landroid/view/View;)V

    return-void
.end method

.method public setSubtitle(I)V
    .locals 1

    iget-object v0, p0, Li2;->b:Ld2;

    invoke-virtual {v0, p1}, Ld2;->l(I)V

    return-void
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Li2;->b:Ld2;

    invoke-virtual {v0, p1}, Ld2;->m(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTag(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Li2;->b:Ld2;

    .line 1
    iput-object p1, v0, Ld2;->b:Ljava/lang/Object;

    return-void
.end method

.method public setTitle(I)V
    .locals 1

    iget-object v0, p0, Li2;->b:Ld2;

    invoke-virtual {v0, p1}, Ld2;->n(I)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Li2;->b:Ld2;

    invoke-virtual {v0, p1}, Ld2;->o(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitleOptionalHint(Z)V
    .locals 1

    iget-object v0, p0, Li2;->b:Ld2;

    invoke-virtual {v0, p1}, Ld2;->p(Z)V

    return-void
.end method
