.class public Lq0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/Window$Callback;


# instance fields
.field public final b:Landroid/view/Window$Callback;

.field public final synthetic c:Ly0;


# direct methods
.method public constructor <init>(Ly0;Landroid/view/Window$Callback;)V
    .locals 0

    iput-object p1, p0, Lq0;->c:Ly0;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    iput-object p2, p0, Lq0;->b:Landroid/view/Window$Callback;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Window callback may not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .locals 10

    new-instance v0, Lh2;

    iget-object v1, p0, Lq0;->c:Ly0;

    iget-object v1, v1, Ly0;->e:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lh2;-><init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V

    iget-object p1, p0, Lq0;->c:Ly0;

    const/4 v1, 0x0

    if-eqz p1, :cond_14

    .line 1
    iget-object v2, p1, Ly0;->o:Ld2;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ld2;->c()V

    :cond_0
    new-instance v2, Lp0;

    invoke-direct {v2, p1, v0}, Lp0;-><init>(Ly0;Lc2;)V

    .line 2
    invoke-virtual {p1}, Ly0;->E()V

    iget-object v3, p1, Ly0;->i:Lp;

    const/16 v4, 0x20

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_3

    .line 3
    check-cast v3, Lj1;

    .line 4
    iget-object v7, v3, Lj1;->i:Li1;

    if-eqz v7, :cond_1

    invoke-virtual {v7}, Li1;->c()V

    :cond_1
    iget-object v7, v3, Lj1;->c:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v7, v6}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    iget-object v7, v3, Lj1;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v7}, Landroidx/appcompat/widget/ActionBarContextView;->h()V

    new-instance v7, Li1;

    iget-object v8, v3, Lj1;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v8}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v7, v3, v8, v2}, Li1;-><init>(Lj1;Landroid/content/Context;Lc2;)V

    .line 5
    iget-object v8, v7, Li1;->e:Lz2;

    invoke-virtual {v8}, Lz2;->z()V

    :try_start_0
    iget-object v8, v7, Li1;->f:Lc2;

    iget-object v9, v7, Li1;->e:Lz2;

    invoke-interface {v8, v7, v9}, Lc2;->d(Ld2;Landroid/view/Menu;)Z

    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v9, v7, Li1;->e:Lz2;

    invoke-virtual {v9}, Lz2;->y()V

    if-eqz v8, :cond_2

    .line 6
    iput-object v7, v3, Lj1;->i:Li1;

    invoke-virtual {v7}, Li1;->i()V

    iget-object v8, v3, Lj1;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v8, v7}, Landroidx/appcompat/widget/ActionBarContextView;->f(Ld2;)V

    invoke-virtual {v3, v5}, Lj1;->e(Z)V

    iget-object v3, v3, Lj1;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    goto :goto_0

    :cond_2
    move-object v7, v1

    .line 7
    :goto_0
    iput-object v7, p1, Ly0;->o:Ld2;

    if-eqz v7, :cond_3

    iget-object v3, p1, Ly0;->h:Ld0;

    if-eqz v3, :cond_3

    invoke-interface {v3, v7}, Ld0;->a(Ld2;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 8
    iget-object v0, v7, Li1;->e:Lz2;

    invoke-virtual {v0}, Lz2;->y()V

    throw p1

    .line 9
    :cond_3
    :goto_1
    iget-object v3, p1, Ly0;->o:Ld2;

    if-nez v3, :cond_12

    .line 10
    invoke-virtual {p1}, Ly0;->x()V

    iget-object v3, p1, Ly0;->o:Ld2;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ld2;->c()V

    :cond_4
    iget-object v3, p1, Ly0;->h:Ld0;

    if-eqz v3, :cond_5

    iget-boolean v7, p1, Ly0;->M:Z

    if-nez v7, :cond_5

    :try_start_1
    invoke-interface {v3, v2}, Ld0;->f(Lc2;)Ld2;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    :cond_5
    move-object v3, v1

    :goto_2
    if-eqz v3, :cond_6

    iput-object v3, p1, Ly0;->o:Ld2;

    goto/16 :goto_8

    :cond_6
    iget-object v3, p1, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    if-nez v3, :cond_b

    iget-boolean v3, p1, Ly0;->D:Z

    if-eqz v3, :cond_8

    new-instance v3, Landroid/util/TypedValue;

    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    iget-object v7, p1, Ly0;->e:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v7

    sget v8, Lf;->actionBarTheme:I

    invoke-virtual {v7, v8, v3, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v8, v3, Landroid/util/TypedValue;->resourceId:I

    if-eqz v8, :cond_7

    iget-object v8, p1, Ly0;->e:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iget v7, v3, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v8, v7, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    new-instance v7, Lf2;

    iget-object v9, p1, Ly0;->e:Landroid/content/Context;

    invoke-direct {v7, v9, v6}, Lf2;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v7}, Lf2;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v9

    invoke-virtual {v9, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    goto :goto_3

    :cond_7
    iget-object v7, p1, Ly0;->e:Landroid/content/Context;

    :goto_3
    new-instance v8, Landroidx/appcompat/widget/ActionBarContextView;

    .line 11
    invoke-direct {v8, v7, v1}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 12
    iput-object v8, p1, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    new-instance v8, Landroid/widget/PopupWindow;

    sget v9, Lf;->actionModePopupWindowStyle:I

    invoke-direct {v8, v7, v1, v9}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v8, p1, Ly0;->q:Landroid/widget/PopupWindow;

    const/4 v9, 0x2

    invoke-static {v8, v9}, Lb1;->r0(Landroid/widget/PopupWindow;I)V

    iget-object v8, p1, Ly0;->q:Landroid/widget/PopupWindow;

    iget-object v9, p1, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v8, v9}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    iget-object v8, p1, Ly0;->q:Landroid/widget/PopupWindow;

    const/4 v9, -0x1

    invoke-virtual {v8, v9}, Landroid/widget/PopupWindow;->setWidth(I)V

    invoke-virtual {v7}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    sget v9, Lf;->actionBarSize:I

    invoke-virtual {v8, v9, v3, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v3, v3, Landroid/util/TypedValue;->data:I

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    invoke-static {v3, v7}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result v3

    iget-object v7, p1, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v7, v3}, Landroidx/appcompat/widget/ActionBarContextView;->setContentHeight(I)V

    iget-object v3, p1, Ly0;->q:Landroid/widget/PopupWindow;

    const/4 v7, -0x2

    invoke-virtual {v3, v7}, Landroid/widget/PopupWindow;->setHeight(I)V

    new-instance v3, Ll0;

    invoke-direct {v3, p1}, Ll0;-><init>(Ly0;)V

    iput-object v3, p1, Ly0;->r:Ljava/lang/Runnable;

    goto :goto_5

    :cond_8
    iget-object v3, p1, Ly0;->v:Landroid/view/ViewGroup;

    sget v7, Lk;->action_mode_bar_stub:I

    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/ViewStubCompat;

    if-eqz v3, :cond_b

    .line 13
    invoke-virtual {p1}, Ly0;->E()V

    iget-object v7, p1, Ly0;->i:Lp;

    if-eqz v7, :cond_9

    .line 14
    invoke-virtual {v7}, Lp;->b()Landroid/content/Context;

    move-result-object v7

    goto :goto_4

    :cond_9
    move-object v7, v1

    :goto_4
    if-nez v7, :cond_a

    iget-object v7, p1, Ly0;->e:Landroid/content/Context;

    .line 15
    :cond_a
    invoke-static {v7}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v7

    invoke-virtual {v3, v7}, Landroidx/appcompat/widget/ViewStubCompat;->setLayoutInflater(Landroid/view/LayoutInflater;)V

    invoke-virtual {v3}, Landroidx/appcompat/widget/ViewStubCompat;->a()Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/ActionBarContextView;

    iput-object v3, p1, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    :cond_b
    :goto_5
    iget-object v3, p1, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v3, :cond_10

    invoke-virtual {p1}, Ly0;->x()V

    iget-object v3, p1, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v3}, Landroidx/appcompat/widget/ActionBarContextView;->h()V

    new-instance v3, Lg2;

    iget-object v7, p1, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v7}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v7

    iget-object v8, p1, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    iget-object v9, p1, Ly0;->q:Landroid/widget/PopupWindow;

    if-nez v9, :cond_c

    goto :goto_6

    :cond_c
    const/4 v5, 0x0

    :goto_6
    invoke-direct {v3, v7, v8, v2, v5}, Lg2;-><init>(Landroid/content/Context;Landroidx/appcompat/widget/ActionBarContextView;Lc2;Z)V

    .line 16
    iget-object v5, v3, Lg2;->i:Lz2;

    .line 17
    invoke-virtual {v2, v3, v5}, Lp0;->d(Ld2;Landroid/view/Menu;)Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-virtual {v3}, Lg2;->i()V

    iget-object v2, p1, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v2, v3}, Landroidx/appcompat/widget/ActionBarContextView;->f(Ld2;)V

    iput-object v3, p1, Ly0;->o:Ld2;

    invoke-virtual {p1}, Ly0;->J()Z

    move-result v2

    const/high16 v3, 0x3f800000    # 1.0f

    if-eqz v2, :cond_d

    iget-object v2, p1, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object v2, p1, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v2}, Lbc;->a(Landroid/view/View;)Lgc;

    move-result-object v2

    invoke-virtual {v2, v3}, Lgc;->a(F)Lgc;

    iput-object v2, p1, Ly0;->s:Lgc;

    new-instance v3, Lm0;

    invoke-direct {v3, p1}, Lm0;-><init>(Ly0;)V

    invoke-virtual {v2, v3}, Lgc;->d(Lhc;)Lgc;

    goto :goto_7

    :cond_d
    iget-object v2, p1, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object v2, p1, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v2, v6}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object v2, p1, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    iget-object v2, p1, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v2, v2, Landroid/view/View;

    if-eqz v2, :cond_e

    iget-object v2, p1, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-static {v2}, Lbc;->p(Landroid/view/View;)V

    :cond_e
    :goto_7
    iget-object v2, p1, Ly0;->q:Landroid/widget/PopupWindow;

    if-eqz v2, :cond_10

    iget-object v2, p1, Ly0;->f:Landroid/view/Window;

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    iget-object v3, p1, Ly0;->r:Ljava/lang/Runnable;

    invoke-virtual {v2, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_8

    :cond_f
    iput-object v1, p1, Ly0;->o:Ld2;

    :cond_10
    :goto_8
    iget-object v2, p1, Ly0;->o:Ld2;

    if-eqz v2, :cond_11

    iget-object v3, p1, Ly0;->h:Ld0;

    if-eqz v3, :cond_11

    invoke-interface {v3, v2}, Ld0;->a(Ld2;)V

    :cond_11
    iget-object v2, p1, Ly0;->o:Ld2;

    .line 18
    iput-object v2, p1, Ly0;->o:Ld2;

    :cond_12
    iget-object p1, p1, Ly0;->o:Ld2;

    if-eqz p1, :cond_13

    .line 19
    invoke-virtual {v0, p1}, Lh2;->e(Ld2;)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1

    :cond_13
    return-object v1

    .line 20
    :cond_14
    throw v1
.end method

.method public dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lq0;->c:Ly0;

    invoke-virtual {v0, p1}, Ly0;->v(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_8

    .line 2
    iget-object v0, p0, Lq0;->c:Ly0;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v3

    .line 3
    invoke-virtual {v0}, Ly0;->E()V

    iget-object v4, v0, Ly0;->i:Lp;

    if-eqz v4, :cond_3

    .line 4
    check-cast v4, Lj1;

    .line 5
    iget-object v4, v4, Lj1;->i:Li1;

    if-nez v4, :cond_0

    goto :goto_1

    .line 6
    :cond_0
    iget-object v4, v4, Li1;->e:Lz2;

    if-eqz v4, :cond_2

    .line 7
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v5

    invoke-static {v5}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result v5

    if-eq v5, v1, :cond_1

    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    invoke-interface {v4, v5}, Landroid/view/Menu;->setQwertyMode(Z)V

    invoke-interface {v4, v3, p1, v2}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result v3

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v3, 0x0

    :goto_2
    if-eqz v3, :cond_3

    goto :goto_3

    .line 8
    :cond_3
    iget-object v3, v0, Ly0;->H:Lw0;

    if-eqz v3, :cond_4

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v4

    invoke-virtual {v0, v3, v4, p1, v1}, Ly0;->H(Lw0;ILandroid/view/KeyEvent;I)Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object p1, v0, Ly0;->H:Lw0;

    if-eqz p1, :cond_5

    iput-boolean v1, p1, Lw0;->l:Z

    goto :goto_3

    :cond_4
    iget-object v3, v0, Ly0;->H:Lw0;

    if-nez v3, :cond_6

    invoke-virtual {v0, v2}, Ly0;->C(I)Lw0;

    move-result-object v3

    invoke-virtual {v0, v3, p1}, Ly0;->I(Lw0;Landroid/view/KeyEvent;)Z

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v4

    invoke-virtual {v0, v3, v4, p1, v1}, Ly0;->H(Lw0;ILandroid/view/KeyEvent;I)Z

    move-result p1

    iput-boolean v2, v3, Lw0;->k:Z

    if-eqz p1, :cond_6

    :cond_5
    :goto_3
    const/4 p1, 0x1

    goto :goto_4

    :cond_6
    const/4 p1, 0x0

    :goto_4
    if-eqz p1, :cond_7

    goto :goto_5

    :cond_7
    const/4 v1, 0x0

    :cond_8
    :goto_5
    return v1
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public dispatchTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchTrackballEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onActionModeFinished(Landroid/view/ActionMode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onActionModeFinished(Landroid/view/ActionMode;)V

    return-void
.end method

.method public onActionModeStarted(Landroid/view/ActionMode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onActionModeStarted(Landroid/view/ActionMode;)V

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onAttachedToWindow()V

    return-void
.end method

.method public onContentChanged()V
    .locals 0

    return-void
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1

    if-nez p1, :cond_0

    instance-of v0, p2, Lz2;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1
    :cond_0
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onCreatePanelView(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onDetachedFromWindow()V

    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onMenuOpened(ILandroid/view/Menu;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 2
    iget-object p2, p0, Lq0;->c:Ly0;

    if-eqz p2, :cond_1

    const/16 v0, 0x6c

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    .line 3
    invoke-virtual {p2}, Ly0;->E()V

    iget-object p1, p2, Ly0;->i:Lp;

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p1, v1}, Lp;->a(Z)V

    :cond_0
    return v1

    :cond_1
    const/4 p1, 0x0

    throw p1
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 2
    iget-object p2, p0, Lq0;->c:Ly0;

    if-eqz p2, :cond_2

    const/4 v0, 0x0

    const/16 v1, 0x6c

    if-ne p1, v1, :cond_0

    .line 3
    invoke-virtual {p2}, Ly0;->E()V

    iget-object p1, p2, Ly0;->i:Lp;

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1, v0}, Lp;->a(Z)V

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    invoke-virtual {p2, p1}, Ly0;->C(I)Lw0;

    move-result-object p1

    iget-boolean v1, p1, Lw0;->m:Z

    if-eqz v1, :cond_1

    invoke-virtual {p2, p1, v0}, Ly0;->u(Lw0;Z)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    const/4 p1, 0x0

    throw p1
.end method

.method public onPointerCaptureChanged(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onPointerCaptureChanged(Z)V

    return-void
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 3

    instance-of v0, p3, Lz2;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lz2;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    if-nez v0, :cond_1

    return v1

    :cond_1
    if-eqz v0, :cond_2

    const/4 v2, 0x1

    .line 1
    iput-boolean v2, v0, Lz2;->y:Z

    .line 2
    :cond_2
    iget-object v2, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v2, p1, p2, p3}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    if-eqz v0, :cond_3

    .line 3
    iput-boolean v1, v0, Lz2;->y:Z

    :cond_3
    return p1
.end method

.method public onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/KeyboardShortcutGroup;",
            ">;",
            "Landroid/view/Menu;",
            "I)V"
        }
    .end annotation

    iget-object v0, p0, Lq0;->c:Ly0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ly0;->C(I)Lw0;

    move-result-object v0

    iget-object v0, v0, Lw0;->h:Lz2;

    if-eqz v0, :cond_0

    .line 1
    iget-object p2, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {p2, p1, v0, p3}, Landroid/view/Window$Callback;->onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2, p3}, Landroid/view/Window$Callback;->onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V

    :goto_0
    return-void
.end method

.method public onSearchRequested()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onSearchRequested()Z

    move-result v0

    return v0
.end method

.method public onSearchRequested(Landroid/view/SearchEvent;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onSearchRequested(Landroid/view/SearchEvent;)Z

    move-result p1

    return p1
.end method

.method public onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V

    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onWindowFocusChanged(Z)V

    return-void
.end method

.method public onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lq0;->c:Ly0;

    .line 1
    iget-boolean v0, v0, Ly0;->t:Z

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0, p1}, Lq0;->a(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1

    .line 3
    :cond_1
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1
.end method

.method public onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
    .locals 1

    iget-object v0, p0, Lq0;->c:Ly0;

    .line 4
    iget-boolean v0, v0, Ly0;->t:Z

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Lq0;->a(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1

    .line 6
    :cond_1
    :goto_0
    iget-object v0, p0, Lq0;->b:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1
.end method
