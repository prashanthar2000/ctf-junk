package a.b.o.i;

import a.f.g.a.b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f74a;

    /* renamed from: b  reason: collision with root package name */
    public final int f75b;
    public final int c;
    public CharSequence d;
    public CharSequence e;
    public Intent f;
    public char g;
    public int h = 4096;
    public char i;
    public int j = 4096;
    public Drawable k;
    public Context l;
    public CharSequence m;
    public CharSequence n;
    public ColorStateList o = null;
    public PorterDuff.Mode p = null;
    public boolean q = false;
    public boolean r = false;
    public int s = 16;

    public a(Context context, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.l = context;
        this.f74a = i3;
        this.f75b = i2;
        this.c = i5;
        this.d = charSequence;
    }

    public b a(a.f.k.b bVar) {
        throw new UnsupportedOperationException();
    }

    public a.f.k.b a() {
        return null;
    }

    public final void b() {
        if (this.k == null) {
            return;
        }
        if (this.q || this.r) {
            Drawable drawable = this.k;
            this.k = drawable;
            Drawable mutate = drawable.mutate();
            this.k = mutate;
            if (this.q) {
                mutate.setTintList(this.o);
            }
            if (this.r) {
                this.k.setTintMode(this.p);
            }
        }
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.j;
    }

    public char getAlphabeticShortcut() {
        return this.i;
    }

    public CharSequence getContentDescription() {
        return this.m;
    }

    public int getGroupId() {
        return this.f75b;
    }

    public Drawable getIcon() {
        return this.k;
    }

    public ColorStateList getIconTintList() {
        return this.o;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.p;
    }

    public Intent getIntent() {
        return this.f;
    }

    public int getItemId() {
        return this.f74a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.h;
    }

    public char getNumericShortcut() {
        return this.g;
    }

    public int getOrder() {
        return this.c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.e;
        return charSequence != null ? charSequence : this.d;
    }

    public CharSequence getTooltipText() {
        return this.n;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.s & 1) != 0;
    }

    public boolean isChecked() {
        return (this.s & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.s & 16) != 0;
    }

    public boolean isVisible() {
        return (this.s & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.i = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.i = Character.toLowerCase(c2);
        this.j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.s = z | (this.s & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.s = (z ? 2 : 0) | (this.s & -3);
        return this;
    }

    public b setContentDescription(CharSequence charSequence) {
        this.m = charSequence;
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public MenuItem m1setContentDescription(CharSequence charSequence) {
        this.m = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.s = (z ? 16 : 0) | (this.s & -17);
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.k = a.f.e.a.a(this.l, i2);
        b();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.k = drawable;
        b();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.o = colorStateList;
        this.q = true;
        b();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.p = mode;
        this.r = true;
        b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.g = c2;
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        this.g = c2;
        this.h = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.g = c2;
        this.i = Character.toLowerCase(c3);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.g = c2;
        this.h = KeyEvent.normalizeMetaState(i2);
        this.i = Character.toLowerCase(c3);
        this.j = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    public void setShowAsAction(int i2) {
    }

    public MenuItem setShowAsActionFlags(int i2) {
        return this;
    }

    public MenuItem setTitle(int i2) {
        this.d = this.l.getResources().getString(i2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.e = charSequence;
        return this;
    }

    public b setTooltipText(CharSequence charSequence) {
        this.n = charSequence;
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public MenuItem m2setTooltipText(CharSequence charSequence) {
        this.n = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i2 = 8;
        int i3 = this.s & 8;
        if (z) {
            i2 = 0;
        }
        this.s = i3 | i2;
        return this;
    }

    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
