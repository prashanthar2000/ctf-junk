.class public Lx;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/view/LayoutInflater;

.field public c:I

.field public d:Landroid/graphics/drawable/Drawable;

.field public e:I

.field public f:Ljava/lang/CharSequence;

.field public g:Landroid/view/View;

.field public h:Z

.field public i:Landroid/content/DialogInterface$OnCancelListener;

.field public j:Landroid/content/DialogInterface$OnDismissListener;

.field public k:Landroid/content/DialogInterface$OnKeyListener;

.field public l:Landroid/widget/ListAdapter;

.field public m:Landroid/content/DialogInterface$OnClickListener;

.field public n:Z

.field public o:Z

.field public p:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lx;->c:I

    iput v0, p0, Lx;->e:I

    iput-boolean v0, p0, Lx;->n:Z

    const/4 v0, -0x1

    iput v0, p0, Lx;->p:I

    iput-object p1, p0, Lx;->a:Landroid/content/Context;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx;->h:Z

    const-string v0, "layout_inflater"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    iput-object p1, p0, Lx;->b:Landroid/view/LayoutInflater;

    return-void
.end method
