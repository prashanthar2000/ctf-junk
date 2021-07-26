.class public Landroidx/lifecycle/SingleGeneratedAdapterObserver;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lpe;


# instance fields
.field public final a:Lne;


# direct methods
.method public constructor <init>(Lne;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/SingleGeneratedAdapterObserver;->a:Lne;

    return-void
.end method


# virtual methods
.method public g(Lre;Loe$a;)V
    .locals 3

    iget-object v0, p0, Landroidx/lifecycle/SingleGeneratedAdapterObserver;->a:Lne;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, p1, p2, v1, v2}, Lne;->a(Lre;Loe$a;ZLve;)V

    iget-object v0, p0, Landroidx/lifecycle/SingleGeneratedAdapterObserver;->a:Lne;

    const/4 v1, 0x1

    invoke-interface {v0, p1, p2, v1, v2}, Lne;->a(Lre;Loe$a;ZLve;)V

    return-void
.end method
