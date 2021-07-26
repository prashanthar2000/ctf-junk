.class public abstract Lr7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;
.implements Ls7;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;",
        "Ls7<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public b:Lp7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp7<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public c:Lp7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp7<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lp7;Lp7;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp7<",
            "TK;TV;>;",
            "Lp7<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lr7;->b:Lp7;

    iput-object p1, p0, Lr7;->c:Lp7;

    return-void
.end method


# virtual methods
.method public a(Lp7;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp7<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lr7;->b:Lp7;

    const/4 v1, 0x0

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Lr7;->c:Lp7;

    if-ne p1, v0, :cond_0

    iput-object v1, p0, Lr7;->c:Lp7;

    iput-object v1, p0, Lr7;->b:Lp7;

    :cond_0
    iget-object v0, p0, Lr7;->b:Lp7;

    if-ne v0, p1, :cond_1

    invoke-virtual {p0, v0}, Lr7;->b(Lp7;)Lp7;

    move-result-object v0

    iput-object v0, p0, Lr7;->b:Lp7;

    :cond_1
    iget-object v0, p0, Lr7;->c:Lp7;

    if-ne v0, p1, :cond_4

    .line 1
    iget-object p1, p0, Lr7;->b:Lp7;

    if-eq v0, p1, :cond_3

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0}, Lr7;->c(Lp7;)Lp7;

    move-result-object v1

    .line 2
    :cond_3
    :goto_0
    iput-object v1, p0, Lr7;->c:Lp7;

    :cond_4
    return-void
.end method

.method public abstract b(Lp7;)Lp7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp7<",
            "TK;TV;>;)",
            "Lp7<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method public abstract c(Lp7;)Lp7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp7<",
            "TK;TV;>;)",
            "Lp7<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Lr7;->c:Lp7;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lr7;->c:Lp7;

    .line 2
    iget-object v1, p0, Lr7;->b:Lp7;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lr7;->c(Lp7;)Lp7;

    move-result-object v1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 3
    :goto_1
    iput-object v1, p0, Lr7;->c:Lp7;

    return-object v0
.end method
