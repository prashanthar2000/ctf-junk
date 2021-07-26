.class public Lec;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lh1;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public constructor <init>(Lgc;Lh1;Landroid/view/View;)V
    .locals 0

    iput-object p2, p0, Lec;->a:Lh1;

    iput-object p3, p0, Lec;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 0

    iget-object p1, p0, Lec;->a:Lh1;

    .line 1
    iget-object p1, p1, Lh1;->a:Lj1;

    iget-object p1, p1, Lj1;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
