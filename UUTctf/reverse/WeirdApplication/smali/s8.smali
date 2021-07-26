.class public abstract Ls8;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:[Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [Z

    sput-object v0, Ls8;->a:[Z

    return-void
.end method

.method public static a(Lo8;I)Z
    .locals 5

    sget-object v0, Lo8$a;->d:Lo8$a;

    iget-object v1, p0, Lo8;->C:[Lo8$a;

    aget-object v2, v1, p1

    const/4 v3, 0x0

    if-eq v2, v0, :cond_0

    return v3

    :cond_0
    iget v0, p0, Lo8;->G:F

    const/4 v2, 0x0

    const/4 v4, 0x1

    cmpl-float v0, v0, v2

    if-eqz v0, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    aget-object p0, v1, v4

    return v3

    :cond_2
    if-nez p1, :cond_5

    iget p1, p0, Lo8;->e:I

    if-eqz p1, :cond_3

    return v3

    :cond_3
    iget p1, p0, Lo8;->h:I

    if-nez p1, :cond_4

    iget p0, p0, Lo8;->i:I

    if-eqz p0, :cond_7

    :cond_4
    return v3

    :cond_5
    iget p1, p0, Lo8;->f:I

    if-eqz p1, :cond_6

    return v3

    :cond_6
    iget p1, p0, Lo8;->k:I

    if-nez p1, :cond_8

    iget p0, p0, Lo8;->l:I

    if-eqz p0, :cond_7

    goto :goto_1

    :cond_7
    return v4

    :cond_8
    :goto_1
    return v3
.end method

.method public static b(Lo8;II)V
    .locals 5

    mul-int/lit8 v0, p1, 0x2

    add-int/lit8 v1, v0, 0x1

    iget-object v2, p0, Lo8;->A:[Ln8;

    aget-object v3, v2, v0

    .line 1
    iget-object v3, v3, Ln8;->a:Lt8;

    .line 2
    iget-object v4, p0, Lo8;->D:Lo8;

    .line 3
    iget-object v4, v4, Lo8;->s:Ln8;

    .line 4
    iget-object v4, v4, Ln8;->a:Lt8;

    .line 5
    iput-object v4, v3, Lt8;->f:Lt8;

    aget-object v3, v2, v0

    .line 6
    iget-object v3, v3, Ln8;->a:Lt8;

    int-to-float p2, p2

    .line 7
    iput p2, v3, Lt8;->g:F

    aget-object p2, v2, v0

    .line 8
    iget-object p2, p2, Ln8;->a:Lt8;

    const/4 v3, 0x1

    .line 9
    iput v3, p2, Lv8;->b:I

    aget-object p2, v2, v1

    .line 10
    iget-object p2, p2, Ln8;->a:Lt8;

    .line 11
    aget-object v0, v2, v0

    .line 12
    iget-object v0, v0, Ln8;->a:Lt8;

    .line 13
    iput-object v0, p2, Lt8;->f:Lt8;

    aget-object p2, v2, v1

    .line 14
    iget-object p2, p2, Ln8;->a:Lt8;

    .line 15
    invoke-virtual {p0, p1}, Lo8;->j(I)I

    move-result p1

    int-to-float p1, p1

    iput p1, p2, Lt8;->g:F

    iget-object p0, p0, Lo8;->A:[Ln8;

    aget-object p0, p0, v1

    .line 16
    iget-object p0, p0, Ln8;->a:Lt8;

    .line 17
    iput v3, p0, Lv8;->b:I

    return-void
.end method
