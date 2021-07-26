.class public Ld5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic b:Lf5;


# direct methods
.method public constructor <init>(Lf5;)V
    .locals 0

    iput-object p1, p0, Ld5;->b:Lf5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 3

    iget-object v0, p0, Ld5;->b:Lf5;

    iget-object v1, v0, Lf5;->K:Lj5;

    if-eqz v0, :cond_2

    .line 1
    invoke-static {v1}, Lbc;->i(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, v0, Lf5;->I:Landroid/graphics/Rect;

    invoke-virtual {v1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Ld5;->b:Lf5;

    invoke-virtual {v0}, Li6;->dismiss()V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Ld5;->b:Lf5;

    invoke-virtual {v0}, Lf5;->u()V

    iget-object v0, p0, Ld5;->b:Lf5;

    invoke-static {v0}, Lf5;->t(Lf5;)V

    :goto_1
    return-void

    :cond_2
    const/4 v0, 0x0

    .line 3
    throw v0
.end method
