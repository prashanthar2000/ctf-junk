.class public Lv5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lw5;


# direct methods
.method public constructor <init>(Lw5;)V
    .locals 0

    iput-object p1, p0, Lv5;->b:Lw5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lv5;->b:Lw5;

    const/4 v1, 0x0

    iput-object v1, v0, Lw5;->o:Lv5;

    invoke-virtual {v0}, Lw5;->drawableStateChanged()V

    return-void
.end method
