.class public Lc5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic b:Lf5;


# direct methods
.method public constructor <init>(Lf5;Lj5;)V
    .locals 0

    iput-object p1, p0, Lc5;->b:Lf5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-object p1, p0, Lc5;->b:Lf5;

    iget-object p1, p1, Lf5;->K:Lj5;

    invoke-virtual {p1, p3}, Landroid/widget/Spinner;->setSelection(I)V

    iget-object p1, p0, Lc5;->b:Lf5;

    iget-object p1, p1, Lf5;->K:Lj5;

    invoke-virtual {p1}, Landroid/widget/Spinner;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lc5;->b:Lf5;

    iget-object p4, p1, Lf5;->K:Lj5;

    iget-object p1, p1, Lf5;->H:Landroid/widget/ListAdapter;

    invoke-interface {p1, p3}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v0

    invoke-virtual {p4, p2, p3, v0, v1}, Landroid/widget/Spinner;->performItemClick(Landroid/view/View;IJ)Z

    :cond_0
    iget-object p1, p0, Lc5;->b:Lf5;

    invoke-virtual {p1}, Li6;->dismiss()V

    return-void
.end method
