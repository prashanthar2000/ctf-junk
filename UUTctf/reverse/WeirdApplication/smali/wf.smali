.class public Lwf;
.super Lxf;
.source ""


# instance fields
.field public final a:Landroid/graphics/Matrix;

.field public final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lxf;",
            ">;"
        }
    .end annotation
.end field

.field public c:F

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public final j:Landroid/graphics/Matrix;

.field public k:I

.field public l:[I

.field public m:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lxf;-><init>(Ltf;)V

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Lwf;->a:Landroid/graphics/Matrix;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lwf;->b:Ljava/util/ArrayList;

    const/4 v1, 0x0

    iput v1, p0, Lwf;->c:F

    iput v1, p0, Lwf;->d:F

    iput v1, p0, Lwf;->e:F

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, p0, Lwf;->f:F

    iput v2, p0, Lwf;->g:F

    iput v1, p0, Lwf;->h:F

    iput v1, p0, Lwf;->i:F

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Lwf;->j:Landroid/graphics/Matrix;

    iput-object v0, p0, Lwf;->m:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lwf;Lu7;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwf;",
            "Lu7<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lxf;-><init>(Ltf;)V

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Lwf;->a:Landroid/graphics/Matrix;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lwf;->b:Ljava/util/ArrayList;

    const/4 v1, 0x0

    iput v1, p0, Lwf;->c:F

    iput v1, p0, Lwf;->d:F

    iput v1, p0, Lwf;->e:F

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, p0, Lwf;->f:F

    iput v2, p0, Lwf;->g:F

    iput v1, p0, Lwf;->h:F

    iput v1, p0, Lwf;->i:F

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Lwf;->j:Landroid/graphics/Matrix;

    iput-object v0, p0, Lwf;->m:Ljava/lang/String;

    iget v0, p1, Lwf;->c:F

    iput v0, p0, Lwf;->c:F

    iget v0, p1, Lwf;->d:F

    iput v0, p0, Lwf;->d:F

    iget v0, p1, Lwf;->e:F

    iput v0, p0, Lwf;->e:F

    iget v0, p1, Lwf;->f:F

    iput v0, p0, Lwf;->f:F

    iget v0, p1, Lwf;->g:F

    iput v0, p0, Lwf;->g:F

    iget v0, p1, Lwf;->h:F

    iput v0, p0, Lwf;->h:F

    iget v0, p1, Lwf;->i:F

    iput v0, p0, Lwf;->i:F

    iget-object v0, p1, Lwf;->l:[I

    iput-object v0, p0, Lwf;->l:[I

    iget-object v0, p1, Lwf;->m:Ljava/lang/String;

    iput-object v0, p0, Lwf;->m:Ljava/lang/String;

    iget v1, p1, Lwf;->k:I

    iput v1, p0, Lwf;->k:I

    if-eqz v0, :cond_0

    invoke-virtual {p2, v0, p0}, Lb8;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lwf;->j:Landroid/graphics/Matrix;

    iget-object v1, p1, Lwf;->j:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object p1, p1, Lwf;->b:Ljava/util/ArrayList;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_5

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lwf;

    if-eqz v2, :cond_1

    check-cast v1, Lwf;

    iget-object v2, p0, Lwf;->b:Ljava/util/ArrayList;

    new-instance v3, Lwf;

    invoke-direct {v3, v1, p2}, Lwf;-><init>(Lwf;Lu7;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    instance-of v2, v1, Lvf;

    if-eqz v2, :cond_2

    new-instance v2, Lvf;

    check-cast v1, Lvf;

    invoke-direct {v2, v1}, Lvf;-><init>(Lvf;)V

    goto :goto_1

    :cond_2
    instance-of v2, v1, Luf;

    if-eqz v2, :cond_4

    new-instance v2, Luf;

    check-cast v1, Luf;

    invoke-direct {v2, v1}, Luf;-><init>(Luf;)V

    :goto_1
    iget-object v1, p0, Lwf;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v2, Lyf;->b:Ljava/lang/String;

    if-eqz v1, :cond_3

    invoke-virtual {p2, v1, v2}, Lb8;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unknown object in the tree!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lwf;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lwf;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxf;

    invoke-virtual {v2}, Lxf;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public b([I)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lwf;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lwf;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxf;

    invoke-virtual {v2, p1}, Lxf;->b([I)Z

    move-result v2

    or-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Lwf;->j:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    iget-object v0, p0, Lwf;->j:Landroid/graphics/Matrix;

    iget v1, p0, Lwf;->d:F

    neg-float v1, v1

    iget v2, p0, Lwf;->e:F

    neg-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    iget-object v0, p0, Lwf;->j:Landroid/graphics/Matrix;

    iget v1, p0, Lwf;->f:F

    iget v2, p0, Lwf;->g:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    iget-object v0, p0, Lwf;->j:Landroid/graphics/Matrix;

    iget v1, p0, Lwf;->c:F

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    iget-object v0, p0, Lwf;->j:Landroid/graphics/Matrix;

    iget v1, p0, Lwf;->h:F

    iget v2, p0, Lwf;->d:F

    add-float/2addr v1, v2

    iget v2, p0, Lwf;->i:F

    iget v3, p0, Lwf;->e:F

    add-float/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    return-void
.end method

.method public getGroupName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwf;->m:Ljava/lang/String;

    return-object v0
.end method

.method public getLocalMatrix()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Lwf;->j:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public getPivotX()F
    .locals 1

    iget v0, p0, Lwf;->d:F

    return v0
.end method

.method public getPivotY()F
    .locals 1

    iget v0, p0, Lwf;->e:F

    return v0
.end method

.method public getRotation()F
    .locals 1

    iget v0, p0, Lwf;->c:F

    return v0
.end method

.method public getScaleX()F
    .locals 1

    iget v0, p0, Lwf;->f:F

    return v0
.end method

.method public getScaleY()F
    .locals 1

    iget v0, p0, Lwf;->g:F

    return v0
.end method

.method public getTranslateX()F
    .locals 1

    iget v0, p0, Lwf;->h:F

    return v0
.end method

.method public getTranslateY()F
    .locals 1

    iget v0, p0, Lwf;->i:F

    return v0
.end method

.method public setPivotX(F)V
    .locals 1

    iget v0, p0, Lwf;->d:F

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    iput p1, p0, Lwf;->d:F

    invoke-virtual {p0}, Lwf;->c()V

    :cond_0
    return-void
.end method

.method public setPivotY(F)V
    .locals 1

    iget v0, p0, Lwf;->e:F

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    iput p1, p0, Lwf;->e:F

    invoke-virtual {p0}, Lwf;->c()V

    :cond_0
    return-void
.end method

.method public setRotation(F)V
    .locals 1

    iget v0, p0, Lwf;->c:F

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    iput p1, p0, Lwf;->c:F

    invoke-virtual {p0}, Lwf;->c()V

    :cond_0
    return-void
.end method

.method public setScaleX(F)V
    .locals 1

    iget v0, p0, Lwf;->f:F

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    iput p1, p0, Lwf;->f:F

    invoke-virtual {p0}, Lwf;->c()V

    :cond_0
    return-void
.end method

.method public setScaleY(F)V
    .locals 1

    iget v0, p0, Lwf;->g:F

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    iput p1, p0, Lwf;->g:F

    invoke-virtual {p0}, Lwf;->c()V

    :cond_0
    return-void
.end method

.method public setTranslateX(F)V
    .locals 1

    iget v0, p0, Lwf;->h:F

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    iput p1, p0, Lwf;->h:F

    invoke-virtual {p0}, Lwf;->c()V

    :cond_0
    return-void
.end method

.method public setTranslateY(F)V
    .locals 1

    iget v0, p0, Lwf;->i:F

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    iput p1, p0, Lwf;->i:F

    invoke-virtual {p0}, Lwf;->c()V

    :cond_0
    return-void
.end method
