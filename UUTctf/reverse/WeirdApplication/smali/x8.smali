.class public Lx8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lw8;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo8;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx8;->e:Ljava/util/ArrayList;

    .line 1
    iget v0, p1, Lo8;->I:I

    .line 2
    iput v0, p0, Lx8;->a:I

    .line 3
    iget v0, p1, Lo8;->J:I

    .line 4
    iput v0, p0, Lx8;->b:I

    invoke-virtual {p1}, Lo8;->n()I

    move-result v0

    iput v0, p0, Lx8;->c:I

    invoke-virtual {p1}, Lo8;->h()I

    move-result v0

    iput v0, p0, Lx8;->d:I

    .line 5
    iget-object p1, p1, Lo8;->B:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln8;

    iget-object v3, p0, Lx8;->e:Ljava/util/ArrayList;

    new-instance v4, Lw8;

    invoke-direct {v4, v2}, Lw8;-><init>(Ln8;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
