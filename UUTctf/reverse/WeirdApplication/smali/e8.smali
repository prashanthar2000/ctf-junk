.class public Le8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lk8;

.field public b:F

.field public c:Z

.field public final d:Ld8;

.field public e:Z


# direct methods
.method public constructor <init>(Lf8;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Le8;->a:Lk8;

    const/4 v0, 0x0

    iput v0, p0, Le8;->b:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Le8;->e:Z

    new-instance v0, Ld8;

    invoke-direct {v0, p0, p1}, Ld8;-><init>(Le8;Lf8;)V

    iput-object v0, p0, Le8;->d:Ld8;

    return-void
.end method


# virtual methods
.method public a(Lh8;I)Le8;
    .locals 3

    iget-object v0, p0, Le8;->d:Ld8;

    const-string v1, "ep"

    invoke-virtual {p1, p2, v1}, Lh8;->k(ILjava/lang/String;)Lk8;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Ld8;->h(Lk8;F)V

    iget-object v0, p0, Le8;->d:Ld8;

    const-string v1, "em"

    invoke-virtual {p1, p2, v1}, Lh8;->k(ILjava/lang/String;)Lk8;

    move-result-object p1

    const/high16 p2, -0x40800000    # -1.0f

    invoke-virtual {v0, p1, p2}, Ld8;->h(Lk8;F)V

    return-object p0
.end method

.method public b(Lk8;)V
    .locals 3

    iget v0, p1, Lk8;->d:I

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    const/high16 v1, 0x447a0000    # 1000.0f

    goto :goto_0

    :cond_1
    const/4 v2, 0x3

    if-ne v0, v2, :cond_2

    const v1, 0x49742400    # 1000000.0f

    goto :goto_0

    :cond_2
    const/4 v2, 0x4

    if-ne v0, v2, :cond_3

    const v1, 0x4e6e6b28    # 1.0E9f

    goto :goto_0

    :cond_3
    const/4 v2, 0x5

    if-ne v0, v2, :cond_4

    const v1, 0x5368d4a5    # 1.0E12f

    :cond_4
    :goto_0
    iget-object v0, p0, Le8;->d:Ld8;

    invoke-virtual {v0, p1, v1}, Ld8;->h(Lk8;F)V

    return-void
.end method

.method public c(Lk8;Lk8;Lk8;Lk8;F)Le8;
    .locals 2

    iget-object v0, p0, Le8;->d:Ld8;

    const/high16 v1, -0x40800000    # -1.0f

    invoke-virtual {v0, p1, v1}, Ld8;->h(Lk8;F)V

    iget-object p1, p0, Le8;->d:Ld8;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2, v0}, Ld8;->h(Lk8;F)V

    iget-object p1, p0, Le8;->d:Ld8;

    invoke-virtual {p1, p3, p5}, Ld8;->h(Lk8;F)V

    iget-object p1, p0, Le8;->d:Ld8;

    neg-float p2, p5

    invoke-virtual {p1, p4, p2}, Ld8;->h(Lk8;F)V

    return-object p0
.end method

.method public d(Lk8;Lk8;Lk8;I)Le8;
    .locals 2

    const/4 v0, 0x0

    if-eqz p4, :cond_1

    if-gez p4, :cond_0

    mul-int/lit8 p4, p4, -0x1

    const/4 v0, 0x1

    :cond_0
    int-to-float p4, p4

    iput p4, p0, Le8;->b:F

    :cond_1
    const/high16 p4, -0x40800000    # -1.0f

    const/high16 v1, 0x3f800000    # 1.0f

    if-nez v0, :cond_2

    iget-object v0, p0, Le8;->d:Ld8;

    invoke-virtual {v0, p1, p4}, Ld8;->h(Lk8;F)V

    iget-object p1, p0, Le8;->d:Ld8;

    invoke-virtual {p1, p2, v1}, Ld8;->h(Lk8;F)V

    iget-object p1, p0, Le8;->d:Ld8;

    invoke-virtual {p1, p3, v1}, Ld8;->h(Lk8;F)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Le8;->d:Ld8;

    invoke-virtual {v0, p1, v1}, Ld8;->h(Lk8;F)V

    iget-object p1, p0, Le8;->d:Ld8;

    invoke-virtual {p1, p2, p4}, Ld8;->h(Lk8;F)V

    iget-object p1, p0, Le8;->d:Ld8;

    invoke-virtual {p1, p3, p4}, Ld8;->h(Lk8;F)V

    :goto_0
    return-object p0
.end method

