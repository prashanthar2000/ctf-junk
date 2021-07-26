.class public final Lja;
.super Ljava/lang/Object;


# instance fields
.field private a:I

.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lja;->a:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    iget v0, p0, Lja;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lja;->a:I

    iget v0, p0, Lja;->a:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    iput-object p1, p0, Lja;->a:Ljava/lang/String;

    :cond_0
    return-void
.end method
