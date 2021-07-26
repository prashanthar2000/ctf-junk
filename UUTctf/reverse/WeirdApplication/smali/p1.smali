.class public Lp1;
.super Ls1;
.source ""


# instance fields
.field public final a:Lof;


# direct methods
.method public constructor <init>(Lof;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ls1;-><init>(Lm1;)V

    iput-object p1, p0, Lp1;->a:Lof;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 1

    iget-object v0, p0, Lp1;->a:Lof;

    invoke-virtual {v0}, Lof;->start()V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lp1;->a:Lof;

    invoke-virtual {v0}, Lof;->stop()V

    return-void
.end method
