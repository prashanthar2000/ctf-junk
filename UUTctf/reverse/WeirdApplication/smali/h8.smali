.class public Lh8;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static p:I = 0x3e8


# instance fields
.field public a:I

.field public b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lk8;",
            ">;"
        }
    .end annotation
.end field

.field public c:Le8;

.field public d:I

.field public e:I

.field public f:[Le8;

.field public g:Z

.field public h:[Z

.field public i:I

.field public j:I

.field public k:I

.field public final l:Lf8;

.field public m:[Lk8;

.field public n:I

.field public final o:Le8;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lh8;->a:I

    const/4 v1, 0x0

    iput-object v1, p0, Lh8;->b:Ljava/util/HashMap;

    const/16 v2, 0x20

    iput v2, p0, Lh8;->d:I

    iput v2, p0, Lh8;->e:I

    iput-object v1, p0, Lh8;->f:[Le8;

    iput-boolean v0, p0, Lh8;->g:Z

    new-array v1, v2, [Z

    iput-object v1, p0, Lh8;->h:[Z

    const/4 v1, 0x1

    iput v1, p0, Lh8;->i:I

    iput v0, p0, Lh8;->j:I

    iput v2, p0, Lh8;->k:I

    sget v1, Lh8;->p:I

    new-array v1, v1, [Lk8;

    iput-object v1, p0, Lh8;->m:[Lk8;

    iput v0, p0, Lh8;->n:I

    new-array v0, v2, [Le8;

    iput-object v0, p0, Lh8;->f:[Le8;

    invoke-virtual {p0}, Lh8;->s()V

    new-instance v0, Lf8;

    invoke-direct {v0}, Lf8;-><init>()V

    iput-object v0, p0, Lh8;->l:Lf8;

    new-instance v1, Lg8;

    invoke-direct {v1, v0}, Lg8;-><init>(Lf8;)V

    iput-object v1, p0, Lh8;->c:Le8;

    new-instance v0, Le8;

    iget-object v1, p0, Lh8;->l:Lf8;

    invoke-direct {v0, v1}, Le8;-><init>(Lf8;)V

    iput-object v0, p0, Lh8;->o:Le8;

    return-void
.end method


# virtual methods
.method public final a(Lj8;Ljava/lang/String;)Lk8;
    .locals 2

    iget-object p2, p0, Lh8;->l:Lf8;

    iget-object p2, p2, Lf8;->b:Li8;

    invoke-virtual {p2}, Li8;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lk8;

    if-nez p2, :cond_0

    new-instance p2, Lk8;

    invoke-direct {p2, p1}, Lk8;-><init>(Lj8;)V

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p2}, Lk8;->c()V

    .line 2
    :goto_0
    iput-object p1, p2, Lk8;->g:Lj8;

    .line 3
    iget p1, p0, Lh8;->n:I

    sget v0, Lh8;->p:I

    if-lt p1, v0, :cond_1

    mul-int/lit8 v0, v0, 0x2

    sput v0, Lh8;->p:I

    iget-object p1, p0, Lh8;->m:[Lk8;

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lk8;

    iput-object p1, p0, Lh8;->m:[Lk8;

    :cond_1
    iget-object p1, p0, Lh8;->m:[Lk8;

    iget v0, p0, Lh8;->n:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lh8;->n:I

    aput-object p2, p1, v0

    return-object p2
.end method

.method public b(Lk8;Lk8;IFLk8;Lk8;II)V
    .locals 6

    invoke-virtual {p0}, Lh8;->m()Le8;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-ne p2, p5, :cond_0

    .line 1
    iget-object p3, v0, Le8;->d:Ld8;

    invoke-virtual {p3, p1, v1}, Ld8;->h(Lk8;F)V

    iget-object p1, v0, Le8;->d:Ld8;

    invoke-virtual {p1, p6, v1}, Ld8;->h(Lk8;F)V

    iget-object p1, v0, Le8;->d:Ld8;

    const/high16 p3, -0x40000000    # -2.0f

    invoke-virtual {p1, p2, p3}, Ld8;->h(Lk8;F)V

    goto/16 :goto_1

    :cond_0
    const/high16 v2, 0x3f000000    # 0.5f

    const/high16 v3, -0x40800000    # -1.0f

    cmpl-float v2, p4, v2

    if-nez v2, :cond_2

    iget-object p4, v0, Le8;->d:Ld8;

    invoke-virtual {p4, p1, v1}, Ld8;->h(Lk8;F)V

    iget-object p1, v0, Le8;->d:Ld8;

    invoke-virtual {p1, p2, v3}, Ld8;->h(Lk8;F)V

    iget-object p1, v0, Le8;->d:Ld8;

    invoke-virtual {p1, p5, v3}, Ld8;->h(Lk8;F)V

    iget-object p1, v0, Le8;->d:Ld8;

    invoke-virtual {p1, p6, v1}, Ld8;->h(Lk8;F)V

    if-gtz p3, :cond_1

    if-lez p7, :cond_6

    :cond_1
    neg-int p1, p3

    add-int/2addr p1, p7

    int-to-float p1, p1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    cmpg-float v2, p4, v2

    if-gtz v2, :cond_3

    iget-object p4, v0, Le8;->d:Ld8;

    invoke-virtual {p4, p1, v3}, Ld8;->h(Lk8;F)V

    iget-object p1, v0, Le8;->d:Ld8;

    invoke-virtual {p1, p2, v1}, Ld8;->h(Lk8;F)V

    int-to-float p1, p3

    goto :goto_0

    :cond_3
    cmpl-float v2, p4, v1

    if-ltz v2, :cond_4

    iget-object p1, v0, Le8;->d:Ld8;

    invoke-virtual {p1, p5, v3}, Ld8;->h(Lk8;F)V

    iget-object p1, v0, Le8;->d:Ld8;

    invoke-virtual {p1, p6, v1}, Ld8;->h(Lk8;F)V

    int-to-float p1, p7

    :goto_0
    iput p1, v0, Le8;->b:F

    goto :goto_1

    :cond_4
    iget-object v2, v0, Le8;->d:Ld8;

    sub-float v4, v1, p4

    mul-float v5, v4, v1

    invoke-virtual {v2, p1, v5}, Ld8;->h(Lk8;F)V

    iget-object p1, v0, Le8;->d:Ld8;

    mul-float v2, v4, v3

    invoke-virtual {p1, p2, v2}, Ld8;->h(Lk8;F)V

    iget-object p1, v0, Le8;->d:Ld8;

    mul-float v3, v3, p4

    invoke-virtual {p1, p5, v3}, Ld8;->h(Lk8;F)V

    iget-object p1, v0, Le8;->d:Ld8;

    mul-float v1, v1, p4

    invoke-virtual {p1, p6, v1}, Ld8;->h(Lk8;F)V

    if-gtz p3, :cond_5

    if-lez p7, :cond_6

    :cond_5
    neg-int p1, p3

    int-to-float p1, p1

    mul-float p1, p1, v4

    int-to-float p2, p7

    mul-float p2, p2, p4

    add-float/2addr p2, p1

    iput p2, v0, Le8;->b:F

    :cond_6
    :goto_1
    const/4 p1, 0x6

    if-eq p8, p1, :cond_7

    .line 2
    invoke-virtual {v0, p0, p8}, Le8;->a(Lh8;I)Le8;

    :cond_7
    invoke-virtual {p0, v0}, Lh8;->c(Le8;)V

    return-void
.end method

.method public c(Le8;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lj8;->b:Lj8;

    iget v3, v0, Lh8;->j:I

    const/4 v4, 0x1

    add-int/2addr v3, v4

    iget v5, v0, Lh8;->k:I

    if-ge v3, v5, :cond_0

    iget v3, v0, Lh8;->i:I

    add-int/2addr v3, v4

    iget v5, v0, Lh8;->e:I

    if-lt v3, v5, :cond_1

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lh8;->p()V

    :cond_1
    iget-boolean v3, v1, Le8;->e:Z

    if-nez v3, :cond_1b

    invoke-virtual/range {p0 .. p1}, Lh8;->u(Le8;)V

    .line 1
    iget-object v3, v1, Le8;->a:Lk8;

    const/4 v6, 0x0

    if-nez v3, :cond_2

    iget v3, v1, Le8;->b:F

    cmpl-float v3, v3, v6

    if-nez v3, :cond_2

    iget-object v3, v1, Le8;->d:Ld8;

    iget v3, v3, Ld8;->a:I

    if-nez v3, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_3

    return-void

    .line 2
    :cond_3
    iget v3, v1, Le8;->b:F

    const/4 v7, -0x1

    cmpg-float v8, v3, v6

    if-gez v8, :cond_4

    const/high16 v8, -0x40800000    # -1.0f

    mul-float v3, v3, v8

    iput v3, v1, Le8;->b:F

    iget-object v3, v1, Le8;->d:Ld8;

    .line 3
    iget v9, v3, Ld8;->i:I

    const/4 v10, 0x0

    :goto_1
    if-eq v9, v7, :cond_4

    iget v11, v3, Ld8;->a:I

    if-ge v10, v11, :cond_4

    iget-object v11, v3, Ld8;->h:[F

    aget v12, v11, v9

    mul-float v12, v12, v8

    aput v12, v11, v9

    iget-object v11, v3, Ld8;->g:[I

    aget v9, v11, v9

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 4
    :cond_4
    iget-object v3, v1, Le8;->d:Ld8;

    .line 5
    iget v8, v3, Ld8;->i:I

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    :goto_2
    if-eq v8, v7, :cond_d

    iget v5, v3, Ld8;->a:I

    if-ge v10, v5, :cond_d

    iget-object v5, v3, Ld8;->h:[F

    aget v17, v5, v8

    const v18, 0x3a83126f    # 0.001f

    iget-object v7, v3, Ld8;->c:Lf8;

    iget-object v7, v7, Lf8;->c:[Lk8;

    iget-object v9, v3, Ld8;->f:[I

    aget v9, v9, v8

    aget-object v7, v7, v9

    cmpg-float v9, v17, v6

    if-gez v9, :cond_5

    const v9, -0x457ced91    # -0.001f

    cmpl-float v9, v17, v9

    if-lez v9, :cond_6

    aput v6, v5, v8

    goto :goto_3

    :cond_5
    cmpg-float v9, v17, v18

    if-gez v9, :cond_6

    aput v6, v5, v8

    :goto_3
    iget-object v5, v3, Ld8;->b:Le8;

    invoke-virtual {v7, v5}, Lk8;->b(Le8;)V

    const/16 v17, 0x0

    :cond_6
    cmpl-float v5, v17, v6

    if-eqz v5, :cond_c

    iget-object v5, v7, Lk8;->g:Lj8;

    if-ne v5, v2, :cond_9

    if-nez v12, :cond_7

    goto :goto_4

    :cond_7
    cmpl-float v5, v13, v17

    if-lez v5, :cond_8

    :goto_4
    invoke-virtual {v3, v7}, Ld8;->g(Lk8;)Z

    move-result v14

    move-object v12, v7

    move/from16 v13, v17

    goto :goto_6

    :cond_8
    if-nez v14, :cond_c

    invoke-virtual {v3, v7}, Ld8;->g(Lk8;)Z

    move-result v5

    if-eqz v5, :cond_c

    move-object v12, v7

    move/from16 v13, v17

    const/4 v14, 0x1

    goto :goto_6

    :cond_9
    if-nez v12, :cond_c

    cmpg-float v5, v17, v6

    if-gez v5, :cond_c

    if-nez v11, :cond_a

    goto :goto_5

    :cond_a
    cmpl-float v5, v15, v17

    if-lez v5, :cond_b

    :goto_5
    invoke-virtual {v3, v7}, Ld8;->g(Lk8;)Z

    move-result v16

    move-object v11, v7

    move/from16 v15, v17

    goto :goto_6

    :cond_b
    if-nez v16, :cond_c

    invoke-virtual {v3, v7}, Ld8;->g(Lk8;)Z

    move-result v5

    if-eqz v5, :cond_c

    move-object v11, v7

    move/from16 v15, v17

    const/16 v16, 0x1

    :cond_c
    :goto_6
    iget-object v5, v3, Ld8;->g:[I

    aget v8, v5, v8

    add-int/lit8 v10, v10, 0x1

    const/4 v7, -0x1

    goto :goto_2

    :cond_d
    if-eqz v12, :cond_e

    move-object v11, v12

    :cond_e
    if-nez v11, :cond_f

    const/4 v3, 0x1

    goto :goto_7

    .line 6
    :cond_f
    invoke-virtual {v1, v11}, Le8;->g(Lk8;)V

    const/4 v3, 0x0

    :goto_7
    iget-object v5, v1, Le8;->d:Ld8;

    iget v5, v5, Ld8;->a:I

    if-nez v5, :cond_10

    iput-boolean v4, v1, Le8;->e:Z

    :cond_10
    if-eqz v3, :cond_17

    .line 7
    iget v3, v0, Lh8;->i:I

    add-int/2addr v3, v4

    iget v5, v0, Lh8;->e:I

    if-lt v3, v5, :cond_11

    invoke-virtual/range {p0 .. p0}, Lh8;->p()V

    :cond_11
    sget-object v3, Lj8;->d:Lj8;

    const/4 v5, 0x0

    invoke-virtual {v0, v3, v5}, Lh8;->a(Lj8;Ljava/lang/String;)Lk8;

    move-result-object v3

    iget v5, v0, Lh8;->a:I

    add-int/2addr v5, v4

    iput v5, v0, Lh8;->a:I

    iget v7, v0, Lh8;->i:I

    add-int/2addr v7, v4

    iput v7, v0, Lh8;->i:I

    iput v5, v3, Lk8;->b:I

    iget-object v7, v0, Lh8;->l:Lf8;

    iget-object v7, v7, Lf8;->c:[Lk8;

    aput-object v3, v7, v5

    .line 8
    iput-object v3, v1, Le8;->a:Lk8;

    invoke-virtual/range {p0 .. p1}, Lh8;->i(Le8;)V

    iget-object v5, v0, Lh8;->o:Le8;

    if-eqz v5, :cond_16

    const/4 v7, 0x0

    .line 9
    iput-object v7, v5, Le8;->a:Lk8;

    iget-object v7, v5, Le8;->d:Ld8;

    invoke-virtual {v7}, Ld8;->b()V

    const/4 v7, 0x0

    :goto_8
    iget-object v8, v1, Le8;->d:Ld8;

    iget v9, v8, Ld8;->a:I

    if-ge v7, v9, :cond_12

    invoke-virtual {v8, v7}, Ld8;->e(I)Lk8;

    move-result-object v8

    iget-object v9, v1, Le8;->d:Ld8;

    invoke-virtual {v9, v7}, Ld8;->f(I)F

    move-result v9

    iget-object v10, v5, Le8;->d:Ld8;

    invoke-virtual {v10, v8, v9, v4}, Ld8;->a(Lk8;FZ)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_8

    .line 10
    :cond_12
    iget-object v5, v0, Lh8;->o:Le8;

    invoke-virtual {v0, v5}, Lh8;->r(Le8;)I

    iget v5, v3, Lk8;->c:I

    const/4 v7, -0x1

    if-ne v5, v7, :cond_15

    iget-object v5, v1, Le8;->a:Lk8;

    if-ne v5, v3, :cond_13

    .line 11
    iget-object v5, v1, Le8;->d:Ld8;

    const/4 v7, 0x0

    invoke-virtual {v5, v7, v3}, Ld8;->d([ZLk8;)Lk8;

    move-result-object v3

    if-eqz v3, :cond_13

    .line 12
    invoke-virtual {v1, v3}, Le8;->g(Lk8;)V

    :cond_13
    iget-boolean v3, v1, Le8;->e:Z

    if-nez v3, :cond_14

    iget-object v3, v1, Le8;->a:Lk8;

    invoke-virtual {v3, v1}, Lk8;->d(Le8;)V

    :cond_14
    iget v3, v0, Lh8;->j:I

    sub-int/2addr v3, v4

    iput v3, v0, Lh8;->j:I

    :cond_15
    const/4 v3, 0x1

    goto :goto_9

    :cond_16
    const/4 v3, 0x0

    .line 13
    throw v3

    :cond_17
    const/4 v3, 0x0

    .line 14
    :goto_9
    iget-object v5, v1, Le8;->a:Lk8;

    if-eqz v5, :cond_18

    iget-object v5, v5, Lk8;->g:Lj8;

    if-eq v5, v2, :cond_19

    iget v2, v1, Le8;->b:F

    cmpg-float v2, v2, v6

    if-ltz v2, :cond_18

    goto :goto_a

    :cond_18
    const/4 v4, 0x0

    :cond_19
    :goto_a
    if-nez v4, :cond_1a

    return-void

    :cond_1a
    move v5, v3

    goto :goto_b

    :cond_1b
    const/4 v5, 0x0

    :goto_b
    if-nez v5, :cond_1c

    .line 15
    invoke-virtual/range {p0 .. p1}, Lh8;->i(Le8;)V

    :cond_1c
    return-void
.end method

.method public d(Lk8;Lk8;II)Le8;
    .locals 3

    invoke-virtual {p0}, Lh8;->m()Le8;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p3, :cond_1

    if-gez p3, :cond_0

    mul-int/lit8 p3, p3, -0x1

    const/4 v1, 0x1

    :cond_0
    int-to-float p3, p3

    .line 1
    iput p3, v0, Le8;->b:F

    :cond_1
    const/high16 p3, -0x40800000    # -1.0f

    const/high16 v2, 0x3f800000    # 1.0f

    if-nez v1, :cond_2

    iget-object v1, v0, Le8;->d:Ld8;

    invoke-virtual {v1, p1, p3}, Ld8;->h(Lk8;F)V

    iget-object p1, v0, Le8;->d:Ld8;

    invoke-virtual {p1, p2, v2}, Ld8;->h(Lk8;F)V

    goto :goto_0

    :cond_2
    iget-object v1, v0, Le8;->d:Ld8;

    invoke-virtual {v1, p1, v2}, Ld8;->h(Lk8;F)V

    iget-object p1, v0, Le8;->d:Ld8;

    invoke-virtual {p1, p2, p3}, Ld8;->h(Lk8;F)V

    :goto_0
    const/4 p1, 0x6

    if-eq p4, p1, :cond_3

    .line 2
    invoke-virtual {v0, p0, p4}, Le8;->a(Lh8;I)Le8;

    :cond_3
    invoke-virtual {p0, v0}, Lh8;->c(Le8;)V

    return-object v0
.end method

.method public e(Lk8;I)V
    .locals 4

    iget v0, p1, Lk8;->c:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-eq v0, v2, :cond_3

    iget-object v3, p0, Lh8;->f:[Le8;

    aget-object v0, v3, v0

    iget-boolean v3, v0, Le8;->e:Z

    if-eqz v3, :cond_0

    :goto_0
    int-to-float p1, p2

    iput p1, v0, Le8;->b:F

    goto :goto_3

    :cond_0
    iget-object v3, v0, Le8;->d:Ld8;

    iget v3, v3, Ld8;->a:I

    if-nez v3, :cond_1

    iput-boolean v1, v0, Le8;->e:Z

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lh8;->m()Le8;

    move-result-object v0

    if-gez p2, :cond_2

    mul-int/lit8 p2, p2, -0x1

    int-to-float p2, p2

    .line 1
    iput p2, v0, Le8;->b:F

    iget-object p2, v0, Le8;->d:Ld8;

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_2
    int-to-float p2, p2

    iput p2, v0, Le8;->b:F

    iget-object p2, v0, Le8;->d:Ld8;

    const/high16 v1, -0x40800000    # -1.0f

    :goto_1
    invoke-virtual {p2, p1, v1}, Ld8;->h(Lk8;F)V

    goto :goto_2

    .line 2
    :cond_3
    invoke-virtual {p0}, Lh8;->m()Le8;

    move-result-object v0

    .line 3
    iput-object p1, v0, Le8;->a:Lk8;

    int-to-float p2, p2

    iput p2, p1, Lk8;->e:F

    iput p2, v0, Le8;->b:F

    iput-boolean v1, v0, Le8;->e:Z

    .line 4
    :goto_2
    invoke-virtual {p0, v0}, Lh8;->c(Le8;)V

    :goto_3
    return-void
.end method

.method public f(Lk8;Lk8;II)V
    .locals 3

    invoke-virtual {p0}, Lh8;->m()Le8;

    move-result-object v0

    invoke-virtual {p0}, Lh8;->n()Lk8;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, Lk8;->d:I

    invoke-virtual {v0, p1, p2, v1, p3}, Le8;->d(Lk8;Lk8;Lk8;I)Le8;

    const/4 p1, 0x6

    if-eq p4, p1, :cond_0

    iget-object p1, v0, Le8;->d:Ld8;

    invoke-virtual {p1, v1}, Ld8;->c(Lk8;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float p1, p1, p2

    float-to-int p1, p1

    const/4 p2, 0x0

    .line 1
    invoke-virtual {p0, p4, p2}, Lh8;->k(ILjava/lang/String;)Lk8;

    move-result-object p2

    .line 2
    iget-object p3, v0, Le8;->d:Ld8;

    int-to-float p1, p1

    invoke-virtual {p3, p2, p1}, Ld8;->h(Lk8;F)V

    .line 3
    :cond_0
    invoke-virtual {p0, v0}, Lh8;->c(Le8;)V

    return-void
.end method

.method public g(Lk8;Lk8;II)V
    .locals 3

    invoke-virtual {p0}, Lh8;->m()Le8;

    move-result-object v0

    invoke-virtual {p0}, Lh8;->n()Lk8;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, Lk8;->d:I

    invoke-virtual {v0, p1, p2, v1, p3}, Le8;->e(Lk8;Lk8;Lk8;I)Le8;

    const/4 p1, 0x6

    if-eq p4, p1, :cond_0

    iget-object p1, v0, Le8;->d:Ld8;

    invoke-virtual {p1, v1}, Ld8;->c(Lk8;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float p1, p1, p2

    float-to-int p1, p1

    const/4 p2, 0x0

    .line 1
    invoke-virtual {p0, p4, p2}, Lh8;->k(ILjava/lang/String;)Lk8;

    move-result-object p2

    .line 2
    iget-object p3, v0, Le8;->d:Ld8;

    int-to-float p1, p1

    invoke-virtual {p3, p2, p1}, Ld8;->h(Lk8;F)V

    .line 3
    :cond_0
    invoke-virtual {p0, v0}, Lh8;->c(Le8;)V

    return-void
.end method

.method public h(Lk8;Lk8;Lk8;Lk8;FI)V
    .locals 7

    invoke-virtual {p0}, Lh8;->m()Le8;

    move-result-object v6

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Le8;->c(Lk8;Lk8;Lk8;Lk8;F)Le8;

    const/4 p1, 0x6

    if-eq p6, p1, :cond_0

    invoke-virtual {v6, p0, p6}, Le8;->a(Lh8;I)Le8;

    :cond_0
    invoke-virtual {p0, v6}, Lh8;->c(Le8;)V

    return-void
.end method

.method public final i(Le8;)V
    .locals 3

    iget-object v0, p0, Lh8;->f:[Le8;

    iget v1, p0, Lh8;->j:I

    aget-object v2, v0, v1

    if-eqz v2, :cond_0

    iget-object v2, p0, Lh8;->l:Lf8;

    iget-object v2, v2, Lf8;->a:Li8;

    aget-object v0, v0, v1

    invoke-virtual {v2, v0}, Li8;->b(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, Lh8;->f:[Le8;

    iget v1, p0, Lh8;->j:I

    aput-object p1, v0, v1

    iget-object v0, p1, Le8;->a:Lk8;

    iput v1, v0, Lk8;->c:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lh8;->j:I

    invoke-virtual {v0, p1}, Lk8;->d(Le8;)V

    return-void
.end method

.method public final j()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lh8;->j:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lh8;->f:[Le8;

    aget-object v1, v1, v0

    iget-object v2, v1, Le8;->a:Lk8;

    iget v1, v1, Le8;->b:F

    iput v1, v2, Lk8;->e:F

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public k(ILjava/lang/String;)Lk8;
    .locals 2

    iget v0, p0, Lh8;->i:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lh8;->e:I

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lh8;->p()V

    :cond_0
    sget-object v0, Lj8;->e:Lj8;

    invoke-virtual {p0, v0, p2}, Lh8;->a(Lj8;Ljava/lang/String;)Lk8;

    move-result-object p2

    iget v0, p0, Lh8;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lh8;->a:I

    iget v1, p0, Lh8;->i:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lh8;->i:I

    iput v0, p2, Lk8;->b:I

    iput p1, p2, Lk8;->d:I

    iget-object p1, p0, Lh8;->l:Lf8;

    iget-object p1, p1, Lf8;->c:[Lk8;

    aput-object p2, p1, v0

    iget-object p1, p0, Lh8;->c:Le8;

    invoke-virtual {p1, p2}, Le8;->b(Lk8;)V

    return-object p2
.end method

.method public l(Ljava/lang/Object;)Lk8;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget v1, p0, Lh8;->i:I

    add-int/lit8 v1, v1, 0x1

    iget v2, p0, Lh8;->e:I

    if-lt v1, v2, :cond_1

    invoke-virtual {p0}, Lh8;->p()V

    :cond_1
    instance-of v1, p1, Ln8;

    if-eqz v1, :cond_5

    check-cast p1, Ln8;

    .line 1
    iget-object v0, p1, Ln8;->i:Lk8;

    if-nez v0, :cond_2

    .line 2
    invoke-virtual {p1}, Ln8;->e()V

    .line 3
    iget-object p1, p1, Ln8;->i:Lk8;

    move-object v0, p1

    .line 4
    :cond_2
    iget p1, v0, Lk8;->b:I

    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    iget v2, p0, Lh8;->a:I

    if-gt p1, v2, :cond_3

    iget-object v2, p0, Lh8;->l:Lf8;

    iget-object v2, v2, Lf8;->c:[Lk8;

    aget-object p1, v2, p1

    if-nez p1, :cond_5

    :cond_3
    iget p1, v0, Lk8;->b:I

    if-eq p1, v1, :cond_4

    invoke-virtual {v0}, Lk8;->c()V

    :cond_4
    iget p1, p0, Lh8;->a:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lh8;->a:I

    iget v1, p0, Lh8;->i:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lh8;->i:I

    iput p1, v0, Lk8;->b:I

    sget-object v1, Lj8;->b:Lj8;

    iput-object v1, v0, Lk8;->g:Lj8;

    iget-object v1, p0, Lh8;->l:Lf8;

    iget-object v1, v1, Lf8;->c:[Lk8;

    aput-object v0, v1, p1

    :cond_5
    return-object v0
.end method

.method public m()Le8;
    .locals 2

    iget-object v0, p0, Lh8;->l:Lf8;

    iget-object v0, v0, Lf8;->a:Li8;

    invoke-virtual {v0}, Li8;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le8;

    if-nez v0, :cond_0

    new-instance v0, Le8;

    iget-object v1, p0, Lh8;->l:Lf8;

    invoke-direct {v0, v1}, Le8;-><init>(Lf8;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 1
    iput-object v1, v0, Le8;->a:Lk8;

    iget-object v1, v0, Le8;->d:Ld8;

    invoke-virtual {v1}, Ld8;->b()V

    const/4 v1, 0x0

    iput v1, v0, Le8;->b:F

    const/4 v1, 0x0

    iput-boolean v1, v0, Le8;->e:Z

    .line 2
    :goto_0
    sget v1, Lk8;->k:I

    add-int/lit8 v1, v1, 0x1

    sput v1, Lk8;->k:I

    return-object v0
.end method

.method public n()Lk8;
    .locals 3

    iget v0, p0, Lh8;->i:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lh8;->e:I

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lh8;->p()V

    :cond_0
    sget-object v0, Lj8;->d:Lj8;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lh8;->a(Lj8;Ljava/lang/String;)Lk8;

    move-result-object v0

    iget v1, p0, Lh8;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lh8;->a:I

    iget v2, p0, Lh8;->i:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lh8;->i:I

    iput v1, v0, Lk8;->b:I

    iget-object v2, p0, Lh8;->l:Lf8;

    iget-object v2, v2, Lf8;->c:[Lk8;

    aput-object v0, v2, v1

    return-object v0
.end method

.method public o(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Ln8;

    .line 1
    iget-object p1, p1, Ln8;->i:Lk8;

    if-eqz p1, :cond_0

    .line 2
    iget p1, p1, Lk8;->e:F

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final p()V
    .locals 3

    iget v0, p0, Lh8;->d:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Lh8;->d:I

    iget-object v1, p0, Lh8;->f:[Le8;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le8;

    iput-object v0, p0, Lh8;->f:[Le8;

    iget-object v0, p0, Lh8;->l:Lf8;

    iget-object v1, v0, Lf8;->c:[Lk8;

    iget v2, p0, Lh8;->d:I

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lk8;

    iput-object v1, v0, Lf8;->c:[Lk8;

    iget v0, p0, Lh8;->d:I

    new-array v1, v0, [Z

    iput-object v1, p0, Lh8;->h:[Z

    iput v0, p0, Lh8;->e:I

    iput v0, p0, Lh8;->k:I

    return-void
.end method

.method public q(Le8;)V
    .locals 18

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p1}, Lh8;->u(Le8;)V

    .line 1
    sget-object v1, Lj8;->b:Lj8;

    const/4 v3, 0x0

    :goto_0
    iget v4, v0, Lh8;->j:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ge v3, v4, :cond_2

    iget-object v4, v0, Lh8;->f:[Le8;

    aget-object v7, v4, v3

    iget-object v7, v7, Le8;->a:Lk8;

    iget-object v7, v7, Lk8;->g:Lj8;

    if-ne v7, v1, :cond_0

    goto :goto_1

    :cond_0
    aget-object v4, v4, v3

    iget v4, v4, Le8;->b:F

    cmpg-float v4, v4, v5

    if-gez v4, :cond_1

    const/4 v3, 0x1

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_2
    if-eqz v3, :cond_e

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_3
    if-nez v3, :cond_e

    add-int/2addr v4, v6

    const v7, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v8, -0x1

    const/4 v9, 0x0

    const/4 v10, -0x1

    const/4 v11, -0x1

    const/4 v12, 0x0

    :goto_4
    iget v13, v0, Lh8;->j:I

    if-ge v9, v13, :cond_b

    iget-object v13, v0, Lh8;->f:[Le8;

    aget-object v13, v13, v9

    iget-object v14, v13, Le8;->a:Lk8;

    iget-object v14, v14, Lk8;->g:Lj8;

    if-ne v14, v1, :cond_3

    goto :goto_8

    :cond_3
    iget-boolean v14, v13, Le8;->e:Z

    if-eqz v14, :cond_4

    goto :goto_8

    :cond_4
    iget v14, v13, Le8;->b:F

    cmpg-float v14, v14, v5

    if-gez v14, :cond_a

    const/4 v14, 0x1

    :goto_5
    iget v15, v0, Lh8;->i:I

    if-ge v14, v15, :cond_a

    iget-object v15, v0, Lh8;->l:Lf8;

    iget-object v15, v15, Lf8;->c:[Lk8;

    aget-object v15, v15, v14

    iget-object v2, v13, Le8;->d:Ld8;

    invoke-virtual {v2, v15}, Ld8;->c(Lk8;)F

    move-result v2

    cmpg-float v16, v2, v5

    if-gtz v16, :cond_5

    goto :goto_7

    :cond_5
    const/4 v5, 0x0

    :goto_6
    const/4 v6, 0x7

    if-ge v5, v6, :cond_9

    iget-object v6, v15, Lk8;->f:[F

    aget v6, v6, v5

    div-float/2addr v6, v2

    cmpg-float v17, v6, v7

    if-gez v17, :cond_6

    if-eq v5, v12, :cond_7

    :cond_6
    if-le v5, v12, :cond_8

    :cond_7
    move v12, v5

    move v7, v6

    move v10, v9

    move v11, v14

    :cond_8
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_9
    :goto_7
    add-int/lit8 v14, v14, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x1

    goto :goto_5

    :cond_a
    :goto_8
    add-int/lit8 v9, v9, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x1

    goto :goto_4

    :cond_b
    if-eq v10, v8, :cond_c

    iget-object v2, v0, Lh8;->f:[Le8;

    aget-object v2, v2, v10

    iget-object v5, v2, Le8;->a:Lk8;

    iput v8, v5, Lk8;->c:I

    iget-object v5, v0, Lh8;->l:Lf8;

    iget-object v5, v5, Lf8;->c:[Lk8;

    aget-object v5, v5, v11

    invoke-virtual {v2, v5}, Le8;->g(Lk8;)V

    iget-object v5, v2, Le8;->a:Lk8;

    iput v10, v5, Lk8;->c:I

    invoke-virtual {v5, v2}, Lk8;->d(Le8;)V

    goto :goto_9

    :cond_c
    const/4 v3, 0x1

    :goto_9
    iget v2, v0, Lh8;->i:I

    div-int/lit8 v2, v2, 0x2

    if-le v4, v2, :cond_d

    const/4 v3, 0x1

    :cond_d
    const/4 v5, 0x0

    const/4 v6, 0x1

    goto/16 :goto_3

    .line 2
    :cond_e
    invoke-virtual/range {p0 .. p1}, Lh8;->r(Le8;)I

    invoke-virtual/range {p0 .. p0}, Lh8;->j()V

    return-void
.end method

.method public final r(Le8;)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    iget v4, v0, Lh8;->i:I

    if-ge v3, v4, :cond_0

    iget-object v4, v0, Lh8;->h:[Z

    aput-boolean v2, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    if-nez v3, :cond_d

    add-int/lit8 v4, v4, 0x1

    iget v5, v0, Lh8;->i:I

    mul-int/lit8 v5, v5, 0x2

    if-lt v4, v5, :cond_1

    return v4

    .line 1
    :cond_1
    iget-object v5, v1, Le8;->a:Lk8;

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    .line 2
    iget-object v7, v0, Lh8;->h:[Z

    iget v5, v5, Lk8;->b:I

    aput-boolean v6, v7, v5

    :cond_2
    iget-object v5, v0, Lh8;->h:[Z

    .line 3
    iget-object v7, v1, Le8;->d:Ld8;

    const/4 v8, 0x0

    invoke-virtual {v7, v5, v8}, Ld8;->d([ZLk8;)Lk8;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 4
    iget-object v7, v0, Lh8;->h:[Z

    iget v8, v5, Lk8;->b:I

    aget-boolean v9, v7, v8

    if-eqz v9, :cond_3

    return v4

    :cond_3
    aput-boolean v6, v7, v8

    :cond_4
    if-eqz v5, :cond_c

    const v7, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v8, -0x1

    const/4 v9, 0x0

    const/4 v10, -0x1

    :goto_2
    iget v11, v0, Lh8;->j:I

    if-ge v9, v11, :cond_b

    iget-object v11, v0, Lh8;->f:[Le8;

    aget-object v11, v11, v9

    iget-object v12, v11, Le8;->a:Lk8;

    iget-object v12, v12, Lk8;->g:Lj8;

    sget-object v13, Lj8;->b:Lj8;

    if-ne v12, v13, :cond_5

    goto :goto_6

    :cond_5
    iget-boolean v12, v11, Le8;->e:Z

    if-eqz v12, :cond_6

    goto :goto_6

    .line 5
    :cond_6
    iget-object v12, v11, Le8;->d:Ld8;

    .line 6
    iget v13, v12, Ld8;->i:I

    if-ne v13, v8, :cond_7

    goto :goto_4

    :cond_7
    const/4 v14, 0x0

    :goto_3
    if-eq v13, v8, :cond_9

    iget v15, v12, Ld8;->a:I

    if-ge v14, v15, :cond_9

    iget-object v15, v12, Ld8;->f:[I

    aget v15, v15, v13

    iget v2, v5, Lk8;->b:I

    if-ne v15, v2, :cond_8

    const/4 v2, 0x1

    goto :goto_5

    :cond_8
    iget-object v2, v12, Ld8;->g:[I

    aget v13, v2, v13

    add-int/lit8 v14, v14, 0x1

    const/4 v2, 0x0

    goto :goto_3

    :cond_9
    :goto_4
    const/4 v2, 0x0

    :goto_5
    if-eqz v2, :cond_a

    .line 7
    iget-object v2, v11, Le8;->d:Ld8;

    invoke-virtual {v2, v5}, Ld8;->c(Lk8;)F

    move-result v2

    const/4 v12, 0x0

    cmpg-float v12, v2, v12

    if-gez v12, :cond_a

    iget v11, v11, Le8;->b:F

    neg-float v11, v11

    div-float/2addr v11, v2

    cmpg-float v2, v11, v7

    if-gez v2, :cond_a

    move v10, v9

    move v7, v11

    :cond_a
    :goto_6
    add-int/lit8 v9, v9, 0x1

    const/4 v2, 0x0

    goto :goto_2

    :cond_b
    if-le v10, v8, :cond_c

    iget-object v2, v0, Lh8;->f:[Le8;

    aget-object v2, v2, v10

    iget-object v6, v2, Le8;->a:Lk8;

    iput v8, v6, Lk8;->c:I

    invoke-virtual {v2, v5}, Le8;->g(Lk8;)V

    iget-object v5, v2, Le8;->a:Lk8;

    iput v10, v5, Lk8;->c:I

    invoke-virtual {v5, v2}, Lk8;->d(Le8;)V

    goto :goto_7

    :cond_c
    const/4 v3, 0x1

    :goto_7
    const/4 v2, 0x0

    goto/16 :goto_1

    :cond_d
    return v4
.end method

.method public final s()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lh8;->f:[Le8;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    iget-object v2, p0, Lh8;->l:Lf8;

    iget-object v2, v2, Lf8;->a:Li8;

    invoke-virtual {v2, v1}, Li8;->b(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Lh8;->f:[Le8;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public t()V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lh8;->l:Lf8;

    iget-object v3, v2, Lf8;->c:[Lk8;

    array-length v4, v3

    if-ge v1, v4, :cond_1

    aget-object v2, v3, v1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lk8;->c()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, v2, Lf8;->b:Li8;

    iget-object v2, p0, Lh8;->m:[Lk8;

    iget v3, p0, Lh8;->n:I

    const/4 v4, 0x0

    if-eqz v1, :cond_7

    .line 1
    array-length v5, v2

    if-le v3, v5, :cond_2

    array-length v3, v2

    :cond_2
    const/4 v5, 0x0

    :goto_1
    if-ge v5, v3, :cond_4

    aget-object v6, v2, v5

    iget v7, v1, Li8;->b:I

    iget-object v8, v1, Li8;->a:[Ljava/lang/Object;

    array-length v9, v8

    if-ge v7, v9, :cond_3

    aput-object v6, v8, v7

    add-int/lit8 v7, v7, 0x1

    iput v7, v1, Li8;->b:I

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 2
    :cond_4
    iput v0, p0, Lh8;->n:I

    iget-object v1, p0, Lh8;->l:Lf8;

    iget-object v1, v1, Lf8;->c:[Lk8;

    invoke-static {v1, v4}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lh8;->b:Ljava/util/HashMap;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    :cond_5
    iput v0, p0, Lh8;->a:I

    iget-object v1, p0, Lh8;->c:Le8;

    .line 3
    iget-object v2, v1, Le8;->d:Ld8;

    invoke-virtual {v2}, Ld8;->b()V

    iput-object v4, v1, Le8;->a:Lk8;

    const/4 v2, 0x0

    iput v2, v1, Le8;->b:F

    const/4 v1, 0x1

    .line 4
    iput v1, p0, Lh8;->i:I

    const/4 v1, 0x0

    :goto_2
    iget v2, p0, Lh8;->j:I

    if-ge v1, v2, :cond_6

    iget-object v2, p0, Lh8;->f:[Le8;

    aget-object v2, v2, v1

    iput-boolean v0, v2, Le8;->c:Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, Lh8;->s()V

    iput v0, p0, Lh8;->j:I

    return-void

    .line 5
    :cond_7
    goto :goto_4

    :goto_3
    throw v4

    :goto_4
    goto :goto_3
.end method

.method public final u(Le8;)V
    .locals 11

    iget v0, p0, Lh8;->j:I

    if-lez v0, :cond_3

    iget-object v0, p1, Le8;->d:Ld8;

    iget-object v1, p0, Lh8;->f:[Le8;

    .line 1
    :goto_0
    iget v2, v0, Ld8;->i:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    const/4 v5, -0x1

    const/4 v6, 0x1

    if-eq v2, v5, :cond_2

    iget v7, v0, Ld8;->a:I

    if-ge v4, v7, :cond_2

    iget-object v7, v0, Ld8;->c:Lf8;

    iget-object v7, v7, Lf8;->c:[Lk8;

    iget-object v8, v0, Ld8;->f:[I

    aget v8, v8, v2

    aget-object v7, v7, v8

    iget v8, v7, Lk8;->c:I

    if-eq v8, v5, :cond_1

    iget-object v4, v0, Ld8;->h:[F

    aget v2, v4, v2

    invoke-virtual {v0, v7, v6}, Ld8;->i(Lk8;Z)F

    iget v4, v7, Lk8;->c:I

    aget-object v4, v1, v4

    iget-boolean v7, v4, Le8;->e:Z

    if-nez v7, :cond_0

    iget-object v7, v4, Le8;->d:Ld8;

    iget v8, v7, Ld8;->i:I

    :goto_2
    if-eq v8, v5, :cond_0

    iget v9, v7, Ld8;->a:I

    if-ge v3, v9, :cond_0

    iget-object v9, v0, Ld8;->c:Lf8;

    iget-object v9, v9, Lf8;->c:[Lk8;

    iget-object v10, v7, Ld8;->f:[I

    aget v10, v10, v8

    aget-object v9, v9, v10

    iget-object v10, v7, Ld8;->h:[F

    aget v10, v10, v8

    mul-float v10, v10, v2

    invoke-virtual {v0, v9, v10, v6}, Ld8;->a(Lk8;FZ)V

    iget-object v9, v7, Ld8;->g:[I

    aget v8, v9, v8

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_0
    iget v3, p1, Le8;->b:F

    iget v5, v4, Le8;->b:F

    mul-float v5, v5, v2

    add-float/2addr v5, v3

    iput v5, p1, Le8;->b:F

    iget-object v2, v4, Le8;->a:Lk8;

    invoke-virtual {v2, p1}, Lk8;->b(Le8;)V

    goto :goto_0

    :cond_1
    iget-object v5, v0, Ld8;->g:[I

    aget v2, v5, v2

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 2
    :cond_2
    iget-object v0, p1, Le8;->d:Ld8;

    iget v0, v0, Ld8;->a:I

    if-nez v0, :cond_3

    iput-boolean v6, p1, Le8;->e:Z

    :cond_3
    return-void
.end method
