public class aa implements ad$a {
	 /* # interfaces */
	 /* # instance fields */
	 public Float a;
	 ag a;
	 public final z a;
	 Boolean a;
	 public Boolean b;
	 /* # direct methods */
	 public aa ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 this.a = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Laa;->a:F */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Laa;->a:Z */
		 /* iput-boolean v0, p0, Laa;->b:Z */
		 /* new-instance v0, Lz; */
		 /* invoke-direct {v0, p0, p1}, Lz;-><init>(Laa;Lab;)V */
		 this.a = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final aa a ( ad p0, Integer p1 ) {
		 /* .locals 3 */
		 v0 = this.a;
		 (( ad ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lad;->a(I)Lag;
		 /* const/high16 v2, 0x3f800000 # 1.0f */
		 (( z ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lz;->a(Lag;F)V
		 v0 = this.a;
		 (( ad ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lad;->a(I)Lag;
		 /* const/high16 p2, -0x40800000 # -1.0f */
		 (( z ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lz;->a(Lag;F)V
	 } // .end method
	 public final aa a ( ag p0, ag p1, ag p2, Integer p3 ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 if ( p4 != null) { // if-eqz p4, :cond_1
			 /* if-gez p4, :cond_0 */
			 /* mul-int/lit8 p4, p4, -0x1 */
			 int v0 = 1; // const/4 v0, 0x1
		 } // :cond_0
		 /* int-to-float p4, p4 */
		 /* iput p4, p0, Laa;->a:F */
	 } // :cond_1
	 /* const/high16 p4, -0x40800000 # -1.0f */
	 /* const/high16 v1, 0x3f800000 # 1.0f */
	 /* if-nez v0, :cond_2 */
	 v0 = this.a;
	 (( z ) v0 ).a ( p1, p4 ); // invoke-virtual {v0, p1, p4}, Lz;->a(Lag;F)V
	 p1 = this.a;
	 (( z ) p1 ).a ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lz;->a(Lag;F)V
	 p1 = this.a;
	 (( z ) p1 ).a ( p3, v1 ); // invoke-virtual {p1, p3, v1}, Lz;->a(Lag;F)V
} // :cond_2
v0 = this.a;
(( z ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lz;->a(Lag;F)V
p1 = this.a;
(( z ) p1 ).a ( p2, p4 ); // invoke-virtual {p1, p2, p4}, Lz;->a(Lag;F)V
p1 = this.a;
(( z ) p1 ).a ( p3, p4 ); // invoke-virtual {p1, p3, p4}, Lz;->a(Lag;F)V
} // :goto_0
} // .end method
public final aa a ( ag p0, ag p1, ag p2, ag p3, Float p4 ) {
/* .locals 2 */
v0 = this.a;
/* const/high16 v1, -0x40800000 # -1.0f */
(( z ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lz;->a(Lag;F)V
p1 = this.a;
/* const/high16 v0, 0x3f800000 # 1.0f */
(( z ) p1 ).a ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Lz;->a(Lag;F)V
p1 = this.a;
(( z ) p1 ).a ( p3, p5 ); // invoke-virtual {p1, p3, p5}, Lz;->a(Lag;F)V
p1 = this.a;
/* neg-float p2, p5 */
(( z ) p1 ).a ( p4, p2 ); // invoke-virtual {p1, p4, p2}, Lz;->a(Lag;F)V
} // .end method
public final ag a ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public final ag a ( Boolean[] p0 ) {
/* .locals 2 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( z ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lz;->a([ZLag;)Lag;
} // .end method
public final void a ( ) {
/* .locals 1 */
v0 = this.a;
(( z ) v0 ).a ( ); // invoke-virtual {v0}, Lz;->a()V
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Laa;->a:F */
return;
} // .end method
public final void a ( ad$a p0 ) {
/* .locals 5 */
/* instance-of v0, p1, Laa; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast p1, Laa; */
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
v0 = this.a;
(( z ) v0 ).a ( ); // invoke-virtual {v0}, Lz;->a()V
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v1 = this.a;
/* iget v1, v1, Lz;->a:I */
/* if-ge v0, v1, :cond_0 */
v1 = this.a;
(( z ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lz;->a(I)Lag;
v2 = this.a;
v2 = (( z ) v2 ).a ( v0 ); // invoke-virtual {v2, v0}, Lz;->a(I)F
v3 = this.a;
int v4 = 1; // const/4 v4, 0x1
(( z ) v3 ).a ( v1, v2, v4 ); // invoke-virtual {v3, v1, v2, v4}, Lz;->a(Lag;FZ)V
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
final void a ( ag p0 ) {
/* .locals 5 */
v0 = this.a;
/* const/high16 v1, -0x40800000 # -1.0f */
if ( v0 != null) { // if-eqz v0, :cond_0
v2 = this.a;
(( z ) v2 ).a ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Lz;->a(Lag;F)V
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
} // :cond_0
v0 = this.a;
int v2 = 1; // const/4 v2, 0x1
v0 = (( z ) v0 ).a ( p1, v2 ); // invoke-virtual {v0, p1, v2}, Lz;->a(Lag;Z)F
/* mul-float v0, v0, v1 */
this.a = p1;
/* const/high16 p1, 0x3f800000 # 1.0f */
/* cmpl-float p1, v0, p1 */
/* if-nez p1, :cond_1 */
return;
} // :cond_1
/* iget p1, p0, Laa;->a:F */
/* div-float/2addr p1, v0 */
/* iput p1, p0, Laa;->a:F */
p1 = this.a;
/* iget v1, p1, Lz;->b:I */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
int v3 = -1; // const/4 v3, -0x1
/* if-eq v1, v3, :cond_2 */
/* iget v3, p1, Lz;->a:I */
/* if-ge v2, v3, :cond_2 */
v3 = this.a;
/* aget v4, v3, v1 */
/* div-float/2addr v4, v0 */
/* aput v4, v3, v1 */
v3 = this.b;
/* aget v1, v3, v1 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
return;
} // .end method
final Boolean a ( ag p0 ) {
/* .locals 7 */
v0 = this.a;
/* iget v1, v0, Lz;->b:I */
int v2 = 0; // const/4 v2, 0x0
int v3 = -1; // const/4 v3, -0x1
/* if-eq v1, v3, :cond_1 */
/* iget v1, v0, Lz;->b:I */
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-eq v1, v3, :cond_1 */
/* iget v5, v0, Lz;->a:I */
/* if-ge v4, v5, :cond_1 */
v5 = this.a;
/* aget v5, v5, v1 */
/* iget v6, p1, Lag;->a:I */
/* if-ne v5, v6, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
v5 = this.b;
/* aget v1, v5, v1 */
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_1
} // .end method
public final aa b ( ag p0, ag p1, ag p2, Integer p3 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
if ( p4 != null) { // if-eqz p4, :cond_1
/* if-gez p4, :cond_0 */
/* mul-int/lit8 p4, p4, -0x1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
/* int-to-float p4, p4 */
/* iput p4, p0, Laa;->a:F */
} // :cond_1
/* const/high16 p4, -0x40800000 # -1.0f */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* if-nez v0, :cond_2 */
v0 = this.a;
(( z ) v0 ).a ( p1, p4 ); // invoke-virtual {v0, p1, p4}, Lz;->a(Lag;F)V
p1 = this.a;
(( z ) p1 ).a ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lz;->a(Lag;F)V
p1 = this.a;
(( z ) p1 ).a ( p3, p4 ); // invoke-virtual {p1, p3, p4}, Lz;->a(Lag;F)V
} // :cond_2
v0 = this.a;
(( z ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lz;->a(Lag;F)V
p1 = this.a;
(( z ) p1 ).a ( p2, p4 ); // invoke-virtual {p1, p2, p4}, Lz;->a(Lag;F)V
p1 = this.a;
(( z ) p1 ).a ( p3, v1 ); // invoke-virtual {p1, p3, v1}, Lz;->a(Lag;F)V
} // :goto_0
} // .end method
public final aa b ( ag p0, ag p1, ag p2, ag p3, Float p4 ) {
/* .locals 2 */
v0 = this.a;
/* const/high16 v1, 0x3f000000 # 0.5f */
(( z ) v0 ).a ( p3, v1 ); // invoke-virtual {v0, p3, v1}, Lz;->a(Lag;F)V
p3 = this.a;
(( z ) p3 ).a ( p4, v1 ); // invoke-virtual {p3, p4, v1}, Lz;->a(Lag;F)V
p3 = this.a;
/* const/high16 p4, -0x41000000 # -0.5f */
(( z ) p3 ).a ( p1, p4 ); // invoke-virtual {p3, p1, p4}, Lz;->a(Lag;F)V
p1 = this.a;
(( z ) p1 ).a ( p2, p4 ); // invoke-virtual {p1, p2, p4}, Lz;->a(Lag;F)V
/* neg-float p1, p5 */
/* iput p1, p0, Laa;->a:F */
} // .end method
public void b ( ag p0 ) {
/* .locals 3 */
/* iget v0, p1, Lag;->c:I */
/* const/high16 v1, 0x3f800000 # 1.0f */
int v2 = 1; // const/4 v2, 0x1
/* if-ne v0, v2, :cond_0 */
} // :cond_0
/* iget v0, p1, Lag;->c:I */
int v2 = 2; // const/4 v2, 0x2
/* if-ne v0, v2, :cond_1 */
/* const/high16 v1, 0x447a0000 # 1000.0f */
} // :cond_1
/* iget v0, p1, Lag;->c:I */
int v2 = 3; // const/4 v2, 0x3
/* if-ne v0, v2, :cond_2 */
/* const v1, 0x49742400 # 1000000.0f */
} // :cond_2
/* iget v0, p1, Lag;->c:I */
int v2 = 4; // const/4 v2, 0x4
/* if-ne v0, v2, :cond_3 */
/* const v1, 0x4e6e6b28 # 1.0E9f */
} // :cond_3
/* iget v0, p1, Lag;->c:I */
int v2 = 5; // const/4 v2, 0x5
/* if-ne v0, v2, :cond_4 */
/* const v1, 0x5368d4a5 # 1.0E12f */
} // :cond_4
} // :goto_0
v0 = this.a;
(( z ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lz;->a(Lag;F)V
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 9 */
final String v0 = ""; // const-string v0, ""
v1 = this.a;
/* if-nez v1, :cond_0 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "0"; // const-string v0, "0"
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_0
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = this.a;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
} // :goto_0
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = " = "; // const-string v0, " = "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* iget v1, p0, Laa;->a:F */
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
/* cmpl-float v1, v1, v4 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v0, p0, Laa;->a:F */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v1 = 1; // const/4 v1, 0x1
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
v5 = this.a;
/* iget v5, v5, Lz;->a:I */
} // :goto_2
/* if-ge v2, v5, :cond_7 */
v6 = this.a;
(( z ) v6 ).a ( v2 ); // invoke-virtual {v6, v2}, Lz;->a(I)Lag;
if ( v6 != null) { // if-eqz v6, :cond_6
v7 = this.a;
v7 = (( z ) v7 ).a ( v2 ); // invoke-virtual {v7, v2}, Lz;->a(I)F
/* cmpl-float v8, v7, v4 */
if ( v8 != null) { // if-eqz v8, :cond_6
(( ag ) v6 ).toString ( ); // invoke-virtual {v6}, Lag;->toString()Ljava/lang/String;
/* const/high16 v8, -0x40800000 # -1.0f */
/* if-nez v1, :cond_2 */
/* cmpg-float v1, v7, v4 */
/* if-gez v1, :cond_4 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "- "; // const-string v0, "- "
} // :cond_2
/* cmpl-float v1, v7, v4 */
/* if-lez v1, :cond_3 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = " + "; // const-string v0, " + "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_3
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = " - "; // const-string v0, " - "
} // :goto_3
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* mul-float v7, v7, v8 */
} // :cond_4
} // :goto_4
/* const/high16 v1, 0x3f800000 # 1.0f */
/* cmpl-float v1, v7, v1 */
/* if-nez v1, :cond_5 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
} // :cond_5
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v0 = " "; // const-string v0, " "
} // :goto_5
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v6 ); // invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v1 = 1; // const/4 v1, 0x1
} // :cond_6
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_7
/* if-nez v1, :cond_8 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "0.0"; // const-string v0, "0.0"
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_8
} // .end method
