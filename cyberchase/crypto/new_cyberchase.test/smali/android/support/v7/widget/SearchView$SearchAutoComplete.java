public class android.support.v7.widget.SearchView$SearchAutoComplete extends android.support.v7.widget.AppCompatAutoCompleteTextView {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroid/support/v7/widget/SearchView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "SearchAutoComplete" */
} // .end annotation
/* # instance fields */
private Integer a;
private android.support.v7.widget.SearchView a;
final java.lang.Runnable a;
Boolean a;
/* # direct methods */
public android.support.v7.widget.SearchView$SearchAutoComplete ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
return;
} // .end method
public android.support.v7.widget.SearchView$SearchAutoComplete ( ) {
/* .locals 1 */
/* invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
return;
} // .end method
public android.support.v7.widget.SearchView$SearchAutoComplete ( ) {
/* .locals 0 */
/* invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/AppCompatAutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
/* new-instance p1, Landroid/support/v7/widget/SearchView$SearchAutoComplete$1; */
/* invoke-direct {p1, p0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete$1;-><init>(Landroid/support/v7/widget/SearchView$SearchAutoComplete;)V */
this.a = p1;
p1 = (( android.support.v7.widget.SearchView$SearchAutoComplete ) p0 ).getThreshold ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getThreshold()I
/* iput p1, p0, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->a:I */
return;
} // .end method
private Integer getSearchViewTextMinWidthDp ( ) {
/* .locals 4 */
(( android.support.v7.widget.SearchView$SearchAutoComplete ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getConfiguration ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* iget v1, v0, Landroid/content/res/Configuration;->screenWidthDp:I */
/* iget v2, v0, Landroid/content/res/Configuration;->screenHeightDp:I */
/* const/16 v3, 0x3c0 */
/* if-lt v1, v3, :cond_0 */
/* const/16 v3, 0x2d0 */
/* if-lt v2, v3, :cond_0 */
/* iget v0, v0, Landroid/content/res/Configuration;->orientation:I */
int v3 = 2; // const/4 v3, 0x2
/* if-ne v0, v3, :cond_0 */
/* const/16 v0, 0x100 */
} // :cond_0
/* const/16 v0, 0x258 */
/* if-ge v1, v0, :cond_2 */
/* const/16 v0, 0x280 */
/* if-lt v1, v0, :cond_1 */
/* const/16 v0, 0x1e0 */
/* if-lt v2, v0, :cond_1 */
} // :cond_1
/* const/16 v0, 0xa0 */
} // :cond_2
} // :goto_0
/* const/16 v0, 0xc0 */
} // .end method
/* # virtual methods */
public Boolean enoughToFilter ( ) {
/* .locals 1 */
/* iget v0, p0, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->a:I */
/* if-lez v0, :cond_1 */
v0 = /* invoke-super {p0}, Landroid/support/v7/widget/AppCompatAutoCompleteTextView;->enoughToFilter()Z */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public android.view.inputmethod.InputConnection onCreateInputConnection ( android.view.inputmethod.EditorInfo p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Landroid/support/v7/widget/AppCompatAutoCompleteTextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection; */
/* iget-boolean v0, p0, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( android.support.v7.widget.SearchView$SearchAutoComplete ) p0 ).removeCallbacks ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->removeCallbacks(Ljava/lang/Runnable;)Z
v0 = this.a;
(( android.support.v7.widget.SearchView$SearchAutoComplete ) p0 ).post ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->post(Ljava/lang/Runnable;)Z
} // :cond_0
} // .end method
protected void onFinishInflate ( ) {
/* .locals 3 */
/* invoke-super {p0}, Landroid/support/v7/widget/AppCompatAutoCompleteTextView;->onFinishInflate()V */
(( android.support.v7.widget.SearchView$SearchAutoComplete ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
v1 = /* invoke-direct {p0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getSearchViewTextMinWidthDp()I */
/* int-to-float v1, v1 */
int v2 = 1; // const/4 v2, 0x1
v0 = android.util.TypedValue .applyDimension ( v2,v1,v0 );
/* float-to-int v0, v0 */
(( android.support.v7.widget.SearchView$SearchAutoComplete ) p0 ).setMinWidth ( v0 ); // invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setMinWidth(I)V
return;
} // .end method
protected void onFocusChanged ( Boolean p0, Integer p1, android.graphics.Rect p2 ) {
/* .locals 0 */
/* invoke-super {p0, p1, p2, p3}, Landroid/support/v7/widget/AppCompatAutoCompleteTextView;->onFocusChanged(ZILandroid/graphics/Rect;)V */
p1 = this.a;
(( android.support.v7.widget.SearchView ) p1 ).g ( ); // invoke-virtual {p1}, Landroid/support/v7/widget/SearchView;->g()V
return;
} // .end method
public Boolean onKeyPreIme ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 2 */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_3 */
v0 = (( android.view.KeyEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I
int v1 = 1; // const/4 v1, 0x1
/* if-nez v0, :cond_1 */
v0 = (( android.view.KeyEvent ) p2 ).getRepeatCount ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I
/* if-nez v0, :cond_1 */
(( android.support.v7.widget.SearchView$SearchAutoComplete ) p0 ).getKeyDispatcherState ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;
if ( p1 != null) { // if-eqz p1, :cond_0
(( android.view.KeyEvent$DispatcherState ) p1 ).startTracking ( p2, p0 ); // invoke-virtual {p1, p2, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V
} // :cond_0
} // :cond_1
v0 = (( android.view.KeyEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I
/* if-ne v0, v1, :cond_3 */
(( android.support.v7.widget.SearchView$SearchAutoComplete ) p0 ).getKeyDispatcherState ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;
if ( v0 != null) { // if-eqz v0, :cond_2
(( android.view.KeyEvent$DispatcherState ) v0 ).handleUpEvent ( p2 ); // invoke-virtual {v0, p2}, Landroid/view/KeyEvent$DispatcherState;->handleUpEvent(Landroid/view/KeyEvent;)V
} // :cond_2
v0 = (( android.view.KeyEvent ) p2 ).isTracking ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->isTracking()Z
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = (( android.view.KeyEvent ) p2 ).isCanceled ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->isCanceled()Z
/* if-nez v0, :cond_3 */
p1 = this.a;
(( android.support.v7.widget.SearchView ) p1 ).clearFocus ( ); // invoke-virtual {p1}, Landroid/support/v7/widget/SearchView;->clearFocus()V
int p1 = 0; // const/4 p1, 0x0
(( android.support.v7.widget.SearchView$SearchAutoComplete ) p0 ).setImeVisibility ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V
} // :cond_3
p1 = /* invoke-super {p0, p1, p2}, Landroid/support/v7/widget/AppCompatAutoCompleteTextView;->onKeyPreIme(ILandroid/view/KeyEvent;)Z */
} // .end method
public void onWindowFocusChanged ( Boolean p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1}, Landroid/support/v7/widget/AppCompatAutoCompleteTextView;->onWindowFocusChanged(Z)V */
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = this.a;
p1 = (( android.support.v7.widget.SearchView ) p1 ).hasFocus ( ); // invoke-virtual {p1}, Landroid/support/v7/widget/SearchView;->hasFocus()Z
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = (( android.support.v7.widget.SearchView$SearchAutoComplete ) p0 ).getVisibility ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getVisibility()I
/* if-nez p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
/* iput-boolean p1, p0, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->a:Z */
(( android.support.v7.widget.SearchView$SearchAutoComplete ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getContext()Landroid/content/Context;
p1 = android.support.v7.widget.SearchView .a ( p1 );
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = android.support.v7.widget.SearchView.a;
(( android.support.v7.widget.SearchView$a ) p1 ).c ( p0 ); // invoke-virtual {p1, p0}, Landroid/support/v7/widget/SearchView$a;->c(Landroid/widget/AutoCompleteTextView;)V
} // :cond_0
return;
} // .end method
public void performCompletion ( ) {
/* .locals 0 */
return;
} // .end method
protected void replaceText ( java.lang.CharSequence p0 ) {
/* .locals 0 */
return;
} // .end method
void setImeVisibility ( Boolean p0 ) {
/* .locals 2 */
(( android.support.v7.widget.SearchView$SearchAutoComplete ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getContext()Landroid/content/Context;
final String v1 = "input_method"; // const-string v1, "input_method"
(( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/view/inputmethod/InputMethodManager; */
int v1 = 0; // const/4 v1, 0x0
/* if-nez p1, :cond_0 */
/* iput-boolean v1, p0, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->a:Z */
p1 = this.a;
(( android.support.v7.widget.SearchView$SearchAutoComplete ) p0 ).removeCallbacks ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->removeCallbacks(Ljava/lang/Runnable;)Z
(( android.support.v7.widget.SearchView$SearchAutoComplete ) p0 ).getWindowToken ( ); // invoke-virtual {p0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getWindowToken()Landroid/os/IBinder;
(( android.view.inputmethod.InputMethodManager ) v0 ).hideSoftInputFromWindow ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z
return;
} // :cond_0
p1 = (( android.view.inputmethod.InputMethodManager ) v0 ).isActive ( p0 ); // invoke-virtual {v0, p0}, Landroid/view/inputmethod/InputMethodManager;->isActive(Landroid/view/View;)Z
if ( p1 != null) { // if-eqz p1, :cond_1
/* iput-boolean v1, p0, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->a:Z */
p1 = this.a;
(( android.support.v7.widget.SearchView$SearchAutoComplete ) p0 ).removeCallbacks ( p1 ); // invoke-virtual {p0, p1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->removeCallbacks(Ljava/lang/Runnable;)Z
(( android.view.inputmethod.InputMethodManager ) v0 ).showSoftInput ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z
return;
} // :cond_1
int p1 = 1; // const/4 p1, 0x1
/* iput-boolean p1, p0, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->a:Z */
return;
} // .end method
void setSearchView ( android.support.v7.widget.SearchView p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
public void setThreshold ( Integer p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1}, Landroid/support/v7/widget/AppCompatAutoCompleteTextView;->setThreshold(I)V */
/* iput p1, p0, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->a:I */
return;
} // .end method
