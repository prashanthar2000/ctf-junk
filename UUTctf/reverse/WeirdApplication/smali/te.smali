.class public Lte;
.super Loe;
.source ""


# instance fields
.field public a:Lm7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm7<",
            "Lqe;",
            "Lse;",
            ">;"
        }
    .end annotation
.end field

.field public b:Loe$b;

.field public final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lre;",
            ">;"
        }
    .end annotation
.end field

.field public d:I

.field public e:Z

.field public f:Z

.field public g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Loe$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lre;)V
    .locals 1

    invoke-direct {p0}, Loe;-><init>()V

    new-instance v0, Lm7;

    invoke-direct {v0}, Lm7;-><init>()V

    iput-object v0, p0, Lte;->a:Lm7;

    const/4 v0, 0x0

    iput v0, p0, Lte;->d:I

    iput-boolean v0, p0, Lte;->e:Z

    iput-boolean v0, p0, Lte;->f:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lte;->g:Ljava/util/ArrayList;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lte;->c:Ljava/lang/ref/WeakReference;

    sget-object p1, Loe$b;->c:Loe$b;

    iput-object p1, p0, Lte;->b:Loe$b;

    return-void
.end method

.method public static d(Loe$a;)Loe$b;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_3

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    sget-object p0, Loe$b;->b:Loe$b;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected event value "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Loe$b;->f:Loe$b;

    return-object p0

    :cond_2
    sget-object p0, Loe$b;->e:Loe$b;

    return-object p0

    :cond_3
    sget-object p0, Loe$b;->d:Loe$b;

    return-object p0
.end method

.method public static f(Loe$b;Loe$b;)Loe$b;
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-gez v0, :cond_0

    move-object p0, p1

    :cond_0
    return-object p0
.end method

.method public static j(Loe$b;)Loe$a;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected state value "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Loe$a;->ON_RESUME:Loe$a;

    return-object p0

    :cond_2
    sget-object p0, Loe$a;->ON_START:Loe$a;

    return-object p0

    :cond_3
    sget-object p0, Loe$a;->ON_CREATE:Loe$a;

    return-object p0
.end method


