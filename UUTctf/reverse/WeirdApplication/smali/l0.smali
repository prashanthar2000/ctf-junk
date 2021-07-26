.class public Ll0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ly0;


# direct methods
.method public constructor <init>(Ly0;)V
    .locals 0

    iput-object p1, p0, Ll0;->b:Ly0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Ll0;->b:Ly0;

    iget-object v1, v0, Ly0;->q:Landroid/widget/PopupWindow;

    iget-object v0, v0, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v2, 0x37

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3, v3}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    iget-object v0, p0, Ll0;->b:Ly0;

    invoke-virtual {v0}, Ly0;->x()V

    iget-object v0, p0, Ll0;->b:Ly0;

    invoke-virtual {v0}, Ly0;->J()Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll0;->b:Ly0;

    iget-object v0, v0, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object v0, p0, Ll0;->b:Ly0;

    iget-object v2, v0, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v2}, Lbc;->a(Landroid/view/View;)Lgc;

    move-result-object v2

    invoke-virtual {v2, v1}, Lgc;->a(F)Lgc;

    iput-object v2, v0, Ly0;->s:Lgc;

    iget-object v0, p0, Ll0;->b:Ly0;

    iget-object v0, v0, Ly0;->s:Lgc;

    new-instance v1, Lk0;

    invoke-direct {v1, p0}, Lk0;-><init>(Ll0;)V

    invoke-virtual {v0, v1}, Lgc;->d(Lhc;)Lgc;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll0;->b:Ly0;

    iget-object v0, v0, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object v0, p0, Ll0;->b:Ly0;

    iget-object v0, v0, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    :goto_0
    return-void
.end method
