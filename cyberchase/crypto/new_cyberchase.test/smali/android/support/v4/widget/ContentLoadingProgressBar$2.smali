.class final Landroid/support/v4/widget/ContentLoadingProgressBar$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/widget/ContentLoadingProgressBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v4/widget/ContentLoadingProgressBar;


# direct methods
.method constructor <init>(Landroid/support/v4/widget/ContentLoadingProgressBar;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v4/widget/ContentLoadingProgressBar$2;->a:Landroid/support/v4/widget/ContentLoadingProgressBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar$2;->a:Landroid/support/v4/widget/ContentLoadingProgressBar;

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroid/support/v4/widget/ContentLoadingProgressBar;->b:Z

    iget-boolean v0, v0, Landroid/support/v4/widget/ContentLoadingProgressBar;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar$2;->a:Landroid/support/v4/widget/ContentLoadingProgressBar;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Landroid/support/v4/widget/ContentLoadingProgressBar;->a:J

    iget-object v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar$2;->a:Landroid/support/v4/widget/ContentLoadingProgressBar;

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/ContentLoadingProgressBar;->setVisibility(I)V

    :cond_0
    return-void
.end method
