.class public Lpc;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lrc;


# direct methods
.method public constructor <init>(Lrc;)V
    .locals 0

    iput-object p1, p0, Lpc;->b:Lrc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 14

    iget-object v0, p0, Lpc;->b:Lrc;

    iget-boolean v1, v0, Lrc;->p:Z

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-boolean v1, v0, Lrc;->n:Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    iput-boolean v3, v0, Lrc;->n:Z

    iget-object v0, v0, Lrc;->b:Loc;

    if-eqz v0, :cond_1

    .line 1
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Loc;->e:J

    const-wide/16 v4, -0x1

    iput-wide v4, v0, Loc;->i:J

    iput-wide v1, v0, Loc;->f:J

    const/high16 v1, 0x3f000000    # 0.5f

    iput v1, v0, Loc;->j:F

    iput v3, v0, Loc;->g:I

    iput v3, v0, Loc;->h:I

    goto :goto_0

    :cond_1
    throw v2

    .line 2
    :cond_2
    :goto_0
    iget-object v0, p0, Lpc;->b:Lrc;

    iget-object v0, v0, Lrc;->b:Loc;

    .line 3
    iget-wide v1, v0, Loc;->i:J

    const-wide/16 v4, 0x0

    cmp-long v6, v1, v4

    if-lez v6, :cond_3

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v1

    iget-wide v6, v0, Loc;->i:J

    iget v8, v0, Loc;->k:I

    int-to-long v8, v8

    add-long/2addr v6, v8

    cmp-long v8, v1, v6

    if-lez v8, :cond_3

    const/4 v1, 0x1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_a

    .line 4
    iget-object v1, p0, Lpc;->b:Lrc;

    invoke-virtual {v1}, Lrc;->g()Z

    move-result v1

    if-nez v1, :cond_4

    goto/16 :goto_3

    :cond_4
    iget-object v1, p0, Lpc;->b:Lrc;

    iget-boolean v2, v1, Lrc;->o:Z

    if-eqz v2, :cond_5

    iput-boolean v3, v1, Lrc;->o:Z

    .line 5
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v8

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-wide v6, v8

    invoke-static/range {v6 .. v13}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v2

    iget-object v1, v1, Lrc;->d:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    .line 6
    :cond_5
    iget-wide v1, v0, Loc;->f:J

    cmp-long v6, v1, v4

    if-eqz v6, :cond_9

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Loc;->a(J)F

    move-result v4

    const/high16 v5, -0x3f800000    # -4.0f

    mul-float v5, v5, v4

    mul-float v5, v5, v4

    const/high16 v6, 0x40800000    # 4.0f

    mul-float v4, v4, v6

    add-float/2addr v4, v5

    iget-wide v5, v0, Loc;->f:J

    sub-long v5, v1, v5

    iput-wide v1, v0, Loc;->f:J

    long-to-float v1, v5

    mul-float v1, v1, v4

    iget v2, v0, Loc;->c:F

    mul-float v2, v2, v1

    float-to-int v2, v2

    iput v2, v0, Loc;->g:I

    iget v2, v0, Loc;->d:F

    mul-float v1, v1, v2

    float-to-int v1, v1

    iput v1, v0, Loc;->h:I

    .line 7
    iget-object v0, p0, Lpc;->b:Lrc;

    .line 8
    iget-object v0, v0, Lrc;->r:Landroid/widget/ListView;

    .line 9
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x13

    if-lt v2, v4, :cond_6

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->scrollListBy(I)V

    goto :goto_2

    :cond_6
    invoke-virtual {v0}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v2

    const/4 v4, -0x1

    if-ne v2, v4, :cond_7

    goto :goto_2

    :cond_7
    invoke-virtual {v0, v3}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_8

    goto :goto_2

    :cond_8
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-virtual {v0, v2, v3}, Landroid/widget/ListView;->setSelectionFromTop(II)V

    .line 10
    :goto_2
    iget-object v0, p0, Lpc;->b:Lrc;

    iget-object v0, v0, Lrc;->d:Landroid/view/View;

    invoke-static {v0, p0}, Lbc;->n(Landroid/view/View;Ljava/lang/Runnable;)V

    return-void

    .line 11
    :cond_9
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Cannot compute scroll delta before calling start()"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 12
    :cond_a
    :goto_3
    iget-object v0, p0, Lpc;->b:Lrc;

    iput-boolean v3, v0, Lrc;->p:Z

    return-void
.end method
