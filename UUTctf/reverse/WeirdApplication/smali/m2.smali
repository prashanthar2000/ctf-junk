.class public Lm2;
.super Lic;
.source ""


# instance fields
.field public a:Z

.field public b:I

.field public final synthetic c:Ln2;


# direct methods
.method public constructor <init>(Ln2;)V
    .locals 0

    iput-object p1, p0, Lm2;->c:Ln2;

    invoke-direct {p0}, Lic;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lm2;->a:Z

    iput p1, p0, Lm2;->b:I

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget p1, p0, Lm2;->b:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lm2;->b:I

    iget-object v0, p0, Lm2;->c:Ln2;

    iget-object v0, v0, Ln2;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lm2;->c:Ln2;

    iget-object p1, p1, Ln2;->d:Lhc;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lhc;->a(Landroid/view/View;)V

    :cond_0
    const/4 p1, 0x0

    .line 1
    iput p1, p0, Lm2;->b:I

    iput-boolean p1, p0, Lm2;->a:Z

    iget-object v0, p0, Lm2;->c:Ln2;

    .line 2
    iput-boolean p1, v0, Ln2;->e:Z

    :cond_1
    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 1

    iget-boolean p1, p0, Lm2;->a:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lm2;->a:Z

    iget-object p1, p0, Lm2;->c:Ln2;

    iget-object p1, p1, Ln2;->d:Lhc;

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lhc;->b(Landroid/view/View;)V

    :cond_1
    return-void
.end method
