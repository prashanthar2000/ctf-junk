.class public Lv7;
.super La8;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La8<",
        "TE;TE;>;"
    }
.end annotation


# instance fields
.field public final synthetic d:Lw7;


# direct methods
.method public constructor <init>(Lw7;)V
    .locals 0

    iput-object p1, p0, Lv7;->d:Lw7;

    invoke-direct {p0}, La8;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lv7;->d:Lw7;

    invoke-virtual {v0}, Lw7;->clear()V

    return-void
.end method

.method public b(II)Ljava/lang/Object;
    .locals 0

    iget-object p2, p0, Lv7;->d:Lw7;

    iget-object p2, p2, Lw7;->c:[Ljava/lang/Object;

    aget-object p1, p2, p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TE;TE;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "not a map"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lv7;->d:Lw7;

    iget v0, v0, Lw7;->d:I

    return v0
.end method

.method public e(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lv7;->d:Lw7;

    invoke-virtual {v0, p1}, Lw7;->c(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public f(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lv7;->d:Lw7;

    invoke-virtual {v0, p1}, Lw7;->c(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public g(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;TE;)V"
        }
    .end annotation

    iget-object p2, p0, Lv7;->d:Lw7;

    invoke-virtual {p2, p1}, Lw7;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public h(I)V
    .locals 1

    iget-object v0, p0, Lv7;->d:Lw7;

    invoke-virtual {v0, p1}, Lw7;->f(I)Ljava/lang/Object;

    return-void
.end method

.method public i(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "not a map"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
