.class public Lig;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Landroid/content/Context;

.field public b:[Ljava/lang/String;

.field public c:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    iput-object v2, v0, Lig;->a:Landroid/content/Context;

    const/16 v2, 0xe

    new-array v3, v2, [Ljava/lang/String;

    const-wide v4, 0x63baff3e3376090dL    # 2.6082771287908903E172

    invoke-static {v4, v5}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const-wide v6, 0x63baff2a3376090dL    # 2.6082476447094464E172

    invoke-static {v6, v7}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x1

    aput-object v4, v3, v6

    const-wide v7, 0x63baff023376090dL    # 2.6081886765465586E172

    invoke-static {v7, v8}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x2

    aput-object v4, v3, v7

    const-wide v8, 0x63bafeec3376090dL    # 2.6081562440569702E172

    invoke-static {v8, v9}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v4

    const/4 v8, 0x3

    aput-object v4, v3, v8

    const-wide v9, 0x63bafedf3376090dL    # 2.6081370794040317E172

    invoke-static {v9, v10}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v4

    const/4 v9, 0x4

    aput-object v4, v3, v9

    const-wide v10, 0x63bafecc3376090dL    # 2.60810906952666E172

    invoke-static {v10, v11}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x5

    aput-object v4, v3, v10

    const-wide v11, 0x63bafeb53376090dL    # 2.6080751628329995E172

    invoke-static {v11, v12}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v4

    const/4 v11, 0x6

    aput-object v4, v3, v11

    const-wide v12, 0x63bafea13376090dL    # 2.6080456787515556E172

    invoke-static {v12, v13}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v4

    const/4 v12, 0x7

    aput-object v4, v3, v12

    const-wide v13, 0x63bafe863376090dL    # 2.6080058752416063E172

    invoke-static {v13, v14}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v4

    const/16 v13, 0x8

    aput-object v4, v3, v13

    const-wide v14, 0x63bafe683376090dL    # 2.6079616491194404E172

    invoke-static {v14, v15}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v4

    const/16 v14, 0x9

    aput-object v4, v3, v14

    const-wide v15, 0x63bafe523376090dL    # 2.607929216629852E172

    invoke-static/range {v15 .. v16}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v4

    const/16 v15, 0xa

    aput-object v4, v3, v15

    const-wide v16, 0x63bafe493376090dL    # 2.6079159487932023E172

    invoke-static/range {v16 .. v17}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v4

    const/16 v16, 0xb

    aput-object v4, v3, v16

    const-wide v17, 0x63bafe2c3376090dL    # 2.6078731968751086E172

    invoke-static/range {v17 .. v18}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v4

    const/16 v17, 0xc

    aput-object v4, v3, v17

    const-wide v18, 0x63bafe0f3376090dL    # 2.607830444957015E172

    invoke-static/range {v18 .. v19}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v4

    const/16 v18, 0xd

    aput-object v4, v3, v18

    iput-object v3, v0, Lig;->b:[Ljava/lang/String;

    new-array v2, v2, [Ljava/lang/String;

    const-wide v3, 0x63bafdfb3376090dL    # 2.607800960875571E172

    invoke-static {v3, v4}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v5

    const-wide v3, 0x63bafdf93376090dL    # 2.6077980124674266E172

    invoke-static {v3, v4}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v6

    const-wide v3, 0x63bafdf73376090dL    # 2.6077950640592822E172

    invoke-static {v3, v4}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v7

    const-wide v3, 0x63bafdf53376090dL    # 2.607792115651138E172

    invoke-static {v3, v4}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v8

    const-wide v3, 0x63bafdf33376090dL    # 2.6077891672429935E172

    invoke-static {v3, v4}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v9

    const-wide v3, 0x63bafdf13376090dL    # 2.607786218834849E172

    invoke-static {v3, v4}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v10

    const-wide v3, 0x63bafdef3376090dL    # 2.6077832704267047E172

    invoke-static {v3, v4}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v11

    const-wide v3, 0x63bafded3376090dL    # 2.6077803220185603E172

    invoke-static {v3, v4}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v12

    const-wide v3, 0x63bafdeb3376090dL    # 2.607777373610416E172

    invoke-static {v3, v4}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v13

    const-wide v3, 0x63bafde93376090dL    # 2.6077744252022715E172

    invoke-static {v3, v4}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v14

    const-wide v3, 0x63bafde73376090dL    # 2.607771476794127E172

    invoke-static {v3, v4}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v15

    const-wide v3, 0x63bafde53376090dL    # 2.6077685283859827E172

    invoke-static {v3, v4}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v16

    const-wide v3, 0x63bafde33376090dL    # 2.6077655799778383E172

    invoke-static {v3, v4}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v17

    const-wide v3, 0x63bafde13376090dL    # 2.607762631569694E172

    invoke-static {v3, v4}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v18

    iput-object v2, v0, Lig;->c:[Ljava/lang/String;

    iput-object v1, v0, Lig;->a:Landroid/content/Context;

    const-wide v2, 0x63bafddf3376090dL    # 2.6077596831615495E172

    invoke-static {v2, v3}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, v0, Lig;->a:Landroid/content/Context;

    const-wide v3, 0x63bafdd63376090dL    # 2.6077464153248998E172

    invoke-static {v3, v4}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    const-wide v3, 0x63bafdcd3376090dL    # 2.60773314748825E172

    invoke-static {v3, v4}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_0

    const-wide v2, 0x63bafdc13376090dL    # 2.6077154570393837E172

    invoke-static {v2, v3}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v6}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    const-wide v2, 0x63bafdb53376090dL    # 2.6076977665905173E172

    invoke-static {v2, v3}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, -0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 7

    const/16 v0, 0x19

    new-array v0, v0, [C

    const/16 v1, 0x55

    const/4 v2, 0x0

    :try_start_0
    aput-char v1, v0, v2

    const/4 v3, 0x1

    aput-char v1, v0, v3

    const/4 v1, 0x2

    const/16 v4, 0x54

    aput-char v4, v0, v1

    const/4 v1, 0x3

    const/16 v5, 0x43

    aput-char v5, v0, v1

    const/4 v1, 0x4

    aput-char v4, v0, v1

    const/4 v1, 0x5

    const/16 v4, 0x46

    aput-char v4, v0, v1

    const/4 v1, 0x6

    const/16 v4, 0x7b

    aput-char v4, v0, v1

    const/16 v1, 0x7d

    const/16 v4, 0x18

    aput-char v1, v0, v4

    const/4 v1, 0x7

    const/4 v5, 0x7

    :goto_0
    if-ge v5, v4, :cond_0

    const/16 v6, 0x3f

    aput-char v6, v0, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    iget-object v4, p0, Lig;->a:Landroid/content/Context;

    const-wide v5, 0x63bafdaf3376090dL    # 2.607688921366084E172

    invoke-static {v5, v6}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    const-wide v5, 0x63bafda63376090dL    # 2.6076756535294344E172

    invoke-static {v5, v6}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v5

    const/4 v6, -0x1

    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    const/4 v5, 0x0

    :goto_1
    add-int/lit8 v6, v4, 0x1

    if-ge v5, v6, :cond_3

    const/16 v6, 0xa

    if-eq v1, v6, :cond_1

    const/16 v6, 0xf

    if-eq v1, v6, :cond_1

    const/16 v6, 0x13

    if-ne v1, v6, :cond_2

    :cond_1
    const/16 v6, 0x5f

    aput-char v6, v0, v1

    add-int/lit8 v1, v1, 0x1

    :cond_2
    iget-object v6, p0, Lig;->c:[Ljava/lang/String;

    aget-object v6, v6, v5

    invoke-virtual {v6, v2}, Ljava/lang/String;->charAt(I)C

    move-result v6

    aput-char v6, v0, v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :catch_0
    move-exception v1

    const-wide v2, 0x63bafda03376090dL    # 2.6076668083050012E172

    invoke-static {v2, v3}, Lhg;->a(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    invoke-static {v0}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
