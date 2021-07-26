.class public final Lm4;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Landroid/graphics/PorterDuff$Mode;

.field public static c:Lm4;


# instance fields
.field public a:Lr6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    sput-object v0, Lm4;->b:Landroid/graphics/PorterDuff$Mode;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a()Lm4;
    .locals 2

    const-class v0, Lm4;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lm4;->c:Lm4;

    if-nez v1, :cond_0

    invoke-static {}, Lm4;->d()V

    :cond_0
    sget-object v1, Lm4;->c:Lm4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized d()V
    .locals 3

    const-class v0, Lm4;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lm4;->c:Lm4;

    if-nez v1, :cond_0

    new-instance v1, Lm4;

    invoke-direct {v1}, Lm4;-><init>()V

    sput-object v1, Lm4;->c:Lm4;

    invoke-static {}, Lr6;->d()Lr6;

    move-result-object v2

    iput-object v2, v1, Lm4;->a:Lr6;

    sget-object v1, Lm4;->c:Lm4;

    iget-object v1, v1, Lm4;->a:Lr6;

    new-instance v2, Ll4;

    invoke-direct {v2}, Ll4;-><init>()V

    .line 1
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iput-object v2, v1, Lr6;->g:Ll4;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 2
    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static e(Landroid/graphics/drawable/Drawable;Lz6;[I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lr6;->l(Landroid/graphics/drawable/Drawable;Lz6;[I)V

    return-void
.end method


# virtual methods
.method public declared-synchronized b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lm4;->a:Lr6;

    invoke-virtual {v0, p1, p2}, Lr6;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lm4;->a:Lr6;

    invoke-virtual {v0, p1, p2}, Lr6;->i(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
