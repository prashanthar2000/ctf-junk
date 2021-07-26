.class public abstract Lde;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:[I

.field public static final b:Lfe;

.field public static final c:Lfe;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/16 v0, 0xb

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lde;->a:[I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-lt v0, v2, :cond_0

    new-instance v0, Lee;

    invoke-direct {v0}, Lee;-><init>()V

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    sput-object v0, Lde;->b:Lfe;

    :try_start_0
    const-string v0, "androidx.transition.FragmentTransitionSupport"

    .line 1
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfe;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v0

    .line 2
    :catch_0
    sput-object v1, Lde;->c:Lfe;

    return-void

    :array_0
    .array-data 4
        0x0
        0x3
        0x0
        0x1
        0x5
        0x4
        0x7
        0x6
        0x9
        0x8
        0xa
    .end array-data
.end method

.method public static a(Lfe;Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfe;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v4, p0

    check-cast v4, Lee;

    if-eqz v4, :cond_1

    .line 1
    instance-of v3, v3, Landroid/transition/Transition;

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    throw p0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static b()Lfe;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    sget-object v1, Lde;->b:Lfe;

    if-eqz v1, :cond_1

    invoke-static {v1, v0}, Lde;->a(Lfe;Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Lde;->b:Lfe;

    return-object v0

    :cond_1
    sget-object v1, Lde;->c:Lfe;

    if-eqz v1, :cond_2

    invoke-static {v1, v0}, Lde;->a(Lfe;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lde;->c:Lfe;

    return-object v0

    :cond_2
    sget-object v0, Lde;->b:Lfe;

    if-nez v0, :cond_3

    sget-object v0, Lde;->c:Lfe;

    if-nez v0, :cond_3

    return-object v2

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid Transition types"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static c(Lud;Ljava/util/ArrayList;Ljava/util/ArrayList;IIZ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lud;",
            "Ljava/util/ArrayList<",
            "Lfd;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;IIZ)V"
        }
    .end annotation

    iget v0, p0, Lud;->o:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    move v1, p3

    :goto_0
    const/4 v2, 0x0

    if-ge v1, p4, :cond_4

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfd;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1
    iget-object v2, v3, Lfd;->r:Lud;

    iget-object v2, v2, Lud;->q:Lnd;

    invoke-virtual {v2}, Lnd;->a()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_3

    :cond_1
    iget-object v2, v3, Lfd;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_1
    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_3

    iget-object v4, v3, Lfd;->a:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbe;

    goto :goto_1

    .line 2
    :cond_2
    iget-object v4, v3, Lfd;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    :goto_2
    if-ge v2, v4, :cond_3

    iget-object v5, v3, Lfd;->a:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lbe;

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 3
    :cond_4
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result p2

    if-eqz p2, :cond_d

    new-instance p2, Landroid/view/View;

    iget-object v1, p0, Lud;->p:Lnd;

    .line 4
    iget-object v1, v1, Lnd;->b:Landroid/content/Context;

    .line 5
    invoke-direct {p2, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result p2

    :goto_4
    if-ge v2, p2, :cond_d

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v1

    add-int/lit8 v3, p4, -0x1

    :goto_5
    if-lt v3, p3, :cond_5

    .line 6
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lfd;

    invoke-virtual {v4, v1}, Lfd;->e(I)Z

    add-int/lit8 v3, v3, -0x1

    goto :goto_5

    .line 7
    :cond_5
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lce;

    const/4 v3, 0x0

    if-eqz p5, :cond_9

    .line 8
    iget-object v4, p0, Lud;->q:Lnd;

    invoke-virtual {v4}, Lnd;->a()Z

    move-result v4

    if-eqz v4, :cond_6

    iget-object v3, p0, Lud;->q:Lnd;

    check-cast v3, Lkd;

    .line 9
    iget-object v3, v3, Lkd;->e:Lc0;

    invoke-virtual {v3, v1}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 10
    move-object v3, v1

    check-cast v3, Landroid/view/ViewGroup;

    :cond_6
    if-nez v3, :cond_7

    goto :goto_6

    :cond_7
    invoke-static {}, Lde;->b()Lfe;

    move-result-object v1

    if-nez v1, :cond_8

    goto :goto_6

    :cond_8
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    goto :goto_6

    .line 11
    :cond_9
    iget-object v4, p0, Lud;->q:Lnd;

    invoke-virtual {v4}, Lnd;->a()Z

    move-result v4

    if-eqz v4, :cond_a

    iget-object v3, p0, Lud;->q:Lnd;

    check-cast v3, Lkd;

    .line 12
    iget-object v3, v3, Lkd;->e:Lc0;

    invoke-virtual {v3, v1}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 13
    move-object v3, v1

    check-cast v3, Landroid/view/ViewGroup;

    :cond_a
    if-nez v3, :cond_b

    goto :goto_6

    :cond_b
    invoke-static {}, Lde;->b()Lfe;

    move-result-object v1

    if-nez v1, :cond_c

    goto :goto_6

    :cond_c
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_d
    return-void
.end method
