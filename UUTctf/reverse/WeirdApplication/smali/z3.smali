.class public Lz3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public b:Lc4;

.field public final synthetic c:Le4;


# direct methods
.method public constructor <init>(Le4;Lc4;)V
    .locals 0

    iput-object p1, p0, Lz3;->c:Le4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lz3;->b:Lc4;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lz3;->c:Le4;

    .line 1
    iget-object v0, v0, Le4;->d:Lz2;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, v0, Lz2;->e:Lz2$a;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lz2$a;->a(Lz2;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lz3;->c:Le4;

    .line 4
    iget-object v0, v0, Le4;->i:Ln3;

    .line 5
    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lz3;->b:Lc4;

    invoke-virtual {v0}, Ll3;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lz3;->c:Le4;

    iget-object v1, p0, Lz3;->b:Lc4;

    iput-object v1, v0, Le4;->u:Lc4;

    :cond_1
    iget-object v0, p0, Lz3;->c:Le4;

    const/4 v1, 0x0

    iput-object v1, v0, Le4;->w:Lz3;

    return-void
.end method
