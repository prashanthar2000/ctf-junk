.class public Li1;
.super Ld2;
.source ""

# interfaces
.implements Lz2$a;


# instance fields
.field public final d:Landroid/content/Context;

.field public final e:Lz2;

.field public f:Lc2;

.field public g:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:Lj1;


# direct methods
.method public constructor <init>(Lj1;Landroid/content/Context;Lc2;)V
    .locals 0

    iput-object p1, p0, Li1;->h:Lj1;

    invoke-direct {p0}, Ld2;-><init>()V

    iput-object p2, p0, Li1;->d:Landroid/content/Context;

    iput-object p3, p0, Li1;->f:Lc2;

    new-instance p1, Lz2;

    invoke-direct {p1, p2}, Lz2;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x1

    .line 1
    iput p2, p1, Lz2;->l:I

    .line 2
    iput-object p1, p0, Li1;->e:Lz2;

    .line 3
    iput-object p0, p1, Lz2;->e:Lz2$a;

    return-void
.end method


# virtual methods
.method public a(Lz2;)V
    .locals 0

    iget-object p1, p0, Li1;->f:Lc2;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Li1;->i()V

    iget-object p1, p0, Li1;->h:Lj1;

    iget-object p1, p1, Lj1;->f:Landroidx/appcompat/widget/ActionBarContextView;

    .line 1
    iget-object p1, p1, Lv3;->e:Le4;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Le4;->n()Z

    :cond_1
    return-void
.end method

.method public b(Lz2;Landroid/view/MenuItem;)Z
    .locals 0

    iget-object p1, p0, Li1;->f:Lc2;

    if-eqz p1, :cond_0

    invoke-interface {p1, p0, p2}, Lc2;->c(Ld2;Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public c()V
    .locals 4

    iget-object v0, p0, Li1;->h:Lj1;

    iget-object v1, v0, Lj1;->i:Li1;

    if-eq v1, p0, :cond_0

    return-void

    :cond_0
    iget-boolean v1, v0, Lj1;->q:Z

    iget-boolean v0, v0, Lj1;->r:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_1

    if-eqz v0, :cond_2

    :cond_1
    const/4 v2, 0x0

    :cond_2
    if-nez v2, :cond_3

    iget-object v0, p0, Li1;->h:Lj1;

    iput-object p0, v0, Lj1;->j:Ld2;

    iget-object v1, p0, Li1;->f:Lc2;

    iput-object v1, v0, Lj1;->k:Lc2;

    goto :goto_0

    :cond_3
    iget-object v0, p0, Li1;->f:Lc2;

    invoke-interface {v0, p0}, Lc2;->b(Ld2;)V

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Li1;->f:Lc2;

    iget-object v1, p0, Li1;->h:Lj1;

    invoke-virtual {v1, v3}, Lj1;->e(Z)V

    iget-object v1, p0, Li1;->h:Lj1;

    iget-object v1, v1, Lj1;->f:Landroidx/appcompat/widget/ActionBarContextView;

    .line 1
    iget-object v2, v1, Landroidx/appcompat/widget/ActionBarContextView;->l:Landroid/view/View;

    if-nez v2, :cond_4

    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarContextView;->h()V

    .line 2
    :cond_4
    iget-object v1, p0, Li1;->h:Lj1;

    iget-object v1, v1, Lj1;->e:Ls5;

    check-cast v1, Lf7;

    .line 3
    iget-object v1, v1, Lf7;->a:Landroidx/appcompat/widget/Toolbar;

    const/16 v2, 0x20

    .line 4
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    iget-object v1, p0, Li1;->h:Lj1;

    iget-object v2, v1, Lj1;->c:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iget-boolean v1, v1, Lj1;->w:Z

    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    iget-object v1, p0, Li1;->h:Lj1;

    iput-object v0, v1, Lj1;->i:Li1;

    return-void
.end method

.method public d()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Li1;->g:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public e()Landroid/view/Menu;
    .locals 1

    iget-object v0, p0, Li1;->e:Lz2;

    return-object v0
.end method

.method public f()Landroid/view/MenuInflater;
    .locals 2

    new-instance v0, Ll2;

    iget-object v1, p0, Li1;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Ll2;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public g()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Li1;->h:Lj1;

    iget-object v0, v0, Lj1;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Li1;->h:Lj1;

    iget-object v0, v0, Lj1;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public i()V
    .locals 2

    iget-object v0, p0, Li1;->h:Lj1;

    iget-object v0, v0, Lj1;->i:Li1;

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Li1;->e:Lz2;

    invoke-virtual {v0}, Lz2;->z()V

    :try_start_0
    iget-object v0, p0, Li1;->f:Lc2;

    iget-object v1, p0, Li1;->e:Lz2;

    invoke-interface {v0, p0, v1}, Lc2;->a(Ld2;Landroid/view/Menu;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Li1;->e:Lz2;

    invoke-virtual {v0}, Lz2;->y()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Li1;->e:Lz2;

    invoke-virtual {v1}, Lz2;->y()V

    throw v0
.end method

.method public j()Z
    .locals 1

    iget-object v0, p0, Li1;->h:Lj1;

    iget-object v0, v0, Lj1;->f:Landroidx/appcompat/widget/ActionBarContextView;

    .line 1
    iget-boolean v0, v0, Landroidx/appcompat/widget/ActionBarContextView;->s:Z

    return v0
.end method

.method public k(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Li1;->h:Lj1;

    iget-object v0, v0, Lj1;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setCustomView(Landroid/view/View;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Li1;->g:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public l(I)V
    .locals 1

    iget-object v0, p0, Li1;->h:Lj1;

    iget-object v0, v0, Lj1;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 1
    iget-object v0, p0, Li1;->h:Lj1;

    iget-object v0, v0, Lj1;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public m(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Li1;->h:Lj1;

    iget-object v0, v0, Lj1;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public n(I)V
    .locals 1

    iget-object v0, p0, Li1;->h:Lj1;

    iget-object v0, v0, Lj1;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 1
    iget-object v0, p0, Li1;->h:Lj1;

    iget-object v0, v0, Lj1;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public o(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Li1;->h:Lj1;

    iget-object v0, v0, Lj1;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public p(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Ld2;->c:Z

    .line 2
    iget-object v0, p0, Li1;->h:Lj1;

    iget-object v0, v0, Lj1;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitleOptional(Z)V

    return-void
.end method