# virtual methods
.method public a(Lqe;)V
    .locals 6

    iget-object v0, p0, Lte;->b:Loe$b;

    sget-object v1, Loe$b;->b:Loe$b;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Loe$b;->c:Loe$b;

    :goto_0
    new-instance v0, Lse;

    invoke-direct {v0, p1, v1}, Lse;-><init>(Lqe;Loe$b;)V

    iget-object v1, p0, Lte;->a:Lm7;

    .line 1
    iget-object v2, v1, Lm7;->f:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp7;

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    .line 2
    iget-object v1, v2, Lp7;->c:Ljava/lang/Object;

    goto :goto_2

    :cond_1
    iget-object v2, v1, Lm7;->f:Ljava/util/HashMap;

    .line 3
    new-instance v4, Lp7;

    invoke-direct {v4, p1, v0}, Lp7;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget v5, v1, Lq7;->e:I

    add-int/2addr v5, v3

    iput v5, v1, Lq7;->e:I

    iget-object v5, v1, Lq7;->c:Lp7;

    if-nez v5, :cond_2

    iput-object v4, v1, Lq7;->b:Lp7;

    goto :goto_1

    :cond_2
    iput-object v4, v5, Lp7;->d:Lp7;

    iput-object v5, v4, Lp7;->e:Lp7;

    :goto_1
    iput-object v4, v1, Lq7;->c:Lp7;

    .line 4
    invoke-virtual {v2, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    .line 5
    :goto_2
    check-cast v1, Lse;

    if-eqz v1, :cond_3

    return-void

    :cond_3
    iget-object v1, p0, Lte;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lre;

    if-nez v1, :cond_4

    return-void

    :cond_4
    iget v2, p0, Lte;->d:I

    if-nez v2, :cond_6

    iget-boolean v2, p0, Lte;->e:Z

    if-eqz v2, :cond_5

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    goto :goto_4

    :cond_6
    :goto_3
    const/4 v2, 0x1

    :goto_4
    invoke-virtual {p0, p1}, Lte;->c(Lqe;)Loe$b;

    move-result-object v4

    iget v5, p0, Lte;->d:I

    add-int/2addr v5, v3

    iput v5, p0, Lte;->d:I

    :goto_5
    iget-object v5, v0, Lse;->a:Loe$b;

    invoke-virtual {v5, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-gez v4, :cond_7

    iget-object v4, p0, Lte;->a:Lm7;

    .line 6
    iget-object v4, v4, Lm7;->f:Ljava/util/HashMap;

    invoke-virtual {v4, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 7
    iget-object v4, v0, Lse;->a:Loe$b;

    .line 8
    iget-object v5, p0, Lte;->g:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    iget-object v4, v0, Lse;->a:Loe$b;

    invoke-static {v4}, Lte;->j(Loe$b;)Loe$a;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lse;->a(Lre;Loe$a;)V

    invoke-virtual {p0}, Lte;->h()V

    invoke-virtual {p0, p1}, Lte;->c(Lqe;)Loe$b;

    move-result-object v4

    goto :goto_5

    :cond_7
    if-nez v2, :cond_8

    invoke-virtual {p0}, Lte;->i()V

    :cond_8
    iget p1, p0, Lte;->d:I

    sub-int/2addr p1, v3

    iput p1, p0, Lte;->d:I

    return-void
.end method

.method public b(Lqe;)V
    .locals 5

    iget-object v0, p0, Lte;->a:Lm7;

    .line 1
    iget-object v1, v0, Lm7;->f:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp7;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    goto :goto_3

    .line 2
    :cond_0
    iget v3, v0, Lq7;->e:I

    add-int/lit8 v3, v3, -0x1

    iput v3, v0, Lq7;->e:I

    iget-object v3, v0, Lq7;->d:Ljava/util/WeakHashMap;

    invoke-virtual {v3}, Ljava/util/WeakHashMap;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, v0, Lq7;->d:Ljava/util/WeakHashMap;

    invoke-virtual {v3}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ls7;

    invoke-interface {v4, v1}, Ls7;->a(Lp7;)V

    goto :goto_0

    :cond_1
    iget-object v3, v1, Lp7;->e:Lp7;

    if-eqz v3, :cond_2

    iget-object v4, v1, Lp7;->d:Lp7;

    iput-object v4, v3, Lp7;->d:Lp7;

    goto :goto_1

    :cond_2
    iget-object v3, v1, Lp7;->d:Lp7;

    iput-object v3, v0, Lq7;->b:Lp7;

    :goto_1
    iget-object v3, v1, Lp7;->d:Lp7;

    if-eqz v3, :cond_3

    iget-object v4, v1, Lp7;->e:Lp7;

    iput-object v4, v3, Lp7;->e:Lp7;

    goto :goto_2

    :cond_3
    iget-object v3, v1, Lp7;->e:Lp7;

    iput-object v3, v0, Lq7;->c:Lp7;

    :goto_2
    iput-object v2, v1, Lp7;->d:Lp7;

    iput-object v2, v1, Lp7;->e:Lp7;

    .line 3
    :goto_3
    iget-object v0, v0, Lm7;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final c(Lqe;)Loe$b;
    .locals 3

    iget-object v0, p0, Lte;->a:Lm7;

    .line 1
    iget-object v1, v0, Lm7;->f:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 2
    iget-object v0, v0, Lm7;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp7;

    iget-object p1, p1, Lp7;->e:Lp7;

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_1

    .line 3
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lse;

    iget-object p1, p1, Lse;->a:Loe$b;

    goto :goto_1

    :cond_1
    move-object p1, v2

    :goto_1
    iget-object v0, p0, Lte;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lte;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Loe$b;

    :cond_2
    iget-object v0, p0, Lte;->b:Loe$b;

    invoke-static {v0, p1}, Lte;->f(Loe$b;Loe$b;)Loe$b;

    move-result-object p1

    invoke-static {p1, v2}, Lte;->f(Loe$b;Loe$b;)Loe$b;

    move-result-object p1

    return-object p1
.end method

.method public e(Loe$a;)V
    .locals 0

    invoke-static {p1}, Lte;->d(Loe$a;)Loe$b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lte;->g(Loe$b;)V

    return-void
.end method

.method public final g(Loe$b;)V
    .locals 1

    iget-object v0, p0, Lte;->b:Loe$b;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lte;->b:Loe$b;

    iget-boolean p1, p0, Lte;->e:Z

    const/4 v0, 0x1

    if-nez p1, :cond_2

    iget p1, p0, Lte;->d:I

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iput-boolean v0, p0, Lte;->e:Z

    invoke-virtual {p0}, Lte;->i()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lte;->e:Z

    return-void

    :cond_2
    :goto_0
    iput-boolean v0, p0, Lte;->f:Z

    return-void
.end method

.method public final h()V
    .locals 2

    iget-object v0, p0, Lte;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method public final i()V
    .locals 8

    iget-object v0, p0, Lte;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lre;

    if-eqz v0, :cond_c

    .line 1
    :cond_0
    iget-object v1, p0, Lte;->a:Lm7;

    .line 2
    iget v2, v1, Lq7;->e:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    iget-object v2, v1, Lq7;->b:Lp7;

    .line 4
    iget-object v2, v2, Lp7;->c:Ljava/lang/Object;

    .line 5
    check-cast v2, Lse;

    iget-object v2, v2, Lse;->a:Loe$b;

    .line 6
    iget-object v1, v1, Lq7;->c:Lp7;

    .line 7
    iget-object v1, v1, Lp7;->c:Ljava/lang/Object;

    .line 8
    check-cast v1, Lse;

    iget-object v1, v1, Lse;->a:Loe$b;

    if-ne v2, v1, :cond_2

    iget-object v2, p0, Lte;->b:Loe$b;

    if-ne v2, v1, :cond_2

    :goto_0
    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    .line 9
    :goto_1
    iput-boolean v3, p0, Lte;->f:Z

    if-nez v1, :cond_b

    iget-object v1, p0, Lte;->b:Loe$b;

    iget-object v2, p0, Lte;->a:Lm7;

    .line 10
    iget-object v2, v2, Lq7;->b:Lp7;

    .line 11
    iget-object v2, v2, Lp7;->c:Ljava/lang/Object;

    .line 12
    check-cast v2, Lse;

    iget-object v2, v2, Lse;->a:Loe$b;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-gez v1, :cond_9

    .line 13
    iget-object v1, p0, Lte;->a:Lm7;

    .line 14
    new-instance v2, Lo7;

    iget-object v3, v1, Lq7;->c:Lp7;

    iget-object v5, v1, Lq7;->b:Lp7;

    invoke-direct {v2, v3, v5}, Lo7;-><init>(Lp7;Lp7;)V

    iget-object v1, v1, Lq7;->d:Ljava/util/WeakHashMap;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    :cond_3
    invoke-virtual {v2}, Lr7;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    iget-boolean v1, p0, Lte;->f:Z

    if-nez v1, :cond_9

    invoke-virtual {v2}, Lr7;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lse;

    :goto_2
    iget-object v5, v3, Lse;->a:Loe$b;

    iget-object v6, p0, Lte;->b:Loe$b;

    invoke-virtual {v5, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v5

    if-lez v5, :cond_3

    iget-boolean v5, p0, Lte;->f:Z

    if-nez v5, :cond_3

    iget-object v5, p0, Lte;->a:Lm7;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6}, Lm7;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v5, v3, Lse;->a:Loe$b;

    .line 16
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eqz v6, :cond_8

    if-eq v6, v4, :cond_7

    const/4 v7, 0x2

    if-eq v6, v7, :cond_6

    const/4 v7, 0x3

    if-eq v6, v7, :cond_5

    const/4 v7, 0x4

    if-ne v6, v7, :cond_4

    sget-object v5, Loe$a;->ON_PAUSE:Loe$a;

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected state value "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    sget-object v5, Loe$a;->ON_STOP:Loe$a;

    goto :goto_3

    :cond_6
    sget-object v5, Loe$a;->ON_DESTROY:Loe$a;

    .line 17
    :goto_3
    invoke-static {v5}, Lte;->d(Loe$a;)Loe$b;

    move-result-object v6

    .line 18
    iget-object v7, p0, Lte;->g:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    invoke-virtual {v3, v0, v5}, Lse;->a(Lre;Loe$a;)V

    invoke-virtual {p0}, Lte;->h()V

    goto :goto_2

    .line 20
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 21
    :cond_9
    iget-object v1, p0, Lte;->a:Lm7;

    .line 22
    iget-object v1, v1, Lq7;->c:Lp7;

    .line 23
    iget-boolean v2, p0, Lte;->f:Z

    if-nez v2, :cond_0

    if-eqz v1, :cond_0

    iget-object v2, p0, Lte;->b:Loe$b;

    .line 24
    iget-object v1, v1, Lp7;->c:Ljava/lang/Object;

    .line 25
    check-cast v1, Lse;

    iget-object v1, v1, Lse;->a:Loe$b;

    invoke-virtual {v2, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-lez v1, :cond_0

    .line 26
    iget-object v1, p0, Lte;->a:Lm7;

    .line 27
    new-instance v2, Lq7$a;

    invoke-direct {v2, v1}, Lq7$a;-><init>(Lq7;)V

    iget-object v1, v1, Lq7;->d:Ljava/util/WeakHashMap;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    :cond_a
    invoke-virtual {v2}, Lq7$a;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lte;->f:Z

    if-nez v1, :cond_0

    invoke-virtual {v2}, Lq7$a;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lse;

    :goto_4
    iget-object v4, v3, Lse;->a:Loe$b;

    iget-object v5, p0, Lte;->b:Loe$b;

    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-gez v4, :cond_a

    iget-boolean v4, p0, Lte;->f:Z

    if-nez v4, :cond_a

    iget-object v4, p0, Lte;->a:Lm7;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, Lm7;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    iget-object v4, v3, Lse;->a:Loe$b;

    .line 29
    iget-object v5, p0, Lte;->g:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    iget-object v4, v3, Lse;->a:Loe$b;

    invoke-static {v4}, Lte;->j(Loe$b;)Loe$a;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Lse;->a(Lre;Loe$a;)V

    invoke-virtual {p0}, Lte;->h()V

    goto :goto_4

    :cond_b
    return-void

    .line 31
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_6

    :goto_5
    throw v0

    :goto_6
    goto :goto_5
.end method
