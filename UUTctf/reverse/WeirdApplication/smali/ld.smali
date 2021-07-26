.class public Lld;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lnd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnd<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnd;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnd<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lld;->a:Lnd;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object p1, p0, Lld;->a:Lnd;

    iget-object p1, p1, Lnd;->d:Lud;

    .line 1
    iget-object p1, p1, Lud;->g:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljd;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    throw p1

    :cond_1
    return-void
.end method

.method public b()V
    .locals 4

    iget-object v0, p0, Lld;->a:Lnd;

    iget-object v0, v0, Lnd;->d:Lud;

    const/4 v1, 0x0

    .line 1
    iput-boolean v1, v0, Lud;->u:Z

    iput-boolean v1, v0, Lud;->v:Z

    iget-object v2, v0, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_1

    iget-object v3, v0, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljd;

    if-nez v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    throw v0

    :cond_1
    return-void
.end method
