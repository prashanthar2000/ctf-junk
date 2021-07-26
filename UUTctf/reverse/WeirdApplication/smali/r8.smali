.class public Lr8;
.super Lo8;
.source ""


# instance fields
.field public j0:F

.field public k0:I

.field public l0:I

.field public m0:Ln8;

.field public n0:I

.field public o0:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lo8;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lr8;->j0:F

    const/4 v0, -0x1

    iput v0, p0, Lr8;->k0:I

    iput v0, p0, Lr8;->l0:I

    iget-object v0, p0, Lo8;->t:Ln8;

    iput-object v0, p0, Lr8;->m0:Ln8;

    const/4 v0, 0x0

    iput v0, p0, Lr8;->n0:I

    iput-boolean v0, p0, Lr8;->o0:Z

    iget-object v1, p0, Lo8;->B:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, Lo8;->B:Ljava/util/ArrayList;

    iget-object v2, p0, Lr8;->m0:Ln8;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lo8;->A:[Ln8;

    array-length v1, v1

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, Lo8;->A:[Ln8;

    iget-object v3, p0, Lr8;->m0:Ln8;

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public E(Lh8;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lo8;->D:Lo8;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lr8;->m0:Ln8;

    invoke-virtual {p1, v0}, Lh8;->o(Ljava/lang/Object;)I

    move-result p1

    iget v0, p0, Lr8;->n0:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    .line 3
    iput p1, p0, Lo8;->I:I

    .line 4
    iput v2, p0, Lo8;->J:I

    .line 5
    iget-object p1, p0, Lo8;->D:Lo8;

    .line 6
    invoke-virtual {p1}, Lo8;->h()I

    move-result p1

    invoke-virtual {p0, p1}, Lo8;->w(I)V

    invoke-virtual {p0, v2}, Lo8;->C(I)V

    goto :goto_0

    .line 7
    :cond_1
    iput v2, p0, Lo8;->I:I

    .line 8
    iput p1, p0, Lo8;->J:I

    .line 9
    iget-object p1, p0, Lo8;->D:Lo8;

    .line 10
    invoke-virtual {p1}, Lo8;->n()I

    move-result p1

    invoke-virtual {p0, p1}, Lo8;->C(I)V

    invoke-virtual {p0, v2}, Lo8;->w(I)V

    :goto_0
    return-void
.end method

.method public F(I)V
    .locals 3

    iget v0, p0, Lr8;->n0:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lr8;->n0:I

    iget-object p1, p0, Lo8;->B:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget p1, p0, Lr8;->n0:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lo8;->s:Ln8;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lo8;->t:Ln8;

    :goto_0
    iput-object p1, p0, Lr8;->m0:Ln8;

    iget-object p1, p0, Lo8;->B:Ljava/util/ArrayList;

    iget-object v0, p0, Lr8;->m0:Ln8;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lo8;->A:[Ln8;

    array-length p1, p1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_2

    iget-object v1, p0, Lo8;->A:[Ln8;

    iget-object v2, p0, Lr8;->m0:Ln8;

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public a(Lh8;)V
    .locals 8

    .line 1
    sget-object v0, Lo8$a;->c:Lo8$a;

    iget-object v1, p0, Lo8;->D:Lo8;

    .line 2
    check-cast v1, Lp8;

    if-nez v1, :cond_0

    return-void

    :cond_0
    sget-object v2, Ln8$b;->c:Ln8$b;

    invoke-virtual {v1, v2}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v2

    sget-object v3, Ln8$b;->e:Ln8$b;

    invoke-virtual {v1, v3}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v3

    iget-object v4, p0, Lo8;->D:Lo8;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_1

    iget-object v4, v4, Lo8;->C:[Lo8$a;

    aget-object v4, v4, v6

    if-ne v4, v0, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    iget v7, p0, Lr8;->n0:I

    if-nez v7, :cond_3

    sget-object v2, Ln8$b;->d:Ln8$b;

    invoke-virtual {v1, v2}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v2

    sget-object v3, Ln8$b;->f:Ln8$b;

    invoke-virtual {v1, v3}, Lo8;->f(Ln8$b;)Ln8;

    move-result-object v3

    iget-object v1, p0, Lo8;->D:Lo8;

    if-eqz v1, :cond_2

    iget-object v1, v1, Lo8;->C:[Lo8$a;

    aget-object v1, v1, v5

    if-ne v1, v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    move v4, v5

    :cond_3
    iget v0, p0, Lr8;->k0:I

    const/4 v1, 0x6

    const/4 v5, -0x1

    const/4 v7, 0x5

    if-eq v0, v5, :cond_4

    iget-object v0, p0, Lr8;->m0:Ln8;

    invoke-virtual {p1, v0}, Lh8;->l(Ljava/lang/Object;)Lk8;

    move-result-object v0

    invoke-virtual {p1, v2}, Lh8;->l(Ljava/lang/Object;)Lk8;

    move-result-object v2

    iget v5, p0, Lr8;->k0:I

    invoke-virtual {p1, v0, v2, v5, v1}, Lh8;->d(Lk8;Lk8;II)Le8;

    if-eqz v4, :cond_7

    invoke-virtual {p1, v3}, Lh8;->l(Ljava/lang/Object;)Lk8;

    move-result-object v1

    invoke-virtual {p1, v1, v0, v6, v7}, Lh8;->f(Lk8;Lk8;II)V

    goto :goto_2

    :cond_4
    iget v0, p0, Lr8;->l0:I

    if-eq v0, v5, :cond_5

    iget-object v0, p0, Lr8;->m0:Ln8;

    invoke-virtual {p1, v0}, Lh8;->l(Ljava/lang/Object;)Lk8;

    move-result-object v0

    invoke-virtual {p1, v3}, Lh8;->l(Ljava/lang/Object;)Lk8;

    move-result-object v3

    iget v5, p0, Lr8;->l0:I

    neg-int v5, v5

    invoke-virtual {p1, v0, v3, v5, v1}, Lh8;->d(Lk8;Lk8;II)Le8;

    if-eqz v4, :cond_7

    invoke-virtual {p1, v2}, Lh8;->l(Ljava/lang/Object;)Lk8;

    move-result-object v1

    invoke-virtual {p1, v0, v1, v6, v7}, Lh8;->f(Lk8;Lk8;II)V

    invoke-virtual {p1, v3, v0, v6, v7}, Lh8;->f(Lk8;Lk8;II)V

    goto :goto_2

    :cond_5
    iget v0, p0, Lr8;->j0:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_7

    iget-object v0, p0, Lr8;->m0:Ln8;

    invoke-virtual {p1, v0}, Lh8;->l(Ljava/lang/Object;)Lk8;

    move-result-object v0

    invoke-virtual {p1, v2}, Lh8;->l(Ljava/lang/Object;)Lk8;

    move-result-object v2

    invoke-virtual {p1, v3}, Lh8;->l(Ljava/lang/Object;)Lk8;

    move-result-object v3

    iget v4, p0, Lr8;->j0:F

    iget-boolean v5, p0, Lr8;->o0:Z

    .line 3
    invoke-virtual {p1}, Lh8;->m()Le8;

    move-result-object v7

    if-eqz v5, :cond_6

    .line 4
    invoke-virtual {v7, p1, v6}, Le8;->a(Lh8;I)Le8;

    .line 5
    :cond_6
    iget-object v5, v7, Le8;->d:Ld8;

    invoke-virtual {v5, v0, v1}, Ld8;->h(Lk8;F)V

    iget-object v0, v7, Le8;->d:Ld8;

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, v4

    invoke-virtual {v0, v2, v1}, Ld8;->h(Lk8;F)V

    iget-object v0, v7, Le8;->d:Ld8;

    invoke-virtual {v0, v3, v4}, Ld8;->h(Lk8;F)V

    .line 6
    invoke-virtual {p1, v7}, Lh8;->c(Le8;)V

    :cond_7
    :goto_2
    return-void
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public c(I)V
    .locals 7

    .line 1
    sget-object p1, Lo8$a;->b:Lo8$a;

    iget-object v0, p0, Lo8;->D:Lo8;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v1, p0, Lr8;->n0:I

    const/high16 v2, -0x40800000    # -1.0f

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v1, v5, :cond_3

    .line 3
    iget-object v1, p0, Lo8;->t:Ln8;

    .line 4
    iget-object v1, v1, Ln8;->a:Lt8;

    .line 5
    iget-object v6, v0, Lo8;->t:Ln8;

    .line 6
    iget-object v6, v6, Ln8;->a:Lt8;

    .line 7
    invoke-virtual {v1, v5, v6, v4}, Lt8;->f(ILt8;I)V

    iget-object v1, p0, Lo8;->v:Ln8;

    .line 8
    iget-object v1, v1, Ln8;->a:Lt8;

    .line 9
    iget-object v6, v0, Lo8;->t:Ln8;

    .line 10
    iget-object v6, v6, Ln8;->a:Lt8;

    .line 11
    invoke-virtual {v1, v5, v6, v4}, Lt8;->f(ILt8;I)V

    iget v1, p0, Lr8;->k0:I

    if-eq v1, v3, :cond_1

    iget-object p1, p0, Lo8;->s:Ln8;

    .line 12
    iget-object p1, p1, Ln8;->a:Lt8;

    .line 13
    iget-object v2, v0, Lo8;->s:Ln8;

    .line 14
    iget-object v2, v2, Ln8;->a:Lt8;

    .line 15
    invoke-virtual {p1, v5, v2, v1}, Lt8;->f(ILt8;I)V

    iget-object p1, p0, Lo8;->u:Ln8;

    .line 16
    iget-object p1, p1, Ln8;->a:Lt8;

    .line 17
    iget-object v0, v0, Lo8;->s:Ln8;

    goto :goto_0

    :cond_1
    iget v1, p0, Lr8;->l0:I

    if-eq v1, v3, :cond_2

    iget-object p1, p0, Lo8;->s:Ln8;

    .line 18
    iget-object p1, p1, Ln8;->a:Lt8;

    .line 19
    iget-object v2, v0, Lo8;->u:Ln8;

    .line 20
    iget-object v2, v2, Ln8;->a:Lt8;

    neg-int v1, v1

    .line 21
    invoke-virtual {p1, v5, v2, v1}, Lt8;->f(ILt8;I)V

    iget-object p1, p0, Lo8;->u:Ln8;

    .line 22
    iget-object p1, p1, Ln8;->a:Lt8;

    .line 23
    iget-object v0, v0, Lo8;->u:Ln8;

    goto :goto_2

    :cond_2
    iget v1, p0, Lr8;->j0:F

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Lo8;->i()Lo8$a;

    move-result-object v1

    if-ne v1, p1, :cond_6

    iget p1, v0, Lo8;->E:I

    int-to-float p1, p1

    iget v1, p0, Lr8;->j0:F

    mul-float p1, p1, v1

    float-to-int p1, p1

    iget-object v1, p0, Lo8;->s:Ln8;

    .line 24
    iget-object v1, v1, Ln8;->a:Lt8;

    .line 25
    iget-object v2, v0, Lo8;->s:Ln8;

    .line 26
    iget-object v2, v2, Ln8;->a:Lt8;

    .line 27
    invoke-virtual {v1, v5, v2, p1}, Lt8;->f(ILt8;I)V

    iget-object v1, p0, Lo8;->u:Ln8;

    .line 28
    iget-object v1, v1, Ln8;->a:Lt8;

    .line 29
    iget-object v0, v0, Lo8;->s:Ln8;

    goto :goto_3

    :cond_3
    iget-object v1, p0, Lo8;->s:Ln8;

    .line 30
    iget-object v1, v1, Ln8;->a:Lt8;

    .line 31
    iget-object v6, v0, Lo8;->s:Ln8;

    .line 32
    iget-object v6, v6, Ln8;->a:Lt8;

    .line 33
    invoke-virtual {v1, v5, v6, v4}, Lt8;->f(ILt8;I)V

    iget-object v1, p0, Lo8;->u:Ln8;

    .line 34
    iget-object v1, v1, Ln8;->a:Lt8;

    .line 35
    iget-object v6, v0, Lo8;->s:Ln8;

    .line 36
    iget-object v6, v6, Ln8;->a:Lt8;

    .line 37
    invoke-virtual {v1, v5, v6, v4}, Lt8;->f(ILt8;I)V

    iget v1, p0, Lr8;->k0:I

    if-eq v1, v3, :cond_4

    iget-object p1, p0, Lo8;->t:Ln8;

    .line 38
    iget-object p1, p1, Ln8;->a:Lt8;

    .line 39
    iget-object v2, v0, Lo8;->t:Ln8;

    .line 40
    iget-object v2, v2, Ln8;->a:Lt8;

    .line 41
    invoke-virtual {p1, v5, v2, v1}, Lt8;->f(ILt8;I)V

    iget-object p1, p0, Lo8;->v:Ln8;

    .line 42
    iget-object p1, p1, Ln8;->a:Lt8;

    .line 43
    iget-object v0, v0, Lo8;->t:Ln8;

    .line 44
    :goto_0
    iget-object v0, v0, Ln8;->a:Lt8;

    .line 45
    iget v1, p0, Lr8;->k0:I

    :goto_1
    invoke-virtual {p1, v5, v0, v1}, Lt8;->f(ILt8;I)V

    goto :goto_4

    :cond_4
    iget v1, p0, Lr8;->l0:I

    if-eq v1, v3, :cond_5

    iget-object p1, p0, Lo8;->t:Ln8;

    .line 46
    iget-object p1, p1, Ln8;->a:Lt8;

    .line 47
    iget-object v2, v0, Lo8;->v:Ln8;

    .line 48
    iget-object v2, v2, Ln8;->a:Lt8;

    neg-int v1, v1

    .line 49
    invoke-virtual {p1, v5, v2, v1}, Lt8;->f(ILt8;I)V

    iget-object p1, p0, Lo8;->v:Ln8;

    .line 50
    iget-object p1, p1, Ln8;->a:Lt8;

    .line 51
    iget-object v0, v0, Lo8;->v:Ln8;

    .line 52
    :goto_2
    iget-object v0, v0, Ln8;->a:Lt8;

    .line 53
    iget v1, p0, Lr8;->l0:I

    neg-int v1, v1

    goto :goto_1

    :cond_5
    iget v1, p0, Lr8;->j0:F

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Lo8;->m()Lo8$a;

    move-result-object v1

    if-ne v1, p1, :cond_6

    iget p1, v0, Lo8;->F:I

    int-to-float p1, p1

    iget v1, p0, Lr8;->j0:F

    mul-float p1, p1, v1

    float-to-int p1, p1

    iget-object v1, p0, Lo8;->t:Ln8;

    .line 54
    iget-object v1, v1, Ln8;->a:Lt8;

    .line 55
    iget-object v2, v0, Lo8;->t:Ln8;

    .line 56
    iget-object v2, v2, Ln8;->a:Lt8;

    .line 57
    invoke-virtual {v1, v5, v2, p1}, Lt8;->f(ILt8;I)V

    iget-object v1, p0, Lo8;->v:Ln8;

    .line 58
    iget-object v1, v1, Ln8;->a:Lt8;

    .line 59
    iget-object v0, v0, Lo8;->t:Ln8;

    .line 60
    :goto_3
    iget-object v0, v0, Ln8;->a:Lt8;

    .line 61
    invoke-virtual {v1, v5, v0, p1}, Lt8;->f(ILt8;I)V

    :cond_6
    :goto_4
    return-void
.end method

.method public f(Ln8$b;)Ln8;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x0

    return-object p1

    :pswitch_1
    iget v0, p0, Lr8;->n0:I

    if-nez v0, :cond_0

    iget-object p1, p0, Lr8;->m0:Ln8;

    return-object p1

    :pswitch_2
    iget v0, p0, Lr8;->n0:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object p1, p0, Lr8;->m0:Ln8;

    return-object p1

    :cond_0
    :goto_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
