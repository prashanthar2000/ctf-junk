.class public abstract Lc0;
.super Landroidx/activity/ComponentActivity;
.source ""

# interfaces
.implements Ld0;


# instance fields
.field public final g:Lld;

.field public final h:Lte;

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:I

.field public m:Lc8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc8<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public n:Le0;

.field public o:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    new-instance v0, Lkd;

    invoke-direct {v0, p0}, Lkd;-><init>(Lc0;)V

    .line 2
    new-instance v1, Lld;

    const-string v2, "callbacks == null"

    invoke-static {v0, v2}, Lb1;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v1, v0}, Lld;-><init>(Lnd;)V

    .line 3
    iput-object v1, p0, Lc0;->g:Lld;

    new-instance v0, Lte;

    invoke-direct {v0, p0}, Lte;-><init>(Lre;)V

    iput-object v0, p0, Lc0;->h:Lte;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc0;->k:Z

    return-void
.end method

.method public static i(I)V
    .locals 1

    const/high16 v0, -0x10000

    and-int/2addr p0, v0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Can only use lower 16 bits for requestCode"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a(Ld2;)V
    .locals 0

    return-void
.end method

.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Lc0;->k()Le0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Le0;->c(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Activity;->attachBaseContext(Landroid/content/Context;)V

    invoke-virtual {p0}, Lc0;->k()Le0;

    move-result-object p1

    check-cast p1, Ly0;

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, v0}, Ly0;->q(Z)Z

    const/4 v0, 0x1

    iput-boolean v0, p1, Ly0;->J:Z

    return-void
.end method

.method public closeOptionsMenu()V
    .locals 3

    invoke-virtual {p0}, Lc0;->l()Lp;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    :cond_0
    return-void
.end method

