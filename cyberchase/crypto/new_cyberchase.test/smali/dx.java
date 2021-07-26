public class dx {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Ldx$a; */
	 /* } */
} // .end annotation
/* # static fields */
private static final android.view.View$AccessibilityDelegate b;
/* # instance fields */
final android.view.View$AccessibilityDelegate a;
/* # direct methods */
static dx ( ) {
	 /* .locals 1 */
	 /* new-instance v0, Landroid/view/View$AccessibilityDelegate; */
	 /* invoke-direct {v0}, Landroid/view/View$AccessibilityDelegate;-><init>()V */
	 return;
} // .end method
public dx ( ) {
	 /* .locals 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* new-instance v0, Ldx$a; */
	 /* invoke-direct {v0, p0}, Ldx$a;-><init>(Ldx;)V */
	 this.a = v0;
	 return;
} // .end method
public static ev a ( android.view.View p0 ) {
	 /* .locals 2 */
	 /* const/16 v1, 0x10 */
	 /* if-lt v0, v1, :cond_0 */
	 v0 = dx.b;
	 (( android.view.View$AccessibilityDelegate ) v0 ).getAccessibilityNodeProvider ( p0 ); // invoke-virtual {v0, p0}, Landroid/view/View$AccessibilityDelegate;->getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
	 if ( p0 != null) { // if-eqz p0, :cond_0
		 /* new-instance v0, Lev; */
		 /* invoke-direct {v0, p0}, Lev;-><init>(Ljava/lang/Object;)V */
	 } // :cond_0
	 int p0 = 0; // const/4 p0, 0x0
} // .end method
public static void a ( android.view.View p0, Integer p1 ) {
	 /* .locals 1 */
	 v0 = dx.b;
	 (( android.view.View$AccessibilityDelegate ) v0 ).sendAccessibilityEvent ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Landroid/view/View$AccessibilityDelegate;->sendAccessibilityEvent(Landroid/view/View;I)V
	 return;
} // .end method
public static void a ( android.view.View p0, android.view.accessibility.AccessibilityEvent p1 ) {
	 /* .locals 1 */
	 v0 = dx.b;
	 (( android.view.View$AccessibilityDelegate ) v0 ).sendAccessibilityEventUnchecked ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Landroid/view/View$AccessibilityDelegate;->sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
	 return;
} // .end method
public static void b ( android.view.View p0, android.view.accessibility.AccessibilityEvent p1 ) {
	 /* .locals 1 */
	 v0 = dx.b;
	 (( android.view.View$AccessibilityDelegate ) v0 ).onPopulateAccessibilityEvent ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Landroid/view/View$AccessibilityDelegate;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
	 return;
} // .end method
/* # virtual methods */
public void a ( android.view.View p0, eu p1 ) {
	 /* .locals 1 */
	 v0 = dx.b;
	 p2 = this.a;
	 (( android.view.View$AccessibilityDelegate ) v0 ).onInitializeAccessibilityNodeInfo ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
	 return;
} // .end method
public Boolean a ( android.view.View p0, Integer p1, android.os.Bundle p2 ) {
	 /* .locals 2 */
	 /* const/16 v1, 0x10 */
	 /* if-lt v0, v1, :cond_0 */
	 v0 = dx.b;
	 p1 = 	 (( android.view.View$AccessibilityDelegate ) v0 ).performAccessibilityAction ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroid/view/View$AccessibilityDelegate;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean a ( android.view.View p0, android.view.accessibility.AccessibilityEvent p1 ) {
/* .locals 1 */
v0 = dx.b;
p1 = (( android.view.View$AccessibilityDelegate ) v0 ).dispatchPopulateAccessibilityEvent ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
} // .end method
public Boolean a ( android.view.ViewGroup p0, android.view.View p1, android.view.accessibility.AccessibilityEvent p2 ) {
/* .locals 1 */
v0 = dx.b;
p1 = (( android.view.View$AccessibilityDelegate ) v0 ).onRequestSendAccessibilityEvent ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroid/view/View$AccessibilityDelegate;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
} // .end method
public void c ( android.view.View p0, android.view.accessibility.AccessibilityEvent p1 ) {
/* .locals 1 */
v0 = dx.b;
(( android.view.View$AccessibilityDelegate ) v0 ).onInitializeAccessibilityEvent ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
return;
} // .end method
