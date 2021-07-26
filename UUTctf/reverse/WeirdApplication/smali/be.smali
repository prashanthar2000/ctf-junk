.class public final Lbe;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:I

.field public b:Ljd;

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:Loe$b;

.field public h:Loe$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lbe;->a:I

    const/4 p1, 0x0

    iput-object p1, p0, Lbe;->b:Ljd;

    sget-object p1, Loe$b;->f:Loe$b;

    iput-object p1, p0, Lbe;->g:Loe$b;

    iput-object p1, p0, Lbe;->h:Loe$b;

    return-void
.end method
