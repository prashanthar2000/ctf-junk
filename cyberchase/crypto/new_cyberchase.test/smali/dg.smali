.class public final Ldg;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldg$a;,
        Ldg$b;,
        Ldg$c;
    }
.end annotation


# static fields
.field private static final a:Ldh;

.field static final a:Ldp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldp<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field

.field static final a:Ldu;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldu<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ldh$a<",
            "Ldg$c;",
            ">;>;>;"
        }
    .end annotation
.end field

.field static final a:Ljava/lang/Object;

.field private static final a:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "[B>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldp;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Ldp;-><init>(I)V

    sput-object v0, Ldg;->a:Ldp;

    new-instance v0, Ldh;

    const-string v1, "fonts"

    invoke-direct {v0, v1}, Ldh;-><init>(Ljava/lang/String;)V

    sput-object v0, Ldg;->a:Ldh;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ldg;->a:Ljava/lang/Object;

    new-instance v0, Ldu;

    invoke-direct {v0}, Ldu;-><init>()V

    sput-object v0, Ldg;->a:Ldu;

    new-instance v0, Ldg$4;

    invoke-direct {v0}, Ldg$4;-><init>()V

    sput-object v0, Ldg;->a:Ljava/util/Comparator;

    return-void
.end method

.method public static a(Landroid/content/Context;Ldf;Lcm$a;ZII)Landroid/graphics/Typeface;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p1, Ldf;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ldg;->a:Ldp;

    invoke-virtual {v1, v0}, Ldp;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_1

    if-eqz p2, :cond_0

    invoke-virtual {p2, v1}, Lcm$a;->a(Landroid/graphics/Typeface;)V

    :cond_0
    return-object v1

    :cond_1
    const/4 v1, 0x0

    if-eqz p3, :cond_4

    const/4 v2, -0x1

    if-ne p4, v2, :cond_4

    invoke-static {p0, p1, p5}, Ldg;->a(Landroid/content/Context;Ldf;I)Ldg$c;

    move-result-object p0

    if-eqz p2, :cond_3

    iget p1, p0, Ldg$c;->a:I

    if-nez p1, :cond_2

    iget-object p1, p0, Ldg$c;->a:Landroid/graphics/Typeface;

    invoke-virtual {p2, p1, v1}, Lcm$a;->a(Landroid/graphics/Typeface;Landroid/os/Handler;)V

    goto :goto_0

    :cond_2
    iget p1, p0, Ldg$c;->a:I

    invoke-virtual {p2, p1, v1}, Lcm$a;->a(ILandroid/os/Handler;)V

    :cond_3
    :goto_0
    iget-object p0, p0, Ldg$c;->a:Landroid/graphics/Typeface;

    return-object p0

    :cond_4
    new-instance v2, Ldg$1;

    invoke-direct {v2, p0, p1, p5, v0}, Ldg$1;-><init>(Landroid/content/Context;Ldf;ILjava/lang/String;)V

    if-eqz p3, :cond_5

    :try_start_0
    sget-object p0, Ldg;->a:Ldh;

    invoke-virtual {p0, v2, p4}, Ldh;->a(Ljava/util/concurrent/Callable;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldg$c;

    iget-object p0, p0, Ldg$c;->a:Landroid/graphics/Typeface;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v1

    :cond_5
    if-nez p2, :cond_6

    move-object p0, v1

    goto :goto_1

    :cond_6
    new-instance p0, Ldg$2;

    invoke-direct {p0, p2, v1}, Ldg$2;-><init>(Lcm$a;Landroid/os/Handler;)V

    :goto_1
    sget-object p1, Ldg;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_1
    sget-object p2, Ldg;->a:Ldu;

    invoke-virtual {p2, v0}, Ldu;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    if-eqz p0, :cond_7

    sget-object p2, Ldg;->a:Ldu;

    invoke-virtual {p2, v0}, Ldu;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    monitor-exit p1

    return-object v1

    :cond_8
    if-eqz p0, :cond_9

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p0, Ldg;->a:Ldu;

    invoke-virtual {p0, v0, p2}, Ldu;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object p0, Ldg;->a:Ldh;

    new-instance p1, Ldg$3;

    invoke-direct {p1, v0}, Ldg$3;-><init>(Ljava/lang/String;)V

    new-instance p2, Landroid/os/Handler;

    invoke-direct {p2}, Landroid/os/Handler;-><init>()V

    new-instance p3, Ldh$2;

    invoke-direct {p3, p0, v2, p2, p1}, Ldh$2;-><init>(Ldh;Ljava/util/concurrent/Callable;Landroid/os/Handler;Ldh$a;)V

    invoke-virtual {p0, p3}, Ldh;->a(Ljava/lang/Runnable;)V

    return-object v1

    :catchall_0
    move-exception p0

    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method static a(Landroid/content/Context;Ldf;I)Ldg$c;
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget-object v3, p1, Ldf;->a:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    move-result-object v5

    if-eqz v5, :cond_8

    iget-object v6, v5, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    iget-object v7, p1, Ldf;->b:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v3, v5, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    const/16 v6, 0x40

    invoke-virtual {v1, v3, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    invoke-static {v1}, Ldg;->a([Landroid/content/pm/Signature;)Ljava/util/List;

    move-result-object v1

    sget-object v3, Ldg;->a:Ljava/util/Comparator;

    invoke-static {v1, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    iget-object v3, p1, Ldf;->a:Ljava/util/List;

    if-eqz v3, :cond_0

    iget-object v2, p1, Ldf;->a:Ljava/util/List;

    goto :goto_0

    :cond_0
    iget v3, p1, Ldf;->a:I

    invoke-static {v2, v3}, Lcj;->a(Landroid/content/res/Resources;I)Ljava/util/List;

    move-result-object v2

    :goto_0
    const/4 v3, 0x0

    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    if-ge v3, v6, :cond_2

    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Collection;

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sget-object v7, Ldg;->a:Ljava/util/Comparator;

    invoke-static {v6, v7}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-static {v1, v6}, Ldg;->a(Ljava/util/List;Ljava/util/List;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    move-object v5, v0

    :goto_2
    const/4 v1, 0x1

    if-nez v5, :cond_3

    new-instance p1, Ldg$a;

    invoke-direct {p1, v1, v0}, Ldg$a;-><init>(I[Ldg$b;)V

    goto :goto_3

    :cond_3
    iget-object v2, v5, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    invoke-static {p0, p1, v2}, Ldg;->a(Landroid/content/Context;Ldf;Ljava/lang/String;)[Ldg$b;

    move-result-object p1

    new-instance v2, Ldg$a;

    invoke-direct {v2, v4, p1}, Ldg$a;-><init>(I[Ldg$b;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object p1, v2

    :goto_3
    iget v2, p1, Ldg$a;->a:I

    const/4 v3, -0x3

    if-nez v2, :cond_5

    iget-object p1, p1, Ldg$a;->a:[Ldg$b;

    invoke-static {p0, p1, p2}, Lcq;->a(Landroid/content/Context;[Ldg$b;I)Landroid/graphics/Typeface;

    move-result-object p0

    new-instance p1, Ldg$c;

    if-eqz p0, :cond_4

    const/4 v3, 0x0

    :cond_4
    invoke-direct {p1, p0, v3}, Ldg$c;-><init>(Landroid/graphics/Typeface;I)V

    return-object p1

    :cond_5
    iget p0, p1, Ldg$a;->a:I

    if-ne p0, v1, :cond_6

    const/4 v3, -0x2

    :cond_6
    new-instance p0, Ldg$c;

    invoke-direct {p0, v0, v3}, Ldg$c;-><init>(Landroid/graphics/Typeface;I)V

    return-object p0

    :cond_7
    :try_start_1
    new-instance p0, Landroid/content/pm/PackageManager$NameNotFoundException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Found content provider "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", but package was not "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Ldf;->b:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    new-instance p0, Landroid/content/pm/PackageManager$NameNotFoundException;

    const-string p1, "No package found for authority: "

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    new-instance p0, Ldg$c;

    const/4 p1, -0x1

    invoke-direct {p0, v0, p1}, Ldg$c;-><init>(Landroid/graphics/Typeface;I)V

    return-object p0
.end method

.method private static a([Landroid/content/pm/Signature;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Landroid/content/pm/Signature;",
            ")",
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    aget-object v2, p0, v1

    invoke-virtual {v2}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static a(Landroid/content/Context;[Ldg$b;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "[",
            "Ldg$b;",
            ")",
            "Ljava/util/Map<",
            "Landroid/net/Uri;",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    iget v4, v3, Ldg$b;->c:I

    if-nez v4, :cond_0

    iget-object v3, v3, Ldg$b;->a:Landroid/net/Uri;

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-static {p0, v3}, Lcw;->a(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static a(Ljava/util/List;Ljava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[B>;",
            "Ljava/util/List<",
            "[B>;)Z"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_1

    return v2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method private static a(Landroid/content/Context;Ldf;Ljava/lang/String;)[Ldg$b;
    .locals 21

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Landroid/net/Uri$Builder;

    invoke-direct {v3}, Landroid/net/Uri$Builder;-><init>()V

    const-string v4, "content"

    invoke-virtual {v3, v4}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v3

    new-instance v4, Landroid/net/Uri$Builder;

    invoke-direct {v4}, Landroid/net/Uri$Builder;-><init>()V

    const-string v5, "content"

    invoke-virtual {v4, v5}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v4

    invoke-virtual {v4, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v4, "file"

    invoke-virtual {v1, v4}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    const/4 v11, 0x0

    :try_start_0
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x10

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-le v4, v5, :cond_0

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    const-string v14, "_id"

    const-string v15, "file_id"

    const-string v16, "font_ttc_index"

    const-string v17, "font_variation_settings"

    const-string v18, "font_weight"

    const-string v19, "font_italic"

    const-string v20, "result_code"

    filled-new-array/range {v14 .. v20}, [Ljava/lang/String;

    move-result-object v6

    const-string v7, "query = ?"

    new-array v8, v12, [Ljava/lang/String;

    iget-object v0, v0, Ldf;->c:Ljava/lang/String;

    aput-object v0, v8, v13

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v5, v3

    invoke-virtual/range {v4 .. v10}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    const-string v14, "_id"

    const-string v15, "file_id"

    const-string v16, "font_ttc_index"

    const-string v17, "font_variation_settings"

    const-string v18, "font_weight"

    const-string v19, "font_italic"

    const-string v20, "result_code"

    filled-new-array/range {v14 .. v20}, [Ljava/lang/String;

    move-result-object v6

    const-string v7, "query = ?"

    new-array v8, v12, [Ljava/lang/String;

    iget-object v0, v0, Ldf;->c:Ljava/lang/String;

    aput-object v0, v8, v13

    const/4 v9, 0x0

    move-object v5, v3

    invoke-virtual/range {v4 .. v9}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    :goto_0
    move-object v11, v0

    if-eqz v11, :cond_6

    invoke-interface {v11}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_6

    const-string v0, "result_code"

    invoke-interface {v11, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const-string v4, "_id"

    invoke-interface {v11, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    const-string v5, "file_id"

    invoke-interface {v11, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    const-string v6, "font_ttc_index"

    invoke-interface {v11, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    const-string v7, "font_weight"

    invoke-interface {v11, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    const-string v8, "font_italic"

    invoke-interface {v11, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    :goto_1
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z

    move-result v9

    if-eqz v9, :cond_6

    const/4 v9, -0x1

    if-eq v0, v9, :cond_1

    invoke-interface {v11, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v10

    move/from16 v19, v10

    goto :goto_2

    :cond_1
    const/16 v19, 0x0

    :goto_2
    if-eq v6, v9, :cond_2

    invoke-interface {v11, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v10

    move/from16 v16, v10

    goto :goto_3

    :cond_2
    const/16 v16, 0x0

    :goto_3
    if-ne v5, v9, :cond_3

    invoke-interface {v11, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v14

    invoke-static {v3, v14, v15}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v10

    goto :goto_4

    :cond_3
    invoke-interface {v11, v5}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v14

    invoke-static {v1, v14, v15}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v10

    :goto_4
    move-object v15, v10

    if-eq v7, v9, :cond_4

    invoke-interface {v11, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v10

    move/from16 v17, v10

    goto :goto_5

    :cond_4
    const/16 v10, 0x190

    const/16 v17, 0x190

    :goto_5
    if-eq v8, v9, :cond_5

    invoke-interface {v11, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v9

    if-ne v9, v12, :cond_5

    const/16 v18, 0x1

    goto :goto_6

    :cond_5
    const/16 v18, 0x0

    :goto_6
    new-instance v9, Ldg$b;

    move-object v14, v9

    invoke-direct/range {v14 .. v19}, Ldg$b;-><init>(Landroid/net/Uri;IIZI)V

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_6
    if-eqz v11, :cond_7

    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    :cond_7
    new-array v0, v13, [Ldg$b;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldg$b;

    return-object v0

    :catchall_0
    move-exception v0

    if-eqz v11, :cond_8

    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    :cond_8
    throw v0

    return-void
.end method
