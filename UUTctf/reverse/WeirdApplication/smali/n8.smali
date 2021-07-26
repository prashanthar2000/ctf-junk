.class public Ln8;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln8$a;,
        Ln8$b;
    }
.end annotation


# instance fields
.field public a:Lt8;

.field public final b:Lo8;

.field public final c:Ln8$b;

.field public d:Ln8;

.field public e:I

.field public f:I

.field public g:Ln8$a;

.field public h:I

.field public i:Lk8;


# direct methods
.method public constructor <init>(Lo8;Ln8$b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lt8;

    invoke-direct {v0, p0}, Lt8;-><init>(Ln8;)V

    iput-object v0, p0, Ln8;->a:Lt8;

    const/4 v0, 0x0

    iput v0, p0, Ln8;->e:I

    const/4 v1, -0x1

    iput v1, p0, Ln8;->f:I

    sget-object v1, Ln8$a;->b:Ln8$a;

    iput-object v1, p0, Ln8;->g:Ln8$a;

    iput v0, p0, Ln8;->h:I

    iput-object p1, p0, Ln8;->b:Lo8;

    iput-object p2, p0, Ln8;->c:Ln8$b;

    return-void
.end method


# virtual methods
.method public a(Ln8;IILn8$a;IZ)Z
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Ln8;->d:Ln8;

    iput v0, p0, Ln8;->e:I

    const/4 p1, -0x1

    iput p1, p0, Ln8;->f:I

    sget-object p1, Ln8$a;->b:Ln8$a;

    iput-object p1, p0, Ln8;->g:Ln8$a;

    const/4 p1, 0x2

    iput p1, p0, Ln8;->h:I

    return v1

    :cond_0
    if-nez p6, :cond_c

    .line 1
    sget-object p6, Ln8$b;->j:Ln8$b;

    sget-object v2, Ln8$b;->i:Ln8$b;

    sget-object v3, Ln8$b;->g:Ln8$b;

    .line 2
    iget-object v4, p1, Ln8;->c:Ln8$b;

    .line 3
    iget-object v5, p0, Ln8;->c:Ln8$b;

    if-ne v4, v5, :cond_3

    if-ne v5, v3, :cond_4

    .line 4
    iget-object p6, p1, Ln8;->b:Lo8;

    .line 5
    iget p6, p6, Lo8;->Q:I

    if-lez p6, :cond_1

    const/4 p6, 0x1

    goto :goto_0

    :cond_1
    const/4 p6, 0x0

    :goto_0
    if-eqz p6, :cond_5

    .line 6
    iget-object p6, p0, Ln8;->b:Lo8;

    .line 7
    iget p6, p6, Lo8;->Q:I

    if-lez p6, :cond_2

    const/4 p6, 0x1

    goto :goto_1

    :cond_2
    const/4 p6, 0x0

    :goto_1
    if-nez p6, :cond_4

    goto :goto_3

    .line 8
    :cond_3
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    packed-switch v5, :pswitch_data_0

    new-instance p1, Ljava/lang/AssertionError;

    iget-object p2, p0, Ln8;->c:Ln8$b;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :pswitch_0
    if-eq v4, v3, :cond_5

    if-eq v4, v2, :cond_5

    if-eq v4, p6, :cond_5

    :cond_4
    :goto_2
    const/4 p6, 0x1

    goto :goto_8

    :cond_5
    :goto_3
    :pswitch_1
    const/4 p6, 0x0

    goto :goto_8

    :pswitch_2
    sget-object v2, Ln8$b;->d:Ln8$b;

    if-eq v4, v2, :cond_7

    sget-object v2, Ln8$b;->f:Ln8$b;

    if-ne v4, v2, :cond_6

    goto :goto_4

    :cond_6
    const/4 v2, 0x0

    goto :goto_5

    :cond_7
    :goto_4
    const/4 v2, 0x1

    .line 9
    :goto_5
    iget-object v3, p1, Ln8;->b:Lo8;

    .line 10
    instance-of v3, v3, Lr8;

    if-eqz v3, :cond_8

    if-nez v2, :cond_4

    if-ne v4, p6, :cond_5

    goto :goto_2

    :cond_8
    move p6, v2

    goto :goto_8

    :pswitch_3
    sget-object p6, Ln8$b;->c:Ln8$b;

    if-eq v4, p6, :cond_a

    sget-object p6, Ln8$b;->e:Ln8$b;

    if-ne v4, p6, :cond_9

    goto :goto_6

    :cond_9
    const/4 p6, 0x0

    goto :goto_7

    :cond_a
    :goto_6
    const/4 p6, 0x1

    .line 11
    :goto_7
    iget-object v3, p1, Ln8;->b:Lo8;

    .line 12
    instance-of v3, v3, Lr8;

    if-eqz v3, :cond_b

    if-nez p6, :cond_4

    if-ne v4, v2, :cond_5

    goto :goto_2

    :cond_b
    :goto_8
    if-nez p6, :cond_c

    return v0

    .line 13
    :cond_c
    iput-object p1, p0, Ln8;->d:Ln8;

    if-lez p2, :cond_d

    iput p2, p0, Ln8;->e:I

    goto :goto_9

    :cond_d
    iput v0, p0, Ln8;->e:I

    :goto_9
    iput p3, p0, Ln8;->f:I

    iput-object p4, p0, Ln8;->g:Ln8$a;

    iput p5, p0, Ln8;->h:I

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public b()I
    .locals 3

    iget-object v0, p0, Ln8;->b:Lo8;

    .line 1
    iget v0, v0, Lo8;->Y:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    iget v0, p0, Ln8;->f:I

    const/4 v2, -0x1

    if-le v0, v2, :cond_1

    iget-object v2, p0, Ln8;->d:Ln8;

    if-eqz v2, :cond_1

    iget-object v2, v2, Ln8;->b:Lo8;

    .line 3
    iget v2, v2, Lo8;->Y:I

    if-ne v2, v1, :cond_1

    return v0

    .line 4
    :cond_1
    iget v0, p0, Ln8;->e:I

    return v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Ln8;->d:Ln8;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Ln8;->d:Ln8;

    const/4 v0, 0x0

    iput v0, p0, Ln8;->e:I

    const/4 v1, -0x1

    iput v1, p0, Ln8;->f:I

    sget-object v1, Ln8$a;->c:Ln8$a;

    iput-object v1, p0, Ln8;->g:Ln8$a;

    iput v0, p0, Ln8;->h:I

    iget-object v0, p0, Ln8;->a:Lt8;

    invoke-virtual {v0}, Lt8;->i()V

    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Ln8;->i:Lk8;

    if-nez v0, :cond_0

    new-instance v0, Lk8;

    sget-object v1, Lj8;->b:Lj8;

    invoke-direct {v0, v1}, Lk8;-><init>(Lj8;)V

    iput-object v0, p0, Ln8;->i:Lk8;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lk8;->c()V

    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ln8;->b:Lo8;

    .line 1
    iget-object v1, v1, Lo8;->Z:Ljava/lang/String;

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln8;->c:Ln8$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
