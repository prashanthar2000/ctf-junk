.class public Ly9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lm5;


# direct methods
.method public constructor <init>(Lm5;I)V
    .locals 0

    iput-object p1, p0, Ly9;->c:Lm5;

    iput p2, p0, Ly9;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Ly9;->c:Lm5;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1
    throw v0
.end method
