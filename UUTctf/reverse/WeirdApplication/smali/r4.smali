.class public Lr4;
.super Landroid/widget/MultiAutoCompleteTextView;
.source ""

# interfaces
.implements Ltb;


# static fields
.field public static final d:[I


# instance fields
.field public final b:Lg4;

.field public final c:Ln5;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x1010176

    aput v2, v0, v1

    sput-object v0, Lr4;->d:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    sget v0, Lf;->autoCompleteTextViewStyle:I

    .line 1
    invoke-static {p1}, Ly6;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, v0}, Landroid/widget/MultiAutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/widget/MultiAutoCompleteTextView;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v1, Lr4;->d:[I

    const/4 v2, 0x0

    invoke-static {p1, p2, v1, v0, v2}, Lb7;->o(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lb7;

    move-result-object p1

    invoke-virtual {p1, v2}, Lb7;->m(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v2}, Lb7;->e(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/widget/MultiAutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    :cond_0
    iget-object p1, p1, Lb7;->b:Landroid/content/res/TypedArray;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 3
    new-instance p1, Lg4;

    invoke-direct {p1, p0}, Lg4;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lr4;->b:Lg4;

    invoke-virtual {p1, p2, v0}, Lg4;->d(Landroid/util/AttributeSet;I)V

    new-instance p1, Ln5;

    invoke-direct {p1, p0}, Ln5;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Lr4;->c:Ln5;

    invoke-virtual {p1, p2, v0}, Ln5;->e(Landroid/util/AttributeSet;I)V

    iget-object p1, p0, Lr4;->c:Ln5;

    invoke-virtual {p1}, Ln5;->b()V

    return-void
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/MultiAutoCompleteTextView;->drawableStateChanged()V

    iget-object v0, p0, Lr4;->b:Lg4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg4;->a()V

    :cond_0
    iget-object v0, p0, Lr4;->c:Ln5;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ln5;->b()V

    :cond_1
    return-void
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lr4;->b:Lg4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg4;->b()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lr4;->b:Lg4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg4;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    invoke-static {v0, p1, p0}, Lb1;->W(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)Landroid/view/inputmethod/InputConnection;

    return-object v0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lr4;->b:Lg4;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lg4;->e()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->setBackgroundResource(I)V

    iget-object v0, p0, Lr4;->b:Lg4;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg4;->f(I)V

    :cond_0
    return-void
.end method

.method public setDropDownBackgroundResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/MultiAutoCompleteTextView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ll1;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lr4;->b:Lg4;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg4;->h(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lr4;->b:Lg4;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg4;->i(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/MultiAutoCompleteTextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, Lr4;->c:Ln5;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Ln5;->f(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method
