.class public Ldc;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# instance fields
.field public final synthetic a:Lhc;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public constructor <init>(Lgc;Lhc;Landroid/view/View;)V
    .locals 0

    iput-object p2, p0, Ldc;->a:Lhc;

    iput-object p3, p0, Ldc;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Ldc;->a:Lhc;

    iget-object v0, p0, Ldc;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lhc;->c(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Ldc;->a:Lhc;

    iget-object v0, p0, Ldc;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lhc;->a(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Ldc;->a:Lhc;

    iget-object v0, p0, Ldc;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lhc;->b(Landroid/view/View;)V

    return-void
.end method
