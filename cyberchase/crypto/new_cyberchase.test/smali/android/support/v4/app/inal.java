public class inal extends by {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroid/support/v4/app/LoaderManagerImpl$LoaderViewModel;, */
	 /* Landroid/support/v4/app/LoaderManagerImpl$b;, */
	 /* Landroid/support/v4/app/LoaderManagerImpl$a; */
	 /* } */
} // .end annotation
/* # static fields */
static Boolean a;
/* # instance fields */
private final android.support.v4.app.LoaderManagerImpl$LoaderViewModel a;
private final j a;
/* # direct methods */
static inal ( ) {
	 /* .locals 0 */
	 return;
} // .end method
public inal ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0}, Lby;-><init>()V */
	 this.a = p1;
	 android.support.v4.app.LoaderManagerImpl$LoaderViewModel .a ( p2 );
	 this.a = p1;
	 return;
} // .end method
/* # virtual methods */
public final void a ( ) {
	 /* .locals 4 */
	 v0 = this.a;
	 v1 = this.a;
	 v1 = 	 (( dv ) v1 ).a ( ); // invoke-virtual {v1}, Ldv;->a()I
	 int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_0 */
v3 = this.a;
(( dv ) v3 ).a ( v2 ); // invoke-virtual {v3, v2}, Ldv;->a(I)Ljava/lang/Object;
/* check-cast v3, Landroid/support/v4/app/LoaderManagerImpl$a; */
(( android.support.v4.app.LoaderManagerImpl$a ) v3 ).c ( ); // invoke-virtual {v3}, Landroid/support/v4/app/LoaderManagerImpl$a;->c()V
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
return;
} // .end method
public final void a ( java.lang.String p0, java.io.PrintWriter p1 ) {
/* .locals 8 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
v0 = this.a;
v1 = this.a;
v1 = (( dv ) v1 ).a ( ); // invoke-virtual {v1}, Ldv;->a()I
/* if-lez v1, :cond_7 */
(( java.io.PrintWriter ) p2 ).print ( p1 ); // invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v1 = "Loaders:"; // const-string v1, "Loaders:"
(( java.io.PrintWriter ) p2 ).println ( v1 ); // invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " "; // const-string v2, " "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
v4 = this.a;
v4 = (( dv ) v4 ).a ( ); // invoke-virtual {v4}, Ldv;->a()I
/* if-ge v3, v4, :cond_7 */
v4 = this.a;
(( dv ) v4 ).a ( v3 ); // invoke-virtual {v4, v3}, Ldv;->a(I)Ljava/lang/Object;
/* check-cast v4, Landroid/support/v4/app/LoaderManagerImpl$a; */
(( java.io.PrintWriter ) p2 ).print ( p1 ); // invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v5 = " #"; // const-string v5, " #"
(( java.io.PrintWriter ) p2 ).print ( v5 ); // invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
v5 = this.a;
v5 = (( dv ) v5 ).a ( v3 ); // invoke-virtual {v5, v3}, Ldv;->a(I)I
(( java.io.PrintWriter ) p2 ).print ( v5 ); // invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(I)V
final String v5 = ": "; // const-string v5, ": "
(( java.io.PrintWriter ) p2 ).print ( v5 ); // invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
(( android.support.v4.app.LoaderManagerImpl$a ) v4 ).toString ( ); // invoke-virtual {v4}, Landroid/support/v4/app/LoaderManagerImpl$a;->toString()Ljava/lang/String;
(( java.io.PrintWriter ) p2 ).println ( v5 ); // invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
(( java.io.PrintWriter ) p2 ).print ( v1 ); // invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v5 = "mId="; // const-string v5, "mId="
(( java.io.PrintWriter ) p2 ).print ( v5 ); // invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget v5, v4, Landroid/support/v4/app/LoaderManagerImpl$a;->b:I */
(( java.io.PrintWriter ) p2 ).print ( v5 ); // invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(I)V
final String v5 = " mArgs="; // const-string v5, " mArgs="
(( java.io.PrintWriter ) p2 ).print ( v5 ); // invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
v5 = this.a;
(( java.io.PrintWriter ) p2 ).println ( v5 ); // invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
(( java.io.PrintWriter ) p2 ).print ( v1 ); // invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v5 = "mLoader="; // const-string v5, "mLoader="
(( java.io.PrintWriter ) p2 ).print ( v5 ); // invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
v5 = this.a;
(( java.io.PrintWriter ) p2 ).println ( v5 ); // invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
v5 = this.a;
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v6 ).append ( v1 ); // invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = " "; // const-string v7, " "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintWriter ) p2 ).print ( v6 ); // invoke-virtual {p2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v7 = "mId="; // const-string v7, "mId="
(( java.io.PrintWriter ) p2 ).print ( v7 ); // invoke-virtual {p2, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget v7, v5, Lcf;->a:I */
(( java.io.PrintWriter ) p2 ).print ( v7 ); // invoke-virtual {p2, v7}, Ljava/io/PrintWriter;->print(I)V
final String v7 = " mListener="; // const-string v7, " mListener="
(( java.io.PrintWriter ) p2 ).print ( v7 ); // invoke-virtual {p2, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
v7 = this.a;
(( java.io.PrintWriter ) p2 ).println ( v7 ); // invoke-virtual {p2, v7}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
/* iget-boolean v7, v5, Lcf;->a:Z */
/* if-nez v7, :cond_0 */
/* iget-boolean v7, v5, Lcf;->d:Z */
/* if-nez v7, :cond_0 */
/* iget-boolean v7, v5, Lcf;->e:Z */
if ( v7 != null) { // if-eqz v7, :cond_1
} // :cond_0
(( java.io.PrintWriter ) p2 ).print ( v6 ); // invoke-virtual {p2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v7 = "mStarted="; // const-string v7, "mStarted="
(( java.io.PrintWriter ) p2 ).print ( v7 ); // invoke-virtual {p2, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget-boolean v7, v5, Lcf;->a:Z */
(( java.io.PrintWriter ) p2 ).print ( v7 ); // invoke-virtual {p2, v7}, Ljava/io/PrintWriter;->print(Z)V
final String v7 = " mContentChanged="; // const-string v7, " mContentChanged="
(( java.io.PrintWriter ) p2 ).print ( v7 ); // invoke-virtual {p2, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget-boolean v7, v5, Lcf;->d:Z */
(( java.io.PrintWriter ) p2 ).print ( v7 ); // invoke-virtual {p2, v7}, Ljava/io/PrintWriter;->print(Z)V
final String v7 = " mProcessingChange="; // const-string v7, " mProcessingChange="
(( java.io.PrintWriter ) p2 ).print ( v7 ); // invoke-virtual {p2, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget-boolean v7, v5, Lcf;->e:Z */
(( java.io.PrintWriter ) p2 ).println ( v7 ); // invoke-virtual {p2, v7}, Ljava/io/PrintWriter;->println(Z)V
} // :cond_1
/* iget-boolean v7, v5, Lcf;->b:Z */
/* if-nez v7, :cond_2 */
/* iget-boolean v7, v5, Lcf;->c:Z */
if ( v7 != null) { // if-eqz v7, :cond_3
} // :cond_2
(( java.io.PrintWriter ) p2 ).print ( v6 ); // invoke-virtual {p2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v6 = "mAbandoned="; // const-string v6, "mAbandoned="
(( java.io.PrintWriter ) p2 ).print ( v6 ); // invoke-virtual {p2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget-boolean v6, v5, Lcf;->b:Z */
(( java.io.PrintWriter ) p2 ).print ( v6 ); // invoke-virtual {p2, v6}, Ljava/io/PrintWriter;->print(Z)V
final String v6 = " mReset="; // const-string v6, " mReset="
(( java.io.PrintWriter ) p2 ).print ( v6 ); // invoke-virtual {p2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget-boolean v5, v5, Lcf;->c:Z */
(( java.io.PrintWriter ) p2 ).println ( v5 ); // invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Z)V
} // :cond_3
v5 = this.a;
if ( v5 != null) { // if-eqz v5, :cond_4
(( java.io.PrintWriter ) p2 ).print ( v1 ); // invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v5 = "mCallbacks="; // const-string v5, "mCallbacks="
(( java.io.PrintWriter ) p2 ).print ( v5 ); // invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
v5 = this.a;
(( java.io.PrintWriter ) p2 ).println ( v5 ); // invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
v5 = this.a;
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v6 ).append ( v1 ); // invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = " "; // const-string v7, " "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintWriter ) p2 ).print ( v6 ); // invoke-virtual {p2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v6 = "mDeliveredData="; // const-string v6, "mDeliveredData="
(( java.io.PrintWriter ) p2 ).print ( v6 ); // invoke-virtual {p2, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget-boolean v5, v5, Landroid/support/v4/app/LoaderManagerImpl$b;->a:Z */
(( java.io.PrintWriter ) p2 ).println ( v5 ); // invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Z)V
} // :cond_4
(( java.io.PrintWriter ) p2 ).print ( v1 ); // invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v5 = "mData="; // const-string v5, "mData="
(( java.io.PrintWriter ) p2 ).print ( v5 ); // invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
v5 = this.b;
v6 = android.arch.lifecycle.LiveData.a;
/* if-eq v5, v6, :cond_5 */
} // :cond_5
int v5 = 0; // const/4 v5, 0x0
} // :goto_1
cf .a ( v5 );
(( java.io.PrintWriter ) p2 ).println ( v5 ); // invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
(( java.io.PrintWriter ) p2 ).print ( v1 ); // invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v5 = "mStarted="; // const-string v5, "mStarted="
(( java.io.PrintWriter ) p2 ).print ( v5 ); // invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* iget v4, v4, Landroid/arch/lifecycle/LiveData;->a:I */
/* if-lez v4, :cond_6 */
int v4 = 1; // const/4 v4, 0x1
} // :cond_6
int v4 = 0; // const/4 v4, 0x0
} // :goto_2
(( java.io.PrintWriter ) p2 ).println ( v4 ); // invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->println(Z)V
/* add-int/lit8 v3, v3, 0x1 */
/* goto/16 :goto_0 */
} // :cond_7
return;
} // .end method
public final java.lang.String toString ( ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* const/16 v1, 0x80 */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v1 = "LoaderManager{"; // const-string v1, "LoaderManager{"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = java.lang.System .identityHashCode ( p0 );
java.lang.Integer .toHexString ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " in "; // const-string v1, " in "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
dm .a ( v1,v0 );
final String v1 = "}}"; // const-string v1, "}}"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
