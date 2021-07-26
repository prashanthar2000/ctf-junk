package a.b.o;

import android.view.ActionMode;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;

public class h implements Window.Callback {

    /* renamed from: b  reason: collision with root package name */
    public final Window.Callback f73b;

    public h(Window.Callback callback) {
        if (callback != null) {
            this.f73b = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f73b.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f73b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f73b.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f73b.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f73b.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f73b.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f73b.onAttachedToWindow();
    }

    public View onCreatePanelView(int i) {
        return this.f73b.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f73b.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f73b.onMenuItemSelected(i, menuItem);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f73b.onPointerCaptureChanged(z);
    }

    public boolean onSearchRequested() {
        return this.f73b.onSearchRequested();
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f73b.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f73b.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f73b.onWindowFocusChanged(z);
    }
}
