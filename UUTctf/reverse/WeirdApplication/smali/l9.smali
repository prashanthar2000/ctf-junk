.class public final Ll9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lo9;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lo9;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Ll9;->b:Lo9;

    iput-object p2, p0, Ll9;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ll9;->b:Lo9;

    iget-object v1, p0, Ll9;->c:Ljava/lang/Object;

    iput-object v1, v0, Lo9;->a:Ljava/lang/Object;

    return-void
.end method
