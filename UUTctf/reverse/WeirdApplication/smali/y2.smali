.class public Ly2;
.super Landroid/widget/BaseAdapter;
.source ""


# instance fields
.field public b:Lz2;

.field public c:I

.field public d:Z

.field public final e:Z

.field public final f:Landroid/view/LayoutInflater;

.field public final g:I


# direct methods
.method public constructor <init>(Lz2;Landroid/view/LayoutInflater;ZI)V
    .locals 1

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Ly2;->c:I

    iput-boolean p3, p0, Ly2;->e:Z

    iput-object p2, p0, Ly2;->f:Landroid/view/LayoutInflater;

    iput-object p1, p0, Ly2;->b:Lz2;

    iput p4, p0, Ly2;->g:I

    invoke-virtual {p0}, Ly2;->a()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-object v0, p0, Ly2;->b:Lz2;

    .line 1
    iget-object v1, v0, Lz2;->w:Lc3;

    if-eqz v1, :cond_1

    .line 2
    invoke-virtual {v0}, Lz2;->i()V

    iget-object v0, v0, Lz2;->j:Ljava/util/ArrayList;

    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc3;

    if-ne v4, v1, :cond_0

    iput v3, p0, Ly2;->c:I

    return-void

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    iput v0, p0, Ly2;->c:I

    return-void
.end method

.method public b(I)Lc3;
    .locals 2

    iget-boolean v0, p0, Ly2;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly2;->b:Lz2;

    .line 1
    invoke-virtual {v0}, Lz2;->i()V

    iget-object v0, v0, Lz2;->j:Ljava/util/ArrayList;

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Ly2;->b:Lz2;

    invoke-virtual {v0}, Lz2;->l()Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    iget v1, p0, Ly2;->c:I

    if-ltz v1, :cond_1

    if-lt p1, v1, :cond_1

    add-int/lit8 p1, p1, 0x1

    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc3;

    return-object p1
.end method

.method public getCount()I
    .locals 2

    iget-boolean v0, p0, Ly2;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly2;->b:Lz2;

    .line 1
    invoke-virtual {v0}, Lz2;->i()V

    iget-object v0, v0, Lz2;->j:Ljava/util/ArrayList;

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Ly2;->b:Lz2;

    invoke-virtual {v0}, Lz2;->l()Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    iget v1, p0, Ly2;->c:I

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gez v1, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ly2;->b(I)Lc3;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    const/4 v0, 0x0

    if-nez p2, :cond_0

    iget-object p2, p0, Ly2;->f:Landroid/view/LayoutInflater;

    iget v1, p0, Ly2;->g:I

    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1}, Ly2;->b(I)Lc3;

    move-result-object p3

    .line 1
    iget p3, p3, Lc3;->b:I

    add-int/lit8 v1, p1, -0x1

    if-ltz v1, :cond_1

    .line 2
    invoke-virtual {p0, v1}, Ly2;->b(I)Lc3;

    move-result-object v1

    .line 3
    iget v1, v1, Lc3;->b:I

    goto :goto_0

    :cond_1
    move v1, p3

    .line 4
    :goto_0
    move-object v2, p2

    check-cast v2, Landroidx/appcompat/view/menu/ListMenuItemView;

    iget-object v3, p0, Ly2;->b:Lz2;

    invoke-virtual {v3}, Lz2;->m()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-eq p3, v1, :cond_2

    const/4 p3, 0x1

    goto :goto_1

    :cond_2
    const/4 p3, 0x0

    :goto_1
    invoke-virtual {v2, p3}, Landroidx/appcompat/view/menu/ListMenuItemView;->setGroupDividerEnabled(Z)V

    move-object p3, p2

    check-cast p3, Ln3$a;

    iget-boolean v1, p0, Ly2;->d:Z

    if-eqz v1, :cond_3

    invoke-virtual {v2, v4}, Landroidx/appcompat/view/menu/ListMenuItemView;->setForceShowIcon(Z)V

    :cond_3
    invoke-virtual {p0, p1}, Ly2;->b(I)Lc3;

    move-result-object p1

    invoke-interface {p3, p1, v0}, Ln3$a;->c(Lc3;I)V

    return-object p2
.end method

.method public notifyDataSetChanged()V
    .locals 0

    invoke-virtual {p0}, Ly2;->a()V

    invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method
