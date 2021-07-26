.class public Lxa;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:I

.field public final c:I

.field public final d:Z

.field public final e:I


# direct methods
.method public constructor <init>(Landroid/net/Uri;IIZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lxa;->a:Landroid/net/Uri;

    iput p2, p0, Lxa;->b:I

    iput p3, p0, Lxa;->c:I

    iput-boolean p4, p0, Lxa;->d:Z

    iput p5, p0, Lxa;->e:I

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 1
    throw p1
.end method
