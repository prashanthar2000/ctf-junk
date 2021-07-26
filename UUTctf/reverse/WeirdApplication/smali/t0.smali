.class public abstract Lt0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Landroid/content/BroadcastReceiver;

.field public final synthetic b:Ly0;


# direct methods
.method public constructor <init>(Ly0;)V
    .locals 0

    iput-object p1, p0, Lt0;->b:Ly0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lt0;->a:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v1, p0, Lt0;->b:Ly0;

    iget-object v1, v1, Ly0;->e:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x0

    iput-object v0, p0, Lt0;->a:Landroid/content/BroadcastReceiver;

    :cond_0
    return-void
.end method

.method public abstract b()Landroid/content/IntentFilter;
.end method

.method public abstract c()I
.end method

.method public abstract d()V
.end method

.method public e()V
    .locals 3

    invoke-virtual {p0}, Lt0;->a()V

    invoke-virtual {p0}, Lt0;->b()Landroid/content/IntentFilter;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/content/IntentFilter;->countActions()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lt0;->a:Landroid/content/BroadcastReceiver;

    if-nez v1, :cond_1

    new-instance v1, Ls0;

    invoke-direct {v1, p0}, Ls0;-><init>(Lt0;)V

    iput-object v1, p0, Lt0;->a:Landroid/content/BroadcastReceiver;

    :cond_1
    iget-object v1, p0, Lt0;->b:Ly0;

    iget-object v1, v1, Ly0;->e:Landroid/content/Context;

    iget-object v2, p0, Lt0;->a:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_2
    :goto_0
    return-void
.end method
