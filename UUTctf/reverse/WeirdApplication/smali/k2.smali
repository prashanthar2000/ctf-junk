.class public Lk2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public A:Ld3;

.field public B:Ljava/lang/CharSequence;

.field public C:Ljava/lang/CharSequence;

.field public D:Landroid/content/res/ColorStateList;

.field public E:Landroid/graphics/PorterDuff$Mode;

.field public final synthetic F:Ll2;

.field public a:Landroid/view/Menu;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:Ljava/lang/CharSequence;

.field public l:Ljava/lang/CharSequence;

.field public m:I

.field public n:C

.field public o:I

.field public p:C

.field public q:I

.field public r:I

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:I

.field public w:I

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll2;Landroid/view/Menu;)V
    .locals 0

    iput-object p1, p0, Lk2;->F:Ll2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lk2;->D:Landroid/content/res/ColorStateList;

    iput-object p1, p0, Lk2;->E:Landroid/graphics/PorterDuff$Mode;

    iput-object p2, p0, Lk2;->a:Landroid/view/Menu;

    const/4 p1, 0x0

    .line 1
    iput p1, p0, Lk2;->b:I

    iput p1, p0, Lk2;->c:I

    iput p1, p0, Lk2;->d:I

    iput p1, p0, Lk2;->e:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lk2;->f:Z

    iput-boolean p1, p0, Lk2;->g:Z

    return-void
.end method


# virtual methods
.method public a()Landroid/view/SubMenu;
    .locals 5

    const/4 v0, 0x1

    iput-boolean v0, p0, Lk2;->h:Z

    iget-object v0, p0, Lk2;->a:Landroid/view/Menu;

    iget v1, p0, Lk2;->b:I

    iget v2, p0, Lk2;->i:I

    iget v3, p0, Lk2;->j:I

    iget-object v4, p0, Lk2;->k:Ljava/lang/CharSequence;

    invoke-interface {v0, v1, v2, v3, v4}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    move-result-object v1

    invoke-virtual {p0, v1}, Lk2;->c(Landroid/view/MenuItem;)V

    return-object v0
.end method

