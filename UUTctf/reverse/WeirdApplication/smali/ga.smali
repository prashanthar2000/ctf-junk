.class public Lga;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lia;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lia<",
        "Lxa;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lja;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lxa;

    .line 1
    iget p1, p1, Lxa;->c:I

    return p1
.end method

.method public b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lxa;

    .line 1
    iget-boolean p1, p1, Lxa;->d:Z

    return p1
.end method
