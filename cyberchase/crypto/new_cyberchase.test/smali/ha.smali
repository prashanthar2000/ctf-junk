.class final Lha;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;
.implements Landroid/content/DialogInterface$OnDismissListener;
.implements Landroid/content/DialogInterface$OnKeyListener;
.implements Lhg$a;


# instance fields
.field a:Lfs;

.field a:Lgx;

.field a:Lgz;

.field private a:Lhg$a;


# direct methods
.method public constructor <init>(Lgz;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lha;->a:Lgz;

    return-void
.end method


# virtual methods
.method public final a(Lgz;Z)V
    .locals 1

    if-nez p2, :cond_0

    iget-object v0, p0, Lha;->a:Lgz;

    if-ne p1, v0, :cond_1

    :cond_0
    iget-object v0, p0, Lha;->a:Lfs;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lfs;->dismiss()V

    :cond_1
    iget-object v0, p0, Lha;->a:Lhg$a;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1, p2}, Lhg$a;->a(Lgz;Z)V

    :cond_2
    return-void
.end method

.method public final a(Lgz;)Z
    .locals 1

    iget-object v0, p0, Lha;->a:Lhg$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lhg$a;->a(Lgz;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object p1, p0, Lha;->a:Lgz;

    iget-object v0, p0, Lha;->a:Lgx;

    invoke-virtual {v0}, Lgx;->a()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0, p2}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lhb;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1}, Lgz;->a(Landroid/view/MenuItem;Lhg;I)Z

    return-void
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    iget-object p1, p0, Lha;->a:Lgx;

    iget-object v0, p0, Lha;->a:Lgz;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lgx;->a(Lgz;Z)V

    return-void
.end method

.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
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

    iget-object p1, p0, Lha;->a:Lfs;

    invoke-virtual {p1}, Lfs;->getWindow()Landroid/view/Window;

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

    iget-object v0, p0, Lha;->a:Lfs;

    invoke-virtual {v0}, Lfs;->getWindow()Landroid/view/Window;

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

    iget-object p2, p0, Lha;->a:Lgz;

    invoke-virtual {p2, v1}, Lgz;->a(Z)V

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return v1

    :cond_2
    iget-object p1, p0, Lha;->a:Lgz;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, v0}, Lgz;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result p1

    return p1
.end method
