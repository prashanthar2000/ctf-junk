.class public La4;
.super La6;
.source ""


# instance fields
.field public final synthetic k:Lb4;


# direct methods
.method public constructor <init>(Lb4;Landroid/view/View;Le4;)V
    .locals 0

    iput-object p1, p0, La4;->k:Lb4;

    invoke-direct {p0, p2}, La6;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public b()Lp3;
    .locals 1

    iget-object v0, p0, La4;->k:Lb4;

    iget-object v0, v0, Lb4;->d:Le4;

    iget-object v0, v0, Le4;->u:Lc4;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ll3;->a()Lj3;

    move-result-object v0

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, La4;->k:Lb4;

    iget-object v0, v0, Lb4;->d:Le4;

    invoke-virtual {v0}, Le4;->n()Z

    const/4 v0, 0x1

    return v0
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, La4;->k:Lb4;

    iget-object v0, v0, Lb4;->d:Le4;

    iget-object v1, v0, Le4;->w:Lz3;

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Le4;->i()Z

    const/4 v0, 0x1

    return v0
.end method
