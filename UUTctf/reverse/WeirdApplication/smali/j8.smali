.class public final enum Lj8;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lj8;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lj8;

.field public static final enum c:Lj8;

.field public static final enum d:Lj8;

.field public static final enum e:Lj8;

.field public static final enum f:Lj8;

.field public static final synthetic g:[Lj8;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, Lj8;

    const-string v1, "UNRESTRICTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lj8;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj8;->b:Lj8;

    new-instance v0, Lj8;

    const-string v1, "CONSTANT"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lj8;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj8;->c:Lj8;

    new-instance v0, Lj8;

    const-string v1, "SLACK"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lj8;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj8;->d:Lj8;

    new-instance v0, Lj8;

    const-string v1, "ERROR"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lj8;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj8;->e:Lj8;

    new-instance v0, Lj8;

    const-string v1, "UNKNOWN"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lj8;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj8;->f:Lj8;

    const/4 v1, 0x5

    new-array v1, v1, [Lj8;

    sget-object v7, Lj8;->b:Lj8;

    aput-object v7, v1, v2

    sget-object v2, Lj8;->c:Lj8;

    aput-object v2, v1, v3

    sget-object v2, Lj8;->d:Lj8;

    aput-object v2, v1, v4

    sget-object v2, Lj8;->e:Lj8;

    aput-object v2, v1, v5

    aput-object v0, v1, v6

    sput-object v1, Lj8;->g:[Lj8;

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

.method public static valueOf(Ljava/lang/String;)Lj8;
    .locals 1

    const-class v0, Lj8;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj8;

    return-object p0
.end method

.method public static values()[Lj8;
    .locals 1

    sget-object v0, Lj8;->g:[Lj8;

    invoke-virtual {v0}, [Lj8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj8;

    return-object v0
.end method
