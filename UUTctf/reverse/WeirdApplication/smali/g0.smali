.class public Lg0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ly0;


# direct methods
.method public constructor <init>(Ly0;)V
    .locals 0

    iput-object p1, p0, Lg0;->b:Ly0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lg0;->b:Ly0;

    iget v1, v0, Ly0;->U:I

    and-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v0, v2}, Ly0;->w(I)V

    :cond_0
    iget-object v0, p0, Lg0;->b:Ly0;

    iget v1, v0, Ly0;->U:I

    and-int/lit16 v1, v1, 0x1000

    if-eqz v1, :cond_1

    const/16 v1, 0x6c

    invoke-virtual {v0, v1}, Ly0;->w(I)V

    :cond_1
    iget-object v0, p0, Lg0;->b:Ly0;

    iput-boolean v2, v0, Ly0;->T:Z

    iput v2, v0, Ly0;->U:I

    return-void
.end method
