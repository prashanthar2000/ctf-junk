.class final Lfv$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lfv;


# direct methods
.method constructor <init>(Lfv;)V
    .locals 0

    iput-object p1, p0, Lfv$2;->a:Lfv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lfv$2;->a:Lfv;

    iget v0, v0, Lfv;->b:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lfv$2;->a:Lfv;

    invoke-virtual {v0, v1}, Lfv;->c(I)V

    :cond_0
    iget-object v0, p0, Lfv$2;->a:Lfv;

    iget v0, v0, Lfv;->b:I

    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_1

    iget-object v0, p0, Lfv$2;->a:Lfv;

    const/16 v2, 0x6c

    invoke-virtual {v0, v2}, Lfv;->c(I)V

    :cond_1
    iget-object v0, p0, Lfv$2;->a:Lfv;

    iput-boolean v1, v0, Lfv;->h:Z

    iput v1, v0, Lfv;->b:I

    return-void
.end method
