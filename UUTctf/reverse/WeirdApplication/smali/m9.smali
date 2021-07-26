.class public final Lm9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroid/app/Application;

.field public final synthetic c:Lo9;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lo9;)V
    .locals 0

    iput-object p1, p0, Lm9;->b:Landroid/app/Application;

    iput-object p2, p0, Lm9;->c:Lo9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lm9;->b:Landroid/app/Application;

    iget-object v1, p0, Lm9;->c:Lo9;

    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method
