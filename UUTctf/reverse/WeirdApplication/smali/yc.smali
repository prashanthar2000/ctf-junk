.class public Lyc;
.super Landroid/database/DataSetObserver;
.source ""


# instance fields
.field public final synthetic a:Lzc;


# direct methods
.method public constructor <init>(Lzc;)V
    .locals 0

    iput-object p1, p0, Lyc;->a:Lzc;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 2

    iget-object v0, p0, Lyc;->a:Lzc;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lzc;->b:Z

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public onInvalidated()V
    .locals 2

    iget-object v0, p0, Lyc;->a:Lzc;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lzc;->b:Z

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    return-void
.end method
