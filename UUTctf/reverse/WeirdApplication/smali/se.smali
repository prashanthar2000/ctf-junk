.class public Lse;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Loe$b;

.field public b:Lpe;


# direct methods
.method public constructor <init>(Lqe;Loe$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lue;->d(Ljava/lang/Object;)Lpe;

    move-result-object p1

    iput-object p1, p0, Lse;->b:Lpe;

    iput-object p2, p0, Lse;->a:Loe$b;

    return-void
.end method


# virtual methods
.method public a(Lre;Loe$a;)V
    .locals 2

    invoke-static {p2}, Lte;->d(Loe$a;)Loe$b;

    move-result-object v0

    iget-object v1, p0, Lse;->a:Loe$b;

    invoke-static {v1, v0}, Lte;->f(Loe$b;Loe$b;)Loe$b;

    move-result-object v1

    iput-object v1, p0, Lse;->a:Loe$b;

    iget-object v1, p0, Lse;->b:Lpe;

    invoke-interface {v1, p1, p2}, Lpe;->g(Lre;Loe$a;)V

    iput-object v0, p0, Lse;->a:Loe$b;

    return-void
.end method
