.class public Lq5;
.super Landroid/widget/ToggleButton;
.source ""


# instance fields
.field public final b:Ln5;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x101004b

    .line 1
    invoke-direct {p0, p1, p2, v0}, Landroid/widget/ToggleButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Ln5;

    invoke-direct {p1, p0}, Ln5;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Lq5;->b:Ln5;

    invoke-virtual {p1, p2, v0}, Ln5;->e(Landroid/util/AttributeSet;I)V

    return-void
.end method
