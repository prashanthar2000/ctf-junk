public class ds$b implements ds$a {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lds; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "b" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">", */
/* "Ljava/lang/Object;", */
/* "Lds$a<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* # instance fields */
private Integer a;
private final java.lang.Object a;
/* # direct methods */
public ds$b ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* if-lez p1, :cond_0 */
/* new-array p1, p1, [Ljava/lang/Object; */
this.a = p1;
return;
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "The max pool size must be > 0"; // const-string v0, "The max pool size must be > 0"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
/* # virtual methods */
public java.lang.Object a ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TT;" */
/* } */
} // .end annotation
/* iget v0, p0, Lds$b;->a:I */
int v1 = 0; // const/4 v1, 0x0
/* if-lez v0, :cond_0 */
/* add-int/lit8 v2, v0, -0x1 */
v3 = this.a;
/* aget-object v4, v3, v2 */
/* aput-object v1, v3, v2 */
/* add-int/lit8 v0, v0, -0x1 */
/* iput v0, p0, Lds$b;->a:I */
} // :cond_0
} // .end method
public Boolean a ( java.lang.Object p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)Z" */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* iget v2, p0, Lds$b;->a:I */
int v3 = 1; // const/4 v3, 0x1
/* if-ge v1, v2, :cond_1 */
v2 = this.a;
/* aget-object v2, v2, v1 */
/* if-ne v2, p1, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
/* if-nez v1, :cond_3 */
/* iget v1, p0, Lds$b;->a:I */
v2 = this.a;
/* array-length v4, v2 */
/* if-ge v1, v4, :cond_2 */
/* aput-object p1, v2, v1 */
/* add-int/2addr v1, v3 */
/* iput v1, p0, Lds$b;->a:I */
} // :cond_2
} // :cond_3
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "Already in the pool!"; // const-string v0, "Already in the pool!"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
return;
} // .end method
