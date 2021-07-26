.class public Lu3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lhc;


# instance fields
.field public a:Z

.field public b:I

.field public final synthetic c:Lv3;


# direct methods
.method public constructor <init>(Lv3;)V
    .locals 0

    iput-object p1, p0, Lu3;->c:Lv3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lu3;->a:Z

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget-boolean p1, p0, Lu3;->a:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lu3;->c:Lv3;

    const/4 v0, 0x0

    iput-object v0, p1, Lv3;->g:Lgc;

    iget v0, p0, Lu3;->b:I

    invoke-static {p1, v0}, Lv3;->b(Lv3;I)V

    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lu3;->c:Lv3;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lv3;->a(Lv3;I)V

    iput-boolean v0, p0, Lu3;->a:Z

    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu3;->a:Z

    return-void
.end method