.method public d(Ld2;)V
    .locals 0

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p0}, Lc0;->l()Lp;

    move-result-object v1

    const/16 v2, 0x52

    invoke-super {p0, p1}, Lq9;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Local FragmentActivity "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " State:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mCreated="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Lc0;->i:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mResumed="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Lc0;->j:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mStopped="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Lc0;->k:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 2
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->c()Lcf;

    move-result-object v1

    .line 3
    const-class v2, Lff;

    .line 4
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    const-string v4, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-static {v4, v3}, Lgg;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 5
    iget-object v4, v1, Lcf;->a:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Laf;

    .line 6
    invoke-virtual {v2, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    new-instance v4, Lff;

    invoke-direct {v4}, Lff;-><init>()V

    .line 8
    iget-object v1, v1, Lcf;->a:Ljava/util/HashMap;

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Laf;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Laf;->a()V

    .line 9
    :cond_1
    :goto_0
    check-cast v4, Lff;

    .line 10
    iget-object v1, v4, Lff;->b:Lc8;

    invoke-virtual {v1}, Lc8;->i()I

    move-result v1

    if-lez v1, :cond_4

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "Loaders:"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const/4 v1, 0x0

    iget-object v2, v4, Lff;->b:Lc8;

    invoke-virtual {v2}, Lc8;->i()I

    move-result v2

    if-gtz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object p1, v4, Lff;->b:Lc8;

    invoke-virtual {p1, v1}, Lc8;->j(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lef;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "  #"

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p1, v4, Lff;->b:Lc8;

    invoke-virtual {p1, v1}, Lc8;->f(I)I

    move-result p1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(I)V

    const-string p1, ": "

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    .line 11
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_4
    :goto_1
    iget-object v0, p0, Lc0;->g:Lld;

    .line 13
    iget-object v0, v0, Lld;->a:Lnd;

    iget-object v0, v0, Lnd;->d:Lud;

    .line 14
    invoke-virtual {v0, p1, p2, p3, p4}, Lod;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public f(Lc2;)Ld2;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lc0;->k()Le0;

    move-result-object v0

    check-cast v0, Ly0;

    .line 1
    invoke-virtual {v0}, Ly0;->y()V

    iget-object v0, v0, Ly0;->f:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 3

    invoke-virtual {p0}, Lc0;->k()Le0;

    move-result-object v0

    check-cast v0, Ly0;

    .line 1
    iget-object v1, v0, Ly0;->j:Landroid/view/MenuInflater;

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ly0;->E()V

    new-instance v1, Ll2;

    iget-object v2, v0, Ly0;->i:Lp;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lp;->b()Landroid/content/Context;

    move-result-object v2

    goto :goto_0

    :cond_0
    iget-object v2, v0, Ly0;->e:Landroid/content/Context;

    :goto_0
    invoke-direct {v1, v2}, Ll2;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Ly0;->j:Landroid/view/MenuInflater;

    :cond_1
    iget-object v0, v0, Ly0;->j:Landroid/view/MenuInflater;

    return-object v0
.end method

.method public getResources()Landroid/content/res/Resources;
    .locals 1

    iget-object v0, p0, Lc0;->o:Landroid/content/res/Resources;

    if-nez v0, :cond_0

    invoke-static {}, Lk7;->a()Z

    :cond_0
    iget-object v0, p0, Lc0;->o:Landroid/content/res/Resources;

    if-nez v0, :cond_1

    invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, Lc0;->k()Le0;

    move-result-object v0

    invoke-virtual {v0}, Le0;->g()V

    return-void
.end method

.method public final j(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lc0;->g:Lld;

    .line 2
    iget-object v0, v0, Lld;->a:Lnd;

    iget-object v0, v0, Lnd;->d:Lud;

    invoke-virtual {v0, p1, p2, p3, p4}, Lud;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    const/4 p1, 0x0

    return-object p1
.end method

.method public k()Le0;
    .locals 1

    iget-object v0, p0, Lc0;->n:Le0;

    if-nez v0, :cond_0

    invoke-static {p0, p0}, Le0;->d(Landroid/app/Activity;Ld0;)Le0;

    move-result-object v0

    iput-object v0, p0, Lc0;->n:Le0;

    :cond_0
    iget-object v0, p0, Lc0;->n:Le0;

    return-object v0
.end method

.method public l()Lp;
    .locals 1

    invoke-virtual {p0}, Lc0;->k()Le0;

    move-result-object v0

    check-cast v0, Ly0;

    .line 1
    invoke-virtual {v0}, Ly0;->E()V

    iget-object v0, v0, Ly0;->i:Lp;

    return-object v0
.end method

.method public m()Lod;
    .locals 1

    .line 1
    iget-object v0, p0, Lc0;->g:Lld;

    .line 2
    iget-object v0, v0, Lld;->a:Lnd;

    iget-object v0, v0, Lnd;->d:Lud;

    return-object v0
.end method

.method public final n()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc0;->m()Lod;

    move-result-object v0

    .line 2
    check-cast v0, Lud;

    .line 3
    iget-object v1, v0, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lud;->f:Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :goto_0
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljd;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    throw v0

    :cond_2
    return-void

    :catchall_0
    move-exception v0

    .line 5
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method public o()V
    .locals 0

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc0;->g:Lld;

    invoke-virtual {v0}, Lld;->b()V

    shr-int/lit8 v0, p1, 0x10

    if-eqz v0, :cond_1

    add-int/lit8 v0, v0, -0x1

    iget-object p1, p0, Lc0;->m:Lc8;

    invoke-virtual {p1, v0}, Lc8;->d(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object p2, p0, Lc0;->m:Lc8;

    invoke-virtual {p2, v0}, Lc8;->h(I)V

    const-string p2, "FragmentActivity"

    if-nez p1, :cond_0

    const-string p1, "Activity result delivered for unknown Fragment."

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lc0;->g:Lld;

    invoke-virtual {p3, p1}, Lld;->a(Ljava/lang/String;)V

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Activity result no fragment exists for who: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_1
    invoke-static {}, Lk9;->c()Lj9;

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    :goto_1
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 8

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Lc0;->g:Lld;

    invoke-virtual {v0}, Lld;->b()V

    iget-object v0, p0, Lc0;->g:Lld;

    .line 2
    iget-object v0, v0, Lld;->a:Lnd;

    iget-object v0, v0, Lnd;->d:Lud;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 3
    :goto_0
    iget-object v3, v0, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    if-ge v2, v3, :cond_1

    iget-object v3, v0, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljd;

    if-nez v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    throw v4

    .line 4
    :cond_1
    iget-object v0, p0, Lc0;->o:Landroid/content/res/Resources;

    if-eqz v0, :cond_2

    invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget-object v2, p0, Lc0;->o:Landroid/content/res/Resources;

    invoke-virtual {v2, p1, v0}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    :cond_2
    invoke-virtual {p0}, Lc0;->k()Le0;

    move-result-object p1

    check-cast p1, Ly0;

    .line 5
    iget-boolean v0, p1, Ly0;->A:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p1, Ly0;->u:Z

    if-eqz v0, :cond_3

    .line 6
    invoke-virtual {p1}, Ly0;->E()V

    iget-object v0, p1, Ly0;->i:Lp;

    if-eqz v0, :cond_3

    .line 7
    check-cast v0, Lj1;

    .line 8
    iget-object v2, v0, Lj1;->a:Landroid/content/Context;

    .line 9
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lg;->abc_action_bar_embed_tabs:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v2

    .line 10
    invoke-virtual {v0, v2}, Lj1;->g(Z)V

    .line 11
    :cond_3
    invoke-static {}, Lm4;->a()Lm4;

    move-result-object v0

    iget-object v2, p1, Ly0;->e:Landroid/content/Context;

    .line 12
    monitor-enter v0

    :try_start_0
    iget-object v3, v0, Lm4;->a:Lr6;

    .line 13
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v5, v3, Lr6;->d:Ljava/util/WeakHashMap;

    invoke-virtual {v5, v2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly7;

    if-eqz v2, :cond_5

    .line 14
    iget v5, v2, Ly7;->e:I

    iget-object v6, v2, Ly7;->d:[Ljava/lang/Object;

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v5, :cond_4

    aput-object v4, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_4
    iput v1, v2, Ly7;->e:I

    iput-boolean v1, v2, Ly7;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    :cond_5
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 16
    monitor-exit v0

    .line 17
    invoke-virtual {p1, v1}, Ly0;->q(Z)Z

    return-void

    :catchall_0
    move-exception p1

    .line 18
    :try_start_3
    monitor-exit v3

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v0

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public onContentChanged()V
    .locals 0

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    invoke-virtual/range {p0 .. p0}, Lc0;->k()Le0;

    move-result-object v2

    invoke-virtual {v2}, Le0;->f()V

    invoke-virtual {v2, v0}, Le0;->h(Landroid/os/Bundle;)V

    .line 1
    iget-object v2, v1, Lc0;->g:Lld;

    .line 2
    iget-object v2, v2, Lld;->a:Lnd;

    iget-object v3, v2, Lnd;->d:Lud;

    .line 3
    iget-object v4, v3, Lud;->p:Lnd;

    if-nez v4, :cond_21

    iput-object v2, v3, Lud;->p:Lnd;

    iput-object v2, v3, Lud;->q:Lnd;

    const/4 v4, 0x0

    iput-object v4, v3, Lud;->r:Ljd;

    instance-of v5, v2, Le;

    if-eqz v5, :cond_2

    move-object v5, v2

    check-cast v5, Le;

    invoke-interface {v5}, Le;->b()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v6

    iput-object v6, v3, Lud;->j:Landroidx/activity/OnBackPressedDispatcher;

    iget-object v7, v3, Lud;->k:Lpd;

    if-eqz v6, :cond_1

    .line 4
    invoke-interface {v5}, Lre;->e()Loe;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Lte;

    .line 5
    iget-object v8, v8, Lte;->b:Loe$b;

    .line 6
    sget-object v9, Loe$b;->b:Loe$b;

    if-ne v8, v9, :cond_0

    goto :goto_0

    :cond_0
    new-instance v8, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;

    invoke-direct {v8, v6, v5, v7}, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;-><init>(Landroidx/activity/OnBackPressedDispatcher;Loe;Lpd;)V

    .line 7
    iget-object v5, v7, Lpd;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v5, v8}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 8
    :cond_1
    throw v4

    .line 9
    :cond_2
    :goto_0
    instance-of v5, v2, Ldf;

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v5, :cond_6

    check-cast v2, Ldf;

    invoke-interface {v2}, Ldf;->c()Lcf;

    move-result-object v2

    .line 10
    const-class v5, Lyd;

    .line 11
    invoke-virtual {v5}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_5

    const-string v9, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-static {v9, v8}, Lgg;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 12
    iget-object v9, v2, Lcf;->a:Ljava/util/HashMap;

    invoke-virtual {v9, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Laf;

    .line 13
    invoke-virtual {v5, v9}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_1

    .line 14
    :cond_3
    new-instance v9, Lyd;

    invoke-direct {v9, v7}, Lyd;-><init>(Z)V

    .line 15
    iget-object v2, v2, Lcf;->a:Ljava/util/HashMap;

    invoke-virtual {v2, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Laf;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Laf;->a()V

    .line 16
    :cond_4
    :goto_1
    check-cast v9, Lyd;

    .line 17
    iput-object v9, v3, Lud;->E:Lyd;

    goto :goto_2

    .line 18
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Local and anonymous classes can not be ViewModels"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 19
    :cond_6
    new-instance v2, Lyd;

    invoke-direct {v2, v6}, Lyd;-><init>(Z)V

    iput-object v2, v3, Lud;->E:Lyd;

    :goto_2
    if-eqz v0, :cond_1f

    const-string v2, "android:support:fragments"

    .line 20
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    iget-object v3, v1, Lc0;->g:Lld;

    .line 21
    iget-object v3, v3, Lld;->a:Lnd;

    instance-of v5, v3, Ldf;

    if-eqz v5, :cond_1e

    iget-object v3, v3, Lnd;->d:Lud;

    if-eqz v3, :cond_1d

    if-nez v2, :cond_7

    goto/16 :goto_9

    .line 22
    :cond_7
    check-cast v2, Lwd;

    iget-object v5, v2, Lwd;->b:Ljava/util/ArrayList;

    if-nez v5, :cond_8

    goto/16 :goto_9

    :cond_8
    iget-object v5, v3, Lud;->E:Lyd;

    .line 23
    iget-object v5, v5, Lyd;->b:Ljava/util/HashSet;

    .line 24
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljd;

    iget-object v0, v2, Lwd;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_9

    .line 25
    throw v4

    .line 26
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lae;

    iget-object v0, v0, Lae;->c:Ljava/lang/String;

    throw v4

    :cond_a
    iget-object v5, v3, Lud;->g:Ljava/util/HashMap;

    invoke-virtual {v5}, Ljava/util/HashMap;->clear()V

    iget-object v5, v2, Lwd;->b:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lae;

    if-eqz v8, :cond_b

    iget-object v0, v3, Lud;->p:Lnd;

    .line 27
    iget-object v0, v0, Lnd;->b:Landroid/content/Context;

    .line 28
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v3}, Lud;->k()Lmd;

    move-result-object v2

    .line 29
    iget-object v3, v8, Lae;->k:Landroid/os/Bundle;

    if-eqz v3, :cond_c

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    :cond_c
    iget-object v3, v8, Lae;->b:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Lmd;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    iput-object v4, v8, Lae;->o:Ljd;

    throw v4

    .line 30
    :cond_d
    iget-object v5, v3, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    iget-object v5, v2, Lwd;->c:Ljava/util/ArrayList;

    if-eqz v5, :cond_f

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v2, v3, Lud;->g:Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljd;

    if-nez v2, :cond_e

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v5, "No instantiated fragment for ("

    const-string v6, ")"

    invoke-static {v5, v0, v6}, Lgg;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Lud;->s(Ljava/lang/RuntimeException;)V

    throw v4

    :cond_e
    throw v4

    :cond_f
    iget-object v5, v2, Lwd;->d:[Lhd;

    if-eqz v5, :cond_18

    new-instance v5, Ljava/util/ArrayList;

    iget-object v8, v2, Lwd;->d:[Lhd;

    array-length v8, v8

    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v5, v3, Lud;->h:Ljava/util/ArrayList;

    const/4 v5, 0x0

    :goto_3
    iget-object v8, v2, Lwd;->d:[Lhd;

    array-length v9, v8

    if-ge v5, v9, :cond_19

    aget-object v8, v8, v5

    if-eqz v8, :cond_17

    .line 31
    new-instance v9, Lfd;

    invoke-direct {v9, v3}, Lfd;-><init>(Lud;)V

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_4
    iget-object v12, v8, Lhd;->b:[I

    array-length v12, v12

    if-ge v10, v12, :cond_11

    new-instance v12, Lbe;

    invoke-direct {v12}, Lbe;-><init>()V

    iget-object v13, v8, Lhd;->b:[I

    add-int/lit8 v14, v10, 0x1

    aget v10, v13, v10

    iput v10, v12, Lbe;->a:I

    iget-object v10, v8, Lhd;->c:Ljava/util/ArrayList;

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    if-eqz v10, :cond_10

    iget-object v13, v3, Lud;->g:Ljava/util/HashMap;

    invoke-virtual {v13, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljd;

    goto :goto_5

    :cond_10
    move-object v10, v4

    :goto_5
    iput-object v10, v12, Lbe;->b:Ljd;

    invoke-static {}, Loe$b;->values()[Loe$b;

    move-result-object v10

    iget-object v13, v8, Lhd;->d:[I

    aget v13, v13, v11

    aget-object v10, v10, v13

    iput-object v10, v12, Lbe;->g:Loe$b;

    invoke-static {}, Loe$b;->values()[Loe$b;

    move-result-object v10

    iget-object v13, v8, Lhd;->e:[I

    aget v13, v13, v11

    aget-object v10, v10, v13

    iput-object v10, v12, Lbe;->h:Loe$b;

    iget-object v10, v8, Lhd;->b:[I

    add-int/lit8 v13, v14, 0x1

    aget v14, v10, v14

    iput v14, v12, Lbe;->c:I

    add-int/lit8 v15, v13, 0x1

    aget v13, v10, v13

    iput v13, v12, Lbe;->d:I

    add-int/lit8 v16, v15, 0x1

    aget v15, v10, v15

    iput v15, v12, Lbe;->e:I

    add-int/lit8 v17, v16, 0x1

    aget v10, v10, v16

    iput v10, v12, Lbe;->f:I

    iput v14, v9, Lfd;->b:I

    iput v13, v9, Lfd;->c:I

    iput v15, v9, Lfd;->d:I

    iput v10, v9, Lfd;->e:I

    .line 32
    iget-object v10, v9, Lfd;->a:Ljava/util/ArrayList;

    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v10, v9, Lfd;->b:I

    iput v10, v12, Lbe;->c:I

    iget v10, v9, Lfd;->c:I

    iput v10, v12, Lbe;->d:I

    iget v10, v9, Lfd;->d:I

    iput v10, v12, Lbe;->e:I

    iget v10, v9, Lfd;->e:I

    iput v10, v12, Lbe;->f:I

    add-int/lit8 v11, v11, 0x1

    move/from16 v10, v17

    goto :goto_4

    .line 33
    :cond_11
    iget v10, v8, Lhd;->f:I

    iput v10, v9, Lfd;->f:I

    iget v10, v8, Lhd;->g:I

    iput v10, v9, Lfd;->g:I

    iget-object v10, v8, Lhd;->h:Ljava/lang/String;

    iput-object v10, v9, Lfd;->i:Ljava/lang/String;

    iget v10, v8, Lhd;->i:I

    iput v10, v9, Lfd;->s:I

    iput-boolean v7, v9, Lfd;->h:Z

    iget v10, v8, Lhd;->j:I

    iput v10, v9, Lfd;->j:I

    iget-object v10, v8, Lhd;->k:Ljava/lang/CharSequence;

    iput-object v10, v9, Lfd;->k:Ljava/lang/CharSequence;

    iget v10, v8, Lhd;->l:I

    iput v10, v9, Lfd;->l:I

    iget-object v10, v8, Lhd;->m:Ljava/lang/CharSequence;

    iput-object v10, v9, Lfd;->m:Ljava/lang/CharSequence;

    iget-object v10, v8, Lhd;->n:Ljava/util/ArrayList;

    iput-object v10, v9, Lfd;->n:Ljava/util/ArrayList;

    iget-object v10, v8, Lhd;->o:Ljava/util/ArrayList;

    iput-object v10, v9, Lfd;->o:Ljava/util/ArrayList;

    iget-boolean v8, v8, Lhd;->p:Z

    iput-boolean v8, v9, Lfd;->p:Z

    invoke-virtual {v9, v7}, Lfd;->a(I)V

    .line 34
    iget-object v8, v3, Lud;->h:Ljava/util/ArrayList;

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v8, v9, Lfd;->s:I

    if-ltz v8, :cond_16

    .line 35
    monitor-enter v3

    :try_start_0
    iget-object v10, v3, Lud;->l:Ljava/util/ArrayList;

    if-nez v10, :cond_12

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, v3, Lud;->l:Ljava/util/ArrayList;

    :cond_12
    iget-object v10, v3, Lud;->l:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v8, v10, :cond_13

    iget-object v10, v3, Lud;->l:Ljava/util/ArrayList;

    invoke-virtual {v10, v8, v9}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_13
    :goto_6
    if-ge v10, v8, :cond_15

    iget-object v11, v3, Lud;->l:Ljava/util/ArrayList;

    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v11, v3, Lud;->m:Ljava/util/ArrayList;

    if-nez v11, :cond_14

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v3, Lud;->m:Ljava/util/ArrayList;

    :cond_14
    iget-object v11, v3, Lud;->m:Ljava/util/ArrayList;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    :cond_15
    iget-object v8, v3, Lud;->l:Ljava/util/ArrayList;

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_7
    monitor-exit v3

    goto :goto_8

    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_16
    :goto_8
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_3

    .line 36
    :cond_17
    throw v4

    .line 37
    :cond_18
    iput-object v4, v3, Lud;->h:Ljava/util/ArrayList;

    :cond_19
    iget-object v5, v2, Lwd;->e:Ljava/lang/String;

    if-eqz v5, :cond_1a

    iget-object v8, v3, Lud;->g:Ljava/util/HashMap;

    invoke-virtual {v8, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljd;

    iput-object v5, v3, Lud;->s:Ljd;

    invoke-virtual {v3, v4}, Lud;->d(Ljd;)V

    :cond_1a
    iget v2, v2, Lwd;->f:I

    iput v2, v3, Lud;->e:I

    :goto_9
    const-string v2, "android:support:next_request_index"

    .line 38
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1f

    const-string v2, "android:support:next_request_index"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    iput v2, v1, Lc0;->l:I

    const-string v2, "android:support:request_indicies"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v2

    const-string v3, "android:support:request_fragment_who"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    if-eqz v2, :cond_1c

    if-eqz v3, :cond_1c

    array-length v4, v2

    array-length v5, v3

    if-eq v4, v5, :cond_1b

    goto :goto_b

    :cond_1b
    new-instance v4, Lc8;

    array-length v5, v2

    invoke-direct {v4, v5}, Lc8;-><init>(I)V

    iput-object v4, v1, Lc0;->m:Lc8;

    const/4 v4, 0x0

    :goto_a
    array-length v5, v2

    if-ge v4, v5, :cond_1f

    iget-object v5, v1, Lc0;->m:Lc8;

    aget v8, v2, v4

    aget-object v9, v3, v4

    invoke-virtual {v5, v8, v9}, Lc8;->g(ILjava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_1c
    :goto_b
    const-string v2, "FragmentActivity"

    const-string v3, "Invalid requestCode mapping in savedInstanceState."

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_c

    .line 39
    :cond_1d
    throw v4

    .line 40
    :cond_1e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you\'re still using retainNestedNonConfig()."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 41
    :cond_1f
    :goto_c
    iget-object v2, v1, Lc0;->m:Lc8;

    if-nez v2, :cond_20

    new-instance v2, Lc8;

    const/16 v3, 0xa

    .line 42
    invoke-direct {v2, v3}, Lc8;-><init>(I)V

    .line 43
    iput-object v2, v1, Lc0;->m:Lc8;

    iput v6, v1, Lc0;->l:I

    :cond_20
    invoke-super/range {p0 .. p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    iget-object v0, v1, Lc0;->h:Lte;

    sget-object v2, Loe$a;->ON_CREATE:Loe$a;

    invoke-virtual {v0, v2}, Lte;->e(Loe$a;)V

    iget-object v0, v1, Lc0;->g:Lld;

    .line 44
    iget-object v0, v0, Lld;->a:Lnd;

    iget-object v0, v0, Lnd;->d:Lud;

    .line 45
    iput-boolean v6, v0, Lud;->u:Z

    iput-boolean v6, v0, Lud;->v:Z

    invoke-virtual {v0, v7}, Lud;->e(I)V

    return-void

    .line 46
    :cond_21
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Already attached"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_e

    :goto_d
    throw v0

    :goto_e
    goto :goto_d
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 4

    if-nez p1, :cond_5

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result p1

    iget-object p2, p0, Lc0;->g:Lld;

    invoke-virtual {p0}, Lc0;->getMenuInflater()Landroid/view/MenuInflater;

    .line 2
    iget-object p2, p2, Lld;->a:Lnd;

    iget-object p2, p2, Lnd;->d:Lud;

    .line 3
    iget v0, p2, Lud;->o:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p2, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    if-ge v0, v2, :cond_2

    iget-object v2, p2, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljd;

    if-nez v2, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    throw v3

    :cond_2
    iget-object v0, p2, Lud;->i:Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p2, Lud;->i:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljd;

    throw v3

    :cond_4
    :goto_1
    iput-object v3, p2, Lud;->i:Ljava/util/ArrayList;

    :goto_2
    or-int/2addr p1, v1

    goto :goto_3

    .line 4
    :cond_5
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result p1

    :goto_3
    return p1
.end method

.method public onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lc0;->j(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, p2, p3}, Lc0;->j(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 6

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    iget-object v0, p0, Lc0;->g:Lld;

    .line 2
    iget-object v0, v0, Lld;->a:Lnd;

    iget-object v0, v0, Lnd;->d:Lud;

    const/4 v1, 0x1

    .line 3
    iput-boolean v1, v0, Lud;->w:Z

    invoke-virtual {v0}, Lud;->g()Z

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lud;->e(I)V

    const/4 v3, 0x0

    iput-object v3, v0, Lud;->p:Lnd;

    iput-object v3, v0, Lud;->q:Lnd;

    iput-object v3, v0, Lud;->r:Ljd;

    iget-object v4, v0, Lud;->j:Landroidx/activity/OnBackPressedDispatcher;

    if-eqz v4, :cond_1

    iget-object v4, v0, Lud;->k:Lpd;

    .line 4
    iget-object v4, v4, Lpd;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La;

    invoke-interface {v5}, La;->cancel()V

    goto :goto_0

    .line 5
    :cond_0
    iput-object v3, v0, Lud;->j:Landroidx/activity/OnBackPressedDispatcher;

    .line 6
    :cond_1
    iget-object v0, p0, Lc0;->h:Lte;

    sget-object v4, Loe$a;->ON_DESTROY:Loe$a;

    invoke-virtual {v0, v4}, Lte;->e(Loe$a;)V

    .line 7
    invoke-virtual {p0}, Lc0;->k()Le0;

    move-result-object v0

    check-cast v0, Ly0;

    if-eqz v0, :cond_5

    .line 8
    sget-object v4, Le0;->c:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    invoke-static {v0}, Le0;->j(Le0;)V

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iget-boolean v3, v0, Ly0;->T:Z

    if-eqz v3, :cond_2

    iget-object v3, v0, Ly0;->f:Landroid/view/Window;

    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v3

    iget-object v4, v0, Ly0;->V:Ljava/lang/Runnable;

    invoke-virtual {v3, v4}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_2
    iput-boolean v2, v0, Ly0;->L:Z

    iput-boolean v1, v0, Ly0;->M:Z

    iget-object v1, v0, Ly0;->i:Lp;

    .line 10
    iget-object v1, v0, Ly0;->R:Lt0;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lt0;->a()V

    :cond_3
    iget-object v0, v0, Ly0;->S:Lt0;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lt0;->a()V

    :cond_4
    return-void

    :catchall_0
    move-exception v0

    .line 11
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_5
    goto :goto_2

    :goto_1
    throw v3

    :goto_2
    goto :goto_1
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p0, p2}, Lc0;->s(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public onLowMemory()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V

    iget-object v0, p0, Lc0;->g:Lld;

    .line 2
    iget-object v0, v0, Lld;->a:Lnd;

    iget-object v0, v0, Lnd;->d:Lud;

    const/4 v1, 0x0

    .line 3
    :goto_0
    iget-object v2, v0, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, v0, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljd;

    if-nez v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    throw v0

    :cond_1
    return-void
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 6

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    goto :goto_3

    :cond_0
    if-eqz p1, :cond_5

    const/4 v0, 0x6

    if-eq p1, v0, :cond_2

    :cond_1
    :goto_0
    const/4 p1, 0x0

    goto :goto_3

    :cond_2
    iget-object p1, p0, Lc0;->g:Lld;

    .line 2
    iget-object p1, p1, Lld;->a:Lnd;

    iget-object p1, p1, Lnd;->d:Lud;

    .line 3
    iget v0, p1, Lud;->o:I

    if-ge v0, v3, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_1
    iget-object v4, p1, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v0, v4, :cond_1

    iget-object v4, p1, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljd;

    if-nez v4, :cond_4

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    throw v1

    .line 4
    :cond_5
    iget-object p1, p0, Lc0;->g:Lld;

    .line 5
    iget-object p1, p1, Lld;->a:Lnd;

    iget-object p1, p1, Lnd;->d:Lud;

    .line 6
    iget v0, p1, Lud;->o:I

    if-ge v0, v3, :cond_6

    goto :goto_0

    :cond_6
    const/4 v0, 0x0

    :goto_2
    iget-object v4, p1, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v0, v4, :cond_1

    iget-object v4, p1, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljd;

    if-nez v4, :cond_7

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_7
    throw v1

    :goto_3
    if-eqz p1, :cond_8

    return v3

    .line 7
    :cond_8
    invoke-virtual {p0}, Lc0;->l()Lp;

    move-result-object p1

    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    const v0, 0x102002c

    if-ne p2, v0, :cond_13

    if-eqz p1, :cond_13

    check-cast p1, Lj1;

    .line 8
    iget-object p1, p1, Lj1;->e:Ls5;

    check-cast p1, Lf7;

    .line 9
    iget p1, p1, Lf7;->b:I

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_13

    .line 10
    invoke-static {p0}, Lb1;->H(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_13

    .line 11
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x10

    if-lt p2, v0, :cond_9

    invoke-virtual {p0, p1}, Landroid/app/Activity;->shouldUpRecreateTask(Landroid/content/Intent;)Z

    move-result p2

    goto :goto_4

    :cond_9
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_a

    const-string v4, "android.intent.action.MAIN"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_a

    const/4 p2, 0x1

    goto :goto_4

    :cond_a
    const/4 p2, 0x0

    :goto_4
    if-eqz p2, :cond_11

    .line 12
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    invoke-static {p0}, Lb1;->H(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object p2

    if-nez p2, :cond_b

    .line 14
    invoke-static {p0}, Lb1;->H(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object p2

    :cond_b
    if-eqz p2, :cond_e

    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v4

    if-nez v4, :cond_c

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-virtual {p2, v4}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v4

    .line 15
    :cond_c
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v5

    :goto_5
    :try_start_0
    invoke-static {p0, v4}, Lb1;->I(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object v4

    if-eqz v4, :cond_d

    invoke-virtual {p1, v5, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {v4}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v4
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    .line 16
    :cond_d
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :catch_0
    move-exception p1

    const-string p2, "TaskStackBuilder"

    const-string v0, "Bad ComponentName while traversing activity parent metadata"

    .line 17
    invoke-static {p2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 18
    :cond_e
    :goto_6
    invoke-virtual {p0}, Lc0;->q()V

    .line 19
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_10

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    new-array p2, p2, [Landroid/content/Intent;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/content/Intent;

    new-instance p2, Landroid/content/Intent;

    aget-object v4, p1, v2

    invoke-direct {p2, v4}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    const v4, 0x1000c000

    invoke-virtual {p2, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object p2

    aput-object p2, p1, v2

    invoke-static {p0, p1, v1}, Lk9;->e(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)Z

    .line 20
    :try_start_1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v0, :cond_f

    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V

    goto :goto_7

    :cond_f
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_7

    .line 21
    :catch_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_7

    .line 22
    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No intents added to TaskStackBuilder; cannot startActivities"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 23
    :cond_11
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v0, :cond_12

    invoke-virtual {p0, p1}, Landroid/app/Activity;->navigateUpTo(Landroid/content/Intent;)Z

    goto :goto_7

    :cond_12
    const/high16 p2, 0x4000000

    invoke-virtual {p1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_7
    const/4 v2, 0x1

    :cond_13
    return v2
.end method

.method public onMenuOpened(ILandroid/view/Menu;)Z
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onMultiWindowModeChanged(Z)V
    .locals 2

    .line 1
    iget-object p1, p0, Lc0;->g:Lld;

    .line 2
    iget-object p1, p1, Lld;->a:Lnd;

    iget-object p1, p1, Lnd;->d:Lud;

    .line 3
    iget-object v0, p1, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    iget-object v1, p1, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljd;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    throw p1

    :cond_1
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    iget-object p1, p0, Lc0;->g:Lld;

    invoke-virtual {p1}, Lld;->b()V

    return-void
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 3

    if-eqz p1, :cond_0

    goto :goto_1

    .line 1
    :cond_0
    iget-object v0, p0, Lc0;->g:Lld;

    .line 2
    iget-object v0, v0, Lld;->a:Lnd;

    iget-object v0, v0, Lnd;->d:Lud;

    .line 3
    iget v1, v0, Lud;->o:I

    const/4 v2, 0x1

    if-ge v1, v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-object v2, v0, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    iget-object v2, v0, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljd;

    if-nez v2, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    throw p1

    .line 4
    :cond_3
    :goto_1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc0;->j:Z

    iget-object v0, p0, Lc0;->g:Lld;

    .line 2
    iget-object v0, v0, Lld;->a:Lnd;

    iget-object v0, v0, Lnd;->d:Lud;

    const/4 v1, 0x3

    .line 3
    invoke-virtual {v0, v1}, Lud;->e(I)V

    .line 4
    iget-object v0, p0, Lc0;->h:Lte;

    sget-object v1, Loe$a;->ON_PAUSE:Loe$a;

    invoke-virtual {v0, v1}, Lte;->e(Loe$a;)V

    return-void
.end method

.method public onPictureInPictureModeChanged(Z)V
    .locals 2

    .line 1
    iget-object p1, p0, Lc0;->g:Lld;

    .line 2
    iget-object p1, p1, Lld;->a:Lnd;

    iget-object p1, p1, Lnd;->d:Lud;

    .line 3
    iget-object v0, p1, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    iget-object v1, p1, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljd;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    throw p1

    :cond_1
    return-void
.end method

.method public onPostCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lc0;->k()Le0;

    move-result-object p1

    check-cast p1, Ly0;

    .line 1
    invoke-virtual {p1}, Ly0;->y()V

    return-void
.end method

.method public onPostResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    invoke-virtual {p0}, Lc0;->r()V

    .line 2
    invoke-virtual {p0}, Lc0;->k()Le0;

    move-result-object v0

    check-cast v0, Ly0;

    .line 3
    invoke-virtual {v0}, Ly0;->E()V

    iget-object v0, v0, Ly0;->i:Lp;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 4
    check-cast v0, Lj1;

    .line 5
    iput-boolean v1, v0, Lj1;->v:Z

    :cond_0
    return-void
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 2

    if-nez p1, :cond_3

    .line 1
    invoke-virtual {p0, p2, p3}, Lc0;->p(Landroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    iget-object p2, p0, Lc0;->g:Lld;

    .line 2
    iget-object p2, p2, Lld;->a:Lnd;

    iget-object p2, p2, Lnd;->d:Lud;

    .line 3
    iget p3, p2, Lud;->o:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ge p3, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 p3, 0x0

    :goto_0
    iget-object v0, p2, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p3, v0, :cond_2

    iget-object v0, p2, Lud;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljd;

    if-nez v0, :cond_1

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    throw p1

    :cond_2
    :goto_1
    or-int/2addr p1, v1

    goto :goto_2

    .line 4
    :cond_3
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    :goto_2
    return p1
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    iget-object p2, p0, Lc0;->g:Lld;

    invoke-virtual {p2}, Lld;->b()V

    shr-int/lit8 p1, p1, 0x10

    const p2, 0xffff

    and-int/2addr p1, p2

    if-eqz p1, :cond_1

    add-int/lit8 p1, p1, -0x1

    iget-object p2, p0, Lc0;->m:Lc8;

    invoke-virtual {p2, p1}, Lc8;->d(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iget-object p3, p0, Lc0;->m:Lc8;

    invoke-virtual {p3, p1}, Lc8;->h(I)V

    const-string p1, "FragmentActivity"

    if-nez p2, :cond_0

    const-string p2, "Activity result delivered for unknown Fragment."

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lc0;->g:Lld;

    invoke-virtual {p3, p2}, Lld;->a(Ljava/lang/String;)V

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Activity result no fragment exists for who: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc0;->j:Z

    iget-object v0, p0, Lc0;->g:Lld;

    invoke-virtual {v0}, Lld;->b()V

    iget-object v0, p0, Lc0;->g:Lld;

    .line 2
    iget-object v0, v0, Lld;->a:Lnd;

    iget-object v0, v0, Lnd;->d:Lud;

    invoke-virtual {v0}, Lud;->g()Z

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lc0;->n()V

    iget-object v0, p0, Lc0;->h:Lte;

    sget-object v1, Loe$a;->ON_STOP:Loe$a;

    invoke-virtual {v0, v1}, Lte;->e(Loe$a;)V

    iget-object v0, p0, Lc0;->g:Lld;

    .line 2
    iget-object v0, v0, Lld;->a:Lnd;

    iget-object v0, v0, Lnd;->d:Lud;

    .line 3
    iget-object v1, v0, Lud;->D:Ljava/util/ArrayList;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    :goto_0
    iget-object v1, v0, Lud;->D:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, v0, Lud;->D:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltd;

    invoke-virtual {v1}, Ltd;->a()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v1, v0, Lud;->g:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljd;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    throw v4

    .line 5
    :cond_2
    invoke-virtual {v0}, Lud;->g()Z

    const/4 v1, 0x1

    iput-boolean v1, v0, Lud;->u:Z

    iget-object v1, v0, Lud;->g:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_3

    :cond_3
    iget-object v1, v0, Lud;->g:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v0, v0, Lud;->g:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljd;

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    throw v4

    .line 6
    :cond_5
    :goto_3
    iget-object v0, p0, Lc0;->m:Lc8;

    invoke-virtual {v0}, Lc8;->i()I

    move-result v0

    if-lez v0, :cond_7

    iget v0, p0, Lc0;->l:I

    const-string v1, "android:support:next_request_index"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lc0;->m:Lc8;

    invoke-virtual {v0}, Lc8;->i()I

    move-result v0

    new-array v0, v0, [I

    iget-object v1, p0, Lc0;->m:Lc8;

    invoke-virtual {v1}, Lc8;->i()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    :goto_4
    iget-object v3, p0, Lc0;->m:Lc8;

    invoke-virtual {v3}, Lc8;->i()I

    move-result v3

    if-ge v2, v3, :cond_6

    iget-object v3, p0, Lc0;->m:Lc8;

    invoke-virtual {v3, v2}, Lc8;->f(I)I

    move-result v3

    aput v3, v0, v2

    iget-object v3, p0, Lc0;->m:Lc8;

    invoke-virtual {v3, v2}, Lc8;->j(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    const-string v2, "android:support:request_indicies"

    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    const-string v0, "android:support:request_fragment_who"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 7
    :cond_7
    invoke-virtual {p0}, Lc0;->k()Le0;

    move-result-object p1

    check-cast p1, Ly0;

    .line 8
    iget v0, p1, Ly0;->N:I

    const/16 v1, -0x64

    if-eq v0, v1, :cond_8

    sget-object v0, Ly0;->a0:Ljava/util/Map;

    iget-object v1, p1, Ly0;->d:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    iget p1, p1, Ly0;->N:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast v0, Lb8;

    invoke-virtual {v0, v1, p1}, Lb8;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    return-void
.end method

.method public onStart()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc0;->k:Z

    iget-boolean v1, p0, Lc0;->i:Z

    const/4 v2, 0x1

    if-nez v1, :cond_0

    iput-boolean v2, p0, Lc0;->i:Z

    iget-object v1, p0, Lc0;->g:Lld;

    .line 2
    iget-object v1, v1, Lld;->a:Lnd;

    iget-object v1, v1, Lnd;->d:Lud;

    .line 3
    iput-boolean v0, v1, Lud;->u:Z

    iput-boolean v0, v1, Lud;->v:Z

    const/4 v3, 0x2

    invoke-virtual {v1, v3}, Lud;->e(I)V

    .line 4
    :cond_0
    iget-object v1, p0, Lc0;->g:Lld;

    invoke-virtual {v1}, Lld;->b()V

    iget-object v1, p0, Lc0;->g:Lld;

    .line 5
    iget-object v1, v1, Lld;->a:Lnd;

    iget-object v1, v1, Lnd;->d:Lud;

    invoke-virtual {v1}, Lud;->g()Z

    .line 6
    iget-object v1, p0, Lc0;->h:Lte;

    sget-object v3, Loe$a;->ON_START:Loe$a;

    invoke-virtual {v1, v3}, Lte;->e(Loe$a;)V

    iget-object v1, p0, Lc0;->g:Lld;

    .line 7
    iget-object v1, v1, Lld;->a:Lnd;

    iget-object v1, v1, Lnd;->d:Lud;

    .line 8
    iput-boolean v0, v1, Lud;->u:Z

    iput-boolean v0, v1, Lud;->v:Z

    const/4 v0, 0x3

    invoke-virtual {v1, v0}, Lud;->e(I)V

    .line 9
    invoke-virtual {p0}, Lc0;->k()Le0;

    move-result-object v0

    check-cast v0, Ly0;

    .line 10
    iput-boolean v2, v0, Ly0;->L:Z

    invoke-virtual {v0}, Ly0;->p()Z

    .line 11
    sget-object v1, Le0;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-static {v0}, Le0;->j(Le0;)V

    sget-object v2, Le0;->b:Lw7;

    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Lw7;->add(Ljava/lang/Object;)Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onStateNotSaved()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc0;->g:Lld;

    invoke-virtual {v0}, Lld;->b()V

    return-void
.end method

.method public onStop()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc0;->k:Z

    invoke-virtual {p0}, Lc0;->n()V

    iget-object v1, p0, Lc0;->g:Lld;

    .line 2
    iget-object v1, v1, Lld;->a:Lnd;

    iget-object v1, v1, Lnd;->d:Lud;

    .line 3
    iput-boolean v0, v1, Lud;->v:Z

    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Lud;->e(I)V

    .line 4
    iget-object v0, p0, Lc0;->h:Lte;

    sget-object v1, Loe$a;->ON_STOP:Loe$a;

    invoke-virtual {v0, v1}, Lte;->e(Loe$a;)V

    .line 5
    invoke-virtual {p0}, Lc0;->k()Le0;

    move-result-object v0

    invoke-virtual {v0}, Le0;->i()V

    return-void
.end method

.method public onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    invoke-virtual {p0}, Lc0;->k()Le0;

    move-result-object p2

    invoke-virtual {p2, p1}, Le0;->o(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public openOptionsMenu()V
    .locals 3

    invoke-virtual {p0}, Lc0;->l()Lp;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    :cond_0
    return-void
.end method

.method public p(Landroid/view/View;Landroid/view/Menu;)Z
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-super {p0, v0, p1, p2}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public q()V
    .locals 0

    return-void
.end method

.method public r()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc0;->h:Lte;

    sget-object v1, Loe$a;->ON_RESUME:Loe$a;

    invoke-virtual {v0, v1}, Lte;->e(Loe$a;)V

    iget-object v0, p0, Lc0;->g:Lld;

    .line 2
    iget-object v0, v0, Lld;->a:Lnd;

    iget-object v0, v0, Lnd;->d:Lud;

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, v0, Lud;->u:Z

    iput-boolean v1, v0, Lud;->v:Z

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lud;->e(I)V

    return-void
.end method

.method public final s(Landroid/view/KeyEvent;)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v0

    invoke-static {v0}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-static {v0}, Landroid/view/KeyEvent;->isModifierKey(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public setContentView(I)V
    .locals 1

    invoke-virtual {p0}, Lc0;->k()Le0;

    move-result-object v0

    invoke-virtual {v0, p1}, Le0;->l(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, Lc0;->k()Le0;

    move-result-object v0

    invoke-virtual {v0, p1}, Le0;->m(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Lc0;->k()Le0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Le0;->n(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setTheme(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Activity;->setTheme(I)V

    invoke-virtual {p0}, Lc0;->k()Le0;

    move-result-object v0

    check-cast v0, Ly0;

    .line 1
    iput p1, v0, Ly0;->O:I

    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;I)V
    .locals 1

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 1
    invoke-static {p2}, Lc0;->i(I)V

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 1

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 2
    invoke-static {p2}, Lc0;->i(I)V

    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    .locals 1

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 1
    invoke-static {p2}, Lc0;->i(I)V

    :cond_0
    invoke-super/range {p0 .. p6}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V

    return-void
.end method

.method public startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .locals 1

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 2
    invoke-static {p2}, Lc0;->i(I)V

    :cond_0
    invoke-super/range {p0 .. p7}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void
.end method
