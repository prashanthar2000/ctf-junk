.class public Lqd;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lud;


# direct methods
.method public constructor <init>(Lud;)V
    .locals 0

    iput-object p1, p0, Lqd;->b:Lud;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lqd;->b:Lud;

    invoke-virtual {v0}, Lud;->g()Z

    return-void
.end method
