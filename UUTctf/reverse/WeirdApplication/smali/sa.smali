.class public final Lsa;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lya;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lra;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lra;ILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lsa;->a:Landroid/content/Context;

    iput-object p2, p0, Lsa;->b:Lra;

    iput p3, p0, Lsa;->c:I

    iput-object p4, p0, Lsa;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lsa;->a:Landroid/content/Context;

    iget-object v1, p0, Lsa;->b:Lra;

    iget v2, p0, Lsa;->c:I

    invoke-static {v0, v1, v2}, Lza;->b(Landroid/content/Context;Lra;I)Lya;

    move-result-object v0

    iget-object v1, v0, Lya;->a:Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    sget-object v2, Lza;->a:Lz7;

    iget-object v3, p0, Lsa;->d:Ljava/lang/String;

    invoke-virtual {v2, v3, v1}, Lz7;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method
