.class final Lhd;
.super Lhc;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhd$a;
    }
.end annotation


# direct methods
.method constructor <init>(Landroid/content/Context;Ldd;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lhc;-><init>(Landroid/content/Context;Ldd;)V

    return-void
.end method


# virtual methods
.method final a(Landroid/view/ActionProvider;)Lhc$a;
    .locals 2

    new-instance v0, Lhd$a;

    iget-object v1, p0, Lhd;->a:Landroid/content/Context;

    invoke-direct {v0, p0, v1, p1}, Lhd$a;-><init>(Lhd;Landroid/content/Context;Landroid/view/ActionProvider;)V

    return-object v0
.end method
