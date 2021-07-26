.class public Lq8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo8;",
            ">;"
        }
    .end annotation
.end field

.field public b:I

.field public c:I

.field public d:Z

.field public final e:[I

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo8;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo8;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lo8;",
            ">;"
        }
    .end annotation
.end field

.field public i:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lo8;",
            ">;"
        }
    .end annotation
.end field

.field public j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo8;",
            ">;"
        }
    .end annotation
.end field

.field public k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo8;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lo8;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lq8;->b:I

    iput v0, p0, Lq8;->c:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lq8;->d:Z

    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lq8;->e:[I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lq8;->f:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lq8;->g:Ljava/util/List;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lq8;->h:Ljava/util/HashSet;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lq8;->i:Ljava/util/HashSet;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lq8;->j:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lq8;->k:Ljava/util/List;

    iput-object p1, p0, Lq8;->a:Ljava/util/List;

    return-void

    :array_0
    .array-data 4
        -0x1
        -0x1
    .end array-data
.end method

.method public constructor <init>(Ljava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lo8;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lq8;->b:I

    iput v0, p0, Lq8;->c:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lq8;->d:Z

    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lq8;->e:[I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lq8;->f:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lq8;->g:Ljava/util/List;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lq8;->h:Ljava/util/HashSet;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lq8;->i:Ljava/util/HashSet;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lq8;->j:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lq8;->k:Ljava/util/List;

    iput-object p1, p0, Lq8;->a:Ljava/util/List;

    iput-boolean p2, p0, Lq8;->d:Z

    return-void

    :array_0
    .array-data 4
        -0x1
        -0x1
    .end array-data
.end method


# virtual methods
.method public a(Lo8;I)V
    .locals 1

    if-nez p2, :cond_0

    iget-object p2, p0, Lq8;->h:Ljava/util/HashSet;

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    iget-object p2, p0, Lq8;->i:Ljava/util/HashSet;

    :goto_0
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public final b(Ljava/util/ArrayList;Lo8;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lo8;",
            ">;",
            "Lo8;",
            ")V"
        }
    .end annotation

    iget-boolean v0, p2, Lo8;->d0:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    iput-boolean v0, p2, Lo8;->d0:Z

    invoke-virtual {p2}, Lo8;->q()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    instance-of v0, p2, Ll8;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    move-object v0, p2

    check-cast v0, Ll8;

    iget v2, v0, Ll8;->k0:I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    iget-object v4, v0, Ll8;->j0:[Lo8;

    aget-object v4, v4, v3

    invoke-virtual {p0, p1, v4}, Lq8;->b(Ljava/util/ArrayList;Lo8;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p2, Lo8;->A:[Ln8;

    array-length v0, v0

    :goto_1
    if-ge v1, v0, :cond_4

    iget-object v2, p2, Lo8;->A:[Ln8;

    aget-object v2, v2, v1

    iget-object v2, v2, Ln8;->d:Ln8;

    if-eqz v2, :cond_3

    iget-object v2, v2, Ln8;->b:Lo8;

    .line 1
    iget-object v3, p2, Lo8;->D:Lo8;

    if-eq v2, v3, :cond_3

    .line 2
    invoke-virtual {p0, p1, v2}, Lq8;->b(Ljava/util/ArrayList;Lo8;)V

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    return-void
.end method

.method public final c(Lo8;)V
    .locals 6

    iget-boolean v0, p1, Lo8;->b0:Z

    if-eqz v0, :cond_f

    invoke-virtual {p1}, Lo8;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p1, Lo8;->u:Ln8;

    iget-object v0, v0, Ln8;->d:Ln8;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v3, p1, Lo8;->u:Ln8;

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lo8;->s:Ln8;

    :goto_1
    iget-object v3, v3, Ln8;->d:Ln8;

    if-eqz v3, :cond_5

    iget-object v4, v3, Ln8;->b:Lo8;

    iget-boolean v5, v4, Lo8;->c0:Z

    if-nez v5, :cond_3

    invoke-virtual {p0, v4}, Lq8;->c(Lo8;)V

    :cond_3
    iget-object v4, v3, Ln8;->c:Ln8$b;

    sget-object v5, Ln8$b;->e:Ln8$b;

    if-ne v4, v5, :cond_4

    iget-object v3, v3, Ln8;->b:Lo8;

    iget v4, v3, Lo8;->I:I

    invoke-virtual {v3}, Lo8;->n()I

    move-result v3

    add-int/2addr v3, v4

    goto :goto_2

    :cond_4
    sget-object v5, Ln8$b;->c:Ln8$b;

    if-ne v4, v5, :cond_5

    iget-object v3, v3, Ln8;->b:Lo8;

    iget v3, v3, Lo8;->I:I

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    :goto_2
    if-eqz v0, :cond_6

    iget-object v0, p1, Lo8;->u:Ln8;

    invoke-virtual {v0}, Ln8;->b()I

    move-result v0

    sub-int/2addr v3, v0

    goto :goto_3

    :cond_6
    iget-object v0, p1, Lo8;->s:Ln8;

    invoke-virtual {v0}, Ln8;->b()I

    move-result v0

    invoke-virtual {p1}, Lo8;->n()I

    move-result v4

    add-int/2addr v4, v0

    add-int/2addr v3, v4

    :goto_3
    invoke-virtual {p1}, Lo8;->n()I

    move-result v0

    sub-int v0, v3, v0

    invoke-virtual {p1, v0, v3}, Lo8;->x(II)V

    iget-object v0, p1, Lo8;->w:Ln8;

    iget-object v0, v0, Ln8;->d:Ln8;

    if-eqz v0, :cond_8

    iget-object v1, v0, Ln8;->b:Lo8;

    iget-boolean v3, v1, Lo8;->c0:Z

    if-nez v3, :cond_7

    invoke-virtual {p0, v1}, Lq8;->c(Lo8;)V

    :cond_7
    iget-object v0, v0, Ln8;->b:Lo8;

    iget v1, v0, Lo8;->J:I

    iget v0, v0, Lo8;->Q:I

    add-int/2addr v1, v0

    iget v0, p1, Lo8;->Q:I

    sub-int/2addr v1, v0

    iget v0, p1, Lo8;->F:I

    add-int/2addr v0, v1

    invoke-virtual {p1, v1, v0}, Lo8;->A(II)V

    iput-boolean v2, p1, Lo8;->c0:Z

    return-void

    :cond_8
    iget-object v0, p1, Lo8;->v:Ln8;

    iget-object v0, v0, Ln8;->d:Ln8;

    if-eqz v0, :cond_9

    const/4 v1, 0x1

    :cond_9
    if-eqz v1, :cond_a

    iget-object v0, p1, Lo8;->v:Ln8;

    goto :goto_4

    :cond_a
    iget-object v0, p1, Lo8;->t:Ln8;

    :goto_4
    iget-object v0, v0, Ln8;->d:Ln8;

    if-eqz v0, :cond_d

    iget-object v4, v0, Ln8;->b:Lo8;

    iget-boolean v5, v4, Lo8;->c0:Z

    if-nez v5, :cond_b

    invoke-virtual {p0, v4}, Lq8;->c(Lo8;)V

    :cond_b
    iget-object v4, v0, Ln8;->c:Ln8$b;

    sget-object v5, Ln8$b;->f:Ln8$b;

    if-ne v4, v5, :cond_c

    iget-object v0, v0, Ln8;->b:Lo8;

    iget v3, v0, Lo8;->J:I

    invoke-virtual {v0}, Lo8;->h()I

    move-result v0

    add-int/2addr v3, v0

    goto :goto_5

    :cond_c
    sget-object v5, Ln8$b;->d:Ln8$b;

    if-ne v4, v5, :cond_d

    iget-object v0, v0, Ln8;->b:Lo8;

    iget v3, v0, Lo8;->J:I

    :cond_d
    :goto_5
    if-eqz v1, :cond_e

    iget-object v0, p1, Lo8;->v:Ln8;

    invoke-virtual {v0}, Ln8;->b()I

    move-result v0

    sub-int/2addr v3, v0

    goto :goto_6

    :cond_e
    iget-object v0, p1, Lo8;->t:Ln8;

    invoke-virtual {v0}, Ln8;->b()I

    move-result v0

    invoke-virtual {p1}, Lo8;->h()I

    move-result v1

    add-int/2addr v1, v0

    add-int/2addr v3, v1

    :goto_6
    invoke-virtual {p1}, Lo8;->h()I

    move-result v0

    sub-int v0, v3, v0

    invoke-virtual {p1, v0, v3}, Lo8;->A(II)V

    iput-boolean v2, p1, Lo8;->c0:Z

    :cond_f
    return-void
.end method
