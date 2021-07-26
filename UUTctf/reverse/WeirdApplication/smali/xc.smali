.class public Lxc;
.super Landroid/database/ContentObserver;
.source ""


# instance fields
.field public final synthetic a:Lzc;


# direct methods
.method public constructor <init>(Lzc;)V
    .locals 0

    iput-object p1, p0, Lxc;->a:Lzc;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public deliverSelfNotifications()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onChange(Z)V
    .locals 1

    iget-object p1, p0, Lxc;->a:Lzc;

    .line 1
    iget-boolean v0, p1, Lzc;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lzc;->d:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p1, Lzc;->d:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->requery()Z

    move-result v0

    iput-boolean v0, p1, Lzc;->b:Z

    :cond_0
    return-void
.end method
