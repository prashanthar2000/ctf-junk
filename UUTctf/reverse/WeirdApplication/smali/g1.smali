.class public Lg1;
.super Lic;
.source ""


# instance fields
.field public final synthetic a:Lj1;


# direct methods
.method public constructor <init>(Lj1;)V
    .locals 0

    iput-object p1, p0, Lg1;->a:Lj1;

    invoke-direct {p0}, Lic;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lg1;->a:Lj1;

    const/4 v0, 0x0

    iput-object v0, p1, Lj1;->u:Ln2;

    iget-object p1, p1, Lj1;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->requestLayout()V

    return-void
.end method
