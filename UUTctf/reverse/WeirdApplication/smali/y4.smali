.class public Ly4;
.super La6;
.source ""


# instance fields
.field public final synthetic k:Lf5;

.field public final synthetic l:Lj5;


# direct methods
.method public constructor <init>(Lj5;Landroid/view/View;Lf5;)V
    .locals 0

    iput-object p1, p0, Ly4;->l:Lj5;

    iput-object p3, p0, Ly4;->k:Lf5;

    invoke-direct {p0, p2}, La6;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public b()Lp3;
    .locals 1

    iget-object v0, p0, Ly4;->k:Lf5;

    return-object v0
.end method

.method public c()Z
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation

    iget-object v0, p0, Ly4;->l:Lj5;

    invoke-virtual {v0}, Lj5;->getInternalPopup()Li5;

    move-result-object v0

    invoke-interface {v0}, Li5;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ly4;->l:Lj5;

    invoke-virtual {v0}, Lj5;->b()V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
