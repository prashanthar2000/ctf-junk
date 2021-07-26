.class public Lpd;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Z

.field public b:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "La;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:Lud;


# direct methods
.method public constructor <init>(Lud;Z)V
    .locals 0

    iput-object p1, p0, Lpd;->c:Lud;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Lpd;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput-boolean p2, p0, Lpd;->a:Z

    return-void
.end method
