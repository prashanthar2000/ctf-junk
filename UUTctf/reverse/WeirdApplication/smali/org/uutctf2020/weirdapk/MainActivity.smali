.class public Lorg/uutctf2020/weirdapk/MainActivity;
.super Lc0;
.source ""


# instance fields
.field public p:Landroid/widget/TextView;

.field public q:Lig;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lc0;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    invoke-super {p0, p1}, Lc0;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0a001c

    invoke-virtual {p0, p1}, Lc0;->setContentView(I)V

    new-instance p1, Lig;

    invoke-direct {p1, p0}, Lig;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lorg/uutctf2020/weirdapk/MainActivity;->q:Lig;

    const p1, 0x7f070057

    invoke-virtual {p0, p1}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lorg/uutctf2020/weirdapk/MainActivity;->p:Landroid/widget/TextView;

    const-class p1, Lorg/uutctf2020/weirdapk/MyAccessibilityService;

    const-wide v0, 0x63baffd73376090dL    # 2.6085026820139363E172

    .line 1
    invoke-static {v0, v1}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/accessibilityservice/AccessibilityServiceInfo;

    invoke-virtual {v1}, Landroid/accessibilityservice/AccessibilityServiceInfo;->getResolveInfo()Landroid/content/pm/ResolveInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v3, v1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v1, v1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    .line 2
    new-instance p1, Landroid/content/Intent;

    const-wide v0, 0x63baffff3376090dL    # 2.608561650176824E172

    invoke-static {v0, v1}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v2}, Lc0;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_2
    iget-object p1, p0, Lorg/uutctf2020/weirdapk/MainActivity;->p:Landroid/widget/TextView;

    iget-object v0, p0, Lorg/uutctf2020/weirdapk/MainActivity;->q:Lig;

    invoke-virtual {v0}, Lig;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Lc0;->onResume()V

    iget-object v0, p0, Lorg/uutctf2020/weirdapk/MainActivity;->p:Landroid/widget/TextView;

    iget-object v1, p0, Lorg/uutctf2020/weirdapk/MainActivity;->q:Lig;

    invoke-virtual {v1}, Lig;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
