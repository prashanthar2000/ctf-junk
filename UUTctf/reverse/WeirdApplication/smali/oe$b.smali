.class public final enum Loe$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Loe$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Loe$b;

.field public static final enum c:Loe$b;

.field public static final enum d:Loe$b;

.field public static final enum e:Loe$b;

.field public static final enum f:Loe$b;

.field public static final synthetic g:[Loe$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, Loe$b;

    const-string v1, "DESTROYED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Loe$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Loe$b;->b:Loe$b;

    new-instance v0, Loe$b;

    const-string v1, "INITIALIZED"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Loe$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Loe$b;->c:Loe$b;

    new-instance v0, Loe$b;

    const-string v1, "CREATED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Loe$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Loe$b;->d:Loe$b;

    new-instance v0, Loe$b;

    const-string v1, "STARTED"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Loe$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Loe$b;->e:Loe$b;

    new-instance v0, Loe$b;

    const-string v1, "RESUMED"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Loe$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Loe$b;->f:Loe$b;

    const/4 v1, 0x5

    new-array v1, v1, [Loe$b;

    sget-object v7, Loe$b;->b:Loe$b;

    aput-object v7, v1, v2

    sget-object v2, Loe$b;->c:Loe$b;

    aput-object v2, v1, v3

    sget-object v2, Loe$b;->d:Loe$b;

    aput-object v2, v1, v4

    sget-object v2, Loe$b;->e:Loe$b;

    aput-object v2, v1, v5

    aput-object v0, v1, v6

    sput-object v1, Loe$b;->g:[Loe$b;

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

.method public static valueOf(Ljava/lang/String;)Loe$b;
    .locals 1

    const-class v0, Loe$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Loe$b;

    return-object p0
.end method

.method public static values()[Loe$b;
    .locals 1

    sget-object v0, Loe$b;->g:[Loe$b;

    invoke-virtual {v0}, [Loe$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Loe$b;

    return-object v0
.end method
