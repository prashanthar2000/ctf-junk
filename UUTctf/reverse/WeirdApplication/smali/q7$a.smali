.class public Lq7$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;
.implements Ls7;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
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

.field public c:Z

.field public final synthetic d:Lq7;


# direct methods
.method public constructor <init>(Lq7;)V
    .locals 0

    iput-object p1, p0, Lq7$a;->d:Lq7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lq7$a;->c:Z

    return-void
.end method


# virtual methods
.method public a(Lp7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp7<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lq7$a;->b:Lp7;

    if-ne p1, v0, :cond_1

    iget-object p1, v0, Lp7;->e:Lp7;

    iput-object p1, p0, Lq7$a;->b:Lp7;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lq7$a;->c:Z

    :cond_1
    return-void
.end method

.method public hasNext()Z
    .locals 3

    iget-boolean v0, p0, Lq7$a;->c:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lq7$a;->d:Lq7;

    iget-object v0, v0, Lq7;->b:Lp7;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_1
    iget-object v0, p0, Lq7$a;->b:Lp7;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lp7;->d:Lp7;

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq7$a;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lq7$a;->c:Z

    iget-object v0, p0, Lq7$a;->d:Lq7;

    iget-object v0, v0, Lq7;->b:Lp7;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lq7$a;->b:Lp7;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lp7;->d:Lp7;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lq7$a;->b:Lp7;

    return-object v0
.end method