.method public final b(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lk2;->F:Ll2;

    iget-object v0, v0, Ll2;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    invoke-virtual {p2, p3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Cannot instantiate class: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p3, "SupportMenuInflater"

    invoke-static {p3, p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public final c(Landroid/view/MenuItem;)V
    .locals 7

    iget-boolean v0, p0, Lk2;->s:Z

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v1, p0, Lk2;->t:Z

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v1, p0, Lk2;->u:Z

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget v1, p0, Lk2;->r:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lt v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, Lk2;->l:Ljava/lang/CharSequence;

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    iget v1, p0, Lk2;->m:I

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    iget v0, p0, Lk2;->v:I

    if-ltz v0, :cond_1

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setShowAsAction(I)V

    :cond_1
    iget-object v0, p0, Lk2;->z:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lk2;->F:Ll2;

    iget-object v0, v0, Ll2;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->isRestricted()Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Lj2;

    iget-object v1, p0, Lk2;->F:Ll2;

    .line 1
    iget-object v4, v1, Ll2;->d:Ljava/lang/Object;

    if-nez v4, :cond_2

    iget-object v4, v1, Ll2;->c:Landroid/content/Context;

    invoke-virtual {v1, v4}, Ll2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v1, Ll2;->d:Ljava/lang/Object;

    :cond_2
    iget-object v1, v1, Ll2;->d:Ljava/lang/Object;

    .line 2
    iget-object v4, p0, Lk2;->z:Ljava/lang/String;

    invoke-direct {v0, v1, v4}, Lj2;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The android:onClick attribute cannot be used within a restricted context"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    instance-of v0, p1, Lc3;

    if-eqz v0, :cond_5

    move-object v1, p1

    check-cast v1, Lc3;

    :cond_5
    iget v1, p0, Lk2;->r:I

    const/4 v4, 0x2

    if-lt v1, v4, :cond_8

    if-eqz v0, :cond_6

    move-object v0, p1

    check-cast v0, Lc3;

    .line 3
    iget v1, v0, Lc3;->x:I

    and-int/lit8 v1, v1, -0x5

    or-int/lit8 v1, v1, 0x4

    iput v1, v0, Lc3;->x:I

    goto :goto_2

    .line 4
    :cond_6
    instance-of v0, p1, Li3;

    if-eqz v0, :cond_8

    move-object v0, p1

    check-cast v0, Li3;

    .line 5
    :try_start_0
    iget-object v1, v0, Li3;->e:Ljava/lang/reflect/Method;

    if-nez v1, :cond_7

    iget-object v1, v0, Li3;->d:Lqa;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v4, "setExclusiveCheckable"

    new-array v5, v3, [Ljava/lang/Class;

    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v6, v5, v2

    invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, v0, Li3;->e:Ljava/lang/reflect/Method;

    :cond_7
    iget-object v1, v0, Li3;->e:Ljava/lang/reflect/Method;

    iget-object v0, v0, Li3;->d:Lqa;

    new-array v4, v3, [Ljava/lang/Object;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v5, v4, v2

    invoke-virtual {v1, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const-string v1, "MenuItemWrapper"

    const-string v4, "Error while calling setExclusiveCheckable"

    invoke-static {v1, v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 6
    :cond_8
    :goto_2
    iget-object v0, p0, Lk2;->x:Ljava/lang/String;

    if-eqz v0, :cond_9

    sget-object v1, Ll2;->e:[Ljava/lang/Class;

    iget-object v2, p0, Lk2;->F:Ll2;

    iget-object v2, v2, Ll2;->a:[Ljava/lang/Object;

    invoke-virtual {p0, v0, v1, v2}, Lk2;->b(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    const/4 v2, 0x1

    :cond_9
    iget v0, p0, Lk2;->w:I

    if-lez v0, :cond_b

    if-nez v2, :cond_a

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(I)Landroid/view/MenuItem;

    goto :goto_3

    :cond_a
    const-string v0, "SupportMenuInflater"

    const-string v1, "Ignoring attribute \'itemActionViewLayout\'. Action view already specified."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_b
    :goto_3
    iget-object v0, p0, Lk2;->A:Ld3;

    if-eqz v0, :cond_d

    .line 7
    instance-of v1, p1, Lqa;

    if-eqz v1, :cond_c

    move-object v1, p1

    check-cast v1, Lqa;

    invoke-interface {v1, v0}, Lqa;->b(Ld3;)Lqa;

    goto :goto_4

    :cond_c
    const-string v0, "MenuItemCompat"

    const-string v1, "setActionProvider: item does not implement SupportMenuItem; ignoring"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    :cond_d
    :goto_4
    iget-object v0, p0, Lk2;->B:Ljava/lang/CharSequence;

    .line 9
    instance-of v1, p1, Lqa;

    const/16 v2, 0x1a

    if-eqz v1, :cond_e

    move-object v3, p1

    check-cast v3, Lqa;

    invoke-interface {v3, v0}, Lqa;->setContentDescription(Ljava/lang/CharSequence;)Lqa;

    goto :goto_5

    :cond_e
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v2, :cond_f

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setContentDescription(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 10
    :cond_f
    :goto_5
    iget-object v0, p0, Lk2;->C:Ljava/lang/CharSequence;

    if-eqz v1, :cond_10

    .line 11
    move-object v3, p1

    check-cast v3, Lqa;

    invoke-interface {v3, v0}, Lqa;->setTooltipText(Ljava/lang/CharSequence;)Lqa;

    goto :goto_6

    :cond_10
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v2, :cond_11

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setTooltipText(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 12
    :cond_11
    :goto_6
    iget-char v0, p0, Lk2;->n:C

    iget v3, p0, Lk2;->o:I

    if-eqz v1, :cond_12

    .line 13
    move-object v4, p1

    check-cast v4, Lqa;

    invoke-interface {v4, v0, v3}, Lqa;->setAlphabeticShortcut(CI)Landroid/view/MenuItem;

    goto :goto_7

    :cond_12
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v4, v2, :cond_13

    invoke-interface {p1, v0, v3}, Landroid/view/MenuItem;->setAlphabeticShortcut(CI)Landroid/view/MenuItem;

    .line 14
    :cond_13
    :goto_7
    iget-char v0, p0, Lk2;->p:C

    iget v3, p0, Lk2;->q:I

    if-eqz v1, :cond_14

    .line 15
    move-object v4, p1

    check-cast v4, Lqa;

    invoke-interface {v4, v0, v3}, Lqa;->setNumericShortcut(CI)Landroid/view/MenuItem;

    goto :goto_8

    :cond_14
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v4, v2, :cond_15

    invoke-interface {p1, v0, v3}, Landroid/view/MenuItem;->setNumericShortcut(CI)Landroid/view/MenuItem;

    .line 16
    :cond_15
    :goto_8
    iget-object v0, p0, Lk2;->E:Landroid/graphics/PorterDuff$Mode;

    if-eqz v0, :cond_17

    if-eqz v1, :cond_16

    .line 17
    move-object v3, p1

    check-cast v3, Lqa;

    invoke-interface {v3, v0}, Lqa;->setIconTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;

    goto :goto_9

    :cond_16
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v2, :cond_17

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIconTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;

    .line 18
    :cond_17
    :goto_9
    iget-object v0, p0, Lk2;->D:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_19

    if-eqz v1, :cond_18

    .line 19
    check-cast p1, Lqa;

    invoke-interface {p1, v0}, Lqa;->setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    goto :goto_a

    :cond_18
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v2, :cond_19

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    :cond_19
    :goto_a
    return-void
.end method
