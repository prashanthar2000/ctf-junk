.class public final Lif;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljf;

.field public final b:Lgf;


# direct methods
.method public constructor <init>(Ljf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lif;->a:Ljf;

    new-instance p1, Lgf;

    invoke-direct {p1}, Lgf;-><init>()V

    iput-object p1, p0, Lif;->b:Lgf;

    return-void
.end method
