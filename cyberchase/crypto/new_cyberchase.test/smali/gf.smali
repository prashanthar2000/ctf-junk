.class Lgf;
.super Landroid/graphics/drawable/Drawable;

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgf$a;,
        Lgf$b;
    }
.end annotation


# instance fields
.field a:I

.field private a:J

.field private a:Landroid/graphics/Rect;

.field private a:Landroid/graphics/drawable/Drawable;

.field private a:Lgf$a;

.field a:Lgf$b;

.field private a:Ljava/lang/Runnable;

.field private a:Z

.field private b:I

.field private b:J

.field private b:Landroid/graphics/drawable/Drawable;

.field private b:Z

.field private c:I


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/16 v0, 0xff

    iput v0, p0, Lgf;->b:I

    const/4 v0, -0x1

    iput v0, p0, Lgf;->a:I

    iput v0, p0, Lgf;->c:I

    return-void
.end method

.method static a(Landroid/content/res/Resources;I)I
    .locals 0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p1, p0, Landroid/util/DisplayMetrics;->densityDpi:I

    :goto_0
    if-nez p1, :cond_1

    const/16 p0, 0xa0

    return p0

    :cond_1
    return p1
.end method

.method private a(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    iget-object v0, p0, Lgf;->a:Lgf$a;

    if-nez v0, :cond_0

    new-instance v0, Lgf$a;

    invoke-direct {v0}, Lgf$a;-><init>()V

    iput-object v0, p0, Lgf;->a:Lgf$a;

    :cond_0
    iget-object v0, p0, Lgf;->a:Lgf$a;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v1

    iput-object v1, v0, Lgf$a;->a:Landroid/graphics/drawable/Drawable$Callback;

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :try_start_0
    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget v0, v0, Lgf$b;->k:I

    if-gtz v0, :cond_1

    iget-boolean v0, p0, Lgf;->a:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lgf;->b:I

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    :cond_1
    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget-boolean v0, v0, Lgf$b;->m:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget-object v0, v0, Lgf$b;->a:Landroid/graphics/ColorFilter;

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget-boolean v0, v0, Lgf$b;->n:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget-object v0, v0, Lgf$b;->a:Landroid/content/res/ColorStateList;

    invoke-static {p1, v0}, Lcx;->a(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_3
    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget-boolean v0, v0, Lgf$b;->o:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget-object v0, v0, Lgf$b;->a:Landroid/graphics/PorterDuff$Mode;

    invoke-static {p1, v0}, Lcx;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_4
    :goto_0
    invoke-virtual {p0}, Lgf;->isVisible()Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget-boolean v0, v0, Lgf$b;->j:Z

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setDither(Z)V

    invoke-virtual {p0}, Lgf;->getState()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    invoke-virtual {p0}, Lgf;->getLevel()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    invoke-virtual {p0}, Lgf;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_5

    invoke-virtual {p0}, Lgf;->getLayoutDirection()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    :cond_5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_6

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget-boolean v0, v0, Lgf$b;->l:Z

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    :cond_6
    iget-object v0, p0, Lgf;->a:Landroid/graphics/Rect;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_7

    if-eqz v0, :cond_7

    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget v2, v0, Landroid/graphics/Rect;->top:I

    iget v3, v0, Landroid/graphics/Rect;->right:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1, v1, v2, v3, v0}, Landroid/graphics/drawable/Drawable;->setHotspotBounds(IIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_7
    iget-object v0, p0, Lgf;->a:Lgf$a;

    invoke-virtual {v0}, Lgf$a;->a()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lgf;->a:Lgf$a;

    invoke-virtual {v1}, Lgf$a;->a()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    throw v0
.end method


# virtual methods
.method a()Lgf$b;
    .locals 1

    iget-object v0, p0, Lgf;->a:Lgf$b;

    return-object v0
.end method

.method protected a(Lgf$b;)V
    .locals 1

    iput-object p1, p0, Lgf;->a:Lgf$b;

    iget v0, p0, Lgf;->a:I

    if-ltz v0, :cond_0

    invoke-virtual {p1, v0}, Lgf$b;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    iget-object p1, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lgf;->a(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    const/4 p1, -0x1

    iput p1, p0, Lgf;->c:I

    const/4 p1, 0x0

    iput-object p1, p0, Lgf;->b:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method final a(Z)V
    .locals 13

    const/4 v0, 0x1

    iput-boolean v0, p0, Lgf;->a:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iget-object v3, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    const-wide/16 v4, 0xff

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    if-eqz v3, :cond_1

    iget-wide v9, p0, Lgf;->a:J

    cmp-long v11, v9, v7

    if-eqz v11, :cond_2

    cmp-long v11, v9, v1

    if-gtz v11, :cond_0

    iget v9, p0, Lgf;->b:I

    invoke-virtual {v3, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_0

    :cond_0
    sub-long/2addr v9, v1

    mul-long v9, v9, v4

    long-to-int v3, v9

    iget-object v9, p0, Lgf;->a:Lgf$b;

    iget v9, v9, Lgf$b;->k:I

    div-int/2addr v3, v9

    iget-object v9, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    rsub-int v3, v3, 0xff

    iget v10, p0, Lgf;->b:I

    mul-int v3, v3, v10

    div-int/lit16 v3, v3, 0xff

    invoke-virtual {v9, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    iput-wide v7, p0, Lgf;->a:J

    :cond_2
    const/4 v3, 0x0

    :goto_1
    iget-object v9, p0, Lgf;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v9, :cond_4

    iget-wide v10, p0, Lgf;->b:J

    cmp-long v12, v10, v7

    if-eqz v12, :cond_5

    cmp-long v12, v10, v1

    if-gtz v12, :cond_3

    invoke-virtual {v9, v6, v6}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lgf;->b:Landroid/graphics/drawable/Drawable;

    const/4 v0, -0x1

    iput v0, p0, Lgf;->c:I

    goto :goto_2

    :cond_3
    sub-long/2addr v10, v1

    mul-long v10, v10, v4

    long-to-int v3, v10

    iget-object v4, p0, Lgf;->a:Lgf$b;

    iget v4, v4, Lgf$b;->l:I

    div-int/2addr v3, v4

    iget-object v4, p0, Lgf;->b:Landroid/graphics/drawable/Drawable;

    iget v5, p0, Lgf;->b:I

    mul-int v3, v3, v5

    div-int/lit16 v3, v3, 0xff

    invoke-virtual {v4, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_3

    :cond_4
    :goto_2
    iput-wide v7, p0, Lgf;->b:J

    :cond_5
    move v0, v3

    :goto_3
    if-eqz p1, :cond_6

    if-eqz v0, :cond_6

    iget-object p1, p0, Lgf;->a:Ljava/lang/Runnable;

    const-wide/16 v3, 0x10

    add-long/2addr v1, v3

    invoke-virtual {p0, p1, v1, v2}, Lgf;->scheduleSelf(Ljava/lang/Runnable;J)V

    :cond_6
    return-void
.end method

.method final a(I)Z
    .locals 8

    iget v0, p0, Lgf;->a:I

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    return v1

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget v0, v0, Lgf$b;->l:I

    const/4 v4, -0x1

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    if-lez v0, :cond_3

    iget-object v0, p0, Lgf;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_1
    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    iput-object v0, p0, Lgf;->b:Landroid/graphics/drawable/Drawable;

    iget v0, p0, Lgf;->a:I

    iput v0, p0, Lgf;->c:I

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget v0, v0, Lgf$b;->l:I

    int-to-long v0, v0

    add-long/2addr v0, v2

    iput-wide v0, p0, Lgf;->b:J

    goto :goto_0

    :cond_2
    iput-object v5, p0, Lgf;->b:Landroid/graphics/drawable/Drawable;

    iput v4, p0, Lgf;->c:I

    iput-wide v6, p0, Lgf;->b:J

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_4

    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_4
    :goto_0
    if-ltz p1, :cond_6

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget v0, v0, Lgf$b;->d:I

    if-ge p1, v0, :cond_6

    iget-object v0, p0, Lgf;->a:Lgf$b;

    invoke-virtual {v0, p1}, Lgf$b;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    iput p1, p0, Lgf;->a:I

    if-eqz v0, :cond_7

    iget-object p1, p0, Lgf;->a:Lgf$b;

    iget p1, p1, Lgf$b;->k:I

    if-lez p1, :cond_5

    iget-object p1, p0, Lgf;->a:Lgf$b;

    iget p1, p1, Lgf$b;->k:I

    int-to-long v4, p1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lgf;->a:J

    :cond_5
    invoke-direct {p0, v0}, Lgf;->a(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    :cond_6
    iput-object v5, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    iput v4, p0, Lgf;->a:I

    :cond_7
    :goto_1
    iget-wide v0, p0, Lgf;->a:J

    const/4 p1, 0x1

    cmp-long v2, v0, v6

    if-nez v2, :cond_8

    iget-wide v0, p0, Lgf;->b:J

    cmp-long v2, v0, v6

    if-eqz v2, :cond_a

    :cond_8
    iget-object v0, p0, Lgf;->a:Ljava/lang/Runnable;

    if-nez v0, :cond_9

    new-instance v0, Lgf$1;

    invoke-direct {v0, p0}, Lgf$1;-><init>(Lgf;)V

    iput-object v0, p0, Lgf;->a:Ljava/lang/Runnable;

    goto :goto_2

    :cond_9
    invoke-virtual {p0, v0}, Lgf;->unscheduleSelf(Ljava/lang/Runnable;)V

    :goto_2
    invoke-virtual {p0, p1}, Lgf;->a(Z)V

    :cond_a
    invoke-virtual {p0}, Lgf;->invalidateSelf()V

    return p1
.end method

.method public applyTheme(Landroid/content/res/Resources$Theme;)V
    .locals 6

    iget-object v0, p0, Lgf;->a:Lgf$b;

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Lgf$b;->c()V

    iget v1, v0, Lgf$b;->d:I

    iget-object v2, v0, Lgf$b;->a:[Landroid/graphics/drawable/Drawable;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v2, v3

    if-eqz v4, :cond_0

    aget-object v4, v2, v3

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->canApplyTheme()Z

    move-result v4

    if-eqz v4, :cond_0

    aget-object v4, v2, v3

    invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->applyTheme(Landroid/content/res/Resources$Theme;)V

    iget v4, v0, Lgf$b;->c:I

    aget-object v5, v2, v3

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v5

    or-int/2addr v4, v5

    iput v4, v0, Lgf$b;->c:I

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/content/res/Resources$Theme;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgf$b;->a(Landroid/content/res/Resources;)V

    :cond_2
    return-void
.end method

.method public canApplyTheme()Z
    .locals 1

    iget-object v0, p0, Lgf;->a:Lgf$b;

    invoke-virtual {v0}, Lgf$b;->canApplyTheme()Z

    move-result v0

    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    iget-object v0, p0, Lgf;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_1
    return-void
.end method

.method public getAlpha()I
    .locals 1

    iget v0, p0, Lgf;->b:I

    return v0
.end method

.method public getChangingConfigurations()I
    .locals 2

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v0

    iget-object v1, p0, Lgf;->a:Lgf$b;

    invoke-virtual {v1}, Lgf$b;->getChangingConfigurations()I

    move-result v1

    or-int/2addr v0, v1

    return v0
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 2

    iget-object v0, p0, Lgf;->a:Lgf$b;

    invoke-virtual {v0}, Lgf$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lgf;->a:Lgf$b;

    invoke-virtual {p0}, Lgf;->getChangingConfigurations()I

    move-result v1

    iput v1, v0, Lgf$b;->b:I

    iget-object v0, p0, Lgf;->a:Lgf$b;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getCurrent()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getHotspotBounds(Landroid/graphics/Rect;)V
    .locals 1

    iget-object v0, p0, Lgf;->a:Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    return-void

    :cond_0
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->getHotspotBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public getIntrinsicHeight()I
    .locals 2

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget-boolean v0, v0, Lgf$b;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget-boolean v1, v0, Lgf$b;->d:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lgf$b;->d()V

    :cond_0
    iget v0, v0, Lgf$b;->f:I

    return v0

    :cond_1
    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    return v0

    :cond_2
    const/4 v0, -0x1

    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 2

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget-boolean v0, v0, Lgf$b;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget-boolean v1, v0, Lgf$b;->d:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lgf$b;->d()V

    :cond_0
    iget v0, v0, Lgf$b;->e:I

    return v0

    :cond_1
    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    return v0

    :cond_2
    const/4 v0, -0x1

    return v0
.end method

.method public getMinimumHeight()I
    .locals 2

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget-boolean v0, v0, Lgf$b;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget-boolean v1, v0, Lgf$b;->d:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lgf$b;->d()V

    :cond_0
    iget v0, v0, Lgf$b;->h:I

    return v0

    :cond_1
    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v0

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public getMinimumWidth()I
    .locals 2

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget-boolean v0, v0, Lgf$b;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget-boolean v1, v0, Lgf$b;->d:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lgf$b;->d()V

    :cond_0
    iget v0, v0, Lgf$b;->g:I

    return v0

    :cond_1
    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public getOpacity()I
    .locals 7

    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    const/4 v1, -0x2

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget-boolean v2, v0, Lgf$b;->e:Z

    if-eqz v2, :cond_1

    iget v0, v0, Lgf$b;->i:I

    return v0

    :cond_1
    invoke-virtual {v0}, Lgf$b;->c()V

    iget v2, v0, Lgf$b;->d:I

    iget-object v3, v0, Lgf$b;->a:[Landroid/graphics/drawable/Drawable;

    if-lez v2, :cond_2

    const/4 v1, 0x0

    aget-object v1, v3, v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v1

    :cond_2
    const/4 v4, 0x1

    move v5, v1

    const/4 v1, 0x1

    :goto_0
    if-ge v1, v2, :cond_3

    aget-object v6, v3, v1

    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v6

    invoke-static {v5, v6}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    iput v5, v0, Lgf$b;->i:I

    iput-boolean v4, v0, Lgf$b;->e:Z

    return v5

    :cond_4
    :goto_1
    return v1
.end method

.method public getOutline(Landroid/graphics/Outline;)V
    .locals 1

    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getOutline(Landroid/graphics/Outline;)V

    :cond_0
    return-void
.end method

.method public getPadding(Landroid/graphics/Rect;)Z
    .locals 10

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget-boolean v1, v0, Lgf$b;->a:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    iget-object v1, v0, Lgf$b;->a:Landroid/graphics/Rect;

    if-nez v1, :cond_8

    iget-boolean v1, v0, Lgf$b;->b:Z

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lgf$b;->c()V

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iget v5, v0, Lgf$b;->d:I

    iget-object v6, v0, Lgf$b;->a:[Landroid/graphics/drawable/Drawable;

    move-object v7, v2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v5, :cond_7

    aget-object v8, v6, v2

    invoke-virtual {v8, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    move-result v8

    if-eqz v8, :cond_6

    if-nez v7, :cond_2

    new-instance v7, Landroid/graphics/Rect;

    invoke-direct {v7, v4, v4, v4, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    :cond_2
    iget v8, v1, Landroid/graphics/Rect;->left:I

    iget v9, v7, Landroid/graphics/Rect;->left:I

    if-le v8, v9, :cond_3

    iget v8, v1, Landroid/graphics/Rect;->left:I

    iput v8, v7, Landroid/graphics/Rect;->left:I

    :cond_3
    iget v8, v1, Landroid/graphics/Rect;->top:I

    iget v9, v7, Landroid/graphics/Rect;->top:I

    if-le v8, v9, :cond_4

    iget v8, v1, Landroid/graphics/Rect;->top:I

    iput v8, v7, Landroid/graphics/Rect;->top:I

    :cond_4
    iget v8, v1, Landroid/graphics/Rect;->right:I

    iget v9, v7, Landroid/graphics/Rect;->right:I

    if-le v8, v9, :cond_5

    iget v8, v1, Landroid/graphics/Rect;->right:I

    iput v8, v7, Landroid/graphics/Rect;->right:I

    :cond_5
    iget v8, v1, Landroid/graphics/Rect;->bottom:I

    iget v9, v7, Landroid/graphics/Rect;->bottom:I

    if-le v8, v9, :cond_6

    iget v8, v1, Landroid/graphics/Rect;->bottom:I

    iput v8, v7, Landroid/graphics/Rect;->bottom:I

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_7
    iput-boolean v3, v0, Lgf$b;->b:Z

    iput-object v7, v0, Lgf$b;->a:Landroid/graphics/Rect;

    move-object v2, v7

    goto :goto_2

    :cond_8
    :goto_1
    iget-object v2, v0, Lgf$b;->a:Landroid/graphics/Rect;

    :goto_2
    if-eqz v2, :cond_a

    invoke-virtual {p1, v2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    iget v0, v2, Landroid/graphics/Rect;->left:I

    iget v1, v2, Landroid/graphics/Rect;->top:I

    or-int/2addr v0, v1

    iget v1, v2, Landroid/graphics/Rect;->bottom:I

    or-int/2addr v0, v1

    iget v1, v2, Landroid/graphics/Rect;->right:I

    or-int/2addr v0, v1

    if-eqz v0, :cond_9

    const/4 v0, 0x1

    goto :goto_3

    :cond_9
    const/4 v0, 0x0

    goto :goto_3

    :cond_a
    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_b

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    move-result v0

    goto :goto_3

    :cond_b
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    move-result v0

    :goto_3
    invoke-virtual {p0}, Lgf;->isAutoMirrored()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {p0}, Lgf;->getLayoutDirection()I

    move-result v1

    if-ne v1, v3, :cond_c

    goto :goto_4

    :cond_c
    const/4 v3, 0x0

    :goto_4
    if-eqz v3, :cond_d

    iget v1, p1, Landroid/graphics/Rect;->left:I

    iget v2, p1, Landroid/graphics/Rect;->right:I

    iput v2, p1, Landroid/graphics/Rect;->left:I

    iput v1, p1, Landroid/graphics/Rect;->right:I

    :cond_d
    return v0
.end method

.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lgf;->a:Lgf$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lgf$b;->b()V

    :cond_0
    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lgf;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lgf;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    invoke-interface {p1, p0}, Landroid/graphics/drawable/Drawable$Callback;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-void
.end method

.method public isAutoMirrored()Z
    .locals 1

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget-boolean v0, v0, Lgf$b;->l:Z

    return v0
.end method

.method public isStateful()Z
    .locals 7

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget-boolean v1, v0, Lgf$b;->f:Z

    if-eqz v1, :cond_0

    iget-boolean v0, v0, Lgf$b;->g:Z

    return v0

    :cond_0
    invoke-virtual {v0}, Lgf$b;->c()V

    iget v1, v0, Lgf$b;->d:I

    iget-object v2, v0, Lgf$b;->a:[Landroid/graphics/drawable/Drawable;

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x1

    if-ge v4, v1, :cond_2

    aget-object v6, v2, v4

    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    iput-boolean v3, v0, Lgf$b;->g:Z

    iput-boolean v5, v0, Lgf$b;->f:Z

    return v3
.end method

.method public jumpToCurrentState()V
    .locals 7

    iget-object v0, p0, Lgf;->b:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    const/4 v0, 0x0

    iput-object v0, p0, Lgf;->b:Landroid/graphics/drawable/Drawable;

    const/4 v0, -0x1

    iput v0, p0, Lgf;->c:I

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    iget-boolean v2, p0, Lgf;->a:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    iget v3, p0, Lgf;->b:I

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    :cond_1
    iget-wide v2, p0, Lgf;->b:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-eqz v6, :cond_2

    iput-wide v4, p0, Lgf;->b:J

    const/4 v0, 0x1

    :cond_2
    iget-wide v2, p0, Lgf;->a:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_3

    iput-wide v4, p0, Lgf;->a:J

    const/4 v0, 0x1

    :cond_3
    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lgf;->invalidateSelf()V

    :cond_4
    return-void
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-boolean v0, p0, Lgf;->b:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-ne v0, p0, :cond_0

    invoke-virtual {p0}, Lgf;->a()Lgf$b;

    move-result-object v0

    invoke-virtual {v0}, Lgf$b;->a()V

    invoke-virtual {p0, v0}, Lgf;->a(Lgf$b;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lgf;->b:Z

    :cond_0
    return-object p0
.end method

.method protected onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    iget-object v0, p0, Lgf;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    :cond_0
    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    :cond_1
    return-void
.end method

.method public onLayoutDirectionChanged(I)Z
    .locals 9

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget v1, p0, Lgf;->a:I

    iget v2, v0, Lgf$b;->d:I

    iget-object v3, v0, Lgf$b;->a:[Landroid/graphics/drawable/Drawable;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v5, v2, :cond_2

    aget-object v7, v3, v5

    if-eqz v7, :cond_1

    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x17

    if-lt v7, v8, :cond_0

    aget-object v7, v3, v5

    invoke-virtual {v7, p1}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    move-result v7

    goto :goto_1

    :cond_0
    const/4 v7, 0x0

    :goto_1
    if-ne v5, v1, :cond_1

    move v6, v7

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    iput p1, v0, Lgf$b;->j:I

    return v6
.end method

.method protected onLevelChange(I)Z
    .locals 1

    iget-object v0, p0, Lgf;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method protected onStateChange([I)Z
    .locals 1

    iget-object v0, p0, Lgf;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 1

    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lgf;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lgf;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    invoke-interface {p1, p0, p2, p3, p4}, Landroid/graphics/drawable/Drawable$Callback;->scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V

    :cond_0
    return-void
.end method

.method public setAlpha(I)V
    .locals 6

    iget-boolean v0, p0, Lgf;->a:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lgf;->b:I

    if-eq v0, p1, :cond_2

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lgf;->a:Z

    iput p1, p0, Lgf;->b:I

    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    iget-wide v1, p0, Lgf;->a:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    return-void

    :cond_1
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lgf;->a(Z)V

    :cond_2
    return-void
.end method

.method public setAutoMirrored(Z)V
    .locals 1

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget-boolean v0, v0, Lgf$b;->l:Z

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iput-boolean p1, v0, Lgf$b;->l:Z

    iget-object p1, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_0

    iget-boolean v0, v0, Lgf$b;->l:Z

    invoke-static {p1, v0}, Lcx;->a(Landroid/graphics/drawable/Drawable;Z)V

    :cond_0
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 2

    iget-object v0, p0, Lgf;->a:Lgf$b;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lgf$b;->m:Z

    iget-object v0, v0, Lgf$b;->a:Landroid/graphics/ColorFilter;

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iput-object p1, v0, Lgf$b;->a:Landroid/graphics/ColorFilter;

    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_0
    return-void
.end method

.method public setDither(Z)V
    .locals 1

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iget-boolean v0, v0, Lgf$b;->j:Z

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iput-boolean p1, v0, Lgf$b;->j:Z

    iget-object p1, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_0

    iget-boolean v0, v0, Lgf$b;->j:Z

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setDither(Z)V

    :cond_0
    return-void
.end method

.method public setHotspot(FF)V
    .locals 1

    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-static {v0, p1, p2}, Lcx;->a(Landroid/graphics/drawable/Drawable;FF)V

    :cond_0
    return-void
.end method

.method public setHotspotBounds(IIII)V
    .locals 1

    iget-object v0, p0, Lgf;->a:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lgf;->a:Landroid/graphics/Rect;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    :goto_0
    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    invoke-static {v0, p1, p2, p3, p4}, Lcx;->a(Landroid/graphics/drawable/Drawable;IIII)V

    :cond_1
    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    iget-object v0, p0, Lgf;->a:Lgf$b;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lgf$b;->n:Z

    iget-object v0, v0, Lgf$b;->a:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iput-object p1, v0, Lgf$b;->a:Landroid/content/res/ColorStateList;

    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, p1}, Lcx;->a(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    iget-object v0, p0, Lgf;->a:Lgf$b;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lgf$b;->o:Z

    iget-object v0, v0, Lgf$b;->a:Landroid/graphics/PorterDuff$Mode;

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lgf;->a:Lgf$b;

    iput-object p1, v0, Lgf$b;->a:Landroid/graphics/PorterDuff$Mode;

    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, p1}, Lcx;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setVisible(ZZ)Z
    .locals 2

    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result v0

    iget-object v1, p0, Lgf;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_0
    iget-object v1, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_1
    return v0
.end method

.method public unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lgf;->a:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lgf;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lgf;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    invoke-interface {p1, p0, p2}, Landroid/graphics/drawable/Drawable$Callback;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
