.class public Lw;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic b:Landroidx/appcompat/app/AlertController;

.field public final synthetic c:Lx;


# direct methods
.method public constructor <init>(Lx;Landroidx/appcompat/app/AlertController;)V
    .locals 0

    iput-object p1, p0, Lw;->c:Lx;

    iput-object p2, p0, Lw;->b:Landroidx/appcompat/app/AlertController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-object p1, p0, Lw;->c:Lx;

    iget-object p1, p1, Lx;->m:Landroid/content/DialogInterface$OnClickListener;

    iget-object p2, p0, Lw;->b:Landroidx/appcompat/app/AlertController;

    iget-object p2, p2, Landroidx/appcompat/app/AlertController;->b:Lb0;

    invoke-interface {p1, p2, p3}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    iget-object p1, p0, Lw;->c:Lx;

    iget-boolean p1, p1, Lx;->o:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lw;->b:Landroidx/appcompat/app/AlertController;

    iget-object p1, p1, Landroidx/appcompat/app/AlertController;->b:Lb0;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method
