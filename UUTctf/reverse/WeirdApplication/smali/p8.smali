.class public Lp8;
.super Lo8;
.source ""


# instance fields
.field public A0:I

.field public B0:I

.field public C0:Z

.field public D0:Z

.field public E0:Z

.field public j0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lo8;",
            ">;"
        }
    .end annotation
.end field

.field public k0:Z

.field public l0:Lh8;

.field public m0:Lx8;

.field public n0:I

.field public o0:I

.field public p0:I

.field public q0:I

.field public r0:I

.field public s0:I

.field public t0:[Lm8;

.field public u0:[Lm8;

.field public v0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lq8;",
            ">;"
        }
    .end annotation
.end field

.field public w0:Z

.field public x0:Z

.field public y0:Z

.field public z0:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lo8;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lp8;->j0:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lp8;->k0:Z

    new-instance v1, Lh8;

    invoke-direct {v1}, Lh8;-><init>()V

    iput-object v1, p0, Lp8;->l0:Lh8;

    iput v0, p0, Lp8;->r0:I

    iput v0, p0, Lp8;->s0:I

    const/4 v1, 0x4

    new-array v2, v1, [Lm8;

    iput-object v2, p0, Lp8;->t0:[Lm8;

    new-array v1, v1, [Lm8;

    iput-object v1, p0, Lp8;->u0:[Lm8;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lp8;->v0:Ljava/util/List;

    iput-boolean v0, p0, Lp8;->w0:Z

    iput-boolean v0, p0, Lp8;->x0:Z

    iput-boolean v0, p0, Lp8;->y0:Z

    iput v0, p0, Lp8;->z0:I

    iput v0, p0, Lp8;->A0:I

    const/4 v1, 0x7

    iput v1, p0, Lp8;->B0:I

    iput-boolean v0, p0, Lp8;->C0:Z

    iput-boolean v0, p0, Lp8;->D0:Z

    iput-boolean v0, p0, Lp8;->E0:Z

    return-void
.end method


# virtual methods
.method public D()V
    .locals 6

    .line 1
    iget v0, p0, Lo8;->I:I

    iget v1, p0, Lo8;->J:I

    iput v0, p0, Lo8;->M:I

    iput v1, p0, Lo8;->N:I

    .line 2
    iget-object v0, p0, Lp8;->j0:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    iget-object v2, p0, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo8;

    .line 3
    iget v3, p0, Lo8;->M:I

    iget v4, p0, Lo8;->O:I

    add-int/2addr v3, v4

    .line 4
    iget v4, p0, Lo8;->N:I

    iget v5, p0, Lo8;->P:I

    add-int/2addr v4, v5

    .line 5
    invoke-virtual {v2, v3, v4}, Lo8;->z(II)V

    instance-of v3, v2, Lp8;

    if-nez v3, :cond_1

    invoke-virtual {v2}, Lo8;->D()V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public F(Lo8;I)V
    .locals 5

    const/4 v0, 0x1

    if-nez p2, :cond_1

    .line 1
    iget p2, p0, Lp8;->r0:I

    add-int/2addr p2, v0

    iget-object v1, p0, Lp8;->u0:[Lm8;

    array-length v2, v1

    if-lt p2, v2, :cond_0

    array-length p2, v1

    mul-int/lit8 p2, p2, 0x2

    invoke-static {v1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Lm8;

    iput-object p2, p0, Lp8;->u0:[Lm8;

    :cond_0
    iget-object p2, p0, Lp8;->u0:[Lm8;

    iget v1, p0, Lp8;->r0:I

    new-instance v2, Lm8;

    const/4 v3, 0x0

    .line 2
    iget-boolean v4, p0, Lp8;->k0:Z

    .line 3
    invoke-direct {v2, p1, v3, v4}, Lm8;-><init>(Lo8;IZ)V

    aput-object v2, p2, v1

    iget p1, p0, Lp8;->r0:I

    add-int/2addr p1, v0

    iput p1, p0, Lp8;->r0:I

    goto :goto_0

    :cond_1
    if-ne p2, v0, :cond_3

    .line 4
    iget p2, p0, Lp8;->s0:I

    add-int/2addr p2, v0

    iget-object v1, p0, Lp8;->t0:[Lm8;

    array-length v2, v1

    if-lt p2, v2, :cond_2

    array-length p2, v1

    mul-int/lit8 p2, p2, 0x2

    invoke-static {v1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Lm8;

    iput-object p2, p0, Lp8;->t0:[Lm8;

    :cond_2
    iget-object p2, p0, Lp8;->t0:[Lm8;

    iget v1, p0, Lp8;->s0:I

    new-instance v2, Lm8;

    .line 5
    iget-boolean v3, p0, Lp8;->k0:Z

    .line 6
    invoke-direct {v2, p1, v0, v3}, Lm8;-><init>(Lo8;IZ)V

    aput-object v2, p2, v1

    iget p1, p0, Lp8;->s0:I

    add-int/2addr p1, v0

    iput p1, p0, Lp8;->s0:I

    :cond_3
    :goto_0
    return-void
.end method

.method public G(Lh8;)Z
    .locals 13

    sget-object v0, Lo8$a;->b:Lo8$a;

    sget-object v1, Lo8$a;->c:Lo8$a;

    invoke-virtual {p0, p1}, Lo8;->a(Lh8;)V

    iget-object v2, p0, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x1

    if-ge v4, v2, :cond_9

    iget-object v6, p0, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lo8;

    instance-of v7, v6, Lp8;

    if-eqz v7, :cond_3

    iget-object v7, v6, Lo8;->C:[Lo8$a;

    aget-object v8, v7, v3

    aget-object v5, v7, v5

    if-ne v8, v1, :cond_0

    invoke-virtual {v6, v0}, Lo8;->y(Lo8$a;)V

    :cond_0
    if-ne v5, v1, :cond_1

    invoke-virtual {v6, v0}, Lo8;->B(Lo8$a;)V

    :cond_1
    invoke-virtual {v6, p1}, Lo8;->a(Lh8;)V

    if-ne v8, v1, :cond_2

    invoke-virtual {v6, v8}, Lo8;->y(Lo8$a;)V

    :cond_2
    if-ne v5, v1, :cond_8

    invoke-virtual {v6, v5}, Lo8;->B(Lo8$a;)V

    goto/16 :goto_1

    .line 1
    :cond_3
    sget-object v7, Lo8$a;->e:Lo8$a;

    iget-object v8, p0, Lo8;->C:[Lo8$a;

    aget-object v8, v8, v3

    const/4 v9, 0x2

    if-eq v8, v1, :cond_4

    iget-object v8, v6, Lo8;->C:[Lo8$a;

    aget-object v8, v8, v3

    if-ne v8, v7, :cond_4

    iget-object v8, v6, Lo8;->s:Ln8;

    iget v8, v8, Ln8;->e:I

    invoke-virtual {p0}, Lo8;->n()I

    move-result v10

    iget-object v11, v6, Lo8;->u:Ln8;

    iget v11, v11, Ln8;->e:I

    sub-int/2addr v10, v11

    iget-object v11, v6, Lo8;->s:Ln8;

    invoke-virtual {p1, v11}, Lh8;->l(Ljava/lang/Object;)Lk8;

    move-result-object v12

    iput-object v12, v11, Ln8;->i:Lk8;

    iget-object v11, v6, Lo8;->u:Ln8;

    invoke-virtual {p1, v11}, Lh8;->l(Ljava/lang/Object;)Lk8;

    move-result-object v12

    iput-object v12, v11, Ln8;->i:Lk8;

    iget-object v11, v6, Lo8;->s:Ln8;

    iget-object v11, v11, Ln8;->i:Lk8;

    invoke-virtual {p1, v11, v8}, Lh8;->e(Lk8;I)V

    iget-object v11, v6, Lo8;->u:Ln8;

    iget-object v11, v11, Ln8;->i:Lk8;

    invoke-virtual {p1, v11, v10}, Lh8;->e(Lk8;I)V

    iput v9, v6, Lo8;->a:I

    invoke-virtual {v6, v8, v10}, Lo8;->x(II)V

    :cond_4
    iget-object v8, p0, Lo8;->C:[Lo8$a;

    aget-object v8, v8, v5

    if-eq v8, v1, :cond_7

    iget-object v8, v6, Lo8;->C:[Lo8$a;

    aget-object v5, v8, v5

    if-ne v5, v7, :cond_7

    iget-object v5, v6, Lo8;->t:Ln8;

    iget v5, v5, Ln8;->e:I

    invoke-virtual {p0}, Lo8;->h()I

    move-result v7

    iget-object v8, v6, Lo8;->v:Ln8;

    iget v8, v8, Ln8;->e:I

    sub-int/2addr v7, v8

    iget-object v8, v6, Lo8;->t:Ln8;

    invoke-virtual {p1, v8}, Lh8;->l(Ljava/lang/Object;)Lk8;

    move-result-object v10

    iput-object v10, v8, Ln8;->i:Lk8;

    iget-object v8, v6, Lo8;->v:Ln8;

    invoke-virtual {p1, v8}, Lh8;->l(Ljava/lang/Object;)Lk8;

    move-result-object v10

    iput-object v10, v8, Ln8;->i:Lk8;

    iget-object v8, v6, Lo8;->t:Ln8;

    iget-object v8, v8, Ln8;->i:Lk8;

    invoke-virtual {p1, v8, v5}, Lh8;->e(Lk8;I)V

    iget-object v8, v6, Lo8;->v:Ln8;

    iget-object v8, v8, Ln8;->i:Lk8;

    invoke-virtual {p1, v8, v7}, Lh8;->e(Lk8;I)V

    iget v8, v6, Lo8;->Q:I

    if-gtz v8, :cond_5

    .line 2
    iget v8, v6, Lo8;->Y:I

    const/16 v10, 0x8

    if-ne v8, v10, :cond_6

    .line 3
    :cond_5
    iget-object v8, v6, Lo8;->w:Ln8;

    invoke-virtual {p1, v8}, Lh8;->l(Ljava/lang/Object;)Lk8;

    move-result-object v10

    iput-object v10, v8, Ln8;->i:Lk8;

    iget-object v8, v6, Lo8;->w:Ln8;

    iget-object v8, v8, Ln8;->i:Lk8;

    iget v10, v6, Lo8;->Q:I

    add-int/2addr v10, v5

    invoke-virtual {p1, v8, v10}, Lh8;->e(Lk8;I)V

    :cond_6
    iput v9, v6, Lo8;->b:I

    invoke-virtual {v6, v5, v7}, Lo8;->A(II)V

    .line 4
    :cond_7
    invoke-virtual {v6, p1}, Lo8;->a(Lh8;)V

    :cond_8
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_9
    iget v0, p0, Lp8;->r0:I

    if-lez v0, :cond_a

    invoke-static {p0, p1, v3}, Lb1;->a(Lp8;Lh8;I)V

    :cond_a
    iget v0, p0, Lp8;->s0:I

    if-lez v0, :cond_b

    invoke-static {p0, p1, v5}, Lb1;->a(Lp8;Lh8;I)V

    :cond_b
    return v5
.end method

.method public H()V
    .locals 29

    move-object/from16 v1, p0

    sget-object v2, Lo8$a;->d:Lo8$a;

    sget-object v3, Lo8$a;->b:Lo8$a;

    sget-object v4, Lo8$a;->c:Lo8$a;

    iget v5, v1, Lo8;->I:I

    iget v6, v1, Lo8;->J:I

    invoke-virtual/range {p0 .. p0}, Lo8;->n()I

    move-result v0

    const/4 v7, 0x0

    invoke-static {v7, v0}, Ljava/lang/Math;->max(II)I

    move-result v8

    invoke-virtual/range {p0 .. p0}, Lo8;->h()I

    move-result v0

    invoke-static {v7, v0}, Ljava/lang/Math;->max(II)I

    move-result v9

    iput-boolean v7, v1, Lp8;->D0:Z

    iput-boolean v7, v1, Lp8;->E0:Z

    iget-object v0, v1, Lo8;->D:Lo8;

    if-eqz v0, :cond_6

    iget-object v0, v1, Lp8;->m0:Lx8;

    if-nez v0, :cond_0

    new-instance v0, Lx8;

    invoke-direct {v0, v1}, Lx8;-><init>(Lo8;)V

    iput-object v0, v1, Lp8;->m0:Lx8;

    :cond_0
    iget-object v0, v1, Lp8;->m0:Lx8;

    const/4 v10, 0x0

    if-eqz v0, :cond_5

    .line 1
    iget v11, v1, Lo8;->I:I

    .line 2
    iput v11, v0, Lx8;->a:I

    .line 3
    iget v11, v1, Lo8;->J:I

    .line 4
    iput v11, v0, Lx8;->b:I

    invoke-virtual/range {p0 .. p0}, Lo8;->n()I

    move-result v11

    iput v11, v0, Lx8;->c:I

    invoke-virtual/range {p0 .. p0}, Lo8;->h()I

    move-result v11

    iput v11, v0, Lx8;->d:I

    iget-object v11, v0, Lx8;->e:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    const/4 v12, 0x0

    :goto_0
    if-ge v12, v11, :cond_2

    iget-object v13, v0, Lx8;->e:Ljava/util/ArrayList;

    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lw8;

    .line 5
    iget-object v14, v13, Lw8;->a:Ln8;

    .line 6
    iget-object v14, v14, Ln8;->c:Ln8$b;

    .line 7
    invoke-virtual {v1, v14}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v14

    iput-object v14, v13, Lw8;->a:Ln8;

    if-eqz v14, :cond_1

    .line 8
    iget-object v15, v14, Ln8;->d:Ln8;

    .line 9
    iput-object v15, v13, Lw8;->b:Ln8;

    invoke-virtual {v14}, Ln8;->b()I

    move-result v14

    iput v14, v13, Lw8;->c:I

    iget-object v14, v13, Lw8;->a:Ln8;

    .line 10
    iget-object v15, v14, Ln8;->g:Ln8$a;

    .line 11
    iput-object v15, v13, Lw8;->d:Ln8$a;

    .line 12
    iget v14, v14, Ln8;->h:I

    goto :goto_1

    .line 13
    :cond_1
    iput-object v10, v13, Lw8;->b:Ln8;

    iput v7, v13, Lw8;->c:I

    sget-object v14, Ln8$a;->c:Ln8$a;

    iput-object v14, v13, Lw8;->d:Ln8$a;

    const/4 v14, 0x0

    :goto_1
    iput v14, v13, Lw8;->e:I

    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 14
    :cond_2
    iget v0, v1, Lp8;->n0:I

    .line 15
    iput v0, v1, Lo8;->I:I

    .line 16
    iget v0, v1, Lp8;->o0:I

    .line 17
    iput v0, v1, Lo8;->J:I

    .line 18
    iget-object v0, v1, Lo8;->D:Lo8;

    if-eqz v0, :cond_3

    .line 19
    instance-of v10, v0, Lp8;

    if-eqz v10, :cond_3

    check-cast v0, Lp8;

    :cond_3
    iget-object v0, v1, Lo8;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v0, :cond_4

    iget-object v11, v1, Lo8;->B:Ljava/util/ArrayList;

    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ln8;

    invoke-virtual {v11}, Ln8;->d()V

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 20
    :cond_4
    iget-object v0, v1, Lp8;->l0:Lh8;

    .line 21
    iget-object v0, v0, Lh8;->l:Lf8;

    .line 22
    invoke-virtual {v1, v0}, Lp8;->t(Lf8;)V

    goto :goto_3

    .line 23
    :cond_5
    throw v10

    .line 24
    :cond_6
    iput v7, v1, Lo8;->I:I

    iput v7, v1, Lo8;->J:I

    :goto_3
    iget v0, v1, Lp8;->B0:I

    const/16 v10, 0x8

    const/16 v11, 0x20

    const/4 v12, 0x1

    if-eqz v0, :cond_a

    invoke-virtual {v1, v10}, Lp8;->I(I)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual/range {p0 .. p0}, Lp8;->J()V

    :cond_7
    invoke-virtual {v1, v11}, Lp8;->I(I)Z

    move-result v0

    if-nez v0, :cond_9

    .line 25
    invoke-virtual {v1, v10}, Lp8;->I(I)Z

    move-result v0

    if-nez v0, :cond_8

    iget v0, v1, Lp8;->B0:I

    invoke-virtual {v1, v0}, Lp8;->c(I)V

    :cond_8
    invoke-virtual/range {p0 .. p0}, Lp8;->L()V

    .line 26
    :cond_9
    iget-object v0, v1, Lp8;->l0:Lh8;

    iput-boolean v12, v0, Lh8;->g:Z

    goto :goto_4

    :cond_a
    iget-object v0, v1, Lp8;->l0:Lh8;

    iput-boolean v7, v0, Lh8;->g:Z

    :goto_4
    iget-object v0, v1, Lo8;->C:[Lo8$a;

    aget-object v13, v0, v12

    aget-object v14, v0, v7

    invoke-virtual/range {p0 .. p0}, Lp8;->K()V

    iget-object v0, v1, Lp8;->v0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, v1, Lp8;->v0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, v1, Lp8;->v0:Ljava/util/List;

    new-instance v15, Lq8;

    iget-object v10, v1, Lp8;->j0:Ljava/util/ArrayList;

    invoke-direct {v15, v10}, Lq8;-><init>(Ljava/util/List;)V

    invoke-interface {v0, v7, v15}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_b
    iget-object v0, v1, Lp8;->v0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v10

    iget-object v15, v1, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual/range {p0 .. p0}, Lo8;->i()Lo8$a;

    move-result-object v0

    if-eq v0, v4, :cond_d

    invoke-virtual/range {p0 .. p0}, Lo8;->m()Lo8$a;

    move-result-object v0

    if-ne v0, v4, :cond_c

    goto :goto_5

    :cond_c
    const/16 v16, 0x0

    goto :goto_6

    :cond_d
    :goto_5
    const/16 v16, 0x1

    :goto_6
    const/4 v0, 0x0

    :goto_7
    if-ge v7, v10, :cond_2d

    iget-boolean v12, v1, Lp8;->C0:Z

    if-nez v12, :cond_2d

    iget-object v12, v1, Lp8;->v0:Ljava/util/List;

    invoke-interface {v12, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lq8;

    iget-boolean v12, v12, Lq8;->d:Z

    if-eqz v12, :cond_e

    move/from16 v22, v5

    move/from16 v21, v6

    move/from16 v18, v10

    move-object/from16 v25, v15

    goto/16 :goto_1e

    :cond_e
    invoke-virtual {v1, v11}, Lp8;->I(I)Z

    move-result v12

    if-eqz v12, :cond_13

    invoke-virtual/range {p0 .. p0}, Lo8;->i()Lo8$a;

    move-result-object v12

    if-ne v12, v3, :cond_12

    invoke-virtual/range {p0 .. p0}, Lo8;->m()Lo8$a;

    move-result-object v12

    if-ne v12, v3, :cond_12

    iget-object v12, v1, Lp8;->v0:Ljava/util/List;

    invoke-interface {v12, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lq8;

    .line 27
    iget-object v11, v12, Lq8;->j:Ljava/util/List;

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_f

    iget-object v11, v12, Lq8;->j:Ljava/util/List;

    move/from16 v20, v0

    move/from16 v18, v10

    goto :goto_9

    :cond_f
    iget-object v11, v12, Lq8;->a:Ljava/util/List;

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v11

    move/from16 v18, v10

    const/4 v10, 0x0

    :goto_8
    if-ge v10, v11, :cond_11

    move/from16 v19, v11

    iget-object v11, v12, Lq8;->a:Ljava/util/List;

    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lo8;

    move/from16 v20, v0

    iget-boolean v0, v11, Lo8;->b0:Z

    if-nez v0, :cond_10

    iget-object v0, v12, Lq8;->j:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v12, v0, v11}, Lq8;->b(Ljava/util/ArrayList;Lo8;)V

    :cond_10
    add-int/lit8 v10, v10, 0x1

    move/from16 v11, v19

    move/from16 v0, v20

    goto :goto_8

    :cond_11
    move/from16 v20, v0

    iget-object v0, v12, Lq8;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, v12, Lq8;->k:Ljava/util/List;

    iget-object v10, v12, Lq8;->a:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, v12, Lq8;->k:Ljava/util/List;

    iget-object v10, v12, Lq8;->j:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    iget-object v11, v12, Lq8;->j:Ljava/util/List;

    .line 28
    :goto_9
    check-cast v11, Ljava/util/ArrayList;

    iput-object v11, v1, Lp8;->j0:Ljava/util/ArrayList;

    goto :goto_a

    :cond_12
    move/from16 v20, v0

    move/from16 v18, v10

    iget-object v0, v1, Lp8;->v0:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq8;

    iget-object v0, v0, Lq8;->a:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, v1, Lp8;->j0:Ljava/util/ArrayList;

    goto :goto_a

    :cond_13
    move/from16 v20, v0

    move/from16 v18, v10

    :goto_a
    invoke-virtual/range {p0 .. p0}, Lp8;->K()V

    iget-object v0, v1, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v10

    const/4 v0, 0x0

    :goto_b
    if-ge v0, v10, :cond_15

    iget-object v11, v1, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lo8;

    instance-of v12, v11, Lp8;

    if-eqz v12, :cond_14

    check-cast v11, Lp8;

    invoke-virtual {v11}, Lp8;->H()V

    :cond_14
    add-int/lit8 v0, v0, 0x1

    goto :goto_b

    :cond_15
    const/4 v0, 0x0

    const/4 v11, 0x1

    :goto_c
    if-eqz v11, :cond_2b

    move/from16 v19, v11

    const/4 v12, 0x1

    add-int/lit8 v11, v0, 0x1

    :try_start_0
    iget-object v0, v1, Lp8;->l0:Lh8;

    invoke-virtual {v0}, Lh8;->t()V

    invoke-virtual/range {p0 .. p0}, Lp8;->K()V

    iget-object v0, v1, Lp8;->l0:Lh8;

    invoke-virtual {v1, v0}, Lo8;->e(Lh8;)V

    const/4 v0, 0x0

    :goto_d
    if-ge v0, v10, :cond_16

    iget-object v12, v1, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lo8;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    move/from16 v21, v6

    :try_start_1
    iget-object v6, v1, Lp8;->l0:Lh8;

    invoke-virtual {v12, v6}, Lo8;->e(Lh8;)V

    add-int/lit8 v0, v0, 0x1

    move/from16 v6, v21

    goto :goto_d

    :cond_16
    move/from16 v21, v6

    iget-object v0, v1, Lp8;->l0:Lh8;

    invoke-virtual {v1, v0}, Lp8;->G(Lh8;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    iget-object v0, v1, Lp8;->l0:Lh8;

    .line 29
    iget-boolean v6, v0, Lh8;->g:Z

    if-eqz v6, :cond_1a

    const/4 v6, 0x0

    :goto_e
    iget v12, v0, Lh8;->j:I

    if-ge v6, v12, :cond_18

    iget-object v12, v0, Lh8;->f:[Le8;

    aget-object v12, v12, v6

    iget-boolean v12, v12, Le8;->e:Z

    if-nez v12, :cond_17

    const/4 v6, 0x0

    goto :goto_f

    :cond_17
    add-int/lit8 v6, v6, 0x1

    goto :goto_e

    :cond_18
    const/4 v6, 0x1

    :goto_f
    if-nez v6, :cond_19

    goto :goto_10

    :cond_19
    invoke-virtual {v0}, Lh8;->j()V

    goto :goto_11

    :cond_1a
    :goto_10
    iget-object v6, v0, Lh8;->c:Le8;

    invoke-virtual {v0, v6}, Lh8;->q(Le8;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :goto_11
    move/from16 v22, v5

    const/16 v19, 0x1

    goto :goto_13

    :catch_0
    move-exception v0

    const/16 v19, 0x1

    goto :goto_12

    :catch_1
    move-exception v0

    goto :goto_12

    :catch_2
    move-exception v0

    move/from16 v21, v6

    .line 30
    :goto_12
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v22, v5

    const-string v5, "EXCEPTION : "

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_13
    const/4 v0, 0x2

    if-eqz v19, :cond_1f

    iget-object v5, v1, Lp8;->l0:Lh8;

    sget-object v6, Ls8;->a:[Z

    const/16 v17, 0x0

    .line 31
    aput-boolean v17, v6, v0

    invoke-virtual {v1, v5}, Lo8;->E(Lh8;)V

    iget-object v12, v1, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v12

    const/4 v0, 0x0

    :goto_14
    if-ge v0, v12, :cond_1e

    move/from16 v23, v12

    iget-object v12, v1, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lo8;

    invoke-virtual {v12, v5}, Lo8;->E(Lh8;)V

    move-object/from16 v24, v5

    iget-object v5, v12, Lo8;->C:[Lo8$a;

    aget-object v5, v5, v17

    if-ne v5, v2, :cond_1b

    invoke-virtual {v12}, Lo8;->n()I

    move-result v5

    move-object/from16 v25, v15

    .line 32
    iget v15, v12, Lo8;->T:I

    if-ge v5, v15, :cond_1c

    const/4 v5, 0x2

    const/4 v15, 0x1

    .line 33
    aput-boolean v15, v6, v5

    goto :goto_15

    :cond_1b
    move-object/from16 v25, v15

    :cond_1c
    const/4 v5, 0x2

    const/4 v15, 0x1

    :goto_15
    iget-object v5, v12, Lo8;->C:[Lo8$a;

    aget-object v5, v5, v15

    if-ne v5, v2, :cond_1d

    invoke-virtual {v12}, Lo8;->h()I

    move-result v5

    .line 34
    iget v12, v12, Lo8;->U:I

    if-ge v5, v12, :cond_1d

    const/4 v5, 0x2

    .line 35
    aput-boolean v15, v6, v5

    :cond_1d
    add-int/lit8 v0, v0, 0x1

    move/from16 v12, v23

    move-object/from16 v5, v24

    move-object/from16 v15, v25

    const/16 v17, 0x0

    goto :goto_14

    :cond_1e
    move-object/from16 v25, v15

    goto :goto_17

    :cond_1f
    move-object/from16 v25, v15

    .line 36
    iget-object v0, v1, Lp8;->l0:Lh8;

    invoke-virtual {v1, v0}, Lo8;->E(Lh8;)V

    const/4 v0, 0x0

    :goto_16
    if-ge v0, v10, :cond_22

    iget-object v5, v1, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo8;

    iget-object v6, v5, Lo8;->C:[Lo8$a;

    const/4 v12, 0x0

    aget-object v6, v6, v12

    if-ne v6, v2, :cond_20

    invoke-virtual {v5}, Lo8;->n()I

    move-result v6

    .line 37
    iget v12, v5, Lo8;->T:I

    if-ge v6, v12, :cond_20

    .line 38
    sget-object v0, Ls8;->a:[Z

    const/4 v6, 0x2

    const/4 v12, 0x1

    aput-boolean v12, v0, v6

    goto :goto_17

    :cond_20
    const/4 v6, 0x2

    const/4 v12, 0x1

    iget-object v15, v5, Lo8;->C:[Lo8$a;

    aget-object v15, v15, v12

    if-ne v15, v2, :cond_21

    invoke-virtual {v5}, Lo8;->h()I

    move-result v15

    .line 39
    iget v5, v5, Lo8;->U:I

    if-ge v15, v5, :cond_21

    .line 40
    sget-object v0, Ls8;->a:[Z

    aput-boolean v12, v0, v6

    goto :goto_17

    :cond_21
    add-int/lit8 v0, v0, 0x1

    goto :goto_16

    :cond_22
    :goto_17
    if-eqz v16, :cond_25

    const/16 v5, 0x8

    if-ge v11, v5, :cond_25

    sget-object v0, Ls8;->a:[Z

    const/4 v6, 0x2

    aget-boolean v0, v0, v6

    if-eqz v0, :cond_25

    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v12, 0x0

    :goto_18
    if-ge v0, v10, :cond_23

    iget-object v15, v1, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lo8;

    iget v5, v15, Lo8;->I:I

    invoke-virtual {v15}, Lo8;->n()I

    move-result v19

    add-int v5, v19, v5

    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    move-result v6

    iget v5, v15, Lo8;->J:I

    invoke-virtual {v15}, Lo8;->h()I

    move-result v15

    add-int/2addr v15, v5

    invoke-static {v12, v15}, Ljava/lang/Math;->max(II)I

    move-result v12

    add-int/lit8 v0, v0, 0x1

    const/16 v5, 0x8

    goto :goto_18

    :cond_23
    iget v0, v1, Lo8;->R:I

    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v5, v1, Lo8;->S:I

    invoke-static {v5, v12}, Ljava/lang/Math;->max(II)I

    move-result v5

    if-ne v14, v4, :cond_24

    invoke-virtual/range {p0 .. p0}, Lo8;->n()I

    move-result v6

    if-ge v6, v0, :cond_24

    invoke-virtual {v1, v0}, Lo8;->C(I)V

    iget-object v0, v1, Lo8;->C:[Lo8$a;

    const/4 v6, 0x0

    aput-object v4, v0, v6

    const/4 v0, 0x1

    const/16 v20, 0x1

    goto :goto_19

    :cond_24
    const/4 v0, 0x0

    :goto_19
    if-ne v13, v4, :cond_26

    invoke-virtual/range {p0 .. p0}, Lo8;->h()I

    move-result v6

    if-ge v6, v5, :cond_26

    invoke-virtual {v1, v5}, Lo8;->w(I)V

    iget-object v0, v1, Lo8;->C:[Lo8$a;

    const/4 v5, 0x1

    aput-object v4, v0, v5

    const/4 v0, 0x1

    const/16 v20, 0x1

    goto :goto_1a

    :cond_25
    const/4 v0, 0x0

    :cond_26
    :goto_1a
    iget v5, v1, Lo8;->R:I

    invoke-virtual/range {p0 .. p0}, Lo8;->n()I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lo8;->n()I

    move-result v6

    if-le v5, v6, :cond_27

    invoke-virtual {v1, v5}, Lo8;->C(I)V

    iget-object v0, v1, Lo8;->C:[Lo8$a;

    const/4 v5, 0x0

    aput-object v3, v0, v5

    const/4 v0, 0x1

    const/16 v20, 0x1

    :cond_27
    iget v5, v1, Lo8;->S:I

    invoke-virtual/range {p0 .. p0}, Lo8;->h()I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lo8;->h()I

    move-result v6

    if-le v5, v6, :cond_28

    invoke-virtual {v1, v5}, Lo8;->w(I)V

    iget-object v0, v1, Lo8;->C:[Lo8$a;

    const/4 v5, 0x1

    aput-object v3, v0, v5

    const/4 v0, 0x1

    const/4 v12, 0x1

    goto :goto_1b

    :cond_28
    const/4 v5, 0x1

    move/from16 v12, v20

    :goto_1b
    if-nez v12, :cond_2a

    iget-object v6, v1, Lo8;->C:[Lo8$a;

    const/4 v15, 0x0

    aget-object v6, v6, v15

    if-ne v6, v4, :cond_29

    if-lez v8, :cond_29

    invoke-virtual/range {p0 .. p0}, Lo8;->n()I

    move-result v6

    if-le v6, v8, :cond_29

    iput-boolean v5, v1, Lp8;->D0:Z

    iget-object v0, v1, Lo8;->C:[Lo8$a;

    aput-object v3, v0, v15

    invoke-virtual {v1, v8}, Lo8;->C(I)V

    const/4 v0, 0x1

    const/4 v12, 0x1

    :cond_29
    iget-object v6, v1, Lo8;->C:[Lo8$a;

    aget-object v6, v6, v5

    if-ne v6, v4, :cond_2a

    if-lez v9, :cond_2a

    invoke-virtual/range {p0 .. p0}, Lo8;->h()I

    move-result v6

    if-le v6, v9, :cond_2a

    iput-boolean v5, v1, Lp8;->E0:Z

    iget-object v0, v1, Lo8;->C:[Lo8$a;

    aput-object v3, v0, v5

    invoke-virtual {v1, v9}, Lo8;->w(I)V

    const/4 v0, 0x1

    const/16 v20, 0x1

    goto :goto_1c

    :cond_2a
    move/from16 v20, v12

    :goto_1c
    move/from16 v6, v21

    move/from16 v5, v22

    move-object/from16 v15, v25

    move/from16 v28, v11

    move v11, v0

    move/from16 v0, v28

    goto/16 :goto_c

    :cond_2b
    move/from16 v22, v5

    move/from16 v21, v6

    move-object/from16 v25, v15

    iget-object v0, v1, Lp8;->v0:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq8;

    .line 41
    iget-object v5, v0, Lq8;->k:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_1d
    if-ge v6, v5, :cond_2c

    iget-object v10, v0, Lq8;->k:Ljava/util/List;

    invoke-interface {v10, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lo8;

    invoke-virtual {v0, v10}, Lq8;->c(Lo8;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1d

    :cond_2c
    move/from16 v0, v20

    :goto_1e
    add-int/lit8 v7, v7, 0x1

    move/from16 v10, v18

    move/from16 v6, v21

    move/from16 v5, v22

    move-object/from16 v15, v25

    const/16 v11, 0x20

    const/4 v12, 0x1

    goto/16 :goto_7

    :cond_2d
    move/from16 v20, v0

    move/from16 v22, v5

    move/from16 v21, v6

    move-object v2, v15

    .line 42
    iput-object v2, v1, Lp8;->j0:Ljava/util/ArrayList;

    iget-object v0, v1, Lo8;->D:Lo8;

    if-eqz v0, :cond_2f

    iget v0, v1, Lo8;->R:I

    invoke-virtual/range {p0 .. p0}, Lo8;->n()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, v1, Lo8;->S:I

    invoke-virtual/range {p0 .. p0}, Lo8;->h()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget-object v3, v1, Lp8;->m0:Lx8;

    .line 43
    iget v4, v3, Lx8;->a:I

    .line 44
    iput v4, v1, Lo8;->I:I

    .line 45
    iget v4, v3, Lx8;->b:I

    .line 46
    iput v4, v1, Lo8;->J:I

    .line 47
    iget v4, v3, Lx8;->c:I

    invoke-virtual {v1, v4}, Lo8;->C(I)V

    iget v4, v3, Lx8;->d:I

    invoke-virtual {v1, v4}, Lo8;->w(I)V

    iget-object v4, v3, Lx8;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_1f
    if-ge v5, v4, :cond_2e

    iget-object v6, v3, Lx8;->e:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lw8;

    .line 48
    iget-object v7, v6, Lw8;->a:Ln8;

    .line 49
    iget-object v7, v7, Ln8;->c:Ln8$b;

    .line 50
    invoke-virtual {v1, v7}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v21

    iget-object v7, v6, Lw8;->b:Ln8;

    iget v8, v6, Lw8;->c:I

    iget-object v9, v6, Lw8;->d:Ln8$a;

    iget v6, v6, Lw8;->e:I

    const/16 v24, -0x1

    const/16 v27, 0x0

    move-object/from16 v22, v7

    move/from16 v23, v8

    move-object/from16 v25, v9

    move/from16 v26, v6

    .line 51
    invoke-virtual/range {v21 .. v27}, Ln8;->a(Ln8;IILn8$a;IZ)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_1f

    .line 52
    :cond_2e
    iget v3, v1, Lp8;->n0:I

    add-int/2addr v0, v3

    iget v3, v1, Lp8;->p0:I

    add-int/2addr v0, v3

    invoke-virtual {v1, v0}, Lo8;->C(I)V

    iget v0, v1, Lp8;->o0:I

    add-int/2addr v2, v0

    iget v0, v1, Lp8;->q0:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Lo8;->w(I)V

    goto :goto_20

    :cond_2f
    move/from16 v2, v22

    iput v2, v1, Lo8;->I:I

    move/from16 v2, v21

    iput v2, v1, Lo8;->J:I

    :goto_20
    if-eqz v20, :cond_30

    iget-object v0, v1, Lo8;->C:[Lo8$a;

    const/4 v2, 0x0

    aput-object v14, v0, v2

    const/4 v2, 0x1

    aput-object v13, v0, v2

    :cond_30
    iget-object v0, v1, Lp8;->l0:Lh8;

    .line 53
    iget-object v0, v0, Lh8;->l:Lf8;

    .line 54
    invoke-virtual {v1, v0}, Lp8;->t(Lf8;)V

    .line 55
    iget-object v0, v1, Lo8;->D:Lo8;

    move-object v2, v1

    :goto_21
    if-eqz v0, :cond_32

    iget-object v3, v0, Lo8;->D:Lo8;

    .line 56
    instance-of v4, v0, Lp8;

    if-eqz v4, :cond_31

    move-object v2, v0

    check-cast v2, Lp8;

    :cond_31
    move-object v0, v3

    goto :goto_21

    :cond_32
    if-ne v1, v2, :cond_33

    .line 57
    invoke-virtual/range {p0 .. p0}, Lp8;->D()V

    :cond_33
    return-void
.end method

.method public I(I)Z
    .locals 1

    iget v0, p0, Lp8;->B0:I

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public J()V
    .locals 3

    iget-object v0, p0, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p0}, Lo8;->s()V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo8;

    invoke-virtual {v2}, Lo8;->s()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final K()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lp8;->r0:I

    iput v0, p0, Lp8;->s0:I

    return-void
.end method

.method public L()V
    .locals 4

    sget-object v0, Ln8$b;->c:Ln8$b;

    invoke-virtual {p0, v0}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v0

    .line 1
    iget-object v0, v0, Ln8;->a:Lt8;

    .line 2
    sget-object v1, Ln8$b;->d:Ln8$b;

    invoke-virtual {p0, v1}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v1

    .line 3
    iget-object v1, v1, Ln8;->a:Lt8;

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 4
    invoke-virtual {v0, v2, v3}, Lt8;->j(Lt8;F)V

    invoke-virtual {v1, v2, v3}, Lt8;->j(Lt8;F)V

    return-void
.end method

.method public c(I)V
    .locals 3

    invoke-super {p0, p1}, Lo8;->c(I)V

    iget-object v0, p0, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo8;

    invoke-virtual {v2, p1}, Lo8;->c(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public r()V
    .locals 2

    iget-object v0, p0, Lp8;->l0:Lh8;

    invoke-virtual {v0}, Lh8;->t()V

    const/4 v0, 0x0

    iput v0, p0, Lp8;->n0:I

    iput v0, p0, Lp8;->p0:I

    iput v0, p0, Lp8;->o0:I

    iput v0, p0, Lp8;->q0:I

    iget-object v1, p0, Lp8;->v0:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    iput-boolean v0, p0, Lp8;->C0:Z

    .line 1
    iget-object v0, p0, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-super {p0}, Lo8;->r()V

    return-void
.end method

.method public t(Lf8;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lo8;->t(Lf8;)V

    iget-object v0, p0, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo8;

    invoke-virtual {v2, p1}, Lo8;->t(Lf8;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public z(II)V
    .locals 4

    .line 1
    iput p1, p0, Lo8;->O:I

    iput p2, p0, Lo8;->P:I

    .line 2
    iget-object p1, p0, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_0

    iget-object v0, p0, Lp8;->j0:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo8;

    .line 3
    iget v1, p0, Lo8;->I:I

    iget v2, p0, Lo8;->O:I

    add-int/2addr v1, v2

    .line 4
    iget v2, p0, Lo8;->J:I

    iget v3, p0, Lo8;->P:I

    add-int/2addr v2, v3

    .line 5
    invoke-virtual {v0, v1, v2}, Lo8;->z(II)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
