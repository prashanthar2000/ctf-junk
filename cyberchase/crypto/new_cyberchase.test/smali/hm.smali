.class public final Lhm;
.super Lgz;

# interfaces
.implements Landroid/view/SubMenu;


# instance fields
.field public a:Lgz;

.field private b:Lhb;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lgz;Lhb;)V
    .locals 0

    invoke-direct {p0, p1}, Lgz;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lhm;->a:Lgz;

    iput-object p3, p0, Lhm;->b:Lhb;

    return-void
.end method


# virtual methods
.method public final a()Lgz;
    .locals 1

    iget-object v0, p0, Lhm;->a:Lgz;

    invoke-virtual {v0}, Lgz;->a()Lgz;

    move-result-object v0

    return-object v0
.end method

.method public final a()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lhm;->b:Lhb;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lhb;->getItemId()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Lgz;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lgz$a;)V
    .locals 1

    iget-object v0, p0, Lhm;->a:Lgz;

    invoke-virtual {v0, p1}, Lgz;->a(Lgz$a;)V

    return-void
.end method

.method public final a()Z
    .locals 1

    iget-object v0, p0, Lhm;->a:Lgz;

    invoke-virtual {v0}, Lgz;->a()Z

    move-result v0

    return v0
.end method

.method final a(Lgz;Landroid/view/MenuItem;)Z
    .locals 1

    invoke-super {p0, p1, p2}, Lgz;->a(Lgz;Landroid/view/MenuItem;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lhm;->a:Lgz;

    invoke-virtual {v0, p1, p2}, Lgz;->a(Lgz;Landroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final a(Lhb;)Z
    .locals 1

    iget-object v0, p0, Lhm;->a:Lgz;

    invoke-virtual {v0, p1}, Lgz;->a(Lhb;)Z

    move-result p1

    return p1
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lhm;->a:Lgz;

    invoke-virtual {v0}, Lgz;->b()Z

    move-result v0

    return v0
.end method

.method public final b(Lhb;)Z
    .locals 1

    iget-object v0, p0, Lhm;->a:Lgz;

    invoke-virtual {v0, p1}, Lgz;->b(Lhb;)Z

    move-result p1

    return p1
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, Lhm;->a:Lgz;

    invoke-virtual {v0}, Lgz;->c()Z

    move-result v0

    return v0
.end method

.method public final getItem()Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lhm;->b:Lhb;

    return-object v0
.end method

.method public final setGroupDividerEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lhm;->a:Lgz;

    invoke-virtual {v0, p1}, Lgz;->setGroupDividerEnabled(Z)V

    return-void
.end method

.method public final setHeaderIcon(I)Landroid/view/SubMenu;
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move v3, p1

    invoke-super/range {v0 .. v5}, Lgz;->a(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    move-object p1, p0

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public final setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v4, p1

    invoke-super/range {v0 .. v5}, Lgz;->a(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    move-object p1, p0

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public final setHeaderTitle(I)Landroid/view/SubMenu;
    .locals 6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    invoke-super/range {v0 .. v5}, Lgz;->a(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    move-object p1, p0

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public final setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 6

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-super/range {v0 .. v5}, Lgz;->a(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    move-object p1, p0

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public final setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v5, p1

    invoke-super/range {v0 .. v5}, Lgz;->a(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    move-object p1, p0

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public final setIcon(I)Landroid/view/SubMenu;
    .locals 1

    iget-object v0, p0, Lhm;->b:Lhb;

    invoke-virtual {v0, p1}, Lhb;->setIcon(I)Landroid/view/MenuItem;

    return-object p0
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    iget-object v0, p0, Lhm;->b:Lhb;

    invoke-virtual {v0, p1}, Lhb;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public final setQwertyMode(Z)V
    .locals 1

    iget-object v0, p0, Lhm;->a:Lgz;

    invoke-virtual {v0, p1}, Lgz;->setQwertyMode(Z)V

    return-void
.end method