.method public e(Lk8;Lk8;Lk8;I)Le8;
    .locals 2

    const/4 v0, 0x0

    if-eqz p4, :cond_1

    if-gez p4, :cond_0

    mul-int/lit8 p4, p4, -0x1

    const/4 v0, 0x1

    :cond_0
    int-to-float p4, p4

    iput p4, p0, Le8;->b:F

    :cond_1
    const/high16 p4, -0x40800000    # -1.0f

    const/high16 v1, 0x3f800000    # 1.0f

    if-nez v0, :cond_2

    iget-object v0, p0, Le8;->d:Ld8;

    invoke-virtual {v0, p1, p4}, Ld8;->h(Lk8;F)V

    iget-object p1, p0, Le8;->d:Ld8;

    invoke-virtual {p1, p2, v1}, Ld8;->h(Lk8;F)V

    iget-object p1, p0, Le8;->d:Ld8;

    invoke-virtual {p1, p3, p4}, Ld8;->h(Lk8;F)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Le8;->d:Ld8;

    invoke-virtual {v0, p1, v1}, Ld8;->h(Lk8;F)V

    iget-object p1, p0, Le8;->d:Ld8;

    invoke-virtual {p1, p2, p4}, Ld8;->h(Lk8;F)V

    iget-object p1, p0, Le8;->d:Ld8;

    invoke-virtual {p1, p3, v1}, Ld8;->h(Lk8;F)V

    :goto_0
    return-object p0
.end method

.method public f(Lk8;Lk8;Lk8;Lk8;F)Le8;
    .locals 2

    iget-object v0, p0, Le8;->d:Ld8;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, p3, v1}, Ld8;->h(Lk8;F)V

    iget-object p3, p0, Le8;->d:Ld8;

    invoke-virtual {p3, p4, v1}, Ld8;->h(Lk8;F)V

    iget-object p3, p0, Le8;->d:Ld8;

    const/high16 p4, -0x41000000    # -0.5f

    invoke-virtual {p3, p1, p4}, Ld8;->h(Lk8;F)V

    iget-object p1, p0, Le8;->d:Ld8;

    invoke-virtual {p1, p2, p4}, Ld8;->h(Lk8;F)V

    neg-float p1, p5

    iput p1, p0, Le8;->b:F

    return-object p0
.end method

.method public g(Lk8;)V
    .locals 5

    iget-object v0, p0, Le8;->a:Lk8;

    const/high16 v1, -0x40800000    # -1.0f

    if-eqz v0, :cond_0

    iget-object v2, p0, Le8;->d:Ld8;

    invoke-virtual {v2, v0, v1}, Ld8;->h(Lk8;F)V

    const/4 v0, 0x0

    iput-object v0, p0, Le8;->a:Lk8;

    :cond_0
    iget-object v0, p0, Le8;->d:Ld8;

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v2}, Ld8;->i(Lk8;Z)F

    move-result v0

    mul-float v0, v0, v1

    iput-object p1, p0, Le8;->a:Lk8;

    const/high16 p1, 0x3f800000    # 1.0f

    cmpl-float p1, v0, p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget p1, p0, Le8;->b:F

    div-float/2addr p1, v0

    iput p1, p0, Le8;->b:F

    iget-object p1, p0, Le8;->d:Ld8;

    .line 1
    iget v1, p1, Ld8;->i:I

    const/4 v2, 0x0

    :goto_0
    const/4 v3, -0x1

    if-eq v1, v3, :cond_2

    iget v3, p1, Ld8;->a:I

    if-ge v2, v3, :cond_2

    iget-object v3, p1, Ld8;->h:[F

    aget v4, v3, v1

    div-float/2addr v4, v0

    aput v4, v3, v1

    iget-object v3, p1, Ld8;->g:[I

    aget v1, v3, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, Le8;->a:Lk8;

    if-nez v0, :cond_0

    const-string v0, "0"

    goto :goto_0

    :cond_0
    const-string v0, ""

    invoke-static {v0}, Lgg;->d(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Le8;->a:Lk8;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    const-string v1, " = "

    invoke-static {v0, v1}, Lgg;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Le8;->b:F

    const/4 v2, 0x0

    const/4 v3, 0x0

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_1

    invoke-static {v0}, Lgg;->d(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Le8;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    iget-object v4, p0, Le8;->d:Ld8;

    iget v4, v4, Ld8;->a:I

    :goto_2
    if-ge v3, v4, :cond_8

    iget-object v5, p0, Le8;->d:Ld8;

    invoke-virtual {v5, v3}, Ld8;->e(I)Lk8;

    move-result-object v5

    if-nez v5, :cond_2

    goto :goto_6

    :cond_2
    iget-object v6, p0, Le8;->d:Ld8;

    invoke-virtual {v6, v3}, Ld8;->f(I)F

    move-result v6

    cmpl-float v7, v6, v2

    if-nez v7, :cond_3

    goto :goto_6

    :cond_3
    invoke-virtual {v5}, Lk8;->toString()Ljava/lang/String;

    move-result-object v5

    const/high16 v7, -0x40800000    # -1.0f

    if-nez v1, :cond_4

    cmpg-float v1, v6, v2

    if-gez v1, :cond_6

    invoke-static {v0}, Lgg;->d(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "- "

    goto :goto_3

    :cond_4
    cmpl-float v1, v6, v2

    if-lez v1, :cond_5

    const-string v1, " + "

    invoke-static {v0, v1}, Lgg;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_5
    invoke-static {v0}, Lgg;->d(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " - "

    :goto_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    mul-float v6, v6, v7

    :cond_6
    :goto_4
    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, v6, v1

    if-nez v1, :cond_7

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_5

    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, " "

    :goto_5
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    :goto_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_8
    if-nez v1, :cond_9

    const-string v1, "0.0"

    invoke-static {v0, v1}, Lgg;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_9
    return-object v0
.end method
