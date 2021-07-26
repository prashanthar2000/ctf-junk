public abstract class cm$a {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcm; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x409 */
/* name = "a" */
} // .end annotation
/* # direct methods */
public cm$a ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public final void a ( Integer p0, android.os.Handler p1 ) {
/* .locals 1 */
/* if-nez p2, :cond_0 */
/* new-instance p2, Landroid/os/Handler; */
android.os.Looper .getMainLooper ( );
/* invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
} // :cond_0
/* new-instance v0, Lcm$a$2; */
/* invoke-direct {v0, p0, p1}, Lcm$a$2;-><init>(Lcm$a;I)V */
(( android.os.Handler ) p2 ).post ( v0 ); // invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
return;
} // .end method
public abstract void a ( android.graphics.Typeface p0 ) {
} // .end method
public final void a ( android.graphics.Typeface p0, android.os.Handler p1 ) {
/* .locals 1 */
/* if-nez p2, :cond_0 */
/* new-instance p2, Landroid/os/Handler; */
android.os.Looper .getMainLooper ( );
/* invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
} // :cond_0
/* new-instance v0, Lcm$a$1; */
/* invoke-direct {v0, p0, p1}, Lcm$a$1;-><init>(Lcm$a;Landroid/graphics/Typeface;)V */
(( android.os.Handler ) p2 ).post ( v0 ); // invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
return;
} // .end method
