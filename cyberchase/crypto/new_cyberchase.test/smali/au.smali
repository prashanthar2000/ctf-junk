.class public final Lau;
.super Lav;


# instance fields
.field a:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lav;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lau;->a:F

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    iget v0, p0, Lau;->b:I

    if-eqz v0, :cond_0

    iget v0, p0, Lau;->a:F

    int-to-float v1, p1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_2

    :cond_0
    int-to-float p1, p1

    iput p1, p0, Lau;->a:F

    iget p1, p0, Lau;->b:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lau;->c()V

    :cond_1
    invoke-virtual {p0}, Lau;->d()V

    :cond_2
    return-void
.end method

.method public final b()V
    .locals 1

    invoke-super {p0}, Lav;->b()V

    const/4 v0, 0x0

    iput v0, p0, Lau;->a:F

    return-void
.end method
