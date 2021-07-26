.class public abstract Lnd;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lnd;"
    }
.end annotation


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Landroid/os/Handler;

.field public final d:Lud;


# direct methods
.method public constructor <init>(Lc0;)V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v1, Lud;

    invoke-direct {v1}, Lud;-><init>()V

    iput-object v1, p0, Lnd;->d:Lud;

    const-string v1, "context == null"

    invoke-static {p1, v1}, Lb1;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnd;->b:Landroid/content/Context;

    const-string p1, "handler == null"

    invoke-static {v0, p1}, Lb1;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Lnd;->c:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public abstract a()Z
.end method
