.class public Lk0;
.super Lic;
.source ""


# instance fields
.field public final synthetic a:Ll0;


# direct methods
.method public constructor <init>(Ll0;)V
    .locals 0

    iput-object p1, p0, Lk0;->a:Ll0;

    invoke-direct {p0}, Lic;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lk0;->a:Ll0;

    iget-object p1, p1, Ll0;->b:Ly0;

    iget-object p1, p1, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object p1, p0, Lk0;->a:Ll0;

    iget-object p1, p1, Ll0;->b:Ly0;

    iget-object p1, p1, Ly0;->s:Lgc;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lgc;->d(Lhc;)Lgc;

    iget-object p1, p0, Lk0;->a:Ll0;

    iget-object p1, p1, Ll0;->b:Ly0;

    iput-object v0, p1, Ly0;->s:Lgc;

    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lk0;->a:Ll0;

    iget-object p1, p1, Ll0;->b:Ly0;

    iget-object p1, p1, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    return-void
.end method
