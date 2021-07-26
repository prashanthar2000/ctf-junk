.class public Lbb;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcb;


# direct methods
.method public constructor <init>(Lcb;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lbb;->c:Lcb;

    iput-object p2, p0, Lbb;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lbb;->c:Lcb;

    iget-object v0, v0, Lcb;->d:Leb;

    iget-object v1, p0, Lbb;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Leb;->a(Ljava/lang/Object;)V

    return-void
.end method
