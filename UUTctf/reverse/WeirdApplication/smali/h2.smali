.class public Lh2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc2;


# instance fields
.field public final a:Landroid/view/ActionMode$Callback;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Li2;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lb8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb8<",
            "Landroid/view/Menu;",
            "Landroid/view/Menu;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2;->b:Landroid/content/Context;

    iput-object p2, p0, Lh2;->a:Landroid/view/ActionMode$Callback;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lh2;->c:Ljava/util/ArrayList;

    new-instance p1, Lb8;

    invoke-direct {p1}, Lb8;-><init>()V

    iput-object p1, p0, Lh2;->d:Lb8;

    return-void
.end method


# virtual methods
.method public a(Ld2;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lh2;->a:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lh2;->e(Ld2;)Landroid/view/ActionMode;

    move-result-object p1

    invoke-virtual {p0, p2}, Lh2;->f(Landroid/view/Menu;)Landroid/view/Menu;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Landroid/view/ActionMode$Callback;->onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public b(Ld2;)V
    .locals 1

    iget-object v0, p0, Lh2;->a:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lh2;->e(Ld2;)Landroid/view/ActionMode;

    move-result-object p1

    invoke-interface {v0, p1}, Landroid/view/ActionMode$Callback;->onDestroyActionMode(Landroid/view/ActionMode;)V

    return-void
.end method

.method public c(Ld2;Landroid/view/MenuItem;)Z
    .locals 3

    iget-object v0, p0, Lh2;->a:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lh2;->e(Ld2;)Landroid/view/ActionMode;

    move-result-object p1

    new-instance v1, Li3;

    iget-object v2, p0, Lh2;->b:Landroid/content/Context;

    check-cast p2, Lqa;

    invoke-direct {v1, v2, p2}, Li3;-><init>(Landroid/content/Context;Lqa;)V

    invoke-interface {v0, p1, v1}, Landroid/view/ActionMode$Callback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public d(Ld2;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lh2;->a:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lh2;->e(Ld2;)Landroid/view/ActionMode;

    move-result-object p1

    invoke-virtual {p0, p2}, Lh2;->f(Landroid/view/Menu;)Landroid/view/Menu;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Landroid/view/ActionMode$Callback;->onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public e(Ld2;)Landroid/view/ActionMode;
    .locals 4

    iget-object v0, p0, Lh2;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lh2;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2;

    if-eqz v2, :cond_0

    iget-object v3, v2, Li2;->b:Ld2;

    if-ne v3, p1, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Li2;

    iget-object v1, p0, Lh2;->b:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Li2;-><init>(Landroid/content/Context;Ld2;)V

    iget-object p1, p0, Lh2;->c:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final f(Landroid/view/Menu;)Landroid/view/Menu;
    .locals 3

    iget-object v0, p0, Lh2;->d:Lb8;

    const/4 v1, 0x0

    .line 1
    invoke-virtual {v0, p1, v1}, Lb8;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 2
    check-cast v0, Landroid/view/Menu;

    if-nez v0, :cond_0

    new-instance v0, Lo3;

    iget-object v1, p0, Lh2;->b:Landroid/content/Context;

    move-object v2, p1

    check-cast v2, Lpa;

    invoke-direct {v0, v1, v2}, Lo3;-><init>(Landroid/content/Context;Lpa;)V

    iget-object v1, p0, Lh2;->d:Lb8;

    invoke-virtual {v1, p1, v0}, Lb8;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method
