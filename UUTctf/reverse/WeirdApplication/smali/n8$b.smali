.class public final enum Ln8$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln8$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Ln8$b;

.field public static final enum c:Ln8$b;

.field public static final enum d:Ln8$b;

.field public static final enum e:Ln8$b;

.field public static final enum f:Ln8$b;

.field public static final enum g:Ln8$b;

.field public static final enum h:Ln8$b;

.field public static final enum i:Ln8$b;

.field public static final enum j:Ln8$b;

.field public static final synthetic k:[Ln8$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 12

    new-instance v0, Ln8$b;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln8$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln8$b;->b:Ln8$b;

    new-instance v0, Ln8$b;

    const-string v1, "LEFT"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Ln8$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln8$b;->c:Ln8$b;

    new-instance v0, Ln8$b;

    const-string v1, "TOP"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Ln8$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln8$b;->d:Ln8$b;

    new-instance v0, Ln8$b;

    const-string v1, "RIGHT"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Ln8$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln8$b;->e:Ln8$b;

    new-instance v0, Ln8$b;

    const-string v1, "BOTTOM"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Ln8$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln8$b;->f:Ln8$b;

    new-instance v0, Ln8$b;

    const-string v1, "BASELINE"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Ln8$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln8$b;->g:Ln8$b;

    new-instance v0, Ln8$b;

    const-string v1, "CENTER"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Ln8$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln8$b;->h:Ln8$b;

    new-instance v0, Ln8$b;

    const-string v1, "CENTER_X"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Ln8$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln8$b;->i:Ln8$b;

    new-instance v0, Ln8$b;

    const-string v1, "CENTER_Y"

    const/16 v10, 0x8

    invoke-direct {v0, v1, v10}, Ln8$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln8$b;->j:Ln8$b;

    const/16 v1, 0x9

    new-array v1, v1, [Ln8$b;

    sget-object v11, Ln8$b;->b:Ln8$b;

    aput-object v11, v1, v2

    sget-object v2, Ln8$b;->c:Ln8$b;

    aput-object v2, v1, v3

    sget-object v2, Ln8$b;->d:Ln8$b;

    aput-object v2, v1, v4

    sget-object v2, Ln8$b;->e:Ln8$b;

    aput-object v2, v1, v5

    sget-object v2, Ln8$b;->f:Ln8$b;

    aput-object v2, v1, v6

    sget-object v2, Ln8$b;->g:Ln8$b;

    aput-object v2, v1, v7

    sget-object v2, Ln8$b;->h:Ln8$b;

    aput-object v2, v1, v8

    sget-object v2, Ln8$b;->i:Ln8$b;

    aput-object v2, v1, v9

    aput-object v0, v1, v10

    sput-object v1, Ln8$b;->k:[Ln8$b;

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

.method public static valueOf(Ljava/lang/String;)Ln8$b;
    .locals 1

    const-class v0, Ln8$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln8$b;

    return-object p0
.end method

.method public static values()[Ln8$b;
    .locals 1

    sget-object v0, Ln8$b;->k:[Ln8$b;

    invoke-virtual {v0}, [Ln8$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln8$b;

    return-object v0
.end method
