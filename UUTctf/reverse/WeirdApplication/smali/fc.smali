.class public Lfc;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lhc;


# instance fields
.field public a:Lgc;

.field public b:Z


# direct methods
.method public constructor <init>(Lgc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfc;->a:Lgc;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lfc;->a:Lgc;

    iget v0, v0, Lgc;->d:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    invoke-virtual {p1, v0, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    iget-object v0, p0, Lfc;->a:Lgc;

    iput v1, v0, Lgc;->d:I

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_1

    iget-boolean v0, p0, Lfc;->b:Z

    if-nez v0, :cond_5

    :cond_1
    iget-object v0, p0, Lfc;->a:Lgc;

    iget-object v1, v0, Lgc;->c:Ljava/lang/Runnable;

    if-eqz v1, :cond_2

    iput-object v2, v0, Lgc;->c:Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    :cond_2
    const/high16 v0, 0x7e000000

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lhc;

    if-eqz v1, :cond_3

    move-object v2, v0

    check-cast v2, Lhc;

    :cond_3
    if-eqz v2, :cond_4

    invoke-interface {v2, p1}, Lhc;->a(Landroid/view/View;)V

    :cond_4
    const/4 p1, 0x1

    iput-boolean p1, p0, Lfc;->b:Z

    :cond_5
    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lfc;->b:Z

    iget-object v0, p0, Lfc;->a:Lgc;

    iget v0, v0, Lgc;->d:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-le v0, v2, :cond_0

    const/4 v0, 0x2

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_0
    iget-object v0, p0, Lfc;->a:Lgc;

    iget-object v2, v0, Lgc;->b:Ljava/lang/Runnable;

    if-eqz v2, :cond_1

    iput-object v1, v0, Lgc;->b:Ljava/lang/Runnable;

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    :cond_1
    const/high16 v0, 0x7e000000

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Lhc;

    if-eqz v2, :cond_2

    move-object v1, v0

    check-cast v1, Lhc;

    :cond_2
    if-eqz v1, :cond_3

    invoke-interface {v1, p1}, Lhc;->b(Landroid/view/View;)V

    :cond_3
    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 2

    const/high16 v0, 0x7e000000

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lhc;

    if-eqz v1, :cond_0

    check-cast v0, Lhc;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lhc;->c(Landroid/view/View;)V

    :cond_1
    return-void
.end method
