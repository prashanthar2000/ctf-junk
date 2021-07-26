public class android.support.v4.graphics.drawable.IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {
	 /* # static fields */
	 static final android.graphics.PorterDuff$Mode a;
	 /* # instance fields */
	 public Integer a;
	 public android.content.res.ColorStateList a;
	 public android.os.Parcelable a;
	 public java.lang.Object a;
	 public java.lang.String a;
	 public a;
	 public Integer b;
	 public android.graphics.PorterDuff$Mode b;
	 public Integer c;
	 /* # direct methods */
	 static android.support.v4.graphics.drawable.IconCompat ( ) {
		 /* .locals 1 */
		 v0 = android.graphics.PorterDuff$Mode.SRC_IN;
		 return;
	 } // .end method
	 public android.support.v4.graphics.drawable.IconCompat ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Landroidx/versionedparcelable/CustomVersionedParcelable;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 this.a = v0;
		 v0 = android.support.v4.graphics.drawable.IconCompat.a;
		 this.b = v0;
		 return;
	 } // .end method
	 private static Integer a ( android.graphics.drawable.Icon p0 ) {
		 /* .locals 4 */
		 /* const/16 v1, 0x1c */
		 /* if-lt v0, v1, :cond_0 */
		 p0 = 		 (( android.graphics.drawable.Icon ) p0 ).getResId ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Icon;->getResId()I
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
	 try { // :try_start_0
		 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 final String v2 = "getResId"; // const-string v2, "getResId"
		 /* new-array v3, v0, [Ljava/lang/Class; */
		 (( java.lang.Class ) v1 ).getMethod ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 /* new-array v2, v0, [Ljava/lang/Object; */
		 (( java.lang.reflect.Method ) v1 ).invoke ( p0, v2 ); // invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
		 /* check-cast p0, Ljava/lang/Integer; */
		 p0 = 		 (( java.lang.Integer ) p0 ).intValue ( ); // invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I
		 /* :try_end_0 */
		 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_2 */
		 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception p0 */
	 } // :goto_0
	 final String v1 = "IconCompat"; // const-string v1, "IconCompat"
	 final String v2 = "Unable to get icon resource"; // const-string v2, "Unable to get icon resource"
	 android.util.Log .e ( v1,v2,p0 );
	 /* :catch_1 */
	 /* move-exception p0 */
	 /* :catch_2 */
	 /* move-exception p0 */
} // .end method
private static java.lang.String a ( android.graphics.drawable.Icon p0 ) {
	 /* .locals 5 */
	 /* const/16 v1, 0x1c */
	 /* if-lt v0, v1, :cond_0 */
	 (( android.graphics.drawable.Icon ) p0 ).getResPackage ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Icon;->getResPackage()Ljava/lang/String;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
	 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
	 final String v2 = "getResPackage"; // const-string v2, "getResPackage"
	 int v3 = 0; // const/4 v3, 0x0
	 /* new-array v4, v3, [Ljava/lang/Class; */
	 (( java.lang.Class ) v1 ).getMethod ( v2, v4 ); // invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
	 /* new-array v2, v3, [Ljava/lang/Object; */
	 (( java.lang.reflect.Method ) v1 ).invoke ( p0, v2 ); // invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast p0, Ljava/lang/String; */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_2 */
	 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception p0 */
} // :goto_0
final String v1 = "IconCompat"; // const-string v1, "IconCompat"
final String v2 = "Unable to get icon package"; // const-string v2, "Unable to get icon package"
android.util.Log .e ( v1,v2,p0 );
/* :catch_1 */
/* move-exception p0 */
/* :catch_2 */
/* move-exception p0 */
} // .end method
/* # virtual methods */
public java.lang.String toString ( ) {
/* .locals 8 */
/* iget v0, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:I */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
v0 = this.a;
java.lang.String .valueOf ( v0 );
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v2 = "Icon(typ="; // const-string v2, "Icon(typ="
/* invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v2, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:I */
/* packed-switch v2, :pswitch_data_0 */
final String v2 = "UNKNOWN"; // const-string v2, "UNKNOWN"
/* :pswitch_0 */
final String v2 = "BITMAP_MASKABLE"; // const-string v2, "BITMAP_MASKABLE"
/* :pswitch_1 */
final String v2 = "URI"; // const-string v2, "URI"
/* :pswitch_2 */
final String v2 = "DATA"; // const-string v2, "DATA"
/* :pswitch_3 */
final String v2 = "RESOURCE"; // const-string v2, "RESOURCE"
/* :pswitch_4 */
final String v2 = "BITMAP"; // const-string v2, "BITMAP"
} // :goto_0
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:I */
/* packed-switch v2, :pswitch_data_1 */
/* goto/16 :goto_4 */
/* :pswitch_5 */
final String v1 = " uri="; // const-string v1, " uri="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* goto/16 :goto_4 */
/* :pswitch_6 */
final String v1 = " len="; // const-string v1, " len="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Landroid/support/v4/graphics/drawable/IconCompat;->b:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* iget v1, p0, Landroid/support/v4/graphics/drawable/IconCompat;->c:I */
if ( v1 != null) { // if-eqz v1, :cond_5
final String v1 = " off="; // const-string v1, " off="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Landroid/support/v4/graphics/drawable/IconCompat;->c:I */
/* goto/16 :goto_3 */
/* :pswitch_7 */
final String v2 = " pkg="; // const-string v2, " pkg="
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:I */
int v3 = 0; // const/4 v3, 0x0
/* const/16 v4, 0x17 */
int v5 = 2; // const/4 v5, 0x2
/* if-ne v2, v1, :cond_1 */
/* if-lt v2, v4, :cond_1 */
v2 = this.a;
/* check-cast v2, Landroid/graphics/drawable/Icon; */
android.support.v4.graphics.drawable.IconCompat .a ( v2 );
} // :cond_1
/* iget v2, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:I */
/* if-ne v2, v5, :cond_4 */
v2 = this.a;
/* check-cast v2, Ljava/lang/String; */
final String v6 = ":"; // const-string v6, ":"
(( java.lang.String ) v2 ).split ( v6, v1 ); // invoke-virtual {v2, v6, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;
/* aget-object v2, v2, v3 */
} // :goto_1
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " id="; // const-string v2, " id="
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "0x%08x"; // const-string v2, "0x%08x"
int v6 = 1; // const/4 v6, 0x1
/* new-array v6, v6, [Ljava/lang/Object; */
/* iget v7, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:I */
/* if-ne v7, v1, :cond_2 */
/* if-lt v1, v4, :cond_2 */
v1 = this.a;
/* check-cast v1, Landroid/graphics/drawable/Icon; */
v1 = android.support.v4.graphics.drawable.IconCompat .a ( v1 );
} // :cond_2
/* iget v1, p0, Landroid/support/v4/graphics/drawable/IconCompat;->a:I */
/* if-ne v1, v5, :cond_3 */
/* iget v1, p0, Landroid/support/v4/graphics/drawable/IconCompat;->b:I */
} // :goto_2
java.lang.Integer .valueOf ( v1 );
/* aput-object v1, v6, v3 */
java.lang.String .format ( v2,v6 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_3
/* new-instance v0, Ljava/lang/IllegalStateException; */
java.lang.String .valueOf ( p0 );
final String v2 = "called getResId() on "; // const-string v2, "called getResId() on "
(( java.lang.String ) v2 ).concat ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_4
/* new-instance v0, Ljava/lang/IllegalStateException; */
java.lang.String .valueOf ( p0 );
final String v2 = "called getResPackage() on "; // const-string v2, "called getResPackage() on "
(( java.lang.String ) v2 ).concat ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* :pswitch_8 */
final String v1 = " size="; // const-string v1, " size="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
/* check-cast v1, Landroid/graphics/Bitmap; */
v1 = (( android.graphics.Bitmap ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = "x"; // const-string v1, "x"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
/* check-cast v1, Landroid/graphics/Bitmap; */
v1 = (( android.graphics.Bitmap ) v1 ).getHeight ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I
} // :goto_3
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
} // :cond_5
} // :goto_4
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_6
final String v1 = " tint="; // const-string v1, " tint="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
} // :cond_6
v1 = this.b;
v2 = android.support.v4.graphics.drawable.IconCompat.a;
/* if-eq v1, v2, :cond_7 */
final String v1 = " mode="; // const-string v1, " mode="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
} // :cond_7
final String v1 = ")"; // const-string v1, ")"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
/* :pswitch_data_1 */
/* .packed-switch 0x1 */
/* :pswitch_8 */
/* :pswitch_7 */
/* :pswitch_6 */
/* :pswitch_5 */
/* :pswitch_8 */
} // .end packed-switch
} // .end method
