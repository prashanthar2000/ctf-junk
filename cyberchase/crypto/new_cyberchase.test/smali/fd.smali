.class public final Lfd;
.super Landroid/graphics/drawable/Drawable;

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfd$a;
    }
.end annotation


# static fields
.field private static final a:Landroid/view/animation/Interpolator;

.field private static final a:[I

.field private static final b:Landroid/view/animation/Interpolator;


# instance fields
.field a:F

.field private a:Landroid/animation/Animator;

.field private a:Landroid/content/res/Resources;

.field public final a:Lfd$a;

.field a:Z

.field private b:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    sput-object v0, Lfd;->a:Landroid/view/animation/Interpolator;

    new-instance v0, Lex;

    invoke-direct {v0}, Lex;-><init>()V

    sput-object v0, Lfd;->b:Landroid/view/animation/Interpolator;

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const/high16 v2, -0x1000000

    aput v2, v0, v1

    sput-object v0, Lfd;->a:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    invoke-static {p1}, Ldt;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iput-object p1, p0, Lfd;->a:Landroid/content/res/Resources;

    new-instance p1, Lfd$a;

    invoke-direct {p1}, Lfd$a;-><init>()V

    iput-object p1, p0, Lfd;->a:Lfd$a;

    iget-object p1, p0, Lfd;->a:Lfd$a;

    sget-object v0, Lfd;->a:[I

    invoke-virtual {p1, v0}, Lfd$a;->a([I)V

    iget-object p1, p0, Lfd;->a:Lfd$a;

    const/high16 v0, 0x40200000    # 2.5f

    invoke-virtual {p1, v0}, Lfd$a;->a(F)V

    invoke-virtual {p0}, Lfd;->invalidateSelf()V

    iget-object p1, p0, Lfd;->a:Lfd$a;

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    new-instance v1, Lfd$1;

    invoke-direct {v1, p0, p1}, Lfd$1;-><init>(Lfd;Lfd$a;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    sget-object v1, Lfd;->a:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v1, Lfd$2;

    invoke-direct {v1, p0, p1}, Lfd$2;-><init>(Lfd;Lfd$a;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iput-object v0, p0, Lfd;->a:Landroid/animation/Animator;

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private a(FFFF)V
    .locals 2

    iget-object v0, p0, Lfd;->a:Lfd$a;

    iget-object v1, p0, Lfd;->a:Landroid/content/res/Resources;

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float p2, p2, v1

    invoke-virtual {v0, p2}, Lfd$a;->a(F)V

    mul-float p1, p1, v1

    iput p1, v0, Lfd$a;->i:F

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lfd$a;->a(I)V

    mul-float p3, p3, v1

    mul-float p4, p4, v1

    float-to-int p1, p3

    iput p1, v0, Lfd$a;->b:I

    float-to-int p1, p4

    iput p1, v0, Lfd$a;->c:I

    return-void
.end method

.method static a(FLfd$a;)V
    .locals 8

    const/high16 v0, 0x3f400000    # 0.75f

    cmpl-float v1, p0, v0

    if-lez v1, :cond_0

    sub-float/2addr p0, v0

    const/high16 v0, 0x3e800000    # 0.25f

    div-float/2addr p0, v0

    invoke-virtual {p1}, Lfd$a;->b()I

    move-result v0

    iget-object v1, p1, Lfd$a;->a:[I

    invoke-virtual {p1}, Lfd$a;->a()I

    move-result v2

    aget v1, v1, v2

    shr-int/lit8 v2, v0, 0x18

    and-int/lit16 v2, v2, 0xff

    shr-int/lit8 v3, v0, 0x10

    and-int/lit16 v3, v3, 0xff

    shr-int/lit8 v4, v0, 0x8

    and-int/lit16 v4, v4, 0xff

    and-int/lit16 v0, v0, 0xff

    shr-int/lit8 v5, v1, 0x18

    and-int/lit16 v5, v5, 0xff

    shr-int/lit8 v6, v1, 0x10

    and-int/lit16 v6, v6, 0xff

    shr-int/lit8 v7, v1, 0x8

    and-int/lit16 v7, v7, 0xff

    and-int/lit16 v1, v1, 0xff

    sub-int/2addr v5, v2

    int-to-float v5, v5

    mul-float v5, v5, p0

    float-to-int v5, v5

    add-int/2addr v2, v5

    shl-int/lit8 v2, v2, 0x18

    sub-int/2addr v6, v3

    int-to-float v5, v6

    mul-float v5, v5, p0

    float-to-int v5, v5

    add-int/2addr v3, v5

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v2, v3

    sub-int/2addr v7, v4

    int-to-float v3, v7

    mul-float v3, v3, p0

    float-to-int v3, v3

    add-int/2addr v4, v3

    shl-int/lit8 v3, v4, 0x8

    or-int/2addr v2, v3

    sub-int/2addr v1, v0

    int-to-float v1, v1

    mul-float p0, p0, v1

    float-to-int p0, p0

    add-int/2addr v0, p0

    or-int p0, v2, v0

    :goto_0
    iput p0, p1, Lfd$a;->e:I

    return-void

    :cond_0
    invoke-virtual {p1}, Lfd$a;->b()I

    move-result p0

    goto :goto_0
.end method


# virtual methods
.method public final a(F)V
    .locals 2

    iget-object v0, p0, Lfd;->a:Lfd$a;

    iget v1, v0, Lfd$a;->h:F

    cmpl-float v1, p1, v1

    if-eqz v1, :cond_0

    iput p1, v0, Lfd$a;->h:F

    :cond_0
    invoke-virtual {p0}, Lfd;->invalidateSelf()V

    return-void
.end method

.method final a(FLfd$a;Z)V
    .locals 7

    iget-boolean v0, p0, Lfd;->a:Z

    const v1, 0x3c23d70a    # 0.01f

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Lfd;->a(FLfd$a;)V

    iget p3, p2, Lfd$a;->g:F

    const v0, 0x3f4ccccd    # 0.8f

    div-float/2addr p3, v0

    float-to-double v2, p3

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    add-double/2addr v2, v4

    double-to-float p3, v2

    iget v0, p2, Lfd$a;->e:F

    iget v2, p2, Lfd$a;->f:F

    sub-float/2addr v2, v1

    iget v1, p2, Lfd$a;->e:F

    sub-float/2addr v2, v1

    mul-float v2, v2, p1

    add-float/2addr v0, v2

    iput v0, p2, Lfd$a;->a:F

    iget v0, p2, Lfd$a;->f:F

    iput v0, p2, Lfd$a;->b:F

    iget v0, p2, Lfd$a;->g:F

    iget v1, p2, Lfd$a;->g:F

    sub-float/2addr p3, v1

    mul-float p3, p3, p1

    add-float/2addr v0, p3

    iput v0, p2, Lfd$a;->c:F

    return-void

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v2, p1, v0

    if-nez v2, :cond_1

    if-eqz p3, :cond_3

    :cond_1
    iget p3, p2, Lfd$a;->g:F

    const v2, 0x3f4a3d71    # 0.79f

    const/high16 v3, 0x3f000000    # 0.5f

    cmpg-float v4, p1, v3

    if-gez v4, :cond_2

    div-float v0, p1, v3

    iget v3, p2, Lfd$a;->e:F

    sget-object v4, Lfd;->b:Landroid/view/animation/Interpolator;

    invoke-interface {v4, v0}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v0

    mul-float v0, v0, v2

    add-float/2addr v0, v1

    add-float/2addr v0, v3

    move v6, v3

    move v3, v0

    move v0, v6

    goto :goto_0

    :cond_2
    sub-float v4, p1, v3

    div-float/2addr v4, v3

    iget v3, p2, Lfd$a;->e:F

    add-float/2addr v3, v2

    sget-object v5, Lfd;->b:Landroid/view/animation/Interpolator;

    invoke-interface {v5, v4}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v4

    sub-float/2addr v0, v4

    mul-float v0, v0, v2

    add-float/2addr v0, v1

    sub-float v0, v3, v0

    :goto_0
    const v1, 0x3e570a3c    # 0.20999998f

    mul-float v1, v1, p1

    add-float/2addr p3, v1

    const/high16 v1, 0x43580000    # 216.0f

    iget v2, p0, Lfd;->a:F

    add-float/2addr p1, v2

    mul-float p1, p1, v1

    iput v0, p2, Lfd$a;->a:F

    iput v3, p2, Lfd$a;->b:F

    iput p3, p2, Lfd$a;->c:F

    iput p1, p0, Lfd;->b:F

    :cond_3
    return-void
.end method

.method public final a(I)V
    .locals 3

    if-nez p1, :cond_0

    const/high16 p1, 0x41300000    # 11.0f

    const/high16 v0, 0x40400000    # 3.0f

    const/high16 v1, 0x41400000    # 12.0f

    const/high16 v2, 0x40c00000    # 6.0f

    goto :goto_0

    :cond_0
    const/high16 p1, 0x40f00000    # 7.5f

    const/high16 v0, 0x40200000    # 2.5f

    const/high16 v1, 0x41200000    # 10.0f

    const/high16 v2, 0x40a00000    # 5.0f

    :goto_0
    invoke-direct {p0, p1, v0, v1, v2}, Lfd;->a(FFFF)V

    invoke-virtual {p0}, Lfd;->invalidateSelf()V

    return-void
.end method

.method public final a(Z)V
    .locals 1

    iget-object v0, p0, Lfd;->a:Lfd$a;

    invoke-virtual {v0, p1}, Lfd$a;->a(Z)V

    invoke-virtual {p0}, Lfd;->invalidateSelf()V

    return-void
.end method

.method public final b(F)V
    .locals 2

    iget-object v0, p0, Lfd;->a:Lfd$a;

    const/4 v1, 0x0

    iput v1, v0, Lfd$a;->a:F

    iput p1, v0, Lfd$a;->b:F

    invoke-virtual {p0}, Lfd;->invalidateSelf()V

    return-void
.end method

.method public final c(F)V
    .locals 1

    iget-object v0, p0, Lfd;->a:Lfd$a;

    iput p1, v0, Lfd$a;->c:F

    invoke-virtual {p0}, Lfd;->invalidateSelf()V

    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 12

    invoke-virtual {p0}, Lfd;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget v1, p0, Lfd;->b:F

    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterX()F

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterY()F

    move-result v3

    invoke-virtual {p1, v1, v2, v3}, Landroid/graphics/Canvas;->rotate(FFF)V

    iget-object v1, p0, Lfd;->a:Lfd$a;

    iget-object v8, v1, Lfd$a;->a:Landroid/graphics/RectF;

    iget v2, v1, Lfd$a;->i:F

    iget v3, v1, Lfd$a;->d:F

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v3, v9

    add-float/2addr v2, v3

    iget v3, v1, Lfd$a;->i:F

    const/4 v10, 0x0

    cmpg-float v3, v3, v10

    if-gtz v3, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v9

    iget v3, v1, Lfd$a;->b:I

    int-to-float v3, v3

    iget v4, v1, Lfd$a;->h:F

    mul-float v3, v3, v4

    div-float/2addr v3, v9

    iget v4, v1, Lfd$a;->d:F

    div-float/2addr v4, v9

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    sub-float/2addr v2, v3

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v3, v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v4, v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr v5, v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v0, v2

    invoke-virtual {v8, v3, v4, v5, v0}, Landroid/graphics/RectF;->set(FFFF)V

    iget v0, v1, Lfd$a;->a:F

    iget v2, v1, Lfd$a;->c:F

    add-float/2addr v0, v2

    const/high16 v2, 0x43b40000    # 360.0f

    mul-float v0, v0, v2

    iget v3, v1, Lfd$a;->b:F

    iget v4, v1, Lfd$a;->c:F

    add-float/2addr v3, v4

    mul-float v3, v3, v2

    sub-float v11, v3, v0

    iget-object v2, v1, Lfd$a;->a:Landroid/graphics/Paint;

    iget v3, v1, Lfd$a;->e:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, v1, Lfd$a;->a:Landroid/graphics/Paint;

    iget v3, v1, Lfd$a;->d:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget v2, v1, Lfd$a;->d:F

    div-float/2addr v2, v9

    invoke-virtual {v8, v2, v2}, Landroid/graphics/RectF;->inset(FF)V

    invoke-virtual {v8}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    invoke-virtual {v8}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    invoke-virtual {v8}, Landroid/graphics/RectF;->width()F

    move-result v5

    div-float/2addr v5, v9

    iget-object v6, v1, Lfd$a;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    neg-float v2, v2

    invoke-virtual {v8, v2, v2}, Landroid/graphics/RectF;->inset(FF)V

    const/4 v6, 0x0

    iget-object v7, v1, Lfd$a;->a:Landroid/graphics/Paint;

    move-object v2, p1

    move-object v3, v8

    move v4, v0

    move v5, v11

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-boolean v2, v1, Lfd$a;->a:Z

    if-eqz v2, :cond_2

    iget-object v2, v1, Lfd$a;->a:Landroid/graphics/Path;

    if-nez v2, :cond_1

    new-instance v2, Landroid/graphics/Path;

    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    iput-object v2, v1, Lfd$a;->a:Landroid/graphics/Path;

    iget-object v2, v1, Lfd$a;->a:Landroid/graphics/Path;

    sget-object v3, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    invoke-virtual {v2, v3}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    goto :goto_0

    :cond_1
    iget-object v2, v1, Lfd$a;->a:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    :goto_0
    invoke-virtual {v8}, Landroid/graphics/RectF;->width()F

    move-result v2

    invoke-virtual {v8}, Landroid/graphics/RectF;->height()F

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v2

    div-float/2addr v2, v9

    iget v3, v1, Lfd$a;->b:I

    int-to-float v3, v3

    iget v4, v1, Lfd$a;->h:F

    mul-float v3, v3, v4

    div-float/2addr v3, v9

    iget-object v4, v1, Lfd$a;->a:Landroid/graphics/Path;

    invoke-virtual {v4, v10, v10}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v4, v1, Lfd$a;->a:Landroid/graphics/Path;

    iget v5, v1, Lfd$a;->b:I

    int-to-float v5, v5

    iget v6, v1, Lfd$a;->h:F

    mul-float v5, v5, v6

    invoke-virtual {v4, v5, v10}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v4, v1, Lfd$a;->a:Landroid/graphics/Path;

    iget v5, v1, Lfd$a;->b:I

    int-to-float v5, v5

    iget v6, v1, Lfd$a;->h:F

    mul-float v5, v5, v6

    div-float/2addr v5, v9

    iget v6, v1, Lfd$a;->c:I

    int-to-float v6, v6

    iget v7, v1, Lfd$a;->h:F

    mul-float v6, v6, v7

    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v4, v1, Lfd$a;->a:Landroid/graphics/Path;

    invoke-virtual {v8}, Landroid/graphics/RectF;->centerX()F

    move-result v5

    add-float/2addr v2, v5

    sub-float/2addr v2, v3

    invoke-virtual {v8}, Landroid/graphics/RectF;->centerY()F

    move-result v3

    iget v5, v1, Lfd$a;->d:F

    div-float/2addr v5, v9

    add-float/2addr v3, v5

    invoke-virtual {v4, v2, v3}, Landroid/graphics/Path;->offset(FF)V

    iget-object v2, v1, Lfd$a;->a:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->close()V

    iget-object v2, v1, Lfd$a;->b:Landroid/graphics/Paint;

    iget v3, v1, Lfd$a;->e:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, v1, Lfd$a;->b:Landroid/graphics/Paint;

    iget v3, v1, Lfd$a;->d:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    add-float/2addr v0, v11

    invoke-virtual {v8}, Landroid/graphics/RectF;->centerX()F

    move-result v2

    invoke-virtual {v8}, Landroid/graphics/RectF;->centerY()F

    move-result v3

    invoke-virtual {p1, v0, v2, v3}, Landroid/graphics/Canvas;->rotate(FFF)V

    iget-object v0, v1, Lfd$a;->a:Landroid/graphics/Path;

    iget-object v1, v1, Lfd$a;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final getAlpha()I
    .locals 1

    iget-object v0, p0, Lfd;->a:Lfd$a;

    iget v0, v0, Lfd$a;->d:I

    return v0
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public final isRunning()Z
    .locals 1

    iget-object v0, p0, Lfd;->a:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    move-result v0

    return v0
.end method

.method public final setAlpha(I)V
    .locals 1

    iget-object v0, p0, Lfd;->a:Lfd$a;

    iput p1, v0, Lfd$a;->d:I

    invoke-virtual {p0}, Lfd;->invalidateSelf()V

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    iget-object v0, p0, Lfd;->a:Lfd$a;

    iget-object v0, v0, Lfd$a;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    invoke-virtual {p0}, Lfd;->invalidateSelf()V

    return-void
.end method

.method public final start()V
    .locals 3

    iget-object v0, p0, Lfd;->a:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    iget-object v0, p0, Lfd;->a:Lfd$a;

    invoke-virtual {v0}, Lfd$a;->a()V

    iget-object v0, p0, Lfd;->a:Lfd$a;

    iget v0, v0, Lfd$a;->b:F

    iget-object v1, p0, Lfd;->a:Lfd$a;

    iget v1, v1, Lfd$a;->a:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lfd;->a:Z

    iget-object v0, p0, Lfd;->a:Landroid/animation/Animator;

    const-wide/16 v1, 0x29a

    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    iget-object v0, p0, Lfd;->a:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    return-void

    :cond_0
    iget-object v0, p0, Lfd;->a:Lfd$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lfd$a;->a(I)V

    iget-object v0, p0, Lfd;->a:Lfd$a;

    invoke-virtual {v0}, Lfd$a;->b()V

    iget-object v0, p0, Lfd;->a:Landroid/animation/Animator;

    const-wide/16 v1, 0x534

    goto :goto_0
.end method

.method public final stop()V
    .locals 2

    iget-object v0, p0, Lfd;->a:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    const/4 v0, 0x0

    iput v0, p0, Lfd;->b:F

    iget-object v0, p0, Lfd;->a:Lfd$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lfd$a;->a(Z)V

    iget-object v0, p0, Lfd;->a:Lfd$a;

    invoke-virtual {v0, v1}, Lfd$a;->a(I)V

    iget-object v0, p0, Lfd;->a:Lfd$a;

    invoke-virtual {v0}, Lfd$a;->b()V

    invoke-virtual {p0}, Lfd;->invalidateSelf()V

    return-void
.end method
