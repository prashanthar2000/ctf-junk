.class public Ll5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Ln5;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Landroid/graphics/Typeface;


# direct methods
.method public constructor <init>(Lm5;Ljava/lang/ref/WeakReference;Landroid/graphics/Typeface;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Ln5;",
            ">;",
            "Landroid/graphics/Typeface;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll5;->b:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Ll5;->c:Landroid/graphics/Typeface;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Ll5;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln5;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Ll5;->c:Landroid/graphics/Typeface;

    .line 1
    iget-boolean v2, v0, Ln5;->m:Z

    if-eqz v2, :cond_1

    iget-object v2, v0, Ln5;->a:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iput-object v1, v0, Ln5;->l:Landroid/graphics/Typeface;

    :cond_1
    return-void
.end method
