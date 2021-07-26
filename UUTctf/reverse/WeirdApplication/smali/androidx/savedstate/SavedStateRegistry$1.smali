.class public Landroidx/savedstate/SavedStateRegistry$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lpe;


# instance fields
.field public final synthetic a:Lgf;


# direct methods
.method public constructor <init>(Lgf;)V
    .locals 0

    iput-object p1, p0, Landroidx/savedstate/SavedStateRegistry$1;->a:Lgf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public g(Lre;Loe$a;)V
    .locals 0

    sget-object p1, Loe$a;->ON_START:Loe$a;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Landroidx/savedstate/SavedStateRegistry$1;->a:Lgf;

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    sget-object p1, Loe$a;->ON_STOP:Loe$a;

    if-ne p2, p1, :cond_1

    iget-object p1, p0, Landroidx/savedstate/SavedStateRegistry$1;->a:Lgf;

    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p1, Lgf;->d:Z

    :cond_1
    return-void
.end method
