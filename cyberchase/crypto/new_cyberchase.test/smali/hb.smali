.class public final Lhb;
.super Ljava/lang/Object;

# interfaces
.implements Ldd;


# instance fields
.field private a:C

.field final a:I

.field private a:Landroid/content/Intent;

.field private a:Landroid/content/res/ColorStateList;

.field private a:Landroid/graphics/PorterDuff$Mode;

.field private a:Landroid/graphics/drawable/Drawable;

.field a:Landroid/view/ContextMenu$ContextMenuInfo;

.field private a:Landroid/view/MenuItem$OnActionExpandListener;

.field private a:Landroid/view/MenuItem$OnMenuItemClickListener;

.field private a:Landroid/view/View;

.field public a:Ldy;

.field public a:Lgz;

.field private a:Lhm;

.field private a:Ljava/lang/CharSequence;

.field private a:Ljava/lang/Runnable;

.field private a:Z

.field private b:C

.field public b:I

.field private b:Ljava/lang/CharSequence;

.field private b:Z

.field public c:I

.field private c:Ljava/lang/CharSequence;

.field private c:Z

.field private final d:I

.field private d:Ljava/lang/CharSequence;

.field private d:Z

.field private final e:I

.field private final f:I

.field private g:I

.field private h:I

.field private i:I


