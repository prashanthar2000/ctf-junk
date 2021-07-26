package a.b.m.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public class c extends Drawable implements Drawable.Callback {

    /* renamed from: b  reason: collision with root package name */
    public Drawable f55b;

    public c(Drawable drawable) {
        Drawable drawable2 = this.f55b;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f55b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f55b.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f55b.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f55b.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f55b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f55b.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f55b.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f55b.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f55b.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f55b.getPadding(rect);
    }

    public int[] getState() {
        return this.f55b.getState();
    }

    public Region getTransparentRegion() {
        return this.f55b.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f55b.isAutoMirrored();
    }

    public boolean isStateful() {
        return this.f55b.isStateful();
    }

    public void jumpToCurrentState() {
        this.f55b.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.f55b.setBounds(rect);
    }

    public boolean onLevelChange(int i) {
        return this.f55b.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f55b.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f55b.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f55b.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f55b.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f55b.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f55b.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        this.f55b.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f55b.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f55b.setState(iArr);
    }

    public void setTint(int i) {
        this.f55b.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f55b.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f55b.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f55b.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
