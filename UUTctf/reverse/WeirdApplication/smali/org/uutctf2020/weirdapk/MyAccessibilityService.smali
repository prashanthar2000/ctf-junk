.class public Lorg/uutctf2020/weirdapk/MyAccessibilityService;
.super Landroid/accessibilityservice/AccessibilityService;
.source ""


# instance fields
.field public b:Landroid/content/SharedPreferences$Editor;

.field public c:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/accessibilityservice/AccessibilityService;-><init>()V

    return-void
.end method


# virtual methods
.method public onAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 6

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getPackageName()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getClassName()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_2

    :try_start_0
    new-instance v0, Lig;

    invoke-virtual {p0}, Landroid/accessibilityservice/AccessibilityService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lig;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroid/content/ComponentName;

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getPackageName()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getClassName()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/accessibilityservice/AccessibilityService;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lorg/uutctf2020/weirdapk/MyAccessibilityService;->c:Landroid/content/SharedPreferences;

    const-wide v3, 0x63baffb73376090dL    # 2.608455507483626E172

    invoke-static {v3, v4}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, -0x1

    invoke-interface {p1, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    const/16 v3, 0xd

    if-ge p1, v3, :cond_2

    invoke-virtual {v1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v4, 0x1

    add-int/2addr p1, v4

    .line 1
    :try_start_1
    iget-object v0, v0, Lig;->b:[Ljava/lang/String;

    aget-object v0, v0, p1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v0, :cond_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-wide v4, 0x63bafd9c3376090dL    # 2.6076609114887124E172

    :try_start_2
    invoke-static {v4, v5}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_2

    .line 2
    iget-object v0, p0, Lorg/uutctf2020/weirdapk/MyAccessibilityService;->b:Landroid/content/SharedPreferences$Editor;

    const-wide v4, 0x63baffb13376090dL    # 2.608446662259193E172

    invoke-static {v4, v5}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    iget-object v0, p0, Lorg/uutctf2020/weirdapk/MyAccessibilityService;->b:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    if-ne p1, v3, :cond_1

    invoke-virtual {p0}, Landroid/accessibilityservice/AccessibilityService;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-wide v0, 0x63baffab3376090dL    # 2.6084378170347597E172

    invoke-static {v0, v1}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {p1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Landroid/accessibilityservice/AccessibilityService;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-wide v0, 0x63baff7f3376090dL    # 2.608372952055583E172

    invoke-static {v0, v1}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    :cond_2
    :goto_2
    return-void
.end method

.method public onCreate()V
    .locals 4

    invoke-super {p0}, Landroid/accessibilityservice/AccessibilityService;->onCreate()V

    const-wide v0, 0x63baffc93376090dL    # 2.6084820431569255E172

    invoke-static {v0, v1}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/accessibilityservice/AccessibilityService;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iput-object v0, p0, Lorg/uutctf2020/weirdapk/MyAccessibilityService;->b:Landroid/content/SharedPreferences$Editor;

    const-wide v2, 0x63baffc03376090dL    # 2.6084687753202758E172

    invoke-static {v2, v3}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v1}, Landroid/accessibilityservice/AccessibilityService;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lorg/uutctf2020/weirdapk/MyAccessibilityService;->c:Landroid/content/SharedPreferences;

    return-void
.end method

.method public onInterrupt()V
    .locals 0

    return-void
.end method
