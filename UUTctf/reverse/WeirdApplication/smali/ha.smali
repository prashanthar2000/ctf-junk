.class public Lha;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lia;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lia<",
        "Lu9;",
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

    check-cast p1, Lu9;

    .line 1
    iget p1, p1, Lu9;->b:I

    return p1
.end method

.method public b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lu9;

    .line 1
    iget-boolean p1, p1, Lu9;->c:Z

    return p1
.end method
