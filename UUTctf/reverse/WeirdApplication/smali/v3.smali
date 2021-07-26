.class public abstract Lv3;
.super Landroid/view/ViewGroup;
.source ""


# instance fields
.field public final b:Lu3;

.field public final c:Landroid/content/Context;

.field public d:Landroidx/appcompat/widget/ActionMenuView;

.field public e:Le4;

.field public f:I

.field public g:Lgc;

.field public h:Z

.field public i:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p2, Lu3;

    invoke-direct {p2, p0}, Lu3;-><init>(Lv3;)V

    iput-object p2, p0, Lv3;->b:Lu3;

    new-instance p2, Landroid/util/TypedValue;

    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p3

    sget v0, Lf;->actionBarPopupTheme:I

    const/4 v1, 0x1

    invoke-virtual {p3, v0, p2, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p3

    if-eqz p3, :cond_0

    iget p3, p2, Landroid/util/TypedValue;->resourceId:I

    if-eqz p3, :cond_0

    new-instance p3, Landroid/view/ContextThemeWrapper;

    iget p2, p2, Landroid/util/TypedValue;->resourceId:I

    invoke-direct {p3, p1, p2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object p3, p0, Lv3;->c:Landroid/content/Context;

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lv3;->c:Landroid/content/Context;

    :goto_0
    return-void
.end method

.method public static synthetic a(Lv3;I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public static synthetic b(Lv3;I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public c(Landroid/view/View;III)I
    .locals 1

    const/high16 v0, -0x80000000

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p1, v0, p3}, Landroid/view/View;->measure(II)V

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    sub-int/2addr p2, p1

    sub-int/2addr p2, p4

    const/4 p1, 0x0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method

.method public d(Landroid/view/View;IIIZ)I
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    sub-int/2addr p4, v1

    div-int/lit8 p4, p4, 0x2

    add-int/2addr p4, p3

    if-eqz p5, :cond_0

    sub-int p3, p2, v0

    add-int/2addr v1, p4

    invoke-virtual {p1, p3, p4, p2, v1}, Landroid/view/View;->layout(IIII)V

    goto :goto_0

    :cond_0
    add-int p3, p2, v0

    add-int/2addr v1, p4

    invoke-virtual {p1, p2, p4, p3, v1}, Landroid/view/View;->layout(IIII)V

    :goto_0
    if-eqz p5, :cond_1

    neg-int v0, v0

    :cond_1
    return v0
.end method

.method public e(IJ)Lgc;
    .locals 2

    iget-object v0, p0, Lv3;->g:Lgc;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lgc;->b()V

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setAlpha(F)V

    :cond_1
    invoke-static {p0}, Lbc;->a(Landroid/view/View;)Lgc;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lgc;->a(F)Lgc;

    invoke-virtual {v0, p2, p3}, Lgc;->c(J)Lgc;

    iget-object p2, p0, Lv3;->b:Lu3;

    .line 1
    iget-object p3, p2, Lu3;->c:Lv3;

    iput-object v0, p3, Lv3;->g:Lgc;

    iput p1, p2, Lu3;->b:I

    .line 2
    invoke-virtual {v0, p2}, Lgc;->d(Lhc;)Lgc;

    return-object v0

    :cond_2
    invoke-static {p0}, Lbc;->a(Landroid/view/View;)Lgc;

    move-result-object v1

    invoke-virtual {v1, v0}, Lgc;->a(F)Lgc;

    invoke-virtual {v1, p2, p3}, Lgc;->c(J)Lgc;

    iget-object p2, p0, Lv3;->b:Lu3;

    .line 3
    iget-object p3, p2, Lu3;->c:Lv3;

    iput-object v1, p3, Lv3;->g:Lgc;

    iput p1, p2, Lu3;->b:I

    .line 4
    invoke-virtual {v1, p2}, Lgc;->d(Lhc;)Lgc;

    return-object v1
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, Lo;->ActionBar:[I

    sget v1, Lf;->actionBarStyle:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v0, v1, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    sget v0, Lo;->ActionBar_height:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lv3;->setContentHeight(I)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    iget-object p1, p0, Lv3;->e:Le4;

    if-eqz p1, :cond_7

    .line 1
    iget-object v0, p1, Le4;->c:Landroid/content/Context;

    .line 2
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v1, v0, Landroid/content/res/Configuration;->screenWidthDp:I

    iget v2, v0, Landroid/content/res/Configuration;->screenHeightDp:I

    iget v0, v0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    const/16 v3, 0x258

    if-gt v0, v3, :cond_6

    if-gt v1, v3, :cond_6

    const/16 v0, 0x2d0

    const/16 v3, 0x3c0

    if-le v1, v3, :cond_0

    if-gt v2, v0, :cond_6

    :cond_0
    if-le v1, v0, :cond_1

    if-le v2, v3, :cond_1

    goto :goto_1

    :cond_1
    const/16 v0, 0x1f4

    if-ge v1, v0, :cond_5

    const/16 v0, 0x1e0

    const/16 v3, 0x280

    if-le v1, v3, :cond_2

    if-gt v2, v0, :cond_5

    :cond_2
    if-le v1, v0, :cond_3

    if-le v2, v3, :cond_3

    goto :goto_0

    :cond_3
    const/16 v0, 0x168

    if-lt v1, v0, :cond_4

    const/4 v0, 0x3

    goto :goto_2

    :cond_4
    const/4 v0, 0x2

    goto :goto_2

    :cond_5
    :goto_0
    const/4 v0, 0x4

    goto :goto_2

    :cond_6
    :goto_1
    const/4 v0, 0x5

    .line 3
    :goto_2
    iput v0, p1, Le4;->q:I

    iget-object p1, p1, Le4;->d:Lz2;

    if-eqz p1, :cond_7

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lz2;->q(Z)V

    :cond_7
    return-void
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x9

    if-ne v0, v2, :cond_0

    iput-boolean v1, p0, Lv3;->i:Z

    :cond_0
    iget-boolean v3, p0, Lv3;->i:Z

    const/4 v4, 0x1

    if-nez v3, :cond_1

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-ne v0, v2, :cond_1

    if-nez p1, :cond_1

    iput-boolean v4, p0, Lv3;->i:Z

    :cond_1
    const/16 p1, 0xa

    if-eq v0, p1, :cond_2

    const/4 p1, 0x3

    if-ne v0, p1, :cond_3

    :cond_2
    iput-boolean v1, p0, Lv3;->i:Z

    :cond_3
    return v4
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-boolean v1, p0, Lv3;->h:Z

    :cond_0
    iget-boolean v2, p0, Lv3;->h:Z

    const/4 v3, 0x1

    if-nez v2, :cond_1

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-nez v0, :cond_1

    if-nez p1, :cond_1

    iput-boolean v3, p0, Lv3;->h:Z

    :cond_1
    if-eq v0, v3, :cond_2

    const/4 p1, 0x3

    if-ne v0, p1, :cond_3

    :cond_2
    iput-boolean v1, p0, Lv3;->h:Z

    :cond_3
    return v3
.end method

.method public abstract setContentHeight(I)V
.end method

.method public setVisibility(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    if-eq p1, v0, :cond_1

    iget-object v0, p0, Lv3;->g:Lgc;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lgc;->b()V

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_1
    return-void
.end method
