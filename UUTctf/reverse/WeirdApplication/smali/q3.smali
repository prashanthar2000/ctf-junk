.class public Lq3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic b:Ls3;


# direct methods
.method public constructor <init>(Ls3;)V
    .locals 0

    iput-object p1, p0, Lq3;->b:Ls3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    iget-object v0, p0, Lq3;->b:Ls3;

    invoke-virtual {v0}, Ls3;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lq3;->b:Ls3;

    iget-object v1, v0, Ls3;->j:Ll6;

    .line 1
    iget-boolean v1, v1, Li6;->B:Z

    if-nez v1, :cond_2

    .line 2
    iget-object v0, v0, Ls3;->o:Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lq3;->b:Ls3;

    iget-object v0, v0, Ls3;->j:Ll6;

    invoke-virtual {v0}, Li6;->i()V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lq3;->b:Ls3;

    invoke-virtual {v0}, Ls3;->dismiss()V

    :cond_2
    :goto_1
    return-void
.end method
