.class public Lff;
.super Laf;
.source ""


# static fields
.field public static final c:Lbf;


# instance fields
.field public b:Lc8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc8<",
            "Lef;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lff$a;

    invoke-direct {v0}, Lff$a;-><init>()V

    sput-object v0, Lff;->c:Lbf;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Laf;-><init>()V

    new-instance v0, Lc8;

    const/16 v1, 0xa

    .line 1
    invoke-direct {v0, v1}, Lc8;-><init>(I)V

    .line 2
    iput-object v0, p0, Lff;->b:Lc8;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    iget-object v0, p0, Lff;->b:Lc8;

    invoke-virtual {v0}, Lc8;->i()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-gtz v0, :cond_1

    iget-object v0, p0, Lff;->b:Lc8;

    .line 1
    iget v3, v0, Lc8;->e:I

    iget-object v4, v0, Lc8;->d:[Ljava/lang/Object;

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_0

    aput-object v1, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    iput v2, v0, Lc8;->e:I

    iput-boolean v2, v0, Lc8;->b:Z

    return-void

    .line 2
    :cond_1
    iget-object v0, p0, Lff;->b:Lc8;

    invoke-virtual {v0, v2}, Lc8;->j(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lef;

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1
.end method
