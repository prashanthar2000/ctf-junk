.class public final Lud;
.super Lod;
.source ""

# interfaces
.implements Landroid/view/LayoutInflater$Factory2;


# static fields
.field public static G:Z = false

.field public static final H:Landroid/view/animation/Interpolator;

.field public static final I:Landroid/view/animation/Interpolator;


# instance fields
.field public A:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljd;",
            ">;"
        }
    .end annotation
.end field

.field public B:Landroid/os/Bundle;

.field public C:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation
.end field

.field public D:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ltd;",
            ">;"
        }
    .end annotation
.end field

.field public E:Lyd;

.field public F:Ljava/lang/Runnable;

.field public d:Z

.field public e:I

.field public final f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljd;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljd;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lfd;",
            ">;"
        }
    .end annotation
.end field

.field public i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljd;",
            ">;"
        }
    .end annotation
.end field

.field public j:Landroidx/activity/OnBackPressedDispatcher;

.field public final k:Lpd;

.field public l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lfd;",
            ">;"
        }
    .end annotation
.end field

.field public m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public o:I

.field public p:Lnd;

.field public q:Lnd;

.field public r:Ljd;

.field public s:Ljd;

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lfd;",
            ">;"
        }
    .end annotation
.end field

.field public z:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v1, 0x40200000    # 2.5f

    invoke-direct {v0, v1}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    sput-object v0, Lud;->H:Landroid/view/animation/Interpolator;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v1, 0x3fc00000    # 1.5f

    invoke-direct {v0, v1}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    sput-object v0, Lud;->I:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lod;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lud;->e:I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lud;->f:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lud;->g:Ljava/util/HashMap;

    new-instance v1, Lpd;

    invoke-direct {v1, p0, v0}, Lpd;-><init>(Lud;Z)V

    iput-object v1, p0, Lud;->k:Lpd;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Lud;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput v0, p0, Lud;->o:I

    const/4 v0, 0x0

    iput-object v0, p0, Lud;->B:Landroid/os/Bundle;

    iput-object v0, p0, Lud;->C:Landroid/util/SparseArray;

    new-instance v0, Lqd;

    invoke-direct {v0, p0}, Lqd;-><init>(Lud;)V

    iput-object v0, p0, Lud;->F:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 4

    const-string p2, "    "

    invoke-static {p1, p2}, Lgg;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iget-object p4, p0, Lud;->g:Ljava/util/HashMap;

    invoke-virtual {p4}, Ljava/util/HashMap;->isEmpty()Z

    move-result p4

    const/4 v0, 0x0

    if-nez p4, :cond_1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p4, "Active Fragments in "

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p4

    invoke-static {p4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p4, ":"

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object p4, p0, Lud;->g:Ljava/util/HashMap;

    invoke-virtual {p4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljd;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    throw v0

    :cond_1
    iget-object p4, p0, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result p4

    const/4 v1, 0x0

    if-lez p4, :cond_3

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, "Added Fragments:"

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    if-gtz p4, :cond_2

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljd;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "  #"

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    const-string p1, ": "

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    iget-object p4, p0, Lud;->i:Ljava/util/ArrayList;

    if-eqz p4, :cond_5

    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result p4

    if-lez p4, :cond_5

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, "Fragments Created Menus:"

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    if-gtz p4, :cond_4

    goto :goto_2

    :cond_4
    iget-object p2, p0, Lud;->i:Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljd;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "  #"

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    const-string p1, ": "

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_2
    iget-object p4, p0, Lud;->h:Ljava/util/ArrayList;

    if-eqz p4, :cond_6

    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result p4

    if-lez p4, :cond_6

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Back Stack:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_3
    if-ge v0, p4, :cond_6

    iget-object v2, p0, Lud;->h:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfd;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2}, Lfd;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const/4 v3, 0x1

    .line 1
    invoke-virtual {v2, p2, p3, v3}, Lfd;->b(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 2
    :cond_6
    monitor-enter p0

    :try_start_0
    iget-object p2, p0, Lud;->l:Ljava/util/ArrayList;

    if-eqz p2, :cond_7

    iget-object p2, p0, Lud;->l:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_7

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p4, "Back Stack Indices:"

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :goto_4
    if-ge v1, p2, :cond_7

    iget-object p4, p0, Lud;->l:Ljava/util/ArrayList;

    invoke-virtual {p4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lfd;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  #"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, ": "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_7
    iget-object p2, p0, Lud;->m:Ljava/util/ArrayList;

    if-eqz p2, :cond_8

    iget-object p2, p0, Lud;->m:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_8

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "mAvailBackStackIndices: "

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Lud;->m:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "FragmentManager misc state:"

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mHost="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Lud;->p:Lnd;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mContainer="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Lud;->q:Lnd;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mCurState="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget p2, p0, Lud;->o:I

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    const-string p2, " mStateSaved="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, Lud;->u:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    const-string p2, " mStopped="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, Lud;->v:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    const-string p2, " mDestroyed="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, Lud;->w:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    iget-boolean p2, p0, Lud;->t:Z

    if-eqz p2, :cond_9

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "  mNeedMenuInvalidate="

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p1, p0, Lud;->t:Z

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Z)V

    :cond_9
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_6

    :goto_5
    throw p1

    :goto_6
    goto :goto_5
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lud;->d:Z

    iget-object v0, p0, Lud;->z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lud;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public c(Lfd;ZZZ)V
    .locals 7

    if-eqz p2, :cond_0

    invoke-virtual {p1, p4}, Lfd;->d(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lfd;->c()V

    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    const/4 v6, 0x1

    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz p3, :cond_1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x1

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lde;->c(Lud;Ljava/util/ArrayList;Ljava/util/ArrayList;IIZ)V

    :cond_1
    if-eqz p4, :cond_2

    iget p1, p0, Lud;->o:I

    invoke-virtual {p0, p1, v6}, Lud;->n(IZ)V

    :cond_2
    iget-object p1, p0, Lud;->g:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljd;

    if-nez p2, :cond_3

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    throw p1

    :cond_4
    return-void
.end method

.method public final d(Ljd;)V
    .locals 0

    return-void
.end method

.method public final e(I)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v0, p0, Lud;->d:Z

    invoke-virtual {p0, p1, v1}, Lud;->n(IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p0, Lud;->d:Z

    invoke-virtual {p0}, Lud;->g()Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, Lud;->d:Z

    throw p1
.end method

.method public final f(Z)V
    .locals 2

    iget-boolean v0, p0, Lud;->d:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Lud;->p:Lnd;

    if-eqz v0, :cond_4

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lud;->p:Lnd;

    .line 1
    iget-object v1, v1, Lnd;->c:Landroid/os/Handler;

    .line 2
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_3

    if-nez p1, :cond_1

    .line 3
    invoke-virtual {p0}, Lud;->l()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Can not perform this action after onSaveInstanceState"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4
    :cond_1
    :goto_0
    iget-object p1, p0, Lud;->y:Ljava/util/ArrayList;

    if-nez p1, :cond_2

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lud;->y:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lud;->z:Ljava/util/ArrayList;

    :cond_2
    const/4 p1, 0x1

    iput-boolean p1, p0, Lud;->d:Z

    const/4 p1, 0x0

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0, v0}, Lud;->i(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean p1, p0, Lud;->d:Z

    return-void

    :catchall_0
    move-exception v0

    iput-boolean p1, p0, Lud;->d:Z

    throw v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Must be called from main thread of fragment host"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Fragment host has been destroyed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager is already executing transactions"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public g()Z
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lud;->f(Z)V

    .line 1
    monitor-enter p0

    :try_start_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    invoke-virtual {p0}, Lud;->t()V

    .line 3
    iget-boolean v0, p0, Lud;->x:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lud;->x:Z

    invoke-virtual {p0}, Lud;->r()V

    .line 4
    :cond_0
    iget-object v0, p0, Lud;->g:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    return v1

    :catchall_0
    move-exception v0

    .line 5
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final h(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lfd;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;II)V"
        }
    .end annotation

    move-object/from16 v7, p0

    move-object/from16 v0, p1

    move-object/from16 v8, p2

    move/from16 v9, p3

    move/from16 v10, p4

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfd;

    iget-boolean v11, v1, Lfd;->p:Z

    iget-object v1, v7, Lud;->A:Ljava/util/ArrayList;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v7, Lud;->A:Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    :goto_0
    iget-object v1, v7, Lud;->A:Ljava/util/ArrayList;

    iget-object v2, v7, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move v1, v9

    const/4 v2, 0x0

    :goto_1
    const/4 v13, 0x3

    const/4 v15, 0x1

    if-ge v1, v10, :cond_d

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfd;

    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const/4 v5, 0x7

    const/4 v6, 0x6

    if-nez v4, :cond_5

    iget-object v4, v7, Lud;->A:Ljava/util/ArrayList;

    const/4 v12, 0x0

    .line 1
    :goto_2
    iget-object v14, v3, Lfd;->a:Ljava/util/ArrayList;

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v14

    if-ge v12, v14, :cond_a

    iget-object v14, v3, Lfd;->a:Ljava/util/ArrayList;

    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lbe;

    iget v14, v14, Lbe;->a:I

    if-eq v14, v15, :cond_4

    const/4 v15, 0x2

    if-eq v14, v15, :cond_3

    const/16 v15, 0x9

    if-eq v14, v13, :cond_2

    if-eq v14, v6, :cond_2

    if-eq v14, v5, :cond_4

    const/16 v5, 0x8

    if-eq v14, v5, :cond_1

    goto :goto_4

    :cond_1
    iget-object v5, v3, Lfd;->a:Ljava/util/ArrayList;

    new-instance v14, Lbe;

    invoke-direct {v14, v15}, Lbe;-><init>(I)V

    move-object v6, v14

    move-object v14, v5

    const/4 v5, 0x0

    goto :goto_3

    :cond_2
    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v14, v3, Lfd;->a:Ljava/util/ArrayList;

    new-instance v6, Lbe;

    invoke-direct {v6, v15}, Lbe;-><init>(I)V

    :goto_3
    invoke-virtual {v14, v12, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_4

    :cond_3
    const/4 v5, 0x0

    throw v5

    :cond_4
    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_4
    const/4 v5, 0x1

    add-int/2addr v12, v5

    const/4 v5, 0x7

    const/4 v6, 0x6

    const/4 v15, 0x1

    goto :goto_2

    :cond_5
    const/4 v5, 0x1

    .line 2
    iget-object v4, v7, Lud;->A:Ljava/util/ArrayList;

    .line 3
    iget-object v6, v3, Lfd;->a:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    sub-int/2addr v6, v5

    :goto_5
    if-ltz v6, :cond_a

    iget-object v12, v3, Lfd;->a:Ljava/util/ArrayList;

    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lbe;

    iget v14, v12, Lbe;->a:I

    if-eq v14, v5, :cond_9

    if-eq v14, v13, :cond_8

    const/4 v5, 0x6

    if-eq v14, v5, :cond_8

    const/4 v15, 0x7

    if-eq v14, v15, :cond_7

    const/16 v5, 0xa

    if-eq v14, v5, :cond_6

    goto :goto_7

    :cond_6
    iget-object v5, v12, Lbe;->g:Loe$b;

    iput-object v5, v12, Lbe;->h:Loe$b;

    goto :goto_7

    :cond_7
    const/4 v5, 0x0

    goto :goto_6

    :cond_8
    const/4 v15, 0x7

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_9
    const/4 v5, 0x0

    const/4 v15, 0x7

    :goto_6
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :goto_7
    add-int/lit8 v6, v6, -0x1

    const/4 v5, 0x1

    goto :goto_5

    :cond_a
    if-nez v2, :cond_c

    .line 4
    iget-boolean v2, v3, Lfd;->h:Z

    if-eqz v2, :cond_b

    goto :goto_8

    :cond_b
    const/4 v2, 0x0

    goto :goto_9

    :cond_c
    :goto_8
    const/4 v2, 0x1

    :goto_9
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_1

    :cond_d
    iget-object v1, v7, Lud;->A:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    if-nez v11, :cond_e

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    invoke-static/range {v1 .. v6}, Lde;->c(Lud;Ljava/util/ArrayList;Ljava/util/ArrayList;IIZ)V

    :cond_e
    move v1, v9

    :goto_a
    const/4 v12, -0x1

    if-ge v1, v10, :cond_11

    .line 5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfd;

    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-virtual {v2, v12}, Lfd;->a(I)V

    add-int/lit8 v3, v10, -0x1

    if-ne v1, v3, :cond_f

    const/4 v3, 0x1

    goto :goto_b

    :cond_f
    const/4 v3, 0x0

    :goto_b
    invoke-virtual {v2, v3}, Lfd;->d(Z)V

    const/4 v3, 0x1

    goto :goto_c

    :cond_10
    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lfd;->a(I)V

    invoke-virtual {v2}, Lfd;->c()V

    :goto_c
    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_11
    const/4 v3, 0x1

    if-eqz v11, :cond_15

    .line 6
    iget v1, v7, Lud;->o:I

    if-ge v1, v3, :cond_12

    goto :goto_d

    :cond_12
    invoke-static {v1, v13}, Ljava/lang/Math;->min(II)I

    iget-object v1, v7, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gtz v1, :cond_14

    :goto_d
    add-int/lit8 v1, v10, -0x1

    :goto_e
    if-lt v1, v9, :cond_15

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfd;

    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    const/4 v3, 0x0

    .line 8
    :goto_f
    iget-object v4, v2, Lfd;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_13

    iget-object v4, v2, Lfd;->a:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbe;

    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    :cond_13
    add-int/lit8 v1, v1, -0x1

    goto :goto_e

    .line 9
    :cond_14
    iget-object v0, v7, Lud;->f:Ljava/util/ArrayList;

    const/4 v13, 0x0

    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljd;

    const/4 v1, 0x0

    throw v1

    :cond_15
    const/4 v13, 0x0

    if-eq v10, v9, :cond_16

    if-eqz v11, :cond_16

    const/4 v6, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    .line 10
    invoke-static/range {v1 .. v6}, Lde;->c(Lud;Ljava/util/ArrayList;Ljava/util/ArrayList;IIZ)V

    iget v1, v7, Lud;->o:I

    const/4 v2, 0x1

    invoke-virtual {v7, v1, v2}, Lud;->n(IZ)V

    :cond_16
    :goto_10
    if-ge v9, v10, :cond_1b

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfd;

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_18

    iget v2, v1, Lfd;->s:I

    if-ltz v2, :cond_18

    .line 11
    monitor-enter p0

    :try_start_0
    iget-object v3, v7, Lud;->l:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v3, v2, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v7, Lud;->m:Ljava/util/ArrayList;

    if-nez v3, :cond_17

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v7, Lud;->m:Ljava/util/ArrayList;

    :cond_17
    iget-object v3, v7, Lud;->m:Ljava/util/ArrayList;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    iput v12, v1, Lfd;->s:I

    goto :goto_11

    :catchall_0
    move-exception v0

    .line 13
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 14
    :cond_18
    :goto_11
    iget-object v2, v1, Lfd;->q:Ljava/util/ArrayList;

    if-eqz v2, :cond_1a

    const/4 v2, 0x0

    :goto_12
    iget-object v3, v1, Lfd;->q:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_19

    iget-object v3, v1, Lfd;->q:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Runnable;

    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_12

    :cond_19
    const/4 v2, 0x0

    iput-object v2, v1, Lfd;->q:Ljava/util/ArrayList;

    goto :goto_13

    :cond_1a
    const/4 v2, 0x0

    :goto_13
    add-int/lit8 v9, v9, 0x1

    goto :goto_10

    :cond_1b
    return-void
.end method

.method public final i(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lfd;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lud;->D:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    if-lez v0, :cond_4

    iget-object v2, p0, Lud;->D:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltd;

    const/4 v3, -0x1

    if-eqz p1, :cond_1

    iget-boolean v4, v2, Ltd;->a:Z

    if-nez v4, :cond_1

    iget-object v4, v2, Ltd;->b:Lfd;

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v4

    if-eq v4, v3, :cond_1

    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v3, p0, Lud;->D:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_3

    .line 1
    iget-object v4, p0, Lud;->D:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    if-eqz p1, :cond_2

    iget-boolean v4, v2, Ltd;->a:Z

    if-nez v4, :cond_2

    iget-object v4, v2, Ltd;->b:Lfd;

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v4

    if-eq v4, v3, :cond_2

    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 2
    :goto_1
    iget-object v3, v2, Ltd;->b:Lfd;

    iget-object v4, v3, Lfd;->r:Lud;

    iget-boolean v2, v2, Ltd;->a:Z

    invoke-virtual {v4, v3, v2, v1, v1}, Lud;->c(Lfd;ZZZ)V

    goto :goto_0

    .line 3
    :cond_2
    invoke-virtual {v2}, Ltd;->a()V

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    .line 4
    throw p1

    :cond_4
    return-void
.end method

.method public j(I)V
    .locals 2

    iget-object p1, p0, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_0
    const/4 v0, 0x0

    if-ltz p1, :cond_1

    iget-object v1, p0, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljd;

    if-nez v1, :cond_0

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_0
    throw v0

    :cond_1
    iget-object p1, p0, Lud;->g:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljd;

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    throw v0

    :cond_3
    return-void
.end method

.method public k()Lmd;
    .locals 2

    .line 1
    iget-object v0, p0, Lod;->b:Lmd;

    if-nez v0, :cond_0

    sget-object v0, Lod;->c:Lmd;

    iput-object v0, p0, Lod;->b:Lmd;

    :cond_0
    iget-object v0, p0, Lod;->b:Lmd;

    .line 2
    sget-object v1, Lod;->c:Lmd;

    if-ne v0, v1, :cond_1

    new-instance v0, Lrd;

    invoke-direct {v0, p0}, Lrd;-><init>(Lud;)V

    .line 3
    iput-object v0, p0, Lod;->b:Lmd;

    .line 4
    :cond_1
    iget-object v0, p0, Lod;->b:Lmd;

    if-nez v0, :cond_2

    sget-object v0, Lod;->c:Lmd;

    iput-object v0, p0, Lod;->b:Lmd;

    :cond_2
    iget-object v0, p0, Lod;->b:Lmd;

    return-object v0
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Lud;->u:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lud;->v:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public m(Ljd;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method

.method public n(IZ)V
    .locals 2

    iget-object v0, p0, Lud;->p:Lnd;

    if-nez v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No activity"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-nez p2, :cond_2

    iget p2, p0, Lud;->o:I

    if-ne p1, p2, :cond_2

    return-void

    :cond_2
    iput p1, p0, Lud;->o:I

    iget-object p1, p0, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 p2, 0x0

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_3

    iget-object v1, p0, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljd;

    invoke-virtual {p0, v1}, Lud;->m(Ljd;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lud;->g:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljd;

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    const/4 p1, 0x0

    throw p1

    :cond_5
    invoke-virtual {p0}, Lud;->r()V

    iget-boolean p1, p0, Lud;->t:Z

    if-eqz p1, :cond_6

    iget-object p1, p0, Lud;->p:Lnd;

    if-eqz p1, :cond_6

    iget v0, p0, Lud;->o:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_6

    check-cast p1, Lkd;

    .line 1
    iget-object p1, p1, Lkd;->e:Lc0;

    .line 2
    invoke-virtual {p1}, Lc0;->k()Le0;

    move-result-object p1

    invoke-virtual {p1}, Le0;->g()V

    .line 3
    iput-boolean p2, p0, Lud;->t:Z

    :cond_6
    return-void
.end method

.method public o()Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Lud;->l()Z

    move-result v0

    if-nez v0, :cond_4

    .line 2
    invoke-virtual {p0}, Lud;->g()Z

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lud;->f(Z)V

    iget-object v1, p0, Lud;->y:Ljava/util/ArrayList;

    iget-object v2, p0, Lud;->z:Ljava/util/ArrayList;

    .line 3
    iget-object v3, p0, Lud;->h:Ljava/util/ArrayList;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v0

    if-gez v3, :cond_1

    :goto_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    iget-object v5, p0, Lud;->h:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x1

    :goto_1
    if-eqz v1, :cond_2

    .line 4
    iput-boolean v0, p0, Lud;->d:Z

    :try_start_0
    iget-object v0, p0, Lud;->y:Ljava/util/ArrayList;

    iget-object v2, p0, Lud;->z:Ljava/util/ArrayList;

    invoke-virtual {p0, v0, v2}, Lud;->p(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lud;->b()V

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lud;->b()V

    throw v0

    :cond_2
    :goto_2
    invoke-virtual {p0}, Lud;->t()V

    .line 5
    iget-boolean v0, p0, Lud;->x:Z

    if-eqz v0, :cond_3

    iput-boolean v4, p0, Lud;->x:Z

    invoke-virtual {p0}, Lud;->r()V

    .line 6
    :cond_3
    iget-object v0, p0, Lud;->g:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    return v1

    .line 7
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can not perform this action after onSaveInstanceState"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 6

    const-string v0, "fragment"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    const-string p2, "class"

    invoke-interface {p4, v0, p2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    sget-object v1, Lsd;->a:[I

    invoke-virtual {p3, p4, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    const/4 v2, 0x0

    if-nez p2, :cond_1

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    :cond_1
    const/4 v3, 0x1

    const/4 v4, -0x1

    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    const/4 v5, 0x2

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p2, :cond_c

    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v1, p2}, Lmd;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_3

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    :cond_3
    if-ne v2, v4, :cond_5

    if-ne v3, v4, :cond_5

    if-eqz v5, :cond_4

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ": Must specify unique android:id, android:tag, or have a parent with an id for "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_0
    if-eq v3, v4, :cond_6

    invoke-virtual {p0, v3}, Lud;->j(I)V

    :cond_6
    if-eqz v5, :cond_a

    .line 1
    iget-object p1, p0, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/2addr p1, v4

    :goto_1
    if-ltz p1, :cond_8

    iget-object p4, p0, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljd;

    if-nez p4, :cond_7

    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    :cond_7
    throw v0

    :cond_8
    iget-object p1, p0, Lud;->g:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljd;

    if-nez p4, :cond_9

    goto :goto_2

    :cond_9
    throw v0

    :cond_a
    if-eq v2, v4, :cond_b

    .line 2
    invoke-virtual {p0, v2}, Lud;->j(I)V

    :cond_b
    invoke-virtual {p0}, Lud;->k()Lmd;

    move-result-object p1

    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p3

    invoke-virtual {p1, p3, p2}, Lmd;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    throw v0

    :cond_c
    :goto_3
    return-object v0
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2, p3}, Lud;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    return-object v0
.end method

.method public final p(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lfd;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    if-eqz p2, :cond_6

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_6

    invoke-virtual {p0, p1, p2}, Lud;->i(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfd;

    iget-boolean v3, v3, Lfd;->p:Z

    if-nez v3, :cond_3

    if-eq v2, v1, :cond_1

    invoke-virtual {p0, p1, p2, v2, v1}, Lud;->h(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_1
    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    if-ge v2, v0, :cond_2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfd;

    iget-boolean v3, v3, Lfd;->p:Z

    if-nez v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1, p2, v1, v2}, Lud;->h(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    add-int/lit8 v1, v2, -0x1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    if-eq v2, v0, :cond_5

    invoke-virtual {p0, p1, p2, v2, v0}, Lud;->h(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_5
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Internal error with the back stack records"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    :goto_2
    return-void
.end method

.method public q(Ljd;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lud;->s:Ljd;

    invoke-virtual {p0, p1}, Lud;->d(Ljd;)V

    invoke-virtual {p0, p1}, Lud;->d(Ljd;)V

    return-void
.end method

.method public r()V
    .locals 2

    iget-object v0, p0, Lud;->g:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljd;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1
    throw v0

    :cond_1
    return-void
.end method

.method public final s(Ljava/lang/RuntimeException;)V
    .locals 6

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "Activity state:"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lib;

    invoke-direct {v0, v1}, Lib;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/io/PrintWriter;

    invoke-direct {v2, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    iget-object v0, p0, Lud;->p:Lnd;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "  "

    if-eqz v0, :cond_0

    :try_start_0
    new-array v3, v3, [Ljava/lang/String;

    check-cast v0, Lkd;

    .line 1
    iget-object v0, v0, Lkd;->e:Lc0;

    invoke-virtual {v0, v5, v4, v2, v3}, Lc0;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-array v0, v3, [Ljava/lang/String;

    .line 2
    invoke-virtual {p0, v5, v4, v2, v0}, Lud;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "Failed dumping state"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    throw p1
.end method

.method public final t()V
    .locals 3

    iget-object v0, p0, Lud;->k:Lpd;

    .line 1
    iget-object v1, p0, Lud;->h:Ljava/util/ArrayList;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-lez v1, :cond_1

    const/4 v2, 0x1

    .line 2
    :cond_1
    iput-boolean v2, v0, Lpd;->a:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "FragmentManager{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lud;->p:Lnd;

    invoke-static {v1, v0}, Lb1;->c(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
