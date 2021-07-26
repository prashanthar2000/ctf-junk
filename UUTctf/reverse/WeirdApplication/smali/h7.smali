.class public Lh7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Li7;


# direct methods
.method public constructor <init>(Li7;)V
    .locals 0

    iput-object p1, p0, Lh7;->b:Li7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lh7;->b:Li7;

    invoke-virtual {v0}, Li7;->b()V

    return-void
.end method
