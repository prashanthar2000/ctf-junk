.class public abstract Lho;
.super Landroid/view/ViewGroup;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lho$a;
    }
.end annotation


# instance fields
.field protected a:I

.field protected final a:Landroid/content/Context;

.field protected a:Landroid/support/v7/widget/ActionMenuView;

.field protected a:Lep;

.field protected final a:Lho$a;

.field protected a:Lhq;

.field private a:Z

.field private b:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lho;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p2, Lho$a;

    invoke-direct {p2, p0}, Lho$a;-><init>(Lho;)V

    iput-object p2, p0, Lho;->a:Lho$a;

    new-instance p2, Landroid/util/TypedValue;

    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p3

    sget v0, Lgc$a;->actionBarPopupTheme:I

    const/4 v1, 0x1

    invoke-virtual {p3, v0, p2, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p3

    if-eqz p3, :cond_0

    iget p3, p2, Landroid/util/TypedValue;->resourceId:I

    if-eqz p3, :cond_0

    new-instance p3, Landroid/view/ContextThemeWrapper;

    iget p2, p2, Landroid/util/TypedValue;->resourceId:I

    invoke-direct {p3, p1, p2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object p3, p0, Lho;->a:Landroid/content/Context;

    return-void

    :cond_0
    iput-object p1, p0, Lho;->a:Landroid/content/Context;

    return-void
.end method

.method protected static a(IIZ)I
    .locals 0

    if-eqz p2, :cond_0

    sub-int/2addr p0, p1

    return p0

    :cond_0
    add-int/2addr p0, p1

    return p0
.end method

.method protected static a(Landroid/view/View;II)I
    .locals 1

    const/high16 v0, -0x80000000

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p0, v0, p2}, Landroid/view/View;->measure(II)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p0

    sub-int/2addr p1, p0

    const/4 p0, 0x0

    sub-int/2addr p1, p0

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method protected static a(Landroid/view/View;IIIZ)I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    sub-int/2addr p3, v1

    div-int/lit8 p3, p3, 0x2

    add-int/2addr p2, p3

    if-eqz p4, :cond_0

    sub-int p3, p1, v0

    add-int/2addr v1, p2

    invoke-virtual {p0, p3, p2, p1, v1}, Landroid/view/View;->layout(IIII)V

    goto :goto_0

    :cond_0
    add-int p3, p1, v0

    add-int/2addr v1, p2

    invoke-virtual {p0, p1, p2, p3, v1}, Landroid/view/View;->layout(IIII)V

    :goto_0
    if-eqz p4, :cond_1

    neg-int p0, v0

    return p0

    :cond_1
    return v0
.end method

.method static synthetic a(Lho;)V
    .locals 1

    const/4 v0, 0x0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method static synthetic a(Lho;I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public a(IJ)Lep;
    .locals 2

    iget-object v0, p0, Lho;->a:Lep;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lep;->a()V

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lho;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, Lho;->setAlpha(F)V

    :cond_1
    invoke-static {p0}, Lem;->a(Landroid/view/View;)Lep;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lep;->a(F)Lep;

    move-result-object v0

    :goto_0
    invoke-virtual {v0, p2, p3}, Lep;->a(J)Lep;

    iget-object p2, p0, Lho;->a:Lho$a;

    invoke-virtual {p2, v0, p1}, Lho$a;->a(Lep;I)Lho$a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lep;->a(Leq;)Lep;

    return-object v0

    :cond_2
    invoke-static {p0}, Lem;->a(Landroid/view/View;)Lep;

    move-result-object v1

    invoke-virtual {v1, v0}, Lep;->a(F)Lep;

    move-result-object v0

    goto :goto_0
.end method

.method public a()Z
    .locals 1

    iget-object v0, p0, Lho;->a:Lhq;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lhq;->b()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getAnimatedVisibility()I
    .locals 1

    iget-object v0, p0, Lho;->a:Lep;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lho;->a:Lho$a;

    iget v0, v0, Lho$a;->a:I

    return v0

    :cond_0
    invoke-virtual {p0}, Lho;->getVisibility()I

    move-result v0

    return v0
.end method

.method public getContentHeight()I
    .locals 1

    iget v0, p0, Lho;->a:I

    return v0
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Lho;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, Lgc$j;->ActionBar:[I

    sget v1, Lgc$a;->actionBarStyle:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v0, v1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    sget v0, Lgc$j;->ActionBar_height:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lho;->setContentHeight(I)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    iget-object p1, p0, Lho;->a:Lhq;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lhq;->a()V

    :cond_0
    return-void
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x9

    if-ne v0, v2, :cond_0

    iput-boolean v1, p0, Lho;->b:Z

    :cond_0
    iget-boolean v3, p0, Lho;->b:Z

    const/4 v4, 0x1

    if-nez v3, :cond_1

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-ne v0, v2, :cond_1

    if-nez p1, :cond_1

    iput-boolean v4, p0, Lho;->b:Z

    :cond_1
    const/16 p1, 0xa

    if-eq v0, p1, :cond_2

    const/4 p1, 0x3

    if-ne v0, p1, :cond_3

    :cond_2
    iput-boolean v1, p0, Lho;->b:Z

    :cond_3
    return v4
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-boolean v1, p0, Lho;->a:Z

    :cond_0
    iget-boolean v2, p0, Lho;->a:Z

    const/4 v3, 0x1

    if-nez v2, :cond_1

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-nez v0, :cond_1

    if-nez p1, :cond_1

    iput-boolean v3, p0, Lho;->a:Z

    :cond_1
    if-eq v0, v3, :cond_2

    const/4 p1, 0x3

    if-ne v0, p1, :cond_3

    :cond_2
    iput-boolean v1, p0, Lho;->a:Z

    :cond_3
    return v3
.end method

.method public setContentHeight(I)V
    .locals 0

    iput p1, p0, Lho;->a:I

    invoke-virtual {p0}, Lho;->requestLayout()V

    return-void
.end method

.method public setVisibility(I)V
    .locals 1

    invoke-virtual {p0}, Lho;->getVisibility()I

    move-result v0

    if-eq p1, v0, :cond_1

    iget-object v0, p0, Lho;->a:Lep;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lep;->a()V

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_1
    return-void
.end method
