.class final Ldh$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/os/Handler;

.field final synthetic a:Ldh$a;

.field final synthetic a:Ldh;

.field final synthetic a:Ljava/util/concurrent/Callable;


# direct methods
.method constructor <init>(Ldh;Ljava/util/concurrent/Callable;Landroid/os/Handler;Ldh$a;)V
    .locals 0

    iput-object p1, p0, Ldh$2;->a:Ldh;

    iput-object p2, p0, Ldh$2;->a:Ljava/util/concurrent/Callable;

    iput-object p3, p0, Ldh$2;->a:Landroid/os/Handler;

    iput-object p4, p0, Ldh$2;->a:Ldh$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Ldh$2;->a:Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ldh$2;->a:Landroid/os/Handler;

    new-instance v2, Ldh$2$1;

    invoke-direct {v2, p0, v0}, Ldh$2$1;-><init>(Ldh$2;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method