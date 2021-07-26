.class public final Lx0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm3$a;


# instance fields
.field public final synthetic b:Ly0;


# direct methods
.method public constructor <init>(Ly0;)V
    .locals 0

    iput-object p1, p0, Lx0;->b:Ly0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lz2;Z)V
    .locals 4

    invoke-virtual {p1}, Lz2;->k()Lz2;

    move-result-object v0

    const/4 v1, 0x1

    if-eq v0, p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lx0;->b:Ly0;

    if-eqz v2, :cond_1

    move-object p1, v0

    :cond_1
    invoke-virtual {v3, p1}, Ly0;->A(Landroid/view/Menu;)Lw0;

    move-result-object p1

    if-eqz p1, :cond_3

    if-eqz v2, :cond_2

    iget-object p2, p0, Lx0;->b:Ly0;

    iget v2, p1, Lw0;->a:I

    invoke-virtual {p2, v2, p1, v0}, Ly0;->s(ILw0;Landroid/view/Menu;)V

    iget-object p2, p0, Lx0;->b:Ly0;

    invoke-virtual {p2, p1, v1}, Ly0;->u(Lw0;Z)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lx0;->b:Ly0;

    invoke-virtual {v0, p1, p2}, Ly0;->u(Lw0;Z)V

    :cond_3
    :goto_1
    return-void
.end method

.method public c(Lz2;)Z
    .locals 2

    if-nez p1, :cond_0

    iget-object v0, p0, Lx0;->b:Ly0;

    iget-boolean v1, v0, Ly0;->A:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ly0;->D()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lx0;->b:Ly0;

    iget-boolean v1, v1, Ly0;->M:Z

    if-nez v1, :cond_0

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
