.class public Lt8;
.super Lv8;
.source ""


# instance fields
.field public c:Ln8;

.field public d:Lt8;

.field public e:F

.field public f:Lt8;

.field public g:F

.field public h:I

.field public i:Lt8;

.field public j:Lu8;

.field public k:I

.field public l:Lu8;

.field public m:I


# direct methods
.method public constructor <init>(Ln8;)V
    .locals 2

    invoke-direct {p0}, Lv8;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lt8;->h:I

    const/4 v0, 0x0

    iput-object v0, p0, Lt8;->j:Lu8;

    const/4 v1, 0x1

    iput v1, p0, Lt8;->k:I

    iput-object v0, p0, Lt8;->l:Lu8;

    iput v1, p0, Lt8;->m:I

    iput-object p1, p0, Lt8;->c:Ln8;

    return-void
.end method


# virtual methods
.method public d()V
    .locals 8

    sget-object v0, Ln8$b;->e:Ln8$b;

    iget v1, p0, Lv8;->b:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    iget v1, p0, Lt8;->h:I

    const/4 v3, 0x4

    if-ne v1, v3, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Lt8;->j:Lu8;

    if-eqz v1, :cond_3

    iget v3, v1, Lv8;->b:I

    if-eq v3, v2, :cond_2

    return-void

    :cond_2
    iget v3, p0, Lt8;->k:I

    int-to-float v3, v3

    iget v1, v1, Lu8;->c:F

    mul-float v3, v3, v1

    iput v3, p0, Lt8;->e:F

    :cond_3
    iget-object v1, p0, Lt8;->l:Lu8;

    if-eqz v1, :cond_5

    iget v3, v1, Lv8;->b:I

    if-eq v3, v2, :cond_4

    return-void

    :cond_4
    iget v1, v1, Lu8;->c:F

    :cond_5
    iget v1, p0, Lt8;->h:I

    if-ne v1, v2, :cond_8

    iget-object v1, p0, Lt8;->d:Lt8;

    if-eqz v1, :cond_6

    iget v1, v1, Lv8;->b:I

    if-ne v1, v2, :cond_8

    :cond_6
    iget-object v0, p0, Lt8;->d:Lt8;

    if-nez v0, :cond_7

    iput-object p0, p0, Lt8;->f:Lt8;

    iget v0, p0, Lt8;->e:F

    goto :goto_0

    :cond_7
    iget-object v1, v0, Lt8;->f:Lt8;

    iput-object v1, p0, Lt8;->f:Lt8;

    iget v0, v0, Lt8;->g:F

    iget v1, p0, Lt8;->e:F

    add-float/2addr v0, v1

    :goto_0
    iput v0, p0, Lt8;->g:F

    invoke-virtual {p0}, Lv8;->a()V

    goto/16 :goto_7

    :cond_8
    iget v1, p0, Lt8;->h:I

    const/4 v3, 0x2

    if-ne v1, v3, :cond_10

    iget-object v1, p0, Lt8;->d:Lt8;

    if-eqz v1, :cond_10

    iget v3, v1, Lv8;->b:I

    if-ne v3, v2, :cond_10

    iget-object v3, p0, Lt8;->i:Lt8;

    if-eqz v3, :cond_10

    iget-object v4, v3, Lt8;->d:Lt8;

    if-eqz v4, :cond_10

    iget v5, v4, Lv8;->b:I

    if-ne v5, v2, :cond_10

    iget-object v1, v1, Lt8;->f:Lt8;

    iput-object v1, p0, Lt8;->f:Lt8;

    iget-object v1, v4, Lt8;->f:Lt8;

    iput-object v1, v3, Lt8;->f:Lt8;

    iget-object v1, p0, Lt8;->c:Ln8;

    iget-object v1, v1, Ln8;->c:Ln8$b;

    const/4 v3, 0x0

    if-eq v1, v0, :cond_a

    sget-object v4, Ln8$b;->f:Ln8$b;

    if-ne v1, v4, :cond_9

    goto :goto_1

    :cond_9
    const/4 v2, 0x0

    :cond_a
    :goto_1
    if-eqz v2, :cond_b

    iget-object v1, p0, Lt8;->d:Lt8;

    iget v1, v1, Lt8;->g:F

    iget-object v4, p0, Lt8;->i:Lt8;

    iget-object v4, v4, Lt8;->d:Lt8;

    goto :goto_2

    :cond_b
    iget-object v1, p0, Lt8;->i:Lt8;

    iget-object v1, v1, Lt8;->d:Lt8;

    iget v1, v1, Lt8;->g:F

    iget-object v4, p0, Lt8;->d:Lt8;

    :goto_2
    iget v4, v4, Lt8;->g:F

    sub-float/2addr v1, v4

    iget-object v4, p0, Lt8;->c:Ln8;

    iget-object v5, v4, Ln8;->c:Ln8$b;

    sget-object v6, Ln8$b;->c:Ln8$b;

    if-eq v5, v6, :cond_d

    if-ne v5, v0, :cond_c

    goto :goto_3

    :cond_c
    iget-object v0, v4, Ln8;->b:Lo8;

    invoke-virtual {v0}, Lo8;->h()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v1, v0

    iget-object v0, p0, Lt8;->c:Ln8;

    iget-object v0, v0, Ln8;->b:Lo8;

    iget v0, v0, Lo8;->W:F

    goto :goto_4

    :cond_d
    :goto_3
    iget-object v0, p0, Lt8;->c:Ln8;

    iget-object v0, v0, Ln8;->b:Lo8;

    invoke-virtual {v0}, Lo8;->n()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v1, v0

    iget-object v0, p0, Lt8;->c:Ln8;

    iget-object v0, v0, Ln8;->b:Lo8;

    iget v0, v0, Lo8;->V:F

    :goto_4
    iget-object v4, p0, Lt8;->c:Ln8;

    invoke-virtual {v4}, Ln8;->b()I

    move-result v4

    iget-object v5, p0, Lt8;->i:Lt8;

    iget-object v5, v5, Lt8;->c:Ln8;

    invoke-virtual {v5}, Ln8;->b()I

    move-result v5

    iget-object v6, p0, Lt8;->c:Ln8;

    .line 1
    iget-object v6, v6, Ln8;->d:Ln8;

    .line 2
    iget-object v7, p0, Lt8;->i:Lt8;

    iget-object v7, v7, Lt8;->c:Ln8;

    .line 3
    iget-object v7, v7, Ln8;->d:Ln8;

    if-ne v6, v7, :cond_e

    const/high16 v0, 0x3f000000    # 0.5f

    const/4 v5, 0x0

    goto :goto_5

    :cond_e
    move v3, v4

    :goto_5
    int-to-float v3, v3

    sub-float/2addr v1, v3

    int-to-float v4, v5

    sub-float/2addr v1, v4

    const/high16 v5, 0x3f800000    # 1.0f

    if-eqz v2, :cond_f

    .line 4
    iget-object v2, p0, Lt8;->i:Lt8;

    iget-object v6, v2, Lt8;->d:Lt8;

    iget v6, v6, Lt8;->g:F

    add-float/2addr v6, v4

    mul-float v4, v1, v0

    add-float/2addr v4, v6

    iput v4, v2, Lt8;->g:F

    iget-object v2, p0, Lt8;->d:Lt8;

    iget v2, v2, Lt8;->g:F

    sub-float/2addr v2, v3

    sub-float/2addr v5, v0

    mul-float v5, v5, v1

    sub-float/2addr v2, v5

    iput v2, p0, Lt8;->g:F

    goto :goto_6

    :cond_f
    iget-object v2, p0, Lt8;->d:Lt8;

    iget v2, v2, Lt8;->g:F

    add-float/2addr v2, v3

    mul-float v3, v1, v0

    add-float/2addr v3, v2

    iput v3, p0, Lt8;->g:F

    iget-object v2, p0, Lt8;->i:Lt8;

    iget-object v3, v2, Lt8;->d:Lt8;

    iget v3, v3, Lt8;->g:F

    sub-float/2addr v3, v4

    sub-float/2addr v5, v0

    mul-float v5, v5, v1

    sub-float/2addr v3, v5

    iput v3, v2, Lt8;->g:F

    goto :goto_6

    :cond_10
    iget v0, p0, Lt8;->h:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_11

    iget-object v0, p0, Lt8;->d:Lt8;

    if-eqz v0, :cond_11

    iget v1, v0, Lv8;->b:I

    if-ne v1, v2, :cond_11

    iget-object v1, p0, Lt8;->i:Lt8;

    if-eqz v1, :cond_11

    iget-object v3, v1, Lt8;->d:Lt8;

    if-eqz v3, :cond_11

    iget v4, v3, Lv8;->b:I

    if-ne v4, v2, :cond_11

    iget-object v2, v0, Lt8;->f:Lt8;

    iput-object v2, p0, Lt8;->f:Lt8;

    iget-object v2, v3, Lt8;->f:Lt8;

    iput-object v2, v1, Lt8;->f:Lt8;

    iget v0, v0, Lt8;->g:F

    iget v2, p0, Lt8;->e:F

    add-float/2addr v0, v2

    iput v0, p0, Lt8;->g:F

    iget v0, v3, Lt8;->g:F

    iget v2, v1, Lt8;->e:F

    add-float/2addr v0, v2

    iput v0, v1, Lt8;->g:F

    :goto_6
    invoke-virtual {p0}, Lv8;->a()V

    iget-object v0, p0, Lt8;->i:Lt8;

    invoke-virtual {v0}, Lv8;->a()V

    goto :goto_7

    :cond_11
    iget v0, p0, Lt8;->h:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_12

    iget-object v0, p0, Lt8;->c:Ln8;

    iget-object v0, v0, Ln8;->b:Lo8;

    invoke-virtual {v0}, Lo8;->u()V

    :cond_12
    :goto_7
    return-void
