.class public final Lgo;
.super Landroid/view/ActionMode;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgo$a;
    }
.end annotation


# instance fields
.field final a:Landroid/content/Context;

.field final a:Lgk;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lgk;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/ActionMode;-><init>()V

    iput-object p1, p0, Lgo;->a:Landroid/content/Context;

    iput-object p2, p0, Lgo;->a:Lgk;

    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 1

    iget-object v0, p0, Lgo;->a:Lgk;

    invoke-virtual {v0}, Lgk;->a()V

    return-void
.end method

.method public final getCustomView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lgo;->a:Lgk;

    invoke-virtual {v0}, Lgk;->a()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final getMenu()Landroid/view/Menu;
    .locals 2

    iget-object v0, p0, Lgo;->a:Landroid/content/Context;

    iget-object v1, p0, Lgo;->a:Lgk;

    invoke-virtual {v1}, Lgk;->a()Landroid/view/Menu;

    move-result-object v1

    check-cast v1, Ldc;

    invoke-static {v0, v1}, Lhi;->a(Landroid/content/Context;Ldc;)Landroid/view/Menu;

    move-result-object v0

    return-object v0
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    iget-object v0, p0, Lgo;->a:Lgk;

    invoke-virtual {v0}, Lgk;->a()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lgo;->a:Lgk;

    invoke-virtual {v0}, Lgk;->b()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final getTag()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lgo;->a:Lgk;

    iget-object v0, v0, Lgk;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lgo;->a:Lgk;

    invoke-virtual {v0}, Lgk;->a()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final getTitleOptionalHint()Z
    .locals 1

    iget-object v0, p0, Lgo;->a:Lgk;

    iget-boolean v0, v0, Lgk;->a:Z

    return v0
.end method

.method public final invalidate()V
    .locals 1

    iget-object v0, p0, Lgo;->a:Lgk;

    invoke-virtual {v0}, Lgk;->b()V

    return-void
.end method

.method public final isTitleOptional()Z
    .locals 1

    iget-object v0, p0, Lgo;->a:Lgk;

    invoke-virtual {v0}, Lgk;->b()Z

    move-result v0

    return v0
.end method

.method public final setCustomView(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lgo;->a:Lgk;

    invoke-virtual {v0, p1}, Lgk;->a(Landroid/view/View;)V

    return-void
.end method

.method public final setSubtitle(I)V
    .locals 1

    iget-object v0, p0, Lgo;->a:Lgk;

    invoke-virtual {v0, p1}, Lgk;->b(I)V

    return-void
.end method

.method public final setSubtitle(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lgo;->a:Lgk;

    invoke-virtual {v0, p1}, Lgk;->a(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTag(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lgo;->a:Lgk;

    iput-object p1, v0, Lgk;->a:Ljava/lang/Object;

    return-void
.end method

.method public final setTitle(I)V
    .locals 1

    iget-object v0, p0, Lgo;->a:Lgk;

    invoke-virtual {v0, p1}, Lgk;->a(I)V

    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lgo;->a:Lgk;

    invoke-virtual {v0, p1}, Lgk;->b(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTitleOptionalHint(Z)V
    .locals 1

    iget-object v0, p0, Lgo;->a:Lgk;

    invoke-virtual {v0, p1}, Lgk;->a(Z)V

    return-void
.end method
