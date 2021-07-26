package androidx.appcompat.view.menu;

import a.b.a;
import a.b.f;
import a.b.g;
import a.b.h;
import a.b.j;
import a.b.o.i.i;
import a.b.o.i.n;
import a.b.p.x0;
import a.f.k.k;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b  reason: collision with root package name */
    public i f468b;
    public ImageView c;
    public RadioButton d;
    public TextView e;
    public CheckBox f;
    public TextView g;
    public ImageView h;
    public ImageView i;
    public LinearLayout j;
    public Drawable k;
    public int l;
    public Context m;
    public boolean n;
    public Drawable o;
    public boolean p;
    public LayoutInflater q;
    public boolean r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        x0 a2 = x0.a(getContext(), attributeSet, j.MenuView, i2, 0);
        this.k = a2.b(j.MenuView_android_itemBackground);
        this.l = a2.e(j.MenuView_android_itemTextAppearance, -1);
        this.n = a2.a(j.MenuView_preserveIconSpacing, false);
        this.m = context;
        this.o = a2.b(j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, a.dropDownListViewStyle, 0);
        this.p = obtainStyledAttributes.hasValue(0);
        a2.f186b.recycle();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void a(i iVar, int i2) {
        CharSequence charSequence;
        String str;
        int i3;
        this.f468b = iVar;
        int i4 = 0;
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (c()) {
            charSequence = iVar.getTitleCondensed();
        } else {
            charSequence = iVar.e;
        }
        setTitle(charSequence);
        setCheckable(iVar.isCheckable());
        boolean f2 = iVar.f();
        iVar.b();
        if (!f2 || !this.f468b.f()) {
            i4 = 8;
        }
        if (i4 == 0) {
            TextView textView = this.g;
            i iVar2 = this.f468b;
            char b2 = iVar2.b();
            if (b2 == 0) {
                str = "";
            } else {
                Resources resources = iVar2.n.f88a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(iVar2.n.f88a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(h.abc_prepend_shortcut_label));
                }
                int i5 = iVar2.n.f() ? iVar2.k : iVar2.i;
                i.a(sb, i5, 65536, resources.getString(h.abc_menu_meta_shortcut_label));
                i.a(sb, i5, 4096, resources.getString(h.abc_menu_ctrl_shortcut_label));
                i.a(sb, i5, 2, resources.getString(h.abc_menu_alt_shortcut_label));
                i.a(sb, i5, 1, resources.getString(h.abc_menu_shift_shortcut_label));
                i.a(sb, i5, 4, resources.getString(h.abc_menu_sym_shortcut_label));
                i.a(sb, i5, 8, resources.getString(h.abc_menu_function_shortcut_label));
                if (b2 == 8) {
                    i3 = h.abc_menu_delete_shortcut_label;
                } else if (b2 == 10) {
                    i3 = h.abc_menu_enter_shortcut_label;
                } else if (b2 != ' ') {
                    sb.append(b2);
                    str = sb.toString();
                } else {
                    i3 = h.abc_menu_space_shortcut_label;
                }
                sb.append(resources.getString(i3));
                str = sb.toString();
            }
            textView.setText(str);
        }
        if (this.g.getVisibility() != i4) {
            this.g.setVisibility(i4);
        }
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.q);
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.i;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i.getLayoutParams();
            rect.top = this.i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    public final void b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(g.abc_list_menu_item_radio, this, false);
        this.d = radioButton;
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    public boolean c() {
        return false;
    }

    public i getItemData() {
        return this.f468b;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        k.a((View) this, this.k);
        TextView textView = (TextView) findViewById(f.title);
        this.e = textView;
        int i2 = this.l;
        if (i2 != -1) {
            textView.setTextAppearance(this.m, i2);
        }
        this.g = (TextView) findViewById(f.shortcut);
        ImageView imageView = (ImageView) findViewById(f.submenuarrow);
        this.h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.o);
        }
        this.i = (ImageView) findViewById(f.group_divider);
        this.j = (LinearLayout) findViewById(f.content);
    }

    public void onMeasure(int i2, int i3) {
        if (this.c != null && this.n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.c.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.d != null || this.f != null) {
            if (this.f468b.e()) {
                if (this.d == null) {
                    b();
                }
                compoundButton2 = this.d;
                compoundButton = this.f;
            } else {
                if (this.f == null) {
                    a();
                }
                compoundButton2 = this.f;
                compoundButton = this.d;
            }
            if (z) {
                compoundButton2.setChecked(this.f468b.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.d;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f468b.e()) {
            if (this.d == null) {
                b();
            }
            compoundButton = this.d;
        } else {
            if (this.f == null) {
                a();
            }
            compoundButton = this.f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.r = z;
        this.n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setVisibility((this.p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f468b.n.s || this.r;
        if (!z && !this.n) {
            return;
        }
        if (this.c != null || drawable != null || this.n) {
            if (this.c == null) {
                ImageView imageView = (ImageView) getInflater().inflate(g.abc_list_menu_item_icon, this, false);
                this.c = imageView;
                LinearLayout linearLayout = this.j;
                if (linearLayout != null) {
                    linearLayout.addView(imageView, 0);
                } else {
                    addView(imageView, 0);
                }
            }
            if (drawable != null || this.n) {
                ImageView imageView2 = this.c;
                if (!z) {
                    drawable = null;
                }
                imageView2.setImageDrawable(drawable);
                if (this.c.getVisibility() != 0) {
                    this.c.setVisibility(0);
                    return;
                }
                return;
            }
            this.c.setVisibility(8);
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i2;
        if (charSequence != null) {
            this.e.setText(charSequence);
            if (this.e.getVisibility() != 0) {
                textView = this.e;
                i2 = 0;
            } else {
                return;
            }
        } else {
            i2 = 8;
            if (this.e.getVisibility() != 8) {
                textView = this.e;
            } else {
                return;
            }
        }
        textView.setVisibility(i2);
    }

    public final void a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(g.abc_list_menu_item_checkbox, this, false);
        this.f = checkBox;
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }
}
