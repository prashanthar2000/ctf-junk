.class public final Lam$a;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lam;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lam$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:I = 0x1

.field private static final synthetic a:[I

.field public static final b:I = 0x2

.field public static final c:I = 0x3

.field public static final d:I = 0x4


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [I

    sget v1, Lam$a;->a:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lam$a;->b:I

    const/4 v2, 0x1

    aput v1, v0, v2

    sget v1, Lam$a;->c:I

    const/4 v2, 0x2

    aput v1, v0, v2

    sget v1, Lam$a;->d:I

    const/4 v2, 0x3

    aput v1, v0, v2

    sput-object v0, Lam$a;->a:[I

    return-void
.end method

.method public static a()[I
    .locals 1

    sget-object v0, Lam$a;->a:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method
