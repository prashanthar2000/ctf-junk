.class final Lbw$1;
.super Landroid/transition/Transition$EpicenterCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbw;->a(Ljava/lang/Object;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/graphics/Rect;

.field final synthetic a:Lbw;


# direct methods
.method constructor <init>(Lbw;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lbw$1;->a:Lbw;

    iput-object p2, p0, Lbw$1;->a:Landroid/graphics/Rect;

    invoke-direct {p0}, Landroid/transition/Transition$EpicenterCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGetEpicenter(Landroid/transition/Transition;)Landroid/graphics/Rect;
    .locals 0

    iget-object p1, p0, Lbw$1;->a:Landroid/graphics/Rect;

    return-object p1
.end method
