public class androidx.core.graphics.drawable.IconCompatParcelizer {
	 /* # direct methods */
	 public androidx.core.graphics.drawable.IconCompatParcelizer ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static android.support.v4.graphics.drawable.IconCompat read ( ix p0 ) {
		 /* .locals 4 */
		 /* new-instance v0, Landroid/support/v4/graphics/drawable/IconCompat; */
		 /* invoke-direct {v0}, Landroid/support/v4/graphics/drawable/IconCompat;-><init>()V */
		 /* iget v1, v0, Landroid/support/v4/graphics/drawable/IconCompat;->a:I */
		 int v2 = 1; // const/4 v2, 0x1
		 v1 = 		 (( ix ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lix;->a(II)I
		 /* iput v1, v0, Landroid/support/v4/graphics/drawable/IconCompat;->a:I */
		 v1 = this.a;
		 (( ix ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lix;->a([B)[B
		 this.a = v1;
		 v1 = this.a;
		 int v2 = 3; // const/4 v2, 0x3
		 (( ix ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lix;->a(Landroid/os/Parcelable;I)Landroid/os/Parcelable;
		 this.a = v1;
		 /* iget v1, v0, Landroid/support/v4/graphics/drawable/IconCompat;->b:I */
		 int v3 = 4; // const/4 v3, 0x4
		 v1 = 		 (( ix ) p0 ).a ( v1, v3 ); // invoke-virtual {p0, v1, v3}, Lix;->a(II)I
		 /* iput v1, v0, Landroid/support/v4/graphics/drawable/IconCompat;->b:I */
		 /* iget v1, v0, Landroid/support/v4/graphics/drawable/IconCompat;->c:I */
		 int v3 = 5; // const/4 v3, 0x5
		 v1 = 		 (( ix ) p0 ).a ( v1, v3 ); // invoke-virtual {p0, v1, v3}, Lix;->a(II)I
		 /* iput v1, v0, Landroid/support/v4/graphics/drawable/IconCompat;->c:I */
		 v1 = this.a;
		 int v3 = 6; // const/4 v3, 0x6
		 (( ix ) p0 ).a ( v1, v3 ); // invoke-virtual {p0, v1, v3}, Lix;->a(Landroid/os/Parcelable;I)Landroid/os/Parcelable;
		 /* check-cast v1, Landroid/content/res/ColorStateList; */
		 this.a = v1;
		 v1 = this.a;
		 (( ix ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lix;->a(Ljava/lang/String;)Ljava/lang/String;
		 this.a = p0;
		 p0 = this.a;
		 android.graphics.PorterDuff$Mode .valueOf ( p0 );
		 this.b = p0;
		 /* iget p0, v0, Landroid/support/v4/graphics/drawable/IconCompat;->a:I */
		 int v1 = -1; // const/4 v1, -0x1
		 /* if-eq p0, v1, :cond_1 */
		 /* packed-switch p0, :pswitch_data_0 */
		 /* :pswitch_0 */
		 p0 = this.a;
		 /* :pswitch_1 */
		 /* new-instance p0, Ljava/lang/String; */
		 v1 = this.a;
		 final String v2 = "UTF-16"; // const-string v2, "UTF-16"
		 java.nio.charset.Charset .forName ( v2 );
		 /* invoke-direct {p0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
	 } // :goto_0
	 this.a = p0;
	 /* :pswitch_2 */
	 p0 = this.a;
	 if ( p0 != null) { // if-eqz p0, :cond_0
	 } // :cond_0
	 p0 = this.a;
	 this.a = p0;
	 /* iput v2, v0, Landroid/support/v4/graphics/drawable/IconCompat;->a:I */
	 int p0 = 0; // const/4 p0, 0x0
	 /* iput p0, v0, Landroid/support/v4/graphics/drawable/IconCompat;->b:I */
	 p0 = this.a;
	 /* array-length p0, p0 */
	 /* iput p0, v0, Landroid/support/v4/graphics/drawable/IconCompat;->c:I */
} // :cond_1
p0 = this.a;
if ( p0 != null) { // if-eqz p0, :cond_2
} // :goto_1
p0 = this.a;
} // :goto_2
} // :cond_2
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String v0 = "Invalid icon"; // const-string v0, "Invalid icon"
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
return;
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public static void write ( android.support.v4.graphics.drawable.IconCompat p0, ix p1 ) {
/* .locals 2 */
v0 = this.b;
(( android.graphics.PorterDuff$Mode ) v0 ).name ( ); // invoke-virtual {v0}, Landroid/graphics/PorterDuff$Mode;->name()Ljava/lang/String;
this.a = v0;
/* iget v0, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:I */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
/* packed-switch v0, :pswitch_data_0 */
/* :pswitch_0 */
v0 = this.a;
(( java.lang.Object ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* :pswitch_1 */
v0 = this.a;
/* check-cast v0, [B */
/* :pswitch_2 */
v0 = this.a;
/* check-cast v0, Ljava/lang/String; */
} // :goto_0
final String v1 = "UTF-16"; // const-string v1, "UTF-16"
java.nio.charset.Charset .forName ( v1 );
(( java.lang.String ) v0 ).getBytes ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
} // :goto_1
this.a = v0;
} // :cond_0
/* :pswitch_3 */
v0 = this.a;
/* check-cast v0, Landroid/os/Parcelable; */
this.a = v0;
} // :goto_2
/* iget v0, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:I */
int v1 = 1; // const/4 v1, 0x1
(( ix ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lix;->a(II)V
v0 = this.a;
(( ix ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Lix;->b([B)V
v0 = this.a;
int v1 = 3; // const/4 v1, 0x3
(( ix ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lix;->a(Landroid/os/Parcelable;I)V
/* iget v0, p0, Landroid/support/v4/graphics/drawable/IconCompat;->b:I */
int v1 = 4; // const/4 v1, 0x4
(( ix ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lix;->a(II)V
/* iget v0, p0, Landroid/support/v4/graphics/drawable/IconCompat;->c:I */
int v1 = 5; // const/4 v1, 0x5
(( ix ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lix;->a(II)V
v0 = this.a;
int v1 = 6; // const/4 v1, 0x6
(( ix ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lix;->a(Landroid/os/Parcelable;I)V
p0 = this.a;
(( ix ) p1 ).b ( p0 ); // invoke-virtual {p1, p0}, Lix;->b(Ljava/lang/String;)V
return;
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
