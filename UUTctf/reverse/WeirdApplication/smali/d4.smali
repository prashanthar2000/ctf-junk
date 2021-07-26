.class public Ld4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm3$a;


# instance fields
.field public final synthetic b:Le4;


# direct methods
.method public constructor <init>(Le4;)V
    .locals 0

    iput-object p1, p0, Ld4;->b:Le4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lz2;Z)V
    .locals 2

    instance-of v0, p1, Lt3;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lz2;->k()Lz2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lz2;->c(Z)V

    :cond_0
    iget-object v0, p0, Ld4;->b:Le4;

    .line 1
    iget-object v0, v0, Le4;->f:Lm3$a;

    if-eqz v0, :cond_1

    .line 2
    invoke-interface {v0, p1, p2}, Lm3$a;->b(Lz2;Z)V

    :cond_1
    return-void
.end method

.method public c(Lz2;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Ld4;->b:Le4;

    move-object v2, p1

    check-cast v2, Lt3;

    .line 1
    iget-object v2, v2, Lt3;->B:Lc3;

    .line 2
    iget v2, v2, Lc3;->a:I

    .line 3
    iput v2, v1, Le4;->z:I

    .line 4
    iget-object v1, v1, Le4;->f:Lm3$a;

    if-eqz v1, :cond_1

    .line 5
    invoke-interface {v1, p1}, Lm3$a;->c(Lz2;)Z

    move-result v0

    :cond_1
    return v0
.end method
