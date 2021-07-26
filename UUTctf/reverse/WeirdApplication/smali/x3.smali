.class public Lx3;
.super Ll3;
.source ""


# instance fields
.field public final synthetic m:Le4;


# direct methods
.method public constructor <init>(Le4;Landroid/content/Context;Lt3;Landroid/view/View;)V
    .locals 7

    iput-object p1, p0, Lx3;->m:Le4;

    sget v5, Lf;->actionOverflowMenuStyle:I

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    .line 1
    invoke-direct/range {v0 .. v6}, Ll3;-><init>(Landroid/content/Context;Lz2;Landroid/view/View;ZII)V

    .line 2
    iget-object p2, p3, Lt3;->B:Lc3;

    .line 3
    invoke-virtual {p2}, Lc3;->g()Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p1, Le4;->j:Lb4;

    if-nez p2, :cond_0

    .line 4
    iget-object p2, p1, Le4;->i:Ln3;

    .line 5
    check-cast p2, Landroid/view/View;

    .line 6
    :cond_0
    iput-object p2, p0, Ll3;->f:Landroid/view/View;

    .line 7
    :cond_1
    iget-object p1, p1, Le4;->y:Ld4;

    invoke-virtual {p0, p1}, Ll3;->d(Lm3$a;)V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    iget-object v0, p0, Lx3;->m:Le4;

    const/4 v1, 0x0

    iput-object v1, v0, Le4;->v:Lx3;

    const/4 v1, 0x0

    iput v1, v0, Le4;->z:I

    invoke-super {p0}, Ll3;->c()V

    return-void
.end method
