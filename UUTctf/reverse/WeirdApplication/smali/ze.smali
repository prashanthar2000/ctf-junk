.class public Lze;
.super Landroid/app/Fragment;
.source ""


# instance fields
.field public b:Lye;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method

.method public static b(Landroid/app/Activity;)V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    const-string v0, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"

    invoke-virtual {p0, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v1

    new-instance v2, Lze;

    invoke-direct {v2}, Lze;-><init>()V

    invoke-virtual {v1, v2, v0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    invoke-virtual {p0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Loe$a;)V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    instance-of v1, v0, Lre;

    if-eqz v1, :cond_0

    check-cast v0, Lre;

    invoke-interface {v0}, Lre;->e()Loe;

    move-result-object v0

    instance-of v1, v0, Lte;

    if-eqz v1, :cond_0

    check-cast v0, Lte;

    invoke-virtual {v0, p1}, Lte;->e(Loe$a;)V

    :cond_0
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    iget-object p1, p0, Lze;->b:Lye;

    if-eqz p1, :cond_0

    .line 1
    invoke-interface {p1}, Lye;->a()V

    .line 2
    :cond_0
    sget-object p1, Loe$a;->ON_CREATE:Loe$a;

    invoke-virtual {p0, p1}, Lze;->a(Loe$a;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    sget-object v0, Loe$a;->ON_DESTROY:Loe$a;

    invoke-virtual {p0, v0}, Lze;->a(Loe$a;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lze;->b:Lye;

    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onPause()V

    sget-object v0, Loe$a;->ON_PAUSE:Loe$a;

    invoke-virtual {p0, v0}, Lze;->a(Loe$a;)V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    iget-object v0, p0, Lze;->b:Lye;

    if-eqz v0, :cond_0

    .line 1
    invoke-interface {v0}, Lye;->b()V

    .line 2
    :cond_0
    sget-object v0, Loe$a;->ON_RESUME:Loe$a;

    invoke-virtual {p0, v0}, Lze;->a(Loe$a;)V

    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    iget-object v0, p0, Lze;->b:Lye;

    if-eqz v0, :cond_0

    .line 1
    invoke-interface {v0}, Lye;->c()V

    .line 2
    :cond_0
    sget-object v0, Loe$a;->ON_START:Loe$a;

    invoke-virtual {p0, v0}, Lze;->a(Loe$a;)V

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    sget-object v0, Loe$a;->ON_STOP:Loe$a;

    invoke-virtual {p0, v0}, Lze;->a(Loe$a;)V

    return-void
.end method
