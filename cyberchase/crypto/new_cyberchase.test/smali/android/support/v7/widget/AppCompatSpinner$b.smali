.class final Landroid/support/v7/widget/AppCompatSpinner$b;
.super Landroid/support/v7/widget/ListPopupWindow;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/AppCompatSpinner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final a:Landroid/graphics/Rect;

.field final synthetic a:Landroid/support/v7/widget/AppCompatSpinner;

.field a:Landroid/widget/ListAdapter;

.field a:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/AppCompatSpinner;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/support/v7/widget/AppCompatSpinner;

    invoke-direct {p0, p2, p3, p4}, Landroid/support/v7/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/graphics/Rect;

    iput-object p1, p0, Landroid/support/v7/widget/ListPopupWindow;->a:Landroid/view/View;

    invoke-virtual {p0}, Landroid/support/v7/widget/AppCompatSpinner$b;->d()V

    const/4 p2, 0x0

    iput p2, p0, Landroid/support/v7/widget/ListPopupWindow;->e:I

    new-instance p2, Landroid/support/v7/widget/AppCompatSpinner$b$1;

    invoke-direct {p2, p0, p1}, Landroid/support/v7/widget/AppCompatSpinner$b$1;-><init>(Landroid/support/v7/widget/AppCompatSpinner$b;Landroid/support/v7/widget/AppCompatSpinner;)V

    iput-object p2, p0, Landroid/support/v7/widget/ListPopupWindow;->a:Landroid/widget/AdapterView$OnItemClickListener;

    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/AppCompatSpinner$b;)V
    .locals 0

    invoke-super {p0}, Landroid/support/v7/widget/ListPopupWindow;->a()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Landroid/support/v7/widget/ListPopupWindow;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    invoke-virtual {p0}, Landroid/support/v7/widget/AppCompatSpinner$b;->c()V

    invoke-virtual {p0}, Landroid/support/v7/widget/AppCompatSpinner$b;->e()V

    invoke-super {p0}, Landroid/support/v7/widget/ListPopupWindow;->a()V

    iget-object v1, p0, Landroid/support/v7/widget/ListPopupWindow;->a:Lie;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setChoiceMode(I)V

    iget-object v1, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/support/v7/widget/AppCompatSpinner;

    invoke-virtual {v1}, Landroid/support/v7/widget/AppCompatSpinner;->getSelectedItemPosition()I

    move-result v1

    iget-object v3, p0, Landroid/support/v7/widget/ListPopupWindow;->a:Lie;

    iget-object v4, p0, Landroid/support/v7/widget/ListPopupWindow;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v4}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v4

    if-eqz v4, :cond_0

    if-eqz v3, :cond_0

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lie;->setListSelectionHidden(Z)V

    invoke-virtual {v3, v1}, Lie;->setSelection(I)V

    invoke-virtual {v3}, Lie;->getChoiceMode()I

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3, v1, v2}, Lie;->setItemChecked(IZ)V

    :cond_0
    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/support/v7/widget/AppCompatSpinner;

    invoke-virtual {v0}, Landroid/support/v7/widget/AppCompatSpinner;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Landroid/support/v7/widget/AppCompatSpinner$b$2;

    invoke-direct {v1, p0}, Landroid/support/v7/widget/AppCompatSpinner$b$2;-><init>(Landroid/support/v7/widget/AppCompatSpinner$b;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    new-instance v0, Landroid/support/v7/widget/AppCompatSpinner$b$3;

    invoke-direct {v0, p0, v1}, Landroid/support/v7/widget/AppCompatSpinner$b$3;-><init>(Landroid/support/v7/widget/AppCompatSpinner$b;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/AppCompatSpinner$b;->a(Landroid/widget/PopupWindow$OnDismissListener;)V

    :cond_2
    return-void
.end method

.method public final a(Landroid/widget/ListAdapter;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/support/v7/widget/ListPopupWindow;->a(Landroid/widget/ListAdapter;)V

    iput-object p1, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/widget/ListAdapter;

    return-void
.end method

.method final c()V
    .locals 7

    iget-object v0, p0, Landroid/support/v7/widget/ListPopupWindow;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/support/v7/widget/AppCompatSpinner;

    iget-object v1, v1, Landroid/support/v7/widget/AppCompatSpinner;->a:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    iget-object v0, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/support/v7/widget/AppCompatSpinner;

    invoke-static {v0}, Liv;->a(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/support/v7/widget/AppCompatSpinner;

    iget-object v0, v0, Landroid/support/v7/widget/AppCompatSpinner;->a:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/support/v7/widget/AppCompatSpinner;

    iget-object v0, v0, Landroid/support/v7/widget/AppCompatSpinner;->a:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    neg-int v0, v0

    :goto_0
    move v1, v0

    goto :goto_1

    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/support/v7/widget/AppCompatSpinner;

    iget-object v0, v0, Landroid/support/v7/widget/AppCompatSpinner;->a:Landroid/graphics/Rect;

    iget-object v2, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/support/v7/widget/AppCompatSpinner;

    iget-object v2, v2, Landroid/support/v7/widget/AppCompatSpinner;->a:Landroid/graphics/Rect;

    iput v1, v2, Landroid/graphics/Rect;->right:I

    iput v1, v0, Landroid/graphics/Rect;->left:I

    :goto_1
    iget-object v0, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/support/v7/widget/AppCompatSpinner;

    invoke-virtual {v0}, Landroid/support/v7/widget/AppCompatSpinner;->getPaddingLeft()I

    move-result v0

    iget-object v2, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/support/v7/widget/AppCompatSpinner;

    invoke-virtual {v2}, Landroid/support/v7/widget/AppCompatSpinner;->getPaddingRight()I

    move-result v2

    iget-object v3, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/support/v7/widget/AppCompatSpinner;

    invoke-virtual {v3}, Landroid/support/v7/widget/AppCompatSpinner;->getWidth()I

    move-result v3

    iget-object v4, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/support/v7/widget/AppCompatSpinner;

    iget v4, v4, Landroid/support/v7/widget/AppCompatSpinner;->a:I

    const/4 v5, -0x2

    if-ne v4, v5, :cond_3

    iget-object v4, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/support/v7/widget/AppCompatSpinner;

    iget-object v5, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/widget/ListAdapter;

    check-cast v5, Landroid/widget/SpinnerAdapter;

    iget-object v6, p0, Landroid/support/v7/widget/ListPopupWindow;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v6}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/support/v7/widget/AppCompatSpinner;->a(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I

    move-result v4

    iget-object v5, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/support/v7/widget/AppCompatSpinner;

    invoke-virtual {v5}, Landroid/support/v7/widget/AppCompatSpinner;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    iget-object v6, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/support/v7/widget/AppCompatSpinner;

    iget-object v6, v6, Landroid/support/v7/widget/AppCompatSpinner;->a:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->left:I

    sub-int/2addr v5, v6

    iget-object v6, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/support/v7/widget/AppCompatSpinner;

    iget-object v6, v6, Landroid/support/v7/widget/AppCompatSpinner;->a:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->right:I

    sub-int/2addr v5, v6

    if-le v4, v5, :cond_2

    move v4, v5

    :cond_2
    sub-int v5, v3, v0

    sub-int/2addr v5, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    goto :goto_2

    :cond_3
    iget-object v4, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/support/v7/widget/AppCompatSpinner;

    iget v4, v4, Landroid/support/v7/widget/AppCompatSpinner;->a:I

    const/4 v5, -0x1

    if-ne v4, v5, :cond_4

    sub-int v4, v3, v0

    sub-int/2addr v4, v2

    goto :goto_2

    :cond_4
    iget-object v4, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/support/v7/widget/AppCompatSpinner;

    iget v4, v4, Landroid/support/v7/widget/AppCompatSpinner;->a:I

    :goto_2
    invoke-virtual {p0, v4}, Landroid/support/v7/widget/AppCompatSpinner$b;->b(I)V

    iget-object v4, p0, Landroid/support/v7/widget/AppCompatSpinner$b;->a:Landroid/support/v7/widget/AppCompatSpinner;

    invoke-static {v4}, Liv;->a(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_5

    sub-int/2addr v3, v2

    iget v0, p0, Landroid/support/v7/widget/ListPopupWindow;->a:I

    sub-int/2addr v3, v0

    add-int/2addr v1, v3

    goto :goto_3

    :cond_5
    add-int/2addr v1, v0

    :goto_3
    iput v1, p0, Landroid/support/v7/widget/ListPopupWindow;->b:I

    return-void
.end method
