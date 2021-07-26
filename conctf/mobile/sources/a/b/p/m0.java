package a.b.p;

import a.b.o.i.f;
import a.b.o.i.g;
import a.b.o.i.i;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

public class m0 extends k0 implements l0 {
    public static Method H;
    public l0 G;

    public static class a extends f0 {
        public final int p;
        public final int q;
        public l0 r;
        public MenuItem s;

        public a(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.p = 21;
                this.q = 22;
                return;
            }
            this.p = 22;
            this.q = 21;
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.r != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                f fVar = (f) adapter;
                i iVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < fVar.getCount()) {
                    iVar = fVar.getItem(i2);
                }
                MenuItem menuItem = this.s;
                if (menuItem != iVar) {
                    g gVar = fVar.f87b;
                    if (menuItem != null) {
                        this.r.b(gVar, menuItem);
                    }
                    this.s = iVar;
                    if (iVar != null) {
                        this.r.a(gVar, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.p) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.q) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((f) getAdapter()).f87b.a(false);
                return true;
            }
        }

        public void setHoverListener(l0 l0Var) {
            this.r = l0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                H = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public m0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public f0 a(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    public void a(g gVar, MenuItem menuItem) {
        l0 l0Var = this.G;
        if (l0Var != null) {
            l0Var.a(gVar, menuItem);
        }
    }

    public void b(g gVar, MenuItem menuItem) {
        l0 l0Var = this.G;
        if (l0Var != null) {
            l0Var.b(gVar, menuItem);
        }
    }
}
