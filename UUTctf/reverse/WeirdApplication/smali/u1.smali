.class public Lu1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lx1;


# direct methods
.method public constructor <init>(Lx1;)V
    .locals 0

    iput-object p1, p0, Lu1;->b:Lx1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lu1;->b:Lx1;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lx1;->a(Z)V

    iget-object v0, p0, Lu1;->b:Lx1;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
