.class public Ly8;
.super Lz8;
.source ""


# instance fields
.field public h:I

.field public i:I

.field public j:Ll8;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lz8;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x8

    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public b(Landroid/util/AttributeSet;)V
    .locals 0

    const/4 p1, 0x0

    invoke-super {p0, p1}, Lz8;->b(Landroid/util/AttributeSet;)V

    new-instance p1, Ll8;

    invoke-direct {p1}, Ll8;-><init>()V

    iput-object p1, p0, Ly8;->j:Ll8;

    .line 1
    iput-object p1, p0, Lz8;->e:Ll8;

    invoke-virtual {p0}, Lz8;->d()V

    return-void
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Ly8;->h:I

    return v0
.end method

.method public setAllowsGoneWidget(Z)V
    .locals 1

    iget-object v0, p0, Ly8;->j:Ll8;

    .line 1
    iput-boolean p1, v0, Ll8;->n0:Z

    return-void
.end method

.method public setType(I)V
    .locals 6

    iput p1, p0, Ly8;->h:I

    iput p1, p0, Ly8;->i:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x6

    const/4 v2, 0x5

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/16 v5, 0x11

    if-ge v0, v5, :cond_1

    if-ne p1, v2, :cond_0

    :goto_0
    iput v3, p0, Ly8;->i:I

    goto :goto_3

    :cond_0
    if-ne p1, v1, :cond_6

    :goto_1
    iput v4, p0, Ly8;->i:I

    goto :goto_3

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result p1

    if-ne v4, p1, :cond_2

    const/4 p1, 0x1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    if-eqz p1, :cond_4

    iget p1, p0, Ly8;->h:I

    if-ne p1, v2, :cond_3

    goto :goto_1

    :cond_3
    if-ne p1, v1, :cond_6

    goto :goto_0

    :cond_4
    iget p1, p0, Ly8;->h:I

    if-ne p1, v2, :cond_5

    goto :goto_0

    :cond_5
    if-ne p1, v1, :cond_6

    goto :goto_1

    :cond_6
    :goto_3
    iget-object p1, p0, Ly8;->j:Ll8;

    iget v0, p0, Ly8;->i:I

    .line 1
    iput v0, p1, Ll8;->l0:I

    return-void
.end method
