.class public Lh6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Li6;


# direct methods
.method public constructor <init>(Li6;)V
    .locals 0

    iput-object p1, p0, Lh6;->b:Li6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lh6;->b:Li6;

    iget-object v0, v0, Li6;->d:Lw5;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lbc;->i(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh6;->b:Li6;

    iget-object v0, v0, Li6;->d:Lw5;

    invoke-virtual {v0}, Landroid/widget/ListView;->getCount()I

    move-result v0

    iget-object v1, p0, Lh6;->b:Li6;

    iget-object v1, v1, Li6;->d:Lw5;

    invoke-virtual {v1}, Landroid/widget/ListView;->getChildCount()I

    move-result v1

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lh6;->b:Li6;

    iget-object v0, v0, Li6;->d:Lw5;

    invoke-virtual {v0}, Landroid/widget/ListView;->getChildCount()I

    move-result v0

    iget-object v1, p0, Lh6;->b:Li6;

    iget v2, v1, Li6;->p:I

    if-gt v0, v2, :cond_0

    iget-object v0, v1, Li6;->C:Landroid/widget/PopupWindow;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    iget-object v0, p0, Lh6;->b:Li6;

    invoke-virtual {v0}, Li6;->i()V

    :cond_0
    return-void
.end method
