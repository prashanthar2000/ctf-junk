.class final Lcom/flag/test/MainActivity$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/flag/test/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/flag/test/MainActivity;


# direct methods
.method constructor <init>(Lcom/flag/test/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/flag/test/MainActivity$1;->a:Lcom/flag/test/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/flag/test/MainActivity$1;->a:Lcom/flag/test/MainActivity;

    iget v0, p1, Lcom/flag/test/MainActivity;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Lcom/flag/test/MainActivity;->b:I

    iget-object p1, p0, Lcom/flag/test/MainActivity$1;->a:Lcom/flag/test/MainActivity;

    iget p1, p1, Lcom/flag/test/MainActivity;->b:I

    const/16 v0, 0xa

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/flag/test/MainActivity$1;->a:Lcom/flag/test/MainActivity;

    const-string v0, "Oh, the flag looks incomplete. Fishy!"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    iget-object p1, p0, Lcom/flag/test/MainActivity$1;->a:Lcom/flag/test/MainActivity;

    iput v1, p1, Lcom/flag/test/MainActivity;->b:I

    return-void

    :cond_0
    iget-object p1, p0, Lcom/flag/test/MainActivity$1;->a:Lcom/flag/test/MainActivity;

    iget p1, p1, Lcom/flag/test/MainActivity;->b:I

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/flag/test/MainActivity$1;->a:Lcom/flag/test/MainActivity;

    iget-object p1, p1, Lcom/flag/test/MainActivity;->a:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/flag/test/MainActivity$1;->a:Lcom/flag/test/MainActivity;

    iget-object v1, v1, Lcom/flag/test/MainActivity;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/flag/test/MainActivity$1;->a:Lcom/flag/test/MainActivity;

    iget-object v1, v1, Lcom/flag/test/MainActivity;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method
