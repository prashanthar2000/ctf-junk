.class public Lcb;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/util/concurrent/Callable;

.field public final synthetic c:Landroid/os/Handler;

.field public final synthetic d:Leb;


# direct methods
.method public constructor <init>(Lfb;Ljava/util/concurrent/Callable;Landroid/os/Handler;Leb;)V
    .locals 0

    iput-object p2, p0, Lcb;->b:Ljava/util/concurrent/Callable;

    iput-object p3, p0, Lcb;->c:Landroid/os/Handler;

    iput-object p4, p0, Lcb;->d:Leb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcb;->b:Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcb;->c:Landroid/os/Handler;

    new-instance v2, Lbb;

    invoke-direct {v2, p0, v0}, Lbb;-><init>(Lcb;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
