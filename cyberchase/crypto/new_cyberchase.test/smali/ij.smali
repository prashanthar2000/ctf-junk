.class public final Lij;
.super Ljava/lang/Object;


# instance fields
.field public a:I

.field public a:Z

.field public b:I

.field public b:Z

.field public c:I

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lij;->a:I

    iput v0, p0, Lij;->b:I

    const/high16 v1, -0x80000000

    iput v1, p0, Lij;->c:I

    iput v1, p0, Lij;->d:I

    iput v0, p0, Lij;->e:I

    iput v0, p0, Lij;->f:I

    iput-boolean v0, p0, Lij;->a:Z

    iput-boolean v0, p0, Lij;->b:Z

    return-void
.end method


# virtual methods
.method public final a(II)V
    .locals 2

    iput p1, p0, Lij;->c:I

    iput p2, p0, Lij;->d:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lij;->b:Z

    iget-boolean v0, p0, Lij;->a:Z

    const/high16 v1, -0x80000000

    if-eqz v0, :cond_1

    if-eq p2, v1, :cond_0

    iput p2, p0, Lij;->a:I

    :cond_0
    if-eq p1, v1, :cond_3

    iput p1, p0, Lij;->b:I

    return-void

    :cond_1
    if-eq p1, v1, :cond_2

    iput p1, p0, Lij;->a:I

    :cond_2
    if-eq p2, v1, :cond_3

    iput p2, p0, Lij;->b:I

    :cond_3
    return-void
.end method

.method public final b(II)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lij;->b:Z

    const/high16 v0, -0x80000000

    if-eq p1, v0, :cond_0

    iput p1, p0, Lij;->e:I

    iput p1, p0, Lij;->a:I

    :cond_0
    if-eq p2, v0, :cond_1

    iput p2, p0, Lij;->f:I

    iput p2, p0, Lij;->b:I

    :cond_1
    return-void
.end method
