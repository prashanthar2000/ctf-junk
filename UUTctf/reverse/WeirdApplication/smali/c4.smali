.class public Lc4;
.super Ll3;
.source ""


# instance fields
.field public final synthetic m:Le4;


# direct methods
.method public constructor <init>(Le4;Landroid/content/Context;Lz2;Landroid/view/View;Z)V
    .locals 7

    iput-object p1, p0, Lc4;->m:Le4;

    sget v5, Lf;->actionOverflowMenuStyle:I

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move v4, p5

    .line 1
    invoke-direct/range {v0 .. v6}, Ll3;-><init>(Landroid/content/Context;Lz2;Landroid/view/View;ZII)V

    const p2, 0x800005

    .line 2
    iput p2, p0, Ll3;->g:I

    .line 3
    iget-object p1, p1, Le4;->y:Ld4;

    invoke-virtual {p0, p1}, Ll3;->d(Lm3$a;)V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    iget-object v0, p0, Lc4;->m:Le4;

    .line 1
    iget-object v0, v0, Le4;->d:Lz2;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Lz2;->c(Z)V

    .line 3
    :cond_0
    iget-object v0, p0, Lc4;->m:Le4;

    const/4 v1, 0x0

    iput-object v1, v0, Le4;->u:Lc4;

    invoke-super {p0}, Ll3;->c()V

    return-void
.end method
