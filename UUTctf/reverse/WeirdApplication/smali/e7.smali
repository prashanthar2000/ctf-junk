.class public Le7;
.super Lic;
.source ""


# instance fields
.field public a:Z

.field public final synthetic b:I

.field public final synthetic c:Lf7;


# direct methods
.method public constructor <init>(Lf7;I)V
    .locals 0

    iput-object p1, p0, Le7;->c:Lf7;

    iput p2, p0, Le7;->b:I

    invoke-direct {p0}, Lic;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Le7;->a:Z

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget-boolean p1, p0, Le7;->a:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Le7;->c:Lf7;

    iget-object p1, p1, Lf7;->a:Landroidx/appcompat/widget/Toolbar;

    iget v0, p0, Le7;->b:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Le7;->c:Lf7;

    iget-object p1, p1, Lf7;->a:Landroidx/appcompat/widget/Toolbar;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Le7;->a:Z

    return-void
.end method
