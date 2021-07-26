.class public abstract Landroidx/activity/ComponentActivity;
.super Lq9;
.source ""

# interfaces
.implements Lre;
.implements Ldf;
.implements Ljf;
.implements Le;


# instance fields
.field public final c:Lte;

.field public final d:Lif;

.field public e:Lcf;

.field public final f:Landroidx/activity/OnBackPressedDispatcher;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lq9;-><init>()V

    new-instance v0, Lte;

    invoke-direct {v0, p0}, Lte;-><init>(Lre;)V

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->c:Lte;

    .line 1
    new-instance v0, Lif;

    invoke-direct {v0, p0}, Lif;-><init>(Ljf;)V

    .line 2
    iput-object v0, p0, Landroidx/activity/ComponentActivity;->d:Lif;

    new-instance v0, Landroidx/activity/OnBackPressedDispatcher;

    new-instance v1, Lb;

    invoke-direct {v1, p0}, Lb;-><init>(Landroidx/activity/ComponentActivity;)V

    invoke-direct {v0, v1}, Landroidx/activity/OnBackPressedDispatcher;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->f:Landroidx/activity/OnBackPressedDispatcher;

    .line 3
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->c:Lte;

    if-eqz v0, :cond_2

    .line 4
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-lt v1, v2, :cond_0

    new-instance v1, Landroidx/activity/ComponentActivity$2;

    invoke-direct {v1, p0}, Landroidx/activity/ComponentActivity$2;-><init>(Landroidx/activity/ComponentActivity;)V

    invoke-virtual {v0, v1}, Loe;->a(Lqe;)V

    .line 5
    :cond_0
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->c:Lte;

    .line 6
    new-instance v1, Landroidx/activity/ComponentActivity$3;

    invoke-direct {v1, p0}, Landroidx/activity/ComponentActivity$3;-><init>(Landroidx/activity/ComponentActivity;)V

    invoke-virtual {v0, v1}, Loe;->a(Lqe;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt v2, v0, :cond_1

    const/16 v1, 0x17

    if-gt v0, v1, :cond_1

    .line 7
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->c:Lte;

    .line 8
    new-instance v1, Landroidx/activity/ImmLeaksCleaner;

    invoke-direct {v1, p0}, Landroidx/activity/ImmLeaksCleaner;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Loe;->a(Lqe;)V

    :cond_1
    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getLifecycle() returned null in ComponentActivity\'s constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic h(Landroidx/activity/ComponentActivity;)V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    return-void
.end method


# virtual methods
.method public final b()Landroidx/activity/OnBackPressedDispatcher;
    .locals 1

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->f:Landroidx/activity/OnBackPressedDispatcher;

    return-object v0
.end method

.method public c()Lcf;
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->e:Lcf;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lc;->a:Lcf;

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->e:Lcf;

    :cond_0
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->e:Lcf;

    if-nez v0, :cond_1

    new-instance v0, Lcf;

    invoke-direct {v0}, Lcf;-><init>()V

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->e:Lcf;

    :cond_1
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->e:Lcf;

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Your activity is not yet attached to the Application instance. You can\'t request ViewModel before onCreate call."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e()Loe;
    .locals 1

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->c:Lte;

    return-object v0
.end method

.method public onBackPressed()V
    .locals 1

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->f:Landroidx/activity/OnBackPressedDispatcher;

    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->a()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    invoke-super {p0, p1}, Lq9;->onCreate(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->d:Lif;

    .line 1
    iget-object v1, v0, Lif;->a:Ljf;

    move-object v2, v1

    check-cast v2, Landroidx/activity/ComponentActivity;

    .line 2
    iget-object v2, v2, Landroidx/activity/ComponentActivity;->c:Lte;

    .line 3
    iget-object v3, v2, Lte;->b:Loe$b;

    .line 4
    sget-object v4, Loe$b;->c:Loe$b;

    if-ne v3, v4, :cond_2

    new-instance v3, Landroidx/savedstate/Recreator;

    invoke-direct {v3, v1}, Landroidx/savedstate/Recreator;-><init>(Ljf;)V

    invoke-virtual {v2, v3}, Loe;->a(Lqe;)V

    iget-object v0, v0, Lif;->b:Lgf;

    .line 5
    iget-boolean v1, v0, Lgf;->c:Z

    if-nez v1, :cond_1

    if-eqz p1, :cond_0

    const-string v1, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, v0, Lgf;->b:Landroid/os/Bundle;

    :cond_0
    new-instance p1, Landroidx/savedstate/SavedStateRegistry$1;

    invoke-direct {p1, v0}, Landroidx/savedstate/SavedStateRegistry$1;-><init>(Lgf;)V

    invoke-virtual {v2, p1}, Loe;->a(Lqe;)V

    const/4 p1, 0x1

    iput-boolean p1, v0, Lgf;->c:Z

    .line 6
    invoke-static {p0}, Lze;->b(Landroid/app/Activity;)V

    return-void

    .line 7
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "SavedStateRegistry was already restored."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 8
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Restarter must be created only during owner\'s initialization stage"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->e:Lcf;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc;

    if-eqz v1, :cond_0

    iget-object v0, v1, Lc;->a:Lcf;

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    new-instance v1, Lc;

    invoke-direct {v1}, Lc;-><init>()V

    iput-object v0, v1, Lc;->a:Lcf;

    return-object v1
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->c:Lte;

    .line 2
    instance-of v1, v0, Lte;

    if-eqz v1, :cond_0

    sget-object v1, Loe$b;->d:Loe$b;

    .line 3
    invoke-virtual {v0, v1}, Lte;->g(Loe$b;)V

    .line 4
    :cond_0
    invoke-super {p0, p1}, Lq9;->onSaveInstanceState(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->d:Lif;

    .line 5
    iget-object v0, v0, Lif;->b:Lgf;

    if-eqz v0, :cond_3

    .line 6
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, v0, Lgf;->b:Landroid/os/Bundle;

    if-eqz v2, :cond_1

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_1
    iget-object v0, v0, Lgf;->a:Lq7;

    .line 7
    new-instance v2, Lq7$a;

    invoke-direct {v2, v0}, Lq7$a;-><init>(Lq7;)V

    iget-object v0, v0, Lq7;->d:Ljava/util/WeakHashMap;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    :goto_0
    invoke-virtual {v2}, Lq7$a;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Lq7$a;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhf;

    invoke-interface {v0}, Lhf;->a()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_2
    const-string v0, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void

    :cond_3
    const/4 p1, 0x0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method
