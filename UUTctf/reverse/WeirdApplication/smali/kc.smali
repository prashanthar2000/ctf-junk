.class public final Lkc;
.super Landroid/text/style/ClickableSpan;
.source ""


# instance fields
.field public final b:I

.field public final c:Lmc;

.field public final d:I


# direct methods
.method public constructor <init>(ILmc;I)V
    .locals 0

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    iput p1, p0, Lkc;->b:I

    iput-object p2, p0, Lkc;->c:Lmc;

    iput p3, p0, Lkc;->d:I

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iget v0, p0, Lkc;->b:I

    const-string v1, "ACCESSIBILITY_CLICKABLE_SPAN_ID"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lkc;->c:Lmc;

    iget v1, p0, Lkc;->d:I

    if-eqz v0, :cond_1

    .line 1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x10

    if-lt v2, v3, :cond_0

    iget-object v0, v0, Lmc;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, v1, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->performAction(ILandroid/os/Bundle;)Z

    :cond_0
    return-void

    :cond_1
    const/4 p1, 0x0

    throw p1
.end method
