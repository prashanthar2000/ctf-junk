.class final Lgd$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field final a:Landroid/content/res/ColorStateList;

.field final a:Landroid/content/res/Configuration;


# direct methods
.method constructor <init>(Landroid/content/res/ColorStateList;Landroid/content/res/Configuration;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgd$a;->a:Landroid/content/res/ColorStateList;

    iput-object p2, p0, Lgd$a;->a:Landroid/content/res/Configuration;

    return-void
.end method
