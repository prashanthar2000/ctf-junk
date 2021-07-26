.class public abstract Le0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Lw7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw7<",
            "Ljava/lang/ref/WeakReference<",
            "Le0;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final c:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw7;

    invoke-direct {v0}, Lw7;-><init>()V

    sput-object v0, Le0;->b:Lw7;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Le0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Landroid/app/Activity;Ld0;)Le0;
    .locals 2

    new-instance v0, Ly0;

    const/4 v1, 0x0

    .line 1
    invoke-direct {v0, p0, v1, p1, p0}, Ly0;-><init>(Landroid/content/Context;Landroid/view/Window;Ld0;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static e(Landroid/app/Dialog;Ld0;)Le0;
    .locals 3

    new-instance v0, Ly0;

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1, p0}, Ly0;-><init>(Landroid/content/Context;Landroid/view/Window;Ld0;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static j(Le0;)V
    .locals 4

    sget-object v0, Le0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Le0;->b:Lw7;

    invoke-virtual {v1}, Lw7;->iterator()Ljava/util/Iterator;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    move-object v2, v1

    check-cast v2, La8$a;

    :try_start_1
    invoke-virtual {v2}, La8$a;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le0;

    if-eq v3, p0, :cond_1

    if-nez v3, :cond_0

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    throw p0

    :goto_2
    goto :goto_1
.end method


# virtual methods
.method public abstract c(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public abstract f()V
.end method

.method public abstract g()V
.end method

.method public abstract h(Landroid/os/Bundle;)V
.end method

.method public abstract i()V
.end method

.method public abstract k(I)Z
.end method

.method public abstract l(I)V
.end method

.method public abstract m(Landroid/view/View;)V
.end method

.method public abstract n(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public abstract o(Ljava/lang/CharSequence;)V
.end method
