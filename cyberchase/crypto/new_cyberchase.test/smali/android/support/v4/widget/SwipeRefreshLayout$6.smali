.class final Landroid/support/v4/widget/SwipeRefreshLayout$6;
.super Landroid/view/animation/Animation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/widget/SwipeRefreshLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v4/widget/SwipeRefreshLayout;


# direct methods
.method constructor <init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->a:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    iget-object p2, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->a:Landroid/support/v4/widget/SwipeRefreshLayout;

    iget-boolean p2, p2, Landroid/support/v4/widget/SwipeRefreshLayout;->d:Z

    if-nez p2, :cond_0

    iget-object p2, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->a:Landroid/support/v4/widget/SwipeRefreshLayout;

    iget p2, p2, Landroid/support/v4/widget/SwipeRefreshLayout;->d:I

    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->a:Landroid/support/v4/widget/SwipeRefreshLayout;

    iget v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->c:I

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    sub-int/2addr p2, v0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->a:Landroid/support/v4/widget/SwipeRefreshLayout;

    iget p2, p2, Landroid/support/v4/widget/SwipeRefreshLayout;->d:I

    :goto_0
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->a:Landroid/support/v4/widget/SwipeRefreshLayout;

    iget v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->b:I

    iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->a:Landroid/support/v4/widget/SwipeRefreshLayout;

    iget v1, v1, Landroid/support/v4/widget/SwipeRefreshLayout;->b:I

    sub-int/2addr p2, v1

    int-to-float p2, p2

    mul-float p2, p2, p1

    float-to-int p2, p2

    add-int/2addr v0, p2

    iget-object p2, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->a:Landroid/support/v4/widget/SwipeRefreshLayout;

    iget-object p2, p2, Landroid/support/v4/widget/SwipeRefreshLayout;->a:Lfc;

    invoke-virtual {p2}, Lfc;->getTop()I

    move-result p2

    sub-int/2addr v0, p2

    iget-object p2, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->a:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {p2, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V

    iget-object p2, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->a:Landroid/support/v4/widget/SwipeRefreshLayout;

    iget-object p2, p2, Landroid/support/v4/widget/SwipeRefreshLayout;->a:Lfd;

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p1

    invoke-virtual {p2, v0}, Lfd;->a(F)V

    return-void
.end method
