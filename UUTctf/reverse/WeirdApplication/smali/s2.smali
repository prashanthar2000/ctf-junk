.class public Ls2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lu2;

.field public final synthetic c:Landroid/view/MenuItem;

.field public final synthetic d:Lz2;

.field public final synthetic e:Lt2;


# direct methods
.method public constructor <init>(Lt2;Lu2;Landroid/view/MenuItem;Lz2;)V
    .locals 0

    iput-object p1, p0, Ls2;->e:Lt2;

    iput-object p2, p0, Ls2;->b:Lu2;

    iput-object p3, p0, Ls2;->c:Landroid/view/MenuItem;

    iput-object p4, p0, Ls2;->d:Lz2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Ls2;->b:Lu2;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ls2;->e:Lt2;

    iget-object v1, v1, Lt2;->b:Lv2;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lv2;->B:Z

    iget-object v0, v0, Lu2;->b:Lz2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lz2;->c(Z)V

    iget-object v0, p0, Ls2;->e:Lt2;

    iget-object v0, v0, Lt2;->b:Lv2;

    iput-boolean v1, v0, Lv2;->B:Z

    :cond_0
    iget-object v0, p0, Ls2;->c:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ls2;->c:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->hasSubMenu()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ls2;->d:Lz2;

    iget-object v1, p0, Ls2;->c:Landroid/view/MenuItem;

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Lz2;->r(Landroid/view/MenuItem;I)Z

    :cond_1
    return-void
.end method
