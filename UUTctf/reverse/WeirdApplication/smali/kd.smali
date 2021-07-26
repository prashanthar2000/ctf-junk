.class public Lkd;
.super Lnd;
.source ""

# interfaces
.implements Ldf;
.implements Le;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnd<",
        "Lc0;",
        ">;",
        "Ldf;",
        "Le;"
    }
.end annotation


# instance fields
.field public final synthetic e:Lc0;


# direct methods
.method public constructor <init>(Lc0;)V
    .locals 0

    iput-object p1, p0, Lkd;->e:Lc0;

    invoke-direct {p0, p1}, Lnd;-><init>(Lc0;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lkd;->e:Lc0;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()Landroidx/activity/OnBackPressedDispatcher;
    .locals 1

    iget-object v0, p0, Lkd;->e:Lc0;

    .line 1
    iget-object v0, v0, Landroidx/activity/ComponentActivity;->f:Landroidx/activity/OnBackPressedDispatcher;

    return-object v0
.end method

.method public c()Lcf;
    .locals 1

    iget-object v0, p0, Lkd;->e:Lc0;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->c()Lcf;

    move-result-object v0

    return-object v0
.end method

.method public e()Loe;
    .locals 1

    iget-object v0, p0, Lkd;->e:Lc0;

    iget-object v0, v0, Lc0;->h:Lte;

    return-object v0
.end method
