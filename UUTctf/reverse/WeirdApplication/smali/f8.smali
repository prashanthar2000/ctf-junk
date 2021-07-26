.class public Lf8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Li8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li8<",
            "Le8;",
            ">;"
        }
    .end annotation
.end field

.field public b:Li8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li8<",
            "Lk8;",
            ">;"
        }
    .end annotation
.end field

.field public c:[Lk8;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Li8;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Li8;-><init>(I)V

    iput-object v0, p0, Lf8;->a:Li8;

    new-instance v0, Li8;

    invoke-direct {v0, v1}, Li8;-><init>(I)V

    iput-object v0, p0, Lf8;->b:Li8;

    const/16 v0, 0x20

    new-array v0, v0, [Lk8;

    iput-object v0, p0, Lf8;->c:[Lk8;

    return-void
.end method
