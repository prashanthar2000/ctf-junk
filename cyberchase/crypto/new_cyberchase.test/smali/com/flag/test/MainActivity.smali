.class public Lcom/flag/test/MainActivity;
.super Landroid/support/v7/app/AppCompatActivity;


# instance fields
.field a:Landroid/widget/Button;

.field a:Landroid/widget/TextView;

.field a:Ljava/lang/String;

.field b:I

.field b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/flag/test/MainActivity;->b:I

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f09001c

    invoke-virtual {p0, p1}, Lcom/flag/test/MainActivity;->setContentView(I)V

    const p1, 0x7f07003d

    invoke-virtual {p0, p1}, Lcom/flag/test/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/flag/test/MainActivity;->a:Landroid/widget/TextView;

    const p1, 0x7f070022

    invoke-virtual {p0, p1}, Lcom/flag/test/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/flag/test/MainActivity;->a:Landroid/widget/Button;

    invoke-static {p0}, Ljb;->a(Landroid/content/Context;)I

    move-result p1

    const-string v0, "The Flag is: "

    iput-object v0, p0, Lcom/flag/test/MainActivity;->b:Ljava/lang/String;

    if-gtz p1, :cond_0

    const-string p1, "Application Tampered"

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    invoke-virtual {p0}, Lcom/flag/test/MainActivity;->finishAffinity()V

    :cond_0
    const-string p1, "cyberchase{damm_easy"

    iput-object p1, p0, Lcom/flag/test/MainActivity;->a:Ljava/lang/String;

    iget-object p1, p0, Lcom/flag/test/MainActivity;->a:Landroid/widget/Button;

    new-instance v0, Lcom/flag/test/MainActivity$1;

    invoke-direct {v0, p0}, Lcom/flag/test/MainActivity$1;-><init>(Lcom/flag/test/MainActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p1, Lja;

    invoke-direct {p1}, Lja;-><init>()V

    const-string v0, "c3RyaW5ncy54bWw"

    invoke-virtual {p1, v0}, Lja;->a(Ljava/lang/String;)V

    const-string v0, "c3RyaW5ncy54bWw"

    invoke-virtual {p1, v0}, Lja;->a(Ljava/lang/String;)V

    const-string v0, "c3RyaW5ncy54bWw"

    invoke-virtual {p1, v0}, Lja;->a(Ljava/lang/String;)V

    return-void
.end method
