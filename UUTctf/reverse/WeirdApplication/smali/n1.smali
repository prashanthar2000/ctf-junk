.class public Ln1;
.super Ls1;
.source ""


# instance fields
.field public final a:Landroid/graphics/drawable/Animatable;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Animatable;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ls1;-><init>(Lm1;)V

    iput-object p1, p0, Ln1;->a:Landroid/graphics/drawable/Animatable;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 1

    iget-object v0, p0, Ln1;->a:Landroid/graphics/drawable/Animatable;

    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->start()V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Ln1;->a:Landroid/graphics/drawable/Animatable;

    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->stop()V

    return-void
.end method
