.class public Lw8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Ln8;

.field public b:Ln8;

.field public c:I

.field public d:Ln8$a;

.field public e:I


# direct methods
.method public constructor <init>(Ln8;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw8;->a:Ln8;

    .line 1
    iget-object v0, p1, Ln8;->d:Ln8;

    .line 2
    iput-object v0, p0, Lw8;->b:Ln8;

    invoke-virtual {p1}, Ln8;->b()I

    move-result v0

    iput v0, p0, Lw8;->c:I

    .line 3
    iget-object v0, p1, Ln8;->g:Ln8$a;

    .line 4
    iput-object v0, p0, Lw8;->d:Ln8$a;

    .line 5
    iget p1, p1, Ln8;->h:I

    .line 6
    iput p1, p0, Lw8;->e:I

    return-void
.end method
