.class public final Ln0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm3$a;


# instance fields
.field public final synthetic b:Ly0;


# direct methods
.method public constructor <init>(Ly0;)V
    .locals 0

    iput-object p1, p0, Ln0;->b:Ly0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lz2;Z)V
    .locals 0

    iget-object p2, p0, Ln0;->b:Ly0;

    invoke-virtual {p2, p1}, Ly0;->t(Lz2;)V

    return-void
.end method

.method public c(Lz2;)Z
    .locals 2

    iget-object v0, p0, Ln0;->b:Ly0;

    invoke-virtual {v0}, Ly0;->D()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
