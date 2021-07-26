.class public Lf1;
.super Lic;
.source ""


# instance fields
.field public final synthetic a:Lj1;


# direct methods
.method public constructor <init>(Lj1;)V
    .locals 0

    iput-object p1, p0, Lf1;->a:Lj1;

    invoke-direct {p0}, Lic;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, Lf1;->a:Lj1;

    iget-boolean v0, p1, Lj1;->p:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Lj1;->g:Landroid/view/View;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object p1, p0, Lf1;->a:Lj1;

    iget-object p1, p1, Lj1;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    :cond_0
    iget-object p1, p0, Lf1;->a:Lj1;

    iget-object p1, p1, Lj1;->d:Landroidx/appcompat/widget/ActionBarContainer;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    iget-object p1, p0, Lf1;->a:Lj1;

    iget-object p1, p1, Lj1;->d:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    iget-object p1, p0, Lf1;->a:Lj1;

    const/4 v0, 0x0

    iput-object v0, p1, Lj1;->u:Ln2;

    .line 1
    iget-object v1, p1, Lj1;->k:Lc2;

    if-eqz v1, :cond_1

    iget-object v2, p1, Lj1;->j:Ld2;

    invoke-interface {v1, v2}, Lc2;->b(Ld2;)V

    iput-object v0, p1, Lj1;->j:Ld2;

    iput-object v0, p1, Lj1;->k:Lc2;

    .line 2
    :cond_1
    iget-object p1, p0, Lf1;->a:Lj1;

    iget-object p1, p1, Lj1;->c:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz p1, :cond_2

    invoke-static {p1}, Lbc;->p(Landroid/view/View;)V

    :cond_2
    return-void
.end method
