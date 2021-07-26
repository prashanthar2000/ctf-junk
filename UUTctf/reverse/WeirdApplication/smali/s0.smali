.class public Ls0;
.super Landroid/content/BroadcastReceiver;
.source ""


# instance fields
.field public final synthetic a:Lt0;


# direct methods
.method public constructor <init>(Lt0;)V
    .locals 0

    iput-object p1, p0, Ls0;->a:Lt0;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, Ls0;->a:Lt0;

    invoke-virtual {p1}, Lt0;->d()V

    return-void
.end method
