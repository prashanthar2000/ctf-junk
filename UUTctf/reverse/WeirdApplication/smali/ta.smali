.class public final Lta;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Leb;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Leb<",
        "Lya;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lm5;

.field public final synthetic b:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lm5;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lta;->a:Lm5;

    iput-object p2, p0, Lta;->b:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lya;

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lta;->a:Lm5;

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    iget v0, p1, Lya;->b:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lta;->a:Lm5;

    iget-object p1, p1, Lya;->a:Landroid/graphics/Typeface;

    iget-object v1, p0, Lta;->b:Landroid/os/Handler;

    invoke-virtual {v0, p1, v1}, Lm5;->b(Landroid/graphics/Typeface;Landroid/os/Handler;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lta;->a:Lm5;

    :goto_0
    iget-object v1, p0, Lta;->b:Landroid/os/Handler;

    invoke-virtual {p1, v0, v1}, Lm5;->a(ILandroid/os/Handler;)V

    :goto_1
    return-void
.end method
