.class public Ld;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La;


# instance fields
.field public final a:Lpd;

.field public final synthetic b:Landroidx/activity/OnBackPressedDispatcher;


# direct methods
.method public constructor <init>(Landroidx/activity/OnBackPressedDispatcher;Lpd;)V
    .locals 0

    iput-object p1, p0, Ld;->b:Landroidx/activity/OnBackPressedDispatcher;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ld;->a:Lpd;

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 2

    iget-object v0, p0, Ld;->b:Landroidx/activity/OnBackPressedDispatcher;

    iget-object v0, v0, Landroidx/activity/OnBackPressedDispatcher;->b:Ljava/util/ArrayDeque;

    iget-object v1, p0, Ld;->a:Lpd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Ld;->a:Lpd;

    .line 1
    iget-object v0, v0, Lpd;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method