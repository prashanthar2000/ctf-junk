.class public Le6;
.super Landroid/database/DataSetObserver;
.source ""


# instance fields
.field public final synthetic a:Li6;


# direct methods
.method public constructor <init>(Li6;)V
    .locals 0

    iput-object p1, p0, Le6;->a:Li6;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    iget-object v0, p0, Le6;->a:Li6;

    invoke-virtual {v0}, Li6;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le6;->a:Li6;

    invoke-virtual {v0}, Li6;->i()V

    :cond_0
    return-void
.end method

.method public onInvalidated()V
    .locals 1

    iget-object v0, p0, Le6;->a:Li6;

    invoke-virtual {v0}, Li6;->dismiss()V

    return-void
.end method
