.class public final Ljb;
.super Landroid/view/View$AccessibilityDelegate;
.source ""


# instance fields
.field public final a:Lkb;


# direct methods
.method public constructor <init>(Lkb;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    iput-object p1, p0, Ljb;->a:Lkb;

    return-void
.end method


# virtual methods
.method public dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    iget-object v0, p0, Ljb;->a:Lkb;

    .line 1
    iget-object v0, v0, Lkb;->a:Landroid/view/View$AccessibilityDelegate;

    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 4

    iget-object v0, p0, Ljb;->a:Lkb;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x10

    if-lt v2, v3, :cond_0

    iget-object v0, v0, Lkb;->a:Landroid/view/View$AccessibilityDelegate;

    invoke-virtual {v0, p1}, Landroid/view/View$AccessibilityDelegate;->getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lnc;

    invoke-direct {v0, p1}, Lnc;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 2
    iget-object p1, v0, Lnc;->a:Ljava/lang/Object;

    .line 3
    move-object v1, p1

    check-cast v1, Landroid/view/accessibility/AccessibilityNodeProvider;

    :cond_1
    return-object v1

    .line 4
    :cond_2
    throw v1
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, Ljb;->a:Lkb;

    invoke-virtual {v0, p1, p2}, Lkb;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 17

    move-object/from16 v0, p1

    .line 1
    new-instance v1, Lmc;

    move-object/from16 v2, p2

    invoke-direct {v1, v2}, Lmc;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    invoke-static/range {p1 .. p1}, Lbc;->k(Landroid/view/View;)Z

    move-result v3

    .line 3
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1c

    if-lt v4, v5, :cond_0

    iget-object v4, v1, Lmc;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v4, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScreenReaderFocusable(Z)V

    goto :goto_0

    :cond_0
    const/4 v4, 0x1

    invoke-virtual {v1, v4, v3}, Lmc;->d(IZ)V

    .line 4
    :goto_0
    new-instance v3, Lxb;

    sget v4, Lh9;->tag_accessibility_heading:I

    const-class v6, Ljava/lang/Boolean;

    invoke-direct {v3, v4, v6, v5}, Lxb;-><init>(ILjava/lang/Class;I)V

    .line 5
    invoke-virtual {v3, v0}, Lyb;->b(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    if-nez v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    .line 6
    :goto_1
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v6, v5, :cond_2

    iget-object v6, v1, Lmc;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v6, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setHeading(Z)V

    goto :goto_2

    :cond_2
    const/4 v6, 0x2

    invoke-virtual {v1, v6, v3}, Lmc;->d(IZ)V

    .line 7
    :goto_2
    new-instance v3, Lwb;

    sget v6, Lh9;->tag_accessibility_pane_title:I

    const-class v7, Ljava/lang/CharSequence;

    const/16 v8, 0x8

    invoke-direct {v3, v6, v7, v8, v5}, Lwb;-><init>(ILjava/lang/Class;II)V

    .line 8
    invoke-virtual {v3, v0}, Lyb;->b(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    .line 9
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x13

    if-lt v6, v5, :cond_3

    iget-object v5, v1, Lmc;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v5, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPaneTitle(Ljava/lang/CharSequence;)V

    goto :goto_3

    :cond_3
    if-lt v6, v7, :cond_4

    iget-object v5, v1, Lmc;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    const-string v6, "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"

    invoke-virtual {v5, v6, v3}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :cond_4
    :goto_3
    move-object/from16 v3, p0

    .line 10
    iget-object v5, v3, Ljb;->a:Lkb;

    invoke-virtual {v5, v0, v1}, Lkb;->b(Landroid/view/View;Lmc;)V

    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    .line 11
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v5, v7, :cond_c

    const/16 v6, 0x1a

    if-ge v5, v6, :cond_c

    const-string v6, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"

    const-string v8, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"

    const-string v9, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"

    const-string v10, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"

    if-lt v5, v7, :cond_5

    .line 12
    iget-object v5, v1, Lmc;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {v5, v10}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget-object v5, v1, Lmc;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {v5, v9}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget-object v5, v1, Lmc;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {v5, v8}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget-object v5, v1, Lmc;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 13
    :cond_5
    sget v5, Lh9;->tag_accessibility_clickable_spans:I

    invoke-virtual {v0, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/util/SparseArray;

    if-eqz v5, :cond_8

    .line 14
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    const/4 v11, 0x0

    :goto_4
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v12

    if-ge v11, v12, :cond_7

    invoke-virtual {v5, v11}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/ref/WeakReference;

    invoke-virtual {v12}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_6

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    :cond_7
    const/4 v11, 0x0

    :goto_5
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-ge v11, v12, :cond_8

    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-virtual {v5, v12}, Landroid/util/SparseArray;->remove(I)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_5

    .line 15
    :cond_8
    invoke-static {v2}, Lmc;->b(Ljava/lang/CharSequence;)[Landroid/text/style/ClickableSpan;

    move-result-object v5

    if-eqz v5, :cond_c

    array-length v7, v5

    if-lez v7, :cond_c

    invoke-virtual {v1}, Lmc;->c()Landroid/os/Bundle;

    move-result-object v7

    sget v11, Lh9;->accessibility_action_clickable_span:I

    const-string v12, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"

    invoke-virtual {v7, v12, v11}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 16
    sget v7, Lh9;->tag_accessibility_clickable_spans:I

    invoke-virtual {v0, v7}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/util/SparseArray;

    if-nez v7, :cond_9

    .line 17
    new-instance v7, Landroid/util/SparseArray;

    invoke-direct {v7}, Landroid/util/SparseArray;-><init>()V

    sget v11, Lh9;->tag_accessibility_clickable_spans:I

    invoke-virtual {v0, v11, v7}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_9
    const/4 v11, 0x0

    .line 18
    :goto_6
    array-length v12, v5

    if-ge v11, v12, :cond_c

    aget-object v12, v5, v11

    const/4 v13, 0x0

    .line 19
    :goto_7
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    move-result v14

    if-ge v13, v14, :cond_b

    invoke-virtual {v7, v13}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/ref/WeakReference;

    invoke-virtual {v14}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/text/style/ClickableSpan;

    invoke-virtual {v12, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    invoke-virtual {v7, v13}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v12

    goto :goto_8

    :cond_a
    add-int/lit8 v13, v13, 0x1

    goto :goto_7

    :cond_b
    sget v12, Lmc;->d:I

    add-int/lit8 v13, v12, 0x1

    sput v13, Lmc;->d:I

    .line 20
    :goto_8
    new-instance v13, Ljava/lang/ref/WeakReference;

    aget-object v14, v5, v11

    invoke-direct {v13, v14}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v7, v12, v13}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    aget-object v13, v5, v11

    move-object v14, v2

    check-cast v14, Landroid/text/Spanned;

    .line 21
    invoke-virtual {v1, v10}, Lmc;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v15

    invoke-interface {v14, v13}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v16

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v15, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v9}, Lmc;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v14, v13}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v4, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v8}, Lmc;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v14, v13}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v4, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v6}, Lmc;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    goto :goto_6

    .line 22
    :cond_c
    sget v1, Lh9;->tag_accessibility_actions:I

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_d

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :cond_d
    const/4 v4, 0x0

    .line 23
    :goto_9
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v4, v1, :cond_f

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llc;

    .line 24
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-ge v1, v2, :cond_e

    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    :cond_e
    const/4 v0, 0x0

    throw v0

    :cond_f
    return-void
.end method

.method public onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, Ljb;->a:Lkb;

    .line 1
    iget-object v0, v0, Lkb;->a:Landroid/view/View$AccessibilityDelegate;

    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    iget-object v0, p0, Ljb;->a:Lkb;

    .line 1
    iget-object v0, v0, Lkb;->a:Landroid/view/View$AccessibilityDelegate;

    invoke-virtual {v0, p1, p2, p3}, Landroid/view/View$AccessibilityDelegate;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, Ljb;->a:Lkb;

    invoke-virtual {v0, p1, p2, p3}, Lkb;->c(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public sendAccessibilityEvent(Landroid/view/View;I)V
    .locals 1

    iget-object v0, p0, Ljb;->a:Lkb;

    .line 1
    iget-object v0, v0, Lkb;->a:Landroid/view/View$AccessibilityDelegate;

    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->sendAccessibilityEvent(Landroid/view/View;I)V

    return-void
.end method

.method public sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, Ljb;->a:Lkb;

    .line 1
    iget-object v0, v0, Lkb;->a:Landroid/view/View$AccessibilityDelegate;

    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method
