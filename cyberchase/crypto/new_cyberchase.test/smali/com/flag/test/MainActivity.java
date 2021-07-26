public class com.flag.test.MainActivity extends android.support.v7.app.AppCompatActivity {
	 /* # instance fields */
	 android.widget.Button a;
	 android.widget.TextView a;
	 java.lang.String a;
	 Integer b;
	 java.lang.String b;
	 /* # direct methods */
	 public com.flag.test.MainActivity ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/flag/test/MainActivity;->b:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 1 */
		 /* invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V */
		 /* const p1, 0x7f09001c */
		 (( com.flag.test.MainActivity ) p0 ).setContentView ( p1 ); // invoke-virtual {p0, p1}, Lcom/flag/test/MainActivity;->setContentView(I)V
		 /* const p1, 0x7f07003d */
		 (( com.flag.test.MainActivity ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lcom/flag/test/MainActivity;->findViewById(I)Landroid/view/View;
		 /* check-cast p1, Landroid/widget/TextView; */
		 this.a = p1;
		 /* const p1, 0x7f070022 */
		 (( com.flag.test.MainActivity ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lcom/flag/test/MainActivity;->findViewById(I)Landroid/view/View;
		 /* check-cast p1, Landroid/widget/Button; */
		 this.a = p1;
		 p1 = 		 jb .a ( p0 );
		 final String v0 = "The Flag is: "; // const-string v0, "The Flag is: "
		 this.b = v0;
		 /* if-gtz p1, :cond_0 */
		 final String p1 = "Application Tampered"; // const-string p1, "Application Tampered"
		 int v0 = 1; // const/4 v0, 0x1
		 android.widget.Toast .makeText ( p0,p1,v0 );
		 (( android.widget.Toast ) p1 ).show ( ); // invoke-virtual {p1}, Landroid/widget/Toast;->show()V
		 (( com.flag.test.MainActivity ) p0 ).finishAffinity ( ); // invoke-virtual {p0}, Lcom/flag/test/MainActivity;->finishAffinity()V
	 } // :cond_0
	 final String p1 = "cyberchase{damm_easy"; // const-string p1, "cyberchase{damm_easy"
	 this.a = p1;
	 p1 = this.a;
	 /* new-instance v0, Lcom/flag/test/MainActivity$1; */
	 /* invoke-direct {v0, p0}, Lcom/flag/test/MainActivity$1;-><init>(Lcom/flag/test/MainActivity;)V */
	 (( android.widget.Button ) p1 ).setOnClickListener ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
	 /* new-instance p1, Lja; */
	 /* invoke-direct {p1}, Lja;-><init>()V */
	 final String v0 = "c3RyaW5ncy54bWw"; // const-string v0, "c3RyaW5ncy54bWw"
	 (( ja ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lja;->a(Ljava/lang/String;)V
	 final String v0 = "c3RyaW5ncy54bWw"; // const-string v0, "c3RyaW5ncy54bWw"
	 (( ja ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lja;->a(Ljava/lang/String;)V
	 final String v0 = "c3RyaW5ncy54bWw"; // const-string v0, "c3RyaW5ncy54bWw"
	 (( ja ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lja;->a(Ljava/lang/String;)V
	 return;
} // .end method
