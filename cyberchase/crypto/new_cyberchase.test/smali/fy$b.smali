.class final Lfy$b;
.super Ljava/lang/Object;

# interfaces
.implements Lgz$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lfy;


# direct methods
.method constructor <init>(Lfy;)V
    .locals 0

    iput-object p1, p0, Lfy$b;->a:Lfy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgz;)V
    .locals 4

    iget-object v0, p0, Lfy$b;->a:Lfy;

    iget-object v0, v0, Lfy;->a:Landroid/view/Window$Callback;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lfy$b;->a:Lfy;

    iget-object v0, v0, Lfy;->a:Lic;

    invoke-interface {v0}, Lic;->c()Z

    move-result v0

    const/16 v1, 0x6c

    if-eqz v0, :cond_0

    iget-object v0, p0, Lfy$b;->a:Lfy;

    iget-object v0, v0, Lfy;->a:Landroid/view/Window$Callback;

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    return-void

    :cond_0
    iget-object v0, p0, Lfy$b;->a:Lfy;

    iget-object v0, v0, Lfy;->a:Landroid/view/Window$Callback;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3, p1}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lfy$b;->a:Lfy;

    iget-object v0, v0, Lfy;->a:Landroid/view/Window$Callback;

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_1
    return-void
.end method

.method public final a(Lgz;Landroid/view/MenuItem;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
