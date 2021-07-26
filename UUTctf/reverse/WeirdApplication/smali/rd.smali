.class public Lrd;
.super Lmd;
.source ""


# instance fields
.field public final synthetic b:Lud;


# direct methods
.method public constructor <init>(Lud;)V
    .locals 0

    iput-object p1, p0, Lrd;->b:Lud;

    invoke-direct {p0}, Lmd;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/ClassLoader;Ljava/lang/String;)V
    .locals 4

    iget-object p1, p0, Lrd;->b:Lud;

    iget-object p1, p1, Lud;->p:Lnd;

    .line 1
    iget-object v0, p1, Lnd;->b:Landroid/content/Context;

    if-eqz p1, :cond_0

    const-string p1, ": make sure class name exists, is public, and has an empty constructor that is public"

    const-string v1, "Unable to instantiate fragment "

    .line 2
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0, p2}, Lmd;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljd;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lid;

    const-string v2, ": calling Fragment constructor caused an exception"

    invoke-static {v1, p2, v2}, Lgg;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Lid;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0

    :catch_1
    move-exception p1

    new-instance v0, Lid;

    const-string v2, ": could not find Fragment constructor"

    invoke-static {v1, p2, v2}, Lgg;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Lid;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0

    :catch_2
    move-exception v0

    new-instance v2, Lid;

    invoke-static {v1, p2, p1}, Lgg;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v0}, Lid;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2

    :catch_3
    move-exception v0

    new-instance v2, Lid;

    invoke-static {v1, p2, p1}, Lgg;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v0}, Lid;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2

    :cond_0
    const/4 p1, 0x0

    .line 3
    throw p1
.end method
