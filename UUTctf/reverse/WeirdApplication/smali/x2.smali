.class public Lx2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm3;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public b:Landroid/content/Context;

.field public c:Landroid/view/LayoutInflater;

.field public d:Lz2;

.field public e:Landroidx/appcompat/view/menu/ExpandedMenuView;

.field public f:I

.field public g:I

.field public h:I

.field public i:Lm3$a;

.field public j:Lw2;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lx2;->h:I

    const/4 p2, 0x0

    iput p2, p0, Lx2;->g:I

    .line 2
    iput-object p1, p0, Lx2;->b:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lx2;->c:Landroid/view/LayoutInflater;

    return-void
.end method


# virtual methods
.method public a()Landroid/widget/ListAdapter;
    .locals 1

    iget-object v0, p0, Lx2;->j:Lw2;

    if-nez v0, :cond_0

    new-instance v0, Lw2;

    invoke-direct {v0, p0}, Lw2;-><init>(Lx2;)V

    iput-object v0, p0, Lx2;->j:Lw2;

    :cond_0
    iget-object v0, p0, Lx2;->j:Lw2;

    return-object v0
.end method

.method public b(Lz2;Z)V
    .locals 1

    iget-object v0, p0, Lx2;->i:Lm3$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lm3$a;->b(Lz2;Z)V

    :cond_0
    return-void
.end method

.method public c(Lz2;Lc3;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public d(Lm3$a;)V
    .locals 0

    iput-object p1, p0, Lx2;->i:Lm3$a;

    return-void
.end method

.method public f(Lt3;)Z
    .locals 6

    invoke-virtual {p1}, Lz2;->hasVisibleItems()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    new-instance v0, La3;

    invoke-direct {v0, p1}, La3;-><init>(Lz2;)V

    .line 1
    iget-object v1, v0, La3;->b:Lz2;

    new-instance v2, La0;

    .line 2
    iget-object v3, v1, Lz2;->a:Landroid/content/Context;

    .line 3
    invoke-direct {v2, v3}, La0;-><init>(Landroid/content/Context;)V

    new-instance v3, Lx2;

    .line 4
    iget-object v4, v2, La0;->a:Lx;

    iget-object v4, v4, Lx;->a:Landroid/content/Context;

    .line 5
    sget v5, Ll;->abc_list_menu_item_layout:I

    invoke-direct {v3, v4, v5}, Lx2;-><init>(Landroid/content/Context;I)V

    iput-object v3, v0, La3;->d:Lx2;

    .line 6
    iput-object v0, v3, Lx2;->i:Lm3$a;

    .line 7
    iget-object v4, v0, La3;->b:Lz2;

    .line 8
    iget-object v5, v4, Lz2;->a:Landroid/content/Context;

    invoke-virtual {v4, v3, v5}, Lz2;->b(Lm3;Landroid/content/Context;)V

    .line 9
    iget-object v3, v0, La3;->d:Lx2;

    invoke-virtual {v3}, Lx2;->a()Landroid/widget/ListAdapter;

    move-result-object v3

    .line 10
    iget-object v4, v2, La0;->a:Lx;

    iput-object v3, v4, Lx;->l:Landroid/widget/ListAdapter;

    iput-object v0, v4, Lx;->m:Landroid/content/DialogInterface$OnClickListener;

    .line 11
    iget-object v3, v1, Lz2;->o:Landroid/view/View;

    if-eqz v3, :cond_1

    .line 12
    iput-object v3, v4, Lx;->g:Landroid/view/View;

    goto :goto_0

    .line 13
    :cond_1
    iget-object v3, v1, Lz2;->n:Landroid/graphics/drawable/Drawable;

    .line 14
    iput-object v3, v4, Lx;->d:Landroid/graphics/drawable/Drawable;

    .line 15
    iget-object v1, v1, Lz2;->m:Ljava/lang/CharSequence;

    .line 16
    iput-object v1, v4, Lx;->f:Ljava/lang/CharSequence;

    .line 17
    :goto_0
    iget-object v1, v2, La0;->a:Lx;

    iput-object v0, v1, Lx;->k:Landroid/content/DialogInterface$OnKeyListener;

    .line 18
    invoke-virtual {v2}, La0;->a()Lb0;

    move-result-object v1

    iput-object v1, v0, La3;->c:Lb0;

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, v0, La3;->c:Lb0;

    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    const/16 v2, 0x3eb

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->type:I

    iget v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/high16 v3, 0x20000

    or-int/2addr v2, v3

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    iget-object v0, v0, La3;->c:Lb0;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 19
    iget-object v0, p0, Lx2;->i:Lm3$a;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lm3$a;->c(Lz2;)Z

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public g()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public h(Z)V
    .locals 0

    iget-object p1, p0, Lx2;->j:Lw2;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lw2;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public j(Landroid/content/Context;Lz2;)V
    .locals 2

    iget v0, p0, Lx2;->g:I

    if-eqz v0, :cond_0

    new-instance v0, Landroid/view/ContextThemeWrapper;

    iget v1, p0, Lx2;->g:I

    invoke-direct {v0, p1, v1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lx2;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx2;->b:Landroid/content/Context;

    if-eqz v0, :cond_1

    iput-object p1, p0, Lx2;->b:Landroid/content/Context;

    iget-object v0, p0, Lx2;->c:Landroid/view/LayoutInflater;

    if-nez v0, :cond_1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lx2;->c:Landroid/view/LayoutInflater;

    :cond_1
    iput-object p2, p0, Lx2;->d:Lz2;

    iget-object p1, p0, Lx2;->j:Lw2;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lw2;->notifyDataSetChanged()V

    :cond_2
    return-void
.end method

.method public k(Lz2;Lc3;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-object p1, p0, Lx2;->d:Lz2;

    iget-object p2, p0, Lx2;->j:Lw2;

    invoke-virtual {p2, p3}, Lw2;->b(I)Lc3;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p0, p3}, Lz2;->s(Landroid/view/MenuItem;Lm3;I)Z

    return-void
.end method
