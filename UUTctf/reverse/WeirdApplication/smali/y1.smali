.class public abstract Ly1;
.super Lw1;
.source ""


# instance fields
.field public J:[[I


# direct methods
.method public constructor <init>(Ly1;Lz1;Landroid/content/res/Resources;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lw1;-><init>(Lw1;Lx1;Landroid/content/res/Resources;)V

    if-eqz p1, :cond_0

    iget-object p1, p1, Ly1;->J:[[I

    iput-object p1, p0, Ly1;->J:[[I

    goto :goto_0

    .line 1
    :cond_0
    iget-object p1, p0, Lw1;->g:[Landroid/graphics/drawable/Drawable;

    array-length p1, p1

    .line 2
    new-array p1, p1, [[I

    iput-object p1, p0, Ly1;->J:[[I

    :goto_0
    return-void
.end method


# virtual methods
.method public g([I)I
    .locals 4

    iget-object v0, p0, Ly1;->J:[[I

    .line 1
    iget v1, p0, Lw1;->h:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 2
    aget-object v3, v0, v2

    invoke-static {v3, p1}, Landroid/util/StateSet;->stateSetMatches([I[I)Z

    move-result v3

    if-eqz v3, :cond_0

    return v2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method