.end method

.method public e(Lh8;)V
    .locals 4

    iget-object v0, p0, Lt8;->c:Ln8;

    .line 1
    iget-object v0, v0, Ln8;->i:Lk8;

    .line 2
    iget-object v1, p0, Lt8;->f:Lt8;

    const/high16 v2, 0x3f000000    # 0.5f

    if-nez v1, :cond_0

    iget v1, p0, Lt8;->g:F

    add-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {p1, v0, v1}, Lh8;->e(Lk8;I)V

    goto :goto_0

    :cond_0
    iget-object v1, v1, Lt8;->c:Ln8;

    invoke-virtual {p1, v1}, Lh8;->l(Ljava/lang/Object;)Lk8;

    move-result-object v1

    iget v3, p0, Lt8;->g:F

    add-float/2addr v3, v2

    float-to-int v2, v3

    const/4 v3, 0x6

    invoke-virtual {p1, v0, v1, v2, v3}, Lh8;->d(Lk8;Lk8;II)Le8;

    :goto_0
    return-void
.end method

.method public f(ILt8;I)V
    .locals 0

    iput p1, p0, Lt8;->h:I

    iput-object p2, p0, Lt8;->d:Lt8;

    int-to-float p1, p3

    iput p1, p0, Lt8;->e:F

    .line 1
    iget-object p1, p2, Lv8;->a:Ljava/util/HashSet;

    invoke-virtual {p1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public g(Lt8;I)V
    .locals 0

    iput-object p1, p0, Lt8;->d:Lt8;

    int-to-float p2, p2

    iput p2, p0, Lt8;->e:F

    .line 1
    iget-object p1, p1, Lv8;->a:Ljava/util/HashSet;

    invoke-virtual {p1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public h(Lt8;ILu8;)V
    .locals 0

    iput-object p1, p0, Lt8;->d:Lt8;

    .line 1
    iget-object p1, p1, Lv8;->a:Ljava/util/HashSet;

    invoke-virtual {p1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2
    iput-object p3, p0, Lt8;->j:Lu8;

    iput p2, p0, Lt8;->k:I

    .line 3
    iget-object p1, p3, Lv8;->a:Ljava/util/HashSet;

    invoke-virtual {p1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public i()V
    .locals 4

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lv8;->b:I

    iget-object v1, p0, Lv8;->a:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    const/4 v1, 0x0

    .line 2
    iput-object v1, p0, Lt8;->d:Lt8;

    const/4 v2, 0x0

    iput v2, p0, Lt8;->e:F

    iput-object v1, p0, Lt8;->j:Lu8;

    const/4 v3, 0x1

    iput v3, p0, Lt8;->k:I

    iput-object v1, p0, Lt8;->l:Lu8;

    iput v3, p0, Lt8;->m:I

    iput-object v1, p0, Lt8;->f:Lt8;

    iput v2, p0, Lt8;->g:F

    iput-object v1, p0, Lt8;->i:Lt8;

    iput v0, p0, Lt8;->h:I

    return-void
.end method

.method public j(Lt8;F)V
    .locals 1

    iget v0, p0, Lv8;->b:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt8;->f:Lt8;

    if-eq v0, p1, :cond_2

    iget v0, p0, Lt8;->g:F

    cmpl-float v0, v0, p2

    if-eqz v0, :cond_2

    :cond_0
    iput-object p1, p0, Lt8;->f:Lt8;

    iput p2, p0, Lt8;->g:F

    iget p1, p0, Lv8;->b:I

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    invoke-virtual {p0}, Lv8;->b()V

    :cond_1
    invoke-virtual {p0}, Lv8;->a()V

    :cond_2
    return-void
.end method

.method public k(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const-string p1, "DIRECT"

    return-object p1

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    const-string p1, "CENTER"

    return-object p1

    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    const-string p1, "MATCH"

    return-object p1

    :cond_2
    const/4 v0, 0x4

    if-ne p1, v0, :cond_3

    const-string p1, "CHAIN"

    return-object p1

    :cond_3
    const/4 v0, 0x5

    if-ne p1, v0, :cond_4

    const-string p1, "BARRIER"

    return-object p1

    :cond_4
    const-string p1, "UNCONNECTED"

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lv8;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lt8;->f:Lt8;

    const-string v1, ", RESOLVED: "

    const-string v2, "["

    if-ne v0, p0, :cond_0

    invoke-static {v2}, Lgg;->d(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lt8;->c:Ln8;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lt8;->g:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "]  type: "

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lgg;->d(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lt8;->c:Ln8;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt8;->f:Lt8;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lt8;->g:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "] type: "

    goto :goto_0

    :cond_1
    const-string v0, "{ "

    invoke-static {v0}, Lgg;->d(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lt8;->c:Ln8;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " UNRESOLVED} type: "

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lt8;->h:I

    invoke-virtual {p0, v1}, Lt8;->k(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
