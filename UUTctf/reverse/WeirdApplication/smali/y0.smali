.class public Ly0;
.super Le0;
.source ""

# interfaces
.implements Lz2$a;
.implements Landroid/view/LayoutInflater$Factory2;


# static fields
.field public static final a0:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final b0:Z

.field public static final c0:[I

.field public static d0:Z

.field public static final e0:Z


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:[Lw0;

.field public H:Lw0;

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:Z

.field public M:Z

.field public N:I

.field public O:I

.field public P:Z

.field public Q:Z

.field public R:Lt0;

.field public S:Lt0;

.field public T:Z

.field public U:I

.field public final V:Ljava/lang/Runnable;

.field public W:Z

.field public X:Landroid/graphics/Rect;

.field public Y:Landroid/graphics/Rect;

.field public Z:Landroidx/appcompat/app/AppCompatViewInflater;

.field public final d:Ljava/lang/Object;

.field public final e:Landroid/content/Context;

.field public f:Landroid/view/Window;

.field public g:Lq0;

.field public final h:Ld0;

.field public i:Lp;

.field public j:Landroid/view/MenuInflater;

.field public k:Ljava/lang/CharSequence;

.field public l:Lr5;

.field public m:Ln0;

.field public n:Lx0;

.field public o:Ld2;

.field public p:Landroidx/appcompat/widget/ActionBarContextView;

.field public q:Landroid/widget/PopupWindow;

.field public r:Ljava/lang/Runnable;

.field public s:Lgc;

.field public t:Z

.field public u:Z

.field public v:Landroid/view/ViewGroup;

.field public w:Landroid/widget/TextView;

.field public x:Landroid/view/View;

.field public y:Z

.field public z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lu7;

    invoke-direct {v0}, Lu7;-><init>()V

    sput-object v0, Ly0;->a0:Ljava/util/Map;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Ly0;->b0:Z

    new-array v0, v3, [I

    const v4, 0x1010054

    aput v4, v0, v2

    sput-object v0, Ly0;->c0:[I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v1, :cond_1

    const/16 v1, 0x19

    if-gt v0, v1, :cond_1

    const/4 v2, 0x1

    :cond_1
    sput-boolean v2, Ly0;->e0:Z

    sget-boolean v0, Ly0;->b0:Z

    if-eqz v0, :cond_2

    sget-boolean v0, Ly0;->d0:Z

    if-nez v0, :cond_2

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    new-instance v1, Lf0;

    invoke-direct {v1, v0}, Lf0;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    invoke-static {v1}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    sput-boolean v3, Ly0;->d0:Z

    :cond_2
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/Window;Ld0;Ljava/lang/Object;)V
    .locals 3

    invoke-direct {p0}, Le0;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Ly0;->s:Lgc;

    const/4 v1, 0x1

    iput-boolean v1, p0, Ly0;->t:Z

    const/16 v1, -0x64

    iput v1, p0, Ly0;->N:I

    new-instance v2, Lg0;

    invoke-direct {v2, p0}, Lg0;-><init>(Ly0;)V

    iput-object v2, p0, Ly0;->V:Ljava/lang/Runnable;

    iput-object p1, p0, Ly0;->e:Landroid/content/Context;

    iput-object p3, p0, Ly0;->h:Ld0;

    iput-object p4, p0, Ly0;->d:Ljava/lang/Object;

    iget p3, p0, Ly0;->N:I

    if-ne p3, v1, :cond_2

    instance-of p3, p4, Landroid/app/Dialog;

    if-eqz p3, :cond_2

    :goto_0
    if-eqz p1, :cond_1

    .line 1
    instance-of p3, p1, Lc0;

    if-eqz p3, :cond_0

    move-object v0, p1

    check-cast v0, Lc0;

    goto :goto_1

    :cond_0
    instance-of p3, p1, Landroid/content/ContextWrapper;

    if-eqz p3, :cond_1

    check-cast p1, Landroid/content/ContextWrapper;

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {v0}, Lc0;->k()Le0;

    move-result-object p1

    check-cast p1, Ly0;

    .line 3
    iget p1, p1, Ly0;->N:I

    .line 4
    iput p1, p0, Ly0;->N:I

    :cond_2
    iget p1, p0, Ly0;->N:I

    if-ne p1, v1, :cond_3

    sget-object p1, Ly0;->a0:Ljava/util/Map;

    iget-object p3, p0, Ly0;->d:Ljava/lang/Object;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    check-cast p1, Lb8;

    invoke-virtual {p1, p3}, Lb8;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Ly0;->N:I

    sget-object p1, Ly0;->a0:Ljava/util/Map;

    iget-object p3, p0, Ly0;->d:Ljava/lang/Object;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    check-cast p1, Lb8;

    invoke-virtual {p1, p3}, Lb8;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    if-eqz p2, :cond_4

    invoke-virtual {p0, p2}, Ly0;->r(Landroid/view/Window;)V

    :cond_4
    invoke-static {}, Lm4;->d()V

    return-void
.end method


# virtual methods
.method public A(Landroid/view/Menu;)Lw0;
    .locals 5

    iget-object v0, p0, Ly0;->G:[Lw0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    array-length v2, v0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-ge v1, v2, :cond_2

    aget-object v3, v0, v1

    if-eqz v3, :cond_1

    iget-object v4, v3, Lw0;->h:Lz2;

    if-ne v4, p1, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final B()Lt0;
    .locals 4

    iget-object v0, p0, Ly0;->R:Lt0;

    if-nez v0, :cond_1

    new-instance v0, Lu0;

    iget-object v1, p0, Ly0;->e:Landroid/content/Context;

    .line 1
    sget-object v2, Le1;->d:Le1;

    if-nez v2, :cond_0

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Le1;

    const-string v3, "location"

    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/location/LocationManager;

    invoke-direct {v2, v1, v3}, Le1;-><init>(Landroid/content/Context;Landroid/location/LocationManager;)V

    sput-object v2, Le1;->d:Le1;

    :cond_0
    sget-object v1, Le1;->d:Le1;

    .line 2
    invoke-direct {v0, p0, v1}, Lu0;-><init>(Ly0;Le1;)V

    iput-object v0, p0, Ly0;->R:Lt0;

    :cond_1
    iget-object v0, p0, Ly0;->R:Lt0;

    return-object v0
.end method

.method public C(I)Lw0;
    .locals 4

    iget-object v0, p0, Ly0;->G:[Lw0;

    if-eqz v0, :cond_0

    array-length v1, v0

    if-gt v1, p1, :cond_2

    :cond_0
    add-int/lit8 v1, p1, 0x1

    new-array v1, v1, [Lw0;

    if-eqz v0, :cond_1

    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    iput-object v1, p0, Ly0;->G:[Lw0;

    move-object v0, v1

    :cond_2
    aget-object v1, v0, p1

    if-nez v1, :cond_3

    new-instance v1, Lw0;

    invoke-direct {v1, p1}, Lw0;-><init>(I)V

    aput-object v1, v0, p1

    :cond_3
    return-object v1
.end method

.method public final D()Landroid/view/Window$Callback;
    .locals 1

    iget-object v0, p0, Ly0;->f:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    return-object v0
.end method

.method public final E()V
    .locals 3

    invoke-virtual {p0}, Ly0;->y()V

    iget-boolean v0, p0, Ly0;->A:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Ly0;->i:Lp;

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Ly0;->d:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_1

    new-instance v0, Lj1;

    iget-object v1, p0, Ly0;->d:Ljava/lang/Object;

    check-cast v1, Landroid/app/Activity;

    iget-boolean v2, p0, Ly0;->B:Z

    invoke-direct {v0, v1, v2}, Lj1;-><init>(Landroid/app/Activity;Z)V

    :goto_0
    iput-object v0, p0, Ly0;->i:Lp;

    goto :goto_1

    :cond_1
    instance-of v0, v0, Landroid/app/Dialog;

    if-eqz v0, :cond_2

    new-instance v0, Lj1;

    iget-object v1, p0, Ly0;->d:Ljava/lang/Object;

    check-cast v1, Landroid/app/Dialog;

    invoke-direct {v0, v1}, Lj1;-><init>(Landroid/app/Dialog;)V

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v0, p0, Ly0;->i:Lp;

    if-eqz v0, :cond_3

    iget-boolean v1, p0, Ly0;->W:Z

    invoke-virtual {v0, v1}, Lp;->c(Z)V

    :cond_3
    :goto_2
    return-void
.end method

.method public final F(I)V
    .locals 2

    iget v0, p0, Ly0;->U:I

    const/4 v1, 0x1

    shl-int p1, v1, p1

    or-int/2addr p1, v0

    iput p1, p0, Ly0;->U:I

    iget-boolean p1, p0, Ly0;->T:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Ly0;->f:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Ly0;->V:Ljava/lang/Runnable;

    invoke-static {p1, v0}, Lbc;->n(Landroid/view/View;Ljava/lang/Runnable;)V

    iput-boolean v1, p0, Ly0;->T:Z

    :cond_0
    return-void
.end method

.method public final G(Lw0;Landroid/view/KeyEvent;)V
    .locals 12

    iget-boolean v0, p1, Lw0;->m:Z

    if-nez v0, :cond_1d

    iget-boolean v0, p0, Ly0;->M:Z

    if-eqz v0, :cond_0

    goto/16 :goto_d

    :cond_0
    iget v0, p1, Lw0;->a:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Ly0;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v0, v0, 0xf

    const/4 v3, 0x4

    if-ne v0, v3, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Ly0;->D()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_3

    iget v3, p1, Lw0;->a:I

    iget-object v4, p1, Lw0;->h:Lz2;

    invoke-interface {v0, v3, v4}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0, p1, v1}, Ly0;->u(Lw0;Z)V

    return-void

    :cond_3
    iget-object v0, p0, Ly0;->e:Landroid/content/Context;

    const-string v3, "window"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    if-nez v0, :cond_4

    return-void

    :cond_4
    invoke-virtual {p0, p1, p2}, Ly0;->I(Lw0;Landroid/view/KeyEvent;)Z

    move-result p2

    if-nez p2, :cond_5

    return-void

    :cond_5
    iget-object p2, p1, Lw0;->e:Landroid/view/ViewGroup;

    const/4 v3, -0x2

    const/4 v4, -0x1

    if-eqz p2, :cond_7

    iget-boolean p2, p1, Lw0;->o:Z

    if-eqz p2, :cond_6

    goto :goto_1

    :cond_6
    iget-object p2, p1, Lw0;->g:Landroid/view/View;

    if-eqz p2, :cond_1c

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    if-eqz p2, :cond_1c

    iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-ne p2, v4, :cond_1c

    const/4 v5, -0x1

    goto/16 :goto_c

    :cond_7
    :goto_1
    iget-object p2, p1, Lw0;->e:Landroid/view/ViewGroup;

    const/4 v4, 0x0

    if-nez p2, :cond_c

    .line 1
    invoke-virtual {p0}, Ly0;->E()V

    iget-object p2, p0, Ly0;->i:Lp;

    if-eqz p2, :cond_8

    .line 2
    invoke-virtual {p2}, Lp;->b()Landroid/content/Context;

    move-result-object p2

    goto :goto_2

    :cond_8
    move-object p2, v4

    :goto_2
    if-nez p2, :cond_9

    iget-object p2, p0, Ly0;->e:Landroid/content/Context;

    .line 3
    :cond_9
    new-instance v5, Landroid/util/TypedValue;

    invoke-direct {v5}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    invoke-virtual {p2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    sget v7, Lf;->actionBarPopupTheme:I

    invoke-virtual {v6, v7, v5, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v7, v5, Landroid/util/TypedValue;->resourceId:I

    if-eqz v7, :cond_a

    invoke-virtual {v6, v7, v1}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_a
    sget v7, Lf;->panelMenuListTheme:I

    invoke-virtual {v6, v7, v5, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v5, v5, Landroid/util/TypedValue;->resourceId:I

    if-eqz v5, :cond_b

    goto :goto_3

    :cond_b
    sget v5, Ln;->Theme_AppCompat_CompactMenu:I

    :goto_3
    invoke-virtual {v6, v5, v1}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    new-instance v5, Lf2;

    invoke-direct {v5, p2, v2}, Lf2;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v5}, Lf2;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p2

    invoke-virtual {p2, v6}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iput-object v5, p1, Lw0;->j:Landroid/content/Context;

    sget-object p2, Lo;->AppCompatTheme:[I

    invoke-virtual {v5, p2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p2

    sget v5, Lo;->AppCompatTheme_panelBackground:I

    invoke-virtual {p2, v5, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    iput v5, p1, Lw0;->b:I

    sget v5, Lo;->AppCompatTheme_android_windowAnimationStyle:I

    invoke-virtual {p2, v5, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    iput v5, p1, Lw0;->d:I

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 4
    new-instance p2, Lv0;

    iget-object v5, p1, Lw0;->j:Landroid/content/Context;

    invoke-direct {p2, p0, v5}, Lv0;-><init>(Ly0;Landroid/content/Context;)V

    iput-object p2, p1, Lw0;->e:Landroid/view/ViewGroup;

    const/16 p2, 0x51

    iput p2, p1, Lw0;->c:I

    goto :goto_4

    .line 5
    :cond_c
    iget-boolean v5, p1, Lw0;->o:Z

    if-eqz v5, :cond_d

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-lez p2, :cond_d

    iget-object p2, p1, Lw0;->e:Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 6
    :cond_d
    :goto_4
    iget-object p2, p1, Lw0;->g:Landroid/view/View;

    if-eqz p2, :cond_e

    iput-object p2, p1, Lw0;->f:Landroid/view/View;

    goto :goto_6

    :cond_e
    iget-object p2, p1, Lw0;->h:Lz2;

    if-nez p2, :cond_f

    goto :goto_7

    :cond_f
    iget-object p2, p0, Ly0;->n:Lx0;

    if-nez p2, :cond_10

    new-instance p2, Lx0;

    invoke-direct {p2, p0}, Lx0;-><init>(Ly0;)V

    iput-object p2, p0, Ly0;->n:Lx0;

    :cond_10
    iget-object p2, p0, Ly0;->n:Lx0;

    .line 7
    iget-object v5, p1, Lw0;->h:Lz2;

    if-nez v5, :cond_11

    goto :goto_5

    :cond_11
    iget-object v4, p1, Lw0;->i:Lx2;

    if-nez v4, :cond_12

    new-instance v4, Lx2;

    iget-object v5, p1, Lw0;->j:Landroid/content/Context;

    sget v6, Ll;->abc_list_menu_item_layout:I

    invoke-direct {v4, v5, v6}, Lx2;-><init>(Landroid/content/Context;I)V

    iput-object v4, p1, Lw0;->i:Lx2;

    .line 8
    iput-object p2, v4, Lx2;->i:Lm3$a;

    .line 9
    iget-object p2, p1, Lw0;->h:Lz2;

    .line 10
    iget-object v5, p2, Lz2;->a:Landroid/content/Context;

    invoke-virtual {p2, v4, v5}, Lz2;->b(Lm3;Landroid/content/Context;)V

    .line 11
    :cond_12
    iget-object p2, p1, Lw0;->i:Lx2;

    iget-object v4, p1, Lw0;->e:Landroid/view/ViewGroup;

    .line 12
    iget-object v5, p2, Lx2;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    if-nez v5, :cond_14

    iget-object v5, p2, Lx2;->c:Landroid/view/LayoutInflater;

    sget v6, Ll;->abc_expanded_menu_layout:I

    invoke-virtual {v5, v6, v4, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroidx/appcompat/view/menu/ExpandedMenuView;

    iput-object v4, p2, Lx2;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    iget-object v4, p2, Lx2;->j:Lw2;

    if-nez v4, :cond_13

    new-instance v4, Lw2;

    invoke-direct {v4, p2}, Lw2;-><init>(Lx2;)V

    iput-object v4, p2, Lx2;->j:Lw2;

    :cond_13
    iget-object v4, p2, Lx2;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    iget-object v5, p2, Lx2;->j:Lw2;

    invoke-virtual {v4, v5}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v4, p2, Lx2;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    invoke-virtual {v4, p2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    :cond_14
    iget-object v4, p2, Lx2;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 13
    :goto_5
    iput-object v4, p1, Lw0;->f:Landroid/view/View;

    if-eqz v4, :cond_15

    :goto_6
    const/4 p2, 0x1

    goto :goto_8

    :cond_15
    :goto_7
    const/4 p2, 0x0

    :goto_8
    if-eqz p2, :cond_1d

    .line 14
    iget-object p2, p1, Lw0;->f:Landroid/view/View;

    if-nez p2, :cond_16

    goto :goto_a

    :cond_16
    iget-object p2, p1, Lw0;->g:Landroid/view/View;

    if-eqz p2, :cond_17

    goto :goto_9

    :cond_17
    iget-object p2, p1, Lw0;->i:Lx2;

    invoke-virtual {p2}, Lx2;->a()Landroid/widget/ListAdapter;

    move-result-object p2

    check-cast p2, Lw2;

    invoke-virtual {p2}, Lw2;->getCount()I

    move-result p2

    if-lez p2, :cond_18

    :goto_9
    const/4 p2, 0x1

    goto :goto_b

    :cond_18
    :goto_a
    const/4 p2, 0x0

    :goto_b
    if-nez p2, :cond_19

    goto :goto_d

    .line 15
    :cond_19
    iget-object p2, p1, Lw0;->f:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    if-nez p2, :cond_1a

    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {p2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    :cond_1a
    iget v4, p1, Lw0;->b:I

    iget-object v5, p1, Lw0;->e:Landroid/view/ViewGroup;

    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    iget-object v4, p1, Lw0;->f:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    instance-of v5, v4, Landroid/view/ViewGroup;

    if-eqz v5, :cond_1b

    check-cast v4, Landroid/view/ViewGroup;

    iget-object v5, p1, Lw0;->f:Landroid/view/View;

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1b
    iget-object v4, p1, Lw0;->e:Landroid/view/ViewGroup;

    iget-object v5, p1, Lw0;->f:Landroid/view/View;

    invoke-virtual {v4, v5, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p2, p1, Lw0;->f:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->hasFocus()Z

    move-result p2

    if-nez p2, :cond_1c

    iget-object p2, p1, Lw0;->f:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    :cond_1c
    const/4 v5, -0x2

    :goto_c
    iput-boolean v2, p1, Lw0;->l:Z

    new-instance p2, Landroid/view/WindowManager$LayoutParams;

    const/4 v6, -0x2

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x3ea

    const/high16 v10, 0x820000

    const/4 v11, -0x3

    move-object v4, p2

    invoke-direct/range {v4 .. v11}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V

    iget v2, p1, Lw0;->c:I

    iput v2, p2, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iget v2, p1, Lw0;->d:I

    iput v2, p2, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    iget-object v2, p1, Lw0;->e:Landroid/view/ViewGroup;

    invoke-interface {v0, v2, p2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iput-boolean v1, p1, Lw0;->m:Z

    :cond_1d
    :goto_d
    return-void
.end method

.method public final H(Lw0;ILandroid/view/KeyEvent;I)Z
    .locals 2

    invoke-virtual {p3}, Landroid/view/KeyEvent;->isSystem()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p1, Lw0;->k:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p1, p3}, Ly0;->I(Lw0;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p1, Lw0;->h:Lz2;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p2, p3, p4}, Lz2;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result v1

    :cond_2
    if-eqz v1, :cond_3

    const/4 p2, 0x1

    and-int/lit8 p3, p4, 0x1

    if-nez p3, :cond_3

    iget-object p3, p0, Ly0;->l:Lr5;

    if-nez p3, :cond_3

    invoke-virtual {p0, p1, p2}, Ly0;->u(Lw0;Z)V

    :cond_3
    return v1
.end method

.method public final I(Lw0;Landroid/view/KeyEvent;)Z
    .locals 10

    iget-boolean v0, p0, Ly0;->M:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p1, Lw0;->k:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    :cond_1
    iget-object v0, p0, Ly0;->H:Lw0;

    if-eqz v0, :cond_2

    if-eq v0, p1, :cond_2

    invoke-virtual {p0, v0, v1}, Ly0;->u(Lw0;Z)V

    :cond_2
    invoke-virtual {p0}, Ly0;->D()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_3

    iget v3, p1, Lw0;->a:I

    invoke-interface {v0, v3}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, p1, Lw0;->g:Landroid/view/View;

    :cond_3
    iget v3, p1, Lw0;->a:I

    const/16 v4, 0x6c

    if-eqz v3, :cond_5

    if-ne v3, v4, :cond_4

    goto :goto_0

    :cond_4
    const/4 v3, 0x0

    goto :goto_1

    :cond_5
    :goto_0
    const/4 v3, 0x1

    :goto_1
    if-eqz v3, :cond_6

    iget-object v5, p0, Ly0;->l:Lr5;

    if-eqz v5, :cond_6

    check-cast v5, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 1
    invoke-virtual {v5}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->n()V

    iget-object v5, v5, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Ls5;

    check-cast v5, Lf7;

    .line 2
    iput-boolean v2, v5, Lf7;->m:Z

    .line 3
    :cond_6
    iget-object v5, p1, Lw0;->g:Landroid/view/View;

    if-nez v5, :cond_18

    iget-object v5, p1, Lw0;->h:Lz2;

    const/4 v6, 0x0

    if-eqz v5, :cond_7

    iget-boolean v5, p1, Lw0;->p:Z

    if-eqz v5, :cond_12

    :cond_7
    iget-object v5, p1, Lw0;->h:Lz2;

    if-nez v5, :cond_d

    .line 4
    iget-object v5, p0, Ly0;->e:Landroid/content/Context;

    iget v7, p1, Lw0;->a:I

    if-eqz v7, :cond_8

    if-ne v7, v4, :cond_c

    :cond_8
    iget-object v4, p0, Ly0;->l:Lr5;

    if-eqz v4, :cond_c

    new-instance v4, Landroid/util/TypedValue;

    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v5}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v7

    sget v8, Lf;->actionBarTheme:I

    invoke-virtual {v7, v8, v4, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v8, v4, Landroid/util/TypedValue;->resourceId:I

    if-eqz v8, :cond_9

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iget v9, v4, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v8, v9, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    sget v9, Lf;->actionBarWidgetTheme:I

    invoke-virtual {v8, v9, v4, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    goto :goto_2

    :cond_9
    sget v8, Lf;->actionBarWidgetTheme:I

    invoke-virtual {v7, v8, v4, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-object v8, v6

    :goto_2
    iget v9, v4, Landroid/util/TypedValue;->resourceId:I

    if-eqz v9, :cond_b

    if-nez v8, :cond_a

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    :cond_a
    iget v4, v4, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v8, v4, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_b
    if-eqz v8, :cond_c

    new-instance v4, Lf2;

    invoke-direct {v4, v5, v1}, Lf2;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4}, Lf2;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    invoke-virtual {v5, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    move-object v5, v4

    :cond_c
    new-instance v4, Lz2;

    invoke-direct {v4, v5}, Lz2;-><init>(Landroid/content/Context;)V

    .line 5
    iput-object p0, v4, Lz2;->e:Lz2$a;

    .line 6
    invoke-virtual {p1, v4}, Lw0;->a(Lz2;)V

    .line 7
    iget-object v4, p1, Lw0;->h:Lz2;

    if-nez v4, :cond_d

    return v1

    :cond_d
    if-eqz v3, :cond_f

    iget-object v4, p0, Ly0;->l:Lr5;

    if-eqz v4, :cond_f

    iget-object v4, p0, Ly0;->m:Ln0;

    if-nez v4, :cond_e

    new-instance v4, Ln0;

    invoke-direct {v4, p0}, Ln0;-><init>(Ly0;)V

    iput-object v4, p0, Ly0;->m:Ln0;

    :cond_e
    iget-object v4, p0, Ly0;->l:Lr5;

    iget-object v5, p1, Lw0;->h:Lz2;

    iget-object v7, p0, Ly0;->m:Ln0;

    check-cast v4, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v4, v5, v7}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->o(Landroid/view/Menu;Lm3$a;)V

    :cond_f
    iget-object v4, p1, Lw0;->h:Lz2;

    invoke-virtual {v4}, Lz2;->z()V

    iget v4, p1, Lw0;->a:I

    iget-object v5, p1, Lw0;->h:Lz2;

    invoke-interface {v0, v4, v5}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v4

    if-nez v4, :cond_11

    invoke-virtual {p1, v6}, Lw0;->a(Lz2;)V

    if-eqz v3, :cond_10

    iget-object p1, p0, Ly0;->l:Lr5;

    if-eqz p1, :cond_10

    iget-object p2, p0, Ly0;->m:Ln0;

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1, v6, p2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->o(Landroid/view/Menu;Lm3$a;)V

    :cond_10
    return v1

    :cond_11
    iput-boolean v1, p1, Lw0;->p:Z

    :cond_12
    iget-object v4, p1, Lw0;->h:Lz2;

    invoke-virtual {v4}, Lz2;->z()V

    iget-object v4, p1, Lw0;->q:Landroid/os/Bundle;

    if-eqz v4, :cond_13

    iget-object v5, p1, Lw0;->h:Lz2;

    invoke-virtual {v5, v4}, Lz2;->v(Landroid/os/Bundle;)V

    iput-object v6, p1, Lw0;->q:Landroid/os/Bundle;

    :cond_13
    iget-object v4, p1, Lw0;->g:Landroid/view/View;

    iget-object v5, p1, Lw0;->h:Lz2;

    invoke-interface {v0, v1, v4, v5}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_15

    if-eqz v3, :cond_14

    iget-object p2, p0, Ly0;->l:Lr5;

    if-eqz p2, :cond_14

    iget-object v0, p0, Ly0;->m:Ln0;

    check-cast p2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p2, v6, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->o(Landroid/view/Menu;Lm3$a;)V

    :cond_14
    iget-object p1, p1, Lw0;->h:Lz2;

    invoke-virtual {p1}, Lz2;->y()V

    return v1

    :cond_15
    if-eqz p2, :cond_16

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result p2

    goto :goto_3

    :cond_16
    const/4 p2, -0x1

    :goto_3
    invoke-static {p2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result p2

    if-eq p2, v2, :cond_17

    const/4 p2, 0x1

    goto :goto_4

    :cond_17
    const/4 p2, 0x0

    :goto_4
    iput-boolean p2, p1, Lw0;->n:Z

    iget-object v0, p1, Lw0;->h:Lz2;

    invoke-virtual {v0, p2}, Lz2;->setQwertyMode(Z)V

    iget-object p2, p1, Lw0;->h:Lz2;

    invoke-virtual {p2}, Lz2;->y()V

    :cond_18
    iput-boolean v2, p1, Lw0;->k:Z

    iput-boolean v1, p1, Lw0;->l:Z

    iput-object p1, p0, Ly0;->H:Lw0;

    return v2
.end method

.method public final J()Z
    .locals 1

    iget-boolean v0, p0, Ly0;->u:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly0;->v:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lbc;->j(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final K()V
    .locals 2

    iget-boolean v0, p0, Ly0;->u:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    const-string v1, "Window feature must be requested before adding content"

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public L(I)I
    .locals 8

    iget-object v0, p0, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_9

    iget-object v0, p0, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v2, p0, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->isShown()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_7

    iget-object v2, p0, Ly0;->X:Landroid/graphics/Rect;

    if-nez v2, :cond_0

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, p0, Ly0;->X:Landroid/graphics/Rect;

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, p0, Ly0;->Y:Landroid/graphics/Rect;

    :cond_0
    iget-object v2, p0, Ly0;->X:Landroid/graphics/Rect;

    iget-object v4, p0, Ly0;->Y:Landroid/graphics/Rect;

    invoke-virtual {v2, v1, p1, v1, v1}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v5, p0, Ly0;->v:Landroid/view/ViewGroup;

    invoke-static {v5, v2, v4}, Ll7;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    iget v2, v4, Landroid/graphics/Rect;->top:I

    if-nez v2, :cond_1

    move v2, p1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eq v4, v2, :cond_4

    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget-object v2, p0, Ly0;->x:Landroid/view/View;

    if-nez v2, :cond_2

    new-instance v2, Landroid/view/View;

    iget-object v4, p0, Ly0;->e:Landroid/content/Context;

    invoke-direct {v2, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Ly0;->x:Landroid/view/View;

    iget-object v4, p0, Ly0;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lh;->abc_input_method_navigation_guard:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v2, p0, Ly0;->v:Landroid/view/ViewGroup;

    iget-object v4, p0, Ly0;->x:Landroid/view/View;

    new-instance v5, Landroid/view/ViewGroup$LayoutParams;

    const/4 v6, -0x1

    invoke-direct {v5, v6, p1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v4, v6, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iget v4, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-eq v4, p1, :cond_3

    iput p1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v4, p0, Ly0;->x:Landroid/view/View;

    invoke-virtual {v4, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_3
    :goto_1
    const/4 v2, 0x1

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    :goto_2
    iget-object v4, p0, Ly0;->x:Landroid/view/View;

    if-eqz v4, :cond_5

    goto :goto_3

    :cond_5
    const/4 v3, 0x0

    :goto_3
    iget-boolean v4, p0, Ly0;->C:Z

    if-nez v4, :cond_6

    if-eqz v3, :cond_6

    const/4 p1, 0x0

    :cond_6
    move v7, v3

    move v3, v2

    move v2, v7

    goto :goto_4

    :cond_7
    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eqz v2, :cond_8

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    const/4 v2, 0x0

    goto :goto_4

    :cond_8
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_4
    if-eqz v3, :cond_a

    iget-object v3, p0, Ly0;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_5

    :cond_9
    const/4 v2, 0x0

    :cond_a
    :goto_5
    iget-object v0, p0, Ly0;->x:Landroid/view/View;

    if-eqz v0, :cond_c

    if-eqz v2, :cond_b

    goto :goto_6

    :cond_b
    const/16 v1, 0x8

    :goto_6
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_c
    return p1
.end method

.method public a(Lz2;)V
    .locals 5

    .line 1
    iget-object p1, p0, Ly0;->l:Lr5;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_7

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->h()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Ly0;->e:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Ly0;->l:Lr5;

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 2
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->n()V

    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Ls5;

    check-cast p1, Lf7;

    .line 3
    iget-object p1, p1, Lf7;->a:Landroidx/appcompat/widget/Toolbar;

    .line 4
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz p1, :cond_3

    .line 5
    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->u:Le4;

    if-eqz p1, :cond_2

    .line 6
    iget-object v2, p1, Le4;->w:Lz3;

    if-nez v2, :cond_1

    invoke-virtual {p1}, Le4;->m()Z

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
    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    if-eqz p1, :cond_3

    const/4 p1, 0x1

    goto :goto_3

    :cond_3
    const/4 p1, 0x0

    :goto_3
    if-eqz p1, :cond_7

    .line 7
    :cond_4
    invoke-virtual {p0}, Ly0;->D()Landroid/view/Window$Callback;

    move-result-object p1

    iget-object v2, p0, Ly0;->l:Lr5;

    check-cast v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m()Z

    move-result v2

    const/16 v3, 0x6c

    if-eqz v2, :cond_5

    iget-object v1, p0, Ly0;->l:Lr5;

    check-cast v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()Z

    iget-boolean v1, p0, Ly0;->M:Z

    if-nez v1, :cond_8

    invoke-virtual {p0, v0}, Ly0;->C(I)Lw0;

    move-result-object v0

    iget-object v0, v0, Lw0;->h:Lz2;

    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    goto :goto_4

    :cond_5
    if-eqz p1, :cond_8

    iget-boolean v2, p0, Ly0;->M:Z

    if-nez v2, :cond_8

    iget-boolean v2, p0, Ly0;->T:Z

    if-eqz v2, :cond_6

    iget v2, p0, Ly0;->U:I

    and-int/2addr v1, v2

    if-eqz v1, :cond_6

    iget-object v1, p0, Ly0;->f:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Ly0;->V:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v1, p0, Ly0;->V:Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    :cond_6
    invoke-virtual {p0, v0}, Ly0;->C(I)Lw0;

    move-result-object v1

    iget-object v2, v1, Lw0;->h:Lz2;

    if-eqz v2, :cond_8

    iget-boolean v4, v1, Lw0;->p:Z

    if-nez v4, :cond_8

    iget-object v4, v1, Lw0;->g:Landroid/view/View;

    invoke-interface {p1, v0, v4, v2}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, v1, Lw0;->h:Lz2;

    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    iget-object p1, p0, Ly0;->l:Lr5;

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 8
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->n()V

    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Ls5;

    check-cast p1, Lf7;

    .line 9
    iget-object p1, p1, Lf7;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->u()Z

    goto :goto_4

    .line 10
    :cond_7
    invoke-virtual {p0, v0}, Ly0;->C(I)Lw0;

    move-result-object p1

    iput-boolean v1, p1, Lw0;->o:Z

    invoke-virtual {p0, p1, v0}, Ly0;->u(Lw0;Z)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ly0;->G(Lw0;Landroid/view/KeyEvent;)V

    :cond_8
    :goto_4
    return-void
.end method

.method public b(Lz2;Landroid/view/MenuItem;)Z
    .locals 2

    invoke-virtual {p0}, Ly0;->D()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Ly0;->M:Z

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lz2;->k()Lz2;

    move-result-object p1

    invoke-virtual {p0, p1}, Ly0;->A(Landroid/view/Menu;)Lw0;

    move-result-object p1

    if-eqz p1, :cond_0

    iget p1, p1, Lw0;->a:I

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public c(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    invoke-virtual {p0}, Ly0;->y()V

    iget-object v0, p0, Ly0;->v:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Ly0;->g:Lq0;

    .line 1
    iget-object p1, p1, Lq0;->b:Landroid/view/Window$Callback;

    .line 2
    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V

    return-void
.end method

.method public f()V
    .locals 3

    iget-object v0, p0, Ly0;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v1

    if-nez v1, :cond_1

    .line 1
    invoke-virtual {v0, p0}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-ge v1, v2, :cond_2

    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v1

    instance-of v2, v1, Landroid/view/LayoutInflater$Factory2;

    if-eqz v2, :cond_0

    check-cast v1, Landroid/view/LayoutInflater$Factory2;

    invoke-static {v0, v1}, Lb1;->u(Landroid/view/LayoutInflater;Landroid/view/LayoutInflater$Factory2;)V

    goto :goto_0

    :cond_0
    invoke-static {v0, p0}, Lb1;->u(Landroid/view/LayoutInflater;Landroid/view/LayoutInflater$Factory2;)V

    goto :goto_0

    .line 2
    :cond_1
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    move-result-object v0

    instance-of v0, v0, Ly0;

    if-nez v0, :cond_2

    const-string v0, "AppCompatDelegate"

    const-string v1, "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    :goto_0
    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly0;->E()V

    iget-object v0, p0, Ly0;->i:Lp;

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ly0;->F(I)V

    return-void
.end method

.method public h(Landroid/os/Bundle;)V
    .locals 3

    const/4 p1, 0x1

    iput-boolean p1, p0, Ly0;->J:Z

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ly0;->q(Z)Z

    invoke-virtual {p0}, Ly0;->z()V

    iget-object v0, p0, Ly0;->d:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    :try_start_0
    check-cast v0, Landroid/app/Activity;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1
    :try_start_1
    invoke-virtual {v0}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v2

    invoke-static {v0, v2}, Lb1;->J(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    nop

    :goto_0
    if-eqz v1, :cond_1

    .line 2
    iget-object v0, p0, Ly0;->i:Lp;

    if-nez v0, :cond_0

    .line 3
    iput-boolean p1, p0, Ly0;->W:Z

    goto :goto_1

    :cond_0
    invoke-virtual {v0, p1}, Lp;->c(Z)V

    :cond_1
    :goto_1
    iput-boolean p1, p0, Ly0;->K:Z

    return-void
.end method

.method public i()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly0;->L:Z

    .line 1
    sget-object v1, Le0;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-static {p0}, Le0;->j(Le0;)V

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    invoke-virtual {p0}, Ly0;->E()V

    iget-object v1, p0, Ly0;->i:Lp;

    if-eqz v1, :cond_0

    .line 3
    check-cast v1, Lj1;

    .line 4
    iput-boolean v0, v1, Lj1;->v:Z

    iget-object v0, v1, Lj1;->u:Ln2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln2;->a()V

    .line 5
    :cond_0
    iget-object v0, p0, Ly0;->d:Ljava/lang/Object;

    instance-of v0, v0, Landroid/app/Dialog;

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Ly0;->R:Lt0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lt0;->a()V

    :cond_1
    iget-object v0, p0, Ly0;->S:Lt0;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lt0;->a()V

    :cond_2
    return-void

    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public k(I)Z
    .locals 5

    const-string v0, "AppCompatDelegate"

    const/16 v1, 0x8

    const/16 v2, 0x6d

    const/16 v3, 0x6c

    if-ne p1, v1, :cond_0

    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."

    .line 1
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/16 p1, 0x6c

    goto :goto_0

    :cond_0
    const/16 v1, 0x9

    if-ne p1, v1, :cond_1

    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/16 p1, 0x6d

    .line 2
    :cond_1
    :goto_0
    iget-boolean v0, p0, Ly0;->E:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    if-ne p1, v3, :cond_2

    return v1

    :cond_2
    iget-boolean v0, p0, Ly0;->A:Z

    const/4 v4, 0x1

    if-eqz v0, :cond_3

    if-ne p1, v4, :cond_3

    iput-boolean v1, p0, Ly0;->A:Z

    :cond_3
    if-eq p1, v4, :cond_9

    const/4 v0, 0x2

    if-eq p1, v0, :cond_8

    const/4 v0, 0x5

    if-eq p1, v0, :cond_7

    const/16 v0, 0xa

    if-eq p1, v0, :cond_6

    if-eq p1, v3, :cond_5

    if-eq p1, v2, :cond_4

    iget-object v0, p0, Ly0;->f:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->requestFeature(I)Z

    move-result p1

    return p1

    :cond_4
    invoke-virtual {p0}, Ly0;->K()V

    iput-boolean v4, p0, Ly0;->B:Z

    return v4

    :cond_5
    invoke-virtual {p0}, Ly0;->K()V

    iput-boolean v4, p0, Ly0;->A:Z

    return v4

    :cond_6
    invoke-virtual {p0}, Ly0;->K()V

    iput-boolean v4, p0, Ly0;->C:Z

    return v4

    :cond_7
    invoke-virtual {p0}, Ly0;->K()V

    iput-boolean v4, p0, Ly0;->z:Z

    return v4

    :cond_8
    invoke-virtual {p0}, Ly0;->K()V

    iput-boolean v4, p0, Ly0;->y:Z

    return v4

    :cond_9
    invoke-virtual {p0}, Ly0;->K()V

    iput-boolean v4, p0, Ly0;->E:Z

    return v4
.end method

.method public l(I)V
    .locals 2

    invoke-virtual {p0}, Ly0;->y()V

    iget-object v0, p0, Ly0;->v:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v1, p0, Ly0;->e:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    iget-object p1, p0, Ly0;->g:Lq0;

    .line 1
    iget-object p1, p1, Lq0;->b:Landroid/view/Window$Callback;

    .line 2
    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V

    return-void
.end method

.method public m(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, Ly0;->y()V

    iget-object v0, p0, Ly0;->v:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, p0, Ly0;->g:Lq0;

    .line 1
    iget-object p1, p1, Lq0;->b:Landroid/view/Window$Callback;

    .line 2
    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V

    return-void
.end method

.method public n(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    invoke-virtual {p0}, Ly0;->y()V

    iget-object v0, p0, Ly0;->v:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Ly0;->g:Lq0;

    .line 1
    iget-object p1, p1, Lq0;->b:Landroid/view/Window$Callback;

    .line 2
    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V

    return-void
.end method

.method public final o(Ljava/lang/CharSequence;)V
    .locals 1

    iput-object p1, p0, Ly0;->k:Ljava/lang/CharSequence;

    iget-object v0, p0, Ly0;->l:Lr5;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lr5;->setWindowTitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1
    :cond_0
    iget-object v0, p0, Ly0;->i:Lp;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0, p1}, Lp;->d(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ly0;->w:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 8

    .line 1
    iget-object v0, p0, Ly0;->Z:Landroidx/appcompat/app/AppCompatViewInflater;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Ly0;->e:Landroid/content/Context;

    sget-object v2, Lo;->AppCompatTheme:[I

    invoke-virtual {v0, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v2, Lo;->AppCompatTheme_viewInflaterClass:I

    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-class v2, Landroidx/appcompat/app/AppCompatViewInflater;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/app/AppCompatViewInflater;

    iput-object v2, p0, Ly0;->Z:Landroidx/appcompat/app/AppCompatViewInflater;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to instantiate custom view inflater "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". Falling back to default."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "AppCompatDelegate"

    invoke-static {v3, v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance v0, Landroidx/appcompat/app/AppCompatViewInflater;

    invoke-direct {v0}, Landroidx/appcompat/app/AppCompatViewInflater;-><init>()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, Landroidx/appcompat/app/AppCompatViewInflater;

    invoke-direct {v0}, Landroidx/appcompat/app/AppCompatViewInflater;-><init>()V

    :goto_1
    iput-object v0, p0, Ly0;->Z:Landroidx/appcompat/app/AppCompatViewInflater;

    :cond_2
    :goto_2
    sget-boolean v0, Ly0;->b0:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_7

    instance-of v0, p4, Lorg/xmlpull/v1/XmlPullParser;

    if-eqz v0, :cond_3

    move-object v0, p4

    check-cast v0, Lorg/xmlpull/v1/XmlPullParser;

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-le v0, v2, :cond_7

    goto :goto_4

    :cond_3
    move-object v0, p1

    check-cast v0, Landroid/view/ViewParent;

    if-nez v0, :cond_4

    goto :goto_5

    .line 2
    :cond_4
    iget-object v3, p0, Ly0;->f:Landroid/view/Window;

    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v3

    :goto_3
    if-nez v0, :cond_5

    :goto_4
    const/4 v0, 0x1

    goto :goto_6

    :cond_5
    if-eq v0, v3, :cond_7

    instance-of v4, v0, Landroid/view/View;

    if-eqz v4, :cond_7

    move-object v4, v0

    check-cast v4, Landroid/view/View;

    invoke-static {v4}, Lbc;->i(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_5

    :cond_6
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_3

    :cond_7
    :goto_5
    const/4 v0, 0x0

    .line 3
    :goto_6
    iget-object v3, p0, Ly0;->Z:Landroidx/appcompat/app/AppCompatViewInflater;

    sget-boolean v4, Ly0;->b0:Z

    invoke-static {}, Lk7;->a()Z

    const/4 v5, 0x0

    if-eqz v3, :cond_16

    if-eqz v0, :cond_8

    if-eqz p1, :cond_8

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    goto :goto_7

    :cond_8
    move-object p1, p3

    .line 5
    :goto_7
    sget-object v0, Lo;->View:[I

    invoke-virtual {p1, p4, v0, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    if-eqz v4, :cond_9

    sget v4, Lo;->View_android_theme:I

    invoke-virtual {v0, v4, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    goto :goto_8

    :cond_9
    const/4 v4, 0x0

    :goto_8
    if-nez v4, :cond_a

    sget v4, Lo;->View_theme:I

    invoke-virtual {v0, v4, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    if-eqz v4, :cond_a

    const-string v6, "AppCompatViewInflater"

    const-string v7, "app:theme is now deprecated. Please move to using android:theme instead."

    invoke-static {v6, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_a
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v4, :cond_c

    instance-of v0, p1, Lf2;

    if-eqz v0, :cond_b

    move-object v0, p1

    check-cast v0, Lf2;

    .line 6
    iget v0, v0, Lf2;->a:I

    if-eq v0, v4, :cond_c

    .line 7
    :cond_b
    new-instance v0, Lf2;

    invoke-direct {v0, p1, v4}, Lf2;-><init>(Landroid/content/Context;I)V

    move-object p1, v0

    .line 8
    :cond_c
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v4, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_9

    :sswitch_0
    const-string v0, "Button"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    const/4 v0, 0x2

    goto/16 :goto_a

    :sswitch_1
    const-string v0, "EditText"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    const/4 v0, 0x3

    goto/16 :goto_a

    :sswitch_2
    const-string v0, "CheckBox"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    const/4 v0, 0x6

    goto/16 :goto_a

    :sswitch_3
    const-string v0, "AutoCompleteTextView"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    const/16 v0, 0x9

    goto/16 :goto_a

    :sswitch_4
    const-string v0, "ImageView"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    const/4 v0, 0x1

    goto :goto_a

    :sswitch_5
    const-string v0, "ToggleButton"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    const/16 v0, 0xd

    goto :goto_a

    :sswitch_6
    const-string v0, "RadioButton"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    const/4 v0, 0x7

    goto :goto_a

    :sswitch_7
    const-string v0, "Spinner"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    const/4 v0, 0x4

    goto :goto_a

    :sswitch_8
    const-string v0, "SeekBar"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    const/16 v0, 0xc

    goto :goto_a

    :sswitch_9
    const-string v0, "ImageButton"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    const/4 v0, 0x5

    goto :goto_a

    :sswitch_a
    const-string v0, "TextView"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    const/4 v0, 0x0

    goto :goto_a

    :sswitch_b
    const-string v0, "MultiAutoCompleteTextView"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    const/16 v0, 0xa

    goto :goto_a

    :sswitch_c
    const-string v0, "CheckedTextView"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    const/16 v0, 0x8

    goto :goto_a

    :sswitch_d
    const-string v0, "RatingBar"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    const/16 v0, 0xb

    goto :goto_a

    :cond_d
    :goto_9
    const/4 v0, -0x1

    :goto_a
    packed-switch v0, :pswitch_data_0

    goto :goto_c

    .line 9
    :pswitch_0
    new-instance v0, Lq5;

    invoke-direct {v0, p1, p4}, Lq5;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_b

    .line 10
    :pswitch_1
    new-instance v0, Lw4;

    invoke-direct {v0, p1, p4}, Lw4;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_b

    .line 11
    :pswitch_2
    new-instance v0, Lv4;

    invoke-direct {v0, p1, p4}, Lv4;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_b

    .line 12
    :pswitch_3
    new-instance v0, Lr4;

    invoke-direct {v0, p1, p4}, Lr4;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_b

    .line 13
    :pswitch_4
    new-instance v0, Lf4;

    .line 14
    sget v6, Lf;->autoCompleteTextViewStyle:I

    invoke-direct {v0, p1, p4, v6}, Lf4;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    goto :goto_b

    .line 15
    :pswitch_5
    new-instance v0, Lj4;

    invoke-direct {v0, p1, p4}, Lj4;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_b

    .line 16
    :pswitch_6
    new-instance v0, Lu4;

    invoke-direct {v0, p1, p4}, Lu4;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_b

    .line 17
    :pswitch_7
    new-instance v0, Li4;

    invoke-direct {v0, p1, p4}, Li4;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_b

    .line 18
    :pswitch_8
    new-instance v0, Lo4;

    .line 19
    sget v6, Lf;->imageButtonStyle:I

    invoke-direct {v0, p1, p4, v6}, Lo4;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    goto :goto_b

    .line 20
    :pswitch_9
    new-instance v0, Lj5;

    invoke-direct {v0, p1, p4}, Lj5;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_b

    .line 21
    :pswitch_a
    new-instance v0, Ln4;

    invoke-direct {v0, p1, p4}, Ln4;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_b

    .line 22
    :pswitch_b
    new-instance v0, Lh4;

    invoke-direct {v0, p1, p4}, Lh4;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_b

    .line 23
    :pswitch_c
    new-instance v0, Lq4;

    .line 24
    invoke-direct {v0, p1, p4, v1}, Lq4;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    goto :goto_b

    .line 25
    :pswitch_d
    new-instance v0, Lo5;

    const v6, 0x1010084

    .line 26
    invoke-direct {v0, p1, p4, v6}, Lo5;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 27
    :goto_b
    invoke-virtual {v3, v0, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->b(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_d

    :goto_c
    move-object v0, v5

    :goto_d
    if-nez v0, :cond_12

    if-eq p3, p1, :cond_12

    const-string p3, "view"

    .line 28
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_e

    const-string p2, "class"

    invoke-interface {p4, v5, p2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :cond_e
    :try_start_1
    iget-object p3, v3, Landroidx/appcompat/app/AppCompatViewInflater;->a:[Ljava/lang/Object;

    aput-object p1, p3, v1

    iget-object p3, v3, Landroidx/appcompat/app/AppCompatViewInflater;->a:[Ljava/lang/Object;

    aput-object p4, p3, v2

    const/16 p3, 0x2e

    invoke-virtual {p2, p3}, Ljava/lang/String;->indexOf(I)I

    move-result p3

    if-ne v4, p3, :cond_11

    const/4 p3, 0x0

    :goto_e
    sget-object v0, Landroidx/appcompat/app/AppCompatViewInflater;->d:[Ljava/lang/String;

    array-length v0, v0

    if-ge p3, v0, :cond_10

    sget-object v0, Landroidx/appcompat/app/AppCompatViewInflater;->d:[Ljava/lang/String;

    aget-object v0, v0, p3

    invoke-virtual {v3, p1, p2, v0}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v0, :cond_f

    iget-object p1, v3, Landroidx/appcompat/app/AppCompatViewInflater;->a:[Ljava/lang/Object;

    aput-object v5, p1, v1

    aput-object v5, p1, v2

    move-object v5, v0

    goto :goto_f

    :cond_f
    add-int/lit8 p3, p3, 0x1

    goto :goto_e

    :cond_10
    iget-object p1, v3, Landroidx/appcompat/app/AppCompatViewInflater;->a:[Ljava/lang/Object;

    aput-object v5, p1, v1

    aput-object v5, p1, v2

    goto :goto_f

    :cond_11
    :try_start_2
    invoke-virtual {v3, p1, p2, v5}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object p2, v3, Landroidx/appcompat/app/AppCompatViewInflater;->a:[Ljava/lang/Object;

    aput-object v5, p2, v1

    aput-object v5, p2, v2

    move-object v5, p1

    goto :goto_f

    :catchall_1
    move-exception p1

    iget-object p2, v3, Landroidx/appcompat/app/AppCompatViewInflater;->a:[Ljava/lang/Object;

    aput-object v5, p2, v1

    aput-object v5, p2, v2

    throw p1

    :catch_0
    iget-object p1, v3, Landroidx/appcompat/app/AppCompatViewInflater;->a:[Ljava/lang/Object;

    aput-object v5, p1, v1

    aput-object v5, p1, v2

    :goto_f
    move-object v0, v5

    :cond_12
    if-eqz v0, :cond_15

    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    instance-of p2, p1, Landroid/content/ContextWrapper;

    if-eqz p2, :cond_15

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0xf

    if-lt p2, p3, :cond_13

    invoke-static {v0}, Lbc;->h(Landroid/view/View;)Z

    move-result p2

    if-nez p2, :cond_13

    goto :goto_10

    :cond_13
    sget-object p2, Landroidx/appcompat/app/AppCompatViewInflater;->c:[I

    invoke-virtual {p1, p4, p2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_14

    new-instance p3, La1;

    invoke-direct {p3, v0, p2}, La1;-><init>(Landroid/view/View;Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_14
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_15
    :goto_10
    return-object v0

    .line 30
    :cond_16
    goto :goto_12

    :goto_11
    throw v5

    :goto_12
    goto :goto_11

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7404ceea -> :sswitch_d
        -0x56c015e7 -> :sswitch_c
        -0x503aa7ad -> :sswitch_b
        -0x37f7066e -> :sswitch_a
        -0x37e04bb3 -> :sswitch_9
        -0x274065a5 -> :sswitch_8
        -0x1440b607 -> :sswitch_7
        0x2e46a6ed -> :sswitch_6
        0x2fa453c6 -> :sswitch_5
        0x431b5280 -> :sswitch_4
        0x5445f9ba -> :sswitch_3
        0x5f7507c3 -> :sswitch_2
        0x63577677 -> :sswitch_1
        0x77471352 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2, p3}, Ly0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public p()Z
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ly0;->q(Z)Z

    move-result v0

    return v0
.end method

.method public final q(Z)Z
    .locals 14

    iget-boolean v0, p0, Ly0;->M:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 1
    :cond_0
    iget v0, p0, Ly0;->N:I

    const/16 v2, -0x64

    if-eq v0, v2, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, -0x64

    :goto_0
    const/4 v3, -0x1

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/16 v6, 0x17

    const/4 v7, 0x1

    if-eq v0, v2, :cond_7

    if-eq v0, v3, :cond_6

    if-eqz v0, :cond_4

    if-eq v0, v7, :cond_6

    if-eq v0, v5, :cond_6

    if-ne v0, v4, :cond_3

    .line 2
    iget-object v2, p0, Ly0;->S:Lt0;

    if-nez v2, :cond_2

    new-instance v2, Lr0;

    iget-object v3, p0, Ly0;->e:Landroid/content/Context;

    invoke-direct {v2, p0, v3}, Lr0;-><init>(Ly0;Landroid/content/Context;)V

    iput-object v2, p0, Ly0;->S:Lt0;

    :cond_2
    iget-object v2, p0, Ly0;->S:Lt0;

    goto :goto_1

    .line 3
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v6, :cond_5

    iget-object v2, p0, Ly0;->e:Landroid/content/Context;

    const-class v8, Landroid/app/UiModeManager;

    invoke-virtual {v2, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/UiModeManager;

    invoke-virtual {v2}, Landroid/app/UiModeManager;->getNightMode()I

    move-result v2

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Ly0;->B()Lt0;

    move-result-object v2

    :goto_1
    invoke-virtual {v2}, Lt0;->c()I

    move-result v3

    goto :goto_2

    :cond_6
    move v3, v0

    .line 4
    :cond_7
    :goto_2
    iget-object v2, p0, Ly0;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget v2, v2, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v2, v2, 0x30

    if-eq v3, v7, :cond_9

    if-eq v3, v5, :cond_8

    move v3, v2

    goto :goto_3

    :cond_8
    const/16 v3, 0x20

    goto :goto_3

    :cond_9
    const/16 v3, 0x10

    .line 5
    :goto_3
    iget-boolean v5, p0, Ly0;->Q:Z

    const-string v8, "AppCompatDelegate"

    if-nez v5, :cond_c

    iget-object v5, p0, Ly0;->d:Ljava/lang/Object;

    instance-of v5, v5, Landroid/app/Activity;

    if-eqz v5, :cond_c

    iget-object v5, p0, Ly0;->e:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    if-nez v5, :cond_a

    const/4 v5, 0x0

    goto :goto_6

    :cond_a
    :try_start_0
    new-instance v9, Landroid/content/ComponentName;

    iget-object v10, p0, Ly0;->e:Landroid/content/Context;

    iget-object v11, p0, Ly0;->d:Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v11

    invoke-direct {v9, v10, v11}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v5, v9, v1}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v5

    if-eqz v5, :cond_b

    iget v5, v5, Landroid/content/pm/ActivityInfo;->configChanges:I

    and-int/lit16 v5, v5, 0x200

    if-eqz v5, :cond_b

    const/4 v5, 0x1

    goto :goto_4

    :cond_b
    const/4 v5, 0x0

    :goto_4
    iput-boolean v5, p0, Ly0;->P:Z
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception v5

    const-string v9, "Exception while getting ActivityInfo"

    invoke-static {v8, v9, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-boolean v1, p0, Ly0;->P:Z

    :cond_c
    :goto_5
    iput-boolean v7, p0, Ly0;->Q:Z

    iget-boolean v5, p0, Ly0;->P:Z

    .line 6
    :goto_6
    sget-boolean v9, Ly0;->e0:Z

    const/16 v10, 0x11

    if-nez v9, :cond_d

    if-eq v3, v2, :cond_e

    :cond_d
    if-nez v5, :cond_e

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v10, :cond_e

    iget-boolean v2, p0, Ly0;->J:Z

    if-nez v2, :cond_e

    iget-object v2, p0, Ly0;->d:Ljava/lang/Object;

    instance-of v2, v2, Landroid/view/ContextThemeWrapper;

    if-eqz v2, :cond_e

    new-instance v2, Landroid/content/res/Configuration;

    invoke-direct {v2}, Landroid/content/res/Configuration;-><init>()V

    iget v9, v2, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v9, v9, -0x31

    or-int/2addr v9, v3

    iput v9, v2, Landroid/content/res/Configuration;->uiMode:I

    :try_start_1
    iget-object v9, p0, Ly0;->d:Ljava/lang/Object;

    check-cast v9, Landroid/view/ContextThemeWrapper;

    invoke-virtual {v9, v2}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v2, 0x1

    goto :goto_7

    :catch_1
    move-exception v2

    const-string v9, "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()"

    invoke-static {v8, v9, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_e
    const/4 v2, 0x0

    :goto_7
    iget-object v8, p0, Ly0;->e:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v8

    iget v8, v8, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v8, v8, 0x30

    if-nez v2, :cond_10

    if-eq v8, v3, :cond_10

    if-eqz p1, :cond_10

    if-nez v5, :cond_10

    iget-boolean p1, p0, Ly0;->J:Z

    if-eqz p1, :cond_10

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge p1, v10, :cond_f

    iget-boolean p1, p0, Ly0;->K:Z

    if-eqz p1, :cond_10

    :cond_f
    iget-object p1, p0, Ly0;->d:Ljava/lang/Object;

    instance-of v9, p1, Landroid/app/Activity;

    if-eqz v9, :cond_10

    check-cast p1, Landroid/app/Activity;

    invoke-static {p1}, Lk9;->d(Landroid/app/Activity;)V

    const/4 v2, 0x1

    :cond_10
    if-nez v2, :cond_21

    if-eq v8, v3, :cond_21

    .line 7
    iget-object p1, p0, Ly0;->e:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    new-instance v2, Landroid/content/res/Configuration;

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v8

    invoke-direct {v2, v8}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v8

    iget v8, v8, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v8, v8, -0x31

    or-int/2addr v3, v8

    iput v3, v2, Landroid/content/res/Configuration;->uiMode:I

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x1a

    if-ge v8, v9, :cond_1d

    const/16 v9, 0x1c

    if-lt v8, v9, :cond_11

    goto/16 :goto_10

    :cond_11
    const/16 v9, 0x18

    const-string v10, "mDrawableCache"

    const-string v11, "ResourcesFlusher"

    if-lt v8, v9, :cond_17

    .line 8
    sget-boolean v8, Lb1;->h:Z

    if-nez v8, :cond_12

    :try_start_2
    const-class v8, Landroid/content/res/Resources;

    const-string v9, "mResourcesImpl"

    invoke-virtual {v8, v9}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8

    sput-object v8, Lb1;->g:Ljava/lang/reflect/Field;

    invoke-virtual {v8, v7}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_8

    :catch_2
    move-exception v8

    const-string v9, "Could not retrieve Resources#mResourcesImpl field"

    invoke-static {v11, v9, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_8
    sput-boolean v7, Lb1;->h:Z

    :cond_12
    sget-object v8, Lb1;->g:Ljava/lang/reflect/Field;

    if-nez v8, :cond_13

    goto/16 :goto_10

    :cond_13
    :try_start_3
    invoke-virtual {v8, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_9

    :catch_3
    move-exception p1

    const-string v8, "Could not retrieve value from Resources#mResourcesImpl"

    invoke-static {v11, v8, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object p1, v3

    :goto_9
    if-nez p1, :cond_14

    goto/16 :goto_10

    :cond_14
    sget-boolean v8, Lb1;->b:Z

    if-nez v8, :cond_15

    :try_start_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8, v10}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8

    sput-object v8, Lb1;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v8, v7}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_4
    .catch Ljava/lang/NoSuchFieldException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_a

    :catch_4
    move-exception v8

    const-string v9, "Could not retrieve ResourcesImpl#mDrawableCache field"

    invoke-static {v11, v9, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_a
    sput-boolean v7, Lb1;->b:Z

    :cond_15
    sget-object v8, Lb1;->a:Ljava/lang/reflect/Field;

    if-eqz v8, :cond_16

    :try_start_5
    invoke-virtual {v8, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_b

    :catch_5
    move-exception p1

    const-string v8, "Could not retrieve value from ResourcesImpl#mDrawableCache"

    invoke-static {v11, v8, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_16
    :goto_b
    if-eqz v3, :cond_1d

    invoke-static {v3}, Lb1;->t(Ljava/lang/Object;)V

    goto :goto_10

    :cond_17
    const-string v9, "Could not retrieve Resources#mDrawableCache field"

    const-string v12, "Could not retrieve value from Resources#mDrawableCache"

    if-lt v8, v6, :cond_1b

    .line 9
    sget-boolean v8, Lb1;->b:Z

    if-nez v8, :cond_18

    :try_start_6
    const-class v8, Landroid/content/res/Resources;

    invoke-virtual {v8, v10}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8

    sput-object v8, Lb1;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v8, v7}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_6
    .catch Ljava/lang/NoSuchFieldException; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_c

    :catch_6
    move-exception v8

    invoke-static {v11, v9, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_c
    sput-boolean v7, Lb1;->b:Z

    :cond_18
    sget-object v8, Lb1;->a:Ljava/lang/reflect/Field;

    if-eqz v8, :cond_19

    :try_start_7
    invoke-virtual {v8, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_7

    goto :goto_d

    :catch_7
    move-exception p1

    invoke-static {v11, v12, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_19
    :goto_d
    if-nez v3, :cond_1a

    goto :goto_10

    :cond_1a
    invoke-static {v3}, Lb1;->t(Ljava/lang/Object;)V

    goto :goto_10

    :cond_1b
    const/16 v13, 0x15

    if-lt v8, v13, :cond_1d

    .line 10
    sget-boolean v8, Lb1;->b:Z

    if-nez v8, :cond_1c

    :try_start_8
    const-class v8, Landroid/content/res/Resources;

    invoke-virtual {v8, v10}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8

    sput-object v8, Lb1;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v8, v7}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_8
    .catch Ljava/lang/NoSuchFieldException; {:try_start_8 .. :try_end_8} :catch_8

    goto :goto_e

    :catch_8
    move-exception v8

    invoke-static {v11, v9, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_e
    sput-boolean v7, Lb1;->b:Z

    :cond_1c
    sget-object v8, Lb1;->a:Ljava/lang/reflect/Field;

    if-eqz v8, :cond_1d

    :try_start_9
    invoke-virtual {v8, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;
    :try_end_9
    .catch Ljava/lang/IllegalAccessException; {:try_start_9 .. :try_end_9} :catch_9

    move-object v3, p1

    goto :goto_f

    :catch_9
    move-exception p1

    invoke-static {v11, v12, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_f
    if-eqz v3, :cond_1d

    invoke-interface {v3}, Ljava/util/Map;->clear()V

    .line 11
    :cond_1d
    :goto_10
    iget p1, p0, Ly0;->O:I

    if-eqz p1, :cond_1e

    iget-object v3, p0, Ly0;->e:Landroid/content/Context;

    invoke-virtual {v3, p1}, Landroid/content/Context;->setTheme(I)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v6, :cond_1e

    iget-object p1, p0, Ly0;->e:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    iget v3, p0, Ly0;->O:I

    invoke-virtual {p1, v3, v7}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_1e
    if-eqz v5, :cond_22

    iget-object p1, p0, Ly0;->d:Ljava/lang/Object;

    instance-of v3, p1, Landroid/app/Activity;

    if-eqz v3, :cond_22

    check-cast p1, Landroid/app/Activity;

    instance-of v3, p1, Lre;

    if-eqz v3, :cond_20

    move-object v3, p1

    check-cast v3, Lre;

    invoke-interface {v3}, Lre;->e()Loe;

    move-result-object v3

    check-cast v3, Lte;

    .line 12
    iget-object v3, v3, Lte;->b:Loe$b;

    .line 13
    sget-object v5, Loe$b;->e:Loe$b;

    .line 14
    invoke-virtual {v3, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-ltz v3, :cond_1f

    const/4 v1, 0x1

    :cond_1f
    if-eqz v1, :cond_22

    goto :goto_11

    .line 15
    :cond_20
    iget-boolean v1, p0, Ly0;->L:Z

    if-eqz v1, :cond_22

    :goto_11
    invoke-virtual {p1, v2}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    goto :goto_12

    :cond_21
    move v7, v2

    :cond_22
    :goto_12
    if-eqz v7, :cond_23

    .line 16
    iget-object p1, p0, Ly0;->d:Ljava/lang/Object;

    instance-of v1, p1, Lc0;

    if-eqz v1, :cond_23

    check-cast p1, Lc0;

    invoke-virtual {p1}, Lc0;->o()V

    :cond_23
    if-nez v0, :cond_24

    .line 17
    invoke-virtual {p0}, Ly0;->B()Lt0;

    move-result-object p1

    invoke-virtual {p1}, Lt0;->e()V

    goto :goto_13

    :cond_24
    iget-object p1, p0, Ly0;->R:Lt0;

    if-eqz p1, :cond_25

    invoke-virtual {p1}, Lt0;->a()V

    :cond_25
    :goto_13
    if-ne v0, v4, :cond_27

    .line 18
    iget-object p1, p0, Ly0;->S:Lt0;

    if-nez p1, :cond_26

    new-instance p1, Lr0;

    iget-object v0, p0, Ly0;->e:Landroid/content/Context;

    invoke-direct {p1, p0, v0}, Lr0;-><init>(Ly0;Landroid/content/Context;)V

    iput-object p1, p0, Ly0;->S:Lt0;

    :cond_26
    iget-object p1, p0, Ly0;->S:Lt0;

    .line 19
    invoke-virtual {p1}, Lt0;->e()V

    goto :goto_14

    :cond_27
    iget-object p1, p0, Ly0;->S:Lt0;

    if-eqz p1, :cond_28

    invoke-virtual {p1}, Lt0;->a()V

    :cond_28
    :goto_14
    return v7
.end method

.method public final r(Landroid/view/Window;)V
    .locals 3

    iget-object v0, p0, Ly0;->f:Landroid/view/Window;

    const-string v1, "AppCompat has already installed itself into the Window"

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    instance-of v2, v0, Lq0;

    if-nez v2, :cond_1

    new-instance v1, Lq0;

    invoke-direct {v1, p0, v0}, Lq0;-><init>(Ly0;Landroid/view/Window$Callback;)V

    iput-object v1, p0, Ly0;->g:Lq0;

    invoke-virtual {p1, v1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    iget-object v0, p0, Ly0;->e:Landroid/content/Context;

    const/4 v1, 0x0

    sget-object v2, Ly0;->c0:[I

    invoke-static {v0, v1, v2}, Lb7;->n(Landroid/content/Context;Landroid/util/AttributeSet;[I)Lb7;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lb7;->f(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1
    :cond_0
    iget-object v0, v0, Lb7;->b:Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 2
    iput-object p1, p0, Ly0;->f:Landroid/view/Window;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public s(ILw0;Landroid/view/Menu;)V
    .locals 0

    if-nez p3, :cond_0

    if-eqz p2, :cond_0

    iget-object p3, p2, Lw0;->h:Lz2;

    :cond_0
    if-eqz p2, :cond_1

    iget-boolean p2, p2, Lw0;->m:Z

    if-nez p2, :cond_1

    return-void

    :cond_1
    iget-boolean p2, p0, Ly0;->M:Z

    if-nez p2, :cond_2

    iget-object p2, p0, Ly0;->g:Lq0;

    .line 1
    iget-object p2, p2, Lq0;->b:Landroid/view/Window$Callback;

    .line 2
    invoke-interface {p2, p1, p3}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    :cond_2
    return-void
.end method

.method public t(Lz2;)V
    .locals 2

    iget-boolean v0, p0, Ly0;->F:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ly0;->F:Z

    iget-object v0, p0, Ly0;->l:Lr5;

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 1
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->n()V

    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Ls5;

    check-cast v0, Lf7;

    .line 2
    iget-object v0, v0, Lf7;->a:Landroidx/appcompat/widget/Toolbar;

    .line 3
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->u:Le4;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Le4;->a()Z

    .line 5
    :cond_1
    invoke-virtual {p0}, Ly0;->D()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-boolean v1, p0, Ly0;->M:Z

    if-nez v1, :cond_2

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    :cond_2
    const/4 p1, 0x0

    iput-boolean p1, p0, Ly0;->F:Z

    return-void
.end method

.method public u(Lw0;Z)V
    .locals 3

    if-eqz p2, :cond_0

    iget v0, p1, Lw0;->a:I

    if-nez v0, :cond_0

    iget-object v0, p0, Ly0;->l:Lr5;

    if-eqz v0, :cond_0

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lw0;->h:Lz2;

    invoke-virtual {p0, p1}, Ly0;->t(Lz2;)V

    return-void

    :cond_0
    iget-object v0, p0, Ly0;->e:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-boolean v2, p1, Lw0;->m:Z

    if-eqz v2, :cond_1

    iget-object v2, p1, Lw0;->e:Landroid/view/ViewGroup;

    if-eqz v2, :cond_1

    invoke-interface {v0, v2}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    if-eqz p2, :cond_1

    iget p2, p1, Lw0;->a:I

    invoke-virtual {p0, p2, p1, v1}, Ly0;->s(ILw0;Landroid/view/Menu;)V

    :cond_1
    const/4 p2, 0x0

    iput-boolean p2, p1, Lw0;->k:Z

    iput-boolean p2, p1, Lw0;->l:Z

    iput-boolean p2, p1, Lw0;->m:Z

    iput-object v1, p1, Lw0;->f:Landroid/view/View;

    const/4 p2, 0x1

    iput-boolean p2, p1, Lw0;->o:Z

    iget-object p2, p0, Ly0;->H:Lw0;

    if-ne p2, p1, :cond_2

    iput-object v1, p0, Ly0;->H:Lw0;

    :cond_2
    return-void
.end method

.method public v(Landroid/view/KeyEvent;)Z
    .locals 6

    iget-object v0, p0, Ly0;->d:Ljava/lang/Object;

    instance-of v1, v0, Llb;

    const/4 v2, 0x1

    if-nez v1, :cond_0

    instance-of v0, v0, Lb0;

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Ly0;->f:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1
    invoke-static {v0, p1}, Lbc;->c(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    .line 2
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x52

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Ly0;->g:Lq0;

    .line 3
    iget-object v0, v0, Lq0;->b:Landroid/view/Window$Callback;

    .line 4
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v2

    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_3

    const/4 v3, 0x1

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    const/4 v5, 0x4

    if-eqz v3, :cond_8

    if-eq v0, v5, :cond_5

    if-eq v0, v1, :cond_4

    goto :goto_2

    .line 5
    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_1a

    invoke-virtual {p0, v4}, Ly0;->C(I)Lw0;

    move-result-object v0

    iget-boolean v1, v0, Lw0;->m:Z

    if-nez v1, :cond_1a

    invoke-virtual {p0, v0, p1}, Ly0;->I(Lw0;Landroid/view/KeyEvent;)Z

    goto/16 :goto_b

    .line 6
    :cond_5
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getFlags()I

    move-result p1

    and-int/lit16 p1, p1, 0x80

    if-eqz p1, :cond_6

    goto :goto_1

    :cond_6
    const/4 v2, 0x0

    :goto_1
    iput-boolean v2, p0, Ly0;->I:Z

    :cond_7
    :goto_2
    const/4 v2, 0x0

    goto/16 :goto_b

    :cond_8
    if-eq v0, v5, :cond_12

    if-eq v0, v1, :cond_9

    goto :goto_2

    .line 7
    :cond_9
    iget-object v0, p0, Ly0;->o:Ld2;

    if-eqz v0, :cond_a

    goto/16 :goto_b

    :cond_a
    invoke-virtual {p0, v4}, Ly0;->C(I)Lw0;

    move-result-object v0

    iget-object v1, p0, Ly0;->l:Lr5;

    if-eqz v1, :cond_c

    check-cast v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->h()Z

    move-result v1

    if-eqz v1, :cond_c

    iget-object v1, p0, Ly0;->e:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result v1

    if-nez v1, :cond_c

    iget-object v1, p0, Ly0;->l:Lr5;

    check-cast v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m()Z

    move-result v1

    if-nez v1, :cond_b

    iget-boolean v1, p0, Ly0;->M:Z

    if-nez v1, :cond_f

    invoke-virtual {p0, v0, p1}, Ly0;->I(Lw0;Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_f

    iget-object p1, p0, Ly0;->l:Lr5;

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 8
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->n()V

    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f:Ls5;

    check-cast p1, Lf7;

    .line 9
    iget-object p1, p1, Lf7;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->u()Z

    move-result p1

    goto :goto_5

    .line 10
    :cond_b
    iget-object p1, p0, Ly0;->l:Lr5;

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()Z

    move-result p1

    goto :goto_5

    :cond_c
    iget-boolean v1, v0, Lw0;->m:Z

    if-nez v1, :cond_10

    iget-boolean v1, v0, Lw0;->l:Z

    if-eqz v1, :cond_d

    goto :goto_4

    :cond_d
    iget-boolean v1, v0, Lw0;->k:Z

    if-eqz v1, :cond_f

    iget-boolean v1, v0, Lw0;->p:Z

    if-eqz v1, :cond_e

    iput-boolean v4, v0, Lw0;->k:Z

    invoke-virtual {p0, v0, p1}, Ly0;->I(Lw0;Landroid/view/KeyEvent;)Z

    move-result v1

    goto :goto_3

    :cond_e
    const/4 v1, 0x1

    :goto_3
    if-eqz v1, :cond_f

    invoke-virtual {p0, v0, p1}, Ly0;->G(Lw0;Landroid/view/KeyEvent;)V

    const/4 p1, 0x1

    goto :goto_5

    :cond_f
    const/4 p1, 0x0

    goto :goto_5

    :cond_10
    :goto_4
    iget-boolean p1, v0, Lw0;->m:Z

    invoke-virtual {p0, v0, v2}, Ly0;->u(Lw0;Z)V

    :goto_5
    if-eqz p1, :cond_1a

    iget-object p1, p0, Ly0;->e:Landroid/content/Context;

    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    if-eqz p1, :cond_11

    invoke-virtual {p1, v4}, Landroid/media/AudioManager;->playSoundEffect(I)V

    goto :goto_b

    :cond_11
    const-string p1, "AppCompatDelegate"

    const-string v0, "Couldn\'t get audio manager"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_b

    .line 11
    :cond_12
    iget-boolean p1, p0, Ly0;->I:Z

    iput-boolean v4, p0, Ly0;->I:Z

    invoke-virtual {p0, v4}, Ly0;->C(I)Lw0;

    move-result-object v0

    iget-boolean v1, v0, Lw0;->m:Z

    if-eqz v1, :cond_13

    if-nez p1, :cond_1a

    invoke-virtual {p0, v0, v2}, Ly0;->u(Lw0;Z)V

    goto :goto_b

    .line 12
    :cond_13
    iget-object p1, p0, Ly0;->o:Ld2;

    if-eqz p1, :cond_14

    invoke-virtual {p1}, Ld2;->c()V

    goto :goto_9

    .line 13
    :cond_14
    invoke-virtual {p0}, Ly0;->E()V

    iget-object p1, p0, Ly0;->i:Lp;

    if-eqz p1, :cond_19

    .line 14
    check-cast p1, Lj1;

    .line 15
    iget-object v0, p1, Lj1;->e:Ls5;

    if-eqz v0, :cond_18

    check-cast v0, Lf7;

    .line 16
    iget-object v0, v0, Lf7;->a:Landroidx/appcompat/widget/Toolbar;

    .line 17
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->L:Landroidx/appcompat/widget/Toolbar$d;

    if-eqz v0, :cond_15

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar$d;->c:Lc3;

    if-eqz v0, :cond_15

    const/4 v0, 0x1

    goto :goto_6

    :cond_15
    const/4 v0, 0x0

    :goto_6
    if-eqz v0, :cond_18

    .line 18
    iget-object p1, p1, Lj1;->e:Ls5;

    check-cast p1, Lf7;

    .line 19
    iget-object p1, p1, Lf7;->a:Landroidx/appcompat/widget/Toolbar;

    .line 20
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->L:Landroidx/appcompat/widget/Toolbar$d;

    if-nez p1, :cond_16

    const/4 p1, 0x0

    goto :goto_7

    :cond_16
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar$d;->c:Lc3;

    :goto_7
    if-eqz p1, :cond_17

    invoke-virtual {p1}, Lc3;->collapseActionView()Z

    :cond_17
    const/4 p1, 0x1

    goto :goto_8

    :cond_18
    const/4 p1, 0x0

    :goto_8
    if-eqz p1, :cond_19

    :goto_9
    const/4 p1, 0x1

    goto :goto_a

    :cond_19
    const/4 p1, 0x0

    :goto_a
    if-eqz p1, :cond_7

    :cond_1a
    :goto_b
    return v2
.end method

.method public w(I)V
    .locals 3

    invoke-virtual {p0, p1}, Ly0;->C(I)Lw0;

    move-result-object v0

    iget-object v1, v0, Lw0;->h:Lz2;

    if-eqz v1, :cond_1

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, v0, Lw0;->h:Lz2;

    invoke-virtual {v2, v1}, Lz2;->w(Landroid/os/Bundle;)V

    invoke-virtual {v1}, Landroid/os/Bundle;->size()I

    move-result v2

    if-lez v2, :cond_0

    iput-object v1, v0, Lw0;->q:Landroid/os/Bundle;

    :cond_0
    iget-object v1, v0, Lw0;->h:Lz2;

    invoke-virtual {v1}, Lz2;->z()V

    iget-object v1, v0, Lw0;->h:Lz2;

    invoke-virtual {v1}, Lz2;->clear()V

    :cond_1
    const/4 v1, 0x1

    iput-boolean v1, v0, Lw0;->p:Z

    iput-boolean v1, v0, Lw0;->o:Z

    const/16 v0, 0x6c

    if-eq p1, v0, :cond_2

    if-nez p1, :cond_3

    :cond_2
    iget-object p1, p0, Ly0;->l:Lr5;

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Ly0;->C(I)Lw0;

    move-result-object v0

    iput-boolean p1, v0, Lw0;->k:Z

    const/4 p1, 0x0

    invoke-virtual {p0, v0, p1}, Ly0;->I(Lw0;Landroid/view/KeyEvent;)Z

    :cond_3
    return-void
.end method

.method public x()V
    .locals 1

    iget-object v0, p0, Ly0;->s:Lgc;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lgc;->b()V

    :cond_0
    return-void
.end method

.method public final y()V
    .locals 9

    iget-boolean v0, p0, Ly0;->u:Z

    if-nez v0, :cond_1b

    .line 1
    iget-object v0, p0, Ly0;->e:Landroid/content/Context;

    sget-object v1, Lo;->AppCompatTheme:[I

    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v1, Lo;->AppCompatTheme_windowActionBar:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_1a

    sget v1, Lo;->AppCompatTheme_windowNoTitle:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    const/16 v3, 0x6c

    const/4 v4, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v4}, Ly0;->k(I)Z

    goto :goto_0

    :cond_0
    sget v1, Lo;->AppCompatTheme_windowActionBar:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v3}, Ly0;->k(I)Z

    :cond_1
    :goto_0
    sget v1, Lo;->AppCompatTheme_windowActionBarOverlay:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    const/16 v5, 0x6d

    if-eqz v1, :cond_2

    invoke-virtual {p0, v5}, Ly0;->k(I)Z

    :cond_2
    sget v1, Lo;->AppCompatTheme_windowActionModeOverlay:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0xa

    invoke-virtual {p0, v1}, Ly0;->k(I)Z

    :cond_3
    sget v1, Lo;->AppCompatTheme_android_windowIsFloating:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Ly0;->D:Z

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0}, Ly0;->z()V

    iget-object v0, p0, Ly0;->f:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    iget-object v0, p0, Ly0;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-boolean v1, p0, Ly0;->E:Z

    const/4 v6, 0x0

    if-nez v1, :cond_9

    iget-boolean v1, p0, Ly0;->D:Z

    if-eqz v1, :cond_4

    sget v1, Ll;->abc_dialog_title_material:I

    invoke-virtual {v0, v1, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-boolean v2, p0, Ly0;->B:Z

    iput-boolean v2, p0, Ly0;->A:Z

    goto/16 :goto_3

    :cond_4
    iget-boolean v0, p0, Ly0;->A:Z

    if-eqz v0, :cond_8

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iget-object v1, p0, Ly0;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    sget v7, Lf;->actionBarTheme:I

    invoke-virtual {v1, v7, v0, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v1, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v1, :cond_5

    new-instance v1, Lf2;

    iget-object v7, p0, Ly0;->e:Landroid/content/Context;

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-direct {v1, v7, v0}, Lf2;-><init>(Landroid/content/Context;I)V

    goto :goto_1

    :cond_5
    iget-object v1, p0, Ly0;->e:Landroid/content/Context;

    :goto_1
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Ll;->abc_screen_toolbar:I

    invoke-virtual {v0, v1, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    sget v1, Lk;->decor_content_parent:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lr5;

    iput-object v1, p0, Ly0;->l:Lr5;

    invoke-virtual {p0}, Ly0;->D()Landroid/view/Window$Callback;

    move-result-object v7

    invoke-interface {v1, v7}, Lr5;->setWindowCallback(Landroid/view/Window$Callback;)V

    iget-boolean v1, p0, Ly0;->B:Z

    if-eqz v1, :cond_6

    iget-object v1, p0, Ly0;->l:Lr5;

    check-cast v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v1, v5}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(I)V

    :cond_6
    iget-boolean v1, p0, Ly0;->y:Z

    if-eqz v1, :cond_7

    iget-object v1, p0, Ly0;->l:Lr5;

    const/4 v5, 0x2

    check-cast v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v1, v5}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(I)V

    :cond_7
    iget-boolean v1, p0, Ly0;->z:Z

    if-eqz v1, :cond_c

    iget-object v1, p0, Ly0;->l:Lr5;

    const/4 v5, 0x5

    check-cast v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v1, v5}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(I)V

    goto :goto_3

    :cond_8
    move-object v0, v6

    goto :goto_3

    :cond_9
    iget-boolean v1, p0, Ly0;->C:Z

    if-eqz v1, :cond_a

    sget v1, Ll;->abc_screen_simple_overlay_action_mode:I

    goto :goto_2

    :cond_a
    sget v1, Ll;->abc_screen_simple:I

    :goto_2
    invoke-virtual {v0, v1, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x15

    if-lt v1, v5, :cond_b

    new-instance v1, Lh0;

    invoke-direct {v1, p0}, Lh0;-><init>(Ly0;)V

    invoke-static {v0, v1}, Lbc;->v(Landroid/view/View;Lh0;)V

    goto :goto_3

    :cond_b
    move-object v1, v0

    check-cast v1, Lx5;

    new-instance v5, Li0;

    invoke-direct {v5, p0}, Li0;-><init>(Ly0;)V

    invoke-interface {v1, v5}, Lx5;->setOnFitSystemWindowsListener(Lx5$a;)V

    :cond_c
    :goto_3
    if-eqz v0, :cond_19

    iget-object v1, p0, Ly0;->l:Lr5;

    if-nez v1, :cond_d

    sget v1, Lk;->title:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ly0;->w:Landroid/widget/TextView;

    :cond_d
    invoke-static {v0}, Ll7;->c(Landroid/view/View;)V

    sget v1, Lk;->action_bar_activity_content:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/ContentFrameLayout;

    iget-object v5, p0, Ly0;->f:Landroid/view/Window;

    const v7, 0x1020002

    invoke-virtual {v5, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/view/ViewGroup;

    if-eqz v5, :cond_f

    :goto_4
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v8

    if-lez v8, :cond_e

    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->removeViewAt(I)V

    invoke-virtual {v1, v8}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    goto :goto_4

    :cond_e
    const/4 v8, -0x1

    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->setId(I)V

    invoke-virtual {v1, v7}, Landroid/widget/FrameLayout;->setId(I)V

    instance-of v8, v5, Landroid/widget/FrameLayout;

    if-eqz v8, :cond_f

    check-cast v5, Landroid/widget/FrameLayout;

    invoke-virtual {v5, v6}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    :cond_f
    iget-object v5, p0, Ly0;->f:Landroid/view/Window;

    invoke-virtual {v5, v0}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    new-instance v5, Lj0;

    invoke-direct {v5, p0}, Lj0;-><init>(Ly0;)V

    invoke-virtual {v1, v5}, Landroidx/appcompat/widget/ContentFrameLayout;->setAttachListener(Landroidx/appcompat/widget/ContentFrameLayout$a;)V

    .line 2
    iput-object v0, p0, Ly0;->v:Landroid/view/ViewGroup;

    .line 3
    iget-object v0, p0, Ly0;->d:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_10

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_5

    :cond_10
    iget-object v0, p0, Ly0;->k:Ljava/lang/CharSequence;

    .line 4
    :goto_5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_13

    iget-object v1, p0, Ly0;->l:Lr5;

    if-eqz v1, :cond_11

    invoke-interface {v1, v0}, Lr5;->setWindowTitle(Ljava/lang/CharSequence;)V

    goto :goto_6

    .line 5
    :cond_11
    iget-object v1, p0, Ly0;->i:Lp;

    if-eqz v1, :cond_12

    .line 6
    invoke-virtual {v1, v0}, Lp;->d(Ljava/lang/CharSequence;)V

    goto :goto_6

    :cond_12
    iget-object v1, p0, Ly0;->w:Landroid/widget/TextView;

    if-eqz v1, :cond_13

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    :cond_13
    :goto_6
    iget-object v0, p0, Ly0;->v:Landroid/view/ViewGroup;

    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ContentFrameLayout;

    iget-object v1, p0, Ly0;->f:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    move-result v7

    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    .line 8
    iget-object v8, v0, Landroidx/appcompat/widget/ContentFrameLayout;->h:Landroid/graphics/Rect;

    invoke-virtual {v8, v5, v6, v7, v1}, Landroid/graphics/Rect;->set(IIII)V

    invoke-static {v0}, Lbc;->j(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->requestLayout()V

    .line 9
    :cond_14
    iget-object v1, p0, Ly0;->e:Landroid/content/Context;

    sget-object v5, Lo;->AppCompatTheme:[I

    invoke-virtual {v1, v5}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v1

    sget v5, Lo;->AppCompatTheme_windowMinWidthMajor:I

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMajor()Landroid/util/TypedValue;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    sget v5, Lo;->AppCompatTheme_windowMinWidthMinor:I

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMinor()Landroid/util/TypedValue;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    sget v5, Lo;->AppCompatTheme_windowFixedWidthMajor:I

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_15

    sget v5, Lo;->AppCompatTheme_windowFixedWidthMajor:I

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMajor()Landroid/util/TypedValue;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_15
    sget v5, Lo;->AppCompatTheme_windowFixedWidthMinor:I

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_16

    sget v5, Lo;->AppCompatTheme_windowFixedWidthMinor:I

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMinor()Landroid/util/TypedValue;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_16
    sget v5, Lo;->AppCompatTheme_windowFixedHeightMajor:I

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_17

    sget v5, Lo;->AppCompatTheme_windowFixedHeightMajor:I

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMajor()Landroid/util/TypedValue;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_17
    sget v5, Lo;->AppCompatTheme_windowFixedHeightMinor:I

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_18

    sget v5, Lo;->AppCompatTheme_windowFixedHeightMinor:I

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMinor()Landroid/util/TypedValue;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_18
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->requestLayout()V

    .line 10
    iput-boolean v4, p0, Ly0;->u:Z

    invoke-virtual {p0, v2}, Ly0;->C(I)Lw0;

    move-result-object v0

    iget-boolean v1, p0, Ly0;->M:Z

    if-nez v1, :cond_1b

    iget-object v0, v0, Lw0;->h:Lz2;

    if-nez v0, :cond_1b

    invoke-virtual {p0, v3}, Ly0;->F(I)V

    goto :goto_7

    .line 11
    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "AppCompat does not support the current theme features: { windowActionBar: "

    invoke-static {v1}, Lgg;->d(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Ly0;->A:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowActionBarOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Ly0;->B:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", android:windowIsFloating: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Ly0;->D:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowActionModeOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Ly0;->C:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowNoTitle: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Ly0;->E:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " }"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You need to use a Theme.AppCompat theme (or descendant) with this activity."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1b
    :goto_7
    return-void
.end method

.method public final z()V
    .locals 2

    iget-object v0, p0, Ly0;->f:Landroid/view/Window;

    if-nez v0, :cond_0

    iget-object v0, p0, Ly0;->d:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0, v0}, Ly0;->r(Landroid/view/Window;)V

    :cond_0
    iget-object v0, p0, Ly0;->f:Landroid/view/Window;

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "We have not been given a Window"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
