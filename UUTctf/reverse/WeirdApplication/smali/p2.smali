.class public abstract Lp2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lqa;",
            "Landroid/view/MenuItem;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Landroid/view/SubMenu;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp2;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final c(Landroid/view/MenuItem;)Landroid/view/MenuItem;
    .locals 2

    instance-of v0, p1, Lqa;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lqa;

    iget-object v1, p0, Lp2;->b:Ljava/util/Map;

    if-nez v1, :cond_0

    new-instance v1, Lu7;

    invoke-direct {v1}, Lu7;-><init>()V

    iput-object v1, p0, Lp2;->b:Ljava/util/Map;

    :cond_0
    iget-object v1, p0, Lp2;->b:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/MenuItem;

    if-nez p1, :cond_1

    new-instance p1, Li3;

    iget-object v1, p0, Lp2;->a:Landroid/content/Context;

    invoke-direct {p1, v1, v0}, Li3;-><init>(Landroid/content/Context;Lqa;)V

    iget-object v1, p0, Lp2;->b:Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object p1
.end method
