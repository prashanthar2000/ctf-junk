.class public Lg8;
.super Le8;
.source ""


# direct methods
.method public constructor <init>(Lf8;)V
    .locals 0

    invoke-direct {p0, p1}, Le8;-><init>(Lf8;)V

    return-void
.end method


# virtual methods
.method public b(Lk8;)V
    .locals 1

    invoke-super {p0, p1}, Le8;->b(Lk8;)V

    iget v0, p1, Lk8;->j:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p1, Lk8;->j:I

    return-void
.end method
