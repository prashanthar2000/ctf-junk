.class public Lp0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc2;


# instance fields
.field public a:Lc2;

.field public final synthetic b:Ly0;


# direct methods
.method public constructor <init>(Ly0;Lc2;)V
    .locals 0

    iput-object p1, p0, Lp0;->b:Ly0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lp0;->a:Lc2;

    return-void
.end method


# virtual methods
.method public a(Ld2;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lp0;->a:Lc2;

    invoke-interface {v0, p1, p2}, Lc2;->a(Ld2;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public b(Ld2;)V
    .locals 2

    iget-object v0, p0, Lp0;->a:Lc2;

    invoke-interface {v0, p1}, Lc2;->b(Ld2;)V

    iget-object p1, p0, Lp0;->b:Ly0;

    iget-object v0, p1, Ly0;->q:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object p1, p1, Ly0;->f:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lp0;->b:Ly0;

    iget-object v0, v0, Ly0;->r:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object p1, p0, Lp0;->b:Ly0;

    iget-object v0, p1, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ly0;->x()V

    iget-object p1, p0, Lp0;->b:Ly0;

    iget-object v0, p1, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, Lbc;->a(Landroid/view/View;)Lgc;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lgc;->a(F)Lgc;

    iput-object v0, p1, Ly0;->s:Lgc;

    iget-object p1, p0, Lp0;->b:Ly0;

    iget-object p1, p1, Ly0;->s:Lgc;

    new-instance v0, Lo0;

    invoke-direct {v0, p0}, Lo0;-><init>(Lp0;)V

    invoke-virtual {p1, v0}, Lgc;->d(Lhc;)Lgc;

    :cond_1
    iget-object p1, p0, Lp0;->b:Ly0;

    iget-object v0, p1, Ly0;->h:Ld0;

    if-eqz v0, :cond_2

    iget-object p1, p1, Ly0;->o:Ld2;

    invoke-interface {v0, p1}, Ld0;->d(Ld2;)V

    :cond_2
    iget-object p1, p0, Lp0;->b:Ly0;

    const/4 v0, 0x0

    iput-object v0, p1, Ly0;->o:Ld2;

    return-void
.end method

.method public c(Ld2;Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Lp0;->a:Lc2;

    invoke-interface {v0, p1, p2}, Lc2;->c(Ld2;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public d(Ld2;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lp0;->a:Lc2;

    invoke-interface {v0, p1, p2}, Lc2;->d(Ld2;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method
