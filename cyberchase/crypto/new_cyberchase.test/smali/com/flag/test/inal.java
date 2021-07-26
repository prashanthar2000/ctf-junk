class inal implements android.view.View$OnClickListener {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/flag/test/MainActivity;->onCreate(Landroid/os/Bundle;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.flag.test.MainActivity a; //synthetic
/* # direct methods */
 inal ( ) {
/* .locals 0 */
this.a = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public final void onClick ( android.view.View p0 ) {
/* .locals 2 */
p1 = this.a;
/* iget v0, p1, Lcom/flag/test/MainActivity;->b:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p1, Lcom/flag/test/MainActivity;->b:I */
p1 = this.a;
/* iget p1, p1, Lcom/flag/test/MainActivity;->b:I */
/* const/16 v0, 0xa */
/* if-ne p1, v0, :cond_0 */
p1 = this.a;
final String v0 = "Oh, the flag looks incomplete.Fishy!"; // const-string v0, "Oh, the flag looks incomplete.Fishy!"
int v1 = 0; // const/4 v1, 0x0
android.widget.Toast .makeText ( p1,v0,v1 );
(( android.widget.Toast ) p1 ).show ( ); // invoke-virtual {p1}, Landroid/widget/Toast;->show()V
p1 = this.a;
/* iput v1, p1, Lcom/flag/test/MainActivity;->b:I */
return;
} // :cond_0
p1 = this.a;
/* iget p1, p1, Lcom/flag/test/MainActivity;->b:I */
int v0 = 3; // const/4 v0, 0x3
/* if-ne p1, v0, :cond_1 */
p1 = this.a;
p1 = this.a;
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.a;
v1 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.widget.TextView ) p1 ).setText ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
} // :cond_1
return;
} // .end method
