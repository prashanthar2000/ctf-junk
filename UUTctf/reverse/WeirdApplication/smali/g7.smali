.class public Lg7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Li7;


# direct methods
.method public constructor <init>(Li7;)V
    .locals 0

    iput-object p1, p0, Lg7;->b:Li7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lg7;->b:Li7;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Li7;->d(Z)V

    return-void
.end method
