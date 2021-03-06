.class public Landroid/support/v4/graphics/drawable/IconCompat;
.super Landroidx/versionedparcelable/CustomVersionedParcelable;


# static fields
.field static final a:Landroid/graphics/PorterDuff$Mode;


# instance fields
.field public a:I

.field public a:Landroid/content/res/ColorStateList;

.field public a:Landroid/os/Parcelable;

.field public a:Ljava/lang/Object;

.field public a:Ljava/lang/String;

.field public a:[B

.field public b:I

.field public b:Landroid/graphics/PorterDuff$Mode;

.field public c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    sput-object v0, Landroid/support/v4/graphics/drawable/IconCompat;->a:Landroid/graphics/PorterDuff$Mode;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/versionedparcelable/CustomVersionedParcelable;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:Landroid/content/res/ColorStateList;

    sget-object v0, Landroid/support/v4/graphics/drawable/IconCompat;->a:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Landroid/support/v4/graphics/drawable/IconCompat;->b:Landroid/graphics/PorterDuff$Mode;

    return-void
.end method

.method private static a(Landroid/graphics/drawable/Icon;)I
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/graphics/drawable/Icon;->getResId()I

    move-result p0

    return p0

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getResId"

    new-array v3, v0, [Ljava/lang/Class;

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v2, v0, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    :goto_0
    const-string v1, "IconCompat"

    const-string v2, "Unable to get icon resource"

    invoke-static {v1, v2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return v0

    :catch_1
    move-exception p0

    goto :goto_0

    :catch_2
    move-exception p0

    goto :goto_0
.end method

.method private static a(Landroid/graphics/drawable/Icon;)Ljava/lang/String;
    .locals 5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/graphics/drawable/Icon;->getResPackage()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getResPackage"

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    :goto_0
    const-string v1, "IconCompat"

    const-string v2, "Unable to get icon package"

    invoke-static {v1, v2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v0

    :catch_1
    move-exception p0

    goto :goto_0

    :catch_2
    move-exception p0

    goto :goto_0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 8

    iget v0, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Icon(typ="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:I

    packed-switch v2, :pswitch_data_0

    const-string v2, "UNKNOWN"

    goto :goto_0

    :pswitch_0
    const-string v2, "BITMAP_MASKABLE"

    goto :goto_0

    :pswitch_1
    const-string v2, "URI"

    goto :goto_0

    :pswitch_2
    const-string v2, "DATA"

    goto :goto_0

    :pswitch_3
    const-string v2, "RESOURCE"

    goto :goto_0

    :pswitch_4
    const-string v2, "BITMAP"

    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:I

    packed-switch v2, :pswitch_data_1

    goto/16 :goto_4

    :pswitch_5
    const-string v1, " uri="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto/16 :goto_4

    :pswitch_6
    const-string v1, " len="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroid/support/v4/graphics/drawable/IconCompat;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget v1, p0, Landroid/support/v4/graphics/drawable/IconCompat;->c:I

    if-eqz v1, :cond_5

    const-string v1, " off="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroid/support/v4/graphics/drawable/IconCompat;->c:I

    goto/16 :goto_3

    :pswitch_7
    const-string v2, " pkg="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:I

    const/4 v3, 0x0

    const/16 v4, 0x17

    const/4 v5, 0x2

    if-ne v2, v1, :cond_1

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v4, :cond_1

    iget-object v2, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/drawable/Icon;

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/IconCompat;->a(Landroid/graphics/drawable/Icon;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    iget v2, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:I

    if-ne v2, v5, :cond_4

    iget-object v2, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const-string v6, ":"

    invoke-virtual {v2, v6, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v2

    aget-object v2, v2, v3

    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " id="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "0x%08x"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    iget v7, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:I

    if-ne v7, v1, :cond_2

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v4, :cond_2

    iget-object v1, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/drawable/Icon;

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/IconCompat;->a(Landroid/graphics/drawable/Icon;)I

    move-result v1

    goto :goto_2

    :cond_2
    iget v1, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:I

    if-ne v1, v5, :cond_3

    iget v1, p0, Landroid/support/v4/graphics/drawable/IconCompat;->b:I

    :goto_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v6, v3

    invoke-static {v2, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "called getResId() on "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "called getResPackage() on "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_8
    const-string v1, " size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    :goto_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_5
    :goto_4
    iget-object v1, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_6

    const-string v1, " tint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_6
    iget-object v1, p0, Landroid/support/v4/graphics/drawable/IconCompat;->b:Landroid/graphics/PorterDuff$Mode;

    sget-object v2, Landroid/support/v4/graphics/drawable/IconCompat;->a:Landroid/graphics/PorterDuff$Mode;

    if-eq v1, v2, :cond_7

    const-string v1, " mode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/graphics/drawable/IconCompat;->b:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_7
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_8
    .end packed-switch
.end method
