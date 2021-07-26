.class public Lrc;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnTouchListener;


# static fields
.field public static final s:I


# instance fields
.field public final b:Loc;

.field public final c:Landroid/view/animation/Interpolator;

.field public final d:Landroid/view/View;

.field public e:Ljava/lang/Runnable;

.field public f:[F

.field public g:[F

.field public h:I

.field public i:I

.field public j:[F

.field public k:[F

.field public l:[F

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public final r:Landroid/widget/ListView;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v0

    sput v0, Lrc;->s:I

    return-void
.end method

.method public constructor <init>(Landroid/widget/ListView;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Loc;

    invoke-direct {v0}, Loc;-><init>()V

    iput-object v0, p0, Lrc;->b:Loc;

    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    iput-object v0, p0, Lrc;->c:Landroid/view/animation/Interpolator;

    const/4 v0, 0x2

    new-array v1, v0, [F

    fill-array-data v1, :array_0

    iput-object v1, p0, Lrc;->f:[F

    new-array v1, v0, [F

    fill-array-data v1, :array_1

    iput-object v1, p0, Lrc;->g:[F

    new-array v1, v0, [F

    fill-array-data v1, :array_2

    iput-object v1, p0, Lrc;->j:[F

    new-array v1, v0, [F

    fill-array-data v1, :array_3

    iput-object v1, p0, Lrc;->k:[F

    new-array v0, v0, [F

    fill-array-data v0, :array_4

    iput-object v0, p0, Lrc;->l:[F

    iput-object p1, p0, Lrc;->d:Landroid/view/View;

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const v1, 0x44c4e000    # 1575.0f

    mul-float v1, v1, v0

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v1, v2

    float-to-int v1, v1

    const v3, 0x439d8000    # 315.0f

    mul-float v0, v0, v3

    add-float/2addr v0, v2

    float-to-int v0, v0

    int-to-float v1, v1

    .line 2
    iget-object v2, p0, Lrc;->l:[F

    const/high16 v3, 0x447a0000    # 1000.0f

    div-float/2addr v1, v3

    const/4 v4, 0x0

    aput v1, v2, v4

    const/4 v5, 0x1

    aput v1, v2, v5

    int-to-float v0, v0

    .line 3
    iget-object v1, p0, Lrc;->k:[F

    div-float/2addr v0, v3

    aput v0, v1, v4

    aput v0, v1, v5

    .line 4
    iput v5, p0, Lrc;->h:I

    .line 5
    iget-object v0, p0, Lrc;->g:[F

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    aput v1, v0, v4

    aput v1, v0, v5

    .line 6
    iget-object v0, p0, Lrc;->f:[F

    const v1, 0x3e4ccccd    # 0.2f

    aput v1, v0, v4

    aput v1, v0, v5

    .line 7
    iget-object v0, p0, Lrc;->j:[F

    const v1, 0x3a83126f    # 0.001f

    aput v1, v0, v4

    aput v1, v0, v5

    .line 8
    sget v0, Lrc;->s:I

    .line 9
    iput v0, p0, Lrc;->i:I

    .line 10
    iget-object v0, p0, Lrc;->b:Loc;

    const/16 v1, 0x1f4

    .line 11
    iput v1, v0, Loc;->a:I

    .line 12
    iput v1, v0, Loc;->b:I

    .line 13
    iput-object p1, p0, Lrc;->r:Landroid/widget/ListView;

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x7f7fffff    # Float.MAX_VALUE
        0x7f7fffff    # Float.MAX_VALUE
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x0
    .end array-data

    :array_3
    .array-data 4
        0x0
        0x0
    .end array-data

    :array_4
    .array-data 4
        0x7f7fffff    # Float.MAX_VALUE
        0x7f7fffff    # Float.MAX_VALUE
    .end array-data
.end method

.method public static b(FFF)F
    .locals 1

    cmpl-float v0, p0, p2

    if-lez v0, :cond_0

    return p2

    :cond_0
    cmpg-float p2, p0, p1

    if-gez p2, :cond_1

    return p1

    :cond_1
    return p0
.end method

.method public static c(III)I
    .locals 0

    if-le p0, p2, :cond_0

    return p2

    :cond_0
    if-ge p0, p1, :cond_1

    return p1

    :cond_1
    return p0
.end method


# virtual methods
.method public final a(IFFF)F
    .locals 3

    .line 1
    iget-object v0, p0, Lrc;->f:[F

    aget v0, v0, p1

    iget-object v1, p0, Lrc;->g:[F

    aget v1, v1, p1

    invoke-virtual {p0, v0, p3, v1, p2}, Lrc;->e(FFFF)F

    move-result p2

    const/4 p3, 0x0

    cmpl-float v0, p2, p3

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lrc;->j:[F

    aget v0, v0, p1

    iget-object v1, p0, Lrc;->k:[F

    aget v1, v1, p1

    iget-object v2, p0, Lrc;->l:[F

    aget p1, v2, p1

    mul-float v0, v0, p4

    cmpl-float p3, p2, p3

    if-lez p3, :cond_1

    mul-float p2, p2, v0

    invoke-static {p2, v1, p1}, Lrc;->b(FFF)F

    move-result p3

    goto :goto_0

    :cond_1
    neg-float p2, p2

    mul-float p2, p2, v0

    invoke-static {p2, v1, p1}, Lrc;->b(FFF)F

    move-result p1

    neg-float p3, p1

    :goto_0
    return p3
.end method

.method public final d(FF)F
    .locals 4

    const/4 v0, 0x0

    cmpl-float v1, p2, v0

    if-nez v1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iget v1, p0, Lrc;->h:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    cmpg-float v1, p1, v0

    if-gez v1, :cond_4

    neg-float p2, p2

    div-float v0, p1, p2

    goto :goto_0

    :cond_2
    cmpg-float v1, p1, p2

    if-gez v1, :cond_4

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v3, p1, v0

    if-ltz v3, :cond_3

    div-float/2addr p1, p2

    sub-float v0, v1, p1

    goto :goto_0

    :cond_3
    iget-boolean p1, p0, Lrc;->p:Z

    if-eqz p1, :cond_4

    iget p1, p0, Lrc;->h:I

    if-ne p1, v2, :cond_4

    const/high16 v0, 0x3f800000    # 1.0f

    :cond_4
    :goto_0
    return v0
.end method

.method public final e(FFFF)F
    .locals 1

    mul-float p1, p1, p2

    const/4 v0, 0x0

    .line 1
    invoke-static {p1, v0, p3}, Lrc;->b(FFF)F

    move-result p1

    invoke-virtual {p0, p4, p1}, Lrc;->d(FF)F

    move-result p3

    sub-float/2addr p2, p4

    invoke-virtual {p0, p2, p1}, Lrc;->d(FF)F

    move-result p1

    sub-float/2addr p1, p3

    cmpg-float p2, p1, v0

    if-gez p2, :cond_0

    iget-object p2, p0, Lrc;->c:Landroid/view/animation/Interpolator;

    neg-float p1, p1

    invoke-interface {p2, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result p1

    neg-float p1, p1

    goto :goto_0

    :cond_0
    cmpl-float p2, p1, v0

    if-lez p2, :cond_1

    iget-object p2, p0, Lrc;->c:Landroid/view/animation/Interpolator;

    invoke-interface {p2, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result p1

    :goto_0
    const/high16 p2, -0x40800000    # -1.0f

    const/high16 p3, 0x3f800000    # 1.0f

    invoke-static {p1, p2, p3}, Lrc;->b(FFF)F

    move-result v0

    :cond_1
    return v0
.end method

.method public final f()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lrc;->n:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lrc;->p:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lrc;->b:Loc;

    if-eqz v0, :cond_1

    .line 2
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v2

    iget-wide v4, v0, Loc;->e:J

    sub-long v4, v2, v4

    long-to-int v5, v4

    iget v4, v0, Loc;->b:I

    invoke-static {v5, v1, v4}, Lrc;->c(III)I

    move-result v1

    iput v1, v0, Loc;->k:I

    invoke-virtual {v0, v2, v3}, Loc;->a(J)F

    move-result v1

    iput v1, v0, Loc;->j:F

    iput-wide v2, v0, Loc;->i:J

    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x0

    throw v0
.end method

.method public g()Z
    .locals 8

    .line 1
    iget-object v0, p0, Lrc;->b:Loc;

    .line 2
    iget v1, v0, Loc;->d:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    div-float/2addr v1, v2

    float-to-int v1, v1

    .line 3
    iget v0, v0, Loc;->c:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    const/4 v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 4
    iget-object v3, p0, Lrc;->r:Landroid/widget/ListView;

    invoke-virtual {v3}, Landroid/widget/ListView;->getCount()I

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Landroid/widget/ListView;->getChildCount()I

    move-result v5

    invoke-virtual {v3}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v6

    add-int v7, v6, v5

    if-lez v1, :cond_1

    if-lt v7, v4, :cond_2

    sub-int/2addr v5, v0

    invoke-virtual {v3, v5}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    invoke-virtual {v3}, Landroid/widget/ListView;->getHeight()I

    move-result v3

    if-gt v1, v3, :cond_2

    goto :goto_0

    :cond_1
    if-gez v1, :cond_3

    if-gtz v6, :cond_2

    invoke-virtual {v3, v2}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    if-ltz v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_5

    :cond_4
    const/4 v0, 0x0

    :cond_5
    return v0
.end method

.method public final h()V
    .locals 6

    .line 1
    iget-object v0, p0, Lrc;->e:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    new-instance v0, Lpc;

    invoke-direct {v0, p0}, Lpc;-><init>(Lrc;)V

    iput-object v0, p0, Lrc;->e:Ljava/lang/Runnable;

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lrc;->p:Z

    iput-boolean v0, p0, Lrc;->n:Z

    iget-boolean v1, p0, Lrc;->m:Z

    if-nez v1, :cond_1

    iget v1, p0, Lrc;->i:I

    if-lez v1, :cond_1

    iget-object v2, p0, Lrc;->d:Landroid/view/View;

    iget-object v3, p0, Lrc;->e:Ljava/lang/Runnable;

    int-to-long v4, v1

    invoke-static {v2, v3, v4, v5}, Lbc;->o(Landroid/view/View;Ljava/lang/Runnable;J)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lrc;->e:Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    :goto_0
    iput-boolean v0, p0, Lrc;->m:Z

    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lrc;->q:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v2, :cond_1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_3

    const/4 p1, 0x3

    if-eq v0, p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lrc;->f()V

    goto :goto_0

    :cond_2
    iput-boolean v2, p0, Lrc;->o:Z

    iput-boolean v1, p0, Lrc;->m:Z

    :cond_3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    iget-object v4, p0, Lrc;->d:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {p0, v1, v0, v3, v4}, Lrc;->a(IFFF)F

    move-result v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    iget-object v3, p0, Lrc;->d:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p0, v2, p2, p1, v3}, Lrc;->a(IFFF)F

    move-result p1

    iget-object p2, p0, Lrc;->b:Loc;

    .line 2
    iput v0, p2, Loc;->c:F

    iput p1, p2, Loc;->d:F

    .line 3
    iget-boolean p1, p0, Lrc;->p:Z

    if-nez p1, :cond_4

    invoke-virtual {p0}, Lrc;->g()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lrc;->h()V

    :cond_4
    :goto_0
    return v1
.end method
