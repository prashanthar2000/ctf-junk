.class public Lx9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroid/graphics/Typeface;

.field public final synthetic c:Lm5;


# direct methods
.method public constructor <init>(Lm5;Landroid/graphics/Typeface;)V
    .locals 0

    iput-object p1, p0, Lx9;->c:Lm5;

    iput-object p2, p0, Lx9;->b:Landroid/graphics/Typeface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lx9;->c:Lm5;

    iget-object v1, p0, Lx9;->b:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Lm5;->c(Landroid/graphics/Typeface;)V

    return-void
.end method
