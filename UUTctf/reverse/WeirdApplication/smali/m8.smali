.class public Lm8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lo8;

.field public b:Lo8;

.field public c:Lo8;

.field public d:Lo8;

.field public e:Lo8;

.field public f:Lo8;

.field public g:Lo8;

.field public h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lo8;",
            ">;"
        }
    .end annotation
.end field

.field public i:I

.field public j:I

.field public k:F

.field public l:I

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z


# direct methods
.method public constructor <init>(Lo8;IZ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lm8;->k:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Lm8;->m:Z

    iput-object p1, p0, Lm8;->a:Lo8;

    iput p2, p0, Lm8;->l:I

    iput-boolean p3, p0, Lm8;->m:Z

    return-void
.end method