# direct methods
.method constructor <init>(Lgz;IIIILjava/lang/CharSequence;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1000

    iput v0, p0, Lhb;->b:I

    iput v0, p0, Lhb;->c:I

    const/4 v0, 0x0

    iput v0, p0, Lhb;->g:I

    const/4 v1, 0x0

    iput-object v1, p0, Lhb;->a:Landroid/content/res/ColorStateList;

    iput-object v1, p0, Lhb;->a:Landroid/graphics/PorterDuff$Mode;

    iput-boolean v0, p0, Lhb;->a:Z

    iput-boolean v0, p0, Lhb;->b:Z

    iput-boolean v0, p0, Lhb;->c:Z

    const/16 v1, 0x10

    iput v1, p0, Lhb;->h:I

    iput v0, p0, Lhb;->i:I

    iput-boolean v0, p0, Lhb;->d:Z

    iput-object p1, p0, Lhb;->a:Lgz;

    iput p3, p0, Lhb;->d:I

    iput p2, p0, Lhb;->e:I

    iput p4, p0, Lhb;->f:I

    iput p5, p0, Lhb;->a:I

    iput-object p6, p0, Lhb;->a:Ljava/lang/CharSequence;

    iput p7, p0, Lhb;->i:I

    return-void
.end method

.method private a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 1

    if-eqz p1, :cond_3

    iget-boolean v0, p0, Lhb;->c:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lhb;->a:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lhb;->b:Z

    if-eqz v0, :cond_3

    :cond_0
    invoke-static {p1}, Lcx;->a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget-boolean v0, p0, Lhb;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lhb;->a:Landroid/content/res/ColorStateList;

    invoke-static {p1, v0}, Lcx;->a(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_1
    iget-boolean v0, p0, Lhb;->b:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lhb;->a:Landroid/graphics/PorterDuff$Mode;

    invoke-static {p1, v0}, Lcx;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lhb;->c:Z

    :cond_3
    return-object p1
.end method

.method private a(Landroid/view/View;)Ldd;
    .locals 2

    iput-object p1, p0, Lhb;->a:Landroid/view/View;

    const/4 v0, 0x0

    iput-object v0, p0, Lhb;->a:Ldy;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lhb;->d:I

    if-lez v0, :cond_0

    invoke-virtual {p1, v0}, Landroid/view/View;->setId(I)V

    :cond_0
    iget-object p1, p0, Lhb;->a:Lgz;

    invoke-virtual {p1}, Lgz;->d()V

    return-object p0
.end method

.method public static a(Ljava/lang/StringBuilder;IILjava/lang/String;)V
    .locals 0

    and-int/2addr p1, p2

    if-ne p1, p2, :cond_0

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method private d(Z)V
    .locals 3

    iget v0, p0, Lhb;->h:I

    and-int/lit8 v1, v0, -0x3

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    or-int/2addr p1, v1

    iput p1, p0, Lhb;->h:I

    iget p1, p0, Lhb;->h:I

    if-eq v0, p1, :cond_1

    iget-object p1, p0, Lhb;->a:Lgz;

    invoke-virtual {p1, v2}, Lgz;->b(Z)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()C
    .locals 1

    iget-object v0, p0, Lhb;->a:Lgz;

    invoke-virtual {v0}, Lgz;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-char v0, p0, Lhb;->b:C

    return v0

    :cond_0
    iget-char v0, p0, Lhb;->a:C

    return v0
.end method

.method public final a(Ldy;)Ldd;
    .locals 2

    iget-object v0, p0, Lhb;->a:Ldy;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-object v1, v0, Ldy;->a:Ldy$b;

    iput-object v1, v0, Ldy;->a:Ldy$a;

    :cond_0
    iput-object v1, p0, Lhb;->a:Landroid/view/View;

    iput-object p1, p0, Lhb;->a:Ldy;

    iget-object p1, p0, Lhb;->a:Lgz;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lgz;->b(Z)V

    iget-object p1, p0, Lhb;->a:Ldy;

    if-eqz p1, :cond_1

    new-instance v0, Lhb$1;

    invoke-direct {v0, p0}, Lhb$1;-><init>(Lhb;)V

    invoke-virtual {p1, v0}, Ldy;->a(Ldy$b;)V

    :cond_1
    return-object p0
.end method

.method public final a(Ljava/lang/CharSequence;)Ldd;
    .locals 1

    iput-object p1, p0, Lhb;->c:Ljava/lang/CharSequence;

    iget-object p1, p0, Lhb;->a:Lgz;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lgz;->b(Z)V

    return-object p0
.end method

.method public final a()Ldy;
    .locals 1

    iget-object v0, p0, Lhb;->a:Ldy;

    return-object v0
.end method

.method public final a(Lhh$a;)Ljava/lang/CharSequence;
    .locals 0

    invoke-interface {p1}, Lhh$a;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lhb;->getTitleCondensed()Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lhb;->getTitle()Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lhm;)V
    .locals 1

    iput-object p1, p0, Lhb;->a:Lhm;

    invoke-virtual {p0}, Lhb;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Lhm;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;

    return-void
.end method

.method public final a(Z)V
    .locals 1

    iget v0, p0, Lhb;->h:I

    and-int/lit8 v0, v0, -0x5

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    or-int/2addr p1, v0

    iput p1, p0, Lhb;->h:I

    return-void
.end method

.method public final a()Z
    .locals 4

    iget-object v0, p0, Lhb;->a:Landroid/view/MenuItem$OnMenuItemClickListener;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Landroid/view/MenuItem$OnMenuItemClickListener;->onMenuItemClick(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lhb;->a:Lgz;

    invoke-virtual {v0, v0, p0}, Lgz;->a(Lgz;Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lhb;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return v1

    :cond_2
    iget-object v0, p0, Lhb;->a:Landroid/content/Intent;

    if-eqz v0, :cond_3

    :try_start_0
    iget-object v0, p0, Lhb;->a:Lgz;

    iget-object v0, v0, Lgz;->a:Landroid/content/Context;

    iget-object v2, p0, Lhb;->a:Landroid/content/Intent;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception v0

    const-string v2, "MenuItemImpl"

    const-string v3, "Can\'t find activity to handle intent; ignoring"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_3
    iget-object v0, p0, Lhb;->a:Ldy;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ldy;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    return v1

    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method final a(Z)Z
    .locals 3

    iget v0, p0, Lhb;->h:I

    and-int/lit8 v1, v0, -0x9

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    or-int/2addr p1, v1

    iput p1, p0, Lhb;->h:I

    iget p1, p0, Lhb;->h:I

    if-eq v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v2
.end method

.method public final b(Ljava/lang/CharSequence;)Ldd;
    .locals 1

    iput-object p1, p0, Lhb;->d:Ljava/lang/CharSequence;

    iget-object p1, p0, Lhb;->a:Lgz;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lgz;->b(Z)V

    return-object p0
.end method

.method public final b(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget p1, p0, Lhb;->h:I

    or-int/lit8 p1, p1, 0x20

    :goto_0
    iput p1, p0, Lhb;->h:I

    return-void

    :cond_0
    iget p1, p0, Lhb;->h:I

    and-int/lit8 p1, p1, -0x21

    goto :goto_0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lhb;->a:Lgz;

    invoke-virtual {v0}, Lgz;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lhb;->a()C

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c(Z)V
    .locals 1

    iput-boolean p1, p0, Lhb;->d:Z

    iget-object p1, p0, Lhb;->a:Lgz;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lgz;->b(Z)V

    return-void
.end method

.method public final c()Z
    .locals 1

    iget v0, p0, Lhb;->h:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final collapseActionView()Z
    .locals 2

    iget v0, p0, Lhb;->i:I

    and-int/lit8 v0, v0, 0x8

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lhb;->a:Landroid/view/View;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    iget-object v0, p0, Lhb;->a:Landroid/view/MenuItem$OnActionExpandListener;

    if-eqz v0, :cond_3

    invoke-interface {v0, p0}, Landroid/view/MenuItem$OnActionExpandListener;->onMenuItemActionCollapse(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    return v1

    :cond_3
    :goto_0
    iget-object v0, p0, Lhb;->a:Lgz;

    invoke-virtual {v0, p0}, Lgz;->b(Lhb;)Z

    move-result v0

    return v0
.end method

.method public final d()Z
    .locals 2

    iget v0, p0, Lhb;->h:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e()Z
    .locals 2

    iget v0, p0, Lhb;->i:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final expandActionView()Z
    .locals 2

    invoke-virtual {p0}, Lhb;->h()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lhb;->a:Landroid/view/MenuItem$OnActionExpandListener;

    if-eqz v0, :cond_2

    invoke-interface {v0, p0}, Landroid/view/MenuItem$OnActionExpandListener;->onMenuItemActionExpand(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_0
    iget-object v0, p0, Lhb;->a:Lgz;

    invoke-virtual {v0, p0}, Lgz;->a(Lhb;)Z

    move-result v0

    return v0
.end method

.method public final f()Z
    .locals 2

    iget v0, p0, Lhb;->i:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final g()Z
    .locals 2

    iget v0, p0, Lhb;->i:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getActionProvider()Landroid/view/ActionProvider;
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This is not supported, use MenuItemCompat.getActionProvider()"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getActionView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lhb;->a:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lhb;->a:Ldy;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p0}, Ldy;->a(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lhb;->a:Landroid/view/View;

    iget-object v0, p0, Lhb;->a:Landroid/view/View;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getAlphabeticModifiers()I
    .locals 1

    iget v0, p0, Lhb;->c:I

    return v0
.end method

.method public final getAlphabeticShortcut()C
    .locals 1

    iget-char v0, p0, Lhb;->b:C

    return v0
.end method

.method public final getContentDescription()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lhb;->c:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final getGroupId()I
    .locals 1

    iget v0, p0, Lhb;->e:I

    return v0
.end method

.method public final getIcon()Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-object v0, p0, Lhb;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lhb;->a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    :cond_0
    iget v0, p0, Lhb;->g:I

    if-eqz v0, :cond_1

    iget-object v0, p0, Lhb;->a:Lgz;

    iget-object v0, v0, Lgz;->a:Landroid/content/Context;

    iget v1, p0, Lhb;->g:I

    invoke-static {v0, v1}, Lgd;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, p0, Lhb;->g:I

    iput-object v0, p0, Lhb;->a:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v0}, Lhb;->a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getIconTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lhb;->a:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public final getIconTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lhb;->a:Landroid/graphics/PorterDuff$Mode;

    return-object v0
.end method

.method public final getIntent()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lhb;->a:Landroid/content/Intent;

    return-object v0
.end method

.method public final getItemId()I
    .locals 1
    .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
    .end annotation

    iget v0, p0, Lhb;->d:I

    return v0
.end method

.method public final getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;
    .locals 1

    iget-object v0, p0, Lhb;->a:Landroid/view/ContextMenu$ContextMenuInfo;

    return-object v0
.end method

.method public final getNumericModifiers()I
    .locals 1

    iget v0, p0, Lhb;->b:I

    return v0
.end method

.method public final getNumericShortcut()C
    .locals 1

    iget-char v0, p0, Lhb;->a:C

    return v0
.end method

.method public final getOrder()I
    .locals 1

    iget v0, p0, Lhb;->f:I

    return v0
.end method

.method public final getSubMenu()Landroid/view/SubMenu;
    .locals 1

    iget-object v0, p0, Lhb;->a:Lhm;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/CharSequence;
    .locals 1
    .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
    .end annotation

    iget-object v0, p0, Lhb;->a:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final getTitleCondensed()Ljava/lang/CharSequence;
    .locals 3

    iget-object v0, p0, Lhb;->b:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lhb;->a:Ljava/lang/CharSequence;

    :goto_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x12

    if-ge v1, v2, :cond_1

    if-eqz v0, :cond_1

    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public final getTooltipText()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lhb;->d:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    iget v0, p0, Lhb;->i:I

    and-int/lit8 v0, v0, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lhb;->a:Landroid/view/View;

    if-nez v0, :cond_0

    iget-object v0, p0, Lhb;->a:Ldy;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Ldy;->a(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lhb;->a:Landroid/view/View;

    :cond_0
    iget-object v0, p0, Lhb;->a:Landroid/view/View;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method public final hasSubMenu()Z
    .locals 1

    iget-object v0, p0, Lhb;->a:Lhm;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isActionViewExpanded()Z
    .locals 1

    iget-boolean v0, p0, Lhb;->d:Z

    return v0
.end method

.method public final isCheckable()Z
    .locals 2

    iget v0, p0, Lhb;->h:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isChecked()Z
    .locals 2

    iget v0, p0, Lhb;->h:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isEnabled()Z
    .locals 1

    iget v0, p0, Lhb;->h:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isVisible()Z
    .locals 3

    iget-object v0, p0, Lhb;->a:Ldy;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ldy;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lhb;->h:I

    and-int/lit8 v0, v0, 0x8

    if-nez v0, :cond_0

    iget-object v0, p0, Lhb;->a:Ldy;

    invoke-virtual {v0}, Ldy;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    return v2

    :cond_1
    iget v0, p0, Lhb;->h:I

    and-int/lit8 v0, v0, 0x8

    if-nez v0, :cond_2

    return v1

    :cond_2
    return v2
.end method

.method public final setActionProvider(Landroid/view/ActionProvider;)Landroid/view/MenuItem;
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "This is not supported, use MenuItemCompat.setActionProvider()"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final synthetic setActionView(I)Landroid/view/MenuItem;
    .locals 3

    iget-object v0, p0, Lhb;->a:Lgz;

    iget-object v0, v0, Lgz;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    invoke-virtual {v1, p1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1}, Lhb;->a(Landroid/view/View;)Ldd;

    return-object p0
.end method

.method public final synthetic setActionView(Landroid/view/View;)Landroid/view/MenuItem;
    .locals 0

    invoke-direct {p0, p1}, Lhb;->a(Landroid/view/View;)Ldd;

    move-result-object p1

    return-object p1
.end method

.method public final setAlphabeticShortcut(C)Landroid/view/MenuItem;
    .locals 1

    iget-char v0, p0, Lhb;->b:C

    if-ne v0, p1, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    iput-char p1, p0, Lhb;->b:C

    iget-object p1, p0, Lhb;->a:Lgz;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lgz;->b(Z)V

    return-object p0
.end method

.method public final setAlphabeticShortcut(CI)Landroid/view/MenuItem;
    .locals 1

    iget-char v0, p0, Lhb;->b:C

    if-ne v0, p1, :cond_0

    iget v0, p0, Lhb;->c:I

    if-ne v0, p2, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    iput-char p1, p0, Lhb;->b:C

    invoke-static {p2}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result p1

    iput p1, p0, Lhb;->c:I

    iget-object p1, p0, Lhb;->a:Lgz;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lgz;->b(Z)V

    return-object p0
.end method

.method public final setCheckable(Z)Landroid/view/MenuItem;
    .locals 2

    iget v0, p0, Lhb;->h:I

    and-int/lit8 v1, v0, -0x2

    or-int/2addr p1, v1

    iput p1, p0, Lhb;->h:I

    iget p1, p0, Lhb;->h:I

    if-eq v0, p1, :cond_0

    iget-object p1, p0, Lhb;->a:Lgz;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lgz;->b(Z)V

    :cond_0
    return-object p0
.end method

.method public final setChecked(Z)Landroid/view/MenuItem;
    .locals 6

    iget v0, p0, Lhb;->h:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_3

    iget-object p1, p0, Lhb;->a:Lgz;

    invoke-interface {p0}, Landroid/view/MenuItem;->getGroupId()I

    move-result v0

    iget-object v1, p1, Lgz;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p1}, Lgz;->a()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    iget-object v4, p1, Lgz;->a:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lhb;

    invoke-virtual {v4}, Lhb;->getGroupId()I

    move-result v5

    if-ne v5, v0, :cond_1

    invoke-virtual {v4}, Lhb;->c()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Lhb;->isCheckable()Z

    move-result v5

    if-eqz v5, :cond_1

    if-ne v4, p0, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    invoke-direct {v4, v5}, Lhb;->d(Z)V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lgz;->b()V

    goto :goto_2

    :cond_3
    invoke-direct {p0, p1}, Lhb;->d(Z)V

    :goto_2
    return-object p0
.end method

.method public final synthetic setContentDescription(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 0

    invoke-virtual {p0, p1}, Lhb;->a(Ljava/lang/CharSequence;)Ldd;

    move-result-object p1

    return-object p1
.end method

.method public final setEnabled(Z)Landroid/view/MenuItem;
    .locals 1

    if-eqz p1, :cond_0

    iget p1, p0, Lhb;->h:I

    or-int/lit8 p1, p1, 0x10

    goto :goto_0

    :cond_0
    iget p1, p0, Lhb;->h:I

    and-int/lit8 p1, p1, -0x11

    :goto_0
    iput p1, p0, Lhb;->h:I

    iget-object p1, p0, Lhb;->a:Lgz;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lgz;->b(Z)V

    return-object p0
.end method

.method public final setIcon(I)Landroid/view/MenuItem;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lhb;->a:Landroid/graphics/drawable/Drawable;

    iput p1, p0, Lhb;->g:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lhb;->c:Z

    iget-object p1, p0, Lhb;->a:Lgz;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lgz;->b(Z)V

    return-object p0
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lhb;->g:I

    iput-object p1, p0, Lhb;->a:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lhb;->c:Z

    iget-object p1, p0, Lhb;->a:Lgz;

    invoke-virtual {p1, v0}, Lgz;->b(Z)V

    return-object p0
.end method

.method public final setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;
    .locals 1

    iput-object p1, p0, Lhb;->a:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lhb;->a:Z

    iput-boolean p1, p0, Lhb;->c:Z

    iget-object p1, p0, Lhb;->a:Lgz;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lgz;->b(Z)V

    return-object p0
.end method

.method public final setIconTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;
    .locals 1

    iput-object p1, p0, Lhb;->a:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lhb;->b:Z

    iput-boolean p1, p0, Lhb;->c:Z

    iget-object p1, p0, Lhb;->a:Lgz;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lgz;->b(Z)V

    return-object p0
.end method

.method public final setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;
    .locals 0

    iput-object p1, p0, Lhb;->a:Landroid/content/Intent;

    return-object p0
.end method

.method public final setNumericShortcut(C)Landroid/view/MenuItem;
    .locals 1

    iget-char v0, p0, Lhb;->a:C

    if-ne v0, p1, :cond_0

    return-object p0

    :cond_0
    iput-char p1, p0, Lhb;->a:C

    iget-object p1, p0, Lhb;->a:Lgz;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lgz;->b(Z)V

    return-object p0
.end method

.method public final setNumericShortcut(CI)Landroid/view/MenuItem;
    .locals 1

    iget-char v0, p0, Lhb;->a:C

    if-ne v0, p1, :cond_0

    iget v0, p0, Lhb;->b:I

    if-ne v0, p2, :cond_0

    return-object p0

    :cond_0
    iput-char p1, p0, Lhb;->a:C

    invoke-static {p2}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result p1

    iput p1, p0, Lhb;->b:I

    iget-object p1, p0, Lhb;->a:Lgz;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lgz;->b(Z)V

    return-object p0
.end method

.method public final setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;
    .locals 0

    iput-object p1, p0, Lhb;->a:Landroid/view/MenuItem$OnActionExpandListener;

    return-object p0
.end method

.method public final setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;
    .locals 0

    iput-object p1, p0, Lhb;->a:Landroid/view/MenuItem$OnMenuItemClickListener;

    return-object p0
.end method

.method public final setShortcut(CC)Landroid/view/MenuItem;
    .locals 0

    iput-char p1, p0, Lhb;->a:C

    invoke-static {p2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    iput-char p1, p0, Lhb;->b:C

    iget-object p1, p0, Lhb;->a:Lgz;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lgz;->b(Z)V

    return-object p0
.end method

.method public final setShortcut(CCII)Landroid/view/MenuItem;
    .locals 0

    iput-char p1, p0, Lhb;->a:C

    invoke-static {p3}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result p1

    iput p1, p0, Lhb;->b:I

    invoke-static {p2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    iput-char p1, p0, Lhb;->b:C

    invoke-static {p4}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result p1

    iput p1, p0, Lhb;->c:I

    iget-object p1, p0, Lhb;->a:Lgz;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lgz;->b(Z)V

    return-object p0
.end method

.method public final setShowAsAction(I)V
    .locals 1

    and-int/lit8 v0, p1, 0x3

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iput p1, p0, Lhb;->i:I

    iget-object p1, p0, Lhb;->a:Lgz;

    invoke-virtual {p1}, Lgz;->d()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic setShowAsActionFlags(I)Landroid/view/MenuItem;
    .locals 0

    invoke-virtual {p0, p1}, Lhb;->setShowAsAction(I)V

    return-object p0
.end method

.method public final setTitle(I)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lhb;->a:Lgz;

    iget-object v0, v0, Lgz;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lhb;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p1

    return-object p1
.end method

.method public final setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 2

    iput-object p1, p0, Lhb;->a:Ljava/lang/CharSequence;

    iget-object v0, p0, Lhb;->a:Lgz;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lgz;->b(Z)V

    iget-object v0, p0, Lhb;->a:Lhm;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lhm;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;

    :cond_0
    return-object p0
.end method

.method public final setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    iput-object p1, p0, Lhb;->b:Ljava/lang/CharSequence;

    iget-object p1, p0, Lhb;->a:Lgz;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lgz;->b(Z)V

    return-object p0
.end method

.method public final synthetic setTooltipText(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 0

    invoke-virtual {p0, p1}, Lhb;->b(Ljava/lang/CharSequence;)Ldd;

    move-result-object p1

    return-object p1
.end method

.method public final setVisible(Z)Landroid/view/MenuItem;
    .locals 0

    invoke-virtual {p0, p1}, Lhb;->a(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lhb;->a:Lgz;

    invoke-virtual {p1}, Lgz;->c()V

    :cond_0
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhb;->a:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
