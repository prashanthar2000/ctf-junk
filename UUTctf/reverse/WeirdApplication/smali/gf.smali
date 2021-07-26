.class public final Lgf;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "RestrictedApi"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgf$a;
    }
.end annotation


# instance fields
.field public a:Lq7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq7<",
            "Ljava/lang/String;",
            "Lhf;",
            ">;"
        }
    .end annotation
.end field

.field public b:Landroid/os/Bundle;

.field public c:Z

.field public d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lq7;

    invoke-direct {v0}, Lq7;-><init>()V

    iput-object v0, p0, Lgf;->a:Lq7;

    return-void
.end method
