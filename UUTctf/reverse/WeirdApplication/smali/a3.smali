.class public La3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;
.implements Landroid/content/DialogInterface$OnClickListener;
.implements Landroid/content/DialogInterface$OnDismissListener;
.implements Lm3$a;


# instance fields
.field public b:Lz2;

.field public c:Lb0;

.field public d:Lx2;


# direct methods
.method public constructor <init>(Lz2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3;->b:Lz2;

    return-void
.end method


# virtual methods
.method public b(Lz2;Z)V
    .locals 0

    if-nez p2, :cond_0

    iget-object p2, p0, La3;->b:Lz2;

    if-ne p1, p2, :cond_1

    .line 1
    :cond_0
    iget-object p1, p0, La3;->c:Lb0;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    :cond_1
    return-void
.end method

.method public c(Lz2;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object p1, p0, La3;->b:Lz2;

    iget-object v0, p0, La3;->d:Lx2;

    invoke-virtual {v0}, Lx2;->a()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lw2;

    .line 1
    invoke-virtual {v0, p2}, Lw2;->b(I)Lc3;

    move-result-object p2

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p2, v0}, Lz2;->r(Landroid/view/MenuItem;I)Z

    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    iget-object p1, p0, La3;->d:Lx2;

    iget-object v0, p0, La3;->b:Lz2;

    .line 1
    iget-object p1, p1, Lx2;->i:Lm3$a;

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lm3$a;->b(Lz2;Z)V

    :cond_0
    return-void
.end method

.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 2

    const/16 v0, 0x52

    if-eq p2, v0, :cond_0

    const/4 v0, 0x4

    if-ne p2, v0, :cond_2

    :cond_0
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_1

    iget-object p1, p0, La3;->c:Lb0;

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1, p3, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V

    return v1

    :cond_1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-ne v0, v1, :cond_2

    invoke-virtual {p3}, Landroid/view/KeyEvent;->isCanceled()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, La3;->c:Lb0;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0, p3}, Landroid/view/KeyEvent$DispatcherState;->isTracking(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p2, p0, La3;->b:Lz2;

    invoke-virtual {p2, v1}, Lz2;->c(Z)V

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return v1

    :cond_2
    iget-object p1, p0, La3;->b:Lz2;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, v0}, Lz2;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result p1

    return p1
.end method
