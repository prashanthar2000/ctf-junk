.class public final Lgo$a;
.super Ljava/lang/Object;

# interfaces
.implements Lgk$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field final a:Landroid/content/Context;

.field final a:Landroid/view/ActionMode$Callback;

.field final a:Ldu;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldu<",
            "Landroid/view/Menu;",
            "Landroid/view/Menu;",
            ">;"
        }
    .end annotation
.end field

.field final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lgo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgo$a;->a:Landroid/content/Context;

    iput-object p2, p0, Lgo$a;->a:Landroid/view/ActionMode$Callback;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lgo$a;->a:Ljava/util/ArrayList;

    new-instance p1, Ldu;

    invoke-direct {p1}, Ldu;-><init>()V

    iput-object p1, p0, Lgo$a;->a:Ldu;

    return-void
.end method

.method private a(Landroid/view/Menu;)Landroid/view/Menu;
    .locals 2

    iget-object v0, p0, Lgo$a;->a:Ldu;

    invoke-virtual {v0, p1}, Ldu;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Menu;

    if-nez v0, :cond_0

    iget-object v0, p0, Lgo$a;->a:Landroid/content/Context;

    move-object v1, p1

    check-cast v1, Ldc;

    invoke-static {v0, v1}, Lhi;->a(Landroid/content/Context;Ldc;)Landroid/view/Menu;

    move-result-object v0

    iget-object v1, p0, Lgo$a;->a:Ldu;

    invoke-virtual {v1, p1, v0}, Ldu;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a(Lgk;)Landroid/view/ActionMode;
    .locals 4

    iget-object v0, p0, Lgo$a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lgo$a;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgo;

    if-eqz v2, :cond_0

    iget-object v3, v2, Lgo;->a:Lgk;

    if-ne v3, p1, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lgo;

    iget-object v1, p0, Lgo$a;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lgo;-><init>(Landroid/content/Context;Lgk;)V

    iget-object p1, p0, Lgo$a;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final a(Lgk;)V
    .locals 1

    iget-object v0, p0, Lgo$a;->a:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lgo$a;->a(Lgk;)Landroid/view/ActionMode;

    move-result-object p1

    invoke-interface {v0, p1}, Landroid/view/ActionMode$Callback;->onDestroyActionMode(Landroid/view/ActionMode;)V

    return-void
.end method

.method public final a(Lgk;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lgo$a;->a:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lgo$a;->a(Lgk;)Landroid/view/ActionMode;

    move-result-object p1

    invoke-direct {p0, p2}, Lgo$a;->a(Landroid/view/Menu;)Landroid/view/Menu;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Landroid/view/ActionMode$Callback;->onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public final a(Lgk;Landroid/view/MenuItem;)Z
    .locals 2

    iget-object v0, p0, Lgo$a;->a:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lgo$a;->a(Lgk;)Landroid/view/ActionMode;

    move-result-object p1

    iget-object v1, p0, Lgo$a;->a:Landroid/content/Context;

    check-cast p2, Ldd;

    invoke-static {v1, p2}, Lhi;->a(Landroid/content/Context;Ldd;)Landroid/view/MenuItem;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Landroid/view/ActionMode$Callback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public final b(Lgk;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lgo$a;->a:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lgo$a;->a(Lgk;)Landroid/view/ActionMode;

    move-result-object p1

    invoke-direct {p0, p2}, Lgo$a;->a(Landroid/view/Menu;)Landroid/view/Menu;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Landroid/view/ActionMode$Callback;->onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method
