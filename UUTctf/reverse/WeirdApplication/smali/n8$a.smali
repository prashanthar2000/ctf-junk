.class public final enum Ln8$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln8$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Ln8$a;

.field public static final enum c:Ln8$a;

.field public static final enum d:Ln8$a;

.field public static final synthetic e:[Ln8$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Ln8$a;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln8$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln8$a;->b:Ln8$a;

    new-instance v0, Ln8$a;

    const-string v1, "STRONG"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Ln8$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln8$a;->c:Ln8$a;

    new-instance v0, Ln8$a;

    const-string v1, "WEAK"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Ln8$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln8$a;->d:Ln8$a;

    const/4 v1, 0x3

    new-array v1, v1, [Ln8$a;

    sget-object v5, Ln8$a;->b:Ln8$a;

    aput-object v5, v1, v2

    sget-object v2, Ln8$a;->c:Ln8$a;

    aput-object v2, v1, v3

    aput-object v0, v1, v4

    sput-object v1, Ln8$a;->e:[Ln8$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ln8$a;
    .locals 1

    const-class v0, Ln8$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln8$a;

    return-object p0
.end method

.method public static values()[Ln8$a;
    .locals 1

    sget-object v0, Ln8$a;->e:[Ln8$a;

    invoke-virtual {v0}, [Ln8$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln8$a;

    return-object v0
.end method
