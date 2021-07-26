.class public Lz0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Llb;


# instance fields
.field public final synthetic b:Lb0;


# direct methods
.method public constructor <init>(Lb0;)V
    .locals 0

    iput-object p1, p0, Lz0;->b:Lb0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public g(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lz0;->b:Lb0;

    invoke-virtual {v0, p1}, Lb0;->e(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
