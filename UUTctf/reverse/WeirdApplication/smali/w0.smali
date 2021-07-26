.class public final Lw0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:Landroid/view/ViewGroup;

.field public f:Landroid/view/View;

.field public g:Landroid/view/View;

.field public h:Lz2;

.field public i:Lx2;

.field public j:Landroid/content/Context;

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lw0;->a:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lw0;->o:Z

    return-void
.end method


# virtual methods
.method public a(Lz2;)V
    .locals 2

    iget-object v0, p0, Lw0;->h:Lz2;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lw0;->i:Lx2;

    invoke-virtual {v0, v1}, Lz2;->u(Lm3;)V

    :cond_1
    iput-object p1, p0, Lw0;->h:Lz2;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lw0;->i:Lx2;

    if-eqz v0, :cond_2

    .line 1
    iget-object v1, p1, Lz2;->a:Landroid/content/Context;

    invoke-virtual {p1, v0, v1}, Lz2;->b(Lm3;Landroid/content/Context;)V

    :cond_2
    return-void
.end method
