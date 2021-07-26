package a.b.o.i;

import a.f.k.b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

public class j extends c implements MenuItem {
    public final a.f.g.a.b d;
    public Method e;

    public class a extends a.f.k.b {

        /* renamed from: b  reason: collision with root package name */
        public final ActionProvider f94b;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f94b = actionProvider;
        }
    }

    public class b extends a implements ActionProvider.VisibilityListener {
        public b.a d;

        public b(j jVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public View a(MenuItem menuItem) {
            return this.f94b.onCreateActionView(menuItem);
        }

        public void a(b.a aVar) {
            this.d = aVar;
            this.f94b.setVisibilityListener(aVar != null ? this : null);
        }

        public boolean a() {
            return this.f94b.isVisible();
        }

        public boolean b() {
            return this.f94b.overridesItemVisibility();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            b.a aVar = this.d;
            if (aVar != null) {
                g gVar = i.this.n;
                gVar.h = true;
                gVar.b(true);
            }
        }
    }

    public static class c extends FrameLayout implements a.b.o.b {

        /* renamed from: b  reason: collision with root package name */
        public final CollapsibleActionView f95b;

        public c(View view) {
            super(view.getContext());
            this.f95b = (CollapsibleActionView) view;
            addView(view);
        }

        public void a() {
            this.f95b.onActionViewExpanded();
        }

        public void b() {
            this.f95b.onActionViewCollapsed();
        }
    }

    public class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f96a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f96a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f96a.onMenuItemActionCollapse(j.this.a(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f96a.onMenuItemActionExpand(j.this.a(menuItem));
        }
    }

    public class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f98a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f98a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f98a.onMenuItemClick(j.this.a(menuItem));
        }
    }

    public j(Context context, a.f.g.a.b bVar) {
        super(context);
        if (bVar != null) {
            this.d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        a.f.k.b a2 = this.d.a();
        if (a2 instanceof a) {
            return ((a) a2).f94b;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.d.getActionView();
        return actionView instanceof c ? (View) ((c) actionView).f95b : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.d.getContentDescription();
    }

    public int getGroupId() {
        return this.d.getGroupId();
    }

    public Drawable getIcon() {
        return this.d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.d.getIntent();
    }

    public int getItemId() {
        return this.d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.d.getNumericShortcut();
    }

    public int getOrder() {
        return this.d.getOrder();
    }

    public SubMenu getSubMenu() {
        return a(this.d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.d.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.d.isCheckable();
    }

    public boolean isChecked() {
        return this.d.isChecked();
    }

    public boolean isEnabled() {
        return this.d.isEnabled();
    }

    public boolean isVisible() {
        return this.d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this, this.f77a, actionProvider);
        a.f.g.a.b bVar2 = this.d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.d.setActionView(i);
        View actionView = this.d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.d.setActionView((View) new c(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.d.setAlphabeticShortcut(c2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i) {
        this.d.setAlphabeticShortcut(c2, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.d.setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.d.setNumericShortcut(c2);
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i) {
        this.d.setNumericShortcut(c2, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.d.setShortcut(c2, c3);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.d.setShortcut(c2, c3, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.d.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.d.setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.d.setVisible(z);
    }
}
