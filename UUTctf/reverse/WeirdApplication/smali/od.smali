.class public abstract Lod;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final c:Lmd;


# instance fields
.field public b:Lmd;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmd;

    invoke-direct {v0}, Lmd;-><init>()V

    sput-object v0, Lod;->c:Lmd;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lod;->b:Lmd;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
.end method
