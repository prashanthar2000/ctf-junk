.class public Lag;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source ""


# instance fields
.field public a:I

.field public b:Lzf;

.field public c:Landroid/content/res/ColorStateList;

.field public d:Landroid/graphics/PorterDuff$Mode;

.field public e:Z

.field public f:Landroid/graphics/Bitmap;

.field public g:Landroid/content/res/ColorStateList;

.field public h:Landroid/graphics/PorterDuff$Mode;

.field public i:I

.field public j:Z

.field public k:Z

.field public l:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lag;->c:Landroid/content/res/ColorStateList;

    sget-object v0, Lcg;->k:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Lag;->d:Landroid/graphics/PorterDuff$Mode;

    new-instance v0, Lzf;

    invoke-direct {v0}, Lzf;-><init>()V

    iput-object v0, p0, Lag;->b:Lzf;

    return-void
.end method

.method public constructor <init>(Lag;)V
    .locals 3

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lag;->c:Landroid/content/res/ColorStateList;

    sget-object v0, Lcg;->k:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Lag;->d:Landroid/graphics/PorterDuff$Mode;

    if-eqz p1, :cond_2

    iget v0, p1, Lag;->a:I

    iput v0, p0, Lag;->a:I

    new-instance v0, Lzf;

    iget-object v1, p1, Lag;->b:Lzf;

    invoke-direct {v0, v1}, Lzf;-><init>(Lzf;)V

    iput-object v0, p0, Lag;->b:Lzf;

    iget-object v1, p1, Lag;->b:Lzf;

    iget-object v1, v1, Lzf;->e:Landroid/graphics/Paint;

    if-eqz v1, :cond_0

    new-instance v1, Landroid/graphics/Paint;

    iget-object v2, p1, Lag;->b:Lzf;

    iget-object v2, v2, Lzf;->e:Landroid/graphics/Paint;

    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v1, v0, Lzf;->e:Landroid/graphics/Paint;

    :cond_0
    iget-object v0, p1, Lag;->b:Lzf;

    iget-object v0, v0, Lzf;->d:Landroid/graphics/Paint;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lag;->b:Lzf;

    new-instance v1, Landroid/graphics/Paint;

    iget-object v2, p1, Lag;->b:Lzf;

    iget-object v2, v2, Lzf;->d:Landroid/graphics/Paint;

    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v1, v0, Lzf;->d:Landroid/graphics/Paint;

    :cond_1
    iget-object v0, p1, Lag;->c:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lag;->c:Landroid/content/res/ColorStateList;

    iget-object v0, p1, Lag;->d:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Lag;->d:Landroid/graphics/PorterDuff$Mode;

    iget-boolean p1, p1, Lag;->e:Z

    iput-boolean p1, p0, Lag;->e:Z

    :cond_2
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, Lag;->b:Lzf;

    .line 1
    iget-object v1, v0, Lzf;->o:Ljava/lang/Boolean;

    if-nez v1, :cond_0

    iget-object v1, v0, Lzf;->h:Lwf;

    invoke-virtual {v1}, Lwf;->a()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lzf;->o:Ljava/lang/Boolean;

    :cond_0
    iget-object v0, v0, Lzf;->o:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public b(II)V
    .locals 9

    iget-object v0, p0, Lag;->f:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->eraseColor(I)V

    new-instance v5, Landroid/graphics/Canvas;

    iget-object v0, p0, Lag;->f:Landroid/graphics/Bitmap;

    invoke-direct {v5, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iget-object v2, p0, Lag;->b:Lzf;

    .line 1
    iget-object v3, v2, Lzf;->h:Lwf;

    sget-object v4, Lzf;->q:Landroid/graphics/Matrix;

    const/4 v8, 0x0

    move v6, p1

    move v7, p2

    invoke-virtual/range {v2 .. v8}, Lzf;->a(Lwf;Landroid/graphics/Matrix;Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V

    return-void
.end method

.method public getChangingConfigurations()I
    .locals 1

    iget v0, p0, Lag;->a:I

    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    new-instance v0, Lcg;

    invoke-direct {v0, p0}, Lcg;-><init>(Lag;)V

    return-object v0
.end method

.method public newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 0

    new-instance p1, Lcg;

    invoke-direct {p1, p0}, Lcg;-><init>(Lag;)V

    return-object p1
.end method
